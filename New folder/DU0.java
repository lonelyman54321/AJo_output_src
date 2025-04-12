/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public final class DU0
extends LP1$c {
    public wr1_1 n;
    public rt0_0 o;

    public final boolean g1() {
        return false;
    }

    public final void r1(wr1_1 wr1_12, kj1 kj12) {
        boolean bl2 = this.m;
        if (bl2) {
            Object object;
            Object object2 = (c80)this.f1();
            i$a i$a = i$a.a;
            object2 = (i)((c80)object2).a.get(i$a);
            i$a = null;
            if (object2 != null) {
                object = new DU0$b(wr1_12, kj12);
                object2 = object2.G((Function1)object);
            } else {
                bl2 = false;
                object2 = null;
            }
            object = this.f1();
            DU0$a dU0$a = new DU0$a(wr1_12, kj12, (fr0_1)object2, null);
            int n3 = 3;
            Ae3.d((i90_0)object, null, null, dU0$a, n3);
        } else {
            wr1_12.c(kj12);
        }
    }
}

