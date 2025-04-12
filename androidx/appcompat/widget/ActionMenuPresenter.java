/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Parcelable
 *  android.util.DisplayMetrics
 *  android.util.SparseBooleanArray
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.ActionMenuItemView$b;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.d$b;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h$a;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.i$a;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable;
import androidx.appcompat.widget.ActionMenuPresenter$SavedState;
import androidx.appcompat.widget.ActionMenuPresenter$a;
import androidx.appcompat.widget.ActionMenuPresenter$b;
import androidx.appcompat.widget.ActionMenuPresenter$c;
import androidx.appcompat.widget.ActionMenuPresenter$d;
import androidx.appcompat.widget.ActionMenuPresenter$e;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ActionMenuView$LayoutParams;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;

public final class ActionMenuPresenter
extends a
implements Q2$a {
    public ActionMenuPresenter$c j;
    public Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public final SparseBooleanArray s;
    public ActionMenuPresenter$d t;
    public ActionMenuPresenter$a u;
    public ActionMenuPresenter$OpenOverflowRunnable v;
    public ActionMenuPresenter$b w;
    public final ActionMenuPresenter$e x;
    public int y;

    public ActionMenuPresenter(Context object) {
        int n3 = R$layout.abc_action_menu_layout;
        int n4 = R$layout.abc_action_menu_item_layout;
        this.a = object;
        object = LayoutInflater.from((Context)object);
        this.d = object;
        this.f = n3;
        this.g = n4;
        this.s = object;
        super(this);
        this.x = object;
    }

    public final View a(f object, View object2, ViewGroup viewGroup) {
        boolean bl2;
        int n3;
        boolean bl3;
        Object object3 = object.getActionView();
        int n4 = 0;
        if (object3 == null || (bl3 = object.e())) {
            boolean bl4 = object2 instanceof i$a;
            if (bl4) {
                object2 = (i$a)object2;
            } else {
                n3 = this.g;
                object3 = this.d;
                object2 = (i$a)object3.inflate(n3, viewGroup, false);
            }
            object2.initialize((f)object, 0);
            object3 = (ActionMenuView)this.h;
            Object object4 = object2;
            object4 = (ActionMenuItemView)object2;
            ((ActionMenuItemView)object4).setItemInvoker((d$b)object3);
            object3 = this.w;
            if (object3 == null) {
                object3 = new ActionMenuPresenter$b(this);
                this.w = object3;
            }
            object3 = this.w;
            ((ActionMenuItemView)object4).setPopupCallback((ActionMenuItemView$b)object3);
            object3 = object2;
            object3 = (View)object2;
        }
        if (bl2 = object.C) {
            n4 = 8;
        }
        object3.setVisibility(n4);
        viewGroup = (ActionMenuView)viewGroup;
        object = object3.getLayoutParams();
        viewGroup.getClass();
        n3 = object instanceof ActionMenuView$LayoutParams;
        if (n3 == 0) {
            object = ActionMenuView.e((ViewGroup.LayoutParams)object);
            object3.setLayoutParams((ViewGroup.LayoutParams)object);
        }
        return object3;
    }

    public final boolean b() {
        i i3;
        Object object = this.v;
        boolean bl2 = true;
        if (object != null && (i3 = this.h) != null) {
            ((View)i3).removeCallbacks((Runnable)object);
            this.v = null;
            return bl2;
        }
        object = this.t;
        if (object != null) {
            boolean bl3 = ((g)object).b();
            if (bl3) {
                object = ((g)object).j;
                object.dismiss();
            }
            return bl2;
        }
        return false;
    }

    public final boolean c() {
        boolean bl2;
        ActionMenuPresenter$d actionMenuPresenter$d = this.t;
        if (actionMenuPresenter$d != null && (bl2 = actionMenuPresenter$d.b())) {
            bl2 = true;
        } else {
            bl2 = false;
            actionMenuPresenter$d = null;
        }
        return bl2;
    }

    public final void d(boolean bl2) {
        if (bl2) {
            h$a h$a = this.e;
            if (h$a != null) {
                d d2 = this.c;
                h$a.a(d2);
            }
        } else {
            d d5 = this.c;
            if (d5 != null) {
                Object var3_5 = null;
                d5.close(false);
            }
        }
    }

    public final boolean e() {
        Object object;
        Object object2;
        boolean bl2 = this.m;
        if (bl2 && !(bl2 = this.c()) && (object2 = this.c) != null && (object = this.h) != null && (object = this.v) == null && !(bl2 = ((ArrayList)(object2 = ((d)object2).getNonActionItems())).isEmpty())) {
            object = this.b;
            d d2 = this.c;
            ActionMenuPresenter$c actionMenuPresenter$c = this.j;
            object2 = new ActionMenuPresenter$d(this, (Context)object, d2, (View)actionMenuPresenter$c);
            this.v = object = new ActionMenuPresenter$OpenOverflowRunnable(this, (ActionMenuPresenter$d)object2);
            ((View)this.h).post((Runnable)object);
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean flagActionItems() {
        var1_1 = this;
        var2_2 = this.c;
        var3_3 = 0;
        if (var2_2 != null) {
            var2_2 = var2_2.getVisibleItems();
            var4_4 = var2_2.size();
        } else {
            var2_2 = null;
            var4_4 = 0;
        }
        var5_5 = var1_1.q;
        var6_6 = var1_1.p;
        var7_7 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        var8_8 = (ViewGroup)var1_1.h;
        var9_9 = 0;
        var10_10 = false;
        var11_11 = null;
        var12_12 = 0;
        var13_13 = null;
        var14_14 = 0;
        while (true) {
            var15_15 = 2;
            var16_16 = 1;
            if (var9_9 >= var4_4) break;
            var17_17 = (f)var2_2.get(var9_9);
            var3_3 = var17_17.y;
            var18_18 = var3_3 & 2;
            if (var18_18 == var15_15) {
                ++var12_12;
            } else {
                var18_18 = var3_3 & 1;
                if (var18_18 == var16_16) {
                    ++var14_14;
                } else {
                    var10_10 = true;
                }
            }
            var18_18 = (int)var1_1.r;
            if (var18_18 != 0 && (var18_18 = (int)var17_17.C) != 0) {
                var5_5 = 0;
            }
            ++var9_9;
            var3_3 = 0;
        }
        var18_18 = var1_1.m;
        if (var18_18 != 0 && (var10_10 || (var14_14 += var12_12) > var5_5)) {
            var5_5 += -1;
        }
        var5_5 -= var12_12;
        var19_19 = var1_1.s;
        var19_19.clear();
        var9_9 = 0;
        for (var3_3 = 0; var3_3 < var4_4; ++var3_3) {
            var11_11 = (f)var2_2.get(var3_3);
            var12_12 = var11_11.y;
            var14_14 = var12_12 & 2;
            var14_14 = var14_14 == var15_15 ? 1 : 0;
            var20_20 = var11_11.b;
            if (var14_14 != 0) {
                var14_14 = 0;
                var13_13 = var1_1.a(var11_11, null, var8_8);
                var13_13.measure(var7_7, var7_7);
                var12_12 = var13_13.getMeasuredWidth();
                var6_6 -= var12_12;
                if (var9_9 == 0) {
                    var9_9 = var12_12;
                }
                if (var20_20 != 0) {
                    var19_19.put(var20_20, (boolean)var16_16);
                }
                var11_11.h((boolean)var16_16);
lbl65:
                // 2 sources

                while (true) {
                    var12_12 = 0;
                    var13_13 = null;
                    break;
                }
            } else {
                if ((var12_12 &= 1) == var16_16) {
                    var12_12 = (int)var19_19.get(var20_20);
                    var14_14 = (var5_5 > 0 || var12_12 != 0) && var6_6 > 0 ? 1 : 0;
                    var15_15 = 0;
                    if (var14_14 != 0) {
                        var21_21 = var1_1.a(var11_11, null, var8_8);
                        var21_21.measure(var7_7, var7_7);
                        var16_16 = var21_21.getMeasuredWidth();
                        var6_6 -= var16_16;
                        if (var9_9 == 0) {
                            var9_9 = var16_16;
                        }
                        if ((var16_16 = var6_6 + var9_9) > 0) {
                            var16_16 = 1;
                        } else {
                            var16_16 = 0;
                            var21_21 = null;
                        }
                        var14_14 &= var16_16;
                    }
                    if (var14_14 != 0 && var20_20 != 0) {
                        var16_16 = 1;
                        var19_19.put(var20_20, (boolean)var16_16);
                    } else if (var12_12 != 0) {
                        var19_19.put(var20_20, false);
                        var13_13 = null;
                        for (var12_12 = 0; var12_12 < var3_3; ++var12_12) {
                            var21_21 = (f)var2_2.get(var12_12);
                            var15_15 = var21_21.b;
                            if (var15_15 == var20_20) {
                                var15_15 = (int)var21_21.f();
                                if (var15_15 != 0) {
                                    ++var5_5;
                                }
                                var15_15 = 0;
                                var21_21.h(false);
                            }
                            var15_15 = 0;
                        }
                    }
                    if (var14_14 != 0) {
                        var5_5 += -1;
                    }
                    var11_11.h((boolean)var14_14);
                    ** continue;
                }
                var12_12 = 0;
                var13_13 = null;
                var11_11.h(false);
            }
            var15_15 = 2;
            var16_16 = 1;
        }
        return true;
    }

    public final void initForMenu(Context object, d d2) {
        int n3;
        this.b = object;
        LayoutInflater.from((Context)object);
        this.c = d2;
        d2 = object.getResources();
        object = M2.a((Context)object);
        int n4 = this.n;
        if (n4 == 0) {
            this.m = n4 = 1;
        }
        Object object2 = ((M2)object).a.getResources().getDisplayMetrics();
        this.o = n4 = ((DisplayMetrics)object2).widthPixels / 2;
        this.q = n3 = ((M2)object).b();
        n3 = this.o;
        n4 = (int)(this.m ? 1 : 0);
        ActionMenuPresenter$c actionMenuPresenter$c = null;
        if (n4 != 0) {
            object2 = this.j;
            if (object2 == null) {
                Context context = this.a;
                object2 = new ActionMenuPresenter$c(this, context);
                this.j = object2;
                boolean bl2 = this.l;
                if (bl2) {
                    context = this.k;
                    ((AppCompatImageView)((Object)object2)).setImageDrawable((Drawable)context);
                    this.k = null;
                    this.l = false;
                }
                n4 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                actionMenuPresenter$c = this.j;
                actionMenuPresenter$c.measure(n4, n4);
            }
            object2 = this.j;
            n4 = object2.getMeasuredWidth();
            n3 -= n4;
        } else {
            this.j = null;
        }
        this.p = n3;
        float cfr_ignored_0 = d2.getDisplayMetrics().density;
    }

    public final void onCloseMenu(d d2, boolean bl2) {
        boolean bl3;
        this.b();
        Object object = this.u;
        if (object != null && (bl3 = ((g)object).b())) {
            object = ((g)object).j;
            object.dismiss();
        }
        if ((object = this.e) != null) {
            object.onCloseMenu(d2, bl2);
        }
    }

    public final void onRestoreInstanceState(Parcelable object) {
        d d2;
        boolean bl2 = object instanceof ActionMenuPresenter$SavedState;
        if (!bl2) {
            return;
        }
        object = (ActionMenuPresenter$SavedState)object;
        int n3 = object.a;
        if (n3 > 0 && (object = (d2 = this.c).findItem(n3)) != null) {
            object = (j)object.getSubMenu();
            this.onSubMenuSelected((j)object);
        }
    }

    public final Parcelable onSaveInstanceState() {
        int n3;
        ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
        actionMenuPresenter$SavedState.a = n3 = this.y;
        return actionMenuPresenter$SavedState;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean onSubMenuSelected(j object) {
        block15: {
            int n3;
            Object object2;
            block14: {
                void var2_7;
                int n4;
                MenuItem menuItem;
                d d2;
                Object object3;
                block13: {
                    int n7;
                    boolean bl3 = ((d)object).hasVisibleItems();
                    if (!bl3) {
                        return false;
                    }
                    object2 = object;
                    while ((object3 = ((j)object2).getParentMenu()) != (d2 = this.c)) {
                        object2 = (j)((j)object2).getParentMenu();
                    }
                    object2 = ((j)object2).getItem();
                    object3 = (ViewGroup)this.h;
                    d2 = null;
                    if (object3 != null) {
                        n3 = object3.getChildCount();
                        menuItem = null;
                        for (int i3 = 0; i3 < n3; i3 += 1) {
                            View view = object3.getChildAt(i3);
                            boolean bl2 = view instanceof i$a;
                            if (!bl2) continue;
                            Object object4 = view;
                            object4 = ((i$a)view).getItemData();
                            if (object4 != object2) continue;
                            d2 = view;
                            break;
                        }
                    }
                    if (d2 == null) {
                        return false;
                    }
                    object2 = ((j)object).getItem();
                    this.y = n7 = object2.getItemId();
                    int n8 = ((d)object).size();
                    n4 = 0;
                    object3 = null;
                    while (true) {
                        n3 = 1;
                        if (n4 >= n8) break;
                        menuItem = ((d)object).getItem(n4);
                        boolean bl4 = menuItem.isVisible();
                        if (bl4 && (menuItem = menuItem.getIcon()) != null) {
                            boolean bl5 = true;
                            break block13;
                        }
                        ++n4;
                    }
                    boolean bl6 = false;
                    object2 = null;
                }
                menuItem = this.b;
                object3 = new ActionMenuPresenter$a(this, (Context)menuItem, (j)object, (View)d2);
                this.u = object3;
                ((g)object3).h = var2_7;
                object3 = ((g)object3).j;
                if (object3 != null) {
                    ((eo1_1)object3).e((boolean)var2_7);
                }
                if ((n4 = (int)(((g)(object2 = this.u)).b() ? 1 : 0)) != 0) break block14;
                object3 = ((g)object2).f;
                if (object3 == null) break block15;
                ((g)object2).d(0, 0, false, false);
            }
            if ((object2 = this.e) != null) {
                object2.a((d)object);
            }
            return n3 != 0;
        }
        object = new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        throw object;
    }

    public final void updateMenuView(boolean n3) {
        ActionMenuPresenter$c actionMenuPresenter$c;
        int n4;
        Q2 q2;
        int n7;
        Object object = (ViewGroup)this.h;
        boolean bl2 = false;
        Object object2 = null;
        int n8 = 0;
        ActionMenuView$LayoutParams actionMenuView$LayoutParams = null;
        if (object != null) {
            int n10;
            Object object3 = this.c;
            if (object3 != null) {
                ((d)object3).flagActionItems();
                object3 = this.c.getVisibleItems();
                n7 = ((ArrayList)object3).size();
                q2 = null;
                n10 = 0;
                for (int i3 = 0; i3 < n7; ++i3) {
                    Object object4;
                    f f5 = (f)((ArrayList)object3).get(i3);
                    boolean bl3 = f5.f();
                    if (!bl3) continue;
                    View view = object.getChildAt(n10);
                    boolean bl4 = view instanceof i$a;
                    if (bl4) {
                        object4 = view;
                        object4 = ((i$a)view).getItemData();
                    } else {
                        bl4 = false;
                        object4 = null;
                    }
                    View view2 = this.a(f5, view, (ViewGroup)object);
                    if (f5 != object4) {
                        view2.setPressed(false);
                        view2.jumpDrawablesToCurrentState();
                    }
                    if (view2 != view) {
                        f5 = (ViewGroup)view2.getParent();
                        if (f5 != null) {
                            f5.removeView(view2);
                        }
                        f5 = (ViewGroup)this.h;
                        f5.addView(view2, n10);
                    }
                    ++n10;
                }
            } else {
                n10 = 0;
            }
            while (n10 < (n4 = object.getChildCount())) {
                object3 = object.getChildAt(n10);
                if (object3 == (actionMenuPresenter$c = this.j)) {
                    ++n10;
                    continue;
                }
                object.removeViewAt(n10);
            }
        }
        ((View)this.h).requestLayout();
        object = this.c;
        if (object != null) {
            object = ((d)object).getActionItems();
            n4 = ((ArrayList)object).size();
            actionMenuPresenter$c = null;
            for (n7 = 0; n7 < n4; ++n7) {
                q2 = ((f)((ArrayList)object).get((int)n7)).A;
                if (q2 == null) continue;
                q2.a = this;
            }
        }
        if ((object = this.c) != null) {
            object2 = ((d)object).getNonActionItems();
        }
        n3 = this.m;
        n4 = 1;
        if (n3 != 0 && object2 != null) {
            n3 = ((ArrayList)object2).size();
            if (n3 == n4) {
                object = (f)((ArrayList)object2).get(0);
                n3 = (int)(((f)object).C ? 1 : 0);
                n8 = n3 ^ 1;
            } else if (n3 > 0) {
                n8 = 1;
            }
        }
        if (n8 != 0) {
            object = this.j;
            if (object == null) {
                object2 = this.a;
                this.j = object = new ActionMenuPresenter$c(this, (Context)object2);
            }
            if ((object = (ViewGroup)this.j.getParent()) != (object2 = this.h)) {
                if (object != null) {
                    object2 = this.j;
                    object.removeView((View)object2);
                }
                object = (ActionMenuView)this.h;
                object2 = this.j;
                object.getClass();
                actionMenuView$LayoutParams = ActionMenuView.d();
                actionMenuView$LayoutParams.a = n4;
                object.addView((View)object2, (ViewGroup.LayoutParams)actionMenuView$LayoutParams);
            }
        } else {
            object = this.j;
            if (object != null && (object = object.getParent()) == (object2 = this.h)) {
                object2 = (ViewGroup)object2;
                object = this.j;
                object2.removeView((View)object);
            }
        }
        object = (ActionMenuView)this.h;
        bl2 = this.m;
        ((ActionMenuView)object).setOverflowReserved(bl2);
    }
}

