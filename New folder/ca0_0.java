/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;
import java.util.List;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ca0
 */
public final class ca0_0 {
    public static final void a(ob0_1 ob0_12, yT1 yT12, b30_0 b30_02, int n3) {
        ob0_1 ob0_13 = ob0_12;
        yT1 yT13 = yT12;
        boolean bl2 = true;
        int n4 = 0;
        fx0_2 fx0_22 = null;
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        Intrinsics.checkNotNullParameter(yT12, "navController");
        int n7 = -773543049;
        Object object = b30_02;
        j30_0 j30_02 = b30_02.g(n7);
        object = j30_02.v();
        Object object2 = b30$a.a;
        if (object == object2) {
            object = Qx2.a(ly0_0.f(f.a, j30_02), j30_02);
        }
        i90_0 i90_02 = ((Q30)object).a;
        int n8 = 8;
        ca0_0.b(ob0_13, j30_02, n8);
        object = j.c;
        long l2 = OX.f;
        Object object3 = fg2_1.a;
        object = a.b((LP1)object, l2, (i13)object3);
        object2 = zp.c;
        Gx$a gx$a = Nc$a.m;
        object2 = oZ.a((zp$l)object2, gx$a, j30_02, 0);
        int n10 = j30_02.P;
        object3 = j30_02.P();
        object = a30_0.c(j30_02, (LP1)object);
        N20.W.getClass();
        Object object4 = N20$a.b;
        Object object5 = j30_02.a;
        int n14 = object5 instanceof mp;
        if (n14 != 0) {
            j30_02.A();
            n14 = j30_02.O;
            if (n14 != 0) {
                j30_02.C((Function0)object4);
            } else {
                j30_02.n();
            }
            object4 = N20$a.e;
            Ow3.a(j30_02, object2, (Function2)object4);
            object2 = N20$a.d;
            Ow3.a(j30_02, object3, (Function2)object2);
            object2 = N20$a.f;
            int n15 = j30_02.O;
            if (n15 != 0 || (n15 = Intrinsics.areEqual(object3 = j30_02.v(), object4 = Integer.valueOf(n10))) == 0) {
                rk_0.a(n10, j30_02, n10, (N20$a$a)object2);
            }
            object2 = N20$a.c;
            Ow3.a(j30_02, object, (Function2)object2);
            object = ob0_12.l();
            l2 = xx_1.d;
            long l3 = xx_1.b;
            object5 = new OX(l3);
            l3 = xx_1.a;
            OX oX = new OX(l3);
            n15 = 2;
            object3 = new OX[n15];
            object3[0] = object5;
            object3[bl2] = oX;
            object3 = xx_2.i(object3);
            ua0_1 ua0_12 = new ua0_1(yT13, 0);
            object5 = null;
            oX = null;
            int n16 = 3504;
            n4 = 48;
            ta0_0.d((String)object, l2, (List)object3, 0.0f, false, false, ua0_12, j30_02, n16, n4);
            i90_02 = (c80)i90_02;
            fx0_22 = new Ca0$a((c80)i90_02, ob0_13, yT13);
            object3 = v10.c(2083209003, fx0_22, j30_02);
            object2 = null;
            n10 = 0;
            gx$a = null;
            n8 = 0;
            object = null;
            n14 = 3072;
            int n17 = 7;
            object4 = j30_02;
            OA.a(null, null, false, (u10)object3, j30_02, n14, n17);
            j30_02.T(bl2);
            CF2 cF2 = j30_02.X();
            if (cF2 != null) {
                n7 = n3;
                fx0_22 = new va0_2(ob0_13, yT13, n3);
                cF2.d = fx0_22;
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void b(ob0_1 ob0_12, b30_0 object, int n3) {
        boolean bl2;
        Object object2;
        Object object3;
        object = object.g(-115432366);
        boolean bl3 = ob0_12.p();
        if (bl3) {
            object3 = ob0_12.u.a;
            object2 = "HAS_SHOWS_COUPON_BONANZA_BENEFITS_DURING_SALE";
            bl2 = true;
            ((sw_0)object3).putPreference((String)object2, bl2);
        }
        object3 = Boolean.TRUE;
        bl2 = false;
        object2 = new Ca0$b(ob0_12, null);
        ly0_0.d((b30_0)object, object3, (Function2)object2);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object3 = new wa0_2(ob0_12, n3);
        }
    }
}

