/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaInfoRequest;
import com.ril.ajio.kmm.shared.bonanza.repo.CouponBonanzaRepo;
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Zb0
 */
public final class zb0_1
extends qg3_2
implements Function2 {
    public i23_0 a;
    public int b;
    public final /* synthetic */ ob0_1 c;
    public final /* synthetic */ CouponBonanzaInfoRequest d;

    public zb0_1(ob0_1 ob0_12, CouponBonanzaInfoRequest couponBonanzaInfoRequest, f80_0 f80_02) {
        this.c = ob0_12;
        this.d = couponBonanzaInfoRequest;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ob0_1 ob0_12 = this.c;
        CouponBonanzaInfoRequest couponBonanzaInfoRequest = this.d;
        object = new zb0_1(ob0_12, couponBonanzaInfoRequest, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (zb0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zb0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            i23_0 i23_02;
            Object object2;
            int n3;
            j90_0 j90_02;
            int n4;
            block6: {
                int n7;
                block2: {
                    block3: {
                        block4: {
                            n7 = 1;
                            n4 = 2;
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            n3 = this.b;
                            if (n3 == 0) break block2;
                            if (n3 == n7) break block3;
                            if (n3 != n4) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = this.a;
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object = this.c;
                i23_02 = ((ob0_1)object).x;
                CouponBonanzaRepo couponBonanzaRepo = CouponBonanzaRepo.INSTANCE;
                Object object3 = UrlHelper.Companion.getInstance();
                String string2 = ((ob0_1)object).C;
                object = ((ob0_1)object).o();
                Object[] objectArray = new Object[n4];
                objectArray[0] = string2;
                objectArray[n7] = object;
                string2 = "coupon_bonanza_purchase_coupons";
                object = ((UrlHelper)object3).getApiUrl("misc", string2, objectArray);
                this.a = i23_02;
                this.b = n7;
                object2 = "couponBonanza_purchaseCoupons";
                object3 = this.d;
                object = couponBonanzaRepo.purchaseCoupons((String)object2, (String)object, (CouponBonanzaInfoRequest)object3, this);
                if (object == j90_02) {
                    return j90_02;
                }
                object2 = i23_02;
            }
            n3 = 0;
            i23_02 = null;
            this.a = null;
            this.b = n4;
            object = object2.emit(object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

