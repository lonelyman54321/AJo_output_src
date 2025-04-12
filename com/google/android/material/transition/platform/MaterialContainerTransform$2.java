/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.transition.Transition
 *  android.view.View
 */
package com.google.android.material.transition.platform;

import android.transition.Transition;
import android.view.View;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.transition.platform.MaterialContainerTransform;
import com.google.android.material.transition.platform.MaterialContainerTransform$TransitionDrawable;
import com.google.android.material.transition.platform.TransitionListenerAdapter;

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
        boolean bl2 = MaterialContainerTransform.access$300((MaterialContainerTransform)((Object)object));
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

    public void onTransitionStart(Transition object) {
        object = ViewUtils.getOverlay(this.val$drawingView);
        MaterialContainerTransform$TransitionDrawable materialContainerTransform$TransitionDrawable = this.val$transitionDrawable;
        object.add(materialContainerTransform$TransitionDrawable);
        this.val$startView.setAlpha(0.0f);
        this.val$endView.setAlpha(0.0f);
    }
}

