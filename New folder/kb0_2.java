/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.bonanza.model.ICoupon;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Kb0
 */
public final class kb0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ ICoupon b;

    public kb0_2(ob0_1 ob0_12, ICoupon iCoupon, f80_0 f80_02) {
        this.a = ob0_12;
        this.b = iCoupon;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ob0_1 ob0_12 = this.a;
        ICoupon iCoupon = this.b;
        object = new kb0_2(ob0_12, iCoupon, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (kb0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((kb0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.b.getSerialNumberId();
        Intrinsics.checkNotNull(object);
        object2 = this.a;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, "text");
        Object object3 = ((ob0_1)object2).a;
        int n3 = R$string.coupons_copied;
        object3 = object3.getString(n3);
        Intrinsics.checkNotNullExpressionValue(object3, "getString(...)");
        hv3_0.b((String)object, (String)object3);
        ((ob0_1)object2).c("coupon bonanza - coupons list screen", "Copy");
        return Unit.a;
    }
}

