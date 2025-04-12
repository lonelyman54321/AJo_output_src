/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Ek2$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ yk2_1 b;
    public final /* synthetic */ x53_0 c;

    public Ek2$a(yk2_1 yk2_12, x53_0 x53_02, f80_0 f80_02) {
        this.b = yk2_12;
        this.c = x53_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yk2_1 yk2_12 = this.b;
        x53_0 x53_02 = this.c;
        object = new Ek2$a(yk2_12, x53_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Ek2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Ek2$a)object).invokeSuspend(object2);
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
            object = ms0_1.g(this.b.j);
            x53_0 x53_02 = this.c;
            Ek2$a$a ek2$a$a = new Ek2$a$a(x53_02);
            this.a = n4;
            object = ((er_2)object).collect(ek2$a$a, this);
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

