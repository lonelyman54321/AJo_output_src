/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PointF
 *  android.graphics.Rect
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 */
package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$u;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$x$b;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.t;
import com.google.android.flexbox.FlexContainer;
import com.google.android.flexbox.FlexLine;
import com.google.android.flexbox.FlexboxHelper;
import com.google.android.flexbox.FlexboxHelper$FlexLinesResult;
import com.google.android.flexbox.FlexboxLayoutManager$AnchorInfo;
import com.google.android.flexbox.FlexboxLayoutManager$LayoutParams;
import com.google.android.flexbox.FlexboxLayoutManager$LayoutState;
import com.google.android.flexbox.FlexboxLayoutManager$SavedState;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager
extends RecyclerView$o
implements FlexContainer,
RecyclerView$x$b {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = false;
    private static final String TAG = "FlexboxLayoutManager";
    private static final Rect TEMP_RECT;
    private int mAlignItems;
    private FlexboxLayoutManager$AnchorInfo mAnchorInfo;
    private final Context mContext;
    private int mDirtyPosition;
    private int mFlexDirection;
    private List mFlexLines;
    private FlexboxHelper$FlexLinesResult mFlexLinesResult;
    private int mFlexWrap;
    private final FlexboxHelper mFlexboxHelper;
    private boolean mFromBottomToTop;
    private boolean mIsRtl;
    private int mJustifyContent;
    private int mLastHeight;
    private int mLastWidth;
    private FlexboxLayoutManager$LayoutState mLayoutState;
    private int mMaxLine;
    private t mOrientationHelper;
    private View mParent;
    private FlexboxLayoutManager$SavedState mPendingSavedState;
    private int mPendingScrollPosition;
    private int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private RecyclerView$u mRecycler;
    private RecyclerView$y mState;
    private t mSubOrientationHelper;
    private SparseArray mViewCache;

    static {
        Rect rect;
        TEMP_RECT = rect = new Rect();
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    public FlexboxLayoutManager(Context context, int n3) {
        this(context, n3, 1);
    }

    public FlexboxLayoutManager(Context context, int n3, int n4) {
        FlexboxHelper$FlexLinesResult flexboxHelper$FlexLinesResult;
        int n7;
        int n8;
        this.mMaxLine = n8 = -1;
        Object object = new ArrayList();
        this.mFlexLines = object;
        this.mFlexboxHelper = object = new FlexboxHelper(this);
        this.mAnchorInfo = object = new FlexboxLayoutManager$AnchorInfo(this, null);
        this.mPendingScrollPosition = n8;
        this.mPendingScrollPositionOffset = n7 = -1 << -1;
        this.mLastWidth = n7;
        this.mLastHeight = n7;
        object = new SparseArray();
        this.mViewCache = object;
        this.mDirtyPosition = n8;
        this.mFlexLinesResult = flexboxHelper$FlexLinesResult = new FlexboxHelper$FlexLinesResult();
        this.setFlexDirection(n3);
        this.setFlexWrap(n4);
        this.setAlignItems(4);
        this.mContext = context;
    }

    public FlexboxLayoutManager(Context context, AttributeSet object, int n3, int n4) {
        FlexboxHelper$FlexLinesResult flexboxHelper$FlexLinesResult;
        int n7;
        int n8;
        this.mMaxLine = n8 = -1;
        Object object2 = new ArrayList();
        this.mFlexLines = object2;
        this.mFlexboxHelper = object2 = new FlexboxHelper(this);
        this.mAnchorInfo = object2 = new FlexboxLayoutManager$AnchorInfo(this, null);
        this.mPendingScrollPosition = n8;
        this.mPendingScrollPositionOffset = n7 = -1 << -1;
        this.mLastWidth = n7;
        this.mLastHeight = n7;
        object2 = new SparseArray();
        this.mViewCache = object2;
        this.mDirtyPosition = n8;
        this.mFlexLinesResult = flexboxHelper$FlexLinesResult = new FlexboxHelper$FlexLinesResult();
        object = RecyclerView$o.getProperties(context, object, n3, n4);
        n3 = object.a;
        n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                int n10 = object.c;
                if (n10 != 0) {
                    n10 = 3;
                    this.setFlexDirection(n10);
                } else {
                    n10 = 2;
                    this.setFlexDirection(n10);
                }
            }
        } else {
            boolean bl2 = object.c;
            if (bl2) {
                this.setFlexDirection(n4);
            } else {
                bl2 = false;
                object = null;
                this.setFlexDirection(0);
            }
        }
        this.setFlexWrap(n4);
        this.setAlignItems(4);
        this.mContext = context;
    }

    public static /* synthetic */ int access$2800(FlexboxLayoutManager flexboxLayoutManager) {
        return flexboxLayoutManager.mFlexWrap;
    }

    public static /* synthetic */ int access$2900(FlexboxLayoutManager flexboxLayoutManager) {
        return flexboxLayoutManager.mFlexDirection;
    }

    public static /* synthetic */ boolean access$3000(FlexboxLayoutManager flexboxLayoutManager) {
        return flexboxLayoutManager.mIsRtl;
    }

    public static /* synthetic */ t access$3100(FlexboxLayoutManager flexboxLayoutManager) {
        return flexboxLayoutManager.mOrientationHelper;
    }

    public static /* synthetic */ t access$3200(FlexboxLayoutManager flexboxLayoutManager) {
        return flexboxLayoutManager.mSubOrientationHelper;
    }

    public static /* synthetic */ FlexboxHelper access$3300(FlexboxLayoutManager flexboxLayoutManager) {
        return flexboxLayoutManager.mFlexboxHelper;
    }

    public static /* synthetic */ List access$3400(FlexboxLayoutManager flexboxLayoutManager) {
        return flexboxLayoutManager.mFlexLines;
    }

    private boolean canViewBeRecycledFromEnd(View view, int n3) {
        t t3;
        int n4 = this.isMainAxisDirectionHorizontal();
        boolean bl2 = false;
        if (n4 == 0 && (n4 = this.mIsRtl) != 0) {
            t t4 = this.mOrientationHelper;
            int n7 = t4.b(view);
            if (n7 <= n3) {
                bl2 = true;
            }
            return bl2;
        }
        int n8 = this.mOrientationHelper.e(view);
        if (n8 >= (n4 = (t3 = this.mOrientationHelper).f() - n3)) {
            bl2 = true;
        }
        return bl2;
    }

    private boolean canViewBeRecycledFromStart(View view, int n3) {
        int n4 = this.isMainAxisDirectionHorizontal();
        boolean bl2 = false;
        if (n4 == 0 && (n4 = this.mIsRtl) != 0) {
            t t3 = this.mOrientationHelper;
            n4 = t3.f();
            t t4 = this.mOrientationHelper;
            int n7 = t4.e(view);
            if ((n4 -= n7) <= n3) {
                bl2 = true;
            }
            return bl2;
        }
        t t7 = this.mOrientationHelper;
        int n8 = t7.b(view);
        if (n8 <= n3) {
            bl2 = true;
        }
        return bl2;
    }

    private void clearFlexLines() {
        this.mFlexLines.clear();
        FlexboxLayoutManager$AnchorInfo.access$800(this.mAnchorInfo);
        FlexboxLayoutManager$AnchorInfo.access$2402(this.mAnchorInfo, 0);
    }

    private int computeScrollExtent(RecyclerView$y recyclerView$y) {
        int n3 = this.getChildCount();
        if (n3 == 0) {
            return 0;
        }
        n3 = recyclerView$y.b();
        this.ensureOrientationHelper();
        View view = this.findFirstReferenceChild(n3);
        View view2 = this.findLastReferenceChild(n3);
        int n4 = recyclerView$y.b();
        if (n4 != 0 && view != null && view2 != null) {
            n4 = this.mOrientationHelper.b(view2);
            n3 = this.mOrientationHelper.e(view);
            return Math.min(this.mOrientationHelper.l(), n4 -= n3);
        }
        return 0;
    }

    private int computeScrollOffset(RecyclerView$y recyclerView$y) {
        int n3 = this.getChildCount();
        int n4 = 0;
        float f5 = 0.0f;
        if (n3 == 0) {
            return 0;
        }
        n3 = recyclerView$y.b();
        View view = this.findFirstReferenceChild(n3);
        View view2 = this.findLastReferenceChild(n3);
        int n7 = recyclerView$y.b();
        if (n7 != 0 && view != null && view2 != null) {
            int n8;
            n7 = this.getPosition(view);
            int n10 = this.getPosition(view2);
            n3 = this.mOrientationHelper.b(view2);
            int n14 = this.mOrientationHelper.e(view);
            n3 = Math.abs(n3 - n14);
            int[] nArray = this.mFlexboxHelper.mIndexToFlexLine;
            if ((n7 = nArray[n7]) != 0 && n7 != (n8 = -1)) {
                n4 = nArray[n10] - n7 + 1;
                float f6 = n3;
                f5 = n4;
                float f7 = (float)n7 * (f6 /= f5);
                n3 = this.mOrientationHelper.k();
                n4 = this.mOrientationHelper.e(view);
                f6 = n3 - n4;
                return Math.round(f7 + f6);
            }
        }
        return 0;
    }

    private int computeScrollRange(RecyclerView$y recyclerView$y) {
        int n3 = this.getChildCount();
        int n4 = 0;
        float f5 = 0.0f;
        if (n3 == 0) {
            return 0;
        }
        n3 = recyclerView$y.b();
        View view = this.findFirstReferenceChild(n3);
        View view2 = this.findLastReferenceChild(n3);
        int n7 = recyclerView$y.b();
        if (n7 != 0 && view != null && view2 != null) {
            n4 = this.findFirstVisibleItemPosition();
            n7 = this.findLastVisibleItemPosition();
            n3 = this.mOrientationHelper.b(view2);
            int n8 = this.mOrientationHelper.e(view);
            n3 = Math.abs(n3 - n8);
            n7 = n7 - n4 + 1;
            float f6 = n3;
            f5 = n7;
            float f7 = recyclerView$y.b();
            return (int)((f6 /= f5) * f7);
        }
        return 0;
    }

    private void ensureLayoutState() {
        FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState = this.mLayoutState;
        if (flexboxLayoutManager$LayoutState == null) {
            this.mLayoutState = flexboxLayoutManager$LayoutState = new FlexboxLayoutManager$LayoutState(null);
        }
    }

    private void ensureOrientationHelper() {
        t t3 = this.mOrientationHelper;
        if (t3 != null) {
            return;
        }
        int n3 = this.isMainAxisDirectionHorizontal();
        if (n3 != 0) {
            n3 = this.mFlexWrap;
            if (n3 == 0) {
                this.mOrientationHelper = t3 = new t(this);
                this.mSubOrientationHelper = t3 = new t(this);
            } else {
                this.mOrientationHelper = t3 = new t(this);
                this.mSubOrientationHelper = t3 = new t(this);
            }
        } else {
            n3 = this.mFlexWrap;
            if (n3 == 0) {
                this.mOrientationHelper = t3 = new t(this);
                this.mSubOrientationHelper = t3 = new t(this);
            } else {
                this.mOrientationHelper = t3 = new t(this);
                this.mSubOrientationHelper = t3 = new t(this);
            }
        }
    }

    private int fill(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y, FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        Object object;
        int n3;
        int n4;
        int n7 = FlexboxLayoutManager$LayoutState.access$2000(flexboxLayoutManager$LayoutState);
        if (n7 != (n4 = -1 << -1)) {
            n7 = FlexboxLayoutManager$LayoutState.access$1200(flexboxLayoutManager$LayoutState);
            if (n7 < 0) {
                n7 = FlexboxLayoutManager$LayoutState.access$1200(flexboxLayoutManager$LayoutState);
                FlexboxLayoutManager$LayoutState.access$2012(flexboxLayoutManager$LayoutState, n7);
            }
            this.recycleByLayoutState(recyclerView$u, flexboxLayoutManager$LayoutState);
        }
        n7 = FlexboxLayoutManager$LayoutState.access$1200(flexboxLayoutManager$LayoutState);
        boolean bl2 = this.isMainAxisDirectionHorizontal();
        int n8 = 0;
        for (int i3 = FlexboxLayoutManager$LayoutState.access$1200(flexboxLayoutManager$LayoutState); (i3 > 0 || (n3 = FlexboxLayoutManager$LayoutState.access$1100((FlexboxLayoutManager$LayoutState)(object = this.mLayoutState))) != 0) && (n3 = FlexboxLayoutManager$LayoutState.access$2100(flexboxLayoutManager$LayoutState, recyclerView$y, (List)(object = this.mFlexLines))) != 0; i3 -= n3) {
            int n10;
            object = this.mFlexLines;
            int n14 = FlexboxLayoutManager$LayoutState.access$1500(flexboxLayoutManager$LayoutState);
            object = (FlexLine)object.get(n14);
            n14 = ((FlexLine)object).mFirstIndex;
            FlexboxLayoutManager$LayoutState.access$2202(flexboxLayoutManager$LayoutState, n14);
            n14 = this.layoutFlexLine((FlexLine)object, flexboxLayoutManager$LayoutState);
            n8 += n14;
            if (!bl2 && (n14 = (int)(this.mIsRtl ? 1 : 0)) != 0) {
                n14 = ((FlexLine)object).getCrossSize();
                n10 = FlexboxLayoutManager$LayoutState.access$2300(flexboxLayoutManager$LayoutState);
                FlexboxLayoutManager$LayoutState.access$1020(flexboxLayoutManager$LayoutState, n14 *= n10);
            } else {
                n14 = ((FlexLine)object).getCrossSize();
                n10 = FlexboxLayoutManager$LayoutState.access$2300(flexboxLayoutManager$LayoutState);
                FlexboxLayoutManager$LayoutState.access$1012(flexboxLayoutManager$LayoutState, n14 *= n10);
            }
            n3 = ((FlexLine)object).getCrossSize();
        }
        FlexboxLayoutManager$LayoutState.access$1220(flexboxLayoutManager$LayoutState, n8);
        int n15 = FlexboxLayoutManager$LayoutState.access$2000(flexboxLayoutManager$LayoutState);
        if (n15 != n4) {
            FlexboxLayoutManager$LayoutState.access$2012(flexboxLayoutManager$LayoutState, n8);
            n15 = FlexboxLayoutManager$LayoutState.access$1200(flexboxLayoutManager$LayoutState);
            if (n15 < 0) {
                n15 = FlexboxLayoutManager$LayoutState.access$1200(flexboxLayoutManager$LayoutState);
                FlexboxLayoutManager$LayoutState.access$2012(flexboxLayoutManager$LayoutState, n15);
            }
            this.recycleByLayoutState(recyclerView$u, flexboxLayoutManager$LayoutState);
        }
        int n16 = FlexboxLayoutManager$LayoutState.access$1200(flexboxLayoutManager$LayoutState);
        return n7 - n16;
    }

    private View findFirstReferenceChild(int n3) {
        int n4 = this.getChildCount();
        View view = this.findReferenceChild(0, n4, n3);
        FlexLine flexLine = null;
        if (view == null) {
            return null;
        }
        n4 = this.getPosition(view);
        int[] nArray = this.mFlexboxHelper.mIndexToFlexLine;
        int n7 = -1;
        if ((n4 = nArray[n4]) == n7) {
            return null;
        }
        flexLine = (FlexLine)this.mFlexLines.get(n4);
        return this.findFirstReferenceViewInLine(view, flexLine);
    }

    private View findFirstReferenceViewInLine(View view, FlexLine flexLine) {
        boolean bl2 = this.isMainAxisDirectionHorizontal();
        int n3 = flexLine.mItemCount;
        for (int i3 = 1; i3 < n3; ++i3) {
            t t3;
            t t4;
            int n4;
            int n7;
            View view2 = this.getChildAt(i3);
            if (view2 == null || (n7 = view2.getVisibility()) == (n4 = 8) || !((n7 = (int)(this.mIsRtl ? 1 : 0)) != 0 && !bl2 ? (n7 = (t4 = this.mOrientationHelper).b(view)) < (n4 = (t3 = this.mOrientationHelper).b(view2)) : (n7 = (t4 = this.mOrientationHelper).e(view)) > (n4 = (t3 = this.mOrientationHelper).e(view2)))) continue;
            view = view2;
        }
        return view;
    }

    private View findLastReferenceChild(int n3) {
        int n4;
        int n7 = this.getChildCount() + -1;
        View view = this.findReferenceChild(n7, n4 = -1, n3);
        if (view == null) {
            return null;
        }
        n7 = this.getPosition(view);
        n7 = this.mFlexboxHelper.mIndexToFlexLine[n7];
        FlexLine flexLine = (FlexLine)this.mFlexLines.get(n7);
        return this.findLastReferenceViewInLine(view, flexLine);
    }

    private View findLastReferenceViewInLine(View object, FlexLine flexLine) {
        boolean bl2 = this.isMainAxisDirectionHorizontal();
        int n3 = this.getChildCount();
        int n4 = flexLine.mItemCount;
        n3 = n3 - n4 + -1;
        for (int i3 = this.getChildCount() + -2; i3 > n3; i3 += -1) {
            t t3;
            t t4;
            int n7;
            int n8;
            flexLine = this.getChildAt(i3);
            if (flexLine == null || (n8 = flexLine.getVisibility()) == (n7 = 8) || !((n8 = (int)(this.mIsRtl ? 1 : 0)) != 0 && !bl2 ? (n8 = (t4 = this.mOrientationHelper).e((View)object)) > (n7 = (t3 = this.mOrientationHelper).e((View)flexLine)) : (n8 = (t4 = this.mOrientationHelper).b((View)object)) < (n7 = (t3 = this.mOrientationHelper).b((View)flexLine)))) continue;
            object = flexLine;
        }
        return object;
    }

    private View findOneVisibleChild(int n3, int n4, boolean bl2) {
        int n7 = n4 > n3 ? 1 : -1;
        while (n3 != n4) {
            View view = this.getChildAt(n3);
            boolean bl3 = this.isViewVisible(view, bl2);
            if (bl3) {
                return view;
            }
            n3 += n7;
        }
        return null;
    }

    private View findReferenceChild(int n3, int n4, int n7) {
        this.ensureOrientationHelper();
        this.ensureLayoutState();
        t t3 = this.mOrientationHelper;
        int n8 = t3.k();
        t t4 = this.mOrientationHelper;
        int n10 = t4.g();
        int n14 = n4 > n3 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (n3 != n4) {
            int n15;
            View view3 = this.getChildAt(n3);
            if (view3 != null && (n15 = this.getPosition(view3)) >= 0 && n15 < n7) {
                Object object = (RecyclerView$LayoutParams)view3.getLayoutParams();
                n15 = (int)(object.isItemRemoved() ? 1 : 0);
                if (n15 != 0) {
                    if (view2 == null) {
                        view2 = view3;
                    }
                } else {
                    object = this.mOrientationHelper;
                    n15 = ((t)object).e(view3);
                    if (n15 >= n8 && (n15 = ((t)(object = this.mOrientationHelper)).b(view3)) <= n10) {
                        return view3;
                    }
                    if (view == null) {
                        view = view3;
                    }
                }
            }
            n3 += n14;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    private int fixLayoutEndGap(int n3, RecyclerView$u recyclerView$u, RecyclerView$y object, boolean bl2) {
        block7: {
            int n4;
            int n7;
            block6: {
                int n8;
                block4: {
                    block5: {
                        n8 = this.isMainAxisDirectionHorizontal();
                        if (n8 != 0 || (n8 = this.mIsRtl) == 0) break block4;
                        t t3 = this.mOrientationHelper;
                        n8 = t3.k();
                        if ((n8 = n3 - n8) <= 0) break block5;
                        n7 = this.handleScrollingMainOrientation(n8, recyclerView$u, (RecyclerView$y)object);
                        break block6;
                    }
                    return 0;
                }
                t t4 = this.mOrientationHelper;
                n8 = t4.g() - n3;
                if (n8 <= 0) break block7;
                n8 = -n8;
                n7 = -this.handleScrollingMainOrientation(n8, recyclerView$u, (RecyclerView$y)object);
            }
            if (bl2 && (n4 = ((t)(object = this.mOrientationHelper)).g() - (n3 += n7)) > 0) {
                this.mOrientationHelper.p(n4);
                return n4 + n7;
            }
            return n7;
        }
        return 0;
    }

    private int fixLayoutStartGap(int n3, RecyclerView$u recyclerView$u, RecyclerView$y object, boolean bl2) {
        block7: {
            int n4;
            int n7;
            block6: {
                int n8;
                block4: {
                    block5: {
                        n8 = this.isMainAxisDirectionHorizontal();
                        if (n8 != 0 || (n8 = this.mIsRtl) == 0) break block4;
                        t t4 = this.mOrientationHelper;
                        n8 = t4.g() - n3;
                        if (n8 <= 0) break block5;
                        n8 = -n8;
                        n7 = this.handleScrollingMainOrientation(n8, recyclerView$u, (RecyclerView$y)object);
                        break block6;
                    }
                    return 0;
                }
                t t3 = this.mOrientationHelper;
                n8 = t3.k();
                if ((n8 = n3 - n8) <= 0) break block7;
                n7 = -this.handleScrollingMainOrientation(n8, recyclerView$u, (RecyclerView$y)object);
            }
            n3 += n7;
            if (bl2 && (n3 -= (n4 = ((t)(object = this.mOrientationHelper)).k())) > 0) {
                object = this.mOrientationHelper;
                int n10 = -n3;
                ((t)object).p(n10);
                n7 -= n3;
            }
            return n7;
        }
        return 0;
    }

    private int getChildBottom(View view) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        int n3 = this.getDecoratedBottom(view);
        int n4 = recyclerView$LayoutParams.bottomMargin;
        return n3 + n4;
    }

    private View getChildClosestToStart() {
        return this.getChildAt(0);
    }

    private int getChildLeft(View view) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        int n3 = this.getDecoratedLeft(view);
        int n4 = recyclerView$LayoutParams.leftMargin;
        return n3 - n4;
    }

    private int getChildRight(View view) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        int n3 = this.getDecoratedRight(view);
        int n4 = recyclerView$LayoutParams.rightMargin;
        return n3 + n4;
    }

    private int getChildTop(View view) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        int n3 = this.getDecoratedTop(view);
        int n4 = recyclerView$LayoutParams.topMargin;
        return n3 - n4;
    }

    private int handleScrollingMainOrientation(int n3, RecyclerView$u object, RecyclerView$y recyclerView$y) {
        int n4 = this.getChildCount();
        if (n4 != 0 && n3 != 0) {
            this.ensureOrientationHelper();
            FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState = this.mLayoutState;
            int n7 = 1;
            FlexboxLayoutManager$LayoutState.access$502(flexboxLayoutManager$LayoutState, n7 != 0);
            n4 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0);
            if (n4 == 0 && (n4 = (int)(this.mIsRtl ? 1 : 0)) != 0) {
                n4 = 1;
            } else {
                n4 = 0;
                flexboxLayoutManager$LayoutState = null;
            }
            int n8 = -1;
            if (!(n4 != 0 ? n3 < 0 : n3 > 0)) {
                n7 = -1;
            }
            n8 = Math.abs(n3);
            this.updateLayoutState(n7, n8);
            FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState2 = this.mLayoutState;
            int n10 = FlexboxLayoutManager$LayoutState.access$2000(flexboxLayoutManager$LayoutState2);
            FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState3 = this.mLayoutState;
            int n14 = this.fill((RecyclerView$u)object, recyclerView$y, flexboxLayoutManager$LayoutState3);
            if ((n10 += n14) < 0) {
                return 0;
            }
            if (n4 != 0) {
                if (n8 > n10) {
                    n3 = -n7 * n10;
                }
            } else if (n8 > n10) {
                n3 = n7 * n10;
            }
            object = this.mOrientationHelper;
            int n15 = -n3;
            ((t)object).p(n15);
            FlexboxLayoutManager$LayoutState.access$2702(this.mLayoutState, n3);
            return n3;
        }
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int handleScrollingSubOrientation(int n3) {
        int n4 = this.getChildCount();
        if (n4 == 0) return 0;
        if (n3 == 0) return 0;
        this.ensureOrientationHelper();
        n4 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0);
        View view = this.mParent;
        int n7 = n4 != 0 ? view.getWidth() : view.getHeight();
        n4 = n4 != 0 ? this.getWidth() : this.getHeight();
        int n8 = this.getLayoutDirection();
        int n10 = 1;
        if (n8 == n10) {
            n8 = Math.abs(n3);
            if (n3 < 0) {
                FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo = this.mAnchorInfo;
                n3 = FlexboxLayoutManager$AnchorInfo.access$2400(flexboxLayoutManager$AnchorInfo);
                n4 = n4 + n3 - n7;
                n3 = Math.min(n4, n8);
                return -n3;
            } else {
                FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo = this.mAnchorInfo;
                n4 = FlexboxLayoutManager$AnchorInfo.access$2400(flexboxLayoutManager$AnchorInfo) + n3;
                if (n4 <= 0) return n3;
                FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo2 = this.mAnchorInfo;
                n3 = FlexboxLayoutManager$AnchorInfo.access$2400(flexboxLayoutManager$AnchorInfo2);
            }
            return -n3;
        }
        if (n3 > 0) {
            FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo = this.mAnchorInfo;
            n8 = FlexboxLayoutManager$AnchorInfo.access$2400(flexboxLayoutManager$AnchorInfo);
            n4 = n4 - n8 - n7;
            return Math.min(n4, n3);
        }
        FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo = this.mAnchorInfo;
        n4 = FlexboxLayoutManager$AnchorInfo.access$2400(flexboxLayoutManager$AnchorInfo) + n3;
        if (n4 >= 0) return n3;
        FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo3 = this.mAnchorInfo;
        n3 = FlexboxLayoutManager$AnchorInfo.access$2400(flexboxLayoutManager$AnchorInfo3);
        return -n3;
    }

    private static boolean isMeasurementUpToDate(int n3, int n4, int n7) {
        int n8 = View.MeasureSpec.getMode((int)n4);
        n4 = View.MeasureSpec.getSize((int)n4);
        boolean bl2 = false;
        if (n7 > 0 && n3 != n7) {
            return false;
        }
        n7 = -1 << -1;
        boolean bl3 = true;
        if (n8 != n7) {
            if (n8 != 0) {
                n7 = 0x40000000;
                if (n8 != n7) {
                    return false;
                }
                if (n4 == n3) {
                    bl2 = true;
                }
                return bl2;
            }
            return bl3;
        }
        if (n4 >= n3) {
            bl2 = true;
        }
        return bl2;
    }

    private boolean isViewVisible(View view, boolean bl2) {
        int n3 = this.getPaddingLeft();
        int n4 = this.getPaddingTop();
        int n7 = this.getWidth();
        int n8 = this.getPaddingRight();
        n7 -= n8;
        n8 = this.getHeight();
        int n10 = this.getPaddingBottom();
        n8 -= n10;
        n10 = this.getChildLeft(view);
        int n14 = this.getChildTop(view);
        int n15 = this.getChildRight(view);
        int n16 = this.getChildBottom(view);
        boolean bl3 = true;
        boolean bl4 = n3 <= n10 && n7 >= n15;
        n3 = n10 < n7 && n15 < n3 ? 0 : 1;
        n7 = n4 <= n14 && n8 >= n16 ? 1 : 0;
        if (n14 < n8 && n16 < n4) {
            n16 = 0;
            view = null;
        } else {
            n16 = 1;
        }
        if (bl2) {
            if (!bl4 || n7 == 0) {
                bl3 = false;
            }
            return bl3;
        }
        if (n3 == 0 || n16 == 0) {
            bl3 = false;
        }
        return bl3;
    }

    private int layoutFlexLine(FlexLine flexLine, FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        boolean bl2 = this.isMainAxisDirectionHorizontal();
        if (bl2) {
            return this.layoutFlexLineMainAxisHorizontal(flexLine, flexboxLayoutManager$LayoutState);
        }
        return this.layoutFlexLineMainAxisVertical(flexLine, flexboxLayoutManager$LayoutState);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private int layoutFlexLineMainAxisHorizontal(FlexLine flexLine, FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        float f5;
        float f6;
        float f7;
        int n3;
        int n4;
        ViewGroup.LayoutParams layoutParams;
        int n7;
        int n8;
        float f8;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        FlexboxLayoutManager flexboxLayoutManager;
        block20: {
            block24: {
                block21: {
                    FlexLine flexLine2;
                    block22: {
                        float f11;
                        block23: {
                            float f12;
                            flexboxLayoutManager = this;
                            flexLine2 = flexLine;
                            n18 = this.getPaddingLeft();
                            n17 = this.getPaddingRight();
                            n16 = this.getWidth();
                            n15 = FlexboxLayoutManager$LayoutState.access$1000(flexboxLayoutManager$LayoutState);
                            n14 = FlexboxLayoutManager$LayoutState.access$2300(flexboxLayoutManager$LayoutState);
                            n10 = -1;
                            f8 = 0.0f / 0.0f;
                            if (n14 == n10) {
                                n14 = flexLine.mCrossSize;
                                n15 -= n14;
                            }
                            n8 = n15;
                            n7 = FlexboxLayoutManager$LayoutState.access$2200(flexboxLayoutManager$LayoutState);
                            n15 = flexboxLayoutManager.mJustifyContent;
                            n14 = 0;
                            layoutParams = null;
                            n4 = 1;
                            if (n15 == 0) break block21;
                            if (n15 == n4) break block22;
                            n10 = 2;
                            f8 = 2.8E-45f;
                            n3 = 0x40000000;
                            f11 = 2.0f;
                            if (n15 == n10) break block23;
                            n10 = 3;
                            f8 = 4.2E-45f;
                            if (n15 != n10) {
                                n10 = 4;
                                f8 = 5.6E-45f;
                                if (n15 != n10) {
                                    n10 = 5;
                                    f8 = 7.0E-45f;
                                    if (n15 != n10) {
                                        StringBuilder stringBuilder = new StringBuilder("Invalid justifyContent is set: ");
                                        n16 = flexboxLayoutManager.mJustifyContent;
                                        stringBuilder.append(n16);
                                        String string2 = stringBuilder.toString();
                                        IllegalStateException illegalStateException = new IllegalStateException(string2);
                                        throw illegalStateException;
                                    }
                                    n15 = flexLine2.mItemCount;
                                    if (n15 != 0) {
                                        n10 = flexLine2.mMainSize;
                                        n10 = n16 - n10;
                                        f8 = n10;
                                        f12 = n15 += n4;
                                        f8 /= f12;
                                    } else {
                                        n10 = 0;
                                        f8 = 0.0f;
                                    }
                                    f7 = (float)n18 + f8;
                                    f6 = (float)(n16 -= n17) - f8;
                                    break block20;
                                } else {
                                    n15 = flexLine2.mItemCount;
                                    if (n15 != 0) {
                                        n10 = flexLine2.mMainSize;
                                        n10 = n16 - n10;
                                        f8 = n10;
                                        f12 = n15;
                                        f8 /= f12;
                                    } else {
                                        n10 = 0;
                                        f8 = 0.0f;
                                    }
                                    f7 = n18;
                                    f12 = f8 / f11;
                                    f7 += f12;
                                    f6 = (float)(n16 -= n17) - f12;
                                }
                                break block20;
                            } else {
                                f7 = n18;
                                n15 = flexLine2.mItemCount;
                                if (n15 != n4) {
                                    f12 = n15 -= n4;
                                } else {
                                    n15 = 1065353216;
                                    f12 = 1.0f;
                                }
                                n10 = flexLine2.mMainSize;
                                n10 = n16 - n10;
                                f8 = (float)n10 / f12;
                                f6 = n16 -= n17;
                            }
                            break block20;
                        }
                        f7 = n18;
                        n15 = flexLine2.mMainSize;
                        n10 = n16 - n15;
                        f8 = (float)n10 / f11;
                        f7 += f8;
                        n17 = n16 - n17;
                        f6 = n17;
                        f5 = (float)(n16 -= n15) / f11;
                        f6 -= f5;
                        break block24;
                    }
                    n15 = flexLine2.mMainSize;
                    n16 = n16 - n15 + n17;
                    f6 = n16;
                    f7 = n15 -= n18;
                    n10 = 0;
                    f8 = 0.0f;
                    float f14 = f6;
                    f6 = f7;
                    f7 = f14;
                    break block20;
                }
                f7 = n18;
                f6 = n16 -= n17;
            }
            n10 = 0;
            f8 = 0.0f;
        }
        f5 = FlexboxLayoutManager$AnchorInfo.access$2400(flexboxLayoutManager.mAnchorInfo);
        f7 -= f5;
        f5 = FlexboxLayoutManager$AnchorInfo.access$2400(flexboxLayoutManager.mAnchorInfo);
        f6 -= f5;
        float f15 = Math.max(f8, 0.0f);
        int n19 = flexLine.getItemCount();
        n16 = 0;
        f5 = 0.0f;
        Object object = null;
        int n20 = n7;
        while (true) {
            if (n20 >= (n15 = n7 + n19)) {
                n18 = FlexboxLayoutManager$LayoutState.access$2300(flexboxLayoutManager.mLayoutState);
                FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState2 = flexboxLayoutManager$LayoutState;
                FlexboxLayoutManager$LayoutState.access$1512(flexboxLayoutManager$LayoutState, n18);
                return flexLine.getCrossSize();
            }
            View view = flexboxLayoutManager.getFlexItemAt(n20);
            if (view != null) {
                void var38_44;
                FlexboxHelper flexboxHelper;
                Object object2;
                n15 = FlexboxLayoutManager$LayoutState.access$2300(flexboxLayoutManager$LayoutState);
                if (n15 == n4) {
                    object2 = TEMP_RECT;
                    flexboxLayoutManager.calculateItemDecorationsForChild(view, (Rect)object2);
                    flexboxLayoutManager.addView(view);
                } else {
                    object2 = TEMP_RECT;
                    flexboxLayoutManager.calculateItemDecorationsForChild(view, (Rect)object2);
                    flexboxLayoutManager.addView(view, n16);
                }
                int n21 = ++n16;
                object = flexboxLayoutManager.mFlexboxHelper;
                long l2 = ((FlexboxHelper)object).mMeasureSpecCache[n20];
                n16 = ((FlexboxHelper)object).extractLowerInt(l2);
                object2 = flexboxLayoutManager.mFlexboxHelper;
                n15 = ((FlexboxHelper)object2).extractHigherInt(l2);
                ViewGroup.LayoutParams layoutParams2 = layoutParams = view.getLayoutParams();
                FlexboxLayoutManager$LayoutParams flexboxLayoutManager$LayoutParams = (FlexboxLayoutManager$LayoutParams)layoutParams;
                n14 = (int)(flexboxLayoutManager.shouldMeasureChild(view, n16, n15, flexboxLayoutManager$LayoutParams) ? 1 : 0);
                if (n14 != 0) {
                    view.measure(n16, n15);
                }
                n16 = flexboxLayoutManager$LayoutParams.leftMargin;
                n15 = flexboxLayoutManager.getLeftDecorationWidth(view) + n16;
                f5 = n15;
                float f16 = f7 + f5;
                n18 = flexboxLayoutManager$LayoutParams.rightMargin;
                n16 = flexboxLayoutManager.getRightDecorationWidth(view) + n18;
                f7 = n16;
                float f17 = f6 - f7;
                n14 = flexboxLayoutManager.getTopDecorationHeight(view) + n8;
                n18 = (int)(flexboxLayoutManager.mIsRtl ? 1 : 0);
                if (n18 != 0) {
                    flexboxHelper = flexboxLayoutManager.mFlexboxHelper;
                    n17 = Math.round(f17);
                    n16 = view.getMeasuredWidth();
                    n15 = n17 - n16;
                    n10 = Math.round(f17);
                    n17 = view.getMeasuredHeight();
                    int n22 = n17 + n14;
                    View view2 = view;
                    object = flexLine;
                    FlexboxLayoutManager$LayoutParams flexboxLayoutManager$LayoutParams2 = flexboxLayoutManager$LayoutParams;
                    n3 = n22;
                    flexboxHelper.layoutSingleChildHorizontal(view, flexLine, n15, n14, n10, n22);
                } else {
                    FlexboxLayoutManager$LayoutParams flexboxLayoutManager$LayoutParams3 = flexboxLayoutManager$LayoutParams;
                    flexboxHelper = flexboxLayoutManager.mFlexboxHelper;
                    n15 = Math.round(f16);
                    n17 = Math.round(f16);
                    n16 = view.getMeasuredWidth();
                    n10 = n16 + n17;
                    n17 = view.getMeasuredHeight();
                    n3 = n17 + n14;
                    View view3 = view;
                    object = flexLine;
                    flexboxHelper.layoutSingleChildHorizontal(view, flexLine, n15, n14, n10, n3);
                }
                n18 = view.getMeasuredWidth();
                n17 = var38_44.rightMargin;
                f7 = (float)(flexboxLayoutManager.getRightDecorationWidth(view) + (n18 += n17)) + f15 + f16;
                n17 = view.getMeasuredWidth();
                n16 = var38_44.leftMargin;
                f6 = (float)(flexboxLayoutManager.getLeftDecorationWidth(view) + (n17 += n16)) + f15;
                f17 -= f6;
                n16 = n21;
                f6 = f17;
            }
            ++n20;
            n4 = 1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private int layoutFlexLineMainAxisVertical(FlexLine flexLine, FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        float f5;
        float f6;
        float f7;
        ViewGroup.LayoutParams layoutParams;
        float f8;
        float f11;
        int n3;
        Object object;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        int n19;
        FlexboxLayoutManager flexboxLayoutManager;
        block25: {
            block30: {
                block27: {
                    FlexLine flexLine2;
                    block28: {
                        float f12;
                        block29: {
                            flexboxLayoutManager = this;
                            flexLine2 = flexLine;
                            n19 = this.getPaddingTop();
                            n18 = this.getPaddingBottom();
                            n17 = this.getHeight();
                            n16 = FlexboxLayoutManager$LayoutState.access$1000(flexboxLayoutManager$LayoutState);
                            n15 = FlexboxLayoutManager$LayoutState.access$1000(flexboxLayoutManager$LayoutState);
                            n14 = FlexboxLayoutManager$LayoutState.access$2300(flexboxLayoutManager$LayoutState);
                            n10 = -1;
                            f12 = 0.0f / 0.0f;
                            if (n14 == n10) {
                                n14 = flexLine.mCrossSize;
                                n16 -= n14;
                                n15 += n14;
                            }
                            n8 = n16;
                            n7 = n15;
                            n4 = FlexboxLayoutManager$LayoutState.access$2200(flexboxLayoutManager$LayoutState);
                            n16 = flexboxLayoutManager.mJustifyContent;
                            n15 = 0;
                            object = null;
                            n3 = 1;
                            if (n16 == 0) break block27;
                            if (n16 == n3) break block28;
                            n14 = 2;
                            f11 = 2.8E-45f;
                            n10 = 0x40000000;
                            f12 = 2.0f;
                            if (n16 == n14) break block29;
                            n14 = 3;
                            f11 = 4.2E-45f;
                            if (n16 != n14) {
                                n14 = 4;
                                f11 = 5.6E-45f;
                                if (n16 != n14) {
                                    n14 = 5;
                                    f11 = 7.0E-45f;
                                    if (n16 != n14) {
                                        StringBuilder stringBuilder = new StringBuilder("Invalid justifyContent is set: ");
                                        n17 = flexboxLayoutManager.mJustifyContent;
                                        stringBuilder.append(n17);
                                        String string2 = stringBuilder.toString();
                                        IllegalStateException illegalStateException = new IllegalStateException(string2);
                                        throw illegalStateException;
                                    }
                                    n16 = flexLine2.mItemCount;
                                    if (n16 != 0) {
                                        n14 = flexLine2.mMainSize;
                                        n14 = n17 - n14;
                                        f11 = n14;
                                        f8 = n16 += n3;
                                        f11 /= f8;
                                    } else {
                                        n14 = 0;
                                        f11 = 0.0f;
                                        layoutParams = null;
                                    }
                                    f7 = (float)n19 + f11;
                                    f6 = (float)(n17 -= n18) - f11;
                                    break block25;
                                } else {
                                    n16 = flexLine2.mItemCount;
                                    if (n16 != 0) {
                                        n14 = flexLine2.mMainSize;
                                        n14 = n17 - n14;
                                        f11 = n14;
                                        f8 = n16;
                                        f11 /= f8;
                                    } else {
                                        n14 = 0;
                                        f11 = 0.0f;
                                        layoutParams = null;
                                    }
                                    f7 = n19;
                                    f8 = f11 / f12;
                                    f7 += f8;
                                    f6 = (float)(n17 -= n18) - f8;
                                }
                                break block25;
                            } else {
                                f7 = n19;
                                n16 = flexLine2.mItemCount;
                                if (n16 != n3) {
                                    f8 = n16 -= n3;
                                } else {
                                    n16 = 1065353216;
                                    f8 = 1.0f;
                                }
                                n14 = flexLine2.mMainSize;
                                n14 = n17 - n14;
                                f11 = (float)n14 / f8;
                                f6 = n17 -= n18;
                            }
                            break block25;
                        }
                        f7 = n19;
                        n16 = flexLine2.mMainSize;
                        n14 = n17 - n16;
                        f11 = (float)n14 / f12;
                        f7 += f11;
                        n18 = n17 - n18;
                        f6 = n18;
                        f5 = (float)(n17 -= n16) / f12;
                        f6 -= f5;
                        break block30;
                    }
                    n16 = flexLine2.mMainSize;
                    n17 = n17 - n16 + n18;
                    f6 = n17;
                    f7 = n16 -= n19;
                    n14 = 0;
                    f11 = 0.0f;
                    layoutParams = null;
                    float f14 = f6;
                    f6 = f7;
                    f7 = f14;
                    break block25;
                }
                f7 = n19;
                f6 = n17 -= n18;
            }
            n14 = 0;
            f11 = 0.0f;
            layoutParams = null;
        }
        f5 = FlexboxLayoutManager$AnchorInfo.access$2400(flexboxLayoutManager.mAnchorInfo);
        f7 -= f5;
        f5 = FlexboxLayoutManager$AnchorInfo.access$2400(flexboxLayoutManager.mAnchorInfo);
        f6 -= f5;
        float f15 = Math.max(f11, 0.0f);
        int n20 = flexLine.getItemCount();
        n17 = 0;
        f5 = 0.0f;
        int n21 = n4;
        while (true) {
            float f16;
            int n22;
            if (n21 >= (n16 = n4 + n20)) {
                n19 = FlexboxLayoutManager$LayoutState.access$2300(flexboxLayoutManager.mLayoutState);
                FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState2 = flexboxLayoutManager$LayoutState;
                FlexboxLayoutManager$LayoutState.access$1512(flexboxLayoutManager$LayoutState, n19);
                return flexLine.getCrossSize();
            }
            View view = flexboxLayoutManager.getFlexItemAt(n21);
            if (view == null) {
                n22 = n21;
                f16 = f15;
            } else {
                View view2;
                Object object2;
                FlexboxHelper flexboxHelper = flexboxLayoutManager.mFlexboxHelper;
                object = flexboxHelper.mMeasureSpecCache;
                f16 = f15;
                long l2 = object[n21];
                n16 = flexboxHelper.extractLowerInt(l2);
                object = flexboxLayoutManager.mFlexboxHelper;
                n15 = ((FlexboxHelper)object).extractHigherInt(l2);
                ViewGroup.LayoutParams layoutParams2 = layoutParams = view.getLayoutParams();
                FlexboxLayoutManager$LayoutParams flexboxLayoutManager$LayoutParams = (FlexboxLayoutManager$LayoutParams)layoutParams;
                n14 = (int)(flexboxLayoutManager.shouldMeasureChild(view, n16, n15, flexboxLayoutManager$LayoutParams) ? 1 : 0);
                if (n14 != 0) {
                    view.measure(n16, n15);
                }
                n16 = flexboxLayoutManager$LayoutParams.topMargin;
                n15 = flexboxLayoutManager.getTopDecorationHeight(view) + n16;
                f8 = n15;
                f15 = f7 + f8;
                n19 = flexboxLayoutManager$LayoutParams.rightMargin;
                n16 = flexboxLayoutManager.getBottomDecorationHeight(view) + n19;
                f7 = n16;
                float f17 = f6 - f7;
                n19 = FlexboxLayoutManager$LayoutState.access$2300(flexboxLayoutManager$LayoutState);
                n14 = 1;
                f11 = Float.MIN_VALUE;
                if (n19 == n14) {
                    object2 = TEMP_RECT;
                    flexboxLayoutManager.calculateItemDecorationsForChild(view, (Rect)object2);
                    flexboxLayoutManager.addView(view);
                } else {
                    object2 = TEMP_RECT;
                    flexboxLayoutManager.calculateItemDecorationsForChild(view, (Rect)object2);
                    flexboxLayoutManager.addView(view, n17);
                }
                int n24 = ++n17;
                n15 = flexboxLayoutManager.getLeftDecorationWidth(view) + n8;
                n19 = flexboxLayoutManager.getRightDecorationWidth(view);
                int n25 = n7 - n19;
                n16 = (int)(flexboxLayoutManager.mIsRtl ? 1 : 0);
                if (n16 != 0) {
                    n19 = (int)(flexboxLayoutManager.mFromBottomToTop ? 1 : 0);
                    if (n19 != 0) {
                        object2 = flexboxLayoutManager.mFlexboxHelper;
                        n18 = view.getMeasuredWidth();
                        n15 = n25 - n18;
                        n18 = Math.round(f17);
                        n17 = view.getMeasuredHeight();
                        int n26 = n18 - n17;
                        int n27 = Math.round(f17);
                        View view3 = view;
                        n14 = n26;
                        view2 = view;
                        n10 = n25;
                        n22 = n21;
                        n21 = n27;
                        ((FlexboxHelper)object2).layoutSingleChildVertical(view, flexLine, n16 != 0, n15, n26, n25, n27);
                    } else {
                        view2 = view;
                        n22 = n21;
                        object2 = flexboxLayoutManager.mFlexboxHelper;
                        n18 = view.getMeasuredWidth();
                        n15 = n25 - n18;
                        n14 = Math.round(f15);
                        n18 = Math.round(f15);
                        n17 = view.getMeasuredHeight();
                        n21 = n17 + n18;
                        View view4 = view;
                        n10 = n25;
                        ((FlexboxHelper)object2).layoutSingleChildVertical(view, flexLine, n16 != 0, n15, n14, n25, n21);
                    }
                } else {
                    view2 = view;
                    n22 = n21;
                    n19 = (int)(flexboxLayoutManager.mFromBottomToTop ? 1 : 0);
                    if (n19 != 0) {
                        object2 = flexboxLayoutManager.mFlexboxHelper;
                        n18 = Math.round(f17);
                        n17 = view.getMeasuredHeight();
                        n14 = n18 - n17;
                        n18 = view.getMeasuredWidth();
                        n10 = n18 + n15;
                        n21 = Math.round(f17);
                        View view5 = view;
                        ((FlexboxHelper)object2).layoutSingleChildVertical(view, flexLine, n16 != 0, n15, n14, n10, n21);
                    } else {
                        object2 = flexboxLayoutManager.mFlexboxHelper;
                        n14 = Math.round(f15);
                        n10 = view.getMeasuredWidth() + n15;
                        n18 = Math.round(f15);
                        n17 = view.getMeasuredHeight();
                        n21 = n17 + n18;
                        View view6 = view;
                        ((FlexboxHelper)object2).layoutSingleChildVertical(view, flexLine, n16 != 0, n15, n14, n10, n21);
                    }
                }
                n19 = view2.getMeasuredHeight();
                n18 = flexboxLayoutManager$LayoutParams.topMargin;
                View view7 = view2;
                f7 = (float)(flexboxLayoutManager.getBottomDecorationHeight(view2) + (n19 += n18)) + f16 + f15;
                n17 = view2.getMeasuredHeight();
                n16 = flexboxLayoutManager$LayoutParams.bottomMargin;
                n18 = flexboxLayoutManager.getTopDecorationHeight(view2) + (n17 += n16);
                f6 = (float)n18 + f16;
                f17 -= f6;
                n17 = n24;
                f6 = f17;
            }
            n21 = n22 + 1;
            f15 = f16;
            n3 = 1;
        }
    }

    private void recycleByLayoutState(RecyclerView$u recyclerView$u, FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        int n3;
        int n4 = FlexboxLayoutManager$LayoutState.access$500(flexboxLayoutManager$LayoutState);
        if (n4 == 0) {
            return;
        }
        n4 = FlexboxLayoutManager$LayoutState.access$2300(flexboxLayoutManager$LayoutState);
        if (n4 == (n3 = -1)) {
            this.recycleFlexLinesFromEnd(recyclerView$u, flexboxLayoutManager$LayoutState);
        } else {
            this.recycleFlexLinesFromStart(recyclerView$u, flexboxLayoutManager$LayoutState);
        }
    }

    private void recycleChildren(RecyclerView$u recyclerView$u, int n3, int n4) {
        while (n4 >= n3) {
            this.removeAndRecycleViewAt(n4, recyclerView$u);
            n4 += -1;
        }
    }

    private void recycleFlexLinesFromEnd(RecyclerView$u recyclerView$u, FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        int n3 = FlexboxLayoutManager$LayoutState.access$2000(flexboxLayoutManager$LayoutState);
        if (n3 < 0) {
            return;
        }
        n3 = this.getChildCount();
        if (n3 == 0) {
            return;
        }
        int n4 = n3 + -1;
        View view = this.getChildAt(n4);
        if (view == null) {
            return;
        }
        Object object = this.mFlexboxHelper.mIndexToFlexLine;
        int n7 = this.getPosition(view);
        int n8 = -1;
        if ((n7 = object[n7]) == n8) {
            return;
        }
        object = (FlexLine)this.mFlexLines.get(n7);
        for (int i3 = n4; i3 >= 0; i3 += -1) {
            View view2 = this.getChildAt(i3);
            if (view2 == null) continue;
            int n10 = FlexboxLayoutManager$LayoutState.access$2000(flexboxLayoutManager$LayoutState);
            if ((n10 = (int)(this.canViewBeRecycledFromEnd(view2, n10) ? 1 : 0)) == 0) break;
            n10 = object.mFirstIndex;
            int n14 = this.getPosition(view2);
            if (n10 != n14) continue;
            if (n7 <= 0) {
                n3 = i3;
                break;
            }
            n3 = FlexboxLayoutManager$LayoutState.access$2300(flexboxLayoutManager$LayoutState);
            FlexLine flexLine = (FlexLine)this.mFlexLines.get(n7 += n3);
            object = flexLine;
            n3 = i3;
        }
        this.recycleChildren(recyclerView$u, n3, n4);
    }

    private void recycleFlexLinesFromStart(RecyclerView$u recyclerView$u, FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        int n3 = FlexboxLayoutManager$LayoutState.access$2000(flexboxLayoutManager$LayoutState);
        if (n3 < 0) {
            return;
        }
        n3 = this.getChildCount();
        if (n3 == 0) {
            return;
        }
        View view = this.getChildAt(0);
        if (view == null) {
            return;
        }
        Object object = this.mFlexboxHelper.mIndexToFlexLine;
        int n4 = this.getPosition(view);
        int n7 = -1;
        if ((n4 = object[n4]) == n7) {
            return;
        }
        Object object2 = (FlexLine)this.mFlexLines.get(n4);
        for (int i3 = 0; i3 < n3; ++i3) {
            View view2 = this.getChildAt(i3);
            if (view2 == null) continue;
            int n8 = FlexboxLayoutManager$LayoutState.access$2000(flexboxLayoutManager$LayoutState);
            if ((n8 = (int)(this.canViewBeRecycledFromStart(view2, n8) ? 1 : 0)) == 0) break;
            n8 = ((FlexLine)object2).mLastIndex;
            int n10 = this.getPosition(view2);
            if (n8 != n10) continue;
            object = this.mFlexLines;
            n7 = object.size() + -1;
            if (n4 >= n7) {
                n7 = i3;
                break;
            }
            n7 = FlexboxLayoutManager$LayoutState.access$2300(flexboxLayoutManager$LayoutState);
            object2 = object = (FlexLine)this.mFlexLines.get(n4 += n7);
            n7 = i3;
        }
        this.recycleChildren(recyclerView$u, 0, n7);
    }

    private void resolveInfiniteAmount() {
        int n3;
        int n4 = this.isMainAxisDirectionHorizontal();
        n4 = n4 != 0 ? this.getHeightMode() : this.getWidthMode();
        FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState = this.mLayoutState;
        n4 = n4 != 0 && n4 != (n3 = -1 << -1) ? 0 : 1;
        FlexboxLayoutManager$LayoutState.access$1102(flexboxLayoutManager$LayoutState, n4 != 0);
    }

    private void resolveLayoutDirection() {
        int n3 = this.getLayoutDirection();
        int n4 = this.mFlexDirection;
        int n7 = 2;
        int n8 = 0;
        int n10 = 1;
        if (n4 != 0) {
            if (n4 != n10) {
                if (n4 != n7) {
                    int n14 = 3;
                    if (n4 != n14) {
                        this.mIsRtl = false;
                        this.mFromBottomToTop = false;
                    } else {
                        if (n3 == n10) {
                            n8 = 1;
                        }
                        this.mIsRtl = n8;
                        n3 = this.mFlexWrap;
                        if (n3 == n7) {
                            n3 = n8 ^ 1;
                            this.mIsRtl = n3;
                        }
                        this.mFromBottomToTop = n10;
                    }
                } else {
                    n3 = n3 == n10 ? 1 : 0;
                    this.mIsRtl = n3;
                    n4 = this.mFlexWrap;
                    if (n4 == n7) {
                        this.mIsRtl = n3 ^= n10;
                    }
                    this.mFromBottomToTop = false;
                }
            } else {
                n3 = n3 != n10 ? 1 : 0;
                this.mIsRtl = n3;
                n3 = this.mFlexWrap;
                if (n3 == n7) {
                    n8 = 1;
                }
                this.mFromBottomToTop = n8;
            }
        } else {
            n3 = n3 == n10 ? 1 : 0;
            this.mIsRtl = n3;
            n3 = this.mFlexWrap;
            if (n3 == n7) {
                n8 = 1;
            }
            this.mFromBottomToTop = n8;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean shouldMeasureChild(View view, int n3, int n4, RecyclerView$LayoutParams recyclerView$LayoutParams) {
        int n7;
        int n8 = view.isLayoutRequested();
        if (n8 != 0) return 1 != 0;
        n8 = this.isMeasurementCacheEnabled();
        if (n8 == 0) return 1 != 0;
        n8 = view.getWidth();
        n3 = (int)(FlexboxLayoutManager.isMeasurementUpToDate(n8, n3, n7 = recyclerView$LayoutParams.width) ? 1 : 0);
        if (n3 == 0) return 1 != 0;
        int n10 = view.getHeight();
        n3 = recyclerView$LayoutParams.height;
        if ((n10 = (int)(FlexboxLayoutManager.isMeasurementUpToDate(n10, n4, n3) ? 1 : 0)) != 0) return 0 != 0;
        return 1 != 0;
    }

    private boolean updateAnchorFromChildren(RecyclerView$y object, FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo) {
        Object object2;
        int n3 = this.getChildCount();
        int n4 = 0;
        t t3 = null;
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(FlexboxLayoutManager$AnchorInfo.access$900(flexboxLayoutManager$AnchorInfo) ? 1 : 0);
        if (n3 != 0) {
            n3 = ((RecyclerView$y)object).b();
            object2 = this.findLastReferenceChild(n3);
        } else {
            n3 = ((RecyclerView$y)object).b();
            object2 = this.findFirstReferenceChild(n3);
        }
        if (object2 != null) {
            FlexboxLayoutManager$AnchorInfo.access$1900(flexboxLayoutManager$AnchorInfo, (View)object2);
            int n7 = ((RecyclerView$y)object).g;
            if (n7 == 0 && (n7 = this.supportsPredictiveItemAnimations()) != 0 && ((n7 = ((t)(object = this.mOrientationHelper)).e((View)object2)) >= (n4 = (t3 = this.mOrientationHelper).g()) || (n7 = ((t)(object = this.mOrientationHelper)).b((View)object2)) < (n3 = ((t)(object2 = this.mOrientationHelper)).k()))) {
                n7 = (int)(FlexboxLayoutManager$AnchorInfo.access$900(flexboxLayoutManager$AnchorInfo) ? 1 : 0);
                if (n7 != 0) {
                    object = this.mOrientationHelper;
                    n7 = ((t)object).g();
                } else {
                    object = this.mOrientationHelper;
                    n7 = ((t)object).k();
                }
                FlexboxLayoutManager$AnchorInfo.access$1702(flexboxLayoutManager$AnchorInfo, n7);
            }
            return true;
        }
        return false;
    }

    private boolean updateAnchorFromPendingState(RecyclerView$y object, FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo, FlexboxLayoutManager$SavedState object2) {
        int n3;
        int n4 = ((RecyclerView$y)object).g;
        boolean bl2 = false;
        if (n4 == 0 && (n4 = this.mPendingScrollPosition) != (n3 = -1)) {
            int n7;
            int n8 = -1 << -1;
            if (n4 >= 0 && n4 < (n7 = ((RecyclerView$y)object).b())) {
                int n10;
                n4 = this.mPendingScrollPosition;
                FlexboxLayoutManager$AnchorInfo.access$1302(flexboxLayoutManager$AnchorInfo, n4);
                Object object3 = this.mFlexboxHelper.mIndexToFlexLine;
                n7 = FlexboxLayoutManager$AnchorInfo.access$1300(flexboxLayoutManager$AnchorInfo);
                n4 = object3[n7];
                FlexboxLayoutManager$AnchorInfo.access$1402(flexboxLayoutManager$AnchorInfo, n4);
                object3 = this.mPendingSavedState;
                n7 = 1;
                if (object3 != null) {
                    n10 = ((RecyclerView$y)object).b();
                    if ((n10 = (int)(FlexboxLayoutManager$SavedState.access$600((FlexboxLayoutManager$SavedState)object3, n10) ? 1 : 0)) != 0) {
                        n10 = this.mOrientationHelper.k();
                        int n14 = FlexboxLayoutManager$SavedState.access$300((FlexboxLayoutManager$SavedState)object2);
                        FlexboxLayoutManager$AnchorInfo.access$1702(flexboxLayoutManager$AnchorInfo, n10 += n14);
                        FlexboxLayoutManager$AnchorInfo.access$1802(flexboxLayoutManager$AnchorInfo, n7 != 0);
                        FlexboxLayoutManager$AnchorInfo.access$1402(flexboxLayoutManager$AnchorInfo, n3);
                        return n7 != 0;
                    }
                }
                if ((n10 = this.mPendingScrollPositionOffset) == n8) {
                    n10 = this.mPendingScrollPosition;
                    object = this.findViewByPosition(n10);
                    if (object != null) {
                        object2 = this.mOrientationHelper;
                        int n15 = ((t)object2).c((View)object);
                        if (n15 > (n4 = ((t)(object3 = (Object)this.mOrientationHelper)).l())) {
                            FlexboxLayoutManager$AnchorInfo.access$1600(flexboxLayoutManager$AnchorInfo);
                            return n7 != 0;
                        }
                        object2 = this.mOrientationHelper;
                        n15 = ((t)object2).e((View)object);
                        object3 = this.mOrientationHelper;
                        n4 = ((t)object3).k();
                        if ((n15 -= n4) < 0) {
                            n10 = this.mOrientationHelper.k();
                            FlexboxLayoutManager$AnchorInfo.access$1702(flexboxLayoutManager$AnchorInfo, n10);
                            FlexboxLayoutManager$AnchorInfo.access$902(flexboxLayoutManager$AnchorInfo, false);
                            return n7 != 0;
                        }
                        object2 = this.mOrientationHelper;
                        n15 = ((t)object2).g();
                        object3 = this.mOrientationHelper;
                        n4 = ((t)object3).b((View)object);
                        if ((n15 -= n4) < 0) {
                            n10 = this.mOrientationHelper.g();
                            FlexboxLayoutManager$AnchorInfo.access$1702(flexboxLayoutManager$AnchorInfo, n10);
                            FlexboxLayoutManager$AnchorInfo.access$902(flexboxLayoutManager$AnchorInfo, n7 != 0);
                            return n7 != 0;
                        }
                        n15 = (int)(FlexboxLayoutManager$AnchorInfo.access$900(flexboxLayoutManager$AnchorInfo) ? 1 : 0);
                        if (n15 != 0) {
                            n10 = this.mOrientationHelper.b((View)object);
                            object2 = this.mOrientationHelper;
                            n15 = ((t)object2).m() + n10;
                        } else {
                            object2 = this.mOrientationHelper;
                            n15 = ((t)object2).e((View)object);
                        }
                        FlexboxLayoutManager$AnchorInfo.access$1702(flexboxLayoutManager$AnchorInfo, n15);
                    } else {
                        n10 = this.getChildCount();
                        if (n10 > 0 && (object = this.getChildAt(0)) != null) {
                            int n16 = this.mPendingScrollPosition;
                            n10 = this.getPosition((View)object);
                            if (n16 < n10) {
                                bl2 = true;
                            }
                            FlexboxLayoutManager$AnchorInfo.access$902(flexboxLayoutManager$AnchorInfo, bl2);
                        }
                        FlexboxLayoutManager$AnchorInfo.access$1600(flexboxLayoutManager$AnchorInfo);
                    }
                    return n7 != 0;
                }
                n10 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0);
                if (n10 == 0 && (n10 = (int)(this.mIsRtl ? 1 : 0)) != 0) {
                    n10 = this.mPendingScrollPositionOffset;
                    object2 = this.mOrientationHelper;
                    int n17 = ((t)object2).h();
                    FlexboxLayoutManager$AnchorInfo.access$1702(flexboxLayoutManager$AnchorInfo, n10 -= n17);
                } else {
                    object = this.mOrientationHelper;
                    n10 = ((t)object).k();
                    int n18 = this.mPendingScrollPositionOffset;
                    FlexboxLayoutManager$AnchorInfo.access$1702(flexboxLayoutManager$AnchorInfo, n10 += n18);
                }
                return n7 != 0;
            }
            this.mPendingScrollPosition = n3;
            this.mPendingScrollPositionOffset = n8;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView$y recyclerView$y, FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo) {
        FlexboxLayoutManager$SavedState flexboxLayoutManager$SavedState = this.mPendingSavedState;
        boolean bl2 = this.updateAnchorFromPendingState(recyclerView$y, flexboxLayoutManager$AnchorInfo, flexboxLayoutManager$SavedState);
        if (bl2) {
            return;
        }
        boolean bl3 = this.updateAnchorFromChildren(recyclerView$y, flexboxLayoutManager$AnchorInfo);
        if (bl3) {
            return;
        }
        FlexboxLayoutManager$AnchorInfo.access$1600(flexboxLayoutManager$AnchorInfo);
        FlexboxLayoutManager$AnchorInfo.access$1302(flexboxLayoutManager$AnchorInfo, 0);
        FlexboxLayoutManager$AnchorInfo.access$1402(flexboxLayoutManager$AnchorInfo, 0);
    }

    private void updateDirtyPosition(int n3) {
        int n4 = this.findLastVisibleItemPosition();
        if (n3 >= n4) {
            return;
        }
        n4 = this.getChildCount();
        this.mFlexboxHelper.ensureMeasureSpecCache(n4);
        this.mFlexboxHelper.ensureMeasuredSizeCache(n4);
        FlexboxHelper flexboxHelper = this.mFlexboxHelper;
        flexboxHelper.ensureIndexToFlexLine(n4);
        Object object = this.mFlexboxHelper.mIndexToFlexLine;
        n4 = ((int[])object).length;
        if (n3 >= n4) {
            return;
        }
        this.mDirtyPosition = n3;
        View view = this.getChildClosestToStart();
        if (view == null) {
            return;
        }
        this.mPendingScrollPosition = n4 = this.getPosition(view);
        n4 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0);
        if (n4 == 0 && (n4 = (int)(this.mIsRtl ? 1 : 0)) != 0) {
            n3 = this.mOrientationHelper.b(view);
            object = this.mOrientationHelper;
            this.mPendingScrollPositionOffset = n4 = ((t)object).h() + n3;
        } else {
            n3 = this.mOrientationHelper.e(view);
            object = this.mOrientationHelper;
            n4 = ((t)object).k();
            this.mPendingScrollPositionOffset = n3 -= n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void updateFlexLines(int n3) {
        Object object;
        Object object2;
        Object object3;
        int n4 = this.getWidth();
        int n7 = this.getWidthMode();
        n4 = View.MeasureSpec.makeMeasureSpec((int)n4, (int)n7);
        n7 = this.getHeight();
        int n8 = this.getHeightMode();
        n7 = View.MeasureSpec.makeMeasureSpec((int)n7, (int)n8);
        n8 = this.getWidth();
        int n10 = this.getHeight();
        int n14 = this.isMainAxisDirectionHorizontal();
        int n15 = 0;
        int n16 = 1;
        int n17 = -1 << -1;
        if (n14 != 0) {
            FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState;
            n14 = this.mLastWidth;
            if (n14 != n17 && n14 != n8) {
                n15 = 1;
            }
            if ((n14 = (int)(FlexboxLayoutManager$LayoutState.access$1100(flexboxLayoutManager$LayoutState = this.mLayoutState) ? 1 : 0)) != 0) {
                flexboxLayoutManager$LayoutState = this.mContext.getResources().getDisplayMetrics();
                n14 = ((DisplayMetrics)flexboxLayoutManager$LayoutState).heightPixels;
            } else {
                flexboxLayoutManager$LayoutState = this.mLayoutState;
                n14 = FlexboxLayoutManager$LayoutState.access$1200(flexboxLayoutManager$LayoutState);
            }
        } else {
            FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState;
            n14 = this.mLastHeight;
            if (n14 != n17 && n14 != n10) {
                n15 = 1;
            }
            if ((n14 = (int)(FlexboxLayoutManager$LayoutState.access$1100(flexboxLayoutManager$LayoutState = this.mLayoutState) ? 1 : 0)) != 0) {
                flexboxLayoutManager$LayoutState = this.mContext.getResources().getDisplayMetrics();
                n14 = ((DisplayMetrics)flexboxLayoutManager$LayoutState).widthPixels;
            } else {
                flexboxLayoutManager$LayoutState = this.mLayoutState;
                n14 = FlexboxLayoutManager$LayoutState.access$1200(flexboxLayoutManager$LayoutState);
            }
        }
        n16 = n14;
        this.mLastWidth = n8;
        this.mLastHeight = n10;
        n8 = this.mDirtyPosition;
        n10 = -1;
        if (n8 == n10 && ((n14 = this.mPendingScrollPosition) != n10 || n15 != 0)) {
            Object object4 = this.mAnchorInfo;
            n3 = (int)(FlexboxLayoutManager$AnchorInfo.access$900((FlexboxLayoutManager$AnchorInfo)object4) ? 1 : 0);
            if (n3 != 0) {
                return;
            }
            this.mFlexLines.clear();
            object4 = this.mFlexLinesResult;
            ((FlexboxHelper$FlexLinesResult)object4).reset();
            n3 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0);
            if (n3 != 0) {
                FlexboxHelper flexboxHelper = this.mFlexboxHelper;
                FlexboxHelper$FlexLinesResult flexboxHelper$FlexLinesResult = this.mFlexLinesResult;
                object4 = this.mAnchorInfo;
                n17 = FlexboxLayoutManager$AnchorInfo.access$1300((FlexboxLayoutManager$AnchorInfo)object4);
                List list = this.mFlexLines;
                n14 = n4;
                n15 = n7;
                flexboxHelper.calculateHorizontalFlexLinesToIndex(flexboxHelper$FlexLinesResult, n4, n7, n16, n17, list);
            } else {
                FlexboxHelper flexboxHelper = this.mFlexboxHelper;
                FlexboxHelper$FlexLinesResult flexboxHelper$FlexLinesResult = this.mFlexLinesResult;
                object4 = this.mAnchorInfo;
                n17 = FlexboxLayoutManager$AnchorInfo.access$1300((FlexboxLayoutManager$AnchorInfo)object4);
                List list = this.mFlexLines;
                n14 = n4;
                n15 = n7;
                flexboxHelper.calculateVerticalFlexLinesToIndex(flexboxHelper$FlexLinesResult, n4, n7, n16, n17, list);
            }
            this.mFlexLines = object4 = this.mFlexLinesResult.mFlexLines;
            this.mFlexboxHelper.determineMainSize(n4, n7);
            this.mFlexboxHelper.stretchViews();
            object4 = this.mAnchorInfo;
            int[] nArray = this.mFlexboxHelper.mIndexToFlexLine;
            n7 = FlexboxLayoutManager$AnchorInfo.access$1300((FlexboxLayoutManager$AnchorInfo)object4);
            n4 = nArray[n7];
            FlexboxLayoutManager$AnchorInfo.access$1402((FlexboxLayoutManager$AnchorInfo)object4, n4);
            object4 = this.mLayoutState;
            FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo = this.mAnchorInfo;
            n4 = FlexboxLayoutManager$AnchorInfo.access$1400(flexboxLayoutManager$AnchorInfo);
            FlexboxLayoutManager$LayoutState.access$1502((FlexboxLayoutManager$LayoutState)object4, n4);
            return;
        }
        if (n8 != n10) {
            object3 = this.mAnchorInfo;
            n10 = FlexboxLayoutManager$AnchorInfo.access$1300((FlexboxLayoutManager$AnchorInfo)object3);
            n8 = Math.min(n8, n10);
        } else {
            object2 = this.mAnchorInfo;
            n8 = FlexboxLayoutManager$AnchorInfo.access$1300((FlexboxLayoutManager$AnchorInfo)object2);
        }
        int n18 = n8;
        object2 = this.mFlexLinesResult;
        ((FlexboxHelper$FlexLinesResult)object2).reset();
        n8 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0);
        if (n8 != 0) {
            object2 = this.mFlexLines;
            n8 = object2.size();
            if (n8 > 0) {
                object = this.mFlexboxHelper;
                object2 = this.mFlexLines;
                ((FlexboxHelper)object).clearFlexLines((List)object2, n18);
                object2 = this.mFlexboxHelper;
                object3 = this.mFlexLinesResult;
                object = this.mAnchorInfo;
                int n19 = FlexboxLayoutManager$AnchorInfo.access$1300((FlexboxLayoutManager$AnchorInfo)object);
                List list = this.mFlexLines;
                n14 = n4;
                n15 = n7;
                n17 = n18;
                ((FlexboxHelper)object2).calculateFlexLines((FlexboxHelper$FlexLinesResult)object3, n4, n7, n16, n18, n19, list);
            } else {
                this.mFlexboxHelper.ensureIndexToFlexLine(n3);
                object2 = this.mFlexboxHelper;
                object3 = this.mFlexLinesResult;
                n17 = 0;
                List list = this.mFlexLines;
                n14 = n4;
                n15 = n7;
                ((FlexboxHelper)object2).calculateHorizontalFlexLines((FlexboxHelper$FlexLinesResult)object3, n4, n7, n16, 0, list);
            }
        } else {
            object2 = this.mFlexLines;
            n8 = object2.size();
            if (n8 > 0) {
                object = this.mFlexboxHelper;
                object2 = this.mFlexLines;
                ((FlexboxHelper)object).clearFlexLines((List)object2, n18);
                object2 = this.mFlexboxHelper;
                object3 = this.mFlexLinesResult;
                object = this.mAnchorInfo;
                int n20 = FlexboxLayoutManager$AnchorInfo.access$1300((FlexboxLayoutManager$AnchorInfo)object);
                List list = this.mFlexLines;
                n14 = n7;
                n15 = n4;
                n17 = n18;
                ((FlexboxHelper)object2).calculateFlexLines((FlexboxHelper$FlexLinesResult)object3, n7, n4, n16, n18, n20, list);
            } else {
                this.mFlexboxHelper.ensureIndexToFlexLine(n3);
                object2 = this.mFlexboxHelper;
                object3 = this.mFlexLinesResult;
                n17 = 0;
                List list = this.mFlexLines;
                n14 = n4;
                n15 = n7;
                ((FlexboxHelper)object2).calculateVerticalFlexLines((FlexboxHelper$FlexLinesResult)object3, n4, n7, n16, 0, list);
            }
        }
        this.mFlexLines = object = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(n4, n7, n18);
        object = this.mFlexboxHelper;
        ((FlexboxHelper)object).stretchViews(n18);
    }

    private void updateLayoutState(int n3, int n4) {
        Object object;
        Object object2;
        int n7;
        FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState = this.mLayoutState;
        FlexboxLayoutManager$LayoutState.access$2302(flexboxLayoutManager$LayoutState, n3);
        int n8 = this.isMainAxisDirectionHorizontal();
        Object object3 = this.getWidth();
        Object object4 = this.getWidthMode();
        object3 = View.MeasureSpec.makeMeasureSpec((int)object3, (int)object4);
        object4 = this.getHeight();
        int n10 = this.getHeightMode();
        object4 = View.MeasureSpec.makeMeasureSpec((int)object4, (int)n10);
        n10 = 1;
        int n14 = 0;
        Object object5 = null;
        if (n8 == 0 && (n7 = this.mIsRtl) != 0) {
            n7 = 1;
        } else {
            n7 = 0;
            object2 = null;
        }
        Object object6 = -1;
        if (n3 == n10) {
            n3 = this.getChildCount() - n10;
            object = this.getChildAt(n3);
            if (object == null) {
                return;
            }
            Object object7 = this.mLayoutState;
            Object object8 = this.mOrientationHelper.b((View)object);
            FlexboxLayoutManager$LayoutState.access$1002((FlexboxLayoutManager$LayoutState)object7, object8);
            int n15 = this.getPosition((View)object);
            object8 = this.mFlexboxHelper.mIndexToFlexLine[n15];
            List list = this.mFlexLines;
            Object object9 = (FlexLine)list.get((int)object8);
            object = this.findLastReferenceViewInLine((View)object, (FlexLine)object9);
            FlexboxLayoutManager$LayoutState.access$2502(this.mLayoutState, n10);
            object9 = this.mLayoutState;
            int n16 = FlexboxLayoutManager$LayoutState.access$2500((FlexboxLayoutManager$LayoutState)object9);
            FlexboxLayoutManager$LayoutState.access$2202((FlexboxLayoutManager$LayoutState)object9, n15 += n16);
            object7 = this.mFlexboxHelper.mIndexToFlexLine;
            n15 = ((Object)object7).length;
            object9 = this.mLayoutState;
            object8 = FlexboxLayoutManager$LayoutState.access$2200((FlexboxLayoutManager$LayoutState)object9);
            if (n15 <= object8) {
                object7 = this.mLayoutState;
                FlexboxLayoutManager$LayoutState.access$1502((FlexboxLayoutManager$LayoutState)object7, object6);
            } else {
                object7 = this.mLayoutState;
                object9 = this.mFlexboxHelper.mIndexToFlexLine;
                n16 = FlexboxLayoutManager$LayoutState.access$2200((FlexboxLayoutManager$LayoutState)object7);
                object8 = object9[n16];
                FlexboxLayoutManager$LayoutState.access$1502((FlexboxLayoutManager$LayoutState)object7, object8);
            }
            if (n7 != 0) {
                object2 = this.mLayoutState;
                n15 = this.mOrientationHelper.e((View)object);
                FlexboxLayoutManager$LayoutState.access$1002((FlexboxLayoutManager$LayoutState)object2, n15);
                object2 = this.mLayoutState;
                n3 = -this.mOrientationHelper.e((View)object);
                object7 = this.mOrientationHelper;
                n15 = ((t)object7).k() + n3;
                FlexboxLayoutManager$LayoutState.access$2002((FlexboxLayoutManager$LayoutState)object2, n15);
                object = this.mLayoutState;
                n7 = FlexboxLayoutManager$LayoutState.access$2000((FlexboxLayoutManager$LayoutState)object);
                n14 = Math.max(n7, 0);
                FlexboxLayoutManager$LayoutState.access$2002((FlexboxLayoutManager$LayoutState)object, n14);
            } else {
                object5 = this.mLayoutState;
                n7 = this.mOrientationHelper.b((View)object);
                FlexboxLayoutManager$LayoutState.access$1002((FlexboxLayoutManager$LayoutState)object5, n7);
                object5 = this.mLayoutState;
                n3 = this.mOrientationHelper.b((View)object);
                object2 = this.mOrientationHelper;
                n7 = ((t)object2).g();
                FlexboxLayoutManager$LayoutState.access$2002((FlexboxLayoutManager$LayoutState)object5, n3 -= n7);
            }
            object = this.mLayoutState;
            n3 = FlexboxLayoutManager$LayoutState.access$1500((FlexboxLayoutManager$LayoutState)object);
            if ((n3 == object6 || (n3 = FlexboxLayoutManager$LayoutState.access$1500((FlexboxLayoutManager$LayoutState)(object = this.mLayoutState))) > (n14 = (object5 = this.mFlexLines).size() - n10)) && (n3 = FlexboxLayoutManager$LayoutState.access$2200((FlexboxLayoutManager$LayoutState)(object = this.mLayoutState))) <= (n10 = this.getFlexItemCount())) {
                n3 = FlexboxLayoutManager$LayoutState.access$2000(this.mLayoutState);
                n15 = n4 - n3;
                object = this.mFlexLinesResult;
                ((FlexboxHelper$FlexLinesResult)object).reset();
                if (n15 > 0) {
                    if (n8 != 0) {
                        FlexboxHelper flexboxHelper = this.mFlexboxHelper;
                        object5 = this.mFlexLinesResult;
                        object = this.mLayoutState;
                        object8 = FlexboxLayoutManager$LayoutState.access$2200((FlexboxLayoutManager$LayoutState)object);
                        list = this.mFlexLines;
                        n7 = object3;
                        object6 = object4;
                        flexboxHelper.calculateHorizontalFlexLines((FlexboxHelper$FlexLinesResult)object5, (int)object3, (int)object4, n15, (int)object8, list);
                    } else {
                        FlexboxHelper flexboxHelper = this.mFlexboxHelper;
                        object5 = this.mFlexLinesResult;
                        object = this.mLayoutState;
                        object8 = FlexboxLayoutManager$LayoutState.access$2200((FlexboxLayoutManager$LayoutState)object);
                        list = this.mFlexLines;
                        n7 = object3;
                        object6 = object4;
                        flexboxHelper.calculateVerticalFlexLines((FlexboxHelper$FlexLinesResult)object5, (int)object3, (int)object4, n15, (int)object8, list);
                    }
                    object = this.mFlexboxHelper;
                    n8 = FlexboxLayoutManager$LayoutState.access$2200(this.mLayoutState);
                    ((FlexboxHelper)object).determineMainSize((int)object3, (int)object4, n8);
                    object = this.mFlexboxHelper;
                    flexboxLayoutManager$LayoutState = this.mLayoutState;
                    n8 = FlexboxLayoutManager$LayoutState.access$2200(flexboxLayoutManager$LayoutState);
                    ((FlexboxHelper)object).stretchViews(n8);
                }
            }
        } else {
            object = this.getChildAt(0);
            if (object == null) {
                return;
            }
            flexboxLayoutManager$LayoutState = this.mLayoutState;
            object3 = this.mOrientationHelper.e((View)object);
            FlexboxLayoutManager$LayoutState.access$1002(flexboxLayoutManager$LayoutState, object3);
            n8 = this.getPosition((View)object);
            object3 = this.mFlexboxHelper.mIndexToFlexLine[n8];
            Object object10 = this.mFlexLines;
            Object object11 = (FlexLine)object10.get((int)object3);
            object = this.findFirstReferenceViewInLine((View)object, (FlexLine)object11);
            FlexboxLayoutManager$LayoutState.access$2502(this.mLayoutState, n10);
            object11 = this.mFlexboxHelper.mIndexToFlexLine;
            object3 = object11[n8];
            if (object3 == object6) {
                object3 = 0;
                object11 = null;
            }
            if (object3 > 0) {
                object10 = this.mFlexLines;
                object6 = object3 + -1;
                object10 = (FlexLine)object10.get((int)object6);
                FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState2 = this.mLayoutState;
                object4 = ((FlexLine)object10).getItemCount();
                FlexboxLayoutManager$LayoutState.access$2202(flexboxLayoutManager$LayoutState2, n8 -= object4);
            } else {
                flexboxLayoutManager$LayoutState = this.mLayoutState;
                FlexboxLayoutManager$LayoutState.access$2202(flexboxLayoutManager$LayoutState, object6);
            }
            flexboxLayoutManager$LayoutState = this.mLayoutState;
            if (object3 > 0) {
                object3 -= n10;
            } else {
                object3 = 0;
                object11 = null;
            }
            FlexboxLayoutManager$LayoutState.access$1502(flexboxLayoutManager$LayoutState, object3);
            if (n7 != 0) {
                flexboxLayoutManager$LayoutState = this.mLayoutState;
                object3 = this.mOrientationHelper.b((View)object);
                FlexboxLayoutManager$LayoutState.access$1002(flexboxLayoutManager$LayoutState, object3);
                flexboxLayoutManager$LayoutState = this.mLayoutState;
                n3 = this.mOrientationHelper.b((View)object);
                object11 = this.mOrientationHelper;
                object3 = ((t)object11).g();
                FlexboxLayoutManager$LayoutState.access$2002(flexboxLayoutManager$LayoutState, n3 -= object3);
                object = this.mLayoutState;
                n8 = Math.max(FlexboxLayoutManager$LayoutState.access$2000((FlexboxLayoutManager$LayoutState)object), 0);
                FlexboxLayoutManager$LayoutState.access$2002((FlexboxLayoutManager$LayoutState)object, n8);
            } else {
                flexboxLayoutManager$LayoutState = this.mLayoutState;
                object3 = this.mOrientationHelper.e((View)object);
                FlexboxLayoutManager$LayoutState.access$1002(flexboxLayoutManager$LayoutState, object3);
                flexboxLayoutManager$LayoutState = this.mLayoutState;
                n3 = -this.mOrientationHelper.e((View)object);
                object11 = this.mOrientationHelper;
                object3 = ((t)object11).k() + n3;
                FlexboxLayoutManager$LayoutState.access$2002(flexboxLayoutManager$LayoutState, object3);
            }
        }
        object = this.mLayoutState;
        n8 = FlexboxLayoutManager$LayoutState.access$2000((FlexboxLayoutManager$LayoutState)object);
        FlexboxLayoutManager$LayoutState.access$1202((FlexboxLayoutManager$LayoutState)object, n4 -= n8);
    }

    private void updateLayoutStateToFillEnd(FlexboxLayoutManager$AnchorInfo object, boolean n3, boolean n4) {
        Object object2;
        int n7;
        t t3;
        int n8;
        Object object3;
        if (n4 != 0) {
            this.resolveInfiniteAmount();
        } else {
            object3 = this.mLayoutState;
            n8 = 0;
            t3 = null;
            FlexboxLayoutManager$LayoutState.access$1102((FlexboxLayoutManager$LayoutState)object3, false);
        }
        n4 = this.isMainAxisDirectionHorizontal();
        if (n4 == 0 && (n4 = this.mIsRtl) != 0) {
            object3 = this.mLayoutState;
            n8 = FlexboxLayoutManager$AnchorInfo.access$1700((FlexboxLayoutManager$AnchorInfo)object);
            n7 = this.getPaddingRight();
            FlexboxLayoutManager$LayoutState.access$1202((FlexboxLayoutManager$LayoutState)object3, n8 -= n7);
        } else {
            object3 = this.mLayoutState;
            t3 = this.mOrientationHelper;
            n8 = t3.g();
            n7 = FlexboxLayoutManager$AnchorInfo.access$1700((FlexboxLayoutManager$AnchorInfo)object);
            FlexboxLayoutManager$LayoutState.access$1202((FlexboxLayoutManager$LayoutState)object3, n8 -= n7);
        }
        object3 = this.mLayoutState;
        n8 = FlexboxLayoutManager$AnchorInfo.access$1300((FlexboxLayoutManager$AnchorInfo)object);
        FlexboxLayoutManager$LayoutState.access$2202((FlexboxLayoutManager$LayoutState)object3, n8);
        object3 = this.mLayoutState;
        n8 = 1;
        FlexboxLayoutManager$LayoutState.access$2502((FlexboxLayoutManager$LayoutState)object3, n8);
        FlexboxLayoutManager$LayoutState.access$2302(this.mLayoutState, n8);
        object3 = this.mLayoutState;
        n7 = FlexboxLayoutManager$AnchorInfo.access$1700((FlexboxLayoutManager$AnchorInfo)object);
        FlexboxLayoutManager$LayoutState.access$1002((FlexboxLayoutManager$LayoutState)object3, n7);
        FlexboxLayoutManager$LayoutState.access$2002(this.mLayoutState, -1 << -1);
        object3 = this.mLayoutState;
        n7 = FlexboxLayoutManager$AnchorInfo.access$1400((FlexboxLayoutManager$AnchorInfo)object);
        FlexboxLayoutManager$LayoutState.access$1502((FlexboxLayoutManager$LayoutState)object3, n7);
        if (n3 != 0 && (n3 = (object2 = this.mFlexLines).size()) > n8 && (n3 = FlexboxLayoutManager$AnchorInfo.access$1400((FlexboxLayoutManager$AnchorInfo)object)) >= 0 && (n3 = FlexboxLayoutManager$AnchorInfo.access$1400((FlexboxLayoutManager$AnchorInfo)object)) < (n4 = (object3 = this.mFlexLines).size() - n8)) {
            object2 = this.mFlexLines;
            int n10 = FlexboxLayoutManager$AnchorInfo.access$1400((FlexboxLayoutManager$AnchorInfo)object);
            object = (FlexLine)object2.get(n10);
            FlexboxLayoutManager$LayoutState.access$1508(this.mLayoutState);
            object2 = this.mLayoutState;
            n10 = ((FlexLine)object).getItemCount();
            FlexboxLayoutManager$LayoutState.access$2212((FlexboxLayoutManager$LayoutState)object2, n10);
        }
    }

    private void updateLayoutStateToFillStart(FlexboxLayoutManager$AnchorInfo object, boolean n3, boolean n4) {
        Object object2;
        View view;
        int n7;
        FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState;
        if (n4 != 0) {
            this.resolveInfiniteAmount();
        } else {
            flexboxLayoutManager$LayoutState = this.mLayoutState;
            n7 = 0;
            view = null;
            FlexboxLayoutManager$LayoutState.access$1102(flexboxLayoutManager$LayoutState, false);
        }
        n4 = this.isMainAxisDirectionHorizontal();
        if (n4 == 0 && (n4 = this.mIsRtl) != 0) {
            flexboxLayoutManager$LayoutState = this.mLayoutState;
            view = this.mParent;
            n7 = view.getWidth();
            int n8 = FlexboxLayoutManager$AnchorInfo.access$1700((FlexboxLayoutManager$AnchorInfo)object);
            n7 -= n8;
            t t3 = this.mOrientationHelper;
            n8 = t3.k();
            FlexboxLayoutManager$LayoutState.access$1202(flexboxLayoutManager$LayoutState, n7 -= n8);
        } else {
            flexboxLayoutManager$LayoutState = this.mLayoutState;
            n7 = FlexboxLayoutManager$AnchorInfo.access$1700((FlexboxLayoutManager$AnchorInfo)object);
            t t4 = this.mOrientationHelper;
            int n10 = t4.k();
            FlexboxLayoutManager$LayoutState.access$1202(flexboxLayoutManager$LayoutState, n7 -= n10);
        }
        flexboxLayoutManager$LayoutState = this.mLayoutState;
        n7 = FlexboxLayoutManager$AnchorInfo.access$1300((FlexboxLayoutManager$AnchorInfo)object);
        FlexboxLayoutManager$LayoutState.access$2202(flexboxLayoutManager$LayoutState, n7);
        FlexboxLayoutManager$LayoutState.access$2502(this.mLayoutState, 1);
        FlexboxLayoutManager$LayoutState.access$2302(this.mLayoutState, -1);
        flexboxLayoutManager$LayoutState = this.mLayoutState;
        n7 = FlexboxLayoutManager$AnchorInfo.access$1700((FlexboxLayoutManager$AnchorInfo)object);
        FlexboxLayoutManager$LayoutState.access$1002(flexboxLayoutManager$LayoutState, n7);
        FlexboxLayoutManager$LayoutState.access$2002(this.mLayoutState, -1 << -1);
        flexboxLayoutManager$LayoutState = this.mLayoutState;
        n7 = FlexboxLayoutManager$AnchorInfo.access$1400((FlexboxLayoutManager$AnchorInfo)object);
        FlexboxLayoutManager$LayoutState.access$1502(flexboxLayoutManager$LayoutState, n7);
        if (n3 != 0 && (n3 = FlexboxLayoutManager$AnchorInfo.access$1400((FlexboxLayoutManager$AnchorInfo)object)) > 0 && (n3 = (object2 = this.mFlexLines).size()) > (n4 = FlexboxLayoutManager$AnchorInfo.access$1400((FlexboxLayoutManager$AnchorInfo)object))) {
            object2 = this.mFlexLines;
            int n14 = FlexboxLayoutManager$AnchorInfo.access$1400((FlexboxLayoutManager$AnchorInfo)object);
            object = (FlexLine)object2.get(n14);
            FlexboxLayoutManager$LayoutState.access$1510(this.mLayoutState);
            object2 = this.mLayoutState;
            n14 = ((FlexLine)object).getItemCount();
            FlexboxLayoutManager$LayoutState.access$2220((FlexboxLayoutManager$LayoutState)object2, n14);
        }
    }

    public boolean canScrollHorizontally() {
        boolean bl2;
        block7: {
            block6: {
                int n3;
                int n4 = this.mFlexWrap;
                if (n4 == 0) {
                    return this.isMainAxisDirectionHorizontal();
                }
                n4 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0);
                if (n4 == 0) break block6;
                n4 = this.getWidth();
                View view = this.mParent;
                bl2 = false;
                if (view != null) {
                    n3 = view.getWidth();
                } else {
                    n3 = 0;
                    view = null;
                }
                if (n4 <= n3) break block7;
            }
            bl2 = true;
        }
        return bl2;
    }

    public boolean canScrollVertically() {
        int n3 = this.mFlexWrap;
        boolean bl2 = true;
        if (n3 == 0) {
            return this.isMainAxisDirectionHorizontal() ^ bl2;
        }
        n3 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0);
        if (n3 == 0) {
            int n4;
            n3 = this.getHeight();
            View view = this.mParent;
            if (view != null) {
                n4 = view.getHeight();
            } else {
                n4 = 0;
                view = null;
            }
            if (n3 <= n4) {
                bl2 = false;
            }
        }
        return bl2;
    }

    public boolean checkLayoutParams(RecyclerView$LayoutParams recyclerView$LayoutParams) {
        return recyclerView$LayoutParams instanceof FlexboxLayoutManager$LayoutParams;
    }

    public int computeHorizontalScrollExtent(RecyclerView$y recyclerView$y) {
        return this.computeScrollExtent(recyclerView$y);
    }

    public int computeHorizontalScrollOffset(RecyclerView$y recyclerView$y) {
        return this.computeScrollOffset(recyclerView$y);
    }

    public int computeHorizontalScrollRange(RecyclerView$y recyclerView$y) {
        return this.computeScrollRange(recyclerView$y);
    }

    public PointF computeScrollVectorForPosition(int n3) {
        float f5;
        int n4 = this.getChildCount();
        if (n4 == 0) {
            return null;
        }
        n4 = 0;
        View view = this.getChildAt(0);
        if (view == null) {
            return null;
        }
        n4 = this.getPosition(view);
        if (n3 < n4) {
            n3 = -1;
            f5 = 0.0f / 0.0f;
        } else {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        }
        n4 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0);
        if (n4 != 0) {
            f5 = n3;
            view = new PointF(0.0f, f5);
            return view;
        }
        f5 = n3;
        view = new PointF(f5, 0.0f);
        return view;
    }

    public int computeVerticalScrollExtent(RecyclerView$y recyclerView$y) {
        return this.computeScrollExtent(recyclerView$y);
    }

    public int computeVerticalScrollOffset(RecyclerView$y recyclerView$y) {
        return this.computeScrollOffset(recyclerView$y);
    }

    public int computeVerticalScrollRange(RecyclerView$y recyclerView$y) {
        return this.computeScrollRange(recyclerView$y);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        boolean bl2;
        int n3 = this.getChildCount();
        View view = this.findOneVisibleChild(0, n3, bl2 = true);
        n3 = view == null ? -1 : this.getPosition(view);
        return n3;
    }

    public int findFirstVisibleItemPosition() {
        int n3 = 0;
        int n4 = this.getChildCount();
        View view = this.findOneVisibleChild(0, n4, false);
        n3 = view == null ? -1 : this.getPosition(view);
        return n3;
    }

    public int findLastCompletelyVisibleItemPosition() {
        int n3 = this.getChildCount();
        int n4 = 1;
        int n7 = -1;
        View view = this.findOneVisibleChild(n3 -= n4, n7, n4 != 0);
        if (view != null) {
            n7 = this.getPosition(view);
        }
        return n7;
    }

    public int findLastVisibleItemPosition() {
        int n3;
        int n4 = this.getChildCount() + -1;
        View view = this.findOneVisibleChild(n4, n3 = -1, false);
        if (view != null) {
            n3 = this.getPosition(view);
        }
        return n3;
    }

    public RecyclerView$LayoutParams generateDefaultLayoutParams() {
        int n3 = -2;
        FlexboxLayoutManager$LayoutParams flexboxLayoutManager$LayoutParams = new FlexboxLayoutManager$LayoutParams(n3, n3);
        return flexboxLayoutManager$LayoutParams;
    }

    public RecyclerView$LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        FlexboxLayoutManager$LayoutParams flexboxLayoutManager$LayoutParams = new FlexboxLayoutManager$LayoutParams(context, attributeSet);
        return flexboxLayoutManager$LayoutParams;
    }

    public int getAlignContent() {
        return 5;
    }

    public int getAlignItems() {
        return this.mAlignItems;
    }

    public int getChildHeightMeasureSpec(int n3, int n4, int n7) {
        n3 = this.getHeight();
        int n8 = this.getHeightMode();
        boolean bl2 = this.canScrollVertically();
        return RecyclerView$o.getChildMeasureSpec(n3, n8, n4, n7, bl2);
    }

    public int getChildWidthMeasureSpec(int n3, int n4, int n7) {
        n3 = this.getWidth();
        int n8 = this.getWidthMode();
        boolean bl2 = this.canScrollHorizontally();
        return RecyclerView$o.getChildMeasureSpec(n3, n8, n4, n7, bl2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int getDecorationLengthCrossAxis(View view) {
        int n3;
        int n4 = this.isMainAxisDirectionHorizontal();
        if (n4 != 0) {
            n4 = this.getTopDecorationHeight(view);
            n3 = this.getBottomDecorationHeight(view);
            return n3 + n4;
        }
        n4 = this.getLeftDecorationWidth(view);
        n3 = this.getRightDecorationWidth(view);
        return n3 + n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int getDecorationLengthMainAxis(View view, int n3, int n4) {
        int n7;
        n3 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0);
        if (n3 != 0) {
            n3 = this.getLeftDecorationWidth(view);
            n7 = this.getRightDecorationWidth(view);
            return n7 + n3;
        }
        n3 = this.getTopDecorationHeight(view);
        n7 = this.getBottomDecorationHeight(view);
        return n7 + n3;
    }

    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    public View getFlexItemAt(int n3) {
        View view = (View)this.mViewCache.get(n3);
        if (view != null) {
            return view;
        }
        return this.mRecycler.m((int)n3, (long)Long.MAX_VALUE).itemView;
    }

    public int getFlexItemCount() {
        return this.mState.b();
    }

    public List getFlexLines() {
        int n3 = this.mFlexLines.size();
        ArrayList<FlexLine> arrayList = new ArrayList<FlexLine>(n3);
        List list = this.mFlexLines;
        n3 = list.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            FlexLine flexLine = (FlexLine)this.mFlexLines.get(i3);
            int n4 = flexLine.getItemCount();
            if (n4 == 0) continue;
            arrayList.add(flexLine);
        }
        return arrayList;
    }

    public List getFlexLinesInternal() {
        return this.mFlexLines;
    }

    public int getFlexWrap() {
        return this.mFlexWrap;
    }

    public int getJustifyContent() {
        return this.mJustifyContent;
    }

    public int getLargestMainSize() {
        List list = this.mFlexLines;
        int n3 = list.size();
        if (n3 == 0) {
            return 0;
        }
        list = this.mFlexLines;
        n3 = list.size();
        int n4 = -1 << -1;
        for (int i3 = 0; i3 < n3; ++i3) {
            FlexLine flexLine = (FlexLine)this.mFlexLines.get(i3);
            int n7 = flexLine.mMainSize;
            n4 = Math.max(n4, n7);
        }
        return n4;
    }

    public int getMaxLine() {
        return this.mMaxLine;
    }

    public int getPositionToFlexLineIndex(int n3) {
        return this.mFlexboxHelper.mIndexToFlexLine[n3];
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public View getReorderedFlexItemAt(int n3) {
        return this.getFlexItemAt(n3);
    }

    public int getSumOfCrossSize() {
        List list = this.mFlexLines;
        int n3 = list.size();
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            FlexLine flexLine = (FlexLine)this.mFlexLines.get(i3);
            int n7 = flexLine.mCrossSize;
            n4 += n7;
        }
        return n4;
    }

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRtl() {
        return this.mIsRtl;
    }

    public boolean isMainAxisDirectionHorizontal() {
        int n3 = this.mFlexDirection;
        int n4 = 1;
        if (n3 != 0 && n3 != n4) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public void onAdapterChanged(RecyclerView$f recyclerView$f, RecyclerView$f recyclerView$f2) {
        this.removeAllViews();
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        recyclerView = (View)recyclerView.getParent();
        this.mParent = recyclerView;
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView$u recyclerView$u) {
        super.onDetachedFromWindow(recyclerView, recyclerView$u);
        boolean bl2 = this.mRecycleChildrenOnDetach;
        if (bl2) {
            this.removeAndRecycleAllViews(recyclerView$u);
            recyclerView$u.b();
        }
    }

    public void onItemsAdded(RecyclerView recyclerView, int n3, int n4) {
        super.onItemsAdded(recyclerView, n3, n4);
        this.updateDirtyPosition(n3);
    }

    public void onItemsMoved(RecyclerView recyclerView, int n3, int n4, int n7) {
        super.onItemsMoved(recyclerView, n3, n4, n7);
        int n8 = Math.min(n3, n4);
        this.updateDirtyPosition(n8);
    }

    public void onItemsRemoved(RecyclerView recyclerView, int n3, int n4) {
        super.onItemsRemoved(recyclerView, n3, n4);
        this.updateDirtyPosition(n3);
    }

    public void onItemsUpdated(RecyclerView recyclerView, int n3, int n4) {
        super.onItemsUpdated(recyclerView, n3, n4);
        this.updateDirtyPosition(n3);
    }

    public void onItemsUpdated(RecyclerView recyclerView, int n3, int n4, Object object) {
        super.onItemsUpdated(recyclerView, n3, n4, object);
        this.updateDirtyPosition(n3);
    }

    public void onLayoutChildren(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        int n3;
        int n4;
        this.mRecycler = recyclerView$u;
        this.mState = recyclerView$y;
        int n7 = recyclerView$y.b();
        if (n7 == 0 && (n4 = recyclerView$y.g) != 0) {
            return;
        }
        this.resolveLayoutDirection();
        this.ensureOrientationHelper();
        this.ensureLayoutState();
        this.mFlexboxHelper.ensureMeasureSpecCache(n7);
        this.mFlexboxHelper.ensureMeasuredSizeCache(n7);
        this.mFlexboxHelper.ensureIndexToFlexLine(n7);
        FlexboxLayoutManager$LayoutState.access$502(this.mLayoutState, false);
        Object object = this.mPendingSavedState;
        if (object != null && (n4 = FlexboxLayoutManager$SavedState.access$600((FlexboxLayoutManager$SavedState)object, n7)) != 0) {
            object = this.mPendingSavedState;
            this.mPendingScrollPosition = n4 = FlexboxLayoutManager$SavedState.access$200((FlexboxLayoutManager$SavedState)object);
        }
        object = this.mAnchorInfo;
        n4 = FlexboxLayoutManager$AnchorInfo.access$700((FlexboxLayoutManager$AnchorInfo)object);
        boolean bl2 = true;
        if (n4 == 0 || (n4 = this.mPendingScrollPosition) != (n3 = -1) || (object = this.mPendingSavedState) != null) {
            FlexboxLayoutManager$AnchorInfo.access$800(this.mAnchorInfo);
            object = this.mAnchorInfo;
            this.updateAnchorInfoForLayout(recyclerView$y, (FlexboxLayoutManager$AnchorInfo)object);
            object = this.mAnchorInfo;
            FlexboxLayoutManager$AnchorInfo.access$702((FlexboxLayoutManager$AnchorInfo)object, bl2);
        }
        this.detachAndScrapAttachedViews(recyclerView$u);
        object = this.mAnchorInfo;
        n4 = (int)(FlexboxLayoutManager$AnchorInfo.access$900((FlexboxLayoutManager$AnchorInfo)object) ? 1 : 0);
        if (n4 != 0) {
            object = this.mAnchorInfo;
            this.updateLayoutStateToFillStart((FlexboxLayoutManager$AnchorInfo)object, false, bl2);
        } else {
            object = this.mAnchorInfo;
            this.updateLayoutStateToFillEnd((FlexboxLayoutManager$AnchorInfo)object, false, bl2);
        }
        this.updateFlexLines(n7);
        Object object2 = this.mLayoutState;
        this.fill(recyclerView$u, recyclerView$y, (FlexboxLayoutManager$LayoutState)object2);
        object2 = this.mAnchorInfo;
        n7 = (int)(FlexboxLayoutManager$AnchorInfo.access$900((FlexboxLayoutManager$AnchorInfo)object2) ? 1 : 0);
        if (n7 != 0) {
            object2 = this.mLayoutState;
            n7 = FlexboxLayoutManager$LayoutState.access$1000((FlexboxLayoutManager$LayoutState)object2);
            object = this.mAnchorInfo;
            this.updateLayoutStateToFillEnd((FlexboxLayoutManager$AnchorInfo)object, bl2, false);
            object = this.mLayoutState;
            this.fill(recyclerView$u, recyclerView$y, (FlexboxLayoutManager$LayoutState)object);
            object = this.mLayoutState;
            n4 = FlexboxLayoutManager$LayoutState.access$1000((FlexboxLayoutManager$LayoutState)object);
        } else {
            n4 = FlexboxLayoutManager$LayoutState.access$1000(this.mLayoutState);
            object2 = this.mAnchorInfo;
            this.updateLayoutStateToFillStart((FlexboxLayoutManager$AnchorInfo)object2, bl2, false);
            object2 = this.mLayoutState;
            this.fill(recyclerView$u, recyclerView$y, (FlexboxLayoutManager$LayoutState)object2);
            object2 = this.mLayoutState;
            n7 = FlexboxLayoutManager$LayoutState.access$1000((FlexboxLayoutManager$LayoutState)object2);
        }
        n3 = this.getChildCount();
        if (n3 > 0) {
            FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo = this.mAnchorInfo;
            n3 = (int)(FlexboxLayoutManager$AnchorInfo.access$900(flexboxLayoutManager$AnchorInfo) ? 1 : 0);
            if (n3 != 0) {
                n4 = this.fixLayoutEndGap(n4, recyclerView$u, recyclerView$y, bl2);
                this.fixLayoutStartGap(n7 += n4, recyclerView$u, recyclerView$y, false);
            } else {
                n7 = this.fixLayoutStartGap(n7, recyclerView$u, recyclerView$y, bl2);
                this.fixLayoutEndGap(n4 += n7, recyclerView$u, recyclerView$y, false);
            }
        }
    }

    public void onLayoutCompleted(RecyclerView$y recyclerView$y) {
        int n3;
        super.onLayoutCompleted(recyclerView$y);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = n3 = -1;
        this.mPendingScrollPositionOffset = -1 << -1;
        this.mDirtyPosition = n3;
        FlexboxLayoutManager$AnchorInfo.access$800(this.mAnchorInfo);
        this.mViewCache.clear();
    }

    public void onNewFlexItemAdded(View view, int n3, int n4, FlexLine flexLine) {
        Rect rect = TEMP_RECT;
        this.calculateItemDecorationsForChild(view, rect);
        n3 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0);
        if (n3 != 0) {
            n3 = this.getLeftDecorationWidth(view);
            int n7 = this.getRightDecorationWidth(view) + n3;
            flexLine.mMainSize = n3 = flexLine.mMainSize + n7;
            flexLine.mDividerLengthInMainSize = n3 = flexLine.mDividerLengthInMainSize + n7;
        } else {
            n3 = this.getTopDecorationHeight(view);
            int n8 = this.getBottomDecorationHeight(view) + n3;
            flexLine.mMainSize = n3 = flexLine.mMainSize + n8;
            flexLine.mDividerLengthInMainSize = n3 = flexLine.mDividerLengthInMainSize + n8;
        }
    }

    public void onNewFlexLineAdded(FlexLine flexLine) {
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean bl2 = parcelable instanceof FlexboxLayoutManager$SavedState;
        if (bl2) {
            parcelable = (FlexboxLayoutManager$SavedState)parcelable;
            this.mPendingSavedState = parcelable;
            this.requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        FlexboxLayoutManager$SavedState flexboxLayoutManager$SavedState = this.mPendingSavedState;
        if (flexboxLayoutManager$SavedState != null) {
            FlexboxLayoutManager$SavedState flexboxLayoutManager$SavedState2 = this.mPendingSavedState;
            flexboxLayoutManager$SavedState = new FlexboxLayoutManager$SavedState(flexboxLayoutManager$SavedState2, null);
            return flexboxLayoutManager$SavedState;
        }
        flexboxLayoutManager$SavedState = new FlexboxLayoutManager$SavedState();
        int n3 = this.getChildCount();
        if (n3 > 0) {
            View view = this.getChildClosestToStart();
            int n4 = this.getPosition(view);
            FlexboxLayoutManager$SavedState.access$202(flexboxLayoutManager$SavedState, n4);
            n3 = this.mOrientationHelper.e(view);
            t t3 = this.mOrientationHelper;
            n4 = t3.k();
            FlexboxLayoutManager$SavedState.access$302(flexboxLayoutManager$SavedState, n3 -= n4);
        } else {
            FlexboxLayoutManager$SavedState.access$400(flexboxLayoutManager$SavedState);
        }
        return flexboxLayoutManager$SavedState;
    }

    public int scrollHorizontallyBy(int n3, RecyclerView$u object, RecyclerView$y recyclerView$y) {
        int n4 = this.isMainAxisDirectionHorizontal();
        if (n4 != 0 && (n4 = this.mFlexWrap) != 0) {
            n3 = this.handleScrollingSubOrientation(n3);
            FlexboxLayoutManager$AnchorInfo.access$2412(this.mAnchorInfo, n3);
            object = this.mSubOrientationHelper;
            int n7 = -n3;
            ((t)object).p(n7);
            return n3;
        }
        n3 = this.handleScrollingMainOrientation(n3, (RecyclerView$u)object, recyclerView$y);
        this.mViewCache.clear();
        return n3;
    }

    public void scrollToPosition(int n3) {
        this.mPendingScrollPosition = n3;
        this.mPendingScrollPositionOffset = n3 = -1 << -1;
        FlexboxLayoutManager$SavedState flexboxLayoutManager$SavedState = this.mPendingSavedState;
        if (flexboxLayoutManager$SavedState != null) {
            FlexboxLayoutManager$SavedState.access$400(flexboxLayoutManager$SavedState);
        }
        this.requestLayout();
    }

    public int scrollVerticallyBy(int n3, RecyclerView$u object, RecyclerView$y recyclerView$y) {
        int n4 = this.isMainAxisDirectionHorizontal();
        if (n4 == 0 && ((n4 = this.mFlexWrap) != 0 || (n4 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0)) != 0)) {
            n3 = this.handleScrollingSubOrientation(n3);
            FlexboxLayoutManager$AnchorInfo.access$2412(this.mAnchorInfo, n3);
            object = this.mSubOrientationHelper;
            int n7 = -n3;
            ((t)object).p(n7);
            return n3;
        }
        n3 = this.handleScrollingMainOrientation(n3, (RecyclerView$u)object, recyclerView$y);
        this.mViewCache.clear();
        return n3;
    }

    public void setAlignContent(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Setting the alignContent in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to use this attribute.");
        throw unsupportedOperationException;
    }

    public void setAlignItems(int n3) {
        int n4 = this.mAlignItems;
        if (n4 != n3) {
            int n7 = 4;
            if (n4 == n7 || n3 == n7) {
                this.removeAllViews();
                this.clearFlexLines();
            }
            this.mAlignItems = n3;
            this.requestLayout();
        }
    }

    public void setFlexDirection(int n3) {
        int n4 = this.mFlexDirection;
        if (n4 != n3) {
            this.removeAllViews();
            this.mFlexDirection = n3;
            n3 = 0;
            this.mOrientationHelper = null;
            this.mSubOrientationHelper = null;
            this.clearFlexLines();
            this.requestLayout();
        }
    }

    public void setFlexLines(List list) {
        this.mFlexLines = list;
    }

    public void setFlexWrap(int n3) {
        int n4 = 2;
        if (n3 != n4) {
            n4 = this.mFlexWrap;
            if (n4 != n3) {
                if (n4 == 0 || n3 == 0) {
                    this.removeAllViews();
                    this.clearFlexLines();
                }
                this.mFlexWrap = n3;
                n3 = 0;
                Object var3_3 = null;
                this.mOrientationHelper = null;
                this.mSubOrientationHelper = null;
                this.requestLayout();
            }
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        throw unsupportedOperationException;
    }

    public void setJustifyContent(int n3) {
        int n4 = this.mJustifyContent;
        if (n4 != n3) {
            this.mJustifyContent = n3;
            this.requestLayout();
        }
    }

    public void setMaxLine(int n3) {
        int n4 = this.mMaxLine;
        if (n4 != n3) {
            this.mMaxLine = n3;
            this.requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean bl2) {
        this.mRecycleChildrenOnDetach = bl2;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView$y object, int n3) {
        recyclerView = recyclerView.getContext();
        object = new o((Context)recyclerView);
        ((RecyclerView$x)object).setTargetPosition(n3);
        this.startSmoothScroll((RecyclerView$x)object);
    }

    public void updateViewCache(int n3, View view) {
        this.mViewCache.put(n3, (Object)view);
    }
}

