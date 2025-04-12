/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class tB1$b
extends Lambda
implements Function0 {
    public final /* synthetic */ Ps2 c;
    public final /* synthetic */ tb1_0 d;

    public tB1$b(Ps2 ps2, tb1_0 tb1_02) {
        this.c = ps2;
        this.d = tb1_02;
        super(0);
    }

    public final Object invoke() {
        Function1 function1 = this.c.a.k();
        if (function1 != null) {
            tb1_0 tb1_02 = this.d;
            tb1_02.getClass();
            vb1_0 vb1_02 = new vb1_0(tb1_02);
            function1.invoke(vb1_02);
        }
        return Unit.a;
    }
}

