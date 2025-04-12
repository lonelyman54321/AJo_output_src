/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.CouponRepo;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

final class CouponRepo$removeCoupon$1
extends qg3_2
implements Function2 {
    final /* synthetic */ Ref$ObjectRef $removeCouponURL;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CouponRepo this$0;

    public CouponRepo$removeCoupon$1(CouponRepo couponRepo, Ref$ObjectRef ref$ObjectRef, f80_0 f80_02) {
        this.this$0 = couponRepo;
        this.$removeCouponURL = ref$ObjectRef;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CouponRepo couponRepo = this.this$0;
        Ref$ObjectRef ref$ObjectRef = this.$removeCouponURL;
        CouponRepo$removeCoupon$1 couponRepo$removeCoupon$1 = new CouponRepo$removeCoupon$1(couponRepo, ref$ObjectRef, f80_02);
        couponRepo$removeCoupon$1.L$0 = object;
        return couponRepo$removeCoupon$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (CouponRepo$removeCoupon$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((CouponRepo$removeCoupon$1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            String string2;
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
                object = CouponRepo.access$getCouponApi$p(this.this$0);
                String string3 = (String)this.$removeCouponURL.element;
                Object object3 = CouponRepo.access$getUserInformation$p(this.this$0);
                Intrinsics.checkNotNullExpressionValue(object3, "access$getUserInformation$p(...)");
                object3 = ServiceUtil.getToken((UserInformation)object3);
                String string4 = "Bearer ";
                object3 = kp1_0.c(string4, (String)object3);
                this.L$0 = object2;
                this.label = n3;
                string2 = "RemoveCoupon";
                object = object.removeCoupon(string3, (String)object3, string2, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            n3 = 0;
            string2 = null;
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

