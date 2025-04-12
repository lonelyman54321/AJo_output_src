/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchBarAnimationHelper;

class SearchBarAnimationHelper$4
extends AnimatorListenerAdapter {
    final /* synthetic */ SearchBarAnimationHelper this$0;
    final /* synthetic */ SearchBar val$searchBar;

    public SearchBarAnimationHelper$4(SearchBarAnimationHelper searchBarAnimationHelper, SearchBar searchBar) {
        this.this$0 = searchBarAnimationHelper;
        this.val$searchBar = searchBar;
    }

    public void onAnimationEnd(Animator animator2) {
        SearchBarAnimationHelper.access$102(this.this$0, false);
    }

    public void onAnimationStart(Animator animator2) {
        this.val$searchBar.setVisibility(4);
    }
}

