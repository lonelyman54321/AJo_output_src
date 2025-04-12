/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.WebSettings
 */
import android.content.Context;
import android.webkit.WebSettings;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.retargeting.JioAdsEventService;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlinx.coroutines.d;

/*
 * Renamed from el1
 */
public final class el1_2 {
    public static final AJIOApplication a;
    public static final c80 b;
    public static final hh3_2 c;

    static {
        AJIOApplication.Companion.getClass();
        a = AJIOApplication$a.a();
        Object object = ir0_2.a;
        b = d.a(em0_2.b);
        object = new Object();
        c = yr1_2.b((Function0)object);
    }

    public static final void a() {
        Object object = el1_2.f();
        boolean bl2 = ((JioAdsEventService)object).isInitialized();
        if (!bl2 && (bl2 = el1_2.j())) {
            Object object2;
            Object object3;
            Object object4;
            block6: {
                object4 = a;
                object = new JioAdsEventService((Context)object4);
                boolean bl3 = vl1_2.c();
                if (bl3) {
                    object3 = JioAds.Companion.getInstance();
                    object2 = JioAds$LogLevel.DEBUG;
                    ((JioAds)object3).setLogLevel((JioAds$LogLevel)((Object)object2));
                    object3 = "stg";
                    ((JioAdsEventService)object).setConfigEnvironment((String)object3);
                }
                try {
                    object = AJIOApplication.Companion;
                }
                catch (Exception exception) {}
                object.getClass();
                object = AJIOApplication$a.a();
                if (object == null) break block6;
                object = WebSettings.getDefaultUserAgent((Context)object);
            }
            object = "";
            object3 = JioAds.Companion;
            object2 = ((JioAds$Companion)object3).getInstance();
            ((JioAds)object2).init((Context)object4);
            object4 = ((JioAds$Companion)object3).getInstance();
            ((JioAds)object4).setCustomUserAgent((String)object);
        }
    }

    public static void b(yt2_2 yt2_22, Product product) {
        Intrinsics.checkNotNullParameter((Object)yt2_22, "screenName");
        Object object = "product";
        Intrinsics.checkNotNullParameter(product, (String)object);
        boolean bl2 = el1_2.j();
        if (!bl2) {
            return;
        }
        object = new el1$b(yt2_22, product, null);
        Ae3.d(b, null, null, (Function2)object, 3);
    }

    public static void c(yt2_2 yt2_22, Product product) {
        Intrinsics.checkNotNullParameter((Object)yt2_22, "screenName");
        Object object = "product";
        Intrinsics.checkNotNullParameter(product, (String)object);
        boolean bl2 = el1_2.j();
        if (!bl2) {
            return;
        }
        object = new el1$c(yt2_22, product, null);
        Ae3.d(b, null, null, (Function2)object, 3);
    }

    public static void d(yt2_2 yt2_22, Product product) {
        Intrinsics.checkNotNullParameter((Object)yt2_22, "screenName");
        Object object = "product";
        Intrinsics.checkNotNullParameter(product, (String)object);
        boolean bl2 = el1_2.j();
        if (!bl2) {
            return;
        }
        object = new el1$d(yt2_22, product, null);
        Ae3.d(b, null, null, (Function2)object, 3);
    }

