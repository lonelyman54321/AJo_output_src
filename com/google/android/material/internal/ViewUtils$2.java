/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.internal;

import android.view.View;
import androidx.core.view.f;
import com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils$RelativePadding;

class ViewUtils$2
implements T72 {
    final /* synthetic */ ViewUtils$RelativePadding val$initialPadding;
    final /* synthetic */ ViewUtils$OnApplyWindowInsetsListener val$listener;

    public ViewUtils$2(ViewUtils$OnApplyWindowInsetsListener viewUtils$OnApplyWindowInsetsListener, ViewUtils$RelativePadding viewUtils$RelativePadding) {
        this.val$listener = viewUtils$OnApplyWindowInsetsListener;
        this.val$initialPadding = viewUtils$RelativePadding;
    }

    public f onApplyWindowInsets(View view, f f5) {
        ViewUtils$OnApplyWindowInsetsListener viewUtils$OnApplyWindowInsetsListener = this.val$listener;
        ViewUtils$RelativePadding viewUtils$RelativePadding = this.val$initialPadding;
        ViewUtils$RelativePadding viewUtils$RelativePadding2 = new ViewUtils$RelativePadding(viewUtils$RelativePadding);
        return viewUtils$OnApplyWindowInsetsListener.onApplyWindowInsets(view, f5, viewUtils$RelativePadding2);
    }
}

