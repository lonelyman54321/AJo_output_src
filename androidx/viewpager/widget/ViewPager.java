/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$NotFoundException
 *  android.database.DataSetObserver
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  android.util.AttributeSet
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
package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
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
import androidx.viewpager.widget.ViewPager$3;
import androidx.viewpager.widget.ViewPager$LayoutParams;
import androidx.viewpager.widget.ViewPager$SavedState;
import androidx.viewpager.widget.ViewPager$c;
import androidx.viewpager.widget.ViewPager$d;
import androidx.viewpager.widget.ViewPager$e;
import androidx.viewpager.widget.ViewPager$f;
import androidx.viewpager.widget.ViewPager$g;
import androidx.viewpager.widget.ViewPager$h;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager$j;
import androidx.viewpager.widget.ViewPager$l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager
extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final Comparator COMPARATOR;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = 255;
    static final int[] LAYOUT_ATTRS;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private static final Interpolator sInterpolator;
    private static final ViewPager$l sPositionComparator;
    private int mActivePointerId;
    Uk2 mAdapter;
    private List mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private ViewPager$h mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private ViewPager$j mObserver;
    private int mOffscreenPageLimit;
    private ViewPager$h mOnPageChangeListener;
    private List mOnPageChangeListeners;
    private int mPageMargin;
    private ViewPager$i mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final ViewPager$e mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    static {
        LAYOUT_ATTRS = new int[]{16842931};
        Object object = new Object();
        COMPARATOR = object;
        object = new Object();
        sInterpolator = object;
        sPositionComparator = object = new Object();
    }

    public ViewPager(Context object) {
        super(object);
        int n3;
        int n4;
        super();
        this.mItems = object;
        super();
        this.mTempItem = object;
        super();
        this.mTempRect = object;
        this.mRestoredCurItem = n4 = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = n3 = 1;
        this.mActivePointerId = n4;
        this.mFirstLayout = n3;
        this.mNeedCalculatePageOffsets = false;
        ViewPager$3 viewPager$3 = new ViewPager$3(this);
        this.mEndScrollRunnable = viewPager$3;
        this.mScrollState = 0;
        this.initViewPager();
    }

    public ViewPager(Context object, AttributeSet object2) {
        super(object, object2);
        int n3;
        int n4;
        super();
        this.mItems = object;
        super();
        this.mTempItem = object;
        super();
        this.mTempRect = object;
        this.mRestoredCurItem = n4 = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = n3 = 1;
        this.mActivePointerId = n4;
        this.mFirstLayout = n3;
        this.mNeedCalculatePageOffsets = false;
        super(this);
        this.mEndScrollRunnable = object2;
        this.mScrollState = 0;
        this.initViewPager();
    }

    private void calculatePageOffsets(ViewPager$e viewPager$e, int n3, ViewPager$e object) {
        Object object2;
        float f5;
        float f6;
        Object object3;
        int n4;
        Object object4;
        int n7;
        int n8;
        float f7;
        int n10;
        float f8;
        float f11;
        int n14;
        Uk2 uk2 = this.mAdapter;
        int n15 = uk2.c();
        int n16 = this.getClientWidth();
        if (n16 > 0) {
            n14 = this.mPageMargin;
            f11 = n14;
            f8 = n16;
            f11 /= f8;
        } else {
            n14 = 0;
            f11 = 0.0f;
        }
        n16 = 0;
        f8 = 0.0f;
        float f12 = 1.0f;
        if (object != null) {
            float f14;
            int n17 = ((ViewPager$e)object).b;
            n10 = viewPager$e.b;
            if (n17 < n10) {
                f7 = ((ViewPager$e)object).e;
                f14 = ((ViewPager$e)object).d;
                f7 = f7 + f14 + f11;
                ++n17;
                n8 = 0;
                f14 = 0.0f;
                object = null;
                while (n17 <= (n7 = viewPager$e.b) && n8 < (n7 = ((ArrayList)(object4 = this.mItems)).size())) {
                    object4 = (ViewPager$e)this.mItems.get(n8);
                    while (n17 > (n4 = ((ViewPager$e)object4).b) && n8 < (n4 = ((ArrayList)(object3 = this.mItems)).size() + -1)) {
                        object4 = (ViewPager$e)this.mItems.get(++n8);
                    }
                    while (n17 < (n4 = ((ViewPager$e)object4).b)) {
                        object3 = this.mAdapter;
                        object3.getClass();
                        f6 = f12 + f11;
                        f7 += f6;
                        ++n17;
                    }
                    ((ViewPager$e)object4).e = f7;
                    f5 = ((ViewPager$e)object4).d + f11;
                    f7 += f5;
                    ++n17;
                }
            } else if (n17 > n10) {
                object2 = this.mItems;
                n10 = ((ArrayList)object2).size() + -1;
                f14 = ((ViewPager$e)object).e;
                n17 += -1;
                while (n17 >= (n7 = viewPager$e.b) && n10 >= 0) {
                    object4 = (ViewPager$e)this.mItems.get(n10);
                    while (n17 < (n4 = ((ViewPager$e)object4).b) && n10 > 0) {
                        object4 = (ViewPager$e)this.mItems.get(n10 += -1);
                    }
                    while (n17 > (n4 = ((ViewPager$e)object4).b)) {
                        object3 = this.mAdapter;
                        object3.getClass();
                        f6 = f12 + f11;
                        f14 -= f6;
                        n17 += -1;
                    }
                    f6 = ((ViewPager$e)object4).d + f11;
                    ((ViewPager$e)object4).e = f14 -= f6;
                    n17 += -1;
                }
            }
        }
        object = this.mItems;
        n8 = ((ArrayList)object).size();
        float f15 = viewPager$e.e;
        n10 = viewPager$e.b;
        n7 = n10 + -1;
        if (n10 == 0) {
            f6 = f15;
        } else {
            n4 = -8388609;
            f6 = -3.4028235E38f;
        }
        this.mFirstOffset = f6;
        if (n10 == (n15 += -1)) {
            f7 = viewPager$e.d + f15 - f12;
        } else {
            n10 = 0x7F7FFFFF;
            f7 = Float.MAX_VALUE;
        }
        this.mLastOffset = f7;
        n10 = n3 + -1;
        while (n10 >= 0) {
            int n18;
            object3 = (ViewPager$e)this.mItems.get(n10);
            while (n7 > (n18 = ((ViewPager$e)object3).b)) {
                Uk2 uk22 = this.mAdapter;
                n7 += -1;
                uk22.getClass();
                float f16 = f12 + f11;
                f15 -= f16;
            }
            float f17 = ((ViewPager$e)object3).d + f11;
            ((ViewPager$e)object3).e = f15 -= f17;
            if (n18 == 0) {
                this.mFirstOffset = f15;
            }
            n10 += -1;
            n7 += -1;
        }
        f15 = viewPager$e.e;
        f7 = viewPager$e.d;
        f15 = f15 + f7 + f11;
        int n19 = viewPager$e.b + 1;
        ++n3;
        while (n3 < n8) {
            object2 = (ViewPager$e)this.mItems.get(n3);
            while (n19 < (n7 = ((ViewPager$e)object2).b)) {
                object4 = this.mAdapter;
                ++n19;
                object4.getClass();
                f5 = f12 + f11;
                f15 += f5;
            }
            if (n7 == n15) {
                this.mLastOffset = f5 = ((ViewPager$e)object2).d + f15 - f12;
            }
            ((ViewPager$e)object2).e = f15;
            f7 = ((ViewPager$e)object2).d + f11;
            f15 += f7;
            ++n3;
            ++n19;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean bl2) {
        Object object;
        int n3;
        int n4;
        Scroller scroller;
        int n7 = this.mScrollState;
        int n8 = 2;
        int n10 = 1;
        if ((n7 = n7 == n8 ? 1 : 0) != 0) {
            this.setScrollingCacheEnabled(false);
            scroller = this.mScroller;
            n8 = scroller.isFinished() ^ n10;
            if (n8 != 0) {
                scroller = this.mScroller;
                scroller.abortAnimation();
                n8 = this.getScrollX();
                n4 = this.getScrollY();
                Scroller scroller2 = this.mScroller;
                n3 = scroller2.getCurrX();
                Scroller scroller3 = this.mScroller;
                int n14 = scroller3.getCurrY();
                if (n8 != n3 || n4 != n14) {
                    this.scrollTo(n3, n14);
                    if (n3 != n8) {
                        this.pageScrolled(n3);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        scroller = null;
        for (n8 = 0; n8 < (n4 = ((ArrayList)(object = this.mItems)).size()); n8 += n10) {
            object = (ViewPager$e)this.mItems.get(n8);
            n3 = ((ViewPager$e)object).c;
            if (n3 == 0) continue;
            ((ViewPager$e)object).c = false;
            n7 = 1;
        }
        if (n7 != 0) {
            if (bl2) {
                Runnable runnable2 = this.mEndScrollRunnable;
                this.postOnAnimation(runnable2);
            } else {
                Runnable runnable3 = this.mEndScrollRunnable;
                runnable3.run();
            }
        }
    }

    private int determineTargetPage(int n3, float f5, int n4, int n7) {
        int n8;
        float f6;
        int n10;
        if ((n7 = Math.abs(n7)) > (n10 = this.mFlingDistance) && (n7 = Math.abs(n4)) > (n10 = this.mMinimumVelocity)) {
            if (n4 <= 0) {
                ++n3;
            }
        } else {
            n4 = this.mCurItem;
            if (n3 >= n4) {
                n4 = 1053609165;
                f6 = 0.4f;
            } else {
                n4 = 1058642330;
                f6 = 0.6f;
            }
            n8 = (int)(f5 += f6);
            n3 += n8;
        }
        Object object = this.mItems;
        n8 = ((ArrayList)object).size();
        if (n8 > 0) {
            object = this.mItems;
            f6 = 0.0f;
            object = (ViewPager$e)((ArrayList)object).get(0);
            Object object2 = this.mItems;
            n7 = 1;
            object2 = (ViewPager$e)pp_0.a(n7, (ArrayList)object2);
            n8 = ((ViewPager$e)object).b;
            n4 = ((ViewPager$e)object2).b;
            n3 = Math.min(n3, n4);
            n3 = Math.max(n8, n3);
        }
        return n3;
    }

    private void dispatchOnPageScrolled(int n3, float f5, int n4) {
        Object object = this.mOnPageChangeListener;
        if (object != null) {
            object.onPageScrolled(n3, f5, n4);
        }
        if ((object = this.mOnPageChangeListeners) != null) {
            int n7 = object.size();
            for (int i3 = 0; i3 < n7; ++i3) {
                ViewPager$h viewPager$h = (ViewPager$h)this.mOnPageChangeListeners.get(i3);
                if (viewPager$h == null) continue;
                viewPager$h.onPageScrolled(n3, f5, n4);
            }
        }
        if ((object = this.mInternalPageChangeListener) != null) {
            object.onPageScrolled(n3, f5, n4);
        }
    }

    private void dispatchOnPageSelected(int n3) {
        Object object = this.mOnPageChangeListener;
        if (object != null) {
            object.onPageSelected(n3);
        }
        if ((object = this.mOnPageChangeListeners) != null) {
            int n4 = object.size();
            for (int i3 = 0; i3 < n4; ++i3) {
                ViewPager$h viewPager$h = (ViewPager$h)this.mOnPageChangeListeners.get(i3);
                if (viewPager$h == null) continue;
                viewPager$h.onPageSelected(n3);
            }
        }
        if ((object = this.mInternalPageChangeListener) != null) {
            object.onPageSelected(n3);
        }
    }

    private void dispatchOnScrollStateChanged(int n3) {
        Object object = this.mOnPageChangeListener;
        if (object != null) {
            object.onPageScrollStateChanged(n3);
        }
        if ((object = this.mOnPageChangeListeners) != null) {
            int n4 = object.size();
            for (int i3 = 0; i3 < n4; ++i3) {
                ViewPager$h viewPager$h = (ViewPager$h)this.mOnPageChangeListeners.get(i3);
                if (viewPager$h == null) continue;
                viewPager$h.onPageScrollStateChanged(n3);
            }
        }
        if ((object = this.mInternalPageChangeListener) != null) {
            object.onPageScrollStateChanged(n3);
        }
    }

    private void enableLayers(boolean bl2) {
        int n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = bl2 ? this.mPageTransformerLayerType : 0;
            View view = this.getChildAt(i3);
            view.setLayerType(n4, null);
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            velocityTracker = null;
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
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
        for (view = view.getParent(); (n3 = view instanceof ViewGroup) != 0 && view != this; view = view.getParent()) {
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

    private int getClientWidth() {
        int n3 = this.getMeasuredWidth();
        int n4 = this.getPaddingLeft();
        n3 -= n4;
        n4 = this.getPaddingRight();
        return n3 - n4;
    }

    private ViewPager$e infoForCurrentScrollPosition() {
        Object object;
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
            n4 = this.mPageMargin;
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
        Object object2 = null;
        Object object3 = null;
        float f11 = 0.0f;
        Object object4 = 0;
        float f12 = 0.0f;
        ArrayList arrayList = null;
        int n14 = -1;
        int n15 = 1;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.mItems)).size()); ++i3) {
            int n16;
            object = (ViewPager$e)this.mItems.get(i3);
            if (n15 == 0 && (n16 = ((ViewPager$e)object).b) != (n14 += n10)) {
                object = this.mTempItem;
                ((ViewPager$e)object).e = f8 = f8 + f12 + f6;
                ((ViewPager$e)object).b = n14;
                uk2 = this.mAdapter;
                uk2.getClass();
                ((ViewPager$e)object).d = f8 = 1.0f;
                i3 += -1;
            }
            object2 = object;
            f8 = ((ViewPager$e)object).e;
            f12 = ((ViewPager$e)object).d + f8 + f6;
            if (n15 == 0 && (n15 = f7 == f8 ? 0 : (f7 > f8 ? 1 : -1)) < 0) {
                return object3;
            }
            object4 = f7 == f12 ? 0 : (f7 < f12 ? -1 : 1);
            if (object4 >= 0 && i3 != (object4 = (arrayList = this.mItems).size() - n10)) {
                object4 = ((ViewPager$e)object2).b;
                f11 = ((ViewPager$e)object2).d;
                n15 = 0;
                n14 = object4;
                f12 = f11;
                object3 = object2;
                continue;
            }
            return object2;
        }
        return object3;
    }

    private static boolean isDecorView(View object) {
        boolean bl2;
        object = object.getClass();
        Class<ViewPager$d> clazz = ViewPager$d.class;
        if ((object = ((Class)object).getAnnotation(clazz)) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean isGutterDrag(float f5, float f6) {
        void var6_13;
        float f7;
        float f8;
        int n3;
        int n4;
        int n7;
        float f11;
        float f12;
        float f14;
        float f15;
        float f16 = this.mGutterSize;
        float f17 = f5 - f16;
        Object object = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
        if (object < 0 && (f15 = (f14 = f6 - 0.0f) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1)) > 0 || (f12 = (f11 = f5 - (f16 = (float)(n7 = (n4 = this.getWidth()) - (n3 = this.mGutterSize)))) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) > 0 && (f8 = (f7 = f6 - 0.0f) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) < 0) {
            boolean bl2 = true;
            f5 = Float.MIN_VALUE;
        } else {
            boolean bl3 = false;
            f5 = 0.0f;
        }
        return (boolean)var6_13;
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int n3;
        int n4 = motionEvent.getActionIndex();
        int n7 = motionEvent.getPointerId(n4);
        if (n7 == (n3 = this.mActivePointerId)) {
            int n8;
            float f5;
            n4 = n4 == 0 ? 1 : 0;
            this.mLastMotionX = f5 = motionEvent.getX(n4);
            this.mActivePointerId = n8 = motionEvent.getPointerId(n4);
            motionEvent = this.mVelocityTracker;
            if (motionEvent != null) {
                motionEvent.clear();
            }
        }
    }

    private boolean pageScrolled(int n3) {
        Object object = this.mItems;
        int n4 = ((ArrayList)object).size();
        String string2 = "onPageScrolled did not call superclass implementation";
        if (n4 == 0) {
            n3 = (int)(this.mFirstLayout ? 1 : 0);
            if (n3 != 0) {
                return false;
            }
            this.mCalledSuper = false;
            float f5 = 0.0f;
            IllegalStateException illegalStateException = null;
            this.onPageScrolled(0, 0.0f, 0);
            n3 = (int)(this.mCalledSuper ? 1 : 0);
            if (n3 != 0) {
                return false;
            }
            illegalStateException = new IllegalStateException(string2);
            throw illegalStateException;
        }
        object = this.infoForCurrentScrollPosition();
        int n7 = this.getClientWidth();
        int n8 = this.mPageMargin;
        int n10 = n7 + n8;
        float f6 = n8;
        float f7 = n7;
        f6 /= f7;
        int n14 = ((ViewPager$e)object).b;
        float f8 = (float)n3 / f7;
        f7 = ((ViewPager$e)object).e;
        f8 -= f7;
        float f11 = ((ViewPager$e)object).d + f6;
        f8 /= f11;
        f11 = (float)n10 * f8;
        n4 = (int)f11;
        this.mCalledSuper = false;
        this.onPageScrolled(n14, f8, n4);
        n3 = (int)(this.mCalledSuper ? 1 : 0);
        if (n3 != 0) {
            return true;
        }
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    private boolean performDrag(float f5) {
        Object object;
        boolean bl2;
        boolean bl3;
        float f6 = this.mLastMotionX - f5;
        this.mLastMotionX = f5;
        int n3 = this.getScrollX();
        f5 = (float)n3 + f6;
        int n4 = this.getClientWidth();
        f6 = n4;
        float f7 = this.mFirstOffset * f6;
        float f8 = this.mLastOffset * f6;
        Object object2 = this.mItems;
        boolean bl4 = false;
        object2 = (ViewPager$e)((ArrayList)object2).get(0);
        Object object3 = this.mItems;
        int n7 = 1;
        object3 = (ViewPager$e)pp_0.a(n7, (ArrayList)object3);
        int n8 = ((ViewPager$e)object2).b;
        if (n8 != 0) {
            f7 = ((ViewPager$e)object2).e * f6;
            bl3 = false;
            object2 = null;
        } else {
            bl3 = true;
        }
        n8 = ((ViewPager$e)object3).b;
        Uk2 uk2 = this.mAdapter;
        int n10 = uk2.c() - n7;
        if (n8 != n10) {
            f8 = ((ViewPager$e)object3).e * f6;
            bl2 = false;
            object3 = null;
        } else {
            bl2 = true;
        }
        n8 = (int)(f5 == f7 ? 0 : (f5 < f7 ? -1 : 1));
        if (n8 < 0) {
            if (bl3) {
                f5 = f7 - f5;
                EdgeEffect edgeEffect = this.mLeftEdge;
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
                    EdgeEffect edgeEffect = this.mRightEdge;
                    f5 = Math.abs(f5) / f6;
                    edgeEffect.onPull(f5);
                    bl4 = true;
                }
                f5 = f8;
            }
        }
        f6 = this.mLastMotionX;
        object = (int)f5;
        f8 = object;
        this.mLastMotionX = f5 = f5 - f8 + f6;
        n3 = this.getScrollY();
        this.scrollTo((int)object, n3);
        this.pageScrolled((int)object);
        return bl4;
    }

    private void recomputeScrollPosition(int n3, int n4, int n7, int n8) {
        ArrayList arrayList;
        int n10;
        if (n4 > 0 && (n10 = (arrayList = this.mItems).isEmpty()) == 0) {
            arrayList = this.mScroller;
            n10 = arrayList.isFinished();
            if (n10 == 0) {
                Scroller scroller = this.mScroller;
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
            n4 = this.mCurItem;
            ViewPager$e viewPager$e = this.infoForPosition(n4);
            if (viewPager$e != null) {
                f8 = viewPager$e.e;
                float f11 = this.mLastOffset;
                f8 = Math.min(f8, f11);
            } else {
                n4 = 0;
                f8 = 0.0f;
                viewPager$e = null;
            }
            n7 = this.getPaddingLeft();
            n3 -= n7;
            n7 = this.getPaddingRight();
            float f12 = n3 - n7;
            n3 = (int)(f8 *= f12);
            n4 = this.getScrollX();
            if (n3 != n4) {
                f8 = 0.0f;
                viewPager$e = null;
                this.completeScroll(false);
                n4 = this.getScrollY();
                this.scrollTo(n3, n4);
            }
        }
    }

    private void removeNonDecorViews() {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.getChildCount()); ++i3) {
            ViewPager$LayoutParams viewPager$LayoutParams = (ViewPager$LayoutParams)this.getChildAt(i3).getLayoutParams();
            n3 = (int)(viewPager$LayoutParams.a ? 1 : 0);
            if (n3 != 0) continue;
            this.removeViewAt(i3);
            i3 += -1;
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean bl2) {
        ViewParent viewParent = this.getParent();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(bl2);
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        this.endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        EdgeEffect edgeEffect = this.mLeftEdge;
        boolean bl2 = edgeEffect.isFinished();
        if (!bl2 && !(bl2 = (edgeEffect = this.mRightEdge).isFinished())) {
            bl2 = false;
            edgeEffect = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private void scrollToItem(int n3, boolean bl2, int n4, boolean bl3) {
        int n7;
        ViewPager$e viewPager$e = this.infoForPosition(n3);
        if (viewPager$e != null) {
            int n8 = this.getClientWidth();
            float f5 = n8;
            float f6 = this.mFirstOffset;
            float f7 = viewPager$e.e;
            float f8 = this.mLastOffset;
            f7 = Math.min(f7, f8);
            f7 = Math.max(f6, f7) * f5;
            n7 = (int)f7;
        } else {
            n7 = 0;
            float f11 = 0.0f;
            viewPager$e = null;
        }
        if (bl2) {
            this.smoothScrollTo(n7, 0, n4);
            if (bl3) {
                this.dispatchOnPageSelected(n3);
            }
        } else {
            if (bl3) {
                this.dispatchOnPageSelected(n3);
            }
            this.completeScroll(false);
            this.scrollTo(n7, 0);
            this.pageScrolled(n7);
        }
    }

    private void setScrollingCacheEnabled(boolean bl2) {
        boolean bl3 = this.mScrollingCacheEnabled;
        if (bl3 != bl2) {
            this.mScrollingCacheEnabled = bl2;
        }
    }

    private void sortChildDrawingOrder() {
        int n3 = this.mDrawingOrder;
        if (n3 != 0) {
            ArrayList arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = arrayList = new ArrayList();
            } else {
                arrayList.clear();
            }
            n3 = this.getChildCount();
            ViewPager$l viewPager$l = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                View view = this.getChildAt(i3);
                ArrayList arrayList2 = this.mDrawingOrderedChildren;
                arrayList2.add(view);
            }
            arrayList = this.mDrawingOrderedChildren;
            viewPager$l = sPositionComparator;
            Collections.sort(arrayList, viewPager$l);
        }
    }

    public void addFocusables(ArrayList arrayList, int n3, int n4) {
        int n7;
        int n8 = arrayList.size();
        int n10 = this.getDescendantFocusability();
        if (n10 != (n7 = 393216)) {
            int n14;
            for (n7 = 0; n7 < (n14 = this.getChildCount()); ++n7) {
                int n15;
                ViewPager$e viewPager$e;
                View view = this.getChildAt(n7);
                int n16 = view.getVisibility();
                if (n16 != 0 || (viewPager$e = this.infoForChild(view)) == null || (n16 = viewPager$e.b) != (n15 = this.mCurItem)) continue;
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

    public ViewPager$e addNewItem(int n3, int n4) {
        float f5;
        Object object;
        ViewPager$e viewPager$e = new ViewPager$e();
        viewPager$e.b = n3;
        Uk2 uk2 = this.mAdapter;
        viewPager$e.a = object = uk2.f(n3, this);
        object = this.mAdapter;
        object.getClass();
        n3 = 1065353216;
        viewPager$e.d = f5 = 1.0f;
        if (n4 >= 0 && n4 < (n3 = ((ArrayList)(object = this.mItems)).size())) {
            object = this.mItems;
            ((ArrayList)object).add(n4, viewPager$e);
        } else {
            object = this.mItems;
            ((ArrayList)object).add(viewPager$e);
        }
        return viewPager$e;
    }

    public void addOnAdapterChangeListener(ViewPager$g viewPager$g) {
        ArrayList arrayList = this.mAdapterChangeListeners;
        if (arrayList == null) {
            this.mAdapterChangeListeners = arrayList = new ArrayList();
        }
        this.mAdapterChangeListeners.add(viewPager$g);
    }

    public void addOnPageChangeListener(ViewPager$h viewPager$h) {
        ArrayList arrayList = this.mOnPageChangeListeners;
        if (arrayList == null) {
            this.mOnPageChangeListeners = arrayList = new ArrayList();
        }
        this.mOnPageChangeListeners.add(viewPager$h);
    }

    public void addTouchables(ArrayList arrayList) {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.getChildCount()); ++i3) {
            int n4;
            ViewPager$e viewPager$e;
            View view = this.getChildAt(i3);
            int n7 = view.getVisibility();
            if (n7 != 0 || (viewPager$e = this.infoForChild(view)) == null || (n7 = viewPager$e.b) != (n4 = this.mCurItem)) continue;
            view.addTouchables(arrayList);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void addView(View object, int n3, ViewGroup.LayoutParams layoutParams) {
        void var2_3;
        ViewGroup.LayoutParams layoutParams2;
        boolean bl2 = this.checkLayoutParams(layoutParams2);
        if (!bl2) {
            layoutParams2 = this.generateLayoutParams(layoutParams2);
        }
        ViewPager$LayoutParams viewPager$LayoutParams = layoutParams2;
        viewPager$LayoutParams = (ViewPager$LayoutParams)layoutParams2;
        boolean bl3 = viewPager$LayoutParams.a;
        boolean bl4 = ViewPager.isDecorView(object);
        viewPager$LayoutParams.a = bl3 |= bl4;
        bl4 = this.mInLayout;
        if (!bl4) {
            super.addView(object, (int)var2_3, layoutParams2);
            return;
        }
        if (!bl3) {
            viewPager$LayoutParams.d = bl3 = true;
            this.addViewInLayout((View)object, (int)var2_3, layoutParams2);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Cannot add pager decor view during layout");
        throw illegalStateException;
    }

    /*
     * Unable to fully structure code
     */
    public boolean arrowScroll(int var1_1) {
        block13: {
            block14: {
                block11: {
                    block12: {
                        block10: {
                            var2_2 = this.findFocus();
                            var3_3 = null;
                            if (var2_2 == this) {
                                while (true) {
                                    var4_7 = 0;
                                    var2_2 = null;
                                    break block10;
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
                                    break block10;
                                }
                                var5_4 = new StringBuilder();
                                var7_6 = var2_2.getClass().getSimpleName();
                                var5_4.append(var7_6);
                                var2_2 = var2_2.getParent();
                                while (true) {
                                    if ((var6_5 = var2_2 instanceof ViewGroup) == 0) ** continue;
                                    var5_4.append(" => ");
                                    var7_6 = var2_2.getClass().getSimpleName();
                                    var5_4.append(var7_6);
                                    var2_2 = ((ViewParent)var2_2).getParent();
                                }
                            }
                        }
                        var3_3 = FocusFinder.getInstance().findNextFocus((ViewGroup)this, var2_2, var1_1);
                        var8_8 = 66;
                        var6_5 = 17;
                        if (var3_3 == null || var3_3 == var2_2) break block11;
                        if (var1_1 != var6_5) break block12;
                        var5_4 = this.mTempRect;
                        var5_4 = this.getChildRectInPagerCoordinates((Rect)var5_4, var3_3);
                        var8_8 = var5_4.left;
                        var7_6 = this.mTempRect;
                        var7_6 = this.getChildRectInPagerCoordinates((Rect)var7_6, var2_2);
                        var6_5 = var7_6.left;
                        var4_7 = var2_2 != null && var8_8 >= var6_5 ? (int)this.pageLeft() : (int)var3_3.requestFocus();
                        break block13;
                    }
                    if (var1_1 != var8_8) ** GOTO lbl-1000
                    var5_4 = this.mTempRect;
                    var5_4 = this.getChildRectInPagerCoordinates((Rect)var5_4, var3_3);
                    var8_8 = var5_4.left;
                    var7_6 = this.mTempRect;
                    var7_6 = this.getChildRectInPagerCoordinates((Rect)var7_6, var2_2);
                    var6_5 = var7_6.left;
                    var4_7 = var2_2 != null && var8_8 <= var6_5 ? (int)this.pageRight() : (int)var3_3.requestFocus();
                    break block13;
                }
                if (var1_1 != var6_5 && var1_1 != (var4_7 = 1)) {
                    ** if (var1_1 == var8_8 || var1_1 == (var4_7 = 2)) goto lbl-1000
                }
                break block14;
lbl-1000:
                // 2 sources

                {
                    var4_7 = 0;
                    var2_2 = null;
                    ** GOTO lbl64
                }
lbl-1000:
                // 1 sources

                {
                    var4_7 = (int)this.pageRight();
                }
                break block13;
            }
            var4_7 = this.pageLeft();
        }
        if (var4_7 != 0) {
            var1_1 = SoundEffectConstants.getContantForFocusDirection((int)var1_1);
            this.playSoundEffect(var1_1);
        }
        return (boolean)var4_7;
    }

    public boolean beginFakeDrag() {
        boolean bl2 = this.mIsBeingDragged;
        if (bl2) {
            return false;
        }
        this.mFakeDragging = bl2 = true;
        this.setScrollState((int)(bl2 ? 1 : 0));
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = velocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long l2 = SystemClock.uptimeMillis();
        velocityTracker = MotionEvent.obtain((long)l2, (long)l2, (int)0, (float)0.0f, (float)0.0f, (int)0);
        this.mVelocityTracker.addMovement((MotionEvent)velocityTracker);
        velocityTracker.recycle();
        this.mFakeDragBeginTime = l2;
        return bl2;
    }

    public boolean canScroll(View view, boolean bl2, int n3, int n4, int n7) {
        int n8;
        block6: {
            block5: {
                int n10 = view instanceof ViewGroup;
                n8 = 1;
                if (n10 != 0) {
                    View view2 = view;
                    view2 = (ViewGroup)view;
                    int n14 = view.getScrollX();
                    int n15 = view.getScrollY();
                    for (int i3 = view2.getChildCount() - n8; i3 >= 0; i3 += -1) {
                        int n16;
                        int n17 = n4 + n14;
                        View view3 = view2.getChildAt(i3);
                        int n18 = view3.getLeft();
                        if (n17 < n18 || n17 >= (n18 = view3.getRight()) || (n18 = n7 + n15) < (n16 = view3.getTop()) || n18 >= (n16 = view3.getBottom())) continue;
                        n16 = view3.getLeft();
                        int n19 = n17 - n16;
                        n17 = view3.getTop();
                        int n20 = n18 - n17;
                        n18 = 1;
                        n16 = n3;
                        n17 = (int)(this.canScroll(view3, n18 != 0, n3, n19, n20) ? 1 : 0);
                        if (n17 == 0) continue;
                        return n8 != 0;
                    }
                }
                if (!bl2) break block5;
                n10 = n3;
                n10 = -n3;
                boolean bl3 = view.canScrollHorizontally(n10);
                if (bl3) break block6;
            }
            n8 = 0;
        }
        return n8 != 0;
    }

    public boolean canScrollHorizontally(int n3) {
        Uk2 uk2 = this.mAdapter;
        boolean bl2 = false;
        if (uk2 == null) {
            return false;
        }
        int n4 = this.getClientWidth();
        int n7 = this.getScrollX();
        if (n3 < 0) {
            float f5 = n4;
            float f6 = this.mFirstOffset;
            n3 = (int)(f5 *= f6);
            if (n7 > n3) {
                bl2 = true;
            }
            return bl2;
        }
        if (n3 > 0) {
            float f7 = n4;
            float f8 = this.mLastOffset;
            n3 = (int)(f7 *= f8);
            if (n7 < n3) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean bl2;
        boolean bl3 = layoutParams instanceof ViewPager$LayoutParams;
        if (bl3 && (bl2 = super.checkLayoutParams(layoutParams))) {
            bl2 = true;
        } else {
            bl2 = false;
            layoutParams = null;
        }
        return bl2;
    }

    public void clearOnPageChangeListeners() {
        List list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void computeScroll() {
        int n3;
        this.mIsScrollStarted = n3 = 1;
        Scroller scroller = this.mScroller;
        int n4 = scroller.isFinished();
        if (n4 == 0 && (n4 = (scroller = this.mScroller).computeScrollOffset()) != 0) {
            n3 = this.getScrollX();
            n4 = this.getScrollY();
            Scroller scroller2 = this.mScroller;
            int n7 = scroller2.getCurrX();
            Scroller scroller3 = this.mScroller;
            int n8 = scroller3.getCurrY();
            if (n3 != n7 || n4 != n8) {
                this.scrollTo(n7, n8);
                n3 = (int)(this.pageScrolled(n7) ? 1 : 0);
                if (n3 == 0) {
                    this.mScroller.abortAnimation();
                    n3 = 0;
                    this.scrollTo(0, n8);
                }
            }
            this.postInvalidateOnAnimation();
            return;
        }
        this.completeScroll(n3 != 0);
    }

    public void dataSetChanged() {
        Uk2 uk2;
        Object object;
        int n3;
        int n4;
        Uk2 uk22 = this.mAdapter;
        this.mExpectedAdapterCount = n4 = uk22.c();
        ArrayList arrayList = this.mItems;
        int n7 = arrayList.size();
        int n8 = this.mOffscreenPageLimit * 2;
        int n10 = 1;
        if (n7 < (n8 += n10) && (n7 = (arrayList = this.mItems).size()) < n4) {
            n4 = 1;
        } else {
            n4 = 0;
            uk22 = null;
        }
        n7 = this.mCurItem;
        ArrayList arrayList2 = null;
        for (n8 = 0; n8 < (n3 = ((ArrayList)(object = this.mItems)).size()); ++n8) {
            object = (ViewPager$e)this.mItems.get(n8);
            uk2 = this.mAdapter;
            object = ((ViewPager$e)object).a;
            uk2.d(object);
        }
        arrayList2 = this.mItems;
        object = COMPARATOR;
        Collections.sort(arrayList2, object);
        if (n4 != 0) {
            n4 = this.getChildCount();
            arrayList2 = null;
            for (n8 = 0; n8 < n4; ++n8) {
                object = (ViewPager$LayoutParams)this.getChildAt(n8).getLayoutParams();
                boolean bl2 = ((ViewPager$LayoutParams)((Object)object)).a;
                if (bl2) continue;
                bl2 = false;
                uk2 = null;
                ((ViewPager$LayoutParams)((Object)object)).c = 0.0f;
            }
            this.setCurrentItemInternal(n7, false, n10 != 0);
            this.requestLayout();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean bl2;
        boolean bl3 = super.dispatchKeyEvent(keyEvent);
        if (!bl3 && !(bl2 = this.executeKeyEvent(keyEvent))) {
            bl2 = false;
            keyEvent = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
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
            ViewPager$e viewPager$e;
            View view = this.getChildAt(i3);
            int n8 = view.getVisibility();
            if (n8 != 0 || (viewPager$e = this.infoForChild(view)) == null || (n8 = viewPager$e.b) != (n7 = this.mCurItem) || !(bl2 = view.dispatchPopulateAccessibilityEvent(accessibilityEvent))) continue;
            return true;
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f5) {
        return (float)Math.sin((f5 - 0.5f) * 0.47123894f);
    }

    public void draw(Canvas object) {
        Object object2;
        int n3;
        super.draw(object);
        int n4 = this.getOverScrollMode();
        int n7 = 0;
        EdgeEffect edgeEffect = null;
        if (n4 != 0 && (n4 != (n3 = 1) || (object2 = this.mAdapter) == null || (n4 = ((Uk2)object2).c()) <= n3)) {
            this.mLeftEdge.finish();
            object = this.mRightEdge;
            object.finish();
        } else {
            float f5;
            float f6;
            int n8;
            int n10;
            object2 = this.mLeftEdge;
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
                f6 = this.mFirstOffset;
                f5 = n3;
                object.translate(f7, f6 *= f5);
                EdgeEffect edgeEffect2 = this.mLeftEdge;
                edgeEffect2.setSize(n7, n3);
                edgeEffect = this.mLeftEdge;
                n7 = (int)(edgeEffect.draw(object) ? 1 : 0);
                object.restoreToCount(n4);
            }
            if ((n4 = (int)((object2 = this.mRightEdge).isFinished() ? 1 : 0)) == 0) {
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
                f5 = -(this.mLastOffset + 1.0f);
                float f8 = n3;
                object.translate(f6, f5 *= f8);
                EdgeEffect edgeEffect3 = this.mRightEdge;
                edgeEffect3.setSize(n10, n3);
                EdgeEffect edgeEffect4 = this.mRightEdge;
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

    public void drawableStateChanged() {
        boolean bl2;
        super.drawableStateChanged();
        Drawable drawable2 = this.mMarginDrawable;
        if (drawable2 != null && (bl2 = drawable2.isStateful())) {
            int[] nArray = this.getDrawableState();
            drawable2.setState(nArray);
        }
    }

    public void endFakeDrag() {
        int n3 = this.mFakeDragging;
        if (n3 != 0) {
            Uk2 uk2 = this.mAdapter;
            if (uk2 != null) {
                uk2 = this.mVelocityTracker;
                float f5 = this.mMaximumVelocity;
                uk2.computeCurrentVelocity(1000, f5);
                int bl2 = this.mActivePointerId;
                float f6 = uk2.getXVelocity(bl2);
                n3 = (int)f6;
                boolean bl3 = true;
                f5 = Float.MIN_VALUE;
                this.mPopulatePending = bl3;
                int n4 = this.getClientWidth();
                int n7 = this.getScrollX();
                ViewPager$e viewPager$e = this.infoForCurrentScrollPosition();
                int n8 = viewPager$e.b;
                float f7 = n7;
                float f8 = n4;
                f7 /= f8;
                f8 = viewPager$e.e;
                f7 -= f8;
                f8 = viewPager$e.d;
                f7 /= f8;
                f8 = this.mLastMotionX;
                float f11 = this.mInitialMotionX;
                n4 = (int)(f8 -= f11);
                n4 = this.determineTargetPage(n8, f7, n3, n4);
                this.setCurrentItemInternal(n4, bl3, bl3, n3);
            }
            this.endDrag();
            this.mFakeDragging = false;
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        throw illegalStateException;
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        boolean bl2;
        block4: {
            block0: {
                int n3;
                block1: {
                    block2: {
                        int n4;
                        block3: {
                            n4 = keyEvent.getAction();
                            if (n4 != 0) break block0;
                            n4 = keyEvent.getKeyCode();
                            int n7 = 21;
                            n3 = 2;
                            if (n4 == n7) break block1;
                            n7 = 22;
                            if (n4 == n7) break block2;
                            n7 = 61;
                            if (n4 != n7) break block0;
                            n4 = (int)(keyEvent.hasNoModifiers() ? 1 : 0);
                            if (n4 == 0) break block3;
                            bl2 = this.arrowScroll(n3);
                            break block4;
                        }
                        n4 = 1;
                        bl2 = keyEvent.hasModifiers(n4);
                        if (!bl2) break block0;
                        bl2 = this.arrowScroll(n4);
                        break block4;
                    }
                    bl2 = keyEvent.hasModifiers(n3);
                    bl2 = bl2 ? this.pageRight() : this.arrowScroll(66);
                    break block4;
                }
                bl2 = keyEvent.hasModifiers(n3);
                bl2 = bl2 ? this.pageLeft() : this.arrowScroll(17);
                break block4;
            }
            bl2 = false;
            keyEvent = null;
        }
        return bl2;
    }

    public void fakeDragBy(float f5) {
        int n3 = this.mFakeDragging;
        if (n3 != 0) {
            Uk2 uk2;
            int n4;
            float f6;
            Uk2 uk22 = this.mAdapter;
            if (uk22 == null) {
                return;
            }
            this.mLastMotionX = f6 = this.mLastMotionX + f5;
            n3 = this.getScrollX();
            f6 = (float)n3 - f5;
            int n7 = this.getClientWidth();
            f5 = n7;
            float f7 = this.mFirstOffset * f5;
            float f8 = this.mLastOffset * f5;
            ViewPager$e viewPager$e = (ViewPager$e)this.mItems.get(0);
            Object object = this.mItems;
            int n8 = 1;
            object = (ViewPager$e)pp_0.a(n8, (ArrayList)object);
            int n10 = viewPager$e.b;
            if (n10 != 0) {
                f7 = viewPager$e.e * f5;
            }
            if ((n4 = ((ViewPager$e)object).b) != (n10 = (uk2 = this.mAdapter).c() - n8)) {
                f8 = ((ViewPager$e)object).e * f5;
            }
            if ((n7 = (int)(f6 == f7 ? 0 : (f6 < f7 ? -1 : 1))) < 0) {
                f6 = f7;
            } else {
                n7 = (int)(f6 == f8 ? 0 : (f6 > f8 ? 1 : -1));
                if (n7 > 0) {
                    f6 = f8;
                }
            }
            f5 = this.mLastMotionX;
            int n14 = (int)f6;
            f8 = n14;
            this.mLastMotionX = f6 = f6 - f8 + f5;
            n7 = this.getScrollY();
            this.scrollTo(n14, n7);
            this.pageScrolled(n14);
            long l2 = SystemClock.uptimeMillis();
            long l3 = this.mFakeDragBeginTime;
            float f11 = this.mLastMotionX;
            MotionEvent motionEvent = MotionEvent.obtain((long)l3, (long)l2, (int)2, (float)f11, (float)0.0f, (int)0);
            this.mVelocityTracker.addMovement(motionEvent);
            motionEvent.recycle();
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        throw illegalStateException;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ViewPager$LayoutParams viewPager$LayoutParams = new ViewPager$LayoutParams();
        return viewPager$LayoutParams;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = this.getContext();
        ViewPager$LayoutParams viewPager$LayoutParams = new ViewPager$LayoutParams(context, attributeSet);
        return viewPager$LayoutParams;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return this.generateDefaultLayoutParams();
    }

    public Uk2 getAdapter() {
        return this.mAdapter;
    }

    public int getChildDrawingOrder(int n3, int n4) {
        int n7 = this.mDrawingOrder;
        int n8 = 2;
        if (n7 == n8) {
            n4 = (n3 += -1) - n4;
        }
        return ((ViewPager$LayoutParams)((View)this.mDrawingOrderedChildren.get((int)n4)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public ViewPager$e infoForAnyChild(View view) {
        ViewParent viewParent;
        while ((viewParent = view.getParent()) != this) {
            boolean bl2;
            if (viewParent != null && (bl2 = viewParent instanceof View)) {
                view = viewParent;
                view = (View)viewParent;
                continue;
            }
            return null;
        }
        return this.infoForChild(view);
    }

    public ViewPager$e infoForChild(View view) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.mItems)).size()); ++i3) {
            object = (ViewPager$e)this.mItems.get(i3);
            Uk2 uk2 = this.mAdapter;
            Object object2 = ((ViewPager$e)object).a;
            boolean bl2 = uk2.g(view, object2);
            if (!bl2) continue;
            return object;
        }
        return null;
    }

    public ViewPager$e infoForPosition(int n3) {
        Object object;
        int n4;
        for (int i3 = 0; i3 < (n4 = ((ArrayList)(object = this.mItems)).size()); ++i3) {
            object = (ViewPager$e)this.mItems.get(i3);
            int n7 = ((ViewPager$e)object).b;
            if (n7 != n3) continue;
            return object;
        }
        return null;
    }

    public void initViewPager() {
        int n3;
        int n4;
        int n7;
        Scroller scroller;
        ViewPager$c viewPager$c = null;
        this.setWillNotDraw(false);
        this.setDescendantFocusability(262144);
        int n8 = 1;
        this.setFocusable(n8 != 0);
        Object object = this.getContext();
        Interpolator interpolator2 = sInterpolator;
        this.mScroller = scroller = new Scroller(object, interpolator2);
        scroller = ViewConfiguration.get((Context)object);
        interpolator2 = object.getResources().getDisplayMetrics();
        float f5 = interpolator2.density;
        this.mTouchSlop = n7 = scroller.getScaledPagingTouchSlop();
        float f6 = 400.0f * f5;
        this.mMinimumVelocity = n7 = (int)f6;
        this.mMaximumVelocity = n4 = scroller.getScaledMaximumFlingVelocity();
        scroller = new EdgeEffect(object);
        this.mLeftEdge = scroller;
        scroller = new EdgeEffect(object);
        this.mRightEdge = scroller;
        this.mFlingDistance = n3 = (int)(25.0f * f5);
        this.mCloseEnough = n3 = (int)(2.0f * f5);
        float f7 = 16.0f;
        this.mDefaultGutterSize = n3 = (int)(f5 *= f7);
        object = new ViewPager$f(this);
        ViewCompat.s((View)this, (a)object);
        n3 = this.getImportantForAccessibility();
        if (n3 == 0) {
            this.setImportantForAccessibility(n8);
        }
        viewPager$c = new ViewPager$c(this);
        ViewCompat$c.o((View)this, viewPager$c);
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    public void onDetachedFromWindow() {
        boolean bl2;
        Runnable runnable2 = this.mEndScrollRunnable;
        this.removeCallbacks(runnable2);
        runnable2 = this.mScroller;
        if (runnable2 != null && !(bl2 = runnable2.isFinished())) {
            runnable2 = this.mScroller;
            runnable2.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        Object object;
        ViewPager viewPager = this;
        super.onDraw(canvas);
        int n3 = this.mPageMargin;
        if (n3 > 0 && (object = this.mMarginDrawable) != null && (n3 = ((ArrayList)(object = this.mItems)).size()) > 0 && (object = this.mAdapter) != null) {
            n3 = this.getScrollX();
            int n4 = this.getWidth();
            int n7 = this.mPageMargin;
            float f5 = n7;
            float f6 = n4;
            f5 /= f6;
            Object object2 = this.mItems;
            int n8 = 0;
            object2 = (ViewPager$e)((ArrayList)object2).get(0);
            float f7 = ((ViewPager$e)object2).e;
            ArrayList arrayList = this.mItems;
            int n10 = arrayList.size();
            Object object3 = this.mItems;
            int n14 = n10 + -1;
            object3 = (ViewPager$e)((ArrayList)object3).get(n14);
            int n15 = ((ViewPager$e)object3).b;
            for (int i3 = ((ViewPager$e)object2).b; i3 < n15; ++i3) {
                float f8;
                Uk2 uk2;
                float f11;
                float f12;
                while (i3 > (n14 = ((ViewPager$e)object2).b) && n8 < n10) {
                    object2 = viewPager.mItems;
                    object2 = (ViewPager$e)((ArrayList)object2).get(++n8);
                }
                if (i3 == n14) {
                    f7 = ((ViewPager$e)object2).e;
                    f12 = ((ViewPager$e)object2).d;
                    f11 = (f7 + f12) * f6;
                    f7 = f7 + f12 + f5;
                } else {
                    uk2 = viewPager.mAdapter;
                    uk2.getClass();
                    n14 = 1065353216;
                    f12 = 1.0f;
                    f11 = (f7 + f12) * f6;
                    f7 = f12 = f12 + f5 + f7;
                }
                f12 = (float)viewPager.mPageMargin + f11;
                float f14 = n3;
                n14 = (int)(f12 == f14 ? 0 : (f12 > f14 ? 1 : -1));
                if (n14 > 0) {
                    uk2 = viewPager.mMarginDrawable;
                    int n16 = Math.round(f11);
                    int n17 = viewPager.mTopPageBounds;
                    float f15 = (float)viewPager.mPageMargin + f11;
                    int n18 = Math.round(f15);
                    f8 = f5;
                    n7 = viewPager.mBottomPageBounds;
                    uk2.setBounds(n16, n17, n18, n7);
                    Drawable drawable2 = viewPager.mMarginDrawable;
                    uk2 = canvas;
                    drawable2.draw(canvas);
                } else {
                    uk2 = canvas;
                    f8 = f5;
                }
                f5 = n3 + n4;
                n7 = (int)(f11 == f5 ? 0 : (f11 > f5 ? 1 : -1));
                if (n7 > 0) break;
                f5 = f8;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean onInterceptTouchEvent(MotionEvent var1_1) {
        block16: {
            block18: {
                block17: {
                    var2_2 = this;
                    var3_3 = var1_1;
                    var4_4 = var1_1.getAction() & 255;
                    var5_5 = 3;
                    var6_6 = 4.2E-45f;
                    if (var4_4 == var5_5 || var4_4 == (var7_7 = 1)) break block16;
                    if (var4_4 != 0) {
                        var5_5 = (int)this.mIsBeingDragged;
                        if (var5_5 != 0) {
                            return (boolean)var7_7;
                        }
                        var5_5 = this.mIsUnableToDrag;
                        if (var5_5 != 0) {
                            return false;
                        }
                    }
                    var5_5 = 2;
                    var6_6 = 2.8E-45f;
                    if (var4_4 == 0) break block17;
                    if (var4_4 != var5_5) {
                        var5_5 = 6;
                        var6_6 = 8.4E-45f;
                        if (var4_4 == var5_5) {
                            this.onSecondaryPointerUp(var1_1);
                        }
                    } else {
                        var4_4 = var2_2.mActivePointerId;
                        var5_5 = -1;
                        var6_6 = 0.0f / 0.0f;
                        if (var4_4 != var5_5) {
                            var4_4 = var3_3.findPointerIndex(var4_4);
                            var8_8 = var3_3.getX(var4_4);
                            var6_6 = var2_2.mLastMotionX;
                            var6_6 = var8_8 - var6_6;
                            var9_9 = Math.abs(var6_6);
                            var10_10 = var3_3.getY(var4_4);
                            var11_11 = var2_2.mInitialMotionY;
                            var12_13 = Math.abs(var10_10 - var11_11);
                            var4_4 = 0;
                            var11_11 = 0.0f;
                            var13_14 /* !! */  = null;
                            cfr_temp_0 = var6_6 - 0.0f;
                            var14_15 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                            if (var14_15 /* !! */  != false && (var4_4 = (int)this.isGutterDrag(var11_11 = var2_2.mLastMotionX, var6_6)) == 0) {
                                var15_16 = (int)var6_6;
                                var16_17 = (int)var8_8;
                                var17_18 = (int)var10_10;
                                var13_14 /* !! */  = this;
                                var18_19 = this;
                                var4_4 = this.canScroll((View)this, false, var15_16, var16_17, var17_18);
                                if (var4_4 != 0) {
                                    var2_2.mLastMotionX = var8_8;
                                    var2_2.mLastMotionY = var10_10;
                                    var2_2.mIsUnableToDrag = var7_7;
                                    return false;
                                }
                            }
                            if ((var5_5 = (int)((cfr_temp_1 = var9_9 - (var6_6 = (float)(var4_4 = var2_2.mTouchSlop))) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) > 0 && (var5_5 = (int)((cfr_temp_2 = (var9_9 *= (var6_6 = 0.5f)) - var12_13) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1))) > 0) {
                                var2_2.mIsBeingDragged = var7_7;
                                this.requestParentDisallowInterceptTouchEvent((boolean)var7_7);
                                this.setScrollState(var7_7);
                                var11_11 = var2_2.mInitialMotionX;
                                var5_5 = var2_2.mTouchSlop;
                                var6_6 = var5_5;
                                var11_11 = var14_15 /* !! */  > 0 ? (var11_11 += var6_6) : (var11_11 -= var6_6);
                                var2_2.mLastMotionX = var11_11;
                                var2_2.mLastMotionY = var10_10;
                                this.setScrollingCacheEnabled((boolean)var7_7);
                            } else {
                                var11_11 = var4_4;
                                cfr_temp_3 = var12_13 - var11_11;
                                if ((var4_4 = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1))) > 0) {
                                    var2_2.mIsUnableToDrag = var7_7;
                                }
                            }
                            var4_4 = (int)var2_2.mIsBeingDragged;
                            if (var4_4 != 0 && (var4_4 = this.performDrag(var8_8)) != 0) {
                                var13_14 /* !! */  = ViewCompat.a;
                                this.postInvalidateOnAnimation();
                            }
                        }
                    }
                    break block18;
                }
                var2_2.mInitialMotionX = var11_12 = var1_1.getX();
                var2_2.mLastMotionX = var11_12;
                var2_2.mInitialMotionY = var11_12 = var1_1.getY();
                var2_2.mLastMotionY = var11_12;
                var2_2.mActivePointerId = var4_4 = var3_3.getPointerId(0);
                var2_2.mIsUnableToDrag = false;
                var2_2.mIsScrollStarted = var7_7;
                var13_14 /* !! */  = var2_2.mScroller;
                var13_14 /* !! */ .computeScrollOffset();
                var4_4 = var2_2.mScrollState;
                if (var4_4 != var5_5) ** GOTO lbl-1000
                var13_14 /* !! */  = var2_2.mScroller;
                var4_4 = var13_14 /* !! */ .getFinalX();
                var18_20 = var2_2.mScroller;
                var5_5 = var18_20.getCurrX();
                if ((var4_4 = Math.abs(var4_4 - var5_5)) > (var5_5 = var2_2.mCloseEnough)) {
                    var13_14 /* !! */  = var2_2.mScroller;
                    var13_14 /* !! */ .abortAnimation();
                    var2_2.mPopulatePending = false;
                    this.populate();
                    var2_2.mIsBeingDragged = var7_7;
                    this.requestParentDisallowInterceptTouchEvent((boolean)var7_7);
                    this.setScrollState(var7_7);
                } else lbl-1000:
                // 2 sources

                {
                    this.completeScroll(false);
                    var2_2.mIsBeingDragged = false;
                }
            }
            var13_14 /* !! */  = var2_2.mVelocityTracker;
            if (var13_14 /* !! */  == null) {
                var2_2.mVelocityTracker = var13_14 /* !! */  = VelocityTracker.obtain();
            }
            var2_2.mVelocityTracker.addMovement(var3_3);
            return var2_2.mIsBeingDragged;
        }
        this.resetTouch();
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        int n10;
        int n14;
        int n15;
        ViewPager viewPager = this;
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
        ViewPager$e viewPager$e = null;
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
                                                        view = viewPager.getChildAt(n25);
                                                        n14 = view.getVisibility();
                                                        if (n14 == n15) break block5;
                                                        ViewPager$LayoutParams viewPager$LayoutParams = (ViewPager$LayoutParams)view.getLayoutParams();
                                                        n14 = (int)(viewPager$LayoutParams.a ? 1 : 0);
                                                        if (n14 == 0) break block5;
                                                        n15 = viewPager$LayoutParams.b;
                                                        n14 = n15 & 7;
                                                        n15 &= 0x70;
                                                        n27 = 1;
                                                        if (n14 == n27) break block6;
                                                        n27 = 3;
                                                        if (n14 == n27) break block7;
                                                        n27 = 5;
                                                        if (n14 == n27) break block8;
                                                        n14 = n19;
                                                        break block9;
                                                    }
                                                    n14 = n17 - n21;
                                                    n27 = view.getMeasuredWidth();
                                                    n14 -= n27;
                                                    n27 = view.getMeasuredWidth();
                                                    n21 += n27;
                                                    break block10;
                                                }
                                                n14 = view.getMeasuredWidth() + n19;
                                                break block9;
                                            }
                                            n14 = view.getMeasuredWidth();
                                            n14 = Math.max((n17 - n14) / 2, n19);
                                        }
                                        n28 = n14;
                                        n14 = n19;
                                        n19 = n28;
                                    }
                                    n27 = 16;
                                    if (n15 == n27) break block11;
                                    n27 = 48;
                                    if (n15 == n27) break block12;
                                    n27 = 80;
                                    if (n15 == n27) break block13;
                                    n15 = n20;
                                    break block14;
                                }
                                n15 = n18 - n22;
                                n27 = view.getMeasuredHeight();
                                n15 -= n27;
                                n27 = view.getMeasuredHeight();
                                n22 += n27;
                                break block15;
                            }
                            n15 = view.getMeasuredHeight() + n20;
                            break block14;
                        }
                        n15 = view.getMeasuredHeight();
                        n15 = Math.max((n18 - n15) / 2, n20);
                    }
                    n28 = n15;
                    n15 = n20;
                    n20 = n28;
                }
                n27 = view.getMeasuredWidth() + (n19 += n24);
                int n29 = view.getMeasuredHeight();
                n10 = n29 + n20;
                view.layout(n19, n20, n27, n10);
                ++n26;
                n20 = n15;
                n19 = n14;
            }
            ++n25;
        }
        n17 = n17 - n19 - n21;
        for (n21 = 0; n21 < n16; ++n21) {
            int n30;
            View view = viewPager.getChildAt(n21);
            n10 = view.getVisibility();
            if (n10 == n15) continue;
            ViewPager$LayoutParams viewPager$LayoutParams = (ViewPager$LayoutParams)view.getLayoutParams();
            n25 = (int)(viewPager$LayoutParams.a ? 1 : 0);
            if (n25 != 0 || (viewPager$e = viewPager.infoForChild(view)) == null) continue;
            float f6 = n17;
            f5 = viewPager$e.e * f6;
            n25 = (int)f5 + n19;
            n14 = (int)(viewPager$LayoutParams.d ? 1 : 0);
            if (n14 != 0) {
                viewPager$LayoutParams.d = false;
                float f7 = viewPager$LayoutParams.c;
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
        viewPager.mTopPageBounds = n20;
        viewPager.mBottomPageBounds = n18 -= n22;
        viewPager.mDecorChildCount = n26;
        n16 = (int)(viewPager.mFirstLayout ? 1 : 0);
        if (n16 != 0) {
            n16 = viewPager.mCurItem;
            n17 = 0;
            viewPager.scrollToItem(n16, false, 0, false);
        } else {
            n17 = 0;
        }
        viewPager.mFirstLayout = false;
    }

    /*
     * Unable to fully structure code
     */
    public void onMeasure(int var1_1, int var2_2) {
        var3_3 = 0;
        var1_1 = View.getDefaultSize((int)0, (int)var1_1);
        var2_2 = View.getDefaultSize((int)0, (int)var2_2);
        this.setMeasuredDimension(var1_1, var2_2);
        var1_1 = this.getMeasuredWidth();
        var2_2 = var1_1 / 10;
        var4_4 = this.mDefaultGutterSize;
        this.mGutterSize = var2_2 = Math.min(var2_2, var4_4);
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
                if (var13_13 == var8_8 || (var14_14 = (ViewPager$LayoutParams)var12_12.getLayoutParams()) == null || (var13_13 = (int)var14_14.a) == 0) break block16;
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
        this.mChildWidthMeasureSpec = var4_4 = View.MeasureSpec.makeMeasureSpec((int)var1_1, (int)var11_11);
        this.mChildHeightMeasureSpec = var2_2 = View.MeasureSpec.makeMeasureSpec((int)var2_2, (int)var11_11);
        this.mInLayout = var9_9;
        this.populate();
        this.mInLayout = false;
        var2_2 = this.getChildCount();
        while (var3_3 < var2_2) {
            var20_20 = this.getChildAt(var3_3);
            var5_5 = var20_20.getVisibility();
            if (var5_5 != var8_8 && ((var7_7 = (ViewPager$LayoutParams)var20_20.getLayoutParams()) == null || (var9_9 = var7_7.a) == 0)) {
                var10_10 = var1_1;
                var6_6 = var7_7.c;
                var5_5 = View.MeasureSpec.makeMeasureSpec((int)((int)(var10_10 *= var6_6)), (int)var11_11);
                var9_9 = this.mChildHeightMeasureSpec;
                var20_20.measure(var5_5, var9_9);
            }
            ++var3_3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onPageScrolled(int n3, float f5, int n4) {
        int n7;
        block2: {
            int n8 = this.mDecorChildCount;
            n7 = 1;
            if (n8 <= 0) break block2;
            n8 = this.getScrollX();
            int n10 = this.getPaddingLeft();
            int n14 = this.getPaddingRight();
            int n15 = this.getWidth();
            int n16 = this.getChildCount();
            for (int i3 = 0; i3 < n16; ++i3) {
                int n17;
                int n18;
                View view;
                block6: {
                    block7: {
                        block3: {
                            block4: {
                                block5: {
                                    view = this.getChildAt(i3);
                                    ViewPager$LayoutParams viewPager$LayoutParams = (ViewPager$LayoutParams)view.getLayoutParams();
                                    n18 = viewPager$LayoutParams.a;
                                    if (n18 == 0) continue;
                                    n17 = viewPager$LayoutParams.b & 7;
                                    if (n17 == n7) break block3;
                                    n18 = 3;
                                    if (n17 == n18) break block4;
                                    n18 = 5;
                                    if (n17 == n18) break block5;
                                    n17 = n10;
                                    break block6;
                                }
                                n17 = n15 - n14;
                                n18 = view.getMeasuredWidth();
                                n17 -= n18;
                                n18 = view.getMeasuredWidth();
                                n14 += n18;
                                break block7;
                            }
                            n17 = view.getWidth() + n10;
                            break block6;
                        }
                        n17 = view.getMeasuredWidth();
                        n17 = Math.max((n15 - n17) / 2, n10);
                    }
                    int n19 = n17;
                    n17 = n10;
                    n10 = n19;
                }
                n10 += n8;
                n18 = view.getLeft();
                if ((n10 -= n18) != 0) {
                    view.offsetLeftAndRight(n10);
                }
                n10 = n17;
            }
        }
        this.dispatchOnPageScrolled(n3, f5, n4);
        this.mCalledSuper = n7;
    }

    public boolean onRequestFocusInDescendants(int n3, Rect rect) {
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
            ViewPager$e viewPager$e;
            View view = this.getChildAt(n7);
            int n14 = view.getVisibility();
            if (n14 == 0 && (viewPager$e = this.infoForChild(view)) != null && (n14 = viewPager$e.b) == (n10 = this.mCurItem) && (bl3 = view.requestFocus(n3, rect))) {
                return bl2;
            }
            n7 += n4;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        int n3 = parcelable instanceof ViewPager$SavedState;
        if (n3 == 0) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (ViewPager$SavedState)parcelable;
        Object object = parcelable.getSuperState();
        super.onRestoreInstanceState((Parcelable)object);
        object = this.mAdapter;
        ClassLoader classLoader = parcelable.c;
        if (object != null) {
            Parcelable parcelable2 = parcelable.b;
            ((Uk2)object).i(parcelable2, classLoader);
            int n4 = parcelable.a;
            n3 = 0;
            object = null;
            boolean bl2 = true;
            this.setCurrentItemInternal(n4, false, bl2);
        } else {
            this.mRestoredCurItem = n3 = parcelable.a;
            this.mRestoredAdapterState = parcelable = parcelable.b;
            this.mRestoredClassLoader = classLoader;
        }
    }

    public Parcelable onSaveInstanceState() {
        int n3;
        Object object = super.onSaveInstanceState();
        ViewPager$SavedState viewPager$SavedState = new AbsSavedState((Parcelable)object);
        viewPager$SavedState.a = n3 = this.mCurItem;
        object = this.mAdapter;
        if (object != null) {
            object = ((Uk2)object).j();
            viewPager$SavedState.b = object;
        }
        return viewPager$SavedState;
    }

    public void onSizeChanged(int n3, int n4, int n7, int n8) {
        super.onSizeChanged(n3, n4, n7, n8);
        if (n3 != n7) {
            n4 = this.mPageMargin;
            this.recomputeScrollPosition(n3, n7, n4, n4);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean onTouchEvent(MotionEvent var1_1) {
        block18: {
            block22: {
                block19: {
                    block20: {
                        block21: {
                            var2_2 = this.mFakeDragging;
                            var3_3 = true;
                            if (var2_2) {
                                return var3_3;
                            }
                            var2_2 = var1_1 /* !! */ .getAction();
                            var4_4 = 0;
                            var5_5 = 0.0f;
                            if (!var2_2 && (var2_2 = var1_1 /* !! */ .getEdgeFlags())) {
                                return false;
                            }
                            var6_6 = this.mAdapter;
                            if (var6_6 == null || !(var2_2 = var6_6.c())) break block18;
                            var6_6 = this.mVelocityTracker;
                            if (var6_6 == null) {
                                var6_6 = VelocityTracker.obtain();
                                this.mVelocityTracker = var6_6;
                            }
                            var6_6 = this.mVelocityTracker;
                            var6_6.addMovement(var1_1 /* !! */ );
                            var2_2 = var1_1 /* !! */ .getAction() & 255;
                            if (!var2_2) break block19;
                            if (var2_2 == var3_3) break block20;
                            var7_7 = 2 != 0;
                            var8_9 = 2.8E-45f;
                            if (var2_2 == var7_7) break block21;
                            var7_7 = 3 != 0;
                            var8_9 = 4.2E-45f;
                            if (var2_2 != var7_7) {
                                var7_7 = 5 != 0;
                                var8_9 = 7.0E-45f;
                                if (var2_2 != var7_7) {
                                    var7_7 = 6 != 0;
                                    var8_9 = 8.4E-45f;
                                    if (var2_2 == var7_7) {
                                        this.onSecondaryPointerUp(var1_1 /* !! */ );
                                        var2_2 = this.mActivePointerId;
                                        var2_2 = var1_1 /* !! */ .findPointerIndex((int)var2_2);
                                        this.mLastMotionX = var9_11 = var1_1 /* !! */ .getX((int)var2_2);
                                    }
                                } else {
                                    var2_2 = var1_1 /* !! */ .getActionIndex();
                                    this.mLastMotionX = var8_9 = var1_1 /* !! */ .getX((int)var2_2);
                                    this.mActivePointerId = var10_14 = var1_1 /* !! */ .getPointerId((int)var2_2);
                                }
                            } else {
                                var10_15 = this.mIsBeingDragged;
                                if (var10_15 != 0) {
                                    var10_15 = this.mCurItem;
                                    this.scrollToItem(var10_15, var3_3, 0, false);
                                    var4_4 = (int)this.resetTouch();
                                }
                            }
                            break block22;
                        }
                        var2_2 = this.mIsBeingDragged;
                        if (var2_2) ** GOTO lbl90
                        var2_2 = this.mActivePointerId;
                        var2_2 = var1_1 /* !! */ .findPointerIndex((int)var2_2);
                        var7_7 = -1 != 0;
                        var8_9 = 0.0f / 0.0f;
                        if (var2_2 == var7_7) {
                            var4_4 = (int)this.resetTouch();
                        } else {
                            var8_9 = var1_1 /* !! */ .getX((int)var2_2);
                            var11_18 = this.mLastMotionX;
                            var11_18 = Math.abs(var8_9 - var11_18);
                            var12_19 = var1_1 /* !! */ .getY((int)var2_2);
                            var13_22 = this.mLastMotionY;
                            var13_22 = Math.abs(var12_19 - var13_22);
                            var14_24 = this.mTouchSlop;
                            cfr_temp_0 = var11_18 - var14_24;
                            var15_25 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                            if (var15_25 /* !! */  > 0 && (var16_27 = var11_18 == var13_22 ? 0 : (var11_18 > var13_22 ? 1 : -1)) > 0) {
                                this.mIsBeingDragged = var3_3;
                                this.requestParentDisallowInterceptTouchEvent(var3_3);
                                var11_18 = this.mInitialMotionX;
                                var17_28 = false;
                                var13_22 = 0.0f;
                                cfr_temp_1 = (var8_9 -= var11_18) - 0.0f;
                                var7_7 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                if (var7_7 > false) {
                                    var7_7 = this.mTouchSlop;
                                    var8_9 = (float)var7_7;
                                    var11_18 += var8_9;
                                } else {
                                    var7_7 = this.mTouchSlop;
                                    var8_9 = (float)var7_7;
                                    var11_18 -= var8_9;
                                }
                                this.mLastMotionX = var11_18;
                                this.mLastMotionY = var12_19;
                                this.setScrollState((int)var3_3);
                                this.setScrollingCacheEnabled(var3_3);
                                var6_6 = this.getParent();
                                if (var6_6 != null) {
                                    var6_6.requestDisallowInterceptTouchEvent(var3_3);
                                }
                            }
lbl90:
                            // 6 sources

                            if (var2_2 = (boolean)this.mIsBeingDragged) {
                                var2_2 = this.mActivePointerId;
                                var2_2 = var1_1 /* !! */ .findPointerIndex((int)var2_2);
                                var9_12 = var1_1 /* !! */ .getX((int)var2_2);
                                var4_4 = (int)this.performDrag(var9_12);
                            }
                        }
                        break block22;
                    }
                    var2_2 = this.mIsBeingDragged;
                    if (var2_2) {
                        var6_6 = this.mVelocityTracker;
                        var5_5 = this.mMaximumVelocity;
                        var6_6.computeCurrentVelocity(1000, var5_5);
                        var4_4 = this.mActivePointerId;
                        var12_20 = var6_6.getXVelocity(var4_4);
                        var2_2 = (int)var12_20;
                        this.mPopulatePending = var3_3;
                        var4_4 = this.getClientWidth();
                        var7_8 = this.getScrollX();
                        var18_30 = this.infoForCurrentScrollPosition();
                        var17_29 = this.mPageMargin;
                        var13_23 = var17_29;
                        var5_5 = var4_4;
                        var13_23 /= var5_5;
                        var15_26 = var18_30.b;
                        var8_10 = (float)var7_8 / var5_5;
                        var5_5 = var18_30.e;
                        var8_10 -= var5_5;
                        var5_5 = var18_30.d + var13_23;
                        var8_10 /= var5_5;
                        var4_4 = this.mActivePointerId;
                        var4_4 = var1_1 /* !! */ .findPointerIndex(var4_4);
                        var9_13 = var1_1 /* !! */ .getX(var4_4);
                        var5_5 = this.mInitialMotionX;
                        var10_16 = (int)(var9_13 -= var5_5);
                        var10_16 = this.determineTargetPage(var15_26, var8_10, (int)var2_2, var10_16);
                        this.setCurrentItemInternal(var10_16, var3_3, var3_3, (int)var2_2);
                        var4_4 = (int)this.resetTouch();
                    }
                    break block22;
                }
                var6_6 = this.mScroller;
                var6_6.abortAnimation();
                this.mPopulatePending = false;
                this.populate();
                this.mInitialMotionX = var12_21 = var1_1 /* !! */ .getX();
                this.mLastMotionX = var12_21;
                this.mInitialMotionY = var12_21 = var1_1 /* !! */ .getY();
                this.mLastMotionY = var12_21;
                this.mActivePointerId = var10_17 = var1_1 /* !! */ .getPointerId(0);
            }
            if (var4_4 != 0) {
                var1_1 /* !! */  = ViewCompat.a;
                this.postInvalidateOnAnimation();
            }
            return var3_3;
        }
        return false;
    }

    public boolean pageLeft() {
        int n3 = this.mCurItem;
        if (n3 > 0) {
            int n4 = 1;
            this.setCurrentItem(n3 -= n4, n4 != 0);
            return n4 != 0;
        }
        return false;
    }

    public boolean pageRight() {
        Uk2 uk2 = this.mAdapter;
        if (uk2 != null) {
            int n3 = this.mCurItem;
            int n4 = uk2.c();
            int n7 = 1;
            if (n3 < (n4 -= n7)) {
                n4 = this.mCurItem + n7;
                this.setCurrentItem(n4, n7 != 0);
                return n7 != 0;
            }
        }
        return false;
    }

    public void populate() {
        int n3 = this.mCurItem;
        this.populate(n3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void populate(int var1_1) {
        block34: {
            block35: {
                block39: {
                    block32: {
                        var2_2 = this;
                        var3_3 = var1_1;
                        var4_4 = this.mCurItem;
                        if (var4_4 != var1_1) {
                            var5_5 = this.infoForPosition(var4_4);
                            this.mCurItem = var1_1;
                        } else {
                            var4_4 = 0;
                            var5_5 = null;
                        }
                        var6_6 = var2_2.mAdapter;
                        if (var6_6 == null) {
                            this.sortChildDrawingOrder();
                            return;
                        }
                        var3_3 = (int)var2_2.mPopulatePending;
                        if (var3_3 != 0) {
                            this.sortChildDrawingOrder();
                            return;
                        }
                        var6_6 = this.getWindowToken();
                        if (var6_6 == null) {
                            return;
                        }
                        var6_6 = var2_2.mAdapter;
                        var6_6.m(var2_2);
                        var3_3 = var2_2.mOffscreenPageLimit;
                        var7_7 = var2_2.mCurItem - var3_3;
                        var8_8 = 0;
                        var9_9 = 0.0f;
                        var10_10 = null;
                        var7_7 = Math.max(0, var7_7);
                        var11_11 = var2_2.mAdapter;
                        var12_12 = var11_11.c();
                        var13_13 = var12_12 + -1;
                        var14_14 = var2_2.mCurItem + var3_3;
                        var3_3 = Math.min(var13_13, var14_14);
                        var13_13 = var2_2.mExpectedAdapterCount;
                        if (var12_12 != var13_13) break block34;
                        for (var13_13 = 0; var13_13 < (var14_14 = (var15_15 = var2_2.mItems).size()); ++var13_13) {
                            var15_15 = (ViewPager$e)var2_2.mItems.get(var13_13);
                            var16_16 = var15_15.b;
                            var17_17 = var2_2.mCurItem;
                            if (var16_16 < var17_17) continue;
                            if (var16_16 != var17_17) break;
                            break block32;
                        }
                        var14_14 = 0;
                        var15_15 = null;
                    }
                    if (var15_15 == null && var12_12 > 0) {
                        var14_14 = var2_2.mCurItem;
                        var15_15 = var2_2.addNewItem(var14_14, var13_13);
                    }
                    var16_16 = 0;
                    if (var15_15 == null) break block35;
                    var17_17 = var13_13 + -1;
                    if (var17_17 >= 0) {
                        var18_18 = (ViewPager$e)var2_2.mItems.get(var17_17);
                    } else {
                        var19_19 = 0;
                        var20_20 = 0.0f;
                        var18_18 = null;
                    }
                    var21_21 = this.getClientWidth();
                    var22_22 = 2.0f;
                    if (var21_21 <= 0) {
                        var23_23 = 0;
                        var24_24 = 0.0f;
                    } else {
                        var25_25 = var15_15.d;
                        var25_25 = var22_22 - var25_25;
                        var23_23 = this.getPaddingLeft();
                        var24_24 = var23_23;
                        var26_26 = var21_21;
                        var24_24 = var24_24 / var26_26 + var25_25;
                    }
                    var25_25 = 0.0f;
                    for (var27_27 = var2_2.mCurItem + -1; var27_27 >= 0; var27_27 += -1) {
                        block33: {
                            block38: {
                                block36: {
                                    block37: {
                                        var28_28 /* !! */  = (float)(var25_25 == var24_24 ? 0 : (var25_25 > var24_24 ? 1 : -1));
                                        if (var28_28 /* !! */  < 0 || var27_27 >= var7_7) break block36;
                                        if (var18_18 == null) break;
                                        var8_8 = var18_18.b;
                                        if (var27_27 != var8_8 || (var8_8 = (int)var18_18.c) != 0) break block33;
                                        var2_2.mItems.remove(var17_17);
                                        var10_10 = var2_2.mAdapter;
                                        var18_18 = var18_18.a;
                                        var10_10.a(var2_2, var27_27, var18_18);
                                        var13_13 += -1;
                                        if ((var17_17 += -1) < 0) break block37;
                                        var10_10 = (ViewPager$e)var2_2.mItems.get(var17_17);
                                        ** GOTO lbl91
                                    }
lbl87:
                                    // 3 sources

                                    while (true) {
                                        var8_8 = 0;
                                        var9_9 = 0.0f;
                                        var10_10 = null;
lbl91:
                                        // 4 sources

                                        while (true) {
                                            var18_18 = var10_10;
                                            break block33;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                if (var18_18 == null || var27_27 != (var8_8 = var18_18.b)) break block38;
                                var9_9 = var18_18.d;
                                var25_25 += var9_9;
                                if ((var17_17 += -1) < 0) ** GOTO lbl87
                                var10_10 = (ViewPager$e)var2_2.mItems.get(var17_17);
                                ** GOTO lbl91
                            }
                            var8_8 = var17_17 + 1;
                            var10_10 = var2_2.addNewItem(var27_27, var8_8);
                            var9_9 = var10_10.d;
                            var25_25 += var9_9;
                            ++var13_13;
                            if (var17_17 >= 0) ** break;
                            ** continue;
                            var10_10 = (ViewPager$e)var2_2.mItems.get(var17_17);
                            ** continue;
                        }
                        var8_8 = 0;
                        var9_9 = 0.0f;
                        var10_10 = null;
                    }
                    var26_26 = var15_15.d;
                    var7_7 = var13_13 + 1;
                    var8_8 = (int)(var26_26 == var22_22 ? 0 : (var26_26 < var22_22 ? -1 : 1));
                    if (var8_8 >= 0) break block39;
                    var10_10 = var2_2.mItems;
                    var8_8 = var10_10.size();
                    if (var7_7 < var8_8) {
                        var10_10 = (ViewPager$e)var2_2.mItems.get(var7_7);
                    } else {
                        var8_8 = 0;
                        var9_9 = 0.0f;
                        var10_10 = null;
                    }
                    if (var21_21 <= 0) {
                        var17_17 = 0;
                        var29_29 = 0.0f;
                    } else {
                        var17_17 = this.getPaddingRight();
                        var29_29 = var17_17;
                        var20_20 = var21_21;
                        var29_29 = var29_29 / var20_20 + var22_22;
                    }
                    var19_19 = var2_2.mCurItem;
                    block8: while (++var19_19 < var12_12) {
                        block40: {
                            var21_21 = (int)(var26_26 == var29_29 ? 0 : (var26_26 > var29_29 ? 1 : -1));
                            if (var21_21 >= 0 && var19_19 > var3_3) {
                                if (var10_10 == null) break;
                                var21_21 = var10_10.b;
                                if (var19_19 != var21_21 || (var21_21 = (int)var10_10.c) != 0) continue;
                                var2_2.mItems.remove(var7_7);
                                var30_30 = var2_2.mAdapter;
                                var10_10 = var10_10.a;
                                var30_30.a(var2_2, var19_19, var10_10);
                                var10_10 = var2_2.mItems;
                                var8_8 = var10_10.size();
                                if (var7_7 < var8_8) {
                                    var10_10 = (ViewPager$e)var2_2.mItems.get(var7_7);
                                    continue;
                                }
lbl153:
                                // 4 sources

                                while (true) {
                                    var8_8 = 0;
                                    var9_9 = 0.0f;
                                    var10_10 = null;
                                    continue block8;
                                    break;
                                }
                            }
                            if (var10_10 == null || var19_19 != (var21_21 = var10_10.b)) break block40;
                            var9_9 = var10_10.d;
                            var26_26 += var9_9;
                            var10_10 = var2_2.mItems;
                            var8_8 = var10_10.size();
                            if (++var7_7 >= var8_8) ** GOTO lbl153
                            var10_10 = (ViewPager$e)var2_2.mItems.get(var7_7);
                            continue;
                        }
                        var10_10 = var2_2.addNewItem(var19_19, var7_7);
                        var9_9 = var10_10.d;
                        var26_26 += var9_9;
                        if (++var7_7 >= (var8_8 = (var10_10 = var2_2.mItems).size())) ** continue;
                        var10_10 = (ViewPager$e)var2_2.mItems.get(var7_7);
                    }
                }
                var2_2.calculatePageOffsets((ViewPager$e)var15_15, var13_13, (ViewPager$e)var5_5);
                var6_6 = var2_2.mAdapter;
                var5_5 = var15_15.a;
                var6_6.k(var5_5);
            }
            var6_6 = var2_2.mAdapter;
            var6_6.b();
            var3_3 = this.getChildCount();
            var5_5 = null;
            for (var4_4 = 0; var4_4 < var3_3; ++var4_4) {
                var31_31 /* !! */  = var2_2.getChildAt(var4_4);
                var32_33 = (ViewPager$LayoutParams)var31_31 /* !! */ .getLayoutParams();
                var32_33.f = var4_4;
                var8_8 = var32_33.a;
                if (var8_8 != 0 || (var8_8 = (cfr_temp_0 = (var9_9 = var32_33.c) - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1)) != 0 || (var31_31 /* !! */  = var2_2.infoForChild(var31_31 /* !! */ )) == null) continue;
                var32_33.c = var9_9 = var31_31 /* !! */ .d;
                var32_33.e = var27_27 = var31_31 /* !! */ .b;
            }
            this.sortChildDrawingOrder();
            var3_3 = (int)this.hasFocus();
            if (var3_3 != 0) {
                var6_6 = this.findFocus();
                if (var6_6 != null) {
                    var31_31 /* !! */  = var2_2.infoForAnyChild((View)var6_6);
                } else {
                    var27_27 = 0;
                    var26_26 = 0.0f;
                    var31_31 /* !! */  = null;
                }
                if (var31_31 /* !! */  == null || (var3_3 = var31_31 /* !! */ .b) != (var4_4 = var2_2.mCurItem)) {
                    var9_9 = 0.0f;
                    var10_10 = null;
                    for (var8_8 = 0; var8_8 < (var3_3 = this.getChildCount()) && ((var5_5 = var2_2.infoForChild((View)(var6_6 = var2_2.getChildAt(var8_8)))) == null || (var4_4 = var5_5.b) != (var27_27 = var2_2.mCurItem) || (var3_3 = (int)var6_6.requestFocus(var4_4 = 2)) == 0); ++var8_8) {
                    }
                }
            }
            return;
        }
        var6_6 = this.getResources();
        var4_4 = this.getId();
        try {
            var6_6 = var6_6.getResourceName(var4_4);
        }
        catch (Resources.NotFoundException v0) {
            var3_3 = this.getId();
            var6_6 = Integer.toHexString(var3_3);
        }
        var31_32 = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
        var7_7 = var2_2.mExpectedAdapterCount;
        m10.a(var31_32, var7_7, ", found: ", var12_12, " Pager id: ");
        var31_32.append((String)var6_6);
        var31_32.append(" Pager class: ");
        var6_6 = this.getClass();
        var31_32.append(var6_6);
        var31_32.append(" Problematic adapter: ");
        var6_6 = var2_2.mAdapter.getClass();
        var31_32.append(var6_6);
        var6_6 = var31_32.toString();
        var5_5 = new IllegalStateException((String)var6_6);
        throw var5_5;
    }

    public void removeOnAdapterChangeListener(ViewPager$g viewPager$g) {
        List list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(viewPager$g);
        }
    }

    public void removeOnPageChangeListener(ViewPager$h viewPager$h) {
        List list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(viewPager$h);
        }
    }

    public void removeView(View view) {
        boolean bl2 = this.mInLayout;
        if (bl2) {
            this.removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setAdapter(Uk2 uk2) {
        int n3;
        Object object;
        Object object2;
        int n4;
        Object object3 = this.mAdapter;
        int n7 = 0;
        List list = null;
        int n8 = 0;
        if (object3 != null) {
            synchronized (object3) {
                ((Uk2)object3).b = null;
            }
            this.mAdapter.m(this);
            object3 = null;
            for (int i3 = 0; i3 < (n4 = ((ArrayList)(object2 = this.mItems)).size()); ++i3) {
                object2 = (ViewPager$e)this.mItems.get(i3);
                object = this.mAdapter;
                n3 = ((ViewPager$e)object2).b;
                object2 = ((ViewPager$e)object2).a;
                ((Uk2)object).a(this, n3, object2);
            }
            this.mAdapter.b();
            object3 = this.mItems;
            ((ArrayList)object3).clear();
            this.removeNonDecorViews();
            this.mCurItem = 0;
            this.scrollTo(0, 0);
        }
        object3 = this.mAdapter;
        this.mAdapter = uk2;
        this.mExpectedAdapterCount = 0;
        if (uk2 != null) {
            boolean bl2;
            object2 = this.mObserver;
            if (object2 == null) {
                object2 = new ViewPager$j(this);
                this.mObserver = object2;
            }
            object2 = this.mAdapter;
            object = this.mObserver;
            ((Uk2)object2).l((DataSetObserver)object);
            this.mPopulatePending = false;
            n4 = (int)(this.mFirstLayout ? 1 : 0);
            this.mFirstLayout = bl2 = true;
            Uk2 uk22 = this.mAdapter;
            this.mExpectedAdapterCount = n3 = uk22.c();
            n3 = this.mRestoredCurItem;
            if (n3 >= 0) {
                object2 = this.mAdapter;
                uk22 = this.mRestoredAdapterState;
                ClassLoader classLoader = this.mRestoredClassLoader;
                ((Uk2)object2).i((Parcelable)uk22, classLoader);
                n4 = this.mRestoredCurItem;
                this.setCurrentItemInternal(n4, false, bl2);
                this.mRestoredCurItem = n4 = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (n4 == 0) {
                this.populate();
            } else {
                this.requestLayout();
            }
        }
        if ((list = this.mAdapterChangeListeners) != null && (n7 = list.isEmpty()) == 0) {
            list = this.mAdapterChangeListeners;
            n7 = list.size();
            while (n8 < n7) {
                object2 = (ViewPager$g)this.mAdapterChangeListeners.get(n8);
                object2.onAdapterChanged(this, (Uk2)object3, uk2);
                ++n8;
            }
        }
    }

    public void setCurrentItem(int n3) {
        this.mPopulatePending = false;
        boolean bl2 = this.mFirstLayout ^ true;
        this.setCurrentItemInternal(n3, bl2, false);
    }

    public void setCurrentItem(int n3, boolean bl2) {
        this.mPopulatePending = false;
        this.setCurrentItemInternal(n3, bl2, false);
    }

    public void setCurrentItemInternal(int n3, boolean bl2, boolean bl3) {
        this.setCurrentItemInternal(n3, bl2, bl3, 0);
    }

    public void setCurrentItemInternal(int n3, boolean bl2, boolean n4, int n7) {
        int n8;
        Uk2 uk2 = this.mAdapter;
        boolean bl3 = false;
        if (uk2 != null && (n8 = uk2.c()) > 0) {
            Uk2 uk22;
            ArrayList arrayList;
            if (n4 == 0 && (n4 = this.mCurItem) == n3 && (n4 = (arrayList = this.mItems).size()) != 0) {
                this.setScrollingCacheEnabled(false);
                return;
            }
            n4 = 1;
            if (n3 < 0) {
                n3 = 0;
                uk22 = null;
            } else {
                uk2 = this.mAdapter;
                n8 = uk2.c();
                if (n3 >= n8) {
                    uk22 = this.mAdapter;
                    n3 = uk22.c() - n4;
                }
            }
            n8 = this.mOffscreenPageLimit;
            int n10 = this.mCurItem;
            int n14 = n10 + n8;
            if (n3 > n14 || n3 < (n10 -= n8)) {
                Object object;
                uk2 = null;
                for (n8 = 0; n8 < (n10 = ((ArrayList)(object = this.mItems)).size()); ++n8) {
                    object = (ViewPager$e)this.mItems.get(n8);
                    ((ViewPager$e)object).c = n4;
                }
            }
            if ((n8 = this.mCurItem) != n3) {
                bl3 = true;
            }
            if ((n4 = (int)(this.mFirstLayout ? 1 : 0)) != 0) {
                this.mCurItem = n3;
                if (bl3) {
                    this.dispatchOnPageSelected(n3);
                }
                this.requestLayout();
            } else {
                this.populate(n3);
                this.scrollToItem(n3, bl2, n7, bl3);
            }
            return;
        }
        this.setScrollingCacheEnabled(false);
    }

    public ViewPager$h setInternalPageChangeListener(ViewPager$h viewPager$h) {
        ViewPager$h viewPager$h2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = viewPager$h;
        return viewPager$h2;
    }

    public void setOffscreenPageLimit(int n3) {
        int n4 = 1;
        if (n3 < n4) {
            n3 = 1;
        }
        if (n3 != (n4 = this.mOffscreenPageLimit)) {
            this.mOffscreenPageLimit = n3;
            this.populate();
        }
    }

    public void setOnPageChangeListener(ViewPager$h viewPager$h) {
        this.mOnPageChangeListener = viewPager$h;
    }

    public void setPageMargin(int n3) {
        int n4 = this.mPageMargin;
        this.mPageMargin = n3;
        int n7 = this.getWidth();
        this.recomputeScrollPosition(n7, n7, n3, n4);
        this.requestLayout();
    }

    public void setPageMarginDrawable(int n3) {
        Drawable drawable2 = t70.getDrawable(this.getContext(), n3);
        this.setPageMarginDrawable(drawable2);
    }

    public void setPageMarginDrawable(Drawable drawable2) {
        boolean bl2;
        this.mMarginDrawable = drawable2;
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

    public void setPageTransformer(boolean bl2, ViewPager$i viewPager$i) {
        this.setPageTransformer(bl2, viewPager$i, 2);
    }

    public void setPageTransformer(boolean bl2, ViewPager$i viewPager$i, int n3) {
        boolean bl3;
        int n4 = 1;
        if (viewPager$i != null) {
            bl3 = true;
        } else {
            bl3 = false;
            viewPager$i = null;
        }
        this.setChildrenDrawingOrderEnabled(bl3);
        if (bl3) {
            if (bl2) {
                n4 = 2;
            }
            this.mDrawingOrder = n4;
            this.mPageTransformerLayerType = n3;
        } else {
            this.mDrawingOrder = 0;
        }
        if (bl3) {
            this.populate();
        }
    }

    public void setScrollState(int n3) {
        int n4 = this.mScrollState;
        if (n4 == n3) {
            return;
        }
        this.mScrollState = n3;
        this.dispatchOnScrollStateChanged(n3);
    }

    public void smoothScrollTo(int n3, int n4) {
        this.smoothScrollTo(n3, n4, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void smoothScrollTo(int n3, int n4, int n7) {
        int n8 = 2;
        float f5 = 2.8E-45f;
        int n10 = this.getChildCount();
        if (n10 == 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller != null && (n10 = (int)(scroller.isFinished() ? 1 : 0)) == 0) {
            n10 = (int)(this.mIsScrollStarted ? 1 : 0);
            if (n10 != 0) {
                scroller = this.mScroller;
                n10 = scroller.getCurrX();
            } else {
                scroller = this.mScroller;
                n10 = scroller.getStartX();
            }
            Scroller scroller2 = this.mScroller;
            scroller2.abortAnimation();
            this.setScrollingCacheEnabled(false);
        } else {
            n10 = this.getScrollX();
        }
        int n14 = n10;
        int n15 = this.getScrollY();
        int n16 = n3 - n10;
        int n17 = n4 - n15;
        if (n16 == 0 && n17 == 0) {
            this.completeScroll(false);
            this.populate();
            this.setScrollState(0);
            return;
        }
        this.setScrollingCacheEnabled(true);
        this.setScrollState(n8);
        n3 = this.getClientWidth();
        n4 = n3 / 2;
        n8 = Math.abs(n16);
        f5 = n8;
        n10 = 1065353216;
        float f6 = 1.0f;
        f5 *= f6;
        float f7 = n3;
        f5 /= f7;
        f5 = Math.min(f6, f5);
        float f8 = n4;
        f5 = this.distanceInfluenceForSnapDuration(f5) * f8 + f8;
        n4 = Math.abs(n7);
        if (n4 > 0) {
            f7 = n4;
            f5 /= f7;
            f7 = Math.abs(f5);
            n4 = 1148846080;
            f8 = 1000.0f;
            n3 = Math.round(f7 *= f8) * 4;
        } else {
            Uk2 uk2 = this.mAdapter;
            uk2.getClass();
            f7 *= f6;
            n4 = Math.abs(n16);
            f8 = n4;
            n7 = this.mPageMargin;
            float f11 = n7;
            f8 = f8 / (f7 += f11) + f6;
            f7 = 100.0f;
            n3 = (int)(f8 *= f7);
        }
        int n18 = Math.min(n3, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(n14, n15, n16, n17, n18);
        this.postInvalidateOnAnimation();
    }

    public boolean verifyDrawable(Drawable drawable2) {
        boolean bl2;
        Drawable drawable3;
        boolean bl3 = super.verifyDrawable(drawable2);
        if (!bl3 && drawable2 != (drawable3 = this.mMarginDrawable)) {
            bl2 = false;
            drawable2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

