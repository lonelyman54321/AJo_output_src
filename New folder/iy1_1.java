/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.os.Bundle;
import android.text.TextUtils;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.FbEventContentData;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.ProductStockLevelStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from iY1
 */
public final class iy1_1
implements F62 {
    public final /* synthetic */ oy1_1 a;

    public /* synthetic */ iy1_1(oy1_1 oy1_12) {
        this.a = oy1_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onChanged(Object var1_1) {
        block75: {
            block76: {
                block78: {
                    block79: {
                        block80: {
                            block74: {
                                block77: {
                                    var2_2 = 0;
                                    var3_3 /* !! */  = null;
                                    var4_4 = 1;
                                    var5_5 = var1_1;
                                    var5_5 = (DataCallback)var1_1;
                                    var6_6 = this.a;
                                    Intrinsics.checkNotNullParameter(var6_6, "this$0");
                                    var7_7 = cp_1.Companion;
                                    var8_8 = nn_2.b((cp$a)var7_7, (DataCallback)var5_5);
                                    if (var8_8 == 0) break block75;
                                    var6_6.Wa();
                                    Intrinsics.checkNotNull(var5_5);
                                    var8_8 = var5_5.getStatus();
                                    var9_9 = "format(...)";
                                    if (var8_8 != 0) break block76;
                                    if ((var5_5 = (ProductStockLevelStatus)var5_5.getData()) != null) break block77;
                                    var10_10 = var6_6.isAdded();
                                    if (var10_10 != 0) {
                                        var5_5 = StringCompanionObject.INSTANCE;
                                        var10_10 = R$string.acc_error_message;
                                        var5_5 = hv3_0.K(var10_10);
                                        var6_6 = "Could not add item to the cart";
                                        var7_7 = new Object[var4_4];
                                        var7_7[0] = var6_6;
                                        ZK1.e((Object[])var7_7, var4_4, (String)var5_5, (String)var9_9, (String)var6_6);
                                    }
                                    break block75;
                                }
                                var7_7 = "success";
                                var11_13 = var5_5.getStatusCode();
                                var8_8 = (int)Intrinsics.areEqual(var7_7, var11_13);
                                if (var8_8 == 0) break block78;
                                var7_7 = var6_6.I;
                                var11_13 = (jo_2)var7_7.getValue();
                                var8_8 = ((jo_2)var7_7.getValue()).d() + var4_4;
                                var11_13.p(var8_8);
                                var6_6.db();
                                var7_7 = var6_6.Qa();
                                var11_13 = var6_6.Qa().C;
                                var11_13 = var11_13 == null ? var6_6.Qa().r.getCode() : var6_6.Qa().C;
                                var12_15 = var6_6.Qa().r.getPrice();
                                Intrinsics.checkNotNull(var12_15);
                                var12_15 = var12_15.getValue();
                                var7_7.b((String)var11_13, (String)var12_15);
                                var7_7 = StringCompanionObject.INSTANCE;
                                var8_8 = R$string.acc_alert_message;
                                var7_7 = hv3_0.K(var8_8);
                                var13_17 = R$string.add_to_bag_msg_refresh;
                                var11_13 = hv3_0.K(var13_17);
                                var12_15 = new Object[var4_4];
                                var12_15[0] = var11_13;
                                var7_7 = xh2_0.a((Object[])var12_15, var4_4, (String)var7_7, (String)var9_9);
                                var14_18 = R$string.add_to_bag_msg_refresh;
                                var9_9 = hv3_0.K(var14_18);
                                var6_6.gb((String)var9_9, (String)var7_7);
                                var7_7 = var6_6.r;
                                if (var7_7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("cartClosetListener");
                                    var8_8 = 0;
                                    var7_7 = null;
                                }
                                var7_7.updateCartWishCount();
                                var7_7 = var6_6.Qa();
                                var9_9 = var6_6.Qa().r;
                                var6_6 = var6_6.Qa().C;
                                var7_7.getClass();
                                if (var9_9 == null) break block79;
                                var11_13 = new ArrayList();
                                var15_19 = "";
                                var16_21 = var6_6 == null ? var15_19 : var6_6;
                                var12_15 = new FbEventContentData((String)var16_21, var4_4);
                                var11_13.add(var12_15);
                                var12_15 = var9_9.getPrice();
                                if (var12_15 != null) {
                                    var12_15 = var12_15.getValue();
                                } else {
                                    var17_23 = false;
                                    var12_15 = null;
                                }
                                if (var12_15 != null) {
                                    var12_15 = var9_9.getPrice();
                                    if (var12_15 != null) {
                                        var12_15 = var12_15.getValue();
                                    } else {
                                        var17_23 = false;
                                        var12_15 = null;
                                    }
                                    Intrinsics.checkNotNull(var12_15);
                                } else {
                                    var12_15 = var15_19;
                                }
                                var16_21 = var9_9.getVariantOptions();
                                var18_25 = "0";
                                if (var16_21 == null) ** GOTO lbl-1000
                                var16_21 = var9_9.getVariantOptions();
                                if (var16_21 != null) {
                                    var19_27 = var16_21.size();
                                    var16_21 = var19_27;
                                } else {
                                    var19_27 = 0;
                                    var16_21 = null;
                                }
                                Intrinsics.checkNotNull(var16_21);
                                var19_27 = var16_21.intValue();
                                if (var19_27 <= 0) ** GOTO lbl-1000
                                var16_21 = var9_9.getVariantOptions();
                                if (var16_21 != null && (var16_21 = (ProductOptionItem)var16_21.get(0)) != null) {
                                    var16_21 = var16_21.getWasPriceData();
                                } else {
                                    var19_27 = 0;
                                    var16_21 = null;
                                }
                                if (var16_21 != null) {
                                    var16_21 = var9_9.getVariantOptions();
                                    if (var16_21 != null && (var16_21 = (ProductOptionItem)var16_21.get(0)) != null && (var16_21 = var16_21.getWasPriceData()) != null && (var16_21 = var16_21.getValue()) != null) {
                                        while (true) {
                                            var18_25 = var16_21;
                                            break;
                                        }
                                    }
                                } else if ((var16_21 = var9_9.getWasPriceData()) != null && (var16_21 = var16_21.getValue()) != null) ** continue;
                                var16_21 = E1.a("Currency", "INR");
                                var20_29 = var9_9.getPrice();
                                if (var20_29 != null) {
                                    var20_29 = var20_29.getValue();
                                } else {
                                    var21_30 = 0;
                                    var20_29 = null;
                                }
                                var16_21.putString("Product Id", (String)var20_29);
                                var20_29 = var9_9.getName();
                                var22_31 = "Name";
                                var16_21.putString((String)var22_31, (String)var20_29);
                                var20_29 = "Discounted Amount";
                                var16_21.putString((String)var20_29, (String)var18_25);
                                var18_25 = var9_9.getPrice();
                                if (var18_25 == null) ** GOTO lbl-1000
                                var18_25 = var9_9.getPrice();
                                Intrinsics.checkNotNull(var18_25);
                                var18_25 = var18_25.getValue();
                                if (var18_25 != null) {
                                    var18_25 = var9_9.getPrice();
                                    Intrinsics.checkNotNull(var18_25);
                                    var18_25 = var18_25.getValue();
                                    Intrinsics.checkNotNull(var18_25);
                                    var23_32 = Double.parseDouble((String)var18_25);
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var23_32 = 0.0;
                                }
                                var25_33 = "Amount";
                                var16_21.putDouble((String)var25_33, var23_32);
                                var18_25 = AnalyticsManager.Companion.getInstance().getGa();
                                var20_29 = new AnalyticsData$Builder();
                                var16_21 = var20_29.bundle((Bundle)var16_21).build();
                                var18_25.addedToCart((AnalyticsData)var16_21);
                                var16_21 = var7_7.s.getCode();
                                if (var16_21 == null) {
                                    var16_21 = var9_9.getCode();
                                }
                                if ((var18_25 = var7_7.s.getPriceData()) == null || (var18_25 = var18_25.getValue()) == null) {
                                    var18_25 = var9_9.getPrice();
                                    if (var18_25 != null) {
                                        var18_25 = var18_25.getValue();
                                    } else {
                                        var26_34 = 0;
                                        var18_25 = null;
                                    }
                                }
                                if ((var20_29 = var7_7.s.getWasPriceData()) == null || (var20_29 = var20_29.getValue()) == null) {
                                    var20_29 = var9_9.getWasPriceData();
                                    if (var20_29 != null) {
                                        var20_29 = var20_29.getValue();
                                    } else {
                                        var21_30 = 0;
                                        var20_29 = null;
                                    }
                                }
                                var16_21 = p3.a("SKU", (String)var16_21);
                                var25_33 = var9_9.getName();
                                var16_21.put(var22_31, var25_33);
                                if (var18_25 != null) {
                                    var27_36 = Double.parseDouble((String)var18_25);
                                    var18_25 = var27_36;
                                } else {
                                    var26_34 = 0;
                                    var18_25 = null;
                                }
                                var22_31 = "Final_price";
                                var16_21.put(var22_31, var18_25);
                                if (var20_29 != null) {
                                    var23_32 = Double.parseDouble((String)var20_29);
                                    var18_25 = var23_32;
                                } else {
                                    var26_34 = 0;
                                    var18_25 = null;
                                }
                                var20_29 = "MRP";
                                var16_21.put(var20_29, var18_25);
                                var18_25 = var9_9.getFnlColorVariantData();
                                if (var18_25 == null) ** GOTO lbl-1000
                                var18_25 = var9_9.getFnlColorVariantData();
                                if (var18_25 != null) {
                                    var18_25 = var18_25.getBrandName();
                                } else {
                                    var26_34 = 0;
                                    var18_25 = null;
                                }
                                if (var18_25 != null) {
                                    var18_25 = var9_9.getFnlColorVariantData();
                                    if (var18_25 != null) {
                                        var18_25 = var18_25.getBrandName();
                                    } else {
                                        var26_34 = 0;
                                        var18_25 = null;
                                    }
lbl202:
                                    // 3 sources

                                    while (true) {
                                        var22_31 = var18_25;
                                        break;
                                    }
                                } else lbl-1000:
                                // 2 sources

                                {
                                    if ((var18_25 = var9_9.getBrandName()) != null) {
                                        var18_25 = var9_9.getBrandName();
                                        ** continue;
                                    }
                                    var22_31 = null;
                                }
                                if (var22_31 != null) {
                                    var18_25 = "Brand";
                                    var16_21.put(var18_25, var22_31);
                                }
                                if ((var26_34 = TextUtils.isEmpty((CharSequence)(var18_25 = var9_9.getUrl()))) == 0) {
                                    var18_25 = "Product_url";
                                    var20_29 = var9_9.getUrl();
                                    var16_21.put(var18_25, var20_29);
                                }
                                if ((var18_25 = var7_7.s.getVariantOptionQualifiers()) != null) {
                                    var18_25 = var7_7.s.getVariantOptionQualifiers();
                                    if (var18_25 != null) {
                                        var18_25 = xx_2.g((Collection)var18_25);
                                    } else {
                                        var26_34 = 0;
                                        var18_25 = null;
                                    }
                                    Intrinsics.checkNotNull(var18_25);
                                    var21_30 = var18_25.a;
                                    var26_34 = var18_25.b;
                                    if (var21_30 <= var26_34) {
                                        while (true) {
                                            if ((var25_33 = var7_7.s.getVariantOptionQualifiers()) != null) {
                                                var25_33 = (ProductOptionVariant)var25_33.get(var21_30);
                                            } else {
                                                var29_37 = false;
                                                var25_33 = null;
                                            }
                                            if (var25_33 != null && !(var31_39 = TextUtils.isEmpty((CharSequence)(var30_38 = var25_33.getName()))) && (var2_2 = b.i((String)(var32_40 = var25_33.getName()), (String)(var3_3 /* !! */  = "Size*"), (boolean)var4_4)) != 0) {
                                                var3_3 /* !! */  = var25_33.getValue();
                                                if (var3_3 /* !! */  == null) {
                                                    break;
                                                }
                                                break block74;
                                            }
                                            if (var21_30 == var26_34) break;
                                            var21_30 += var4_4;
                                            var2_2 = 0;
                                            var3_3 /* !! */  = null;
                                        }
                                    }
                                }
                                var3_3 /* !! */  = var15_19;
                            }
                            var16_21.put("size", var3_3 /* !! */ );
                            var32_40 = var9_9.getCatalog();
                            var33_43 = TextUtils.isEmpty((CharSequence)var32_40);
                            if (!var33_43) {
                                var32_40 = "catalogId";
                                var18_25 = var9_9.getCatalog();
                                var16_21.put(var32_40, var18_25);
                            }
                            var32_40 = var9_9.getBrickCategory();
                            var18_25 = "Category";
                            if (var32_40 != null) {
                                var32_40 = var9_9.getBrickCategory();
                                var16_21.put(var18_25, var32_40);
                            }
                            if ((var32_40 = var9_9.getBrickSubCategory()) != null) {
                                var32_40 = "Vertical";
                                var20_29 = var9_9.getBrickSubCategory();
                                var16_21.put(var32_40, var20_29);
                            }
                            var32_40 = var9_9.getBrickName();
                            var20_29 = "Brick";
                            if (var32_40 != null) {
                                var32_40 = var9_9.getBrickName();
                                var16_21.put(var20_29, var32_40);
                            }
                            if (!(var33_43 = TextUtils.isEmpty((CharSequence)(var32_40 = var9_9.getVerticalColor())))) {
                                var32_40 = "color";
                                var25_33 = var9_9.getVerticalColor();
                                var16_21.put(var32_40, var25_33);
                            }
                            if ((var32_40 = var9_9.getProductGalleryImageUrls()) == null || (var32_40 = var9_9.getProductGalleryImageUrls()) == null || (var33_43 = (var32_40 = (Collection)var32_40).isEmpty() ^ var4_4) != var4_4) break block80;
                            var34_46 = var9_9.getProductGalleryImageUrls();
                            if (var34_46 == null) ** GOTO lbl-1000
                            var33_43 = false;
                            var32_40 = null;
                            if ((var34_46 = (ProductImage)var34_46.get(0)) != null) {
                                var34_46 = var34_46.getUrl();
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_4 = 0;
                                var34_46 = null;
                            }
                            var32_40 = "Image_URL";
                            var16_21.put(var32_40, var34_46);
                        }
                        if ((var34_46 = var9_9.getFnlColorVariantData()) == null || (var34_46 = var34_46.getBrickName()) == null) {
                            var34_46 = var15_19;
                        }
                        var16_21.put(var20_29, var34_46);
                        var34_46 = var9_9.getFnlProductData();
                        if (var34_46 != null) {
                            var34_46 = var34_46.getPlanningCategory();
                        } else {
                            var4_4 = 0;
                            var34_46 = null;
                        }
                        var16_21.put(var18_25, var34_46);
                        var32_40 = var9_9.getSourceStoreId();
                        var16_21.put("Store Type", var32_40);
                        var34_46 = AnalyticsManager.Companion;
                        var32_40 = var34_46.getInstance().getCt();
                        var18_25 = new AnalyticsData$Builder();
                        var16_21 = var18_25.eventMap((HashMap)var16_21).build();
                        var32_40.addedToCart((AnalyticsData)var16_21);
                        var32_40 = var34_46.getInstance().getFb();
                        var16_21 = new AnalyticsData$Builder();
                        if (var6_6 == null) {
                            var6_6 = var15_19;
                        }
                        var6_6 = var16_21.productCode((String)var6_6).price((String)var12_15).setBrand((String)var22_31);
                        var12_15 = var9_9.getCatalog();
                        var6_6 = var6_6.setCatalogId((String)var12_15).fbContentData((List)var11_13).build();
                        var32_40.addToCart((AnalyticsData)var6_6);
                        var6_6 = var9_9.getSourceStoreId();
                        if (var6_6 != null && (var35_49 = var6_6.length()) != 0) {
                            var6_6 = var9_9.getSourceStoreId();
                            if (var6_6 == null) {
                                var6_6 = var15_19;
                            }
lbl325:
                            // 4 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var6_6 = GAEcommerceEvents.INSTANCE;
                        var32_40 = var9_9.getCatalogName();
                        if (var32_40 == null) {
                            var32_40 = var9_9.getCatalog();
                        }
                        var6_6 = var6_6.getStoreTypeFromCatalog((String)var32_40);
                        ** while (true)
                        var36_50 = var6_6;
                        var11_13 = GAEcommerceEvents.INSTANCE;
                        var6_6 = var9_9.getCode();
                        var16_21 = var9_9.getName();
                        var32_40 = var9_9.getPrice();
                        var20_29 = var32_40 != null && (var32_40 = var32_40.getValue()) != null ? var32_40 : var15_19;
                        var30_38 = av_0.a((AnalyticsManager$Companion)var34_46);
                        var34_46 = var9_9.getFnlProductData();
                        var37_51 = var34_46 != null ? (var32_40 = var34_46.getPlanningCategory()) : null;
                        var38_52 = 4608;
                        var26_34 = 1;
                        var29_37 = true;
                        var12_15 = var9_9;
                        var15_19 = var6_6;
                        GAEcommerceEvents.pushAddRemoveCartItem$default((GAEcommerceEvents)var11_13, (Product)var9_9, (String)var6_6, (String)var16_21, var26_34, (String)var20_29, (String)var22_31, var29_37, var30_38, (String)var37_51, null, (String)var3_3 /* !! */ , (String)var36_50, false, var38_52, null);
                        var11_13 = var7_7.e;
                        var15_19 = var11_13.getEE_ADD_TO_CART();
                        var39_53 = 1L;
                        var16_21 = var39_53;
                        var25_33 = var11_13.getPrevScreen();
                        var37_51 = var11_13.getPrevScreenType();
                        var41_54 = 544;
                        var36_50 = null;
                        var20_29 = "closet screen";
                        var22_31 = null;
                        var30_38 = "closet screen";
                        var18_25 = var3_3 /* !! */ ;
                        NewEEcommerceEventsRevamp.pushEEClosetAddToCart$default((NewEEcommerceEventsRevamp)var11_13, (Product)var9_9, (String)var15_19, (Long)var16_21, (String)var3_3 /* !! */ , (String)var20_29, false, (String)var25_33, var30_38, (String)var37_51, null, var41_54, null);
                        var3_3 /* !! */  = el1_2.a;
                        var3_3 /* !! */  = yt2_2.WISHLIST;
                        el1_2.b((yt2_2)var3_3 /* !! */ , (Product)var9_9);
                    }
                    var5_5.isResponseFromPE();
                    break block75;
                }
                var2_2 = R$string.productDetails_couldNotAddToCart;
                var3_3 /* !! */  = var6_6.getString(var2_2);
                var7_7 = var5_5.getStatusCode();
                var8_8 = (int)cs.a((String)var7_7);
                var32_41 = ")";
                var11_13 = " (";
                if (var8_8 != 0) {
                    var10_11 = R$string.stock_details_low_stock;
                    var5_5 = var6_6.getString(var10_11);
lbl378:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var5_5 = var5_5.getStatusCode();
                ** while (true)
                var5_5 = cP.a((String)var11_13, (String)var5_5, var32_41);
                var3_3 /* !! */  = Ft2.a((String)var3_3 /* !! */ , (String)var5_5);
                var5_5 = StringCompanionObject.INSTANCE;
                var10_11 = R$string.acc_error_message;
                var5_5 = hv3_0.K(var10_11);
                var7_7 = new Object[var4_4];
                var33_44 = false;
                var32_41 = null;
                var7_7[0] = var3_3 /* !! */ ;
                var34_47 = xh2_0.a((Object[])var7_7, var4_4, (String)var5_5, (String)var9_9);
                var6_6.gb((String)var3_3 /* !! */ , var34_47);
                break block75;
            }
            var2_2 = var5_5.getStatus();
            if (var2_2 != var4_4) break block75;
            var3_3 /* !! */  = var5_5.getError();
            if (var3_3 /* !! */  == null) ** GOTO lbl-1000
            var3_3 /* !! */  = var5_5.getError();
            Intrinsics.checkNotNull(var3_3 /* !! */ );
            var3_3 /* !! */  = var3_3 /* !! */ .getErrors();
            if (var3_3 /* !! */  != null) {
                var5_5 = var3_3 /* !! */ ;
                var5_5 = (Collection)var3_3 /* !! */ ;
                var10_12 = var5_5.size();
                var8_8 = 0;
                var7_7 = null;
                var32_42 = null;
                for (var33_45 = 0; var33_45 < var10_12; var33_45 += var4_4) {
                    var11_14 = (DataError$ErrorMessage)var3_3 /* !! */ .get(var33_45);
                    if (var11_14 != null) {
                        var12_16 = var11_14.getSubjectType();
                        var17_24 = b.i((String)var12_16, (String)(var15_20 /* !! */  = "cart"), (boolean)var4_4);
                        if (var17_24 && (var17_24 = b.i((String)(var12_16 = var11_14.getReason()), (String)(var15_20 /* !! */  = "notFound"), (boolean)var4_4))) {
                            var7_7 = var6_6.Qa().s;
                            var6_6.Pa().startLoader();
                            var12_16 = var6_6.Qa();
                            var12_16.getClass();
                            Intrinsics.checkNotNullParameter(var7_7, "<set-?>");
                            var12_16.s = var7_7;
                            var7_7 = var6_6.Qa();
                            var7_7.getClass();
                            var12_16 = md3_0.c((jD3)var7_7);
                            var19_28 = false;
                            var16_22 = null;
                            var15_20 /* !! */  = new ny1_2((ky1_0)var7_7, null);
                            Ae3.d((i90_0)var12_16, null, null, (Function2)var15_20 /* !! */ , 3);
                            var8_8 = 1;
                        } else {
                            var19_28 = false;
                            var16_22 = null;
                        }
                        var12_16 = var11_14.getMessage();
                        var17_24 = TextUtils.isEmpty((CharSequence)var12_16);
                        if (var17_24) continue;
                        var7_7 = StringCompanionObject.INSTANCE;
                        var7_7 = hv3_0.K(R$string.acc_error_message);
                        var12_16 = var11_14.getMessage();
                        var15_20 /* !! */  = new Object[var4_4];
                        var26_35 = false;
                        var18_26 = null;
                        var15_20 /* !! */ [0] = var12_16;
                        var7_7 = xh2_0.a(var15_20 /* !! */ , var4_4, (String)var7_7, (String)var9_9);
                        var11_14 = var11_14.getMessage();
                        var12_16 = "getMessage(...)";
                        Intrinsics.checkNotNullExpressionValue(var11_14, (String)var12_16);
                        var6_6.gb((String)var11_14, (String)var7_7);
                        var8_8 = 1;
                        continue;
                    }
                    var19_28 = false;
                    var16_22 = null;
                }
                var33_45 = var8_8;
            } else lbl-1000:
            // 2 sources

            {
                var33_45 = 0;
                var32_42 = null;
            }
            if (var33_45 == 0) {
                var3_3 /* !! */  = StringCompanionObject.INSTANCE;
                var2_2 = R$string.acc_error_message;
                var3_3 /* !! */  = hv3_0.K(var2_2);
                var10_12 = R$string.something_wrong_msg;
                var5_5 = hv3_0.K(var10_12);
                var7_7 = new Object[var4_4];
                var33_45 = 0;
                var32_42 = null;
                var7_7[0] = var5_5;
                var3_3 /* !! */  = xh2_0.a((Object[])var7_7, var4_4, (String)var3_3 /* !! */ , (String)var9_9);
                var4_4 = R$string.something_wrong_msg;
                var34_48 = hv3_0.K(var4_4);
                var6_6.gb(var34_48, (String)var3_3 /* !! */ );
            }
        }
    }
}

