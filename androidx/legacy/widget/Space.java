/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 */
package androidx.legacy.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class Space
extends View {
    public Space(Context context) {
        this(context, null);
    }

    public Space(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Space(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        int n4 = this.getVisibility();
        if (n4 == 0) {
            n4 = 4;
            this.setVisibility(n4);
        }
    }

    public final void draw(Canvas canvas) {
    }

    public final void onMeasure(int n3, int n4) {
        int n7 = this.getSuggestedMinimumWidth();
        int n8 = View.MeasureSpec.getMode((int)n3);
        n3 = View.MeasureSpec.getSize((int)n3);
        int n10 = 0x40000000;
        int n14 = -1 << -1;
        if (n8 != n14) {
            if (n8 == n10) {
                n7 = n3;
            }
        } else {
            n7 = Math.min(n7, n3);
        }
        n3 = this.getSuggestedMinimumHeight();
        n8 = View.MeasureSpec.getMode((int)n4);
        n4 = View.MeasureSpec.getSize((int)n4);
        if (n8 != n14) {
            if (n8 == n10) {
                n3 = n4;
            }
        } else {
            n3 = Math.min(n3, n4);
        }
        this.setMeasuredDimension(n7, n3);
    }
}

