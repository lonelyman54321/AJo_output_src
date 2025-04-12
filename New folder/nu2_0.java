/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from NU2
 */
public final class nu2_0
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public nu2_0(mu2_0 mu2_02) {
        this.a = mu2_02;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        nu2$a_0 nu2$a_0 = new nu2$a_0((fs0_2)object);
        if ((object = this.a.collect(nu2$a_0, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

