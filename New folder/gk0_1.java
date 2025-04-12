/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.b;
import androidx.lifecycle.i$a;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.fleek.feedModel.FeedEngineData;
import com.ril.ajio.services.data.fleek.feedModel.Layout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GK0
 */
public final class gk0_1 {
    public static final void a(HK0$d hK0$d, dr0_0 dr0_02, yT1 yT12, f23_0 f23_02, ft1_2 ft1_22, b30_0 b30_02, int n3) {
        GK0$a gK0$a;
        Object object;
        dr0_0 dr0_03 = dr0_02;
        int n4 = -1866603615;
        Object object2 = b30_02;
        j30_0 j30_02 = b30_02.g(n4);
        Object object3 = j30_02.v();
        if (object3 == (object2 = b30$a.a)) {
            object3 = Qx2.a(ly0_0.f(f.a, j30_02), j30_02);
        }
        object3 = ((Q30)object3).a;
        FeedEngineData feedEngineData = hK0$d.a;
        Object object4 = null;
        object = feedEngineData != null && (object = feedEngineData.getLayout()) != null ? ((Layout)object).getComponents() : null;
        Object object5 = AndroidCompositionLocals_androidKt.b;
        object5 = (Context)j30_02.j((H30)object5);
        int n7 = -739147862;
        j30_02.K(n7);
        Object object6 = j30_02.v();
        if (object6 == object2) {
            n7 = (object5 = zv0_2.b((Context)object5)) instanceof Activity;
            if (n7 != 0) {
                object4 = object5;
                object4 = (Activity)object5;
            }
            j30_02.o(object4);
            object6 = object4;
        }
        object5 = object6;
        object5 = (Activity)object6;
        object4 = null;
        n7 = -739143989;
        object6 = wg2_2.a(j30_02, false, n7);
        if (object6 == object2) {
            object6 = new yp0_0();
            j30_02.o(object6);
        }
        Object object7 = object6;
        object7 = (yp0_0)object6;
        j30_02.T(false);
        mj0_2 mj0_22 = new mj0_2(f23_02, dr0_03);
        Object object8 = object3;
        object8 = (c80)object3;
        object3 = gK0$a;
        object2 = ft1_22;
        object4 = object;
        object = object5;
        object5 = f23_02;
        object6 = dr0_02;
        Object object9 = yT12;
        gK0$a = new GK0$a(ft1_22, (p83_0)object4, (Activity)object, f23_02, dr0_02, feedEngineData, (c80)object8, yT12, (yp0_0)object7);
        n4 = 1758203333;
        object = v10.c(n4, gK0$a, j30_02);
        object3 = new GK0$b(dr0_03);
        object5 = v10.c(-1281981946, (fx0_2)object3, j30_02);
        int n8 = 27696;
        object2 = null;
        object4 = mj0_22;
        object6 = j30_02;
        ov3.b(null, mj0_22, (u10)object, (u10)object5, j30_02, n8);
        object8 = j30_02.X();
        if (object8 != null) {
            object3 = object9;
            object2 = hK0$d;
            object4 = dr0_02;
            object = yT12;
            object5 = f23_02;
            object6 = ft1_22;
            n8 = n3;
            ((CF2)object8).d = object9 = new nj0_0(hK0$d, dr0_02, yT12, f23_02, ft1_22, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void b(f23_0 f23_02, yT1 yT12, dr0_0 dr0_02, b30_0 b30_02, int n3) {
        Object object;
        Object object2 = f23_02;
        yT1 yT13 = yT12;
        dr0_0 dr0_03 = dr0_02;
        int n4 = n3;
        int n7 = 1;
        Intrinsics.checkNotNullParameter(f23_02, "sharedFleekVM");
        Intrinsics.checkNotNullParameter(yT12, "fleekAppNavigationController");
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        Object object3 = b30_02;
        j30_0 j30_02 = b30_02.g(-766588330);
        Object object4 = (Boolean)dr0_02.Y.getValue();
        int n8 = ((Boolean)object4).booleanValue();
        Object object5 = jt1.a(j30_02);
        object3 = (hk0_1)dr0_02.A.getValue();
        i$a i$a = ov3.z(j30_02);
        boolean bl2 = false;
        Object object6 = null;
        Object object7 = new GK0$c(i$a, dr0_02, null);
        ly0_0.d(j30_02, (Object)i$a, (Function2)object7);
        int n10 = 1981063361;
        j30_02.K(n10);
        b30$a$a b30$a$a = b30$a.a;
        boolean bl3 = false;
        N20$a$b n20$a$b = null;
        if (n8 != 0) {
            object4 = dr0_02.Y;
            object7 = Boolean.FALSE;
            ((h83_0)object4).setValue(object7);
            object4 = Unit.a;
            j30_02.K(1981067198);
            boolean bl4 = j30_02.J(object5);
            object = j30_02.v();
            if (bl4 || object == b30$a$a) {
                object = new GK0$d((ft1_2)object5, null);
                j30_02.o(object);
            }
            object = (Function2)object;
            j30_02.T(false);
            ly0_0.d(j30_02, object4, (Function2)object);
        }
        if ((object4 = wg2_2.a(j30_02, false, n8 = 1981069990)) == b30$a$a) {
            object4 = new rm_2(object5, n7);
            object4 = J83.e((Function0)object4);
            j30_02.o(object4);
        }
        object4 = (ib3_0)object4;
        j30_02.T(false);
        Object object8 = object4.getValue();
        object7 = new GK0$e((ib3_0)object4, (ft1_2)object5, dr0_03, null);
        ly0_0.d(j30_02, object8, (Function2)object7);
        object4 = j.c;
        long l2 = nz_1.a;
        object = fg2_1.a;
        LP1 lP1 = a.b((LP1)object4, l2, (i13)object);
        object7 = HA.e(Nc$a.e, false);
        int n14 = j30_02.P;
        Object object9 = j30_02.P();
        LP1 lP12 = a30_0.c(j30_02, lP1);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        mp mp2 = j30_02.a;
        bl3 = mp2 instanceof mp;
        if (!bl3) {
            s20.a();
            throw null;
        }
        j30_02.A();
        bl3 = j30_02.O;
        if (bl3) {
            j30_02.C(xp1$a);
        } else {
            j30_02.n();
        }
        n20$a$b = N20$a.e;
        Ow3.a(j30_02, object7, n20$a$b);
        object7 = N20$a.d;
        Ow3.a(j30_02, object9, (Function2)object7);
        object9 = N20$a.f;
        bl2 = j30_02.O;
        if (bl2 || !(bl2 = Intrinsics.areEqual(object6 = j30_02.v(), object2 = Integer.valueOf(n14)))) {
            rk_0.a(n14, j30_02, n14, (N20$a$a)object9);
        }
        object6 = N20$a.c;
        Ow3.a(j30_02, lP12, (Function2)object6);
        HK0$c hK0$c = HK0$c.a;
        n10 = (int)(Intrinsics.areEqual(object3, hK0$c) ? 1 : 0);
        if (n10 != 0) {
            n8 = -677574210;
            j30_02.K(n8);
            object4 = Unit.a;
            object3 = new GK0$f(null, dr0_03);
            ly0_0.d(j30_02, object4, (Function2)object3);
            n10 = 0;
            Object var15_21 = null;
            j30_02.T(false);
        } else {
            n10 = 0;
            Object var15_22 = null;
            object = HK0$b.a;
            n14 = (int)(Intrinsics.areEqual(object3, object) ? 1 : 0);
            if (n14 != 0) {
                boolean bl5;
                int n15 = -677308013;
                j30_02.K(n15);
                object3 = HA.e(Nc$a.a, false);
                n10 = j30_02.P;
                object5 = j30_02.P();
                object4 = a30_0.c(j30_02, (LP1)object4);
                n14 = mp2 instanceof mp;
                if (n14 == 0) {
                    s20.a();
                    throw null;
                }
                j30_02.A();
                n14 = (int)(j30_02.O ? 1 : 0);
                if (n14 != 0) {
                    j30_02.C(xp1$a);
                } else {
                    j30_02.n();
                }
                Ow3.a(j30_02, object3, n20$a$b);
                Ow3.a(j30_02, object5, (Function2)object7);
                boolean bl6 = j30_02.O;
                if (bl6 || !(bl5 = Intrinsics.areEqual(object3 = j30_02.v(), object7 = Integer.valueOf(n10)))) {
                    rk_0.a(n10, j30_02, n10, (N20$a$a)object9);
                }
                Ow3.a(j30_02, object4, (Function2)object6);
                n8 = 0;
                object4 = null;
                gj0_2.a(j30_02, 0);
                boolean bl7 = true;
                j30_02.T(bl7);
                j30_02.T(false);
            } else {
                n8 = object3 instanceof hk0_1.a;
                if (n8 != 0) {
                    j30_02.K(-677088006);
                    object4 = AndroidCompositionLocals_androidKt.b;
                    object4 = (Context)j30_02.j((H30)object4);
                    n8 = vV1.e((Context)object4);
                    if (n8 == 0) {
                        n8 = -677015094;
                        j30_02.K(n8);
                        object4 = new q4_0(dr0_03, 1);
                        boolean bl8 = false;
                        object3 = null;
                        rB0.c((Function0)object4, j30_02, 0);
                        j30_02.T(false);
                    } else {
                        boolean bl9 = false;
                        object3 = null;
                        n8 = -676902006;
                        j30_02.K(n8);
                        object4 = new kj0_2(dr0_03);
                        rB0.a((Function0)object4, j30_02, 0);
                        j30_02.T(false);
                    }
                    j30_02.T(false);
                } else {
                    n8 = object3 instanceof HK0$d;
                    if (n8 == 0) {
                        j30_02.K(670878624);
                        j30_02.T(false);
                        object4 = new NoWhenBranchMatchedException();
                        throw object4;
                    }
                    j30_02.K(-676723012);
                    object4 = object3;
                    object4 = (HK0$d)object3;
                    object3 = dr0_0.Companion;
                    int n16 = n4 >> 3 & 0x70 | 0x1248;
                    n10 = n4 << 9 & 0x1C00;
                    n14 = n16 | n10;
                    object3 = dr0_02;
                    yT1 yT14 = yT12;
                    object7 = f23_02;
                    object6 = j30_02;
                    gk0_1.a((HK0$d)object4, dr0_02, yT12, f23_02, (ft1_2)object5, j30_02, n14);
                    n8 = 0;
                    object4 = null;
                    j30_02.T(false);
                }
            }
        }
        n8 = 1;
        j30_02.T(n8 != 0);
        object4 = j30_02.X();
        if (object4 != null) {
            f23_0 f23_03 = f23_02;
            ((CF2)object4).d = object3 = new lj0_1(f23_02, yT13, dr0_03, n4);
        }
    }

    public static final void c(Activity activity, dr0_0 dr0_02, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        int bl2 = -1251178428;
        object = object.g(bl2);
        Object object2 = Unit.a;
        boolean bl3 = false;
        Object object3 = null;
        Object object4 = new GK0$g(null, dr0_02);
        ly0_0.d((b30_0)object, object2, (Function2)object4);
        object2 = (CartDeliveryAddress)dr0_02.I0.getValue();
        Object object5 = j.c;
        object4 = Nc$a.a;
        Object object6 = null;
        object4 = HA.e((Nc)object4, false);
        int n4 = ((j30_0)object).P;
        Object object7 = ((j30_0)object).P();
        LP1 lP1 = a30_0.c((b30_0)object, (LP1)object5);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        mp mp2 = ((j30_0)object).a;
        boolean bl4 = mp2 instanceof mp;
        if (bl4) {
            ((j30_0)object).A();
            bl3 = ((j30_0)object).O;
            if (bl3) {
                ((j30_0)object).C(xp1$a);
            } else {
                ((j30_0)object).n();
            }
            object3 = N20$a.e;
            Ow3.a((b30_0)object, object4, (Function2)object3);
            object4 = N20$a.d;
            Ow3.a((b30_0)object, object7, (Function2)object4);
            object4 = N20$a.f;
            bl3 = ((j30_0)object).O;
            if (bl3 || !(bl3 = Intrinsics.areEqual(object3 = ((j30_0)object).v(), object7 = Integer.valueOf(n4)))) {
                rk_0.a(n4, (j30_0)object, n4, (N20$a$a)object4);
            }
            object4 = N20$a.c;
            Ow3.a((b30_0)object, lP1, (Function2)object4);
            object4 = new Object();
            object6 = new ij0_2(activity, (CartDeliveryAddress)object2, dr0_02);
            int n7 = 54;
            lP1 = null;
            object3 = object5;
            object5 = object6;
            object6 = object;
            b.a((Function1)object4, (LP1)object3, (Function1)object5, (b30_0)object, n7, 0);
            boolean bl5 = true;
            ((j30_0)object).T(bl5);
            object = ((j30_0)object).X();
            if (object != null) {
                ((CF2)object).d = object2 = new jj0_2(activity, dr0_02, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }
}

