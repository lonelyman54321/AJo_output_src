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
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from La0
 */
public final class la0_1 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void a(ob0_1 ob0_12, yT1 yT12, b30_0 object, int n3) {
        Object object2;
        Integer n4;
        Object object3;
        void var9_14;
        Object object4;
        ob0_1 ob0_13 = ob0_12;
        yT1 yT13 = yT12;
        int n7 = 0;
        Serializable serializable = null;
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        Intrinsics.checkNotNullParameter(yT12, "navController");
        int n8 = 467821165;
        Object object5 = object;
        j30_0 j30_02 = object.g(n8);
        vc3_1 vc3_12 = AndroidCompositionLocals_androidKt.b;
        Object object6 = object4 = j30_02.j(vc3_12);
        object6 = (Context)object4;
        Object object7 = j30_02.v();
        Object object8 = b30$a.a;
        if (object7 == object8) {
            Q30 q30 = Qx2.a(ly0_0.f(f.a, j30_02), j30_02);
        }
        Object object9 = ((Q30)var9_14).a;
        Object object10 = j.c;
        long l2 = OX.f;
        Object object11 = fg2_1.a;
        LP1 lP1 = a.b((LP1)object10, l2, (i13)object11);
        object8 = zp.c;
        object11 = Nc$a.m;
        object8 = oZ.a((zp$l)object8, (Gx$a)object11, j30_02, 0);
        int n10 = j30_02.P;
        rq2_1 rq2_12 = j30_02.P();
        LP1 lP12 = a30_0.c(j30_02, lP1);
        N20$a n20$a = N20.W;
        n20$a.getClass();
        Object object12 = N20$a.b;
        mp mp2 = j30_02.a;
        boolean bl2 = mp2 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        j30_02.A();
        bl2 = j30_02.O;
        if (bl2) {
            j30_02.C((Function0)object12);
        } else {
            j30_02.n();
        }
        N20$a$b n20$a$b = N20$a.e;
        Ow3.a(j30_02, object8, n20$a$b);
        object8 = N20$a.d;
        Ow3.a(j30_02, rq2_12, (Function2)object8);
        N20$a$a n20$a$a = N20$a.f;
        int n14 = j30_02.O;
        if (n14 != 0 || (n14 = Intrinsics.areEqual(object3 = j30_02.v(), serializable = Integer.valueOf(n10))) == 0) {
            rk_0.a(n10, j30_02, n10, n20$a$a);
        }
        object3 = N20$a.c;
        Ow3.a(j30_02, lP12, (Function2)object3);
        String string2 = ob0_12.l();
        long l3 = xx_1.c;
        object11 = new OX(l3);
        Object object13 = object8;
        object8 = new OX(l3);
        N20$a$a n20$a$a2 = n20$a$a;
        object = n20$a$b;
        int n15 = 2;
        Object[] objectArray = new OX[n15];
        objectArray[0] = object11;
        objectArray[1] = object8;
        List list = xx_2.i(objectArray);
        object8 = new ha_2(yT13, n15);
        int n16 = 1;
        int n17 = 28080;
        int n18 = 32;
        Object object14 = object13;
        object13 = object8;
        Object object15 = object14;
        serializable = n20$a$a2;
        List list2 = list;
        Object object16 = object;
        int n19 = n16;
        Xp1$a xp1$a = object12;
        FillElement fillElement = object10;
        object10 = object8;
        i90_0 i90_02 = object9;
        object9 = j30_02;
        Object object17 = object6;
        ta0_0.d(string2, l3, list, 0.0f, n16 != 0, false, (Function0)object8, j30_02, n17, n18);
        int n20 = 16;
        float f5 = n20;
        n15 = 0;
        float f6 = 0.0f;
        Object var20_45 = null;
        boolean bl3 = false;
        n19 = 13;
        FillElement fillElement2 = fillElement;
        LP1 lP13 = h.i(fillElement, 0.0f, f5, 0.0f, 0.0f, n19);
        object8 = Nc$a.e;
        f5 = 0.0f;
        object11 = null;
        object8 = HA.e((Nc)object8, false);
        n10 = j30_02.P;
        rq2_1 rq2_13 = j30_02.P();
        LP1 lP14 = a30_0.c(j30_02, lP13);
        object12 = mp2;
        bl2 = mp2 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        j30_02.A();
        bl2 = j30_02.O;
        if (bl2) {
            object10 = xp1$a;
            j30_02.C(xp1$a);
        } else {
            object10 = xp1$a;
            j30_02.n();
        }
        object9 = object16;
        Ow3.a(j30_02, object8, (Function2)object16);
        Ow3.a(j30_02, rq2_13, (Function2)object15);
        bl3 = j30_02.O;
        if (bl3 || !(bl3 = Intrinsics.areEqual(object8 = j30_02.v(), n4 = Integer.valueOf(n10)))) {
            rk_0.a(n10, j30_02, n10, (N20$a$a)serializable);
        }
        Ow3.a(j30_02, lP14, (Function2)object3);
        ia0_0.a(ob0_13, true, j30_02, 56, 0);
        int n21 = 12;
        f6 = n21;
        n15 = 0;
        bl3 = false;
        n19 = 7;
        FillElement fillElement3 = fillElement;
        LP1 lP15 = h.i(fillElement, 0.0f, 0.0f, 0.0f, f6, n19);
        object8 = Nc$a.h;
        f5 = 0.0f;
        object11 = null;
        object8 = HA.e((Nc)object8, false);
        n10 = j30_02.P;
        rq2_1 rq2_14 = j30_02.P();
        LP1 lP16 = a30_0.c(j30_02, lP15);
        bl2 = object12 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        j30_02.A();
        bl2 = j30_02.O;
        if (bl2) {
            j30_02.C((Function0)object10);
        } else {
            j30_02.n();
        }
        Ow3.a(j30_02, object8, (Function2)object9);
        Ow3.a(j30_02, rq2_14, (Function2)object15);
        boolean bl4 = j30_02.O;
        if (bl4 || !(bl4 = Intrinsics.areEqual(object2 = j30_02.v(), object8 = Integer.valueOf(n10)))) {
            rk_0.a(n10, j30_02, n10, (N20$a$a)serializable);
        }
        Ow3.a(j30_02, lP16, (Function2)object3);
        n14 = R$string.continueshopping;
        object3 = nk_0.f(j30_02, n14);
        object9 = i90_02;
        object9 = (c80)i90_02;
        Object object18 = object17;
        ja0_0 ja0_02 = new ja0_0(ob0_13, (Context)object17, (c80)object9);
        n7 = 6;
        boolean bl5 = true;
        ga0_0.a(bl5, (String)object3, ja0_02, j30_02, n7);
        j30_02.T(bl5);
        j30_02.T(bl5);
        j30_02.T(bl5);
        object3 = j30_02.X();
        if (object3 != null) {
            n7 = n3;
            ka0_2 ka0_22 = new ka0_2(ob0_13, yT13, n3);
            ((CF2)object3).d = ka0_22;
        }
    }
}

