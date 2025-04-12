/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbpw;
import com.google.android.gms.internal.ads.zzbql;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzccp;

final class zzbqj
implements zzccp {
    final /* synthetic */ zzccn zza;
    final /* synthetic */ zzbpn zzb;

    public zzbqj(zzbql zzbql2, zzccn zzccn2, zzbpn zzbpn2) {
        this.zza = zzccn2;
        this.zzb = zzbpn2;
    }

    public final void zza() {
        zze.zza("callJs > getEngine: Promise rejected");
        zzbpw zzbpw2 = new zzbpw("Unable to obtain a JavascriptEngine.");
        this.zza.zzd(zzbpw2);
        this.zzb.zzb();
    }
}

