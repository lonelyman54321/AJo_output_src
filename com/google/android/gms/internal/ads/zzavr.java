/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzavq;
import com.google.android.gms.internal.ads.zzavs;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

final class zzavr
implements Runnable {
    private zzavr() {
        throw null;
    }

    public /* synthetic */ zzavr(zzavq zzavq2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = "MD5";
        try {
            object = MessageDigest.getInstance((String)object);
            zzavs.zzd((MessageDigest)object);
            object = zzavs.zzb;
        }
        catch (Throwable throwable) {
            zzavs.zzb.countDown();
            throw throwable;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            object = zzavs.zzb;
        }
        ((CountDownLatch)object).countDown();
    }
}

