/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.services.data.Payment.BaseRequest;
import com.ril.ajio.services.data.Payment.ChannelInfo;
import com.ril.ajio.services.data.Payment.TenantRequest;
import com.ril.ajio.services.data.Payment.UserInfo;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.ShippingApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.query.QueryDeliveryAddress;
import com.ril.ajio.services.utils.JsonUtils;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class r33
implements BaseRepo {
    public final ShippingApi a;
    public final jo_2 b;
    public final UserInformation c;

    public r33(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        Object object2 = AjioApiConnector.INSTANCE.getShippingApi();
        this.a = object2;
        this.b = object2 = new jo_2((Context)object);
        object = UserInformation.getInstance(object);
        this.c = object;
    }

    public final u53_0 a(String string2, QueryDeliveryAddress queryDeliveryAddress, Boolean bl2, Boolean bl3, Boolean bl4) {
        ChannelInfo channelInfo;
        r33 r332 = this;
        Object object = string2;
        Object object2 = queryDeliveryAddress;
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(queryDeliveryAddress, "queryDeliveryAddress");
        Object object3 = this.b.a();
        queryDeliveryAddress.setAdID((String)object3);
        boolean bl5 = false;
        Object object4 = object3;
        object3 = new BaseRequest(null, null, null, null, null, null, 63, null);
        object4 = new TenantRequest((BaseRequest)object3);
        int n3 = 255;
        Object object5 = channelInfo;
        object2 = channelInfo;
        channelInfo = null;
        ((ChannelInfo)object5)(null, null, null, null, null, null, null, null, n3, null);
        object5 = "ANDROID";
        ((ChannelInfo)object2).setAppType((String)object5);
        ((ChannelInfo)object2).setOsType((String)object5);
        ((ChannelInfo)object2).setNthOrderOnChannel("0");
        ((ChannelInfo)object2).setChannelType("APP");
        int n4 = 15;
        Object[] objectArray = object5;
        object5 = new UserInfo(null, null, null, null, n4, null);
        objectArray = this.c;
        String string3 = objectArray.getUserEmailId();
        CharSequence charSequence = objectArray.getUserName();
        String string4 = objectArray.getCustomerUUID();
        String string5 = objectArray.getUserPhoneNumber();
        ((UserInfo)object5).setEmail(string3);
        ((UserInfo)object5).setUserId(string4);
        ((UserInfo)object5).setProfileName((String)charSequence);
        ((UserInfo)object5).setPhoneNumber(string5);
        ((BaseRequest)object3).setChannelInfo((ChannelInfo)object2);
        ((BaseRequest)object3).setUserInfo((UserInfo)object5);
        object2 = ap_0.c;
        ((BaseRequest)object3).setCartId((String)object2);
        ((BaseRequest)object3).setTenantId("AJIO");
        ((BaseRequest)object3).setConsumerType("STOREFRONT");
        ((BaseRequest)object3).setPageType("String");
        ((TenantRequest)object4).setBaseRequest((BaseRequest)object3);
        object2 = JsonUtils.toJson(object4);
        object3 = yn3_0.a;
        boolean bl6 = false;
        object4 = null;
        object5 = new Object[]{};
        ((yn3$a)object3).a((String)object2, (Object[])object5);
        object3 = new HashMap();
        object5 = "request";
        ((HashMap)object3).put(object5, object2);
        object2 = queryDeliveryAddress.getAddressId();
        boolean bl7 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl7) {
            object2 = "addressId";
            object5 = queryDeliveryAddress.getAddressId();
            ((HashMap)object3).put(object2, object5);
        }
        if (!(bl7 = TextUtils.isEmpty((CharSequence)(object2 = queryDeliveryAddress.getStoreId())))) {
            object2 = "pickupNode";
            object5 = queryDeliveryAddress.getStoreId();
            ((HashMap)object3).put(object2, object5);
        }
        if (!(bl7 = TextUtils.isEmpty((CharSequence)(object2 = queryDeliveryAddress.getAdID())))) {
            object2 = "adId";
            object5 = queryDeliveryAddress.getAdID();
            ((HashMap)object3).put(object2, object5);
        }
        object2 = UrlHelper.Companion.getInstance();
        object5 = new Object[]{};
        charSequence = "cart_checkout";
        object2 = ((UrlHelper)object2).getApiUrl("payment", (String)charSequence, (Object[])object5);
        object5 = new StringBuilder();
        ((StringBuilder)object5).append(object2);
        ((StringBuilder)object5).append("?enableNewVersion=");
        object2 = bl2;
        ((StringBuilder)object5).append(bl2);
        ((StringBuilder)object5).append("&rvpFeeApplicable=");
        object2 = bl3;
        ((StringBuilder)object5).append(bl3);
        ((StringBuilder)object5).append("&codFeeApplicable=");
        object2 = bl4;
        ((StringBuilder)object5).append(bl4);
        object2 = ((StringBuilder)object5).toString();
        object5 = h40_0.a;
        bl5 = h40_0.h1();
        bl6 = StringsKt.F((CharSequence)object2, "?", false);
        string3 = "&priorityDeliveryEnable=";
        if (bl6) {
            bl6 = bl5 ^ true;
            bl5 = h40_0.O1();
            string4 = "&codCheck=";
            charSequence = new StringBuilder(string4);
            ((StringBuilder)charSequence).append(bl6);
            ((StringBuilder)charSequence).append(string3);
            ((StringBuilder)charSequence).append(bl5);
            object4 = ((StringBuilder)charSequence).toString();
        } else {
            bl6 = bl5 ^ true;
            bl5 = h40_0.O1();
            string4 = "?codCheck=";
            charSequence = new StringBuilder(string4);
            ((StringBuilder)charSequence).append(bl6);
            ((StringBuilder)charSequence).append(string3);
            ((StringBuilder)charSequence).append(bl5);
            object4 = ((StringBuilder)charSequence).toString();
        }
        object5 = new StringBuilder();
        ((StringBuilder)object5).append(object2);
        ((StringBuilder)object5).append((String)object4);
        object2 = ww0_2.d(((StringBuilder)object5).toString());
        Intrinsics.checkNotNullExpressionValue(objectArray, "userInformation");
        object4 = ServiceUtil.getToken((UserInformation)objectArray);
        object4 = kp1_0.c("Bearer ", (String)object4);
        object2 = r332.a.checkoutCart((String)object2, (String)object4, (Map)object3, "CartCheckout");
        object3 = qt2_2.c;
        object2 = ((g53_0)object2).h((Scheduler)object3);
        object3 = ti_2.a();
        object2 = ((g53_0)object2).e((Scheduler)object3);
        object3 = new p33((String)object);
        object4 = new q33((p33)object3);
        object3 = new s53_0((q63_0)object2, (bx0_2)object4);
        object2 = new bw(object);
        object = new u53_0((q63_0)object3, (bx0_2)object2);
        Intrinsics.checkNotNullExpressionValue(object, "onErrorReturn(...)");
        return object;
    }
}

