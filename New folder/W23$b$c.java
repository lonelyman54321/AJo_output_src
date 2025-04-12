/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class W23$b$c
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ w23_0 b;

    public W23$b$c(es0_2 es0_22, w23_0 w23_02) {
        this.a = es0_22;
        this.b = w23_02;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        w23_0 w23_02 = this.b;
        W23$b$c$a w23$b$c$a = new W23$b$c$a((fs0_2)object, w23_02);
        if ((object = this.a.collect(w23$b$c$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

