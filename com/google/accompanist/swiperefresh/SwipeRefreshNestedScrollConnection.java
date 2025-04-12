/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import com.google.accompanist.swiperefresh.SwipeRefreshNestedScrollConnection$onScroll$1;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class SwipeRefreshNestedScrollConnection
implements oU1 {
    private final i90_0 coroutineScope;
    private boolean enabled;
    private final Function0 onRefresh;
    private float refreshTrigger;
    private final SwipeRefreshState state;

    public SwipeRefreshNestedScrollConnection(SwipeRefreshState swipeRefreshState, i90_0 i90_02, Function0 function0) {
        Intrinsics.checkNotNullParameter(swipeRefreshState, "state");
        Intrinsics.checkNotNullParameter(i90_02, "coroutineScope");
        Intrinsics.checkNotNullParameter(function0, "onRefresh");
        this.state = swipeRefreshState;
        this.coroutineScope = i90_02;
        this.onRefresh = function0;
    }

    public static final /* synthetic */ SwipeRefreshState access$getState$p(SwipeRefreshNestedScrollConnection swipeRefreshNestedScrollConnection) {
        return swipeRefreshNestedScrollConnection.state;
    }

    private final long onScroll-MK-Hz9U(long l2) {
        SwipeRefreshNestedScrollConnection$onScroll$1 swipeRefreshNestedScrollConnection$onScroll$1;
        Object object;
        float f5 = e72.e(l2);
        float f6 = f5 - 0.0f;
        Object object2 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object2 > 0) {
            object = this.state;
            boolean bl2 = true;
            ((SwipeRefreshState)object).setSwipeInProgress$swiperefresh_release(bl2);
        } else {
            object = this.state;
            f5 = ((SwipeRefreshState)object).getIndicatorOffset();
            object2 = ok1_1.b(f5);
            if (object2 == false) {
                object = this.state;
                boolean bl3 = false;
                swipeRefreshNestedScrollConnection$onScroll$1 = null;
                ((SwipeRefreshState)object).setSwipeInProgress$swiperefresh_release(false);
            }
        }
        float f7 = e72.e(l2);
        float f8 = 0.5f;
        f7 *= f8;
        f7 = f.a(this.state.getIndicatorOffset() + f7, 0.0f);
        object = this.state;
        f5 = ((SwipeRefreshState)object).getIndicatorOffset();
        f7 -= f5;
        f5 = Math.abs(f7);
        object2 = f5 == f8 ? 0 : (f5 > f8 ? 1 : -1);
        if (object2 >= 0) {
            object = this.coroutineScope;
            swipeRefreshNestedScrollConnection$onScroll$1 = new SwipeRefreshNestedScrollConnection$onScroll$1(this, f7, null);
            int n3 = 3;
            Ae3.d((i90_0)object, null, null, swipeRefreshNestedScrollConnection$onScroll$1, n3);
            l2 = h72.a(0.0f, f7 /= f8);
        } else {
            l2 = 0L;
        }
        return l2;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final float getRefreshTrigger() {
        return this.refreshTrigger;
    }

    public Object onPostFling-RZ2iAVY(long l2, long l3, f80_0 f80_02) {
        WA3 wA3 = new WA3(0L);
        return wA3;
    }

    public long onPostScroll-DzOQY0M(long l2, long l3, int n3) {
        SwipeRefreshState swipeRefreshState;
        int n4 = this.enabled;
        long l4 = 0L;
        if (n4 != 0 && (n4 = (swipeRefreshState = this.state).isRefreshing()) == 0) {
            float f5;
            n4 = 1;
            float f6 = Float.MIN_VALUE;
            if (n3 == n4 && (n4 = (int)((f5 = (f6 = e72.e(l3)) - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) > 0) {
                l4 = this.onScroll-MK-Hz9U(l3);
            }
        }
        return l4;
    }

    public Object onPreFling-QWom1Mo(long l2, f80_0 f80_02) {
        float f5;
        float f6;
        float f7;
        float f8;
        Object object = this.state;
        boolean n3 = ((SwipeRefreshState)object).isRefreshing();
        if (!n3 && (f8 = (f7 = (f6 = ((SwipeRefreshState)(object = this.state)).getIndicatorOffset()) - (f5 = this.refreshTrigger)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) >= 0) {
            object = this.onRefresh;
            object.invoke();
        }
        this.state.setSwipeInProgress$swiperefresh_release(false);
        object = new WA3(0L);
        return object;
    }

    public long onPreScroll-OzD1aCk(long l2, int n3) {
        SwipeRefreshState swipeRefreshState;
        int n4 = this.enabled;
        long l3 = 0L;
        if (n4 != 0 && (n4 = (swipeRefreshState = this.state).isRefreshing()) == 0 && n3 == (n4 = 1)) {
            float f5 = e72.e(l2);
            n4 = 0;
            swipeRefreshState = null;
            float f6 = f5 - 0.0f;
            n3 = (int)(f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1));
            if (n3 < 0) {
                l3 = this.onScroll-MK-Hz9U(l2);
            }
        }
        return l3;
    }

    public final void setEnabled(boolean bl2) {
        this.enabled = bl2;
    }

    public final void setRefreshTrigger(float f5) {
        this.refreshTrigger = f5;
    }
}

