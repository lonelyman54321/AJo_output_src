/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.pdprefresh.data.PDPSizeChartBricks;
import com.ril.ajio.services.data.Closet.Sizechart;
import com.ril.ajio.services.data.Closet.WishlistSizeChartResponse;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class yW
implements View.OnClickListener {
    public final /* synthetic */ aw_1 a;
    public final /* synthetic */ WishlistSizeChartResponse b;
    public final /* synthetic */ Product c;

    public /* synthetic */ yW(aw_1 aw_12, WishlistSizeChartResponse wishlistSizeChartResponse, Product product) {
        this.a = aw_12;
        this.b = wishlistSizeChartResponse;
        this.c = product;
    }

    /*
     * Unable to fully structure code
     */
    public final void onClick(View var1_1) {
        var2_2 = this;
        var3_3 = 0;
        var4_4 = null;
        var5_5 = 6;
        var6_6 = true;
        var7_7 = this.a;
        Intrinsics.checkNotNullParameter(var7_7, "this$0");
        var8_8 = this.c;
        Intrinsics.checkNotNullParameter(var8_8, "$mProduct");
        var7_7.getClass();
        var9_9 = var8_8.getBaseOptions();
        if (var9_9 != null && (var9_9 = (ProductOption)CollectionsKt.firstOrNull((List)var9_9)) != null && (var9_9 = var9_9.getOptions()) != null && (var9_9 = (ProductOptionItem)CollectionsKt.firstOrNull((List)var9_9)) != null && (var9_9 = var9_9.getAttributes()) != null) {
            block18: {
                var9_9 = ((Iterable)var9_9).iterator();
                while (var10_10 = var9_9.hasNext()) {
                    var12_12 = var11_11 = var9_9.next();
                    var12_12 = ((ProductOptionVariant)var11_11).getAttributeName();
                    var14_14 = Intrinsics.areEqual(var12_12, var13_13 = "categoryDesc");
                    if (!var14_14) continue;
                    break block18;
                }
                var10_10 = false;
                var11_11 = null;
            }
            var11_11 = (ProductOptionVariant)var11_11;
        } else {
            var10_10 = false;
            var11_11 = null;
        }
        var9_9 = var11_11 != null && (var9_9 = var11_11.getAttributeValue()) != null && (var15_15 = var9_9.equalsIgnoreCase((String)(var11_11 = "clothing"))) == var6_6 ? "YES" : "NO";
        var11_11 = var2_2.b;
        if (var11_11 != null) {
            var12_12 = var11_11.getApplicationName();
        } else {
            var14_14 = false;
            var12_12 = null;
        }
        var12_12 = aw_1.Oa((String)var12_12);
        var13_13 = var11_11 != null ? var11_11.getBrickCode() : null;
        var13_13 = aw_1.Oa(var13_13);
        var16_16 = var11_11 != null ? var11_11.getBrandCode() : null;
        var16_16 = aw_1.Oa(var16_16);
        var17_17 = var11_11 != null ? var11_11.getVendorCode() : null;
        var17_17 = aw_1.Oa(var17_17);
        var18_18 = var11_11 != null ? var11_11.getFittingType() : null;
        var18_18 = aw_1.Oa(var18_18);
        var19_19 = var11_11 != null ? var11_11.getStyleType() : null;
        var19_19 = aw_1.Oa(var19_19);
        if (var11_11 != null && (var11_11 = var11_11.getSizechart()) != null && (var11_11 = (Sizechart)CollectionsKt.firstOrNull((List)var11_11)) != null) {
            var11_11 = var11_11.getGender();
        } else {
            var10_10 = false;
            var11_11 = null;
        }
        var11_11 = aw_1.Oa((String)var11_11);
        var20_20 = var8_8.getCode();
        if (var20_20 == null) ** GOTO lbl-1000
        var21_21 = "_";
        var22_22 = new String[]{var21_21};
        if ((var22_22 = StringsKt.a0((CharSequence)var20_20, (String[])var22_22, false, 0, var5_5)) != null) {
            var22_22 = (String)CollectionsKt.firstOrNull((List)var22_22);
        } else lbl-1000:
        // 2 sources

        {
            var22_22 = null;
        }
        var22_22 = aw_1.Oa(var22_22);
        var20_20 = var8_8.getBaseOptions();
        if (var20_20 != null && (var20_20 = (ProductOption)CollectionsKt.firstOrNull((List)var20_20)) != null && (var20_20 = var20_20.getOptions()) != null && (var20_20 = (ProductOptionItem)CollectionsKt.firstOrNull((List)var20_20)) != null && (var20_20 = var20_20.getAttributes()) != null) {
            block19: {
                var20_20 = ((Iterable)var20_20).iterator();
                while (var23_23 = var20_20.hasNext()) {
                    var24_25 = var21_21 = var20_20.next();
                    var24_25 = (ProductOptionVariant)var21_21;
                    var25_26 = var24_25.getAttributeName();
                    var5_5 = (int)Intrinsics.areEqual(var25_26, var26_27 = "season");
                    if (var5_5 == 0) {
                        var5_5 = 6;
                        var6_6 = true;
                        continue;
                    }
                    break block19;
                }
                var23_23 = false;
                var21_21 = null;
            }
            var21_21 = (ProductOptionVariant)var21_21;
        } else {
            var23_24 = false;
            var21_21 = null;
        }
        if (var21_21 != null) {
            var25_26 = var21_21.getAttributeValue();
        } else {
            var5_5 = 0;
            var25_26 = null;
        }
        var25_26 = aw_1.Oa((String)var25_26);
        var26_27 = UrlHelper.Companion.getInstance();
        var27_28 = 10;
        var20_20 = new Object[var27_28];
        var20_20[0] = var12_12;
        var20_20[1] = var13_13;
        var20_20[2] = var16_16;
        var20_20[3] = var22_22;
        var20_20[4] = var11_11;
        var20_20[5] = var9_9;
        var20_20[6] = var25_26;
        var20_20[7] = var17_17;
        var20_20[8] = var18_18;
        var3_3 = 9;
        var20_20[var3_3] = var19_19;
        var4_4 = var26_27.getApiUrl("pdp", "size_guide_data", (Object[])var20_20);
        var25_26 = var8_8.getBaseOptions();
        if (var25_26 == null || (var25_26 = (ProductOption)CollectionsKt.firstOrNull((List)var25_26)) == null || (var25_26 = var25_26.getOptions()) == null || (var25_26 = (ProductOptionItem)CollectionsKt.firstOrNull((List)var25_26)) == null || (var25_26 = var25_26.getSizeDisplayType()) == null) {
            var25_26 = var8_8.getVariantOptions();
            var22_22 = var25_26 != null && (var25_26 = (ProductOptionItem)CollectionsKt.firstOrNull((List)var25_26)) != null && (var25_26 = var25_26.getVariantOptionQualifiers()) != null && (var25_26 = (ProductOptionVariant)CollectionsKt.firstOrNull((List)var25_26)) != null ? var25_26.getValue() : null;
            var25_26 = var22_22 == null ? "BRAND" : var22_22;
        }
        var6_6 = hv3_0.Y();
        var9_9 = new StringBuilder();
        var9_9.append(var4_4);
        var9_9.append("&standardSizeFlag=");
        var9_9.append(var6_6);
        var9_9.append("&sizeDisplayType=");
        var9_9.append((String)var25_26);
        var4_4 = var9_9.toString();
        var25_26 = z40_0.Companion;
        var25_26 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var25_26).a.b("howToMeasureSizeGuidePosition");
        var4_4 = n1.a(var4_4, "&howToMeasureSizeGuidePosition=", (String)var25_26);
        var25_26 = h40_0.a;
        var25_26 = h40_0.V();
        var25_26 = ((PDPSizeChartBricks)Z90.a(PDPSizeChartBricks.class, (String)var25_26)).isShowNewSizeGuideImage();
        var26_27 = Boolean.TRUE;
        var5_5 = (int)Intrinsics.areEqual(var25_26, var26_27);
        if (var5_5 != 0) {
            cp_1.Companion.getClass();
            var25_26 = cp$a.e();
            var25_26.getClass();
            var5_5 = (int)cp_1.E((Product)var8_8);
            if (var5_5 != 0) {
                var25_26 = "&isShowNewSizeGuideImage=yes";
                var4_4 = Ft2.a(var4_4, (String)var25_26);
            }
        }
        var25_26 = new Bundle();
        var9_9 = var8_8.getCode();
        var25_26.putString("product_id", (String)var9_9);
        var9_9 = var8_8.getName();
        var25_26.putString("product_name", (String)var9_9);
        var26_27 = AnalyticsManager.Companion;
        var26_27.getInstance().getGtmEvents().pushOpenScreenEvent("size guide screen", (Bundle)var25_26);
        var25_26 = var26_27.getInstance().getGtmEvents();
        var9_9 = "Size Guide";
        ak0_0.a((AnalyticsManager$Companion)var26_27, (GTMEvents)var25_26, (String)var9_9, (String)var9_9);
        var25_26 = CustomWebViewActivity.Companion;
        var26_27 = var7_7.requireContext();
        Intrinsics.checkNotNullExpressionValue(var26_27, "requireContext(...)");
        var9_9 = var8_8.getCode();
        var8_8 = var8_8.getName();
        var25_26.getClass();
        CustomWebViewActivity$a.c((Context)var26_27, var7_7, var4_4, (String)var9_9, (String)var8_8);
    }
}

