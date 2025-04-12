/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class d52
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public d52(es0_2 es0_22) {
        this.a = es0_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        d52$a d52$a = new d52$a((fs0_2)object);
        if ((object = this.a.collect(d52$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

