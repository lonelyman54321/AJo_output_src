/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.NativeSessionFile;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

class BytesBackedNativeSessionFile
implements NativeSessionFile {
    private final byte[] bytes;
    private final String dataTransportFilename;
    private final String reportsEndpointFilename;

    public BytesBackedNativeSessionFile(String string2, String string3, byte[] byArray) {
        this.dataTransportFilename = string2;
        this.reportsEndpointFilename = string3;
        this.bytes = byArray;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private byte[] asGzippedBytes() {
        Throwable throwable422222;
        boolean bl2 = this.isEmpty();
        if (bl2) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        {
            catch (IOException iOException) {
                return null;
            }
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        byte[] byArray = this.bytes;
        ((OutputStream)gZIPOutputStream).write(byArray);
        gZIPOutputStream.finish();
        byArray = byteArrayOutputStream.toByteArray();
        ((OutputStream)gZIPOutputStream).close();
        byteArrayOutputStream.close();
        return byArray;
        catch (Throwable throwable2) {
            try {
                ((OutputStream)gZIPOutputStream).close();
                throw throwable2;
            }
            catch (Throwable throwable3) {
                try {
                    throwable2.addSuppressed(throwable3);
                    throw throwable2;
                }
                catch (Throwable throwable422222) {}
            }
        }
        try {
            byteArrayOutputStream.close();
            throw throwable422222;
        }
        catch (Throwable throwable5) {
            throwable422222.addSuppressed(throwable5);
            throw throwable422222;
        }
    }

    private boolean isEmpty() {
        boolean bl2;
        byte[] byArray = this.bytes;
        if (byArray != null && (bl2 = byArray.length)) {
            bl2 = false;
            byArray = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public CrashlyticsReport$FilesPayload$File asFilePayload() {
        Object object = this.asGzippedBytes();
        if (object == null) {
            object = null;
        } else {
            object = CrashlyticsReport$FilesPayload$File.builder().setContents((byte[])object);
            String string2 = this.dataTransportFilename;
            object = object.setFilename(string2).build();
        }
        return object;
    }

    public String getReportsEndpointFilename() {
        return this.reportsEndpointFilename;
    }

    public InputStream getStream() {
        ByteArrayInputStream byteArrayInputStream;
        boolean bl2 = this.isEmpty();
        if (bl2) {
            bl2 = false;
            byteArrayInputStream = null;
        } else {
            byte[] byArray = this.bytes;
            byteArrayInputStream = new ByteArrayInputStream(byArray);
        }
        return byteArrayInputStream;
    }
}

