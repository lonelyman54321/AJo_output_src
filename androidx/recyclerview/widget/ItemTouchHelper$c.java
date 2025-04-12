/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.view.View
 *  android.view.animation.Interpolator
 */
package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.recyclerview.R$dimen;
import androidx.recyclerview.R$id;
import androidx.recyclerview.widget.ItemTouchHelper$e;
import androidx.recyclerview.widget.ItemTouchHelper$f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$o;
import java.util.List;

public abstract class ItemTouchHelper$c {
    private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
    public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
    public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
    private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000L;
    static final int RELATIVE_DIR_FLAGS = 0x303030;
    private static final Interpolator sDragScrollInterpolator;
    private static final Interpolator sDragViewScrollCapInterpolator;
    private int mCachedMaxScrollSpeed = -1;

    static {
        Object object = new Object();
        sDragScrollInterpolator = object;
        object = new Object();
        sDragViewScrollCapInterpolator = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int convertToRelativeDirection(int n3, int n4) {
        int n7 = 789516;
        int n8 = n3 & n7;
        if (n8 == 0) {
            return n3;
        }
        int n10 = ~n8;
        n3 &= n10;
        if (n4 == 0) {
            n4 = n8 << 2;
            return n3 | n4;
        }
        n4 = n8 << 1;
        n8 = 0xFFF3F3F3 & n4;
        n3 |= n8;
        n4 = (n4 & n7) << 2;
        return n3 | n4;
    }

    public static xk1 getDefaultUIUtil() {
        return yk1_0.a;
    }

    private int getMaxDragScroll(RecyclerView recyclerView) {
        int n3 = this.mCachedMaxScrollSpeed;
        int n4 = -1;
        if (n3 == n4) {
            int n7;
            recyclerView = recyclerView.getResources();
            n3 = R$dimen.item_touch_helper_max_drag_scroll_per_frame;
            this.mCachedMaxScrollSpeed = n7 = recyclerView.getDimensionPixelSize(n3);
        }
        return this.mCachedMaxScrollSpeed;
    }

    public static int makeFlag(int n3, int n4) {
        return n4 << (n3 *= 8);
    }

    public static int makeMovementFlags(int n3, int n4) {
        int n7 = n4 | n3;
        int n8 = ItemTouchHelper$c.makeFlag(0, n7);
        n4 = ItemTouchHelper$c.makeFlag(1, n4) | n8;
        return ItemTouchHelper$c.makeFlag(2, n3) | n4;
    }

    public boolean canDropOver(RecyclerView recyclerView, RecyclerView$B recyclerView$B, RecyclerView$B recyclerView$B2) {
        return true;
    }

    public RecyclerView$B chooseDropTarget(RecyclerView$B recyclerView$B, List list, int n3, int n4) {
        RecyclerView$B recyclerView$B2 = recyclerView$B;
        View view = recyclerView$B.itemView;
        int n7 = view.getWidth() + n3;
        View view2 = recyclerView$B.itemView;
        int n8 = view2.getHeight() + n4;
        View view3 = recyclerView$B.itemView;
        int n10 = view3.getLeft();
        n10 = n3 - n10;
        View view4 = recyclerView$B.itemView;
        int n14 = view4.getTop();
        n14 = n4 - n14;
        int n15 = list.size();
        RecyclerView$B recyclerView$B3 = null;
        int n16 = -1;
        for (int i3 = 0; i3 < n15; ++i3) {
            View view5;
            int n17;
            View view6;
            int n18;
            View view7;
            int n19;
            RecyclerView$B recyclerView$B4 = (RecyclerView$B)list.get(i3);
            if (n10 > 0 && (n19 = (view7 = recyclerView$B4.itemView).getRight() - n7) < 0 && (n18 = (view6 = recyclerView$B4.itemView).getRight()) > (n17 = (view5 = recyclerView$B2.itemView).getRight()) && (n19 = Math.abs(n19)) > n16) {
                recyclerView$B3 = recyclerView$B4;
                n16 = n19;
            }
            if (n10 < 0 && (n19 = (view7 = recyclerView$B4.itemView).getLeft() - n3) > 0 && (n18 = (view6 = recyclerView$B4.itemView).getLeft()) < (n17 = (view5 = recyclerView$B2.itemView).getLeft()) && (n19 = Math.abs(n19)) > n16) {
                recyclerView$B3 = recyclerView$B4;
                n16 = n19;
            }
            if (n14 < 0 && (n19 = (view7 = recyclerView$B4.itemView).getTop() - n4) > 0 && (n18 = (view6 = recyclerView$B4.itemView).getTop()) < (n17 = (view5 = recyclerView$B2.itemView).getTop()) && (n19 = Math.abs(n19)) > n16) {
                recyclerView$B3 = recyclerView$B4;
                n16 = n19;
            }
            if (n14 <= 0 || (n19 = (view7 = recyclerView$B4.itemView).getBottom() - n8) >= 0 || (n18 = (view6 = recyclerView$B4.itemView).getBottom()) <= (n17 = (view5 = recyclerView$B2.itemView).getBottom()) || (n19 = Math.abs(n19)) <= n16) continue;
            recyclerView$B3 = recyclerView$B4;
            n16 = n19;
        }
        return recyclerView$B3;
    }

    public void clearView(RecyclerView recyclerView, RecyclerView$B object) {
        recyclerView = ((RecyclerView$B)object).itemView;
        int n3 = R$id.item_touch_helper_previous_elevation;
        object = recyclerView.getTag(n3);
        boolean bl2 = object instanceof Float;
        if (bl2) {
            object = (Float)object;
            float f5 = ((Float)object).floatValue();
            ViewCompat$c.m((View)recyclerView, f5);
        }
        n3 = R$id.item_touch_helper_previous_elevation;
        recyclerView.setTag(n3, null);
        recyclerView.setTranslationX(0.0f);
        recyclerView.setTranslationY(0.0f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int convertToAbsoluteDirection(int n3, int n4) {
        int n7 = 0x303030;
        int n8 = n3 & n7;
        if (n8 == 0) {
            return n3;
        }
        int n10 = ~n8;
        n3 &= n10;
        if (n4 == 0) {
            n4 = n8 >> 2;
            return n3 | n4;
        }
        n4 = n8 >> 1;
        n8 = 0xFFCFCFCF & n4;
        n3 |= n8;
        n4 = (n4 & n7) >> 2;
        return n3 | n4;
    }

    public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView$B recyclerView$B) {
        int n3 = this.getMovementFlags(recyclerView, recyclerView$B);
        int n4 = recyclerView.getLayoutDirection();
        return this.convertToAbsoluteDirection(n3, n4);
    }

    public long getAnimationDuration(RecyclerView object, int n3, float f5, float f6) {
        object = ((RecyclerView)object).getItemAnimator();
        int n4 = 8;
        if (object == null) {
            long l2 = n3 == n4 ? 200L : 250L;
            return l2;
        }
        long l3 = n3 == n4 ? ((RecyclerView$l)object).e : ((RecyclerView$l)object).d;
        return l3;
    }

    public int getBoundingBoxMargin() {
        return 0;
    }

    public float getMoveThreshold(RecyclerView$B recyclerView$B) {
        return 0.5f;
    }

    public abstract int getMovementFlags(RecyclerView var1, RecyclerView$B var2);

    public float getSwipeEscapeVelocity(float f5) {
        return f5;
    }

    public float getSwipeThreshold(RecyclerView$B recyclerView$B) {
        return 0.5f;
    }

    public float getSwipeVelocityThreshold(float f5) {
        return f5;
    }

    /*
     * WARNING - void declaration
     */
    public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView$B recyclerView$B) {
        void var3_7;
        int n3;
        int n4 = this.getAbsoluteMovementFlags(recyclerView, recyclerView$B);
        n4 = n4 & (n3 = 0xFF0000);
        if (n4 != 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            recyclerView = null;
        }
        return (boolean)var3_7;
    }

    /*
     * WARNING - void declaration
     */
    public boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView$B recyclerView$B) {
        void var3_7;
        int n3;
        int n4 = this.getAbsoluteMovementFlags(recyclerView, recyclerView$B);
        n4 = n4 & (n3 = 65280);
        if (n4 != 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            recyclerView = null;
        }
        return (boolean)var3_7;
    }

