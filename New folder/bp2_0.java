/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.foundation.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bP2
 */
public final class bp2_0 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(LP1 lP1, Boolean bl2, bP2$m bP2$m, b30_0 b30_02, int n3) {
        LP1 lP12 = lP1;
        Boolean bl3 = bl2;
        bP2$m bP2$m2 = bP2$m;
        int n4 = n3;
        Intrinsics.checkNotNullParameter(lP1, "modifier");
        Object object = "onClick";
        Intrinsics.checkNotNullParameter(bP2$m, (String)object);
        Object object2 = b30_02;
        j30_0 j30_02 = b30_02.g(-879827569);
        int n7 = n3 & 0xE;
        if (n7 == 0) {
            n7 = (int)(j30_02.J(lP1) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n4;
        } else {
            n7 = n3;
        }
        int n8 = n4 & 0x70;
        if (n8 == 0) {
            n8 = (int)(j30_02.J(bl3) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        n8 = n4 & 0x380;
        int n10 = 256;
        if (n8 == 0) {
            n8 = (int)(j30_02.x(bP2$m2) ? 1 : 0);
            n8 = n8 != 0 ? 256 : 128;
            n7 |= n8;
        }
        n8 = n7 & 0x2DB;
        int n14 = 146;
        float f5 = 2.05E-43f;
        if (n8 == n14 && (n8 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
        } else {
            Object object3;
            object2 = AndroidCompositionLocals_androidKt.b;
            object2 = (Context)j30_02.j((H30)object2);
            Object object4 = Boolean.TRUE;
            n14 = (int)(Intrinsics.areEqual(bl3, object4) ? 1 : 0);
            if (n14 != 0) {
                n14 = 0;
                f5 = 0.0f;
                object4 = null;
            } else {
                double d2 = 0.3;
                f5 = (float)d2;
                long l2 = OX.c;
                object4 = oz_0.a(l2, f5);
            }
            Boolean bl4 = object4;
            n14 = 8;
            f5 = n14;
            object4 = SP2.a(f5);
            j30_02.K(335234119);
            int n15 = n7 & 0x380;
            if (n15 == n10) {
                n10 = 1;
            } else {
                n10 = 0;
                object3 = null;
            }
            Object object5 = j30_02.v();
            if (n10 != 0 || object5 == (object3 = b30$a.a)) {
                object5 = new yo2_0(bP2$m2);
                j30_02.o(object5);
            }
            object3 = object5;
            object3 = (Function0)object5;
            j30_02.T(false);
            object5 = new ap2_2(bl3, (Context)object2);
            u10 u102 = v10.c(619235677, (fx0_2)object5, j30_02);
            n7 = n7 << 3 & 0x70;
            n8 = 0x30000000;
            int n16 = n7 | n8;
            n15 = 0;
            object5 = null;
            int n17 = 412;
            object = object3;
            object2 = lP1;
            n10 = 0;
            object3 = null;
            ME.b((Function0)object, lP1, false, (rp2_0)object4, (nz)((Object)bl4), null, null, u102, j30_02, n16, n17);
        }
        object = j30_02.X();
        if (object != null) {
            ((CF2)object).d = object2 = new ZO2(lP12, bl3, bP2$m2, n4);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final void b(ProductReview productReview, yi2_1 yi2_12, Function1 function1, gx0_2 gx0_22, yh0_0 yh0_02, b30_0 b30_02, int n3, int n4) {
        Object object;
        void var14_19;
        Object object2 = productReview;
        Object object3 = function1;
        Intrinsics.checkNotNullParameter(function1, "markHelpful");
        Object object4 = "imgClicked";
        Object object5 = gx0_22;
        Intrinsics.checkNotNullParameter(gx0_22, (String)object4);
        Object object6 = b30_02;
        j30_0 j30_02 = b30_02.g(-1159348296);
        int bl2 = n4 & 0x10;
        int n7 = 0;
        object6 = null;
        Object object7 = bl2 != 0 ? null : yh0_02;
        object4 = AndroidCompositionLocals_androidKt.b;
        Object object8 = object4 = j30_02.j((H30)object4);
        object8 = (Context)object4;
        j30_02.K(-168623202);
        boolean bl3 = j30_02.J(object2);
        Object object9 = j30_02.v();
        Object object10 = b30$a.a;
        if (bl3 || object9 == object10) {
            if (object2 != null) {
                object4 = productReview.isMarkedHelpful();
            } else {
                boolean bl4 = false;
                object4 = null;
            }
            object9 = J83.g(object4);
            j30_02.o(object9);
        }
        Object object11 = object9;
        object11 = (tr1_0)object9;
        int n8 = 0;
        Object object12 = null;
        j30_02.T(false);
        if (object7 != null && (object4 = ((yh0_0)object7).p) != null) {
            object4 = ((h83_0)object4).getValue();
            object9 = Boolean.TRUE;
            boolean bl5 = Intrinsics.areEqual(object4, object9);
        } else {
            boolean bl6 = false;
            object4 = null;
        }
        object4 = (boolean)var14_19;
        object9 = new bP2$e((ProductReview)object2, (yh0_0)object7, (tr1_0)object11, null);
        ly0_0.d(j30_02, object4, (Function2)object9);
        object4 = LP1$a.b;
        long l2 = OX.f;
        Object object13 = fg2_1.a;
        object4 = a.b((LP1)object4, l2, (i13)object13);
        j30_02.K(-1003410150);
        n7 = 212064437;
        j30_02.K(n7);
        j30_02.T(false);
        object6 = O30.f;
        object6 = (Vo0)j30_02.j((H30)object6);
        object9 = j30_02.v();
        if (object9 == object10) {
            object9 = new nl1_0((Vo0)object6);
            j30_02.o(object9);
        }
        object9 = (nl1_0)object9;
        object6 = j30_02.v();
        if (object6 == object10) {
            object6 = new C50();
            j30_02.o(object6);
        }
        object13 = object6;
        object13 = (C50)object6;
        object6 = j30_02.v();
        if (object6 == object10) {
            object6 = J83.g(Boolean.FALSE);
            j30_02.o(object6);
        }
        object6 = (tr1_0)object6;
        Object object14 = j30_02.v();
        if (object14 == object10) {
            object14 = new i50_0((C50)object13);
            j30_02.o(object14);
        }
        object14 = (i50_0)object14;
        Object object15 = j30_02.v();
        if (object15 == object10) {
            object15 = Unit.a;
            J83.h();
            object = wv1_0.b;
            object15 = J83.f(object15, (I83)object);
            j30_02.o(object15);
        }
        object15 = (tr1_0)object15;
        int n10 = j30_02.x(object9);
        n8 = j30_02.c(257);
        object12 = j30_02.v();
        if ((n10 |= n8) != 0 || object12 == object10) {
            object12 = new bP2$a((tr1_0)object15, (nl1_0)object9, (i50_0)object14, (tr1_0)object6);
            j30_02.o(object12);
        }
        object12 = (al1_1)object12;
        object = j30_02.v();
        if (object == object10) {
            object = new bP2$b((tr1_0)object6, (i50_0)object14);
            j30_02.o(object);
        }
        object14 = object;
        object14 = (Function0)object;
        n7 = (int)(j30_02.x(object9) ? 1 : 0);
        object = j30_02.v();
        if (n7 != 0 || object == object10) {
            object = new bP2$c((nl1_0)object9);
            j30_02.o(object);
        }
        object = (Function1)object;
        object = CY2.b((LP1)object4, false, (Function1)object);
        object4 = object9;
        object6 = object15;
        object15 = object9;
        object9 = object13;
        object10 = object14;
        object13 = productReview;
        object14 = yi2_12;
        object2 = object4;
        object3 = object;
        object = j30_02;
        object5 = object12;
        object12 = gx0_22;
        yh0_0 yh0_03 = object7;
        object7 = function1;
        ((bP2$d)object4)((tr1_0)object6, (C50)object9, (Function0)object10, productReview, yi2_12, n3, j30_02, gx0_22, (Context)object8, (tr1_0)object11, function1);
        object4 = v10.c(1200550679, (fx0_2)object4, j30_02);
        n7 = 48;
        Mp1.a((LP1)object3, (u10)object4, (al1_1)object5, j30_02, n7);
        boolean bl7 = false;
        object4 = null;
        j30_02.T(false);
        object12 = j30_02.X();
        if (object12 != null) {
            object4 = object8;
            object6 = productReview;
            object9 = yi2_12;
            object10 = function1;
            object13 = gx0_22;
            object14 = yh0_03;
            n10 = n4;
            ((CF2)object12).d = object8 = new xo2_0(productReview, yi2_12, function1, gx0_22, yh0_03, n3, n4);
        }
    }
}

