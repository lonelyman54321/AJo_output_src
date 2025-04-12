/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from bW2
 */
public final class bw2_0
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public bw2_0(es0_2 es0_22) {
        this.a = es0_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        bw2$a_0 bw2$a_0 = new bw2$a_0((fs0_2)object);
        if ((object = this.a.collect(bw2$a_0, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

