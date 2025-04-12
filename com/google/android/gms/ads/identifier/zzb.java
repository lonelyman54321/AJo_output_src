/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.identifier;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class zzb
extends Thread {
    final CountDownLatch zza;
    boolean zzb;
    private final WeakReference zzc;
    private final long zzd;

    public zzb(AdvertisingIdClient object, long l2) {
        WeakReference<AdvertisingIdClient> weakReference;
        this.zzc = weakReference = new WeakReference<AdvertisingIdClient>((AdvertisingIdClient)object);
        this.zzd = l2;
        this.zza = object = new CountDownLatch(1);
        this.zzb = false;
        this.start();
    }

    private final void zza() {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient)this.zzc.get();
        if (advertisingIdClient != null) {
            boolean bl2;
            advertisingIdClient.zza();
            this.zzb = bl2 = true;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            countDownLatch = this.zza;
        }
        catch (InterruptedException interruptedException) {
            this.zza();
            return;
        }
        long l2 = this.zzd;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        boolean bl2 = countDownLatch.await(l2, timeUnit);
        if (bl2) return;
        this.zza();
    }
}

