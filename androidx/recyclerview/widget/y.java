/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.widget.Scroller
 */
package androidx.recyclerview.widget;

import android.content.Context;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$q;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$x$b;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.y$a;
import androidx.recyclerview.widget.y$b;

public abstract class y
extends RecyclerView$q {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final RecyclerView$s mScrollListener;

    public y() {
        y$a y$a = new y$a(this);
        this.mScrollListener = y$a;
    }

    private void destroyCallbacks() {
        RecyclerView recyclerView = this.mRecyclerView;
        RecyclerView$s recyclerView$s = this.mScrollListener;
        recyclerView.removeOnScrollListener(recyclerView$s);
        this.mRecyclerView.setOnFlingListener(null);
    }

    private void setupCallbacks() {
        Object object = this.mRecyclerView.getOnFlingListener();
        if (object == null) {
            object = this.mRecyclerView;
            RecyclerView$s recyclerView$s = this.mScrollListener;
            ((RecyclerView)object).addOnScrollListener(recyclerView$s);
            this.mRecyclerView.setOnFlingListener(this);
            return;
        }
        object = new IllegalStateException("An instance of OnFlingListener already set.");
        throw object;
    }

    private boolean snapFromFling(RecyclerView$o recyclerView$o, int n3, int n4) {
        boolean bl2 = recyclerView$o instanceof RecyclerView$x$b;
        if (!bl2) {
            return false;
        }
        RecyclerView$x recyclerView$x = this.createScroller(recyclerView$o);
        if (recyclerView$x == null) {
            return false;
        }
        if ((n3 = this.findTargetSnapPosition(recyclerView$o, n3, n4)) == (n4 = -1)) {
            return false;
        }
        recyclerView$x.setTargetPosition(n3);
        recyclerView$o.startSmoothScroll(recyclerView$x);
        return true;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            this.destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            this.setupCallbacks();
            recyclerView2 = this.mRecyclerView.getContext();
            DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
            recyclerView = new Scroller((Context)recyclerView2, (Interpolator)decelerateInterpolator);
            this.mGravityScroller = recyclerView;
            this.snapToTargetExistingView();
        }
    }

    public abstract int[] calculateDistanceToFinalSnap(RecyclerView$o var1, View var2);

    public int[] calculateScrollDistance(int n3, int n4) {
        this.mGravityScroller.fling(0, 0, n3, n4, -1 << -1, -1 >>> 1, -1 << -1, -1 >>> 1);
        n3 = this.mGravityScroller.getFinalX();
        n4 = this.mGravityScroller.getFinalY();
        return new int[]{n3, n4};
    }

    public RecyclerView$x createScroller(RecyclerView$o recyclerView$o) {
        return this.createSnapScroller(recyclerView$o);
    }

    public o createSnapScroller(RecyclerView$o object) {
        boolean bl2 = object instanceof RecyclerView$x$b;
        if (!bl2) {
            return null;
        }
        Context context = this.mRecyclerView.getContext();
        object = new y$b(this, context);
        return object;
    }

    public abstract View findSnapView(RecyclerView$o var1);

    public abstract int findTargetSnapPosition(RecyclerView$o var1, int var2, int var3);

    public boolean onFling(int n3, int n4) {
        RecyclerView$o recyclerView$o = this.mRecyclerView.getLayoutManager();
        boolean bl2 = false;
        if (recyclerView$o == null) {
            return false;
        }
        Object object = this.mRecyclerView.getAdapter();
        if (object == null) {
            return false;
        }
        object = this.mRecyclerView;
        int n7 = ((RecyclerView)object).getMinFlingVelocity();
        int n8 = Math.abs(n4);
        if ((n8 > n7 || (n8 = Math.abs(n3)) > n7) && (n3 = (int)(this.snapFromFling(recyclerView$o, n3, n4) ? 1 : 0)) != 0) {
            bl2 = true;
        }
        return bl2;
    }

    public void snapToTargetExistingView() {
        Object object;
        Object object2 = this.mRecyclerView;
        if (object2 == null) {
            return;
        }
        if ((object2 = ((RecyclerView)object2).getLayoutManager()) == null) {
            return;
        }
        View view = this.findSnapView((RecyclerView$o)object2);
        if (view == null) {
            return;
        }
        object2 = this.calculateDistanceToFinalSnap((RecyclerView$o)object2, view);
        view = null;
        Object object3 = object2[0];
        int n3 = 1;
        if (object3 != false || (object = object2[n3]) != false) {
            RecyclerView recyclerView = this.mRecyclerView;
            Object object4 = object2[n3];
            recyclerView.smoothScrollBy((int)object3, (int)object4);
        }
    }
}

