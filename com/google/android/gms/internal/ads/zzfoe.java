/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmg;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfoc;
import com.google.android.gms.internal.ads.zzfod;
import java.util.List;
import java.util.concurrent.Executor;

public final class zzfoe {
    private final Context zza;
    private final Executor zzb;
    private final zzr zzc;
    private final zzfmq zzd;

    public zzfoe(Context context, Executor executor, zzr zzr2, zzfmq zzfmq2) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzr2;
        this.zzd = zzfmq2;
    }

    public final /* synthetic */ void zza(String string2) {
        this.zzc.zza(string2);
    }

    public final /* synthetic */ void zzb(String object, zzfmn object2) {
        Object object3 = this.zza;
        Object object4 = zzfmu.zzF;
        object3 = zzfmb.zza((Context)object3, (zzfmu)object4);
        object3.zzj();
        object4 = this.zzc;
        boolean bl2 = ((zzr)object4).zza((String)object);
        object3.zzh(bl2);
        if (object2 == null) {
            object = this.zzd;
            object2 = object3.zzn();
            ((zzfmq)object).zzb((zzfmg)object2);
            return;
        }
        ((zzfmn)object2).zza((zzfmc)object3);
        ((zzfmn)object2).zzi();
    }

    public final void zzc(String string2, zzfmn object) {
        Object object2;
        boolean bl2 = zzfmq.zza();
        if (bl2 && (bl2 = ((Boolean)(object2 = (Boolean)zzbgd.zzd.zze())).booleanValue())) {
            object2 = this.zzb;
            zzfod zzfod2 = new zzfod(this, string2, (zzfmn)object);
            object2.execute(zzfod2);
            return;
        }
        object = this.zzb;
        object2 = new zzfoc(this, string2);
        object.execute((Runnable)object2);
    }

    public final void zzd(List object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            this.zzc(string2, null);
        }
    }
}

