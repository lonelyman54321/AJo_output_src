/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64OutputStream
 */
package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class zzbbq {
    ByteArrayOutputStream zza;
    Base64OutputStream zzb;

    public zzbbq() {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = this.zza = (byteArrayOutputStream = new ByteArrayOutputStream(4096));
        super((OutputStream)byteArrayOutputStream2, 10);
        this.zzb = byteArrayOutputStream;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        Throwable throwable2;
        block6: {
            Base64OutputStream base64OutputStream;
            String string2 = "HashManager: Unable to convert to Base64.";
            try {
                base64OutputStream = this.zzb;
                base64OutputStream.close();
            }
            catch (IOException iOException) {
                zzm.zzh(string2, iOException);
            }
            base64OutputStream = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = this.zza;
                    byteArrayOutputStream.close();
                    byteArrayOutputStream = this.zza;
                    string2 = byteArrayOutputStream.toString();
                }
                catch (IOException iOException) {
                    zzm.zzh(string2, iOException);
                    string2 = "";
                }
            }
            catch (Throwable throwable2) {
                break block6;
            }
            this.zza = null;
            this.zzb = null;
            return string2;
        }
        this.zza = null;
        this.zzb = null;
        throw throwable2;
    }
}

