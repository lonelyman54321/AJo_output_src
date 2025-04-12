/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.ril.ajio.analytics.events;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ktx.AnalyticsKt;
import com.google.firebase.analytics.ktx.ParametersBuilder;
import com.google.firebase.ktx.Firebase;
import com.google.gson.JsonParser;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.AppsFlyerEvents;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.Ga4Events;
import com.ril.ajio.analytics.events.enum.AppsFlyerEventsItem;
import com.ril.ajio.analytics.utils.GAUtils;
import com.ril.ajio.analytics.utils.SharedUtils;
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Home.NativeCategoryNavigationListDetail;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.OrderCancellation;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Payment.LuxeDetails;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.AdsData;
import com.ril.ajio.services.data.Product.CategoryTags;
import com.ril.ajio.services.data.Product.Config;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.StockInfo;
import com.ril.ajio.services.data.options.CuratedWidgetItem;
import com.ril.ajio.services.data.returnexchange.BasePrice;
import com.ril.ajio.services.data.returnexchange.ReturnEntries;
import com.ril.ajio.services.data.returnexchange.ReturnExchange;
import com.ril.ajio.services.data.returnexchange.ReturnOrderEntry;
import com.ril.ajio.services.data.returnexchange.TotalPrice;
import com.ril.ajio.services.data.user.UserInformation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$DoubleRef;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class NewEEcommerceEventsRevamp {
    public static final int $stable = 8;
    private final String AF_ID;
    private final String BAG_DISCOUNT;
    private final String CLIENT_ID;
    private final String CONTAINS_LUXE;
    private final String CONTAINS_STORE;
    private final String COUPON_DISCOUNT;
    private final String DIMENSION11;
    private final String DIMENSION148;
    private final String EE_ADD_PAYMENT_INFO;
    private final String EE_ADD_SHIPPING_INFO;
    private final String EE_ADD_TO_CART;
    private final String EE_ADD_TO_WISHLIST;
    private final String EE_BEGIN_CHECKOUT;
    private final String EE_PURCHASE;
    private final String EE_REFUND;
    private final String EE_REMOVE_FROM_CART;
    private final String EE_SELECT_ITEM;
    private final String EE_SELECT_PROMOTION;
    private final String EE_VIEW_CART;
    private final String EE_VIEW_ITEM;
    private final String EE_VIEW_ITEM_LIST;
    private final String EE_VIEW_PROMOTION;
    private final String HYBRIS_ID;
    private final String IS_ANALYTICS_REVAMP;
    private final String IS_GA4;
    private final String IS_UA;
    private final String ITEMS;
    private final String LOGIN_STATUS;
    private final String NETWORK_TYPE;
    private final String PAGE_TYPE;
    private final String PDP_RECENTLY_VIEWED;
    private final String PDP_SCREEN_SIMILAR_PRODUCT_WIDGET;
    private final String PREVIOUS_SCREEN;
    private final String PREVIOUS_SCREEN_TYPE;
    private final String PRODUCT_BRAND;
    private final String PRODUCT_BRICK;
    private final String PRODUCT_BRICK_SUB_CATEGORY;
    private final String PRODUCT_CATEGORY;
    private final String PRODUCT_COLOR;
    private final String PRODUCT_FASHION_TYPE;
    private final String PRODUCT_GENDER;
    private final String PRODUCT_ID;
    private final String PRODUCT_NAME;
    private final String PRODUCT_PRICE;
    private final String PRODUCT_STYLE_TYPE;
    private final String PRODUCT_TRADE_DISCOUNT;
    private final String PRODUCT_VERTICAL;
    private final String SCREENNAME;
    private final String SCREEN_NAME;
    private final String SCREEN_TYPE;
    private final String SERVED_FROM_CMS;
    private final String STORE_SOURCE_ID_NEW;
    private final String Time_O_Day;
    private final String UA_PRODUCT_BRICK;
    private final String UA_PRODUCT_BRICK_SUB_CATEGORY;
    private final String UA_PRODUCT_CATEGORY;
    private final String UA_PRODUCT_FASHION_TYPE;
    private final String UA_PRODUCT_GROUP;
    private final String UA_PRODUCT_PLANING_CATEGORY;
    private final String UA_PRODUCT_STYLE_TYPE;
    private final String USER_STATUS;
    private final FirebaseAnalytics analytics;
    private final jo_2 appPreferences;
    private String currentScreen;
    private String currentScreenType;
    private final GAUtils gaUtils;
    private final rq1_2 isUrgencyDriverEnabled$delegate;
    private String prevScreen;
    private String prevScreenType;
    private final rq1_2 segmentIds$delegate;
    private final rq1_2 userInformation$delegate;

    public NewEEcommerceEventsRevamp() {
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        Object object = new jo_2((Context)aJIOApplication);
        this.appPreferences = object;
        this.analytics = object = AnalyticsKt.getAnalytics(Firebase.INSTANCE);
        this.currentScreen = object = "splash screen";
        this.currentScreenType = object;
        object = new Object();
        this.userInformation$delegate = object = yr1_2.b((Function0)object);
        this.prevScreen = object = "";
        this.prevScreenType = object;
        this.EE_SELECT_ITEM = "select_item";
        this.EE_VIEW_ITEM = "view_item";
        this.EE_VIEW_ITEM_LIST = object = GAUtils.Companion.getGAViewItemList();
        this.EE_ADD_TO_WISHLIST = "add_to_wishlist";
        this.EE_ADD_TO_CART = "add_to_cart";
        this.EE_VIEW_CART = "view_cart";
        this.EE_REMOVE_FROM_CART = "remove_from_cart";
        this.EE_BEGIN_CHECKOUT = "begin_checkout";
        this.EE_ADD_SHIPPING_INFO = "add_shipping_info";
        this.EE_ADD_PAYMENT_INFO = "add_payment_info";
        this.EE_PURCHASE = "purchase";
        this.EE_REFUND = "refund";
        this.EE_VIEW_PROMOTION = "view_promotion";
        this.EE_SELECT_PROMOTION = "select_promotion";
        this.PRODUCT_BRAND = "item_brand";
        this.PRODUCT_NAME = "item_name";
        this.PRODUCT_ID = "item_id";
        this.PRODUCT_PRICE = "price";
        this.PRODUCT_COLOR = "item_variant";
        this.PRODUCT_FASHION_TYPE = "item_category5";
        this.PRODUCT_STYLE_TYPE = "item_category4";
        this.PRODUCT_BRICK_SUB_CATEGORY = "item_category2";
        this.PRODUCT_BRICK = "item_category3";
        this.PRODUCT_CATEGORY = "item_category";
        this.PRODUCT_TRADE_DISCOUNT = "discount";
        this.UA_PRODUCT_CATEGORY = "dimension65";
        this.UA_PRODUCT_FASHION_TYPE = "dimension69";
        this.UA_PRODUCT_STYLE_TYPE = "dimension68";
        this.UA_PRODUCT_BRICK_SUB_CATEGORY = "dimension66";
        this.UA_PRODUCT_BRICK = "dimension67";
        this.UA_PRODUCT_GROUP = "dimension70";
        this.UA_PRODUCT_PLANING_CATEGORY = "dimension71";
        this.CLIENT_ID = "client_id";
        this.HYBRIS_ID = "hybris_id";
        this.AF_ID = "af_id";
        this.Time_O_Day = "time_of_the_day";
        this.NETWORK_TYPE = "network_type";
        this.USER_STATUS = "user_status";
        this.LOGIN_STATUS = "login_type";
        this.COUPON_DISCOUNT = "coupon_discount";
        this.BAG_DISCOUNT = "bag_discount";
        this.SCREEN_TYPE = "screen_type";
        this.PREVIOUS_SCREEN = "previous_screen_name";
        this.PREVIOUS_SCREEN_TYPE = "previous_screen_type";
        this.IS_UA = "isUA";
        this.IS_ANALYTICS_REVAMP = "isAnalyticsRevamp";
        this.SCREEN_NAME = "screen_name";
        this.STORE_SOURCE_ID_NEW = "dimension80";
        this.CONTAINS_LUXE = "contains_luxe";
        this.DIMENSION11 = "dimension11";
        this.gaUtils = object = new GAUtils();
        this.CONTAINS_STORE = "contains_store";
        this.DIMENSION148 = "dimension148";
        this.PRODUCT_GENDER = "product_gender";
        this.PRODUCT_VERTICAL = "product_vertical";
        this.IS_GA4 = "isGA4";
        this.PAGE_TYPE = "page_type";
        this.SCREENNAME = "screenname";
        this.SERVED_FROM_CMS = "served_from_cms";
        this.ITEMS = "items";
        this.PDP_RECENTLY_VIEWED = "PDP - Recently Viewed";
        this.PDP_SCREEN_SIMILAR_PRODUCT_WIDGET = "pdp screen- similar product widget";
        object = new Object();
        this.segmentIds$delegate = object = yr1_2.b((Function0)object);
        object = new Object();
        this.isUrgencyDriverEnabled$delegate = object = yr1_2.b((Function0)object);
    }

    public static /* synthetic */ Unit a(Ref$DoubleRef ref$DoubleRef, CartOrder cartOrder, ArrayList arrayList, LuxeDetails luxeDetails, AppsFlyerEventsItem appsFlyerEventsItem) {
        return NewEEcommerceEventsRevamp.pushEEPurchaseAppsflyer$lambda$66(ref$DoubleRef, cartOrder, arrayList, luxeDetails, appsFlyerEventsItem);
    }

    public static /* synthetic */ Unit b(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, Product product, Long l2, String string2) {
        return NewEEcommerceEventsRevamp.pushEEClosetAddToCartGAV4$lambda$18(newEEcommerceEventsRevamp, product, l2, string2);
    }

    public static /* synthetic */ String c() {
        return NewEEcommerceEventsRevamp.segmentIds_delegate$lambda$1();
    }

    public static /* synthetic */ Unit d(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, CartEntry cartEntry, Long l2) {
        return NewEEcommerceEventsRevamp.pushEEAddRemoveCartGAV4$lambda$14(newEEcommerceEventsRevamp, cartEntry, l2);
    }

    public static /* synthetic */ UserInformation e() {
        return NewEEcommerceEventsRevamp.userInformation_delegate$lambda$0();
    }

    private final String extractFileNameFromUrl(String string2) {
        String[] stringArray;
        boolean bl2;
        int n3 = string2.length();
        if (n3 > 0 && (bl2 = StringsKt.F(string2, (CharSequence)(stringArray = "/"), false))) {
            stringArray = new String[]{stringArray};
            return (String)CollectionsKt.S(StringsKt.a0(string2, stringArray, false, 0, 6));
        }
        return "";
    }

    public static /* synthetic */ boolean f() {
        return NewEEcommerceEventsRevamp.isUrgencyDriverEnabled_delegate$lambda$2();
    }

    private final String getClientId() {
        String string2 = this.getUserInformation().getNewClientId();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            string2 = this.getUserInformation().getNewClientId();
            Intrinsics.checkNotNull(string2);
        } else {
            string2 = "";
        }
        return string2;
    }

    public static /* synthetic */ String getCreativeName$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, String string2, boolean bl2, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            bl2 = false;
        }
        return newEEcommerceEventsRevamp.getCreativeName(string2, bl2);
    }

    public static /* synthetic */ String getCreativeSlot$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, String string2, boolean bl2, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            bl2 = false;
        }
        return newEEcommerceEventsRevamp.getCreativeSlot(string2, bl2);
    }

    private final String getHybrisId() {
        String string2 = this.getUserInformation().getEncryptedId();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            string2 = this.getUserInformation().getEncryptedId();
            Intrinsics.checkNotNull(string2);
        } else {
            string2 = "";
        }
        return string2;
    }

    private final String getLoggedINStatus() {
        String string2 = this.getUserInformation().getUserStatusMessage();
        Intrinsics.checkNotNullExpressionValue(string2, "getUserStatusMessage(...)");
        return string2;
    }

    public static /* synthetic */ String getPromotionId$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, String string2, boolean bl2, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            bl2 = false;
        }
        return newEEcommerceEventsRevamp.getPromotionId(string2, bl2);
    }

    private final String getSegmentIds() {
        return (String)this.segmentIds$delegate.getValue();
    }

    private final String getStoreType() {
        ld3_2 ld3_22;
        String string2;
        String string3 = od3_2.a();
        boolean bl2 = Intrinsics.areEqual(string3, string2 = (ld3_22 = ld3_2.STORE_AJIOGRAM).getStoreId());
        if (bl2) {
            return ld3_22.getStoreId();
        }
        bl2 = og1_1.c();
        string3 = bl2 ? "luxe" : "ajio";
        return string3;
    }

    private final String getUserId() {
        String string2 = this.getUserInformation().getCustomerUUID();
        Intrinsics.checkNotNullExpressionValue(string2, "getCustomerUUID(...)");
        return string2;
    }

    private final String getUserStatus() {
        String string2 = this.getUserInformation().getUserStatus();
        Intrinsics.checkNotNullExpressionValue(string2, "getUserStatus(...)");
        return string2;
    }

    private final boolean isUrgencyDriverEnabled() {
        return (Boolean)this.isUrgencyDriverEnabled$delegate.getValue();
    }

    private static final boolean isUrgencyDriverEnabled_delegate$lambda$2() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("enable_urgency_driver_pdp");
    }

    public static /* synthetic */ Bundle makeItemBundle$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, Product product, String string2, boolean bl2, boolean bl3, Boolean bl4, String string3, int n3, Object object) {
        int n4 = n3 & 0x10;
        Boolean bl5 = n4 != 0 ? null : bl4;
        n4 = n3 & 0x20;
        String string4 = n4 != 0 ? null : string3;
        return newEEcommerceEventsRevamp.makeItemBundle(product, string2, bl2, bl3, bl5, string4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Bundle makeItemBundleGAV4(CartEntry var1_1, boolean var2_2) {
        block66: {
            block65: {
                block64: {
                    block58: {
                        block57: {
                            block63: {
                                block62: {
                                    var3_3 = null;
                                    var4_4 = var1_1 != null ? var1_1.getProduct() : null;
                                    var5_5 = 0;
                                    var6_6 = null;
                                    var7_7 = dk0.a(0, "index");
                                    var8_8 = this.PRODUCT_NAME;
                                    if (var4_4 != null) {
                                        var9_9 = var4_4.getName();
                                    } else {
                                        var10_10 = false;
                                        var9_9 = null;
                                    }
                                    var10_10 = TextUtils.isEmpty((CharSequence)var9_9);
                                    var11_11 = "";
                                    if (var10_10) {
                                        var9_9 = var11_11;
                                    } else if (var4_4 != null) {
                                        var9_9 = var4_4.getName();
                                    } else {
                                        var10_10 = false;
                                        var9_9 = null;
                                    }
                                    var7_7.putString(var8_8, (String)var9_9);
                                    var12_12 = 0L;
                                    var14_13 = 1;
                                    if (!var2_2) break block62;
                                    if (var4_4 != null) {
                                        var15_14 = var4_4.getFnlColorVariantData();
                                    } else {
                                        var2_2 = false;
                                        var15_14 = null;
                                    }
                                    if (var15_14 == null) ** GOTO lbl-1000
                                    var15_14 = var4_4.getFnlColorVariantData();
                                    if (var15_14 != null) {
                                        var15_14 = var15_14.getColorGroup();
                                    } else {
                                        var2_2 = false;
                                        var15_14 = null;
                                    }
                                    var2_2 = TextUtils.isEmpty((CharSequence)var15_14);
                                    if (!var2_2) {
                                        var15_14 = var4_4.getFnlColorVariantData();
                                        Intrinsics.checkNotNull(var15_14);
                                        var15_14 = var15_14.getColorGroup();
                                        Intrinsics.checkNotNull(var15_14);
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var15_14 = var11_11;
                                    }
                                    var15_14 = this.trimProductId((String)var15_14);
                                    var6_6 = var15_14[0];
                                    var5_5 = TextUtils.isEmpty((CharSequence)var6_6);
                                    if (var5_5 != 0) {
                                        var6_6 = this.PRODUCT_ID;
                                        var7_7.putLong((String)var6_6, var12_12);
                                    }
                                    if ((var5_5 = ((String[])var15_14).length) > var14_13 && (var5_5 = (int)TextUtils.isEmpty((CharSequence)(var6_6 = var15_14[var14_13]))) == 0) {
                                        var6_6 = this.PRODUCT_COLOR;
                                        var15_14 = var15_14[var14_13];
                                        var7_7.putString((String)var6_6, (String)var15_14);
                                    }
                                    break block63;
                                }
                                if (var4_4 != null) {
                                    var15_14 = var4_4.getBaseProduct();
                                } else {
                                    var2_2 = false;
                                    var15_14 = null;
                                }
                                var2_2 = TextUtils.isEmpty((CharSequence)var15_14);
                                if (!var2_2) {
                                    if (var4_4 != null) {
                                        var15_14 = var4_4.getBaseProduct();
                                    } else {
                                        var2_2 = false;
                                        var15_14 = null;
                                    }
                                    var15_14 = this.trimProductId((String)var15_14);
                                    var16_17 = var15_14[0];
                                    var17_19 = TextUtils.isEmpty((CharSequence)var16_17);
                                    if (var17_19) {
                                        var16_17 = this.PRODUCT_ID;
                                        var7_7.putLong(var16_17, var12_12);
                                    }
                                    try {
                                        var6_6 = var15_14[0];
                                        if (var6_6 != null) {
                                            var8_8 = this.PRODUCT_ID;
                                            var7_7.putString(var8_8, (String)var6_6);
                                        }
                                    }
                                    catch (Exception v0) {}
                                    if ((var5_5 = ((Object)var15_14).length) > var14_13 && (var5_5 = (int)TextUtils.isEmpty((CharSequence)(var6_6 = var15_14[var14_13]))) == 0) {
                                        var6_6 = this.PRODUCT_COLOR;
                                        var15_14 = var15_14[var14_13];
                                        var7_7.putString((String)var6_6, (String)var15_14);
                                    }
                                } else {
                                    if (var4_4 != null) {
                                        var15_14 = var4_4.getCode();
                                    } else {
                                        var2_2 = false;
                                        var15_14 = null;
                                    }
                                    var15_14 = this.trimProductId((String)var15_14);
                                    var16_18 = var15_14[0];
                                    var17_20 = TextUtils.isEmpty((CharSequence)var16_18);
                                    if (var17_20) {
                                        var16_18 = this.PRODUCT_ID;
                                        var7_7.putLong(var16_18, var12_12);
                                    }
                                    try {
                                        var6_6 = var15_14[0];
                                        if (var6_6 != null) {
                                            var8_8 = this.PRODUCT_ID;
                                            var7_7.putString(var8_8, (String)var6_6);
                                        }
                                    }
                                    catch (Exception v1) {}
                                    if ((var5_5 = ((Object)var15_14).length) > var14_13 && (var5_5 = (int)TextUtils.isEmpty((CharSequence)(var6_6 = var15_14[var14_13]))) == 0) {
                                        var6_6 = this.PRODUCT_COLOR;
                                        var15_14 = var15_14[var14_13];
                                        var7_7.putString((String)var6_6, (String)var15_14);
                                    }
                                }
                            }
                            lp_0.a(var7_7, (CartEntry)var1_1);
                            lp_0.g(var7_7, (CartEntry)var1_1);
                            var15_14 = this.PRODUCT_BRAND;
                            if (var4_4 != null) {
                                var6_6 = var4_4.getBrandName();
                            } else {
                                var5_5 = 0;
                                var6_6 = null;
                            }
                            var5_5 = (int)TextUtils.isEmpty((CharSequence)var6_6);
                            if (var5_5 != 0) {
                                var6_6 = var11_11;
                            } else if (var4_4 != null) {
                                var6_6 = var4_4.getBrandName();
                            } else {
                                var5_5 = 0;
                                var6_6 = null;
                            }
                            var7_7.putString((String)var15_14, (String)var6_6);
                            var18_21 = 0.0;
                            if (var1_1 != null) {
                                try {
                                    var15_14 = var1_1.getBasePrice();
                                    break block57;
                                }
                                catch (NumberFormatException var15_15) {
                                    break block58;
                                }
                            }
                            var2_2 = false;
                            var15_14 = null;
                        }
                        if (var15_14 == null) break block64;
                        var15_14 = var1_1.getBasePrice();
                        if ((var15_14 = var15_14.getValue()) == null) break block64;
                        var20_22 = Double.parseDouble((String)var15_14);
                        break block65;
                    }
                    var9_9 = yn3_0.a;
                    var9_9.e(var15_15);
                }
                var20_22 = var18_21;
            }
            var2_2 = var20_22 == var18_21 ? 0 : (var20_22 < var18_21 ? -1 : 1);
            if (var2_2) {
                block61: {
                    block60: {
                        block59: {
                            if (var4_4 != null) {
                                try {
                                    var15_14 = var4_4.getWasPriceData();
                                    if (var15_14 == null) break block59;
                                    var15_14 = var15_14.getValue();
                                    break block60;
                                }
                                catch (NumberFormatException var15_16) {
                                    break block61;
                                }
                            }
                        }
                        var2_2 = false;
                        var15_14 = null;
                    }
                    if (var15_14 != null) {
                        if (var4_4 != null && (var15_14 = var4_4.getWasPriceData()) != null && (var15_14 = var15_14.getValue()) != null) {
                            var22_23 = Double.parseDouble((String)var15_14);
                            var15_14 = var22_23;
                        } else {
                            var2_2 = false;
                            var15_14 = null;
                        }
                        Intrinsics.checkNotNull(var15_14);
                        var18_21 = var15_14.doubleValue() - var20_22;
                    }
                    break block66;
                }
                var9_9 = yn3_0.a;
                var9_9.e(var15_16);
            }
        }
        if (var2_2 = hv3_0.Y()) {
            Intrinsics.checkNotNull(var1_1);
            var1_1 = var1_1.getProduct().getSelectedSizeVariant();
            if (var1_1 != null) {
                Y63.c((ProductOptionVariant)var1_1);
            }
        } else {
            ka2_2.a((CartEntry)var1_1);
        }
        var1_1 = this.PRODUCT_PRICE;
        var7_7.putDouble((String)var1_1, var20_22);
        var7_7.putDouble("discount", var18_21);
        var1_1 = this.PRODUCT_CATEGORY;
        if (var4_4 != null) {
            var15_14 = var4_4.getBrickCategory();
        } else {
            var2_2 = false;
            var15_14 = null;
        }
        var2_2 = TextUtils.isEmpty((CharSequence)var15_14);
        if (!var2_2) {
            var11_11 = var4_4 != null ? var4_4.getBrickCategory() : null;
        }
        var7_7.putString((String)var1_1, var11_11);
        var1_1 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get("dimension148");
        var15_14 = GAEcommerceEvents.INSTANCE;
        if (var4_4 != null && (var6_6 = var4_4.getCatalogName()) != null) {
            var3_3 = var6_6;
        } else if (var4_4 != null) {
            var3_3 = var4_4.getCatalog();
        }
        var15_14 = var15_14.getStoreTypeFromCatalog((String)var3_3);
        var7_7.putString((String)var1_1, (String)var15_14);
        return var7_7;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Bundle makeItemBundleGAV4(Product var1_1, boolean var2_2, Boolean var3_3, String var4_4) {
        block140: {
            block139: {
                block138: {
                    block132: {
                        block131: {
                            block130: {
                                block137: {
                                    block136: {
                                        var5_5 = new Bundle();
                                        hv3_0.a.getClass();
                                        var6_6 = (String)hv3_0.h((Product)var1_1, (boolean)var2_2).b;
                                        var6_6 = mz3_0.n((Product)var1_1, (String)var6_6);
                                        var7_7 = var6_6.length();
                                        if (var7_7 > 0) {
                                            var8_8 = Ga4Events.INSTANCE.getGav4DimensionMap();
                                            var9_9 = "dimension162";
                                            var8_8 = (String)var8_8.get(var9_9);
                                            var5_5.putString((String)var8_8, (String)var6_6);
                                        }
                                        var6_6 = null;
                                        if (var1_1 != null) {
                                            var8_8 = var1_1.getSegmentNameText();
                                        } else {
                                            var7_7 = 0;
                                            var8_8 = null;
                                        }
                                        var9_9 = "item_category";
                                        var10_10 = "dimension43";
                                        var11_11 = "";
                                        if (var8_8 != null && (var7_7 = var8_8.length()) != 0) {
                                            var8_8 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(var10_10);
                                            if (var1_1 != null) {
                                                var10_10 = var1_1.getSegmentNameText();
                                            } else {
                                                var12_12 = 0;
                                                var10_10 = null;
                                            }
                                            var5_5.putString((String)var8_8, var10_10);
                                            if (var1_1 != null) {
                                                var8_8 = var1_1.getSegmentNameText();
                                            } else {
                                                var7_7 = 0;
                                                var8_8 = null;
                                            }
                                            var5_5.putString(var9_9, (String)var8_8);
                                        } else {
                                            var8_8 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(var10_10);
                                            if (var1_1 != null) {
                                                var10_10 = var1_1.getBrickCategory();
                                            } else {
                                                var12_12 = 0;
                                                var10_10 = null;
                                            }
                                            if (var10_10 != null && (var12_12 = var10_10.length()) != 0) {
                                                if (var1_1 != null) {
                                                    var10_10 = var1_1.getBrickCategory();
                                                } else {
                                                    var12_12 = 0;
                                                    var10_10 = null;
                                                }
                                            } else {
                                                var10_10 = var11_11;
                                            }
                                            var5_5.putString((String)var8_8, var10_10);
                                            if (var1_1 != null) {
                                                var8_8 = var1_1.getBrickCategory();
                                            } else {
                                                var7_7 = 0;
                                                var8_8 = null;
                                            }
                                            if (var8_8 != null && (var7_7 = var8_8.length()) != 0) {
                                                if (var1_1 != null) {
                                                    var8_8 = var1_1.getBrickCategory();
                                                } else {
                                                    var7_7 = 0;
                                                    var8_8 = null;
                                                }
                                            } else {
                                                var8_8 = var11_11;
                                            }
                                            var5_5.putString(var9_9, (String)var8_8);
                                        }
                                        if (var1_1 != null) {
                                            var8_8 = var1_1.getVerticalNameText();
                                        } else {
                                            var7_7 = 0;
                                            var8_8 = null;
                                        }
                                        var9_9 = "item_category2";
                                        var10_10 = "dimension45";
                                        if (var8_8 != null && (var7_7 = var8_8.length()) != 0) {
                                            var8_8 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(var10_10);
                                            if (var1_1 != null) {
                                                var10_10 = var1_1.getVerticalNameText();
                                            } else {
                                                var12_12 = 0;
                                                var10_10 = null;
                                            }
                                            var5_5.putString((String)var8_8, var10_10);
                                            if (var1_1 != null) {
                                                var8_8 = var1_1.getVerticalNameText();
                                            } else {
                                                var7_7 = 0;
                                                var8_8 = null;
                                            }
                                            var5_5.putString(var9_9, (String)var8_8);
                                        } else {
                                            var8_8 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(var10_10);
                                            if (var1_1 != null) {
                                                var10_10 = var1_1.getBrickSubCategory();
                                            } else {
                                                var12_12 = 0;
                                                var10_10 = null;
                                            }
                                            if (var10_10 != null && (var12_12 = var10_10.length()) != 0) {
                                                if (var1_1 != null) {
                                                    var10_10 = var1_1.getBrickSubCategory();
                                                } else {
                                                    var12_12 = 0;
                                                    var10_10 = null;
                                                }
                                            } else {
                                                var10_10 = var11_11;
                                            }
                                            var5_5.putString((String)var8_8, var10_10);
                                            if (var1_1 != null) {
                                                var8_8 = var1_1.getBrickSubCategory();
                                            } else {
                                                var7_7 = 0;
                                                var8_8 = null;
                                            }
                                            if (var8_8 != null && (var7_7 = var8_8.length()) != 0) {
                                                if (var1_1 != null) {
                                                    var8_8 = var1_1.getBrickSubCategory();
                                                } else {
                                                    var7_7 = 0;
                                                    var8_8 = null;
                                                }
                                            } else {
                                                var8_8 = var11_11;
                                            }
                                            var5_5.putString(var9_9, (String)var8_8);
                                        }
                                        if (var1_1 != null) {
                                            var8_8 = var1_1.getBrickNameText();
                                        } else {
                                            var7_7 = 0;
                                            var8_8 = null;
                                        }
                                        var9_9 = "item_category3";
                                        var10_10 = "dimension46";
                                        if (var8_8 != null && (var7_7 = var8_8.length()) != 0) {
                                            var8_8 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(var10_10);
                                            if (var1_1 != null) {
                                                var10_10 = var1_1.getBrickNameText();
                                            } else {
                                                var12_12 = 0;
                                                var10_10 = null;
                                            }
                                            var5_5.putString((String)var8_8, var10_10);
                                            if (var1_1 != null) {
                                                var8_8 = var1_1.getBrickNameText();
                                            } else {
                                                var7_7 = 0;
                                                var8_8 = null;
                                            }
                                            var5_5.putString(var9_9, (String)var8_8);
                                        } else {
                                            var8_8 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(var10_10);
                                            if (var1_1 != null) {
                                                var10_10 = var1_1.getBrickName();
                                            } else {
                                                var12_12 = 0;
                                                var10_10 = null;
                                            }
                                            if (var10_10 != null && (var12_12 = var10_10.length()) != 0) {
                                                if (var1_1 != null) {
                                                    var10_10 = var1_1.getBrickName();
                                                } else {
                                                    var12_12 = 0;
                                                    var10_10 = null;
                                                }
                                            } else {
                                                var10_10 = var11_11;
                                            }
                                            var5_5.putString((String)var8_8, var10_10);
                                            if (var1_1 != null) {
                                                var8_8 = var1_1.getBrickName();
                                            } else {
                                                var7_7 = 0;
                                                var8_8 = null;
                                            }
                                            if (var8_8 != null && (var7_7 = var8_8.length()) != 0) {
                                                if (var1_1 != null) {
                                                    var8_8 = var1_1.getBrickName();
                                                } else {
                                                    var7_7 = 0;
                                                    var8_8 = null;
                                                }
                                            } else {
                                                var8_8 = var11_11;
                                            }
                                            var5_5.putString(var9_9, (String)var8_8);
                                        }
                                        if (var4_4 != null && (var7_7 = var4_4.length()) != 0) {
                                            var8_8 = "item_list_name";
                                            var5_5.putString((String)var8_8, (String)var4_4);
                                        }
                                        var7_7 = 0;
                                        var8_8 = null;
                                        var5_5.putInt("index", 0);
                                        var4_4 = this.PRODUCT_NAME;
                                        if (var1_1 != null) {
                                            var9_9 = var1_1.getName();
                                        } else {
                                            var13_13 = false;
                                            var9_9 = null;
                                        }
                                        var13_13 = TextUtils.isEmpty((CharSequence)var9_9);
                                        if (var13_13) {
                                            var9_9 = var11_11;
                                        } else if (var1_1 != null) {
                                            var9_9 = var1_1.getName();
                                        } else {
                                            var13_13 = false;
                                            var9_9 = null;
                                        }
                                        var5_5.putString((String)var4_4, var9_9);
                                        var14_14 = 0L;
                                        var16_15 = 1;
                                        if (!var2_2) break block136;
                                        if (var1_1 != null) {
                                            var17_16 = var1_1.getFnlColorVariantData();
                                        } else {
                                            var2_2 = false;
                                            var17_16 = null;
                                        }
                                        if (var17_16 == null) ** GOTO lbl-1000
                                        var17_16 = var1_1.getFnlColorVariantData();
                                        if (var17_16 != null) {
                                            var17_16 = var17_16.getColorGroup();
                                        } else {
                                            var2_2 = false;
                                            var17_16 = null;
                                        }
                                        var2_2 = TextUtils.isEmpty((CharSequence)var17_16);
                                        if (!var2_2) {
                                            var17_16 = var1_1.getFnlColorVariantData();
                                            Intrinsics.checkNotNull(var17_16);
                                            var17_16 = var17_16.getColorGroup();
                                            Intrinsics.checkNotNull(var17_16);
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var17_16 = var11_11;
                                        }
                                        var17_16 = this.trimProductId((String)var17_16);
                                        var18_19 = var17_16[0];
                                        var19_21 = TextUtils.isEmpty((CharSequence)var18_19);
                                        if (var19_21) {
                                            var8_8 = this.PRODUCT_ID;
                                            var5_5.putLong((String)var8_8, var14_14);
                                        } else {
                                            try {
                                                var8_8 = var17_16[0];
                                                if (var8_8 != null) {
                                                    var9_9 = this.PRODUCT_ID;
                                                    var5_5.putString(var9_9, (String)var8_8);
                                                    var8_8 = Unit.a;
                                                }
                                            }
                                            catch (Exception v0) {
                                                var8_8 = Unit.a;
                                            }
                                        }
                                        var7_7 = ((Object)var17_16).length;
                                        if (var7_7 > var16_15 && (var7_7 = (int)TextUtils.isEmpty((CharSequence)(var8_8 = var17_16[var16_15]))) == 0) {
                                            var8_8 = this.PRODUCT_COLOR;
                                            var17_16 = var17_16[var16_15];
                                            var5_5.putString((String)var8_8, (String)var17_16);
                                        }
                                        break block137;
                                    }
                                    if (var1_1 != null) {
                                        var17_16 = var1_1.getCode();
                                    } else {
                                        var2_2 = false;
                                        var17_16 = null;
                                    }
                                    if (var1_1 != null) {
                                        var18_20 = var1_1.getFnlColorVariantData();
                                    } else {
                                        var19_22 = false;
                                        var18_20 = null;
                                    }
                                    if (var18_20 != null) {
                                        var18_20 = var1_1.getFnlColorVariantData();
                                        if (var18_20 != null) {
                                            var18_20 = var18_20.getColorGroup();
                                        } else {
                                            var19_22 = false;
                                            var18_20 = null;
                                        }
                                        var19_22 = TextUtils.isEmpty((CharSequence)var18_20);
                                        if (!var19_22) {
                                            var17_16 = var1_1.getFnlColorVariantData();
                                            Intrinsics.checkNotNull(var17_16);
                                            var17_16 = var17_16.getColorGroup();
                                            Intrinsics.checkNotNull(var17_16);
                                        }
                                    }
                                    if (!(var19_22 = TextUtils.isEmpty((CharSequence)var17_16))) {
                                        var18_20 = (var17_16 = this.trimProductId((String)var17_16))[0];
                                        var19_22 = TextUtils.isEmpty((CharSequence)var18_20);
                                        if (var19_22) {
                                            var8_8 = this.PRODUCT_ID;
                                            var5_5.putLong((String)var8_8, var14_14);
                                        } else {
                                            try {
                                                var8_8 = var17_16[0];
                                                if (var8_8 != null) {
                                                    var9_9 = this.PRODUCT_ID;
                                                    var5_5.putString(var9_9, (String)var8_8);
                                                    var8_8 = Unit.a;
                                                }
                                            }
                                            catch (Exception v1) {
                                                var8_8 = Unit.a;
                                            }
                                        }
                                        var7_7 = ((Object)var17_16).length;
                                        if (var7_7 > var16_15 && (var7_7 = (int)TextUtils.isEmpty((CharSequence)(var8_8 = var17_16[var16_15]))) == 0) {
                                            var8_8 = this.PRODUCT_COLOR;
                                            var17_16 = var17_16[var16_15];
                                            var5_5.putString((String)var8_8, (String)var17_16);
                                        }
                                    } else {
                                        if (var1_1 != null) {
                                            var17_16 = var1_1.getBaseProduct();
                                        } else {
                                            var2_2 = false;
                                            var17_16 = null;
                                        }
                                        var17_16 = this.trimProductId((String)var17_16);
                                        var18_20 = var17_16[0];
                                        var19_22 = TextUtils.isEmpty((CharSequence)var18_20);
                                        if (var19_22) {
                                            var8_8 = this.PRODUCT_ID;
                                            var5_5.putLong((String)var8_8, var14_14);
                                        } else {
                                            try {
                                                var8_8 = var17_16[0];
                                                if (var8_8 != null) {
                                                    var9_9 = this.PRODUCT_ID;
                                                    var5_5.putString(var9_9, (String)var8_8);
                                                    var8_8 = Unit.a;
                                                }
                                            }
                                            catch (Exception v2) {
                                                var8_8 = Unit.a;
                                            }
                                        }
                                        var7_7 = ((Object)var17_16).length;
                                        if (var7_7 > var16_15 && (var7_7 = (int)TextUtils.isEmpty((CharSequence)(var8_8 = var17_16[var16_15]))) == 0) {
                                            var8_8 = this.PRODUCT_COLOR;
                                            var17_16 = var17_16[var16_15];
                                            var5_5.putString((String)var8_8, (String)var17_16);
                                        }
                                    }
                                }
                                var17_16 = this.PRODUCT_BRAND;
                                if (var1_1 != null && (var4_4 = var1_1.getFnlColorVariantData()) != null) {
                                    var4_4 = var4_4.getBrandName();
                                } else {
                                    var16_15 = 0;
                                    var4_4 = null;
                                }
                                var16_15 = (int)TextUtils.isEmpty((CharSequence)var4_4);
                                if (var16_15 == 0) {
                                    var11_11 = var1_1 != null && (var4_4 = var1_1.getFnlColorVariantData()) != null ? var4_4.getBrandName() : null;
                                }
                                var5_5.putString((String)var17_16, var11_11);
                                var20_23 = 0.0;
                                if (var1_1 != null) {
                                    try {
                                        var17_16 = var1_1.getPrice();
                                        if (var17_16 == null) break block130;
                                        var17_16 = var17_16.getValue();
                                        break block131;
                                    }
                                    catch (NumberFormatException var17_17) {
                                        break block132;
                                    }
                                }
                            }
                            var2_2 = false;
                            var17_16 = null;
                        }
                        if (var17_16 == null || var1_1 == null || (var17_16 = var1_1.getPrice()) == null || (var17_16 = var17_16.getValue()) == null) break block138;
                        var22_24 = Double.parseDouble((String)var17_16);
                        break block139;
                    }
                    var4_4 = yn3_0.a;
                    var4_4.e(var17_17);
                }
                var22_24 = var20_23;
            }
            var2_2 = var22_24 == var20_23 ? 0 : (var22_24 < var20_23 ? -1 : 1);
            if (var2_2) {
                block135: {
                    block134: {
                        block133: {
                            if (var1_1 != null) {
                                try {
                                    var17_16 = var1_1.getWasPriceData();
                                    if (var17_16 == null) break block133;
                                    var17_16 = var17_16.getValue();
                                    break block134;
                                }
                                catch (NumberFormatException var17_18) {
                                    break block135;
                                }
                            }
                        }
                        var2_2 = false;
                        var17_16 = null;
                    }
                    if (var17_16 != null) {
                        if (var1_1 != null && (var17_16 = var1_1.getWasPriceData()) != null && (var17_16 = var17_16.getValue()) != null) {
                            var24_25 = Double.parseDouble((String)var17_16);
                            var17_16 = var24_25;
                        } else {
                            var2_2 = false;
                            var17_16 = null;
                        }
                        Intrinsics.checkNotNull(var17_16);
                        var20_23 = var17_16.doubleValue() - var22_24;
                    }
                    break block140;
                }
                var4_4 = yn3_0.a;
                var4_4.e(var17_18);
            }
        }
        var17_16 = this.PRODUCT_PRICE;
        var5_5.putDouble((String)var17_16, var22_24);
        var17_16 = this.PRODUCT_TRADE_DISCOUNT;
        var5_5.putDouble((String)var17_16, var20_23);
        var17_16 = Ga4Events.INSTANCE;
        var4_4 = (String)var17_16.getGav4DimensionMap().get("dimension148");
        var8_8 = GAEcommerceEvents.INSTANCE;
        if (var1_1 == null || (var9_9 = var1_1.getCatalogName()) == null) {
            if (var1_1 != null) {
                var9_9 = var1_1.getCatalog();
            } else {
                var13_13 = false;
                var9_9 = null;
            }
        }
        var8_8 = var8_8.getStoreTypeFromCatalog(var9_9);
        var5_5.putString((String)var4_4, (String)var8_8);
        if (var3_3 != null) {
            var17_16 = var17_16.getGav4DimensionMap();
            var4_4 = "dimension139";
            var17_16 = (String)var17_16.get(var4_4);
            var3_3 = var3_3.toString();
            var5_5.putString((String)var17_16, (String)var3_3);
        }
        var17_16 = h40_0.a;
        var2_2 = h40_0.W0();
        if (var2_2) {
            var17_16 = hv3_0.a;
            var17_16.getClass();
            var2_2 = hv3_0.V((Product)var1_1);
            if (var2_2) {
                if (var1_1 != null) {
                    var6_6 = var1_1.getFnlColorVariantData();
                }
                var1_1 = hv3_0.A((ProductFnlColorVariantData)var6_6);
                var17_16 = "dimension161";
                var5_5.putString((String)var17_16, (String)var1_1);
            }
        }
        return var5_5;
    }

    public static /* synthetic */ Bundle makeItemBundleGAV4$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, Product product, boolean bl2, Boolean bl3, String string2, int n3, Object object) {
        if ((n3 &= 4) != 0) {
            bl3 = null;
        }
        return newEEcommerceEventsRevamp.makeItemBundleGAV4(product, bl2, bl3, string2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void pushAddToCartEventAppsFlyer(CartEntry var1_1, Long var2_2, String var3_3) {
        block33: {
            block32: {
                block31: {
                    block30: {
                        var4_4 = null;
                        var6_7 = var1_1 != null ? (var5_5 = var1_1.getProduct()) : null;
                        if (var1_1 != null) {
                            try {
                                var5_5 = var1_1.getBasePrice();
                                break block30;
                            }
                            catch (NumberFormatException var5_6) {
                                break block31;
                            }
                        }
                        var7_8 = false;
                        var5_5 = null;
                    }
                    if (var5_5 == null) break block32;
                    var5_5 = var1_1.getBasePrice();
                    var8_9 = (var5_5 = var5_5.getValue()) != null ? Double.parseDouble((String)var5_5) : 0.0;
                    var10_10 = var8_9;
                    break block33;
                }
                var12_11 = yn3_0.a;
                var12_11.e(var5_6);
            }
            var10_10 = 0.0;
        }
        if (var6_7 != null) {
            var5_5 = var6_7.getBrickCategory();
        } else {
            var7_8 = false;
            var5_5 = null;
        }
        var7_8 = TextUtils.isEmpty((CharSequence)var5_5);
        var12_11 = "";
        if (var7_8) {
            var5_5 = var12_11;
        } else if (var6_7 != null) {
            var5_5 = var6_7.getBrickCategory();
        } else {
            var7_8 = false;
            var5_5 = null;
        }
        if (var6_7 != null) {
            var13_12 = var6_7.getFnlColorVariantData();
        } else {
            var14_13 = false;
            var13_12 = null;
        }
        if (var13_12 == null) ** GOTO lbl-1000
        var13_12 = var6_7.getFnlColorVariantData();
        if (var13_12 != null) {
            var13_12 = var13_12.getColorGroup();
        } else {
            var14_13 = false;
            var13_12 = null;
        }
        var14_13 = TextUtils.isEmpty((CharSequence)var13_12);
        if (!var14_13) {
            var13_12 = var6_7.getFnlColorVariantData();
            Intrinsics.checkNotNull(var13_12);
            var13_12 = var13_12.getColorGroup();
            Intrinsics.checkNotNull(var13_12);
            var15_14 = var13_12;
        } else lbl-1000:
        // 2 sources

        {
            var15_14 = var12_11;
        }
        if (var6_7 != null) {
            var13_12 = var6_7.getName();
        } else {
            var14_13 = false;
            var13_12 = null;
        }
        var14_13 = TextUtils.isEmpty((CharSequence)var13_12);
        if (var14_13) {
            var13_12 = var12_11;
        } else if (var6_7 != null) {
            var13_12 = var6_7.getName();
        } else {
            var14_13 = false;
            var13_12 = null;
        }
        if (var3_3 != null && (var16_15 = var3_3.length()) != 0) {
            var6_7 = var3_3;
        } else {
            var17_16 = GAEcommerceEvents.INSTANCE;
            if (var6_7 == null || (var18_17 = var6_7.getCatalogName()) == null) {
                var18_17 = var6_7 != null ? var6_7.getCatalog() : null;
            }
            var6_7 = var17_16.getStoreTypeFromCatalog((String)var18_17);
        }
        var17_16 = "luxe";
        var19_18 = var17_16.equalsIgnoreCase((String)var6_7);
        cp_1.Companion.getClass();
        var6_7 = cp$a.e();
        if (var1_1 != null) {
            var4_4 = var1_1.getProduct();
        }
        var17_16 = String.valueOf(var10_10);
        var20_19 = 0L;
        var22_20 = 0.0;
        if (var2_2 != null) {
            var26_22 = var24_21 = var2_2.longValue();
        } else {
            var26_22 = var20_19;
            var28_23 = var22_20;
        }
        var6_7.getClass();
        var4_4 = cp_1.m((Product)var4_4, (String)var17_16, var26_22);
        var6_7 = AppsFlyerEvents.INSTANCE;
        var17_16 = var5_5 == null ? var12_11 : var5_5;
        if (var13_12 != null) {
            var12_11 = var13_12;
        }
        var30_24 = var2_2 != null ? (var26_22 = var2_2.longValue()) : var20_19;
        if (var19_18) {
            var28_23 = var10_10;
        } else {
            var26_22 = 0L;
            var28_23 = 0.0;
        }
        var32_25 = var28_23;
        var13_12 = var6_7;
        var18_17 = var12_11;
        var6_7.pushAddToCartEvent(var10_10, (String)var17_16, (String)var15_14, (String)var12_11, var30_24, var19_18, var32_25, (AppsFlyerEventsItem)var4_4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void pushAddToCartEventAppsFlyer(Product var1_1, Long var2_2, String var3_3) {
        block35: {
            block34: {
                block33: {
                    block32: {
                        block31: {
                            var4_4 = var1_1;
                            var5_5 = null;
                            if (var1_1 != null) {
                                try {
                                    var6_6 = var1_1.getPrice();
                                    if (var6_6 == null) break block31;
                                    var6_6 = var6_6.getValue();
                                    break block32;
                                }
                                catch (NumberFormatException var6_7) {
                                    break block33;
                                }
                            }
                        }
                        var7_8 = false;
                        var6_6 = null;
                    }
                    if (var6_6 == null) break block34;
                    var6_6 = var1_1.getPrice();
                    var8_9 = var6_6 != null && (var6_6 = var6_6.getValue()) != null ? Double.parseDouble((String)var6_6) : 0.0;
                    var10_10 = var8_9;
                    break block35;
                }
                var12_11 = yn3_0.a;
                var12_11.e(var6_7);
            }
            var10_10 = 0.0;
        }
        if (var4_4 != null) {
            var6_6 = var1_1.getBrickCategory();
        } else {
            var7_8 = false;
            var6_6 = null;
        }
        var7_8 = TextUtils.isEmpty((CharSequence)var6_6);
        var12_11 = "";
        if (var7_8) {
            var6_6 = var12_11;
        } else if (var4_4 != null) {
            var6_6 = var1_1.getBrickCategory();
        } else {
            var7_8 = false;
            var6_6 = null;
        }
        if (var4_4 != null) {
            var13_12 = var1_1.getFnlColorVariantData();
        } else {
            var14_13 = false;
            var13_12 = null;
        }
        if (var13_12 == null) ** GOTO lbl-1000
        var13_12 = var1_1.getFnlColorVariantData();
        if (var13_12 != null) {
            var13_12 = var13_12.getColorGroup();
        } else {
            var14_13 = false;
            var13_12 = null;
        }
        var14_13 = TextUtils.isEmpty((CharSequence)var13_12);
        if (!var14_13) {
            var13_12 = var1_1.getFnlColorVariantData();
            Intrinsics.checkNotNull(var13_12);
            var13_12 = var13_12.getColorGroup();
            Intrinsics.checkNotNull(var13_12);
            var15_14 = var13_12;
        } else lbl-1000:
        // 2 sources

        {
            var15_14 = var12_11;
        }
        if (var4_4 != null) {
            var13_12 = var1_1.getName();
        } else {
            var14_13 = false;
            var13_12 = null;
        }
        var14_13 = TextUtils.isEmpty((CharSequence)var13_12);
        if (var14_13) {
            var13_12 = var12_11;
        } else if (var4_4 != null) {
            var13_12 = var1_1.getName();
        } else {
            var14_13 = false;
            var13_12 = null;
        }
        if (var3_3 != null && (var16_15 = var3_3.length()) != 0) {
            var5_5 = var3_3;
        } else {
            var17_16 = GAEcommerceEvents.INSTANCE;
            if (var4_4 != null && (var18_17 = var1_1.getCatalogName()) != null) {
                var5_5 = var18_17;
            } else if (var4_4 != null) {
                var5_5 = var1_1.getCatalog();
            }
            var5_5 = var17_16.getStoreTypeFromCatalog((String)var5_5);
        }
        var19_18 = "luxe".equalsIgnoreCase((String)var5_5);
        cp_1.Companion.getClass();
        var5_5 = cp$a.e();
        var17_16 = String.valueOf(var10_10);
        var20_19 = 0L;
        var22_20 = 0.0;
        if (var2_2 != null) {
            var26_22 = var24_21 = var2_2.longValue();
        } else {
            var26_22 = var20_19;
            var28_23 = var22_20;
        }
        var5_5.getClass();
        var4_4 = cp_1.m((Product)var4_4, (String)var17_16, var26_22);
        var5_5 = AppsFlyerEvents.INSTANCE;
        var17_16 = var6_6 == null ? var12_11 : var6_6;
        if (var13_12 != null) {
            var12_11 = var13_12;
        }
        var30_24 = var2_2 != null ? (var26_22 = var2_2.longValue()) : var20_19;
        if (var19_18) {
            var28_23 = var10_10;
        } else {
            var26_22 = 0L;
            var28_23 = 0.0;
        }
        var32_25 = var28_23;
        var13_12 = var5_5;
        var18_17 = var12_11;
        var5_5.pushAddToCartEvent(var10_10, (String)var17_16, (String)var15_14, (String)var12_11, var30_24, var19_18, var32_25, (AppsFlyerEventsItem)var4_4);
    }

    public static /* synthetic */ void pushAddToCartEventAppsFlyer$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, CartEntry cartEntry, Long l2, String string2, int n3, Object object) {
        if ((n3 &= 4) != 0) {
            string2 = null;
        }
        newEEcommerceEventsRevamp.pushAddToCartEventAppsFlyer(cartEntry, l2, string2);
    }

    public static /* synthetic */ void pushAddToCartEventAppsFlyer$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, Product product, Long l2, String string2, int n3, Object object) {
        if ((n3 &= 4) != 0) {
            string2 = "";
        }
        newEEcommerceEventsRevamp.pushAddToCartEventAppsFlyer(product, l2, string2);
    }

    private static final Unit pushEEAddRemoveCartGAV4$lambda$14(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, CartEntry cartEntry, Long l2) {
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(newEEcommerceEventsRevamp, string2);
        string2 = cartEntry != null ? cartEntry.getSourceStoreId() : null;
        newEEcommerceEventsRevamp.pushAddToCartEventAppsFlyer(cartEntry, l2, string2);
        return Unit.a;
    }

    public static /* synthetic */ void pushEEBannerImpression$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, String string2, HashMap hashMap, String string3, String string4, String string5, String string6, String string7, boolean bl2, boolean bl3, String string8, int n3, Object object) {
        String string9;
        String string10;
        String string11;
        Object object2;
        int n4 = n3;
        int n7 = n3 & 1;
        if (n7 != 0) {
            object2 = newEEcommerceEventsRevamp.EE_VIEW_PROMOTION;
            string11 = object2;
        } else {
            string11 = string2;
        }
        int n8 = n4 & 0x40;
        if (n8 != 0) {
            object2 = "";
            string10 = object2;
        } else {
            string10 = string7;
        }
        n8 = n4 & 0x80;
        boolean bl4 = n8 != 0 ? false : bl2;
        n8 = n4 & 0x100;
        boolean bl5 = n8 != 0 ? false : bl3;
        if ((n4 &= 0x200) != 0) {
            n4 = 0;
            string9 = null;
        } else {
            string9 = string8;
        }
        object2 = newEEcommerceEventsRevamp;
        newEEcommerceEventsRevamp.pushEEBannerImpression(string11, hashMap, string3, string4, string5, string6, string10, bl4, bl5, string9);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void pushEEBannerImpressionGAV4(HashMap var1_1, String var2_2, String var3_3, String var4_4, String var5_5, String var6_6, boolean var7_7, boolean var8_8, String var9_9) {
        var10_10 = this;
        var11_11 = var1_1;
        var12_12 = var2_2;
        var13_13 = new ArrayList();
        var14_14 = var1_1.keySet().iterator();
        while ((var15_15 = var14_14.hasNext()) != 0) {
            block22: {
                block23: {
                    block24: {
                        block26: {
                            block27: {
                                block28: {
                                    block29: {
                                        block25: {
                                            var16_16 = var14_14.next();
                                            Intrinsics.checkNotNullExpressionValue(var16_16, "next(...)");
                                            var17_17 /* !! */  = (String[])var11_11.get(var16_16 = (String)var16_16);
                                            if (var17_17 /* !! */  == null || (var18_18 = var17_17 /* !! */ .length()) == 0) continue;
                                            var17_17 /* !! */  = (String)var11_11.get(var16_16);
                                            var19_19 = TextUtils.isEmpty((CharSequence)var17_17 /* !! */ );
                                            if (var19_19 != 0) {
                                                return;
                                            }
                                            var19_19 = 6;
                                            var20_20 = false;
                                            var21_21 = null;
                                            var22_22 = 1;
                                            if (var17_17 /* !! */  != null) {
                                                var23_23 = StringsKt.R((CharSequence)var17_17 /* !! */ , "/", 0, var19_19) + var22_22;
                                                var24_24 = var17_17 /* !! */ .substring(var23_23);
                                                var25_25 = "substring(...)";
                                                Intrinsics.checkNotNullExpressionValue(var24_24, var25_25);
                                            } else {
                                                var24_24 = var17_17 /* !! */ ;
                                            }
                                            if (var17_17 /* !! */  == null) continue;
                                            var25_25 = "|";
                                            var26_26 = 3;
                                            var27_27 = "";
                                            if (!var8_8) break block23;
                                            var17_17 /* !! */  = new String[]{var25_25};
                                            var18_18 = (var16_16 = StringsKt.a0(var16_16, var17_17 /* !! */ , false, 0, var19_19)).size();
                                            if (var18_18 != var19_19) break block24;
                                            var28_28 /* !! */  = (String)var16_16.get(0);
                                            var17_17 /* !! */  = (String)var16_16.get(var22_22);
                                            var19_19 = 2;
                                            var29_29 = (String)var16_16.get(var19_19);
                                            var31_31 = StringsKt.F((CharSequence)var29_29, var30_30 = "-", false);
                                            if (var31_31) {
                                                var29_29 = b.n((String)var29_29, var30_30, var25_25, false);
                                            }
                                            var30_30 = (String)var16_16.get(var26_26);
                                            var32_32 = 4;
                                            var25_25 = (String)var16_16.get(var32_32);
                                            var16_16 = (String)var16_16.get(5);
                                            var33_33 = "EXTERNAL_AD";
                                            var26_26 = (int)Intrinsics.areEqual(var25_25, var33_33);
                                            if (var26_26 == 0) break block25;
                                            var16_16 = kp1_0.c("TPBA - ", var30_30);
                                            break block26;
                                        }
                                        var33_33 = "AD";
                                        var32_32 = (int)Intrinsics.areEqual(var25_25, var33_33);
                                        if (var32_32 == 0) break block27;
                                        var32_32 = var16_16.hashCode();
                                        if (var32_32 == (var26_26 = 111092)) break block28;
                                        var26_26 = 3208415;
                                        if (var32_32 == var26_26) break block29;
                                        var26_26 = 3351788;
                                        if (var32_32 != var26_26 || (var15_15 = (int)var16_16.equals(var25_25 = "misc")) == 0) ** GOTO lbl-1000
                                        var30_30 = "jioads_direct_demand_";
                                        var16_16 = new StringBuilder(var30_30);
                                        var16_16.append(var24_24);
                                        var16_16 = var16_16.toString();
                                        break block26;
                                    }
                                    var25_25 = "home";
                                    var15_15 = (int)var16_16.equals(var25_25);
                                    if (var15_15 != 0) ** GOTO lbl-1000
                                    ** GOTO lbl-1000
                                }
                                var25_25 = "plp";
                                var15_15 = (int)var16_16.equals(var25_25);
                                if (var15_15 == 0) lbl-1000:
                                // 3 sources

                                {
                                    var16_16 = var30_30;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var16_16 = kp1_0.c("JioAds - ", var30_30);
                                }
                                break block26;
                            }
                            var16_16 = new StringBuilder();
                            var16_16.append(var30_30);
                            var30_30 = "_";
                            var16_16.append(var30_30);
                            var16_16.append(var24_24);
                            var16_16 = var16_16.toString();
                        }
                        var34_34 = var16_16;
                        break block22;
                    }
                    var28_28 /* !! */  = null;
                    var18_18 = 0;
                    var17_17 /* !! */  = null;
                    var19_19 = 0;
                    var29_29 = null;
lbl98:
                    // 2 sources

                    while (true) {
                        var34_34 = null;
                        break block22;
                        break;
                    }
                }
                var35_35 = var10_10.getPromotionId((String)var17_17 /* !! */ , (boolean)var22_22);
                var17_17 /* !! */  = var10_10.getCreativeName((String)var17_17 /* !! */ , (boolean)var22_22);
                var28_28 /* !! */  = new String[]{var25_25};
                if ((var28_28 /* !! */  = (String)CollectionsKt.N(0, (List)(var16_16 = StringsKt.a0((CharSequence)var16_16, var28_28 /* !! */ , false, 0, var19_19)))) == null) {
                    var28_28 /* !! */  = var27_27;
                }
                if ((var29_29 = (String)CollectionsKt.N(var22_22, (List)var16_16)) == null) {
                    var29_29 = var27_27;
                }
                if ((var16_16 = (String)CollectionsKt.N(var26_26, (List)var16_16)) != null && (var15_15 = Boolean.parseBoolean((String)var16_16)) == var22_22) {
                    var20_20 = true;
                }
                var29_29 = var16_16 = n1.a((String)var28_28 /* !! */ , var25_25, (String)var29_29);
                var28_28 /* !! */  = var35_35;
                ** continue;
            }
            var16_16 = new Bundle();
            if (var28_28 /* !! */  == null || (var22_22 = (int)Intrinsics.areEqual(var28_28 /* !! */ , var27_27)) != 0 || (var22_22 = (int)Intrinsics.areEqual(var28_28 /* !! */ , var30_30 = "null")) != 0) {
                var28_28 /* !! */  = "mobile";
            }
            var30_30 = "promotion_id";
            var16_16.putString(var30_30, (String)var28_28 /* !! */ );
            var28_28 /* !! */  = "promotion_name";
            if (var20_20) {
                if (var34_34 != null) {
                    var27_27 = var34_34;
                }
                var21_21 = "priority-".concat(var27_27);
                var16_16.putString((String)var28_28 /* !! */ , var21_21);
            } else {
                if (var34_34 != null) {
                    var24_24 = var34_34;
                }
                var16_16.putString((String)var28_28 /* !! */ , (String)var24_24);
            }
            var16_16.putString("creative_name", (String)var17_17 /* !! */ );
            var28_28 /* !! */  = "creative_slot";
            var16_16.putString((String)var28_28 /* !! */ , (String)var29_29);
            var13_13.add(var16_16);
        }
        var11_11 = new Bundle();
        var14_14 = var10_10.ITEMS;
        var11_11.putParcelableArrayList((String)var14_14, (ArrayList)var13_13);
        var13_13 = this.getStoreType();
        var14_14 = "store_type";
        var11_11.putString((String)var14_14, (String)var13_13);
        var16_16 = this.getStoreType();
        var11_11.putString("contains_store", (String)var16_16);
        var13_13 = var10_10.Time_O_Day;
        var16_16 = rj_0.b();
        var11_11.putString((String)var13_13, (String)var16_16);
        var13_13 = var10_10.CLIENT_ID;
        var16_16 = this.getClientId();
        var11_11.putString((String)var13_13, (String)var16_16);
        var13_13 = var10_10.HYBRIS_ID;
        var16_16 = this.getHybrisId();
        var11_11.putString((String)var13_13, (String)var16_16);
        var13_13 = var10_10.NETWORK_TYPE;
        AJIOApplication.Companion.getClass();
        var16_16 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        var11_11.putString((String)var13_13, (String)var16_16);
        var13_13 = var10_10.SCREENNAME;
        var11_11.putString((String)var13_13, (String)var12_12);
        var13_13 = var10_10.SCREEN_NAME;
        var11_11.putString((String)var13_13, (String)var12_12);
        var12_12 = var10_10.USER_STATUS;
        var13_13 = this.getUserStatus();
        var11_11.putString((String)var12_12, (String)var13_13);
        var12_12 = var10_10.LOGIN_STATUS;
        var13_13 = this.getLoggedINStatus();
        var11_11.putString((String)var12_12, (String)var13_13);
        var12_12 = var10_10.SCREEN_TYPE;
        var13_13 = var4_4;
        var11_11.putString((String)var12_12, var4_4);
        var12_12 = var10_10.PREVIOUS_SCREEN;
        var13_13 = var3_3;
        var11_11.putString((String)var12_12, var3_3);
        var12_12 = var10_10.PREVIOUS_SCREEN_TYPE;
        var13_13 = var5_5;
        var11_11.putString((String)var12_12, var5_5);
        var13_13 = this.getLoggedINStatus();
        var11_11.putString("LoggedInStatus", (String)var13_13);
        var12_12 = this.getUserInformation().getEncryptedUuid();
        var36_36 = TextUtils.isEmpty((CharSequence)var12_12);
        if (var36_36 != 0) {
            var12_12 = "N/A";
        } else {
            cp_1.Companion.getClass();
            var13_13 = cp$a.e();
            var13_13.getClass();
            var12_12 = cp_1.L((String)var12_12);
        }
        var11_11.putString("userId", (String)var12_12);
        var13_13 = this.getClientId();
        var11_11.putString("Client_ID", (String)var13_13);
        var13_13 = this.getHybrisId();
        var11_11.putString("hybris_id", (String)var13_13);
        var12_12 = var10_10.appPreferences.f();
        if (var12_12 != null) {
            var13_13 = StringsKt.m0((CharSequence)var12_12);
            var28_28 /* !! */  = var13_13.toString();
        } else {
            var28_28 /* !! */  = null;
        }
        if (var28_28 /* !! */  != null && (var36_36 = var28_28 /* !! */ .length()) != 0) {
            var13_13 = "user_type";
            var11_11.putString((String)var13_13, (String)var12_12);
        }
        var13_13 = this.getUserStatus();
        var11_11.putString("user_status", (String)var13_13);
        var12_12 = rj_0.b();
        var11_11.putString("Time_of_the_day", (String)var12_12);
        var12_12 = this.getStoreType();
        var11_11.putString((String)var14_14, (String)var12_12);
        var12_12 = var10_10.PAGE_TYPE;
        var13_13 = var6_6;
        var11_11.putString((String)var12_12, var6_6);
        var12_12 = var10_10.SERVED_FROM_CMS;
        var13_13 = String.valueOf(var7_7);
        var11_11.putString((String)var12_12, (String)var13_13);
        var12_12 = var10_10.IS_GA4;
        var13_13 = "true";
        var11_11.putString((String)var12_12, (String)var13_13);
        if (var8_8) {
            var12_12 = "plp_page_title";
            var13_13 = var9_9;
            var11_11.putString((String)var12_12, var9_9);
        }
        var11_11.putString("event_category", "Enhance E-commerce");
        var13_13 = var10_10.EE_VIEW_PROMOTION;
        var11_11.putString("event_action", (String)var13_13);
        var12_12 = var10_10.analytics;
        var13_13 = var10_10.EE_VIEW_PROMOTION;
        var12_12.logEvent((String)var13_13, (Bundle)var11_11);
    }

    public static /* synthetic */ void pushEEBannerImpressionGAV4$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, HashMap hashMap, String string2, String string3, String string4, String string5, String string6, boolean bl2, boolean bl3, String string7, int n3, Object object) {
        String string8;
        String string9;
        int n4 = n3;
        int n7 = n3 & 0x20;
        String string10 = n7 != 0 ? (string9 = "") : string6;
        n7 = n4 & 0x40;
        boolean bl4 = n7 != 0 ? false : bl2;
        n7 = n4 & 0x80;
        boolean bl5 = n7 != 0 ? false : bl3;
        if ((n4 &= 0x100) != 0) {
            n4 = 0;
            string8 = null;
        } else {
            string8 = string7;
        }
        newEEcommerceEventsRevamp.pushEEBannerImpressionGAV4(hashMap, string2, string3, string4, string5, string10, bl4, bl5, string8);
    }

    public static /* synthetic */ void pushEECheckoutStep1$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, ArrayList arrayList, String string2, double d2, String string3, String string4, String string5, String string6, String string7, int n3, Object object) {
        String string8;
        Object object2;
        int n4 = n3 & 2;
        if (n4 != 0) {
            object2 = newEEcommerceEventsRevamp.EE_BEGIN_CHECKOUT;
            string8 = object2;
        } else {
            string8 = string2;
        }
        object2 = newEEcommerceEventsRevamp;
        newEEcommerceEventsRevamp.pushEECheckoutStep1(arrayList, string8, d2, string3, string4, string5, string6, string7);
    }

    public static /* synthetic */ void pushEECheckoutStep2$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, CartOrder cartOrder, String string2, String string3, String string4, String string5, String string6, String string7, int n3, Object object) {
        String string8;
        Object object2;
        int n4 = n3 & 2;
        if (n4 != 0) {
            object2 = newEEcommerceEventsRevamp.EE_ADD_PAYMENT_INFO;
            string8 = object2;
        } else {
            string8 = string2;
        }
        object2 = newEEcommerceEventsRevamp;
        newEEcommerceEventsRevamp.pushEECheckoutStep2(cartOrder, string8, string3, string4, string5, string6, string7);
    }

    public static /* synthetic */ void pushEEClosetAddToCart$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, Product product, String string2, Long l2, String string3, String string4, boolean bl2, String string5, String string6, String string7, String string8, int n3, Object object) {
        boolean bl3;
        Long l3;
        Long l4;
        int n4 = n3;
        int n7 = n3 & 4;
        if (n7 != 0) {
            long l7 = 1L;
            l3 = l4 = Long.valueOf(l7);
        } else {
            l3 = l2;
        }
        n7 = n4 & 8;
        Object object2 = "";
        Object object3 = n7 != 0 ? object2 : string3;
        n7 = n4 & 0x10;
        Object object4 = n7 != 0 ? object2 : string4;
        n7 = n4 & 0x20;
        if (n7 != 0) {
            n7 = 0;
            l4 = null;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        Object object5 = (n4 &= 0x200) != 0 ? object2 : string8;
        object2 = newEEcommerceEventsRevamp;
        newEEcommerceEventsRevamp.pushEEClosetAddToCart(product, string2, l3, (String)object3, (String)object4, bl3, string5, string6, string7, (String)object5);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void pushEEClosetAddToCartGAV4(Product product, String string2, Long l2, String string3, String string4, boolean n3, String string5, String string6, String string7, String string8) {
        int n4;
        Object object;
        Object object2;
        double d2;
        double d5;
        double d7;
        long l3;
        Object object3;
        int n7;
        Object object4;
        Object object5;
        boolean bl2;
        ParametersBuilder parametersBuilder;
        String string9;
        Object object6;
        String string10;
        Object object7;
        String string11;
        String string12;
        Long l4;
        String string13;
        Product product2;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        block24: {
            block23: {
                NumberFormatException numberFormatException2;
                block22: {
                    block21: {
                        block20: {
                            long l7;
                            newEEcommerceEventsRevamp = this;
                            product2 = product;
                            string13 = string2;
                            l4 = l2;
                            string12 = string3;
                            string11 = string4;
                            object7 = GAEcommerceEvents.INSTANCE;
                            string10 = null;
                            if (product == null || (object6 = product.getCatalogName()) == null) {
                                object6 = product2 != null ? product.getCatalog() : null;
                            }
                            ((GAEcommerceEvents)object7).getStoreTypeFromCatalog((String)object6);
                            string9 = null;
                            parametersBuilder = null;
                            boolean bl3 = true;
                            int n8 = 48;
                            bl2 = false;
                            object6 = this;
                            object5 = product;
                            object4 = string3;
                            n7 = n3;
                            string12 = object3;
                            object3 = null;
                            object7 = NewEEcommerceEventsRevamp.makeItemBundle$default(this, product, string3, n3 != 0, bl3, null, null, n8, null);
                            string12((Bundle)object7);
                            l3 = 0L;
                            d7 = 0.0;
                            object7 = "quantity";
                            if (l4 != null) {
                                l7 = l2;
                                string12.putLong((String)object7, l7);
                            } else {
                                string12.putLong((String)object7, l3);
                            }
                            l7 = 0L;
                            d5 = 0.0;
                            if (product2 != null) {
                                try {
                                    object7 = product.getPrice();
                                    if (object7 == null) break block20;
                                    object7 = ((Price)object7).getValue();
                                    break block21;
                                }
                                catch (NumberFormatException numberFormatException2) {
                                    break block22;
                                }
                            }
                        }
                        bl2 = false;
                        object7 = null;
                    }
                    if (object7 == null || (object7 = product.getPrice()) == null || (object7 = ((Price)object7).getValue()) == null) break block23;
                    d2 = Double.parseDouble((String)object7);
                    break block24;
                }
                object2 = yn3_0.a;
                ((yn3$a)object2).e(numberFormatException2);
            }
            d2 = d5;
        }
        object7 = newEEcommerceEventsRevamp.analytics;
        parametersBuilder = new ParametersBuilder();
        object3 = "INR";
        parametersBuilder.param("currency", (String)object3);
        String string14 = "price";
        if (l4 != null) {
            d5 = (double)l2.longValue() * d2;
            l3 = l2;
            d7 = (double)l3 * d2;
            parametersBuilder.param(string14, d7);
        } else {
            parametersBuilder.param(string14, l3);
        }
        object6 = Ga4Events.INSTANCE;
        object5 = (String)((Ga4Events)object6).getGav4DimensionMap().get("dimension148");
        object2 = "";
        if (object5 == null) {
            object5 = object2;
        }
        string9 = this.getStoreType();
        parametersBuilder.param((String)object5, string9);
        object5 = newEEcommerceEventsRevamp.Time_O_Day;
        string9 = rj_0.b();
        parametersBuilder.param((String)object5, string9);
        object5 = newEEcommerceEventsRevamp.CLIENT_ID;
        string9 = this.getClientId();
        parametersBuilder.param((String)object5, string9);
        object5 = newEEcommerceEventsRevamp.HYBRIS_ID;
        string9 = this.getHybrisId();
        parametersBuilder.param((String)object5, string9);
        object5 = newEEcommerceEventsRevamp.NETWORK_TYPE;
        AJIOApplication.Companion.getClass();
        string9 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        parametersBuilder.param((String)object5, string9);
        object5 = newEEcommerceEventsRevamp.SCREEN_NAME;
        parametersBuilder.param((String)object5, string11);
        object5 = newEEcommerceEventsRevamp.SCREENNAME;
        parametersBuilder.param((String)object5, string11);
        object5 = newEEcommerceEventsRevamp.USER_STATUS;
        string9 = this.getUserStatus();
        parametersBuilder.param((String)object5, string9);
        object5 = newEEcommerceEventsRevamp.LOGIN_STATUS;
        string9 = this.getLoggedINStatus();
        parametersBuilder.param((String)object5, string9);
        object5 = newEEcommerceEventsRevamp.SCREEN_TYPE;
        string9 = string6;
        parametersBuilder.param((String)object5, string6);
        object5 = newEEcommerceEventsRevamp.PREVIOUS_SCREEN;
        string9 = string5;
        parametersBuilder.param((String)object5, string5);
        object5 = newEEcommerceEventsRevamp.PREVIOUS_SCREEN_TYPE;
        string9 = string7;
        parametersBuilder.param((String)object5, string7);
        object5 = newEEcommerceEventsRevamp.IS_GA4;
        string9 = "true";
        parametersBuilder.param((String)object5, string9);
        parametersBuilder.param("value", d5);
        parametersBuilder.param("event_category", "Enhance E-commerce");
        parametersBuilder.param("event_action", string13);
        object5 = ((Ga4Events)object6).getGav4DimensionMap();
        object4 = newEEcommerceEventsRevamp.DIMENSION148;
        object5 = (String)object5.get(object4);
        if (object5 == null) {
            object5 = object2;
        }
        object4 = GAEcommerceEvents.INSTANCE;
        if (product2 == null || (object = product.getCatalogName()) == null) {
            if (product2 != null) {
                string10 = product.getCatalog();
            }
            object = string10;
        }
        object = ((GAEcommerceEvents)object4).getStoreTypeFromCatalog((String)object);
        parametersBuilder.param((String)object5, (String)object);
        if (product2 != null && (object5 = product.getAggregateRating()) != null && (n7 = ((String)object5).length()) > 0) {
            object = ((Ga4Events)object6).getGav4DimensionMap();
            string9 = LD2.b;
            if ((object = (String)object.get(string9)) == null) {
                object = object2;
            }
            parametersBuilder.param((String)object, (String)object5);
        }
        object5 = newEEcommerceEventsRevamp.CONTAINS_LUXE;
        boolean bl4 = ((GAEcommerceEvents)object4).containsLuxe(product2);
        object4 = String.valueOf(bl4);
        parametersBuilder.param((String)object5, (String)object4);
        object5 = newEEcommerceEventsRevamp.CONTAINS_STORE;
        object4 = this.getStoreType();
        parametersBuilder.param((String)object5, (String)object4);
        parametersBuilder.param("items", (Bundle)string12);
        object5 = ((Ga4Events)object6).getGav4DimensionMap();
        object4 = "dimension16";
        object5 = (String)object5.get(object4);
        if (object5 == null) {
            object5 = object2;
        }
        cp_1.Companion.getClass();
        object4 = cp$a.e();
        object4.getClass();
        d5 = cp_1.x(product);
        parametersBuilder.param((String)object5, d5);
        object5 = this.getSegmentIds();
        if (object5 != null && (n4 = ((String)object5).length()) != 0) {
            object5 = this.getSegmentIds();
            Intrinsics.checkNotNullExpressionValue(object5, "<get-segmentIds>(...)");
            parametersBuilder.param("pricing_cust_seg", (String)object5);
            object5 = ((Ga4Events)object6).getGav4DimensionMap();
            object4 = "dimension192";
            object5 = (String)object5.get(object4);
            if (object5 == null) {
                object5 = object2;
            }
            object4 = cp$a.e();
            object4.getClass();
            d5 = cp_1.w(product);
            parametersBuilder.param((String)object5, d5);
        }
        object5 = string3;
        if (string3 != null) {
            object6 = ((Ga4Events)object6).getGav4DimensionMap();
            object4 = "dimension23";
            if ((object6 = (String)object6.get(object4)) != null) {
                object2 = object6;
            }
            parametersBuilder.param((String)object2, (String)object5);
        }
        object6 = parametersBuilder.getBundle();
        ((FirebaseAnalytics)object7).logEvent(string13, (Bundle)object6);
        object7 = newEEcommerceEventsRevamp.EE_ADD_TO_CART;
        bl2 = Intrinsics.areEqual(string13, object7);
        if (bl2) {
            object7 = AppsFlyerEvents.INSTANCE;
            object5 = string8;
            object6 = new ty1_2(newEEcommerceEventsRevamp, product2, l4, string8);
            ((AppsFlyerEvents)object7).wrapper((Function0)object6);
        }
    }

    public static /* synthetic */ void pushEEClosetAddToCartGAV4$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, Product product, String string2, Long l2, String string3, String string4, boolean bl2, String string5, String string6, String string7, String string8, int n3, Object object) {
        boolean bl3;
        Long l3;
        Long l4;
        int n4 = n3;
        int n7 = n3 & 4;
        if (n7 != 0) {
            long l7 = 1L;
            l3 = l4 = Long.valueOf(l7);
        } else {
            l3 = l2;
        }
        n7 = n4 & 8;
        Object object2 = "";
        Object object3 = n7 != 0 ? object2 : string3;
        n7 = n4 & 0x10;
        Object object4 = n7 != 0 ? object2 : string4;
        n7 = n4 & 0x20;
        if (n7 != 0) {
            n7 = 0;
            l4 = null;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        Object object5 = (n4 &= 0x200) != 0 ? object2 : string8;
        object2 = newEEcommerceEventsRevamp;
        newEEcommerceEventsRevamp.pushEEClosetAddToCartGAV4(product, string2, l3, (String)object3, (String)object4, bl3, string5, string6, string7, (String)object5);
    }

    private static final Unit pushEEClosetAddToCartGAV4$lambda$18(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, Product product, Long l2, String string2) {
        Intrinsics.checkNotNullParameter(newEEcommerceEventsRevamp, "this$0");
        newEEcommerceEventsRevamp.pushAddToCartEventAppsFlyer(product, l2, string2);
        return Unit.a;
    }

    public static /* synthetic */ void pushEECuratedWidgetOptionSelectPromotion$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, CuratedWidgetItem curatedWidgetItem, int n3, String string2, String string3, String string4, String string5, Bundle bundle, String string6, int n4, Object object) {
        int n7 = n4;
        int n8 = n4 & 0x40;
        Bundle bundle2 = n8 != 0 ? null : bundle;
        String string7 = (n7 &= 0x80) != 0 ? null : string6;
        newEEcommerceEventsRevamp.pushEECuratedWidgetOptionSelectPromotion(curatedWidgetItem, n3, string2, string3, string4, string5, bundle2, string7);
    }

    private final void pushEECuratedWidgetOptionSelectPromotionGAV4(CuratedWidgetItem object, int n3, String object2, String object3, String string2, String string3, Bundle bundle, String string4) {
        boolean bl2;
        Object object4;
        int n4;
        Bundle bundle2 = new Bundle();
        if (object != null) {
            bundle2.putString("promotion_id", "MOBILE");
            CharSequence charSequence = ((CuratedWidgetItem)object).getHeader();
            CharSequence charSequence2 = ((CuratedWidgetItem)object).getSubheader();
            String string5 = "curated_";
            String string6 = " ";
            charSequence = UX.c(string5, (String)charSequence, string6, (String)charSequence2);
            bundle2.putString("promotion_name", (String)charSequence);
            charSequence = ((CuratedWidgetItem)object).getWidgetName();
            charSequence2 = new StringBuilder(string5);
            ((StringBuilder)charSequence2).append((String)charSequence);
            charSequence = ((StringBuilder)charSequence2).toString();
            charSequence2 = "creative_name";
            bundle2.putString((String)charSequence2, (String)charSequence);
            n4 = ((CuratedWidgetItem)object).getPosition();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(n3);
            ((StringBuilder)charSequence).append("|");
            ((StringBuilder)charSequence).append(n4);
            object = ((StringBuilder)charSequence).toString();
            object4 = "creative_slot";
            bundle2.putString((String)object4, (String)object);
            if (string4 != null && (n4 = string4.length()) != 0 && bundle != null) {
                object = "item_list_name";
                bundle2.putString((String)object, string4);
            }
        }
        object = new ArrayList();
        ((ArrayList)object).add(bundle2);
        object4 = new Bundle();
        string4 = this.ITEMS;
        object4.putParcelableArrayList(string4, object);
        string4 = this.getStoreType();
        object4.putString("store_type", string4);
        object = this.Time_O_Day;
        string4 = rj_0.b();
        object4.putString((String)object, string4);
        object = this.CLIENT_ID;
        string4 = this.getClientId();
        object4.putString((String)object, string4);
        object = this.HYBRIS_ID;
        string4 = this.getHybrisId();
        object4.putString((String)object, string4);
        object = this.NETWORK_TYPE;
        AJIOApplication.Companion.getClass();
        string4 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        object4.putString((String)object, string4);
        object = this.SCREEN_NAME;
        object4.putString((String)object, (String)object2);
        object = this.SCREENNAME;
        object4.putString((String)object, (String)object2);
        object = this.USER_STATUS;
        object2 = this.getUserStatus();
        object4.putString((String)object, (String)object2);
        object = this.LOGIN_STATUS;
        object2 = this.getLoggedINStatus();
        object4.putString((String)object, (String)object2);
        object = SharedUtils.INSTANCE.getLoggedINStatus();
        n4 = ((String)object).length();
        if (n4 > 0) {
            object = "login_type";
            object2 = this.getLoggedINStatus();
            object4.putString((String)object, (String)object2);
        }
        if (bl2 = TextUtils.isEmpty((CharSequence)(object = this.getUserInformation().getEncryptedUuid()))) {
            object = "N/A";
        } else {
            cp_1.Companion.getClass();
            object2 = cp$a.e();
            object2.getClass();
            object = cp_1.L((String)object);
        }
        object4.putString("userId", (String)object);
        object = this.SCREEN_TYPE;
        object4.putString((String)object, string2);
        object = this.PREVIOUS_SCREEN;
        object4.putString((String)object, (String)object3);
        object = this.PREVIOUS_SCREEN_TYPE;
        object4.putString((String)object, string3);
        object = this.PAGE_TYPE;
        object2 = yx0_0.a;
        object3 = "";
        if (object2 == null) {
            object2 = object3;
        }
        object4.putString((String)object, (String)object2);
        object = this.SERVED_FROM_CMS;
        object2 = "true";
        object4.putString((String)object, (String)object2);
        object = this.CONTAINS_STORE;
        string2 = this.getStoreType();
        object4.putString((String)object, string2);
        object = this.IS_GA4;
        object4.putString((String)object, (String)object2);
        object4.putString("event_category", "Enhance E-commerce");
        object = "event_action";
        object2 = this.EE_SELECT_PROMOTION;
        object4.putString((String)object, (String)object2);
        if (bundle != null) {
            object = "product_id";
            bl2 = bundle.containsKey((String)object);
            if (bl2) {
                object2 = bundle.getString((String)object);
                if (object2 == null) {
                    object2 = object3;
                }
                object4.putString((String)object, (String)object2);
            }
            if (bl2 = bundle.containsKey((String)(object = "product_name"))) {
                object2 = bundle.getString((String)object);
                if (object2 == null) {
                    object2 = object3;
                }
                object4.putString((String)object, (String)object2);
            }
            if (bl2 = bundle.containsKey((String)(object = "product_brand"))) {
                object2 = bundle.getString((String)object);
                if (object2 == null) {
                    object2 = object3;
                }
                object4.putString((String)object, (String)object2);
            }
            if (bl2 = bundle.containsKey((String)(object = "product_brick"))) {
                object2 = bundle.getString((String)object);
                if (object2 == null) {
                    object2 = object3;
                }
                object4.putString((String)object, (String)object2);
            }
            if (bl2 = bundle.containsKey((String)(object = "product_category"))) {
                object2 = bundle.getString((String)object);
                if (object2 != null) {
                    object3 = object2;
                }
                object4.putString((String)object, (String)object3);
            }
        }
        object = this.analytics;
        object2 = this.EE_SELECT_PROMOTION;
        ((FirebaseAnalytics)object).logEvent((String)object2, (Bundle)object4);
    }

    public static /* synthetic */ void pushEECuratedWidgetOptionSelectPromotionGAV4$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, CuratedWidgetItem curatedWidgetItem, int n3, String string2, String string3, String string4, String string5, Bundle bundle, String string6, int n4, Object object) {
        int n7 = n4;
        int n8 = n4 & 0x40;
        Bundle bundle2 = n8 != 0 ? null : bundle;
        String string7 = (n7 &= 0x80) != 0 ? null : string6;
        newEEcommerceEventsRevamp.pushEECuratedWidgetOptionSelectPromotionGAV4(curatedWidgetItem, n3, string2, string3, string4, string5, bundle2, string7);
    }

    public static /* synthetic */ void pushEECuratedWidgetOptionsImpression$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, List list, int n3, String string2, String string3, String string4, String string5, String string6, Bundle bundle, int n4, Object object) {
        Bundle bundle2;
        int n7 = n4;
        n7 = n4 & 0x80;
        if (n7 != 0) {
            n7 = 0;
            bundle2 = null;
        } else {
            bundle2 = bundle;
        }
        newEEcommerceEventsRevamp.pushEECuratedWidgetOptionsImpression(list, n3, string2, string3, string4, string5, string6, bundle2);
    }

    public static /* synthetic */ void pushEECuratedWidgetOptionsImpressionGAV4$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, List list, int n3, String string2, String string3, String string4, String string5, String string6, Bundle bundle, int n4, Object object) {
        Bundle bundle2;
        int n7 = n4;
        n7 = n4 & 0x80;
        if (n7 != 0) {
            n7 = 0;
            bundle2 = null;
        } else {
            bundle2 = bundle;
        }
        newEEcommerceEventsRevamp.pushEECuratedWidgetOptionsImpressionGAV4(list, n3, string2, string3, string4, string5, string6, bundle2);
    }

    private final void pushEECustomForDisplaySizeGAV4(String object, String charSequence, String string2, String object2, String string3, boolean bl2, String string4, Product product) {
        int n3;
        boolean bl3;
        int n4;
        int n7;
        Object object3 = new ArrayList();
        Object object4 = E1.a("promotion_id", string4);
        int n8 = 2;
        String string5 = null;
        object2 = NewEEcommerceEventsRevamp.getCreativeName$default(this, (String)object2, false, n8, null);
        String string6 = "promotion_name";
        object4.putString(string6, (String)object2);
        object4.putString("creative_name", string2);
        object4.putString("creative_slot", string3);
        ((ArrayList)object3).add(object4);
        string2 = new Bundle();
        object2 = this.ITEMS;
        string2.putParcelableArrayList((String)object2, object3);
        object2 = "";
        if (product == null || (string3 = product.getName()) == null) {
            string3 = object2;
        }
        object3 = "product_name";
        string2.putString((String)object3, string3);
        if (product != null) {
            string3 = product.getSegmentNameText();
        } else {
            n7 = 0;
            string3 = null;
        }
        object3 = "item_category";
        object4 = "dimension43";
        if (string3 != null && (n7 = string3.length()) != 0) {
            string3 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object4);
            if (product != null) {
                object4 = product.getSegmentNameText();
            } else {
                n4 = 0;
                object4 = null;
            }
            string2.putString(string3, (String)object4);
            if (product != null) {
                string3 = product.getSegmentNameText();
            } else {
                n7 = 0;
                string3 = null;
            }
            string2.putString((String)object3, string3);
        } else {
            string3 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object4);
            if (product != null) {
                object4 = product.getBrickCategory();
            } else {
                n4 = 0;
                object4 = null;
            }
            if (object4 != null && (n4 = object4.length()) != 0) {
                if (product != null) {
                    object4 = product.getBrickCategory();
                } else {
                    n4 = 0;
                    object4 = null;
                }
            } else {
                object4 = object2;
            }
            string2.putString(string3, (String)object4);
            if (product != null) {
                string3 = product.getBrickCategory();
            } else {
                n7 = 0;
                string3 = null;
            }
            if (string3 != null && (n7 = string3.length()) != 0) {
                if (product != null) {
                    string3 = product.getBrickCategory();
                } else {
                    n7 = 0;
                    string3 = null;
                }
            } else {
                string3 = object2;
            }
            string2.putString((String)object3, string3);
        }
        if (product != null) {
            string3 = product.getVerticalNameText();
        } else {
            n7 = 0;
            string3 = null;
        }
        object3 = "item_category2";
        object4 = "dimension45";
        if (string3 != null && (n7 = string3.length()) != 0) {
            string3 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object4);
            if (product != null) {
                object4 = product.getVerticalNameText();
            } else {
                n4 = 0;
                object4 = null;
            }
            string2.putString(string3, (String)object4);
            if (product != null) {
                string3 = product.getVerticalNameText();
            } else {
                n7 = 0;
                string3 = null;
            }
            string2.putString((String)object3, string3);
        } else {
            string3 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object4);
            if (product != null) {
                object4 = product.getBrickSubCategory();
            } else {
                n4 = 0;
                object4 = null;
            }
            if (object4 != null && (n4 = object4.length()) != 0) {
                if (product != null) {
                    object4 = product.getBrickSubCategory();
                } else {
                    n4 = 0;
                    object4 = null;
                }
            } else {
                object4 = object2;
            }
            string2.putString(string3, (String)object4);
            if (product != null) {
                string3 = product.getBrickSubCategory();
            } else {
                n7 = 0;
                string3 = null;
            }
            if (string3 != null && (n7 = string3.length()) != 0) {
                if (product != null) {
                    string3 = product.getBrickSubCategory();
                } else {
                    n7 = 0;
                    string3 = null;
                }
            } else {
                string3 = object2;
            }
            string2.putString((String)object3, string3);
        }
        if (product != null) {
            string3 = product.getBrickNameText();
        } else {
            n7 = 0;
            string3 = null;
        }
        object3 = "item_category3";
        object4 = "dimension46";
        if (string3 != null && (n7 = string3.length()) != 0) {
            string3 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object4);
            if (product != null) {
                object4 = product.getBrickNameText();
            } else {
                n4 = 0;
                object4 = null;
            }
            string2.putString(string3, (String)object4);
            if (product != null) {
                string3 = product.getBrickNameText();
            } else {
                n7 = 0;
                string3 = null;
            }
            string2.putString((String)object3, string3);
        } else {
            string3 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object4);
            if (product != null) {
                object4 = product.getBrickName();
            } else {
                n4 = 0;
                object4 = null;
            }
            if (object4 != null && (n4 = object4.length()) != 0) {
                if (product != null) {
                    object4 = product.getBrickName();
                } else {
                    n4 = 0;
                    object4 = null;
                }
            } else {
                object4 = object2;
            }
            string2.putString(string3, (String)object4);
            if (product != null) {
                string3 = product.getBrickName();
            } else {
                n7 = 0;
                string3 = null;
            }
            if (string3 != null && (n7 = string3.length()) != 0) {
                if (product != null) {
                    string3 = product.getBrickName();
                } else {
                    n7 = 0;
                    string3 = null;
                }
            } else {
                string3 = object2;
            }
            string2.putString((String)object3, string3);
        }
        if (product == null || (string3 = product.getBrickCategory()) == null) {
            string3 = object2;
        }
        object3 = "product_gender";
        string2.putString((String)object3, string3);
        if (product == null || (string3 = product.getCode()) == null) {
            string3 = object2;
        }
        object3 = "product_id";
        string2.putString((String)object3, string3);
        if (product != null && (string3 = product.getBrandName()) != null) {
            object2 = string3;
        }
        string3 = "product_brand";
        string2.putString(string3, (String)object2);
        if (product != null) {
            object2 = product.getBrickSubCategory();
        } else {
            bl3 = false;
            object2 = null;
        }
        string2.putString("product_vertical", (String)object2);
        string2.putString("item_id", string4);
        object2 = this.getStoreType();
        string3 = "store_type";
        string2.putString(string3, (String)object2);
        string4 = this.getStoreType();
        string2.putString("contains_store", string4);
        object2 = this.Time_O_Day;
        string4 = rj_0.b();
        string2.putString((String)object2, string4);
        object2 = this.CLIENT_ID;
        string4 = this.getClientId();
        string2.putString((String)object2, string4);
        object2 = this.HYBRIS_ID;
        string4 = this.getHybrisId();
        string2.putString((String)object2, string4);
        object2 = this.NETWORK_TYPE;
        AJIOApplication.Companion.getClass();
        string4 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        string2.putString((String)object2, string4);
        object2 = this.SCREEN_NAME;
        string2.putString((String)object2, (String)object);
        object2 = this.SCREENNAME;
        string2.putString((String)object2, (String)object);
        object2 = this.USER_STATUS;
        string4 = this.getUserStatus();
        string2.putString((String)object2, string4);
        object2 = this.LOGIN_STATUS;
        string4 = this.getLoggedINStatus();
        string2.putString((String)object2, string4);
        object2 = this.SCREEN_TYPE;
        string2.putString((String)object2, (String)object);
        object2 = this.PREVIOUS_SCREEN;
        string2.putString((String)object2, (String)charSequence);
        object2 = this.PREVIOUS_SCREEN_TYPE;
        string2.putString((String)object2, (String)charSequence);
        charSequence = this.IS_GA4;
        string2.putString((String)charSequence, "true");
        object2 = this.getLoggedINStatus();
        string2.putString("LoggedInStatus", (String)object2);
        charSequence = this.getUserInformation().getEncryptedUuid();
        bl3 = TextUtils.isEmpty((CharSequence)charSequence);
        if (bl3) {
            charSequence = "N/A";
        } else {
            cp_1.Companion.getClass();
            object2 = cp$a.e();
            object2.getClass();
            charSequence = cp_1.L((String)charSequence);
        }
        object2 = "userId";
        string2.putString((String)object2, (String)charSequence);
        string2.putString("screenname", (String)object);
        charSequence = this.getClientId();
        string2.putString("Client_ID", (String)charSequence);
        charSequence = this.getHybrisId();
        string2.putString("hybris_id", (String)charSequence);
        object = this.appPreferences.f();
        if (object != null) {
            charSequence = StringsKt.m0((CharSequence)object);
            string5 = charSequence.toString();
        }
        if (string5 != null && (n3 = string5.length()) != 0) {
            charSequence = "user_type";
            string2.putString((String)charSequence, (String)object);
        }
        charSequence = this.getUserStatus();
        string2.putString("user_status", (String)charSequence);
        object = rj_0.b();
        string2.putString("Time_of_the_day", (String)object);
        object = this.getStoreType();
        string2.putString(string3, (String)object);
        object = this.PAGE_TYPE;
        charSequence = yx0_0.a;
        string2.putString((String)object, (String)charSequence);
        object = this.SERVED_FROM_CMS;
        string2.putString((String)object, "false");
        charSequence = "Enhance E-commerce";
        string2.putString("event_category", (String)charSequence);
        object = "event_action";
        if (bl2) {
            charSequence = this.EE_SELECT_PROMOTION;
            string2.putString((String)object, (String)charSequence);
            object = this.analytics;
            charSequence = this.EE_SELECT_PROMOTION;
            ((FirebaseAnalytics)object).logEvent((String)charSequence, (Bundle)string2);
        } else {
            charSequence = this.EE_VIEW_PROMOTION;
            string2.putString((String)object, (String)charSequence);
            object = this.analytics;
            charSequence = this.EE_VIEW_PROMOTION;
            ((FirebaseAnalytics)object).logEvent((String)charSequence, (Bundle)string2);
        }
    }

    public static /* synthetic */ void pushEECustomForTab$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, String string2, String string3, String string4, String string5, String string6, boolean bl2, String string7, boolean bl3, String string8, int n3, Object object) {
        String string9;
        boolean bl4;
        String string10;
        int n4 = n3;
        int n7 = n3 & 0x40;
        String string11 = n7 != 0 ? (string10 = "Mobile") : string7;
        n7 = n4 & 0x80;
        if (n7 != 0) {
            n7 = 0;
            string10 = null;
            bl4 = false;
        } else {
            bl4 = bl3;
        }
        if ((n4 &= 0x100) != 0) {
            n4 = 0;
            string9 = null;
        } else {
            string9 = string8;
        }
        newEEcommerceEventsRevamp.pushEECustomForTab(string2, string3, string4, string5, string6, bl2, string11, bl4, string9);
    }

    private final void pushEECustomForTabGAV4(String object, String string2, String string3, String object2, String string4, boolean bl2, String string5, boolean bl3, String string6) {
        Object object3;
        String string7;
        int n3 = ((String)object2).length();
        String string8 = null;
        String string9 = "";
        if (n3 == 0) {
            object2 = string9;
        } else {
            string7 = "/";
            n3 = StringsKt.R((CharSequence)object2, string7, 0, 6) + 1;
            object2 = ((String)object2).substring(n3);
            object3 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        }
        object3 = new ArrayList();
        string7 = new Bundle();
        String string10 = "index";
        string7.putInt(string10, 0);
        string8 = "promotion_id";
        string7.putString(string8, string5);
        if (bl3) {
            string3 = this.extractFileNameFromUrl(string3);
            string5 = "paid-";
            string3 = kp1_0.c(string5, string3);
        }
        string7.putString("promotion_name", string3);
        string7.putString("creative_name", (String)object2);
        string7.putString("creative_slot", string4);
        ((ArrayList)object3).add(string7);
        string3 = new Bundle();
        object2 = this.ITEMS;
        string3.putParcelableArrayList((String)object2, (ArrayList)object3);
        string3.putString("item_id", string9);
        object2 = this.getStoreType();
        string4 = "store_type";
        string3.putString(string4, (String)object2);
        string5 = this.getStoreType();
        string3.putString("contains_store", string5);
        object2 = this.Time_O_Day;
        string5 = rj_0.b();
        string3.putString((String)object2, string5);
        object2 = this.CLIENT_ID;
        string5 = this.getClientId();
        string3.putString((String)object2, string5);
        object2 = this.HYBRIS_ID;
        string5 = this.getHybrisId();
        string3.putString((String)object2, string5);
        object2 = this.NETWORK_TYPE;
        AJIOApplication.Companion.getClass();
        string5 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        string3.putString((String)object2, string5);
        object2 = this.USER_STATUS;
        string5 = this.getUserStatus();
        string3.putString((String)object2, string5);
        object2 = this.LOGIN_STATUS;
        string5 = this.getLoggedINStatus();
        string3.putString((String)object2, string5);
        object2 = this.SCREEN_TYPE;
        string3.putString((String)object2, (String)object);
        object2 = this.SCREEN_NAME;
        string3.putString((String)object2, (String)object);
        object2 = this.SCREENNAME;
        string3.putString((String)object2, (String)object);
        object = this.PREVIOUS_SCREEN;
        string3.putString((String)object, string2);
        object = this.PREVIOUS_SCREEN_TYPE;
        string3.putString((String)object, string2);
        object = this.IS_GA4;
        string2 = "true";
        string3.putString((String)object, string2);
        object2 = this.getLoggedINStatus();
        string3.putString("LoggedInStatus", (String)object2);
        object = this.getUserInformation().getEncryptedUuid();
        int n4 = TextUtils.isEmpty((CharSequence)object);
        if (n4 != 0) {
            object = "N/A";
        } else {
            cp_1.Companion.getClass();
            object2 = cp$a.e();
            object2.getClass();
            object = cp_1.L((String)object);
        }
        string3.putString("userId", (String)object);
        object = AnalyticsManager.Companion.getInstance().getGtmEvents().getScreenName();
        string3.putString("screenname", (String)object);
        object2 = this.getClientId();
        string3.putString("Client_ID", (String)object2);
        object2 = this.getHybrisId();
        string3.putString("hybris_id", (String)object2);
        object = this.appPreferences.f();
        if (object != null) {
            object2 = ((Object)StringsKt.m0((CharSequence)object)).toString();
        } else {
            n4 = 0;
            object2 = null;
        }
        if (object2 != null && (n4 = ((String)object2).length()) != 0) {
            object2 = "user_type";
            string3.putString((String)object2, (String)object);
        }
        object2 = this.getUserStatus();
        string3.putString("user_status", (String)object2);
        object = rj_0.b();
        string3.putString("Time_of_the_day", (String)object);
        object = this.getStoreType();
        string3.putString(string4, (String)object);
        object = this.PAGE_TYPE;
        object2 = yx0_0.a;
        string3.putString((String)object, (String)object2);
        object = this.SERVED_FROM_CMS;
        string3.putString((String)object, string2);
        object = "event_category";
        string2 = "Enhance E-commerce";
        string3.putString((String)object, string2);
        if (string6 != null) {
            object = "cms_experiment";
            string3.putString((String)object, string6);
        }
        object = "event_action";
        if (bl2) {
            string2 = this.EE_SELECT_PROMOTION;
            string3.putString((String)object, string2);
            object = this.analytics;
            string2 = this.EE_SELECT_PROMOTION;
            ((FirebaseAnalytics)object).logEvent(string2, (Bundle)string3);
        } else {
            string2 = this.EE_VIEW_PROMOTION;
            string3.putString((String)object, string2);
            object = this.analytics;
            string2 = this.EE_VIEW_PROMOTION;
            ((FirebaseAnalytics)object).logEvent(string2, (Bundle)string3);
        }
    }

    public static /* synthetic */ void pushEECustomForTabGAV4$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, String string2, String string3, String string4, String string5, String string6, boolean bl2, String string7, boolean bl3, String string8, int n3, Object object) {
        String string9;
        boolean bl4;
        String string10;
        int n4 = n3;
        int n7 = n3 & 0x40;
        String string11 = n7 != 0 ? (string10 = "Mobile") : string7;
        n7 = n4 & 0x80;
        if (n7 != 0) {
            n7 = 0;
            string10 = null;
            bl4 = false;
        } else {
            bl4 = bl3;
        }
        if ((n4 &= 0x100) != 0) {
            n4 = 0;
            string9 = null;
        } else {
            string9 = string8;
        }
        newEEcommerceEventsRevamp.pushEECustomForTabGAV4(string2, string3, string4, string5, string6, bl2, string11, bl4, string9);
    }

    public static /* synthetic */ void pushEECustomForTabs$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, String string2, String string3, ArrayList arrayList, String string4, String string5, int n3, Object object) {
        int n4 = n3 & 8;
        if (n4 != 0) {
            string4 = "Mobile";
        }
        String string6 = string4;
        int n7 = n3 & 0x10;
        if (n7 != 0) {
            string5 = null;
        }
        newEEcommerceEventsRevamp.pushEECustomForTabs(string2, string3, arrayList, string6, string5);
    }

    private final void pushEECustomForTabsGAV4(String object, String string2, ArrayList object2, String object3, String string3) {
        String string4;
        String string5;
        String string6;
        Object object4;
        block10: {
            object4 = new ArrayList();
            object2 = object2.iterator();
            string6 = null;
            int n3 = 0;
            String string7 = null;
            while (true) {
                String string8;
                boolean bl2 = object2.hasNext();
                boolean bl3 = false;
                string5 = null;
                string4 = "";
                if (!bl2) break block10;
                Object object5 = object2.next();
                int n4 = n3 + 1;
                if (n3 < 0) break;
                object5 = (NativeCategoryNavigationListDetail)object5;
                bl3 = hu1_2.d();
                if (!bl3 && (bl3 = ((NativeCategoryNavigationListDetail)object5).getDefaultNode())) {
                    object5 = "Home";
                    string4 = "Home.png";
                } else {
                    string5 = ((NativeCategoryNavigationListDetail)object5).getInactiveAltText();
                    if (string5 == null) {
                        string5 = string4;
                    }
                    object5 = ((NativeCategoryNavigationListDetail)object5).getImgUrlForTab();
                    if (object5 != null) {
                        string8 = "/";
                        int n7 = StringsKt.R((CharSequence)object5, string8, 0, 6) + 1;
                        string4 = ((String)object5).substring(n7);
                        object5 = "substring(...)";
                        Intrinsics.checkNotNullExpressionValue(string4, (String)object5);
                    }
                    object5 = string5;
                }
                string5 = new Bundle();
                string5.putInt("index", n3);
                string5.putString("promotion_id", (String)object3);
                string8 = "promotion_name";
                string5.putString(string8, (String)object5);
                string5.putString("creative_name", string4);
                object5 = "creative_slot";
                string7 = String.valueOf(n3);
                string5.putString((String)object5, string7);
                ((ArrayList)object4).add(string5);
                n3 = n4;
            }
            xx_2.n();
            throw null;
        }
        object2 = new Bundle();
        object3 = this.ITEMS;
        object2.putParcelableArrayList((String)object3, object4);
        object2.putString("item_id", string4);
        object3 = this.getStoreType();
        object4 = "store_type";
        object2.putString((String)object4, (String)object3);
        string6 = this.getStoreType();
        object2.putString("contains_store", string6);
        object3 = this.Time_O_Day;
        string6 = rj_0.b();
        object2.putString((String)object3, string6);
        object3 = this.CLIENT_ID;
        string6 = this.getClientId();
        object2.putString((String)object3, string6);
        object3 = this.HYBRIS_ID;
        string6 = this.getHybrisId();
        object2.putString((String)object3, string6);
        object3 = this.NETWORK_TYPE;
        AJIOApplication.Companion.getClass();
        string6 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        object2.putString((String)object3, string6);
        object3 = this.USER_STATUS;
        string6 = this.getUserStatus();
        object2.putString((String)object3, string6);
        object3 = this.LOGIN_STATUS;
        string6 = this.getLoggedINStatus();
        object2.putString((String)object3, string6);
        object3 = this.SCREEN_TYPE;
        object2.putString((String)object3, (String)object);
        object3 = this.SCREEN_NAME;
        object2.putString((String)object3, (String)object);
        object3 = this.SCREENNAME;
        object2.putString((String)object3, (String)object);
        object = this.PREVIOUS_SCREEN;
        object2.putString((String)object, string2);
        object = this.PREVIOUS_SCREEN_TYPE;
        object2.putString((String)object, string2);
        object = this.IS_GA4;
        string2 = "true";
        object2.putString((String)object, string2);
        object3 = this.getLoggedINStatus();
        object2.putString("LoggedInStatus", (String)object3);
        object = this.getUserInformation().getEncryptedUuid();
        int n8 = TextUtils.isEmpty((CharSequence)object);
        if (n8 != 0) {
            object = "N/A";
        } else {
            cp_1.Companion.getClass();
            object3 = cp$a.e();
            object3.getClass();
            object = cp_1.L((String)object);
        }
        object2.putString("userId", (String)object);
        object = AnalyticsManager.Companion.getInstance().getGtmEvents().getScreenName();
        object2.putString("screenname", (String)object);
        object3 = this.getClientId();
        object2.putString("Client_ID", (String)object3);
        object3 = this.getHybrisId();
        object2.putString("hybris_id", (String)object3);
        object = this.appPreferences.f();
        if (object != null) {
            object3 = StringsKt.m0((CharSequence)object);
            string5 = object3.toString();
        }
        if (string5 != null && (n8 = string5.length()) != 0) {
            object3 = "user_type";
            object2.putString((String)object3, (String)object);
        }
        object3 = this.getUserStatus();
        object2.putString("user_status", (String)object3);
        object = rj_0.b();
        object2.putString("Time_of_the_day", (String)object);
        object = this.getStoreType();
        object2.putString((String)object4, (String)object);
        object = this.PAGE_TYPE;
        object3 = yx0_0.a;
        object2.putString((String)object, (String)object3);
        object = this.SERVED_FROM_CMS;
        object2.putString((String)object, string2);
        object2.putString("event_category", "Enhance E-commerce");
        object = "event_action";
        string2 = this.EE_VIEW_PROMOTION;
        object2.putString((String)object, string2);
        if (string3 != null) {
            object = "cms_experiment";
            object2.putString((String)object, string3);
        }
        object = this.analytics;
        string2 = this.EE_VIEW_PROMOTION;
        ((FirebaseAnalytics)object).logEvent(string2, (Bundle)object2);
    }

    public static /* synthetic */ void pushEECustomForTabsGAV4$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, String string2, String string3, ArrayList arrayList, String string4, String string5, int n3, Object object) {
        int n4 = n3 & 8;
        if (n4 != 0) {
            string4 = "Mobile";
        }
        String string6 = string4;
        int n7 = n3 & 0x10;
        if (n7 != 0) {
            string5 = null;
        }
        newEEcommerceEventsRevamp.pushEECustomForTabsGAV4(string2, string3, arrayList, string6, string5);
    }

    private final void pushEEFleekImpressionGAV4(List object, String object2, String object3, String string2, String string3) {
        int n3;
        Object object4;
        Object object5;
        int n4;
        ArrayList<Bundle> arrayList = new ArrayList<Bundle>();
        object = ((Iterable)object).iterator();
        while ((n4 = object.hasNext()) != 0) {
            object5 = (wq0_0)object.next();
            object4 = new Bundle();
            String string4 = ((wq0_0)object5).a;
            object4.putString("promotion_id", string4);
            string4 = ((wq0_0)object5).b;
            object4.putString("promotion_name", string4);
            string4 = ((wq0_0)object5).c;
            object4.putString("creative_name", string4);
            string4 = ((wq0_0)object5).d;
            String string5 = "creative_slot";
            object4.putString(string5, string4);
            object5 = ((wq0_0)object5).d;
            object4.putString(string5, (String)object5);
            arrayList.add((Bundle)object4);
        }
        object = new Bundle();
        object4 = this.getStoreType();
        object.putString("store_type", (String)object4);
        object5 = this.Time_O_Day;
        object4 = rj_0.b();
        object.putString((String)object5, (String)object4);
        object5 = this.CLIENT_ID;
        object4 = this.getClientId();
        object.putString((String)object5, (String)object4);
        object5 = this.HYBRIS_ID;
        object4 = this.getHybrisId();
        object.putString((String)object5, (String)object4);
        object5 = this.NETWORK_TYPE;
        AJIOApplication.Companion.getClass();
        object4 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        object.putString((String)object5, (String)object4);
        object5 = this.SCREEN_NAME;
        object.putString((String)object5, (String)object2);
        object5 = this.getSegmentIds();
        if (object5 != null && (n4 = ((String)object5).length()) != 0) {
            object5 = "pricing_cust_seg";
            object4 = this.getSegmentIds();
            object.putString((String)object5, (String)object4);
        }
        object5 = this.SCREENNAME;
        object.putString((String)object5, (String)object2);
        object2 = this.USER_STATUS;
        object5 = this.getUserStatus();
        object.putString((String)object2, (String)object5);
        object2 = this.LOGIN_STATUS;
        object5 = this.getLoggedINStatus();
        object.putString((String)object2, (String)object5);
        object2 = this.SCREEN_TYPE;
        object.putString((String)object2, string2);
        object2 = this.PREVIOUS_SCREEN;
        object.putString((String)object2, (String)object3);
        object2 = this.PREVIOUS_SCREEN_TYPE;
        object.putString((String)object2, string3);
        object2 = this.ITEMS;
        object.putParcelableArrayList((String)object2, arrayList);
        object2 = this.appPreferences.f();
        if (object2 != null) {
            object3 = ((Object)StringsKt.m0((CharSequence)object2)).toString();
        } else {
            n3 = 0;
            object3 = null;
        }
        if (object3 != null && (n3 = ((String)object3).length()) != 0) {
            object3 = "user_type";
            object.putString((String)object3, (String)object2);
        }
        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(object2 = this.getUserInformation().getEncryptedUuid())) ? 1 : 0)) != 0) {
            object2 = "N/A";
        } else {
            cp_1.Companion.getClass();
            object3 = cp$a.e();
            object3.getClass();
            object2 = cp_1.L((String)object2);
        }
        object3 = this.IS_GA4;
        object.putString((String)object3, "true");
        object.putString("userId", (String)object2);
        object.putString("event_category", "Enhance E-commerce");
        object3 = this.EE_VIEW_PROMOTION;
        object.putString("event_action", (String)object3);
        object2 = this.analytics;
        object3 = this.EE_VIEW_PROMOTION;
        ((FirebaseAnalytics)object2).logEvent((String)object3, (Bundle)object);
    }

    public static /* synthetic */ void pushEEProductImpression$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, List list, String string2, String string3, String string4, String string5, boolean bl2, String string6, String string7, String string8, String string9, String string10, String string11, boolean bl3, String string12, BannerData bannerData, long l2, Yj2 yj2, String string13, String string14, String string15, Bundle bundle, String string16, boolean bl4, int n3, Object object) {
        long l3;
        String string17;
        Object object2;
        int n4 = n3;
        int n7 = n3 & 2;
        if (n7 != 0) {
            object2 = newEEcommerceEventsRevamp.EE_VIEW_ITEM_LIST;
            string17 = object2;
        } else {
            string17 = string2;
        }
        int n8 = n4 & 8;
        Object object3 = "";
        Object object4 = n8 != 0 ? object3 : string4;
        n8 = n4 & 0x20;
        boolean bl5 = n8 != 0 ? false : bl2;
        n8 = n4 & 0x200;
        Object object5 = n8 != 0 ? object3 : string9;
        n8 = n4 & 0x400;
        Object object6 = n8 != 0 ? object3 : string10;
        n8 = n4 & 0x800;
        Object object7 = n8 != 0 ? object3 : string11;
        n8 = n4 & 0x1000;
        boolean bl6 = n8 != 0 ? false : bl3;
        n8 = n4 & 0x2000;
        Object object8 = n8 != 0 ? object3 : string12;
        n8 = n4 & 0x4000;
        object3 = null;
        BannerData bannerData2 = n8 != 0 ? null : bannerData;
        n8 = 0x8000 & n4;
        long l4 = n8 != 0 ? (l3 = 0L) : l2;
        n8 = 0x10000 & n4;
        Yj2 yj22 = n8 != 0 ? null : yj2;
        n8 = 0x20000 & n4;
        String string18 = n8 != 0 ? null : string13;
        n8 = 0x40000 & n4;
        String string19 = n8 != 0 ? null : string14;
        n8 = 0x80000 & n4;
        String string20 = n8 != 0 ? null : string15;
        n8 = 0x100000 & n4;
        Bundle bundle2 = n8 != 0 ? null : bundle;
        n8 = 0x200000 & n4;
        String string21 = n8 != 0 ? null : string16;
        n8 = 0x400000;
        boolean bl7 = (n4 &= n8) != 0 ? false : bl4;
        object2 = newEEcommerceEventsRevamp;
        object3 = list;
        newEEcommerceEventsRevamp.pushEEProductImpression(list, string17, string3, (String)object4, string5, bl5, string6, string7, string8, (String)object5, (String)object6, (String)object7, bl6, (String)object8, bannerData2, l4, yj22, string18, string19, string20, bundle2, string21, bl7);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void pushEEProductImpressionGAV4(List var1_1, String var2_2, String var3_3, String var4_4, boolean var5_5, String var6_6, String var7_7, String var8_8, String var9_9, String var10_10, String var11_11, boolean var12_12, String var13_13, BannerData var14_14, long var15_15, Yj2 var17_16, String var18_17, String var19_18, String var20_19, Bundle var21_20, String var22_21, boolean var23_22) {
        var24_23 = this;
        var25_24 = var2_2;
        var26_25 = var4_4;
        var27_26 = var18_17;
        var28_27 = var19_18;
        var29_28 = var20_19;
        var30_29 /* !! */  = var21_20;
        var31_30 = var22_21;
        var32_31 = "shortText";
        var33_32 = new ArrayList<Object>();
        var34_33 /* !! */  = new HashSet();
        var35_34 = null;
        if (!var23_22) ** GOTO lbl-1000
        var36_35 = h40_0.a;
        var36_35 = h40_0.f();
        if (var36_35 != null) {
            var37_36 = var36_35 = var36_35.getTag_text();
        } else lbl-1000:
        // 2 sources

        {
            var38_37 = false;
            var37_36 = null;
        }
        var39_38 = var1_1.iterator();
        var40_39 = 0L;
        var42_40 = 0.0;
        var44_41 = var40_39;
        var46_42 = var42_40;
        while (true) {
            block84: {
                block83: {
                    var48_43 = var39_38.hasNext();
                    var49_44 = "";
                    if (var48_43 == 0) break;
                    var36_35 = (Product)var39_38.next();
                    var31_30 = GAEcommerceEvents.INSTANCE;
                    var11_11 = var49_44;
                    var49_44 = var36_35.getCatalogName();
                    var49_44 = var31_30.getStoreTypeFromCatalog((String)var49_44);
                    var34_33 /* !! */ .add(var49_44);
                    var50_45 = true;
                    var51_46 = 0;
                    var52_47 = 16;
                    var53_48 = var36_35;
                    var36_35 = this;
                    var54_49 = var11_11;
                    var55_50 = var49_44;
                    var49_44 = var53_48;
                    var56_51 = var46_42;
                    var58_52 = var3_3;
                    var59_53 = var5_5;
                    var60_54 = var37_36;
                    var38_37 = var50_45;
                    var61_55 = var34_33 /* !! */ ;
                    var34_33 /* !! */  = null;
                    var62_56 = var33_32;
                    var33_32 = var2_2;
                    var63_57 = var32_31;
                    var64_58 = var52_47;
                    var30_29 /* !! */  = var22_21;
                    var29_28 = var31_30;
                    var31_30 = null;
                    var36_35 = NewEEcommerceEventsRevamp.makeItemBundle$default(this, var53_48, var3_3, (boolean)var5_5, var50_45, null, var2_2, var52_47, null);
                    var49_44 = var55_50;
                    var55_50((Bundle)var36_35);
                    var48_43 = var53_48.getPosition();
                    var44_41 = var48_43;
                    var55_50.putLong("index", var44_41);
                    var36_35 = var53_48.getAdsData();
                    if (var36_35 == null || (var36_35 = var36_35.getConfig()) == null || (var36_35 = var36_35.getC()) == null) {
                        var36_35 = var54_49;
                    }
                    var58_52 = el1_2.a;
                    var65_59 = el1_2.i(var53_48);
                    var58_52 = var65_59 != 0 ? "yes" : "no";
                    if (var12_12) {
                        var66_60 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get("dimension17");
                        var37_36 = var13_13;
                        var49_44.putString((String)var66_60, var13_13);
                    } else {
                        var37_36 = var13_13;
                    }
                    var66_60 = var53_48.getAggregateRating();
                    if (var66_60 != null && (var59_53 = var66_60.length()) != 0) {
                        var66_60 = Ga4Events.INSTANCE.getGav4DimensionMap();
                        var34_33 /* !! */  = LD2.b;
                        var66_60 = (String)var66_60.get(var34_33 /* !! */ );
                        var34_33 /* !! */  = var53_48.getAggregateRating();
                        var49_44.putString((String)var66_60, (String)var34_33 /* !! */ );
                    }
                    var66_60 = Ga4Events.INSTANCE;
                    var34_33 /* !! */  = (String)var66_60.getGav4DimensionMap().get("dimension16");
                    cp_1.Companion.getClass();
                    cp$a.e().getClass();
                    var67_61 = cp_1.x(var53_48);
                    var49_44.putDouble((String)var34_33 /* !! */ , var67_61);
                    var34_33 /* !! */  = var66_60.getGav4DimensionMap();
                    var33_32 = "dimension166";
                    var34_33 /* !! */  = (String)var34_33 /* !! */ .get(var33_32);
                    var49_44.putString((String)var34_33 /* !! */ , (String)var36_35);
                    var36_35 = var66_60.getGav4DimensionMap();
                    var34_33 /* !! */  = "dimension167";
                    var36_35 = (String)var36_35.get(var34_33 /* !! */ );
                    var49_44.putString((String)var36_35, (String)var58_52);
                    var36_35 = (String)var66_60.getGav4DimensionMap().get("dimension168");
                    var58_52 = var53_48.getFnlColorVariantData();
                    if (var58_52 == null || (var58_52 = var58_52.getColorGroup()) == null) {
                        var58_52 = var54_49;
                    }
                    var49_44.putString((String)var36_35, (String)var58_52);
                    var36_35 = cp$a.e();
                    var36_35.getClass();
                    var48_43 = (int)cp_1.F(var53_48);
                    cp$a.e().getClass();
                    var69_62 = cp_1.y(var53_48);
                    var58_52 = "dimension19";
                    if (var48_43 != 0) {
                        cp$a.e().getClass();
                        var36_35 = cp_1.t(var53_48);
                        var58_52 = (String)var66_60.getGav4DimensionMap().get(var58_52);
                        var34_33 /* !! */  = "0 | non-deliverable | ";
                        k01_0.a((String)var34_33 /* !! */ , (String)var36_35, (Bundle)var49_44, (String)var58_52);
                    } else {
                        var36_35 = (String)var66_60.getGav4DimensionMap().get(var58_52);
                        var58_52 = new StringBuilder();
                        var58_52.append(var69_62);
                        var34_33 /* !! */  = " | deliverable";
                        var58_52.append((String)var34_33 /* !! */ );
                        var58_52 = var58_52.toString();
                        var49_44.putString((String)var36_35, (String)var58_52);
                    }
                    var36_35 = Yj2.LIST;
                    var58_52 = "dimension24";
                    var34_33 /* !! */  = var17_16;
                    if (var17_16 == var36_35) {
                        var36_35 = (String)var66_60.getGav4DimensionMap().get(var58_52);
                        var58_52 = "List";
                        var49_44.putString((String)var36_35, (String)var58_52);
                    } else {
                        var36_35 = (String)var66_60.getGav4DimensionMap().get(var58_52);
                        var58_52 = "Grid";
                        var49_44.putString((String)var36_35, (String)var58_52);
                    }
                    var36_35 = cp$a.e();
                    var58_52 = var53_48.getSegmentId();
                    var33_32 = var53_48.getExperimentId();
                    var36_35.getClass();
                    var36_35 = cp_1.A((String)var58_52, (String)var33_32);
                    if (var36_35 != null) {
                        var58_52 = var66_60.getGav4DimensionMap();
                        var33_32 = "dimension20";
                        var58_52 = (String)var58_52.get(var33_32);
                        var49_44.putString((String)var58_52, (String)var36_35);
                        var36_35 = Unit.a;
                    }
                    if ((var36_35 = var53_48.getCatalogName()) == null) {
                        var36_35 = var53_48.getCatalog();
                    }
                    var36_35 = var29_28.getStoreTypeFromCatalog((String)var36_35);
                    var58_52 = h40_0.a;
                    var71_63 = h40_0.K1();
                    if (var71_63) {
                        var33_32 = var53_48.getProductListType();
                        var32_31 = " | ";
                        var36_35 = n1.a((String)var36_35, (String)var32_31, (String)var33_32);
                    }
                    var33_32 = var66_60.getGav4DimensionMap();
                    var32_31 = var24_23.DIMENSION148;
                    var33_32 = (String)var33_32.get(var32_31);
                    var49_44.putString((String)var33_32, (String)var36_35);
                    var36_35 = hv3_0.a;
                    var36_35.getClass();
                    var48_43 = 1;
                    var33_32 = var53_48;
                    var32_31 = (String)hv3_0.H(var53_48, (boolean)var48_43).b;
                    var31_30 = (String)hv3_0.h(var53_48, (boolean)var48_43).b;
                    var29_28 = new StringBuilder();
                    if (var32_31 != null) {
                        var51_46 = var32_31.length();
                        if (var51_46 <= 0) {
                            var64_58 = 0;
                            var32_31 = null;
                        }
                        if (var32_31 != null) {
                            var29_28.append((String)var32_31);
                        }
                    }
                    if ((var32_31 = var33_32.getCatalog()) == null) {
                        var32_31 = var33_32.getCatalogName();
                    }
                    if ((var48_43 = Intrinsics.areEqual(var32_31, var36_35 = "ajioGram")) != 0) {
                        var36_35 = var60_54;
                        if (var60_54 != null && (var64_58 = var60_54.length()) != 0) {
                            var64_58 = var29_28.length();
                            if (var64_58 > 0) {
                                var32_31 = ",";
                                var29_28.append((String)var32_31);
                            }
                            var29_28.append((String)var36_35);
                        }
                    } else {
                        var36_35 = var60_54;
                    }
                    var32_31 = var29_28.toString();
                    var72_64 = TextUtils.isEmpty((CharSequence)var32_31);
                    var60_54 = var36_35;
                    var36_35 = "dimension161";
                    if (!var72_64) {
                        var29_28 = (String)var66_60.getGav4DimensionMap().get(var36_35);
                        var49_44.putString((String)var29_28, (String)var32_31);
                    }
                    var32_31 = Unit.a;
                    var64_58 = (int)h40_0.W0();
                    if (var64_58 != 0 && (var64_58 = (int)hv3_0.V(var33_32)) != 0) {
                        var32_31 = hv3_0.A(var33_32.getFnlColorVariantData());
                        var49_44.putString((String)var36_35, (String)var32_31);
                    }
                    var36_35 = mz3_0.n(var33_32, (String)var31_30);
                    var64_58 = (int)h40_0.Q1();
                    var31_30 = "dimension162";
                    if (var64_58 != 0) {
                        if ((var58_52 = var58_52.g0()) != null) {
                            var32_31 = var33_32.getFnlColorVariantData();
                            if (var32_31 != null) {
                                var32_31 = var32_31.getDeliverySlaTag();
                            } else {
                                var64_58 = 0;
                                var32_31 = null;
                            }
                            var58_52 = (String)var58_52.get(var32_31);
                        } else {
                            var65_59 = 0;
                            var58_52 = null;
                        }
                        if (var58_52 != null && (var64_58 = var58_52.length()) != 0) {
                            var64_58 = var36_35.length();
                            if (var64_58 > 0) {
                                var32_31 = (String)var66_60.getGav4DimensionMap().get(var31_30);
                                var31_30 = new StringBuilder();
                                var31_30.append((String)var36_35);
                                var31_30.append(", ");
                                var31_30.append((String)var58_52);
                                var36_35 = var31_30.toString();
                                var49_44.putString((String)var32_31, (String)var36_35);
                            } else {
                                var36_35 = (String)var66_60.getGav4DimensionMap().get(var31_30);
                                var49_44.putString((String)var36_35, (String)var58_52);
                            }
                        }
                    } else {
                        var65_59 = var36_35.length();
                        if (var65_59 > 0) {
                            var58_52 = (String)var66_60.getGav4DimensionMap().get(var31_30);
                            var49_44.putString((String)var58_52, (String)var36_35);
                        }
                    }
                    if ((var36_35 = this.getSegmentIds()) != null && (var48_43 = var36_35.length()) != 0) {
                        var36_35 = (String)var66_60.getGav4DimensionMap().get("dimension192");
                        var58_52 = cp$a.e();
                        var58_52.getClass();
                        var46_42 = cp_1.w(var33_32);
                        var49_44.putDouble((String)var36_35, var46_42);
                    }
                    if ((var48_43 = (int)hv3_0.y((boolean)var5_5)) == 0 || (var36_35 = var33_32.getTags()) == null || (var36_35 = var36_35.getCategoryTags()) == null) break block83;
                    var36_35 = ((Iterable)var36_35).iterator();
                    while ((var65_59 = (int)var36_35.hasNext()) != 0) {
                        block82: {
                            var58_52 = (CategoryTags)var36_35.next();
                            if (var58_52 != null && (var66_60 = var58_52.getCategory()) != null && (var59_53 = (int)var66_60.equalsIgnoreCase((String)(var32_31 = "SOCIAL_PROOFING"))) == (var64_58 = 1)) {
                                block80: {
                                    block79: {
                                        var58_52 = var58_52.getPrimary();
                                        if (var58_52 == null) break block79;
                                        try {
                                            var58_52 = var58_52.getValue();
                                            break block80;
                                        }
                                        catch (Exception v0) {
                                            ** break block81
                                        }
                                    }
                                    var65_59 = 0;
                                    var58_52 = null;
                                }
                                var58_52 = String.valueOf(var58_52);
                                var58_52 = JsonParser.parseString((String)var58_52);
                                var58_52 = var58_52.getAsJsonObject();
                                if (var58_52 == null) ** break block81
                                var66_60 = var63_57;
                                try {
                                    var64_58 = (int)var58_52.has((String)var63_57);
                                    if (var64_58 == 0) break block82;
                                }
                                catch (Exception v1) {}
                                var58_52 = var58_52.get((String)var63_57);
                                var58_52 = var58_52.getAsString();
                                var32_31 = Ga4Events.INSTANCE;
                                var32_31 = var32_31.getGav4DimensionMap();
                                var31_30 = "dimension169";
                                var32_31 = var32_31.get(var31_30);
                                var32_31 = (String)var32_31;
                                var49_44.putString((String)var32_31, (String)var58_52);
                            } else lbl-1000:
                            // 3 sources

                            {
                                var66_60 = var63_57;
                            }
                            break block82;
                            catch (Exception v2) {
                                var66_60 = var63_57;
                            }
                        }
                        var63_57 = var66_60;
                    }
                    var66_60 = var63_57;
                    var36_35 = Unit.a;
                    break block84;
                }
                var66_60 = var63_57;
            }
            var36_35 = var24_23.PRODUCT_PRICE;
            var73_65 = var49_44.getDouble((String)var36_35);
            var63_57 = var66_60;
            var46_42 = var56_51;
            var46_42 = var56_51 + var73_65;
            var36_35 = var24_23.PDP_RECENTLY_VIEWED;
            var64_58 = 1;
            var48_43 = (int)b.i(var25_24, (String)var36_35, (boolean)var64_58);
            var31_30 = "item_list_name";
            if (var48_43 == 0 && (var48_43 = (int)b.i(var25_24, (String)(var36_35 = var24_23.PDP_SCREEN_SIMILAR_PRODUCT_WIDGET), (boolean)var64_58)) == 0) {
                var48_43 = var33_32.getPosition();
                var75_66 = var48_43;
                var36_35 = new StringBuilder();
                var36_35.append(var25_24);
                var29_28 = "_";
                var36_35.append((String)var29_28);
                var36_35.append(var75_66);
                var36_35 = var36_35.toString();
                var49_44.putString((String)var31_30, (String)var36_35);
lbl333:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var36_35 = String.valueOf(var2_2);
            var49_44.putString((String)var31_30, (String)var36_35);
            ** continue;
            var36_35 = var62_56;
            var62_56.add(var49_44);
            var29_28 = var20_19;
            var33_32 = var62_56;
            var31_30 = var30_29 /* !! */ ;
            var34_33 /* !! */  = var61_55;
            var37_36 = var60_54;
            var32_31 = var63_57;
            var30_29 /* !! */  = var21_20;
        }
        var54_49 = var49_44;
        var36_35 = var33_32;
        var30_29 /* !! */  = var31_30;
        var49_44 = new Bundle();
        var34_33 /* !! */  = this.getStoreType();
        var49_44.putString("store_type", (String)var34_33 /* !! */ );
        var37_36 = var24_23.Time_O_Day;
        var34_33 /* !! */  = rj_0.b();
        var49_44.putString((String)var37_36, (String)var34_33 /* !! */ );
        var37_36 = var24_23.CLIENT_ID;
        var34_33 /* !! */  = this.getClientId();
        var49_44.putString((String)var37_36, (String)var34_33 /* !! */ );
        var37_36 = var24_23.HYBRIS_ID;
        var34_33 /* !! */  = this.getHybrisId();
        var49_44.putString((String)var37_36, (String)var34_33 /* !! */ );
        var37_36 = var24_23.NETWORK_TYPE;
        AJIOApplication.Companion.getClass();
        var34_33 /* !! */  = vV1.d((ContextWrapper)AJIOApplication$a.a());
        var49_44.putString((String)var37_36, (String)var34_33 /* !! */ );
        var37_36 = var24_23.SCREEN_NAME;
        var49_44.putString((String)var37_36, var26_25);
        var37_36 = this.getSegmentIds();
        if (var37_36 != null && (var38_37 = var37_36.length())) {
            var37_36 = "pricing_cust_seg";
            var34_33 /* !! */  = this.getSegmentIds();
            var49_44.putString((String)var37_36, (String)var34_33 /* !! */ );
        }
        var37_36 = var24_23.SCREENNAME;
        var49_44.putString((String)var37_36, var26_25);
        var37_36 = var24_23.USER_STATUS;
        var34_33 /* !! */  = this.getUserStatus();
        var49_44.putString((String)var37_36, (String)var34_33 /* !! */ );
        var37_36 = var24_23.LOGIN_STATUS;
        var34_33 /* !! */  = this.getLoggedINStatus();
        var49_44.putString((String)var37_36, (String)var34_33 /* !! */ );
        var37_36 = var24_23.SCREEN_TYPE;
        var34_33 /* !! */  = var7_7;
        var49_44.putString((String)var37_36, var7_7);
        var37_36 = var24_23.PREVIOUS_SCREEN;
        var34_33 /* !! */  = var6_6;
        var49_44.putString((String)var37_36, var6_6);
        var37_36 = var24_23.PREVIOUS_SCREEN_TYPE;
        var34_33 /* !! */  = var8_8;
        var49_44.putString((String)var37_36, var8_8);
        var37_36 = var24_23.ITEMS;
        var49_44.putParcelableArrayList((String)var37_36, (ArrayList)var36_35);
        var36_35 = var24_23.CONTAINS_LUXE;
        var37_36 = GAEcommerceEvents.INSTANCE;
        var34_33 /* !! */  = var1_1;
        var38_37 = var37_36.containsLuxe(var1_1);
        var37_36 = String.valueOf(var38_37);
        var49_44.putString((String)var36_35, (String)var37_36);
        var36_35 = var24_23.IS_GA4;
        var37_36 = "true";
        var49_44.putString((String)var36_35, (String)var37_36);
        var49_44.putDouble("value", var46_42);
        var58_52 = var10_10;
        var49_44.putString("plp_source", var10_10);
        var58_52 = var9_9;
        var49_44.putString("plp_source_details", var9_9);
        var36_35 = eb_2.a;
        if (var14_14 != null && (var36_35 = var14_14.getDynamicPageMetadata()) != null) {
            var36_35 = var36_35.getDuration();
        } else {
            var48_43 = 0;
            var36_35 = null;
        }
        var48_43 = (int)eb_2.d((Long)var36_35);
        if (var48_43 != 0) {
            if (var14_14 != null && (var36_35 = var14_14.getDynamicPageMetadata()) != null && (var36_35 = var36_35.getExtendedUrl()) != null) {
                var36_35 = ai0_2.h((String)var36_35);
            } else {
                var48_43 = 0;
                var36_35 = null;
            }
            var58_52 = "video_name";
            var49_44.putString((String)var58_52, (String)var36_35);
        }
        if (var27_26 != null) {
            var49_44.putString("plp_page_title", var27_26);
            var36_35 = Unit.a;
        }
        if (var30_29 /* !! */  != null) {
            var49_44.putString("dress_tool_ingress", (String)var30_29 /* !! */ );
            var36_35 = Unit.a;
        }
        if ((var36_35 = var24_23.appPreferences.f()) != null) {
            var58_52 = StringsKt.m0((CharSequence)var36_35);
            var35_34 = var58_52.toString();
        }
        if (var35_34 != null && (var65_59 = var35_34.length()) != 0) {
            var58_52 = "user_type";
            var49_44.putString((String)var58_52, (String)var36_35);
        }
        if (var28_27 != null) {
            var49_44.putString("story_id", var28_27);
            var36_35 = Unit.a;
        }
        var36_35 = var20_19;
        if (var20_19 != null) {
            var58_52 = "post_id";
            var49_44.putString((String)var58_52, var20_19);
            var36_35 = Unit.a;
        }
        var36_35 = var21_20;
        if (var21_20 != null) {
            var58_52 = "product_id";
            var59_53 = (int)var21_20.containsKey((String)var58_52);
            if (var59_53 != 0) {
                var66_60 = var21_20.getString((String)var58_52);
                var49_44.putString((String)var58_52, (String)var66_60);
            }
            if ((var59_53 = (int)var36_35.containsKey((String)(var58_52 = "product_name"))) != 0) {
                var66_60 = var36_35.getString((String)var58_52);
                var49_44.putString((String)var58_52, (String)var66_60);
            }
            if ((var59_53 = (int)var36_35.containsKey((String)(var58_52 = "product_brand"))) != 0) {
                var66_60 = var36_35.getString((String)var58_52);
                var49_44.putString((String)var58_52, (String)var66_60);
            }
            if ((var59_53 = (int)var36_35.containsKey((String)(var58_52 = "product_brick"))) != 0) {
                var66_60 = var36_35.getString((String)var58_52);
                var49_44.putString((String)var58_52, (String)var66_60);
            }
            if ((var59_53 = (int)var36_35.containsKey((String)(var58_52 = "product_category"))) != 0) {
                var66_60 = var36_35.getString((String)var58_52);
                var49_44.putString((String)var58_52, (String)var66_60);
            }
            var58_52 = h40_0.a;
            var65_59 = (int)h40_0.z1();
            if (var65_59 != 0) {
                var58_52 = "user_search_term";
                var66_60 = var54_49;
                var37_36 = var36_35.getString((String)var58_52, var54_49);
                var34_33 /* !! */  = "search_term";
                var33_32 = var36_35.getString((String)var34_33 /* !! */ , var54_49);
                var32_31 = "type_of_redirection";
                var31_30 = var36_35.getString((String)var32_31, var54_49);
                var25_24 = "redirection";
                var36_35 = var36_35.getString(var25_24, var54_49);
                if (var37_36 != null && (var59_53 = var37_36.length()) != 0) {
                    var49_44.putString((String)var58_52, (String)var37_36);
                }
                if (var33_32 != null && (var65_59 = var33_32.length()) != 0) {
                    var49_44.putString((String)var34_33 /* !! */ , var33_32);
                }
                if (var31_30 != null && (var65_59 = var31_30.length()) != 0) {
                    var49_44.putString((String)var32_31, (String)var31_30);
                    var49_44.putString(var25_24, (String)var36_35);
                }
            }
            var36_35 = Unit.a;
        }
        var36_35 = var24_23.CONTAINS_STORE;
        var58_52 = od3_2.a();
        var49_44.putString((String)var36_35, (String)var58_52);
        var49_44.putString("event_category", "Enhance E-commerce");
        var58_52 = "view_item_list";
        var49_44.putString("event_action", (String)var58_52);
        var24_23.analytics.logEvent((String)var58_52, (Bundle)var49_44);
    }

    public static /* synthetic */ void pushEEProductImpressionGAV4$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, List list, String string2, String string3, String string4, boolean bl2, String string5, String string6, String string7, String string8, String string9, String string10, boolean bl3, String string11, BannerData bannerData, long l2, Yj2 yj2, String string12, String string13, String string14, Bundle bundle, String string15, boolean bl4, int n3, Object object) {
        long l3;
        int n4 = n3;
        int n7 = n3 & 4;
        String string16 = "";
        String string17 = n7 != 0 ? string16 : string3;
        n7 = n4 & 0x10;
        boolean bl5 = n7 != 0 ? false : bl2;
        n7 = n4 & 0x100;
        String string18 = n7 != 0 ? string16 : string8;
        n7 = n4 & 0x200;
        String string19 = n7 != 0 ? string16 : string9;
        n7 = n4 & 0x400;
        String string20 = n7 != 0 ? string16 : string10;
        n7 = n4 & 0x800;
        boolean bl6 = n7 != 0 ? false : bl3;
        n7 = n4 & 0x1000;
        String string21 = n7 != 0 ? string16 : string11;
        n7 = n4 & 0x2000;
        string16 = null;
        BannerData bannerData2 = n7 != 0 ? null : bannerData;
        n7 = n4 & 0x4000;
        long l4 = n7 != 0 ? (l3 = 0L) : l2;
        n7 = 0x8000 & n4;
        Yj2 yj22 = n7 != 0 ? null : yj2;
        n7 = 0x10000 & n4;
        String string22 = n7 != 0 ? null : string12;
        n7 = 0x20000 & n4;
        String string23 = n7 != 0 ? null : string13;
        n7 = 0x40000 & n4;
        String string24 = n7 != 0 ? null : string14;
        n7 = 0x80000 & n4;
        Bundle bundle2 = n7 != 0 ? null : bundle;
        n7 = 0x100000;
        String string25 = (n4 &= n7) != 0 ? null : string15;
        newEEcommerceEventsRevamp.pushEEProductImpressionGAV4(list, string2, string17, string4, bl5, string5, string6, string7, string18, string19, string20, bl6, string21, bannerData2, l4, yj22, string22, string23, string24, bundle2, string25, bl4);
    }

    public static /* synthetic */ void pushEEProductSelect$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, Product product, int n3, String string2, String string3, String string4, String string5, boolean bl2, String string6, String string7, Boolean bl3, String string8, String string9, String string10, boolean bl4, String string11, BannerData bannerData, long l2, Yj2 yj2, String string12, Bundle bundle, String string13, String string14, int n4, Object object) {
        long l3;
        String string15;
        Object object2;
        int n7 = n4;
        int n8 = n4 & 4;
        if (n8 != 0) {
            object2 = newEEcommerceEventsRevamp.EE_SELECT_ITEM;
            string15 = object2;
        } else {
            string15 = string2;
        }
        int n10 = n7 & 0x10;
        Object object3 = "";
        Object object4 = n10 != 0 ? object3 : string4;
        n10 = n7 & 0x40;
        boolean bl5 = n10 != 0 ? false : bl2;
        n10 = n7 & 0x200;
        Boolean bl6 = n10 != 0 ? null : bl3;
        n10 = n7 & 0x800;
        Object object5 = n10 != 0 ? object3 : string9;
        n10 = n7 & 0x1000;
        Object object6 = n10 != 0 ? object3 : string10;
        n10 = n7 & 0x2000;
        boolean bl7 = n10 != 0 ? false : bl4;
        n10 = n7 & 0x4000;
        Object object7 = n10 != 0 ? object3 : string11;
        n10 = 0x8000 & n7;
        BannerData bannerData2 = n10 != 0 ? null : bannerData;
        n10 = 0x10000 & n7;
        long l4 = n10 != 0 ? (l3 = 0L) : l2;
        n10 = 0x20000 & n7;
        Yj2 yj22 = n10 != 0 ? null : yj2;
        n10 = 0x40000 & n7;
        String string16 = n10 != 0 ? null : string12;
        n10 = 0x80000 & n7;
        Bundle bundle2 = n10 != 0 ? null : bundle;
        n10 = 0x100000 & n7;
        String string17 = n10 != 0 ? null : string13;
        n10 = 0x200000;
        String string18 = (n7 &= n10) != 0 ? null : string14;
        object2 = newEEcommerceEventsRevamp;
        object3 = product;
        newEEcommerceEventsRevamp.pushEEProductSelect(product, n3, string15, string3, (String)object4, string5, bl5, string6, string7, bl6, string8, (String)object5, (String)object6, bl7, (String)object7, bannerData2, l4, yj22, string16, bundle2, string17, string18);
    }

    private final void pushEEProductSelectGAV4(Product product, int n3, String string2, String string3, String string4, boolean n4, String string5, String string6, Boolean bl2, String string7, String string8, String string9, boolean bl3, String string10, BannerData bannerData, long l2, Yj2 yj2, String string11, Bundle bundle, String string12, String string13) {
        int n7;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = this;
        Object object = product;
        Object object2 = string4;
        int n8 = n4;
        Object object3 = string11;
        Bundle bundle2 = bundle;
        String string14 = string12;
        String string15 = string13;
        FirebaseAnalytics firebaseAnalytics = this.analytics;
        String string16 = this.EE_SELECT_ITEM;
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        String string17 = this.getStoreType();
        parametersBuilder.param("store_type", string17);
        Object object4 = this.Time_O_Day;
        string17 = rj_0.b();
        parametersBuilder.param((String)object4, string17);
        object4 = this.CLIENT_ID;
        string17 = this.getClientId();
        parametersBuilder.param((String)object4, string17);
        object4 = this.HYBRIS_ID;
        string17 = this.getHybrisId();
        parametersBuilder.param((String)object4, string17);
        object4 = this.NETWORK_TYPE;
        AJIOApplication.Companion.getClass();
        string17 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        parametersBuilder.param((String)object4, string17);
        object4 = this.SCREEN_NAME;
        parametersBuilder.param((String)object4, string4);
        object4 = this.SCREENNAME;
        parametersBuilder.param((String)object4, string4);
        object2 = this.USER_STATUS;
        object4 = this.getUserStatus();
        parametersBuilder.param((String)object2, (String)object4);
        object2 = this.LOGIN_STATUS;
        object4 = this.getLoggedINStatus();
        parametersBuilder.param((String)object2, (String)object4);
        object2 = this.SCREEN_TYPE;
        object4 = string6;
        parametersBuilder.param((String)object2, string6);
        object2 = this.PREVIOUS_SCREEN;
        object4 = string5;
        parametersBuilder.param((String)object2, string5);
        object2 = this.PREVIOUS_SCREEN_TYPE;
        object4 = string7;
        parametersBuilder.param((String)object2, string7);
        object2 = this.IS_GA4;
        object4 = "true";
        parametersBuilder.param((String)object2, (String)object4);
        if (string11 != null) {
            parametersBuilder.param("plp_page_title", string11);
            object2 = Unit.a;
        }
        if (string14 != null) {
            parametersBuilder.param("dress_tool_ingress", string14);
            object2 = Unit.a;
        }
        boolean bl4 = true;
        object2 = this;
        object3 = product;
        string14 = string3;
        int n10 = n4;
        Object object5 = bl2;
        Object object6 = string2;
        object2 = this.makeItemBundle(product, string3, n4 != 0, bl4, bl2, string2);
        Bundle bundle3 = new Bundle((Bundle)object2);
        int bl5 = n3;
        long l3 = n3;
        bundle3.putLong("index", l3);
        object2 = Ga4Events.INSTANCE;
        object3 = (String)((Ga4Events)object2).getGav4DimensionMap().get("dimension166");
        string14 = "";
        if (object == null || (object4 = product.getAdsData()) == null || (object4 = ((AdsData)object4).getConfig()) == null || (object4 = ((Config)object4).getC()) == null) {
            object4 = string14;
        }
        bundle3.putString((String)object3, (String)object4);
        object3 = (String)((Ga4Events)object2).getGav4DimensionMap().get("dimension167");
        object4 = el1_2.a;
        n10 = (int)(el1_2.i(product) ? 1 : 0);
        object4 = n10 != 0 ? "yes" : "no";
        bundle3.putString((String)object3, (String)object4);
        object3 = ((Ga4Events)object2).getGav4DimensionMap();
        object4 = "dimension168";
        object3 = (String)object3.get(object4);
        if (object == null || (object4 = product.getFnlColorVariantData()) == null || (object4 = ((ProductFnlColorVariantData)object4).getColorGroup()) == null) {
            object4 = string14;
        }
        bundle3.putString((String)object3, (String)object4);
        cp_1.Companion.getClass();
        object3 = cp$a.e();
        object3.getClass();
        boolean bl6 = cp_1.F(product);
        object4 = cp$a.e();
        object4.getClass();
        long l4 = cp_1.y(product);
        object5 = "dimension19";
        if (bl6) {
            cp$a.e().getClass();
            object3 = cp_1.t(product);
            object4 = (String)((Ga4Events)object2).getGav4DimensionMap().get(object5);
            string17 = "0 | non-deliverable | ";
            k01_0.a(string17, (String)object3, bundle3, (String)object4);
        } else {
            object3 = (String)((Ga4Events)object2).getGav4DimensionMap().get(object5);
            object5 = new StringBuilder();
            ((StringBuilder)object5).append(l4);
            ((StringBuilder)object5).append(" | deliverable");
            object4 = ((StringBuilder)object5).toString();
            bundle3.putString((String)object3, (String)object4);
        }
        boolean bl7 = false;
        object3 = null;
        if (object != null) {
            object4 = product.getAggregateRating();
        } else {
            n10 = 0;
            object4 = null;
        }
        if (object4 != null && (n10 = ((String)object4).length()) != 0) {
            object4 = ((Ga4Events)object2).getGav4DimensionMap();
            string17 = LD2.b;
            object4 = (String)object4.get(string17);
            if (object != null) {
                string17 = product.getAggregateRating();
            } else {
                bl4 = false;
                string17 = null;
            }
            bundle3.putString((String)object4, string17);
        }
        object4 = cp$a.e();
        if (object != null) {
            string17 = product.getSegmentId();
        } else {
            bl4 = false;
            string17 = null;
        }
        object5 = object != null ? product.getExperimentId() : null;
        object4.getClass();
        object4 = cp_1.A(string17, (String)object5);
        string17 = "dimension20";
        if (object4 != null) {
            object5 = (String)((Ga4Events)object2).getGav4DimensionMap().get(string17);
            bundle3.putString((String)object5, (String)object4);
            object4 = Unit.a;
        }
        object4 = Yj2.LIST;
        object5 = "dimension24";
        object6 = yj2;
        if (yj2 == object4) {
            object4 = (String)((Ga4Events)object2).getGav4DimensionMap().get(object5);
            object5 = "List";
            bundle3.putString((String)object4, (String)object5);
        } else {
            object4 = (String)((Ga4Events)object2).getGav4DimensionMap().get(object5);
            object5 = "Grid";
            bundle3.putString((String)object4, (String)object5);
        }
        object4 = (String)((Ga4Events)object2).getGav4DimensionMap().get("dimension16");
        object5 = cp$a.e();
        object5.getClass();
        double d2 = cp_1.x(product);
        bundle3.putDouble((String)object4, d2);
        object4 = this.getSegmentIds();
        if (object4 != null && (n10 = ((String)object4).length()) != 0) {
            object4 = (String)((Ga4Events)object2).getGav4DimensionMap().get("dimension192");
            object5 = cp$a.e();
            object5.getClass();
            d2 = cp_1.w(product);
            bundle3.putDouble((String)object4, d2);
        }
        if (bl3) {
            object4 = (String)((Ga4Events)object2).getGav4DimensionMap().get("dimension17");
            object5 = string10;
            bundle3.putString((String)object4, string10);
        }
        hv3_0.a.getClass();
        object4 = (String)hv3_0.H((Product)object, n8 != 0).b;
        object5 = (String)hv3_0.h((Product)object, n8 != 0).b;
        object6 = new StringBuilder();
        if (object4 != null) {
            n8 = ((String)object4).length();
            if (n8 <= 0) {
                n10 = 0;
                object4 = null;
            }
            if (object4 != null) {
                ((StringBuilder)object6).append((String)object4);
            }
        }
        if (string15 != null) {
            n10 = ((StringBuilder)object6).length();
            if (n10 > 0) {
                object4 = ",";
                ((StringBuilder)object6).append((String)object4);
            }
            ((StringBuilder)object6).append(string15);
        }
        object4 = ((StringBuilder)object6).toString();
        int n14 = TextUtils.isEmpty((CharSequence)object4);
        Object object7 = "dimension161";
        if (n14 == 0) {
            object6 = (String)((Ga4Events)object2).getGav4DimensionMap().get(object7);
            bundle3.putString((String)object6, (String)object4);
        }
        object4 = Unit.a;
        object4 = h40_0.a;
        n14 = h40_0.W0();
        if (n14 != 0 && (n14 = hv3_0.V(product)) != 0) {
            if (object != null) {
                object6 = product.getFnlColorVariantData();
            } else {
                n14 = 0;
                object6 = null;
            }
            object6 = hv3_0.A((ProductFnlColorVariantData)object6);
            bundle3.putString((String)object7, (String)object6);
        }
        n14 = h40_0.Q1();
        if ((object4 = ((h40_0)object4).g0()) != null) {
            if (object != null && (object7 = product.getFnlColorVariantData()) != null) {
                object7 = ((ProductFnlColorVariantData)object7).getDeliverySlaTag();
            } else {
                n8 = 0;
                object7 = null;
            }
            object4 = (String)object4.get(object7);
        } else {
            n10 = 0;
            object4 = null;
        }
        object7 = "dimension162";
        if (n14 != 0 && object4 != null && (n14 = ((String)object4).length()) != 0) {
            if (object5 != null && (n14 = ((String)object5).length()) > 0) {
                object6 = " , ";
                object4 = n1.a((String)object5, (String)object6, (String)object4);
            }
            object5 = (String)((Ga4Events)object2).getGav4DimensionMap().get(object7);
            bundle3.putString((String)object5, (String)object4);
        } else if (object5 != null) {
            n10 = ((String)object5).length();
            if (n10 <= 0) {
                object5 = null;
            }
            if (object5 != null) {
                object4 = (String)((Ga4Events)object2).getGav4DimensionMap().get(object7);
                bundle3.putString((String)object4, (String)object5);
            }
        }
        object4 = GAEcommerceEvents.INSTANCE;
        if (object == null || (object5 = product.getCatalogName()) == null) {
            object5 = object != null ? product.getCatalog() : null;
        }
        object5 = ((GAEcommerceEvents)object4).getStoreTypeFromCatalog((String)object5);
        if (object != null) {
            object6 = product.getProductListType();
        } else {
            n14 = 0;
            object6 = null;
        }
        n8 = (int)(h40_0.K1() ? 1 : 0);
        if (n8 != 0) {
            object7 = " | ";
            object5 = n1.a((String)object5, (String)object7, (String)object6);
        }
        object6 = ((Ga4Events)object2).getGav4DimensionMap();
        object7 = newEEcommerceEventsRevamp.DIMENSION148;
        object6 = (String)object6.get(object7);
        bundle3.putString((String)object6, (String)object5);
        object5 = cp$a.e();
        if (object != null) {
            object6 = product.getSegmentId();
        } else {
            n14 = 0;
            object6 = null;
        }
        if (object != null) {
            object7 = product.getExperimentId();
        } else {
            n8 = 0;
            object7 = null;
        }
        object5.getClass();
        object5 = cp_1.A((String)object6, (String)object7);
        if (object5 != null) {
            object2 = (String)((Ga4Events)object2).getGav4DimensionMap().get(string17);
            bundle3.putString((String)object2, (String)object5);
        }
        object2 = newEEcommerceEventsRevamp.PRODUCT_PRICE;
        double d5 = bundle3.getDouble((String)object2);
        double d7 = 0.0;
        object2 = string9 == null ? string14 : string9;
        object6 = "plp_source";
        parametersBuilder.param((String)object6, (String)object2);
        object2 = "value";
        parametersBuilder.param((String)object2, d5 += d7);
        object2 = string8 == null ? string14 : string8;
        parametersBuilder.param("plp_source_details", (String)object2);
        object2 = newEEcommerceEventsRevamp.ITEMS;
        parametersBuilder.param((String)object2, bundle3);
        object2 = this.getSegmentIds();
        Intrinsics.checkNotNullExpressionValue(object2, "<get-segmentIds>(...)");
        string17 = "pricing_cust_seg";
        parametersBuilder.param(string17, (String)object2);
        object2 = eb_2.a;
        if (bannerData != null && (object2 = bannerData.getDynamicPageMetadata()) != null) {
            object3 = ((DynamicPageMetadata)object2).getDuration();
        }
        if ((n7 = eb_2.d((Long)object3)) != 0) {
            if (bannerData == null || (object2 = bannerData.getDynamicPageMetadata()) == null || (object2 = ((DynamicPageMetadata)object2).getExtendedUrl()) == null || (object2 = ai0_2.h((String)object2)) == null) {
                object2 = string14;
            }
            object3 = "video_name";
            parametersBuilder.param((String)object3, (String)object2);
            object2 = "video_load_time";
            parametersBuilder.param((String)object2, l2);
        }
        object2 = newEEcommerceEventsRevamp.CONTAINS_STORE;
        object3 = od3_2.a();
        object3 = ((GAEcommerceEvents)object4).getStoreTypeFromCatalog((String)object3);
        parametersBuilder.param((String)object2, (String)object3);
        object2 = newEEcommerceEventsRevamp.CONTAINS_LUXE;
        boolean bl8 = ((GAEcommerceEvents)object4).containsLuxe((Product)object);
        object3 = String.valueOf(bl8);
        parametersBuilder.param((String)object2, (String)object3);
        if (bundle2 != null) {
            boolean bl9;
            boolean bl10;
            boolean bl11;
            boolean bl12;
            object2 = "product_id";
            boolean bl13 = bundle2.containsKey((String)object2);
            if (bl13) {
                object3 = bundle2.getString((String)object2);
                if (object3 == null) {
                    object3 = string14;
                }
                parametersBuilder.param((String)object2, (String)object3);
            }
            if (bl12 = bundle2.containsKey((String)(object2 = "product_name"))) {
                object3 = bundle2.getString((String)object2);
                if (object3 == null) {
                    object3 = string14;
                }
                parametersBuilder.param((String)object2, (String)object3);
            }
            if (bl11 = bundle2.containsKey((String)(object2 = "product_brand"))) {
                object3 = bundle2.getString((String)object2);
                if (object3 == null) {
                    object3 = string14;
                }
                parametersBuilder.param((String)object2, (String)object3);
            }
            if (bl10 = bundle2.containsKey((String)(object2 = "product_brick"))) {
                object3 = bundle2.getString((String)object2);
                if (object3 == null) {
                    object3 = string14;
                }
                parametersBuilder.param((String)object2, (String)object3);
            }
            if (bl9 = bundle2.containsKey((String)(object2 = "product_category"))) {
                object3 = bundle2.getString((String)object2);
                if (object3 == null) {
                    object3 = string14;
                }
                parametersBuilder.param((String)object2, (String)object3);
            }
            if ((n7 = h40_0.z1()) != 0) {
                object2 = "user_search_term";
                object3 = bundle2.getString((String)object2, string14);
                object4 = "search_term";
                string17 = bundle2.getString((String)object4, string14);
                object5 = "type_of_redirection";
                object6 = bundle2.getString((String)object5, string14);
                object = "redirection";
                string14 = bundle2.getString((String)object, string14);
                if (object3 != null && (n8 = ((String)object3).length()) != 0) {
                    parametersBuilder.param((String)object2, (String)object3);
                }
                if (string17 != null && (n7 = string17.length()) != 0) {
                    parametersBuilder.param((String)object4, string17);
                }
                if (object6 != null && (n7 = ((String)object6).length()) != 0) {
                    parametersBuilder.param((String)object5, (String)object6);
                    Intrinsics.checkNotNull(string14);
                    parametersBuilder.param((String)object, string14);
                }
            }
        }
        parametersBuilder.param("event_category", "Enhance E-commerce");
        object3 = newEEcommerceEventsRevamp.EE_SELECT_ITEM;
        parametersBuilder.param("event_action", (String)object3);
        object2 = parametersBuilder.getBundle();
        firebaseAnalytics.logEvent(string16, (Bundle)object2);
    }

    public static /* synthetic */ void pushEEProductSelectGAV4$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, Product product, int n3, String string2, String string3, String string4, boolean bl2, String string5, String string6, Boolean bl3, String string7, String string8, String string9, boolean bl4, String string10, BannerData bannerData, long l2, Yj2 yj2, String string11, Bundle bundle, String string12, String string13, int n4, Object object) {
        long l3;
        int n7 = n4;
        int n8 = n4 & 8;
        String string14 = "";
        String string15 = n8 != 0 ? string14 : string3;
        n8 = n7 & 0x20;
        boolean bl5 = n8 != 0 ? false : bl2;
        n8 = n7 & 0x100;
        Boolean bl6 = n8 != 0 ? null : bl3;
        n8 = n7 & 0x400;
        String string16 = n8 != 0 ? string14 : string8;
        n8 = n7 & 0x800;
        String string17 = n8 != 0 ? string14 : string9;
        n8 = n7 & 0x1000;
        boolean bl7 = n8 != 0 ? false : bl4;
        n8 = n7 & 0x2000;
        String string18 = n8 != 0 ? string14 : string10;
        n8 = n7 & 0x4000;
        BannerData bannerData2 = n8 != 0 ? null : bannerData;
        n8 = 0x8000 & n7;
        long l4 = n8 != 0 ? (l3 = 0L) : l2;
        n8 = 0x10000 & n7;
        Yj2 yj22 = n8 != 0 ? null : yj2;
        n8 = 0x20000 & n7;
        String string19 = n8 != 0 ? null : string11;
        n8 = 0x40000 & n7;
        Bundle bundle2 = n8 != 0 ? null : bundle;
        n8 = 524288;
        String string20 = (n7 &= n8) != 0 ? null : string12;
        newEEcommerceEventsRevamp.pushEEProductSelectGAV4(product, n3, string2, string15, string4, bl5, string5, string6, bl6, string7, string16, string17, bl7, string18, bannerData2, l4, yj22, string19, bundle2, string20, string13);
    }

    private static final Unit pushEEPurchaseAppsflyer$lambda$66(Ref$DoubleRef object, CartOrder object2, ArrayList arrayList, LuxeDetails luxeDetails, AppsFlyerEventsItem appsFlyerEventsItem) {
        Object object3;
        boolean bl2;
        float f5;
        String string2;
        double d2;
        AppsFlyerEvents appsFlyerEvents;
        block5: {
            block4: {
                boolean bl3;
                Intrinsics.checkNotNullParameter(object, "$transactionAmount");
                Intrinsics.checkNotNullParameter(arrayList, "$cartItems");
                String string3 = "$appsFlyerEventsItem";
                Intrinsics.checkNotNullParameter(appsFlyerEventsItem, string3);
                appsFlyerEvents = AppsFlyerEvents.INSTANCE;
                d2 = ((Ref$DoubleRef)object).element;
                string2 = ((CartOrder)object2).getCode();
                Intrinsics.checkNotNullExpressionValue(string2, "getCode(...)");
                cp_1.Companion.getClass();
                cp$a.e().getClass();
                Intrinsics.checkNotNullParameter(arrayList, "cartItems");
                object = arrayList.iterator();
                object2 = "iterator(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                do {
                    bl3 = object.hasNext();
                    arrayList = null;
                    if (!bl3) break block4;
                    object2 = (CartEntry)object.next();
                    if (object2 != null) {
                        object2 = ((CartEntry)object2).getSourceStoreId();
                        continue;
                    }
                    bl3 = false;
                    object2 = null;
                } while (!(bl3 = (string3 = "luxe").equalsIgnoreCase((String)object2)));
                f5 = Float.MIN_VALUE;
                bl2 = true;
                break block5;
            }
            f5 = 0.0f;
            object = null;
            bl2 = false;
        }
        if (luxeDetails != null && (object = luxeDetails.getTotalPrice()) != null) {
            f5 = ((Float)object).floatValue();
            double d5 = f5;
            object3 = object = Double.valueOf(d5);
        } else {
            object3 = null;
        }
        appsFlyerEvents.pushPurchaseEvent(d2, string2, bl2, (Double)object3, appsFlyerEventsItem);
        return Unit.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void pushEERefundGAV4(String string2, ArrayList object, String object2, String string3, String string4, String string5) {
        block8: {
            int n3;
            Object object3;
            int n4 = ((ArrayList)object).size();
            if (n4 <= 0) break block8;
            string2 = E1.a("transaction_id", string2);
            Object object4 = new ArrayList();
            object = ((ArrayList)object).iterator();
            Intrinsics.checkNotNullExpressionValue(object, "iterator(...)");
            String string6 = null;
            double d2 = 0.0;
            int n7 = 0;
            while (true) {
                Object object5;
                Object object6;
                int n8;
                block9: {
                    NumberFormatException numberFormatException2;
                    block7: {
                        float f5;
                        block6: {
                            n8 = object.hasNext();
                            f5 = 0.0f;
                            object3 = null;
                            if (n8 == 0) break;
                            object6 = object.next();
                            object5 = "next(...)";
                            Intrinsics.checkNotNullExpressionValue(object6, (String)object5);
                            object6 = (ReturnEntries)object6;
                            try {
                                object5 = ((ReturnEntries)object6).getReturnOrderEntry();
                                if (object5 == null || (object5 = object5.getBasePrice()) == null) break block6;
                                f5 = object5.getValue();
                                object3 = Float.valueOf(f5);
                            }
                            catch (NumberFormatException numberFormatException2) {
                                break block7;
                            }
                        }
                        if (object3 != null) {
                            object3 = ((ReturnEntries)object6).getReturnOrderEntry();
                            object3 = ((ReturnOrderEntry)object3).getBasePrice();
                            f5 = ((BasePrice)object3).getValue();
                            double d5 = f5;
                            d2 += d5;
                        }
                        break block9;
                    }
                    object5 = yn3_0.a;
                    object5.e(numberFormatException2);
                }
                object3 = new Bundle();
                object5 = ((ReturnEntries)object6).getProductCode().toString();
                object5 = this.trimProductId((String)object5);
                object3.putInt("index", n7);
                ++n7;
                String string7 = object5[0];
                boolean bl2 = TextUtils.isEmpty((CharSequence)string7);
                object5 = bl2 ? "" : object5[0];
                string7 = "item_id";
                object3.putString(string7, (String)object5);
                n8 = ((ReturnEntries)object6).getReturnedQty();
                long l2 = n8;
                object6 = "quantity";
                object3.putLong((String)object6, l2);
                ((ArrayList)object4).add(object3);
            }
            string2.putDouble("value", d2);
            string6 = "INR";
            string2.putString("currency", string6);
            string2.putParcelableArrayList("items", object4);
            object4 = this.getStoreType();
            string2.putString("store_type", (String)object4);
            object = this.Time_O_Day;
            object4 = rj_0.b();
            string2.putString((String)object, (String)object4);
            object = this.CLIENT_ID;
            object4 = this.getClientId();
            string2.putString((String)object, (String)object4);
            object = this.HYBRIS_ID;
            object4 = this.getHybrisId();
            string2.putString((String)object, (String)object4);
            object = this.NETWORK_TYPE;
            AJIOApplication.Companion.getClass();
            object4 = vV1.d((ContextWrapper)AJIOApplication$a.a());
            string2.putString((String)object, (String)object4);
            object = this.SCREEN_NAME;
            string2.putString((String)object, (String)object2);
            object = this.SCREENNAME;
            string2.putString((String)object, (String)object2);
            object = this.USER_STATUS;
            object2 = this.getUserStatus();
            string2.putString((String)object, (String)object2);
            object = this.LOGIN_STATUS;
            object2 = this.getLoggedINStatus();
            string2.putString((String)object, (String)object2);
            object = this.SCREEN_TYPE;
            string2.putString((String)object, string4);
            object = this.PREVIOUS_SCREEN;
            string2.putString((String)object, string3);
            object = this.PREVIOUS_SCREEN_TYPE;
            string2.putString((String)object, string5);
            object = this.IS_GA4;
            string2.putString((String)object, "true");
            object2 = "Enhance E-commerce";
            string2.putString("event_category", (String)object2);
            object = this.appPreferences.f();
            if (object != null) {
                object2 = StringsKt.m0((CharSequence)object);
                object3 = object2.toString();
            }
            if (object3 != null && (n3 = ((String)object3).length()) != 0) {
                object2 = "user_type";
                string2.putString((String)object2, (String)object);
            }
            object = AppsFlyerLib.getInstance();
            object2 = AJIOApplication$a.a();
            object = ((AppsFlyerLib)object).getAppsFlyerUID((Context)object2);
            string2.putString("af_id", (String)object);
            object2 = "refund";
            string2.putString("event_action", (String)object2);
            object = this.analytics;
            ((FirebaseAnalytics)object).logEvent((String)object2, (Bundle)string2);
        }
    }

    public static /* synthetic */ void pushEESelectPromotion$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, String string2, String string3, String string4, String string5, String string6, String string7, boolean bl2, boolean bl3, String string8, String string9, String string10, boolean bl4, int n3, Object object) {
        String string11;
        Object object2;
        int n4 = n3;
        int n7 = n3 & 1;
        if (n7 != 0) {
            object2 = newEEcommerceEventsRevamp.EE_SELECT_PROMOTION;
            string11 = object2;
        } else {
            string11 = string2;
        }
        int n8 = n4 & 2;
        String string12 = "";
        String string13 = n8 != 0 ? string12 : string3;
        n8 = n4 & 0x40;
        boolean bl5 = n8 != 0 ? false : bl2;
        n8 = n4 & 0x80;
        boolean bl6 = n8 != 0 ? false : bl3;
        n8 = n4 & 0x100;
        String string14 = n8 != 0 ? null : string8;
        n8 = n4 & 0x200;
        String string15 = n8 != 0 ? null : string9;
        n8 = n4 & 0x400;
        String string16 = n8 != 0 ? string12 : string10;
        boolean bl7 = (n4 &= 0x800) != 0 ? false : bl4;
        object2 = newEEcommerceEventsRevamp;
        string12 = string13;
        string13 = string4;
        newEEcommerceEventsRevamp.pushEESelectPromotion(string11, string12, string4, string5, string6, string7, bl5, bl6, string14, string15, string16, bl7);
    }

    private final void pushEESelectPromotionGAV4(String string2, String string3, String string4, String string5, String string6, boolean bl2, boolean bl3, String string7, String string8, String string9, boolean bl4) {
        CharSequence charSequence;
        String string10;
        boolean bl5;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = this;
        String string11 = string2;
        Object object = string3;
        Object object2 = string7;
        int n3 = TextUtils.isEmpty((CharSequence)string2);
        if (n3 != 0) {
            return;
        }
        String string12 = null;
        int n4 = 6;
        n3 = StringsKt.R(string2, "/", 0, n4);
        int n7 = 1;
        Object object3 = string2.substring(n3 += n7);
        Object object4 = "substring(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        if (bl3) {
            int n8;
            string11 = "|";
            n3 = 0;
            object3 = null;
            if (string7 != null) {
                object4 = new String[]{string11};
                object2 = StringsKt.a0(string7, object4, false, 0, n4);
            } else {
                bl5 = false;
                object2 = null;
            }
            object4 = "JioAds - ";
            int n10 = 3;
            if (object2 != null && (n8 = object2.size()) == n4) {
                object3 = (String)object2.get(0);
                string12 = (String)object2.get(n7);
                string10 = object2.get(2);
                charSequence = object2.get(n10);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)string10);
                stringBuilder.append(string11);
                stringBuilder.append((Object)charSequence);
                string11 = stringBuilder.toString();
                n4 = 4;
                string10 = (String)object2.get(n4);
                object2 = (String)object2.get(5);
                charSequence = "EXTERNAL_AD";
                n7 = (int)(Intrinsics.areEqual(object2, charSequence) ? 1 : 0);
                object2 = n7 != 0 ? kp1_0.c("TPBA - ", string10) : ((bl5 = Intrinsics.areEqual(object2, charSequence = "AD")) ? kp1_0.c((String)object4, string10) : string10);
                string10 = string11;
            } else {
                string11 = object2 != null ? (String)object2.get(0) : null;
                string12 = object2 != null ? (String)object2.get(n7) : null;
                if (object2 != null) {
                    string10 = (String)object2.get(n7);
                } else {
                    n4 = 0;
                    string10 = null;
                }
                if (object2 != null) {
                    object3 = object2 = object2.get(n10);
                    object3 = (String)object2;
                }
                object2 = new StringBuilder((String)object4);
                ((StringBuilder)object2).append((String)object3);
                object2 = ((StringBuilder)object2).toString();
                n3 = 100;
                object2 = le3_2.E(n3, (String)object2);
                object3 = string11;
            }
        } else {
            object2 = this.getPromotionId(string2, n7 != 0);
            string12 = this.getCreativeName(string2, n7 != 0);
            string10 = string9;
            String string13 = object3;
            object3 = object2;
            object2 = string13;
        }
        string11 = new Bundle();
        object3 = String.valueOf(object3);
        charSequence = "promotion_id";
        string11.putString((String)charSequence, (String)object3);
        object3 = "promotion_name";
        if (bl4) {
            object4 = "priority-";
            charSequence = new StringBuilder((String)object4);
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append("}");
            object2 = ((StringBuilder)charSequence).toString();
            string11.putString((String)object3, (String)object2);
        } else {
            string11.putString((String)object3, (String)object2);
        }
        string11.putString("creative_name", string12);
        string11.putString("creative_slot", string10);
        object2 = new ArrayList();
        ((ArrayList)object2).add(string11);
        string11 = new Bundle();
        object3 = newEEcommerceEventsRevamp.ITEMS;
        string11.putParcelableArrayList((String)object3, (ArrayList)object2);
        object3 = this.getStoreType();
        string11.putString("store_type", (String)object3);
        object2 = newEEcommerceEventsRevamp.Time_O_Day;
        object3 = rj_0.b();
        string11.putString((String)object2, (String)object3);
        object2 = newEEcommerceEventsRevamp.CLIENT_ID;
        object3 = this.getClientId();
        string11.putString((String)object2, (String)object3);
        object2 = newEEcommerceEventsRevamp.HYBRIS_ID;
        object3 = this.getHybrisId();
        string11.putString((String)object2, (String)object3);
        object2 = newEEcommerceEventsRevamp.NETWORK_TYPE;
        AJIOApplication.Companion.getClass();
        object3 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        string11.putString((String)object2, (String)object3);
        object2 = newEEcommerceEventsRevamp.SCREEN_NAME;
        string11.putString((String)object2, string3);
        object2 = newEEcommerceEventsRevamp.SCREENNAME;
        string11.putString((String)object2, string3);
        object = newEEcommerceEventsRevamp.USER_STATUS;
        object2 = this.getUserStatus();
        string11.putString((String)object, (String)object2);
        object = newEEcommerceEventsRevamp.LOGIN_STATUS;
        object2 = this.getLoggedINStatus();
        string11.putString((String)object, (String)object2);
        object = SharedUtils.INSTANCE.getLoggedINStatus();
        int n14 = ((String)object).length();
        if (n14 > 0) {
            object = "login_type";
            object2 = this.getLoggedINStatus();
            string11.putString((String)object, (String)object2);
        }
        if (bl5 = TextUtils.isEmpty((CharSequence)(object = this.getUserInformation().getEncryptedUuid()))) {
            object = "N/A";
        } else {
            cp_1.Companion.getClass();
            object2 = cp$a.e();
            object2.getClass();
            object = cp_1.L((String)object);
        }
        string11.putString("userId", (String)object);
        object = newEEcommerceEventsRevamp.SCREEN_TYPE;
        object2 = string5;
        string11.putString((String)object, string5);
        object = newEEcommerceEventsRevamp.PREVIOUS_SCREEN;
        object2 = string4;
        string11.putString((String)object, string4);
        object = newEEcommerceEventsRevamp.PREVIOUS_SCREEN_TYPE;
        object2 = string6;
        string11.putString((String)object, string6);
        object = newEEcommerceEventsRevamp.PAGE_TYPE;
        object2 = yx0_0.a;
        if (object2 == null) {
            object2 = "";
        }
        string11.putString((String)object, (String)object2);
        object = newEEcommerceEventsRevamp.SERVED_FROM_CMS;
        object2 = String.valueOf(bl2);
        string11.putString((String)object, (String)object2);
        if (bl3) {
            object = "plp_page_title";
            object2 = string8;
            string11.putString((String)object, string8);
        }
        object = newEEcommerceEventsRevamp.CONTAINS_STORE;
        object2 = this.getStoreType();
        string11.putString((String)object, (String)object2);
        object = newEEcommerceEventsRevamp.IS_GA4;
        string11.putString((String)object, "true");
        string11.putString("event_category", "Enhance E-commerce");
        object2 = newEEcommerceEventsRevamp.EE_SELECT_PROMOTION;
        string11.putString("event_action", (String)object2);
        object = newEEcommerceEventsRevamp.analytics;
        object2 = newEEcommerceEventsRevamp.EE_SELECT_PROMOTION;
        ((FirebaseAnalytics)object).logEvent((String)object2, (Bundle)string11);
    }

    public static /* synthetic */ void pushEESelectPromotionGAV4$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, String string2, String string3, String string4, String string5, String string6, boolean bl2, boolean bl3, String string7, String string8, String string9, boolean bl4, int n3, Object object) {
        int n4 = n3;
        int n7 = n3 & 1;
        String string10 = "";
        String string11 = n7 != 0 ? string10 : string2;
        n7 = n4 & 0x20;
        boolean bl5 = n7 != 0 ? false : bl2;
        n7 = n4 & 0x40;
        boolean bl6 = n7 != 0 ? false : bl3;
        n7 = n4 & 0x80;
        String string12 = n7 != 0 ? null : string7;
        n7 = n4 & 0x100;
        String string13 = n7 != 0 ? null : string8;
        n7 = n4 & 0x200;
        String string14 = n7 != 0 ? string10 : string9;
        boolean bl7 = (n4 &= 0x400) != 0 ? false : bl4;
        newEEcommerceEventsRevamp.pushEESelectPromotionGAV4(string11, string3, string4, string5, string6, bl5, bl6, string12, string13, string14, bl7);
    }

    private final void pushSelectContentEventForFleekGAV4(String object, String string2, String string3, String object2, String string4, String string5) {
        int n3;
        ArrayList<String> arrayList = new ArrayList<String>();
        String string6 = "promotion_id";
        String string7 = "promotion_name";
        string3 = px1_2.b(string6, string3, string7, (String)object2);
        string3.putString("creative_name", string4);
        string3.putString("creative_slot", string5);
        arrayList.add(string3);
        string3 = new Bundle();
        object2 = this.ITEMS;
        string3.putParcelableArrayList((String)object2, arrayList);
        object2 = this.getStoreType();
        string4 = "store_type";
        string3.putString(string4, (String)object2);
        string5 = this.getStoreType();
        string3.putString("contains_store", string5);
        object2 = this.Time_O_Day;
        string5 = rj_0.b();
        string3.putString((String)object2, string5);
        object2 = this.CLIENT_ID;
        string5 = this.getClientId();
        string3.putString((String)object2, string5);
        object2 = this.HYBRIS_ID;
        string5 = this.getHybrisId();
        string3.putString((String)object2, string5);
        object2 = this.NETWORK_TYPE;
        AJIOApplication.Companion.getClass();
        string5 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        string3.putString((String)object2, string5);
        object2 = this.SCREEN_NAME;
        string3.putString((String)object2, (String)object);
        object2 = this.SCREENNAME;
        string3.putString((String)object2, (String)object);
        object2 = this.USER_STATUS;
        string5 = this.getUserStatus();
        string3.putString((String)object2, string5);
        object2 = this.LOGIN_STATUS;
        string5 = this.getLoggedINStatus();
        string3.putString((String)object2, string5);
        object2 = this.SCREEN_TYPE;
        string3.putString((String)object2, (String)object);
        object2 = this.PREVIOUS_SCREEN;
        string3.putString((String)object2, string2);
        object2 = this.PREVIOUS_SCREEN_TYPE;
        string3.putString((String)object2, string2);
        string2 = this.IS_GA4;
        string3.putString(string2, "true");
        object2 = this.getLoggedINStatus();
        string3.putString("LoggedInStatus", (String)object2);
        string2 = this.getUserInformation().getEncryptedUuid();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            string2 = "N/A";
        } else {
            cp_1.Companion.getClass();
            object2 = cp$a.e();
            object2.getClass();
            string2 = cp_1.L(string2);
        }
        object2 = "userId";
        string3.putString((String)object2, string2);
        string3.putString("screenname", (String)object);
        string2 = this.getClientId();
        string3.putString("Client_ID", string2);
        string2 = this.getHybrisId();
        string3.putString("hybris_id", string2);
        object = this.appPreferences.f();
        if (object != null) {
            string2 = ((Object)StringsKt.m0((CharSequence)object)).toString();
        } else {
            n3 = 0;
            string2 = null;
        }
        if (string2 != null && (n3 = string2.length()) != 0) {
            string2 = "user_type";
            string3.putString(string2, (String)object);
        }
        string2 = this.getUserStatus();
        string3.putString("user_status", string2);
        object = rj_0.b();
        string3.putString("Time_of_the_day", (String)object);
        object = this.getStoreType();
        string3.putString(string4, (String)object);
        object = this.PAGE_TYPE;
        string2 = yx0_0.a;
        string3.putString((String)object, string2);
        string3.putString("event_category", "Enhance E-commerce");
        string2 = this.EE_SELECT_PROMOTION;
        string3.putString("event_action", string2);
        object = this.analytics;
        string2 = this.EE_SELECT_PROMOTION;
        ((FirebaseAnalytics)object).logEvent(string2, (Bundle)string3);
    }

    private final void pushSelectContentEventForFleekIngressGAV4(String object, String string2, String string3, String object2, String string4, String string5, boolean bl2) {
        int n3;
        ArrayList<String> arrayList = new ArrayList<String>();
        String string6 = "promotion_id";
        String string7 = "promotion_name";
        string3 = px1_2.b(string6, string3, string7, (String)object2);
        string3.putString("creative_name", string4);
        string3.putString("creative_slot", string5);
        arrayList.add(string3);
        string3 = new Bundle();
        object2 = this.ITEMS;
        string3.putParcelableArrayList((String)object2, arrayList);
        object2 = this.getStoreType();
        string4 = "store_type";
        string3.putString(string4, (String)object2);
        string5 = this.getStoreType();
        string3.putString("contains_store", string5);
        object2 = this.Time_O_Day;
        string5 = rj_0.b();
        string3.putString((String)object2, string5);
        object2 = this.CLIENT_ID;
        string5 = this.getClientId();
        string3.putString((String)object2, string5);
        object2 = this.HYBRIS_ID;
        string5 = this.getHybrisId();
        string3.putString((String)object2, string5);
        object2 = this.NETWORK_TYPE;
        AJIOApplication.Companion.getClass();
        string5 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        string3.putString((String)object2, string5);
        object2 = this.SCREEN_NAME;
        string3.putString((String)object2, (String)object);
        object2 = this.SCREENNAME;
        string3.putString((String)object2, (String)object);
        object2 = this.USER_STATUS;
        string5 = this.getUserStatus();
        string3.putString((String)object2, string5);
        object2 = this.LOGIN_STATUS;
        string5 = this.getLoggedINStatus();
        string3.putString((String)object2, string5);
        object2 = this.SCREEN_TYPE;
        string3.putString((String)object2, (String)object);
        object2 = this.PREVIOUS_SCREEN;
        string3.putString((String)object2, string2);
        object2 = this.PREVIOUS_SCREEN_TYPE;
        string3.putString((String)object2, string2);
        string2 = this.IS_GA4;
        string3.putString(string2, "true");
        object2 = this.getLoggedINStatus();
        string3.putString("LoggedInStatus", (String)object2);
        string2 = this.getUserInformation().getEncryptedUuid();
        boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
        if (bl3) {
            string2 = "N/A";
        } else {
            cp_1.Companion.getClass();
            object2 = cp$a.e();
            object2.getClass();
            string2 = cp_1.L(string2);
        }
        object2 = "userId";
        string3.putString((String)object2, string2);
        string3.putString("screenname", (String)object);
        string2 = this.getClientId();
        string3.putString("Client_ID", string2);
        string2 = this.getHybrisId();
        string3.putString("hybris_id", string2);
        object = this.appPreferences.f();
        if (object != null) {
            string2 = ((Object)StringsKt.m0((CharSequence)object)).toString();
        } else {
            n3 = 0;
            string2 = null;
        }
        if (string2 != null && (n3 = string2.length()) != 0) {
            string2 = "user_type";
            string3.putString(string2, (String)object);
        }
        string2 = this.getUserStatus();
        string3.putString("user_status", string2);
        object = rj_0.b();
        string3.putString("Time_of_the_day", (String)object);
        object = this.getStoreType();
        string3.putString(string4, (String)object);
        object = yx0_0.a;
        string3.putString("page_type", (String)object);
        string2 = "Enhance E-commerce";
        string3.putString("event_category", string2);
        object = "event_action";
        if (bl2) {
            string2 = this.EE_SELECT_PROMOTION;
            string3.putString((String)object, string2);
            object = this.analytics;
            string2 = this.EE_SELECT_PROMOTION;
            ((FirebaseAnalytics)object).logEvent(string2, (Bundle)string3);
        } else {
            string2 = this.EE_VIEW_PROMOTION;
            string3.putString((String)object, string2);
            object = this.analytics;
            string2 = this.EE_VIEW_PROMOTION;
            ((FirebaseAnalytics)object).logEvent(string2, (Bundle)string3);
        }
    }

    private final void pushSelectContentEventForThirdPartyBannerGAV4(String object, String string2, String string3, String object2, String string4, String string5) {
        int n3;
        ArrayList<String> arrayList = new ArrayList<String>();
        String string6 = "promotion_id";
        String string7 = "promotion_name";
        string3 = px1_2.b(string6, string3, string7, (String)object2);
        string3.putString("creative_name", string4);
        string3.putString("creative_slot", string5);
        arrayList.add(string3);
        string3 = new Bundle();
        object2 = this.ITEMS;
        string3.putParcelableArrayList((String)object2, arrayList);
        object2 = this.getStoreType();
        string4 = "store_type";
        string3.putString(string4, (String)object2);
        string5 = this.getStoreType();
        string3.putString("contains_store", string5);
        object2 = this.Time_O_Day;
        string5 = rj_0.b();
        string3.putString((String)object2, string5);
        object2 = this.CLIENT_ID;
        string5 = this.getClientId();
        string3.putString((String)object2, string5);
        object2 = this.HYBRIS_ID;
        string5 = this.getHybrisId();
        string3.putString((String)object2, string5);
        object2 = this.NETWORK_TYPE;
        AJIOApplication.Companion.getClass();
        string5 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        string3.putString((String)object2, string5);
        object2 = this.SCREEN_NAME;
        string3.putString((String)object2, (String)object);
        object2 = this.SCREENNAME;
        string3.putString((String)object2, (String)object);
        object2 = this.USER_STATUS;
        string5 = this.getUserStatus();
        string3.putString((String)object2, string5);
        object2 = this.LOGIN_STATUS;
        string5 = this.getLoggedINStatus();
        string3.putString((String)object2, string5);
        object2 = this.SCREEN_TYPE;
        string3.putString((String)object2, (String)object);
        object2 = this.PREVIOUS_SCREEN;
        string3.putString((String)object2, string2);
        object2 = this.PREVIOUS_SCREEN_TYPE;
        string3.putString((String)object2, string2);
        string2 = this.IS_GA4;
        string3.putString(string2, "true");
        object2 = this.getLoggedINStatus();
        string3.putString("LoggedInStatus", (String)object2);
        string2 = this.getUserInformation().getEncryptedUuid();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            string2 = "N/A";
        } else {
            cp_1.Companion.getClass();
            object2 = cp$a.e();
            object2.getClass();
            string2 = cp_1.L(string2);
        }
        object2 = "userId";
        string3.putString((String)object2, string2);
        string3.putString("screenname", (String)object);
        string2 = this.getClientId();
        string3.putString("Client_ID", string2);
        string2 = this.getHybrisId();
        string3.putString("hybris_id", string2);
        object = this.appPreferences.f();
        if (object != null) {
            string2 = ((Object)StringsKt.m0((CharSequence)object)).toString();
        } else {
            n3 = 0;
            string2 = null;
        }
        if (string2 != null && (n3 = string2.length()) != 0) {
            string2 = "user_type";
            string3.putString(string2, (String)object);
        }
        string2 = this.getUserStatus();
        string3.putString("user_status", string2);
        object = rj_0.b();
        string3.putString("Time_of_the_day", (String)object);
        object = this.getStoreType();
        string3.putString(string4, (String)object);
        object = this.PAGE_TYPE;
        string2 = yx0_0.a;
        string3.putString((String)object, string2);
        string3.putString("event_category", "Enhance E-commerce");
        string2 = this.EE_SELECT_PROMOTION;
        string3.putString("event_action", string2);
        object = this.analytics;
        string2 = this.EE_SELECT_PROMOTION;
        ((FirebaseAnalytics)object).logEvent(string2, (Bundle)string3);
    }

    public static /* synthetic */ void pushSelectContentProductImpressionForFleek$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, String string2, String string3, String string4, String string5, String string6, Product product, boolean bl2, int n3, Object object) {
        boolean bl3;
        int n4 = n3 & 0x40;
        if (n4 != 0) {
            n4 = 0;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        newEEcommerceEventsRevamp.pushSelectContentProductImpressionForFleek(string2, string3, string4, string5, string6, product, bl3);
    }

    private final void pushSelectContentProductImpressionForFleekGAV4(String object, String object2, String string2, String string3, String object3, Product object4, boolean bl2) {
        String string4;
        int n3;
        Boolean bl3 = Boolean.FALSE;
        Object object5 = null;
        boolean bl4 = true;
        Object object6 = "";
        Object object7 = this;
        Object object8 = object4;
        object3 = this.makeItemBundle((Product)object4, (String)object6, false, bl4, bl3, (String)object3);
        Object object9 = new Bundle((Bundle)object3);
        object3 = Ga4Events.INSTANCE;
        object7 = (String)((Ga4Events)object3).getGav4DimensionMap().get("dimension166");
        object8 = "";
        if (object4 == null || (object6 = ((Product)object4).getAdsData()) == null || (object6 = ((AdsData)object6).getConfig()) == null || (object6 = ((Config)object6).getC()) == null) {
            object6 = object8;
        }
        object9.putString((String)object7, (String)object6);
        object7 = (String)((Ga4Events)object3).getGav4DimensionMap().get("dimension167");
        object6 = el1_2.a;
        boolean bl5 = el1_2.i((Product)object4);
        object6 = bl5 ? "yes" : "no";
        object9.putString((String)object7, (String)object6);
        object7 = ((Ga4Events)object3).getGav4DimensionMap();
        object6 = "dimension168";
        object7 = (String)object7.get(object6);
        if (object4 != null && (object6 = ((Product)object4).getFnlColorVariantData()) != null && (object6 = ((ProductFnlColorVariantData)object6).getColorGroup()) != null) {
            object8 = object6;
        }
        object9.putString((String)object7, (String)object8);
        cp_1.Companion.getClass();
        object7 = cp$a.e();
        object7.getClass();
        boolean bl6 = cp_1.F((Product)object4);
        object8 = cp$a.e();
        object8.getClass();
        long l2 = cp_1.y((Product)object4);
        object5 = "dimension19";
        if (bl6) {
            cp$a.e().getClass();
            object7 = cp_1.t((Product)object4);
            object8 = (String)((Ga4Events)object3).getGav4DimensionMap().get(object5);
            object6 = "0 | non-deliverable | ";
            k01_0.a((String)object6, (String)object7, object9, (String)object8);
        } else {
            object7 = (String)((Ga4Events)object3).getGav4DimensionMap().get(object5);
            object5 = new StringBuilder();
            ((StringBuilder)object5).append(l2);
            ((StringBuilder)object5).append(" | deliverable");
            object8 = ((StringBuilder)object5).toString();
            object9.putString((String)object7, (String)object8);
        }
        bl6 = false;
        object7 = null;
        if (object4 != null) {
            object8 = ((Product)object4).getAggregateRating();
        } else {
            n3 = 0;
            object8 = null;
        }
        if (object8 != null && (n3 = ((String)object8).length()) != 0) {
            object8 = ((Ga4Events)object3).getGav4DimensionMap();
            object6 = LD2.b;
            object8 = (String)object8.get(object6);
            if (object4 != null) {
                object6 = ((Product)object4).getAggregateRating();
            } else {
                bl5 = false;
                object6 = null;
            }
            object9.putString((String)object8, (String)object6);
        }
        object8 = cp$a.e();
        if (object4 != null) {
            object6 = ((Product)object4).getSegmentId();
        } else {
            bl5 = false;
            object6 = null;
        }
        object5 = object4 != null ? ((Product)object4).getExperimentId() : null;
        object8.getClass();
        object8 = cp_1.A((String)object6, (String)object5);
        object6 = "dimension20";
        if (object8 != null) {
            object5 = (String)((Ga4Events)object3).getGav4DimensionMap().get(object6);
            object9.putString((String)object5, (String)object8);
        }
        object8 = (String)((Ga4Events)object3).getGav4DimensionMap().get("dimension24");
        object9.putString((String)object8, "Grid");
        object8 = (String)((Ga4Events)object3).getGav4DimensionMap().get("dimension16");
        object5 = cp$a.e();
        object5.getClass();
        double d2 = cp_1.x((Product)object4);
        object9.putDouble((String)object8, d2);
        object8 = this.getSegmentIds();
        if (object8 != null && (n3 = ((String)object8).length()) != 0) {
            object8 = (String)((Ga4Events)object3).getGav4DimensionMap().get("dimension192");
            object5 = cp$a.e();
            object5.getClass();
            d2 = cp_1.w((Product)object4);
            object9.putDouble((String)object8, d2);
        }
        object8 = ((Ga4Events)object3).getGav4DimensionMap();
        object5 = this.DIMENSION148;
        object8 = (String)object8.get(object5);
        object5 = GAEcommerceEvents.INSTANCE;
        if (object4 == null || (string4 = ((Product)object4).getCatalogName()) == null) {
            if (object4 != null) {
                string4 = ((Product)object4).getCatalog();
            } else {
                bl4 = false;
                string4 = null;
            }
        }
        object5 = ((GAEcommerceEvents)object5).getStoreTypeFromCatalog(string4);
        object9.putString((String)object8, (String)object5);
        object8 = cp$a.e();
        object5 = object4 != null ? ((Product)object4).getSegmentId() : null;
        object4 = object4 != null ? ((Product)object4).getExperimentId() : null;
        object8.getClass();
        object4 = cp_1.A((String)object5, (String)object4);
        if (object4 != null) {
            object3 = (String)((Ga4Events)object3).getGav4DimensionMap().get(object6);
            object9.putString((String)object3, (String)object4);
        }
        object3 = this.PRODUCT_PRICE;
        double d5 = object9.getDouble((String)object3);
        l2 = 0L;
        double d7 = 0.0;
        d5 += d7;
        object8 = new ArrayList();
        object9.putString(string2, string3);
        ((ArrayList)object8).add(object9);
        string2 = new Bundle();
        string3 = this.ITEMS;
        string2.putParcelableArrayList(string3, object8);
        string3 = this.getStoreType();
        object9 = "store_type";
        string2.putString((String)object9, string3);
        object8 = this.getStoreType();
        string2.putString("contains_store", (String)object8);
        string3 = this.Time_O_Day;
        object8 = rj_0.b();
        string2.putString(string3, (String)object8);
        string3 = this.CLIENT_ID;
        object8 = this.getClientId();
        string2.putString(string3, (String)object8);
        string3 = this.HYBRIS_ID;
        object8 = this.getHybrisId();
        string2.putString(string3, (String)object8);
        string3 = this.NETWORK_TYPE;
        AJIOApplication.Companion.getClass();
        object8 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        string2.putString(string3, (String)object8);
        string3 = this.SCREEN_NAME;
        string2.putString(string3, (String)object);
        string3 = this.SCREENNAME;
        string2.putString(string3, (String)object);
        string3 = this.USER_STATUS;
        object8 = this.getUserStatus();
        string2.putString(string3, (String)object8);
        string3 = this.LOGIN_STATUS;
        object8 = this.getLoggedINStatus();
        string2.putString(string3, (String)object8);
        string3 = this.SCREEN_TYPE;
        string2.putString(string3, (String)object);
        object = this.PREVIOUS_SCREEN;
        string2.putString((String)object, (String)object2);
        object = this.PREVIOUS_SCREEN_TYPE;
        string2.putString((String)object, (String)object2);
        object = this.IS_GA4;
        string2.putString((String)object, "true");
        string2.putDouble("value", d5);
        object2 = this.getLoggedINStatus();
        string2.putString("LoggedInStatus", (String)object2);
        object = this.getUserInformation().getEncryptedUuid();
        int n4 = TextUtils.isEmpty((CharSequence)object);
        if (n4 != 0) {
            object = "N/A";
        } else {
            object2 = cp$a.e();
            object2.getClass();
            object = cp_1.L((String)object);
        }
        string2.putString("userId", (String)object);
        object = AnalyticsManager.Companion.getInstance().getGtmEvents().getScreenName();
        string2.putString("screenname", (String)object);
        object2 = this.getClientId();
        string2.putString("Client_ID", (String)object2);
        object2 = this.getHybrisId();
        string2.putString("hybris_id", (String)object2);
        object = this.appPreferences.f();
        if (object != null) {
            object2 = StringsKt.m0((CharSequence)object);
            object7 = object2.toString();
        }
        if (object7 != null && (n4 = ((String)object7).length()) != 0) {
            object2 = "user_type";
            string2.putString((String)object2, (String)object);
        }
        object2 = this.getUserStatus();
        string2.putString("user_status", (String)object2);
        object = rj_0.b();
        string2.putString("Time_of_the_day", (String)object);
        object = this.getStoreType();
        string2.putString((String)object9, (String)object);
        object = this.PAGE_TYPE;
        object2 = yx0_0.a;
        string2.putString((String)object, (String)object2);
        object2 = "Enhance E-commerce";
        string2.putString("event_category", (String)object2);
        object = "event_action";
        if (bl2) {
            object2 = this.EE_SELECT_ITEM;
            string2.putString((String)object, (String)object2);
            object = this.analytics;
            object2 = this.EE_SELECT_ITEM;
            ((FirebaseAnalytics)object).logEvent((String)object2, (Bundle)string2);
        } else {
            object2 = this.EE_SELECT_PROMOTION;
            string2.putString((String)object, (String)object2);
            object = this.analytics;
            object2 = this.EE_SELECT_PROMOTION;
            ((FirebaseAnalytics)object).logEvent((String)object2, (Bundle)string2);
        }
    }

    public static /* synthetic */ void pushSelectContentProductImpressionForFleekGAV4$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, String string2, String string3, String string4, String string5, String string6, Product product, boolean bl2, int n3, Object object) {
        boolean bl3;
        int n4 = n3 & 0x40;
        if (n4 != 0) {
            n4 = 0;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        newEEcommerceEventsRevamp.pushSelectContentProductImpressionForFleekGAV4(string2, string3, string4, string5, string6, product, bl3);
    }

    private static final String segmentIds_delegate$lambda$1() {
        AJIOApplication.Companion.getClass();
        return UserInformation.getInstance((Context)AJIOApplication$a.a()).getUserSegementIds();
    }

    public static /* synthetic */ void setPreviosScreen$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        String string4 = "";
        if (n4 != 0) {
            string2 = string4;
        }
        if ((n3 &= 2) != 0) {
            string3 = string4;
        }
        newEEcommerceEventsRevamp.setPreviosScreen(string2, string3);
    }

    public static /* synthetic */ void setPreviousScreenData$default(NewEEcommerceEventsRevamp newEEcommerceEventsRevamp, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        String string4 = "";
        if (n4 != 0) {
            string2 = string4;
        }
        if ((n3 &= 2) != 0) {
            string3 = string4;
        }
        newEEcommerceEventsRevamp.setPreviousScreenData(string2, string3);
    }

    private static final UserInformation userInformation_delegate$lambda$0() {
        return VX0.a(AJIOApplication.Companion);
    }

    public final void addCohortLInkData(Bundle bundle, String string2) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(string2, "current_exp");
        String string3 = this.getUserInformation().getCohortLinkData();
        int n3 = h40_0.a.V0();
        if (n3 != 0) {
            Intrinsics.checkNotNull(string3);
            n3 = string3.length();
            String string4 = "link_param";
            if (n3 > 0) {
                bundle.putString(string4, string3);
            } else {
                string3 = "no parameter";
                bundle.putString(string4, string3);
            }
            int n4 = string2.length();
            if (n4 > 0) {
                string3 = "current_experience";
                bundle.putString(string3, string2);
            }
        }
    }

    public final String getAF_ID() {
        return this.AF_ID;
    }

    public final String getBAG_DISCOUNT() {
        return this.BAG_DISCOUNT;
    }

    public final String getCLIENT_ID() {
        return this.CLIENT_ID;
    }

    public final String getCOUPON_DISCOUNT() {
        return this.COUPON_DISCOUNT;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String getCreativeName(String stringArray, boolean bl2) {
        Exception exception2;
        String string2;
        block5: {
            String string3 = "-";
            Intrinsics.checkNotNullParameter(stringArray, "name");
            string2 = "";
            if (bl2) {
                try {
                    this.getPromotionName((String)stringArray);
                }
                catch (Exception exception2) {
                    break block5;
                }
            }
            String[] stringArray2 = new String[]{string2, string2};
            boolean bl3 = TextUtils.isEmpty((CharSequence)stringArray);
            if (bl3) {
                return stringArray2[0];
            }
            bl3 = StringsKt.F((CharSequence)stringArray, string3, false);
            if (bl3) {
                stringArray2 = new String[]{string3};
                int n3 = 6;
                stringArray = StringsKt.a0((CharSequence)stringArray, stringArray2, false, 0, n3);
                stringArray = (Collection)stringArray;
                stringArray2 = new String[]{};
                stringArray = stringArray.toArray(stringArray2);
                stringArray2 = stringArray;
                stringArray2 = stringArray;
            }
            int n4 = stringArray2.length + -1;
            return stringArray2[n4];
        }
        yn3_0.a.e(exception2);
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String getCreativeSlot(String object, boolean bl2) {
        Exception exception2;
        String string2;
        block8: {
            int n3;
            String string3 = "-";
            Intrinsics.checkNotNullParameter(object, "name");
            string2 = "";
            if (bl2) {
                try {
                    this.getPromotionName((String)object);
                }
                catch (Exception exception2) {
                    break block8;
                }
            }
            String[] stringArray = new String[]{string2, string2};
            boolean bl3 = TextUtils.isEmpty((CharSequence)object);
            if (bl3) {
                return stringArray[0];
            }
            bl3 = StringsKt.F((CharSequence)object, string3, false);
            if (bl3) {
                stringArray = new String[]{string3};
                n3 = 6;
                object = StringsKt.a0((CharSequence)object, stringArray, false, 0, n3);
                object = (Collection)object;
                stringArray = new String[]{};
                object = object.toArray(stringArray);
                stringArray = object;
                stringArray = object;
            }
            int n4 = stringArray.length + -2;
            object = stringArray[n4];
            string3 = "category";
            bl3 = true;
            if ((n4 = (int)(StringsKt.F((CharSequence)object, string3, bl3) ? 1 : 0)) == 0) {
                n4 = stringArray.length + -2;
                object = stringArray[n4];
                string3 = "banner";
                if ((n4 = (int)(StringsKt.F((CharSequence)object, string3, bl3) ? 1 : 0)) == 0) {
                    n4 = stringArray.length;
                    n3 = 3;
                    if (n4 <= n3) return string2;
                    n4 = stringArray.length - n3;
                    return stringArray[n4];
                }
            }
            n4 = stringArray.length + -2;
            return stringArray[n4];
        }
        yn3_0.a.e(exception2);
        return string2;
    }

    public final String getCurrentScreen() {
        return this.currentScreen;
    }

    public final String getCurrentScreenType() {
        return this.currentScreenType;
    }

    public final String getDIMENSION11() {
        return this.DIMENSION11;
    }

    public final String getDIMENSION148() {
        return this.DIMENSION148;
    }

    public final String getEE_ADD_PAYMENT_INFO() {
        return this.EE_ADD_PAYMENT_INFO;
    }

    public final String getEE_ADD_SHIPPING_INFO() {
        return this.EE_ADD_SHIPPING_INFO;
    }

    public final String getEE_ADD_TO_CART() {
        return this.EE_ADD_TO_CART;
    }

    public final String getEE_ADD_TO_WISHLIST() {
        return this.EE_ADD_TO_WISHLIST;
    }

    public final String getEE_BEGIN_CHECKOUT() {
        return this.EE_BEGIN_CHECKOUT;
    }

    public final String getEE_PURCHASE() {
        return this.EE_PURCHASE;
    }

    public final String getEE_REFUND() {
        return this.EE_REFUND;
    }

    public final String getEE_REMOVE_FROM_CART() {
        return this.EE_REMOVE_FROM_CART;
    }

    public final String getEE_SELECT_ITEM() {
        return this.EE_SELECT_ITEM;
    }

    public final String getEE_SELECT_PROMOTION() {
        return this.EE_SELECT_PROMOTION;
    }

    public final String getEE_VIEW_CART() {
        return this.EE_VIEW_CART;
    }

    public final String getEE_VIEW_ITEM() {
        return this.EE_VIEW_ITEM;
    }

    public final String getEE_VIEW_ITEM_LIST() {
        return this.EE_VIEW_ITEM_LIST;
    }

    public final String getEE_VIEW_PROMOTION() {
        return this.EE_VIEW_PROMOTION;
    }

    public final GAUtils getGaUtils() {
        return this.gaUtils;
    }

    public final String getHYBRIS_ID() {
        return this.HYBRIS_ID;
    }

    public final String getIS_ANALYTICS_REVAMP() {
        return this.IS_ANALYTICS_REVAMP;
    }

    public final String getIS_GA4() {
        return this.IS_GA4;
    }

    public final String getIS_UA() {
        return this.IS_UA;
    }

    public final String getITEMS() {
        return this.ITEMS;
    }

    public final String getLOGIN_STATUS() {
        return this.LOGIN_STATUS;
    }

    public final String getNETWORK_TYPE() {
        return this.NETWORK_TYPE;
    }

    public final String getPAGE_TYPE() {
        return this.PAGE_TYPE;
    }

    public final String getPDP_RECENTLY_VIEWED() {
        return this.PDP_RECENTLY_VIEWED;
    }

    public final String getPDP_SCREEN_SIMILAR_PRODUCT_WIDGET() {
        return this.PDP_SCREEN_SIMILAR_PRODUCT_WIDGET;
    }

    public final String getPREVIOUS_SCREEN() {
        return this.PREVIOUS_SCREEN;
    }

    public final String getPREVIOUS_SCREEN_TYPE() {
        return this.PREVIOUS_SCREEN_TYPE;
    }

    public final String getPRODUCT_BRAND() {
        return this.PRODUCT_BRAND;
    }

    public final String getPRODUCT_BRICK() {
        return this.PRODUCT_BRICK;
    }

    public final String getPRODUCT_BRICK_SUB_CATEGORY() {
        return this.PRODUCT_BRICK_SUB_CATEGORY;
    }

    public final String getPRODUCT_CATEGORY() {
        return this.PRODUCT_CATEGORY;
    }

    public final String getPRODUCT_COLOR() {
        return this.PRODUCT_COLOR;
    }

    public final String getPRODUCT_FASHION_TYPE() {
        return this.PRODUCT_FASHION_TYPE;
    }

    public final String getPRODUCT_GENDER() {
        return this.PRODUCT_GENDER;
    }

    public final String getPRODUCT_ID() {
        return this.PRODUCT_ID;
    }

    public final String getPRODUCT_NAME() {
        return this.PRODUCT_NAME;
    }

    public final String getPRODUCT_PRICE() {
        return this.PRODUCT_PRICE;
    }

    public final String getPRODUCT_STYLE_TYPE() {
        return this.PRODUCT_STYLE_TYPE;
    }

    public final String getPRODUCT_TRADE_DISCOUNT() {
        return this.PRODUCT_TRADE_DISCOUNT;
    }

    public final String getPRODUCT_VERTICAL() {
        return this.PRODUCT_VERTICAL;
    }

    public final String getPrevScreen() {
        return this.prevScreen;
    }

    public final String getPrevScreenType() {
        return this.prevScreenType;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String getPromotionId(String stringArray, boolean bl2) {
        Exception exception2;
        String string2;
        block5: {
            boolean bl3;
            int n3;
            String[] stringArray2 = "/";
            string2 = "";
            String[] stringArray3 = "url";
            Intrinsics.checkNotNullParameter(stringArray, (String)stringArray3);
            try {
                n3 = TextUtils.isEmpty((CharSequence)stringArray);
                if (n3 != 0) {
                    return string2;
                }
                n3 = stringArray.length() + -2;
                int n4 = 4;
                n3 = StringsKt.R((CharSequence)stringArray, (String)stringArray2, n3, n4);
                n4 = 0;
                stringArray = stringArray.substring(0, n3);
                stringArray3 = "substring(...)";
                Intrinsics.checkNotNullExpressionValue(stringArray, (String)stringArray3);
                stringArray3 = new String[]{string2, string2};
                bl3 = TextUtils.isEmpty((CharSequence)stringArray);
                if (bl3) {
                    return stringArray3[0];
                }
            }
            catch (Exception exception2) {
                break block5;
            }
            bl3 = StringsKt.F((CharSequence)stringArray, (CharSequence)stringArray2, false);
            if (bl3) {
                stringArray2 = new String[]{stringArray2};
                n3 = 6;
                stringArray = StringsKt.a0((CharSequence)stringArray, stringArray2, false, 0, n3);
                stringArray = (Collection)stringArray;
                stringArray2 = new String[]{};
                stringArray = stringArray.toArray(stringArray2);
                stringArray3 = stringArray;
                stringArray3 = stringArray;
            }
            int n7 = stringArray3.length + -1;
            return stringArray3[n7];
        }
        yn3_0.a.e(exception2);
        return string2;
    }

    public final String getPromotionName(String stringArray) {
        String string2;
        Intrinsics.checkNotNullParameter(stringArray, "positionInfo");
        int n3 = 2;
        String[] stringArray2 = new String[n3];
        stringArray2[0] = string2 = "";
        int n4 = 1;
        stringArray2[n4] = string2;
        int n7 = TextUtils.isEmpty((CharSequence)stringArray);
        if (n7 != 0) {
            return stringArray2[0];
        }
        string2 = "/";
        n4 = (int)(StringsKt.F((CharSequence)stringArray, string2, false) ? 1 : 0);
        if (n4 != 0) {
            stringArray2 = new String[]{string2};
            n7 = 6;
            stringArray = StringsKt.a0((CharSequence)stringArray, stringArray2, false, 0, n7);
            stringArray2 = new String[]{};
            stringArray = stringArray.toArray(stringArray2);
            stringArray2 = stringArray;
            stringArray2 = stringArray;
        }
        return stringArray2[0];
    }

    public final String getSCREENNAME() {
        return this.SCREENNAME;
    }

    public final String getSCREEN_NAME() {
        return this.SCREEN_NAME;
    }

    public final String getSCREEN_TYPE() {
        return this.SCREEN_TYPE;
    }

    public final String getSERVED_FROM_CMS() {
        return this.SERVED_FROM_CMS;
    }

    public final String getTime_O_Day() {
        return this.Time_O_Day;
    }

    public final String getUA_PRODUCT_BRICK() {
        return this.UA_PRODUCT_BRICK;
    }

    public final String getUA_PRODUCT_BRICK_SUB_CATEGORY() {
        return this.UA_PRODUCT_BRICK_SUB_CATEGORY;
    }

    public final String getUA_PRODUCT_CATEGORY() {
        return this.UA_PRODUCT_CATEGORY;
    }

    public final String getUA_PRODUCT_FASHION_TYPE() {
        return this.UA_PRODUCT_FASHION_TYPE;
    }

    public final String getUA_PRODUCT_GROUP() {
        return this.UA_PRODUCT_GROUP;
    }

    public final String getUA_PRODUCT_PLANING_CATEGORY() {
        return this.UA_PRODUCT_PLANING_CATEGORY;
    }

    public final String getUA_PRODUCT_STYLE_TYPE() {
        return this.UA_PRODUCT_STYLE_TYPE;
    }

    public final String getUSER_STATUS() {
        return this.USER_STATUS;
    }

    public final UserInformation getUserInformation() {
        Object object = this.userInformation$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (UserInformation)object;
    }

    public final Bundle makeItemBundle(CartEntry cartEntry, boolean bl2, boolean bl3) {
        return this.makeItemBundleGAV4(cartEntry, bl2);
    }

    public final Bundle makeItemBundle(Product product, String string2, boolean bl2, boolean bl3, Boolean bl4, String string3) {
        return this.makeItemBundleGAV4(product, bl2, bl4, string3);
    }

    public final void pushEEAddRemoveCart(CartEntry cartEntry, String string2, Long l2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(string3, "screenName");
        Intrinsics.checkNotNullParameter(string4, "previousScreen");
        Intrinsics.checkNotNullParameter(string5, "screenType");
        Intrinsics.checkNotNullParameter(string6, "previousScreenType");
        this.pushEEAddRemoveCartGAV4(cartEntry, string2, l2, string3, string4, string5, string6);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void pushEEAddRemoveCartGAV4(CartEntry cartEntry, String string2, Long l2, String string3, String string4, String string5, String string6) {
        boolean bl2;
        int n3;
        Object object;
        double d2;
        double d5;
        long l3;
        Bundle bundle;
        Object object2;
        boolean bl3;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Long l4;
        Object object7;
        CartEntry cartEntry2;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        block31: {
            block30: {
                NumberFormatException numberFormatException2;
                block29: {
                    block28: {
                        newEEcommerceEventsRevamp = this;
                        cartEntry2 = cartEntry;
                        object7 = string2;
                        l4 = l2;
                        object6 = string3;
                        object5 = string4;
                        object4 = string5;
                        object3 = string6;
                        Intrinsics.checkNotNullParameter(string2, "eventName");
                        Intrinsics.checkNotNullParameter(string3, "screenName");
                        Intrinsics.checkNotNullParameter(string4, "previousScreen");
                        Intrinsics.checkNotNullParameter(string5, "screenType");
                        Intrinsics.checkNotNullParameter(string6, "previousScreenType");
                        bl3 = false;
                        object2 = this.makeItemBundle(cartEntry, false, false);
                        bundle = new Bundle((Bundle)object2);
                        l3 = 0L;
                        d5 = 0.0;
                        object2 = "quantity";
                        if (l2 != null) {
                            long l7 = l2;
                            bundle.putLong((String)object2, l7);
                        } else {
                            bundle.putLong((String)object2, l3);
                        }
                        if (cartEntry2 != null) {
                            try {
                                object2 = cartEntry.getBasePrice();
                                break block28;
                            }
                            catch (NumberFormatException numberFormatException2) {
                                break block29;
                            }
                        }
                        bl3 = false;
                        object2 = null;
                    }
                    if (object2 == null) break block30;
                    object2 = cartEntry.getBasePrice();
                    if ((object2 = ((Price)object2).getValue()) == null) break block30;
                    d2 = Double.parseDouble((String)object2);
                    break block31;
                }
                object = yn3_0.a;
                ((yn3$a)object).e(numberFormatException2);
            }
            d2 = 0.0;
        }
        object2 = newEEcommerceEventsRevamp.analytics;
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        Object object8 = "INR";
        parametersBuilder.param("currency", (String)object8);
        Object object9 = "price";
        if (l4 != null) {
            double d7 = (double)l2.longValue() * d2;
            l3 = l2;
            d5 = (double)l3 * d2;
            parametersBuilder.param((String)object9, d5);
            d5 = d7;
        } else {
            parametersBuilder.param((String)object9, l3);
            l3 = 0L;
            d5 = 0.0;
        }
        object8 = this.getStoreType();
        parametersBuilder.param("store_type", (String)object8);
        object9 = newEEcommerceEventsRevamp.Time_O_Day;
        object8 = rj_0.b();
        parametersBuilder.param((String)object9, (String)object8);
        object9 = newEEcommerceEventsRevamp.CLIENT_ID;
        object8 = this.getClientId();
        parametersBuilder.param((String)object9, (String)object8);
        object9 = newEEcommerceEventsRevamp.HYBRIS_ID;
        object8 = this.getHybrisId();
        parametersBuilder.param((String)object9, (String)object8);
        object9 = newEEcommerceEventsRevamp.NETWORK_TYPE;
        AJIOApplication.Companion.getClass();
        object8 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        parametersBuilder.param((String)object9, (String)object8);
        object9 = newEEcommerceEventsRevamp.SCREEN_NAME;
        parametersBuilder.param((String)object9, (String)object6);
        object9 = newEEcommerceEventsRevamp.SCREENNAME;
        parametersBuilder.param((String)object9, (String)object6);
        object6 = Ga4Events.INSTANCE;
        object9 = ((Ga4Events)object6).getGav4DimensionMap();
        object8 = "dimension16";
        object9 = (String)object9.get(object8);
        object = "";
        if (object9 == null) {
            object9 = object;
        }
        cp_1.Companion.getClass();
        Object object10 = cp$a.e();
        Product product = cartEntry2 != null ? cartEntry.getProduct() : null;
        object10.getClass();
        string3 = object8;
        object10 = object;
        double d9 = cp_1.x(product);
        parametersBuilder.param((String)object9, d9);
        object9 = this.getSegmentIds();
        if (object9 != null && (n3 = ((String)object9).length()) != 0) {
            object9 = this.getSegmentIds();
            Intrinsics.checkNotNullExpressionValue(object9, "<get-segmentIds>(...)");
            parametersBuilder.param("pricing_cust_seg", (String)object9);
            object9 = ((Ga4Events)object6).getGav4DimensionMap();
            object8 = "dimension192";
            object9 = (String)object9.get(object8);
            if (object9 == null) {
                object9 = object;
            }
            object8 = cp$a.e();
            object = cartEntry2 != null ? cartEntry.getProduct() : null;
            object8.getClass();
            d9 = cp_1.w((Product)object);
            parametersBuilder.param((String)object9, d9);
        }
        object9 = newEEcommerceEventsRevamp.USER_STATUS;
        object8 = this.getUserStatus();
        parametersBuilder.param((String)object9, (String)object8);
        object9 = newEEcommerceEventsRevamp.LOGIN_STATUS;
        object8 = this.getLoggedINStatus();
        parametersBuilder.param((String)object9, (String)object8);
        object9 = newEEcommerceEventsRevamp.SCREEN_TYPE;
        parametersBuilder.param((String)object9, (String)object4);
        object4 = newEEcommerceEventsRevamp.PREVIOUS_SCREEN;
        parametersBuilder.param((String)object4, (String)object5);
        object5 = newEEcommerceEventsRevamp.PREVIOUS_SCREEN_TYPE;
        parametersBuilder.param((String)object5, (String)object3);
        object5 = newEEcommerceEventsRevamp.IS_GA4;
        parametersBuilder.param((String)object5, "true");
        parametersBuilder.param("value", d5);
        object5 = newEEcommerceEventsRevamp.CONTAINS_LUXE;
        object4 = GAEcommerceEvents.INSTANCE;
        if (cartEntry2 != null) {
            object3 = cartEntry.getProduct();
        } else {
            bl2 = false;
            object3 = null;
        }
        boolean bl4 = ((GAEcommerceEvents)object4).containsLuxe((Product)object3);
        object4 = String.valueOf(bl4);
        parametersBuilder.param((String)object5, (String)object4);
        object4 = "Enhance E-commerce";
        parametersBuilder.param("event_category", (String)object4);
        parametersBuilder.param("event_action", (String)object7);
        object5 = newEEcommerceEventsRevamp.EE_ADD_TO_CART;
        int n4 = Intrinsics.areEqual(object7, object5);
        if (n4 != 0) {
            object5 = newEEcommerceEventsRevamp.AF_ID;
            object4 = AppsFlyerLib.getInstance();
            object3 = AJIOApplication$a.a();
            if ((object4 = ((AppsFlyerLib)object4).getAppsFlyerUID((Context)object3)) == null) {
                object4 = object10;
            }
            parametersBuilder.param((String)object5, (String)object4);
            object5 = ((Ga4Events)object6).getGav4DimensionMap();
            object4 = string3;
            object5 = (String)object5.get(string3);
            if (object5 == null) {
                object5 = object10;
            }
            if (cartEntry2 != null && (object3 = cartEntry.getProduct()) != null && (object3 = ((Product)object3).getWasPriceData()) != null) {
                object3 = ((Price)object3).getValue();
            } else {
                bl2 = false;
                object3 = null;
            }
            object3 = qz2_0.s(mz3_0.h((String)object3));
            parametersBuilder.param((String)object5, (String)object3);
        } else {
            object4 = string3;
        }
        object5 = newEEcommerceEventsRevamp.EE_REMOVE_FROM_CART;
        n4 = Intrinsics.areEqual(object7, object5);
        if (n4 != 0) {
            boolean bl5;
            object5 = (String)((Ga4Events)object6).getGav4DimensionMap().get(object4);
            object = object5 == null ? object10 : object5;
            if (cartEntry2 != null && (object5 = cartEntry.getProduct()) != null && (object5 = ((Product)object5).getWasPriceData()) != null) {
                object5 = ((Price)object5).getValue();
            } else {
                n4 = 0;
                object5 = null;
            }
            object5 = qz2_0.s(mz3_0.h((String)object5));
            parametersBuilder.param((String)object, (String)object5);
            n4 = -1;
            object4 = "dimension19";
            bl2 = true;
            if (cartEntry2 != null && (bl5 = cartEntry.isProductNS()) == bl2 || cartEntry2 != null && (bl5 = cartEntry.inventoryQtyUpdateNeeded()) == bl2 || cartEntry2 != null && !(bl2 = cartEntry.isQuantityAvailable())) {
                Product product2;
                object3 = cp$a.e();
                if (cartEntry2 != null) {
                    product2 = cartEntry.getProduct();
                } else {
                    bl5 = false;
                    product2 = null;
                }
                object3.getClass();
                object8 = product2 != null && (object3 = product2.getStockInfo()) != null ? ((StockInfo)object3).getStockErrorDescription() : null;
                object6 = (String)((Ga4Events)object6).getGav4DimensionMap().get(object4);
                if (cartEntry2 != null && (object4 = cartEntry.getProduct()) != null) {
                    n4 = ((Product)object4).getAvailableQuantity();
                }
                object4 = new StringBuilder();
                ((StringBuilder)object4).append(n4);
                ((StringBuilder)object4).append(" | non-deliverable | ");
                ((StringBuilder)object4).append((String)object8);
                object5 = ((StringBuilder)object4).toString();
                bundle.putString((String)object6, (String)object5);
            } else {
                object6 = (String)((Ga4Events)object6).getGav4DimensionMap().get(object4);
                if (cartEntry2 != null && (object4 = cartEntry.getProduct()) != null) {
                    n4 = ((Product)object4).getAvailableQuantity();
                }
                object4 = new StringBuilder();
                ((StringBuilder)object4).append(n4);
                ((StringBuilder)object4).append(" | deliverable");
                object5 = ((StringBuilder)object4).toString();
                bundle.putString((String)object6, (String)object5);
            }
        }
        parametersBuilder.param("items", bundle);
        object6 = parametersBuilder.getBundle();
        ((FirebaseAnalytics)object2).logEvent((String)object7, (Bundle)object6);
        object2 = newEEcommerceEventsRevamp.EE_ADD_TO_CART;
        bl3 = Intrinsics.areEqual(object7, object2);
        if (bl3) {
            object2 = AppsFlyerEvents.INSTANCE;
            object7 = new uy1_1(newEEcommerceEventsRevamp, cartEntry2, l4);
            ((AppsFlyerEvents)object2).wrapper((Function0)object7);
        }
    }

    public final void pushEEBannerImpression(String string2, HashMap hashMap, String string3, String string4, String string5, String string6, String string7, boolean bl2, boolean bl3, String string8) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(hashMap, "urlList");
        Intrinsics.checkNotNullParameter(string3, "screenName");
        Intrinsics.checkNotNullParameter(string4, "previousScreen");
        Intrinsics.checkNotNullParameter(string5, "screenType");
        Intrinsics.checkNotNullParameter(string6, "previousScreenType");
        Intrinsics.checkNotNullParameter(string7, "pageType");
        this.pushEEBannerImpressionGAV4(hashMap, string3, string4, string5, string6, string7, bl2, bl3, string8);
    }

    public final void pushEECheckoutStep1(ArrayList arrayList, String string2, double d2, String string3, String string4, String string5, String string6, String string7) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(string3, "coupon");
        Intrinsics.checkNotNullParameter(string4, "screenName");
        Intrinsics.checkNotNullParameter(string5, "previousScreen");
        Intrinsics.checkNotNullParameter(string6, "screenType");
        Intrinsics.checkNotNullParameter(string7, "previousScreenType");
    }

    public final void pushEECheckoutStep2(CartOrder cartOrder, String string2, String string3, String string4, String string5, String string6, String string7) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(string4, "screenName");
        Intrinsics.checkNotNullParameter(string5, "previousScreen");
        Intrinsics.checkNotNullParameter(string6, "screenType");
        Intrinsics.checkNotNullParameter(string7, "previousScreenType");
    }

    public final void pushEEClosetAddToCart(Product product, String string2, Long l2, String string3, String string4, boolean bl2, String string5, String string6, String string7, String string8) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(string4, "screenName");
        Intrinsics.checkNotNullParameter(string5, "previousScreen");
        Intrinsics.checkNotNullParameter(string6, "screenType");
        Intrinsics.checkNotNullParameter(string7, "previousScreenType");
        this.pushEEClosetAddToCartGAV4(product, string2, l2, string3, string4, bl2, string5, string6, string7, string8);
    }

    public final void pushEECuratedWidgetOptionSelectPromotion(CuratedWidgetItem curatedWidgetItem, int n3, String string2, String string3, String string4, String string5, Bundle bundle, String string6) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "previousScreen");
        Intrinsics.checkNotNullParameter(string4, "screenType");
        Intrinsics.checkNotNullParameter(string5, "previousScreenType");
        this.pushEECuratedWidgetOptionSelectPromotionGAV4(curatedWidgetItem, n3, string2, string3, string4, string5, bundle, string6);
    }

    public final void pushEECuratedWidgetOptionsImpression(List list, int n3, String string2, String string3, String string4, String string5, String string6, Bundle bundle) {
        Intrinsics.checkNotNullParameter(list, "options");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "previousScreen");
        Intrinsics.checkNotNullParameter(string4, "screenType");
        Intrinsics.checkNotNullParameter(string5, "previousScreenType");
        this.pushEECuratedWidgetOptionsImpressionGAV4(list, n3, string2, string3, string4, string5, string6, bundle);
    }

    public final void pushEECuratedWidgetOptionsImpressionGAV4(List object, int n3, String object2, String object3, String string2, String string3, String string4, Bundle bundle) {
        int n4;
        int n7;
        Intrinsics.checkNotNullParameter(object, "options");
        Intrinsics.checkNotNullParameter(object2, "screenName");
        Intrinsics.checkNotNullParameter(object3, "previousScreen");
        Intrinsics.checkNotNullParameter(string2, "screenType");
        Intrinsics.checkNotNullParameter(string3, "previousScreenType");
        ArrayList<Bundle> arrayList = new ArrayList<Bundle>();
        object = ((Iterable)object).iterator();
        while ((n7 = object.hasNext()) != 0) {
            Object object4 = (CuratedWidgetItem)object.next();
            Bundle bundle2 = E1.a("promotion_id", "MOBILE");
            CharSequence charSequence = ((CuratedWidgetItem)object4).getHeader();
            CharSequence charSequence2 = ((CuratedWidgetItem)object4).getSubheader();
            String string5 = "curated_";
            String string6 = " ";
            charSequence = UX.c(string5, (String)charSequence, string6, (String)charSequence2);
            bundle2.putString("promotion_name", (String)charSequence);
            charSequence = ((CuratedWidgetItem)object4).getWidgetName();
            charSequence2 = new StringBuilder(string5);
            ((StringBuilder)charSequence2).append((String)charSequence);
            charSequence = ((StringBuilder)charSequence2).toString();
            bundle2.putString("creative_name", (String)charSequence);
            n7 = ((CuratedWidgetItem)object4).getPosition();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(n3);
            charSequence2 = "|";
            ((StringBuilder)charSequence).append((String)charSequence2);
            ((StringBuilder)charSequence).append(n7);
            object4 = ((StringBuilder)charSequence).toString();
            charSequence = "creative_slot";
            bundle2.putString((String)charSequence, (String)object4);
            if (string4 != null && (n7 = string4.length()) != 0) {
                object4 = "item_list_name";
                bundle2.putString((String)object4, string4);
            }
            arrayList.add(bundle2);
        }
        object = new Bundle();
        string4 = this.getStoreType();
        object.putString("store_type", string4);
        Object object5 = this.Time_O_Day;
        string4 = rj_0.b();
        object.putString((String)object5, string4);
        object5 = this.CLIENT_ID;
        string4 = this.getClientId();
        object.putString((String)object5, string4);
        object5 = this.HYBRIS_ID;
        string4 = this.getHybrisId();
        object.putString((String)object5, string4);
        object5 = this.NETWORK_TYPE;
        AJIOApplication.Companion.getClass();
        string4 = vV1.d((ContextWrapper)AJIOApplication$a.a());
        object.putString((String)object5, string4);
        object5 = this.SCREEN_NAME;
        object.putString((String)object5, (String)object2);
        object5 = this.getSegmentIds();
        if (object5 != null && (n3 = ((String)object5).length()) != 0) {
            object5 = "pricing_cust_seg";
            string4 = this.getSegmentIds();
            object.putString((String)object5, string4);
        }
        object5 = this.SCREENNAME;
        object.putString((String)object5, (String)object2);
        object5 = this.USER_STATUS;
        object2 = this.getUserStatus();
        object.putString((String)object5, (String)object2);
        object5 = this.LOGIN_STATUS;
        object2 = this.getLoggedINStatus();
        object.putString((String)object5, (String)object2);
        object5 = this.SCREEN_TYPE;
        object.putString((String)object5, string2);
        object5 = this.PREVIOUS_SCREEN;
        object.putString((String)object5, (String)object3);
        object5 = this.PREVIOUS_SCREEN_TYPE;
        object.putString((String)object5, string3);
        object5 = this.ITEMS;
        object.putParcelableArrayList((String)object5, arrayList);
        object5 = this.appPreferences.f();
        if (object5 != null) {
            object2 = ((Object)StringsKt.m0((CharSequence)object5)).toString();
        } else {
            n4 = 0;
            object2 = null;
        }
        if (object2 != null && (n4 = ((String)object2).length()) != 0) {
            object2 = "user_type";
            object.putString((String)object2, (String)object5);
        }
        if ((n4 = (int)(TextUtils.isEmpty((CharSequence)(object5 = this.getUserInformation().getEncryptedUuid())) ? 1 : 0)) != 0) {
            object5 = "N/A";
        } else {
            cp_1.Companion.getClass();
            object2 = cp$a.e();
            object2.getClass();
            object5 = cp_1.L((String)object5);
        }
        object2 = this.IS_GA4;
        object3 = "true";
        object.putString((String)object2, (String)object3);
        object.putString("userId", (String)object5);
        object.putString("event_category", "Enhance E-commerce");
        object5 = "event_action";
        object2 = this.EE_VIEW_PROMOTION;
        object.putString((String)object5, (String)object2);
        if (bundle != null) {
            object5 = "product_id";
            n4 = (int)(bundle.containsKey((String)object5) ? 1 : 0);
            object3 = "";
            if (n4 != 0) {
                object2 = bundle.getString((String)object5);
                if (object2 == null) {
                    object2 = object3;
                }
                object.putString((String)object5, (String)object2);
            }
            if ((n4 = (int)(bundle.containsKey((String)(object5 = "product_name")) ? 1 : 0)) != 0) {
                object2 = bundle.getString((String)object5);
                if (object2 == null) {
                    object2 = object3;
                }
                object.putString((String)object5, (String)object2);
            }
            if ((n4 = (int)(bundle.containsKey((String)(object5 = "product_brand")) ? 1 : 0)) != 0) {
                object2 = bundle.getString((String)object5);
                if (object2 == null) {
                    object2 = object3;
                }
                object.putString((String)object5, (String)object2);
            }
            if ((n4 = (int)(bundle.containsKey((String)(object5 = "product_brick")) ? 1 : 0)) != 0) {
                object2 = bundle.getString((String)object5);
                if (object2 == null) {
                    object2 = object3;
                }
                object.putString((String)object5, (String)object2);
            }
            if ((n4 = (int)(bundle.containsKey((String)(object5 = "product_category")) ? 1 : 0)) != 0) {
                object2 = bundle.getString((String)object5);
                if (object2 != null) {
                    object3 = object2;
                }
                object.putString((String)object5, (String)object3);
            }
        }
        if (bundle != null) {
            object5 = this.analytics;
            object2 = this.EE_VIEW_ITEM_LIST;
            ((FirebaseAnalytics)object5).logEvent((String)object2, (Bundle)object);
        } else {
            object5 = this.analytics;
            object2 = this.EE_VIEW_PROMOTION;
            ((FirebaseAnalytics)object5).logEvent((String)object2, (Bundle)object);
        }
    }

    public final void pushEECustomForDisplaySize(String string2, String string3, String string4, String string5, String string6, boolean bl2, String string7, Product product) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "prevScreenName");
        Intrinsics.checkNotNullParameter(string4, "creativeName");
        Intrinsics.checkNotNullParameter(string5, "imageUrl");
        Intrinsics.checkNotNullParameter(string6, "creativeSlot");
        Intrinsics.checkNotNullParameter(string7, "itemId");
        this.pushEECustomForDisplaySizeGAV4(string2, string3, string4, string5, string6, bl2, string7, product);
    }

    public final void pushEECustomForTab(String string2, String string3, String string4, String string5, String string6, boolean bl2, String string7, boolean bl3, String string8) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "prevScreenName");
        Intrinsics.checkNotNullParameter(string4, "tabName");
        Intrinsics.checkNotNullParameter(string5, "tabImageUrl");
        Intrinsics.checkNotNullParameter(string6, "creativeSlot");
        Intrinsics.checkNotNullParameter(string7, "promotionId");
        this.pushEECustomForTabGAV4(string2, string3, string4, string5, string6, bl2, string7, bl3, string8);
    }

    public final void pushEECustomForTabs(String string2, String string3, ArrayList arrayList, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "prevScreenName");
        Intrinsics.checkNotNullParameter(arrayList, "tabs");
        Intrinsics.checkNotNullParameter(string4, "promotionId");
        this.pushEECustomForTabsGAV4(string2, string3, arrayList, string4, string5);
    }

    public final void pushEEFleekImpression(List list, String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(list, "impressionList");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "previousScreen");
        Intrinsics.checkNotNullParameter(string4, "screenType");
        Intrinsics.checkNotNullParameter(string5, "previousScreenType");
        this.pushEEFleekImpressionGAV4(list, string2, string3, string4, string5);
    }

    public final void pushEEProductImpression(List list, String string2, String string3, String string4, String string5, boolean bl2, String string6, String string7, String string8, String string9, String string10, String string11, boolean bl3, String string12, BannerData bannerData, long l2, Yj2 yj2, String string13, String string14, String string15, Bundle bundle, String string16, boolean bl4) {
        Intrinsics.checkNotNullParameter(list, "productList");
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(string3, "listName");
        Intrinsics.checkNotNullParameter(string5, "screenName");
        Intrinsics.checkNotNullParameter(string6, "previousScreen");
        Intrinsics.checkNotNullParameter(string7, "screenType");
        Intrinsics.checkNotNullParameter(string8, "previousScreenType");
        this.pushEEProductImpressionGAV4(list, string3, string4, string5, bl2, string6, string7, string8, string9, string10, string11, bl3, string12, bannerData, l2, yj2, string13, string14, string15, bundle, string16, bl4);
    }

    public final void pushEEProductSelect(Product product, int n3, String string2, String string3, String string4, String string5, boolean bl2, String string6, String string7, Boolean bl3, String string8, String string9, String string10, boolean bl4, String string11, BannerData bannerData, long l2, Yj2 yj2, String string12, Bundle bundle, String string13, String string14) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(string3, "listName");
        Intrinsics.checkNotNullParameter(string5, "screenName");
        Intrinsics.checkNotNullParameter(string6, "previousScreen");
        Intrinsics.checkNotNullParameter(string7, "screenType");
        Intrinsics.checkNotNullParameter(string8, "previousScreenType");
        this.pushEEProductSelectGAV4(product, n3, string3, string4, string5, bl2, string6, string7, bl3, string8, string9, string10, bl4, string11, bannerData, l2, yj2, string12, bundle, string13, string14);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void pushEEPurchaseAppsflyer(CartOrder cartOrder, LuxeDetails luxeDetails) {
        block98: {
            double d2;
            float f5;
            int n3;
            Object object;
            Object[] objectArray;
            Object object2;
            Object object3;
            Object object4;
            Serializable serializable;
            Object object5;
            Ref$DoubleRef ref$DoubleRef;
            Object object6;
            Object object7;
            block100: {
                block97: {
                    int n4;
                    boolean bl2;
                    boolean bl3;
                    String string2;
                    block99: {
                        NumberFormatException numberFormatException2;
                        block96: {
                            double d5;
                            object7 = this;
                            string2 = "Illegal argument";
                            if (cartOrder == null) return;
                            object6 = cartOrder.getCode();
                            if (object6 == null) break block98;
                            ref$DoubleRef = new Ref$DoubleRef();
                            try {
                                object6 = cartOrder.getTotalPrice();
                                d5 = object6 != null && (object6 = ((Price)object6).getValue()) != null ? Double.parseDouble((String)object6) : 0.0;
                            }
                            catch (NumberFormatException numberFormatException2) {
                                break block96;
                            }
                            ref$DoubleRef.element = d5;
                            break block99;
                        }
                        object5 = yn3_0.a;
                        ((yn3$a)object5).e(numberFormatException2);
                    }
                    object6 = cartOrder.getEntries();
                    if (object6 == null) break block98;
                    object6 = cartOrder.getEntries();
                    serializable = new Serializable(object6);
                    object6 = serializable.iterator();
                    object4 = "";
                    object5 = object4;
                    object3 = object4;
                    object2 = object4;
                    Object object8 = object4;
                    Object object9 = object4;
                    Object object10 = object4;
                    Object object11 = object4;
                    Object object12 = object4;
                    objectArray = object4;
                    int n7 = 0;
                    object = null;
                    int n8 = 0;
                    Object object13 = null;
                    int n10 = 0;
                    while (bl3 = object6.hasNext()) {
                        boolean bl4;
                        boolean bl5;
                        Object object14;
                        int n14;
                        Object[] objectArray2;
                        int n15;
                        int n16;
                        Object object15;
                        Object object16 = object6.next();
                        int n17 = n7 + 1;
                        String string3 = null;
                        if (n7 < 0) {
                            xx_2.n();
                            throw null;
                        }
                        Product product = (object16 = (CartEntry)object16) != null ? ((CartEntry)object16).getProduct() : null;
                        if (object16 != null && (object15 = ((CartEntry)object16).getQuantity()) != null) {
                            n16 = (Integer)object15;
                        } else {
                            n16 = 0;
                            object15 = null;
                        }
                        n8 += n16;
                        if (product == null || (object15 = product.getVerticalName()) == null) {
                            object15 = objectArray;
                        }
                        n16 = (int)(TextUtils.isEmpty((CharSequence)object15) ? 1 : 0);
                        String string4 = ",";
                        if (n16 != 0) {
                            object15 = object6;
                            n15 = n8;
                            object6 = objectArray;
                        } else {
                            if (product != null) {
                                object15 = product.getVerticalName();
                                n15 = n8;
                                Object object17 = object15;
                                object15 = object6;
                                object6 = object17;
                            } else {
                                object15 = object6;
                                n15 = n8;
                                n3 = 0;
                                object6 = null;
                                f5 = 0.0f;
                            }
                            n8 = xx_2.h(serializable);
                            object13 = n7 == n8 ? objectArray : string4;
                            object6 = Ft2.a((String)object6, (String)object13);
                        }
                        object9 = Qj0.b((String)object9, (String)object6);
                        if (product == null || (object6 = product.getBrickName()) == null) {
                            object6 = objectArray;
                        }
                        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0)) != 0) {
                            object6 = objectArray;
                        } else {
                            if (product != null) {
                                object6 = product.getBrickName();
                            } else {
                                n3 = 0;
                                object6 = null;
                                f5 = 0.0f;
                            }
                            n8 = xx_2.h(serializable);
                            object13 = n7 == n8 ? objectArray : string4;
                            object6 = Ft2.a((String)object6, (String)object13);
                        }
                        object11 = Qj0.b((String)object11, (String)object6);
                        if (product == null || (object6 = product.getBrickCategory()) == null) {
                            object6 = objectArray;
                        }
                        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0)) != 0) {
                            object6 = objectArray;
                        } else {
                            if (product != null) {
                                object6 = product.getBrickCategory();
                            } else {
                                n3 = 0;
                                object6 = null;
                                f5 = 0.0f;
                            }
                            n8 = xx_2.h(serializable);
                            object13 = n7 == n8 ? objectArray : string4;
                            object6 = Ft2.a((String)object6, (String)object13);
                        }
                        object12 = Qj0.b((String)object12, (String)object6);
                        if (object16 != null) {
                            object6 = ((CartEntry)object16).getSourceStoreId();
                        } else {
                            n3 = 0;
                            object6 = null;
                            f5 = 0.0f;
                        }
                        object13 = "luxe";
                        n3 = (int)(Intrinsics.areEqual(object6, object13) ? 1 : 0);
                        if (n3 != 0) {
                            if (object16 != null && (object6 = ((CartEntry)object16).getQuantity()) != null) {
                                n3 = (Integer)object6;
                            } else {
                                n3 = 0;
                                f5 = 0.0f;
                                object6 = null;
                            }
                            n10 += n3;
                            if (product == null || (object6 = product.getVerticalName()) == null) {
                                object6 = objectArray;
                            }
                            if ((n3 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0)) != 0) {
                                objectArray2 = object9;
                                object6 = objectArray;
                            } else {
                                if (product != null) {
                                    object6 = product.getVerticalName();
                                    objectArray2 = object9;
                                } else {
                                    objectArray2 = object9;
                                    n3 = 0;
                                    object6 = null;
                                    f5 = 0.0f;
                                }
                                n14 = xx_2.h(serializable);
                                object9 = n7 == n14 ? objectArray : string4;
                                object6 = Ft2.a((String)object6, (String)object9);
                            }
                            object3 = Qj0.b((String)object3, (String)object6);
                            if (product == null || (object6 = product.getBrickName()) == null) {
                                object6 = objectArray;
                            }
                            if ((n3 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0)) != 0) {
                                object6 = objectArray;
                            } else {
                                if (product != null) {
                                    object6 = product.getBrickName();
                                } else {
                                    n3 = 0;
                                    object6 = null;
                                    f5 = 0.0f;
                                }
                                n14 = xx_2.h(serializable);
                                object9 = n7 == n14 ? objectArray : string4;
                                object6 = Ft2.a((String)object6, (String)object9);
                            }
                            object2 = Qj0.b((String)object2, (String)object6);
                            if (product == null || (object6 = product.getBrickCategory()) == null) {
                                object6 = objectArray;
                            }
                            if ((n3 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0)) != 0) {
                                object6 = objectArray;
                            } else {
                                if (product != null) {
                                    object6 = product.getBrickCategory();
                                } else {
                                    n3 = 0;
                                    object6 = null;
                                    f5 = 0.0f;
                                }
                                n14 = xx_2.h(serializable);
                                object9 = n7 == n14 ? objectArray : string4;
                                object6 = Ft2.a((String)object6, (String)object9);
                            }
                            object5 = Qj0.b((String)object5, (String)object6);
                        } else {
                            objectArray2 = object9;
                        }
                        if (product != null) {
                            object6 = product.getBaseProduct();
                        } else {
                            n3 = 0;
                            object6 = null;
                            f5 = 0.0f;
                        }
                        n3 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0);
                        if (n3 == 0) {
                            if (product != null) {
                                object6 = product.getBaseProduct();
                            } else {
                                n3 = 0;
                                object6 = null;
                                f5 = 0.0f;
                            }
                            object6 = ((NewEEcommerceEventsRevamp)object7).trimProductId((String)object6);
                            n14 = 0;
                            object9 = null;
                            object14 = object6[0];
                            bl5 = TextUtils.isEmpty((CharSequence)object14);
                            if (bl5) {
                                return;
                            }
                            object14 = object6[0];
                            bl5 = TextUtils.isEmpty((CharSequence)object14);
                            if (bl5) {
                                object6 = objectArray;
                            } else {
                                object6 = object6[0];
                                n14 = xx_2.h(serializable);
                                object9 = n7 == n14 ? objectArray : string4;
                                object6 = Ft2.a((String)object6, (String)object9);
                            }
                            object6 = Qj0.b((String)object4, (String)object6);
                            if (product != null) {
                                object4 = product.getBaseProduct();
                            } else {
                                bl2 = false;
                                object4 = null;
                            }
                            bl2 = TextUtils.isEmpty((CharSequence)object4);
                            if (bl2) {
                                object4 = objectArray;
                            } else {
                                if (product != null) {
                                    object4 = product.getBaseProduct();
                                } else {
                                    bl2 = false;
                                    object4 = null;
                                }
                                n14 = xx_2.h(serializable);
                                object9 = n7 == n14 ? objectArray : string4;
                                object4 = Ft2.a((String)object4, (String)object9);
                            }
                            object4 = Qj0.b((String)object8, (String)object4);
                            if (object16 != null) {
                                object8 = ((CartEntry)object16).getSourceStoreId();
                            } else {
                                bl4 = false;
                                object8 = null;
                            }
                            bl4 = Intrinsics.areEqual(object8, object13);
                            if (bl4) {
                                if (product != null) {
                                    object8 = product.getBaseProduct();
                                } else {
                                    bl4 = false;
                                    object8 = null;
                                }
                                bl4 = TextUtils.isEmpty((CharSequence)object8);
                                if (bl4) {
                                    object = objectArray;
                                } else {
                                    if (product != null) {
                                        string3 = product.getBaseProduct();
                                    }
                                    object8 = string3;
                                    n8 = xx_2.h(serializable);
                                    object = n7 == n8 ? objectArray : string4;
                                    object = Ft2.a((String)object8, (String)object);
                                }
                                object10 = Qj0.b((String)object10, (String)object);
                            }
                        } else {
                            if (product != null) {
                                object6 = product.getCode();
                            } else {
                                n3 = 0;
                                object6 = null;
                                f5 = 0.0f;
                            }
                            object6 = ((NewEEcommerceEventsRevamp)object7).trimProductId((String)object6);
                            n14 = 0;
                            object9 = null;
                            object14 = object6[0];
                            bl5 = TextUtils.isEmpty((CharSequence)object14);
                            if (bl5) {
                                return;
                            }
                            object14 = object6[0];
                            bl5 = TextUtils.isEmpty((CharSequence)object14);
                            if (bl5) {
                                object6 = objectArray;
                            } else {
                                object6 = object6[0];
                                n14 = xx_2.h(serializable);
                                object9 = n7 == n14 ? objectArray : string4;
                                object6 = Ft2.a((String)object6, (String)object9);
                            }
                            object6 = Qj0.b((String)object4, (String)object6);
                            if (product != null) {
                                object4 = product.getBaseProduct();
                            } else {
                                bl2 = false;
                                object4 = null;
                            }
                            bl2 = TextUtils.isEmpty((CharSequence)object4);
                            if (bl2) {
                                object4 = objectArray;
                            } else {
                                if (product != null) {
                                    object4 = product.getBaseProduct();
                                } else {
                                    bl2 = false;
                                    object4 = null;
                                }
                                n14 = xx_2.h(serializable);
                                object9 = n7 == n14 ? objectArray : string4;
                                object4 = Ft2.a((String)object4, (String)object9);
                            }
                            object4 = Qj0.b((String)object8, (String)object4);
                            if (object16 != null) {
                                object8 = ((CartEntry)object16).getSourceStoreId();
                            } else {
                                bl4 = false;
                                object8 = null;
                            }
                            if (bl4 = Intrinsics.areEqual(object8, object13)) {
                                if (product != null) {
                                    object8 = product.getBaseProduct();
                                } else {
                                    bl4 = false;
                                    object8 = null;
                                }
                                bl4 = TextUtils.isEmpty((CharSequence)object8);
                                if (bl4) {
                                    object = objectArray;
                                } else {
                                    if (product != null) {
                                        string3 = product.getBaseProduct();
                                    }
                                    object8 = string3;
                                    n8 = xx_2.h(serializable);
                                    object = n7 == n8 ? objectArray : string4;
                                    object = Ft2.a((String)object8, (String)object);
                                }
                                object10 = Qj0.b((String)object10, (String)object);
                            }
                        }
                        object8 = object4;
                        object4 = object6;
                        n7 = n17;
                        object6 = object15;
                        n8 = n15;
                        object9 = objectArray2;
                    }
                    char c2 = (char)-1;
                    object = new AppsFlyerEventsItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, c2, null);
                    double d7 = ref$DoubleRef.element;
                    object6 = String.valueOf(d7);
                    object.setRevenue((String)object6);
                    n3 = 44;
                    f5 = 6.2E-44f;
                    try {
                        n4 = object8.length();
                        if (n4 > 0 && (n4 = (int)le3_2.D((CharSequence)object8)) == n3) {
                            object8 = le3_2.C((String)object8);
                        }
                        object.setContentId((String)object8);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        object7 = yn3_0.a;
                        bl2 = false;
                        object4 = null;
                        object8 = new Object[]{};
                        ((yn3$a)object7).a(string2, object8);
                    }
                    object.setContentType((String)object9);
                    object.setCurrency("INR");
                    object7 = String.valueOf(n8);
                    object.setQuantity((String)object7);
                    object7 = cartOrder.getCode();
                    object.setOrderId((String)object7);
                    object.setSegment((String)object12);
                    object.setBrick((String)object11);
                    try {
                        n4 = object10.length();
                        if (n4 > 0 && (n4 = (int)le3_2.D((CharSequence)object10)) == n3) {
                            object10 = le3_2.C((String)object10);
                        }
                        object.setLuxeProductIds((String)object10);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        object6 = yn3_0.a;
                        n4 = 0;
                        object7 = new Object[]{};
                        ((yn3$a)object6).a(string2, (Object[])object7);
                    }
                    object6 = String.valueOf(n10);
                    object.setLuxeCartQuantity((String)object6);
                    object.setLuxeBrickType((String)object2);
                    object.setLuxeSegmentType((String)object5);
                    object.setLuxeContentType((String)object3);
                    try {
                        object6 = cartOrder.getLuxeTotalPrice();
                        if (object6 == null) break block97;
                        f5 = ((TotalPrice)object6).getValue();
                    }
                    catch (NumberFormatException numberFormatException) {
                        object7 = yn3_0.a;
                        ((yn3$a)object7).e(numberFormatException);
                    }
                    d2 = f5;
                    break block100;
                }
                d2 = 0.0;
            }
            object6 = h40_0.a;
            n3 = (int)(h40_0.Q0() ? 1 : 0);
            if (n3 != 0) {
                object6 = String.valueOf(d2);
                object.setLuxeTotalRevenue((String)object6);
            } else if (luxeDetails != null && (object6 = luxeDetails.getTotalPrice()) != null) {
                f5 = ((Number)object6).floatValue();
                object6 = String.valueOf(f5);
                object.setLuxeTotalRevenue((String)object6);
            } else {
                object6 = "0.0";
                object.setLuxeTotalRevenue((String)object6);
            }
            object6 = AppsFlyerEvents.INSTANCE;
            object5 = object7;
            object3 = cartOrder;
            object2 = serializable;
            serializable = luxeDetails;
            object7 = new vy1_2(ref$DoubleRef, cartOrder, (ArrayList)object2, luxeDetails, (AppsFlyerEventsItem)object);
            ((AppsFlyerEvents)object6).wrapper((Function0)object7);
            cp_1.Companion.getClass();
            object6 = cp$a.e();
            object7 = cartOrder.getCode();
            object4 = object7 == null ? objectArray : object7;
            object6.getClass();
            object6 = "Appsflyer_after";
            cp_1.K((String)object4, (String)object6);
        }
    }

    public final void pushEERefund(String string2, ArrayList arrayList, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(arrayList, "returnEntries");
        Intrinsics.checkNotNullParameter(string3, "screenName");
        Intrinsics.checkNotNullParameter(string4, "previousScreen");
        Intrinsics.checkNotNullParameter(string5, "screenType");
        Intrinsics.checkNotNullParameter(string6, "previousScreenType");
        this.pushEERefundGAV4(string2, arrayList, string3, string4, string5, string6);
    }

    public final void pushEESelectPromotion(String string2, String string3, String string4, String string5, String string6, String string7, boolean bl2, boolean bl3, String string8, String string9, String string10, boolean bl4) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(string3, "url");
        Intrinsics.checkNotNullParameter(string4, "screenName");
        Intrinsics.checkNotNullParameter(string5, "previousScreen");
        Intrinsics.checkNotNullParameter(string6, "screenType");
        Intrinsics.checkNotNullParameter(string7, "previousScreenType");
        Intrinsics.checkNotNullParameter(string10, "creativeSlot");
        AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp().pushEESelectPromotionGAV4(string3, string4, string5, string6, string7, bl2, bl3, string8, string9, string10, bl4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void pushPurchaseCancelOrderAppsFlyerEvent(String string2, CartEntry cartEntry, CartOrder cartOrder, OrderCancellation orderCancellation) {
        String string3 = string2;
        Object object = "cartOrder";
        Object object2 = cartOrder;
        Intrinsics.checkNotNullParameter(cartOrder, (String)object);
        if (string2 != null) {
            double d2;
            float f5;
            String string4;
            String string5;
            Object object3;
            String string6;
            Object object4;
            Object object5;
            Object object6;
            float f6;
            Object object7;
            Object object8;
            int n3;
            Object object9;
            boolean bl2;
            Object object10;
            int n4;
            double d5;
            int n7;
            int n8;
            Object object11;
            block67: {
                block66: {
                    boolean bl3;
                    object = cartOrder.getConfirmedEntries();
                    object11 = null;
                    n8 = 0;
                    if (object == null || (n7 = object.isEmpty()) != 0) {
                        d5 = 0.0;
                    } else {
                        object = cartOrder.getConfirmedEntries();
                        Intrinsics.checkNotNullExpressionValue(object, "getConfirmedEntries(...)");
                        object = object.iterator();
                        n4 = 0;
                        object10 = null;
                        d5 = 0.0;
                        while (bl2 = object.hasNext()) {
                            object9 = object.next();
                            n3 = n4 + 1;
                            if (n4 < 0) {
                                xx_2.n();
                                throw null;
                            }
                            object9 = (OrderDetailLineItem)object9;
                            object10 = ((OrderDetailLineItem)object9).getEntry().getProduct().getCode();
                            if (cartEntry != null && (object8 = cartEntry.getProduct()) != null) {
                                object8 = ((Product)object8).getCode();
                            } else {
                                bl3 = false;
                                object8 = null;
                            }
                            n4 = (int)(Intrinsics.areEqual(object10, object8) ? 1 : 0);
                            if (n4 != 0) {
                                object10 = ((OrderDetailLineItem)object9).getAmount();
                                object7 = "getAmount(...)";
                                Intrinsics.checkNotNullExpressionValue(object10, (String)object7);
                                d5 = Double.parseDouble((String)object10);
                            }
                            n4 = n3;
                        }
                    }
                    if (cartEntry != null) {
                        object = cartEntry.getSourceStoreId();
                    } else {
                        n7 = 0;
                        object = null;
                        f6 = 0.0f;
                    }
                    object10 = "";
                    if (object != null && (n7 = ((String)object).length()) != 0) {
                        if (cartEntry != null) {
                            object = cartEntry.getSourceStoreId();
                        } else {
                            n7 = 0;
                            object = null;
                            f6 = 0.0f;
                        }
                    } else {
                        object = GAEcommerceEvents.INSTANCE;
                        if (cartEntry == null || (object9 = cartEntry.getProduct()) == null || (object9 = ((Product)object9).getCatalogName()) == null) {
                            object9 = object10;
                        }
                        object = ((GAEcommerceEvents)object).getStoreTypeFromCatalog((String)object9);
                    }
                    object9 = "luxe";
                    bl2 = ((String)object9).equalsIgnoreCase((String)object);
                    if (bl2) {
                        boolean bl4;
                        boolean bl5;
                        if (cartEntry != null && (object = cartEntry.getQuantity()) != null) {
                            n7 = (Integer)object;
                        } else {
                            n7 = 0;
                            f6 = 0.0f;
                            object = null;
                        }
                        if (cartEntry == null || (object6 = cartEntry.getProduct()) == null || (object6 = ((Product)object6).getBaseProduct()) == null) {
                            object6 = object10;
                        }
                        if (cartEntry == null || (object8 = cartEntry.getProduct()) == null || (object8 = ((Product)object8).getVerticalName()) == null) {
                            object8 = object10;
                        }
                        if (bl3 = TextUtils.isEmpty((CharSequence)object8)) {
                            object8 = object10;
                        } else if (cartEntry != null && (object8 = cartEntry.getProduct()) != null) {
                            object8 = ((Product)object8).getVerticalName();
                        } else {
                            bl3 = false;
                            object8 = null;
                        }
                        object8 = kp1_0.c((String)object10, (String)object8);
                        if (cartEntry == null || (object5 = cartEntry.getProduct()) == null || (object5 = ((Product)object5).getBrickName()) == null) {
                            object5 = object10;
                        }
                        if (bl5 = TextUtils.isEmpty((CharSequence)object5)) {
                            object5 = object10;
                        } else if (cartEntry != null && (object5 = cartEntry.getProduct()) != null) {
                            object5 = ((Product)object5).getBrickName();
                        } else {
                            bl5 = false;
                            object5 = null;
                        }
                        object5 = kp1_0.c((String)object10, (String)object5);
                        if (cartEntry == null || (object4 = cartEntry.getProduct()) == null || (object4 = ((Product)object4).getBrickCategory()) == null) {
                            object4 = object10;
                        }
                        if (bl4 = TextUtils.isEmpty((CharSequence)object4)) {
                            object4 = object10;
                        } else if (cartEntry != null && (object4 = cartEntry.getProduct()) != null) {
                            object4 = ((Product)object4).getBrickCategory();
                        } else {
                            bl4 = false;
                            object4 = null;
                        }
                        string6 = kp1_0.c((String)object10, (String)object4);
                        object4 = object5;
                        object5 = object8;
                        object8 = object6;
                        n3 = n7;
                    } else {
                        object8 = object10;
                        object5 = object10;
                        object4 = object10;
                        string6 = object10;
                        n3 = 0;
                        object6 = null;
                    }
                    if (cartEntry != null && (object = cartEntry.getQuantity()) != null) {
                        n8 = (Integer)object;
                    }
                    object3 = cartEntry != null && (object = cartEntry.getProduct()) != null && (object = ((Product)object).getBaseProduct()) != null ? object : object10;
                    if (cartEntry == null || (object = cartEntry.getProduct()) == null || (object = ((Product)object).getVerticalName()) == null) {
                        object = object10;
                    }
                    if ((n7 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0)) != 0) {
                        object = object10;
                    } else if (cartEntry != null && (object = cartEntry.getProduct()) != null) {
                        object = ((Product)object).getVerticalName();
                    } else {
                        n7 = 0;
                        object = null;
                        f6 = 0.0f;
                    }
                    object11 = kp1_0.c((String)object10, (String)object);
                    if (cartEntry == null || (object = cartEntry.getProduct()) == null || (object = ((Product)object).getBrickName()) == null) {
                        object = object10;
                    }
                    if ((n7 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0)) != 0) {
                        object = object10;
                    } else if (cartEntry != null && (object = cartEntry.getProduct()) != null) {
                        object = ((Product)object).getBrickName();
                    } else {
                        n7 = 0;
                        f6 = 0.0f;
                        object = null;
                    }
                    string5 = kp1_0.c((String)object10, (String)object);
                    if (cartEntry == null || (object = cartEntry.getProduct()) == null || (object = ((Product)object).getBrickCategory()) == null) {
                        object = object10;
                    }
                    if ((n7 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0)) != 0) {
                        object = object10;
                    } else if (cartEntry != null && (object = cartEntry.getProduct()) != null) {
                        object = ((Product)object).getBrickCategory();
                    } else {
                        n7 = 0;
                        f6 = 0.0f;
                        object = null;
                    }
                    string4 = kp1_0.c((String)object10, (String)object);
                    f5 = 0.0f;
                    if (orderCancellation != null) {
                        try {
                            object = orderCancellation.getTotalPrice();
                            if (object == null) break block66;
                            f6 = ((TotalPrice)object).getValue();
                            break block67;
                        }
                        catch (NumberFormatException numberFormatException) {
                            object2 = yn3_0.a;
                            ((yn3$a)object2).e(numberFormatException);
                        }
                    }
                }
                n7 = 0;
                f6 = 0.0f;
                object = null;
            }
            Object object12 = object2;
            char c2 = (char)-1;
            object2 = new AppsFlyerEventsItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, c2, null);
            object12 = h40_0.a;
            boolean bl6 = h40_0.Q0();
            if (bl6) {
                object = String.valueOf(f6);
                ((AppsFlyerEventsItem)object2).setRevenue((String)object);
            } else {
                object = String.valueOf(d5);
                ((AppsFlyerEventsItem)object2).setRevenue((String)object);
            }
            n7 = ((String)object3).length();
            if (n7 > 0) {
                n7 = le3_2.D((CharSequence)object3);
                object12 = object10;
                n4 = 44;
                if (n7 == n4) {
                    object3 = le3_2.C((String)object3);
                }
            } else {
                object12 = object10;
            }
            object = object3;
            ((AppsFlyerEventsItem)object2).setContentId((String)object3);
            ((AppsFlyerEventsItem)object2).setContentType((String)object11);
            ((AppsFlyerEventsItem)object2).setCurrency("INR");
            object = String.valueOf(n8);
            ((AppsFlyerEventsItem)object2).setQuantity((String)object);
            ((AppsFlyerEventsItem)object2).setOrderId(string3);
            ((AppsFlyerEventsItem)object2).setSegment(string4);
            ((AppsFlyerEventsItem)object2).setBrick(string5);
            ((AppsFlyerEventsItem)object2).setLuxeProductIds((String)object8);
            object = String.valueOf(n3);
            ((AppsFlyerEventsItem)object2).setLuxeCartQuantity((String)object);
            ((AppsFlyerEventsItem)object2).setLuxeBrickType((String)object4);
            ((AppsFlyerEventsItem)object2).setLuxeSegmentType(string6);
            ((AppsFlyerEventsItem)object2).setLuxeContentType((String)object5);
            if (orderCancellation != null) {
                try {
                    object = orderCancellation.getLuxeTotalPrice();
                    if (object != null) {
                        f5 = ((TotalPrice)object).getValue();
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    object11 = yn3_0.a;
                    ((yn3$a)object11).e(numberFormatException);
                }
            }
            object = h40_0.a;
            n7 = (int)(h40_0.Q0() ? 1 : 0);
            if (n7 != 0) {
                object = String.valueOf(f5);
                ((AppsFlyerEventsItem)object2).setLuxeTotalRevenue((String)object);
            } else {
                object = bl2 ? String.valueOf(d5) : "0.0";
                ((AppsFlyerEventsItem)object2).setLuxeTotalRevenue((String)object);
            }
            object = AppsFlyerEvents.INSTANCE;
            object11 = cartOrder.getTotalPrice().getValue();
            double d7 = object11 != null ? (d2 = Double.parseDouble((String)object11)) : 0.0;
            object10 = cartEntry != null && (object11 = cartEntry.getProduct()) != null && (object11 = ((Product)object11).getCode()) != null ? object11 : object12;
            double d9 = bl2 ? d5 : 0.0;
            object6 = d9;
            object8 = "cancel";
            object5 = object2;
            object2 = object;
            d2 = d5;
            string3 = string2;
            object7 = object8;
            object9 = object6;
            object6 = object5;
            ((AppsFlyerEvents)object).pushPurchaseRefund(d5, d7, (String)object10, string2, (String)object8, bl2, (Double)object9, (AppsFlyerEventsItem)object5);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void pushPurchaseReturnAppsflyerEvent(String var1_1, ArrayList var2_2, Float var3_3, ReturnExchange var4_4) {
        block62: {
            block61: {
                block60: {
                    block59: {
                        block58: {
                            var5_5 = var1_1;
                            var6_6 = 1;
                            var7_7 = 1.4E-45f;
                            var8_8 = var2_2;
                            Intrinsics.checkNotNullParameter(var2_2, "returnEntries");
                            var9_9 = "returnExchange";
                            var10_13 = var4_4;
                            Intrinsics.checkNotNullParameter(var4_4, (String)var9_9);
                            var11_14 = var2_2.size();
                            if (var11_14 <= 0) break block62;
                            var12_15 = var2_2.iterator();
                            var14_17 = var13_16 = "";
                            var15_18 = var13_16;
                            var16_19 = var13_16;
                            var17_20 = var13_16;
                            var18_21 = var13_16;
                            var19_22 = var13_16;
                            var20_23 = var13_16;
                            var21_24 = var13_16;
                            var22_25 = 0;
                            var23_26 = null;
                            var24_27 = 0;
                            var25_28 = 0;
                            var26_29 = 0.0;
                            var28_30 = 0.0;
                            var30_31 = 0.0;
                            while ((var11_14 = (int)var12_15.hasNext()) != 0) {
                                block63: {
                                    block56: {
                                        block57: {
                                            block55: {
                                                block54: {
                                                    block53: {
                                                        block52: {
                                                            var9_9 = var12_15.next();
                                                            var32_32 = var22_25 + 1;
                                                            var33_33 = null;
                                                            if (var22_25 < 0) {
                                                                xx_2.n();
                                                                throw null;
                                                            }
                                                            var34_34 = var9_9;
                                                            var34_34 = (ReturnEntries)var9_9;
                                                            var11_14 = var34_34.getReturnOrderEntry().getQuantity();
                                                            var24_27 += var11_14;
                                                            var35_35 = var34_34.getReturnOrderEntry().getProduct();
                                                            var9_9 = var34_34.getReturnOrderEntry().getSourceStoreId();
                                                            if (var9_9 != null && (var11_14 = var9_9.length()) != 0) {
                                                                var9_9 = var34_34.getReturnOrderEntry().getSourceStoreId();
                                                            } else {
                                                                var9_9 = GAEcommerceEvents.INSTANCE;
                                                                var37_37 = var35_35 != null && (var36_36 = var35_35.getCatalogName()) != null ? var36_36 : var13_16;
                                                                var9_9 = var9_9.getStoreTypeFromCatalog((String)var37_37);
                                                            }
                                                            var37_37 = "luxe";
                                                            var6_6 = var37_37.equalsIgnoreCase((String)var9_9);
                                                            try {
                                                                var9_9 = var34_34.getReturnOrderEntry();
                                                                if (var9_9 == null || (var9_9 = var9_9.getBasePrice()) == null) break block52;
                                                                var38_38 = var9_9.getValue();
                                                                var9_9 = Float.valueOf(var38_38);
                                                                break block53;
                                                            }
                                                            catch (NumberFormatException var9_10) {
                                                                break block54;
                                                            }
                                                        }
                                                        var11_14 = 0;
                                                        var9_9 = null;
                                                        var38_38 = 0.0f;
                                                    }
                                                    if (var9_9 == null) break block55;
                                                    var9_9 = var34_34.getReturnOrderEntry();
                                                    var9_9 = var9_9.getBasePrice();
                                                    var38_38 = var9_9.getValue();
                                                    var39_39 = var38_38;
                                                    var26_29 += var39_39;
                                                    {
                                                        var9_9 = var34_34.getReturnOrderEntry();
                                                        if ((var9_9 = var9_9.getShippingChargePromoAmt()) != null) {
                                                            var9_9 = var34_34.getReturnOrderEntry();
                                                            var9_9 = var9_9.getShippingChargePromoAmt();
                                                            var8_8 = "getShippingChargePromoAmt(...)";
                                                            Intrinsics.checkNotNullExpressionValue(var9_9, (String)var8_8);
                                                            var39_39 = var9_9.doubleValue();
                                                            var30_31 += var39_39;
                                                        }
                                                        break block55;
                                                    }
                                                }
                                                var8_8 = yn3_0.a;
                                                var8_8.e(var9_10);
                                            }
                                            var9_9 = var35_35.getBaseProduct();
                                            var11_14 = (int)TextUtils.isEmpty((CharSequence)var9_9);
                                            var8_8 = ",";
                                            if (var11_14 != 0) {
                                                var9_9 = var13_16;
                                            } else {
                                                var9_9 = var35_35.getBaseProduct();
                                                var41_40 = xx_2.h(var2_2);
                                                var10_13 = var22_25 == var41_40 ? var13_16 : var8_8;
                                                var9_9 = Ft2.a((String)var9_9, (String)var10_13);
                                            }
                                            var17_20 = Qj0.b((String)var17_20, (String)var9_9);
                                            if (var6_6 != 0) {
                                                var9_9 = var35_35.getBaseProduct();
                                                var11_14 = (int)TextUtils.isEmpty((CharSequence)var9_9);
                                                if (var11_14 != 0) {
                                                    var9_9 = var13_16;
                                                } else {
                                                    var9_9 = var35_35.getBaseProduct();
                                                    var41_40 = xx_2.h(var2_2);
                                                    var10_13 = var22_25 == var41_40 ? var13_16 : var8_8;
                                                    var9_9 = Ft2.a((String)var9_9, (String)var10_13);
                                                }
                                                var18_21 = Qj0.b(var18_21, (String)var9_9);
                                            }
                                            if ((var9_9 = var35_35.getVerticalName()) == null) {
                                                var9_9 = var13_16;
                                            }
                                            if ((var11_14 = (int)TextUtils.isEmpty((CharSequence)var9_9)) != 0) {
                                                var9_9 = var13_16;
                                            } else {
                                                var9_9 = var35_35.getVerticalName();
                                                var41_40 = xx_2.h(var2_2);
                                                var10_13 = var22_25 == var41_40 ? var13_16 : var8_8;
                                                var9_9 = Ft2.a((String)var9_9, (String)var10_13);
                                            }
                                            var19_22 = Qj0.b(var19_22, (String)var9_9);
                                            var9_9 = var35_35.getBrickName();
                                            if (var9_9 == null) {
                                                var9_9 = var13_16;
                                            }
                                            if ((var11_14 = (int)TextUtils.isEmpty((CharSequence)var9_9)) != 0) {
                                                var9_9 = var13_16;
                                            } else {
                                                var9_9 = var35_35.getBrickName();
                                                var41_40 = xx_2.h(var2_2);
                                                var10_13 = var22_25 == var41_40 ? var13_16 : var8_8;
                                                var9_9 = Ft2.a((String)var9_9, (String)var10_13);
                                            }
                                            var15_18 = Qj0.b(var15_18, (String)var9_9);
                                            var9_9 = var35_35.getBrickCategory();
                                            if (var9_9 == null) {
                                                var9_9 = var13_16;
                                            }
                                            if ((var11_14 = (int)TextUtils.isEmpty((CharSequence)var9_9)) != 0) {
                                                var9_9 = var13_16;
lbl128:
                                                // 2 sources

                                                while (true) {
                                                    var10_13 = var20_23;
                                                    var20_23 = Qj0.b(var20_23, (String)var9_9);
                                                    if (var6_6 == 0) break block56;
                                                    break block57;
                                                    break;
                                                }
                                            }
                                            var9_9 = var35_35.getBrickCategory();
                                            var41_40 = xx_2.h(var2_2);
                                            var10_13 = var22_25 == var41_40 ? var13_16 : var8_8;
                                            var9_9 = Ft2.a((String)var9_9, (String)var10_13);
                                            ** continue;
                                        }
                                        var11_14 = var34_34.getReturnOrderEntry().getQuantity();
                                        var25_28 += var11_14;
                                        var9_9 = var35_35.getVerticalName();
                                        if (var9_9 == null) {
                                            var9_9 = var13_16;
                                        }
                                        if ((var11_14 = (int)TextUtils.isEmpty((CharSequence)var9_9)) != 0) {
                                            var9_9 = var13_16;
                                        } else {
                                            var9_9 = var35_35.getVerticalName();
                                            var41_40 = xx_2.h(var2_2);
                                            var10_13 = var22_25 == var41_40 ? var13_16 : var8_8;
                                            var9_9 = Ft2.a((String)var9_9, (String)var10_13);
                                        }
                                        var14_17 = Qj0.b(var14_17, (String)var9_9);
                                        var9_9 = var35_35.getBrickName();
                                        if (var9_9 == null) {
                                            var9_9 = var13_16;
                                        }
                                        if ((var11_14 = (int)TextUtils.isEmpty((CharSequence)var9_9)) != 0) {
                                            var9_9 = var13_16;
                                        } else {
                                            var9_9 = var35_35.getBrickName();
                                            var41_40 = xx_2.h(var2_2);
                                            var10_13 = var22_25 == var41_40 ? var13_16 : var8_8;
                                            var9_9 = Ft2.a((String)var9_9, (String)var10_13);
                                        }
                                        var16_19 = Qj0.b(var16_19, (String)var9_9);
                                        var9_9 = var35_35.getBrickCategory();
                                        if (var9_9 == null) {
                                            var9_9 = var13_16;
                                        }
                                        if ((var11_14 = (int)TextUtils.isEmpty((CharSequence)var9_9)) != 0) {
                                            var9_9 = var13_16;
                                        } else {
                                            var9_9 = var35_35.getBrickCategory();
                                            var41_40 = xx_2.h(var2_2);
                                            if (var22_25 == var41_40) {
                                                var8_8 = var13_16;
                                            }
                                            var9_9 = Ft2.a((String)var9_9, (String)var8_8);
                                        }
                                        var8_8 = var21_24;
                                        var21_24 = Qj0.b(var21_24, (String)var9_9);
                                        break block63;
                                    }
                                    var8_8 = var21_24;
                                }
                                if (var6_6 != 0) {
                                    var9_9 = var34_34.getReturnOrderEntry();
                                    if (var9_9 != null && (var9_9 = var9_9.getBasePrice()) != null) {
                                        var38_38 = var9_9.getValue();
                                        var33_33 = Float.valueOf(var38_38);
                                    }
                                    if (var33_33 != null) {
                                        var9_9 = var34_34.getReturnOrderEntry().getBasePrice();
                                        var38_38 = var9_9.getValue();
                                        var42_41 = var38_38;
                                        var28_30 += var42_41;
                                    }
                                }
                                var8_8 = var2_2;
                                var10_13 = var4_4;
                                var22_25 = var32_32;
                                var6_6 = 1;
                                var7_7 = 1.4E-45f;
                            }
                            var10_13 = var20_23;
                            var8_8 = var21_24;
                            try {
                                var9_9 = var4_4.getTotalPrice();
                                if (var9_9 == null) break block58;
                                var38_38 = var9_9.getValue();
                                break block59;
                            }
                            catch (NumberFormatException var9_11) {
                                var12_15 = yn3_0.a;
                                var12_15.e(var9_11);
                            }
                        }
                        var11_14 = 0;
                        var38_38 = 0.0f;
                        var9_9 = null;
                    }
                    var44_42 = (char)-1;
                    var23_26 = new AppsFlyerEventsItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var44_42, null);
                    var12_15 = h40_0.a;
                    var45_43 = h40_0.Q0();
                    if (var45_43) {
                        var9_9 = String.valueOf(var38_38);
                        var23_26.setRevenue((String)var9_9);
                        var12_15 = var8_8;
                    } else {
                        if (var3_3 != null) {
                            var38_38 = var3_3.floatValue();
                            var12_15 = var8_8;
                            var46_44 = var38_38;
                        } else {
                            var12_15 = var8_8;
                            var46_44 = 0.0;
                        }
                        var9_9 = String.valueOf(var46_44);
                        var23_26.setRevenue((String)var9_9);
                    }
                    var11_14 = var17_20.length();
                    if (var11_14 <= 0) ** GOTO lbl-1000
                    var11_14 = le3_2.D((CharSequence)var17_20);
                    var6_6 = 44;
                    var7_7 = 6.2E-44f;
                    if (var11_14 == var6_6) {
                        var9_9 = le3_2.C((String)var17_20);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var9_9 = var17_20;
                    }
                    var23_26.setContentId((String)var9_9);
                    var23_26.setContentType(var19_22);
                    var23_26.setCurrency("INR");
                    var9_9 = String.valueOf(var24_27);
                    var23_26.setQuantity((String)var9_9);
                    var23_26.setOrderId(var5_5);
                    var23_26.setSegment((String)var10_13);
                    var23_26.setBrick(var15_18);
                    var23_26.setLuxeProductIds(var18_21);
                    var9_9 = String.valueOf(var25_28);
                    var23_26.setLuxeCartQuantity((String)var9_9);
                    var23_26.setLuxeBrickType(var16_19);
                    var23_26.setLuxeSegmentType((String)var12_15);
                    var23_26.setLuxeContentType(var14_17);
                    try {
                        var9_9 = var4_4.getLuxeTotalPrice();
                        if (var9_9 == null) break block60;
                        var7_7 = var9_9.getValue();
                        break block61;
                    }
                    catch (NumberFormatException var9_12) {
                        var37_37 = yn3_0.a;
                        var37_37.e(var9_12);
                    }
                }
                var6_6 = 0;
                var7_7 = 0.0f;
                var37_37 = null;
            }
            var9_9 = h40_0.a;
            var11_14 = (int)h40_0.Q0();
            if (var11_14 != 0) {
                var9_9 = String.valueOf(var7_7);
                var23_26.setLuxeTotalRevenue((String)var9_9);
            } else {
                var42_41 = var28_30 + var30_31;
                var9_9 = String.valueOf(var42_41);
                var23_26.setLuxeTotalRevenue((String)var9_9);
            }
            if (var5_5 != null) {
                var37_37 = AppsFlyerEvents.INSTANCE;
                if (var3_3 != null) {
                    var38_38 = var3_3.floatValue();
                    var39_39 = var38_38;
                } else {
                    var39_39 = 0.0;
                }
                var48_45 = var26_29 + var30_31;
                var30_31 = var28_30 + var30_31;
                var50_46 = 0.0;
                var11_14 = (int)(var28_30 == var50_46 ? 0 : (var28_30 < var50_46 ? -1 : 1));
                if (var11_14 == 0) {
                    var52_47 = true;
                } else {
                    var52_47 = false;
                    var36_36 = null;
                }
                var53_48 = var52_47 ^ true;
                var9_9 = var30_31;
                var15_18 = "return";
                var13_16 = var17_20;
                var5_5 = var1_1;
                var17_20 = var9_9;
                var37_37.pushPurchaseRefund(var39_39, var48_45, var13_16, var1_1, var15_18, var53_48, (Double)var9_9, var23_26);
            }
        }
    }

    public final void pushSelectContentEventForFleek(String string2, String string3, String string4, String string5, String string6, String string7) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "prevScreenName");
        Intrinsics.checkNotNullParameter(string4, "itemId");
        Intrinsics.checkNotNullParameter(string5, "itemName");
        Intrinsics.checkNotNullParameter(string6, "creativeName");
        Intrinsics.checkNotNullParameter(string7, "creativeSlot");
        this.pushSelectContentEventForFleekGAV4(string2, string3, string4, string5, string6, string7);
    }

    public final void pushSelectContentEventForFleekIngress(String string2, String string3, String string4, String string5, String string6, String string7, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "prevScreenName");
        Intrinsics.checkNotNullParameter(string4, "bannerId");
        Intrinsics.checkNotNullParameter(string5, "bannerName");
        Intrinsics.checkNotNullParameter(string6, "creativeName");
        Intrinsics.checkNotNullParameter(string7, "creativeSlot");
        this.pushSelectContentEventForFleekIngressGAV4(string2, string3, string4, string5, string6, string7, bl2);
    }

    public final void pushSelectContentEventForThirdPartyBanner(String string2, String string3, String string4, String string5, String string6, String string7) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "prevScreenName");
        Intrinsics.checkNotNullParameter(string4, "itemId");
        Intrinsics.checkNotNullParameter(string5, "itemName");
        Intrinsics.checkNotNullParameter(string6, "creativeName");
        Intrinsics.checkNotNullParameter(string7, "creativeSlot");
        this.pushSelectContentEventForThirdPartyBannerGAV4(string2, string3, string4, string5, string6, string7);
    }

    public final void pushSelectContentProductImpressionForFleek(String string2, String string3, String string4, String string5, String string6, Product product, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "prevScreenName");
        Intrinsics.checkNotNullParameter(string4, "customDimensionKey");
        this.pushSelectContentProductImpressionForFleekGAV4(string2, string3, string4, string5, string6, product, bl2);
    }

    public final void setCurrentScreen(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.currentScreen = string2;
    }

    public final void setCurrentScreenType(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.currentScreenType = string2;
    }

    public final void setPrevScreen(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.prevScreen = string2;
    }

    public final void setPrevScreenType(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.prevScreenType = string2;
    }

    public final void setPreviosScreen(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(string3, "screenType");
        String string4 = this.currentScreen;
        boolean bl2 = string2.equals(string4);
        if (!bl2) {
            this.prevScreen = string4 = this.currentScreen;
            this.prevScreenType = string4 = this.currentScreenType;
            this.currentScreen = string2;
            this.currentScreenType = string3;
        }
    }

    public final void setPreviousScreenData(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "currScreen");
        Intrinsics.checkNotNullParameter(string3, "currScreenType");
    }

    public final String[] trimProductId(String object) {
        int n3;
        String string2;
        int n4 = 2;
        Object object2 = new String[n4];
        object2[0] = string2 = "";
        int n7 = 1;
        object2[n7] = string2;
        int n8 = TextUtils.isEmpty((CharSequence)object);
        if (n8 != 0) {
            return object2;
        }
        Intrinsics.checkNotNull(object);
        n8 = ((String)object).length();
        int n10 = 10;
        if (n8 == n10) {
            object2[0] = object;
            object2[n7] = string2;
        } else {
            n8 = ((String)object).length();
            if (n8 > (n10 = 9)) {
                String string3 = "_";
                boolean bl2 = StringsKt.F((CharSequence)object, string3, false);
                if (bl2) {
                    object2 = new String[]{string3};
                    n10 = 6;
                    object = StringsKt.a0((CharSequence)object, object2, false, 0, n10);
                    object2 = new String[]{};
                    object = object.toArray((T[])object2);
                    object2 = object;
                    object2 = (String[])object;
                } else {
                    String string4 = ((String)object).substring(0, n10);
                    String string5 = "substring(...)";
                    Intrinsics.checkNotNullExpressionValue(string4, string5);
                    object2[0] = string4;
                    object = ((String)object).substring(n10);
                    Intrinsics.checkNotNullExpressionValue(object, string5);
                    object2[n7] = object;
                }
                object = object2[n7];
                n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                if (n3 == 0) {
                    object = object2[n7];
                    Intrinsics.checkNotNull(object);
                    n3 = (int)(b.s((String)object, string3, false) ? 1 : 0);
                    if (n3 != 0) {
                        object = object2[n7];
                        Intrinsics.checkNotNull(object);
                        Regex regex = new Regex(string3);
                        object2[n7] = object = regex.d((String)object);
                    }
                }
            } else {
                object2[0] = object;
            }
        }
        n3 = ((String[])object2).length;
        if (n3 > n7 && (n3 = (int)(TextUtils.isEmpty((CharSequence)(object = object2[n7])) ? 1 : 0)) != 0) {
            object2[n7] = string2;
        } else {
            n3 = ((String[])object2).length;
            if (n3 < n4) {
                String string6;
                object = new String[n4];
                object[0] = string6 = object2[0];
                object[n7] = string2;
                object2 = object;
            }
        }
        return object2;
    }
}

