/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.accompanist.swiperefresh.SwipeRefreshState$animateOffsetTo$2;
import com.google.accompanist.swiperefresh.SwipeRefreshState$dispatchScrollDelta$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

public final class SwipeRefreshState {
    public static final int $stable;
    private final Lj _indicatorOffset;
    private final tr1_0 isRefreshing$delegate;
    private final tr1_0 isSwipeInProgress$delegate;
    private final gS1 mutatorMutex;

    public SwipeRefreshState(boolean bl2) {
        Object object = Rj.a(0.0f);
        this._indicatorOffset = object;
        this.mutatorMutex = object = new gS1();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = J83.g(bl2);
        this.isRefreshing$delegate = parcelableSnapshotMutableState;
        parcelableSnapshotMutableState = J83.g(Boolean.FALSE);
        this.isSwipeInProgress$delegate = parcelableSnapshotMutableState;
    }

    public static final /* synthetic */ Lj access$get_indicatorOffset$p(SwipeRefreshState swipeRefreshState) {
        return swipeRefreshState._indicatorOffset;
    }

    public final Object animateOffsetTo$swiperefresh_release(float f5, f80_0 object) {
        gS1 gS12 = this.mutatorMutex;
        SwipeRefreshState$animateOffsetTo$2 swipeRefreshState$animateOffsetTo$2 = new SwipeRefreshState$animateOffsetTo$2(this, f5, null);
        Object object2 = aS1.Default;
        gS12.getClass();
        ds1_2 ds1_22 = new ds1_2((aS1)((Object)object2), gS12, swipeRefreshState$animateOffsetTo$2, null);
        object2 = d.c(ds1_22, object);
        object = j90_0.COROUTINE_SUSPENDED;
        if (object2 == object) {
            return object2;
        }
        return Unit.a;
    }

    public final Object dispatchScrollDelta$swiperefresh_release(float f5, f80_0 object) {
        gS1 gS12 = this.mutatorMutex;
        aS1 aS12 = aS1.UserInput;
        SwipeRefreshState$dispatchScrollDelta$2 swipeRefreshState$dispatchScrollDelta$2 = new SwipeRefreshState$dispatchScrollDelta$2(this, f5, null);
        gS12.getClass();
        Object object2 = new ds1_2(aS12, gS12, swipeRefreshState$dispatchScrollDelta$2, null);
        object2 = d.c((Function2)object2, object);
        object = j90_0.COROUTINE_SUSPENDED;
        if (object2 == object) {
            return object2;
        }
        return Unit.a;
    }

    public final float getIndicatorOffset() {
        return ((Number)this._indicatorOffset.d()).floatValue();
    }

    public final boolean isRefreshing() {
        return (Boolean)this.isRefreshing$delegate.getValue();
    }

    public final boolean isSwipeInProgress() {
        return (Boolean)this.isSwipeInProgress$delegate.getValue();
    }

    public final void setRefreshing(boolean bl2) {
        tr1_0 tr1_02 = this.isRefreshing$delegate;
        Boolean bl3 = bl2;
        tr1_02.setValue(bl3);
    }

    public final void setSwipeInProgress$swiperefresh_release(boolean bl2) {
        tr1_0 tr1_02 = this.isSwipeInProgress$delegate;
        Boolean bl3 = bl2;
        tr1_02.setValue(bl3);
    }
}

