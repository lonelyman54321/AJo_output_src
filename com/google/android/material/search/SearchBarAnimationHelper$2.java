/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 */
package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.search.SearchBarAnimationHelper;

class SearchBarAnimationHelper$2
extends AnimatorListenerAdapter {
    final /* synthetic */ SearchBarAnimationHelper this$0;
    final /* synthetic */ View val$centerView;
    final /* synthetic */ Animator val$secondaryViewAnimator;

    public SearchBarAnimationHelper$2(SearchBarAnimationHelper searchBarAnimationHelper, View view, Animator animator2) {
        this.this$0 = searchBarAnimationHelper;
        this.val$centerView = view;
        this.val$secondaryViewAnimator = animator2;
    }

    public void onAnimationEnd(Animator animator2) {
        this.val$centerView.setVisibility(8);
        this.val$secondaryViewAnimator.start();
    }
}

