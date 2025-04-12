/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzczy;
import com.google.android.gms.internal.ads.zzdjo;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfim;

public final class zzehz
implements zzdjp {
    public final /* synthetic */ zzeho zza;

    public /* synthetic */ zzehz(zzeho zzeho2) {
        this.zza = zzeho2;
    }

    public final void zza(boolean bl2, Context object, zzczy object2) {
        Object object3;
        object2 = this.zza;
        try {
            object3 = ((zzeho)object2).zzb;
        }
        catch (zzfhv zzfhv2) {
            Throwable throwable = zzfhv2.getCause();
            object = new zzdjo(throwable);
            throw object;
        }
        object3 = (zzfim)object3;
        ((zzfim)object3).zzv(bl2);
        Object object4 = ((zzeho)object2).zzb;
        object4 = (zzfim)object4;
        ((zzfim)object4).zzw((Context)object);
    }
}

