/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.MetricsLogging;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.FleekVideoConfigValue;
import com.ril.ajio.login.RemovalLoginPasswordConfig;
import com.ril.ajio.myaccount.ajiocash.RetireRcsWalletConfig;
import com.ril.ajio.myaccount.ajiocash.datasource.AjioWalletToBankTransferConfig;
import com.ril.ajio.myaccount.ajiocash.datasource.OrderCancellationRefundConfig;
import com.ril.ajio.myaccount.order.data.PriorityDeliveryConfig;
import com.ril.ajio.myaccount.order.data.PriorityDeliveryRefundTrackerData;
import com.ril.ajio.pdp.data.VideoConfig;
import com.ril.ajio.pdprefresh.data.AjiogramInterventions;
import com.ril.ajio.permission.PermissionData;
import com.ril.ajio.permission.PermissionTrigger;
import com.ril.ajio.rto.entity.RtoFirebaseData;
import com.ril.ajio.services.data.Cart.GWPConfigJson;
import com.ril.ajio.services.data.Cart.PanEncryptionItem;
import com.ril.ajio.services.data.CustomerCare.ReturnFlowConfig;
import com.ril.ajio.services.data.Product.ComingSoonConfig;
import com.ril.ajio.services.data.fleek.FleekSesConfigs;
import com.ril.ajio.services.data.prioritydelivery.PdpCartDelivery;
import com.ril.ajio.services.data.prioritydelivery.PlpDelivery;
import com.ril.ajio.services.data.prioritydelivery.PlpFilters;
import com.ril.ajio.services.data.prioritydelivery.PlpListing;
import com.ril.ajio.services.data.prioritydelivery.PriorityDeliveryP2Config;
import com.ril.ajio.services.data.returnexchange.ReturnProcessingFeeConfig;
import com.ril.ajio.services.data.returnexchange.ReturnProcessingFeePostOrdeerConfig;
import com.ril.ajio.services.entity.BannerAdsConfig;
import com.ril.ajio.services.entity.ThirdPartyBannerConfig;
import com.ril.ajio.services.utils.JsonUtils;
import com.ril.ajio.videoPlayer.model.FleekConfigs;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/*
 * Renamed from H40
 */
