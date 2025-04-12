/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class N83$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ es0_2 b;
    public final /* synthetic */ Mz2 c;

    public N83$b(es0_2 es0_22, Mz2 mz2, f80_0 f80_02) {
        this.b = es0_22;
        this.c = mz2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        es0_2 es0_22 = this.b;
        Mz2 mz2 = this.c;
        object = new N83$b(es0_22, mz2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (N83$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((N83$b)object).invokeSuspend(object2);
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
            Object object2 = this.c;
            object = new N83$b$a((Mz2)object2);
            this.a = n4;
            object2 = this.b;
            object = object2.collect((fs0_2)object, this);
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

