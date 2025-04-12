/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class fi1$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public fi1$a(int n3, int n4, Ns2 ns2) {
        this.c = ns2;
        this.d = n3;
        this.e = n4;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        Ns2 ns2 = this.c;
        int n3 = this.d;
        int n4 = this.e;
        Ns2$a.d((Ns2$a)object, ns2, n3, n4);
        return Unit.a;
    }
}

