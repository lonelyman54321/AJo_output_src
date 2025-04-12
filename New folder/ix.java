/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class ix
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ Sl d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Map g;
    public final /* synthetic */ xm3 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ RU0$a m;
    public final /* synthetic */ UX2 n;
    public final /* synthetic */ gy_1 o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;

    public ix(LP1 lP1, Sl sl, Function1 function1, boolean bl2, Map map2, xm3 xm32, int n3, boolean bl3, int n4, int n7, RU0$a rU0$a, UX2 uX2, gy_1 gy_12, Function1 function12, int n8, int n10) {
        this.c = lP1;
        this.d = sl;
        this.e = function1;
        this.f = bl2;
        this.g = map2;
        this.h = xm32;
        this.i = n3;
        this.j = bl3;
        this.k = n4;
        this.l = n7;
        this.m = rU0$a;
        this.n = uX2;
        this.o = gy_12;
        this.p = function12;
        this.q = n8;
        this.r = n10;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.q | 1);
        int n4 = Me3.b(this.r);
        UX2 uX2 = this.n;
        gy_1 gy_12 = this.o;
        object4 = this.c;
        Sl sl = this.d;
        Function1 function1 = this.e;
        boolean bl2 = this.f;
        Map map2 = this.g;
        xm3 xm32 = this.h;
        int n7 = this.i;
        boolean bl3 = this.j;
        int n8 = this.k;
        int n10 = this.l;
        RU0$a rU0$a = this.m;
        Function1 function12 = this.p;
        dx.c((LP1)object4, sl, function1, bl2, map2, xm32, n7, bl3, n8, n10, rU0$a, uX2, gy_12, function12, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

