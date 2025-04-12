/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/*
 * Renamed from kW
 */
public final class kw_2
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ List b;

    public kw_2(es0_2 es0_22, ArrayList arrayList) {
        this.a = es0_22;
        this.b = arrayList;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        ArrayList arrayList = (ArrayList)this.b;
        kw$a_0 kw$a_0 = new kw$a_0((fs0_2)object, arrayList);
        if ((object = this.a.collect(kw$a_0, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

