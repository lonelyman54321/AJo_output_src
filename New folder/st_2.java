/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from St
 */
public final class st_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ ob0_1 a;

    public st_2(ob0_1 ob0_12, f80_0 f80_02) {
        this.a = ob0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ob0_1 ob0_12 = this.a;
        object = new st_2(ob0_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (st_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((st_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        this.a.c("coupon bonanza - coupons list screen", "Filters");
        return Unit.a;
    }
}

