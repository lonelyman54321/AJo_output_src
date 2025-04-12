/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbys;
import com.google.android.gms.internal.ads.zzdht;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzeji;
import com.google.android.gms.internal.ads.zzemm;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhc;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfim;
import java.util.concurrent.Executor;

public final class zzemo
implements zzehr {
    private final Context zza;
    private final Executor zzb;
    private final zzdrm zzc;

    public zzemo(Context context, Executor executor, zzdrm zzdrm2) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdrm2;
    }

    public static /* bridge */ /* synthetic */ Executor zzc(zzemo zzemo2) {
        return zzemo2.zzb;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzemo zzemo2, zzfhf zzfhf2, zzfgt zzfgt2, zzeho zzeho2) {
        zzemo.zze(zzfhf2, zzfgt2, zzeho2);
    }

    private static final void zze(zzfhf object, zzfgt object2, zzeho zzeho2) {
        Object object3;
        try {
            object3 = zzeho2.zzb;
        }
        catch (Exception exception) {
            object2 = String.valueOf(zzeho2.zza);
            zzm.zzk("Fail to load ad from adapter ".concat((String)object2), exception);
            return;
        }
        object3 = (zzfim)object3;
        object = ((zzfhf)object).zza;
        object = ((zzfhc)object).zza;
        object = ((zzfho)object).zzd;
        object2 = ((zzfgt)object2).zzw;
        object2 = object2.toString();
        ((zzfim)object3).zzk((zzl)object, (String)object2);
    }

    public final void zzb(zzfhf object, zzfgt zzfgt2, zzeho object2) {
        Object object3 = (zzfim)((zzeho)object2).zzb;
        boolean bl2 = ((zzfim)object3).zzC();
        if (!bl2) {
            object3 = new zzemm(this, (zzfhf)object, zzfgt2, (zzeho)object2);
            ((zzeji)((zzeho)object2).zzc).zzd((zzdht)object3);
            object3 = ((zzeho)object2).zzb;
            Context context = this.zza;
            Object object4 = object3;
            object4 = (zzfim)object3;
            object = ((zzfhf)object).zza.zza;
            Object object5 = object2 = ((zzeho)object2).zzc;
            object5 = (zzbys)object2;
            String string2 = zzfgt2.zzw.toString();
            zzl zzl2 = ((zzfho)object).zzd;
            ((zzfim)object4).zzh(context, zzl2, null, (zzbys)object5, string2);
            return;
        }
        zzemo.zze((zzfhf)object, zzfgt2, (zzeho)object2);
    }
}

