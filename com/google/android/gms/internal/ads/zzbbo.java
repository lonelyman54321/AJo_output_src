/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class zzbbo {
    private static MessageDigest zzb;
    protected final Object zza;

    public zzbbo() {
        Object object;
        this.zza = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final MessageDigest zza() {
        Object object = this.zza;
        synchronized (object) {
            MessageDigest messageDigest;
            try {
                messageDigest = zzb;
                if (messageDigest != null) {
                    return messageDigest;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
            int n3 = 0;
            messageDigest = null;
            int n4;
            while (n3 < (n4 = 2)) {
                Object object2 = "MD5";
                try {
                    zzb = object2 = MessageDigest.getInstance((String)object2);
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
                ++n3;
            }
            return zzb;
        }
    }

    public abstract byte[] zzb(String var1);
}

