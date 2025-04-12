/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzgfp;
import java.util.Map;

final class zzblx
implements zzgfp {
    final /* synthetic */ Map zza;
    final /* synthetic */ zza zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbmb zzd;

    public zzblx(zzbmb zzbmb2, Map map2, zza zza2, String string2) {
        this.zza = map2;
        this.zzb = zza2;
        this.zzc = string2;
        this.zzd = zzbmb2;
    }

    public final void zza(Throwable throwable) {
        zzu.zzo().zzw(throwable, "OpenGmsgHandler.attributionReportingManager");
    }
}

