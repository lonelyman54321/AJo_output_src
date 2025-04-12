/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 */
package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.R$styleable;

public class Layer
extends ConstraintHelper {
    public boolean A;
    public float j;
    public float k;
    public float l;
    public ConstraintLayout m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public final boolean v;
    public View[] w;
    public float x;
    public float y;
    public boolean z;

    public Layer(Context context) {
        super(context);
        float f5;
        float f6;
        this.j = f6 = 0.0f / 0.0f;
        this.k = f6;
        this.l = f6;
        this.n = f5 = 1.0f;
        this.o = f5;
        this.p = f6;
        this.q = f6;
        this.r = f6;
        this.s = f6;
        this.t = f6;
        this.u = f6;
        this.v = true;
        this.w = null;
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f5;
        float f6;
        this.j = f6 = 0.0f / 0.0f;
        this.k = f6;
        this.l = f6;
        this.n = f5 = 1.0f;
        this.o = f5;
        this.p = f6;
        this.q = f6;
        this.r = f6;
        this.s = f6;
        this.t = f6;
        this.u = f6;
        this.v = true;
        this.w = null;
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        float f5;
        float f6;
        this.j = f6 = 0.0f / 0.0f;
        this.k = f6;
        this.l = f6;
        this.n = f5 = 1.0f;
        this.o = f5;
        this.p = f6;
        this.q = f6;
        this.r = f6;
        this.s = f6;
        this.t = f6;
        this.u = f6;
        this.v = true;
        this.w = null;
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public final void g(ConstraintLayout constraintLayout) {
        this.f(constraintLayout);
    }

    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.e = false;
        if (attributeSet != null) {
            Context context = this.getContext();
            int[] nArray = R$styleable.ConstraintLayout_Layout;
            attributeSet = context.obtainStyledAttributes(attributeSet, nArray);
            int n3 = attributeSet.getIndexCount();
            for (int i3 = 0; i3 < n3; ++i3) {
                int n4 = attributeSet.getIndex(i3);
                int n7 = R$styleable.ConstraintLayout_Layout_android_visibility;
                boolean bl2 = true;
                if (n4 == n7) {
                    this.z = bl2;
                    continue;
                }
                n7 = R$styleable.ConstraintLayout_Layout_android_elevation;
                if (n4 != n7) continue;
                this.A = bl2;
            }
            attributeSet.recycle();
        }
    }

    public final void n() {
        float f5;
        this.s();
        this.p = f5 = 0.0f / 0.0f;
        this.q = f5;
        Y50 y50 = ((ConstraintLayout$LayoutParams)this.getLayoutParams()).q0;
        y50.W(0);
        y50.R(0);
        this.r();
        int n3 = (int)this.t;
        int n4 = this.getPaddingLeft();
        n3 -= n4;
        n4 = (int)this.u;
        int n7 = this.getPaddingTop();
        n4 -= n7;
        n7 = (int)this.r;
        int n8 = this.getPaddingRight() + n7;
        n7 = (int)this.s;
        int n10 = this.getPaddingBottom() + n7;
        this.layout(n3, n4, n8, n10);
        this.t();
    }

    public final void o(ConstraintLayout constraintLayout) {
        this.m = constraintLayout;
        float f5 = this.getRotation();
        float f6 = 0.0f;
        float f7 = f5 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            f6 = this.l;
            object = Float.isNaN(f6);
            if (object == false) {
                this.l = f5;
            }
        } else {
            this.l = f5;
        }
    }

    public final void onAttachedToWindow() {
        ConstraintLayout constraintLayout;
        super.onAttachedToWindow();
        this.m = constraintLayout = (ConstraintLayout)this.getParent();
        int n3 = this.z;
        if (n3 != 0 || (n3 = this.A) != 0) {
            int n4;
            n3 = this.getVisibility();
            float f5 = this.getElevation();
            for (int i3 = 0; i3 < (n4 = this.b); ++i3) {
                ConstraintLayout constraintLayout2 = this.m;
                n4 = this.a[i3];
                View view = constraintLayout2.getViewById(n4);
                if (view == null) continue;
                Object object = this.z;
                if (object != 0) {
                    view.setVisibility(n3);
                }
                if ((object = this.A) == 0) continue;
                float f6 = 0.0f;
                constraintLayout2 = null;
                float f7 = f5 - 0.0f;
                object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                if (object <= 0) continue;
                f6 = view.getTranslationZ() + f5;
                view.setTranslationZ(f6);
            }
        }
    }

    public final void r() {
        float f5;
        View[] viewArray = this.m;
        if (viewArray == null) {
            return;
        }
        boolean bl2 = this.v;
        if (!(bl2 || (bl2 = Float.isNaN(f5 = this.p)) || (bl2 = Float.isNaN(f5 = this.q)))) {
            return;
        }
        f5 = this.j;
        bl2 = Float.isNaN(f5);
        if (!bl2 && !(bl2 = Float.isNaN(f5 = this.k))) {
            this.q = f5 = this.k;
            this.p = f5 = this.j;
        } else {
            int n3;
            viewArray = this.m;
            viewArray = this.j((ConstraintLayout)viewArray);
            View view = viewArray[0];
            int n4 = view.getLeft();
            View view2 = viewArray[0];
            int n7 = view2.getTop();
            View view3 = viewArray[0];
            int n8 = view3.getRight();
            View view4 = viewArray[0];
            int n10 = view4.getBottom();
            for (int i3 = 0; i3 < (n3 = this.b); ++i3) {
                View view5 = viewArray[i3];
                int n14 = view5.getLeft();
                n4 = Math.min(n4, n14);
                n14 = view5.getTop();
                n7 = Math.min(n7, n14);
                n14 = view5.getRight();
                n8 = Math.max(n8, n14);
                n3 = view5.getBottom();
                n10 = Math.max(n10, n3);
            }
            this.r = f5 = (float)n8;
            this.s = f5 = (float)n10;
            this.t = f5 = (float)n4;
            this.u = f5 = (float)n7;
            f5 = this.j;
            bl2 = Float.isNaN(f5);
            if (bl2) {
                n4 = (n4 + n8) / 2;
                this.p = f5 = (float)n4;
            } else {
                this.p = f5 = this.j;
            }
            f5 = this.k;
            bl2 = Float.isNaN(f5);
            if (bl2) {
                n7 = (n7 + n10) / 2;
                this.q = f5 = (float)n7;
            } else {
                this.q = f5 = this.k;
            }
        }
    }

    public final void s() {
        int n3;
        View[] viewArray = this.m;
        if (viewArray == null) {
            return;
        }
        int n4 = this.b;
        if (n4 == 0) {
            return;
        }
        View view = this.w;
        if (view == null || (n3 = ((View[])view).length) != n4) {
            viewArray = new View[n4];
            this.w = viewArray;
        }
        viewArray = null;
        for (n4 = 0; n4 < (n3 = this.b); ++n4) {
            n3 = this.a[n4];
            View[] viewArray2 = this.w;
            ConstraintLayout constraintLayout = this.m;
            viewArray2[n4] = view = constraintLayout.getViewById(n3);
        }
    }

    public void setElevation(float f5) {
        super.setElevation(f5);
        this.e();
    }

    public void setPivotX(float f5) {
        this.j = f5;
        this.t();
    }

    public void setPivotY(float f5) {
        this.k = f5;
        this.t();
    }

    public void setRotation(float f5) {
        this.l = f5;
        this.t();
    }

    public void setScaleX(float f5) {
        this.n = f5;
        this.t();
    }

    public void setScaleY(float f5) {
        this.o = f5;
        this.t();
    }

    public void setTranslationX(float f5) {
        this.x = f5;
        this.t();
    }

    public void setTranslationY(float f5) {
        this.y = f5;
        this.t();
    }

    public void setVisibility(int n3) {
        super.setVisibility(n3);
        this.e();
    }

    public final void t() {
        int n3;
        double d2;
        View[] viewArray = this.m;
        if (viewArray == null) {
            return;
        }
        viewArray = this.w;
        if (viewArray == null) {
            this.s();
        }
        this.r();
        float f5 = this.l;
        int n4 = Float.isNaN(f5);
        if (n4 != 0) {
            d2 = 0.0;
        } else {
            f5 = this.l;
            d2 = Math.toRadians(f5);
        }
        double d5 = Math.sin(d2);
        float f6 = (float)d5;
        d2 = Math.cos(d2);
        f5 = (float)d2;
        float f7 = this.n;
        float f8 = f7 * f5;
        float f11 = this.o;
        float f12 = -f11 * f6;
        f7 *= f6;
        f11 *= f5;
        f5 = 0.0f;
        viewArray = null;
        for (n4 = 0; n4 < (n3 = this.b); ++n4) {
            View view = this.w[n4];
            int n7 = view.getLeft();
            int n8 = (view.getRight() + n7) / 2;
            n7 = view.getTop();
            int n10 = (view.getBottom() + n7) / 2;
            float f14 = n8;
            float f15 = this.p;
            f14 -= f15;
            f15 = n10;
            float f16 = this.q;
            f15 -= f16;
            f16 = f8 * f14;
            float f17 = f12 * f15 + f16 - f14;
            f16 = this.x;
            f17 += f16;
            f16 = f11 * f15 + (f14 *= f7) - f15;
            f14 = this.y;
            view.setTranslationX(f17);
            view.setTranslationY(f16 += f14);
            f14 = this.o;
            view.setScaleY(f14);
            f14 = this.n;
            view.setScaleX(f14);
            f14 = this.l;
            n7 = (int)(Float.isNaN(f14) ? 1 : 0);
            if (n7 != 0) continue;
            f14 = this.l;
            view.setRotation(f14);
        }
    }
}

