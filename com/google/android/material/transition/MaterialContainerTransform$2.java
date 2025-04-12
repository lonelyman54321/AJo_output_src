/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.transition;

import android.view.View;
import androidx.transition.Transition;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.transition.MaterialContainerTransform;
import com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable;
import com.google.android.material.transition.TransitionListenerAdapter;

class MaterialContainerTransform$2
extends TransitionListenerAdapter {
    final /* synthetic */ MaterialContainerTransform this$0;
    final /* synthetic */ View val$drawingView;
    final /* synthetic */ View val$endView;
    final /* synthetic */ View val$startView;
    final /* synthetic */ MaterialContainerTransform$TransitionDrawable val$transitionDrawable;

    public MaterialContainerTransform$2(MaterialContainerTransform materialContainerTransform, View view, MaterialContainerTransform$TransitionDrawable materialContainerTransform$TransitionDrawable, View view2, View view3) {
        this.this$0 = materialContainerTransform;
        this.val$drawingView = view;
        this.val$transitionDrawable = materialContainerTransform$TransitionDrawable;
        this.val$startView = view2;
        this.val$endView = view3;
    }

    public void onTransitionEnd(Transition object) {
        this.this$0.removeListener(this);
        object = this.this$0;
        boolean bl2 = MaterialContainerTransform.access$300((MaterialContainerTransform)object);
        if (bl2) {
            return;
        }
        object = this.val$startView;
        float f5 = 1.0f;
        object.setAlpha(f5);
        this.val$endView.setAlpha(f5);
        object = ViewUtils.getOverlay(this.val$drawingView);
        MaterialContainerTransform$TransitionDrawable materialContainerTransform$TransitionDrawable = this.val$transitionDrawable;
        object.remove(materialContainerTransform$TransitionDrawable);
    }

    public void onTransitionEnd(Transition transition2, boolean bl2) {
        this.onTransitionEnd(transition2);
    }

    public void onTransitionStart(Transition object) {
        object = ViewUtils.getOverlay(this.val$drawingView);
        MaterialContainerTransform$TransitionDrawable materialContainerTransform$TransitionDrawable = this.val$transitionDrawable;
        object.add(materialContainerTransform$TransitionDrawable);
        this.val$startView.setAlpha(0.0f);
        this.val$endView.setAlpha(0.0f);
    }

    public void onTransitionStart(Transition transition2, boolean bl2) {
        this.onTransitionStart(transition2);
    }
}

