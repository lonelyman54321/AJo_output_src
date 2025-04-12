/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$color;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.jvm.internal.Intrinsics;

public final class Zp3 {
    public static final void a(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        object = object.g(-1326628858);
        double d2 = 0.5;
        float f5 = (float)d2;
        int n4 = R$color.accent_color_17;
        long l2 = oy_0.a((b30_0)object, n4);
        nz nz4 = oz_0.a(l2, f5);
        LP1$a lP1$a = LP1$a.b;
        float f6 = 16;
        Object object2 = j.c(h.i(lP1$a, f6, 0.0f, f6, f6, 2), 1.0f);
        n4 = 48;
        float f7 = n4;
        LP1 lP1 = j.d((LP1)object2, f7);
        int n7 = 10;
        f5 = n7;
        rp2_0 rp2_02 = SP2.a(f5);
        Xp3 xp3 = new Xp3(qz1_22, selectedOrderItem);
        u10 u102 = p20_0.a;
        lP1$a = null;
        int n8 = 0x30000030;
        f6 = 4.6566395E-10f;
        int n10 = 412;
        ME.b(xp3, lP1, false, rp2_02, nz4, null, null, u102, (b30_0)object, n8, n10);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new Yp3(qz1_22, selectedOrderItem, n3);
        }
    }
}

