/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from df3$a
 */
public final class df3$a_1
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public df3$a_1(int n3, int n4, Ns2 ns2) {
        this.c = ns2;
        this.d = n3;
        this.e = n4;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        int n3 = -this.d;
        int n4 = -this.e;
        Ns2 ns2 = this.c;
        Ns2$a.d((Ns2$a)object, ns2, n3, n4);
        return Unit.a;
    }
}

