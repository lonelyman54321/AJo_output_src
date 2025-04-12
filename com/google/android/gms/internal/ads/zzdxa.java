/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbnr;
import com.google.android.gms.internal.ads.zzdxf;
import com.google.android.gms.internal.ads.zzfim;
import java.util.List;

public final class zzdxa
implements Runnable {
    public final /* synthetic */ zzdxf zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzbnr zzc;
    public final /* synthetic */ zzfim zzd;
    public final /* synthetic */ List zze;

    public /* synthetic */ zzdxa(zzdxf zzdxf2, String string2, zzbnr zzbnr2, zzfim zzfim2, List list) {
        this.zza = zzdxf2;
        this.zzb = string2;
        this.zzc = zzbnr2;
        this.zzd = zzfim2;
        this.zze = list;
    }

    public final void run() {
        zzdxf zzdxf2 = this.zza;
        String string2 = this.zzb;
        zzbnr zzbnr2 = this.zzc;
        zzfim zzfim2 = this.zzd;
        List list = this.zze;
        zzdxf2.zzn(string2, zzbnr2, zzfim2, list);
    }
}

