/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.widget.RelativeLayout
 */
package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzau;

final class zzh
extends RelativeLayout {
    final zzau zza;
    boolean zzb;

    public zzh(Context context, String string2, String string3, String string4) {
        super(context);
        zzau zzau2;
        this.zza = zzau2 = new zzau(context, string2);
        zzau2.zzo(string3);
        zzau2.zzn(string4);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean bl2 = this.zzb;
        if (!bl2) {
            zzau zzau2 = this.zza;
            zzau2.zzm(motionEvent);
        }
        return false;
    }
}

