/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jf0
 */
public final class jf0_2
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LP1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ gx0_2 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ int i;

    public /* synthetic */ jf0_2(float f5, int n3, int n4, long l2, long l3, u10 u102, gx0_2 gx0_22, LP1 lP1, Function2 function2) {
        this.a = n3;
        this.b = lP1;
        this.c = l2;
        this.d = l3;
        this.e = f5;
        this.f = gx0_22;
        this.g = function2;
        this.h = u102;
        this.i = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        object = this.h;
        Intrinsics.checkNotNullParameter(object, "$tabs");
        int n3 = Me3.b(this.i | 1);
        Function2 function2 = this.g;
        Object object4 = object;
        object4 = (u10)object;
        int n4 = this.a;
        LP1 lP1 = this.b;
        long l2 = this.c;
        long l3 = this.d;
        float f5 = this.e;
        gx0_2 gx0_22 = this.f;
        of0_1.a(f5, n4, n3, l2, l3, (u10)object4, (b30_0)object3, gx0_22, lP1, function2);
        return Unit.a;
    }
}

