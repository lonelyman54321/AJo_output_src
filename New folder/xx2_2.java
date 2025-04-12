/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.network.api.OrderDetailApi;
import com.ril.ajio.services.network.api.OrderListApi;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xx2
 */
public final class xx2_2
implements wx2_1 {
    public final OrderDetailApi a;
    public final OrderListApi b;

    public xx2_2(OrderDetailApi orderDetailApi, OrderListApi orderListApi) {
        Intrinsics.checkNotNullParameter(orderDetailApi, "orderDetailsApi");
        Intrinsics.checkNotNullParameter(orderListApi, "orderListApi");
        this.a = orderDetailApi;
        this.b = orderListApi;
    }

    public final Object a(String string2, String string3, String string4, f80_0 f80_02) {
        return this.a.getCancelReasons(string2, string3, "Android", string4, "cancelReasons", f80_02);
    }

    public final Object b(String string2, HashMap hashMap, String string3, String string4, f80_0 f80_02) {
        return this.a.cancelOrderNew(string2, string3, "Android", string4, "cancelOrder", hashMap, f80_02);
    }

    public final Object c(String string2, String string3, String string4, f80_0 f80_02) {
        return this.a.getOrderDetail(string2, string3, "Android", string4, "OrderDetails", f80_02);
    }

    public final Object d(String string2, HashMap hashMap, String string3, String string4, f80_0 f80_02) {
        return this.a.submitFeedback(string2, string3, "Android", string4, "SubmitFeedback", hashMap, f80_02);
    }

    public final Object e(String string2, String string3, String string4, String string5, boolean bl2, f80_0 f80_02) {
        return this.b.getOrderList(string2, string3, "Android", string4, string5, bl2, true, f80_02);
    }

    public final g53_0 f(String string2, String string3, String string4, cr1$c_0 cr1$c_0) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(string3, "authToken");
        String string5 = "Android";
        Intrinsics.checkNotNullParameter(string5, "clientType");
        Intrinsics.checkNotNullParameter(string4, "clientVersion");
        String string6 = "RETURN_UPLOAD_IMAGE";
        Intrinsics.checkNotNullParameter(string6, "RequestID");
        Intrinsics.checkNotNullParameter(cr1$c_0, "image");
        return this.a.uploadReturnImage(string2, string3, string5, string4, string6, cr1$c_0);
    }

    public final Object g(String string2, String string3, String string4, f80_0 f80_02) {
        return this.a.invoiceCheck(string2, string3, "Android", string4, "invoicecheck", f80_02);
    }

    public final Object h(String string2, HashMap hashMap, String string3, String string4, f80_0 f80_02) {
        return this.a.initiateRequestReturnUpdate(string2, string3, "Android", string4, "InitiateReturnRequestUpdate", hashMap, f80_02);
    }

    public final Object i(String string2, HashMap hashMap, String string3, String string4, f80_0 f80_02) {
        return this.a.cancelOrder(string2, string3, "Android", string4, "cancelOrder", hashMap, f80_02);
    }

    public final Object j(String string2, String string3, String string4, f80_0 f80_02) {
        return this.a.getReturnOrderItemDetails(string2, string3, "Android", string4, "ReturnItemOrderDetails", f80_02);
    }

    public final Object k(String string2, String string3, String string4, f80_0 f80_02) {
        return this.b.getOldOrders(string2, string3, "Android", string4, "getOrderList", f80_02);
    }

    public final Object l(String string2, String string3, String string4, boolean bl2, Boolean bl3, boolean bl4, f80_0 f80_02) {
        return this.a.getNewOrderDetail(string2, string3, "Android", string4, "OrderDetails", bl2, bl3, bl4, f80_02);
    }

    public final Object m(String string2, String string3, String string4, cr1$c_0 cr1$c_0, f80_0 f80_02) {
        return this.a.uploadReturnImageWithProgress(string2, string3, "Android", string4, "RETURN_UPLOAD_IMAGE", cr1$c_0, f80_02);
    }
}

