/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzdmp;
import com.google.android.gms.internal.ads.zzdnp;
import java.util.Map;
import org.json.JSONObject;

final class zzdms
implements zzbhj {
    final /* synthetic */ zzdnp zza;
    final /* synthetic */ ViewGroup zzb;

    public zzdms(zzdnp zzdnp2, ViewGroup viewGroup) {
        this.zza = zzdnp2;
        this.zzb = viewGroup;
    }

    public final JSONObject zza() {
        return this.zza.zzo();
    }

    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    public final void zzc() {
        Object object = zzdmp.zza;
        Map map2 = this.zza.zzm();
        if (map2 != null) {
            int n3 = object.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                String string2 = (String)object.get(i3);
                string2 = map2.get(string2);
                if (string2 == null) continue;
                object = this.zza;
                map2 = this.zzb;
                object.onClick((View)map2);
                break;
            }
        }
    }

    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}

