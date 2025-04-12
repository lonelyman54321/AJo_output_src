/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.bonanza.model.ICouponBonanzaInfo;
import com.ril.ajio.bonanza.model.ICouponsAvailable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class gN0$d
extends qg3_2
implements Function2 {
    public final /* synthetic */ ob0_1 a;

    public gN0$d(ob0_1 ob0_12, f80_0 f80_02) {
        this.a = ob0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ob0_1 ob0_12 = this.a;
        object = new gN0$d(ob0_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (gN0$d)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((gN0$d)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        boolean bl2 = ((ob0_1)object).G;
        if (bl2) {
            object3 = ((ob0_1)object).t;
            if (object3 != null && (object3 = ((ICouponBonanzaInfo)object3).getCouponsAvailable()) != null) {
                object3 = ((ICouponsAvailable)object3).getFilters();
            } else {
                bl2 = false;
                object3 = null;
            }
            if (object3 != null) {
                object3 = ((ob0_1)object).t;
                if (object3 != null && (object3 = ((ICouponBonanzaInfo)object3).getCouponsAvailable()) != null) {
                    object3 = ((ICouponsAvailable)object3).getFilters();
                } else {
                    bl2 = false;
                    object3 = null;
                }
                Intrinsics.checkNotNull(object3);
                object2 = ((ob0_1)object).m;
                ((h83_0)object2).setValue(object3);
                ((ob0_1)object).e();
            }
        }
        object2 = "coupon bonanza - coupon filter screen";
        Intrinsics.checkNotNullParameter(object2, "screenName");
        object3 = md3_0.c((jD3)object);
        rb0_1 rb0_12 = new rb0_1((ob0_1)object, (String)object2, null);
        Ae3.d((i90_0)object3, null, null, rb0_12, 3);
        return Unit.a;
    }
}