    public static String e(yt2_2 object, Product product) {
        Intrinsics.checkNotNullParameter(object, "screenName");
        Intrinsics.checkNotNullParameter(product, "product");
        int[] nArray = el1$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4 && n3 != (n4 = 3)) {
                n4 = 4;
                if (n3 != n4) {
                    object = "";
                } else {
                    object = product.getBaseProduct();
                    if (object == null) {
                        object = product.getCode();
                    }
                }
            } else {
                object = product.getCode();
                if (object == null) {
                    object = product.getFnlColorVariantData();
                    if (object != null) {
                        object = ((ProductFnlColorVariantData)object).getColorGroup();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                }
            }
        } else {
            object = product.getFnlColorVariantData();
            if (object == null || (object = ((ProductFnlColorVariantData)object).getColorGroup()) == null) {
                object = product.getCode();
            }
        }
        return object;
    }

    public static JioAdsEventService f() {
        return (JioAdsEventService)c.getValue();
    }

    public static HashMap g() {
        JioAds jioAds = JioAds.Companion.getInstance();
        AJIOApplication aJIOApplication = a;
        return jioAds.getRequestParams((Context)aJIOApplication, null);
    }

    public static String h(yt2_2 object, Product product) {
        String string2;
        block2: {
            block3: {
                int n3;
                Intrinsics.checkNotNullParameter(object, "screenName");
                Intrinsics.checkNotNullParameter(product, "product");
                int[] nArray = el1$a.$EnumSwitchMapping$0;
                int n4 = object.ordinal();
                n4 = nArray[n4];
                int n7 = 1;
                string2 = "";
                if (n4 != n7 && (n4 == (n3 = 2) || n4 == (n3 = 3) || n4 != (n3 = 4))) break block2;
                object = product.getCode();
                if (object == null) break block3;
                n3 = 0;
                String string3 = "_";
                n4 = (int)(StringsKt.F((CharSequence)object, string3, false) ? 1 : 0);
                if (n4 == n7) break block2;
            }
            string2 = product.getCode();
        }
        return string2;
    }

    public static boolean i(Product serializable) {
        boolean bl2 = false;
        if (serializable != null && (serializable = serializable.getAdsData()) != null) {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean j() {
        z40_0.Companion.getClass();
        return z40$a.a((Context)el1_2.a).a.a("is_jio_ad_sdk_enabled");
    }

    public static boolean k() {
        boolean bl2;
        z40_0.Companion.getClass();
        Object object = a;
        Object object2 = z40$a.a((Context)object).a;
        String string2 = "is_ads_enable_plp";
        boolean bl3 = ((ao0_0)object2).a(string2);
        if (!bl3 && !(bl2 = ((ao0_0)(object = z40$a.a((Context)object).a)).a((String)(object2 = "is_ads_enable_slp")))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean l() {
        ld3_2 ld3_22;
        String string2;
        z40_0.Companion.getClass();
        Object object = z40$a.a((Context)el1_2.a).a;
        String string3 = "is_ads_enable_plp";
        boolean bl2 = ((ao0_0)object).a(string3);
        if (!bl2) return false;
        object = od3_2.a;
        int n3 = ((String)object).length();
        if (n3 == 0) {
            object = od3_2.a();
        }
        if ((n3 = (int)(s20.a ? 1 : 0)) != 0) return false;
        string3 = od3_2.a();
        n3 = (int)(Intrinsics.areEqual(string3, string2 = (ld3_22 = ld3_2.STORE_AJIOGRAM).getStoreId()) ? 1 : 0);
        if (n3 != 0) return false;
        string3 = ld3_22.getStoreId();
        bl2 = Intrinsics.areEqual(object, string3);
        if (!bl2) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean m() {
        ld3_2 ld3_22;
        String string2;
        z40_0.Companion.getClass();
        Object object = z40$a.a((Context)el1_2.a).a;
        String string3 = "is_ads_enable_slp";
        boolean bl2 = ((ao0_0)object).a(string3);
        if (!bl2) return false;
        object = od3_2.a;
        int n3 = ((String)object).length();
        if (n3 == 0) {
            object = od3_2.a();
        }
        if ((n3 = (int)(s20.a ? 1 : 0)) != 0) return false;
        string3 = od3_2.a();
        n3 = (int)(Intrinsics.areEqual(string3, string2 = (ld3_22 = ld3_2.STORE_AJIOGRAM).getStoreId()) ? 1 : 0);
        if (n3 != 0) return false;
        string3 = ld3_22.getStoreId();
        bl2 = Intrinsics.areEqual(object, string3);
        if (!bl2) return true;
        return false;
    }

    public static boolean n(String object) {
        boolean bl2;
        ld3_2 ld3_22;
        String string2;
        String string3;
        Object object2 = od3_2.a;
        int n3 = ((String)object2).length();
        if (n3 == 0) {
            object2 = od3_2.a();
        }
        if ((n3 = (int)(s20.a ? 1 : 0)) == 0 && (n3 = (int)(Intrinsics.areEqual(string3 = od3_2.a(), string2 = (ld3_22 = ld3_2.STORE_AJIOGRAM).getStoreId()) ? 1 : 0)) == 0 && !(bl2 = Intrinsics.areEqual(object2, string3 = ld3_22.getStoreId()))) {
            object2 = ProductsList.Companion.getSEARCH_PAGE();
            boolean bl3 = kotlin.text.b.i((String)object, (String)object2, false);
            object2 = a;
            if (bl3) {
                z40_0.Companion.getClass();
                object = z40$a.a((Context)object2).a;
                object2 = "is_banner_ad_enabled_slp";
                bl3 = ((ao0_0)object).a((String)object2);
            } else {
                z40_0.Companion.getClass();
                object = z40$a.a((Context)object2).a;
                object2 = "is_banner_ad_enabled_plp";
                bl3 = ((ao0_0)object).a((String)object2);
            }
            return bl3;
        }
        return false;
    }
}

