/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.f;
import com.google.android.material.appbar.AppBarLayout;

class AppBarLayout$1
implements T72 {
    final /* synthetic */ AppBarLayout this$0;

    public AppBarLayout$1(AppBarLayout appBarLayout) {
        this.this$0 = appBarLayout;
    }

    public f onApplyWindowInsets(View view, f f5) {
        return this.this$0.onWindowInsetChanged(f5);
    }
}

