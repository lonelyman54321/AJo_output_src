/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class T73$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Ns2 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public T73$a(Ns2 ns2, int n3, Ns2 ns22, int n4, int n7) {
        this.c = ns2;
        this.d = n3;
        this.e = ns22;
        this.f = n4;
        this.g = n7;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        Ns2 ns2 = this.c;
        int n3 = this.d;
        Ns2$a.f((Ns2$a)object, ns2, 0, n3);
        ns2 = this.e;
        int n4 = this.f;
        n3 = this.g;
        Ns2$a.f((Ns2$a)object, ns2, n4, n3);
        return Unit.a;
    }
}

