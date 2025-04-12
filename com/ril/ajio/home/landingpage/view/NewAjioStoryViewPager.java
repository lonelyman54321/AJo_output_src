/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$NotFoundException
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.FocusFinder
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.SoundEffectConstants
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.animation.Interpolator
 *  android.widget.EdgeEffect
 *  android.widget.Scroller
 */
package com.ril.ajio.home.landingpage.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.core.view.a;
import androidx.customview.view.AbsSavedState;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$3;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$LayoutParams;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$SavedState;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$a;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$b;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$c;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$d;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$e;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$f;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$g;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$h;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$i;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

public class NewAjioStoryViewPager
extends ViewGroup {
    public static final int[] t0 = new int[]{16842931};
    public static final NewAjioStoryViewPager$a u0;
    public static final NewAjioStoryViewPager$b v0;
    public static final NewAjioStoryViewPager$j w0;
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public float F;
    public float G;
    public int H;
    public VelocityTracker I;
    public int J;
    public int K;
    public int L;
    public int M;
    public EdgeEffect N;
    public EdgeEffect O;
    public boolean P;
    public boolean Q;
    public int R;
    public ArrayList S;
    public NewAjioStoryViewPager$g T;
    public NewAjioStoryViewPager$h U;
    public int a = 600;
    public int b;
    public final ArrayList c;
    public final NewAjioStoryViewPager$e d;
    public final Rect e;
    public Uk2 f;
    public int g;
    public int h;
    public Parcelable i;
    public ClassLoader j;
    public Scroller k;
    public int k0;
    public boolean l;
    public NewAjioStoryViewPager$i m;
    public int n;
    public Drawable o;
    public int p;
    public int p0;
    public int q;
    public ArrayList q0;
    public float r;
    public final Runnable r0;
    public float s;
    public int s0;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public boolean y;
    public boolean z;

    static {
        Object object = new Object();
        u0 = object;
        v0 = object = new Object();
        w0 = object = new Object();
    }

    public NewAjioStoryViewPager(Context object) {
        super(object);
        int n3;
        int n4;
        super();
        this.c = object;
        super();
        this.d = object;
        super();
        this.e = object;
        this.h = n4 = -1;
        this.i = null;
        this.j = null;
        this.r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        this.x = n3 = 1;
        this.H = n4;
        this.P = n3;
        super(this);
        this.r0 = object;
        this.s0 = 0;
        this.l();
    }

    public NewAjioStoryViewPager(Context object, AttributeSet attributeSet) {
        super(object, attributeSet);
        int n3;
        int n4;
        super();
        this.c = object;
        super();
        this.d = object;
        super();
        this.e = object;
        this.h = n4 = -1;
        this.i = null;
        this.j = null;
        this.r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        this.x = n3 = 1;
        this.H = n4;
        this.P = n3;
        super(this);
        this.r0 = object;
        this.s0 = 0;
        this.l();
    }

    public static boolean d(View view, boolean bl2, int n3, int n4, int n7) {
        boolean bl3;
        boolean bl4 = view instanceof ViewGroup;
        int n8 = 1;
        if (bl4) {
            View view2 = view;
            view2 = (ViewGroup)view;
            int n10 = view.getScrollX();
            int n14 = view.getScrollY();
            for (int i3 = view2.getChildCount() - n8; i3 >= 0; i3 += -1) {
                int n15;
                int n16 = n4 + n10;
                View view3 = view2.getChildAt(i3);
                int n17 = view3.getLeft();
                if (n16 < n17 || n16 >= (n17 = view3.getRight()) || (n17 = n7 + n14) < (n15 = view3.getTop()) || n17 >= (n15 = view3.getBottom())) continue;
                n15 = view3.getLeft();
                boolean bl5 = NewAjioStoryViewPager.d(view3, n8 != 0, n3, n16 -= n15, n17 -= (n15 = view3.getTop()));
                if (!bl5) continue;
                return n8 != 0;
            }
        }
        if (!bl2 || !(bl3 = view.canScrollHorizontally((int)((bl2 = -n3) ? 1 : 0)))) {
            n8 = 0;
        }
        return n8 != 0;
    }

    private int getClientWidth() {
        int n3 = this.getMeasuredWidth();
        int n4 = this.getPaddingLeft();
        n3 -= n4;
        n4 = this.getPaddingRight();
        return n3 - n4;
    }

    private void setScrollingCacheEnabled(boolean bl2) {
        boolean bl3 = this.v;
        if (bl3 != bl2) {
            this.v = bl2;
        }
    }

    public final NewAjioStoryViewPager$e a(int n3, int n4) {
        int n7;
        float f5;
        Object object;
        NewAjioStoryViewPager$e newAjioStoryViewPager$e = new NewAjioStoryViewPager$e();
        newAjioStoryViewPager$e.b = n3;
        Uk2 uk2 = this.f;
        newAjioStoryViewPager$e.a = object = uk2.f(n3, this);
        this.f.getClass();
        n3 = 1065353216;
        newAjioStoryViewPager$e.d = f5 = 1.0f;
        object = this.c;
        if (n4 >= 0 && n4 < (n7 = ((ArrayList)object).size())) {
            ((ArrayList)object).add(n4, newAjioStoryViewPager$e);
        } else {
            ((ArrayList)object).add(newAjioStoryViewPager$e);
        }
        return newAjioStoryViewPager$e;
    }

    public final void addFocusables(ArrayList arrayList, int n3, int n4) {
        int n7;
        int n8 = arrayList.size();
        int n10 = this.getDescendantFocusability();
        if (n10 != (n7 = 393216)) {
            int n14;
            for (n7 = 0; n7 < (n14 = this.getChildCount()); ++n7) {
                int n15;
                NewAjioStoryViewPager$e newAjioStoryViewPager$e;
                View view = this.getChildAt(n7);
                int n16 = view.getVisibility();
                if (n16 != 0 || (newAjioStoryViewPager$e = this.i(view)) == null || (n16 = newAjioStoryViewPager$e.b) != (n15 = this.g)) continue;
                view.addFocusables(arrayList, n3, n4);
            }
        }
        if (n10 != (n3 = 262144) || n8 == (n3 = arrayList.size())) {
            n3 = (int)(this.isFocusable() ? 1 : 0);
            if (n3 == 0) {
                return;
            }
            n3 = 1;
            if ((n4 &= n3) == n3 && (n3 = (int)(this.isInTouchMode() ? 1 : 0)) != 0 && (n3 = (int)(this.isFocusableInTouchMode() ? 1 : 0)) == 0) {
                return;
            }
            arrayList.add(this);
        }
    }

    public final void addTouchables(ArrayList arrayList) {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.getChildCount()); ++i3) {
            int n4;
            NewAjioStoryViewPager$e newAjioStoryViewPager$e;
            View view = this.getChildAt(i3);
            int n7 = view.getVisibility();
            if (n7 != 0 || (newAjioStoryViewPager$e = this.i(view)) == null || (n7 = newAjioStoryViewPager$e.b) != (n4 = this.g)) continue;
            view.addTouchables(arrayList);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void addView(View object, int n3, ViewGroup.LayoutParams layoutParams) {
        void var2_3;
        boolean bl2;
        NewAjioStoryViewPager$LayoutParams newAjioStoryViewPager$LayoutParams;
        boolean bl3 = this.checkLayoutParams(newAjioStoryViewPager$LayoutParams);
        if (!bl3) {
            newAjioStoryViewPager$LayoutParams = new NewAjioStoryViewPager$LayoutParams();
        }
        NewAjioStoryViewPager$LayoutParams newAjioStoryViewPager$LayoutParams2 = newAjioStoryViewPager$LayoutParams;
        newAjioStoryViewPager$LayoutParams2 = newAjioStoryViewPager$LayoutParams;
        boolean bl4 = newAjioStoryViewPager$LayoutParams2.a;
        Object object2 = object.getClass();
        Class<NewAjioStoryViewPager$d> clazz = NewAjioStoryViewPager$d.class;
        object2 = ((Class)object2).getAnnotation(clazz);
        boolean bl5 = true;
        if (object2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        newAjioStoryViewPager$LayoutParams2.a = bl4 |= bl2;
        bl2 = this.u;
        if (!bl2) {
            super.addView((View)object, (int)var2_3, (ViewGroup.LayoutParams)newAjioStoryViewPager$LayoutParams);
            return;
        }
        if (!bl4) {
            newAjioStoryViewPager$LayoutParams2.d = bl5;
            this.addViewInLayout((View)object, (int)var2_3, newAjioStoryViewPager$LayoutParams);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Cannot add pager decor view during layout");
        throw illegalStateException;
    }

    public final void b(NewAjioStoryViewPager$g newAjioStoryViewPager$g) {
        ArrayList arrayList = this.S;
        if (arrayList == null) {
            this.S = arrayList = new ArrayList();
        }
        this.S.add(newAjioStoryViewPager$g);
    }

    /*
     * Unable to fully structure code
     */
    public final boolean c(int var1_1) {
        block17: {
            block14: {
                block15: {
                    block16: {
                        block13: {
                            var2_2 = this.findFocus();
                            var3_3 = null;
                            if (var2_2 == this) {
                                while (true) {
                                    var4_7 = 0;
                                    var2_2 = null;
                                    break block13;
                                    break;
                                }
                            }
                            if (var2_2 != null) {
                                var5_4 = var2_2.getParent();
                                while ((var6_5 = var5_4 instanceof ViewGroup) != 0) {
                                    if (var5_4 != this) {
                                        var5_4 = var5_4.getParent();
                                        continue;
                                    }
                                    break block13;
                                }
                                var2_2 = var2_2.getParent();
                                while (true) {
                                    if ((var7_6 = var2_2 instanceof ViewGroup) == 0) ** continue;
                                    var2_2.getClass();
                                    var2_2 = ((ViewParent)var2_2).getParent();
                                }
                            }
                        }
                        var3_3 = FocusFinder.getInstance().findNextFocus((ViewGroup)this, var2_2, var1_1);
                        var7_6 = 1;
                        var6_5 = 0;
                        var8_8 = null;
                        var9_9 = 66;
                        var10_10 = 17;
                        if (var3_3 == null || var3_3 == var2_2) break block14;
                        var11_11 = this.e;
                        if (var1_1 != var10_10) break block15;
                        var12_12 = this.h(var11_11, var3_3);
                        var9_9 = var12_12.left;
                        var13_13 = this.h(var11_11, var2_2);
                        var10_10 = var13_13.left;
                        if (var2_2 == null || var9_9 < var10_10) break block16;
                        var4_7 = this.g;
                        if (var4_7 <= 0) ** GOTO lbl-1000
                        this.setCurrentItem(var4_7 -= var7_6, (boolean)var7_6);
                        ** GOTO lbl63
                    }
                    var6_5 = (int)var3_3.requestFocus();
                    break block17;
                }
                if (var1_1 == var9_9) {
                    var5_4 = this.h(var11_11, var3_3);
                    var7_6 = var5_4.left;
                    var8_8 = this.h(var11_11, var2_2);
                    var6_5 = var8_8.left;
                    var6_5 = var2_2 != null && var7_6 <= var6_5 ? (int)this.o() : (int)var3_3.requestFocus();
                }
                break block17;
            }
            if (var1_1 != var10_10 && var1_1 != var7_6) {
                if (var1_1 == var9_9 || var1_1 == (var4_7 = 2)) {
                    var6_5 = this.o();
                }
            } else {
                var4_7 = this.g;
                if (var4_7 > 0) {
                    this.setCurrentItem(var4_7 -= var7_6, (boolean)var7_6);
                } else lbl-1000:
                // 2 sources

                {
                    var7_6 = 0;
                    var5_4 = null;
                }
lbl63:
                // 3 sources

                var6_5 = var7_6;
            }
        }
        if (var6_5 != 0) {
            var1_1 = SoundEffectConstants.getContantForFocusDirection((int)var1_1);
            this.playSoundEffect(var1_1);
        }
        return (boolean)var6_5;
    }

    public boolean canScrollHorizontally(int n3) {
        Uk2 uk2 = this.f;
        boolean bl2 = false;
        if (uk2 == null) {
            return false;
        }
        int n4 = this.getClientWidth();
        int n7 = this.getScrollX();
        if (n3 < 0) {
            float f5 = n4;
            float f6 = this.r;
            n3 = (int)(f5 *= f6);
            if (n7 > n3) {
                bl2 = true;
            }
            return bl2;
        }
        if (n3 > 0) {
            float f7 = n4;
            float f8 = this.s;
            n3 = (int)(f7 *= f8);
            if (n7 < n3) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean bl2;
        boolean bl3 = layoutParams instanceof NewAjioStoryViewPager$LayoutParams;
        if (bl3 && (bl2 = super.checkLayoutParams(layoutParams))) {
            bl2 = true;
        } else {
            bl2 = false;
            layoutParams = null;
        }
        return bl2;
    }

    public final void computeScroll() {
        int n3;
        this.l = n3 = 1;
        Scroller scroller = this.k;
        int n4 = scroller.isFinished();
        if (n4 == 0 && (n4 = (scroller = this.k).computeScrollOffset()) != 0) {
            n3 = this.getScrollX();
            n4 = this.getScrollY();
            Scroller scroller2 = this.k;
            int n7 = scroller2.getCurrX();
            Scroller scroller3 = this.k;
            int n8 = scroller3.getCurrY();
            if (n3 != n7 || n4 != n8) {
                this.scrollTo(n7, n8);
                n3 = (int)(this.p(n7) ? 1 : 0);
                if (n3 == 0) {
                    this.k.abortAnimation();
                    n3 = 0;
                    this.scrollTo(0, n8);
                }
            }
            this.postInvalidateOnAnimation();
        } else {
            this.e(n3 != 0);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int n3;
        block1: {
            int n4;
            block6: {
                block2: {
                    block7: {
                        int n7;
                        block3: {
                            block4: {
                                block5: {
                                    int n8 = super.dispatchKeyEvent(keyEvent);
                                    n3 = 1;
                                    if (n8 != 0) break block1;
                                    n8 = keyEvent.getAction();
                                    if (n8 != 0) break block2;
                                    n8 = keyEvent.getKeyCode();
                                    int n10 = 21;
                                    n7 = 2;
                                    if (n8 == n10) break block3;
                                    n10 = 22;
                                    if (n8 == n10) break block4;
                                    n10 = 61;
                                    if (n8 != n10) break block2;
                                    n8 = (int)(keyEvent.hasNoModifiers() ? 1 : 0);
                                    if (n8 == 0) break block5;
                                    n4 = (int)(this.c(n7) ? 1 : 0);
                                    break block6;
                                }
                                n4 = (int)(keyEvent.hasModifiers(n3) ? 1 : 0);
                                if (n4 == 0) break block2;
                                n4 = (int)(this.c(n3) ? 1 : 0);
                                break block6;
                            }
                            n4 = keyEvent.hasModifiers(n7);
                            n4 = n4 != 0 ? (int)(this.o() ? 1 : 0) : (int)(this.c(66) ? 1 : 0);
                            break block6;
                        }
                        n4 = keyEvent.hasModifiers(n7);
                        if (n4 == 0) break block7;
                        n4 = this.g;
                        if (n4 <= 0) break block2;
                        this.setCurrentItem(n4 -= n3, n3 != 0);
                        n4 = 1;
                        break block6;
                    }
                    n4 = (int)(this.c(17) ? 1 : 0);
                    break block6;
                }
                n4 = 0;
                keyEvent = null;
            }
            if (n4 == 0) {
                n3 = 0;
            }
        }
        return n3 != 0;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int n3;
        int n4 = accessibilityEvent.getEventType();
        if (n4 == (n3 = 4096)) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        n4 = this.getChildCount();
        n3 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            boolean bl2;
            int n7;
            NewAjioStoryViewPager$e newAjioStoryViewPager$e;
            View view = this.getChildAt(i3);
            int n8 = view.getVisibility();
            if (n8 != 0 || (newAjioStoryViewPager$e = this.i(view)) == null || (n8 = newAjioStoryViewPager$e.b) != (n7 = this.g) || !(bl2 = view.dispatchPopulateAccessibilityEvent(accessibilityEvent))) continue;
            return true;
        }
        return false;
    }

    public final void draw(Canvas object) {
        Object object2;
        int n3;
        super.draw(object);
        int n4 = this.getOverScrollMode();
        int n7 = 0;
        EdgeEffect edgeEffect = null;
        if (n4 != 0 && (n4 != (n3 = 1) || (object2 = this.f) == null || (n4 = ((Uk2)object2).c()) <= n3)) {
            this.N.finish();
            object = this.O;
            object.finish();
        } else {
            float f5;
            float f6;
            int n8;
            int n10;
            object2 = this.N;
            n4 = (int)(object2.isFinished() ? 1 : 0);
            if (n4 == 0) {
                n4 = object.save();
                n7 = this.getHeight();
                n3 = this.getPaddingTop();
                n7 -= n3;
                n3 = this.getPaddingBottom();
                n7 -= n3;
                n3 = this.getWidth();
                object.rotate(270.0f);
                n10 = -n7;
                n8 = this.getPaddingTop() + n10;
                float f7 = n8;
                f6 = this.r;
                f5 = n3;
                object.translate(f7, f6 *= f5);
                EdgeEffect edgeEffect2 = this.N;
                edgeEffect2.setSize(n7, n3);
                edgeEffect = this.N;
                n7 = (int)(edgeEffect.draw(object) ? 1 : 0);
                object.restoreToCount(n4);
            }
            if ((n4 = (int)((object2 = this.O).isFinished() ? 1 : 0)) == 0) {
                n4 = object.save();
                n3 = this.getWidth();
                n10 = this.getHeight();
                n8 = this.getPaddingTop();
                n10 -= n8;
                n8 = this.getPaddingBottom();
                n10 -= n8;
                object.rotate(90.0f);
                n8 = -this.getPaddingTop();
                f6 = n8;
                f5 = -(this.s + 1.0f);
                float f8 = n3;
                object.translate(f6, f5 *= f8);
                EdgeEffect edgeEffect3 = this.O;
                edgeEffect3.setSize(n10, n3);
                EdgeEffect edgeEffect4 = this.O;
                n3 = (int)(edgeEffect4.draw(object) ? 1 : 0);
                n7 |= n3;
                object.restoreToCount(n4);
            }
        }
        if (n7 != 0) {
            object = ViewCompat.a;
            this.postInvalidateOnAnimation();
        }
    }

    public final void drawableStateChanged() {
        boolean bl2;
        super.drawableStateChanged();
        Drawable drawable2 = this.o;
        if (drawable2 != null && (bl2 = drawable2.isStateful())) {
            int[] nArray = this.getDrawableState();
            drawable2.setState(nArray);
        }
    }

    public final void e(boolean bl2) {
        Object object;
        int n3;
        Scroller scroller;
        Runnable runnable2;
        int n4 = this.s0;
        int n7 = 2;
        int n8 = 1;
        if (n4 == n7) {
            n4 = 1;
        } else {
            n4 = 0;
            runnable2 = null;
        }
        if (n4 != 0) {
            this.setScrollingCacheEnabled(false);
            scroller = this.k;
            n7 = scroller.isFinished() ^ n8;
            if (n7 != 0) {
                scroller = this.k;
                scroller.abortAnimation();
                n7 = this.getScrollX();
                int n10 = this.getScrollY();
                Scroller scroller2 = this.k;
                n3 = scroller2.getCurrX();
                Scroller scroller3 = this.k;
                int n14 = scroller3.getCurrY();
                if (n7 != n3 || n10 != n14) {
                    this.scrollTo(n3, n14);
                    if (n3 != n7) {
                        this.p(n3);
                    }
                }
            }
        }
        this.w = false;
        scroller = null;
        for (n7 = 0; n7 < (n3 = ((ArrayList)(object = this.c)).size()); n7 += n8) {
            object = (NewAjioStoryViewPager$e)((ArrayList)object).get(n7);
            n3 = (int)(((NewAjioStoryViewPager$e)object).c ? 1 : 0);
            if (n3 == 0) continue;
            ((NewAjioStoryViewPager$e)object).c = false;
            n4 = 1;
        }
        if (n4 != 0) {
            runnable2 = this.r0;
            if (bl2) {
                this.postOnAnimation(runnable2);
            } else {
                runnable2 = (NewAjioStoryViewPager$3)runnable2;
                ((NewAjioStoryViewPager$3)runnable2).run();
            }
        }
    }

    public final void f() {
        Object object;
        int n3;
        int n4;
        Uk2 uk2 = this.f;
        this.b = n4 = uk2.c();
        ArrayList arrayList = this.c;
        int n7 = arrayList.size();
        int n8 = this.x * 2;
        int n10 = 1;
        if (n7 < (n8 += n10) && (n7 = arrayList.size()) < n4) {
            n4 = 1;
        } else {
            n4 = 0;
            uk2 = null;
        }
        n7 = this.g;
        Object object2 = null;
        for (n8 = 0; n8 < (n3 = arrayList.size()); ++n8) {
            object = (NewAjioStoryViewPager$e)arrayList.get(n8);
            Uk2 uk22 = this.f;
            object = ((NewAjioStoryViewPager$e)object).a;
            uk22.d(object);
        }
        object2 = u0;
        Collections.sort(arrayList, object2);
        if (n4 != 0) {
            n4 = this.getChildCount();
            arrayList = null;
            for (int i3 = 0; i3 < n4; ++i3) {
                object2 = (NewAjioStoryViewPager$LayoutParams)this.getChildAt(i3).getLayoutParams();
                n3 = (int)(((NewAjioStoryViewPager$LayoutParams)((Object)object2)).a ? 1 : 0);
                if (n3 != 0) continue;
                n3 = 0;
                object = null;
                ((NewAjioStoryViewPager$LayoutParams)((Object)object2)).c = 0.0f;
            }
            this.w(n7, false, n10 != 0, 0);
            this.requestLayout();
        }
    }

    public final void g(int n3) {
        Object object = this.T;
        if (object != null) {
            object.onPageSelected(n3);
        }
        if ((object = this.S) != null) {
            int n4 = ((ArrayList)object).size();
            for (int i3 = 0; i3 < n4; ++i3) {
                NewAjioStoryViewPager$g newAjioStoryViewPager$g = (NewAjioStoryViewPager$g)this.S.get(i3);
                if (newAjioStoryViewPager$g == null) continue;
                newAjioStoryViewPager$g.onPageSelected(n3);
            }
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        NewAjioStoryViewPager$LayoutParams newAjioStoryViewPager$LayoutParams = new NewAjioStoryViewPager$LayoutParams();
        return newAjioStoryViewPager$LayoutParams;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = this.getContext();
        NewAjioStoryViewPager$LayoutParams newAjioStoryViewPager$LayoutParams = new NewAjioStoryViewPager$LayoutParams(context, attributeSet);
        return newAjioStoryViewPager$LayoutParams;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams = new NewAjioStoryViewPager$LayoutParams();
        return layoutParams;
    }

    public Uk2 getAdapter() {
        return this.f;
    }

    public final int getChildDrawingOrder(int n3, int n4) {
        int n7 = this.p0;
        int n8 = 2;
        if (n7 == n8) {
            n4 = (n3 += -1) - n4;
        }
        return ((NewAjioStoryViewPager$LayoutParams)((View)this.q0.get((int)n4)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.g;
    }

    public int getOffscreenPageLimit() {
        return this.x;
    }

    public int getPageMargin() {
        return this.n;
    }

    public final Rect h(Rect rect, View view) {
        int n3;
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = n3 = view.getLeft();
        rect.right = n3 = view.getRight();
        rect.top = n3 = view.getTop();
        rect.bottom = n3 = view.getBottom();
        while ((n3 = (view = view.getParent()) instanceof ViewGroup) != 0 && view != this) {
            int n4;
            view = (ViewGroup)view;
            n3 = rect.left;
            rect.left = n4 = view.getLeft() + n3;
            n3 = rect.right;
            rect.right = n4 = view.getRight() + n3;
            n3 = rect.top;
            rect.top = n4 = view.getTop() + n3;
            n3 = rect.bottom;
            rect.bottom = n4 = view.getBottom() + n3;
        }
        return rect;
    }

    public final NewAjioStoryViewPager$e i(View view) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.c)).size()); ++i3) {
            object = (NewAjioStoryViewPager$e)((ArrayList)object).get(i3);
            Uk2 uk2 = this.f;
            Object object2 = ((NewAjioStoryViewPager$e)object).a;
            n3 = (int)(uk2.g(view, object2) ? 1 : 0);
            if (n3 == 0) continue;
            return object;
        }
        return null;
    }

    public final NewAjioStoryViewPager$e j() {
        ArrayList arrayList;
        int n3;
        float f5;
        int n4;
        float f6;
        float f7;
        int n7;
        int n8 = this.getClientWidth();
        float f8 = 0.0f;
        Uk2 uk2 = null;
        if (n8 > 0) {
            n7 = this.getScrollX();
            f7 = n7;
            f6 = n8;
            f7 /= f6;
        } else {
            n7 = 0;
            f7 = 0.0f;
        }
        if (n8 > 0) {
            n4 = this.n;
            f6 = n4;
            f5 = n8;
            f6 /= f5;
        } else {
            n4 = 0;
            f6 = 0.0f;
        }
        n8 = 0;
        f5 = 0.0f;
        int n10 = 1;
        NewAjioStoryViewPager$e newAjioStoryViewPager$e = null;
        NewAjioStoryViewPager$e newAjioStoryViewPager$e2 = null;
        float f11 = 0.0f;
        Object object = 0;
        float f12 = 0.0f;
        NewAjioStoryViewPager$e newAjioStoryViewPager$e3 = null;
        int n14 = -1;
        int n15 = 1;
        for (int i3 = 0; i3 < (n3 = (arrayList = this.c).size()); ++i3) {
            int n16;
            NewAjioStoryViewPager$e newAjioStoryViewPager$e4 = (NewAjioStoryViewPager$e)arrayList.get(i3);
            if (n15 == 0 && (n16 = newAjioStoryViewPager$e4.b) != (n14 += n10)) {
                f8 = f8 + f12 + f6;
                newAjioStoryViewPager$e3 = this.d;
                newAjioStoryViewPager$e3.e = f8;
                newAjioStoryViewPager$e3.b = n14;
                uk2 = this.f;
                uk2.getClass();
                newAjioStoryViewPager$e3.d = f8 = 1.0f;
                i3 += -1;
                newAjioStoryViewPager$e = newAjioStoryViewPager$e3;
            } else {
                newAjioStoryViewPager$e = newAjioStoryViewPager$e4;
            }
            f8 = newAjioStoryViewPager$e.e;
            f12 = newAjioStoryViewPager$e.d + f8 + f6;
            if (n15 == 0 && (n15 = f7 == f8 ? 0 : (f7 < f8 ? -1 : 1)) < 0) {
                return newAjioStoryViewPager$e2;
            }
            object = f7 == f12 ? 0 : (f7 < f12 ? -1 : 1);
            if (object >= 0 && i3 != (object = arrayList.size() - n10)) {
                object = newAjioStoryViewPager$e.b;
                f11 = newAjioStoryViewPager$e.d;
                n15 = 0;
                n14 = object;
                f12 = f11;
                newAjioStoryViewPager$e2 = newAjioStoryViewPager$e;
                continue;
            }
            return newAjioStoryViewPager$e;
        }
        return newAjioStoryViewPager$e2;
    }

    public final NewAjioStoryViewPager$e k(int n3) {
        Object object;
        int n4;
        for (int i3 = 0; i3 < (n4 = ((ArrayList)(object = this.c)).size()); ++i3) {
            object = (NewAjioStoryViewPager$e)((ArrayList)object).get(i3);
            n4 = ((NewAjioStoryViewPager$e)object).b;
            if (n4 != n3) continue;
            return object;
        }
        return null;
    }

    public final void l() {
        int n3;
        int n4;
        int n7;
        Scroller scroller;
        NewAjioStoryViewPager$c newAjioStoryViewPager$c = null;
        this.setWillNotDraw(false);
        this.setDescendantFocusability(262144);
        int n8 = 1;
        this.setFocusable(n8 != 0);
        Object object = this.getContext();
        NewAjioStoryViewPager$b newAjioStoryViewPager$b = v0;
        this.k = scroller = new Scroller(object, (Interpolator)newAjioStoryViewPager$b);
        scroller = ViewConfiguration.get((Context)object);
        newAjioStoryViewPager$b = object.getResources().getDisplayMetrics();
        float f5 = ((DisplayMetrics)newAjioStoryViewPager$b).density;
        this.C = n7 = scroller.getScaledPagingTouchSlop();
        float f6 = 400.0f * f5;
        this.J = n7 = (int)f6;
        this.K = n4 = scroller.getScaledMaximumFlingVelocity();
        scroller = new EdgeEffect(object);
        this.N = scroller;
        scroller = new EdgeEffect(object);
        this.O = scroller;
        this.L = n3 = (int)(25.0f * f5);
        this.M = n3 = (int)(2.0f * f5);
        float f7 = 16.0f;
        this.A = n3 = (int)(f5 *= f7);
        object = new NewAjioStoryViewPager$f(this);
        ViewCompat.s((View)this, (a)object);
        n3 = this.getImportantForAccessibility();
        if (n3 == 0) {
            this.setImportantForAccessibility(n8);
        }
        newAjioStoryViewPager$c = new NewAjioStoryViewPager$c(this);
        ViewCompat$c.o((View)this, newAjioStoryViewPager$c);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void m(int n3, float f5, int n4) {
        NewAjioStoryViewPager$g newAjioStoryViewPager$g;
        Object object;
        int n7;
        int n8;
        int n10;
        int n14;
        block7: {
            n3 = this.R;
            n14 = 0;
            n4 = 1;
            if (n3 <= 0) break block7;
            n3 = this.getScrollX();
            n10 = this.getPaddingLeft();
            int n15 = this.getPaddingRight();
            n8 = this.getWidth();
            n7 = this.getChildCount();
            for (int i3 = 0; i3 < n7; ++i3) {
                int n16;
                int n17;
                View view;
                block11: {
                    block12: {
                        block8: {
                            block9: {
                                block10: {
                                    view = this.getChildAt(i3);
                                    NewAjioStoryViewPager$LayoutParams newAjioStoryViewPager$LayoutParams = (NewAjioStoryViewPager$LayoutParams)view.getLayoutParams();
                                    n17 = newAjioStoryViewPager$LayoutParams.a;
                                    if (n17 == 0) continue;
                                    n16 = newAjioStoryViewPager$LayoutParams.b & 7;
                                    if (n16 == n4) break block8;
                                    n17 = 3;
                                    if (n16 == n17) break block9;
                                    n17 = 5;
                                    if (n16 == n17) break block10;
                                    n16 = n10;
                                    break block11;
                                }
                                n16 = n8 - n15;
                                n17 = view.getMeasuredWidth();
                                n16 -= n17;
                                n17 = view.getMeasuredWidth();
                                n15 += n17;
                                break block12;
                            }
                            n16 = view.getWidth() + n10;
                            break block11;
                        }
                        n16 = view.getMeasuredWidth();
                        n16 = Math.max((n8 - n16) / 2, n10);
                    }
                    int n18 = n16;
                    n16 = n10;
                    n10 = n18;
                }
                n10 += n3;
                n17 = view.getLeft();
                if ((n10 -= n17) != 0) {
                    view.offsetLeftAndRight(n10);
                }
                n10 = n16;
            }
        }
        if ((object = this.S) != null) {
            n3 = ((ArrayList)object).size();
            for (n10 = 0; n10 < n3; ++n10) {
                newAjioStoryViewPager$g = (NewAjioStoryViewPager$g)this.S.get(n10);
            }
        }
        if ((object = this.U) != null) {
            n3 = this.getScrollX();
            n10 = this.getChildCount();
            while (n14 < n10) {
                newAjioStoryViewPager$g = this.getChildAt(n14);
                NewAjioStoryViewPager$LayoutParams newAjioStoryViewPager$LayoutParams = (NewAjioStoryViewPager$LayoutParams)newAjioStoryViewPager$g.getLayoutParams();
                n8 = (int)(newAjioStoryViewPager$LayoutParams.a ? 1 : 0);
                if (n8 == 0) {
                    n8 = newAjioStoryViewPager$g.getLeft() - n3;
                    float f6 = n8;
                    n7 = this.getClientWidth();
                    float f7 = n7;
                    NewAjioStoryViewPager$h newAjioStoryViewPager$h = this.U;
                    newAjioStoryViewPager$h.a(f6 /= f7, (View)newAjioStoryViewPager$g);
                }
                ++n14;
            }
        }
        this.Q = n4;
    }

    public final void n(MotionEvent motionEvent) {
        int n3;
        int n4 = motionEvent.getActionIndex();
        int n7 = motionEvent.getPointerId(n4);
        if (n7 == (n3 = this.H)) {
            int n8;
            float f5;
            n4 = n4 == 0 ? 1 : 0;
            this.D = f5 = motionEvent.getX(n4);
            this.H = n8 = motionEvent.getPointerId(n4);
            motionEvent = this.I;
            if (motionEvent != null) {
                motionEvent.clear();
            }
        }
    }

    public final boolean o() {
        Uk2 uk2 = this.f;
        if (uk2 != null) {
            int n3 = this.g;
            int n4 = uk2.c();
            int n7 = 1;
            if (n3 < (n4 -= n7)) {
                n4 = this.g + n7;
                this.setCurrentItem(n4, n7 != 0);
                return n7 != 0;
            }
        }
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
    }

    public final void onDetachedFromWindow() {
        boolean bl2;
        Runnable runnable2 = this.r0;
        this.removeCallbacks(runnable2);
        runnable2 = this.k;
        if (runnable2 != null && !(bl2 = runnable2.isFinished())) {
            runnable2 = this.k;
            runnable2.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        Uk2 uk2;
        int n3;
        Object object;
        NewAjioStoryViewPager newAjioStoryViewPager = this;
        super.onDraw(canvas);
        int n4 = this.n;
        if (n4 > 0 && (object = this.o) != null && (n3 = ((ArrayList)(object = this.c)).size()) > 0 && (uk2 = this.f) != null) {
            n3 = this.getScrollX();
            int n7 = this.getWidth();
            int n8 = this.n;
            float f5 = n8;
            float f6 = n7;
            f5 /= f6;
            int n10 = 0;
            NewAjioStoryViewPager$e newAjioStoryViewPager$e = (NewAjioStoryViewPager$e)((ArrayList)object).get(0);
            float f7 = newAjioStoryViewPager$e.e;
            int n14 = ((ArrayList)object).size();
            int n15 = n14 + -1;
            NewAjioStoryViewPager$e newAjioStoryViewPager$e2 = (NewAjioStoryViewPager$e)((ArrayList)object).get(n15);
            n15 = newAjioStoryViewPager$e2.b;
            for (int i3 = newAjioStoryViewPager$e.b; i3 < n15; ++i3) {
                float f8;
                float f11;
                Object object2;
                Uk2 uk22;
                float f12;
                float f14;
                int n16;
                while (i3 > (n16 = newAjioStoryViewPager$e.b) && n10 < n14) {
                    newAjioStoryViewPager$e = (NewAjioStoryViewPager$e)((ArrayList)object).get(++n10);
                }
                if (i3 == n16) {
                    f7 = newAjioStoryViewPager$e.e;
                    f14 = newAjioStoryViewPager$e.d;
                    f12 = (f7 + f14) * f6;
                    f7 = f7 + f14 + f5;
                } else {
                    uk22 = newAjioStoryViewPager.f;
                    uk22.getClass();
                    n16 = 1065353216;
                    f14 = 1.0f;
                    f12 = (f7 + f14) * f6;
                    f7 = f14 = f14 + f5 + f7;
                }
                f14 = (float)newAjioStoryViewPager.n + f12;
                float f15 = n3;
                n16 = (int)(f14 == f15 ? 0 : (f14 > f15 ? 1 : -1));
                if (n16 > 0) {
                    uk22 = newAjioStoryViewPager.o;
                    int n17 = Math.round(f12);
                    int n18 = newAjioStoryViewPager.p;
                    object2 = object;
                    f11 = (float)newAjioStoryViewPager.n + f12;
                    n4 = Math.round(f11);
                    f8 = f5;
                    n8 = newAjioStoryViewPager.q;
                    uk22.setBounds(n17, n18, n4, n8);
                    object = newAjioStoryViewPager.o;
                    object.draw(canvas);
                } else {
                    object2 = object;
                    f8 = f5;
                }
                f11 = n3 + n7;
                n4 = (int)(f12 == f11 ? 0 : (f12 > f11 ? 1 : -1));
                if (n4 > 0) break;
                object = object2;
                f5 = f8;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean onInterceptTouchEvent(MotionEvent var1_1) {
        block19: {
            block21: {
                block20: {
                    var2_2 = var1_1.getAction() & 255;
                    var3_3 = 3;
                    var4_4 = 0;
                    var5_5 = 0.0f;
                    var6_6 = null;
                    if (var2_2 == var3_3 || var2_2 == (var3_3 = 1)) break block19;
                    if (var2_2 != 0) {
                        var7_7 = (int)this.y;
                        if (var7_7 != 0) {
                            return (boolean)var3_3;
                        }
                        var7_7 = (int)this.z;
                        if (var7_7 != 0) {
                            return false;
                        }
                    }
                    var7_7 = 2;
                    var8_8 = 2.8E-45f;
                    if (var2_2 == 0) break block20;
                    if (var2_2 != var7_7) {
                        var3_3 = 6;
                        if (var2_2 == var3_3) {
                            this.n(var1_1);
                        }
                    } else {
                        var2_2 = this.H;
                        var7_7 = -1;
                        var8_8 = 0.0f / 0.0f;
                        if (var2_2 != var7_7) {
                            var2_2 = var1_1.findPointerIndex(var2_2);
                            var8_8 = var1_1.getX(var2_2);
                            var9_9 = this.D;
                            var9_9 = var8_8 - var9_9;
                            var10_10 = Math.abs(var9_9);
                            var11_11 = var1_1.getY(var2_2);
                            var12_13 = this.G;
                            var12_13 = Math.abs(var11_11 - var12_13);
                            var13_14 = 0;
                            cfr_temp_0 = var9_9 - 0.0f;
                            var14_15 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                            if (var14_15 /* !! */  != false && ((var17_18 = (cfr_temp_1 = (var15_16 = this.D) - (var16_17 = (float)this.B)) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1)) >= 0 || var14_15 /* !! */  <= 0)) {
                                var17_18 = this.getWidth();
                                var18_19 = this.B;
                                var16_17 = var17_18 -= var18_19;
                                cfr_temp_2 = var15_16 - var16_17;
                                var19_20 /* !! */  = (float)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                                if (var19_20 /* !! */  <= 0 || (var13_14 = (cfr_temp_3 = var9_9 - 0.0f) == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1)) >= 0) {
                                    var20_21 = (int)var9_9;
                                    var13_14 = (int)var8_8;
                                    var19_20 /* !! */  = (int)var11_11;
                                    if ((var20_21 = (float)NewAjioStoryViewPager.d((View)this, false, (int)var20_21, var13_14, (int)var19_20 /* !! */ )) != false) {
                                        this.D = var8_8;
                                        this.E = var11_11;
                                        this.z = var3_3;
                                        return false;
                                    }
                                }
                            }
                            if ((var20_21 = (cfr_temp_4 = var10_10 - (var5_5 = (float)(var4_4 = this.C))) == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1)) > 0 && (var20_21 = (cfr_temp_5 = (var10_10 *= (var9_9 = 0.5f)) - var12_13) == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1)) > 0) {
                                this.y = var3_3;
                                var6_6 = this.getParent();
                                if (var6_6 != null) {
                                    var6_6.requestDisallowInterceptTouchEvent((boolean)var3_3);
                                }
                                this.setScrollState(var3_3);
                                var5_5 = this.F;
                                var20_21 = this.C;
                                var9_9 = var20_21;
                                var5_5 = var14_15 /* !! */  > 0 ? (var5_5 += var9_9) : (var5_5 -= var9_9);
                                this.D = var5_5;
                                this.E = var11_11;
                                this.setScrollingCacheEnabled((boolean)var3_3);
                            } else {
                                var2_2 = (int)(var12_13 == var5_5 ? 0 : (var12_13 > var5_5 ? 1 : -1));
                                if (var2_2 > 0) {
                                    this.z = var3_3;
                                }
                            }
                            var2_2 = (int)this.y;
                            if (var2_2 != 0 && (var2_2 = (int)this.q(var8_8)) != 0) {
                                var21_22 /* !! */  = ViewCompat.a;
                                this.postInvalidateOnAnimation();
                            }
                        }
                    }
                    break block21;
                }
                this.F = var11_12 = var1_1.getX();
                this.D = var11_12;
                this.G = var11_12 = var1_1.getY();
                this.E = var11_12;
                this.H = var2_2 = var1_1.getPointerId(0);
                this.z = false;
                this.l = var3_3;
                var21_22 /* !! */  = this.k;
                var21_22 /* !! */ .computeScrollOffset();
                var2_2 = this.s0;
                if (var2_2 != var7_7) ** GOTO lbl-1000
                var21_22 /* !! */  = this.k;
                var2_2 = var21_22 /* !! */ .getFinalX();
                var22_23 = this.k;
                var7_7 = var22_23.getCurrX();
                if ((var2_2 = Math.abs(var2_2 - var7_7)) > (var7_7 = this.M)) {
                    this.k.abortAnimation();
                    this.w = false;
                    this.r();
                    this.y = var3_3;
                    var21_22 /* !! */  = this.getParent();
                    if (var21_22 /* !! */  != null) {
                        var21_22 /* !! */ .requestDisallowInterceptTouchEvent((boolean)var3_3);
                    }
                    this.setScrollState(var3_3);
                } else lbl-1000:
                // 2 sources

                {
                    this.e(false);
                    this.y = false;
                }
            }
            var21_22 /* !! */  = this.I;
            if (var21_22 /* !! */  == null) {
                this.I = var21_22 /* !! */  = VelocityTracker.obtain();
            }
            this.I.addMovement(var1_1);
            return this.y;
        }
        this.u();
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        int n10;
        int n14;
        int n15;
        NewAjioStoryViewPager newAjioStoryViewPager = this;
        int n16 = this.getChildCount();
        int n17 = n7 - n3;
        int n18 = n8 - n4;
        int n19 = this.getPaddingLeft();
        int n20 = this.getPaddingTop();
        int n21 = this.getPaddingRight();
        int n22 = this.getPaddingBottom();
        int n24 = this.getScrollX();
        int n25 = 0;
        float f5 = 0.0f;
        NewAjioStoryViewPager$e newAjioStoryViewPager$e = null;
        int n26 = 0;
        while (true) {
            block5: {
                int n27;
                View view;
                block14: {
                    int n28;
                    block15: {
                        block11: {
                            block12: {
                                block13: {
                                    block9: {
                                        block10: {
                                            block6: {
                                                block7: {
                                                    block8: {
                                                        n15 = 8;
                                                        if (n25 >= n16) break;
                                                        view = newAjioStoryViewPager.getChildAt(n25);
                                                        n14 = view.getVisibility();
                                                        if (n14 == n15) break block5;
                                                        NewAjioStoryViewPager$LayoutParams newAjioStoryViewPager$LayoutParams = (NewAjioStoryViewPager$LayoutParams)view.getLayoutParams();
                                                        n14 = (int)(newAjioStoryViewPager$LayoutParams.a ? 1 : 0);
                                                        if (n14 == 0) break block5;
                                                        n15 = newAjioStoryViewPager$LayoutParams.b & 7;
                                                        n14 = 1;
                                                        if (n15 == n14) break block6;
                                                        n14 = 3;
                                                        if (n15 == n14) break block7;
                                                        n14 = 5;
                                                        if (n15 == n14) break block8;
                                                        n15 = n19;
                                                        break block9;
                                                    }
                                                    n15 = n17 - n21;
                                                    n14 = view.getMeasuredWidth();
                                                    n15 -= n14;
                                                    n14 = view.getMeasuredWidth();
                                                    n21 += n14;
                                                    break block10;
                                                }
                                                n15 = view.getMeasuredWidth() + n19;
                                                break block9;
                                            }
                                            n15 = view.getMeasuredWidth();
                                            n15 = Math.max((n17 - n15) / 2, n19);
                                        }
                                        n28 = n15;
                                        n15 = n19;
                                        n19 = n28;
                                    }
                                    n14 = 16;
                                    if (n19 == n14) break block11;
                                    n14 = 48;
                                    if (n19 == n14) break block12;
                                    n14 = 80;
                                    if (n19 == n14) break block13;
                                    n14 = n20;
                                    break block14;
                                }
                                n14 = n18 - n22;
                                n27 = view.getMeasuredHeight();
                                n14 -= n27;
                                n27 = view.getMeasuredHeight();
                                n22 += n27;
                                break block15;
                            }
                            n14 = view.getMeasuredHeight() + n20;
                            break block14;
                        }
                        n14 = view.getMeasuredHeight();
                        n14 = Math.max((n18 - n14) / 2, n20);
                    }
                    n28 = n14;
                    n14 = n20;
                    n20 = n28;
                }
                n27 = view.getMeasuredWidth() + (n19 += n24);
                int n29 = view.getMeasuredHeight();
                n10 = n29 + n20;
                view.layout(n19, n20, n27, n10);
                ++n26;
                n19 = n15;
                n20 = n14;
            }
            ++n25;
        }
        n17 = n17 - n19 - n21;
        for (n21 = 0; n21 < n16; ++n21) {
            int n30;
            View view = newAjioStoryViewPager.getChildAt(n21);
            n10 = view.getVisibility();
            if (n10 == n15) continue;
            NewAjioStoryViewPager$LayoutParams newAjioStoryViewPager$LayoutParams = (NewAjioStoryViewPager$LayoutParams)view.getLayoutParams();
            n25 = (int)(newAjioStoryViewPager$LayoutParams.a ? 1 : 0);
            if (n25 != 0 || (newAjioStoryViewPager$e = newAjioStoryViewPager.i(view)) == null) continue;
            float f6 = n17;
            f5 = newAjioStoryViewPager$e.e * f6;
            n25 = (int)f5 + n19;
            n14 = (int)(newAjioStoryViewPager$LayoutParams.d ? 1 : 0);
            if (n14 != 0) {
                newAjioStoryViewPager$LayoutParams.d = false;
                float f7 = newAjioStoryViewPager$LayoutParams.c;
                n10 = (int)(f6 * f7);
                n30 = 0x40000000;
                f6 = 2.0f;
                n10 = View.MeasureSpec.makeMeasureSpec((int)n10, (int)n30);
                n14 = n18 - n20 - n22;
                n30 = View.MeasureSpec.makeMeasureSpec((int)n14, (int)n30);
                view.measure(n10, n30);
            }
            n10 = view.getMeasuredWidth() + n25;
            n30 = view.getMeasuredHeight() + n20;
            view.layout(n25, n20, n10, n30);
        }
        newAjioStoryViewPager.p = n20;
        newAjioStoryViewPager.q = n18 -= n22;
        newAjioStoryViewPager.R = n26;
        n16 = (int)(newAjioStoryViewPager.P ? 1 : 0);
        if (n16 != 0) {
            n16 = newAjioStoryViewPager.g;
            n17 = 0;
            newAjioStoryViewPager.v(n16, false, 0, false);
        } else {
            n17 = 0;
        }
        newAjioStoryViewPager.P = false;
    }

    /*
     * Unable to fully structure code
     */
    public final void onMeasure(int var1_1, int var2_2) {
        var3_3 = 0;
        var1_1 = View.getDefaultSize((int)0, (int)var1_1);
        var2_2 = View.getDefaultSize((int)0, (int)var2_2);
        this.setMeasuredDimension(var1_1, var2_2);
        var1_1 = this.getMeasuredWidth();
        var2_2 = var1_1 / 10;
        var4_4 = this.A;
        this.B = var2_2 = Math.min(var2_2, var4_4);
        var2_2 = this.getPaddingLeft();
        var1_1 -= var2_2;
        var2_2 = this.getPaddingRight();
        var1_1 -= var2_2;
        var2_2 = this.getMeasuredHeight();
        var4_4 = this.getPaddingTop();
        var2_2 -= var4_4;
        var4_4 = this.getPaddingBottom();
        var2_2 -= var4_4;
        var4_4 = this.getChildCount();
        var5_5 = 0;
        var6_6 = 0.0f;
        var7_7 = null;
        while (true) {
            block16: {
                var8_8 = 8;
                var9_9 = 1;
                var10_10 = 1.4E-45f;
                var11_11 = 0x40000000;
                if (var5_5 >= var4_4) break;
                var12_12 = this.getChildAt(var5_5);
                var13_13 = var12_12.getVisibility();
                if (var13_13 == var8_8 || (var14_14 = (NewAjioStoryViewPager$LayoutParams)var12_12.getLayoutParams()) == null || (var13_13 = (int)var14_14.a) == 0) break block16;
                var13_13 = var14_14.b;
                var15_15 = var13_13 & 7;
                var16_16 = 48;
                var13_13 = (var13_13 &= 112) != var16_16 && var13_13 != (var16_16 = 80) ? 0 : 1;
                var16_16 = 3;
                if (var15_15 != var16_16 && var15_15 != (var16_16 = 5)) {
                    var9_9 = 0;
                    var10_10 = 0.0f;
                }
                var15_15 = -1 << -1;
                if (var13_13 != 0) {
                    var15_15 = 0x40000000;
                    while (true) {
                        var16_16 = -1 << -1;
                        break;
                    }
                } else {
                    if (var9_9 == 0) ** continue;
                    var16_16 = 0x40000000;
                }
                var17_17 = var14_14.width;
                var18_18 = -1;
                var19_19 = -2;
                if (var17_17 == var19_19) ** GOTO lbl57
                if (var17_17 != var18_18) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var15_15 = 0x40000000;
                        break;
                    }
                } else {
                    var17_17 = var1_1;
                    ** continue;
lbl57:
                    // 1 sources

                    var17_17 = var1_1;
                }
                var8_8 = var14_14.height;
                if (var8_8 != var19_19) {
                    if (var8_8 == var18_18) {
                        var8_8 = var2_2;
                    }
                } else {
                    var8_8 = var2_2;
                    var11_11 = var16_16;
                }
                var15_15 = View.MeasureSpec.makeMeasureSpec((int)var17_17, (int)var15_15);
                var8_8 = View.MeasureSpec.makeMeasureSpec((int)var8_8, (int)var11_11);
                var12_12.measure(var15_15, var8_8);
                if (var13_13 != 0) {
                    var8_8 = var12_12.getMeasuredHeight();
                    var2_2 -= var8_8;
                } else if (var9_9 != 0) {
                    var8_8 = var12_12.getMeasuredWidth();
                    var1_1 -= var8_8;
                }
            }
            ++var5_5;
        }
        View.MeasureSpec.makeMeasureSpec((int)var1_1, (int)var11_11);
        this.t = var2_2 = View.MeasureSpec.makeMeasureSpec((int)var2_2, (int)var11_11);
        this.u = var9_9;
        this.r();
        this.u = false;
        var2_2 = this.getChildCount();
        while (var3_3 < var2_2) {
            var20_20 = this.getChildAt(var3_3);
            var5_5 = var20_20.getVisibility();
            if (var5_5 != var8_8 && ((var7_7 = (NewAjioStoryViewPager$LayoutParams)var20_20.getLayoutParams()) == null || (var9_9 = var7_7.a) == 0)) {
                var10_10 = var1_1;
                var6_6 = var7_7.c;
                var5_5 = View.MeasureSpec.makeMeasureSpec((int)((int)(var10_10 *= var6_6)), (int)var11_11);
                var9_9 = this.t;
                var20_20.measure(var5_5, var9_9);
            }
            ++var3_3;
        }
    }

    public final boolean onRequestFocusInDescendants(int n3, Rect rect) {
        int n4;
        int n7 = this.getChildCount();
        int n8 = n3 & 2;
        boolean bl2 = true;
        if (n8 != 0) {
            n8 = n7;
            n7 = 0;
            n4 = 1;
        } else {
            n7 += -1;
            n8 = -1;
            n4 = -1;
        }
        while (n7 != n8) {
            boolean bl3;
            int n10;
            NewAjioStoryViewPager$e newAjioStoryViewPager$e;
            View view = this.getChildAt(n7);
            int n14 = view.getVisibility();
            if (n14 == 0 && (newAjioStoryViewPager$e = this.i(view)) != null && (n14 = newAjioStoryViewPager$e.b) == (n10 = this.g) && (bl3 = view.requestFocus(n3, rect))) {
                return bl2;
            }
            n7 += n4;
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        int n3 = parcelable instanceof NewAjioStoryViewPager$SavedState;
        if (n3 == 0) {
            super.onRestoreInstanceState(parcelable);
        } else {
            parcelable = (NewAjioStoryViewPager$SavedState)parcelable;
            Object object = parcelable.getSuperState();
            super.onRestoreInstanceState((Parcelable)object);
            object = this.f;
            ClassLoader classLoader = parcelable.c;
            if (object != null) {
                Parcelable parcelable2 = parcelable.b;
                ((Uk2)object).i(parcelable2, classLoader);
                int n4 = parcelable.a;
                n3 = 0;
                object = null;
                boolean bl2 = true;
                this.w(n4, false, bl2, 0);
            } else {
                this.h = n3 = parcelable.a;
                this.i = parcelable = parcelable.b;
                this.j = classLoader;
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        int n3;
        Object object = super.onSaveInstanceState();
        NewAjioStoryViewPager$SavedState newAjioStoryViewPager$SavedState = new AbsSavedState((Parcelable)object);
        newAjioStoryViewPager$SavedState.a = n3 = this.g;
        object = this.f;
        if (object != null) {
            object = ((Uk2)object).j();
            newAjioStoryViewPager$SavedState.b = object;
        }
        return newAjioStoryViewPager$SavedState;
    }

    public final void onSizeChanged(int n3, int n4, int n7, int n8) {
        super.onSizeChanged(n3, n4, n7, n8);
        if (n3 != n7) {
            n4 = this.n;
            this.t(n3, n7, n4, n4);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean onTouchEvent(MotionEvent var1_1) {
        block24: {
            block28: {
                block25: {
                    block26: {
                        block27: {
                            var2_2 = 1;
                            var3_3 = var1_1.getAction();
                            var4_4 = 0;
                            var5_5 = null;
                            if (var3_3 == 0 && (var3_3 = var1_1.getEdgeFlags()) != 0) {
                                return false;
                            }
                            var6_6 = this.f;
                            if (var6_6 == null || (var3_3 = var6_6.c()) == 0) break block24;
                            var6_6 = this.I;
                            if (var6_6 == null) {
                                var6_6 = VelocityTracker.obtain();
                                this.I = var6_6;
                            }
                            var6_6 = this.I;
                            var6_6.addMovement((MotionEvent)var1_1);
                            var3_3 = var1_1.getAction() & 255;
                            if (var3_3 == 0) break block25;
                            if (var3_3 == var2_2) break block26;
                            var7_7 /* !! */  = 2;
                            var8_9 = 2.8E-45f;
                            if (var3_3 == var7_7 /* !! */ ) break block27;
                            var7_7 /* !! */  = 3;
                            var8_9 = 4.2E-45f;
                            if (var3_3 != var7_7 /* !! */ ) {
                                var7_7 /* !! */  = 5;
                                var8_9 = 7.0E-45f;
                                if (var3_3 != var7_7 /* !! */ ) {
                                    var7_7 /* !! */  = 6;
                                    var8_9 = 8.4E-45f;
                                    if (var3_3 == var7_7 /* !! */ ) {
                                        this.n((MotionEvent)var1_1);
                                        var3_3 = this.H;
                                        var3_3 = var1_1.findPointerIndex(var3_3);
                                        this.D = var9_11 = var1_1.getX(var3_3);
                                    }
                                } else {
                                    var3_3 = var1_1.getActionIndex();
                                    this.D = var8_9 = var1_1.getX(var3_3);
                                    this.H = var10_14 = var1_1.getPointerId(var3_3);
                                }
                            } else {
                                var10_15 = this.y;
                                if (var10_15 != 0) {
                                    var10_15 = this.g;
                                    this.v(var10_15, (boolean)var2_2, 0, false);
                                    var4_4 = this.u();
                                }
                            }
                            break block28;
                        }
                        var3_3 = this.y;
                        if (var3_3 != 0) ** GOTO lbl89
                        var3_3 = this.H;
                        var3_3 = var1_1.findPointerIndex(var3_3);
                        var7_7 /* !! */  = -1;
                        var8_9 = 0.0f / 0.0f;
                        if (var3_3 == var7_7 /* !! */ ) {
                            var4_4 = this.u();
                        } else {
                            var8_9 = var1_1.getX(var3_3);
                            var11_18 = this.D;
                            var11_18 = Math.abs(var8_9 - var11_18);
                            var12_20 = var1_1.getY(var3_3);
                            var13_23 = this.E;
                            var13_23 = Math.abs(var12_20 - var13_23);
                            var14_24 = this.C;
                            cfr_temp_0 = var11_18 - var14_24;
                            var15_26 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                            if (var15_26 /* !! */  > 0 && (var16_28 = var11_18 == var13_23 ? 0 : (var11_18 > var13_23 ? 1 : -1)) > 0) {
                                this.y = var2_2;
                                var17_30 = this.getParent();
                                if (var17_30 != null) {
                                    var17_30.requestDisallowInterceptTouchEvent((boolean)var2_2);
                                }
                                var11_18 = this.F;
                                var13_23 = 0.0f;
                                var18_31 = null;
                                cfr_temp_1 = (var8_9 -= var11_18) - 0.0f;
                                var7_7 /* !! */  = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                                if (var7_7 /* !! */  > 0) {
                                    var7_7 /* !! */  = this.C;
                                    var8_9 = var7_7 /* !! */ ;
                                    var11_18 += var8_9;
                                } else {
                                    var7_7 /* !! */  = this.C;
                                    var8_9 = var7_7 /* !! */ ;
                                    var11_18 -= var8_9;
                                }
                                this.D = var11_18;
                                this.E = var12_20;
                                this.setScrollState(var2_2);
                                this.setScrollingCacheEnabled((boolean)var2_2);
                                var6_6 = this.getParent();
                                if (var6_6 != null) {
                                    var6_6.requestDisallowInterceptTouchEvent((boolean)var2_2);
                                }
                            }
lbl89:
                            // 6 sources

                            if ((var3_3 = (int)this.y) != 0) {
                                var3_3 = this.H;
                                var3_3 = var1_1.findPointerIndex(var3_3);
                                var9_12 = var1_1.getX(var3_3);
                                var4_4 = this.q(var9_12);
                            }
                        }
                        break block28;
                    }
                    var3_3 = (int)this.y;
                    if (var3_3 != 0) {
                        var6_6 = this.I;
                        var8_10 = this.K;
                        var6_6.computeCurrentVelocity(1000, var8_10);
                        var7_8 = this.H;
                        var12_21 = var6_6.getXVelocity(var7_8);
                        var3_3 = (int)var12_21;
                        this.w = var2_2;
                        var7_8 = this.getClientWidth();
                        var16_29 = this.getScrollX();
                        var18_32 = this.j();
                        var15_27 = this.n;
                        var14_25 = var15_27;
                        var8_10 = var7_8;
                        var14_25 /= var8_10;
                        var19_33 = var18_32.b;
                        var11_19 = (float)var16_29 / var8_10;
                        var8_10 = var18_32.e;
                        var11_19 -= var8_10;
                        var8_10 = var18_32.d + var14_25;
                        var11_19 /= var8_10;
                        var7_8 = this.H;
                        var7_8 = var1_1.findPointerIndex(var7_8);
                        var9_13 = var1_1.getX(var7_8);
                        var8_10 = this.F;
                        var10_16 = Math.abs((int)(var9_13 -= var8_10));
                        var7_8 = this.L;
                        if (var10_16 > var7_8 && (var10_16 = Math.abs(var3_3)) > (var7_8 = this.J)) {
                            if (var3_3 <= 0) {
                                var19_33 += var2_2;
                            }
                        } else {
                            var10_16 = this.g;
                            if (var19_33 >= var10_16) {
                                var10_16 = 1053609165;
                                var9_13 = 0.4f;
                            } else {
                                var10_16 = 1058642330;
                                var9_13 = 0.6f;
                            }
                            var10_16 = (int)(var11_19 += var9_13);
                            var19_33 += var10_16;
                        }
                        var1_1 = this.c;
                        var7_8 = var1_1.size();
                        if (var7_8 > 0) {
                            var5_5 = (NewAjioStoryViewPager$e)var1_1.get(0);
                            var1_1 = (NewAjioStoryViewPager$e)pp_0.a(var2_2, (ArrayList)var1_1);
                            var4_4 = var5_5.b;
                            var10_16 = var1_1.b;
                            var10_16 = Math.min(var19_33, var10_16);
                            var19_33 = Math.max(var4_4, var10_16);
                        }
                        this.w(var19_33, (boolean)var2_2, (boolean)var2_2, var3_3);
                        var4_4 = this.u();
                    }
                    break block28;
                }
                var6_6 = this.k;
                var6_6.abortAnimation();
                this.w = false;
                this.r();
                this.F = var12_22 = var1_1.getX();
                this.D = var12_22;
                this.G = var12_22 = var1_1.getY();
                this.E = var12_22;
                this.H = var10_17 = var1_1.getPointerId(0);
            }
            if (var4_4 != 0) {
                var1_1 = ViewCompat.a;
                this.postInvalidateOnAnimation();
            }
            return (boolean)var2_2;
        }
        return false;
    }

    public final boolean p(int n3) {
        Object object = this.c;
        int n4 = ((ArrayList)object).size();
        String string2 = "onPageScrolled did not call superclass implementation";
        if (n4 == 0) {
            n3 = (int)(this.P ? 1 : 0);
            if (n3 != 0) {
                return false;
            }
            this.Q = false;
            float f5 = 0.0f;
            IllegalStateException illegalStateException = null;
            this.m(0, 0.0f, 0);
            n3 = (int)(this.Q ? 1 : 0);
            if (n3 != 0) {
                return false;
            }
            illegalStateException = new IllegalStateException(string2);
            throw illegalStateException;
        }
        object = this.j();
        int n7 = this.getClientWidth();
        int n8 = this.n;
        int n10 = n7 + n8;
        float f6 = n8;
        float f7 = n7;
        f6 /= f7;
        int n14 = ((NewAjioStoryViewPager$e)object).b;
        float f8 = (float)n3 / f7;
        f7 = ((NewAjioStoryViewPager$e)object).e;
        f8 -= f7;
        float f11 = ((NewAjioStoryViewPager$e)object).d + f6;
        f8 /= f11;
        f11 = (float)n10 * f8;
        n4 = (int)f11;
        this.Q = false;
        this.m(n14, f8, n4);
        n3 = (int)(this.Q ? 1 : 0);
        if (n3 != 0) {
            return true;
        }
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final boolean q(float f5) {
        Object object;
        boolean bl2;
        boolean bl3;
        float f6 = this.D - f5;
        this.D = f5;
        int n3 = this.getScrollX();
        f5 = (float)n3 + f6;
        int n4 = this.getClientWidth();
        f6 = n4;
        float f7 = this.r * f6;
        float f8 = this.s * f6;
        Object object2 = this.c;
        boolean bl4 = false;
        NewAjioStoryViewPager$e newAjioStoryViewPager$e = (NewAjioStoryViewPager$e)((ArrayList)object2).get(0);
        int n7 = 1;
        object2 = (NewAjioStoryViewPager$e)pp_0.a(n7, (ArrayList)object2);
        int n8 = newAjioStoryViewPager$e.b;
        if (n8 != 0) {
            f7 = newAjioStoryViewPager$e.e * f6;
            bl3 = false;
            newAjioStoryViewPager$e = null;
        } else {
            bl3 = true;
        }
        n8 = ((NewAjioStoryViewPager$e)object2).b;
        Uk2 uk2 = this.f;
        int n10 = uk2.c() - n7;
        if (n8 != n10) {
            f8 = ((NewAjioStoryViewPager$e)object2).e * f6;
            bl2 = false;
            object2 = null;
        } else {
            bl2 = true;
        }
        n8 = (int)(f5 == f7 ? 0 : (f5 < f7 ? -1 : 1));
        if (n8 < 0) {
            if (bl3) {
                f5 = f7 - f5;
                EdgeEffect edgeEffect = this.N;
                f5 = Math.abs(f5) / f6;
                edgeEffect.onPull(f5);
                bl4 = true;
            }
            f5 = f7;
        } else {
            object = f5 == f8 ? 0 : (f5 > f8 ? 1 : -1);
            if (object > 0) {
                if (bl2) {
                    f5 -= f8;
                    EdgeEffect edgeEffect = this.O;
                    f5 = Math.abs(f5) / f6;
                    edgeEffect.onPull(f5);
                    bl4 = true;
                }
                f5 = f8;
            }
        }
        f6 = this.D;
        object = (int)f5;
        f8 = object;
        this.D = f5 = f5 - f8 + f6;
        n3 = this.getScrollY();
        this.scrollTo((int)object, n3);
        this.p((int)object);
        return bl4;
    }

    public final void r() {
        int n3 = this.g;
        this.s(n3);
    }

    public final void removeView(View view) {
        boolean bl2 = this.u;
        if (bl2) {
            this.removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void s(int var1_1) {
        block57: {
            block60: {
                block61: {
                    block65: {
                        block55: {
                            block59: {
                                block58: {
                                    var2_2 = this;
                                    var3_3 = var1_1;
                                    var4_4 = this.g;
                                    if (var4_4 != var1_1) {
                                        var5_5 = this.k(var4_4);
                                        this.g = var1_1;
                                    } else {
                                        var4_4 = 0;
                                        var6_6 = 0.0f;
                                        var5_5 = null;
                                    }
                                    var7_7 = var2_2.f;
                                    if (var7_7 != null) break block58;
                                    this.x();
                                    break block57;
                                }
                                var3_3 = (int)var2_2.w;
                                if (var3_3 == 0) break block59;
                                this.x();
                                break block57;
                            }
                            var7_7 = this.getWindowToken();
                            if (var7_7 == null) break block57;
                            var7_7 = var2_2.f;
                            var7_7.m(var2_2);
                            var3_3 = var2_2.x;
                            var8_8 = var2_2.g - var3_3;
                            var9_9 = 0;
                            var10_10 = 0.0f;
                            var11_11 = null;
                            var8_8 = Math.max(0, var8_8);
                            var12_12 = var2_2.f;
                            var13_13 = var12_12.c();
                            var14_14 = var13_13 + -1;
                            var15_15 = var2_2.g + var3_3;
                            var3_3 = Math.min(var14_14, var15_15);
                            var14_14 = var2_2.b;
                            if (var13_13 != var14_14) break block60;
                            var16_16 = 0.0f;
                            for (var14_14 = 0; var14_14 < (var18_18 = (var17_17 = var2_2.c).size()); ++var14_14) {
                                var19_19 = (NewAjioStoryViewPager$e)var17_17.get(var14_14);
                                var20_20 = var19_19.b;
                                var21_21 = var2_2.g;
                                if (var20_20 < var21_21) continue;
                                if (var20_20 != var21_21) break;
                                break block55;
                            }
                            var18_18 = 0;
                            var19_19 = null;
                        }
                        if (var19_19 == null && var13_13 > 0) {
                            var18_18 = var2_2.g;
                            var19_19 = var2_2.a(var18_18, var14_14);
                        }
                        if (var19_19 == null) break block61;
                        var21_21 = var14_14 + -1;
                        if (var21_21 >= 0) {
                            var22_22 = (NewAjioStoryViewPager$e)var17_17.get(var21_21);
                        } else {
                            var23_23 = 0;
                            var24_24 = 0.0f;
                            var22_22 = null;
                        }
                        var25_25 = this.getClientWidth();
                        var26_26 = 2.0f;
                        if (var25_25 <= 0) {
                            var27_27 = 0;
                            var28_28 = 0.0f;
                            var29_29 /* !! */  = null;
                        } else {
                            var30_31 = var19_19.d;
                            var30_31 = var26_26 - var30_31;
                            var27_27 = this.getPaddingLeft();
                            var28_28 = var27_27;
                            var10_10 = var25_25;
                            var28_28 = var28_28 / var10_10 + var30_31;
                        }
                        var30_31 = 0.0f;
                        block5: for (var9_9 = var2_2.g + -1; var9_9 >= 0; var9_9 += -1) {
                            block64: {
                                block62: {
                                    block63: {
                                        var31_32 /* !! */  = (float)(var30_31 == var28_28 ? 0 : (var30_31 > var28_28 ? 1 : -1));
                                        if (var31_32 /* !! */  < 0 || var9_9 >= var8_8) break block62;
                                        if (var22_22 == null) break;
                                        var20_20 = var22_22.b;
                                        if (var9_9 != var20_20 || (var20_20 = (int)var22_22.c) != 0) continue;
                                        var17_17.remove(var21_21);
                                        var32_33 = var2_2.f;
                                        var22_22 = var22_22.a;
                                        var32_33.a(var2_2, var9_9, var22_22);
                                        var14_14 += -1;
                                        if ((var21_21 += -1) < 0) break block63;
                                        var32_33 = (NewAjioStoryViewPager$e)var17_17.get(var21_21);
                                        ** GOTO lbl94
                                    }
lbl90:
                                    // 3 sources

                                    while (true) {
                                        var20_20 = 0;
                                        var33_34 = 0.0f;
                                        var32_33 = null;
lbl94:
                                        // 4 sources

                                        while (true) {
                                            var22_22 = var32_33;
                                            continue block5;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                if (var22_22 == null || var9_9 != (var20_20 = var22_22.b)) break block64;
                                var33_34 = var22_22.d;
                                var30_31 += var33_34;
                                if ((var21_21 += -1) < 0) ** GOTO lbl90
                                var32_33 = (NewAjioStoryViewPager$e)var17_17.get(var21_21);
                                ** GOTO lbl94
                            }
                            var20_20 = var21_21 + 1;
                            var32_33 = var2_2.a(var9_9, var20_20);
                            var33_34 = var32_33.d;
                            var30_31 += var33_34;
                            ++var14_14;
                            if (var21_21 >= 0) ** break;
                            ** continue;
                            var32_33 = (NewAjioStoryViewPager$e)var17_17.get(var21_21);
                            ** continue;
                        }
                        var28_28 = var19_19.d;
                        var8_8 = var14_14 + 1;
                        var9_9 = (int)(var28_28 == var26_26 ? 0 : (var28_28 < var26_26 ? -1 : 1));
                        if (var9_9 >= 0) break block65;
                        var9_9 = var17_17.size();
                        if (var8_8 < var9_9) {
                            var11_11 = (NewAjioStoryViewPager$e)var17_17.get(var8_8);
                        } else {
                            var9_9 = 0;
                            var10_10 = 0.0f;
                            var11_11 = null;
                        }
                        if (var25_25 <= 0) {
                            var20_20 = 0;
                            var33_34 = 0.0f;
                            var32_33 = null;
                        } else {
                            var20_20 = this.getPaddingRight();
                            var33_34 = var20_20;
                            var34_35 = var25_25;
                            var33_34 = var33_34 / var34_35 + var26_26;
                        }
                        var23_23 = var8_8;
                        block8: for (var21_21 = var2_2.g + 1; var21_21 < var13_13; ++var21_21) {
                            block66: {
                                var25_25 = (int)(var28_28 == var33_34 ? 0 : (var28_28 > var33_34 ? 1 : -1));
                                if (var25_25 >= 0 && var21_21 > var3_3) {
                                    if (var11_11 == null) break;
                                    var25_25 = var11_11.b;
                                    if (var21_21 != var25_25 || (var25_25 = (int)var11_11.c) != 0) continue;
                                    var17_17.remove(var23_23);
                                    var35_36 = var2_2.f;
                                    var11_11 = var11_11.a;
                                    var35_36.a(var2_2, var21_21, var11_11);
                                    var9_9 = var17_17.size();
                                    if (var23_23 < var9_9) {
                                        var11_11 = (NewAjioStoryViewPager$e)var17_17.get(var23_23);
                                        continue;
                                    }
lbl150:
                                    // 4 sources

                                    while (true) {
                                        var9_9 = 0;
                                        var10_10 = 0.0f;
                                        var11_11 = null;
                                        continue block8;
                                        break;
                                    }
                                }
                                if (var11_11 == null || var21_21 != (var25_25 = var11_11.b)) break block66;
                                var10_10 = var11_11.d;
                                var28_28 += var10_10;
                                var9_9 = var17_17.size();
                                if (++var23_23 >= var9_9) ** GOTO lbl150
                                var11_11 = (NewAjioStoryViewPager$e)var17_17.get(var23_23);
                                continue;
                            }
                            var11_11 = var2_2.a(var21_21, var23_23);
                            var10_10 = var11_11.d;
                            var28_28 += var10_10;
                            if (++var23_23 >= (var9_9 = var17_17.size())) ** continue;
                            var11_11 = (NewAjioStoryViewPager$e)var17_17.get(var23_23);
                        }
                    }
                    var7_7 = var2_2.f;
                    var3_3 = var7_7.c();
                    var27_27 = this.getClientWidth();
                    if (var27_27 > 0) {
                        var9_9 = var2_2.n;
                        var10_10 = var9_9;
                        var28_28 = var27_27;
                        var10_10 /= var28_28;
                    } else {
                        var9_9 = 0;
                        var10_10 = 0.0f;
                        var11_11 = null;
                    }
                    var27_27 = 1065353216;
                    var28_28 = 1.0f;
                    if (var5_5 != null) {
                        var13_13 = var5_5.b;
                        var20_20 = var19_19.b;
                        if (var13_13 < var20_20) {
                            var33_34 = var5_5.e;
                            var6_6 = var5_5.d;
                            var33_34 = var33_34 + var6_6 + var10_10;
                            ++var13_13;
                            var4_4 = 0;
                            var6_6 = 0.0f;
                            var5_5 = null;
                            while (var13_13 <= (var21_21 = var19_19.b) && var4_4 < (var21_21 = var17_17.size())) {
                                while (true) {
                                    var36_37 = (NewAjioStoryViewPager$e)var17_17.get(var4_4);
                                    var23_23 = var36_37.b;
                                    if (var13_13 <= var23_23 || var4_4 >= (var23_23 = var17_17.size() + -1)) break;
                                    ++var4_4;
                                }
                                while (var13_13 < (var23_23 = var36_37.b)) {
                                    var22_22 = var2_2.f;
                                    var22_22.getClass();
                                    var24_24 = var28_28 + var10_10;
                                    var33_34 += var24_24;
                                    ++var13_13;
                                }
                                var36_37.e = var33_34;
                                var34_35 = var36_37.d + var10_10;
                                var33_34 += var34_35;
                                ++var13_13;
                            }
                        } else if (var13_13 > var20_20) {
                            var20_20 = var17_17.size() + -1;
                            var6_6 = var5_5.e;
                            var13_13 += -1;
                            while (var13_13 >= (var21_21 = var19_19.b) && var20_20 >= 0) {
                                while (true) {
                                    var36_37 = (NewAjioStoryViewPager$e)var17_17.get(var20_20);
                                    var23_23 = var36_37.b;
                                    if (var13_13 >= var23_23 || var20_20 <= 0) break;
                                    var20_20 += -1;
                                }
                                while (var13_13 > (var23_23 = var36_37.b)) {
                                    var22_22 = var2_2.f;
                                    var22_22.getClass();
                                    var24_24 = var28_28 + var10_10;
                                    var6_6 -= var24_24;
                                    var13_13 += -1;
                                }
                                var24_24 = var36_37.d + var10_10;
                                var36_37.e = var6_6 -= var24_24;
                                var13_13 += -1;
                            }
                        }
                    }
                    var4_4 = var17_17.size();
                    var37_38 = var19_19.e;
                    var20_20 = var19_19.b;
                    var21_21 = var20_20 + -1;
                    if (var20_20 == 0) {
                        var24_24 = var37_38;
                    } else {
                        var23_23 = -8388609;
                        var24_24 = -3.4028235E38f;
                    }
                    var2_2.r = var24_24;
                    if (var20_20 == (var3_3 += -1)) {
                        var33_34 = var19_19.d + var37_38 - var28_28;
                    } else {
                        var20_20 = 0x7F7FFFFF;
                        var33_34 = 3.4028235E38f;
                    }
                    var2_2.s = var33_34;
                    var14_14 += -1;
                    while (var14_14 >= 0) {
                        var32_33 = (NewAjioStoryViewPager$e)var17_17.get(var14_14);
                        while (var21_21 > (var23_23 = var32_33.b)) {
                            var22_22 = var2_2.f;
                            var21_21 += -1;
                            var22_22.getClass();
                            var24_24 = var28_28 + var10_10;
                            var37_38 -= var24_24;
                        }
                        var38_39 = var32_33.d + var10_10;
                        var32_33.e = var37_38 -= var38_39;
                        if (var23_23 == 0) {
                            var2_2.r = var37_38;
                        }
                        var14_14 += -1;
                        var21_21 += -1;
                    }
                    var37_38 = var19_19.e;
                    var16_16 = var19_19.d;
                    var37_38 = var37_38 + var16_16 + var10_10;
                    var14_14 = var19_19.b;
                    while (true) {
                        ++var14_14;
                        if (var8_8 >= var4_4) break;
                        var32_33 = (NewAjioStoryViewPager$e)var17_17.get(var8_8);
                        while (var14_14 < (var21_21 = var32_33.b)) {
                            var36_37 = var2_2.f;
                            ++var14_14;
                            var36_37.getClass();
                            var34_35 = var28_28 + var10_10;
                            var37_38 += var34_35;
                        }
                        if (var21_21 == var3_3) {
                            var2_2.s = var34_35 = var32_33.d + var37_38 - var28_28;
                        }
                        var32_33.e = var37_38;
                        var33_34 = var32_33.d + var10_10;
                        var37_38 += var33_34;
                        ++var8_8;
                    }
                    var7_7 = var2_2.f;
                    var5_5 = var19_19.a;
                    var7_7.k(var5_5);
                }
                var7_7 = var2_2.f;
                var7_7.b();
                var3_3 = this.getChildCount();
                var6_6 = 0.0f;
                var5_5 = null;
                for (var4_4 = 0; var4_4 < var3_3; ++var4_4) {
                    var29_29 /* !! */  = var2_2.getChildAt(var4_4);
                    var39_40 = (NewAjioStoryViewPager$LayoutParams)var29_29 /* !! */ .getLayoutParams();
                    var39_40.f = var4_4;
                    var9_9 = (int)var39_40.a;
                    if (var9_9 == 0) {
                        var10_10 = var39_40.c;
                        var13_13 = 0;
                        var37_38 = 0.0f;
                        var12_12 = null;
                        cfr_temp_0 = var10_10 - 0.0f;
                        var9_9 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                        if (var9_9 != 0 || (var29_29 /* !! */  = var2_2.i(var29_29 /* !! */ )) == null) continue;
                        var39_40.c = var10_10 = var29_29 /* !! */ .d;
                        var39_40.e = var27_27 = var29_29 /* !! */ .b;
                        continue;
                    }
                    var13_13 = 0;
                    var37_38 = 0.0f;
                    var12_12 = null;
                }
                this.x();
                var3_3 = (int)this.hasFocus();
                if (var3_3 != 0) {
                    var7_7 = this.findFocus();
                    if (var7_7 != null) {
                        while ((var5_5 = var7_7.getParent()) != var2_2) {
                            if (var5_5 != null && (var3_3 = var5_5 instanceof View) != 0) {
                                var7_7 = var5_5;
                                var7_7 = (View)var5_5;
                                continue;
                            }
                            ** break block56
                        }
                        var29_29 /* !! */  = var2_2.i((View)var7_7);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var27_27 = 0;
                        var28_28 = 0.0f;
                        var29_29 /* !! */  = null;
                    }
                    if (var29_29 /* !! */  == null || (var3_3 = var29_29 /* !! */ .b) != (var4_4 = var2_2.g)) {
                        var10_10 = 0.0f;
                        var11_11 = null;
                        for (var9_9 = 0; var9_9 < (var3_3 = this.getChildCount()); ++var9_9) {
                            var7_7 = var2_2.getChildAt(var9_9);
                            var5_5 = var2_2.i((View)var7_7);
                            if (var5_5 == null || (var4_4 = var5_5.b) != (var27_27 = var2_2.g)) continue;
                            var4_4 = 2;
                            var6_6 = 2.8E-45f;
                            var3_3 = (int)var7_7.requestFocus(var4_4);
                            if (var3_3 == 0) {
                                continue;
                            }
                            break block57;
                        }
                    }
                }
                break block57;
            }
            var7_7 = this.getResources();
            var4_4 = this.getId();
            try {
                var7_7 = var7_7.getResourceName(var4_4);
            }
            catch (Resources.NotFoundException v0) {
                var3_3 = this.getId();
                var7_7 = Integer.toHexString(var3_3);
            }
            var29_30 = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            var8_8 = var2_2.b;
            m10.a(var29_30, var8_8, ", found: ", var13_13, " Pager id: ");
            var29_30.append((String)var7_7);
            var29_30.append(" Pager class: ");
            var7_7 = this.getClass();
            var29_30.append(var7_7);
            var29_30.append(" Problematic adapter: ");
            var7_7 = var2_2.f.getClass();
            var29_30.append(var7_7);
            var7_7 = var29_30.toString();
            var5_5 = new IllegalStateException((String)var7_7);
            throw var5_5;
        }
    }

    public void setAdapter(Uk2 object) {
        Object object2;
        int n3;
        Object object3 = this.f;
        int n4 = 1;
        if (object3 != null) {
            int n7;
            int n8;
            ((Uk2)object3).m(this);
            object3 = null;
            for (n3 = 0; n3 < (n8 = ((ArrayList)(object2 = this.c)).size()); ++n3) {
                object2 = (NewAjioStoryViewPager$e)((ArrayList)object2).get(n3);
                Uk2 uk2 = this.f;
                int n10 = ((NewAjioStoryViewPager$e)object2).b;
                object2 = ((NewAjioStoryViewPager$e)object2).a;
                uk2.a(this, n10, object2);
            }
            this.f.b();
            ((ArrayList)object2).clear();
            object3 = null;
            for (n3 = 0; n3 < (n7 = this.getChildCount()); n3 += n4) {
                object2 = (NewAjioStoryViewPager$LayoutParams)this.getChildAt(n3).getLayoutParams();
                n7 = (int)(((NewAjioStoryViewPager$LayoutParams)((Object)object2)).a ? 1 : 0);
                if (n7 != 0) continue;
                this.removeViewAt(n3);
                n3 += -1;
            }
            this.g = 0;
            this.scrollTo(0, 0);
        }
        this.f = object;
        this.b = 0;
        if (object != null) {
            object = this.m;
            if (object == null) {
                object = new NewAjioStoryViewPager$i(this);
                this.m = object;
            }
            object = this.f;
            object3 = this.m;
            object = object.a;
            object.registerObserver(object3);
            this.w = false;
            int n14 = this.P;
            this.P = n4;
            object3 = this.f;
            this.b = n3 = ((Uk2)object3).c();
            n3 = this.h;
            if (n3 >= 0) {
                object = this.f;
                object3 = this.i;
                object2 = this.j;
                object.i((Parcelable)object3, (ClassLoader)object2);
                n14 = this.h;
                this.w(n14, false, n4 != 0, 0);
                this.h = -1;
                n14 = 0;
                object = null;
                this.i = null;
                this.j = null;
            } else if (n14 == 0) {
                this.r();
            } else {
                this.requestLayout();
            }
        }
    }

    public void setCurrentItem(int n3) {
        this.w = false;
        boolean bl2 = this.P ^ true;
        this.w(n3, bl2, false, 0);
    }

    public void setCurrentItem(int n3, boolean bl2) {
        this.w = false;
        this.w(n3, bl2, false, 0);
    }

    public void setCurrentItem(int n3, boolean bl2, int n4) {
        this.w = false;
        this.w(n3, bl2, true, n4);
    }

    public void setMaxSettleDuration(int n3) {
        this.a = n3;
    }

    public void setOffscreenPageLimit(int n3) {
        int n4 = 1;
        if (n3 < n4) {
            n3 = 1;
        }
        if (n3 != (n4 = this.x)) {
            this.x = n3;
            this.r();
        }
    }

    public void setOnPageChangeListener(NewAjioStoryViewPager$g newAjioStoryViewPager$g) {
        this.T = newAjioStoryViewPager$g;
    }

    public void setPageMargin(int n3) {
        int n4 = this.n;
        this.n = n3;
        int n7 = this.getWidth();
        this.t(n7, n7, n3, n4);
        this.requestLayout();
    }

    public void setPageMarginDrawable(int n3) {
        Drawable drawable2 = t70.getDrawable(this.getContext(), n3);
        this.setPageMarginDrawable(drawable2);
    }

    public void setPageMarginDrawable(Drawable drawable2) {
        boolean bl2;
        this.o = drawable2;
        if (drawable2 != null) {
            this.refreshDrawableState();
        }
        if (drawable2 == null) {
            bl2 = true;
        } else {
            bl2 = false;
            drawable2 = null;
        }
        this.setWillNotDraw(bl2);
        this.invalidate();
    }

    public void setPageTransformer(boolean bl2, NewAjioStoryViewPager$h newAjioStoryViewPager$h) {
        this.setPageTransformer(bl2, newAjioStoryViewPager$h, 2);
    }

    public void setPageTransformer(boolean bl2, NewAjioStoryViewPager$h newAjioStoryViewPager$h, int n3) {
        boolean bl3;
        int n4 = 1;
        boolean bl4 = newAjioStoryViewPager$h != null;
        NewAjioStoryViewPager$h newAjioStoryViewPager$h2 = this.U;
        if (newAjioStoryViewPager$h2 != null) {
            bl3 = true;
        } else {
            bl3 = false;
            newAjioStoryViewPager$h2 = null;
        }
        if (bl4 != bl3) {
            bl3 = true;
        } else {
            bl3 = false;
            newAjioStoryViewPager$h2 = null;
        }
        this.U = newAjioStoryViewPager$h;
        this.setChildrenDrawingOrderEnabled(bl4);
        if (bl4) {
            if (bl2) {
                n4 = 2;
            }
            this.p0 = n4;
            this.k0 = n3;
        } else {
            this.p0 = 0;
        }
        if (bl3) {
            this.r();
        }
    }

    public void setScrollState(int n3) {
        int n4 = this.s0;
        if (n4 != n3) {
            this.s0 = n3;
            Object object = this.U;
            int n7 = 0;
            if (object != null) {
                if (n3 != 0) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    object = null;
                }
                int n8 = this.getChildCount();
                for (int i3 = 0; i3 < n8; ++i3) {
                    int n10 = n4 != 0 ? this.k0 : 0;
                    View view = this.getChildAt(i3);
                    view.setLayerType(n10, null);
                }
            }
            if ((object = this.T) != null) {
                object.onPageScrollStateChanged(n3);
            }
            if ((object = this.S) != null) {
                n4 = ((ArrayList)object).size();
                while (n7 < n4) {
                    NewAjioStoryViewPager$g newAjioStoryViewPager$g = (NewAjioStoryViewPager$g)this.S.get(n7);
                    if (newAjioStoryViewPager$g != null) {
                        newAjioStoryViewPager$g.onPageScrollStateChanged(n3);
                    }
                    ++n7;
                }
            }
        }
    }

    public final void t(int n3, int n4, int n7, int n8) {
        ArrayList arrayList;
        int n10;
        if (n4 > 0 && (n10 = (arrayList = this.c).isEmpty()) == 0) {
            arrayList = this.k;
            n10 = arrayList.isFinished();
            if (n10 == 0) {
                Scroller scroller = this.k;
                n4 = this.getCurrentItem();
                n7 = this.getClientWidth();
                scroller.setFinalX(n4 *= n7);
            } else {
                n10 = this.getPaddingLeft();
                n3 -= n10;
                n10 = this.getPaddingRight();
                n3 = n3 - n10 + n7;
                n7 = this.getPaddingLeft();
                n4 -= n7;
                n7 = this.getPaddingRight();
                n4 = n4 - n7 + n8;
                n7 = this.getScrollX();
                float f5 = n7;
                float f6 = n4;
                f5 /= f6;
                float f7 = n3;
                n3 = (int)(f5 *= f7);
                n4 = this.getScrollY();
                this.scrollTo(n3, n4);
            }
        } else {
            float f8;
            n4 = this.g;
            NewAjioStoryViewPager$e newAjioStoryViewPager$e = this.k(n4);
            if (newAjioStoryViewPager$e != null) {
                f8 = newAjioStoryViewPager$e.e;
                float f11 = this.s;
                f8 = Math.min(f8, f11);
            } else {
                n4 = 0;
                f8 = 0.0f;
                newAjioStoryViewPager$e = null;
            }
            n7 = this.getPaddingLeft();
            n3 -= n7;
            n7 = this.getPaddingRight();
            float f12 = n3 - n7;
            n3 = (int)(f8 *= f12);
            n4 = this.getScrollX();
            if (n3 != n4) {
                f8 = 0.0f;
                newAjioStoryViewPager$e = null;
                this.e(false);
                n4 = this.getScrollY();
                this.scrollTo(n3, n4);
            }
        }
    }

    public final boolean u() {
        boolean bl2;
        this.H = -1;
        boolean bl3 = false;
        this.y = false;
        this.z = false;
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            bl2 = false;
            velocityTracker = null;
            this.I = null;
        }
        this.N.onRelease();
        this.O.onRelease();
        velocityTracker = this.N;
        bl2 = velocityTracker.isFinished();
        if (bl2 || (bl2 = (velocityTracker = this.O).isFinished())) {
            bl3 = true;
        }
        return bl3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void v(int n3, boolean bl2, int n4, boolean bl3) {
        void var4_16;
        int n7;
        float f5;
        float f6;
        int n8;
        int n10 = 2;
        float f7 = 2.8E-45f;
        NewAjioStoryViewPager$e newAjioStoryViewPager$e = this.k(n3);
        if (newAjioStoryViewPager$e != null) {
            n8 = this.getClientWidth();
            f6 = n8;
            float f8 = this.r;
            f5 = newAjioStoryViewPager$e.e;
            float f11 = this.s;
            f5 = Math.min(f5, f11);
            f5 = Math.max(f8, f5) * f6;
            n7 = (int)f5;
        } else {
            n7 = 0;
            f5 = 0.0f;
            newAjioStoryViewPager$e = null;
        }
        if (bl2) {
            int n14 = this.getChildCount();
            if (n14 == 0) {
                this.setScrollingCacheEnabled(false);
            } else {
                void var2_9;
                Scroller scroller;
                boolean bl4;
                Scroller scroller2 = this.k;
                if (scroller2 != null && !(bl4 = scroller2.isFinished())) {
                    boolean bl5 = this.l;
                    if (bl5) {
                        Scroller scroller3 = this.k;
                        int n15 = scroller3.getCurrX();
                    } else {
                        Scroller scroller4 = this.k;
                        int n16 = scroller4.getStartX();
                    }
                    scroller = this.k;
                    scroller.abortAnimation();
                    this.setScrollingCacheEnabled(false);
                } else {
                    int n17 = this.getScrollX();
                }
                void var16_31 = var2_9;
                int n18 = this.getScrollY();
                int n19 = n7 - var2_9;
                int n20 = 0 - n18;
                if (n19 == 0 && n20 == 0) {
                    this.e(false);
                    this.r();
                    this.setScrollState(0);
                } else {
                    void var2_14;
                    int n21;
                    this.setScrollingCacheEnabled(true);
                    this.setScrollState(n10);
                    int n22 = this.getClientWidth();
                    n10 = n22 / 2;
                    n7 = Math.abs(n19);
                    f5 = n7;
                    n8 = 1065353216;
                    f6 = 1.0f;
                    f5 *= f6;
                    float f12 = n22;
                    f5 /= f12;
                    f5 = Math.min(f6, f5);
                    f7 = n10;
                    int n24 = 1055999547;
                    float f14 = 0.47123894f;
                    double d2 = Math.sin((f5 -= 0.5f) * f14);
                    f5 = (float)d2 * f7 + f7;
                    n21 = Math.abs(n21);
                    if (n21 > 0) {
                        f12 = n21;
                        f5 /= f12;
                        f12 = Math.abs(f5);
                        n21 = 1148846080;
                        float f15 = 1000.0f;
                        int n25 = Math.round(f12 *= f15) * 4;
                    } else {
                        Uk2 uk2 = this.f;
                        uk2.getClass();
                        f12 *= f6;
                        n21 = Math.abs(n19);
                        float f16 = n21;
                        n10 = this.n;
                        f7 = n10;
                        f16 = f16 / (f12 += f7) + f6;
                        f12 = 100.0f;
                        int n26 = (int)(f16 *= f12);
                    }
                    n21 = this.a;
                    n24 = Math.min((int)var2_14, n21);
                    this.l = false;
                    scroller = this.k;
                    scroller.startScroll((int)var16_31, n18, n19, n20, n24);
                    WeakHashMap weakHashMap = ViewCompat.a;
                    this.postInvalidateOnAnimation();
                }
            }
            if (var4_16 == false) return;
            this.g(n3);
            return;
        }
        if (var4_16 != false) {
            this.g(n3);
        }
        this.e(false);
        this.scrollTo(n7, 0);
        this.p(n7);
    }

    public final boolean verifyDrawable(Drawable drawable2) {
        boolean bl2;
        Drawable drawable3;
        boolean bl3 = super.verifyDrawable(drawable2);
        if (!bl3 && drawable2 != (drawable3 = this.o)) {
            bl2 = false;
            drawable2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final void w(int n3, boolean bl2, boolean n4, int n7) {
        int n8;
        Object object = this.f;
        boolean bl3 = false;
        if (object != null && (n8 = ((Uk2)object).c()) > 0) {
            object = this.c;
            if (n4 == 0 && (n4 = this.g) == n3 && (n4 = ((ArrayList)object).size()) != 0) {
                this.setScrollingCacheEnabled(false);
            } else {
                int n10;
                Uk2 uk2;
                Uk2 uk22;
                n4 = 1;
                if (n3 < 0) {
                    n3 = 0;
                    uk22 = null;
                } else {
                    uk2 = this.f;
                    n10 = uk2.c();
                    if (n3 >= n10) {
                        uk22 = this.f;
                        n3 = uk22.c() - n4;
                    }
                }
                n10 = this.x;
                int n14 = this.g;
                int n15 = n14 + n10;
                if (n3 > n15 || n3 < (n14 -= n10)) {
                    uk2 = null;
                    for (n10 = 0; n10 < (n14 = ((ArrayList)object).size()); ++n10) {
                        NewAjioStoryViewPager$e newAjioStoryViewPager$e = (NewAjioStoryViewPager$e)((ArrayList)object).get(n10);
                        newAjioStoryViewPager$e.c = n4;
                    }
                }
                if ((n8 = this.g) != n3) {
                    bl3 = true;
                }
                if ((n4 = (int)(this.P ? 1 : 0)) != 0) {
                    this.g = n3;
                    if (bl3) {
                        this.g(n3);
                    }
                    this.requestLayout();
                } else {
                    this.s(n3);
                    this.v(n3, bl2, n7, bl3);
                }
            }
        } else {
            this.setScrollingCacheEnabled(false);
        }
    }

    public final void x() {
        int n3 = this.p0;
        if (n3 != 0) {
            ArrayList arrayList = this.q0;
            if (arrayList == null) {
                this.q0 = arrayList = new ArrayList();
            } else {
                arrayList.clear();
            }
            n3 = this.getChildCount();
            NewAjioStoryViewPager$j newAjioStoryViewPager$j = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                View view = this.getChildAt(i3);
                ArrayList arrayList2 = this.q0;
                arrayList2.add(view);
            }
            arrayList = this.q0;
            newAjioStoryViewPager$j = w0;
            Collections.sort(arrayList, newAjioStoryViewPager$j);
        }
    }
}

