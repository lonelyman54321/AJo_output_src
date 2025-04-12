/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from h60
 */
public final class h60_0
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public h60_0(kb3_2 kb3_22) {
        this.a = kb3_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        h60$a h60$a = new h60$a((fs0_2)object);
        if ((object = this.a.collect(h60$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

