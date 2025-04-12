/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$b;
import androidx.constraintlayout.widget.ConstraintLayout$c;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.Placeholder;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ConstraintLayout
extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static c sSharedValues;
    SparseArray mChildrenByIds;
    private ArrayList mConstraintHelpers;
    protected D50 mConstraintLayoutSpec;
    private b mConstraintSet;
    private int mConstraintSetId;
    private HashMap mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected Z50 mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    ConstraintLayout$b mMeasurer;
    private QO1 mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray mTempMapIdToWidget;

    public ConstraintLayout(Context object) {
        super(object);
        Object object2;
        HashMap hashMap;
        int n3;
        int n4;
        super();
        this.mChildrenByIds = object;
        super(4);
        this.mConstraintHelpers = object;
        super();
        this.mLayoutWidget = object;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = n4 = -1 >>> 1;
        this.mMaxHeight = n4;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = n3 = -1;
        this.mDesignIds = hashMap = new HashMap();
        this.mLastMeasureWidth = n3;
        this.mLastMeasureHeight = n3;
        this.mLastMeasureWidthSize = n3;
        this.mLastMeasureHeightSize = n3;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = object2 = new SparseArray();
        super(this, this);
        this.mMeasurer = object2;
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        this.init(null, 0, 0);
    }

    public ConstraintLayout(Context object, AttributeSet attributeSet) {
        super(object, attributeSet);
        Object object2;
        HashMap hashMap;
        int n3;
        super();
        this.mChildrenByIds = object;
        super(4);
        this.mConstraintHelpers = object;
        super();
        this.mLayoutWidget = object;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = n3 = -1 >>> 1;
        this.mMaxHeight = n3;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = n3 = -1;
        this.mDesignIds = hashMap = new HashMap();
        this.mLastMeasureWidth = n3;
        this.mLastMeasureHeight = n3;
        this.mLastMeasureWidthSize = n3;
        this.mLastMeasureHeightSize = n3;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = object2 = new SparseArray();
        super(this, this);
        this.mMeasurer = object2;
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        this.init(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context object, AttributeSet attributeSet, int n3) {
        super(object, attributeSet, n3);
        Object object2;
        HashMap hashMap;
        int n4;
        super();
        this.mChildrenByIds = object;
        super(4);
        this.mConstraintHelpers = object;
        super();
        this.mLayoutWidget = object;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = n4 = -1 >>> 1;
        this.mMaxHeight = n4;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = n4 = -1;
        this.mDesignIds = hashMap = new HashMap();
        this.mLastMeasureWidth = n4;
        this.mLastMeasureHeight = n4;
        this.mLastMeasureWidthSize = n4;
        this.mLastMeasureHeightSize = n4;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = object2 = new SparseArray();
        super(this, this);
        this.mMeasurer = object2;
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        this.init(attributeSet, n3, 0);
    }

    public ConstraintLayout(Context object, AttributeSet attributeSet, int n3, int n4) {
        super(object, attributeSet, n3, n4);
        Object object2;
        HashMap hashMap;
        int n7;
        super();
        this.mChildrenByIds = object;
        super(4);
        this.mConstraintHelpers = object;
        super();
        this.mLayoutWidget = object;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = n7 = -1 >>> 1;
        this.mMaxHeight = n7;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = n7 = -1;
        this.mDesignIds = hashMap = new HashMap();
        this.mLastMeasureWidth = n7;
        this.mLastMeasureHeight = n7;
        this.mLastMeasureWidthSize = n7;
        this.mLastMeasureHeightSize = n7;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = object2 = new SparseArray();
        super(this, this);
        this.mMeasurer = object2;
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        this.init(attributeSet, n3, n4);
    }

    public static /* synthetic */ QO1 access$000(ConstraintLayout constraintLayout) {
        ((Object)((Object)constraintLayout)).getClass();
        return null;
    }

    public static /* synthetic */ int access$100(ConstraintLayout constraintLayout) {
        return constraintLayout.mOptimizationLevel;
    }

    public static /* synthetic */ ArrayList access$200(ConstraintLayout constraintLayout) {
        return constraintLayout.mConstraintHelpers;
    }

    private int getPaddingWidth() {
        int n3 = this.getPaddingLeft();
        n3 = Math.max(0, n3);
        int n4 = this.getPaddingRight();
        n4 = Math.max(0, n4) + n3;
        n3 = this.getPaddingStart();
        n3 = Math.max(0, n3);
        int n7 = this.getPaddingEnd();
        int n8 = Math.max(0, n7) + n3;
        if (n8 > 0) {
            n4 = n8;
        }
        return n4;
    }

    public static c getSharedValues() {
        c c2 = sSharedValues;
        if (c2 == null) {
            HashMap hashMap;
            c2 = new Object();
            new SparseIntArray();
            c2.a = hashMap = new HashMap();
            sSharedValues = c2;
        }
        return sSharedValues;
    }

    private Y50 getTargetWidget(int n3) {
        Y50 y50;
        if (n3 == 0) {
            return this.mLayoutWidget;
        }
        View view = (View)this.mChildrenByIds.get(n3);
        if (view == null && (view = this.findViewById(n3)) != null && view != this && (y50 = view.getParent()) == this) {
            this.onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            n3 = 0;
            y50 = null;
        } else {
            y50 = ((ConstraintLayout$LayoutParams)view.getLayoutParams()).q0;
        }
        return y50;
    }

    private void init(AttributeSet object, int n3, int n4) {
        Z50 z50 = this.mLayoutWidget;
        z50.j0 = this;
        ConstraintLayout$b constraintLayout$b = this.mMeasurer;
        z50.B0 = constraintLayout$b;
        z50.z0.f = constraintLayout$b;
        z50 = this.mChildrenByIds;
        int n7 = this.getId();
        z50.put(n7, (Object)this);
        z50 = null;
        this.mConstraintSet = null;
        if (object != null) {
            constraintLayout$b = this.getContext();
            int[] nArray = R$styleable.ConstraintLayout_Layout;
            object = constraintLayout$b.obtainStyledAttributes((AttributeSet)object, nArray, n3, n4);
            n3 = object.getIndexCount();
            n4 = 0;
            constraintLayout$b = null;
            for (n7 = 0; n7 < n3; ++n7) {
                int n8;
                int n10 = object.getIndex(n7);
                if (n10 == (n8 = R$styleable.ConstraintLayout_Layout_android_minWidth)) {
                    n8 = this.mMinWidth;
                    this.mMinWidth = n10 = object.getDimensionPixelOffset(n10, n8);
                    continue;
                }
                n8 = R$styleable.ConstraintLayout_Layout_android_minHeight;
                if (n10 == n8) {
                    n8 = this.mMinHeight;
                    this.mMinHeight = n10 = object.getDimensionPixelOffset(n10, n8);
                    continue;
                }
                n8 = R$styleable.ConstraintLayout_Layout_android_maxWidth;
                if (n10 == n8) {
                    n8 = this.mMaxWidth;
                    this.mMaxWidth = n10 = object.getDimensionPixelOffset(n10, n8);
                    continue;
                }
                n8 = R$styleable.ConstraintLayout_Layout_android_maxHeight;
                if (n10 == n8) {
                    n8 = this.mMaxHeight;
                    this.mMaxHeight = n10 = object.getDimensionPixelOffset(n10, n8);
                    continue;
                }
                n8 = R$styleable.ConstraintLayout_Layout_layout_optimizationLevel;
                if (n10 == n8) {
                    n8 = this.mOptimizationLevel;
                    this.mOptimizationLevel = n10 = object.getInt(n10, n8);
                    continue;
                }
                n8 = R$styleable.ConstraintLayout_Layout_layoutDescription;
                if (n10 == n8) {
                    if ((n10 = object.getResourceId(n10, 0)) == 0) continue;
                    try {
                        this.parseLayoutDescription(n10);
                    }
                    catch (Resources.NotFoundException notFoundException) {
                        this.mConstraintLayoutSpec = null;
                    }
                    continue;
                }
                n8 = R$styleable.ConstraintLayout_Layout_constraintSet;
                if (n10 != n8) continue;
                n10 = object.getResourceId(n10, 0);
                b b2 = new b();
                this.mConstraintSet = b2;
                Context context = this.getContext();
                try {
                    b2.l(n10, context);
                }
                catch (Resources.NotFoundException notFoundException) {
                    this.mConstraintSet = null;
                }
                this.mConstraintSetId = n10;
            }
            object.recycle();
        }
        object = this.mLayoutWidget;
        ((Z50)object).K0 = n3 = this.mOptimizationLevel;
        Eu1.q = ((Z50)object).f0(512);
    }

    private void markHierarchyDirty() {
        int n3;
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = n3 = -1;
        this.mLastMeasureHeight = n3;
        this.mLastMeasureWidthSize = n3;
        this.mLastMeasureHeightSize = n3;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void setChildrenConstraints() {
        int n3;
        int n4;
        int n7;
        Object object;
        int n8;
        int n10;
        Object object2;
        int n14;
        boolean bl2 = this.isInEditMode();
        int n15 = this.getChildCount();
        Object var3_3 = null;
        SparseArray sparseArray = null;
        for (n14 = 0; n14 < n15; ++n14) {
            object2 = this.getChildAt(n14);
            if ((object2 = this.getViewWidget((View)object2)) == null) continue;
            ((Y50)object2).H();
        }
        n14 = -1;
        if (bl2) {
            object2 = null;
            for (n10 = 0; n10 < n15; ++n10) {
                View view = this.getChildAt(n10);
                try {
                    void var9_29;
                    Resources resources = this.getResources();
                    n8 = view.getId();
                    String string2 = resources.getResourceName(n8);
                    n8 = view.getId();
                    object = n8;
                    this.setDesignInformation(0, string2, object);
                    n8 = 47;
                    n8 = string2.indexOf(n8);
                    if (n8 != n14) {
                        String string3 = string2.substring(++n8);
                    }
                    n7 = view.getId();
                    Y50 y50 = this.getTargetWidget(n7);
                    y50.m0 = var9_29;
                    continue;
                }
                catch (Resources.NotFoundException notFoundException) {}
            }
        }
        if ((n10 = this.mConstraintSetId) != n14) {
            object2 = null;
            for (n10 = 0; n10 < n15; ++n10) {
                b b2;
                View view = this.getChildAt(n10);
                n4 = view.getId();
                if (n4 != (n8 = this.mConstraintSetId) || (n4 = view instanceof Constraints) == 0) continue;
                this.mConstraintSet = b2 = ((Constraints)view).getConstraintSet();
            }
        }
        if ((object2 = this.mConstraintSet) != null) {
            ((b)object2).c(this);
        }
        this.mLayoutWidget.x0.clear();
        object2 = this.mConstraintHelpers;
        n10 = ((ArrayList)object2).size();
        if (n10 > 0) {
            Object var8_18 = null;
            for (n7 = 0; n7 < n10; ++n7) {
                ConstraintHelper constraintHelper = (ConstraintHelper)((Object)this.mConstraintHelpers.get(n7));
                n8 = (int)(constraintHelper.isInEditMode() ? 1 : 0);
                if (n8 != 0) {
                    object = constraintHelper.f;
                    constraintHelper.setIds((String)object);
                }
                if ((object = constraintHelper.d) == null) continue;
                ((F41)object).b();
                object = null;
                for (n8 = 0; n8 < (n3 = constraintHelper.b); ++n8) {
                    void var16_62;
                    Integer n16;
                    HashMap hashMap;
                    String string4;
                    int n17;
                    int[] nArray = constraintHelper.a;
                    n3 = nArray[n8];
                    View view = this.getViewById(n3);
                    if (view == null && (n17 = constraintHelper.h(this, string4 = (String)(hashMap = constraintHelper.i).get(n16 = Integer.valueOf(n3)))) != 0) {
                        constraintHelper.a[n8] = n17;
                        Integer n18 = n17;
                        hashMap.put(n18, string4);
                        View view2 = this.getViewById(n17);
                    }
                    if (var16_62 == null) continue;
                    F41 f41 = constraintHelper.d;
                    Y50 y50 = this.getViewWidget((View)var16_62);
                    f41.a(y50);
                }
                F41 f41 = constraintHelper.d;
                f41.c();
            }
        }
        object2 = null;
        for (n10 = 0; n10 < n15; ++n10) {
            View view;
            View view3 = this.getChildAt(n10);
            n4 = view3 instanceof Placeholder;
            if (n4 == 0) continue;
            Placeholder placeholder = (Placeholder)view3;
            n4 = placeholder.a;
            if (n4 == n14 && (n4 = (int)(placeholder.isInEditMode() ? 1 : 0)) == 0) {
                n4 = placeholder.c;
                placeholder.setVisibility(n4);
            }
            n4 = placeholder.a;
            placeholder.b = view = this.findViewById(n4);
            if (view == null) continue;
            ConstraintLayout$LayoutParams constraintLayout$LayoutParams = (ConstraintLayout$LayoutParams)view.getLayoutParams();
            n8 = 1;
            constraintLayout$LayoutParams.f0 = n8;
            View view4 = placeholder.b;
            view4.setVisibility(0);
            placeholder.setVisibility(0);
        }
        this.mTempMapIdToWidget.clear();
        sparseArray = this.mTempMapIdToWidget;
        object2 = this.mLayoutWidget;
        sparseArray.put(0, object2);
        sparseArray = this.mTempMapIdToWidget;
        n10 = this.getId();
        Z50 z50 = this.mLayoutWidget;
        sparseArray.put(n10, (Object)z50);
        sparseArray = null;
        for (n14 = 0; n14 < n15; ++n14) {
            object2 = this.getChildAt(n14);
            Y50 y50 = this.getViewWidget((View)object2);
            SparseArray sparseArray2 = this.mTempMapIdToWidget;
            n10 = object2.getId();
            sparseArray2.put(n10, (Object)y50);
        }
        n3 = 0;
        Object var15_57 = null;
        while (n3 < n15) {
            object2 = this.getChildAt(n3);
            Y50 y50 = this.getViewWidget((View)object2);
            if (y50 != null) {
                ViewGroup.LayoutParams layoutParams;
                ViewGroup.LayoutParams layoutParams2 = layoutParams = object2.getLayoutParams();
                ConstraintLayout$LayoutParams constraintLayout$LayoutParams = (ConstraintLayout$LayoutParams)layoutParams;
                this.mLayoutWidget.a(y50);
                object = this.mTempMapIdToWidget;
                ConstraintLayout constraintLayout = this;
                n14 = (int)(bl2 ? 1 : 0);
                this.applyConstraintsFromLayoutParams(bl2, (View)object2, y50, constraintLayout$LayoutParams, (SparseArray)object);
            }
            ++n3;
        }
        return;
    }

    private void setWidgetBaseline(Y50 object, ConstraintLayout$LayoutParams object2, SparseArray object3, int n3, v50$a v50$a) {
        ViewGroup.LayoutParams layoutParams;
        Object object4 = (View)this.mChildrenByIds.get(n3);
        if ((object3 = (Y50)object3.get(n3)) != null && object4 != null && (n3 = (layoutParams = object4.getLayoutParams()) instanceof ConstraintLayout$LayoutParams) != 0) {
            n3 = 1;
            object2.c0 = n3;
            v50$a v50$a2 = v50$a.BASELINE;
            if (v50$a == v50$a2) {
                object4 = (ConstraintLayout$LayoutParams)object4.getLayoutParams();
                ((ConstraintLayout$LayoutParams)((Object)object4)).c0 = n3;
                object4 = ((ConstraintLayout$LayoutParams)((Object)object4)).q0;
                ((Y50)object4).G = n3;
            }
            object4 = ((Y50)object).n(v50$a2);
            object3 = ((Y50)object3).n(v50$a);
            int n4 = object2.D;
            int n7 = object2.C;
            ((v50_0)object4).b((v50_0)object3, n4, n7, n3 != 0);
            ((Y50)object).G = n3;
            object2 = v50$a.TOP;
            ((Y50)object).n((v50$a)((Object)object2)).j();
            object2 = v50$a.BOTTOM;
            object = ((Y50)object).n((v50$a)((Object)object2));
            ((v50_0)object).j();
        }
    }

    private boolean updateHierarchy() {
        int n3 = this.getChildCount();
        boolean bl2 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = this.getChildAt(i3);
            boolean bl3 = view.isLayoutRequested();
            if (!bl3) continue;
            bl2 = true;
            break;
        }
        if (bl2) {
            this.setChildrenConstraints();
        }
        return bl2;
    }

    public void addValueModifier(ConstraintLayout$c constraintLayout$c) {
        ArrayList arrayList = this.mModifiers;
        if (arrayList == null) {
            this.mModifiers = arrayList = new ArrayList();
        }
        this.mModifiers.add(constraintLayout$c);
    }

    public void applyConstraintsFromLayoutParams(boolean bl2, View view, Y50 y50, ConstraintLayout$LayoutParams constraintLayout$LayoutParams, SparseArray sparseArray) {
        Object object;
        float f5;
        int n3;
        Object object2 = view;
        Y50 y502 = y50;
        ConstraintLayout$LayoutParams constraintLayout$LayoutParams2 = constraintLayout$LayoutParams;
        SparseArray sparseArray2 = sparseArray;
        constraintLayout$LayoutParams.a();
        y50.k0 = n3 = view.getVisibility();
        n3 = (int)(constraintLayout$LayoutParams.f0 ? 1 : 0);
        int n4 = 1;
        if (n3 != 0) {
            y50.H = n4;
            n3 = 8;
            f5 = 1.1E-44f;
            y50.k0 = n3;
        }
        y502.j0 = object2;
        n3 = object2 instanceof ConstraintHelper;
        if (n3 != 0) {
            object2 = (ConstraintHelper)((Object)object2);
            object = this.mLayoutWidget;
            n3 = (int)(object.C0 ? 1 : 0);
            object2.m(y502, n3 != 0);
        }
        int n7 = constraintLayout$LayoutParams2.d0;
        int n8 = -1;
        if (n7 != 0) {
            object2 = y502;
            object2 = (w11_0)y502;
            n3 = constraintLayout$LayoutParams2.n0;
            int n10 = constraintLayout$LayoutParams2.o0;
            float f6 = constraintLayout$LayoutParams2.p0;
            int n14 = -1082130432;
            float f7 = -1.0f;
            float f8 = f6 - f7;
            Object object3 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (object3 != false) {
                if (object3 > 0) {
                    object2.x0 = f6;
                    object2.y0 = n8;
                    object2.z0 = n8;
                }
            } else if (n3 != n8) {
                if (n3 > n8) {
                    object2.x0 = f7;
                    object2.y0 = n3;
                    object2.z0 = n8;
                }
            } else if (n10 != n8 && n10 > n8) {
                object2.x0 = f7;
                object2.y0 = n8;
                object2.z0 = n10;
            }
        } else {
            float f11;
            Object object4;
            n7 = constraintLayout$LayoutParams2.g0;
            n3 = constraintLayout$LayoutParams2.h0;
            int n15 = constraintLayout$LayoutParams2.i0;
            int n16 = constraintLayout$LayoutParams2.j0;
            int n17 = constraintLayout$LayoutParams2.k0;
            int n18 = constraintLayout$LayoutParams2.l0;
            float f12 = constraintLayout$LayoutParams2.m0;
            int n19 = constraintLayout$LayoutParams2.p;
            if (n19 != n8) {
                object4 = object2 = sparseArray2.get(n19);
                object4 = (Y50)object2;
                if (object4 != null) {
                    float f14 = constraintLayout$LayoutParams2.r;
                    int n20 = constraintLayout$LayoutParams2.q;
                    v50$a v50$a = v50$a.CENTER;
                    n17 = 0;
                    Object var28_34 = null;
                    object2 = y50;
                    object = v50$a;
                    y50.A(v50$a, (Y50)object4, v50$a, n20, 0);
                    y502.F = f14;
                }
            } else {
                float f15;
                int n21;
                v50$a v50$a;
                if (n7 != n8) {
                    object4 = object2 = sparseArray2.get(n7);
                    object4 = (Y50)object2;
                    if (object4 != null) {
                        v50$a = v50$a.LEFT;
                        n21 = constraintLayout$LayoutParams2.leftMargin;
                        object2 = y50;
                        object = v50$a;
                        y50.A(v50$a, (Y50)object4, v50$a, n21, n17);
                    }
                } else if (n3 != n8) {
                    object4 = object2 = sparseArray2.get(n3);
                    object4 = (Y50)object2;
                    if (object4 != null) {
                        object = v50$a.LEFT;
                        v50$a = v50$a.RIGHT;
                        n21 = constraintLayout$LayoutParams2.leftMargin;
                        object2 = y50;
                        y50.A((v50$a)((Object)object), (Y50)object4, v50$a, n21, n17);
                    }
                }
                if (n15 != n8) {
                    object4 = object2 = sparseArray2.get(n15);
                    object4 = (Y50)object2;
                    if (object4 != null) {
                        object = v50$a.RIGHT;
                        v50$a = v50$a.LEFT;
                        n21 = constraintLayout$LayoutParams2.rightMargin;
                        object2 = y50;
                        n17 = n18;
                        y50.A((v50$a)((Object)object), (Y50)object4, v50$a, n21, n18);
                    }
                } else if (n16 != n8) {
                    object4 = object2 = sparseArray2.get(n16);
                    object4 = (Y50)object2;
                    if (object4 != null) {
                        v50$a = v50$a.RIGHT;
                        n21 = constraintLayout$LayoutParams2.rightMargin;
                        object2 = y50;
                        object = v50$a;
                        n17 = n18;
                        y50.A(v50$a, (Y50)object4, v50$a, n21, n18);
                    }
                }
                if ((n7 = constraintLayout$LayoutParams2.i) != n8) {
                    object4 = object2 = sparseArray2.get(n7);
                    object4 = (Y50)object2;
                    if (object4 != null) {
                        v50$a = v50$a.TOP;
                        n21 = constraintLayout$LayoutParams2.topMargin;
                        n17 = constraintLayout$LayoutParams2.x;
                        object2 = y50;
                        object = v50$a;
                        y50.A(v50$a, (Y50)object4, v50$a, n21, n17);
                    }
                } else {
                    n7 = constraintLayout$LayoutParams2.j;
                    if (n7 != n8) {
                        object4 = object2 = sparseArray2.get(n7);
                        object4 = (Y50)object2;
                        if (object4 != null) {
                            object = v50$a.TOP;
                            v50$a = v50$a.BOTTOM;
                            n21 = constraintLayout$LayoutParams2.topMargin;
                            n17 = constraintLayout$LayoutParams2.x;
                            object2 = y50;
                            y50.A((v50$a)((Object)object), (Y50)object4, v50$a, n21, n17);
                        }
                    }
                }
                if ((n7 = constraintLayout$LayoutParams2.k) != n8) {
                    object4 = object2 = sparseArray2.get(n7);
                    object4 = (Y50)object2;
                    if (object4 != null) {
                        object = v50$a.BOTTOM;
                        v50$a = v50$a.TOP;
                        n21 = constraintLayout$LayoutParams2.bottomMargin;
                        n17 = constraintLayout$LayoutParams2.z;
                        object2 = y50;
                        y50.A((v50$a)((Object)object), (Y50)object4, v50$a, n21, n17);
                    }
                } else {
                    n7 = constraintLayout$LayoutParams2.l;
                    if (n7 != n8) {
                        object4 = object2 = sparseArray2.get(n7);
                        object4 = (Y50)object2;
                        if (object4 != null) {
                            v50$a = v50$a.BOTTOM;
                            n21 = constraintLayout$LayoutParams2.bottomMargin;
                            n17 = constraintLayout$LayoutParams2.z;
                            object2 = y50;
                            object = v50$a;
                            y50.A(v50$a, (Y50)object4, v50$a, n21, n17);
                        }
                    }
                }
                if ((n21 = constraintLayout$LayoutParams2.m) != n8) {
                    v50$a v50$a2 = v50$a.BASELINE;
                    object2 = this;
                    object = y50;
                    object4 = constraintLayout$LayoutParams;
                    v50$a = sparseArray;
                    this.setWidgetBaseline(y50, constraintLayout$LayoutParams, sparseArray, n21, v50$a2);
                } else {
                    n21 = constraintLayout$LayoutParams2.n;
                    if (n21 != n8) {
                        v50$a v50$a3 = v50$a.TOP;
                        object2 = this;
                        object = y50;
                        object4 = constraintLayout$LayoutParams;
                        v50$a = sparseArray;
                        this.setWidgetBaseline(y50, constraintLayout$LayoutParams, sparseArray, n21, v50$a3);
                    } else {
                        n21 = constraintLayout$LayoutParams2.o;
                        if (n21 != n8) {
                            v50$a v50$a4 = v50$a.BOTTOM;
                            object2 = this;
                            object = y50;
                            object4 = constraintLayout$LayoutParams;
                            v50$a = sparseArray;
                            this.setWidgetBaseline(y50, constraintLayout$LayoutParams, sparseArray, n21, v50$a4);
                        }
                    }
                }
                n7 = 0;
                f11 = 0.0f;
                object2 = null;
                float f16 = f12 - 0.0f;
                n3 = (int)(f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1));
                if (n3 >= 0) {
                    y502.h0 = f12;
                }
                if ((n7 = (int)((f15 = (f5 = constraintLayout$LayoutParams2.F) - 0.0f) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1))) >= 0) {
                    y502.i0 = f5;
                }
            }
            if (bl2 && ((n7 = constraintLayout$LayoutParams2.T) != n8 || (n3 = constraintLayout$LayoutParams2.U) != n8)) {
                n3 = constraintLayout$LayoutParams2.U;
                y502.c0 = n7;
                y502.d0 = n3;
            }
            n7 = (int)(constraintLayout$LayoutParams2.a0 ? 1 : 0);
            n3 = 0;
            f5 = 0.0f;
            object = null;
            n19 = -2;
            if (n7 == 0) {
                n7 = constraintLayout$LayoutParams2.width;
                if (n7 == n8) {
                    int n22;
                    n7 = (int)(constraintLayout$LayoutParams2.W ? 1 : 0);
                    if (n7 != 0) {
                        object2 = Y50$b.MATCH_CONSTRAINT;
                        y502.S((Y50$b)((Object)object2));
                    } else {
                        object2 = Y50$b.MATCH_PARENT;
                        y502.S((Y50$b)((Object)object2));
                    }
                    object2 = v50$a.LEFT;
                    object2 = y502.n((v50$a)((Object)object2));
                    object2.g = n22 = constraintLayout$LayoutParams2.leftMargin;
                    object2 = v50$a.RIGHT;
                    object2 = y502.n((v50$a)((Object)object2));
                    object2.g = n22 = constraintLayout$LayoutParams2.rightMargin;
                } else {
                    object2 = Y50$b.MATCH_CONSTRAINT;
                    y502.S((Y50$b)((Object)object2));
                    y502.W(0);
                }
            } else {
                object2 = Y50$b.FIXED;
                y502.S((Y50$b)((Object)object2));
                n7 = constraintLayout$LayoutParams2.width;
                y502.W(n7);
                n7 = constraintLayout$LayoutParams2.width;
                if (n7 == n19) {
                    object2 = Y50$b.WRAP_CONTENT;
                    y502.S((Y50$b)((Object)object2));
                }
            }
            n7 = (int)(constraintLayout$LayoutParams2.b0 ? 1 : 0);
            if (n7 == 0) {
                n7 = constraintLayout$LayoutParams2.height;
                if (n7 == n8) {
                    n7 = (int)(constraintLayout$LayoutParams2.X ? 1 : 0);
                    if (n7 != 0) {
                        object2 = Y50$b.MATCH_CONSTRAINT;
                        y502.U((Y50$b)((Object)object2));
                    } else {
                        object2 = Y50$b.MATCH_PARENT;
                        y502.U((Y50$b)((Object)object2));
                    }
                    object2 = v50$a.TOP;
                    object2 = y502.n((v50$a)((Object)object2));
                    object2.g = n19 = constraintLayout$LayoutParams2.topMargin;
                    object2 = v50$a.BOTTOM;
                    object2 = y502.n((v50$a)((Object)object2));
                    object2.g = n19 = constraintLayout$LayoutParams2.bottomMargin;
                } else {
                    object2 = Y50$b.MATCH_CONSTRAINT;
                    y502.U((Y50$b)((Object)object2));
                    y502.R(0);
                }
            } else {
                object2 = Y50$b.FIXED;
                y502.U((Y50$b)((Object)object2));
                n7 = constraintLayout$LayoutParams2.height;
                y502.R(n7);
                n7 = constraintLayout$LayoutParams2.height;
                if (n7 == n19) {
                    object2 = Y50$b.WRAP_CONTENT;
                    y502.U((Y50$b)((Object)object2));
                }
            }
            object2 = constraintLayout$LayoutParams2.G;
            y502.O((String)object2);
            f11 = constraintLayout$LayoutParams2.H;
            object4 = y502.q0;
            object4[0] = (View)f11;
            f11 = constraintLayout$LayoutParams2.I;
            object4[n4] = (View)f11;
            y502.o0 = n7 = constraintLayout$LayoutParams2.J;
            y502.p0 = n7 = constraintLayout$LayoutParams2.K;
            n7 = constraintLayout$LayoutParams2.Z;
            if (n7 >= 0) {
                n3 = 3;
                f5 = 4.2E-45f;
                if (n7 <= n3) {
                    y502.s = n7;
                }
            }
            n7 = constraintLayout$LayoutParams2.L;
            n3 = constraintLayout$LayoutParams2.N;
            n19 = constraintLayout$LayoutParams2.P;
            float f17 = constraintLayout$LayoutParams2.R;
            y502.T(n7, f17, n3, n19);
            n7 = constraintLayout$LayoutParams2.M;
            n3 = constraintLayout$LayoutParams2.O;
            n19 = constraintLayout$LayoutParams2.Q;
            f17 = constraintLayout$LayoutParams2.S;
            y502.V(n7, f17, n3, n19);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ConstraintLayout$LayoutParams;
    }

    public void dispatchDraw(Canvas canvas) {
        int n3;
        float f5;
        int n4;
        ConstraintLayout constraintLayout = this;
        ArrayList arrayList = this.mConstraintHelpers;
        if (arrayList != null && (n4 = arrayList.size()) > 0) {
            f5 = 0.0f;
            for (n3 = 0; n3 < n4; ++n3) {
                ConstraintHelper constraintHelper = (ConstraintHelper)((Object)constraintLayout.mConstraintHelpers.get(n3));
                constraintHelper.o(constraintLayout);
            }
        }
        super.dispatchDraw(canvas);
        n4 = (int)(this.isInEditMode() ? 1 : 0);
        if (n4 != 0) {
            n4 = this.getWidth();
            float f6 = n4;
            n3 = this.getHeight();
            f5 = n3;
            int n7 = this.getChildCount();
            for (int i3 = 0; i3 < n7; ++i3) {
                Object object = constraintLayout.getChildAt(i3);
                int n8 = object.getVisibility();
                int n10 = 8;
                float f7 = 1.1E-44f;
                if (n8 == n10 || (object = object.getTag()) == null || (n8 = object instanceof String) == 0) continue;
                object = (String)object;
                Object object2 = ",";
                object = ((String)object).split((String)object2);
                n8 = ((Object)object).length;
                n10 = 4;
                f7 = 5.6E-45f;
                if (n8 != n10) continue;
                object2 = object[0];
                n8 = Integer.parseInt((String)object2);
                n10 = Integer.parseInt((String)object[1]);
                Object object3 = object[2];
                int n14 = Integer.parseInt((String)object3);
                object = object[3];
                int n15 = Integer.parseInt((String)object);
                float f8 = n8;
                float f11 = 1080.0f;
                n8 = (int)(f8 / f11 * f6);
                f7 = n10;
                float f12 = 1920.0f;
                n10 = (int)(f7 / f12 * f5);
                n14 = (int)((float)n14 / f11 * f6);
                n15 = (int)((float)n15 / f12 * f5);
                Paint paint = new Paint();
                int n16 = -65536;
                f11 = 0.0f / 0.0f;
                paint.setColor(n16);
                float f14 = n8;
                float f15 = n10;
                f8 = n8 += n14;
                f12 = f14;
                float f16 = f15;
                float f17 = f15;
                f15 = f8;
                float f18 = f14;
                f14 = f16;
                canvas.drawLine(f12, f16, f8, f16, paint);
                float f19 = n10 + n15;
                f12 = f8;
                f14 = f19;
                canvas.drawLine(f8, f16, f8, f19, paint);
                f16 = f19;
                f15 = f18;
                canvas.drawLine(f8, f19, f18, f19, paint);
                f12 = f18;
                f14 = f17;
                canvas.drawLine(f18, f19, f18, f17, paint);
                n10 = -16711936;
                f7 = -1.7146522E38f;
                paint.setColor(n10);
                f16 = f17;
                f15 = f8;
                f14 = f19;
                canvas.drawLine(f18, f17, f8, f19, paint);
                f16 = f19;
                f14 = f17;
                canvas.drawLine(f18, f19, f8, f17, paint);
            }
        }
    }

    public boolean dynamicUpdateConstraints(int n3, int n4) {
        Object object = this.mModifiers;
        boolean bl2 = false;
        if (object == null) {
            return false;
        }
        View.MeasureSpec.getSize((int)n3);
        View.MeasureSpec.getSize((int)n4);
        Iterator iterator = this.mModifiers.iterator();
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            boolean bl3;
            ConstraintLayout$c constraintLayout$c = (ConstraintLayout$c)iterator.next();
            object = this.mLayoutWidget.x0.iterator();
            while (bl3 = object.hasNext()) {
                Object object2 = (View)((Y50)object.next()).j0;
                object2.getId();
                object2 = (ConstraintLayout$LayoutParams)object2.getLayoutParams();
                bl3 = constraintLayout$c.a();
                bl2 |= bl3;
            }
        }
        return bl2;
    }

    public void fillMetrics(QO1 qO1) {
        this.mLayoutWidget.D0.getClass();
    }

    public void forceLayout() {
        this.markHierarchyDirty();
        super.forceLayout();
    }

    public ConstraintLayout$LayoutParams generateDefaultLayoutParams() {
        int n3 = -2;
        ConstraintLayout$LayoutParams constraintLayout$LayoutParams = new ConstraintLayout$LayoutParams(n3, n3);
        return constraintLayout$LayoutParams;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ConstraintLayout$LayoutParams constraintLayout$LayoutParams = new ConstraintLayout$LayoutParams(layoutParams);
        return constraintLayout$LayoutParams;
    }

    public ConstraintLayout$LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = this.getContext();
        ConstraintLayout$LayoutParams constraintLayout$LayoutParams = new ConstraintLayout$LayoutParams(context, attributeSet);
        return constraintLayout$LayoutParams;
    }

    public Object getDesignInformation(int n3, Object object) {
        if (n3 == 0 && (n3 = object instanceof String) != 0) {
            object = (String)object;
            HashMap hashMap = this.mDesignIds;
            if (hashMap != null && (n3 = (int)(hashMap.containsKey(object) ? 1 : 0)) != 0) {
                return this.mDesignIds.get(object);
            }
        }
        return null;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.K0;
    }

    public String getSceneString() {
        boolean bl2;
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = this.mLayoutWidget.l;
        int n3 = -1;
        if (iterator == null) {
            int n4 = this.getId();
            if (n4 != n3) {
                iterator = this.getContext().getResources().getResourceEntryName(n4);
                object = this.mLayoutWidget;
                ((Y50)object).l = iterator;
            } else {
                iterator = this.mLayoutWidget;
                object = "parent";
                ((Y50)((Object)iterator)).l = object;
            }
        }
        iterator = this.mLayoutWidget;
        object = ((Y50)((Object)iterator)).m0;
        if (object == null) {
            object = ((Y50)((Object)iterator)).l;
            ((Y50)((Object)iterator)).m0 = object;
        }
        iterator = ((tf3_0)((Object)iterator)).x0.iterator();
        while (bl2 = iterator.hasNext()) {
            int n7;
            object = (Y50)iterator.next();
            Object object2 = (View)((Y50)object).j0;
            if (object2 == null) continue;
            String string2 = ((Y50)object).l;
            if (string2 == null && (n7 = object2.getId()) != n3) {
                string2 = this.getContext().getResources();
                object2 = string2.getResourceEntryName(n7);
                ((Y50)object).l = object2;
            }
            if ((object2 = ((Y50)object).m0) != null) continue;
            object2 = ((Y50)object).l;
            ((Y50)object).m0 = object2;
        }
        this.mLayoutWidget.s(stringBuilder);
        return stringBuilder.toString();
    }

    public View getViewById(int n3) {
        return (View)this.mChildrenByIds.get(n3);
    }

    public final Y50 getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            boolean bl2 = layoutParams instanceof ConstraintLayout$LayoutParams;
            if (bl2) {
                return ((ConstraintLayout$LayoutParams)view.getLayoutParams()).q0;
            }
            layoutParams = view.getLayoutParams();
            layoutParams = this.generateLayoutParams(layoutParams);
            view.setLayoutParams(layoutParams);
            layoutParams = view.getLayoutParams();
            bl2 = layoutParams instanceof ConstraintLayout$LayoutParams;
            if (bl2) {
                return ((ConstraintLayout$LayoutParams)view.getLayoutParams()).q0;
            }
        }
        return null;
    }

    public boolean isRtl() {
        ApplicationInfo applicationInfo = this.getContext().getApplicationInfo();
        int n3 = applicationInfo.flags;
        int n4 = 0x400000;
        if ((n3 &= n4) == 0 || (n4 = 1) != (n3 = this.getLayoutDirection())) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public void loadLayoutDescription(int n3) {
        if (n3 != 0) {
            Context context = this.getContext();
            D50 d50 = new D50(context, this, n3);
            try {
                this.mConstraintLayoutSpec = d50;
            }
            catch (Resources.NotFoundException notFoundException) {
                this.mConstraintLayoutSpec = null;
            }
        } else {
            this.mConstraintLayoutSpec = null;
        }
    }

    public void onLayout(boolean n3, int n4, int n7, int n8, int n10) {
        n3 = this.getChildCount();
        n4 = (int)(this.isInEditMode() ? 1 : 0);
        n7 = 0;
        for (n8 = 0; n8 < n3; ++n8) {
            int n14;
            int n15;
            View view = this.getChildAt(n8);
            ConstraintLayout$LayoutParams constraintLayout$LayoutParams = (ConstraintLayout$LayoutParams)view.getLayoutParams();
            Y50 y50 = constraintLayout$LayoutParams.q0;
            int n16 = view.getVisibility();
            if (n16 == (n15 = 8) && (n16 = (int)(constraintLayout$LayoutParams.d0 ? 1 : 0)) == 0 && (n16 = (int)(constraintLayout$LayoutParams.e0 ? 1 : 0)) == 0 && n4 == 0 || (n14 = constraintLayout$LayoutParams.f0) != 0) continue;
            n14 = y50.w();
            n16 = y50.x();
            n15 = y50.v() + n14;
            int n17 = y50.p() + n16;
            view.layout(n14, n16, n15, n17);
            boolean bl2 = view instanceof Placeholder;
            if (!bl2 || (view = ((Placeholder)view).getContent()) == null) continue;
            view.setVisibility(0);
            view.layout(n14, n16, n15, n17);
        }
        ArrayList arrayList = this.mConstraintHelpers;
        n3 = arrayList.size();
        if (n3 > 0) {
            while (n7 < n3) {
                ConstraintHelper constraintHelper = (ConstraintHelper)((Object)this.mConstraintHelpers.get(n7));
                constraintHelper.n();
                ++n7;
            }
        }
    }

    public void onMeasure(int n3, int n4) {
        int n7;
        int n8;
        int n10 = this.mDirtyHierarchy;
        int n14 = this.dynamicUpdateConstraints(n3, n4);
        this.mDirtyHierarchy = n10 |= n14;
        n14 = 0;
        Object object = null;
        if (n10 == 0) {
            n10 = this.getChildCount();
            for (n8 = 0; n8 < n10; ++n8) {
                View view = this.getChildAt(n8);
                n7 = view.isLayoutRequested();
                if (n7 == 0) continue;
                n10 = 1;
                this.mDirtyHierarchy = n10;
                break;
            }
        }
        this.mOnMeasureWidthMeasureSpec = n3;
        this.mOnMeasureHeightMeasureSpec = n4;
        Z50 z50 = this.mLayoutWidget;
        n8 = (int)(this.isRtl() ? 1 : 0);
        z50.C0 = n8;
        n10 = (int)(this.mDirtyHierarchy ? 1 : 0);
        if (n10 != 0) {
            this.mDirtyHierarchy = false;
            n10 = (int)(this.updateHierarchy() ? 1 : 0);
            if (n10 != 0) {
                z50 = this.mLayoutWidget;
                object = z50.y0;
                object.c(z50);
            }
        }
        this.mLayoutWidget.D0.getClass();
        z50 = this.mLayoutWidget;
        n14 = this.mOptimizationLevel;
        this.resolveSystem(z50, n14, n3, n4);
        int n15 = this.mLayoutWidget.v();
        int n16 = this.mLayoutWidget.p();
        z50 = this.mLayoutWidget;
        boolean bl2 = z50.L0;
        boolean bl3 = z50.M0;
        object = this;
        n8 = n3;
        n7 = n4;
        this.resolveMeasuredDimension(n3, n4, n15, n16, bl2, bl3);
    }

    public void onViewAdded(View view) {
        Object object;
        int n3;
        super.onViewAdded(view);
        Object object2 = this.getViewWidget(view);
        int n4 = view instanceof Guideline;
        boolean bl2 = true;
        if (n4 != 0 && (n3 = object2 instanceof w11_0) == 0) {
            object2 = (ConstraintLayout$LayoutParams)view.getLayoutParams();
            object = new w11_0();
            ((ConstraintLayout$LayoutParams)((Object)object2)).q0 = object;
            ((ConstraintLayout$LayoutParams)((Object)object2)).d0 = bl2;
            n3 = ((ConstraintLayout$LayoutParams)((Object)object2)).V;
            ((w11_0)object).a0(n3);
        }
        if ((n3 = view instanceof ConstraintHelper) != 0) {
            object2 = view;
            object2 = (ConstraintHelper)view;
            ((ConstraintHelper)((Object)object2)).q();
            ((ConstraintLayout$LayoutParams)view.getLayoutParams()).e0 = bl2;
            object = this.mConstraintHelpers;
            n4 = (int)(((ArrayList)object).contains(object2) ? 1 : 0);
            if (n4 == 0) {
                object = this.mConstraintHelpers;
                ((ArrayList)object).add(object2);
            }
        }
        object2 = this.mChildrenByIds;
        n4 = view.getId();
        object2.put(n4, (Object)view);
        this.mDirtyHierarchy = bl2;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Object object = this.mChildrenByIds;
        int n3 = view.getId();
        object.remove(n3);
        object = this.getViewWidget(view);
        this.mLayoutWidget.x0.remove(object);
        ((Y50)object).H();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int n3) {
        D50 d50;
        Context context = this.getContext();
        this.mConstraintLayoutSpec = d50 = new D50(context, this, n3);
    }

    public void removeValueModifier(ConstraintLayout$c constraintLayout$c) {
        if (constraintLayout$c == null) {
            return;
        }
        this.mModifiers.remove(constraintLayout$c);
    }

    public void requestLayout() {
        this.markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int n3, int n4, int n7, int n8, boolean bl2, boolean bl3) {
        ConstraintLayout$b constraintLayout$b = this.mMeasurer;
        int n10 = constraintLayout$b.e;
        int n14 = constraintLayout$b.d;
        n7 += n14;
        n14 = 0;
        constraintLayout$b = null;
        n3 = View.resolveSizeAndState((int)n7, (int)n3, (int)0);
        n4 = View.resolveSizeAndState((int)(n8 += n10), (int)n4, (int)0);
        n7 = 0xFFFFFF;
        n3 &= n7;
        n4 &= n7;
        n3 = Math.min(this.mMaxWidth, n3);
        n4 = Math.min(this.mMaxHeight, n4);
        n7 = 0x1000000;
        if (bl2) {
            n3 |= n7;
        }
        if (bl3) {
            n4 |= n7;
        }
        this.setMeasuredDimension(n3, n4);
        this.mLastMeasureWidth = n3;
        this.mLastMeasureHeight = n4;
    }

    public void resolveSystem(Z50 z50, int n3, int n4, int n7) {
        int n8 = View.MeasureSpec.getMode((int)n4);
        int n10 = View.MeasureSpec.getSize((int)n4);
        int n14 = View.MeasureSpec.getMode((int)n7);
        int n15 = View.MeasureSpec.getSize((int)n7);
        int n16 = this.getPaddingTop();
        int n17 = Math.max(0, n16);
        n16 = this.getPaddingBottom();
        n16 = Math.max(0, n16);
        int n18 = n17 + n16;
        int n19 = this.getPaddingWidth();
        ConstraintLayout$b constraintLayout$b = this.mMeasurer;
        constraintLayout$b.b = n17;
        constraintLayout$b.c = n16;
        constraintLayout$b.d = n19;
        constraintLayout$b.e = n18;
        constraintLayout$b.f = n4;
        constraintLayout$b.g = n7;
        n4 = this.getPaddingStart();
        n4 = Math.max(0, n4);
        n7 = this.getPaddingEnd();
        n7 = Math.max(0, n7);
        if (n4 <= 0 && n7 <= 0) {
            n4 = this.getPaddingLeft();
            n4 = Math.max(0, n4);
        } else {
            n16 = (int)(this.isRtl() ? 1 : 0);
            if (n16 != 0) {
                n4 = n7;
            }
        }
        n7 = n10 - n19;
        int n20 = n15 - n18;
        n16 = n8;
        n18 = n14;
        n19 = n20;
        this.setSelfDimensionBehaviour(z50, n8, n7, n14, n20);
        n15 = n3;
        n8 = n4;
        n14 = n17;
        z50.d0(n3, n16, n7, n18, n20, n4, n17);
    }

    public void setConstraintSet(b b2) {
        this.mConstraintSet = b2;
    }

    public void setDesignInformation(int n3, Object object, Object object2) {
        if (n3 == 0 && (n3 = object instanceof String) != 0 && (n3 = object2 instanceof Integer) != 0) {
            int n4;
            HashMap hashMap = this.mDesignIds;
            if (hashMap == null) {
                this.mDesignIds = hashMap = new HashMap();
            }
            if ((n3 = ((String)(object = (String)object)).indexOf((String)((Object)(hashMap = "/")))) != (n4 = -1)) {
                object = ((String)object).substring(++n3);
            }
            object2 = (Integer)object2;
            ((Integer)object2).intValue();
            hashMap = this.mDesignIds;
            hashMap.put(object, object2);
        }
    }

    public void setId(int n3) {
        SparseArray sparseArray = this.mChildrenByIds;
        int n4 = this.getId();
        sparseArray.remove(n4);
        super.setId(n3);
        SparseArray sparseArray2 = this.mChildrenByIds;
        int n7 = this.getId();
        sparseArray2.put(n7, (Object)this);
    }

    public void setMaxHeight(int n3) {
        int n4 = this.mMaxHeight;
        if (n3 == n4) {
            return;
        }
        this.mMaxHeight = n3;
        this.requestLayout();
    }

    public void setMaxWidth(int n3) {
        int n4 = this.mMaxWidth;
        if (n3 == n4) {
            return;
        }
        this.mMaxWidth = n3;
        this.requestLayout();
    }

    public void setMinHeight(int n3) {
        int n4 = this.mMinHeight;
        if (n3 == n4) {
            return;
        }
        this.mMinHeight = n3;
        this.requestLayout();
    }

    public void setMinWidth(int n3) {
        int n4 = this.mMinWidth;
        if (n3 == n4) {
            return;
        }
        this.mMinWidth = n3;
        this.requestLayout();
    }

    public void setOnConstraintsChanged(d60 object) {
        object = this.mConstraintLayoutSpec;
        if (object != null) {
            object.getClass();
        }
    }

    public void setOptimizationLevel(int n3) {
        this.mOptimizationLevel = n3;
        Z50 z50 = this.mLayoutWidget;
        z50.K0 = n3;
        Eu1.q = z50.f0(512);
    }

    /*
     * Unable to fully structure code
     */
    public void setSelfDimensionBehaviour(Z50 var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        var6_6 = this.mMeasurer;
        var7_7 = var6_6.e;
        var8_8 = var6_6.d;
        var9_9 = Y50$b.FIXED;
        var10_10 = this.getChildCount();
        var11_11 = 0x40000000;
        var12_12 = -1 << -1;
        if (var2_2 != var12_12) {
            if (var2_2 != 0) {
                if (var2_2 != var11_11) {
                    var13_13 = var9_9;
                    while (true) {
                        var3_3 = 0;
                        break;
                    }
                } else {
                    var2_2 = this.mMaxWidth - var8_8;
                    var3_3 = Math.min(var2_2, var3_3);
                    var13_13 = var9_9;
                }
            } else {
                var13_13 = Y50$b.WRAP_CONTENT;
                if (var10_10 != 0) ** continue;
                var3_3 = this.mMinWidth;
                var3_3 = Math.max(0, var3_3);
            }
        } else {
            var13_13 = Y50$b.WRAP_CONTENT;
            if (var10_10 == 0) {
                var3_3 = this.mMinWidth;
                var3_3 = Math.max(0, var3_3);
            }
        }
        if (var4_4 != var12_12) {
            if (var4_4 != 0) {
                if (var4_4 != var11_11) {
                    while (true) {
                        var5_5 = 0;
                        break;
                    }
                } else {
                    var4_4 = this.mMaxHeight - var7_7;
                    var5_5 = Math.min(var4_4, var5_5);
                }
            } else {
                var9_9 = Y50$b.WRAP_CONTENT;
                if (var10_10 != 0) ** continue;
                var4_4 = this.mMinHeight;
                var5_5 = Math.max(0, var4_4);
            }
        } else {
            var9_9 = Y50$b.WRAP_CONTENT;
            if (var10_10 == 0) {
                var4_4 = this.mMinHeight;
                var5_5 = Math.max(0, var4_4);
            }
        }
        var4_4 = var1_1.v();
        var10_10 = 1;
        if (var3_3 != var4_4 || var5_5 != (var4_4 = var1_1.p())) {
            var14_14 = var1_1.z0;
            var14_14.c = var10_10;
        }
        var1_1.c0 = 0;
        var1_1.d0 = 0;
        var4_4 = this.mMaxWidth - var8_8;
        var15_15 = var1_1.E;
        var15_15[0] = var4_4;
        var15_15[var10_10] = var4_4 = this.mMaxHeight - var7_7;
        var1_1.f0 = 0;
        var1_1.g0 = 0;
        var1_1.S(var13_13);
        var1_1.W(var3_3);
        var1_1.U(var9_9);
        var1_1.R(var5_5);
        var2_2 = this.mMinWidth - var8_8;
        var1_1.f0 = var2_2 < 0 ? 0 : var2_2;
        var2_2 = this.mMinHeight - var7_7;
        var1_1.g0 = var2_2 < 0 ? 0 : var2_2;
    }

    public void setState(int n3, int n4, int n7) {
        D50 d50 = this.mConstraintLayoutSpec;
        if (d50 != null) {
            float f5 = n4;
            float f6 = n7;
            d50.b(f5, f6, n3);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

