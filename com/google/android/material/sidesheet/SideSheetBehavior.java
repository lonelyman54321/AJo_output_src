/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.view.Gravity
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 */
package com.google.android.material.sidesheet;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper$b;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MaterialBackAnimationHelper;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel$Builder;
import com.google.android.material.sidesheet.LeftSheetDelegate;
import com.google.android.material.sidesheet.RightSheetDelegate;
import com.google.android.material.sidesheet.Sheet;
import com.google.android.material.sidesheet.SheetCallback;
import com.google.android.material.sidesheet.SheetDelegate;
import com.google.android.material.sidesheet.SheetUtils;
import com.google.android.material.sidesheet.SideSheetBehavior$1;
import com.google.android.material.sidesheet.SideSheetBehavior$2;
import com.google.android.material.sidesheet.SideSheetBehavior$SavedState;
import com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker;
import com.google.android.material.sidesheet.SideSheetCallback;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;

public class SideSheetBehavior
extends CoordinatorLayout$Behavior
implements Sheet {
    private static final int DEFAULT_ACCESSIBILITY_PANE_TITLE = 0;
    private static final int DEF_STYLE_RES = 0;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = 255;
    static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    private ColorStateList backgroundTint;
    private final Set callbacks;
    private int childWidth;
    private int coplanarSiblingViewId;
    private WeakReference coplanarSiblingViewRef;
    private final ViewDragHelper$b dragCallback;
    private boolean draggable;
    private float elevation;
    private float hideFriction;
    private boolean ignoreEvents;
    private int initialX;
    private int innerMargin;
    private int lastStableState;
    private MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private int parentInnerEdge;
    private int parentWidth;
    private ShapeAppearanceModel shapeAppearanceModel;
    private SheetDelegate sheetDelegate;
    private MaterialSideContainerBackHelper sideContainerBackHelper;
    private int state;
    private final SideSheetBehavior$StateSettlingTracker stateSettlingTracker;
    private VelocityTracker velocityTracker;
    private ViewDragHelper viewDragHelper;
    private WeakReference viewRef;

    static {
        DEFAULT_ACCESSIBILITY_PANE_TITLE = R$string.side_sheet_accessibility_pane_title;
        DEF_STYLE_RES = R$style.Widget_Material3_SideSheet;
    }

    public SideSheetBehavior() {
        int n3;
        Object object = new SideSheetBehavior$StateSettlingTracker(this);
        this.stateSettlingTracker = object;
        this.draggable = true;
        this.state = n3 = 5;
        this.lastStableState = n3;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        object = new LinkedHashSet();
        this.callbacks = object;
        this.dragCallback = object = new SideSheetBehavior$1(this);
    }

    public SideSheetBehavior(Context context, AttributeSet object) {
        super(context, (AttributeSet)object);
        float f5;
        float f6;
        int bl3;
        boolean bl2;
        ColorStateList colorStateList;
        int n3;
        boolean bl22;
        SideSheetBehavior$StateSettlingTracker sideSheetBehavior$StateSettlingTracker;
        this.stateSettlingTracker = sideSheetBehavior$StateSettlingTracker = new SideSheetBehavior$StateSettlingTracker(this);
        this.draggable = bl22 = true;
        this.state = n3 = 5;
        this.lastStableState = n3;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = n3 = -1;
        Object object2 = new LinkedHashSet();
        this.callbacks = object2;
        this.dragCallback = object2 = new SideSheetBehavior$1(this);
        object2 = R$styleable.SideSheetBehavior_Layout;
        object2 = context.obtainStyledAttributes((AttributeSet)object, (int[])object2);
        int n4 = R$styleable.SideSheetBehavior_Layout_backgroundTint;
        n4 = (int)(object2.hasValue(n4) ? 1 : 0);
        if (n4 != 0) {
            n4 = R$styleable.SideSheetBehavior_Layout_backgroundTint;
            this.backgroundTint = colorStateList = MaterialResources.getColorStateList(context, (TypedArray)object2, n4);
        }
        n4 = R$styleable.SideSheetBehavior_Layout_shapeAppearance;
        if ((n4 = (int)(object2.hasValue(n4) ? 1 : 0)) != 0) {
            n4 = 0;
            colorStateList = null;
            int n7 = DEF_STYLE_RES;
            this.shapeAppearanceModel = object = ShapeAppearanceModel.builder(context, (AttributeSet)object, 0, n7).build();
        }
        if (bl2 = object2.hasValue(bl3 = R$styleable.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            int n8 = R$styleable.SideSheetBehavior_Layout_coplanarSiblingViewId;
            n8 = object2.getResourceId(n8, n3);
            this.setCoplanarSiblingViewId(n8);
        }
        this.createMaterialShapeDrawableIfNeeded(context);
        int n10 = R$styleable.SideSheetBehavior_Layout_android_elevation;
        this.elevation = f6 = object2.getDimension(n10, -1.0f);
        int n14 = R$styleable.SideSheetBehavior_Layout_behavior_draggable;
        boolean bl4 = object2.getBoolean(n14, bl22);
        this.setDraggable(bl4);
        object2.recycle();
        this.maximumVelocity = f5 = (float)ViewConfiguration.get((Context)context).getScaledMaximumFlingVelocity();
    }

    public static /* synthetic */ boolean a(SideSheetBehavior sideSheetBehavior, int n3, View view, E2$a e2$a) {
        return sideSheetBehavior.lambda$createAccessibilityViewCommandForState$2(n3, view, e2$a);
    }

    public static /* synthetic */ int access$000(SideSheetBehavior sideSheetBehavior) {
        return sideSheetBehavior.state;
    }

    public static /* synthetic */ WeakReference access$100(SideSheetBehavior sideSheetBehavior) {
        return sideSheetBehavior.viewRef;
    }

    public static /* synthetic */ SheetDelegate access$200(SideSheetBehavior sideSheetBehavior) {
        return sideSheetBehavior.sheetDelegate;
    }

    public static /* synthetic */ void access$300(SideSheetBehavior sideSheetBehavior, View view, int n3) {
        sideSheetBehavior.dispatchOnSlide(view, n3);
    }

    public static /* synthetic */ boolean access$400(SideSheetBehavior sideSheetBehavior) {
        return sideSheetBehavior.draggable;
    }

    public static /* synthetic */ int access$500(SideSheetBehavior sideSheetBehavior, View view, float f5, float f6) {
        return sideSheetBehavior.calculateTargetStateOnViewReleased(view, f5, f6);
    }

    public static /* synthetic */ void access$600(SideSheetBehavior sideSheetBehavior, View view, int n3, boolean bl2) {
        sideSheetBehavior.startSettling(view, n3, bl2);
    }

    public static /* synthetic */ int access$700(SideSheetBehavior sideSheetBehavior) {
        return sideSheetBehavior.childWidth;
    }

    public static /* synthetic */ ViewDragHelper access$800(SideSheetBehavior sideSheetBehavior) {
        return sideSheetBehavior.viewDragHelper;
    }

    public static /* synthetic */ void b(SideSheetBehavior sideSheetBehavior, int n3) {
        sideSheetBehavior.lambda$setState$0(n3);
    }

    public static /* synthetic */ void c(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int n3, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.lambda$getCoplanarFinishAnimatorUpdateListener$1(marginLayoutParams, n3, view, valueAnimator);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int calculateCurrentOffset(int n3, View object) {
        int n4 = this.state;
        int n7 = 1;
        if (n4 != n7 && n4 != (n7 = 2)) {
            n3 = 3;
            if (n4 == n3) return 0;
            n3 = 5;
            if (n4 == n3) {
                SheetDelegate sheetDelegate = this.sheetDelegate;
                return sheetDelegate.getHiddenOffset();
            }
            object = new StringBuilder("Unexpected value: ");
            n4 = this.state;
            ((StringBuilder)object).append(n4);
            object = ((StringBuilder)object).toString();
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        SheetDelegate sheetDelegate = this.sheetDelegate;
        int n8 = sheetDelegate.getOuterEdge((View)object);
        n3 -= n8;
        return n3;
    }

    private float calculateDragDistance(float f5, float f6) {
        return Math.abs(f5 - f6);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int calculateTargetStateOnViewReleased(View view, float f5, float f6) {
        SheetDelegate sheetDelegate;
        int n3;
        int n4;
        boolean bl2 = this.isExpandingOutwards(f5);
        int n7 = 3;
        if (bl2) return n7;
        boolean bl3 = this.shouldHide(view, f5);
        if (bl3) {
            SheetDelegate sheetDelegate2 = this.sheetDelegate;
            boolean bl4 = sheetDelegate2.isSwipeSignificant(f5, f6);
            if (bl4) return 5;
            SheetDelegate sheetDelegate3 = this.sheetDelegate;
            boolean bl5 = sheetDelegate3.isReleasedCloseToInnerEdge(view);
            if (!bl5) return n7;
            return 5;
        }
        Object var6_9 = null;
        float f7 = f5 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            n4 = SheetUtils.isSwipeMostlyHorizontal(f5, f6);
            if (n4 != 0) return 5;
        }
        int n8 = view.getLeft();
        n4 = this.getExpandedOffset();
        if ((n4 = Math.abs(n8 - n4)) >= (n8 = Math.abs(n8 - (n3 = (sheetDelegate = this.sheetDelegate).getHiddenOffset())))) return 5;
        return n7;
    }

    private void clearCoplanarSiblingView() {
        WeakReference weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.coplanarSiblingViewRef = null;
    }

    private E2 createAccessibilityViewCommandForState(int n3) {
        t43 t432 = new t43(this, n3);
        return t432;
    }

    private void createMaterialShapeDrawableIfNeeded(Context object) {
        Object object2 = this.shapeAppearanceModel;
        if (object2 == null) {
            return;
        }
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
        this.materialShapeDrawable = object2 = new MaterialShapeDrawable(shapeAppearanceModel);
        ((MaterialShapeDrawable)object2).initializeElevationOverlay((Context)object);
        object2 = this.backgroundTint;
        if (object2 != null) {
            object = this.materialShapeDrawable;
            ((MaterialShapeDrawable)object).setFillColor((ColorStateList)object2);
        } else {
            object2 = new TypedValue();
            object = object.getTheme();
            int n3 = 0x1010031;
            boolean bl2 = true;
            object.resolveAttribute(n3, (TypedValue)object2, bl2);
            object = this.materialShapeDrawable;
            int n4 = ((TypedValue)object2).data;
            ((MaterialShapeDrawable)object).setTint(n4);
        }
    }

    private void dispatchOnSlide(View view, int n3) {
        Object object = this.callbacks;
        boolean bl2 = object.isEmpty();
        if (!bl2) {
            boolean bl3;
            float f5 = this.sheetDelegate.calculateSlideOffset(n3);
            object = this.callbacks.iterator();
            while (bl3 = object.hasNext()) {
                SheetCallback sheetCallback = (SheetCallback)object.next();
                sheetCallback.onSlide(view, f5);
            }
        }
    }

    private void ensureAccessibilityPaneTitleIsSet(View view) {
        CharSequence charSequence = ViewCompat.e(view);
        if (charSequence == null) {
            charSequence = view.getResources();
            int n3 = DEFAULT_ACCESSIBILITY_PANE_TITLE;
            charSequence = charSequence.getString(n3);
            ViewCompat.t(view, charSequence);
        }
    }

    public static SideSheetBehavior from(View object) {
        boolean bl2 = (object = object.getLayoutParams()) instanceof CoordinatorLayout$e;
        if (bl2) {
            object = ((CoordinatorLayout$e)((Object)object)).a;
            bl2 = object instanceof SideSheetBehavior;
            if (bl2) {
                return (SideSheetBehavior)object;
            }
            object = new IllegalArgumentException("The view is not associated with SideSheetBehavior");
            throw object;
        }
        object = new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        throw object;
    }

    private int getChildMeasureSpec(int n3, int n4, int n7, int n8) {
        n3 = ViewGroup.getChildMeasureSpec((int)n3, (int)n4, (int)n8);
        n4 = -1;
        if (n7 == n4) {
            return n3;
        }
        n4 = View.MeasureSpec.getMode((int)n3);
        n3 = View.MeasureSpec.getSize((int)n3);
        n8 = 0x40000000;
        if (n4 != n8) {
            if (n3 != 0) {
                n7 = Math.min(n3, n7);
            }
            return View.MeasureSpec.makeMeasureSpec((int)n7, (int)(-1 << -1));
        }
        return View.MeasureSpec.makeMeasureSpec((int)Math.min(n3, n7), (int)n8);
    }

    private ValueAnimator.AnimatorUpdateListener getCoplanarFinishAnimatorUpdateListener() {
        View view = this.getCoplanarSiblingView();
        int n3 = 0;
        if (view == null) {
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        if (marginLayoutParams == null) {
            return null;
        }
        n3 = this.sheetDelegate.getCoplanarSiblingAdjacentMargin(marginLayoutParams);
        u43 u432 = new u43(this, marginLayoutParams, n3, view);
        return u432;
    }

    private int getGravityFromSheetEdge() {
        int n3;
        SheetDelegate sheetDelegate = this.sheetDelegate;
        int n4 = 5;
        if (sheetDelegate != null && (n3 = sheetDelegate.getSheetEdge()) != 0) {
            n4 = 3;
        }
        return n4;
    }

    private CoordinatorLayout$e getViewLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        boolean bl2;
        WeakReference weakReference = this.viewRef;
        if (weakReference != null && (weakReference = (View)weakReference.get()) != null && (bl2 = (layoutParams = weakReference.getLayoutParams()) instanceof CoordinatorLayout$e)) {
            return (CoordinatorLayout$e)weakReference.getLayoutParams();
        }
        return null;
    }

    private boolean hasLeftMargin() {
        boolean bl2;
        CoordinatorLayout$e coordinatorLayout$e = this.getViewLayoutParams();
        if (coordinatorLayout$e != null && (bl2 = coordinatorLayout$e.leftMargin) > false) {
            bl2 = true;
        } else {
            bl2 = false;
            coordinatorLayout$e = null;
        }
        return bl2;
    }

    private boolean hasRightMargin() {
        boolean bl2;
        CoordinatorLayout$e coordinatorLayout$e = this.getViewLayoutParams();
        if (coordinatorLayout$e != null && (bl2 = coordinatorLayout$e.rightMargin) > false) {
            bl2 = true;
        } else {
            bl2 = false;
            coordinatorLayout$e = null;
        }
        return bl2;
    }

    private boolean isDraggedFarEnough(MotionEvent motionEvent) {
        int n3 = this.shouldHandleDraggingWithHelper();
        boolean bl2 = false;
        if (n3 == 0) {
            return false;
        }
        float f5 = this.initialX;
        float f6 = motionEvent.getX();
        f6 = this.calculateDragDistance(f5, f6);
        ViewDragHelper viewDragHelper = this.viewDragHelper;
        n3 = viewDragHelper.b;
        f5 = n3;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object > 0) {
            bl2 = true;
        }
        return bl2;
    }

    private boolean isExpandingOutwards(float f5) {
        return this.sheetDelegate.isExpandingOutwards(f5);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean isLayingOut(View view) {
        ViewParent viewParent = view.getParent();
        if (viewParent == null) return false;
        boolean bl2 = viewParent.isLayoutRequested();
        if (!bl2) return false;
        WeakHashMap weakHashMap = ViewCompat.a;
        boolean bl3 = view.isAttachedToWindow();
        if (!bl3) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean isSettling(View view, int n3, boolean bl2) {
        int n4;
        n3 = this.getOuterEdgeOffsetForState(n3);
        ViewDragHelper viewDragHelper = this.getViewDragHelper();
        if (viewDragHelper == null) return 0 != 0;
        if (bl2) {
            n4 = view.getTop();
            if ((n4 = (int)(viewDragHelper.s(n3, n4) ? 1 : 0)) == 0) return 0 != 0;
            return 1 != 0;
        } else {
            int n7 = view.getTop();
            n4 = (int)(viewDragHelper.u(view, n3, n7) ? 1 : 0);
            if (n4 == 0) return 0 != 0;
        }
        return 1 != 0;
    }

    private /* synthetic */ boolean lambda$createAccessibilityViewCommandForState$2(int n3, View view, E2$a e2$a) {
        this.setState(n3);
        return true;
    }

    private /* synthetic */ void lambda$getCoplanarFinishAnimatorUpdateListener$1(ViewGroup.MarginLayoutParams marginLayoutParams, int n3, View view, ValueAnimator valueAnimator) {
        SheetDelegate sheetDelegate = this.sheetDelegate;
        float f5 = valueAnimator.getAnimatedFraction();
        n3 = AnimationUtils.lerp(n3, 0, f5);
        sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, n3);
        view.requestLayout();
    }

    private /* synthetic */ void lambda$setState$0(int n3) {
        View view = (View)this.viewRef.get();
        if (view != null) {
            this.startSettling(view, n3, false);
        }
    }

    private void maybeAssignCoplanarSiblingViewBasedId(CoordinatorLayout coordinatorLayout) {
        int n3;
        int n4;
        WeakReference<CoordinatorLayout> weakReference = this.coplanarSiblingViewRef;
        if (weakReference == null && (n4 = this.coplanarSiblingViewId) != (n3 = -1) && (coordinatorLayout = coordinatorLayout.findViewById(n4)) != null) {
            this.coplanarSiblingViewRef = weakReference = new WeakReference<CoordinatorLayout>(coordinatorLayout);
        }
    }

    private void replaceAccessibilityActionForState(View view, C2$a c2$a, int n3) {
        E2 e2 = this.createAccessibilityViewCommandForState(n3);
        ViewCompat.q(view, c2$a, null, e2);
    }

    private void resetVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            velocityTracker = null;
            this.velocityTracker = null;
        }
    }

    private void runAfterLayout(View view, Runnable runnable2) {
        boolean bl2 = this.isLayingOut(view);
        if (bl2) {
            view.post(runnable2);
        } else {
            runnable2.run();
        }
    }

    private void setSheetEdge(int n3) {
        int n4;
        Object object = this.sheetDelegate;
        if (object != null && (n4 = ((SheetDelegate)object).getSheetEdge()) == n3) {
            return;
        }
        n4 = 0;
        object = null;
        if (n3 == 0) {
            Object object2 = new RightSheetDelegate(this);
            this.sheetDelegate = object2;
            object2 = this.shapeAppearanceModel;
            if (object2 != null && (n3 = (int)(this.hasRightMargin() ? 1 : 0)) == 0) {
                object2 = this.shapeAppearanceModel.toBuilder();
                ShapeAppearanceModel$Builder shapeAppearanceModel$Builder = ((ShapeAppearanceModel$Builder)object2).setTopRightCornerSize(0.0f);
                shapeAppearanceModel$Builder.setBottomRightCornerSize(0.0f);
                object2 = ((ShapeAppearanceModel$Builder)object2).build();
                this.updateMaterialShapeDrawable((ShapeAppearanceModel)object2);
            }
            return;
        }
        int n7 = 1;
        if (n3 == n7) {
            Object object3 = new LeftSheetDelegate(this);
            this.sheetDelegate = object3;
            object3 = this.shapeAppearanceModel;
            if (object3 != null && (n3 = (int)(this.hasLeftMargin() ? 1 : 0)) == 0) {
                object3 = this.shapeAppearanceModel.toBuilder();
                ShapeAppearanceModel$Builder shapeAppearanceModel$Builder = ((ShapeAppearanceModel$Builder)object3).setTopLeftCornerSize(0.0f);
                shapeAppearanceModel$Builder.setBottomLeftCornerSize(0.0f);
                object3 = ((ShapeAppearanceModel$Builder)object3).build();
                this.updateMaterialShapeDrawable((ShapeAppearanceModel)object3);
            }
            return;
        }
        String string2 = Gj0.b(n3, "Invalid sheet edge position value: ", ". Must be 0 or 1.");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    private void setSheetEdge(View object, int n3) {
        object = (CoordinatorLayout$e)object.getLayoutParams();
        int n4 = Gravity.getAbsoluteGravity((int)object.c, (int)n3);
        if (n4 == (n3 = 3)) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        this.setSheetEdge(n4);
    }

    private boolean shouldHandleDraggingWithHelper() {
        int n3;
        block3: {
            block2: {
                ViewDragHelper viewDragHelper = this.viewDragHelper;
                if (viewDragHelper == null) break block2;
                int n4 = this.draggable;
                n3 = 1;
                if (n4 != 0 || (n4 = this.state) == n3) break block3;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    private boolean shouldInterceptTouchEvent(View object) {
        boolean bl2;
        boolean bl3 = object.isShown();
        if ((bl3 || (object = ViewCompat.e(object)) != null) && (bl2 = this.draggable)) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private void startSettling(View object, int n3, boolean bl2) {
        int n4 = this.isSettling((View)object, n3, bl2);
        if (n4 != 0) {
            n4 = 2;
            this.setStateInternal(n4);
            object = this.stateSettlingTracker;
            ((SideSheetBehavior$StateSettlingTracker)object).continueSettlingToState(n3);
        } else {
            this.setStateInternal(n3);
        }
    }

    private void updateAccessibilityActions() {
        WeakReference weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        if ((weakReference = (View)weakReference.get()) == null) {
            return;
        }
        ViewCompat.p(262144, (View)weakReference);
        C2$a c2$a = null;
        ViewCompat.k(0, (View)weakReference);
        ViewCompat.p(0x100000, (View)weakReference);
        ViewCompat.k(0, (View)weakReference);
        int n3 = this.state;
        int n4 = 5;
        if (n3 != n4) {
            c2$a = C2$a.n;
            this.replaceAccessibilityActionForState((View)weakReference, c2$a, n4);
        }
        if ((n3 = this.state) != (n4 = 3)) {
            c2$a = C2$a.l;
            this.replaceAccessibilityActionForState((View)weakReference, c2$a, n4);
        }
    }

    private void updateCoplanarSiblingBackProgress() {
        WeakReference weakReference = this.viewRef;
        if (weakReference != null && (weakReference = weakReference.get()) != null) {
            weakReference = (View)this.viewRef.get();
            View view = this.getCoplanarSiblingView();
            if (view == null) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
            if (marginLayoutParams == null) {
                return;
            }
            float f5 = this.childWidth;
            float f6 = weakReference.getScaleX() * f5;
            int n3 = this.innerMargin;
            f5 = n3;
            int n4 = (int)(f6 += f5);
            SheetDelegate sheetDelegate = this.sheetDelegate;
            sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, n4);
            view.requestLayout();
        }
    }

    private void updateMaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    private void updateSheetVisibility(View view) {
        int n3 = this.state;
        int n4 = 5;
        n3 = n3 == n4 ? 4 : 0;
        n4 = view.getVisibility();
        if (n4 != n3) {
            view.setVisibility(n3);
        }
    }

    public void addCallback(SideSheetCallback sideSheetCallback) {
        this.callbacks.add(sideSheetCallback);
    }

    public void cancelBackProgress() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.cancelBackProgress();
    }

    public void expand() {
        this.setState(3);
    }

    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    public int getChildWidth() {
        return this.childWidth;
    }

    public View getCoplanarSiblingView() {
        WeakReference weakReference = this.coplanarSiblingViewRef;
        weakReference = weakReference != null ? (View)weakReference.get() : null;
        return weakReference;
    }

    public int getExpandedOffset() {
        return this.sheetDelegate.getExpandedOffset();
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    public float getHideThreshold() {
        return 0.5f;
    }

    public int getInnerMargin() {
        return this.innerMargin;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    public int getOuterEdgeOffsetForState(int n3) {
        int n4 = 3;
        if (n3 != n4) {
            n4 = 5;
            if (n3 == n4) {
                return this.sheetDelegate.getHiddenOffset();
            }
            String string2 = hj0_0.a(n3, "Invalid state to get outer edge offset: ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        return this.getExpandedOffset();
    }

    public int getParentInnerEdge() {
        return this.parentInnerEdge;
    }

    public int getParentWidth() {
        return this.parentWidth;
    }

    public int getSignificantVelocityThreshold() {
        return 500;
    }

    public int getState() {
        return this.state;
    }

    public ViewDragHelper getViewDragHelper() {
        return this.viewDragHelper;
    }

    public float getXVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        float f5 = this.maximumVelocity;
        velocityTracker.computeCurrentVelocity(1000, f5);
        return this.velocityTracker.getXVelocity();
    }

    public void handleBackInvoked() {
        int n3;
        int n4;
        Object object = this.sideContainerBackHelper;
        if (object == null) {
            return;
        }
        if ((object = ((MaterialBackAnimationHelper)object).onHandleBackInvoked()) != null && (n4 = Build.VERSION.SDK_INT) >= (n3 = 34)) {
            MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
            n3 = this.getGravityFromSheetEdge();
            SideSheetBehavior$2 sideSheetBehavior$2 = new SideSheetBehavior$2(this);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.getCoplanarFinishAnimatorUpdateListener();
            materialSideContainerBackHelper.finishBackProgress((uu_0)object, n3, (Animator.AnimatorListener)sideSheetBehavior$2, animatorUpdateListener);
            return;
        }
        this.setState(5);
    }

    public void hide() {
        this.setState(5);
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public void onAttachedToLayoutParams(CoordinatorLayout$e coordinatorLayout$e) {
        super.onAttachedToLayoutParams(coordinatorLayout$e);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout object, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int n3 = this.shouldInterceptTouchEvent(view);
        int n4 = 1;
        if (n3 == 0) {
            this.ignoreEvents = n4;
            return false;
        }
        n3 = motionEvent.getActionMasked();
        if (n3 == 0) {
            this.resetVelocity();
        }
        if ((velocityTracker = this.velocityTracker) == null) {
            this.velocityTracker = velocityTracker = VelocityTracker.obtain();
        }
        velocityTracker = this.velocityTracker;
        velocityTracker.addMovement(motionEvent);
        if (n3 != 0) {
            int n7;
            if ((n3 == n4 || n3 == (n7 = 3)) && (n3 = (int)(this.ignoreEvents ? 1 : 0)) != 0) {
                this.ignoreEvents = false;
                return false;
            }
        } else {
            float f5 = motionEvent.getX();
            this.initialX = n3 = (int)f5;
        }
        if ((n3 = (int)(this.ignoreEvents ? 1 : 0)) != 0 || (object = this.viewDragHelper) == null || (n3 = (int)(((ViewDragHelper)object).t(motionEvent) ? 1 : 0)) == 0) {
            n4 = 0;
            view = null;
        }
        return n4 != 0;
    }

    public boolean onLayoutChild(CoordinatorLayout object, View view, int n3) {
        Object object2;
        Object object3 = ViewCompat.a;
        int n4 = object.getFitsSystemWindows();
        boolean bl2 = true;
        if (n4 != 0 && (n4 = view.getFitsSystemWindows()) == 0) {
            view.setFitsSystemWindows(bl2);
        }
        if ((object3 = this.viewRef) == null) {
            object3 = new WeakReference(view);
            this.viewRef = object3;
            this.sideContainerBackHelper = object3 = new MaterialSideContainerBackHelper(view);
            object3 = this.materialShapeDrawable;
            if (object3 != null) {
                view.setBackground((Drawable)object3);
                object3 = this.materialShapeDrawable;
                float f5 = this.elevation;
                float f6 = -1.0f;
                float f7 = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
                if (f7 == false) {
                    f5 = ViewCompat$c.e(view);
                }
                ((MaterialShapeDrawable)object3).setElevation(f5);
            } else {
                object3 = this.backgroundTint;
                if (object3 != null) {
                    ViewCompat.u(view, (ColorStateList)object3);
                }
            }
            this.updateSheetVisibility(view);
            this.updateAccessibilityActions();
            n4 = view.getImportantForAccessibility();
            if (n4 == 0) {
                view.setImportantForAccessibility((int)(bl2 ? 1 : 0));
            }
            this.ensureAccessibilityPaneTitleIsSet(view);
        }
        this.setSheetEdge(view, n3);
        object3 = this.viewDragHelper;
        if (object3 == null) {
            object3 = this.dragCallback;
            Context context = object.getContext();
            object2 = new ViewDragHelper(context, (ViewGroup)object, (ViewDragHelper$b)object3);
            this.viewDragHelper = object2;
        }
        object3 = this.sheetDelegate;
        n4 = ((SheetDelegate)object3).getOuterEdge(view);
        ((CoordinatorLayout)object).onLayoutChild(view, n3);
        this.parentWidth = n3 = object.getWidth();
        this.parentInnerEdge = n3 = this.sheetDelegate.getParentInnerEdge((CoordinatorLayout)object);
        this.childWidth = n3 = view.getWidth();
        Object object4 = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        if (object4 != null) {
            object2 = this.sheetDelegate;
            n3 = ((SheetDelegate)object2).calculateInnerMargin((ViewGroup.MarginLayoutParams)object4);
        } else {
            n3 = 0;
            object4 = null;
        }
        this.innerMargin = n3;
        n3 = this.calculateCurrentOffset(n4, view);
        ViewCompat.l(n3, view);
        this.maybeAssignCoplanarSiblingViewBasedId((CoordinatorLayout)object);
        object = this.callbacks.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object4 = (SheetCallback)object.next();
            n4 = object4 instanceof SideSheetCallback;
            if (n4 == 0) continue;
            object4 = (SideSheetCallback)object4;
            ((SideSheetCallback)object4).onLayout(view);
        }
        return bl2;
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int n3, int n4, int n7, int n8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n10 = coordinatorLayout.getPaddingLeft();
        int n14 = coordinatorLayout.getPaddingRight() + n10;
        n10 = marginLayoutParams.leftMargin;
        n14 += n10;
        n10 = marginLayoutParams.rightMargin;
        n14 = n14 + n10 + n4;
        n4 = marginLayoutParams.width;
        n10 = -1;
        n3 = this.getChildMeasureSpec(n3, n14, n10, n4);
        n4 = coordinatorLayout.getPaddingTop();
        int n15 = coordinatorLayout.getPaddingBottom() + n4;
        n4 = marginLayoutParams.topMargin;
        n15 += n4;
        n4 = marginLayoutParams.bottomMargin;
        n15 = n15 + n4 + n8;
        n4 = marginLayoutParams.height;
        n15 = this.getChildMeasureSpec(n7, n15, n10, n4);
        view.measure(n3, n15);
        return true;
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        int n3;
        int n4;
        Parcelable parcelable2 = (parcelable = (SideSheetBehavior$SavedState)parcelable).getSuperState();
        if (parcelable2 != null) {
            parcelable2 = parcelable.getSuperState();
            super.onRestoreInstanceState(coordinatorLayout, view, parcelable2);
        }
        if ((n4 = parcelable.state) == (n3 = 1) || n4 == (n3 = 2)) {
            n4 = 5;
        }
        this.state = n4;
        this.lastStableState = n4;
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        coordinatorLayout = super.onSaveInstanceState(coordinatorLayout, view);
        SideSheetBehavior$SavedState sideSheetBehavior$SavedState = new SideSheetBehavior$SavedState((Parcelable)coordinatorLayout, this);
        return sideSheetBehavior$SavedState;
    }

    public boolean onTouchEvent(CoordinatorLayout object, View view, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        int n3 = view.isShown();
        if (n3 == 0) {
            return false;
        }
        n3 = motionEvent.getActionMasked();
        int n4 = this.state;
        int n7 = 1;
        if (n4 == n7 && n3 == 0) {
            return n7 != 0;
        }
        n4 = (int)(this.shouldHandleDraggingWithHelper() ? 1 : 0);
        if (n4 != 0) {
            viewDragHelper = this.viewDragHelper;
            viewDragHelper.m(motionEvent);
        }
        if (n3 == 0) {
            this.resetVelocity();
        }
        if ((viewDragHelper = this.velocityTracker) == null) {
            viewDragHelper = VelocityTracker.obtain();
            this.velocityTracker = viewDragHelper;
        }
        viewDragHelper = this.velocityTracker;
        viewDragHelper.addMovement(motionEvent);
        n4 = this.shouldHandleDraggingWithHelper();
        if (n4 != 0 && n3 == (n4 = 2) && (n3 = (int)(this.ignoreEvents ? 1 : 0)) == 0 && (n3 = (int)(this.isDraggedFarEnough(motionEvent) ? 1 : 0)) != 0) {
            object = this.viewDragHelper;
            n4 = motionEvent.getActionIndex();
            int n8 = motionEvent.getPointerId(n4);
            ((ViewDragHelper)object).c(n8, view);
        }
        return (this.ignoreEvents ^ n7) != 0;
    }

    public void removeCallback(SideSheetCallback sideSheetCallback) {
        this.callbacks.remove(sideSheetCallback);
    }

    public void setCoplanarSiblingView(View object) {
        int n3;
        this.coplanarSiblingViewId = n3 = -1;
        if (object == null) {
            this.clearCoplanarSiblingView();
        } else {
            Object object2 = new WeakReference(object);
            this.coplanarSiblingViewRef = object2;
            object = this.viewRef;
            if (object != null) {
                object = (View)((Reference)object).get();
                object2 = ViewCompat.a;
                n3 = (int)(object.isLaidOut() ? 1 : 0);
                if (n3 != 0) {
                    object.requestLayout();
                }
            }
        }
    }

    public void setCoplanarSiblingViewId(int n3) {
        this.coplanarSiblingViewId = n3;
        this.clearCoplanarSiblingView();
        WeakReference weakReference = this.viewRef;
        if (weakReference != null) {
            weakReference = (View)weakReference.get();
            int n4 = -1;
            if (n3 != n4) {
                n3 = (int)(weakReference.isLaidOut() ? 1 : 0);
                if (n3 != 0) {
                    weakReference.requestLayout();
                }
            }
        }
    }

    public void setDraggable(boolean bl2) {
        this.draggable = bl2;
    }

    public void setHideFriction(float f5) {
        this.hideFriction = f5;
    }

    public void setState(int n3) {
        int n4;
        int n7 = 1;
        if (n3 != n7 && n3 != (n4 = 2)) {
            WeakReference weakReference = this.viewRef;
            if (weakReference != null && (weakReference = weakReference.get()) != null) {
                weakReference = (View)this.viewRef.get();
                s43 s432 = new s43(this, n3);
                this.runAfterLayout((View)weakReference, s432);
            } else {
                this.setStateInternal(n3);
            }
            return;
        }
        String string2 = "STATE_";
        StringBuilder stringBuilder = new StringBuilder(string2);
        String string3 = n3 == n7 ? "DRAGGING" : "SETTLING";
        string3 = h30_0.a(stringBuilder, string3, " should not be set externally.");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public void setStateInternal(int n3) {
        boolean bl2;
        WeakReference weakReference;
        int n4 = this.state;
        if (n4 == n3) {
            return;
        }
        this.state = n3;
        n4 = 3;
        if (n3 == n4 || n3 == (n4 = 5)) {
            this.lastStableState = n3;
        }
        if ((weakReference = this.viewRef) == null) {
            return;
        }
        if ((weakReference = (View)weakReference.get()) == null) {
            return;
        }
        this.updateSheetVisibility((View)weakReference);
        Iterator iterator = this.callbacks.iterator();
        while (bl2 = iterator.hasNext()) {
            SheetCallback sheetCallback = (SheetCallback)iterator.next();
            sheetCallback.onStateChanged((View)weakReference, n3);
        }
        this.updateAccessibilityActions();
    }

    public boolean shouldHide(View view, float f5) {
        return this.sheetDelegate.shouldHide(view, f5);
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    public void startBackProgress(uu_0 uu_02) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.startBackProgress(uu_02);
    }

    public void updateBackProgress(uu_0 uu_02) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        int n3 = this.getGravityFromSheetEdge();
        materialSideContainerBackHelper.updateBackProgress(uu_02, n3);
        this.updateCoplanarSiblingBackProgress();
    }
}

