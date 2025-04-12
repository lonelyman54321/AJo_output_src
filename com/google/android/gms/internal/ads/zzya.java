/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzzg;
import java.util.Arrays;

public class zzya
implements zzzg {
    protected final zzde zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzan[] zzd;
    private int zze;

    public zzya(zzde zzde2, int[] objectArray, int n3) {
        zzan[] zzanArray;
        int n4;
        n3 = objectArray.length;
        int n7 = 0;
        if (n3 > 0) {
            n4 = 1;
        } else {
            n4 = 0;
            zzanArray = null;
        }
        zzeq.zzf(n4 != 0);
        zzde2.getClass();
        this.zza = zzde2;
        this.zzb = n3;
        Object object = new zzan[n3];
        this.zzd = object;
        object = null;
        for (n3 = 0; n3 < (n4 = objectArray.length); ++n3) {
            zzan zzan2;
            zzanArray = this.zzd;
            int n8 = objectArray[n3];
            zzanArray[n3] = zzan2 = zzde2.zzb(n8);
        }
        objectArray = this.zzd;
        Arrays.sort(objectArray, object);
        int n10 = this.zzb;
        objectArray = new int[n10];
        this.zzc = objectArray;
        while (n7 < (n10 = this.zzb)) {
            objectArray = this.zzc;
            object = this.zzd[n7];
            objectArray[n7] = n3 = zzde2.zza((zzan)object);
            ++n7;
        }
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = this.getClass()) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zzya)object;
            object3 = this.zza;
            object2 = ((zzya)object).zza;
            boolean bl4 = ((zzde)object3).equals(object2);
            if (bl4 && (bl3 = Arrays.equals((int[])(object3 = (Object)this.zzc), (int[])(object = (Object)((zzya)object).zzc)))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zze;
        if (n3 == 0) {
            int n4;
            n3 = System.identityHashCode(this.zza) * 31;
            this.zze = n4 = Arrays.hashCode(this.zzc) + n3;
            return n4;
        }
        return n3;
    }

    public final int zza(int n3) {
        return this.zzc[n3];
    }

    public final int zzb(int n3) {
        int n4;
        for (int i3 = 0; i3 < (n4 = this.zzb); ++i3) {
            int[] nArray = this.zzc;
            n4 = nArray[i3];
            if (n4 != n3) continue;
            return i3;
        }
        return -1;
    }

    public final int zzc() {
        return this.zzc.length;
    }

    public final zzan zzd(int n3) {
        return this.zzd[n3];
    }

    public final zzde zze() {
        return this.zza;
    }
}

