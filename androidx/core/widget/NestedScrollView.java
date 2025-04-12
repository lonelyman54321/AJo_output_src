/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$Theme
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.FocusFinder
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 *  android.view.animation.AnimationUtils
 *  android.widget.EdgeEffect
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.OverScroller
 */
package androidx.core.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.R$attr;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import androidx.core.widget.NestedScrollView$SavedState;
import androidx.core.widget.NestedScrollView$a;
import androidx.core.widget.NestedScrollView$b;
import androidx.core.widget.NestedScrollView$c;
import androidx.core.widget.NestedScrollView$d;
import java.util.ArrayList;

public class NestedScrollView
extends FrameLayout
implements xu1_2,
uU1 {
    public static final float C;
    public static final NestedScrollView$a D;
    public static final int[] E;
    public NestedScrollView$d A;
    public final rq0 B;
    public final float a;
    public long b;
    public final Rect c;
    public final OverScroller d;
    public final EdgeEffect e;
    public final EdgeEffect f;
    public int g;
    public boolean h;
    public boolean i;
    public View j;
    public boolean k;
    public VelocityTracker l;
    public boolean m;
    public boolean n;
    public final int o;
    public final int p;
    public final int q;
    public int r;
    public final int[] s;
    public final int[] t;
    public int u;
    public int v;
    public NestedScrollView$SavedState w;
    public final yu1_0 x;
    public final vU1 y;
    public float z;

    static {
        NestedScrollView$a nestedScrollView$a;
        double d2 = Math.log(0.78);
        double d5 = Math.log(0.9);
        C = (float)(d2 / d5);
        D = nestedScrollView$a = new a();
        E = new int[]{16843130};
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.nestedScrollViewStyle;
        this(context, attributeSet, n3);
    }

    public NestedScrollView(Context object, AttributeSet attributeSet, int n3) {
        super(object, attributeSet, n3);
        boolean bl2;
        Rect rect;
        this.c = rect = new Rect();
        this.h = bl2 = true;
        this.i = false;
        this.j = null;
        this.k = false;
        this.n = bl2;
        this.r = -1;
        int n4 = 2;
        float f5 = 2.8E-45f;
        Object object2 = new int[n4];
        this.s = object2;
        Object object3 = new int[n4];
        this.t = object3;
        object3 = new NestedScrollView$c;
        super(this);
        object2 = new rq0;
        Context context = this.getContext();
        super(context, (sq0_0)object3);
        this.B = object2;
        n4 = Build.VERSION.SDK_INT;
        int n7 = 31;
        if (n4 >= n7) {
            context = kx0$b.a(object, attributeSet);
        } else {
            super(object);
        }
        this.e = context;
        if (n4 >= n7) {
            object3 = kx0$b.a(object, attributeSet);
        } else {
            object3 = new EdgeEffect;
            super(object);
        }
        this.f = (EdgeEffect)object3;
        this.a = f5 = object.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        object3 = new OverScroller;
        object2 = this.getContext();
        super((Context)object2);
        this.d = (OverScroller)object3;
        this.setFocusable(bl2);
        this.setDescendantFocusability(262144);
        this.setWillNotDraw(false);
        object3 = ViewConfiguration.get((Context)this.getContext());
        this.o = n7 = object3.getScaledTouchSlop();
        this.p = n7 = object3.getScaledMinimumFlingVelocity();
        this.q = n4 = object3.getScaledMaximumFlingVelocity();
        object3 = E;
        object = object.obtainStyledAttributes(attributeSet, object3, n3, 0);
        boolean bl3 = object.getBoolean(0, false);
        this.setFillViewport(bl3);
        object.recycle();
        super();
        this.x = object;
        super((View)this);
        this.y = object;
        this.setNestedScrollingEnabled(bl2);
        object = D;
        ViewCompat.s((View)this, (a)object);
    }

    public static boolean g(View view, View view2) {
        boolean bl2;
        boolean bl3 = true;
        if (view == view2) {
            return bl3;
        }
        boolean bl4 = (view = view.getParent()) instanceof ViewGroup;
        if (!bl4 || !(bl2 = NestedScrollView.g(view, view2))) {
            bl3 = false;
        }
        return bl3;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean a(int var1_1) {
        var2_2 = this.findFocus();
        if (var2_2 == this) {
            var3_3 = 0;
            var2_2 = null;
        }
        var4_4 = FocusFinder.getInstance().findNextFocus((ViewGroup)this, var2_2, var1_1);
        var5_5 = this.getMaxScrollAmount();
        var6_6 = 1;
        if (var4_4 == null) ** GOTO lbl-1000
        var7_7 = this.getHeight();
        if ((var7_7 = (int)this.h(var4_4, var5_5, var7_7)) != 0) {
            var8_8 = this.c;
            var4_4.getDrawingRect(var8_8);
            this.offsetDescendantRectToMyCoords(var4_4, var8_8);
            var5_5 = this.b(var8_8);
            this.n(var5_5, 0, var6_6, (boolean)var6_6);
            var4_4.requestFocus(var1_1);
        } else lbl-1000:
        // 2 sources

        {
            var9_9 = 33;
            var7_7 = 130;
            if (var1_1 == var9_9 && (var9_9 = this.getScrollY()) < var5_5) {
                var5_5 = this.getScrollY();
            } else if (var1_1 == var7_7 && (var9_9 = this.getChildCount()) > 0) {
                var4_4 = this.getChildAt(0);
                var10_10 = (FrameLayout.LayoutParams)var4_4.getLayoutParams();
                var9_9 = var4_4.getBottom();
                var11_11 = var10_10.bottomMargin;
                var9_9 += var11_11;
                var11_11 = this.getScrollY();
                var12_12 = this.getHeight() + var11_11;
                var11_11 = this.getPaddingBottom();
                var5_5 = Math.min(var9_9 -= (var12_12 -= var11_11), var5_5);
            }
            if (var5_5 == 0) {
                return false;
            }
            if (var1_1 != var7_7) {
                var5_5 = -var5_5;
            }
            this.n(var5_5, 0, var6_6, (boolean)var6_6);
        }
        if (var2_2 != null && (var1_1 = (int)var2_2.isFocused()) != 0) {
            var1_1 = this.getHeight();
            if ((var1_1 = this.h(var2_2, 0, var1_1) ^ var6_6) != 0) {
                var1_1 = this.getDescendantFocusability();
                var3_3 = 131072;
                this.setDescendantFocusability(var3_3);
                this.requestFocus();
                this.setDescendantFocusability(var1_1);
            }
        }
        return (boolean)var6_6;
    }

    public final void addView(View object) {
        int n3 = this.getChildCount();
        if (n3 <= 0) {
            super.addView(object);
            return;
        }
        object = new IllegalStateException("ScrollView can host only one direct child");
        throw object;
    }

    public final void addView(View object, int n3) {
        int n4 = this.getChildCount();
        if (n4 <= 0) {
            super.addView(object, n3);
            return;
        }
        object = new IllegalStateException("ScrollView can host only one direct child");
        throw object;
    }

    public final void addView(View object, int n3, ViewGroup.LayoutParams layoutParams) {
        int n4 = this.getChildCount();
        if (n4 <= 0) {
            super.addView(object, n3, layoutParams);
            return;
        }
        object = new IllegalStateException("ScrollView can host only one direct child");
        throw object;
    }

    public final void addView(View object, ViewGroup.LayoutParams layoutParams) {
        int n3 = this.getChildCount();
        if (n3 <= 0) {
            super.addView(object, layoutParams);
            return;
        }
        object = new IllegalStateException("ScrollView can host only one direct child");
        throw object;
    }

    public final int b(Rect rect) {
        int n3 = this.getChildCount();
        int n4 = 0;
        if (n3 == 0) {
            return 0;
        }
        n3 = this.getHeight();
        int n7 = this.getScrollY();
        int n8 = n7 + n3;
        int n10 = this.getVerticalFadingEdgeLength();
        int n14 = rect.top;
        if (n14 > 0) {
            n7 += n10;
        }
        View view = this.getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        int n15 = rect.bottom;
        int n16 = view.getHeight();
        int n17 = layoutParams.topMargin;
        n16 += n17;
        n15 = rect.bottom;
        n17 = layoutParams.bottomMargin;
        n10 = n15 < (n16 += n17) ? n8 - n10 : n8;
        if (n15 > n10 && (n16 = rect.top) > n7) {
            n4 = rect.height();
            int n18 = n4 > n3 ? rect.top - n7 : rect.bottom - n10;
            n3 = view.getBottom();
            n4 = layoutParams.bottomMargin;
            n3 = n3 + n4 - n8;
            n4 = Math.min(n18, n3);
        } else {
            n8 = rect.top;
            if (n8 < n7 && n15 < n10) {
                int n19;
                n8 = rect.height();
                if (n8 > n3) {
                    n19 = rect.bottom;
                    n4 = 0 - (n10 -= n19);
                } else {
                    n19 = rect.top;
                    n4 = 0 - (n7 -= n19);
                }
                n19 = -this.getScrollY();
                n4 = Math.max(n4, n19);
            }
        }
        return n4;
    }

    public final boolean c(int n3, int n4, int[] nArray, int[] nArray2, int n7) {
        return this.y.c(n3, n4, nArray, null, n7);
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void computeScroll() {
        OverScroller overScroller;
        boolean bl2;
        float f5;
        float f6;
        float f7;
        int n3;
        float f8;
        int n4;
        float f11;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        int n7;
        int n8;
        int n10;
        block19: {
            block18: {
                float f12;
                float f14;
                block17: {
                    float f15;
                    OverScroller overScroller2 = this.d;
                    boolean bl3 = overScroller2.isFinished();
                    if (bl3) {
                        return;
                    }
                    this.d.computeScrollOffset();
                    OverScroller overScroller3 = this.d;
                    n10 = overScroller3.getCurrY();
                    n8 = this.v;
                    n8 = n10 - n8;
                    n7 = this.getHeight();
                    edgeEffect2 = this.f;
                    edgeEffect = this.e;
                    int n14 = 0x3F000000;
                    f11 = 0.5f;
                    n4 = 0;
                    f8 = 0.0f;
                    n3 = 0x40800000;
                    f14 = 4.0f;
                    if (n8 <= 0 || (f7 = (f15 = (f6 = kx0.a(edgeEffect)) - 0.0f) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1)) == false) break block17;
                    n4 = -n8;
                    f8 = (float)n4 * f14;
                    f6 = n7;
                    f5 = (float)(-n7) / f14;
                    n7 = Math.round(f11 = kx0.b(edgeEffect, f8 /= f6, f11) * f5);
                    if (n7 != n8) {
                        edgeEffect.finish();
                    }
                    break block18;
                }
                if (n8 >= 0 || (n4 = (f12 = (f6 = kx0.a(edgeEffect2)) - 0.0f) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1)) == 0) break block19;
                f8 = (float)n8 * f14;
                f5 = n7;
                n7 = Math.round(f11 = kx0.b(edgeEffect2, f8 /= f5, f11) * (f5 /= f14));
                if (n7 != n8) {
                    edgeEffect2.finish();
                }
            }
            n8 -= n7;
        }
        this.v = n10;
        int[] nArray = this.t;
        n7 = 1;
        f5 = Float.MIN_VALUE;
        int n15 = 0;
        nArray[n7] = 0;
        int n16 = 1;
        n4 = 0;
        f8 = 0.0f;
        Object object = this;
        n3 = n8;
        this.c(0, n8, nArray, null, n16);
        int n17 = nArray[n7];
        n8 -= n17;
        int n18 = this.getScrollRange();
        boolean bl4 = tE.b();
        if (bl4) {
            object = this.d;
            f11 = Math.abs(object.getCurrVelocity());
            NestedScrollView$b.a((View)this, f11);
        }
        if (n8 != 0) {
            int n19 = this.getScrollY();
            n4 = this.getScrollX();
            this.k(n8, n4, n19, n18);
            n3 = this.getScrollY() - n19;
            n8 -= n3;
            nArray[n7] = 0;
            n4 = 0;
            f8 = 0.0f;
            f7 = 0.0f;
            f6 = 0.0f;
            object = this.y;
            int[] nArray2 = this.s;
            n15 = 1;
            ((vU1)object).e(0, n3, 0, n8, nArray2, n15, nArray);
            int n20 = nArray[n7];
            n8 -= n20;
        }
        if (n8 != 0) {
            int n21 = this.getOverScrollMode();
            if (n21 == 0 || n21 == n7 && n18 > 0) {
                if (n8 < 0) {
                    boolean bl5 = edgeEffect.isFinished();
                    if (bl5) {
                        OverScroller overScroller4 = this.d;
                        float f16 = overScroller4.getCurrVelocity();
                        int n22 = (int)f16;
                        edgeEffect.onAbsorb(n22);
                    }
                } else {
                    boolean bl6 = edgeEffect2.isFinished();
                    if (bl6) {
                        OverScroller overScroller5 = this.d;
                        float f17 = overScroller5.getCurrVelocity();
                        int n24 = (int)f17;
                        edgeEffect2.onAbsorb(n24);
                    }
                }
            }
            OverScroller overScroller6 = this.d;
            overScroller6.abortAnimation();
            this.s(n7);
        }
        if (!(bl2 = (overScroller = this.d).isFinished())) {
            this.postInvalidateOnAnimation();
            return;
        }
        this.s(n7);
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        int n3 = super.computeVerticalScrollOffset();
        return Math.max(0, n3);
    }

    public final int computeVerticalScrollRange() {
        int n3 = this.getChildCount();
        int n4 = this.getHeight();
        int n7 = this.getPaddingBottom();
        n4 -= n7;
        n7 = this.getPaddingTop();
        n4 -= n7;
        if (n3 == 0) {
            return n4;
        }
        View view = this.getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        n7 = view.getBottom();
        int n8 = layoutParams.bottomMargin;
        n7 += n8;
        n8 = this.getScrollY();
        n4 = n7 - n4;
        n3 = Math.max(0, n4);
        if (n8 < 0) {
            n7 -= n8;
        } else if (n8 > n3) {
            n7 += (n8 -= n3);
        }
        return n7;
    }

    public final boolean d(KeyEvent keyEvent) {
        int n3;
        Rect rect = this.c;
        rect.setEmpty();
        int n4 = this.getChildCount();
        boolean bl2 = false;
        int n7 = 130;
        if (n4 > 0) {
            rect = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)rect.getLayoutParams();
            n4 = rect.getHeight();
            int n8 = layoutParams.topMargin;
            n4 += n8;
            int n10 = layoutParams.bottomMargin;
            n4 += n10;
            n10 = this.getHeight();
            n8 = this.getPaddingTop();
            n10 -= n8;
            n8 = this.getPaddingBottom();
            if (n4 > (n10 -= n8)) {
                n4 = keyEvent.getAction();
                if (n4 == 0) {
                    n4 = keyEvent.getKeyCode();
                    n10 = 19;
                    n8 = 33;
                    if (n4 != n10) {
                        n10 = 20;
                        if (n4 != n10) {
                            n10 = 62;
                            if (n4 != n10) {
                                int n14 = 92;
                                if (n4 != n14) {
                                    n14 = 93;
                                    if (n4 != n14) {
                                        n14 = 122;
                                        if (n4 != n14) {
                                            n14 = 123;
                                            if (n4 == n14) {
                                                this.l(n7);
                                            }
                                        } else {
                                            this.l(n8);
                                        }
                                    } else {
                                        bl2 = this.f(n7);
                                    }
                                } else {
                                    bl2 = this.f(n8);
                                }
                            } else {
                                boolean bl3 = keyEvent.isShiftPressed();
                                if (bl3) {
                                    n7 = 33;
                                }
                                this.l(n7);
                            }
                        } else {
                            boolean bl4 = keyEvent.isAltPressed();
                            bl2 = bl4 ? this.f(n7) : this.a(n7);
                        }
                    } else {
                        boolean bl5 = keyEvent.isAltPressed();
                        bl2 = bl5 ? this.f(n8) : this.a(n8);
                    }
                }
                return bl2;
            }
        }
        if ((n4 = (int)(this.isFocused() ? 1 : 0)) != 0 && (n3 = keyEvent.getKeyCode()) != (n4 = 4)) {
            keyEvent = this.findFocus();
            if (keyEvent == this) {
                n3 = 0;
                keyEvent = null;
            }
            if ((keyEvent = (rect = FocusFinder.getInstance()).findNextFocus((ViewGroup)this, (View)keyEvent, n7)) != null && keyEvent != this && (n3 = (int)(keyEvent.requestFocus(n7) ? 1 : 0)) != 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean bl2;
        boolean bl3 = super.dispatchKeyEvent(keyEvent);
        if (!bl3 && !(bl2 = this.d(keyEvent))) {
            bl2 = false;
            keyEvent = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final boolean dispatchNestedFling(float f5, float f6, boolean bl2) {
        return this.y.a(f5, f6, bl2);
    }

    public final boolean dispatchNestedPreFling(float f5, float f6) {
        return this.y.b(f5, f6);
    }

    public final boolean dispatchNestedPreScroll(int n3, int n4, int[] nArray, int[] nArray2) {
        return this.y.c(n3, n4, nArray, nArray2, 0);
    }

    public final boolean dispatchNestedScroll(int n3, int n4, int n7, int n8, int[] nArray) {
        return this.y.e(n3, n4, n7, n8, nArray, 0, null);
    }

    public final void draw(Canvas canvas) {
        float f5;
        int n3;
        int n4;
        int n7;
        int n8;
        super.draw(canvas);
        int n10 = this.getScrollY();
        EdgeEffect edgeEffect = this.e;
        int n14 = edgeEffect.isFinished();
        int n15 = 0;
        float f6 = 0.0f;
        if (n14 == 0) {
            float f7;
            int n16;
            n14 = canvas.save();
            n8 = this.getWidth();
            n7 = this.getHeight();
            n4 = Math.min(0, n10);
            n3 = this.getClipToPadding();
            if (n3 != 0) {
                n3 = this.getPaddingLeft();
                n16 = this.getPaddingRight() + n3;
                n8 -= n16;
                n3 = this.getPaddingLeft();
            } else {
                n3 = 0;
                f7 = 0.0f;
            }
            n16 = this.getClipToPadding();
            if (n16 != 0) {
                n16 = this.getPaddingTop();
                int n17 = this.getPaddingBottom() + n16;
                n7 -= n17;
                n16 = this.getPaddingTop();
                n4 += n16;
            }
            f7 = n3;
            f5 = n4;
            canvas.translate(f7, f5);
            edgeEffect.setSize(n8, n7);
            boolean bl2 = edgeEffect.draw(canvas);
            if (bl2) {
                this.postInvalidateOnAnimation();
            }
            canvas.restoreToCount(n14);
        }
        if ((n14 = (int)((edgeEffect = this.f).isFinished() ? 1 : 0)) == 0) {
            n14 = canvas.save();
            n8 = this.getWidth();
            n7 = this.getHeight();
            n10 = Math.max(this.getScrollRange(), n10) + n7;
            n4 = (int)(this.getClipToPadding() ? 1 : 0);
            if (n4 != 0) {
                n15 = this.getPaddingLeft();
                n4 = this.getPaddingRight() + n15;
                n8 -= n4;
                n15 = this.getPaddingLeft();
            }
            if ((n4 = (int)(this.getClipToPadding() ? 1 : 0)) != 0) {
                n4 = this.getPaddingTop();
                n3 = this.getPaddingBottom() + n4;
                n7 -= n3;
                n4 = this.getPaddingBottom();
                n10 -= n4;
            }
            f6 = n15 - n8;
            float f8 = n10;
            canvas.translate(f6, f8);
            f8 = n8;
            n15 = 0;
            f6 = 0.0f;
            n4 = 0x43340000;
            f5 = 180.0f;
            canvas.rotate(f5, f8, 0.0f);
            edgeEffect.setSize(n8, n7);
            n10 = (int)(edgeEffect.draw(canvas) ? 1 : 0);
            if (n10 != 0) {
                this.postInvalidateOnAnimation();
            }
            canvas.restoreToCount(n14);
        }
    }

    public final void e(int n3) {
        int n4 = this.getChildCount();
        if (n4 > 0) {
            OverScroller overScroller = this.d;
            int n7 = this.getScrollX();
            int n8 = this.getScrollY();
            int n10 = -1 << -1;
            int n14 = -1 >>> 1;
            overScroller.fling(n7, n8, 0, n3, 0, 0, n10, n14, 0, 0);
            float f5 = 2.8E-45f;
            n4 = 1;
            this.q(2, n4);
            this.v = n3 = this.getScrollY();
            this.postInvalidateOnAnimation();
            n3 = (int)(tE.b() ? 1 : 0);
            if (n3 != 0) {
                OverScroller overScroller2 = this.d;
                f5 = Math.abs(overScroller2.getCurrVelocity());
                NestedScrollView$b.a((View)this, f5);
            }
        }
    }

    public final boolean f(int n3) {
        View view;
        int n4 = 130;
        int n7 = 0;
        FrameLayout.LayoutParams layoutParams = null;
        int n8 = 1;
        if (n3 == n4) {
            n4 = 1;
        } else {
            n4 = 0;
            view = null;
        }
        int n10 = this.getHeight();
        Rect rect = this.c;
        rect.top = 0;
        rect.bottom = n10;
        if (n4 != 0 && (n4 = this.getChildCount()) > 0) {
            view = this.getChildAt(n4 -= n8);
            layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            n4 = view.getBottom();
            n7 = layoutParams.bottomMargin;
            n4 += n7;
            rect.bottom = n7 = this.getPaddingBottom() + n4;
            rect.top = n7 -= n10;
        }
        n4 = rect.top;
        n7 = rect.bottom;
        return this.m(n3, n4, n7);
    }

    public float getBottomFadingEdgeStrength() {
        int n3 = this.getChildCount();
        if (n3 == 0) {
            return 0.0f;
        }
        float f5 = 0.0f;
        View view = this.getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        int n4 = this.getVerticalFadingEdgeLength();
        int n7 = this.getHeight();
        int n8 = this.getPaddingBottom();
        n3 = view.getBottom();
        int n10 = layoutParams.bottomMargin;
        n3 += n10;
        n10 = this.getScrollY();
        if ((n3 = n3 - n10 - (n7 -= n8)) < n4) {
            f5 = n3;
            float f6 = n4;
            return f5 / f6;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int)((float)this.getHeight() * 0.5f);
    }

    public int getNestedScrollAxes() {
        yu1_0 yu1_02 = this.x;
        int n3 = yu1_02.a;
        return yu1_02.b | n3;
    }

    public int getScrollRange() {
        int n3 = this.getChildCount();
        int n4 = 0;
        if (n3 > 0) {
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            n3 = view.getHeight();
            int n7 = layoutParams.topMargin;
            n3 += n7;
            int n8 = layoutParams.bottomMargin;
            n3 += n8;
            n8 = this.getHeight();
            n7 = this.getPaddingTop();
            n8 -= n7;
            n7 = this.getPaddingBottom();
            n4 = Math.max(0, n3 -= (n8 -= n7));
        }
        return n4;
    }

    public float getTopFadingEdgeStrength() {
        int n3 = this.getChildCount();
        if (n3 == 0) {
            return 0.0f;
        }
        n3 = this.getVerticalFadingEdgeLength();
        int n4 = this.getScrollY();
        if (n4 < n3) {
            float f5 = n4;
            float f6 = n3;
            return f5 / f6;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        float f5 = this.z;
        Context context = null;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object == false) {
            boolean bl2;
            int n3;
            Object object2 = new TypedValue();
            context = this.getContext();
            Resources.Theme theme = context.getTheme();
            boolean bl3 = theme.resolveAttribute(n3 = 16842829, object2, bl2 = true);
            if (bl3) {
                context = context.getResources().getDisplayMetrics();
                this.z = f5 = object2.getDimension((DisplayMetrics)context);
            } else {
                object2 = new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                throw object2;
            }
        }
        return this.z;
    }

    public final boolean h(View view, int n3, int n4) {
        Rect rect = this.c;
        view.getDrawingRect(rect);
        this.offsetDescendantRectToMyCoords(view, rect);
        int n7 = rect.bottom + n3;
        int n8 = this.getScrollY();
        if (n7 >= n8 && (n7 = rect.top - n3) <= (n3 = this.getScrollY() + n4)) {
            n7 = 1;
        } else {
            n7 = 0;
            view = null;
        }
        return n7 != 0;
    }

    public final boolean hasNestedScrollingParent() {
        return this.y.g(0);
    }

    public final void i(int n3, int n4, int[] nArray) {
        int n7 = this.getScrollY();
        this.scrollBy(0, n3);
        int n8 = this.getScrollY() - n7;
        if (nArray != null) {
            int n10;
            n7 = 1;
            nArray[n7] = n10 = nArray[n7] + n8;
        }
        this.y.d(n8, n3 -= n8, n4, nArray);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.y.d;
    }

    public final void j(MotionEvent motionEvent) {
        int n3;
        int n4 = motionEvent.getActionIndex();
        int n7 = motionEvent.getPointerId(n4);
        if (n7 == (n3 = this.r)) {
            int n8;
            n4 = n4 == 0 ? 1 : 0;
            float f5 = motionEvent.getY(n4);
            this.g = n7 = (int)f5;
            this.r = n8 = motionEvent.getPointerId(n4);
            motionEvent = this.l;
            if (motionEvent != null) {
                motionEvent.clear();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean k(int n3, int n4, int n7, int n8) {
        vU1 vU12;
        boolean bl2;
        int n10 = this.getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        this.computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        boolean bl3 = true;
        n7 += n3;
        n3 = 0;
        if (n4 > 0 || n4 < 0) {
            n4 = 0;
            n10 = 1;
        } else {
            n10 = 0;
        }
        if (n7 > n8) {
            n7 = 1;
        } else if (n7 < 0) {
            n7 = 1;
            n8 = 0;
        } else {
            n8 = n7;
            n7 = 0;
        }
        if (n7 != 0 && !(bl2 = (vU12 = this.y).g((int)(bl3 ? 1 : 0)))) {
            vU12 = this.d;
            int n14 = this.getScrollRange();
            vU12.springBack(n4, n8, 0, 0, 0, n14);
        }
        super.scrollTo(n4, n8);
        if (n10 != 0) return bl3;
        if (n7 == 0) return false;
        return bl3;
    }

    public final void l(int n3) {
        View view;
        int n4 = 130;
        int n7 = 0;
        FrameLayout.LayoutParams layoutParams = null;
        int n8 = 1;
        if (n3 == n4) {
            n4 = 1;
        } else {
            n4 = 0;
            view = null;
        }
        int n10 = this.getHeight();
        Rect rect = this.c;
        if (n4 != 0) {
            rect.top = n4 = this.getScrollY() + n10;
            n4 = this.getChildCount();
            if (n4 > 0) {
                view = this.getChildAt(n4 -= n8);
                layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
                n4 = view.getBottom();
                n7 = layoutParams.bottomMargin;
                n4 += n7;
                n4 = rect.top + n10;
                n7 = this.getPaddingBottom() + n4;
                if (n4 > n7) {
                    rect.top = n7 -= n10;
                }
            }
        } else {
            rect.top = n4 = this.getScrollY() - n10;
            if (n4 < 0) {
                rect.top = 0;
            }
        }
        n4 = rect.top;
        rect.bottom = n10 += n4;
        this.m(n3, n4, n10);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean m(int n3, int n4, int n7) {
        int n8;
        NestedScrollView nestedScrollView = this;
        int n10 = n3;
        int n14 = n4;
        int n15 = n7;
        int n16 = this.getHeight();
        int n17 = this.getScrollY();
        n16 += n17;
        int n18 = 33;
        n18 = n3 == n18 ? 1 : 0;
        int n19 = 2;
        ArrayList arrayList = nestedScrollView.getFocusables(n19);
        int n20 = arrayList.size();
        NestedScrollView nestedScrollView2 = null;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n20; ++i3) {
            int n21;
            View view = (View)arrayList.get(i3);
            int n22 = view.getTop();
            n8 = view.getBottom();
            if (n14 >= n8 || n22 >= n15) continue;
            boolean bl3 = n14 < n22 && n8 < n15;
            if (nestedScrollView2 == null) {
                nestedScrollView2 = view;
                bl2 = bl3;
                continue;
            }
            n8 = n18 != 0 && n22 < (n21 = nestedScrollView2.getTop()) || n18 == 0 && n8 > (n21 = nestedScrollView2.getBottom()) ? 1 : 0;
            if (bl2) {
                if (!bl3 || n8 == 0) continue;
            } else {
                if (bl3) {
                    nestedScrollView2 = view;
                    bl2 = true;
                    continue;
                }
                if (n8 == 0) continue;
            }
            nestedScrollView2 = view;
        }
        if (nestedScrollView2 == null) {
            nestedScrollView2 = nestedScrollView;
        }
        if (n14 >= n17 && n15 <= n16) {
            n8 = 0;
        } else {
            n14 = n18 != 0 ? (n14 -= n17) : n15 - n16;
            n15 = 0;
            n16 = 1;
            nestedScrollView.n(n14, 0, n16, n16 != 0);
            n8 = 1;
        }
        View view = this.findFocus();
        if (nestedScrollView2 != view) {
            nestedScrollView2.requestFocus(n10);
        }
        return n8 != 0;
    }

    public final void measureChild(View view, int n3, int n4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int n7 = this.getPaddingLeft();
        int n8 = this.getPaddingRight() + n7;
        n4 = layoutParams.width;
        n3 = ViewGroup.getChildMeasureSpec((int)n3, (int)n8, (int)n4);
        n4 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        view.measure(n3, n4);
    }

    public final void measureChildWithMargins(View view, int n3, int n4, int n7, int n8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        n8 = this.getPaddingLeft();
        int n10 = this.getPaddingRight() + n8;
        n8 = marginLayoutParams.leftMargin;
        n10 += n8;
        n8 = marginLayoutParams.rightMargin;
        n10 = n10 + n8 + n4;
        n4 = marginLayoutParams.width;
        n3 = ViewGroup.getChildMeasureSpec((int)n3, (int)n10, (int)n4);
        n4 = marginLayoutParams.topMargin;
        n7 = marginLayoutParams.bottomMargin;
        n4 = View.MeasureSpec.makeMeasureSpec((int)(n4 + n7), (int)0);
        view.measure(n3, n4);
    }

    public final int n(int n3, int n4, int n7, boolean bl2) {
        VelocityTracker velocityTracker;
        int n8;
        int n10;
        int n14;
        NestedScrollView nestedScrollView = this;
        int n15 = n4;
        int n16 = n7;
        int n17 = 1;
        if (n7 == n17) {
            n14 = 2;
            this.q(n14, n7);
        }
        int[] nArray = nestedScrollView.t;
        int[] nArray2 = nestedScrollView.s;
        vU1 vU12 = nestedScrollView.y;
        int n18 = 0;
        EdgeEffect edgeEffect = null;
        int n19 = n3;
        n14 = (int)(vU12.c(0, n3, nArray, nArray2, n7) ? 1 : 0);
        int n20 = 0;
        int[] nArray3 = nestedScrollView.t;
        int[] nArray4 = nestedScrollView.s;
        if (n14 != 0) {
            n14 = nArray3[n17];
            n14 = n3 - n14;
            n18 = nArray4[n17];
            n10 = n14;
            n8 = n18;
        } else {
            n10 = n3;
            n8 = 0;
        }
        int n21 = this.getScrollY();
        int n22 = this.getScrollRange();
        n14 = this.getOverScrollMode();
        boolean bl3 = (n14 == 0 || n14 == n17 && (n14 = this.getScrollRange()) > 0) && !bl2;
        n14 = (int)(nestedScrollView.k(n10, 0, n21, n22) ? 1 : 0);
        int n24 = n14 != 0 && (n14 = (int)((vU12 = nestedScrollView.y).g(n16) ? 1 : 0)) == 0 ? 1 : 0;
        n19 = this.getScrollY() - n21;
        int n25 = n10 - n19;
        nArray3[n17] = 0;
        n18 = 0;
        int n26 = 0;
        float f5 = 0.0f;
        nArray = null;
        vU12 = nestedScrollView.y;
        int[] nArray5 = nestedScrollView.s;
        n20 = n22;
        n22 = n7;
        vU12.e(0, n19, 0, n25, nArray5, n7, nArray3);
        n14 = nArray4[n17];
        n8 += n14;
        n14 = nArray3[n17];
        vU12 = nestedScrollView.f;
        edgeEffect = nestedScrollView.e;
        if ((n21 += (n10 -= n14)) < 0) {
            if (bl3) {
                n19 = -n10;
                float f6 = n19;
                f5 = this.getHeight();
                f6 /= f5;
                float f7 = n15;
                n26 = this.getWidth();
                f5 = n26;
                kx0.b(edgeEffect, f6, f7 /= f5);
                n15 = (int)(vU12.isFinished() ? 1 : 0);
                if (n15 == 0) {
                    vU12.onRelease();
                }
            }
        } else if (n21 > n20 && bl3) {
            float f8 = n10;
            f5 = this.getHeight();
            f8 /= f5;
            float f11 = n15;
            f5 = this.getWidth();
            f11 /= f5;
            n26 = 1065353216;
            f5 = 1.0f - f11;
            kx0.b((EdgeEffect)vU12, f8, f5);
            n15 = (int)(edgeEffect.isFinished() ? 1 : 0);
            if (n15 == 0) {
                edgeEffect.onRelease();
            }
        }
        if ((n15 = (int)(edgeEffect.isFinished() ? 1 : 0)) != 0 && (n15 = (int)(vU12.isFinished() ? 1 : 0)) != 0) {
            n20 = n24;
        } else {
            this.postInvalidateOnAnimation();
            n20 = 0;
        }
        if (n20 != 0 && n16 == 0 && (velocityTracker = nestedScrollView.l) != null) {
            velocityTracker.clear();
        }
        if (n16 == n17) {
            nestedScrollView.s(n16);
            edgeEffect.onRelease();
            vU12.onRelease();
        }
        return n8;
    }

    public final boolean o(EdgeEffect edgeEffect, int n3) {
        boolean bl2 = true;
        if (n3 > 0) {
            return bl2;
        }
        float f5 = kx0.a(edgeEffect);
        float f6 = this.getHeight();
        f5 *= f6;
        n3 = Math.abs(-n3);
        float f7 = n3;
        f6 = this.a;
        float f8 = 0.015f;
        double d2 = Math.log((f7 *= 0.35f) / (f6 *= f8));
        double d5 = C;
        double d7 = d5 - 1.0;
        double d9 = f6;
        double d12 = Math.exp(d5 = d5 / d7 * d2) * d9;
        f7 = (float)d12;
        float f11 = f7 - f5;
        Object object = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (object >= 0) {
            bl2 = false;
        }
        return bl2;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int n3 = motionEvent.getAction();
        int n4 = 8;
        float f5 = 1.1E-44f;
        boolean bl2 = false;
        if (n3 == n4 && (n3 = (int)(this.k ? 1 : 0)) == 0) {
            float f6;
            rq0 rq02;
            int n7;
            n3 = 2;
            n4 = (int)(jq1_1.c(motionEvent, n3) ? 1 : 0);
            boolean bl3 = false;
            if (n4 != 0) {
                n3 = 9;
                f5 = motionEvent.getAxisValue(n3);
                float f7 = motionEvent.getX();
                n7 = (int)f7;
            } else {
                f5 = 5.877472E-39f;
                n4 = (int)(jq1_1.c(motionEvent, 0x400000) ? 1 : 0);
                if (n4 != 0) {
                    n4 = 26;
                    float f8 = motionEvent.getAxisValue(n4);
                    int n8 = this.getWidth();
                    n3 = n8 / 2;
                    f5 = f8;
                    n7 = n3;
                    n3 = 26;
                } else {
                    n3 = 0;
                    n4 = 0;
                    f5 = 0.0f;
                    rq02 = null;
                    n7 = 0;
                    float f11 = 0.0f;
                }
            }
            bl3 = (f6 = f5 - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
            if (bl3) {
                n4 = (int)(this.getVerticalScrollFactorCompat() * f5);
                bl2 = jq1_1.c(motionEvent, 8194);
                n4 = -n4;
                bl3 = true;
                this.n(n4, n7, (int)(bl3 ? 1 : 0), bl2);
                if (n3 != 0) {
                    rq02 = this.B;
                    rq02.a(motionEvent, n3);
                }
                return bl3;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean bl2;
        int n3;
        int n4 = motionEvent.getAction();
        int n7 = 1;
        int n8 = 2;
        if (n4 == n8 && (n3 = this.k) != 0) {
            return n7 != 0;
        }
        n3 = 0;
        if ((n4 &= 0xFF) != 0) {
            int n10 = -1;
            float f5 = 0.0f / 0.0f;
            if (n4 != n7) {
                if (n4 != n8) {
                    n7 = 3;
                    if (n4 != n7) {
                        n7 = 6;
                        if (n4 != n7) {
                            return this.k;
                        }
                        this.j(motionEvent);
                        return this.k;
                    }
                } else {
                    n4 = this.r;
                    if (n4 == n10) {
                        return this.k;
                    }
                    if ((n4 = motionEvent.findPointerIndex(n4)) == n10) {
                        return this.k;
                    }
                    float f6 = motionEvent.getY(n4);
                    n4 = (int)f6;
                    n3 = this.g;
                    if ((n3 = Math.abs(n4 - n3)) <= (n10 = this.o)) return this.k;
                    n3 = this.getNestedScrollAxes();
                    if ((n8 &= n3) != 0) return this.k;
                    this.k = n7;
                    this.g = n4;
                    VelocityTracker velocityTracker = this.l;
                    if (velocityTracker == null) {
                        this.l = velocityTracker = VelocityTracker.obtain();
                    }
                    velocityTracker = this.l;
                    velocityTracker.addMovement(motionEvent);
                    this.u = 0;
                    motionEvent = this.getParent();
                    if (motionEvent == null) return this.k;
                    motionEvent.requestDisallowInterceptTouchEvent(n7 != 0);
                    return this.k;
                }
            }
            this.k = false;
            this.r = n10;
            motionEvent = this.l;
            if (motionEvent != null) {
                motionEvent.recycle();
                this.l = null;
            }
            OverScroller overScroller = this.d;
            int n14 = this.getScrollX();
            int n15 = this.getScrollY();
            int n16 = this.getScrollRange();
            boolean bl3 = false;
            boolean bl4 = overScroller.springBack(n14, n15, 0, 0, 0, n16);
            if (bl4) {
                this.postInvalidateOnAnimation();
            }
            this.s(0);
            return this.k;
        }
        float f7 = motionEvent.getY();
        n4 = (int)f7;
        float f8 = motionEvent.getX();
        int n17 = (int)f8;
        int n18 = this.getChildCount();
        if (n18 > 0) {
            n18 = this.getScrollY();
            View view = this.getChildAt(0);
            int n19 = view.getTop() - n18;
            if (n4 >= n19 && n4 < (n19 = view.getBottom() - n18) && n17 >= (n18 = view.getLeft()) && n17 < (n18 = view.getRight())) {
                this.g = n4;
                this.r = n4 = motionEvent.getPointerId(0);
                VelocityTracker velocityTracker = this.l;
                if (velocityTracker == null) {
                    this.l = velocityTracker = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                this.l.addMovement(motionEvent);
                velocityTracker = this.d;
                velocityTracker.computeScrollOffset();
                boolean bl5 = this.r(motionEvent);
                if (!bl5 && (bl5 = (motionEvent = this.d).isFinished())) {
                    n7 = 0;
                }
                this.k = n7;
                this.q(n8, 0);
                return this.k;
            }
        }
        if (!(bl2 = this.r(motionEvent)) && (bl2 = (motionEvent = this.d).isFinished())) {
            n7 = 0;
        }
        this.k = n7;
        motionEvent = this.l;
        if (motionEvent == null) return this.k;
        motionEvent.recycle();
        this.l = null;
        return this.k;
    }

    public final void onLayout(boolean n3, int n4, int n7, int n8, int n10) {
        Object object;
        super.onLayout(n3 != 0, n4, n7, n8, n10);
        n3 = 0;
        this.h = false;
        View view = this.j;
        if (view != null && (n4 = (int)(NestedScrollView.g(view, (View)this) ? 1 : 0)) != 0) {
            view = this.j;
            object = this.c;
            view.getDrawingRect(object);
            this.offsetDescendantRectToMyCoords(view, (Rect)object);
            n4 = this.b((Rect)object);
            if (n4 != 0) {
                this.scrollBy(0, n4);
            }
        }
        n4 = 0;
        view = null;
        this.j = null;
        n8 = (int)(this.i ? 1 : 0);
        if (n8 == 0) {
            int n14;
            object = this.w;
            if (object != null) {
                n8 = this.getScrollX();
                NestedScrollView$SavedState nestedScrollView$SavedState = this.w;
                n14 = nestedScrollView$SavedState.a;
                this.scrollTo(n8, n14);
                this.w = null;
            }
            if ((n4 = this.getChildCount()) > 0) {
                view = this.getChildAt(0);
                object = (FrameLayout.LayoutParams)view.getLayoutParams();
                n4 = view.getMeasuredHeight();
                n14 = object.topMargin;
                n4 += n14;
                n8 = object.bottomMargin;
                n4 += n8;
            } else {
                n4 = 0;
                view = null;
            }
            n10 -= n7;
            n7 = this.getPaddingTop();
            n10 -= n7;
            n7 = this.getPaddingBottom();
            n10 -= n7;
            n7 = this.getScrollY();
            if (n10 < n4 && n7 >= 0) {
                n3 = n10 + n7;
                n3 = n3 > n4 ? n4 - n10 : n7;
            }
            if (n3 != n7) {
                n4 = this.getScrollX();
                this.scrollTo(n4, n3);
            }
        }
        n3 = this.getScrollX();
        n4 = this.getScrollY();
        this.scrollTo(n3, n4);
        this.i = true;
    }

    public final void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        int n7 = this.m;
        if (n7 == 0) {
            return;
        }
        if ((n4 = View.MeasureSpec.getMode((int)n4)) == 0) {
            return;
        }
        n4 = this.getChildCount();
        if (n4 > 0) {
            n4 = 0;
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            int n8 = view.getMeasuredHeight();
            int n10 = this.getMeasuredHeight();
            int n14 = this.getPaddingTop();
            n10 -= n14;
            n14 = this.getPaddingBottom();
            n10 -= n14;
            n14 = layoutParams.topMargin;
            n10 -= n14;
            n14 = layoutParams.bottomMargin;
            if (n8 < (n10 -= n14)) {
                n8 = this.getPaddingLeft();
                n14 = this.getPaddingRight() + n8;
                n8 = layoutParams.leftMargin;
                n14 += n8;
                n8 = layoutParams.rightMargin;
                n7 = layoutParams.width;
                n3 = ViewGroup.getChildMeasureSpec((int)n3, (int)(n14 += n8), (int)n7);
                n7 = View.MeasureSpec.makeMeasureSpec((int)n10, (int)0x40000000);
                view.measure(n3, n7);
            }
        }
    }

    public final boolean onNestedFling(View view, float f5, float f6, boolean bl2) {
        if (!bl2) {
            boolean bl3 = true;
            this.dispatchNestedFling(0.0f, f6, bl3);
            int n3 = (int)f6;
            this.e(n3);
            return bl3;
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f5, float f6) {
        return this.y.b(f5, f6);
    }

    public final void onNestedPreScroll(View view, int n3, int n4, int[] nArray) {
        this.c(n3, n4, nArray, null, 0);
    }

    public final void onNestedPreScroll(View view, int n3, int n4, int[] nArray, int n7) {
        this.c(n3, n4, nArray, null, n7);
    }

    public final void onNestedScroll(View view, int n3, int n4, int n7, int n8) {
        this.i(n8, 0, null);
    }

    public final void onNestedScroll(View view, int n3, int n4, int n7, int n8, int n10) {
        this.i(n8, n10, null);
    }

    public final void onNestedScroll(View view, int n3, int n4, int n7, int n8, int n10, int[] nArray) {
        this.i(n8, n10, nArray);
    }

    public final void onNestedScrollAccepted(View view, View view2, int n3) {
        this.onNestedScrollAccepted(view, view2, n3, 0);
    }

    public final void onNestedScrollAccepted(View view, View object, int n3, int n4) {
        int n7 = 1;
        object = this.x;
        if (n4 == n7) {
            object.b = n3;
        } else {
            object.a = n3;
        }
        this.q(2, n4);
    }

    public final void onOverScrolled(int n3, int n4, boolean bl2, boolean bl3) {
        super.scrollTo(n3, n4);
    }

    public final boolean onRequestFocusInDescendants(int n3, Rect rect) {
        int n4 = 2;
        int n7 = 1;
        if (n3 == n4) {
            n3 = 130;
        } else if (n3 == n7) {
            n3 = 33;
        }
        View view = rect == null ? FocusFinder.getInstance().findNextFocus((ViewGroup)this, null, n3) : FocusFinder.getInstance().findNextFocusFromRect((ViewGroup)this, rect, n3);
        if (view == null) {
            return false;
        }
        int n8 = this.getHeight();
        if ((n7 ^= (n8 = (int)(this.h(view, 0, n8) ? 1 : 0))) != 0) {
            return false;
        }
        return view.requestFocus(n3, rect);
    }

    public final void onRestoreInstanceState(Parcelable object) {
        boolean bl2 = object instanceof NestedScrollView$SavedState;
        if (!bl2) {
            super.onRestoreInstanceState(object);
            return;
        }
        object = (NestedScrollView$SavedState)((Object)object);
        Parcelable parcelable = object.getSuperState();
        super.onRestoreInstanceState(parcelable);
        this.w = object;
        this.requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        int n3;
        Parcelable parcelable = super.onSaveInstanceState();
        NestedScrollView$SavedState nestedScrollView$SavedState = new View.BaseSavedState(parcelable);
        nestedScrollView$SavedState.a = n3 = this.getScrollY();
        return nestedScrollView$SavedState;
    }

    public final void onScrollChanged(int n3, int n4, int n7, int n8) {
        super.onScrollChanged(n3, n4, n7, n8);
        NestedScrollView$d nestedScrollView$d = this.A;
        if (nestedScrollView$d != null) {
            nestedScrollView$d.a(this);
        }
    }

    public final void onSizeChanged(int n3, int n4, int n7, int n8) {
        super.onSizeChanged(n3, n4, n7, n8);
        View view = this.findFocus();
        if (view != null && this != view) {
            n4 = 0;
            n7 = (int)(this.h(view, 0, n8) ? 1 : 0);
            if (n7 != 0) {
                Rect rect = this.c;
                view.getDrawingRect(rect);
                this.offsetDescendantRectToMyCoords(view, rect);
                n3 = this.b(rect);
                if (n3 != 0) {
                    n7 = (int)(this.n ? 1 : 0);
                    if (n7 != 0) {
                        this.p(0, n3, false);
                    } else {
                        this.scrollBy(0, n3);
                    }
                }
            }
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int n3) {
        return this.onStartNestedScroll(view, view2, n3, 0);
    }

    public final boolean onStartNestedScroll(View view, View view2, int n3, int n4) {
        int n7 = n3 & 2;
        n7 = n7 != 0 ? 1 : 0;
        return n7 != 0;
    }

    public final void onStopNestedScroll(View view) {
        this.onStopNestedScroll(view, 0);
    }

    public final void onStopNestedScroll(View object, int n3) {
        object = this.x;
        int n4 = 1;
        if (n3 == n4) {
            object.b = 0;
        } else {
            object.a = 0;
        }
        this.s(n3);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        NestedScrollView nestedScrollView = this;
        MotionEvent motionEvent2 = motionEvent;
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker == null) {
            this.l = velocityTracker = VelocityTracker.obtain();
        }
        int n3 = motionEvent.getActionMasked();
        int n4 = 0;
        float f5 = 0.0f;
        if (n3 == 0) {
            nestedScrollView.u = 0;
        }
        MotionEvent motionEvent3 = MotionEvent.obtain((MotionEvent)motionEvent);
        float f6 = nestedScrollView.u;
        int n7 = 0;
        float f7 = 0.0f;
        ViewParent viewParent = null;
        motionEvent3.offsetLocation(0.0f, f6);
        int n8 = 1;
        f6 = Float.MIN_VALUE;
        int n10 = 2;
        float f8 = 2.8E-45f;
        if (n3 != 0) {
            EdgeEffect edgeEffect = nestedScrollView.f;
            EdgeEffect edgeEffect2 = nestedScrollView.e;
            int n14 = 0;
            int n15 = -1;
            float f11 = 0.0f / 0.0f;
            if (n3 != n8) {
                if (n3 != n10) {
                    n7 = 3;
                    f7 = 4.2E-45f;
                    if (n3 != n7) {
                        n4 = 5;
                        f5 = 7.0E-45f;
                        if (n3 != n4) {
                            n4 = 6;
                            f5 = 8.4E-45f;
                            if (n3 == n4) {
                                int n16;
                                this.j(motionEvent);
                                n3 = nestedScrollView.r;
                                n3 = motionEvent2.findPointerIndex(n3);
                                float f12 = motionEvent2.getY(n3);
                                nestedScrollView.g = n16 = (int)f12;
                            }
                        } else {
                            int n17;
                            n3 = motionEvent.getActionIndex();
                            f5 = motionEvent2.getY(n3);
                            nestedScrollView.g = n4 = (int)f5;
                            nestedScrollView.r = n17 = motionEvent2.getPointerId(n3);
                        }
                    } else {
                        int n18;
                        int n19;
                        int n20;
                        OverScroller overScroller;
                        int n21 = nestedScrollView.k;
                        if (n21 != 0 && (n21 = this.getChildCount()) > 0 && (n21 = (int)((overScroller = nestedScrollView.d).springBack(n20 = this.getScrollX(), n19 = this.getScrollY(), 0, 0, 0, n18 = this.getScrollRange()) ? 1 : 0)) != 0) {
                            this.postInvalidateOnAnimation();
                        }
                        nestedScrollView.r = n15;
                        nestedScrollView.k = false;
                        motionEvent2 = nestedScrollView.l;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            nestedScrollView.l = null;
                        }
                        nestedScrollView.s(0);
                        nestedScrollView.e.onRelease();
                        motionEvent2 = nestedScrollView.f;
                        motionEvent2.onRelease();
                    }
                } else {
                    n3 = nestedScrollView.r;
                    if ((n3 = motionEvent2.findPointerIndex(n3)) != n15) {
                        float f14;
                        f8 = motionEvent2.getY(n3);
                        n10 = (int)f8;
                        n14 = nestedScrollView.g - n10;
                        f11 = motionEvent2.getX(n3);
                        int n22 = this.getWidth();
                        float f15 = n22;
                        f11 /= f15;
                        f15 = n14;
                        float f16 = this.getHeight();
                        f15 /= f16;
                        f16 = kx0.a(edgeEffect2);
                        float f17 = f16 - 0.0f;
                        Object object = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                        if (object != false) {
                            f14 = -f15;
                            f14 = -kx0.b(edgeEffect2, f14, f11);
                            f11 = kx0.a(edgeEffect2);
                            float f18 = f11 - 0.0f;
                            n7 = (int)(f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1));
                            if (n7 == 0) {
                                edgeEffect2.onRelease();
                            }
                            f7 = f14;
                        } else {
                            float f19 = kx0.a(edgeEffect);
                            float f20 = f19 - 0.0f;
                            Object object2 = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
                            if (object2 != false) {
                                object2 = 1065353216;
                                f19 = 1.0f - f11;
                                f19 = kx0.b(edgeEffect, f15, f19);
                                f11 = kx0.a(edgeEffect);
                                float f22 = f11 - 0.0f;
                                n7 = (int)(f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1));
                                if (n7 == 0) {
                                    edgeEffect.onRelease();
                                }
                                f7 = f19;
                            }
                        }
                        int n24 = this.getHeight();
                        f14 = n24;
                        n7 = Math.round(f7 *= f14);
                        if (n7 != 0) {
                            this.invalidate();
                        }
                        n14 -= n7;
                        n7 = (int)(nestedScrollView.k ? 1 : 0);
                        if (n7 == 0 && (n7 = Math.abs(n14)) > (n24 = nestedScrollView.o)) {
                            viewParent = this.getParent();
                            if (viewParent != null) {
                                viewParent.requestDisallowInterceptTouchEvent(n8 != 0);
                            }
                            nestedScrollView.k = n8;
                            if (n14 > 0) {
                                n7 = nestedScrollView.o;
                                n14 -= n7;
                            } else {
                                n7 = nestedScrollView.o;
                                n14 += n7;
                            }
                        }
                        if ((n7 = (int)(nestedScrollView.k ? 1 : 0)) != 0) {
                            float f23 = motionEvent2.getX(n3);
                            int n25 = (int)f23;
                            n25 = nestedScrollView.n(n14, n25, 0, false);
                            nestedScrollView.g = n10 -= n25;
                            nestedScrollView.u = n3 = nestedScrollView.u + n25;
                        }
                    }
                }
            } else {
                motionEvent2 = nestedScrollView.l;
                float f24 = nestedScrollView.q;
                f8 = 1.401E-42f;
                motionEvent2.computeCurrentVelocity(1000, f24);
                n3 = nestedScrollView.r;
                float f25 = motionEvent2.getYVelocity(n3);
                int n26 = (int)f25;
                n3 = Math.abs(n26);
                n10 = nestedScrollView.p;
                if (n3 >= n10) {
                    f24 = kx0.a(edgeEffect2);
                    float f26 = f24 - 0.0f;
                    n3 = (int)(f26 == 0.0f ? 0 : (f26 > 0.0f ? 1 : -1));
                    if (n3 != 0) {
                        n3 = (int)(nestedScrollView.o(edgeEffect2, n26) ? 1 : 0);
                        if (n3 != 0) {
                            edgeEffect2.onAbsorb(n26);
                        } else {
                            n26 = -n26;
                            nestedScrollView.e(n26);
                        }
                    } else {
                        f24 = kx0.a(edgeEffect);
                        float f27 = f24 - 0.0f;
                        n3 = (int)(f27 == 0.0f ? 0 : (f27 > 0.0f ? 1 : -1));
                        if (n3 != 0) {
                            n3 = (int)(nestedScrollView.o(edgeEffect, n26 = -n26) ? 1 : 0);
                            if (n3 != 0) {
                                edgeEffect.onAbsorb(n26);
                            } else {
                                nestedScrollView.e(n26);
                            }
                        } else {
                            vU1 vU12 = nestedScrollView.y;
                            f24 = n26 = -n26;
                            n10 = (int)(vU12.b(0.0f, f24) ? 1 : 0);
                            if (n10 == 0) {
                                nestedScrollView.dispatchNestedFling(0.0f, f24, n8 != 0);
                                nestedScrollView.e(n26);
                            }
                        }
                    }
                } else {
                    int n27;
                    int n28;
                    OverScroller overScroller = nestedScrollView.d;
                    int n29 = this.getScrollX();
                    n26 = (int)(overScroller.springBack(n29, n28 = this.getScrollY(), 0, 0, 0, n27 = this.getScrollRange()) ? 1 : 0);
                    if (n26 != 0) {
                        this.postInvalidateOnAnimation();
                    }
                }
                nestedScrollView.r = n15;
                nestedScrollView.k = false;
                motionEvent2 = nestedScrollView.l;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    nestedScrollView.l = null;
                }
                nestedScrollView.s(0);
                nestedScrollView.e.onRelease();
                motionEvent2 = nestedScrollView.f;
                motionEvent2.onRelease();
            }
        } else {
            n3 = this.getChildCount();
            if (n3 == 0) {
                return false;
            }
            n3 = (int)(nestedScrollView.k ? 1 : 0);
            if (n3 != 0 && (velocityTracker = this.getParent()) != null) {
                velocityTracker.requestDisallowInterceptTouchEvent(n8 != 0);
            }
            if ((n3 = (int)((velocityTracker = nestedScrollView.d).isFinished() ? 1 : 0)) == 0) {
                velocityTracker = nestedScrollView.d;
                velocityTracker.abortAnimation();
                nestedScrollView.s(n8);
            }
            float f28 = motionEvent.getY();
            n3 = (int)f28;
            int n30 = motionEvent2.getPointerId(0);
            nestedScrollView.g = n3;
            nestedScrollView.r = n30;
            nestedScrollView.q(n10, 0);
        }
        motionEvent2 = nestedScrollView.l;
        if (motionEvent2 != null) {
            motionEvent2.addMovement(motionEvent3);
        }
        motionEvent3.recycle();
        return n8 != 0;
    }

    public final void p(int n3, int n4, boolean bl2) {
        long l2;
        int n7 = this.getChildCount();
        if (n7 == 0) {
            return;
        }
        long l3 = AnimationUtils.currentAnimationTimeMillis();
        long l4 = this.b;
        l3 -= l4;
        l4 = 250L;
        int n8 = 1;
        Object object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object > 0) {
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            n7 = view.getHeight();
            int n10 = layoutParams.topMargin;
            n7 += n10;
            int n14 = layoutParams.bottomMargin;
            n7 += n14;
            n14 = this.getHeight();
            n10 = this.getPaddingTop();
            n14 -= n10;
            n10 = this.getPaddingBottom();
            int n15 = this.getScrollY();
            n7 -= (n14 -= n10);
            n7 = Math.max(0, n7);
            n4 = Math.min(n4 + n15, n7);
            n3 = Math.max(0, n4);
            int n16 = n3 - n15;
            OverScroller overScroller = this.d;
            int n17 = this.getScrollX();
            int n18 = 250;
            overScroller.startScroll(n17, n15, 0, n16, n18);
            if (bl2) {
                n3 = 2;
                this.q(n3, n8);
            } else {
                this.s(n8);
            }
            this.v = n3 = this.getScrollY();
            this.postInvalidateOnAnimation();
        } else {
            OverScroller overScroller = this.d;
            bl2 = overScroller.isFinished();
            if (!bl2) {
                overScroller = this.d;
                overScroller.abortAnimation();
                this.s(n8);
            }
            this.scrollBy(n3, n4);
        }
        this.b = l2 = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean q(int n3, int n4) {
        return this.y.i(2, n4);
    }

    public final boolean r(MotionEvent motionEvent) {
        float f5;
        int n3;
        float f6;
        int n4;
        EdgeEffect edgeEffect = this.e;
        float f7 = kx0.a(edgeEffect);
        int n7 = 1;
        float f8 = f7 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object != false) {
            f7 = motionEvent.getX();
            n4 = this.getWidth();
            f6 = n4;
            kx0.b(edgeEffect, 0.0f, f7 /= f6);
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
            edgeEffect = null;
        }
        EdgeEffect edgeEffect2 = this.f;
        f6 = kx0.a(edgeEffect2);
        float f11 = f6 - 0.0f;
        n4 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
        if (n4 != 0) {
            float f12 = motionEvent.getX();
            f5 = this.getWidth();
            f12 /= f5;
            n3 = 1065353216;
            f5 = 1.0f - f12;
            kx0.b(edgeEffect2, 0.0f, f5);
        } else {
            n7 = n3;
        }
        return n7 != 0;
    }

    public final void requestChildFocus(View view, View view2) {
        int n3 = this.h;
        if (n3 == 0) {
            Rect rect = this.c;
            view2.getDrawingRect(rect);
            this.offsetDescendantRectToMyCoords(view2, rect);
            n3 = this.b(rect);
            if (n3 != 0) {
                this.scrollBy(0, n3);
            }
        } else {
            this.j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    /*
     * WARNING - void declaration
     */
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean bl2) {
        void var4_8;
        int bl3 = view.getLeft();
        int n3 = view.getScrollX();
        int n4 = bl3 - n3;
        n3 = view.getTop();
        int n7 = view.getScrollY();
        rect.offset(n4, n3 -= n7);
        n7 = this.b(rect);
        rect = null;
        if (n7 != 0) {
            boolean bl4 = true;
        } else {
            boolean bl5 = false;
        }
        if (var4_8 != false) {
            if (bl2) {
                this.scrollBy(0, n7);
            } else {
                this.p(0, n7, false);
            }
        }
        return (boolean)var4_8;
    }

    public final void requestDisallowInterceptTouchEvent(boolean bl2) {
        VelocityTracker velocityTracker;
        if (bl2 && (velocityTracker = this.l) != null) {
            velocityTracker.recycle();
            velocityTracker = null;
            this.l = null;
        }
        super.requestDisallowInterceptTouchEvent(bl2);
    }

    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public final void s(int n3) {
        this.y.j(n3);
    }

    public final void scrollTo(int n3, int n4) {
        int n7 = this.getChildCount();
        if (n7 > 0) {
            n7 = 0;
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            int n8 = this.getWidth();
            int n10 = this.getPaddingLeft();
            n8 -= n10;
            n10 = this.getPaddingRight();
            n8 -= n10;
            n10 = view.getWidth();
            int n14 = layoutParams.leftMargin;
            n10 += n14;
            n14 = layoutParams.rightMargin;
            n10 += n14;
            n14 = this.getHeight();
            int n15 = this.getPaddingTop();
            n14 -= n15;
            n15 = this.getPaddingBottom();
            n14 -= n15;
            int n16 = view.getHeight();
            n15 = layoutParams.topMargin;
            n16 += n15;
            int n17 = layoutParams.bottomMargin;
            n16 += n17;
            if (n8 < n10 && n3 >= 0) {
                n17 = n8 + n3;
                if (n17 > n10) {
                    n3 = n10 - n8;
                }
            } else {
                n3 = 0;
            }
            if (n14 < n16 && n4 >= 0) {
                n7 = n14 + n4;
                if (n7 > n16) {
                    n4 = n16 - n14;
                }
            } else {
                n4 = 0;
            }
            if (n3 != (n7 = this.getScrollX()) || n4 != (n7 = this.getScrollY())) {
                super.scrollTo(n3, n4);
            }
        }
    }

    public void setFillViewport(boolean bl2) {
        boolean bl3 = this.m;
        if (bl2 != bl3) {
            this.m = bl2;
            this.requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean bl2) {
        this.y.h(bl2);
    }

    public void setOnScrollChangeListener(NestedScrollView$d nestedScrollView$d) {
        this.A = nestedScrollView$d;
    }

    public void setSmoothScrollingEnabled(boolean bl2) {
        this.n = bl2;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int n3) {
        return this.y.i(n3, 0);
    }

    public final void stopNestedScroll() {
        this.s(0);
    }
}

