/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbqq;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcqs;
import com.google.android.gms.internal.ads.zzcra;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzcqv {
    private final String zza;
    private final zzbqq zzb;
    private final Executor zzc;
    private zzcra zzd;
    private final zzblp zze;
    private final zzblp zzf;

    public zzcqv(String string2, zzbqq zzbqq2, Executor executor) {
        zzblp zzblp2 = new zzcqs(this);
        this.zze = zzblp2;
        super(this);
        this.zzf = zzblp2;
        this.zza = string2;
        this.zzb = zzbqq2;
        this.zzc = executor;
    }

    public static /* bridge */ /* synthetic */ zzcra zza(zzcqv zzcqv2) {
        return zzcqv2.zzd;
    }

    public static /* bridge */ /* synthetic */ Executor zzb(zzcqv zzcqv2) {
        return zzcqv2.zzc;
    }

    public static /* bridge */ /* synthetic */ boolean zzg(zzcqv object, Map object2) {
        boolean bl2;
        String string2;
        boolean bl3;
        return object2 != null && !(bl3 = TextUtils.isEmpty((CharSequence)(object2 = (String)object2.get(string2 = "hashCode")))) && (bl2 = ((String)object2).equals(object = ((zzcqv)object).zza));
    }

    public final void zzc(zzcra zzcra2) {
        zzbqq zzbqq2 = this.zzb;
        zzblp zzblp2 = this.zze;
        zzbqq2.zzb("/updateActiveView", zzblp2);
        zzbqq2 = this.zzb;
        zzblp2 = this.zzf;
        zzbqq2.zzb("/untrackActiveViewUnit", zzblp2);
        this.zzd = zzcra2;
    }

    public final void zzd(zzchd zzchd2) {
        zzblp zzblp2 = this.zze;
        zzchd2.zzag("/updateActiveView", zzblp2);
        zzblp2 = this.zzf;
        zzchd2.zzag("/untrackActiveViewUnit", zzblp2);
    }

    public final void zze() {
        zzbqq zzbqq2 = this.zzb;
        zzblp zzblp2 = this.zze;
        zzbqq2.zzc("/updateActiveView", zzblp2);
        zzbqq2 = this.zzb;
        zzblp2 = this.zzf;
        zzbqq2.zzc("/untrackActiveViewUnit", zzblp2);
    }

    public final void zzf(zzchd zzchd2) {
        zzblp zzblp2 = this.zze;
        zzchd2.zzaz("/updateActiveView", zzblp2);
        zzblp2 = this.zzf;
        zzchd2.zzaz("/untrackActiveViewUnit", zzblp2);
    }
}

