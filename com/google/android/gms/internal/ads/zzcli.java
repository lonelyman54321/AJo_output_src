/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcla;
import com.google.android.gms.internal.ads.zzclh;
import com.google.android.gms.internal.ads.zzclk;
import com.google.android.gms.internal.ads.zzfbt;
import com.google.android.gms.internal.ads.zzfbu;
import com.google.android.gms.internal.ads.zzhkx;

final class zzcli
implements zzfbt {
    private final zzcla zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcli(zzcla zzcla2, zzclh zzclh2) {
        this.zza = zzcla2;
    }

    public final /* synthetic */ zzfbt zza(String string2) {
        string2.getClass();
        this.zzc = string2;
        return this;
    }

    public final /* synthetic */ zzfbt zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    public final zzfbu zzc() {
        zzhkx.zzc(this.zzb, Context.class);
        zzhkx.zzc(this.zzc, String.class);
        zzcla zzcla2 = this.zza;
        Context context = this.zzb;
        String string2 = this.zzc;
        zzclk zzclk2 = new zzclk(zzcla2, context, string2, null);
        return zzclk2;
    }
}

