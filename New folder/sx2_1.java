/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.draw.b;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.videoPlayer.model.FleekConfigs;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sX2
 */
public final class sx2_1 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(b30_0 b30_02, int n3) {
        boolean bl2;
        int n4 = n3;
        int n7 = -1353504558;
        Object object = b30_02;
        Object object2 = b30_02.g(n7);
        if (n3 == 0 && (bl2 = ((j30_0)object2).h())) {
            ((j30_0)object2).D();
        } else {
            LP1$a lP1$a = LP1$a.b;
            int n8 = 1065353216;
            float f5 = 1.0f;
            Object object3 = j.c(lP1$a, f5);
            float f6 = uq0_0.o;
            float f7 = 0.0f;
            int n10 = 0;
            int n14 = 13;
            float f8 = f6;
            object3 = h.i((LP1)object3, 0.0f, f6, 0.0f, 0.0f, n14);
            Object object4 = Nc$a.e;
            int n15 = 0;
            av0_0 av0_02 = null;
            object4 = HA.e((Nc)object4, false);
            int n16 = ((j30_0)object2).P;
            Object object5 = ((j30_0)object2).P();
            object3 = a30_0.c((b30_0)object2, (LP1)object3);
            Object object6 = N20.W;
            object6.getClass();
            Xp1$a xp1$a = N20$a.b;
            mp mp2 = ((j30_0)object2).a;
            boolean bl3 = mp2 instanceof mp;
            if (!bl3) {
                s20.a();
                throw null;
            }
            ((j30_0)object2).A();
            bl3 = ((j30_0)object2).O;
            if (bl3) {
                ((j30_0)object2).C(xp1$a);
            } else {
                ((j30_0)object2).n();
            }
            N20$a$b n20$a$b = N20$a.e;
            Ow3.a((b30_0)object2, object4, n20$a$b);
            N20$a$d n20$a$d = N20$a.d;
            Ow3.a((b30_0)object2, object5, n20$a$d);
            object6 = N20$a.f;
            n10 = ((j30_0)object2).O;
            if (n10 != 0 || (n10 = Intrinsics.areEqual(object4 = ((j30_0)object2).v(), object5 = Integer.valueOf(n16))) == 0) {
                rk_0.a(n16, (j30_0)object2, n16, (N20$a$a)object6);
            }
            object5 = N20$a.c;
            Ow3.a((b30_0)object2, object3, (Function2)object5);
            object3 = Nc$a.n;
            zp$c zp$c = zp.d;
            object4 = j.m(j.c(lP1$a, f5));
            f5 = uq0_0.h;
            int n17 = 5;
            float f11 = 7.0E-45f;
            Object object7 = zp$c;
            zp$c = null;
            Object object8 = object5;
            f7 = f6;
            Object object9 = object6;
            object6 = null;
            N20$a$d n20$a$d2 = n20$a$d;
            object = object9;
            f6 = f11;
            LP1 lP1 = h.i((LP1)object4, 0.0f, f7, 0.0f, f5, n17);
            n10 = R$drawable.bg_black_seen;
            im2 im22 = km2.a(n10, (b30_0)object2, 0);
            i70$a$d i70$a$d = i70$a.d;
            Gx gx = Nc$a.b;
            int n18 = 0;
            int n19 = 50;
            object4 = b.a(lP1, im22, gx, i70$a$d, 0.0f, null, n19);
            f8 = 7.6E-44f;
            object3 = oZ.a((zp$l)object7, (Gx$a)object3, (b30_0)object2, 54);
            n16 = ((j30_0)object2).P;
            object5 = ((j30_0)object2).P();
            object4 = a30_0.c((b30_0)object2, (LP1)object4);
            bl3 = mp2 instanceof mp;
            if (!bl3) {
                s20.a();
                throw null;
            }
            ((j30_0)object2).A();
            bl3 = ((j30_0)object2).O;
            if (bl3) {
                ((j30_0)object2).C(xp1$a);
            } else {
                ((j30_0)object2).n();
            }
            Ow3.a((b30_0)object2, object3, n20$a$b);
            object3 = n20$a$d2;
            Ow3.a((b30_0)object2, object5, n20$a$d2);
            int n20 = ((j30_0)object2).O;
            if (n20 != 0 || (n20 = Intrinsics.areEqual(object3 = ((j30_0)object2).v(), object5 = Integer.valueOf(n16))) == 0) {
                rk_0.a(n16, (j30_0)object2, n16, (N20$a$a)object);
            }
            object = object8;
            Ow3.a((b30_0)object2, object4, (Function2)object8);
            int n21 = R$drawable.feed_seen_image;
            object = km2.a(n21, (b30_0)object2, 0);
            n20 = R$string.acc_seen_icon;
            object3 = hv3_0.K(n20);
            bl3 = false;
            object6 = null;
            n14 = 0;
            n20$a$d = null;
            n10 = 0;
            object4 = null;
            n16 = 0;
            f8 = 0.0f;
            zp$c = null;
            f7 = 0.0f;
            object5 = null;
            n15 = 8;
            int n22 = 124;
            object9 = object2;
            Pd1.a((im2)object, (String)object3, null, null, null, 0.0f, null, (b30_0)object2, n15, n22);
            object = h40_0.a;
            object = h40_0.x();
            if (object == null || (object = ((FleekConfigs)object).getFleekSeenBannerMsg()) == null) {
                object = "";
            }
            f8 = uq0_0.k;
            f7 = 0.0f;
            object5 = null;
            bl3 = false;
            object6 = null;
            object4 = null;
            object3 = lP1$a;
            object3 = h.i(lP1$a, 0.0f, f8, 0.0f, 0.0f, 13);
            long l2 = oj3_2.d;
            n10 = 400;
            object9 = new tv0_0(n10);
            av0_02 = y20_0.a;
            long l3 = nz_1.b;
            object7 = new Cj3(3);
            i70$a$d = null;
            n18 = 1772592;
            n14 = 0;
            n20$a$d = null;
            long l4 = 0L;
            mp2 = null;
            long l7 = 0L;
            n17 = 0;
            f11 = 0.0f;
            lP1 = null;
            im22 = null;
            gx = null;
            n19 = 0;
            int n24 = 130448;
            Ll3.b((String)object, (LP1)object3, l3, l2, null, (tv0_0)object9, av0_02, l4, null, (Cj3)object7, l7, 0, false, 0, 0, null, null, (b30_0)object2, n18, 0, n24);
            boolean bl4 = true;
            f5 = Float.MIN_VALUE;
            ((j30_0)object2).T(bl4);
            ((j30_0)object2).T(bl4);
        }
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            ((CF2)object2).d = object = new rx2_1(n4);
        }
    }
}

