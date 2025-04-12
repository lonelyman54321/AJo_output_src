/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from g60
 */
public final class g60_0
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public g60_0(kb3_2 kb3_22) {
        this.a = kb3_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        g60$a_0 g60$a_0 = new g60$a_0((fs0_2)object);
        if ((object = this.a.collect(g60$a_0, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

