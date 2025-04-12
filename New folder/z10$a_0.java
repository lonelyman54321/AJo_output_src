/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Renamed from Z10$a
 */
public final class z10$a_0
implements gx0_2 {
    public static final z10$a_0 a;

    static {
        z10$a_0 z10$a_0;
        a = z10$a_0 = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        xm3 xm32;
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
        object6 = zp.a;
        object7 = Nc$a.j;
        int n7 = 0;
        object6 = iQ2.a((zp$e)object6, (Gx$b)object7, (b30_0)object5, 0);
        int n8 = object5.F();
        Object object8 = object5.m();
        Object object9 = a30_0.c((b30_0)object5, (LP1)object4);
        N20.W.getClass();
        Object object10 = N20$a.b;
        Object object11 = object5.i();
        boolean bl2 = object11 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        object5.A();
        bl2 = object5.e();
        if (bl2) {
            object5.C((Function0)object10);
        } else {
            object5.n();
        }
        Object object12 = N20$a.e;
        Ow3.a((b30_0)object5, object6, (Function2)object12);
        N20$a$d n20$a$d = N20$a.d;
        Ow3.a((b30_0)object5, object8, n20$a$d);
        Object object13 = N20$a.f;
        n3 = (int)(object5.e() ? 1 : 0);
        if (n3 != 0 || (n3 = (int)(Intrinsics.areEqual(object6 = object5.v(), object8 = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
            re0_0.a(n8, (b30_0)object5, n8, (N20$a$a)object13);
        }
        Object object14 = N20$a.c;
        Ow3.a((b30_0)object5, object9, (Function2)object14);
        n3 = 4;
        f5 = 5.6E-45f;
        float f6 = n3;
        object6 = object4;
        object6 = h.i((LP1)object4, 0.0f, f6, 0.0f, 0.0f, 13);
        double d2 = 0.5;
        float f7 = (float)d2;
        long l2 = zx_0.d(0xFFECECECL);
        int n10 = 1;
        float f8 = n10;
        object11 = SP2.a(f8);
        object6 = gz.a((LP1)object6, f7, l2, (i13)object11);
        f7 = 20;
        object6 = j.k((LP1)object6, f7);
        n8 = 25;
        f7 = n8;
        object6 = j.d((LP1)object6, f7);
        object7 = HA.e(Nc$a.a, false);
        int n14 = object5.F();
        object9 = object5.m();
        object6 = a30_0.c((b30_0)object5, (LP1)object6);
        object11 = object5.i();
        bl2 = object11 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        object5.A();
        bl2 = object5.e();
        if (bl2) {
            object5.C((Function0)object10);
        } else {
            object5.n();
        }
        Ow3.a((b30_0)object5, object7, (Function2)object12);
        Ow3.a((b30_0)object5, object9, n20$a$d);
        n8 = (int)(object5.e() ? 1 : 0);
        if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object7 = object5.v(), object9 = Integer.valueOf(n14)) ? 1 : 0)) == 0) {
            re0_0.a(n14, (b30_0)object5, n14, (N20$a$a)object13);
        }
        Ow3.a((b30_0)object5, object6, (Function2)object14);
        object6 = u63.a(R$drawable.ic_gift_24, (b30_0)object5, 0);
        object11 = i70$a.a;
        int n15 = 24624;
        int n16 = 108;
        object7 = "image description";
        n14 = 0;
        object8 = null;
        object9 = null;
        boolean bl3 = true;
        float f11 = f6;
        int n17 = 0;
        Sl sl = null;
        f6 = 0.0f;
        Object object15 = object14;
        object14 = object5;
        N20$a$a n20$a$a = object13;
        N20$a$d n20$a$d2 = n20$a$d;
        int n18 = n16;
        Pd1.a((im2)object6, (String)object7, null, null, (i70_0)object11, 0.0f, null, (b30_0)object5, n15, n16);
        object5.p();
        n3 = 1065353216;
        f5 = 1.0f;
        d2 = f5;
        double d5 = 0.0;
        n10 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
        if (n10 <= 0) {
            object4 = g9_0.a(f5, "invalid weight ", "; must be greater than zero");
            object4 = object4.toString();
            object6 = new IllegalArgumentException((String)object4);
            throw object6;
        }
        f5 = f.c(f5, Float.MAX_VALUE);
        object7 = new LayoutWeightElement(f5, bl3);
        n3 = 8;
        f5 = 1.1E-44f;
        float f12 = n3;
        f8 = 0.0f;
        n17 = 6;
        f6 = 8.4E-45f;
        object6 = h.i((LP1)object7, f12, 0.0f, 0.0f, f11, n17);
        object7 = zp.c;
        object8 = Nc$a.m;
        object7 = oZ.a((zp$l)object7, (Gx$a)object8, (b30_0)object5, 0);
        n14 = object5.F();
        object9 = object5.m();
        object6 = a30_0.c((b30_0)object5, (LP1)object6);
        object11 = object5.i();
        bl2 = object11 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        object5.A();
        bl2 = object5.e();
        if (bl2) {
            object5.C((Function0)object10);
        } else {
            object5.n();
        }
        Ow3.a((b30_0)object5, object7, (Function2)object12);
        object7 = n20$a$d2;
        Ow3.a((b30_0)object5, object9, n20$a$d2);
        n8 = (int)(object5.e() ? 1 : 0);
        if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object7 = object5.v(), object9 = Integer.valueOf(n14)) ? 1 : 0)) == 0) {
            object7 = n20$a$a;
            re0_0.a(n14, (b30_0)object5, n14, n20$a$a);
        }
        object7 = object15;
        Ow3.a((b30_0)object5, object6, (Function2)object15);
        n3 = R$string.you_won_t_get_the_freebie_as_it_is_bundled_with_the_product;
        object6 = nk_0.f((b30_0)object5, n3);
        int n19 = 12;
        long l3 = Em3.f(n19);
        av0_0 av0_02 = y20_0.a;
        long l4 = 0L;
        int n20 = 0xFFFFDD;
        long l7 = 0L;
        long l8 = 0L;
        object12 = xm32;
        xm32 = new xm3(l7, l3, null, av0_02, l8, null, 0, l4, n20);
        object15 = tv0_0.m;
        long l12 = 0xFF202020L;
        l2 = zx_0.d(l12);
        int n21 = 0x180000;
        char c2 = (char)-38;
        long l14 = 0L;
        n17 = 0;
        f6 = 0.0f;
        sl = null;
        object13 = null;
        long l15 = 0L;
        bl3 = false;
        long l16 = 0L;
        object = object5;
        n15 = 0;
        n16 = 0;
        f11 = 0.0f;
        int n22 = 196992;
        object14 = object15;
        Ll3.b((String)object6, null, l2, l14, null, (tv0_0)object15, null, l15, null, null, l16, 0, false, 0, 0, null, xm32, (b30_0)object5, n22, n21, c2);
        n3 = 1296117476;
        f5 = 2.0256723E8f;
        object10 = object5;
        object5.K(n3);
        object6 = new Sl$a();
        f7 = 2.0258851E8f;
        object5.K(1296118806);
        long l17 = zx_0.d(l12);
        long l18 = Em3.f(n19);
        char c3 = (char)-40;
        long l19 = 0L;
        long l20 = 0L;
        object7 = new S93(l17, l18, (tv0_0)object15, null, null, av0_02, null, l19, null, null, null, l20, null, null, c3);
        n8 = ((Sl$a)object6).g((S93)object7);
        n14 = R$string.for_more_information;
        object8 = nk_0.f((b30_0)object5, n14);
        ((Sl$a)object6).c((String)object8);
        object8 = Unit.a;
        object5.E();
        f7 = 2.0295394E8f;
        object5.K(1296141645);
        l2 = 4280716473L;
        l17 = zx_0.d(l2);
        l18 = Em3.f(n19);
        c3 = (char)-40;
        l19 = 0L;
        l20 = 0L;
        object7 = new S93(l17, l18, (tv0_0)object15, null, null, av0_02, null, l19, null, null, null, l20, null, null, c3);
        n8 = ((Sl$a)object6).g((S93)object7);
        n14 = R$string.read_policy;
        object8 = nk_0.f((b30_0)object5, n14);
        ((Sl$a)object6).c((String)object8);
        object5.E();
        sl = ((Sl$a)object6).h();
        object5.E();
        n8 = 0;
        f7 = 0.0f;
        object6 = object4;
        object7 = h.i((LP1)object4, 0.0f, f12, 0.0f, 0.0f, 13);
        object14 = new Object();
        n18 = 0xC00030;
        n7 = 124;
        n14 = 0;
        object8 = null;
        object9 = null;
        bl2 = false;
        f8 = 0.0f;
        object11 = null;
        n10 = 0;
        n4 = 0;
        object4 = null;
        object6 = sl;
        n17 = 0;
        sl = null;
        f6 = 0.0f;
        object13 = object5;
        IV.a((Sl)object6, (LP1)object7, null, false, 0, 0, null, (Function1)object14, (b30_0)object5, n18, n7);
        object5.p();
        object5.p();
        return Unit.a;
        finally {
            ((Sl$a)object6).e(n8);
        }
        finally {
            ((Sl$a)object6).e(n8);
        }
    }
}

