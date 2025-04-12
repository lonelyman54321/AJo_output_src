/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

public class ButtonBarLayout
extends LinearLayout {
    public boolean a;
    public boolean b;
    public int c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean bl2;
        int n3;
        this.c = n3 = -1;
        Object object = R$styleable.ButtonBarLayout;
        object = context.obtainStyledAttributes(attributeSet, object);
        int[] nArray = R$styleable.ButtonBarLayout;
        ViewCompat.r((View)this, context, nArray, attributeSet, (TypedArray)object, 0, 0);
        int bl22 = R$styleable.ButtonBarLayout_allowStacking;
        int n4 = 1;
        this.a = bl2 = object.getBoolean(bl22, n4 != 0);
        object.recycle();
        int n7 = this.getOrientation();
        if (n7 == n4) {
            boolean bl3 = this.a;
            this.setStacked(bl3);
        }
    }

    private void setStacked(boolean n3) {
        int n4 = this.b;
        if (n4 != n3 && (n3 == 0 || (n4 = this.a) != 0)) {
            this.b = n3;
            this.setOrientation(n3);
            n4 = n3 != 0 ? 0x800005 : 80;
            this.setGravity(n4);
            n4 = R$id.spacer;
            View view = this.findViewById(n4);
            if (view != null) {
                n3 = n3 != 0 ? 8 : 4;
                view.setVisibility(n3);
            }
            for (n3 = this.getChildCount() + -2; n3 >= 0; n3 += -1) {
                view = this.getChildAt(n3);
                this.bringChildToFront(view);
            }
        }
    }

    public final void onMeasure(int n3, int n4) {
        WeakHashMap weakHashMap;
        int n7;
        View view;
        DisplayMetrics displayMetrics;
        float f5;
        int n8;
        LinearLayout.LayoutParams layoutParams;
        float f6;
        int n10;
        int n14;
        int n15;
        int n16;
        block17: {
            n16 = 1;
            n15 = View.MeasureSpec.getSize((int)n3);
            n14 = this.a;
            n10 = 0;
            f6 = 0.0f;
            layoutParams = null;
            if (n14 != 0) {
                n14 = this.c;
                if (n15 > n14 && (n14 = (int)(this.b ? 1 : 0)) != 0) {
                    this.setStacked(false);
                }
                this.c = n15;
            }
            if ((n14 = (int)(this.b ? 1 : 0)) == 0 && (n14 = View.MeasureSpec.getMode((int)n3)) == (n8 = 0x40000000)) {
                n15 = View.MeasureSpec.makeMeasureSpec((int)n15, (int)(-1 << -1));
                n14 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n15 = n3;
                n14 = 0;
                f5 = 0.0f;
                displayMetrics = null;
            }
            super.onMeasure(n15, n4);
            n15 = (int)(this.a ? 1 : 0);
            if (n15 != 0 && (n15 = (int)(this.b ? 1 : 0)) == 0 && (n15 = this.getMeasuredWidthAndState() & 0xFF000000) == (n8 = 0x1000000)) {
                this.setStacked(n16 != 0);
                n14 = 1;
                f5 = Float.MIN_VALUE;
            }
            if (n14 != 0) {
                super.onMeasure(n3, n4);
            }
            n15 = this.getChildCount();
            n14 = 0;
            f5 = 0.0f;
            displayMetrics = null;
            while (true) {
                n8 = -1;
                if (n14 >= n15) break;
                view = this.getChildAt(n14);
                n7 = view.getVisibility();
                if (n7 != 0) {
                    n14 += n16;
                    continue;
                }
                break block17;
                break;
            }
            n14 = -1;
            f5 = 0.0f / 0.0f;
        }
        if (n14 >= 0) {
            View view2 = this.getChildAt(n14);
            layoutParams = (LinearLayout.LayoutParams)view2.getLayoutParams();
            n7 = this.getPaddingTop();
            n15 = view2.getMeasuredHeight() + n7;
            n7 = layoutParams.topMargin;
            n15 += n7;
            n10 = layoutParams.bottomMargin;
            n15 += n10;
            n10 = (int)(this.b ? 1 : 0);
            if (n10 != 0) {
                n14 += n16;
                n10 = this.getChildCount();
                while (n14 < n10) {
                    view = this.getChildAt(n14);
                    n7 = view.getVisibility();
                    if (n7 == 0) {
                        n8 = n14;
                        break;
                    }
                    n14 += n16;
                }
                if (n8 >= 0) {
                    weakHashMap = this.getChildAt(n8);
                    n16 = weakHashMap.getPaddingTop();
                    displayMetrics = this.getResources().getDisplayMetrics();
                    f5 = displayMetrics.density;
                    f6 = 16.0f;
                    n14 = (int)(f5 *= f6);
                    n10 = n16 = n16 + n14 + n15;
                } else {
                    n10 = n15;
                }
            } else {
                n16 = this.getPaddingBottom();
                n10 = n16 + n15;
            }
        }
        weakHashMap = ViewCompat.a;
        n16 = this.getMinimumHeight();
        if (n16 != n10) {
            this.setMinimumHeight(n10);
            if (n4 == 0) {
                super.onMeasure(n3, n4);
            }
        }
    }

    public void setAllowStacking(boolean bl2) {
        boolean bl3 = this.a;
        if (bl3 != bl2) {
            this.a = bl2;
            if (!bl2 && (bl2 = this.b)) {
                bl2 = false;
                this.setStacked(false);
            }
            this.requestLayout();
        }
    }
}

