/*
 * Decompiled with CFR 0.152.
 */
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from xh0
 */
public final class xh0_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ yh0_0 b;

    public xh0_1(yh0_0 yh0_02, f80_0 f80_02) {
        this.b = yh0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yh0_0 yh0_02 = this.b;
        object = new xh0_1(yh0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (xh0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xh0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = this.b.e;
            xh0$a xh0$a = xh0$a.a;
            this.a = n4;
            object = ((ee2_2)object).a.collect(xh0$a, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = new KotlinNothingValueException();
        throw object;
    }
}

