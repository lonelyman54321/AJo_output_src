/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.focus.c;
import com.ril.ajio.R$drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Eb2
 */
public final class eb2_1
implements gx0_2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function2 d;

    public eb2_1(boolean bl2, String string2, Function0 function0, u10 u102) {
        this.a = bl2;
        this.b = string2;
        this.c = function0;
        this.d = u102;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4;
        eb2_1 eb2_12 = this;
        int n3 = 1;
        float f5 = Float.MIN_VALUE;
        int n4 = 0;
        float f6 = 0.0f;
        Object object5 = null;
        Object object6 = object;
        object6 = (PA)object;
        Object object7 = object2;
        object7 = (b30_0)object2;
        Object object8 = object3;
        object8 = (Number)object3;
        int n7 = ((Number)object8).intValue();
        Object object9 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object6, (String)object9);
        int n8 = n7 & 0x51;
        int n10 = 16;
        if (n8 == n10 && (n8 = (int)(object7.h() ? 1 : 0)) != 0) {
            object7.D();
            return Unit.a;
        }
        object6 = LP1$a.b;
        object8 = zp.c;
        object9 = Nc$a.m;
        object8 = oZ.a((zp$l)object8, (Gx$a)object9, (b30_0)object7, 0);
        int n14 = object7.F();
        Object object10 = object7.m();
        Object object11 = a30_0.c((b30_0)object7, (LP1)object6);
        N20.W.getClass();
        Object object12 = N20$a.b;
        Object object13 = object7.i();
        boolean bl2 = object13 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        object7.A();
        bl2 = object7.e();
        if (bl2) {
            object7.C((Function0)object12);
        } else {
            object7.n();
        }
        Object object14 = N20$a.e;
        Ow3.a((b30_0)object7, object8, (Function2)object14);
        Object object15 = N20$a.d;
        Ow3.a((b30_0)object7, object10, (Function2)object15);
        Object object16 = N20$a.f;
        n7 = (int)(object7.e() ? 1 : 0);
        if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object8 = object7.v(), object10 = Integer.valueOf(n14)) ? 1 : 0)) == 0) {
            re0_0.a(n14, (b30_0)object7, n14, (N20$a$a)object16);
        }
        object13 = N20$a.c;
        Ow3.a((b30_0)object7, object11, (Function2)object13);
        n7 = 8;
        float f7 = 1.1E-44f;
        float f8 = n7;
        object8 = h.e((LP1)object6, f8);
        float f11 = 1.0f;
        object8 = j.c((LP1)object8, f11);
        object9 = HA.e(Nc$a.e, false);
        int n15 = object7.F();
        Object object17 = object7.m();
        object8 = a30_0.c((b30_0)object7, (LP1)object8);
        Object object18 = object7.i();
        int n16 = object18 instanceof mp;
        if (n16 == 0) {
            s20.a();
            throw null;
        }
        object7.A();
        n16 = object7.e();
        if (n16 != 0) {
            object7.C((Function0)object12);
        } else {
            object7.n();
        }
        Ow3.a((b30_0)object7, object9, (Function2)object14);
        Ow3.a((b30_0)object7, object17, (Function2)object15);
        n14 = (int)(object7.e() ? 1 : 0);
        if (n14 != 0 || (n14 = (int)(Intrinsics.areEqual(object9 = object7.v(), object18 = Integer.valueOf(n15)) ? 1 : 0)) == 0) {
            re0_0.a(n15, (b30_0)object7, n15, (N20$a$a)object16);
        }
        Ow3.a((b30_0)object7, object8, (Function2)object13);
        n7 = R$drawable.ic_close;
        object8 = km2.a(n7, (b30_0)object7, 0);
        object9 = h.e((LP1)object6, f8);
        f11 = -5.180683E-14f;
        object7.K(-1452715723);
        object17 = eb2_12.b;
        n15 = (int)(object7.J(object17) ? 1 : 0);
        object18 = object7.v();
        Xp1$a xp1$a = object12;
        object12 = b30$a.a;
        if (n15 != 0 || object18 == object12) {
            object18 = new q21_0(object17, n3);
            object7.o(object18);
        }
        object18 = (Function1)object18;
        object7.E();
        object9 = CY2.b((LP1)object9, false, (Function1)object18);
        f11 = -5.182326E-14f;
        object7.K(-1452710873);
        object18 = eb2_12.c;
        n15 = (int)(object7.J(object18) ? 1 : 0);
        Object object19 = object7.v();
        if (n15 != 0 || object19 == object12) {
            object19 = new zb2_2(object18, 0);
            object7.o(object19);
        }
        object19 = (Function0)object19;
        object7.E();
        n15 = 7;
        f11 = 9.8E-45f;
        object10 = androidx.compose.foundation.d.b((LP1)object9, false, null, (Function0)object19, n15);
        n3 = 56;
        f5 = 7.8E-44f;
        int n17 = 120;
        object9 = "";
        float f12 = f8;
        boolean bl3 = false;
        object11 = null;
        f8 = 0.0f;
        Object object20 = object13;
        bl2 = false;
        object13 = null;
        N20$a$a n20$a$a = object16;
        int n18 = 0;
        object16 = null;
        N20$a$d n20$a$d = object15;
        int n19 = 0;
        object15 = null;
        N20$a$b n20$a$b = object14;
        object14 = object7;
        Object object21 = object18;
        n16 = n3;
        object5 = object12;
        object19 = xp1$a;
        int n20 = n17;
        Pd1.a((im2)object8, (String)object9, (LP1)object10, null, null, 0.0f, null, (b30_0)object7, n3, n17);
        object7.p();
        n7 = -1872031033;
        f7 = -4.6360044E-29f;
        object7.K(n7);
        object8 = object7.v();
        if (object8 == object12) {
            object8 = new ou0_0();
            object7.o(object8);
        }
        object8 = (ou0_0)object8;
        object7.E();
        object9 = FocusableKt.b(androidx.compose.ui.focus.c.a((LP1)object6, (ou0_0)object8), false, 3);
        long l2 = OX.f;
        n15 = 12;
        f11 = 1.7E-44f;
        f8 = n15;
        object10 = SP2.b(f8, f8, 0.0f, 0.0f, n15);
        object9 = androidx.compose.foundation.a.b((LP1)object9, l2, (i13)object10);
        object10 = new Object();
        n20 = 6;
        bl3 = false;
        f8 = 0.0f;
        object11 = null;
        object16 = null;
        object9 = androidx.compose.foundation.d.b((LP1)object9, false, null, (Function0)object10, n20);
        n19 = 1;
        object10 = new n6_0(n19);
        object9 = CY2.b((LP1)object9, false, (Function1)object10);
        object10 = Nc$a.a;
        object15 = HA.e((Nc)object10, false);
        n18 = object7.F();
        object12 = object7.m();
        object9 = a30_0.c((b30_0)object7, (LP1)object9);
        object13 = object7.i();
        bl2 = object13 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        object7.A();
        bl2 = object7.e();
        if (bl2) {
            object7.C((Function0)object19);
        } else {
            object7.n();
        }
        object13 = n20$a$b;
        Ow3.a((b30_0)object7, object15, n20$a$b);
        object15 = n20$a$d;
        Ow3.a((b30_0)object7, object12, n20$a$d);
        n20 = (int)(object7.e() ? 1 : 0);
        if (n20 != 0 || !(bl3 = Intrinsics.areEqual(object12 = object7.v(), object11 = Integer.valueOf(n18)))) {
            object11 = n20$a$a;
            re0_0.a(n18, (b30_0)object7, n18, n20$a$a);
            object16 = object20;
        } else {
            object16 = object20;
            object11 = n20$a$a;
        }
        Ow3.a((b30_0)object7, object9, (Function2)object16);
        n14 = 0;
        float f14 = 0.0f;
        object12 = 0;
        eb2_12.d.invoke(object7, object12);
        object7.p();
        object9 = Unit.a;
        n20 = -1872013846;
        object7.K(n20);
        object12 = object7.v();
        if (object12 == object5) {
            object4 = object17;
            n10 = 0;
            object17 = null;
            object12 = new db2_2((ou0_0)object8, null);
            object7.o(object12);
        } else {
            object4 = object17;
        }
        object12 = (Function2)object12;
        object7.E();
        ly0_0.d((b30_0)object7, object9, (Function2)object12);
        f7 = -4.643638E-29f;
        object7.K(-1872005666);
        n7 = (int)(eb2_12.a ? 1 : 0);
        if (n7 != 0) {
            object8 = fg2_1.a;
            object8 = androidx.compose.foundation.a.b((LP1)object6, l2, (i13)object8);
            f14 = 16;
            n20 = 2;
            object8 = h.g((LP1)object8, f14, 0.0f, n20);
            n14 = 0;
            f14 = 0.0f;
            object9 = HA.e((Nc)object10, false);
            n15 = object7.F();
            object12 = object7.m();
            object8 = a30_0.c((b30_0)object7, (LP1)object8);
            object17 = object7.i();
            n10 = object17 instanceof mp;
            if (n10 == 0) {
                s20.a();
                throw null;
            }
            object7.A();
            n10 = (int)(object7.e() ? 1 : 0);
            if (n10 != 0) {
                object7.C((Function0)object19);
            } else {
                object7.n();
            }
            Ow3.a((b30_0)object7, object9, (Function2)object13);
            Ow3.a((b30_0)object7, object12, (Function2)object15);
            n3 = (int)(object7.e() ? 1 : 0);
            if (n3 != 0 || (n3 = (int)(Intrinsics.areEqual(object19 = object7.v(), object9 = Integer.valueOf(n15)) ? 1 : 0)) == 0) {
                re0_0.a(n15, (b30_0)object7, n15, (N20$a$a)object11);
            }
            Ow3.a((b30_0)object7, object8, (Function2)object16);
            n3 = 1065353216;
            f5 = 1.0f;
            object19 = j.c((LP1)object6, f5);
            double d2 = 0.2;
            f7 = (float)d2;
            long l3 = OX.b;
            object11 = SP2.a(f12);
            object19 = gz.a((LP1)object19, f7, l3, (i13)object11);
            object8 = GE.a;
            long l4 = xx_1.e;
            n18 = 6;
            n19 = 14;
            long l7 = 0L;
            object13 = object7;
            object11 = GE.a(l4, l7, (b30_0)object7, n18, n19);
            n7 = -1452663521;
            f7 = -5.1983696E-14f;
            object7.K(n7);
            object8 = object21;
            n14 = (int)(object7.J(object21) ? 1 : 0);
            object10 = object7.v();
            if (n14 != 0 || object10 == object5) {
                object10 = new bb2_0((Function0)object8);
                object7.o(object10);
            }
            object13 = object10;
            object13 = (Function0)object10;
            object7.E();
            n4 = 6;
            f6 = n4;
            object5 = h.e((LP1)object6, f6);
            n7 = 0;
            f7 = 0.0f;
            object8 = null;
            n20 = 0x1B0000;
            n10 = 1;
            object9 = object4;
            object10 = object19;
            object14 = object5;
            object18 = object7;
            vb2.a(false, (String)object4, (LP1)object19, (ol0)object11, (Function0)object13, l2, (LP1)object5, (b30_0)object7, n20, n10);
            object7.p();
        }
        object7.E();
        object7.p();
        return Unit.a;
    }
}

