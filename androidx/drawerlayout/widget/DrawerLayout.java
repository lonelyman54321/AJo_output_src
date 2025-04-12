/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.Gravity
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.WindowInsets
 */
package androidx.drawerlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.core.view.a;
import androidx.core.view.f;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper$b;
import androidx.drawerlayout.R$attr;
import androidx.drawerlayout.R$dimen;
import androidx.drawerlayout.R$styleable;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import androidx.drawerlayout.widget.DrawerLayout$SavedState;
import androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback;
import androidx.drawerlayout.widget.DrawerLayout$a;
import androidx.drawerlayout.widget.DrawerLayout$d;
import androidx.drawerlayout.widget.DrawerLayout$e;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout
extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.drawerlayout.widget.DrawerLayout";
    private static final boolean ALLOW_EDGE_LOCK = false;
    static final boolean CAN_HIDE_DESCENDANTS = false;
    private static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;
    static final int[] LAYOUT_ATTRS;
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_DRAWER_MARGIN = 64;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final int PEEK_DELAY = 160;
    private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION = false;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "DrawerLayout";
    private static final int[] THEME_ATTRS;
    private static final float TOUCH_SLOP_SENSITIVITY = 1.0f;
    private static boolean sEdgeSizeUsingSystemGestureInsets;
    private final E2 mActionDismiss;
    private final DrawerLayout$d mChildAccessibilityDelegate;
    private Rect mChildHitRect;
    private Matrix mChildInvertedMatrix;
    private boolean mChildrenCanceledTouch;
    private boolean mDrawStatusBarBackground;
    private float mDrawerElevation;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private Object mLastInsets;
    private final DrawerLayout$ViewDragCallback mLeftCallback;
    private final ViewDragHelper mLeftDragger;
    private DrawerLayout$e mListener;
    private List mListeners;
    private int mLockModeEnd;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mLockModeStart;
    private int mMinDrawerMargin;
    private final ArrayList mNonDrawerViews;
    private final DrawerLayout$ViewDragCallback mRightCallback;
    private final ViewDragHelper mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private Paint mScrimPaint;
    private Drawable mShadowEnd;
    private Drawable mShadowLeft;
    private Drawable mShadowLeftResolved;
    private Drawable mShadowRight;
    private Drawable mShadowRightResolved;
    private Drawable mShadowStart;
    private Drawable mStatusBarBackground;
    private CharSequence mTitleLeft;
    private CharSequence mTitleRight;

    static {
        boolean bl2;
        THEME_ATTRS = new int[]{16843828};
        int[] nArray = new int[]{16842931};
        LAYOUT_ATTRS = nArray;
        int n3 = Build.VERSION.SDK_INT;
        CAN_HIDE_DESCENDANTS = bl2 = true;
        SET_DRAWER_SHADOW_FROM_ELEVATION = bl2;
        int n4 = 29;
        if (n3 < n4) {
            bl2 = false;
        }
        sEdgeSizeUsingSystemGestureInsets = bl2;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.drawerLayoutStyle;
        this(context, attributeSet, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public DrawerLayout(Context object, AttributeSet attributeSet, int n3) {
        Throwable throwable2;
        block9: {
            block8: {
                float f5;
                block7: {
                    ViewDragHelper viewDragHelper;
                    int n4;
                    int n7;
                    a a2;
                    super(object, attributeSet, n3);
                    super();
                    this.mChildAccessibilityDelegate = a2;
                    this.mScrimColor = -1728053248;
                    super();
                    this.mScrimPaint = a2;
                    int n8 = 1;
                    this.mFirstLayout = n8;
                    this.mLockModeLeft = n7 = 3;
                    this.mLockModeRight = n7;
                    this.mLockModeStart = n7;
                    this.mLockModeEnd = n7;
                    this.mShadowStart = null;
                    this.mShadowEnd = null;
                    this.mShadowLeft = null;
                    this.mShadowRight = null;
                    DrawerLayout$a drawerLayout$a = new DrawerLayout$a(this);
                    this.mActionDismiss = drawerLayout$a;
                    int n10 = 262144;
                    this.setDescendantFocusability(n10);
                    drawerLayout$a = this.getResources().getDisplayMetrics();
                    float f6 = ((DisplayMetrics)drawerLayout$a).density;
                    this.mMinDrawerMargin = n4 = (int)(64.0f * f6 + 0.5f);
                    n4 = 1137180672;
                    float f7 = 400.0f;
                    f6 *= f7;
                    Object object2 = new DrawerLayout$ViewDragCallback(this, n7);
                    this.mLeftCallback = object2;
                    Object object3 = new DrawerLayout$ViewDragCallback(this, 5);
                    this.mRightCallback = object3;
                    float f8 = 1.0f;
                    this.mLeftDragger = viewDragHelper = ViewDragHelper.i(this, f8, (ViewDragHelper$b)object2);
                    viewDragHelper.q = n8;
                    viewDragHelper.n = f6;
                    ((DrawerLayout$ViewDragCallback)object2).b = viewDragHelper;
                    this.mRightDragger = object2 = ViewDragHelper.i(this, f8, (ViewDragHelper$b)object3);
                    int n14 = 2;
                    f8 = 2.8E-45f;
                    ((ViewDragHelper)object2).q = n14;
                    ((ViewDragHelper)object2).n = f6;
                    ((DrawerLayout$ViewDragCallback)object3).b = object2;
                    this.setFocusableInTouchMode(n8 != 0);
                    object3 = ViewCompat.a;
                    this.setImportantForAccessibility(n8);
                    super(this);
                    ViewCompat.s((View)this, a2);
                    n8 = 0;
                    a2 = null;
                    this.setMotionEventSplittingEnabled(false);
                    n7 = (int)(this.getFitsSystemWindows() ? 1 : 0);
                    if (n7 != 0) {
                        object3 = new Object();
                        this.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)object3);
                        n7 = 1280;
                        this.setSystemUiVisibility(n7);
                        object3 = THEME_ATTRS;
                        object3 = object.obtainStyledAttributes((int[])object3);
                        try {
                            drawerLayout$a = object3.getDrawable(0);
                            this.mStatusBarBackground = drawerLayout$a;
                        }
                        finally {
                            object3.recycle();
                        }
                    }
                    object3 = R$styleable.DrawerLayout;
                    object = object.obtainStyledAttributes(attributeSet, (int[])object3, n3, 0);
                    try {
                        float f11;
                        int n15 = R$styleable.DrawerLayout_elevation;
                        n15 = (int)(object.hasValue(n15) ? 1 : 0);
                        if (n15 == 0) break block7;
                        n15 = R$styleable.DrawerLayout_elevation;
                        n3 = 0;
                        this.mDrawerElevation = f11 = object.getDimension(n15, 0.0f);
                        break block8;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                }
                attributeSet = this.getResources();
                n3 = R$dimen.def_drawer_elevation;
                this.mDrawerElevation = f5 = attributeSet.getDimension(n3);
            }
            object.recycle();
            super();
            this.mNonDrawerViews = object;
            return;
        }
        object.recycle();
        throw throwable2;
    }

    private boolean dispatchTransformedGenericPointerEvent(MotionEvent motionEvent, View view) {
        boolean bl2;
        Matrix matrix = view.getMatrix();
        int n3 = matrix.isIdentity();
        if (n3 == 0) {
            motionEvent = this.getTransformedMotionEvent(motionEvent, view);
            bl2 = view.dispatchGenericMotionEvent(motionEvent);
            motionEvent.recycle();
        } else {
            n3 = this.getScrollX();
            int n4 = view.getLeft();
            float f5 = n3 -= n4;
            n4 = this.getScrollY();
            int n7 = view.getTop();
            float f6 = n4 -= n7;
            motionEvent.offsetLocation(f5, f6);
            bl2 = view.dispatchGenericMotionEvent(motionEvent);
            f5 = -f5;
            f6 = -f6;
            motionEvent.offsetLocation(f5, f6);
        }
        return bl2;
    }

    private MotionEvent getTransformedMotionEvent(MotionEvent motionEvent, View view) {
        int n3 = this.getScrollX();
        int n4 = view.getLeft();
        float f5 = n3 - n4;
        n4 = this.getScrollY();
        int n7 = view.getTop();
        float f6 = n4 -= n7;
        motionEvent = MotionEvent.obtain((MotionEvent)motionEvent);
        motionEvent.offsetLocation(f5, f6);
        view = view.getMatrix();
        n3 = (int)(view.isIdentity() ? 1 : 0);
        if (n3 == 0) {
            Matrix matrix = this.mChildInvertedMatrix;
            if (matrix == null) {
                this.mChildInvertedMatrix = matrix = new Matrix();
            }
            matrix = this.mChildInvertedMatrix;
            view.invert(matrix);
            view = this.mChildInvertedMatrix;
            motionEvent.transform((Matrix)view);
        }
        return motionEvent;
    }

    public static String gravityToString(int n3) {
        int n4 = n3 & 3;
        int n7 = 3;
        if (n4 == n7) {
            return "LEFT";
        }
        n4 = n3 & 5;
        n7 = 5;
        if (n4 == n7) {
            return "RIGHT";
        }
        return Integer.toHexString(n3);
    }

    private static boolean hasOpaqueBackground(View view) {
        int n3;
        int n4;
        view = view.getBackground();
        boolean bl2 = false;
        if (view != null && (n4 = view.getOpacity()) == (n3 = -1)) {
            bl2 = true;
        }
        return bl2;
    }

    private boolean hasPeekingDrawer() {
        int n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams)this.getChildAt(i3).getLayoutParams();
            boolean bl2 = drawerLayout$LayoutParams.c;
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    private boolean hasVisibleDrawer() {
        boolean bl2;
        View view = this.findVisibleDrawer();
        if (view != null) {
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        return bl2;
    }

    public static boolean includeChildForAccessibility(View view) {
        int n3;
        int n4;
        int n7 = view.getImportantForAccessibility();
        if (n7 != (n4 = 4) && (n3 = view.getImportantForAccessibility()) != (n7 = 2)) {
            n3 = 1;
        } else {
            n3 = 0;
            view = null;
        }
        return n3 != 0;
    }

    private boolean isInBoundsOfChild(float f5, float f6, View view) {
        Rect rect = this.mChildHitRect;
        if (rect == null) {
            this.mChildHitRect = rect = new Rect();
        }
        rect = this.mChildHitRect;
        view.getHitRect(rect);
        view = this.mChildHitRect;
        int n3 = (int)f5;
        int n4 = (int)f6;
        return view.contains(n3, n4);
    }

    private void mirror(Drawable drawable2, int n3) {
        boolean bl2;
        if (drawable2 != null && (bl2 = drawable2.isAutoMirrored())) {
            ut0_0.c(drawable2, n3);
        }
    }

    private Drawable resolveLeftShadow() {
        int n3 = this.getLayoutDirection();
        if (n3 == 0) {
            Drawable drawable2 = this.mShadowStart;
            if (drawable2 != null) {
                this.mirror(drawable2, n3);
                return this.mShadowStart;
            }
        } else {
            Drawable drawable3 = this.mShadowEnd;
            if (drawable3 != null) {
                this.mirror(drawable3, n3);
                return this.mShadowEnd;
            }
        }
        return this.mShadowLeft;
    }

    private Drawable resolveRightShadow() {
        int n3 = this.getLayoutDirection();
        if (n3 == 0) {
            Drawable drawable2 = this.mShadowEnd;
            if (drawable2 != null) {
                this.mirror(drawable2, n3);
                return this.mShadowEnd;
            }
        } else {
            Drawable drawable3 = this.mShadowStart;
            if (drawable3 != null) {
                this.mirror(drawable3, n3);
                return this.mShadowStart;
            }
        }
        return this.mShadowRight;
    }

    private void resolveShadowDrawables() {
        Drawable drawable2;
        boolean bl2 = SET_DRAWER_SHADOW_FROM_ELEVATION;
        if (bl2) {
            return;
        }
        this.mShadowLeftResolved = drawable2 = this.resolveLeftShadow();
        this.mShadowRightResolved = drawable2 = this.resolveRightShadow();
    }

    private void updateChildAccessibilityAction(View view) {
        int n3;
        C2$a c2$a = C2$a.n;
        ViewCompat.p(c2$a.a(), view);
        ViewCompat.k(0, view);
        int n4 = this.isDrawerOpen(view);
        if (n4 != 0 && (n4 = this.getDrawerLockMode(view)) != (n3 = 2)) {
            n4 = 0;
            E2 e2 = this.mActionDismiss;
            ViewCompat.q(view, c2$a, null, e2);
        }
    }

    private void updateChildrenImportantForAccessibility(View view, boolean bl2) {
        int n3 = 1;
        int n4 = this.getChildCount();
        for (int i3 = 0; i3 < n4; i3 += n3) {
            int n7;
            View view2 = this.getChildAt(i3);
            if (!bl2 && (n7 = this.isDrawerView(view2)) == 0 || bl2 && view2 == view) {
                view2.setImportantForAccessibility(n3);
                continue;
            }
            n7 = 4;
            view2.setImportantForAccessibility(n7);
        }
    }

    public void addDrawerListener(DrawerLayout$e drawerLayout$e) {
        if (drawerLayout$e == null) {
            return;
        }
        ArrayList arrayList = this.mListeners;
        if (arrayList == null) {
            this.mListeners = arrayList = new ArrayList();
        }
        this.mListeners.add(drawerLayout$e);
    }

    public void addFocusables(ArrayList arrayList, int n3, int n4) {
        int n7;
        int n8 = this.getDescendantFocusability();
        if (n8 == (n7 = 393216)) {
            return;
        }
        n8 = this.getChildCount();
        n7 = 0;
        View view = null;
        int n10 = 0;
        for (int i3 = 0; i3 < n8; ++i3) {
            View view2 = this.getChildAt(i3);
            boolean bl2 = this.isDrawerView(view2);
            if (bl2) {
                bl2 = this.isDrawerOpen(view2);
                if (!bl2) continue;
                view2.addFocusables(arrayList, n3, n4);
                n10 = 1;
                continue;
            }
            ArrayList arrayList2 = this.mNonDrawerViews;
            arrayList2.add(view2);
        }
        if (n10 == 0) {
            ArrayList arrayList3 = this.mNonDrawerViews;
            n8 = arrayList3.size();
            while (n7 < n8) {
                view = (View)this.mNonDrawerViews.get(n7);
                n10 = view.getVisibility();
                if (n10 == 0) {
                    view.addFocusables(arrayList, n3, n4);
                }
                ++n7;
            }
        }
        this.mNonDrawerViews.clear();
    }

    public void addView(View view, int n3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, n3, layoutParams);
        Object object = this.findOpenDrawer();
        if (object == null && (n3 = (int)(this.isDrawerView(view) ? 1 : 0)) == 0) {
            object = ViewCompat.a;
            n3 = 1;
            view.setImportantForAccessibility(n3);
        } else {
            object = ViewCompat.a;
            n3 = 4;
            view.setImportantForAccessibility(n3);
        }
        n3 = (int)(CAN_HIDE_DESCENDANTS ? 1 : 0);
        if (n3 == 0) {
            object = this.mChildAccessibilityDelegate;
            ViewCompat.s(view, (a)object);
        }
    }

    public void cancelChildViewTouch() {
        boolean bl2 = this.mChildrenCanceledTouch;
        if (!bl2) {
            long l2 = SystemClock.uptimeMillis();
            int n3 = 3;
            MotionEvent motionEvent = MotionEvent.obtain((long)l2, (long)l2, (int)n3, (float)0.0f, (float)0.0f, (int)0);
            int n4 = this.getChildCount();
            for (int i3 = 0; i3 < n4; ++i3) {
                View view = this.getChildAt(i3);
                view.dispatchTouchEvent(motionEvent);
            }
            motionEvent.recycle();
            this.mChildrenCanceledTouch = bl2 = true;
        }
    }

    public boolean checkDrawerViewAbsoluteGravity(View view, int n3) {
        int n4 = this.getDrawerViewAbsoluteGravity(view) & n3;
        if (n4 == n3) {
            n4 = 1;
        } else {
            n4 = 0;
            view = null;
        }
        return n4 != 0;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean bl2;
        boolean bl3 = layoutParams instanceof DrawerLayout$LayoutParams;
        if (bl3 && (bl2 = super.checkLayoutParams(layoutParams))) {
            bl2 = true;
        } else {
            bl2 = false;
            layoutParams = null;
        }
        return bl2;
    }

    public void close() {
        this.closeDrawer(0x800003);
    }

    public void closeDrawer(int n3) {
        this.closeDrawer(n3, true);
    }

    public void closeDrawer(int n3, boolean bl2) {
        Object object = this.findDrawerWithGravity(n3);
        if (object != null) {
            this.closeDrawer((View)object, bl2);
            return;
        }
        object = new StringBuilder("No drawer view found with gravity ");
        String string2 = DrawerLayout.gravityToString(n3);
        ((StringBuilder)object).append(string2);
        string2 = ((StringBuilder)object).toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public void closeDrawer(View view) {
        this.closeDrawer(view, true);
    }

    public void closeDrawer(View object, boolean bl2) {
        int n3 = this.isDrawerView((View)object);
        if (n3 != 0) {
            DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams)object.getLayoutParams();
            int n4 = this.mFirstLayout;
            if (n4 != 0) {
                drawerLayout$LayoutParams.b = 0.0f;
                drawerLayout$LayoutParams.d = 0;
            } else {
                n4 = 4;
                if (bl2) {
                    int n7;
                    drawerLayout$LayoutParams.d = n7 = drawerLayout$LayoutParams.d | n4;
                    boolean bl3 = this.checkDrawerViewAbsoluteGravity((View)object, 3);
                    if (bl3) {
                        ViewDragHelper illegalArgumentException = this.mLeftDragger;
                        n3 = -object.getWidth();
                        n4 = object.getTop();
                        illegalArgumentException.u((View)object, n3, n4);
                    } else {
                        ViewDragHelper viewDragHelper = this.mRightDragger;
                        n3 = this.getWidth();
                        n4 = object.getTop();
                        viewDragHelper.u((View)object, n3, n4);
                    }
                } else {
                    this.moveDrawerToOffset((View)object, 0.0f);
                    this.updateDrawerState(0, (View)object);
                    object.setVisibility(n4);
                }
            }
            this.invalidate();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("View ");
        stringBuilder.append(object);
        stringBuilder.append(" is not a sliding drawer");
        object = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public void closeDrawers() {
        this.closeDrawers(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void closeDrawers(boolean bl2) {
        int n3 = this.getChildCount();
        boolean bl3 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl4;
            int n4;
            View view = this.getChildAt(i3);
            DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams)view.getLayoutParams();
            int n7 = this.isDrawerView(view);
            if (n7 == 0 || bl2 && (n7 = drawerLayout$LayoutParams.c) == 0) continue;
            n7 = view.getWidth();
            int n8 = this.checkDrawerViewAbsoluteGravity(view, 3);
            if (n8 != 0) {
                ViewDragHelper viewDragHelper = this.mLeftDragger;
                n7 = -n7;
                n4 = view.getTop();
                bl4 = viewDragHelper.u(view, n7, n4);
            } else {
                ViewDragHelper viewDragHelper = this.mRightDragger;
                n8 = this.getWidth();
                n4 = view.getTop();
                bl4 = viewDragHelper.u(view, n8, n4);
            }
            bl3 |= bl4;
            drawerLayout$LayoutParams.c = false;
        }
        DrawerLayout$ViewDragCallback drawerLayout$ViewDragCallback = this.mLeftCallback;
        Runnable runnable2 = drawerLayout$ViewDragCallback.c;
        drawerLayout$ViewDragCallback.d.removeCallbacks(runnable2);
        DrawerLayout$ViewDragCallback drawerLayout$ViewDragCallback2 = this.mRightCallback;
        runnable2 = drawerLayout$ViewDragCallback2.c;
        DrawerLayout drawerLayout = drawerLayout$ViewDragCallback2.d;
        drawerLayout.removeCallbacks(runnable2);
        if (bl3) {
            this.invalidate();
        }
    }

    public void computeScroll() {
        int n3 = this.getChildCount();
        boolean bl2 = false;
        float f5 = 0.0f;
        ViewDragHelper viewDragHelper = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams)this.getChildAt(i3).getLayoutParams();
            float f6 = drawerLayout$LayoutParams.b;
            f5 = Math.max(f5, f6);
        }
        this.mScrimOpacity = f5;
        Object object = this.mLeftDragger;
        n3 = (int)(((ViewDragHelper)object).h() ? 1 : 0);
        viewDragHelper = this.mRightDragger;
        bl2 = viewDragHelper.h();
        if (n3 != 0 || bl2) {
            object = ViewCompat.a;
            this.postInvalidateOnAnimation();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        int n3 = motionEvent.getSource() & 2;
        if (n3 != 0) {
            n3 = motionEvent.getAction();
            int n4 = 10;
            float f5 = 1.4E-44f;
            if (n3 != n4) {
                float f6 = this.mScrimOpacity;
                n4 = 0;
                f5 = 0.0f;
                float f7 = f6 - 0.0f;
                n3 = (int)(f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1));
                if (n3 > 0) {
                    n3 = this.getChildCount();
                    if (n3 != 0) {
                        f5 = motionEvent.getX();
                        float f8 = motionEvent.getY();
                        int n7 = 1;
                        n3 -= n7;
                        while (n3 >= 0) {
                            boolean bl2;
                            View view = this.getChildAt(n3);
                            boolean bl3 = this.isInBoundsOfChild(f5, f8, view);
                            if (bl3 && !(bl3 = this.isContentView(view)) && (bl2 = this.dispatchTransformedGenericPointerEvent(motionEvent, view))) {
                                return n7 != 0;
                            }
                            n3 += -1;
                        }
                    }
                    return false;
                }
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public void dispatchOnDrawerClosed(View view) {
        Object object = (DrawerLayout$LayoutParams)view.getLayoutParams();
        int n3 = ((DrawerLayout$LayoutParams)((Object)object)).d;
        int n4 = 1;
        if ((n3 &= n4) == n4) {
            int n7;
            n3 = 0;
            ((DrawerLayout$LayoutParams)((Object)object)).d = 0;
            object = this.mListeners;
            if (object != null) {
                for (n7 = object.size() - n4; n7 >= 0; n7 += -1) {
                    DrawerLayout$e drawerLayout$e = (DrawerLayout$e)this.mListeners.get(n7);
                    drawerLayout$e.onDrawerClosed(view);
                }
            }
            this.updateChildrenImportantForAccessibility(view, false);
            this.updateChildAccessibilityAction(view);
            boolean bl2 = this.hasWindowFocus();
            if (bl2 && (view = this.getRootView()) != null) {
                n7 = 32;
                view.sendAccessibilityEvent(n7);
            }
        }
    }

    public void dispatchOnDrawerOpened(View view) {
        Object object = (DrawerLayout$LayoutParams)view.getLayoutParams();
        int n3 = ((DrawerLayout$LayoutParams)((Object)object)).d;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            ((DrawerLayout$LayoutParams)((Object)object)).d = n4;
            object = this.mListeners;
            if (object != null) {
                for (int i3 = object.size() - n4; i3 >= 0; i3 += -1) {
                    DrawerLayout$e drawerLayout$e = (DrawerLayout$e)this.mListeners.get(i3);
                    drawerLayout$e.onDrawerOpened(view);
                }
            }
            this.updateChildrenImportantForAccessibility(view, n4 != 0);
            this.updateChildAccessibilityAction(view);
            int n7 = this.hasWindowFocus();
            if (n7 != 0) {
                n7 = 32;
                this.sendAccessibilityEvent(n7);
            }
        }
    }

    public void dispatchOnDrawerSlide(View view, float f5) {
        List list = this.mListeners;
        if (list != null) {
            for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
                DrawerLayout$e drawerLayout$e = (DrawerLayout$e)this.mListeners.get(i3);
                drawerLayout$e.onDrawerSlide(view, f5);
            }
        }
    }

    public boolean drawChild(Canvas canvas, View view, long l2) {
        int n3;
        ViewDragHelper viewDragHelper;
        float f5;
        int n4;
        DrawerLayout drawerLayout = this;
        View view2 = view;
        int n7 = this.getHeight();
        int n8 = this.isContentView(view);
        int n10 = this.getWidth();
        int n14 = canvas.save();
        int n15 = 3;
        int n16 = 0;
        float f6 = 0.0f;
        ViewDragHelper viewDragHelper2 = null;
        if (n8 != 0) {
            n4 = this.getChildCount();
            f5 = 0.0f;
            viewDragHelper = null;
            int n17 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n18;
                int n19;
                View view3 = this.getChildAt(n3);
                if (view3 == view2 || (n19 = view3.getVisibility()) != 0 || (n19 = (int)(DrawerLayout.hasOpaqueBackground(view3) ? 1 : 0)) == 0 || (n19 = (int)(this.isDrawerView(view3) ? 1 : 0)) == 0 || (n19 = view3.getHeight()) < n7) continue;
                n19 = (int)(this.checkDrawerViewAbsoluteGravity(view3, n15) ? 1 : 0);
                if (n19 != 0) {
                    n18 = view3.getRight();
                    if (n18 <= n17) continue;
                    n17 = n18;
                    continue;
                }
                n18 = view3.getLeft();
                if (n18 >= n10) continue;
                n10 = n18;
            }
            n7 = this.getHeight();
            canvas.clipRect(n17, 0, n10, n7);
            n16 = n17;
        }
        n4 = (int)(super.drawChild(canvas, view, l2) ? 1 : 0);
        canvas.restoreToCount(n14);
        float f7 = drawerLayout.mScrimOpacity;
        n14 = 0;
        Paint paint = null;
        float f8 = f7 - 0.0f;
        n3 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
        if (n3 > 0 && n8 != 0) {
            int n20 = drawerLayout.mScrimColor;
            n7 = (int)((float)((0xFF000000 & n20) >>> 24) * f7) << 24;
            n8 = 0xFFFFFF;
            n20 = n20 & n8 | n7;
            drawerLayout.mScrimPaint.setColor(n20);
            float f11 = n16;
            float f12 = n10;
            float f14 = this.getHeight();
            paint = drawerLayout.mScrimPaint;
            n7 = 0;
            f7 = 0.0f;
            Object var29_32 = null;
            canvas.drawRect(f11, 0.0f, f12, f14, paint);
        } else {
            Drawable drawable2 = drawerLayout.mShadowLeftResolved;
            n8 = 1132396544;
            float f15 = 255.0f;
            n10 = 1065353216;
            float f16 = 1.0f;
            if (drawable2 != null && (n7 = (int)(this.checkDrawerViewAbsoluteGravity(view2, n15) ? 1 : 0)) != 0) {
                drawable2 = drawerLayout.mShadowLeftResolved;
                n7 = drawable2.getIntrinsicWidth();
                n15 = view.getRight();
                viewDragHelper2 = drawerLayout.mLeftDragger;
                n16 = viewDragHelper2.o;
                f5 = n15;
                f6 = n16;
                f16 = Math.min(f5 /= f6, f16);
                f16 = Math.max(0.0f, f16);
                paint = drawerLayout.mShadowLeftResolved;
                n16 = view.getTop();
                int n21 = view.getBottom();
                paint.setBounds(n15, n16, n7 += n15, n21);
                view2 = drawerLayout.mShadowLeftResolved;
                n7 = (int)(f16 *= f15);
                view2.setAlpha(n7);
                view2 = drawerLayout.mShadowLeftResolved;
                view2.draw(canvas);
            } else {
                drawable2 = drawerLayout.mShadowRightResolved;
                if (drawable2 != null) {
                    f7 = 7.0E-45f;
                    n7 = (int)(this.checkDrawerViewAbsoluteGravity(view2, 5) ? 1 : 0);
                    if (n7 != 0) {
                        drawable2 = drawerLayout.mShadowRightResolved;
                        n7 = drawable2.getIntrinsicWidth();
                        n15 = view.getLeft();
                        n16 = this.getWidth() - n15;
                        viewDragHelper = drawerLayout.mRightDragger;
                        n3 = viewDragHelper.o;
                        f6 = n16;
                        f5 = n3;
                        f16 = Math.min(f6 /= f5, f16);
                        f16 = Math.max(0.0f, f16);
                        paint = drawerLayout.mShadowRightResolved;
                        n7 = n15 - n7;
                        n16 = view.getTop();
                        int n22 = view.getBottom();
                        paint.setBounds(n7, n16, n15, n22);
                        view2 = drawerLayout.mShadowRightResolved;
                        n7 = (int)(f16 *= f15);
                        view2.setAlpha(n7);
                        view2 = drawerLayout.mShadowRightResolved;
                        view2.draw(canvas);
                    }
                }
            }
        }
        return n4 != 0;
    }

    public View findDrawerWithGravity(int n3) {
        int n4 = this.getLayoutDirection();
        n3 = Gravity.getAbsoluteGravity((int)n3, (int)n4) & 7;
        n4 = this.getChildCount();
        for (int i3 = 0; i3 < n4; ++i3) {
            View view = this.getChildAt(i3);
            int n7 = this.getDrawerViewAbsoluteGravity(view) & 7;
            if (n7 != n3) continue;
            return view;
        }
        return null;
    }

    public View findOpenDrawer() {
        int n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = this.getChildAt(i3);
            DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams)view.getLayoutParams();
            int n4 = drawerLayout$LayoutParams.d;
            int n7 = 1;
            if ((n4 &= n7) != n7) continue;
            return view;
        }
        return null;
    }

    public View findVisibleDrawer() {
        int n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = this.getChildAt(i3);
            boolean bl2 = this.isDrawerView(view);
            if (!bl2 || !(bl2 = this.isDrawerVisible(view))) continue;
            return view;
        }
        return null;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        int n3 = -1;
        DrawerLayout$LayoutParams drawerLayout$LayoutParams = new ViewGroup.MarginLayoutParams(n3, n3);
        drawerLayout$LayoutParams.a = 0;
        return drawerLayout$LayoutParams;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = this.getContext();
        DrawerLayout$LayoutParams drawerLayout$LayoutParams = new DrawerLayout$LayoutParams(context, attributeSet);
        return drawerLayout$LayoutParams;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams object) {
        DrawerLayout$LayoutParams drawerLayout$LayoutParams;
        boolean bl2 = object instanceof DrawerLayout$LayoutParams;
        if (bl2) {
            int n3;
            object = (DrawerLayout$LayoutParams)((Object)object);
            drawerLayout$LayoutParams = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams)object);
            drawerLayout$LayoutParams.a = 0;
            drawerLayout$LayoutParams.a = n3 = object.a;
        } else {
            bl2 = object instanceof ViewGroup.MarginLayoutParams;
            if (bl2) {
                object = (ViewGroup.MarginLayoutParams)object;
                drawerLayout$LayoutParams = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams)object);
                drawerLayout$LayoutParams.a = 0;
            } else {
                drawerLayout$LayoutParams = new ViewGroup.MarginLayoutParams(object);
                drawerLayout$LayoutParams.a = 0;
            }
        }
        return drawerLayout$LayoutParams;
    }

    public float getDrawerElevation() {
        boolean bl2 = SET_DRAWER_SHADOW_FROM_ELEVATION;
        if (bl2) {
            return this.mDrawerElevation;
        }
        return 0.0f;
    }

    public int getDrawerLockMode(int n3) {
        int n4 = this.getLayoutDirection();
        int n7 = 3;
        if (n3 != n7) {
            int n8 = 5;
            if (n3 != n8) {
                n8 = 0x800003;
                if (n3 != n8) {
                    n8 = 0x800005;
                    if (n3 == n8) {
                        n3 = this.mLockModeEnd;
                        if (n3 != n7) {
                            return n3;
                        }
                        n3 = n4 == 0 ? this.mLockModeRight : this.mLockModeLeft;
                        if (n3 != n7) {
                            return n3;
                        }
                    }
                } else {
                    n3 = this.mLockModeStart;
                    if (n3 != n7) {
                        return n3;
                    }
                    n3 = n4 == 0 ? this.mLockModeLeft : this.mLockModeRight;
                    if (n3 != n7) {
                        return n3;
                    }
                }
            } else {
                n3 = this.mLockModeRight;
                if (n3 != n7) {
                    return n3;
                }
                n3 = n4 == 0 ? this.mLockModeEnd : this.mLockModeStart;
                if (n3 != n7) {
                    return n3;
                }
            }
        } else {
            n3 = this.mLockModeLeft;
            if (n3 != n7) {
                return n3;
            }
            n3 = n4 == 0 ? this.mLockModeStart : this.mLockModeEnd;
            if (n3 != n7) {
                return n3;
            }
        }
        return 0;
    }

    public int getDrawerLockMode(View object) {
        boolean bl2 = this.isDrawerView((View)object);
        if (bl2) {
            int n3 = ((DrawerLayout$LayoutParams)object.getLayoutParams()).a;
            return this.getDrawerLockMode(n3);
        }
        StringBuilder stringBuilder = new StringBuilder("View ");
        stringBuilder.append(object);
        stringBuilder.append(" is not a drawer");
        object = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public CharSequence getDrawerTitle(int n3) {
        int n4 = this.getLayoutDirection();
        if ((n3 = Gravity.getAbsoluteGravity((int)n3, (int)n4)) == (n4 = 3)) {
            return this.mTitleLeft;
        }
        n4 = 5;
        if (n3 == n4) {
            return this.mTitleRight;
        }
        return null;
    }

    public int getDrawerViewAbsoluteGravity(View view) {
        int n3 = ((DrawerLayout$LayoutParams)view.getLayoutParams()).a;
        int n4 = this.getLayoutDirection();
        return Gravity.getAbsoluteGravity((int)n3, (int)n4);
    }

    public float getDrawerViewOffset(View view) {
        return ((DrawerLayout$LayoutParams)view.getLayoutParams()).b;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.mStatusBarBackground;
    }

    public boolean isContentView(View object) {
        object = (DrawerLayout$LayoutParams)object.getLayoutParams();
        int n3 = object.a;
        if (!n3) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public boolean isDrawerOpen(int n3) {
        View view = this.findDrawerWithGravity(n3);
        if (view != null) {
            return this.isDrawerOpen(view);
        }
        return false;
    }

    public boolean isDrawerOpen(View object) {
        int n3 = (int)(this.isDrawerView((View)object) ? 1 : 0);
        if (n3 != 0) {
            object = (DrawerLayout$LayoutParams)object.getLayoutParams();
            int n4 = object.d;
            n3 = 1;
            if ((n4 &= n3) != n3) {
                n3 = 0;
                Object var4_4 = null;
            }
            return n3 != 0;
        }
        StringBuilder stringBuilder = new StringBuilder("View ");
        stringBuilder.append(object);
        stringBuilder.append(" is not a drawer");
        object = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public boolean isDrawerView(View view) {
        DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams)view.getLayoutParams();
        int n3 = drawerLayout$LayoutParams.a;
        int n4 = view.getLayoutDirection();
        n4 = Gravity.getAbsoluteGravity((int)n3, (int)n4);
        n3 = n4 & 3;
        boolean bl2 = true;
        if (n3 != 0) {
            return bl2;
        }
        if ((n4 &= 5) != 0) {
            return bl2;
        }
        return false;
    }

    public boolean isDrawerVisible(int n3) {
        View view = this.findDrawerWithGravity(n3);
        if (view != null) {
            return this.isDrawerVisible(view);
        }
        return false;
    }

    public boolean isDrawerVisible(View object) {
        boolean bl2 = this.isDrawerView((View)object);
        if (bl2) {
            object = (DrawerLayout$LayoutParams)object.getLayoutParams();
            float f5 = object.b;
            bl2 = false;
            Object var4_4 = null;
            float f6 = f5 - 0.0f;
            Object object2 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
            if (object2 > 0) {
                object2 = true;
                f5 = Float.MIN_VALUE;
            } else {
                object2 = false;
                f5 = 0.0f;
                object = null;
            }
            return (boolean)object2;
        }
        StringBuilder stringBuilder = new StringBuilder("View ");
        stringBuilder.append(object);
        stringBuilder.append(" is not a drawer");
        object = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public boolean isOpen() {
        return this.isDrawerOpen(0x800003);
    }

    public void moveDrawerToOffset(View view, float f5) {
        float f6 = this.getDrawerViewOffset(view);
        float f7 = view.getWidth();
        int n3 = (int)(f6 * f7);
        int n4 = (int)(f7 *= f5) - n3;
        f6 = 4.2E-45f;
        n3 = (int)(this.checkDrawerViewAbsoluteGravity(view, 3) ? 1 : 0);
        if (n3 == 0) {
            n4 = -n4;
        }
        view.offsetLeftAndRight(n4);
        this.setDrawerViewOffset(view, f5);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
    }

    public void onDraw(Canvas canvas) {
        Object object;
        super.onDraw(canvas);
        int n3 = this.mDrawStatusBarBackground;
        if (n3 != 0 && (object = this.mStatusBarBackground) != null) {
            object = this.mLastInsets;
            if (object != null) {
                object = (WindowInsets)object;
                n3 = object.getSystemWindowInsetTop();
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

    public boolean onInterceptTouchEvent(MotionEvent object) {
        int n3;
        int n4;
        ViewDragHelper viewDragHelper;
        boolean bl2;
        block8: {
            ViewDragHelper viewDragHelper2;
            int n7;
            block5: {
                float f5;
                block4: {
                    block6: {
                        block7: {
                            n7 = object.getActionMasked();
                            ViewDragHelper viewDragHelper3 = this.mLeftDragger;
                            bl2 = viewDragHelper3.t((MotionEvent)object);
                            viewDragHelper = this.mRightDragger;
                            n4 = viewDragHelper.t((MotionEvent)object);
                            bl2 |= n4;
                            n4 = 1;
                            if (n7 == 0) break block5;
                            if (n7 == n4) break block6;
                            n3 = 2;
                            f5 = 2.8E-45f;
                            if (n7 == n3) break block7;
                            n3 = 3;
                            f5 = 4.2E-45f;
                            if (n7 == n3) break block6;
                            break block4;
                        }
                        object = this.mLeftDragger;
                        Object object2 = object.d;
                        n7 = ((float[])object2).length;
                        float f6 = 0.0f;
                        Object var12_15 = null;
                        for (int i3 = 0; i3 < n7; ++i3) {
                            int n8 = object.k;
                            int n10 = n4 << i3;
                            if ((n8 &= n10) == 0) continue;
                            float[] fArray = object.f;
                            float f7 = fArray[i3];
                            float f8 = object.d[i3];
                            f7 -= f8;
                            float[] fArray2 = object.g;
                            f8 = fArray2[i3];
                            float[] fArray3 = object.e;
                            float f11 = fArray3[i3];
                            f8 -= f11;
                            f7 *= f7;
                            f8 = f8 * f8 + f7;
                            n8 = object.b;
                            f7 = n8 * n8;
                            float f12 = f8 - f7;
                            if ((n8 = (int)(f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1))) <= 0) continue;
                            object = this.mLeftCallback;
                            object2 = object.c;
                            object.d.removeCallbacks((Runnable)object2);
                            object = this.mRightCallback;
                            object2 = object.c;
                            object = object.d;
                            object.removeCallbacks((Runnable)object2);
                            break block4;
                        }
                        break block4;
                    }
                    this.closeDrawers(n4 != 0);
                    this.mChildrenCanceledTouch = false;
                }
                n3 = 0;
                f5 = 0.0f;
                object = null;
                break block8;
            }
            float f14 = object.getX();
            float f15 = object.getY();
            this.mInitialMotionX = f14;
            this.mInitialMotionY = f15;
            float f16 = this.mScrimOpacity;
            boolean bl3 = false;
            float f17 = 0.0f;
            Object var15_21 = null;
            float f18 = f16 - 0.0f;
            Object object3 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
            if (object3 > 0 && (object = (viewDragHelper2 = this.mLeftDragger).j(n7 = (int)f14, n3 = (int)f15)) != null && (n3 = (int)(this.isContentView((View)object) ? 1 : 0)) != 0) {
                n3 = 1;
                f15 = Float.MIN_VALUE;
            } else {
                n3 = 0;
                f15 = 0.0f;
                object = null;
            }
            this.mChildrenCanceledTouch = false;
        }
        if (!bl2 && n3 == 0 && (n3 = (int)(this.hasPeekingDrawer() ? 1 : 0)) == 0 && (n3 = (int)(this.mChildrenCanceledTouch ? 1 : 0)) == 0) {
            n4 = 0;
            viewDragHelper = null;
        }
        return n4 != 0;
    }

    public boolean onKeyDown(int n3, KeyEvent keyEvent) {
        int n4 = 4;
        if (n3 == n4 && (n4 = (int)(this.hasVisibleDrawer() ? 1 : 0)) != 0) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(n3, keyEvent);
    }

    public boolean onKeyUp(int n3, KeyEvent keyEvent) {
        int n4 = 4;
        if (n3 == n4) {
            int n7;
            View view = this.findVisibleDrawer();
            if (view != null && (n7 = this.getDrawerLockMode(view)) == 0) {
                this.closeDrawers();
            }
            if (view != null) {
                n3 = 1;
            } else {
                n3 = 0;
                view = null;
            }
            return n3 != 0;
        }
        return super.onKeyUp(n3, keyEvent);
    }

    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        Object object;
        int n10;
        DrawerLayout drawerLayout = this;
        int n14 = 1;
        float f5 = Float.MIN_VALUE;
        this.mInLayout = n14;
        int n15 = n7 - n3;
        int n16 = this.getChildCount();
        for (int i3 = 0; i3 < n16; ++i3) {
            int n17;
            View view = drawerLayout.getChildAt(i3);
            int n18 = view.getVisibility();
            if (n18 != (n17 = 8)) {
                int n19;
                int n20;
                int n21;
                DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams)view.getLayoutParams();
                n17 = (int)(drawerLayout.isContentView(view) ? 1 : 0);
                if (n17 != 0) {
                    n17 = drawerLayout$LayoutParams.leftMargin;
                    n21 = drawerLayout$LayoutParams.topMargin;
                    n20 = view.getMeasuredWidth() + n17;
                    n18 = drawerLayout$LayoutParams.topMargin;
                    n19 = view.getMeasuredHeight() + n18;
                    view.layout(n17, n21, n20, n19);
                } else {
                    float f6;
                    int n22;
                    float f7;
                    n17 = view.getMeasuredWidth();
                    n21 = view.getMeasuredHeight();
                    float f8 = 4.2E-45f;
                    n20 = (int)(drawerLayout.checkDrawerViewAbsoluteGravity(view, 3) ? 1 : 0);
                    if (n20 != 0) {
                        n20 = -n17;
                        f7 = n17;
                        n22 = (int)(drawerLayout$LayoutParams.b * f7);
                        n20 += n22;
                        n22 = n17 + n20;
                        f6 = (float)n22 / f7;
                    } else {
                        f8 = n17;
                        f7 = drawerLayout$LayoutParams.b * f8;
                        n19 = (int)f7;
                        n19 = n15 - n19;
                        n22 = n15 - n19;
                        f6 = (float)n22 / f8;
                        n20 = n19;
                    }
                    f7 = drawerLayout$LayoutParams.b;
                    n19 = (int)(f6 == f7 ? 0 : (f6 > f7 ? 1 : -1));
                    if (n19 != 0) {
                        n19 = 1;
                        f7 = Float.MIN_VALUE;
                    } else {
                        n19 = 0;
                        f7 = 0.0f;
                    }
                    int n24 = drawerLayout$LayoutParams.a & 0x70;
                    int n25 = 16;
                    if (n24 != n25) {
                        n25 = 80;
                        if (n24 != n25) {
                            n24 = drawerLayout$LayoutParams.topMargin;
                            view.layout(n20, n24, n17 += n20, n21 += n24);
                        } else {
                            n21 = n8 - n4;
                            n24 = drawerLayout$LayoutParams.bottomMargin;
                            n24 = n21 - n24;
                            n25 = view.getMeasuredHeight();
                            n24 -= n25;
                            n25 = drawerLayout$LayoutParams.bottomMargin;
                            view.layout(n20, n24, n17 += n20, n21 -= n25);
                        }
                    } else {
                        n24 = n8 - n4;
                        n25 = (n24 - n21) / 2;
                        int n26 = drawerLayout$LayoutParams.topMargin;
                        if (n25 < n26) {
                            n25 = n26;
                        } else {
                            n26 = n25 + n21;
                            n14 = drawerLayout$LayoutParams.bottomMargin;
                            n10 = n24 - n14;
                            if (n26 > n10) {
                                n25 = (n24 -= n14) - n21;
                            }
                        }
                        view.layout(n20, n25, n17 += n20, n21 += n25);
                    }
                    if (n19 != 0) {
                        drawerLayout.setDrawerViewOffset(view, f6);
                    }
                    f5 = drawerLayout$LayoutParams.b;
                    n10 = 0;
                    float f11 = f5 - 0.0f;
                    n14 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
                    if (n14 > 0) {
                        n14 = 0;
                        f5 = 0.0f;
                        object = null;
                    } else {
                        n14 = 4;
                        f5 = 5.6E-45f;
                    }
                    n10 = view.getVisibility();
                    if (n10 != n14) {
                        view.setVisibility(n14);
                    }
                }
            }
            n14 = 1;
            f5 = Float.MIN_VALUE;
        }
        n14 = sEdgeSizeUsingSystemGestureInsets;
        if (n14 != 0 && (object = Uu0.a(this)) != null) {
            n15 = 0;
            object = f.h(null, (WindowInsets)object).a.i();
            ViewDragHelper viewDragHelper = drawerLayout.mLeftDragger;
            n16 = viewDragHelper.p;
            n10 = object.a;
            viewDragHelper.o = n16 = Math.max(n16, n10);
            viewDragHelper = drawerLayout.mRightDragger;
            n16 = viewDragHelper.p;
            n14 = object.c;
            viewDragHelper.o = n14 = Math.max(n16, n14);
        }
        drawerLayout.mInLayout = false;
        drawerLayout.mFirstLayout = false;
    }

    /*
     * Unable to fully structure code
     */
    public void onMeasure(int var1_1, int var2_2) {
        block27: {
            block26: {
                var3_3 = this;
                var4_4 = View.MeasureSpec.getMode((int)var1_1);
                var5_5 = View.MeasureSpec.getMode((int)var2_2);
                var6_6 = View.MeasureSpec.getSize((int)var1_1);
                var7_7 = View.MeasureSpec.getSize((int)var2_2);
                var8_8 = 0x40000000;
                if (var4_4 == var8_8 && var5_5 == var8_8) break block26;
                var9_9 = this.isInEditMode();
                if (var9_9 == 0) break block27;
                var9_9 = 300;
                if (var4_4 == 0) {
                    var6_6 = 300;
                }
                if (var5_5 == 0) {
                    var7_7 = 300;
                }
            }
            var3_3.setMeasuredDimension(var6_6, var7_7);
            var10_10 = var3_3.mLastInsets;
            var5_5 = 0;
            var11_11 = null;
            if (var10_10 == null) ** GOTO lbl-1000
            var10_10 = ViewCompat.a;
            var4_4 = (int)this.getFitsSystemWindows();
            if (var4_4 != 0) {
                var4_4 = 1;
            } else lbl-1000:
            // 2 sources

            {
                var4_4 = 0;
                var10_10 = null;
            }
            var9_9 = this.getLayoutDirection();
            var12_12 = this.getChildCount();
            var14_14 = false;
            var15_15 = false;
            for (var13_13 = 0; var13_13 < var12_12; var13_13 += var23_23) {
                block30: {
                    block29: {
                        block28: {
                            var16_16 = var3_3.getChildAt(var13_13);
                            var17_17 = var16_16.getVisibility();
                            var18_18 = 8;
                            var19_19 = 1.1E-44f;
                            if (var17_17 == var18_18) break block28;
                            var20_20 = (DrawerLayout$LayoutParams)var16_16.getLayoutParams();
                            var18_18 = 3;
                            var19_19 = 4.2E-45f;
                            if (var4_4 != 0) {
                                var21_21 = Gravity.getAbsoluteGravity((int)var20_20.a, (int)var9_9);
                                var22_22 = var16_16.getFitsSystemWindows();
                                var23_23 = 5;
                                var24_24 = 7.0E-45f;
                                if (var22_22) {
                                    var25_25 = (WindowInsets)var3_3.mLastInsets;
                                    if (var21_21 == var18_18) {
                                        var23_23 = var25_25.getSystemWindowInsetLeft();
                                        var21_21 = var25_25.getSystemWindowInsetTop();
                                        var18_18 = var25_25.getSystemWindowInsetBottom();
                                        var25_25 = var25_25.replaceSystemWindowInsets(var23_23, var21_21, 0, var18_18);
                                    } else if (var21_21 == var23_23) {
                                        var23_23 = var25_25.getSystemWindowInsetTop();
                                        var18_18 = var25_25.getSystemWindowInsetRight();
                                        var21_21 = var25_25.getSystemWindowInsetBottom();
                                        var25_25 = var25_25.replaceSystemWindowInsets(0, var23_23, var18_18, var21_21);
                                    }
                                    var16_16.dispatchApplyWindowInsets(var25_25);
                                } else {
                                    var25_25 = (WindowInsets)var3_3.mLastInsets;
                                    var18_18 = 3;
                                    var19_19 = 4.2E-45f;
                                    if (var21_21 == var18_18) {
                                        var23_23 = var25_25.getSystemWindowInsetLeft();
                                        var18_18 = var25_25.getSystemWindowInsetTop();
                                        var21_21 = var25_25.getSystemWindowInsetBottom();
                                        var25_25 = var25_25.replaceSystemWindowInsets(var23_23, var18_18, 0, var21_21);
                                    } else if (var21_21 == var23_23) {
                                        var23_23 = var25_25.getSystemWindowInsetTop();
                                        var18_18 = var25_25.getSystemWindowInsetRight();
                                        var21_21 = var25_25.getSystemWindowInsetBottom();
                                        var25_25 = var25_25.replaceSystemWindowInsets(0, var23_23, var18_18, var21_21);
                                    }
                                    var20_20.leftMargin = var23_23 = var25_25.getSystemWindowInsetLeft();
                                    var20_20.topMargin = var23_23 = var25_25.getSystemWindowInsetTop();
                                    var20_20.rightMargin = var23_23 = var25_25.getSystemWindowInsetRight();
                                    var20_20.bottomMargin = var23_23 = var25_25.getSystemWindowInsetBottom();
                                }
                            }
                            if ((var23_23 = (int)var3_3.isContentView(var16_16)) == 0) break block29;
                            var23_23 = var20_20.leftMargin;
                            var23_23 = var6_6 - var23_23;
                            var8_8 = var20_20.rightMargin;
                            var23_23 -= var8_8;
                            var8_8 = 0x40000000;
                            var23_23 = View.MeasureSpec.makeMeasureSpec((int)var23_23, (int)var8_8);
                            var18_18 = var20_20.topMargin;
                            var18_18 = var7_7 - var18_18;
                            var17_17 = var20_20.bottomMargin;
                            var18_18 -= var17_17;
                            var17_17 = View.MeasureSpec.makeMeasureSpec((int)var18_18, (int)var8_8);
                            var16_16.measure(var23_23, var17_17);
                        }
                        var21_21 = var1_1;
                        var17_17 = var2_2;
lbl97:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var8_8 = 0x40000000;
                    var23_23 = (int)var3_3.isDrawerView(var16_16);
                    if (var23_23 != 0) {
                        var23_23 = (int)DrawerLayout.SET_DRAWER_SHADOW_FROM_ELEVATION;
                        if (var23_23 != 0 && (var23_23 = (int)((cfr_temp_0 = (var24_24 = ViewCompat$c.e(var16_16)) - (var19_19 = var3_3.mDrawerElevation)) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1))) != 0) {
                            ViewCompat$c.m(var16_16, var19_19);
                        }
                        var23_23 = var3_3.getDrawerViewAbsoluteGravity(var16_16) & 7;
                        var18_18 = 3;
                        var19_19 = 4.2E-45f;
                        if (var23_23 == var18_18) {
                            var18_18 = 1;
                            var19_19 = 1.4E-45f;
                        } else {
                            var18_18 = 0;
                            var19_19 = 0.0f;
                        }
                        if (var18_18 != 0 && var14_14 != false || var18_18 == 0 && var15_15 != false) {
                            var11_11 = new StringBuilder("Child drawer has absolute gravity ");
                            var26_26 = DrawerLayout.gravityToString(var23_23);
                            var11_11.append(var26_26);
                            var11_11.append(" but this DrawerLayout already has a drawer view along that edge");
                            var26_26 = var11_11.toString();
                            var10_10 = new IllegalStateException(var26_26);
                            throw var10_10;
                        }
                        if (var18_18 != 0) {
                            var14_14 = true;
                        } else {
                            var15_15 = true;
                        }
                        var23_23 = var3_3.mMinDrawerMargin;
                        var18_18 = var20_20.leftMargin;
                        var23_23 += var18_18;
                        var18_18 = var20_20.rightMargin;
                        var23_23 += var18_18;
                        var18_18 = var20_20.width;
                        var21_21 = var1_1;
                        var23_23 = ViewGroup.getChildMeasureSpec((int)var1_1, (int)var23_23, (int)var18_18);
                        var18_18 = var20_20.topMargin;
                        var5_5 = var20_20.bottomMargin;
                        var18_18 += var5_5;
                        var5_5 = var20_20.height;
                        var17_17 = var2_2;
                        var5_5 = ViewGroup.getChildMeasureSpec((int)var2_2, (int)var18_18, (int)var5_5);
                        var16_16.measure(var23_23, var5_5);
                        ** continue;
                    }
                    break block30;
                    var23_23 = 1;
                    var24_24 = 1.4E-45f;
                    var5_5 = 0;
                    var11_11 = null;
                    continue;
                }
                var10_10 = new StringBuilder("Child ");
                var10_10.append(var16_16);
                var10_10.append(" at index ");
                var10_10.append(var13_13);
                var10_10.append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                var10_10 = var10_10.toString();
                var26_27 = new IllegalStateException((String)var10_10);
                throw var26_27;
            }
            return;
        }
        var26_28 = new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        throw var26_28;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        int n3;
        int n4;
        int n7;
        int n8 = parcelable instanceof DrawerLayout$SavedState;
        if (n8 == 0) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (DrawerLayout$SavedState)parcelable;
        Parcelable parcelable2 = parcelable.getSuperState();
        super.onRestoreInstanceState(parcelable2);
        n8 = parcelable.a;
        if (n8 != 0 && (parcelable2 = this.findDrawerWithGravity(n8)) != null) {
            this.openDrawer((View)parcelable2);
        }
        if ((n8 = parcelable.b) != (n7 = 3)) {
            this.setDrawerLockMode(n8, n7);
        }
        if ((n8 = parcelable.c) != n7) {
            n4 = 5;
            this.setDrawerLockMode(n8, n4);
        }
        if ((n8 = parcelable.d) != n7) {
            n4 = 0x800003;
            this.setDrawerLockMode(n8, n4);
        }
        if ((n3 = parcelable.e) != n7) {
            n8 = 0x800005;
            this.setDrawerLockMode(n3, n8);
        }
    }

    public void onRtlPropertiesChanged(int n3) {
        this.resolveShadowDrawables();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable parcelable = super.onSaveInstanceState();
        DrawerLayout$SavedState drawerLayout$SavedState = new AbsSavedState(parcelable);
        parcelable = null;
        drawerLayout$SavedState.a = 0;
        int n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams)this.getChildAt(i3).getLayoutParams();
            int n4 = drawerLayout$LayoutParams.d;
            int n7 = 1;
            boolean bl2 = n4 == n7;
            int n8 = 2;
            if (n4 != n8) {
                n7 = 0;
            }
            if (!bl2 && n7 == 0) {
                continue;
            }
            drawerLayout$SavedState.a = n3 = drawerLayout$LayoutParams.a;
            break;
        }
        drawerLayout$SavedState.b = n3 = this.mLockModeLeft;
        drawerLayout$SavedState.c = n3 = this.mLockModeRight;
        drawerLayout$SavedState.d = n3 = this.mLockModeStart;
        drawerLayout$SavedState.e = n3 = this.mLockModeEnd;
        return drawerLayout$SavedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n3;
        block7: {
            block5: {
                boolean bl2;
                block9: {
                    block8: {
                        float f5;
                        float f6;
                        int n4;
                        int n7;
                        block6: {
                            this.mLeftDragger.m(motionEvent);
                            ViewDragHelper viewDragHelper = this.mRightDragger;
                            viewDragHelper.m(motionEvent);
                            n7 = motionEvent.getAction() & 0xFF;
                            bl2 = false;
                            n3 = 1;
                            if (n7 == 0) break block5;
                            if (n7 == n3) break block6;
                            int n8 = 3;
                            float f7 = 4.2E-45f;
                            if (n7 == n8) {
                                this.closeDrawers(n3 != 0);
                                this.mChildrenCanceledTouch = false;
                            }
                            break block7;
                        }
                        float f8 = motionEvent.getX();
                        float f11 = motionEvent.getY();
                        ViewDragHelper viewDragHelper = this.mLeftDragger;
                        int n10 = (int)f8;
                        int n14 = (int)f11;
                        if ((viewDragHelper = viewDragHelper.j(n10, n14)) == null || (n4 = this.isContentView((View)viewDragHelper)) == 0) break block8;
                        float f12 = this.mInitialMotionX;
                        f8 -= f12;
                        f12 = this.mInitialMotionY;
                        f11 -= f12;
                        viewDragHelper = this.mLeftDragger;
                        n4 = viewDragHelper.b;
                        f8 *= f8;
                        if ((f6 = (f5 = (f11 = f11 * f11 + f8) - (f8 = (float)(n4 *= n4))) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) >= 0 || (motionEvent = this.findOpenDrawer()) == null) break block8;
                        f6 = this.getDrawerLockMode((View)motionEvent);
                        n7 = 2;
                        f8 = 2.8E-45f;
                        if (f6 != n7) break block9;
                    }
                    bl2 = true;
                }
                this.closeDrawers(bl2);
                break block7;
            }
            float f14 = motionEvent.getX();
            float f15 = motionEvent.getY();
            this.mInitialMotionX = f14;
            this.mInitialMotionY = f15;
            this.mChildrenCanceledTouch = false;
        }
        return n3 != 0;
    }

    public void open() {
        this.openDrawer(0x800003);
    }

    public void openDrawer(int n3) {
        this.openDrawer(n3, true);
    }

    public void openDrawer(int n3, boolean bl2) {
        Object object = this.findDrawerWithGravity(n3);
        if (object != null) {
            this.openDrawer((View)object, bl2);
            return;
        }
        object = new StringBuilder("No drawer view found with gravity ");
        String string2 = DrawerLayout.gravityToString(n3);
        ((StringBuilder)object).append(string2);
        string2 = ((StringBuilder)object).toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public void openDrawer(View view) {
        this.openDrawer(view, true);
    }

    public void openDrawer(View object, boolean bl2) {
        int n3 = this.isDrawerView((View)object);
        if (n3 != 0) {
            DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams)object.getLayoutParams();
            int n4 = this.mFirstLayout;
            float f5 = 1.0f;
            if (n4 != 0) {
                drawerLayout$LayoutParams.b = f5;
                boolean bl3 = true;
                drawerLayout$LayoutParams.d = bl3;
                this.updateChildrenImportantForAccessibility((View)object, bl3);
                this.updateChildAccessibilityAction((View)object);
            } else {
                n4 = 0;
                if (bl2) {
                    int n7;
                    drawerLayout$LayoutParams.d = n7 = drawerLayout$LayoutParams.d | 2;
                    boolean bl4 = this.checkDrawerViewAbsoluteGravity((View)object, 3);
                    if (bl4) {
                        ViewDragHelper viewDragHelper = this.mLeftDragger;
                        n3 = object.getTop();
                        viewDragHelper.u((View)object, 0, n3);
                    } else {
                        ViewDragHelper viewDragHelper = this.mRightDragger;
                        n3 = this.getWidth();
                        n4 = object.getWidth();
                        n3 -= n4;
                        n4 = object.getTop();
                        viewDragHelper.u((View)object, n3, n4);
                    }
                } else {
                    this.moveDrawerToOffset((View)object, f5);
                    this.updateDrawerState(0, (View)object);
                    object.setVisibility(0);
                }
            }
            this.invalidate();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("View ");
        stringBuilder.append(object);
        stringBuilder.append(" is not a sliding drawer");
        object = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public void removeDrawerListener(DrawerLayout$e drawerLayout$e) {
        if (drawerLayout$e == null) {
            return;
        }
        List list = this.mListeners;
        if (list == null) {
            return;
        }
        list.remove(drawerLayout$e);
    }

    public void requestDisallowInterceptTouchEvent(boolean bl2) {
        super.requestDisallowInterceptTouchEvent(bl2);
        if (bl2) {
            bl2 = true;
            this.closeDrawers(bl2);
        }
    }

    public void requestLayout() {
        boolean bl2 = this.mInLayout;
        if (!bl2) {
            super.requestLayout();
        }
    }

    public void setChildInsets(Object object, boolean bl2) {
        boolean bl3;
        this.mLastInsets = object;
        this.mDrawStatusBarBackground = bl2;
        if (!bl2 && (object = this.getBackground()) == null) {
            bl3 = true;
        } else {
            bl3 = false;
            object = null;
        }
        this.setWillNotDraw(bl3);
        this.requestLayout();
    }

    public void setDrawerElevation(float f5) {
        int n3;
        this.mDrawerElevation = f5;
        f5 = 0.0f;
        for (int i3 = 0; i3 < (n3 = this.getChildCount()); ++i3) {
            View view = this.getChildAt(i3);
            boolean bl2 = this.isDrawerView(view);
            if (!bl2) continue;
            float f6 = this.mDrawerElevation;
            ViewCompat$c.m(view, f6);
        }
    }

    public void setDrawerListener(DrawerLayout$e drawerLayout$e) {
        DrawerLayout$e drawerLayout$e2 = this.mListener;
        if (drawerLayout$e2 != null) {
            this.removeDrawerListener(drawerLayout$e2);
        }
        if (drawerLayout$e != null) {
            this.addDrawerListener(drawerLayout$e);
        }
        this.mListener = drawerLayout$e;
    }

    public void setDrawerLockMode(int n3) {
        this.setDrawerLockMode(n3, 3);
        this.setDrawerLockMode(n3, 5);
    }

    public void setDrawerLockMode(int n3, int n4) {
        int n7 = this.getLayoutDirection();
        n7 = Gravity.getAbsoluteGravity((int)n4, (int)n7);
        int n8 = 3;
        if (n4 != n8) {
            int n10 = 5;
            if (n4 != n10) {
                n10 = 0x800003;
                if (n4 != n10) {
                    n10 = 0x800005;
                    if (n4 == n10) {
                        this.mLockModeEnd = n3;
                    }
                } else {
                    this.mLockModeStart = n3;
                }
            } else {
                this.mLockModeRight = n3;
            }
        } else {
            this.mLockModeLeft = n3;
        }
        if (n3 != 0) {
            ViewDragHelper viewDragHelper = n7 == n8 ? this.mLeftDragger : this.mRightDragger;
            viewDragHelper.b();
        }
        if (n3 != (n4 = 1)) {
            View view;
            n4 = 2;
            if (n3 == n4 && (view = this.findDrawerWithGravity(n7)) != null) {
                this.openDrawer(view);
            }
        } else {
            View view = this.findDrawerWithGravity(n7);
            if (view != null) {
                this.closeDrawer(view);
            }
        }
    }

    public void setDrawerLockMode(int n3, View object) {
        boolean bl2 = this.isDrawerView((View)object);
        if (bl2) {
            int n4 = ((DrawerLayout$LayoutParams)object.getLayoutParams()).a;
            this.setDrawerLockMode(n3, n4);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("View ");
        stringBuilder.append(object);
        stringBuilder.append(" is not a drawer with appropriate layout_gravity");
        object = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public void setDrawerShadow(int n3, int n4) {
        Drawable drawable2 = t70.getDrawable(this.getContext(), n3);
        this.setDrawerShadow(drawable2, n4);
    }

    public void setDrawerShadow(Drawable drawable2, int n3) {
        block8: {
            block5: {
                int n4;
                block7: {
                    int n7;
                    block6: {
                        block4: {
                            n4 = SET_DRAWER_SHADOW_FROM_ELEVATION;
                            if (n4 != 0) {
                                return;
                            }
                            n4 = 0x800003;
                            n7 = n3 & n4;
                            if (n7 != n4) break block4;
                            this.mShadowStart = drawable2;
                            break block5;
                        }
                        n4 = 0x800005;
                        n7 = n3 & n4;
                        if (n7 != n4) break block6;
                        this.mShadowEnd = drawable2;
                        break block5;
                    }
                    n4 = n3 & 3;
                    n7 = 3;
                    if (n4 != n7) break block7;
                    this.mShadowLeft = drawable2;
                    break block5;
                }
                n4 = 5;
                if ((n3 &= n4) != n4) break block8;
                this.mShadowRight = drawable2;
            }
            this.resolveShadowDrawables();
            this.invalidate();
        }
    }

    public void setDrawerTitle(int n3, CharSequence charSequence) {
        int n4 = this.getLayoutDirection();
        if ((n3 = Gravity.getAbsoluteGravity((int)n3, (int)n4)) == (n4 = 3)) {
            this.mTitleLeft = charSequence;
        } else {
            n4 = 5;
            if (n3 == n4) {
                this.mTitleRight = charSequence;
            }
        }
    }

    public void setDrawerViewOffset(View view, float f5) {
        DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams)view.getLayoutParams();
        float f6 = drawerLayout$LayoutParams.b;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            return;
        }
        drawerLayout$LayoutParams.b = f5;
        this.dispatchOnDrawerSlide(view, f5);
    }

    public void setScrimColor(int n3) {
        this.mScrimColor = n3;
        this.invalidate();
    }

    public void setStatusBarBackground(int n3) {
        Drawable drawable2;
        if (n3 != 0) {
            Context context = this.getContext();
            drawable2 = t70.getDrawable(context, n3);
        } else {
            n3 = 0;
            drawable2 = null;
        }
        this.mStatusBarBackground = drawable2;
        this.invalidate();
    }

    public void setStatusBarBackground(Drawable drawable2) {
        this.mStatusBarBackground = drawable2;
        this.invalidate();
    }

    public void setStatusBarBackgroundColor(int n3) {
        ColorDrawable colorDrawable = new ColorDrawable(n3);
        this.mStatusBarBackground = colorDrawable;
        this.invalidate();
    }

    public void updateDrawerState(int n3, View object) {
        Object object2;
        int n4;
        ViewDragHelper viewDragHelper = this.mLeftDragger;
        int n7 = viewDragHelper.a;
        ViewDragHelper viewDragHelper2 = this.mRightDragger;
        int n8 = viewDragHelper2.a;
        int n10 = 1;
        if (n7 != n10 && n8 != n10) {
            n4 = 2;
            if (n7 != n4 && n8 != n4) {
                n4 = 0;
            }
        } else {
            n4 = 1;
        }
        if (object != null && n3 == 0) {
            object2 = (DrawerLayout$LayoutParams)object.getLayoutParams();
            float f5 = ((DrawerLayout$LayoutParams)((Object)object2)).b;
            float f6 = 0.0f;
            viewDragHelper = null;
            float f7 = f5 - 0.0f;
            n7 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
            if (n7 == 0) {
                this.dispatchOnDrawerClosed((View)object);
            } else {
                n7 = 1065353216;
                f6 = 1.0f;
                float f8 = f5 - f6;
                n3 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
                if (n3 == 0) {
                    this.dispatchOnDrawerOpened((View)object);
                }
            }
        }
        if (n4 != (n3 = this.mDrawerState)) {
            this.mDrawerState = n4;
            object2 = this.mListeners;
            if (object2 != null) {
                for (n3 = object2.size() - n10; n3 >= 0; n3 += -1) {
                    object = (DrawerLayout$e)this.mListeners.get(n3);
                    object.onDrawerStateChanged(n4);
                }
            }
        }
    }
}

