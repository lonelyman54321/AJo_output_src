/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.view.View$MeasureSpec
 */
package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;

public class MotionPlaceholder
extends VirtualLayout {
    public MotionPlaceholder(Context context) {
        super(context);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    public final void k(AttributeSet object) {
        super.k((AttributeSet)object);
        object = new se3_0();
        this.d = object;
        this.q();
    }

    public final void onMeasure(int n3, int n4) {
        this.r(null, n3, n4);
    }

    public final void p(C41 c41, SparseArray sparseArray) {
    }

    public final void r(se3_0 se3_02, int n3, int n4) {
        int n7 = View.MeasureSpec.getMode((int)n3);
        n3 = View.MeasureSpec.getSize((int)n3);
        int n8 = View.MeasureSpec.getMode((int)n4);
        n4 = View.MeasureSpec.getSize((int)n4);
        if (se3_02 != null) {
            se3_02.a0(n7, n3, n8, n4);
            n3 = se3_02.G0;
            int n10 = se3_02.H0;
            this.setMeasuredDimension(n3, n10);
        } else {
            boolean bl2 = false;
            se3_02 = null;
            this.setMeasuredDimension(0, 0);
        }
    }
}

