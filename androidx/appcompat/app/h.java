/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.util.TypedValue
 *  android.view.ContextThemeWrapper
 *  android.view.KeyCharacterMap
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.View
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.DecelerateInterpolator
 */
package androidx.appcompat.app;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$bool;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBar$a;
import androidx.appcompat.app.AppCompatDelegateImpl$d;
import androidx.appcompat.app.h$a;
import androidx.appcompat.app.h$b;
import androidx.appcompat.app.h$c;
import androidx.appcompat.app.h$d;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout$b;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$b;
import androidx.core.view.ViewCompat$c;
import java.util.ArrayList;

public final class h
extends ActionBar
implements ActionBarOverlayLayout$b {
    public static final DecelerateInterpolator A;
    public static final AccelerateInterpolator z;
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public jj0 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public h$d i;
    public h$d j;
    public P2$a k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public AD3 t;
    public boolean u;
    public boolean v;
    public final h$a w;
    public final h$b x;
    public final h$c y;

    static {
        AccelerateInterpolator accelerateInterpolator;
        z = accelerateInterpolator = new AccelerateInterpolator();
        accelerateInterpolator = new DecelerateInterpolator();
        A = accelerateInterpolator;
    }

    public h(Dialog dialog) {
        boolean bl2;
        new ArrayList();
        Object object = new ArrayList();
        this.m = object;
        this.n = 0;
        this.o = bl2 = true;
        this.s = bl2;
        this.w = object = new h$a(this);
        this.x = object = new h$b(this);
        this.y = object = new h$c(this);
        dialog = dialog.getWindow().getDecorView();
        this.B((View)dialog);
    }

    public h(boolean bl2, Activity activity) {
        View view;
        boolean bl3;
        new ArrayList();
        Object object = new ArrayList();
        this.m = object;
        this.n = 0;
        this.o = bl3 = true;
        this.s = bl3;
        this.w = object = new h$a(this);
        this.x = object = new h$b(this);
        this.y = object = new h$c(this);
        view = view.getWindow().getDecorView();
        this.B(view);
        if (!bl2) {
            View view2;
            int n3 = 0x1020002;
            this.g = view2 = view.findViewById(n3);
        }
    }

    public final void A(boolean bl2) {
        Object object;
        Object object2;
        boolean bl3;
        zd3_1 zd3_12 = null;
        if (bl2) {
            bl3 = this.r;
            if (!bl3) {
                this.r = bl3 = true;
                object2 = this.c;
                if (object2 != null) {
                    ((ActionBarOverlayLayout)object2).setShowingForActionMode(bl3);
                }
                this.E(false);
            }
        } else {
            bl3 = this.r;
            if (bl3) {
                this.r = false;
                object = this.c;
                if (object != null) {
                    ((ActionBarOverlayLayout)object).setShowingForActionMode(false);
                }
                this.E(false);
            }
        }
        object = this.d;
        bl3 = object.isLaidOut();
        int n3 = 8;
        int n4 = 4;
        if (bl3) {
            long l2;
            zd3_1 zd3_13;
            long l3 = 200L;
            long l4 = 100;
            if (bl2) {
                zd3_13 = this.e.h(n4, l4);
                object = this.f;
                zd3_12 = ((z0)((Object)object)).e(0, l3);
            } else {
                zd3_12 = this.e.h(0, l3);
                zd3_13 = this.f.e(n3, l4);
            }
            object = new AD3();
            object2 = ((AD3)object).a;
            ((ArrayList)object2).add(zd3_13);
            zd3_13 = (View)zd3_13.a.get();
            if (zd3_13 != null) {
                zd3_13 = zd3_13.animate();
                l2 = zd3_13.getDuration();
            } else {
                l2 = 0L;
            }
            zd3_13 = (View)zd3_12.a.get();
            if (zd3_13 != null) {
                zd3_13 = zd3_13.animate();
                zd3_13.setStartDelay(l2);
            }
            ((ArrayList)object2).add(zd3_12);
            ((AD3)object).b();
        } else if (bl2) {
            this.e.setVisibility(n4);
            ActionBarContextView actionBarContextView = this.f;
            actionBarContextView.setVisibility(0);
        } else {
            this.e.setVisibility(0);
            ActionBarContextView actionBarContextView = this.f;
            actionBarContextView.setVisibility(n3);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void B(View object) {
        Object object2;
        block14: {
            Object object3;
            boolean bl2;
            block13: {
                block12: {
                    int n3;
                    int bl3 = R$id.decor_content_parent;
                    object2 = (ActionBarOverlayLayout)object.findViewById(bl3);
                    this.c = object2;
                    if (object2 != null) {
                        ((ActionBarOverlayLayout)object2).setActionBarVisibilityCallback(this);
                    }
                    if (!(bl2 = (object2 = object.findViewById(n3 = R$id.action_bar)) instanceof jj0)) break block12;
                    object2 = (jj0)object2;
                    break block13;
                }
                bl2 = object2 instanceof Toolbar;
                if (!bl2) break block14;
                object2 = ((Toolbar)object2).getWrapper();
            }
            this.e = object2;
            int n4 = R$id.action_context_bar;
            object2 = (ActionBarContextView)object.findViewById(n4);
            this.f = object2;
            int n7 = R$id.action_bar_container;
            object = (ActionBarContainer)object.findViewById(n7);
            this.d = object;
            object2 = this.e;
            if (object2 != null && (object3 = this.f) != null && object != null) {
                int n8;
                int n10;
                void var6_15;
                object = object2.getContext();
                this.a = object;
                object = this.e;
                int n14 = object.o() & 4;
                boolean bl3 = true;
                float f5 = Float.MIN_VALUE;
                bl2 = false;
                object3 = null;
                if (n14 != 0) {
                    boolean bl4 = true;
                } else {
                    boolean bl5 = false;
                    object = null;
                }
                if (var6_15 != false) {
                    this.h = bl3;
                }
                Object object4 = M2.a(this.a);
                ApplicationInfo applicationInfo = ((M2)object4).a.getApplicationInfo();
                int n15 = applicationInfo.targetSdkVersion;
                this.e.getClass();
                object = ((M2)object4).a.getResources();
                int n16 = R$bool.abc_action_bar_embed_tabs;
                boolean bl6 = object.getBoolean(n16);
                this.D(bl6);
                object = this.a;
                object4 = R$styleable.ActionBar;
                n15 = R$attr.actionBarStyle;
                object = object.obtainStyledAttributes(null, (int[])object4, n15, 0);
                n16 = R$styleable.ActionBar_hideOnContentScroll;
                n16 = (int)(object.getBoolean(n16, false) ? 1 : 0);
                if (n16 != 0) {
                    object4 = this.c;
                    n15 = (int)(((ActionBarOverlayLayout)object4).g ? 1 : 0);
                    if (n15 != 0) {
                        this.v = bl3;
                        ((ActionBarOverlayLayout)object4).setHideOnContentScrollEnabled(bl3);
                    } else {
                        object = new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                        throw object;
                    }
                }
                if ((n10 = object.getDimensionPixelSize(n8 = R$styleable.ActionBar_elevation, 0)) != 0) {
                    f5 = n10;
                    object3 = this.d;
                    object4 = ViewCompat.a;
                    ViewCompat$c.m((View)object3, f5);
                }
                object.recycle();
                return;
            }
            object2 = h.class.getSimpleName().concat(" can only be used with a compatible window decor layout");
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object2 = object2 != null ? object2.getClass().getSimpleName() : "null";
        object2 = "Can't make a decor toolbar out of ".concat((String)object2);
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public final void C(int n3, int n4) {
        jj0 jj02 = this.e;
        int n7 = jj02.o();
        int n8 = n4 & 4;
        if (n8 != 0) {
            n8 = 1;
            this.h = n8;
        }
        jj0 jj03 = this.e;
        n3 &= n4;
        n4 = ~n4 & n7;
        jj03.g(n3 |= n4);
    }

    public final void D(boolean bl2) {
        if (!bl2) {
            this.e.l();
            ActionBarContainer actionBarContainer = this.d;
            actionBarContainer.setTabContainer(null);
        } else {
            this.d.setTabContainer(null);
            jj0 jj02 = this.e;
            jj02.l();
        }
        this.e.getClass();
        this.e.j(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void E(boolean object) {
        Object object2;
        float f5;
        int n3 = this.p;
        boolean bl2 = this.q;
        boolean bl3 = this.r;
        Object object3 = null;
        int n4 = 1;
        if (!bl3 && (n3 != 0 || bl2)) {
            n3 = 0;
            f5 = 0.0f;
            object2 = null;
        } else {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        }
        View view = this.g;
        long l2 = 250L;
        bl3 = false;
        xD3 xD32 = null;
        int n7 = 1065353216;
        float f6 = 1.0f;
        h$c h$c = this.y;
        if (n3 != 0) {
            Object object4;
            n3 = this.s;
            if (n3 != 0) return;
            this.s = n4;
            object2 = this.t;
            if (object2 != null) {
                ((AD3)object2).a();
            }
            object2 = this.d;
            ((ActionBarContainer)((Object)object2)).setVisibility(0);
            n3 = this.n;
            h$b h$b = this.x;
            if (n3 == 0 && ((n3 = (int)(this.u ? 1 : 0)) != 0 || object)) {
                this.d.setTranslationY(0.0f);
                object2 = this.d;
                n3 = -object2.getHeight();
                f5 = n3;
                if (object) {
                    object4 = new int[]{0, 0};
                    object3 = this.d;
                    object3.getLocationInWindow((int[])object4);
                    ActionBarContainer actionBarContainer = object4[n4];
                    float f7 = (float)actionBarContainer;
                    f5 -= f7;
                }
                this.d.setTranslationY(f5);
                object4 = new AD3();
                object3 = ViewCompat.a((View)this.d);
                ((zd3_1)object3).e(0.0f);
                Object object5 = (View)((zd3_1)object3).a.get();
                if (object5 != null) {
                    if (h$c != null) {
                        xD32 = new xD3(h$c, (View)object5);
                    }
                    object5 = object5.animate();
                    object5.setUpdateListener((ValueAnimator.AnimatorUpdateListener)xD32);
                }
                bl3 = ((AD3)object4).e;
                object5 = ((AD3)object4).a;
                if (!bl3) {
                    ((ArrayList)object5).add(object3);
                }
                if ((bl3 = this.o) && view != null) {
                    view.setTranslationY(f5);
                    object2 = ViewCompat.a(view);
                    ((zd3_1)object2).e(0.0f);
                    bl2 = ((AD3)object4).e;
                    if (!bl2) {
                        ((ArrayList)object5).add(object2);
                    }
                }
                object2 = A;
                bl2 = ((AD3)object4).e;
                if (!bl2) {
                    ((AD3)object4).c = object2;
                }
                if (!bl2) {
                    ((AD3)object4).b = l2;
                }
                if (!bl2) {
                    ((AD3)object4).d = h$b;
                }
                this.t = object4;
                ((AD3)object4).b();
            } else {
                this.d.setAlpha(f6);
                object4 = this.d;
                object4.setTranslationY(0.0f);
                boolean bl4 = this.o;
                if (bl4 && view != null) {
                    view.setTranslationY(0.0f);
                }
                h$b.onAnimationEnd();
            }
            object4 = this.c;
            if (object4 == null) return;
            object2 = ViewCompat.a;
            ViewCompat$b.c((View)object4);
            return;
        }
        n3 = this.s;
        if (n3 == 0) return;
        this.s = false;
        object2 = this.t;
        if (object2 != null) {
            ((AD3)object2).a();
        }
        n3 = this.n;
        h$a h$a = this.w;
        if (n3 == 0 && ((n3 = (int)(this.u ? 1 : 0)) != 0 || object)) {
            boolean bl5;
            Object object6;
            this.d.setAlpha(f6);
            this.d.setTransitioning(n4 != 0);
            object2 = new AD3();
            ActionBarContainer actionBarContainer = this.d;
            n7 = -actionBarContainer.getHeight();
            f6 = n7;
            if (object) {
                object6 = new int[]{0, 0};
                object3 = this.d;
                object3.getLocationInWindow((int[])object6);
                Object object7 = object6[n4];
                float f8 = (float)object7;
                f6 -= f8;
            }
            object6 = ViewCompat.a((View)this.d);
            ((zd3_1)object6).e(f6);
            object3 = (View)((zd3_1)object6).a.get();
            if (object3 != null) {
                if (h$c != null) {
                    xD32 = new xD3(h$c, (View)object3);
                }
                object3 = object3.animate();
                object3.setUpdateListener((ValueAnimator.AnimatorUpdateListener)xD32);
            }
            bl3 = ((AD3)object2).e;
            object3 = ((AD3)object2).a;
            if (!bl3) {
                ((ArrayList)object3).add(object6);
            }
            if ((bl5 = this.o) && view != null) {
                object6 = ViewCompat.a(view);
                ((zd3_1)object6).e(f6);
                bl2 = ((AD3)object2).e;
                if (!bl2) {
                    ((ArrayList)object3).add(object6);
                }
            }
            object6 = z;
            bl2 = ((AD3)object2).e;
            if (!bl2) {
                ((AD3)object2).c = object6;
            }
            if (!bl2) {
                ((AD3)object2).b = l2;
            }
            if (!bl2) {
                ((AD3)object2).d = h$a;
            }
            this.t = object2;
            ((AD3)object2).b();
            return;
        }
        h$a.onAnimationEnd();
    }

    public final boolean b() {
        boolean bl2;
        jj0 jj02 = this.e;
        if (jj02 != null && (bl2 = jj02.f())) {
            this.e.collapseActionView();
            return true;
        }
        return false;
    }

    public final void c(boolean n3) {
        int n4 = this.l;
        if (n3 == n4) {
            return;
        }
        this.l = n3;
        ArrayList arrayList = this.m;
        n4 = arrayList.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            ActionBar$a actionBar$a = (ActionBar$a)arrayList.get(i3);
            actionBar$a.a();
        }
    }

    public final int d() {
        return this.e.o();
    }

    public final Context e() {
        Context context = this.b;
        if (context == null) {
            context = new TypedValue();
            Resources.Theme theme = this.a.getTheme();
            int n3 = R$attr.actionBarWidgetTheme;
            boolean bl2 = true;
            theme.resolveAttribute(n3, (TypedValue)context, bl2);
            int n4 = context.resourceId;
            if (n4 != 0) {
                Context context2 = this.a;
                theme = new ContextThemeWrapper(context2, n4);
                this.b = theme;
            } else {
                this.b = context = this.a;
            }
        }
        return this.b;
    }

    public final void f() {
        boolean bl2 = this.p;
        if (!bl2) {
            this.p = true;
            bl2 = false;
            this.E(false);
        }
    }

    public final void h() {
        Resources resources = M2.a((Context)this.a).a.getResources();
        int n3 = R$bool.abc_action_bar_embed_tabs;
        boolean bl2 = resources.getBoolean(n3);
        this.D(bl2);
    }

    /*
     * WARNING - void declaration
     */
    public final boolean j(int n3, KeyEvent keyEvent) {
        Object object = this.i;
        if (object == null) {
            return false;
        }
        object = ((h$d)object).d;
        if (object != null) {
            void var4_6;
            if (keyEvent != null) {
                int bl3 = keyEvent.getDeviceId();
            } else {
                int n4 = -1;
            }
            KeyCharacterMap keyCharacterMap = KeyCharacterMap.load((int)var4_6);
            boolean bl2 = keyCharacterMap.getKeyboardType();
            boolean bl3 = true;
            if (bl2 == bl3) {
                bl3 = false;
            }
            object.setQwertyMode(bl3);
            return object.performShortcut(n3, keyEvent, 0);
        }
        return false;
    }

    public final void m(boolean bl2) {
        boolean bl3 = this.h;
        if (!bl3) {
            this.n(bl2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void n(boolean bl2) {
        void var1_4;
        int n3 = 4;
        if (bl2) {
            int n4 = 4;
        } else {
            boolean bl3 = false;
        }
        this.C((int)var1_4, n3);
    }

    public final void o() {
        this.e.g(16);
    }

    public final void p() {
        int n3 = 2;
        this.C(n3, n3);
    }

    public final void q() {
        this.C(0, 8);
    }

    public final void r() {
        this.C(0, 1);
    }

    public final void s(int n3) {
        this.e.i(n3);
    }

    public final void t(String string2) {
        this.e.p(string2);
    }

    public final void u(int n3) {
        this.e.n(n3);
    }

    public final void v(Drawable drawable2) {
        this.e.q(drawable2);
    }

    public final void w(boolean bl2) {
        AD3 aD3;
        this.u = bl2;
        if (!bl2 && (aD3 = this.t) != null) {
            aD3.a();
        }
    }

    public final void x(String string2) {
        this.e.setTitle(string2);
    }

    public final void y(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    public final P2 z(AppCompatDelegateImpl$d object) {
        Object object2 = this.i;
        if (object2 != null) {
            ((h$d)object2).a();
        }
        object2 = this.c;
        boolean bl2 = false;
        ((ActionBarOverlayLayout)object2).setHideOnContentScrollEnabled(false);
        this.f.h();
        Object object3 = this.f.getContext();
        object2 = new h$d(this, (Context)object3, (AppCompatDelegateImpl$d)object);
        object = ((h$d)object2).d;
        ((d)object).stopDispatchingItemsChanged();
        try {
            object3 = ((h$d)object2).e;
            bl2 = object3.c((P2)object2, (Menu)object);
            if (bl2) {
                this.i = object2;
                ((h$d)object2).g();
                this.f.f((P2)object2);
                this.A(true);
                return object2;
            }
            return null;
        }
        finally {
            ((d)object).startDispatchingItemsChanged();
        }
    }
}

