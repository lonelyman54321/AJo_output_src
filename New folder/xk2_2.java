/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from xk2
 */
public final class xk2_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yk2_1 c;
    public final /* synthetic */ AR1 d;

    public xk2_2(yk2_1 yk2_12, AR1 aR1, f80_0 f80_02) {
        this.c = yk2_12;
        this.d = aR1;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yk2_1 yk2_12 = this.c;
        AR1 aR1 = this.d;
        xk2_2 xk2_22 = new xk2_2(yk2_12, aR1, f80_02);
        xk2_22.b = object;
        return xk2_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (x53_0)object;
        object2 = (f80_0)object2;
        object = (xk2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xk2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = (x53_0)this.b;
        throw null;
    }
}

