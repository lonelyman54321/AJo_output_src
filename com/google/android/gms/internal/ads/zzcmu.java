/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcla;
import com.google.android.gms.internal.ads.zzcmt;
import com.google.android.gms.internal.ads.zzcmw;
import com.google.android.gms.internal.ads.zzfgm;
import com.google.android.gms.internal.ads.zzfgn;
import com.google.android.gms.internal.ads.zzhkx;

final class zzcmu
implements zzfgm {
    private final zzcla zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcmu(zzcla zzcla2, zzcmt zzcmt2) {
        this.zza = zzcla2;
    }

    public final /* synthetic */ zzfgm zza(String string2) {
        this.zzc = string2;
        return this;
    }

    public final /* synthetic */ zzfgm zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    public final zzfgn zzc() {
        zzhkx.zzc(this.zzb, Context.class);
        zzcla zzcla2 = this.zza;
        Context context = this.zzb;
        String string2 = this.zzc;
        zzcmw zzcmw2 = new zzcmw(zzcla2, context, string2, null);
        return zzcmw2;
    }
}

