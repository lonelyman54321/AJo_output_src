/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class Y23$c
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ w23_0 b;

    public Y23$c(es0_2 es0_22, w23_0 w23_02) {
        this.a = es0_22;
        this.b = w23_02;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        w23_0 w23_02 = this.b;
        Y23$c$a y23$c$a = new Y23$c$a((fs0_2)object, w23_02);
        if ((object = this.a.collect(y23$c$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

