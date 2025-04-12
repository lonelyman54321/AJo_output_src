/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzczy;
import com.google.android.gms.internal.ads.zzdjo;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfim;

public final class zzemk
implements zzdjp {
    public final /* synthetic */ zzeho zza;

    public /* synthetic */ zzemk(zzeho zzeho2) {
        this.zza = zzeho2;
    }

    public final void zza(boolean bl2, Context object, zzczy object2) {
        object = this.zza;
        try {
            object2 = object.zzb;
        }
        catch (zzfhv zzfhv2) {
            zzm.zzk("Cannot show rewarded video.", zzfhv2);
            Throwable throwable = zzfhv2.getCause();
            object = new zzdjo(throwable);
            throw object;
        }
        object2 = (zzfim)object2;
        ((zzfim)object2).zzv(bl2);
        Object object3 = object.zzb;
        object3 = (zzfim)object3;
        ((zzfim)object3).zzA();
    }
}

