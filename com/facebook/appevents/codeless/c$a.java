/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
package com.facebook.appevents.codeless;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.codeless.a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

public final class c$a
implements View.OnTouchListener {
    public final CB0 a;
    public final WeakReference b;
    public final WeakReference c;
    public final View.OnTouchListener d;
    public final boolean e;

    public c$a(CB0 onTouchListener, View view, View view2) {
        Intrinsics.checkNotNullParameter(onTouchListener, "mapping");
        Intrinsics.checkNotNullParameter(view, "rootView");
        Intrinsics.checkNotNullParameter(view2, "hostView");
        this.a = onTouchListener;
        this.b = onTouchListener = new WeakReference(view2);
        this.c = onTouchListener = new WeakReference(view);
        this.d = onTouchListener = xc3_0.g(view2);
        this.e = true;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean bl2;
        boolean bl3;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        View view2 = (View)this.c.get();
        View view3 = (View)this.b.get();
        boolean bl4 = true;
        if (view2 != null && view3 != null && (bl3 = motionEvent.getAction()) == bl4) {
            CB0 cB0 = this.a;
            com.facebook.appevents.codeless.a.a(cB0, view2, view3);
        }
        if ((view2 = this.d) == null || !(bl2 = view2.onTouch(view, motionEvent))) {
            bl4 = false;
        }
        return bl4;
    }
}

