/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from jl3
 */
public final class jl3_0
extends Lambda
implements Function2 {
    public final /* synthetic */ ol3 c;
    public final /* synthetic */ Yh1 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ gx0_2 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ jx0_2 i;
    public final /* synthetic */ int j;

    public jl3_0(ol3 ol32, Yh1 yh1, long l2, long l3, lk3$c lk3$c, boolean bl2, u10 u102, int n3) {
        this.c = ol32;
        this.d = yh1;
        this.e = l2;
        this.f = l3;
        this.g = lk3$c;
        this.h = bl2;
        this.i = u102;
        this.j = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.j | 1);
        Object object4 = object = this.g;
        object4 = (lk3$c)object;
        Object object5 = object = this.i;
        object5 = (u10)object;
        ol3 ol32 = this.c;
        Yh1 yh1 = this.d;
        long l2 = this.e;
        long l3 = this.f;
        boolean bl2 = this.h;
        ol32.a(yh1, l2, l3, (lk3$c)object4, bl2, (u10)object5, (b30_0)object3, n3);
        return Unit.a;
    }
}

