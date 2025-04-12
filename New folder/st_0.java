/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.AppsFlyerEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.enum.AppsFlyerEventsItem;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar$DisplayMode;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Home.BottomNavigationData;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserProfileData;
import io.reactivex.Scheduler;
import java.net.URLDecoder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from sT
 */
public final class st_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ st_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object var1_1) {
        var2_2 = this;
        var3_3 = "";
        var4_4 = "this$0";
        var5_8 = this.b;
        var6_9 = 0;
        var7_10 = null;
        var8_11 = 1;
        var9_12 = this.a;
        switch (var9_12) {
            default: {
                var10_13 /* !! */  = var1_1;
                var10_13 /* !! */  = (DataCallback)var1_1;
                var5_8 = (NewProductDetailsFragment)var5_8;
                Intrinsics.checkNotNullParameter(var5_8, (String)var4_4);
                Intrinsics.checkNotNullParameter(var10_13 /* !! */ , "productDataCallback");
                var4_4 = cp_1.Companion;
                var11_14 = nn_2.b((cp$a)var4_4, (DataCallback)var10_13 /* !! */ );
                if (var11_14 == 0) ** GOTO lbl739
                var4_4 = var5_8.h;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                    var11_14 = 0;
                    var12_16 = 0.0f;
                    var4_4 = null;
                }
                var4_4.stopLoader();
                var11_14 = var10_13 /* !! */ .getStatus();
                var13_17 = "format(...)";
                if (var11_14 != 0) ** GOTO lbl724
                var4_4 = var10_13 /* !! */ .getData();
                var10_13 /* !! */  = var4_4;
                var10_13 /* !! */  = (Product)var4_4;
                if (var10_13 /* !! */  != null && (var11_14 = (int)kotlin.text.b.i((String)(var4_4 = var10_13 /* !! */ .getResponseStatus()), (String)(var14_18 = "FAILURE"), (boolean)var8_11)) == 0) ** GOTO lbl48
                var15_19 = var10_13 /* !! */ ;
                var4_4 = StringCompanionObject.INSTANCE;
                var11_14 = R$string.acc_alert_message;
                var4_4 = hv3_0.K(var11_14);
                var2_2 = hv3_0.K(R$string.pdp_details_not_available);
                var30_36 = 1;
                var7_10 = new Object[var30_36];
                var8_11 = 0;
                var26_32 = null;
                var7_10[0] = var2_2;
                var4_4 = xh2_0.a((Object[])var7_10, var30_36, (String)var4_4, (String)var13_17);
                var42_48 = R$string.pdp_details_not_available;
                var2_2 = var5_8.getString((int)var42_48);
                var5_8.showNotification((String)var2_2, (String)var4_4);
                ** GOTO lbl597
lbl48:
                // 1 sources

                var4_4 = tr2_2.a;
                var11_14 = (int)tr2_2.u(var5_8.f1);
                if (var11_14 != 0) {
                    var4_4 = var10_13 /* !! */ .getSaleStartTime();
                    var13_17 = var10_13 /* !! */ .getSaleEndTime();
                    tr2_2.B((Long)var4_4, (Long)var13_17);
                }
                if ((var4_4 = var10_13 /* !! */ .getPrice()) != null && (var4_4 = var4_4.getSegmentId()) != null) {
                    var10_13 /* !! */ .setSegmentId((String)var4_4);
                }
                if ((var4_4 = var10_13 /* !! */ .getPrice()) != null && (var4_4 = var4_4.getExperimentId()) != null) {
                    var10_13 /* !! */ .setExperimentId((String)var4_4);
                }
                var5_8.cb().r0 = var8_11;
                var4_4 = var5_8.N;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pdpMainLayout");
                    var11_14 = 0;
                    var12_16 = 0.0f;
                    var4_4 = null;
                }
                var4_4.setVisibility(0);
                var4_4 = var5_8.s0;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("footerViewParent");
                    var11_14 = 0;
                    var12_16 = 0.0f;
                    var4_4 = null;
                }
                var16_20 = var5_8.H0();
                var17_21 = 8;
                if (var16_20 != 0) {
                    var16_20 = 8;
                } else {
                    var16_20 = 0;
                    var13_17 = null;
                }
                var4_4.setVisibility(var16_20);
                var4_4 = var5_8.r0;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("footerView");
                    var11_14 = 0;
                    var12_16 = 0.0f;
                    var4_4 = null;
                }
                if ((var16_20 = (int)var5_8.H0()) == 0) {
                    var17_21 = 0;
                    var14_18 = null;
                }
                var4_4.setVisibility(var17_21);
                var4_4 = var5_8.O;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPDPShimmerLayout");
                    var11_14 = 0;
                    var12_16 = 0.0f;
                    var4_4 = null;
                }
                hv3_0.s0((ShimmerFrameLayout)var4_4);
                var5_8.Pb((Product)var10_13 /* !! */ );
                var4_4 = var5_8.cb();
                var13_17 = var10_13 /* !! */ .getUserGroup();
                if (var13_17 != null) {
                    var4_4.f1 = var13_17;
                } else {
                    var4_4.getClass();
                }
                var13_17 = var5_8.cb();
                var4_4 = var5_8.R;
                if (var4_4 != null) {
                    var14_18 = var4_4 = var4_4.m;
                } else {
                    var17_21 = 0;
                    var14_18 = null;
                }
                var18_22 = var5_8.ua();
                var4_4 = URLDecoder.decode(var10_13 /* !! */ .getLastSavedCohort(), "UTF-8");
                Intrinsics.checkNotNullExpressionValue(var4_4, "decode(...)");
                var13_17.getClass();
                Intrinsics.checkNotNullParameter(var4_4, "lastSavedCohort");
                var19_23 = new Bundle();
                var20_24 = var13_17.j;
                var20_24.addCohortLInkData(var19_23, (String)var4_4);
                var21_25 = hv3_0.Y();
                var19_23.putBoolean("standard_size_guide", (boolean)var21_25);
                var4_4 = var13_17.q;
                if (var4_4 != null) {
                    var4_4 = var4_4.getCode();
                } else {
                    var11_14 = 0;
                    var12_16 = 0.0f;
                    var4_4 = null;
                }
                var19_23.putString("product_color", (String)var4_4);
                var20_24 = var13_17.v0;
                var4_4 = String.valueOf(var20_24.size());
                var19_23.putString("product_no_variant", (String)var4_4);
                var11_14 = (int)var13_17.u();
                var22_26 = "OutOfStock";
                var23_27 = "cta_disabled";
                if (var11_14 == 0) {
                    var19_23.putString(var23_27, var22_26);
                }
                var4_4 = var13_17.w;
                var24_28 = "substring(...)";
                var25_29 = "0";
                var7_10 = "no_of_size_available";
                var26_32 = "none";
                var2_2 = "pdp_size_available";
                var15_19 = var10_13 /* !! */ ;
                var10_13 /* !! */  = ",";
                if (var4_4 == null || (var11_14 = var4_4.length()) == 0) {
                    var27_33 = var5_8;
                    var28_34 = var14_18;
                    var19_23.putString((String)var2_2, (String)var26_32);
                    var19_23.putString((String)var7_10, (String)var25_29);
                } else {
                    var4_4 = var13_17.w;
                    Intrinsics.checkNotNull(var4_4);
                    var27_33 = var5_8;
                    var5_8 = var13_17.w;
                    Intrinsics.checkNotNull(var5_8);
                    var29_35 = var5_8.length() + -1;
                    var28_34 = var14_18;
                    var17_21 = 0;
                    var14_18 = null;
                    var4_4 = var4_4.substring(0, var29_35);
                    Intrinsics.checkNotNullExpressionValue(var4_4, (String)var24_28);
                    var13_17.w = var4_4;
                    var19_23.putString((String)var2_2, (String)var4_4);
                    var4_4 = var13_17.w;
                    if (var4_4 != null) {
                        var2_2 = new String[]{var10_13 /* !! */ };
                        var29_35 = 6;
                        var4_4 = StringsKt.a0((CharSequence)var4_4, (String[])var2_2, false, 0, var29_35);
                    } else {
                        var11_14 = 0;
                        var12_16 = 0.0f;
                        var4_4 = null;
                    }
                    Intrinsics.checkNotNull(var4_4);
                    var11_14 = var4_4.size();
                    var4_4 = String.valueOf(var11_14);
                    var19_23.putString((String)var7_10, (String)var4_4);
                }
                var4_4 = var13_17.v;
                var2_2 = "no_of_size_disabled";
                var5_8 = "pdp_size_disabled";
                if (var4_4 != null && (var11_14 = var4_4.length()) != 0) {
                    var4_4 = var13_17.v;
                    Intrinsics.checkNotNull(var4_4);
                    var25_29 = var13_17.v;
                    Intrinsics.checkNotNull(var25_29);
                    var30_36 = var25_29.length() - 1;
                    var6_9 = 0;
                    var7_10 = null;
                    var4_4 = var4_4.substring(0, var30_36);
                    Intrinsics.checkNotNullExpressionValue(var4_4, (String)var24_28);
                    var13_17.v = var4_4;
                    var19_23.putString((String)var5_8, (String)var4_4);
                    var4_4 = var13_17.v;
                    if (var4_4 != null) {
                        var25_29 = new String[]{var10_13 /* !! */ };
                        var29_35 = 6;
                        var4_4 = StringsKt.a0((CharSequence)var4_4, (String[])var25_29, false, 0, var29_35);
                    } else {
                        var11_14 = 0;
                        var12_16 = 0.0f;
                        var4_4 = null;
                    }
                    Intrinsics.checkNotNull(var4_4);
                    var11_14 = var4_4.size();
                    var4_4 = String.valueOf(var11_14);
                    var19_23.putString((String)var2_2, (String)var4_4);
                } else {
                    var19_23.putString((String)var5_8, (String)var26_32);
                    var19_23.putString((String)var2_2, (String)var25_29);
                }
                var2_2 = "not visible";
                var25_29 = var18_22 != 0 ? (var4_4 = "visible") : var2_2;
                var5_8 = "bbs_widget";
                var19_23.putString((String)var5_8, (String)var25_29);
                var19_23.putString("bbs_banner", (String)var25_29);
                var11_14 = var13_17.d().d();
                var19_23.putInt("number_of_items_on_cart", var11_14);
                var7_10 = "product";
                var19_23.putString("ecomm_pageType", (String)var7_10);
                var4_4 = var13_17.q;
                if (var4_4 != null) {
                    var4_4 = var4_4.getCode();
                } else {
                    var11_14 = 0;
                    var12_16 = 0.0f;
                    var4_4 = null;
                }
                var26_32 = "ecomm_prodid";
                var19_23.putString((String)var26_32, (String)var4_4);
                var31_38 = 0.0;
                try {
                    var4_4 = var13_17.q;
                    if (var4_4 == null || (var4_4 = var4_4.getPrice()) == null) ** GOTO lbl236
                    var4_4 = var4_4.getValue();
                    ** GOTO lbl239
                }
                catch (NumberFormatException var4_5) {
                    ** GOTO lbl242
                }
