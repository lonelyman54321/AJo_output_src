/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.AJIOApplication;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.OrderListApiRepo$Companion;
import com.ril.ajio.data.repo.OrderListApiRepo$getOldOrders$$inlined$map$1;
import com.ril.ajio.data.repo.OrderListApiRepo$getOldOrders$1;
import com.ril.ajio.data.repo.OrderListApiRepo$getOrderList$$inlined$map$1;
import com.ril.ajio.data.repo.OrderListApiRepo$getOrderList$2;
import com.ril.ajio.data.repo.OrderListApiRepo$getOrderListInBackground$$inlined$map$1;
import com.ril.ajio.data.repo.OrderListApiRepo$getOrderListInBackground$1;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.OrderListApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class OrderListApiRepo
implements BaseRepo {
    public static final int $stable;
    public static final OrderListApiRepo$Companion Companion;
    private static final String clientType;
    private static final String clientVersion;
    private final OrderListApi orderListApi;
    private final UserInformation userInformation;

    static {
        OrderListApiRepo$Companion orderListApiRepo$Companion;
        Companion = orderListApiRepo$Companion = new OrderListApiRepo$Companion(null);
        $stable = 8;
        clientType = "Android";
        clientVersion = em_1.a(AJIOApplication.Companion);
    }

    public OrderListApiRepo() {
        Object object = VX0.a(AJIOApplication.Companion);
        this.userInformation = object;
        this.orderListApi = object = AjioApiConnector.INSTANCE.getOrderListApi();
    }

    public static final /* synthetic */ String access$getClientType$cp() {
        return clientType;
    }

    public static final /* synthetic */ String access$getClientVersion$cp() {
        return clientVersion;
    }

    public static final /* synthetic */ OrderListApi access$getOrderListApi$p(OrderListApiRepo orderListApiRepo) {
        return orderListApiRepo.orderListApi;
    }

    public static final /* synthetic */ UserInformation access$getUserInformation$p(OrderListApiRepo orderListApiRepo) {
        return orderListApiRepo.userInformation;
    }

    public final es0_2 getOldOrders(int n3) {
        Object object = this.userInformation.getUserId();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        UrlHelper urlHelper = UrlHelper.Companion.getInstance();
        Object object2 = n3;
        Object[] objectArray = new Object[]{object, object2};
        ref$ObjectRef.element = object2 = urlHelper.getApiUrl("order", "old_orders_list", objectArray);
        object2 = new OrderListApiRepo$getOldOrders$1(this, ref$ObjectRef, null);
        object = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object2 = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object = new OrderListApiRepo$getOldOrders$$inlined$map$1((es0_2)object2);
        object2 = ir0_2.a;
        return ms0_1.m((es0_2)object, (CoroutineContext)object2);
    }

    /*
     * WARNING - void declaration
     */
    public final es0_2 getOrderList(boolean bl2, int n3, String string2, boolean bl3, boolean bl4) {
        void var5_6;
        void var4_5;
        void var3_4;
        void var2_3;
        String string3 = this.userInformation.getUserId();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object = UrlHelper.Companion.getInstance();
        Object object2 = bl2;
        Object object3 = (int)var2_3;
        int n4 = 3;
        Object object4 = new Object[n4];
        object4[0] = string3;
        int n7 = 1;
        object4[n7] = object2;
        int n8 = 2;
        object4[n8] = object3;
        object3 = "orders_list";
        ref$ObjectRef.element = object2 = ((UrlHelper)object).getApiUrl("order", (String)object3, object4);
        if (var3_4 != null) {
            object3 = "&dateRange=";
            ref$ObjectRef.element = object2 = nb0_0.a((String)object2, (String)object3, (String)var3_4);
        }
        object = object2;
        object4 = this;
        object2 = new OrderListApiRepo$getOrderList$2(this, ref$ObjectRef, (boolean)var4_5, (boolean)var5_6, null);
        object3 = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object2 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
        object3 = new OrderListApiRepo$getOrderList$$inlined$map$1((es0_2)object2);
        object2 = ir0_2.a;
        return ms0_1.m((es0_2)object3, (CoroutineContext)object2);
    }

    public final es0_2 getOrderListInBackground(boolean bl2, int n3) {
        String string2 = this.userInformation.getUserId();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        UrlHelper urlHelper = UrlHelper.Companion.getInstance();
        Object object = bl2;
        Object object2 = n3;
        Object[] objectArray = new Object[]{string2, object, object2};
        ref$ObjectRef.element = object = urlHelper.getApiUrl("order", "orders_list", objectArray);
        object = new OrderListApiRepo$getOrderListInBackground$1(this, ref$ObjectRef, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        object2 = new OrderListApiRepo$getOrderListInBackground$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }
}

