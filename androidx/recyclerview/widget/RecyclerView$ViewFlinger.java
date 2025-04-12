/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.animation.Interpolator
 *  android.widget.OverScroller
 */
package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GapWorker;
import androidx.recyclerview.widget.GapWorker$b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$y;
import java.util.ArrayList;
import java.util.Arrays;

class RecyclerView$ViewFlinger
implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView g;

    public RecyclerView$ViewFlinger(RecyclerView recyclerView) {
        OverScroller overScroller;
        Interpolator interpolator2;
        this.g = recyclerView;
        this.d = interpolator2 = RecyclerView.sQuinticInterpolator;
        this.e = false;
        this.f = false;
        recyclerView = recyclerView.getContext();
        this.c = overScroller = new OverScroller((Context)recyclerView, interpolator2);
    }

    public final void a(int n3, int n4) {
        RecyclerView recyclerView = this.g;
        recyclerView.setScrollState(2);
        this.b = 0;
        this.a = 0;
        Interpolator interpolator2 = this.d;
        Interpolator interpolator3 = RecyclerView.sQuinticInterpolator;
        if (interpolator2 != interpolator3) {
            this.d = interpolator3;
            recyclerView = recyclerView.getContext();
            interpolator2 = new OverScroller((Context)recyclerView, interpolator3);
            this.c = interpolator2;
        }
        this.c.fling(0, 0, n3, n4, -1 << -1, -1 >>> 1, -1 << -1, -1 >>> 1);
        this.b();
    }

    public final void b() {
        boolean bl2 = this.e;
        if (bl2) {
            this.f = bl2 = true;
        } else {
            RecyclerView recyclerView = this.g;
            recyclerView.removeCallbacks(this);
            recyclerView.postOnAnimation(this);
        }
    }

    public final void c(int n3, int n4, Interpolator interpolator2, int n7) {
        Interpolator interpolator3;
        int n8;
        OverScroller overScroller;
        int n10 = -1 << -1;
        float f5 = -0.0f;
        RecyclerView recyclerView = this.g;
        if (n7 == n10) {
            boolean bl2;
            n7 = Math.abs(n3);
            if (n7 > (n10 = Math.abs(n4))) {
                bl2 = true;
            } else {
                bl2 = false;
                overScroller = null;
            }
            n8 = bl2 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!bl2) {
                n7 = n10;
            }
            float f6 = n7;
            f5 = n8;
            f6 = (f6 / f5 + 1.0f) * 300.0f;
            n7 = (int)f6;
            n10 = 2000;
            f5 = 2.803E-42f;
            n7 = Math.min(n7, n10);
        }
        int n14 = n7;
        if (interpolator2 == null) {
            interpolator2 = RecyclerView.sQuinticInterpolator;
        }
        if ((interpolator3 = this.d) != interpolator2) {
            this.d = interpolator2;
            Context context = recyclerView.getContext();
            interpolator3 = new OverScroller(context, interpolator2);
            this.c = interpolator3;
        }
        this.b = 0;
        this.a = 0;
        int n15 = 2;
        recyclerView.setScrollState(n15);
        overScroller = this.c;
        n8 = 0;
        overScroller.startScroll(0, 0, n3, n4, n14);
        n3 = Build.VERSION.SDK_INT;
        n4 = 23;
        if (n3 < n4) {
            OverScroller overScroller2 = this.c;
            overScroller2.computeScrollOffset();
        }
        this.b();
    }

    public final void run() {
        Object object;
        RecyclerView$ViewFlinger recyclerView$ViewFlinger = this;
        RecyclerView recyclerView = this.g;
        Object object2 = recyclerView.mLayout;
        if (object2 == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.f = false;
        int n3 = 1;
        this.e = n3;
        recyclerView.consumePendingUpdateOperations();
        OverScroller overScroller = this.c;
        Object object3 = overScroller.computeScrollOffset();
        if (object3 != 0) {
            Object object4;
            float f5;
            int n4;
            int n7;
            Object object5;
            int n8;
            int n10;
            object3 = overScroller.getCurrX();
            object = overScroller.getCurrY();
            int n14 = this.a;
            n14 = object3 - n14;
            int n15 = this.b;
            n15 = object - n15;
            this.a = object3;
            this.b = object;
            int n16 = recyclerView.consumeFlingInHorizontalStretch(n14);
            int n17 = recyclerView.consumeFlingInVerticalStretch(n15);
            Object object6 = recyclerView.mReusableIntPair;
            object6[0] = 0;
            object6[n3] = 0;
            int n18 = 0;
            int n19 = 1;
            object2 = recyclerView;
            object = n16;
            n14 = n17;
            object3 = recyclerView.dispatchNestedPreScroll(n16, n17, (int[])object6, null, n19);
            if (object3 != 0) {
                object2 = recyclerView.mReusableIntPair;
                object = object2[0];
                n16 -= object;
                object3 = object2[n3];
                n17 -= object3;
            }
            if ((object3 = recyclerView.getOverScrollMode()) != (n10 = 2)) {
                recyclerView.considerReleasingGlowsOnScroll(n16, n17);
            }
            if ((object2 = recyclerView.mAdapter) != null) {
                object2 = recyclerView.mReusableIntPair;
                object2[0] = false;
                object2[n3] = false;
                recyclerView.scrollStep(n16, n17, (int[])object2);
                object2 = recyclerView.mReusableIntPair;
                object = object2[0];
                object3 = object2[n3];
                n16 -= object;
                n17 -= object3;
                RecyclerView$x recyclerView$x = recyclerView.mLayout.mSmoothScroller;
                if (recyclerView$x != null && (n15 = (int)(recyclerView$x.isPendingInitialRun() ? 1 : 0)) == 0 && (n15 = (int)(recyclerView$x.isRunning() ? 1 : 0)) != 0) {
                    object6 = recyclerView.mState;
                    n15 = ((RecyclerView$y)object6).b();
                    if (n15 == 0) {
                        recyclerView$x.stop();
                    } else {
                        n18 = recyclerView$x.getTargetPosition();
                        if (n18 >= n15) {
                            recyclerView$x.setTargetPosition(n15 -= n3);
                            recyclerView$x.onAnimation((int)object, (int)object3);
                        } else {
                            recyclerView$x.onAnimation((int)object, (int)object3);
                        }
                    }
                }
                n8 = object3;
                object5 = object;
                n7 = n16;
                n4 = n17;
            } else {
                n7 = n16;
                n4 = n17;
                n8 = 0;
                object5 = 0;
            }
            object2 = recyclerView.mItemDecorations;
            object3 = ((ArrayList)object2).isEmpty();
            if (object3 == 0) {
                recyclerView.invalidate();
            }
            int[] nArray = recyclerView.mReusableIntPair;
            nArray[0] = 0;
            nArray[n3] = 0;
            n19 = 0;
            n16 = 1;
            object2 = recyclerView;
            object = object5;
            n14 = n8;
            n15 = n7;
            n18 = n4;
            recyclerView.dispatchNestedScroll((int)object5, n8, n7, n4, null, n16, nArray);
            object2 = recyclerView.mReusableIntPair;
            object = object2[0];
            n7 -= object;
            object3 = object2[n3];
            n4 -= object3;
            if (object5 != 0 || n8 != 0) {
                recyclerView.dispatchOnScrolled((int)object5, n8);
            }
            if ((object3 = (Object)RecyclerView.access$200(recyclerView)) == 0) {
                recyclerView.invalidate();
            }
            if ((object3 = overScroller.getCurrX()) == (object = overScroller.getFinalX())) {
                object3 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                object3 = 0;
                f5 = 0.0f;
                object2 = null;
            }
            object = overScroller.getCurrY();
            n14 = overScroller.getFinalY();
            if (object == n14) {
                object = 1;
            } else {
                object = 0;
                object4 = null;
            }
            n14 = (int)(overScroller.isFinished() ? 1 : 0);
            if (n14 == 0 && (object3 == 0 && n7 == 0 || object == 0 && n4 == 0)) {
                object3 = 0;
                f5 = 0.0f;
                object2 = null;
            } else {
                object3 = 1;
                f5 = Float.MIN_VALUE;
            }
            object4 = recyclerView.mLayout.mSmoothScroller;
            if ((object4 == null || (object = (Object)((RecyclerView$x)object4).isPendingInitialRun()) == 0) && object3 != 0) {
                object3 = recyclerView.getOverScrollMode();
                if (object3 != n10) {
                    f5 = overScroller.getCurrVelocity();
                    object3 = (int)f5;
                    if (n7 < 0) {
                        object = -object3;
                    } else if (n7 > 0) {
                        object = object3;
                    } else {
                        object = 0;
                        object4 = null;
                    }
                    if (n4 < 0) {
                        object3 = -object3;
                    } else if (n4 <= 0) {
                        object3 = 0;
                        f5 = 0.0f;
                        object2 = null;
                    }
                    recyclerView.absorbGlows((int)object, (int)object3);
                }
                if ((object3 = (Object)RecyclerView.ALLOW_THREAD_GAP_WORK) != 0) {
                    object2 = recyclerView.mPrefetchRegistry;
                    object4 = ((GapWorker$b)object2).c;
                    if (object4 != null) {
                        n14 = -1;
                        Arrays.fill((int[])object4, n14);
                    }
                    ((GapWorker$b)object2).d = 0;
                }
            } else {
                this.b();
                object2 = recyclerView.mGapWorker;
                if (object2 != null) {
                    ((GapWorker)object2).a(recyclerView, (int)object5, n8);
                }
            }
            if ((object3 = Build.VERSION.SDK_INT) >= (object = 35)) {
                f5 = Math.abs(overScroller.getCurrVelocity());
                RecyclerView$i.a((View)recyclerView, f5);
            }
        }
        if ((object2 = recyclerView.mLayout.mSmoothScroller) != null && (object = (Object)((RecyclerView$x)object2).isPendingInitialRun()) != 0) {
            ((RecyclerView$x)object2).onAnimation(0, 0);
        }
        recyclerView$ViewFlinger.e = false;
        object3 = recyclerView$ViewFlinger.f;
        if (object3 != 0) {
            recyclerView.removeCallbacks(recyclerView$ViewFlinger);
            object2 = ViewCompat.a;
            recyclerView.postOnAnimation(recyclerView$ViewFlinger);
        } else {
            recyclerView.setScrollState(0);
            recyclerView.stopNestedScroll(n3);
        }
    }
}

