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
import com.google.android.material.search.SearchViewAnimationHelper;

class SearchViewAnimationHelper$5
extends AnimatorListenerAdapter {
    final /* synthetic */ SearchViewAnimationHelper this$0;
    final /* synthetic */ boolean val$show;

    public SearchViewAnimationHelper$5(SearchViewAnimationHelper searchViewAnimationHelper, boolean bl2) {
        this.this$0 = searchViewAnimationHelper;
        this.val$show = bl2;
    }

    public void onAnimationEnd(Animator object) {
        float f5;
        object = this.this$0;
        int n3 = this.val$show;
        if (n3 != 0) {
            n3 = 1065353216;
            f5 = 1.0f;
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        SearchViewAnimationHelper.access$200((SearchViewAnimationHelper)object, f5);
        SearchViewAnimationHelper.access$100(this.this$0).resetClipBoundsAndCornerRadius();
    }

    public void onAnimationStart(Animator object) {
        float f5;
        object = this.this$0;
        int n3 = this.val$show;
        if (n3 != 0) {
            n3 = 0;
            f5 = 0.0f;
        } else {
            n3 = 1065353216;
            f5 = 1.0f;
        }
        SearchViewAnimationHelper.access$200((SearchViewAnimationHelper)object, f5);
    }
}

