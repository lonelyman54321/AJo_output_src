/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.f;
import com.google.android.material.appbar.CollapsingToolbarLayout;

class CollapsingToolbarLayout$1
implements T72 {
    final /* synthetic */ CollapsingToolbarLayout this$0;

    public CollapsingToolbarLayout$1(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.this$0 = collapsingToolbarLayout;
    }

    public f onApplyWindowInsets(View view, f f5) {
        return this.this$0.onWindowInsetChanged(f5);
    }
}

