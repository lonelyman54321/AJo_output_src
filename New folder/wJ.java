/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class wJ
implements es0_2 {
    public final /* synthetic */ es0_2 a;

    public wJ(br2_2 br2_22) {
        this.a = br2_22;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        wJ$a wJ$a = new wJ$a((fs0_2)object);
        if ((object = this.a.collect(wJ$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

