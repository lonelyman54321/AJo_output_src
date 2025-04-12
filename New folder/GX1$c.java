/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class GX1$c
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ wx1_1 b;

    public GX1$c(es0_2 es0_22, wx1_1 wx1_12) {
        this.a = es0_22;
        this.b = wx1_12;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        wx1_1 wx1_12 = this.b;
        GX1$c$a gX1$c$a = new GX1$c$a((fs0_2)object, wx1_12);
        if ((object = this.a.collect(gX1$c$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

