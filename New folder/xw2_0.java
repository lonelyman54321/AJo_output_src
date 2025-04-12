/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from xW2
 */
public final class xw2_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ yw2_0 b;

    public xw2_0(yw2_0 yw2_02, f80_0 f80_02) {
        this.b = yw2_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yw2_0 yw2_02 = this.b;
        object = new xw2_0(yw2_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (xw2_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xw2_0)object).invokeSuspend(object2);
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
            object = ir0_2.a;
            object = em0_2.b;
            yw2_0 yw2_02 = this.b;
            xW2$a xW2$a = new xW2$a(yw2_02, null);
            this.a = n4;
            object = Ae3.g(this, (CoroutineContext)object, xW2$a);
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

