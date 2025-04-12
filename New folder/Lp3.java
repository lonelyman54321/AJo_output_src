/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$color;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class Lp3 {
    public static final void a(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, b30_0 b30_02, int n3) {
        boolean bl2;
        boolean bl3;
        Object object;
        Object object2;
        int n4;
        Object object3;
        Object object4 = qz1_22;
        SelectedOrderItem selectedOrderItem2 = selectedOrderItem;
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n7 = 548869061;
        Object object5 = b30_02;
        Object object6 = b30_02.g(n7);
        qz1_22.getClass();
        object5 = LP1$a.b;
        float f5 = 1.0f;
        int n8 = 10;
        int n10 = 48;
        int n14 = 16;
        float f6 = 2.2E-44f;
        if (selectedOrderItem != null && (object3 = selectedOrderItem.getConsignment()) != null && ((n4 = b.i((String)(object2 = ((Consignment)object3).getShipmentStatus()), (String)(object = "DELIVERED"), bl3 = true)) != 0 || (bl2 = b.i((String)(object3 = ((Consignment)object3).getShipmentStatus()), (String)(object2 = "DELIVERY UNSUCCESSFUL"), bl3)))) {
            float f7;
            ((j30_0)object6).K(367765933);
            long l2 = 4602678819172646912L;
            double d2 = 0.5;
            float f8 = (float)d2;
            n4 = R$color.accent_color_17;
            long l3 = oy_0.a((b30_0)object6, n4);
            nz nz4 = oz_0.a(l3, f8);
            f6 = f7 = (float)n14;
            object5 = j.c(h.i((LP1)object5, f7, 0.0f, f7, f7, 2), f5);
            f6 = n10;
            LP1 lP1 = j.d((LP1)object5, f6);
            float f11 = n8;
            object2 = SP2.a(f11);
            object5 = new ip3_0((qz1_2)object4, selectedOrderItem2);
            u10 u102 = n20_0.a;
            bl3 = false;
            Object var32_37 = null;
            f5 = 0.0f;
            bl2 = false;
            f8 = 0.0f;
            object3 = null;
            int n15 = 412;
            object = nz4;
            j30_0 j30_02 = object6;
            int n16 = 0x30000030;
            ME.b((Function0)object5, lP1, false, (rp2_0)object2, nz4, null, null, u102, (b30_0)object6, n16, n15);
            ((j30_0)object6).T(false);
        } else {
            float f12;
            ((j30_0)object6).K(368540654);
            f6 = f12 = (float)n14;
            object5 = j.c(h.i((LP1)object5, f12, 0.0f, f12, f12, 2), f5);
            f6 = n10;
            LP1 lP1 = j.d((LP1)object5, f6);
            object5 = GE.a;
            int n17 = R$color.accent_color_10;
            long l4 = oy_0.a((b30_0)object6, n17);
            long l7 = 0L;
            double d5 = 0.0;
            bl3 = false;
            object = object6;
            Object object7 = GE.a(l4, l7, (b30_0)object6, 0, 14);
            float f14 = n8;
            rp2_0 rp2_02 = SP2.a(f14);
            object5 = new jp3_0((qz1_2)object4);
            Object object8 = n20_0.b;
            f5 = 0.0f;
            bl2 = false;
            float f15 = 0.0f;
            object3 = null;
            n4 = 0;
            object2 = null;
            f12 = 0.0f;
            object = null;
            int n18 = 0x30000030;
            float f16 = 4.6566395E-10f;
            int n19 = 348;
            LP1 lP12 = lP1;
            ol0 ol02 = object7;
            n10 = 0;
            lP1 = null;
            object7 = object8;
            object8 = object6;
            int n20 = n18;
            object4 = null;
            ME.a((Function0)object5, lP12, false, null, null, rp2_02, null, ol02, null, (u10)object7, (b30_0)object6, n18, n19);
            ((j30_0)object6).T(false);
        }
        object4 = ((j30_0)object6).X();
        if (object4 != null) {
            object5 = qz1_22;
            n14 = n3;
            ((CF2)object4).d = object6 = new kp3_0(qz1_22, selectedOrderItem2, n3);
        }
    }
}

