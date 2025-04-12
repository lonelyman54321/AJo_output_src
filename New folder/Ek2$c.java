/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Ek2$c
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dr_2 c;
    public final /* synthetic */ yk2_1 d;

    public Ek2$c(le_2 le_22, f80_0 f80_02, yk2_1 yk2_12) {
        this.c = le_22;
        this.d = yk2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yk2_1 yk2_12 = this.d;
        le_2 le_22 = (le_2)this.c;
        Ek2$c ek2$c = new Ek2$c(le_22, f80_02, yk2_12);
        ek2$c.b = object;
        return ek2$c;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Ek2$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Ek2$c)object).invokeSuspend(object2);
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
            object = (i90_0)this.b;
            er_2 er_22 = ms0_1.g(this.c);
            yk2_1 yk2_12 = this.d;
            Ek2$c$a ek2$c$a = new Ek2$c$a(yk2_12, (i90_0)object);
            this.a = n4;
            object = er_22.collect(ek2$c$a, this);
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

