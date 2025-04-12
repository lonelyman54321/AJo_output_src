/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zZ
 */
public final class zz_2 {
    public static final NewCustomEventsRevamp a = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();

    /*
     * Unable to fully structure code
     */
    public static void a(Product var0) {
        var1_1 = var0;
        Intrinsics.checkNotNullParameter(var0, "product");
        var2_2 = var0.getFnlColorVariantData();
        var3_3 = null;
        if (var2_2 == null) ** GOTO lbl-1000
        var2_2 = var0.getFnlColorVariantData();
        if (var2_2 != null) {
            var2_2 = var2_2.getColorGroup();
        } else {
            var4_4 = false;
            var2_2 = null;
        }
        var4_4 = TextUtils.isEmpty((CharSequence)var2_2);
        if (!var4_4) {
            var2_2 = var0.getFnlColorVariantData();
            Intrinsics.checkNotNull(var2_2);
            var2_2 = var2_2.getColorGroup();
            Intrinsics.checkNotNull(var2_2);
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = "";
        }
        var5_5 = AnalyticsManager.Companion;
        var6_6 = var5_5.getInstance().getNewEEcommerceEventsRevamp().trimProductId((String)var2_2)[0];
        if (var6_6 != null) {
            var2_2 = var6_6;
        }
        if ((var6_6 = var0.getFnlColorVariantData()) != null) {
            var3_3 = var6_6.getBrandName();
        }
        var1_1 = var0.getBrickCategory();
        var7_7 = px1_2.b("product_id", (String)var2_2, "product_brand", var3_3);
        var7_7.putString("product_category", (String)var1_1);
        var8_8 = var5_5.getInstance().getGtmEvents().getScreenName();
        var9_9 = av_0.a(var5_5);
        var10_10 = bv_0.a(var5_5);
        var11_11 = cv_0.a(var5_5);
        NewCustomEventsRevamp.newPushCustomEvent$default(zz_2.a, "product details interactions", "notification cta click", "successful", "product_details_interactions", var8_8, var9_9, var10_10, var7_7, var11_11, false, null, 1536, null);
    }

    /*
     * Unable to fully structure code
     */
    public static void b(Product var0, String var1_1) {
        var2_2 = var0;
        Intrinsics.checkNotNullParameter(var0, "product");
        Intrinsics.checkNotNullParameter(var1_1, "message");
        var3_3 = var0.getFnlColorVariantData();
        var4_4 = null;
        if (var3_3 == null) ** GOTO lbl-1000
        var3_3 = var0.getFnlColorVariantData();
        if (var3_3 != null) {
            var3_3 = var3_3.getColorGroup();
        } else {
            var5_5 = false;
            var3_3 = null;
        }
        var5_5 = TextUtils.isEmpty((CharSequence)var3_3);
        if (!var5_5) {
            var3_3 = var0.getFnlColorVariantData();
            Intrinsics.checkNotNull(var3_3);
            var3_3 = var3_3.getColorGroup();
            Intrinsics.checkNotNull(var3_3);
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = "";
        }
        var6_6 = AnalyticsManager.Companion;
        var7_7 = var6_6.getInstance().getNewEEcommerceEventsRevamp().trimProductId((String)var3_3);
        var8_8 = null;
        var7_7 = var7_7[0];
        if (var7_7 != null) {
            var3_3 = var7_7;
        }
        if ((var7_7 = var0.getFnlColorVariantData()) != null) {
            var4_4 = var7_7.getBrandName();
        }
        var2_2 = var0.getBrickCategory();
        var9_9 = px1_2.b("product_id", (String)var3_3, "product_brand", var4_4);
        var9_9.putString("product_category", (String)var2_2);
        var8_8 = var6_6.getInstance().getGtmEvents().getScreenName();
        var10_10 = av_0.a(var6_6);
        var11_11 = bv_0.a(var6_6);
        var12_12 = cv_0.a(var6_6);
        NewCustomEventsRevamp.newPushCustomEvent$default(zz_2.a, "product details interactions", "notification toast impresssion", var1_1, "product_details_interactions", var8_8, var10_10, var11_11, var9_9, var12_12, false, null, 1536, null);
    }
}

