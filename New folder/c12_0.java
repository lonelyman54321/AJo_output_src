/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from c12
 */
public final class c12_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ e12_0 b;

    public c12_0(e12_0 e12_02, f80_0 f80_02) {
        this.b = e12_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        e12_0 e12_02 = this.b;
        object = new c12_0(e12_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (c12_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((c12_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = this.b;
            Object object2 = ((e12_0)object).g.getNewGuId("pdp screen");
            c12$a c12$a = new c12$a((e12_0)object, null);
            at0_1 at0_12 = new at0_1((es0_2)object2, c12$a);
            object2 = new c12$b((e12_0)object);
            this.a = n4;
            object = at0_12.collect((fs0_2)object2, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

