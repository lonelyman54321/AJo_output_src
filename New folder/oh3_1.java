/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Oh3
 */
public final class oh3_1
extends Lambda
implements Function2 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ LP1 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ wr1_1 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ gx0_2 j;
    public final /* synthetic */ int k;

    public oh3_1(boolean bl2, ip_0 ip_02, LP1 lP1, boolean bl3, wr1_1 wr1_12, long l2, long l3, u10 u102, int n3) {
        this.c = bl2;
        this.d = ip_02;
        this.e = lP1;
        this.f = bl3;
        this.g = wr1_12;
        this.h = l2;
        this.i = l3;
        this.j = u102;
        this.k = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.k | 1);
        Object object4 = object = this.d;
        object4 = (ip_0)object;
        Object object5 = object = this.j;
        object5 = (u10)object;
        boolean bl2 = this.c;
        LP1 lP1 = this.e;
        boolean bl3 = this.f;
        wr1_1 wr1_12 = this.g;
        long l2 = this.h;
        long l3 = this.i;
        Uh3.b(bl2, (ip_0)object4, lP1, bl3, wr1_12, l2, l3, (u10)object5, (b30_0)object3, n3);
        return Unit.a;
    }
}

