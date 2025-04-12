/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzcla;
import com.google.android.gms.internal.ads.zzclr;
import com.google.android.gms.internal.ads.zzclu;
import com.google.android.gms.internal.ads.zzfdh;
import com.google.android.gms.internal.ads.zzfdi;
import com.google.android.gms.internal.ads.zzhkx;

final class zzcls
implements zzfdh {
    private final zzcla zza;
    private Context zzb;
    private String zzc;
    private zzq zzd;

    public /* synthetic */ zzcls(zzcla zzcla2, zzclr zzclr2) {
        this.zza = zzcla2;
    }

    public final /* synthetic */ zzfdh zza(zzq zzq2) {
        zzq2.getClass();
        this.zzd = zzq2;
        return this;
    }

    public final /* synthetic */ zzfdh zzb(String string2) {
        string2.getClass();
        this.zzc = string2;
        return this;
    }

    public final /* synthetic */ zzfdh zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    public final zzfdi zzd() {
        zzhkx.zzc(this.zzb, Context.class);
        zzhkx.zzc(this.zzc, String.class);
        zzhkx.zzc(this.zzd, zzq.class);
        zzcla zzcla2 = this.zza;
        Context context = this.zzb;
        String string2 = this.zzc;
        zzq zzq2 = this.zzd;
        zzclu zzclu2 = new zzclu(zzcla2, context, string2, zzq2, null);
        return zzclu2;
    }
}

