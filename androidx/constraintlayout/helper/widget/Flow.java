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
import androidx.constraintlayout.widget.Constraints$LayoutParams;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.b$a;

public class Flow
extends VirtualLayout {
    public ds0_1 l;

    public Flow(Context context) {
        super(context);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    public final void k(AttributeSet object) {
        ds0_1 ds0_12;
        super.k((AttributeSet)object);
        this.l = ds0_12 = new ds0_1();
        if (object != null) {
            ds0_12 = this.getContext();
            int[] nArray = R$styleable.ConstraintLayout_Layout;
            object = ds0_12.obtainStyledAttributes((AttributeSet)object, nArray);
            int n3 = object.getIndexCount();
            nArray = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                float f5;
                ds0_1 ds0_13;
                int n4;
                int n7 = object.getIndex(i3);
                if (n7 == (n4 = R$styleable.ConstraintLayout_Layout_android_orientation)) {
                    ds0_13 = this.l;
                    ds0_13.c1 = n7 = object.getInt(n7, 0);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_android_padding;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.z0 = n7 = object.getDimensionPixelSize(n7, 0);
                    ds0_13.A0 = n7;
                    ds0_13.B0 = n7;
                    ds0_13.C0 = n7;
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_android_paddingStart;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.B0 = n7 = object.getDimensionPixelSize(n7, 0);
                    ds0_13.D0 = n7;
                    ds0_13.E0 = n7;
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_android_paddingEnd;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.C0 = n7 = object.getDimensionPixelSize(n7, 0);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_android_paddingLeft;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.D0 = n7 = object.getDimensionPixelSize(n7, 0);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_android_paddingTop;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.z0 = n7 = object.getDimensionPixelSize(n7, 0);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_android_paddingRight;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.E0 = n7 = object.getDimensionPixelSize(n7, 0);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_android_paddingBottom;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.A0 = n7 = object.getDimensionPixelSize(n7, 0);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_wrapMode;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.a1 = n7 = object.getInt(n7, 0);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_horizontalStyle;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.K0 = n7 = object.getInt(n7, 0);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_verticalStyle;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.L0 = n7 = object.getInt(n7, 0);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.M0 = n7 = object.getInt(n7, 0);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.O0 = n7 = object.getInt(n7, 0);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_firstVerticalStyle;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.N0 = n7 = object.getInt(n7, 0);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_lastVerticalStyle;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.P0 = n7 = object.getInt(n7, 0);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_horizontalBias;
                int n8 = 0x3F000000;
                float f6 = 0.5f;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.Q0 = f5 = object.getFloat(n7, f6);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_firstHorizontalBias;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.S0 = f5 = object.getFloat(n7, f6);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_lastHorizontalBias;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.U0 = f5 = object.getFloat(n7, f6);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_firstVerticalBias;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.T0 = f5 = object.getFloat(n7, f6);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_lastVerticalBias;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.V0 = f5 = object.getFloat(n7, f6);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_verticalBias;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.R0 = f5 = object.getFloat(n7, f6);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_horizontalAlign;
                n8 = 2;
                f6 = 2.8E-45f;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.Y0 = n7 = object.getInt(n7, n8);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_verticalAlign;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.Z0 = n7 = object.getInt(n7, n8);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_horizontalGap;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.W0 = n7 = object.getDimensionPixelSize(n7, 0);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_verticalGap;
                if (n7 == n4) {
                    ds0_13 = this.l;
                    ds0_13.X0 = n7 = object.getDimensionPixelSize(n7, 0);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_flow_maxElementsWrap;
                if (n7 != n4) continue;
                ds0_13 = this.l;
                n8 = -1;
                f6 = 0.0f / 0.0f;
                ds0_13.b1 = n7 = object.getInt(n7, n8);
            }
            object.recycle();
        }
        object = this.l;
        this.d = object;
        this.q();
    }

    public final void l(b$a b$a, F41 f41, Constraints$LayoutParams constraints$LayoutParams, SparseArray sparseArray) {
        super.l(b$a, f41, constraints$LayoutParams, sparseArray);
        int n3 = f41 instanceof ds0_1;
        if (n3 != 0) {
            f41 = (ds0_1)f41;
            n3 = constraints$LayoutParams.V;
            int n4 = -1;
            if (n3 != n4) {
                ((ds0_1)f41).c1 = n3;
            }
        }
    }

    public final void m(Y50 y50, boolean bl2) {
        int n3;
        y50 = this.l;
        int n4 = ((se3_0)y50).B0;
        if (n4 > 0 || (n3 = ((se3_0)y50).C0) > 0) {
            if (bl2) {
                int n7;
                ((se3_0)y50).D0 = n7 = ((se3_0)y50).C0;
                ((se3_0)y50).E0 = n4;
            } else {
                int n8;
                ((se3_0)y50).D0 = n4;
                ((se3_0)y50).E0 = n8 = ((se3_0)y50).C0;
            }
        }
    }

    public final void onMeasure(int n3, int n4) {
        ds0_1 ds0_12 = this.l;
        this.r(ds0_12, n3, n4);
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

    public void setFirstHorizontalBias(float f5) {
        this.l.S0 = f5;
        this.requestLayout();
    }

    public void setFirstHorizontalStyle(int n3) {
        this.l.M0 = n3;
        this.requestLayout();
    }

    public void setFirstVerticalBias(float f5) {
        this.l.T0 = f5;
        this.requestLayout();
    }

    public void setFirstVerticalStyle(int n3) {
        this.l.N0 = n3;
        this.requestLayout();
    }

    public void setHorizontalAlign(int n3) {
        this.l.Y0 = n3;
        this.requestLayout();
    }

    public void setHorizontalBias(float f5) {
        this.l.Q0 = f5;
        this.requestLayout();
    }

    public void setHorizontalGap(int n3) {
        this.l.W0 = n3;
        this.requestLayout();
    }

    public void setHorizontalStyle(int n3) {
        this.l.K0 = n3;
        this.requestLayout();
    }

    public void setLastHorizontalBias(float f5) {
        this.l.U0 = f5;
        this.requestLayout();
    }

    public void setLastHorizontalStyle(int n3) {
        this.l.O0 = n3;
        this.requestLayout();
    }

    public void setLastVerticalBias(float f5) {
        this.l.V0 = f5;
        this.requestLayout();
    }

    public void setLastVerticalStyle(int n3) {
        this.l.P0 = n3;
        this.requestLayout();
    }

    public void setMaxElementsWrap(int n3) {
        this.l.b1 = n3;
        this.requestLayout();
    }

    public void setOrientation(int n3) {
        this.l.c1 = n3;
        this.requestLayout();
    }

    public void setPadding(int n3) {
        ds0_1 ds0_12 = this.l;
        ds0_12.z0 = n3;
        ds0_12.A0 = n3;
        ds0_12.B0 = n3;
        ds0_12.C0 = n3;
        this.requestLayout();
    }

    public void setPaddingBottom(int n3) {
        this.l.A0 = n3;
        this.requestLayout();
    }

    public void setPaddingLeft(int n3) {
        this.l.D0 = n3;
        this.requestLayout();
    }

    public void setPaddingRight(int n3) {
        this.l.E0 = n3;
        this.requestLayout();
    }

    public void setPaddingTop(int n3) {
        this.l.z0 = n3;
        this.requestLayout();
    }

    public void setVerticalAlign(int n3) {
        this.l.Z0 = n3;
        this.requestLayout();
    }

    public void setVerticalBias(float f5) {
        this.l.R0 = f5;
        this.requestLayout();
    }

    public void setVerticalGap(int n3) {
        this.l.X0 = n3;
        this.requestLayout();
    }

    public void setVerticalStyle(int n3) {
        this.l.L0 = n3;
        this.requestLayout();
    }

    public void setWrapMode(int n3) {
        this.l.a1 = n3;
        this.requestLayout();
    }
}

