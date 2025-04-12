/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcge;
import com.google.android.gms.internal.ads.zzgw;
import com.google.android.gms.internal.ads.zzha;
import com.google.android.gms.internal.ads.zzhb;

public final class zzcgl
implements zzha {
    public final /* synthetic */ zzha zza;
    public final /* synthetic */ byte[] zzb;

    public /* synthetic */ zzcgl(zzha zzha2, byte[] byArray) {
        this.zza = zzha2;
        this.zzb = byArray;
    }

    public final zzhb zza() {
        zzhb zzhb2 = this.zza.zza();
        byte[] byArray = this.zzb;
        zzgw zzgw2 = new zzgw(byArray);
        int n3 = byArray.length;
        zzcge zzcge2 = new zzcge(zzgw2, n3, zzhb2);
        return zzcge2;
    }
}

