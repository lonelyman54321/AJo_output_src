/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzfoq;
import com.google.android.gms.internal.ads.zzfqv;

public final class zzfph {
    private final zzfqv zza;
    private final String zzb;
    private final zzfoq zzc;
    private final String zzd;

    public zzfph(View object, zzfoq zzfoq2, String object2) {
        this.zza = object2 = new zzfqv((View)object);
        object = object.getClass().getCanonicalName();
        this.zzb = object;
        this.zzc = zzfoq2;
        this.zzd = "Ad overlay";
    }

    public final zzfoq zza() {
        return this.zzc;
    }

    public final zzfqv zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}

