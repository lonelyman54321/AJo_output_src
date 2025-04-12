/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.repo;

import com.ril.ajio.kmm.shared.bonanza.repo.CouponBonanzaRepo;

final class CouponBonanzaRepo$getResponse$1
extends h80_0 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CouponBonanzaRepo this$0;

    public CouponBonanzaRepo$getResponse$1(CouponBonanzaRepo couponBonanzaRepo, f80_0 f80_02) {
        this.this$0 = couponBonanzaRepo;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.result = object;
        this.label = n3 = this.label | -1 << -1;
        return CouponBonanzaRepo.access$getResponse(this.this$0, null, this);
    }
}

