/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.Coupon;
import java.util.Comparator;

public final class kc0$b
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (Coupon)object;
        object2 = (Coupon)object2;
        int n3 = 0;
        int n4 = object != null ? ((Coupon)object).getProductsApplicableCount() : 0;
        if (n4 > 0 && object2 != null && (n4 = ((Coupon)object2).getProductsApplicableCount()) == 0) {
            n3 = -1;
        } else {
            int n7;
            if (object2 != null) {
                n7 = ((Coupon)object2).getProductsApplicableCount();
            } else {
                n7 = 0;
                object2 = null;
            }
            if (n7 > 0) {
                int n8;
                n7 = 1;
                if (object != null && (n8 = ((Coupon)object).getProductsApplicableCount()) == 0) {
                    n8 = 1;
                } else {
                    n8 = 0;
                    object = null;
                }
                if (n8 != 0) {
                    n3 = 1;
                }
            }
        }
        return n3;
    }
}

