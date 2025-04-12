/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzaku;
import com.google.android.gms.internal.ads.zzakw;
import com.google.android.gms.internal.ads.zzali;
import java.math.BigInteger;

final class zzakv
implements zzaet {
    final /* synthetic */ zzakw zza;

    public /* synthetic */ zzakv(zzakw zzakw2, zzaku zzaku2) {
        this.zza = zzakw2;
    }

    public final long zza() {
        zzakw zzakw2 = this.zza;
        zzali zzali2 = zzakw.zzf(zzakw2);
        long l2 = zzakw.zzc(zzakw2);
        return zzali2.zzf(l2);
    }

    public final zzaer zzg(long l2) {
        Object object = this.zza;
        long l3 = zzakw.zzf((zzakw)object).zzg(l2);
        long l4 = zzakw.zzb((zzakw)object);
        object = BigInteger.valueOf(l3);
        Object object2 = this.zza;
        long l7 = zzakw.zza((zzakw)object2);
        l3 = zzakw.zzb((zzakw)object2);
        object2 = BigInteger.valueOf(l7 - l3);
        object = ((BigInteger)object).multiply((BigInteger)object2);
        object2 = BigInteger.valueOf(zzakw.zzc(this.zza));
        long l8 = ((BigInteger)object).divide((BigInteger)object2).longValue() + l4;
        Object object3 = this.zza;
        l4 = zzakw.zzb((zzakw)object3);
        l7 = zzakw.zza((zzakw)object3) + (long)-1;
        l8 = Math.min(l8 + -30000L, l7);
        l8 = Math.max(l4, l8);
        zzaeu zzaeu2 = new zzaeu(l2, l8);
        object3 = new zzaer(zzaeu2, zzaeu2);
        return object3;
    }

    public final boolean zzh() {
        return true;
    }
}

