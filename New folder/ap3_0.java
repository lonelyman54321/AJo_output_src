/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$color;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ap3
 */
public final class ap3_0 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, boolean n3, boolean bl2, b30_0 b30_02, int n4) {
        mq2_0 mq2_02;
        Object object;
        ol0 ol02;
        Object object2;
        Object object3;
        long l2;
        int n7;
        float f5;
        float f6;
        float f7;
        int n8;
        long l3;
        qz1_2 qz1_23 = qz1_22;
        int n10 = 1;
        float f8 = Float.MIN_VALUE;
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n14 = 1657875016;
        Object object4 = b30_02;
        Object object5 = b30_02.g(n14);
        object4 = zp.f;
        LP1$a lP1$a = LP1$a.b;
        int n15 = 1065353216;
        float f11 = 1.0f;
        Object object6 = j.c(lP1$a, f11);
        Object object7 = Nc$a.j;
        int n16 = 6;
        object4 = iQ2.a((zp$e)object4, (Gx$b)object7, (b30_0)object5, n16);
        int n17 = ((j30_0)object5).P;
        Object object8 = ((j30_0)object5).P();
        object6 = a30_0.c((b30_0)object5, (LP1)object6);
        N20.W.getClass();
        Object object9 = N20$a.b;
        Object object10 = ((j30_0)object5).a;
        boolean bl3 = object10 instanceof mp;
        if (!bl3) {
            s20.a();
            throw null;
        }
        ((j30_0)object5).A();
        bl3 = ((j30_0)object5).O;
        if (bl3) {
            ((j30_0)object5).C((Function0)object9);
        } else {
            ((j30_0)object5).n();
        }
        object9 = N20$a.e;
        Ow3.a((b30_0)object5, object4, (Function2)object9);
        object4 = N20$a.d;
        Ow3.a((b30_0)object5, object8, (Function2)object4);
        object4 = N20$a.f;
        n16 = (int)(((j30_0)object5).O ? 1 : 0);
        if (n16 != 0 || (n16 = (int)(Intrinsics.areEqual(object8 = ((j30_0)object5).v(), object9 = Integer.valueOf(n17)) ? 1 : 0)) == 0) {
            rk_0.a(n17, (j30_0)object5, n17, (N20$a$a)object4);
        }
        object4 = N20$a.c;
        Ow3.a((b30_0)object5, object6, (Function2)object4);
        Object object11 = mq2_0.a;
        int n18 = -1614061719;
        float f12 = -8.613169E-20f;
        ((j30_0)object5).K(n18);
        int n19 = 48;
        int n20 = 7;
        int n21 = 10;
        if (n3 != 0) {
            l3 = 4602678819172646912L;
            double d2 = 0.5;
            f12 = (float)d2;
            n8 = R$color.accent_color_17;
            long l4 = oy_0.a((b30_0)object5, n8);
            nz nz4 = oz_0.a(l4, f12);
            f12 = n21;
            f6 = bl2 ? (f7 = (float)n20) : f12;
            object6 = lP1$a;
            f5 = f12;
            object6 = h.i(lP1$a, f12, 0.0f, f6, f12, 2);
            object6 = ((mq2_0)object11).a((LP1)object6, f11, n10 != 0);
            f5 = n19;
            LP1 lP1 = j.d((LP1)object6, f5);
            object6 = GE.a;
            n8 = R$color.accent_color_11;
            l4 = oy_0.a((b30_0)object5, n8);
            n7 = 14;
            long l7 = 0L;
            bl3 = false;
            l3 = l4;
            l2 = l7;
            object9 = object5;
            ol0 ol03 = GE.a(l4, l7, (b30_0)object5, 0, n7);
            object10 = SP2.a(f12);
            object4 = new rd2_2(qz1_23, n10);
            object3 = m20_0.b;
            f6 = 0.0f;
            object9 = null;
            n17 = 0;
            f5 = 0.0f;
            object7 = null;
            n16 = 0;
            object8 = null;
            int n22 = 0x30000000;
            float f14 = 4.656613E-10f;
            int n24 = 284;
            object6 = lP1;
            object2 = ol03;
            n10 = 7;
            f8 = 9.8E-45f;
            n20 = 0;
            ol02 = null;
            object = object3;
            mq2_02 = object11;
            object11 = object5;
            n15 = n22;
            f11 = f14;
            object3 = lP1$a;
            ME.a((Function0)object4, lP1, false, null, null, (i13)object10, nz4, ol03, null, (u10)object, (b30_0)object5, n22, n24);
        } else {
            mq2_02 = object11;
            object3 = lP1$a;
            n10 = 7;
            f8 = 9.8E-45f;
        }
        lP1$a = null;
        ((j30_0)object5).T(false);
        n18 = -1614037560;
        f12 = -8.628781E-20f;
        ((j30_0)object5).K(n18);
        if (bl2) {
            if (n3 != 0) {
                f5 = n10;
                n10 = 10;
                f8 = 1.4E-44f;
            } else {
                n10 = 10;
                f8 = 1.4E-44f;
                f5 = f12 = (float)n10;
            }
            f8 = n10;
            object6 = object3;
            f6 = f8;
            object4 = h.i((LP1)object3, f5, 0.0f, f8, f8, 2);
            object7 = mq2_02;
            object4 = mq2_02.a((LP1)object4, 1.0f, true);
            n8 = 48;
            f7 = n8;
            object2 = j.d((LP1)object4, f7);
            object4 = GE.a;
            n18 = R$color.pesdk_color_5;
            l3 = oy_0.a((b30_0)object5, n18);
            l2 = 0L;
            bl3 = false;
            object9 = object5;
            ol02 = GE.a(l3, l2, (b30_0)object5, 0, 14);
            object10 = SP2.a(f8);
            object4 = new sd2_2(qz1_23, 1);
            object = m20_0.c;
            n7 = 0;
            n17 = 0;
            f5 = 0.0f;
            object7 = null;
            n16 = 0;
            object8 = null;
            f6 = 0.0f;
            object9 = null;
            n15 = 0x30000000;
            f11 = 4.656613E-10f;
            int n25 = 348;
            object6 = object2;
            object2 = ol02;
            n20 = 0;
            ol02 = null;
            object11 = object5;
            n10 = 0;
            f8 = 0.0f;
            ME.a((Function0)object4, (LP1)object6, false, null, null, (i13)object10, null, (ol0)object2, null, (u10)object, (b30_0)object5, n15, n25);
        } else {
            n10 = 0;
            f8 = 0.0f;
        }
        n18 = 1;
        f12 = Float.MIN_VALUE;
        object8 = fn0_2.a((j30_0)object5, false, n18 != 0);
        if (object8 != null) {
            qz1_23 = qz1_22;
            object5 = selectedOrderItem;
            n18 = n3;
            n8 = (int)(bl2 ? 1 : 0);
            n17 = n4;
            ((CF2)object8).d = object9 = new xp3_0(qz1_22, selectedOrderItem, n3 != 0, bl2, n4);
        }
    }

    public static final void b(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, b30_0 b30_02, int n3) {
        float f5;
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n4 = -1248970867;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        object = LP1$a.b;
        float f6 = f5 = (float)16;
        object = j.c(h.i((LP1)object, f5, 0.0f, f5, f5, 2), 1.0f);
        int n7 = 48;
        f6 = n7;
        Object object3 = j.d((LP1)object, f6);
        object = GE.a;
        int n8 = R$color.accent_color_10;
        long l2 = oy_0.a((b30_0)object2, n8);
        long l3 = 0L;
        ol0 ol02 = GE.a(l2, l3, (b30_0)object2, 0, 14);
        n8 = 10;
        float f7 = n8;
        rp2_0 rp2_02 = SP2.a(f7);
        object = new yp3_0(qz1_22, selectedOrderItem);
        u10 u102 = m20_0.a;
        f5 = 0.0f;
        int n10 = 0x30000030;
        int n14 = 348;
        LP1 lP1 = object3;
        object3 = ol02;
        ol02 = null;
        ME.a((Function0)object, lP1, false, null, null, rp2_02, null, (ol0)object3, null, u102, (b30_0)object2, n10, n14);
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            n7 = n3;
            ((CF2)object2).d = object = new zp3_0(qz1_22, selectedOrderItem, n3);
        }
    }
}

