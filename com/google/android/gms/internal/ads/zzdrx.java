/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzdsc;

public final class zzdrx
implements View.OnTouchListener {
    public final /* synthetic */ zzdsc zza;

    public /* synthetic */ zzdrx(zzdsc zzdsc2) {
        this.zza = zzdsc2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.zza.zzh(view, motionEvent);
        return false;
    }
}

