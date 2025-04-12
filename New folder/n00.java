/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.StrikethroughSpan
 */
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import com.google.gson.JsonParser;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.CategoryTags;
import com.ril.ajio.services.data.Product.ExtraImage;
import com.ril.ajio.services.data.Product.HomeWidgetTypes;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.Stock;
import com.ril.ajio.services.data.Product.Tag;
import com.ril.ajio.services.data.Product.TagPrimary;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.helper.UrlHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

public final class n00 {
    public static final hh3_2 a;
    public static final hh3_2 b;
    public static final hh3_2 c;
    public static final hh3_2 d;
    public static final hh3_2 e;

    static {
        Function0 function0 = new Object();
        a = yr1_2.b(function0);
        function0 = new j00(0);
        b = yr1_2.b(function0);
        function0 = new k00(0);
        c = yr1_2.b(function0);
        function0 = new Object();
        d = yr1_2.b(function0);
        function0 = new m00(0);
        e = yr1_2.b(function0);
    }

    public static boolean a(Product iterator) {
        boolean bl2;
        block5: {
            iterator = ((Product)((Object)iterator)).getVariantOptions();
            bl2 = false;
            if (iterator != null) {
                Object object = iterator;
                object = (Collection)((Object)iterator);
                int n3 = object.isEmpty();
                int n4 = 1;
                if ((n3 ^= n4) != 0) {
                    iterator = iterator.iterator();
                    while ((n3 = iterator.hasNext()) != 0) {
                        object = ((ProductOptionItem)iterator.next()).getStock();
                        if (object == null) continue;
                        if ((object = ((Stock)object).getStockLevel()) != null) {
                            n3 = (Integer)object;
                        } else {
                            n3 = 0;
                            object = null;
                        }
                        if (n3 <= 0) continue;
                        break block5;
                    }
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    public static PlpProductUIModel b(Product var0) {
        block88: {
            block79: {
                block87: {
                    block85: {
                        block86: {
                            block84: {
                                block83: {
                                    block82: {
                                        block80: {
                                            block81: {
                                                block78: {
                                                    var1_1 = var0;
                                                    var2_2 = "product";
                                                    Intrinsics.checkNotNullParameter(var0, (String)var2_2);
                                                    var4_4 = var3_3;
                                                    var5_5 = -1;
                                                    var6_6 = -1;
                                                    var7_7 = 0;
                                                    var8_8 = 0.0f;
                                                    var9_9 = 0;
                                                    var10_10 = null;
                                                    var11_11 = 0;
                                                    var12_12 = null;
                                                    var13_13 = false;
                                                    var14_14 = null;
                                                    var15_15 = false;
                                                    var16_16 = null;
                                                    var17_17 = 0;
                                                    var18_18 = 0.0f;
                                                    var19_19 = null;
                                                    var20_20 = 0;
                                                    var21_21 = 0.0f;
                                                    var22_22 = null;
                                                    var23_23 = 0;
                                                    var24_24 = null;
                                                    var25_25 = 0;
                                                    var26_26 = 0;
                                                    var27_27 = var3_3;
                                                    var3_3 = null;
                                                    var28_28 = 0L;
                                                    var30_29 = -1;
                                                    var31_30 = -1;
                                                    var32_31 = -1 >>> 4;
                                                    var4_4(null, null, null, null, null, null, 0, false, null, null, null, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, null, false, null, null, false, false, false, false, false, false, false, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, null, null, false, null, null, null, null, false, false, false, null, null, false, false, false, false, false, null, false, null, false, false, false, false, false, null, false, false, null, null, null, false, false, null, false, null, null, false, null, null, false, null, null, false, null, null, null, null, null, false, var28_28, null, false, null, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, var30_29, var31_30, var5_5, var6_6, var32_31, null);
                                                    var33_32 = 1;
                                                    var4_4.setProductTextWrap((boolean)var33_32);
                                                    var34_33 = var0.getName();
                                                    var4_4.setProductName((String)var34_33);
                                                    var34_33 = var0.getFnlColorVariantData();
                                                    if (var34_33 != null) {
                                                        var34_33 = var34_33.getBrandName();
                                                    } else {
                                                        var7_7 = 0;
                                                        var34_33 = null;
                                                        var8_8 = 0.0f;
                                                    }
                                                    var27_27.setBrandName((String)var34_33);
                                                    var34_33 = var0.getFnlColorVariantData();
                                                    if (var34_33 != null) {
                                                        var34_33 = var34_33.getColorGroup();
                                                    } else {
                                                        var7_7 = 0;
                                                        var34_33 = null;
                                                        var8_8 = 0.0f;
                                                    }
                                                    var27_27.setProductCode((String)var34_33);
                                                    var34_33 = var0.getCode();
                                                    var27_27.setProductColorCode((String)var34_33);
                                                    var27_27.setLayoutWidthChangesRequired((boolean)var33_32);
                                                    var34_33 = var0.getImages();
                                                    if (var34_33 == null || (var7_7 = var34_33.isEmpty()) || (var34_33 = var0.getImages()) == null) break block80;
                                                    var34_33 = var34_33.iterator();
                                                    while ((var11_11 = var34_33.hasNext()) != 0) {
                                                        var12_12 = (ProductImage)var34_33.next();
                                                        var14_14 = var12_12.getFormat();
                                                        var13_13 = var2_2.equalsIgnoreCase((String)var14_14);
                                                        if (!var13_13) continue;
                                                        var2_2 = var12_12.getUrl();
                                                        break block78;
                                                    }
                                                    var35_34 = 0;
                                                    var2_2 = null;
                                                    var36_35 = 0.0f;
                                                }
                                                var34_33 = var27_27.getProductImageUrl();
                                                if (var34_33 != null) break block81;
                                                var2_2 = var0.getImages();
                                                if (var2_2 == null) ** GOTO lbl-1000
                                                var7_7 = 0;
                                                var8_8 = 0.0f;
                                                var34_33 = null;
                                                if ((var2_2 = (ProductImage)CollectionsKt.N(0, (List)var2_2)) != null) {
                                                    var2_2 = var2_2.getUrl();
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var35_34 = 0;
                                                    var2_2 = null;
                                                    var36_35 = 0.0f;
                                                }
                                            }
                                            var34_33 = Unit.a;
                                            break block82;
                                        }
                                        var35_34 = 0;
                                        var2_2 = null;
                                        var36_35 = 0.0f;
                                    }
                                    var2_2 = UrlHelper.Companion.getInstance().getImageUrl((String)var2_2);
                                    var27_27.setProductImageUrl((String)var2_2);
                                    var35_34 = R$string.product_image;
                                    var2_2 = hv3_0.K(var35_34);
                                    var34_33 = var0.getFnlColorVariantData();
                                    if (var34_33 != null) {
                                        var34_33 = var34_33.getBrandName();
                                    } else {
                                        var7_7 = 0;
                                        var34_33 = null;
                                        var8_8 = 0.0f;
                                    }
                                    var12_12 = var0.getName();
                                    var14_14 = "";
                                    if (var12_12 == null) {
                                        var12_12 = var14_14;
                                    }
                                    var16_16 = " of ";
                                    var19_19 = "-";
                                    var2_2 = KW.a((String)var2_2, (String)var16_16, (String)var34_33, (String)var19_19, (String)var12_12);
                                    var27_27.setProductImageContentDescription((String)var2_2);
                                    var27_27.setCartClosetClickListners((boolean)var33_32);
                                    var2_2 = var0.getPrice();
                                    var7_7 = 0;
                                    var8_8 = 0.0f;
                                    var34_33 = null;
                                    if (var2_2 == null) break block83;
                                    var27_27.setShowFinalPrice((boolean)var33_32);
                                    var2_2 = qz2_0.r(var0.getPrice());
                                    var27_27.setFinalPriceValue((String)var2_2);
                                    var2_2 = StringCompanionObject.INSTANCE;
                                    AJIOApplication.Companion.getClass();
                                    var2_2 = AJIOApplication$a.a().getResources();
                                    var11_11 = R$string.acc_plp_final_price;
                                    var2_2 = var2_2.getString(var11_11);
                                    var12_12 = "getString(...)";
                                    Intrinsics.checkNotNullExpressionValue(var2_2, (String)var12_12);
                                    var16_16 = qz2_0.r(var0.getPrice());
                                    var19_19 = new Object[var33_32];
                                    var20_20 = 0;
                                    var21_21 = 0.0f;
                                    var22_22 = null;
                                    var19_19[0] = var16_16;
                                    var16_16 = Arrays.copyOf(var19_19, var33_32);
                                    var2_2 = String.format((String)var2_2, (Object[])var16_16);
                                    var16_16 = "format(...)";
                                    Intrinsics.checkNotNullExpressionValue(var2_2, (String)var16_16);
                                    var27_27.setFinalPriceContentDescription((String)var2_2);
                                    var2_2 = var0.getWasPriceData();
                                    if (var2_2 == null) ** GOTO lbl-1000
                                    var19_19 = var2_2.getValue();
                                    if (var19_19 != null) {
                                        var18_18 = Float.parseFloat((String)var19_19);
                                    } else {
                                        var17_17 = 0;
                                        var18_18 = 0.0f;
                                        var19_19 = null;
                                    }
                                    var22_22 = var0.getPrice();
                                    if (var22_22 != null && (var22_22 = var22_22.getValue()) != null) {
                                        var21_21 = Float.parseFloat((String)var22_22);
                                    } else {
                                        var20_20 = 0;
                                        var21_21 = 0.0f;
                                        var22_22 = null;
                                    }
                                    var17_17 = Float.compare(var18_18, var21_21);
                                    if (var17_17 > 0) {
                                        var19_19 = qz2_0.s(mz3_0.h(var2_2.getValue()));
                                        var22_22 = new SpannableString((CharSequence)var19_19);
                                        var24_24 = new StrikethroughSpan();
                                        var25_25 = var19_19.length();
                                        var26_26 = 33;
                                        var22_22.setSpan((Object)var24_24, 0, var25_25, var26_26);
                                        var2_2 = qz2_0.g(var0.getPrice(), (Price)var2_2);
                                        var27_27.setShowDiscountPrice((boolean)var33_32);
                                        var27_27.setShowMrpPrice((boolean)var33_32);
                                        var27_27.setMrpPriceValue((SpannableString)var22_22);
                                        var22_22 = AJIOApplication$a.a().getResources();
                                        var23_23 = R$string.acc_plp_original_price;
                                        var22_22 = var22_22.getString(var23_23);
                                        Intrinsics.checkNotNullExpressionValue(var22_22, (String)var12_12);
                                        var24_24 = new Object[var33_32];
                                        var25_25 = 0;
                                        var24_24[0] = var19_19;
                                        var19_19 = Arrays.copyOf(var24_24, var33_32);
                                        var19_19 = String.format((String)var22_22, (Object[])var19_19);
                                        Intrinsics.checkNotNullExpressionValue(var19_19, (String)var16_16);
                                        var27_27.setMrpPriceContentDescription((String)var19_19);
                                        var19_19 = var0.getDiscountPercent();
                                        var17_17 = TextUtils.isEmpty((CharSequence)var19_19);
                                        if (var17_17 == 0) {
                                            var19_19 = AJIOApplication$a.a().getResources();
                                            var20_20 = R$string.acc_plp_discount_price;
                                            var19_19 = var19_19.getString(var20_20);
                                            Intrinsics.checkNotNullExpressionValue(var19_19, (String)var12_12);
                                            var12_12 = new Object[var33_32];
                                            var20_20 = 0;
                                            var21_21 = 0.0f;
                                            var22_22 = null;
                                            var12_12[0] = var2_2;
                                            var2_2 = Arrays.copyOf(var12_12, var33_32);
                                            var2_2 = String.format((String)var19_19, (Object[])var2_2);
                                            Intrinsics.checkNotNullExpressionValue(var2_2, (String)var16_16);
                                            var27_27.setDiscountPriceContentDescription((String)var2_2);
                                            var2_2 = var0.getDiscountPercent();
                                            var27_27.setDiscountPriceValue((String)var2_2);
lbl196:
                                            // 2 sources

                                            while (true) {
                                                var35_34 = 0;
                                                var36_35 = 0.0f;
                                                var2_2 = null;
                                                ** GOTO lbl240
                                                break;
                                            }
                                        } else {
                                            var17_17 = TextUtils.isEmpty((CharSequence)var2_2);
                                            if (var17_17 == 0) {
                                                var19_19 = AJIOApplication$a.a().getResources();
                                                var20_20 = R$string.acc_plp_discount_price;
                                                var19_19 = var19_19.getString(var20_20);
                                                Intrinsics.checkNotNullExpressionValue(var19_19, (String)var12_12);
                                                var12_12 = new Object[var33_32];
                                                var20_20 = 0;
                                                var21_21 = 0.0f;
                                                var22_22 = null;
                                                var12_12[0] = var2_2;
                                                var12_12 = Arrays.copyOf(var12_12, var33_32);
                                                var12_12 = String.format((String)var19_19, (Object[])var12_12);
                                                Intrinsics.checkNotNullExpressionValue(var12_12, (String)var16_16);
                                                var27_27.setDiscountPriceContentDescription((String)var12_12);
                                                var12_12 = new StringBuilder();
                                                var12_12.append((String)var2_2);
                                                var12_12.append("% OFF");
                                                var2_2 = var12_12.toString();
                                                var27_27.setDiscountPriceValue((String)var2_2);
                                                ** continue;
                                            }
                                            var35_34 = 0;
                                            var36_35 = 0.0f;
                                            var2_2 = null;
                                            var27_27.setShowDiscountPrice(false);
                                        }
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var35_34 = 0;
                                        var36_35 = 0.0f;
                                        var2_2 = null;
                                        var27_27.setShowMrpPrice(false);
                                        var27_27.setShowDiscountPrice(false);
                                    }
                                    break block84;
                                }
                                var35_34 = 0;
                                var36_35 = 0.0f;
                                var2_2 = null;
                                var27_27.setShowFinalPrice(false);
                            }
                            var27_27.setEnableCartClosetAddToBag((boolean)var33_32);
                            var27_27.setEnableRatingView(false);
                            var27_27.setEnableAddtoCart((boolean)var33_32);
                            var11_11 = (int)n00.a(var0);
                            var16_16 = n00.b;
                            var19_19 = n00.a;
                            if (var11_11 == 0) break block85;
                            var27_27.setAllOutOfStock((boolean)var33_32);
                            var11_11 = (int)var27_27.isComingSoonEnable();
                            if (var11_11 != 0) {
                                var27_27.setComingSoonEnable((boolean)var33_32);
                                var27_27.setEnabledeleteImg(false);
                                var35_34 = (int)og1_1.b();
                                if (var35_34 != 0) {
                                    var27_27.setAfterCartLuxEnabled((boolean)var33_32);
                                }
lbl256:
                                // 6 sources

                                while (true) {
                                    var35_34 = 0;
                                    var36_35 = 0.0f;
                                    var2_2 = null;
                                    break block79;
                                    break;
                                }
                            }
                            var2_2 = (Boolean)var19_19.getValue();
                            var35_34 = (int)var2_2.booleanValue();
                            if (var35_34 == 0 || (var35_34 = (int)(var2_2 = (Boolean)var16_16.getValue()).booleanValue()) == 0) break block86;
                            var27_27.setSimilarOOSWishlistEnabled((boolean)var33_32);
                            var35_34 = 0;
                            var36_35 = 0.0f;
                            var2_2 = null;
                            var27_27.setEnableSimilarCartClosetCLick(false);
                            var27_27.setEnabledeleteImg(false);
                            break block79;
                        }
                        var27_27.setEnableOutOfStock((boolean)var33_32);
                        ** GOTO lbl256
                    }
                    var2_2 = (Boolean)var19_19.getValue();
                    var35_34 = (int)var2_2.booleanValue();
                    if (var35_34 != 0 && (var35_34 = (int)(var2_2 = (Boolean)var16_16.getValue()).booleanValue()) != 0) {
                        var27_27.setSimilarOOSWishlistEnabled((boolean)var33_32);
                    }
                    if ((var35_34 = (int)var0.isAddedToCart()) == 0) break block87;
                    var27_27.setShowAddedToCart((boolean)var33_32);
                    var35_34 = (int)og1_1.c();
                    if (var35_34 == 0) ** GOTO lbl256
                    var27_27.setLuxeEnabled((boolean)var33_32);
                    ** while (true)
                }
                var27_27.setEnableAddtoBag((boolean)var33_32);
                var35_34 = 0;
                var36_35 = 0.0f;
                var2_2 = null;
                var27_27.setEnabledeleteImg(false);
                var27_27.setEnablebackground((boolean)var33_32);
                var27_27.setEnableAddToBagCartClosetClick(false);
            }
            var12_12 = Unit.a;
            var12_12 = el1_2.a;
            var11_11 = (int)el1_2.l();
            if (var11_11 != 0 && (var12_12 = var0.getAdsData()) != null) {
                var27_27.setShowAdTag((boolean)var33_32);
                var27_27.setShowProductTags(false);
            } else {
                var2_2 = hv3_0.a;
                var12_12 = var0.getFnlColorVariantData();
                var2_2.getClass();
                var2_2 = hv3_0.z((Product)var1_1, (ProductFnlColorVariantData)var12_12);
                var12_12 = hv3_0.A(var0.getFnlColorVariantData());
                var16_16 = n00.f(var0);
                var19_19 = h40_0.a;
                var17_17 = h40_0.W0();
                var20_20 = hv3_0.V(var0);
                if (var17_17 == 0 || var20_20 == 0) {
                    var2_2 = var12_12;
                }
                var12_12 = n00.d((Pair)var16_16, (String)var12_12, (boolean)var17_17, (boolean)var20_20);
                if (var2_2 == null && !(var15_15 = (var16_16 = (Boolean)var16_16.a).booleanValue())) {
                    var15_15 = false;
                    var16_16 = null;
                    var27_27.setShowProductTags(false);
                } else {
                    if (var17_17 == 0) {
                        var2_2 = var12_12;
                    }
                    var27_27.setProductTagViewContentDescription((String)var2_2);
                    var27_27.setProductTagValue((String)var12_12);
                    var27_27.setShowProductTags((boolean)var33_32);
                }
            }
            var2_2 = tr2_2.a;
            var12_12 = var0.getSourceStoreId();
            var15_15 = og1_1.b();
            var35_34 = (int)var2_2.k((String)var12_12, var15_15);
            if (var35_34 != 0 || (var35_34 = (int)tr2_2.l((ScreenType)(var2_2 = ScreenType.SCREEN_WISHLIST))) != 0) {
                var27_27.setEnableSaleContainer((boolean)var33_32);
                var27_27.setLuxeAfercartAndLuxeEnable((boolean)var33_32);
                var27_27.setSaleContainerSpaceRetained((boolean)var33_32);
            }
            if ((var2_2 = var0.getWasPriceData()) != null) {
                var2_2 = var0.getWasPriceData();
                if (var2_2 != null) {
                    var2_2 = var2_2.getValue();
                } else {
                    var35_34 = 0;
                    var2_2 = null;
                    var36_35 = 0.0f;
                }
                var35_34 = (int)TextUtils.isEmpty((CharSequence)var2_2);
                if (var35_34 == 0) {
                    var2_2 = var0.getWasPriceData();
                    if (var2_2 != null && (var2_2 = var2_2.getValue()) != null && (var2_2 = je3_2.e((String)var2_2)) != null) {
                        var36_35 = var2_2.floatValue();
                    } else {
                        var35_34 = 0;
                        var36_35 = 0.0f;
                        var2_2 = null;
                    }
                    var2_2 = Float.valueOf(var36_35);
                    var27_27.setWasPriceValue((Float)var2_2);
                }
            }
            if ((var2_2 = var0.getPrice()) != null) {
                var2_2 = var0.getPrice();
                if (var2_2 != null) {
                    var2_2 = var2_2.getValue();
                } else {
                    var35_34 = 0;
                    var2_2 = null;
                    var36_35 = 0.0f;
                }
                var35_34 = (int)TextUtils.isEmpty((CharSequence)var2_2);
                if (var35_34 == 0) {
                    var2_2 = var0.getPrice();
                    if (var2_2 != null && (var2_2 = var2_2.getValue()) != null && (var2_2 = je3_2.e((String)var2_2)) != null) {
                        var8_8 = var2_2.floatValue();
                    }
                    var2_2 = Float.valueOf(var8_8);
                    var27_27.setPriceValue((Float)var2_2);
                }
            }
            if ((var2_2 = var0.getOfferPrice()) != null && (var2_2 = var2_2.getPriceReveal()) != null) {
                var2_2 = var2_2.getBestPrice();
            } else {
                var35_34 = 0;
                var2_2 = null;
                var36_35 = 0.0f;
            }
            if (var2_2 != null) {
                var2_2 = var0.getOfferPrice();
                if (var2_2 != null && (var2_2 = var2_2.getPriceReveal()) != null) {
                    var2_2 = var2_2.getBestPrice();
                } else {
                    var35_34 = 0;
                    var2_2 = null;
                    var36_35 = 0.0f;
                }
                var27_27.setBestPriceValue((Float)var2_2);
            }
            if ((var2_2 = var0.getOfferPrice()) != null) {
                var2_2 = var2_2.getValue();
            } else {
                var35_34 = 0;
                var2_2 = null;
                var36_35 = 0.0f;
            }
            var27_27.setOfferPrice((String)var2_2);
            var2_2 = var0.getOfferPrice();
            if (var2_2 != null && (var2_2 = var2_2.getPriceReveal()) != null) {
                var2_2 = var2_2.getDiscountPercent();
            } else {
                var35_34 = 0;
                var2_2 = null;
                var36_35 = 0.0f;
            }
            var27_27.setDiscountPercentValue((String)var2_2);
            var27_27.setEnableCartClosetSelectSize((boolean)var33_32);
            var2_2 = var0.getVariantOptions();
            if (var2_2 == null || (var35_34 = (int)var2_2.isEmpty()) != 0) break block88;
            var2_2 = var0.getBaseOptions();
            if (var2_2 == null || (var35_34 = var2_2.isEmpty()) != 0 || (var2_2 = var0.getBaseOptions()) == null) ** GOTO lbl-1000
            var7_7 = 0;
            var8_8 = 0.0f;
            var34_33 = null;
            if ((var2_2 = (ProductOption)var2_2.get(0)) == null || (var2_2 = var2_2.getOptions()) == null || (var35_34 = (var2_2 = (Collection)var2_2).isEmpty()) != 0) ** GOTO lbl-1000
            var2_2 = var0.getBaseOptions();
            if (var2_2 != null && (var2_2 = (ProductOption)var2_2.get(0)) != null && (var2_2 = var2_2.getOptions()) != null) {
                var2_2 = (ProductOptionItem)var2_2.get(0);
            } else {
                var35_34 = 0;
                var2_2 = null;
                var36_35 = 0.0f;
            }
            var12_12 = var0.getVariantOptions();
            if (var12_12 != null && (var12_12 = (ProductOptionItem)var12_12.get(0)) != null) {
                var34_33 = var12_12.getVariantOptionQualifiers();
            } else {
                var7_7 = 0;
                var34_33 = null;
                var8_8 = 0.0f;
            }
            if (var2_2 != null) {
                var12_12 = var2_2.getAttributes();
            } else {
                var11_11 = 0;
                var12_12 = null;
            }
            if (var12_12 == null) ** GOTO lbl-1000
            var12_12 = var34_33;
            var12_12 = (Collection)var34_33;
            if (var12_12 != null && (var11_11 = (int)var12_12.isEmpty()) == 0) {
                var2_2 = var2_2.getAttributes();
                Intrinsics.checkNotNull(var2_2);
                var2_2 = var2_2.iterator();
                while (true) {
                    var11_11 = (int)var2_2.hasNext();
                    var16_16 = "size";
                    if (var11_11 == 0) break;
                    var22_22 = "selection2";
                    var12_12 = (ProductOptionVariant)var2_2.next();
                    var19_19 = var12_12.getAttributeName();
                    var17_17 = var22_22.equalsIgnoreCase((String)var19_19);
                    if (var17_17 == 0 || (var19_19 = var12_12.getAttributeValue()) == null || (var17_17 = var19_19.length()) == 0 || (var17_17 = (int)kotlin.text.b.i((String)(var19_19 = var12_12.getAttributeValue()), (String)(var22_22 = "null"), (boolean)var33_32)) != 0 || (var15_15 = kotlin.text.b.i((String)(var19_19 = var12_12.getAttributeValue()), (String)var16_16, (boolean)var33_32))) continue;
                    var10_10 = var12_12.getAttributeValue();
                }
                var2_2 = var34_33.iterator();
                var34_33 = var14_14;
                while ((var11_11 = (int)var2_2.hasNext()) != 0) {
                    var12_12 = (ProductOptionVariant)var2_2.next();
                    if (var10_10 == null || (var17_17 = kotlin.text.b.k((CharSequence)var10_10)) != 0 || (var17_17 = (int)var10_10.equalsIgnoreCase((String)(var19_19 = var12_12.getQualifier()))) == 0 || (var17_17 = (int)var16_16.equalsIgnoreCase((String)var10_10)) != 0 || (var19_19 = var12_12.getName()) == null) continue;
                    var34_33 = var12_12.getName();
                    Intrinsics.checkNotNull(var34_33);
                }
            } else lbl-1000:
            // 4 sources

            {
                var34_33 = var14_14;
            }
            if ((var35_34 = var34_33.length()) > 0) {
                var27_27.setHeaderNotEmpty((boolean)var33_32);
                var2_2 = "Select ".concat((String)var34_33);
                var27_27.setHeaderText((String)var2_2);
            } else {
                var35_34 = R$string.select_size_refresh;
                var2_2 = hv3_0.K(var35_34);
                var27_27.setHeaderText((String)var2_2);
            }
            var2_2 = var0.getVariantOptions();
            var27_27.setVariantOptions((List)var2_2);
            var2_2 = var0.getProductOptionVariants();
            var27_27.setProductOptionVariants((List)var2_2);
            var2_2 = var27_27.getProductOptionVariants();
            if (var2_2 != null && (var35_34 = (var2_2 = (Collection)var2_2).isEmpty() ^ var33_32) == var33_32) {
                var2_2 = var0.getBaseOptions();
                if (var2_2 != null && (var2_2 = (ProductOption)CollectionsKt.firstOrNull((List)var2_2)) != null) {
                    if ((var2_2 = var2_2.getOptions()) != null && (var2_2 = (ProductOptionItem)CollectionsKt.firstOrNull((List)var2_2)) != null) {
                        var34_33 = var2_2.getAttributes();
                        if (var34_33 != null && (var7_7 = (var34_33 = (Collection)var34_33).isEmpty() ^ var33_32) == var33_32) {
                            var2_2 = var2_2.getAttributes();
                            Intrinsics.checkNotNull(var2_2);
                            var2_2 = ((Iterable)var2_2).iterator();
                            var34_33 = var14_14;
                            while ((var9_9 = (int)var2_2.hasNext()) != 0) {
                                var16_16 = "sizeFormat";
                                var10_10 = (ProductOptionVariant)var2_2.next();
                                var12_12 = var10_10.getAttributeName();
                                var11_11 = (int)var16_16.equalsIgnoreCase((String)var12_12);
                                if (var11_11 != 0) {
                                    var14_14 = var12_12 = Y63.e(String.valueOf(var10_10.getAttributeValue()));
                                }
                                if ((var11_11 = (int)(var16_16 = "standardSizeFormat").equalsIgnoreCase((String)(var12_12 = var10_10.getAttributeName()))) == 0) continue;
                                var34_33 = Y63.e(String.valueOf(var10_10.getAttributeValue()));
                            }
                        } else {
                            var34_33 = var14_14;
                        }
                        var2_2 = new Pair(var14_14, var34_33);
                    } else {
                        var2_2 = new Pair(var14_14, var14_14);
                    }
                } else {
                    var2_2 = new Pair(var14_14, var14_14);
                }
                var10_10 = var34_33 = var0.getProductOptionVariants();
                var10_10 = (Collection)var34_33;
                var9_9 = var10_10.isEmpty() ^ var33_32;
                if (var9_9 != 0) {
                    var34_33 = var34_33.iterator();
                    while ((var9_9 = (int)var34_33.hasNext()) != 0) {
                        var10_10 = (ProductOptionVariant)var34_33.next();
                        var12_12 = (String)var2_2.a;
                        var10_10.setBrandSizeFormat((String)var12_12);
                        var12_12 = (String)var2_2.b;
                        var10_10.setUniversalSizeFormat((String)var12_12);
                    }
                }
                var27_27.setPopulateSelectSizeLabel((boolean)var33_32);
            }
        }
        var27_27.setEnableCartClosetSizeLayout((boolean)var33_32);
        var35_34 = (int)var0.getShowSizeLayout();
        var27_27.setShowSizeLayout((boolean)var35_34);
        var2_2 = hv3_0.K(R$string.select_size);
        var27_27.setSizeContentDescription((String)var2_2);
        var2_2 = h40_0.a;
        var35_34 = (int)h40_0.T0();
        var27_27.setRatingEnabledPlp((boolean)var35_34);
        var2_2 = var0.getAverageRating();
        var27_27.setAverageRating((Double)var2_2);
        var2_2 = var0.getRatingCount();
        var2_2 = var2_2 == null ? var0.getNumUserRatings() : var0.getRatingCount();
        var27_27.setProductRatingCount((String)var2_2);
        var35_34 = mz3_0.z();
        if (var35_34 != 0) {
            var27_27.setGwpEnabled((boolean)var33_32);
            var1_1 = var0.getOfferPrice();
            if (var1_1 != null) {
                var1_1 = var1_1.getGiftAvailable();
                var2_2 = Boolean.TRUE;
                var37_36 = Intrinsics.areEqual(var1_1, var2_2);
            } else {
                var37_36 = false;
                var1_1 = null;
            }
            var27_27.setGiftAvailable(var37_36);
            var1_1 = (String)n00.e.getValue();
            var27_27.setGwpFreebiesOneText((String)var1_1);
            var37_36 = og1_1.c();
            var27_27.setLuxeEnabled(var37_36);
            var37_36 = mz3_0.z();
            var27_27.setGWPFeatureEnabledAjioLuxe(var37_36);
        } else {
            var37_37 = false;
            var1_1 = null;
            var27_27.setGwpEnabled(false);
        }
        return var27_27;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static PlpProductUIModel c(Product var0, int var1_1, Boolean var2_2, String var3_3, boolean var4_4, int var5_5) {
        block161: {
            block159: {
                block160: {
                    block158: {
                        block157: {
                            block156: {
                                block155: {
                                    var6_6 = var0;
                                    var7_7 = var1_1;
                                    var8_8 = 2;
                                    var9_9 = 4;
                                    var10_10 = 5.6E-45f;
                                    var11_11 = var5_5 & 4;
                                    var12_12 = false;
                                    var13_13 = 1;
                                    var14_14 = 1.4E-45f;
                                    if (var11_11 != 0) {
                                        var11_11 = 1;
                                    } else {
                                        var11_11 = 0;
                                        var15_15 = null;
                                    }
                                    var16_16 = var5_5 & 8;
                                    if (var16_16 != 0) {
                                        var16_16 = 0;
                                        var17_17 = null;
                                    } else {
                                        var17_17 = var2_2;
                                    }
                                    var18_18 = var5_5 & 16;
                                    if (var18_18 != 0) {
                                        var18_18 = 0;
                                        var19_19 = null;
                                    } else {
                                        var19_19 = var3_3;
                                    }
                                    var20_20 = var5_5 & 32;
                                    var20_20 = var20_20 != 0 ? 0 : (int)var4_4;
                                    var21_21 /* !! */  = "shortText";
                                    Intrinsics.checkNotNullParameter(var6_6, "product");
                                    var23_23 = var22_22;
                                    var24_24 = -1;
                                    var25_25 = -1;
                                    var26_26 = -1;
                                    var27_27 = -1;
                                    var28_28 = -1 >>> 4;
                                    var29_29 = 0;
                                    var30_30 /* !! */  = null;
                                    var31_31 = 0;
                                    var32_32 = null;
                                    var33_33 = false;
                                    var34_34 = 0L;
                                    var22_22 = new PlpProductUIModel(null, null, null, null, null, null, 0, false, null, null, null, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, null, false, null, null, false, false, false, false, false, false, false, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, null, null, false, null, null, null, null, false, false, false, null, null, false, false, false, false, false, null, false, null, false, false, false, false, false, null, false, false, null, null, null, false, false, null, false, null, null, false, null, null, false, null, null, false, null, null, null, null, null, false, var34_34, null, false, null, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, var24_24, var25_25, var26_26, var27_27, var28_28, null);
                                    var23_23 = var0.getName();
                                    var22_22.setProductName((String)var23_23);
                                    var23_23 = var0.getFnlColorVariantData();
                                    if (var23_23 != null) {
                                        var23_23 = var23_23.getBrandName();
                                    } else {
                                        var36_35 = 0;
                                        var37_36 = 0.0f;
                                        var23_23 = null;
                                    }
                                    var22_22.setBrandName((String)var23_23);
                                    var23_23 = var0.getFnlColorVariantData();
                                    if (var23_23 != null) {
                                        var23_23 = var23_23.getColorGroup();
                                    } else {
                                        var36_35 = 0;
                                        var37_36 = 0.0f;
                                        var23_23 = null;
                                    }
                                    var22_22.setProductCode((String)var23_23);
                                    var22_22.setProductTextWrap((boolean)var13_13);
                                    var23_23 = var0.getFnlColorVariantData();
                                    var22_22.setFnlColorVariantData((ProductFnlColorVariantData)var23_23);
                                    var22_22.setProductClicklisteners((boolean)var13_13);
                                    var23_23 = var0.getProductType();
                                    var22_22.setProductType((HomeWidgetTypes)var23_23);
                                    var22_22.setLayoutWidthChangesRequired((boolean)var13_13);
                                    var23_23 = var0.getImages();
                                    if (var23_23 != null && (var36_35 = var23_23.isEmpty()) == 0 && (var23_23 = var0.getImages()) != null) {
                                        block151: {
                                            var23_23 = var23_23.iterator();
                                            while ((var29_29 = var23_23.hasNext()) != 0) {
                                                var38_37 = "mobileProductListingImage";
                                                var30_30 /* !! */  = (ProductImage)var23_23.next();
                                                var32_32 = var30_30 /* !! */ .getFormat();
                                                var39_38 = (int)var38_37.equalsIgnoreCase((String)var32_32);
                                                if (var39_38 == 0) continue;
                                                var38_37 = var30_30 /* !! */ .getUrl();
                                                break block151;
                                            }
                                            var39_38 = 0;
                                            var38_37 = null;
                                        }
                                        var23_23 = var22_22.getProductImageUrl();
                                        if (var23_23 == null) {
                                            var38_37 = var0.getImages();
                                            if (var38_37 != null && (var38_37 = (ProductImage)CollectionsKt.N(0, (List)var38_37)) != null) {
                                                var38_37 = var38_37.getUrl();
                                            } else {
                                                var39_38 = 0;
                                                var38_37 = null;
                                            }
                                        }
                                        var23_23 = Unit.a;
                                    } else {
                                        var39_38 = 0;
                                        var38_37 = null;
                                    }
                                    var38_37 = UrlHelper.Companion.getInstance().getImageUrl((String)var38_37);
                                    var22_22.setProductImageUrl((String)var38_37);
                                    var39_38 = R$string.product_image;
                                    var38_37 = hv3_0.K(var39_38);
                                    var23_23 = var0.getFnlColorVariantData();
                                    if (var23_23 != null) {
                                        var23_23 = var23_23.getBrandName();
                                    } else {
                                        var36_35 = 0;
                                        var37_36 = 0.0f;
                                        var23_23 = null;
                                    }
                                    var30_30 /* !! */  = var0.getName();
                                    var32_32 = "";
                                    if (var30_30 /* !! */  == null) {
                                        var30_30 /* !! */  = var32_32;
                                    }
                                    var40_39 = KW.a((String)var38_37, " of ", (String)var23_23, "-", (String)var30_30 /* !! */ );
                                    var22_22.setProductImageContentDescription((String)var40_39);
                                    var40_39 = new ArrayList();
                                    var41_40 = var0.getExtraImages();
                                    if (var41_40 != null) {
                                        var41_40 = ((Iterable)var41_40).iterator();
                                        while ((var39_38 = (int)var41_40.hasNext()) != 0) {
                                            var38_37 = (ExtraImage)var41_40.next();
                                            var23_23 = var38_37.getImages();
                                            if (var23_23 != null) {
                                                var36_35 = var23_23.size();
                                            } else {
                                                var36_35 = 0;
                                                var37_36 = 0.0f;
                                                var23_23 = null;
                                            }
                                            if (var36_35 <= 0) continue;
                                            var38_37 = var38_37.getImages();
                                            Intrinsics.checkNotNull(var38_37);
                                            var38_37 = var38_37.iterator();
                                            while ((var36_35 = (int)var38_37.hasNext()) != 0) {
                                                var23_23 = (ProductImage)var38_37.next();
                                                var30_30 /* !! */  = UrlHelper.Companion.getInstance();
                                                var23_23 = var23_23.getUrl();
                                                var23_23 = var30_30 /* !! */ .getImageUrl((String)var23_23);
                                                var40_39.add(var23_23);
                                            }
                                        }
                                        var41_40 = Unit.a;
                                    }
                                    var22_22.setExtraImagesUrlList((ArrayList)var40_39);
                                    var40_39 = ih3_1.b;
                                    var41_40 = var0.getFnlColorVariantData();
                                    if (var41_40 != null) {
                                        var41_40 = var41_40.getColorGroup();
                                    } else {
                                        var13_13 = 0;
                                        var14_14 = 0.0f;
                                        var41_40 = null;
                                    }
                                    var9_9 = (int)CollectionsKt.F(var40_39, var41_40);
                                    var22_22.setProductWishlisted((boolean)var9_9);
                                    var9_9 = R$string.added_wishlist_txt;
                                    var41_40 = var0.getFnlColorVariantData();
                                    if (var41_40 == null || (var41_40 = var41_40.getBrandName()) == null) {
                                        var41_40 = var32_32;
                                    }
                                    if ((var38_37 = var0.getName()) == null) {
                                        var38_37 = var32_32;
                                    }
                                    var23_23 = new Object[var8_8];
                                    var23_23[0] = var41_40;
                                    var14_14 = 1.4E-45f;
                                    var23_23[1] = var38_37;
                                    var40_39 = hv3_0.L(var9_9, (Object[])var23_23);
                                    var41_40 = new StringBuilder();
                                    var41_40.append((String)var40_39);
                                    var40_39 = " index ";
                                    var41_40.append((String)var40_39);
                                    var41_40.append(var7_7);
                                    var41_40 = var41_40.toString();
                                    var22_22.setClosetButtonContentDescription((String)var41_40);
                                    var13_13 = R$string.removed_wishlist_txt;
                                    var38_37 = var0.getFnlColorVariantData();
                                    if (var38_37 == null || (var38_37 = var38_37.getBrandName()) == null) {
                                        var38_37 = var32_32;
                                    }
                                    if ((var23_23 = var0.getName()) != null) {
                                        var32_32 = var23_23;
                                    }
                                    var23_23 = new Object[var8_8];
                                    var23_23[0] = var38_37;
                                    var39_38 = 1;
                                    var23_23[var39_38] = var32_32;
                                    var41_40 = hv3_0.L(var13_13, (Object[])var23_23);
                                    var38_37 = new StringBuilder();
                                    var38_37.append((String)var41_40);
                                    var38_37.append((String)var40_39);
                                    var38_37.append(var7_7);
                                    var42_41 = var38_37.toString();
                                    var22_22.setClosetAddedButtonContentDescription((String)var42_41);
                                    var42_41 = h40_0.a;
                                    var7_7 = (int)h40_0.I1();
                                    if (var7_7 != 0) {
                                        var42_41 = var0.getTags();
                                        if (var42_41 != null && (var42_41 = var42_41.getCategoryTags()) != null) {
                                            var42_41 = ((Iterable)var42_41).iterator();
                                            while ((var9_9 = (int)var42_41.hasNext()) != 0) {
                                                var40_39 = (CategoryTags)var42_41.next();
                                                if (var40_39 != null && (var41_40 = var40_39.getCategory()) != null && (var13_13 = (int)var41_40.equalsIgnoreCase((String)(var38_37 = "SOCIAL_PROOFING"))) == (var39_38 = 1)) {
                                                    var13_13 = 1;
                                                    var14_14 = 1.4E-45f;
                                                } else {
                                                    var13_13 = 0;
                                                    var14_14 = 0.0f;
                                                    var41_40 = null;
                                                }
                                                if (var13_13 != 0) {
                                                    block153: {
                                                        block152: {
                                                            var41_40 = var40_39.getPrimary();
                                                            if (var41_40 != null) {
                                                                var41_40 = var41_40.getValue();
                                                            } else {
                                                                var13_13 = 0;
                                                                var14_14 = 0.0f;
                                                                var41_40 = null;
                                                            }
                                                            var41_40 = String.valueOf(var41_40);
                                                            try {
                                                                var38_37 = cp_1.Companion;
                                                            }
                                                            catch (Exception v0) {}
                                                            var40_39 = var40_39.getPrimary();
                                                            if (var40_39 == null) break block152;
                                                            var40_39 = var40_39.getName();
                                                            break block153;
                                                        }
                                                        var9_9 = 0;
                                                        var10_10 = 0.0f;
                                                        var40_39 = null;
                                                    }
                                                    var38_37.getClass();
                                                    var9_9 = (int)cp$a.x((String)var40_39);
                                                    if (var9_9 != 0) continue;
                                                    var40_39 = JsonParser.parseString((String)var41_40);
                                                    if ((var40_39 = var40_39.getAsJsonObject()) == null) continue;
                                                    var13_13 = (int)var40_39.has((String)var21_21 /* !! */ );
                                                    if (var13_13 == 0) continue;
                                                    var41_40 = var40_39.get((String)var21_21 /* !! */ );
                                                    var41_40 = var41_40.getAsString();
                                                    var22_22.setWishlistCountShortText((String)var41_40);
                                                    var41_40 = "longText";
                                                    var40_39 = var40_39.get((String)var41_40);
                                                    var40_39 = var40_39.getAsString();
                                                    var22_22.setWishlistCountLongText((String)var40_39);
                                                    var9_9 = 1;
                                                    var10_10 = 1.4E-45f;
                                                    var22_22.setWishlistCountAvailable((boolean)var9_9);
                                                    continue;
                                                }
                                                var22_22.setWishlistCountAvailable(false);
                                            }
                                            var42_41 = Unit.a;
                                        }
                                    } else {
                                        var22_22.setWishlistCountAvailable(false);
                                        var42_41 = Unit.a;
                                    }
                                    var7_7 = (int)h40_0.Q1();
                                    var22_22.setPrioritydeliveryFeatureEnable((boolean)var7_7);
                                    var42_41 = h40_0.a.g0();
                                    if (var42_41 != null) {
                                        var40_39 = var22_22.getFnlColorVariantData();
                                        if (var40_39 != null) {
                                            var40_39 = var40_39.getDeliverySlaTag();
                                        } else {
                                            var9_9 = 0;
                                            var10_10 = 0.0f;
                                            var40_39 = null;
                                        }
                                        var42_41 = (String)var42_41.get(var40_39);
                                    } else {
                                        var7_7 = 0;
                                        var43_42 = 0.0f;
                                        var42_41 = null;
                                    }
                                    var22_22.setDeliverySlaTag((String)var42_41);
                                    var42_41 = od3_2.a();
                                    var40_39 = ld3_2.STORE_AJIOGRAM.getStoreId();
                                    var7_7 = Intrinsics.areEqual(var42_41, var40_39);
                                    if (var7_7 != 0) {
                                        var7_7 = 1;
                                        var43_42 = 1.4E-45f;
                                        var22_22.setAjiogramStoreId((boolean)var7_7);
                                    } else {
                                        var7_7 = 1;
                                        var43_42 = 1.4E-45f;
                                    }
                                    var40_39 = var0.getPrice();
                                    var38_37 = "format(...)";
                                    var21_21 /* !! */  = "getString(...)";
                                    if (var40_39 == null) break block155;
                                    var22_22.setShowFinalPrice((boolean)var7_7);
                                    var42_41 = qz2_0.r(var0.getPrice());
                                    var22_22.setFinalPriceValue((String)var42_41);
                                    var42_41 = StringCompanionObject.INSTANCE;
                                    AJIOApplication.Companion.getClass();
                                    var42_41 = AJIOApplication$a.a().getResources();
                                    var9_9 = R$string.acc_plp_final_price;
                                    var42_41 = var42_41.getString(var9_9);
                                    Intrinsics.checkNotNullExpressionValue(var42_41, (String)var21_21 /* !! */ );
                                    var40_39 = qz2_0.r(var0.getPrice());
                                    var36_35 = 1;
                                    var37_36 = 1.4E-45f;
                                    var30_30 /* !! */  = new Object[var36_35];
                                    var30_30 /* !! */ [0] = var40_39;
                                    var40_39 = Arrays.copyOf(var30_30 /* !! */ , var36_35);
                                    var42_41 = String.format((String)var42_41, (Object[])var40_39);
                                    Intrinsics.checkNotNullExpressionValue(var42_41, (String)var38_37);
                                    var22_22.setFinalPriceContentDescription((String)var42_41);
                                    var42_41 = var0.getWasPriceData();
                                    if (var42_41 == null) ** GOTO lbl-1000
                                    var40_39 = var42_41.getValue();
                                    if (var40_39 != null) {
                                        var10_10 = Float.parseFloat((String)var40_39);
                                    } else {
                                        var9_9 = 0;
                                        var10_10 = 0.0f;
                                        var40_39 = null;
                                    }
                                    var23_23 = var0.getPrice();
                                    if (var23_23 != null && (var23_23 = var23_23.getValue()) != null) {
                                        var37_36 = Float.parseFloat((String)var23_23);
                                    } else {
                                        var36_35 = 0;
                                        var37_36 = 0.0f;
                                        var23_23 = null;
                                    }
                                    var9_9 = Float.compare(var10_10, var37_36);
                                    if (var9_9 > 0) {
                                        var40_39 = qz2_0.s(mz3_0.h(var42_41.getValue()));
                                        var23_23 = new SpannableString((CharSequence)var40_39);
                                        var30_30 /* !! */  = new StrikethroughSpan();
                                        var31_31 = var40_39.length();
                                        var23_23.setSpan((Object)var30_30 /* !! */ , 0, var31_31, 33);
                                        var41_40 = var0.getPrice();
                                        var42_41 = qz2_0.g((Price)var41_40, (Price)var42_41);
                                        var13_13 = 1;
                                        var14_14 = 1.4E-45f;
                                        var22_22.setShowDiscountPrice((boolean)var13_13);
                                        var22_22.setShowMrpPrice((boolean)var13_13);
                                        var22_22.setMrpPriceValue((SpannableString)var23_23);
                                        var23_23 = AJIOApplication$a.a().getResources();
                                        var29_29 = R$string.acc_plp_original_price;
                                        var23_23 = var23_23.getString(var29_29);
                                        Intrinsics.checkNotNullExpressionValue(var23_23, (String)var21_21 /* !! */ );
                                        var30_30 /* !! */  = new Object[var13_13];
                                        var30_30 /* !! */ [0] = var40_39;
                                        var40_39 = Arrays.copyOf(var30_30 /* !! */ , var13_13);
                                        var40_39 = String.format((String)var23_23, (Object[])var40_39);
                                        Intrinsics.checkNotNullExpressionValue(var40_39, (String)var38_37);
                                        var22_22.setMrpPriceContentDescription((String)var40_39);
                                        var40_39 = var0.getDiscountPercent();
                                        var9_9 = (int)TextUtils.isEmpty((CharSequence)var40_39);
                                        if (var9_9 == 0) {
                                            var40_39 = AJIOApplication$a.a().getResources();
                                            var13_13 = R$string.acc_plp_discount_price;
                                            var40_39 = var40_39.getString(var13_13);
                                            Intrinsics.checkNotNullExpressionValue(var40_39, (String)var21_21 /* !! */ );
                                            var13_13 = 1;
                                            var14_14 = 1.4E-45f;
                                            var23_23 = new Object[var13_13];
                                            var23_23[0] = var42_41;
                                            var42_41 = Arrays.copyOf(var23_23, var13_13);
                                            var42_41 = String.format((String)var40_39, (Object[])var42_41);
                                            Intrinsics.checkNotNullExpressionValue(var42_41, (String)var38_37);
                                            var22_22.setDiscountPriceContentDescription((String)var42_41);
                                            var42_41 = var0.getDiscountPercent();
                                            var22_22.setDiscountPriceValue((String)var42_41);
                                        } else {
                                            var9_9 = TextUtils.isEmpty((CharSequence)var42_41);
                                            if (var9_9 == 0) {
                                                var40_39 = AJIOApplication$a.a().getResources();
                                                var13_13 = R$string.acc_plp_discount_price;
                                                var40_39 = var40_39.getString(var13_13);
                                                Intrinsics.checkNotNullExpressionValue(var40_39, (String)var21_21 /* !! */ );
                                                var13_13 = 1;
                                                var14_14 = 1.4E-45f;
                                                var23_23 = new Object[var13_13];
                                                var23_23[0] = var42_41;
                                                var23_23 = Arrays.copyOf(var23_23, var13_13);
                                                var40_39 = String.format((String)var40_39, (Object[])var23_23);
                                                Intrinsics.checkNotNullExpressionValue(var40_39, (String)var38_37);
                                                var22_22.setDiscountPriceContentDescription((String)var40_39);
                                                var40_39 = new StringBuilder();
                                                var40_39.append((String)var42_41);
                                                var40_39.append("% OFF");
                                                var42_41 = var40_39.toString();
                                                var22_22.setDiscountPriceValue((String)var42_41);
                                            } else {
                                                var22_22.setShowDiscountPrice(false);
                                            }
                                        }
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var22_22.setShowMrpPrice(false);
                                        var22_22.setShowDiscountPrice(false);
                                    }
                                    break block156;
                                }
                                var22_22.setShowFinalPrice(false);
                            }
                            var42_41 = el1_2.a;
                            var7_7 = el1_2.l();
                            if (var7_7 != 0 && (var42_41 = var0.getAdsData()) != null) {
                                var7_7 = 1;
                                var43_42 = 1.4E-45f;
                                var22_22.setShowAdTag((boolean)var7_7);
                                var22_22.setShowProductTags(false);
lbl412:
                                // 2 sources

                                while (true) {
                                    var7_7 = 1;
                                    var43_42 = 1.4E-45f;
                                    break;
                                }
                            } else {
                                var42_41 = hv3_0.a;
                                var40_39 = var0.getFnlColorVariantData();
                                var42_41.getClass();
                                var42_41 = hv3_0.z((Product)var6_6, (ProductFnlColorVariantData)var40_39);
                                var40_39 = hv3_0.A(var0.getFnlColorVariantData());
                                var41_40 = n00.f(var0);
                                var36_35 = (int)h40_0.W0();
                                var29_29 = hv3_0.V(var0);
                                if (var36_35 == 0 || var29_29 == 0) {
                                    var42_41 = var40_39;
                                }
                                var40_39 = n00.d((Pair)var41_40, (String)var40_39, (boolean)var36_35, (boolean)var29_29);
                                if (var42_41 == null && (var13_13 = (var41_40 = (Boolean)var41_40.a).booleanValue()) == 0) {
                                    var22_22.setShowProductTags(false);
                                    ** continue;
                                }
                                if (var36_35 == 0) {
                                    var42_41 = var40_39;
                                }
                                var22_22.setProductTagViewContentDescription((String)var42_41);
                                var22_22.setProductTagValue((String)var40_39);
                                var7_7 = 1;
                                var43_42 = 1.4E-45f;
                                var22_22.setShowProductTags((boolean)var7_7);
                            }
                            var9_9 = (int)var0.isDODEnabled();
                            if (var9_9 == var7_7) {
                                var44_43 = var0.getDodEndTime();
                                var22_22.setDodEndTime(var44_43);
                                var22_22.setDodEnabled((boolean)var7_7);
                                var42_41 = Calendar.getInstance(TimeZone.getTimeZone("IST"));
                                var44_43 = var42_41.getTimeInMillis();
                                var46_44 = var0.getDodEndTime();
                                var7_7 = var44_43 == var46_44 ? 0 : (var44_43 < var46_44 ? -1 : 1);
                                if (var7_7 < 0) {
                                    var42_41 = qz2_0.r(var0.getDodPriceData());
                                    var40_39 = StringCompanionObject.INSTANCE;
                                    AJIOApplication.Companion.getClass();
                                    var40_39 = AJIOApplication$a.a();
                                    var13_13 = R$string.deal_price_plp;
                                    var40_39 = var40_39.getString(var13_13);
                                    Intrinsics.checkNotNullExpressionValue(var40_39, (String)var21_21 /* !! */ );
                                    var13_13 = 1;
                                    var14_14 = 1.4E-45f;
                                    var23_23 = new Object[var13_13];
                                    var23_23[0] = var42_41;
                                    var42_41 = Arrays.copyOf(var23_23, var13_13);
                                    var42_41 = String.format((String)var40_39, (Object[])var42_41);
                                    Intrinsics.checkNotNullExpressionValue(var42_41, (String)var38_37);
                                    var22_22.setOfferPriceValue((String)var42_41);
                                    var22_22.setShowOfferPrice((boolean)var13_13);
                                    var42_41 = AJIOApplication$a.a().getResources();
                                    var9_9 = R$string.acc_plp_offer_price;
                                    var42_41 = var42_41.getString(var9_9);
                                    Intrinsics.checkNotNullExpressionValue(var42_41, (String)var21_21 /* !! */ );
                                    var40_39 = var0.getDodPriceData();
                                    var23_23 = new Object[var13_13];
                                    var23_23[0] = var40_39;
                                    var40_39 = Arrays.copyOf(var23_23, var13_13);
                                    var42_41 = String.format((String)var42_41, (Object[])var40_39);
                                    Intrinsics.checkNotNullExpressionValue(var42_41, (String)var38_37);
                                    var22_22.setOfferPriceContentDescription((String)var42_41);
                                    var22_22.setSetDiscountColor((boolean)var13_13);
                                } else {
                                    var13_13 = 1;
                                    var14_14 = 1.4E-45f;
                                    var22_22.setDodEnabled(false);
                                    var22_22.setSetOfferPrice((boolean)var13_13);
                                }
                            } else {
                                var13_13 = 1;
                                var14_14 = 1.4E-45f;
                                var22_22.setDodEnabled(false);
                                var22_22.setSetOfferPrice((boolean)var13_13);
                            }
                            var7_7 = h40_0.L1();
                            var40_39 = var0.getOfferPrice();
                            if (var40_39 != null) {
                                var40_39 = var40_39.getFormattedValue();
                            } else {
                                var9_9 = 0;
                                var10_10 = 0.0f;
                                var40_39 = null;
                            }
                            var40_39 = qz2_0.n((String)var40_39);
                            var13_13 = var22_22.getSetOfferPrice();
                            if (var13_13 == 0 || (var13_13 = n00.g()) != 0 || (var41_40 = var0.getOfferPrice()) == null || var7_7 == 0) ** GOTO lbl-1000
                            var42_41 = var0.getPrice();
                            if (var42_41 != null) {
                                var42_41 = var42_41.getFormattedValue();
                            } else {
                                var7_7 = 0;
                                var43_42 = 0.0f;
                                var42_41 = null;
                            }
                            var42_41 = qz2_0.n((String)var42_41);
                            var7_7 = (int)Intrinsics.areEqual(var40_39, var42_41);
                            if (var7_7 == 0) {
                                var7_7 = (int)var22_22.isPlpBargainUrgencyTagEnabled();
                                if (var7_7 != 0) {
                                    var42_41 = var22_22.getBargainUrgencyTagValue();
                                    if (var42_41 != null) {
                                        var41_40 = " :";
                                        var42_41 = cP.a((String)var42_41, (String)var41_40, (String)var40_39);
                                        var40_39 = Unit.a;
                                    } else {
                                        var42_41 = StringCompanionObject.INSTANCE;
                                        AJIOApplication.Companion.getClass();
                                        var42_41 = AJIOApplication$a.a();
                                        var13_13 = R$string.plp_offer_price;
                                        var42_41 = var42_41.getString(var13_13);
                                        Intrinsics.checkNotNullExpressionValue(var42_41, (String)var21_21 /* !! */ );
                                        var13_13 = 1;
                                        var14_14 = 1.4E-45f;
                                        var21_21 /* !! */  = new Object[var13_13];
                                        var21_21 /* !! */ [0] = var40_39;
                                        var42_41 = xh2_0.a(var21_21 /* !! */ , var13_13, (String)var42_41, (String)var38_37);
                                        var40_39 = Unit.a;
                                    }
                                } else {
                                    var13_13 = 1;
                                    var14_14 = 1.4E-45f;
                                    var42_41 = StringCompanionObject.INSTANCE;
                                    AJIOApplication.Companion.getClass();
                                    var42_41 = AJIOApplication$a.a();
                                    var36_35 = R$string.plp_offer_price;
                                    var42_41 = var42_41.getString(var36_35);
                                    Intrinsics.checkNotNullExpressionValue(var42_41, (String)var21_21 /* !! */ );
                                    var21_21 /* !! */  = new Object[var13_13];
                                    var21_21 /* !! */ [0] = var40_39;
                                    var42_41 = xh2_0.a(var21_21 /* !! */ , var13_13, (String)var42_41, (String)var38_37);
                                }
                                var40_39 = cp_1.Companion;
                                var40_39.getClass();
                                var9_9 = (int)cp$a.o();
                                if (var9_9 != 0) {
                                    var7_7 = (int)var22_22.isPlpBargainUrgencyTagEnabled();
                                    if (var7_7 != 0) {
                                        var42_41 = var22_22.getBargainUrgencyTagValue();
                                        if (var42_41 == null) {
                                            var7_7 = R$string.offer_price_message;
                                            var42_41 = hv3_0.K(var7_7);
                                        }
                                    } else {
                                        var7_7 = R$string.offer_price_message;
                                        var42_41 = hv3_0.K(var7_7);
                                    }
                                    if ((var40_39 = var0.getOfferPrice()) != null) {
                                        var40_39 = var40_39.getFormattedValue();
                                    } else {
                                        var9_9 = 0;
                                        var10_10 = 0.0f;
                                        var40_39 = null;
                                    }
                                    var40_39 = qz2_0.x(Float.valueOf(Float.parseFloat(mz3_0.h((String)var40_39))));
                                    var41_40 = new StringBuilder();
                                    var41_40.append((String)var42_41);
                                    var41_40.append(" ");
                                    var41_40.append((String)var40_39);
                                    var42_41 = var41_40.toString();
                                    var9_9 = 1;
                                    var10_10 = 1.4E-45f;
                                    var22_22.setSetOfferPriceDrawable((boolean)var9_9);
                                } else {
                                    var9_9 = 1;
                                    var10_10 = 1.4E-45f;
                                }
                                var22_22.setOfferPriceValue((String)var42_41);
                                var22_22.setShowOfferPrice((boolean)var9_9);
                                var22_22.setSetDiscountColor((boolean)var9_9);
                                var22_22.setOfferPriceContentDescription((String)var42_41);
                            } else lbl-1000:
                            // 2 sources

                            {
                                var9_9 = 1;
                                var10_10 = 1.4E-45f;
                                var22_22.setShowOfferPrice(false);
                                var22_22.setSetDiscountColor((boolean)var9_9);
                            }
                            var7_7 = h40_0.H1();
                            if (var7_7 == 0) break block157;
                            var22_22.setPlpUrgencyTagEnabled(false);
                            var42_41 = var0.getTags();
                            if (var42_41 == null || (var42_41 = var42_41.getCategoryTags()) == null) break block158;
                            var42_41 = ((Iterable)var42_41).iterator();
                            var9_9 = 0;
                            var10_10 = 0.0f;
                            var40_39 = null;
                            while ((var13_13 = (int)var42_41.hasNext()) != 0) {
                                block154: {
                                    var41_40 = (CategoryTags)var42_41.next();
                                    if (var41_40 == null || (var38_37 = var41_40.getCategory()) == null) ** GOTO lbl606
                                    var21_21 /* !! */  = "URGENCY";
                                    var39_38 = (int)var38_37.equalsIgnoreCase((String)var21_21 /* !! */ );
                                    if (var39_38 == (var48_45 = 1)) {
                                        var33_33 = true;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            var33_33 = false;
                                            break block154;
                                            break;
                                        }
lbl606:
                                        // 1 sources

                                        var48_45 = 1;
                                        ** continue;
                                    }
                                }
                                if (var33_33) {
                                    var22_22.setPlpUrgencyTagEnabled((boolean)var48_45);
                                    var40_39 = var41_40.getPrimary();
                                    if (var40_39 != null) {
                                        var40_39 = var40_39.getValue();
                                    } else {
                                        var9_9 = 0;
                                        var10_10 = 0.0f;
                                        var40_39 = null;
                                    }
                                    var40_39 = String.valueOf(var40_39);
                                    var22_22.setUrgencyTagValue((String)var40_39);
                                    var9_9 = 1;
                                    var10_10 = 1.4E-45f;
                                    continue;
                                }
                                if (var9_9 != 0) continue;
                                var22_22.setPlpUrgencyTagEnabled(false);
                            }
                            var42_41 = Unit.a;
                            break block158;
                        }
                        var22_22.setPlpUrgencyTagEnabled(false);
                        var42_41 = Unit.a;
                    }
                    if (var11_11 == 0) break block159;
                    var22_22.setShowSizeView((boolean)var11_11);
                    var42_41 = h40_0.a;
                    var42_41 = z40_0.Companion;
                    var42_41 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var42_41).a;
                    var40_39 = "plp_sizes_enable";
                    var7_7 = (int)var42_41.a((String)var40_39);
                    if (var7_7 == 0) break block160;
                    var42_41 = var0.getProductSizeData();
                    if (var42_41 != null) {
                        var42_41 = var42_41.getSizeVariants();
                    } else {
                        var7_7 = 0;
                        var43_42 = 0.0f;
                        var42_41 = null;
                    }
                    if (var42_41 != null && (var7_7 = (int)var42_41.isEmpty()) == 0) {
                        var7_7 = 0;
                        var43_42 = 0.0f;
                        var42_41 = null;
                    } else {
                        var7_7 = 1;
                        var43_42 = 1.4E-45f;
                    }
                    if (var7_7 != 0) break block160;
                    var7_7 = 1;
                    var43_42 = 1.4E-45f;
                    var22_22.setShowSizeLayout((boolean)var7_7);
                    var40_39 = var0.getProductSizeData();
                    if (var40_39 == null || (var40_39 = var40_39.getSizeVariants()) == null) break block161;
                    var15_15 = (String)CollectionsKt.N(0, (List)var40_39);
                    if (var15_15 != null) {
                        var11_11 = var15_15.length();
                    } else {
                        var11_11 = 0;
                        var15_15 = null;
                    }
                    var22_22.setShowSizeFirstView((boolean)var7_7);
                    var41_40 = (String)CollectionsKt.N(0, (List)var40_39);
                    var22_22.setSizeFirstViewText((String)var41_40);
                    var13_13 = var40_39.size();
                    if (var13_13 <= var7_7) ** GOTO lbl-1000
                    var13_13 = 6;
                    var14_14 = 8.4E-45f;
                    if (var11_11 <= var13_13) {
                        var15_15 = (String)var40_39.get(var7_7);
                        if (var15_15 != null) {
                            var11_11 = var15_15.length();
                            var15_15 = var11_11;
                        } else {
                            var11_11 = 0;
                            var15_15 = null;
                        }
                        Intrinsics.checkNotNull(var15_15);
                        var11_11 = var15_15.intValue();
                        var22_22.setShowSizeSecondView((boolean)var7_7);
                        var41_40 = (String)CollectionsKt.N(var7_7, (List)var40_39);
                        var22_22.setSizeSecondViewText((String)var41_40);
                        var7_7 = 2;
                        var43_42 = 2.8E-45f;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var7_7 = 1;
                        var43_42 = 1.4E-45f;
                    }
                    var13_13 = var40_39.size();
                    if (var13_13 <= var8_8) ** GOTO lbl-1000
                    var13_13 = 4;
                    var14_14 = 5.6E-45f;
                    if (var11_11 < var13_13) {
                        var15_15 = (String)var40_39.get(var8_8);
                        if (var15_15 != null) {
                            var11_11 = var15_15.length();
                            var15_15 = var11_11;
                        } else {
                            var11_11 = 0;
                            var15_15 = null;
                        }
                        Intrinsics.checkNotNull(var15_15);
                        var11_11 = var15_15.intValue();
                        var13_13 = 1;
                        var14_14 = 1.4E-45f;
                        var22_22.setShowSizeThirdView((boolean)var13_13);
                        var49_46 = (String)CollectionsKt.N(var8_8, (List)var40_39);
                        var22_22.setSizeThirdViewText(var49_46);
                        var7_7 += var13_13;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var13_13 = 1;
                        var14_14 = 1.4E-45f;
                    }
                    var8_8 = var40_39.size();
                    var39_38 = 3;
                    if (var8_8 > var39_38 && var11_11 < var39_38) {
                        var22_22.setShowSizeFourthView((boolean)var13_13);
                        var49_46 = (String)CollectionsKt.N(var39_38, (List)var40_39);
                        var22_22.setSizeFourthViewText(var49_46);
                        var7_7 += var13_13;
                    }
                    if ((var8_8 = var40_39.size() - var7_7) > 0) {
                        var40_39 = "+";
                        var42_41 = new StringBuilder((String)var40_39);
                        var42_41.append(var8_8);
                        var42_41 = var42_41.toString();
                        var8_8 = 1;
                        var22_22.setShowSizeCount((boolean)var8_8);
                        var22_22.setSizeCountText((String)var42_41);
                    } else {
                        var22_22.setShowSizeCount(false);
                    }
                    var42_41 = Unit.a;
                    break block161;
                }
                var22_22.setShowSizeLayout(false);
                var42_41 = Unit.a;
                break block161;
            }
            var22_22.setShowSizeView(false);
            var22_22.setShowSizeLayout(false);
            var42_41 = Unit.a;
        }
        if ((var42_41 = var0.getWasPriceData()) != null) {
            var42_41 = var0.getWasPriceData();
            if (var42_41 != null) {
                var42_41 = var42_41.getValue();
            } else {
                var7_7 = 0;
                var43_42 = 0.0f;
                var42_41 = null;
            }
            var7_7 = (int)TextUtils.isEmpty((CharSequence)var42_41);
            if (var7_7 == 0) {
                var42_41 = var0.getWasPriceData();
                if (var42_41 != null && (var42_41 = var42_41.getValue()) != null && (var42_41 = je3_2.e((String)var42_41)) != null) {
                    var43_42 = var42_41.floatValue();
                } else {
                    var7_7 = 0;
                    var43_42 = 0.0f;
                    var42_41 = null;
                }
                var42_41 = Float.valueOf(var43_42);
                var22_22.setWasPriceValue((Float)var42_41);
            }
        }
        if ((var42_41 = var0.getPrice()) != null) {
            var42_41 = var0.getPrice();
            if (var42_41 != null) {
                var42_41 = var42_41.getValue();
            } else {
                var7_7 = 0;
                var43_42 = 0.0f;
                var42_41 = null;
            }
            var7_7 = (int)TextUtils.isEmpty((CharSequence)var42_41);
            if (var7_7 == 0) {
                var42_41 = var0.getPrice();
                if (var42_41 != null && (var42_41 = var42_41.getValue()) != null && (var42_41 = je3_2.e((String)var42_41)) != null) {
                    var14_14 = var42_41.floatValue();
                } else {
                    var13_13 = 0;
                    var14_14 = 0.0f;
                    var41_40 = null;
                }
                var42_41 = Float.valueOf(var14_14);
                var22_22.setPriceValue((Float)var42_41);
            }
        }
        if ((var42_41 = var0.getOfferPrice()) != null && (var42_41 = var42_41.getPriceReveal()) != null) {
            var42_41 = var42_41.getBestPrice();
        } else {
            var7_7 = 0;
            var43_42 = 0.0f;
            var42_41 = null;
        }
        if (var42_41 != null) {
            var42_41 = var0.getOfferPrice();
            if (var42_41 != null && (var42_41 = var42_41.getPriceReveal()) != null) {
                var42_41 = var42_41.getBestPrice();
            } else {
                var7_7 = 0;
                var43_42 = 0.0f;
                var42_41 = null;
            }
            var22_22.setBestPriceValue((Float)var42_41);
        }
        if ((var42_41 = var0.getOfferPrice()) != null) {
            var42_41 = var42_41.getValue();
        } else {
            var7_7 = 0;
            var43_42 = 0.0f;
            var42_41 = null;
        }
        var22_22.setOfferPrice((String)var42_41);
        var42_41 = var0.getOfferPrice();
        if (var42_41 != null && (var42_41 = var42_41.getPriceReveal()) != null) {
            var38_37 = var42_41.getDiscountPercent();
        } else {
            var39_38 = 0;
            var38_37 = null;
        }
        var22_22.setDiscountPercentValue((String)var38_37);
        if (var17_17 == null) {
            var42_41 = "Similar Products";
            var7_7 = (int)Intrinsics.areEqual(var19_19, var42_41);
            if (var7_7 != 0) {
                var42_41 = h40_0.a;
                var7_7 = h40_0.b2();
            } else {
                var42_41 = h40_0.a;
                var7_7 = h40_0.T1();
            }
            var22_22.setRatingEnabledPlp((boolean)var7_7);
        } else if (var20_20 != 0) {
            var7_7 = 1;
            var43_42 = 1.4E-45f;
            var22_22.setRatingEnabledPlp((boolean)var7_7);
        }
        var42_41 = h40_0.a;
        var7_7 = (int)h40_0.T1();
        var22_22.setRatingEnabledPlp((boolean)var7_7);
        var42_41 = var0.getAverageRating();
        var22_22.setAverageRating((Double)var42_41);
        var42_41 = var0.getRatingCount();
        var42_41 = var42_41 == null ? var0.getNumUserRatings() : var0.getRatingCount();
        var22_22.setProductRatingCount((String)var42_41);
        var7_7 = 1;
        var43_42 = 1.4E-45f;
        var22_22.setEnableRatingView((boolean)var7_7);
        var8_8 = (int)h40_0.W0();
        if (var8_8 != 0 && (var8_8 = (int)var0.isComingSoonProduct()) != 0) {
            var22_22.setComingSoonEnable((boolean)var7_7);
        }
        if ((var8_8 = (int)mz3_0.z()) != 0) {
            var22_22.setGwpEnabled((boolean)var7_7);
            var6_6 = var0.getOfferPrice();
            if (var6_6 != null) {
                var6_6 = var6_6.getGiftAvailable();
                var42_41 = Boolean.TRUE;
                var12_12 = Intrinsics.areEqual(var6_6, var42_41);
            }
            var22_22.setGiftAvailable(var12_12);
            var6_6 = (String)n00.e.getValue();
            var22_22.setGwpFreebiesOneText((String)var6_6);
            var50_47 = og1_1.c();
            var22_22.setLuxeEnabled(var50_47);
            var50_47 = mz3_0.z();
            var22_22.setGWPFeatureEnabledAjioLuxe(var50_47);
lbl853:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var22_22.setGwpEnabled(false);
        ** while (true)
        var50_47 = true;
        var22_22.setEnableWishlistView(var50_47);
        var22_22.setEnableComingSoonProducts(var50_47);
        var22_22.setShowOODEnable(var50_47);
        var22_22.setEnableFreebie(var50_47);
        var22_22.setSellingFastTag(var50_47);
        return var22_22;
    }

    public static String d(Pair object, String object2, boolean bl2, boolean bl3) {
        if (bl2 && bl3) {
            return object2;
        }
        Boolean bl4 = (Boolean)((Pair)object).a;
        bl2 = bl4;
        if (bl2) {
            object2 = object = ((Pair)object).b;
            object2 = (String)object;
        }
        return object2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static PlpProductUIModel e(Product var0, int var1_1, boolean var2_2, Long var3_3, int var4_4) {
        block94: {
            block93: {
                var5_5 = var0;
                var6_6 = 1;
                var7_7 = false;
                var8_8 = var4_4 & 8;
                if (var8_8 != 0) {
                    var8_8 = 0;
                    var9_9 = 0.0f;
                    var10_10 /* !! */  = null;
                } else {
                    var8_8 = (int)var2_2;
                }
                Intrinsics.checkNotNullParameter(var5_5, "product");
                var12_12 = var11_11;
                var13_13 = -1;
                var14_14 = -1;
                var15_15 = -1;
                var16_16 = -1;
                var17_17 = -1 >>> 4;
                var18_18 = 0.0f;
                var19_19 = null;
                var20_20 = 0;
                var21_21 = null;
                var22_22 = 0;
                var23_23 = 0.0f;
                var24_24 /* !! */  = null;
                var25_25 = false;
                var26_26 = null;
                var27_27 = false;
                var28_28 = null;
                var29_29 = 0;
                var30_30 = 0.0f;
                var31_31 = null;
                var32_32 = 0;
                var33_33 = 0.0f;
                var34_34 = null;
                var35_35 = 0;
                var36_36 = null;
                var37_37 = 0;
                var38_38 = 0;
                var39_39 = 0L;
                var11_11 = new PlpProductUIModel(null, null, null, null, null, null, 0, false, null, null, null, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, null, false, null, null, false, false, false, false, false, false, false, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, null, null, false, null, null, null, null, false, false, false, null, null, false, false, false, false, false, null, false, null, false, false, false, false, false, null, false, false, null, null, null, false, false, null, false, null, null, false, null, null, false, null, null, false, null, null, null, null, null, false, var39_39, null, false, null, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, var13_13, var14_14, var15_15, var16_16, var17_17, null);
                var11_11.setRecentlyWidgetEnable((boolean)var6_6);
                var12_12 = var0.getName();
                var11_11.setProductName((String)var12_12);
                var12_12 = var0.getFnlColorVariantData();
                if (var12_12 != null) {
                    var12_12 = var12_12.getBrandName();
                } else {
                    var41_40 = 0;
                    var12_12 = null;
                }
                var11_11.setBrandName((String)var12_12);
                var12_12 = var0.getFnlColorVariantData();
                if (var12_12 != null) {
                    var12_12 = var12_12.getColorGroup();
                } else {
                    var41_40 = 0;
                    var12_12 = null;
                }
                var11_11.setProductCode((String)var12_12);
                var12_12 = var0.getProductType();
                var11_11.setProductType((HomeWidgetTypes)var12_12);
                var11_11.setProductTextWrap((boolean)var6_6);
                var12_12 = var0.getFnlColorVariantData();
                var11_11.setFnlColorVariantData((ProductFnlColorVariantData)var12_12);
                var12_12 = var11_11.getFnlColorVariantData();
                var21_21 = "-";
                var24_24 /* !! */  = " of ";
                if (var12_12 != null && (var41_40 = var12_12.isAllPromotions()) == var6_6) {
                    var11_11.setAllPromotions((boolean)var6_6);
                    var41_40 = R$string.product_image;
                    var12_12 = hv3_0.K(var41_40);
                    var26_26 = var0.getFnlColorVariantData();
                    if (var26_26 != null) {
                        var26_26 = var26_26.getBrandName();
                    } else {
                        var25_25 = false;
                        var26_26 = null;
                    }
                    var28_28 = var0.getName();
                    var12_12 = KW.a((String)var12_12, (String)var24_24 /* !! */ , (String)var26_26, (String)var21_21, (String)var28_28);
                    var11_11.setPromoContentDescription((String)var12_12);
                    var12_12 = UrlHelper.Companion.getInstance();
                    var26_26 = new Object[]{};
                    var28_28 = "misc";
                    var31_31 = "plp_offer_imv";
                    var12_12 = var12_12.getApiUrl((String)var28_28, (String)var31_31, (Object[])var26_26);
                    var11_11.setPromoImageurl((String)var12_12);
                }
                var11_11.setRecentViewclickListners((boolean)var6_6);
                var12_12 = hv3_0.K(R$string.acc_banner);
                var11_11.setAccBannerDesc((String)var12_12);
                var11_11.setRecentlyViewLayoutChanges((boolean)var6_6);
                var11_11.setPromoImageAvailable((boolean)var6_6);
                var11_11.setPriceValueChanges((boolean)var6_6);
                var11_11.setShowOfferPrice((boolean)var6_6);
                var11_11.setEnableFreebie((boolean)var6_6);
                var12_12 = el1_2.a;
                var41_40 = (int)el1_2.l();
                if (var41_40 != 0 && (var12_12 = var0.getAdsData()) != null) {
                    var11_11.setShowAdTag((boolean)var6_6);
                    var11_11.setShowProductTags(false);
                } else {
                    var12_12 = hv3_0.a;
                    var26_26 = var0.getFnlColorVariantData();
                    var12_12.getClass();
                    var12_12 = hv3_0.z((Product)var5_5, (ProductFnlColorVariantData)var26_26);
                    var26_26 = hv3_0.A(var0.getFnlColorVariantData());
                    var28_28 = n00.f(var0);
                    var31_31 = h40_0.a;
                    var29_29 = h40_0.W0();
                    var32_32 = hv3_0.V(var0);
                    if (var29_29 == 0 || var32_32 == 0) {
                        var12_12 = var26_26;
                    }
                    var26_26 = n00.d((Pair)var28_28, (String)var26_26, (boolean)var29_29, (boolean)var32_32);
                    if (var12_12 == null && !(var27_27 = (var28_28 = (Boolean)var28_28.a).booleanValue())) {
                        var11_11.setShowProductTags(false);
                    } else {
                        if (var29_29 == 0) {
                            var12_12 = var26_26;
                        }
                        var11_11.setProductTagViewContentDescription((String)var12_12);
                        var11_11.setProductTagValue((String)var26_26);
                        var11_11.setShowProductTags((boolean)var6_6);
                    }
                }
                var12_12 = hv3_0.K(R$string.product_image);
                var26_26 = var0.getBrandName();
                var28_28 = var0.getName();
                var12_12 = KW.a((String)var12_12, (String)var24_24 /* !! */ , (String)var26_26, (String)var21_21, (String)var28_28);
                var11_11.setProductImageContentDescription((String)var12_12);
                var41_40 = R$string.acc_icon_product_placeholder;
                var12_12 = hv3_0.K(var41_40);
                var11_11.setProductImgPlaceholerDescription((String)var12_12);
                var12_12 = var0.getImages();
                if (var12_12 != null && (var41_40 = (int)var12_12.isEmpty()) == 0 && (var12_12 = var0.getImages()) != null) {
                    block92: {
                        var12_12 = var12_12.iterator();
                        while (var25_25 = var12_12.hasNext()) {
                            var31_31 = "mobileProductListingImage";
                            var26_26 = (ProductImage)var12_12.next();
                            var28_28 = var26_26.getFormat();
                            var27_27 = var31_31.equalsIgnoreCase((String)var28_28);
                            if (!var27_27) continue;
                            var12_12 = var26_26.getUrl();
                            break block92;
                        }
                        var41_40 = 0;
                        var12_12 = null;
                    }
                    var26_26 = var11_11.getProductImageUrl();
                    if (var26_26 == null) {
                        var12_12 = var0.getImages();
                        if (var12_12 != null && (var12_12 = (ProductImage)CollectionsKt.N(0, (List)var12_12)) != null) {
                            var12_12 = var12_12.getUrl();
                        } else {
                            var41_40 = 0;
                            var12_12 = null;
                        }
                    }
                    var26_26 = Unit.a;
                } else {
                    var41_40 = 0;
                    var12_12 = null;
                }
                var12_12 = UrlHelper.Companion.getInstance().getImageUrl((String)var12_12);
                var11_11.setProductImageUrl((String)var12_12);
                var41_40 = R$string.product_image;
                var12_12 = hv3_0.K(var41_40);
                var26_26 = var0.getFnlColorVariantData();
                if (var26_26 != null) {
                    var26_26 = var26_26.getBrandName();
                } else {
                    var25_25 = false;
                    var26_26 = null;
                }
                var28_28 = var0.getName();
                if (var28_28 == null) {
                    var28_28 = "";
                }
                var12_12 = KW.a((String)var12_12, (String)var24_24 /* !! */ , (String)var26_26, (String)var21_21, (String)var28_28);
                var11_11.setProductImageContentDescription((String)var12_12);
                var11_11.setEnableRatingView((boolean)var6_6);
                var12_12 = var11_11.getFnlColorVariantData();
                if (var12_12 != null) {
                    var12_12 = var12_12.getBrandName();
                } else {
                    var41_40 = 0;
                    var12_12 = null;
                }
                var21_21 = hv3_0.K(R$string.product_image);
                var24_24 /* !! */  = new StringBuilder();
                var24_24 /* !! */ .append((String)var12_12);
                var12_12 = " ";
                var24_24 /* !! */ .append((String)var12_12);
                var24_24 /* !! */ .append((String)var21_21);
                var24_24 /* !! */ .append(" at ");
                var20_20 = var1_1;
                var24_24 /* !! */ .append(var1_1);
                var21_21 = var24_24 /* !! */ .toString();
                var11_11.setProductImageContentDescription((String)var21_21);
                cp_1.Companion.getClass();
                cp$a.e().getClass();
                var20_20 = (int)cp_1.f();
                var11_11.setCheckIfTalkbackServiceEnabled((boolean)var20_20);
                AJIOApplication.Companion.getClass();
                var21_21 = AJIOApplication$a.a().getResources();
                var24_24 /* !! */  = "getResources(...)";
                Intrinsics.checkNotNullExpressionValue(var21_21, (String)var24_24 /* !! */ );
                var21_21 = qz2_0.e((Resources)var21_21, (Product)var5_5);
                var11_11.setFinalPriceContentDescription((String)var21_21);
                var20_20 = h40_0.Q1();
                var11_11.setPrioritydeliveryFeatureEnable((boolean)var20_20);
                var21_21 = h40_0.a.g0();
                if (var21_21 != null) {
                    var24_24 /* !! */  = var11_11.getFnlColorVariantData();
                    if (var24_24 /* !! */  != null) {
                        var24_24 /* !! */  = var24_24 /* !! */ .getDeliverySlaTag();
                    } else {
                        var22_22 = 0;
                        var24_24 /* !! */  = null;
                        var23_23 = 0.0f;
                    }
                    var21_21 = (String)var21_21.get(var24_24 /* !! */ );
                } else {
                    var20_20 = 0;
                    var21_21 = null;
                }
                var11_11.setDeliverySlaTag((String)var21_21);
                var21_21 = od3_2.a();
                var24_24 /* !! */  = ld3_2.STORE_AJIOGRAM.getStoreId();
                var20_20 = Intrinsics.areEqual(var21_21, var24_24 /* !! */ );
                if (var20_20 != 0) {
                    var11_11.setAjiogramStoreId((boolean)var6_6);
                }
                var21_21 = var0.getPrice();
                var22_22 = 0;
                var23_23 = 0.0f;
                var24_24 /* !! */  = null;
                var26_26 = "format(...)";
                var28_28 = "getString(...)";
                if (var21_21 == null) break block93;
                var11_11.setShowFinalPrice((boolean)var6_6);
                var21_21 = qz2_0.r(var0.getPrice());
                var11_11.setFinalPriceValue((String)var21_21);
                var21_21 = StringCompanionObject.INSTANCE;
                var21_21 = AJIOApplication$a.a().getResources();
                var29_29 = R$string.acc_plp_final_price;
                var21_21 = var21_21.getString(var29_29);
                Intrinsics.checkNotNullExpressionValue(var21_21, (String)var28_28);
                var31_31 = qz2_0.r(var0.getPrice());
                var34_34 = new Object[var6_6];
                var34_34[0] = var31_31;
                var31_31 = Arrays.copyOf(var34_34, var6_6);
                var21_21 = String.format((String)var21_21, (Object[])var31_31);
                Intrinsics.checkNotNullExpressionValue(var21_21, (String)var26_26);
                var11_11.setFinalPriceContentDescription((String)var21_21);
                var21_21 = var0.getWasPriceData();
                if (var21_21 == null) ** GOTO lbl-1000
                var31_31 = var21_21.getValue();
                if (var31_31 != null) {
                    var30_30 = Float.parseFloat((String)var31_31);
                } else {
                    var29_29 = 0;
                    var30_30 = 0.0f;
                    var31_31 = null;
                }
                var34_34 = var0.getPrice();
                if (var34_34 != null && (var34_34 = var34_34.getValue()) != null) {
                    var33_33 = Float.parseFloat((String)var34_34);
                } else {
                    var32_32 = 0;
                    var33_33 = 0.0f;
                    var34_34 = null;
                }
                var29_29 = Float.compare(var30_30, var33_33);
                if (var29_29 > 0) {
                    var31_31 = qz2_0.s(mz3_0.h(var21_21.getValue()));
                    var34_34 = new SpannableString((CharSequence)var31_31);
                    var36_36 = new StrikethroughSpan();
                    var37_37 = var31_31.length();
                    var38_38 = 33;
                    var34_34.setSpan((Object)var36_36, 0, var37_37, var38_38);
                    var21_21 = qz2_0.g(var0.getPrice(), (Price)var21_21);
                    var11_11.setShowDiscountPrice((boolean)var6_6);
                    var11_11.setShowMrpPrice((boolean)var6_6);
                    var11_11.setMrpPriceValue((SpannableString)var34_34);
                    var34_34 = AJIOApplication$a.a().getResources();
                    var35_35 = R$string.acc_plp_original_price;
                    var34_34 = var34_34.getString(var35_35);
                    Intrinsics.checkNotNullExpressionValue(var34_34, (String)var28_28);
                    var36_36 = new Object[var6_6];
                    var36_36[0] = var31_31;
                    var31_31 = Arrays.copyOf(var36_36, var6_6);
                    var31_31 = String.format((String)var34_34, (Object[])var31_31);
                    Intrinsics.checkNotNullExpressionValue(var31_31, (String)var26_26);
                    var11_11.setMrpPriceContentDescription((String)var31_31);
                    var31_31 = var0.getDiscountPercent();
                    var29_29 = (int)TextUtils.isEmpty((CharSequence)var31_31);
                    if (var29_29 == 0) {
                        var31_31 = AJIOApplication$a.a().getResources();
                        var32_32 = R$string.acc_plp_discount_price;
                        var31_31 = var31_31.getString(var32_32);
                        Intrinsics.checkNotNullExpressionValue(var31_31, (String)var28_28);
                        var34_34 = new Object[var6_6];
                        var34_34[0] = var21_21;
                        var21_21 = Arrays.copyOf(var34_34, var6_6);
                        var21_21 = String.format((String)var31_31, (Object[])var21_21);
                        Intrinsics.checkNotNullExpressionValue(var21_21, (String)var26_26);
                        var11_11.setDiscountPriceContentDescription((String)var21_21);
                        var21_21 = var0.getDiscountPercent();
                        var11_11.setDiscountPriceValue((String)var21_21);
                    } else {
                        var29_29 = (int)TextUtils.isEmpty((CharSequence)var21_21);
                        if (var29_29 == 0) {
                            var31_31 = AJIOApplication$a.a().getResources();
                            var32_32 = R$string.acc_plp_discount_price;
                            var31_31 = var31_31.getString(var32_32);
                            Intrinsics.checkNotNullExpressionValue(var31_31, (String)var28_28);
                            var34_34 = new Object[var6_6];
                            var34_34[0] = var21_21;
                            var34_34 = Arrays.copyOf(var34_34, var6_6);
                            var31_31 = String.format((String)var31_31, (Object[])var34_34);
                            Intrinsics.checkNotNullExpressionValue(var31_31, (String)var26_26);
                            var11_11.setDiscountPriceContentDescription((String)var31_31);
                            var31_31 = new StringBuilder();
                            var31_31.append((String)var21_21);
                            var31_31.append("% OFF");
                            var21_21 = var31_31.toString();
                            var11_11.setDiscountPriceValue((String)var21_21);
                        } else {
                            var11_11.setShowDiscountPrice(false);
                        }
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var11_11.setShowMrpPrice(false);
                    var11_11.setShowDiscountPrice(false);
                }
                break block94;
            }
            var11_11.setShowFinalPrice(false);
        }
        var11_11.setCardUi(false);
        var11_11.setFromHomeProductWidget((boolean)var8_8);
        var21_21 = var0.getPrice();
        if (var21_21 != null && (var21_21 = var21_21.getValue()) != null) {
            Float.parseFloat((String)var21_21);
        }
        if ((var21_21 = var0.getFnlColorVariantData()) != null) {
            var21_21.getColorGroup();
        }
        if ((var20_20 = og1_1.c()) != 0) {
            var21_21 = tr2_2.a;
            if (var8_8 != 0 && (var8_8 = tr2_2.s((boolean)var6_6)) != 0 || (var8_8 = tr2_2.t((boolean)var6_6)) != 0 || (var8_8 = tr2_2.m()) != 0) {
                var11_11.setEnableSaleContainer((boolean)var6_6);
                var11_11.setLuxeAfercartAndLuxeEnable((boolean)var6_6);
                var11_11.setSaleContainerSpaceRetained(false);
            }
        }
        var10_10 /* !! */  = var0.getWasPriceData();
        if (var10_10 /* !! */  != null) {
            var10_10 /* !! */  = var0.getWasPriceData();
            if (var10_10 /* !! */  != null) {
                var10_10 /* !! */  = var10_10 /* !! */ .getValue();
            } else {
                var8_8 = 0;
                var10_10 /* !! */  = null;
                var9_9 = 0.0f;
            }
            var8_8 = TextUtils.isEmpty((CharSequence)var10_10 /* !! */ );
            if (var8_8 == 0) {
                var10_10 /* !! */  = var0.getWasPriceData();
                if (var10_10 /* !! */  != null && (var10_10 /* !! */  = var10_10 /* !! */ .getValue()) != null && (var10_10 /* !! */  = je3_2.e((String)var10_10 /* !! */ )) != null) {
                    var9_9 = var10_10 /* !! */ .floatValue();
                } else {
                    var8_8 = 0;
                    var9_9 = 0.0f;
                    var10_10 /* !! */  = null;
                }
                var10_10 /* !! */  = Float.valueOf(var9_9);
                var11_11.setWasPriceValue((Float)var10_10 /* !! */ );
            }
        }
        if ((var10_10 /* !! */  = var0.getPrice()) != null) {
            var10_10 /* !! */  = var0.getPrice();
            if (var10_10 /* !! */  != null) {
                var10_10 /* !! */  = var10_10 /* !! */ .getValue();
            } else {
                var8_8 = 0;
                var10_10 /* !! */  = null;
                var9_9 = 0.0f;
            }
            var8_8 = TextUtils.isEmpty((CharSequence)var10_10 /* !! */ );
            if (var8_8 == 0) {
                var10_10 /* !! */  = var0.getPrice();
                if (var10_10 /* !! */  != null && (var10_10 /* !! */  = var10_10 /* !! */ .getValue()) != null && (var10_10 /* !! */  = je3_2.e((String)var10_10 /* !! */ )) != null) {
                    var23_23 = var10_10 /* !! */ .floatValue();
                }
                var10_10 /* !! */  = Float.valueOf(var23_23);
                var11_11.setPriceValue((Float)var10_10 /* !! */ );
            }
        }
        if ((var10_10 /* !! */  = var0.getOfferPrice()) != null && (var10_10 /* !! */  = var10_10 /* !! */ .getPriceReveal()) != null) {
            var10_10 /* !! */  = var10_10 /* !! */ .getBestPrice();
        } else {
            var8_8 = 0;
            var10_10 /* !! */  = null;
            var9_9 = 0.0f;
        }
        if (var10_10 /* !! */  != null) {
            var10_10 /* !! */  = var0.getOfferPrice();
            if (var10_10 /* !! */  != null && (var10_10 /* !! */  = var10_10 /* !! */ .getPriceReveal()) != null) {
                var10_10 /* !! */  = var10_10 /* !! */ .getBestPrice();
            } else {
                var8_8 = 0;
                var10_10 /* !! */  = null;
                var9_9 = 0.0f;
            }
            var11_11.setBestPriceValue((Float)var10_10 /* !! */ );
        }
        if ((var10_10 /* !! */  = var0.getOfferPrice()) != null) {
            var10_10 /* !! */  = var10_10 /* !! */ .getValue();
        } else {
            var8_8 = 0;
            var10_10 /* !! */  = null;
            var9_9 = 0.0f;
        }
        var11_11.setOfferPrice((String)var10_10 /* !! */ );
        var10_10 /* !! */  = var0.getOfferPrice();
        if (var10_10 /* !! */  != null && (var10_10 /* !! */  = var10_10 /* !! */ .getPriceReveal()) != null) {
            var10_10 /* !! */  = var10_10 /* !! */ .getDiscountPercent();
        } else {
            var8_8 = 0;
            var10_10 /* !! */  = null;
            var9_9 = 0.0f;
        }
        var11_11.setDiscountPercentValue((String)var10_10 /* !! */ );
        var11_11.setPdpInfoProviderLuxeEnable(false);
        var8_8 = var11_11.isFromHomeProductWidget();
        if (var8_8 != 0) {
            var8_8 = h40_0.S1();
            var11_11.setRatingEnabledPlp((boolean)var8_8);
        } else {
            var8_8 = h40_0.b2();
            var11_11.setRatingEnabledPlp((boolean)var8_8);
        }
        var10_10 /* !! */  = var0.getAverageRating();
        var11_11.setAverageRating((Double)var10_10 /* !! */ );
        var10_10 /* !! */  = var0.getRatingCount();
        var10_10 /* !! */  = var10_10 /* !! */  == null ? var0.getNumUserRatings() : var0.getRatingCount();
        var11_11.setProductRatingCount((String)var10_10 /* !! */ );
        var8_8 = og1_1.c();
        var11_11.setLuxeEnabled((boolean)var8_8);
        var10_10 /* !! */  = tr2_2.a;
        var8_8 = tr2_2.s(og1_1.c());
        if (var8_8 != 0 && (var8_8 = kotlin.text.b.i(null, (String)(var10_10 /* !! */  = "DYNAMIC_WIDGET"), false)) != 0) {
            var8_8 = 0;
            var9_9 = 0.0f;
            var10_10 /* !! */  = null;
        } else {
            var8_8 = 1;
            var9_9 = 1.4E-45f;
        }
        var11_11.setShouldShowProductDescription((boolean)var8_8);
        var8_8 = var11_11.isFromHomeProductWidget();
        if (var8_8 == 0) {
            var11_11.setShowOODEnable((boolean)var6_6);
            var8_8 = var0.isDODEnabled();
            if (var8_8 != 0) {
                var42_41 = var0.getDodEndTime();
                var11_11.setDodEndTime(var42_41);
                var11_11.setDodEnabled((boolean)var6_6);
                var10_10 /* !! */  = Calendar.getInstance(TimeZone.getTimeZone("IST"));
                var42_41 = var10_10 /* !! */ .getTimeInMillis();
                var44_42 = var0.getDodEndTime();
                var8_8 = var42_41 == var44_42 ? 0 : (var42_41 < var44_42 ? -1 : 1);
                if (var8_8 < 0) {
                    var10_10 /* !! */  = qz2_0.r(var0.getDodPriceData());
                    var21_21 = StringCompanionObject.INSTANCE;
                    var21_21 = AJIOApplication$a.a();
                    var22_22 = R$string.deal_price_plp;
                    var21_21 = var21_21.getString(var22_22);
                    Intrinsics.checkNotNullExpressionValue(var21_21, (String)var28_28);
                    var24_24 /* !! */  = new Object[var6_6];
                    var24_24 /* !! */ [0] = var10_10 /* !! */ ;
                    var10_10 /* !! */  = Arrays.copyOf(var24_24 /* !! */ , var6_6);
                    var10_10 /* !! */  = String.format((String)var21_21, (Object[])var10_10 /* !! */ );
                    Intrinsics.checkNotNullExpressionValue(var10_10 /* !! */ , (String)var26_26);
                    var11_11.setOfferPriceValue((String)var10_10 /* !! */ );
                    var11_11.setShowOfferPrice((boolean)var6_6);
                    var10_10 /* !! */  = AJIOApplication$a.a().getResources();
                    var20_20 = R$string.acc_plp_offer_price;
                    var10_10 /* !! */  = var10_10 /* !! */ .getString(var20_20);
                    Intrinsics.checkNotNullExpressionValue(var10_10 /* !! */ , (String)var28_28);
                    var21_21 = var0.getDodPriceData();
                    var24_24 /* !! */  = new Object[var6_6];
                    var24_24 /* !! */ [0] = var21_21;
                    var21_21 = Arrays.copyOf(var24_24 /* !! */ , var6_6);
                    var10_10 /* !! */  = String.format((String)var10_10 /* !! */ , (Object[])var21_21);
                    Intrinsics.checkNotNullExpressionValue(var10_10 /* !! */ , (String)var26_26);
                    var11_11.setOfferPriceContentDescription((String)var10_10 /* !! */ );
                    var11_11.setSetDiscountColor((boolean)var6_6);
                } else {
                    var11_11.setDodEnabled(false);
                    var11_11.setSetOfferPrice((boolean)var6_6);
                }
            } else {
                var11_11.setDodEnabled(false);
                var11_11.setSetOfferPrice((boolean)var6_6);
            }
        }
        var8_8 = h40_0.L1();
        var21_21 = var0.getOfferPrice();
        if (var21_21 != null) {
            var21_21 = var21_21.getFormattedValue();
        } else {
            var20_20 = 0;
            var21_21 = null;
        }
        var21_21 = qz2_0.n((String)var21_21);
        var22_22 = var11_11.getSetOfferPrice();
        if (var22_22 == 0 || (var22_22 = n00.g()) != 0 || (var24_24 /* !! */  = var0.getOfferPrice()) == null || var8_8 == 0) ** GOTO lbl-1000
        var10_10 /* !! */  = var0.getPrice();
        if (var10_10 /* !! */  != null) {
            var10_10 /* !! */  = var10_10 /* !! */ .getFormattedValue();
        } else {
            var8_8 = 0;
            var10_10 /* !! */  = null;
            var9_9 = 0.0f;
        }
        var10_10 /* !! */  = qz2_0.n((String)var10_10 /* !! */ );
        var8_8 = (int)Intrinsics.areEqual(var21_21, var10_10 /* !! */ );
        if (var8_8 == 0) {
            var8_8 = (int)var11_11.isPlpBargainUrgencyTagEnabled();
            if (var8_8 != 0) {
                var10_10 /* !! */  = var11_11.getBargainUrgencyTagValue();
                if (var10_10 /* !! */  != null) {
                    var24_24 /* !! */  = " :";
                    var10_10 /* !! */  = cP.a((String)var10_10 /* !! */ , (String)var24_24 /* !! */ , (String)var21_21);
                    var21_21 = Unit.a;
                } else {
                    var10_10 /* !! */  = StringCompanionObject.INSTANCE;
                    var10_10 /* !! */  = AJIOApplication$a.a();
                    var22_22 = R$string.plp_offer_price;
                    var10_10 /* !! */  = var10_10 /* !! */ .getString(var22_22);
                    Intrinsics.checkNotNullExpressionValue(var10_10 /* !! */ , (String)var28_28);
                    var24_24 /* !! */  = new Object[var6_6];
                    var24_24 /* !! */ [0] = var21_21;
                    var10_10 /* !! */  = xh2_0.a(var24_24 /* !! */ , var6_6, (String)var10_10 /* !! */ , (String)var26_26);
                    var21_21 = Unit.a;
                }
            } else {
                var10_10 /* !! */  = StringCompanionObject.INSTANCE;
                var10_10 /* !! */  = AJIOApplication$a.a();
                var22_22 = R$string.plp_offer_price;
                var10_10 /* !! */  = var10_10 /* !! */ .getString(var22_22);
                Intrinsics.checkNotNullExpressionValue(var10_10 /* !! */ , (String)var28_28);
                var24_24 /* !! */  = new Object[var6_6];
                var24_24 /* !! */ [0] = var21_21;
                var10_10 /* !! */  = xh2_0.a(var24_24 /* !! */ , var6_6, (String)var10_10 /* !! */ , (String)var26_26);
            }
            var20_20 = cp$a.o();
            if (var20_20 != 0) {
                var8_8 = (int)var11_11.isPlpBargainUrgencyTagEnabled();
                if (var8_8 != 0) {
                    var10_10 /* !! */  = var11_11.getBargainUrgencyTagValue();
                    if (var10_10 /* !! */  == null) {
                        var8_8 = R$string.offer_price_message;
                        var10_10 /* !! */  = hv3_0.K(var8_8);
                    }
                } else {
                    var8_8 = R$string.offer_price_message;
                    var10_10 /* !! */  = hv3_0.K(var8_8);
                }
                if ((var21_21 = var0.getOfferPrice()) != null) {
                    var19_19 = var21_21.getFormattedValue();
                }
                var18_18 = Float.parseFloat(mz3_0.h(var19_19));
                var19_19 = qz2_0.x(Float.valueOf(var18_18));
                var21_21 = new StringBuilder();
                var21_21.append((String)var10_10 /* !! */ );
                var21_21.append((String)var12_12);
                var21_21.append(var19_19);
                var10_10 /* !! */  = var21_21.toString();
                var11_11.setSetOfferPriceDrawable((boolean)var6_6);
            }
            var11_11.setOfferPriceValue((String)var10_10 /* !! */ );
            var11_11.setShowOfferPrice((boolean)var6_6);
            var11_11.setSetDiscountColor((boolean)var6_6);
            var11_11.setOfferPriceContentDescription((String)var10_10 /* !! */ );
        } else lbl-1000:
        // 2 sources

        {
            var11_11.setShowOfferPrice(false);
            var11_11.setSetDiscountColor((boolean)var6_6);
        }
        var8_8 = mz3_0.z();
        if (var8_8 != 0) {
            var11_11.setGwpEnabled((boolean)var6_6);
            var5_5 = var0.getOfferPrice();
            if (var5_5 != null) {
                var5_5 = var5_5.getGiftAvailable();
                var46_43 = Boolean.TRUE;
                var7_7 = Intrinsics.areEqual(var5_5, var46_43);
            }
            var11_11.setGiftAvailable(var7_7);
            var5_5 = (String)n00.e.getValue();
            var11_11.setGwpFreebiesOneText((String)var5_5);
            var47_44 = og1_1.c();
            var11_11.setLuxeEnabled(var47_44);
            var47_44 = mz3_0.z();
            var11_11.setGWPFeatureEnabledAjioLuxe(var47_44);
        } else {
            var11_11.setGwpEnabled(false);
        }
        return var11_11;
    }

    public static Pair f(Product object) {
        Serializable serializable;
        String string2 = null;
        if (object != null && (object = ((Product)object).getTags()) != null && (object = ((Tag)object).getCategoryTags()) != null) {
            boolean bl2;
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                String string3;
                boolean bl4;
                Object object2;
                serializable = (CategoryTags)object.next();
                if (serializable == null || (object2 = ((CategoryTags)serializable).getCategory()) == null || (bl4 = ((String)object2).equalsIgnoreCase(string3 = "SELLING_POINT")) != (bl3 = true)) continue;
                object2 = Boolean.TRUE;
                if ((serializable = ((CategoryTags)serializable).getPrimary()) != null) {
                    string2 = ((TagPrimary)serializable).getValue();
                }
                object = new Pair(object2, string2);
                return object;
            }
        }
        serializable = Boolean.FALSE;
        object = new Pair(serializable, null);
        return object;
    }

    public static boolean g() {
        long l2;
        long l3 = k7.p();
        long l4 = 0L;
        boolean bl2 = false;
        Object object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object >= 0 || (object = (l2 = (l4 = 1L) - l3) == 0L ? 0 : (l2 < 0L ? -1 : 1)) > 0) {
            String string2;
            Object object2 = tr2_2.a;
            boolean bl3 = tr2_2.v(false);
            if ((bl3 || (bl3 = tr2_2.n(false))) && !(bl3 = Intrinsics.areEqual(object2 = od3_2.a(), string2 = ld3_2.STORE_AJIOGRAM.getStoreId()))) {
                bl2 = true;
            }
        }
        return bl2;
    }
}

