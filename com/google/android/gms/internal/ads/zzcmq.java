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
import com.google.android.gms.internal.ads.zzcmp;
import com.google.android.gms.internal.ads.zzcms;
import com.google.android.gms.internal.ads.zzfey;
import com.google.android.gms.internal.ads.zzfez;
import com.google.android.gms.internal.ads.zzhkx;

final class zzcmq
implements zzfey {
    private final zzcla zza;
    private Context zzb;
    private String zzc;
    private zzq zzd;

    public /* synthetic */ zzcmq(zzcla zzcla2, zzcmp zzcmp2) {
        this.zza = zzcla2;
    }

    public final /* synthetic */ zzfey zza(zzq zzq2) {
        zzq2.getClass();
        this.zzd = zzq2;
        return this;
    }

    public final /* synthetic */ zzfey zzb(String string2) {
        string2.getClass();
        this.zzc = string2;
        return this;
    }

    public final /* synthetic */ zzfey zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    public final zzfez zzd() {
        zzhkx.zzc(this.zzb, Context.class);
        zzhkx.zzc(this.zzc, String.class);
        zzhkx.zzc(this.zzd, zzq.class);
        zzcla zzcla2 = this.zza;
        Context context = this.zzb;
        String string2 = this.zzc;
        zzq zzq2 = this.zzd;
        zzcms zzcms2 = new zzcms(zzcla2, context, string2, zzq2, null);
        return zzcms2;
    }
}

