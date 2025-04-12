/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from hR0
 */
public final class hr0_1
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public hr0_1(es0_2 es0_22) {
        this.a = es0_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        hR0$a hR0$a = new hR0$a((fs0_2)object);
        if ((object = this.a.collect(hR0$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

