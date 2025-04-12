/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from qx2
 */
public final class qx2_2
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public qx2_2(es0_2 es0_22) {
        this.a = es0_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        qx2$a_0 qx2$a_0 = new qx2$a_0((fs0_2)object);
        if ((object = this.a.collect(qx2$a_0, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

