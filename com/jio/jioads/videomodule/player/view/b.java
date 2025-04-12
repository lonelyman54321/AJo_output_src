/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.TextureView
 */
package com.jio.jioads.videomodule.player.view;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TextureView;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class b
extends TextureView {
    public final Function2 a;

    public b(Context context, Function2 function2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(function2, "onMeasure");
        super(context);
        this.a = function2;
    }

    public final void a(int n3, int n4) {
        this.setMeasuredDimension(n3, n4);
    }

    public final boolean onKeyDown(int n3, KeyEvent keyEvent) {
        String string2 = "event";
        Intrinsics.checkNotNullParameter(keyEvent, string2);
        int n4 = 4;
        if (n3 != n4 && n3 != (n4 = 97) && n3 != (n4 = 109)) {
            n4 = 24;
        }
        return super.onKeyDown(n3, keyEvent);
    }

    public final void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        Integer n7 = n3;
        Integer n8 = n4;
        this.a.invoke(n7, n8);
    }

    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "ev");
        return false;
    }
}

