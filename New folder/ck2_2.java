/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from Ck2
 */
public final class ck2_2
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ int b;

    public ck2_2(et0_2 et0_22, int n3) {
        this.a = et0_22;
        this.b = n3;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        int n3 = this.b;
        ck2$a_0 ck2$a_0 = new ck2$a_0((fs0_2)object, n3);
        if ((object = this.a.collect(ck2$a_0, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

