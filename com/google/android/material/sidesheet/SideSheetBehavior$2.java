/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 */
package com.google.android.material.sidesheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

class SideSheetBehavior$2
extends AnimatorListenerAdapter {
    final /* synthetic */ SideSheetBehavior this$0;

    public SideSheetBehavior$2(SideSheetBehavior sideSheetBehavior) {
        this.this$0 = sideSheetBehavior;
    }

    public void onAnimationEnd(Animator object) {
        object = this.this$0;
        int n3 = 5;
        object.setStateInternal(n3);
        object = SideSheetBehavior.access$100(this.this$0);
        if (object != null && (object = SideSheetBehavior.access$100(this.this$0).get()) != null) {
            object = (View)SideSheetBehavior.access$100(this.this$0).get();
            object.requestLayout();
        }
    }
}

