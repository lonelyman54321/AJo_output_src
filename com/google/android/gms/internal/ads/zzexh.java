/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcau;
import com.google.android.gms.internal.ads.zzexg;
import com.google.android.gms.internal.ads.zzexi;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzexh
implements zzexw {
    private final zzcau zza;
    private final zzgge zzb;
    private final Context zzc;

    public zzexh(zzcau zzcau2, zzgge zzgge2, Context context) {
        this.zza = zzcau2;
        this.zzb = zzgge2;
        this.zzc = context;
    }

    public final int zza() {
        return 34;
    }

    public final ListenableFuture zzb() {
        zzexg zzexg2 = new zzexg(this);
        return this.zzb.zzb(zzexg2);
    }

    public final /* synthetic */ zzexi zzc() {
        Object object = this.zza;
        Object object2 = this.zzc;
        boolean bl2 = ((zzcau)object).zzp((Context)object2);
        if (!bl2) {
            object2 = object;
            object = new zzexi(null, null, null, null, null);
            return object;
        }
        object = this.zza;
        object2 = this.zzc;
        object = ((zzcau)object).zzd((Context)object2);
        object2 = "";
        Object object3 = object == null ? object2 : object;
        object = this.zza;
        Object object4 = this.zzc;
        object = ((zzcau)object).zzb((Context)object4);
        Object object5 = object == null ? object2 : object;
        object = this.zza;
        object4 = this.zzc;
        object = ((zzcau)object).zza((Context)object4);
        Object object6 = object == null ? object2 : object;
        object = this.zza;
        object4 = this.zzc;
        bl2 = ((zzcau)object).zzp((Context)object4);
        object4 = null;
        boolean bl3 = true;
        if (bl3 != bl2) {
            bl2 = false;
            object = null;
        } else {
            object = "fa";
        }
        Object object7 = "TIME_OUT";
        bl3 = ((String)object7).equals(object5);
        if (bl3) {
            object4 = zzbep.zzag;
            object7 = zzba.zzc();
            object4 = (Long)((zzben)object7).zza((zzbeg)object4);
        }
        Context context = object4;
        object7 = object == null ? object2 : object;
        object4 = object;
        object = new zzexi((String)object3, (String)object5, (String)object6, (String)object7, (Long)context);
        return object;
    }
}

