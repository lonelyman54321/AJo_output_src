/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaInfoRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from iN0
 */
public final class in0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ ob0_1 a;

    public in0_2(ob0_1 ob0_12, f80_0 f80_02) {
        this.a = ob0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ob0_1 ob0_12 = this.a;
        object = new in0_2(ob0_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (in0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((in0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((ob0_1)object).g();
        object2 = ob0_1.f((ob0_1)object, (String)object2, 0, 6);
        ((ob0_1)object).d((CouponBonanzaInfoRequest)object2);
        object2 = md3_0.c((jD3)object);
        tb0_1 tb0_12 = new tb0_1((ob0_1)object, null);
        Ae3.d((i90_0)object2, null, null, tb0_12, 3);
        ((ob0_1)object).G = false;
        ((ob0_1)object).c("coupon bonanza - coupon filter screen", "Apply Filters");
        return Unit.a;
    }
}

