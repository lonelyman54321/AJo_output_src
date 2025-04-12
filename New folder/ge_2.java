/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ge
 */
public final class ge_2 {
    public static final void a(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n4 = 2057341275;
        object = object.g(n4);
        Object object2 = LP1$a.b;
        long l2 = xx_1.x;
        fG2$a fG2$a = fg2_1.a;
        LP1 lP1 = a.b((LP1)object2, l2, fG2$a);
        object2 = new ge$a(qz1_22, selectedOrderItem);
        u10 u102 = v10.c(-1373108795, (fx0_2)object2, (b30_0)object);
        fG2$a = null;
        int n7 = 3078;
        int n8 = 6;
        OA.a(lP1, null, false, u102, (b30_0)object, n7, n8);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new ee_1(qz1_22, selectedOrderItem, n3);
        }
    }
}

