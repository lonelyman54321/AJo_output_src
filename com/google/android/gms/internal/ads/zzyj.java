/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzys;
import com.google.android.gms.internal.ads.zzyy;
import com.google.android.gms.internal.ads.zzyz;
import java.util.List;

public final class zzyj
implements zzyz {
    public final /* synthetic */ zzys zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzyj(zzys zzys2, String string2) {
        this.zza = zzys2;
        this.zzb = string2;
    }

    public final List zza(int n3, zzde zzde2, int[] nArray) {
        int n4;
        zzgaz zzgaz2 = new zzgaz();
        for (int i3 = 0; i3 < (n4 = zzde2.zzb); ++i3) {
            String string2 = this.zzb;
            zzys zzys2 = this.zza;
            int n7 = nArray[i3];
            zzyy zzyy2 = new zzyy(n3, zzde2, i3, zzys2, n7, string2);
            zzgaz2.zzf(zzyy2);
        }
        return zzgaz2.zzi();
    }
}

