/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.kmm.shared.bonanza.model.DisplayMessageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class Qt$i
implements gx0_2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ DisplayMessageInfo b;

    public Qt$i(ob0_1 ob0_12, DisplayMessageInfo displayMessageInfo) {
        this.a = ob0_12;
        this.b = displayMessageInfo;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4;
        Object object5;
        int n3;
        Qt$i qt$i = this;
        int n4 = 0;
        Object object6 = null;
        Object object7 = object;
        object7 = (PA)object;
        Object object8 = object2;
        object8 = (b30_0)object2;
        Object object9 = object3;
        object9 = (Number)object3;
        int n7 = ((Number)object9).intValue();
        Object object10 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object7, (String)object10);
        int n8 = n7 & 0x51;
        int n10 = 16;
        if (n8 == n10 && (n8 = (int)(object8.h() ? 1 : 0)) != 0) {
            object8.D();
            return Unit.a;
        }
        object7 = LP1$a.b;
        zp$k zp$k = zp.c;
        Object object11 = Nc$a.m;
        object9 = oZ.a(zp$k, (Gx$a)object11, (b30_0)object8, 0);
        int n14 = object8.F();
        Object object12 = object8.m();
        LP1 lP1 = a30_0.c((b30_0)object8, (LP1)object7);
        N20.W.getClass();
        Object object13 = N20$a.b;
        mp mp2 = object8.i();
        boolean bl2 = mp2 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        object8.A();
        bl2 = object8.e();
        if (bl2) {
            object8.C((Function0)object13);
        } else {
            object8.n();
        }
        Object object14 = N20$a.e;
        Ow3.a((b30_0)object8, object9, (Function2)object14);
        N20$a$d n20$a$d = N20$a.d;
        Ow3.a((b30_0)object8, object12, n20$a$d);
        object12 = N20$a.f;
        n7 = (int)(object8.e() ? 1 : 0);
        if (n7 != 0 || (n3 = Intrinsics.areEqual(object9 = object8.v(), object5 = Integer.valueOf(n14))) == 0) {
            re0_0.a(n14, (b30_0)object8, n14, (N20$a$a)object12);
        }
        object5 = N20$a.c;
        Ow3.a((b30_0)object8, lP1, (Function2)object5);
        n7 = 8;
        float f5 = n7;
        object9 = h.e((LP1)object7, f5);
        n14 = 1065353216;
        float f6 = 1.0f;
        object9 = j.c((LP1)object9, f6);
        object10 = HA.e(Nc$a.e, false);
        n10 = object8.F();
        Object object15 = object8.m();
        object9 = a30_0.c((b30_0)object8, (LP1)object9);
        object6 = object8.i();
        n4 = object6 instanceof mp;
        if (n4 == 0) {
            s20.a();
            throw null;
        }
        object8.A();
        n4 = object8.e();
        if (n4 != 0) {
            object8.C((Function0)object13);
        } else {
            object8.n();
        }
        Ow3.a((b30_0)object8, object10, (Function2)object14);
        Ow3.a((b30_0)object8, object15, n20$a$d);
        n4 = object8.e();
        if (n4 != 0 || (n4 = Intrinsics.areEqual(object6 = object8.v(), object10 = Integer.valueOf(n10))) == 0) {
            re0_0.a(n10, (b30_0)object8, n10, (N20$a$a)object12);
        }
        Ow3.a((b30_0)object8, object9, (Function2)object5);
        object6 = km2.a(R$drawable.ic_close, (b30_0)object8, 0);
        object10 = h.e((LP1)object7, f5);
        Object object16 = qt$i.a;
        object15 = new zt_1((ob0_1)object16);
        object15 = d.b((LP1)object10, false, null, (Function0)object15, 7);
        n10 = 56;
        int n15 = 120;
        object9 = object6;
        n4 = 1065353216;
        object6 = object12;
        object12 = object15;
        N20$a$d n20$a$d2 = n20$a$d;
        N20$a$b n20$a$b = object14;
        float f7 = f5;
        Xp1$a xp1$a = object13;
        object13 = object8;
        Gx$a gx$a = object11;
        int n16 = n10;
        object16 = zp$k;
        Pd1.a((im2)object9, "", (LP1)object15, null, null, 0.0f, null, (b30_0)object8, n10, n15);
        object8.p();
        long l2 = OX.f;
        object12 = SP2.a(12);
        lP1 = androidx.compose.foundation.a.b((LP1)object7, l2, (i13)object12);
        n7 = 80;
        float f8 = n7;
        n16 = 7;
        object15 = null;
        object9 = h.i(lP1, 0.0f, 0.0f, 0.0f, f8, n16);
        object10 = new Object();
        int n17 = 0;
        f5 = 0.0f;
        lP1 = null;
        bl2 = false;
        object9 = d.b((LP1)object9, false, null, (Function0)object10, 6);
        object10 = HA.e(Nc$a.a, false);
        int n18 = object8.F();
        rq2_1 rq2_12 = object8.m();
        object9 = a30_0.c((b30_0)object8, (LP1)object9);
        object14 = object8.i();
        int n19 = object14 instanceof mp;
        if (n19 == 0) {
            s20.a();
            throw null;
        }
        object8.A();
        n19 = object8.e();
        if (n19 != 0) {
            object14 = xp1$a;
            object8.C(xp1$a);
        } else {
            object14 = xp1$a;
            object8.n();
        }
        object15 = n20$a$b;
        Ow3.a((b30_0)object8, object10, n20$a$b);
        object10 = n20$a$d2;
        Ow3.a((b30_0)object8, rq2_12, n20$a$d2);
        bl2 = object8.e();
        if (bl2 || !(bl2 = Intrinsics.areEqual(object4 = object8.v(), object13 = Integer.valueOf(n18)))) {
            re0_0.a(n18, (b30_0)object8, n18, (N20$a$a)object6);
        }
        Ow3.a((b30_0)object8, object9, (Function2)object5);
        object9 = gx$a;
        object12 = null;
        object9 = oZ.a((zp$l)object16, gx$a, (b30_0)object8, 0);
        n18 = object8.F();
        rq2_1 rq2_13 = object8.m();
        object13 = a30_0.c((b30_0)object8, (LP1)object7);
        object11 = object8.i();
        n16 = object11 instanceof mp;
        if (n16 == 0) {
            s20.a();
            throw null;
        }
        object8.A();
        n17 = object8.e();
        if (n17 != 0) {
            object8.C((Function0)object14);
        } else {
            object8.n();
        }
        Ow3.a((b30_0)object8, object9, (Function2)object15);
        Ow3.a((b30_0)object8, rq2_13, (Function2)object10);
        n7 = (int)(object8.e() ? 1 : 0);
        if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object9 = object8.v(), object10 = Integer.valueOf(n18)) ? 1 : 0)) == 0) {
            re0_0.a(n18, (b30_0)object8, n18, (N20$a$a)object6);
        }
        Ow3.a((b30_0)object8, object13, (Function2)object5);
        object5 = qt$i.b;
        object9 = ((DisplayMessageInfo)object5).getTitle();
        Intrinsics.checkNotNull(object9);
        n4 = 18;
        long l3 = Em3.f(n4);
        object6 = tv0_0.n;
        f8 = 24;
        f6 = 16;
        Object object17 = j.c(h.h((LP1)object7, f6, f8, f6, f7), 1.0f);
        object2 = object8;
        object10 = object17;
        object13 = object6;
        object17 = object8;
        Ll3.b((String)object9, (LP1)object10, 0L, l3, null, (tv0_0)object6, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (b30_0)object8, 199680, 0, 131028);
        n7 = R$string.available_coins;
        object13 = object8;
        object9 = nk_0.f((b30_0)object8, n7);
        object10 = StringCompanionObject.INSTANCE;
        n14 = R$string.remaining_bbs_coins;
        object10 = nk_0.f((b30_0)object8, n14);
        object12 = ((DisplayMessageInfo)object5).getAvailableCoins();
        Intrinsics.checkNotNull(object12);
        n17 = 1;
        Object[] objectArray = new Object[n17];
        objectArray[0] = object12;
        object15 = "format(...)";
        object10 = xh2_0.a(objectArray, n17, (String)object10, (String)object15);
        long l4 = xx_1.g;
        Object object18 = object8;
        qt_0.d((String)object9, (String)object10, l4, (b30_0)object8, 384);
        n7 = R$string.coins_needed_for_selected_coupons;
        object9 = nk_0.f((b30_0)object8, n7);
        n14 = R$string.remaining_bbs_coins;
        object10 = nk_0.f((b30_0)object8, n14);
        object12 = ((DisplayMessageInfo)object5).getNeededCoins();
        Intrinsics.checkNotNull(object12);
        n17 = 1;
        f5 = Float.MIN_VALUE;
        Object[] objectArray2 = new Object[n17];
        object14 = null;
        objectArray2[0] = object12;
        object10 = xh2_0.a(objectArray2, n17, (String)object10, (String)object15);
        l4 = xx_1.q;
        n19 = 384;
        Object object19 = object8;
        qt_0.d((String)object9, (String)object10, l4, (b30_0)object8, n19);
        object9 = ((DisplayMessageInfo)object5).getMessage();
        Intrinsics.checkNotNull(object9);
        n3 = 14;
        l3 = Em3.f(n3);
        object5 = h.h((LP1)object7, f6, f8, f6, f8);
        n8 = 1065353216;
        float f11 = 1.0f;
        object10 = j.c((LP1)object5, f11);
        int n20 = 131028;
        l4 = 0L;
        object15 = null;
        n16 = 0;
        object11 = null;
        long l7 = 0L;
        object8 = null;
        long l8 = 0L;
        int n21 = 199680;
        object5 = object2;
        object13 = object6;
        Ll3.b((String)object9, (LP1)object10, l4, l3, null, (tv0_0)object6, null, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object2, n21, 0, n20);
        object2.p();
        object2.p();
        object2.p();
        return Unit.a;
    }
}

