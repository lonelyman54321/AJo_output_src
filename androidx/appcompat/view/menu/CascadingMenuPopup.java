/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Parcelable
 *  android.view.Gravity
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.FrameLayout
 *  android.widget.HeaderViewListAdapter
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  android.widget.TextView
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.CascadingMenuPopup$1;
import androidx.appcompat.view.menu.CascadingMenuPopup$a;
import androidx.appcompat.view.menu.CascadingMenuPopup$b;
import androidx.appcompat.view.menu.CascadingMenuPopup$c;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h$a;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.MenuPopupWindow$a;
import androidx.appcompat.widget.MenuPopupWindow$b;
import java.util.ArrayList;
import java.util.Iterator;

public final class CascadingMenuPopup
extends eo1_1
implements View.OnKeyListener,
PopupWindow.OnDismissListener {
    public static final int B = R$layout.abc_cascading_menu_item_layout;
    public boolean A;
    public final Context b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Handler g;
    public final ArrayList h;
    public final ArrayList i;
    public final ViewTreeObserver.OnGlobalLayoutListener j;
    public final CascadingMenuPopup$a k;
    public final CascadingMenuPopup$b l;
    public int m;
    public int n;
    public View o;
    public View p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public h$a x;
    public ViewTreeObserver y;
    public PopupWindow.OnDismissListener z;

    public CascadingMenuPopup(Context context, View view, int n3, int n4, boolean bl2) {
        Object object = new ArrayList();
        this.h = object;
        object = new ArrayList();
        this.i = object;
        object = new CascadingMenuPopup$1(this);
        this.j = object;
        this.k = object = new CascadingMenuPopup$a(this);
        this.l = object = new CascadingMenuPopup$b(this);
        int n7 = 0;
        object = null;
        this.m = 0;
        this.n = 0;
        this.b = context;
        this.o = view;
        this.d = n3;
        this.e = n4;
        this.f = bl2;
        this.v = false;
        int n8 = view.getLayoutDirection();
        n3 = 1;
        if (n8 != n3) {
            n7 = 1;
        }
        this.q = n7;
        context = context.getResources();
        n8 = context.getDisplayMetrics().widthPixels / 2;
        n3 = R$dimen.abc_config_prefDialogWidth;
        int n10 = context.getDimensionPixelSize(n3);
        this.c = n10 = Math.max(n8, n10);
        this.g = context;
    }

    public final boolean a() {
        boolean bl2;
        ArrayList arrayList = this.i;
        int n3 = arrayList.size();
        boolean bl3 = false;
        if (n3 > 0 && (bl2 = (arrayList = ((CascadingMenuPopup$c)arrayList.get((int)0)).a.z).isShowing())) {
            bl3 = true;
        }
        return bl3;
    }

    public final void b(d d2) {
        Object object = this.b;
        d2.addMenuPresenter(this, (Context)object);
        boolean bl2 = this.a();
        if (bl2) {
            this.k(d2);
        } else {
            object = this.h;
            ((ArrayList)object).add(d2);
        }
    }

    public final void d(View view) {
        View view2 = this.o;
        if (view2 != view) {
            this.o = view;
            int n3 = this.m;
            int n4 = view.getLayoutDirection();
            this.n = n4 = Gravity.getAbsoluteGravity((int)n3, (int)n4);
        }
    }

    public final void dismiss() {
        CascadingMenuPopup$c[] cascadingMenuPopup$cArray = this.i;
        int n3 = cascadingMenuPopup$cArray.size();
        if (n3 > 0) {
            Object object = new CascadingMenuPopup$c[n3];
            cascadingMenuPopup$cArray = cascadingMenuPopup$cArray.toArray((T[])object);
            n3 += -1;
            while (n3 >= 0) {
                object = cascadingMenuPopup$cArray[n3];
                PopupWindow popupWindow = ((CascadingMenuPopup$c)object).a.z;
                boolean bl2 = popupWindow.isShowing();
                if (bl2) {
                    object = ((CascadingMenuPopup$c)object).a;
                    ((ListPopupWindow)object).dismiss();
                }
                n3 += -1;
            }
        }
    }

    public final void e(boolean bl2) {
        this.v = bl2;
    }

    public final void f(int n3) {
        int n4 = this.m;
        if (n4 != n3) {
            this.m = n3;
            View view = this.o;
            n4 = view.getLayoutDirection();
            this.n = n3 = Gravity.getAbsoluteGravity((int)n3, (int)n4);
        }
    }

    public final boolean flagActionItems() {
        return false;
    }

    public final void g(int n3) {
        this.r = true;
        this.t = n3;
    }

    public final void h(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    public final void i(boolean bl2) {
        this.w = bl2;
    }

    public final void j(int n3) {
        this.s = true;
        this.u = n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void k(d var1_1) {
        block49: {
            block48: {
                block47: {
                    block46: {
                        var2_2 = this;
                        var3_3 = var1_1;
                        var4_4 /* !! */  = this.b;
                        var5_5 = LayoutInflater.from((Context)var4_4 /* !! */ );
                        var7_7 = this.f;
                        var8_8 = CascadingMenuPopup.B;
                        var6_6 = new c(var1_1, var5_5, (boolean)var7_7, var8_8);
                        var7_7 = this.a();
                        var9_9 = 1;
                        if (var7_7 == 0 && (var7_7 = this.v) != 0) {
                            var6_6.c = var9_9;
                        } else {
                            var7_7 = this.a();
                            if (var7_7 != 0) {
                                block43: {
                                    var7_7 = var1_1.size();
                                    var11_11 = null;
                                    for (var10_10 = 0; var10_10 < var7_7; var10_10 += var9_9) {
                                        var12_12 /* !! */  = var3_3.getItem(var10_10);
                                        var13_13 = (int)var12_12 /* !! */ .isVisible();
                                        if (var13_13 == 0 || (var12_12 /* !! */  = var12_12 /* !! */ .getIcon()) == null) continue;
                                        var7_7 = 1;
                                        break block43;
                                    }
                                    var7_7 = 0;
                                }
                                var6_6.c = var7_7;
                            }
                        }
                        var7_7 = var2_2.c;
                        var7_7 = eo1_1.c((ListAdapter)var6_6, var4_4 /* !! */ , var7_7);
                        var14_14 /* !! */  = var2_2.d;
                        var13_13 = var2_2.e;
                        var15_15 = 0;
                        var16_16 = null;
                        var11_11 = new ListPopupWindow(var4_4 /* !! */ , null, var14_14 /* !! */ , var13_13);
                        var4_4 /* !! */  = var11_11.z;
                        var12_12 /* !! */  = var2_2.l;
                        var11_11.D = var12_12 /* !! */ ;
                        var11_11.p = var2_2;
                        var4_4 /* !! */ .setOnDismissListener((PopupWindow.OnDismissListener)var2_2);
                        var12_12 /* !! */  = var2_2.o;
                        var11_11.o = var12_12 /* !! */ ;
                        var11_11.l = var14_14 /* !! */  = var2_2.n;
                        var11_11.y = var9_9;
                        var4_4 /* !! */ .setFocusable((boolean)var9_9);
                        var14_14 /* !! */  = 2;
                        var4_4 /* !! */ .setInputMethodMode(var14_14 /* !! */ );
                        var11_11.m((ListAdapter)var6_6);
                        var11_11.p(var7_7);
                        var11_11.l = var17_17 = var2_2.n;
                        var6_6 = var2_2.i;
                        var13_13 = var6_6.size();
                        if (var13_13 > 0) {
                            block44: {
                                var18_18 = (CascadingMenuPopup$c)pp_0.a(var9_9, (ArrayList)var6_6);
                                var19_19 = var18_18.b;
                                var20_20 = var19_19.size();
                                for (var21_21 /* !! */  = 0; var21_21 /* !! */  < var20_20; var21_21 /* !! */  += var9_9) {
                                    var22_22 = var19_19.getItem(var21_21 /* !! */ );
                                    var23_23 = var22_22.hasSubMenu();
                                    if (!var23_23 || var3_3 != (var12_12 /* !! */  = var22_22.getSubMenu())) {
                                        var14_14 /* !! */  = 2;
                                        continue;
                                    }
                                    break block44;
                                }
                                var24_24 = false;
                                var22_22 = null;
                            }
                            if (var22_22 == null) {
                                var8_8 = 0;
                                var25_25 = null;
                            } else {
                                block45: {
                                    var12_12 /* !! */  = var18_18.a.c;
                                    var19_19 = var12_12 /* !! */ .getAdapter();
                                    var20_20 = var19_19 instanceof HeaderViewListAdapter;
                                    if (var20_20 != 0) {
                                        var19_19 = (HeaderViewListAdapter)var19_19;
                                        var20_20 = var19_19.getHeadersCount();
                                        var19_19 = (c)var19_19.getWrappedAdapter();
                                    } else {
                                        var19_19 = (c)var19_19;
                                        var20_20 = 0;
                                        var26_26 = null;
                                    }
                                    var21_21 /* !! */  = var19_19.getCount();
                                    var16_16 = null;
                                    for (var15_15 = 0; var15_15 < var21_21 /* !! */ ; var15_15 += var9_9) {
                                        var25_25 = var19_19.c(var15_15);
                                        if (var22_22 != var25_25) continue;
                                        var8_8 = -1;
                                        break block45;
                                    }
                                    var8_8 = -1;
                                    var15_15 = -1;
                                }
                                if (var15_15 == var8_8) {
                                    while (true) {
                                        var8_8 = 0;
                                        var25_25 = null;
                                        break;
                                    }
                                } else {
                                    var15_15 += var20_20;
                                    if ((var15_15 -= (var8_8 = var12_12 /* !! */ .getFirstVisiblePosition())) < 0 || var15_15 >= (var8_8 = var12_12 /* !! */ .getChildCount())) ** continue;
                                    var25_25 = var12_12 /* !! */ .getChildAt(var15_15);
                                }
                            }
                        } else {
                            var8_8 = 0;
                            var25_25 = null;
                            var13_13 = 0;
                            var18_18 = null;
                        }
                        if (var25_25 == null) break block48;
                        var14_14 /* !! */  = Build.VERSION.SDK_INT;
                        var15_15 = 28;
                        if (var14_14 /* !! */  <= var15_15) {
                            var12_12 /* !! */  = MenuPopupWindow.E;
                            if (var12_12 /* !! */  != null) {
                                try {
                                    var16_16 = new Object[var9_9];
                                }
                                catch (Exception v0) {}
                                var19_19 = Boolean.FALSE;
                                var20_20 = 0;
                                var26_26 = null;
                                var16_16[0] = var19_19;
                                var12_12 /* !! */ .invoke((Object)var4_4 /* !! */ , (Object[])var16_16);
                            }
                        } else {
                            var14_14 /* !! */  = 0;
                            var12_12 /* !! */  = null;
                            MenuPopupWindow$b.a((PopupWindow)var4_4 /* !! */ , false);
                        }
                        if ((var14_14 /* !! */  = Build.VERSION.SDK_INT) >= (var15_15 = 23)) {
                            var15_15 = 0;
                            var16_16 = null;
                            MenuPopupWindow$a.a((PopupWindow)var4_4 /* !! */ , null);
                        }
                        var4_4 /* !! */  = ((CascadingMenuPopup$c)pp_0.a((int)var9_9, (ArrayList)var6_6)).a.c;
                        var15_15 = 2;
                        var19_19 = new int[var15_15];
                        var4_4 /* !! */ .getLocationOnScreen((int[])var19_19);
                        var16_16 = new Rect();
                        var26_26 = var2_2.p;
                        var26_26.getWindowVisibleDisplayFrame(var16_16);
                        var20_20 = var2_2.q;
                        if (var20_20 == var9_9) {
                            var27_27 /* !! */  = var19_19[0];
                            var28_28 = (reference)(var4_4 /* !! */ .getWidth() + var27_27 /* !! */  + var7_7);
                            if (var28_28 > (var15_15 = var16_16.right)) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    var28_28 = (reference)false;
                                    var4_4 /* !! */  = null;
                                    break block46;
                                    break;
                                }
                            }
lbl145:
                            // 3 sources

                            while (true) {
                                var28_28 = (reference)true;
                                break block46;
                                break;
                            }
                        }
                        ** while ((var28_28 = var19_19[0] - var7_7) >= 0)
lbl149:
                        // 1 sources

                        ** while (true)
                    }
                    if (var28_28 == var9_9) {
                        var20_20 = 1;
                    } else {
                        var20_20 = 0;
                        var26_26 = null;
                    }
                    var2_2.q = (int)var28_28;
                    var28_28 = (reference)26;
                    var15_15 = 5;
                    if (var14_14 /* !! */  >= var28_28) {
                        var11_11.o = var25_25;
                        var28_28 = (reference)false;
                        var4_4 /* !! */  = null;
                        var27_27 /* !! */  = (reference)false;
                        var19_19 = null;
                    } else {
                        var28_28 = (reference)2;
                        var12_12 /* !! */  = (MenuItem)new int[var28_28];
                        var19_19 = var2_2.o;
                        var19_19.getLocationOnScreen((int[])var12_12 /* !! */ );
                        var4_4 /* !! */  = (Context)new int[var28_28];
                        var25_25.getLocationOnScreen((int[])var4_4 /* !! */ );
                        var27_27 /* !! */  = (reference)(var2_2.n & 7);
                        if (var27_27 /* !! */  == var15_15) {
                            var27_27 /* !! */  = (reference)false;
                            var19_19 = null;
                            var21_21 /* !! */  = (int)var12_12 /* !! */ [0];
                            var22_22 = var2_2.o;
                            var24_24 = var22_22.getWidth() + var21_21 /* !! */ ;
                            var12_12 /* !! */ [0] = (MenuItem)var24_24;
                            var21_21 /* !! */  = (int)var4_4 /* !! */ [0];
                            var24_24 = var25_25.getWidth() + var21_21 /* !! */ ;
                            var4_4 /* !! */ [0] = (Context)var24_24;
                        } else {
                            var27_27 /* !! */  = (reference)false;
                            var19_19 = null;
                        }
                        var21_21 /* !! */  = (int)var4_4 /* !! */ [0];
                        var24_24 = var12_12 /* !! */ [0];
                        var27_27 /* !! */  = (reference)(var21_21 /* !! */  - var24_24);
                        var28_28 = var4_4 /* !! */ [var9_9];
                        var14_14 /* !! */  = (int)var12_12 /* !! */ [var9_9];
                        var28_28 -= var14_14 /* !! */ ;
                    }
                    var14_14 /* !! */  = var2_2.n & var15_15;
                    if (var14_14 /* !! */  != var15_15) ** GOTO lbl201
                    if (var20_20 != 0) {
                        var27_27 /* !! */  += var7_7;
                    } else {
                        var7_7 = var25_25.getWidth();
                        while (true) {
                            var27_27 /* !! */  -= var7_7;
                            break block47;
                            break;
                        }
lbl201:
                        // 1 sources

                        if (var20_20 == 0) ** continue;
                        var7_7 = var25_25.getWidth();
                        var27_27 /* !! */  += var7_7;
                    }
                }
                var11_11.f = (int)var27_27 /* !! */ ;
                var11_11.k = var9_9;
                var11_11.j = var9_9;
                var11_11.h((int)var28_28);
                break block49;
            }
            var28_29 = var2_2.r;
            if (var28_29 != 0) {
                var11_11.f = var28_29 = var2_2.t;
            }
            if ((var28_29 = (int)var2_2.s) != 0) {
                var28_29 = var2_2.u;
                var11_11.h(var28_29);
            }
            if ((var4_4 /* !! */  = var2_2.a) != null) {
                var16_16 = new Rect((Rect)var4_4 /* !! */ );
            } else {
                var15_15 = 0;
                var16_16 = null;
            }
            var11_11.x = var16_16;
        }
        var7_7 = var2_2.q;
        var4_4 /* !! */  = new CascadingMenuPopup$c(var11_11, (d)var3_3, var7_7);
        var6_6.add(var4_4 /* !! */ );
        var11_11.show();
        var4_4 /* !! */  = var11_11.c;
        var4_4 /* !! */ .setOnKeyListener((View.OnKeyListener)var2_2);
        if (var18_18 == null && (var17_17 = (int)var2_2.w) != 0 && (var6_6 = var1_1.getHeaderTitle()) != null) {
            var17_17 = R$layout.abc_popup_menu_header_item_layout;
            var7_7 = 0;
            var5_5 = (FrameLayout)var5_5.inflate(var17_17, (ViewGroup)var4_4 /* !! */ , false);
            var17_17 = 16908310;
            var6_6 = (TextView)var5_5.findViewById(var17_17);
            var5_5.setEnabled(false);
            var3_3 = var1_1.getHeaderTitle();
            var6_6.setText((CharSequence)var3_3);
            var3_3 = null;
            var4_4 /* !! */ .addHeaderView((View)var5_5, null, false);
            var11_11.show();
        }
    }

    public final ListView n() {
        Object object = this.i;
        int n3 = (int)(object.isEmpty() ? 1 : 0);
        if (n3 != 0) {
            object = null;
        } else {
            n3 = 1;
            object = ((CascadingMenuPopup$c)pp_0.a((int)n3, (ArrayList)object)).a.c;
        }
        return object;
    }

    public final void onCloseMenu(d d2, boolean bl2) {
        int n3;
        Object object;
        d d5;
        int n4;
        d d7;
        int n7;
        ArrayList arrayList;
        block17: {
            arrayList = this.i;
            n7 = arrayList.size();
            d7 = null;
            for (n4 = 0; n4 < n7; n4 += 1) {
                d5 = ((CascadingMenuPopup$c)arrayList.get((int)n4)).b;
                if (d2 != d5) {
                    continue;
                }
                break block17;
            }
            n4 = -1;
        }
        if (n4 < 0) {
            return;
        }
        n7 = n4 + 1;
        int n8 = arrayList.size();
        if (n7 < n8) {
            object = ((CascadingMenuPopup$c)arrayList.get((int)n7)).b;
            ((d)object).close(false);
        }
        object = (CascadingMenuPopup$c)arrayList.remove(n4);
        d7 = ((CascadingMenuPopup$c)object).b;
        d7.removeMenuPresenter(this);
        n4 = (int)(this.A ? 1 : 0);
        n8 = 0;
        d5 = null;
        object = ((CascadingMenuPopup$c)object).a;
        if (n4) {
            n4 = Build.VERSION.SDK_INT;
            n3 = 23;
            if (n4 >= n3) {
                d7 = ((ListPopupWindow)object).z;
                MenuPopupWindow$a.b((PopupWindow)d7, null);
            } else {
                object.getClass();
            }
            d7 = ((ListPopupWindow)object).z;
            d7.setAnimationStyle(0);
        }
        ((ListPopupWindow)object).dismiss();
        n7 = arrayList.size();
        n4 = 1;
        if (n7 > 0) {
            n3 = n7 + -1;
            CascadingMenuPopup$c cascadingMenuPopup$c = (CascadingMenuPopup$c)arrayList.get(n3);
            n3 = cascadingMenuPopup$c.c;
            this.q = n3;
        } else {
            View view = this.o;
            n3 = view.getLayoutDirection();
            if (n3 == n4) {
                n3 = 0;
                view = null;
            } else {
                n3 = 1;
            }
            this.q = n3;
        }
        if (!n7) {
            this.dismiss();
            Object object2 = this.x;
            if (object2 != null) {
                object2.onCloseMenu(d2, n4 != 0);
            }
            if ((d2 = this.y) != null) {
                boolean bl3 = d2.isAlive();
                if (bl3) {
                    d2 = this.y;
                    object2 = this.j;
                    d2.removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object2);
                }
                this.y = null;
            }
            d2 = this.p;
            object2 = this.k;
            d2.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)object2);
            d2 = this.z;
            d2.onDismiss();
        } else if (bl2) {
            d2 = ((CascadingMenuPopup$c)arrayList.get((int)0)).b;
            d2.close(false);
        }
    }

    public final void onDismiss() {
        CascadingMenuPopup$c cascadingMenuPopup$c;
        Object object;
        block3: {
            object = this.i;
            int n3 = ((ArrayList)object).size();
            for (int i3 = 0; i3 < n3; ++i3) {
                cascadingMenuPopup$c = (CascadingMenuPopup$c)((ArrayList)object).get(i3);
                PopupWindow popupWindow = cascadingMenuPopup$c.a.z;
                boolean bl2 = popupWindow.isShowing();
                if (bl2) {
                    continue;
                }
                break block3;
            }
            cascadingMenuPopup$c = null;
        }
        if (cascadingMenuPopup$c != null) {
            object = cascadingMenuPopup$c.b;
            ((d)object).close(false);
        }
    }

    public final boolean onKey(View view, int n3, KeyEvent keyEvent) {
        int n4;
        int n7 = keyEvent.getAction();
        if (n7 == (n4 = 1) && n3 == (n7 = 82)) {
            this.dismiss();
            return n4 != 0;
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    public final Parcelable onSaveInstanceState() {
        return null;
    }

    public final boolean onSubMenuSelected(j j3) {
        boolean bl2;
        Object object;
        block3: {
            CascadingMenuPopup$c cascadingMenuPopup$c;
            d d2;
            object = this.i.iterator();
            do {
                boolean bl3 = object.hasNext();
                bl2 = true;
                if (!bl3) break block3;
                cascadingMenuPopup$c = (CascadingMenuPopup$c)object.next();
            } while (j3 != (d2 = cascadingMenuPopup$c.b));
            cascadingMenuPopup$c.a.c.requestFocus();
            return bl2;
        }
        boolean bl4 = j3.hasVisibleItems();
        if (bl4) {
            this.b(j3);
            object = this.x;
            if (object != null) {
                object.a(j3);
            }
            return bl2;
        }
        return false;
    }

    public final void setCallback(h$a h$a) {
        this.x = h$a;
    }

    public final void show() {
        boolean bl2;
        boolean bl3 = this.a();
        if (bl3) {
            return;
        }
        ArrayList arrayList = this.h;
        Object object = arrayList.iterator();
        while (bl2 = object.hasNext()) {
            d d2 = (d)object.next();
            this.k(d2);
        }
        arrayList.clear();
        arrayList = this.o;
        this.p = arrayList;
        if (arrayList != null) {
            boolean bl4;
            object = this.y;
            if (object == null) {
                bl4 = true;
            } else {
                bl4 = false;
                object = null;
            }
            arrayList = arrayList.getViewTreeObserver();
            this.y = arrayList;
            if (bl4) {
                object = this.j;
                arrayList.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object);
            }
            arrayList = this.p;
            object = this.k;
            arrayList.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
        }
    }

    public final void updateMenuView(boolean bl2) {
        boolean bl3;
        Iterator iterator = this.i.iterator();
        while (bl3 = iterator.hasNext()) {
            Object object = ((CascadingMenuPopup$c)iterator.next()).a.c.getAdapter();
            boolean bl4 = object instanceof HeaderViewListAdapter;
            object = bl4 ? (c)((HeaderViewListAdapter)object).getWrappedAdapter() : (c)((Object)object);
            object.notifyDataSetChanged();
        }
    }
}

