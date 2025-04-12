/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class S50
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public S50(vt0_2 vt0_22) {
        this.a = vt0_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        S50$a s50$a = new S50$a((fs0_2)object);
        if ((object = this.a.collect(s50$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

