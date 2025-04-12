/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.view.View$MeasureSpec
 *  android.widget.FrameLayout
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.widget.ContentFrameLayout$a;

public class ContentFrameLayout
extends FrameLayout {
    public TypedValue a;
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public final Rect g;
    public ContentFrameLayout$a h;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        super();
        this.g = context;
    }

    public TypedValue getFixedHeightMajor() {
        TypedValue typedValue = this.e;
        if (typedValue == null) {
            this.e = typedValue = new TypedValue();
        }
        return this.e;
    }

    public TypedValue getFixedHeightMinor() {
        TypedValue typedValue = this.f;
        if (typedValue == null) {
            this.f = typedValue = new TypedValue();
        }
        return this.f;
    }

    public TypedValue getFixedWidthMajor() {
        TypedValue typedValue = this.c;
        if (typedValue == null) {
            this.c = typedValue = new TypedValue();
        }
        return this.c;
    }

    public TypedValue getFixedWidthMinor() {
        TypedValue typedValue = this.d;
        if (typedValue == null) {
            this.d = typedValue = new TypedValue();
        }
        return this.d;
    }

    public TypedValue getMinWidthMajor() {
        TypedValue typedValue = this.a;
        if (typedValue == null) {
            this.a = typedValue = new TypedValue();
        }
        return this.a;
    }

    public TypedValue getMinWidthMinor() {
        TypedValue typedValue = this.b;
        if (typedValue == null) {
            this.b = typedValue = new TypedValue();
        }
        return this.b;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ContentFrameLayout$a contentFrameLayout$a = this.h;
        if (contentFrameLayout$a != null) {
            contentFrameLayout$a.getClass();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Object object = this.h;
        if (object != null) {
            boolean bl2;
            object = ((xm_0)object).a;
            Object object2 = ((AppCompatDelegateImpl)object).r;
            if (object2 != null) {
                object2.g();
            }
            if ((object2 = ((AppCompatDelegateImpl)object).w) != null) {
                object2 = ((AppCompatDelegateImpl)object).l.getDecorView();
                Runnable runnable2 = ((AppCompatDelegateImpl)object).x;
                object2.removeCallbacks(runnable2);
                object2 = ((AppCompatDelegateImpl)object).w;
                bl2 = object2.isShowing();
                if (bl2) {
                    try {
                        object2 = ((AppCompatDelegateImpl)object).w;
                        object2.dismiss();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {}
                }
                bl2 = false;
                object2 = null;
                ((AppCompatDelegateImpl)object).w = null;
            }
            if ((object2 = ((AppCompatDelegateImpl)object).y) != null) {
                ((zd3_1)object2).b();
            }
            bl2 = false;
            object2 = null;
            object = ((AppCompatDelegateImpl)object).P((int)0).h;
            if (object == null) return;
            ((d)object).close();
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void onMeasure(int var1_1, int var2_2) {
        var3_3 = this;
        var4_4 = this.getContext().getResources().getDisplayMetrics();
        var5_5 = var4_4.widthPixels;
        var6_6 = var4_4.heightPixels;
        var7_7 = true;
        if (var5_5 < var6_6) {
            var5_5 = 1;
        } else {
            var5_5 = 0;
            var8_8 = null;
        }
        var6_6 = View.MeasureSpec.getMode((int)var1_1);
        var9_9 = View.MeasureSpec.getMode((int)var2_2);
        var10_10 = var3_3.g;
        var11_11 = 6;
        var12_12 = 5;
        var13_13 = -1 << -1;
        var14_14 = 0x40000000;
        if (var6_6 != var13_13 || (var15_15 = var5_5 != 0 ? var3_3.d : var3_3.c) == null || (var16_16 = var15_15.type) == 0) ** GOTO lbl-1000
        if (var16_16 == var12_12) {
            var17_17 = var15_15.getDimension(var4_4);
lbl21:
            // 2 sources

            while (true) {
                var18_21 = (int)var17_17;
                break;
            }
        } else {
            if (var16_16 == var11_11) {
                var16_16 = var4_4.widthPixels;
                var19_19 = var16_16;
                var20_20 = var16_16;
                var17_17 = var15_15.getFraction(var19_19, var20_20);
                ** continue;
            }
            var18_21 = 0;
            var17_18 = 0.0f;
            var15_15 = null;
        }
        if (var18_21 > 0) {
            var16_16 = var10_10.left;
            var21_22 = var10_10.right;
            var18_21 -= (var16_16 += var21_22);
            var16_16 = View.MeasureSpec.getSize((int)var1_1);
            var18_21 = View.MeasureSpec.makeMeasureSpec((int)Math.min(var18_21, var16_16), (int)var14_14);
            var16_16 = 1;
            var20_20 = 1.4E-45f;
        } else lbl-1000:
        // 2 sources

        {
            var18_21 = var1_1;
            var16_16 = 0;
            var20_20 = 0.0f;
        }
        if (var9_9 != var13_13 || (var22_23 = var5_5 != 0 ? var3_3.e : var3_3.f) == null || (var21_22 = var22_23.type) == 0) ** GOTO lbl-1000
        if (var21_22 == var12_12) {
            var23_24 = var22_23.getDimension(var4_4);
lbl48:
            // 2 sources

            while (true) {
                var9_9 = (int)var23_24;
                break;
            }
        } else {
            if (var21_22 == var11_11) {
                var21_22 = var4_4.heightPixels;
                var24_26 = var21_22;
                var19_19 = var21_22;
                var23_24 = var22_23.getFraction(var24_26, var19_19);
                ** continue;
            }
            var9_9 = 0;
            var23_25 = 0.0f;
            var22_23 = null;
        }
        if (var9_9 > 0) {
            var21_22 = var10_10.top;
            var25_27 = var10_10.bottom;
            var9_9 -= (var21_22 += var25_27);
            var21_22 = View.MeasureSpec.getSize((int)var2_2);
            var9_9 = View.MeasureSpec.makeMeasureSpec((int)Math.min(var9_9, var21_22), (int)var14_14);
        } else lbl-1000:
        // 2 sources

        {
            var9_9 = var2_2;
        }
        super.onMeasure(var18_21, var9_9);
        var18_21 = this.getMeasuredWidth();
        var21_22 = View.MeasureSpec.makeMeasureSpec((int)var18_21, (int)var14_14);
        if (var16_16 != 0 || var6_6 != var13_13 || (var8_8 = var5_5 != 0 ? var3_3.b : var3_3.a) == null || (var6_6 = var8_8.type) == 0) ** GOTO lbl-1000
        if (var6_6 == var12_12) {
            var26_28 = var8_8.getDimension(var4_4);
lbl74:
            // 2 sources

            while (true) {
                var27_30 = (int)var26_28;
                break;
            }
        } else {
            if (var6_6 == var11_11) {
                var27_30 = var4_4.widthPixels;
                var28_31 = var27_30;
                var26_28 = var27_30;
                var26_28 = var8_8.getFraction(var28_31, var26_28);
                ** continue;
            }
            var27_30 = 0;
            var26_29 = 0.0f;
            var4_4 = null;
        }
        if (var27_30 > 0) {
            var5_5 = var10_10.left;
            var6_6 = var10_10.right;
            var27_30 -= (var5_5 += var6_6);
        }
        if (var18_21 < var27_30) {
            var21_22 = View.MeasureSpec.makeMeasureSpec((int)var27_30, (int)var14_14);
        } else lbl-1000:
        // 2 sources

        {
            var7_7 = false;
        }
        if (var7_7) {
            super.onMeasure(var21_22, var9_9);
        }
    }

    public void setAttachListener(ContentFrameLayout$a contentFrameLayout$a) {
        this.h = contentFrameLayout$a;
    }

    public void setDecorPadding(int n3, int n4, int n7, int n8) {
        Rect rect = this.g;
        rect.set(n3, n4, n7, n8);
        n3 = (int)(this.isLaidOut() ? 1 : 0);
        if (n3 != 0) {
            this.requestLayout();
        }
    }
}

