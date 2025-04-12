/*
 * Decompiled with CFR 0.152.
 */
import androidx.slidingpanelayout.widget.a;
import kotlin.Unit;

public final class KU0$b
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ a b;

    public KU0$b(es0_2 es0_22, a a2) {
        this.a = es0_22;
        this.b = a2;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        a a2 = this.b;
        KU0$b$a kU0$b$a = new KU0$b$a((fs0_2)object, a2);
        if ((object = this.a.collect(kU0$b$a, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

