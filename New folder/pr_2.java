/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;

/*
 * Renamed from PR
 */
public final class pr_2
extends or_2 {
    public pr_2(es0_2 es0_22, CoroutineContext coroutineContext, int n3, he_2 he_22, int n4) {
        int n7 = n4 & 2;
        if (n7 != 0) {
            coroutineContext = f.a;
        }
        if ((n7 = n4 & 4) != 0) {
            n3 = -3;
        }
        if ((n4 &= 8) != 0) {
            he_22 = he_2.SUSPEND;
        }
        super(n3, he_22, es0_22, coroutineContext);
    }

    public final ir_2 h(CoroutineContext coroutineContext, int n3, he_2 he_22) {
        es0_2 es0_22 = this.d;
        pr_2 pr_22 = new or_2(n3, he_22, es0_22, coroutineContext);
        return pr_22;
    }

    public final es0_2 i() {
        return this.d;
    }

    public final Object k(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.d;
        if ((object = es0_22.collect((fs0_2)object, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