public final class h40_0
implements jn_0 {
    public static final h40_0 a;
    public static PriorityDeliveryP2Config b;
    public static GWPConfigJson c;
    public static JSONObject d;
    public static ReturnFlowConfig e;
    public static BannerAdsConfig f;
    public static BannerAdsConfig g;
    public static BannerAdsConfig h;
    public static BannerAdsConfig i;
    public static BannerAdsConfig j;
    public static final hh3_2 k;
    public static final hh3_2 l;

    static {
        Object object = new Object();
        a = object;
        object = new Object();
        k = yr1_2.b((Function0)object);
        object = new g40_0(0);
        l = yr1_2.b((Function0)object);
    }

    public static boolean A() {
        boolean bl2;
        String string2 = "enableAutoDismiss";
        Intrinsics.checkNotNullParameter(string2, "key");
        JSONObject jSONObject = h40_0.z();
        boolean bl3 = jSONObject.has(string2);
        if (bl3) {
            bl2 = jSONObject.getBoolean(string2);
        } else {
            bl2 = false;
            jSONObject = null;
        }
        return bl2;
    }

    public static String A0() {
        return (String)k.getValue();
    }

    public static boolean A1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("enable_pdp_both_offer");
    }

    public static JSONObject B() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("AjioFraudReductionForEmployeeCoupons");
    }

    public static boolean B0() {
        boolean bl2;
        RetireRcsWalletConfig retireRcsWalletConfig = h40_0.r0();
        if (retireRcsWalletConfig != null) {
            bl2 = retireRcsWalletConfig.isEnabled();
        } else {
            bl2 = false;
            retireRcsWalletConfig = null;
        }
        return bl2;
    }

    public static boolean B1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("enable_pdp_prepaid_offer");
    }

    public static int C() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.g("free_shipping_amount_limit_pdp");
    }

    public static JSONObject C0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("sizeRecommendationConfig");
    }

    public static boolean C1() {
        String string2;
        boolean bl2;
        Object object = h40_0.L0();
        int n3 = ((String)object).length();
        boolean bl3 = false;
        if (n3 == 0) {
            return false;
        }
        object = JsonParser.parseString(h40_0.L0()).getAsJsonObject();
        if (object != null && (bl2 = ((JsonObject)object).has(string2 = "enableSellingFastTagPDP"))) {
            object = ((JsonObject)object).get(string2);
            bl3 = ((JsonElement)object).getAsBoolean();
        }
        return bl3;
    }

    public static GWPConfigJson D(boolean bl2) {
        Class<GWPConfigJson> clazz;
        Object object;
        Object object2;
        if (bl2 || (object2 = c) == null) {
            object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.b("gwp_config");
            object = new GsonBuilder();
            object = ((GsonBuilder)object).create();
            clazz = GWPConfigJson.class;
            c = object2 = (GWPConfigJson)((Gson)object).fromJson((String)object2, clazz);
        }
        if ((object2 = c) == null) {
            object = object2;
            clazz = null;
            int n3 = -1 >>> 2;
            object2 = new GWPConfigJson(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n3, null);
        }
        return object2;
    }

    public static JSONObject D0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("fleek_splash_onboarding_config");
    }

    public static boolean D1() {
        String string2;
        boolean bl2;
        Object object = h40_0.L0();
        int n3 = ((String)object).length();
        boolean bl3 = false;
        if (n3 == 0) {
            return false;
        }
        object = JsonParser.parseString(h40_0.L0()).getAsJsonObject();
        if (object != null && (bl2 = ((JsonObject)object).has(string2 = "enableWishlistTagPDP"))) {
            object = ((JsonObject)object).get(string2);
            bl3 = ((JsonElement)object).getAsBoolean();
        }
        return bl3;
    }

    public static PermissionData E() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.d("in_app_notification_config").toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        GsonBuilder gsonBuilder = new GsonBuilder();
        object = gsonBuilder.create().fromJson((String)object, PermissionData.class);
        Intrinsics.checkNotNullExpressionValue(object, "fromJson(...)");
        return (PermissionData)object;
    }

    public static String E0(String string2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        JSONObject jSONObject = h40_0.D0();
        boolean bl2 = jSONObject.has(string2);
        if (bl2) {
            string2 = jSONObject.getString(string2);
            Intrinsics.checkNotNull(string2);
        } else {
            string2 = "";
        }
        return string2;
    }

    public static boolean E1() {
        String string2;
        JSONObject jSONObject = h40_0.m0();
        boolean bl2 = jSONObject.has(string2 = "ratingCollectionOnPDPEnabled");
        if (bl2 && (bl2 = (jSONObject = h40_0.m0()).getBoolean(string2))) {
            bl2 = true;
        } else {
            bl2 = false;
            jSONObject = null;
        }
        return bl2;
    }

    public static JSONObject F() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("incentivize_customer_exchange");
    }

    public static String F0(String string2) {
        Intrinsics.checkNotNullParameter(string2, "storeType");
        Object object = h40_0.h();
        boolean bl2 = object.has(string2);
        String string3 = null;
        if (bl2) {
            string2 = object.getJSONObject(string2);
            object = "buttonTitle";
            if ((string2 = string2.get((String)object).toString()) != null) {
                string3 = string2;
            }
        }
        return string3;
    }

    public static boolean F1() {
        String string2;
        JSONObject jSONObject;
        boolean bl2 = h40_0.l2();
        if (bl2 && (bl2 = (jSONObject = h40_0.m0()).has(string2 = "reviewCollectionOnPDPEnabled")) && (bl2 = (jSONObject = h40_0.m0()).getBoolean(string2))) {
            bl2 = true;
        } else {
            bl2 = false;
            jSONObject = null;
        }
        return bl2;
    }

    public static String G0(String string2) {
        Intrinsics.checkNotNullParameter(string2, "storeType");
        Object object = h40_0.h();
        boolean bl2 = object.has(string2);
        String string3 = null;
        if (bl2) {
            string2 = object.getJSONObject(string2);
            object = "subtitle";
            if ((string2 = string2.get((String)object).toString()) != null) {
                string3 = string2;
            }
        }
        return string3;
    }

    public static boolean G1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("is_plp_extended_banner_enabled");
    }

    public static BannerAdsConfig H(boolean bl2) {
        Class<BannerAdsConfig> clazz;
        Object object;
        Object object2;
        if (bl2 || (object2 = h) == null) {
            object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.b("bannerAdConfigForCart");
            object = new GsonBuilder();
            object = ((GsonBuilder)object).create();
            clazz = BannerAdsConfig.class;
            h = object2 = (BannerAdsConfig)((Gson)object).fromJson((String)object2, clazz);
        }
        if ((object2 = h) == null) {
            clazz = null;
            int n3 = 8191;
            object = object2;
            object2 = new BannerAdsConfig(null, null, null, null, null, null, false, false, null, false, null, null, null, n3, null);
        }
        return object2;
    }

    public static String H0(String string2) {
        Intrinsics.checkNotNullParameter(string2, "storeType");
        Object object = h40_0.h();
        boolean bl2 = object.has(string2);
        String string3 = null;
        if (bl2) {
            string2 = object.getJSONObject(string2);
            object = "title";
            if ((string2 = string2.get((String)object).toString()) != null) {
                string3 = string2;
            }
        }
        return string3;
    }

    public static boolean H1() {
        String string2;
        boolean bl2;
        Object object = h40_0.L0();
        int n3 = ((String)object).length();
        boolean bl3 = false;
        if (n3 == 0) {
            return false;
        }
        object = JsonParser.parseString(h40_0.L0()).getAsJsonObject();
        if (object != null && (bl2 = ((JsonObject)object).has(string2 = "enableSellingFastTagPLP"))) {
            object = ((JsonObject)object).get(string2);
            bl3 = ((JsonElement)object).getAsBoolean();
        }
        return bl3;
    }

    public static JSONObject I() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("jioBannerAdsConfigForHomePage");
    }

    public static String I0(String string2) {
        Object object = "storeId";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        int n3 = string2.length();
        String string3 = "";
        if (n3 != 0) {
            object = ld3_2.values();
            int n4 = ((ld3_2[])object).length;
            for (int i3 = 0; i3 < n4; ++i3) {
                String string4 = object[i3].getStoreId();
                boolean bl2 = Intrinsics.areEqual(string4, string2);
                if (!bl2) continue;
                object = Locale.ROOT;
                string2 = string2.toLowerCase((Locale)object);
                Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
                string2 = h40_0.j(string2);
                object = "store_icon";
                n4 = (int)(string2.has((String)object) ? 1 : 0);
                if (n4 != 0) {
                    string3 = string2.getString((String)object);
                    Intrinsics.checkNotNull(string3);
                }
                return string3;
            }
        }
        return string3;
    }

    public static boolean I1() {
        String string2;
        boolean bl2;
        Object object = h40_0.L0();
        int n3 = ((String)object).length();
        boolean bl3 = false;
        if (n3 == 0) {
            return false;
        }
        object = JsonParser.parseString(h40_0.L0()).getAsJsonObject();
        if (object != null && (bl2 = ((JsonObject)object).has(string2 = "enableWishlistTagPLP"))) {
            object = ((JsonObject)object).get(string2);
            bl3 = ((JsonElement)object).getAsBoolean();
        }
        return bl3;
    }

    public static BannerAdsConfig J(boolean bl2) {
        Class<BannerAdsConfig> clazz;
        Object object;
        Object object2;
        if (bl2 || (object2 = f) == null) {
            object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.b("bannerAdConfigForMyAccount");
            object = new GsonBuilder();
            object = ((GsonBuilder)object).create();
            clazz = BannerAdsConfig.class;
            f = object2 = (BannerAdsConfig)((Gson)object).fromJson((String)object2, clazz);
        }
        if ((object2 = f) == null) {
            clazz = null;
            int n3 = 8191;
            object = object2;
            object2 = new BannerAdsConfig(null, null, null, null, null, null, false, false, null, false, null, null, null, n3, null);
        }
        return object2;
    }

    public static ThirdPartyBannerConfig J0() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.d("third_party_banner_config").toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        Object object2 = new GsonBuilder();
        object2 = ((GsonBuilder)object2).create();
        int n3 = ((String)object).length();
        if (n3 == 0) {
            int n4 = 7;
            object = new ThirdPartyBannerConfig(null, null, 0.0f, n4, null);
        } else {
            Class<ThirdPartyBannerConfig> clazz = ThirdPartyBannerConfig.class;
            object = ((Gson)object2).fromJson((String)object, clazz);
            Intrinsics.checkNotNull(object);
            object = (ThirdPartyBannerConfig)object;
        }
        return object;
    }

    public static boolean J1() {
        boolean bl2;
        Object object = h40_0.b0();
        if (object != null && (object = ((PanEncryptionItem)object).isPanEnabled()) != null) {
            bl2 = (Boolean)object;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static BannerAdsConfig K(boolean bl2) {
        Class<BannerAdsConfig> clazz;
        Object object;
        Object object2;
        if (bl2 || (object2 = i) == null) {
            object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.b("bannerAdConfigForOrderListing");
            object = new GsonBuilder();
            object = ((GsonBuilder)object).create();
            clazz = BannerAdsConfig.class;
            i = object2 = (BannerAdsConfig)((Gson)object).fromJson((String)object2, clazz);
        }
        if ((object2 = i) == null) {
            clazz = null;
            int n3 = 8191;
            object = object2;
            object2 = new BannerAdsConfig(null, null, null, null, null, null, false, false, null, false, null, null, null, n3, null);
        }
        return object2;
    }

    public static JSONObject K0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("TD_Value_And_Percentage_Limit_PDP");
    }

    public static boolean K1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("personalisedUserRelevancy");
    }

    public static BannerAdsConfig L(boolean bl2) {
        Class<BannerAdsConfig> clazz;
        Object object;
        Object object2;
        if (bl2 || (object2 = g) == null) {
            object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.b("bannerAdConfigForPdp");
            object = new GsonBuilder();
            object = ((GsonBuilder)object).create();
            clazz = BannerAdsConfig.class;
            g = object2 = (BannerAdsConfig)((Gson)object).fromJson((String)object2, clazz);
        }
        if ((object2 = g) == null) {
            clazz = null;
            int n3 = 8191;
            object = object2;
            object2 = new BannerAdsConfig(null, null, null, null, null, null, false, false, null, false, null, null, null, n3, null);
        }
        return object2;
    }

    public static String L0() {
        return (String)l.getValue();
    }

    public static boolean L1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("android_plp_offer");
    }

    public static boolean M0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("enable_affise_debug_logs");
    }

    public static boolean M1() {
        String string2;
        Object object = h40_0.h0();
        boolean bl2 = object.optBoolean(string2 = "isEnabled");
        if (bl2 && (bl2 = ((String)(object = od3_2.a())).equals(string2 = ld3_2.STORE_AJIO.getStoreId()))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static boolean N0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("affise_enabled");
    }

    public static boolean N1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("post_notifications_permission_enable");
    }

    public static boolean O0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("AjioCashWalletToBankTransferEnabled");
    }

    public static boolean O1() {
        return h40_0.j0().isEnabled();
    }

    public static BannerAdsConfig P(boolean bl2) {
        Class<BannerAdsConfig> clazz;
        Object object;
        Object object2;
        if (bl2 || (object2 = j) == null) {
            object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.b("bannerAdConfigForThankyou");
            object = new GsonBuilder();
            object = ((GsonBuilder)object).create();
            clazz = BannerAdsConfig.class;
            j = object2 = (BannerAdsConfig)((Gson)object).fromJson((String)object2, clazz);
        }
        if ((object2 = j) == null) {
            clazz = null;
            int n3 = 8191;
            object = object2;
            object2 = new BannerAdsConfig(null, null, null, null, null, null, false, false, null, false, null, null, null, n3, null);
        }
        return object2;
    }

    public static boolean P0(boolean bl2) {
        boolean bl3 = h40_0.M1();
        boolean bl4 = false;
        if (!bl3 && !bl2) {
            Object object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            String string2 = "is_applied_filters_at_top_of_plp_page_enabled";
            bl2 = ((ao0_0)object).a(string2);
            if (bl2) {
                bl4 = true;
            }
        }
        return bl4;
    }

    public static final boolean P1() {
        Object object = h40_0.j0();
        boolean bl2 = ((PriorityDeliveryConfig)object).isEnabled();
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            if ((object = ((PriorityDeliveryConfig)object).getPostOrder()) != null) {
                bl4 = ((PriorityDeliveryRefundTrackerData)object).isEnabledPostOrder();
            } else {
                bl4 = false;
                object = null;
            }
            if (bl4) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public static JSONObject Q(boolean bl2) {
        Object object;
        if (bl2 || (object = d) == null) {
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            String string2 = "jio_cdn";
            object = ((cw)object).d(string2);
            d = object;
        }
        if ((object = d) == null) {
            object = new JSONObject();
        }
        return object;
    }

    public static boolean Q0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("appsflyer_luxe_enabled");
    }

    public static final boolean Q1() {
        boolean bl2 = false;
        PriorityDeliveryP2Config priorityDeliveryP2Config = h40_0.k0(false);
        if (priorityDeliveryP2Config != null) {
            bl2 = priorityDeliveryP2Config.isEnabled();
        }
        return bl2;
    }

    public static RemovalLoginPasswordConfig R() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("removal_login_password_json");
        Gson gson = new Gson();
        object = gson.fromJson((String)object, RemovalLoginPasswordConfig.class);
        Intrinsics.checkNotNullExpressionValue(object, "fromJson(...)");
        return (RemovalLoginPasswordConfig)object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean R0(xv$a_0 object) {
        Intrinsics.checkNotNullParameter(object, "screenType");
        int[] nArray = H40$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        boolean bl2 = false;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            object = f;
                            if (object == null) return bl2;
                            if ((object = ((BannerAdsConfig)object).getBannerAdsClickEnabled()) == null) return bl2;
                            return (Boolean)object;
                        }
                        object = new NoWhenBranchMatchedException();
                        throw object;
                    }
                    object = j;
                    if (object == null) return bl2;
                    if ((object = ((BannerAdsConfig)object).getBannerAdsClickEnabled()) == null) return bl2;
                    return (Boolean)object;
                }
                object = i;
                if (object == null) return bl2;
                if ((object = ((BannerAdsConfig)object).getBannerAdsClickEnabled()) == null) return bl2;
                return (Boolean)object;
            }
            object = h;
            if (object == null) return bl2;
            if ((object = ((BannerAdsConfig)object).getBannerAdsClickEnabled()) == null) return bl2;
            return (Boolean)object;
        }
        object = g;
        if (object == null) return bl2;
        if ((object = ((BannerAdsConfig)object).getBannerAdsClickEnabled()) == null) return bl2;
        return (Boolean)object;
    }

    public static boolean R1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("RVPMasterFlag");
    }

    public static MetricsLogging S() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.d("metrics_logging");
        Object object2 = new GsonBuilder();
        object2 = ((GsonBuilder)object2).create();
        object = object.toString();
        return (MetricsLogging)((Gson)object2).fromJson((String)object, MetricsLogging.class);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean S0(xv$a_0 object) {
        Intrinsics.checkNotNullParameter(object, "screenType");
        int[] nArray = H40$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        boolean bl2 = false;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            object = f;
                            if (object == null) return bl2;
                            if ((object = ((BannerAdsConfig)object).getBannerAdsEnabled()) == null) return bl2;
                            return (Boolean)object;
                        }
                        object = new NoWhenBranchMatchedException();
                        throw object;
                    }
                    object = j;
                    if (object == null) return bl2;
                    if ((object = ((BannerAdsConfig)object).getBannerAdsEnabled()) == null) return bl2;
                    return (Boolean)object;
                }
                object = i;
                if (object == null) return bl2;
                if ((object = ((BannerAdsConfig)object).getBannerAdsEnabled()) == null) return bl2;
                return (Boolean)object;
            }
            object = h;
            if (object == null) return bl2;
            if ((object = ((BannerAdsConfig)object).getBannerAdsEnabled()) == null) return bl2;
            return (Boolean)object;
        }
        object = g;
        if (object == null) return bl2;
        if ((object = ((BannerAdsConfig)object).getBannerAdsEnabled()) == null) return bl2;
        return (Boolean)object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean S1() {
        boolean bl2 = h40_0.Y1();
        if (!bl2) return false;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "ABAjioHomePageRating";
        bl2 = ((ao0_0)object).a(string2);
        if (!bl2) return false;
        return true;
    }

    public static String T() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = z40$a.a((Context)AJIOApplication$a.a()).a.b("keyToPickForSideNavigationBannerForAjio");
        return ((ao0_0)object).b(string2);
    }

    public static boolean T0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("enable_cart_ratings");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean T1() {
        boolean bl2 = h40_0.Y1();
        if (!bl2) return false;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "ABAjioPLPRating";
        bl2 = ((ao0_0)object).a(string2);
        if (!bl2) return false;
        bl2 = og1_1.c();
        if (bl2) return false;
        return true;
    }

    public static String U() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = z40$a.a((Context)AJIOApplication$a.a()).a.b("keyToPickForSideNavigationBannerForLuxe");
        return ((ao0_0)object).b(string2);
    }

    public static boolean U0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("enable_chat_post_order");
    }

    public static String U1() {
        Object object = h40_0.l0();
        String string2 = "rating_colour";
        boolean bl2 = object.has(string2);
        String string3 = "#000000";
        if (bl2) {
            object = object.optString(string2, string3);
            Intrinsics.checkNotNull(object);
            int n3 = ((String)object).length();
            if (n3 > 0) {
                string2 = null;
                String string4 = "#";
                n3 = (int)(StringsKt.F((CharSequence)object, string4, false) ? 1 : 0);
                if (n3 != 0) {
                    return object;
                }
            }
        }
        return string3;
    }

    public static String V() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.b("howToMeasureSizeGuide");
    }

    public static boolean V0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("enable_link_cohort");
    }

    public static boolean V1() {
        boolean bl2;
        Object object = h40_0.l0();
        String string2 = "master_flag";
        boolean bl3 = object.has(string2);
        boolean bl4 = false;
        if (bl3 && (bl2 = object.getBoolean(string2)) && (bl2 = Intrinsics.areEqual(object = od3_2.a(), string2 = ld3_2.STORE_AJIO.getStoreId()))) {
            bl4 = true;
        }
        return bl4;
    }

    public static ArrayList W() {
        Object object;
        Object object2 = h40_0.D0();
        boolean bl2 = object2.has((String)(object = "onboarding_image_array"));
        if (bl2) {
            boolean bl3;
            object2 = object2.getJSONObject((String)object);
            object = new HashMap();
            Object object3 = object2.keys();
            String string2 = "keys(...)";
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            while (bl3 = object3.hasNext()) {
                Object object4;
                int n3;
                string2 = (String)object3.next();
                Object object5 = object2.get(string2);
                if (object5 == null || (n3 = ((String)(object4 = object5.toString())).length()) <= 0) continue;
                cp_1.Companion.getClass();
                object4 = cp$a.e();
                String string3 = object5.toString();
                object4.getClass();
                Intrinsics.checkNotNullParameter(string3, "input");
                object4 = StringsKt.toIntOrNull(string3);
                if (object4 == null) continue;
                int n4 = Integer.parseInt(object5.toString());
                object5 = n4;
                ((HashMap)object).put(string2, object5);
            }
            object2 = ((HashMap)object).entrySet();
            Intrinsics.checkNotNullExpressionValue(object2, "<get-entries>(...)");
            object2 = CollectionsKt.k0((Iterable)object2);
            object = new Object();
            object2 = CollectionsKt.e0((Iterable)object2, (Comparator)object);
            object = new LinkedHashMap();
            object2 = object2.iterator();
            while (bl2 = object2.hasNext()) {
                object3 = object2.next();
                Intrinsics.checkNotNullExpressionValue(object3, "next(...)");
                object3 = (Map.Entry)object3;
                string2 = object3.getKey();
                object3 = object3.getValue();
                object.put(string2, object3);
            }
            object = ((LinkedHashMap)object).keySet();
            object2 = new ArrayList(object);
            return object2;
        }
        object2 = new ArrayList();
        return object2;
    }

    public static boolean W0() {
        boolean bl2;
        ComingSoonConfig comingSoonConfig = h40_0.q();
        if (comingSoonConfig != null) {
            bl2 = comingSoonConfig.isEnabled();
        } else {
            bl2 = false;
            comingSoonConfig = null;
        }
        return bl2;
    }

    public static int W1() {
        boolean bl2;
        Object object = h40_0.l0();
        String string2 = "variants_type";
        boolean bl3 = object.has(string2);
        int n3 = 0;
        if (bl3 && (object = object.opt(string2)) != null && (bl2 = object instanceof Integer)) {
            object = (Number)object;
            n3 = ((Number)object).intValue();
        }
        return n3;
    }

    public static OrderCancellationRefundConfig X() {
        z40$a z40$a = z40_0.Companion;
        return (OrderCancellationRefundConfig)JsonUtils.fromJson(Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.b("order_cancellation_refund_config"), OrderCancellationRefundConfig.class);
    }

    public static boolean X0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("is_email_optional");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean X1() {
        boolean bl2;
        Object object;
        String string2;
        Object object2;
        String string3 = od3_2.a;
        int n3 = string3.length();
        if (n3 == 0) {
            string3 = od3_2.a();
        }
        string3 = (n3 = (int)(s20.a ? 1 : 0)) == 0 && (n3 = (int)(Intrinsics.areEqual(object2 = od3_2.a(), string2 = ((ld3_2)((Object)(object = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) == 0 && !(bl2 = Intrinsics.areEqual(string3, object2 = ((ld3_2)((Object)object)).getStoreId())) ? "ABAjioRatingCollectionWishlist" : "ABAjioRatingCollectionWishlistGram";
        n3 = (int)(h40_0.Y1() ? 1 : 0);
        if (n3 == 0) return false;
        object2 = z40_0.Companion;
        object = AJIOApplication.Companion;
        object2 = Q.a((AJIOApplication$a)object, (z40$a)object2).a;
        bl2 = ((ao0_0)object2).a(string3);
        if (!bl2) return false;
        return true;
    }

    public static RtoFirebaseData Y() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("order_rto_reason_config");
        return (RtoFirebaseData)Z90.a(RtoFirebaseData.class, (String)object);
    }

    public static boolean Y0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("enabledCohortV2");
    }

    public static boolean Y1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("ABAjioRatingEnabled");
    }

    public static VideoConfig Z() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("pdp_videos_config");
        GsonBuilder gsonBuilder = new GsonBuilder();
        object = gsonBuilder.create().fromJson((String)object, VideoConfig.class);
        Intrinsics.checkNotNullExpressionValue(object, "fromJson(...)");
        return (VideoConfig)object;
    }

    public static boolean Z0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("external_ads_home_config").optBoolean("isEnabled");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean Z1() {
        boolean bl2 = h40_0.Y1();
        if (!bl2) return false;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "ABAjioRatingOrderDetail";
        bl2 = ((ao0_0)object).a(string2);
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String a0(xv$a_0 object) {
        Intrinsics.checkNotNullParameter(object, "screenType");
        int[] nArray = H40$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        String string2 = "";
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 != n4) {
                            object = new NoWhenBranchMatchedException();
                            throw object;
                        }
                        object = f;
                        if (object == null) return string2;
                        if ((object = ((BannerAdsConfig)object).getPageUrl()) != null) return object;
                        return string2;
                    }
                    object = j;
                    if (object == null) return string2;
                    if ((object = ((BannerAdsConfig)object).getPageUrl()) != null) return object;
                    return string2;
                }
                object = i;
                if (object == null) return string2;
                if ((object = ((BannerAdsConfig)object).getPageUrl()) != null) return object;
                return string2;
            }
            object = h;
            if (object == null) return string2;
            if ((object = ((BannerAdsConfig)object).getPageUrl()) != null) return object;
            return string2;
        }
        object = g;
        if (object == null) return string2;
        if ((object = ((BannerAdsConfig)object).getPageUrl()) == null) return string2;
        return object;
    }

    public static boolean a1() {
        boolean bl2;
        Object object = z40_0.Companion;
        Object object2 = AJIOApplication.Companion;
        ao0_0 ao0_02 = Q.a((AJIOApplication$a)object2, (z40$a)object).a;
        String string2 = "ABAjioEnableSocialLoginSignUp";
        boolean bl3 = ao0_02.a(string2);
        if (bl3 && (bl2 = ((ao0_0)(object = Q.a((AJIOApplication$a)object2, (z40$a)object).a)).a((String)(object2 = "enableFB")))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a2() {
        boolean bl2 = h40_0.Y1();
        if (!bl2) return false;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "ABAjioRatingOLP";
        bl2 = ((ao0_0)object).a(string2);
        if (!bl2) return false;
        return true;
    }

    public static boolean b() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("should_enable_image_cropper");
    }

    public static PanEncryptionItem b0() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("enable_pancard_collection");
        GsonBuilder gsonBuilder = new GsonBuilder();
        return (PanEncryptionItem)gsonBuilder.create().fromJson((String)object, PanEncryptionItem.class);
    }

    public static boolean b1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("fleek_enable");
    }

    public static boolean b2() {
        boolean bl2;
        Object object;
        String string2;
        Object object2;
        String string3 = od3_2.a;
        int n3 = string3.length();
        if (n3 == 0) {
            string3 = od3_2.a();
        }
        string3 = (n3 = (int)(s20.a ? 1 : 0)) == 0 && (n3 = (int)(Intrinsics.areEqual(object2 = od3_2.a(), string2 = ((ld3_2)((Object)(object = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) == 0 && !(bl2 = Intrinsics.areEqual(string3, object2 = ((ld3_2)((Object)object)).getStoreId())) ? "ABAjioRatingPDP" : "ABAjioReviewsForGramEnabled";
        object2 = z40_0.Companion;
        object = AJIOApplication.Companion;
        object2 = Q.a((AJIOApplication$a)object, (z40$a)object2).a;
        bl2 = ((ao0_0)object2).a(string3);
        if (bl2 && (bl2 = h40_0.Y1())) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        return bl2;
    }

    public static boolean c() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("ajiogram_landing_page").optBoolean("isEnabled");
    }

    public static JSONObject c0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("payment_mode_improvement_config");
    }

    public static boolean c1() {
        String string2;
        JSONObject jSONObject = h40_0.B();
        boolean bl2 = jSONObject.has(string2 = "enable_fraud_detection");
        if (bl2 && (bl2 = (jSONObject = h40_0.B()).getBoolean(string2))) {
            bl2 = true;
        } else {
            bl2 = false;
            jSONObject = null;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean c2() {
        boolean bl2 = h40_0.Y1();
        if (!bl2) return false;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "ABAjioRatingWishlist";
        bl2 = ((ao0_0)object).a(string2);
        if (!bl2) return false;
        return true;
    }

    public static JSONObject d() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("ajio_return_cod_communication_pdp_cart");
    }

    public static boolean d1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("enable_fraud_reduction_master_flag");
    }

    public static boolean d2() {
        String string2;
        JSONObject jSONObject = h40_0.c0();
        boolean bl2 = jSONObject.optBoolean(string2 = "isEnabled");
        if (bl2 && (bl2 = (jSONObject = h40_0.c0()).optBoolean(string2 = "refundMode"))) {
            bl2 = true;
        } else {
            bl2 = false;
            jSONObject = null;
        }
        return bl2;
    }

    public static AjioWalletToBankTransferConfig e() {
        z40$a z40$a = z40_0.Companion;
        return (AjioWalletToBankTransferConfig)JsonUtils.fromJson(Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.b("AjioWalletToBankTransferConfig"), AjioWalletToBankTransferConfig.class);
    }

    public static boolean e0() {
        String string2;
        z40$a z40$a = z40_0.Companion;
        z40$a = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("pdp_to_bag_conversation_json");
        boolean bl2 = z40$a.has(string2 = "pdp_oos_scenario");
        if (bl2) {
            return z40$a.getBoolean(string2);
        }
        return false;
    }

    public static boolean e1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("ABAJIOFreeDeliveryTag");
    }

    public static boolean e2() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("retain_search_query");
    }

    public static AjiogramInterventions f() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.d("ajiogram_interventions").toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return (AjiogramInterventions)Z90.a(AjiogramInterventions.class, (String)object);
    }

    public static String f0(String object) {
        Intrinsics.checkNotNullParameter(object, "storeId");
        Object object2 = ld3_2.STORE_LUXE;
        String string2 = object2.getStoreId();
        boolean bl2 = Intrinsics.areEqual(object, string2);
        if (!bl2) {
            boolean bl3;
            string2 = od3_2.a;
            int n3 = string2.length();
            if (n3 == 0) {
                string2 = od3_2.a();
            }
            if (!(bl3 = Intrinsics.areEqual(string2, object2 = object2.getStoreId()))) {
                object2 = ld3_2.STORE_AJIOGRAM.getStoreId();
                boolean bl4 = Intrinsics.areEqual(object, object2);
                if (bl4) {
                    object = z40_0.Companion;
                    return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("pdp_share_content_ajiogram");
                }
                object = z40_0.Companion;
                return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("pdp_share_content");
            }
        }
        object = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("pdp_share_content_luxe");
    }

    public static boolean f2() {
        boolean bl2;
        boolean bl3;
        Object object = h40_0.t0();
        boolean bl4 = false;
        if (object != null && (object = ((ReturnProcessingFeeConfig)object).getReturn_processing_fee_post_order()) != null && (bl3 = ((ReturnProcessingFeePostOrdeerConfig)object).getMaster()) == (bl2 = true)) {
            bl4 = true;
        }
        return bl4;
    }

    public static JSONObject g() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("all_store_category_error_config");
    }

    public static boolean g1() {
        boolean bl2;
        Object object = z40_0.Companion;
        Object object2 = AJIOApplication.Companion;
        ao0_0 ao0_02 = Q.a((AJIOApplication$a)object2, (z40$a)object).a;
        String string2 = "ABAjioEnableSocialLoginSignUp";
        boolean bl3 = ao0_02.a(string2);
        if (bl3 && (bl2 = ((ao0_0)(object = Q.a((AJIOApplication$a)object2, (z40$a)object).a)).a((String)(object2 = "ABAjioEnableGoogle")))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static boolean g2() {
        boolean bl2;
        Object object;
        boolean bl3 = h40_0.f2();
        if (!bl3 || (object = h40_0.t0()) == null || (object = ((ReturnProcessingFeeConfig)object).getReturn_processing_fee_post_order()) == null || (bl3 = ((ReturnProcessingFeePostOrdeerConfig)object).getReturn_creation()) != (bl2 = true)) {
            bl2 = false;
        }
        return bl2;
    }

    public static JSONObject h() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("all_store_errorConfig");
    }

    public static JSONObject h0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("quick_filter");
    }

    public static boolean h1() {
        String string2;
        z40$a z40$a = z40_0.Companion;
        z40$a = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("hm_preorder_json");
        boolean bl2 = z40$a.has(string2 = "hm_preorder_master_flag");
        if (bl2) {
            return z40$a.getBoolean(string2);
        }
        return false;
    }

    public static JSONObject i(String string2) {
        z40$a z40$a = z40_0.Companion;
        z40$a = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("all_store_meta_data_config");
        Locale locale = Locale.ROOT;
        string2 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        string2 = z40$a.getJSONObject(string2);
        Intrinsics.checkNotNullExpressionValue(string2, "getJSONObject(...)");
        return string2;
    }

    public static JSONObject i0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("preferred_mop");
    }

    public static boolean i1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("image_search");
    }

    public static JSONObject j(String string2) {
        z40$a z40$a = z40_0.Companion;
        z40$a = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("all_store_top_bar_config");
        Locale locale = Locale.ROOT;
        string2 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        string2 = z40$a.getJSONObject(string2);
        Intrinsics.checkNotNullExpressionValue(string2, "getJSONObject(...)");
        return string2;
    }

    public static PriorityDeliveryConfig j0() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.d("priority_delivery_config").toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        GsonBuilder gsonBuilder = new GsonBuilder();
        object = gsonBuilder.create().fromJson((String)object, PriorityDeliveryConfig.class);
        Intrinsics.checkNotNullExpressionValue(object, "fromJson(...)");
        return (PriorityDeliveryConfig)object;
    }

    public static boolean j1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("imps_enable");
    }

    public static JSONObject k() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("better_pdp_config");
    }

    public static PriorityDeliveryP2Config k0(boolean bl2) {
        Object object;
        if (bl2 || (object = b) == null) {
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("priorityDeliveryPhase2Config");
            Class<PriorityDeliveryP2Config> clazz = PriorityDeliveryP2Config.class;
            b = object = (PriorityDeliveryP2Config)JsonUtils.fromJson((String)object, clazz);
        }
        return b;
    }

    public static boolean k1() {
        return h40_0.E().getMasterFlag();
    }

    public static boolean k2() {
        boolean bl2;
        boolean bl3;
        ReturnProcessingFeeConfig returnProcessingFeeConfig = h40_0.t0();
        boolean bl4 = false;
        if (returnProcessingFeeConfig != null && (bl3 = returnProcessingFeeConfig.getReturn_processing_fee_cart()) == (bl2 = true)) {
            bl4 = true;
        }
        return bl4;
    }

    public static boolean l() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("cart_hide_decimal_experiment");
    }

    public static JSONObject l0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("rating_star_display_experience_json");
    }

    public static final boolean l1() {
        return h40_0.F().optBoolean("isEnabled");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean l2() {
        boolean bl2 = h40_0.Y1();
        if (!bl2) return false;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "ABAjioReviewsEnabled";
        bl2 = ((ao0_0)object).a(string2);
        if (!bl2) return false;
        return true;
    }

    public static JSONObject m() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("cart_product_tag_json");
    }

    public static JSONObject m0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("AjioRatingConfig");
    }

    public static boolean m1() {
        boolean bl2;
        boolean bl3;
        Boolean bl4;
        Object object = h40_0.f();
        boolean bl5 = false;
        if (object != null) {
            bl4 = ((AjiogramInterventions)object).getMaster();
            Boolean bl6 = Boolean.TRUE;
            bl3 = Intrinsics.areEqual(bl4, bl6);
        } else {
            bl3 = false;
            bl4 = null;
        }
        if (bl3 && (bl2 = Intrinsics.areEqual(object = ((AjiogramInterventions)object).getPdp_tag_enabled(), bl4 = Boolean.TRUE))) {
            bl5 = true;
        }
        return bl5;
    }

    public static boolean m2() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("is_search_optimisations_solr_enabled");
    }

    public static String n(String string2) {
        Object object = "storeId";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        int n3 = string2.length();
        String string3 = "";
        if (n3 != 0) {
            object = ld3_2.values();
            int n4 = ((ld3_2[])object).length;
            for (int i3 = 0; i3 < n4; ++i3) {
                String string4 = object[i3].getStoreId();
                boolean bl2 = Intrinsics.areEqual(string4, string2);
                if (!bl2) continue;
                object = Locale.ROOT;
                string2 = string2.toLowerCase((Locale)object);
                Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
                string2 = h40_0.i(string2);
                object = "coach_mark_desc";
                n4 = (int)(string2.has((String)object) ? 1 : 0);
                if (n4 != 0) {
                    string3 = string2.getString((String)object);
                    Intrinsics.checkNotNull(string3);
                }
                return string3;
            }
        }
        return string3;
    }

    public static JSONObject n0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("referral_screen_flag");
    }

    public static boolean n1() {
        boolean bl2;
        boolean bl3;
        Boolean bl4;
        Object object = h40_0.f();
        boolean bl5 = false;
        if (object != null) {
            bl4 = ((AjiogramInterventions)object).getMaster();
            Boolean bl6 = Boolean.TRUE;
            bl3 = Intrinsics.areEqual(bl4, bl6);
        } else {
            bl3 = false;
            bl4 = null;
        }
        if (bl3 && (bl2 = Intrinsics.areEqual(object = ((AjiogramInterventions)object).getPdp_widget_enabled(), bl4 = Boolean.TRUE))) {
            bl5 = true;
        }
        return bl5;
    }

    public static boolean n2() {
        return h40_0.k().optBoolean("isSectionOneTabularView");
    }

    public static long o(String string2) {
        Object object = "storeId";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        int n3 = string2.length();
        long l2 = 3;
        if (n3 != 0) {
            object = ld3_2.values();
            int n4 = ((ld3_2[])object).length;
            for (int i3 = 0; i3 < n4; ++i3) {
                String string3 = object[i3].getStoreId();
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) continue;
                object = Locale.ROOT;
                string2 = string2.toLowerCase((Locale)object);
                Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
                string2 = h40_0.i(string2);
                object = "coach_mark_display_time";
                n4 = (int)(string2.has((String)object) ? 1 : 0);
                if (n4 != 0) {
                    l2 = string2.getLong((String)object);
                }
                return l2;
            }
        }
        return l2;
    }

    public static JSONObject o0() {
        String string2;
        JSONObject jSONObject = h40_0.n0();
        boolean bl2 = jSONObject.has(string2 = "referee");
        if (bl2) {
            jSONObject = h40_0.n0().getJSONObject(string2);
            string2 = "getJSONObject(...)";
            Intrinsics.checkNotNullExpressionValue(jSONObject, string2);
        } else {
            jSONObject = new JSONObject();
        }
        return jSONObject;
    }

    public static boolean o1() {
        boolean bl2;
        boolean bl3;
        Boolean bl4;
        Object object = h40_0.f();
        boolean bl5 = false;
        if (object != null) {
            bl4 = ((AjiogramInterventions)object).getMaster();
            Boolean bl6 = Boolean.TRUE;
            bl3 = Intrinsics.areEqual(bl4, bl6);
        } else {
            bl3 = false;
            bl4 = null;
        }
        if (bl3 && (bl2 = Intrinsics.areEqual(object = ((AjiogramInterventions)object).getPlp_tag_enabled(), bl4 = Boolean.TRUE))) {
            bl5 = true;
        }
        return bl5;
    }

    public static boolean o2() {
        return h40_0.k().optBoolean("isSectionThreeTabularView");
    }

    public static String p(String string2) {
        Object object = "storeId";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        int n3 = string2.length();
        String string3 = "";
        if (n3 != 0) {
            object = ld3_2.values();
            int n4 = ((ld3_2[])object).length;
            for (int i3 = 0; i3 < n4; ++i3) {
                String string4 = object[i3].getStoreId();
                boolean bl2 = Intrinsics.areEqual(string4, string2);
                if (!bl2) continue;
                object = Locale.ROOT;
                string2 = string2.toLowerCase((Locale)object);
                Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
                string2 = h40_0.i(string2);
                object = "coach_mark_title";
                n4 = (int)(string2.has((String)object) ? 1 : 0);
                if (n4 != 0) {
                    string3 = string2.getString((String)object);
                    Intrinsics.checkNotNull(string3);
                }
                return string3;
            }
        }
        return string3;
    }

    public static JSONObject p0() {
        String string2;
        JSONObject jSONObject = h40_0.n0();
        boolean bl2 = jSONObject.has(string2 = "referrerBenefits");
        if (bl2) {
            jSONObject = h40_0.n0().getJSONObject(string2);
            string2 = "getJSONObject(...)";
            Intrinsics.checkNotNullExpressionValue(jSONObject, string2);
        } else {
            jSONObject = new JSONObject();
        }
        return jSONObject;
    }

    public static boolean p2() {
        return h40_0.k().optBoolean("isSectionTwoTabularView");
    }

    public static ComingSoonConfig q() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.d("comingSoonFeatureConfig").toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        GsonBuilder gsonBuilder = new GsonBuilder();
        return (ComingSoonConfig)gsonBuilder.create().fromJson((String)object, ComingSoonConfig.class);
    }

    public static JSONObject q0() {
        String string2;
        JSONObject jSONObject = h40_0.n0();
        boolean bl2 = jSONObject.has(string2 = "referrer");
        if (bl2) {
            jSONObject = h40_0.n0().getJSONObject(string2);
            string2 = "getJSONObject(...)";
            Intrinsics.checkNotNullExpressionValue(jSONObject, string2);
        } else {
            jSONObject = new JSONObject();
        }
        return jSONObject;
    }

    public static boolean q2() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("similarProductsForWishlistAjio");
    }

    public static String r() {
        Object object = h40_0.q();
        if (object == null || (object = ((ComingSoonConfig)object).getMessage()) == null) {
            object = "";
        }
        return object;
    }

    public static RetireRcsWalletConfig r0() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.d("retire_rcs_wallet_config").toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        GsonBuilder gsonBuilder = new GsonBuilder();
        return (RetireRcsWalletConfig)gsonBuilder.create().fromJson((String)object, RetireRcsWalletConfig.class);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean r2(xv$a_0 object) {
        Intrinsics.checkNotNullParameter(object, "screenType");
        int[] nArray = H40$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        boolean bl2 = false;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            object = f;
                            if (object == null) return bl2;
                            if ((object = ((BannerAdsConfig)object).isThirdPartyAdsBannerClickEnabled()) == null) return bl2;
                            return (Boolean)object;
                        }
                        object = new NoWhenBranchMatchedException();
                        throw object;
                    }
                    object = j;
                    if (object == null) return bl2;
                    if ((object = ((BannerAdsConfig)object).isThirdPartyAdsBannerClickEnabled()) == null) return bl2;
                    return (Boolean)object;
                }
                object = i;
                if (object == null) return bl2;
                if ((object = ((BannerAdsConfig)object).isThirdPartyAdsBannerClickEnabled()) == null) return bl2;
                return (Boolean)object;
            }
            object = h;
            if (object == null) return bl2;
            if ((object = ((BannerAdsConfig)object).isThirdPartyAdsBannerClickEnabled()) == null) return bl2;
            return (Boolean)object;
        }
        object = g;
        if (object == null) return bl2;
        if ((object = ((BannerAdsConfig)object).isThirdPartyAdsBannerClickEnabled()) == null) return bl2;
        return (Boolean)object;
    }

    public static JSONObject s() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("account_delete_config");
    }

    public static ReturnFlowConfig s0(boolean bl2) {
        Object object;
        if (bl2 || (object = e) == null) {
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.d("return_flow_optimization").toString();
            Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
            Class<ReturnFlowConfig> clazz = ReturnFlowConfig.class;
            e = object = (ReturnFlowConfig)Z90.a(clazz, (String)object);
        }
        return e;
    }

    public static boolean s1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("ABAJIONewColorPalette");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean s2(xv$a_0 object) {
        Intrinsics.checkNotNullParameter(object, "screenType");
        int[] nArray = H40$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        boolean bl2 = false;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            object = f;
                            if (object == null) return bl2;
                            if ((object = ((BannerAdsConfig)object).isThirdPartyAdsEnabled()) == null) return bl2;
                            return (Boolean)object;
                        }
                        object = new NoWhenBranchMatchedException();
                        throw object;
                    }
                    object = j;
                    if (object == null) return bl2;
                    if ((object = ((BannerAdsConfig)object).isThirdPartyAdsEnabled()) == null) return bl2;
                    return (Boolean)object;
                }
                object = i;
                if (object == null) return bl2;
                if ((object = ((BannerAdsConfig)object).isThirdPartyAdsEnabled()) == null) return bl2;
                return (Boolean)object;
            }
            object = h;
            if (object == null) return bl2;
            if ((object = ((BannerAdsConfig)object).isThirdPartyAdsEnabled()) == null) return bl2;
            return (Boolean)object;
        }
        object = g;
        if (object == null) return bl2;
        if ((object = ((BannerAdsConfig)object).isThirdPartyAdsEnabled()) == null) return bl2;
        return (Boolean)object;
    }

    public static JSONObject t() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("dressToolAtcPopupConfig");
    }

    public static ReturnProcessingFeeConfig t0() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("return_processing_fee");
        GsonBuilder gsonBuilder = new GsonBuilder();
        return (ReturnProcessingFeeConfig)gsonBuilder.create().fromJson((String)object, ReturnProcessingFeeConfig.class);
    }

    public static boolean t1() {
        String string2;
        JSONObject jSONObject = h40_0.n0();
        boolean bl2 = jSONObject.has(string2 = "isNewReferralScreenEnabled");
        if (bl2) {
            jSONObject = h40_0.n0();
            bl2 = jSONObject.getBoolean(string2);
        } else {
            bl2 = false;
            jSONObject = null;
        }
        return bl2;
    }

    public static boolean t2(String object) {
        Intrinsics.checkNotNullParameter(object, "storeId");
        String string2 = ld3_2.STORE_AJIO.getStoreId();
        boolean bl2 = Intrinsics.areEqual(object, string2);
        if (bl2) {
            object = z40_0.Companion;
            return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.a("enable_traffic_specific_targeting_size_oos");
        }
        return false;
    }

    public static String u() {
        String string2;
        JSONObject jSONObject = h40_0.t();
        boolean bl2 = jSONObject.has(string2 = "imgUrl");
        if (bl2) {
            return jSONObject.optString(string2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static String u0() {
        void var0_2;
        JSONObject jSONObject = h40_0.B();
        String string2 = "ril_employee_benefits_info";
        boolean bl2 = jSONObject.has(string2);
        String string3 = "getString(...)";
        if (bl2) {
            String string4 = h40_0.B().getString(string2);
        } else {
            AJIOApplication.Companion.getClass();
            AJIOApplication aJIOApplication = AJIOApplication$a.a();
            int n3 = R$string.ril_employee_benefits_text;
            String string5 = aJIOApplication.getString(n3);
        }
        Intrinsics.checkNotNullExpressionValue(var0_2, string3);
        return var0_2;
    }

    public static boolean u1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("isNewReturnFormEnabled");
    }

    public static boolean u2() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("isUCPLoginFlowEnable");
    }

    public static RtoFirebaseData v0() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("rto_reason_config");
        return (RtoFirebaseData)Z90.a(RtoFirebaseData.class, (String)object);
    }

    public static boolean v1() {
        boolean bl2 = h40_0.k1();
        boolean bl3 = false;
        if (bl2) {
            String string2 = h40_0.E().getTouchPointList();
            if (string2 != null) {
                String string3 = PermissionTrigger.WISHLIST.getValue();
                bl2 = StringsKt.F(string2, string3, false);
            } else {
                bl2 = false;
                string2 = null;
            }
            if (bl2) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public static BaseValue w() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.d("fleek_base_value").toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        GsonBuilder gsonBuilder = new GsonBuilder();
        object = gsonBuilder.create().fromJson((String)object, BaseValue.class);
        Intrinsics.checkNotNullExpressionValue(object, "fromJson(...)");
        return (BaseValue)object;
    }

    public static FleekSesConfigs w0() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.d("fleek_ses_config").toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        GsonBuilder gsonBuilder = new GsonBuilder();
        object = gsonBuilder.create().fromJson((String)object, FleekSesConfigs.class);
        Intrinsics.checkNotNullExpressionValue(object, "fromJson(...)");
        return (FleekSesConfigs)object;
    }

    public static boolean w1() {
        boolean bl2 = h40_0.k1();
        boolean bl3 = false;
        if (bl2) {
            String string2 = h40_0.E().getTouchPointList();
            if (string2 != null) {
                String string3 = PermissionTrigger.SESSIONS.getValue();
                bl2 = StringsKt.F(string2, string3, false);
            } else {
                bl2 = false;
                string2 = null;
            }
            if (bl2) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public static FleekConfigs x() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("fleek_configs");
        GsonBuilder gsonBuilder = new GsonBuilder();
        return (FleekConfigs)gsonBuilder.create().fromJson((String)object, FleekConfigs.class);
    }

    public static long x0(String string2) {
        Object object = "storeId";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        int n3 = string2.length();
        long l2 = 3;
        if (n3 != 0) {
            object = ld3_2.values();
            int n4 = ((ld3_2[])object).length;
            for (int i3 = 0; i3 < n4; ++i3) {
                String string3 = object[i3].getStoreId();
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) continue;
                object = Locale.ROOT;
                string2 = string2.toLowerCase((Locale)object);
                Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
                string2 = h40_0.j(string2);
                object = "animation_repeat_count";
                n4 = (int)(string2.has((String)object) ? 1 : 0);
                if (n4 != 0) {
                    l2 = string2.getLong((String)object);
                }
                return l2;
            }
        }
        return l2;
    }

    public static boolean x1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("ABAJIOCouponsAndBankOffersMerge");
    }

    public static FleekVideoConfigValue y() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.d("fleek_post_story_video_config").toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        GsonBuilder gsonBuilder = new GsonBuilder();
        object = gsonBuilder.create().fromJson((String)object, FleekVideoConfigValue.class);
        Intrinsics.checkNotNullExpressionValue(object, "fromJson(...)");
        return (FleekVideoConfigValue)object;
    }

    public static String y0(String string2) {
        Object object = "storeId";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        int n3 = string2.length();
        String string3 = "";
        if (n3 != 0) {
            object = ld3_2.values();
            int n4 = ((ld3_2[])object).length;
            for (int i3 = 0; i3 < n4; ++i3) {
                String string4 = object[i3].getStoreId();
                boolean bl2 = Intrinsics.areEqual(string4, string2);
                if (!bl2) continue;
                object = Locale.ROOT;
                string2 = string2.toLowerCase((Locale)object);
                Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
                string2 = h40_0.j(string2);
                object = "search_bar_text";
                n4 = (int)(string2.has((String)object) ? 1 : 0);
                if (n4 != 0) {
                    string3 = string2.getString((String)object);
                    Intrinsics.checkNotNull(string3);
                }
                return string3;
            }
        }
        return string3;
    }

    public static boolean y1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("enable_order_confirmation_earning_highlight");
    }

    public static JSONObject z() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("floating_widget_config");
    }

    public static JSONObject z0() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("SearchUIConfig");
    }

    public static boolean z1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("isOspreySearchEnabled");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final String G(xv$a_0 object) {
        void var1_8;
        Intrinsics.checkNotNullParameter(object, "screenType");
        int[] nArray = H40$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 == n4) {
            String string2 = h40_0.L(false).getJioAdsAsi();
            return var1_8;
        }
        n4 = 2;
        if (n3 == n4) {
            String string3 = h40_0.H(false).getJioAdsAsi();
            return var1_8;
        }
        n4 = 3;
        if (n3 == n4) {
            String string4 = h40_0.K(false).getJioAdsAsi();
            return var1_8;
        }
        n4 = 4;
        if (n3 == n4) {
            String string5 = h40_0.P(false).getJioAdsAsi();
            return var1_8;
        }
        n4 = 5;
        if (n3 == n4) {
            String string6 = h40_0.J(false).getJioAdsAsi();
            return var1_8;
        }
        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
        throw noWhenBranchMatchedException;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final String M(xv$a_0 object) {
        void var1_8;
        Intrinsics.checkNotNullParameter(object, "screenType");
        int[] nArray = H40$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 == n4) {
            String string2 = h40_0.L(false).getJioAdsPageUrl();
            return var1_8;
        }
        n4 = 2;
        if (n3 == n4) {
            String string3 = h40_0.H(false).getJioAdsPageUrl();
            return var1_8;
        }
        n4 = 3;
        if (n3 == n4) {
            String string4 = h40_0.K(false).getJioAdsPageUrl();
            return var1_8;
        }
        n4 = 4;
        if (n3 == n4) {
            String string5 = h40_0.P(false).getJioAdsPageUrl();
            return var1_8;
        }
        n4 = 5;
        if (n3 == n4) {
            String string6 = h40_0.J(false).getJioAdsPageUrl();
            return var1_8;
        }
        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
        throw noWhenBranchMatchedException;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final String N(xv$a_0 object) {
        void var1_7;
        Intrinsics.checkNotNullParameter(object, "screenType");
        int[] nArray = H40$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 != n4 && n3 != (n4 = 2)) {
            n4 = 3;
            if (n3 == n4) {
                String string2 = h40_0.K(false).getJioAdsSdkAsi();
                return var1_7;
            }
            n4 = 4;
            if (n3 == n4) {
                String string3 = h40_0.P(false).getJioAdsSdkAsi();
                return var1_7;
            }
            n4 = 5;
            if (n3 == n4) {
                String string4 = h40_0.J(false).getJioAdsSdkAsi();
                return var1_7;
            }
            NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
            throw noWhenBranchMatchedException;
        }
        n3 = 0;
        return var1_7;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final List O(xv$a_0 object) {
        void var1_7;
        Intrinsics.checkNotNullParameter(object, "screenType");
        int[] nArray = H40$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 != n4 && n3 != (n4 = 2)) {
            n4 = 3;
            if (n3 == n4) {
                List list = h40_0.K(false).getJioAdsSdkDimension();
                return var1_7;
            }
            n4 = 4;
            if (n3 == n4) {
                List list = h40_0.P(false).getJioAdsSdkDimension();
                return var1_7;
            }
            n4 = 5;
            if (n3 == n4) {
                List list = h40_0.J(false).getJioAdsSdkDimension();
                return var1_7;
            }
            NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
            throw noWhenBranchMatchedException;
        }
        n3 = 0;
        return var1_7;
    }

    public final void a() {
        boolean bl2 = true;
        h40_0.k0(bl2);
        h40_0.D(bl2);
        h40_0.Q(bl2);
        h40_0.s0(bl2);
        h40_0.J(bl2);
        h40_0.L(bl2);
        h40_0.H(bl2);
        h40_0.K(bl2);
        h40_0.P(bl2);
    }

    public final Map d0() {
        boolean bl2 = h40_0.Q1();
        if (bl2) {
            boolean bl3;
            bl2 = false;
            Object object = h40_0.k0(false);
            if (object != null && (object = ((PriorityDeliveryP2Config)object).getPdpCartDelivery()) != null && (object = ((PdpCartDelivery)object).getDeliverySLA()) != null && (bl3 = object.isEmpty() ^ true)) {
                return object;
            }
        }
        return null;
    }

    public final boolean f1() {
        boolean bl2 = false;
        Boolean bl3 = h40_0.D(false).getMaster();
        if (bl3 != null) {
            bl2 = bl3;
        }
        return bl2;
    }

    public final Map g0() {
        boolean bl2 = h40_0.Q1();
        if (bl2) {
            boolean bl3;
            bl2 = false;
            Object object = h40_0.k0(false);
            if (object != null && (object = ((PriorityDeliveryP2Config)object).getPlpDelivery()) != null && (object = ((PlpDelivery)object).getPlpListing()) != null && (object = ((PlpListing)object).getDeliverySlaTag()) != null && (bl3 = object.isEmpty() ^ true)) {
                return object;
            }
        }
        return null;
    }

    public final boolean h2() {
        boolean bl2;
        boolean bl3;
        Boolean bl4;
        boolean bl5 = false;
        Object object = h40_0.s0(false);
        if (object != null) {
            bl4 = ((ReturnFlowConfig)object).getMaster();
            Boolean bl6 = Boolean.TRUE;
            bl3 = Intrinsics.areEqual(bl4, bl6);
        } else {
            bl3 = false;
            bl4 = null;
        }
        if (bl3 && (bl2 = Intrinsics.areEqual(object = ((ReturnFlowConfig)object).getCustomer_care_enabled(), bl4 = Boolean.TRUE))) {
            bl5 = true;
        }
        return bl5;
    }

    public final boolean i2() {
        boolean bl2;
        boolean bl3;
        Boolean bl4;
        boolean bl5 = false;
        Object object = h40_0.s0(false);
        if (object != null) {
            bl4 = ((ReturnFlowConfig)object).getMaster();
            Boolean bl6 = Boolean.TRUE;
            bl3 = Intrinsics.areEqual(bl4, bl6);
        } else {
            bl3 = false;
            bl4 = null;
        }
        if (bl3 && (bl2 = Intrinsics.areEqual(object = ((ReturnFlowConfig)object).getReturn_cancel_enabled(), bl4 = Boolean.TRUE))) {
            bl5 = true;
        }
        return bl5;
    }

    public final boolean j2() {
        boolean bl2;
        boolean bl3;
        Boolean bl4;
        boolean bl5 = false;
        Object object = h40_0.s0(false);
        if (object != null) {
            bl4 = ((ReturnFlowConfig)object).getMaster();
            Boolean bl6 = Boolean.TRUE;
            bl3 = Intrinsics.areEqual(bl4, bl6);
        } else {
            bl3 = false;
            bl4 = null;
        }
        if (bl3 && (bl2 = Intrinsics.areEqual(object = ((ReturnFlowConfig)object).getReturn_exchange_enabled(), bl4 = Boolean.TRUE))) {
            bl5 = true;
        }
        return bl5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean p1(xv$a_0 object) {
        Intrinsics.checkNotNullParameter(object, "screenType");
        int[] nArray = H40$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            object = h40_0.J(false);
                            return (int)(((BannerAdsConfig)object).isJioBannerAdsClickEnabled() ? 1 : 0) != 0;
                        }
                        object = new NoWhenBranchMatchedException();
                        throw object;
                    }
                    object = h40_0.P(false);
                    return (int)(((BannerAdsConfig)object).isJioBannerAdsClickEnabled() ? 1 : 0) != 0;
                }
                object = h40_0.K(false);
                return (int)(((BannerAdsConfig)object).isJioBannerAdsClickEnabled() ? 1 : 0) != 0;
            }
            object = h40_0.H(false);
            return (boolean)((BannerAdsConfig)object).isJioBannerAdsClickEnabled();
        }
        object = h40_0.L(false);
        return (int)(((BannerAdsConfig)object).isJioBannerAdsClickEnabled() ? 1 : 0) != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean q1(xv$a_0 object) {
        Intrinsics.checkNotNullParameter(object, "screenType");
        int[] nArray = H40$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            object = h40_0.J(false);
                            return (int)(((BannerAdsConfig)object).isJioBannerAdsEnabled() ? 1 : 0) != 0;
                        }
                        object = new NoWhenBranchMatchedException();
                        throw object;
                    }
                    object = h40_0.P(false);
                    return (int)(((BannerAdsConfig)object).isJioBannerAdsEnabled() ? 1 : 0) != 0;
                }
                object = h40_0.K(false);
                return (int)(((BannerAdsConfig)object).isJioBannerAdsEnabled() ? 1 : 0) != 0;
            }
            object = h40_0.H(false);
            return (boolean)((BannerAdsConfig)object).isJioBannerAdsEnabled();
        }
        object = h40_0.L(false);
        return (int)(((BannerAdsConfig)object).isJioBannerAdsEnabled() ? 1 : 0) != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean r1(xv$a_0 object) {
        Intrinsics.checkNotNullParameter(object, "screenType");
        int[] nArray = H40$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        boolean bl2 = false;
        if (n3 == n4) return bl2;
        n4 = 2;
        if (n3 == n4) return bl2;
        n4 = 3;
        if (n3 != n4) {
            n4 = 4;
            if (n3 != n4) {
                n4 = 5;
                if (n3 == n4) {
                    object = h40_0.J(false);
                    return ((BannerAdsConfig)object).isJioBannerDynamicAdsEnabled();
                }
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            object = h40_0.P(false);
            return ((BannerAdsConfig)object).isJioBannerDynamicAdsEnabled();
        }
        object = h40_0.K(false);
        return ((BannerAdsConfig)object).isJioBannerDynamicAdsEnabled();
    }

    public final String v() {
        boolean bl2 = h40_0.Q1();
        if (bl2) {
            int n3;
            bl2 = false;
            Object object = h40_0.k0(false);
            if (object != null && (object = ((PriorityDeliveryP2Config)object).getPlpDelivery()) != null && (object = ((PlpDelivery)object).getPlpFilters()) != null && (object = ((PlpFilters)object).getFacetTitle()) != null && (n3 = ((String)object).length()) > 0) {
                return object;
            }
        }
        return null;
    }
}

