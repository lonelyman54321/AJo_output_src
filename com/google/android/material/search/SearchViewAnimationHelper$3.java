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
import com.google.android.material.search.SearchView;
import com.google.android.material.search.SearchView$TransitionState;
import com.google.android.material.search.SearchViewAnimationHelper;

class SearchViewAnimationHelper$3
extends AnimatorListenerAdapter {
    final /* synthetic */ SearchViewAnimationHelper this$0;

    public SearchViewAnimationHelper$3(SearchViewAnimationHelper searchViewAnimationHelper) {
        this.this$0 = searchViewAnimationHelper;
    }

    public void onAnimationEnd(Animator object) {
        object = SearchViewAnimationHelper.access$000(this.this$0);
        boolean bl2 = ((SearchView)object).isAdjustNothingSoftInputMode();
        if (!bl2) {
            object = SearchViewAnimationHelper.access$000(this.this$0);
            ((SearchView)object).requestFocusAndShowKeyboardIfNeeded();
        }
        object = SearchViewAnimationHelper.access$000(this.this$0);
        SearchView$TransitionState searchView$TransitionState = SearchView$TransitionState.SHOWN;
        ((SearchView)object).setTransitionState(searchView$TransitionState);
    }

    public void onAnimationStart(Animator object) {
        SearchViewAnimationHelper.access$100(this.this$0).setVisibility(0);
        object = SearchViewAnimationHelper.access$000(this.this$0);
        SearchView$TransitionState searchView$TransitionState = SearchView$TransitionState.SHOWING;
        ((SearchView)object).setTransitionState(searchView$TransitionState);
    }
}

