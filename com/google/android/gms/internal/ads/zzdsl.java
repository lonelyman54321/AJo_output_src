/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzdag;

public final class zzdsl
implements zzdag {
    private final zzchd zza;

    public zzdsl(zzchd zzchd2) {
        this.zza = zzchd2;
    }

    public final void zzdj(Context object) {
        object = this.zza;
        if (object != null) {
            object.destroy();
        }
    }

    public final void zzdl(Context object) {
        object = this.zza;
        if (object != null) {
            object.onPause();
        }
    }

    public final void zzdm(Context object) {
        object = this.zza;
        if (object != null) {
            object.onResume();
        }
    }
}

