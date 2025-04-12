/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;

public abstract class VirtualLayout
extends ConstraintHelper {
    public boolean j;
    public boolean k;

    public VirtualLayout(Context context) {
        super(context);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    public final void g(ConstraintLayout constraintLayout) {
        this.f(constraintLayout);
    }

    public void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        if (attributeSet != null) {
            Context context = this.getContext();
            int[] nArray = R$styleable.ConstraintLayout_Layout;
            attributeSet = context.obtainStyledAttributes(attributeSet, nArray);
            int n3 = attributeSet.getIndexCount();
            nArray = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                int n4 = attributeSet.getIndex(i3);
                int n7 = R$styleable.ConstraintLayout_Layout_android_visibility;
                boolean bl2 = true;
                if (n4 == n7) {
                    this.j = bl2;
                    continue;
                }
                n7 = R$styleable.ConstraintLayout_Layout_android_elevation;
                if (n4 != n7) continue;
                this.k = bl2;
            }
            attributeSet.recycle();
        }
    }

    public void onAttachedToWindow() {
        Object object;
        int n3;
        super.onAttachedToWindow();
        boolean bl2 = this.j;
        if ((bl2 || (bl2 = this.k)) && (n3 = (object = this.getParent()) instanceof ConstraintLayout) != 0) {
            int n4;
            object = (ConstraintLayout)((Object)object);
            n3 = this.getVisibility();
            float f5 = this.getElevation();
            for (int i3 = 0; i3 < (n4 = this.b); ++i3) {
                n4 = this.a[i3];
                View view = ((ConstraintLayout)((Object)object)).getViewById(n4);
                if (view == null) continue;
                Object object2 = this.j;
                if (object2 != 0) {
                    view.setVisibility(n3);
                }
                if ((object2 = this.k) == 0) continue;
                float f6 = 0.0f;
                float f7 = f5 - 0.0f;
                object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                if (object2 <= 0) continue;
                f6 = view.getTranslationZ() + f5;
                view.setTranslationZ(f6);
            }
        }
    }

    public void r(se3_0 se3_02, int n3, int n4) {
    }

    public void setElevation(float f5) {
        super.setElevation(f5);
        this.e();
    }

    public void setVisibility(int n3) {
        super.setVisibility(n3);
        this.e();
    }
}

