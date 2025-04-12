/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.provider.Settings$Secure
 */
package com.ril.ajio.data.repo;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.OrderDetailRepo$Companion;
import com.ril.ajio.data.repo.OrderDetailRepo$downloadInvoice$$inlined$map$1;
import com.ril.ajio.data.repo.OrderDetailRepo$downloadInvoice$1;
import com.ril.ajio.data.repo.OrderDetailRepo$getNewOrderDetail$$inlined$map$1;
import com.ril.ajio.data.repo.OrderDetailRepo$getNewOrderDetail$1;
import com.ril.ajio.data.repo.OrderDetailRepo$getOrderDetail$$inlined$map$1;
import com.ril.ajio.data.repo.OrderDetailRepo$getOrderDetail$1;
import com.ril.ajio.data.repo.OrderDetailRepo$getReturnOrderItemDetails$$inlined$map$1;
import com.ril.ajio.data.repo.OrderDetailRepo$getReturnOrderItemDetails$2;
import com.ril.ajio.data.repo.OrderDetailRepo$highReturn$$inlined$map$1;
import com.ril.ajio.data.repo.OrderDetailRepo$highReturn$1;
import com.ril.ajio.data.repo.OrderDetailRepo$invoiceCheck$$inlined$map$1;
import com.ril.ajio.data.repo.OrderDetailRepo$invoiceCheck$1;
import com.ril.ajio.services.data.Order.NudgeInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.OrderDetailApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class OrderDetailRepo
implements BaseRepo {
    public static final int $stable;
    public static final OrderDetailRepo$Companion Companion;
    private static final String clientType;
    private static final String clientVersion;
    private final Ko appSettingsPreferences;
    private final OrderDetailApi orderDetailApi;

    static {
        OrderDetailRepo$Companion orderDetailRepo$Companion;
        Companion = orderDetailRepo$Companion = new OrderDetailRepo$Companion(null);
        $stable = 8;
        clientType = "Android";
        clientVersion = em_1.a(AJIOApplication.Companion);
    }

    public OrderDetailRepo() {
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        Object object = new Ko((Context)aJIOApplication);
        this.appSettingsPreferences = object;
        this.orderDetailApi = object = AjioApiConnector.INSTANCE.getOrderDetailApi();
    }

    public static final /* synthetic */ String access$getClientType$cp() {
        return clientType;
    }

    public static final /* synthetic */ String access$getClientVersion$cp() {
        return clientVersion;
    }

    public static final /* synthetic */ OrderDetailApi access$getOrderDetailApi$p(OrderDetailRepo orderDetailRepo) {
        return orderDetailRepo.orderDetailApi;
    }

    public final es0_2 downloadInvoice(String object, String object2, String string2) {
        Intrinsics.checkNotNullParameter(object, "orderId");
        Intrinsics.checkNotNullParameter(object2, "shipmentCode");
        UrlHelper urlHelper = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[]{object, object2};
        object = urlHelper.getApiUrl("order", "download_invoice", objectArray);
        object2 = new OrderDetailRepo$downloadInvoice$1(this, (String)object, string2, null);
        object = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new OrderDetailRepo$downloadInvoice$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 getNewOrderDetail(String string2, boolean bl2, Boolean bl3, String string3, String string4, boolean bl4) {
        Object object = string2;
        Object object2 = string3;
        Intrinsics.checkNotNullParameter(string2, "orderId");
        Intrinsics.checkNotNullParameter(string3, "userId");
        UrlHelper urlHelper = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[]{string3, string2};
        String string5 = urlHelper.getApiUrl("order", "new_order_details", objectArray);
        object = new OrderDetailRepo$getNewOrderDetail$1(this, string5, string4, bl2, bl3, bl4, null);
        object2 = new br2_2((Function2)object);
        object = new OrderDetailRepo$getNewOrderDetail$$inlined$map$1((es0_2)object2);
        object2 = ir0_2.a;
        return ms0_1.m((es0_2)object, (CoroutineContext)object2);
    }

    public final es0_2 getOrderDetail(String object, String object2, String string2) {
        Intrinsics.checkNotNullParameter(object, "orderId");
        Intrinsics.checkNotNullParameter(object2, "userId");
        UrlHelper urlHelper = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[]{object2, object};
        object = urlHelper.getApiUrl("order", "order_details", objectArray);
        object2 = new OrderDetailRepo$getOrderDetail$1(this, (String)object, string2, null);
        object = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new OrderDetailRepo$getOrderDetail$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final Object getReturnOrderItemDetails(String object, String object2, String string2, String string3, f80_0 object3) {
        object3 = this.appSettingsPreferences.getPreference("ad_id", "");
        UrlHelper urlHelper = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[]{string2, object, object2, object3, object = clientType};
        object = urlHelper.getApiUrl("order", "new_return_order_item", objectArray);
        object2 = new OrderDetailRepo$getReturnOrderItemDetails$2(this, (String)object, string3, null);
        object = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new OrderDetailRepo$getReturnOrderItemDetails$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 highReturn(String string2, String string3, String string4, String string5) {
        Object object = string3;
        Intrinsics.checkNotNullParameter(string3, "userId");
        Object object2 = UrlHelper.Companion.getInstance();
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = string3;
        String string6 = "nudge_information";
        String string7 = ((UrlHelper)object2).getApiUrl("order", string6, objectArray);
        AJIOApplication.Companion.getClass();
        object = AJIOApplication$a.a();
        object = object != null ? object.getContentResolver() : null;
        String string8 = Settings.Secure.getString((ContentResolver)object, (String)"android_id");
        object2 = "";
        Object object3 = string4 == null ? object2 : string4;
        Intrinsics.checkNotNull(string8);
        Object object4 = string5 == null ? object2 : string5;
        object3 = object = new NudgeInformation((String)object3, string8, "ANDROID", "APP", (String)object4);
        object2 = new OrderDetailRepo$highReturn$1(this, string7, string2, (NudgeInformation)object, null);
        object = new br2_2((Function2)object2);
        object2 = new OrderDetailRepo$highReturn$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 invoiceCheck(String object, String object2, String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(object, "orderId");
        Intrinsics.checkNotNullParameter(object2, "consignmentCode");
        Intrinsics.checkNotNullParameter(string2, "invoiceNumber");
        Intrinsics.checkNotNullParameter(string3, "userId");
        UrlHelper urlHelper = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[]{string3, object, object2, string2};
        object = urlHelper.getApiUrl("order", "invoice_check", objectArray);
        object2 = new OrderDetailRepo$invoiceCheck$1(this, (String)object, string4, null);
        object = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new OrderDetailRepo$invoiceCheck$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }
}

