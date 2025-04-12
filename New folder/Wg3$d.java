/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Wg3$d
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ wg3_2 b;

    public Wg3$d(wg3_2 wg3_22, f80_0 f80_02) {
        this.b = wg3_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wg3_2 wg3_22 = this.b;
        object = new Wg3$d(wg3_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Wg3$d)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Wg3$d)object).invokeSuspend(object2);
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
            Function2 function2 = ((wg3_2)object).q;
            this.a = n4;
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

