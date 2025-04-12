/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from W03
 */
public final class w03_0
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ is2_2 b;
    public final /* synthetic */ Function2 c;

    public w03_0(Function2 function2, f80_0 f80_02) {
        this.c = function2;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object3 = (f80_0)object3;
        Function2 function2 = this.c;
        object2 = new w03_0(function2, (f80_0)object3);
        ((w03_0)object2).b = object;
        object = Unit.a;
        return ((w03_0)object2).invokeSuspend(object);
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
            Function2 function2 = this.c;
            object = function2.invoke(object, this);
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

