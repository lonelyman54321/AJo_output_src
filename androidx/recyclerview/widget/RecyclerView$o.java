/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.accessibility.AccessibilityEvent
 */
package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.R$styleable;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.A$b;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.B$a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$d;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$o$a;
import androidx.recyclerview.widget.RecyclerView$o$b;
import androidx.recyclerview.widget.RecyclerView$o$c;
import androidx.recyclerview.widget.RecyclerView$o$d;
import androidx.recyclerview.widget.RecyclerView$u;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.c$a;
import androidx.recyclerview.widget.c$b;
import androidx.recyclerview.widget.c_0;
import java.util.ArrayList;
import java.util.Objects;

public abstract class RecyclerView$o {
    boolean mAutoMeasure;
    c_0 mChildHelper;
    private int mHeight;
    private int mHeightMode;
    A mHorizontalBoundCheck;
    private final A$b mHorizontalBoundCheckCallback;
    boolean mIsAttachedToWindow;
    private boolean mItemPrefetchEnabled;
    private boolean mMeasurementCacheEnabled;
    int mPrefetchMaxCountObserved;
    boolean mPrefetchMaxObservedInInitialPrefetch;
    RecyclerView mRecyclerView;
    boolean mRequestedSimpleAnimations;
    RecyclerView$x mSmoothScroller;
    A mVerticalBoundCheck;
    private final A$b mVerticalBoundCheckCallback;
    private int mWidth;
    private int mWidthMode;

    public RecyclerView$o() {
        boolean bl2;
        A a2;
        Object object = new RecyclerView$o$a(this);
        this.mHorizontalBoundCheckCallback = object;
        RecyclerView$o$b recyclerView$o$b = new RecyclerView$o$b(this);
        this.mVerticalBoundCheckCallback = recyclerView$o$b;
        this.mHorizontalBoundCheck = a2 = new A((A$b)object);
        this.mVerticalBoundCheck = object = new A(recyclerView$o$b);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = bl2 = true;
        this.mItemPrefetchEnabled = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void addViewInt(View object, int n3, boolean bl2) {
        boolean bl3;
        Object object2;
        RecyclerView$B recyclerView$B;
        block14: {
            Object object3;
            int n4;
            block13: {
                RecyclerView recyclerView;
                boolean bl4;
                recyclerView$B = RecyclerView.getChildViewHolderInt((View)object);
                n4 = 1;
                if (!bl2 && !(bl4 = recyclerView$B.isRemoved())) {
                    object2 = this.mRecyclerView.mViewInfoStore;
                    ((B)object2).c(recyclerView$B);
                } else {
                    int n7;
                    object2 = this.mRecyclerView.mViewInfoStore.a;
                    object3 = (B$a)((a53)object2).get(recyclerView$B);
                    if (object3 == null) {
                        object3 = B$a.a();
                        ((a53)object2).put(recyclerView$B, object3);
                    }
                    ((B$a)object3).a = n7 = ((B$a)object3).a | n4;
                }
                object2 = (RecyclerView$LayoutParams)object.getLayoutParams();
                int n8 = recyclerView$B.wasReturnedFromScrap();
                if (n8 != 0 || (n8 = recyclerView$B.isScrap()) != 0) break block13;
                object3 = object.getParent();
                if (object3 == (recyclerView = this.mRecyclerView)) {
                    Object object4;
                    c_0 c_02 = this.mChildHelper;
                    n4 = c_02.j((View)object);
                    n8 = -1;
                    if (n3 == n8) {
                        object4 = this.mChildHelper;
                        n3 = ((c_0)object4).e();
                    }
                    if (n4 == n8) {
                        object2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        int n10 = this.mRecyclerView.indexOfChild((View)object);
                        ((StringBuilder)object2).append(n10);
                        object = lu_0.a(this.mRecyclerView, (StringBuilder)object2);
                        object4 = new IllegalStateException((String)object);
                        throw object4;
                    }
                    if (n4 != n3) {
                        object = this.mRecyclerView.mLayout;
                        ((RecyclerView$o)object).moveView(n4, n3);
                    }
                    break block14;
                } else {
                    object3 = this.mChildHelper;
                    ((c_0)object3).a((View)object, n3, false);
                    ((RecyclerView$LayoutParams)((Object)object2)).mInsetsDirty = n4;
                    RecyclerView$x recyclerView$x = this.mSmoothScroller;
                    if (recyclerView$x != null && (n3 = (int)(recyclerView$x.isRunning() ? 1 : 0)) != 0) {
                        recyclerView$x = this.mSmoothScroller;
                        recyclerView$x.onChildAttachedToWindow((View)object);
                    }
                }
                break block14;
            }
            n4 = (int)(recyclerView$B.isScrap() ? 1 : 0);
            if (n4 != 0) {
                recyclerView$B.unScrap();
            } else {
                recyclerView$B.clearReturnedFromScrapFlag();
            }
            c_0 c_03 = this.mChildHelper;
            object3 = object.getLayoutParams();
            c_03.b((View)object, n3, (ViewGroup.LayoutParams)object3, false);
        }
        if (bl3 = ((RecyclerView$LayoutParams)((Object)object2)).mPendingInvalidate) {
            bl3 = RecyclerView.sVerboseLoggingEnabled;
            if (bl3) {
                object = ((RecyclerView$LayoutParams)((Object)object2)).mViewHolder;
                Objects.toString(object);
            }
            object = recyclerView$B.itemView;
            object.invalidate();
            ((RecyclerView$LayoutParams)((Object)object2)).mPendingInvalidate = false;
        }
    }

    public static int chooseSize(int n3, int n4, int n7) {
        int n8 = View.MeasureSpec.getMode((int)n3);
        n3 = View.MeasureSpec.getSize((int)n3);
        int n10 = -1 << -1;
        if (n8 != n10) {
            n10 = 0x40000000;
            if (n8 != n10) {
                n3 = Math.max(n4, n7);
            }
            return n3;
        }
        n4 = Math.max(n4, n7);
        return Math.min(n3, n4);
    }

    private void detachViewInternal(int n3, View view) {
        this.mChildHelper.c(n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int getChildMeasureSpec(int n3, int n4, int n7, int n8, boolean bl2) {
        block8: {
            int n10;
            int n14;
            block11: {
                block9: {
                    int n15;
                    int n16;
                    block10: {
                        block7: {
                            block6: {
                                n3 -= n7;
                                n7 = 0;
                                n3 = Math.max(0, n3);
                                n16 = -2;
                                n15 = -1;
                                n14 = -1 << -1;
                                n10 = 0x40000000;
                                if (!bl2) break block6;
                                if (n8 >= 0) break block7;
                                if (n8 == n15 && (n4 == n14 || n4 != 0 && n4 == n10)) break block8;
                                break block9;
                            }
                            if (n8 < 0) break block10;
                        }
                        n4 = 0x40000000;
                        return View.MeasureSpec.makeMeasureSpec((int)n8, (int)n4);
                    }
                    if (n8 == n15) break block8;
                    if (n8 == n16) break block11;
                }
                n4 = 0;
                n8 = 0;
                return View.MeasureSpec.makeMeasureSpec((int)n8, (int)n4);
            }
            n4 = n4 != n14 && n4 != n10 ? 0 : -1 << -1;
        }
        n8 = n3;
        return View.MeasureSpec.makeMeasureSpec((int)n8, (int)n4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int getChildMeasureSpec(int n3, int n4, int n7, boolean n8) {
        block9: {
            block10: {
                block5: {
                    block8: {
                        block7: {
                            block6: {
                                block4: {
                                    n3 -= n4;
                                    n4 = 0;
                                    n3 = Math.max(0, n3);
                                    if (n8 == 0) break block4;
                                    if (n7 < 0) break block5;
                                    break block6;
                                }
                                if (n7 < 0) break block7;
                            }
                            n4 = 0x40000000;
                            return View.MeasureSpec.makeMeasureSpec((int)n7, (int)n4);
                        }
                        n8 = -1;
                        if (n7 != n8) break block8;
                        n4 = 0x40000000;
                        break block9;
                    }
                    n8 = -2;
                    if (n7 == n8) break block10;
                }
                n7 = 0;
                return View.MeasureSpec.makeMeasureSpec((int)n7, (int)n4);
            }
            n4 = -1 << -1;
        }
        n7 = n3;
        return View.MeasureSpec.makeMeasureSpec((int)n7, (int)n4);
    }

    private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
        int n3 = this.getPaddingLeft();
        int n4 = this.getPaddingTop();
        int n7 = this.getWidth();
        int n8 = this.getPaddingRight();
        n7 -= n8;
        n8 = this.getHeight();
        int n10 = this.getPaddingBottom();
        n8 -= n10;
        n10 = view.getLeft();
        int n14 = rect.left;
        n10 += n14;
        n14 = view.getScrollX();
        n10 -= n14;
        n14 = view.getTop();
        int n15 = rect.top;
        n14 += n15;
        int n16 = view.getScrollY();
        n14 -= n16;
        n16 = rect.width() + n10;
        int n17 = rect.height() + n14;
        n15 = Math.min(0, n10 -= n3);
        n14 -= n4;
        n4 = Math.min(0, n14);
        n16 -= n7;
        n7 = Math.max(0, n16);
        n17 -= n8;
        n17 = Math.max(0, n17);
        n3 = this.getLayoutDirection();
        if (n3 == (n8 = 1)) {
            if (n7 == 0) {
                n7 = Math.max(n15, n16);
            }
        } else {
            if (n15 == 0) {
                n15 = Math.min(n10, n7);
            }
            n7 = n15;
        }
        if (n4 == 0) {
            n4 = Math.min(n14, n17);
        }
        return new int[]{n7, n4};
    }

    public static RecyclerView$o$d getProperties(Context context, AttributeSet attributeSet, int n3, int n4) {
        RecyclerView$o$d recyclerView$o$d = new Object();
        int[] nArray = R$styleable.RecyclerView;
        context = context.obtainStyledAttributes(attributeSet, nArray, n3, n4);
        int n7 = R$styleable.RecyclerView_android_orientation;
        n3 = 1;
        recyclerView$o$d.a = n7 = context.getInt(n7, n3);
        n7 = R$styleable.RecyclerView_spanCount;
        recyclerView$o$d.b = n7 = context.getInt(n7, n3);
        n7 = R$styleable.RecyclerView_reverseLayout;
        n7 = (int)(context.getBoolean(n7, false) ? 1 : 0);
        recyclerView$o$d.c = n7;
        n7 = R$styleable.RecyclerView_stackFromEnd;
        n7 = (int)(context.getBoolean(n7, false) ? 1 : 0);
        recyclerView$o$d.d = n7;
        context.recycle();
        return recyclerView$o$d;
    }

    private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int n3, int n4) {
        if ((recyclerView = recyclerView.getFocusedChild()) == null) {
            return false;
        }
        int n7 = this.getPaddingLeft();
        int n8 = this.getPaddingTop();
        int n10 = this.getWidth();
        int n14 = this.getPaddingRight();
        n10 -= n14;
        n14 = this.getHeight();
        int n15 = this.getPaddingBottom();
        Rect rect = this.mRecyclerView.mTempRect;
        this.getDecoratedBoundsWithMargins((View)recyclerView, rect);
        int n16 = rect.left - n3;
        return n16 < n10 && (n16 = rect.right - n3) > n7 && (n16 = rect.top - n4) < (n14 -= n15) && (n16 = rect.bottom - n4) > n8;
        {
        }
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

    private void scrapOrRecycleView(RecyclerView$u object, int n3, View view) {
        RecyclerView$f recyclerView$f;
        RecyclerView$B recyclerView$B = RecyclerView.getChildViewHolderInt(view);
        boolean bl2 = recyclerView$B.shouldIgnore();
        if (bl2) {
            boolean bl3 = RecyclerView.sVerboseLoggingEnabled;
            if (bl3) {
                recyclerView$B.toString();
            }
            return;
        }
        bl2 = recyclerView$B.isInvalid();
        if (bl2 && !(bl2 = recyclerView$B.isRemoved()) && !(bl2 = (recyclerView$f = this.mRecyclerView.mAdapter).hasStableIds())) {
            this.removeViewAt(n3);
            ((RecyclerView$u)object).k(recyclerView$B);
        } else {
            this.detachViewAt(n3);
            ((RecyclerView$u)object).l(view);
            object = this.mRecyclerView.mViewInfoStore;
            ((B)object).c(recyclerView$B);
        }
    }

    public void addDisappearingView(View view) {
        this.addDisappearingView(view, -1);
    }

    public void addDisappearingView(View view, int n3) {
        this.addViewInt(view, n3, true);
    }

    public void addView(View view) {
        this.addView(view, -1);
    }

    public void addView(View view, int n3) {
        this.addViewInt(view, n3, false);
    }

    public void assertInLayoutOrScroll(String string2) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertInLayoutOrScroll(string2);
        }
    }

    public void assertNotInLayoutOrScroll(String string2) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertNotInLayoutOrScroll(string2);
        }
    }

