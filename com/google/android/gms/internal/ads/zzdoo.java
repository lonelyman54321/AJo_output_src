/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzdow;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzdoo
implements zzgfa {
    public final /* synthetic */ zzdow zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ zzfgt zzc;
    public final /* synthetic */ zzfgw zzd;
    public final /* synthetic */ String zze;
    public final /* synthetic */ String zzf;

    public /* synthetic */ zzdoo(zzdow zzdow2, zzq zzq2, zzfgt zzfgt2, zzfgw zzfgw2, String string2, String string3) {
        this.zza = zzdow2;
        this.zzb = zzq2;
        this.zzc = zzfgt2;
        this.zzd = zzfgw2;
        this.zze = string2;
        this.zzf = string3;
    }

    public final ListenableFuture zza(Object object) {
        zzdow zzdow2 = this.zza;
        zzq zzq2 = this.zzb;
        zzfgt zzfgt2 = this.zzc;
        zzfgw zzfgw2 = this.zzd;
        String string2 = this.zze;
        String string3 = this.zzf;
        return zzdow2.zzb(zzq2, zzfgt2, zzfgw2, string2, string3, object);
    }
}

