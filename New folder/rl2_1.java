/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from RL2
 */
public final class rl2_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ am2_2 a;
    public final /* synthetic */ pl2_1 b;

    public rl2_1(am2_2 am2_22, pl2_1 pl2_12, f80_0 f80_02) {
        this.a = am2_22;
        this.b = pl2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        am2_2 am2_22 = this.a;
        pl2_1 pl2_12 = this.b;
        object = new rl2_1(am2_22, pl2_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (rl2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rl2_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        int n3 = object instanceof aM2$d;
        if (n3 == 0) {
            object = pl2_1.Pa(this.b);
            object.getClass();
            object2 = md3_0.c((jD3)object);
            hv0_1 hv0_12 = new hv0_1((ov0_0)object, null);
            n3 = 3;
            Ae3.d((i90_0)object2, null, null, hv0_12, n3);
        }
        return Unit.a;
    }
}

