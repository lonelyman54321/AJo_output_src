/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Cart.CartAppliedVoucher;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.ReturnExchangeCtaMessageList;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Product.Product;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from De2$d
 */
public final class de2$d_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ CartOrder e;

    public de2$d_0(qz1_2 qz1_22, boolean bl2, boolean bl3, Ref$ObjectRef ref$ObjectRef, CartOrder cartOrder, f80_0 f80_02) {
        this.a = qz1_22;
        this.b = bl2;
        this.c = bl3;
        this.d = ref$ObjectRef;
        this.e = cartOrder;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$ObjectRef ref$ObjectRef = this.d;
        CartOrder cartOrder = this.e;
        qz1_2 qz1_22 = this.a;
        boolean bl2 = this.b;
        boolean bl3 = this.c;
        object = new de2$d_0(qz1_22, bl2, bl3, ref$ObjectRef, cartOrder, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (de2$d_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((de2$d_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2;
        de2$d_0 de2$d_0 = this;
        Object object3 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object3 = this.a;
        boolean bl2 = ((qz1_2)object3).B0;
        if (!bl2 && (bl2 = ((h40_0)(object2 = h40_0.a)).j2()) && ((bl2 = this.b) || (bl2 = this.c))) {
            object2 = de2$d_0.d;
            Object object4 = ((Ref$ObjectRef)object2).element;
            if (object4 != null) {
                boolean bl3;
                boolean bl4;
                Object object5;
                boolean bl5;
                ((qz1_2)object3).B0 = bl5 = true;
                object4 = new Bundle();
                Object object6 = (SelectedOrderItem)((Ref$ObjectRef)object2).element;
                String string2 = null;
                object6 = object6 != null ? ((SelectedOrderItem)object6).getOrderStatus() : null;
                String string3 = "order_status";
                object4.putString(string3, (String)object6);
                object6 = de2$d_0.e;
                if (object6 != null) {
                    object5 = ((CartOrder)object6).getCode();
                } else {
                    bl4 = false;
                    object5 = null;
                }
                String string4 = "order_id";
                object4.putString(string4, (String)object5);
                object5 = (SelectedOrderItem)((Ref$ObjectRef)object2).element;
                int n3 = 0;
                String string5 = null;
                if (object5 != null && (object5 = ((SelectedOrderItem)object5).getCartEntry()) != null && (object5 = ((CartEntry)object5).getReturnExchangeCtaMessageList()) != null) {
                    bl4 = ((ReturnExchangeCtaMessageList)object5).isExchangeable();
                } else {
                    bl4 = false;
                    object5 = null;
                }
                Object object7 = (SelectedOrderItem)((Ref$ObjectRef)object2).element;
                if (object7 != null && (object7 = ((SelectedOrderItem)object7).getCartEntry()) != null && (object7 = ((CartEntry)object7).getReturnExchangeCtaMessageList()) != null) {
                    bl3 = ((ReturnExchangeCtaMessageList)object7).isReturnable();
                } else {
                    bl3 = false;
                    object7 = null;
                }
                Object object8 = (SelectedOrderItem)((Ref$ObjectRef)object2).element;
                if (object8 != null && (object8 = ((SelectedOrderItem)object8).getCartEntry()) != null) {
                    n3 = ((CartEntry)object8).getReturnWindow();
                }
                object8 = mz3_0.a;
                object5 = ((mz3_0)object8).l(n3, bl3, bl4);
                string5 = "return_window";
                object4.putString(string5, (String)object5);
                object5 = (SelectedOrderItem)((Ref$ObjectRef)object2).element;
                if (object5 != null && (object5 = ((SelectedOrderItem)object5).getCartEntry()) != null && (object5 = ((CartEntry)object5).getProduct()) != null) {
                    object5 = ((Product)object5).getCode();
                } else {
                    bl4 = false;
                    object5 = null;
                }
                string5 = "";
                if (object5 == null) {
                    object5 = string5;
                }
                object7 = "product_id";
                object4.putString((String)object7, (String)object5);
                object5 = AnalyticsManager.Companion;
                object8 = "order item details screen";
                vb0_0.a((AnalyticsManager$Companion)object5, (String)object8, (Bundle)object4);
                if (object6 != null) {
                    object4 = ((CartOrder)object6).getAppliedVouchers();
                } else {
                    bl5 = false;
                    object4 = null;
                }
                object4 = (Collection)object4;
                if (object4 != null && !(bl5 = object4.isEmpty())) {
                    if (object6 != null) {
                        object4 = ((CartOrder)object6).getCode();
                    } else {
                        bl5 = false;
                        object4 = null;
                    }
                    object8 = (SelectedOrderItem)((Ref$ObjectRef)object2).element;
                    object8 = object8 != null ? ((SelectedOrderItem)object8).getOrderStatus() : null;
                    object2 = (SelectedOrderItem)((Ref$ObjectRef)object2).element;
                    if (object2 != null && (object2 = ((SelectedOrderItem)object2).getCartEntry()) != null && (object2 = ((CartEntry)object2).getProduct()) != null) {
                        object2 = ((Product)object2).getCode();
                    } else {
                        bl2 = false;
                        object2 = null;
                    }
                    if (object2 == null) {
                        object2 = string5;
                    }
                    if (object6 != null && (object6 = ((CartOrder)object6).getAppliedVouchers()) != null && (object6 = (CartAppliedVoucher)CollectionsKt.firstOrNull((List)object6)) != null) {
                        string2 = ((CartAppliedVoucher)object6).getVoucherCode();
                    }
                    String string6 = string2 == null ? string5 : string2;
                    object3.getClass();
                    Intrinsics.checkNotNullParameter(object2, "productId");
                    Intrinsics.checkNotNullParameter(string6, "couponName");
                    object6 = new Bundle();
                    object6.putString(string3, (String)object8);
                    object6.putString(string4, (String)object4);
                    object6.putString((String)object7, (String)object2);
                    String string7 = ((AnalyticsManager$Companion)object5).getInstance().getNewCustomEventsRevamp().getORDER_ITEM_DETAILS_INTERACTION_CATEGORY();
                    String string8 = ((AnalyticsManager$Companion)object5).getInstance().getNewCustomEventsRevamp().getORDER_ITEM_DETAILS_INTERACTION_EVENT();
                    object2 = ((qz1_2)object3).N;
                    String string9 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
                    NewCustomEventsRevamp newCustomEventsRevamp = ((qz1_2)object3).M;
                    String string10 = "no return exchange coupon";
                    String string11 = "order item details screen";
                    int n4 = 1632;
                    NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string7, string10, string6, string8, string11, null, null, (Bundle)object6, string9, false, null, n4, null);
                }
            }
        }
        return Unit.a;
    }
}

