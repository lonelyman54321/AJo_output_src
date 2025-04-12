/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Qt$j$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ ob0_1 a;

    public Qt$j$a(ob0_1 ob0_12, f80_0 f80_02) {
        this.a = ob0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ob0_1 ob0_12 = this.a;
        object = new Qt$j$a(ob0_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Qt$j$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Qt$j$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        this.a.c("coupon bonanza - coupons list screen", "View Products");
        return Unit.a;
    }
}

