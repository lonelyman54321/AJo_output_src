/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Ns1
extends Lambda
implements Function0 {
    public final /* synthetic */ ib3_0 c;

    public Ns1(tr1_0 tr1_02) {
        this.c = tr1_02;
        super(0);
    }

    public final Object invoke() {
        Function1 function1 = (Function1)this.c.getValue();
        Is1 is1 = new Is1(function1);
        return is1;
    }
}

