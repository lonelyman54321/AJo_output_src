/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.util.SparseArray
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.Constraints$LayoutParams;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.b$a;
import androidx.constraintlayout.widget.b$b;

public class Barrier
extends ConstraintHelper {
    public int j;
    public int k;
    public Lv l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.l.A0;
    }

    public int getMargin() {
        return this.l.B0;
    }

    public int getType() {
        return this.j;
    }

    public final void k(AttributeSet object) {
        Lv lv;
        super.k((AttributeSet)object);
        this.l = lv = new Lv();
        if (object != null) {
            lv = this.getContext();
            int[] nArray = R$styleable.ConstraintLayout_Layout;
            object = lv.obtainStyledAttributes((AttributeSet)object, nArray);
            int n3 = object.getIndexCount();
            nArray = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                Lv lv4;
                int n4;
                int n7 = object.getIndex(i3);
                if (n7 == (n4 = R$styleable.ConstraintLayout_Layout_barrierDirection)) {
                    n7 = object.getInt(n7, 0);
                    this.setType(n7);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets;
                if (n7 == n4) {
                    lv4 = this.l;
                    boolean bl2 = true;
                    n7 = (int)(object.getBoolean(n7, bl2) ? 1 : 0);
                    lv4.A0 = n7;
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_barrierMargin;
                if (n7 != n4) continue;
                n7 = object.getDimensionPixelSize(n7, 0);
                lv4 = this.l;
                lv4.B0 = n7;
            }
            object.recycle();
        }
        object = this.l;
        this.d = object;
        this.q();
    }

    public final void l(b$a object, F41 y50, Constraints$LayoutParams object2, SparseArray sparseArray) {
        super.l((b$a)object, (F41)y50, (Constraints$LayoutParams)((Object)object2), sparseArray);
        boolean bl2 = y50 instanceof Lv;
        if (bl2) {
            int n3;
            object2 = y50;
            object2 = (Lv)y50;
            y50 = (Z50)((Y50)y50).X;
            boolean bl3 = ((Z50)y50).C0;
            object = ((b$a)object).e;
            int n4 = ((b$b)object).g0;
            this.r((Y50)object2, n4, bl3);
            ((Lv)object2).A0 = bl3 = ((b$b)object).o0;
            ((Lv)object2).B0 = n3 = ((b$b)object).h0;
        }
    }

    public final void m(Y50 y50, boolean bl2) {
        int n3 = this.j;
        this.r(y50, n3, bl2);
    }

    public final void r(Y50 y50, int n3, boolean n4) {
        this.k = n3;
        n3 = 0;
        int n7 = 6;
        int n8 = 1;
        int n10 = 5;
        if (n4 != 0) {
            n4 = this.j;
            if (n4 == n10) {
                this.k = n8;
            } else if (n4 == n7) {
                this.k = 0;
            }
        } else {
            n4 = this.j;
            if (n4 == n10) {
                this.k = 0;
            } else if (n4 == n7) {
                this.k = n8;
            }
        }
        n3 = y50 instanceof Lv;
        if (n3 != 0) {
            y50 = (Lv)y50;
            ((Lv)y50).z0 = n3 = this.k;
        }
    }

    public void setAllowsGoneWidget(boolean bl2) {
        this.l.A0 = bl2;
    }

    public void setDpMargin(int n3) {
        float f5 = this.getResources().getDisplayMetrics().density;
        this.l.B0 = n3 = (int)((float)n3 * f5 + 0.5f);
    }

    public void setMargin(int n3) {
        this.l.B0 = n3;
    }

    public void setType(int n3) {
        this.j = n3;
    }
}

