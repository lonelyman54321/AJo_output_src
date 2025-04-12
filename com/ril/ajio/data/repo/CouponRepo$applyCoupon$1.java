/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.CouponRepo;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.network.api.CouponApi;
import com.ril.ajio.services.query.QuerySingleData;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

final class CouponRepo$applyCoupon$1
extends qg3_2
implements Function2 {
    final /* synthetic */ Ref$ObjectRef $applyCouponURL;
    final /* synthetic */ boolean $isEmployeeOfferRestriction;
    final /* synthetic */ QuerySingleData $query;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CouponRepo this$0;

    public CouponRepo$applyCoupon$1(CouponRepo couponRepo, Ref$ObjectRef ref$ObjectRef, QuerySingleData querySingleData, boolean bl2, f80_0 f80_02) {
        this.this$0 = couponRepo;
        this.$applyCouponURL = ref$ObjectRef;
        this.$query = querySingleData;
        this.$isEmployeeOfferRestriction = bl2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CouponRepo couponRepo = this.this$0;
        Ref$ObjectRef ref$ObjectRef = this.$applyCouponURL;
        QuerySingleData querySingleData = this.$query;
        boolean bl2 = this.$isEmployeeOfferRestriction;
        CouponRepo$applyCoupon$1 couponRepo$applyCoupon$1 = new CouponRepo$applyCoupon$1(couponRepo, ref$ObjectRef, querySingleData, bl2, f80_02);
        couponRepo$applyCoupon$1.L$0 = object;
        return couponRepo$applyCoupon$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (CouponRepo$applyCoupon$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((CouponRepo$applyCoupon$1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Object object2;
            int n3;
            int n4;
            j90_0 j90_02;
            block6: {
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.label;
                            n4 = 2;
                            n3 = 1;
                            if (n7 == 0) break block2;
                            if (n7 == n3) break block3;
                            if (n7 != n4) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = (fs0_2)this.L$0;
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object2 = object = this.L$0;
                object2 = (fs0_2)object;
                CouponApi couponApi = CouponRepo.access$getCouponApi$p(this.this$0);
                Object object3 = object = this.$applyCouponURL.element;
                object3 = (String)object;
                object = CouponRepo.access$getUserInformation$p(this.this$0);
                Intrinsics.checkNotNullExpressionValue(object, "access$getUserInformation$p(...)");
                object = ServiceUtil.getToken((UserInformation)object);
                String string2 = kp1_0.c("Bearer ", (String)object);
                String string3 = this.$query.getData();
                boolean bl2 = this.$isEmployeeOfferRestriction;
                Boolean bl3 = bl2;
                this.L$0 = object2;
                this.label = n3;
                String string4 = "ApplyCoupon";
                object = couponApi.applyCoupon((String)object3, string2, string3, bl3, string4, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            n3 = 0;
            this.L$0 = null;
            this.label = n4;
            object = object2.emit(object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

