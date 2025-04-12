/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp$AmountData;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class BN2 {
    public static String a(CartEntry object, Integer n3) {
        float f5;
        float f6;
        float f7;
        Intrinsics.checkNotNullParameter(object, "entry");
        Number number = ((CartEntry)object).getBankDiscountPromoAmt();
        if (number != null && (number = ((CartEntry)object).getOrderTotalQuantity()) != null) {
            number = ((CartEntry)object).getBankDiscountPromoAmt();
            double d2 = (Double)number;
            f7 = (float)d2;
            if (n3 != null) {
                int n4 = n3;
                object = ((CartEntry)object).getOrderTotalQuantity();
                String string2 = "getOrderTotalQuantity(...)";
                Intrinsics.checkNotNullExpressionValue(object, string2);
                float f8 = ((Number)object).floatValue();
                f7 /= f8;
                f8 = n4;
                f7 *= f8;
            }
        } else {
            f7 = 0.0f;
            number = null;
        }
        object = (f6 = (f5 = f7 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) > 0 ? qz2_0.q(f7) : "";
        return object;
    }

    public static float b(CartEntry comparable, Integer n3) {
        float f5;
        Object object = cp_1.Companion;
        object.getClass();
        cp$a.k((CartEntry)comparable);
        if (comparable != null) {
            object = ((CartEntry)comparable).getConvenienceFee();
        } else {
            f5 = 0.0f;
            object = null;
        }
        if (object != null && (object = ((CartEntry)comparable).getConvenienceFee().getTotal()) != null && n3 != null) {
            int n4 = n3;
            object = ((CartEntry)comparable).getConvenienceFee().getTotal();
            Intrinsics.checkNotNull(object);
            f5 = ((ConvenienceFeePriceSplitUp$AmountData)object).getNetAmount();
            comparable = ((CartEntry)comparable).getOrderTotalQuantity();
            String string2 = "getOrderTotalQuantity(...)";
            Intrinsics.checkNotNullExpressionValue(comparable, string2);
            float f6 = ((Number)((Object)comparable)).floatValue();
            f5 /= f6;
            f6 = n4;
            f5 *= f6;
        } else {
            f5 = 0.0f;
            object = null;
        }
        return f5;
    }

    public static Float c(CartEntry serializable) {
        float f5;
        Serializable serializable2 = serializable != null ? ((CartEntry)serializable).getConvenienceFee() : null;
        if (serializable2 != null && (serializable2 = ((CartEntry)serializable).getConvenienceFee().getTotal()) != null) {
            serializable = ((CartEntry)serializable).getConvenienceFee().getTotal();
            Intrinsics.checkNotNull(serializable);
            f5 = ((ConvenienceFeePriceSplitUp$AmountData)serializable).getNetAmount();
        } else {
            f5 = 0.0f;
            serializable = null;
        }
        return Float.valueOf(f5);
    }

    public static String d(CartEntry object, Integer n3) {
        float f5;
        Integer n4;
        float f6;
        int n7;
        Object object2;
        Integer n8 = null;
        if (object != null && (object2 = ((CartEntry)object).getTotalPrice()) != null) {
            object2 = ((Price)object2).getValue();
        } else {
            n7 = 0;
            object2 = null;
            f6 = 0.0f;
        }
        String string2 = BN2.f((String)object2);
        if (object != null) {
            n4 = ((CartEntry)object).getOrderTotalQuantity();
        } else {
            n4 = null;
            f5 = 0.0f;
        }
        if (n4 != null) {
            f5 = mz3_0.J((String)object2);
            Object object3 = cp_1.Companion;
            object3.getClass();
            boolean bl2 = cp$a.w();
            if (bl2 || (bl2 = cp$a.v())) {
                object3 = BN2.c((CartEntry)object);
                float f7 = ((Number)object3).floatValue();
                f5 += f7;
            }
            if ((n7 = TextUtils.isEmpty((CharSequence)object2)) == 0) {
                int n10;
                if (object != null) {
                    object2 = ((CartEntry)object).getBankDiscountPromoAmt();
                } else {
                    n7 = 0;
                    object2 = null;
                    f6 = 0.0f;
                }
                if (object2 != null) {
                    if (object != null && (object2 = ((CartEntry)object).getBankDiscountPromoAmt()) != null) {
                        double d2 = (Double)object2;
                        f6 = (float)d2;
                    } else {
                        n7 = 0;
                        f6 = 0.0f;
                        object2 = null;
                    }
                    f5 -= f6;
                }
                if (n3 != null && (n7 = n3.intValue()) == 0) {
                    if (object != null) {
                        n3 = ((CartEntry)object).getQuantity();
                    } else {
                        n10 = 0;
                        n3 = null;
                    }
                }
                if (n3 != null) {
                    n10 = n3;
                    if (object != null) {
                        n8 = ((CartEntry)object).getOrderTotalQuantity();
                    }
                    Intrinsics.checkNotNull(n8);
                    int n14 = n8;
                    float f8 = n14;
                    f5 /= f8;
                    f8 = n10;
                    f5 *= f8;
                }
                object = String.valueOf(f5);
                string2 = BN2.f((String)object);
            }
        }
        return string2;
    }

    public static String e(CartEntry object, Product object2, Integer n3, boolean bl2) {
        int n4;
        Object object3 = "product";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        if (n3 != null) {
            n4 = n3;
        } else {
            n4 = 0;
            n3 = null;
        }
        object2 = ((Product)object2).getWasPriceData();
        object3 = "0";
        if (object2 == null || (object2 = ((Price)object2).getValue()) == null) {
            object2 = object3;
        }
        float f5 = mz3_0.J((String)object2);
        if (object != null && (object = ((CartEntry)object).getBasePrice()) != null && (object = ((Price)object).getValue()) != null) {
            object3 = object;
        }
        float f6 = mz3_0.J((String)object3);
        f5 -= f6;
        f6 = n4;
        f5 *= f6;
        f6 = 0.0f;
        object = null;
        float f7 = f5 - 0.0f;
        Object object4 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        object = object4 > 0 ? (bl2 ? qz2_0.q(f5) : qz2_0.u(f5)) : "";
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String f(String string2) {
        if (string2 == null) return qz2_0.z();
        String string3 = "";
        boolean bl2 = string2.equals(string3);
        boolean bl3 = true;
        if ((bl2 ^= bl3) != bl3) return qz2_0.z();
        float f5 = mz3_0.J(string2);
        return qz2_0.u(f5);
    }

    public static String g(CartEntry object, Product object2, Integer n3) {
        float f5;
        float f6;
        int n4;
        String string2 = "cartEntry";
        Intrinsics.checkNotNullParameter(object, string2);
        object = "product";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        if (n3 != null) {
            n4 = n3;
        } else {
            n4 = 0;
            f6 = 0.0f;
            object = null;
        }
        object2 = ((Product)object2).getWasPriceData();
        if (object2 != null) {
            object2 = ((Price)object2).getValue();
        } else {
            f5 = 0.0f;
            object2 = null;
        }
        f5 = mz3_0.J((String)object2);
        f6 = n4;
        f5 *= f6;
        f6 = 0.0f;
        object = null;
        float f7 = f5 - 0.0f;
        n4 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
        object = n4 > 0 ? qz2_0.u(f5) : "";
        return object;
    }

    public static final String h(CartEntry object) {
        Intrinsics.checkNotNullParameter(object, "entry");
        Object object2 = ((CartEntry)object).getTotalPrice();
        Intrinsics.checkNotNullExpressionValue(object2, "getTotalPrice(...)");
        object2 = ((Price)object2).getValue();
        String string2 = BN2.f((String)object2);
        Integer n3 = ((CartEntry)object).getOrderTotalQuantity();
        if (n3 != null) {
            boolean bl2;
            float f5 = mz3_0.J((String)object2);
            Object object3 = cp_1.Companion;
            object3.getClass();
            boolean bl3 = cp$a.w();
            if (bl3 || (bl3 = cp$a.v())) {
                object3 = BN2.c((CartEntry)object);
                float f6 = ((Number)object3).floatValue();
                f5 += f6;
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)object2))) {
                float f7;
                object2 = ((CartEntry)object).getBankDiscountPromoAmt();
                if (object2 != null) {
                    object2 = ((CartEntry)object).getBankDiscountPromoAmt();
                    double d2 = (Double)object2;
                    f7 = (float)d2;
                    f5 -= f7;
                }
                object2 = ((CartEntry)object).getOrderTotalQuantity();
                Intrinsics.checkNotNullExpressionValue(object2, "getOrderTotalQuantity(...)");
                f7 = ((Number)object2).floatValue();
                object = ((CartEntry)object).getQuantity();
                object2 = "getQuantity(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                float f8 = ((Number)object).floatValue() * (f5 /= f7);
                object = String.valueOf(f8);
                string2 = BN2.f((String)object);
            }
        }
        return string2;
    }
}

