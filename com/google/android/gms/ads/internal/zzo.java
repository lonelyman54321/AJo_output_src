/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzaxd;

final class zzo
implements View.OnTouchListener {
    final /* synthetic */ zzt zza;

    public zzo(zzt zzt2) {
        this.zza = zzt2;
    }

    public final boolean onTouch(View object, MotionEvent motionEvent) {
        object = this.zza;
        zzaxd zzaxd2 = zzt.zzf((zzt)object);
        if (zzaxd2 != null) {
            object = zzt.zzf((zzt)object);
            ((zzaxd)object).zzd(motionEvent);
        }
        return false;
    }
}

