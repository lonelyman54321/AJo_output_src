/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Uo3$a$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Uo3$a b;
    public final /* synthetic */ mZ0 c;

    public Uo3$a$a(Uo3$a uo3$a, mZ0 mZ02, f80_0 f80_02) {
        this.b = uo3$a;
        this.c = mZ02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Uo3$a uo3$a = this.b;
        mZ0 mZ02 = this.c;
        object = new Uo3$a$a(uo3$a, mZ02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Uo3$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Uo3$a$a)object).invokeSuspend(object2);
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
            mZ0 mZ02 = this.c;
            object = ((i0_0)object).P(mZ02, this);
            if (object != j90_02) return object;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return object;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

