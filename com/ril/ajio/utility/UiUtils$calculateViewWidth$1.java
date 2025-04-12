/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.ril.ajio.utility;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function1;

public final class UiUtils$calculateViewWidth$1
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ Function1 b;

    public UiUtils$calculateViewWidth$1(View view, Function1 function1) {
        this.a = view;
        this.b = function1;
    }

    public final void onGlobalLayout() {
        Object object = this.a;
        object.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        object = object.getWidth();
        this.b.invoke(object);
    }
}

