/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from os1
 */
public final class os1_0
extends Lambda
implements Function0 {
    public final /* synthetic */ ib3_0 c;
    public final /* synthetic */ ib3_0 d;
    public final /* synthetic */ Function0 e;

    public os1_0(tr1_0 tr1_02, tr1_0 tr1_03, Function0 function0) {
        this.c = tr1_02;
        this.d = tr1_03;
        this.e = function0;
        super(0);
    }

    public final Object invoke() {
        hx0_2 hx0_22 = (hx0_2)this.c.getValue();
        Function1 function1 = (Function1)this.d.getValue();
        int n3 = ((Number)this.e.invoke()).intValue();
        ll2 ll22 = new ll2(hx0_22, function1, n3);
        return ll22;
    }
}

