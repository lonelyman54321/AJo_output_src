/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;

/*
 * Renamed from N23
 */
public final class n23_0
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ List b;

    public n23_0(es0_2 es0_22, List list) {
        this.a = es0_22;
        this.b = list;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        List list = this.b;
        n23$a_0 n23$a_0 = new n23$a_0((fs0_2)object, list);
        if ((object = this.a.collect(n23$a_0, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

