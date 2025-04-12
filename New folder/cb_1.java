/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.os.Build$VERSION
 */
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$font;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cb
 */
public final class cb_1
implements Function2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j7_0 c;
    public final /* synthetic */ CMSNavigation d;
    public final /* synthetic */ long e;

    public cb_1(long l2, boolean bl2, j7_0 j7_02, CMSNavigation cMSNavigation, long l3) {
        this.a = l2;
        this.b = bl2;
        this.c = j7_02;
        this.d = cMSNavigation;
        this.e = l3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2) {
        xm3 xm32;
        Object object3;
        Object object4;
        int n3;
        cb_1 cb_12 = this;
        int n4 = 0;
        Object var5_5 = null;
        Object object5 = object;
        object5 = (b30_0)object;
        Object object6 = object2;
        object6 = (Number)object2;
        int n7 = ((Number)object6).intValue() & 0xB;
        if (n7 == (n3 = 2) && (n7 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
            return Unit.a;
        }
        Object object7 = LP1$a.b;
        int n8 = 1065353216;
        float f5 = 1.0f;
        object6 = j.c((LP1)object7, f5);
        Object object8 = zp.c;
        Object object9 = Nc$a.m;
        object8 = oZ.a((zp$l)object8, (Gx$a)object9, (b30_0)object5, 0);
        int n10 = object5.F();
        Object object10 = object5.m();
        object6 = a30_0.c((b30_0)object5, (LP1)object6);
        N20.W.getClass();
        Object object11 = N20$a.b;
        Object object12 = object5.i();
        int n14 = object12 instanceof mp;
        boolean bl2 = false;
        if (n14 == 0) {
            s20.a();
            throw null;
        }
        object5.A();
        n14 = object5.e();
        if (n14 != 0) {
            object5.C((Function0)object11);
        } else {
            object5.n();
        }
        object12 = N20$a.e;
        Ow3.a((b30_0)object5, object8, (Function2)object12);
        object8 = N20$a.d;
        Ow3.a((b30_0)object5, object10, (Function2)object8);
        object10 = N20$a.f;
        int n15 = object5.e();
        if (n15 != 0 || (n15 = Intrinsics.areEqual(object4 = object5.v(), object3 = Integer.valueOf(n10))) == 0) {
            re0_0.a(n10, (b30_0)object5, n10, (N20$a$a)object10);
        }
        object9 = N20$a.c;
        Ow3.a((b30_0)object5, object6, (Function2)object9);
        object6 = fg2_1.a;
        long l2 = cb_12.a;
        Object object13 = androidx.compose.foundation.a.b((LP1)object7, l2, (i13)object6);
        n8 = 15;
        f5 = n8;
        int n16 = 13;
        float f6 = n16;
        Object object14 = androidx.compose.foundation.a.b(h.h((LP1)object13, f5, f5, f6, f5), l2, (i13)object6);
        LU0[] lU0Array = j.c;
        object14 = object14.then((LP1)lU0Array);
        lU0Array = Nc$a.k;
        object4 = zp.f;
        int n17 = 54;
        lU0Array = iQ2.a((zp$e)object4, (Gx$b)lU0Array, (b30_0)object5, n17);
        n15 = object5.F();
        object3 = object5.m();
        object14 = a30_0.c((b30_0)object5, (LP1)object14);
        object13 = object5.i();
        boolean bl3 = object13 instanceof mp;
        if (!bl3) {
            s20.a();
            throw null;
        }
        object5.A();
        bl3 = object5.e();
        if (bl3) {
            object5.C((Function0)object11);
        } else {
            object5.n();
        }
        Ow3.a((b30_0)object5, lU0Array, (Function2)object12);
        Ow3.a((b30_0)object5, object3, (Function2)object8);
        n3 = (int)(object5.e() ? 1 : 0);
        if (n3 != 0 || (n3 = (int)(Intrinsics.areEqual(object8 = object5.v(), lU0Array = Integer.valueOf(n15)) ? 1 : 0)) == 0) {
            re0_0.a(n15, (b30_0)object5, n15, (N20$a$a)object10);
        }
        Ow3.a((b30_0)object5, object14, (Function2)object9);
        object14 = cb_12.d;
        object8 = ((CMSNavigation)object14).getName();
        if (object8 == null) {
            object8 = "";
        }
        n10 = 14;
        long l3 = Em3.f(n10);
        long l4 = Em3.f(n10);
        object9 = ZU0.a(R$font.muli_regular, null, 0, n10);
        lU0Array = new LU0[]{object9};
        av0_0 av0_02 = SU0.a(lU0Array);
        int n18 = 700;
        object9 = new tv0_0(n18);
        long l7 = 0L;
        int n19 = 0xFFFFD8;
        long l8 = cb_12.e;
        long l12 = 0L;
        Object object15 = xm32;
        xm32 = new xm3(l8, l4, (tv0_0)object9, av0_02, l12, null, 0, l7, n19);
        n8 = 3;
        f5 = 4.2E-45f;
        object9 = j.n((LP1)object7, null, n8);
        object10 = new bb_1(object14, 0);
        object15 = CY2.b((LP1)object9, false, (Function1)object10);
        object4 = new Cj3(n8);
        int n20 = 65012;
        long l14 = 0L;
        object11 = null;
        n14 = 0;
        object12 = null;
        Object object16 = object4;
        n15 = 0;
        object4 = null;
        long l15 = l8;
        l8 = 0L;
        bl2 = false;
        long l16 = 0L;
        int n21 = 3072;
        Object object17 = object6;
        object6 = object8;
        object8 = object15;
        LP1$a lP1$a = object7;
        object = object5;
        object5 = object16;
        Ll3.b((String)object6, (LP1)object15, l14, l3, null, null, null, l8, null, (Cj3)object16, l16, 0, false, 0, 0, null, xm32, (b30_0)object, n21, 0, n20);
        n7 = -1945595988;
        float f7 = -1.0520294E-31f;
        object13 = object;
        object.K(n7);
        object6 = ((CMSNavigation)object14).getChildDetails();
        if (object6 != null) {
            n7 = object6.size();
        } else {
            n7 = 0;
            f7 = 0.0f;
            object6 = null;
        }
        bl2 = cb_12.b;
        if (n7 > 0) {
            n7 = bl2 ? R$drawable.arrow_up : R$drawable.arrow_down;
            n3 = bl2 ? R$string.acc_up_arrow_icon : R$string.acc_down_arrow_icon;
            object8 = hv3_0.K(n3);
            object6 = km2.a(n7, (b30_0)object13, 0);
            object7 = i70$a.b;
            LP1$a lP1$a2 = lP1$a;
            n10 = 0;
            object9 = j.n(lP1$a, null, 3);
            n18 = Build.VERSION.SDK_INT;
            n8 = 29;
            f5 = 4.1E-44f;
            n14 = 5;
            if (n18 >= n8) {
                object10 = gy_0.a;
                l2 = l15;
                object10 = ((gy_0)object10).a(l15, n14);
            } else {
                l2 = l15;
                n8 = zx_0.i(l15);
                object5 = Lf.b(n14);
                object10 = new PorterDuffColorFilter(n8, (PorterDuff.Mode)object5);
            }
            object11 = new ay_1(l2, n14, (ColorFilter)object10);
            n15 = 24968;
            n17 = 40;
            n18 = 0;
            object10 = null;
            n8 = 0;
            f5 = 0.0f;
            lU0Array = null;
            object12 = object13;
            Pd1.a((im2)object6, (String)object8, (LP1)object9, null, (i70_0)object7, 0.0f, (TX)object11, (b30_0)object13, n15, n17);
        } else {
            LP1$a lP1$a3 = lP1$a;
        }
        object13.E();
        object13.p();
        n7 = 1368568421;
        f7 = 7.875727E10f;
        object13.K(n7);
        if (bl2) {
            void var5_8;
            LP1 lP1 = j.c((LP1)var5_8, 1.0f);
            long l17 = xx_1.m;
            object9 = object17;
            LP1 lP12 = androidx.compose.foundation.a.b(lP1, l17, (i13)object17);
            n7 = 1;
            f7 = n7;
            LP1 lP13 = j.d(lP12, f7);
            Q93.b((b30_0)object13, lP13);
            n4 = 72;
            object6 = cb_12.c;
            eb_0.c((j7_0)object6, (CMSNavigation)object14, (b30_0)object13, n4);
        }
        object13.E();
        object13.p();
        return Unit.a;
    }
}

