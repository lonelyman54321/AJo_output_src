/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.gson.JsonObject;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.model.CMSConfigInitializer;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import com.ril.ajio.services.network.api.AjioHomeApi;
import com.ril.ajio.services.network.api.CategoryNavigationApi;
import com.ril.ajio.services.network.api.ProDetailsApi;
import com.ril.ajio.services.network.cache.CustomDiskCache;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from N9
 */
public final class n9_0
implements BaseRepo {
    public static final n9_0 a;
    public static final AjioHomeApi b;
    public static final ProDetailsApi c;
    public static final CategoryNavigationApi d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final jo_2 i;
    public static final String j;
    public static final String k;
    public static final UserInformation l;

    static {
        jo_2 jo_22;
        Object object = new n9_0();
        a = object;
        object = AjioApiConnector.INSTANCE;
        b = ((AjioApiConnector)object).getHomeApi();
        c = ((AjioApiConnector)object).getProDetailsApi();
        d = ((AjioApiConnector)object).getCategoryNavigation();
        e = object = "Android";
        f = "TOP_BAR";
        g = "MOBILE";
        h = "AJIO";
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        i = jo_22 = new jo_2((Context)aJIOApplication);
        j = object;
        k = p90.a((Context)AJIOApplication$a.a());
        l = UserInformation.getInstance((Context)AJIOApplication$a.a());
    }

    /*
     * Enabled aggressive block sorting
     */
    public static g53_0 a(String object, String object2) {
        boolean bl2;
        Object object3 = "store";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "navType");
        JsonObject jsonObject = new JsonObject();
        Object object4 = od3_2.a();
        Object object5 = CustomerStoreType.a;
        object5 = ScreenType.SCREEN_HOME;
        String string2 = CustomerStoreType.a((String)object4, (ScreenType)((Object)object5));
        object4 = UrlHelper.Companion;
        int n3 = ((UrlHelper$Companion)object4).getISPREVIEW();
        boolean bl3 = false;
        Object object6 = null;
        Object object7 = "userGroup";
        if (n3 != 0) {
            object4 = ch_2.a();
            if (object4 != null && (n3 = ((String)object4).length()) != 0) {
                object5 = "timeStamp";
                jsonObject.addProperty((String)object5, (String)object4);
            }
            if ((object4 = ch_2.j) != null && (bl2 = ((String)object4).length())) {
                object4 = ch_2.j;
                Intrinsics.checkNotNull(object4);
                jsonObject.addProperty((String)object7, (String)object4);
            }
            if ((object4 = ch_2.m) != null) {
                object5 = new String[]{","};
                int n4 = 6;
                object4 = StringsKt.a0((CharSequence)object4, (String[])object5, false, 0, n4);
                object5 = new ArrayList();
                object4 = ((Iterable)object4).iterator();
                while (bl3 = object4.hasNext()) {
                    object6 = (String)object4.next();
                    ((ArrayList)object5).add(object6);
                }
                object4 = "userSubGroup";
                object5 = object5.toString();
                jsonObject.addProperty((String)object4, (String)object5);
            }
            object4 = CMSConfigInitializer.getPreviewUrlForNav();
        } else {
            n3 = string2.length();
            if (n3 > 0) {
                jsonObject.addProperty((String)object7, string2);
            }
            object4 = ((UrlHelper$Companion)object4).getInstance();
            object5 = new Object[]{};
            object6 = "homepage";
            object7 = "cms_nav_menu";
            object4 = ((UrlHelper)object4).getApiUrl((String)object6, (String)object7, (Object[])object5);
        }
        object6 = object4;
        bl2 = hu1_2.e();
        object5 = h40_0.a;
        object5 = z40_0.Companion;
        object7 = AJIOApplication.Companion;
        Object object8 = Q.a((AJIOApplication$a)object7, (z40$a)object5).a;
        String string3 = "cmsTopBarApiCacheConfig";
        object8 = ((cw)object8).d(string3);
        String string4 = "isEnabled";
        boolean bl4 = object8.optBoolean(string4);
        object7.getClass();
        object8 = AJIOApplication$a.a();
        object5.getClass();
        n3 = z40$a.a((Context)object8).a.d(string3).optInt("TTL");
        object8 = TimeUnit.MINUTES;
        long l2 = n3;
        l2 = ((TimeUnit)((Object)object8)).toMillis(l2);
        n3 = ((String)object4).hashCode();
        object8 = new StringBuilder();
        ((StringBuilder)object8).append(n3);
        ((StringBuilder)object8).append("&store=");
        ((StringBuilder)object8).append((String)object);
        object5 = "&isNav3Enabled=";
        ((StringBuilder)object8).append((String)object5);
        ((StringBuilder)object8).append(bl2);
        object4 = ((StringBuilder)object8).toString();
        if (bl4) {
            object7.getClass();
            object7 = AJIOApplication$a.a();
            object5 = new CustomDiskCache((Context)object7, l2);
            object5 = ((CustomDiskCache)object5).getFromCache((String)object4);
            if (object5 != null) {
                object = new js_1(object5, 3);
                object = g53_0.b((v53_0)object);
                Intrinsics.checkNotNullExpressionValue(object, "create(...)");
                return object;
            }
        }
        if ((n3 = (int)(hu1_2.e() ? 1 : 0)) != 0) {
            object5 = hu1_2.e;
            object7 = "experiment";
            jsonObject.addProperty((String)object7, (String)object5);
        }
        object7 = e;
        jsonObject.addProperty("channel", (String)object7);
        jsonObject.addProperty("navigationType", (String)object2);
        object5 = g;
        jsonObject.addProperty("platform", (String)object5);
        jsonObject.addProperty((String)object3, (String)object);
        object2 = h;
        jsonObject.addProperty("tenantId", (String)object2);
        object = d.getCMSCategoryNavigation((String)object6, jsonObject, "application/json", "BackGround_AllCMSCategories", string2);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new e9_0(l2, bl4, (String)object4);
        object3 = new f9_0((Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        return object3;
    }

    public static u53_0 b(String object, String object2) {
        Intrinsics.checkNotNullParameter(object2, "requestID");
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Object object3 = UrlHelper.Companion.getInstance();
        int n3 = 3;
        Object object4 = new Object[n3];
        object4[0] = object;
        object4[1] = object = Boolean.FALSE;
        int n4 = 2;
        object4[n4] = object;
        String string2 = ((UrlHelper)object3).getApiUrl("homepage", "products_list_detail", object4);
        object = cp_1.Companion;
        object.getClass();
        int n7 = cp$a.p();
        object3 = i;
        if (n7 != 0 && (object = ((jo_2)object3).f()) != null && (n7 = ((String)object).length()) != 0) {
            object = String.valueOf(((jo_2)object3).f());
            object4 = "customertype";
            hashMap.put(object4, object);
        }
        if ((object4 = ((UserInformation)(object = l)).getUserSegementIds()) != null && (n3 = object4.length()) != 0) {
            object4 = "segmentIds";
            object = ((UserInformation)object).getUserSegementIds();
            hashMap.put(object4, object);
        }
        object = h40_0.a;
        n7 = (int)(h40_0.S1() ? 1 : 0);
        if (n7 != 0) {
            object = "displayRatings";
            object4 = "true";
            hashMap.put(object, object4);
        }
        object = CustomerStoreType.a;
        object = "rilfnl_v1";
        object4 = ScreenType.SCREEN_PDP;
        String string3 = CustomerStoreType.a((String)object, (ScreenType)((Object)object4));
        n7 = (int)(mz3_0.y(string3) ? 1 : 0);
        if (n7 != 0 && (n7 = (int)(ww0_2.c() ? 1 : 0)) != 0 && (n7 = string3.length()) != 0) {
            object = "userClusterId";
            hashMap.put(object, string3);
        }
        if ((n7 = (int)(h40_0.Q1() ? 1 : 0)) != 0 && (object = ((jo_2)object3).m()) != null && (n7 = ((String)object).length()) != 0) {
            object = String.valueOf(((jo_2)object3).m());
            object3 = "pincode";
            hashMap.put(object3, object);
        }
        TU2.a(hashMap);
        String string4 = k;
        object4 = c;
        String string5 = j;
        object = object4.getRvProducts(string2, string5, string4, hashMap, (String)object2, string3);
        object3 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object3);
        object3 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object3);
        object3 = new k9_0(object2, 0);
        object4 = new l9_0(0, (Function1)object3);
        object3 = new s53_0((q63_0)object, (bx0_2)object4);
        object = new m9_0(object2);
        object2 = new u53_0((q63_0)object3, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object2, "onErrorReturn(...)");
        return object2;
    }
}

