/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.R$string;
import java.util.List;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vb0
 */
public final class vb0_1 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void a(ob0_1 ob0_12, yT1 yT12, b30_0 object, int n3) {
        Object object2;
        Object object3;
        int n4;
        void var9_14;
        Object object4;
        ob0_1 ob0_13 = ob0_12;
        yT1 yT13 = yT12;
        int n7 = 0;
        Object object5 = null;
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        Intrinsics.checkNotNullParameter(yT12, "navController");
        int n8 = 425866557;
        Object object6 = object;
        j30_0 j30_02 = object.g(n8);
        vc3_1 vc3_12 = AndroidCompositionLocals_androidKt.b;
        Object object7 = object4 = j30_02.j(vc3_12);
        Context context = (Context)object4;
        Object object8 = j30_02.v();
        Object object9 = b30$a.a;
        if (object8 == object9) {
            Q30 q30 = Qx2.a(ly0_0.f(f.a, j30_02), j30_02);
        }
        i90_0 i90_02 = ((Q30)var9_14).a;
        FillElement fillElement = j.c;
        long l2 = OX.f;
        Object object10 = fg2_1.a;
        LP1 lP1 = a.b(fillElement, l2, (i13)object10);
        object9 = zp.c;
        object10 = Nc$a.m;
        object9 = oZ.a((zp$l)object9, (Gx$a)object10, j30_02, 0);
        int n10 = j30_02.P;
        Object object11 = j30_02.P();
        LP1 lP12 = a30_0.c(j30_02, lP1);
        Object object12 = N20.W;
        object12.getClass();
        Object object13 = N20$a.b;
        mp mp2 = j30_02.a;
        int n14 = mp2 instanceof mp;
        object = context;
        if (n14 == 0) {
            s20.a();
            throw null;
        }
        j30_02.A();
        n14 = j30_02.O;
        if (n14 != 0) {
            j30_02.C((Function0)object13);
        } else {
            j30_02.n();
        }
        object12 = N20$a.e;
        Ow3.a(j30_02, object9, (Function2)object12);
        object9 = N20$a.d;
        Ow3.a(j30_02, object11, (Function2)object9);
        object11 = N20$a.f;
        int n15 = j30_02.O;
        if (n15 != 0 || (n4 = Intrinsics.areEqual(object3 = j30_02.v(), object2 = Integer.valueOf(n10))) == 0) {
            rk_0.a(n10, j30_02, n10, (N20$a$a)object11);
        }
        object2 = N20$a.c;
        Ow3.a(j30_02, lP12, (Function2)object2);
        String string2 = ob0_12.l();
        long l3 = xx_1.o;
        long l4 = xx_1.c0;
        object10 = new OX(l4);
        l4 = xx_1.b0;
        OX oX = new OX(l4);
        l4 = xx_1.a0;
        Object object14 = object9;
        object9 = new OX(l4);
        l4 = xx_1.Z;
        Object object15 = object11;
        object11 = new OX(l4);
        int n16 = 4;
        Object[] objectArray = new OX[n16];
        objectArray[0] = object10;
        objectArray[1] = oX;
        objectArray[2] = object9;
        objectArray[3] = object11;
        object11 = xx_2.i(objectArray);
        sb0_1 sb0_12 = new sb0_1(yT13, 0);
        n7 = 0;
        int n17 = 1124532224;
        float f5 = 135.0f;
        int n18 = 200112;
        int n19 = 16;
        float f6 = 2.2E-44f;
        Object object16 = object14;
        Object object17 = object15;
        Object object18 = object12;
        n14 = n17;
        float f7 = f5;
        mp mp3 = mp2;
        mp2 = null;
        object5 = object13;
        boolean bl2 = true;
        FillElement fillElement2 = fillElement;
        sb0_1 sb0_13 = sb0_12;
        i90_0 i90_03 = i90_02;
        j30_0 j30_03 = j30_02;
        Object object19 = object;
        n15 = n18;
        int n20 = n19;
        ta0_0.d(string2, l3, (List)object11, f5, false, bl2, sb0_13, j30_02, n18, n19);
        int n21 = 16;
        float f8 = n21;
        f7 = 0.0f;
        object12 = null;
        boolean bl3 = false;
        int n22 = 13;
        FillElement fillElement3 = fillElement2;
        LP1 lP13 = h.i(fillElement2, 0.0f, f8, 0.0f, 0.0f, n22);
        object9 = Nc$a.e;
        f8 = 0.0f;
        object10 = null;
        object9 = HA.e((Nc)object9, false);
        n10 = j30_02.P;
        object11 = j30_02.P();
        LP1 lP14 = a30_0.c(j30_02, lP13);
        object13 = mp3;
        n14 = mp3 instanceof mp;
        if (n14 == 0) {
            s20.a();
            throw null;
        }
        j30_02.A();
        n14 = (int)(j30_02.O ? 1 : 0);
        if (n14 != 0) {
            j30_02.C((Function0)object5);
        } else {
            j30_02.n();
        }
        Object object20 = object18;
        Ow3.a(j30_02, object9, (Function2)object18);
        Object object21 = object16;
        Ow3.a(j30_02, object11, (Function2)object16);
        bl3 = j30_02.O;
        if (bl3 || !(bl3 = Intrinsics.areEqual(object9 = j30_02.v(), object11 = Integer.valueOf(n10)))) {
            Object object22 = object17;
            rk_0.a(n10, j30_02, n10, (N20$a$a)object17);
        } else {
            Object object23 = object17;
        }
        Ow3.a(j30_02, lP14, (Function2)object2);
        mp2 = null;
        ia0_0.a(null, false, j30_02, 0, 3);
        int n24 = 12;
        f7 = n24;
        bl3 = false;
        n20 = 7;
        FillElement fillElement4 = fillElement2;
        n22 = n20;
        LP1 lP15 = h.i(fillElement2, 0.0f, 0.0f, 0.0f, f7, n20);
        object9 = Nc$a.h;
        f8 = 0.0f;
        object10 = null;
        object9 = HA.e((Nc)object9, false);
        n10 = j30_02.P;
        object11 = j30_02.P();
        LP1 lP16 = a30_0.c(j30_02, lP15);
        n14 = object13 instanceof mp;
        if (n14 == 0) {
            s20.a();
            throw null;
        }
        j30_02.A();
        n14 = (int)(j30_02.O ? 1 : 0);
        if (n14 != 0) {
            j30_02.C((Function0)object5);
        } else {
            j30_02.n();
        }
        Ow3.a(j30_02, object9, (Function2)object20);
        Ow3.a(j30_02, object11, (Function2)object21);
        n7 = j30_02.O;
        if (n7 != 0 || (n7 = Intrinsics.areEqual(object5 = j30_02.v(), object9 = Integer.valueOf(n10))) == 0) {
            void var11_33;
            rk_0.a(n10, j30_02, n10, (N20$a$a)var11_33);
        }
        Ow3.a(j30_02, lP16, (Function2)object2);
        n4 = R$string.continueshopping;
        object2 = nk_0.f(j30_02, n4);
        i90_0 i90_04 = i90_03;
        c80 c802 = (c80)i90_03;
        Object object24 = object19;
        object5 = new tb0_0(ob0_13, (Context)object19, c802);
        n16 = 6;
        boolean bl4 = true;
        ga0_0.a(bl4, (String)object2, (Function0)object5, j30_02, n16);
        j30_02.T(bl4);
        j30_02.T(bl4);
        j30_02.T(bl4);
        object2 = j30_02.X();
        if (object2 != null) {
            n7 = n3;
            ub0_1 ub0_12 = new ub0_1(ob0_13, yT13, n3);
            ((CF2)object2).d = ub0_12;
        }
    }
}

