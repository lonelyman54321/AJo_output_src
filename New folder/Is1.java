/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.b;
import kotlin.jvm.functions.Function1;

public final class Is1
extends b
implements dt1_0 {
    public final yr1_0 a;

    public Is1(Function1 function1) {
        yr1_0 yr1_02;
        this.a = yr1_02 = new yr1_0();
        function1.invoke(this);
    }

    public final void a(int n3, Function1 function1, Function1 function12, u10 u102) {
        hs1_1 hs1_12 = new hs1_1(function1, function12, u102);
        this.a.a(n3, hs1_12);
    }

    public final void b(Object object, Object object2, gx0_2 gx0_22) {
        is1$a_0 is1$a_0 = object != null ? new is1$a_0(object) : null;
        object = new Is1$b(object2);
        object2 = new Is1$c(gx0_22);
        int n3 = 1;
        gx0_22 = new u10(-1010194746, object2, n3 != 0);
        hs1_1 hs1_12 = new hs1_1(is1$a_0, (Function1)object, (u10)gx0_22);
        this.a.a(n3, hs1_12);
    }

    public final yr1_0 e() {
        return this.a;
    }
}

