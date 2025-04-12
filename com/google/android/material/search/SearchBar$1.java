/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener
 */
package com.google.android.material.search;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.search.SearchBar;

class SearchBar$1
implements View.OnAttachStateChangeListener {
    final /* synthetic */ SearchBar this$0;

    public SearchBar$1(SearchBar searchBar) {
        this.this$0 = searchBar;
    }

    public void onViewAttachedToWindow(View view) {
        view = SearchBar.access$000(this.this$0);
        Q1 q1 = SearchBar.access$100(this.this$0);
        R1 r1 = new R1(q1);
        view.addTouchExplorationStateChangeListener((AccessibilityManager.TouchExplorationStateChangeListener)r1);
    }

    public void onViewDetachedFromWindow(View view) {
        view = SearchBar.access$000(this.this$0);
        Q1 q1 = SearchBar.access$100(this.this$0);
        R1 r1 = new R1(q1);
        view.removeTouchExplorationStateChangeListener((AccessibilityManager.TouchExplorationStateChangeListener)r1);
    }
}

