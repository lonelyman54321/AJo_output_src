/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class Tg1$a
extends qg3_2
implements Function1 {
    public int a;
    public final /* synthetic */ Function1 b;

    public Tg1$a(Function1 function1, f80_0 f80_02) {
        this.b = function1;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        Function1 function1 = this.b;
        Tg1$a tg1$a = new Tg1$a(function1, f80_02);
        return tg1$a;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (Tg1$a)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((Tg1$a)object).invokeSuspend(unit);
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
            this.a = n4;
            object = aQ1.a(this.getContext());
            Function1 function1 = this.b;
            object = object.R(function1, this);
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

