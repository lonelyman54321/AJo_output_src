/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;

/*
 * Renamed from GH3
 */
public final class gh3_1
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ List b;

    public gh3_1(es0_2 es0_22, List list) {
        this.a = es0_22;
        this.b = list;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        List list = this.b;
        GH3$a gH3$a = new GH3$a((fs0_2)object, list);
        if ((object = this.a.collect(gH3$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