    public void attachView(View view) {
        this.attachView(view, -1);
    }

    public void attachView(View view, int n3) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        this.attachView(view, n3, recyclerView$LayoutParams);
    }

    public void attachView(View view, int n3, RecyclerView$LayoutParams recyclerView$LayoutParams) {
        Object object;
        RecyclerView$B recyclerView$B = RecyclerView.getChildViewHolderInt(view);
        int n4 = recyclerView$B.isRemoved();
        if (n4 != 0) {
            object = this.mRecyclerView.mViewInfoStore.a;
            B$a b$a = (B$a)((a53)object).get(recyclerView$B);
            if (b$a == null) {
                b$a = B$a.a();
                ((a53)object).put(recyclerView$B, b$a);
            }
            b$a.a = n4 = b$a.a | 1;
        } else {
            object = this.mRecyclerView.mViewInfoStore;
            ((B)object).c(recyclerView$B);
        }
        object = this.mChildHelper;
        boolean bl2 = recyclerView$B.isRemoved();
        ((c_0)object).b(view, n3, (ViewGroup.LayoutParams)recyclerView$LayoutParams, bl2);
    }

    public void calculateItemDecorationsForChild(View view, Rect rect) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
            return;
        }
        view = recyclerView.getItemDecorInsetsForChild(view);
        rect.set((Rect)view);
    }

    public boolean canScrollHorizontally() {
        return false;
    }

    public boolean canScrollVertically() {
        return false;
    }

    public boolean checkLayoutParams(RecyclerView$LayoutParams recyclerView$LayoutParams) {
        boolean bl2;
        if (recyclerView$LayoutParams != null) {
            bl2 = true;
        } else {
            bl2 = false;
            recyclerView$LayoutParams = null;
        }
        return bl2;
    }

    public void collectAdjacentPrefetchPositions(int n3, int n4, RecyclerView$y recyclerView$y, RecyclerView$o$c recyclerView$o$c) {
    }

    public void collectInitialPrefetchPositions(int n3, RecyclerView$o$c recyclerView$o$c) {
    }

    public int computeHorizontalScrollExtent(RecyclerView$y recyclerView$y) {
        return 0;
    }

    public int computeHorizontalScrollOffset(RecyclerView$y recyclerView$y) {
        return 0;
    }

    public int computeHorizontalScrollRange(RecyclerView$y recyclerView$y) {
        return 0;
    }

    public int computeVerticalScrollExtent(RecyclerView$y recyclerView$y) {
        return 0;
    }

    public int computeVerticalScrollOffset(RecyclerView$y recyclerView$y) {
        return 0;
    }

    public int computeVerticalScrollRange(RecyclerView$y recyclerView$y) {
        return 0;
    }

    public void detachAndScrapAttachedViews(RecyclerView$u recyclerView$u) {
        for (int i3 = this.getChildCount() + -1; i3 >= 0; i3 += -1) {
            View view = this.getChildAt(i3);
            this.scrapOrRecycleView(recyclerView$u, i3, view);
        }
    }

    public void detachAndScrapView(View view, RecyclerView$u recyclerView$u) {
        int n3 = this.mChildHelper.j(view);
        this.scrapOrRecycleView(recyclerView$u, n3, view);
    }

    public void detachAndScrapViewAt(int n3, RecyclerView$u recyclerView$u) {
        View view = this.getChildAt(n3);
        this.scrapOrRecycleView(recyclerView$u, n3, view);
    }

    public void detachView(View view) {
        c_0 c_02 = this.mChildHelper;
        int n3 = c_02.j(view);
        if (n3 >= 0) {
            this.detachViewInternal(n3, view);
        }
    }

    public void detachViewAt(int n3) {
        View view = this.getChildAt(n3);
        this.detachViewInternal(n3, view);
    }

    public void dispatchAttachedToWindow(RecyclerView recyclerView) {
        this.mIsAttachedToWindow = true;
        this.onAttachedToWindow(recyclerView);
    }

    public void dispatchDetachedFromWindow(RecyclerView recyclerView, RecyclerView$u recyclerView$u) {
        this.mIsAttachedToWindow = false;
        this.onDetachedFromWindow(recyclerView, recyclerView$u);
    }

    public void endAnimation(View object) {
        RecyclerView$l recyclerView$l = this.mRecyclerView.mItemAnimator;
        if (recyclerView$l != null) {
            object = RecyclerView.getChildViewHolderInt(object);
            recyclerView$l.d((RecyclerView$B)object);
        }
    }

    public View findContainingItemView(View view) {
        Object object = this.mRecyclerView;
        if (object == null) {
            return null;
        }
        if ((view = ((RecyclerView)object).findContainingItemView(view)) == null) {
            return null;
        }
        object = this.mChildHelper;
        boolean bl2 = ((c_0)object).k(view);
        if (bl2) {
            return null;
        }
        return view;
    }

    public View findViewByPosition(int n3) {
        int n4 = this.getChildCount();
        for (int i3 = 0; i3 < n4; ++i3) {
            boolean bl2;
            int n7;
            View view = this.getChildAt(i3);
            RecyclerView$B recyclerView$B = RecyclerView.getChildViewHolderInt(view);
            if (recyclerView$B == null || (n7 = recyclerView$B.getLayoutPosition()) != n3 || (n7 = (int)(recyclerView$B.shouldIgnore() ? 1 : 0)) != 0) continue;
            RecyclerView$y recyclerView$y = this.mRecyclerView.mState;
            n7 = (int)(recyclerView$y.g ? 1 : 0);
            if (n7 == 0 && (bl2 = recyclerView$B.isRemoved())) continue;
            return view;
        }
        return null;
    }

    public abstract RecyclerView$LayoutParams generateDefaultLayoutParams();

    public RecyclerView$LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = new RecyclerView$LayoutParams(context, attributeSet);
        return recyclerView$LayoutParams;
    }

    public RecyclerView$LayoutParams generateLayoutParams(ViewGroup.LayoutParams object) {
        boolean bl2 = object instanceof RecyclerView$LayoutParams;
        if (bl2) {
            object = (RecyclerView$LayoutParams)((Object)object);
            RecyclerView$LayoutParams recyclerView$LayoutParams = new RecyclerView$LayoutParams((RecyclerView$LayoutParams)((Object)object));
            return recyclerView$LayoutParams;
        }
        bl2 = object instanceof ViewGroup.MarginLayoutParams;
        if (bl2) {
            object = (ViewGroup.MarginLayoutParams)object;
            RecyclerView$LayoutParams recyclerView$LayoutParams = new RecyclerView$LayoutParams((ViewGroup.MarginLayoutParams)object);
            return recyclerView$LayoutParams;
        }
        RecyclerView$LayoutParams recyclerView$LayoutParams = new RecyclerView$LayoutParams((ViewGroup.LayoutParams)object);
        return recyclerView$LayoutParams;
    }

    public int getBaseline() {
        return -1;
    }

    public int getBottomDecorationHeight(View view) {
        return ((RecyclerView$LayoutParams)view.getLayoutParams()).mDecorInsets.bottom;
    }

    public View getChildAt(int n3) {
        View view;
        c_0 c_02 = this.mChildHelper;
        if (c_02 != null) {
            view = c_02.d(n3);
        } else {
            n3 = 0;
            view = null;
        }
        return view;
    }

    public int getChildCount() {
        int n3;
        c_0 c_02 = this.mChildHelper;
        if (c_02 != null) {
            n3 = c_02.e();
        } else {
            n3 = 0;
            c_02 = null;
        }
        return n3;
    }

    public boolean getClipToPadding() {
        boolean bl2;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null && (bl2 = recyclerView.mClipToPadding)) {
            bl2 = true;
        } else {
            bl2 = false;
            recyclerView = null;
        }
        return bl2;
    }

    public int getColumnCountForAccessibility(RecyclerView$u object, RecyclerView$y recyclerView$y) {
        boolean bl2;
        object = this.mRecyclerView;
        int n3 = 1;
        if (object != null && (object = ((RecyclerView)object).mAdapter) != null && (bl2 = this.canScrollHorizontally())) {
            object = this.mRecyclerView.mAdapter;
            n3 = ((RecyclerView$f)object).getItemCount();
        }
        return n3;
    }

    public int getDecoratedBottom(View view) {
        int n3 = view.getBottom();
        return this.getBottomDecorationHeight(view) + n3;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public int getDecoratedLeft(View view) {
        int n3 = view.getLeft();
        int n4 = this.getLeftDecorationWidth(view);
        return n3 - n4;
    }

    public int getDecoratedMeasuredHeight(View view) {
        Rect rect = ((RecyclerView$LayoutParams)view.getLayoutParams()).mDecorInsets;
        int n3 = view.getMeasuredHeight();
        int n4 = rect.top;
        int n7 = rect.bottom;
        return (n3 += n4) + n7;
    }

    public int getDecoratedMeasuredWidth(View view) {
        Rect rect = ((RecyclerView$LayoutParams)view.getLayoutParams()).mDecorInsets;
        int n3 = view.getMeasuredWidth();
        int n4 = rect.left;
        int n7 = rect.right;
        return (n3 += n4) + n7;
    }

    public int getDecoratedRight(View view) {
        int n3 = view.getRight();
        return this.getRightDecorationWidth(view) + n3;
    }

    public int getDecoratedTop(View view) {
        int n3 = view.getTop();
        int n4 = this.getTopDecorationHeight(view);
        return n3 - n4;
    }

    public View getFocusedChild() {
        c_0 c_02;
        boolean bl2;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return null;
        }
        if ((recyclerView = recyclerView.getFocusedChild()) != null && !(bl2 = (c_02 = this.mChildHelper).k((View)recyclerView))) {
            return recyclerView;
        }
        return null;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getHeightMode() {
        return this.mHeightMode;
    }

    public int getItemCount() {
        int n3;
        Object object = this.mRecyclerView;
        if (object != null) {
            object = ((RecyclerView)object).getAdapter();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            n3 = ((RecyclerView$f)object).getItemCount();
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public int getItemViewType(View view) {
        return RecyclerView.getChildViewHolderInt(view).getItemViewType();
    }

    public int getLayoutDirection() {
        return this.mRecyclerView.getLayoutDirection();
    }

    public int getLeftDecorationWidth(View view) {
        return ((RecyclerView$LayoutParams)view.getLayoutParams()).mDecorInsets.left;
    }

    public int getMinimumHeight() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView.getMinimumHeight();
    }

    public int getMinimumWidth() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView.getMinimumWidth();
    }

    public int getPaddingBottom() {
        int n3;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            n3 = recyclerView.getPaddingBottom();
        } else {
            n3 = 0;
            recyclerView = null;
        }
        return n3;
    }

    public int getPaddingEnd() {
        int n3;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            n3 = recyclerView.getPaddingEnd();
        } else {
            n3 = 0;
            recyclerView = null;
        }
        return n3;
    }

    public int getPaddingLeft() {
        int n3;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            n3 = recyclerView.getPaddingLeft();
        } else {
            n3 = 0;
            recyclerView = null;
        }
        return n3;
    }

    public int getPaddingRight() {
        int n3;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            n3 = recyclerView.getPaddingRight();
        } else {
            n3 = 0;
            recyclerView = null;
        }
        return n3;
    }

    public int getPaddingStart() {
        int n3;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            n3 = recyclerView.getPaddingStart();
        } else {
            n3 = 0;
            recyclerView = null;
        }
        return n3;
    }

    public int getPaddingTop() {
        int n3;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            n3 = recyclerView.getPaddingTop();
        } else {
            n3 = 0;
            recyclerView = null;
        }
        return n3;
    }

    public int getPosition(View view) {
        return ((RecyclerView$LayoutParams)view.getLayoutParams()).getViewLayoutPosition();
    }

    public int getRightDecorationWidth(View view) {
        return ((RecyclerView$LayoutParams)view.getLayoutParams()).mDecorInsets.right;
    }

    public int getRowCountForAccessibility(RecyclerView$u object, RecyclerView$y recyclerView$y) {
        boolean bl2;
        object = this.mRecyclerView;
        int n3 = 1;
        if (object != null && (object = ((RecyclerView)object).mAdapter) != null && (bl2 = this.canScrollVertically())) {
            object = this.mRecyclerView.mAdapter;
            n3 = ((RecyclerView$f)object).getItemCount();
        }
        return n3;
    }

    public int getSelectionModeForAccessibility(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        return 0;
    }

    public int getTopDecorationHeight(View view) {
        return ((RecyclerView$LayoutParams)view.getLayoutParams()).mDecorInsets.top;
    }

    /*
     * WARNING - void declaration
     */
    public void getTransformedBoundingBox(View view, boolean bl2, Rect rect) {
        float f5;
        void var3_8;
        int n3;
        int n4;
        int n7;
        Object object;
        if (bl2) {
            object = ((RecyclerView$LayoutParams)view.getLayoutParams()).mDecorInsets;
            n7 = -object.left;
            n4 = -object.top;
            n3 = view.getWidth();
            int n8 = object.right;
            n3 += n8;
            n8 = view.getHeight();
            int n10 = object.bottom;
            var3_8.set(n7, n4, n3, n8 += n10);
        } else {
            int n14 = view.getWidth();
            n7 = view.getHeight();
            n4 = 0;
            f5 = 0.0f;
            var3_8.set(0, 0, n14, n7);
        }
        object = this.mRecyclerView;
        if (object != null && (object = view.getMatrix()) != null && (n7 = (int)(object.isIdentity() ? 1 : 0)) == 0) {
            RectF rectF = this.mRecyclerView.mTempRectF;
            rectF.set((Rect)var3_8);
            object.mapRect(rectF);
            float f6 = rectF.left;
            int n15 = (int)Math.floor(f6);
            f5 = rectF.top;
            double d2 = Math.floor(f5);
            n4 = (int)d2;
            float f7 = rectF.right;
            double d5 = Math.ceil(f7);
            n3 = (int)d5;
            float f8 = rectF.bottom;
            double d7 = Math.ceil(f8);
            n7 = (int)d7;
            var3_8.set(n15, n4, n3, n7);
        }
        int n16 = view.getLeft();
        int n17 = view.getTop();
        var3_8.offset(n16, n17);
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getWidthMode() {
        return this.mWidthMode;
    }

    public boolean hasFlexibleChildInBothOrientations() {
        int n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            ViewGroup.LayoutParams layoutParams = this.getChildAt(i3).getLayoutParams();
            int n7 = layoutParams.width;
            if (n7 >= 0 || (n4 = layoutParams.height) >= 0) continue;
            return true;
        }
        return false;
    }

    public boolean hasFocus() {
        boolean bl2;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null && (bl2 = recyclerView.hasFocus())) {
            bl2 = true;
        } else {
            bl2 = false;
            recyclerView = null;
        }
        return bl2;
    }

    public void ignoreView(View object) {
        int n3;
        int n4;
        RecyclerView recyclerView;
        Object object2 = object.getParent();
        if (object2 == (recyclerView = this.mRecyclerView) && (n4 = recyclerView.indexOfChild((View)object)) != (n3 = -1)) {
            object = RecyclerView.getChildViewHolderInt((View)object);
            ((RecyclerView$B)object).addFlags(128);
            this.mRecyclerView.mViewInfoStore.d((RecyclerView$B)object);
            return;
        }
        object2 = new StringBuilder("View should be fully attached to be ignored");
        object2 = lu_0.a(this.mRecyclerView, (StringBuilder)object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public boolean isAutoMeasureEnabled() {
        return this.mAutoMeasure;
    }

    public boolean isFocused() {
        boolean bl2;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null && (bl2 = recyclerView.isFocused())) {
            bl2 = true;
        } else {
            bl2 = false;
            recyclerView = null;
        }
        return bl2;
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public boolean isLayoutHierarchical(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        return false;
    }

    public boolean isLayoutReversed() {
        return false;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public boolean isSmoothScrolling() {
        boolean bl2;
        RecyclerView$x recyclerView$x = this.mSmoothScroller;
        if (recyclerView$x != null && (bl2 = recyclerView$x.isRunning())) {
            bl2 = true;
        } else {
            bl2 = false;
            recyclerView$x = null;
        }
        return bl2;
    }

    public boolean isViewPartiallyVisible(View view, boolean bl2, boolean bl3) {
        boolean bl4;
        A a2 = this.mHorizontalBoundCheck;
        bl3 = a2.b(view);
        boolean bl5 = true;
        if (bl3 && (bl4 = (a2 = this.mVerticalBoundCheck).b(view))) {
            bl4 = true;
        } else {
            bl4 = false;
            view = null;
        }
        if (bl2) {
            return bl4;
        }
        return bl4 ^ bl5;
    }

    public void layoutDecorated(View view, int n3, int n4, int n7, int n8) {
        Rect rect = ((RecyclerView$LayoutParams)view.getLayoutParams()).mDecorInsets;
        int n10 = rect.left;
        n3 += n10;
        n10 = rect.top;
        n4 += n10;
        n10 = rect.right;
        int n14 = rect.bottom;
        view.layout(n3, n4, n7 -= n10, n8 -= n14);
    }

    public void layoutDecoratedWithMargins(View view, int n3, int n4, int n7, int n8) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        Rect rect = recyclerView$LayoutParams.mDecorInsets;
        int n10 = rect.left;
        n3 += n10;
        n10 = recyclerView$LayoutParams.leftMargin;
        n3 += n10;
        n10 = rect.top;
        n4 += n10;
        n10 = recyclerView$LayoutParams.topMargin;
        n4 += n10;
        n10 = rect.right;
        n7 -= n10;
        n10 = recyclerView$LayoutParams.rightMargin;
        int n14 = rect.bottom;
        n8 -= n14;
        int n15 = recyclerView$LayoutParams.bottomMargin;
        view.layout(n3, n4, n7 -= n10, n8 -= n15);
    }

    public void measureChild(View view, int n3, int n4) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        Rect rect = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int n7 = rect.left;
        int n8 = rect.right;
        n7 = n7 + n8 + n3;
        n3 = rect.top;
        int n10 = rect.bottom;
        n3 = n3 + n10 + n4;
        n4 = this.getWidth();
        n10 = this.getWidthMode();
        n8 = this.getPaddingLeft();
        int n14 = this.getPaddingRight() + n8 + n7;
        n7 = recyclerView$LayoutParams.width;
        n8 = (int)(this.canScrollHorizontally() ? 1 : 0);
        n4 = RecyclerView$o.getChildMeasureSpec(n4, n10, n14, n7, n8 != 0);
        n10 = this.getHeight();
        n7 = this.getHeightMode();
        n8 = this.getPaddingTop();
        n14 = this.getPaddingBottom() + n8 + n3;
        n3 = recyclerView$LayoutParams.height;
        n8 = (int)(this.canScrollVertically() ? 1 : 0);
        boolean bl2 = this.shouldMeasureChild(view, n4, n3 = RecyclerView$o.getChildMeasureSpec(n10, n7, n14, n3, n8 != 0), recyclerView$LayoutParams);
        if (bl2) {
            view.measure(n4, n3);
        }
    }

    public void measureChildWithMargins(View view, int n3, int n4) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        Rect rect = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int n7 = rect.left;
        int n8 = rect.right;
        n7 = n7 + n8 + n3;
        n3 = rect.top;
        int n10 = rect.bottom;
        n3 = n3 + n10 + n4;
        n4 = this.getWidth();
        n10 = this.getWidthMode();
        n8 = this.getPaddingLeft();
        int n14 = this.getPaddingRight() + n8;
        n8 = recyclerView$LayoutParams.leftMargin;
        n14 += n8;
        n8 = recyclerView$LayoutParams.rightMargin;
        n14 = n14 + n8 + n7;
        n7 = recyclerView$LayoutParams.width;
        n8 = (int)(this.canScrollHorizontally() ? 1 : 0);
        n4 = RecyclerView$o.getChildMeasureSpec(n4, n10, n14, n7, n8 != 0);
        n10 = this.getHeight();
        n7 = this.getHeightMode();
        n8 = this.getPaddingTop();
        n14 = this.getPaddingBottom() + n8;
        n8 = recyclerView$LayoutParams.topMargin;
        n14 += n8;
        n8 = recyclerView$LayoutParams.bottomMargin;
        n14 = n14 + n8 + n3;
        n3 = recyclerView$LayoutParams.height;
        n8 = (int)(this.canScrollVertically() ? 1 : 0);
        boolean bl2 = this.shouldMeasureChild(view, n4, n3 = RecyclerView$o.getChildMeasureSpec(n10, n7, n14, n3, n8 != 0), recyclerView$LayoutParams);
        if (bl2) {
            view.measure(n4, n3);
        }
    }

    public void moveView(int n3, int n4) {
        Object object = this.getChildAt(n3);
        if (object != null) {
            this.detachViewAt(n3);
            this.attachView((View)object, n4);
            return;
        }
        object = new StringBuilder("Cannot move a child from non-existing index:");
        ((StringBuilder)object).append(n3);
        String string2 = this.mRecyclerView.toString();
        ((StringBuilder)object).append(string2);
        string2 = ((StringBuilder)object).toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public void offsetChildrenHorizontal(int n3) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(n3);
        }
    }

    public void offsetChildrenVertical(int n3) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(n3);
        }
    }

    public void onAdapterChanged(RecyclerView$f recyclerView$f, RecyclerView$f recyclerView$f2) {
    }

    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList arrayList, int n3, int n4) {
        return false;
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    public void onDetachedFromWindow(RecyclerView recyclerView) {
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView$u recyclerView$u) {
        this.onDetachedFromWindow(recyclerView);
    }

    public View onFocusSearchFailed(View view, int n3, RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Object object = this.mRecyclerView;
        RecyclerView$u recyclerView$u = ((RecyclerView)object).mRecycler;
        object = ((RecyclerView)object).mState;
        this.onInitializeAccessibilityEvent(recyclerView$u, (RecyclerView$y)object, accessibilityEvent);
    }

    public void onInitializeAccessibilityEvent(RecyclerView$u object, RecyclerView$y recyclerView$y, AccessibilityEvent accessibilityEvent) {
        object = this.mRecyclerView;
        if (object != null && accessibilityEvent != null) {
            int n3;
            int n4 = 1;
            int n7 = object.canScrollVertically(n4);
            if (n7 == 0 && (n7 = (object = this.mRecyclerView).canScrollVertically(n3 = -1)) == 0 && (n7 = (int)((object = this.mRecyclerView).canScrollHorizontally(n3) ? 1 : 0)) == 0 && (n7 = (int)((object = this.mRecyclerView).canScrollHorizontally(n4) ? 1 : 0)) == 0) {
                n4 = 0;
            }
            accessibilityEvent.setScrollable(n4 != 0);
            object = this.mRecyclerView.mAdapter;
            if (object != null) {
                n7 = ((RecyclerView$f)object).getItemCount();
                accessibilityEvent.setItemCount(n7);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(C2 c2) {
        Object object = this.mRecyclerView;
        RecyclerView$u recyclerView$u = ((RecyclerView)object).mRecycler;
        object = ((RecyclerView)object).mState;
        this.onInitializeAccessibilityNodeInfo(recyclerView$u, (RecyclerView$y)object, c2);
    }

    public void onInitializeAccessibilityNodeInfo(RecyclerView$u object, RecyclerView$y recyclerView$y, C2 c2) {
        RecyclerView recyclerView = this.mRecyclerView;
        int n3 = -1;
        int n4 = recyclerView.canScrollVertically(n3);
        int bl2 = 0x4000000;
        boolean bl3 = true;
        if (n4 != 0 || (n4 = (int)((recyclerView = this.mRecyclerView).canScrollHorizontally(n3) ? 1 : 0)) != 0) {
            n4 = 8192;
            c2.a(n4);
            c2.r(bl3);
            c2.j(bl2, bl3);
        }
        if ((n4 = (int)((recyclerView = this.mRecyclerView).canScrollVertically((int)(bl3 ? 1 : 0)) ? 1 : 0)) != 0 || (n4 = (int)((recyclerView = this.mRecyclerView).canScrollHorizontally((int)(bl3 ? 1 : 0)) ? 1 : 0)) != 0) {
            n4 = 4096;
            c2.a(n4);
            c2.r(bl3);
            c2.j(bl2, bl3);
        }
        n4 = this.getRowCountForAccessibility((RecyclerView$u)object, recyclerView$y);
        n3 = this.getColumnCountForAccessibility((RecyclerView$u)object, recyclerView$y);
        boolean bl4 = this.isLayoutHierarchical((RecyclerView$u)object, recyclerView$y);
        int n7 = this.getSelectionModeForAccessibility((RecyclerView$u)object, recyclerView$y);
        object = C2$e.a(n4, n3, n7, bl4);
        c2.m((C2$e)object);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, C2 c2) {
        Object object;
        boolean bl2;
        boolean bl3;
        Object object2 = RecyclerView.getChildViewHolderInt(view);
        if (object2 != null && !(bl3 = ((RecyclerView$B)object2).isRemoved()) && !(bl2 = ((c_0)(object = this.mChildHelper)).k((View)(object2 = ((RecyclerView$B)object2).itemView)))) {
            object2 = this.mRecyclerView;
            object = ((RecyclerView)object2).mRecycler;
            object2 = ((RecyclerView)object2).mState;
            this.onInitializeAccessibilityNodeInfoForItem((RecyclerView$u)object, (RecyclerView$y)object2, view, c2);
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView$u object, RecyclerView$y recyclerView$y, View view, C2 c2) {
        int n3 = this.canScrollVertically();
        int n4 = 0;
        int n7 = n3 != 0 ? (n3 = this.getPosition(view)) : 0;
        n3 = (int)(this.canScrollHorizontally() ? 1 : 0);
        int n8 = n3 != 0 ? (n4 = this.getPosition(view)) : 0;
        object = C2$f.a(n7, 1, n8, 1, false, false);
        c2.n((C2$f)object);
    }

    public View onInterceptFocusSearch(View view, int n3) {
        return null;
    }

    public void onItemsAdded(RecyclerView recyclerView, int n3, int n4) {
    }

    public void onItemsChanged(RecyclerView recyclerView) {
    }

    public void onItemsMoved(RecyclerView recyclerView, int n3, int n4, int n7) {
    }

    public void onItemsRemoved(RecyclerView recyclerView, int n3, int n4) {
    }

    public void onItemsUpdated(RecyclerView recyclerView, int n3, int n4) {
    }

    public void onItemsUpdated(RecyclerView recyclerView, int n3, int n4, Object object) {
        this.onItemsUpdated(recyclerView, n3, n4);
    }

    public void onLayoutChildren(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
    }

    public void onLayoutCompleted(RecyclerView$y recyclerView$y) {
    }

    public void onMeasure(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y, int n3, int n4) {
        this.mRecyclerView.defaultOnMeasure(n3, n4);
    }

    public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
        boolean bl2;
        boolean bl3 = this.isSmoothScrolling();
        if (!bl3 && !(bl2 = recyclerView.isComputingLayout())) {
            bl2 = false;
            recyclerView = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public boolean onRequestChildFocus(RecyclerView recyclerView, RecyclerView$y recyclerView$y, View view, View view2) {
        return this.onRequestChildFocus(recyclerView, view, view2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onScrollStateChanged(int n3) {
    }

    public void onSmoothScrollerStopped(RecyclerView$x recyclerView$x) {
        RecyclerView$x recyclerView$x2 = this.mSmoothScroller;
        if (recyclerView$x2 == recyclerView$x) {
            recyclerView$x = null;
            this.mSmoothScroller = null;
        }
    }

    public boolean performAccessibilityAction(int n3, Bundle bundle) {
        Object object = this.mRecyclerView;
        RecyclerView$u recyclerView$u = ((RecyclerView)object).mRecycler;
        object = ((RecyclerView)object).mState;
        return this.performAccessibilityAction(recyclerView$u, (RecyclerView$y)object, n3, bundle);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean performAccessibilityAction(RecyclerView$u var1_1, RecyclerView$y var2_2, int var3_3, Bundle var4_4) {
        block19: {
            block20: {
                var1_1 = this.mRecyclerView;
                var5_5 = 0;
                var6_6 = 0.0f;
                var2_2 = null;
                if (var1_1 == null) {
                    return false;
                }
                var7_7 = this.getHeight();
                var8_8 = this.getWidth();
                var9_9 = new Rect();
                var10_10 /* !! */  = this.mRecyclerView.getMatrix();
                var11_11 = var10_10 /* !! */ .isIdentity();
                if (var11_11 != 0 && (var11_11 = (int)(var10_10 /* !! */  = this.mRecyclerView).getGlobalVisibleRect(var9_9)) != 0) {
                    var7_7 = var9_9.height();
                    var8_8 = var9_9.width();
                }
                var12_12 = 8192;
                var11_11 = 4096;
                var13_13 = 1;
                if (var3_3 == var11_11) break block20;
                if (var3_3 != var12_12) {
                    var7_7 = 0;
                    var14_14 = 0.0f;
                    var1_1 = null;
lbl23:
                    // 3 sources

                    while (true) {
                        var8_8 = 0;
                        break block19;
                        break;
                    }
                }
                var15_15 = this.mRecyclerView;
                var16_16 = -1;
                var17_17 = 0.0f / 0.0f;
                var18_18 = (int)var15_15.canScrollVertically(var16_16);
                if (var18_18 != 0) {
                    var18_18 = this.getPaddingTop();
                    var7_7 -= var18_18;
                    var18_18 = this.getPaddingBottom();
                    var7_7 = -(var7_7 - var18_18);
                } else {
                    var7_7 = 0;
                    var14_14 = 0.0f;
                    var1_1 = null;
                }
                if ((var18_18 = (int)(var15_15 = this.mRecyclerView).canScrollHorizontally(var16_16)) == 0) ** GOTO lbl23
                var18_18 = this.getPaddingLeft();
                var8_8 -= var18_18;
                var18_18 = this.getPaddingRight();
                var8_8 = -(var8_8 - var18_18);
                break block19;
            }
            var15_15 = this.mRecyclerView;
            var18_18 = var15_15.canScrollVertically(var13_13);
            if (var18_18 != 0) {
                var18_18 = this.getPaddingTop();
                var7_7 -= var18_18;
                var18_18 = this.getPaddingBottom();
                var7_7 -= var18_18;
            } else {
                var7_7 = 0;
                var14_14 = 0.0f;
                var1_1 = null;
            }
            if ((var18_18 = (int)(var15_15 = this.mRecyclerView).canScrollHorizontally(var13_13)) != 0) ** break;
            ** while (true)
            var18_18 = this.getPaddingLeft();
            var8_8 -= var18_18;
            var18_18 = this.getPaddingRight();
            var8_8 -= var18_18;
        }
        if (var7_7 == 0 && var8_8 == 0) {
            return false;
        }
        var18_18 = 0;
        var15_15 = null;
        var16_16 = 1065353216;
        var17_17 = 1.0f;
        if (var4_4 != null) {
            var19_19 = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT";
            var20_20 = var4_4.getFloat(var19_19, var17_17);
            cfr_temp_0 = var20_20 - 0.0f;
            var21_21 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
            if (var21_21 < 0) {
                var7_7 = (int)RecyclerView.sDebugAssertionsEnabled;
                if (var7_7 == 0) {
                    return false;
                }
                var2_2 = g9_0.a(var20_20, "attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (", ")");
                var1_1 = new IllegalArgumentException((String)var2_2);
                throw var1_1;
            }
        } else {
            var20_20 = 1.0f;
        }
        if ((var21_21 = Float.compare(var20_20, var22_22 = 1.0f / 0.0f)) == 0) {
            var1_1 = this.mRecyclerView;
            var4_4 = var1_1.mAdapter;
            if (var4_4 == null) {
                return false;
            }
            if (var3_3 != var11_11) {
                if (var3_3 == var12_12) {
                    var1_1.smoothScrollToPosition(0);
                }
            } else {
                var5_5 = var4_4.getItemCount() - var13_13;
                var1_1.smoothScrollToPosition(var5_5);
            }
            return (boolean)var13_13;
        }
        var5_5 = Float.compare(var17_17, var20_20);
        if (var5_5 != 0 && (var5_5 = Float.compare(0.0f, var20_20)) != 0) {
            var6_6 = (float)var8_8 * var20_20;
            var8_8 = (int)var6_6;
            var14_14 = (float)var7_7 * var20_20;
            var7_7 = (int)var14_14;
        }
        var21_21 = var7_7;
        var16_16 = var8_8;
        this.mRecyclerView.smoothScrollBy(var8_8, var7_7, null, -1 << -1, true);
        return (boolean)var13_13;
    }

    public boolean performAccessibilityActionForItem(View view, int n3, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        RecyclerView$u recyclerView$u = recyclerView.mRecycler;
        RecyclerView$y recyclerView$y = recyclerView.mState;
        return this.performAccessibilityActionForItem(recyclerView$u, recyclerView$y, view, n3, bundle);
    }

    public boolean performAccessibilityActionForItem(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y, View view, int n3, Bundle bundle) {
        return false;
    }

    public void postOnAnimation(Runnable runnable2) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.postOnAnimation(runnable2);
        }
    }

    public void removeAllViews() {
        for (int i3 = this.getChildCount() + -1; i3 >= 0; i3 += -1) {
            c_0 c_02 = this.mChildHelper;
            c_02.l(i3);
        }
    }

    public void removeAndRecycleAllViews(RecyclerView$u recyclerView$u) {
        for (int i3 = this.getChildCount() + -1; i3 >= 0; i3 += -1) {
            RecyclerView$B recyclerView$B = RecyclerView.getChildViewHolderInt(this.getChildAt(i3));
            boolean bl2 = recyclerView$B.shouldIgnore();
            if (bl2) continue;
            this.removeAndRecycleViewAt(i3, recyclerView$u);
        }
    }

    public void removeAndRecycleScrapInt(RecyclerView$u object) {
        Object object2;
        ArrayList arrayList = ((RecyclerView$u)object).a;
        int n3 = arrayList.size();
        int n4 = n3 + -1;
        while (true) {
            object2 = ((RecyclerView$u)object).a;
            if (n4 < 0) break;
            object2 = ((RecyclerView$B)((ArrayList)object2).get((int)n4)).itemView;
            RecyclerView$B recyclerView$B = RecyclerView.getChildViewHolderInt((View)object2);
            boolean bl2 = recyclerView$B.shouldIgnore();
            if (!bl2) {
                Object object3;
                bl2 = false;
                recyclerView$B.setIsRecyclable(false);
                boolean bl3 = recyclerView$B.isTmpDetached();
                if (bl3) {
                    object3 = this.mRecyclerView;
                    ((RecyclerView)object3).removeDetachedView((View)object2, false);
                }
                if ((object3 = this.mRecyclerView.mItemAnimator) != null) {
                    ((RecyclerView$l)object3).d(recyclerView$B);
                }
                bl3 = true;
                recyclerView$B.setIsRecyclable(bl3);
                object2 = RecyclerView.getChildViewHolderInt((View)object2);
                recyclerView$B = null;
                ((RecyclerView$B)object2).mScrapContainer = null;
                ((RecyclerView$B)object2).mInChangeScrap = false;
                ((RecyclerView$B)object2).clearReturnedFromScrapFlag();
                ((RecyclerView$u)object).k((RecyclerView$B)object2);
            }
            n4 += -1;
        }
        ((ArrayList)object2).clear();
        object = ((RecyclerView$u)object).b;
        if (object != null) {
            ((ArrayList)object).clear();
        }
        if (n3 > 0) {
            object = this.mRecyclerView;
            object.invalidate();
        }
    }

    public void removeAndRecycleView(View view, RecyclerView$u recyclerView$u) {
        this.removeView(view);
        recyclerView$u.j(view);
    }

    public void removeAndRecycleViewAt(int n3, RecyclerView$u recyclerView$u) {
        View view = this.getChildAt(n3);
        this.removeViewAt(n3);
        recyclerView$u.j(view);
    }

    public boolean removeCallbacks(Runnable runnable2) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.removeCallbacks(runnable2);
        }
        return false;
    }

    public void removeDetachedView(View view) {
        this.mRecyclerView.removeDetachedView(view, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void removeView(View object) {
        Throwable throwable2;
        block8: {
            block7: {
                int n3;
                c$b c$b;
                c_0 c_02;
                block6: {
                    c_02 = this.mChildHelper;
                    c$b = c_02.a;
                    int n4 = c_02.d;
                    n3 = 1;
                    if (n4 == n3) {
                        object = new IllegalStateException("Cannot call removeView(At) within removeView(At)");
                        throw object;
                    }
                    int n7 = 2;
                    if (n4 == n7) {
                        object = new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
                        throw object;
                    }
                    n4 = 0;
                    n7 = 0;
                    try {
                        c_02.d = n3;
                        c_02.e = object;
                        Object object2 = c$b;
                        object2 = (RecyclerView$d)c$b;
                        object2 = ((RecyclerView$d)object2).a;
                        n3 = object2.indexOfChild(object);
                        if (n3 >= 0) break block6;
                        break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                c$a c$a = c_02.b;
                boolean bl2 = c$a.f(n3);
                if (bl2) {
                    c_02.m((View)object);
                }
                c$b = (RecyclerView$d)c$b;
                ((RecyclerView$d)c$b).a(n3);
            }
            c_02.d = 0;
            c_02.e = null;
            return;
        }
        c_02.d = 0;
        c_02.e = null;
        throw throwable2;
    }

    public void removeViewAt(int n3) {
        Object object = this.getChildAt(n3);
        if (object != null) {
            object = this.mChildHelper;
            ((c_0)object).l(n3);
        }
    }

    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean bl2) {
        return this.requestChildRectangleOnScreen(recyclerView, view, rect, bl2, false);
    }

    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View object, Rect rect, boolean bl2, boolean bl3) {
        object = this.getChildRectangleOnScreenScrollAmount((View)object, rect);
        rect = null;
        View view = object[0];
        boolean bl4 = true;
        View view2 = object[bl4];
        if (bl3 && !(bl3 = this.isFocusedChildVisibleAfterScrolling(recyclerView, (int)view, (int)view2)) || view == false && view2 == false) {
            return false;
        }
        if (bl2) {
            recyclerView.scrollBy((int)view, (int)view2);
        } else {
            recyclerView.smoothScrollBy((int)view, (int)view2);
        }
        return bl4;
    }

    public void requestLayout() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }

    public int scrollHorizontallyBy(int n3, RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        return 0;
    }

    public void scrollToPosition(int n3) {
    }

    public int scrollVerticallyBy(int n3, RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        return 0;
    }

    public void setAutoMeasureEnabled(boolean bl2) {
        this.mAutoMeasure = bl2;
    }

    public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
        int n3 = recyclerView.getWidth();
        int n4 = 0x40000000;
        n3 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)n4);
        int n7 = View.MeasureSpec.makeMeasureSpec((int)recyclerView.getHeight(), (int)n4);
        this.setMeasureSpecs(n3, n7);
    }

    public final void setItemPrefetchEnabled(boolean bl2) {
        boolean bl3 = this.mItemPrefetchEnabled;
        if (bl2 != bl3) {
            this.mItemPrefetchEnabled = bl2;
            bl2 = false;
            this.mPrefetchMaxCountObserved = 0;
            Object object = this.mRecyclerView;
            if (object != null) {
                object = ((RecyclerView)object).mRecycler;
                ((RecyclerView$u)object).o();
            }
        }
    }

    public void setMeasureSpecs(int n3, int n4) {
        int n7;
        this.mWidth = n7 = View.MeasureSpec.getSize((int)n3);
        this.mWidthMode = n3 = View.MeasureSpec.getMode((int)n3);
        n7 = 0;
        if (n3 == 0 && (n3 = (int)(RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC ? 1 : 0)) == 0) {
            this.mWidth = 0;
        }
        this.mHeight = n3 = View.MeasureSpec.getSize((int)n4);
        this.mHeightMode = n3 = View.MeasureSpec.getMode((int)n4);
        if (n3 == 0 && (n3 = (int)(RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC ? 1 : 0)) == 0) {
            this.mHeight = 0;
        }
    }

    public void setMeasuredDimension(int n3, int n4) {
        RecyclerView.access$500(this.mRecyclerView, n3, n4);
    }

    public void setMeasuredDimension(Rect rect, int n3, int n4) {
        int n7 = rect.width();
        int n8 = this.getPaddingLeft() + n7;
        n7 = this.getPaddingRight() + n8;
        int n10 = rect.height();
        n8 = this.getPaddingTop() + n10;
        n10 = this.getPaddingBottom() + n8;
        n8 = this.getMinimumWidth();
        n3 = RecyclerView$o.chooseSize(n3, n7, n8);
        n7 = this.getMinimumHeight();
        n10 = RecyclerView$o.chooseSize(n4, n10, n7);
        this.setMeasuredDimension(n3, n10);
    }

    public void setMeasuredDimensionFromChildren(int n3, int n4) {
        int n7 = this.getChildCount();
        if (n7 == 0) {
            this.mRecyclerView.defaultOnMeasure(n3, n4);
            return;
        }
        int n8 = -1 << -1;
        int n10 = -1 << -1;
        int n14 = -1 >>> 1;
        int n15 = -1 >>> 1;
        for (int i3 = 0; i3 < n7; ++i3) {
            View view = this.getChildAt(i3);
            Rect rect = this.mRecyclerView.mTempRect;
            this.getDecoratedBoundsWithMargins(view, rect);
            int n16 = rect.left;
            if (n16 < n14) {
                n14 = n16;
            }
            if ((n16 = rect.right) > n8) {
                n8 = n16;
            }
            if ((n16 = rect.top) < n15) {
                n15 = n16;
            }
            if ((n16 = rect.bottom) <= n10) continue;
            n10 = n16;
        }
        this.mRecyclerView.mTempRect.set(n14, n15, n8, n10);
        Rect rect = this.mRecyclerView.mTempRect;
        this.setMeasuredDimension(rect, n3, n4);
    }

    public void setMeasurementCacheEnabled(boolean bl2) {
        this.mMeasurementCacheEnabled = bl2;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        int n3;
        if (recyclerView == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            n3 = 0;
            recyclerView = null;
            this.mWidth = 0;
            this.mHeight = 0;
        } else {
            int n4;
            c_0 c_02;
            this.mRecyclerView = recyclerView;
            this.mChildHelper = c_02 = recyclerView.mChildHelper;
            this.mWidth = n4 = recyclerView.getWidth();
            this.mHeight = n3 = recyclerView.getHeight();
        }
        this.mWidthMode = n3 = 0x40000000;
        this.mHeightMode = n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean shouldMeasureChild(View view, int n3, int n4, RecyclerView$LayoutParams recyclerView$LayoutParams) {
        int n7;
        int n8 = view.isLayoutRequested();
        if (n8 != 0) return 1 != 0;
        n8 = this.mMeasurementCacheEnabled;
        if (n8 == 0) return 1 != 0;
        n8 = view.getWidth();
        n3 = (int)(RecyclerView$o.isMeasurementUpToDate(n8, n3, n7 = recyclerView$LayoutParams.width) ? 1 : 0);
        if (n3 == 0) return 1 != 0;
        int n10 = view.getHeight();
        n3 = recyclerView$LayoutParams.height;
        if ((n10 = (int)(RecyclerView$o.isMeasurementUpToDate(n10, n4, n3) ? 1 : 0)) != 0) return 0 != 0;
        return 1 != 0;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean shouldReMeasureChild(View view, int n3, int n4, RecyclerView$LayoutParams recyclerView$LayoutParams) {
        int n7;
        int n8 = this.mMeasurementCacheEnabled;
        if (n8 == 0) return 1 != 0;
        n8 = view.getMeasuredWidth();
        n3 = (int)(RecyclerView$o.isMeasurementUpToDate(n8, n3, n7 = recyclerView$LayoutParams.width) ? 1 : 0);
        if (n3 == 0) return 1 != 0;
        int n10 = view.getMeasuredHeight();
        n3 = recyclerView$LayoutParams.height;
        if ((n10 = (int)(RecyclerView$o.isMeasurementUpToDate(n10, n4, n3) ? 1 : 0)) != 0) return 0 != 0;
        return 1 != 0;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView$y recyclerView$y, int n3) {
    }

    public void startSmoothScroll(RecyclerView$x recyclerView$x) {
        boolean bl2;
        Object object = this.mSmoothScroller;
        if (object != null && recyclerView$x != object && (bl2 = ((RecyclerView$x)object).isRunning())) {
            object = this.mSmoothScroller;
            ((RecyclerView$x)object).stop();
        }
        this.mSmoothScroller = recyclerView$x;
        object = this.mRecyclerView;
        recyclerView$x.start((RecyclerView)object, this);
    }

    public void stopIgnoringView(View object) {
        object = RecyclerView.getChildViewHolderInt((View)object);
        ((RecyclerView$B)object).stopIgnoring();
        ((RecyclerView$B)object).resetInternal();
        ((RecyclerView$B)object).addFlags(4);
    }

    public void stopSmoothScroller() {
        RecyclerView$x recyclerView$x = this.mSmoothScroller;
        if (recyclerView$x != null) {
            recyclerView$x.stop();
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
}

