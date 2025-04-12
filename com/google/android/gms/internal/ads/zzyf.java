/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzyc;
import com.google.android.gms.internal.ads.zzyl;
import com.google.android.gms.internal.ads.zzys;
import com.google.android.gms.internal.ads.zzyz;
import com.google.android.gms.internal.ads.zzze;
import java.util.List;

public final class zzyf
implements zzyz {
    public final /* synthetic */ zzze zza;
    public final /* synthetic */ zzys zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ int[] zzd;

    public /* synthetic */ zzyf(zzze zzze2, zzys zzys2, boolean bl2, int[] nArray) {
        this.zza = zzze2;
        this.zzb = zzys2;
        this.zzc = bl2;
        this.zzd = nArray;
    }

    public final List zza(int n3, zzde zzde2, int[] nArray) {
        zzyf zzyf2 = this;
        Object object = this.zza;
        zzyc zzyc2 = new zzyc((zzze)object);
        int n4 = this.zzd[n3];
        zzgaz zzgaz2 = new zzgaz();
        int n7 = 0;
        object = null;
        zzde zzde3 = zzde2;
        for (int i3 = 0; i3 < (n7 = zzde3.zzb); ++i3) {
            zzyl zzyl2;
            boolean bl2 = zzyf2.zzc;
            zzys zzys2 = zzyf2.zzb;
            int n8 = nArray[i3];
            object = zzyl2;
            zzyl2 = new zzyl(n3, zzde2, i3, zzys2, n8, bl2, zzyc2, n4);
            zzgaz2.zzf(zzyl2);
        }
        return zzgaz2.zzi();
    }
}

