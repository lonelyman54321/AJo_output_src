/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.CouponRepo$getSortedListsOfCoupons$$inlined$map$1$2;
import kotlin.Unit;

public final class CouponRepo$getSortedListsOfCoupons$$inlined$map$1
implements es0_2 {
    final /* synthetic */ String $screenName$inlined;
    final /* synthetic */ es0_2 $this_unsafeTransform$inlined;

    public CouponRepo$getSortedListsOfCoupons$$inlined$map$1(es0_2 es0_22, String string2) {
        this.$this_unsafeTransform$inlined = es0_22;
        this.$screenName$inlined = string2;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.$this_unsafeTransform$inlined;
        String string2 = this.$screenName$inlined;
        CouponRepo$getSortedListsOfCoupons$$inlined$map$1$2 couponRepo$getSortedListsOfCoupons$$inlined$map$1$2 = new CouponRepo$getSortedListsOfCoupons$$inlined$map$1$2((fs0_2)object, string2);
        if ((object = es0_22.collect(couponRepo$getSortedListsOfCoupons$$inlined$map$1$2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

