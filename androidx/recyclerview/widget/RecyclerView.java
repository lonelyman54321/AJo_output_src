/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.LayoutTransition
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.StateListDrawable
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  android.os.Trace
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.view.FocusFinder
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityManager
 *  android.view.animation.Interpolator
 *  android.widget.EdgeEffect
 *  android.widget.OverScroller
 */
package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$f;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.R$attr;
import androidx.recyclerview.R$dimen;
import androidx.recyclerview.R$styleable;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.B$a;
import androidx.recyclerview.widget.B$b;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.FastScroller;
import androidx.recyclerview.widget.GapWorker;
import androidx.recyclerview.widget.GapWorker$b;
import androidx.recyclerview.widget.RecyclerView$1;
import androidx.recyclerview.widget.RecyclerView$2;
import androidx.recyclerview.widget.RecyclerView$A;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$SavedState;
import androidx.recyclerview.widget.RecyclerView$ViewFlinger;
import androidx.recyclerview.widget.RecyclerView$c;
import androidx.recyclerview.widget.RecyclerView$d;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView$j;
import androidx.recyclerview.widget.RecyclerView$k;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$l$b;
import androidx.recyclerview.widget.RecyclerView$l$c;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.RecyclerView$q;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$t$a;
import androidx.recyclerview.widget.RecyclerView$u;
import androidx.recyclerview.widget.RecyclerView$v;
import androidx.recyclerview.widget.RecyclerView$w;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$z;
import androidx.recyclerview.widget.a$b_0;
import androidx.recyclerview.widget.a_0;
import androidx.recyclerview.widget.c$a;
import androidx.recyclerview.widget.c$b;
import androidx.recyclerview.widget.c_0;
import androidx.recyclerview.widget.recyclerview$b_0;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.x;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

