/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.R$drawable;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yd3
 */
public final class yd3_2 {
    public static final void a(Function0 function0, b30_0 b30_02, int n3) {
        block14: {
            Object object;
            Object object2;
            int n4;
            Function0 function02;
            block13: {
                int n7;
                float f5;
                int n8;
                int n10;
                int n14;
                block12: {
                    function02 = function0;
                    n4 = n3;
                    Intrinsics.checkNotNullParameter(function0, "onRetryClicked");
                    int n15 = -1155183324;
                    object2 = b30_02;
                    object = b30_02.g(n15);
                    n14 = n3 & 0xE;
                    n10 = 2;
                    n8 = 4;
                    f5 = 5.6E-45f;
                    if (n14 == 0) {
                        n14 = (int)(((j30_0)object).x(function0) ? 1 : 0);
                        n14 = n14 != 0 ? 4 : 2;
                        n14 |= n4;
                    } else {
                        n14 = n3;
                    }
                    n7 = n14 & 0xB;
                    if (n7 != n10 || (n10 = (int)(((j30_0)object).h() ? 1 : 0)) == 0) break block12;
                    ((j30_0)object).D();
                    break block13;
                }
                LP1$a lP1$a = LP1$a.b;
                float f6 = uq0_0.k;
                float f7 = 0.0f;
                Serializable serializable = null;
                int n16 = 10;
                Object object3 = h.i(lP1$a, f6, 0.0f, f6, 0.0f, n16);
                ((j30_0)object).K(1724519719);
                int n17 = 14;
                n7 = 0;
                if ((n14 &= n17) == n8) {
                    n14 = 1;
                } else {
                    n14 = 0;
                    object2 = null;
                }
                Object object4 = ((j30_0)object).v();
                if (n14 != 0 || object4 == (object2 = b30$a.a)) {
                    n14 = 1;
                    object4 = new es2_1(function02, n14);
                    ((j30_0)object).o(object4);
                }
                object4 = (Function0)object4;
                ((j30_0)object).T(false);
                object2 = x20_0.d((LP1)object3, (Function0)object4);
                object3 = zp.d;
                object4 = Nc$a.n;
                int n18 = 54;
                object3 = oZ.a((zp$l)object3, (Gx$a)object4, (b30_0)object, n18);
                n8 = ((j30_0)object).P;
                Object object5 = ((j30_0)object).P();
                object2 = a30_0.c((b30_0)object, (LP1)object2);
                N20.W.getClass();
                serializable = N20$a.b;
                mp mp2 = ((j30_0)object).a;
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block14;
                ((j30_0)object).A();
                bl2 = ((j30_0)object).O;
                if (bl2) {
                    ((j30_0)object).C((Function0)((Object)serializable));
                } else {
                    ((j30_0)object).n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object, object3, (Function2)((Object)serializable));
                object3 = N20$a.d;
                Ow3.a((b30_0)object, object5, (Function2)object3);
                object3 = N20$a.f;
                n18 = (int)(((j30_0)object).O ? 1 : 0);
                if (n18 != 0 || (n18 = (int)(Intrinsics.areEqual(object5 = ((j30_0)object).v(), serializable = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
                    rk_0.a(n8, (j30_0)object, n8, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object, object2, (Function2)object3);
                object2 = km2.a(R$drawable.ic_fleek_retry, (b30_0)object, 0);
                n10 = 16;
                f7 = n10;
                object3 = h.i(lP1$a, 0.0f, f7, 0.0f, 0.0f, 13);
                f5 = uq0_0.u;
                object4 = j.h((LP1)object3, f5);
                serializable = null;
                n7 = 0;
                int n19 = 120;
                Pd1.a((im2)object2, "", (LP1)object4, null, null, 0.0f, null, (b30_0)object, 440, n19);
                long l2 = nz_1.c;
                long l3 = Em3.f(n17);
                Object object6 = y20_0.a;
                tv0_0 tv0_02 = tv0_0.h;
                f7 = uq0_0.e;
                n18 = 0;
                object5 = null;
                n16 = 13;
                object3 = h.i(lP1$a, 0.0f, f7, 0.0f, 0.0f, n16);
                Object object7 = new Cj3(3);
                int n20 = 1772598;
                object2 = "Retry";
                bl2 = false;
                f6 = 0.0f;
                mp2 = null;
                long l4 = 0L;
                n17 = 0;
                long l7 = 0L;
                int n21 = 130448;
                Cj3 cj3 = object7;
                object7 = object6;
                object6 = object;
                Ll3.b((String)object2, (LP1)object3, l2, l3, null, tv0_02, (RU0)object7, l4, null, cj3, l7, 0, false, 0, 0, null, null, (b30_0)object, n20, 0, n21);
                n14 = 1;
                ((j30_0)object).T(n14 != 0);
            }
            object = ((j30_0)object).X();
            if (object != null) {
                ((CF2)object).d = object2 = new wd3_1(function02, n4);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void b(f23_0 f23_02, String string2, p83_0 p83_02, boolean n3, int n4, Function2 function2, LP1 lP1, LP1 lP12, dr0_0 dr0_02, b30_0 b30_02, int n7, int n8) {
        fx0_2 fx0_22;
        int n10;
        int n14;
        Object object;
        int n15;
        Object object2 = f23_02;
        Object object3 = p83_02;
        Object object4 = dr0_02;
        Intrinsics.checkNotNullParameter(f23_02, "sharedFleekViewModel");
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(function2, "sendImpression");
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        int n16 = 1114458431;
        Object object5 = b30_02;
        Object object6 = b30_02.g(n16);
        int n17 = n8 & 8;
        Object object7 = null;
        if (n17 != 0) {
            n15 = 0;
            object = null;
        } else {
            n15 = n3;
        }
        ft1_2 ft1_22 = jt1.a((b30_0)object6);
        object5 = AndroidCompositionLocals_androidKt.b;
        object5 = zv0_2.b((Context)((j30_0)object6).j((H30)object5));
        Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type android.app.Activity");
        Object object8 = object5;
        object8 = (Activity)object5;
        object5 = (Boolean)((f23_0)object2).d.getValue();
        object5.getClass();
        Object object9 = new yd3$a((f23_0)object2, (p83_0)object3, null);
        ly0_0.d((b30_0)object6, object5, (Function2)object9);
        n17 = 229971880;
        ((j30_0)object6).K(n17);
        object5 = ((j30_0)object6).v();
        object9 = b30$a.a;
        if (object5 == object9) {
            n14 = 1;
            object5 = new q_0(ft1_22, n14);
            object5 = J83.e((Function0)object5);
            ((j30_0)object6).o(object5);
        }
        object5 = (ib3_0)object5;
        ((j30_0)object6).T(false);
        object5 = object5.getValue();
        object7 = new yd3$b(ft1_22, (dr0_0)object4, n15 != 0, null);
        ly0_0.d((b30_0)object6, object5, (Function2)object7);
        if (object3 == null || (n17 = (int)(p83_02.isEmpty() ? 1 : 0)) != 0) {
            n10 = n15;
        } else {
            object5 = fx0_22;
            object7 = lP1;
            object9 = p83_02;
            int n18 = n15;
            object2 = fx0_22;
            n10 = n15;
            object = string2;
            fx0_22 = new yd3$c(lP1, ft1_22, p83_02, dr0_02, n15 != 0, function2, (Activity)object8, n4, string2);
            n17 = -1936680082;
            object9 = v10.c(n17, fx0_22, (b30_0)object6);
            int n19 = n7 >> 21 & 0xE;
            n18 = n19 | 0xC00;
            object7 = null;
            ft1_22 = null;
            int n20 = 6;
            object5 = lP12;
            OA.a(lP12, null, false, (u10)object9, (b30_0)object6, n18, n20);
        }
        object = ((j30_0)object6).X();
        if (object != null) {
            object6 = fx0_22;
            object2 = f23_02;
            object5 = string2;
            object7 = p83_02;
            n14 = n4;
            object8 = dr0_02;
            object3 = fx0_22;
            object4 = object;
            n15 = n8;
            fx0_22 = new xd3_2(f23_02, string2, p83_02, n10 != 0, n4, function2, lP1, lP12, dr0_02, n7, n8);
            ((CF2)object).d = fx0_22;
        }
    }
}

