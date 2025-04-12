/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class UH2 {
    public static VH2 a(OrderDetailLineItem object) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "orderDetailLineItem");
        VH2 vH2 = new VH2(0);
        Object object2 = ((OrderDetailLineItem)object).getEntry();
        if (object2 != null) {
            Object object3;
            String string2 = ((CartEntry)object2).getNewEntryStatus();
            int n4 = string2.equals(object3 = "CANCELLED");
            if (n4 == 0 && (n4 = (string2 = ((CartEntry)object2).getNewEntryStatus()).equals(object3 = "CANCELLATION_REQUESTED")) == 0) {
                n4 = 0;
                string2 = null;
            } else {
                n4 = 1;
            }
            object3 = ((OrderDetailLineItem)object).getEntry();
            if (object3 != null && (object3 = ((CartEntry)object3).getProduct()) != null) {
                float f5;
                Object object4;
                String string3;
                boolean bl2;
                boolean bl3;
                int n7;
                String string4 = ((Product)object3).getBaseProduct();
                String string5 = "";
                string4 = string4 != null && (n7 = string4.length()) != 0 ? ((Product)object3).getBaseProduct() : ((string4 = ((Product)object3).getCode()) != null && (n7 = string4.length()) != 0 ? ((Product)object3).getCode() : string5);
                vH2.e = string4;
                string4 = ((Product)object3).getName();
                n7 = (int)(TextUtils.isEmpty((CharSequence)string4) ? 1 : 0);
                string4 = n7 != 0 ? string5 : ((Product)object3).getName();
                Object object5 = Y63.a((CartEntry)object2);
                Object[] objectArray = Y63.d((CartEntry)object2);
                String string6 = " ";
                if ((object5 == null || (bl3 = b.k((CharSequence)object5))) && (bl2 = (string3 = "null").equalsIgnoreCase((String)objectArray))) {
                    int n8;
                    object5 = ((CartEntry)object2).getProduct();
                    Y63.g((Product)object5);
                    object2 = hv3_0.i((CartEntry)object2);
                    if (object2 != null && (n8 = b.k((CharSequence)object2)) == 0) {
                        n8 = R$string.od_size_format;
                        objectArray = new Object[n3];
                        objectArray[0] = object2;
                        object2 = hv3_0.L(n8, objectArray);
                    } else {
                        object2 = string5;
                    }
                    n8 = ((OrderDetailLineItem)object).getLineItemQty();
                    if (n8 > n4) {
                        n4 = R$string.od_quantity_format;
                        n8 = ((OrderDetailLineItem)object).getLineItemQty();
                        object5 = hj0_0.a(n8, string6);
                        object4 = new Object[n3];
                        object4[0] = object5;
                        object4 = hv3_0.L(n4, object4);
                        object2 = n1.a((String)object2, string6, (String)object4);
                    }
                    vH2.d = string4;
                } else {
                    vH2.d = object2 = n1.a(string4, " | ", (String)object5);
                    int n10 = ((OrderDetailLineItem)object).getLineItemQty();
                    if (n10 > n4) {
                        n10 = R$string.od_quantity_format;
                        n4 = ((OrderDetailLineItem)object).getLineItemQty();
                        string2 = hj0_0.a(n4, string6);
                        object4 = new Object[n3];
                        object4[0] = string2;
                        object2 = hv3_0.L(n10, object4);
                    } else {
                        object2 = string5;
                    }
                }
                vH2.f = object2;
                object4 = ((Product)object3).getBrandName();
                n3 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
                if (n3 == 0) {
                    string5 = ((Product)object3).getBrandName();
                }
                vH2.c = string5;
                hv3_0.a.getClass();
                vH2.a = object4 = hv3_0.j((Product)object3);
                object = ((OrderDetailLineItem)object).getAmount();
                if (object != null) {
                    f5 = Float.parseFloat((String)object);
                } else {
                    f5 = 0.0f;
                    object = null;
                }
                vH2.b = object = qz2_0.u(f5);
            }
        }
        return vH2;
    }
}

