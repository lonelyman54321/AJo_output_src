/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from sj
 */
public final class sj_0
extends Lambda
implements Function2 {
    public final /* synthetic */ gx0_2 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public sj_0(gx0_2 gx0_22, LP1 lP1, Function1 function1, int n3) {
        this.c = gx0_22;
        this.d = lP1;
        this.e = function1;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        Function1 function1 = this.e;
        gx0_2 gx0_22 = this.c;
        LP1 lP1 = this.d;
        Aj.a(gx0_22, lP1, function1, (b30_0)object, n3);
        return Unit.a;
    }
}

