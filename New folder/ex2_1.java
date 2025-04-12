/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from ex2
 */
public final class ex2_1
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public ex2_1(es0_2 es0_22) {
        this.a = es0_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        ex2$a ex2$a = new ex2$a((fs0_2)object);
        if ((object = this.a.collect(ex2$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

