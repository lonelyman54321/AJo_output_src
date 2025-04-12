/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 */
package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import com.google.android.material.canvas.CanvasCompat$CanvasOperation;
import com.google.android.material.transition.platform.MaterialContainerTransform$TransitionDrawable;

class MaterialContainerTransform$TransitionDrawable$1
implements CanvasCompat$CanvasOperation {
    final /* synthetic */ MaterialContainerTransform$TransitionDrawable this$0;

    public MaterialContainerTransform$TransitionDrawable$1(MaterialContainerTransform$TransitionDrawable materialContainerTransform$TransitionDrawable) {
        this.this$0 = materialContainerTransform$TransitionDrawable;
    }

    public void run(Canvas canvas) {
        MaterialContainerTransform$TransitionDrawable.access$800(this.this$0).draw(canvas);
    }
}

