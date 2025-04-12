/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class mL1$a$e
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ mL1$a b;

    public mL1$a$e(mL1$a mL1$a, f80_0 f80_02) {
        this.b = mL1$a;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        mL1$a mL1$a = this.b;
        object = new mL1$a$e(mL1$a, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (mL1$a$e)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((mL1$a$e)object).invokeSuspend(object2);
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
            object = this.b.a;
            this.a = n4;
            n3 = 0;
            object = ((kl1_0)object).e(null, this);
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

