/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class Tb
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public Tb(es0_2 es0_22) {
        this.a = es0_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        Tb$a tb$a = new Tb$a((fs0_2)object);
        if ((object = this.a.collect(tb$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

