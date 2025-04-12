/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

final class BannerAdViewModel$getAdsBannerDataMiscPages$1$1$3
extends qg3_2
implements Function2 {
    final /* synthetic */ Ref$ObjectRef $thirdPartyApi;
    int label;

    public BannerAdViewModel$getAdsBannerDataMiscPages$1$1$3(Ref$ObjectRef ref$ObjectRef, f80_0 f80_02) {
        this.$thirdPartyApi = ref$ObjectRef;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$ObjectRef ref$ObjectRef = this.$thirdPartyApi;
        object = new BannerAdViewModel$getAdsBannerDataMiscPages$1$1$3(ref$ObjectRef, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (BannerAdViewModel$getAdsBannerDataMiscPages$1$1$3)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((BannerAdViewModel$getAdsBannerDataMiscPages$1$1$3)object).invokeSuspend(object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
        } else {
            vl2_2.b(object);
            object = (vn0_2)this.$thirdPartyApi.element;
            if (object == null) return null;
            this.label = n4;
            if ((object = object.y0(this)) != j90_02) return (DataCallback)object;
            return j90_02;
        }
        vl2_2.b(object);
        return (DataCallback)object;
    }
}

