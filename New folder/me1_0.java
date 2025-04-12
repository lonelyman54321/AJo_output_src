/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Message
 *  android.text.TextUtils
 */
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.FbEventContentData;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.ProductStockLevelStatus;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from ME1
 */
public final class me1_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ me1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        var2_2 = this;
        var3_3 = 0;
        var4_4 /* !! */  = null;
        var5_5 = "this$0";
        var6_7 = this.b;
        var7_8 = 0;
        var8_9 = 0.0f;
        var9_10 = null;
        var10_11 = 1;
        var11_12 = this.a;
        switch (var11_12) {
            default: {
                var9_10 = var1_1 /* !! */ ;
                var9_10 = (DataCallback)var1_1 /* !! */ ;
                var6_7 = (zt3_0)var6_7;
                Intrinsics.checkNotNullParameter(var6_7, (String)var5_5);
                var5_5 = var6_7.e;
                if (var5_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressView");
                    var12_13 = 0;
                    var5_5 = null;
                }
                var5_5.dismiss();
                var12_13 = var9_10.getStatus();
                if (var12_13 == 0) {
                    var5_5 = JsonUtils.toJson((JsonObject)var9_10.getData());
                    var6_7.Pa((String)var5_5);
                } else {
                    var12_13 = var9_10.getStatus();
                    if (var12_13 == var10_11) {
                        var6_7.Pa(null);
                    }
                }
                return Unit.a;
            }
            case 1: {
                var13_15 = var1_1 /* !! */ ;
                var13_15 = (DataCallback)var1_1 /* !! */ ;
                var6_7 = (NewProductDetailsFragment)var6_7;
                Intrinsics.checkNotNullParameter(var6_7, (String)var5_5);
                Intrinsics.checkNotNullParameter(var13_15, "productStockLevelStatusDataCallback");
                var5_5 = cp_1.Companion;
                var12_14 = nn_2.b((cp$a)var5_5, (DataCallback)var13_15);
                if (var12_14 == 0) ** GOTO lbl698
                var12_14 = var13_15.getStatus();
                var14_16 = "format(...)";
                if (var12_14 != 0) ** GOTO lbl485
                var5_5 = var6_7.cb().q;
                if (var5_5 != null) {
                    var5_5 = var6_7.cb().q;
                    Intrinsics.checkNotNull(var5_5);
                    var15_17 = var5_5 = var5_5.getCode();
                } else {
                    var15_17 = null;
                }
                var13_15 = var5_5 = var13_15.getData();
                var13_15 = (ProductStockLevelStatus)var5_5;
                var16_19 = var6_7.cb();
                var5_5 = var6_7.R;
                Intrinsics.checkNotNull(var5_5);
                var5_5 = var5_5.e;
                var17_22 = var6_7.H0;
                var18_23 = var6_7.o5();
                var16_19.getClass();
                var19_26 = "storeId";
                Intrinsics.checkNotNullParameter(var18_23, (String)var19_26);
                if (var13_15 != null) ** GOTO lbl74
                var5_5 = StringCompanionObject.INSTANCE;
                var12_14 = R$string.acc_error_message;
                var5_5 = hv3_0.K(var12_14);
                var16_19 = "Could not add item to the cart";
                var20_29 = new Object[var10_11];
                var20_29[0] = var16_19;
                ZK1.e(var20_29, var10_11, (String)var5_5, (String)var14_16, (String)var16_19);
lbl71:
                // 6 sources

                while (true) {
                    var21_68 = 1;
                    ** GOTO lbl408
                    break;
                }
lbl74:
                // 1 sources

                var14_16 = var13_15.getStatusCode();
                var22_32 = "success".equalsIgnoreCase((String)var14_16);
                var19_26 = var16_19.T;
                if (var22_32 == 0) ** GOTO lbl391
                var16_19.d().B();
                var14_16 = var16_19.d();
                var23_33 = var16_19.d();
                var24_36 = var23_33.d() + var10_11;
                var14_16.p(var24_36);
                var16_19.S = var10_11;
                var14_16 = hv3_0.K(R$string.revamp_added_to_cart_successfully);
                var19_26.k(var14_16);
                var22_32 = og1_1.b();
                if (var22_32 == 0 && (var22_32 = pa_1.a()) != 0 && (var22_32 = (var14_16 = cp$a.q()).has((String)(var19_26 = "pdp_flag"))) != 0 && (var22_32 = (var14_16 = cp$a.q()).getBoolean((String)var19_26)) != 0) {
                    var16_19.t();
                }
                if ((var22_32 = TextUtils.isEmpty((CharSequence)var5_5)) == 0) {
                    var16_19.x((String)var5_5);
                } else {
                    var5_5 = var16_19.k();
                    var16_19.x((String)var5_5);
                    var5_5 = var16_19.q;
                    if (var5_5 != null) {
                        var5_5 = var5_5.getCode();
                    } else {
                        var12_14 = 0;
                        var5_5 = null;
                    }
                    var16_19.x((String)var5_5);
                }
                var5_5 = var16_19.q;
                if (var5_5 == null) ** GOTO lbl71
                var14_16 = var16_19.F;
                var19_26 = "0";
                if (var14_16 == null && (var5_5 = var5_5.getPrice()) != null) {
                    var5_5 = var16_19.q;
                    if (var5_5 != null && (var5_5 = var5_5.getPrice()) != null) {
                        var5_5 = var5_5.getValue();
                    } else {
                        var12_14 = 0;
                        var5_5 = null;
                    }
                    Intrinsics.checkNotNull(var5_5);
                } else {
                    var5_5 = var16_19.F;
                    if (var5_5 != null && (var5_5 = var5_5.getPriceData()) != null) {
                        var5_5 = var16_19.F;
                        if (var5_5 != null && (var5_5 = var5_5.getPriceData()) != null) {
                            var5_5 = var5_5.getValue();
                        } else {
                            var12_14 = 0;
                            var5_5 = null;
                        }
                        Intrinsics.checkNotNull(var5_5);
                    } else {
                        var5_5 = var19_26;
                    }
                }
                var22_32 = TextUtils.isEmpty((CharSequence)var5_5);
                if (var22_32 != 0) ** GOTO lbl134
                try {
                    var25_37 = Double.parseDouble((String)var5_5);
                    ** GOTO lbl135
                }
                catch (NumberFormatException var5_6) {
                    var14_16 = yn3_0.a;
                    var14_16.e(var5_6);
                }
lbl134:
                // 2 sources

                var25_37 = 0.0;
lbl135:
                // 2 sources

                var5_5 = new ArrayList();
                var27_38 = var16_19.q;
                var27_38 = var27_38 != null ? var27_38.getCode() : null;
                var14_16 = new FbEventContentData((String)var27_38, var10_11);
                var5_5.add(var14_16);
                var14_16 = var16_19.q;
                if (var14_16 != null && (var14_16 = var14_16.getPrice()) != null) {
                    var14_16 = var14_16.getValue();
                } else {
                    var22_32 = 0;
                    var14_16 = null;
                }
                var27_38 = "";
                if (var14_16 != null) {
                    var14_16 = var16_19.q;
                    if (var14_16 != null && (var14_16 = var14_16.getPrice()) != null) {
                        var14_16 = var14_16.getValue();
                    } else {
                        var22_32 = 0;
                        var14_16 = null;
                    }
                    Intrinsics.checkNotNull(var14_16);
                } else {
                    var14_16 = var27_38;
                }
                var4_4 /* !! */  = var16_19.q;
                if (var4_4 /* !! */  != null) {
                    var4_4 /* !! */  = var4_4 /* !! */ .getFnlColorVariantData();
                } else {
                    var3_3 = 0;
                    var4_4 /* !! */  = null;
                }
                if (var4_4 /* !! */  == null) ** GOTO lbl176
                var4_4 /* !! */  = var16_19.q;
                if (var4_4 /* !! */  != null && (var4_4 /* !! */  = var4_4 /* !! */ .getFnlColorVariantData()) != null) {
                    var4_4 /* !! */  = var4_4 /* !! */ .getBrandName();
                } else {
                    var3_3 = 0;
                    var4_4 /* !! */  = null;
                }
                if (var4_4 /* !! */  == null) ** GOTO lbl176
                var4_4 /* !! */  = var16_19.q;
                if (var4_4 /* !! */  == null || (var4_4 /* !! */  = var4_4 /* !! */ .getFnlColorVariantData()) == null) ** GOTO lbl-1000
                var4_4 /* !! */  = var4_4 /* !! */ .getBrandName();
                ** GOTO lbl186
lbl176:
                // 2 sources

                if ((var4_4 /* !! */  = var16_19.q) != null) {
                    var4_4 /* !! */  = var4_4 /* !! */ .getBrandName();
                } else {
                    var3_3 = 0;
                    var4_4 /* !! */  = null;
                }
                if (var4_4 /* !! */  != null && (var4_4 /* !! */  = var16_19.q) != null) {
                    var4_4 /* !! */  = var4_4 /* !! */ .getBrandName();
                } else lbl-1000:
                // 2 sources

                {
                    var3_3 = 0;
                    var4_4 /* !! */  = null;
                }
lbl186:
                // 3 sources

                var28_41 = AnalyticsManager.Companion;
                var29_44 = var28_41.getInstance();
                var9_10 = var29_44.getFb();
                var2_2 = new AnalyticsData$Builder();
                var1_1 /* !! */  = var19_26;
                var19_26 = var16_19.q;
                if (var19_26 != null && (var19_26 = var19_26.getCode()) != null) {
                    var27_38 = var19_26;
                }
                var2_2 = var2_2.productCode((String)var27_38).price((String)var14_16).setBrand((String)var4_4 /* !! */ );
                var4_4 /* !! */  = var16_19.q;
                if (var4_4 /* !! */  != null) {
                    var4_4 /* !! */  = var4_4 /* !! */ .getCatalog();
                } else {
                    var3_3 = 0;
                    var4_4 /* !! */  = null;
                }
                var5_5 = var2_2.setCatalogId((String)var4_4 /* !! */ ).fbContentData((List)var5_5).build();
                var9_10.addToCart((AnalyticsData)var5_5);
                var5_5 = var28_41.getInstance().getGa();
                var2_2 = "pdp screen";
                var5_5.setTrackerScreenName((String)var2_2);
                var5_5 = var16_19.q;
                if (var5_5 == null) ** GOTO lbl71
                Intrinsics.checkNotNull(var5_5);
                if ((var5_5 = var5_5.getCode()) == null) ** GOTO lbl71
                var5_5 = var16_19.q;
                if (var5_5 != null) {
                    var4_4 /* !! */  = new HashMap();
                    var9_10 = var16_19.E;
                    if (var9_10 != null && (var9_10 = var9_10.getCode()) != null) {
                        var9_10 = var16_19.E;
                        if (var9_10 != null) {
                            var9_10 = var9_10.getCode();
                        } else {
                            var7_8 = 0;
                            var8_9 = 0.0f;
                            var9_10 = null;
                        }
                    } else {
                        var9_10 = var5_5.getCode();
                    }
                    var14_16 = var16_19.E;
                    if (var14_16 != null && (var14_16 = var14_16.getPriceData()) != null) {
                        var14_16 = var16_19.E;
                        if (var14_16 != null && (var14_16 = var14_16.getPriceData()) != null) {
                            var14_16 = var14_16.getValue();
                        } else {
                            var22_32 = 0;
                            var14_16 = null;
                        }
                    } else {
                        var14_16 = var1_1 /* !! */ ;
                    }
                    var19_26 = var16_19.E;
                    var19_26 = var19_26 != null && (var19_26 = var19_26.getWasPriceData()) != null ? ((var19_26 = var16_19.E) != null && (var19_26 = var19_26.getWasPriceData()) != null ? var19_26.getValue() : null) : var1_1 /* !! */ ;
                    var9_10 = String.valueOf(var9_10);
                    var4_4 /* !! */ .put("SKU", var9_10);
                    var9_10 = String.valueOf(var5_5.getName());
                    var27_38 = "Name";
                    var4_4 /* !! */ .put(var27_38, var9_10);
                    if (var14_16 != null) {
                        var8_9 = Float.parseFloat((String)var14_16);
                        var9_10 = Float.valueOf(var8_9);
                    } else {
                        var7_8 = 0;
                        var8_9 = 0.0f;
                        var9_10 = null;
                    }
                    var14_16 = "Final_price";
                    var4_4 /* !! */ .put(var14_16, var9_10);
                    if (var19_26 != null) {
                        var8_9 = Float.parseFloat((String)var19_26);
                        var9_10 = Float.valueOf(var8_9);
                    } else {
                        var7_8 = 0;
                        var8_9 = 0.0f;
                        var9_10 = null;
                    }
                    var4_4 /* !! */ .put("MRP", var9_10);
                    var9_10 = String.valueOf(var16_19.Q);
                    var14_16 = "size";
                    var4_4 /* !! */ .put(var14_16, var9_10);
                    var9_10 = var5_5.getCatalog();
                    var7_8 = (int)TextUtils.isEmpty((CharSequence)var9_10);
                    if (var7_8 == 0) {
                        var9_10 = "catalogId";
                        var14_16 = var5_5.getCatalog();
                        var4_4 /* !! */ .put(var9_10, var14_16);
                    }
                    if ((var9_10 = var16_19.q) != null && (var9_10 = var9_10.getFnlColorVariantData()) != null) {
                        var9_10 = var9_10.getBrandName();
                    } else {
                        var7_8 = 0;
                        var8_9 = 0.0f;
                        var9_10 = null;
                    }
                    if (var9_10 != null && (var7_8 = var9_10.length()) != 0) {
                        var9_10 = var16_19.q;
                        if (var9_10 != null && (var9_10 = var9_10.getFnlColorVariantData()) != null) {
                            var9_10 = var9_10.getBrandName();
                        } else {
                            var7_8 = 0;
                            var8_9 = 0.0f;
                            var9_10 = null;
                        }
                        var14_16 = "Brand";
                        var4_4 /* !! */ .put(var14_16, var9_10);
                    }
                    if ((var9_10 = var5_5.getBrickCategory()) != null) {
                        var9_10 = String.valueOf(var5_5.getBrickCategory());
                        var14_16 = "Category";
                        var4_4 /* !! */ .put(var14_16, var9_10);
                    }
                    if ((var9_10 = var5_5.getBrickSubCategory()) != null) {
                        var9_10 = "Vertical";
                        var14_16 = var5_5.getBrickSubCategory();
                        var4_4 /* !! */ .put(var9_10, var14_16);
                    }
                    if ((var9_10 = var5_5.getBrickName()) != null) {
                        var9_10 = "Brick";
                        var14_16 = var5_5.getBrickName();
                        var4_4 /* !! */ .put(var9_10, var14_16);
                    }
                    if ((var7_8 = (int)TextUtils.isEmpty((CharSequence)(var9_10 = var5_5.getVerticalColor()))) == 0) {
                        var9_10 = "color";
                        var14_16 = var5_5.getVerticalColor();
                        var4_4 /* !! */ .put(var9_10, var14_16);
                    }
                    if ((var9_10 = var5_5.getProductGalleryImageUrls()) != null) {
                        var9_10 = var5_5.getProductGalleryImageUrls();
                        Intrinsics.checkNotNull(var9_10);
                        var7_8 = var9_10.size();
                        if (var7_8 > 0) {
                            var9_10 = var5_5.getProductGalleryImageUrls();
                            Intrinsics.checkNotNull(var9_10);
                            var22_32 = 0;
                            var9_10 = var9_10.get(0);
                            var14_16 = "Image_URL";
                            var4_4 /* !! */ .put(var14_16, var9_10);
                        }
                    }
                    if ((var7_8 = (int)TextUtils.isEmpty((CharSequence)(var9_10 = var5_5.getUrl()))) == 0) {
                        var9_10 = "Product_url";
                        var14_16 = var5_5.getUrl();
                        var4_4 /* !! */ .put(var9_10, var14_16);
                    }
                    if ((var9_10 = var5_5.getFnlColorVariantData()) != null && (var9_10 = var9_10.getProductTag()) != null) {
                        var14_16 = var16_19.n;
                        var4_4 /* !! */ .put(var14_16, var9_10);
                    }
                    if ((var7_8 = var18_23.length()) > 0) {
                        var9_10 = "Store Type";
                        var4_4 /* !! */ .put(var9_10, var18_23);
                    }
                    var9_10 = var28_41.getInstance().getCt();
                    var14_16 = new AnalyticsData$Builder();
                    var4_4 /* !! */  = var14_16.eventMap((HashMap)var4_4 /* !! */ ).build();
                    var9_10.addedToCart((AnalyticsData)var4_4 /* !! */ );
                    var4_4 /* !! */  = h40_0.a;
                    var3_3 = (int)h40_0.b2();
                    if (var3_3 != 0) {
                        var4_4 /* !! */  = var5_5.getRatingsResponse();
                        if (var4_4 /* !! */  != null && (var4_4 /* !! */  = var4_4 /* !! */ .getAggregateRating()) != null) {
                            var4_4 /* !! */  = var4_4 /* !! */ .getAverageRating();
                        } else {
                            var3_3 = 0;
                            var4_4 /* !! */  = null;
                        }
                        var9_10 = var5_5.getRatingsResponse();
                        if (var9_10 != null && (var9_10 = var9_10.getAggregateRating()) != null) {
                            var9_10 = var9_10.getNumUserRatings();
                        } else {
                            var7_8 = 0;
                            var8_9 = 0.0f;
                            var9_10 = null;
                        }
                        var14_16 = new O02((Product)var5_5);
                        ai0_2.r((Function2)var14_16, var4_4 /* !! */ , var9_10);
                    }
                    var19_26 = GAEcommerceEvents.INSTANCE;
                    var4_4 /* !! */  = var5_5.getCode();
                    var27_38 = var5_5.getName();
                    var9_10 = new StringBuilder();
                    var9_10.append(var25_37);
                    var29_44 = var9_10.toString();
                    var9_10 = var16_19.q;
                    var30_47 = var9_10 != null && (var9_10 = var9_10.getFnlColorVariantData()) != null ? (var9_10 = var9_10.getBrandName()) : null;
                    var9_10 = var5_5.getFnlProductData();
                    var31_50 = var9_10 != null ? (var9_10 = var9_10.getPlanningCategory()) : null;
                    var9_10 = var16_19.Q;
                    var32_53 = 512;
                    var22_32 = 1;
                    var33_54 = true;
                    var34_55 = "pdp screen";
                    var35_58 = false;
                    var36_61 = true;
                    var23_33 = var5_5;
                    var37_62 = var4_4 /* !! */ ;
                    var4_4 /* !! */  = var18_23;
                    var38_65 = var22_32;
                    GAEcommerceEvents.pushAddRemoveCartItem$default((GAEcommerceEvents)var19_26, (Product)var5_5, (String)var37_62, (String)var27_38, var22_32, (String)var29_44, (String)var30_47, var33_54, var34_55, (String)var31_50, null, (String)var9_10, var18_23, var36_61, var32_53, null);
                    var4_4 /* !! */  = el1_2.a;
                    var4_4 /* !! */  = yt2_2.PDP;
                    el1_2.b((yt2_2)var4_4 /* !! */ , (Product)var5_5);
                }
                var5_5 = "Add To Bag";
                var4_4 /* !! */  = "Add To Bag Button";
                tj2_0.e(var28_41, (String)var5_5, (String)var4_4 /* !! */ , (String)var2_2);
                if (var15_17 == null || !var17_22) ** GOTO lbl71
                TextUtils.isEmpty((CharSequence)var15_17);
                ** continue;
lbl391:
                // 1 sources

                var12_14 = R$string.productDetails_couldNotAddToCart;
                var5_5 = hv3_0.K(var12_14);
                var2_2 = var13_15.getStatusCode();
                var21_68 = cs.a((String)var2_2);
                var4_4 /* !! */  = ")";
                var9_10 = " (";
                if (var21_68 != 0) {
                    var21_68 = R$string.stock_details_low_stock;
                    var2_2 = hv3_0.K(var21_68);
lbl400:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var2_2 = var13_15.getStatusCode();
                ** continue;
                var2_2 = cP.a((String)var9_10, (String)var2_2, (String)var4_4 /* !! */ );
                var5_5 = Ft2.a((String)var5_5, (String)var2_2);
                var16_19.S = var21_68 = 1;
                var19_26.k(var5_5);
lbl408:
                // 2 sources

                var6_7.I0 = var21_68;
                var12_14 = (int)var6_7.u7();
                if (var12_14 == 0) {
                    var12_14 = (int)var6_7.f1;
                    if (var12_14 != 0) {
                        var12_14 = (int)var6_7.cb().u();
                        var5_5 = (boolean)var12_14;
                        var6_7.Kb((Boolean)var5_5, (boolean)var21_68);
                    } else {
                        var12_14 = (int)var6_7.cb().u();
                        var5_5 = (boolean)var12_14;
                        var6_7.Hb((Boolean)var5_5, (boolean)var21_68);
                    }
                    var6_7.Zb();
                    var6_7.Lb();
                }
                var3_3 = 0;
                var4_4 /* !! */  = null;
                var6_7.Va((boolean)var21_68, false);
                var6_7.Ua((String)var15_17);
                if (var13_15 != null) {
                    var12_14 = var13_15.isResponseFromPE();
                }
                FirebaseEvents.Companion.getInstance().imageQualityAB();
                var5_5 = var6_7.A0;
                var2_2 = hv3_0.a;
                var21_68 = 2;
                if (var5_5 != null) {
                    var3_3 = 1;
                    var5_5.performHapticFeedback(var3_3, var21_68);
                }
                if ((var12_14 = (int)var6_7.u7()) != 0 && (var12_14 = (var5_5 = var6_7.getParentFragment()) instanceof uo_2) != 0) {
                    var5_5 = var6_7.getParentFragment();
                    Intrinsics.checkNotNull(var5_5, "null cannot be cast to non-null type com.ril.ajio.cart.cartlist.fragment.CartPDPBSF");
                    var5_5 = (uo_2)var5_5;
                    var4_4 /* !! */  = var5_5.getTargetFragment();
                    if (var4_4 /* !! */  != null) {
                        var7_8 = var5_5.getTargetRequestCode();
                        var10_11 = -1;
                        var11_12 = 0;
                        var13_15 = null;
                        var4_4 /* !! */ .onActivityResult(var7_8, var10_11, null);
                    }
                    var5_5.dismiss();
                }
                if ((var12_14 = Intrinsics.areEqual(var5_5 = var6_7.o5(), var4_4 /* !! */  = ld3_2.STORE_AJIO.getStoreId())) == 0) ** GOTO lbl698
                var5_5 = h40_0.a;
                var5_5 = var6_7.cb().q;
                if (var5_5 != null) {
                    var13_15 = var5_5.getBrickCategory();
                } else {
                    var11_12 = 0;
                    var13_15 = null;
                }
                var5_5 = var6_7.cb().q;
                if (var5_5 != null) {
                    var5_5 = var5_5.getBrickName();
                } else {
                    var12_14 = 0;
                    var5_5 = null;
                }
                if (var13_15 == null || (var3_3 = var13_15.length()) == 0 || var5_5 == null || (var3_3 = var5_5.length()) == 0 || (var7_8 = (int)(var4_4 /* !! */  = h40_0.t()).optBoolean((String)(var9_10 = "showPopup"))) == 0 || (var4_4 /* !! */  = var4_4 /* !! */ .optJSONObject((String)(var9_10 = "visibilityConditions"))) == null || (var4_4 /* !! */  = var4_4 /* !! */ .optJSONArray((String)var13_15)) == null) ** GOTO lbl698
                var7_8 = var4_4 /* !! */ .length();
                var28_41 = null;
                for (var10_11 = 0; var10_11 < var7_8; var10_11 += var11_12) {
                    var13_15 = var4_4 /* !! */ .get(var10_11);
                    var11_12 = (int)Intrinsics.areEqual(var13_15, var5_5);
                    if (var11_12 == 0) ** GOTO lbl481
                    var5_5 = h40_0.a;
                    var5_5 = h40_0.u();
                    if (var5_5 != null && (var12_14 = var5_5.length()) != 0) {
                        var5_5 = var6_7.getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(var5_5, "getViewLifecycleOwner(...)");
                        var5_5 = nu1_0.a((mu1_1)var5_5);
                        var4_4 /* !! */  = bg1_1.a;
                        var15_17 = null;
                        var9_10 = new l22_0((NewProductDetailsFragment)var6_7, null);
                        Ae3.d((i90_0)var5_5, (CoroutineContext)var4_4 /* !! */ , null, (Function2)var9_10, var21_68);
                    }
                    ** GOTO lbl698
lbl481:
                    // 1 sources

                    var11_12 = 1;
                    var15_17 = null;
                }
                ** GOTO lbl698
lbl485:
                // 1 sources

                var15_18 = null;
                var12_14 = var13_15.getStatus();
                if (var12_14 != (var21_69 = 1)) ** GOTO lbl698
                var5_5 = var13_15.getError();
                if (var5_5 == null) ** GOTO lbl684
                var4_4 /* !! */  = var5_5.getErrorMessage();
                if (var4_4 /* !! */  != null) {
                    var13_15 = var4_4 /* !! */ .getSubjectType();
                } else {
                    var11_12 = 0;
                    var13_15 = null;
                }
                var4_4 /* !! */  = "cart";
                var3_3 = kotlin.text.b.i((String)var13_15, (String)var4_4 /* !! */ , (boolean)var21_69);
                if (var3_3 == 0) ** GOTO lbl522
                var4_4 /* !! */  = var5_5.getErrorMessage();
                if (var4_4 /* !! */  != null) {
                    var13_15 = var4_4 /* !! */ .getReason();
                } else {
                    var11_12 = 0;
                    var13_15 = null;
                }
                var4_4 /* !! */  = "notFound";
                var3_3 = (int)kotlin.text.b.i((String)var13_15, (String)var4_4 /* !! */ , (boolean)var21_69);
                if (var3_3 == 0) ** GOTO lbl522
                var5_5 = new Message();
                var5_5.arg1 = var21_69;
                var2_2 = var6_7.mb();
                var21_69 = (int)var2_2.p();
                if (var21_69 != 0) {
                    var6_7.Za((Message)var5_5);
lbl514:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var6_7.ab((Message)var5_5);
                ** continue;
                var21_69 = 0;
                var2_2 = null;
                var6_7.Va(false, false);
                ** GOTO lbl698
lbl522:
                // 2 sources

                var2_2 = var5_5.getErrorMessage().getType();
                var4_4 /* !! */  = "CommerceCartModificationError";
                var7_8 = 1;
                var8_9 = 1.4E-45f;
                var21_69 = kotlin.text.b.i((String)var2_2, (String)var4_4 /* !! */ , (boolean)var7_8);
                if (var21_69 == 0) ** GOTO lbl659
                var2_2 = var5_5.getErrorMessage().getReason();
                var21_69 = (int)kotlin.text.b.i((String)var2_2, "INSUFFICIENT_STOCK", (boolean)var7_8);
                var4_4 /* !! */  = "error_status_code";
                var28_42 = "cta_disabled";
                if (var21_69 == 0 && (var21_69 = (int)kotlin.text.b.i((String)(var2_2 = var5_5.getErrorMessage().getReason()), (String)(var13_15 = "UNAVAILABLE_STOCK"), (boolean)var7_8)) == 0) {
                    var2_2 = var5_5.getErrorMessage();
                    if (var2_2 != null && (var2_2 = var2_2.getReason()) != null && (var21_69 = var2_2.equalsIgnoreCase((String)(var13_15 = "MAX_CART_SIZE"))) == var7_8) {
                        var2_2 = E1.a((String)var28_42, "exceed_limit");
                        var16_20 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        var37_63 = ne_0.b((Bundle)var2_2);
                        var23_34 = "pdp screen";
                        var27_39 = null;
                        var20_30 = "Add To Bag";
                        var19_27 = "Add To Bag Button";
                        var38_66 = 16;
                        var29_45 = null;
                        GTMEvents.pushButtonTapEvent$default((GTMEvents)var16_20, var20_30, var19_27, (String)var23_34, (AnalyticsData)var37_63, null, var38_66, null);
                        var21_69 = 0;
                        var6_7.Va(false, false);
                        var2_2 = var5_5.getErrorMessage().getMessage();
                        var9_10 = new Bundle();
                        var5_5 = var5_5.getErrorMessage();
                        if (var5_5 != null) {
                            var5_5 = var5_5.getCode();
                        } else {
                            var12_14 = 0;
                            var5_5 = null;
                        }
                        var9_10.putString((String)var4_4 /* !! */ , (String)var5_5);
                        var16_20 = var6_7.H;
                        var20_30 = var16_20.getEC_ERRORS();
                        var5_5 = var6_7.n1;
                        var4_4 /* !! */  = var6_7.o1;
                        var34_56 = null;
                        var31_51 = null;
                        var19_27 = "cta disabled";
                        var37_63 = "cta_disabled";
                        var27_39 = "pdp screen";
                        var18_24 = "pdp screen";
                        var35_59 = 1536;
                        var23_34 = var2_2;
                        var29_45 = var5_5;
                        var30_48 /* !! */  = var9_10;
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var16_20, var20_30, var19_27, (String)var2_2, (String)var37_63, var27_39, var18_24, (String)var5_5, (Bundle)var9_10, (String)var4_4 /* !! */ , false, null, var35_59, null);
                    } else {
                        var21_69 = 0;
                        var6_7.Va(false, false);
                        var5_5 = var5_5.getErrorMessage();
                        var2_2 = var5_5.getMessage();
                    }
                } else {
                    var2_2 = var6_7.cb().C;
                    var21_69 = var2_2.size();
                    var8_9 = 0.0f;
                    var9_10 = null;
                    for (var7_8 = 0; var7_8 < var21_69; var7_8 += var11_12) {
                        var13_15 = var6_7.cb().C.get(var7_8);
                        Intrinsics.checkNotNullExpressionValue(var13_15, "get(...)");
                        var13_15 = (ProductOptionVariant)var13_15;
                        var16_21 = var13_15.getValue();
                        if (var16_21 != null && (var39_70 = var16_21.equalsIgnoreCase(var20_31 = var6_7.cb().Q))) {
                            var39_70 = false;
                            var16_21 = null;
                            var13_15.setStockAvailable(false);
                            var13_15.setSelected(false);
                            var13_15.setStockLevel(0);
                            break;
                        }
                        var11_12 = 1;
                    }
                    var2_2 = var5_5.getErrorMessage().getMessage();
                    var7_8 = var6_7.f1;
                    if (var7_8 != 0) {
                        var9_10 = Boolean.FALSE;
                        var11_12 = 0;
                        var13_15 = null;
                        var6_7.Kb((Boolean)var9_10, false);
lbl602:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var11_12 = 0;
                    var13_15 = null;
                    var9_10 = Boolean.FALSE;
                    var6_7.Hb((Boolean)var9_10, false);
                    ** continue;
                    var7_8 = 1;
                    var8_9 = 1.4E-45f;
                    var6_7.Va(false, (boolean)var7_8);
                    var9_10 = new Bundle();
                    var13_15 = "Variant_OutOfStock";
                    var9_10.putString((String)var28_42, (String)var13_15);
                    var28_42 = AnalyticsManager.Companion.getInstance();
                    var16_21 = var28_42.getGtmEvents();
                    var37_64 = ne_0.b((Bundle)var9_10);
                    var23_35 = "pdp screen";
                    var27_40 = null;
                    var20_31 = "Add To Bag";
                    var19_28 = "Add To Bag Button";
                    var38_67 = 16;
                    var29_46 = null;
                    GTMEvents.pushButtonTapEvent$default((GTMEvents)var16_21, var20_31, var19_28, (String)var23_35, (AnalyticsData)var37_64, null, var38_67, null);
                    var9_10 = new Bundle();
                    var5_5 = var5_5.getErrorMessage();
                    if (var5_5 != null) {
                        var5_5 = var5_5.getCode();
                    } else {
                        var12_14 = 0;
                        var5_5 = null;
                    }
                    var9_10.putString((String)var4_4 /* !! */ , (String)var5_5);
                    var16_21 = var6_7.H;
                    var20_31 = var16_21.getEC_ERRORS();
                    var5_5 = var6_7.n1;
                    var4_4 /* !! */  = var6_7.o1;
                    var34_57 = null;
                    var31_52 = null;
                    var19_28 = "cta disabled";
                    var37_64 = "cta_disabled";
                    var27_40 = "pdp screen";
                    var18_25 = "pdp screen";
                    var35_60 = 1536;
                    var23_35 = var2_2;
                    var29_46 = var5_5;
                    var30_49 /* !! */  = var9_10;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var16_21, var20_31, var19_28, (String)var2_2, (String)var37_64, var27_40, var18_25, (String)var5_5, (Bundle)var9_10, (String)var4_4 /* !! */ , false, null, var35_60, null);
                }
                var5_5 = StringCompanionObject.INSTANCE;
                var12_14 = R$string.acc_error_message;
                var5_5 = hv3_0.K(var12_14);
                var3_3 = 1;
                var9_10 = new Object[var3_3];
                var10_11 = 0;
                var28_42 = null;
                var9_10[0] = var2_2;
                var5_5 = xh2_0.a((Object[])var9_10, var3_3, (String)var5_5, (String)var14_16);
                var6_7.showNotification((String)var2_2, (String)var5_5);
                ** GOTO lbl698
lbl659:
                // 1 sources

                var2_2 = var5_5.getErrorMessage();
                if (var2_2 != null) {
                    var4_4 /* !! */  = var2_2.getMessage();
                } else {
                    var3_3 = 0;
                    var4_4 /* !! */  = null;
                }
                if (var4_4 /* !! */  != null && (var21_69 = var4_4 /* !! */ .length()) != 0) ** GOTO lbl669
                var11_12 = 0;
                var13_15 = null;
                ** GOTO lbl687
lbl669:
                // 1 sources

                var2_2 = StringCompanionObject.INSTANCE;
                var21_69 = R$string.acc_error_message;
                var2_2 = hv3_0.K(var21_69);
                var4_4 /* !! */  = var5_5.getErrorMessage().getMessage();
                var7_8 = 1;
                var8_9 = 1.4E-45f;
                var28_43 = new Object[var7_8];
                var11_12 = 0;
                var13_15 = null;
                var28_43[0] = var4_4 /* !! */ ;
                var2_2 = xh2_0.a(var28_43, var7_8, (String)var2_2, (String)var14_16);
                var5_5 = var5_5.getErrorMessage().getMessage();
                var6_7.showNotification((String)var5_5, (String)var2_2);
                var6_7.Va(false, false);
                ** GOTO lbl698
lbl684:
                // 1 sources

                var11_12 = 0;
                var13_15 = null;
                var6_7.Va(false, false);
lbl687:
                // 2 sources

                var5_5 = StringCompanionObject.INSTANCE;
                var12_14 = R$string.acc_error_message;
                var5_5 = hv3_0.K(var12_14);
                var2_2 = hv3_0.K(R$string.something_wrong_msg);
                var3_3 = 1;
                var9_10 = new Object[var3_3];
                var9_10[0] = var2_2;
                var5_5 = xh2_0.a((Object[])var9_10, var3_3, (String)var5_5, (String)var14_16);
                var21_69 = R$string.something_wrong_msg;
                var2_2 = hv3_0.K(var21_69);
                var6_7.showNotification((String)var2_2, (String)var5_5);
lbl698:
                // 10 sources

                return Unit.a;
            }
            case 0: 
        }
        var5_5 = var1_1 /* !! */ ;
        var5_5 = (UY2)var1_1 /* !! */ ;
        var6_7 = (CMSNavigation)var6_7;
        Intrinsics.checkNotNullParameter(var6_7, "$subCategory");
        Intrinsics.checkNotNullParameter(var5_5, "$this$semantics");
        var2_2 = var6_7.getInactiveAltText();
        if (var2_2 == null && (var2_2 = var6_7.getName()) == null) {
            var2_2 = "category";
        }
        RY2.e((UY2)var5_5, (String)var2_2);
        return Unit.a;
    }
}

