/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import com.google.accompanist.swiperefresh.SwipeRefreshKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

final class SwipeRefreshKt$SwipeRefresh$3
extends Lambda
implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $clipIndicatorToPadding;
    final /* synthetic */ Function2 $content;
    final /* synthetic */ hx0_2 $indicator;
    final /* synthetic */ Nc $indicatorAlignment;
    final /* synthetic */ mk2_0 $indicatorPadding;
    final /* synthetic */ LP1 $modifier;
    final /* synthetic */ Function0 $onRefresh;
    final /* synthetic */ float $refreshTriggerDistance;
    final /* synthetic */ SwipeRefreshState $state;
    final /* synthetic */ boolean $swipeEnabled;

    public SwipeRefreshKt$SwipeRefresh$3(SwipeRefreshState swipeRefreshState, Function0 function0, LP1 lP1, boolean bl2, float f5, Nc nc, mk2_0 mk2_02, hx0_2 hx0_22, boolean bl3, Function2 function2, int n3, int n4) {
        this.$state = swipeRefreshState;
        this.$onRefresh = function0;
        this.$modifier = lP1;
        this.$swipeEnabled = bl2;
        this.$refreshTriggerDistance = f5;
        this.$indicatorAlignment = nc;
        this.$indicatorPadding = mk2_02;
        this.$indicator = hx0_22;
        this.$clipIndicatorToPadding = bl3;
        this.$content = function2;
        this.$$changed = n3;
        this.$$default = n4;
        super(2);
    }

    public final void invoke(b30_0 b30_02, int n3) {
        SwipeRefreshState swipeRefreshState = this.$state;
        Function0 function0 = this.$onRefresh;
        LP1 lP1 = this.$modifier;
        boolean bl2 = this.$swipeEnabled;
        float f5 = this.$refreshTriggerDistance;
        Nc nc = this.$indicatorAlignment;
        mk2_0 mk2_02 = this.$indicatorPadding;
        hx0_2 hx0_22 = this.$indicator;
        boolean bl3 = this.$clipIndicatorToPadding;
        Function2 function2 = this.$content;
        int n4 = Me3.b(this.$$changed | 1);
        int n7 = this.$$default;
        SwipeRefreshKt.SwipeRefresh-Fsagccs(swipeRefreshState, function0, lP1, bl2, f5, nc, mk2_02, hx0_22, bl3, function2, b30_02, n4, n7);
    }
}

