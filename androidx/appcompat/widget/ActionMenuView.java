/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.ContextThemeWrapper
 *  android.view.Menu
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  android.widget.LinearLayout$LayoutParams
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.d$a;
import androidx.appcompat.view.menu.d$b;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.h$a;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuPresenter$c;
import androidx.appcompat.widget.ActionMenuView$LayoutParams;
import androidx.appcompat.widget.ActionMenuView$a;
import androidx.appcompat.widget.ActionMenuView$c;
import androidx.appcompat.widget.ActionMenuView$d;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.LinearLayoutCompat$LayoutParams;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ActionMenuView
extends LinearLayoutCompat
implements d$b,
i {
    public d a;
    public Context b;
    public int c;
    public boolean d;
    public ActionMenuPresenter e;
    public h$a f;
    public d$a g;
    public boolean h;
    public int i;
    public final int j;
    public final int k;
    public ActionMenuView$d l;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        int n4;
        this.setBaselineAligned(false);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.j = n4 = (int)(56.0f * f5);
        this.k = n3 = (int)(f5 * 4.0f);
        this.b = context;
        this.c = 0;
    }

    public static ActionMenuView$LayoutParams d() {
        int n3 = -2;
        ActionMenuView$LayoutParams actionMenuView$LayoutParams = new LinearLayout.LayoutParams(n3, n3);
        actionMenuView$LayoutParams.a = false;
        actionMenuView$LayoutParams.gravity = 16;
        return actionMenuView$LayoutParams;
    }

    public static ActionMenuView$LayoutParams e(ViewGroup.LayoutParams object) {
        if (object != null) {
            int n3;
            ActionMenuView$LayoutParams actionMenuView$LayoutParams;
            boolean bl2 = object instanceof ActionMenuView$LayoutParams;
            if (bl2) {
                object = (ActionMenuView$LayoutParams)((Object)object);
                actionMenuView$LayoutParams = new LinearLayout.LayoutParams(object);
                n3 = (int)(object.a ? 1 : 0);
                actionMenuView$LayoutParams.a = n3;
            } else {
                actionMenuView$LayoutParams = new LinearLayout.LayoutParams(object);
            }
            n3 = actionMenuView$LayoutParams.gravity;
            if (n3 <= 0) {
                actionMenuView$LayoutParams.gravity = n3 = 16;
            }
            return actionMenuView$LayoutParams;
        }
        return ActionMenuView.d();
    }

    public final boolean b(f f5) {
        return this.a.performItemAction(f5, 0);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ActionMenuView$LayoutParams;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final boolean f(int n3) {
        int n4 = 0;
        if (n3 == 0) {
            return false;
        }
        int n7 = n3 + -1;
        Object object = this.getChildAt(n7);
        Object object2 = this.getChildAt(n3);
        int n8 = this.getChildCount();
        if (n3 < n8 && (n8 = object instanceof ActionMenuView$a) != 0) {
            object = (ActionMenuView$a)object;
            n4 = object.b();
        }
        if (n3 > 0 && (n3 = object2 instanceof ActionMenuView$a) != 0) {
            object2 = (ActionMenuView$a)object2;
            n3 = (int)(object2.c() ? 1 : 0);
            n4 |= n3;
        }
        return n4 != 0;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = this.getContext();
        ActionMenuView$LayoutParams actionMenuView$LayoutParams = new ActionMenuView$LayoutParams(context, attributeSet);
        return actionMenuView$LayoutParams;
    }

    public final LinearLayoutCompat$LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = this.getContext();
        ActionMenuView$LayoutParams actionMenuView$LayoutParams = new ActionMenuView$LayoutParams(context, attributeSet);
        return actionMenuView$LayoutParams;
    }

    public Menu getMenu() {
        Object object = this.a;
        if (object == null) {
            boolean bl2;
            object = this.getContext();
            Object object2 = new d((Context)object);
            this.a = object2;
            ActionMenuView$c actionMenuView$c = new ActionMenuView$c(this);
            ((d)object2).setCallback(actionMenuView$c);
            this.e = object2 = new ActionMenuPresenter((Context)object);
            ((ActionMenuPresenter)object2).m = bl2 = true;
            ((ActionMenuPresenter)object2).n = bl2;
            object = this.f;
            if (object == null) {
                object = new Object();
            }
            ((a)object2).e = object;
            object = this.a;
            actionMenuView$c = this.b;
            ((d)object).addMenuPresenter((h)object2, (Context)actionMenuView$c);
            object = this.e;
            ((a)object).h = this;
            this.a = object = ((a)object).c;
        }
        return this.a;
    }

    public Drawable getOverflowIcon() {
        boolean bl2;
        this.getMenu();
        Object object = this.e;
        ActionMenuPresenter$c actionMenuPresenter$c = ((ActionMenuPresenter)object).j;
        object = actionMenuPresenter$c != null ? actionMenuPresenter$c.getDrawable() : ((bl2 = ((ActionMenuPresenter)object).l) ? ((ActionMenuPresenter)object).k : null);
        return object;
    }

    public int getPopupTheme() {
        return this.c;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void initialize(d d2) {
        this.a = d2;
    }

    public final void onConfigurationChanged(Configuration object) {
        super.onConfigurationChanged((Configuration)object);
        object = this.e;
        if (object != null) {
            ((ActionMenuPresenter)object).updateMenuView(false);
            object = this.e;
            boolean bl2 = ((ActionMenuPresenter)object).c();
            if (bl2) {
                this.e.b();
                object = this.e;
                ((ActionMenuPresenter)object).e();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Object object = this.e;
        if (object != null) {
            boolean bl2;
            ((ActionMenuPresenter)object).b();
            object = ((ActionMenuPresenter)object).u;
            if (object != null && (bl2 = ((g)object).b())) {
                object = ((g)object).j;
                object.dismiss();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        int n10;
        int n14;
        int n15;
        ActionMenuView$LayoutParams actionMenuView$LayoutParams;
        ActionMenuView actionMenuView = this;
        int n16 = 1;
        int n17 = this.h;
        if (n17 == 0) {
            super.onLayout(bl2, n3, n4, n7, n8);
            return;
        }
        n17 = this.getChildCount();
        int n18 = (n8 - n4) / 2;
        int n19 = this.getDividerWidth();
        int n20 = n7 - n3;
        int n21 = this.getPaddingRight();
        n21 = n20 - n21;
        int n22 = this.getPaddingLeft();
        n21 -= n22;
        n22 = (int)(dE3.a ? 1 : 0);
        n22 = this.getLayoutDirection();
        if (n22 == n16) {
            n22 = 1;
        } else {
            n22 = 0;
            actionMenuView$LayoutParams = null;
        }
        int n24 = 0;
        int n25 = 0;
        int n26 = 0;
        while (true) {
            n15 = 8;
            if (n24 >= n17) break;
            View view = actionMenuView.getChildAt(n24);
            int n27 = view.getVisibility();
            if (n27 != n15) {
                ActionMenuView$LayoutParams actionMenuView$LayoutParams2 = (ActionMenuView$LayoutParams)view.getLayoutParams();
                n27 = (int)(actionMenuView$LayoutParams2.a ? 1 : 0);
                if (n27 != 0) {
                    int n28;
                    int n29;
                    n25 = view.getMeasuredWidth();
                    n27 = (int)(actionMenuView.f(n24) ? 1 : 0);
                    if (n27 != 0) {
                        n25 += n19;
                    }
                    n27 = view.getMeasuredHeight();
                    if (n22 != 0) {
                        n29 = this.getPaddingLeft();
                        n15 = actionMenuView$LayoutParams2.leftMargin;
                        n29 += n15;
                        n15 = n29 + n25;
                    } else {
                        n29 = this.getWidth();
                        n28 = this.getPaddingRight();
                        n15 = actionMenuView$LayoutParams2.rightMargin;
                        n15 = (n29 -= n28) - n15;
                        n29 = n15 - n25;
                    }
                    n28 = n27 / 2;
                    n14 = n18 - n28;
                    view.layout(n29, n14, n15, n27 += n14);
                    n21 -= n25;
                    n25 = 1;
                } else {
                    n14 = view.getMeasuredWidth();
                    n10 = actionMenuView$LayoutParams2.leftMargin;
                    n14 += n10;
                    n15 = actionMenuView$LayoutParams2.rightMargin;
                    n21 -= (n14 += n15);
                    actionMenuView.f(n24);
                    n26 += n16;
                }
            }
            n24 += n16;
        }
        if (n17 == n16 && n25 == 0) {
            View view = actionMenuView.getChildAt(0);
            n17 = view.getMeasuredWidth();
            n19 = view.getMeasuredHeight();
            n20 /= 2;
            n21 = n17 / 2;
            n20 -= n21;
            n21 = n19 / 2;
            view.layout(n20, n18, n17 += n20, n19 += (n18 -= n21));
            return;
        }
        n19 = n25 ^ 1;
        n19 = (n26 -= n19) > 0 ? n21 / n26 : 0;
        n20 = 0;
        View view = null;
        n19 = Math.max(0, n19);
        if (n22 == 0) {
            n21 = this.getPaddingLeft();
        } else {
            n21 = this.getWidth();
            n22 = this.getPaddingRight();
            n21 -= n22;
            for (n14 = 0; n14 < n17; n14 += n16) {
                view = actionMenuView.getChildAt(n14);
                actionMenuView$LayoutParams = (ActionMenuView$LayoutParams)view.getLayoutParams();
                n24 = view.getVisibility();
                if (n24 == n15 || (n24 = (int)(actionMenuView$LayoutParams.a ? 1 : 0)) != 0) continue;
                n24 = actionMenuView$LayoutParams.rightMargin;
                n21 -= n24;
                n24 = view.getMeasuredWidth();
                n25 = view.getMeasuredHeight();
                n26 = n25 / 2;
                n26 = n18 - n26;
                n10 = n21 - n24;
                view.layout(n10, n26, n21, n25 += n26);
                n20 = actionMenuView$LayoutParams.leftMargin;
                n24 = n24 + n20 + n19;
                n21 -= n24;
            }
            return;
        }
        for (n14 = 0; n14 < n17; n14 += n16) {
            view = actionMenuView.getChildAt(n14);
            actionMenuView$LayoutParams = (ActionMenuView$LayoutParams)view.getLayoutParams();
            n24 = view.getVisibility();
            if (n24 == n15 || (n24 = (int)(actionMenuView$LayoutParams.a ? 1 : 0)) != 0) continue;
            n24 = actionMenuView$LayoutParams.leftMargin;
            n21 += n24;
            n24 = view.getMeasuredWidth();
            n25 = view.getMeasuredHeight();
            n26 = n25 / 2;
            n26 = n18 - n26;
            n10 = n21 + n24;
            view.layout(n21, n26, n10, n25 += n26);
            n20 = actionMenuView$LayoutParams.rightMargin;
            n21 = n24 = n24 + n20 + n19 + n21;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onMeasure(int var1_1, int var2_2) {
        block66: {
            block64: {
                block65: {
                    var3_3 = this;
                    var4_4 = this.h;
                    var5_5 = View.MeasureSpec.getMode((int)var1_1);
                    var6_6 = 0;
                    var7_7 = null;
                    var8_8 = 1;
                    var9_9 = 1.4E-45f;
                    var10_10 = 0x40000000;
                    if (var5_5 == var10_10) {
                        var5_5 = 1;
                        var11_11 = 1.4E-45f;
                    } else {
                        var5_5 = 0;
                        var11_11 = 0.0f;
                        var12_12 /* !! */  = null;
                    }
                    var3_3.h = var5_5;
                    if (var4_4 != var5_5) {
                        var3_3.i = 0;
                    }
                    var4_4 = View.MeasureSpec.getSize((int)var1_1);
                    var5_5 = (int)var3_3.h;
                    if (var5_5 != 0 && (var12_12 /* !! */  = var3_3.a) != null && var4_4 != (var13_13 = var3_3.i)) {
                        var3_3.i = var4_4;
                        var12_12 /* !! */ .onItemsChanged((boolean)var8_8);
                    }
                    var4_4 = this.getChildCount();
                    var5_5 = (int)var3_3.h;
                    if (var5_5 == 0 || var4_4 <= 0) break block64;
                    var4_4 = View.MeasureSpec.getMode((int)var2_2);
                    var5_5 = View.MeasureSpec.getSize((int)var1_1);
                    var13_13 = View.MeasureSpec.getSize((int)var2_2);
                    var14_14 = this.getPaddingLeft();
                    var15_15 = this.getPaddingRight() + var14_14;
                    var14_14 = this.getPaddingTop();
                    var16_16 = this.getPaddingBottom() + var14_14;
                    var17_17 = var2_2;
                    var14_14 = ViewGroup.getChildMeasureSpec((int)var2_2, (int)var16_16, (int)-2);
                    var5_5 -= var15_15;
                    var15_15 = var3_3.j;
                    var17_17 = var5_5 / var15_15;
                    var18_19 = var5_5 % var15_15;
                    if (var17_17 != 0) break block65;
                    var3_3.setMeasuredDimension(var5_5, 0);
                    break block66;
                }
                var18_19 = var18_19 / var17_17 + var15_15;
                var15_15 = this.getChildCount();
                var19_20 = 0;
                var20_21 /* !! */  = null;
                var21_22 = 0;
                var22_23 = 0;
                var23_24 = false;
                var24_25 = 0L;
                var26_26 = 0;
                var27_27 = 0;
                var28_28 = 0.0f;
                var29_29 = null;
                while (true) {
                    block68: {
                        block67: {
                            var10_10 = var3_3.k;
                            if (var22_23 >= var15_15) break;
                            var30_30 /* !! */  = var3_3.getChildAt(var22_23);
                            var6_6 = var30_30 /* !! */ .getVisibility();
                            var31_31 = var13_13;
                            var13_13 = 8;
                            if (var6_6 != var13_13) break block67;
                            var32_32 = var5_5;
                            var33_33 = var16_16;
                            break block68;
                        }
                        var6_6 = var30_30 /* !! */  instanceof ActionMenuItemView;
                        ++var19_20;
                        var13_13 = 0;
                        var34_34 /* !! */  = null;
                        if (var6_6 != 0) {
                            var30_30 /* !! */ .setPadding(var10_10, 0, var10_10, 0);
                        }
                        var35_36 = (ActionMenuView$LayoutParams)var30_30 /* !! */ .getLayoutParams();
                        var35_36.f = false;
                        var35_36.c = 0;
                        var35_36.b = 0;
                        var35_36.d = false;
                        var35_36.leftMargin = 0;
                        var35_36.rightMargin = 0;
                        if (var6_6 == 0) ** GOTO lbl-1000
                        var34_34 /* !! */  = var30_30 /* !! */ ;
                        var34_34 /* !! */  = ((ActionMenuItemView)var30_30 /* !! */ ).getText();
                        var13_13 = TextUtils.isEmpty((CharSequence)var34_34 /* !! */ ) ^ 1;
                        if (var13_13 != 0) {
                            var13_13 = 1;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var13_13 = 0;
                            var34_34 /* !! */  = null;
                        }
                        var35_36.e = var13_13;
                        var13_13 = (int)var35_36.a;
                        var13_13 = var13_13 != 0 ? 1 : var17_17;
                        var36_37 = var30_30 /* !! */ .getLayoutParams();
                        var37_38 = var19_20;
                        var20_21 /* !! */  = var36_37;
                        var20_21 /* !! */  = (ActionMenuView$LayoutParams)var36_37;
                        var33_33 = View.MeasureSpec.getSize((int)var14_14);
                        var32_32 = var5_5;
                        var5_5 = var33_33 - var16_16;
                        var33_33 = var16_16;
                        var16_16 = View.MeasureSpec.getMode((int)var14_14);
                        var5_5 = View.MeasureSpec.makeMeasureSpec((int)var5_5, (int)var16_16);
                        if (var6_6 != 0) {
                            var7_7 = var30_30 /* !! */ ;
                            var7_7 = (ActionMenuItemView)var30_30 /* !! */ ;
                        } else {
                            var6_6 = 0;
                            var7_7 = null;
                        }
                        if (var7_7 == null) ** GOTO lbl-1000
                        var7_7 = var7_7.getText();
                        var6_6 = (int)TextUtils.isEmpty((CharSequence)var7_7);
                        var16_16 = 1;
                        if ((var6_6 ^= var16_16) != 0) {
                            var6_6 = 1;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var6_6 = 0;
                            var7_7 = null;
                        }
                        if (var13_13 > 0 && (var6_6 == 0 || var13_13 >= (var16_16 = 2))) {
                            var13_13 = View.MeasureSpec.makeMeasureSpec((int)(var13_13 * var18_19), (int)(-1 << -1));
                            var30_30 /* !! */ .measure(var13_13, var5_5);
                            var13_13 = var30_30 /* !! */ .getMeasuredWidth();
                            var16_16 = var13_13 / var18_19;
                            if ((var13_13 %= var18_19) != 0) {
                                ++var16_16;
                            }
                            if (var6_6 != 0 && var16_16 < (var13_13 = 2)) {
                                var16_16 = 2;
                            }
                        } else {
                            var16_16 = 0;
                            var38_39 = null;
                        }
                        if ((var13_13 = (int)var20_21 /* !! */ .a) == 0 && var6_6 != 0) {
                            var6_6 = 1;
                        } else {
                            var6_6 = 0;
                            var7_7 = null;
                        }
                        var20_21 /* !! */ .d = var6_6;
                        var20_21 /* !! */ .b = var16_16;
                        var6_6 = var16_16 * var18_19;
                        var13_13 = 0x40000000;
                        var6_6 = View.MeasureSpec.makeMeasureSpec((int)var6_6, (int)var13_13);
                        var30_30 /* !! */ .measure(var6_6, var5_5);
                        var21_22 = Math.max(var21_22, var16_16);
                        var5_5 = (int)var35_36.d;
                        if (var5_5 != 0) {
                            ++var26_26;
                        }
                        if ((var5_5 = (int)var35_36.a) != 0) {
                            var23_24 = true;
                        }
                        var17_17 -= var16_16;
                        var5_5 = var30_30 /* !! */ .getMeasuredHeight();
                        var6_6 = var27_27;
                        var27_27 = Math.max(var27_27, var5_5);
                        var5_5 = 1;
                        var11_11 = 1.4E-45f;
                        if (var16_16 == var5_5) {
                            var6_6 = var5_5 << var22_23;
                            var39_40 = var6_6;
                            var24_25 = var39_40 = var24_25 | var39_40;
                        }
                        var19_20 = var37_38;
                    }
                    ++var22_23;
                    var13_13 = var31_31;
                    var16_16 = var33_33;
                    var5_5 = var32_32;
                    var6_6 = 0;
                    var7_7 = null;
                    var8_8 = 1;
                    var9_9 = 1.4E-45f;
                }
                var32_32 = var5_5;
                var31_31 = var13_13;
                var6_6 = var27_27;
                if (!var23_24) ** GOTO lbl-1000
                var5_5 = 2;
                var11_11 = 2.8E-45f;
                if (var19_20 == var5_5) {
                    var5_5 = 1;
                    var11_11 = 1.4E-45f;
                } else lbl-1000:
                // 2 sources

                {
                    var5_5 = 0;
                    var11_11 = 0.0f;
                    var12_12 /* !! */  = null;
                }
                var8_8 = 0;
                var9_9 = 0.0f;
                var30_30 /* !! */  = null;
                while (true) {
                    var41_41 = 1L;
                    if (var26_26 <= 0 || var17_17 <= 0) break;
                    var13_13 = -1 >>> 1;
                    var16_16 = 0;
                    var38_39 = null;
                    var43_42 = 0L;
                    for (var22_23 = 0; var22_23 < var15_15; ++var22_23) {
                        var29_29 = var3_3.getChildAt(var22_23).getLayoutParams();
                        var45_43 = var6_6;
                        var7_7 = var29_29;
                        var7_7 = (ActionMenuView$LayoutParams)var29_29;
                        var27_27 = var8_8;
                        var28_28 = var9_9;
                        var8_8 = (int)var7_7.d;
                        if (var8_8 != 0) {
                            var6_6 = var7_7.b;
                            if (var6_6 < var13_13) {
                                var43_42 = var41_41 << var22_23;
                                var13_13 = var6_6;
                                var16_16 = 1;
                            } else if (var6_6 == var13_13) {
                                var46_44 = var41_41 << var22_23;
                                var46_44 = var43_42 | var46_44;
                                ++var16_16;
                                var43_42 = var46_44;
                            }
                        }
                        var8_8 = var27_27;
                        var9_9 = var28_28;
                        var6_6 = var45_43;
                    }
                    var45_43 = var6_6;
                    var27_27 = var8_8;
                    var28_28 = var9_9;
                    var24_25 |= var43_42;
                    if (var16_16 > var17_17) {
                        var48_45 = var4_4;
lbl221:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    ++var13_13;
                    var7_7 = null;
                    for (var6_6 = 0; var6_6 < var15_15; ++var6_6) {
                        var30_30 /* !! */  = var3_3.getChildAt(var6_6);
                        var38_39 = (ActionMenuView$LayoutParams)var30_30 /* !! */ .getLayoutParams();
                        var48_45 = var4_4;
                        var4_4 = 1 << var6_6;
                        var22_23 = var14_14;
                        var49_46 = var15_15;
                        var50_47 = var4_4;
                        var41_41 = var43_42 & var50_47;
                        var52_48 = 0L;
                        cfr_temp_0 = var41_41 - var52_48;
                        if ((var4_4 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) == 0) {
                            var4_4 = var38_39.b;
                            if (var4_4 == var13_13) {
                                var24_25 |= var50_47;
                            }
                        } else {
                            if (var5_5 != 0 && (var4_4 = (int)var38_39.e) != 0) {
                                var4_4 = 1;
                                var54_49 = 1.4E-45f;
                                if (var17_17 == var4_4) {
                                    var14_14 = var10_10 + var18_19;
                                    var15_15 = 0;
                                    var30_30 /* !! */ .setPadding(var14_14, 0, var10_10, 0);
                                }
                            } else {
                                var4_4 = 1;
                                var54_49 = 1.4E-45f;
                            }
                            var38_39.b = var8_8 = var38_39.b + var4_4;
                            var38_39.f = var4_4;
                            var17_17 += -1;
                        }
                        var14_14 = var22_23;
                        var4_4 = var48_45;
                        var15_15 = var49_46;
                    }
                    var6_6 = var45_43;
                    var8_8 = 1;
                    var9_9 = 1.4E-45f;
                }
                var48_45 = var4_4;
                var45_43 = var6_6;
                var27_27 = var8_8;
                var28_28 = var9_9;
                ** while (true)
                var22_23 = var14_14;
                var49_46 = var15_15;
                var4_4 = 1;
                var54_49 = 1.4E-45f;
                if (!var23_24 && var19_20 == var4_4) {
                    var5_5 = 1;
                    var11_11 = 1.4E-45f;
                } else {
                    var5_5 = 0;
                    var11_11 = 0.0f;
                    var12_12 /* !! */  = null;
                }
                if (var17_17 <= 0 || (var10_10 = (int)((cfr_temp_1 = var24_25 - (var46_44 = 0L)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) == 0 || var17_17 >= (var19_20 -= var4_4) && var5_5 == 0 && var21_22 <= var4_4) {
                    var5_5 = var49_46;
                } else {
                    var4_4 = Long.bitCount(var24_25);
                    var54_49 = var4_4;
                    if (var5_5 == 0) {
                        var39_40 = var24_25 & var41_41;
                        var8_8 = 0x3F000000;
                        var9_9 = 0.5f;
                        var55_50 = 0L;
                        cfr_temp_2 = var39_40 - var55_50;
                        var14_14 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                        if (var14_14 != 0) {
                            var11_11 = 0.0f;
                            var7_7 = var3_3.getChildAt(0);
                            var12_12 /* !! */  = (ActionMenuView$LayoutParams)var7_7.getLayoutParams();
                            var5_5 = (int)var12_12 /* !! */ .e;
                            if (var5_5 == 0) {
                                var54_49 -= var9_9;
                            }
                        }
                        var15_15 = var49_46 + -1;
                        var5_5 = 1;
                        var11_11 = 1.4E-45f;
                        var6_6 = var5_5 << var15_15;
                        var39_40 = var6_6;
                        var55_50 = 0L;
                        cfr_temp_3 = (var39_40 = var24_25 & var39_40) - var55_50;
                        var14_14 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                        if (var14_14 != 0) {
                            var12_12 /* !! */  = (ActionMenuView$LayoutParams)var3_3.getChildAt(var15_15).getLayoutParams();
                            var5_5 = (int)var12_12 /* !! */ .e;
                            if (var5_5 == 0) {
                                var54_49 -= var9_9;
                            }
                        }
                    }
                    var11_11 = 0.0f;
                    var12_12 /* !! */  = null;
                    cfr_temp_4 = var54_49 - 0.0f;
                    var5_5 = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                    if (var5_5 > 0) {
                        var11_11 = (float)(var17_17 *= var18_19) / var54_49;
                        var13_13 = (int)var11_11;
                    } else {
                        var13_13 = 0;
                        var34_34 /* !! */  = null;
                    }
                    var5_5 = var49_46;
                    var54_49 = 0.0f;
                    var57_51 = null;
                    block5: for (var4_4 = 0; var4_4 < var5_5; ++var4_4) {
                        var6_6 = 1;
                        var8_8 = var6_6 << var4_4;
                        var46_44 = var8_8;
                        var50_47 = 0L;
                        cfr_temp_5 = (var46_44 = var24_25 & var46_44) - var50_47;
                        var10_10 = (int)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                        if (var10_10 == 0) {
                            var6_6 = 1;
                            var10_10 = 2;
                            continue;
                        }
                        var7_7 = var3_3.getChildAt(var4_4);
                        var30_30 /* !! */  = (ActionMenuView$LayoutParams)var7_7.getLayoutParams();
                        var6_6 = var7_7 instanceof ActionMenuItemView;
                        if (var6_6 != 0) {
                            var30_30 /* !! */ .c = var13_13;
                            var6_6 = 1;
                            var30_30 /* !! */ .f = var6_6;
                            if (var4_4 == 0 && (var6_6 = (int)var30_30 /* !! */ .e) == 0) {
                                var6_6 = -var13_13;
                                var10_10 = 2;
                                var30_30 /* !! */ .leftMargin = var6_6 /= var10_10;
                            } else {
                                var10_10 = 2;
                            }
                            var6_6 = 1;
lbl348:
                            // 2 sources

                            while (true) {
                                var27_27 = 1;
                                var28_28 = 1.4E-45f;
                                continue block5;
                                break;
                            }
                        }
                        var10_10 = 2;
                        var6_6 = (int)var30_30 /* !! */ .a;
                        if (var6_6 != 0) {
                            var30_30 /* !! */ .c = var13_13;
                            var6_6 = 1;
                            var30_30 /* !! */ .f = var6_6;
                            var30_30 /* !! */ .rightMargin = var16_16 = -var13_13 / var10_10;
                            ** continue;
                        }
                        var6_6 = 1;
                        if (var4_4 != 0) {
                            var30_30 /* !! */ .leftMargin = var16_16 = var13_13 / 2;
                        }
                        if (var4_4 == (var16_16 = var5_5 + -1)) continue;
                        var30_30 /* !! */ .rightMargin = var16_16 = var13_13 / 2;
                    }
                }
                var8_8 = var27_27;
                var9_9 = var28_28;
                if (var27_27 != 0) {
                    var7_7 = null;
                    for (var6_6 = 0; var6_6 < var5_5; ++var6_6) {
                        var57_51 = var3_3.getChildAt(var6_6);
                        var30_30 /* !! */  = (ActionMenuView$LayoutParams)var57_51.getLayoutParams();
                        var10_10 = (int)var30_30 /* !! */ .f;
                        if (var10_10 == 0) {
                            var13_13 = var22_23;
                            var8_8 = 0x40000000;
                            var9_9 = 2.0f;
                        } else {
                            var10_10 = var30_30 /* !! */ .b * var18_19;
                            var8_8 = var30_30 /* !! */ .c;
                            var10_10 += var8_8;
                            var8_8 = 0x40000000;
                            var9_9 = 2.0f;
                            var10_10 = View.MeasureSpec.makeMeasureSpec((int)var10_10, (int)var8_8);
                            var13_13 = var22_23;
                            var57_51.measure(var10_10, var22_23);
                        }
                        var22_23 = var13_13;
                    }
                }
                var8_8 = 0x40000000;
                var9_9 = 2.0f;
                var4_4 = var48_45;
                if (var48_45 != var8_8) {
                    var5_5 = var32_32;
                    var13_13 = var45_43;
                } else {
                    var13_13 = var31_31;
                    var5_5 = var32_32;
                }
                var3_3.setMeasuredDimension(var5_5, var13_13);
                break block66;
            }
            var17_18 = var2_2;
            var34_35 = null;
            for (var13_13 = 0; var13_13 < var4_4; ++var13_13) {
                var12_12 /* !! */  = (ActionMenuView$LayoutParams)var3_3.getChildAt(var13_13).getLayoutParams();
                var6_6 = 0;
                var7_7 = null;
                var12_12 /* !! */ .rightMargin = 0;
                var12_12 /* !! */ .leftMargin = 0;
            }
            super.onMeasure(var1_1, var2_2);
        }
    }

    public void setExpandedActionViewsExclusive(boolean bl2) {
        this.e.r = bl2;
    }

    public void setMenuCallbacks(h$a h$a, d$a d$a) {
        this.f = h$a;
        this.g = d$a;
    }

    public void setOnMenuItemClickListener(ActionMenuView$d actionMenuView$d) {
        this.l = actionMenuView$d;
    }

    public void setOverflowIcon(Drawable drawable2) {
        this.getMenu();
        ActionMenuPresenter actionMenuPresenter = this.e;
        ActionMenuPresenter$c actionMenuPresenter$c = actionMenuPresenter.j;
        if (actionMenuPresenter$c != null) {
            actionMenuPresenter$c.setImageDrawable(drawable2);
        } else {
            boolean bl2;
            actionMenuPresenter.l = bl2 = true;
            actionMenuPresenter.k = drawable2;
        }
    }

    public void setOverflowReserved(boolean bl2) {
        this.d = bl2;
    }

    public void setPopupTheme(int n3) {
        int n4 = this.c;
        if (n4 != n3) {
            this.c = n3;
            if (n3 == 0) {
                Context context;
                this.b = context = this.getContext();
            } else {
                Context context = this.getContext();
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, n3);
                this.b = contextThemeWrapper;
            }
        }
    }

    public void setPresenter(ActionMenuPresenter object) {
        this.e = object;
        ((a)object).h = this;
        this.a = object = ((a)object).c;
    }
}

