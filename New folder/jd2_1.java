/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from jd2
 */
public final class jd2_1 {
    public static final void a(ArrayList arrayList, kd2_1 kd2_12, ld2_1 ld2_12, md2_1 md2_12, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(kd2_12, "onCloseSheetButtonClicked");
        Intrinsics.checkNotNullParameter(ld2_12, "onCloseButtonClicked");
        Object object2 = "onCancelButtonClicked";
        Intrinsics.checkNotNullParameter(md2_12, (String)object2);
        object = object.g(-740154769);
        ((j30_0)object).K(-115896192);
        int n4 = n3 & 0x70 ^ 0x30;
        Object object3 = null;
        int n7 = 32;
        if (n4 > n7 && (n4 = (int)(((j30_0)object).J(kd2_12) ? 1 : 0)) != 0 || (n4 = n3 & 0x30) == n7) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        Object object4 = ((j30_0)object).v();
        if (n4 != 0 || object4 == (object2 = b30$a.a)) {
            n4 = 1;
            object4 = new to_2(kd2_12, n4);
            ((j30_0)object).o(object4);
        }
        object2 = object4;
        object2 = (Function0)object4;
        ((j30_0)object).T(false);
        object3 = new oc2_0(arrayList, ld2_12, md2_12);
        n7 = -1488729165;
        object4 = v10.c(n7, (fx0_2)object3, (b30_0)object);
        int n8 = 48;
        int n10 = 12;
        object3 = object2;
        vb2.b((Function0)object2, (u10)object4, false, null, (b30_0)object, n8, n10);
        object = ((j30_0)object).X();
        if (object != null) {
            ac2_0 ac2_02;
            object2 = ac2_02;
            object3 = arrayList;
            object4 = kd2_12;
            ac2_02 = new ac2_0(arrayList, kd2_12, ld2_12, md2_12, n3);
            ((CF2)object).d = ac2_02;
        }
    }

