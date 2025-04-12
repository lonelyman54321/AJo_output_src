/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

public final class i12$c
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ List b;

    public i12$c(es0_2 es0_22, ArrayList arrayList) {
        this.a = es0_22;
        this.b = arrayList;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        ArrayList arrayList = (ArrayList)this.b;
        i12$c$a i12$c$a = new i12$c$a((fs0_2)object, arrayList);
        if ((object = this.a.collect(i12$c$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

