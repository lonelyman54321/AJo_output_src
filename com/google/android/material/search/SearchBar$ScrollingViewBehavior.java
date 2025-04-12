/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.google.android.material.search;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;

public class SearchBar$ScrollingViewBehavior
extends AppBarLayout$ScrollingViewBehavior {
    private boolean initialized = false;

    public SearchBar$ScrollingViewBehavior() {
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setAppBarLayoutTransparent(AppBarLayout appBarLayout) {
        appBarLayout.setBackgroundColor(0);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 21;
        if (n3 == n4) {
            n3 = 0;
            appBarLayout.setOutlineProvider(null);
        } else {
            n3 = 0;
            appBarLayout.setTargetElevation(0.0f);
        }
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View object) {
        boolean bl2 = super.onDependentViewChanged(coordinatorLayout, view, (View)object);
        boolean bl3 = this.initialized;
        if (!bl3 && (bl3 = object instanceof AppBarLayout)) {
            this.initialized = bl3 = true;
            object = (AppBarLayout)object;
            this.setAppBarLayoutTransparent((AppBarLayout)object);
        }
        return bl2;
    }

    public boolean shouldHeaderOverlapScrollingChild() {
        return true;
    }
}

