/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from vT0
 */
public final class vt0_2
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ Function2 b;

    public vt0_2(es0_2 es0_22, Function2 function2) {
        this.a = es0_22;
        this.b = function2;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        Function2 function2 = this.b;
        vT0$a vT0$a = new vT0$a((fs0_2)object, function2);
        if ((object = this.a.collect(vT0$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