lbl236:
                // 1 sources

                var11_14 = 0;
                var12_16 = 0.0f;
                var4_4 = null;
lbl239:
                // 2 sources

                if (var4_4 != null && (var4_4 = var13_17.q) != null && (var4_4 = var4_4.getPrice()) != null && (var4_4 = var4_4.getValue()) != null) {
                    var31_38 = Double.parseDouble((String)var4_4);
                }
                ** GOTO lbl244
lbl242:
                // 1 sources

                var26_32 = yn3_0.a;
                var26_32.e(var4_5);
lbl244:
                // 2 sources

                var26_32 = String.valueOf(var31_38);
                var19_23.putString("ecomm_total_value", (String)var26_32);
                var4_4 = e12_0.i(var13_17.F);
                var26_32 = var13_17.q;
                if (var26_32 != null) {
                    var26_32.setProductTD((String)var4_4);
                }
                var19_23.putString("pdp_td", (String)var4_4);
                var26_32 = "bbs_widget_state";
                var24_28 = "sale price revealed";
                var14_18 = "product_id";
                if (var18_22 == 0 || (var33_39 /* !! */  = var13_17.q) == null) ** GOTO lbl330
                var34_40 = var33_39 /* !! */ .getFutureBestPrice();
                var35_41 = -1.0f;
                if (var34_40 != null) {
                    var36_42 = var34_40.floatValue();
                } else {
                    var37_43 = -1082130432;
                    var36_42 = -1.0f;
                }
                var37_43 = (int)(var36_42 == var35_41 ? 0 : (var36_42 < var35_41 ? -1 : 1));
                if (var37_43 == 0) {
                    var38_44 = var20_24;
                    var39_45 = "sale price not revealed and sale price not available";
                    var34_40 = var7_10;
                    var7_10 = var39_45;
                } else {
                    var34_40 = var7_10;
                    var6_9 = var13_17.I0;
                    var38_44 = var20_24;
                    var21_25 = 1;
                    var40_46 = 1.4E-45f;
                    var7_10 = var6_9 == var21_25 ? "sale price not revealed" : var24_28;
                }
                var19_23.putString((String)var26_32, (String)var7_10);
                var7_10 = var13_17.q;
                if (var7_10 != null) {
                    var7_10 = var7_10.getCode();
                } else {
                    var6_9 = 0;
                    var7_10 = null;
                }
                var19_23.putString((String)var14_18, (String)var7_10);
                if (var4_4 == null) ** GOTO lbl291
                try {
                    var12_16 = Float.parseFloat((String)var4_4);
                    var4_4 = Float.valueOf(var12_16);
                    ** GOTO lbl294
                }
                catch (Exception var4_6) {
                    var7_10 = yn3_0.a;
                    var7_10.e(var4_6);
                }
