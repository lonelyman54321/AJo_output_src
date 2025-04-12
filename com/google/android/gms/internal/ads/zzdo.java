/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzdn;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzn;
import java.util.Arrays;

public final class zzdo {
    public static final zzn zza;
    private static final String zzc;
    private static final String zzd;
    private static final String zze;
    private static final String zzf;
    public final int zzb;
    private final zzde zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final boolean[] zzj;

    static {
        int n3 = 36;
        zzc = Integer.toString(0, n3);
        zzd = Integer.toString(1, n3);
        zze = Integer.toString(3, n3);
        zzf = Integer.toString(4, n3);
        zzdn zzdn2 = new zzdn();
        zza = zzdn2;
    }

    public zzdo(zzde object, boolean bl2, int[] nArray, boolean[] blArray) {
        int n3;
        this.zzb = n3 = ((zzde)object).zzb;
        int n4 = nArray.length;
        int n7 = 1;
        n4 = n3 == n4 && n3 == (n4 = blArray.length) ? 1 : 0;
        zzeq.zzd(n4 != 0);
        this.zzg = object;
        if (!bl2 || n3 <= n7) {
            n7 = 0;
        }
        this.zzh = n7;
        object = (int[])nArray.clone();
        this.zzi = (int[])object;
        object = (boolean[])blArray.clone();
        this.zzj = (boolean[])object;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzdo.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zzdo)object;
            boolean bl4 = this.zzh;
            boolean bl5 = ((zzdo)object).zzh;
            if (bl4 == bl5 && (bl4 = ((zzde)(object2 = this.zzg)).equals(object3 = ((zzdo)object).zzg)) && (bl4 = Arrays.equals((int[])(object2 = (Object)this.zzi), (int[])(object3 = (Object)((zzdo)object).zzi))) && (bl3 = Arrays.equals((boolean[])(object2 = (Object)this.zzj), (boolean[])(object = (Object)((zzdo)object).zzj)))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zzg.hashCode() * 31;
        int[] nArray = this.zzi;
        int n4 = this.zzh;
        n3 = (n3 + n4) * 31;
        int n7 = Arrays.hashCode(nArray) + n3;
        boolean[] blArray = this.zzj;
        return Arrays.hashCode(blArray) + (n7 *= 31);
    }

    public final int zza() {
        return this.zzg.zzd;
    }

    public final zzan zzb(int n3) {
        return this.zzg.zzb(n3);
    }

    public final boolean zzc() {
        boolean[] blArray = this.zzj;
        int n3 = blArray.length;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl3 = blArray[i3];
            boolean bl4 = true;
            if (bl3 != bl4) continue;
            bl2 = true;
            break;
        }
        return bl2;
    }

    public final boolean zzd(int n3) {
        return this.zzj[n3];
    }
}

