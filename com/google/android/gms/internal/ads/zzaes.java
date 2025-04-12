/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaeu;

public class zzaes
implements zzaet {
    private final long zza;
    private final zzaer zzb;

    public zzaes(long l2, long l3) {
        zzaer zzaer2;
        zzaeu zzaeu2;
        this.zza = l2;
        l2 = 0L;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        zzaeu zzaeu3 = l4 == false ? zzaeu.zza : (zzaeu2 = new zzaeu(l2, l3));
        this.zzb = zzaer2 = new zzaer(zzaeu3, zzaeu3);
    }

    public final long zza() {
        return this.zza;
    }

    public final zzaer zzg(long l2) {
        return this.zzb;
    }

    public final boolean zzh() {
        return false;
    }
}

