/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.b;
import kotlin.jvm.functions.Function1;

public final class ll2
extends b {
    public final hx0_2 a;
    public final Function1 b;
    public final yr1_0 c;

    public ll2(hx0_2 hx0_22, Function1 function1, int n3) {
        this.a = hx0_22;
        this.b = function1;
        yr1_0 yr1_02 = new yr1_0();
        al2_0 al2_02 = new al2_0(function1, hx0_22);
        yr1_02.a(n3, al2_02);
        this.c = yr1_02;
    }

    public final yr1_0 e() {
        return this.c;
    }
}

