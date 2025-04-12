/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

public class SearchView$Behavior
extends CoordinatorLayout$Behavior {
    public SearchView$Behavior() {
    }

    public SearchView$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, SearchView searchView, View object) {
        boolean bl2 = searchView.isSetupWithSearchBar();
        if (!bl2 && (bl2 = object instanceof SearchBar)) {
            object = (SearchBar)object;
            searchView.setupWithSearchBar((SearchBar)object);
        }
        return false;
    }
}

