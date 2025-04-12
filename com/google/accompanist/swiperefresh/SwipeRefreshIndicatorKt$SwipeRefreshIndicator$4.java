/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

final class SwipeRefreshIndicatorKt$SwipeRefreshIndicator$4
extends Lambda
implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $arrowEnabled;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ float $elevation;
    final /* synthetic */ boolean $fade;
    final /* synthetic */ boolean $largeIndication;
    final /* synthetic */ LP1 $modifier;
    final /* synthetic */ float $refreshTriggerDistance;
    final /* synthetic */ float $refreshingOffset;
    final /* synthetic */ boolean $scale;
    final /* synthetic */ i13 $shape;
    final /* synthetic */ SwipeRefreshState $state;

    public SwipeRefreshIndicatorKt$SwipeRefreshIndicator$4(SwipeRefreshState swipeRefreshState, float f5, LP1 lP1, boolean bl2, boolean bl3, boolean bl4, long l2, long l3, i13 i132, float f6, boolean bl5, float f7, int n3, int n4, int n7) {
        this.$state = swipeRefreshState;
        this.$refreshTriggerDistance = f5;
        this.$modifier = lP1;
        this.$fade = bl2;
        this.$scale = bl3;
        this.$arrowEnabled = bl4;
        this.$backgroundColor = l2;
        this.$contentColor = l3;
        this.$shape = i132;
        this.$refreshingOffset = f6;
        this.$largeIndication = bl5;
        this.$elevation = f7;
        this.$$changed = n3;
        this.$$changed1 = n4;
        this.$$default = n7;
        super(2);
    }

    public final void invoke(b30_0 object, int n3) {
        b30_0 b30_02 = object;
        SwipeRefreshState swipeRefreshState = this.$state;
        float f5 = this.$refreshTriggerDistance;
        LP1 lP1 = this.$modifier;
        boolean bl2 = this.$fade;
        boolean bl3 = this.$scale;
        boolean bl4 = this.$arrowEnabled;
        long l2 = this.$backgroundColor;
        long l3 = this.$contentColor;
        i13 i132 = this.$shape;
        float f6 = this.$refreshingOffset;
        boolean bl5 = this.$largeIndication;
        float f7 = this.$elevation;
        object = swipeRefreshState;
        int n4 = Me3.b(this.$$changed | 1);
        int n7 = Me3.b(this.$$changed1);
        int n8 = this.$$default;
        SwipeRefreshIndicatorKt.SwipeRefreshIndicator-_UAkqwU(swipeRefreshState, f5, lP1, bl2, bl3, bl4, l2, l3, i132, f6, bl5, f7, b30_02, n4, n7, n8);
    }
}

