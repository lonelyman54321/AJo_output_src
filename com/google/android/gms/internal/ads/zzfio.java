/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ParcelFileDescriptor
 *  android.os.ParcelFileDescriptor$AutoCloseOutputStream
 */
package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class zzfio
implements Runnable {
    public final /* synthetic */ InputStream zza;
    public final /* synthetic */ ParcelFileDescriptor zzb;

    public /* synthetic */ zzfio(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = inputStream;
        this.zzb = parcelFileDescriptor;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable422222;
        InputStream inputStream = this.zza;
        ParcelFileDescriptor parcelFileDescriptor = this.zzb;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
        IOUtils.copyStream(inputStream, (OutputStream)autoCloseOutputStream);
        autoCloseOutputStream.close();
        if (inputStream == null) return;
        inputStream.close();
        return;
        {
            catch (IOException iOException) {
                return;
            }
        }
        catch (Throwable throwable2) {
            try {
                autoCloseOutputStream.close();
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
        if (inputStream == null) throw throwable422222;
        try {
            inputStream.close();
            throw throwable422222;
        }
        catch (Throwable throwable5) {
            throwable422222.addSuppressed(throwable5);
            throw throwable422222;
        }
    }
}

