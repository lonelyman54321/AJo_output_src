/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Mh3
 */
public final class mh3_2
extends Lambda
implements Function2 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ LP1 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ wr1_1 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ int l;

    public mh3_2(boolean bl2, ip_0 ip_02, LP1 lP1, boolean bl3, Function2 function2, Function2 function22, wr1_1 wr1_12, long l2, long l3, int n3) {
        this.c = bl2;
        this.d = ip_02;
        this.e = lP1;
        this.f = bl3;
        this.g = function2;
        this.h = function22;
        this.i = wr1_12;
        this.j = l2;
        this.k = l3;
        this.l = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.l | 1);
        wr1_1 wr1_12 = this.i;
        Object object4 = object = this.d;
        object4 = (ip_0)object;
        boolean bl2 = this.c;
        LP1 lP1 = this.e;
        boolean bl3 = this.f;
        Function2 function2 = this.g;
        Function2 function22 = this.h;
        long l2 = this.j;
        long l3 = this.k;
        Uh3.a(bl2, (ip_0)object4, lP1, bl3, function2, function22, wr1_12, l2, l3, (b30_0)object3, n3);
        return Unit.a;
    }
}

