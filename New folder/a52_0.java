/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from a52
 */
public final class a52_0
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ String b;

    public a52_0(es0_2 es0_22, String string2) {
        this.a = es0_22;
        this.b = string2;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        String string2 = this.b;
        a52$a a52$a = new a52$a((fs0_2)object, string2);
        if ((object = this.a.collect(a52$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

