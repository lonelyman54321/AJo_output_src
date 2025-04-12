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

class SearchViewAnimationHelper$2
extends AnimatorListenerAdapter {
    final /* synthetic */ SearchViewAnimationHelper this$0;

    public SearchViewAnimationHelper$2(SearchViewAnimationHelper searchViewAnimationHelper) {
        this.this$0 = searchViewAnimationHelper;
    }

    public void onAnimationEnd(Animator object) {
        object = SearchViewAnimationHelper.access$100(this.this$0);
        int n3 = 8;
        object.setVisibility(n3);
        object = SearchViewAnimationHelper.access$000(this.this$0);
        boolean bl2 = ((SearchView)object).isAdjustNothingSoftInputMode();
        if (!bl2) {
            object = SearchViewAnimationHelper.access$000(this.this$0);
            ((SearchView)object).clearFocusAndHideKeyboard();
        }
        object = SearchViewAnimationHelper.access$000(this.this$0);
        SearchView$TransitionState searchView$TransitionState = SearchView$TransitionState.HIDDEN;
        ((SearchView)object).setTransitionState(searchView$TransitionState);
    }

    public void onAnimationStart(Animator object) {
        object = SearchViewAnimationHelper.access$000(this.this$0);
        SearchView$TransitionState searchView$TransitionState = SearchView$TransitionState.HIDING;
        ((SearchView)object).setTransitionState(searchView$TransitionState);
    }
}

