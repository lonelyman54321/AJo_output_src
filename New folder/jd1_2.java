/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from jd1
 */
public final class jd1_2
implements Function2 {
    public final /* synthetic */ ke1_2 a;
    public final /* synthetic */ LP1 b;
    public final /* synthetic */ he1_2 c;
    public final /* synthetic */ Throwable d;
    public final /* synthetic */ int e;

    public /* synthetic */ jd1_2(ke1_2 ke1_22, LP1 lP1, he1_2 he1_22, Throwable throwable, int n3) {
        this.a = ke1_22;
        this.b = lP1;
        this.c = he1_22;
        this.d = throwable;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        int n3 = Me3.b(this.e | 1);
        ke1_2 ke1_22 = this.a;
        LP1 lP1 = this.b;
        he1_2 he1_22 = this.c;
        Throwable throwable = this.d;
        md1_2.a(ke1_22, lP1, he1_22, throwable, (b30_0)object3, n3);
        return Unit.a;
    }
}

