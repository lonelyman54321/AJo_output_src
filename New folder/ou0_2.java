/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Ou0
 */
public final class ou0_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function0 c;

    public ou0_2(Function0 function0, f80_0 f80_02) {
        this.c = function0;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function0 function0 = this.c;
        ou0_2 ou0_22 = new ou0_2(function0, f80_02);
        ou0_22.b = object;
        return ou0_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (hw2_0)object;
        object2 = (f80_0)object2;
        object = (ou0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ou0_2)object).invokeSuspend(object2);
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
            Function0 function0 = this.c;
            Ou0$a ou0$a = new Ou0$a(function0);
            this.a = n4;
            object = Di3.d((hw2_0)object, ou0$a, this);
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

