/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class Y40
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public Y40(kb3_2 kb3_22) {
        this.a = kb3_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        Y40$a y40$a = new Y40$a((fs0_2)object);
        if ((object = this.a.collect(y40$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

