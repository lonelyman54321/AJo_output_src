/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$ViewFlinger;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$x$a;
import androidx.recyclerview.widget.RecyclerView$x$b;
import androidx.recyclerview.widget.RecyclerView$y;

public abstract class RecyclerView$x {
    private RecyclerView$o mLayoutManager;
    private boolean mPendingInitialRun;
    private RecyclerView mRecyclerView;
    private final RecyclerView$x$a mRecyclingAction;
    private boolean mRunning;
    private boolean mStarted;
    private int mTargetPosition;
    private View mTargetView;

    public RecyclerView$x() {
        RecyclerView$x$a recyclerView$x$a;
        int n3;
        this.mTargetPosition = n3 = -1;
        recyclerView$x$a.d = n3;
        recyclerView$x$a.f = false;
        recyclerView$x$a.a = 0;
        recyclerView$x$a.b = 0;
        recyclerView$x$a.c = -1 << -1;
        recyclerView$x$a.e = null;
        this.mRecyclingAction = recyclerView$x$a;
    }

    public PointF computeScrollVectorForPosition(int n3) {
        RecyclerView$o recyclerView$o = this.getLayoutManager();
        boolean bl2 = recyclerView$o instanceof RecyclerView$x$b;
        if (bl2) {
            return ((RecyclerView$x$b)((Object)recyclerView$o)).computeScrollVectorForPosition(n3);
        }
        return null;
    }

    public View findViewByPosition(int n3) {
        return this.mRecyclerView.mLayout.findViewByPosition(n3);
    }

    public int getChildCount() {
        return this.mRecyclerView.mLayout.getChildCount();
    }

    public int getChildPosition(View view) {
        return this.mRecyclerView.getChildLayoutPosition(view);
    }

    public RecyclerView$o getLayoutManager() {
        return this.mLayoutManager;
    }

    public int getTargetPosition() {
        return this.mTargetPosition;
    }

    public void instantScrollToPosition(int n3) {
        this.mRecyclerView.scrollToPosition(n3);
    }

    public boolean isPendingInitialRun() {
        return this.mPendingInitialRun;
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public void normalize(PointF pointF) {
        float f5 = pointF.x;
        f5 *= f5;
        float f6 = pointF.y;
        f5 = (float)Math.sqrt(f6 * f6 + f5);
        pointF.x = f6 = pointF.x / f5;
        pointF.y = f6 = pointF.y / f5;
    }

    public void onAnimation(int n3, int n4) {
        float f5;
        int n7;
        RecyclerView$x$a recyclerView$x$a;
        int n8;
        Object object;
        RecyclerView recyclerView = this.mRecyclerView;
        int n10 = this.mTargetPosition;
        int n14 = -1;
        if (n10 == n14 || recyclerView == null) {
            this.stop();
        }
        n10 = (int)(this.mPendingInitialRun ? 1 : 0);
        n14 = 0;
        Object object2 = null;
        if (n10 != 0 && (object = this.mTargetView) == null && (object = this.mLayoutManager) != null && (object = this.computeScrollVectorForPosition(n10 = this.mTargetPosition)) != null) {
            float f6;
            float f7;
            float f8 = object.x;
            n8 = 0;
            recyclerView$x$a = null;
            float f11 = f8 - 0.0f;
            Object object3 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
            if (object3 != false || (n8 = (int)((f7 = (f6 = object.y) - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) != 0) {
                f8 = Math.signum(f8);
                n7 = (int)f8;
                f5 = Math.signum(object.y);
                n10 = (int)f5;
                recyclerView.scrollStep(n7, n10, null);
            }
        }
        n10 = 0;
        f5 = 0.0f;
        object = null;
        this.mPendingInitialRun = false;
        Object object4 = this.mTargetView;
        if (object4 != null) {
            n7 = this.getChildPosition((View)object4);
            if (n7 == (n8 = this.mTargetPosition)) {
                object2 = this.mTargetView;
                object4 = recyclerView.mState;
                recyclerView$x$a = this.mRecyclingAction;
                this.onTargetFound((View)object2, (RecyclerView$y)object4, recyclerView$x$a);
                object2 = this.mRecyclingAction;
                ((RecyclerView$x$a)object2).a(recyclerView);
                this.stop();
            } else {
                this.mTargetView = null;
            }
        }
        if ((n14 = (int)(this.mRunning ? 1 : 0)) != 0) {
            object2 = recyclerView.mState;
            object4 = this.mRecyclingAction;
            this.onSeekTargetStep(n3, n4, (RecyclerView$y)object2, (RecyclerView$x$a)object4);
            Object object5 = this.mRecyclingAction;
            n4 = ((RecyclerView$x$a)object5).d;
            n14 = 1;
            if (n4 >= 0) {
                n10 = 1;
                f5 = Float.MIN_VALUE;
            }
            ((RecyclerView$x$a)object5).a(recyclerView);
            if (n10 != 0 && (n3 = (int)(this.mRunning ? 1 : 0)) != 0) {
                this.mPendingInitialRun = n14;
                object5 = recyclerView.mViewFlinger;
                ((RecyclerView$ViewFlinger)object5).b();
            }
        }
    }

    public void onChildAttachedToWindow(View view) {
        int n3;
        int n4 = this.getChildPosition(view);
        if (n4 == (n3 = this.getTargetPosition())) {
            this.mTargetView = view;
        }
    }

    public abstract void onSeekTargetStep(int var1, int var2, RecyclerView$y var3, RecyclerView$x$a var4);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onTargetFound(View var1, RecyclerView$y var2, RecyclerView$x$a var3);

    public void setTargetPosition(int n3) {
        this.mTargetPosition = n3;
    }

    public void start(RecyclerView object, RecyclerView$o recyclerView$o) {
        RecyclerView$ViewFlinger recyclerView$ViewFlinger = ((RecyclerView)object).mViewFlinger;
        RecyclerView recyclerView = recyclerView$ViewFlinger.g;
        recyclerView.removeCallbacks(recyclerView$ViewFlinger);
        recyclerView$ViewFlinger = recyclerView$ViewFlinger.c;
        recyclerView$ViewFlinger.abortAnimation();
        this.mRecyclerView = object;
        this.mLayoutManager = recyclerView$o;
        int n3 = this.mTargetPosition;
        int n4 = -1;
        if (n3 != n4) {
            boolean bl2;
            ((RecyclerView)object).mState.a = n3;
            this.mRunning = bl2 = true;
            this.mPendingInitialRun = bl2;
            n3 = this.getTargetPosition();
            recyclerView$o = this.findViewByPosition(n3);
            this.mTargetView = recyclerView$o;
            this.onStart();
            this.mRecyclerView.mViewFlinger.b();
            this.mStarted = bl2;
            return;
        }
        object = new IllegalArgumentException("Invalid target position");
        throw object;
    }

    public final void stop() {
        int n3;
        boolean bl2 = this.mRunning;
        if (!bl2) {
            return;
        }
        this.mRunning = false;
        this.onStop();
        RecyclerView$y recyclerView$y = this.mRecyclerView.mState;
        recyclerView$y.a = n3 = -1;
        this.mTargetView = null;
        this.mTargetPosition = n3;
        this.mPendingInitialRun = false;
        this.mLayoutManager.onSmoothScrollerStopped(this);
        this.mLayoutManager = null;
        this.mRecyclerView = null;
    }
}

