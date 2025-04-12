/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Renamed from MZ0
 */
public final class mz0_1
implements gx0_2 {
    public final /* synthetic */ Product a;
    public final /* synthetic */ String b;

    public mz0_1(Product product, String string2) {
        this.a = product;
        this.b = string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        mz0_1 mz0_12 = this;
        Object object4 = object;
        object4 = (PA)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        Object object7 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n4 = n3 & 0x51;
        n3 = 16;
        float f5 = 2.2E-44f;
        if (n4 == n3 && (n4 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
            return Unit.a;
        }
        object4 = LP1$a.b;
        int n7 = 8;
        float f6 = n7;
        float f7 = 0.0f;
        int n8 = 14;
        int n10 = 0;
        float f8 = 0.0f;
        float f11 = 0.0f;
        object6 = object4;
        float f12 = f6;
        object6 = h.i((LP1)object4, f6, 0.0f, 0.0f, 0.0f, n8);
        float f14 = 1.0f;
        object6 = j.c((LP1)object6, f14);
        object7 = zp.a;
        Object object8 = Nc$a.j;
        boolean bl2 = false;
        Object object9 = null;
        object7 = iQ2.a((zp$e)object7, (Gx$b)object8, (b30_0)object5, 0);
        int n14 = object5.F();
        Object object10 = object5.m();
        object6 = a30_0.c((b30_0)object5, (LP1)object6);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        Object object11 = object5.i();
        boolean bl3 = object11 instanceof mp;
        if (!bl3) {
            s20.a();
            throw null;
        }
        object5.A();
        bl3 = object5.e();
        if (bl3) {
            object5.C(xp1$a);
        } else {
            object5.n();
        }
        N20$a$b n20$a$b = N20$a.e;
        Ow3.a((b30_0)object5, object7, n20$a$b);
        Object object12 = N20$a.d;
        Ow3.a((b30_0)object5, object10, (Function2)object12);
        N20$a$a n20$a$a = N20$a.f;
        int n15 = object5.e();
        if (n15 != 0 || (n15 = Intrinsics.areEqual(object7 = object5.v(), object10 = Integer.valueOf(n14))) == 0) {
            re0_0.a(n14, (b30_0)object5, n14, n20$a$a);
        }
        object11 = N20$a.c;
        Ow3.a((b30_0)object5, object6, (Function2)object11);
        n3 = 4;
        f5 = 5.6E-45f;
        f8 = n3;
        int n16 = 13;
        int n17 = 0;
        int n18 = 0;
        object6 = object4;
        f7 = f8;
        float f15 = f8;
        n10 = 0;
        f8 = 0.0f;
        Object object13 = object11;
        N20$a$a n20$a$a2 = n20$a$a;
        n8 = n16;
        object6 = h.i((LP1)object4, 0.0f, f7, 0.0f, 0.0f, n16);
        double d2 = 0.5;
        f12 = (float)d2;
        long l2 = zx_0.d(0xFFECECECL);
        n8 = 1;
        f11 = n8;
        object11 = SP2.a(f11);
        object6 = gz.a((LP1)object6, f12, l2, (i13)object11);
        f12 = 20;
        object6 = j.k((LP1)object6, f12);
        n15 = 25;
        f12 = n15;
        object6 = j.d((LP1)object6, f12);
        object7 = HA.e(Nc$a.a, false);
        n14 = object5.F();
        object10 = object5.m();
        object6 = a30_0.c((b30_0)object5, (LP1)object6);
        object11 = object5.i();
        bl3 = object11 instanceof mp;
        if (!bl3) {
            s20.a();
            throw null;
        }
        object5.A();
        bl3 = object5.e();
        if (bl3) {
            object5.C(xp1$a);
        } else {
            object5.n();
        }
        Ow3.a((b30_0)object5, object7, n20$a$b);
        Ow3.a((b30_0)object5, object10, (Function2)object12);
        n15 = (int)(object5.e() ? 1 : 0);
        if (n15 != 0 || (n15 = (int)(Intrinsics.areEqual(object7 = object5.v(), object10 = Integer.valueOf(n14)) ? 1 : 0)) == 0) {
            re0_0.a(n14, (b30_0)object5, n14, n20$a$a2);
        }
        Ow3.a((b30_0)object5, object6, (Function2)object13);
        hv3_0.a.getClass();
        object11 = mz0_12.a;
        object6 = hv3_0.k((Product)object11);
        if (object6 == null || (n15 = ((String)object6).length()) == 0) {
            n3 = R$drawable.ic_gift_24;
            object6 = n3;
        }
        n15 = 8;
        f12 = 1.1E-44f;
        object6 = u63.a(object6, (b30_0)object5, n15);
        n15 = R$string.product_gift;
        object7 = nn_2.a(nk_0.f((b30_0)object5, n15), "at");
        object10 = mz0_12.b;
        ((StringBuilder)object7).append((String)object10);
        object7 = ((StringBuilder)object7).toString();
        i70$a$a i70$a$a = i70$a.a;
        n17 = 24576;
        n18 = 108;
        n14 = 0;
        f7 = 0.0f;
        object8 = null;
        Object object14 = null;
        Object object15 = object10;
        n10 = 0;
        object10 = null;
        f8 = 0.0f;
        object2 = object11;
        object11 = i70$a$a;
        bl2 = true;
        n20$a$a = null;
        N20$a$a n20$a$a3 = n20$a$a2;
        n7 = 0;
        n20$a$a2 = null;
        Object object16 = object12;
        object12 = object5;
        Object object17 = n20$a$b;
        Pd1.a((im2)object6, (String)object7, null, null, i70$a$a, 0.0f, null, (b30_0)object5, n17, n18);
        object5.p();
        n3 = 1065353216;
        f5 = 1.0f;
        d2 = f5;
        double d5 = 0.0;
        n8 = (int)(d2 == d5 ? 0 : (d2 > d5 ? 1 : -1));
        if (n8 <= 0) {
            object4 = g9_0.a(1.0f, "invalid weight ", "; must be greater than zero");
            object4 = object4.toString();
            object6 = new IllegalArgumentException((String)object4);
            throw object6;
        }
        f5 = f.c(f5, Float.MAX_VALUE);
        object7 = new LayoutWeightElement(f5, bl2);
        n8 = 6;
        f7 = 0.0f;
        object6 = object7;
        f12 = f6;
        f11 = f15;
        object6 = h.i((LP1)object7, f6, 0.0f, 0.0f, f15, n8);
        object7 = zp.c;
        object8 = Nc$a.m;
        n10 = 0;
        f8 = 0.0f;
        object7 = oZ.a((zp$l)object7, (Gx$a)object8, (b30_0)object5, 0);
        n14 = object5.F();
        object10 = object5.m();
        object6 = a30_0.c((b30_0)object5, (LP1)object6);
        object11 = object5.i();
        bl3 = object11 instanceof mp;
        if (!bl3) {
            s20.a();
            throw null;
        }
        object5.A();
        bl3 = object5.e();
        if (bl3) {
            object11 = xp1$a;
            object5.C(xp1$a);
        } else {
            object5.n();
        }
        object11 = object17;
        Ow3.a((b30_0)object5, object7, (Function2)object17);
        object7 = object16;
        Ow3.a((b30_0)object5, object10, (Function2)object16);
        n15 = (int)(object5.e() ? 1 : 0);
        if (n15 != 0 || (n15 = (int)(Intrinsics.areEqual(object7 = object5.v(), object10 = Integer.valueOf(n14)) ? 1 : 0)) == 0) {
            object7 = n20$a$a3;
            re0_0.a(n14, (b30_0)object5, n14, n20$a$a3);
        }
        Ow3.a((b30_0)object5, object6, (Function2)object13);
        object6 = ((Product)object2).getBrandName();
        object7 = " ";
        if (object6 != null) {
            object6 = ((Product)object2).getBrandName();
            object8 = ((Product)object2).getName();
            object6 = n1.a((String)object6, (String)object7, (String)object8);
        } else {
            object6 = String.valueOf(((Product)object2).getName());
        }
        f7 = -3.2081602E-25f;
        object5.K(-1765371052);
        object9 = object15;
        n14 = (int)(object5.J(object15) ? 1 : 0);
        n10 = object5.J(object6);
        object10 = object5.v();
        if ((n14 |= n10) != 0 || object10 == (object8 = b30$a.a)) {
            object10 = new kz0_1((String)object9, (String)object6);
            object5.o(object10);
        }
        object10 = (Function1)object10;
        object5.E();
        object14 = CY2.b((LP1)object4, false, (Function1)object10);
        long l3 = Em3.f(12);
        av0_0 av0_02 = y20_0.a;
        n10 = 400;
        f8 = 5.6E-43f;
        object8 = new tv0_0(n10);
        long l4 = 0xFF6D6D6DL;
        long l7 = zx_0.d(l4);
        long l8 = 0L;
        int n19 = 0xFFFFD8;
        long l12 = 0L;
        object16 = object8;
        object17 = av0_02;
        xm3 xm32 = new xm3(l7, l3, (tv0_0)object8, av0_02, l12, null, 0, l8, n19);
        i70$a$a = null;
        long l14 = 0L;
        object15 = object5;
        long l15 = l14;
        Object object18 = object7;
        object7 = object14;
        object14 = object5;
        Ll3.b((String)object6, (LP1)object7, 0L, 0L, null, null, null, 0L, null, null, l14, 2, false, 1, 0, null, xm32, (b30_0)object5, 0, 3120, 55292);
        object7 = object2;
        object8 = object9;
        object6 = new lz0_1((Product)object2, (String)object9);
        object4 = CY2.b((LP1)object4, false, (Function1)object6);
        object6 = ((Product)object2).getGwpQuantity();
        object7 = new StringBuilder("Qty ");
        ((StringBuilder)object7).append(object6);
        object6 = object18;
        ((StringBuilder)object7).append((String)object18);
        object6 = ((StringBuilder)object7).toString();
        n15 = 10;
        f12 = 1.4E-44f;
        long l16 = Em3.f(n15);
        object7 = new tv0_0(700);
        long l17 = zx_0.d(l4);
        long l18 = 0L;
        int n20 = 0xFFFFD8;
        long l19 = 0L;
        n14 = 0;
        f7 = 0.0f;
        object8 = null;
        av0_02 = null;
        object16 = new xm3(l17, l16, (tv0_0)object7, (av0_0)object17, l19, null, 0, l18, n20);
        int n21 = 3120;
        int n22 = 55292;
        l2 = 0L;
        long l20 = 0L;
        n7 = 0;
        n20$a$a2 = null;
        object12 = null;
        n20$a$b = null;
        long l21 = 0L;
        f14 = 0.0f;
        object13 = null;
        bl2 = false;
        object9 = null;
        l15 = 0L;
        n16 = 2;
        n17 = 0;
        n18 = 1;
        f15 = 0.0f;
        xm32 = null;
        object7 = object4;
        Ll3.b((String)object6, (LP1)object4, l2, l20, null, null, null, l21, null, null, l15, n16, false, n18, 0, null, (xm3)object16, (b30_0)object5, 0, n21, n22);
        object5.p();
        object5.p();
        return Unit.a;
    }
}

