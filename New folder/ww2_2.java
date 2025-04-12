/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from Ww2
 */
public final class ww2_2
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public ww2_2(es0_2 es0_22) {
        this.a = es0_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        Ww2$a ww2$a = new Ww2$a((fs0_2)object);
        if ((object = this.a.collect(ww2$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

