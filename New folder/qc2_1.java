/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.Order.ReturnRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Qc2
 */
public final class qc2_1
extends Lambda
implements hx0_2 {
    public final /* synthetic */ List c;
    public final /* synthetic */ rZ d;
    public final /* synthetic */ qz1_2 e;
    public final /* synthetic */ Function0 f;

    public qc2_1(ArrayList arrayList, qz1_2 qz1_22, md2_2 md2_22) {
        sz_0 sz_02 = sz_0.a;
        this.c = arrayList;
        this.d = sz_02;
        this.e = qz1_22;
        this.f = md2_22;
        super(4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        Object object5;
        Object object6;
        Integer n3;
        float f5;
        float f6;
        int n4;
        qc2_1 qc2_12 = this;
        Object object7 = object;
        object7 = (wr1_2)object;
        Object object8 = object2;
        object8 = (Number)object2;
        int n7 = ((Number)object8).intValue();
        Object object9 = object3;
        object9 = (b30_0)object3;
        Object object10 = object4;
        object10 = (Number)object4;
        int n8 = ((Number)object10).intValue();
        int n10 = n8 & 6;
        if (n10 == 0) {
            n4 = (int)(object9.J(object7) ? 1 : 0);
            if (n4 != 0) {
                n4 = 4;
                f6 = 5.6E-45f;
            } else {
                n4 = 2;
                f6 = 2.8E-45f;
            }
            n4 |= n8;
        } else {
            n4 = n8;
        }
        int n14 = 16;
        if ((n8 &= 0x30) == 0) {
            n8 = (int)(object9.c(n7) ? 1 : 0);
            if (n8 != 0) {
                n8 = 32;
                f5 = 4.5E-44f;
            } else {
                n8 = 16;
                f5 = 2.2E-44f;
            }
            n4 |= n8;
        }
        n8 = 146;
        f5 = 2.05E-43f;
        if ((n4 &= 0x93) == n8 && (n4 = (int)(object9.h() ? 1 : 0)) != 0) {
            object9.D();
            return Unit.a;
        }
        object7 = (ReturnRequest)qc2_12.c.get(n7);
        n7 = -1751630526;
        object9.K(n7);
        object8 = LP1$a.b;
        n8 = 23;
        f5 = 3.2E-44f;
        float f7 = n8;
        n10 = 0;
        float f8 = 0.0f;
        float f11 = 1.8E-44f;
        int n15 = 0;
        float f12 = 0.0f;
        object10 = object8;
        float f14 = f7;
        object10 = h.i((LP1)object8, 0.0f, f7, 0.0f, 0.0f, 13);
        float f15 = 1.0f;
        object10 = j.c((LP1)object10, f15);
        Object object11 = zp.a;
        Object object12 = Nc$a.j;
        object11 = iQ2.a((zp$e)object11, (Gx$b)object12, (b30_0)object9, 0);
        int n16 = object9.F();
        Object object13 = object9.m();
        object10 = a30_0.c((b30_0)object9, (LP1)object10);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        Object object14 = object9.i();
        int n17 = object14 instanceof mp;
        if (n17 == 0) {
            s20.a();
            throw null;
        }
        object9.A();
        n17 = object9.e();
        if (n17 != 0) {
            object9.C(xp1$a);
        } else {
            object9.n();
        }
        N20$a$b n20$a$b = N20$a.e;
        Ow3.a((b30_0)object9, object11, n20$a$b);
        object11 = N20$a.d;
        Ow3.a((b30_0)object9, object13, (Function2)object11);
        object11 = N20$a.f;
        n15 = object9.e();
        if (n15 != 0 || (n15 = Intrinsics.areEqual(object13 = object9.v(), n3 = Integer.valueOf(n16))) == 0) {
            re0_0.a(n16, (b30_0)object9, n16, (N20$a$a)object11);
        }
        object11 = N20$a.c;
        Ow3.a((b30_0)object9, object10, (Function2)object11);
        mq2_0 mq2_02 = mq2_0.a;
        object10 = ((ReturnRequest)object7).getExchangeOrderID();
        if (object10 != null && (n8 = ((String)object10).length()) != 0) {
            object10 = ((ReturnRequest)object7).getExchangeOrderID();
            object11 = "Exchange ID #";
            object10 = kp1_0.c((String)object11, (String)object10);
        } else {
            object10 = ((ReturnRequest)object7).getReturnId();
            object11 = "Return ID #";
            object10 = kp1_0.c((String)object11, (String)object10);
        }
        Object object15 = object10;
        int n18 = 12;
        long l2 = Em3.f(n18);
        tv0_0 tv0_02 = tv0_0.m;
        av0_0 av0_02 = y20_0.a;
        long l3 = xx_1.g;
        f11 = 8;
        n10 = 0;
        f8 = 0.0f;
        int n19 = 13;
        float f16 = 1.8E-44f;
        Object var28_31 = null;
        object10 = object8;
        f14 = f11;
        float f17 = f11;
        n17 = n19;
        f11 = f16;
        object10 = h.i((LP1)object8, 0.0f, f14, 0.0f, 0.0f, n19);
        f12 = 0.5f;
        n17 = 1;
        f11 = Float.MIN_VALUE;
        object11 = mq2_02.a((LP1)object10, f12, n17 != 0);
        int n20 = 18;
        long l4 = Em3.f(n20);
        int n21 = 6;
        int n22 = 129936;
        object12 = mq2_02;
        mq2_02 = null;
        long l7 = 0L;
        n8 = 0;
        f5 = 0.0f;
        n15 = 0;
        object13 = null;
        long l8 = l7;
        f15 = 0.0f;
        float f18 = f7;
        Object object16 = null;
        f7 = 0.0f;
        int n24 = 1772928;
        object10 = object15;
        Object object17 = object12;
        Object object18 = tv0_02;
        object = object9;
        object9 = av0_02;
        object15 = object;
        Ll3.b((String)object10, (LP1)object11, l3, l2, null, tv0_02, av0_02, l7, null, null, l4, 0, false, 0, 0, null, null, (b30_0)object, n24, n21, n22);
        object10 = ((ReturnRequest)object7).getExchangeOrderID();
        object10 = object10 != null && (n8 = ((String)object10).length()) != 0 ? "View Exchange Order" : "View Return Order";
        object18 = object10;
        long l12 = Em3.f(n18);
        object9 = tv0_0.o;
        l2 = xx_1.h;
        n10 = 0;
        f8 = 0.0f;
        Object var28_32 = null;
        object10 = object8;
        f14 = f17;
        object10 = h.i((LP1)object8, 0.0f, f17, 0.0f, 0.0f, 13);
        object11 = object17;
        f12 = 0.5f;
        n17 = 1;
        f11 = Float.MIN_VALUE;
        object10 = ((mq2_0)object17).a((LP1)object10, f12, n17 != 0);
        object12 = qc2_12.e;
        object13 = qc2_12.f;
        object11 = new lc2_1((ReturnRequest)object7, (qz1_2)object12, (Function0)object13);
        n16 = 7;
        f14 = 9.8E-45f;
        object13 = null;
        object11 = androidx.compose.foundation.d.b((LP1)object10, false, null, (Function0)object11, n16);
        l3 = Em3.f(n20);
        n15 = 6;
        object12 = new Cj3(n15);
        n21 = 6;
        n22 = 129424;
        mq2_02 = null;
        l8 = 0L;
        f15 = 0.0f;
        n24 = 1772928;
        object10 = object18;
        n14 = 6;
        f7 = 8.4E-45f;
        object18 = object9;
        object9 = av0_02;
        object16 = object12;
        l4 = l3;
        object15 = object;
        Ll3.b((String)object10, (LP1)object11, l2, l12, null, (tv0_0)object18, av0_02, l8, null, (Cj3)object12, l3, 0, false, 0, 0, null, null, (b30_0)object, n24, n21, n22);
        object.p();
        n8 = -472075411;
        f5 = -8.1424254E21f;
        object9 = object;
        object.K(n8);
        object10 = ((ReturnRequest)object7).getReturnRequestedOnMessage();
        object18 = qc2_12.d;
        if (object10 == null || (n8 = ((String)object10).length()) == 0) {
            object6 = object18;
            object = object9;
        } else {
            object16 = ((ReturnRequest)object7).getReturnRequestedOnMessage();
            Intrinsics.checkNotNullExpressionValue(object16, "getReturnRequestedOnMessage(...)");
            l2 = Em3.f(n18);
            l3 = xx_1.e;
            f14 = 16;
            n10 = 0;
            f8 = 0.0f;
            n15 = 0;
            object13 = null;
            Object var28_33 = null;
            object10 = object8;
            object10 = h.i((LP1)object8, 0.0f, f14, 0.0f, 0.0f, 13);
            f12 = 0.5f;
            n17 = 1;
            f11 = Float.MIN_VALUE;
            object11 = object18.a((LP1)object10, f12, n17 != 0);
            l4 = Em3.f(n20);
            n21 = 6;
            n22 = 129936;
            mq2_02 = null;
            l8 = 0L;
            f15 = 0.0f;
            n8 = 0;
            f5 = 0.0f;
            object12 = object16;
            object16 = null;
            f7 = 0.0f;
            n24 = 1772928;
            object10 = object12;
            object6 = object18;
            object18 = tv0_02;
            object9 = av0_02;
            Ll3.b((String)object12, (LP1)object11, l3, l2, null, tv0_02, av0_02, l8, null, null, l4, 0, false, 0, 0, null, null, (b30_0)object, n24, n21, n22);
        }
        object.E();
        n8 = -472054634;
        f5 = -8.154122E21f;
        object9 = object;
        object.K(n8);
        object10 = ((ReturnRequest)object7).getReturnMessage();
        if (object10 == null || (n8 = ((String)object10).length()) == 0) {
            object5 = object9;
            n4 = 1;
            f6 = Float.MIN_VALUE;
        } else {
            object7 = ((ReturnRequest)object7).getReturnMessage();
            Intrinsics.checkNotNullExpressionValue(object7, "getReturnMessage(...)");
            long l14 = Em3.f(n18);
            l3 = xx_1.e;
            n8 = 6;
            f5 = 8.4E-45f;
            f14 = n8;
            n17 = 13;
            f11 = 1.8E-44f;
            n15 = 0;
            object13 = null;
            f12 = 0.0f;
            Object var28_34 = null;
            object10 = object8;
            object10 = h.i((LP1)object8, 0.0f, f14, 0.0f, 0.0f, n17);
            object12 = object6;
            n10 = 0x3F000000;
            f8 = 0.5f;
            n14 = 1;
            object11 = object6.a((LP1)object10, f8, n14 != 0);
            l4 = Em3.f(n20);
            n21 = 6;
            n22 = 129936;
            mq2_02 = null;
            l8 = 0L;
            f15 = 0.0f;
            f7 = 0.0f;
            object16 = null;
            n24 = 1772928;
            object10 = object7;
            n4 = 1;
            f6 = Float.MIN_VALUE;
            object18 = tv0_02;
            object5 = object;
            object9 = av0_02;
            object15 = object;
            Ll3.b((String)object7, (LP1)object11, l3, l14, null, tv0_02, av0_02, l8, null, null, l4, 0, false, 0, 0, null, null, (b30_0)object, n24, n21, n22);
        }
        object5.E();
        long l15 = xx_1.B;
        n10 = 0;
        f8 = 0.0f;
        object11 = null;
        n17 = 13;
        f11 = 1.8E-44f;
        object10 = object8;
        f14 = f18;
        object8 = h.i((LP1)object8, 0.0f, f18, 0.0f, 0.0f, n17);
        n8 = 1065353216;
        f5 = 1.0f;
        object8 = j.c((LP1)object8, f5);
        f6 = n4;
        object10 = j.d((LP1)object8, f6);
        n4 = 54;
        f6 = 7.6E-44f;
        n7 = 12;
        n15 = 0;
        object13 = null;
        f12 = 0.0f;
        Object var28_35 = null;
        object14 = object5;
        n14 = n7;
        Rr0.a((LP1)object10, l15, 0.0f, 0.0f, (b30_0)object5, n4, n7);
        object5.E();
        return Unit.a;
    }
}

