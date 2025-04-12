/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.transition.Transition
 *  android.view.View
 */
package com.google.android.material.transition.platform;

import android.app.Activity;
import android.transition.Transition;
import android.view.View;
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback;
import com.google.android.material.transition.platform.TransitionListenerAdapter;

class MaterialContainerTransformSharedElementCallback$2
extends TransitionListenerAdapter {
    final /* synthetic */ MaterialContainerTransformSharedElementCallback this$0;
    final /* synthetic */ Activity val$activity;

    public MaterialContainerTransformSharedElementCallback$2(MaterialContainerTransformSharedElementCallback materialContainerTransformSharedElementCallback, Activity activity) {
        this.this$0 = materialContainerTransformSharedElementCallback;
        this.val$activity = activity;
    }

    public void onTransitionEnd(Transition object) {
        object = MaterialContainerTransformSharedElementCallback.access$200();
        if (object != null && (object = (View)MaterialContainerTransformSharedElementCallback.access$200().get()) != null) {
            float f5 = 1.0f;
            object.setAlpha(f5);
            object = null;
            MaterialContainerTransformSharedElementCallback.access$202(null);
        }
        this.val$activity.finish();
        this.val$activity.overridePendingTransition(0, 0);
    }
}

