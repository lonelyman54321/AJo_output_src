/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yb2
 */
public final class yb2_2
implements gx0_2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function0 e;

    public yb2_2(boolean bl2, String string2, Function0 function0, u10 u102, Function0 function02) {
        this.a = bl2;
        this.b = string2;
        this.c = function0;
        this.d = u102;
        this.e = function02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4;
        block23: {
            long l2;
            float f5;
            int n3;
            Object object5;
            Object object6;
            Object object7;
            float f6;
            Object object8;
            Object object9;
            Object object10;
            Object object11;
            int n4;
            int n7;
            Object object12;
            int n8;
            Object object13;
            Object object14;
            block25: {
                block24: {
                    Integer n10;
                    yb2_2 yb2_22 = this;
                    int n14 = 1;
                    float f7 = Float.MIN_VALUE;
                    object14 = object;
                    object14 = (PA)object;
                    object4 = object2;
                    object4 = (b30_0)object2;
                    object13 = object3;
                    object13 = (Number)object3;
                    n8 = ((Number)object13).intValue();
                    object12 = "$this$BoxWithConstraints";
                    Intrinsics.checkNotNullParameter(object14, (String)object12);
                    n7 = n8 & 0x51;
                    n4 = 16;
                    if (n7 == n4 && (n7 = (int)(object4.h() ? 1 : 0)) != 0) {
                        object4.D();
                        return Unit.a;
                    }
                    object14 = LP1$a.b;
                    object13 = zp.c;
                    object12 = Nc$a.m;
                    int n15 = 0;
                    Object object15 = null;
                    object13 = oZ.a((zp$l)object13, (Gx$a)object12, (b30_0)object4, 0);
                    int n16 = object4.F();
                    object11 = object4.m();
                    object10 = a30_0.c((b30_0)object4, (LP1)object14);
                    N20.W.getClass();
                    Xp1$a xp1$a = N20$a.b;
                    object9 = object4.i();
                    boolean bl2 = object9 instanceof mp;
                    if (!bl2) {
                        s20.a();
                        throw null;
                    }
                    object4.A();
                    bl2 = object4.e();
                    if (bl2) {
                        object4.C(xp1$a);
                    } else {
                        object4.n();
                    }
                    object8 = N20$a.e;
                    Ow3.a((b30_0)object4, object13, (Function2)object8);
                    Object object16 = N20$a.d;
                    Ow3.a((b30_0)object4, object11, (Function2)object16);
                    Object object17 = N20$a.f;
                    n8 = (int)(object4.e() ? 1 : 0);
                    if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object13 = object4.v(), object11 = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
                        re0_0.a(n16, (b30_0)object4, n16, (N20$a$a)object17);
                    }
                    object9 = N20$a.c;
                    Ow3.a((b30_0)object4, object10, (Function2)object9);
                    n8 = 8;
                    f6 = 1.1E-44f;
                    float f8 = n8;
                    object13 = h.e((LP1)object14, f8);
                    float f11 = 1.0f;
                    object13 = j.c((LP1)object13, f11);
                    object12 = HA.e(Nc$a.e, false);
                    int n17 = object4.F();
                    object7 = object4.m();
                    object13 = a30_0.c((b30_0)object4, (LP1)object13);
                    object6 = object4.i();
                    int n18 = object6 instanceof mp;
                    if (n18 == 0) {
                        s20.a();
                        throw null;
                    }
                    object4.A();
                    n18 = object4.e();
                    if (n18 != 0) {
                        object4.C(xp1$a);
                    } else {
                        object4.n();
                    }
                    Ow3.a((b30_0)object4, object12, (Function2)object8);
                    Ow3.a((b30_0)object4, object7, (Function2)object16);
                    n16 = (int)(object4.e() ? 1 : 0);
                    if (n16 != 0 || (n16 = (int)(Intrinsics.areEqual(object12 = object4.v(), object6 = Integer.valueOf(n17)) ? 1 : 0)) == 0) {
                        re0_0.a(n17, (b30_0)object4, n17, (N20$a$a)object17);
                    }
                    Ow3.a((b30_0)object4, object13, (Function2)object9);
                    n8 = R$drawable.ic_close;
                    object13 = km2.a(n8, (b30_0)object4, 0);
                    float f12 = -5.1548355E-14f;
                    object4.K(-1452792011);
                    object7 = yb2_22.b;
                    n16 = (int)(object4.J(object7) ? 1 : 0);
                    object11 = object4.v();
                    object6 = b30$a.a;
                    if (n16 != 0 || object11 == object6) {
                        object11 = new g6_0(object7, n14);
                        object4.o(object11);
                    }
                    object11 = (Function1)object11;
                    object4.E();
                    object12 = h.e(CY2.b((LP1)object14, false, (Function1)object11), f8);
                    n17 = -1452785657;
                    f11 = -5.1569883E-14f;
                    object4.K(n17);
                    object11 = yb2_22.c;
                    int n19 = object4.J(object11);
                    object15 = object4.v();
                    if (n19 != 0 || object15 == object6) {
                        object15 = new n21_0(object11, n14);
                        object4.o(object15);
                    }
                    object15 = (Function0)object15;
                    object4.E();
                    n14 = 7;
                    object3 = object16;
                    object5 = androidx.compose.foundation.d.b((LP1)object12, false, null, (Function0)object15, n14);
                    n15 = 56;
                    n19 = 120;
                    float f14 = 1.68E-43f;
                    object11 = object5;
                    f7 = f8;
                    Object object18 = object9;
                    N20$a$a n20$a$a = object17;
                    int n20 = 0;
                    N20$a$d n20$a$d = object16;
                    int n21 = 0;
                    N20$a$b n20$a$b = object8;
                    object8 = object4;
                    Object object19 = object6;
                    n18 = n15;
                    object15 = xp1$a;
                    n3 = n19;
                    f5 = f14;
                    Pd1.a((im2)object13, "", (LP1)object5, null, null, 0.0f, null, (b30_0)object4, n15, n19);
                    object4.p();
                    long l3 = OX.f;
                    n8 = 12;
                    f6 = 1.7E-44f;
                    f12 = n8;
                    n17 = 0;
                    f11 = 0.0f;
                    object11 = null;
                    object13 = SP2.b(f12, f12, 0.0f, 0.0f, n8);
                    object13 = androidx.compose.foundation.a.b((LP1)object14, l3, (i13)object13);
                    object12 = new Object();
                    n3 = 6;
                    f5 = 8.4E-45f;
                    f8 = 0.0f;
                    object10 = null;
                    object13 = androidx.compose.foundation.d.b((LP1)object13, false, null, (Function0)object12, n3);
                    object12 = Nc$a.a;
                    object17 = HA.e((Nc)object12, false);
                    int n22 = object4.F();
                    object16 = object4.m();
                    object13 = a30_0.c((b30_0)object4, (LP1)object13);
                    object9 = object4.i();
                    bl2 = object9 instanceof mp;
                    if (!bl2) {
                        s20.a();
                        throw null;
                    }
                    object4.A();
                    bl2 = object4.e();
                    if (bl2) {
                        object4.C(xp1$a);
                    } else {
                        object4.n();
                    }
                    object9 = n20$a$b;
                    Ow3.a((b30_0)object4, object17, n20$a$b);
                    object17 = n20$a$d;
                    Ow3.a((b30_0)object4, object16, n20$a$d);
                    n21 = object4.e();
                    if (n21 != 0 || (n21 = Intrinsics.areEqual(object16 = object4.v(), n10 = Integer.valueOf(n22))) == 0) {
                        object16 = n20$a$a;
                        re0_0.a(n22, (b30_0)object4, n22, n20$a$a);
                        object10 = object18;
                    } else {
                        object10 = object18;
                        object16 = n20$a$a;
                    }
                    Ow3.a((b30_0)object4, object13, (Function2)object10);
                    Integer n24 = 0;
                    object13 = yb2_22.d;
                    object13.invoke(object4, n24);
                    object4.p();
                    f6 = -4.6162314E-29f;
                    object4.K(-1872096740);
                    n8 = (int)(yb2_22.a ? 1 : 0);
                    if (n8 == 0) break block23;
                    object13 = fg2_1.a;
                    object13 = androidx.compose.foundation.a.b((LP1)object14, l3, (i13)object13);
                    n3 = 16;
                    f5 = n3;
                    l2 = l3;
                    int n25 = 2;
                    object13 = h.g((LP1)object13, f5, 0.0f, n25);
                    f11 = 0.0f;
                    object11 = null;
                    object12 = HA.e((Nc)object12, false);
                    n17 = object4.F();
                    object8 = object4.m();
                    object13 = a30_0.c((b30_0)object4, (LP1)object13);
                    object6 = object4.i();
                    n18 = object6 instanceof mp;
                    if (n18 == 0) {
                        s20.a();
                        throw null;
                    }
                    object4.A();
                    n18 = (int)(object4.e() ? 1 : 0);
                    if (n18 != 0) {
                        object4.C((Function0)object15);
                    } else {
                        object4.n();
                    }
                    Ow3.a((b30_0)object4, object12, (Function2)object9);
                    Ow3.a((b30_0)object4, object8, (Function2)object17);
                    n16 = (int)(object4.e() ? 1 : 0);
                    if (n16 != 0 || (n16 = (int)(Intrinsics.areEqual(object12 = object4.v(), object9 = Integer.valueOf(n17)) ? 1 : 0)) == 0) {
                        re0_0.a(n17, (b30_0)object4, n17, (N20$a$a)object16);
                    }
                    Ow3.a((b30_0)object4, object13, (Function2)object10);
                    object13 = j.c((LP1)object14, 1.0f);
                    double d2 = 0.2;
                    f12 = (float)d2;
                    long l4 = OX.b;
                    object5 = SP2.a(f7);
                    object5 = gz.a((LP1)object13, f12, l4, (i13)object5);
                    object13 = GE.a;
                    long l7 = xx_1.e;
                    n20 = 6;
                    n21 = 14;
                    l4 = 0L;
                    object9 = object4;
                    object10 = GE.a(l7, l4, (b30_0)object4, n20, n21);
                    n8 = -1452754595;
                    f6 = -5.1675125E-14f;
                    object4.K(n8);
                    object13 = yb2_22.e;
                    n16 = (int)(object4.J(object13) ? 1 : 0);
                    object11 = object4.v();
                    if (n16 != 0) break block24;
                    object12 = object19;
                    if (object11 != object19) break block25;
                }
                object11 = new xb2_2((Function0)object13);
                object4.o(object11);
            }
            object9 = object11;
            object9 = (Function0)object11;
            object4.E();
            f6 = 6;
            object8 = h.e((LP1)object14, f6);
            n8 = 0;
            f6 = 0.0f;
            object13 = null;
            n3 = 0x1B0000;
            f5 = 2.479558E-39f;
            n7 = 1;
            object12 = object7;
            object11 = object5;
            object6 = object4;
            n4 = n7;
            vb2.a(false, (String)object7, (LP1)object5, (ol0)object10, (Function0)object9, l2, (LP1)object8, (b30_0)object4, n3, n7);
            object4.p();
        }
        object4.E();
        object4.p();
        return Unit.a;
    }
}

