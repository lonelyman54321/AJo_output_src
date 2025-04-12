/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Region$Op
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.view.Gravity
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewGroup$OnHierarchyChangeListener
 *  android.view.ViewParent
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.R$attr;
import androidx.coordinatorlayout.R$style;
import androidx.coordinatorlayout.R$styleable;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState;
import androidx.coordinatorlayout.widget.CoordinatorLayout$a;
import androidx.coordinatorlayout.widget.CoordinatorLayout$b;
import androidx.coordinatorlayout.widget.CoordinatorLayout$c;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.coordinatorlayout.widget.CoordinatorLayout$f;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$b;
import androidx.core.view.ViewCompat$c;
import androidx.core.view.f;
import androidx.core.view.f$k;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CoordinatorLayout
extends ViewGroup
implements wu1_0,
xu1_2 {
    static final Class[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal sConstructors;
    private static final yw2 sRectPool;
    private T72 mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final Gq0 mChildDag;
    private final List mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private f mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final yu1_0 mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private CoordinatorLayout$f mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List mTempList1;

    static {
        Object object = CoordinatorLayout.class.getPackage();
        object = object != null ? object.getName() : null;
        WIDGET_PACKAGE_NAME = object;
        object = new Object();
        TOP_SORTED_CHILDREN_COMPARATOR = object;
        object = new Class[]{Context.class, AttributeSet.class};
        CONSTRUCTOR_PARAMS = object;
        sConstructors = object = new ThreadLocal();
        sRectPool = object = new bw2_1(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.coordinatorLayoutStyle;
        this(context, attributeSet, n3);
    }

    public CoordinatorLayout(Context object, AttributeSet object2, int n3) {
        int n4;
        int[] nArray;
        int n7;
        int n8 = 1;
        super(object, object2, n3);
        Object object3 = new ArrayList();
        this.mDependencySortedChildren = object3;
        this.mChildDag = object3 = new Gq0();
        object3 = new ArrayList();
        this.mTempList1 = object3;
        int n10 = 2;
        Object object4 = new int[n10];
        this.mBehaviorConsumed = object4;
        object3 = new int[n10];
        this.mNestedScrollingV2ConsumedCompat = (int[])object3;
        this.mNestedScrollingParentHelper = object3 = new Object();
        n10 = 0;
        object3 = null;
        if (n3 == 0) {
            object4 = R$styleable.CoordinatorLayout;
            n7 = R$style.Widget_Support_CoordinatorLayout;
            object4 = object.obtainStyledAttributes(object2, object4, 0, n7);
        } else {
            object4 = R$styleable.CoordinatorLayout;
            object4 = object.obtainStyledAttributes(object2, object4, n3, 0);
        }
        if (n3 == 0) {
            nArray = R$styleable.CoordinatorLayout;
            n4 = R$style.Widget_Support_CoordinatorLayout;
            ViewCompat.r((View)this, object, nArray, object2, (TypedArray)object4, 0, n4);
        } else {
            nArray = R$styleable.CoordinatorLayout;
            n4 = 0;
            ViewCompat.r((View)this, object, nArray, object2, (TypedArray)object4, n3, 0);
        }
        int n14 = R$styleable.CoordinatorLayout_keylines;
        n14 = object4.getResourceId(n14, 0);
        if (n14 != 0) {
            object = object.getResources();
            object2 = object.getIntArray(n14);
            this.mKeylines = (int[])object2;
            object = object.getDisplayMetrics();
            float f5 = object.density;
            object2 = this.mKeylines;
            n14 = ((AttributeSet)object2).length;
            while (n10 < n14) {
                int[] nArray2 = this.mKeylines;
                float f6 = (float)nArray2[n10] * f5;
                nArray2[n10] = n7 = (int)f6;
                n10 += n8;
            }
        }
        int n15 = R$styleable.CoordinatorLayout_statusBarBackground;
        object = object4.getDrawable(n15);
        this.mStatusBarBackground = object;
        object4.recycle();
        this.setupForInsets();
        super(this);
        super.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener)object);
        object = ViewCompat.a;
        n15 = this.getImportantForAccessibility();
        if (n15 == 0) {
            this.setImportantForAccessibility(n8);
        }
    }

    private static Rect acquireTempRect() {
        Rect rect = (Rect)sRectPool.b();
        if (rect == null) {
            rect = new Rect();
        }
        return rect;
    }

    private void cancelInterceptBehaviors() {
        int n3 = this.getChildCount();
        MotionEvent motionEvent = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = this.getChildAt(i3);
            CoordinatorLayout$Behavior coordinatorLayout$Behavior = ((CoordinatorLayout$e)view.getLayoutParams()).a;
            if (coordinatorLayout$Behavior == null) continue;
            if (motionEvent == null) {
                long l2 = SystemClock.uptimeMillis();
                int n4 = 3;
                motionEvent = MotionEvent.obtain((long)l2, (long)l2, (int)n4, (float)0.0f, (float)0.0f, (int)0);
            }
            coordinatorLayout$Behavior.onInterceptTouchEvent(this, view, motionEvent);
        }
        if (motionEvent != null) {
            motionEvent.recycle();
        }
    }

    private static int clamp(int n3, int n4, int n7) {
        if (n3 < n4) {
            return n4;
        }
        if (n3 > n7) {
            return n7;
        }
        return n3;
    }

    private void constrainChildRect(CoordinatorLayout$e coordinatorLayout$e, Rect rect, int n3, int n4) {
        int n7 = this.getWidth();
        int n8 = this.getHeight();
        int n10 = this.getPaddingLeft();
        int n14 = coordinatorLayout$e.leftMargin;
        n10 += n14;
        n14 = rect.left;
        int n15 = this.getPaddingRight();
        n7 = n7 - n15 - n3;
        n15 = coordinatorLayout$e.rightMargin;
        n7 -= n15;
        n7 = Math.min(n14, n7);
        n7 = Math.max(n10, n7);
        n10 = this.getPaddingTop();
        n14 = coordinatorLayout$e.topMargin;
        n10 += n14;
        n14 = rect.top;
        n15 = this.getPaddingBottom();
        n8 = n8 - n15 - n4;
        int n16 = coordinatorLayout$e.bottomMargin;
        n8 -= n16;
        n16 = Math.min(n14, n8);
        n16 = Math.max(n10, n16);
        rect.set(n7, n16, n3 += n7, n4 += n16);
    }

    private f dispatchApplyWindowInsetsToBehaviors(f f5) {
        f$k f$k = f5.a;
        int n3 = f$k.m();
        if (n3 != 0) {
            return f5;
        }
        n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = this.getChildAt(i3);
            Object object2 = ViewCompat.a;
            boolean bl2 = object.getFitsSystemWindows();
            if (!bl2 || (object2 = ((CoordinatorLayout$e)object.getLayoutParams()).a) == null) continue;
            f5 = ((CoordinatorLayout$Behavior)object2).onApplyWindowInsets(this, (View)object, f5);
            object = f5.a;
            boolean bl3 = ((f$k)object).m();
            if (bl3) break;
        }
        return f5;
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(int n3, Rect rect, Rect rect2, CoordinatorLayout$e coordinatorLayout$e, int n4, int n7) {
        int n8;
        int n10;
        int n14 = Gravity.getAbsoluteGravity((int)CoordinatorLayout.resolveAnchoredChildGravity(coordinatorLayout$e.c), (int)n3);
        n3 = Gravity.getAbsoluteGravity((int)CoordinatorLayout.resolveGravity(coordinatorLayout$e.d), (int)n3);
        int n15 = n14 & 7;
        n14 &= 0x70;
        int n16 = n3 & 7;
        n3 &= 0x70;
        int n17 = 5;
        int n18 = 1;
        if (n16 != n18) {
            n16 = n16 != n17 ? rect.left : rect.right;
        } else {
            n16 = rect.left;
            n10 = rect.width() / 2;
            n16 += n10;
        }
        n10 = 80;
        int n19 = 16;
        if (n3 != n19) {
            n3 = n3 != n10 ? rect.top : rect.bottom;
        } else {
            n3 = rect.top;
            n8 = rect.height() / 2;
            n3 += n8;
        }
        if (n15 != n18) {
            if (n15 != n17) {
                n16 -= n4;
            }
        } else {
            n8 = n4 / 2;
            n16 -= n8;
        }
        if (n14 != n19) {
            if (n14 != n10) {
                n3 -= n7;
            }
        } else {
            n8 = n7 / 2;
            n3 -= n8;
        }
        rect2.set(n16, n3, n4 += n16, n7 += n3);
    }

    private int getKeyline(int n3) {
        int n4;
        int[] nArray = this.mKeylines;
        if (nArray == null) {
            this.toString();
            return 0;
        }
        if (n3 >= 0 && n3 < (n4 = nArray.length)) {
            return nArray[n3];
        }
        this.toString();
        return 0;
    }

    private void getTopSortedChildren(List list) {
        list.clear();
        boolean bl2 = this.isChildrenDrawingOrderEnabled();
        int n3 = this.getChildCount();
        for (int i3 = n3 + -1; i3 >= 0; i3 += -1) {
            int n4 = bl2 ? this.getChildDrawingOrder(n3, i3) : i3;
            View view = this.getChildAt(n4);
            list.add(view);
        }
        Comparator comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean hasDependencies(View view) {
        a53 a532 = this.mChildDag.b;
        int n3 = a532.c;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl3;
            ArrayList arrayList = (ArrayList)a532.l(i3);
            if (arrayList == null || !(bl3 = arrayList.contains(view))) continue;
            bl2 = true;
            break;
        }
        return bl2;
    }

    private void layoutChild(View view, int n3) {
        CoordinatorLayout$e coordinatorLayout$e = (CoordinatorLayout$e)view.getLayoutParams();
        Rect rect = CoordinatorLayout.acquireTempRect();
        int n4 = this.getPaddingLeft();
        int n7 = coordinatorLayout$e.leftMargin;
        n4 += n7;
        n7 = this.getPaddingTop();
        int n8 = coordinatorLayout$e.topMargin;
        n7 += n8;
        n8 = this.getWidth();
        int n10 = this.getPaddingRight();
        n8 -= n10;
        n10 = coordinatorLayout$e.rightMargin;
        n8 -= n10;
        n10 = this.getHeight();
        int n14 = this.getPaddingBottom();
        n10 -= n14;
        n14 = coordinatorLayout$e.bottomMargin;
        rect.set(n4, n7, n8, n10 -= n14);
        Object object = this.mLastInsets;
        if (object != null) {
            object = ViewCompat.a;
            n4 = (int)(this.getFitsSystemWindows() ? 1 : 0);
            if (n4 != 0 && (n4 = (int)(view.getFitsSystemWindows() ? 1 : 0)) == 0) {
                n4 = rect.left;
                rect.left = n7 = this.mLastInsets.b() + n4;
                n4 = rect.top;
                rect.top = n7 = this.mLastInsets.d() + n4;
                n4 = rect.right;
                n7 = this.mLastInsets.c();
                rect.right = n4 -= n7;
                n4 = rect.bottom;
                f f5 = this.mLastInsets;
                n7 = f5.a();
                rect.bottom = n4 -= n7;
            }
        }
        Rect rect2 = CoordinatorLayout.acquireTempRect();
        n4 = CoordinatorLayout.resolveGravity(coordinatorLayout$e.c);
        n7 = view.getMeasuredWidth();
        n8 = view.getMeasuredHeight();
        Gravity.apply((int)n4, (int)n7, (int)n8, (Rect)rect, (Rect)rect2, (int)n3);
        n3 = rect2.left;
        int n15 = rect2.top;
        n4 = rect2.right;
        n7 = rect2.bottom;
        view.layout(n3, n15, n4, n7);
        CoordinatorLayout.releaseTempRect(rect);
        CoordinatorLayout.releaseTempRect(rect2);
    }

    private void layoutChildWithAnchor(View view, View view2, int n3) {
        Rect rect = CoordinatorLayout.acquireTempRect();
        Rect rect2 = CoordinatorLayout.acquireTempRect();
        try {
            this.getDescendantRect(view2, rect);
            this.getDesiredAnchoredChildRect(view, n3, rect, rect2);
            int n4 = rect2.left;
            n3 = rect2.top;
            int n7 = rect2.right;
            int n8 = rect2.bottom;
            view.layout(n4, n3, n7, n8);
            return;
        }
        finally {
            CoordinatorLayout.releaseTempRect(rect);
            CoordinatorLayout.releaseTempRect(rect2);
        }
    }

    private void layoutChildWithKeyline(View view, int n3, int n4) {
        CoordinatorLayout$e coordinatorLayout$e = (CoordinatorLayout$e)view.getLayoutParams();
        int n7 = Gravity.getAbsoluteGravity((int)CoordinatorLayout.resolveKeylineGravity(coordinatorLayout$e.c), (int)n4);
        int n8 = n7 & 7;
        n7 &= 0x70;
        int n10 = this.getWidth();
        int n14 = this.getHeight();
        int n15 = view.getMeasuredWidth();
        int n16 = view.getMeasuredHeight();
        int n17 = 1;
        if (n4 == n17) {
            n3 = n10 - n3;
        }
        n3 = this.getKeyline(n3) - n15;
        if (n8 != n17) {
            n4 = 5;
            if (n8 == n4) {
                n3 += n15;
            }
        } else {
            n4 = n15 / 2;
            n3 += n4;
        }
        n4 = 16;
        n4 = n7 != n4 ? (n7 != (n4 = 80) ? 0 : n16) : n16 / 2;
        n7 = this.getPaddingLeft();
        n8 = coordinatorLayout$e.leftMargin;
        n7 += n8;
        n8 = this.getPaddingRight();
        n10 = n10 - n8 - n15;
        n8 = coordinatorLayout$e.rightMargin;
        n3 = Math.min(n3, n10 -= n8);
        n3 = Math.max(n7, n3);
        n7 = this.getPaddingTop();
        n8 = coordinatorLayout$e.topMargin;
        n7 += n8;
        n8 = this.getPaddingBottom();
        n14 = n14 - n8 - n16;
        int n18 = coordinatorLayout$e.bottomMargin;
        n4 = Math.min(n4, n14 -= n18);
        n4 = Math.max(n7, n4);
        view.layout(n3, n4, n15 += n3, n16 += n4);
    }

    private MotionEvent obtainCancelEvent(MotionEvent motionEvent) {
        motionEvent = MotionEvent.obtain((MotionEvent)motionEvent);
        motionEvent.setAction(3);
        return motionEvent;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void offsetChildByInset(View var1_1, Rect var2_2, int var3_3) {
        block15: {
            var4_4 = 3;
            var5_5 = 80;
            var6_6 = 48;
            var7_7 /* !! */  = ViewCompat.a;
            var8_8 = var1_1 /* !! */ .isLaidOut();
            if (var8_8 == 0) {
                return;
            }
            var8_8 = var1_1 /* !! */ .getWidth();
            if (var8_8 <= 0 || (var8_8 = var1_1 /* !! */ .getHeight()) <= 0) break block15;
            var7_7 /* !! */  = (CoordinatorLayout$e)var1_1 /* !! */ .getLayoutParams();
            var9_9 = var7_7 /* !! */ .a;
            var10_10 = CoordinatorLayout.acquireTempRect();
            var11_11 = CoordinatorLayout.acquireTempRect();
            var12_12 = var1_1 /* !! */ .getLeft();
            var13_13 = var1_1 /* !! */ .getTop();
            var14_14 = var1_1 /* !! */ .getRight();
            var15_15 = var1_1 /* !! */ .getBottom();
            var11_11.set(var12_12, var13_13, var14_14, var15_15);
            if (var9_9 != null && (var16_16 = var9_9.getInsetDodgeRect(this, var1_1 /* !! */ , var10_10)) != 0) {
                var16_16 = var11_11.contains(var10_10);
                if (var16_16 == 0) {
                    var2_2 = new StringBuilder("Rect should be within the child's bounds. Rect:");
                    var17_17 = var10_10.toShortString();
                    var2_2.append(var17_17);
                    var2_2.append(" | Bounds:");
                    var17_17 = var11_11.toShortString();
                    var2_2.append(var17_17);
                    var2_2 = var2_2.toString();
                    var1_1 /* !! */  = new IllegalArgumentException((String)var2_2);
                    throw var1_1 /* !! */ ;
                }
            } else {
                var10_10.set(var11_11);
            }
            CoordinatorLayout.releaseTempRect(var11_11);
            var16_16 = var10_10.isEmpty();
            if (var16_16 != 0) {
                CoordinatorLayout.releaseTempRect(var10_10);
                return;
            }
            var3_3 = Gravity.getAbsoluteGravity((int)var7_7 /* !! */ .h, (int)var3_3);
            var16_16 = var3_3 & 48;
            var18_18 = 1;
            var12_12 = 0;
            if (var16_16 != var6_6) ** GOTO lbl-1000
            var6_6 = var10_10.top;
            var16_16 = var7_7 /* !! */ .topMargin;
            var6_6 -= var16_16;
            var16_16 = var7_7 /* !! */ .j;
            if ((var6_6 -= var16_16) < (var16_16 = var2_2.top)) {
                this.setInsetOffsetY(var1_1 /* !! */ , var16_16 -= var6_6);
                var6_6 = 1;
            } else lbl-1000:
            // 2 sources

            {
                var6_6 = 0;
            }
            var16_16 = var3_3 & 80;
            if (var16_16 == var5_5) {
                var5_5 = this.getHeight();
                var16_16 = var10_10.bottom;
                var5_5 -= var16_16;
                var16_16 = var7_7 /* !! */ .bottomMargin;
                var5_5 -= var16_16;
                var16_16 = var7_7 /* !! */ .j;
                if ((var5_5 += var16_16) < (var16_16 = var2_2.bottom)) {
                    this.setInsetOffsetY(var1_1 /* !! */ , var5_5 -= var16_16);
                    var6_6 = 1;
                }
            }
            if (var6_6 == 0) {
                this.setInsetOffsetY(var1_1 /* !! */ , 0);
            }
            if ((var5_5 = var3_3 & 3) != var4_4) ** GOTO lbl-1000
            var4_4 = var10_10.left;
            var5_5 = var7_7 /* !! */ .leftMargin;
            var4_4 -= var5_5;
            var5_5 = var7_7 /* !! */ .i;
            if ((var4_4 -= var5_5) < (var5_5 = var2_2.left)) {
                this.setInsetOffsetX(var1_1 /* !! */ , var5_5 -= var4_4);
                var4_4 = 1;
            } else lbl-1000:
            // 2 sources

            {
                var4_4 = 0;
            }
            var5_5 = 5;
            if ((var3_3 &= var5_5) != var5_5) ** GOTO lbl-1000
            var3_3 = this.getWidth();
            var5_5 = var10_10.right;
            var3_3 -= var5_5;
            var5_5 = var7_7 /* !! */ .rightMargin;
            var3_3 -= var5_5;
            var5_5 = var7_7 /* !! */ .i;
            var19_19 = var2_2.right;
            if ((var3_3 += var5_5) < var19_19) {
                this.setInsetOffsetX(var1_1 /* !! */ , var3_3 -= var19_19);
            } else lbl-1000:
            // 2 sources

            {
                var18_18 = var4_4;
            }
            if (var18_18 == 0) {
                this.setInsetOffsetX(var1_1 /* !! */ , 0);
            }
            CoordinatorLayout.releaseTempRect(var10_10);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CoordinatorLayout$Behavior parseBehavior(Context object, AttributeSet object2, String string2) {
        Exception exception2;
        block8: {
            Class[] classArray;
            int n3;
            Object[] objectArray;
            Object object3;
            boolean bl2;
            block7: {
                bl2 = true;
                char c2 = TextUtils.isEmpty((CharSequence)string2);
                if (c2 != '\u0000') {
                    return null;
                }
                object3 = ".";
                c2 = string2.startsWith((String)object3);
                if (c2 != '\u0000') {
                    object3 = new StringBuilder();
                    objectArray = object.getPackageName();
                    ((StringBuilder)object3).append((String)objectArray);
                    ((StringBuilder)object3).append(string2);
                    string2 = ((StringBuilder)object3).toString();
                } else {
                    boolean bl3;
                    c2 = '.';
                    n3 = string2.indexOf(c2);
                    if (n3 < 0 && !(bl3 = TextUtils.isEmpty((CharSequence)(objectArray = WIDGET_PACKAGE_NAME)))) {
                        classArray = new StringBuilder();
                        classArray.append((String)objectArray);
                        classArray.append(c2);
                        classArray.append(string2);
                        string2 = classArray.toString();
                    }
                }
                try {
                    object3 = sConstructors;
                    objectArray = ((ThreadLocal)object3).get();
                    objectArray = (Map)objectArray;
                    if (objectArray != null) break block7;
                    objectArray = new HashMap();
                    ((ThreadLocal)object3).set(objectArray);
                }
                catch (Exception exception2) {
                    break block8;
                }
            }
            object3 = objectArray.get(string2);
            if ((object3 = (Constructor)object3) == null) {
                object3 = object.getClassLoader();
                object3 = Class.forName(string2, false, (ClassLoader)object3);
                classArray = CONSTRUCTOR_PARAMS;
                object3 = ((Class)object3).getConstructor(classArray);
                ((AccessibleObject)object3).setAccessible(bl2);
                objectArray.put(string2, object3);
            }
            n3 = 2;
            objectArray = new Object[n3];
            objectArray[0] = object;
            objectArray[bl2] = object2;
            object = ((Constructor)object3).newInstance(objectArray);
            return (CoordinatorLayout$Behavior)object;
        }
        string2 = kp1_0.c("Could not inflate Behavior subclass ", string2);
        object2 = new RuntimeException(string2, exception2);
        throw object2;
    }

    private boolean performEvent(CoordinatorLayout$Behavior object, View view, MotionEvent motionEvent, int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4) {
                return ((CoordinatorLayout$Behavior)object).onTouchEvent(this, view, motionEvent);
            }
            object = new IllegalArgumentException();
            throw object;
        }
        return ((CoordinatorLayout$Behavior)object).onInterceptTouchEvent(this, view, motionEvent);
    }

    private boolean performIntercept(MotionEvent motionEvent, int n3) {
        int n4 = motionEvent.getActionMasked();
        List list = this.mTempList1;
        this.getTopSortedChildren(list);
        int n7 = list.size();
        MotionEvent motionEvent2 = null;
        boolean bl2 = false;
        int n8 = 0;
        CoordinatorLayout$Behavior coordinatorLayout$Behavior = null;
        for (int i3 = 0; i3 < n7; ++i3) {
            int n10;
            View view = (View)list.get(i3);
            CoordinatorLayout$e coordinatorLayout$e = (CoordinatorLayout$e)view.getLayoutParams();
            CoordinatorLayout$Behavior coordinatorLayout$Behavior2 = coordinatorLayout$e.a;
            if ((bl2 || n8 != 0) && n4 != 0) {
                if (coordinatorLayout$Behavior2 == null) continue;
                if (motionEvent2 == null) {
                    motionEvent2 = this.obtainCancelEvent(motionEvent);
                }
                this.performEvent(coordinatorLayout$Behavior2, view, motionEvent2, n3);
                continue;
            }
            int n14 = 1;
            if (n8 == 0 && !bl2 && coordinatorLayout$Behavior2 != null && (bl2 = this.performEvent(coordinatorLayout$Behavior2, view, motionEvent, n3))) {
                this.mBehaviorTouchView = view;
                n8 = 3;
                if (n4 != n8 && n4 != n14) {
                    coordinatorLayout$Behavior = null;
                    for (n8 = 0; n8 < i3; ++n8) {
                        coordinatorLayout$Behavior2 = (View)list.get(n8);
                        CoordinatorLayout$Behavior coordinatorLayout$Behavior3 = ((CoordinatorLayout$e)coordinatorLayout$Behavior2.getLayoutParams()).a;
                        if (coordinatorLayout$Behavior3 == null) continue;
                        if (motionEvent2 == null) {
                            motionEvent2 = this.obtainCancelEvent(motionEvent);
                        }
                        this.performEvent(coordinatorLayout$Behavior3, (View)coordinatorLayout$Behavior2, motionEvent2, n3);
                    }
                }
            }
            if ((coordinatorLayout$Behavior = coordinatorLayout$e.a) == null) {
                coordinatorLayout$e.m = false;
            }
            if ((n10 = coordinatorLayout$e.m) != 0) {
                n8 = 1;
            } else {
                if (coordinatorLayout$Behavior != null) {
                    n8 = coordinatorLayout$Behavior.blocksInteractionBelow(this, view);
                } else {
                    n8 = 0;
                    coordinatorLayout$Behavior = null;
                }
                coordinatorLayout$e.m = n8 |= n10;
            }
            if (n8 == 0 || n10 != 0) {
                n14 = 0;
            }
            if (n8 != 0 && n14 == 0) break;
            n8 = n14;
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void prepareChildren() {
        Object object;
        Object object2;
        this.mDependencySortedChildren.clear();
        Object object3 = this.mChildDag;
        Object object4 = ((Gq0)object3).b;
        int n3 = ((a53)object4).c;
        int n4 = 0;
        String string2 = null;
        Object object5 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            object2 = (ArrayList)((a53)object4).l(i3);
            if (object2 == null) continue;
            ((ArrayList)object2).clear();
            object = ((Gq0)object3).a;
            ((zw2_0)object).a(object2);
        }
        ((a53)object4).clear();
        int n7 = this.getChildCount();
        int n8 = 0;
        object4 = null;
        while (true) {
            int n10;
            int n14;
            Object object6;
            int n15;
            int n16;
            Object object7;
            block20: {
                block26: {
                    block24: {
                        block25: {
                            block19: {
                                block23: {
                                    Object object8;
                                    block21: {
                                        block22: {
                                            if (n8 >= n7) break block21;
                                            object7 = this.getChildAt(n8);
                                            object5 = this.getResolvedLayoutParams((View)object7);
                                            n16 = ((CoordinatorLayout$e)((Object)object5)).f;
                                            n15 = -1;
                                            object8 = null;
                                            if (n16 != n15) break block22;
                                            ((CoordinatorLayout$e)((Object)object5)).l = null;
                                            ((CoordinatorLayout$e)((Object)object5)).k = null;
                                            break block20;
                                        }
                                        object = ((CoordinatorLayout$e)((Object)object5)).k;
                                        if (object == null || (n15 = object.getId()) != n16) break block19;
                                        object = ((CoordinatorLayout$e)((Object)object5)).k;
                                        break block23;
                                    }
                                    object3 = this.mDependencySortedChildren;
                                    object4 = this.mChildDag;
                                    object7 = ((Gq0)object4).c;
                                    ((ArrayList)object7).clear();
                                    object5 = ((Gq0)object4).d;
                                    ((HashSet)object5).clear();
                                    object2 = ((Gq0)object4).b;
                                    n15 = ((a53)object2).c;
                                    while (true) {
                                        if (n4 >= n15) {
                                            object3.addAll(object7);
                                            Collections.reverse(this.mDependencySortedChildren);
                                            return;
                                        }
                                        object8 = ((a53)object2).h(n4);
                                        ((Gq0)object4).a(object8, (ArrayList)object7, (HashSet)object5);
                                        ++n4;
                                    }
                                }
                                for (object6 = object.getParent(); object6 != this; object6 = object6.getParent()) {
                                    if (object6 != null && object6 != object7) {
                                        n14 = object6 instanceof View;
                                        if (n14 == 0) continue;
                                        object = object6;
                                        object = (View)object6;
                                        continue;
                                    }
                                    ((CoordinatorLayout$e)((Object)object5)).l = null;
                                    ((CoordinatorLayout$e)((Object)object5)).k = null;
                                    break block19;
                                }
                                ((CoordinatorLayout$e)((Object)object5)).l = object;
                                break block20;
                            }
                            object = this.findViewById(n16);
                            ((CoordinatorLayout$e)((Object)object5)).k = object;
                            if (object == null) break block24;
                            if (object != this) break block25;
                            n16 = (int)(this.isInEditMode() ? 1 : 0);
                            if (n16 == 0) {
                                object3 = new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                                throw object3;
                            }
                            ((CoordinatorLayout$e)((Object)object5)).l = null;
                            ((CoordinatorLayout$e)((Object)object5)).k = null;
                            break block20;
                        }
                        object2 = object.getParent();
                        break block26;
                    }
                    n15 = (int)(this.isInEditMode() ? 1 : 0);
                    if (n15 == 0) {
                        object4 = new StringBuilder("Could not find CoordinatorLayout descendant view with id ");
                        string2 = this.getResources().getResourceName(n16);
                        ((StringBuilder)object4).append(string2);
                        ((StringBuilder)object4).append(" to anchor view ");
                        ((StringBuilder)object4).append(object7);
                        object4 = ((StringBuilder)object4).toString();
                        object3 = new IllegalStateException((String)object4);
                        throw object3;
                    }
                    ((CoordinatorLayout$e)((Object)object5)).l = null;
                    ((CoordinatorLayout$e)((Object)object5)).k = null;
                    break block20;
                }
                while (object2 != this && object2 != null) {
                    if (object2 == object7) {
                        n16 = (int)(this.isInEditMode() ? 1 : 0);
                        if (n16 == 0) {
                            object3 = new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            throw object3;
                        }
                        ((CoordinatorLayout$e)((Object)object5)).l = null;
                        ((CoordinatorLayout$e)((Object)object5)).k = null;
                        break block20;
                    }
                    n10 = object2 instanceof View;
                    if (n10 != 0) {
                        object = object2;
                        object = (View)object2;
                    }
                    object2 = ((ViewParent)object2).getParent();
                }
                ((CoordinatorLayout$e)((Object)object5)).l = object;
            }
            object2 = this.mChildDag.b;
            n15 = (int)(((a53)object2).containsKey(object7) ? 1 : 0);
            if (n15 == 0) {
                ((a53)object2).put(object7, null);
            }
            object2 = null;
            for (n16 = 0; n16 < n7; ++n16) {
                int n17;
                Object object9;
                if (n16 == n8) continue;
                object = this.getChildAt(n16);
                if (object != (object6 = ((CoordinatorLayout$e)((Object)object5)).l)) {
                    object6 = ViewCompat.a;
                    n10 = this.getLayoutDirection();
                    object9 = (CoordinatorLayout$e)object.getLayoutParams();
                    n14 = Gravity.getAbsoluteGravity((int)((CoordinatorLayout$e)((Object)object9)).g, (int)n10);
                    if ((n14 == 0 || (n10 = Gravity.getAbsoluteGravity((int)(n17 = ((CoordinatorLayout$e)((Object)object5)).h), (int)n10) & n14) != n14) && ((object6 = ((CoordinatorLayout$e)((Object)object5)).a) == null || (n10 = (int)(((CoordinatorLayout$Behavior)object6).layoutDependsOn(this, (View)object7, (View)object) ? 1 : 0)) == 0)) continue;
                }
                if ((n10 = (int)(((a53)(object6 = this.mChildDag.b)).containsKey(object) ? 1 : 0)) == 0 && (n14 = (int)(((a53)(object6 = this.mChildDag.b)).containsKey(object) ? 1 : 0)) == 0) {
                    ((a53)object6).put(object, null);
                }
                object6 = this.mChildDag;
                object9 = ((Gq0)object6).b;
                n17 = (int)(((a53)object9).containsKey(object) ? 1 : 0);
                if (n17 != 0 && (n17 = (int)(((a53)object9).containsKey(object7) ? 1 : 0)) != 0) {
                    Object object10 = (ArrayList)((a53)object9).get(object);
                    if (object10 == null) {
                        object6 = (ArrayList)((Gq0)object6).a.b();
                        if (object6 == null) {
                            object6 = new ArrayList();
                        }
                        object10 = object6;
                        ((a53)object9).put(object, object6);
                    }
                    ((ArrayList)object10).add(object7);
                    continue;
                }
                object3 = new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                throw object3;
            }
            ++n8;
        }
    }

    private static void releaseTempRect(Rect rect) {
        rect.setEmpty();
        sRectPool.a(rect);
    }

    private void resetTouchBehaviors() {
        int n3;
        View view;
        MotionEvent motionEvent;
        Object object = this.mBehaviorTouchView;
        if (object != null) {
            object = ((CoordinatorLayout$e)object.getLayoutParams()).a;
            if (object != null) {
                long l2 = SystemClock.uptimeMillis();
                int n4 = 3;
                motionEvent = MotionEvent.obtain((long)l2, (long)l2, (int)n4, (float)0.0f, (float)0.0f, (int)0);
                view = this.mBehaviorTouchView;
                ((CoordinatorLayout$Behavior)object).onTouchEvent(this, view, motionEvent);
                motionEvent.recycle();
            }
            n3 = 0;
            object = null;
            this.mBehaviorTouchView = null;
        }
        n3 = this.getChildCount();
        motionEvent = null;
        view = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            CoordinatorLayout$e coordinatorLayout$e = (CoordinatorLayout$e)this.getChildAt(i3).getLayoutParams();
            coordinatorLayout$e.m = false;
        }
        this.mDisallowInterceptReset = false;
    }

    private static int resolveAnchoredChildGravity(int n3) {
        if (n3 == 0) {
            n3 = 17;
        }
        return n3;
    }

    private static int resolveGravity(int n3) {
        int n4 = n3 & 7;
        if (n4 == 0) {
            n4 = 0x800003;
            n3 |= n4;
        }
        if ((n4 = n3 & 0x70) == 0) {
            n3 |= 0x30;
        }
        return n3;
    }

    private static int resolveKeylineGravity(int n3) {
        if (n3 == 0) {
            n3 = 8388661;
        }
        return n3;
    }

    private void setInsetOffsetX(View view, int n3) {
        CoordinatorLayout$e coordinatorLayout$e = (CoordinatorLayout$e)view.getLayoutParams();
        int n4 = coordinatorLayout$e.i;
        if (n4 != n3) {
            n4 = n3 - n4;
            ViewCompat.l(n4, view);
            coordinatorLayout$e.i = n3;
        }
    }

    private void setInsetOffsetY(View view, int n3) {
        CoordinatorLayout$e coordinatorLayout$e = (CoordinatorLayout$e)view.getLayoutParams();
        int n4 = coordinatorLayout$e.j;
        if (n4 != n3) {
            n4 = n3 - n4;
            ViewCompat.m(n4, view);
            coordinatorLayout$e.j = n3;
        }
    }

    private void setupForInsets() {
        Object object = ViewCompat.a;
        int n3 = this.getFitsSystemWindows();
        if (n3 != 0) {
            object = this.mApplyWindowInsetsListener;
            if (object == null) {
                this.mApplyWindowInsetsListener = object = new CoordinatorLayout$a(this);
            }
            object = this.mApplyWindowInsetsListener;
            ViewCompat$c.o((View)this, (T72)object);
            n3 = 1280;
            this.setSystemUiVisibility(n3);
        } else {
            n3 = 0;
            object = null;
            ViewCompat$c.o((View)this, null);
        }
    }

    public void addPreDrawListener() {
        boolean bl2 = this.mIsAttachedToWindow;
        if (bl2) {
            CoordinatorLayout$f coordinatorLayout$f = this.mOnPreDrawListener;
            if (coordinatorLayout$f == null) {
                this.mOnPreDrawListener = coordinatorLayout$f = new CoordinatorLayout$f(this);
            }
            coordinatorLayout$f = this.getViewTreeObserver();
            CoordinatorLayout$f coordinatorLayout$f2 = this.mOnPreDrawListener;
            coordinatorLayout$f.addOnPreDrawListener(coordinatorLayout$f2);
        }
        this.mNeedsPreDrawListener = true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean bl2;
        boolean bl3 = layoutParams instanceof CoordinatorLayout$e;
        if (bl3 && (bl2 = super.checkLayoutParams(layoutParams))) {
            bl2 = true;
        } else {
            bl2 = false;
            layoutParams = null;
        }
        return bl2;
    }

    public void dispatchDependentViewsChanged(View view) {
        int n3;
        ArrayList arrayList = (ArrayList)this.mChildDag.b.get(view);
        if (arrayList != null && (n3 = arrayList.isEmpty()) == 0) {
            int n4;
            for (n3 = 0; n3 < (n4 = arrayList.size()); ++n3) {
                View view2 = (View)arrayList.get(n3);
                CoordinatorLayout$Behavior coordinatorLayout$Behavior = ((CoordinatorLayout$e)view2.getLayoutParams()).a;
                if (coordinatorLayout$Behavior == null) continue;
                coordinatorLayout$Behavior.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public boolean doViewsOverlap(View view, View view2) {
        int n3 = view.getVisibility();
        boolean bl2 = false;
        if (n3 == 0 && (n3 = view2.getVisibility()) == 0) {
            Throwable throwable2;
            Rect rect;
            block15: {
                block14: {
                    int n4;
                    int n7;
                    rect = CoordinatorLayout.acquireTempRect();
                    ViewParent viewParent = view.getParent();
                    if (viewParent != this) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        viewParent = null;
                    }
                    this.getChildRect(view, n7 != 0, rect);
                    view = CoordinatorLayout.acquireTempRect();
                    viewParent = view2.getParent();
                    if (viewParent != this) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        viewParent = null;
                    }
                    this.getChildRect(view2, n7 != 0, (Rect)view);
                    try {
                        n4 = rect.left;
                    }
                    catch (Throwable throwable2) {
                        break block15;
                    }
                    n7 = view.right;
                    if (n4 > n7) break block14;
                    n4 = rect.top;
                    n7 = view.bottom;
                    if (n4 > n7) break block14;
                    n4 = rect.right;
                    n7 = view.left;
                    if (n4 < n7) break block14;
                    n4 = rect.bottom;
                    n7 = view.top;
                    if (n4 < n7) break block14;
                    bl2 = true;
                }
                CoordinatorLayout.releaseTempRect(rect);
                CoordinatorLayout.releaseTempRect((Rect)view);
                return bl2;
            }
            CoordinatorLayout.releaseTempRect(rect);
            CoordinatorLayout.releaseTempRect((Rect)view);
            throw throwable2;
        }
        return false;
    }

    public boolean drawChild(Canvas canvas, View view, long l2) {
        CoordinatorLayout$e coordinatorLayout$e = (CoordinatorLayout$e)view.getLayoutParams();
        CoordinatorLayout$Behavior coordinatorLayout$Behavior = coordinatorLayout$e.a;
        if (coordinatorLayout$Behavior != null) {
            float f5 = coordinatorLayout$Behavior.getScrimOpacity(this, view);
            Paint paint = null;
            float f6 = f5 - 0.0f;
            Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
            if (object > 0) {
                Region.Op op2;
                float f7;
                float f8;
                float f11;
                paint = this.mScrimPaint;
                if (paint == null) {
                    this.mScrimPaint = paint = new Paint();
                }
                paint = this.mScrimPaint;
                int n3 = coordinatorLayout$e.a.getScrimColor(this, view);
                paint.setColor(n3);
                coordinatorLayout$e = this.mScrimPaint;
                int n4 = Math.round(f5 *= 255.0f);
                object = false;
                paint = null;
                int n7 = 255;
                float f12 = 3.57E-43f;
                n4 = CoordinatorLayout.clamp(n4, 0, n7);
                coordinatorLayout$e.setAlpha(n4);
                n3 = canvas.save();
                n4 = (int)(view.isOpaque() ? 1 : 0);
                if (n4 != 0) {
                    f12 = view.getLeft();
                    f11 = view.getTop();
                    f8 = view.getRight();
                    n4 = view.getBottom();
                    f7 = n4;
                    op2 = Region.Op.DIFFERENCE;
                    paint = canvas;
                    canvas.clipRect(f12, f11, f8, f7, op2);
                }
                f12 = this.getPaddingLeft();
                f11 = this.getPaddingTop();
                n4 = this.getWidth();
                object = this.getPaddingRight();
                f8 = n4 - object;
                n4 = this.getHeight();
                object = this.getPaddingBottom();
                f7 = n4 -= object;
                op2 = this.mScrimPaint;
                paint = canvas;
                canvas.drawRect(f12, f11, f8, f7, (Paint)op2);
                canvas.restoreToCount(n3);
            }
        }
        return super.drawChild(canvas, view, l2);
    }

    public void drawableStateChanged() {
        boolean bl2;
        boolean bl3;
        super.drawableStateChanged();
        int[] nArray = this.getDrawableState();
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != null && (bl3 = drawable2.isStateful())) {
            bl2 = drawable2.setState(nArray);
        } else {
            bl2 = false;
            nArray = null;
        }
        if (bl2) {
            this.invalidate();
        }
    }

    public void ensurePreDrawListener() {
        int n3 = this.getChildCount();
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = this.getChildAt(i3);
            boolean bl2 = this.hasDependencies(view);
            if (!bl2) continue;
            n4 = 1;
            break;
        }
        if (n4 != (n3 = (int)(this.mNeedsPreDrawListener ? 1 : 0))) {
            if (n4 != 0) {
                this.addPreDrawListener();
            } else {
                this.removePreDrawListener();
            }
        }
    }

    public CoordinatorLayout$e generateDefaultLayoutParams() {
        CoordinatorLayout$e coordinatorLayout$e = new CoordinatorLayout$e();
        return coordinatorLayout$e;
    }

    public CoordinatorLayout$e generateLayoutParams(AttributeSet attributeSet) {
        Context context = this.getContext();
        CoordinatorLayout$e coordinatorLayout$e = new CoordinatorLayout$e(context, attributeSet);
        return coordinatorLayout$e;
    }

    public CoordinatorLayout$e generateLayoutParams(ViewGroup.LayoutParams object) {
        boolean bl2 = object instanceof CoordinatorLayout$e;
        if (bl2) {
            object = (CoordinatorLayout$e)((Object)object);
            CoordinatorLayout$e coordinatorLayout$e = new CoordinatorLayout$e((CoordinatorLayout$e)((Object)object));
            return coordinatorLayout$e;
        }
        bl2 = object instanceof ViewGroup.MarginLayoutParams;
        if (bl2) {
            object = (ViewGroup.MarginLayoutParams)object;
            CoordinatorLayout$e coordinatorLayout$e = new CoordinatorLayout$e((ViewGroup.MarginLayoutParams)object);
            return coordinatorLayout$e;
        }
        CoordinatorLayout$e coordinatorLayout$e = new CoordinatorLayout$e((ViewGroup.LayoutParams)object);
        return coordinatorLayout$e;
    }

    /*
     * WARNING - void declaration
     */
    public void getChildRect(View view, boolean bl2, Rect rect) {
        void var3_4;
        int n3;
        int n4 = view.isLayoutRequested();
        if (n4 == 0 && (n4 = view.getVisibility()) != (n3 = 8)) {
            if (bl2) {
                this.getDescendantRect(view, (Rect)var3_4);
            } else {
                int n7 = view.getLeft();
                n4 = view.getTop();
                n3 = view.getRight();
                int n8 = view.getBottom();
                var3_4.set(n7, n4, n3, n8);
            }
            return;
        }
        var3_4.setEmpty();
    }

    public List getDependencies(View view) {
        a53 a532 = this.mChildDag.b;
        int n3 = a532.c;
        ArrayList<Object> arrayList = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            Object object = (ArrayList)a532.l(i3);
            if (object == null || !(bl2 = ((ArrayList)object).contains(view))) continue;
            if (arrayList == null) {
                arrayList = new ArrayList<Object>();
            }
            object = a532.h(i3);
            arrayList.add(object);
        }
        if (arrayList == null) {
            arrayList = Collections.emptyList();
        }
        return arrayList;
    }

    public final List getDependencySortedChildren() {
        this.prepareChildren();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    public List getDependents(View object) {
        Object object2 = this.mChildDag.b;
        if ((object = (ArrayList)((a53)object2).get(object)) == null) {
            object = null;
        } else {
            object2 = new Object(object);
            object = object2;
        }
        if (object == null) {
            object = Collections.emptyList();
        }
        return object;
    }

    public void getDescendantRect(View object, Rect rect) {
        ThreadLocal threadLocal = WC3.a;
        int n3 = object.getWidth();
        int n4 = object.getHeight();
        int n7 = 0;
        rect.set(0, 0, n3, n4);
        threadLocal = WC3.a;
        Matrix matrix = (Matrix)threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        WC3.a((ViewParent)this, (View)object, matrix);
        object = WC3.b;
        threadLocal = (RectF)((ThreadLocal)object).get();
        if (threadLocal == null) {
            threadLocal = new RectF();
            ((ThreadLocal)object).set(threadLocal);
        }
        threadLocal.set(rect);
        matrix.mapRect((RectF)threadLocal);
        float f5 = ((RectF)threadLocal).left;
        float f6 = 0.5f;
        int n8 = (int)(f5 + f6);
        n7 = (int)(((RectF)threadLocal).top + f6);
        int n10 = (int)(((RectF)threadLocal).right + f6);
        n3 = (int)(((RectF)threadLocal).bottom + f6);
        rect.set(n8, n7, n10, n3);
    }

    public void getDesiredAnchoredChildRect(View view, int n3, Rect rect, Rect rect2) {
        CoordinatorLayout$e coordinatorLayout$e = (CoordinatorLayout$e)view.getLayoutParams();
        int n4 = view.getMeasuredWidth();
        int n7 = view.getMeasuredHeight();
        this.getDesiredAnchoredChildRectWithoutConstraints(n3, rect, rect2, coordinatorLayout$e, n4, n7);
        this.constrainChildRect(coordinatorLayout$e, rect2, n4, n7);
    }

    public void getLastChildRect(View view, Rect rect) {
        view = ((CoordinatorLayout$e)view.getLayoutParams()).q;
        rect.set((Rect)view);
    }

    public final f getLastWindowInsets() {
        return this.mLastInsets;
    }

    public int getNestedScrollAxes() {
        yu1_0 yu1_02 = this.mNestedScrollingParentHelper;
        int n3 = yu1_02.a;
        return yu1_02.b | n3;
    }

    public CoordinatorLayout$e getResolvedLayoutParams(View object) {
        CoordinatorLayout$e coordinatorLayout$e = (CoordinatorLayout$e)object.getLayoutParams();
        boolean bl2 = coordinatorLayout$e.b;
        if (!bl2) {
            bl2 = object instanceof CoordinatorLayout$b;
            boolean bl3 = true;
            if (bl2) {
                object = ((CoordinatorLayout$b)object).getBehavior();
                coordinatorLayout$e.b((CoordinatorLayout$Behavior)object);
                coordinatorLayout$e.b = bl3;
            } else {
                bl2 = false;
                CoordinatorLayout$c coordinatorLayout$c = null;
                for (object = object.getClass(); object != null && (coordinatorLayout$c = object.getAnnotation(CoordinatorLayout$c.class)) == null; object = object.getSuperclass()) {
                }
                if (coordinatorLayout$c != null) {
                    object = coordinatorLayout$c.value();
                    object = object.getDeclaredConstructor(null);
                    object = object.newInstance(null);
                    object = (CoordinatorLayout$Behavior)object;
                    try {
                        coordinatorLayout$e.b((CoordinatorLayout$Behavior)object);
                    }
                    catch (Exception exception) {
                        object = coordinatorLayout$c.value();
                        object.getName();
                    }
                }
                coordinatorLayout$e.b = bl3;
            }
        }
        return coordinatorLayout$e;
    }

    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    public int getSuggestedMinimumHeight() {
        int n3 = super.getSuggestedMinimumHeight();
        int n4 = this.getPaddingTop();
        int n7 = this.getPaddingBottom() + n4;
        return Math.max(n3, n7);
    }

    public int getSuggestedMinimumWidth() {
        int n3 = super.getSuggestedMinimumWidth();
        int n4 = this.getPaddingLeft();
        int n7 = this.getPaddingRight() + n4;
        return Math.max(n3, n7);
    }

    public boolean isPointInChildBounds(View view, int n3, int n4) {
        Rect rect = CoordinatorLayout.acquireTempRect();
        this.getDescendantRect(view, rect);
        try {
            boolean bl2 = rect.contains(n3, n4);
            return bl2;
        }
        finally {
            CoordinatorLayout.releaseTempRect(rect);
        }
    }

    public void offsetChildToAnchor(View view, int n3) {
        CoordinatorLayout coordinatorLayout = this;
        View view2 = view;
        Object object = view.getLayoutParams();
        Object object2 = object;
        object2 = (CoordinatorLayout$e)((Object)object);
        object = object2.k;
        if (object != null) {
            Rect rect = CoordinatorLayout.acquireTempRect();
            Rect rect2 = CoordinatorLayout.acquireTempRect();
            Rect rect3 = CoordinatorLayout.acquireTempRect();
            object = object2.k;
            this.getDescendantRect((View)object, rect);
            boolean bl2 = false;
            this.getChildRect(view, false, rect2);
            int n4 = view.getMeasuredWidth();
            int n7 = view.getMeasuredHeight();
            object = this;
            int n8 = n3;
            this.getDesiredAnchoredChildRectWithoutConstraints(n3, rect, rect3, (CoordinatorLayout$e)((Object)object2), n4, n7);
            int n10 = rect3.left;
            n8 = rect2.left;
            if (n10 != n8 || (n10 = rect3.top) != (n8 = rect2.top)) {
                bl2 = true;
            }
            coordinatorLayout.constrainChildRect((CoordinatorLayout$e)((Object)object2), rect3, n4, n7);
            n10 = rect3.left;
            n8 = rect2.left;
            n10 -= n8;
            n8 = rect3.top;
            int n14 = rect2.top;
            n8 -= n14;
            if (n10 != 0) {
                ViewCompat.l(n10, view2);
            }
            if (n8 != 0) {
                ViewCompat.m(n8, view2);
            }
            if (bl2 && (object = object2.a) != null) {
                View view3 = object2.k;
                ((CoordinatorLayout$Behavior)object).onDependentViewChanged(coordinatorLayout, view2, view3);
            }
            CoordinatorLayout.releaseTempRect(rect);
            CoordinatorLayout.releaseTempRect(rect2);
            CoordinatorLayout.releaseTempRect(rect3);
        }
    }

    public void onAttachedToWindow() {
        Object object;
        super.onAttachedToWindow();
        this.resetTouchBehaviors();
        boolean bl2 = this.mNeedsPreDrawListener;
        if (bl2) {
            object = this.mOnPreDrawListener;
            if (object == null) {
                this.mOnPreDrawListener = object = new CoordinatorLayout$f(this);
            }
            object = this.getViewTreeObserver();
            CoordinatorLayout$f coordinatorLayout$f = this.mOnPreDrawListener;
            object.addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)coordinatorLayout$f);
        }
        if ((object = this.mLastInsets) == null) {
            object = ViewCompat.a;
            bl2 = this.getFitsSystemWindows();
            if (bl2) {
                ViewCompat$b.c((View)this);
            }
        }
        this.mIsAttachedToWindow = true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onChildViewsChanged(int var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = 1;
        var5_5 = this.getLayoutDirection();
        var6_6 = this.mDependencySortedChildren;
        var7_7 = var6_6.size();
        var8_8 = CoordinatorLayout.acquireTempRect();
        var9_9 = CoordinatorLayout.acquireTempRect();
        var10_10 = CoordinatorLayout.acquireTempRect();
        for (var11_11 = 0; var11_11 < var7_7; var11_11 += var15_15) {
            block18: {
                var12_12 = (View)var2_2.mDependencySortedChildren.get(var11_11);
                var13_13 = (CoordinatorLayout$e)var12_12.getLayoutParams();
                if (var3_3 == 0 && (var14_14 = var12_12.getVisibility()) == (var15_15 = 8)) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        continue;
                        break;
                    }
                }
                for (var14_14 = 0; var14_14 < var11_11; var14_14 += var4_4) {
                    var17_17 /* !! */  = var13_13.l;
                    var16_16 = (View)var2_2.mDependencySortedChildren.get(var14_14);
                    if (var17_17 /* !! */  != var16_16) continue;
                    var2_2.offsetChildToAnchor(var12_12, var5_5);
                }
                var2_2.getChildRect(var12_12, (boolean)var4_4, var9_9);
                var14_14 = var13_13.g;
                if (var14_14 != 0 && (var14_14 = (int)var9_9.isEmpty()) == 0) {
                    var14_14 = Gravity.getAbsoluteGravity((int)var13_13.g, (int)var5_5);
                    var15_15 = var14_14 & 112;
                    if (var15_15 != (var18_18 = 48)) {
                        var18_18 = 80;
                        if (var15_15 == var18_18) {
                            var15_15 = var8_8.bottom;
                            var18_18 = this.getHeight();
                            var19_19 = var9_9.top;
                            var8_8.bottom = var15_15 = Math.max(var15_15, var18_18 -= var19_19);
                        }
                    } else {
                        var15_15 = var8_8.top;
                        var18_18 = var9_9.bottom;
                        var8_8.top = var15_15 = Math.max(var15_15, var18_18);
                    }
                    var15_15 = 3;
                    if ((var14_14 &= 7) != var15_15) {
                        var15_15 = 5;
                        if (var14_14 == var15_15) {
                            var14_14 = var8_8.right;
                            var15_15 = this.getWidth();
                            var18_18 = var9_9.left;
                            var8_8.right = var14_14 = Math.max(var14_14, var15_15 -= var18_18);
                        }
                    } else {
                        var14_14 = var8_8.left;
                        var15_15 = var9_9.right;
                        var8_8.left = var14_14 = Math.max(var14_14, var15_15);
                    }
                }
                if ((var20_20 = var13_13.h) != 0 && (var20_20 = var12_12.getVisibility()) == 0) {
                    var2_2.offsetChildByInset(var12_12, var8_8, var5_5);
                }
                if (var3_3 == (var20_20 = 2)) break block18;
                var2_2.getLastChildRect(var12_12, var10_10);
                var14_14 = (int)var10_10.equals((Object)var9_9);
                if (var14_14 != 0) ** GOTO lbl-1000
                var2_2.recordLastChildRect(var12_12, var9_9);
            }
            var14_14 = var11_11 + 1;
            while (true) {
                if (var14_14 < var7_7) ** break;
                ** continue;
                var16_16 = (View)var2_2.mDependencySortedChildren.get(var14_14);
                var17_17 /* !! */  = (CoordinatorLayout$e)var16_16.getLayoutParams();
                var21_21 = var17_17 /* !! */ .a;
                if (var21_21 == null || !(var22_22 = var21_21.layoutDependsOn(var2_2, var16_16, var12_12))) ** GOTO lbl69
                if (var3_3 == 0 && (var4_4 = (int)var17_17 /* !! */ .p) != 0) {
                    var17_17 /* !! */ .p = false;
lbl69:
                    // 2 sources

                    var15_15 = 1;
                } else {
                    if (var3_3 != var20_20) {
                        var4_4 = (int)var21_21.onDependentViewChanged(var2_2, var16_16, var12_12);
lbl73:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var21_21.onDependentViewRemoved(var2_2, var16_16, var12_12);
                    var4_4 = 1;
                    ** continue;
                    var15_15 = 1;
                    if (var3_3 == var15_15) {
                        var17_17 /* !! */ .p = var4_4;
                    }
                }
                var14_14 += var15_15;
                var4_4 = 1;
            }
            var15_15 = 1;
            var4_4 = 1;
        }
        CoordinatorLayout.releaseTempRect(var8_8);
        CoordinatorLayout.releaseTempRect(var9_9);
        CoordinatorLayout.releaseTempRect(var10_10);
    }

    public void onDetachedFromWindow() {
        CoordinatorLayout$f coordinatorLayout$f;
        super.onDetachedFromWindow();
        this.resetTouchBehaviors();
        boolean bl2 = this.mNeedsPreDrawListener;
        if (bl2 && (coordinatorLayout$f = this.mOnPreDrawListener) != null) {
            coordinatorLayout$f = this.getViewTreeObserver();
            CoordinatorLayout$f coordinatorLayout$f2 = this.mOnPreDrawListener;
            coordinatorLayout$f.removeOnPreDrawListener(coordinatorLayout$f2);
        }
        if ((coordinatorLayout$f = this.mNestedScrollingTarget) != null) {
            this.onStopNestedScroll((View)coordinatorLayout$f);
        }
        this.mIsAttachedToWindow = false;
    }

    public void onDraw(Canvas canvas) {
        Object object;
        super.onDraw(canvas);
        int n3 = this.mDrawStatusBarBackground;
        if (n3 != 0 && (object = this.mStatusBarBackground) != null) {
            object = this.mLastInsets;
            if (object != null) {
                n3 = ((f)object).d();
            } else {
                n3 = 0;
                object = null;
            }
            if (n3 > 0) {
                Drawable drawable2 = this.mStatusBarBackground;
                int n4 = this.getWidth();
                drawable2.setBounds(0, 0, n4, n3);
                object = this.mStatusBarBackground;
                object.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int n3 = motionEvent.getActionMasked();
        if (n3 == 0) {
            this.resetTouchBehaviors();
        }
        boolean bl2 = this.performIntercept(motionEvent, 0);
        int n4 = 1;
        if (n3 == n4 || n3 == (n4 = 3)) {
            n3 = 0;
            this.mBehaviorTouchView = null;
            this.resetTouchBehaviors();
        }
        return bl2;
    }

    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        int n10 = this.getLayoutDirection();
        List list = this.mDependencySortedChildren;
        int n14 = list.size();
        for (int i3 = 0; i3 < n14; ++i3) {
            CoordinatorLayout$Behavior coordinatorLayout$Behavior;
            int n15;
            View view = (View)this.mDependencySortedChildren.get(i3);
            int n16 = view.getVisibility();
            if (n16 == (n15 = 8) || (coordinatorLayout$Behavior = ((CoordinatorLayout$e)view.getLayoutParams()).a) != null && (n16 = (int)(coordinatorLayout$Behavior.onLayoutChild(this, view, n10) ? 1 : 0)) != 0) continue;
            this.onLayoutChild(view, n10);
        }
    }

    public void onLayoutChild(View object, int n3) {
        int n4;
        int n7;
        CoordinatorLayout$e coordinatorLayout$e = (CoordinatorLayout$e)object.getLayoutParams();
        View view = coordinatorLayout$e.k;
        if (view == null && (n7 = coordinatorLayout$e.f) != (n4 = -1)) {
            object = new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            throw object;
        }
        if (view != null) {
            this.layoutChildWithAnchor((View)object, view, n3);
        } else {
            int n8 = coordinatorLayout$e.e;
            if (n8 >= 0) {
                this.layoutChildWithKeyline((View)object, n8, n3);
            } else {
                this.layoutChild((View)object, n3);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onMeasure(int n3, int n4) {
        int n7;
        CoordinatorLayout coordinatorLayout = this;
        int n8 = 1;
        this.prepareChildren();
        this.ensurePreDrawListener();
        int n10 = this.getPaddingLeft();
        int n14 = this.getPaddingTop();
        int n15 = this.getPaddingRight();
        int n16 = this.getPaddingBottom();
        Object object = ViewCompat.a;
        int n17 = this.getLayoutDirection();
        boolean bl2 = n17 == n8;
        int n18 = View.MeasureSpec.getMode((int)n3);
        int n19 = View.MeasureSpec.getSize((int)n3);
        int n20 = View.MeasureSpec.getMode((int)n4);
        int n21 = View.MeasureSpec.getSize((int)n4);
        int n22 = n10 + n15;
        int n24 = n14 + n16;
        n14 = this.getSuggestedMinimumWidth();
        n16 = this.getSuggestedMinimumHeight();
        object = coordinatorLayout.mLastInsets;
        boolean bl3 = object != null && (n7 = this.getFitsSystemWindows()) != 0;
        int n25 = coordinatorLayout.mDependencySortedChildren.size();
        int n26 = n14;
        int n27 = n16;
        n16 = 0;
        Object object2 = null;
        n7 = 0;
        object = null;
        while (true) {
            int n28;
            int n29;
            int n30;
            block5: {
                int n32;
                int n34;
                int n35;
                CoordinatorLayout$e coordinatorLayout$e;
                View view;
                int n36;
                block11: {
                    int n37;
                    int n38;
                    Object object3;
                    block12: {
                        block10: {
                            f f5;
                            block8: {
                                block9: {
                                    block6: {
                                        block7: {
                                            block4: {
                                                if (n7 >= n25) {
                                                    n36 = n16;
                                                    n7 = n27;
                                                    n16 = n26;
                                                    n14 = 0xFF000000 & n36;
                                                    n27 = n3;
                                                    n14 = View.resolveSizeAndState((int)n26, (int)n3, (int)n14);
                                                    n16 = n36 << 16;
                                                    n27 = n4;
                                                    n16 = View.resolveSizeAndState((int)n7, (int)n4, (int)n16);
                                                    coordinatorLayout.setMeasuredDimension(n14, n16);
                                                    return;
                                                }
                                                object3 = coordinatorLayout.mDependencySortedChildren.get(n7);
                                                Object e2 = object3;
                                                view = (View)object3;
                                                n14 = view.getVisibility();
                                                if (n14 != (n8 = 8)) break block4;
                                                n30 = n7;
                                                n29 = n25;
                                                n28 = n20;
                                                break block5;
                                            }
                                            object3 = view.getLayoutParams();
                                            Object object4 = object3;
                                            coordinatorLayout$e = (CoordinatorLayout$e)((Object)object3);
                                            n14 = coordinatorLayout$e.e;
                                            if (n14 < 0 || n18 == 0) break block6;
                                            n14 = coordinatorLayout.getKeyline(n14);
                                            n36 = Gravity.getAbsoluteGravity((int)CoordinatorLayout.resolveKeylineGravity(coordinatorLayout$e.c), (int)n17) & 7;
                                            n30 = n16;
                                            n16 = 3;
                                            if ((n36 != n16 || bl2) && (n36 != (n16 = 5) || !bl2)) break block7;
                                            n16 = n19 - n15 - n14;
                                            n14 = 0;
                                            object3 = null;
                                            n38 = n16 = Math.max(0, n16);
                                            n36 = 0;
                                            f5 = null;
                                            break block8;
                                        }
                                        if ((n36 != n16 || bl2) && (n36 != (n16 = 3) || !bl2)) break block9;
                                        n14 -= n10;
                                        n36 = 0;
                                        f5 = null;
                                        n38 = n14 = Math.max(0, n14);
                                        break block8;
                                    }
                                    n30 = n16;
                                }
                                n36 = 0;
                                f5 = null;
                                n38 = 0;
                            }
                            if (bl3 && (n14 = (int)(view.getFitsSystemWindows() ? 1 : 0)) == 0) {
                                n14 = coordinatorLayout.mLastInsets.b();
                                object2 = coordinatorLayout.mLastInsets;
                                n16 = ((f)object2).c() + n14;
                                object3 = coordinatorLayout.mLastInsets;
                                n14 = ((f)object3).d();
                                f5 = coordinatorLayout.mLastInsets;
                                n36 = f5.a() + n14;
                                n14 = View.MeasureSpec.makeMeasureSpec((int)(n19 - n16), (int)n18);
                                n16 = View.MeasureSpec.makeMeasureSpec((int)(n21 - n36), (int)n20);
                                n36 = n14;
                                n37 = n16;
                            } else {
                                n36 = n3;
                                n37 = n4;
                            }
                            object3 = coordinatorLayout$e.a;
                            if (object3 == null) break block10;
                            n35 = n30;
                            object2 = this;
                            n30 = n7;
                            object = view;
                            n34 = n27;
                            n27 = n36;
                            n32 = n26;
                            n26 = n38;
                            n29 = n25;
                            n25 = n37;
                            n28 = n20;
                            n20 = 0;
                            n14 = (int)(((CoordinatorLayout$Behavior)object3).onMeasureChild(this, view, n36, n38, n37, 0) ? 1 : 0);
                            if (n14 != 0) break block11;
                            break block12;
                        }
                        n34 = n27;
                        n32 = n26;
                        n29 = n25;
                        n28 = n20;
                        n35 = n30;
                        n30 = n7;
                    }
                    n25 = 0;
                    object3 = this;
                    object2 = view;
                    n7 = n36;
                    n27 = n38;
                    n26 = n37;
                    this.onMeasureChild(view, n36, n38, n37, 0);
                }
                n14 = view.getMeasuredWidth() + n22;
                n16 = coordinatorLayout$e.leftMargin;
                n14 += n16;
                n16 = coordinatorLayout$e.rightMargin;
                n14 += n16;
                n16 = n32;
                n14 = Math.max(n32, n14);
                n16 = view.getMeasuredHeight() + n24;
                n7 = coordinatorLayout$e.topMargin;
                n16 += n7;
                n7 = coordinatorLayout$e.bottomMargin;
                n16 += n7;
                n7 = n34;
                n16 = Math.max(n34, n16);
                n7 = view.getMeasuredState();
                n36 = n35;
                n7 = View.combineMeasuredStates((int)n35, (int)n7);
                n26 = n14;
                n27 = n16;
                n16 = n7;
            }
            n14 = 1;
            n7 = n30 + 1;
            n25 = n29;
            n20 = n28;
            n8 = 1;
        }
    }

    public void onMeasureChild(View view, int n3, int n4, int n7, int n8) {
        this.measureChildWithMargins(view, n3, n4, n7, n8);
    }

    public boolean onNestedFling(View view, float f5, float f6, boolean bl2) {
        int n3 = this.getChildCount();
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object;
            int n7;
            View view2 = this.getChildAt(i3);
            int n8 = view2.getVisibility();
            if (n8 == (n7 = 8) || (n7 = (int)(((CoordinatorLayout$e)((Object)(object = (CoordinatorLayout$e)view2.getLayoutParams()))).a(0) ? 1 : 0)) == 0 || (object = ((CoordinatorLayout$e)((Object)object)).a) == null) continue;
            n8 = (int)(((CoordinatorLayout$Behavior)object).onNestedFling(this, view2, view, f5, f6, bl2) ? 1 : 0);
            n4 |= n8;
        }
        if (n4 != 0) {
            int n10 = 1;
            this.onChildViewsChanged(n10);
        }
        return n4 != 0;
    }

    public boolean onNestedPreFling(View view, float f5, float f6) {
        int n3 = this.getChildCount();
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object;
            int n7;
            View view2 = this.getChildAt(i3);
            int n8 = view2.getVisibility();
            if (n8 == (n7 = 8) || (n7 = (int)(((CoordinatorLayout$e)((Object)(object = (CoordinatorLayout$e)view2.getLayoutParams()))).a(0) ? 1 : 0)) == 0 || (object = ((CoordinatorLayout$e)((Object)object)).a) == null) continue;
            n8 = (int)(((CoordinatorLayout$Behavior)object).onNestedPreFling(this, view2, view, f5, f6) ? 1 : 0);
            n4 |= n8;
        }
        return n4 != 0;
    }

    public void onNestedPreScroll(View view, int n3, int n4, int[] nArray) {
        this.onNestedPreScroll(view, n3, n4, nArray, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onNestedPreScroll(View view, int n3, int n4, int[] nArray, int n7) {
        int n8;
        int n10;
        CoordinatorLayout coordinatorLayout = this;
        int n14 = this.getChildCount();
        boolean bl2 = false;
        Object var9_10 = null;
        int n15 = 0;
        int n16 = 0;
        int n17 = 0;
        while (true) {
            CoordinatorLayout$Behavior coordinatorLayout$Behavior;
            CoordinatorLayout$e coordinatorLayout$e;
            int n18;
            n10 = 1;
            if (n15 >= n14) break;
            View view2 = coordinatorLayout.getChildAt(n15);
            int n19 = view2.getVisibility();
            if (n19 != (n18 = 8) && (n18 = (int)((coordinatorLayout$e = (CoordinatorLayout$e)view2.getLayoutParams()).a(n7) ? 1 : 0)) != 0 && (coordinatorLayout$Behavior = coordinatorLayout$e.a) != null) {
                int[] nArray2 = coordinatorLayout.mBehaviorConsumed;
                nArray2[0] = 0;
                nArray2[n10] = 0;
                CoordinatorLayout$Behavior coordinatorLayout$Behavior2 = coordinatorLayout$Behavior;
                CoordinatorLayout coordinatorLayout2 = this;
                coordinatorLayout$Behavior2.onNestedPreScroll(this, view2, view, n3, n4, nArray2, n7);
                if (n3 > 0) {
                    int[] nArray3 = coordinatorLayout.mBehaviorConsumed;
                    int n8 = nArray3[0];
                    n8 = Math.max(n16, n8);
                } else {
                    int[] nArray4 = coordinatorLayout.mBehaviorConsumed;
                    int n8 = nArray4[0];
                    n8 = Math.min(n16, n8);
                }
                n16 = n8;
                if (n4 > 0) {
                    int[] nArray5 = coordinatorLayout.mBehaviorConsumed;
                    int n8 = nArray5[n10];
                    n8 = Math.max(n17, n8);
                } else {
                    int[] nArray6 = coordinatorLayout.mBehaviorConsumed;
                    int n8 = nArray6[n10];
                    n8 = Math.min(n17, n8);
                }
                n17 = n8;
                n8 = 1;
            }
            ++n15;
        }
        nArray[0] = n16;
        nArray[n10] = n17;
        if (n8 != 0) {
            coordinatorLayout.onChildViewsChanged(n10);
        }
    }

    public void onNestedScroll(View view, int n3, int n4, int n7, int n8) {
        this.onNestedScroll(view, n3, n4, n7, n8, 0);
    }

    public void onNestedScroll(View view, int n3, int n4, int n7, int n8, int n10) {
        int[] nArray = this.mNestedScrollingV2ConsumedCompat;
        this.onNestedScroll(view, n3, n4, n7, n8, 0, nArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onNestedScroll(View view, int n3, int n4, int n7, int n8, int n10, int[] nArray) {
        int n14;
        int n15;
        int n16;
        CoordinatorLayout coordinatorLayout = this;
        int n17 = this.getChildCount();
        boolean bl2 = false;
        Object var11_12 = null;
        int n18 = 0;
        int n19 = 0;
        int n20 = 0;
        while (true) {
            CoordinatorLayout$Behavior coordinatorLayout$Behavior;
            CoordinatorLayout$e coordinatorLayout$e;
            int n21;
            int n22 = 1;
            if (n18 >= n17) break;
            View view2 = coordinatorLayout.getChildAt(n18);
            n16 = view2.getVisibility();
            if (n16 != (n21 = 8) && (n21 = (int)((coordinatorLayout$e = (CoordinatorLayout$e)view2.getLayoutParams()).a(n10) ? 1 : 0)) != 0 && (coordinatorLayout$Behavior = coordinatorLayout$e.a) != null) {
                int[] nArray2 = coordinatorLayout.mBehaviorConsumed;
                nArray2[0] = 0;
                nArray2[n22] = 0;
                CoordinatorLayout$Behavior coordinatorLayout$Behavior2 = coordinatorLayout$Behavior;
                CoordinatorLayout coordinatorLayout2 = this;
                coordinatorLayout$Behavior2.onNestedScroll(this, view2, view, n3, n4, n7, n8, n10, nArray2);
                if (n7 > 0) {
                    int[] nArray3 = coordinatorLayout.mBehaviorConsumed;
                    int n15 = nArray3[0];
                    n15 = Math.max(n19, n15);
                } else {
                    int[] nArray4 = coordinatorLayout.mBehaviorConsumed;
                    int n15 = nArray4[0];
                    n15 = Math.min(n19, n15);
                }
                n19 = n15;
                if (n8 > 0) {
                    int[] nArray5 = coordinatorLayout.mBehaviorConsumed;
                    n16 = 1;
                    int n15 = nArray5[n16];
                    n15 = Math.max(n20, n15);
                } else {
                    n16 = 1;
                    int[] nArray6 = coordinatorLayout.mBehaviorConsumed;
                    int n15 = nArray6[n16];
                    n15 = Math.min(n20, n15);
                }
                n20 = n15;
                n15 = 1;
            }
            ++n18;
        }
        n16 = 1;
        nArray[0] = n14 = nArray[0] + n19;
        nArray[n16] = n14 = nArray[n16] + n20;
        if (n15 != 0) {
            coordinatorLayout.onChildViewsChanged(n16);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int n3) {
        this.onNestedScrollAccepted(view, view2, n3, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int n3, int n4) {
        yu1_0 yu1_02 = this.mNestedScrollingParentHelper;
        int n7 = 1;
        if (n4 == n7) {
            yu1_02.b = n3;
        } else {
            yu1_02.a = n3;
        }
        this.mNestedScrollingTarget = view2;
        int n8 = this.getChildCount();
        for (n7 = 0; n7 < n8; ++n7) {
            View view3 = this.getChildAt(n7);
            Object object = (CoordinatorLayout$e)view3.getLayoutParams();
            boolean bl2 = object.a(n4);
            if (!bl2 || (object = object.a) == null) continue;
            ((CoordinatorLayout$Behavior)object).onNestedScrollAccepted(this, view3, view, view2, n3, n4);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        int n3 = parcelable instanceof CoordinatorLayout$SavedState;
        if (n3 == 0) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (CoordinatorLayout$SavedState)parcelable;
        Parcelable parcelable2 = parcelable.getSuperState();
        super.onRestoreInstanceState(parcelable2);
        parcelable = parcelable.a;
        n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            Parcelable parcelable3;
            View view = this.getChildAt(i3);
            int n4 = view.getId();
            CoordinatorLayout$Behavior coordinatorLayout$Behavior = this.getResolvedLayoutParams((View)view).a;
            int n7 = -1;
            if (n4 == n7 || coordinatorLayout$Behavior == null || (parcelable3 = (Parcelable)parcelable.get(n4)) == null) continue;
            coordinatorLayout$Behavior.onRestoreInstanceState(this, view, parcelable3);
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable parcelable = super.onSaveInstanceState();
        CoordinatorLayout$SavedState coordinatorLayout$SavedState = new AbsSavedState(parcelable);
        parcelable = new SparseArray();
        int n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = this.getChildAt(i3);
            int n4 = view.getId();
            CoordinatorLayout$Behavior coordinatorLayout$Behavior = ((CoordinatorLayout$e)view.getLayoutParams()).a;
            int n7 = -1;
            if (n4 == n7 || coordinatorLayout$Behavior == null || (view = coordinatorLayout$Behavior.onSaveInstanceState(this, view)) == null) continue;
            parcelable.append(n4, (Object)view);
        }
        coordinatorLayout$SavedState.a = parcelable;
        return coordinatorLayout$SavedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int n3) {
        return this.onStartNestedScroll(view, view2, n3, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int n3, int n4) {
        int n7 = n4;
        int n8 = this.getChildCount();
        int n10 = 0;
        for (int i3 = 0; i3 < n8; ++i3) {
            int n14;
            View view3 = this.getChildAt(i3);
            int n15 = view3.getVisibility();
            if (n15 == (n14 = 8)) continue;
            Object object = view3.getLayoutParams();
            Object object2 = object;
            object2 = (CoordinatorLayout$e)((Object)object);
            object = object2.a;
            int n16 = 1;
            if (object != null) {
                n15 = (int)(((CoordinatorLayout$Behavior)object).onStartNestedScroll(this, view3, view, view2, n3, n4) ? 1 : 0);
                n10 |= n15;
                if (n7 != 0) {
                    if (n7 != n16) continue;
                    object2.o = n15;
                    continue;
                }
                object2.n = n15;
                continue;
            }
            if (n7 != 0) {
                if (n7 != n16) continue;
                object2.o = false;
                continue;
            }
            object2.n = false;
        }
        return n10 != 0;
    }

    public void onStopNestedScroll(View view) {
        this.onStopNestedScroll(view, 0);
    }

    public void onStopNestedScroll(View view, int n3) {
        yu1_0 yu1_02 = this.mNestedScrollingParentHelper;
        int n4 = 1;
        if (n3 == n4) {
            yu1_02.b = 0;
        } else {
            yu1_02.a = 0;
        }
        int n7 = this.getChildCount();
        for (int i3 = 0; i3 < n7; ++i3) {
            View view2 = this.getChildAt(i3);
            CoordinatorLayout$e coordinatorLayout$e = (CoordinatorLayout$e)view2.getLayoutParams();
            boolean bl2 = coordinatorLayout$e.a(n3);
            if (!bl2) continue;
            CoordinatorLayout$Behavior coordinatorLayout$Behavior = coordinatorLayout$e.a;
            if (coordinatorLayout$Behavior != null) {
                coordinatorLayout$Behavior.onStopNestedScroll(this, view2, view, n3);
            }
            if (n3 != 0) {
                if (n3 == n4) {
                    coordinatorLayout$e.o = false;
                }
            } else {
                coordinatorLayout$e.n = false;
            }
            coordinatorLayout$e.p = false;
        }
        this.mNestedScrollingTarget = null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean bl2;
        boolean bl3;
        View view;
        int n3 = motionEvent.getActionMasked();
        Object object = this.mBehaviorTouchView;
        int n4 = 1;
        boolean bl4 = false;
        if (object != null) {
            object = ((CoordinatorLayout$e)object.getLayoutParams()).a;
            if (object != null) {
                view = this.mBehaviorTouchView;
                bl3 = ((CoordinatorLayout$Behavior)object).onTouchEvent(this, view, motionEvent);
            } else {
                bl3 = false;
                object = null;
            }
        } else {
            bl3 = this.performIntercept(motionEvent, n4);
            if (n3 != 0 && bl3) {
                bl4 = true;
            }
        }
        view = this.mBehaviorTouchView;
        int n7 = 3;
        if (view != null && n3 != n7) {
            if (bl4) {
                motionEvent = this.obtainCancelEvent(motionEvent);
                super.onTouchEvent(motionEvent);
                motionEvent.recycle();
            }
        } else {
            bl2 = super.onTouchEvent(motionEvent);
            bl3 |= bl2;
        }
        if (n3 == n4 || n3 == n7) {
            bl2 = false;
            motionEvent = null;
            this.mBehaviorTouchView = null;
            this.resetTouchBehaviors();
        }
        return bl3;
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((CoordinatorLayout$e)view.getLayoutParams()).q.set(rect);
    }

    public void removePreDrawListener() {
        CoordinatorLayout$f coordinatorLayout$f;
        boolean bl2 = this.mIsAttachedToWindow;
        if (bl2 && (coordinatorLayout$f = this.mOnPreDrawListener) != null) {
            coordinatorLayout$f = this.getViewTreeObserver();
            CoordinatorLayout$f coordinatorLayout$f2 = this.mOnPreDrawListener;
            coordinatorLayout$f.removeOnPreDrawListener(coordinatorLayout$f2);
        }
        this.mNeedsPreDrawListener = false;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean bl2) {
        boolean bl3;
        CoordinatorLayout$Behavior coordinatorLayout$Behavior = ((CoordinatorLayout$e)view.getLayoutParams()).a;
        if (coordinatorLayout$Behavior != null && (bl3 = coordinatorLayout$Behavior.onRequestChildRectangleOnScreen(this, view, rect, bl2))) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, bl2);
    }

    public void requestDisallowInterceptTouchEvent(boolean bl2) {
        super.requestDisallowInterceptTouchEvent(bl2);
        if (bl2 && !(bl2 = this.mDisallowInterceptReset)) {
            View view = this.mBehaviorTouchView;
            if (view == null) {
                this.cancelInterceptBehaviors();
            }
            this.resetTouchBehaviors();
            this.mDisallowInterceptReset = bl2 = true;
        }
    }

    public void setFitsSystemWindows(boolean bl2) {
        super.setFitsSystemWindows(bl2);
        this.setupForInsets();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    /*
     * WARNING - void declaration
     */
    public void setStatusBarBackground(Drawable object) {
        Object object2 = this.mStatusBarBackground;
        if (object2 != object) {
            Drawable drawable2 = null;
            if (object2 != null) {
                object2.setCallback(null);
            }
            if (object != null) {
                drawable2 = object.mutate();
            }
            this.mStatusBarBackground = drawable2;
            if (drawable2 != null) {
                void var5_9;
                boolean bl2 = drawable2.isStateful();
                if (bl2) {
                    object = this.mStatusBarBackground;
                    object2 = this.getDrawableState();
                    object.setState((int[])object2);
                }
                object = this.mStatusBarBackground;
                object2 = ViewCompat.a;
                int bl3 = this.getLayoutDirection();
                ut0_0.c((Drawable)object, bl3);
                object = this.mStatusBarBackground;
                int n3 = this.getVisibility();
                drawable2 = null;
                if (n3 == 0) {
                    boolean bl4 = true;
                } else {
                    boolean bl5 = false;
                    object2 = null;
                }
                object.setVisible((boolean)var5_9, false);
                object = this.mStatusBarBackground;
                object.setCallback((Drawable.Callback)this);
            }
            object = ViewCompat.a;
            this.postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int n3) {
        ColorDrawable colorDrawable = new ColorDrawable(n3);
        this.setStatusBarBackground((Drawable)colorDrawable);
    }

    public void setStatusBarBackgroundResource(int n3) {
        Drawable drawable2;
        if (n3 != 0) {
            Context context = this.getContext();
            drawable2 = t70.getDrawable(context, n3);
        } else {
            n3 = 0;
            drawable2 = null;
        }
        this.setStatusBarBackground(drawable2);
    }

    public void setVisibility(int n3) {
        int n4;
        super.setVisibility(n3);
        n3 = n3 == 0 ? 1 : 0;
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != null && (n4 = drawable2.isVisible()) != n3) {
            drawable2 = this.mStatusBarBackground;
            drawable2.setVisible(n3 != 0, false);
        }
    }

    public final f setWindowInsets(f f5) {
        f f6 = this.mLastInsets;
        boolean bl2 = Objects.equals(f6, f5);
        if (!bl2) {
            Drawable drawable2;
            int n3;
            this.mLastInsets = f5;
            bl2 = false;
            f6 = null;
            if (f5 != null && (n3 = f5.d()) > 0) {
                n3 = 1;
            } else {
                n3 = 0;
                drawable2 = null;
            }
            this.mDrawStatusBarBackground = n3;
            if (n3 == 0 && (drawable2 = this.getBackground()) == null) {
                bl2 = true;
            }
            this.setWillNotDraw(bl2);
            f5 = this.dispatchApplyWindowInsetsToBehaviors(f5);
            this.requestLayout();
        }
        return f5;
    }

    public boolean verifyDrawable(Drawable drawable2) {
        boolean bl2;
        Drawable drawable3;
        boolean bl3 = super.verifyDrawable(drawable2);
        if (!bl3 && drawable2 != (drawable3 = this.mStatusBarBackground)) {
            bl2 = false;
            drawable2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

