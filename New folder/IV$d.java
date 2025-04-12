/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class IV$d
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ Function1 d;

    public IV$d(f80_0 f80_02, tr1_0 tr1_02, Function1 function1) {
        this.c = tr1_02;
        this.d = function1;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tr1_0 tr1_02 = this.c;
        Function1 function1 = this.d;
        IV$d iV$d = new IV$d(f80_02, tr1_02, function1);
        iV$d.b = object;
        return iV$d;
    }

    public final Object invoke(Object object, Object object2) {
        object = (hw2_0)object;
        object2 = (f80_0)object2;
        object = (IV$d)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((IV$d)object).invokeSuspend(object2);
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
            object = (hw2_0)this.b;
            tr1_0 tr1_02 = this.c;
            Function1 function1 = this.d;
            IV$d$a iV$d$a = new IV$d$a(tr1_02, function1);
            this.a = n4;
            object = Di3.d((hw2_0)object, iV$d$a, this);
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

