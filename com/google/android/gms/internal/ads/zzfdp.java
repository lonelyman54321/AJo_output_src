/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzfej;
import com.google.android.gms.internal.ads.zzfel;
import com.google.android.gms.internal.ads.zzfjm;
import com.google.android.gms.internal.ads.zzfjx;
import java.util.concurrent.Executor;

final class zzfdp
implements zzfjx {
    public final zzfej zza;
    public final zzfel zzb;
    public final zzl zzc;
    public final String zzd;
    public final Executor zze;
    public final zzw zzf;
    public final zzfjm zzg;

    public zzfdp(zzfej zzfej2, zzfel zzfel2, zzl zzl2, String string2, Executor executor, zzw zzw2, zzfjm zzfjm2) {
        this.zza = zzfej2;
        this.zzb = zzfel2;
        this.zzc = zzl2;
        this.zzd = string2;
        this.zze = executor;
        this.zzf = zzw2;
        this.zzg = zzfjm2;
    }

    public final zzfjm zza() {
        return this.zzg;
    }

    public final Executor zzb() {
        return this.zze;
    }
}

