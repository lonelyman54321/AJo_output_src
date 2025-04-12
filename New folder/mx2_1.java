/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from mx2
 */
public final class mx2_1
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public mx2_1(es0_2 es0_22) {
        this.a = es0_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        mx2$a_0 mx2$a_0 = new mx2$a_0((fs0_2)object);
        if ((object = this.a.collect(mx2$a_0, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

