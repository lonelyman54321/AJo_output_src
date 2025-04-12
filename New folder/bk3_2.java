/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import android.content.pm.PackageInfo;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.util.Utility;
import com.jio.retargeting.data.CartProduct;
import com.jio.retargeting.events.PurchaseCompleteEvent;
import com.jio.retargeting.events.a;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from bK3
 */
public final class bk3_2 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static JSONObject a() {
        int n3;
        int n4;
        Object object = "null cannot be cast to non-null type kotlin.String";
        Object object2 = "advid";
        String string2 = "";
        String string3 = "common_prefs";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ver", (Object)"1.0");
        Object object3 = Utility.INSTANCE;
        Object object4 = Calendar.getInstance().getTime();
        object4 = ((Utility)object3).getTimeStamp((Date)object4);
        jSONObject.put("tms", object4);
        long l2 = ((Utility)object3).generateTransactionId();
        object4 = String.valueOf(l2);
        jSONObject.put("tid", object4);
        jSONObject.put("sdkVer", (Object)"2.1.10");
        jSONObject.put("adIdType", 0);
        object4 = ((Utility)object3).getContext$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Intrinsics.checkNotNull(object4);
        String string4 = "context";
        Intrinsics.checkNotNullParameter(object4, string4);
        Object object5 = null;
        try {
            object4 = j_0.d((Context)object4, string3, 0, string2, (String)object2);
            Intrinsics.checkNotNull(object4, (String)object);
            object4 = (String)object4;
        }
        catch (Exception exception) {
            n4 = 0;
            object4 = null;
        }
        String string5 = "deviceAdId";
        jSONObject.put(string5, object4);
        object4 = ((Utility)object3).getContext$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Intrinsics.checkNotNull(object4);
        Intrinsics.checkNotNullParameter(object4, string4);
        try {
            object2 = j_0.d((Context)object4, string3, 0, string2, (String)object2);
            Intrinsics.checkNotNull(object2, (String)object);
            object5 = object2 = (String)object2;
        }
        catch (Exception exception) {}
        object = "adValue";
        jSONObject.put((String)object, object5);
        try {
            object = ((Utility)object3).getContext$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            Intrinsics.checkNotNull(object);
            object = object.getPackageName();
            object2 = "getPackageName(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object2 = ((Utility)object3).getContext$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            Intrinsics.checkNotNull(object2);
            object2 = object2.getPackageManager();
            object = object2.getPackageInfo((String)object, 0);
            object = ((PackageInfo)object).versionName;
            object2 = "versionName";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object2 = "appSdkVer";
            jSONObject.put((String)object2, object);
        }
        catch (Exception exception) {
            object3 = "Error while getting App Version ";
            object2 = new StringBuilder((String)object3);
            object = exception.getStackTrace();
            ((StringBuilder)object2).append(object);
            object = ((StringBuilder)object2).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
        object = Utility.INSTANCE;
        object2 = ((Utility)object).getContext$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Intrinsics.checkNotNull(object2);
        Intrinsics.checkNotNullParameter(object2, string4);
        object3 = "limit-tracking";
        n4 = 4;
        try {
            object2 = j_0.d((Context)object2, string3, n4, string2, (String)object3);
            string2 = "null cannot be cast to non-null type kotlin.Boolean";
            Intrinsics.checkNotNull(object2, string2);
            object2 = (Boolean)object2;
            n3 = ((Boolean)object2).booleanValue();
        }
        catch (Exception exception) {
            n3 = 0;
            object2 = null;
        }
        string2 = "limitAdTracking";
        if (n3 != 0) {
            n3 = 1;
            jSONObject.put(string2, n3);
        } else {
            jSONObject.put(string2, 0);
        }
        object2 = ((Utility)object).getContext$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Intrinsics.checkNotNull(object2);
        object = ((Utility)object).getBundleName((Context)object2);
        jSONObject.put("appId", object);
        return jSONObject;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static JSONObject b(PurchaseCompleteEvent purchaseCompleteEvent) {
        JSONException jSONException2;
        block5: {
            int n3;
            Object object;
            Object object2;
            String string2;
            String string3;
            block4: {
                string3 = "event";
                Intrinsics.checkNotNullParameter(purchaseCompleteEvent, string3);
                try {
                    string3 = new JSONObject();
                    string2 = "tms";
                    object2 = Utility.INSTANCE;
                    object = purchaseCompleteEvent.getTimestamp();
                    object2 = ((Utility)object2).getTimeStamp((Date)object);
                    string3.put(string2, object2);
                    string2 = "eventId";
                    n3 = 7;
                    string3.put(string2, n3);
                    string2 = "transactionId";
                    object2 = purchaseCompleteEvent.getTransactionId();
                    string3.put(string2, object2);
                    string2 = "clickId";
                    object2 = "";
                    string3.put(string2, object2);
                    string2 = new JSONObject();
                    object2 = purchaseCompleteEvent.getCurrency();
                    if (object2 == null) break block4;
                    object2 = "currency";
                    object = purchaseCompleteEvent.getCurrency();
                    Intrinsics.checkNotNull(object);
                    object = ((Currency)object).getCurrencyCode();
                    string2.put((String)object2, object);
                }
                catch (JSONException jSONException2) {
                    break block5;
                }
            }
            if ((object2 = purchaseCompleteEvent.getCartProductList()) != null && (n3 = (int)(((CopyOnWriteArrayList)(object2 = purchaseCompleteEvent.getCartProductList())).isEmpty() ? 1 : 0)) == 0) {
                int n4;
                object2 = new JSONArray();
                object = purchaseCompleteEvent.getCartProductList();
                object = ((CopyOnWriteArrayList)object).iterator();
                while ((n4 = object.hasNext()) != 0) {
                    Object object3 = object.next();
                    object3 = (CartProduct)object3;
                    JSONObject jSONObject = new JSONObject();
                    String string4 = "id";
                    String string5 = ((CartProduct)object3).getProductId();
                    jSONObject.put(string4, (Object)string5);
                    string4 = "price";
                    int n7 = ((CartProduct)object3).getPrice();
                    jSONObject.put(string4, n7);
                    string4 = "vertical";
                    string5 = ((CartProduct)object3).getVertical();
                    jSONObject.put(string4, (Object)string5);
                    string4 = "segment";
                    string5 = ((CartProduct)object3).getSegment();
                    jSONObject.put(string4, (Object)string5);
                    string4 = "brickname";
                    string5 = ((CartProduct)object3).getBrickname();
                    jSONObject.put(string4, (Object)string5);
                    string4 = "sku";
                    string5 = ((CartProduct)object3).getSkuName();
                    jSONObject.put(string4, (Object)string5);
                    string4 = "quantity";
                    n4 = ((CartProduct)object3).getQuantity();
                    jSONObject.put(string4, n4);
                    object2.put((Object)jSONObject);
                }
                object = "productList";
                string2.put((String)object, object2);
            }
            object2 = "productDetails";
            string3.put((String)object2, (Object)string2);
            bk3_2.c(purchaseCompleteEvent, (JSONObject)string3);
            return string3;
        }
        String string6 = "message";
        Intrinsics.checkNotNullParameter("Error in JSON serialisation", string6);
        Intrinsics.checkNotNullParameter((Object)jSONException2, "throwable");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return null;
    }

    public static void c(a object, JSONObject jSONObject) {
        boolean bl2;
        object = ((a)object).getExtraDataMap().keySet().iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(string2, (Object)jSONObject2);
        }
    }
}

