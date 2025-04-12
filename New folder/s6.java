/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$font;
import com.ril.ajio.R$string;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class s6 {
    public static final void a(j7_0 j7_02, b30_0 b30_02, int n3) {
        j7_0 j7_03 = j7_02;
        int bl2 = 1;
        int n4 = 0;
        r6_0 r6_02 = null;
        Intrinsics.checkNotNullParameter(j7_02, "viewModel");
        int n7 = -1500566055;
        Object object = b30_02;
        j30_0 j30_02 = b30_02.g(n7);
        object = LP1$a.b;
        Object object2 = j.c;
        Object object3 = zp.d;
        Object object4 = Nc$a.n;
        int n8 = 54;
        object3 = oZ.a((zp$l)object3, (Gx$a)object4, j30_02, n8);
        int n10 = j30_02.P;
        Object object5 = j30_02.P();
        object2 = a30_0.c(j30_02, (LP1)object2);
        N20.W.getClass();
        Object object6 = N20$a.b;
        mp mp2 = j30_02.a;
        boolean bl3 = mp2 instanceof mp;
        int n14 = 0;
        String string2 = null;
        if (bl3) {
            char c2;
            long l2;
            int n15;
            long l3;
            ol0 ol02;
            long l4;
            long l7;
            float f5;
            int n16;
            Object object7;
            Object object8;
            Object object9;
            j30_02.A();
            bl3 = j30_02.O;
            if (bl3) {
                j30_02.C((Function0)object6);
            } else {
                j30_02.n();
            }
            object6 = N20$a.e;
            Ow3.a(j30_02, object3, (Function2)object6);
            object3 = N20$a.d;
            Ow3.a(j30_02, object5, (Function2)object3);
            object3 = N20$a.f;
            n8 = (int)(j30_02.O ? 1 : 0);
            if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object5 = j30_02.v(), object6 = Integer.valueOf(n10)) ? 1 : 0)) == 0) {
                rk_0.a(n10, j30_02, n10, (N20$a$a)object3);
            }
            object3 = N20$a.c;
            Ow3.a(j30_02, object2, (Function2)object3);
            j7_02.getClass();
            object2 = h40_0.a;
            object2 = od3_2.a();
            Object object10 = "storeType";
            Intrinsics.checkNotNullParameter(object2, (String)object10);
            object3 = h40_0.g();
            n10 = (int)(object3.has((String)object2) ? 1 : 0);
            if (n10 != 0) {
                object2 = object3.getJSONObject((String)object2);
                object3 = "title";
                object9 = object2 = object2.get((String)object3).toString();
            } else {
                object9 = null;
            }
            int n17 = 514882796;
            float f6 = 1.8686391E-20f;
            j30_02.K(n17);
            int n18 = 14;
            long l8 = 0xFF202020L;
            if (object9 == null) {
                object8 = object;
                object7 = object10;
            } else {
                long l12 = Em3.f(n18);
                object2 = ZU0.a(R$font.muli_regular, null, 0, n18);
                object3 = new LU0[bl2];
                object3[0] = object2;
                av0_0 av0_02 = SU0.a(object3);
                n16 = 700;
                f5 = 9.81E-43f;
                object2 = new tv0_0(n16);
                long l14 = zx_0.d(l8);
                int n19 = 3;
                long l15 = 0L;
                long l16 = 0L;
                int n20 = 16744408;
                xm3 xm32 = new xm3(l14, l12, (tv0_0)object2, av0_02, l16, null, n19, l15, n20);
                n17 = 0;
                f6 = 0.0f;
                object2 = null;
                l7 = 0L;
                l4 = 0L;
                bl3 = false;
                mp2 = null;
                ol02 = null;
                l3 = 0L;
                object7 = object10;
                n15 = 0;
                n14 = 0;
                string2 = null;
                l2 = 0L;
                c2 = (char)-2;
                object8 = object;
                object = object9;
                object9 = j30_02;
                Ll3.b((String)object, null, l7, l4, null, null, null, l3, null, null, l2, 0, false, 0, 0, null, xm32, j30_02, 0, 0, c2);
            }
            j30_02.T(false);
            object = od3_2.a();
            Intrinsics.checkNotNullParameter(object, (String)object7);
            object2 = h40_0.g();
            n16 = object2.has((String)object);
            if (n16 != 0) {
                object = object2.getJSONObject((String)object);
                object2 = "subtitle";
                object = object.get((String)object2).toString();
            } else {
                object = null;
            }
            n17 = 514897237;
            f6 = 1.8709722E-20f;
            j30_02.K(n17);
            n14 = 8;
            if (object != null) {
                f6 = n14;
                f5 = 16;
                object4 = object8;
                object2 = h.h((LP1)object8, f6, f6, f6, f5);
                f5 = 1.7E-44f;
                long l17 = Em3.f(12);
                n16 = R$font.muli_regular;
                object10 = null;
                object3 = ZU0.a(n16, null, 0, 14);
                object5 = new LU0[]{object3};
                av0_0 av0_03 = SU0.a(object5);
                n10 = 400;
                object3 = new tv0_0(n10);
                long l18 = zx_0.d(l8);
                int n21 = 3;
                long l19 = 0L;
                long l20 = 0L;
                int n22 = 16744408;
                object8 = new xm3(l18, l17, (tv0_0)object3, av0_03, l20, null, n21, l19, n22);
                l7 = 0L;
                l4 = 0L;
                bl3 = false;
                mp2 = null;
                ol02 = null;
                l3 = 0L;
                n15 = 0;
                n14 = 0;
                string2 = null;
                l2 = 0L;
                c2 = (char)-4;
                object9 = j30_02;
                Ll3.b((String)object, (LP1)object2, l7, l4, null, null, null, l3, null, null, l2, 0, false, 0, 0, null, (xm3)object8, j30_02, 0, 0, c2);
            }
            j30_02.T(false);
            object = od3_2.a();
            Intrinsics.checkNotNullParameter(object, (String)object7);
            object7 = h40_0.g();
            n17 = (int)(object7.has((String)object) ? 1 : 0);
            if (n17 != 0) {
                object7 = object7.getJSONObject((String)object);
                object = "buttonTitle";
                object7 = object7.get((String)object);
                string2 = object7.toString();
            } else {
                n14 = 0;
                string2 = null;
            }
            int n24 = 514914078;
            j30_02.K(n24);
            if (string2 == null) {
                int n25 = R$string.refresh;
                string2 = nk_0.f(j30_02, n25);
            }
            j30_02.T(false);
            object7 = GE.a;
            long l21 = xx_1.C;
            l7 = 0L;
            int n26 = 6;
            object5 = j30_02;
            ol02 = GE.a(l21, l7, j30_02, n26, 14);
            object6 = SP2.a(8);
            object = new q6_0(j7_03);
            object7 = new s6$a(string2);
            n4 = -1144412993;
            object10 = v10.c(n4, (fx0_2)object7, j30_02);
            bl3 = false;
            mp2 = null;
            n17 = 0;
            f6 = 0.0f;
            object2 = null;
            n16 = 0;
            f5 = 0.0f;
            object3 = null;
            n10 = 0;
            object4 = null;
            n8 = 0;
            object5 = null;
            n14 = 0x30000000;
            n15 = 350;
            ME.a((Function0)object, null, false, null, null, (i13)object6, null, ol02, null, (u10)object10, j30_02, n14, n15);
            boolean bl4 = true;
            j30_02.T(bl4);
            object7 = j30_02.X();
            if (object7 != null) {
                n7 = n3;
                r6_02 = new r6_0(j7_03, n3);
                ((CF2)object7).d = r6_02;
            }
            return;
        }
        s20.a();
        throw null;
    }
}

