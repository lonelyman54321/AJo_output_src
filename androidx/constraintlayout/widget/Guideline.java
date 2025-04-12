/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;

public class Guideline
extends View {
    public boolean a = true;

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        super.setVisibility(8);
    }

    public final void draw(Canvas canvas) {
    }

    public final void onMeasure(int n3, int n4) {
        this.setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean bl2) {
        this.a = bl2;
    }

    public void setGuidelineBegin(int n3) {
        ConstraintLayout$LayoutParams constraintLayout$LayoutParams = (ConstraintLayout$LayoutParams)this.getLayoutParams();
        int n4 = this.a;
        if (n4 != 0 && (n4 = constraintLayout$LayoutParams.a) == n3) {
            return;
        }
        constraintLayout$LayoutParams.a = n3;
        this.setLayoutParams((ViewGroup.LayoutParams)constraintLayout$LayoutParams);
    }

    public void setGuidelineEnd(int n3) {
        ConstraintLayout$LayoutParams constraintLayout$LayoutParams = (ConstraintLayout$LayoutParams)this.getLayoutParams();
        int n4 = this.a;
        if (n4 != 0 && (n4 = constraintLayout$LayoutParams.b) == n3) {
            return;
        }
        constraintLayout$LayoutParams.b = n3;
        this.setLayoutParams((ViewGroup.LayoutParams)constraintLayout$LayoutParams);
    }

    public void setGuidelinePercent(float f5) {
        float f6;
        float f7;
        ConstraintLayout$LayoutParams constraintLayout$LayoutParams = (ConstraintLayout$LayoutParams)this.getLayoutParams();
        boolean bl2 = this.a;
        if (bl2 && !(bl2 = (f7 = (f6 = constraintLayout$LayoutParams.c) - f5) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) {
            return;
        }
        constraintLayout$LayoutParams.c = f5;
        this.setLayoutParams((ViewGroup.LayoutParams)constraintLayout$LayoutParams);
    }

    public void setVisibility(int n3) {
    }
}

