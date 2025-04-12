/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzym;
import com.google.android.gms.internal.ads.zzys;
import com.google.android.gms.internal.ads.zzyz;
import java.util.List;

public final class zzyd
implements zzyz {
    public final /* synthetic */ zzys zza;

    public /* synthetic */ zzyd(zzys zzys2) {
        this.zza = zzys2;
    }

    public final List zza(int n3, zzde zzde2, int[] nArray) {
        int n4;
        zzgaz zzgaz2 = new zzgaz();
        for (int i3 = 0; i3 < (n4 = zzde2.zzb); ++i3) {
            zzys zzys2 = this.zza;
            int n7 = nArray[i3];
            zzym zzym2 = new zzym(n3, zzde2, i3, zzys2, n7);
            zzgaz2.zzf(zzym2);
        }
        return zzgaz2.zzi();
    }
}

