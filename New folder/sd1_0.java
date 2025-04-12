/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$string;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SD1
 */
public final class sd1_0 {
    public static final void a(bf1_2 bf1_22, b30_0 b30_02, int n3) {
        bf1_2 bf1_23 = bf1_22;
        Object object = null;
        Intrinsics.checkNotNullParameter(bf1_22, "viewModel");
        int n4 = 1491270578;
        Object object2 = b30_02;
        Object object3 = b30_02.g(n4);
        Object object4 = LP1$a.b;
        object2 = j.c;
        long l2 = xx_1.A;
        Object object5 = fg2_1.a;
        object2 = a.b((LP1)object2, l2, (i13)object5);
        Object object6 = zp.d;
        Gx$a gx$a = Nc$a.n;
        int n7 = 54;
        object6 = oZ.a((zp$l)object6, gx$a, (b30_0)object3, n7);
        int n8 = ((j30_0)object3).P;
        object5 = ((j30_0)object3).P();
        object2 = a30_0.c((b30_0)object3, (LP1)object2);
        N20.W.getClass();
        Object object7 = N20$a.b;
        Object object8 = ((j30_0)object3).a;
        int n10 = object8 instanceof mp;
        String string2 = null;
        if (n10 != 0) {
            LP1$a lP1$a;
            long l3;
            int n14;
            int n15;
            long l4;
            int n16;
            Object object9;
            long l7;
            int n17;
            Cj3 cj3;
            Object object10;
            long l8;
            LP1$a lP1$a2;
            Object object11;
            float f5;
            int n18;
            ((j30_0)object3).A();
            n10 = ((j30_0)object3).O;
            if (n10 != 0) {
                ((j30_0)object3).C((Function0)object7);
            } else {
                ((j30_0)object3).n();
            }
            object7 = N20$a.e;
            Ow3.a((b30_0)object3, object6, (Function2)object7);
            object6 = N20$a.d;
            Ow3.a((b30_0)object3, object5, (Function2)object6);
            object6 = N20$a.f;
            n7 = (int)(((j30_0)object3).O ? 1 : 0);
            if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object5 = ((j30_0)object3).v(), object7 = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
                rk_0.a(n8, (j30_0)object3, n8, (N20$a$a)object6);
            }
            object6 = N20$a.c;
            Ow3.a((b30_0)object3, object2, (Function2)object6);
            bf1_22.getClass();
            object2 = h40_0.a;
            object2 = od3_2.a();
            Object object12 = "storeType";
            Intrinsics.checkNotNullParameter(object2, (String)object12);
            object6 = h40_0.g();
            n8 = (int)(object6.has((String)object2) ? 1 : 0);
            if (n8 != 0) {
                object2 = object6.getJSONObject((String)object2);
                object6 = "title";
                object2 = object2.get((String)object6).toString();
            } else {
                n18 = 0;
                object2 = null;
                f5 = 0.0f;
            }
            int n19 = -1813166427;
            float f6 = -5.9896872E-27f;
            ((j30_0)object3).K(n19);
            int n20 = 3;
            if (object2 == null) {
                object11 = object12;
                lP1$a2 = object4;
            } else {
                l8 = OX.f;
                long l12 = Em3.f(14);
                object8 = new nV0(0);
                object10 = tv0_0.o;
                cj3 = new Cj3(n20);
                n17 = 200064;
                n19 = 0;
                f6 = 0.0f;
                object6 = null;
                l7 = 0L;
                object9 = cj3;
                n16 = 0;
                cj3 = null;
                l4 = 0L;
                n15 = 130498;
                n14 = 3;
                l3 = l12;
                object11 = object12;
                object12 = object8;
                lP1$a2 = object4;
                object4 = object10;
                object10 = object9;
                object9 = object3;
                Ll3.b((String)object2, null, l8, l12, (nV0)object8, (tv0_0)object4, null, l7, null, (Cj3)object10, l4, 0, false, 0, 0, null, null, (b30_0)object3, n17, 0, n15);
            }
            ((j30_0)object3).T(false);
            object2 = od3_2.a();
            Intrinsics.checkNotNullParameter(object2, (String)object11);
            object6 = h40_0.g();
            n8 = (int)(object6.has((String)object2) ? 1 : 0);
            if (n8 != 0) {
                object2 = object6.getJSONObject((String)object2);
                object6 = "subtitle";
                object2 = object2.get((String)object6).toString();
            } else {
                n18 = 0;
                object2 = null;
                f5 = 0.0f;
            }
            n19 = -1813156130;
            f6 = -5.9936535E-27f;
            ((j30_0)object3).K(n19);
            if (object2 == null) {
                lP1$a = lP1$a2;
            } else {
                n19 = 8;
                f6 = n19;
                object4 = lP1$a2;
                object6 = h.e(lP1$a2, f6);
                l8 = OX.f;
                n20 = 12;
                l3 = Em3.f(n20);
                object12 = new nV0(0);
                object10 = tv0_0.m;
                cj3 = new Cj3(3);
                n17 = 200112;
                l7 = 0L;
                object9 = cj3;
                n16 = 0;
                cj3 = null;
                l4 = 0L;
                n15 = 130496;
                lP1$a = lP1$a2;
                object4 = object10;
                object10 = object9;
                object9 = object3;
                Ll3.b((String)object2, (LP1)object6, l8, l3, (nV0)object12, (tv0_0)object4, null, l7, null, (Cj3)object10, l4, 0, false, 0, 0, null, null, (b30_0)object3, n17, 0, n15);
            }
            ((j30_0)object3).T(false);
            object2 = od3_2.a();
            Intrinsics.checkNotNullParameter(object2, (String)object11);
            object11 = h40_0.g();
            n19 = (int)(object11.has((String)object2) ? 1 : 0);
            if (n19 != 0) {
                object11 = object11.getJSONObject((String)object2);
                object2 = "buttonTitle";
                object11 = object11.get((String)object2);
                string2 = object11.toString();
            }
            n14 = -1813144747;
            ((j30_0)object3).K(n14);
            if (string2 == null) {
                n14 = R$string.refresh;
                string2 = nk_0.f((b30_0)object3, n14);
            }
            object11 = string2;
            ((j30_0)object3).T(false);
            object2 = GE.a;
            long l14 = OX.f;
            l8 = 0L;
            n10 = 6;
            object7 = object3;
            object4 = GE.a(l14, l8, (b30_0)object3, n10, 14);
            n18 = 16;
            f5 = n18;
            object6 = lP1$a;
            object6 = h.e(lP1$a, f5);
            f5 = 0.0f;
            object8 = SP2.a(f5);
            object2 = new rd1_0(bf1_23, 0);
            object = new SD1$a(string2);
            u10 u102 = v10.c(1847423640, (fx0_2)object, (b30_0)object3);
            object12 = null;
            n8 = 0;
            gx$a = null;
            n7 = 0;
            object5 = null;
            n20 = 0;
            object7 = null;
            n16 = 0x30000030;
            int n21 = 348;
            ME.a((Function0)object2, (LP1)object6, false, null, null, (i13)object8, null, (ol0)object4, null, u102, (b30_0)object3, n16, n21);
            n14 = 1;
            ((j30_0)object3).T(n14 != 0);
            object = ((j30_0)object3).X();
            if (object != null) {
                n18 = n3;
                ((CF2)object).d = object3 = new ro0_1(bf1_23, n3, n14);
            }
            return;
        }
        s20.a();
        throw null;
    }
}

