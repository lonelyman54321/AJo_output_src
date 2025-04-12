/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.transition.Transition
 *  android.view.Window
 */
package com.google.android.material.transition.platform;

import android.transition.Transition;
import android.view.Window;
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback;
import com.google.android.material.transition.platform.TransitionListenerAdapter;

class MaterialContainerTransformSharedElementCallback$1
extends TransitionListenerAdapter {
    final /* synthetic */ MaterialContainerTransformSharedElementCallback this$0;
    final /* synthetic */ Window val$window;

    public MaterialContainerTransformSharedElementCallback$1(MaterialContainerTransformSharedElementCallback materialContainerTransformSharedElementCallback, Window window) {
        this.this$0 = materialContainerTransformSharedElementCallback;
        this.val$window = window;
    }

    public void onTransitionEnd(Transition transition2) {
        MaterialContainerTransformSharedElementCallback.access$100(this.val$window);
    }

    public void onTransitionStart(Transition transition2) {
        MaterialContainerTransformSharedElementCallback.access$000(this.val$window);
    }
}

