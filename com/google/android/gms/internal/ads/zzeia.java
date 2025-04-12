/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzcrt;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfim;
import java.util.concurrent.Executor;

public final class zzeia
implements zzehr {
    private final Context zza;
    private final zzcrt zzb;
    private final Executor zzc;

    public zzeia(Context context, zzcrt zzcrt2, Executor executor) {
        this.zza = context;
        this.zzb = zzcrt2;
        this.zzc = executor;
    }

    public final void zzb(zzfhf object, zzfgt object2, zzeho object3) {
        zzfim zzfim2 = (zzfim)((zzeho)object3).zzb;
        object = ((zzfhf)object).zza.zza;
        object2 = ((zzfgt)object2).zzw.toString();
        Context context = this.zza;
        object = ((zzfho)object).zzd;
        object3 = (zzbrl)((Object)((zzeho)object3).zzc);
        zzfim2.zzl(context, (zzl)object, (String)object2, (zzbrl)object3);
    }
}