lbl291:
                // 2 sources

                var11_14 = 0;
                var12_16 = 0.0f;
                var4_4 = null;
lbl294:
                // 2 sources

                var6_9 = 0;
                var7_10 = null;
                if (var4_4 != null) {
                    var40_46 = var12_16 = var4_4.floatValue();
                } else {
                    var21_25 = 0;
                    var40_46 = 0.0f;
                    var20_24 = null;
                }
                var4_4 = var33_39 /* !! */ .getFutureDiscountPercent();
                if (var4_4 == null) ** GOTO lbl311
                try {
                    var12_16 = Float.parseFloat((String)var4_4);
                    var4_4 = Float.valueOf(var12_16);
                    ** GOTO lbl314
                }
                catch (Exception var4_7) {
                    var33_39 /* !! */  = yn3_0.a;
                    var33_39 /* !! */ .e(var4_7);
                }
lbl311:
                // 2 sources

                var11_14 = 0;
                var12_16 = 0.0f;
                var4_4 = null;
lbl314:
                // 2 sources

                if (var4_4 != null) {
                    var12_16 = var4_4.floatValue();
                } else {
                    var11_14 = 0;
                    var12_16 = 0.0f;
                    var4_4 = null;
                }
                var18_22 = (cfr_temp_0 = var12_16 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                var33_39 /* !! */  = var18_22 > 0 ? String.valueOf(var12_16) : var3_3;
                var19_23.putString("sale_discount", (String)var33_39 /* !! */ );
                var7_10 = null;
                cfr_temp_1 = (var12_16 -= var40_46) - 0.0f;
                var6_9 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                var4_4 = var6_9 > 0 ? String.valueOf(var12_16) : var3_3;
                var7_10 = "sale_delta";
                var19_23.putString((String)var7_10, (String)var4_4);
                ** GOTO lbl332
lbl330:
                // 1 sources

                var34_40 = var7_10;
                var38_44 = var20_24;
lbl332:
                // 2 sources

                var4_4 = CustomerStoreType.a;
                var4_4 = od3_2.a();
                var7_10 = ScreenType.SCREEN_PDP;
                var4_4 = CustomerStoreType.a((String)var4_4, (ScreenType)var7_10);
                var11_14 = (int)mz3_0.y((String)var4_4);
                if (var11_14 != 0 && (var11_14 = (int)ww0_2.c()) != 0 && (var4_4 = tr2_2.c) == (var7_10 = qr2_1.PRE_SALE)) {
                    var19_23.putString((String)var5_8, (String)var2_2);
                    var19_23.putString((String)var26_32, (String)var24_28);
                }
                if ((var4_4 = var13_17.q) != null) {
                    var4_4 = var4_4.getCode();
                } else {
                    var11_14 = 0;
                    var12_16 = 0.0f;
                    var4_4 = null;
                }
                var19_23.putString((String)var14_18, (String)var4_4);
                var4_4 = var13_17.K;
                var2_2 = "product_name";
                var19_23.putString((String)var2_2, (String)var4_4);
                var5_8 = var13_17.Q;
                var19_23.putString("product_size", (String)var5_8);
                var4_4 = var13_17.q;
                if (var4_4 != null) {
                    var4_4 = var4_4.getBrandName();
                } else {
                    var11_14 = 0;
                    var12_16 = 0.0f;
                    var4_4 = null;
                }
                var5_8 = "product_brand";
                var19_23.putString((String)var5_8, (String)var4_4);
                var4_4 = var13_17.f1;
                if (var4_4 != null && (var11_14 = var4_4.length()) > 0) {
                    var4_4 = "akamai_personalization";
                    var5_8 = var13_17.f1;
                    var19_23.putString((String)var4_4, (String)var5_8);
                }
                if ((var29_35 = (var4_4 = od3_2.a).length()) == 0) {
                    var4_4 = od3_2.a();
                }
                var29_35 = (int)s20.a;
                var7_10 = "pdp screen";
                if (var29_35 != 0 || (var29_35 = (int)Intrinsics.areEqual(var5_8 = od3_2.a(), var24_28 = (var26_32 = ld3_2.STORE_AJIOGRAM).getStoreId())) != 0 || (var11_14 = (int)Intrinsics.areEqual(var4_4, var5_8 = var26_32.getStoreId())) != 0) {
                    var4_4 = var13_17.q;
                    if (var4_4 != null) {
                        var4_4 = var4_4.getBrandName();
                    } else {
                        var11_14 = 0;
                        var12_16 = 0.0f;
                        var4_4 = null;
                    }
                    var5_8 = "insert_";
                    var26_32 = "plp_source";
                    k01_0.a((String)var5_8, (String)var4_4, var19_23, (String)var26_32);
                    var4_4 = "screen_type";
                    var19_23.putString((String)var4_4, (String)var7_10);
                }
                if ((var4_4 = var13_17.q) != null && (var4_4 = var4_4.getProductVideos()) != null) {
                    var4_4 = var4_4.getVideos();
                } else {
                    var11_14 = 0;
                    var12_16 = 0.0f;
                    var4_4 = null;
                }
                var5_8 = "is_video_available";
                if (var4_4 != null) {
                    var4_4 = "yes";
                    var19_23.putString((String)var5_8, (String)var4_4);
                } else {
                    var4_4 = "no";
                    var19_23.putString((String)var5_8, (String)var4_4);
                }
                AnalyticsManager.Companion.getInstance().getGtmEvents().pushOpenScreenEvent((String)var7_10, var19_23);
                var4_4 = new Bundle();
                var5_8 = var13_17.q;
                if (var5_8 == null || (var5_8 = var5_8.getName()) == null) {
                    var5_8 = var3_3;
                }
                var4_4.putString((String)var2_2, (String)var5_8);
                var2_2 = var13_17.q;
                if (var2_2 == null || (var2_2 = var2_2.getCode()) == null) {
                    var2_2 = var3_3;
                }
                var4_4.putString((String)var14_18, (String)var2_2);
                var2_2 = new StringBuilder();
                var5_8 = var13_17.C;
                if (var5_8 != null && (var6_9 = (int)var5_8.isEmpty()) == 0) {
                    var6_9 = var5_8.size();
                    var26_32 = null;
                    for (var8_11 = 0; var8_11 < var6_9; var8_11 += var41_47) {
                        if (var8_11 > 0) {
                            var2_2.append((String)var10_13 /* !! */ );
                        }
                        var24_28 = ((ProductOptionVariant)var5_8.get(var8_11)).getSizeValue();
                        var2_2.append((String)var24_28);
                        var2_2.append((String)var10_13 /* !! */ );
                        var24_28 = (ProductOptionVariant)var5_8.get(var8_11);
                        var41_47 = var24_28.getStockLevel();
                        var2_2.append(var41_47);
                        var41_47 = 1;
                    }
                }
                var2_2 = var2_2.toString();
                Intrinsics.checkNotNullExpressionValue(var2_2, "toString(...)");
                var5_8 = "inventory";
                var4_4.putString((String)var5_8, (String)var2_2);
                var42_48 = var13_17.u();
                if (!var42_48) {
                    var4_4.putString(var23_27, var22_26);
                }
                if ((var2_2 = var13_17.q) == null || (var2_2 = var2_2.getPrice()) == null || (var2_2 = var2_2.getValue()) == null) {
                    var2_2 = var3_3;
                }
                var5_8 = "best_price_visibility";
                var4_4.putString((String)var5_8, (String)var2_2);
                var4_4.putString("widget", (String)var25_29);
                var4_4.putString("first_coupon_shown", (String)var3_3);
                var25_29 = var13_17.w;
                var4_4.putString("number_of_size_available", (String)var25_29);
                var25_29 = var13_17.v;
                var4_4.putString("number_of_size_oos", (String)var25_29);
                var4_4.putString("number_of_coupons_shown", (String)var3_3);
                var2_2 = var13_17.q;
                if (var2_2 != null && (var2_2 = var2_2.getPrice()) != null) {
                    var2_2 = var2_2.getValue();
                } else {
                    var42_48 = false;
                    var2_2 = null;
                }
                var25_29 = "product_mrp";
                var4_4.putString((String)var25_29, (String)var2_2);
                var2_2 = var13_17.q;
                if (var2_2 == null || (var2_2 = var2_2.getPrice()) == null || (var2_2 = var2_2.getValue()) == null) {
                    var2_2 = var3_3;
                }
                var4_4.putString("product_selling_price", (String)var2_2);
                var2_2 = e12_0.i(var13_17.F);
                var4_4.putString("product_trade_discount", (String)var2_2);
                var2_2 = var13_17.l;
                var25_29 = var13_17.m;
                var5_8 = var13_17.k;
                var43_50 = "pdp screen";
                var44_51 = "pdp screen";
                var45_52 = var5_8;
                var46_53 = var2_2;
                var47_54 = var4_4;
                var48_55 = var25_29;
                var5_8.newPushCustomScreenView(var43_50, var44_51, (String)var2_2, (Bundle)var4_4, (String)var25_29);
                var4_4 = new Bundle();
                var2_2 = var13_17.k;
                var25_29 = var2_2.getPRODUCT_ID();
                var5_8 = var13_17.q;
                if (var5_8 == null || (var5_8 = var5_8.getCode()) == null) {
                    var5_8 = var3_3;
                }
                var4_4.putString((String)var25_29, (String)var5_8);
                var25_29 = var2_2.getPRODUCT_BRAND();
                var5_8 = var13_17.q;
                if (var5_8 == null || (var5_8 = var5_8.getBrandName()) == null) {
                    var5_8 = var3_3;
                }
                var4_4.putString((String)var25_29, (String)var5_8);
                var30_36 = var38_44.size();
                var29_35 = 1;
                var25_29 = var30_36 > var29_35 ? "available" : "not available";
                var49_56 = var25_29;
                var47_54 = var2_2.getEC_PRODUCT_DETAILS_INTERACTIONS();
                var25_29 = var13_17.l;
                var5_8 = var13_17.m;
                var50_57 = 1536;
                var48_55 = "color swatch";
                var51_58 = "product_details_interactions";
                var52_59 = "pdp screen";
                var53_60 = "pdp screen";
                var46_53 = var2_2;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var2_2, (String)var47_54, (String)var48_55, (String)var49_56, var51_58, var52_59, var53_60, (String)var25_29, (Bundle)var4_4, (String)var5_8, false, null, var50_57, null);
                var4_4 = var13_17.q;
                if (var4_4 != null) {
                    var2_2 = el1_2.a;
                    var2_2 = var34_40;
                    Intrinsics.checkNotNullParameter(var4_4, (String)var34_40);
                    var30_36 = (int)el1_2.j();
                    var29_35 = 3;
                    if (var30_36 != 0) {
                        var25_29 = el1_2.b;
                        var8_11 = 0;
                        var26_32 = null;
                        var7_10 = new pl1_1((Product)var4_4, null);
                        Ae3.d((i90_0)var25_29, null, null, (Function2)var7_10, var29_35);
                    }
                    if (var28_34 != null) {
                        var25_29 = "redirect";
                        var24_28 = var28_34;
                        var30_36 = (int)var28_34.equals(var25_29);
                        if (var30_36 == (var6_9 = 1)) {
                            Intrinsics.checkNotNullParameter(var4_4, (String)var2_2);
                            var2_2 = "searchString";
                            Intrinsics.checkNotNullParameter(var3_3, (String)var2_2);
                            var42_48 = el1_2.j();
                            if (var42_48) {
                                var2_2 = el1_2.b;
                                var6_9 = 0;
                                var7_10 = null;
                                var25_29 = new tl1_1((Product)var4_4, null);
                                Ae3.d((i90_0)var2_2, null, null, (Function2)var25_29, var29_35);
                            }
                        }
                    }
                }
                if ((var11_14 = (int)NewProductDetailsFragment.ub()) != 0 && (var11_14 = (int)var27_33.u7()) == 0) {
                    var4_4 = var27_33.cb();
                    var2_2 = var4_4.c1;
                    var2_2 = var4_4.h.c((zr1_1)var2_2);
                    var25_29 = qt2_2.c;
                    var2_2 = var2_2.h((Scheduler)var25_29);
                    var25_29 = ti_2.a();
                    var2_2 = var2_2.e((Scheduler)var25_29);
                    var25_29 = new Object();
                    var6_9 = 0;
                    var5_8 = new L02(0, (Function1)var25_29);
                    var25_29 = new m02_0(0);
                    var8_11 = 1;
                    var7_10 = new sq_1(var8_11, (Function1)var25_29);
                    var2_2 = var2_2.f((o60_0)var5_8, (o60_0)var7_10);
                    var4_4 = var4_4.e;
                    var4_4.b((yr0_2)var2_2);
                }
                if ((var11_14 = (int)var27_33.B5()) == 0 || (var11_14 = (int)var27_33.u7()) != 0) ** GOTO lbl561
                var4_4 = h40_0.a;
                var11_14 = (int)h40_0.A1();
                if (var11_14 == 0) ** GOTO lbl552
                var4_4 = var27_33.cb().E0;
                var5_8 = var27_33;
                var27_33.Ob((List)var4_4);
                var4_4 = var27_33.cb();
                var4_4.e();
                ** GOTO lbl562
