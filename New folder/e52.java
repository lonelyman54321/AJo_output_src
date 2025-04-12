/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

public final class e52
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ List b;

    public e52(es0_2 es0_22, ArrayList arrayList) {
        this.a = es0_22;
        this.b = arrayList;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        ArrayList arrayList = (ArrayList)this.b;
        e52$a e52$a = new e52$a((fs0_2)object, arrayList);
        if ((object = this.a.collect(e52$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

