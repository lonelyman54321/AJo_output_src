/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from sZ2
 */
public final class sz2_0
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ qZ2 b;

    public sz2_0(es0_2 es0_22, qZ2 qZ22) {
        this.a = es0_22;
        this.b = qZ22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        qZ2 qZ22 = this.b;
        sZ2$a sZ2$a = new sZ2$a((fs0_2)object, qZ22);
        if ((object = this.a.collect(sZ2$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

