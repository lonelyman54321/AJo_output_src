/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from a02
 */
public final class a02_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public a02_0(qz1_2 qz1_22, boolean bl2, String string2, f80_0 f80_02) {
        this.a = qz1_22;
        this.b = bl2;
        this.c = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.b;
        String string2 = this.c;
        qz1_2 qz1_22 = this.a;
        object = new a02_0(qz1_22, bl2, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (a02_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((a02_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object.getClass();
        boolean bl2 = this.b;
        object2 = bl2 ? "See tracking details" : "Hide order status";
        aW aW2 = md3_0.c((jD3)object);
        String string2 = this.c;
        sz1_1 sz1_12 = new sz1_1((qz1_2)object, string2, (String)object2, null);
        Ae3.d(aW2, null, null, sz1_12, 3);
        return Unit.a;
    }
}

