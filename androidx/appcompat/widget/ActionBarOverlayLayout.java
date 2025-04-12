/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources$Theme
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.Menu
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewPropertyAnimator
 *  android.view.Window$Callback
 *  android.view.WindowInsets
 *  android.widget.OverScroller
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.app.h;
import androidx.appcompat.view.menu.h$a;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarOverlayLayout$2;
import androidx.appcompat.widget.ActionBarOverlayLayout$3;
import androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams;
import androidx.appcompat.widget.ActionBarOverlayLayout$a;
import androidx.appcompat.widget.ActionBarOverlayLayout$b;
import androidx.appcompat.widget.ActionBarOverlayLayout$c;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$b;
import androidx.core.view.ViewCompat$c;
import androidx.core.view.f;
import androidx.core.view.f$b;
import androidx.core.view.f$c;
import androidx.core.view.f$d;
import androidx.core.view.f$e;
import androidx.core.view.f$k;
import java.util.WeakHashMap;

public class ActionBarOverlayLayout
extends ViewGroup
implements ij0,
wu1_0,
xu1_2 {
    public static final int[] C;
    public static final f D;
    public static final Rect E;
    public final yu1_0 A;
    public final ActionBarOverlayLayout$c B;
    public int a;
    public int b = 0;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public jj0 e;
    public Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public final Rect m;
    public final Rect n;
    public final Rect o;
    public final Rect p;
    public f q;
    public f r;
    public f s;
    public f t;
    public ActionBarOverlayLayout$b u;
    public OverScroller v;
    public ViewPropertyAnimator w;
    public final ActionBarOverlayLayout$a x;
    public final Runnable y;
    public final Runnable z;

    static {
        int n3 = R$attr.actionBarSize;
        Object object = new int[]{n3, 16842841};
        C = object;
        n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4) {
            object = new f$d;
            ((f$d)object)();
        } else {
            n4 = 29;
            if (n3 >= n4) {
                object = new f$c;
                ((f$c)object)();
            } else {
                object = new f$b;
                ((f$b)object)();
            }
        }
        int n7 = 1;
        ei1 ei12 = ei1.b(0, n7, 0, n7);
        ((f$e)object).g(ei12);
        D = ((f$e)object).b();
        object = new Rect();
        E = object;
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet object) {
        super(context, object);
        super();
        this.m = object;
        super();
        this.n = object;
        super();
        this.o = object;
        super();
        this.p = object;
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        object = androidx.core.view.f.b;
        this.q = object;
        this.r = object;
        this.s = object;
        this.t = object;
        super(this);
        this.x = object;
        super(this);
        this.y = object;
        super(this);
        this.z = object;
        this.j(context);
        super();
        this.A = object;
        super(context);
        object.setWillNotDraw(true);
        this.B = object;
        this.addView((View)object);
    }

    public static boolean h(View object, Rect rect, boolean n3) {
        int n4;
        object = (ActionBarOverlayLayout$LayoutParams)object.getLayoutParams();
        int n7 = object.leftMargin;
        int n8 = rect.left;
        int n10 = 1;
        if (n7 != n8) {
            object.leftMargin = n8;
            n7 = 1;
        } else {
            n7 = 0;
        }
        n8 = object.topMargin;
        int n14 = rect.top;
        if (n8 != n14) {
            object.topMargin = n14;
            n7 = 1;
        }
        if ((n8 = object.rightMargin) != (n14 = rect.right)) {
            object.rightMargin = n14;
            n7 = 1;
        }
        if (n3 != 0 && (n3 = object.bottomMargin) != (n4 = rect.bottom)) {
            object.bottomMargin = n4;
        } else {
            n10 = n7;
        }
        return n10;
    }

    public final boolean a() {
        this.k();
        return this.e.a();
    }

    public final boolean b() {
        this.k();
        return this.e.b();
    }

    public final boolean c() {
        this.k();
        return this.e.c();
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ActionBarOverlayLayout$LayoutParams;
    }

    public final boolean d() {
        this.k();
        return this.e.d();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Object object = this.f;
        if (object != null) {
            Object object2;
            object = this.d;
            int n3 = object.getVisibility();
            if (n3 == 0) {
                object = this.d;
                float f5 = object.getBottom();
                object2 = this.d;
                float f6 = object2.getTranslationY() + f5;
                f5 = 0.5f;
                n3 = (int)(f6 += f5);
            } else {
                n3 = 0;
                float f7 = 0.0f;
                object = null;
            }
            object2 = this.f;
            int n4 = this.getWidth();
            Drawable drawable2 = this.f;
            int n7 = drawable2.getIntrinsicHeight() + n3;
            object2.setBounds(0, n3, n4, n7);
            object = this.f;
            object.draw(canvas);
        }
    }

    public final boolean e() {
        this.k();
        return this.e.e();
    }

    public final void f(int n3) {
        this.k();
        int n4 = 2;
        if (n3 != n4) {
            n4 = 5;
            if (n3 != n4) {
                n4 = 109;
                if (n3 == n4) {
                    n3 = 1;
                    this.setOverlayMode(n3 != 0);
                }
            } else {
                jj0 jj02 = this.e;
                jj02.getClass();
            }
        } else {
            jj0 jj03 = this.e;
            jj03.getClass();
        }
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final void g() {
        this.k();
        this.e.k();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        int n3 = -1;
        ActionBarOverlayLayout$LayoutParams actionBarOverlayLayout$LayoutParams = new ViewGroup.MarginLayoutParams(n3, n3);
        return actionBarOverlayLayout$LayoutParams;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = this.getContext();
        ActionBarOverlayLayout$LayoutParams actionBarOverlayLayout$LayoutParams = new ActionBarOverlayLayout$LayoutParams(context, attributeSet);
        return actionBarOverlayLayout$LayoutParams;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ActionBarOverlayLayout$LayoutParams actionBarOverlayLayout$LayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        return actionBarOverlayLayout$LayoutParams;
    }

    public int getActionBarHideOffset() {
        int n3;
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            float f5 = actionBarContainer.getTranslationY();
            n3 = -((int)f5);
        } else {
            n3 = 0;
            float f6 = 0.0f;
            actionBarContainer = null;
        }
        return n3;
    }

    public int getNestedScrollAxes() {
        yu1_0 yu1_02 = this.A;
        int n3 = yu1_02.a;
        return yu1_02.b | n3;
    }

    public CharSequence getTitle() {
        this.k();
        return this.e.getTitle();
    }

    public final void i() {
        Runnable runnable2 = this.y;
        this.removeCallbacks(runnable2);
        runnable2 = this.z;
        this.removeCallbacks(runnable2);
        runnable2 = this.w;
        if (runnable2 != null) {
            runnable2.cancel();
        }
    }

    public final void j(Context context) {
        Drawable drawable2;
        int n3;
        Resources.Theme theme = this.getContext().getTheme();
        int[] nArray = C;
        theme = theme.obtainStyledAttributes(nArray);
        boolean bl2 = false;
        nArray = null;
        this.a = n3 = theme.getDimensionPixelSize(0, 0);
        n3 = 1;
        this.f = drawable2 = theme.getDrawable(n3);
        if (drawable2 == null) {
            bl2 = true;
        }
        this.setWillNotDraw(bl2);
        theme.recycle();
        theme = new OverScroller(context);
        this.v = theme;
    }

    public final void k() {
        block4: {
            Object object = this.c;
            if (object != null) break block4;
            int n3 = R$id.action_bar_activity_content;
            object = (ContentFrameLayout)this.findViewById(n3);
            this.c = object;
            n3 = R$id.action_bar_container;
            object = (ActionBarContainer)this.findViewById(n3);
            this.d = object;
            n3 = R$id.action_bar;
            object = this.findViewById(n3);
            boolean bl2 = object instanceof jj0;
            if (bl2) {
                object = (jj0)object;
            } else {
                bl2 = object instanceof Toolbar;
                if (!bl2) {
                    object = object.getClass().getSimpleName();
                    object = "Can't make a decor toolbar out of ".concat((String)object);
                    IllegalStateException illegalStateException = new IllegalStateException((String)object);
                    throw illegalStateException;
                }
                object = ((Toolbar)object).getWrapper();
            }
            this.e = object;
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets object) {
        f f5;
        this.k();
        object = androidx.core.view.f.h((View)this, (WindowInsets)object);
        int n3 = ((f)object).b();
        int n4 = ((f)object).d();
        int n7 = ((f)object).c();
        int n8 = ((f)object).a();
        Object object2 = new Rect(n3, n4, n7, n8);
        boolean bl2 = ActionBarOverlayLayout.h((View)this.d, object2, false);
        WeakHashMap weakHashMap = ViewCompat.a;
        weakHashMap = this.m;
        ViewCompat$c.b((View)this, (f)object, (Rect)weakHashMap);
        n4 = ((Rect)weakHashMap).left;
        n7 = ((Rect)weakHashMap).top;
        n8 = ((Rect)weakHashMap).right;
        int n10 = ((Rect)weakHashMap).bottom;
        object = ((f)object).a;
        this.q = f5 = ((f$k)object).l(n4, n7, n8, n10);
        f f6 = this.r;
        n4 = (int)(f6.equals(f5) ? 1 : 0);
        n7 = 1;
        if (n4 == 0) {
            object2 = this.q;
            this.r = object2;
            bl2 = true;
        }
        if ((n8 = (int)((f5 = this.n).equals(weakHashMap) ? 1 : 0)) == 0) {
            f5.set((Rect)weakHashMap);
        } else {
            n7 = (int)(bl2 ? 1 : 0);
        }
        if (n7 != 0) {
            this.requestLayout();
        }
        return ((f$k)object).a().a.c().a.b().g();
    }

    public final void onConfigurationChanged(Configuration object) {
        super.onConfigurationChanged(object);
        object = this.getContext();
        this.j((Context)object);
        object = ViewCompat.a;
        ViewCompat$b.c((View)this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i();
    }

    public final void onLayout(boolean n3, int n4, int n7, int n8, int n10) {
        n3 = this.getChildCount();
        n4 = this.getPaddingLeft();
        n7 = this.getPaddingTop();
        for (n8 = 0; n8 < n3; ++n8) {
            int n14;
            View view = this.getChildAt(n8);
            int n15 = view.getVisibility();
            if (n15 == (n14 = 8)) continue;
            ActionBarOverlayLayout$LayoutParams actionBarOverlayLayout$LayoutParams = (ActionBarOverlayLayout$LayoutParams)view.getLayoutParams();
            n14 = view.getMeasuredWidth();
            int n16 = view.getMeasuredHeight();
            int n17 = actionBarOverlayLayout$LayoutParams.leftMargin + n4;
            n15 = actionBarOverlayLayout$LayoutParams.topMargin + n7;
            view.layout(n17, n15, n14 += n17, n16 += n15);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onMeasure(int var1_1, int var2_2) {
        this.k();
        var3_3 = this.d;
        var4_4 /* !! */  = this;
        var5_5 = var1_1;
        var6_6 = var2_2;
        this.measureChildWithMargins((View)var3_3, var1_1, 0, var2_2, 0);
        var4_4 /* !! */  = (ActionBarOverlayLayout$LayoutParams)this.d.getLayoutParams();
        var3_3 = this.d;
        var7_7 = var3_3.getMeasuredWidth();
        var5_5 = var4_4 /* !! */ .leftMargin;
        var7_7 += var5_5;
        var5_5 = var4_4 /* !! */ .rightMargin;
        var7_7 += var5_5;
        var5_5 = 0;
        var8_8 /* !! */  = null;
        var7_7 = Math.max(0, var7_7);
        var9_9 = this.d.getMeasuredHeight();
        var6_6 = var4_4 /* !! */ .topMargin;
        var9_9 += var6_6;
        var10_10 = var4_4 /* !! */ .bottomMargin;
        var9_9 += var10_10;
        var10_10 = Math.max(0, var9_9);
        var11_11 = this.d;
        var9_9 = var11_11.getMeasuredState();
        var9_9 = View.combineMeasuredStates((int)0, (int)var9_9);
        var12_12 /* !! */  = ViewCompat.a;
        var6_6 = this.getWindowSystemUiVisibility() & 256;
        var13_13 = 1;
        if (var6_6 != 0) {
            var6_6 = 1;
        } else {
            var6_6 = 0;
            var12_12 /* !! */  = null;
        }
        if (var6_6 != 0) {
            var14_14 = this.a;
            var15_15 = this.h;
            if (var15_15 != 0 && (var16_16 = this.d.getTabContainer()) != null) {
                var15_15 = this.a;
                var14_14 += var15_15;
            }
        } else {
            var17_17 /* !! */  = this.d;
            var14_14 = var17_17 /* !! */ .getVisibility();
            if (var14_14 != (var15_15 = 8)) {
                var17_17 /* !! */  = this.d;
                var14_14 = var17_17 /* !! */ .getMeasuredHeight();
            } else {
                var14_14 = 0;
                var17_17 /* !! */  = null;
            }
        }
        var16_16 = this.m;
        var18_18 = this.o;
        var18_18.set((Rect)var16_16);
        var16_16 = this.q;
        this.s = var16_16;
        var15_15 = (int)this.g;
        if (var15_15 != 0 || var6_6 != 0) ** GOTO lbl-1000
        var12_12 /* !! */  = this.B;
        var16_16 = ActionBarOverlayLayout.D;
        var19_19 = this.p;
        ViewCompat$c.b((View)var12_12 /* !! */ , (f)var16_16, var19_19);
        var12_12 /* !! */  = ActionBarOverlayLayout.E;
        var6_6 = var19_19.equals((Object)var12_12 /* !! */ ) ^ var13_13;
        if (var6_6 != 0) {
            var18_18.top = var6_6 = var18_18.top + var14_14;
            var18_18.bottom = var6_6 = var18_18.bottom;
            var12_12 /* !! */  = this.s.a;
            this.s = var8_8 /* !! */  = var12_12 /* !! */ .l(0, var14_14, 0, 0);
        } else lbl-1000:
        // 2 sources

        {
            var5_5 = this.s.b();
            var6_6 = this.s.d() + var14_14;
            var17_17 /* !! */  = this.s;
            var14_14 = var17_17 /* !! */ .c();
            var16_16 = this.s;
            var15_15 = var16_16.a();
            var8_8 /* !! */  = ei1.b(var5_5, var6_6, var14_14, var15_15);
            var12_12 /* !! */  = this.s;
            var14_14 = Build.VERSION.SDK_INT;
            var15_15 = 30;
            var17_17 /* !! */  = var14_14 >= var15_15 ? new f$d((f)var12_12 /* !! */ ) : (var14_14 >= (var15_15 = 29) ? new f$c((f)var12_12 /* !! */ ) : new f$b((f)var12_12 /* !! */ ));
            var17_17 /* !! */ .g((ei1)var8_8 /* !! */ );
            this.s = var8_8 /* !! */  = var17_17 /* !! */ .b();
        }
        ActionBarOverlayLayout.h((View)this.c, var18_18, (boolean)var13_13);
        var8_8 /* !! */  = this.t;
        var12_12 /* !! */  = this.s;
        var5_5 = (int)var8_8 /* !! */ .equals(var12_12 /* !! */ );
        if (var5_5 == 0) {
            this.t = var8_8 /* !! */  = this.s;
            var12_12 /* !! */  = this.c;
            ViewCompat.b((View)var12_12 /* !! */ , (f)var8_8 /* !! */ );
        }
        var17_17 /* !! */  = this.c;
        var15_15 = var1_1;
        this.measureChildWithMargins((View)var17_17 /* !! */ , var1_1, 0, var2_2, 0);
        var8_8 /* !! */  = (ActionBarOverlayLayout$LayoutParams)this.c.getLayoutParams();
        var6_6 = this.c.getMeasuredWidth();
        var13_13 = var8_8 /* !! */ .leftMargin;
        var6_6 += var13_13;
        var13_13 = var8_8 /* !! */ .rightMargin;
        var7_7 = Math.max(var7_7, var6_6 += var13_13);
        var6_6 = this.c.getMeasuredHeight();
        var13_13 = var8_8 /* !! */ .topMargin;
        var6_6 += var13_13;
        var5_5 = var8_8 /* !! */ .bottomMargin;
        var10_10 = Math.max(var10_10, var6_6 += var5_5);
        var5_5 = this.c.getMeasuredState();
        var5_5 = View.combineMeasuredStates((int)var9_9, (int)var5_5);
        var9_9 = this.getPaddingLeft();
        var6_6 = this.getPaddingRight() + var9_9 + var7_7;
        var7_7 = this.getPaddingTop();
        var9_9 = this.getPaddingBottom() + var7_7 + var10_10;
        var10_10 = this.getSuggestedMinimumHeight();
        var10_10 = Math.max(var9_9, var10_10);
        var7_7 = this.getSuggestedMinimumWidth();
        var1_1 = View.resolveSizeAndState((int)Math.max(var6_6, var7_7), (int)var1_1, (int)var5_5);
        var7_7 = var5_5 << 16;
        var2_2 = View.resolveSizeAndState((int)var10_10, (int)var2_2, (int)var7_7);
        this.setMeasuredDimension(var1_1, var2_2);
    }

    public final boolean onNestedFling(View object, float f5, float f6, boolean bl2) {
        int n3 = this.i;
        if (n3 && bl2) {
            OverScroller overScroller = this.v;
            int n4 = (int)f6;
            int n7 = -1 << -1;
            int n8 = -1 >>> 1;
            overScroller.fling(0, 0, 0, n4, 0, 0, n7, n8);
            object = this.v;
            n3 = object.getFinalY();
            ActionBarContainer actionBarContainer = this.d;
            int n10 = actionBarContainer.getHeight();
            if (n3 > n10) {
                this.i();
                object = (ActionBarOverlayLayout$3)this.z;
                ((ActionBarOverlayLayout$3)object).run();
            } else {
                this.i();
                object = (ActionBarOverlayLayout$2)this.y;
                ((ActionBarOverlayLayout$2)object).run();
            }
            this.j = n3 = 1;
            return n3;
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f5, float f6) {
        return false;
    }

    public final void onNestedPreScroll(View view, int n3, int n4, int[] nArray) {
    }

    public final void onNestedPreScroll(View view, int n3, int n4, int[] nArray, int n7) {
    }

    public final void onNestedScroll(View view, int n3, int n4, int n7, int n8) {
        int n10;
        this.k = n10 = this.k + n4;
        this.setActionBarHideOffset(n10);
    }

    public final void onNestedScroll(View view, int n3, int n4, int n7, int n8, int n10) {
        if (n10 == 0) {
            this.onNestedScroll(view, n3, n4, n7, n8);
        }
    }

    public final void onNestedScroll(View view, int n3, int n4, int n7, int n8, int n10, int[] nArray) {
        this.onNestedScroll(view, n3, n4, n7, n8, n10);
    }

    public final void onNestedScrollAccepted(View object, View object2, int n3) {
        int n4;
        this.A.a = n3;
        this.k = n4 = this.getActionBarHideOffset();
        this.i();
        object = this.u;
        if (object != null) {
            object = (h)object;
            object2 = object.t;
            if (object2 != null) {
                ((AD3)object2).a();
                object2 = null;
                object.t = null;
            }
        }
    }

    public final void onNestedScrollAccepted(View view, View view2, int n3, int n4) {
        if (n4 == 0) {
            this.onNestedScrollAccepted(view, view2, n3);
        }
    }

    public final boolean onStartNestedScroll(View object, View view, int n3) {
        int n4 = n3 & 2;
        if (n4 != 0 && (n4 = (object = this.d).getVisibility()) == 0) {
            return this.i;
        }
        return false;
    }

    public final boolean onStartNestedScroll(View view, View view2, int n3, int n4) {
        boolean bl2;
        if (n4 == 0 && (bl2 = this.onStartNestedScroll(view, view2, n3))) {
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        return bl2;
    }

    public final void onStopNestedScroll(View object) {
        int n3 = this.i;
        if (n3 != 0 && (n3 = this.j) == 0) {
            n3 = this.k;
            ActionBarContainer actionBarContainer = this.d;
            int n4 = actionBarContainer.getHeight();
            long l2 = 600L;
            if (n3 <= n4) {
                this.i();
                object = this.y;
                this.postDelayed((Runnable)object, l2);
            } else {
                this.i();
                object = this.z;
                this.postDelayed((Runnable)object, l2);
            }
        }
        if ((object = this.u) != null) {
            object.getClass();
        }
    }

    public final void onStopNestedScroll(View view, int n3) {
        if (n3 == 0) {
            this.onStopNestedScroll(view);
        }
    }

    public final void onWindowSystemUiVisibilityChanged(int n3) {
        Object object;
        super.onWindowSystemUiVisibilityChanged(n3);
        this.k();
        int n4 = this.l ^ n3;
        this.l = n3;
        int n7 = n3 & 4;
        boolean bl2 = true;
        n7 = n7 == 0 ? 1 : 0;
        if ((n3 &= 0x100) != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        ActionBarOverlayLayout$b actionBarOverlayLayout$b = this.u;
        if (actionBarOverlayLayout$b != null) {
            int n8 = n3 ^ 1;
            ActionBarOverlayLayout$b actionBarOverlayLayout$b2 = actionBarOverlayLayout$b;
            actionBarOverlayLayout$b2 = (h)actionBarOverlayLayout$b;
            ((h)actionBarOverlayLayout$b2).o = n8;
            if (n7 == 0 && n3 != 0) {
                actionBarOverlayLayout$b = (h)actionBarOverlayLayout$b;
                n3 = (int)(((h)actionBarOverlayLayout$b).q ? 1 : 0);
                if (n3 == 0) {
                    ((h)actionBarOverlayLayout$b).q = bl2;
                    ((h)actionBarOverlayLayout$b).E(bl2);
                }
            } else {
                actionBarOverlayLayout$b = (h)actionBarOverlayLayout$b;
                n3 = (int)(((h)actionBarOverlayLayout$b).q ? 1 : 0);
                if (n3 != 0) {
                    ((h)actionBarOverlayLayout$b).q = false;
                    ((h)actionBarOverlayLayout$b).E(bl2);
                }
            }
        }
        if ((n3 = n4 & 0x100) != 0 && (object = this.u) != null) {
            object = ViewCompat.a;
            ViewCompat$b.c((View)this);
        }
    }

    public final void onWindowVisibilityChanged(int n3) {
        super.onWindowVisibilityChanged(n3);
        this.b = n3;
        ActionBarOverlayLayout$b actionBarOverlayLayout$b = this.u;
        if (actionBarOverlayLayout$b != null) {
            actionBarOverlayLayout$b = (h)actionBarOverlayLayout$b;
            ((h)actionBarOverlayLayout$b).n = n3;
        }
    }

    public void setActionBarHideOffset(int n3) {
        this.i();
        int n4 = this.d.getHeight();
        n3 = Math.min(n3, n4);
        n3 = Math.max(0, n3);
        ActionBarContainer actionBarContainer = this.d;
        float f5 = -n3;
        actionBarContainer.setTranslationY(f5);
    }

    public void setActionBarVisibilityCallback(ActionBarOverlayLayout$b object) {
        this.u = object;
        object = this.getWindowToken();
        if (object != null) {
            object = this.u;
            int n3 = this.b;
            object = (h)object;
            ((h)object).n = n3;
            int n4 = this.l;
            if (n4 != 0) {
                this.onWindowSystemUiVisibilityChanged(n4);
                object = ViewCompat.a;
                ViewCompat$b.c((View)this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean bl2) {
        this.h = bl2;
    }

    public void setHideOnContentScrollEnabled(boolean bl2) {
        boolean bl3 = this.i;
        if (bl2 != bl3) {
            this.i = bl2;
            if (!bl2) {
                this.i();
                bl2 = false;
                this.setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int n3) {
        this.k();
        this.e.setIcon(n3);
    }

    public void setIcon(Drawable drawable2) {
        this.k();
        this.e.setIcon(drawable2);
    }

    public void setLogo(int n3) {
        this.k();
        this.e.m(n3);
    }

    public void setMenu(Menu menu2, h$a h$a) {
        this.k();
        this.e.setMenu(menu2, h$a);
    }

    public void setMenuPrepared() {
        this.k();
        this.e.setMenuPrepared();
    }

    public void setOverlayMode(boolean bl2) {
        this.g = bl2;
    }

    public void setShowingForActionMode(boolean bl2) {
    }

    public void setUiOptions(int n3) {
    }

    public void setWindowCallback(Window.Callback callback2) {
        this.k();
        this.e.setWindowCallback(callback2);
    }

    public void setWindowTitle(CharSequence charSequence) {
        this.k();
        this.e.setWindowTitle(charSequence);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

