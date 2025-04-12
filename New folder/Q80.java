/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Q80
extends Lambda
implements Function2 {
    public final /* synthetic */ gx0_2 c;
    public final /* synthetic */ Vt1 d;
    public final /* synthetic */ xm3 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Pk3 h;
    public final /* synthetic */ ql3_0 i;
    public final /* synthetic */ EE3 j;
    public final /* synthetic */ LP1 k;
    public final /* synthetic */ LP1 l;
    public final /* synthetic */ LP1 m;
    public final /* synthetic */ LP1 n;
    public final /* synthetic */ MD o;
    public final /* synthetic */ Sk3 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ i72 t;
    public final /* synthetic */ Vo0 u;

    public Q80(gx0_2 gx0_22, Vt1 vt1, xm3 xm32, int n3, int n4, Pk3 pk3, ql3_0 ql3_02, EE3 eE3, LP1 lP1, LP1 lP12, LP1 lP13, LP1 lP14, MD mD, Sk3 sk3, boolean bl2, boolean bl3, Function1 function1, i72 i722, Vo0 vo0) {
        this.c = gx0_22;
        this.d = vt1;
        this.e = xm32;
        this.f = n3;
        this.g = n4;
        this.h = pk3;
        this.i = ql3_02;
        this.j = eE3;
        this.k = lP1;
        this.l = lP12;
        this.m = lP13;
        this.n = lP14;
        this.o = mD;
        this.p = sk3;
        this.q = bl2;
        this.r = bl3;
        this.s = function1;
        this.t = i722;
        this.u = vo0;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Q80 q80 = this;
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        object4 = (Number)object2;
        int n4 = ((Number)object4).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            i72 i722 = q80.t;
            Vo0 vo0 = q80.u;
            Object object5 = q80.d;
            xm3 xm32 = q80.e;
            int n7 = q80.f;
            int n8 = q80.g;
            Pk3 pk3 = q80.h;
            ql3_0 ql3_02 = q80.i;
            EE3 eE3 = q80.j;
            LP1 lP1 = q80.k;
            LP1 lP12 = q80.l;
            LP1 lP13 = q80.m;
            LP1 lP14 = q80.n;
            MD mD = q80.o;
            object = object3;
            Sk3 sk3 = q80.p;
            boolean bl2 = q80.q;
            int n10 = q80.r;
            object3 = q80.s;
            object4 = new P80((Vt1)object5, xm32, n7, n8, pk3, ql3_02, eE3, lP1, lP12, lP13, lP14, mD, sk3, bl2, n10 != 0, (Function1)object3, i722, vo0);
            n10 = 2032502107;
            object3 = v10.c(n10, (fx0_2)object4, (b30_0)object);
            n4 = 6;
            object4 = n4;
            object5 = q80.c;
            object5.invoke(object3, object, object4);
        }
        return Unit.a;
    }
}

