/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzdlo;
import com.google.android.gms.internal.ads.zzdqa;
import org.json.JSONObject;

final class zzdpz
implements zzbhj {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdqa zzb;

    public zzdpz(zzdqa zzdqa2, String string2) {
        this.zza = "_videoMediaView";
        this.zzb = zzdqa2;
    }

    public final JSONObject zza() {
        return null;
    }

    public final JSONObject zzb() {
        return null;
    }

    public final void zzc() {
        Object object = this.zzb;
        Object object2 = zzdqa.zzc((zzdqa)object);
        if (object2 != null) {
            object2 = this.zza;
            object = zzdqa.zzc((zzdqa)object);
            ((zzdlo)object).zzF((String)object2);
        }
    }

    public final void zzd(MotionEvent motionEvent) {
    }
}

