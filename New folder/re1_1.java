/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 */
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LiveData;
import androidx.navigation.e;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.b;

/*
 * Renamed from rE1
 */
public final class re1_1 {
    public static final ParcelableSnapshotMutableState a;
    public static final ParcelableSnapshotMutableState b;
    public static final ParcelableSnapshotMutableState c;
    public static final ParcelableSnapshotMutableState d;
    public static boolean e;
    public static boolean f;

    static {
        ArrayList arrayList = new ArrayList();
        a = J83.g(arrayList);
        b = J83.g(null);
        c = J83.g(null);
        d = J83.g(2);
    }

    public static final void a(String string2, bf1_2 bf1_22, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(bf1_22, "viewModel");
        object = object.g(1541448291);
        ((j30_0)object).u(1998134191);
        pq_0 pq_02 = u63.a(string2, (b30_0)object, 8);
        oe1_2 oe1_22 = null;
        ((j30_0)object).T(false);
        Object object2 = re1_1.h();
        if (object2 == null || (object2 = ((NavigationParent)object2).getAltText()) == null) {
            int n4 = R$string.switch_store_banner;
            object2 = hv3_0.K(n4);
        }
        i70$a$b i70$a$b = i70$a.g;
        LP1 lP1 = androidx.compose.foundation.layout.c.a(j.c(LP1$a.b, 1.0f), 4.1666665f);
        ne1_2 ne1_22 = new ne1_2(bf1_22);
        lP1 = androidx.compose.foundation.d.b(lP1, false, null, ne1_22, 7);
        ne1_22 = null;
        int n7 = 24576;
        int n8 = 104;
        Pd1.a(pq_02, (String)object2, lP1, null, i70$a$b, 0.0f, null, (b30_0)object, n7, n8);
        object = ((j30_0)object).X();
        if (object != null) {
            oe1_22 = new oe1_2(string2, bf1_22, n3);
            ((CF2)object).d = oe1_22;
        }
    }

    public static final void b(e e2, bf1_2 bf1_22, oa1_1 oa1_12, b30_0 object, int n3) {
        int n4;
        Intrinsics.checkNotNullParameter(e2, "navController");
        Intrinsics.checkNotNullParameter(bf1_22, "viewModel");
        Object object2 = "loginViewModel";
        Intrinsics.checkNotNullParameter(oa1_12, (String)object2);
        object = object.g(1816339608);
        Object object3 = bf1_22.f;
        Object object4 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        object4 = (mu1_1)((j30_0)object).j((H30)object4);
        Object object5 = new re1$a_0(bf1_22);
        ((LiveData)object3).e((mu1_1)object4, (F62)object5);
        boolean bl2 = f;
        if (!bl2) {
            bf1_22.b();
        }
        object3 = oa1_12.r;
        object4 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        object4 = (mu1_1)((j30_0)object).j((H30)object4);
        object5 = new ge1_2(oa1_12, 0);
        rE1$c rE1$c = new rE1$c((ge1_2)object5);
        ((LiveData)object3).e((mu1_1)object4, rE1$c);
        bl2 = e;
        if (!bl2) {
            Intrinsics.checkNotNullParameter(oa1_12, (String)object2);
            object2 = (UserInformation)bf1_22.e.getValue();
            n4 = (int)(((UserInformation)object2).isUserOnline() ? 1 : 0);
            if (n4 == 0) {
                z40_0.Companion.getClass();
                object2 = z40$a.a((Context)bf1_22.a).a;
                object3 = "enable_Signup_popup";
                n4 = (int)(((ao0_0)object2).a((String)object3) ? 1 : 0);
                if (n4 != 0) {
                    n4 = (int)(vl0_0.a ? 1 : 0);
                    if (n4 != 0) {
                        object2 = vl0_0.b;
                        if (object2 != null) {
                            object3 = oa1_12.r;
                            ((LiveData)object3).k(object2);
                        }
                    } else {
                        oa1_12.e();
                    }
                }
            }
        }
        object2 = (Number)d.getValue();
        n4 = ((Number)object2).intValue();
        bl2 = false;
        object3 = null;
        if (n4 != 0) {
            int n7 = 1;
            if (n4 != n7) {
                n7 = 2;
                if (n4 != n7) {
                    n4 = -41895797;
                    ((j30_0)object).K(n4);
                    ((j30_0)object).T(false);
                } else {
                    n4 = -42149346;
                    ((j30_0)object).K(n4);
                    re1_1.g((b30_0)object, 0);
                    ((j30_0)object).T(false);
                }
            } else {
                ((j30_0)object).K(-41953643);
                n4 = 8;
                sd1_0.a(bf1_22, (b30_0)object, n4);
                ((j30_0)object).T(false);
            }
        } else {
            ((j30_0)object).K(-42062329);
            n4 = 72;
            re1_1.f(e2, bf1_22, (b30_0)object, n4);
            ((j30_0)object).T(false);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new ie1_2(e2, bf1_22, oa1_12, n3);
        }
    }

