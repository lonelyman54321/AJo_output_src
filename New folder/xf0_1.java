/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.layout.c;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XF0
 */
public final class xf0_1
implements gx0_2 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Configuration d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ ib3_0 f;

    public xf0_1(Subcomponent subcomponent, nf0_1 nf0_12, int n3, Configuration configuration, nh0_0 nh0_02, ib3_0 ib3_02) {
        this.a = subcomponent;
        this.b = nf0_12;
        this.c = n3;
        this.d = configuration;
        this.e = nh0_02;
        this.f = ib3_02;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block11: {
            block10: {
                long l2;
                float f5;
                int n3;
                Object object4;
                int n4;
                Object object5;
                Object object6;
                Object object7;
                xf0_1 xf0_12;
                block9: {
                    xf0_12 = this;
                    object7 = object;
                    object7 = (PA)object;
                    object6 = object2;
                    object6 = (b30_0)object2;
                    object5 = object3;
                    object5 = (Number)object3;
                    n4 = ((Number)object5).intValue();
                    object4 = "$this$BoxWithConstraints";
                    Intrinsics.checkNotNullParameter(object7, (String)object4);
                    n3 = n4 & 0x51;
                    n4 = 16;
                    f5 = 2.2E-44f;
                    if (n3 != n4 || (n3 = (int)(object6.h() ? 1 : 0)) == 0) break block9;
                    object6.D();
                    break block10;
                }
                object7 = LP1$a.b;
                object5 = zp.c;
                object4 = Nc$a.m;
                Object object8 = null;
                object5 = oZ.a((zp$l)object5, (Gx$a)object4, (b30_0)object6, 0);
                int n7 = object6.F();
                Object object9 = object6.m();
                Object object10 = a30_0.c((b30_0)object6, (LP1)object7);
                N20.W.getClass();
                Object object11 = N20$a.b;
                mp mp2 = object6.i();
                int n8 = mp2 instanceof mp;
                if (n8 == 0) break block11;
                object6.A();
                n8 = object6.e();
                if (n8 != 0) {
                    object6.C((Function0)object11);
                } else {
                    object6.n();
                }
                object11 = N20$a.e;
                Ow3.a((b30_0)object6, object5, (Function2)object11);
                object5 = N20$a.d;
                Ow3.a((b30_0)object6, object9, (Function2)object5);
                object5 = N20$a.f;
                int n10 = object6.e();
                if (n10 != 0 || (n10 = Intrinsics.areEqual(object9 = object6.v(), object11 = Integer.valueOf(n7))) == 0) {
                    re0_0.a(n7, (b30_0)object6, n7, (N20$a$a)object5);
                }
                object5 = N20$a.c;
                Ow3.a((b30_0)object6, object10, (Function2)object5);
                float f6 = uq0_0.o;
                object5 = object7;
                float f7 = f6;
                float f8 = f6;
                object5 = h.i((LP1)object7, f6, f6, f6, 0.0f, 8);
                object9 = (nh0_0)xf0_12.e;
                object10 = xf0_12.d;
                object11 = xf0_12.a;
                n8 = xf0_12.c;
                object4 = new vf0_2((Configuration)object10, (Subcomponent)object11, (nh0_0)object9, n8);
                object4 = androidx.compose.ui.layout.c.a((LP1)object5, (Function1)object4);
                String string2 = "";
                if (object11 == null || (object5 = ((Subcomponent)object11).getHeading()) == null) {
                    object5 = string2;
                }
                long l3 = oj3_2.h;
                av0_0 av0_02 = y20_0.a;
                int n14 = 500;
                object9 = new tv0_0(n14);
                long l4 = nz_1.b;
                int n15 = 3120;
                int n16 = 120720;
                long l7 = 0L;
                long l8 = l2 = 0L;
                int n17 = 2;
                int n18 = 1;
                int n19 = 1772544;
                float f11 = f6;
                long l12 = l4;
                Object object12 = object11;
                int n20 = n8;
                long l14 = l3;
                object8 = object9;
                object2 = object6;
                object6 = av0_02;
                Ll3.b((String)object5, (LP1)object4, l4, l3, null, (tv0_0)object9, av0_02, l7, null, null, l2, n17, false, n18, 0, null, null, (b30_0)object2, n19, n15, n16);
                f8 = uq0_0.e;
                object11 = null;
                n8 = 8;
                object5 = object7;
                f7 = f6;
                object4 = h.i((LP1)object7, f6, f8, f6, 0.0f, n8);
                if (object12 == null || (object5 = ((Subcomponent)object12).getSubHeading()) == null) {
                    object5 = string2;
                }
                l14 = oj3_2.c;
                object8 = new tv0_0(400);
                l12 = nz_1.h;
                n15 = 3120;
                n16 = 120720;
                l7 = 0L;
                l8 = 0L;
                n17 = 2;
                n18 = 1;
                n19 = 1772928;
                object6 = av0_02;
                Ll3.b((String)object5, (LP1)object4, l12, l14, null, (tv0_0)object8, av0_02, l7, null, null, l8, n17, false, n18, 0, null, null, (b30_0)object2, n19, n15, n16);
                f5 = uq0_0.q;
                f7 = uq0_0.m;
                f8 = f11;
                object7 = h.h((LP1)object7, f11, f5, f11, f7);
                n4 = 1388547181;
                f5 = 4.199373E11f;
                Object object13 = object2;
                object2.K(n4);
                object5 = xf0_12.b;
                n7 = (int)(object2.J(object5) ? 1 : 0);
                n10 = n20;
                n14 = (int)(object2.c(n20) ? 1 : 0);
                object10 = object2.v();
                if ((n7 |= n14) != 0 || object10 == (object4 = b30$a.a)) {
                    object5 = (nf0_1)object5;
                    object10 = new wf0_2((nf0_1)object5, n10);
                    object13.o(object10);
                }
                object10 = (Function0)object10;
                object13.E();
                object7 = x20_0.d((LP1)object7, (Function0)object10);
                f5 = ((Number)xf0_12.f.getValue()).floatValue();
                object7 = e60_0.b((LP1)object7, f5);
                f5 = uq0_0.s;
                object9 = j.h((LP1)object7, f5);
                n3 = R$drawable.chevron_down;
                n4 = 0;
                f5 = 0.0f;
                object5 = km2.a(n3, (b30_0)object13, 0);
                n3 = R$string.acc_down_arrow_icon;
                object4 = hv3_0.K(n3);
                int n21 = 8;
                int n22 = 120;
                n14 = 0;
                object10 = null;
                object11 = null;
                n8 = 0;
                mp2 = null;
                object8 = object13;
                Pd1.a((im2)object5, (String)object4, (LP1)object9, null, null, 0.0f, null, (b30_0)object13, n21, n22);
                object13.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

