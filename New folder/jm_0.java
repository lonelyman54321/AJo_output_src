/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Jm
 */
public final class jm_0
extends Lambda
implements Function2 {
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ gx0_2 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ float i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public jm_0(float f5, int n3, int n4, long l2, long l3, u10 u102, gx0_2 gx0_22, LP1 lP1, Function2 function2) {
        this.c = u102;
        this.d = lP1;
        this.e = function2;
        this.f = gx0_22;
        this.g = l2;
        this.h = l3;
        this.i = f5;
        this.j = n3;
        this.k = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.j | 1);
        int n4 = this.k;
        Object object4 = object = this.c;
        object4 = (u10)object;
        LP1 lP1 = this.d;
        Function2 function2 = this.e;
        gx0_2 gx0_22 = this.f;
        long l2 = this.g;
        long l3 = this.h;
        Km.c(this.i, n3, n4, l2, l3, (u10)object4, (b30_0)object3, gx0_22, lP1, function2);
        return Unit.a;
    }
}

