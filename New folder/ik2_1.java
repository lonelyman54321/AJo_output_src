/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.draw.a;
import com.ril.ajio.R$drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ik2
 */
public final class ik2_1
implements Function2 {
    public final /* synthetic */ la2_0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ String c;

    public ik2_1(la2_0 la2_02, fe2_1 fe2_12, String string2) {
        this.a = la2_02;
        this.b = fe2_12;
        this.c = string2;
    }

    public final Object invoke(Object object, Object object2) {
        block15: {
            block16: {
                block14: {
                    Object object3;
                    Object object4;
                    int n3;
                    int n4;
                    Object object5;
                    Object object6;
                    ik2_1 ik2_12;
                    block13: {
                        ik2_12 = this;
                        object6 = object;
                        object6 = (b30_0)object;
                        object5 = object2;
                        object5 = (Number)object2;
                        n4 = ((Number)object5).intValue() & 0xB;
                        if (n4 != (n3 = 2) || (n4 = (int)(object6.h() ? 1 : 0)) == 0) break block13;
                        object6.D();
                        break block14;
                    }
                    LP1$a lP1$a = LP1$a.b;
                    int n7 = 1065353216;
                    float f5 = 1.0f;
                    object5 = j.c(lP1$a, f5);
                    int n8 = 8;
                    float f6 = 1.1E-44f;
                    float f7 = n8;
                    object5 = h.e((LP1)object5, f7);
                    Object object7 = zp.c;
                    Object object8 = Nc$a.m;
                    float f8 = 0.0f;
                    object7 = oZ.a((zp$l)object7, (Gx$a)object8, (b30_0)object6, 0);
                    int n10 = object6.F();
                    Object object9 = object6.m();
                    object5 = a30_0.c((b30_0)object6, (LP1)object5);
                    N20.W.getClass();
                    Object object10 = N20$a.b;
                    Object object11 = object6.i();
                    int n14 = object11 instanceof mp;
                    if (n14 == 0) break block15;
                    object6.A();
                    n14 = object6.e();
                    if (n14 != 0) {
                        object6.C((Function0)object10);
                    } else {
                        object6.n();
                    }
                    object11 = N20$a.e;
                    Ow3.a((b30_0)object6, object7, (Function2)object11);
                    object7 = N20$a.d;
                    Ow3.a((b30_0)object6, object9, (Function2)object7);
                    object9 = N20$a.f;
                    int n15 = object6.e();
                    if (n15 != 0 || (n15 = Intrinsics.areEqual(object4 = object6.v(), object3 = Integer.valueOf(n10))) == 0) {
                        re0_0.a(n10, (b30_0)object6, n10, (N20$a$a)object9);
                    }
                    object8 = N20$a.c;
                    Ow3.a((b30_0)object6, object5, (Function2)object8);
                    object5 = h.e(j.c(lP1$a, f5), f7);
                    object4 = Nc$a.k;
                    object3 = zp.a;
                    int n16 = 48;
                    float f11 = 6.7E-44f;
                    object4 = iQ2.a((zp$e)object3, (Gx$b)object4, (b30_0)object6, n16);
                    int n17 = object6.F();
                    Object object12 = object6.m();
                    object5 = a30_0.c((b30_0)object6, (LP1)object5);
                    Object object13 = object6.i();
                    n7 = object13 instanceof mp;
                    if (n7 == 0) break block16;
                    object6.A();
                    n7 = (int)(object6.e() ? 1 : 0);
                    if (n7 != 0) {
                        object6.C((Function0)object10);
                    } else {
                        object6.n();
                    }
                    Ow3.a((b30_0)object6, object4, (Function2)object11);
                    Ow3.a((b30_0)object6, object12, (Function2)object7);
                    n8 = (int)(object6.e() ? 1 : 0);
                    if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object7 = object6.v(), object10 = Integer.valueOf(n17)) ? 1 : 0)) == 0) {
                        re0_0.a(n17, (b30_0)object6, n17, (N20$a$a)object9);
                    }
                    Ow3.a((b30_0)object6, object5, (Function2)object8);
                    n4 = R$drawable.ic_yellow_info;
                    object5 = km2.a(n4, (b30_0)object6, 0);
                    n16 = 56;
                    f11 = 7.8E-44f;
                    n7 = 124;
                    f5 = 1.74E-43f;
                    object7 = "Info Icon";
                    n10 = 0;
                    object8 = null;
                    object9 = null;
                    object10 = null;
                    n14 = 0;
                    object11 = null;
                    n15 = 0;
                    object4 = null;
                    object3 = object6;
                    f8 = f5;
                    Pd1.a((im2)object5, (String)object7, null, null, null, 0.0f, null, (b30_0)object6, n16, n7);
                    object12 = ik2_12.a;
                    object5 = ((la2_0)object12).c();
                    String string2 = "";
                    if (object5 == null) {
                        object5 = string2;
                    }
                    tv0_0 tv0_02 = tv0_0.o;
                    av0_0 av0_02 = y20_0.a;
                    n8 = 16;
                    long l2 = Em3.f(n8);
                    long l3 = xx_1.e;
                    f6 = n8;
                    object7 = h.g(lP1$a, f6, 0.0f, n3);
                    int n18 = 0;
                    int n19 = 130960;
                    n15 = 0;
                    object4 = null;
                    long l4 = 0L;
                    object8 = null;
                    float f12 = f7;
                    f7 = 0.0f;
                    n7 = 0;
                    f5 = 0.0f;
                    object13 = null;
                    n10 = 1065353216;
                    long l7 = 0L;
                    object9 = object6;
                    LP1$a lP1$a2 = lP1$a;
                    long l8 = l7;
                    int n20 = 1772976;
                    object = object6;
                    long l12 = l3;
                    float f14 = f12;
                    object3 = tv0_02;
                    object2 = object12;
                    object12 = av0_02;
                    Object object14 = object6;
                    Ll3.b((String)object5, (LP1)object7, l3, l2, null, tv0_02, av0_02, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object6, n20, 0, n19);
                    object6.p();
                    object5 = ((la2_0)object2).b();
                    if (object5 == null) {
                        object5 = string2;
                    }
                    object5 = kk2_2.b((String)object5);
                    n16 = 12;
                    l2 = Em3.f(n16);
                    object8 = lP1$a2;
                    object7 = h.f(lP1$a2, f14, f14);
                    n19 = 0;
                    int n21 = 262064;
                    object4 = null;
                    n17 = 0;
                    f12 = 0.0f;
                    l4 = 0L;
                    f7 = 0.0f;
                    n7 = 0;
                    f5 = 0.0f;
                    l8 = 0L;
                    object14 = null;
                    n18 = 1576368;
                    l12 = l3;
                    object12 = av0_02;
                    Ll3.c((Sl)object5, (LP1)object7, l3, l2, null, null, av0_02, l4, null, null, l8, 0, false, 0, 0, null, null, null, (b30_0)object, n18, 0, n21);
                    object3 = lP1$a2;
                    f11 = f14;
                    object5 = h.e(lP1$a2, f14);
                    f8 = 1.0f;
                    object5 = j.c((LP1)object5, f8);
                    long l14 = xx_1.J;
                    object9 = fg2_1.a;
                    object5 = androidx.compose.foundation.a.b((LP1)object5, l14, (i13)object9);
                    object7 = new b4_0(1);
                    object5 = androidx.compose.ui.draw.a.a((LP1)object5, (Function1)object7);
                    n3 = 12;
                    f6 = n3;
                    object5 = h.e((LP1)object5, f6);
                    object8 = ik2_12.c;
                    object7 = new hk2_1((la2_0)object2, (String)object8);
                    object13 = object;
                    object9 = v10.c(479253729, (fx0_2)object7, (b30_0)object);
                    n14 = 3072;
                    n15 = 6;
                    n8 = 0;
                    f6 = 0.0f;
                    object7 = null;
                    n10 = 0;
                    object8 = null;
                    object10 = object;
                    OA.a((LP1)object5, null, false, (u10)object9, (b30_0)object, n14, n15);
                    object5 = ((la2_0)object2).a();
                    if (object5 == null) {
                        object5 = string2;
                    }
                    l12 = xx_1.h;
                    l2 = Em3.f(n3);
                    object7 = h.e(j.c((LP1)object3, f8), f11);
                    n15 = -20686693;
                    object13.K(n15);
                    object4 = ik2_12.b;
                    n17 = (int)(object13.J(object4) ? 1 : 0);
                    object12 = object13.v();
                    if (n17 != 0 || object12 == (object3 = b30$a.a)) {
                        object4 = (fe2_1)object4;
                        n17 = 0;
                        f12 = 0.0f;
                        object3 = null;
                        object12 = new gk2_1(object4, 0);
                        object13.o(object12);
                    }
                    object12 = (Function0)object12;
                    object13.E();
                    n17 = 0;
                    f12 = 0.0f;
                    f8 = 0.0f;
                    object7 = d.b((LP1)object7, false, null, (Function0)object12, 7);
                    object12 = new Cj3(6);
                    n18 = 0;
                    n19 = 130448;
                    n15 = 0;
                    object4 = null;
                    l4 = 0L;
                    f7 = 0.0f;
                    l8 = 0L;
                    n20 = 1772928;
                    object3 = tv0_02;
                    object14 = object12;
                    object12 = av0_02;
                    Object object15 = object13;
                    object13 = object14;
                    object14 = object15;
                    Ll3.b((String)object5, (LP1)object7, l12, l2, null, tv0_02, av0_02, l4, null, (Cj3)object13, l8, 0, false, 0, 0, null, null, (b30_0)object15, n20, 0, n19);
                    object15.p();
                }
                return Unit.a;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }
}

