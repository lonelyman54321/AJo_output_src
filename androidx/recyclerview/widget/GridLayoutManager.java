/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.GridView
 */
package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GapWorker$b;
import androidx.recyclerview.widget.GridLayoutManager$LayoutParams;
import androidx.recyclerview.widget.GridLayoutManager$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager$SavedState;
import androidx.recyclerview.widget.LinearLayoutManager$a;
import androidx.recyclerview.widget.LinearLayoutManager$b;
import androidx.recyclerview.widget.LinearLayoutManager$c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$o$c;
import androidx.recyclerview.widget.RecyclerView$u;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.t;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class GridLayoutManager
extends LinearLayoutManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = 255;
    private static final int INVALID_POSITION = 255;
    private static final String TAG = "GridLayoutManager";
    private static final Set sSupportedDirectionsForActionScrollInDirection;
    int[] mCachedBorders;
    int mColumnWithAccessibilityFocus;
    final Rect mDecorInsets;
    boolean mPendingSpanCountChange = false;
    private int mPositionTargetedByScrollInDirection;
    final SparseIntArray mPreLayoutSpanIndexCache;
    final SparseIntArray mPreLayoutSpanSizeCache;
    int mRowWithAccessibilityFocus;
    View[] mSet;
    int mSpanCount;
    GridLayoutManager$b mSpanSizeLookup;
    private boolean mUsingSpansToEstimateScrollBarDimensions;

    static {
        Object object = 17;
        Integer n3 = 66;
        Integer n4 = 33;
        Integer n7 = 130;
        Integer[] integerArray = new Integer[]{object, n3, n4, n7};
        object = Arrays.asList(integerArray);
        HashSet hashSet = new HashSet(object);
        sSupportedDirectionsForActionScrollInDirection = Collections.unmodifiableSet(hashSet);
    }

    public GridLayoutManager(Context context, int n3) {
        super(context);
        Object object;
        int n4;
        this.mSpanCount = n4 = -1;
        this.mPreLayoutSpanSizeCache = object = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = object = new SparseIntArray();
        super();
        this.mSpanSizeLookup = object;
        super();
        this.mDecorInsets = object;
        this.mPositionTargetedByScrollInDirection = n4;
        this.mRowWithAccessibilityFocus = n4;
        this.mColumnWithAccessibilityFocus = n4;
        this.setSpanCount(n3);
    }

    public GridLayoutManager(Context context, int n3, int n4, boolean bl2) {
        super(context, n4, bl2);
        Object object;
        int n7;
        this.mSpanCount = n7 = -1;
        this.mPreLayoutSpanSizeCache = object = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = object = new SparseIntArray();
        super();
        this.mSpanSizeLookup = object;
        super();
        this.mDecorInsets = object;
        this.mPositionTargetedByScrollInDirection = n7;
        this.mRowWithAccessibilityFocus = n7;
        this.mColumnWithAccessibilityFocus = n7;
        this.setSpanCount(n3);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int n3, int n4) {
        super(context, attributeSet, n3, n4);
        Object object;
        int n7;
        this.mSpanCount = n7 = -1;
        this.mPreLayoutSpanSizeCache = object = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = object = new SparseIntArray();
        super();
        this.mSpanSizeLookup = object;
        super();
        this.mDecorInsets = object;
        this.mPositionTargetedByScrollInDirection = n7;
        this.mRowWithAccessibilityFocus = n7;
        this.mColumnWithAccessibilityFocus = n7;
        int n8 = RecyclerView$o.getProperties((Context)context, (AttributeSet)attributeSet, (int)n3, (int)n4).b;
        this.setSpanCount(n8);
    }

    private void assignSpans(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y, int n3, boolean n4) {
        int n7;
        int n8 = 0;
        if (n4 != 0) {
            n4 = n3;
            n3 = 0;
            n7 = 1;
        } else {
            n3 += -1;
            n4 = -1;
            n7 = -1;
        }
        while (n3 != n4) {
            View view = this.mSet[n3];
            GridLayoutManager$LayoutParams gridLayoutManager$LayoutParams = (GridLayoutManager$LayoutParams)view.getLayoutParams();
            int n10 = this.getPosition(view);
            gridLayoutManager$LayoutParams.b = n10 = this.getSpanSize(recyclerView$u, recyclerView$y, n10);
            gridLayoutManager$LayoutParams.a = n8;
            n8 += n10;
            n3 += n7;
        }
    }

    private void cachePreLayoutSpanMapping() {
        int n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            GridLayoutManager$LayoutParams gridLayoutManager$LayoutParams = (GridLayoutManager$LayoutParams)this.getChildAt(i3).getLayoutParams();
            int n4 = gridLayoutManager$LayoutParams.getViewLayoutPosition();
            SparseIntArray sparseIntArray = this.mPreLayoutSpanSizeCache;
            int n7 = gridLayoutManager$LayoutParams.b;
            sparseIntArray.put(n4, n7);
            sparseIntArray = this.mPreLayoutSpanIndexCache;
            int n8 = gridLayoutManager$LayoutParams.a;
            sparseIntArray.put(n4, n8);
        }
    }

    private void calculateItemBorders(int n3) {
        int[] nArray = this.mCachedBorders;
        int n4 = this.mSpanCount;
        int[] nArray2 = GridLayoutManager.calculateItemBorders(nArray, n4, n3);
        this.mCachedBorders = nArray2;
    }

    public static int[] calculateItemBorders(int[] nArray, int n3, int n4) {
        int n7;
        int n8;
        int n10;
        block7: {
            block6: {
                n10 = 1;
                if (nArray == null || (n8 = nArray.length) != (n7 = n3 + 1)) break block6;
                n8 = nArray.length - n10;
                if ((n8 = nArray[n8]) == n4) break block7;
            }
            int n14 = n3 + 1;
            nArray = new int[n14];
        }
        n8 = 0;
        nArray[0] = 0;
        n7 = n4 / n3;
        n4 %= n3;
        int n15 = 0;
        while (n10 <= n3) {
            int n16;
            if ((n8 += n4) > 0 && (n16 = n3 - n8) < n4) {
                n16 = n7 + 1;
                n8 -= n3;
            } else {
                n16 = n7;
            }
            nArray[n10] = n15 += n16;
            ++n10;
        }
        return nArray;
    }

    private void clearPreLayoutSpanMappingCache() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    private int computeScrollOffsetWithSpanInfo(RecyclerView$y recyclerView$y) {
        int n3 = this.getChildCount();
        int n4 = 0;
        float f5 = 0.0f;
        GridLayoutManager$b gridLayoutManager$b = null;
        if (n3 != 0 && (n3 = recyclerView$y.b()) != 0) {
            this.ensureLayoutState();
            n3 = (int)(this.isSmoothScrollbarEnabled() ? 1 : 0);
            int n7 = n3 ^ 1;
            int n8 = 1;
            View view = this.findFirstVisibleChildClosestToStart(n7 != 0, n8 != 0);
            View view2 = this.findFirstVisibleChildClosestToEnd(n7 != 0, n8 != 0);
            if (view != null && view2 != null) {
                GridLayoutManager$b gridLayoutManager$b2 = this.mSpanSizeLookup;
                int n10 = this.getPosition(view);
                int n14 = this.mSpanCount;
                int n15 = gridLayoutManager$b2.a(n10, n14);
                GridLayoutManager$b gridLayoutManager$b3 = this.mSpanSizeLookup;
                n14 = this.getPosition(view2);
                int n16 = this.mSpanCount;
                n10 = gridLayoutManager$b3.a(n14, n16);
                n14 = Math.min(n15, n10);
                n15 = Math.max(n15, n10);
                gridLayoutManager$b3 = this.mSpanSizeLookup;
                int n17 = recyclerView$y.b() - n8;
                n16 = this.mSpanCount;
                n17 = gridLayoutManager$b3.a(n17, n16) + n8;
                n10 = (int)(this.mShouldReverseLayout ? 1 : 0);
                if (n10 != 0) {
                    n17 = n17 - n15 - n8;
                    n17 = Math.max(0, n17);
                } else {
                    n17 = Math.max(0, n14);
                }
                if (n3 == 0) {
                    return n17;
                }
                n3 = this.mOrientationHelper.b(view2);
                n4 = this.mOrientationHelper.e(view);
                n3 = Math.abs(n3 - n4);
                gridLayoutManager$b = this.mSpanSizeLookup;
                n15 = this.getPosition(view);
                n10 = this.mSpanCount;
                n4 = gridLayoutManager$b.a(n15, n10);
                gridLayoutManager$b2 = this.mSpanSizeLookup;
                n7 = this.getPosition(view2);
                n10 = this.mSpanCount;
                n7 = gridLayoutManager$b2.a(n7, n10) - n4 + n8;
                float f6 = n3;
                f5 = n7;
                float f7 = (float)n17 * (f6 /= f5);
                n3 = this.mOrientationHelper.k();
                n4 = this.mOrientationHelper.e(view);
                f6 = n3 - n4;
                return Math.round(f7 + f6);
            }
        }
        return 0;
    }

    private int computeScrollRangeWithSpanInfo(RecyclerView$y recyclerView$y) {
        int n3 = this.getChildCount();
        int n4 = 0;
        float f5 = 0.0f;
        if (n3 != 0 && (n3 = recyclerView$y.b()) != 0) {
            this.ensureLayoutState();
            n3 = (int)(this.isSmoothScrollbarEnabled() ? 1 : 0);
            int n7 = 1;
            Object object = this.findFirstVisibleChildClosestToStart((n3 ^= n7) != 0, n7 != 0);
            int n8 = this.isSmoothScrollbarEnabled() ^ n7;
            View view = this.findFirstVisibleChildClosestToEnd(n8 != 0, n7 != 0);
            if (object != null && view != null) {
                n4 = this.isSmoothScrollbarEnabled();
                if (n4 == 0) {
                    object = this.mSpanSizeLookup;
                    int n10 = recyclerView$y.b() - n7;
                    n4 = this.mSpanCount;
                    return ((GridLayoutManager$b)object).a(n10, n4) + n7;
                }
                n4 = this.mOrientationHelper.b(view);
                int n14 = this.mOrientationHelper.e((View)object);
                n4 -= n14;
                GridLayoutManager$b gridLayoutManager$b = this.mSpanSizeLookup;
                n3 = this.getPosition((View)object);
                int n15 = this.mSpanCount;
                n3 = gridLayoutManager$b.a(n3, n15);
                gridLayoutManager$b = this.mSpanSizeLookup;
                n8 = this.getPosition(view);
                n15 = this.mSpanCount;
                n8 = gridLayoutManager$b.a(n8, n15);
                gridLayoutManager$b = this.mSpanSizeLookup;
                int n16 = recyclerView$y.b() - n7;
                n15 = this.mSpanCount;
                n16 = gridLayoutManager$b.a(n16, n15) + n7;
                n8 = n8 - n3 + n7;
                float f6 = n4;
                f5 = n8;
                float f7 = n16;
                return (int)((f6 /= f5) * f7);
            }
        }
        return 0;
    }

    private void ensureAnchorIsInCorrectSpan(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y, LinearLayoutManager$a linearLayoutManager$a, int n3) {
        int n4 = 1;
        n3 = n3 == n4 ? 1 : 0;
        int n7 = linearLayoutManager$a.b;
        n7 = this.getSpanIndex(recyclerView$u, recyclerView$y, n7);
        if (n3 != 0) {
            while (n7 > 0 && (n3 = linearLayoutManager$a.b) > 0) {
                linearLayoutManager$a.b = n3 += -1;
                n7 = this.getSpanIndex(recyclerView$u, recyclerView$y, n3);
            }
        } else {
            int n8;
            int n10;
            n3 = recyclerView$y.b() - n4;
            n4 = linearLayoutManager$a.b;
            while (n4 < n3 && (n10 = this.getSpanIndex(recyclerView$u, recyclerView$y, n8 = n4 + 1)) > n7) {
                n4 = n8;
                n7 = n10;
            }
            linearLayoutManager$a.b = n4;
        }
    }

    private void ensureViewSet() {
        int n3;
        int n4;
        View[] viewArray = this.mSet;
        if (viewArray == null || (n4 = viewArray.length) != (n3 = this.mSpanCount)) {
            n4 = this.mSpanCount;
            this.mSet = viewArray = new View[n4];
        }
    }

    private View findChildWithAccessibilityFocus() {
        View view;
        block1: {
            int n3;
            int n4;
            view = null;
            for (n4 = 0; n4 < (n3 = this.getChildCount()); ++n4) {
                View view2 = this.getChildAt(n4);
                Objects.requireNonNull(view2);
                n3 = (int)(view2.isAccessibilityFocused() ? 1 : 0);
                if (n3 == 0) continue;
                view = this.getChildAt(n4);
                break block1;
            }
            n4 = 0;
            view = null;
        }
        return view;
    }

    private int findScrollTargetPositionAbove(int n3, int n4, int n7) {
        block6: {
            block5: {
                int n8;
                int n10 = 1;
                n7 -= n10;
                while (true) {
                    n8 = -1;
                    if (n7 < 0) break block5;
                    int n14 = this.getRowIndex(n7);
                    int n15 = this.getColumnIndex(n7);
                    if (n14 < 0 || n15 < 0) break;
                    n8 = this.mOrientation;
                    if (n8 == n10) {
                        Integer n16;
                        Set set;
                        if (n14 < n3 && (n8 = (int)((set = this.getColumnIndices(n7)).contains(n16 = Integer.valueOf(n4)) ? 1 : 0)) != 0) {
                            this.mRowWithAccessibilityFocus = n14;
                            break block6;
                        }
                    } else if (n14 < n3 && n15 == n4) {
                        Integer n17 = (Integer)Collections.max(this.getRowIndices(n7));
                        this.mRowWithAccessibilityFocus = n3 = n17.intValue();
                        break block6;
                    }
                    n7 += -1;
                }
                return n8;
            }
            n7 = -1;
        }
        return n7;
    }

    private int findScrollTargetPositionBelow(int n3, int n4, int n7) {
        block6: {
            block5: {
                int n8;
                int n10 = 1;
                n7 += n10;
                while (true) {
                    int n14 = this.getItemCount();
                    n8 = -1;
                    if (n7 >= n14) break block5;
                    n14 = this.getRowIndex(n7);
                    int n15 = this.getColumnIndex(n7);
                    if (n14 < 0 || n15 < 0) break;
                    n8 = this.mOrientation;
                    if (n8 == n10) {
                        Integer n16;
                        Set set;
                        if (n14 > n3 && (n15 == n4 || (n8 = (int)((set = this.getColumnIndices(n7)).contains(n16 = Integer.valueOf(n4)) ? 1 : 0)) != 0)) {
                            this.mRowWithAccessibilityFocus = n14;
                            break block6;
                        }
                    } else if (n14 > n3 && n15 == n4) {
                        this.mRowWithAccessibilityFocus = n3 = this.getRowIndex(n7);
                        break block6;
                    }
                    ++n7;
                }
                return n8;
            }
            n7 = -1;
        }
        return n7;
    }

    private int findScrollTargetPositionOnTheLeft(int n3, int n4, int n7) {
        block6: {
            block5: {
                int n8;
                int n10 = 1;
                n7 -= n10;
                while (true) {
                    n8 = -1;
                    if (n7 < 0) break block5;
                    int n14 = this.getRowIndex(n7);
                    int n15 = this.getColumnIndex(n7);
                    if (n14 < 0 || n15 < 0) break;
                    n8 = this.mOrientation;
                    if (n8 == n10) {
                        if (n14 == n3 && n15 < n4 || n14 < n3) {
                            this.mRowWithAccessibilityFocus = n14;
                            this.mColumnWithAccessibilityFocus = n15;
                            break block6;
                        }
                    } else {
                        Integer n16;
                        Set set = this.getRowIndices(n7);
                        n8 = (int)(set.contains(n16 = Integer.valueOf(n3)) ? 1 : 0);
                        if (n8 != 0 && n15 < n4) {
                            this.mColumnWithAccessibilityFocus = n15;
                            return n7;
                        }
                    }
                    n7 += -1;
                }
                return n8;
            }
            n7 = -1;
        }
        return n7;
    }

    private int findScrollTargetPositionOnTheRight(int n3, int n4, int n7) {
        int n8;
        int n10 = 1;
        n7 += n10;
        while (true) {
            Integer n14;
            Set set;
            int n15 = this.getItemCount();
            n8 = -1;
            if (n7 >= n15) break;
            n15 = this.getRowIndex(n7);
            int n16 = this.getColumnIndex(n7);
            if (n15 < 0 || n16 < 0) break;
            n8 = this.mOrientation;
            if (n8 == n10) {
                if (n15 == n3 && n16 > n4 || n15 > n3) {
                    this.mRowWithAccessibilityFocus = n15;
                    this.mColumnWithAccessibilityFocus = n16;
                    return n7;
                }
            } else if (n16 > n4 && (n15 = (int)((set = this.getRowIndices(n7)).contains(n14 = Integer.valueOf(n3)) ? 1 : 0)) != 0) {
                this.mColumnWithAccessibilityFocus = n16;
                return n7;
            }
            ++n7;
        }
        return n8;
    }

    private int getColumnIndex(int n3) {
        int n4 = this.mOrientation;
        if (n4 == 0) {
            Object object = this.mRecyclerView;
            RecyclerView$u recyclerView$u = ((RecyclerView)object).mRecycler;
            object = ((RecyclerView)object).mState;
            n3 = this.getSpanGroupIndex(recyclerView$u, (RecyclerView$y)object, n3);
        } else {
            Object object = this.mRecyclerView;
            RecyclerView$u recyclerView$u = ((RecyclerView)object).mRecycler;
            object = ((RecyclerView)object).mState;
            n3 = this.getSpanIndex(recyclerView$u, (RecyclerView$y)object, n3);
        }
        return n3;
    }

    private Set getColumnIndices(int n3) {
        int n4 = this.getColumnIndex(n3);
        return this.getRowOrColumnIndices(n4, n3);
    }

    private int getRowIndex(int n3) {
        int n4 = this.mOrientation;
        int n7 = 1;
        if (n4 == n7) {
            Object object = this.mRecyclerView;
            RecyclerView$u recyclerView$u = ((RecyclerView)object).mRecycler;
            object = ((RecyclerView)object).mState;
            n3 = this.getSpanGroupIndex(recyclerView$u, (RecyclerView$y)object, n3);
        } else {
            Object object = this.mRecyclerView;
            RecyclerView$u recyclerView$u = ((RecyclerView)object).mRecycler;
            object = ((RecyclerView)object).mState;
            n3 = this.getSpanIndex(recyclerView$u, (RecyclerView$y)object, n3);
        }
        return n3;
    }

    private Set getRowIndices(int n3) {
        int n4 = this.getRowIndex(n3);
        return this.getRowOrColumnIndices(n4, n3);
    }

    private Set getRowOrColumnIndices(int n3, int n4) {
        int n7;
        HashSet<Object> hashSet = new HashSet<Object>();
        Object object = this.mRecyclerView;
        Object object2 = ((RecyclerView)object).mRecycler;
        object = ((RecyclerView)object).mState;
        n4 = this.getSpanSize((RecyclerView$u)object2, (RecyclerView$y)object, n4);
        for (int i3 = n3; i3 < (n7 = n3 + n4); ++i3) {
            object2 = i3;
            hashSet.add(object2);
        }
        return hashSet;
    }

    private int getSpanGroupIndex(RecyclerView$u object, RecyclerView$y object2, int n3) {
        int n4 = ((RecyclerView$y)object2).g;
        if (n4 == 0) {
            object = this.mSpanSizeLookup;
            n4 = this.mSpanCount;
            return ((GridLayoutManager$b)object).a(n3, n4);
        }
        int n7 = ((RecyclerView$u)object).c(n3);
        if (n7 == (n4 = -1)) {
            return 0;
        }
        object2 = this.mSpanSizeLookup;
        n3 = this.mSpanCount;
        return ((GridLayoutManager$b)object2).a(n7, n3);
    }

    private int getSpanIndex(RecyclerView$u object, RecyclerView$y object2, int n3) {
        int n4 = ((RecyclerView$y)object2).g;
        if (n4 == 0) {
            object = this.mSpanSizeLookup;
            n4 = this.mSpanCount;
            return ((GridLayoutManager$b)object).b(n3, n4);
        }
        object2 = this.mPreLayoutSpanIndexCache;
        int n7 = -1;
        n4 = object2.get(n3, n7);
        if (n4 != n7) {
            return n4;
        }
        int n8 = ((RecyclerView$u)object).c(n3);
        if (n8 == n7) {
            return 0;
        }
        object2 = this.mSpanSizeLookup;
        n3 = this.mSpanCount;
        return ((GridLayoutManager$b)object2).b(n8, n3);
    }

    private int getSpanSize(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y, int n3) {
        int n4 = recyclerView$y.g;
        if (n4 == 0) {
            return this.mSpanSizeLookup.c(n3);
        }
        recyclerView$y = this.mPreLayoutSpanSizeCache;
        int n7 = -1;
        n4 = recyclerView$y.get(n3, n7);
        if (n4 != n7) {
            return n4;
        }
        int n8 = recyclerView$u.c(n3);
        if (n8 == n7) {
            return 1;
        }
        return this.mSpanSizeLookup.c(n8);
    }

    private void guessMeasurement(float f5, int n3) {
        float f6 = this.mSpanCount;
        int n4 = Math.max(Math.round(f5 * f6), n3);
        this.calculateItemBorders(n4);
    }

    private boolean hasAccessibilityFocusChanged(int n3) {
        Set set;
        int n4;
        Integer n7;
        Object object = this.getRowIndices(n3);
        int n8 = object.contains(n7 = Integer.valueOf(n4 = this.mRowWithAccessibilityFocus));
        if (n8 != 0 && (n3 = (int)((set = this.getColumnIndices(n3)).contains(object = Integer.valueOf(n8 = this.mColumnWithAccessibilityFocus)) ? 1 : 0)) != 0) {
            n3 = 0;
            set = null;
        } else {
            n3 = 1;
        }
        return n3 != 0;
    }

    private void measureChild(View view, int n3, boolean bl2) {
        int n4;
        GridLayoutManager$LayoutParams gridLayoutManager$LayoutParams = (GridLayoutManager$LayoutParams)view.getLayoutParams();
        Object object = gridLayoutManager$LayoutParams.mDecorInsets;
        int n7 = ((Rect)object).top;
        int n8 = ((Rect)object).bottom;
        n7 += n8;
        n8 = gridLayoutManager$LayoutParams.topMargin;
        n7 += n8;
        n8 = gridLayoutManager$LayoutParams.bottomMargin;
        n7 += n8;
        n8 = ((Rect)object).left;
        int n10 = ((Rect)object).right;
        n8 += n10;
        n10 = gridLayoutManager$LayoutParams.leftMargin;
        n8 += n10;
        n10 = gridLayoutManager$LayoutParams.rightMargin;
        n8 += n10;
        n10 = gridLayoutManager$LayoutParams.a;
        int bl3 = gridLayoutManager$LayoutParams.b;
        n10 = this.getSpaceForSpanRange(n10, bl3);
        int n14 = this.mOrientation;
        int n15 = 1;
        if (n14 == n15) {
            int n16 = gridLayoutManager$LayoutParams.width;
            n3 = RecyclerView$o.getChildMeasureSpec(n10, n3, n8, n16, false);
            object = this.mOrientationHelper;
            n10 = ((t)object).l();
            n8 = this.getHeightMode();
            n4 = gridLayoutManager$LayoutParams.height;
            n4 = RecyclerView$o.getChildMeasureSpec(n10, n8, n7, n4, n15 != 0);
        } else {
            int n17 = gridLayoutManager$LayoutParams.height;
            n3 = RecyclerView$o.getChildMeasureSpec(n10, n3, n7, n17, false);
            object = this.mOrientationHelper;
            n10 = ((t)object).l();
            n7 = this.getWidthMode();
            n4 = gridLayoutManager$LayoutParams.width;
            int n18 = RecyclerView$o.getChildMeasureSpec(n10, n7, n8, n4, n15 != 0);
            n4 = n3;
            n3 = n18;
        }
        this.measureChildWithDecorationsAndMargin(view, n3, n4, bl2);
    }

    private void measureChildWithDecorationsAndMargin(View view, int n3, int n4, boolean bl2) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        if (bl2 = bl2 ? this.shouldReMeasureChild(view, n3, n4, recyclerView$LayoutParams) : this.shouldMeasureChild(view, n3, n4, recyclerView$LayoutParams)) {
            view.measure(n3, n4);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void updateMeasurements() {
        int n3;
        int n4 = this.getOrientation();
        if (n4 == (n3 = 1)) {
            n4 = this.getWidth();
            n3 = this.getPaddingRight();
            n4 -= n3;
            n3 = this.getPaddingLeft();
        } else {
            n4 = this.getHeight();
            n3 = this.getPaddingBottom();
            n4 -= n3;
            n3 = this.getPaddingTop();
        }
        this.calculateItemBorders(n4 -= n3);
    }

    public boolean checkLayoutParams(RecyclerView$LayoutParams recyclerView$LayoutParams) {
        return recyclerView$LayoutParams instanceof GridLayoutManager$LayoutParams;
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView$y recyclerView$y, LinearLayoutManager$c linearLayoutManager$c, RecyclerView$o$c recyclerView$o$c) {
        int n3;
        int n4;
        int n7 = this.mSpanCount;
        for (int i3 = 0; i3 < (n4 = this.mSpanCount) && (n4 = linearLayoutManager$c.d) >= 0 && n4 < (n3 = recyclerView$y.b()) && n7 > 0; n7 -= n4, ++i3) {
            n4 = linearLayoutManager$c.d;
            n3 = linearLayoutManager$c.g;
            n3 = Math.max(0, n3);
            RecyclerView$o$c recyclerView$o$c2 = recyclerView$o$c;
            recyclerView$o$c2 = (GapWorker$b)recyclerView$o$c;
            ((GapWorker$b)recyclerView$o$c2).a(n4, n3);
            GridLayoutManager$b gridLayoutManager$b = this.mSpanSizeLookup;
            n4 = gridLayoutManager$b.c(n4);
            n4 = linearLayoutManager$c.d;
            n3 = linearLayoutManager$c.e;
            linearLayoutManager$c.d = n4 += n3;
        }
    }

    public int computeHorizontalScrollOffset(RecyclerView$y recyclerView$y) {
        boolean bl2 = this.mUsingSpansToEstimateScrollBarDimensions;
        if (bl2) {
            return this.computeScrollOffsetWithSpanInfo(recyclerView$y);
        }
        return super.computeHorizontalScrollOffset(recyclerView$y);
    }

    public int computeHorizontalScrollRange(RecyclerView$y recyclerView$y) {
        boolean bl2 = this.mUsingSpansToEstimateScrollBarDimensions;
        if (bl2) {
            return this.computeScrollRangeWithSpanInfo(recyclerView$y);
        }
        return super.computeHorizontalScrollRange(recyclerView$y);
    }

    public int computeVerticalScrollOffset(RecyclerView$y recyclerView$y) {
        boolean bl2 = this.mUsingSpansToEstimateScrollBarDimensions;
        if (bl2) {
            return this.computeScrollOffsetWithSpanInfo(recyclerView$y);
        }
        return super.computeVerticalScrollOffset(recyclerView$y);
    }

    public int computeVerticalScrollRange(RecyclerView$y recyclerView$y) {
        boolean bl2 = this.mUsingSpansToEstimateScrollBarDimensions;
        if (bl2) {
            return this.computeScrollRangeWithSpanInfo(recyclerView$y);
        }
        return super.computeVerticalScrollRange(recyclerView$y);
    }

    public int findPositionOfFirstItemOnARowBelowForHorizontalGrid(int n3) {
        int n4;
        Object object;
        int n7;
        int n8 = -1;
        if (n3 < 0) {
            return n8;
        }
        int n10 = this.mOrientation;
        int n14 = 1;
        if (n10 == n14) {
            return n8;
        }
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        n14 = 0;
        Iterator iterator = null;
        for (int i3 = 0; i3 < (n7 = this.getItemCount()); ++i3) {
            object = this.getRowIndices(i3).iterator();
            while ((n4 = object.hasNext()) != 0) {
                Integer n15 = (Integer)object.next();
                int n16 = n15;
                if (n16 < 0) {
                    return n8;
                }
                n16 = (int)(treeMap.containsKey(n15) ? 1 : 0);
                if (n16 != 0) continue;
                Integer n17 = i3;
                treeMap.put(n15, n17);
            }
        }
        iterator = treeMap.keySet().iterator();
        while ((n7 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Integer)iterator.next();
            n4 = (Integer)object;
            if (n4 <= n3) continue;
            n3 = (Integer)treeMap.get(object);
            this.mRowWithAccessibilityFocus = n4;
            this.mColumnWithAccessibilityFocus = 0;
            return n3;
        }
        return n8;
    }

    public int findPositionOfLastItemOnARowAboveForHorizontalGrid(int n3) {
        int n4;
        Object object;
        int n7;
        int n8 = -1;
        if (n3 < 0) {
            return n8;
        }
        int n10 = this.mOrientation;
        int n14 = 1;
        if (n10 == n14) {
            return n8;
        }
        Object object2 = Collections.reverseOrder();
        TreeMap treeMap = new TreeMap(object2);
        object2 = null;
        for (n14 = 0; n14 < (n7 = this.getItemCount()); ++n14) {
            object = this.getRowIndices(n14).iterator();
            while ((n4 = object.hasNext()) != 0) {
                Integer n15 = (Integer)object.next();
                int n16 = n15;
                if (n16 < 0) {
                    return n8;
                }
                Integer n17 = n14;
                treeMap.put(n15, n17);
            }
        }
        object2 = treeMap.keySet().iterator();
        while ((n7 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object = (Integer)object2.next();
            n4 = (Integer)object;
            if (n4 >= n3) continue;
            n3 = (Integer)treeMap.get(object);
            this.mRowWithAccessibilityFocus = n4;
            this.mColumnWithAccessibilityFocus = n8 = this.getColumnIndex(n3);
            return n3;
        }
        return n8;
    }

    /*
     * WARNING - void declaration
     */
    public View findReferenceChild(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y, boolean bl2, boolean bl3) {
        void var4_12;
        void var3_8;
        void var4_9;
        int n3 = this.getChildCount();
        int n4 = 1;
        if (var4_9 != false) {
            int n7 = this.getChildCount() - n4;
            int n8 = -1;
            n4 = -1;
        } else {
            int n10 = n3;
            boolean bl4 = false;
        }
        int n14 = recyclerView$y.b();
        this.ensureLayoutState();
        t t3 = this.mOrientationHelper;
        int n15 = t3.k();
        t t4 = this.mOrientationHelper;
        int n16 = t4.g();
        View view = null;
        View view2 = null;
        while (var3_8 != var4_12) {
            View view3 = this.getChildAt((int)var3_8);
            int n17 = this.getPosition(view3);
            if (n17 >= 0 && n17 < n14 && (n17 = this.getSpanIndex(recyclerView$u, recyclerView$y, n17)) == 0) {
                Object object = (RecyclerView$LayoutParams)view3.getLayoutParams();
                n17 = (int)(object.isItemRemoved() ? 1 : 0);
                if (n17 != 0) {
                    if (view2 == null) {
                        view2 = view3;
                    }
                } else {
                    object = this.mOrientationHelper;
                    n17 = ((t)object).e(view3);
                    if (n17 < n16 && (n17 = ((t)(object = this.mOrientationHelper)).b(view3)) >= n15) {
                        return view3;
                    }
                    if (view == null) {
                        view = view3;
                    }
                }
            }
            var3_8 += n4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    public RecyclerView$LayoutParams generateDefaultLayoutParams() {
        int n3 = this.mOrientation;
        int n4 = -1;
        int n7 = -2;
        if (n3 == 0) {
            GridLayoutManager$LayoutParams gridLayoutManager$LayoutParams = new GridLayoutManager$LayoutParams(n7, n4);
            return gridLayoutManager$LayoutParams;
        }
        GridLayoutManager$LayoutParams gridLayoutManager$LayoutParams = new GridLayoutManager$LayoutParams(n4, n7);
        return gridLayoutManager$LayoutParams;
    }

    public RecyclerView$LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        GridLayoutManager$LayoutParams gridLayoutManager$LayoutParams = new GridLayoutManager$LayoutParams(context, attributeSet);
        return gridLayoutManager$LayoutParams;
    }

    public RecyclerView$LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean bl2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        if (bl2) {
            layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
            GridLayoutManager$LayoutParams gridLayoutManager$LayoutParams = new RecyclerView$LayoutParams((ViewGroup.MarginLayoutParams)layoutParams);
            gridLayoutManager$LayoutParams.a = -1;
            gridLayoutManager$LayoutParams.b = 0;
            return gridLayoutManager$LayoutParams;
        }
        GridLayoutManager$LayoutParams gridLayoutManager$LayoutParams = new RecyclerView$LayoutParams(layoutParams);
        gridLayoutManager$LayoutParams.a = -1;
        gridLayoutManager$LayoutParams.b = 0;
        return gridLayoutManager$LayoutParams;
    }

    public int getColumnCountForAccessibility(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        int n3 = this.mOrientation;
        int n4 = 1;
        if (n3 == n4) {
            int n7 = this.mSpanCount;
            int n8 = this.getItemCount();
            return Math.min(n7, n8);
        }
        n3 = recyclerView$y.b();
        if (n3 < n4) {
            return 0;
        }
        n3 = recyclerView$y.b() - n4;
        return this.getSpanGroupIndex(recyclerView$u, recyclerView$y, n3) + n4;
    }

    public int getRowCountForAccessibility(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        int n3;
        int n4 = this.mOrientation;
        if (n4 == 0) {
            int n7 = this.mSpanCount;
            int n8 = this.getItemCount();
            return Math.min(n7, n8);
        }
        n4 = recyclerView$y.b();
        if (n4 < (n3 = 1)) {
            return 0;
        }
        n4 = recyclerView$y.b() - n3;
        return this.getSpanGroupIndex(recyclerView$u, recyclerView$y, n4) + n3;
    }

    public int getSpaceForSpanRange(int n3, int n4) {
        int n7 = this.mOrientation;
        int n8 = 1;
        if (n7 == n8 && (n7 = (int)(this.isLayoutRTL() ? 1 : 0)) != 0) {
            int[] nArray = this.mCachedBorders;
            n8 = this.mSpanCount;
            int n10 = n8 - n3;
            n10 = nArray[n10];
            n8 = n8 - n3 - n4;
            n3 = nArray[n8];
            return n10 - n3;
        }
        int[] nArray = this.mCachedBorders;
        n4 += n3;
        n4 = nArray[n4];
        n3 = nArray[n3];
        return n4 - n3;
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public GridLayoutManager$b getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.mUsingSpansToEstimateScrollBarDimensions;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void layoutChunk(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y, LinearLayoutManager$c linearLayoutManager$c, LinearLayoutManager$b linearLayoutManager$b) {
        float f5;
        int n3;
        View view;
        Object object;
        int n4;
        int n7;
        Object object2;
        int n8;
        Rect rect;
        int n10;
        GridLayoutManager gridLayoutManager = this;
        Object object3 = recyclerView$u;
        Object object4 = recyclerView$y;
        Object object5 = linearLayoutManager$c;
        LinearLayoutManager$b linearLayoutManager$b2 = linearLayoutManager$b;
        Object object6 = this.mOrientationHelper;
        Object object7 = ((t)object6).j();
        int n14 = 1;
        int n15 = 0;
        ViewGroup.LayoutParams layoutParams = null;
        Object object8 = 0x40000000;
        if (object7 != object8) {
            n10 = 1;
        } else {
            n10 = 0;
            rect = null;
        }
        int n16 = this.getChildCount();
        if (n16 > 0) {
            int[] nArray = gridLayoutManager.mCachedBorders;
            n8 = gridLayoutManager.mSpanCount;
            n16 = nArray[n8];
        } else {
            n16 = 0;
            Object var19_26 = null;
        }
        if (n10 != 0) {
            this.updateMeasurements();
        }
        if ((n8 = ((LinearLayoutManager$c)object5).e) == n14) {
            n8 = 1;
        } else {
            n8 = 0;
            object2 = null;
        }
        Object object9 = gridLayoutManager.mSpanCount;
        if (n8 == 0) {
            object9 = ((LinearLayoutManager$c)object5).d;
            object9 = gridLayoutManager.getSpanIndex((RecyclerView$u)object3, (RecyclerView$y)object4, (int)object9);
            n7 = ((LinearLayoutManager$c)object5).d;
            n7 = gridLayoutManager.getSpanSize((RecyclerView$u)object3, (RecyclerView$y)object4, n7);
            object9 += n7;
        }
        for (n7 = 0; n7 < (n4 = gridLayoutManager.mSpanCount) && (n4 = ((LinearLayoutManager$c)object5).d) >= 0 && n4 < (object = recyclerView$y.b()) && object9 > 0; ++n7) {
            n4 = ((LinearLayoutManager$c)object5).d;
            object = gridLayoutManager.getSpanSize((RecyclerView$u)object3, (RecyclerView$y)object4, n4);
            if (object > (object8 = gridLayoutManager.mSpanCount)) {
                object4 = fQ2.a("Item at position ", " requires ", " spans but GridLayoutManager has only ", n4, object);
                object4 = g30.a(gridLayoutManager.mSpanCount, " spans.", (StringBuilder)object4);
                object3 = new IllegalArgumentException((String)object4);
                throw object3;
            }
            if ((object9 -= object) < 0 || (view = ((LinearLayoutManager$c)object5).b((RecyclerView$u)object3)) == null) break;
            View[] viewArray = gridLayoutManager.mSet;
            viewArray[n7] = view;
            object8 = 0x40000000;
        }
        if (n7 == 0) {
            linearLayoutManager$b2.b = n14;
            return;
        }
        gridLayoutManager.assignSpans((RecyclerView$u)object3, (RecyclerView$y)object4, n7, n8 != 0);
        int n17 = 0;
        float f6 = 0.0f;
        object3 = null;
        object4 = null;
        object8 = 0;
        view = null;
        for (n3 = 0; n3 < n7; ++n3) {
            View view2 = gridLayoutManager.mSet[n3];
            List list = ((LinearLayoutManager$c)object5).k;
            if (list == null) {
                if (n8 != 0) {
                    gridLayoutManager.addView(view2);
                } else {
                    gridLayoutManager.addView(view2, 0);
                }
            } else if (n8 != 0) {
                gridLayoutManager.addDisappearingView(view2);
            } else {
                gridLayoutManager.addDisappearingView(view2, 0);
            }
            Rect rect2 = gridLayoutManager.mDecorInsets;
            gridLayoutManager.calculateItemDecorationsForChild(view2, rect2);
            gridLayoutManager.measureChild(view2, (int)object7, false);
            t t3 = gridLayoutManager.mOrientationHelper;
            n4 = t3.c(view2);
            if (n4 > object8) {
                object8 = n4;
            }
            GridLayoutManager$LayoutParams gridLayoutManager$LayoutParams = (GridLayoutManager$LayoutParams)view2.getLayoutParams();
            t t4 = gridLayoutManager.mOrientationHelper;
            object9 = t4.d(view2);
            f5 = object9;
            object = 1065353216;
            float f7 = 1.0f;
            f5 *= f7;
            float f8 = gridLayoutManager$LayoutParams.b;
            float f11 = (f5 /= f8) - f6;
            n4 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
            if (n4 <= 0) continue;
            f6 = f5;
        }
        if (n10 != 0) {
            gridLayoutManager.guessMeasurement(f6, n16);
            f6 = 0.0f;
            object3 = null;
            object8 = 0;
            view = null;
            for (n17 = 0; n17 < n7; ++n17) {
                object4 = gridLayoutManager.mSet[n17];
                int n18 = 0x40000000;
                gridLayoutManager.measureChild((View)object4, n18, n14 != 0);
                object6 = gridLayoutManager.mOrientationHelper;
                n3 = ((t)object6).c((View)object4);
                if (n3 <= object8) continue;
                object8 = n3;
            }
        }
        f6 = 0.0f;
        object3 = null;
        for (n17 = 0; n17 < n7; ++n17) {
            object6 = gridLayoutManager.mOrientationHelper;
            object4 = gridLayoutManager.mSet[n17];
            int n19 = ((t)object6).c((View)object4);
            if (n19 != object8) {
                object6 = (GridLayoutManager$LayoutParams)object4.getLayoutParams();
                rect = ((RecyclerView$LayoutParams)((Object)object6)).mDecorInsets;
                n16 = rect.top;
                n8 = rect.bottom;
                n16 += n8;
                n8 = ((ViewGroup.MarginLayoutParams)object6).topMargin;
                n16 += n8;
                n8 = ((ViewGroup.MarginLayoutParams)object6).bottomMargin;
                n16 += n8;
                n8 = rect.left;
                n10 = rect.right;
                n8 += n10;
                n10 = ((ViewGroup.MarginLayoutParams)object6).leftMargin;
                n8 += n10;
                n10 = ((ViewGroup.MarginLayoutParams)object6).rightMargin;
                n8 += n10;
                n10 = ((GridLayoutManager$LayoutParams)((Object)object6)).a;
                object9 = ((GridLayoutManager$LayoutParams)((Object)object6)).b;
                n10 = gridLayoutManager.getSpaceForSpanRange(n10, (int)object9);
                object9 = gridLayoutManager.mOrientation;
                if (object9 == n14) {
                    n19 = ((ViewGroup.MarginLayoutParams)object6).width;
                    object9 = 0x40000000;
                    f5 = 2.0f;
                    n19 = RecyclerView$o.getChildMeasureSpec(n10, object9, n8, n19, false);
                    n10 = View.MeasureSpec.makeMeasureSpec((int)(object8 - n16), (int)object9);
                } else {
                    object9 = 0x40000000;
                    f5 = 2.0f;
                    n8 = View.MeasureSpec.makeMeasureSpec((int)(object8 - n8), (int)object9);
                    n19 = ((ViewGroup.MarginLayoutParams)object6).height;
                    n10 = RecyclerView$o.getChildMeasureSpec(n10, object9, n16, n19, false);
                    n19 = n8;
                }
                gridLayoutManager.measureChildWithDecorationsAndMargin((View)object4, n19, n10, n14 != 0);
                continue;
            }
            object9 = 0x40000000;
            f5 = 2.0f;
        }
        linearLayoutManager$b2.a = object8;
        n17 = gridLayoutManager.mOrientation;
        n3 = -1;
        if (n17 == n14) {
            n17 = ((LinearLayoutManager$c)object5).f;
            if (n17 == n3) {
                n17 = ((LinearLayoutManager$c)object5).b;
                n3 = n17 - object8;
            } else {
                n3 = ((LinearLayoutManager$c)object5).b;
                n17 = n3 + object8;
            }
            int n20 = n3;
            n3 = 0;
            object4 = null;
            boolean bl2 = false;
            object5 = null;
        } else {
            n17 = ((LinearLayoutManager$c)object5).f;
            if (n17 == n3) {
                n17 = ((LinearLayoutManager$c)object5).b;
                n3 = n17 - object8;
            } else {
                n3 = ((LinearLayoutManager$c)object5).b;
                n17 = n3 + object8;
            }
            int n21 = n3;
            boolean bl3 = false;
            object6 = null;
            n3 = n17;
            n17 = 0;
            f6 = 0.0f;
            object3 = null;
        }
        n10 = 0;
        rect = null;
        while (true) {
            int n22;
            Object object10;
            Object object11;
            if (n10 >= n7) {
                Arrays.fill(gridLayoutManager.mSet, null);
                return;
            }
            View view3 = gridLayoutManager.mSet[n10];
            layoutParams = view3.getLayoutParams();
            object2 = layoutParams;
            object2 = (GridLayoutManager$LayoutParams)layoutParams;
            n15 = gridLayoutManager.mOrientation;
            if (n15 == n14) {
                n3 = (int)(this.isLayoutRTL() ? 1 : 0);
                if (n3 != 0) {
                    n3 = this.getPaddingLeft();
                    object5 = gridLayoutManager.mCachedBorders;
                    n15 = gridLayoutManager.mSpanCount;
                    object8 = ((GridLayoutManager$LayoutParams)((Object)object2)).a;
                    object11 = object5[n15 -= object8];
                    n3 += object11;
                    object5 = gridLayoutManager.mOrientationHelper;
                    Object object11 = ((t)object5).d(view3);
                    object11 = n3 - object11;
                    object9 = n17;
                    n4 = n3;
                    object = object11;
                } else {
                    n3 = this.getPaddingLeft();
                    object5 = gridLayoutManager.mCachedBorders;
                    n15 = ((GridLayoutManager$LayoutParams)((Object)object2)).a;
                    object11 = object5[n15];
                    n3 += object11;
                    object5 = gridLayoutManager.mOrientationHelper;
                    object11 = ((t)object5).d(view3) + n3;
                    object9 = n17;
                    object = n3;
                    n4 = (int)object11;
                }
                n22 = (int)object10;
            } else {
                n17 = this.getPaddingTop();
                object6 = gridLayoutManager.mCachedBorders;
                n15 = ((GridLayoutManager$LayoutParams)((Object)object2)).a;
                object10 = object6[n15];
                n17 += object10;
                object6 = gridLayoutManager.mOrientationHelper;
                object10 = ((t)object6).d(view3) + n17;
                n22 = n17;
                n4 = n3;
                object = object11;
                object9 = object10;
            }
            object3 = this;
            object4 = view3;
            object11 = object;
            object10 = n22;
            n15 = n4;
            object8 = object9;
            this.layoutDecoratedWithMargins(view3, (int)object, n22, n4, (int)object9);
            n17 = ((RecyclerView$LayoutParams)((Object)object2)).isItemRemoved();
            if (n17 != 0 || (n17 = ((RecyclerView$LayoutParams)((Object)object2)).isItemChanged()) != 0) {
                linearLayoutManager$b2.c = n14;
            }
            n17 = linearLayoutManager$b2.d;
            n3 = view3.hasFocusable();
            linearLayoutManager$b2.d = n17 |= n3;
            ++n10;
            n17 = object9;
            n3 = n4;
            object11 = object;
            object10 = n22;
        }
    }

    public void onAnchorReady(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y, LinearLayoutManager$a linearLayoutManager$a, int n3) {
        super.onAnchorReady(recyclerView$u, recyclerView$y, linearLayoutManager$a, n3);
        this.updateMeasurements();
        int n4 = recyclerView$y.b();
        if (n4 > 0 && (n4 = (int)(recyclerView$y.g ? 1 : 0)) == 0) {
            this.ensureAnchorIsInCorrectSpan(recyclerView$u, recyclerView$y, linearLayoutManager$a, n3);
        }
        this.ensureViewSet();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public View onFocusSearchFailed(View view, int n3, RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        void var10_14;
        int n4;
        int n7;
        GridLayoutManager gridLayoutManager = this;
        RecyclerView$u recyclerView$u2 = recyclerView$u;
        RecyclerView$y recyclerView$y2 = recyclerView$y;
        View view2 = this.findContainingItemView(view);
        int n8 = 0;
        Object var10_10 = null;
        if (view2 == null) {
            return null;
        }
        GridLayoutManager$LayoutParams gridLayoutManager$LayoutParams = (GridLayoutManager$LayoutParams)view2.getLayoutParams();
        int n10 = gridLayoutManager$LayoutParams.a;
        int n14 = gridLayoutManager$LayoutParams.b + n10;
        View view3 = super.onFocusSearchFailed(view, n3, recyclerView$u, recyclerView$y);
        if (view3 == null) {
            return null;
        }
        int n15 = n3;
        n15 = this.convertFocusDirectionToLayoutDirection(n3);
        if (n15 == (n7 = 1)) {
            n15 = 1;
        } else {
            n15 = 0;
            Object var14_19 = null;
        }
        int n16 = gridLayoutManager.mShouldReverseLayout;
        int n17 = -1;
        if (n15 != n16) {
            n15 = this.getChildCount() - n7;
            n16 = -1;
            n4 = -1;
        } else {
            n16 = this.getChildCount();
            n15 = 0;
            Object var14_21 = null;
            n4 = 1;
        }
        int n18 = gridLayoutManager.mOrientation;
        n18 = n18 == n7 && (n18 = (int)(this.isLayoutRTL() ? 1 : 0)) != 0 ? 1 : 0;
        int n19 = gridLayoutManager.getSpanGroupIndex(recyclerView$u2, recyclerView$y2, n15);
        n17 = n15;
        int n20 = 0;
        int n21 = -1;
        int n22 = -1;
        int n24 = 0;
        n15 = 0;
        Object var14_23 = null;
        while (true) {
            int n25;
            View view4;
            block17: {
                int n26;
                void var26_42;
                block28: {
                    block29: {
                        int n27;
                        int n28;
                        GridLayoutManager$LayoutParams gridLayoutManager$LayoutParams2;
                        block25: {
                            block27: {
                                block26: {
                                    block21: {
                                        void var10_11;
                                        block24: {
                                            block23: {
                                                void var14_24;
                                                block22: {
                                                    block19: {
                                                        block20: {
                                                            block18: {
                                                                if (n17 == n16) break block18;
                                                                n7 = gridLayoutManager.getSpanGroupIndex(recyclerView$u2, recyclerView$y2, n17);
                                                                recyclerView$u2 = gridLayoutManager.getChildAt(n17);
                                                                if (recyclerView$u2 == view2) break block18;
                                                                boolean bl2 = recyclerView$u2.hasFocusable();
                                                                if (!bl2 || n7 == n19) break block19;
                                                                if (var10_11 == null) break block20;
                                                            }
                                                            var26_42 = var14_24;
                                                            if (var10_11 != null) break;
                                                            void var10_13 = var14_24;
                                                            return var10_14;
                                                        }
                                                        view4 = view2;
                                                        var26_42 = var14_24;
                                                        break block21;
                                                    }
                                                    gridLayoutManager$LayoutParams2 = (GridLayoutManager$LayoutParams)recyclerView$u2.getLayoutParams();
                                                    n28 = gridLayoutManager$LayoutParams2.a;
                                                    view4 = view2;
                                                    n27 = gridLayoutManager$LayoutParams2.b + n28;
                                                    n26 = recyclerView$u2.hasFocusable();
                                                    if (n26 != 0 && n28 == n10 && n27 == n14) {
                                                        return recyclerView$u2;
                                                    }
                                                    n26 = recyclerView$u2.hasFocusable();
                                                    if ((n26 == 0 || var10_11 != null) && ((n26 = recyclerView$u2.hasFocusable()) != 0 || var14_24 != null)) break block22;
                                                    var26_42 = var14_24;
                                                    break block23;
                                                }
                                                n26 = Math.max(n28, n10);
                                                n25 = Math.min(n27, n14);
                                                var26_42 = var14_24;
                                                n15 = n25 - n26;
                                                n26 = (int)(recyclerView$u2.hasFocusable() ? 1 : 0);
                                                if (n26 == 0) break block24;
                                                if (n15 > n20) break block23;
                                                if (n15 != n20) break block21;
                                                if (n28 > n21) {
                                                    n15 = 1;
                                                } else {
                                                    n15 = 0;
                                                    Object var14_26 = null;
                                                }
                                                if (n18 != n15) break block21;
                                            }
                                            n26 = n20;
                                            n25 = n16;
                                            n15 = n22;
                                            n20 = n24;
                                            break block25;
                                        }
                                        if (var10_11 != null) break block21;
                                        n26 = n20;
                                        n25 = n16;
                                        n20 = 0;
                                        n16 = 1;
                                        boolean bl3 = gridLayoutManager.isViewPartiallyVisible((View)recyclerView$u2, false, n16 != 0);
                                        if (!bl3) break block26;
                                        n20 = n24;
                                        if (n15 <= n24) break block27;
                                        n15 = n22;
                                        break block25;
                                    }
                                    n26 = n20;
                                    n25 = n16;
                                }
                                n15 = n22;
                                n20 = n24;
                                break block28;
                            }
                            if (n15 != n24) break block29;
                            n15 = n22;
                            if (n28 <= n22) {
                                n16 = 0;
                            }
                            if (n18 != n16) break block28;
                        }
                        n16 = (int)(recyclerView$u2.hasFocusable() ? 1 : 0);
                        if (n16 != 0) {
                            n8 = gridLayoutManager$LayoutParams2.a;
                            n27 = Math.min(n27, n14);
                            n28 = Math.max(n28, n10);
                            n28 = n27 - n28;
                            n21 = n8;
                            n22 = n15;
                            n24 = n20;
                            void var14_27 = var26_42;
                            RecyclerView$u recyclerView$u3 = recyclerView$u2;
                            n20 = n28;
                            break block17;
                        } else {
                            n15 = gridLayoutManager$LayoutParams2.a;
                            n27 = Math.min(n27, n14);
                            n28 = Math.max(n28, n10);
                            n24 = n27 - n28;
                            n22 = n15;
                            n20 = n26;
                            RecyclerView$u recyclerView$u4 = recyclerView$u2;
                        }
                        break block17;
                    }
                    n15 = n22;
                }
                n22 = n15;
                n24 = n20;
                n20 = n26;
                void var14_29 = var26_42;
            }
            n17 += n4;
            recyclerView$u2 = recyclerView$u;
            recyclerView$y2 = recyclerView$y;
            view2 = view4;
            n16 = n25;
            n7 = 1;
        }
        return var10_14;
    }

    public void onInitializeAccessibilityNodeInfo(RecyclerView$u object, RecyclerView$y recyclerView$y, C2 c2) {
        int n3;
        int n4;
        super.onInitializeAccessibilityNodeInfo((RecyclerView$u)object, recyclerView$y, c2);
        object = GridView.class.getName();
        c2.l((CharSequence)object);
        object = this.mRecyclerView.mAdapter;
        if (object != null && (n4 = ((RecyclerView$f)object).getItemCount()) > (n3 = 1)) {
            object = C2$a.u;
            c2.b((C2$a)object);
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView$u object, RecyclerView$y recyclerView$y, View view, C2 c2) {
        Object object2 = view.getLayoutParams();
        int n3 = object2 instanceof GridLayoutManager$LayoutParams;
        if (n3 == 0) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c2);
            return;
        }
        object2 = (GridLayoutManager$LayoutParams)((Object)object2);
        int n4 = ((RecyclerView$LayoutParams)((Object)object2)).getViewLayoutPosition();
        int n7 = this.getSpanGroupIndex((RecyclerView$u)object, recyclerView$y, n4);
        int n8 = this.mOrientation;
        if (n8 == 0) {
            n3 = ((GridLayoutManager$LayoutParams)((Object)object2)).a;
            int n10 = ((GridLayoutManager$LayoutParams)((Object)object2)).b;
            int n14 = 1;
            int n15 = n7;
            object = C2$f.a(n3, n10, n7, n14, false, false);
            c2.n((C2$f)object);
        } else {
            int n16 = ((GridLayoutManager$LayoutParams)((Object)object2)).a;
            int n17 = ((GridLayoutManager$LayoutParams)((Object)object2)).b;
            int n18 = 1;
            n3 = n7;
            object = C2$f.a(n7, n18, n16, n17, false, false);
            c2.n((C2$f)object);
        }
    }

    public void onItemsAdded(RecyclerView recyclerView, int n3, int n4) {
        this.mSpanSizeLookup.d();
        this.mSpanSizeLookup.b.clear();
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.mSpanSizeLookup.d();
        this.mSpanSizeLookup.b.clear();
    }

    public void onItemsMoved(RecyclerView recyclerView, int n3, int n4, int n7) {
        this.mSpanSizeLookup.d();
        this.mSpanSizeLookup.b.clear();
    }

    public void onItemsRemoved(RecyclerView recyclerView, int n3, int n4) {
        this.mSpanSizeLookup.d();
        this.mSpanSizeLookup.b.clear();
    }

    public void onItemsUpdated(RecyclerView recyclerView, int n3, int n4, Object object) {
        this.mSpanSizeLookup.d();
        this.mSpanSizeLookup.b.clear();
    }

    public void onLayoutChildren(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        boolean bl2 = recyclerView$y.g;
        if (bl2) {
            this.cachePreLayoutSpanMapping();
        }
        super.onLayoutChildren(recyclerView$u, recyclerView$y);
        this.clearPreLayoutSpanMappingCache();
    }

    public void onLayoutCompleted(RecyclerView$y recyclerView$y) {
        super.onLayoutCompleted(recyclerView$y);
        recyclerView$y = null;
        this.mPendingSpanCountChange = false;
        int n3 = this.mPositionTargetedByScrollInDirection;
        int n4 = -1;
        if (n3 != n4 && (recyclerView$y = this.findViewByPosition(n3)) != null) {
            int n7 = 0x4000000;
            recyclerView$y.sendAccessibilityEvent(n7);
            this.mPositionTargetedByScrollInDirection = n4;
        }
    }

    public boolean performAccessibilityAction(int n3, Bundle bundle) {
        Object object = C2$a.u;
        int n4 = ((C2$a)object).a();
        int n7 = 1;
        int n8 = -1;
        if (n3 == n4 && n3 != n8) {
            Object object2 = this.findChildWithAccessibilityFocus();
            if (object2 == null) {
                return false;
            }
            if (bundle == null) {
                return false;
            }
            object = sSupportedDirectionsForActionScrollInDirection;
            int n10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", n8);
            Integer n14 = n10;
            n4 = (int)(object.contains(n14) ? 1 : 0);
            if (n4 == 0) {
                return false;
            }
            object = this.mRecyclerView;
            if ((object2 = ((RecyclerView)object).getChildViewHolder((View)object2)) == null) {
                return false;
            }
            n3 = ((RecyclerView$B)object2).getAbsoluteAdapterPosition();
            n4 = this.getRowIndex(n3);
            int n15 = this.getColumnIndex(n3);
            if (n4 >= 0 && n15 >= 0) {
                int n16;
                int n17 = this.hasAccessibilityFocusChanged(n3);
                if (n17 != 0) {
                    this.mRowWithAccessibilityFocus = n4;
                    this.mColumnWithAccessibilityFocus = n15;
                }
                if ((n17 = this.mRowWithAccessibilityFocus) == n8) {
                    n17 = n4;
                }
                if ((n16 = this.mColumnWithAccessibilityFocus) != n8) {
                    n15 = n16;
                }
                n16 = 66;
                int n18 = 17;
                if (n10 != n18) {
                    int n19 = 33;
                    if (n10 != n19) {
                        if (n10 != n16) {
                            n19 = 130;
                            if (n10 != n19) {
                                return false;
                            }
                            n3 = this.findScrollTargetPositionBelow(n17, n15, n3);
                        } else {
                            n3 = this.findScrollTargetPositionOnTheRight(n17, n15, n3);
                        }
                    } else {
                        n3 = this.findScrollTargetPositionAbove(n17, n15, n3);
                    }
                } else {
                    n3 = this.findScrollTargetPositionOnTheLeft(n17, n15, n3);
                }
                if (n3 == n8 && (n15 = this.mOrientation) == 0) {
                    if (n10 == n18) {
                        n3 = this.findPositionOfLastItemOnARowAboveForHorizontalGrid(n4);
                    } else if (n10 == n16) {
                        n3 = this.findPositionOfFirstItemOnARowBelowForHorizontalGrid(n4);
                    }
                }
                if (n3 != n8) {
                    this.scrollToPosition(n3);
                    this.mPositionTargetedByScrollInDirection = n3;
                    return n7 != 0;
                }
            }
            return false;
        }
        n4 = 16908343;
        if (n3 == n4 && bundle != null) {
            String string2 = "android.view.accessibility.action.ARGUMENT_ROW_INT";
            n3 = bundle.getInt(string2, n8);
            object = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
            int n20 = bundle.getInt((String)object, n8);
            if (n3 != n8 && n20 != n8) {
                int n21;
                block26: {
                    object = this.mRecyclerView.mAdapter;
                    n4 = ((RecyclerView$f)object).getItemCount();
                    Object var9_12 = null;
                    for (n21 = 0; n21 < n4; ++n21) {
                        Object object3 = this.mRecyclerView;
                        Object object4 = ((RecyclerView)object3).mRecycler;
                        object3 = ((RecyclerView)object3).mState;
                        int n22 = this.getSpanIndex((RecyclerView$u)object4, (RecyclerView$y)object3, n21);
                        object4 = this.mRecyclerView;
                        RecyclerView$u recyclerView$u = ((RecyclerView)object4).mRecycler;
                        object4 = ((RecyclerView)object4).mState;
                        int n24 = this.getSpanGroupIndex(recyclerView$u, (RecyclerView$y)object4, n21);
                        int n25 = this.mOrientation;
                        if (!(n25 == n7 ? n22 == n20 && n24 == n3 : n22 == n3 && n24 == n20)) {
                            continue;
                        }
                        break block26;
                    }
                    n21 = -1;
                }
                if (n21 > n8) {
                    this.scrollToPositionWithOffset(n21, 0);
                    return n7 != 0;
                }
            }
            return false;
        }
        return super.performAccessibilityAction(n3, bundle);
    }

    public int scrollHorizontallyBy(int n3, RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        this.updateMeasurements();
        this.ensureViewSet();
        return super.scrollHorizontallyBy(n3, recyclerView$u, recyclerView$y);
    }

    public int scrollVerticallyBy(int n3, RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        this.updateMeasurements();
        this.ensureViewSet();
        return super.scrollVerticallyBy(n3, recyclerView$u, recyclerView$y);
    }

    public void setMeasuredDimension(Rect object, int n3, int n4) {
        Object object2;
        int[] nArray = this.mCachedBorders;
        if (nArray == null) {
            super.setMeasuredDimension((Rect)object, n3, n4);
        }
        int n7 = this.getPaddingLeft();
        int n8 = this.getPaddingRight() + n7;
        n7 = this.getPaddingTop();
        int n10 = this.getPaddingBottom() + n7;
        n7 = this.mOrientation;
        int n14 = 1;
        if (n7 == n14) {
            object2 = object.height() + n10;
            n7 = this.getMinimumHeight();
            object2 = RecyclerView$o.chooseSize(n4, object2, n7);
            int[] nArray2 = this.mCachedBorders;
            n7 = nArray2.length - n14;
            n4 = nArray2[n7] + n8;
            n7 = this.getMinimumWidth();
            n3 = RecyclerView$o.chooseSize(n3, n4, n7);
        } else {
            object2 = object.width() + n8;
            n7 = this.getMinimumWidth();
            n3 = RecyclerView$o.chooseSize(n3, object2, n7);
            object = this.mCachedBorders;
            n7 = ((Rect)object).length - n14;
            object2 = object[n7] + n10;
            n7 = this.getMinimumHeight();
            object2 = RecyclerView$o.chooseSize(n4, object2, n7);
        }
        this.setMeasuredDimension(n3, (int)object2);
    }

    public void setSpanCount(int n3) {
        int n4 = this.mSpanCount;
        if (n3 == n4) {
            return;
        }
        n4 = 1;
        this.mPendingSpanCountChange = n4;
        if (n3 >= n4) {
            this.mSpanCount = n3;
            this.mSpanSizeLookup.d();
            this.requestLayout();
            return;
        }
        String string2 = hj0_0.a(n3, "Span count should be at least 1. Provided ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public void setSpanSizeLookup(GridLayoutManager$b gridLayoutManager$b) {
        this.mSpanSizeLookup = gridLayoutManager$b;
    }

    public void setStackFromEnd(boolean bl2) {
        if (!bl2) {
            super.setStackFromEnd(false);
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        throw unsupportedOperationException;
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean bl2) {
        this.mUsingSpansToEstimateScrollBarDimensions = bl2;
    }

    public boolean supportsPredictiveItemAnimations() {
        boolean bl2;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.mPendingSavedState;
        if (linearLayoutManager$SavedState == null && !(bl2 = this.mPendingSpanCountChange)) {
            bl2 = true;
        } else {
            bl2 = false;
            linearLayoutManager$SavedState = null;
        }
        return bl2;
    }
}

