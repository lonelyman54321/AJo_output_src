/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class Hy3$d$c
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public Hy3$d$c(es0_2 es0_22) {
        this.a = es0_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        Hy3$d$c$a hy3$d$c$a = new Hy3$d$c$a((fs0_2)object);
        if ((object = this.a.collect(hy3$d$c$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

