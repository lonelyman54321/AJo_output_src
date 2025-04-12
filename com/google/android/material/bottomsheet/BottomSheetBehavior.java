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
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.util.SparseIntArray
 *  android.util.TypedValue
 *  android.view.MotionEvent
 *  android.view.RoundedCorner
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 *  android.view.WindowInsets
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 */
package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.core.view.WindowInsetsAnimationCompat$b;
import androidx.core.view.a;
import androidx.core.view.a$a;
import androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper$b;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.bottomsheet.BottomSheetBehavior$1;
import com.google.android.material.bottomsheet.BottomSheetBehavior$2;
import com.google.android.material.bottomsheet.BottomSheetBehavior$3;
import com.google.android.material.bottomsheet.BottomSheetBehavior$4;
import com.google.android.material.bottomsheet.BottomSheetBehavior$6;
import com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback;
import com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior$StateSettlingTracker;
import com.google.android.material.bottomsheet.InsetsAnimationCallback;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackAnimationHelper;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class BottomSheetBehavior
extends CoordinatorLayout$Behavior
implements MaterialBackHandler {
    private static final int CORNER_ANIMATION_DURATION = 500;
    static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    private static final int DEF_STYLE_RES = 0;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int INVALID_POSITION = 255;
    private static final int NO_MAX_SIZE = 255;
    public static final int PEEK_HEIGHT_AUTO = 255;
    public static final int SAVE_ALL = 255;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    static final int VIEW_INDEX_ACCESSIBILITY_DELEGATE_VIEW = 1;
    private static final int VIEW_INDEX_BOTTOM_SHEET;
    WeakReference accessibilityDelegateViewRef;
    int activePointerId;
    private ColorStateList backgroundTint;
    MaterialBottomContainerBackHelper bottomContainerBackHelper;
    private final ArrayList callbacks;
    private int childHeight;
    int collapsedOffset;
    private final ViewDragHelper$b dragCallback;
    private boolean draggable;
    float elevation;
    final SparseIntArray expandHalfwayActionIds;
    private boolean expandedCornersRemoved;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    private float hideFriction;
    boolean hideable;
    private boolean ignoreEvents;
    private Map importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;
    private ValueAnimator interpolatorAnimator;
    private int lastNestedScrollDy;
    int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private MaterialShapeDrawable materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;
    WeakReference nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags = 0;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shouldRemoveExpandedCorners;
    private int significantVelocityThreshold;
    private boolean skipCollapsed;
    int state;
    private final BottomSheetBehavior$StateSettlingTracker stateSettlingTracker;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    private VelocityTracker velocityTracker;
    ViewDragHelper viewDragHelper;
    WeakReference viewRef;

    static {
        DEF_STYLE_RES = R$style.Widget_Design_BottomSheet_Modal;
    }

    public BottomSheetBehavior() {
        Object object;
        ArrayList arrayList;
        BottomSheetBehavior$StateSettlingTracker bottomSheetBehavior$StateSettlingTracker;
        int n3;
        int n4;
        this.fitToContents = n4 = 1;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = n3 = -1;
        this.maxHeight = n3;
        this.stateSettlingTracker = bottomSheetBehavior$StateSettlingTracker = new BottomSheetBehavior$StateSettlingTracker(this, null);
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = n4;
        this.state = n4 = 4;
        this.lastStableState = n4;
        this.hideFriction = 0.1f;
        this.callbacks = arrayList = new ArrayList();
        this.initialY = n3;
        this.expandHalfwayActionIds = object = new SparseIntArray();
        super(this);
        this.dragCallback = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public BottomSheetBehavior(Context var1_1, AttributeSet var2_2) {
        super(var1_1, var2_2 /* !! */ );
        this.fitToContents = var3_3 = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = var4_4 = -1;
        this.maxHeight = var4_4;
        this.stateSettlingTracker = var5_5 = new BottomSheetBehavior$StateSettlingTracker(this, null);
        var6_6 = 0x3F000000;
        this.halfExpandedRatio = var7_7 = 0.5f;
        this.elevation = var8_8 = -1.0f;
        this.draggable = var3_3;
        this.state = var9_9 = 4;
        this.lastStableState = var9_9;
        this.hideFriction = var10_10 = 0.1f;
        this.callbacks = var11_11 /* !! */  = new ArrayList();
        this.initialY = var4_4;
        this.expandHalfwayActionIds = var11_11 /* !! */  = new SparseIntArray();
        super(this);
        this.dragCallback = var11_11 /* !! */ ;
        var11_11 /* !! */  = var1_1.getResources();
        var12_12 = R$dimen.mtrl_min_touch_target_size;
        this.peekHeightGestureInsetBuffer = var9_9 = var11_11 /* !! */ .getDimensionPixelSize(var12_12);
        var11_11 /* !! */  = (SparseIntArray)R$styleable.BottomSheetBehavior_Layout;
        var11_11 /* !! */  = var1_1.obtainStyledAttributes(var2_2 /* !! */ , (int[])var11_11 /* !! */ );
        var12_12 = R$styleable.BottomSheetBehavior_Layout_backgroundTint;
        var12_12 = (int)var11_11 /* !! */ .hasValue(var12_12);
        if (var12_12 != 0) {
            var12_12 = R$styleable.BottomSheetBehavior_Layout_backgroundTint;
            this.backgroundTint = var13_13 = MaterialResources.getColorStateList(var1_1, (TypedArray)var11_11 /* !! */ , var12_12);
        }
        var12_12 = R$styleable.BottomSheetBehavior_Layout_shapeAppearance;
        if ((var12_12 = (int)var11_11 /* !! */ .hasValue(var12_12)) != 0) {
            var12_12 = R$attr.bottomSheetStyle;
            var14_14 = BottomSheetBehavior.DEF_STYLE_RES;
            var2_2 /* !! */  = ShapeAppearanceModel.builder(var1_1, var2_2 /* !! */ , var12_12, var14_14).build();
            this.shapeAppearanceModelDefault = var2_2 /* !! */ ;
        }
        this.createMaterialShapeDrawableIfNeeded(var1_1);
        this.createShapeValueAnimator();
        var15_15 = R$styleable.BottomSheetBehavior_Layout_android_elevation;
        this.elevation = var16_16 = var11_11 /* !! */ .getDimension(var15_15, var8_8);
        var15_15 = R$styleable.BottomSheetBehavior_Layout_android_maxWidth;
        var15_15 = (int)var11_11 /* !! */ .hasValue(var15_15);
        if (var15_15 != 0) {
            var15_15 = R$styleable.BottomSheetBehavior_Layout_android_maxWidth;
            var15_15 = var11_11 /* !! */ .getDimensionPixelSize(var15_15, var4_4);
            this.setMaxWidth(var15_15);
        }
        var15_15 = R$styleable.BottomSheetBehavior_Layout_android_maxHeight;
        if ((var15_15 = (int)var11_11 /* !! */ .hasValue(var15_15)) != 0) {
            var15_15 = R$styleable.BottomSheetBehavior_Layout_android_maxHeight;
            var15_15 = var11_11 /* !! */ .getDimensionPixelSize(var15_15, var4_4);
            this.setMaxHeight(var15_15);
        }
        if ((var2_2 /* !! */  = var11_11 /* !! */ .peekValue(var15_15 = R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight)) != null && (var15_15 = var2_2 /* !! */ .data) == var4_4) {
            this.setPeekHeight(var15_15);
        } else {
            var15_15 = R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
            var15_15 = var11_11 /* !! */ .getDimensionPixelSize(var15_15, var4_4);
            this.setPeekHeight(var15_15);
        }
        var15_15 = R$styleable.BottomSheetBehavior_Layout_behavior_hideable;
        var15_15 = (int)var11_11 /* !! */ .getBoolean(var15_15, false);
        this.setHideable((boolean)var15_15);
        var15_15 = R$styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored;
        var15_15 = (int)var11_11 /* !! */ .getBoolean(var15_15, false);
        this.setGestureInsetBottomIgnored((boolean)var15_15);
        var15_15 = R$styleable.BottomSheetBehavior_Layout_behavior_fitToContents;
        var15_15 = (int)var11_11 /* !! */ .getBoolean(var15_15, var3_3);
        this.setFitToContents((boolean)var15_15);
        var15_15 = R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed;
        var15_15 = (int)var11_11 /* !! */ .getBoolean(var15_15, false);
        this.setSkipCollapsed((boolean)var15_15);
        var15_15 = R$styleable.BottomSheetBehavior_Layout_behavior_draggable;
        var15_15 = (int)var11_11 /* !! */ .getBoolean(var15_15, var3_3);
        this.setDraggable((boolean)var15_15);
        var15_15 = R$styleable.BottomSheetBehavior_Layout_behavior_saveFlags;
        var15_15 = var11_11 /* !! */ .getInt(var15_15, 0);
        this.setSaveFlags(var15_15);
        var15_15 = R$styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio;
        var16_16 = var11_11 /* !! */ .getFloat(var15_15, var7_7);
        this.setHalfExpandedRatio(var16_16);
        var15_15 = R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        var2_2 /* !! */  = var11_11 /* !! */ .peekValue(var15_15);
        if (var2_2 /* !! */  == null) ** GOTO lbl-1000
        var4_4 = var2_2 /* !! */ .type;
        var6_6 = 16;
        var7_7 = 2.2E-44f;
        if (var4_4 == var6_6) {
            var15_15 = var2_2 /* !! */ .data;
            this.setExpandedOffset(var15_15);
        } else lbl-1000:
        // 2 sources

        {
            var15_15 = R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
            var15_15 = var11_11 /* !! */ .getDimensionPixelOffset(var15_15, 0);
            this.setExpandedOffset(var15_15);
        }
        var15_15 = R$styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold;
        var15_15 = var11_11 /* !! */ .getInt(var15_15, 500);
        this.setSignificantVelocityThreshold(var15_15);
        var15_15 = R$styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets;
        var15_15 = (int)var11_11 /* !! */ .getBoolean(var15_15, false);
        this.paddingBottomSystemWindowInsets = var15_15;
        var15_15 = R$styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets;
        var15_15 = (int)var11_11 /* !! */ .getBoolean(var15_15, false);
        this.paddingLeftSystemWindowInsets = var15_15;
        var15_15 = R$styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets;
        var15_15 = (int)var11_11 /* !! */ .getBoolean(var15_15, false);
        this.paddingRightSystemWindowInsets = var15_15;
        var15_15 = R$styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets;
        var15_15 = (int)var11_11 /* !! */ .getBoolean(var15_15, var3_3);
        this.paddingTopSystemWindowInsets = var15_15;
        var15_15 = R$styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets;
        var15_15 = (int)var11_11 /* !! */ .getBoolean(var15_15, false);
        this.marginLeftSystemWindowInsets = var15_15;
        var15_15 = R$styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets;
        var15_15 = (int)var11_11 /* !! */ .getBoolean(var15_15, false);
        this.marginRightSystemWindowInsets = var15_15;
        var15_15 = R$styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets;
        var15_15 = (int)var11_11 /* !! */ .getBoolean(var15_15, false);
        this.marginTopSystemWindowInsets = var15_15;
        var15_15 = R$styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners;
        var15_15 = (int)var11_11 /* !! */ .getBoolean(var15_15, var3_3);
        this.shouldRemoveExpandedCorners = var15_15;
        var11_11 /* !! */ .recycle();
        this.maximumVelocity = var17_17 = (float)ViewConfiguration.get((Context)var1_1).getScaledMaximumFlingVelocity();
    }

    public static /* synthetic */ void access$100(BottomSheetBehavior bottomSheetBehavior, View view, int n3, boolean bl2) {
        bottomSheetBehavior.startSettling(view, n3, bl2);
    }

    public static /* synthetic */ boolean access$1000(BottomSheetBehavior bottomSheetBehavior) {
        return bottomSheetBehavior.marginTopSystemWindowInsets;
    }

    public static /* synthetic */ int access$1102(BottomSheetBehavior bottomSheetBehavior, int n3) {
        bottomSheetBehavior.gestureInsetBottom = n3;
        return n3;
    }

    public static /* synthetic */ void access$1200(BottomSheetBehavior bottomSheetBehavior, boolean bl2) {
        bottomSheetBehavior.updatePeekHeight(bl2);
    }

    public static /* synthetic */ boolean access$1300(BottomSheetBehavior bottomSheetBehavior) {
        return bottomSheetBehavior.draggable;
    }

    public static /* synthetic */ boolean access$1400(BottomSheetBehavior bottomSheetBehavior) {
        return bottomSheetBehavior.fitToContents;
    }

    public static /* synthetic */ int access$1500(BottomSheetBehavior bottomSheetBehavior) {
        return bottomSheetBehavior.significantVelocityThreshold;
    }

    public static /* synthetic */ boolean access$1600(BottomSheetBehavior bottomSheetBehavior) {
        return bottomSheetBehavior.canBeHiddenByDragging();
    }

    public static /* synthetic */ int access$1900(BottomSheetBehavior bottomSheetBehavior) {
        return bottomSheetBehavior.peekHeight;
    }

    public static /* synthetic */ MaterialShapeDrawable access$200(BottomSheetBehavior bottomSheetBehavior) {
        return bottomSheetBehavior.materialShapeDrawable;
    }

    public static /* synthetic */ boolean access$2000(BottomSheetBehavior bottomSheetBehavior) {
        return bottomSheetBehavior.skipCollapsed;
    }

    public static /* synthetic */ int access$302(BottomSheetBehavior bottomSheetBehavior, int n3) {
        bottomSheetBehavior.insetTop = n3;
        return n3;
    }

    public static /* synthetic */ boolean access$400(BottomSheetBehavior bottomSheetBehavior) {
        return bottomSheetBehavior.paddingBottomSystemWindowInsets;
    }

    public static /* synthetic */ int access$500(BottomSheetBehavior bottomSheetBehavior) {
        return bottomSheetBehavior.insetBottom;
    }

    public static /* synthetic */ int access$502(BottomSheetBehavior bottomSheetBehavior, int n3) {
        bottomSheetBehavior.insetBottom = n3;
        return n3;
    }

    public static /* synthetic */ boolean access$600(BottomSheetBehavior bottomSheetBehavior) {
        return bottomSheetBehavior.paddingLeftSystemWindowInsets;
    }

    public static /* synthetic */ boolean access$700(BottomSheetBehavior bottomSheetBehavior) {
        return bottomSheetBehavior.paddingRightSystemWindowInsets;
    }

    public static /* synthetic */ boolean access$800(BottomSheetBehavior bottomSheetBehavior) {
        return bottomSheetBehavior.marginLeftSystemWindowInsets;
    }

    public static /* synthetic */ boolean access$900(BottomSheetBehavior bottomSheetBehavior) {
        return bottomSheetBehavior.marginRightSystemWindowInsets;
    }

    private int addAccessibilityActionForState(View view, int n3, int n4) {
        int n7;
        Object object;
        int n8;
        int n10;
        C2$a c2$a;
        E2 e2;
        String string2;
        block12: {
            string2 = view.getResources().getString(n3);
            e2 = this.createAccessibilityViewCommandForState(n4);
            Object object2 = ViewCompat.f(view);
            n4 = 0;
            int n14 = 0;
            c2$a = null;
            while (true) {
                n10 = object2.size();
                n8 = -1;
                if (n14 >= n10) break;
                object = ((AccessibilityNodeInfo.AccessibilityAction)((C2$a)object2.get((int)n14)).a).getLabel();
                n10 = (int)(TextUtils.equals((CharSequence)string2, (CharSequence)object) ? 1 : 0);
                if (n10 != 0) {
                    object2 = (C2$a)object2.get(n14);
                    n3 = ((C2$a)object2).a();
                    break block12;
                }
                ++n14;
            }
            n14 = -1;
            object = null;
            for (n10 = 0; n10 < (n7 = 32) && n14 == n8; ++n10) {
                int n15;
                int[] nArray = ViewCompat.e;
                n7 = nArray[n10];
                int n16 = 1;
                for (int i3 = 0; i3 < (n15 = object2.size()); ++i3) {
                    C2$a c2$a2 = (C2$a)object2.get(i3);
                    n15 = c2$a2.a();
                    if (n15 != n7) {
                        n15 = 1;
                    } else {
                        n15 = 0;
                        c2$a2 = null;
                    }
                    n16 &= n15;
                }
                if (n16 == 0) continue;
                n14 = n7;
            }
            n3 = n14;
        }
        if (n3 != n8) {
            n8 = 0;
            a a2 = null;
            object = c2$a;
            n7 = n3;
            c2$a = new C2$a(null, n3, string2, e2, null);
            object = ViewCompat.d(view);
            if (object == null) {
                n10 = 0;
                object = null;
            } else {
                n8 = object instanceof a$a;
                if (n8 != 0) {
                    object = ((a$a)((Object)object)).a;
                } else {
                    a2 = new a((View.AccessibilityDelegate)object);
                    object = a2;
                }
            }
            if (object == null) {
                object = new a();
            }
            ViewCompat.s(view, (a)object);
            n10 = c2$a.a();
            ViewCompat.p(n10, view);
            object = ViewCompat.f(view);
            object.add(c2$a);
            ViewCompat.k(0, view);
        }
        return n3;
    }

    private void calculateCollapsedOffset() {
        int n3 = this.calculatePeekHeight();
        int n4 = this.fitToContents;
        if (n4 != 0) {
            n4 = this.parentHeight - n3;
            n3 = this.fitToContentsOffset;
            this.collapsedOffset = n3 = Math.max(n4, n3);
        } else {
            this.collapsedOffset = n4 = this.parentHeight - n3;
        }
    }

    private float calculateCornerInterpolation(float f5, RoundedCorner roundedCorner) {
        float f6;
        int n3;
        float f7;
        float f8;
        float f11;
        if (roundedCorner != null && (f11 = (f8 = (f7 = (float)(n3 = Yz.a(roundedCorner))) - 0.0f) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) > 0 && (f11 = (f6 = f5 - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) > 0) {
            return f7 / f5;
        }
        return 0.0f;
    }

    private void calculateHalfExpandedOffset() {
        int n3;
        float f5 = this.parentHeight;
        float f6 = this.halfExpandedRatio;
        this.halfExpandedOffset = n3 = (int)((1.0f - f6) * f5);
    }

    private float calculateInterpolationWithCornersRemoved() {
        Object object = this.materialShapeDrawable;
        if (object != null && (object = this.viewRef) != null && (object = ((Reference)object).get()) != null) {
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 31;
            float f5 = 4.3E-44f;
            if (n3 >= n4) {
                object = (View)this.viewRef.get();
                n4 = (int)(this.isAtTopOfScreen() ? 1 : 0);
                if (n4 != 0 && (object = Re1.a((View)object)) != null) {
                    f5 = this.materialShapeDrawable.getTopLeftCornerResolvedSize();
                    RoundedCorner roundedCorner = wz_0.b((WindowInsets)object);
                    f5 = this.calculateCornerInterpolation(f5, roundedCorner);
                    float f6 = this.materialShapeDrawable.getTopRightCornerResolvedSize();
                    object = xz_0.a((WindowInsets)object);
                    float f7 = this.calculateCornerInterpolation(f6, (RoundedCorner)object);
                    return Math.max(f5, f7);
                }
            }
        }
        return 0.0f;
    }

    private int calculatePeekHeight() {
        int n3 = this.peekHeightAuto;
        if (n3 != 0) {
            n3 = this.peekHeightMin;
            int n4 = this.parentHeight;
            int n7 = this.parentWidth * 9 / 16;
            n3 = Math.max(n3, n4 -= n7);
            n4 = this.childHeight;
            n3 = Math.min(n3, n4);
            n4 = this.insetBottom;
            return n3 + n4;
        }
        n3 = (int)(this.gestureInsetBottomIgnored ? 1 : 0);
        if (n3 == 0 && (n3 = (int)(this.paddingBottomSystemWindowInsets ? 1 : 0)) == 0 && (n3 = this.gestureInsetBottom) > 0) {
            int n8 = this.peekHeight;
            int n10 = this.peekHeightGestureInsetBuffer;
            return Math.max(n8, n3 += n10);
        }
        n3 = this.peekHeight;
        int n14 = this.insetBottom;
        return n3 + n14;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float calculateSlideOffsetWithTop(int n3) {
        float f5;
        float f6;
        int n4;
        int n7 = this.collapsedOffset;
        if (n3 <= n7 && n7 != (n4 = this.getExpandedOffset())) {
            n7 = this.collapsedOffset;
            n3 = n7 - n3;
            f6 = n3;
            n4 = this.getExpandedOffset();
            f5 = n7 -= n4;
            return f6 /= f5;
        } else {
            n7 = this.collapsedOffset;
            n3 = n7 - n3;
            f6 = n3;
            n4 = this.parentHeight - n7;
            f5 = n4;
            return f6 /= f5;
        }
    }

    private boolean canBeHiddenByDragging() {
        boolean bl2 = this.isHideable();
        bl2 = bl2 && (bl2 = this.isHideableWhenDragging());
        return bl2;
    }

    private void clearAccessibilityAction(View view, int n3) {
        if (view == null) {
            return;
        }
        ViewCompat.p(524288, view);
        ViewCompat.k(0, view);
        ViewCompat.p(262144, view);
        ViewCompat.k(0, view);
        ViewCompat.p(0x100000, view);
        ViewCompat.k(0, view);
        SparseIntArray sparseIntArray = this.expandHalfwayActionIds;
        int n4 = -1;
        int n7 = sparseIntArray.get(n3, n4);
        if (n7 != n4) {
            ViewCompat.p(n7, view);
            ViewCompat.k(0, view);
            view = this.expandHalfwayActionIds;
            view.delete(n3);
        }
    }

    private E2 createAccessibilityViewCommandForState(int n3) {
        BottomSheetBehavior$6 bottomSheetBehavior$6 = new BottomSheetBehavior$6(this, n3);
        return bottomSheetBehavior$6;
    }

    private void createMaterialShapeDrawableIfNeeded(Context object) {
        Object object2 = this.shapeAppearanceModelDefault;
        if (object2 == null) {
            return;
        }
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModelDefault;
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

    private void createShapeValueAnimator() {
        ValueAnimator valueAnimator;
        float f5 = this.calculateInterpolationWithCornersRemoved();
        Object object = new float[]{f5, 1.0f};
        this.interpolatorAnimator = valueAnimator = ValueAnimator.ofFloat((float[])object);
        valueAnimator.setDuration(500L);
        valueAnimator = this.interpolatorAnimator;
        object = new BottomSheetBehavior$3;
        object(this);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
    }

    public static BottomSheetBehavior from(View object) {
        boolean bl2 = (object = object.getLayoutParams()) instanceof CoordinatorLayout$e;
        if (bl2) {
            object = ((CoordinatorLayout$e)((Object)object)).a;
            bl2 = object instanceof BottomSheetBehavior;
            if (bl2) {
                return (BottomSheetBehavior)object;
            }
            object = new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
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

    private int getTopOffsetForState(int n3) {
        int n4 = 3;
        if (n3 != n4) {
            n4 = 4;
            if (n3 != n4) {
                n4 = 5;
                if (n3 != n4) {
                    n4 = 6;
                    if (n3 == n4) {
                        return this.halfExpandedOffset;
                    }
                    String string2 = hj0_0.a(n3, "Invalid state to get top offset: ");
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                    throw illegalArgumentException;
                }
                return this.parentHeight;
            }
            return this.collapsedOffset;
        }
        return this.getExpandedOffset();
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        float f5 = this.maximumVelocity;
        velocityTracker.computeCurrentVelocity(1000, f5);
        velocityTracker = this.velocityTracker;
        int n3 = this.activePointerId;
        return velocityTracker.getYVelocity(n3);
    }

    private boolean isAtTopOfScreen() {
        Object object = this.viewRef;
        boolean bl2 = false;
        if (object != null && (object = ((Reference)object).get()) != null) {
            object = new int[2];
            View view = (View)this.viewRef.get();
            view.getLocationOnScreen((int[])object);
            int n3 = 1;
            Object object2 = object[n3];
            if (object2 == false) {
                bl2 = true;
            }
        }
        return bl2;
    }

    private boolean isExpandedAndShouldRemoveCorners() {
        int n3 = this.state;
        int n4 = 3;
        n3 = n3 == n4 && ((n3 = (int)(this.shouldRemoveExpandedCorners ? 1 : 0)) != 0 || (n3 = this.isAtTopOfScreen()) != 0) ? 1 : 0;
        return n3 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean isLayouting(View view) {
        ViewParent viewParent = view.getParent();
        if (viewParent == null) return false;
        boolean bl2 = viewParent.isLayoutRequested();
        if (!bl2) return false;
        WeakHashMap weakHashMap = ViewCompat.a;
        boolean bl3 = view.isAttachedToWindow();
        if (!bl3) return false;
        return true;
    }

    private void replaceAccessibilityActionForState(View view, C2$a c2$a, int n3) {
        E2 e2 = this.createAccessibilityViewCommandForState(n3);
        ViewCompat.q(view, c2$a, null, e2);
    }

    private void reset() {
        int n3;
        this.activePointerId = n3 = -1;
        this.initialY = n3;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            n3 = 0;
            velocityTracker = null;
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(BottomSheetBehavior$SavedState bottomSheetBehavior$SavedState) {
        int n3;
        int n4;
        int n7 = this.saveFlags;
        if (n7 == 0) {
            return;
        }
        int n8 = -1;
        if (n7 == n8 || (n4 = n7 & 1) == (n3 = 1)) {
            this.peekHeight = n4 = bottomSheetBehavior$SavedState.peekHeight;
        }
        if (n7 == n8 || (n4 = n7 & 2) == (n3 = 2)) {
            n4 = (int)(bottomSheetBehavior$SavedState.fitToContents ? 1 : 0);
            this.fitToContents = n4;
        }
        if (n7 == n8 || (n4 = n7 & 4) == (n3 = 4)) {
            n4 = (int)(bottomSheetBehavior$SavedState.hideable ? 1 : 0);
            this.hideable = n4;
        }
        if (n7 == n8 || (n7 &= (n8 = 8)) == n8) {
            boolean bl2;
            this.skipCollapsed = bl2 = bottomSheetBehavior$SavedState.skipCollapsed;
        }
    }

    private void runAfterLayout(View view, Runnable runnable2) {
        boolean bl2 = this.isLayouting(view);
        if (bl2) {
            view.post(runnable2);
        } else {
            runnable2.run();
        }
    }

    private void setWindowInsetsListener(View view) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        n3 = n3 >= n4 && (n3 = (int)(this.isGestureInsetBottomIgnored() ? 1 : 0)) == 0 && (n3 = (int)(this.peekHeightAuto ? 1 : 0)) == 0 ? 1 : 0;
        n4 = (int)(this.paddingBottomSystemWindowInsets ? 1 : 0);
        if (!(n4 || (n4 = (int)(this.paddingLeftSystemWindowInsets ? 1 : 0)) || (n4 = this.paddingRightSystemWindowInsets) || (n4 = this.marginLeftSystemWindowInsets) || (n4 = this.marginRightSystemWindowInsets) || (n4 = this.marginTopSystemWindowInsets) || n3)) {
            return;
        }
        BottomSheetBehavior$4 bottomSheetBehavior$4 = new BottomSheetBehavior$4(this, n3 != 0);
        ViewUtils.doOnApplyWindowInsets(view, bottomSheetBehavior$4);
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

    private void startSettling(View object, int n3, boolean bl2) {
        int n4;
        boolean bl3;
        int n7;
        boolean bl4;
        int n8 = this.getTopOffsetForState(n3);
        ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper != null && (bl2 ? (bl4 = viewDragHelper.s(n7 = object.getLeft(), n8)) : (bl3 = viewDragHelper.u((View)object, n4 = object.getLeft(), n8)))) {
            this.setStateInternal(2);
            boolean bl5 = true;
            this.updateDrawableForTargetState(n3, bl5);
            object = this.stateSettlingTracker;
            ((BottomSheetBehavior$StateSettlingTracker)object).continueSettlingToState(n3);
        } else {
            this.setStateInternal(n3);
        }
    }

    private void updateAccessibilityActions() {
        int n3;
        WeakReference weakReference = this.viewRef;
        if (weakReference != null) {
            weakReference = (View)weakReference.get();
            n3 = 0;
            this.updateAccessibilityActions((View)weakReference, 0);
        }
        if ((weakReference = this.accessibilityDelegateViewRef) != null) {
            weakReference = (View)weakReference.get();
            n3 = 1;
            this.updateAccessibilityActions((View)weakReference, n3);
        }
    }

    private void updateAccessibilityActions(View view, int n3) {
        C2$a c2$a;
        int n4;
        if (view == null) {
            return;
        }
        this.clearAccessibilityAction(view, n3);
        int n7 = this.fitToContents;
        int n8 = 6;
        if (n7 == 0 && (n7 = this.state) != n8) {
            SparseIntArray sparseIntArray = this.expandHalfwayActionIds;
            n4 = R$string.bottomsheet_action_expand_halfway;
            n4 = this.addAccessibilityActionForState(view, n4, n8);
            sparseIntArray.put(n3, n4);
        }
        if ((n3 = (int)(this.hideable ? 1 : 0)) != 0 && (n3 = (int)(this.isHideableWhenDragging() ? 1 : 0)) != 0 && (n3 = this.state) != (n7 = 5)) {
            c2$a = C2$a.n;
            this.replaceAccessibilityActionForState(view, c2$a, n7);
        }
        n3 = this.state;
        n7 = 4;
        n4 = 3;
        if (n3 != n4) {
            if (n3 != n7) {
                if (n3 == n8) {
                    c2$a = C2$a.m;
                    this.replaceAccessibilityActionForState(view, c2$a, n7);
                    c2$a = C2$a.l;
                    this.replaceAccessibilityActionForState(view, c2$a, n4);
                }
            } else {
                n3 = (int)(this.fitToContents ? 1 : 0);
                if (n3 != 0) {
                    n8 = 3;
                }
                c2$a = C2$a.l;
                this.replaceAccessibilityActionForState(view, c2$a, n8);
            }
        } else {
            n3 = (int)(this.fitToContents ? 1 : 0);
            if (n3 != 0) {
                n8 = 4;
            }
            c2$a = C2$a.m;
            this.replaceAccessibilityActionForState(view, c2$a, n8);
        }
    }

    private void updateDrawableForTargetState(int n3, boolean bl2) {
        MaterialShapeDrawable materialShapeDrawable;
        int n4 = 2;
        if (n3 == n4) {
            return;
        }
        int n7 = this.expandedCornersRemoved;
        n3 = (int)(this.isExpandedAndShouldRemoveCorners() ? 1 : 0);
        if (n7 != n3 && (materialShapeDrawable = this.materialShapeDrawable) != null) {
            Object object;
            this.expandedCornersRemoved = n3;
            n7 = 1065353216;
            float f5 = 1.0f;
            if (bl2 && (object = this.interpolatorAnimator) != null) {
                bl2 = object.isRunning();
                if (bl2) {
                    ValueAnimator valueAnimator = this.interpolatorAnimator;
                    valueAnimator.reverse();
                } else {
                    object = this.materialShapeDrawable;
                    float f6 = ((MaterialShapeDrawable)object).getInterpolation();
                    if (n3 != 0) {
                        f5 = this.calculateInterpolationWithCornersRemoved();
                    }
                    ValueAnimator valueAnimator = this.interpolatorAnimator;
                    float[] fArray = new float[n4];
                    fArray[0] = f6;
                    bl2 = true;
                    f6 = Float.MIN_VALUE;
                    fArray[bl2] = f5;
                    valueAnimator.setFloatValues(fArray);
                    valueAnimator = this.interpolatorAnimator;
                    valueAnimator.start();
                }
            } else {
                Object object2 = this.interpolatorAnimator;
                if (object2 != null && (n3 = (int)(object2.isRunning() ? 1 : 0)) != 0) {
                    object2 = this.interpolatorAnimator;
                    object2.cancel();
                }
                object2 = this.materialShapeDrawable;
                bl2 = this.expandedCornersRemoved;
                if (bl2) {
                    f5 = this.calculateInterpolationWithCornersRemoved();
                }
                ((MaterialShapeDrawable)object2).setInterpolation(f5);
            }
        }
    }

    private void updateImportantForAccessibility(boolean bl2) {
        HashMap hashMap;
        Object object = this.viewRef;
        if (object == null) {
            return;
        }
        int n3 = (object = ((View)((Reference)object).get()).getParent()) instanceof CoordinatorLayout;
        if (n3 == 0) {
            return;
        }
        object = (CoordinatorLayout)object;
        n3 = object.getChildCount();
        if (bl2) {
            hashMap = this.importantForAccessibilityMap;
            if (hashMap == null) {
                this.importantForAccessibilityMap = hashMap = new HashMap(n3);
            } else {
                return;
            }
        }
        hashMap = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            Object object2;
            Object object3;
            View view = object.getChildAt(i3);
            if (view == (object3 = this.viewRef.get())) continue;
            if (bl2) {
                object3 = this.importantForAccessibilityMap;
                int n7 = view.getImportantForAccessibility();
                object2 = n7;
                object3.put((View)view, (Integer)object2);
                n4 = this.updateImportantForAccessibilityOnSiblings;
                if (n4 == 0) continue;
                object3 = ViewCompat.a;
                n4 = 4;
                view.setImportantForAccessibility(n4);
                continue;
            }
            n4 = this.updateImportantForAccessibilityOnSiblings;
            if (n4 == 0 || (object3 = this.importantForAccessibilityMap) == null || (n4 = object3.containsKey(view)) == 0) continue;
            object3 = (Integer)this.importantForAccessibilityMap.get(view);
            n4 = (Integer)object3;
            object2 = ViewCompat.a;
            view.setImportantForAccessibility(n4);
        }
        if (!bl2) {
            bl2 = false;
            Object var11_11 = null;
            this.importantForAccessibilityMap = null;
        } else {
            bl2 = this.updateImportantForAccessibilityOnSiblings;
            if (bl2) {
                View view = (View)this.viewRef.get();
                int n8 = 8;
                view.sendAccessibilityEvent(n8);
            }
        }
    }

    private void updatePeekHeight(boolean bl2) {
        WeakReference weakReference = this.viewRef;
        if (weakReference != null) {
            this.calculateCollapsedOffset();
            int n3 = this.state;
            int n4 = 4;
            if (n3 == n4 && (weakReference = (View)this.viewRef.get()) != null) {
                if (bl2) {
                    this.setState(n4);
                } else {
                    weakReference.requestLayout();
                }
            }
        }
    }

    public void addBottomSheetCallback(BottomSheetBehavior$BottomSheetCallback bottomSheetBehavior$BottomSheetCallback) {
        ArrayList arrayList = this.callbacks;
        boolean bl2 = arrayList.contains(bottomSheetBehavior$BottomSheetCallback);
        if (!bl2) {
            arrayList = this.callbacks;
            arrayList.add(bottomSheetBehavior$BottomSheetCallback);
        }
    }

    public float calculateSlideOffset() {
        WeakReference weakReference = this.viewRef;
        if (weakReference != null && (weakReference = weakReference.get()) != null) {
            int n3 = ((View)this.viewRef.get()).getTop();
            return this.calculateSlideOffsetWithTop(n3);
        }
        return -1.0f;
    }

    public void cancelBackProgress() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.cancelBackProgress();
    }

    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    public void dispatchOnSlide(int n3) {
        ArrayList arrayList;
        int n4;
        View view = (View)this.viewRef.get();
        if (view != null && (n4 = (arrayList = this.callbacks).isEmpty()) == 0) {
            Object object;
            int n7;
            float f5 = this.calculateSlideOffsetWithTop(n3);
            arrayList = null;
            for (n4 = 0; n4 < (n7 = ((ArrayList)(object = this.callbacks)).size()); ++n4) {
                object = (BottomSheetBehavior$BottomSheetCallback)this.callbacks.get(n4);
                ((BottomSheetBehavior$BottomSheetCallback)object).onSlide(view, f5);
            }
        }
    }

    public View findScrollingChild(View view) {
        int n3 = view.getVisibility();
        if (n3 != 0) {
            return null;
        }
        n3 = (int)(ViewCompat$c.j(view) ? 1 : 0);
        if (n3 != 0) {
            return view;
        }
        n3 = view instanceof ViewGroup;
        if (n3 != 0) {
            view = (ViewGroup)view;
            n3 = view.getChildCount();
            for (int i3 = 0; i3 < n3; ++i3) {
                View view2 = view.getChildAt(i3);
                if ((view2 = this.findScrollingChild(view2)) == null) continue;
                return view2;
            }
        }
        return null;
    }

    public MaterialBottomContainerBackHelper getBackHelper() {
        return this.bottomContainerBackHelper;
    }

    public int getExpandedOffset() {
        int n3 = this.fitToContents;
        if (n3 != 0) {
            n3 = this.fitToContentsOffset;
        } else {
            n3 = this.expandedOffset;
            int n4 = this.paddingTopSystemWindowInsets;
            n4 = n4 != 0 ? 0 : this.insetTop;
            n3 = Math.max(n3, n4);
        }
        return n3;
    }

    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    public MaterialShapeDrawable getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getPeekHeight() {
        int n3 = this.peekHeightAuto;
        n3 = n3 != 0 ? -1 : this.peekHeight;
        return n3;
    }

    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public int getSignificantVelocityThreshold() {
        return this.significantVelocityThreshold;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    public void handleBackInvoked() {
        int n3;
        int n4;
        Object object = this.bottomContainerBackHelper;
        if (object == null) {
            return;
        }
        object = ((MaterialBackAnimationHelper)object).onHandleBackInvoked();
        int n7 = 4;
        if (object != null && (n4 = Build.VERSION.SDK_INT) >= (n3 = 34)) {
            n4 = (int)(this.hideable ? 1 : 0);
            if (n4 != 0) {
                MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
                BottomSheetBehavior$2 bottomSheetBehavior$2 = new BottomSheetBehavior$2(this);
                materialBottomContainerBackHelper.finishBackProgressNotPersistent((uu_0)object, (Animator.AnimatorListener)bottomSheetBehavior$2);
            } else {
                MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
                n3 = 0;
                materialBottomContainerBackHelper.finishBackProgressPersistent((uu_0)object, null);
                this.setState(n7);
            }
            return;
        }
        boolean bl2 = this.hideable;
        if (bl2) {
            n7 = 5;
        }
        this.setState(n7);
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public boolean isHideableWhenDragging() {
        return true;
    }

    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    public boolean isShouldRemoveExpandedCorners() {
        return this.shouldRemoveExpandedCorners;
    }

    public void onAttachedToLayoutParams(CoordinatorLayout$e coordinatorLayout$e) {
        super.onAttachedToLayoutParams(coordinatorLayout$e);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout object, View object2, MotionEvent motionEvent) {
        int n3;
        block15: {
            float f5;
            int n4;
            float f6;
            int n7;
            int n8;
            int n10;
            VelocityTracker velocityTracker;
            boolean bl2;
            int n14;
            block18: {
                int n15;
                block16: {
                    block17: {
                        n14 = object2.isShown();
                        bl2 = false;
                        n3 = 1;
                        if (n14 == 0 || (n14 = this.draggable) == 0) break block15;
                        n14 = motionEvent.getActionMasked();
                        if (n14 == 0) {
                            this.reset();
                        }
                        if ((velocityTracker = this.velocityTracker) == null) {
                            this.velocityTracker = velocityTracker = VelocityTracker.obtain();
                        }
                        this.velocityTracker.addMovement(motionEvent);
                        velocityTracker = null;
                        n10 = 2;
                        n8 = -1;
                        if (n14 == 0) break block16;
                        if (n14 == n3) break block17;
                        n7 = 3;
                        f6 = 4.2E-45f;
                        if (n14 != n7) break block18;
                    }
                    this.touchingScrollingChild = false;
                    this.activePointerId = n8;
                    n7 = (int)(this.ignoreEvents ? 1 : 0);
                    if (n7 != 0) {
                        this.ignoreEvents = false;
                        return false;
                    }
                    break block18;
                }
                float f7 = motionEvent.getX();
                int n16 = (int)f7;
                float f8 = motionEvent.getY();
                this.initialY = n15 = (int)f8;
                n15 = this.state;
                if (n15 != n10) {
                    int n17;
                    WeakReference weakReference = this.nestedScrollingChildRef;
                    if (weakReference != null) {
                        weakReference = (View)weakReference.get();
                    } else {
                        n15 = 0;
                        weakReference = null;
                        f8 = 0.0f;
                    }
                    if (weakReference != null && (n15 = (int)(((CoordinatorLayout)object).isPointInChildBounds((View)weakReference, n16, n17 = this.initialY) ? 1 : 0)) != 0) {
                        n15 = motionEvent.getActionIndex();
                        this.activePointerId = n15 = motionEvent.getPointerId(n15);
                        this.touchingScrollingChild = n3;
                    }
                }
                if ((n15 = this.activePointerId) == n8 && (n7 = (int)(((CoordinatorLayout)object).isPointInChildBounds((View)object2, n16, n15 = this.initialY) ? 1 : 0)) == 0) {
                    n7 = 1;
                    f6 = Float.MIN_VALUE;
                } else {
                    n7 = 0;
                    f6 = 0.0f;
                    object2 = null;
                }
                this.ignoreEvents = n7;
            }
            n7 = (int)(this.ignoreEvents ? 1 : 0);
            if (n7 == 0 && (object2 = this.viewDragHelper) != null && (n7 = (int)(object2.t(motionEvent) ? 1 : 0)) != 0) {
                return n3 != 0;
            }
            object2 = this.nestedScrollingChildRef;
            if (object2 != null) {
                object2 = object2.get();
                velocityTracker = object2;
                velocityTracker = object2;
            }
            if (n14 == n10 && velocityTracker != null && (n7 = (int)(this.ignoreEvents ? 1 : 0)) == 0 && (n7 = this.state) != n3 && (n4 = ((CoordinatorLayout)object).isPointInChildBounds((View)velocityTracker, n7 = (int)(f6 = motionEvent.getX()), n14 = (int)(f5 = motionEvent.getY()))) == 0 && (object = this.viewDragHelper) != null && (n4 = this.initialY) != n8) {
                float f11 = n4;
                f6 = motionEvent.getY();
                f11 = Math.abs(f11 - f6);
                object2 = this.viewDragHelper;
                n7 = object2.b;
                f6 = n7;
                float f12 = f11 - f6;
                n4 = (int)(f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1));
                if (n4 > 0) {
                    bl2 = true;
                }
            }
            return bl2;
        }
        this.ignoreEvents = n3;
        return false;
    }

    public boolean onLayoutChild(CoordinatorLayout object, View view, int n3) {
        int n4;
        Object object2;
        int n7;
        block18: {
            block22: {
                float f5;
                int n8;
                block21: {
                    block20: {
                        block19: {
                            block17: {
                                int n10;
                                float f6;
                                n7 = 1;
                                object2 = ViewCompat.a;
                                int n14 = object.getFitsSystemWindows();
                                if (n14 != 0 && (n14 = view.getFitsSystemWindows()) == 0) {
                                    view.setFitsSystemWindows(n7 != 0);
                                }
                                if ((object2 = this.viewRef) == null) {
                                    object2 = object.getResources();
                                    n8 = R$dimen.design_bottom_sheet_peek_height_min;
                                    this.peekHeightMin = n14 = object2.getDimensionPixelSize(n8);
                                    this.setWindowInsetsListener(view);
                                    object2 = new InsetsAnimationCallback(view);
                                    ViewCompat.w(view, (WindowInsetsAnimationCompat$b)object2);
                                    object2 = new WeakReference(view);
                                    this.viewRef = object2;
                                    this.bottomContainerBackHelper = object2 = new MaterialBottomContainerBackHelper(view);
                                    object2 = this.materialShapeDrawable;
                                    if (object2 != null) {
                                        view.setBackground((Drawable)object2);
                                        object2 = this.materialShapeDrawable;
                                        f5 = this.elevation;
                                        f6 = -1.0f;
                                        n10 = (int)(f5 == f6 ? 0 : (f5 > f6 ? 1 : -1));
                                        if (n10 == 0) {
                                            f5 = ViewCompat$c.e(view);
                                        }
                                        ((MaterialShapeDrawable)object2).setElevation(f5);
                                    } else {
                                        object2 = this.backgroundTint;
                                        if (object2 != null) {
                                            ViewCompat.u(view, (ColorStateList)object2);
                                        }
                                    }
                                    this.updateAccessibilityActions();
                                    n14 = view.getImportantForAccessibility();
                                    if (n14 == 0) {
                                        view.setImportantForAccessibility(n7);
                                    }
                                }
                                if ((object2 = this.viewDragHelper) == null) {
                                    ViewDragHelper viewDragHelper;
                                    object2 = this.dragCallback;
                                    Context context = object.getContext();
                                    this.viewDragHelper = viewDragHelper = new ViewDragHelper(context, (ViewGroup)object, (ViewDragHelper$b)object2);
                                }
                                n14 = view.getTop();
                                ((CoordinatorLayout)object).onLayoutChild(view, n3);
                                this.parentWidth = n3 = object.getWidth();
                                this.parentHeight = n4 = object.getHeight();
                                this.childHeight = n4 = view.getHeight();
                                n3 = this.parentHeight;
                                n4 = n3 - n4;
                                n8 = this.insetTop;
                                if (n4 < n8) {
                                    n4 = (int)(this.paddingTopSystemWindowInsets ? 1 : 0);
                                    n10 = -1;
                                    f6 = 0.0f / 0.0f;
                                    if (n4 != 0) {
                                        n4 = this.maxHeight;
                                        if (n4 != n10) {
                                            n3 = Math.min(n3, n4);
                                        }
                                        this.childHeight = n3;
                                    } else {
                                        n3 -= n8;
                                        n4 = this.maxHeight;
                                        if (n4 != n10) {
                                            n3 = Math.min(n3, n4);
                                        }
                                        this.childHeight = n3;
                                    }
                                }
                                n4 = this.parentHeight;
                                n3 = this.childHeight;
                                n4 -= n3;
                                n3 = 0;
                                this.fitToContentsOffset = n4 = Math.max(0, n4);
                                this.calculateHalfExpandedOffset();
                                this.calculateCollapsedOffset();
                                n4 = this.state;
                                n8 = 3;
                                f5 = 4.2E-45f;
                                if (n4 != n8) break block17;
                                n4 = this.getExpandedOffset();
                                ViewCompat.m(n4, view);
                                break block18;
                            }
                            n8 = 6;
                            f5 = 8.4E-45f;
                            if (n4 != n8) break block19;
                            n4 = this.halfExpandedOffset;
                            ViewCompat.m(n4, view);
                            break block18;
                        }
                        n8 = (int)(this.hideable ? 1 : 0);
                        if (n8 == 0) break block20;
                        n8 = 5;
                        f5 = 7.0E-45f;
                        if (n4 != n8) break block20;
                        n4 = this.parentHeight;
                        ViewCompat.m(n4, view);
                        break block18;
                    }
                    n8 = 4;
                    f5 = 5.6E-45f;
                    if (n4 != n8) break block21;
                    n4 = this.collapsedOffset;
                    ViewCompat.m(n4, view);
                    break block18;
                }
                if (n4 == n7) break block22;
                n8 = 2;
                f5 = 2.8E-45f;
                if (n4 != n8) break block18;
            }
            n4 = view.getTop();
            ViewCompat.m(n14 -= n4, view);
        }
        n4 = this.state;
        this.updateDrawableForTargetState(n4, false);
        object2 = this.findScrollingChild(view);
        object = new WeakReference(object2);
        this.nestedScrollingChildRef = object;
        while (n3 < (n4 = ((ArrayList)(object = this.callbacks)).size())) {
            object = (BottomSheetBehavior$BottomSheetCallback)this.callbacks.get(n3);
            ((BottomSheetBehavior$BottomSheetCallback)object).onLayout(view);
            n3 += n7;
        }
        return n7 != 0;
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int n3, int n4, int n7, int n8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n10 = coordinatorLayout.getPaddingLeft();
        int n14 = coordinatorLayout.getPaddingRight() + n10;
        n10 = marginLayoutParams.leftMargin;
        n14 += n10;
        n10 = marginLayoutParams.rightMargin;
        n14 = n14 + n10 + n4;
        n4 = this.maxWidth;
        n10 = marginLayoutParams.width;
        n3 = this.getChildMeasureSpec(n3, n14, n4, n10);
        n4 = coordinatorLayout.getPaddingTop();
        int n15 = coordinatorLayout.getPaddingBottom() + n4;
        n4 = marginLayoutParams.topMargin;
        n15 += n4;
        n4 = marginLayoutParams.bottomMargin;
        n15 = n15 + n4 + n8;
        n4 = this.maxHeight;
        n8 = marginLayoutParams.height;
        n15 = this.getChildMeasureSpec(n7, n15, n4, n8);
        view.measure(n3, n15);
        return true;
    }

    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f5, float f6) {
        boolean bl2;
        int n3;
        WeakReference weakReference;
        int n4 = this.isNestedScrollingCheckEnabled();
        boolean bl3 = false;
        if (n4 != 0 && (weakReference = this.nestedScrollingChildRef) != null && view2 == (weakReference = weakReference.get()) && ((n4 = this.state) != (n3 = 3) || (bl2 = super.onNestedPreFling(coordinatorLayout, view, view2, f5, f6)))) {
            bl3 = true;
        }
        return bl3;
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int n3, int n4, int[] nArray, int n7) {
        int n8;
        int n10;
        int n14 = 1;
        if (n7 == n14) {
            return;
        }
        WeakReference weakReference = this.nestedScrollingChildRef;
        if (weakReference != null) {
            weakReference = (View)weakReference.get();
        } else {
            n3 = 0;
            weakReference = null;
        }
        n7 = (int)(this.isNestedScrollingCheckEnabled() ? 1 : 0);
        if (n7 != 0 && view2 != weakReference) {
            return;
        }
        n3 = view.getTop();
        n7 = n3 - n4;
        if (n4 > 0) {
            int n15 = this.getExpandedOffset();
            if (n7 < n15) {
                n15 = this.getExpandedOffset();
                nArray[n14] = n3 -= n15;
                ViewCompat.m(-n3, view);
                n15 = 3;
                this.setStateInternal(n15);
            } else {
                n15 = (int)(this.draggable ? 1 : 0);
                if (n15 == 0) {
                    return;
                }
                nArray[n14] = n4;
                n15 = -n4;
                ViewCompat.m(n15, view);
                this.setStateInternal(n14);
            }
        } else if (n4 < 0 && (n10 = view2.canScrollVertically(n8 = -1)) == 0) {
            n10 = this.collapsedOffset;
            if (n7 > n10 && (n10 = (int)(this.canBeHiddenByDragging() ? 1 : 0)) == 0) {
                n10 = this.collapsedOffset;
                nArray[n14] = n3 -= n10;
                ViewCompat.m(-n3, view);
                n10 = 4;
                this.setStateInternal(n10);
            } else {
                n10 = (int)(this.draggable ? 1 : 0);
                if (n10 == 0) {
                    return;
                }
                nArray[n14] = n4;
                n10 = -n4;
                ViewCompat.m(n10, view);
                this.setStateInternal(n14);
            }
        }
        int n16 = view.getTop();
        this.dispatchOnSlide(n16);
        this.lastNestedScrollDy = n4;
        this.nestedScrolled = n14;
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int n3, int n4, int n7, int n8, int n10, int[] nArray) {
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        parcelable = (BottomSheetBehavior$SavedState)parcelable;
        Parcelable parcelable2 = parcelable.getSuperState();
        super.onRestoreInstanceState(coordinatorLayout, view, parcelable2);
        this.restoreOptionalState((BottomSheetBehavior$SavedState)parcelable);
        int n3 = parcelable.state;
        int n4 = 1;
        if (n3 != n4 && n3 != (n4 = 2)) {
            this.state = n3;
            this.lastStableState = n3;
        } else {
            this.state = n3 = 4;
            this.lastStableState = n3;
        }
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        coordinatorLayout = super.onSaveInstanceState(coordinatorLayout, view);
        BottomSheetBehavior$SavedState bottomSheetBehavior$SavedState = new BottomSheetBehavior$SavedState((Parcelable)coordinatorLayout, this);
        return bottomSheetBehavior$SavedState;
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int n3, int n4) {
        boolean bl2 = false;
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        int n7 = n3 & 2;
        if (n7 != 0) {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    public void onStopNestedScroll(CoordinatorLayout var1_1, View var2_2, View var3_3, int var4_4) {
        block6: {
            block8: {
                block10: {
                    block9: {
                        block7: {
                            block5: {
                                var5_5 = var2_2.getTop();
                                var4_4 = this.getExpandedOffset();
                                var6_6 = 3;
                                if (var5_5 == var4_4) {
                                    this.setStateInternal(var6_6);
                                    return;
                                }
                                var5_5 = (int)this.isNestedScrollingCheckEnabled();
                                if (var5_5 != 0 && ((var1_1 = this.nestedScrollingChildRef) == null || var3_3 != (var1_1 = var1_1.get()) || (var5_5 = (int)this.nestedScrolled) == 0)) {
                                    return;
                                }
                                var5_5 = this.lastNestedScrollDy;
                                var7_7 = 6;
                                if (var5_5 <= 0) break block5;
                                var5_5 = (int)this.fitToContents;
                                if (var5_5 != 0 || (var5_5 = var2_2.getTop()) <= (var4_4 = this.halfExpandedOffset)) break block6;
                                ** GOTO lbl52
                            }
                            var5_5 = (int)this.hideable;
                            if (var5_5 == 0 || (var5_5 = (int)this.shouldHide(var2_2, var8_8 = this.getYVelocity())) == 0) break block7;
                            var6_6 = 5;
                            break block6;
                        }
                        var5_5 = this.lastNestedScrollDy;
                        var4_4 = 4;
                        if (var5_5 != 0) break block8;
                        var5_5 = var2_2.getTop();
                        var9_9 = this.fitToContents;
                        if (var9_9 == 0) break block9;
                        var7_7 = this.fitToContentsOffset;
                        if ((var7_7 = Math.abs(var5_5 - var7_7)) >= (var5_5 = Math.abs(var5_5 - (var9_9 = this.collapsedOffset)))) ** GOTO lbl-1000
                        break block6;
                    }
                    var9_9 = this.halfExpandedOffset;
                    if (var5_5 >= var9_9) break block10;
                    var9_9 = this.collapsedOffset;
                    if (var5_5 < (var9_9 = Math.abs(var5_5 - var9_9))) break block6;
                    var5_5 = (int)this.shouldSkipHalfExpandedStateWhenDragging();
                    if (var5_5 == 0) ** GOTO lbl52
                    ** GOTO lbl-1000
                }
                var6_6 = Math.abs(var5_5 - var9_9);
                if (var6_6 >= (var5_5 = Math.abs(var5_5 - (var9_9 = this.collapsedOffset)))) ** GOTO lbl-1000
                ** GOTO lbl52
            }
            var5_5 = (int)this.fitToContents;
            if (var5_5 != 0) lbl-1000:
            // 5 sources

            {
                while (true) {
                    var6_6 = 4;
                    break;
                }
            } else {
                var5_5 = var2_2.getTop();
                var6_6 = this.halfExpandedOffset;
                if ((var6_6 = Math.abs(var5_5 - var6_6)) >= (var5_5 = Math.abs(var5_5 - (var9_10 = this.collapsedOffset)))) ** continue;
lbl52:
                // 4 sources

                var6_6 = 6;
            }
        }
        this.startSettling(var2_2, var6_6, false);
        this.nestedScrolled = false;
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
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
            this.reset();
        }
        if ((viewDragHelper = this.velocityTracker) == null) {
            viewDragHelper = VelocityTracker.obtain();
            this.velocityTracker = viewDragHelper;
        }
        viewDragHelper = this.velocityTracker;
        viewDragHelper.addMovement(motionEvent);
        n4 = this.shouldHandleDraggingWithHelper();
        if (n4 != 0) {
            n4 = 2;
            float f5 = 2.8E-45f;
            if (n3 == n4 && (n3 = (int)(this.ignoreEvents ? 1 : 0)) == 0) {
                float f6 = this.initialY;
                f5 = motionEvent.getY();
                f6 = Math.abs(f6 - f5);
                viewDragHelper = this.viewDragHelper;
                int n8 = viewDragHelper.b;
                float f7 = n8;
                float f8 = f6 - f7;
                n3 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
                if (n3 > 0) {
                    n3 = motionEvent.getActionIndex();
                    n3 = motionEvent.getPointerId(n3);
                    viewDragHelper.c(n3, view);
                }
            }
        }
        return (this.ignoreEvents ^ n7) != 0;
    }

    public void removeBottomSheetCallback(BottomSheetBehavior$BottomSheetCallback bottomSheetBehavior$BottomSheetCallback) {
        this.callbacks.remove(bottomSheetBehavior$BottomSheetCallback);
    }

    public void setAccessibilityDelegateView(View view) {
        WeakReference<View> weakReference;
        int n3 = 1;
        if (view == null && (weakReference = this.accessibilityDelegateViewRef) != null) {
            view = (View)weakReference.get();
            this.clearAccessibilityAction(view, n3);
            this.accessibilityDelegateViewRef = null;
            return;
        }
        this.accessibilityDelegateViewRef = weakReference = new WeakReference<View>(view);
        this.updateAccessibilityActions(view, n3);
    }

    public void setBottomSheetCallback(BottomSheetBehavior$BottomSheetCallback bottomSheetBehavior$BottomSheetCallback) {
        ArrayList arrayList = this.callbacks;
        arrayList.clear();
        if (bottomSheetBehavior$BottomSheetCallback != null) {
            arrayList = this.callbacks;
            arrayList.add(bottomSheetBehavior$BottomSheetCallback);
        }
    }

    public void setDraggable(boolean bl2) {
        this.draggable = bl2;
    }

    public void setExpandedOffset(int n3) {
        if (n3 >= 0) {
            this.expandedOffset = n3;
            n3 = this.state;
            this.updateDrawableForTargetState(n3, true);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("offset must be greater than or equal to 0");
        throw illegalArgumentException;
    }

    public void setFitToContents(boolean n3) {
        int n4 = this.fitToContents;
        if (n4 == n3) {
            return;
        }
        this.fitToContents = n3;
        WeakReference weakReference = this.viewRef;
        if (weakReference != null) {
            this.calculateCollapsedOffset();
        }
        n3 = (n3 = this.fitToContents) != 0 && (n3 = this.state) == (n4 = 6) ? 3 : this.state;
        this.setStateInternal(n3);
        n3 = this.state;
        this.updateDrawableForTargetState(n3, true);
        this.updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean bl2) {
        this.gestureInsetBottomIgnored = bl2;
    }

    public void setHalfExpandedRatio(float f5) {
        float f6;
        float f7 = 0.0f;
        float f8 = f5 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object > 0 && (object = (f6 = f5 - (f7 = 1.0f)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) < 0) {
            this.halfExpandedRatio = f5;
            WeakReference weakReference = this.viewRef;
            if (weakReference != null) {
                this.calculateHalfExpandedOffset();
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ratio must be a float value between 0 and 1");
        throw illegalArgumentException;
    }

    public void setHideFriction(float f5) {
        this.hideFriction = f5;
    }

    public void setHideable(boolean n3) {
        int n4 = this.hideable;
        if (n4 != n3) {
            this.hideable = n3;
            if (n3 == 0 && (n3 = this.state) == (n4 = 5)) {
                n3 = 4;
                this.setState(n3);
            }
            this.updateAccessibilityActions();
        }
    }

    public void setHideableInternal(boolean bl2) {
        this.hideable = bl2;
    }

    public void setMaxHeight(int n3) {
        this.maxHeight = n3;
    }

    public void setMaxWidth(int n3) {
        this.maxWidth = n3;
    }

    public void setPeekHeight(int n3) {
        this.setPeekHeight(n3, false);
    }

    public final void setPeekHeight(int n3, boolean bl2) {
        block3: {
            block4: {
                int n4;
                block2: {
                    n4 = -1;
                    if (n3 != n4) break block2;
                    n3 = (int)(this.peekHeightAuto ? 1 : 0);
                    if (n3 != 0) break block3;
                    n3 = 1;
                    this.peekHeightAuto = n3;
                    break block4;
                }
                n4 = (int)(this.peekHeightAuto ? 1 : 0);
                if (n4 == 0 && (n4 = this.peekHeight) == n3) break block3;
                n4 = 0;
                this.peekHeightAuto = false;
                this.peekHeight = n3 = Math.max(0, n3);
            }
            this.updatePeekHeight(bl2);
        }
    }

    public void setSaveFlags(int n3) {
        this.saveFlags = n3;
    }

    public void setShouldRemoveExpandedCorners(boolean bl2) {
        boolean bl3 = this.shouldRemoveExpandedCorners;
        if (bl3 != bl2) {
            this.shouldRemoveExpandedCorners = bl2;
            int n3 = this.getState();
            bl3 = true;
            this.updateDrawableForTargetState(n3, bl3);
        }
    }

    public void setSignificantVelocityThreshold(int n3) {
        this.significantVelocityThreshold = n3;
    }

    public void setSkipCollapsed(boolean bl2) {
        this.skipCollapsed = bl2;
    }

    public void setState(int n3) {
        int n4;
        int n7 = 1;
        if (n3 != n7 && n3 != (n4 = 2)) {
            n7 = (int)(this.hideable ? 1 : 0);
            if (n7 == 0 && n3 == (n7 = 5)) {
                return;
            }
            n7 = 6;
            n7 = n3 == n7 && (n7 = (int)(this.fitToContents ? 1 : 0)) != 0 && (n7 = this.getTopOffsetForState(n3)) <= (n4 = this.fitToContentsOffset) ? 3 : n3;
            Object object = this.viewRef;
            if (object != null && (object = ((Reference)object).get()) != null) {
                View view = (View)this.viewRef.get();
                object = new BottomSheetBehavior$1(this, view, n7);
                this.runAfterLayout(view, (Runnable)object);
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
        Object object;
        WeakReference weakReference;
        boolean bl2;
        int n4 = this.state;
        if (n4 == n3) {
            return;
        }
        this.state = n3;
        n4 = 5;
        int n7 = 6;
        int n8 = 3;
        int n10 = 4;
        if (n3 == n10 || n3 == n8 || n3 == n7 || (bl2 = this.hideable) && n3 == n4) {
            this.lastStableState = n3;
        }
        if ((weakReference = this.viewRef) == null) {
            return;
        }
        if ((weakReference = (View)weakReference.get()) == null) {
            return;
        }
        int n14 = 0;
        boolean bl3 = true;
        if (n3 == n8) {
            this.updateImportantForAccessibility(bl3);
        } else if (n3 == n7 || n3 == n4 || n3 == n10) {
            this.updateImportantForAccessibility(false);
        }
        this.updateDrawableForTargetState(n3, bl3);
        while (n14 < (n4 = ((ArrayList)(object = this.callbacks)).size())) {
            object = (BottomSheetBehavior$BottomSheetCallback)this.callbacks.get(n14);
            ((BottomSheetBehavior$BottomSheetCallback)object).onStateChanged((View)weakReference, n3);
            ++n14;
        }
        this.updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean bl2) {
        this.updateImportantForAccessibilityOnSiblings = bl2;
    }

    public boolean shouldExpandOnUpwardDrag(long l2, float f5) {
        return false;
    }

    public boolean shouldHide(View view, float f5) {
        int n3;
        int n4 = this.skipCollapsed;
        boolean bl2 = true;
        if (n4 != 0) {
            return bl2;
        }
        n4 = this.isHideableWhenDragging();
        if (n4 == 0) {
            return false;
        }
        n4 = view.getTop();
        if (n4 < (n3 = this.collapsedOffset)) {
            return false;
        }
        n4 = this.calculatePeekHeight();
        float f6 = view.getTop();
        float f7 = this.hideFriction;
        f5 = f5 * f7 + f6;
        f6 = this.collapsedOffset;
        f6 = Math.abs(f5 - f6);
        f5 = n4;
        float f8 = (f6 /= f5) - (f5 = 0.5f);
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object <= 0) {
            bl2 = false;
        }
        return bl2;
    }

    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    public void startBackProgress(uu_0 uu_02) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.startBackProgress(uu_02);
    }

    public void updateBackProgress(uu_0 uu_02) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.updateBackProgress(uu_02);
    }
}

