/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class dx$c
extends Lambda
implements Function2 {
    public final /* synthetic */ Sl c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ xm3 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Map k;
    public final /* synthetic */ gy_1 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public dx$c(Sl sl, LP1 lP1, xm3 xm32, Function1 function1, int n3, boolean bl2, int n4, int n7, Map map2, gy_1 gy_12, int n8, int n10) {
        this.c = sl;
        this.d = lP1;
        this.e = xm32;
        this.f = function1;
        this.g = n3;
        this.h = bl2;
        this.i = n4;
        this.j = n7;
        this.k = map2;
        this.l = gy_12;
        this.m = n8;
        this.n = n10;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.m | 1);
        Map map2 = this.k;
        gy_1 gy_12 = this.l;
        Sl sl = this.c;
        LP1 lP1 = this.d;
        xm3 xm32 = this.e;
        Function1 function1 = this.f;
        int n4 = this.g;
        boolean bl2 = this.h;
        int n7 = this.i;
        int n8 = this.j;
        int n10 = this.n;
        dx.a(sl, lP1, xm32, function1, n4, bl2, n7, n8, map2, gy_12, (b30_0)object3, n3, n10);
        return Unit.a;
    }
}

