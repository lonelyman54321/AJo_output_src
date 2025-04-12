/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class O23
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ int b;

    public O23(es0_2 es0_22, int n3) {
        this.a = es0_22;
        this.b = n3;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        int n3 = this.b;
        O23$a o23$a = new O23$a((fs0_2)object, n3);
        if ((object = this.a.collect(o23$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

