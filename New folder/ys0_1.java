/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from yS0
 */
public final class ys0_1
extends Lambda
implements Function2 {
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ wr1_1 e;
    public final /* synthetic */ i13 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Rl0 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ int k;

    public ys0_1(Function0 function0, LP1 lP1, wr1_1 wr1_12, i13 i132, long l2, long l3, Rl0 rl0, u10 u102, int n3) {
        this.c = function0;
        this.d = lP1;
        this.e = wr1_12;
        this.f = i132;
        this.g = l2;
        this.h = l3;
        this.i = rl0;
        this.j = u102;
        this.k = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.k | 1);
        long l2 = this.h;
        Object object4 = object = this.j;
        object4 = (u10)object;
        Function0 function0 = this.c;
        LP1 lP1 = this.d;
        wr1_1 wr1_12 = this.e;
        i13 i132 = this.f;
        long l3 = this.g;
        Rl0 rl0 = this.i;
        zs0_0.b(function0, lP1, wr1_12, i132, l3, l2, rl0, (u10)object4, (b30_0)object3, n3);
        return Unit.a;
    }
}

