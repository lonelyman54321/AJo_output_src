/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.services.data.dresstool.Question;
import com.ril.ajio.services.data.dresstool.Style;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zg2
 */
public final class zg2_2
implements hx0_2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ Question b;
    public final /* synthetic */ rp2_0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ LP1 e;
    public final /* synthetic */ LP1 f;

    public zg2_2(gv0_1 gv0_12, LP1 lP1, LP1 lP12, LP1 lP13, rp2_0 rp2_02, Question question) {
        this.a = lP1;
        this.b = question;
        this.c = rp2_02;
        this.d = gv0_12;
        this.e = lP12;
        this.f = lP13;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        long l2;
        Object object5;
        zg2_2 zg2_22 = this;
        Object object6 = object;
        object6 = (wr1_2)object;
        Object object7 = object2;
        object7 = (Number)object2;
        int n3 = ((Number)object7).intValue();
        Object object8 = object3;
        object8 = (b30_0)object3;
        Object object9 = object4;
        object9 = (Number)object4;
        int n4 = ((Number)object9).intValue();
        Object object10 = "$this$items";
        Intrinsics.checkNotNullParameter(object6, (String)object10);
        int n7 = n4 & 0x70;
        int n8 = 32;
        if (n7 == 0) {
            n7 = (int)(object8.c(n3) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n4 |= n7;
        }
        n7 = n4 & 0x2D1;
        int n10 = 144;
        float f5 = 2.02E-43f;
        if (n7 == n10 && (n7 = (int)(object8.h() ? 1 : 0)) != 0) {
            object8.D();
            return Unit.a;
        }
        object6 = zg2_22.b;
        Object object11 = ((Question)object6).getSelectedStyleIndex();
        Object object12 = LP1$a.b;
        if (object11 != null && n3 == (n10 = ((Integer)object11).intValue())) {
            f5 = uq0_0.b;
            long l3 = yx_1.d;
            object5 = zg2_22.c;
            object11 = gz.a((LP1)object12, f5, l3, (i13)object5);
        } else {
            object11 = object12;
        }
        object11 = zg2_22.a.then((LP1)object11);
        int n14 = 975213409;
        object8.K(n14);
        Object object13 = zg2_22.d;
        int n15 = object8.J(object13);
        if ((n4 &= 0x70) == n8) {
            n4 = 1;
        } else {
            n4 = 0;
            object9 = null;
        }
        object10 = object8.v();
        if ((n4 |= n15) != 0 || object10 == (object9 = b30$a.a)) {
            object13 = (gv0_1)object13;
            object10 = new xg2_2((gv0_1)object13, n3);
            object8.o(object10);
        }
        object10 = (Function0)object10;
        object8.E();
        object9 = x20_0.d((LP1)object11, (Function0)object10);
        object10 = new yg2_2((Question)object6, n3);
        object9 = CY2.b((LP1)object9, false, (Function1)object10);
        object10 = Nc$a.n;
        object11 = zp.c;
        n14 = 48;
        object10 = oZ.a((zp$l)object11, (Gx$a)object10, (b30_0)object8, n14);
        n10 = object8.F();
        object13 = object8.m();
        object9 = a30_0.c((b30_0)object8, (LP1)object9);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        Object object14 = object8.i();
        boolean bl2 = object14 instanceof mp;
        String string2 = null;
        if (!bl2) {
            s20.a();
            throw null;
        }
        object8.A();
        boolean bl3 = object8.e();
        if (bl3) {
            object8.C(xp1$a);
        } else {
            object8.n();
        }
        N20$a$b n20$a$b = N20$a.e;
        Ow3.a((b30_0)object8, object10, n20$a$b);
        Object object15 = N20$a.d;
        Ow3.a((b30_0)object8, object13, (Function2)object15);
        N20$a$a n20$a$a = N20$a.f;
        n8 = (int)(object8.e() ? 1 : 0);
        if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object10 = object8.v(), object13 = Integer.valueOf(n10)) ? 1 : 0)) == 0) {
            re0_0.a(n10, (b30_0)object8, n10, n20$a$a);
        }
        object5 = N20$a.c;
        Ow3.a((b30_0)object8, object9, (Function2)object5);
        object9 = ((Question)object6).getSelectedStyleIndex();
        if (object9 != null && n3 == (n4 = ((Integer)object9).intValue())) {
            n4 = 226911528;
            l2 = zx_0.c(n4);
        } else {
            l2 = OX.f;
        }
        object11 = fg2_1.a;
        object13 = zg2_22.e;
        object9 = androidx.compose.foundation.a.b((LP1)object13, l2, (i13)object11);
        object10 = ((Question)object6).getStyles();
        if (object10 != null && (object10 = (Style)object10.get(n3)) != null) {
            object10 = ((Style)object10).getStyle_img_url();
        } else {
            n8 = 0;
            object10 = null;
        }
        n10 = R$drawable.ic_placeholder_revamp;
        object13 = i70$a.g;
        int n16 = 3072;
        int n17 = 16;
        Object object16 = object5;
        object5 = object8;
        Object object17 = n20$a$a;
        N20$a$d n20$a$d = object15;
        int n18 = n17;
        Je1.a((LP1)object9, object10, n10, (i70_0)object13, null, (b30_0)object8, n16, n17);
        object9 = HA.e(Nc$a.e, false);
        n8 = object8.F();
        object11 = object8.m();
        object13 = a30_0.c((b30_0)object8, (LP1)object12);
        object14 = object8.i();
        boolean bl4 = object14 instanceof mp;
        if (!bl4) {
            s20.a();
            throw null;
        }
        object8.A();
        boolean bl5 = object8.e();
        if (bl5) {
            object8.C(xp1$a);
        } else {
            object8.n();
        }
        Ow3.a((b30_0)object8, object9, n20$a$b);
        object9 = n20$a$d;
        Ow3.a((b30_0)object8, object11, n20$a$d);
        n4 = (int)(object8.e() ? 1 : 0);
        if (n4 != 0 || (n4 = (int)(Intrinsics.areEqual(object9 = object8.v(), object11 = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
            object9 = object17;
            re0_0.a(n8, (b30_0)object8, n8, (N20$a$a)object17);
        }
        object9 = object16;
        Ow3.a((b30_0)object8, object13, (Function2)object16);
        object16 = y20_0.a;
        object17 = tv0_0.h;
        long l4 = oj3_2.c;
        n18 = 3;
        object12 = new Cj3(n18);
        int n19 = 27648;
        int n20 = 105876;
        object10 = object14 = zg2_22.f;
        long l7 = 0L;
        n20$a$a = null;
        long l8 = 0L;
        n20$a$b = null;
        long l12 = 0L;
        int n21 = 2;
        int n22 = 2;
        int n24 = 1772598;
        Object object18 = object14;
        object15 = object17;
        Object object19 = object12;
        object12 = object16;
        Object object20 = object8;
        object8 = object19;
        object19 = object20;
        Ll3.b("", (LP1)object14, l7, l4, null, (tv0_0)object17, (RU0)object16, l8, null, (Cj3)object8, l12, 0, false, n21, n22, null, null, (b30_0)object20, n24, n19, n20);
        object9 = ((Question)object6).getStyles();
        if (object9 != null && (object9 = (Style)object9.get(n3)) != null) {
            string2 = ((Style)object9).getStyle_name();
        }
        object9 = string2 == null ? "" : string2;
        object6 = ((Question)object6).getSelectedStyleIndex();
        object15 = object6 != null && n3 == (n7 = ((Integer)object6).intValue()) ? object17 : (object6 = tv0_0.e);
        n7 = 3;
        object8 = new Cj3(n7);
        n19 = 3072;
        n20 = 122260;
        l7 = 0L;
        n20$a$a = null;
        l8 = 0L;
        n20$a$b = null;
        l12 = 0L;
        n21 = 2;
        n22 = 0;
        n24 = 1575984;
        object10 = object18;
        object12 = object16;
        object19 = object20;
        Ll3.b((String)object9, (LP1)object18, l7, l4, null, (tv0_0)object15, (RU0)object16, l8, null, (Cj3)object8, l12, 0, false, n21, 0, null, null, (b30_0)object20, n24, n19, n20);
        object20.p();
        object20.p();
        return Unit.a;
    }
}

