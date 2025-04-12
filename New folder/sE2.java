/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.ratings.ReviewQueryParamters;
import com.ril.ajio.services.data.ratings.SubRatingRequestBody;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.RatingsApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class sE2 {
    public static final UserInformation a = VX0.a(AJIOApplication.Companion);
    public static final RatingsApi b = AjioApiConnector.INSTANCE.getRatingsApi();
    public static final String c = "Android";
    public static final String d = p90.a((Context)AJIOApplication$a.a());
    public static final String e = "ajio_b2c";
    public static final String f = "files";

    public static u53_0 a(String object) {
        Intrinsics.checkNotNullParameter(object, "lastXDaysOrder");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("lastXdaysOrders", (String)object);
        object = VX0.a(AJIOApplication.Companion);
        Object object2 = ((UserInformation)object).getCustomerUUID();
        Object object3 = UrlHelper.Companion.getInstance();
        int n3 = 1;
        Object object4 = new Object[n3];
        object4[0] = object2;
        object4 = ((UrlHelper)object3).getApiUrl("ratings", "unrated_items_v1", object4);
        Intrinsics.checkNotNull(object);
        object2 = ServiceUtil.getToken((UserInformation)object);
        String string2 = kp1_0.c("Bearer ", (String)object2);
        String string3 = c;
        Intrinsics.checkNotNullExpressionValue(string3, "clientType");
        String string4 = ((UserInformation)object).getUserEmailId();
        Intrinsics.checkNotNullExpressionValue(string4, "getUserEmailId(...)");
        String string5 = d;
        object3 = b;
        String string6 = e;
        object = object3.getUnratedProductsHomepage((String)object4, string6, string2, string3, string5, "unratedItemRatingsReviews", linkedHashMap, string4);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new ye1_2(n3);
        object3 = new HS(2, (Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new x12_0(n3);
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public static LinkedHashMap b(ReviewQueryParamters object) {
        String string2;
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        String string3 = ((ReviewQueryParamters)object).getSkuId();
        if (string3 != null) {
            string2 = "skuId";
            linkedHashMap.put(string2, string3);
        }
        if ((string3 = ((ReviewQueryParamters)object).getOptionCode()) != null) {
            string2 = "optionCode";
            linkedHashMap.put(string2, string3);
        }
        object = String.valueOf(((ReviewQueryParamters)object).getReviewText());
        linkedHashMap.put("reviewText", object);
        object = a.getName();
        linkedHashMap.put("name", object);
        return linkedHashMap;
    }

    public static u53_0 c(SubRatingRequestBody object) {
        Intrinsics.checkNotNullParameter(object, "subRatingRequestBody");
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        String string2 = ((UrlHelper)object2).getApiUrl("ratings", "submit_sub_ratings", object3);
        object2 = a;
        Intrinsics.checkNotNullExpressionValue(object2, "userInformation");
        object3 = ServiceUtil.getToken((UserInformation)object2);
        String string3 = kp1_0.c("Bearer ", (String)object3);
        String string4 = ((UserInformation)object2).getUserEmailId();
        Intrinsics.checkNotNullExpressionValue(string4, "getUserEmailId(...)");
        String string5 = d;
        RatingsApi ratingsApi = b;
        String string6 = e;
        String string7 = c;
        object = ratingsApi.submitUserSubRatings(string2, string6, string3, string7, string5, "submitUserRatingsReviews", (SubRatingRequestBody)object, string4);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new ve1_2(1);
        object3 = new P9((Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }
}

