/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class De2$G
implements gx0_2 {
    public final /* synthetic */ ft1_2 a;
    public final /* synthetic */ p83_0 b;
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ qz1_2 d;
    public final /* synthetic */ CartOrder e;
    public final /* synthetic */ ft1_2 f;

    public De2$G(ft1_2 ft1_22, p83_0 p83_02, c80 c802, qz1_2 qz1_22, CartOrder cartOrder, ft1_2 ft1_23) {
        this.a = ft1_22;
        this.b = p83_02;
        this.c = c802;
        this.d = qz1_22;
        this.e = cartOrder;
        this.f = ft1_23;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        De2$G de2$G = this;
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
        object7 = zp.c;
        Object object8 = Nc$a.m;
        boolean bl2 = false;
        Object object9 = null;
        object7 = oZ.a((zp$l)object7, (Gx$a)object8, (b30_0)object5, 0);
        int n7 = object5.F();
        Object object10 = object5.m();
        Object object11 = a30_0.c((b30_0)object5, (LP1)object4);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        Object object12 = object5.i();
        boolean bl3 = object12 instanceof mp;
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
        Object object13 = N20$a.e;
        Ow3.a((b30_0)object5, object7, (Function2)object13);
        object7 = N20$a.d;
        Ow3.a((b30_0)object5, object10, (Function2)object7);
        N20$a$a n20$a$a = N20$a.f;
        boolean bl4 = object5.e();
        if (bl4 || !(bl4 = Intrinsics.areEqual(object10 = object5.v(), object12 = Integer.valueOf(n7)))) {
            re0_0.a(n7, (b30_0)object5, n7, n20$a$a);
        }
        Object object14 = N20$a.c;
        Ow3.a((b30_0)object5, object11, (Function2)object14);
        n7 = R$string.other_product_in_order;
        object11 = nk_0.f((b30_0)object5, n7);
        long l2 = Em3.f(n3);
        Object object15 = tv0_0.o;
        f5 = n3;
        float f6 = 8;
        object8 = j.c(h.f((LP1)object4, f5, f6), 1.0f);
        object10 = new le2_0(0);
        LP1 lP1 = CY2.b((LP1)object8, false, (Function1)object10);
        int n8 = 131028;
        long l3 = 0L;
        bl3 = false;
        object12 = null;
        me2_0 me2_02 = null;
        N20$a$c n20$a$c = object14;
        long l4 = 0L;
        N20$a$a n20$a$a2 = n20$a$a;
        int n10 = 0;
        n20$a$a = null;
        N20$a$b n20$a$b = object13;
        long l7 = 0L;
        int n14 = 199680;
        object6 = object11;
        object11 = object7;
        object7 = lP1;
        Object object16 = object11;
        object = object5;
        object5 = object15;
        object15 = object;
        Ll3.b((String)object6, lP1, l3, l2, null, (tv0_0)object5, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object, n14, 0, n8);
        object6 = h.f((LP1)object4, f5, f6);
        object7 = Nc$a.a;
        object8 = null;
        object7 = HA.e((Nc)object7, false);
        n7 = object.F();
        object10 = object.m();
        object13 = object;
        object6 = a30_0.c((b30_0)object, (LP1)object6);
        object9 = object.i();
        bl2 = object9 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        object.A();
        bl2 = object.e();
        if (bl2) {
            object9 = xp1$a;
            object.C(xp1$a);
        } else {
            object.n();
        }
        object9 = n20$a$b;
        Ow3.a((b30_0)object13, object7, n20$a$b);
        object7 = object16;
        Ow3.a((b30_0)object13, object10, (Function2)object16);
        boolean bl5 = object13.e();
        if (bl5 || !(bl5 = Intrinsics.areEqual(object7 = object13.v(), object10 = Integer.valueOf(n7)))) {
            object7 = n20$a$a2;
            re0_0.a(n7, (b30_0)object13, n7, n20$a$a2);
        }
        object7 = n20$a$c;
        Ow3.a((b30_0)object13, object6, n20$a$c);
        n3 = 1065353216;
        f5 = 1.0f;
        object4 = j.c((LP1)object4, f5);
        long l8 = OX.f;
        object8 = fg2_1.a;
        object6 = androidx.compose.foundation.a.b((LP1)object4, l8, (i13)object8);
        object9 = de2$G.d;
        object10 = object4 = de2$G.c;
        object10 = (c80)object4;
        object8 = de2$G.b;
        object11 = de2$G.e;
        object12 = de2$G.f;
        object7 = me2_02;
        me2_02 = new me2_0((p83_0)object8, (c80)object10, (qz1_2)object9, (CartOrder)object11, (ft1_2)object12);
        int n15 = 6;
        f6 = 8.4E-45f;
        n10 = 252;
        object7 = de2$G.a;
        n7 = 0;
        object8 = null;
        bl4 = false;
        object10 = null;
        bl2 = false;
        object9 = null;
        object11 = null;
        bl3 = false;
        object12 = null;
        object5 = null;
        object14 = object13;
        xq1_0.b((LP1)object6, (ft1_2)object7, null, false, null, null, null, false, me2_02, (b30_0)object13, n15, n10);
        object13.p();
        object13.p();
        return Unit.a;
    }
}

