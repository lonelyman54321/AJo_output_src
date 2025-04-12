/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.internal.ads.zzefq;
import com.google.android.gms.internal.ads.zzegl;
import com.google.android.gms.internal.ads.zzegm;

final class zzefo
extends zzegl {
    private Activity zza;
    private zzm zzb;
    private String zzc;
    private String zzd;

    public final zzegl zza(Activity object) {
        if (object != null) {
            this.zza = object;
            return this;
        }
        object = new NullPointerException("Null activity");
        throw object;
    }

    public final zzegl zzb(zzm zzm2) {
        this.zzb = zzm2;
        return this;
    }

    public final zzegl zzc(String string2) {
        this.zzc = string2;
        return this;
    }

    public final zzegl zzd(String string2) {
        this.zzd = string2;
        return this;
    }

    public final zzegm zze() {
        Activity activity = this.zza;
        if (activity != null) {
            zzefq zzefq2;
            zzm zzm2 = this.zzb;
            String string2 = this.zzc;
            String string3 = this.zzd;
            zzefq zzefq3 = zzefq2;
            zzefq2 = new zzefq(activity, zzm2, string2, string3, null);
            return zzefq2;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Missing required properties: activity");
        throw illegalStateException;
    }
}

