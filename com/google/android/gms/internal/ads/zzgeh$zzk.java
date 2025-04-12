/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeh;
import com.google.android.gms.internal.ads.zzgeh$zza;

final class zzgeh$zzk {
    static final zzgeh$zzk zza;
    volatile zzgeh$zzk next;
    volatile Thread thread;

    static {
        zzgeh$zzk zzgeh$zzk;
        zza = zzgeh$zzk = new zzgeh$zzk(false);
    }

    public zzgeh$zzk() {
        zzgeh$zza zzgeh$zza = zzgeh.zzg();
        Thread thread2 = Thread.currentThread();
        zzgeh$zza.zzd(this, thread2);
    }

    public zzgeh$zzk(boolean bl2) {
    }
}

