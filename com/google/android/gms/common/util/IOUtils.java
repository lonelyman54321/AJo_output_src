/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ParcelFileDescriptor
 */
package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class IOUtils {
    private IOUtils() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void closeQuietly(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) return;
        try {
            parcelFileDescriptor.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void closeQuietly(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static long copyStream(InputStream inputStream, OutputStream outputStream) {
        return IOUtils.copyStream(inputStream, outputStream, false, 1024);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long copyStream(InputStream inputStream, OutputStream outputStream, boolean bl2, int n3) {
        Throwable throwable2222;
        block4: {
            byte[] byArray = new byte[n3];
            long l2 = 0L;
            try {
                int n7;
                int n4;
                while ((n4 = inputStream.read(byArray, 0, n3)) != (n7 = -1)) {
                    long l3 = n4;
                    l2 += l3;
                    outputStream.write(byArray, 0, n4);
                }
            }
            catch (Throwable throwable2222) {
                break block4;
            }
            if (!bl2) return l2;
            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly(outputStream);
            return l2;
        }
        if (!bl2) {
            throw throwable2222;
        }
        IOUtils.closeQuietly(inputStream);
        IOUtils.closeQuietly(outputStream);
        throw throwable2222;
    }

    public static boolean isGzipByteBuffer(byte[] byArray) {
        int n3 = byArray.length;
        int n4 = 1;
        if (n3 > n4) {
            n3 = byArray[0] & 0xFF;
            int n7 = (byArray[n4] & 0xFF) << 8 | n3;
            if (n7 == (n3 = 35615)) {
                return n4 != 0;
            }
        }
        return false;
    }

    public static byte[] readInputStreamFully(InputStream inputStream) {
        return IOUtils.readInputStreamFully(inputStream, true);
    }

    public static byte[] readInputStreamFully(InputStream inputStream, boolean bl2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        IOUtils.copyStream(inputStream, byteArrayOutputStream, bl2, 1024);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(byteArrayOutputStream);
        int n3 = 4096;
        byte[] byArray = new byte[n3];
        int n4;
        int n7;
        while ((n7 = inputStream.read(byArray)) != (n4 = -1)) {
            n4 = 0;
            ((OutputStream)byteArrayOutputStream).write(byArray, 0, n7);
        }
        return byteArrayOutputStream.toByteArray();
    }
}

