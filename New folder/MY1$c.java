/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

public final class MY1$c
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ long c;

    public MY1$c(es0_2 es0_22, ArrayList arrayList, long l2) {
        this.a = es0_22;
        this.b = arrayList;
        this.c = l2;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        ArrayList arrayList = (ArrayList)this.b;
        long l2 = this.c;
        MY1$c$a mY1$c$a = new MY1$c$a((fs0_2)object, arrayList, l2);
        if ((object = this.a.collect(mY1$c$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

