/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from OU2
 */
public final class ou2_0
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public ou2_0(nu2_0 nu2_02) {
        this.a = nu2_02;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        OU2$a oU2$a = new OU2$a((fs0_2)object);
        if ((object = this.a.collect(oU2$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