lbl552:
                // 1 sources

                var5_8 = var27_33;
                var11_14 = (int)h40_0.B1();
                if (var11_14 != 0) {
                    var4_4 = var27_33.cb().E0;
                    var27_33.Ob((List)var4_4);
                } else {
                    var4_4 = var27_33.cb();
                    var4_4.e();
                }
                ** GOTO lbl562
lbl561:
                // 1 sources

                var5_8 = var27_33;
lbl562:
                // 4 sources

                var26_32 = var5_8.k;
                if (var26_32 == null) {
                    var4_4 = "homeListener";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                    var8_11 = 0;
                    var26_32 = null;
                }
                if ((var11_14 = (int)var26_32.M()) == 0) {
                    var5_8.e3();
                }
                var42_48 = true;
                var5_8.ob(var42_48);
                var4_4 = var5_8.R6();
                if (var4_4 != null) {
                    var4_4 = var5_8.R6();
                    if (var4_4 != null && (var4_4 = var4_4.getAggregateRating()) != null) {
                        var26_32 = var4_4.getAverageRating();
                    } else {
                        var8_11 = 0;
                        var26_32 = null;
                    }
                    if (var26_32 != null) {
                        var4_4 = LD2.a;
                        var4_4 = AnalyticsManager.Companion;
                        var44_51 = av_0.a((AnalyticsManager$Companion)var4_4);
                        var46_53 = av_0.a((AnalyticsManager$Companion)var4_4);
                        var47_54 = bv_0.a((AnalyticsManager$Companion)var4_4);
                        var49_56 = cv_0.a((AnalyticsManager$Companion)var4_4);
                        var27_33 = LD2.a;
                        var54_61 = 1536;
                        var28_34 = "reviews & ratings interactions";
                        var38_44 = "pdp ratings available";
                        var45_52 = "activation event";
                        var43_50 = "pdp_ratings_available";
                        var48_55 = null;
                        var51_58 = null;
                        var52_59 = null;
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var27_33, (String)var28_34, (String)var38_44, (String)var45_52, var43_50, var44_51, (String)var46_53, (String)var47_54, null, (String)var49_56, false, null, var54_61, null);
                    }
                }
