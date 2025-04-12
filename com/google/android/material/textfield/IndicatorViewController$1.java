/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.widget.TextView
 */
package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import com.google.android.material.textfield.IndicatorViewController;

class IndicatorViewController$1
extends AnimatorListenerAdapter {
    final /* synthetic */ IndicatorViewController this$0;
    final /* synthetic */ int val$captionToHide;
    final /* synthetic */ int val$captionToShow;
    final /* synthetic */ TextView val$captionViewToHide;
    final /* synthetic */ TextView val$captionViewToShow;

    public IndicatorViewController$1(IndicatorViewController indicatorViewController, int n3, TextView textView, int n4, TextView textView2) {
        this.this$0 = indicatorViewController;
        this.val$captionToShow = n3;
        this.val$captionViewToHide = textView;
        this.val$captionToHide = n4;
        this.val$captionViewToShow = textView2;
    }

    public void onAnimationEnd(Animator object) {
        object = this.this$0;
        int n3 = this.val$captionToShow;
        IndicatorViewController.access$002((IndicatorViewController)object, n3);
        object = this.this$0;
        n3 = 0;
        float f5 = 0.0f;
        IndicatorViewController.access$102((IndicatorViewController)object, null);
        object = this.val$captionViewToHide;
        if (object != null) {
            object.setVisibility(4);
            int n4 = this.val$captionToHide;
            int n7 = 1;
            if (n4 == n7 && (object = IndicatorViewController.access$200(this.this$0)) != null) {
                object = IndicatorViewController.access$200(this.this$0);
                object.setText(null);
            }
        }
        if ((object = this.val$captionViewToShow) != null) {
            object.setTranslationY(0.0f);
            object = this.val$captionViewToShow;
            n3 = 1065353216;
            f5 = 1.0f;
            object.setAlpha(f5);
        }
    }

    public void onAnimationStart(Animator animator2) {
        animator2 = this.val$captionViewToShow;
        if (animator2 != null) {
            animator2.setVisibility(0);
            animator2 = this.val$captionViewToShow;
            animator2.setAlpha(0.0f);
        }
    }
}

