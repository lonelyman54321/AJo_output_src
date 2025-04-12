/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from lP1$a
 */
public final class lp1$a_0
extends Lambda
implements Function1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Ns2 d;
    public final /* synthetic */ int e;

    public lp1$a_0(int n3, int n4, Ns2 ns2) {
        this.c = n3;
        this.d = ns2;
        this.e = n4;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        Ns2 ns2 = this.d;
        int n3 = ns2.a;
        float f5 = this.c - n3;
        float f6 = 2.0f;
        n3 = ok1_1.b(f5 / f6);
        int n4 = ns2.b;
        int n7 = ok1_1.b((float)(this.e - n4) / f6);
        Ns2$a.d((Ns2$a)object, ns2, n3, n7);
        return Unit.a;
    }
}

