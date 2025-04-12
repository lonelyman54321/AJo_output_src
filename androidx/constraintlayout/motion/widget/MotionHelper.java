/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionLayout$f;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import java.util.HashMap;

public class MotionHelper
extends ConstraintHelper
implements MotionLayout$f {
    public boolean j = false;
    public boolean k = false;
    public float l;
    public View[] m;

    public MotionHelper(Context context) {
        super(context);
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.k(attributeSet);
    }

    public void a(int n3) {
    }

    public float getProgress() {
        return this.l;
    }

    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        if (attributeSet != null) {
            Context context = this.getContext();
            int[] nArray = R$styleable.MotionHelper;
            attributeSet = context.obtainStyledAttributes(attributeSet, nArray);
            int n3 = attributeSet.getIndexCount();
            nArray = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                int n4;
                int n7 = attributeSet.getIndex(i3);
                if (n7 == (n4 = R$styleable.MotionHelper_onShow)) {
                    n4 = (int)(this.j ? 1 : 0);
                    n7 = (int)(attributeSet.getBoolean(n7, n4 != 0) ? 1 : 0);
                    this.j = n7;
                    continue;
                }
                n4 = R$styleable.MotionHelper_onHide;
                if (n7 != n4) continue;
                n4 = this.k;
                n7 = (int)(attributeSet.getBoolean(n7, n4 != 0) ? 1 : 0);
                this.k = n7;
            }
            attributeSet.recycle();
        }
    }

    public void r(MotionLayout motionLayout, HashMap hashMap) {
    }

    public void setProgress(float f5) {
        int n3;
        this.l = f5;
        int n4 = this.b;
        if (n4 > 0) {
            View view = (View)this.getParent();
            view = this.j((ConstraintLayout)view);
            this.m = view;
            for (n3 = 0; n3 < (n4 = this.b); ++n3) {
                view = this.m[n3];
                this.setProgress(view, f5);
            }
        } else {
            ViewGroup viewGroup = (ViewGroup)this.getParent();
            int n7 = viewGroup.getChildCount();
            while (n3 < n7) {
                View view = viewGroup.getChildAt(n3);
                boolean bl2 = view instanceof MotionHelper;
                if (!bl2) {
                    this.setProgress(view, f5);
                }
                ++n3;
            }
        }
    }

    public void setProgress(View view, float f5) {
    }
}

