/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.os.Parcelable
 *  android.view.Gravity
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.FrameLayout
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  android.widget.TextView
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.StandardMenuPopup$1;
import androidx.appcompat.view.menu.StandardMenuPopup$a;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h$a;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.MenuPopupWindow;

public final class StandardMenuPopup
extends eo1_1
implements PopupWindow.OnDismissListener,
View.OnKeyListener {
    public static final int v = R$layout.abc_popup_menu_item_layout;
    public final Context b;
    public final d c;
    public final c d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final MenuPopupWindow i;
    public final ViewTreeObserver.OnGlobalLayoutListener j;
    public final StandardMenuPopup$a k;
    public PopupWindow.OnDismissListener l;
    public View m;
    public View n;
    public h$a o;
    public ViewTreeObserver p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public boolean u;

    public StandardMenuPopup(int n3, int n4, Context context, View object, d d2, boolean bl2) {
        int n7;
        c c2;
        Object object2 = new StandardMenuPopup$1(this);
        this.j = object2;
        this.k = object2 = new StandardMenuPopup$a(this);
        this.t = 0;
        this.b = context;
        this.c = d2;
        this.e = bl2;
        object2 = LayoutInflater.from((Context)context);
        int n8 = v;
        this.d = c2 = new c(d2, (LayoutInflater)object2, bl2, n8);
        this.g = n3;
        this.h = n4;
        Resources resources = context.getResources();
        int n10 = resources.getDisplayMetrics().widthPixels / 2;
        int n14 = R$dimen.abc_config_prefDialogWidth;
        int n15 = resources.getDimensionPixelSize(n14);
        this.f = n7 = Math.max(n10, n15);
        this.m = object;
        this.i = object = new ListPopupWindow(context, null, n3, n4);
        d2.addMenuPresenter(this, context);
    }

    public final boolean a() {
        PopupWindow popupWindow;
        boolean bl2 = this.q;
        if (!bl2 && (bl2 = (popupWindow = this.i.z).isShowing())) {
            bl2 = true;
        } else {
            bl2 = false;
            popupWindow = null;
        }
        return bl2;
    }

    public final void b(d d2) {
    }

    public final void d(View view) {
        this.m = view;
    }

    public final void dismiss() {
        boolean bl2 = this.a();
        if (bl2) {
            MenuPopupWindow menuPopupWindow = this.i;
            menuPopupWindow.dismiss();
        }
    }

    public final void e(boolean bl2) {
        this.d.c = bl2;
    }

    public final void f(int n3) {
        this.t = n3;
    }

    public final boolean flagActionItems() {
        return false;
    }

    public final void g(int n3) {
        this.i.f = n3;
    }

    public final void h(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    public final void i(boolean bl2) {
        this.u = bl2;
    }

    public final void j(int n3) {
        this.i.h(n3);
    }

    public final ListView n() {
        return this.i.c;
    }

    public final void onCloseMenu(d d2, boolean bl2) {
        Object object = this.c;
        if (d2 != object) {
            return;
        }
        this.dismiss();
        object = this.o;
        if (object != null) {
            object.onCloseMenu(d2, bl2);
        }
    }

    public final void onDismiss() {
        StandardMenuPopup$a standardMenuPopup$a;
        boolean bl2;
        this.q = bl2 = true;
        this.c.close();
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null) {
            bl2 = viewTreeObserver.isAlive();
            if (!bl2) {
                this.p = viewTreeObserver = this.n.getViewTreeObserver();
            }
            viewTreeObserver = this.p;
            standardMenuPopup$a = this.j;
            viewTreeObserver.removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)standardMenuPopup$a);
            bl2 = false;
            viewTreeObserver = null;
            this.p = null;
        }
        viewTreeObserver = this.n;
        standardMenuPopup$a = this.k;
        viewTreeObserver.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)standardMenuPopup$a);
        viewTreeObserver = this.l;
        if (viewTreeObserver != null) {
            viewTreeObserver.onDismiss();
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
        block11: {
            boolean bl2;
            Object object;
            block12: {
                int n3;
                int n4;
                eo1_1 eo1_12;
                Object object2;
                int n7;
                Context context;
                View view;
                block10: {
                    boolean bl3 = j3.hasVisibleItems();
                    if (!bl3) break block11;
                    view = this.n;
                    context = this.b;
                    boolean bl4 = this.e;
                    n7 = this.g;
                    int bl22 = this.h;
                    object2 = object;
                    object = new g(n7, bl22, context, view, j3, bl4);
                    ((g)object).i = object2 = this.o;
                    eo1_12 = ((g)object).j;
                    if (eo1_12 != null) {
                        eo1_12.setCallback((h$a)object2);
                    }
                    n4 = j3.size();
                    n7 = 0;
                    eo1_12 = null;
                    while (true) {
                        bl2 = true;
                        if (n7 >= n4) break;
                        context = j3.getItem(n7);
                        n3 = context.isVisible();
                        if (n3 != 0 && (context = context.getIcon()) != null) {
                            n4 = 1;
                            break block10;
                        }
                        ++n7;
                    }
                    n4 = 0;
                    object2 = null;
                }
                ((g)object).h = n4;
                eo1_12 = ((g)object).j;
                if (eo1_12 != null) {
                    eo1_12.e(n4 != 0);
                }
                object2 = this.l;
                ((g)object).k = object2;
                this.l = null;
                this.c.close(false);
                object2 = this.i;
                n7 = ((ListPopupWindow)object2).f;
                n4 = ((ListPopupWindow)object2).k();
                int n8 = this.t;
                view = this.m;
                n3 = view.getLayoutDirection();
                n8 = Gravity.getAbsoluteGravity((int)n8, (int)n3) & 7;
                n3 = 5;
                if (n8 == n3) {
                    context = this.m;
                    n8 = context.getWidth();
                    n7 += n8;
                }
                if ((n8 = (int)(((g)object).b() ? 1 : 0)) != 0) break block12;
                context = ((g)object).f;
                if (context == null) break block11;
                ((g)object).d(n7, n4, bl2, bl2);
            }
            if ((object = this.o) != null) {
                object.a(j3);
            }
            return bl2;
        }
        return false;
    }

    public final void setCallback(h$a h$a) {
        this.o = h$a;
    }

    public final void show() {
        Object object;
        block12: {
            block11: {
                CharSequence charSequence;
                boolean bl2;
                Object object2;
                int n3;
                Object object3;
                boolean bl3;
                int n4;
                boolean bl4 = this.a();
                if (bl4) break block11;
                bl4 = this.q;
                if (bl4 || (object = this.m) == null) break block12;
                this.n = object;
                object = this.i;
                Object object4 = ((ListPopupWindow)object).z;
                object4.setOnDismissListener((PopupWindow.OnDismissListener)this);
                ((ListPopupWindow)object).p = this;
                ((ListPopupWindow)object).y = n4 = 1;
                ((ListPopupWindow)object).z.setFocusable(n4 != 0);
                View view = this.n;
                Object object5 = this.p;
                if (object5 == null) {
                    bl3 = true;
                } else {
                    bl3 = false;
                    object5 = null;
                }
                this.p = object3 = view.getViewTreeObserver();
                if (bl3) {
                    object5 = this.j;
                    object3.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object5);
                }
                object5 = this.k;
                view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object5);
                ((ListPopupWindow)object).o = view;
                ((ListPopupWindow)object).l = n3 = this.t;
                n3 = (int)(this.r ? 1 : 0);
                object5 = this.b;
                object3 = this.d;
                if (n3 == 0) {
                    n3 = this.f;
                    this.s = n3 = eo1_1.c((ListAdapter)object3, (Context)object5, n3);
                    this.r = n4;
                }
                n4 = this.s;
                ((ListPopupWindow)object).p(n4);
                ((ListPopupWindow)object).z.setInputMethodMode(2);
                object4 = this.a;
                n3 = 0;
                view = null;
                if (object4 != null) {
                    object2 = new Rect((Rect)object4);
                } else {
                    bl2 = false;
                    object2 = null;
                }
                ((ListPopupWindow)object).x = object2;
                ((ListPopupWindow)object).show();
                object4 = ((ListPopupWindow)object).c;
                object4.setOnKeyListener((View.OnKeyListener)this);
                bl2 = this.u;
                if (bl2 && (charSequence = ((d)(object2 = this.c)).getHeaderTitle()) != null) {
                    object5 = LayoutInflater.from((Context)object5);
                    int n7 = R$layout.abc_popup_menu_header_item_layout;
                    charSequence = (TextView)(object5 = (FrameLayout)object5.inflate(n7, (ViewGroup)object4, false)).findViewById(n7 = 16908310);
                    if (charSequence != null) {
                        object2 = ((d)object2).getHeaderTitle();
                        charSequence.setText((CharSequence)object2);
                    }
                    object5.setEnabled(false);
                    object4.addHeaderView((View)object5, null, false);
                }
                ((ListPopupWindow)object).m((ListAdapter)object3);
                ((ListPopupWindow)object).show();
            }
            return;
        }
        object = new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        throw object;
    }

    public final void updateMenuView(boolean bl2) {
        this.r = false;
        c c2 = this.d;
        if (c2 != null) {
            c2.notifyDataSetChanged();
        }
    }
}

