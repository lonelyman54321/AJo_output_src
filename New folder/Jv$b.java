/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class Jv$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Cl2 b;
    public final /* synthetic */ Function1 c;

    public Jv$b(hm0_0 hm0_02, Function1 function1, f80_0 f80_02) {
        this.b = hm0_02;
        this.c = function1;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function1 function1 = this.c;
        hm0_0 hm0_02 = (hm0_0)this.b;
        object = new Jv$b(hm0_02, function1, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Jv$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Jv$b)object).invokeSuspend(object2);
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
            Object object2 = (hm0_0)this.b;
            object = new kv_2(object2, 0);
            object = J83.k((Function0)object);
            Function1 function1 = this.c;
            object2 = new Jv$b$a(function1);
            this.a = n4;
            object = ((m0_0)object).collect((fs0_2)object2, this);
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

