/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzfu;

final class zzapy {
    public final int zza;
    public final long zzb;

    private zzapy(int n3, long l2) {
        this.zza = n3;
        this.zzb = l2;
    }

    public static zzapy zza(zzadv zzadv2, zzfu object) {
        byte[] byArray = ((zzfu)object).zzM();
        ((zzadi)zzadv2).zzm(byArray, 0, 8, false);
        ((zzfu)object).zzK(0);
        int n3 = ((zzfu)object).zzg();
        long l2 = ((zzfu)object).zzs();
        object = new zzapy(n3, l2);
        return object;
    }
}

