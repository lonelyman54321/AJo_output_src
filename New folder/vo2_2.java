/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from vo2
 */
public final class vo2_2
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public vo2_2(es0_2 es0_22) {
        this.a = es0_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        vo2$a vo2$a = new vo2$a((fs0_2)object);
        if ((object = this.a.collect(vo2$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

