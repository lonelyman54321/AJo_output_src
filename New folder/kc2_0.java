/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from Kc2
 */
public final class kc2_0
implements Function2 {
    public final /* synthetic */ SelectedOrderItem a;
    public final /* synthetic */ CartEntry b;
    public final /* synthetic */ Product c;
    public final /* synthetic */ qz1_2 d;
    public final /* synthetic */ Function0 e;

    public kc2_0(SelectedOrderItem selectedOrderItem, CartEntry cartEntry, Product product, qz1_2 qz1_22, ad2_1 ad2_12) {
        this.a = selectedOrderItem;
        this.b = cartEntry;
        this.c = product;
        this.d = qz1_22;
        this.e = ad2_12;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            object = this.a;
            if (object != null && (object = ((SelectedOrderItem)object).getQuantity()) != null) {
                n4 = (Integer)object;
            } else {
                n4 = 0;
                object = null;
            }
            ref$IntRef.element = n4;
            if (n4 == 0 && (object = this.b) != null && (object = ((CartEntry)object).getQuantity()) != null) {
                ref$IntRef.element = n4 = ((Number)object).intValue();
            }
            Object object4 = LP1$a.b;
            float f5 = 24;
            n4 = 16;
            float f6 = n4;
            int n7 = 8;
            LP1 lP1 = j.c(h.i((LP1)object4, f6, f5, f6, 0.0f, n7), 1.0f);
            Object object5 = object2 = this.e;
            object5 = (ad2_1)object2;
            object4 = this.c;
            CartEntry cartEntry = this.b;
            qz1_2 qz1_22 = this.d;
            SelectedOrderItem selectedOrderItem = this.a;
            object = new jc2_1(ref$IntRef, (Product)object4, cartEntry, qz1_22, selectedOrderItem, (ad2_1)object5);
            n3 = 2016056883;
            u10 u102 = v10.c(n3, (fx0_2)object, (b30_0)object3);
            int n8 = 3072;
            int n10 = 6;
            OA.a(lP1, null, false, u102, (b30_0)object3, n8, n10);
        }
        return Unit.a;
    }
}

