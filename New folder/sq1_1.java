/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Sq1
 */
public final class sq1_1
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ qr1_0 d;
    public final /* synthetic */ mr1_2 e;
    public final /* synthetic */ mk2_0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ TR0 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ zp$l j;
    public final /* synthetic */ zp$e k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public sq1_1(LP1 lP1, qr1_0 qr1_02, mr1_2 mr1_22, mk2_0 mk2_02, boolean bl2, TR0 tR0, boolean bl3, zp$l zp$l, zp$e zp$e, Function1 function1, int n3, int n4) {
        this.c = lP1;
        this.d = qr1_02;
        this.e = mr1_22;
        this.f = mk2_02;
        this.g = bl2;
        this.h = tR0;
        this.i = bl3;
        this.j = zp$l;
        this.k = zp$e;
        this.l = function1;
        this.m = n3;
        this.n = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.m | 1);
        int n4 = Me3.b(this.n);
        boolean bl2 = this.i;
        zp$l zp$l = this.j;
        LP1 lP1 = this.c;
        qr1_0 qr1_02 = this.d;
        mr1_2 mr1_22 = this.e;
        mk2_0 mk2_02 = this.f;
        boolean bl3 = this.g;
        TR0 tR0 = this.h;
        zp$e zp$e = this.k;
        Function1 function1 = this.l;
        Yq1.a(lP1, qr1_02, mr1_22, mk2_02, bl3, tR0, bl2, zp$l, zp$e, function1, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

