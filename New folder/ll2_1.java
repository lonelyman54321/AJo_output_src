/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from LL2
 */
public final class ll2_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ ib3_0 a;
    public final /* synthetic */ Function0 b;

    public ll2_1(ib3_0 ib3_02, xv0_2 xv0_22, f80_0 f80_02) {
        this.a = ib3_02;
        this.b = xv0_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        xv0_2 xv0_22 = (xv0_2)this.b;
        ib3_0 ib3_02 = this.a;
        object = new ll2_1(ib3_02, xv0_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ll2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ll2_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        object = (Boolean)this.a.getValue();
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.b;
            object.invoke();
        }
        return Unit.a;
    }
}

