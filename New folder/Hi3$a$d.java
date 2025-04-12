/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Hi3$a$d
extends rl2_2
implements Function2 {
    public int b;
    public /* synthetic */ Object c;

    public Hi3$a$d() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Hi3$a$d hi3$a$d = new rl2_2(2, f80_02);
        hi3$a$d.c = object;
        return hi3$a$d;
    }

    public final Object invoke(Object object, Object object2) {
        object = (ru_0)object;
        object2 = (f80_0)object2;
        object = (Hi3$a$d)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Hi3$a$d)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.b;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = (ru_0)this.c;
            this.b = n4;
            Di3$a di3$a = Di3.a;
            Nv2 nv2 = Nv2.Main;
            object = Di3.e((ru_0)object, nv2, this);
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

