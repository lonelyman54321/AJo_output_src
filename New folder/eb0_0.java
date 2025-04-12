/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.bonanza.model.ICoupon;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Eb0
 */
public final class eb0_0
implements gx0_2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ICoupon b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ ob0_1 d;

    public eb0_0(boolean bl2, ICoupon iCoupon, Jb0$b jb0$b, ob0_1 ob0_12) {
        this.a = bl2;
        this.b = iCoupon;
        this.c = jb0$b;
        this.d = ob0_12;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        eb0_0 eb0_02 = this;
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
        if (n4 == n3 && (n4 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
            return Unit.a;
        }
        object4 = LP1$a.b;
        zp$k zp$k = zp.c;
        Gx$a gx$a = Nc$a.m;
        object6 = oZ.a(zp$k, gx$a, (b30_0)object5, 0);
        int n7 = object5.F();
        Object object8 = object5.m();
        Object object9 = a30_0.c((b30_0)object5, (LP1)object4);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        Object object10 = object5.i();
        int n8 = object10 instanceof mp;
        if (n8 == 0) {
            s20.a();
            throw null;
        }
        object5.A();
        n8 = object5.e();
        if (n8 != 0) {
            object5.C(xp1$a);
        } else {
            object5.n();
        }
        Object object11 = N20$a.e;
        Ow3.a((b30_0)object5, object6, (Function2)object11);
        N20$a$d n20$a$d = N20$a.d;
        Ow3.a((b30_0)object5, object8, n20$a$d);
        N20$a$a n20$a$a = N20$a.f;
        n3 = (int)(object5.e() ? 1 : 0);
        if (n3 != 0 || (n3 = (int)(Intrinsics.areEqual(object6 = object5.v(), object8 = Integer.valueOf(n7)) ? 1 : 0)) == 0) {
            re0_0.a(n7, (b30_0)object5, n7, n20$a$a);
        }
        object10 = N20$a.c;
        Ow3.a((b30_0)object5, object9, (Function2)object10);
        object9 = eb0_02.b;
        object6 = ((ICoupon)object9).getBannerImageURL();
        object5.u(1998134191);
        object6 = u63.a(object6, (b30_0)object5, 8);
        object5.I();
        i70$a$a i70$a$a = i70$a.a;
        object7 = j.c((LP1)object4, 1.0f);
        int n10 = 85;
        float f5 = n10;
        LP1 lP1 = j.d((LP1)object7, f5);
        float f6 = 2;
        int n14 = 13;
        object8 = h.i(lP1, 0.0f, f6, 0.0f, 0.0f, n14);
        int n15 = 25008;
        int n16 = 104;
        object7 = "";
        Object object12 = object9;
        Object object13 = object10;
        object10 = i70$a$a;
        N20$a$a n20$a$a2 = n20$a$a;
        int n17 = 0;
        n20$a$a = null;
        N20$a$d n20$a$d2 = n20$a$d;
        int n18 = 0;
        n20$a$d = null;
        N20$a$b n20$a$b = object11;
        object11 = object5;
        Pd1.a((im2)object6, (String)object7, (LP1)object8, null, i70$a$a, 0.0f, null, (b30_0)object5, n15, n16);
        object6 = oZ.a(zp$k, gx$a, (b30_0)object5, 0);
        n7 = object5.F();
        object8 = object5.m();
        object4 = a30_0.c((b30_0)object5, (LP1)object4);
        object9 = object5.i();
        boolean bl2 = object9 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        object5.A();
        bl2 = object5.e();
        if (bl2) {
            object9 = xp1$a;
            object5.C(xp1$a);
        } else {
            object5.n();
        }
        object9 = n20$a$b;
        Ow3.a((b30_0)object5, object6, n20$a$b);
        object6 = n20$a$d2;
        Ow3.a((b30_0)object5, object8, n20$a$d2);
        n3 = (int)(object5.e() ? 1 : 0);
        if (n3 != 0 || (n3 = (int)(Intrinsics.areEqual(object6 = object5.v(), object8 = Integer.valueOf(n7)) ? 1 : 0)) == 0) {
            object6 = n20$a$a2;
            re0_0.a(n7, (b30_0)object5, n7, n20$a$a2);
        }
        object6 = object13;
        Ow3.a((b30_0)object5, object4, (Function2)object13);
        object4 = (Jb0$b)eb0_02.c;
        boolean bl3 = eb0_02.a;
        object6 = object12;
        n7 = 8;
        f6 = 1.1E-44f;
        Jb0.c((ICoupon)object12, bl3, (Jb0$b)object4, (b30_0)object5, n7);
        qt_0.h(((ICoupon)object12).getLabel(), bl3, (b30_0)object5, 0, 0);
        object4 = ((ICoupon)object12).getExtraLabel();
        qt_0.f((String)object4, bl3, (b30_0)object5, 0, 0);
        object7 = ((ICoupon)object12).getPlpLink();
        object6 = eb0_02.d;
        n8 = 8;
        n17 = 0;
        n20$a$a = null;
        object9 = object5;
        qt_0.j((ob0_1)object6, (String)object7, bl3, (b30_0)object5, n8, 0);
        object5.p();
        object5.p();
        n4 = (int)(eb0_02.a ? 1 : 0);
        if (n4 == 0) return Unit.a;
        object4 = j.c;
        long l2 = OX.b(xx_1.e, 0.1f);
        object8 = fg2_1.a;
        object4 = androidx.compose.foundation.a.b((LP1)object4, l2, (i13)object8);
        object6 = new Object();
        object6 = androidx.compose.foundation.d.b((LP1)object4, false, null, (Function0)object6, 6);
        object9 = K10.a;
        n17 = 3072;
        n18 = 6;
        n7 = 0;
        f6 = 0.0f;
        object7 = null;
        boolean bl4 = false;
        f5 = 0.0f;
        object8 = null;
        object10 = object5;
        OA.a((LP1)object6, null, false, (u10)object9, (b30_0)object5, n17, n18);
        return Unit.a;
    }
}

