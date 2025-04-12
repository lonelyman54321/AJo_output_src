/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 */
package com.google.android.material.transition;

import android.graphics.Canvas;
import com.google.android.material.canvas.CanvasCompat$CanvasOperation;
import com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable;

class MaterialContainerTransform$TransitionDrawable$2
implements CanvasCompat$CanvasOperation {
    final /* synthetic */ MaterialContainerTransform$TransitionDrawable this$0;

    public MaterialContainerTransform$TransitionDrawable$2(MaterialContainerTransform$TransitionDrawable materialContainerTransform$TransitionDrawable) {
        this.this$0 = materialContainerTransform$TransitionDrawable;
    }

    public void run(Canvas canvas) {
        MaterialContainerTransform$TransitionDrawable.access$900(this.this$0).draw(canvas);
    }
}

