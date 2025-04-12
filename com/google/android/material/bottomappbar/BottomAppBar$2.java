/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.bottomappbar;

import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.shape.MaterialShapeDrawable;

class BottomAppBar$2
implements TransformationCallback {
    final /* synthetic */ BottomAppBar this$0;

    public BottomAppBar$2(BottomAppBar bottomAppBar) {
        this.this$0 = bottomAppBar;
    }

    public void onScaleChanged(FloatingActionButton floatingActionButton) {
        float f5;
        int n3;
        BottomAppBar bottomAppBar;
        MaterialShapeDrawable materialShapeDrawable = BottomAppBar.access$500(this.this$0);
        int n4 = floatingActionButton.getVisibility();
        if (n4 == 0 && (n4 = BottomAppBar.access$400(bottomAppBar = this.this$0)) == (n3 = 1)) {
            f5 = floatingActionButton.getScaleY();
        } else {
            f5 = 0.0f;
            floatingActionButton = null;
        }
        materialShapeDrawable.setInterpolation(f5);
    }

    public void onTranslationChanged(FloatingActionButton floatingActionButton) {
        Object object = this.this$0;
        int n3 = BottomAppBar.access$400((BottomAppBar)object);
        int n4 = 1;
        float f5 = Float.MIN_VALUE;
        if (n3 != n4) {
            return;
        }
        float f6 = floatingActionButton.getTranslationX();
        BottomAppBarTopEdgeTreatment bottomAppBarTopEdgeTreatment = BottomAppBar.access$600(this.this$0);
        f5 = bottomAppBarTopEdgeTreatment.getHorizontalOffset();
        float f7 = f5 - f6;
        n4 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
        if (n4 != 0) {
            bottomAppBarTopEdgeTreatment = BottomAppBar.access$600(this.this$0);
            bottomAppBarTopEdgeTreatment.setHorizontalOffset(f6);
            object = BottomAppBar.access$500(this.this$0);
            ((MaterialShapeDrawable)object).invalidateSelf();
        }
        f6 = -floatingActionButton.getTranslationY();
        n4 = 0;
        f5 = 0.0f;
        bottomAppBarTopEdgeTreatment = null;
        f6 = Math.max(0.0f, f6);
        BottomAppBarTopEdgeTreatment bottomAppBarTopEdgeTreatment2 = BottomAppBar.access$600(this.this$0);
        float f8 = bottomAppBarTopEdgeTreatment2.getCradleVerticalOffset();
        float f11 = f8 - f6;
        Object object2 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object2 != false) {
            bottomAppBarTopEdgeTreatment2 = BottomAppBar.access$600(this.this$0);
            bottomAppBarTopEdgeTreatment2.setCradleVerticalOffset(f6);
            object = BottomAppBar.access$500(this.this$0);
            ((MaterialShapeDrawable)object).invalidateSelf();
        }
        object = BottomAppBar.access$500(this.this$0);
        object2 = floatingActionButton.getVisibility();
        if (object2 == false) {
            f5 = floatingActionButton.getScaleY();
        }
        ((MaterialShapeDrawable)object).setInterpolation(f5);
    }
}

