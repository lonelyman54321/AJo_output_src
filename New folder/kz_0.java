/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Kz
 */
public final class kz_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2 c;
    public final /* synthetic */ int d;

    public kz_0(Ns2 ns2, int n3) {
        this.c = ns2;
        this.d = n3;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        Ns2 ns2 = this.c;
        int n3 = this.d;
        Ns2$a.f((Ns2$a)object, ns2, 0, n3);
        return Unit.a;
    }
}