lbl597:
                // 6 sources

                if ((var11_14 = (int)Intrinsics.areEqual(var4_4 = var5_8.o5(), var2_2 = ld3_2.STORE_AJIOGRAM.getStoreId())) != 0 && (var4_4 = var5_8.P4()) != null && (var4_4 = var4_4.getBrand()) != null && (var2_2 = var5_8.kb().getToolbar()) != null) {
                    var25_29 = AjioCustomToolbar$DisplayMode.BRAND_LOGO;
                    var2_2.setDisplayMode((AjioCustomToolbar$DisplayMode)var25_29);
                    var25_29 = var4_4.getName();
                    var2_2.setBrandName((String)var25_29);
                    var4_4 = var4_4.getLogo();
                    var2_2.setBrandLogo((String)var4_4);
                }
                if ((var26_32 = var5_8.J) == null) {
                    var4_4 = "addToCloset";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                    var8_11 = 0;
                    var26_32 = null;
                }
                var11_14 = R$string.added_wishlist_txt;
                if (var15_19 == null || (var2_2 = var15_19.getFnlColorVariantData()) == null || (var2_2 = var2_2.getBrandName()) == null) {
                    var2_2 = var3_3;
                }
                if (var15_19 == null || (var25_29 = var15_19.getName()) == null) {
                    var25_29 = var3_3;
                }
                var6_9 = 2;
                var10_13 /* !! */  = new Object[var6_9];
                var6_9 = 0;
                var7_10 = null;
                var10_13 /* !! */ [0] = var2_2;
                var42_48 = true;
                var10_13 /* !! */ [var42_48] = var25_29;
                var4_4 = hv3_0.L(var11_14, var10_13 /* !! */ );
                var26_32.setContentDescription((CharSequence)var4_4);
                var4_4 = var5_8.K;
                if (var4_4 != null) {
                    var42_48 = R$string.removed_wishlist_txt;
                    if (var15_19 == null || (var25_29 = var15_19.getFnlColorVariantData()) == null || (var25_29 = var25_29.getBrandName()) == null) {
                        var25_29 = var3_3;
                    }
                    if (var15_19 != null && (var7_10 = var15_19.getName()) != null) {
                        var3_3 = var7_10;
                    }
                    var6_9 = 2;
                    var7_10 = new Object[var6_9];
                    var8_11 = 0;
                    var26_32 = null;
                    var7_10[0] = var25_29;
                    var30_36 = 1;
                    var7_10[var30_36] = var3_3;
                    var2_2 = hv3_0.L((int)var42_48, (Object[])var7_10);
                    var4_4.setContentDescription((CharSequence)var2_2);
                }
                if ((var11_14 = (int)Intrinsics.areEqual(var4_4 = var5_8.o5(), var2_2 = ld3_2.STORE_AJIO.getStoreId())) != 0) {
                    var4_4 = var5_8.cb().q;
                    if (var4_4 == null || (var26_32 = var4_4.getCatalog()) == null) {
                        var4_4 = var5_8.cb().q;
                        if (var4_4 != null) {
                            var26_32 = var4_4.getCatalogName();
                        } else {
                            var8_11 = 0;
                            var26_32 = null;
                        }
                    }
                    if ((var11_14 = (int)Intrinsics.areEqual(var26_32, var4_4 = "ajioGram")) == 0) {
                        var7_10 = var4_4;
                        var55_62 = (char)-1;
                        var35_41 = 0.0f;
                        var38_44 = null;
                        var8_11 = 0;
                        var26_32 = null;
                        var9_12 = 0;
                        var10_13 /* !! */  = null;
                        var41_47 = 0;
                        var24_28 = null;
                        var16_20 = 0;
                        var13_17 = null;
                        var17_21 = 0;
                        var14_18 = null;
                        var18_22 = 0;
                        var33_39 /* !! */  = null;
                        var19_23 = null;
                        var21_25 = 0;
                        var40_46 = 0.0f;
                        var20_24 = null;
                        var22_26 = null;
                        var23_27 = null;
                        var37_43 = 0;
                        var36_42 = 0.0f;
                        var34_40 = null;
                        var15_19 = null;
                        var27_33 = null;
                        var4_4 = new AppsFlyerEventsItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var55_62, null);
                        var2_2 = var5_8.cb().q;
                        if (var2_2 != null && (var2_2 = var2_2.getPrice()) != null) {
                            var26_32 = var2_2.getValue();
                        } else {
                            var8_11 = 0;
                            var26_32 = null;
                        }
                        var4_4.setPrice((String)var26_32);
                        var2_2 = var5_8.cb().q;
                        if (var2_2 != null) {
                            var26_32 = var2_2.getCode();
                        } else {
                            var8_11 = 0;
                            var26_32 = null;
                        }
                        var4_4.setContent((String)var26_32);
                        var2_2 = var5_8.cb().q;
                        if (var2_2 != null) {
                            var26_32 = var2_2.getCode();
                        } else {
                            var8_11 = 0;
                            var26_32 = null;
                        }
                        var4_4.setContentId((String)var26_32);
                        var2_2 = var5_8.cb().q;
                        if (var2_2 != null) {
                            var26_32 = var2_2.getBrickSubCategory();
                        } else {
                            var8_11 = 0;
                            var26_32 = null;
                        }
                        var4_4.setContentType((String)var26_32);
                        var2_2 = var5_8.cb().q;
                        if (var2_2 != null) {
                            var26_32 = var2_2.getBrickCategory();
                        } else {
                            var8_11 = 0;
                            var26_32 = null;
                        }
                        var4_4.setSegment((String)var26_32);
                        var2_2 = var5_8.cb().q;
                        if (var2_2 != null) {
                            var26_32 = var2_2.getBrickName();
                        } else {
                            var8_11 = 0;
                            var26_32 = null;
                        }
                        var4_4.setBrick((String)var26_32);
                        var4_4.setCurrency("INR");
                        var2_2 = AppsFlyerEvents.INSTANCE;
                        var2_2.pushPDPContentViewEvent((AppsFlyerEventsItem)var4_4);
                    }
                }
                ** GOTO lbl739
