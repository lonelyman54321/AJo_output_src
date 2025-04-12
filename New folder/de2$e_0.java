/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.myaccount.ajiocash.datasource.OrderCancellationRefundConfig;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Order.CancelledRefundDetailInfo;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from De2$E
 */
public final class de2$e_0
extends Lambda
implements hx0_2 {
    public final /* synthetic */ List c;
    public final /* synthetic */ qz1_2 d;
    public final /* synthetic */ SelectedOrderItem e;
    public final /* synthetic */ yT1 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ CartDeliveryAddress j;

    public de2$e_0(List list, qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, yT1 yT12, boolean bl2, boolean bl3, boolean bl4, CartDeliveryAddress cartDeliveryAddress) {
        this.c = list;
        this.d = qz1_22;
        this.e = selectedOrderItem;
        this.f = yT12;
        this.g = bl2;
        this.h = bl3;
        this.i = bl4;
        this.j = cartDeliveryAddress;
        super(4);
    }

    /*
     * WARNING - void declaration
     */
    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        block34: {
            float f5;
            Object object5;
            int n3;
            int n4;
            block36: {
                String string2;
                OrderCancellationRefundConfig orderCancellationRefundConfig;
                Object object6;
                String string3;
                int n7;
                int n8;
                Object object7;
                Object object8;
                de2$e_0 de2$e_0;
                block35: {
                    Object object9;
                    Object object10;
                    boolean bl2;
                    int n10;
                    Object object11;
                    block33: {
                        de2$e_0 = this;
                        n4 = 6;
                        object8 = object;
                        object8 = (wr1_2)object;
                        object11 = object2;
                        object11 = (Number)object2;
                        n3 = ((Number)object11).intValue();
                        object5 = object3;
                        object5 = (b30_0)object3;
                        object7 = object4;
                        object7 = (Number)object4;
                        n8 = ((Number)object7).intValue();
                        n10 = n8 & 6;
                        if (!n10) {
                            n7 = (int)(object5.J(object8) ? 1 : 0);
                            if (n7 != 0) {
                                n7 = 4;
                                f5 = 5.6E-45f;
                            } else {
                                n7 = 2;
                                f5 = 2.8E-45f;
                            }
                            n7 |= n8;
                        } else {
                            n7 = n8;
                        }
                        if ((n8 &= 0x30) == 0) {
                            n8 = (int)(object5.c(n3) ? 1 : 0);
                            n8 = n8 != 0 ? 32 : 16;
                            n7 |= n8;
                        }
                        if ((n7 &= 0x93) != (n8 = 146) || (n7 = (int)(object5.h() ? 1 : 0)) == 0) break block33;
                        object5.D();
                        break block34;
                    }
                    object8 = (SelectedOrderItem)de2$e_0.c.get(n3);
                    n3 = 1590853366;
                    object5.K(n3);
                    if (object8 == null || (object11 = ((SelectedOrderItem)object8).getOrderStatus()) == null) {
                        object11 = "";
                    }
                    object7 = de2$e_0.d;
                    object7.getClass();
                    n10 = (int)(qz1_2.I((SelectedOrderItem)object8) ? 1 : 0);
                    string3 = "CANCELLED";
                    boolean n14 = ((String)object11).equalsIgnoreCase(string3);
                    if ((n14 || (bl2 = ((String)object11).equalsIgnoreCase((String)(object10 = "CANCELLATION_REQUESTED")))) && n10) {
                        object11 = "Exchange Cancelled";
                    }
                    if (object8 != null && (object6 = ((SelectedOrderItem)object8).getQuantity()) != null) {
                        n10 = (Integer)object6;
                    } else {
                        n10 = 0;
                        object6 = null;
                    }
                    object10 = h40_0.a;
                    orderCancellationRefundConfig = h40_0.X();
                    int n15 = -1472692887;
                    object5.K(n15);
                    object10 = ((SelectedOrderItem)object8).getCancelledRefundDetails();
                    if (object10 != null) {
                        object10 = ((CancelledRefundDetailInfo)object10).getCancellationType();
                    } else {
                        boolean bl3 = false;
                        object10 = null;
                    }
                    String string4 = "BUSINESS_CANCELLATION";
                    boolean bl4 = Intrinsics.areEqual(object10, string4);
                    int n16 = 8;
                    if (bl4) {
                        void var17_24;
                        if (orderCancellationRefundConfig != null) {
                            object10 = orderCancellationRefundConfig.getEnable();
                            object9 = Boolean.TRUE;
                            boolean bl5 = Intrinsics.areEqual(object10, object9);
                        } else {
                            boolean bl6 = false;
                            object10 = null;
                        }
                        if (var17_24 != false) {
                            de2_0.I(orderCancellationRefundConfig, (b30_0)object5, n16);
                        }
                    }
                    object5.E();
                    object10 = new De2$t((qz1_2)object7, (String)object11);
                    Object object12 = v10.c(1360874175, (fx0_2)object10, (b30_0)object5);
                    object10 = new De2$u(n10, (qz1_2)object7, (SelectedOrderItem)object8, (String)object11);
                    u10 u102 = v10.c(608431056, (fx0_2)object10, (b30_0)object5);
                    int n17 = de2$e_0.g;
                    Object object13 = de2$e_0.f;
                    object10 = new De2$v((qz1_2)object7, (yT1)object13, (SelectedOrderItem)object8, n17 != 0);
                    u10 u103 = v10.c(1340606511, (fx0_2)object10, (b30_0)object5);
                    object10 = new De2$w((qz1_2)object7, (yT1)object13, (SelectedOrderItem)object8);
                    n17 = 2072781966;
                    u10 u104 = v10.c(n17, (fx0_2)object10, (b30_0)object5);
                    object10 = new De2$x(n10, (qz1_2)object7, (SelectedOrderItem)object8, (String)object11);
                    u10 u105 = v10.c(-1490009875, (fx0_2)object10, (b30_0)object5);
                    object9 = de2$e_0.d;
                    object10 = de2$e_0.j;
                    n10 = (int)(de2$e_0.h ? 1 : 0);
                    n8 = (int)(de2$e_0.i ? 1 : 0);
                    object11 = object13;
                    int n18 = n8;
                    object7 = object8;
                    int n19 = n8;
                    object13 = object10;
                    ((De2$y)object11)((SelectedOrderItem)object8, n10 != 0, n8 != 0, (qz1_2)object9, (CartDeliveryAddress)object10);
                    object11 = v10.c(-757834420, (fx0_2)object11, (b30_0)object5);
                    n18 = 224694;
                    object7 = object12;
                    object6 = u102;
                    object10 = u103;
                    object9 = u104;
                    object13 = u105;
                    object12 = object11;
                    n3 = 8;
                    string2 = string4;
                    vb2.e((u10)object7, u102, u103, u104, u105, (u10)object11, (b30_0)object5, n18);
                    n8 = -1472603801;
                    object5.K(n8);
                    object7 = ((SelectedOrderItem)object8).getCancelledRefundDetails();
                    if (object7 != null) {
                        object7 = ((CancelledRefundDetailInfo)object7).getCancellationType();
                    } else {
                        n8 = 0;
                        object7 = null;
                    }
                    object6 = "USER_CANCELLATION";
                    n8 = (int)(Intrinsics.areEqual(object7, object6) ? 1 : 0);
                    if (n8 != 0) break block35;
                    object7 = ((SelectedOrderItem)object8).getCancelledRefundDetails();
                    if (object7 != null) {
                        object7 = ((CancelledRefundDetailInfo)object7).getCancellationType();
                    } else {
                        n8 = 0;
                        object7 = null;
                    }
                    n8 = (int)(Intrinsics.areEqual(object7, string2) ? 1 : 0);
                    if (n8 == 0) break block36;
                }
                if (orderCancellationRefundConfig != null) {
                    object7 = orderCancellationRefundConfig.getEnable();
                    object6 = Boolean.TRUE;
                    n8 = (int)(Intrinsics.areEqual(object7, object6) ? 1 : 0);
                } else {
                    n8 = 0;
                    object7 = null;
                }
                if (n8 != 0) {
                    boolean bl7;
                    if ((object8 = ((SelectedOrderItem)object8).getCancelledRefundDetails()) != null) {
                        object8 = ((CancelledRefundDetailInfo)object8).getRefundDetailsObj();
                    } else {
                        n7 = 0;
                        object8 = null;
                        f5 = 0.0f;
                    }
                    if (object8 == null) {
                        bl7 = true;
                    } else {
                        bl7 = false;
                        string2 = null;
                    }
                    if (bl7) {
                        object8 = "toLowerCase(...)";
                        object7 = de2$e_0.e;
                        if (object7 != null && (object7 = ((SelectedOrderItem)object7).getOrderStatus()) != null) {
                            object6 = Locale.ROOT;
                            object7 = ((String)object7).toLowerCase((Locale)object6);
                            Intrinsics.checkNotNullExpressionValue(object7, (String)object8);
                        } else {
                            n8 = 0;
                            object7 = null;
                        }
                        object6 = Locale.ROOT;
                        object6 = string3.toLowerCase((Locale)object6);
                        Intrinsics.checkNotNullExpressionValue(object6, (String)object8);
                        n7 = (int)(Intrinsics.areEqual(object7, object6) ? 1 : 0);
                        if (n7 != 0) {
                            de2_0.M(orderCancellationRefundConfig, (b30_0)object5, n3);
                        }
                    }
                }
            }
            object5.E();
            f5 = n3;
            vb2.h(f5, (b30_0)object5, n4);
            object5.E();
        }
        return Unit.a;
    }
}

