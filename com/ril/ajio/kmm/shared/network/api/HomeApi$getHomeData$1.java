/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.network.api;

import com.ril.ajio.kmm.shared.network.api.HomeApi;

final class HomeApi$getHomeData$1
extends h80_0 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeApi this$0;

    public HomeApi$getHomeData$1(HomeApi homeApi, f80_0 f80_02) {
        this.this$0 = homeApi;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.result = object;
        this.label = n3 = this.label | -1 << -1;
        return this.this$0.getHomeData(null, null, null, null, this);
    }
}