    public static final void b(sd2_2 sd2_22, yb_1 yb_12, boolean bl2, b30_0 object, int n3) {
        int n4;
        Intrinsics.checkNotNullParameter(sd2_22, "onCloseButtonClicked");
        Object object2 = "onOkayButtonClicked";
        Intrinsics.checkNotNullParameter(yb_12, (String)object2);
        object = object.g(-1922596250);
        int n7 = n3 & 0xE;
        int n8 = 4;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).x(sd2_22) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        int n10 = n3 & 0x70;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object).x(yb_12) ? 1 : 0);
            n10 = n10 != 0 ? 32 : 16;
            n7 |= n10;
        }
        if ((n10 = n3 & 0x380) == 0) {
            n10 = (int)(((j30_0)object).a(bl2) ? 1 : 0);
            n10 = n10 != 0 ? 256 : 128;
            n7 |= n10;
        }
        if ((n10 = n7 & 0x2DB) == (n4 = 146) && (n10 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            ((j30_0)object).K(704451631);
            n10 = 0;
            u10 u102 = null;
            if ((n7 &= 0xE) == n8) {
                n7 = 1;
            } else {
                n7 = 0;
                object2 = null;
            }
            Object object3 = ((j30_0)object).v();
            if (n7 != 0 || object3 == (object2 = b30$a.a)) {
                object3 = new yb2_1(sd2_22);
                ((j30_0)object).o(object3);
            }
            object3 = (Function0)object3;
            ((j30_0)object).T(false);
            object2 = new qc2_0(bl2, yb_12);
            n10 = -721838942;
            u102 = v10.c(n10, (fx0_2)object2, (b30_0)object);
            n4 = 0;
            int n14 = 48;
            int n15 = 12;
            vb2.b((Function0)object3, u102, false, null, (b30_0)object, n14, n15);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new zb2_1(sd2_22, yb_12, bl2, n3);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final void c(CartOrder cartOrder, rd1_1 rd1_12, b30_0 object, int n3) {
        void var6_11;
        Object object2;
        int n4;
        boolean bl2;
        Intrinsics.checkNotNullParameter(cartOrder, "cartOrder");
        Intrinsics.checkNotNullParameter(rd1_12, "onCloseButtonClicked");
        int n42 = -1166466357;
        object = object.g(n42);
        Object object3 = new Ref$IntRef();
        ((j30_0)object).K(134850992);
        int bl22 = n3 & 0x70 ^ 0x30;
        Function2 function2 = null;
        int n7 = 32;
        if (bl22 > n7 && (bl2 = ((j30_0)object).J(rd1_12)) || (n4 = n3 & 0x30) == n7) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            object2 = null;
        }
        Object object4 = ((j30_0)object).v();
        if (var6_11 != false || object4 == (object2 = b30$a.a)) {
            boolean bl5 = false;
            object2 = null;
            object4 = new vb2_0(rd1_12, 0);
            ((j30_0)object).o(object4);
        }
        object2 = object4;
        object2 = (Function0)object4;
        ((j30_0)object).T(false);
        function2 = new xc2_1(cartOrder, (Ref$IntRef)object3);
        n42 = -1298942201;
        function2 = v10.c(n42, function2, (b30_0)object);
        boolean bl6 = true;
        int n8 = 432;
        int n10 = 8;
        vb2.b((Function0)object2, (u10)function2, bl6, null, (b30_0)object, n8, n10);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object3 = new ec2_0(cartOrder, rd1_12, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void d(String string2, List list, int n3, String string3, boolean bl2, b30_0 b30_02, int n4) {
        gc2_0 gc2_02;
        String string4 = string2;
        Intrinsics.checkNotNullParameter(string2, "status");
        Intrinsics.checkNotNullParameter(list, "entries");
        Object object = "orderCode";
        Intrinsics.checkNotNullParameter(string3, (String)object);
        Object object2 = b30_02;
        j30_0 j30_02 = b30_02.g(508863935);
        int n7 = list.isEmpty();
        if (n7 != 0) {
            CF2 cF2 = j30_02.X();
            if (cF2 != null) {
                bc2_1 bc2_12;
                object = bc2_12;
                object2 = string2;
                String string5 = string3;
                Object var15_18 = null;
                int n8 = n4;
                bc2_12 = new bc2_1(string2, list, n3, string3, false, n4);
                cF2.d = bc2_12;
            }
            return;
        }
        object = AndroidCompositionLocals_androidKt.b;
        int n10 = (object = j30_02.j((H30)object)) instanceof Activity;
        if (n10 != 0) {
            object = (Activity)object;
        } else {
            n7 = 0;
            object = null;
        }
        Object object3 = object;
        object = j30_02.v();
        object2 = b30$a.a;
        if (object == object2) {
            object = Qx2.a(ly0_0.f(f.a, j30_02), j30_02);
        }
        object = ((Q30)object).a;
        boolean bl3 = "DELIVERED".equalsIgnoreCase(string4);
        Object object4 = ((CartEntry)CollectionsKt.L(list)).getShipmentCode();
        LP1 lP1 = j.c(LP1$a.b, 1.0f);
        Object object5 = object;
        object5 = (c80)object;
        object = gc2_02;
        n10 = n3;
        Object object6 = list;
        gc2_02 = new gc2_0(n3, bl3, string2, (c80)object5, (Activity)object3, string3, (String)object4, list);
        n7 = -2093747927;
        object5 = v10.c(n7, gc2_02, j30_02);
        bl3 = false;
        int n14 = 3078;
        int n15 = 6;
        object2 = lP1;
        object3 = j30_02;
        OA.a(lP1, null, false, (u10)object5, j30_02, n14, n15);
        object4 = j30_02.X();
        if (object4 != null) {
            object = object6;
            object2 = string2;
            object5 = string3;
            object3 = null;
            n14 = n4;
            ((CF2)object4).d = object6 = new cc2_1(string2, list, n3, string3, false, n4);
        }
    }

    public static final void e(Function2 function2, ou0_0 ou0_02, Function1 function1, b30_0 object, int n3) {
        int n4;
        fx0_2 fx0_22;
        Object object2;
        Intrinsics.checkNotNullParameter(ou0_02, "focusRequester");
        Object object3 = "onShowFocus";
        Intrinsics.checkNotNullParameter(function1, (String)object3);
        object = object.g(1238342570);
        int n7 = n3 & 0xE;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).x(function2) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        int n8 = n3 & 0x70;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object).J(ou0_02) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        if ((n8 = n3 & 0x380) == 0) {
            n8 = (int)(((j30_0)object).x(function1) ? 1 : 0);
            n8 = n8 != 0 ? 256 : 128;
            n7 |= n8;
        }
        if ((n7 &= 0x2DB) == (n8 = 146) && (n7 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            object2 = new Object[]{};
            fx0_22 = new Object();
            n4 = 3080;
            Object object4 = object;
            object3 = (tr1_0)wi2_0.b(object2, null, fx0_22, (b30_0)object, n4, 6);
            object2 = new hc2_1((tr1_0)object3, ou0_02, function2, function1);
            n7 = 799797504;
            object4 = v10.c(n7, (fx0_2)object2, (b30_0)object);
            fx0_22 = null;
            n8 = 0;
            object2 = null;
            int n10 = 3072;
            int n14 = 7;
            OA.a(null, null, false, (u10)object4, (b30_0)object, n10, n14);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            em0_1 em0_12;
            n4 = 1;
            object3 = em0_12;
            object2 = function2;
            fx0_22 = function1;
            em0_12 = new em0_1(function2, ou0_02, function1, n3, n4);
            ((CF2)object).d = em0_12;
        }
    }

    public static final void f(CartOrder cartOrder, qz1_2 qz1_22, CartEntry cartEntry, Product product, SelectedOrderItem selectedOrderItem, rd2_2 rd2_22, ad2_1 ad2_12, b30_0 b30_02, int n3) {
        rd2_2 rd2_23 = rd2_22;
        Intrinsics.checkNotNullParameter(cartOrder, "cartOrder");
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        Intrinsics.checkNotNullParameter(cartEntry, "cartEntry");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(rd2_22, "onCloseButtonClicked");
        Intrinsics.checkNotNullParameter(ad2_12, "onOkayButtonClicked");
        int n4 = -558435059;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        ((j30_0)object2).K(-852799879);
        int n7 = n3 & 0x70000;
        int n8 = 196608;
        int n10 = 131072;
        if ((n7 ^= n8) > n10 && (n7 = (int)(((j30_0)object2).J(rd2_22) ? 1 : 0)) != 0 || (n7 = n3 & n8) == n10) {
            n7 = 1;
        } else {
            n7 = 0;
            object = null;
        }
        Object object3 = ((j30_0)object2).v();
        if (n7 != 0 || object3 == (object = b30$a.a)) {
            object3 = new fc2_0(rd2_23);
            ((j30_0)object2).o(object3);
        }
        Object object4 = object3;
        object4 = (Function0)object3;
        ((j30_0)object2).T(false);
        object3 = object;
        Object object5 = cartEntry;
        Object object6 = product;
        object = new kc2_0(selectedOrderItem, cartEntry, product, qz1_22, ad2_12);
        n8 = -69562807;
        u10 u102 = v10.c(n8, (fx0_2)object, (b30_0)object2);
        int n14 = 48;
        int n15 = 12;
        vb2.b((Function0)object4, u102, false, null, (b30_0)object2, n14, n15);
        object5 = ((j30_0)object2).X();
        if (object5 != null) {
            object2 = object6;
            object = selectedOrderItem;
            rd2_23 = rd2_22;
            object3 = ad2_12;
            ((CF2)object5).d = object6 = new gc2_1(cartOrder, qz1_22, cartEntry, product, selectedOrderItem, rd2_22, ad2_12, n3);
        }
    }

    public static final void g(md2_2 md2_22, nb_1 nb_12, qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(md2_22, "onCloseSheetButtonClicked");
        Intrinsics.checkNotNullParameter(nb_12, "onCloseButtonClicked");
        Object object2 = "viewModel";
        Intrinsics.checkNotNullParameter(qz1_22, (String)object2);
        object = object.g(959980094);
        ((j30_0)object).K(-435076916);
        int n4 = n3 & 0xE ^ 6;
        Object object3 = null;
        int n7 = 4;
        if (n4 > n7 && (n4 = (int)(((j30_0)object).J(md2_22) ? 1 : 0)) != 0 || (n4 = n3 & 6) == n7) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        Object object4 = ((j30_0)object).v();
        if (n4 != 0 || object4 == (object2 = b30$a.a)) {
            object4 = new wb2_1(md2_22);
            ((j30_0)object).o(object4);
        }
        object2 = object4;
        object2 = (Function0)object4;
        ((j30_0)object).T(false);
        object3 = new sc2_1(qz1_22, selectedOrderItem, md2_22, nb_12);
        n7 = -583924350;
        object4 = v10.c(n7, (fx0_2)object3, (b30_0)object);
        int n8 = 48;
        int n10 = 12;
        object3 = object2;
        vb2.b((Function0)object2, (u10)object4, false, null, (b30_0)object, n8, n10);
        object = ((j30_0)object).X();
        if (object != null) {
            xb2_1 xb2_12;
            object2 = xb2_12;
            object3 = md2_22;
            object4 = nb_12;
            xb2_12 = new xb2_1(md2_22, nb_12, qz1_22, selectedOrderItem, n3);
            ((CF2)object).d = xb2_12;
        }
    }

    public static final void h(yp0_2 yp0_22, je1_0 je1_02, qz1_2 qz1_22, b30_0 b30_02, int n3) {
        Object object = yp0_22;
        Object object2 = je1_02;
        Object object3 = qz1_22;
        int n4 = n3;
        Intrinsics.checkNotNullParameter(yp0_22, "onCloseButtonClicked");
        Intrinsics.checkNotNullParameter(je1_02, "onUpdateClicked");
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        Object object4 = b30_02;
        Object object5 = b30_02.g(2045376489);
        int n7 = 1277088062;
        ((j30_0)object5).K(n7);
        Object object6 = ((j30_0)object5).v();
        object4 = b30$a.a;
        if (object6 == object4) {
            object6 = new ou0_0();
            ((j30_0)object5).o(object6);
        }
        Object object7 = object6;
        object7 = (ou0_0)object6;
        n7 = 0;
        object6 = null;
        int n8 = 1277089854;
        Object object8 = wg2_2.a((j30_0)object5, false, n8);
        if (object8 == object4) {
            object8 = new ou0_0();
            ((j30_0)object5).o(object8);
        }
        object8 = (ou0_0)object8;
        int n10 = 1277091646;
        Object object9 = wg2_2.a((j30_0)object5, false, n10);
        if (object9 == object4) {
            object9 = new ou0_0();
            ((j30_0)object5).o(object9);
        }
        object9 = (ou0_0)object9;
        int n14 = 1277093438;
        Object object10 = wg2_2.a((j30_0)object5, false, n14);
        if (object10 == object4) {
            object10 = new ou0_0();
            ((j30_0)object5).o(object10);
        }
        object10 = (ou0_0)object10;
        ((j30_0)object5).T(false);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        int n15 = 1277094960;
        ((j30_0)object5).K(n15);
        Object object11 = ((j30_0)object5).v();
        Object object12 = "";
        if (object11 == object4) {
            ((j30_0)object5).o(object12);
            object11 = object12;
        }
        object11 = (String)object11;
        ((j30_0)object5).T(false);
        ref$ObjectRef.element = object11;
        object11 = new Ref$ObjectRef();
        int n16 = 1277096016;
        ((j30_0)object5).K(n16);
        Object object13 = ((j30_0)object5).v();
        if (object13 == object4) {
            ((j30_0)object5).o(object12);
            object13 = object12;
        }
        object13 = (String)object13;
        ((j30_0)object5).T(false);
        ((Ref$ObjectRef)object11).element = object13;
        object13 = new Ref$ObjectRef();
        int n17 = 1277097072;
        ((j30_0)object5).K(n17);
        Object object14 = ((j30_0)object5).v();
        if (object14 == object4) {
            ((j30_0)object5).o(object12);
            object14 = object12;
        }
        object14 = (String)object14;
        ((j30_0)object5).T(false);
        ((Ref$ObjectRef)object13).element = object14;
        object14 = new Ref$ObjectRef();
        n7 = 1277098128;
        ((j30_0)object5).K(n7);
        object6 = ((j30_0)object5).v();
        if (object6 == object4) {
            ((j30_0)object5).o(object12);
        } else {
            object12 = object6;
        }
        object12 = (String)object12;
        ((j30_0)object5).T(false);
        ((Ref$ObjectRef)object14).element = object12;
        object6 = O30.n;
        object12 = object6 = ((j30_0)object5).j((H30)object6);
        object12 = (b93)object6;
        ((j30_0)object5).K(1277102471);
        n7 = n4 & 0xE ^ 6;
        int n18 = 4;
        if (n7 > n18 && (n7 = (int)(((j30_0)object5).J(object) ? 1 : 0)) != 0 || (n7 = n4 & 6) == n18) {
            n7 = 1;
        } else {
            n7 = 0;
            object6 = null;
        }
        object2 = ((j30_0)object5).v();
        if (n7 != 0 || object2 == object4) {
            n7 = 1;
            object2 = new mm0_0(object, n7);
            ((j30_0)object5).o(object2);
        }
        object2 = (Function0)object2;
        ((j30_0)object5).T(false);
        object6 = object4;
        object = object4;
        object4 = object7;
        object7 = object8;
        object8 = object9;
        object9 = object10;
        object10 = object12;
        object12 = object13;
        object13 = object14;
        object14 = qz1_22;
        object3 = object5;
        object5 = yp0_22;
        object6 = new dd2_1((ou0_0)object4, (ou0_0)object7, (ou0_0)object8, (ou0_0)object9, (b93)object10, ref$ObjectRef, (Ref$ObjectRef)object11, (Ref$ObjectRef)object12, (Ref$ObjectRef)object13, qz1_22, yp0_22, je1_02);
        n7 = -1048833499;
        object7 = v10.c(n7, (fx0_2)object6, (b30_0)object3);
        n8 = 0;
        object8 = null;
        n10 = 0;
        object9 = null;
        int n19 = 48;
        n15 = 12;
        object4 = object2;
        object10 = object3;
        vb2.b((Function0)object2, (u10)object7, false, null, (b30_0)object3, n19, n15);
        object6 = ((j30_0)object3).X();
        if (object6 != null) {
            object7 = yp0_22;
            object8 = je1_02;
            object9 = qz1_22;
            n14 = n3;
            ((CF2)object6).d = object4 = new kc2_1(yp0_22, je1_02, qz1_22, n3);
        }
    }

    public static final void i(n8_0 n8_02, o8_0 o8_02, String string2, b30_0 object, int n3) {
        int n4;
        Intrinsics.checkNotNullParameter(n8_02, "onCloseButtonClicked");
        Object object2 = "onLinkButtonClicked";
        Intrinsics.checkNotNullParameter(o8_02, (String)object2);
        object = object.g(-1642010097);
        int n7 = n3 & 0xE;
        int n8 = 4;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).x(n8_02) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        int n10 = n3 & 0x70;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object).x(o8_02) ? 1 : 0);
            n10 = n10 != 0 ? 32 : 16;
            n7 |= n10;
        }
        if ((n10 = n3 & 0x380) == 0) {
            n10 = (int)(((j30_0)object).J(string2) ? 1 : 0);
            n10 = n10 != 0 ? 256 : 128;
            n7 |= n10;
        }
        if ((n10 = n7 & 0x2DB) == (n4 = 146) && (n10 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            ((j30_0)object).K(-301636609);
            n10 = 0;
            u10 u102 = null;
            if ((n7 &= 0xE) == n8) {
                n7 = 1;
            } else {
                n7 = 0;
                object2 = null;
            }
            Object object3 = ((j30_0)object).v();
            if (n7 != 0 || object3 == (object2 = b30$a.a)) {
                n7 = 1;
                object3 = new fz1_1(n8_02, n7);
                ((j30_0)object).o(object3);
            }
            object3 = (Function0)object3;
            ((j30_0)object).T(false);
            object2 = new gd2_1(o8_02, n8_02, string2);
            n10 = -1713005741;
            u102 = v10.c(n10, (fx0_2)object2, (b30_0)object);
            n4 = 0;
            int n14 = 48;
            int n15 = 12;
            vb2.b((Function0)object3, u102, false, null, (b30_0)object, n14, n15);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new hc2_2(n8_02, o8_02, string2, n3);
        }
    }

    public static final void j(u8_0 u8_02, b30_0 object, int n3) {
        Object object2 = "closeButtonClick";
        Intrinsics.checkNotNullParameter(u8_02, (String)object2);
        object = object.g(730167798);
        int n4 = n3 & 0xE;
        int n7 = 2;
        int n8 = 4;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).x(u8_02) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n10 = n4 & 0xB;
        if (n10 == n7 && (n7 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            ((j30_0)object).K(-373219165);
            n7 = 0;
            if ((n4 &= 0xE) == n8) {
                n4 = 1;
            } else {
                n4 = 0;
                object2 = null;
            }
            Object object3 = ((j30_0)object).v();
            if (n4 != 0 || object3 == (object2 = b30$a.a)) {
                object3 = new ic2_1(u8_02);
                ((j30_0)object).o(object3);
            }
            object3 = (Function0)object3;
            ((j30_0)object).T(false);
            object2 = new id2_2(u8_02);
            object2 = v10.c(926067017, (fx0_2)object2, (b30_0)object);
            n7 = 48;
            vb2.d((Function0)object3, (u10)object2, (b30_0)object, n7);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new jc2_2(u8_02, n3);
        }
    }
}

