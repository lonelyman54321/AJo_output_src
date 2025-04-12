/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 */
package com.google.accompanist.insets;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class ViewWindowInsetObserver$attachListener$1
implements View.OnAttachStateChangeListener {
    public void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "v");
        view.requestApplyInsets();
    }

    public void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "v");
    }
}

