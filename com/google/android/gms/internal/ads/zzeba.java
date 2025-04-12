/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcau;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzfhf;

final class zzeba
implements zzdcg {
    private final Context zza;
    private final zzcau zzb;

    public zzeba(Context context, zzcau zzcau2) {
        this.zza = context;
        this.zzb = zzcau2;
    }

    public final void zzdn(zzbxu zzbxu2) {
    }

    public final void zzdo(zzfhf object) {
        Object object2 = ((zzfhf)object).zzb.zzb.zzd;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl2) {
            object2 = this.zzb;
            Context context = this.zza;
            zzl zzl2 = ((zzfhf)object).zza.zza.zzd;
            ((zzcau)object2).zzm(context, zzl2);
            object2 = this.zzb;
            context = this.zza;
            object = ((zzfhf)object).zzb.zzb.zzd;
            ((zzcau)object2).zzi(context, (String)object);
        }
    }
}

