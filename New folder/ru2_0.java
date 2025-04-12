/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from RU2
 */
public final class ru2_0
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public ru2_0(es0_2 es0_22, String string2, String string3) {
        this.a = es0_22;
        this.b = string2;
        this.c = string3;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        String string2 = this.b;
        String string3 = this.c;
        RU2$a rU2$a = new RU2$a((fs0_2)object, string2, string3);
        if ((object = this.a.collect(rU2$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

