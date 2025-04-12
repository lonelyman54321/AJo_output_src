/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.f;

/*
 * Renamed from Ze2
 */
public final class ze2_0
implements gx0_2 {
    public final /* synthetic */ float a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ CartEntry e;
    public final /* synthetic */ SelectedOrderItem f;
    public final /* synthetic */ qz1_2 g;
    public final /* synthetic */ Product h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ Activity k;
    public final /* synthetic */ i90_0 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;

    public ze2_0(float f5, String string2, Ref$IntRef ref$IntRef, boolean bl2, CartEntry cartEntry, SelectedOrderItem selectedOrderItem, qz1_2 qz1_22, Product product, boolean bl3, boolean bl4, Activity activity, c80 c802, String string3, String string4, String string5, String string6) {
        this.a = f5;
        this.b = string2;
        this.c = ref$IntRef;
        this.d = bl2;
        this.e = cartEntry;
        this.f = selectedOrderItem;
        this.g = qz1_22;
        this.h = product;
        this.i = bl3;
        this.j = bl4;
        this.k = activity;
        this.l = c802;
        this.m = string3;
        this.n = string4;
        this.o = string5;
        this.p = string6;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        float f5;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        tv0_0 tv0_02;
        double d2;
        double d5;
        float f6;
        Object object8;
        float f7;
        float f8;
        long l2;
        long l3;
        int n3;
        float f11;
        long l4;
        long l7;
        int n4;
        int n7;
        float f12;
        float f14;
        int n8;
        float f15;
        int n10;
        Object object9;
        int n14;
        Object object10;
        float f16;
        int n15;
        float f17;
        int n16;
        float f18;
        Object object11;
        N20$a$d n20$a$d;
        N20$a$b n20$a$b;
        Object object12;
        int n17;
        Object object13;
        Object object14;
        int n18;
        int n19;
        Object object15;
        Object object16;
        Object object17;
        Object[] objectArray;
        int n20;
        float f19;
        int n21;
        int n22;
        Object object18;
        Object object19;
        Object object20;
        Object object21;
        float f20;
        int n24;
        block54: {
            block55: {
                String string2;
                block52: {
                    block53: {
                        Integer n25;
                        Object object22;
                        long l8;
                        Object object23;
                        int n26;
                        Object object24;
                        long l12;
                        long l14;
                        Xp1$a xp1$a;
                        Object object25;
                        Object object26;
                        Integer n27;
                        ze2_0 ze2_02 = this;
                        n24 = 0;
                        f20 = 0.0f;
                        object21 = null;
                        object20 = object;
                        object20 = (PA)object;
                        object19 = object2;
                        object19 = (b30_0)object2;
                        object18 = object3;
                        object18 = (Number)object3;
                        n22 = ((Number)object18).intValue();
                        String string3 = "$this$BoxWithConstraints";
                        Intrinsics.checkNotNullParameter(object20, string3);
                        n21 = n22 & 0x51;
                        n22 = 16;
                        f19 = 2.2E-44f;
                        if (n21 == n22 && (n21 = (int)(object19.h() ? 1 : 0)) != 0) {
                            object19.D();
                            return Unit.a;
                        }
                        object20 = LP1$a.b;
                        zp$k zp$k = zp.c;
                        Object object27 = Nc$a.m;
                        object18 = oZ.a(zp$k, (Gx$a)object27, (b30_0)object19, 0);
                        n20 = object19.F();
                        objectArray = object19.m();
                        object17 = a30_0.c((b30_0)object19, (LP1)object20);
                        N20.W.getClass();
                        object16 = N20$a.b;
                        object15 = object19.i();
                        n19 = object15 instanceof mp;
                        if (n19 == 0) {
                            s20.a();
                            throw null;
                        }
                        object19.A();
                        n19 = object19.e();
                        if (n19 != 0) {
                            object19.C((Function0)object16);
                        } else {
                            object19.n();
                        }
                        N20$a$b n20$a$b2 = N20$a.e;
                        Ow3.a((b30_0)object19, object18, n20$a$b2);
                        Object object28 = N20$a.d;
                        Ow3.a((b30_0)object19, objectArray, (Function2)object28);
                        object15 = N20$a.f;
                        n22 = (int)(object19.e() ? 1 : 0);
                        if (n22 != 0 || (n22 = (int)(Intrinsics.areEqual(object18 = object19.v(), objectArray = Integer.valueOf(n20)) ? 1 : 0)) == 0) {
                            re0_0.a(n20, (b30_0)object19, n20, (N20$a$a)object15);
                        }
                        objectArray = N20$a.c;
                        Ow3.a((b30_0)object19, object17, (Function2)objectArray);
                        object17 = zp.a;
                        Gx$b gx$b = Nc$a.j;
                        object18 = iQ2.a((zp$e)object17, gx$b, (b30_0)object19, 0);
                        n18 = object19.F();
                        object21 = object19.m();
                        Object object29 = a30_0.c((b30_0)object19, (LP1)object20);
                        object2 = gx$b;
                        mp mp2 = object19.i();
                        n20 = mp2 instanceof mp;
                        if (n20 == 0) {
                            s20.a();
                            throw null;
                        }
                        object19.A();
                        n20 = (int)(object19.e() ? 1 : 0);
                        if (n20 != 0) {
                            object19.C((Function0)object16);
                        } else {
                            object19.n();
                        }
                        Ow3.a((b30_0)object19, object18, n20$a$b2);
                        Ow3.a((b30_0)object19, object21, (Function2)object28);
                        n24 = object19.e();
                        if (n24 != 0 || (n24 = Intrinsics.areEqual(object21 = object19.v(), object18 = Integer.valueOf(n18))) == 0) {
                            re0_0.a(n18, (b30_0)object19, n18, (N20$a$a)object15);
                        }
                        Ow3.a((b30_0)object19, object29, (Function2)objectArray);
                        object14 = new Ref$ObjectRef();
                        f20 = 100;
                        object13 = androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.j.d((LP1)object20, f20), 0.8f);
                        n24 = 12;
                        f20 = 1.7E-44f;
                        float f22 = n24;
                        n17 = 12;
                        object18 = androidx.compose.foundation.layout.h.i((LP1)object13, f22, f22, 0.0f, 0.0f, n17);
                        object3 = object20;
                        long l15 = OX.f;
                        fG2$a fG2$a = fg2_1.a;
                        object21 = androidx.compose.foundation.a.b((LP1)object18, l15, fG2$a);
                        object12 = object18 = ze2_02.l;
                        object12 = (c80)object18;
                        object18 = ze2_02.k;
                        Product product = ze2_02.h;
                        n20$a$b = n20$a$b2;
                        CartEntry cartEntry = ze2_02.e;
                        n20$a$d = object28;
                        object28 = ze2_02.g;
                        object13 = object20;
                        Object object30 = object18;
                        object20 = new ve2_0((Activity)object18, product, (c80)object12, cartEntry, (qz1_2)object28);
                        f19 = 9.8E-45f;
                        Product product2 = product;
                        object11 = object28;
                        f18 = 0.0f;
                        Object var12_17 = null;
                        n16 = 0;
                        f17 = 0.0f;
                        object28 = null;
                        ((Ref$ObjectRef)object14).element = object21 = androidx.compose.foundation.d.b((LP1)object21, false, null, (Function0)object20, 7);
                        n21 = (int)(ze2_02.d ? 1 : 0);
                        n20 = (int)(ze2_02.i ? 1 : 0);
                        n22 = (int)(ze2_02.j ? 1 : 0);
                        if (n21 == 0 && (n20 != 0 || n22 != 0)) {
                            n16 = 0x3F000000;
                            f17 = 0.5f;
                            ((Ref$ObjectRef)object14).element = object21 = be_1.b((LP1)object21, f17);
                        }
                        object28 = ze2_02.m;
                        object13 = object21;
                        object30 = object28;
                        n17 = n22;
                        object21 = new Xe2((String)object28, (Ref$ObjectRef)object14, n21 != 0, n20 != 0, n22 != 0, cartEntry);
                        n18 = -1904100965;
                        object14 = v10.c(n18, (fx0_2)object21, (b30_0)object19);
                        n16 = 3072;
                        f17 = 4.305E-42f;
                        n22 = 0;
                        f19 = 0.0f;
                        object30 = null;
                        Object object31 = object2;
                        int n28 = n20;
                        Product product3 = product2;
                        n20 = 0;
                        f18 = 0.0f;
                        Object[] objectArray2 = objectArray;
                        n15 = 0;
                        f16 = 0.0f;
                        object10 = object17;
                        object17 = object14;
                        object14 = object15;
                        object15 = object19;
                        Object object32 = n20$a$d;
                        object = object11;
                        object13 = null;
                        n14 = n21;
                        object9 = cartEntry;
                        object20 = n20$a$b;
                        n10 = 7;
                        f15 = 9.8E-45f;
                        OA.a(null, null, false, (u10)object17, (b30_0)object19, n16, n10);
                        f20 = 0.0f;
                        object21 = null;
                        object18 = oZ.a(zp$k, (Gx$a)object27, (b30_0)object19, 0);
                        n24 = object19.F();
                        rq2_1 rq2_12 = object19.m();
                        Object object33 = object3;
                        objectArray = a30_0.c((b30_0)object19, (LP1)object3);
                        object17 = object19.i();
                        n8 = object17 instanceof mp;
                        if (n8 == 0) {
                            s20.a();
                            throw null;
                        }
                        object19.A();
                        n8 = object19.e();
                        if (n8 != 0) {
                            object19.C((Function0)object16);
                        } else {
                            object19.n();
                        }
                        Ow3.a((b30_0)object19, object18, (Function2)object20);
                        object15 = object32;
                        Ow3.a((b30_0)object19, rq2_12, (Function2)object32);
                        n22 = object19.e();
                        if (n22 != 0 || (n22 = Intrinsics.areEqual(object18 = object19.v(), n27 = Integer.valueOf(n24))) == 0) {
                            re0_0.a(n24, (b30_0)object19, n24, (N20$a$a)object14);
                        }
                        object21 = objectArray2;
                        Ow3.a((b30_0)object19, objectArray, (Function2)objectArray2);
                        n22 = 771997051;
                        f19 = 2.9954244E-11f;
                        object19.K(n22);
                        n16 = 1065353216;
                        f17 = 1.0f;
                        int n29 = 14;
                        n15 = 8;
                        f16 = 1.1E-44f;
                        object18 = ze2_02.n;
                        if (object18 == null) {
                            object26 = object15;
                            object25 = object33;
                            object3 = object19;
                            f14 = f22;
                            xp1$a = object16;
                        } else {
                            object30 = androidx.compose.foundation.layout.j.c((LP1)object33, f17);
                            double d7 = 10.06;
                            f18 = (float)d7;
                            f12 = n15;
                            LP1 lP1 = androidx.compose.foundation.layout.h.i((LP1)object30, f18, f22, f12, 0.0f, 8);
                            object11 = tv0_0.o;
                            l14 = xx_1.g;
                            l12 = Em3.f(n29);
                            object32 = y20_0.a;
                            n7 = 3072;
                            n4 = 122768;
                            n10 = 0;
                            f15 = 0.0f;
                            Object var23_77 = null;
                            l7 = 0L;
                            f14 = f22;
                            n16 = 0;
                            object28 = null;
                            f17 = 0.0f;
                            l4 = l7;
                            n8 = 0;
                            f12 = 0.0f;
                            object17 = null;
                            xp1$a = object16;
                            object16 = null;
                            f11 = 0.0f;
                            object13 = null;
                            object12 = null;
                            n17 = 1;
                            n20$a$b = null;
                            n20$a$d = null;
                            n3 = 1772928;
                            l3 = l14;
                            object26 = object15;
                            l2 = l12;
                            object25 = object33;
                            Object object34 = object11;
                            object3 = object19;
                            object19 = object32;
                            object11 = object3;
                            Ll3.b((String)object18, lP1, l14, l12, null, (tv0_0)object34, (RU0)object32, l7, null, null, l7, 0, false, n17, 0, null, null, (b30_0)object3, n3, n7, n4);
                            object18 = Unit.a;
                        }
                        object3.E();
                        n22 = 772015340;
                        f19 = 3.0017697E-11f;
                        object19 = object3;
                        object3.K(n22);
                        int n30 = 4;
                        object18 = ze2_02.o;
                        if (object18 == null) {
                            object24 = object25;
                        } else {
                            object15 = object25;
                            n16 = 1065353216;
                            f17 = 1.0f;
                            object27 = androidx.compose.foundation.layout.j.c((LP1)object25, f17);
                            n15 = 8;
                            f16 = 1.1E-44f;
                            f18 = n15;
                            f11 = n30;
                            object30 = null;
                            n26 = 8;
                            f22 = f18;
                            LP1 lP1 = androidx.compose.foundation.layout.h.i((LP1)object27, f18, f11, f18, 0.0f, n26);
                            l14 = xx_1.g;
                            object11 = tv0_0.m;
                            n8 = 12;
                            f12 = 1.7E-44f;
                            l12 = Em3.f(n8);
                            object32 = y20_0.a;
                            n7 = 0;
                            n4 = 130960;
                            n10 = 0;
                            f15 = 0.0f;
                            Object var23_78 = null;
                            l4 = 0L;
                            f11 = 0.0f;
                            object16 = null;
                            object13 = null;
                            l7 = 0L;
                            object12 = null;
                            n17 = 0;
                            n20$a$b = null;
                            n20$a$d = null;
                            n3 = 1772928;
                            l3 = l14;
                            object24 = object25;
                            l2 = l12;
                            Object object35 = object11;
                            object19 = object32;
                            object11 = object3;
                            Ll3.b((String)object18, lP1, l14, l12, null, (tv0_0)object35, (RU0)object32, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object3, n3, 0, n4);
                            object18 = Unit.a;
                        }
                        object3.E();
                        n22 = 772031956;
                        f19 = 3.0075345E-11f;
                        object19 = object3;
                        object3.K(n22);
                        object18 = ze2_02.p;
                        if (object18 == null) {
                            object23 = object3;
                            object3 = object24;
                        } else {
                            Object object36 = object24;
                            n19 = 1065353216;
                            f8 = 1.0f;
                            LP1 lP1 = androidx.compose.foundation.layout.j.c((LP1)object24, f8);
                            n16 = 8;
                            f17 = 1.1E-44f;
                            f16 = n16;
                            n8 = 4;
                            f12 = 5.6E-45f;
                            f15 = n8;
                            int n32 = 2;
                            float f23 = n32;
                            LP1 lP12 = androidx.compose.foundation.layout.h.h(lP1, f16, f15, f16, f23);
                            l14 = xx_1.g;
                            object11 = tv0_0.m;
                            n15 = 12;
                            f16 = 1.7E-44f;
                            l12 = Em3.f(n15);
                            object32 = y20_0.a;
                            n7 = 0;
                            n4 = 130960;
                            n10 = 0;
                            f15 = 0.0f;
                            Object var23_79 = null;
                            l4 = 0L;
                            f11 = 0.0f;
                            object16 = null;
                            object13 = null;
                            l7 = 0L;
                            object12 = null;
                            n17 = 0;
                            n20$a$b = null;
                            n20$a$d = null;
                            n3 = 1772928;
                            l3 = l14;
                            l2 = l12;
                            object3 = object24;
                            Object object37 = object11;
                            object23 = object19;
                            object19 = object32;
                            object11 = object23;
                            Ll3.b((String)object18, lP12, l14, l12, null, (tv0_0)object37, (RU0)object32, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object23, n3, 0, n4);
                            object18 = Unit.a;
                        }
                        object23.E();
                        object23.p();
                        object23.p();
                        object32 = null;
                        float f24 = ze2_02.a;
                        String string4 = ze2_02.b;
                        object16 = ze2_02.c;
                        float f25 = f24 - 0.0f;
                        f7 = f25 == 0.0f ? 0 : (f25 < 0.0f ? -1 : 1);
                        if (f7 <= 0) {
                            object18 = cp_1.Companion;
                            object18.getClass();
                            n22 = (int)(cp$a.w() ? 1 : 0);
                            if (n22 == 0 || string4 == null || (n22 = string4.length()) == 0) {
                                n22 = 12;
                                f19 = 1.7E-44f;
                                ((Ref$IntRef)object16).element = n22;
                            }
                        }
                        object27 = ze2_02.f;
                        if (n14 == 0) {
                            if (object27 != null) {
                                object29 = ((SelectedOrderItem)object27).getQuantity();
                                object18 = object9;
                            } else {
                                object18 = object9;
                                f22 = 0.0f;
                                object29 = null;
                            }
                            object18 = BN2.d((CartEntry)object18, (Integer)object29);
                        } else {
                            object.getClass();
                            if (product3 != null && (object18 = product3.getPrice()) != null) {
                                object29 = ((Price)object18).getValue();
                            } else {
                                f22 = 0.0f;
                                object29 = null;
                            }
                            if (object29 != null) {
                                if (product3 != null && (object18 = product3.getPrice()) != null) {
                                    object29 = ((Price)object18).getValue();
                                } else {
                                    f22 = 0.0f;
                                    object29 = null;
                                }
                                f19 = mz3_0.J((String)object29);
                                object18 = qz2_0.u(f19);
                            } else {
                                object18 = qz2_0.z();
                            }
                        }
                        object9 = object18;
                        n22 = -485083811;
                        f19 = -2.7708568E21f;
                        object29 = object23;
                        object23.K(n22);
                        if (n14 != 0) {
                            f12 = 4;
                            n19 = 0;
                            f8 = 0.0f;
                            object15 = null;
                            n16 = 8;
                            f17 = 1.1E-44f;
                            object18 = object3;
                            f18 = f14;
                            f16 = f14;
                            LP1 lP1 = androidx.compose.foundation.layout.h.i((LP1)object3, f14, f14, f12, 0.0f, n16);
                            l3 = xx_1.e;
                            object11 = tv0_0.m;
                            object23 = y20_0.a;
                            l2 = Em3.f(12);
                            n7 = 0;
                            n4 = 130960;
                            object18 = "Price for 1 quantity";
                            n10 = 0;
                            Object var23_80 = null;
                            f15 = 0.0f;
                            l8 = 0L;
                            object8 = object27;
                            object22 = object29;
                            l4 = l8;
                            object13 = null;
                            Object object38 = object16;
                            object16 = null;
                            f11 = 0.0f;
                            l7 = 0L;
                            object12 = null;
                            n17 = 0;
                            n20$a$b = null;
                            n20$a$d = null;
                            n3 = 1772934;
                            string2 = string4;
                            Object object39 = object11;
                            f6 = f24;
                            object19 = object23;
                            object11 = object29;
                            Ll3.b((String)object18, lP1, l3, l2, null, (tv0_0)object39, (RU0)object23, l8, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object29, n3, 0, n4);
                            object19 = object38;
                            n22 = 12;
                            f19 = 1.7E-44f;
                            ((Ref$IntRef)object38).element = n22;
                        } else {
                            string2 = string4;
                            f6 = f24;
                            object8 = object27;
                            object22 = object23;
                            object19 = object16;
                        }
                        object22.E();
                        Object object40 = object;
                        object18 = (Map)((qz1_2)object).A.getValue();
                        if (product3 != null) {
                            object29 = product3.getCode();
                        } else {
                            f22 = 0.0f;
                            object29 = null;
                        }
                        object18 = (ArrayList)object18.get(object29);
                        f18 = -2.775427E21f;
                        object16 = object22;
                        object22.K(-485067575);
                        a21 a212 = a21.a;
                        a212.getClass();
                        n20 = a21.c((ArrayList)object18);
                        object27 = "; must be greater than zero";
                        object29 = "invalid weight ";
                        n10 = 0x7F7FFFFF;
                        f15 = Float.MAX_VALUE;
                        d5 = 0.0;
                        if (n20 != 0) {
                            void var12_33;
                            if (n28 != 0) {
                                a21$a a21$a = a21$a.CANCELLATION_DETAIL;
                            } else {
                                a21$a a21$a = a21$a.ORDER_DETAIL;
                            }
                            String string5 = a21.g((a21$a)var12_33, (List)object18);
                            f16 = 1.1E-44f;
                            rz0_2.a((List)object18, string5, (b30_0)object16, 8);
                            n16 = 1065353216;
                            f17 = 1.0f;
                            d2 = f17;
                            n15 = (int)(d2 == d5 ? 0 : (d2 > d5 ? 1 : -1));
                            if (n15 <= 0) {
                                object14 = g9_0.a(f17, (String)object29, (String)object27);
                                object14 = object14.toString();
                                object21 = new IllegalArgumentException((String)object14);
                                throw object21;
                            }
                            f18 = kotlin.ranges.f.c(f17, f15);
                            n15 = 1;
                            f16 = Float.MIN_VALUE;
                            object18 = new LayoutWeightElement(f18, n15 != 0);
                            object18 = androidx.compose.foundation.layout.j.b((LP1)object18, f17);
                            Q93.b((b30_0)object16, (LP1)object18);
                        } else {
                            n16 = 1065353216;
                            f17 = 1.0f;
                        }
                        object16.E();
                        object15 = object3;
                        object13 = androidx.compose.foundation.layout.j.c((LP1)object3, f17);
                        n22 = ((Ref$IntRef)object19).element;
                        f19 = n22;
                        object30 = null;
                        n17 = 7;
                        n26 = 0;
                        object12 = null;
                        object18 = androidx.compose.foundation.layout.h.i((LP1)object13, 0.0f, 0.0f, 0.0f, f19, n17);
                        objectArray = object31;
                        Object object41 = object10;
                        n8 = 0;
                        f12 = 0.0f;
                        kQ2 kQ22 = iQ2.a((zp$e)object10, (Gx$b)object31, (b30_0)object16, 0);
                        n15 = object16.F();
                        object17 = object16.m();
                        object18 = a30_0.c((b30_0)object16, (LP1)object18);
                        object28 = object16.i();
                        n16 = object28 instanceof mp;
                        if (n16 == 0) {
                            s20.a();
                            throw null;
                        }
                        object16.A();
                        n16 = (int)(object16.e() ? 1 : 0);
                        if (n16 != 0) {
                            object28 = xp1$a;
                            object16.C(xp1$a);
                        } else {
                            object16.n();
                        }
                        Ow3.a((b30_0)object16, kQ22, (Function2)object20);
                        object20 = object26;
                        Ow3.a((b30_0)object16, object17, (Function2)object26);
                        n21 = object16.e();
                        if (n21 != 0 || (n21 = Intrinsics.areEqual(object20 = object16.v(), n25 = Integer.valueOf(n15))) == 0) {
                            re0_0.a(n15, (b30_0)object16, n15, (N20$a$a)object14);
                        }
                        Ow3.a((b30_0)object16, object18, (Function2)object21);
                        if (n14 != 0) {
                            n18 = 4;
                            f12 = n18;
                            f16 = 0.0f;
                            object21 = null;
                            n16 = 8;
                            f17 = 1.1E-44f;
                            object18 = object15;
                            f18 = f14;
                            object20 = object15;
                            n19 = 0;
                            object15 = null;
                            f8 = 0.0f;
                            n24 = 1065353216;
                            f20 = 1.0f;
                            object18 = androidx.compose.foundation.layout.h.i((LP1)object18, f14, f16, f12, 0.0f, n16);
                        } else {
                            object20 = object15;
                            n18 = 4;
                            n24 = 1065353216;
                            f20 = 1.0f;
                            f12 = n18;
                            n19 = 0;
                            f8 = 0.0f;
                            object15 = null;
                            n16 = 8;
                            f17 = 1.1E-44f;
                            object18 = object20;
                            f18 = f14;
                            f16 = f14;
                            object18 = androidx.compose.foundation.layout.h.i((LP1)object20, f14, f14, f12, 0.0f, n16);
                        }
                        Object object42 = object18;
                        Intrinsics.checkNotNull(object9);
                        long l16 = xx_1.e;
                        tv0_02 = tv0_0.o;
                        object10 = y20_0.a;
                        l2 = Em3.f(n29);
                        n7 = 0;
                        n4 = 130960;
                        n15 = 0x7F7FFFFF;
                        f16 = Float.MAX_VALUE;
                        n10 = 0;
                        Object var23_81 = null;
                        f15 = 0.0f;
                        l8 = 0L;
                        object17 = object27;
                        object18 = object29;
                        l4 = l8;
                        object13 = null;
                        object3 = object16;
                        object16 = null;
                        f11 = 0.0f;
                        l7 = 0L;
                        object12 = null;
                        n17 = 0;
                        n20$a$b = null;
                        n20$a$d = null;
                        n3 = 1772928;
                        object7 = object29;
                        object18 = object9;
                        object6 = object27;
                        l3 = l16;
                        object5 = object40;
                        tv0_0 tv0_03 = tv0_02;
                        object4 = object19;
                        object19 = object10;
                        object11 = object3;
                        Ll3.b((String)object9, (LP1)object42, l16, l2, null, tv0_02, (RU0)object10, l8, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object3, n3, 0, n4);
                        f19 = 2.8267872E10f;
                        object19 = object3;
                        object3.K(1355979952);
                        object18 = cp_1.Companion;
                        object18.getClass();
                        n22 = (int)(cp$a.w() ? 1 : 0);
                        n30 = 13;
                        if (n22 == 0) break block52;
                        object16 = string2;
                        if (string2 == null || (n22 = string2.length()) == 0 || (n22 = (int)(Intrinsics.areEqual(string2, object18 = "") ? 1 : 0)) != 0 || n14 != 0) break block53;
                        n22 = R$string.convenience_fee;
                        object11 = nk_0.f((b30_0)object3, n22);
                        f16 = n30;
                        f18 = n18;
                        n19 = 0;
                        f8 = 0.0f;
                        object15 = null;
                        n16 = 12;
                        f17 = 1.7E-44f;
                        n8 = 0;
                        f12 = 0.0f;
                        object17 = null;
                        object18 = object20;
                        LP1 lP1 = androidx.compose.foundation.layout.h.i((LP1)object20, f18, f16, 0.0f, 0.0f, n16);
                        objectArray2 = tv0_0.m;
                        l2 = Em3.f(12);
                        n7 = 0;
                        n4 = 130960;
                        n10 = 0;
                        f15 = 0.0f;
                        Object var23_82 = null;
                        l4 = 0L;
                        n22 = 0;
                        f19 = 0.0f;
                        object9 = string2;
                        object16 = null;
                        f11 = 0.0f;
                        object13 = null;
                        l7 = 0L;
                        object12 = null;
                        n17 = 0;
                        n20$a$b = null;
                        n20$a$d = null;
                        n3 = 1772928;
                        object18 = object11;
                        n18 = 13;
                        Object[] objectArray3 = objectArray2;
                        object19 = object10;
                        object11 = object3;
                        Ll3.b((String)object18, lP1, l16, l2, null, (tv0_0)objectArray2, (RU0)object10, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object3, n3, 0, n4);
                        break block54;
                    }
                    object3 = object19;
                    object9 = object16;
                    break block55;
                }
                object9 = string2;
            }
            n18 = 13;
        }
        object3.E();
        d2 = f20;
        n15 = (int)(d2 == d5 ? 0 : (d2 > d5 ? 1 : -1));
        if (n15 <= 0) {
            object20 = object7;
            object14 = object6;
            object14 = g9_0.a(f20, (String)object7, (String)object6);
            object14 = object14.toString();
            object21 = new IllegalArgumentException((String)object14);
            throw object21;
        }
        n20 = 0x7F7FFFFF;
        f18 = kotlin.ranges.f.c(f20, Float.MAX_VALUE);
        n15 = 1;
        f16 = Float.MIN_VALUE;
        object18 = new LayoutWeightElement(f18, n15 != 0);
        object21 = androidx.compose.foundation.layout.j.b((LP1)object18, f20);
        object19 = object3;
        Q93.b((b30_0)object3, (LP1)object21);
        n24 = 1356004202;
        f20 = 2.8317536E10f;
        object3.K(n24);
        if (n14 == 0) {
            n24 = R$string.view_breakup;
            object21 = nk_0.f((b30_0)object3, n24);
            f16 = n18;
            n19 = 0;
            f8 = 0.0f;
            object15 = null;
            n16 = 9;
            f17 = 1.3E-44f;
            object18 = object20;
            f12 = f14;
            object14 = androidx.compose.foundation.layout.h.i((LP1)object20, 0.0f, f16, f14, 0.0f, n16);
            objectArray = object8;
            Object object43 = object5;
            object18 = new we2_0((qz1_2)object5, (SelectedOrderItem)object8);
            n20 = 0;
            f18 = 0.0f;
            n15 = 7;
            f16 = 9.8E-45f;
            n8 = 0;
            f12 = 0.0f;
            object17 = null;
            LP1 lP1 = androidx.compose.foundation.d.b((LP1)object14, false, null, (Function0)object18, n15);
            l3 = xx_1.h;
            n18 = 12;
            l2 = Em3.f(n18);
            n7 = 0;
            n4 = 130960;
            n10 = 0;
            f15 = 0.0f;
            Object var23_83 = null;
            l4 = 0L;
            f11 = 0.0f;
            object16 = null;
            object13 = null;
            l7 = 0L;
            object12 = null;
            n17 = 0;
            n20$a$b = null;
            n20$a$d = null;
            n3 = 1772928;
            object18 = object21;
            tv0_0 tv0_04 = tv0_02;
            object14 = object3;
            object19 = object10;
            object11 = object3;
            Ll3.b((String)object21, lP1, l3, l2, null, tv0_02, (RU0)object10, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object3, n3, 0, n4);
        } else {
            object14 = object3;
        }
        object14.E();
        object14.p();
        n24 = (int)(cp$a.w() ? 1 : 0);
        if (n24 != 0 && object9 != null && (n24 = ((String)object9).length()) != 0 && n14 == 0 && f7 <= 0) {
            object18 = object4;
            n24 = 12;
            f20 = 1.7E-44f;
            ((Ref$IntRef)object4).element = n24;
        }
        n24 = -484971859;
        f20 = -2.8023685E21f;
        object14.K(n24);
        if (n14 == 0 && (n24 = (int)((f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) > 0) {
            object21 = qz2_0.u(f6);
            object18 = StringCompanionObject.INSTANCE;
            n22 = R$string.you_saved;
            object18 = nk_0.f((b30_0)object14, n22);
            object21 = kp1_0.c(" ", (String)object21);
            n20 = 1;
            objectArray = new Object[n20];
            objectArray[0] = object21;
            object21 = xh2_0.a(objectArray, n20, (String)object18, "format(...)");
            n22 = 4;
            f19 = 5.6E-45f;
            f16 = n22;
            n8 = 0;
            f12 = 0.0f;
            object17 = null;
            n16 = 4;
            f17 = 5.6E-45f;
            object18 = object20;
            f18 = f14;
            f8 = f14;
            LP1 lP1 = androidx.compose.foundation.layout.h.i((LP1)object20, f14, f16, 0.0f, f14, n16);
            l3 = xx_1.t;
            tv0_0 tv0_05 = tv0_0.m;
            n21 = 12;
            l2 = Em3.f(n21);
            n7 = 0;
            n4 = 130960;
            n10 = 0;
            f15 = 0.0f;
            Object var23_84 = null;
            l4 = 0L;
            f11 = 0.0f;
            object16 = null;
            object13 = null;
            l7 = 0L;
            object12 = null;
            n17 = 0;
            n20$a$b = null;
            n20$a$d = null;
            n3 = 1772928;
            object18 = object21;
            object19 = object10;
            object11 = object14;
            Ll3.b((String)object21, lP1, l3, l2, null, tv0_05, (RU0)object10, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object14, n3, 0, n4);
        }
        object14.E();
        object14.p();
        return Unit.a;
    }
}

