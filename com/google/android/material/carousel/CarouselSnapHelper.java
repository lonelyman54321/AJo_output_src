/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PointF
 *  android.view.View
 */
package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$x$b;
import androidx.recyclerview.widget.y;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.CarouselSnapHelper$1;

public class CarouselSnapHelper
extends y {
    private static final float HORIZONTAL_SNAP_SPEED = 100.0f;
    private static final float VERTICAL_SNAP_SPEED = 50.0f;
    private final boolean disableFling;
    private RecyclerView recyclerView;

    public CarouselSnapHelper() {
        this(true);
    }

    public CarouselSnapHelper(boolean bl2) {
        this.disableFling = bl2;
    }

    public static /* synthetic */ RecyclerView access$000(CarouselSnapHelper carouselSnapHelper) {
        return carouselSnapHelper.recyclerView;
    }

    public static /* synthetic */ int[] access$100(CarouselSnapHelper carouselSnapHelper, RecyclerView$o recyclerView$o, View view, boolean bl2) {
        return carouselSnapHelper.calculateDistanceToSnap(recyclerView$o, view, bl2);
    }

    private int[] calculateDistanceToSnap(RecyclerView$o recyclerView$o, View view, boolean bl2) {
        boolean bl3 = recyclerView$o instanceof CarouselLayoutManager;
        if (!bl3) {
            return new int[]{0, 0};
        }
        RecyclerView$o recyclerView$o2 = recyclerView$o;
        recyclerView$o2 = (CarouselLayoutManager)recyclerView$o;
        int n3 = this.distanceToFirstFocalKeyline(view, (CarouselLayoutManager)recyclerView$o2, bl2);
        bl2 = recyclerView$o.canScrollHorizontally();
        if (bl2) {
            return new int[]{n3, 0};
        }
        boolean bl4 = recyclerView$o.canScrollVertically();
        if (bl4) {
            return new int[]{0, n3};
        }
        return new int[]{0, 0};
    }

    private int distanceToFirstFocalKeyline(View view, CarouselLayoutManager carouselLayoutManager, boolean bl2) {
        int n3 = carouselLayoutManager.getPosition(view);
        return carouselLayoutManager.getOffsetToScrollToPositionForSnap(n3, bl2);
    }

    private View findViewNearestFirstKeyline(RecyclerView$o recyclerView$o) {
        boolean bl2;
        int n3 = recyclerView$o.getChildCount();
        View view = null;
        if (n3 != 0 && (bl2 = recyclerView$o instanceof CarouselLayoutManager)) {
            RecyclerView$o recyclerView$o2 = recyclerView$o;
            recyclerView$o2 = (CarouselLayoutManager)recyclerView$o;
            int n4 = -1 >>> 1;
            for (int i3 = 0; i3 < n3; ++i3) {
                View view2 = recyclerView$o.getChildAt(i3);
                int n7 = recyclerView$o.getPosition(view2);
                if ((n7 = Math.abs(((CarouselLayoutManager)recyclerView$o2).getOffsetToScrollToPositionForSnap(n7, false))) >= n4) continue;
                view = view2;
                n4 = n7;
            }
        }
        return view;
    }

    private boolean isForwardFling(RecyclerView$o recyclerView$o, int n3, int n4) {
        boolean bl2 = recyclerView$o.canScrollHorizontally();
        boolean bl3 = false;
        if (bl2) {
            if (n3 > 0) {
                bl3 = true;
            }
            return bl3;
        }
        if (n4 > 0) {
            bl3 = true;
        }
        return bl3;
    }

    private boolean isReverseLayout(RecyclerView$o object) {
        int n3 = ((RecyclerView$o)object).getItemCount();
        int n4 = object instanceof RecyclerView$x$b;
        boolean bl2 = false;
        if (n4 != 0) {
            float f5;
            float f6;
            float f7;
            float f8;
            float f11;
            object = (RecyclerView$x$b)object;
            n4 = 1;
            if ((object = object.computeScrollVectorForPosition(n3 -= n4)) != null && ((n3 = (int)((f11 = (f8 = ((PointF)object).x) - 0.0f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1))) < 0 || (f7 = (f6 = (f5 = ((PointF)object).y) - 0.0f) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) < 0)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        super.attachToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    public int[] calculateDistanceToFinalSnap(RecyclerView$o recyclerView$o, View view) {
        return this.calculateDistanceToSnap(recyclerView$o, view, false);
    }

    public RecyclerView$x createScroller(RecyclerView$o recyclerView$o) {
        CarouselSnapHelper$1 carouselSnapHelper$1;
        boolean bl2 = recyclerView$o instanceof RecyclerView$x$b;
        if (bl2) {
            Context context = this.recyclerView.getContext();
            carouselSnapHelper$1 = new CarouselSnapHelper$1(this, context, recyclerView$o);
        } else {
            bl2 = false;
            carouselSnapHelper$1 = null;
        }
        return carouselSnapHelper$1;
    }

    public View findSnapView(RecyclerView$o recyclerView$o) {
        return this.findViewNearestFirstKeyline(recyclerView$o);
    }

    public int findTargetSnapPosition(RecyclerView$o recyclerView$o, int n3, int n4) {
        int n7 = this.disableFling;
        int n8 = -1;
        if (n7 == 0) {
            return n8;
        }
        n7 = recyclerView$o.getItemCount();
        if (n7 == 0) {
            return n8;
        }
        int n10 = recyclerView$o.getChildCount();
        View view = null;
        View view2 = null;
        int n14 = -1 << -1;
        int n15 = -1 >>> 1;
        for (int i3 = 0; i3 < n10; ++i3) {
            View view3 = recyclerView$o.getChildAt(i3);
            if (view3 == null) continue;
            RecyclerView$o recyclerView$o2 = recyclerView$o;
            recyclerView$o2 = (CarouselLayoutManager)recyclerView$o;
            int n16 = this.distanceToFirstFocalKeyline(view3, (CarouselLayoutManager)recyclerView$o2, false);
            if (n16 <= 0 && n16 > n14) {
                view2 = view3;
                n14 = n16;
            }
            if (n16 < 0 || n16 >= n15) continue;
            view = view3;
            n15 = n16;
        }
        if ((n3 = (int)(this.isForwardFling(recyclerView$o, n3, n4) ? 1 : 0)) != 0 && view != null) {
            return recyclerView$o.getPosition(view);
        }
        if (n3 == 0 && view2 != null) {
            return recyclerView$o.getPosition(view2);
        }
        if (n3 != 0) {
            view = view2;
        }
        if (view == null) {
            return n8;
        }
        n4 = recyclerView$o.getPosition(view);
        int n17 = this.isReverseLayout(recyclerView$o);
        n17 = n17 == n3 ? -1 : 1;
        if ((n4 += n17) >= 0 && n4 < n7) {
            return n4;
        }
        return n8;
    }
}

