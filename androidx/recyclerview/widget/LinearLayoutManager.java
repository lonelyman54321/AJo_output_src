/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PointF
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 */
package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.GapWorker$b;
import androidx.recyclerview.widget.ItemTouchHelper$f;
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
import androidx.recyclerview.widget.RecyclerView$o$d;
import androidx.recyclerview.widget.RecyclerView$u;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$x$b;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.w;
import java.util.List;

public class LinearLayoutManager
extends RecyclerView$o
implements ItemTouchHelper$f,
RecyclerView$x$b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final LinearLayoutManager$a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final LinearLayoutManager$b mLayoutChunkResult;
    private LinearLayoutManager$c mLayoutState;
    int mOrientation;
    t mOrientationHelper;
    LinearLayoutManager$SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context object, int n3, boolean bl2) {
        int n4;
        this.mOrientation = n4 = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = n4;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = -1 << -1;
        this.mPendingSavedState = null;
        this.mAnchorInfo = object;
        super();
        this.mLayoutChunkResult = object;
        this.mInitialPrefetchItemCount = n4 = 2;
        object = new int[n4];
        this.mReusableIntPair = (int[])object;
        this.setOrientation(n3);
        this.setReverseLayout(bl2);
    }

    public LinearLayoutManager(Context object, AttributeSet attributeSet, int n3, int n4) {
        int n7;
        this.mOrientation = n7 = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = n7;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = -1 << -1;
        this.mPendingSavedState = null;
        Object object2 = new LinearLayoutManager$a();
        this.mAnchorInfo = object2;
        this.mLayoutChunkResult = object2 = new Object();
        this.mInitialPrefetchItemCount = n7 = 2;
        object2 = new int[n7];
        this.mReusableIntPair = (int[])object2;
        object = RecyclerView$o.getProperties((Context)object, attributeSet, n3, n4);
        int bl2 = ((RecyclerView$o$d)object).a;
        this.setOrientation(bl2);
        boolean bl3 = ((RecyclerView$o$d)object).c;
        this.setReverseLayout(bl3);
        boolean bl4 = ((RecyclerView$o$d)object).d;
        this.setStackFromEnd(bl4);
    }

    private int computeScrollExtent(RecyclerView$y recyclerView$y) {
        int n3 = this.getChildCount();
        if (!n3) {
            return 0;
        }
        this.ensureLayoutState();
        t t3 = this.mOrientationHelper;
        n3 = (int)(this.mSmoothScrollbarEnabled ? 1 : 0);
        boolean bl2 = true;
        View view = this.findFirstVisibleChildClosestToStart((n3 ^= bl2) != 0, bl2);
        n3 = this.mSmoothScrollbarEnabled ^ bl2;
        Object object = this.findFirstVisibleChildClosestToEnd(n3 != 0, bl2);
        boolean bl3 = this.mSmoothScrollbarEnabled;
        View view2 = view;
        view = object;
        object = this;
        return w.a(recyclerView$y, t3, view2, view, this, bl3);
    }

    private int computeScrollOffset(RecyclerView$y recyclerView$y) {
        int n3 = this.getChildCount();
        if (!n3) {
            return 0;
        }
        this.ensureLayoutState();
        t t3 = this.mOrientationHelper;
        n3 = (int)(this.mSmoothScrollbarEnabled ? 1 : 0);
        boolean bl2 = true;
        View view = this.findFirstVisibleChildClosestToStart((n3 ^= bl2) != 0, bl2);
        n3 = this.mSmoothScrollbarEnabled ^ bl2;
        Object object = this.findFirstVisibleChildClosestToEnd(n3 != 0, bl2);
        boolean bl3 = this.mSmoothScrollbarEnabled;
        boolean bl4 = this.mShouldReverseLayout;
        View view2 = view;
        view = object;
        object = this;
        return w.b(recyclerView$y, t3, view2, view, this, bl3, bl4);
    }

    private int computeScrollRange(RecyclerView$y recyclerView$y) {
        int n3 = this.getChildCount();
        if (!n3) {
            return 0;
        }
        this.ensureLayoutState();
        t t3 = this.mOrientationHelper;
        n3 = (int)(this.mSmoothScrollbarEnabled ? 1 : 0);
        boolean bl2 = true;
        View view = this.findFirstVisibleChildClosestToStart((n3 ^= bl2) != 0, bl2);
        n3 = this.mSmoothScrollbarEnabled ^ bl2;
        Object object = this.findFirstVisibleChildClosestToEnd(n3 != 0, bl2);
        boolean bl3 = this.mSmoothScrollbarEnabled;
        View view2 = view;
        view = object;
        object = this;
        return w.c(recyclerView$y, t3, view2, view, this, bl3);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        int n3 = this.getChildCount();
        return this.findOnePartiallyOrCompletelyInvisibleChild(0, n3);
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        int n3 = this.getChildCount() + -1;
        return this.findOnePartiallyOrCompletelyInvisibleChild(n3, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        boolean bl2 = this.mShouldReverseLayout;
        View view = bl2 ? this.findFirstPartiallyOrCompletelyInvisibleChild() : this.findLastPartiallyOrCompletelyInvisibleChild();
        return view;
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        boolean bl2 = this.mShouldReverseLayout;
        View view = bl2 ? this.findLastPartiallyOrCompletelyInvisibleChild() : this.findFirstPartiallyOrCompletelyInvisibleChild();
        return view;
    }

    private int fixLayoutEndGap(int n3, RecyclerView$u recyclerView$u, RecyclerView$y object, boolean bl2) {
        t t3 = this.mOrientationHelper;
        int n4 = t3.g() - n3;
        if (n4 > 0) {
            int n7;
            n4 = -n4;
            int n8 = -this.scrollBy(n4, recyclerView$u, (RecyclerView$y)object);
            if (bl2 && (n7 = ((t)(object = this.mOrientationHelper)).g() - (n3 += n8)) > 0) {
                this.mOrientationHelper.p(n7);
                return n7 + n8;
            }
            return n8;
        }
        return 0;
    }

    private int fixLayoutStartGap(int n3, RecyclerView$u recyclerView$u, RecyclerView$y object, boolean bl2) {
        t t3 = this.mOrientationHelper;
        int n4 = t3.k();
        if ((n4 = n3 - n4) > 0) {
            int n7;
            int n8 = -this.scrollBy(n4, recyclerView$u, (RecyclerView$y)object);
            n3 += n8;
            if (bl2 && (n3 -= (n7 = ((t)(object = this.mOrientationHelper)).k())) > 0) {
                object = this.mOrientationHelper;
                int n10 = -n3;
                ((t)object).p(n10);
                n8 -= n3;
            }
            return n8;
        }
        return 0;
    }

    private View getChildClosestToEnd() {
        int n3 = this.mShouldReverseLayout;
        n3 = n3 != 0 ? 0 : this.getChildCount() + -1;
        return this.getChildAt(n3);
    }

    private View getChildClosestToStart() {
        int n3 = this.mShouldReverseLayout;
        n3 = n3 != 0 ? this.getChildCount() + -1 : 0;
        return this.getChildAt(n3);
    }

    private void layoutForPredictiveAnimations(RecyclerView$u object, RecyclerView$y recyclerView$y, int n3, int n4) {
        int n7 = recyclerView$y.k;
        if (n7 != 0 && (n7 = this.getChildCount()) != 0 && (n7 = (int)(recyclerView$y.g ? 1 : 0)) == 0 && (n7 = (int)(this.supportsPredictiveItemAnimations() ? 1 : 0)) != 0) {
            Object object2;
            List list = ((RecyclerView$u)object).d;
            int n8 = list.size();
            View view = this.getChildAt(0);
            int n10 = this.getPosition(view);
            int n14 = 0;
            int n15 = 0;
            for (int i3 = 0; i3 < n8; ++i3) {
                int n16;
                t t3;
                RecyclerView$B recyclerView$B = (RecyclerView$B)list.get(i3);
                int n17 = recyclerView$B.isRemoved();
                if (n17 != 0) continue;
                n17 = recyclerView$B.getLayoutPosition();
                if (n17 < n10) {
                    n17 = 1;
                } else {
                    n17 = 0;
                    t3 = null;
                }
                int n18 = this.mShouldReverseLayout;
                if (n17 != n18) {
                    t3 = this.mOrientationHelper;
                    recyclerView$B = recyclerView$B.itemView;
                    n16 = t3.c((View)recyclerView$B);
                    n14 += n16;
                    continue;
                }
                t3 = this.mOrientationHelper;
                recyclerView$B = recyclerView$B.itemView;
                n16 = t3.c((View)recyclerView$B);
                n15 += n16;
            }
            LinearLayoutManager$c linearLayoutManager$c = this.mLayoutState;
            linearLayoutManager$c.k = list;
            n7 = 0;
            list = null;
            if (n14 > 0) {
                linearLayoutManager$c = this.getChildClosestToStart();
                n8 = this.getPosition((View)linearLayoutManager$c);
                this.updateLayoutStateToFillStart(n8, n3);
                object2 = this.mLayoutState;
                ((LinearLayoutManager$c)object2).h = n14;
                ((LinearLayoutManager$c)object2).c = 0;
                ((LinearLayoutManager$c)object2).a(null);
                object2 = this.mLayoutState;
                this.fill((RecyclerView$u)object, (LinearLayoutManager$c)object2, recyclerView$y, false);
            }
            if (n15 > 0) {
                object2 = this.getChildClosestToEnd();
                n3 = this.getPosition((View)object2);
                this.updateLayoutStateToFillEnd(n3, n4);
                object2 = this.mLayoutState;
                ((LinearLayoutManager$c)object2).h = n15;
                ((LinearLayoutManager$c)object2).c = 0;
                ((LinearLayoutManager$c)object2).a(null);
                object2 = this.mLayoutState;
                this.fill((RecyclerView$u)object, (LinearLayoutManager$c)object2, recyclerView$y, false);
            }
            object = this.mLayoutState;
            ((LinearLayoutManager$c)object).k = null;
        }
    }

    private void logChildren() {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.getChildCount()); ++i3) {
            View view = this.getChildAt(i3);
            this.getPosition(view);
            t t3 = this.mOrientationHelper;
            t3.e(view);
        }
    }

    private void recycleByLayoutState(RecyclerView$u recyclerView$u, LinearLayoutManager$c linearLayoutManager$c) {
        int n3 = linearLayoutManager$c.a;
        if (n3 != 0 && (n3 = linearLayoutManager$c.l) == 0) {
            n3 = linearLayoutManager$c.g;
            int n4 = linearLayoutManager$c.i;
            int n7 = linearLayoutManager$c.f;
            int n8 = -1;
            if (n7 == n8) {
                this.recycleViewsFromEnd(recyclerView$u, n3, n4);
            } else {
                this.recycleViewsFromStart(recyclerView$u, n3, n4);
            }
        }
    }

    private void recycleChildren(RecyclerView$u recyclerView$u, int n3, int n4) {
        if (n3 == n4) {
            return;
        }
        if (n4 > n3) {
            n4 += -1;
            while (n4 >= n3) {
                this.removeAndRecycleViewAt(n4, recyclerView$u);
                n4 += -1;
            }
        } else {
            while (n3 > n4) {
                this.removeAndRecycleViewAt(n3, recyclerView$u);
                n3 += -1;
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView$u recyclerView$u, int n3, int n4) {
        int n7 = this.getChildCount();
        if (n3 < 0) {
            return;
        }
        t t3 = this.mOrientationHelper;
        int n8 = t3.f() - n3 + n4;
        n3 = (int)(this.mShouldReverseLayout ? 1 : 0);
        if (n3 != 0) {
            n3 = 0;
            Object var7_7 = null;
            for (n4 = 0; n4 < n7; ++n4) {
                int n10;
                t t4 = this.mOrientationHelper;
                View view = this.getChildAt(n4);
                int n14 = t4.e(view);
                if (n14 >= n8 && (n10 = (t4 = this.mOrientationHelper).o(view)) >= n8) {
                    continue;
                }
                this.recycleChildren(recyclerView$u, 0, n4);
                return;
            }
        } else {
            for (n3 = n7 += -1; n3 >= 0; n3 += -1) {
                t t7 = this.mOrientationHelper;
                View view = this.getChildAt(n3);
                int n15 = t7.e(view);
                if (n15 >= n8 && (n4 = (t7 = this.mOrientationHelper).o(view)) >= n8) {
                    continue;
                }
                this.recycleChildren(recyclerView$u, n7, n3);
                break;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView$u recyclerView$u, int n3, int n4) {
        if (n3 < 0) {
            return;
        }
        n3 -= n4;
        n4 = this.getChildCount();
        int n7 = this.mShouldReverseLayout;
        if (n7 != 0) {
            for (n7 = n4 += -1; n7 >= 0; n7 += -1) {
                int n8;
                t t3 = this.mOrientationHelper;
                View view = this.getChildAt(n7);
                int n10 = t3.b(view);
                if (n10 <= n3 && (n8 = (t3 = this.mOrientationHelper).n(view)) <= n3) {
                    continue;
                }
                this.recycleChildren(recyclerView$u, n4, n7);
                return;
            }
        } else {
            n7 = 0;
            Object var5_6 = null;
            for (int i3 = 0; i3 < n4; ++i3) {
                int n14;
                t t4 = this.mOrientationHelper;
                View view = this.getChildAt(i3);
                int n15 = t4.b(view);
                if (n15 <= n3 && (n14 = (t4 = this.mOrientationHelper).n(view)) <= n3) {
                    continue;
                }
                this.recycleChildren(recyclerView$u, 0, i3);
                break;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        int n3 = this.mOrientation;
        int n4 = 1;
        if (n3 != n4 && (n3 = (int)(this.isLayoutRTL() ? 1 : 0)) != 0) {
            n3 = this.mReverseLayout ^ n4;
            this.mShouldReverseLayout = n3;
        } else {
            n3 = (int)(this.mReverseLayout ? 1 : 0);
            this.mShouldReverseLayout = n3;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean updateAnchorFromChildren(RecyclerView$u recyclerView$u, RecyclerView$y object, LinearLayoutManager$a linearLayoutManager$a) {
        int n3;
        Object object2;
        int n7 = this.getChildCount();
        boolean bl2 = false;
        if (n7 == 0) {
            return false;
        }
        Object object3 = this.getFocusedChild();
        boolean bl3 = true;
        if (object3 != null) {
            int n4;
            int n8;
            linearLayoutManager$a.getClass();
            object2 = (RecyclerView$LayoutParams)object3.getLayoutParams();
            boolean n42 = ((RecyclerView$LayoutParams)((Object)object2)).isItemRemoved();
            if (!n42 && (n8 = ((RecyclerView$LayoutParams)((Object)object2)).getViewLayoutPosition()) >= 0 && (n3 = ((RecyclerView$LayoutParams)((Object)object2)).getViewLayoutPosition()) < (n4 = ((RecyclerView$y)object).b())) {
                int n10 = this.getPosition((View)object3);
                linearLayoutManager$a.c(n10, (View)object3);
                return bl3;
            }
        }
        if ((n7 = (int)(this.mLastStackFromEnd ? 1 : 0)) != (n3 = this.mStackFromEnd)) {
            return false;
        }
        n7 = (int)(linearLayoutManager$a.d ? 1 : 0);
        if ((recyclerView$u = this.findReferenceChild(recyclerView$u, (RecyclerView$y)object, n7 != 0, n3 != 0)) != null) {
            n7 = this.getPosition((View)recyclerView$u);
            linearLayoutManager$a.b(n7, (View)recyclerView$u);
            int n14 = ((RecyclerView$y)object).g;
            if (n14 == 0 && (n14 = this.supportsPredictiveItemAnimations()) != 0) {
                void var9_14;
                object = this.mOrientationHelper;
                n14 = ((t)object).e((View)recyclerView$u);
                int n15 = this.mOrientationHelper.b((View)recyclerView$u);
                object3 = this.mOrientationHelper;
                n7 = ((t)object3).k();
                object2 = this.mOrientationHelper;
                n3 = ((t)object2).g();
                if (n15 <= n7 && n14 < n7) {
                    boolean bl4 = true;
                } else {
                    boolean bl5 = false;
                }
                if (n14 >= n3 && n15 > n3) {
                    bl2 = true;
                }
                if (var9_14 != false || bl2) {
                    n15 = (int)(linearLayoutManager$a.d ? 1 : 0);
                    if (n15 != 0) {
                        n7 = n3;
                    }
                    linearLayoutManager$a.c = n7;
                }
            }
            return bl3;
        }
        return false;
    }

    private boolean updateAnchorFromPendingData(RecyclerView$y object, LinearLayoutManager$a linearLayoutManager$a) {
        int n3;
        int n4 = ((RecyclerView$y)object).g;
        int n7 = 0;
        t t3 = null;
        if (n4 == 0 && (n4 = this.mPendingScrollPosition) != (n3 = -1)) {
            int n8;
            int n10 = -1 << -1;
            if (n4 >= 0 && n4 < (n8 = ((RecyclerView$y)object).b())) {
                int n14;
                linearLayoutManager$a.b = n8 = this.mPendingScrollPosition;
                Object object2 = this.mPendingSavedState;
                n3 = 1;
                if (object2 != null && (n14 = ((LinearLayoutManager$SavedState)object2).a) >= 0) {
                    n8 = (int)(((LinearLayoutManager$SavedState)object2).c ? 1 : 0);
                    linearLayoutManager$a.d = n8;
                    if (n8 != 0) {
                        object = this.mOrientationHelper;
                        n8 = ((t)object).g();
                        object2 = this.mPendingSavedState;
                        n4 = ((LinearLayoutManager$SavedState)object2).b;
                        linearLayoutManager$a.c = n8 -= n4;
                    } else {
                        object = this.mOrientationHelper;
                        n8 = ((t)object).k();
                        object2 = this.mPendingSavedState;
                        n4 = ((LinearLayoutManager$SavedState)object2).b;
                        linearLayoutManager$a.c = n8 += n4;
                    }
                    return n3 != 0;
                }
                n4 = this.mPendingScrollPositionOffset;
                if (n4 == n10) {
                    object = this.findViewByPosition(n8);
                    if (object != null) {
                        t t4;
                        object2 = this.mOrientationHelper;
                        n4 = ((t)object2).c((View)object);
                        if (n4 > (n10 = (t4 = this.mOrientationHelper).l())) {
                            linearLayoutManager$a.a();
                            return n3 != 0;
                        }
                        object2 = this.mOrientationHelper;
                        n4 = ((t)object2).e((View)object);
                        t4 = this.mOrientationHelper;
                        n10 = t4.k();
                        if ((n4 -= n10) < 0) {
                            linearLayoutManager$a.c = n8 = this.mOrientationHelper.k();
                            linearLayoutManager$a.d = false;
                            return n3 != 0;
                        }
                        object2 = this.mOrientationHelper;
                        n4 = ((t)object2).g();
                        t3 = this.mOrientationHelper;
                        n7 = t3.b((View)object);
                        if ((n4 -= n7) < 0) {
                            linearLayoutManager$a.c = n8 = this.mOrientationHelper.g();
                            linearLayoutManager$a.d = n3;
                            return n3 != 0;
                        }
                        n4 = (int)(linearLayoutManager$a.d ? 1 : 0);
                        if (n4 != 0) {
                            n8 = this.mOrientationHelper.b((View)object);
                            object2 = this.mOrientationHelper;
                            n4 = ((t)object2).m() + n8;
                        } else {
                            object2 = this.mOrientationHelper;
                            n4 = ((t)object2).e((View)object);
                        }
                        linearLayoutManager$a.c = n4;
                    } else {
                        n8 = this.getChildCount();
                        if (n8 > 0) {
                            n4 = this.mPendingScrollPosition;
                            object = this.getChildAt(0);
                            n8 = this.getPosition((View)object);
                            if (n4 < n8) {
                                n8 = 1;
                            } else {
                                n8 = 0;
                                object = null;
                            }
                            n4 = (int)(this.mShouldReverseLayout ? 1 : 0);
                            if (n8 == n4) {
                                n7 = 1;
                            }
                            linearLayoutManager$a.d = n7;
                        }
                        linearLayoutManager$a.a();
                    }
                    return n3 != 0;
                }
                n8 = (int)(this.mShouldReverseLayout ? 1 : 0);
                linearLayoutManager$a.d = n8;
                if (n8 != 0) {
                    object = this.mOrientationHelper;
                    n8 = ((t)object).g();
                    n4 = this.mPendingScrollPositionOffset;
                    linearLayoutManager$a.c = n8 -= n4;
                } else {
                    object = this.mOrientationHelper;
                    n8 = ((t)object).k();
                    n4 = this.mPendingScrollPositionOffset;
                    linearLayoutManager$a.c = n8 += n4;
                }
                return n3 != 0;
            }
            this.mPendingScrollPosition = n3;
            this.mPendingScrollPositionOffset = n10;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y, LinearLayoutManager$a linearLayoutManager$a) {
        boolean bl2 = this.updateAnchorFromPendingData(recyclerView$y, linearLayoutManager$a);
        if (bl2) {
            return;
        }
        int n3 = this.updateAnchorFromChildren(recyclerView$u, recyclerView$y, linearLayoutManager$a);
        if (n3 != 0) {
            return;
        }
        linearLayoutManager$a.a();
        n3 = this.mStackFromEnd;
        if (n3 != 0) {
            n3 = recyclerView$y.b() + -1;
        } else {
            n3 = 0;
            recyclerView$u = null;
        }
        linearLayoutManager$a.b = n3;
    }

    private void updateLayoutState(int n3, int n4, boolean bl2, RecyclerView$y object) {
        int n7;
        Object object2 = this.mLayoutState;
        ((LinearLayoutManager$c)object2).l = n7 = this.resolveIsInfinite();
        this.mLayoutState.f = n3;
        object2 = this.mReusableIntPair;
        n7 = 0;
        LinearLayoutManager$c linearLayoutManager$c = null;
        object2[0] = false;
        int n8 = 1;
        object2[n8] = false;
        this.calculateExtraLayoutSpace((RecyclerView$y)object, (int[])object2);
        object = this.mReusableIntPair;
        Object object3 = object[0];
        object3 = Math.max(0, (int)object3);
        object2 = this.mReusableIntPair;
        Object object4 = object2[n8];
        object4 = Math.max(0, (int)object4);
        if (n3 == n8) {
            n7 = 1;
        }
        LinearLayoutManager$c linearLayoutManager$c2 = this.mLayoutState;
        Object object5 = n7 != 0 ? object4 : object3;
        linearLayoutManager$c2.h = (int)object5;
        if (n7 == 0) {
            object3 = object4;
        }
        linearLayoutManager$c2.i = (int)object3;
        object3 = -1;
        if (n7 != 0) {
            object4 = this.mOrientationHelper.h() + object5;
            linearLayoutManager$c2.h = (int)object4;
            linearLayoutManager$c2 = this.getChildClosestToEnd();
            object2 = this.mLayoutState;
            n7 = (int)(this.mShouldReverseLayout ? 1 : 0);
            if (n7 != 0) {
                n8 = -1;
            }
            ((LinearLayoutManager$c)object2).e = n8;
            object3 = this.getPosition((View)linearLayoutManager$c2);
            linearLayoutManager$c = this.mLayoutState;
            n8 = linearLayoutManager$c.e;
            ((LinearLayoutManager$c)object2).d = (int)(object3 += n8);
            object3 = this.mOrientationHelper.b((View)linearLayoutManager$c2);
            linearLayoutManager$c.b = (int)object3;
            n3 = this.mOrientationHelper.b((View)linearLayoutManager$c2);
            object = this.mOrientationHelper;
            object3 = ((t)object).g();
            n3 -= object3;
        } else {
            linearLayoutManager$c2 = this.getChildClosestToStart();
            object2 = this.mLayoutState;
            n7 = ((LinearLayoutManager$c)object2).h;
            t t3 = this.mOrientationHelper;
            object5 = t3.k() + n7;
            ((LinearLayoutManager$c)object2).h = (int)object5;
            object2 = this.mLayoutState;
            n7 = (int)(this.mShouldReverseLayout ? 1 : 0);
            if (n7 == 0) {
                n8 = -1;
            }
            ((LinearLayoutManager$c)object2).e = n8;
            object3 = this.getPosition((View)linearLayoutManager$c2);
            linearLayoutManager$c = this.mLayoutState;
            n8 = linearLayoutManager$c.e;
            ((LinearLayoutManager$c)object2).d = (int)(object3 += n8);
            object3 = this.mOrientationHelper.e((View)linearLayoutManager$c2);
            linearLayoutManager$c.b = (int)object3;
            n3 = -this.mOrientationHelper.e((View)linearLayoutManager$c2);
            object = this.mOrientationHelper;
            object3 = ((t)object).k();
            n3 += object3;
        }
        object = this.mLayoutState;
        ((LinearLayoutManager$c)object).c = n4;
        if (bl2) {
            ((LinearLayoutManager$c)object).c = n4 -= n3;
        }
        ((LinearLayoutManager$c)object).g = n3;
    }

    private void updateLayoutStateToFillEnd(int n3, int n4) {
        int n7;
        LinearLayoutManager$c linearLayoutManager$c = this.mLayoutState;
        t t3 = this.mOrientationHelper;
        linearLayoutManager$c.c = n7 = t3.g() - n4;
        linearLayoutManager$c = this.mLayoutState;
        n7 = (int)(this.mShouldReverseLayout ? 1 : 0);
        int n8 = 1;
        n7 = n7 != 0 ? -1 : 1;
        linearLayoutManager$c.e = n7;
        linearLayoutManager$c.d = n3;
        linearLayoutManager$c.f = n8;
        linearLayoutManager$c.b = n4;
        linearLayoutManager$c.g = -1 << -1;
    }

    private void updateLayoutStateToFillEnd(LinearLayoutManager$a linearLayoutManager$a) {
        int n3 = linearLayoutManager$a.b;
        int n4 = linearLayoutManager$a.c;
        this.updateLayoutStateToFillEnd(n3, n4);
    }

    private void updateLayoutStateToFillStart(int n3, int n4) {
        LinearLayoutManager$c linearLayoutManager$c = this.mLayoutState;
        t t3 = this.mOrientationHelper;
        int n7 = t3.k();
        linearLayoutManager$c.c = n7 = n4 - n7;
        linearLayoutManager$c = this.mLayoutState;
        linearLayoutManager$c.d = n3;
        n3 = (int)(this.mShouldReverseLayout ? 1 : 0);
        n7 = -1;
        n3 = n3 != 0 ? 1 : -1;
        linearLayoutManager$c.e = n3;
        linearLayoutManager$c.f = n7;
        linearLayoutManager$c.b = n4;
        linearLayoutManager$c.g = -1 << -1;
    }

    private void updateLayoutStateToFillStart(LinearLayoutManager$a linearLayoutManager$a) {
        int n3 = linearLayoutManager$a.b;
        int n4 = linearLayoutManager$a.c;
        this.updateLayoutStateToFillStart(n3, n4);
    }

    public void assertNotInLayoutOrScroll(String string2) {
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.mPendingSavedState;
        if (linearLayoutManager$SavedState == null) {
            super.assertNotInLayoutOrScroll(string2);
        }
    }

    public void calculateExtraLayoutSpace(RecyclerView$y recyclerView$y, int[] nArray) {
        int n3 = this.getExtraLayoutSpace(recyclerView$y);
        LinearLayoutManager$c linearLayoutManager$c = this.mLayoutState;
        int n4 = linearLayoutManager$c.f;
        int n7 = -1;
        if (n4 == n7) {
            n4 = 0;
            linearLayoutManager$c = null;
        } else {
            n4 = n3;
            n3 = 0;
            recyclerView$y = null;
        }
        nArray[0] = n3;
        nArray[1] = n4;
    }

    public boolean canScrollHorizontally() {
        int n3 = this.mOrientation;
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean canScrollVertically() {
        int n3 = this.mOrientation;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public void collectAdjacentPrefetchPositions(int n3, int n4, RecyclerView$y recyclerView$y, RecyclerView$o$c recyclerView$o$c) {
        int n7 = this.mOrientation;
        if (n7 != 0) {
            n3 = n4;
        }
        n4 = this.getChildCount();
        if (n4 != 0 && n3 != 0) {
            this.ensureLayoutState();
            n4 = 1;
            n7 = n3 > 0 ? 1 : -1;
            n3 = Math.abs(n3);
            this.updateLayoutState(n7, n3, n4 != 0, recyclerView$y);
            LinearLayoutManager$c linearLayoutManager$c = this.mLayoutState;
            this.collectPrefetchPositionsForLayoutState(recyclerView$y, linearLayoutManager$c, recyclerView$o$c);
        }
    }

    public void collectInitialPrefetchPositions(int n3, RecyclerView$o$c recyclerView$o$c) {
        int n4;
        int n7;
        int n8;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.mPendingSavedState;
        int n10 = -1;
        if (linearLayoutManager$SavedState != null && (n8 = linearLayoutManager$SavedState.a) >= 0) {
            n7 = linearLayoutManager$SavedState.c;
        } else {
            this.resolveShouldLayoutReverse();
            n7 = this.mShouldReverseLayout;
            n8 = this.mPendingScrollPosition;
            if (n8 == n10) {
                n8 = n7 != 0 ? n3 + -1 : 0;
            }
        }
        if (n7 == 0) {
            n10 = 1;
        }
        linearLayoutManager$SavedState = null;
        for (n7 = 0; n7 < (n4 = this.mInitialPrefetchItemCount) && n8 >= 0 && n8 < n3; n8 += n10, ++n7) {
            RecyclerView$o$c recyclerView$o$c2 = recyclerView$o$c;
            recyclerView$o$c2 = (GapWorker$b)recyclerView$o$c;
            ((GapWorker$b)recyclerView$o$c2).a(n8, 0);
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView$y recyclerView$y, LinearLayoutManager$c linearLayoutManager$c, RecyclerView$o$c recyclerView$o$c) {
        int n3;
        int n4 = linearLayoutManager$c.d;
        if (n4 >= 0 && n4 < (n3 = recyclerView$y.b())) {
            recyclerView$y = null;
            int n7 = linearLayoutManager$c.g;
            n3 = Math.max(0, n7);
            recyclerView$o$c = (GapWorker$b)recyclerView$o$c;
            ((GapWorker$b)recyclerView$o$c).a(n4, n3);
        }
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
        int n4 = this.getChildCount();
        if (n4 == 0) {
            return null;
        }
        n4 = 0;
        View view = this.getChildAt(0);
        int n7 = this.getPosition(view);
        int n8 = 1;
        if (n3 < n7) {
            n4 = 1;
        }
        if (n4 != (n3 = (int)(this.mShouldReverseLayout ? 1 : 0))) {
            n8 = -1;
        }
        n3 = this.mOrientation;
        n4 = 0;
        if (n3 == 0) {
            float f5 = n8;
            PointF pointF = new PointF(f5, 0.0f);
            return pointF;
        }
        float f6 = n8;
        PointF pointF = new PointF(0.0f, f6);
        return pointF;
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

    public int convertFocusDirectionToLayoutDirection(int n3) {
        int n4 = -1;
        int n7 = 1;
        if (n3 != n7) {
            int n8 = 2;
            if (n3 != n8) {
                n8 = 17;
                int n10 = -1 << -1;
                if (n3 != n8) {
                    n8 = 33;
                    if (n3 != n8) {
                        n4 = 66;
                        if (n3 != n4) {
                            n4 = 130;
                            if (n3 != n4) {
                                return n10;
                            }
                            n3 = this.mOrientation;
                            if (n3 != n7) {
                                n7 = -1 << -1;
                            }
                            return n7;
                        }
                        n3 = this.mOrientation;
                        if (n3 != 0) {
                            n7 = -1 << -1;
                        }
                        return n7;
                    }
                    n3 = this.mOrientation;
                    if (n3 != n7) {
                        n4 = -1 << -1;
                    }
                    return n4;
                }
                n3 = this.mOrientation;
                if (n3 != 0) {
                    n4 = -1 << -1;
                }
                return n4;
            }
            n3 = this.mOrientation;
            if (n3 == n7) {
                return n7;
            }
            n3 = (int)(this.isLayoutRTL() ? 1 : 0);
            if (n3 != 0) {
                return n4;
            }
            return n7;
        }
        n3 = this.mOrientation;
        if (n3 == n7) {
            return n4;
        }
        n3 = (int)(this.isLayoutRTL() ? 1 : 0);
        if (n3 != 0) {
            return n7;
        }
        return n4;
    }

    public LinearLayoutManager$c createLayoutState() {
        LinearLayoutManager$c linearLayoutManager$c = new Object();
        linearLayoutManager$c.a = true;
        linearLayoutManager$c.h = 0;
        linearLayoutManager$c.i = 0;
        linearLayoutManager$c.k = null;
        return linearLayoutManager$c;
    }

    public void ensureLayoutState() {
        LinearLayoutManager$c linearLayoutManager$c = this.mLayoutState;
        if (linearLayoutManager$c == null) {
            this.mLayoutState = linearLayoutManager$c = this.createLayoutState();
        }
    }

    public int fill(RecyclerView$u recyclerView$u, LinearLayoutManager$c linearLayoutManager$c, RecyclerView$y recyclerView$y, boolean bl2) {
        int n3;
        int n4;
        int n7 = linearLayoutManager$c.c;
        int n8 = linearLayoutManager$c.g;
        int n10 = -1 << -1;
        if (n8 != n10) {
            if (n7 < 0) {
                linearLayoutManager$c.g = n8 += n7;
            }
            this.recycleByLayoutState(recyclerView$u, linearLayoutManager$c);
        }
        n8 = linearLayoutManager$c.c;
        int n14 = linearLayoutManager$c.h;
        n8 += n14;
        LinearLayoutManager$b linearLayoutManager$b = this.mLayoutChunkResult;
        while (((n4 = linearLayoutManager$c.l) != 0 || n8 > 0) && (n4 = linearLayoutManager$c.d) >= 0 && n4 < (n3 = recyclerView$y.b())) {
            int n15;
            List list = null;
            linearLayoutManager$b.a = 0;
            linearLayoutManager$b.b = false;
            linearLayoutManager$b.c = false;
            linearLayoutManager$b.d = false;
            this.layoutChunk(recyclerView$u, recyclerView$y, linearLayoutManager$c, linearLayoutManager$b);
            n4 = (int)(linearLayoutManager$b.b ? 1 : 0);
            if (n4 != 0) break;
            n4 = linearLayoutManager$c.b;
            n3 = linearLayoutManager$b.a;
            linearLayoutManager$c.b = n15 = linearLayoutManager$c.f * n3 + n4;
            n4 = (int)(linearLayoutManager$b.c ? 1 : 0);
            if (n4 == 0 || (list = linearLayoutManager$c.k) != null || (n4 = (int)(recyclerView$y.g ? 1 : 0)) == 0) {
                linearLayoutManager$c.c = n4 = linearLayoutManager$c.c - n3;
                n8 -= n3;
            }
            if ((n4 = linearLayoutManager$c.g) != n10) {
                linearLayoutManager$c.g = n4 += n3;
                n3 = linearLayoutManager$c.c;
                if (n3 < 0) {
                    linearLayoutManager$c.g = n4 += n3;
                }
                this.recycleByLayoutState(recyclerView$u, linearLayoutManager$c);
            }
            if (!bl2 || (n4 = (int)(linearLayoutManager$b.d ? 1 : 0)) == 0) continue;
        }
        int n16 = linearLayoutManager$c.c;
        return n7 - n16;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        boolean bl2;
        int n3 = this.getChildCount();
        View view = this.findOneVisibleChild(0, n3, bl2 = true, false);
        n3 = view == null ? -1 : this.getPosition(view);
        return n3;
    }

    public View findFirstVisibleChildClosestToEnd(boolean bl2, boolean bl3) {
        int n3 = this.mShouldReverseLayout;
        if (n3 != 0) {
            int n4 = this.getChildCount();
            return this.findOneVisibleChild(0, n4, bl2, bl3);
        }
        n3 = this.getChildCount() + -1;
        return this.findOneVisibleChild(n3, -1, bl2, bl3);
    }

    public View findFirstVisibleChildClosestToStart(boolean bl2, boolean bl3) {
        int n3 = this.mShouldReverseLayout;
        if (n3 != 0) {
            n3 = this.getChildCount() + -1;
            return this.findOneVisibleChild(n3, -1, bl2, bl3);
        }
        int n4 = this.getChildCount();
        return this.findOneVisibleChild(0, n4, bl2, bl3);
    }

    public int findFirstVisibleItemPosition() {
        boolean bl2;
        int n3 = this.getChildCount();
        View view = this.findOneVisibleChild(0, n3, false, bl2 = true);
        n3 = view == null ? -1 : this.getPosition(view);
        return n3;
    }

    public int findLastCompletelyVisibleItemPosition() {
        int n3 = this.getChildCount();
        int n4 = 1;
        int n7 = -1;
        View view = this.findOneVisibleChild(n3 -= n4, n7, n4 != 0, false);
        if (view != null) {
            n7 = this.getPosition(view);
        }
        return n7;
    }

    public int findLastVisibleItemPosition() {
        int n3 = this.getChildCount();
        int n4 = 1;
        int n7 = -1;
        View view = this.findOneVisibleChild(n3 -= n4, n7, false, n4 != 0);
        if (view != null) {
            n7 = this.getPosition(view);
        }
        return n7;
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int n3, int n4) {
        this.ensureLayoutState();
        if (n4 > n3 || n4 < n3) {
            View view;
            int n7;
            t t3 = this.mOrientationHelper;
            Object object = this.getChildAt(n3);
            int n8 = t3.e((View)object);
            if (n8 < (n7 = ((t)(object = this.mOrientationHelper)).k())) {
                n8 = 16644;
                n7 = 16388;
            } else {
                n8 = 4161;
                n7 = 4097;
            }
            int n10 = this.mOrientation;
            if (n10 == 0) {
                A a2 = this.mHorizontalBoundCheck;
                view = a2.a(n3, n4, n8, n7);
            } else {
                A a3 = this.mVerticalBoundCheck;
                view = a3.a(n3, n4, n8, n7);
            }
            return view;
        }
        return this.getChildAt(n3);
    }

    /*
     * WARNING - void declaration
     */
    public View findOneVisibleChild(int n3, int n4, boolean bl2, boolean bl3) {
        View view;
        void var3_6;
        void var4_7;
        this.ensureLayoutState();
        int n7 = 320;
        if (bl2) {
            int n8 = 24579;
        } else {
            int n10 = 320;
        }
        if (var4_7 == false) {
            n7 = 0;
        }
        int n14 = this.mOrientation;
        if (n14 == 0) {
            A a2 = this.mHorizontalBoundCheck;
            view = a2.a(n3, n4, (int)var3_6, n7);
        } else {
            A a3 = this.mVerticalBoundCheck;
            view = a3.a(n3, n4, (int)var3_6, n7);
        }
        return view;
    }

    public View findReferenceChild(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y, boolean bl2, boolean bl3) {
        int n3;
        int n4;
        LinearLayoutManager linearLayoutManager = this;
        this.ensureLayoutState();
        int n7 = this.getChildCount();
        int n8 = 1;
        if (bl3) {
            n7 = this.getChildCount() - n8;
            n4 = -1;
            n3 = -1;
        } else {
            n4 = n7;
            n7 = 0;
            n3 = 1;
        }
        int n10 = recyclerView$y.b();
        t t3 = linearLayoutManager.mOrientationHelper;
        int n14 = t3.k();
        t t4 = linearLayoutManager.mOrientationHelper;
        int n15 = t4.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (n7 != n4) {
            block14: {
                View view4;
                block18: {
                    block19: {
                        block17: {
                            int n16;
                            block16: {
                                RecyclerView$LayoutParams recyclerView$LayoutParams;
                                int n17;
                                int n18;
                                t t7;
                                block15: {
                                    view4 = linearLayoutManager.getChildAt(n7);
                                    n16 = linearLayoutManager.getPosition(view4);
                                    t7 = linearLayoutManager.mOrientationHelper;
                                    n18 = t7.e(view4);
                                    t t9 = linearLayoutManager.mOrientationHelper;
                                    n17 = t9.b(view4);
                                    if (n16 < 0 || n16 >= n10) break block14;
                                    recyclerView$LayoutParams = (RecyclerView$LayoutParams)view4.getLayoutParams();
                                    n16 = (int)(recyclerView$LayoutParams.isItemRemoved() ? 1 : 0);
                                    if (n16 == 0) break block15;
                                    if (view3 == null) {
                                        view3 = view4;
                                    }
                                    break block14;
                                }
                                if (n17 <= n14 && n18 < n14) {
                                    n16 = 1;
                                } else {
                                    n16 = 0;
                                    recyclerView$LayoutParams = null;
                                }
                                if (n18 >= n15 && n17 > n15) {
                                    n18 = 1;
                                } else {
                                    n18 = 0;
                                    t7 = null;
                                }
                                if (n16 == 0 && n18 == 0) {
                                    return view4;
                                }
                                if (!bl2) break block16;
                                if (n18 != 0) break block17;
                                if (view != null) break block14;
                                break block18;
                            }
                            if (n16 == 0) break block19;
                        }
                        view2 = view4;
                        break block14;
                    }
                    if (view != null) break block14;
                }
                view = view4;
            }
            n7 += n3;
        }
        if (view == null) {
            view = view2 != null ? view2 : view3;
        }
        return view;
    }

    public View findViewByPosition(int n3) {
        View view;
        int n4 = this.getChildCount();
        if (n4 == 0) {
            return null;
        }
        View view2 = this.getChildAt(0);
        int n7 = this.getPosition(view2);
        if ((n7 = n3 - n7) >= 0 && n7 < n4 && (n7 = this.getPosition(view = this.getChildAt(n7))) == n3) {
            return view;
        }
        return super.findViewByPosition(n3);
    }

    public RecyclerView$LayoutParams generateDefaultLayoutParams() {
        int n3 = -2;
        RecyclerView$LayoutParams recyclerView$LayoutParams = new RecyclerView$LayoutParams(n3, n3);
        return recyclerView$LayoutParams;
    }

    public int getExtraLayoutSpace(RecyclerView$y recyclerView$y) {
        int n3 = recyclerView$y.a;
        int n4 = -1;
        if (n3 != n4) {
            return this.mOrientationHelper.l();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        int n3;
        int n4 = this.getLayoutDirection();
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public boolean isLayoutReversed() {
        return this.mReverseLayout;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y, LinearLayoutManager$c linearLayoutManager$c, LinearLayoutManager$b linearLayoutManager$b) {
        boolean bl2;
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        Object object;
        recyclerView$u = linearLayoutManager$c.b(recyclerView$u);
        int n14 = 1;
        if (recyclerView$u == null) {
            linearLayoutManager$b.b = n14;
            return;
        }
        Object object2 = object = recyclerView$u.getLayoutParams();
        object2 = (RecyclerView$LayoutParams)((Object)object);
        object = linearLayoutManager$c.k;
        int n15 = -1;
        int n16 = 0;
        t t3 = null;
        if (object == null) {
            n10 = this.mShouldReverseLayout;
            n8 = linearLayoutManager$c.f;
            n8 = n8 == n15 ? 1 : 0;
            if (n10 == n8) {
                this.addView((View)recyclerView$u);
            } else {
                this.addView((View)recyclerView$u, 0);
            }
        } else {
            n10 = this.mShouldReverseLayout;
            n8 = linearLayoutManager$c.f;
            n8 = n8 == n15 ? 1 : 0;
            if (n10 == n8) {
                this.addDisappearingView((View)recyclerView$u);
            } else {
                this.addDisappearingView((View)recyclerView$u, 0);
            }
        }
        this.measureChildWithMargins((View)recyclerView$u, 0, 0);
        object = this.mOrientationHelper;
        linearLayoutManager$b.a = n10 = ((t)object).c((View)recyclerView$u);
        n10 = this.mOrientation;
        if (n10 == n14) {
            n10 = (int)(this.isLayoutRTL() ? 1 : 0);
            if (n10 != 0) {
                n10 = this.getWidth();
                n16 = this.getPaddingRight();
                n10 -= n16;
                t3 = this.mOrientationHelper;
                n16 = t3.d((View)recyclerView$u);
                n16 = n10 - n16;
            } else {
                n16 = this.getPaddingLeft();
                object = this.mOrientationHelper;
                n10 = ((t)object).d((View)recyclerView$u) + n16;
            }
            n8 = linearLayoutManager$c.f;
            if (n8 == n15) {
                n7 = linearLayoutManager$c.b;
                n15 = linearLayoutManager$b.a;
                n15 = n7 - n15;
                n4 = n7;
                n3 = n10;
                n8 = n15;
            } else {
                n7 = linearLayoutManager$c.b;
                n15 = linearLayoutManager$b.a + n7;
                n8 = n7;
                n3 = n10;
                n4 = n15;
            }
        } else {
            n10 = this.getPaddingTop();
            t3 = this.mOrientationHelper;
            n16 = t3.d((View)recyclerView$u) + n10;
            n8 = linearLayoutManager$c.f;
            if (n8 == n15) {
                n7 = linearLayoutManager$c.b;
                n15 = linearLayoutManager$b.a;
                n15 = n7 - n15;
                n3 = n7;
                n8 = n10;
                n4 = n16;
                n16 = n15;
            } else {
                n7 = linearLayoutManager$c.b;
                n15 = linearLayoutManager$b.a + n7;
                n8 = n10;
                n3 = n15;
                n4 = n16;
                n16 = n7;
            }
        }
        object = this;
        this.layoutDecoratedWithMargins((View)recyclerView$u, n16, n8, n3, n4);
        n7 = (int)(((RecyclerView$LayoutParams)((Object)object2)).isItemRemoved() ? 1 : 0);
        if (n7 != 0 || (n7 = (int)(((RecyclerView$LayoutParams)((Object)object2)).isItemChanged() ? 1 : 0)) != 0) {
            linearLayoutManager$b.c = n14;
        }
        linearLayoutManager$b.d = bl2 = recyclerView$u.hasFocusable();
    }

    public void onAnchorReady(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y, LinearLayoutManager$a linearLayoutManager$a, int n3) {
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView$u recyclerView$u) {
        super.onDetachedFromWindow(recyclerView, recyclerView$u);
        boolean bl2 = this.mRecycleChildrenOnDetach;
        if (bl2) {
            this.removeAndRecycleAllViews(recyclerView$u);
            recyclerView$u.b();
        }
    }

    public View onFocusSearchFailed(View view, int n3, RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        this.resolveShouldLayoutReverse();
        int n4 = this.getChildCount();
        if (n4 == 0) {
            return null;
        }
        n4 = this.convertFocusDirectionToLayoutDirection(n3);
        if (n4 == (n3 = -1 << -1)) {
            return null;
        }
        this.ensureLayoutState();
        float f5 = (float)this.mOrientationHelper.l() * 0.33333334f;
        int n7 = (int)f5;
        this.updateLayoutState(n4, n7, false, recyclerView$y);
        LinearLayoutManager$c linearLayoutManager$c = this.mLayoutState;
        linearLayoutManager$c.g = n3;
        linearLayoutManager$c.a = false;
        this.fill(recyclerView$u, linearLayoutManager$c, recyclerView$y, true);
        n3 = -1;
        recyclerView$u = n4 == n3 ? this.findPartiallyOrCompletelyInvisibleChildClosestToStart() : this.findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        view = n4 == n3 ? this.getChildClosestToStart() : this.getChildClosestToEnd();
        n3 = (int)(view.hasFocusable() ? 1 : 0);
        if (n3 != 0) {
            if (recyclerView$u == null) {
                return null;
            }
            return view;
        }
        return recyclerView$u;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int n3 = this.getChildCount();
        if (n3 > 0) {
            n3 = this.findFirstVisibleItemPosition();
            accessibilityEvent.setFromIndex(n3);
            n3 = this.findLastVisibleItemPosition();
            accessibilityEvent.setToIndex(n3);
        }
    }

    public void onInitializeAccessibilityNodeInfo(RecyclerView$u object, RecyclerView$y recyclerView$y, C2 c2) {
        int n3;
        int n4;
        super.onInitializeAccessibilityNodeInfo((RecyclerView$u)object, recyclerView$y, c2);
        object = this.mRecyclerView.mAdapter;
        if (object != null && (n4 = ((RecyclerView$f)object).getItemCount()) > 0 && (n4 = Build.VERSION.SDK_INT) >= (n3 = 23)) {
            object = C2$a.o;
            c2.b((C2$a)object);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void onLayoutChildren(RecyclerView$u object, RecyclerView$y recyclerView$y) {
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        void var10_44;
        Object object2;
        int n14;
        int n15;
        int n16;
        Object object3 = this.mPendingSavedState;
        int n17 = -1;
        if ((object3 != null || (n16 = this.mPendingScrollPosition) != n17) && (n15 = recyclerView$y.b()) == 0) {
            this.removeAndRecycleAllViews((RecyclerView$u)object);
            return;
        }
        object3 = this.mPendingSavedState;
        if (object3 != null && (n14 = ((LinearLayoutManager$SavedState)object3).a) >= 0) {
            this.mPendingScrollPosition = n14;
        }
        this.ensureLayoutState();
        this.mLayoutState.a = false;
        this.resolveShouldLayoutReverse();
        object3 = this.getFocusedChild();
        Object object4 = this.mAnchorInfo;
        int n18 = ((LinearLayoutManager$a)object4).e;
        boolean bl2 = true;
        if (n18 != 0 && (n18 = this.mPendingScrollPosition) == n17 && (object2 = this.mPendingSavedState) == null) {
            int n19;
            int n20;
            if (object3 != null && ((n20 = ((t)(object4 = this.mOrientationHelper)).e((View)object3)) >= (n18 = ((t)(object2 = this.mOrientationHelper)).g()) || (n19 = ((t)(object4 = this.mOrientationHelper)).b((View)object3)) <= (n18 = ((t)(object2 = this.mOrientationHelper)).k()))) {
                object4 = this.mAnchorInfo;
                n18 = this.getPosition((View)object3);
                ((LinearLayoutManager$a)object4).c(n18, (View)object3);
            }
        } else {
            ((LinearLayoutManager$a)object4).d();
            object3 = this.mAnchorInfo;
            int n21 = this.mShouldReverseLayout;
            n18 = (int)(this.mStackFromEnd ? 1 : 0);
            int n22 = n21 ^ n18;
            ((LinearLayoutManager$a)object3).d = n22;
            this.updateAnchorInfoForLayout((RecyclerView$u)object, recyclerView$y, (LinearLayoutManager$a)object3);
            object3 = this.mAnchorInfo;
            ((LinearLayoutManager$a)object3).e = bl2;
        }
        object3 = this.mLayoutState;
        int n24 = ((LinearLayoutManager$c)object3).j;
        if (n24 >= 0) {
            boolean bl3 = true;
        } else {
            int n25 = -1;
        }
        ((LinearLayoutManager$c)object3).f = var10_44;
        object3 = this.mReusableIntPair;
        object3[0] = false;
        object3[bl2] = false;
        this.calculateExtraLayoutSpace(recyclerView$y, (int[])object3);
        int n27 = this.mReusableIntPair[0];
        n27 = Math.max(0, n27);
        object4 = this.mOrientationHelper;
        int n28 = ((t)object4).k() + n27;
        object3 = this.mReusableIntPair;
        Object object5 = object3[bl2];
        int n29 = Math.max(0, (int)object5);
        object2 = this.mOrientationHelper;
        n18 = ((t)object2).h() + n29;
        boolean bl4 = recyclerView$y.g;
        if (bl4 && (n10 = this.mPendingScrollPosition) != n17 && (n8 = this.mPendingScrollPositionOffset) != (n7 = -1 << -1) && (object3 = this.findViewByPosition(n10)) != null) {
            void var5_16;
            n8 = (int)(this.mShouldReverseLayout ? 1 : 0);
            if (n8 != 0) {
                t t3 = this.mOrientationHelper;
                n8 = t3.g();
                t t4 = this.mOrientationHelper;
                int n30 = t4.b((View)object3);
                n8 -= n30;
                int n32 = this.mPendingScrollPositionOffset;
            } else {
                int n34 = this.mOrientationHelper.e((View)object3);
                t t7 = this.mOrientationHelper;
                n8 = t7.k();
                int n35 = n34 - n8;
                n8 = this.mPendingScrollPositionOffset;
            }
            if ((n8 -= var5_16) > 0) {
                n4 = n28 + n8;
            } else {
                n18 -= n8;
            }
        }
        object3 = this.mAnchorInfo;
        n8 = ((LinearLayoutManager$a)object3).d;
        if (n8 != 0 ? (n8 = (int)(this.mShouldReverseLayout ? 1 : 0)) != 0 : (n8 = (int)(this.mShouldReverseLayout ? 1 : 0)) == 0) {
            n17 = 1;
        }
        this.onAnchorReady((RecyclerView$u)object, recyclerView$y, (LinearLayoutManager$a)object3, n17);
        this.detachAndScrapAttachedViews((RecyclerView$u)object);
        object3 = this.mLayoutState;
        n17 = (int)(this.resolveIsInfinite() ? 1 : 0);
        ((LinearLayoutManager$c)object3).l = n17;
        this.mLayoutState.getClass();
        this.mLayoutState.i = 0;
        object3 = this.mAnchorInfo;
        n17 = (int)(((LinearLayoutManager$a)object3).d ? 1 : 0);
        if (n17 != 0) {
            this.updateLayoutStateToFillStart((LinearLayoutManager$a)object3);
            object3 = this.mLayoutState;
            ((LinearLayoutManager$c)object3).h = n4;
            this.fill((RecyclerView$u)object, (LinearLayoutManager$c)object3, recyclerView$y, false);
            object3 = this.mLayoutState;
            n17 = ((LinearLayoutManager$c)object3).b;
            int n36 = ((LinearLayoutManager$c)object3).d;
            int n37 = ((LinearLayoutManager$c)object3).c;
            if (n37 > 0) {
                n18 += n37;
            }
            object3 = this.mAnchorInfo;
            this.updateLayoutStateToFillEnd((LinearLayoutManager$a)object3);
            object3 = this.mLayoutState;
            ((LinearLayoutManager$c)object3).h = n18;
            n18 = ((LinearLayoutManager$c)object3).d;
            n8 = ((LinearLayoutManager$c)object3).e;
            ((LinearLayoutManager$c)object3).d = n18 += n8;
            this.fill((RecyclerView$u)object, (LinearLayoutManager$c)object3, recyclerView$y, false);
            object3 = this.mLayoutState;
            n18 = ((LinearLayoutManager$c)object3).b;
            int n38 = ((LinearLayoutManager$c)object3).c;
            if (n38 > 0) {
                this.updateLayoutStateToFillStart(n36, n17);
                LinearLayoutManager$c linearLayoutManager$c = this.mLayoutState;
                linearLayoutManager$c.h = n38;
                this.fill((RecyclerView$u)object, linearLayoutManager$c, recyclerView$y, false);
                object3 = this.mLayoutState;
                n17 = ((LinearLayoutManager$c)object3).b;
            }
        } else {
            int n39;
            int n41;
            this.updateLayoutStateToFillEnd((LinearLayoutManager$a)object3);
            object3 = this.mLayoutState;
            ((LinearLayoutManager$c)object3).h = n18;
            this.fill((RecyclerView$u)object, (LinearLayoutManager$c)object3, recyclerView$y, false);
            object3 = this.mLayoutState;
            n18 = ((LinearLayoutManager$c)object3).b;
            n17 = ((LinearLayoutManager$c)object3).d;
            int n42 = ((LinearLayoutManager$c)object3).c;
            if (n42 > 0) {
                n41 = n4 + n42;
            }
            object3 = this.mAnchorInfo;
            this.updateLayoutStateToFillStart((LinearLayoutManager$a)object3);
            object3 = this.mLayoutState;
            ((LinearLayoutManager$c)object3).h = n41;
            int n43 = ((LinearLayoutManager$c)object3).d;
            n8 = ((LinearLayoutManager$c)object3).e;
            ((LinearLayoutManager$c)object3).d = n39 = n43 + n8;
            this.fill((RecyclerView$u)object, (LinearLayoutManager$c)object3, recyclerView$y, false);
            object3 = this.mLayoutState;
            int n44 = ((LinearLayoutManager$c)object3).b;
            int n45 = ((LinearLayoutManager$c)object3).c;
            if (n45 > 0) {
                this.updateLayoutStateToFillEnd(n17, n18);
                LinearLayoutManager$c linearLayoutManager$c = this.mLayoutState;
                linearLayoutManager$c.h = n45;
                this.fill((RecyclerView$u)object, linearLayoutManager$c, recyclerView$y, false);
                object3 = this.mLayoutState;
                n18 = ((LinearLayoutManager$c)object3).b;
            }
            n17 = n44;
        }
        if ((n3 = this.getChildCount()) > 0) {
            void var5_29;
            boolean bl5 = this.mShouldReverseLayout;
            boolean bl6 = this.mStackFromEnd;
            boolean bl7 = bl5 ^ bl6;
            if (bl7) {
                int n46 = this.fixLayoutEndGap(n18, (RecyclerView$u)object, recyclerView$y, bl2);
                n18 += n46;
                int n47 = this.fixLayoutStartGap(n17 += n46, (RecyclerView$u)object, recyclerView$y, false);
            } else {
                int n48 = this.fixLayoutStartGap(n17, (RecyclerView$u)object, recyclerView$y, bl2);
                n17 += n48;
                int n49 = this.fixLayoutEndGap(n18 += n48, (RecyclerView$u)object, recyclerView$y, false);
            }
            n17 += var5_29;
            n18 += var5_29;
        }
        this.layoutForPredictiveAnimations((RecyclerView$u)object, recyclerView$y, n17, n18);
        boolean bl8 = recyclerView$y.g;
        if (!bl8) {
            int n50;
            object = this.mOrientationHelper;
            ((t)object).b = n50 = ((t)object).l();
        } else {
            object = this.mAnchorInfo;
            ((LinearLayoutManager$a)object).d();
        }
        this.mLastStackFromEnd = bl8 = this.mStackFromEnd;
    }

    public void onLayoutCompleted(RecyclerView$y recyclerView$y) {
        super.onLayoutCompleted(recyclerView$y);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = -1 << -1;
        this.mAnchorInfo.d();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        int n3 = parcelable instanceof LinearLayoutManager$SavedState;
        if (n3 != 0) {
            parcelable = (LinearLayoutManager$SavedState)parcelable;
            this.mPendingSavedState = parcelable;
            n3 = this.mPendingScrollPosition;
            int n4 = -1;
            if (n3 != n4) {
                parcelable.a = n4;
            }
            this.requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.mPendingSavedState;
        if (linearLayoutManager$SavedState != null) {
            boolean bl2;
            int n7;
            int n3;
            LinearLayoutManager$SavedState linearLayoutManager$SavedState2 = new Object();
            linearLayoutManager$SavedState2.a = n3 = linearLayoutManager$SavedState.a;
            linearLayoutManager$SavedState2.b = n7 = linearLayoutManager$SavedState.b;
            linearLayoutManager$SavedState2.c = bl2 = linearLayoutManager$SavedState.c;
            return linearLayoutManager$SavedState2;
        }
        linearLayoutManager$SavedState = new LinearLayoutManager$SavedState();
        int n3 = this.getChildCount();
        if (n3 > 0) {
            this.ensureLayoutState();
            n3 = (int)(this.mLastStackFromEnd ? 1 : 0);
            int n4 = this.mShouldReverseLayout;
            linearLayoutManager$SavedState.c = n3 ^= n4;
            if (n3 != 0) {
                int n7;
                View view = this.getChildClosestToEnd();
                t t3 = this.mOrientationHelper;
                int n8 = t3.g();
                t t4 = this.mOrientationHelper;
                int n10 = t4.b(view);
                linearLayoutManager$SavedState.b = n7 = n8 - n10;
                linearLayoutManager$SavedState.a = n3 = this.getPosition(view);
            } else {
                int n14;
                View view = this.getChildClosestToStart();
                linearLayoutManager$SavedState.a = n14 = this.getPosition(view);
                n3 = this.mOrientationHelper.e(view);
                t t7 = this.mOrientationHelper;
                int n15 = t7.k();
                linearLayoutManager$SavedState.b = n3 -= n15;
            }
        } else {
            linearLayoutManager$SavedState.a = n3 = -1;
        }
        return linearLayoutManager$SavedState;
    }

    public boolean performAccessibilityAction(int n3, Bundle object) {
        int n4 = super.performAccessibilityAction(n3, (Bundle)object);
        int n7 = 1;
        if (n4 != 0) {
            return n7 != 0;
        }
        n4 = 16908343;
        if (n3 == n4 && object != null) {
            n3 = this.mOrientation;
            n4 = -1;
            if (n3 == n7) {
                String string2 = "android.view.accessibility.action.ARGUMENT_ROW_INT";
                n3 = object.getInt(string2, n4);
                if (n3 < 0) {
                    return false;
                }
                object = this.mRecyclerView;
                RecyclerView$u recyclerView$u = object.mRecycler;
                object = object.mState;
                int n8 = this.getRowCountForAccessibility(recyclerView$u, (RecyclerView$y)object) - n7;
                n3 = Math.min(n3, n8);
            } else {
                String string3 = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
                n3 = object.getInt(string3, n4);
                if (n3 < 0) {
                    return false;
                }
                object = this.mRecyclerView;
                RecyclerView$u recyclerView$u = object.mRecycler;
                object = object.mState;
                int n10 = this.getColumnCountForAccessibility(recyclerView$u, (RecyclerView$y)object) - n7;
                n3 = Math.min(n3, n10);
            }
            if (n3 >= 0) {
                this.scrollToPositionWithOffset(n3, 0);
                return n7 != 0;
            }
        }
        return false;
    }

    public void prepareForDrop(View object, View view, int n3, int n4) {
        Object object2 = "Cannot drop a view during a scroll or layout calculation";
        this.assertNotInLayoutOrScroll((String)object2);
        this.ensureLayoutState();
        this.resolveShouldLayoutReverse();
        n3 = this.getPosition((View)object);
        n4 = this.getPosition(view);
        int n7 = -1;
        int n8 = 1;
        n3 = n3 < n4 ? 1 : -1;
        boolean bl2 = this.mShouldReverseLayout;
        if (bl2) {
            if (n3 == n8) {
                object2 = this.mOrientationHelper;
                n3 = ((t)object2).g();
                int n10 = this.mOrientationHelper.e(view);
                t t3 = this.mOrientationHelper;
                int n14 = t3.c((View)object) + n10;
                this.scrollToPositionWithOffset(n4, n3 -= n14);
            } else {
                object = this.mOrientationHelper;
                int n15 = ((t)object).g();
                object2 = this.mOrientationHelper;
                int n16 = ((t)object2).b(view);
                this.scrollToPositionWithOffset(n4, n15 -= n16);
            }
        } else if (n3 == n7) {
            object = this.mOrientationHelper;
            int n17 = ((t)object).e(view);
            this.scrollToPositionWithOffset(n4, n17);
        } else {
            int n18 = this.mOrientationHelper.b(view);
            object2 = this.mOrientationHelper;
            int n19 = ((t)object2).c((View)object);
            this.scrollToPositionWithOffset(n4, n18 -= n19);
        }
    }

    public boolean resolveIsInfinite() {
        t t3 = this.mOrientationHelper;
        int n3 = t3.i();
        if (!n3 && !(n3 = (t3 = this.mOrientationHelper).f())) {
            n3 = 1;
        } else {
            n3 = 0;
            t3 = null;
        }
        return n3 != 0;
    }

    public int scrollBy(int n3, RecyclerView$u object, RecyclerView$y recyclerView$y) {
        int n4 = this.getChildCount();
        if (n4 != 0 && n3 != 0) {
            boolean bl2;
            this.ensureLayoutState();
            LinearLayoutManager$c linearLayoutManager$c = this.mLayoutState;
            linearLayoutManager$c.a = bl2 = true;
            n4 = n3 > 0 ? 1 : -1;
            int n7 = Math.abs(n3);
            this.updateLayoutState(n4, n7, bl2, recyclerView$y);
            LinearLayoutManager$c linearLayoutManager$c2 = this.mLayoutState;
            int n8 = linearLayoutManager$c2.g;
            int n10 = this.fill((RecyclerView$u)object, linearLayoutManager$c2, recyclerView$y, false) + n8;
            if (n10 < 0) {
                return 0;
            }
            if (n7 > n10) {
                n3 = n4 * n10;
            }
            object = this.mOrientationHelper;
            int n14 = -n3;
            ((t)object).p(n14);
            this.mLayoutState.j = n3;
            return n3;
        }
        return 0;
    }

    public int scrollHorizontallyBy(int n3, RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        int n4 = this.mOrientation;
        int n7 = 1;
        if (n4 == n7) {
            return 0;
        }
        return this.scrollBy(n3, recyclerView$u, recyclerView$y);
    }

    public void scrollToPosition(int n3) {
        this.mPendingScrollPosition = n3;
        this.mPendingScrollPositionOffset = n3 = -1 << -1;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.mPendingSavedState;
        if (linearLayoutManager$SavedState != null) {
            int n4;
            linearLayoutManager$SavedState.a = n4 = -1;
        }
        this.requestLayout();
    }

    public void scrollToPositionWithOffset(int n3, int n4) {
        this.mPendingScrollPosition = n3;
        this.mPendingScrollPositionOffset = n4;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.mPendingSavedState;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.a = n4 = -1;
        }
        this.requestLayout();
    }

    public int scrollVerticallyBy(int n3, RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        int n4 = this.mOrientation;
        if (n4 == 0) {
            return 0;
        }
        return this.scrollBy(n3, recyclerView$u, recyclerView$y);
    }

    public void setInitialPrefetchItemCount(int n3) {
        this.mInitialPrefetchItemCount = n3;
    }

    public void setOrientation(int n3) {
        int n4;
        if (n3 != 0 && n3 != (n4 = 1)) {
            String string2 = hj0_0.a(n3, "invalid orientation:");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        t t3 = null;
        this.assertNotInLayoutOrScroll(null);
        n4 = this.mOrientation;
        if (n3 != n4 || (t3 = this.mOrientationHelper) == null) {
            this.mOrientationHelper = t3 = t.a(this, n3);
            LinearLayoutManager$a linearLayoutManager$a = this.mAnchorInfo;
            linearLayoutManager$a.a = t3;
            this.mOrientation = n3;
            this.requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean bl2) {
        this.mRecycleChildrenOnDetach = bl2;
    }

    public void setReverseLayout(boolean bl2) {
        this.assertNotInLayoutOrScroll(null);
        boolean bl3 = this.mReverseLayout;
        if (bl2 == bl3) {
            return;
        }
        this.mReverseLayout = bl2;
        this.requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean bl2) {
        this.mSmoothScrollbarEnabled = bl2;
    }

    public void setStackFromEnd(boolean bl2) {
        this.assertNotInLayoutOrScroll(null);
        boolean bl3 = this.mStackFromEnd;
        if (bl3 == bl2) {
            return;
        }
        this.mStackFromEnd = bl2;
        this.requestLayout();
    }

    public boolean shouldMeasureTwice() {
        int n3;
        int n4 = this.getHeightMode();
        n4 = n4 != (n3 = 0x40000000) && (n4 = this.getWidthMode()) != n3 && (n4 = this.hasFlexibleChildInBothOrientations()) != 0 ? 1 : 0;
        return n4 != 0;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView$y object, int n3) {
        recyclerView = recyclerView.getContext();
        object = new o((Context)recyclerView);
        ((RecyclerView$x)object).setTargetPosition(n3);
        this.startSmoothScroll((RecyclerView$x)object);
    }

    public boolean supportsPredictiveItemAnimations() {
        boolean bl2;
        boolean bl3;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.mPendingSavedState;
        if (linearLayoutManager$SavedState == null && (bl3 = this.mLastStackFromEnd) == (bl2 = this.mStackFromEnd)) {
            bl3 = true;
        } else {
            bl3 = false;
            linearLayoutManager$SavedState = null;
        }
        return bl3;
    }

    public void validateChildOrder() {
        this.getChildCount();
        boolean bl2 = this.getChildCount();
        boolean bl3 = true;
        if (bl2 < bl3) {
            return;
        }
        boolean bl4 = false;
        Object object = null;
        Object object2 = this.getChildAt(0);
        int n3 = this.getPosition((View)object2);
        t t3 = this.mOrientationHelper;
        Object object3 = this.getChildAt(0);
        int n4 = t3.e((View)object3);
        int n7 = this.mShouldReverseLayout;
        String string2 = "detected invalid location";
        String string3 = "detected invalid position. loc invalid? ";
        if (n7 != 0) {
            int n14;
            for (n7 = 1; n7 < (n14 = this.getChildCount()); ++n7) {
                View view = this.getChildAt(n7);
                int n15 = this.getPosition(view);
                t t7 = this.mOrientationHelper;
                n14 = t7.e(view);
                if (n15 < n3) {
                    this.logChildren();
                    object3 = new StringBuilder(string3);
                    if (n14 >= n4) {
                        bl3 = false;
                    }
                    ((StringBuilder)object3).append(bl3);
                    object = ((StringBuilder)object3).toString();
                    object2 = new RuntimeException((String)object);
                    throw object2;
                }
                if (n14 <= n4) {
                    continue;
                }
                this.logChildren();
                object = new RuntimeException(string2);
                throw object;
            }
        } else {
            int n8;
            for (n7 = 1; n7 < (n8 = this.getChildCount()); ++n7) {
                View view = this.getChildAt(n7);
                int n10 = this.getPosition(view);
                t t4 = this.mOrientationHelper;
                n8 = t4.e(view);
                if (n10 < n3) {
                    this.logChildren();
                    object3 = new StringBuilder(string3);
                    if (n8 >= n4) {
                        bl3 = false;
                    }
                    ((StringBuilder)object3).append(bl3);
                    object = ((StringBuilder)object3).toString();
                    object2 = new RuntimeException((String)object);
                    throw object2;
                }
                if (n8 >= n4) {
                    continue;
                }
                this.logChildren();
                object = new RuntimeException(string2);
                throw object;
            }
        }
    }
}

