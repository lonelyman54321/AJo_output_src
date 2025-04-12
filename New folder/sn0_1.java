/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sN0
 */
public final class sn0_1 {
    /*
     * WARNING - void declaration
     */
    public static final void a(la2_0 la2_02, id1_2 id1_22, p9_0 p9_02, ne2_2 ne2_22, b30_0 object, int bl2) {
        fx0_2 fx0_22;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        boolean bl3;
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        Intrinsics.checkNotNullParameter(la2_02, "orderCommunicationPacketConfig");
        Intrinsics.checkNotNullParameter(id1_22, "onCloseButtonClicked");
        Intrinsics.checkNotNullParameter(p9_02, "onCtaButtonClicked");
        Object object6 = "onOutsideClicked";
        Intrinsics.checkNotNullParameter(ne2_22, (String)object6);
        object = object.g(1307569312);
        int bl4 = bl2 & 0xE;
        if (bl4 == 0) {
            void var7_11;
            boolean bl5 = ((j30_0)object).J(la2_02);
            if (bl5) {
                int n14 = 4;
            } else {
                int n15 = 2;
            }
            int n16 = var7_11 | bl2;
        } else {
            int n17 = bl2;
        }
        int n18 = bl2 & 0x70;
        int n19 = 32;
        if (n18 == 0) {
            void var8_23;
            void var7_14;
            boolean bl6 = ((j30_0)object).x(id1_22);
            if (bl6) {
                int n20 = 32;
            } else {
                int n21 = 16;
            }
            n10 = var7_14 | var8_23;
        }
        int n22 = bl2 & 0x380;
        int n24 = 256;
        if (n22 == 0) {
            void var8_28;
            boolean bl7 = ((j30_0)object).x(p9_02);
            if (bl7) {
                int n25 = 256;
            } else {
                int n26 = 128;
            }
            n8 = n10 | var8_28;
        }
        int n27 = bl2 & 0x1C00;
        int n28 = 2048;
        if (n27 == 0) {
            void var8_33;
            boolean bl8 = ((j30_0)object).x(ne2_22);
            if (bl8) {
                int n29 = 2048;
            } else {
                int n30 = 1024;
            }
            n7 = n8 | var8_33;
        }
        if ((n4 = n7 & 0x16DB) == (n3 = 1170) && (bl3 = ((j30_0)object).h())) {
            ((j30_0)object).D();
        } else {
            void var9_44;
            void var8_39;
            object5 = la2_02.e();
            if (object5 == null) {
                object5 = "";
            }
            object4 = object5;
            ((j30_0)object).K(-1611022624);
            int n32 = n7 & 0x70;
            boolean bl9 = false;
            boolean bl10 = true;
            if (n32 == n19) {
                boolean bl11 = true;
            } else {
                boolean bl12 = false;
                object5 = null;
            }
            object3 = ((j30_0)object).v();
            b30$a$a b30$a$a = b30$a.a;
            if (var8_39 != false || object3 == b30$a$a) {
                object3 = new nn0_1(id1_22);
                ((j30_0)object).o(object3);
            }
            object5 = object3;
            object5 = (Function0)object3;
            ((j30_0)object).T(false);
            ((j30_0)object).K(-1611020674);
            int n34 = n7 & 0x380;
            if (n34 == n24) {
                boolean bl13 = true;
            } else {
                boolean bl14 = false;
                object3 = null;
            }
            object2 = ((j30_0)object).v();
            if (var9_44 != false || object2 == b30$a$a) {
                int n35 = 2;
                object2 = new W7(p9_02, n35);
                ((j30_0)object).o(object2);
            }
            object3 = object2;
            object3 = (Function0)object2;
            ((j30_0)object).T(false);
            int n36 = -1611018852;
            ((j30_0)object).K(n36);
            int n37 = n7 & 0x1C00;
            if (n37 != n28) {
                bl10 = false;
            }
            object6 = ((j30_0)object).v();
            if (bl10 || object6 == b30$a$a) {
                boolean bl15 = false;
                object2 = null;
                object6 = new on0_1(ne2_22, 0);
                ((j30_0)object).o(object6);
            }
            object2 = object6;
            object2 = (Function0)object6;
            ((j30_0)object).T(false);
            object6 = new rn0_2(la2_02);
            n28 = 1875106150;
            fx0_22 = v10.c(n28, (fx0_2)object6, (b30_0)object);
            int n38 = 27648;
            boolean bl16 = true;
            vb2.c((Function0)object5, (Function0)object3, (Function0)object2, (u10)fx0_22, bl16, (String)object4, (b30_0)object, n38);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            object6 = object4;
            object5 = la2_02;
            object3 = id1_22;
            object2 = p9_02;
            fx0_22 = ne2_22;
            int n39 = bl2;
            ((CF2)object).d = object4 = new pn0_1(la2_02, id1_22, p9_02, ne2_22, bl2);
        }
    }

    public static final void b(Product product, String string2, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(product, "product");
        int n4 = 1783882991;
        object = object.g(n4);
        fx0_2 fx0_22 = new mz0_1(product, string2);
        u10 u102 = v10.c(27151961, fx0_22, (b30_0)object);
        int n7 = 3072;
        int n8 = 7;
        OA.a(null, null, false, u102, (b30_0)object, n7, n8);
        object = ((j30_0)object).X();
        if (object != null) {
            fx0_22 = new jz0_2(product, n3, string2);
            ((CF2)object).d = fx0_22;
        }
    }
}

