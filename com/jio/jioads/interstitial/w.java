/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
package com.jio.jioads.interstitial;

import android.view.MotionEvent;
import android.view.View;
import com.jio.jioads.interstitial.x;
import kotlin.jvm.internal.Intrinsics;

public final class w
implements View.OnTouchListener {
    public final /* synthetic */ x a;

    public /* synthetic */ w(x x5) {
        this.a = x5;
    }

    public final boolean onTouch(View object, MotionEvent motionEvent) {
        boolean bl2;
        x x5 = this.a;
        Intrinsics.checkNotNullParameter(x5, "this$0");
        object = x5.c;
        if (object != null) {
            object = object.y();
            Boolean bl3 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object, bl3);
        } else {
            bl2 = false;
            object = null;
        }
        if (bl2 && (object = x5.e) != null) {
            object.onTouchEvent(motionEvent);
        }
        return x5.d;
    }
}

