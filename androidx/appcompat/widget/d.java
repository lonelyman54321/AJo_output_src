/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window$Callback
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.h$a;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d$a;
import androidx.core.view.ViewCompat;

public final class d
implements jj0 {
    public final Toolbar a;
    public int b;
    public ScrollingTabContainerView c;
    public final View d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public CharSequence i;
    public final CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public boolean m;
    public ActionMenuPresenter n;
    public final int o;
    public final Drawable p;

    public d(Toolbar toolbar, boolean n3) {
        Object object;
        boolean bl2;
        int n4 = R$string.abc_action_bar_up_description;
        this.o = 0;
        this.a = toolbar;
        Object object2 = toolbar.getTitle();
        this.i = object2;
        object2 = toolbar.getSubtitle();
        this.j = object2;
        object2 = this.i;
        if (object2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        this.h = bl2;
        object2 = toolbar.getNavigationIcon();
        this.g = object2;
        object2 = toolbar.getContext();
        Object object3 = R$styleable.ActionBar;
        int n7 = R$attr.actionBarStyle;
        int n8 = 0;
        object2 = Tn3.f((Context)object2, null, object3, n7, 0);
        int n10 = R$styleable.ActionBar_homeAsUpIndicator;
        object3 = ((Tn3)object2).b(n10);
        this.p = (Drawable)object3;
        if (n3 != 0) {
            View view;
            object3 = ((Tn3)object2).b;
            n3 = R$styleable.ActionBar_title;
            object = object3.getText(n3);
            n7 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            if (n7 == 0) {
                this.setTitle((CharSequence)object);
            }
            if ((n7 = (int)(TextUtils.isEmpty((CharSequence)(object = object3.getText(n3 = R$styleable.ActionBar_subtitle))) ? 1 : 0)) == 0) {
                this.j = object;
                n7 = this.b & 8;
                if (n7 != 0) {
                    toolbar.setSubtitle((CharSequence)object);
                }
            }
            if ((object = ((Tn3)object2).b(n3 = R$styleable.ActionBar_logo)) != null) {
                this.f = object;
                this.s();
            }
            if ((object = ((Tn3)object2).b(n3 = R$styleable.ActionBar_icon)) != null) {
                this.setIcon((Drawable)object);
            }
            if ((object = this.g) == null && (object = this.p) != null) {
                this.q((Drawable)object);
            }
            n3 = R$styleable.ActionBar_displayOptions;
            n3 = object3.getInt(n3, 0);
            this.g(n3);
            n3 = R$styleable.ActionBar_customNavigationLayout;
            n3 = object3.getResourceId(n3, 0);
            if (n3 != 0) {
                object = LayoutInflater.from((Context)toolbar.getContext()).inflate(n3, (ViewGroup)toolbar, false);
                view = this.d;
                if (view != null && (n8 = this.b & 0x10) != 0) {
                    toolbar.removeView(view);
                }
                this.d = object;
                if (object != null && (n7 = this.b & 0x10) != 0) {
                    toolbar.addView((View)object);
                }
                n3 = this.b | 0x10;
                this.g(n3);
            }
            n3 = R$styleable.ActionBar_height;
            if ((n3 = object3.getLayoutDimension(n3, 0)) > 0) {
                view = toolbar.getLayoutParams();
                view.height = n3;
                toolbar.setLayoutParams((ViewGroup.LayoutParams)view);
            }
            n3 = R$styleable.ActionBar_contentInsetStart;
            n7 = -1;
            n3 = object3.getDimensionPixelOffset(n3, n7);
            n8 = R$styleable.ActionBar_contentInsetEnd;
            n7 = object3.getDimensionPixelOffset(n8, n7);
            if (n3 >= 0 || n7 >= 0) {
                n3 = Math.max(n3, 0);
                n7 = Math.max(n7, 0);
                toolbar.setContentInsetsRelative(n3, n7);
            }
            n3 = R$styleable.ActionBar_titleTextStyle;
            if ((n3 = object3.getResourceId(n3, 0)) != 0) {
                view = toolbar.getContext();
                toolbar.setTitleTextAppearance((Context)view, n3);
            }
            n3 = R$styleable.ActionBar_subtitleTextStyle;
            if ((n3 = object3.getResourceId(n3, 0)) != 0) {
                view = toolbar.getContext();
                toolbar.setSubtitleTextAppearance((Context)view, n3);
            }
            n3 = R$styleable.ActionBar_popupTheme;
            if ((n3 = object3.getResourceId(n3, 0)) != 0) {
                toolbar.setPopupTheme(n3);
            }
        } else {
            object = toolbar.getNavigationIcon();
            if (object != null) {
                this.p = object = toolbar.getNavigationIcon();
                n3 = 15;
            } else {
                n3 = 11;
            }
            this.b = n3;
        }
        ((Tn3)object2).g();
        n3 = this.o;
        if (n4 != n3) {
            this.o = n4;
            object = toolbar.getNavigationContentDescription();
            n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            if (n3 != 0) {
                n3 = this.o;
                this.i(n3);
            }
        }
        object = toolbar.getNavigationContentDescription();
        this.k = object;
        super(this);
        toolbar.setNavigationOnClickListener((View.OnClickListener)object);
    }

    public final boolean a() {
        return this.a.canShowOverflowMenu();
    }

    public final boolean b() {
        return this.a.hideOverflowMenu();
    }

    public final boolean c() {
        return this.a.showOverflowMenu();
    }

    public final void collapseActionView() {
        this.a.collapseActionView();
    }

    public final boolean d() {
        return this.a.isOverflowMenuShowing();
    }

    public final boolean e() {
        return this.a.isOverflowMenuShowPending();
    }

    public final boolean f() {
        return this.a.hasExpandedActionView();
    }

    public final void g(int n3) {
        int n4 = this.b ^ n3;
        this.b = n3;
        if (n4 != 0) {
            View view;
            Object object;
            Toolbar toolbar;
            int n7 = n4 & 4;
            if (n7 != 0) {
                n7 = n3 & 4;
                if (n7 != 0) {
                    this.r();
                }
                n7 = this.b & 4;
                toolbar = this.a;
                if (n7 != 0) {
                    object = this.g;
                    if (object == null) {
                        object = this.p;
                    }
                    toolbar.setNavigationIcon((Drawable)object);
                } else {
                    toolbar.setNavigationIcon(null);
                }
            }
            if ((n7 = n4 & 3) != 0) {
                this.s();
            }
            n7 = n4 & 8;
            toolbar = this.a;
            if (n7 != 0) {
                n7 = n3 & 8;
                if (n7 != 0) {
                    object = this.i;
                    toolbar.setTitle((CharSequence)object);
                    object = this.j;
                    toolbar.setSubtitle((CharSequence)object);
                } else {
                    toolbar.setTitle(null);
                    toolbar.setSubtitle(null);
                }
            }
            if ((n4 &= 0x10) != 0 && (view = this.d) != null) {
                if ((n3 &= 0x10) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final Context getContext() {
        return this.a.getContext();
    }

    public final CharSequence getTitle() {
        return this.a.getTitle();
    }

    public final zd3_1 h(int n3, long l2) {
        zd3_1 zd3_12 = ViewCompat.a((View)this.a);
        float f5 = n3 == 0 ? 1.0f : 0.0f;
        zd3_12.a(f5);
        zd3_12.c(l2);
        d$a d$a = new d$a(this, n3);
        zd3_12.d(d$a);
        return zd3_12;
    }

    public final void i(int n3) {
        String string2;
        if (n3 == 0) {
            n3 = 0;
            string2 = null;
        } else {
            Context context = this.a.getContext();
            string2 = context.getString(n3);
        }
        this.p(string2);
    }

    public final void j(boolean bl2) {
        this.a.setCollapsible(bl2);
    }

    public final void k() {
        this.a.dismissPopupMenus();
    }

    public final void l() {
        Toolbar toolbar;
        ScrollingTabContainerView scrollingTabContainerView = this.c;
        if (scrollingTabContainerView != null && (scrollingTabContainerView = scrollingTabContainerView.getParent()) == (toolbar = this.a)) {
            scrollingTabContainerView = this.c;
            toolbar.removeView((View)scrollingTabContainerView);
        }
        this.c = null;
    }

    public final void m(int n3) {
        Drawable drawable2;
        if (n3 != 0) {
            Context context = this.a.getContext();
            drawable2 = xn.a(context, n3);
        } else {
            n3 = 0;
            drawable2 = null;
        }
        this.f = drawable2;
        this.s();
    }

    public final void n(int n3) {
        Drawable drawable2;
        if (n3 != 0) {
            Context context = this.a.getContext();
            drawable2 = xn.a(context, n3);
        } else {
            n3 = 0;
            drawable2 = null;
        }
        this.q(drawable2);
    }

    public final int o() {
        return this.b;
    }

    public final void p(String string2) {
        this.k = string2;
        this.r();
    }

    public final void q(Drawable drawable2) {
        this.g = drawable2;
        int n3 = this.b & 4;
        Toolbar toolbar = this.a;
        if (n3 != 0) {
            if (drawable2 == null) {
                drawable2 = this.p;
            }
            toolbar.setNavigationIcon(drawable2);
        } else {
            drawable2 = null;
            toolbar.setNavigationIcon(null);
        }
    }

    public final void r() {
        int n3 = this.b & 4;
        if (n3 != 0) {
            CharSequence charSequence = this.k;
            n3 = (int)(TextUtils.isEmpty((CharSequence)charSequence) ? 1 : 0);
            Toolbar toolbar = this.a;
            if (n3 != 0) {
                n3 = this.o;
                toolbar.setNavigationContentDescription(n3);
            } else {
                charSequence = this.k;
                toolbar.setNavigationContentDescription(charSequence);
            }
        }
    }

    public final void s() {
        Drawable drawable2;
        int n3 = this.b;
        int n4 = n3 & 2;
        if (n4 != 0) {
            if ((n3 &= 1) != 0) {
                drawable2 = this.f;
                if (drawable2 == null) {
                    drawable2 = this.e;
                }
            } else {
                drawable2 = this.e;
            }
        } else {
            n3 = 0;
            drawable2 = null;
        }
        this.a.setLogo(drawable2);
    }

    public final void setIcon(int n3) {
        Drawable drawable2;
        if (n3 != 0) {
            Context context = this.a.getContext();
            drawable2 = xn.a(context, n3);
        } else {
            n3 = 0;
            drawable2 = null;
        }
        this.setIcon(drawable2);
    }

    public final void setIcon(Drawable drawable2) {
        this.e = drawable2;
        this.s();
    }

    public final void setMenu(Menu menu2, h$a h$a) {
        ActionMenuPresenter actionMenuPresenter = this.n;
        Toolbar toolbar = this.a;
        if (actionMenuPresenter == null) {
            int n3;
            Context context = toolbar.getContext();
            this.n = actionMenuPresenter = new ActionMenuPresenter(context);
            actionMenuPresenter.i = n3 = R$id.action_menu_presenter;
        }
        actionMenuPresenter = this.n;
        actionMenuPresenter.e = h$a;
        menu2 = (androidx.appcompat.view.menu.d)menu2;
        toolbar.setMenu((androidx.appcompat.view.menu.d)menu2, actionMenuPresenter);
    }

    public final void setMenuPrepared() {
        this.m = true;
    }

    public final void setTitle(CharSequence charSequence) {
        this.h = true;
        this.i = charSequence;
        int n3 = this.b & 8;
        if (n3 != 0) {
            Toolbar toolbar = this.a;
            toolbar.setTitle(charSequence);
            boolean bl2 = this.h;
            if (bl2) {
                toolbar = toolbar.getRootView();
                ViewCompat.t((View)toolbar, charSequence);
            }
        }
    }

    public final void setVisibility(int n3) {
        this.a.setVisibility(n3);
    }

    public final void setWindowCallback(Window.Callback callback2) {
        this.l = callback2;
    }

    public final void setWindowTitle(CharSequence charSequence) {
        int n3 = this.h;
        if (n3 == 0) {
            this.i = charSequence;
            n3 = this.b & 8;
            if (n3 != 0) {
                Toolbar toolbar = this.a;
                toolbar.setTitle(charSequence);
                boolean bl2 = this.h;
                if (bl2) {
                    toolbar = toolbar.getRootView();
                    ViewCompat.t((View)toolbar, charSequence);
                }
            }
        }
    }
}

