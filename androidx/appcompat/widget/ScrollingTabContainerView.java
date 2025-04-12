/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.DecelerateInterpolator
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.HorizontalScrollView
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.SpinnerAdapter
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$dimen;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.ScrollingTabContainerView$1;
import androidx.appcompat.widget.ScrollingTabContainerView$a;
import androidx.appcompat.widget.ScrollingTabContainerView$b;
import androidx.appcompat.widget.ScrollingTabContainerView$c;

public class ScrollingTabContainerView
extends HorizontalScrollView
implements AdapterView.OnItemSelectedListener {
    public Runnable a;
    public final LinearLayoutCompat b;
    public AppCompatSpinner c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        new DecelerateInterpolator();
    }

    public ScrollingTabContainerView(Context object) {
        super((Context)object);
        int n3;
        new ScrollingTabContainerView$c(this);
        this.setHorizontalScrollBarEnabled(false);
        object = M2.a((Context)object);
        int n4 = ((M2)object).c();
        this.setContentHeight(n4);
        object = ((M2)object).a.getResources();
        n4 = R$dimen.abc_action_bar_stacked_tab_max_width;
        this.f = n3 = object.getDimensionPixelSize(n4);
        Object object2 = this.getContext();
        int n7 = R$attr.actionBarTabBarStyle;
        super((Context)object2, null, n7);
        ((LinearLayoutCompat)((Object)object)).setMeasureWithLargestChildEnabled(true);
        ((LinearLayoutCompat)((Object)object)).setGravity(17);
        int n8 = -2;
        n7 = -1;
        super(n8, n7);
        object.setLayoutParams((ViewGroup.LayoutParams)object2);
        this.b = object;
        super(n8, n7);
        this.addView((View)object, (ViewGroup.LayoutParams)object2);
    }

    public final void a() {
        int n3;
        Object object = this.c;
        if (object != null && (object = object.getParent()) == this) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        if (n3 == 0) {
            return;
        }
        object = this.c;
        this.removeView((View)object);
        object = this.b;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        this.addView((View)object, layoutParams);
        n3 = this.c.getSelectedItemPosition();
        this.setTabSelected(n3);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable2 = this.a;
        if (runnable2 != null) {
            this.post(runnable2);
        }
    }

    public final void onConfigurationChanged(Configuration object) {
        int n3;
        super.onConfigurationChanged((Configuration)object);
        object = M2.a(this.getContext());
        int n4 = ((M2)object).c();
        this.setContentHeight(n4);
        object = ((M2)object).a.getResources();
        n4 = R$dimen.abc_action_bar_stacked_tab_max_width;
        this.f = n3 = object.getDimensionPixelSize(n4);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable2 = this.a;
        if (runnable2 != null) {
            this.removeCallbacks(runnable2);
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int n3, long l2) {
        ((ScrollingTabContainerView$b)view).a.e();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onMeasure(int var1_1, int var2_2) {
        var2_2 = View.MeasureSpec.getMode((int)var1_1);
        var3_3 = 0;
        var4_4 /* !! */  = null;
        var5_5 = 1;
        var6_6 = 1.4E-45f;
        var7_7 = 0x40000000;
        var8_8 = var2_2 == var7_7;
        this.setFillViewport(var8_8);
        var9_9 = this.b;
        var10_10 = var9_9.getChildCount();
        var11_11 = -1;
        if (var10_10 <= var5_5) ** GOTO lbl-1000
        if (var2_2 == var7_7) ** GOTO lbl-1000
        var5_5 = -1 << -1;
        var6_6 = -0.0f;
        if (var2_2 == var5_5) lbl-1000:
        // 2 sources

        {
            var2_2 = 2;
            var12_12 = 2.8E-45f;
            if (var10_10 > var2_2) {
                var12_12 = View.MeasureSpec.getSize((int)var1_1);
                var5_5 = 1053609165;
                var6_6 = 0.4f;
                this.e = var2_2 = (int)(var12_12 *= var6_6);
            } else {
                this.e = var5_5 = View.MeasureSpec.getSize((int)var1_1) / var2_2;
            }
            var2_2 = this.e;
            var5_5 = this.f;
            this.e = var2_2 = Math.min(var2_2, var5_5);
        } else lbl-1000:
        // 2 sources

        {
            this.e = var11_11;
        }
        var2_2 = View.MeasureSpec.makeMeasureSpec((int)this.g, (int)var7_7);
        if (!var8_8 && (var5_5 = (int)this.d) != 0) {
            var9_9.measure(0, var2_2);
            var3_3 = var9_9.getMeasuredWidth();
            var5_5 = View.MeasureSpec.getSize((int)var1_1);
            if (var3_3 > var5_5) {
                var4_4 /* !! */  = this.c;
                if (var4_4 /* !! */  == null || (var4_4 /* !! */  = var4_4 /* !! */ .getParent()) != this) {
                    var4_4 /* !! */  = this.c;
                    var5_5 = -2;
                    var6_6 = 0.0f / 0.0f;
                    var7_7 = 0;
                    if (var4_4 /* !! */  == null) {
                        var13_13 /* !! */  = this.getContext();
                        var14_14 = R$attr.actionDropDownStyle;
                        var4_4 /* !! */  = new AppCompatSpinner(var13_13 /* !! */ , null, var14_14);
                        var13_13 /* !! */  = new LinearLayout.LayoutParams(var5_5, var11_11);
                        var4_4 /* !! */ .setLayoutParams((ViewGroup.LayoutParams)var13_13 /* !! */ );
                        var4_4 /* !! */ .setOnItemSelectedListener(this);
                        this.c = var4_4 /* !! */ ;
                    }
                    this.removeView((View)var9_9);
                    var4_4 /* !! */  = this.c;
                    var9_9 = new ViewGroup.LayoutParams(var5_5, var11_11);
                    this.addView((View)var4_4 /* !! */ , (ViewGroup.LayoutParams)var9_9);
                    var4_4 /* !! */  = this.c.getAdapter();
                    if (var4_4 /* !! */  == null) {
                        var4_4 /* !! */  = this.c;
                        var15_15 = new ScrollingTabContainerView$a(this);
                        var4_4 /* !! */ .setAdapter((SpinnerAdapter)var15_15);
                    }
                    if ((var4_4 /* !! */  = this.a) != null) {
                        this.removeCallbacks((Runnable)var4_4 /* !! */ );
                        this.a = null;
                    }
                    var4_4 /* !! */  = this.c;
                    var5_5 = this.h;
                    var4_4 /* !! */ .setSelection(var5_5);
                }
            } else {
                this.a();
            }
        } else {
            this.a();
        }
        var3_3 = this.getMeasuredWidth();
        super.onMeasure(var1_1, var2_2);
        var1_1 = this.getMeasuredWidth();
        if (var8_8 && var3_3 != var1_1) {
            var1_1 = this.h;
            this.setTabSelected(var1_1);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public void setAllowCollapse(boolean bl2) {
        this.d = bl2;
    }

    public void setContentHeight(int n3) {
        this.g = n3;
        this.requestLayout();
    }

    public void setTabSelected(int n3) {
        this.h = n3;
        Object object = this.b;
        int n4 = object.getChildCount();
        for (int i3 = 0; i3 < n4; ++i3) {
            Runnable runnable2;
            boolean bl2;
            View view = object.getChildAt(i3);
            if (i3 == n3) {
                bl2 = true;
            } else {
                bl2 = false;
                runnable2 = null;
            }
            view.setSelected(bl2);
            if (!bl2) continue;
            view = object.getChildAt(n3);
            runnable2 = this.a;
            if (runnable2 != null) {
                this.removeCallbacks(runnable2);
            }
            this.a = runnable2 = new ScrollingTabContainerView$1(this, view);
            this.post(runnable2);
        }
        object = this.c;
        if (object != null && n3 >= 0) {
            object.setSelection(n3);
        }
    }
}

