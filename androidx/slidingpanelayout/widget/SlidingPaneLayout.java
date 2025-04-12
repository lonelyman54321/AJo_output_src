/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 *  android.widget.FrameLayout
 *  androidx.window.extensions.layout.WindowLayoutComponent
 */
package androidx.slidingpanelayout.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.f;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper$b;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$DisableLayerRunnable;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$a;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$b;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$c;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$e;
import androidx.slidingpanelayout.widget.a;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.SidecarCompat;
import androidx.window.layout.SidecarCompat$a;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.d;

public class SlidingPaneLayout
extends ViewGroup {
    public static final boolean y;
    public int a;
    public int b;
    public Drawable c;
    public Drawable d;
    public boolean e;
    public View f;
    public float g;
    public float h;
    public int i;
    public boolean j;
    public int k;
    public float l;
    public float m;
    public final CopyOnWriteArrayList n;
    public SlidingPaneLayout$d o;
    public final ViewDragHelper p;
    public boolean q;
    public boolean r;
    public final Rect s;
    public final ArrayList t;
    public int u;
    public JU0 v;
    public final SlidingPaneLayout$a w;
    public a x;

    static {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        n3 = n3 >= n4 ? 1 : 0;
        y = n3;
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public SlidingPaneLayout(Context object, AttributeSet object2, int n3) {
        Object object3;
        Object object4;
        Object object5;
        block14: {
            block15: {
                boolean bl2;
                Object object6;
                Object object7;
                int n4;
                block10: {
                    block9: {
                        super(object, (AttributeSet)object2, n3);
                        this.a = 0;
                        this.g = 1.0f;
                        object5 = new CopyOnWriteArrayList();
                        this.n = object5;
                        n3 = 1;
                        this.r = n3;
                        this.s = object4 = new Rect();
                        super();
                        this.t = object4;
                        super(this);
                        this.w = object4;
                        float f5 = object.getResources().getDisplayMetrics().density;
                        this.setWillNotDraw(false);
                        object2 = new SlidingPaneLayout$b(this);
                        ViewCompat.s((View)this, (androidx.core.view.a)object2);
                        this.setImportantForAccessibility(n3);
                        object2 = new SlidingPaneLayout$c(this);
                        this.p = object2 = ViewDragHelper.i(this, 0.5f, (ViewDragHelper$b)object2);
                        n3 = 1137180672;
                        float f6 = 400.0f;
                        ((ViewDragHelper)object2).n = f5 *= f6;
                        n4 = eg3_0.a;
                        fg3_0.a.getClass();
                        object2 = "context";
                        Intrinsics.checkNotNullParameter(object, (String)object2);
                        object4 = kh3_2.a;
                        Intrinsics.checkNotNullParameter(object, (String)object2);
                        object7 = null;
                        try {
                            object6 = JR2.a;
                            object6.getClass();
                            object6 = JR2.b();
                            if (object6 == null) break block9;
                            object3 = new MH0((WindowLayoutComponent)object6);
                            break block10;
                        }
                        catch (Throwable throwable) {}
                    }
                    bl2 = false;
                    object3 = null;
                }
                if (object3 != null) break block14;
                object6 = B43.c;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object6 = B43.c;
                if (object6 == null) {
                    Throwable throwable2;
                    block13: {
                        block11: {
                            block12: {
                                object6 = B43.d;
                                ((ReentrantLock)object6).lock();
                                try {
                                    object3 = B43.c;
                                    if (object3 != null) break block11;
                                    Intrinsics.checkNotNullParameter(object, (String)object2);
                                }
                                catch (Throwable throwable2) {
                                    break block13;
                                }
                                try {
                                    object2 = SidecarCompat$a.c();
                                    if (object2 == null) break block12;
                                    object3 = nb3_1.f;
                                    String string2 = "other";
                                    Intrinsics.checkNotNullParameter(object3, string2);
                                    object2 = ((nb3_1)object2).e;
                                    object2 = ((hh3_2)object2).getValue();
                                    string2 = "<get-bigInteger>(...)";
                                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                                    object2 = (BigInteger)object2;
                                    object3 = ((nb3_1)object3).e;
                                    object3 = ((hh3_2)object3).getValue();
                                    Intrinsics.checkNotNullExpressionValue(object3, string2);
                                    object3 = (BigInteger)object3;
                                    n4 = ((BigInteger)object2).compareTo((BigInteger)object3);
                                    if (n4 >= 0 && (bl2 = ((SidecarCompat)(object2 = new SidecarCompat((Context)object))).j())) {
                                        object7 = object2;
                                    }
                                }
                                catch (Throwable throwable3) {}
                            }
                            B43.c = object2 = new B43((SidecarCompat)object7);
                        }
                        object2 = Unit.a;
                        ((ReentrantLock)object6).unlock();
                        break block15;
                    }
                    ((ReentrantLock)object6).unlock();
                    throw throwable2;
                }
            }
            object3 = B43.c;
            Intrinsics.checkNotNull(object3);
        }
        object5 = new ig3_1((hH3)object4, (YF3)object3);
        fG3$a.b.getClass();
        Intrinsics.checkNotNullParameter(object5, "tracker");
        object = t70.getMainExecutor(object);
        object2 = new a((ig3_1)object5, (Executor)object);
        this.setFoldingFeatureObserver((a)object2);
    }

    private ei1 getSystemGestureInsets() {
        Object object;
        boolean bl2 = y;
        if (bl2 && (object = ViewCompat.i((View)this)) != null) {
            object = ((f)object).a.i();
        } else {
            bl2 = false;
            object = null;
        }
        return object;
    }

    private void setFoldingFeatureObserver(a a2) {
        this.x = a2;
        SlidingPaneLayout$a slidingPaneLayout$a = this.w;
        a2.getClass();
        Intrinsics.checkNotNullParameter(slidingPaneLayout$a, "onFoldingFeatureChangeListener");
        a2.d = slidingPaneLayout$a;
    }

    public final boolean a(View object) {
        Object object2;
        boolean bl2 = false;
        if (object == null) {
            return false;
        }
        object = (SlidingPaneLayout$LayoutParams)object.getLayoutParams();
        boolean bl3 = this.e;
        if (bl3 && (object2 = object.c) != 0) {
            float f5 = this.g;
            bl3 = false;
            float f6 = f5 - 0.0f;
            object2 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
            if (object2 > 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final void addView(View view, int n3, ViewGroup.LayoutParams layoutParams) {
        int n4;
        int n7 = this.getChildCount();
        if (n7 == (n4 = 1)) {
            Context context = view.getContext();
            SlidingPaneLayout$e slidingPaneLayout$e = new FrameLayout(context);
            slidingPaneLayout$e.addView(view);
            super.addView((View)slidingPaneLayout$e, n3, layoutParams);
            return;
        }
        super.addView(view, n3, layoutParams);
    }

    public final boolean b() {
        int n3;
        int n4 = this.getLayoutDirection();
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public final boolean c() {
        float f5;
        float f6;
        boolean bl2 = this.e;
        if (bl2 && (bl2 = (f6 = (f5 = this.g) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) {
            bl2 = false;
            f5 = 0.0f;
        } else {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        }
        return bl2;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean bl2;
        boolean bl3 = layoutParams instanceof SlidingPaneLayout$LayoutParams;
        if (bl3 && (bl2 = super.checkLayoutParams(layoutParams))) {
            bl2 = true;
        } else {
            bl2 = false;
            layoutParams = null;
        }
        return bl2;
    }

    public final void computeScroll() {
        Object object = this.p;
        boolean bl2 = ((ViewDragHelper)object).h();
        if (bl2) {
            bl2 = this.e;
            if (!bl2) {
                ((ViewDragHelper)object).a();
                return;
            }
            object = ViewCompat.a;
            this.postInvalidateOnAnimation();
        }
    }

    public final void d(float f5) {
        boolean bl2 = this.b();
        int n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view;
            View view2 = this.getChildAt(i3);
            if (view2 == (view = this.f)) continue;
            float f6 = this.h;
            float f7 = 1.0f;
            f6 = f7 - f6;
            int n4 = this.k;
            float f8 = n4;
            int n7 = (int)(f6 *= f8);
            this.h = f5;
            f7 -= f5;
            float f11 = n4;
            int n8 = (int)(f7 *= f11);
            n7 -= n8;
            if (bl2) {
                n7 = -n7;
            }
            view2.offsetLeftAndRight(n7);
        }
    }

    public final void draw(Canvas canvas) {
        View view;
        super.draw(canvas);
        boolean bl2 = this.b();
        Drawable drawable2 = bl2 ? this.d : this.c;
        int n3 = this.getChildCount();
        int n4 = 1;
        if (n3 > n4) {
            view = this.getChildAt(n4);
        } else {
            n3 = 0;
            view = null;
        }
        if (view != null && drawable2 != null) {
            n4 = view.getTop();
            int n7 = view.getBottom();
            int n8 = drawable2.getIntrinsicWidth();
            boolean bl3 = this.b();
            if (bl3) {
                n3 = view.getRight();
                n8 += n3;
            } else {
                n3 = view.getLeft();
                int n10 = n3 - n8;
                n8 = n3;
                n3 = n10;
            }
            drawable2.setBounds(n3, n4, n8, n7);
            drawable2.draw(canvas);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long l2) {
        int n3;
        Object object;
        int n4 = this.b();
        int n7 = this.c();
        ViewDragHelper viewDragHelper = this.p;
        if ((n4 ^= n7) != 0) {
            viewDragHelper.q = n4 = 1;
            object = this.getSystemGestureInsets();
            if (object != null) {
                n3 = viewDragHelper.p;
                n4 = object.a;
                viewDragHelper.o = n4 = Math.max(n3, n4);
            }
        } else {
            viewDragHelper.q = n4 = 2;
            object = this.getSystemGestureInsets();
            if (object != null) {
                n3 = viewDragHelper.p;
                n4 = object.c;
                viewDragHelper.o = n4 = Math.max(n3, n4);
            }
        }
        object = (SlidingPaneLayout$LayoutParams)view.getLayoutParams();
        n7 = canvas.save();
        n3 = (int)(this.e ? 1 : 0);
        if (n3 != 0 && (n4 = (int)(((SlidingPaneLayout$LayoutParams)((Object)object)).b ? 1 : 0)) == 0 && (object = this.f) != null) {
            object = this.s;
            canvas.getClipBounds((Rect)object);
            n3 = (int)(this.b() ? 1 : 0);
            if (n3 != 0) {
                n3 = ((Rect)object).left;
                View view2 = this.f;
                int n8 = view2.getRight();
                ((Rect)object).left = n3 = Math.max(n3, n8);
            } else {
                n3 = ((Rect)object).right;
                View view3 = this.f;
                int n10 = view3.getLeft();
                ((Rect)object).right = n3 = Math.min(n3, n10);
            }
            canvas.clipRect((Rect)object);
        }
        boolean bl2 = super.drawChild(canvas, view, l2);
        canvas.restoreToCount(n7);
        return bl2;
    }

    public final boolean e(float f5) {
        int n3;
        float f6;
        int n4;
        float f7;
        int n7;
        int n8;
        int n10 = 1;
        int n14 = this.e;
        if (n14 == 0) {
            return false;
        }
        n14 = this.b();
        SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams = (SlidingPaneLayout$LayoutParams)this.f.getLayoutParams();
        if (n14 != 0) {
            n14 = this.getPaddingRight();
            n8 = slidingPaneLayout$LayoutParams.rightMargin;
            n14 += n8;
            slidingPaneLayout$LayoutParams = this.f;
            n8 = slidingPaneLayout$LayoutParams.getWidth();
            n7 = this.getWidth();
            float f8 = n7;
            f7 = n14;
            n4 = this.i;
            f6 = n4;
            f5 = f5 * f6 + f7;
            f7 = n8;
            n3 = (int)(f8 -= (f5 += f7));
        } else {
            n14 = this.getPaddingLeft();
            n8 = slidingPaneLayout$LayoutParams.leftMargin;
            f7 = n14 += n8;
            n8 = this.i;
            float f11 = n8;
            f5 = f5 * f11 + f7;
            n3 = (int)f5;
        }
        View view = this.f;
        n8 = view.getTop();
        ViewDragHelper viewDragHelper = this.p;
        n3 = (int)(viewDragHelper.u(view, n3, n8) ? 1 : 0);
        if (n3 != 0) {
            n3 = this.getChildCount();
            f7 = 0.0f;
            view = null;
            for (n14 = 0; n14 < n3; n14 += n10) {
                slidingPaneLayout$LayoutParams = this.getChildAt(n14);
                n7 = slidingPaneLayout$LayoutParams.getVisibility();
                n4 = 4;
                f6 = 5.6E-45f;
                if (n7 != n4) continue;
                slidingPaneLayout$LayoutParams.setVisibility(0);
            }
            this.postInvalidateOnAnimation();
            return n10 != 0;
        }
        return false;
    }

    public final void f(View view) {
        View view2;
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        View view3 = view;
        int n16 = this.b();
        if (n16 != 0) {
            n15 = this.getWidth();
            n14 = this.getPaddingRight();
            n15 -= n14;
        } else {
            n15 = this.getPaddingLeft();
        }
        if (n16 != 0) {
            n14 = this.getPaddingLeft();
        } else {
            n14 = this.getWidth();
            n10 = this.getPaddingRight();
            n14 -= n10;
        }
        n10 = this.getPaddingTop();
        int n17 = this.getHeight();
        int n18 = this.getPaddingBottom();
        n17 -= n18;
        if (view3 != null && (n8 = view.isOpaque()) != 0) {
            n8 = view.getLeft();
            n7 = view.getRight();
            n4 = view.getTop();
            n3 = view.getBottom();
        } else {
            n8 = 0;
            n7 = 0;
            n4 = 0;
            n3 = 0;
        }
        int n19 = this.getChildCount();
        for (int i3 = 0; i3 < n19 && (view2 = this.getChildAt(i3)) != view3; ++i3) {
            int n20;
            int n21 = view2.getVisibility();
            if (n21 == (n18 = 8)) {
                n20 = n16;
            } else {
                n18 = n16 != 0 ? n14 : n15;
                n21 = view2.getLeft();
                n18 = Math.max(n18, n21);
                n21 = view2.getTop();
                n21 = Math.max(n10, n21);
                n20 = n16;
                int n22 = n16 != 0 ? n15 : n14;
                n16 = view2.getRight();
                n22 = Math.min(n22, n16);
                n16 = view2.getBottom();
                n16 = Math.min(n17, n16);
                if (n18 >= n8 && n21 >= n4 && n22 <= n7 && n16 <= n3) {
                    n22 = 4;
                } else {
                    n22 = 0;
                    view3 = null;
                }
                view2.setVisibility(n22);
            }
            view3 = view;
            n16 = n20;
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams = new SlidingPaneLayout$LayoutParams();
        return slidingPaneLayout$LayoutParams;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = this.getContext();
        SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams = new SlidingPaneLayout$LayoutParams(context, attributeSet);
        return slidingPaneLayout$LayoutParams;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams;
        boolean bl2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        if (bl2) {
            layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
            slidingPaneLayout$LayoutParams = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams)layoutParams);
            slidingPaneLayout$LayoutParams.a = 0.0f;
        } else {
            slidingPaneLayout$LayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
            slidingPaneLayout$LayoutParams.a = 0.0f;
        }
        return slidingPaneLayout$LayoutParams;
    }

    public int getCoveredFadeColor() {
        return this.b;
    }

    public final int getLockMode() {
        return this.u;
    }

    public int getParallaxDistance() {
        return this.k;
    }

    public int getSliderFadeColor() {
        return this.a;
    }

    public final void onAttachedToWindow() {
        int n3;
        super.onAttachedToWindow();
        this.r = n3 = 1;
        Object object = this.x;
        if (object != null) {
            block5: {
                boolean bl2;
                object = this.getContext();
                while (bl2 = object instanceof ContextWrapper) {
                    bl2 = object instanceof Activity;
                    if (bl2) {
                        object = (Activity)object;
                        break block5;
                    }
                    object = ((ContextWrapper)object).getBaseContext();
                }
                n3 = 0;
                object = null;
            }
            if (object != null) {
                a a2 = this.x;
                a2.getClass();
                Intrinsics.checkNotNullParameter(object, "activity");
                i90_0 i90_02 = a2.c;
                if (i90_02 != null) {
                    i90_02.d(null);
                }
                i90_02 = kotlinx.coroutines.d.a(h83.a(a2.b));
                ku0_2 ku0_22 = new ku0_2(a2, (Activity)object, null);
                n3 = 3;
                a2.c = object = Ae3.d(i90_02, null, null, ku0_22, n3);
            }
        }
    }

    public final void onDetachedFromWindow() {
        int n3;
        boolean bl2;
        super.onDetachedFromWindow();
        this.r = bl2 = true;
        Object object = this.x;
        if (object != null && (object = ((a)object).c) != null) {
            ((JobSupport)object).d(null);
        }
        if ((n3 = ((ArrayList)(object = this.t)).size()) <= 0) {
            ((ArrayList)object).clear();
            return;
        }
        ((SlidingPaneLayout$DisableLayerRunnable)((ArrayList)object).get(0)).getClass();
        throw null;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean onInterceptTouchEvent(MotionEvent var1_1) {
        block6: {
            block7: {
                block8: {
                    var2_2 = var1_1.getActionMasked();
                    var3_3 = this.e;
                    var4_4 = this.p;
                    var5_5 = 1;
                    if (var3_3 == 0 && var2_2 == 0 && (var3_3 = this.getChildCount()) > var5_5 && (var6_6 = this.getChildAt(var5_5)) != null) {
                        var7_7 = var1_1.getX();
                        var8_8 = (int)var7_7;
                        var9_9 = var1_1.getY();
                        var10_10 = (int)var9_9;
                        var4_4.getClass();
                        var3_3 = (int)ViewDragHelper.l(var6_6, var8_8, var10_10);
                        this.q = var3_3;
                    }
                    if ((var3_3 = this.e) == 0 || (var3_3 = (int)this.j) != 0 && var2_2 != 0) break block6;
                    var3_3 = 3;
                    var11_11 = 4.2E-45f;
                    var8_8 = 0;
                    var7_7 = 0.0f;
                    if (var2_2 == var3_3 || var2_2 == var5_5) break block7;
                    if (var2_2 == 0) break block8;
                    var3_3 = 2;
                    var11_11 = 2.8E-45f;
                    if (var2_2 == var3_3) {
                        var12_12 = var1_1.getX();
                        var11_11 = var1_1.getY();
                        var9_9 = this.l;
                        var12_12 = Math.abs(var12_12 - var9_9);
                        var9_9 = this.m;
                        var11_11 = Math.abs(var11_11 - var9_9);
                        var9_9 = var4_4.b;
                        cfr_temp_0 = var12_12 - var9_9;
                        var10_10 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                        if (var10_10 > 0 && (var2_2 = (int)(var11_11 == var12_12 ? 0 : (var11_11 > var12_12 ? 1 : -1))) > 0) {
                            var4_4.b();
                            this.j = var5_5;
                            return false;
                        }
                    }
                    ** GOTO lbl-1000
                }
                this.j = false;
                var12_12 = var1_1.getX();
                var11_11 = var1_1.getY();
                this.l = var12_12;
                this.m = var11_11;
                var13_13 = this.f;
                var2_2 = (int)var12_12;
                var3_3 = (int)var11_11;
                var4_4.getClass();
                var2_2 = (int)ViewDragHelper.l(var13_13, var2_2, var3_3);
                if (var2_2 != 0 && (var2_2 = (int)this.a(var14_14 = this.f)) != 0) {
                    var2_2 = 1;
                    var12_12 = 1.4E-45f;
                } else lbl-1000:
                // 2 sources

                {
                    var2_2 = 0;
                    var12_12 = 0.0f;
                    var14_14 = null;
                }
                var15_15 = var4_4.t(var1_1);
                if (!var15_15 && var2_2 == 0) {
                    var5_5 = 0;
                }
                return (boolean)var5_5;
            }
            var4_4.b();
            return false;
        }
        var4_4.b();
        return super.onInterceptTouchEvent(var1_1);
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        float f5;
        SlidingPaneLayout slidingPaneLayout = this;
        int n10 = this.b();
        int n14 = n7 - n3;
        int n15 = n10 != 0 ? this.getPaddingRight() : this.getPaddingLeft();
        int n16 = n10 != 0 ? this.getPaddingLeft() : this.getPaddingRight();
        int n17 = this.getPaddingTop();
        int n18 = this.getChildCount();
        int n19 = slidingPaneLayout.r;
        if (n19 != 0) {
            n19 = slidingPaneLayout.e;
            if (n19 != 0 && (n19 = (int)(slidingPaneLayout.q ? 1 : 0)) != 0) {
                n19 = 0;
                f5 = 0.0f;
            } else {
                n19 = 1065353216;
                f5 = 1.0f;
            }
            slidingPaneLayout.g = f5;
        }
        int n20 = n15;
        for (int i3 = 0; i3 < n18; ++i3) {
            float f6;
            int n21;
            View view = slidingPaneLayout.getChildAt(i3);
            int n22 = view.getVisibility();
            if (n22 == (n21 = 8)) {
                n19 = n20;
                n20 = 1065353216;
                f6 = 1.0f;
            } else {
                Object object;
                float f7;
                int n24;
                Object object2 = (SlidingPaneLayout$LayoutParams)view.getLayoutParams();
                n21 = view.getMeasuredWidth();
                int n25 = object2.b;
                if (n25 != 0) {
                    n25 = object2.leftMargin;
                    int n26 = object2.rightMargin;
                    n25 += n26;
                    n26 = n14 - n16;
                    int n27 = Math.min(n15, n26) - n20;
                    slidingPaneLayout.i = n25 = n27 - n25;
                    int n28 = n21 / 2;
                    n19 = n10 != 0 ? object2.rightMargin : object2.leftMargin;
                    n27 = n20 + n19 + n25;
                    n24 = n28 + n27;
                    if (n24 > n26) {
                        n24 = 1;
                        f7 = Float.MIN_VALUE;
                    } else {
                        n24 = 0;
                        f7 = 0.0f;
                        object = null;
                    }
                    object2.c = n24;
                    f7 = n25;
                    float f8 = slidingPaneLayout.g * f7;
                    n22 = (int)f8;
                    n19 = n19 + n22 + n20;
                    slidingPaneLayout.g = f6 = (float)n22 / f7;
                    n24 = 0;
                    f7 = 0.0f;
                    object = null;
                    n20 = 1065353216;
                    f6 = 1.0f;
                } else {
                    n19 = (int)(slidingPaneLayout.e ? 1 : 0);
                    if (n19 != 0 && (n19 = slidingPaneLayout.k) != 0) {
                        f7 = slidingPaneLayout.g;
                        n20 = 1065353216;
                        f6 = 1.0f;
                        f7 = f6 - f7;
                        f5 = n19;
                        n24 = (int)(f7 *= f5);
                        n19 = n15;
                    } else {
                        n20 = 1065353216;
                        f6 = 1.0f;
                        n19 = n15;
                        n24 = 0;
                        f7 = 0.0f;
                        object = null;
                    }
                }
                if (n10 != 0) {
                    n22 = n14 - n19 + n24;
                    n24 = n22 - n21;
                } else {
                    n24 = n19 - n24;
                    n22 = n24 + n21;
                }
                n21 = view.getMeasuredHeight() + n17;
                view.layout(n24, n17, n22, n21);
                object = slidingPaneLayout.v;
                if (object != null && (object = object.a()) == (object2 = JU0$a.b) && (n24 = (int)((object = slidingPaneLayout.v).c() ? 1 : 0)) != 0) {
                    object = slidingPaneLayout.v.b();
                    n24 = object.width();
                } else {
                    n24 = 0;
                    f7 = 0.0f;
                    object = null;
                }
                int n29 = view.getWidth();
                n15 = n24 = Math.abs(n24) + n29 + n15;
            }
            n20 = n19;
        }
        n10 = slidingPaneLayout.r;
        if (n10 != 0) {
            n10 = slidingPaneLayout.e;
            if (n10 != 0 && (n10 = slidingPaneLayout.k) != 0) {
                float f11 = slidingPaneLayout.g;
                slidingPaneLayout.d(f11);
            }
            View view = slidingPaneLayout.f;
            slidingPaneLayout.f(view);
        }
        slidingPaneLayout.r = false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onMeasure(int var1_1, int var2_2) {
        block49: {
            block39: {
                block48: {
                    block47: {
                        block42: {
                            block41: {
                                var3_3 = this;
                                var4_4 = var2_2;
                                var5_5 = 0;
                                var6_6 /* !! */  = null;
                                var7_7 = View.MeasureSpec.getMode((int)var1_1);
                                var8_8 = View.MeasureSpec.getSize((int)var1_1);
                                var9_9 = View.MeasureSpec.getMode((int)var2_2);
                                var10_10 = View.MeasureSpec.getSize((int)var2_2);
                                var11_11 = -1 << -1;
                                var12_12 = 0x40000000;
                                if (var9_9 != var11_11) {
                                    if (var9_9 != var12_12) {
                                        var10_10 = 0;
                                        var13_13 = 0;
                                    } else {
                                        var13_13 = this.getPaddingTop();
                                        var10_10 -= var13_13;
                                        var13_13 = this.getPaddingBottom();
                                        var10_10 -= var13_13;
                                        var13_13 = var10_10;
                                    }
                                } else {
                                    var13_13 = this.getPaddingTop();
                                    var10_10 -= var13_13;
                                    var13_13 = this.getPaddingBottom();
                                    var13_13 = var10_10 - var13_13;
                                    var10_10 = 0;
                                }
                                var14_14 = this.getPaddingLeft();
                                var14_14 = var8_8 - var14_14;
                                var15_15 = this.getPaddingRight();
                                var14_14 = Math.max(var14_14 - var15_15, 0);
                                var15_15 = this.getChildCount();
                                var3_3.f = null;
                                var16_16 = var14_14;
                                var17_17 = 0;
                                var18_18 = 0.0f;
                                var19_19 = null;
                                var20_20 = 0;
                                var21_21 = 0.0f;
                                while (true) {
                                    block40: {
                                        var22_22 = 8;
                                        var23_23 = 1.1E-44f;
                                        if (var17_17 >= var15_15) break;
                                        var24_24 /* !! */  = var3_3.getChildAt(var17_17);
                                        var26_26 /* !! */  = var25_25 = var24_24 /* !! */ .getLayoutParams();
                                        var26_26 /* !! */  = (SlidingPaneLayout$LayoutParams)var25_25;
                                        var27_27 = var24_24 /* !! */ .getVisibility();
                                        if (var27_27 == var22_22) {
                                            var26_26 /* !! */ .c = false;
lbl49:
                                            // 5 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var23_23 = var26_26 /* !! */ .a;
                                        var27_27 = 0;
                                        var28_28 = null;
                                        cfr_temp_0 = var23_23 - 0.0f;
                                        var29_29 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                        if (var29_29 /* !! */  <= 0) break block40;
                                        var21_21 += var23_23;
                                        var22_22 = var26_26 /* !! */ .width;
                                        if (var22_22 == 0) ** GOTO lbl49
                                    }
                                    var22_22 = var26_26 /* !! */ .leftMargin;
                                    var27_27 = var26_26 /* !! */ .rightMargin;
                                    var22_22 += var27_27;
                                    var22_22 = Math.max(var14_14 - var22_22, 0);
                                    var27_27 = var26_26 /* !! */ .width;
                                    var5_5 = -2;
                                    if (var27_27 == var5_5) {
                                        var5_5 = var7_7 == 0 ? var7_7 : -1 << -1;
                                        var5_5 = View.MeasureSpec.makeMeasureSpec((int)var22_22, (int)var5_5);
                                    } else {
                                        var5_5 = -1;
                                        var5_5 = var27_27 == var5_5 ? View.MeasureSpec.makeMeasureSpec((int)var22_22, (int)var7_7) : (var22_22 = View.MeasureSpec.makeMeasureSpec((int)var27_27, (int)0x40000000));
                                    }
                                    var22_22 = this.getPaddingTop();
                                    var27_27 = this.getPaddingBottom() + var22_22;
                                    var22_22 = var26_26 /* !! */ .height;
                                    var22_22 = ViewGroup.getChildMeasureSpec((int)var4_4, (int)var27_27, (int)var22_22);
                                    var24_24 /* !! */ .measure(var5_5, var22_22);
                                    var5_5 = var24_24 /* !! */ .getMeasuredWidth();
                                    var22_22 = var24_24 /* !! */ .getMeasuredHeight();
                                    if (var22_22 > var10_10) {
                                        var27_27 = -1 << -1;
                                        if (var9_9 == var27_27) {
                                            var10_10 = Math.min(var22_22, var13_13);
                                        } else if (var9_9 == 0) {
                                            var10_10 = var22_22;
                                        }
                                    }
                                    var16_16 -= var5_5;
                                    if (var17_17 == 0) ** GOTO lbl49
                                    if (var16_16 < 0) {
                                        var5_5 = 1;
                                    } else {
                                        var5_5 = 0;
                                        var6_6 /* !! */  = null;
                                    }
                                    var26_26 /* !! */ .b = var5_5;
                                    var20_20 |= var5_5;
                                    if (var5_5 == 0) ** GOTO lbl49
                                    var3_3.f = var24_24 /* !! */ ;
                                    ** continue;
                                    var5_5 = 1;
                                    var17_17 += var5_5;
                                    var5_5 = 0;
                                    var6_6 /* !! */  = null;
                                    var11_11 = -1 << -1;
                                    var12_12 = 0x40000000;
                                }
                                if (var20_20 != 0) break block41;
                                var5_5 = 0;
                                var6_6 /* !! */  = null;
                                cfr_temp_1 = var21_21 - 0.0f;
                                var7_7 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                                if (var7_7 <= 0) break block42;
                            }
                            var6_6 /* !! */  = null;
                            for (var5_5 = 0; var5_5 < var15_15; var5_5 += var16_16) {
                                block46: {
                                    block45: {
                                        block44: {
                                            block43: {
                                                var30_30 = var3_3.getChildAt(var5_5);
                                                var11_11 = var30_30.getVisibility();
                                                if (var11_11 != var22_22) break block43;
                                                var31_31 = var16_16;
                                                var25_25 = null;
                                                ** GOTO lbl192
                                            }
                                            var24_24 /* !! */  = (SlidingPaneLayout$LayoutParams)var30_30.getLayoutParams();
                                            var12_12 = var24_24 /* !! */ .width;
                                            var18_18 = var24_24 /* !! */ .a;
                                            if (var12_12 != 0) ** GOTO lbl-1000
                                            var12_12 = 0;
                                            var26_26 /* !! */  = null;
                                            cfr_temp_2 = var18_18 - 0.0f;
                                            var27_27 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                                            if (var27_27 > 0) {
                                                var12_12 = 0;
                                                var26_26 /* !! */  = null;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var12_12 = var30_30.getMeasuredWidth();
                                            }
                                            if (var20_20 != 0) {
                                                var17_17 = var24_24 /* !! */ .leftMargin;
                                                var11_11 = var24_24 /* !! */ .rightMargin;
                                                var17_17 += var11_11;
                                                var11_11 = var14_14 - var17_17;
                                                var27_27 = 0x40000000;
                                                var17_17 = View.MeasureSpec.makeMeasureSpec((int)var11_11, (int)var27_27);
                                            } else {
                                                var11_11 = 0;
                                                var24_24 /* !! */  = null;
                                                var27_27 = 0x40000000;
                                                cfr_temp_3 = var18_18 - 0.0f;
                                                var32_32 /* !! */  = (float)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1));
                                                if (var32_32 /* !! */  > 0) {
                                                    var24_24 /* !! */  = null;
                                                    var23_23 = Math.max(0, var16_16);
                                                    var18_18 = var18_18 * var23_23 / var21_21;
                                                    var22_22 = (int)var18_18;
                                                    var11_11 = var12_12 + var22_22;
                                                    var17_17 = var22_22 = View.MeasureSpec.makeMeasureSpec((int)var11_11, (int)var27_27);
                                                } else {
                                                    var11_11 = var12_12;
                                                    var17_17 = 0;
                                                    var18_18 = 0.0f;
                                                    var19_19 = null;
                                                }
                                            }
                                            var22_22 = this.getPaddingTop();
                                            var27_27 = this.getPaddingBottom() + var22_22;
                                            var33_33 = (SlidingPaneLayout$LayoutParams)var30_30.getLayoutParams();
                                            var31_31 = var16_16;
                                            var16_16 = var33_33.width;
                                            if (var16_16 != 0) break block44;
                                            var34_34 = var33_33.a;
                                            var25_25 = null;
                                            cfr_temp_4 = var34_34 - 0.0f;
                                            var16_16 = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                                            if (var16_16 <= 0) break block45;
                                            var16_16 = var33_33.height;
                                            var16_16 = ViewGroup.getChildMeasureSpec((int)var4_4, (int)var27_27, (int)var16_16);
                                            break block46;
                                        }
                                        var25_25 = null;
                                    }
                                    var16_16 = var30_30.getMeasuredHeight();
                                    var22_22 = 0x40000000;
                                    var23_23 = 2.0f;
                                    var16_16 = View.MeasureSpec.makeMeasureSpec((int)var16_16, (int)var22_22);
                                }
                                if (var12_12 == var11_11) ** GOTO lbl192
                                var30_30.measure(var17_17, var16_16);
                                var16_16 = var30_30.getMeasuredHeight();
                                if (var16_16 <= var10_10) ** GOTO lbl192
                                var22_22 = -1 << -1;
                                var23_23 = -0.0f;
                                if (var9_9 == var22_22) {
                                    var16_16 = Math.min(var16_16, var13_13);
lbl190:
                                    // 2 sources

                                    while (true) {
                                        var10_10 = var16_16;
lbl192:
                                        // 5 sources

                                        while (true) {
                                            ** GOTO lbl196
                                            break;
                                        }
                                        break;
                                    }
                                } else {
                                    if (var9_9 != 0) ** continue;
                                    ** continue;
                                }
lbl196:
                                // 1 sources

                                var16_16 = 1;
                                var34_34 = 1.4E-45f;
                                var16_16 = var31_31;
                                var22_22 = 8;
                                var23_23 = 1.1E-44f;
                            }
                        }
                        if ((var35_35 = var3_3.v) == null || (var4_4 = (int)var35_35.c()) == 0) break block47;
                        var35_35 = var3_3.v.b();
                        var4_4 = var35_35.left;
                        if (var4_4 != 0) break block48;
                    }
lbl208:
                    // 3 sources

                    while (true) {
                        var17_17 = 0;
                        var18_18 = 0.0f;
                        var19_19 = null;
                        break block39;
                        break;
                    }
                }
                var35_35 = var3_3.v.b();
                var4_4 = var35_35.top;
                if (var4_4 != 0) ** GOTO lbl208
                var35_35 = var3_3.v;
                var34_34 = 2.8E-45f;
                var6_6 /* !! */  = new int[2];
                var3_3.getLocationInWindow(var6_6 /* !! */ );
                var7_7 = var6_6 /* !! */ [0];
                var22_22 = 1;
                var23_23 = 1.4E-45f;
                var9_9 = var6_6 /* !! */ [var22_22];
                var11_11 = this.getWidth() + var7_7;
                var12_12 = var6_6 /* !! */ [var22_22];
                var22_22 = this.getWidth() + var12_12;
                var36_36 = new Rect(var7_7, var9_9, var11_11, var22_22);
                var35_35 = var35_35.b();
                var33_33 = new Rect((Rect)var35_35);
                var4_4 = (int)var33_33.intersect((Rect)var36_36);
                var16_16 = var33_33.width();
                if (var16_16 == 0 && (var16_16 = var33_33.height()) == 0 || var4_4 == 0) {
                    var22_22 = 0;
                    var23_23 = 0.0f;
                    var33_33 = null;
                } else {
                    var35_35 = null;
                    var4_4 = -var6_6 /* !! */ [0];
                    var34_34 = 1.4E-45f;
                    var5_5 = var6_6 /* !! */ [1];
                    var16_16 = -var5_5;
                    var33_33.offset(var4_4, var16_16);
                }
                if (var33_33 != null) ** break;
                ** while (true)
                var16_16 = this.getPaddingLeft();
                var5_5 = this.getPaddingTop();
                var7_7 = this.getPaddingLeft();
                var9_9 = var33_33.left;
                var7_7 = Math.max(var7_7, var9_9);
                var9_9 = this.getHeight();
                var11_11 = this.getPaddingBottom();
                var35_35 = new Rect(var16_16, var5_5, var7_7, var9_9 -= var11_11);
                var16_16 = this.getWidth();
                var5_5 = this.getPaddingRight();
                var6_6 /* !! */  = (int[])new Rect;
                var22_22 = var33_33.right;
                var22_22 = Math.min(var16_16 -= var5_5, var22_22);
                var7_7 = this.getPaddingTop();
                var9_9 = this.getHeight();
                var11_11 = this.getPaddingBottom();
                var6_6 /* !! */ (var22_22, var7_7, var16_16, var9_9 -= var11_11);
                var16_16 = 2;
                var34_34 = 2.8E-45f;
                var36_36 = new Rect[var16_16];
                var22_22 = 0;
                var23_23 = 0.0f;
                var33_33 = null;
                var36_36[0] = var35_35;
                var4_4 = 1;
                var36_36[var4_4] = (Rect)var6_6 /* !! */ ;
                var35_35 = Arrays.asList(var36_36);
                var19_19 = new ArrayList<E>(var35_35);
            }
            if (var19_19 == null || var20_20 != 0) break block49;
            var24_24 /* !! */  = null;
            for (var11_11 = 0; var11_11 < var15_15; var11_11 += var16_16) {
                block56: {
                    block51: {
                        block55: {
                            block52: {
                                block54: {
                                    block53: {
                                        block50: {
                                            var35_35 = var3_3.getChildAt(var11_11);
                                            var16_16 = var35_35.getVisibility();
                                            if (var16_16 != (var5_5 = 8)) break block50;
                                            var5_5 = 0x40000000;
                                            var13_13 = -1 << -1;
                                            var27_27 = 0;
                                            var28_28 = null;
                                            break block51;
                                        }
                                        var36_36 = (Rect)var19_19.get(var11_11);
                                        var33_33 = (SlidingPaneLayout$LayoutParams)var35_35.getLayoutParams();
                                        var7_7 = var33_33.leftMargin;
                                        var9_9 = var33_33.rightMargin;
                                        var7_7 += var9_9;
                                        var9_9 = View.MeasureSpec.makeMeasureSpec((int)var35_35.getMeasuredHeight(), (int)0x40000000);
                                        var12_12 = var36_36.width();
                                        var13_13 = -1 << -1;
                                        var12_12 = View.MeasureSpec.makeMeasureSpec((int)var12_12, (int)var13_13);
                                        var35_35.measure(var12_12, var9_9);
                                        var12_12 = var35_35.getMeasuredWidthAndState() & 0x1000000;
                                        var27_27 = 1;
                                        if (var12_12 == var27_27) break block52;
                                        var12_12 = var35_35 instanceof SlidingPaneLayout$e;
                                        if (var12_12 != 0) {
                                            var28_28 = var35_35;
                                            var28_28 = ((SlidingPaneLayout$e)var35_35).getChildAt(0);
                                            var6_6 /* !! */  = (int[])ViewCompat.a;
                                            var5_5 = var28_28.getMinimumWidth();
                                        } else {
                                            var6_6 /* !! */  = (int[])ViewCompat.a;
                                            var5_5 = var35_35.getMinimumWidth();
                                        }
                                        if (var5_5 == 0) break block53;
                                        var5_5 = var36_36.width();
                                        if (var12_12 != 0) {
                                            var26_26 /* !! */  = var35_35;
                                            var26_26 /* !! */  = (SlidingPaneLayout$e)var35_35;
                                            var27_27 = 0;
                                            var28_28 = null;
                                            var26_26 /* !! */  = var26_26 /* !! */ .getChildAt(0);
                                            var12_12 = var26_26 /* !! */ .getMinimumWidth();
                                        } else {
                                            var27_27 = 0;
                                            var28_28 = null;
                                            var12_12 = ((View)var35_35).getMinimumWidth();
                                        }
                                        if (var5_5 >= var12_12) break block54;
                                        var5_5 = 0x40000000;
                                        break block55;
                                    }
                                    var27_27 = 0;
                                    var28_28 = null;
                                }
                                var16_16 = var36_36.width();
                                var5_5 = 0x40000000;
                                var16_16 = View.MeasureSpec.makeMeasureSpec((int)var16_16, (int)var5_5);
                                ((View)var35_35).measure(var16_16, var9_9);
                                break block51;
                            }
                            var5_5 = 0x40000000;
                            var27_27 = 0;
                            var28_28 = null;
                        }
                        var16_16 = View.MeasureSpec.makeMeasureSpec((int)(var14_14 - var7_7), (int)var5_5);
                        ((View)var35_35).measure(var16_16, var9_9);
                        if (var11_11 != 0) break block56;
                    }
                    var16_16 = 1;
                    var34_34 = 1.4E-45f;
                    continue;
                }
                var16_16 = 1;
                var34_34 = 1.4E-45f;
                var33_33.b = var16_16;
                var3_3.f = (View)var35_35;
                var20_20 = 1;
            }
        }
        var4_4 = var20_20;
        var16_16 = this.getPaddingTop() + var10_10;
        var5_5 = this.getPaddingBottom() + var16_16;
        var3_3.setMeasuredDimension(var8_8, var5_5);
        var3_3.e = var20_20;
        var36_36 = var3_3.p;
        var5_5 = var36_36.a;
        if (var5_5 != 0 && var20_20 == 0) {
            var36_36.a();
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        boolean bl2;
        block8: {
            float f5;
            block6: {
                boolean bl3;
                block7: {
                    bl2 = parcelable instanceof SlidingPaneLayout$SavedState;
                    if (!bl2) {
                        super.onRestoreInstanceState(parcelable);
                        return;
                    }
                    parcelable = (SlidingPaneLayout$SavedState)parcelable;
                    Parcelable parcelable2 = parcelable.getSuperState();
                    super.onRestoreInstanceState(parcelable2);
                    bl2 = parcelable.a;
                    if (!bl2) break block6;
                    bl2 = this.e;
                    bl3 = true;
                    if (!bl2) {
                        this.q = bl3;
                    }
                    if (bl2 = this.r) break block7;
                    float f6 = 0.0f;
                    parcelable2 = null;
                    bl2 = this.e(0.0f);
                    if (!bl2) break block8;
                }
                this.q = bl3;
                break block8;
            }
            bl2 = this.e;
            boolean bl4 = false;
            if (!bl2) {
                this.q = false;
            }
            if ((bl2 = this.r) || (bl2 = this.e(f5 = 1.0f))) {
                this.q = false;
            }
        }
        this.q = bl2 = parcelable.a;
        int n3 = parcelable.b;
        this.setLockMode(n3);
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable = super.onSaveInstanceState();
        SlidingPaneLayout$SavedState slidingPaneLayout$SavedState = new AbsSavedState(parcelable);
        int n3 = this.e;
        n3 = n3 != 0 ? this.c() : this.q;
        slidingPaneLayout$SavedState.a = n3;
        slidingPaneLayout$SavedState.b = n3 = this.u;
        return slidingPaneLayout$SavedState;
    }

    public final void onSizeChanged(int n3, int n4, int n7, int n8) {
        super.onSizeChanged(n3, n4, n7, n8);
        if (n3 != n7) {
            n3 = 1;
            this.r = n3;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int n3 = this.e;
        if (n3 == 0) {
            return super.onTouchEvent(motionEvent);
        }
        ViewDragHelper viewDragHelper = this.p;
        viewDragHelper.m(motionEvent);
        int n4 = motionEvent.getActionMasked();
        int n7 = 1;
        if (n4 != 0) {
            View view;
            if (n4 == n7 && (n4 = this.a(view = this.f)) != 0) {
                float f5;
                float f6 = motionEvent.getX();
                float f7 = motionEvent.getY();
                float f8 = this.l;
                f8 = f6 - f8;
                float f11 = this.m;
                f11 = f7 - f11;
                n3 = viewDragHelper.b;
                float f12 = n3 * n3;
                if ((n3 = (int)((f5 = (f11 = f11 * f11 + (f8 *= f8)) - f12) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1))) < 0) {
                    viewDragHelper = this.f;
                    n4 = (int)f6;
                    int n8 = (int)f7;
                    if ((n8 = (int)(ViewDragHelper.l((View)viewDragHelper, n4, n8) ? 1 : 0)) != 0) {
                        n8 = (int)(this.e ? 1 : 0);
                        n3 = 0;
                        f12 = 0.0f;
                        viewDragHelper = null;
                        if (n8 == 0) {
                            this.q = false;
                        }
                        if ((n8 = (int)(this.r ? 1 : 0)) != 0 || (n8 = (int)(this.e(f7 = 1.0f) ? 1 : 0)) != 0) {
                            this.q = false;
                        }
                    }
                }
            }
        } else {
            float f14 = motionEvent.getX();
            float f15 = motionEvent.getY();
            this.l = f14;
            this.m = f15;
        }
        return n7 != 0;
    }

    public final void removeView(View view) {
        ViewParent viewParent = view.getParent();
        boolean bl2 = viewParent instanceof SlidingPaneLayout$e;
        if (bl2) {
            view = (View)view.getParent();
            super.removeView(view);
            return;
        }
        super.removeView(view);
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        boolean bl2 = this.isInTouchMode();
        if (!bl2 && !(bl2 = this.e)) {
            boolean bl3;
            view2 = this.f;
            if (view == view2) {
                bl3 = true;
            } else {
                bl3 = false;
                view = null;
            }
            this.q = bl3;
        }
    }

    public void setCoveredFadeColor(int n3) {
        this.b = n3;
    }

    public final void setLockMode(int n3) {
        this.u = n3;
    }

    public void setPanelSlideListener(SlidingPaneLayout$d slidingPaneLayout$d) {
        SlidingPaneLayout$d slidingPaneLayout$d2 = this.o;
        CopyOnWriteArrayList copyOnWriteArrayList = this.n;
        if (slidingPaneLayout$d2 != null) {
            copyOnWriteArrayList.remove(slidingPaneLayout$d2);
        }
        if (slidingPaneLayout$d != null) {
            copyOnWriteArrayList.add(slidingPaneLayout$d);
        }
        this.o = slidingPaneLayout$d;
    }

    public void setParallaxDistance(int n3) {
        this.k = n3;
        this.requestLayout();
    }

    public void setShadowDrawable(Drawable drawable2) {
        this.setShadowDrawableLeft(drawable2);
    }

    public void setShadowDrawableLeft(Drawable drawable2) {
        this.c = drawable2;
    }

    public void setShadowDrawableRight(Drawable drawable2) {
        this.d = drawable2;
    }

    public void setShadowResource(int n3) {
        Drawable drawable2 = this.getResources().getDrawable(n3);
        this.setShadowDrawableLeft(drawable2);
    }

    public void setShadowResourceLeft(int n3) {
        Drawable drawable2 = t70.getDrawable(this.getContext(), n3);
        this.setShadowDrawableLeft(drawable2);
    }

    public void setShadowResourceRight(int n3) {
        Drawable drawable2 = t70.getDrawable(this.getContext(), n3);
        this.setShadowDrawableRight(drawable2);
    }

    public void setSliderFadeColor(int n3) {
        this.a = n3;
    }
}

