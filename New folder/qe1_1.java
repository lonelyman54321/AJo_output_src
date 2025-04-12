/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BlendModeColorFilter
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.os.Build$VERSION
 */
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$font;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Home.CMSNavigation;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QE1
 */
public final class qe1_1
implements Function2 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ CMSNavigation b;
    public final /* synthetic */ boolean c;

    public qe1_1(ve1_1 ve1_12, CMSNavigation cMSNavigation, boolean bl2) {
        this.a = ve1_12;
        this.b = cMSNavigation;
        this.c = bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2) {
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        boolean bl2;
        boolean bl3;
        Object object7;
        Xp1$a xp1$a;
        Object object8;
        int n3;
        int n4;
        int n7;
        float f5;
        float f6;
        int n8;
        int n10;
        float f7;
        Object object9;
        Object object10;
        Object object11;
        int n14;
        int n15;
        Object object12;
        Object object13;
        int n16;
        float f8;
        int n17;
        qe1_1 qe1_12;
        block18: {
            block17: {
                qe1_12 = this;
                n17 = 0;
                f8 = 0.0f;
                Object var6_6 = null;
                n16 = 1;
                object13 = object;
                object13 = (b30_0)object;
                object12 = object2;
                object12 = (Number)object2;
                n15 = ((Number)object12).intValue() & 0xB;
                if (n15 == (n14 = 2) && (n15 = (int)(object13.h() ? 1 : 0)) != 0) {
                    object13.D();
                    return Unit.a;
                }
                object11 = LP1$a.b;
                object12 = new Object();
                object12 = CY2.b((LP1)object11, n16 != 0, (Function1)object12);
                ve1_1 ve1_12 = (ve1_1)qe1_12.a;
                object10 = qe1_12.b;
                object9 = new pe1_1(0, ve1_12, object10);
                f7 = 9.8E-45f;
                n10 = 0;
                object12 = d.b((LP1)object12, false, null, (Function0)object9, 7);
                n8 = 1065353216;
                f6 = 1.0f;
                LP1 lP1 = j.c((LP1)object12, f6);
                n15 = 30;
                f5 = n15;
                n7 = 5;
                n4 = 0;
                object12 = h.i(lP1, 0.0f, f5, 0.0f, f5, n7);
                object9 = zp.c;
                Gx$a gx$a = Nc$a.m;
                object9 = oZ.a((zp$l)object9, gx$a, (b30_0)object13, 0);
                n3 = object13.F();
                object8 = object13.m();
                object12 = a30_0.c((b30_0)object13, (LP1)object12);
                N20.W.getClass();
                xp1$a = N20$a.b;
                object7 = object13.i();
                bl3 = object7 instanceof mp;
                if (!bl3) {
                    s20.a();
                    throw null;
                }
                object13.A();
                bl3 = object13.e();
                if (bl3) {
                    object13.C(xp1$a);
                } else {
                    object13.n();
                }
                object7 = N20$a.e;
                Ow3.a((b30_0)object13, object9, (Function2)object7);
                object9 = N20$a.d;
                Ow3.a((b30_0)object13, object8, (Function2)object9);
                object8 = N20$a.f;
                bl2 = object13.e();
                if (bl2 || !(bl2 = Intrinsics.areEqual(object6 = object13.v(), object5 = Integer.valueOf(n3)))) {
                    re0_0.a(n3, (b30_0)object13, n3, (N20$a$a)object8);
                }
                N20$a$c n20$a$c = N20$a.c;
                Ow3.a((b30_0)object13, object12, n20$a$c);
                object12 = j.c;
                object6 = Nc$a.k;
                object5 = zp.f;
                int n18 = 54;
                object6 = iQ2.a((zp$e)object5, (Gx$b)object6, (b30_0)object13, n18);
                n7 = object13.F();
                object4 = object13.m();
                object12 = a30_0.c((b30_0)object13, (LP1)object12);
                object3 = object13.i();
                n16 = object3 instanceof mp;
                if (n16 == 0) {
                    s20.a();
                    throw null;
                }
                object13.A();
                n16 = object13.e();
                if (n16 != 0) {
                    object13.C(xp1$a);
                } else {
                    object13.n();
                }
                Ow3.a((b30_0)object13, object6, (Function2)object7);
                Ow3.a((b30_0)object13, object4, (Function2)object9);
                n16 = object13.e();
                if (n16 != 0 || (n16 = Intrinsics.areEqual(object3 = object13.v(), object9 = Integer.valueOf(n7))) == 0) {
                    re0_0.a(n7, (b30_0)object13, n7, (N20$a$a)object8);
                }
                Ow3.a((b30_0)object13, object12, n20$a$c);
                object3 = ((CMSNavigation)object10).getName();
                if (object3 == null) break block17;
                object12 = Locale.ROOT;
                object3 = ((String)object3).toUpperCase((Locale)object12);
                object12 = "toUpperCase(...)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object12);
                if (object3 != null) break block18;
            }
            object3 = "";
        }
        object12 = object3;
        n16 = 14;
        long l2 = Em3.f(n16);
        object3 = ZU0.a(R$font.muli_regular, null, 0, n16);
        LU0[] lU0Array = new LU0[]{object3};
        Object object14 = SU0.a(lU0Array);
        n8 = 700;
        f6 = 9.81E-43f;
        object3 = new tv0_0(n8);
        long l3 = zx_0.d(0xFF202020L);
        long l4 = 0L;
        int n19 = 0xFFFFD8;
        long l7 = 0L;
        xm3 xm32 = new xm3(l3, l2, (tv0_0)object3, (av0_0)object14, l7, null, 0, l4, n19);
        n16 = 3;
        object9 = j.n((LP1)object11, null, n16);
        n3 = 15;
        f7 = n3;
        object8 = null;
        int n20 = 0;
        xp1$a = null;
        object9 = h.i((LP1)object9, f7, 0.0f, 0.0f, 0.0f, 14);
        n4 = 1;
        pa_0 pa_02 = new pa_0(object10, n4);
        object14 = CY2.b((LP1)object9, false, pa_02);
        object4 = new Cj3(n16);
        int n21 = 65020;
        long l8 = 0L;
        long l12 = 0L;
        bl3 = false;
        object7 = null;
        bl2 = false;
        f5 = 0.0f;
        object6 = null;
        n7 = 0;
        object5 = null;
        long l14 = 0L;
        CMSNavigation cMSNavigation = object10;
        object10 = null;
        long l15 = 0L;
        int n22 = 0;
        LP1$a lP1$a = object11;
        object11 = object14;
        object = object13;
        object13 = object4;
        object14 = xm32;
        Ll3.b((String)object12, (LP1)object11, l8, l12, null, null, null, l14, null, (Cj3)object4, l15, 0, false, 0, 0, null, xm32, (b30_0)object, 0, 0, n21);
        n15 = 1197186041;
        object4 = object;
        object.K(n15);
        object12 = cMSNavigation.getChildDetails();
        if (object12 != null) {
            n15 = object12.size();
        } else {
            n15 = 0;
            object12 = null;
        }
        if (n15 > 0) {
            void var6_9;
            n15 = (int)(qe1_12.c ? 1 : 0);
            n14 = n15 != 0 ? R$drawable.arrow_up : R$drawable.arrow_down;
            n15 = n15 != 0 ? R$string.acc_up_arrow_icon : R$string.acc_down_arrow_icon;
            object9 = object12 = hv3_0.K(n15);
            object12 = km2.a(n14, (b30_0)object4, 0);
            long l16 = OX.b;
            n17 = Build.VERSION.SDK_INT;
            n14 = 29;
            n20 = 5;
            if (n17 >= n14) {
                BlendModeColorFilter blendModeColorFilter = gy_0.a.a(l16, n20);
            } else {
                n14 = zx_0.i(l16);
                object6 = Lf.b(n20);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(n14, (PorterDuff.Mode)object6);
            }
            object7 = new ay_1(l16, n20, (ColorFilter)var6_9);
            object8 = i70$a.b;
            LP1$a lP1$a2 = lP1$a;
            n14 = 0;
            object10 = j.n(lP1$a, null, n16);
            n17 = 23;
            f8 = n17;
            object13 = null;
            n22 = 11;
            LP1 lP1 = h.i((LP1)object10, 0.0f, 0.0f, f8, 0.0f, n22);
            n7 = 0x186188;
            n10 = 40;
            n3 = 0;
            f7 = 0.0f;
            Object var14_25 = null;
            n20 = 0;
            xp1$a = null;
            object11 = object9;
            object9 = lP1;
            object6 = object4;
            Pd1.a((im2)object12, (String)object11, lP1, null, (i70_0)object8, 0.0f, (TX)object7, (b30_0)object4, n7, n10);
        }
        object4.E();
        object4.p();
        object4.p();
        return Unit.a;
    }
}