    public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int n3, int n4, int n7, long l2) {
        int n8 = this.getMaxDragScroll(recyclerView);
        n7 = Math.abs(n4);
        float f5 = Math.signum(n4);
        int n10 = (int)f5;
        float f6 = n7;
        float f7 = 1.0f;
        f6 *= f7;
        float f8 = n3;
        f6 /= f8;
        f8 = Math.min(f7, f6);
        float f11 = n10 *= n8;
        Interpolator interpolator2 = sDragViewScrollCapInterpolator;
        f8 = interpolator2.getInterpolation(f8) * f11;
        n8 = (int)f8;
        long l3 = 2000L;
        long l4 = l2 - l3;
        n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
        if (n3 <= 0) {
            f8 = l2;
            n7 = 1157234688;
            f6 = 2000.0f;
            f7 = f8 / f6;
        }
        f11 = n8;
        Interpolator interpolator3 = sDragScrollInterpolator;
        f8 = interpolator3.getInterpolation(f7) * f11;
        n8 = (int)f8;
        if (n8 == 0) {
            if (n4 > 0) {
                n8 = 1;
                f11 = Float.MIN_VALUE;
            } else {
                n8 = -1;
                f11 = 0.0f / 0.0f;
            }
        }
        return n8;
    }

    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    public boolean isLongPressDragEnabled() {
        return true;
    }

    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView$B object, float f5, float f6, int n3, boolean bl2) {
        int n4;
        canvas = ((RecyclerView$B)object).itemView;
        if (bl2 && (object = canvas.getTag(n4 = R$id.item_touch_helper_previous_elevation)) == null) {
            object = ViewCompat.a;
            float f7 = ViewCompat$c.e((View)canvas);
            object = Float.valueOf(f7);
            n3 = recyclerView.getChildCount();
            bl2 = false;
            float f8 = 0.0f;
            for (int i3 = 0; i3 < n3; ++i3) {
                View view = recyclerView.getChildAt(i3);
                if (view == canvas) continue;
                float f11 = ViewCompat$c.e(view);
                float f12 = f11 - f8;
                Object object2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                if (object2 <= 0) continue;
                f8 = f11;
            }
            float f14 = 1.0f;
            ViewCompat$c.m((View)canvas, f8 += f14);
            int n7 = R$id.item_touch_helper_previous_elevation;
            canvas.setTag(n7, object);
        }
        canvas.setTranslationX(f5);
        canvas.setTranslationY(f6);
    }

    public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView$B recyclerView$B, float f5, float f6, int n3, boolean bl2) {
        View cfr_ignored_0 = recyclerView$B.itemView;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView$B recyclerView$B, List list, int n3, float f5, float f6) {
        RecyclerView$B recyclerView$B2;
        boolean bl2;
        int n4;
        float f7;
        float f8;
        RecyclerView recyclerView2;
        RecyclerView$B recyclerView$B3;
        int n7 = list.size();
        Object object = null;
        for (int i3 = 0; i3 < n7; ++i3) {
            float f11;
            object = (ItemTouchHelper$e)list.get(i3);
            recyclerView$B3 = ((ItemTouchHelper$e)object).e;
            float f12 = ((ItemTouchHelper$e)object).a;
            float f14 = ((ItemTouchHelper$e)object).c;
            float f15 = f12 - f14;
            Object object2 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
            if (object2 == false) {
                recyclerView2 = recyclerView$B3.itemView;
                ((ItemTouchHelper$e)object).i = f12 = recyclerView2.getTranslationX();
            } else {
                f8 = ((ItemTouchHelper$e)object).m;
                ((ItemTouchHelper$e)object).i = f12 = xu0_1.a(f14, f12, f8, f12);
            }
            f12 = ((ItemTouchHelper$e)object).b;
            f14 = ((ItemTouchHelper$e)object).d;
            object2 = f12 == f14 ? 0 : (f12 > f14 ? 1 : -1);
            if (object2 == false) {
                recyclerView$B3 = recyclerView$B3.itemView;
                ((ItemTouchHelper$e)object).j = f11 = recyclerView$B3.getTranslationY();
            } else {
                f11 = ((ItemTouchHelper$e)object).m;
                ((ItemTouchHelper$e)object).j = f11 = xu0_1.a(f14, f12, f11, f12);
            }
            int n8 = canvas.save();
            f8 = ((ItemTouchHelper$e)object).i;
            f7 = ((ItemTouchHelper$e)object).j;
            n4 = ((ItemTouchHelper$e)object).f;
            bl2 = false;
            recyclerView$B2 = ((ItemTouchHelper$e)object).e;
            object = this;
            recyclerView$B3 = canvas;
            recyclerView2 = recyclerView;
            this.onChildDraw(canvas, recyclerView, recyclerView$B2, f8, f7, n4, false);
            canvas.restoreToCount(n8);
        }
        if (recyclerView$B != null) {
            n7 = canvas.save();
            bl2 = true;
            object = this;
            recyclerView$B3 = canvas;
            recyclerView2 = recyclerView;
            recyclerView$B2 = recyclerView$B;
            f8 = f5;
            f7 = f6;
            n4 = n3;
            this.onChildDraw(canvas, recyclerView, recyclerView$B, f5, f6, n3, bl2);
            canvas.restoreToCount(n7);
        }
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView$B recyclerView$B, List list, int n3, float f5, float f6) {
        Object object;
        boolean bl2;
        int n4;
        float f7;
        float f8;
        RecyclerView$B recyclerView$B2;
        Object object2;
        int n7;
        List list2 = list;
        int n8 = list.size();
        boolean bl3 = false;
        for (n7 = 0; n7 < n8; ++n7) {
            object2 = (ItemTouchHelper$e)list2.get(n7);
            int n10 = canvas.save();
            recyclerView$B2 = ((ItemTouchHelper$e)object2).e;
            f8 = ((ItemTouchHelper$e)object2).i;
            f7 = ((ItemTouchHelper$e)object2).j;
            n4 = ((ItemTouchHelper$e)object2).f;
            bl2 = false;
            object2 = this;
            object = canvas;
            this.onChildDrawOver(canvas, recyclerView, recyclerView$B2, f8, f7, n4, false);
            canvas.restoreToCount(n10);
        }
        if (recyclerView$B != null) {
            n7 = canvas.save();
            bl2 = true;
            object2 = this;
            object = canvas;
            recyclerView$B2 = recyclerView$B;
            f8 = f5;
            f7 = f6;
            n4 = n3;
            this.onChildDrawOver(canvas, recyclerView, recyclerView$B, f5, f6, n3, bl2);
            canvas.restoreToCount(n7);
        }
        int n14 = 1;
        n8 -= n14;
        while (n8 >= 0) {
            boolean bl4;
            object = (ItemTouchHelper$e)list2.get(n8);
            boolean bl5 = object.l;
            if (bl5 && !(bl4 = object.h)) {
                list2.remove(n8);
            } else if (!bl5) {
                bl3 = true;
            }
            n8 += -1;
        }
        if (bl3) {
            recyclerView.invalidate();
        }
    }

    public abstract boolean onMove(RecyclerView var1, RecyclerView$B var2, RecyclerView$B var3);

    public void onMoved(RecyclerView recyclerView, RecyclerView$B recyclerView$B, int n3, RecyclerView$B recyclerView$B2, int n4, int n7, int n8) {
        boolean bl2;
        Object object = recyclerView.getLayoutManager();
        boolean bl22 = object instanceof ItemTouchHelper$f;
        if (bl22) {
            object = (ItemTouchHelper$f)object;
            recyclerView = recyclerView$B.itemView;
            recyclerView$B = recyclerView$B2.itemView;
            object.prepareForDrop((View)recyclerView, (View)recyclerView$B, n7, n8);
            return;
        }
        boolean n10 = ((RecyclerView$o)object).canScrollHorizontally();
        if (n10) {
            recyclerView$B = recyclerView$B2.itemView;
            int n14 = ((RecyclerView$o)object).getDecoratedLeft((View)recyclerView$B);
            if (n14 <= (n7 = recyclerView.getPaddingLeft())) {
                recyclerView.scrollToPosition(n4);
            }
            recyclerView$B = recyclerView$B2.itemView;
            int n15 = ((RecyclerView$o)object).getDecoratedRight((View)recyclerView$B);
            n7 = recyclerView.getWidth();
            n8 = recyclerView.getPaddingRight();
            if (n15 >= (n7 -= n8)) {
                recyclerView.scrollToPosition(n4);
            }
        }
        if (bl2 = ((RecyclerView$o)object).canScrollVertically()) {
            recyclerView$B = recyclerView$B2.itemView;
            int n16 = ((RecyclerView$o)object).getDecoratedTop((View)recyclerView$B);
            if (n16 <= (n7 = recyclerView.getPaddingTop())) {
                recyclerView.scrollToPosition(n4);
            }
            recyclerView$B = recyclerView$B2.itemView;
            int n17 = ((RecyclerView$o)object).getDecoratedBottom((View)recyclerView$B);
            n3 = recyclerView.getHeight();
            int n18 = recyclerView.getPaddingBottom();
            if (n17 >= (n3 -= n18)) {
                recyclerView.scrollToPosition(n4);
            }
        }
    }

    public void onSelectedChanged(RecyclerView$B recyclerView$B, int n3) {
    }

    public abstract void onSwiped(RecyclerView$B var1, int var2);
}

