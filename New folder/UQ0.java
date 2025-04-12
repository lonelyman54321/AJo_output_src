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
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.e;
import androidx.navigation.i;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.videoPlayer.model.FleekConfigs;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class UQ0 {
    public static final void a(hq0_1 hq0_12, b30_0 object, int n3) {
        Object object2 = "onCartClicked";
        Intrinsics.checkNotNullParameter(hq0_12, (String)object2);
        object = object.g(-1258604599);
        int n4 = n3 & 0xE;
        int n7 = 2;
        int n8 = 4;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).x(hq0_12) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n10 = n4 & 0xB;
        if (n10 == n7 && (n7 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            n7 = R$drawable.fleek_cart;
            n10 = 0;
            LP1 lP1 = null;
            im2 im22 = km2.a(n7, (b30_0)object, 0);
            int n14 = R$string.acc_cart_icon;
            String string2 = hv3_0.K(n14);
            LP1 lP12 = LP1$a.b;
            float f5 = 6;
            float f6 = 16;
            int n15 = 0;
            int n16 = 10;
            lP12 = h.i(lP12, f5, 0.0f, f6, 0.0f, n16);
            int n17 = 2112303845;
            f5 = 3.841449E37f;
            ((j30_0)object).K(n17);
            if ((n4 &= 0xE) == n8) {
                n4 = 1;
            } else {
                n4 = 0;
                object2 = null;
            }
            Object object3 = ((j30_0)object).v();
            if (n4 != 0 || object3 == (object2 = b30$a.a)) {
                n4 = 0;
                object2 = null;
                object3 = new eq0_1(hq0_12, 0);
                ((j30_0)object).o(object3);
            }
            object3 = (Function0)object3;
            ((j30_0)object).T(false);
            lP1 = d.b(lP12, false, null, (Function0)object3, 7);
            n17 = 0;
            f5 = 0.0f;
            n4 = 0;
            object2 = null;
            lP12 = null;
            n15 = 8;
            n16 = 120;
            object3 = string2;
            n14 = 0;
            string2 = null;
            Pd1.a(im22, (String)object3, lP1, null, null, 0.0f, null, (b30_0)object, n15, n16);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new fq0_1(hq0_12, n3);
        }
    }

    public static final void b(boolean bl2, int n3, hq0_1 hq0_12, b30_0 object, int n4) {
        Object object2 = "onCartClicked";
        Intrinsics.checkNotNullParameter(hq0_12, (String)object2);
        object = object.g(-1339094579);
        int n7 = n4 & 0xE;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).a(bl2) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n4;
        } else {
            n7 = n4;
        }
        int n8 = n4 & 0x70;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object).c(n3) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        if ((n8 = n4 & 0x380) == 0) {
            n8 = (int)(((j30_0)object).x(hq0_12) ? 1 : 0);
            n8 = n8 != 0 ? 256 : 128;
            n7 |= n8;
        }
        if ((n7 &= 0x2DB) == (n8 = 146) && (n7 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            object2 = new qq0_1(bl2, n3);
            n8 = -1874561467;
            object2 = v10.c(n8, (fx0_2)object2, (b30_0)object);
            gx0_2 gx0_22 = new rq0_0(hq0_12);
            gx0_22 = v10.c(632536007, gx0_22, (b30_0)object);
            int n10 = 390;
            Iu.b((u10)object2, null, (u10)gx0_22, (b30_0)object, n10);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new kq0_1(bl2, n3, hq0_12, n4);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void c(int n3, b30_0 b30_02, dr0_0 dr0_02, yT1 yT12) {
        void var19_22;
        boolean bl2;
        Integer n4;
        boolean bl3;
        dr0_0 dr0_03 = dr0_02;
        yT1 yT13 = yT12;
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        Intrinsics.checkNotNullParameter(yT12, "bottomNavigationController");
        int n7 = -1212142547;
        Object object = b30_02;
        Object object2 = b30_02.g(n7);
        object = AndroidCompositionLocals_androidKt.b;
        object = zv0_2.b((Context)((j30_0)object2).j((H30)object));
        int n8 = object instanceof Activity;
        Object object3 = n8 != 0 ? (object = (Activity)object) : null;
        int n10 = ((Number)dr0_03.Q.getValue()).intValue();
        object = zp.f;
        Gx$b gx$b = Nc$a.k;
        LP1$a lP1$a = LP1$a.b;
        n8 = 1065353216;
        float f5 = 1.0f;
        Object object4 = j.c(lP1$a, f5);
        long l2 = nz_1.a;
        Object object5 = fg2_1.a;
        object4 = a.b((LP1)object4, l2, (i13)object5);
        object = iQ2.a((zp$e)object, gx$b, (b30_0)object2, 54);
        int n14 = ((j30_0)object2).P;
        Object object6 = ((j30_0)object2).P();
        object4 = a30_0.c((b30_0)object2, (LP1)object4);
        object5 = N20.W;
        object5.getClass();
        Xp1$a xp1$a = N20$a.b;
        mp mp2 = ((j30_0)object2).a;
        int n15 = mp2 instanceof mp;
        if (n15 == 0) {
            s20.a();
            throw null;
        }
        ((j30_0)object2).A();
        n15 = ((j30_0)object2).O;
        if (n15 != 0) {
            ((j30_0)object2).C(xp1$a);
        } else {
            ((j30_0)object2).n();
        }
        Object object7 = N20$a.e;
        Ow3.a((b30_0)object2, object, (Function2)object7);
        object5 = N20$a.d;
        Ow3.a((b30_0)object2, object6, (Function2)object5);
        object6 = N20$a.f;
        boolean bl4 = ((j30_0)object2).O;
        if (bl4 || !(bl3 = Intrinsics.areEqual(object = ((j30_0)object2).v(), n4 = Integer.valueOf(n14)))) {
            rk_0.a(n14, (j30_0)object2, n14, (N20$a$a)object6);
        }
        N20$a$c n20$a$c = N20$a.c;
        Ow3.a((b30_0)object2, object4, n20$a$c);
        int n16 = 120;
        float f6 = n16;
        object = j.k(lP1$a, f6);
        object4 = h40_0.a;
        object4 = h40_0.x();
        if (object4 == null || (object4 = ((FleekConfigs)object4).getFleekAppBarLogo()) == null) {
            n8 = R$drawable.fleek_logo;
            object4 = n8;
        }
        int n17 = R$drawable.fleek_logo;
        String string2 = hv3_0.K(R$string.acc_fleek_logo);
        int n18 = 8;
        int n19 = 70;
        Object object8 = object6;
        Object object9 = object5;
        object5 = string2;
        N20$a$b n20$a$b = object7;
        object7 = object2;
        int n20 = n10;
        ov3.l((LP1)object, object4, n17, null, string2, (b30_0)object2, n19, n18);
        object = zp.a;
        f5 = 6.7E-44f;
        object = iQ2.a((zp$e)object, gx$b, (b30_0)object2, 48);
        n8 = ((j30_0)object2).P;
        Object object10 = ((j30_0)object2).P();
        object6 = a30_0.c((b30_0)object2, lP1$a);
        object5 = mp2;
        n15 = mp2 instanceof mp;
        if (n15 == 0) {
            s20.a();
            throw null;
        }
        ((j30_0)object2).A();
        n15 = ((j30_0)object2).O;
        if (n15 != 0) {
            ((j30_0)object2).C(xp1$a);
        } else {
            ((j30_0)object2).n();
        }
        object5 = n20$a$b;
        Ow3.a((b30_0)object2, object, n20$a$b);
        object = object9;
        Ow3.a((b30_0)object2, object10, (Function2)object9);
        boolean bl5 = ((j30_0)object2).O;
        if (bl5 || !(bl2 = Intrinsics.areEqual(object = ((j30_0)object2).v(), object10 = Integer.valueOf(n8)))) {
            object = object8;
            rk_0.a(n8, (j30_0)object2, n8, (N20$a$a)object8);
        }
        Ow3.a((b30_0)object2, object6, n20$a$c);
        object = new dq0_0((Activity)object3, dr0_03, yT13);
        n8 = 0;
        f5 = 0.0f;
        object4 = null;
        UQ0.e((dq0_0)object, (b30_0)object2, 0);
        object = new gq0_2((Activity)object3, dr0_03, yT13);
        UQ0.d(false, (gq0_2)object, (b30_0)object2, 0);
        boolean bl6 = true;
        f6 = Float.MIN_VALUE;
        if (n20 > 0) {
            boolean bl7 = true;
        } else {
            boolean bl8 = false;
            object10 = null;
        }
        object6 = new hq0_1((Activity)object3, dr0_03, yT13);
        n15 = n20;
        UQ0.b((boolean)var19_22, n20, (hq0_1)object6, (b30_0)object2, 0);
        object2 = fn0_2.a((j30_0)object2, bl6, bl6);
        if (object2 != null) {
            n8 = n3;
            ((CF2)object2).d = object = new iq0_1(dr0_03, yT13, n3);
        }
    }

    public static final void d(boolean bl2, gq0_2 gq0_22, b30_0 object, int n3) {
        Object object2 = "onWishlistClicked";
        Intrinsics.checkNotNullParameter(gq0_22, (String)object2);
        object = object.g(-1342483957);
        int n4 = n3 | 6;
        int n7 = n3 & 0x70;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).x(gq0_22) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n4 |= n7;
        }
        if ((n4 &= 0x5B) == (n7 = 18) && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            n4 = 0;
            object2 = null;
            gx0_2 gx0_22 = new sq0_2(false);
            n7 = -1877950845;
            gx0_22 = v10.c(n7, gx0_22, (b30_0)object);
            gx0_2 gx0_23 = new tq0_0(gq0_22);
            gx0_23 = v10.c(629146629, gx0_23, (b30_0)object);
            int n8 = 390;
            Iu.b((u10)gx0_22, null, (u10)gx0_23, (b30_0)object, n8);
            bl2 = false;
            gx0_22 = null;
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new jq0_1(bl2, gq0_22, n3);
        }
    }

    public static final void e(dq0_0 dq0_02, b30_0 object, int n3) {
        Object object2 = "onSearchClicked";
        Intrinsics.checkNotNullParameter(dq0_02, (String)object2);
        object = object.g(-2062323199);
        int n4 = n3 & 0xE;
        int n7 = 4;
        int n8 = 2;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).x(dq0_02) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n10 = n4 & 0xB;
        if (n10 == n8 && (n10 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            n10 = R$drawable.fleek_search;
            Object object3 = km2.a(n10, (b30_0)object, 0);
            int n14 = R$string.acc_search_icon;
            String string2 = hv3_0.K(n14);
            LP1$a lP1$a = LP1$a.b;
            int n15 = 6;
            float f5 = n15;
            Object object4 = h.g(lP1$a, f5, 0.0f, n8);
            int n16 = 1514686351;
            ((j30_0)object).K(n16);
            if ((n4 &= 0xE) == n7) {
                n4 = 1;
            } else {
                n4 = 0;
                object2 = null;
            }
            Object object5 = ((j30_0)object).v();
            if (n4 != 0 || object5 == (object2 = b30$a.a)) {
                n4 = 0;
                object2 = null;
                object5 = new lq0_1(dq0_02, 0);
                ((j30_0)object).o(object5);
            }
            object5 = (Function0)object5;
            ((j30_0)object).T(false);
            n4 = 7;
            object2 = d.b((LP1)object4, false, null, (Function0)object5, n4);
            n16 = 0;
            lP1$a = null;
            n15 = 0;
            f5 = 0.0f;
            int n17 = 8;
            int n18 = 120;
            object5 = object3;
            object4 = string2;
            object3 = object2;
            n14 = 0;
            string2 = null;
            Pd1.a((im2)object5, (String)object4, (LP1)object2, null, null, 0.0f, null, (b30_0)object, n17, n18);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new mq0_0(dq0_02, n3);
        }
    }

    public static final void f(gq0_2 gq0_22, b30_0 object, int n3) {
        Object object2 = "onWishlistClicked";
        Intrinsics.checkNotNullParameter(gq0_22, (String)object2);
        object = object.g(921250180);
        int n4 = n3 & 0xE;
        int n7 = 4;
        int n8 = 2;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).x(gq0_22) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n10 = n4 & 0xB;
        if (n10 == n8 && (n10 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            n10 = R$drawable.fleek_wishlist;
            Object object3 = km2.a(n10, (b30_0)object, 0);
            int n14 = R$string.acc_wishlist_icon;
            String string2 = hv3_0.K(n14);
            LP1$a lP1$a = LP1$a.b;
            int n15 = 6;
            float f5 = n15;
            Object object4 = h.g(lP1$a, f5, 0.0f, n8);
            int n16 = 1425203374;
            ((j30_0)object).K(n16);
            if ((n4 &= 0xE) == n7) {
                n4 = 1;
            } else {
                n4 = 0;
                object2 = null;
            }
            Object object5 = ((j30_0)object).v();
            if (n4 != 0 || object5 == (object2 = b30$a.a)) {
                n4 = 0;
                object2 = null;
                object5 = new nq0_1(gq0_22, 0);
                ((j30_0)object).o(object5);
            }
            object5 = (Function0)object5;
            ((j30_0)object).T(false);
            n4 = 7;
            object2 = d.b((LP1)object4, false, null, (Function0)object5, n4);
            n16 = 0;
            lP1$a = null;
            n15 = 0;
            f5 = 0.0f;
            int n17 = 8;
            int n18 = 120;
            object5 = object3;
            object4 = string2;
            object3 = object2;
            n14 = 0;
            string2 = null;
            Pd1.a((im2)object5, (String)object4, (LP1)object2, null, null, 0.0f, null, (b30_0)object, n17, n18);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new oq0_1(gq0_22, n3);
        }
    }

    public static final String g(yT1 object) {
        boolean bl2;
        String string2 = "bottomNavigationController";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((e)object).h();
        if (object != null) {
            object = ((i)object).h;
        } else {
            bl2 = false;
            object = null;
        }
        string2 = "feed?postId={postId}";
        boolean bl3 = Intrinsics.areEqual(object, string2);
        object = bl3 ? "feed screen" : ((bl2 = Intrinsics.areEqual(object, string2 = "explore-brands")) ? "explore brands screen" : "");
        return object;
    }
}

