/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.floatingactionbutton;

import android.view.View;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalTransformationCallback;

class FloatingActionButton$TransformationCallbackWrapper
implements FloatingActionButtonImpl$InternalTransformationCallback {
    private final TransformationCallback listener;
    final /* synthetic */ FloatingActionButton this$0;

    public FloatingActionButton$TransformationCallbackWrapper(FloatingActionButton floatingActionButton, TransformationCallback transformationCallback) {
        this.this$0 = floatingActionButton;
        this.listener = transformationCallback;
    }

    public boolean equals(Object object) {
        TransformationCallback transformationCallback;
        boolean bl2;
        boolean bl3 = object instanceof FloatingActionButton$TransformationCallbackWrapper;
        if (bl3 && (bl2 = (object = ((FloatingActionButton$TransformationCallbackWrapper)object).listener).equals(transformationCallback = this.listener))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public int hashCode() {
        return this.listener.hashCode();
    }

    public void onScaleChanged() {
        TransformationCallback transformationCallback = this.listener;
        FloatingActionButton floatingActionButton = this.this$0;
        transformationCallback.onScaleChanged((View)floatingActionButton);
    }

    public void onTranslationChanged() {
        TransformationCallback transformationCallback = this.listener;
        FloatingActionButton floatingActionButton = this.this$0;
        transformationCallback.onTranslationChanged((View)floatingActionButton);
    }
}

