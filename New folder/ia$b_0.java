/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from IA$b
 */
public final class ia$b_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2 c;
    public final /* synthetic */ xk1_0 d;
    public final /* synthetic */ dl1_1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ IA h;

    public ia$b_0(Ns2 ns2, xk1_0 xk1_02, dl1_1 dl1_12, int n3, int n4, IA iA) {
        this.c = ns2;
        this.d = xk1_02;
        this.e = dl1_12;
        this.f = n3;
        this.g = n4;
        this.h = iA;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (Ns2$a)object;
        bp1_0 bp1_02 = this.e.getLayoutDirection();
        Nc nc = this.h.a;
        int n3 = this.f;
        int n4 = this.g;
        Ns2 ns2 = this.c;
        xk1_0 xk1_02 = this.d;
        HA.b((Ns2$a)object2, ns2, xk1_02, bp1_02, n3, n4, nc);
        return Unit.a;
    }
}

