/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from sq
 */
public final class sq_0
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public sq_0(kb3_2 kb3_22) {
        this.a = kb3_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        sq$a sq$a = new sq$a((fs0_2)object);
        if ((object = this.a.collect(sq$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

