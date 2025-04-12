/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzip;
import com.google.android.gms.internal.ads.zziq;

final class zzir {
    private final Context zza;
    private final zzip zzb;

    public zzir(Context object, Handler handler, zziq zziq2) {
        this.zza = object = object.getApplicationContext();
        super(this, handler, zziq2);
        this.zzb = object;
    }
}

