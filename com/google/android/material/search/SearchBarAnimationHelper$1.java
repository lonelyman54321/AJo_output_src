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
import com.google.android.material.search.SearchBarAnimationHelper;
import com.google.android.material.search.e;

class SearchBarAnimationHelper$1
extends AnimatorListenerAdapter {
    final /* synthetic */ SearchBarAnimationHelper this$0;

    public SearchBarAnimationHelper$1(SearchBarAnimationHelper searchBarAnimationHelper) {
        this.this$0 = searchBarAnimationHelper;
    }

    public void onAnimationEnd(Animator object) {
        object = this.this$0;
        e e2 = new Object();
        SearchBarAnimationHelper.access$000((SearchBarAnimationHelper)object, e2);
    }
}

