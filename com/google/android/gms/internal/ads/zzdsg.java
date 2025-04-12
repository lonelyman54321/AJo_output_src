/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.internal.ads.zzchd;
import java.util.ArrayList;

public final class zzdsg
extends FrameLayout {
    private final zzau zza;

    public zzdsg(Context context, View view, zzau zzau2) {
        super(context);
        int n3 = -1;
        super(n3, n3);
        this.setLayoutParams((ViewGroup.LayoutParams)context);
        this.addView(view);
        this.zza = zzau2;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.zza.zzm(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        Object object;
        int n3;
        int n4;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n7 = 0;
        for (n4 = 0; n4 < (n3 = this.getChildCount()); ++n4) {
            boolean bl2;
            object = this.getChildAt(n4);
            if (object == null || !(bl2 = object instanceof zzchd)) continue;
            object = (zzchd)object;
            arrayList.add(object);
        }
        super.removeAllViews();
        n4 = arrayList.size();
        while (n7 < n4) {
            object = (zzchd)arrayList.get(n7);
            object.destroy();
            ++n7;
        }
    }
}

