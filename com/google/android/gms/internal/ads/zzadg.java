/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzgd;
import java.util.Arrays;

public final class zzadg
implements zzaet {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzadg(int[] nArray, long[] lArray, long[] lArray2, long[] lArray3) {
        int n3;
        this.zzb = nArray;
        this.zzc = lArray;
        this.zzd = lArray2;
        this.zze = lArray3;
        this.zza = n3 = nArray.length;
        if (n3 > 0) {
            long l2 = lArray2[n3 += -1];
            long l3 = lArray3[n3];
            this.zzf = l2 += l3;
            return;
        }
        this.zzf = 0L;
    }

    public final String toString() {
        Object object = this.zzd;
        Object object2 = this.zze;
        Object object3 = this.zzc;
        String string2 = Arrays.toString(this.zzb);
        object3 = Arrays.toString(object3);
        object2 = Arrays.toString(object2);
        object = Arrays.toString(object);
        StringBuilder stringBuilder = new StringBuilder("ChunkIndex(length=");
        int n3 = this.zza;
        h30_0.b(stringBuilder, n3, ", sizes=", string2, ", offsets=");
        X50.a(stringBuilder, (String)object3, ", timeUs=", (String)object2, ", durationsUs=");
        return h30_0.a(stringBuilder, (String)object, ")");
    }

    public final long zza() {
        return this.zzf;
    }

    public final zzaer zzg(long l2) {
        int n3;
        Object object = this.zze;
        int n4 = 1;
        int n7 = zzgd.zzc(object, l2, n4 != 0, n4 != 0);
        long l3 = object[n7];
        object = this.zzc;
        long l4 = object[n7];
        zzaeu zzaeu2 = new zzaeu(l3, l4);
        l3 = zzaeu2.zzb;
        long l7 = l3 - l2;
        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 < 0 && n7 != (n3 = this.zza + -1)) {
            Object object3 = this.zze;
            long[] lArray = this.zzc;
            object = new zzaeu;
            l3 = object3[n7 += n4];
            l2 = lArray[n7];
            object(l3, l2);
            object3 = new zzaer;
            object3(zzaeu2, (zzaeu)object);
            return object3;
        }
        zzaer zzaer2 = new zzaer(zzaeu2, zzaeu2);
        return zzaer2;
    }

    public final boolean zzh() {
        return true;
    }
}

