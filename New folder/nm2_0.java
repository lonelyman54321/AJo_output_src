/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.services.data.dresstool.ApplicableStyle;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nM2
 */
public final class nm2_0
implements hx0_2 {
    public final /* synthetic */ aM2$d a;
    public final /* synthetic */ LP1 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ rp2_0 d;

    public nm2_0(aM2$d aM2$d, LP1 lP1, sz_1 sz_12, rp2_0 rp2_02) {
        this.a = aM2$d;
        this.b = lP1;
        this.c = sz_12;
        this.d = rp2_02;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        block29: {
            block30: {
                block33: {
                    block28: {
                        int n3;
                        Object object5;
                        String string2;
                        Xp1$a xp1$a;
                        Object object6;
                        float f5;
                        int n7;
                        Function1 function1;
                        rq2_1 rq2_12;
                        Object object7;
                        int n8;
                        Object object8;
                        Object object9;
                        Object object10;
                        Object object11;
                        long l2;
                        Object object12;
                        b30$a$a b30$a$a;
                        float f6;
                        int n10;
                        Object object13;
                        String string3;
                        float f7;
                        int n14;
                        String string4;
                        int n15;
                        int n16;
                        Object object14;
                        int n17;
                        Object object15;
                        Object object16;
                        Object object17;
                        Object object18;
                        Object object19;
                        block32: {
                            int n18;
                            int n19;
                            Object object20;
                            block31: {
                                float f8;
                                float f11;
                                int n20;
                                int n21;
                                block27: {
                                    object19 = this;
                                    object18 = object;
                                    object18 = (wr1_2)object;
                                    object17 = object2;
                                    object17 = (Number)object2;
                                    n21 = ((Number)object17).intValue();
                                    object16 = object3;
                                    object16 = (b30_0)object3;
                                    object15 = object4;
                                    object15 = (Number)object4;
                                    n17 = ((Number)object15).intValue();
                                    object14 = "$this$items";
                                    Intrinsics.checkNotNullParameter(object18, (String)object14);
                                    n16 = n17 & 0x70;
                                    n20 = 32;
                                    if (n16 == 0) {
                                        n16 = (int)(object16.c(n21) ? 1 : 0);
                                        n16 = n16 != 0 ? 32 : 16;
                                        n17 |= n16;
                                    }
                                    n16 = n17 & 0x2D1;
                                    n15 = 144;
                                    f11 = 2.02E-43f;
                                    if (n16 != n15 || (n16 = (int)(object16.h() ? 1 : 0)) == 0) break block27;
                                    object16.D();
                                    break block28;
                                }
                                object18 = ((nm2_0)object19).a.a.getRecommendedStyles();
                                if ((object18 = (ApplicableStyle)CollectionsKt.N(n21, (List)object18)) == null) break block28;
                                object14 = ((ApplicableStyle)object18).getApplicable_style_name();
                                string4 = null;
                                if (object14 != null) {
                                    n14 = 24;
                                    f7 = 3.4E-44f;
                                    object14 = le3_2.E(n14, (String)object14);
                                } else {
                                    n15 = 0;
                                    object14 = null;
                                    f11 = 0.0f;
                                }
                                string3 = "";
                                object13 = object14 == null ? string3 : object14;
                                f11 = 4.4063982E-38f;
                                object16.K(24111162);
                                object20 = ((nm2_0)object19).c;
                                n15 = (int)(object16.J(object20) ? 1 : 0);
                                n10 = n17 & 0x70;
                                if (n10 == n20) {
                                    n17 = 1;
                                    f6 = Float.MIN_VALUE;
                                } else {
                                    n17 = 0;
                                    f6 = 0.0f;
                                    object15 = null;
                                }
                                object14 = object16.v();
                                b30$a$a = b30$a.a;
                                if ((n17 |= n15) != 0 || object14 == b30$a$a) {
                                    object15 = object20;
                                    object15 = (sz_1)object20;
                                    object14 = new km2_1((sz_1)object15, n21);
                                    object16.o(object14);
                                }
                                object14 = (Function0)object14;
                                object16.E();
                                object15 = x20_0.d(((nm2_0)object19).b, (Function0)object14);
                                n15 = (int)(((ApplicableStyle)object18).isSelected() ? 1 : 0);
                                object12 = LP1$a.b;
                                if (n15 != 0) {
                                    f11 = uq0_0.b;
                                    l2 = yx_1.a;
                                    object14 = oz_0.a(l2, f11);
                                    object11 = ((nm2_0)object19).d;
                                    f8 = ((nz)object14).a;
                                    object14 = ((nz)object14).b;
                                    object10 = new BorderModifierNodeElement(f8, (ZD)object14, (i13)object11);
                                } else {
                                    object10 = object12;
                                }
                                object15 = object15.then((LP1)object10);
                                object14 = Nc$a.k;
                                object10 = zp.a;
                                n19 = 48;
                                object14 = iQ2.a((zp$e)object10, (Gx$b)object14, (b30_0)object16, n19);
                                n14 = object16.F();
                                object11 = object16.m();
                                object15 = a30_0.c((b30_0)object16, (LP1)object15);
                                N20.W.getClass();
                                object9 = N20$a.b;
                                object8 = object16.i();
                                n20 = object8 instanceof mp;
                                if (n20 == 0) break block29;
                                object16.A();
                                n20 = (int)(object16.e() ? 1 : 0);
                                if (n20 != 0) {
                                    object16.C((Function0)object9);
                                } else {
                                    object16.n();
                                }
                                object8 = N20$a.e;
                                Ow3.a((b30_0)object16, object14, (Function2)object8);
                                object14 = N20$a.d;
                                Ow3.a((b30_0)object16, object11, (Function2)object14);
                                object11 = N20$a.f;
                                n18 = object16.e();
                                if (n18 != 0 || (n8 = Intrinsics.areEqual(object7 = object16.v(), object19 = Integer.valueOf(n14))) == 0) {
                                    re0_0.a(n14, (b30_0)object16, n14, (N20$a$a)object11);
                                }
                                object19 = N20$a.c;
                                Ow3.a((b30_0)object16, object15, (Function2)object19);
                                f6 = uq0_0.j;
                                object15 = h.e((LP1)object12, f6);
                                f7 = uq0_0.H;
                                object15 = j.h((LP1)object15, f7);
                                object7 = Nc$a.a;
                                n18 = n21;
                                object17 = null;
                                object7 = HA.e((Nc)object7, false);
                                n21 = object16.F();
                                int n22 = n10;
                                rq2_12 = object16.m();
                                object15 = a30_0.c((b30_0)object16, (LP1)object15);
                                function1 = object20;
                                object20 = object16.i();
                                boolean bl2 = object20 instanceof mp;
                                if (!bl2) break block30;
                                object16.A();
                                bl2 = object16.e();
                                if (bl2) {
                                    object16.C((Function0)object9);
                                } else {
                                    object16.n();
                                }
                                Ow3.a((b30_0)object16, object7, (Function2)object8);
                                Ow3.a((b30_0)object16, rq2_12, (Function2)object14);
                                int n24 = object16.e();
                                if (n24 != 0 || (n24 = Intrinsics.areEqual(object7 = object16.v(), object20 = Integer.valueOf(n21))) == 0) {
                                    re0_0.a(n21, (b30_0)object16, n21, (N20$a$a)object11);
                                }
                                Ow3.a((b30_0)object16, object15, (Function2)object19);
                                object17 = j.h((LP1)object12, f7);
                                float f12 = uq0_0.e;
                                object15 = SP2.a(f12);
                                object17 = QV.a((LP1)object17, (i13)object15);
                                f6 = 2.1580602E-6f;
                                object16.K(907072305);
                                n17 = (int)(object16.J(object13) ? 1 : 0);
                                object10 = object16.v();
                                if (n17 != 0 || object10 == b30$a$a) {
                                    object10 = new lm2_0((String)object13);
                                    object16.o(object10);
                                }
                                object10 = (Function1)object10;
                                object16.E();
                                object7 = null;
                                object15 = CY2.b((LP1)object17, false, (Function1)object10);
                                object17 = ((ApplicableStyle)object18).getApplicable_style_image_url();
                                n14 = R$drawable.ic_placeholder_revamp;
                                n7 = 24;
                                f5 = 3.4E-44f;
                                object6 = object14;
                                object14 = object17;
                                object17 = object11;
                                xp1$a = object9;
                                object9 = null;
                                f8 = 0.0f;
                                string2 = object13;
                                object13 = object12;
                                object12 = object16;
                                object5 = b30$a$a;
                                b30$a$a = null;
                                n10 = 0;
                                rq2_12 = null;
                                n24 = n7;
                                Je1.a((LP1)object15, object14, n14, null, null, (b30_0)object16, 0, n7);
                                f6 = uq0_0.d;
                                object15 = h.e((LP1)object13, f6);
                                object14 = SP2.a(f12);
                                object14 = QV.a((LP1)object15, (i13)object14);
                                f7 = uq0_0.o;
                                n17 = (int)(((ApplicableStyle)object18).isSelected() ? 1 : 0);
                                n19 = 907093528;
                                object16.K(n19);
                                object11 = function1;
                                int n4 = object16.J(function1);
                                n3 = 32;
                                if (n22 == n3) {
                                    n24 = 1;
                                } else {
                                    n24 = 0;
                                    object7 = null;
                                }
                                int n25 = n4 | n24;
                                object12 = object16.v();
                                if (n25 != 0) break block31;
                                object9 = object5;
                                if (object12 != object5) break block32;
                            }
                            object20 = object11;
                            object20 = (sz_1)object11;
                            n19 = n18;
                            object12 = new mM2((sz_1)object20, n18);
                            object16.o(object12);
                        }
                        object11 = object12;
                        object11 = (Function1)object12;
                        object16.E();
                        n3 = 384;
                        object9 = object16;
                        tm2_1.b(n17 != 0, (LP1)object14, f7, (Function1)object11, (b30_0)object16, n3);
                        object16.p();
                        f6 = uq0_0.k;
                        object15 = h.e((LP1)object13, f6);
                        object14 = Tj1.Max;
                        object15 = f.b((LP1)object15, (Tj1)((Object)object14));
                        object14 = zp.c;
                        object10 = Nc$a.m;
                        object14 = oZ.a((zp$l)object14, (Gx$a)object10, (b30_0)object16, 0);
                        n14 = object16.F();
                        object11 = object16.m();
                        object15 = a30_0.c((b30_0)object16, (LP1)object15);
                        object9 = object16.i();
                        boolean bl2 = object9 instanceof mp;
                        if (!bl2) break block33;
                        object16.A();
                        boolean bl3 = object16.e();
                        if (bl3) {
                            object9 = xp1$a;
                            object16.C(xp1$a);
                        } else {
                            object16.n();
                        }
                        Ow3.a((b30_0)object16, object14, (Function2)object8);
                        object14 = object6;
                        Ow3.a((b30_0)object16, object11, (Function2)object6);
                        n15 = (int)(object16.e() ? 1 : 0);
                        if (n15 != 0 || (n15 = (int)(Intrinsics.areEqual(object14 = object16.v(), object11 = Integer.valueOf(n14)) ? 1 : 0)) == 0) {
                            re0_0.a(n14, (b30_0)object16, n14, (N20$a$a)object17);
                        }
                        Ow3.a((b30_0)object16, object15, (Function2)object19);
                        n8 = 1065353216;
                        float f8 = 1.0f;
                        object14 = j.c((LP1)object13, f8);
                        long l3 = yx_1.a;
                        object17 = y20_0.a;
                        object7 = tv0_0.h;
                        long l4 = oj3_2.d;
                        object10 = Ll3.a;
                        object5 = object15 = object16.j((H30)object10);
                        object5 = (xm3)object15;
                        long l7 = oj3_2.g;
                        int n26 = 0xFDFFFF;
                        long l8 = 0L;
                        long l12 = 0L;
                        long l14 = 0L;
                        xm3 xm32 = xm3.a((xm3)object5, l8, l12, null, null, l14, 0, l7, null, null, n26);
                        char c2 = (char)-112;
                        b30$a$a = null;
                        long l15 = 0L;
                        n10 = 0;
                        rq2_12 = null;
                        n17 = 0;
                        f6 = 0.0f;
                        object5 = object13;
                        object11 = string2;
                        object13 = null;
                        long l16 = 0L;
                        function1 = null;
                        n7 = 0;
                        f5 = 0.0f;
                        string2 = null;
                        int n27 = 1772976;
                        object15 = object11;
                        Object object20 = object10;
                        l2 = l3;
                        object = object16;
                        object16 = object17;
                        Ll3.b((String)object11, (LP1)object14, l3, l4, null, (tv0_0)object7, (RU0)object17, l15, null, null, l16, 0, false, 0, 0, null, xm32, (b30_0)object, n27, 0, c2);
                        object18 = ((ApplicableStyle)object18).getApplicable_style_desc();
                        if (object18 != null) {
                            n17 = 100;
                            f6 = 1.4E-43f;
                            string4 = le3_2.E(n17, (String)object18);
                        }
                        object15 = string4 == null ? string3 : string4;
                        f5 = uq0_0.h;
                        object14 = j.c(h.i((LP1)object5, 0.0f, f5, 0.0f, 0.0f, 13), f8);
                        object7 = tv0_0.e;
                        l4 = oj3_2.c;
                        object19 = object;
                        object18 = object20;
                        Object object21 = object18 = object.j((H30)object20);
                        object21 = (xm3)object18;
                        n26 = 0;
                        n16 = 0xFDFFFF;
                        long l17 = 0L;
                        long l18 = 0L;
                        long l19 = 0L;
                        xm32 = xm3.a((xm3)object21, l17, l18, null, null, l19, 0, l7, null, null, n16);
                        c2 = (char)-112;
                        b30$a$a = null;
                        l15 = 0L;
                        n10 = 0;
                        rq2_12 = null;
                        object13 = null;
                        l16 = 0L;
                        function1 = null;
                        n7 = 0;
                        f5 = 0.0f;
                        string2 = null;
                        n27 = 1772976;
                        l2 = l3;
                        object16 = object17;
                        Ll3.b((String)object15, (LP1)object14, l3, l4, null, (tv0_0)object7, (RU0)object17, l15, null, null, l16, 0, false, 0, 0, null, xm32, (b30_0)object, n27, 0, c2);
                        object.p();
                        object.p();
                        object19 = Unit.a;
                    }
                    return Unit.a;
                }
                s20.a();
                throw null;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }
}

