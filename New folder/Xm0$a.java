/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

public final class Xm0$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ xm0_0 b;
    public final /* synthetic */ aS1 c;
    public final /* synthetic */ Function2 d;

    public Xm0$a(xm0_0 xm0_02, aS1 aS12, Function2 function2, f80_0 f80_02) {
        this.b = xm0_02;
        this.c = aS12;
        this.d = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        aS1 aS12 = this.c;
        Function2 function2 = this.d;
        xm0_0 xm0_02 = this.b;
        object = new Xm0$a(xm0_02, aS12, function2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Xm0$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Xm0$a)object).invokeSuspend(object2);
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
            object = this.b;
            gS1 gS12 = ((xm0_0)object).c;
            Function2 function2 = this.d;
            Xm0$a$a xm0$a$a = new Xm0$a$a((xm0_0)object, function2, null);
            this.a = n4;
            gS12.getClass();
            aS1 aS12 = this.c;
            Xm0$b xm0$b = ((xm0_0)object).b;
            function2 = new fs1_0(aS12, gS12, xm0$a$a, xm0$b, null);
            object = kotlinx.coroutines.d.c(function2, this);
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

