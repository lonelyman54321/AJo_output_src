/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 */
package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

class BottomSheetBehavior$2
extends AnimatorListenerAdapter {
    final /* synthetic */ BottomSheetBehavior this$0;

    public BottomSheetBehavior$2(BottomSheetBehavior bottomSheetBehavior) {
        this.this$0 = bottomSheetBehavior;
    }

    public void onAnimationEnd(Animator object) {
        object = this.this$0;
        int n3 = 5;
        object.setStateInternal(n3);
        object = this.this$0.viewRef;
        if (object != null && (object = object.get()) != null) {
            object = (View)this.this$0.viewRef.get();
            object.requestLayout();
        }
    }
}