    public static final void c(CMSNavigation cMSNavigation, bf1_2 bf1_22, te1_1 te1_12, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(cMSNavigation, "item");
        Intrinsics.checkNotNullParameter(bf1_22, "viewModel");
        Intrinsics.checkNotNullParameter(te1_12, "onItemClick");
        object = object.g(-854056415);
        Object object2 = AndroidCompositionLocals_androidKt.a;
        int n4 = ((Configuration)((j30_0)object).j((H30)object2)).screenWidthDp + -24;
        LP1 lP1 = LP1$a.b;
        float f5 = 16;
        float f6 = 12;
        lP1 = h.i(lP1, f5, 0.0f, f5, f6, 2);
        float f7 = n4;
        lP1 = j.k(lP1, f7);
        object2 = new se1_2(cMSNavigation, bf1_22, te1_12);
        u10 u102 = v10.c(69354487, (fx0_2)object2, (b30_0)object);
        int n7 = 3072;
        int n8 = 6;
        OA.a(lP1, null, false, u102, (b30_0)object, n7, n8);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new qe1_2(cMSNavigation, bf1_22, te1_12, n3);
        }
    }

    public static final void d(b30_0 object, int n3) {
        pe1_2 pe1_22;
        int n4 = -849471120;
        object = object.g(n4);
        if (n3 == 0 && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            n4 = 0;
            pe1_22 = null;
            re1_1.e((b30_0)object, 0);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            pe1_22 = new pe1_2(n3);
            ((CF2)object).d = pe1_22;
        }
    }

    public static final void e(b30_0 object, int n3) {
        Object object2;
        int n4 = -470747259;
        object = object.g(n4);
        if (n3 == 0 && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            float f5 = 0.0f;
            rp2_0 rp2_02 = SP2.a(f5);
            object2 = LP1$a.b;
            float f6 = 125;
            object2 = j.d((LP1)object2, f6);
            f6 = 1.0f;
            Object object3 = j.c((LP1)object2, f6);
            float f7 = 16;
            n4 = 12;
            float f8 = n4;
            int n7 = 2;
            LP1 lP1 = h.i((LP1)object3, f7, 0.0f, f7, f8, n7);
            object3 = v10_0.b;
            long l2 = 0L;
            int n8 = 1769478;
            int n10 = 28;
            f7 = 3.9E-44f;
            JL.a(lP1, rp2_02, l2, null, f5, (u10)object3, (b30_0)object, n8, n10);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new he1_1(n3);
        }
    }

    public static final void f(e e2, bf1_2 bf1_22, b30_0 b30_02, int n3) {
        Object object = e2;
        Object object2 = bf1_22;
        Intrinsics.checkNotNullParameter(e2, "navController");
        Intrinsics.checkNotNullParameter(bf1_22, "viewModel");
        int n4 = 877972195;
        Object object3 = b30_02;
        Object object4 = b30_02.g(n4);
        object3 = LP1$a.b;
        int n7 = 1065353216;
        float f5 = 1.0f;
        Object object5 = j.c((LP1)object3, f5);
        Object object6 = zp.c;
        Object object7 = Nc$a.m;
        boolean bl2 = false;
        Integer n8 = null;
        Object object8 = oZ.a((zp$l)object6, (Gx$a)object7, (b30_0)object4, 0);
        int n10 = ((j30_0)object4).P;
        Object object9 = ((j30_0)object4).P();
        object5 = a30_0.c((b30_0)object4, (LP1)object5);
        N20.W.getClass();
        fx0_2 fx0_22 = N20$a.b;
        Object object10 = ((j30_0)object4).a;
        int n14 = object10 instanceof mp;
        String string2 = null;
        if (n14 != 0) {
            Object object11;
            ((j30_0)object4).A();
            n14 = ((j30_0)object4).O;
            if (n14 != 0) {
                ((j30_0)object4).C((Function0)fx0_22);
            } else {
                ((j30_0)object4).n();
            }
            N20$a$b n20$a$b = N20$a.e;
            Ow3.a((b30_0)object4, object8, n20$a$b);
            object8 = N20$a.d;
            Ow3.a((b30_0)object4, object9, (Function2)object8);
            object9 = N20$a.f;
            int n15 = ((j30_0)object4).O;
            if (n15 != 0 || (n15 = Intrinsics.areEqual(object11 = ((j30_0)object4).v(), n8 = Integer.valueOf(n10))) == 0) {
                rk_0.a(n10, (j30_0)object4, n10, (N20$a$a)object9);
            }
            N20$a$c n20$a$c = N20$a.c;
            Ow3.a((b30_0)object4, object5, n20$a$c);
            object5 = j.b(j.c((LP1)object3, f5), f5);
            double d2 = f5;
            double d5 = 0.0;
            double d7 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
            if (d7 > 0) {
                f5 = kotlin.ranges.f.c(f5, Float.MAX_VALUE);
                bl2 = true;
                object11 = new LayoutWeightElement(f5, bl2);
                Object object12 = object5.then((LP1)object11);
                long l2 = OX.b;
                object5 = fg2_1.a;
                object12 = androidx.compose.foundation.a.b((LP1)object12, l2, (i13)object5);
                float f6 = 0.0f;
                object5 = null;
                object6 = oZ.a((zp$l)object6, (Gx$a)object7, (b30_0)object4, 0);
                int n16 = ((j30_0)object4).P;
                object7 = ((j30_0)object4).P();
                object12 = a30_0.c((b30_0)object4, (LP1)object12);
                boolean bl3 = object10 instanceof mp;
                if (bl3) {
                    ((j30_0)object4).A();
                    bl3 = ((j30_0)object4).O;
                    if (bl3) {
                        ((j30_0)object4).C((Function0)fx0_22);
                    } else {
                        ((j30_0)object4).n();
                    }
                    Ow3.a((b30_0)object4, object6, n20$a$b);
                    Ow3.a((b30_0)object4, object7, (Function2)object8);
                    boolean bl4 = ((j30_0)object4).O;
                    if (bl4 || !(bl4 = Intrinsics.areEqual(object6 = ((j30_0)object4).v(), object7 = Integer.valueOf(n16)))) {
                        rk_0.a(n16, (j30_0)object4, n16, (N20$a$a)object9);
                    }
                    Ow3.a((b30_0)object4, object12, n20$a$c);
                    f6 = 24;
                    object3 = h.i((LP1)object3, 0.0f, f6, 0.0f, 0.0f, 13);
                    fx0_22 = new le1_1((bf1_2)object2, (e)object);
                    n10 = 0;
                    n20$a$c = null;
                    object9 = null;
                    n7 = 0;
                    f5 = 0.0f;
                    object12 = null;
                    n16 = 0;
                    f6 = 0.0f;
                    object5 = null;
                    bl4 = false;
                    object6 = null;
                    object7 = null;
                    object8 = null;
                    n14 = 6;
                    n15 = 254;
                    object10 = object4;
                    xq1_0.a((LP1)object3, null, null, false, null, null, null, false, (Function1)fx0_22, (b30_0)object4, n14, n15);
                    ((j30_0)object4).T(true);
                    int n17 = 483170707;
                    ((j30_0)object4).K(n17);
                    object3 = re1_1.h();
                    if (object3 != null) {
                        object3 = ((NavigationParent)object3).getSwitchtoStoreIcon();
                    } else {
                        n17 = 0;
                        object3 = null;
                    }
                    object12 = h40_0.a;
                    object12 = z40_0.Companion;
                    object12 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object12).a;
                    object5 = "hambuger_store_switch_enable";
                    n7 = (int)(((ao0_0)object12).a((String)object5) ? 1 : 0);
                    if (n7 != 0 && object3 != null && (n17 = (int)(kotlin.text.b.k((CharSequence)object3) ? 1 : 0)) == 0) {
                        object3 = re1_1.h();
                        if (object3 != null) {
                            string2 = ((NavigationParent)object3).getSwitchtoStoreIcon();
                        }
                        object3 = string2;
                        n7 = 64;
                        f5 = 9.0E-44f;
                        re1_1.a(string2, (bf1_2)object2, (b30_0)object4, n7);
                    }
                    n17 = 0;
                    object3 = null;
                    n7 = 1;
                    f5 = Float.MIN_VALUE;
                    if ((object4 = fn0_2.a((j30_0)object4, false, n7 != 0)) != null) {
                        n7 = n3;
                        ((CF2)object4).d = object3 = new me1_1((e)object, (bf1_2)object2, n3);
                    }
                    return;
                }
                s20.a();
                throw null;
            }
            object = g9_0.a(f5, "invalid weight ", "; must be greater than zero");
            object = object.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        s20.a();
        throw null;
    }

    public static final void g(b30_0 object, int n3) {
        int n4 = 609191278;
        object = object.g(n4);
        if (n3 == 0 && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            LP1 lP1 = LP1$a.b;
            n4 = 16;
            float f5 = n4;
            lP1 = h.i(lP1, 0.0f, f5, 0.0f, 0.0f, 13);
            je1_1 je1_12 = new Object();
            f5 = 0.0f;
            int n7 = 0x6000006;
            int n8 = 254;
            xq1_0.a(lP1, null, null, false, null, null, null, false, je1_12, (b30_0)object, n7, n8);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ke1_1 ke1_12 = new ke1_1(n3);
            ((CF2)object).d = ke1_12;
        }
    }

    public static final NavigationParent h() {
        return (NavigationParent)c.getValue();
    }
}

