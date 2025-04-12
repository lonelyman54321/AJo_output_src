/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;

public final class Al0$a$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Al0$a b;

    public Al0$a$a(Al0$a al0$a, f80_0 f80_02) {
        this.b = al0$a;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Al0$a al0$a = this.b;
        object = new Al0$a$a(al0$a, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Al0$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Al0$a$a)object).invokeSuspend(object2);
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
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            Ref$IntRef ref$IntRef3 = new Ref$IntRef();
            Al0$a al0$a = this.b;
            i23_0 i23_02 = al0$a.n.b();
            Al0$a$a$a al0$a$a$a = new Al0$a$a$a(ref$IntRef, ref$IntRef2, ref$IntRef3, al0$a);
            this.a = n4;
            i23_02.getClass();
            j90_0 j90_03 = i23_0.l(i23_02, al0$a$a$a, this);
            if (j90_03 != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw illegalStateException;
    }
}

