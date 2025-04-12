/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.b;

public final class De2$p
implements gx0_2 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ SelectedOrderItem c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ CartOrder e;
    public final /* synthetic */ boolean f;

    public De2$p(Ref$ObjectRef ref$ObjectRef, qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, Ref$ObjectRef ref$ObjectRef2, CartOrder cartOrder, boolean bl2) {
        this.a = ref$ObjectRef;
        this.b = qz1_22;
        this.c = selectedOrderItem;
        this.d = ref$ObjectRef2;
        this.e = cartOrder;
        this.f = bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4;
        boolean bl2;
        float f5;
        Object object5;
        Object object6;
        String string2;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        String string3;
        Object object11;
        Object object12;
        Object object13;
        Object object14;
        Object object15;
        Object object16;
        boolean bl3;
        boolean bl4;
        De2$p de2$p;
        block27: {
            block26: {
                float f6;
                int n3;
                de2$p = this;
                bl4 = false;
                bl3 = true;
                object16 = object;
                object16 = (wr1_2)object;
                object15 = object2;
                object15 = (b30_0)object2;
                object14 = object3;
                object14 = (Number)object3;
                int n4 = ((Number)object14).intValue();
                object13 = "$this$item";
                Intrinsics.checkNotNullParameter(object16, (String)object13);
                int n7 = n4 & 0x51;
                n4 = 16;
                if (n7 == n4 && (n7 = (int)(object15.h() ? 1 : 0)) != 0) {
                    object15.D();
                    return Unit.a;
                }
                object16 = hv3_0.a;
                object14 = de2$p.a;
                object13 = (Product)((Ref$ObjectRef)object14).element;
                object16.getClass();
                object16 = hv3_0.j((Product)object13);
                object13 = (Product)((Ref$ObjectRef)object14).element;
                de2$p.b.getClass();
                boolean bl5 = false;
                float f7 = 0.0f;
                object12 = null;
                if (object13 != null) {
                    object11 = ((Product)object13).getBrandName();
                } else {
                    n3 = 0;
                    object11 = null;
                }
                string3 = "";
                object13 = object11 != null && (n3 = ((String)object11).length()) != 0 ? (object13 != null ? ((Product)object13).getBrandName() : null) : string3;
                object11 = qz1_2.q((Product)((Ref$ObjectRef)object14).element);
                Object object17 = de2$p.c;
                object10 = qz1_2.l((SelectedOrderItem)object17);
                if (object10 != null) {
                    void var26_28;
                    int n8;
                    Y63.g(((CartEntry)object10).getProduct());
                    object9 = hv3_0.i((CartEntry)object10);
                    if (object9 != null && (n8 = kotlin.text.b.k((CharSequence)object9)) == 0) {
                        n8 = R$string.od_size_format;
                        object8 = new Object[bl3];
                        object8[0] = object9;
                        object7 = hv3_0.L(n8, (Object[])object8);
                    } else {
                        n8 = 0;
                        object7 = null;
                        f6 = 0.0f;
                    }
                    object8 = object17 != null ? ((SelectedOrderItem)object17).getQuantity() : null;
                    object10 = ((CartEntry)object10).getProduct();
                    if (object10 != null) {
                        ((Product)object10).setOriginalSize((String)object9);
                    }
                    if (object8 != null) {
                        int n10 = (Integer)object8;
                    } else {
                        boolean bl6 = false;
                        object10 = null;
                    }
                    if (var26_28 > bl3) {
                        int n14 = R$string.od_quantity_format;
                        object9 = String.valueOf(object8);
                        object8 = new Object[bl3];
                        object8[0] = object9;
                        object10 = hv3_0.L(n14, (Object[])object8);
                        object9 = " ";
                        object7 = nb0_0.a((String)object7, (String)object9, (String)object10);
                    }
                    object10 = object7;
                } else {
                    boolean bl7 = false;
                    object10 = null;
                }
                object9 = de2$p.d;
                object7 = (CartEntry)((Ref$ObjectRef)object9).element;
                if (object7 != null && (object8 = ((CartEntry)object7).getTotalPrice()) != null) {
                    object12 = ((Price)object8).getValue();
                }
                if (object12 != null) {
                    f7 = mz3_0.J(((CartEntry)object7).getTotalPrice().getValue());
                    object12 = qz2_0.u(f7);
                } else {
                    object12 = qz2_0.z();
                }
                string2 = object12;
                object12 = (CartEntry)((Ref$ObjectRef)object9).element;
                object7 = (Product)((Ref$ObjectRef)object14).element;
                object8 = null;
                if (object12 != null && object7 != null) {
                    object7 = ((Product)object7).getWasPriceData();
                    object6 = "0";
                    if (object7 == null || (object7 = ((Price)object7).getValue()) == null) {
                        object7 = object6;
                    }
                    f6 = mz3_0.J((String)object7);
                    object5 = ((CartEntry)object12).getBasePrice().getValue();
                    if (object5 != null) {
                        object6 = object5;
                    }
                    float f8 = mz3_0.J((String)object6);
                    f6 -= f8;
                    object6 = ((CartEntry)object12).getQuantity();
                    object5 = "getQuantity(...)";
                    Intrinsics.checkNotNullExpressionValue(object6, (String)object5);
                    f8 = ((Number)object6).floatValue() * f6 + 0.0f;
                    object7 = ((CartEntry)object12).getBankDiscountPromoAmt();
                    if (object7 != null) {
                        object7 = ((CartEntry)object12).getBankDiscountPromoAmt();
                        double d2 = (Double)object7;
                        f6 = (float)d2;
                        f8 += f6;
                    }
                    if ((object7 = ((CartEntry)object12).getVoucherPromoAmt()) != null) {
                        object12 = ((CartEntry)object12).getVoucherPromoAmt();
                        object7 = "getVoucherPromoAmt(...)";
                        Intrinsics.checkNotNullExpressionValue(object12, (String)object7);
                        f7 = Float.parseFloat((String)object12);
                        f8 += f7;
                    }
                    f5 = f8;
                } else {
                    f5 = 0.0f;
                }
                if (object17 != null) {
                    object12 = ((SelectedOrderItem)object17).isExchangeOrder();
                    object17 = Boolean.TRUE;
                    bl2 = bl5 = Intrinsics.areEqual(object12, object17);
                } else {
                    bl2 = false;
                }
                object12 = (CartEntry)((Ref$ObjectRef)object9).element;
                object12 = object12 != null ? no_2.b((CartEntry)object12) : string3;
                object17 = "CANCELLED";
                bl5 = ((String)object17).equalsIgnoreCase((String)object12);
                if (bl5) break block26;
                object12 = (CartEntry)((Ref$ObjectRef)object9).element;
                if (object12 != null) {
                    string3 = no_2.b((CartEntry)object12);
                }
                if (!(bl5 = ((String)(object12 = "CANCELLATION_REQUESTED")).equalsIgnoreCase(string3))) break block27;
            }
            bl4 = true;
        }
        object8 = object4 = ((Ref$ObjectRef)object14).element;
        object8 = (Product)object4;
        object6 = object4 = ((Ref$ObjectRef)object9).element;
        object6 = (CartEntry)object4;
        object4 = de2$p.c;
        int n15 = 584;
        object7 = de2$p.b;
        object5 = de2$p.e;
        bl3 = de2$p.f;
        int n16 = 0x48000000;
        object14 = object16;
        object12 = object11;
        object11 = object10;
        string3 = string2;
        boolean bl8 = bl4;
        de2_0.w((String)object16, (String)object13, (String)object12, (String)object10, string2, f5, bl4, bl2, (qz1_2)object7, (Product)object8, (CartEntry)object6, (CartOrder)object5, (SelectedOrderItem)object4, bl3, (b30_0)object15, n16, n15);
        return Unit.a;
    }
}

