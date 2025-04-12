/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from Z42
 */
public final class z42_0
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public z42_0(es0_2 es0_22) {
        this.a = es0_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        Z42$a z42$a = new Z42$a((fs0_2)object);
        if ((object = this.a.collect(z42$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

