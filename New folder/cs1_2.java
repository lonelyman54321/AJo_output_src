/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from cs1
 */
public final class cs1_2
extends Lambda
implements Function2 {
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ xs1 e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ int g;

    public cs1_2(hn1_2 hn1_22, LP1 lP1, xs1 xs12, Function2 function2, int n3) {
        this.c = hn1_22;
        this.d = lP1;
        this.e = xs12;
        this.f = function2;
        this.g = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.g | 1);
        LP1 lP1 = this.d;
        Object object4 = object = this.c;
        object4 = (hn1_2)object;
        xs1 xs12 = this.e;
        Function2 function2 = this.f;
        ds1_0.a((hn1_2)object4, lP1, xs12, function2, (b30_0)object3, n3);
        return Unit.a;
    }
}

