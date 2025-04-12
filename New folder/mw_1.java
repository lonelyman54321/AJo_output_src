/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from mW
 */
public final class mw_1
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ String b;

    public mw_1(es0_2 es0_22, String string2) {
        this.a = es0_22;
        this.b = string2;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        String string2 = this.b;
        mW$a mW$a = new mW$a((fs0_2)object, string2);
        if ((object = this.a.collect(mW$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

