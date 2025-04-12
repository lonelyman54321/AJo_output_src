/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
package com.skydoves.balloon;

import android.view.MotionEvent;
import android.view.View;
import com.skydoves.balloon.Balloon;
import kotlin.jvm.internal.Intrinsics;

public final class b
implements View.OnTouchListener {
    public final /* synthetic */ Balloon a;

    public b(Balloon balloon2) {
        this.a = balloon2;
    }

    public final boolean onTouch(View object, MotionEvent object2) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        object = "event";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        int n3 = object2.getAction();
        int n4 = 4;
        if (n3 == n4) {
            object = this.a;
            object2 = ((Balloon)object).b;
            n4 = (int)(object2.I ? 1 : 0);
            if (n4 != 0) {
                ((Balloon)object).h();
            }
            return true;
        }
        return false;
    }
}

