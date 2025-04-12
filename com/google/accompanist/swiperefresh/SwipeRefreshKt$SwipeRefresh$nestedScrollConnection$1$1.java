/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class SwipeRefreshKt$SwipeRefresh$nestedScrollConnection$1$1
extends Lambda
implements Function0 {
    final /* synthetic */ ib3_0 $updatedOnRefresh;

    public SwipeRefreshKt$SwipeRefresh$nestedScrollConnection$1$1(ib3_0 ib3_02) {
        this.$updatedOnRefresh = ib3_02;
        super(0);
    }

    public final void invoke() {
        ((Function0)this.$updatedOnRefresh.getValue()).invoke();
    }
}

