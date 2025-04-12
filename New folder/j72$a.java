/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j72$a
extends Lambda
implements Function1 {
    public final /* synthetic */ j72 c;
    public final /* synthetic */ Ns2 d;
    public final /* synthetic */ dl1_1 e;

    public j72$a(j72 j722, Ns2 ns2, dl1_1 dl1_12) {
        this.c = j722;
        this.d = ns2;
        this.e = dl1_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        j72 j722 = this.c;
        int n3 = j722.p;
        Ns2 ns2 = this.d;
        dl1_1 dl1_12 = this.e;
        if (n3 != 0) {
            float f5 = j722.n;
            n3 = dl1_12.e0(f5);
            float f6 = j722.o;
            int n4 = dl1_12.e0(f6);
            Ns2$a.f((Ns2$a)object, ns2, n3, n4);
        } else {
            float f7 = j722.n;
            n3 = dl1_12.e0(f7);
            float f8 = j722.o;
            int n7 = dl1_12.e0(f8);
            Ns2$a.d((Ns2$a)object, ns2, n3, n7);
        }
        return Unit.a;
    }
}

