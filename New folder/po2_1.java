/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from po2
 */
public final class po2_1
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ oo2_1 b;

    public po2_1(es0_2 es0_22, oo2_1 oo2_12) {
        this.a = es0_22;
        this.b = oo2_12;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        oo2_1 oo2_12 = this.b;
        po2$a_0 po2$a_0 = new po2$a_0((fs0_2)object, oo2_12);
        if ((object = this.a.collect(po2$a_0, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