public class RecyclerView
extends ViewGroup
implements uU1 {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = false;
    static final boolean ALLOW_THREAD_GAP_WORK = false;
    private static final float DECELERATION_RATE = 0.0f;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = 255;
    public static final int INVALID_TYPE = 255;
    private static final Class[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final String LOW_RES_ROTARY_ENCODER_FEATURE = "android.hardware.rotaryencoder.lowres";
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS;
    public static final long NO_ID = 255L;
    public static final int NO_POSITION = 255;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled = false;
    static final RecyclerView$z sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    v mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    RecyclerView$f mAdapter;
    a_0 mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private RecyclerView$j mChildDrawingOrderCallback;
    c_0 mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    rq0 mDifferentialMotionFlingController;
    private final sq0_0 mDifferentialMotionFlingTarget;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private RecyclerView$k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    GapWorker mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private RecyclerView$r mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    RecyclerView$l mItemAnimator;
    private RecyclerView$l$b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    RecyclerView$o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    boolean mLowResRotaryEncoderFeature;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final RecyclerView$w mObserver;
    private List mOnChildAttachStateListeners;
    private RecyclerView$q mOnFlingListener;
    private final ArrayList mOnItemTouchListeners;
    final List mPendingAccessibilityImportanceChange;
    RecyclerView$SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    GapWorker$b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final RecyclerView$u mRecycler;
    RecyclerView$v mRecyclerListener;
    final List mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    float mScaledHorizontalScrollFactor;
    float mScaledVerticalScrollFactor;
    private RecyclerView$s mScrollListener;
    private List mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private vU1 mScrollingChildHelper;
    final RecyclerView$y mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final RecyclerView$ViewFlinger mViewFlinger;
    private final B$b mViewInfoProcessCallback;
    final B mViewInfoStore;

    static {
        float f5;
        int n3 = 1;
        Object[] objectArray = new int[]{16843830};
        NESTED_SCROLLING_ATTRS = objectArray;
        double d2 = Math.log(0.78);
        double d5 = Math.log(0.9);
        DECELERATION_RATE = f5 = (float)(d2 /= d5);
        int n4 = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = false;
        int n7 = 23;
        if (n4 >= n7) {
            n4 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n4 = 0;
            f5 = 0.0f;
            objectArray = null;
        }
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = n4;
        ALLOW_THREAD_GAP_WORK = n3;
        objectArray = new Class[4];
        objectArray[0] = (int)Context.class;
        objectArray[n3] = (int)AttributeSet.class;
        Object object = Integer.TYPE;
        objectArray[2] = (int)object;
        objectArray[3] = (int)object;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = (Class[])objectArray;
        object = new Object();
        sQuinticInterpolator = object;
        sDefaultEdgeEffectFactory = object = new Object();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.recyclerViewStyle;
        this(context, attributeSet, n3);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int n3) {
        int n4;
        int n7;
        float f5;
        Method method;
        int n8;
        boolean bl2;
        float f6;
        int n10;
        RecyclerView recyclerView = this;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int n14 = n3;
        super(context, attributeSet, n3);
        Object object = new RecyclerView$w(this);
        this.mObserver = object;
        this.mRecycler = object = new RecyclerView$u(this);
        this.mViewInfoStore = object = new B();
        this.mUpdateChildViewsRunnable = object = new RecyclerView$1(this);
        object = new Rect();
        this.mTempRect = object;
        object = new Rect();
        this.mTempRect2 = object;
        object = new RectF();
        this.mTempRectF = object;
        object = new ArrayList();
        this.mRecyclerListeners = object;
        object = new ArrayList();
        this.mItemDecorations = object;
        object = new ArrayList();
        this.mOnItemTouchListeners = object;
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = object = sDefaultEdgeEffectFactory;
        this.mItemAnimator = object = new DefaultItemAnimator();
        this.mScrollState = 0;
        this.mScrollPointerId = n10 = -1;
        this.mScaledHorizontalScrollFactor = f6 = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = f6;
        this.mPreserveFocusAfterLayout = bl2 = true;
        this.mViewFlinger = object = new RecyclerView$ViewFlinger(this);
        int n15 = ALLOW_THREAD_GAP_WORK;
        if (n15 != 0) {
            object = new Object();
        } else {
            n15 = 0;
            f6 = 0.0f;
            object = null;
        }
        recyclerView.mPrefetchRegistry = object;
        recyclerView.mState = object = new RecyclerView$y();
        recyclerView.mItemsAddedOrRemoved = false;
        recyclerView.mItemsChanged = false;
        recyclerView.mItemAnimatorListener = object = new RecyclerView$m(this);
        recyclerView.mPostedAnimatorRunner = false;
        n15 = 2;
        f6 = 2.8E-45f;
        Object object2 = new int[n15];
        recyclerView.mMinMaxLayoutPositions = object2;
        object2 = new int[n15];
        recyclerView.mScrollOffset = object2;
        object2 = new int[n15];
        recyclerView.mNestedOffsets = object2;
        object2 = new int[n15];
        recyclerView.mReusableIntPair = object2;
        object2 = new ArrayList;
        super();
        recyclerView.mPendingAccessibilityImportanceChange = object2;
        object2 = new RecyclerView$2;
        super(this);
        recyclerView.mItemAnimatorRunner = object2;
        recyclerView.mLastAutoMeasureNonExactMeasuredWidth = 0;
        recyclerView.mLastAutoMeasureNonExactMeasuredHeight = 0;
        object2 = new recyclerview$b_0;
        super(this);
        recyclerView.mViewInfoProcessCallback = object2;
        object2 = new RecyclerView$c;
        super(this);
        recyclerView.mDifferentialMotionFlingTarget = object2;
        Context context3 = this.getContext();
        Object object3 = new rq0(context3, (sq0_0)object2);
        recyclerView.mDifferentialMotionFlingController = object3;
        this.setScrollContainer(bl2);
        this.setFocusableInTouchMode(bl2);
        object2 = ViewConfiguration.get((Context)context);
        recyclerView.mTouchSlop = n8 = object2.getScaledTouchSlop();
        n8 = Build.VERSION.SDK_INT;
        int n16 = 26;
        if (n8 >= n16) {
            method = OC3.a;
            f5 = OC3$a.a((ViewConfiguration)object2);
        } else {
            f5 = OC3.a((ViewConfiguration)object2, context2);
        }
        recyclerView.mScaledHorizontalScrollFactor = f5;
        float f7 = n8 >= n16 ? OC3$a.b((ViewConfiguration)object2) : OC3.a((ViewConfiguration)object2, context2);
        recyclerView.mScaledVerticalScrollFactor = f7;
        recyclerView.mMinFlingVelocity = n8 = object2.getScaledMinimumFlingVelocity();
        recyclerView.mMaxFlingVelocity = n7 = object2.getScaledMaximumFlingVelocity();
        object2 = context.getResources().getDisplayMetrics();
        float f8 = object2.density * 160.0f * 386.0878f;
        n8 = 1062668861;
        f7 = 0.84f;
        recyclerView.mPhysicalCoef = f8 *= f7;
        n7 = this.getOverScrollMode();
        if (n7 == n15) {
            n15 = 1;
            f6 = Float.MIN_VALUE;
        } else {
            n15 = 0;
            f6 = 0.0f;
            object = null;
        }
        this.setWillNotDraw(n15 != 0);
        object = recyclerView.mItemAnimator;
        object2 = recyclerView.mItemAnimatorListener;
        ((RecyclerView$l)object).a = object2;
        this.initAdapterManager();
        this.initChildrenHelper();
        this.initAutofill();
        n15 = this.getImportantForAccessibility();
        if (n15 == 0) {
            this.setImportantForAccessibility((int)(bl2 ? 1 : 0));
        }
        object = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        recyclerView.mAccessibilityManager = object;
        object = new v(this);
        this.setAccessibilityDelegateCompat((v)object);
        object = R$styleable.RecyclerView;
        TypedArray typedArray = context2.obtainStyledAttributes(attributeSet2, (int[])object, n14, 0);
        object3 = R$styleable.RecyclerView;
        object = this;
        object2 = context;
        context3 = attributeSet;
        method = typedArray;
        ViewCompat.r((View)this, context, (int[])object3, attributeSet, typedArray, n3, 0);
        n15 = R$styleable.RecyclerView_layoutManager;
        object3 = typedArray.getString(n15);
        n15 = R$styleable.RecyclerView_android_descendantFocusability;
        n15 = typedArray.getInt(n15, n10);
        if (n15 == n10) {
            n15 = 262144;
            f6 = 3.67342E-40f;
            this.setDescendantFocusability(n15);
        }
        n15 = R$styleable.RecyclerView_android_clipToPadding;
        n15 = (int)(typedArray.getBoolean(n15, bl2) ? 1 : 0);
        recyclerView.mClipToPadding = n15;
        n15 = R$styleable.RecyclerView_fastScrollEnabled;
        n15 = (int)(typedArray.getBoolean(n15, false) ? 1 : 0);
        recyclerView.mEnableFastScroller = n15;
        if (n15 != 0) {
            n15 = R$styleable.RecyclerView_fastScrollVerticalThumbDrawable;
            object = (StateListDrawable)typedArray.getDrawable(n15);
            n7 = R$styleable.RecyclerView_fastScrollVerticalTrackDrawable;
            object2 = typedArray.getDrawable(n7);
            n16 = R$styleable.RecyclerView_fastScrollHorizontalThumbDrawable;
            context3 = (StateListDrawable)typedArray.getDrawable(n16);
            n4 = R$styleable.RecyclerView_fastScrollHorizontalTrackDrawable;
            method = typedArray.getDrawable(n4);
            this.initFastScroller((StateListDrawable)object, (Drawable)object2, (StateListDrawable)context3, (Drawable)method);
        }
        typedArray.recycle();
        n15 = (int)(context.getPackageManager().hasSystemFeature(LOW_RES_ROTARY_ENCODER_FEATURE) ? 1 : 0);
        recyclerView.mLowResRotaryEncoderFeature = n15;
        object = this;
        object2 = context;
        context3 = attributeSet;
        n4 = n3;
        this.createLayoutManager(context, (String)object3, attributeSet, n3, 0);
        object3 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArray2 = context2.obtainStyledAttributes(attributeSet2, (int[])object3, n14, 0);
        method = typedArray2;
        ViewCompat.r((View)this, context, (int[])object3, attributeSet, typedArray2, n3, 0);
        n15 = (int)(typedArray2.getBoolean(0, bl2) ? 1 : 0);
        typedArray2.recycle();
        this.setNestedScrollingEnabled(n15 != 0);
        n15 = vw2.a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        object = Boolean.TRUE;
        n7 = vw2.b;
        this.setTag(n7, object);
    }

    public static /* synthetic */ void access$000(RecyclerView recyclerView, View view, int n3, ViewGroup.LayoutParams layoutParams) {
        recyclerView.attachViewToParent(view, n3, layoutParams);
    }

    public static /* synthetic */ void access$100(RecyclerView recyclerView, int n3) {
        recyclerView.detachViewFromParent(n3);
    }

    public static /* synthetic */ boolean access$200(RecyclerView recyclerView) {
        return recyclerView.awakenScrollBars();
    }

    public static /* synthetic */ void access$300(RecyclerView recyclerView, View view, int n3, ViewGroup.LayoutParams layoutParams) {
        recyclerView.attachViewToParent(view, n3, layoutParams);
    }

    public static /* synthetic */ void access$400(RecyclerView recyclerView, View view) {
        recyclerView.detachViewFromParent(view);
    }

    public static /* synthetic */ void access$500(RecyclerView recyclerView, int n3, int n4) {
        recyclerView.setMeasuredDimension(n3, n4);
    }

    private void addAnimatingView(RecyclerView$B object) {
        Object object2;
        Object object3;
        block8: {
            block6: {
                int n3;
                block7: {
                    int n4;
                    boolean bl2;
                    block5: {
                        object3 = ((RecyclerView$B)object).itemView;
                        object2 = object3.getParent();
                        bl2 = true;
                        if (object2 == this) {
                            n3 = 1;
                        } else {
                            n3 = 0;
                            object2 = null;
                        }
                        RecyclerView$u recyclerView$u = this.mRecycler;
                        RecyclerView$B recyclerView$B = this.getChildViewHolder((View)object3);
                        recyclerView$u.n(recyclerView$B);
                        boolean bl3 = ((RecyclerView$B)object).isTmpDetached();
                        n4 = -1;
                        if (!bl3) break block5;
                        object = this.mChildHelper;
                        object2 = object3.getLayoutParams();
                        ((c_0)object).b((View)object3, n4, (ViewGroup.LayoutParams)object2, bl2);
                        break block6;
                    }
                    if (n3 != 0) break block7;
                    object = this.mChildHelper;
                    ((c_0)object).a((View)object3, n4, bl2);
                    break block6;
                }
                object = this.mChildHelper;
                object2 = ((RecyclerView$d)((c_0)object).a).a;
                n3 = object2.indexOfChild(object3);
                if (n3 < 0) break block8;
                c$a c$a = ((c_0)object).b;
                c$a.h(n3);
                ((c_0)object).i((View)object3);
            }
            return;
        }
        object2 = new StringBuilder("view is not a child, cannot hide ");
        ((StringBuilder)object2).append(object3);
        object3 = ((StringBuilder)object2).toString();
        object = new IllegalArgumentException((String)object3);
        throw object;
    }

    private void animateChange(RecyclerView$B recyclerView$B, RecyclerView$B recyclerView$B2, RecyclerView$l$c recyclerView$l$c, RecyclerView$l$c recyclerView$l$c2, boolean bl2, boolean bl3) {
        int n3;
        int n4;
        Object object;
        RecyclerView$l recyclerView$l = null;
        recyclerView$B.setIsRecyclable(false);
        if (bl2) {
            this.addAnimatingView(recyclerView$B);
        }
        if (recyclerView$B != recyclerView$B2) {
            if (bl3) {
                this.addAnimatingView(recyclerView$B2);
            }
            recyclerView$B.mShadowedHolder = recyclerView$B2;
            this.addAnimatingView(recyclerView$B);
            object = this.mRecycler;
            ((RecyclerView$u)object).n(recyclerView$B);
            recyclerView$B2.setIsRecyclable(false);
            recyclerView$B2.mShadowingHolder = recyclerView$B;
        }
        object = this.mItemAnimator;
        recyclerView$l = object;
        recyclerView$l = (x)object;
        recyclerView$l.getClass();
        int n7 = recyclerView$l$c.a;
        int n8 = recyclerView$l$c.b;
        bl2 = recyclerView$B2.shouldIgnore();
        if (bl2) {
            int n10;
            int n14 = recyclerView$l$c.a;
            n4 = n10 = recyclerView$l$c.b;
            n3 = n14;
        } else {
            int n15 = recyclerView$l$c2.a;
            int n16 = recyclerView$l$c2.b;
            n3 = n15;
            n4 = n16;
        }
        boolean bl4 = ((x)recyclerView$l).i(recyclerView$B, recyclerView$B2, n7, n8, n3, n4);
        if (bl4) {
            this.postAnimationRunner();
        }
    }

    private void cancelScroll() {
        this.resetScroll();
        this.setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(RecyclerView$B recyclerView$B) {
        WeakReference weakReference = recyclerView$B.mNestedRecyclerView;
        if (weakReference != null) {
            weakReference = (View)weakReference.get();
            while (weakReference != null) {
                View view = recyclerView$B.itemView;
                if (weakReference == view) {
                    return;
                }
                boolean bl2 = (weakReference = weakReference.getParent()) instanceof View;
                if (bl2) {
                    weakReference = (View)weakReference;
                    continue;
                }
                weakReference = null;
            }
            recyclerView$B.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int n3, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int n4) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f11;
        float f12;
        float f14 = 0.5f;
        float f15 = 0.0f;
        float f16 = 4.0f;
        if (n3 > 0 && edgeEffect != null && (f12 = (f11 = (f8 = kx0.a(edgeEffect)) - 0.0f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) != false) {
            float f17 = (float)(-n3) * f16;
            f15 = n4;
            f17 /= f15;
            n4 = -n4;
            float f18 = (float)n4 / f16;
            int n7 = Math.round(f17 = kx0.b(edgeEffect, f17, f14) * f18);
            if (n7 != n3) {
                edgeEffect.finish();
            }
            return n3 - n7;
        }
        if (n3 < 0 && edgeEffect2 != null && (f7 = (f6 = (f5 = kx0.a(edgeEffect2)) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) != false) {
            f5 = (float)n3 * f16;
            float f19 = n4;
            f5 /= f19;
            f7 = Math.round(f5 = kx0.b(edgeEffect2, f5, f14) * (f19 /= f16));
            if (f7 != n3) {
                edgeEffect2.finish();
            }
            n3 -= f7;
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void createLayoutManager(Context object, String string2, AttributeSet object2, int n3, int n4) {
        ClassNotFoundException classNotFoundException2;
        block16: {
            InvocationTargetException invocationTargetException2;
            String string3;
            block15: {
                InstantiationException instantiationException2;
                block14: {
                    IllegalAccessException illegalAccessException2;
                    block13: {
                        ClassCastException classCastException2;
                        block12: {
                            Object[] objectArray;
                            Object object3;
                            Object object4;
                            block11: {
                                block10: {
                                    string3 = ": Could not instantiate the LayoutManager: ";
                                    if (string2 == null) return;
                                    boolean bl2 = (string2 = string2.trim()).isEmpty();
                                    if (bl2) return;
                                    string2 = this.getFullClassName((Context)object, string2);
                                    try {
                                        bl2 = this.isInEditMode();
                                        if (!bl2) break block10;
                                        object4 = this.getClass();
                                        object4 = ((Class)object4).getClassLoader();
                                        break block11;
                                    }
                                    catch (ClassCastException classCastException2) {
                                        break block12;
                                    }
                                    catch (IllegalAccessException illegalAccessException2) {
                                        break block13;
                                    }
                                    catch (InstantiationException instantiationException2) {
                                        break block14;
                                    }
                                    catch (InvocationTargetException invocationTargetException2) {
                                        break block15;
                                    }
                                    catch (ClassNotFoundException classNotFoundException2) {
                                        break block16;
                                    }
                                }
                                object4 = object.getClassLoader();
                            }
                            object4 = Class.forName(string2, false, (ClassLoader)object4);
                            Class<RecyclerView$o> clazz = RecyclerView$o.class;
                            object4 = ((Class)object4).asSubclass(clazz);
                            int n7 = 1;
                            try {
                                object3 = LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
                                object3 = ((Class)object4).getConstructor((Class<?>)object3);
                                int n8 = 4;
                                objectArray = new Object[n8];
                                objectArray[0] = object;
                                objectArray[n7] = object2;
                                object = n3;
                                n3 = 2;
                                objectArray[n3] = object;
                                object = n4;
                                n3 = 3;
                                objectArray[n3] = object;
                            }
                            catch (NoSuchMethodException noSuchMethodException) {
                                boolean bl3 = false;
                                objectArray = null;
                                try {
                                    object3 = ((Class)object4).getConstructor(null);
                                }
                                catch (NoSuchMethodException noSuchMethodException2) {
                                    noSuchMethodException2.initCause(noSuchMethodException);
                                    CharSequence charSequence = new StringBuilder();
                                    object4 = object2.getPositionDescription();
                                    charSequence.append((String)object4);
                                    object4 = ": Error creating LayoutManager ";
                                    charSequence.append((String)object4);
                                    charSequence.append(string2);
                                    charSequence = charSequence.toString();
                                    IllegalStateException illegalStateException = new IllegalStateException((String)charSequence, noSuchMethodException2);
                                    throw illegalStateException;
                                }
                            }
                            ((AccessibleObject)object3).setAccessible(n7 != 0);
                            object = ((Constructor)object3).newInstance(objectArray);
                            object = (RecyclerView$o)object;
                            this.setLayoutManager((RecyclerView$o)object);
                            return;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        object2 = object2.getPositionDescription();
                        stringBuilder.append((String)object2);
                        stringBuilder.append(": Class is not a LayoutManager ");
                        stringBuilder.append(string2);
                        string2 = stringBuilder.toString();
                        IllegalStateException illegalStateException = new IllegalStateException(string2, classCastException2);
                        throw illegalStateException;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    object2 = object2.getPositionDescription();
                    stringBuilder.append((String)object2);
                    stringBuilder.append(": Cannot access non-public constructor ");
                    stringBuilder.append(string2);
                    string2 = stringBuilder.toString();
                    IllegalStateException illegalStateException = new IllegalStateException(string2, illegalAccessException2);
                    throw illegalStateException;
                }
                StringBuilder stringBuilder = new StringBuilder();
                object2 = object2.getPositionDescription();
                stringBuilder.append((String)object2);
                stringBuilder.append(string3);
                stringBuilder.append(string2);
                string2 = stringBuilder.toString();
                IllegalStateException illegalStateException = new IllegalStateException(string2, instantiationException2);
                throw illegalStateException;
            }
            StringBuilder stringBuilder = new StringBuilder();
            object2 = object2.getPositionDescription();
            stringBuilder.append((String)object2);
            stringBuilder.append(string3);
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            IllegalStateException illegalStateException = new IllegalStateException(string2, invocationTargetException2);
            throw illegalStateException;
        }
        StringBuilder stringBuilder = new StringBuilder();
        object2 = object2.getPositionDescription();
        stringBuilder.append((String)object2);
        stringBuilder.append(": Unable to find LayoutManager ");
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2, classNotFoundException2);
        throw illegalStateException;
    }

    private boolean didChildRangeChange(int n3, int n4) {
        int[] nArray = this.mMinMaxLayoutPositions;
        this.findMinMaxChildLayoutPositions(nArray);
        nArray = this.mMinMaxLayoutPositions;
        boolean bl2 = false;
        int n7 = nArray[0];
        int n8 = 1;
        if (n7 != n3 || (n3 = nArray[n8]) != n4) {
            bl2 = true;
        }
        return bl2;
    }

    private void dispatchContentChangedIfNecessary() {
        int n3 = this.mEatenAccessibilityChangeFlags;
        boolean bl2 = false;
        AccessibilityEvent accessibilityEvent = null;
        this.mEatenAccessibilityChangeFlags = 0;
        if (n3 != 0 && (bl2 = this.isAccessibilityEnabled())) {
            accessibilityEvent = AccessibilityEvent.obtain();
            int n4 = 2048;
            accessibilityEvent.setEventType(n4);
            accessibilityEvent.setContentChangeTypes(n3);
            this.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    private void dispatchLayoutStep1() {
        Object object;
        Object object2;
        Object object3;
        RecyclerView$f recyclerView$f;
        Object object4 = this.mState;
        int n4 = 1;
        ((RecyclerView$y)object4).a(n4);
        object4 = this.mState;
        this.fillRemainingScrollValues((RecyclerView$y)object4);
        this.mState.i = false;
        this.startInterceptRequestLayout();
        object4 = this.mViewInfoStore;
        Object object5 = ((B)object4).a;
        ((a53)object5).clear();
        ((B)object4).b.d();
        this.onEnterLayoutOrScroll();
        this.processAdapterUpdatesAndSetAnimationFlags();
        this.saveFocusInfo();
        object4 = this.mState;
        int n7 = ((RecyclerView$y)object4).j;
        if (n7 == 0 || (n7 = this.mItemsChanged) == 0) {
            n4 = 0;
            recyclerView$f = null;
        }
        ((RecyclerView$y)object4).h = n4;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        n4 = (int)(((RecyclerView$y)object4).k ? 1 : 0);
        ((RecyclerView$y)object4).g = n4;
        recyclerView$f = this.mAdapter;
        ((RecyclerView$y)object4).e = n4 = recyclerView$f.getItemCount();
        object4 = this.mMinMaxLayoutPositions;
        this.findMinMaxChildLayoutPositions((int[])object4);
        object4 = this.mState;
        int n8 = ((RecyclerView$y)object4).j;
        if (n8 != 0) {
            object4 = this.mChildHelper;
            n8 = ((c_0)object4).e();
            recyclerView$f = null;
            for (n4 = 0; n4 < n8; ++n4) {
                object5 = RecyclerView.getChildViewHolderInt(this.mChildHelper.d(n4));
                int n3 = ((RecyclerView$B)object5).shouldIgnore();
                if (n3 != 0 || (n3 = ((RecyclerView$B)object5).isInvalid()) != 0 && (n3 = ((RecyclerView$f)(object3 = this.mAdapter)).hasStableIds()) == 0) continue;
                object3 = this.mItemAnimator;
                RecyclerView$l.a((RecyclerView$B)object5);
                ((RecyclerView$B)object5).getUnmodifiedPayloads();
                object3.getClass();
                object3 = new Object();
                ((RecyclerView$l$c)object3).a((RecyclerView$B)object5);
                object2 = this.mViewInfoStore.a;
                object = (B$a)((a53)object2).get(object5);
                if (object == null) {
                    object = B$a.a();
                    ((a53)object2).put(object5, object);
                }
                ((B$a)object).b = object3;
                ((B$a)object).a = n3 = ((B$a)object).a | 4;
                object3 = this.mState;
                n3 = (int)(((RecyclerView$y)object3).h ? 1 : 0);
                if (n3 == 0 || (n3 = (int)(((RecyclerView$B)object5).isUpdated() ? 1 : 0)) == 0 || (n3 = (int)(((RecyclerView$B)object5).isRemoved() ? 1 : 0)) != 0 || (n3 = (int)(((RecyclerView$B)object5).shouldIgnore() ? 1 : 0)) != 0 || (n3 = (int)(((RecyclerView$B)object5).isInvalid() ? 1 : 0)) != 0) continue;
                long l2 = this.getChangedHolderKey((RecyclerView$B)object5);
                object = this.mViewInfoStore.b;
                ((pb1_0)object).l(l2, object5);
            }
        }
        object4 = this.mState;
        n8 = (int)(((RecyclerView$y)object4).k ? 1 : 0);
        n4 = 2;
        if (n8 != 0) {
            this.saveOldPositions();
            object4 = this.mState;
            n7 = ((RecyclerView$y)object4).f;
            ((RecyclerView$y)object4).f = false;
            object3 = this.mLayout;
            object2 = this.mRecycler;
            ((RecyclerView$o)object3).onLayoutChildren((RecyclerView$u)object2, (RecyclerView$y)object4);
            this.mState.f = n7;
            object4 = null;
            for (n8 = 0; n8 < (n7 = ((c_0)(object5 = this.mChildHelper)).e()); ++n8) {
                object5 = RecyclerView.getChildViewHolderInt(this.mChildHelper.d(n8));
                int n3 = ((RecyclerView$B)object5).shouldIgnore();
                if (n3 != 0 || (object3 = (B$a)this.mViewInfoStore.a.get(object5)) != null && (n3 = ((B$a)object3).a & 4) != 0) continue;
                RecyclerView$l.a((RecyclerView$B)object5);
                n3 = (int)(((RecyclerView$B)object5).hasAnyOfTheFlags(8192) ? 1 : 0);
                object2 = this.mItemAnimator;
                ((RecyclerView$B)object5).getUnmodifiedPayloads();
                object2.getClass();
                object2 = new Object();
                ((RecyclerView$l$c)object2).a((RecyclerView$B)object5);
                if (n3 != 0) {
                    this.recordAnimationInfoIfBouncedHiddenView((RecyclerView$B)object5, (RecyclerView$l$c)object2);
                    continue;
                }
                object3 = this.mViewInfoStore.a;
                object = (B$a)((a53)object3).get(object5);
                if (object == null) {
                    object = B$a.a();
                    ((a53)object3).put(object5, object);
                }
                ((B$a)object).a = n7 = ((B$a)object).a | n4;
                ((B$a)object).b = object2;
            }
            this.clearOldPositions();
        } else {
            this.clearOldPositions();
        }
        this.onExitLayoutOrScroll();
        this.stopInterceptRequestLayout(false);
        this.mState.d = n4;
    }

    private void dispatchLayoutStep2() {
        Object object;
        boolean bl2;
        int n3;
        this.startInterceptRequestLayout();
        this.onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        Object object2 = this.mState;
        ((RecyclerView$y)object2).e = n3 = this.mAdapter.getItemCount();
        object2 = this.mState;
        n3 = 0;
        ((RecyclerView$y)object2).c = 0;
        object2 = this.mPendingSavedState;
        if (object2 != null && (bl2 = ((RecyclerView$f)(object2 = this.mAdapter)).canRestoreState())) {
            object2 = this.mPendingSavedState.a;
            if (object2 != null) {
                object = this.mLayout;
                ((RecyclerView$o)object).onRestoreInstanceState((Parcelable)object2);
            }
            bl2 = false;
            object2 = null;
            this.mPendingSavedState = null;
        }
        object2 = this.mState;
        ((RecyclerView$y)object2).g = false;
        object = this.mLayout;
        RecyclerView$u recyclerView$u = this.mRecycler;
        ((RecyclerView$o)object).onLayoutChildren(recyclerView$u, (RecyclerView$y)object2);
        object2 = this.mState;
        ((RecyclerView$y)object2).f = false;
        boolean bl3 = ((RecyclerView$y)object2).j;
        if (bl3 && (object = this.mItemAnimator) != null) {
            bl3 = true;
        } else {
            bl3 = false;
            object = null;
        }
        ((RecyclerView$y)object2).j = bl3;
        ((RecyclerView$y)object2).d = 4;
        this.onExitLayoutOrScroll();
        this.stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        Object object;
        int n3;
        Object object2;
        int n4;
        RecyclerView recyclerView = this;
        Object object3 = this.mState;
        int n7 = 4;
        ((RecyclerView$y)object3).a(n7);
        this.startInterceptRequestLayout();
        this.onEnterLayoutOrScroll();
        object3 = this.mState;
        ((RecyclerView$y)object3).d = n4 = 1;
        Object object4 = ((RecyclerView$y)object3).j;
        if (object4 != 0) {
            Object object5;
            int n8;
            Object object6;
            int n10;
            Object object7;
            Object object8;
            int n14;
            Object object9;
            Object object10;
            int n15;
            object3 = this.mChildHelper;
            for (n15 = object4 = ((c_0)object3).e() - n4; n15 >= 0; n15 += -1) {
                object3 = recyclerView.mChildHelper.d(n15);
                RecyclerView$B recyclerView$B = RecyclerView.getChildViewHolderInt((View)object3);
                object4 = recyclerView$B.shouldIgnore();
                if (object4 != 0) continue;
                long l2 = recyclerView.getChangedHolderKey(recyclerView$B);
                recyclerView.mItemAnimator.getClass();
                object10 = new Object();
                ((RecyclerView$l$c)object10).a(recyclerView$B);
                object9 = (RecyclerView$B)recyclerView.mViewInfoStore.b.f(l2);
                if (object9 != null && (n14 = (int)(((RecyclerView$B)object9).shouldIgnore() ? 1 : 0)) == 0) {
                    object8 = (B$a)recyclerView.mViewInfoStore.a.get(object9);
                    if (object8 != null && (n14 = ((B$a)object8).a & n4) != 0) {
                        n14 = 1;
                    } else {
                        n14 = 0;
                        object8 = null;
                    }
                    object7 = (B$a)recyclerView.mViewInfoStore.a.get(recyclerView$B);
                    if (object7 != null && (n10 = ((B$a)object7).a & n4) != 0) {
                        n10 = 1;
                    } else {
                        n10 = 0;
                        object7 = null;
                    }
                    if (n14 != 0 && object9 == recyclerView$B) {
                        object3 = recyclerView.mViewInfoStore;
                        ((B)object3).a(recyclerView$B, (RecyclerView$l$c)object10);
                        continue;
                    }
                    object6 = recyclerView.mViewInfoStore.b((RecyclerView$B)object9, n7);
                    recyclerView.mViewInfoStore.a(recyclerView$B, (RecyclerView$l$c)object10);
                    object10 = recyclerView.mViewInfoStore;
                    n8 = 8;
                    object5 = ((B)object10).b(recyclerView$B, n8);
                    if (object6 == null) {
                        recyclerView.handleMissingPreInfoForChangeError(l2, recyclerView$B, (RecyclerView$B)object9);
                        continue;
                    }
                    object3 = this;
                    object2 = object9;
                    object10 = object6;
                    object9 = object5;
                    this.animateChange((RecyclerView$B)object2, recyclerView$B, (RecyclerView$l$c)object6, (RecyclerView$l$c)object5, n14 != 0, n10 != 0);
                    continue;
                }
                object3 = recyclerView.mViewInfoStore;
                ((B)object3).a(recyclerView$B, (RecyclerView$l$c)object10);
            }
            object3 = recyclerView.mViewInfoStore;
            object2 = recyclerView.mViewInfoProcessCallback;
            object3 = ((B)object3).a;
            for (n3 = ((a53)object3).c - n4; n3 >= 0; n3 += -1) {
                object10 = (RecyclerView$B)((a53)object3).h(n3);
                object9 = (B$a)((a53)object3).j(n3);
                n14 = ((B$a)object9).a;
                n10 = n14 & 3;
                n7 = 0;
                n15 = 3;
                if (n10 == n15) {
                    object8 = object2;
                    object8 = ((recyclerview$b_0)object2).a;
                    object7 = ((RecyclerView)object8).mLayout;
                    object10 = ((RecyclerView$B)object10).itemView;
                    object8 = ((RecyclerView)object8).mRecycler;
                    ((RecyclerView$o)object7).removeAndRecycleView((View)object10, (RecyclerView$u)object8);
                } else {
                    Object object11;
                    n10 = n14 & 1;
                    if (n10 != 0) {
                        object8 = ((B$a)object9).b;
                        if (object8 == null) {
                            object8 = object2;
                            object8 = ((recyclerview$b_0)object2).a;
                            object7 = ((RecyclerView)object8).mLayout;
                            object10 = ((RecyclerView$B)object10).itemView;
                            object8 = ((RecyclerView)object8).mRecycler;
                            ((RecyclerView$o)object7).removeAndRecycleView((View)object10, (RecyclerView$u)object8);
                        } else {
                            object7 = ((B$a)object9).c;
                            object11 = object2;
                            object11 = ((recyclerview$b_0)object2).a;
                            object6 = ((RecyclerView)object11).mRecycler;
                            ((RecyclerView$u)object6).n((RecyclerView$B)object10);
                            ((RecyclerView)object11).animateDisappearance((RecyclerView$B)object10, (RecyclerView$l$c)object8, (RecyclerView$l$c)object7);
                        }
                    } else {
                        n10 = n14 & 0xE;
                        n15 = 14;
                        if (n10 == n15) {
                            object8 = ((B$a)object9).b;
                            object7 = ((B$a)object9).c;
                            object11 = object2;
                            object11 = ((recyclerview$b_0)object2).a;
                            ((RecyclerView)object11).animateAppearance((RecyclerView$B)object10, (RecyclerView$l$c)object8, (RecyclerView$l$c)object7);
                        } else {
                            n10 = n14 & 0xC;
                            n15 = 12;
                            if (n10 == n15) {
                                int n16;
                                int n17;
                                int n18;
                                object8 = ((B$a)object9).b;
                                object7 = ((B$a)object9).c;
                                object11 = object2;
                                object11 = (recyclerview$b_0)object2;
                                object11.getClass();
                                ((RecyclerView$B)object10).setIsRecyclable(false);
                                RecyclerView recyclerView2 = ((recyclerview$b_0)object11).a;
                                n15 = (int)(recyclerView2.mDataSetHasChangedAfterLayout ? 1 : 0);
                                if (n15 != 0) {
                                    int n19;
                                    object11 = (x)recyclerView2.mItemAnimator;
                                    object11.getClass();
                                    n18 = ((RecyclerView$l$c)object8).a;
                                    n8 = ((RecyclerView$l$c)object8).b;
                                    n17 = ((RecyclerView$B)object10).shouldIgnore();
                                    if (n17 != 0) {
                                        n10 = ((RecyclerView$l$c)object8).a;
                                        n19 = n14 = ((RecyclerView$l$c)object8).b;
                                        n16 = n10;
                                    } else {
                                        n14 = ((RecyclerView$l$c)object7).a;
                                        n10 = ((RecyclerView$l$c)object7).b;
                                        n16 = n14;
                                        n19 = n10;
                                    }
                                    object6 = object10;
                                    n14 = n8;
                                    object5 = object10;
                                    object10 = recyclerView2;
                                    n14 = (int)(((x)object11).i((RecyclerView$B)object6, (RecyclerView$B)object6, n18, n8, n16, n19) ? 1 : 0);
                                    if (n14 != 0) {
                                        recyclerView2.postAnimationRunner();
                                    }
                                } else {
                                    int n20;
                                    object11 = (x)recyclerView2.mItemAnimator;
                                    object11.getClass();
                                    n8 = ((RecyclerView$l$c)object8).a;
                                    n18 = ((RecyclerView$l$c)object7).a;
                                    if (n8 == n18 && (n17 = ((RecyclerView$l$c)object8).b) == (n4 = ((RecyclerView$l$c)object7).b)) {
                                        ((RecyclerView$l)object11).c((RecyclerView$B)object10);
                                        object8 = recyclerView2;
                                        n20 = 0;
                                        object10 = null;
                                    } else {
                                        n14 = ((RecyclerView$l$c)object8).b;
                                        n10 = ((RecyclerView$l$c)object7).b;
                                        object6 = object10;
                                        n20 = n18;
                                        n18 = n14;
                                        object8 = recyclerView2;
                                        n16 = n10;
                                        n20 = (int)(((x)object11).j((RecyclerView$B)object10, n8, n14, n20, n10) ? 1 : 0);
                                    }
                                    if (n20 != 0) {
                                        ((RecyclerView)object8).postAnimationRunner();
                                    }
                                }
                            } else {
                                Object object12;
                                n10 = n14 & 4;
                                if (n10 != 0) {
                                    object8 = ((B$a)object9).b;
                                    object7 = object2;
                                    object7 = ((recyclerview$b_0)object2).a;
                                    object12 = ((RecyclerView)object7).mRecycler;
                                    ((RecyclerView$u)object12).n((RecyclerView$B)object10);
                                    ((RecyclerView)object7).animateDisappearance((RecyclerView$B)object10, (RecyclerView$l$c)object8, null);
                                } else if ((n14 &= 8) != 0) {
                                    object8 = ((B$a)object9).b;
                                    object7 = ((B$a)object9).c;
                                    object12 = object2;
                                    object12 = ((recyclerview$b_0)object2).a;
                                    ((RecyclerView)object12).animateAppearance((RecyclerView$B)object10, (RecyclerView$l$c)object8, (RecyclerView$l$c)object7);
                                }
                            }
                        }
                    }
                }
                ((B$a)object9).a = 0;
                ((B$a)object9).b = null;
                ((B$a)object9).c = null;
                object10 = B$a.d;
                ((zw2_0)object10).a(object9);
                n4 = 1;
            }
        }
        object3 = recyclerView.mLayout;
        object2 = recyclerView.mRecycler;
        ((RecyclerView$o)object3).removeAndRecycleScrapInt((RecyclerView$u)object2);
        object3 = recyclerView.mState;
        ((RecyclerView$y)object3).b = object = ((RecyclerView$y)object3).e;
        recyclerView.mDataSetHasChangedAfterLayout = false;
        recyclerView.mDispatchItemsChangedEvent = false;
        ((RecyclerView$y)object3).j = false;
        ((RecyclerView$y)object3).k = false;
        recyclerView.mLayout.mRequestedSimpleAnimations = false;
        object3 = recyclerView.mRecycler.b;
        if (object3 != null) {
            ((ArrayList)object3).clear();
        }
        object3 = recyclerView.mLayout;
        object = ((RecyclerView$o)object3).mPrefetchMaxObservedInInitialPrefetch;
        if (object != 0) {
            ((RecyclerView$o)object3).mPrefetchMaxCountObserved = 0;
            ((RecyclerView$o)object3).mPrefetchMaxObservedInInitialPrefetch = false;
            object3 = recyclerView.mRecycler;
            ((RecyclerView$u)object3).o();
        }
        object3 = recyclerView.mLayout;
        object2 = recyclerView.mState;
        ((RecyclerView$o)object3).onLayoutCompleted((RecyclerView$y)object2);
        this.onExitLayoutOrScroll();
        recyclerView.stopInterceptRequestLayout(false);
        object3 = recyclerView.mViewInfoStore;
        object2 = ((B)object3).a;
        ((a53)object2).clear();
        ((B)object3).b.d();
        object3 = recyclerView.mMinMaxLayoutPositions;
        object = object3[0];
        n3 = 1;
        object4 = object3[n3];
        object4 = recyclerView.didChildRangeChange((int)object, (int)object4);
        if (object4 != 0) {
            recyclerView.dispatchOnScrolled(0, 0);
        }
        this.recoverFocusFromState();
        this.resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        RecyclerView$r recyclerView$r = this.mInterceptingOnItemTouchListener;
        if (recyclerView$r == null) {
            int n3 = motionEvent.getAction();
            if (n3 == 0) {
                return false;
            }
            return this.findInterceptingOnItemTouchListener(motionEvent);
        }
        recyclerView$r.a(this, motionEvent);
        boolean bl2 = motionEvent.getAction();
        boolean bl3 = 3 != 0;
        boolean bl4 = true;
        if (bl2 == bl3 || bl2 == bl4) {
            boolean bl5 = false;
            motionEvent = null;
            this.mInterceptingOnItemTouchListener = null;
        }
        return bl4;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int n3 = motionEvent.getAction();
        ArrayList arrayList = this.mOnItemTouchListeners;
        int n4 = arrayList.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            RecyclerView$r recyclerView$r = (RecyclerView$r)this.mOnItemTouchListeners.get(i3);
            int n7 = recyclerView$r.c(this, motionEvent);
            if (n7 == 0 || n3 == (n7 = 3)) continue;
            this.mInterceptingOnItemTouchListener = recyclerView$r;
            return true;
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] nArray) {
        c_0 c_02 = this.mChildHelper;
        int n3 = c_02.e();
        int n4 = 1;
        if (n3 == 0) {
            nArray[0] = n3 = -1;
            nArray[n4] = n3;
            return;
        }
        int n7 = -1 >>> 1;
        int n8 = -1 << -1;
        for (int i3 = 0; i3 < n3; ++i3) {
            RecyclerView$B recyclerView$B = RecyclerView.getChildViewHolderInt(this.mChildHelper.d(i3));
            boolean bl2 = recyclerView$B.shouldIgnore();
            if (bl2) continue;
            int n10 = recyclerView$B.getLayoutPosition();
            if (n10 < n7) {
                n7 = n10;
            }
            if (n10 <= n8) continue;
            n8 = n10;
        }
        nArray[0] = n7;
        nArray[n4] = n8;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        int n3 = view instanceof ViewGroup;
        if (n3 == 0) {
            return null;
        }
        n3 = view instanceof RecyclerView;
        if (n3 != 0) {
            return (RecyclerView)view;
        }
        view = (ViewGroup)view;
        n3 = view.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            RecyclerView recyclerView = RecyclerView.findNestedRecyclerView(view.getChildAt(i3));
            if (recyclerView == null) continue;
            return recyclerView;
        }
        return null;
    }

    private View findNextViewToFocus() {
        RecyclerView$B recyclerView$B;
        View view;
        RecyclerView$y recyclerView$y = this.mState;
        int n3 = recyclerView$y.l;
        int n4 = -1;
        if (n3 == n4) {
            n3 = 0;
            view = null;
        }
        int n7 = recyclerView$y.b();
        for (n4 = n3; n4 < n7 && (recyclerView$B = this.findViewHolderForAdapterPosition(n4)) != null; ++n4) {
            View view2 = recyclerView$B.itemView;
            boolean bl2 = view2.hasFocusable();
            if (!bl2) continue;
            return recyclerView$B.itemView;
        }
        n7 = Math.min(n7, n3) + -1;
        while (true) {
            n3 = 0;
            view = null;
            if (n7 < 0) break;
            RecyclerView$B recyclerView$B2 = this.findViewHolderForAdapterPosition(n7);
            if (recyclerView$B2 == null) {
                return null;
            }
            view = recyclerView$B2.itemView;
            n3 = (int)(view.hasFocusable() ? 1 : 0);
            if (n3 != 0) {
                return recyclerView$B2.itemView;
            }
            n7 += -1;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean fling(int n3, int n4, int n7, int n8) {
        float f5;
        int n10;
        int n14;
        float f6;
        Object object;
        float f7;
        int n15;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        RecyclerView$o recyclerView$o;
        block25: {
            block21: {
                EdgeEffect edgeEffect;
                block23: {
                    block24: {
                        float f8;
                        EdgeEffect edgeEffect2;
                        block22: {
                            float f11;
                            block20: {
                                EdgeEffect edgeEffect3;
                                block16: {
                                    EdgeEffect edgeEffect4;
                                    block18: {
                                        block19: {
                                            float f12;
                                            block17: {
                                                float f14;
                                                recyclerView$o = this.mLayout;
                                                bl4 = false;
                                                if (recyclerView$o == null) {
                                                    return false;
                                                }
                                                bl3 = this.mLayoutSuppressed;
                                                if (bl3) {
                                                    return false;
                                                }
                                                bl2 = recyclerView$o.canScrollHorizontally();
                                                RecyclerView$o recyclerView$o2 = this.mLayout;
                                                bl3 = recyclerView$o2.canScrollVertically();
                                                if (!bl2 || (n15 = Math.abs(n3)) < n7) {
                                                    n3 = 0;
                                                    edgeEffect4 = null;
                                                }
                                                if (!bl3 || (n15 = Math.abs(n4)) < n7) {
                                                    n4 = 0;
                                                    f7 = 0.0f;
                                                    object = null;
                                                }
                                                if (n3 == 0 && n4 == 0) {
                                                    return false;
                                                }
                                                n7 = 0;
                                                edgeEffect = null;
                                                if (n3 == 0) break block16;
                                                edgeEffect3 = this.mLeftGlow;
                                                if (edgeEffect3 == null || (n15 = (int)((f14 = (f6 = kx0.a(edgeEffect3)) - 0.0f) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1))) == 0) break block17;
                                                edgeEffect3 = this.mLeftGlow;
                                                n14 = -n3;
                                                n10 = this.getWidth();
                                                n15 = (int)(this.shouldAbsorb(edgeEffect3, n14, n10) ? 1 : 0);
                                                if (n15 == 0) break block18;
                                                edgeEffect4 = this.mLeftGlow;
                                                edgeEffect4.onAbsorb(n14);
                                                break block19;
                                            }
                                            edgeEffect3 = this.mRightGlow;
                                            if (edgeEffect3 == null || (n15 = (int)((f12 = (f6 = kx0.a(edgeEffect3)) - 0.0f) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1))) == 0) break block16;
                                            edgeEffect3 = this.mRightGlow;
                                            n14 = this.getWidth();
                                            n15 = (int)(this.shouldAbsorb(edgeEffect3, n3, n14) ? 1 : 0);
                                            if (n15 == 0) break block18;
                                            edgeEffect3 = this.mRightGlow;
                                            edgeEffect3.onAbsorb(n3);
                                        }
                                        n3 = 0;
                                        edgeEffect4 = null;
                                    }
                                    n15 = n3;
                                    n3 = 0;
                                    edgeEffect4 = null;
                                    break block20;
                                }
                                n15 = 0;
                                f6 = 0.0f;
                                edgeEffect3 = null;
                            }
                            if (n4 == 0) break block21;
                            edgeEffect2 = this.mTopGlow;
                            if (edgeEffect2 == null || !(n14 = (int)((f11 = (f5 = kx0.a(edgeEffect2)) - 0.0f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)))) break block22;
                            edgeEffect = this.mTopGlow;
                            n14 = -n4;
                            n10 = this.getHeight();
                            n7 = (int)(this.shouldAbsorb(edgeEffect, n14, n10) ? 1 : 0);
                            if (n7 == 0) break block23;
                            object = this.mTopGlow;
                            object.onAbsorb(n14);
                            break block24;
                        }
                        edgeEffect2 = this.mBottomGlow;
                        if (edgeEffect2 == null || (n7 = (int)((f8 = (f5 = kx0.a(edgeEffect2)) - 0.0f) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1))) == 0) break block21;
                        edgeEffect = this.mBottomGlow;
                        n14 = this.getHeight();
                        n7 = (int)(this.shouldAbsorb(edgeEffect, n4, n14) ? 1 : 0);
                        if (n7 == 0) break block23;
                        edgeEffect = this.mBottomGlow;
                        edgeEffect.onAbsorb(n4);
                    }
                    n4 = 0;
                    f7 = 0.0f;
                    object = null;
                }
                n7 = 0;
                edgeEffect = null;
                break block25;
            }
            n7 = n4;
            n4 = 0;
            f7 = 0.0f;
            object = null;
        }
        n14 = 1;
        f5 = Float.MIN_VALUE;
        if (n15 != 0 || n4 != 0) {
            n10 = -n8;
            n15 = Math.min(n15, n8);
            n15 = Math.max(n10, n15);
            n4 = Math.min(n4, n8);
            n4 = Math.max(n10, n4);
            this.startNestedScrollForType(n14);
            RecyclerView$ViewFlinger recyclerView$ViewFlinger = this.mViewFlinger;
            recyclerView$ViewFlinger.a(n15, n4);
        }
        if (n3 == 0 && n7 == 0) {
            if (n15 != 0) return true;
            if (n4 == 0) return bl4;
            return true;
        }
        f7 = n3;
        f6 = n7;
        n10 = (int)(this.dispatchNestedPreFling(f7, f6) ? 1 : 0);
        if (n10 != 0) return false;
        if (!bl2 && !bl3) {
            bl2 = false;
            recyclerView$o = null;
        } else {
            bl2 = true;
        }
        this.dispatchNestedFling(f7, f6, bl2);
        object = this.mOnFlingListener;
        if (object != null && (n4 = (int)(((RecyclerView$q)object).onFling(n3, n7) ? 1 : 0)) != 0) {
            return n14 != 0;
        }
        if (!bl2) return false;
        this.startNestedScrollForType(n14);
        n4 = -n8;
        n3 = Math.min(n3, n8);
        n3 = Math.max(n4, n3);
        n7 = Math.min(n7, n8);
        n4 = Math.max(n4, n7);
        this.mViewFlinger.a(n3, n4);
        return n14 != 0;
    }

    public static RecyclerView$B getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((RecyclerView$LayoutParams)view.getLayoutParams()).mViewHolder;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        Rect rect2 = recyclerView$LayoutParams.mDecorInsets;
        int n3 = view.getLeft();
        int n4 = rect2.left;
        n3 -= n4;
        n4 = recyclerView$LayoutParams.leftMargin;
        n3 -= n4;
        n4 = view.getTop();
        int n7 = rect2.top;
        n4 -= n7;
        n7 = recyclerView$LayoutParams.topMargin;
        n4 -= n7;
        n7 = view.getRight();
        int n8 = rect2.right;
        n7 += n8;
        n8 = recyclerView$LayoutParams.rightMargin;
        int n10 = view.getBottom();
        int n14 = rect2.bottom;
        n10 += n14;
        int n15 = recyclerView$LayoutParams.bottomMargin;
        rect.set(n3, n4, n7 += n8, n10 += n15);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int n3;
        int n4 = view.getId();
        while ((n3 = view.isFocused()) == 0 && (n3 = view instanceof ViewGroup) != 0 && (n3 = view.hasFocus()) != 0) {
            int n7;
            n3 = (view = ((ViewGroup)view).getFocusedChild()).getId();
            if (n3 == (n7 = -1)) continue;
            n4 = view.getId();
        }
        return n4;
    }

    private String getFullClassName(Context object, String string2) {
        char c2;
        CharSequence charSequence = null;
        char c3 = string2.charAt(0);
        if (c3 == (c2 = '.')) {
            charSequence = new StringBuilder();
            object = object.getPackageName();
            charSequence.append((String)object);
            charSequence.append(string2);
            return charSequence.toString();
        }
        object = ".";
        boolean bl2 = string2.contains((CharSequence)object);
        if (bl2) {
            return string2;
        }
        object = new StringBuilder();
        charSequence = RecyclerView.class.getPackage().getName();
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append(c2);
        ((StringBuilder)object).append(string2);
        return ((StringBuilder)object).toString();
    }

    private vU1 getScrollingChildHelper() {
        vU1 vU12 = this.mScrollingChildHelper;
        if (vU12 == null) {
            this.mScrollingChildHelper = vU12 = new vU1((View)this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int n3) {
        float f5 = (float)Math.abs(n3) * 0.35f;
        float f6 = this.mPhysicalCoef;
        float f7 = 0.015f;
        double d2 = Math.log(f5 / (f6 *= f7));
        f5 = DECELERATION_RATE;
        double d5 = (double)f5 - 1.0;
        double d7 = this.mPhysicalCoef * f7;
        return (float)(Math.exp((double)f5 / d5 * d2) * d7);
    }

    private void handleMissingPreInfoForChangeError(long l2, RecyclerView$B recyclerView$B, RecyclerView$B object) {
        c_0 c_02 = this.mChildHelper;
        int n3 = c_02.e();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            long l3;
            long l4;
            long l7;
            RecyclerView$B recyclerView$B2 = RecyclerView.getChildViewHolderInt(this.mChildHelper.d(i3));
            if (recyclerView$B2 == recyclerView$B || (l7 = (l4 = (l3 = this.getChangedHolderKey(recyclerView$B2)) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) continue;
            Object object2 = this.mAdapter;
            String string2 = " \n View Holder 2:";
            if (object2 != null && (bl2 = ((RecyclerView$f)object2).hasStableIds())) {
                object = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                ((StringBuilder)object).append(recyclerView$B2);
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append(recyclerView$B);
                string2 = lu_0.a(this, (StringBuilder)object);
                object2 = new IllegalStateException(string2);
                throw object2;
            }
            object = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
            ((StringBuilder)object).append(recyclerView$B2);
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(recyclerView$B);
            string2 = lu_0.a(this, (StringBuilder)object);
            object2 = new IllegalStateException(string2);
            throw object2;
        }
        Objects.toString(object);
        Objects.toString(recyclerView$B);
        this.exceptionLabel();
    }

    private boolean hasUpdatedView() {
        c_0 c_02 = this.mChildHelper;
        int n3 = c_02.e();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            boolean bl3;
            RecyclerView$B recyclerView$B = RecyclerView.getChildViewHolderInt(this.mChildHelper.d(i3));
            if (recyclerView$B == null || (bl3 = recyclerView$B.shouldIgnore()) || !(bl2 = recyclerView$B.isUpdated())) continue;
            return true;
        }
        return false;
    }

    private void initAutofill() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        int n7 = n3 >= n4 ? ViewCompat$f.a((View)this) : 0;
        if (n7 == 0 && n3 >= n4) {
            n3 = 8;
            ViewCompat$f.b((View)this, n3);
        }
    }

    private void initChildrenHelper() {
        c_0 c_02;
        RecyclerView$d recyclerView$d = new RecyclerView$d(this);
        this.mChildHelper = c_02 = new c_0(recyclerView$d);
    }

    private boolean isPreferredNextFocus(View object, View object2, int n3) {
        boolean bl2 = false;
        if (object2 != null && object2 != this && object2 != object) {
            int n4;
            int n7;
            int n8;
            int n10;
            View view = this.findContainingItemView((View)object2);
            if (view == null) {
                return false;
            }
            int n14 = 1;
            if (object == null) {
                return n14 != 0;
            }
            View view2 = this.findContainingItemView((View)object);
            if (view2 == null) {
                return n14 != 0;
            }
            view2 = this.mTempRect;
            int n15 = object.getWidth();
            int n16 = object.getHeight();
            view2.set(0, 0, n15, n16);
            view2 = this.mTempRect2;
            n15 = object2.getWidth();
            n16 = object2.getHeight();
            view2.set(0, 0, n15, n16);
            view2 = this.mTempRect;
            this.offsetDescendantRectToMyCoords((View)object, (Rect)view2);
            object = this.mTempRect2;
            this.offsetDescendantRectToMyCoords((View)object2, (Rect)object);
            object = this.mLayout;
            int n17 = ((RecyclerView$o)object).getLayoutDirection();
            int n18 = -1;
            n17 = n17 == n14 ? -1 : 1;
            view2 = this.mTempRect;
            n15 = view2.left;
            Rect rect = this.mTempRect2;
            int n19 = rect.left;
            n15 = (n15 < n19 || (n10 = view2.right) <= n19) && (n10 = view2.right) < (n8 = rect.right) ? 1 : (((n10 = view2.right) > (n8 = rect.right) || n15 >= n8) && n15 > n19 ? -1 : 0);
            n19 = view2.top;
            n10 = rect.top;
            if ((n19 < n10 || (n8 = view2.bottom) <= n10) && (n8 = view2.bottom) < (n7 = rect.bottom)) {
                n18 = 1;
            } else {
                n4 = view2.bottom;
                n16 = rect.bottom;
                if (n4 <= n16 && n19 < n16 || n19 <= n10) {
                    n18 = 0;
                    object2 = null;
                }
            }
            if (n3 != n14) {
                n4 = 2;
                if (n3 != n4) {
                    n17 = 17;
                    if (n3 != n17) {
                        n17 = 33;
                        if (n3 != n17) {
                            n17 = 66;
                            if (n3 != n17) {
                                n17 = 130;
                                if (n3 == n17) {
                                    if (n18 > 0) {
                                        bl2 = true;
                                    }
                                    return bl2;
                                }
                                object2 = new StringBuilder("Invalid direction: ");
                                ((StringBuilder)object2).append(n3);
                                object2 = lu_0.a(this, (StringBuilder)object2);
                                object = new IllegalArgumentException((String)object2);
                                throw object;
                            }
                            if (n15 > 0) {
                                bl2 = true;
                            }
                            return bl2;
                        }
                        if (n18 < 0) {
                            bl2 = true;
                        }
                        return bl2;
                    }
                    if (n15 < 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                if (n18 > 0 || n18 == 0 && (n15 *= n17) > 0) {
                    bl2 = true;
                }
                return bl2;
            }
            if (n18 < 0 || n18 == 0 && (n15 *= n17) < 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    private void nestedScrollByInternal(int n3, int n4, MotionEvent object, int n7) {
        void var10_13;
        float f5;
        int n8;
        float f6;
        int n10;
        RecyclerView$o recyclerView$o = this.mLayout;
        if (recyclerView$o == null) {
            return;
        }
        boolean bl2 = this.mLayoutSuppressed;
        if (bl2) {
            return;
        }
        Object object2 = this.mReusableIntPair;
        int n14 = 0;
        object2[0] = 0;
        int n15 = 1;
        object2[n15] = 0;
        int n16 = recyclerView$o.canScrollHorizontally();
        object2 = this.mLayout;
        bl2 = ((RecyclerView$o)object2).canScrollVertically();
        int n17 = bl2 ? n16 | 2 : n16;
        int n18 = 0x40000000;
        float f7 = 2.0f;
        if (object == null) {
            n10 = this.getHeight();
            f6 = (float)n10 / f7;
        } else {
            f6 = object.getY();
        }
        if (object == null) {
            n8 = this.getWidth();
            f5 = (float)n8 / f7;
        } else {
            f5 = object.getX();
        }
        n18 = this.releaseHorizontalGlow(n3, f6);
        n3 -= n18;
        n18 = this.releaseVerticalGlow(n4, f5);
        n4 -= n18;
        this.startNestedScroll(n17, n7);
        if (n16 != 0) {
            n10 = n3;
        } else {
            n10 = 0;
            f6 = 0.0f;
        }
        if (bl2) {
            n8 = n4;
        } else {
            n8 = 0;
            f5 = 0.0f;
        }
        int[] nArray = this.mReusableIntPair;
        int[] nArray2 = this.mScrollOffset;
        n17 = (int)(this.dispatchNestedPreScroll(n10, n8, nArray, nArray2, n7) ? 1 : 0);
        if (n17 != 0) {
            int[] nArray3 = this.mReusableIntPair;
            n18 = nArray3[0];
            n3 -= n18;
            n15 = nArray3[n15];
            n4 -= n15;
        }
        if (n16 != 0) {
            int n19 = n3;
        } else {
            boolean bl3 = false;
            recyclerView$o = null;
        }
        if (bl2) {
            n14 = n4;
        }
        this.scrollByInternal((int)var10_13, n14, (MotionEvent)object, n7);
        object = this.mGapWorker;
        if (object != null && (n3 != 0 || n4 != 0)) {
            ((GapWorker)object).a(this, n3, n4);
        }
        this.stopNestedScroll(n7);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int n3;
        int n4 = motionEvent.getActionIndex();
        int n7 = motionEvent.getPointerId(n4);
        if (n7 == (n3 = this.mScrollPointerId)) {
            int n8;
            n4 = n4 == 0 ? 1 : 0;
            this.mScrollPointerId = n7 = motionEvent.getPointerId(n4);
            float f5 = motionEvent.getX(n4);
            n3 = 0x3F000000;
            float f6 = 0.5f;
            this.mLastTouchX = n7 = (int)(f5 += f6);
            this.mInitialTouchX = n7;
            float f7 = motionEvent.getY(n4) + f6;
            this.mLastTouchY = n8 = (int)f7;
            this.mInitialTouchY = n8;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        boolean bl2;
        Object object = this.mItemAnimator;
        if (object != null && (bl2 = ((RecyclerView$o)(object = this.mLayout)).supportsPredictiveItemAnimations())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    private void processAdapterUpdatesAndSetAnimationFlags() {
        block9: {
            var1_1 = this.mDataSetHasChangedAfterLayout;
            var2_2 = false;
            if (var1_1) {
                var3_3 = this.mAdapterHelper;
                var4_4 = var3_3.b;
                var3_3.l(var4_4);
                var4_4 = var3_3.c;
                var3_3.l(var4_4);
                var3_3.f = 0;
                var1_1 = this.mDispatchItemsChangedEvent;
                if (var1_1) {
                    var3_3 = this.mLayout;
                    var3_3.onItemsChanged(this);
                }
            }
            if (var1_1 = this.predictiveItemAnimationsEnabled()) {
                var3_3 = this.mAdapterHelper;
                var3_3.j();
            } else {
                var3_3 = this.mAdapterHelper;
                var3_3.c();
            }
            var1_1 = this.mItemsAddedOrRemoved;
            if (!var1_1 && !(var1_1 = this.mItemsChanged)) {
                var1_1 = false;
                var3_3 = null;
            } else {
                var1_1 = true;
            }
            var5_5 = this.mState;
            var6_6 = this.mFirstLayoutComplete;
            if (!var6_6 || (var7_7 = this.mItemAnimator) == null) ** GOTO lbl-1000
            var6_6 = this.mDataSetHasChangedAfterLayout;
            if (var6_6 || var1_1) break block9;
            var8_8 = this.mLayout;
            var9_9 = var8_8.mRequestedSimpleAnimations;
            if (!var9_9) ** GOTO lbl-1000
        }
        if (!var6_6 || (var6_6 = (var7_7 = this.mAdapter).hasStableIds())) {
            var6_6 = true;
        } else lbl-1000:
        // 3 sources

        {
            var6_6 = false;
            var7_7 = null;
        }
        var5_5.j = var6_6;
        var5_5 = this.mState;
        var6_6 = var5_5.j;
        if (var6_6 && var1_1 && !(var1_1 = this.mDataSetHasChangedAfterLayout) && (var1_1 = this.predictiveItemAnimationsEnabled())) {
            var2_2 = true;
        }
        var5_5.k = var2_2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void pullGlows(float var1_1, float var2_2, float var3_3, float var4_4) {
        var5_5 = 1.0f;
        var6_6 = true;
        cfr_temp_0 = var2_2 - 0.0f;
        var7_7 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
        if (var7_7 /* !! */  < 0) {
            this.ensureLeftGlow();
            var8_8 = this.mLeftGlow;
            var9_10 = -var2_2;
            var10_11 = this.getWidth();
            var9_10 /= var10_11;
            var11_13 = this.getHeight();
            var10_11 = var11_13;
            var3_3 /= var10_11;
            var3_3 = var5_5 - var3_3;
            kx0.b(var8_8, var9_10, var3_3);
lbl17:
            // 2 sources

            while (true) {
                var12_16 = true;
                var3_3 = 1.4E-45f;
                break;
            }
        } else {
            cfr_temp_1 = var2_2 - 0.0f;
            var7_7 /* !! */  = (float)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
            if (var7_7 /* !! */  > 0) {
                this.ensureRightGlow();
                var8_9 = this.mRightGlow;
                var13_15 = this.getWidth();
                var9_10 = var13_15;
                var9_10 = var2_2 / var9_10;
                var11_14 = this.getHeight();
                var10_12 = var11_14;
                kx0.b(var8_9, var9_10, var3_3 /= var10_12);
                ** continue;
            }
            var12_16 = false;
            var3_3 = 0.0f;
            var14_17 = null;
        }
        var7_7 /* !! */  = (cfr_temp_2 = var4_4 - 0.0f) == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1);
        if (var7_7 /* !! */  < 0) {
            this.ensureTopGlow();
            var14_17 = this.mTopGlow;
            var5_5 = -var4_4;
            var15_18 = this.getHeight();
            var5_5 /= var15_18;
            var7_7 /* !! */  = this.getWidth();
            var15_18 = var7_7 /* !! */ ;
            kx0.b(var14_17, var5_5, var1_1 /= var15_18);
        } else {
            cfr_temp_3 = var4_4 - 0.0f;
            var7_7 /* !! */  = (float)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1));
            if (var7_7 /* !! */  > 0) {
                this.ensureBottomGlow();
                var14_17 = this.mBottomGlow;
                var7_7 /* !! */  = this.getHeight();
                var15_19 = var7_7 /* !! */ ;
                var15_19 = var4_4 / var15_19;
                var13_15 = this.getWidth();
                var9_10 = var13_15;
                kx0.b(var14_17, var15_19, var5_5 -= (var1_1 /= var9_10));
            } else {
                var6_6 = var12_16;
            }
        }
        if (var6_6 || (var16_20 = (cfr_temp_4 = var2_2 - 0.0f) == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1)) != false || (var16_20 = (cfr_temp_5 = var4_4 - 0.0f) == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1)) != false) {
            this.postInvalidateOnAnimation();
        }
    }

    private void recoverFocusFromState() {
        int n3;
        Object object;
        int n4 = this.mPreserveFocusAfterLayout;
        if (n4 != 0 && (object = this.mAdapter) != null && (n4 = this.hasFocus()) != 0 && (n4 = this.getDescendantFocusability()) != (n3 = 393216) && ((n4 = this.getDescendantFocusability()) != (n3 = 131072) || (n4 = (int)(this.isFocused() ? 1 : 0)) == 0)) {
            View view;
            c_0 c_02;
            n4 = (int)(this.isFocused() ? 1 : 0);
            if (n4 == 0 && (n4 = (int)((c_02 = this.mChildHelper).k((View)(object = this.getFocusedChild())) ? 1 : 0)) == 0) {
                return;
            }
            object = this.mState;
            long l2 = ((RecyclerView$y)object).m;
            long l3 = -1;
            Object object2 = null;
            Object object3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (object3 != false && (n4 = (int)(((RecyclerView$f)(object = this.mAdapter)).hasStableIds() ? 1 : 0)) != 0) {
                l2 = this.mState.m;
                object = this.findViewHolderForItemId(l2);
            } else {
                n4 = 0;
                object = null;
            }
            if (object != null && (n3 = (int)((c_02 = this.mChildHelper).k(view = ((RecyclerView$B)object).itemView) ? 1 : 0)) == 0 && (n3 = (int)((c_02 = ((RecyclerView$B)object).itemView).hasFocusable() ? 1 : 0)) != 0) {
                object2 = ((RecyclerView$B)object).itemView;
            } else {
                object = this.mChildHelper;
                n4 = ((c_0)object).e();
                if (n4 > 0) {
                    object2 = this.findNextViewToFocus();
                }
            }
            if (object2 != null) {
                object = this.mState;
                n4 = ((RecyclerView$y)object).n;
                long l4 = n4;
                long l7 = l4 - l3;
                n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
                if (n3 != 0 && (object = object2.findViewById(n4)) != null && (n3 = (int)(object.isFocusable() ? 1 : 0)) != 0) {
                    object2 = object;
                }
                object2.requestFocus();
            }
        }
    }

    private void releaseGlows() {
        boolean bl2;
        boolean bl3;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            edgeEffect = this.mLeftGlow;
            bl3 = edgeEffect.isFinished();
        } else {
            bl3 = false;
            edgeEffect = null;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            edgeEffect2 = this.mTopGlow;
            bl2 = edgeEffect2.isFinished();
            bl3 |= bl2;
        }
        if ((edgeEffect2 = this.mRightGlow) != null) {
            edgeEffect2.onRelease();
            edgeEffect2 = this.mRightGlow;
            bl2 = edgeEffect2.isFinished();
            bl3 |= bl2;
        }
        if ((edgeEffect2 = this.mBottomGlow) != null) {
            edgeEffect2.onRelease();
            edgeEffect2 = this.mBottomGlow;
            bl2 = edgeEffect2.isFinished();
            bl3 |= bl2;
        }
        if (bl3) {
            this.postInvalidateOnAnimation();
        }
    }

    private int releaseHorizontalGlow(int n3, float f5) {
        float f6;
        float f7 = this.getHeight();
        f5 /= f7;
        float f8 = n3;
        int n4 = this.getWidth();
        f7 = n4;
        f8 /= f7;
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f11 = 0.0f;
        if (edgeEffect != null && (n4 = (int)((f6 = (f7 = kx0.a(edgeEffect)) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) != 0) {
            f7 = 0.0f / 0.0f;
            n4 = (int)(this.canScrollHorizontally(-1) ? 1 : 0);
            if (n4 != 0) {
                EdgeEffect edgeEffect2 = this.mLeftGlow;
                edgeEffect2.onRelease();
            } else {
                edgeEffect = this.mLeftGlow;
                f8 = -f8;
                float f12 = 1.0f - f5;
                f8 = -kx0.b(edgeEffect, f8, f12);
                EdgeEffect edgeEffect3 = this.mLeftGlow;
                f5 = kx0.a(edgeEffect3);
                float f14 = f5 - 0.0f;
                Object object = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                if (object == false) {
                    edgeEffect3 = this.mLeftGlow;
                    edgeEffect3.onRelease();
                }
                f11 = f8;
            }
            this.invalidate();
        } else {
            float f15;
            edgeEffect = this.mRightGlow;
            if (edgeEffect != null && (n4 = (int)((f15 = (f7 = kx0.a(edgeEffect)) - 0.0f) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1))) != 0) {
                f7 = Float.MIN_VALUE;
                n4 = (int)(this.canScrollHorizontally(1) ? 1 : 0);
                if (n4 != 0) {
                    EdgeEffect edgeEffect4 = this.mRightGlow;
                    edgeEffect4.onRelease();
                } else {
                    edgeEffect = this.mRightGlow;
                    f8 = kx0.b(edgeEffect, f8, f5);
                    EdgeEffect edgeEffect5 = this.mRightGlow;
                    f5 = kx0.a(edgeEffect5);
                    float f16 = f5 - 0.0f;
                    Object object = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                    if (object == false) {
                        edgeEffect5 = this.mRightGlow;
                        edgeEffect5.onRelease();
                    }
                    f11 = f8;
                }
                this.invalidate();
            }
        }
        f8 = this.getWidth();
        return Math.round(f11 * f8);
    }

    private int releaseVerticalGlow(int n3, float f5) {
        float f6;
        float f7 = this.getWidth();
        f5 /= f7;
        float f8 = n3;
        int n4 = this.getHeight();
        f7 = n4;
        f8 /= f7;
        EdgeEffect edgeEffect = this.mTopGlow;
        float f11 = 0.0f;
        if (edgeEffect != null && (n4 = (int)((f6 = (f7 = kx0.a(edgeEffect)) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) != 0) {
            f7 = 0.0f / 0.0f;
            n4 = (int)(this.canScrollVertically(-1) ? 1 : 0);
            if (n4 != 0) {
                EdgeEffect edgeEffect2 = this.mTopGlow;
                edgeEffect2.onRelease();
            } else {
                edgeEffect = this.mTopGlow;
                f8 = -f8;
                f8 = -kx0.b(edgeEffect, f8, f5);
                EdgeEffect edgeEffect3 = this.mTopGlow;
                f5 = kx0.a(edgeEffect3);
                float f12 = f5 - 0.0f;
                Object object = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                if (object == false) {
                    edgeEffect3 = this.mTopGlow;
                    edgeEffect3.onRelease();
                }
                f11 = f8;
            }
            this.invalidate();
        } else {
            float f14;
            edgeEffect = this.mBottomGlow;
            if (edgeEffect != null && (n4 = (int)((f14 = (f7 = kx0.a(edgeEffect)) - 0.0f) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1))) != 0) {
                f7 = Float.MIN_VALUE;
                n4 = (int)(this.canScrollVertically(1) ? 1 : 0);
                if (n4 != 0) {
                    EdgeEffect edgeEffect4 = this.mBottomGlow;
                    edgeEffect4.onRelease();
                } else {
                    edgeEffect = this.mBottomGlow;
                    float f15 = 1.0f - f5;
                    f8 = kx0.b(edgeEffect, f8, f15);
                    EdgeEffect edgeEffect5 = this.mBottomGlow;
                    f5 = kx0.a(edgeEffect5);
                    float f16 = f5 - 0.0f;
                    Object object = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                    if (object == false) {
                        edgeEffect5 = this.mBottomGlow;
                        edgeEffect5.onRelease();
                    }
                    f11 = f8;
                }
                this.invalidate();
            }
        }
        f8 = this.getHeight();
        return Math.round(f11 * f8);
    }

    private void requestChildOnScreen(View view, View view2) {
        int n3;
        Object object = view2 != null ? view2 : view;
        Rect rect = this.mTempRect;
        int n4 = object.getWidth();
        int n7 = object.getHeight();
        rect.set(0, 0, n4, n7);
        object = object.getLayoutParams();
        boolean bl2 = object instanceof RecyclerView$LayoutParams;
        if (bl2) {
            object = (RecyclerView$LayoutParams)((Object)object);
            bl2 = object.mInsetsDirty;
            if (!bl2) {
                object = object.mDecorInsets;
                rect = this.mTempRect;
                n4 = rect.left;
                n7 = object.left;
                rect.left = n4 -= n7;
                n4 = rect.right;
                n7 = object.right;
                rect.right = n4 += n7;
                n4 = rect.top;
                n7 = object.top;
                rect.top = n4 -= n7;
                n4 = rect.bottom;
                n3 = object.bottom;
                rect.bottom = n4 += n3;
            }
        }
        if (view2 != null) {
            object = this.mTempRect;
            this.offsetDescendantRectToMyCoords(view2, (Rect)object);
            object = this.mTempRect;
            this.offsetRectIntoDescendantCoords(view, (Rect)object);
        }
        RecyclerView$o recyclerView$o = this.mLayout;
        Rect rect2 = this.mTempRect;
        n3 = this.mFirstLayoutComplete;
        bl2 = true;
        boolean bl3 = n3 ^ true;
        boolean bl4 = view2 == null;
        recyclerView$o.requestChildRectangleOnScreen(this, view, rect2, bl3, bl4);
    }

    private void resetFocusInfo() {
        int n3;
        RecyclerView$y recyclerView$y = this.mState;
        recyclerView$y.m = -1;
        recyclerView$y.l = n3 = -1;
        recyclerView$y.n = n3;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        this.stopNestedScroll(0);
        this.releaseGlows();
    }

    private void saveFocusInfo() {
        Object object;
        boolean bl2 = this.mPreserveFocusAfterLayout;
        int n3 = 0;
        RecyclerView$B recyclerView$B = null;
        if (bl2 && (bl2 = this.hasFocus()) && (object = this.mAdapter) != null) {
            object = this.getFocusedChild();
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null) {
            recyclerView$B = this.findContainingViewHolder((View)object);
        }
        if (recyclerView$B == null) {
            this.resetFocusInfo();
        } else {
            object = this.mState;
            RecyclerView$f recyclerView$f = this.mAdapter;
            int n4 = recyclerView$f.hasStableIds();
            long l2 = n4 != 0 ? recyclerView$B.getItemId() : (long)-1;
            ((RecyclerView$y)object).m = l2;
            object = this.mState;
            n4 = this.mDataSetHasChangedAfterLayout;
            n4 = n4 != 0 ? -1 : ((n4 = (int)(recyclerView$B.isRemoved() ? 1 : 0)) != 0 ? recyclerView$B.mOldPosition : recyclerView$B.getAbsoluteAdapterPosition());
            ((RecyclerView$y)object).l = n4;
            object = this.mState;
            recyclerView$B = recyclerView$B.itemView;
            ((RecyclerView$y)object).n = n3 = this.getDeepestFocusedViewWithId((View)recyclerView$B);
        }
    }

    private void setAdapterInternal(RecyclerView$f object, boolean bl2, boolean n3) {
        int n4;
        int n7;
        Object object2;
        Object object3 = this.mAdapter;
        if (object3 != null) {
            object2 = this.mObserver;
            ((RecyclerView$f)object3).unregisterAdapterDataObserver((RecyclerView$h)object2);
            object3 = this.mAdapter;
            ((RecyclerView$f)object3).onDetachedFromRecyclerView(this);
        }
        if (!bl2 || n7 != 0) {
            this.removeAndRecycleViews();
        }
        Iterator iterator = this.mAdapterHelper;
        object3 = ((a_0)((Object)iterator)).b;
        ((a_0)((Object)iterator)).l((List)object3);
        object3 = ((a_0)((Object)iterator)).c;
        ((a_0)((Object)iterator)).l((List)object3);
        int n8 = 0;
        object3 = null;
        ((a_0)((Object)iterator)).f = 0;
        iterator = this.mAdapter;
        this.mAdapter = object;
        if (object != null) {
            object2 = this.mObserver;
            ((RecyclerView$f)object).registerAdapterDataObserver((RecyclerView$h)object2);
            ((RecyclerView$f)object).onAttachedToRecyclerView(this);
        }
        if ((object = this.mLayout) != null) {
            object2 = this.mAdapter;
            ((RecyclerView$o)object).onAdapterChanged((RecyclerView$f)((Object)iterator), (RecyclerView$f)object2);
        }
        object = this.mRecycler;
        object2 = this.mAdapter;
        ((RecyclerView$u)object).b();
        int n10 = 1;
        ((RecyclerView$u)object).g((RecyclerView$f)((Object)iterator), n10 != 0);
        RecyclerView$t recyclerView$t = ((RecyclerView$u)object).d();
        if (iterator != null) {
            recyclerView$t.b = n7 = recyclerView$t.b - n10;
        }
        if (!bl2 && (n4 = recyclerView$t.b) == 0) {
            Object object4;
            while (n8 < (n7 = (object4 = recyclerView$t.a).size())) {
                boolean bl3;
                object4 = (RecyclerView$t$a)object4.valueAt(n8);
                iterator = ((RecyclerView$t$a)object4).a.iterator();
                while (bl3 = iterator.hasNext()) {
                    View view = ((RecyclerView$B)iterator.next()).itemView;
                    vw2.a(view);
                }
                object4 = ((RecyclerView$t$a)object4).a;
                ((ArrayList)object4).clear();
                ++n8;
            }
        }
        if (object2 != null) {
            int n14;
            recyclerView$t.b = n14 = recyclerView$t.b + n10;
        } else {
            recyclerView$t.getClass();
        }
        ((RecyclerView$u)object).f();
        this.mState.f = n10;
    }

    public static void setDebugAssertionsEnabled(boolean bl2) {
        sDebugAssertionsEnabled = bl2;
    }

    public static void setVerboseLoggingEnabled(boolean bl2) {
        sVerboseLoggingEnabled = bl2;
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int n3, int n4) {
        boolean bl2 = true;
        if (n3 > 0) {
            return bl2;
        }
        float f5 = kx0.a(edgeEffect);
        float f6 = n4;
        float f7 = this.getSplineFlingDistance(n3 = -n3);
        float f8 = f7 - (f5 *= f6);
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object >= 0) {
            bl2 = false;
        }
        return bl2;
    }

    private void startNestedScrollForType(int n3) {
        int n4;
        RecyclerView$o recyclerView$o = this.mLayout;
        int n42 = recyclerView$o.canScrollHorizontally();
        RecyclerView$o recyclerView$o2 = this.mLayout;
        boolean bl2 = recyclerView$o2.canScrollVertically();
        if (bl2) {
            n4 = n42 | 2;
        }
        this.startNestedScroll(n4, n3);
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        float f5;
        EdgeEffect edgeEffect;
        float f6;
        float f7;
        float f8;
        float f11;
        int n3;
        float f12;
        float f14;
        float f15;
        int n4;
        EdgeEffect edgeEffect2 = this.mLeftGlow;
        float f16 = 1.0f;
        int n7 = -1;
        float f17 = 0.0f / 0.0f;
        int n8 = 1;
        if (edgeEffect2 != null && (n4 = (f15 = (f14 = kx0.a(edgeEffect2)) - 0.0f) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1)) != 0 && (n4 = this.canScrollHorizontally(n7)) == 0) {
            edgeEffect2 = this.mLeftGlow;
            f12 = motionEvent.getY();
            n3 = this.getHeight();
            f11 = n3;
            f12 /= f11;
            f12 = f16 - f12;
            kx0.b(edgeEffect2, 0.0f, f12);
            n4 = 1;
            f14 = Float.MIN_VALUE;
        } else {
            n4 = 0;
            f14 = 0.0f;
            edgeEffect2 = null;
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null && (f8 = (f7 = (f12 = kx0.a(edgeEffect3)) - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) != false && (f8 = (float)this.canScrollHorizontally(n8)) == false) {
            edgeEffect2 = this.mRightGlow;
            f12 = motionEvent.getY();
            n3 = this.getHeight();
            f11 = n3;
            kx0.b(edgeEffect2, 0.0f, f12 /= f11);
            n4 = 1;
            f14 = Float.MIN_VALUE;
        }
        if ((edgeEffect3 = this.mTopGlow) != null && (f8 = (f6 = (f12 = kx0.a(edgeEffect3)) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) != false && (n7 = (int)(this.canScrollVertically(n7) ? 1 : 0)) == 0) {
            edgeEffect2 = this.mTopGlow;
            f17 = motionEvent.getX();
            f8 = this.getWidth();
            f12 = f8;
            kx0.b(edgeEffect2, 0.0f, f17 /= f12);
            n4 = 1;
            f14 = Float.MIN_VALUE;
        }
        if ((edgeEffect = this.mBottomGlow) != null && (n7 = (int)((f5 = (f17 = kx0.a(edgeEffect)) - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) != 0 && (n7 = (int)(this.canScrollVertically(n8) ? 1 : 0)) == 0) {
            edgeEffect2 = this.mBottomGlow;
            float f18 = motionEvent.getX();
            n7 = this.getWidth();
            f17 = n7;
            kx0.b(edgeEffect2, 0.0f, f16 -= (f18 /= f17));
        } else {
            n8 = n4;
        }
        return n8 != 0;
    }

    private void stopScrollersInternal() {
        Object object = this.mViewFlinger;
        RecyclerView recyclerView = ((RecyclerView$ViewFlinger)object).g;
        recyclerView.removeCallbacks((Runnable)object);
        ((RecyclerView$ViewFlinger)object).c.abortAnimation();
        object = this.mLayout;
        if (object != null) {
            ((RecyclerView$o)object).stopSmoothScroller();
        }
    }

    public void absorbGlows(int n3, int n4) {
        int n7;
        boolean bl2;
        EdgeEffect edgeEffect;
        if (n3 < 0) {
            this.ensureLeftGlow();
            edgeEffect = this.mLeftGlow;
            bl2 = edgeEffect.isFinished();
            if (bl2) {
                edgeEffect = this.mLeftGlow;
                n7 = -n3;
                edgeEffect.onAbsorb(n7);
            }
        } else if (n3 > 0) {
            this.ensureRightGlow();
            edgeEffect = this.mRightGlow;
            bl2 = edgeEffect.isFinished();
            if (bl2) {
                edgeEffect = this.mRightGlow;
                edgeEffect.onAbsorb(n3);
            }
        }
        if (n4 < 0) {
            this.ensureTopGlow();
            edgeEffect = this.mTopGlow;
            bl2 = edgeEffect.isFinished();
            if (bl2) {
                edgeEffect = this.mTopGlow;
                n7 = -n4;
                edgeEffect.onAbsorb(n7);
            }
        } else if (n4 > 0) {
            this.ensureBottomGlow();
            edgeEffect = this.mBottomGlow;
            bl2 = edgeEffect.isFinished();
            if (bl2) {
                edgeEffect = this.mBottomGlow;
                edgeEffect.onAbsorb(n4);
            }
        }
        if (n3 != 0 || n4 != 0) {
            this.postInvalidateOnAnimation();
        }
    }

    public void addFocusables(ArrayList arrayList, int n3, int n4) {
        boolean bl2;
        RecyclerView$o recyclerView$o = this.mLayout;
        if (recyclerView$o == null || !(bl2 = recyclerView$o.onAddFocusables(this, arrayList, n3, n4))) {
            super.addFocusables(arrayList, n3, n4);
        }
    }

    public void addItemDecoration(RecyclerView$n recyclerView$n) {
        this.addItemDecoration(recyclerView$n, -1);
    }

    public void addItemDecoration(RecyclerView$n recyclerView$n, int n3) {
        boolean bl2;
        Object object = this.mLayout;
        if (object != null) {
            String string2 = "Cannot add item decoration during a scroll  or layout";
            ((RecyclerView$o)object).assertNotInLayoutOrScroll(string2);
        }
        if (bl2 = ((ArrayList)(object = this.mItemDecorations)).isEmpty()) {
            bl2 = false;
            object = null;
            this.setWillNotDraw(false);
        }
        if (n3 < 0) {
            ArrayList arrayList = this.mItemDecorations;
            arrayList.add(recyclerView$n);
        } else {
            object = this.mItemDecorations;
            ((ArrayList)object).add(n3, recyclerView$n);
        }
        this.markItemDecorInsetsDirty();
        this.requestLayout();
    }

    public void addOnChildAttachStateChangeListener(RecyclerView$p recyclerView$p) {
        ArrayList arrayList = this.mOnChildAttachStateListeners;
        if (arrayList == null) {
            this.mOnChildAttachStateListeners = arrayList = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(recyclerView$p);
    }

    public void addOnItemTouchListener(RecyclerView$r recyclerView$r) {
        this.mOnItemTouchListeners.add(recyclerView$r);
    }

    public void addOnScrollListener(RecyclerView$s recyclerView$s) {
        ArrayList arrayList = this.mScrollListeners;
        if (arrayList == null) {
            this.mScrollListeners = arrayList = new ArrayList();
        }
        this.mScrollListeners.add(recyclerView$s);
    }

    public void addRecyclerListener(RecyclerView$v recyclerView$v) {
        boolean bl2 = recyclerView$v != null;
        B41.a(bl2, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(recyclerView$v);
    }

    /*
     * Unable to fully structure code
     */
    public void animateAppearance(RecyclerView$B var1_1, RecyclerView$l$c var2_2, RecyclerView$l$c var3_3) {
        var4_4 = 0;
        var1_1.setIsRecyclable(false);
        var6_6 = var5_5 = this.mItemAnimator;
        var6_6 = (x)var5_5;
        if (var2_2 == null) ** GOTO lbl-1000
        var6_6.getClass();
        var7_7 = var2_2.a;
        var8_8 = var3_3.a;
        if (var7_7 != var8_8 || (var4_4 = var2_2.b) != (var9_9 = var3_3.b)) {
            var10_10 = var2_2.b;
            var11_11 = var3_3.b;
            var12_12 = var6_6.j(var1_1, var7_7, var10_10, var8_8, var11_11);
        } else lbl-1000:
        // 2 sources

        {
            var6_6.h(var1_1);
            var12_12 = true;
        }
        if (var12_12) {
            this.postAnimationRunner();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void animateDisappearance(RecyclerView$B recyclerView$B, RecyclerView$l$c recyclerView$l$c, RecyclerView$l$c recyclerView$l$c2) {
        boolean bl2;
        RecyclerView$l recyclerView$l;
        this.addAnimatingView(recyclerView$B);
        int n3 = 0;
        recyclerView$B.setIsRecyclable(false);
        RecyclerView$l recyclerView$l2 = recyclerView$l = this.mItemAnimator;
        recyclerView$l2 = (x)recyclerView$l;
        recyclerView$l2.getClass();
        int n4 = recyclerView$l$c.a;
        int n7 = recyclerView$l$c.b;
        recyclerView$l$c = recyclerView$B.itemView;
        n3 = recyclerView$l$c2 == null ? recyclerView$l$c.getLeft() : recyclerView$l$c2.a;
        int n8 = n3;
        int n10 = recyclerView$l$c2 == null ? recyclerView$l$c.getTop() : recyclerView$l$c2.b;
        int n14 = n10;
        n10 = (int)(recyclerView$B.isRemoved() ? 1 : 0);
        if (n10 == 0 && (n4 != n8 || n7 != n14)) {
            n10 = recyclerView$l$c.getWidth() + n8;
            n3 = recyclerView$l$c.getHeight() + n14;
            recyclerView$l$c.layout(n8, n14, n10, n3);
            bl2 = ((x)recyclerView$l2).j(recyclerView$B, n4, n7, n8, n14);
        } else {
            ((x)recyclerView$l2).k(recyclerView$B);
            bl2 = true;
        }
        if (bl2) {
            this.postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String object) {
        boolean bl2 = this.isComputingLayout();
        if (!bl2) {
            if (object == null) {
                CharSequence charSequence = new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling");
                charSequence = lu_0.a(this, charSequence);
                object = new IllegalStateException((String)charSequence);
                throw object;
            }
            object = Ex0.a((String)object);
            object = lu_0.a(this, (StringBuilder)object);
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
    }

    public void assertNotInLayoutOrScroll(String object) {
        boolean bl2 = this.isComputingLayout();
        if (bl2) {
            if (object == null) {
                CharSequence charSequence = new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling");
                charSequence = lu_0.a(this, charSequence);
                object = new IllegalStateException((String)charSequence);
                throw object;
            }
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        int n3 = this.mDispatchScrollCounter;
        if (n3 > 0) {
            String string2 = "";
            CharSequence charSequence = new StringBuilder(string2);
            charSequence = lu_0.a(this, charSequence);
            object = new IllegalStateException((String)charSequence);
        }
    }

    public boolean canReuseUpdatedViewHolder(RecyclerView$B recyclerView$B) {
        List list;
        boolean bl2;
        RecyclerView$l recyclerView$l = this.mItemAnimator;
        if (recyclerView$l != null && !(bl2 = recyclerView$l.b(recyclerView$B, list = recyclerView$B.getUnmodifiedPayloads()))) {
            bl2 = false;
            recyclerView$B = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams object) {
        RecyclerView$o recyclerView$o;
        boolean bl2;
        boolean bl3 = object instanceof RecyclerView$LayoutParams;
        if (bl3 && (bl2 = (recyclerView$o = this.mLayout).checkLayoutParams((RecyclerView$LayoutParams)((Object)(object = (RecyclerView$LayoutParams)((Object)object)))))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public void clearOldPositions() {
        RecyclerView$B recyclerView$B;
        int n3;
        RecyclerView$B recyclerView$B2;
        int n4;
        Object object = this.mChildHelper;
        int n7 = ((c_0)object).h();
        int n8 = 0;
        ArrayList arrayList = null;
        for (n4 = 0; n4 < n7; ++n4) {
            recyclerView$B2 = RecyclerView.getChildViewHolderInt(this.mChildHelper.g(n4));
            n3 = recyclerView$B2.shouldIgnore();
            if (n3 != 0) continue;
            recyclerView$B2.clearOldPosition();
        }
        object = this.mRecycler;
        arrayList = ((RecyclerView$u)object).c;
        int n10 = arrayList.size();
        for (n3 = 0; n3 < n10; ++n3) {
            recyclerView$B = (RecyclerView$B)arrayList.get(n3);
            recyclerView$B.clearOldPosition();
        }
        arrayList = ((RecyclerView$u)object).a;
        n10 = arrayList.size();
        for (n3 = 0; n3 < n10; ++n3) {
            recyclerView$B = (RecyclerView$B)arrayList.get(n3);
            recyclerView$B.clearOldPosition();
        }
        arrayList = ((RecyclerView$u)object).b;
        if (arrayList != null) {
            n4 = arrayList.size();
            while (n8 < n4) {
                recyclerView$B2 = (RecyclerView$B)((RecyclerView$u)object).b.get(n8);
                recyclerView$B2.clearOldPosition();
                ++n8;
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        RecyclerView$o recyclerView$o = this.mLayout;
        int n3 = 0;
        RecyclerView$y recyclerView$y = null;
        if (recyclerView$o == null) {
            return 0;
        }
        boolean bl2 = recyclerView$o.canScrollHorizontally();
        if (bl2) {
            recyclerView$o = this.mLayout;
            recyclerView$y = this.mState;
            n3 = recyclerView$o.computeHorizontalScrollExtent(recyclerView$y);
        }
        return n3;
    }

    public int computeHorizontalScrollOffset() {
        RecyclerView$o recyclerView$o = this.mLayout;
        int n3 = 0;
        RecyclerView$y recyclerView$y = null;
        if (recyclerView$o == null) {
            return 0;
        }
        boolean bl2 = recyclerView$o.canScrollHorizontally();
        if (bl2) {
            recyclerView$o = this.mLayout;
            recyclerView$y = this.mState;
            n3 = recyclerView$o.computeHorizontalScrollOffset(recyclerView$y);
        }
        return n3;
    }

    public int computeHorizontalScrollRange() {
        RecyclerView$o recyclerView$o = this.mLayout;
        int n3 = 0;
        RecyclerView$y recyclerView$y = null;
        if (recyclerView$o == null) {
            return 0;
        }
        boolean bl2 = recyclerView$o.canScrollHorizontally();
        if (bl2) {
            recyclerView$o = this.mLayout;
            recyclerView$y = this.mState;
            n3 = recyclerView$o.computeHorizontalScrollRange(recyclerView$y);
        }
        return n3;
    }

    public int computeVerticalScrollExtent() {
        RecyclerView$o recyclerView$o = this.mLayout;
        int n3 = 0;
        RecyclerView$y recyclerView$y = null;
        if (recyclerView$o == null) {
            return 0;
        }
        boolean bl2 = recyclerView$o.canScrollVertically();
        if (bl2) {
            recyclerView$o = this.mLayout;
            recyclerView$y = this.mState;
            n3 = recyclerView$o.computeVerticalScrollExtent(recyclerView$y);
        }
        return n3;
    }

    public int computeVerticalScrollOffset() {
        RecyclerView$o recyclerView$o = this.mLayout;
        int n3 = 0;
        RecyclerView$y recyclerView$y = null;
        if (recyclerView$o == null) {
            return 0;
        }
        boolean bl2 = recyclerView$o.canScrollVertically();
        if (bl2) {
            recyclerView$o = this.mLayout;
            recyclerView$y = this.mState;
            n3 = recyclerView$o.computeVerticalScrollOffset(recyclerView$y);
        }
        return n3;
    }

    public int computeVerticalScrollRange() {
        RecyclerView$o recyclerView$o = this.mLayout;
        int n3 = 0;
        RecyclerView$y recyclerView$y = null;
        if (recyclerView$o == null) {
            return 0;
        }
        boolean bl2 = recyclerView$o.canScrollVertically();
        if (bl2) {
            recyclerView$o = this.mLayout;
            recyclerView$y = this.mState;
            n3 = recyclerView$o.computeVerticalScrollRange(recyclerView$y);
        }
        return n3;
    }

    public void considerReleasingGlowsOnScroll(int n3, int n4) {
        EdgeEffect edgeEffect;
        boolean bl2;
        int n7;
        EdgeEffect edgeEffect2 = this.mLeftGlow;
        if (edgeEffect2 != null && (n7 = edgeEffect2.isFinished()) == 0 && n3 > 0) {
            this.mLeftGlow.onRelease();
            edgeEffect2 = this.mLeftGlow;
            n7 = edgeEffect2.isFinished();
        } else {
            n7 = 0;
            edgeEffect2 = null;
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null && !(bl2 = edgeEffect3.isFinished()) && n3 < 0) {
            this.mRightGlow.onRelease();
            edgeEffect = this.mRightGlow;
            n3 = (int)(edgeEffect.isFinished() ? 1 : 0);
            n7 |= n3;
        }
        if ((edgeEffect = this.mTopGlow) != null && (n3 = (int)(edgeEffect.isFinished() ? 1 : 0)) == 0 && n4 > 0) {
            this.mTopGlow.onRelease();
            edgeEffect = this.mTopGlow;
            n3 = (int)(edgeEffect.isFinished() ? 1 : 0);
            n7 |= n3;
        }
        if ((edgeEffect = this.mBottomGlow) != null && (n3 = (int)(edgeEffect.isFinished() ? 1 : 0)) == 0 && n4 < 0) {
            this.mBottomGlow.onRelease();
            edgeEffect = this.mBottomGlow;
            n3 = (int)(edgeEffect.isFinished() ? 1 : 0);
            n7 |= n3;
        }
        if (n7 != 0) {
            this.postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int n3) {
        EdgeEffect edgeEffect = this.mLeftGlow;
        EdgeEffect edgeEffect2 = this.mRightGlow;
        int n4 = this.getWidth();
        return this.consumeFlingInStretch(n3, edgeEffect, edgeEffect2, n4);
    }

    public int consumeFlingInVerticalStretch(int n3) {
        EdgeEffect edgeEffect = this.mTopGlow;
        EdgeEffect edgeEffect2 = this.mBottomGlow;
        int n4 = this.getHeight();
        return this.consumeFlingInStretch(n3, edgeEffect, edgeEffect2, n4);
    }

    public void consumePendingUpdateOperations() {
        boolean bl2 = this.mFirstLayoutComplete;
        String string2 = TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG;
        if (bl2 && !(bl2 = this.mDataSetHasChangedAfterLayout)) {
            a_0 a_02 = this.mAdapterHelper;
            bl2 = a_02.g();
            if (!bl2) {
                return;
            }
            a_02 = this.mAdapterHelper;
            int n3 = a_02.f;
            int n4 = n3 & 4;
            if (n4 != 0 && (n3 &= 0xB) == 0) {
                Trace.beginSection((String)TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                this.startInterceptRequestLayout();
                this.onEnterLayoutOrScroll();
                a_02 = this.mAdapterHelper;
                a_02.j();
                bl2 = this.mLayoutWasDefered;
                if (!bl2) {
                    bl2 = this.hasUpdatedView();
                    if (bl2) {
                        this.dispatchLayout();
                    } else {
                        a_02 = this.mAdapterHelper;
                        a_02.b();
                    }
                }
                bl2 = true;
                this.stopInterceptRequestLayout(bl2);
                this.onExitLayoutOrScroll();
                Trace.endSection();
            } else {
                bl2 = a_02.g();
                if (bl2) {
                    Trace.beginSection((String)string2);
                    this.dispatchLayout();
                    Trace.endSection();
                }
            }
            return;
        }
        Trace.beginSection((String)string2);
        this.dispatchLayout();
        Trace.endSection();
    }

    public void defaultOnMeasure(int n3, int n4) {
        int n7 = this.getPaddingLeft();
        int n8 = this.getPaddingRight() + n7;
        n7 = this.getMinimumWidth();
        n3 = RecyclerView$o.chooseSize(n3, n8, n7);
        n7 = this.getPaddingTop();
        n8 = this.getPaddingBottom() + n7;
        n7 = this.getMinimumHeight();
        n4 = RecyclerView$o.chooseSize(n4, n8, n7);
        this.setMeasuredDimension(n3, n4);
    }

    public void dispatchChildAttached(View view) {
        Object object = RecyclerView.getChildViewHolderInt(view);
        this.onChildAttachedToWindow(view);
        Object object2 = this.mAdapter;
        if (object2 != null && object != null) {
            ((RecyclerView$f)object2).onViewAttachedToWindow((RecyclerView$B)object);
        }
        if ((object = this.mOnChildAttachStateListeners) != null) {
            for (int i3 = object.size() + -1; i3 >= 0; i3 += -1) {
                object2 = (RecyclerView$p)this.mOnChildAttachStateListeners.get(i3);
                object2.d(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        Object object = RecyclerView.getChildViewHolderInt(view);
        this.onChildDetachedFromWindow(view);
        Object object2 = this.mAdapter;
        if (object2 != null && object != null) {
            ((RecyclerView$f)object2).onViewDetachedFromWindow((RecyclerView$B)object);
        }
        if ((object = this.mOnChildAttachStateListeners) != null) {
            for (int i3 = object.size() + -1; i3 >= 0; i3 += -1) {
                object2 = (RecyclerView$p)this.mOnChildAttachStateListeners.get(i3);
                object2.b(view);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean dispatchKeyEvent(KeyEvent object) {
        int n3 = super.dispatchKeyEvent((KeyEvent)object);
        boolean bl2 = true;
        if (n3 != 0) {
            return bl2;
        }
        RecyclerView$o recyclerView$o = this.getLayoutManager();
        int n4 = 0;
        if (recyclerView$o == null) {
            return false;
        }
        boolean bl3 = recyclerView$o.canScrollVertically();
        int n7 = 123;
        int n8 = 92;
        int n10 = -1 << -1;
        int n14 = 122;
        int n15 = 93;
        if (bl3) {
            int n16 = object.getKeyCode();
            if (n16 != n8 && n16 != n15) {
                if (n16 != n14 && n16 != n7) return false;
                n3 = (int)(recyclerView$o.isLayoutReversed() ? 1 : 0);
                if (n16 == n14) {
                    if (n3 != 0) {
                        object = this.getAdapter();
                        n4 = ((RecyclerView$f)object).getItemCount();
                    }
                } else if (n3 == 0) {
                    object = this.getAdapter();
                    n4 = ((RecyclerView$f)object).getItemCount();
                }
                this.smoothScrollToPosition(n4);
                return bl2;
            }
            n3 = this.getMeasuredHeight();
            if (n16 == n15) {
                this.smoothScrollBy(0, n3, null, n10);
                return bl2;
            } else {
                n16 = -n3;
                this.smoothScrollBy(0, n16, null, n10);
            }
            return bl2;
        }
        bl3 = recyclerView$o.canScrollHorizontally();
        if (!bl3) return false;
        int n17 = object.getKeyCode();
        if (n17 != n8 && n17 != n15) {
            if (n17 != n14 && n17 != n7) return false;
            n3 = (int)(recyclerView$o.isLayoutReversed() ? 1 : 0);
            if (n17 == n14) {
                if (n3 != 0) {
                    object = this.getAdapter();
                    n4 = ((RecyclerView$f)object).getItemCount();
                }
            } else if (n3 == 0) {
                object = this.getAdapter();
                n4 = ((RecyclerView$f)object).getItemCount();
            }
            this.smoothScrollToPosition(n4);
            return bl2;
        }
        n3 = this.getMeasuredWidth();
        if (n17 == n15) {
            this.smoothScrollBy(n3, 0, null, n10);
            return bl2;
        } else {
            n17 = -n3;
            this.smoothScrollBy(n17, 0, null, n10);
        }
        return bl2;
    }

    public void dispatchLayout() {
        int n3;
        Object object = this.mAdapter;
        if (object == null) {
            return;
        }
        object = this.mLayout;
        if (object == null) {
            return;
        }
        object = this.mState;
        int n4 = 0;
        Object object2 = null;
        ((RecyclerView$y)object).i = false;
        int n7 = this.mLastAutoMeasureSkippedDueToExact;
        int n8 = 1;
        if (n7 != 0 && ((n7 = this.mLastAutoMeasureNonExactMeasuredWidth) != (n3 = this.getWidth()) || (n7 = this.mLastAutoMeasureNonExactMeasuredHeight) != (n3 = this.getHeight()))) {
            n7 = 1;
        } else {
            n7 = 0;
            object = null;
        }
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        object2 = this.mState;
        n4 = ((RecyclerView$y)object2).d;
        if (n4 == n8) {
            this.dispatchLayoutStep1();
            object = this.mLayout;
            ((RecyclerView$o)object).setExactMeasureSpecsFrom(this);
            this.dispatchLayoutStep2();
        } else {
            object2 = this.mAdapterHelper;
            ArrayList arrayList = ((a_0)object2).c;
            n8 = (int)(arrayList.isEmpty() ? 1 : 0);
            if ((n8 != 0 || (n4 = (int)(((ArrayList)(object2 = ((a_0)object2).b)).isEmpty() ? 1 : 0)) != 0) && n7 == 0 && (n7 = ((RecyclerView$o)(object = this.mLayout)).getWidth()) == (n4 = this.getWidth()) && (n7 = ((RecyclerView$o)(object = this.mLayout)).getHeight()) == (n4 = this.getHeight())) {
                object = this.mLayout;
                ((RecyclerView$o)object).setExactMeasureSpecsFrom(this);
            } else {
                object = this.mLayout;
                ((RecyclerView$o)object).setExactMeasureSpecsFrom(this);
                this.dispatchLayoutStep2();
            }
        }
        this.dispatchLayoutStep3();
    }

    public boolean dispatchNestedFling(float f5, float f6, boolean bl2) {
        return this.getScrollingChildHelper().a(f5, f6, bl2);
    }

    public boolean dispatchNestedPreFling(float f5, float f6) {
        return this.getScrollingChildHelper().b(f5, f6);
    }

    public boolean dispatchNestedPreScroll(int n3, int n4, int[] nArray, int[] nArray2) {
        return this.getScrollingChildHelper().c(n3, n4, nArray, nArray2, 0);
    }

    public boolean dispatchNestedPreScroll(int n3, int n4, int[] nArray, int[] nArray2, int n7) {
        return this.getScrollingChildHelper().c(n3, n4, nArray, nArray2, n7);
    }

    public final void dispatchNestedScroll(int n3, int n4, int n7, int n8, int[] nArray, int n10, int[] nArray2) {
        this.getScrollingChildHelper().e(n3, n4, n7, n8, nArray, n10, nArray2);
    }

    public boolean dispatchNestedScroll(int n3, int n4, int n7, int n8, int[] nArray) {
        return this.getScrollingChildHelper().e(n3, n4, n7, n8, nArray, 0, null);
    }

    public boolean dispatchNestedScroll(int n3, int n4, int n7, int n8, int[] nArray, int n10) {
        return this.getScrollingChildHelper().e(n3, n4, n7, n8, nArray, n10, null);
    }

    public void dispatchOnScrollStateChanged(int n3) {
        Object object = this.mLayout;
        if (object != null) {
            ((RecyclerView$o)object).onScrollStateChanged(n3);
        }
        this.onScrollStateChanged(n3);
        object = this.mScrollListener;
        if (object != null) {
            ((RecyclerView$s)object).onScrollStateChanged(this, n3);
        }
        if ((object = this.mScrollListeners) != null) {
            for (int i3 = object.size() + -1; i3 >= 0; i3 += -1) {
                RecyclerView$s recyclerView$s = (RecyclerView$s)this.mScrollListeners.get(i3);
                recyclerView$s.onScrollStateChanged(this, n3);
            }
        }
    }

    public void dispatchOnScrolled(int n3, int n4) {
        int n7;
        this.mDispatchScrollCounter = n7 = this.mDispatchScrollCounter + 1;
        n7 = this.getScrollX();
        int n8 = this.getScrollY();
        int n10 = n7 - n3;
        int n14 = n8 - n4;
        this.onScrollChanged(n7, n8, n10, n14);
        this.onScrolled(n3, n4);
        Object object = this.mScrollListener;
        if (object != null) {
            ((RecyclerView$s)object).onScrolled(this, n3, n4);
        }
        if ((object = this.mScrollListeners) != null) {
            for (n7 = object.size() + -1; n7 >= 0; n7 += -1) {
                RecyclerView$s recyclerView$s = (RecyclerView$s)this.mScrollListeners.get(n7);
                recyclerView$s.onScrolled(this, n3, n4);
            }
        }
        this.mDispatchScrollCounter = n3 = this.mDispatchScrollCounter + -1;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        List list = this.mPendingAccessibilityImportanceChange;
        for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
            int n3;
            int n4;
            RecyclerView$B recyclerView$B = (RecyclerView$B)this.mPendingAccessibilityImportanceChange.get(i3);
            ViewParent viewParent = recyclerView$B.itemView.getParent();
            if (viewParent != this || (n4 = recyclerView$B.shouldIgnore()) != 0 || (n4 = recyclerView$B.mPendingAccessibilityState) == (n3 = -1)) continue;
            View view = recyclerView$B.itemView;
            view.setImportantForAccessibility(n4);
            recyclerView$B.mPendingAccessibilityState = n3;
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        this.onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        this.dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas object) {
        int n3;
        int n4;
        float f5;
        int n7;
        float f6;
        int n8;
        int n10;
        RecyclerView$y recyclerView$y;
        RecyclerView$n recyclerView$n;
        int n14;
        super.draw((Canvas)object);
        ArrayList arrayList = this.mItemDecorations;
        int n15 = arrayList.size();
        int n16 = 0;
        for (n14 = 0; n14 < n15; ++n14) {
            recyclerView$n = (RecyclerView$n)this.mItemDecorations.get(n14);
            recyclerView$y = this.mState;
            recyclerView$n.onDrawOver((Canvas)object, this, recyclerView$y);
        }
        arrayList = this.mLeftGlow;
        n14 = 1;
        if (arrayList != null && (n15 = (int)(arrayList.isFinished() ? 1 : 0)) == 0) {
            float f7;
            n15 = object.save();
            n10 = this.mClipToPadding;
            if (n10 != 0) {
                n10 = this.getPaddingBottom();
            } else {
                n10 = 0;
                f7 = 0.0f;
                recyclerView$n = null;
            }
            object.rotate(270.0f);
            f7 = -this.getHeight() + n10;
            n8 = 0;
            f6 = 0.0f;
            recyclerView$y = null;
            object.translate(f7, 0.0f);
            recyclerView$n = this.mLeftGlow;
            if (recyclerView$n != null && (n10 = (int)(recyclerView$n.draw((Canvas)object) ? 1 : 0)) != 0) {
                n10 = 1;
                f7 = Float.MIN_VALUE;
            } else {
                n10 = 0;
                f7 = 0.0f;
                recyclerView$n = null;
            }
            object.restoreToCount(n15);
        } else {
            n10 = 0;
            float f8 = 0.0f;
            recyclerView$n = null;
        }
        arrayList = this.mTopGlow;
        if (arrayList != null && (n15 = (int)(arrayList.isFinished() ? 1 : 0)) == 0) {
            n15 = object.save();
            n8 = this.mClipToPadding;
            if (n8 != 0) {
                n8 = this.getPaddingLeft();
                f6 = n8;
                n7 = this.getPaddingTop();
                f5 = n7;
                object.translate(f6, f5);
            }
            if ((recyclerView$y = this.mTopGlow) != null && (n8 = (int)(recyclerView$y.draw((Canvas)object) ? 1 : 0)) != 0) {
                n8 = 1;
                f6 = Float.MIN_VALUE;
            } else {
                n8 = 0;
                f6 = 0.0f;
                recyclerView$y = null;
            }
            n10 |= n8;
            object.restoreToCount(n15);
        }
        if ((arrayList = this.mRightGlow) != null && (n15 = (int)(arrayList.isFinished() ? 1 : 0)) == 0) {
            n15 = object.save();
            n8 = this.getWidth();
            n7 = this.mClipToPadding;
            if (n7 != 0) {
                n7 = this.getPaddingTop();
            } else {
                n7 = 0;
                f5 = 0.0f;
            }
            n4 = 1119092736;
            float f11 = 90.0f;
            object.rotate(f11);
            f5 = n7;
            n8 = -n8;
            f6 = n8;
            object.translate(f5, f6);
            recyclerView$y = this.mRightGlow;
            if (recyclerView$y != null && (n8 = (int)(recyclerView$y.draw((Canvas)object) ? 1 : 0)) != 0) {
                n8 = 1;
                f6 = Float.MIN_VALUE;
            } else {
                n8 = 0;
                f6 = 0.0f;
                recyclerView$y = null;
            }
            n10 |= n8;
            object.restoreToCount(n15);
        }
        if ((arrayList = this.mBottomGlow) != null && (n15 = (int)(arrayList.isFinished() ? 1 : 0)) == 0) {
            n15 = object.save();
            f6 = 180.0f;
            object.rotate(f6);
            n8 = (int)(this.mClipToPadding ? 1 : 0);
            if (n8 != 0) {
                n8 = -this.getWidth();
                f6 = this.getPaddingRight() + n8;
                n7 = -this.getHeight();
                n4 = this.getPaddingBottom() + n7;
                f5 = n4;
                object.translate(f6, f5);
            } else {
                n8 = -this.getWidth();
                f6 = n8;
                n7 = -this.getHeight();
                f5 = n7;
                object.translate(f6, f5);
            }
            recyclerView$y = this.mBottomGlow;
            if (recyclerView$y != null && (n8 = (int)(recyclerView$y.draw((Canvas)object) ? 1 : 0)) != 0) {
                n16 = 1;
            }
            n10 |= n16;
            object.restoreToCount(n15);
        }
        if (n10 != 0 || (object = this.mItemAnimator) == null || (n3 = ((ArrayList)(object = this.mItemDecorations)).size()) <= 0 || (n3 = (int)(((RecyclerView$l)(object = this.mItemAnimator)).f() ? 1 : 0)) == 0) {
            n14 = n10;
        }
        if (n14 != 0) {
            this.postInvalidateOnAnimation();
        }
    }

    public boolean drawChild(Canvas canvas, View view, long l2) {
        return super.drawChild(canvas, view, l2);
    }

    public void ensureBottomGlow() {
        EdgeEffect edgeEffect = this.mBottomGlow;
        if (edgeEffect != null) {
            return;
        }
        ((RecyclerView$z)this.mEdgeEffectFactory).getClass();
        Context context = this.getContext();
        this.mBottomGlow = edgeEffect = new EdgeEffect(context);
        int n3 = this.mClipToPadding;
        if (n3 != 0) {
            n3 = this.getMeasuredWidth();
            int n4 = this.getPaddingLeft();
            n3 -= n4;
            n4 = this.getPaddingRight();
            n3 -= n4;
            n4 = this.getMeasuredHeight();
            int n7 = this.getPaddingTop();
            n4 -= n7;
            n7 = this.getPaddingBottom();
            edgeEffect.setSize(n3, n4 -= n7);
        } else {
            n3 = this.getMeasuredWidth();
            int n8 = this.getMeasuredHeight();
            edgeEffect.setSize(n3, n8);
        }
    }

    public void ensureLeftGlow() {
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            return;
        }
        ((RecyclerView$z)this.mEdgeEffectFactory).getClass();
        Context context = this.getContext();
        this.mLeftGlow = edgeEffect = new EdgeEffect(context);
        int n3 = this.mClipToPadding;
        if (n3 != 0) {
            n3 = this.getMeasuredHeight();
            int n4 = this.getPaddingTop();
            n3 -= n4;
            n4 = this.getPaddingBottom();
            n3 -= n4;
            n4 = this.getMeasuredWidth();
            int n7 = this.getPaddingLeft();
            n4 -= n7;
            n7 = this.getPaddingRight();
            edgeEffect.setSize(n3, n4 -= n7);
        } else {
            n3 = this.getMeasuredHeight();
            int n8 = this.getMeasuredWidth();
            edgeEffect.setSize(n3, n8);
        }
    }

    public void ensureRightGlow() {
        EdgeEffect edgeEffect = this.mRightGlow;
        if (edgeEffect != null) {
            return;
        }
        ((RecyclerView$z)this.mEdgeEffectFactory).getClass();
        Context context = this.getContext();
        this.mRightGlow = edgeEffect = new EdgeEffect(context);
        int n3 = this.mClipToPadding;
        if (n3 != 0) {
            n3 = this.getMeasuredHeight();
            int n4 = this.getPaddingTop();
            n3 -= n4;
            n4 = this.getPaddingBottom();
            n3 -= n4;
            n4 = this.getMeasuredWidth();
            int n7 = this.getPaddingLeft();
            n4 -= n7;
            n7 = this.getPaddingRight();
            edgeEffect.setSize(n3, n4 -= n7);
        } else {
            n3 = this.getMeasuredHeight();
            int n8 = this.getMeasuredWidth();
            edgeEffect.setSize(n3, n8);
        }
    }

    public void ensureTopGlow() {
        EdgeEffect edgeEffect = this.mTopGlow;
        if (edgeEffect != null) {
            return;
        }
        ((RecyclerView$z)this.mEdgeEffectFactory).getClass();
        Context context = this.getContext();
        this.mTopGlow = edgeEffect = new EdgeEffect(context);
        int n3 = this.mClipToPadding;
        if (n3 != 0) {
            n3 = this.getMeasuredWidth();
            int n4 = this.getPaddingLeft();
            n3 -= n4;
            n4 = this.getPaddingRight();
            n3 -= n4;
            n4 = this.getMeasuredHeight();
            int n7 = this.getPaddingTop();
            n4 -= n7;
            n7 = this.getPaddingBottom();
            edgeEffect.setSize(n3, n4 -= n7);
        } else {
            n3 = this.getMeasuredWidth();
            int n8 = this.getMeasuredHeight();
            edgeEffect.setSize(n3, n8);
        }
    }

    public String exceptionLabel() {
        StringBuilder stringBuilder = new StringBuilder(" ");
        Object object = super.toString();
        stringBuilder.append((String)object);
        stringBuilder.append(", adapter:");
        object = this.mAdapter;
        stringBuilder.append(object);
        stringBuilder.append(", layout:");
        object = this.mLayout;
        stringBuilder.append(object);
        stringBuilder.append(", context:");
        object = this.getContext();
        stringBuilder.append(object);
        return stringBuilder.toString();
    }

    public final void fillRemainingScrollValues(RecyclerView$y recyclerView$y) {
        int n3;
        int n4 = this.getScrollState();
        if (n4 == (n3 = 2)) {
            OverScroller overScroller = this.mViewFlinger.c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            recyclerView$y.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
        } else {
            recyclerView$y.getClass();
        }
    }

    public View findChildViewUnder(float f5, float f6) {
        c_0 c_02 = this.mChildHelper;
        for (int i3 = c_02.e() + -1; i3 >= 0; i3 += -1) {
            float f7;
            float f8;
            float f11;
            float f12;
            View view = this.mChildHelper.d(i3);
            float f14 = view.getTranslationX();
            float f15 = view.getTranslationY();
            float f16 = (float)view.getLeft() + f14;
            float f17 = f5 - f16;
            Object object = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
            if (object < 0 || (f12 = (f11 = f5 - (f16 = (float)(object = (Object)view.getRight()) + f14)) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) > 0 || (f12 = (f8 = f6 - (f14 = (float)view.getTop() + f15)) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) < 0 || (f12 = (f7 = f6 - (f14 = (float)view.getBottom() + f15)) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) > 0) continue;
            return view;
        }
        return null;
    }

    public View findContainingItemView(View view) {
        boolean bl2;
        ViewParent viewParent = view.getParent();
        while (viewParent != null && viewParent != this && (bl2 = viewParent instanceof View)) {
            view = viewParent;
            view = (View)viewParent;
            viewParent = view.getParent();
        }
        if (viewParent != this) {
            view = null;
        }
        return view;
    }

    public RecyclerView$B findContainingViewHolder(View object) {
        object = (object = this.findContainingItemView((View)object)) == null ? null : this.getChildViewHolder((View)object);
        return object;
    }

    public RecyclerView$B findViewHolderForAdapterPosition(int n3) {
        int n4 = this.mDataSetHasChangedAfterLayout;
        boolean bl2 = false;
        Object object = null;
        if (n4 != 0) {
            return null;
        }
        c_0 c_02 = this.mChildHelper;
        n4 = c_02.h();
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7;
            RecyclerView$B recyclerView$B = RecyclerView.getChildViewHolderInt(this.mChildHelper.g(i3));
            if (recyclerView$B == null || (n7 = recyclerView$B.isRemoved()) != 0 || (n7 = this.getAdapterPositionInRecyclerView(recyclerView$B)) != n3) continue;
            object = this.mChildHelper;
            View view = recyclerView$B.itemView;
            bl2 = ((c_0)object).k(view);
            if (bl2) {
                object = recyclerView$B;
                continue;
            }
            return recyclerView$B;
        }
        return object;
    }

    public RecyclerView$B findViewHolderForItemId(long l2) {
        int n3;
        Object object = this.mAdapter;
        boolean bl2 = false;
        Object object2 = null;
        if (object != null && (n3 = ((RecyclerView$f)object).hasStableIds()) != 0) {
            object = this.mChildHelper;
            n3 = ((c_0)object).h();
            for (int i3 = 0; i3 < n3; ++i3) {
                long l3;
                long l4;
                long l7;
                boolean bl3;
                RecyclerView$B recyclerView$B = RecyclerView.getChildViewHolderInt(this.mChildHelper.g(i3));
                if (recyclerView$B == null || (bl3 = recyclerView$B.isRemoved()) || (l7 = (l4 = (l3 = recyclerView$B.getItemId()) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) continue;
                object2 = this.mChildHelper;
                View view = recyclerView$B.itemView;
                bl2 = ((c_0)object2).k(view);
                if (bl2) {
                    object2 = recyclerView$B;
                    continue;
                }
                return recyclerView$B;
            }
        }
        return object2;
    }

    public RecyclerView$B findViewHolderForLayoutPosition(int n3) {
        return this.findViewHolderForPosition(n3, false);
    }

    public RecyclerView$B findViewHolderForPosition(int n3) {
        return this.findViewHolderForPosition(n3, false);
    }

    public RecyclerView$B findViewHolderForPosition(int n3, boolean bl2) {
        c_0 c_02 = this.mChildHelper;
        int n4 = c_02.h();
        boolean bl3 = false;
        Object object = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7;
            RecyclerView$B recyclerView$B = RecyclerView.getChildViewHolderInt(this.mChildHelper.g(i3));
            if (recyclerView$B == null || (n7 = recyclerView$B.isRemoved()) != 0 || (!bl2 ? (n7 = recyclerView$B.getLayoutPosition()) != n3 : (n7 = recyclerView$B.mPosition) != n3)) continue;
            object = this.mChildHelper;
            View view = recyclerView$B.itemView;
            bl3 = ((c_0)object).k(view);
            if (bl3) {
                object = recyclerView$B;
                continue;
            }
            return recyclerView$B;
        }
        return object;
    }

    public boolean fling(int n3, int n4) {
        int n7 = this.mMinFlingVelocity;
        int n8 = this.mMaxFlingVelocity;
        return this.fling(n3, n4, n7, n8);
    }

    public boolean flingNoThresholdCheck(int n3, int n4) {
        return this.fling(n3, n4, 0, -1 >>> 1);
    }

    /*
     * Could not resolve type clashes
     */
    public View focusSearch(View view, int n3) {
        Object object;
        int n4;
        int n7;
        Object object2 = this.mLayout.onInterceptFocusSearch(view, n3);
        if (object2 != null) {
            return object2;
        }
        object2 = this.mAdapter;
        int n8 = 1;
        if (object2 != null && (object2 = this.mLayout) != null && (n7 = this.isComputingLayout()) == 0 && (n7 = this.mLayoutSuppressed) == 0) {
            n7 = 1;
        } else {
            n7 = 0;
            object2 = null;
        }
        Object object3 = FocusFinder.getInstance();
        if (n7 != 0 && (n3 == (n4 = 2) || n3 == n8)) {
            RecyclerView$y recyclerView$y;
            RecyclerView$o recyclerView$o;
            boolean bl2;
            object2 = this.mLayout;
            n7 = ((RecyclerView$o)object2).canScrollVertically();
            if (n7 != 0 && (object2 = object3.findNextFocus((ViewGroup)this, view, n7 = n3 == n4 ? 130 : 33)) == null) {
                n7 = 1;
            } else {
                n7 = 0;
                object2 = null;
            }
            if (n7 == 0 && (bl2 = (recyclerView$o = this.mLayout).canScrollHorizontally())) {
                object2 = this.mLayout;
                n7 = ((RecyclerView$o)object2).getLayoutDirection();
                if (n7 == n8) {
                    n7 = 1;
                } else {
                    n7 = 0;
                    object2 = null;
                }
                if (n3 == n4) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    recyclerView$y = null;
                }
                n7 = (n7 ^= n4) != 0 ? 66 : 17;
                object2 = object3.findNextFocus((ViewGroup)this, view, n7);
                if (object2 != null) {
                    n8 = 0;
                    object = null;
                }
                n7 = n8;
            }
            if (n7 != 0) {
                this.consumePendingUpdateOperations();
                object2 = this.findContainingItemView(view);
                if (object2 == null) {
                    return null;
                }
                this.startInterceptRequestLayout();
                object2 = this.mLayout;
                object = this.mRecycler;
                recyclerView$y = this.mState;
                ((RecyclerView$o)object2).onFocusSearchFailed(view, n3, (RecyclerView$u)object, recyclerView$y);
                this.stopInterceptRequestLayout(false);
            }
            object2 = object3.findNextFocus((ViewGroup)this, view, n3);
        } else {
            object = object3.findNextFocus((ViewGroup)this, view, n3);
            if (object == null && n7 != 0) {
                this.consumePendingUpdateOperations();
                object2 = this.findContainingItemView(view);
                if (object2 == null) {
                    return null;
                }
                this.startInterceptRequestLayout();
                object2 = this.mLayout;
                object = this.mRecycler;
                object3 = this.mState;
                object2 = ((RecyclerView$o)object2).onFocusSearchFailed(view, n3, (RecyclerView$u)object, (RecyclerView$y)object3);
                this.stopInterceptRequestLayout(false);
            } else {
                object2 = object;
            }
        }
        if (object2 != null && (n8 = (int)(object2.hasFocusable() ? 1 : 0)) == 0) {
            object = this.getFocusedChild();
            if (object == null) {
                return super.focusSearch(view, n3);
            }
            this.requestChildOnScreen((View)object2, null);
            return view;
        }
        n8 = (int)(this.isPreferredNextFocus(view, (View)object2, n3) ? 1 : 0);
        if (n8 == 0) {
            object2 = super.focusSearch(view, n3);
        }
        return object2;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Object object = this.mLayout;
        if (object != null) {
            return ((RecyclerView$o)object).generateDefaultLayoutParams();
        }
        CharSequence charSequence = new StringBuilder("RecyclerView has no LayoutManager");
        charSequence = lu_0.a(this, charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet object) {
        Object object2 = this.mLayout;
        if (object2 != null) {
            Context context = this.getContext();
            return ((RecyclerView$o)object2).generateLayoutParams(context, (AttributeSet)object);
        }
        object2 = new StringBuilder("RecyclerView has no LayoutManager");
        object2 = lu_0.a(this, (StringBuilder)object2);
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams object) {
        Object object2 = this.mLayout;
        if (object2 != null) {
            return ((RecyclerView$o)object2).generateLayoutParams((ViewGroup.LayoutParams)object);
        }
        object2 = new StringBuilder("RecyclerView has no LayoutManager");
        object2 = lu_0.a(this, (StringBuilder)object2);
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public RecyclerView$f getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(RecyclerView$B recyclerView$B) {
        int n3;
        block7: {
            boolean bl2 = recyclerView$B.hasAnyOfTheFlags(524);
            n3 = -1;
            if (!bl2 && (bl2 = recyclerView$B.isBound())) {
                Object object = this.mAdapterHelper;
                int n4 = recyclerView$B.mPosition;
                object = ((a_0)object).b;
                int n7 = ((ArrayList)object).size();
                for (int i3 = 0; i3 < n7; ++i3) {
                    int n8;
                    a$b_0 a$b_0 = (a$b_0)((ArrayList)object).get(i3);
                    int n10 = a$b_0.a;
                    int n14 = 1;
                    if (n10 != n14) {
                        n14 = 2;
                        if (n10 != n14) {
                            n14 = 8;
                            if (n10 != n14) continue;
                            n10 = a$b_0.b;
                            if (n10 == n4) {
                                n4 = a$b_0.d;
                                continue;
                            }
                            if (n10 < n4) {
                                n4 += -1;
                            }
                            if ((n8 = a$b_0.d) > n4) continue;
                            ++n4;
                            continue;
                        }
                        n10 = a$b_0.b;
                        if (n10 > n4) continue;
                        n8 = a$b_0.d;
                        if ((n10 += n8) <= n4) {
                            n4 -= n8;
                            continue;
                        }
                        break block7;
                    }
                    n10 = a$b_0.b;
                    if (n10 > n4) continue;
                    n8 = a$b_0.d;
                    n4 += n8;
                }
                n3 = n4;
            }
        }
        return n3;
    }

    public int getBaseline() {
        RecyclerView$o recyclerView$o = this.mLayout;
        if (recyclerView$o != null) {
            return recyclerView$o.getBaseline();
        }
        return super.getBaseline();
    }

    public long getChangedHolderKey(RecyclerView$B recyclerView$B) {
        long l2;
        RecyclerView$f recyclerView$f = this.mAdapter;
        boolean bl2 = recyclerView$f.hasStableIds();
        if (bl2) {
            l2 = recyclerView$B.getItemId();
        } else {
            int n3 = recyclerView$B.mPosition;
            l2 = n3;
        }
        return l2;
    }

    public int getChildAdapterPosition(View object) {
        int n3 = (object = RecyclerView.getChildViewHolderInt((View)object)) != null ? ((RecyclerView$B)object).getAbsoluteAdapterPosition() : -1;
        return n3;
    }

    public int getChildDrawingOrder(int n3, int n4) {
        return super.getChildDrawingOrder(n3, n4);
    }

    public long getChildItemId(View object) {
        boolean bl2;
        RecyclerView$f recyclerView$f = this.mAdapter;
        long l2 = -1;
        if (recyclerView$f != null && (bl2 = recyclerView$f.hasStableIds()) && (object = RecyclerView.getChildViewHolderInt((View)object)) != null) {
            l2 = ((RecyclerView$B)object).getItemId();
        }
        return l2;
    }

    public int getChildLayoutPosition(View object) {
        int n3 = (object = RecyclerView.getChildViewHolderInt((View)object)) != null ? ((RecyclerView$B)object).getLayoutPosition() : -1;
        return n3;
    }

    public int getChildPosition(View view) {
        return this.getChildAdapterPosition(view);
    }

    public RecyclerView$B getChildViewHolder(View object) {
        Object object2 = object.getParent();
        if (object2 != null && object2 != this) {
            StringBuilder stringBuilder = new StringBuilder("View ");
            stringBuilder.append(object);
            stringBuilder.append(" is not a direct child of ");
            stringBuilder.append(this);
            object = stringBuilder.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        return RecyclerView.getChildViewHolderInt(object);
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public v getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public RecyclerView$k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public RecyclerView$l getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        boolean bl2 = recyclerView$LayoutParams.mInsetsDirty;
        if (!bl2) {
            return recyclerView$LayoutParams.mDecorInsets;
        }
        RecyclerView$y recyclerView$y = this.mState;
        bl2 = recyclerView$y.g;
        if (bl2 && ((bl2 = recyclerView$LayoutParams.isItemChanged()) || (bl2 = recyclerView$LayoutParams.isViewInvalid()))) {
            return recyclerView$LayoutParams.mDecorInsets;
        }
        recyclerView$y = recyclerView$LayoutParams.mDecorInsets;
        recyclerView$y.set(0, 0, 0, 0);
        ArrayList arrayList = this.mItemDecorations;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            this.mTempRect.set(0, 0, 0, 0);
            RecyclerView$n recyclerView$n = (RecyclerView$n)this.mItemDecorations.get(i3);
            Rect rect = this.mTempRect;
            RecyclerView$y recyclerView$y2 = this.mState;
            recyclerView$n.getItemOffsets(rect, view, this, recyclerView$y2);
            int n4 = ((Rect)recyclerView$y).left;
            rect = this.mTempRect;
            int n7 = rect.left;
            ((Rect)recyclerView$y).left = n4 += n7;
            n4 = ((Rect)recyclerView$y).top;
            n7 = rect.top;
            ((Rect)recyclerView$y).top = n4 += n7;
            n4 = ((Rect)recyclerView$y).right;
            n7 = rect.right;
            ((Rect)recyclerView$y).right = n4 += n7;
            n4 = ((Rect)recyclerView$y).bottom;
            int n8 = rect.bottom;
            ((Rect)recyclerView$y).bottom = n4 += n8;
        }
        recyclerView$LayoutParams.mInsetsDirty = false;
        return recyclerView$y;
    }

    public RecyclerView$n getItemDecorationAt(int n3) {
        int n4 = this.getItemDecorationCount();
        if (n3 >= 0 && n3 < n4) {
            return (RecyclerView$n)this.mItemDecorations.get(n3);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        stringBuilder.append(" is an invalid index for size ");
        stringBuilder.append(n4);
        String string2 = stringBuilder.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public RecyclerView$o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        boolean bl2 = ALLOW_THREAD_GAP_WORK;
        if (bl2) {
            return System.nanoTime();
        }
        return 0L;
    }

    public RecyclerView$q getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public RecyclerView$t getRecycledViewPool() {
        return this.mRecycler.d();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return this.getScrollingChildHelper().g(0);
    }

    public boolean hasNestedScrollingParent(int n3) {
        return this.getScrollingChildHelper().g(n3);
    }

    public boolean hasPendingAdapterUpdates() {
        a_0 a_02;
        boolean bl2 = this.mFirstLayoutComplete;
        if (bl2 && !(bl2 = this.mDataSetHasChangedAfterLayout) && !(bl2 = (a_02 = this.mAdapterHelper).g())) {
            bl2 = false;
            a_02 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public void initAdapterManager() {
        a_0 a_02;
        RecyclerView$e recyclerView$e = new RecyclerView$e(this);
        this.mAdapterHelper = a_02 = new a_0(recyclerView$e);
    }

    public void initFastScroller(StateListDrawable object, Drawable object2, StateListDrawable stateListDrawable, Drawable drawable2) {
        if (object != null && object2 != null && stateListDrawable != null && drawable2 != null) {
            Resources resources = this.getContext().getResources();
            int n3 = R$dimen.fastscroll_default_thickness;
            int n4 = resources.getDimensionPixelSize(n3);
            n3 = R$dimen.fastscroll_minimum_range;
            int n7 = resources.getDimensionPixelSize(n3);
            n3 = R$dimen.fastscroll_margin;
            int n8 = resources.getDimensionPixelOffset(n3);
            FastScroller fastScroller = new FastScroller(this, (StateListDrawable)object, (Drawable)object2, stateListDrawable, drawable2, n4, n7, n8);
            return;
        }
        object2 = new StringBuilder("Trying to set fast scroller without both required drawables.");
        object2 = lu_0.a(this, (StringBuilder)object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        Object object = this.mItemDecorations;
        int n3 = ((ArrayList)object).size();
        if (n3 == 0) {
            return;
        }
        object = this.mLayout;
        if (object != null) {
            String string2 = "Cannot invalidate item decorations during a scroll or layout";
            ((RecyclerView$o)object).assertNotInLayoutOrScroll(string2);
        }
        this.markItemDecorInsetsDirty();
        this.requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        boolean bl2;
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        if (accessibilityManager != null && (bl2 = accessibilityManager.isEnabled())) {
            bl2 = true;
        } else {
            bl2 = false;
            accessibilityManager = null;
        }
        return bl2;
    }

    public boolean isAnimating() {
        boolean bl2;
        RecyclerView$l recyclerView$l = this.mItemAnimator;
        if (recyclerView$l != null && (bl2 = recyclerView$l.f())) {
            bl2 = true;
        } else {
            bl2 = false;
            recyclerView$l = null;
        }
        return bl2;
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        int n3 = this.mLayoutOrScrollCounter;
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isLayoutFrozen() {
        return this.isLayoutSuppressed();
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public boolean isNestedScrollingEnabled() {
        return this.getScrollingChildHelper().d;
    }

    public void jumpToPositionForSmoothScroller(int n3) {
        RecyclerView$o recyclerView$o = this.mLayout;
        if (recyclerView$o == null) {
            return;
        }
        this.setScrollState(2);
        this.mLayout.scrollToPosition(n3);
        this.awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        RecyclerView$LayoutParams recyclerView$LayoutParams;
        boolean bl2;
        Object object = this.mChildHelper;
        int n3 = ((c_0)object).h();
        int n4 = 0;
        int n7 = 0;
        while (true) {
            bl2 = true;
            if (n7 >= n3) break;
            recyclerView$LayoutParams = (RecyclerView$LayoutParams)this.mChildHelper.g(n7).getLayoutParams();
            recyclerView$LayoutParams.mInsetsDirty = bl2;
            ++n7;
        }
        object = this.mRecycler.c;
        n7 = ((ArrayList)object).size();
        while (n4 < n7) {
            recyclerView$LayoutParams = (RecyclerView$LayoutParams)((RecyclerView$B)((ArrayList)object).get((int)n4)).itemView.getLayoutParams();
            if (recyclerView$LayoutParams != null) {
                recyclerView$LayoutParams.mInsetsDirty = bl2;
            }
            ++n4;
        }
    }

    public void markKnownViewsInvalid() {
        int n3;
        Object object = this.mChildHelper;
        int n4 = ((c_0)object).h();
        int n7 = 0;
        RecyclerView$f recyclerView$f = null;
        int n8 = 0;
        ArrayList arrayList = null;
        while (true) {
            boolean bl2;
            n3 = 6;
            if (n8 >= n4) break;
            RecyclerView$B recyclerView$B = RecyclerView.getChildViewHolderInt(this.mChildHelper.g(n8));
            if (recyclerView$B != null && !(bl2 = recyclerView$B.shouldIgnore())) {
                recyclerView$B.addFlags(n3);
            }
            ++n8;
        }
        this.markItemDecorInsetsDirty();
        object = this.mRecycler;
        arrayList = ((RecyclerView$u)object).c;
        int n10 = arrayList.size();
        while (n7 < n10) {
            RecyclerView$B recyclerView$B = (RecyclerView$B)arrayList.get(n7);
            if (recyclerView$B != null) {
                recyclerView$B.addFlags(n3);
                recyclerView$B.addChangePayload(null);
            }
            ++n7;
        }
        recyclerView$f = ((RecyclerView$u)object).h.mAdapter;
        if (recyclerView$f == null || (n7 = (int)(recyclerView$f.hasStableIds() ? 1 : 0)) == 0) {
            ((RecyclerView$u)object).h();
        }
    }

    public void nestedScrollBy(int n3, int n4) {
        this.nestedScrollByInternal(n3, n4, null, 1);
    }

    public void offsetChildrenHorizontal(int n3) {
        c_0 c_02 = this.mChildHelper;
        int n4 = c_02.e();
        for (int i3 = 0; i3 < n4; ++i3) {
            View view = this.mChildHelper.d(i3);
            view.offsetLeftAndRight(n3);
        }
    }

    public void offsetChildrenVertical(int n3) {
        c_0 c_02 = this.mChildHelper;
        int n4 = c_02.e();
        for (int i3 = 0; i3 < n4; ++i3) {
            View view = this.mChildHelper.d(i3);
            view.offsetTopAndBottom(n3);
        }
    }

    public void offsetPositionRecordsForInsert(int n3, int n4) {
        Object object;
        int n7;
        Object object2 = this.mChildHelper;
        int n8 = ((c_0)object2).h();
        for (n7 = 0; n7 < n8; ++n7) {
            int n10;
            object = RecyclerView.getChildViewHolderInt(this.mChildHelper.g(n7));
            if (object == null || (n10 = ((RecyclerView$B)object).shouldIgnore()) != 0 || (n10 = ((RecyclerView$B)object).mPosition) < n3) continue;
            n10 = (int)(sVerboseLoggingEnabled ? 1 : 0);
            if (n10 != 0) {
                ((RecyclerView$B)object).toString();
            }
            ((RecyclerView$B)object).offsetPosition(n4, false);
            object = this.mState;
            n10 = 1;
            ((RecyclerView$y)object).f = n10;
        }
        object2 = this.mRecycler.c;
        n7 = ((ArrayList)object2).size();
        object = null;
        for (int i3 = 0; i3 < n7; ++i3) {
            int n14;
            RecyclerView$B recyclerView$B = (RecyclerView$B)((ArrayList)object2).get(i3);
            if (recyclerView$B == null || (n14 = recyclerView$B.mPosition) < n3) continue;
            n14 = (int)(sVerboseLoggingEnabled ? 1 : 0);
            if (n14 != 0) {
                recyclerView$B.toString();
            }
            recyclerView$B.offsetPosition(n4, false);
        }
        this.requestLayout();
    }

    public void offsetPositionRecordsForMove(int n3, int n4) {
        int n7;
        int n8;
        int n10;
        Object object = this.mChildHelper;
        int n14 = ((c_0)object).h();
        int n15 = -1;
        int n16 = 1;
        if (n3 < n4) {
            n10 = n3;
            n8 = n4;
            n7 = -1;
        } else {
            n8 = n3;
            n10 = n4;
            n7 = 1;
        }
        RecyclerView$B recyclerView$B = null;
        for (int i3 = 0; i3 < n14; ++i3) {
            int n17;
            Object object2 = RecyclerView.getChildViewHolderInt(this.mChildHelper.g(i3));
            if (object2 == null || (n17 = ((RecyclerView$B)object2).mPosition) < n10 || n17 > n8) continue;
            n17 = (int)(sVerboseLoggingEnabled ? 1 : 0);
            if (n17 != 0) {
                ((RecyclerView$B)object2).toString();
            }
            if ((n17 = ((RecyclerView$B)object2).mPosition) == n3) {
                n17 = n4 - n3;
                ((RecyclerView$B)object2).offsetPosition(n17, false);
            } else {
                ((RecyclerView$B)object2).offsetPosition(n7, false);
            }
            object2 = this.mState;
            ((RecyclerView$y)object2).f = n16;
        }
        object = this.mRecycler;
        object.getClass();
        if (n3 < n4) {
            n16 = n3;
            n10 = n4;
        } else {
            n10 = n3;
            n16 = n4;
            n15 = 1;
        }
        object = ((RecyclerView$u)object).c;
        n8 = ((ArrayList)object).size();
        for (n7 = 0; n7 < n8; ++n7) {
            int n18;
            recyclerView$B = (RecyclerView$B)((ArrayList)object).get(n7);
            if (recyclerView$B == null || (n18 = recyclerView$B.mPosition) < n16 || n18 > n10) continue;
            if (n18 == n3) {
                n18 = n4 - n3;
                recyclerView$B.offsetPosition(n18, false);
            } else {
                recyclerView$B.offsetPosition(n15, false);
            }
            n18 = (int)(sVerboseLoggingEnabled ? 1 : 0);
            if (n18 == 0) continue;
            recyclerView$B.toString();
        }
        this.requestLayout();
    }

    public void offsetPositionRecordsForRemove(int n3, int n4, boolean bl2) {
        int n7;
        int n8 = n3 + n4;
        Object object = this.mChildHelper;
        int n10 = ((c_0)object).h();
        int n14 = 0;
        ArrayList arrayList = null;
        while (true) {
            int n15 = 1;
            if (n14 >= n10) break;
            Object object2 = RecyclerView.getChildViewHolderInt(this.mChildHelper.g(n14));
            if (object2 != null && (n7 = ((RecyclerView$B)object2).shouldIgnore()) == 0) {
                n7 = ((RecyclerView$B)object2).mPosition;
                if (n7 >= n8) {
                    n7 = (int)(sVerboseLoggingEnabled ? 1 : 0);
                    if (n7 != 0) {
                        ((RecyclerView$B)object2).toString();
                    }
                    n7 = -n4;
                    ((RecyclerView$B)object2).offsetPosition(n7, bl2);
                    object2 = this.mState;
                    ((RecyclerView$y)object2).f = n15;
                } else if (n7 >= n3) {
                    n7 = (int)(sVerboseLoggingEnabled ? 1 : 0);
                    if (n7 != 0) {
                        ((RecyclerView$B)object2).toString();
                    }
                    n7 = n3 + -1;
                    int n16 = -n4;
                    ((RecyclerView$B)object2).flagRemovedAndOffsetPosition(n7, n16, bl2);
                    object2 = this.mState;
                    ((RecyclerView$y)object2).f = n15;
                }
            }
            ++n14;
        }
        object = this.mRecycler;
        arrayList = ((RecyclerView$u)object).c;
        for (int i3 = arrayList.size() - n15; i3 >= 0; i3 += -1) {
            RecyclerView$B recyclerView$B = (RecyclerView$B)arrayList.get(i3);
            if (recyclerView$B == null) continue;
            n7 = recyclerView$B.mPosition;
            if (n7 >= n8) {
                n7 = (int)(sVerboseLoggingEnabled ? 1 : 0);
                if (n7 != 0) {
                    recyclerView$B.toString();
                }
                n7 = -n4;
                recyclerView$B.offsetPosition(n7, bl2);
                continue;
            }
            if (n7 < n3) continue;
            n7 = 8;
            recyclerView$B.addFlags(n7);
            ((RecyclerView$u)object).i(i3);
        }
        this.requestLayout();
    }

    public void onAttachedToWindow() {
        Object object;
        super.onAttachedToWindow();
        boolean bl2 = false;
        Object object2 = null;
        this.mLayoutOrScrollCounter = 0;
        int n3 = 1;
        float f5 = Float.MIN_VALUE;
        this.mIsAttached = n3;
        int n4 = this.mFirstLayoutComplete;
        if (n4 == 0 || (n4 = this.isLayoutRequested()) != 0) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        }
        this.mFirstLayoutComplete = n3;
        this.mRecycler.f();
        object = this.mLayout;
        if (object != null) {
            ((RecyclerView$o)object).dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        bl2 = ALLOW_THREAD_GAP_WORK;
        if (bl2) {
            object2 = GapWorker.e;
            this.mGapWorker = object = (GapWorker)((ThreadLocal)object2).get();
            if (object == null) {
                long l2;
                float f6;
                float f7;
                this.mGapWorker = object = new GapWorker();
                object = ViewCompat.a;
                object = this.getDisplay();
                n4 = this.isInEditMode();
                if (n4 != 0 || object == null || (n4 = (f7 = (f5 = object.getRefreshRate()) - (f6 = 30.0f)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) < 0) {
                    n3 = 1114636288;
                    f5 = 60.0f;
                }
                GapWorker gapWorker = this.mGapWorker;
                float f8 = 1.0E9f / f5;
                gapWorker.c = l2 = (long)f8;
                ((ThreadLocal)object2).set(gapWorker);
            }
            object2 = this.mGapWorker;
            object2.getClass();
            n3 = sDebugAssertionsEnabled;
            object2 = ((GapWorker)object2).a;
            if (n3 != 0 && (n3 = ((ArrayList)object2).contains(this)) != 0) {
                object2 = new IllegalStateException("RecyclerView already present in worker list!");
                throw object2;
            }
            ((ArrayList)object2).add(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onDetachedFromWindow() {
        Object object;
        Object object2;
        int n3;
        int n4;
        Object object3;
        int n7 = -1;
        super.onDetachedFromWindow();
        Object object4 = this.mItemAnimator;
        if (object4 != null) {
            ((RecyclerView$l)object4).e();
        }
        this.stopScroll();
        int n8 = 0;
        object4 = null;
        this.mIsAttached = false;
        Object object5 = this.mLayout;
        if (object5 != null) {
            object3 = this.mRecycler;
            ((RecyclerView$o)object5).dispatchDetachedFromWindow(this, (RecyclerView$u)object3);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        object5 = this.mItemAnimatorRunner;
        this.removeCallbacks((Runnable)object5);
        object5 = this.mViewInfoStore;
        object5.getClass();
        while ((object5 = B$a.d.b()) != null) {
        }
        object5 = this.mRecycler;
        object3 = null;
        for (n4 = 0; n4 < (n3 = ((ArrayList)(object2 = ((RecyclerView$u)object5).c)).size()); ++n4) {
            object2 = ((RecyclerView$B)((ArrayList)object2).get((int)n4)).itemView;
            vw2.a((View)object2);
        }
        object3 = ((RecyclerView$u)object5).h.mAdapter;
        ((RecyclerView$u)object5).g((RecyclerView$f)object3, false);
        int n10 = vw2.a;
        object5 = "<this>";
        Intrinsics.checkNotNullParameter(this, (String)object5);
        while (n8 < (n10 = this.getChildCount())) {
            n10 = n8 + 1;
            object4 = this.getChildAt(n8);
            if (object4 != null) {
                object4 = vw2.b((View)object4).a;
                for (n4 = xx_2.h((List)object4); n7 < n4; n4 += n7) {
                    object2 = (ww2)((ArrayList)object4).get(n4);
                    object2.a();
                }
                n8 = n10;
                continue;
            }
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
            throw indexOutOfBoundsException;
        }
        n7 = (int)(ALLOW_THREAD_GAP_WORK ? 1 : 0);
        if (n7 != 0 && (object = this.mGapWorker) != null) {
            object = ((GapWorker)object).a;
            n7 = (int)(((ArrayList)object).remove(this) ? 1 : 0);
            n8 = (int)(sDebugAssertionsEnabled ? 1 : 0);
            if (n8 != 0 && n7 == 0) {
                object = new IllegalStateException("RecyclerView removal failed!");
                throw object;
            }
            n7 = 0;
            object = null;
            this.mGapWorker = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.mItemDecorations;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            RecyclerView$n recyclerView$n = (RecyclerView$n)this.mItemDecorations.get(i3);
            RecyclerView$y recyclerView$y = this.mState;
            recyclerView$n.onDraw(canvas, this, recyclerView$y);
        }
    }

    public void onEnterLayoutOrScroll() {
        int n3;
        this.mLayoutOrScrollCounter = n3 = this.mLayoutOrScrollCounter + 1;
    }

    public void onExitLayoutOrScroll() {
        this.onExitLayoutOrScroll(true);
    }

    public void onExitLayoutOrScroll(boolean bl2) {
        int n3 = this.mLayoutOrScrollCounter;
        int n4 = 1;
        this.mLayoutOrScrollCounter = n3 -= n4;
        if (n3 < n4) {
            n4 = (int)(sDebugAssertionsEnabled ? 1 : 0);
            if (n4 != 0 && n3 < 0) {
                CharSequence charSequence = new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching");
                charSequence = lu_0.a(this, charSequence);
                IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
                throw illegalStateException;
            }
            n3 = 0;
            Object var5_6 = null;
            this.mLayoutOrScrollCounter = 0;
            if (bl2) {
                this.dispatchContentChangedIfNecessary();
                this.dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean bl2;
        int n3;
        rq0 rq02;
        int n4;
        int n7;
        block12: {
            block16: {
                float f5;
                block15: {
                    RecyclerView$o recyclerView$o;
                    block14: {
                        RecyclerView$o recyclerView$o2;
                        float f6;
                        RecyclerView$o recyclerView$o3;
                        block13: {
                            float f7;
                            block10: {
                                block11: {
                                    recyclerView$o3 = this.mLayout;
                                    if (recyclerView$o3 == null) {
                                        return false;
                                    }
                                    n7 = this.mLayoutSuppressed;
                                    if (n7 != 0) {
                                        return false;
                                    }
                                    n7 = motionEvent.getAction();
                                    n4 = 8;
                                    f7 = 1.1E-44f;
                                    if (n7 != n4) return false;
                                    n7 = motionEvent.getSource() & 2;
                                    n4 = 0;
                                    f7 = 0.0f;
                                    rq02 = null;
                                    if (n7 == 0) break block10;
                                    recyclerView$o3 = this.mLayout;
                                    n7 = (int)(recyclerView$o3.canScrollVertically() ? 1 : 0);
                                    if (n7 != 0) {
                                        n7 = 9;
                                        f6 = -motionEvent.getAxisValue(n7);
                                    } else {
                                        n7 = 0;
                                        f6 = 0.0f;
                                        recyclerView$o3 = null;
                                    }
                                    recyclerView$o2 = this.mLayout;
                                    n3 = (int)(recyclerView$o2.canScrollHorizontally() ? 1 : 0);
                                    if (n3 == 0) break block11;
                                    n4 = 10;
                                    f5 = motionEvent.getAxisValue(n4);
                                    bl2 = false;
                                    Object var12_14 = null;
                                    f7 = f6;
                                    n7 = 0;
                                    f6 = 0.0f;
                                    recyclerView$o3 = null;
                                    break block12;
                                }
                                f7 = f6;
                                break block13;
                            }
                            n7 = motionEvent.getSource();
                            n3 = 0x400000;
                            f5 = 5.877472E-39f;
                            if ((n7 &= n3) == 0) break block13;
                            n7 = 26;
                            float f8 = 3.6E-44f;
                            f5 = motionEvent.getAxisValue(n7);
                            recyclerView$o = this.mLayout;
                            bl2 = recyclerView$o.canScrollVertically();
                            if (!bl2) break block14;
                            f7 = f5 = -f5;
                            break block15;
                        }
                        n7 = 0;
                        f6 = 0.0f;
                        recyclerView$o3 = null;
                        n3 = 0;
                        f5 = 0.0f;
                        recyclerView$o2 = null;
                        bl2 = false;
                        Object var12_15 = null;
                        break block12;
                    }
                    recyclerView$o = this.mLayout;
                    bl2 = recyclerView$o.canScrollHorizontally();
                    if (bl2) break block16;
                }
                n3 = 0;
                f5 = 0.0f;
                Object var8_10 = null;
            }
            bl2 = this.mLowResRotaryEncoderFeature;
        }
        float f11 = this.mScaledVerticalScrollFactor;
        n4 = (int)(f7 *= f11);
        f11 = this.mScaledHorizontalScrollFactor;
        n3 = (int)(f5 *= f11);
        if (bl2) {
            OverScroller overScroller = this.mViewFlinger.c;
            int n8 = overScroller.getFinalY();
            int n10 = overScroller.getCurrY();
            int n14 = (n8 -= n10) + n4;
            n4 = overScroller.getFinalX();
            int n15 = overScroller.getCurrX();
            int n16 = (n4 -= n15) + n3;
            int n17 = -1 << -1;
            boolean bl3 = true;
            this.smoothScrollBy(n16, n14, null, n17, bl3);
        } else {
            int n18 = 1;
            f11 = Float.MIN_VALUE;
            this.nestedScrollByInternal(n3, n4, motionEvent, n18);
        }
        if (n7 != 0 && !bl2) {
            rq02 = this.mDifferentialMotionFlingController;
            rq02.a(motionEvent, n7);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent object) {
        int n3;
        int n4 = this.mLayoutSuppressed;
        boolean bl2 = false;
        if (n4 != 0) {
            return false;
        }
        float f5 = 0.0f;
        RecyclerView$o recyclerView$o = null;
        this.mInterceptingOnItemTouchListener = null;
        n4 = this.findInterceptingOnItemTouchListener((MotionEvent)object);
        int n7 = 1;
        if (n4 != 0) {
            this.cancelScroll();
            return n7 != 0;
        }
        recyclerView$o = this.mLayout;
        if (recyclerView$o == null) {
            return false;
        }
        n4 = recyclerView$o.canScrollHorizontally();
        RecyclerView$o recyclerView$o2 = this.mLayout;
        int n8 = recyclerView$o2.canScrollVertically();
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = velocityTracker = VelocityTracker.obtain();
        }
        velocityTracker = this.mVelocityTracker;
        velocityTracker.addMovement(object);
        int n10 = object.getActionMasked();
        int n14 = object.getActionIndex();
        int n15 = 2;
        float f6 = 0.5f;
        if (n10 != 0) {
            if (n10 != n7) {
                if (n10 != n15) {
                    n4 = 3;
                    f5 = 4.2E-45f;
                    if (n10 != n4) {
                        n4 = 5;
                        f5 = 7.0E-45f;
                        if (n10 != n4) {
                            n4 = 6;
                            f5 = 8.4E-45f;
                            if (n10 == n4) {
                                this.onPointerUp((MotionEvent)object);
                            }
                        } else {
                            this.mScrollPointerId = n4 = object.getPointerId(n14);
                            f5 = object.getX(n14) + f6;
                            this.mLastTouchX = n4 = (int)f5;
                            this.mInitialTouchX = n4;
                            float f7 = object.getY(n14) + f6;
                            this.mLastTouchY = n3 = (int)f7;
                            this.mInitialTouchY = n3;
                        }
                    } else {
                        this.cancelScroll();
                    }
                } else {
                    n10 = this.mScrollPointerId;
                    if ((n10 = object.findPointerIndex(n10)) < 0) {
                        return false;
                    }
                    float f8 = object.getX(n10) + f6;
                    n14 = (int)f8;
                    float f11 = object.getY(n10) + f6;
                    n3 = (int)f11;
                    n10 = this.mScrollState;
                    if (n10 != n7) {
                        n10 = this.mInitialTouchX;
                        n10 = n14 - n10;
                        n15 = this.mInitialTouchY;
                        n15 = n3 - n15;
                        if (n4 != 0 && (n4 = Math.abs(n10)) > (n10 = this.mTouchSlop)) {
                            this.mLastTouchX = n14;
                            n4 = 1;
                            f5 = Float.MIN_VALUE;
                        } else {
                            n4 = 0;
                            f5 = 0.0f;
                            recyclerView$o = null;
                        }
                        if (n8 != 0 && (n8 = Math.abs(n15)) > (n10 = this.mTouchSlop)) {
                            this.mLastTouchY = n3;
                            n4 = 1;
                            f5 = Float.MIN_VALUE;
                        }
                        if (n4 != 0) {
                            this.setScrollState(n7);
                        }
                    }
                }
            } else {
                object = this.mVelocityTracker;
                object.clear();
                this.stopNestedScroll(0);
            }
        } else {
            n4 = this.mIgnoreMotionEventTillDown;
            if (n4 != 0) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = n4 = object.getPointerId(0);
            this.mLastTouchX = n4 = (int)(object.getX() + f6);
            this.mInitialTouchX = n4;
            f5 = object.getY() + f6;
            this.mLastTouchY = n4 = (int)f5;
            this.mInitialTouchY = n4;
            n3 = (int)(this.stopGlowAnimations((MotionEvent)object) ? 1 : 0);
            if (n3 != 0 || (n3 = this.mScrollState) == n15) {
                object = this.getParent();
                object.requestDisallowInterceptTouchEvent(n7 != 0);
                this.setScrollState(n7);
                this.stopNestedScroll(n7);
            }
            object = this.mNestedOffsets;
            object[n7] = (MotionEvent)false;
            object[0] = (MotionEvent)false;
            this.startNestedScrollForType(0);
        }
        n3 = this.mScrollState;
        if (n3 == n7) {
            bl2 = true;
        }
        return bl2;
    }

    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        Trace.beginSection((String)TRACE_ON_LAYOUT_TAG);
        this.dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onMeasure(int n3, int n4) {
        Object object = this.mLayout;
        if (object == null) {
            this.defaultOnMeasure(n3, n4);
            return;
        }
        int n7 = ((RecyclerView$o)object).isAutoMeasureEnabled();
        int n8 = 1;
        int n10 = 0;
        RecyclerView$y recyclerView$y = null;
        if (n7 != 0) {
            n7 = View.MeasureSpec.getMode((int)n3);
            int n14 = View.MeasureSpec.getMode((int)n4);
            RecyclerView$o recyclerView$o = this.mLayout;
            RecyclerView$u recyclerView$u = this.mRecycler;
            RecyclerView$y recyclerView$y2 = this.mState;
            recyclerView$o.onMeasure(recyclerView$u, recyclerView$y2, n3, n4);
            int n15 = 0x40000000;
            if (n7 == n15 && n14 == n15) {
                n10 = 1;
            }
            this.mLastAutoMeasureSkippedDueToExact = n10;
            if (n10 != 0 || (object = this.mAdapter) == null) return;
            object = this.mState;
            n7 = ((RecyclerView$y)object).d;
            if (n7 == n8) {
                this.dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(n3, n4);
            this.mState.i = n8;
            this.dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(n3, n4);
            object = this.mLayout;
            n7 = (int)(((RecyclerView$o)object).shouldMeasureTwice() ? 1 : 0);
            if (n7 != 0) {
                object = this.mLayout;
                n10 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)n15);
                n14 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredHeight(), (int)n15);
                ((RecyclerView$o)object).setMeasureSpecs(n10, n14);
                this.mState.i = n8;
                this.dispatchLayoutStep2();
                object = this.mLayout;
                ((RecyclerView$o)object).setMeasuredDimensionFromChildren(n3, n4);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = n3 = this.getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = n3 = this.getMeasuredHeight();
            return;
        } else {
            Object object2;
            n7 = (int)(this.mHasFixedSize ? 1 : 0);
            if (n7 != 0) {
                object = this.mLayout;
                RecyclerView$u recyclerView$u = this.mRecycler;
                recyclerView$y = this.mState;
                ((RecyclerView$o)object).onMeasure(recyclerView$u, recyclerView$y, n3, n4);
                return;
            }
            n7 = (int)(this.mAdapterUpdateDuringMeasure ? 1 : 0);
            if (n7 != 0) {
                this.startInterceptRequestLayout();
                this.onEnterLayoutOrScroll();
                this.processAdapterUpdatesAndSetAnimationFlags();
                this.onExitLayoutOrScroll();
                object = this.mState;
                boolean bl2 = ((RecyclerView$y)object).k;
                if (bl2) {
                    ((RecyclerView$y)object).g = n8;
                } else {
                    this.mAdapterHelper.c();
                    object = this.mState;
                    ((RecyclerView$y)object).g = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                this.stopInterceptRequestLayout(false);
            } else {
                object = this.mState;
                n7 = (int)(((RecyclerView$y)object).k ? 1 : 0);
                if (n7 != 0) {
                    n3 = this.getMeasuredWidth();
                    n4 = this.getMeasuredHeight();
                    this.setMeasuredDimension(n3, n4);
                    return;
                }
            }
            object = this.mAdapter;
            if (object != null) {
                object2 = this.mState;
                ((RecyclerView$y)object2).e = n7 = ((RecyclerView$f)object).getItemCount();
            } else {
                object = this.mState;
                ((RecyclerView$y)object).e = 0;
            }
            this.startInterceptRequestLayout();
            object = this.mLayout;
            object2 = this.mRecycler;
            RecyclerView$y recyclerView$y3 = this.mState;
            ((RecyclerView$o)object).onMeasure((RecyclerView$u)object2, recyclerView$y3, n3, n4);
            this.stopInterceptRequestLayout(false);
            RecyclerView$y recyclerView$y4 = this.mState;
            recyclerView$y4.g = false;
        }
    }

    public boolean onRequestFocusInDescendants(int n3, Rect rect) {
        boolean bl2 = this.isComputingLayout();
        if (bl2) {
            return false;
        }
        return super.onRequestFocusInDescendants(n3, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean bl2 = parcelable instanceof RecyclerView$SavedState;
        if (!bl2) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (RecyclerView$SavedState)parcelable;
        this.mPendingSavedState = parcelable;
        parcelable = parcelable.getSuperState();
        super.onRestoreInstanceState(parcelable);
        this.requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        Object object = super.onSaveInstanceState();
        RecyclerView$SavedState recyclerView$SavedState = new AbsSavedState((Parcelable)object);
        object = this.mPendingSavedState;
        if (object != null) {
            object = ((RecyclerView$SavedState)object).a;
            recyclerView$SavedState.a = object;
        } else {
            object = this.mLayout;
            if (object != null) {
                object = ((RecyclerView$o)object).onSaveInstanceState();
                recyclerView$SavedState.a = object;
            } else {
                object = null;
                recyclerView$SavedState.a = null;
            }
        }
        return recyclerView$SavedState;
    }

    public void onScrollStateChanged(int n3) {
    }

    public void onScrolled(int n3, int n4) {
    }

    public void onSizeChanged(int n3, int n4, int n7, int n8) {
        super.onSizeChanged(n3, n4, n7, n8);
        if (n3 != n7 || n4 != n8) {
            this.invalidateGlows();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean onTouchEvent(MotionEvent var1_1) {
        block40: {
            block48: {
                block44: {
                    block41: {
                        block47: {
                            block46: {
                                block42: {
                                    block45: {
                                        block43: {
                                            var2_2 = this;
                                            var3_3 = var1_1;
                                            var4_4 /* !! */  = this.mLayoutSuppressed;
                                            if (var4_4 /* !! */  != 0 || (var4_4 /* !! */  = this.mIgnoreMotionEventTillDown) != 0) break block40;
                                            var4_4 /* !! */  = this.dispatchToOnItemTouchListeners(var1_1);
                                            var5_5 = 1;
                                            if (var4_4 /* !! */  != 0) {
                                                this.cancelScroll();
                                                return (boolean)var5_5;
                                            }
                                            var6_6 = this.mLayout;
                                            if (var6_6 == null) {
                                                return false;
                                            }
                                            var7_7 = var6_6.canScrollHorizontally();
                                            var8_8 = this.mLayout.canScrollVertically();
                                            var6_6 = this.mVelocityTracker;
                                            if (var6_6 == null) {
                                                var6_6 = VelocityTracker.obtain();
                                                this.mVelocityTracker = var6_6;
                                            }
                                            var4_4 /* !! */  = var1_1.getActionMasked();
                                            var9_9 /* !! */  = var1_1.getActionIndex();
                                            if (var4_4 /* !! */  == 0) {
                                                var10_10 /* !! */  = var2_2.mNestedOffsets;
                                                var10_10 /* !! */ [var5_5] = 0;
                                                var10_10 /* !! */ [0] = 0;
                                            }
                                            var11_11 = MotionEvent.obtain((MotionEvent)var1_1);
                                            var10_10 /* !! */  = var2_2.mNestedOffsets;
                                            var12_12 = var10_10 /* !! */ [0];
                                            var13_13 = var12_12;
                                            var14_14 = var10_10 /* !! */ [var5_5];
                                            var11_11.offsetLocation(var13_13, var14_14);
                                            var15_15 = 0x3F000000;
                                            var14_14 = 0.5f;
                                            if (var4_4 /* !! */  == 0) break block41;
                                            if (var4_4 /* !! */  == var5_5) break block42;
                                            var12_12 = 2;
                                            var13_13 = 2.8E-45f;
                                            if (var4_4 /* !! */  == var12_12) break block43;
                                            var12_12 = 3;
                                            var13_13 = 4.2E-45f;
                                            if (var4_4 /* !! */  != var12_12) {
                                                var12_12 = 5;
                                                var13_13 = 7.0E-45f;
                                                if (var4_4 /* !! */  != var12_12) {
                                                    var9_9 /* !! */  = 6;
                                                    var16_16 = 8.4E-45f;
                                                    if (var4_4 /* !! */  == var9_9 /* !! */ ) {
                                                        this.onPointerUp(var1_1);
                                                    }
                                                } else {
                                                    var2_2.mScrollPointerId = var4_4 /* !! */  = var3_3.getPointerId(var9_9 /* !! */ );
                                                    var2_2.mLastTouchX = var4_4 /* !! */  = (int)(var3_3.getX(var9_9 /* !! */ ) + var14_14);
                                                    var2_2.mInitialTouchX = var4_4 /* !! */ ;
                                                    var17_19 = var3_3.getY(var9_9 /* !! */ ) + var14_14;
                                                    var2_2.mLastTouchY = var4_4 /* !! */  = (int)var17_19;
                                                    var2_2.mInitialTouchY = var4_4 /* !! */ ;
                                                }
                                            } else {
                                                this.cancelScroll();
                                            }
                                            break block44;
                                        }
                                        var4_4 /* !! */  = var2_2.mScrollPointerId;
                                        if ((var4_4 /* !! */  = var3_3.findPointerIndex(var4_4 /* !! */ )) < 0) {
                                            return false;
                                        }
                                        var16_17 = var3_3.getX(var4_4 /* !! */ ) + var14_14;
                                        var18_23 = (int)var16_17;
                                        var17_20 = var3_3.getY(var4_4 /* !! */ ) + var14_14;
                                        var19_24 = (int)var17_20;
                                        var4_4 /* !! */  = var2_2.mLastTouchX - var18_23;
                                        var9_9 /* !! */  = var2_2.mLastTouchY - var19_24;
                                        var15_15 = var2_2.mScrollState;
                                        if (var15_15 == var5_5) break block45;
                                        if (!var7_7) ** GOTO lbl-1000
                                        if (var4_4 /* !! */  > 0) {
                                            var15_15 = var2_2.mTouchSlop;
                                            var4_4 /* !! */  -= var15_15;
                                            var4_4 /* !! */  = Math.max(0, var4_4 /* !! */ );
                                        } else {
                                            var15_15 = var2_2.mTouchSlop;
                                            var4_4 /* !! */  += var15_15;
                                            var4_4 /* !! */  = Math.min(0, var4_4 /* !! */ );
                                        }
                                        if (var4_4 /* !! */  != 0) {
                                            var15_15 = 1;
                                            var14_14 = 1.4E-45f;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var15_15 = 0;
                                            var14_14 = 0.0f;
                                            var10_10 /* !! */  = null;
                                        }
                                        if (var8_8) {
                                            if (var9_9 /* !! */  > 0) {
                                                var12_12 = var2_2.mTouchSlop;
                                                var9_9 /* !! */  -= var12_12;
                                                var9_9 /* !! */  = Math.max(0, var9_9 /* !! */ );
                                            } else {
                                                var12_12 = var2_2.mTouchSlop;
                                                var9_9 /* !! */  += var12_12;
                                                var9_9 /* !! */  = Math.min(0, var9_9 /* !! */ );
                                            }
                                            if (var9_9 /* !! */  != 0) {
                                                var15_15 = 1;
                                                var14_14 = 1.4E-45f;
                                            }
                                        }
                                        if (var15_15 != 0) {
                                            var2_2.setScrollState(var5_5);
                                        }
                                    }
                                    if ((var15_15 = var2_2.mScrollState) == var5_5) {
                                        var10_10 /* !! */  = var2_2.mReusableIntPair;
                                        var10_10 /* !! */ [0] = 0;
                                        var10_10 /* !! */ [var5_5] = 0;
                                        var14_14 = var1_1.getY();
                                        var15_15 = var2_2.releaseHorizontalGlow(var4_4 /* !! */ , var14_14);
                                        var20_25 = var4_4 /* !! */  - var15_15;
                                        var17_20 = var1_1.getX();
                                        var4_4 /* !! */  = var2_2.releaseVerticalGlow(var9_9 /* !! */ , var17_20);
                                        var21_26 = var9_9 /* !! */  - var4_4 /* !! */ ;
                                        if (var7_7) {
                                            var9_9 /* !! */  = var20_25;
                                        } else {
                                            var9_9 /* !! */  = 0;
                                            var16_17 = 0.0f;
                                            var22_27 = null;
                                        }
                                        if (var8_8) {
                                            var15_15 = var21_26;
                                        } else {
                                            var15_15 = 0;
                                            var14_14 = 0.0f;
                                            var10_10 /* !! */  = null;
                                        }
                                        var23_30 = var2_2.mReusableIntPair;
                                        var24_31 = var2_2.mScrollOffset;
                                        var6_6 = this;
                                        var4_4 /* !! */  = (int)this.dispatchNestedPreScroll(var9_9 /* !! */ , var15_15, var23_30, var24_31, 0);
                                        if (var4_4 /* !! */  != 0) {
                                            var6_6 = var2_2.mReusableIntPair;
                                            var9_9 /* !! */  = (int)var6_6[0];
                                            var20_25 -= var9_9 /* !! */ ;
                                            var4_4 /* !! */  = (int)var6_6[var5_5];
                                            var21_26 -= var4_4 /* !! */ ;
                                            var6_6 = var2_2.mNestedOffsets;
                                            var9_9 /* !! */  = (int)var6_6[0];
                                            var10_10 /* !! */  = var2_2.mScrollOffset;
                                            var12_12 = var10_10 /* !! */ [0];
                                            var6_6[0] = var9_9 /* !! */  += var12_12;
                                            var9_9 /* !! */  = (int)var6_6[var5_5];
                                            var15_15 = var10_10 /* !! */ [var5_5];
                                            var6_6[var5_5] = var9_9 /* !! */  += var15_15;
                                            var6_6 = this.getParent();
                                            var6_6.requestDisallowInterceptTouchEvent((boolean)var5_5);
                                        }
                                        var4_4 /* !! */  = var21_26;
                                        var22_27 = var2_2.mScrollOffset;
                                        var15_15 = var22_27[0];
                                        var2_2.mLastTouchX = var18_23 -= var15_15;
                                        var9_9 /* !! */  = var22_27[var5_5];
                                        var2_2.mLastTouchY = var19_24 -= var9_9 /* !! */ ;
                                        if (var7_7) {
                                            var9_9 /* !! */  = var20_25;
                                        } else {
                                            var9_9 /* !! */  = 0;
                                            var16_17 = 0.0f;
                                            var22_27 = null;
                                        }
                                        if (var8_8) {
                                            var15_15 = var4_4 /* !! */ ;
                                        } else {
                                            var15_15 = 0;
                                            var14_14 = 0.0f;
                                            var10_10 /* !! */  = null;
                                        }
                                        var9_9 /* !! */  = (int)var2_2.scrollByInternal(var9_9 /* !! */ , var15_15, var3_3, 0);
                                        if (var9_9 /* !! */  != 0) {
                                            var22_27 = this.getParent();
                                            var22_27.requestDisallowInterceptTouchEvent((boolean)var5_5);
                                        }
                                        if ((var22_27 = (Object)var2_2.mGapWorker) != null && (var20_25 != 0 || var4_4 /* !! */  != 0)) {
                                            var22_27.a(var2_2, var20_25, var4_4 /* !! */ );
                                        }
                                    }
                                    break block44;
                                }
                                var2_2.mVelocityTracker.addMovement(var11_11);
                                var6_6 = var2_2.mVelocityTracker;
                                var9_9 /* !! */  = var2_2.mMaxFlingVelocity;
                                var16_18 = var9_9 /* !! */ ;
                                var15_15 = 1000;
                                var14_14 = 1.401E-42f;
                                var6_6.computeCurrentVelocity(var15_15, var16_18);
                                var4_4 /* !! */  = 0;
                                var17_21 = 0.0f;
                                var6_6 = null;
                                if (var7_7) {
                                    var22_28 = var2_2.mVelocityTracker;
                                    var15_15 = var2_2.mScrollPointerId;
                                    var16_18 = -var22_28.getXVelocity(var15_15);
                                } else {
                                    var9_9 /* !! */  = 0;
                                    var16_18 = 0.0f;
                                    var22_29 = null;
                                }
                                if (var8_8) {
                                    var10_10 /* !! */  = (int[])var2_2.mVelocityTracker;
                                    var12_12 = var2_2.mScrollPointerId;
                                    var14_14 = -var10_10 /* !! */ .getYVelocity(var12_12);
                                } else {
                                    var15_15 = 0;
                                    var14_14 = 0.0f;
                                    var10_10 /* !! */  = null;
                                }
                                var12_12 = (int)((cfr_temp_0 = var16_18 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                if (var12_12 == 0 && (var4_4 /* !! */  = (int)((cfr_temp_1 = var14_14 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) == 0) break block46;
                                var4_4 /* !! */  = (int)var16_18;
                                var9_9 /* !! */  = (int)var14_14;
                                if ((var4_4 /* !! */  = (int)var2_2.fling(var4_4 /* !! */ , var9_9 /* !! */ )) != 0) break block47;
                            }
                            var2_2.setScrollState(0);
                        }
                        this.resetScroll();
                        break block48;
                    }
                    var2_2.mScrollPointerId = var4_4 /* !! */  = var3_3.getPointerId(0);
                    var2_2.mLastTouchX = var4_4 /* !! */  = (int)(var1_1.getX() + var14_14);
                    var2_2.mInitialTouchX = var4_4 /* !! */ ;
                    var17_22 = var1_1.getY() + var14_14;
                    var2_2.mLastTouchY = var4_4 /* !! */  = (int)var17_22;
                    var2_2.mInitialTouchY = var4_4 /* !! */ ;
                    var2_2.startNestedScrollForType(0);
                }
                var6_6 = var2_2.mVelocityTracker;
                var6_6.addMovement(var11_11);
            }
            var11_11.recycle();
            return (boolean)var5_5;
        }
        return false;
    }

    public void postAnimationRunner() {
        boolean bl2 = this.mPostedAnimatorRunner;
        if (!bl2 && (bl2 = this.mIsAttached)) {
            Runnable runnable2 = this.mItemAnimatorRunner;
            this.postOnAnimation(runnable2);
            this.mPostedAnimatorRunner = bl2 = true;
        }
    }

    public void processDataSetCompletelyChanged(boolean bl2) {
        boolean bl3 = this.mDispatchItemsChangedEvent;
        this.mDispatchItemsChangedEvent = bl2 |= bl3;
        this.mDataSetHasChangedAfterLayout = true;
        this.markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(RecyclerView$B recyclerView$B, RecyclerView$l$c recyclerView$l$c) {
        int n3;
        B$a b$a;
        int n4 = 8192;
        recyclerView$B.setFlags(0, n4);
        Object object = this.mState;
        boolean bl2 = ((RecyclerView$y)object).h;
        if (bl2 && (bl2 = recyclerView$B.isUpdated()) && !(bl2 = recyclerView$B.isRemoved()) && !(bl2 = recyclerView$B.shouldIgnore())) {
            long l2 = this.getChangedHolderKey(recyclerView$B);
            pb1_0 pb1_02 = this.mViewInfoStore.b;
            pb1_02.l(l2, recyclerView$B);
        }
        if ((b$a = (B$a)((a53)(object = this.mViewInfoStore.a)).get(recyclerView$B)) == null) {
            b$a = B$a.a();
            ((a53)object).put(recyclerView$B, b$a);
        }
        b$a.b = recyclerView$l$c;
        b$a.a = n3 = b$a.a | 4;
    }

    public void removeAndRecycleViews() {
        Object object = this.mItemAnimator;
        if (object != null) {
            ((RecyclerView$l)object).e();
        }
        if ((object = this.mLayout) != null) {
            RecyclerView$u recyclerView$u = this.mRecycler;
            ((RecyclerView$o)object).removeAndRecycleAllViews(recyclerView$u);
            object = this.mLayout;
            recyclerView$u = this.mRecycler;
            ((RecyclerView$o)object).removeAndRecycleScrapInt(recyclerView$u);
        }
        this.mRecycler.b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean removeAnimatingView(View object) {
        Throwable throwable2;
        block13: {
            int n3;
            Object object2;
            Object object3;
            block12: {
                this.startInterceptRequestLayout();
                object3 = this.mChildHelper;
                object2 = ((c_0)object3).b;
                c$b c$b = ((c_0)object3).a;
                int n4 = ((c_0)object3).d;
                n3 = 1;
                if (n4 == n3) {
                    object3 = ((c_0)object3).e;
                    if (object3 != object) {
                        object = new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
                        throw object;
                    }
                } else {
                    block11: {
                        int n7 = 2;
                        if (n4 == n7) {
                            object = new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                            throw object;
                        }
                        try {
                            ((c_0)object3).d = n7;
                            Object object4 = c$b;
                            object4 = (RecyclerView$d)c$b;
                            object4 = ((RecyclerView$d)object4).a;
                            n4 = object4.indexOfChild(object);
                            n7 = -1;
                            if (n4 == n7) {
                                ((c_0)object3).m((View)object);
                            } else {
                                n7 = (int)(((c$a)object2).d(n4) ? 1 : 0);
                                if (n7 == 0) break block11;
                                ((c$a)object2).f(n4);
                                ((c_0)object3).m((View)object);
                                c$b = (RecyclerView$d)c$b;
                                ((RecyclerView$d)c$b).a(n4);
                            }
                            ((c_0)object3).d = 0;
                            break block12;
                        }
                        catch (Throwable throwable2) {
                            break block13;
                        }
                    }
                    ((c_0)object3).d = 0;
                }
                n3 = 0;
            }
            if (n3 != 0) {
                object3 = RecyclerView.getChildViewHolderInt(object);
                this.mRecycler.n((RecyclerView$B)object3);
                object2 = this.mRecycler;
                ((RecyclerView$u)object2).k((RecyclerView$B)object3);
                boolean bl2 = sVerboseLoggingEnabled;
                if (bl2) {
                    Objects.toString(object);
                    this.toString();
                }
            }
            boolean bl3 = n3 ^ 1;
            this.stopInterceptRequestLayout(bl3);
            return n3 != 0;
        }
        ((c_0)object3).d = 0;
        throw throwable2;
    }

    public void removeDetachedView(View object, boolean bl2) {
        Object object2;
        block9: {
            block8: {
                block7: {
                    object2 = RecyclerView.getChildViewHolderInt(object);
                    if (object2 == null) break block7;
                    boolean bl3 = ((RecyclerView$B)object2).isTmpDetached();
                    if (bl3) {
                        ((RecyclerView$B)object2).clearTmpDetachFlag();
                    } else {
                        bl3 = ((RecyclerView$B)object2).shouldIgnore();
                        if (!bl3) {
                            CharSequence charSequence = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                            charSequence.append(object2);
                            charSequence = lu_0.a(this, charSequence);
                            object = new IllegalArgumentException((String)charSequence);
                            throw object;
                        }
                    }
                    break block8;
                }
                boolean bl4 = sDebugAssertionsEnabled;
                if (bl4) break block9;
            }
            object.clearAnimation();
            this.dispatchChildDetached((View)object);
            super.removeDetachedView(object, bl2);
            return;
        }
        object2 = new StringBuilder("No ViewHolder found for child: ");
        ((StringBuilder)object2).append(object);
        object = lu_0.a(this, (StringBuilder)object2);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    /*
     * WARNING - void declaration
     */
    public void removeItemDecoration(RecyclerView$n object) {
        Object object2 = this.mLayout;
        if (object2 != null) {
            String string2 = "Cannot remove item decoration during a scroll  or layout";
            ((RecyclerView$o)object2).assertNotInLayoutOrScroll(string2);
        }
        object2 = this.mItemDecorations;
        ((ArrayList)object2).remove(object);
        object = this.mItemDecorations;
        boolean n3 = ((ArrayList)object).isEmpty();
        if (n3) {
            void var4_8;
            int n4;
            int n7 = this.getOverScrollMode();
            if (n7 == (n4 = 2)) {
                boolean bl2 = true;
            } else {
                boolean bl3 = false;
                object = null;
            }
            this.setWillNotDraw((boolean)var4_8);
        }
        this.markItemDecorInsetsDirty();
        this.requestLayout();
    }

    public void removeItemDecorationAt(int n3) {
        int n4 = this.getItemDecorationCount();
        if (n3 >= 0 && n3 < n4) {
            RecyclerView$n recyclerView$n = this.getItemDecorationAt(n3);
            this.removeItemDecoration(recyclerView$n);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        stringBuilder.append(" is an invalid index for size ");
        stringBuilder.append(n4);
        String string2 = stringBuilder.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public void removeOnChildAttachStateChangeListener(RecyclerView$p recyclerView$p) {
        List list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(recyclerView$p);
    }

    public void removeOnItemTouchListener(RecyclerView$r recyclerView$r) {
        this.mOnItemTouchListeners.remove(recyclerView$r);
        RecyclerView$r recyclerView$r2 = this.mInterceptingOnItemTouchListener;
        if (recyclerView$r2 == recyclerView$r) {
            recyclerView$r = null;
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(RecyclerView$s recyclerView$s) {
        List list = this.mScrollListeners;
        if (list != null) {
            list.remove(recyclerView$s);
        }
    }

    public void removeRecyclerListener(RecyclerView$v recyclerView$v) {
        this.mRecyclerListeners.remove(recyclerView$v);
    }

    public void repositionShadowingViews() {
        c_0 c_02 = this.mChildHelper;
        int n3 = c_02.e();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = this.mChildHelper.d(i3);
            RecyclerView$B recyclerView$B = this.getChildViewHolder(view);
            if (recyclerView$B == null || (recyclerView$B = recyclerView$B.mShadowingHolder) == null) continue;
            recyclerView$B = recyclerView$B.itemView;
            int n4 = view.getLeft();
            int n7 = view.getTop();
            int n8 = recyclerView$B.getLeft();
            if (n4 == n8 && n7 == (n8 = recyclerView$B.getTop())) continue;
            n8 = recyclerView$B.getWidth() + n4;
            int n10 = recyclerView$B.getHeight() + n7;
            recyclerView$B.layout(n4, n7, n8, n10);
        }
    }

    public void requestChildFocus(View view, View view2) {
        RecyclerView$o recyclerView$o = this.mLayout;
        RecyclerView$y recyclerView$y = this.mState;
        boolean bl2 = recyclerView$o.onRequestChildFocus(this, recyclerView$y, view, view2);
        if (!bl2 && view2 != null) {
            this.requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean bl2) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, bl2);
    }

    public void requestDisallowInterceptTouchEvent(boolean bl2) {
        ArrayList arrayList = this.mOnItemTouchListeners;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            RecyclerView$r recyclerView$r = (RecyclerView$r)this.mOnItemTouchListeners.get(i3);
            recyclerView$r.e(bl2);
        }
        super.requestDisallowInterceptTouchEvent(bl2);
    }

    public void requestLayout() {
        int n3 = this.mInterceptRequestLayoutDepth;
        if (n3 == 0 && (n3 = (int)(this.mLayoutSuppressed ? 1 : 0)) == 0) {
            super.requestLayout();
        } else {
            n3 = 1;
            this.mLayoutWasDefered = n3;
        }
    }

    public void saveOldPositions() {
        Object object = this.mChildHelper;
        int n3 = ((c_0)object).h();
        CharSequence charSequence = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            RecyclerView$B recyclerView$B = RecyclerView.getChildViewHolderInt(this.mChildHelper.g(i3));
            int n7 = sDebugAssertionsEnabled;
            if (n7 != 0 && (n7 = recyclerView$B.mPosition) == (n4 = -1) && (n7 = (int)(recyclerView$B.isRemoved() ? 1 : 0)) == 0) {
                charSequence = new StringBuilder("view holder cannot have position -1 unless it is removed");
                charSequence = lu_0.a(this, charSequence);
                object = new IllegalStateException((String)charSequence);
                throw object;
            }
            n7 = (int)(recyclerView$B.shouldIgnore() ? 1 : 0);
            if (n7 != 0) continue;
            recyclerView$B.saveOldPosition();
        }
    }

    public void scrollBy(int n3, int n4) {
        RecyclerView$o recyclerView$o = this.mLayout;
        if (recyclerView$o == null) {
            return;
        }
        boolean bl2 = this.mLayoutSuppressed;
        if (bl2) {
            return;
        }
        boolean bl3 = recyclerView$o.canScrollHorizontally();
        RecyclerView$o recyclerView$o2 = this.mLayout;
        bl2 = recyclerView$o2.canScrollVertically();
        if (bl3 || bl2) {
            if (!bl3) {
                n3 = 0;
            }
            if (!bl2) {
                n4 = 0;
            }
            bl3 = false;
            recyclerView$o = null;
            this.scrollByInternal(n3, n4, null, 0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean scrollByInternal(int n3, int n4, MotionEvent motionEvent, int n7) {
        void var10_15;
        void var14_21;
        int n8;
        int n10;
        Object object;
        int n14;
        int n15;
        Object object2;
        RecyclerView recyclerView = this;
        MotionEvent motionEvent2 = motionEvent;
        this.consumePendingUpdateOperations();
        Object object22 = this.mAdapter;
        boolean bl2 = true;
        if (object22 != null) {
            object22 = this.mReusableIntPair;
            object22[0] = false;
            object22[bl2] = false;
            this.scrollStep(n3, n4, (int[])object22);
            object22 = this.mReusableIntPair;
            object2 = object22[0];
            Object n18 = object22[bl2];
            n15 = n3 - object2;
            n14 = n4 - n18;
            object = n18;
            reference var14_19 = object2;
            n10 = n15;
            n8 = n14;
        } else {
            object = 0;
            boolean bl3 = false;
            n10 = 0;
            n8 = 0;
        }
        object22 = recyclerView.mItemDecorations;
        boolean bl4 = ((ArrayList)object22).isEmpty();
        if (!bl4) {
            this.invalidate();
        }
        int[] nArray = recyclerView.mReusableIntPair;
        nArray[0] = 0;
        nArray[bl2] = 0;
        int[] nArray2 = recyclerView.mScrollOffset;
        object22 = this;
        object2 = var14_21;
        n15 = object;
        n14 = n10;
        int n16 = n8;
        int n17 = n7;
        this.dispatchNestedScroll((int)var14_21, (int)object, n10, n8, nArray2, n7, nArray);
        object22 = recyclerView.mReusableIntPair;
        object2 = object22[0];
        n15 = n10 - object2;
        Object object3 = object22[bl2];
        n14 = n8 - object3;
        if (object2 == false && object3 == false) {
            boolean bl5 = false;
            object22 = null;
        } else {
            boolean bl6 = true;
        }
        object2 = recyclerView.mLastTouchX;
        int[] nArray3 = recyclerView.mScrollOffset;
        int n18 = nArray3[0];
        recyclerView.mLastTouchX = (int)(object2 -= n18);
        object2 = recyclerView.mLastTouchY;
        n16 = nArray3[bl2];
        recyclerView.mLastTouchY = (int)(object2 -= n16);
        int[] nArray4 = recyclerView.mNestedOffsets;
        nArray4[0] = n17 = nArray4[0] + n18;
        nArray4[bl2] = n18 = nArray4[bl2] + n16;
        object2 = this.getOverScrollMode();
        n16 = 2;
        float f5 = 2.8E-45f;
        if (object2 != n16) {
            if (motionEvent2 != null) {
                float f6 = 1.1482E-41f;
                object2 = jq1_1.c(motionEvent2, 8194);
                if (object2 == false) {
                    f6 = motionEvent.getX();
                    float f7 = n15;
                    f5 = motionEvent.getY();
                    float f8 = n14;
                    recyclerView.pullGlows(f6, f7, f5, f8);
                    object2 = Build.VERSION.SDK_INT;
                    n15 = 31;
                    f7 = 4.3E-44f;
                    if (object2 >= n15) {
                        f6 = 5.877472E-39f;
                        object2 = jq1_1.c(motionEvent2, 0x400000);
                        if (object2 != false) {
                            this.releaseGlows();
                        }
                    }
                }
            }
            this.considerReleasingGlowsOnScroll(n3, n4);
        }
        if (var14_21 != false || object != 0) {
            recyclerView.dispatchOnScrolled((int)var14_21, (int)object);
        }
        if ((object2 = (Object)this.awakenScrollBars()) == false) {
            this.invalidate();
        }
        if (var10_15 == false && var14_21 == false && object == 0) {
            bl2 = false;
        }
        return bl2;
    }

    public void scrollStep(int n3, int n4, int[] nArray) {
        RecyclerView$y recyclerView$y;
        RecyclerView$u recyclerView$u;
        RecyclerView$o recyclerView$o;
        this.startInterceptRequestLayout();
        this.onEnterLayoutOrScroll();
        Trace.beginSection((String)TRACE_SCROLL_TAG);
        RecyclerView$y recyclerView$y2 = this.mState;
        this.fillRemainingScrollValues(recyclerView$y2);
        recyclerView$y2 = null;
        if (n3 != 0) {
            recyclerView$o = this.mLayout;
            recyclerView$u = this.mRecycler;
            recyclerView$y = this.mState;
            n3 = recyclerView$o.scrollHorizontallyBy(n3, recyclerView$u, recyclerView$y);
        } else {
            n3 = 0;
        }
        if (n4 != 0) {
            recyclerView$o = this.mLayout;
            recyclerView$u = this.mRecycler;
            recyclerView$y = this.mState;
            n4 = recyclerView$o.scrollVerticallyBy(n4, recyclerView$u, recyclerView$y);
        } else {
            n4 = 0;
        }
        Trace.endSection();
        this.repositionShadowingViews();
        this.onExitLayoutOrScroll();
        this.stopInterceptRequestLayout(false);
        if (nArray != null) {
            nArray[0] = n3;
            n3 = 1;
            nArray[n3] = n4;
        }
    }

    public void scrollTo(int n3, int n4) {
    }

    public void scrollToPosition(int n3) {
        boolean bl2 = this.mLayoutSuppressed;
        if (bl2) {
            return;
        }
        this.stopScroll();
        RecyclerView$o recyclerView$o = this.mLayout;
        if (recyclerView$o == null) {
            return;
        }
        recyclerView$o.scrollToPosition(n3);
        this.awakenScrollBars();
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        boolean bl2 = this.shouldDeferAccessibilityEvent(accessibilityEvent);
        if (bl2) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(v v4) {
        this.mAccessibilityDelegate = v4;
        ViewCompat.s((View)this, v4);
    }

    public void setAdapter(RecyclerView$f recyclerView$f) {
        this.setLayoutFrozen(false);
        this.setAdapterInternal(recyclerView$f, false, true);
        this.processDataSetCompletelyChanged(false);
        this.requestLayout();
    }

    public void setChildDrawingOrderCallback(RecyclerView$j recyclerView$j) {
        boolean bl2;
        RecyclerView$j recyclerView$j2 = this.mChildDrawingOrderCallback;
        if (recyclerView$j == recyclerView$j2) {
            return;
        }
        if (recyclerView$j != null) {
            bl2 = true;
        } else {
            bl2 = false;
            recyclerView$j = null;
        }
        this.setChildrenDrawingOrderEnabled(bl2);
    }

    public boolean setChildImportantForAccessibilityInternal(RecyclerView$B recyclerView$B, int n3) {
        boolean bl2 = this.isComputingLayout();
        if (bl2) {
            recyclerView$B.mPendingAccessibilityState = n3;
            this.mPendingAccessibilityImportanceChange.add(recyclerView$B);
            return false;
        }
        recyclerView$B.itemView.setImportantForAccessibility(n3);
        return true;
    }

    public void setClipToPadding(boolean bl2) {
        boolean bl3 = this.mClipToPadding;
        if (bl2 != bl3) {
            this.invalidateGlows();
        }
        this.mClipToPadding = bl2;
        super.setClipToPadding(bl2);
        bl2 = this.mFirstLayoutComplete;
        if (bl2) {
            this.requestLayout();
        }
    }

    public void setEdgeEffectFactory(RecyclerView$k recyclerView$k) {
        recyclerView$k.getClass();
        this.mEdgeEffectFactory = recyclerView$k;
        this.invalidateGlows();
    }

    public void setHasFixedSize(boolean bl2) {
        this.mHasFixedSize = bl2;
    }

    public void setItemAnimator(RecyclerView$l recyclerView$l) {
        Object object = this.mItemAnimator;
        if (object != null) {
            ((RecyclerView$l)object).e();
            object = this.mItemAnimator;
            ((RecyclerView$l)object).a = null;
        }
        this.mItemAnimator = recyclerView$l;
        if (recyclerView$l != null) {
            recyclerView$l.a = object = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int n3) {
        RecyclerView$u recyclerView$u = this.mRecycler;
        recyclerView$u.e = n3;
        recyclerView$u.o();
    }

    public void setLayoutFrozen(boolean bl2) {
        this.suppressLayout(bl2);
    }

    public void setLayoutManager(RecyclerView$o object) {
        Object object2;
        int n3;
        Object object3;
        Object object4 = this.mLayout;
        if (object == object4) {
            return;
        }
        this.stopScroll();
        object4 = this.mLayout;
        if (object4 != null) {
            object4 = this.mItemAnimator;
            if (object4 != null) {
                ((RecyclerView$l)object4).e();
            }
            object4 = this.mLayout;
            object3 = this.mRecycler;
            ((RecyclerView$o)object4).removeAndRecycleAllViews((RecyclerView$u)object3);
            object4 = this.mLayout;
            object3 = this.mRecycler;
            ((RecyclerView$o)object4).removeAndRecycleScrapInt((RecyclerView$u)object3);
            object4 = this.mRecycler;
            ((RecyclerView$u)object4).b();
            boolean bl2 = this.mIsAttached;
            if (bl2) {
                object4 = this.mLayout;
                object3 = this.mRecycler;
                ((RecyclerView$o)object4).dispatchDetachedFromWindow(this, (RecyclerView$u)object3);
            }
            object4 = this.mLayout;
            n3 = 0;
            object3 = null;
            ((RecyclerView$o)object4).setRecyclerView(null);
            this.mLayout = null;
        } else {
            object4 = this.mRecycler;
            ((RecyclerView$u)object4).b();
        }
        object4 = this.mChildHelper;
        ((c_0)object4).b.g();
        object3 = ((c_0)object4).c;
        int n4 = ((ArrayList)object3).size() + -1;
        while (true) {
            object2 = ((c_0)object4).a;
            if (n4 < 0) break;
            Object object5 = (View)((ArrayList)object3).get(n4);
            object2 = (RecyclerView$d)object2;
            object2.getClass();
            object5 = RecyclerView.getChildViewHolderInt((View)object5);
            if (object5 != null) {
                object2 = ((RecyclerView$d)object2).a;
                ((RecyclerView$B)object5).onLeftHiddenState((RecyclerView)object2);
            }
            ((ArrayList)object3).remove(n4);
            n4 += -1;
        }
        object2 = (RecyclerView$d)object2;
        object4 = ((RecyclerView$d)object2).a;
        n3 = object4.getChildCount();
        for (n4 = 0; n4 < n3; ++n4) {
            object2 = object4.getChildAt(n4);
            ((RecyclerView)object4).dispatchChildDetached((View)object2);
            object2.clearAnimation();
        }
        object4.removeAllViews();
        this.mLayout = object;
        if (object != null) {
            object4 = ((RecyclerView$o)object).mRecyclerView;
            if (object4 == null) {
                ((RecyclerView$o)object).setRecyclerView(this);
                boolean bl3 = this.mIsAttached;
                if (bl3) {
                    object = this.mLayout;
                    ((RecyclerView$o)object).dispatchAttachedToWindow(this);
                }
            } else {
                object3 = new StringBuilder("LayoutManager ");
                ((StringBuilder)object3).append(object);
                ((StringBuilder)object3).append(" is already attached to a RecyclerView:");
                object = lu_0.a(((RecyclerView$o)object).mRecyclerView, (StringBuilder)object3);
                object4 = new IllegalArgumentException((String)object);
                throw object4;
            }
        }
        this.mRecycler.o();
        this.requestLayout();
    }

    public void setLayoutTransition(LayoutTransition object) {
        if (object == null) {
            super.setLayoutTransition(null);
            return;
        }
        object = new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        throw object;
    }

    public void setNestedScrollingEnabled(boolean bl2) {
        this.getScrollingChildHelper().h(bl2);
    }

    public void setOnFlingListener(RecyclerView$q recyclerView$q) {
        this.mOnFlingListener = recyclerView$q;
    }

    public void setOnScrollListener(RecyclerView$s recyclerView$s) {
        this.mScrollListener = recyclerView$s;
    }

    public void setPreserveFocusAfterLayout(boolean bl2) {
        this.mPreserveFocusAfterLayout = bl2;
    }

    public void setRecycledViewPool(RecyclerView$t object) {
        RecyclerView$u recyclerView$u = this.mRecycler;
        RecyclerView recyclerView = recyclerView$u.h;
        Object object2 = recyclerView.mAdapter;
        int n3 = 0;
        recyclerView$u.g((RecyclerView$f)object2, false);
        object2 = recyclerView$u.g;
        if (object2 != null) {
            ((RecyclerView$t)object2).b = n3 = ((RecyclerView$t)object2).b + -1;
        }
        recyclerView$u.g = object;
        if (object != null && (object = recyclerView.getAdapter()) != null) {
            int n4;
            object = recyclerView$u.g;
            ((RecyclerView$t)object).b = n4 = ((RecyclerView$t)object).b + 1;
        }
        recyclerView$u.f();
    }

    public void setRecyclerListener(RecyclerView$v recyclerView$v) {
        this.mRecyclerListener = recyclerView$v;
    }

    public void setScrollState(int n3) {
        int n4 = this.mScrollState;
        if (n3 == n4) {
            return;
        }
        n4 = (int)(sVerboseLoggingEnabled ? 1 : 0);
        if (n4 != 0) {
            Exception exception = new Exception();
        }
        this.mScrollState = n3;
        n4 = 2;
        if (n3 != n4) {
            this.stopScrollersInternal();
        }
        this.dispatchOnScrollStateChanged(n3);
    }

    public void setScrollingTouchSlop(int n3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get((Context)this.getContext());
        int n4 = 1;
        this.mTouchSlop = n3 != n4 ? (n3 = viewConfiguration.getScaledTouchSlop()) : (n3 = viewConfiguration.getScaledPagingTouchSlop());
    }

    public void setViewCacheExtension(RecyclerView$A recyclerView$A) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean bl2 = this.isComputingLayout();
        int n3 = 0;
        if (bl2) {
            int n4;
            if (accessibilityEvent != null) {
                n4 = accessibilityEvent.getContentChangeTypes();
            } else {
                n4 = 0;
                accessibilityEvent = null;
            }
            if (n4 != 0) {
                n3 = n4;
            }
            this.mEatenAccessibilityChangeFlags = n4 = this.mEatenAccessibilityChangeFlags | n3;
            return true;
        }
        return false;
    }

    public void smoothScrollBy(int n3, int n4) {
        this.smoothScrollBy(n3, n4, null);
    }

    public void smoothScrollBy(int n3, int n4, Interpolator interpolator2) {
        this.smoothScrollBy(n3, n4, interpolator2, -1 << -1);
    }

    public void smoothScrollBy(int n3, int n4, Interpolator interpolator2, int n7) {
        this.smoothScrollBy(n3, n4, interpolator2, n7, false);
    }

    public void smoothScrollBy(int n3, int n4, Interpolator interpolator2, int n7, boolean bl2) {
        RecyclerView$o recyclerView$o = this.mLayout;
        if (recyclerView$o == null) {
            return;
        }
        int n8 = (int)(this.mLayoutSuppressed ? 1 : 0);
        if (n8 != 0) {
            return;
        }
        int n10 = recyclerView$o.canScrollHorizontally();
        n8 = 0;
        if (n10 == 0) {
            n3 = 0;
        }
        if ((n10 = (recyclerView$o = this.mLayout).canScrollVertically()) == 0) {
            n4 = 0;
        }
        if (n3 != 0 || n4 != 0) {
            n10 = -1 << -1;
            if (n7 != n10 && n7 <= 0) {
                this.scrollBy(n3, n4);
            } else {
                if (bl2) {
                    bl2 = true;
                    if (n3 != 0) {
                        n8 = 1;
                    }
                    if (n4 != 0) {
                        n8 |= 2;
                    }
                    this.startNestedScroll(n8, (int)(bl2 ? 1 : 0));
                }
                RecyclerView$ViewFlinger recyclerView$ViewFlinger = this.mViewFlinger;
                recyclerView$ViewFlinger.c(n3, n4, interpolator2, n7);
            }
        }
    }

    public void smoothScrollToPosition(int n3) {
        boolean bl2 = this.mLayoutSuppressed;
        if (bl2) {
            return;
        }
        RecyclerView$o recyclerView$o = this.mLayout;
        if (recyclerView$o == null) {
            return;
        }
        RecyclerView$y recyclerView$y = this.mState;
        recyclerView$o.smoothScrollToPosition(this, recyclerView$y, n3);
    }

    public void startInterceptRequestLayout() {
        int n3 = this.mInterceptRequestLayoutDepth;
        int n4 = 1;
        this.mInterceptRequestLayoutDepth = n3 += n4;
        if (n3 == n4 && (n3 = (int)(this.mLayoutSuppressed ? 1 : 0)) == 0) {
            n3 = 0;
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int n3) {
        return this.getScrollingChildHelper().i(n3, 0);
    }

    public boolean startNestedScroll(int n3, int n4) {
        return this.getScrollingChildHelper().i(n3, n4);
    }

    public void stopInterceptRequestLayout(boolean bl2) {
        int n3;
        int n4;
        int n7 = this.mInterceptRequestLayoutDepth;
        int n8 = 1;
        if (n7 < n8) {
            n7 = (int)(sDebugAssertionsEnabled ? 1 : 0);
            if (n7 == 0) {
                this.mInterceptRequestLayoutDepth = n8;
            } else {
                CharSequence charSequence = new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.");
                charSequence = lu_0.a(this, charSequence);
                IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
                throw illegalStateException;
            }
        }
        n7 = 0;
        Object var5_11 = null;
        if (!bl2 && (n4 = this.mLayoutSuppressed) == 0) {
            this.mLayoutWasDefered = false;
        }
        if ((n4 = this.mInterceptRequestLayoutDepth) == n8) {
            boolean bl3;
            Object object;
            boolean bl4;
            boolean bl5;
            if (bl2 && (bl5 = this.mLayoutWasDefered) && !(bl4 = this.mLayoutSuppressed) && (object = this.mLayout) != null && (object = this.mAdapter) != null) {
                this.dispatchLayout();
            }
            if (!(bl3 = this.mLayoutSuppressed)) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth = n3 = this.mInterceptRequestLayoutDepth - n8;
    }

    public void stopNestedScroll() {
        this.getScrollingChildHelper().j(0);
    }

    public void stopNestedScroll(int n3) {
        this.getScrollingChildHelper().j(n3);
    }

    public void stopScroll() {
        this.setScrollState(0);
        this.stopScrollersInternal();
    }

    public final void suppressLayout(boolean bl2) {
        boolean bl3 = this.mLayoutSuppressed;
        if (bl2 != bl3) {
            Object object = "Do not suppressLayout in layout or scroll";
            this.assertNotInLayoutOrScroll((String)object);
            if (!bl2) {
                bl2 = false;
                Object var4_4 = null;
                this.mLayoutSuppressed = false;
                bl3 = this.mLayoutWasDefered;
                if (bl3 && (object = this.mLayout) != null && (object = this.mAdapter) != null) {
                    this.requestLayout();
                }
                this.mLayoutWasDefered = false;
            } else {
                long l2 = SystemClock.uptimeMillis();
                int n3 = 3;
                MotionEvent motionEvent = MotionEvent.obtain((long)l2, (long)l2, (int)n3, (float)0.0f, (float)0.0f, (int)0);
                this.onTouchEvent(motionEvent);
                this.mLayoutSuppressed = bl2 = true;
                this.mIgnoreMotionEventTillDown = bl2;
                this.stopScroll();
            }
        }
    }

    public void swapAdapter(RecyclerView$f recyclerView$f, boolean bl2) {
        this.setLayoutFrozen(false);
        boolean bl3 = true;
        this.setAdapterInternal(recyclerView$f, bl3, bl2);
        this.processDataSetCompletelyChanged(bl3);
        this.requestLayout();
    }

    public void viewRangeUpdate(int n3, int n4, Object object) {
        int n7;
        Object object2 = this.mChildHelper;
        int n8 = ((c_0)object2).h();
        n4 += n3;
        int n10 = 0;
        while (true) {
            int n14;
            n7 = 2;
            int n15 = 1;
            if (n10 >= n8) break;
            View view = this.mChildHelper.g(n10);
            RecyclerView$B recyclerView$B = RecyclerView.getChildViewHolderInt(view);
            if (recyclerView$B != null && (n14 = recyclerView$B.shouldIgnore()) == 0 && (n14 = recyclerView$B.mPosition) >= n3 && n14 < n4) {
                recyclerView$B.addFlags(n7);
                recyclerView$B.addChangePayload(object);
                RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
                recyclerView$LayoutParams.mInsetsDirty = n15;
            }
            ++n10;
        }
        object = this.mRecycler;
        object2 = ((RecyclerView$u)object).c;
        for (n10 = ((ArrayList)object2).size() - n15; n10 >= 0; n10 += -1) {
            int n16;
            RecyclerView$B recyclerView$B = (RecyclerView$B)((ArrayList)object2).get(n10);
            if (recyclerView$B == null || (n16 = recyclerView$B.mPosition) < n3 || n16 >= n4) continue;
            recyclerView$B.addFlags(n7);
            ((RecyclerView$u)object).i(n10);
        }
    }
}

