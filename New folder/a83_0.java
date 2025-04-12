/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from a83
 */
public final class a83_0
extends Lambda
implements Function2 {
    public final /* synthetic */ D73 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ i13 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ float j;
    public final /* synthetic */ int k;

    public a83_0(D73 d73, LP1 lP1, boolean bl2, i13 i132, long l2, long l3, long l4, float f5, int n3) {
        this.c = d73;
        this.d = lP1;
        this.e = bl2;
        this.f = i132;
        this.g = l2;
        this.h = l3;
        this.i = l4;
        this.j = f5;
        this.k = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.k | 1);
        long l2 = this.g;
        long l3 = this.h;
        D73 d73 = this.c;
        LP1 lP1 = this.d;
        boolean bl2 = this.e;
        i13 i132 = this.f;
        long l4 = this.i;
        float f5 = this.j;
        g83.b(d73, lP1, bl2, i132, l2, l3, l4, f5, (b30_0)object3, n3);
        return Unit.a;
    }
}