lbl724:
                // 1 sources

                var11_14 = var10_13 /* !! */ .getStatus();
                if (var11_14 == (var42_49 = 1)) {
                    var4_4 = StringCompanionObject.INSTANCE;
                    var11_14 = R$string.acc_alert_message;
                    var4_4 = hv3_0.K(var11_14);
                    var30_37 = R$string.pdp_details_not_available;
                    var25_30 = hv3_0.K(var30_37);
                    var3_3 = new Object[var42_49];
                    var6_9 = 0;
                    var7_10 = null;
                    var3_3[0] = var25_30;
                    var4_4 = xh2_0.a((Object[])var3_3, var42_49, (String)var4_4, (String)var13_17);
                    var42_49 = R$string.pdp_details_not_available;
                    var2_2 = var5_8.getString(var42_49);
                    var5_8.showNotification((String)var2_2, (String)var4_4);
                }
lbl739:
                // 5 sources

                var5_8.getClass();
                var4_4 = fq2_1.f;
                if (var4_4 != null) {
                    var4_4.stop();
                }
                fq2_1.f = null;
                return Unit.a;
            }
            case 1: {
                var5_8 = (zr1_1)var5_8;
                var4_4 = var1_1;
                var4_4 = (BottomNavigationData)var1_1;
                return HomeRepo.a0((zr1_1)var5_8, (BottomNavigationData)var4_4);
            }
            case 0: 
        }
        var2_2 = var1_1;
        var2_2 = (DataCallback)var1_1;
        var5_8 = (CheckoutFragment)var5_8;
        Intrinsics.checkNotNullParameter(var5_8, (String)var4_4);
        Intrinsics.checkNotNullParameter(var2_2, "userProfileDataDataCallback");
        var4_4 = cp_1.Companion;
        var11_15 = nn_2.b((cp$a)var4_4, (DataCallback)var2_2);
        if (var11_15 == 0) return Unit.a;
        var11_15 = var2_2.getStatus();
        if (var11_15 != 0) return Unit.a;
        var4_4 = (UserProfileData)var2_2.getData();
        var5_8.getClass();
        if (var4_4 == null) {
            return Unit.a;
        }
        var2_2 = var4_4.getFirstName();
        var2_2 = var2_2 != null ? var4_4.getFirstName() : var3_3;
        var5_8.r = var2_2;
        var2_2 = var4_4.getLastName();
        var2_2 = var2_2 != null ? var4_4.getLastName() : var3_3;
        var25_31 = var5_8.r;
        var7_10 = " ";
        var5_8.r = var2_2 = n1.a(var25_31, (String)var7_10, (String)var2_2);
        var2_2 = var4_4.getMobileNumber();
        if (var2_2 != null) {
            var3_3 = var4_4.getMobileNumber();
        }
        var5_8.s = var3_3;
        var4_4 = var5_8.o;
        if (var4_4 == null) return Unit.a;
        var4_4.notifyDataSetChanged();
        return Unit.a;
    }
}

