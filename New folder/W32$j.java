/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class W32$j
extends Lambda
implements Function0 {
    public final /* synthetic */ Function1 c;

    public W32$j(Function1 function1) {
        this.c = function1;
        super(0);
    }

    public final Object invoke() {
        uo2_0 uo2_02 = w32_0.K;
        this.c.invoke(uo2_02);
        Object object = uo2_02.o;
        long l2 = uo2_02.r;
        bp1_0 bp1_02 = uo2_02.t;
        Vo0 vo0 = uo2_02.s;
        uo2_02.u = object = object.a(l2, bp1_02, vo0);
        return Unit.a;
    }
}

