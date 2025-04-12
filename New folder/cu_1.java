/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.bonanza.model.ICoupon;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cu
 */
public final class cu_1
implements gx0_2 {
    public final /* synthetic */ ICoupon a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ob0_1 e;

    public cu_1(ICoupon iCoupon, boolean bl2, tt_0 tt_02, String string2, ob0_1 ob0_12) {
        this.a = iCoupon;
        this.b = bl2;
        this.c = tt_02;
        this.d = string2;
        this.e = ob0_12;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        Integer n3;
        Integer n4;
        float f5;
        float f6;
        cu_1 cu_12 = this;
        Object object4 = object;
        object4 = (PA)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n7 = ((Number)object6).intValue();
        Object object7 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n8 = n7 & 0xE;
        if (n8 == 0) {
            n8 = (int)(object5.J(object4) ? 1 : 0);
            if (n8 != 0) {
                n8 = 4;
                f6 = 5.6E-45f;
            } else {
                n8 = 2;
                f6 = 2.8E-45f;
            }
            n7 |= n8;
        }
        n8 = 18;
        f6 = 2.5E-44f;
        if ((n7 &= 0x5B) == n8 && (n7 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
            return Unit.a;
        }
        float f7 = object4.d();
        n7 = Float.compare(f7, f6 = (float)(n8 = 300));
        if (n7 < 0) {
            f5 = object4.d();
            n7 = 1050253722;
            f7 = 0.3f;
            f5 *= f7;
        } else {
            int n10 = 90;
            f5 = n10;
        }
        LP1$a lP1$a = LP1$a.b;
        zp$k zp$k = zp.c;
        Gx$a gx$a = Nc$a.m;
        int n14 = 0;
        mp mp2 = null;
        object6 = oZ.a(zp$k, gx$a, (b30_0)object5, 0);
        n8 = object5.F();
        Object object8 = object5.m();
        Object object9 = a30_0.c((b30_0)object5, lP1$a);
        N20.W.getClass();
        Object object10 = N20$a.b;
        Object object11 = object5.i();
        int n15 = object11 instanceof mp;
        if (n15 == 0) {
            s20.a();
            throw null;
        }
        object5.A();
        n15 = object5.e();
        if (n15 != 0) {
            object5.C((Function0)object10);
        } else {
            object5.n();
        }
        N20$a$b n20$a$b = N20$a.e;
        Ow3.a((b30_0)object5, object6, n20$a$b);
        object11 = N20$a.d;
        Ow3.a((b30_0)object5, object8, (Function2)object11);
        object8 = N20$a.f;
        n7 = (int)(object5.e() ? 1 : 0);
        if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object6 = object5.v(), n4 = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
            re0_0.a(n8, (b30_0)object5, n8, (N20$a$a)object8);
        }
        N20$a$c n20$a$c = N20$a.c;
        Ow3.a((b30_0)object5, object9, n20$a$c);
        object9 = cu_12.a;
        object6 = ((ICoupon)object9).getBannerImageURL();
        object5.u(1998134191);
        object6 = u63.a(object6, (b30_0)object5, 8);
        object5.I();
        Object object12 = i70$a.a;
        n8 = 1065353216;
        f6 = 1.0f;
        object4 = j.d(j.c(lP1$a, f6), f5);
        int n16 = 24624;
        int n17 = 104;
        Object object13 = object8;
        object8 = object4;
        object4 = object9;
        Object object14 = object11;
        object11 = object12;
        N20$a$b n20$a$b2 = n20$a$b;
        N20$a$c n20$a$c2 = n20$a$c;
        Object var26_33 = null;
        Xp1$a xp1$a = object10;
        object10 = object5;
        n14 = n16;
        object12 = object13;
        object13 = gx$a;
        Pd1.a((im2)object6, "", (LP1)object8, null, (i70_0)object11, 0.0f, null, (b30_0)object5, n16, n17);
        object7 = (tt_0)cu_12.c;
        boolean bl2 = cu_12.b;
        object9 = cu_12.d;
        object6 = new bu_1(bl2, (tt_0)object7, (ICoupon)object4, (String)object9);
        int n18 = 7;
        n15 = 0;
        object11 = null;
        int n19 = 0;
        Object var25_26 = null;
        object6 = androidx.compose.foundation.d.b(lP1$a, false, null, (Function0)object6, n18);
        object9 = oZ.a(zp$k, gx$a, (b30_0)object5, 0);
        int n20 = object5.F();
        object10 = object5.m();
        object6 = a30_0.c((b30_0)object5, (LP1)object6);
        mp2 = object5.i();
        n14 = mp2 instanceof mp;
        if (n14 == 0) {
            s20.a();
            throw null;
        }
        object5.A();
        n19 = object5.e();
        if (n19 != 0) {
            Xp1$a xp1$a2 = xp1$a;
            object5.C(xp1$a);
        } else {
            object5.n();
        }
        N20$a$b n20$a$b3 = n20$a$b2;
        Ow3.a((b30_0)object5, object9, n20$a$b2);
        object9 = object14;
        Ow3.a((b30_0)object5, object10, (Function2)object14);
        n18 = (int)(object5.e() ? 1 : 0);
        if (n18 != 0 || (n18 = (int)(Intrinsics.areEqual(object9 = object5.v(), n3 = Integer.valueOf(n20)) ? 1 : 0)) == 0) {
            object9 = object12;
            re0_0.a(n20, (b30_0)object5, n20, (N20$a$a)object12);
        }
        object9 = n20$a$c2;
        Ow3.a((b30_0)object5, object6, n20$a$c2);
        n7 = 64;
        f7 = 9.0E-44f;
        qt_0.i(bl2, (ICoupon)object4, (tt_0)object7, (b30_0)object5, n7);
        object6 = ((ICoupon)object4).getLabel();
        n8 = 2;
        f6 = 2.8E-45f;
        qt_0.h((String)object6, false, (b30_0)object5, 0, n8);
        qt_0.f(((ICoupon)object4).getExtraLabel(), false, (b30_0)object5, 0, n8);
        object7 = ((ICoupon)object4).getPlpLink();
        n15 = 8;
        n19 = 4;
        object6 = cu_12.e;
        bl2 = false;
        object8 = null;
        object9 = object5;
        qt_0.j((ob0_1)object6, (String)object7, false, (b30_0)object5, n15, n19);
        object5.p();
        object5.p();
        return Unit.a;
    }
}

