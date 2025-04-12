/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgd;

public final class zzaem
implements zzaet {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzaem(long[] lArray, long[] lArray2, long l2) {
        long l3;
        long l4;
        long l7;
        long[] lArray3;
        int n3 = lArray.length;
        int n4 = lArray2.length;
        int n7 = 1;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            lArray3 = null;
        }
        zzeq.zzd(n3 != 0);
        if (n4 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            lArray3 = null;
        }
        this.zzd = n3;
        if (n3 != 0 && (n3 = (l7 = (l4 = lArray2[0]) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) > 0) {
            n3 = n4 + 1;
            long[] lArray4 = new long[n3];
            this.zza = lArray4;
            lArray3 = new long[n3];
            this.zzb = lArray3;
            System.arraycopy(lArray, 0, lArray4, n7, n4);
            System.arraycopy(lArray2, 0, lArray3, n7, n4);
        } else {
            this.zza = lArray;
            this.zzb = lArray2;
        }
        this.zzc = l2;
    }

    public final long zza() {
        return this.zzc;
    }

    public final zzaer zzg(long l2) {
        Object object;
        int n3;
        int n4 = this.zzd;
        if (n4 == 0) {
            zzaeu zzaeu2 = zzaeu.zza;
            zzaer zzaer2 = new zzaer(zzaeu2, zzaeu2);
            return zzaer2;
        }
        long[] lArray = this.zzb;
        int n7 = 1;
        n4 = zzgd.zzc(lArray, l2, n7 != 0, n7 != 0);
        long[] lArray2 = this.zzb;
        long l3 = lArray2[n4];
        lArray2 = this.zza;
        long l4 = lArray2[n4];
        zzaeu zzaeu3 = new zzaeu(l3, l4);
        l3 = zzaeu3.zzb;
        long l7 = l3 - l2;
        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 != false && n4 != (n3 = ((Object)(object = (Object)this.zzb)).length + -1)) {
            Object object3 = object[n4 += n7];
            l3 = this.zza[n4];
            zzaeu zzaeu4 = new zzaeu((long)object3, l3);
            object = new zzaer(zzaeu3, zzaeu4);
            return object;
        }
        object = new zzaer(zzaeu3, zzaeu3);
        return object;
    }

    public final boolean zzh() {
        return this.zzd;
    }
}

