/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.provider.Settings$Secure
 *  android.text.TextUtils
 */
package com.ril.ajio.analytics.events;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.analytics.Tracker;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.constants.AnalyticsValues;
import com.ril.ajio.analytics.events.AppsFlyerEvents;
import com.ril.ajio.analytics.events.Ga4Events;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.events.enum.AppsFlyerEventsItem;
import com.ril.ajio.analytics.utils.GAUtils;
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.services.data.Cart.CartAppliedVoucher;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.ServicabilityInfo;
import com.ril.ajio.services.data.Cart.ServicabilityInfo$PriorityDelivery;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.AdsData;
import com.ril.ajio.services.data.Product.CategoryTags;
import com.ril.ajio.services.data.Product.Config;
import com.ril.ajio.services.data.Product.PriceReveal;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.ProductfnlProductData;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.Product.Tag;
import com.ril.ajio.services.data.Product.TagPrimary;
import com.ril.ajio.services.data.Product.TagResponse;
import com.ril.ajio.services.data.user.UserInformation;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class GAEcommerceEvents {
    public static final int $stable = 0;
    private static final String CONTAINS_LUXE = "contains_luxe";
    private static final String CONTAINS_STORE = "contains_store";
    public static final String DIMEN_19 = "dimension19";
    public static final String DIMEN_20 = "dimension20";
    public static final String DIMEN_BARGAIN_TAG_NAME = "dimension162";
    private static final String DIMEN_DELIVERY_TAG = "dimension37";
    public static final String DIMEN_MRP = "dimension16";
    private static final String DIMEN_PRODUCT_EDD = "dimension18";
    public static final String DIMEN_SALE_PRICE = "dimension139";
    public static final String DIMEN_SELLING_POINT_TAG_NAME = "dimension161";
    public static final String DIMEN_SIZE = "dimension23";
    public static final String DIMEN_WISHLIST_COUNT = "dimension169";
    public static final String DIMEN_WISHLIST_STATE = "dimension145";
    private static final String DISCOUNT = "metric50";
    private static final String EVENT_ACTION = "event_action";
    private static final String EVENT_CATEGORY = "event_category";
    private static final String EVENT_LABEL = "event_label";
    private static final String GTM_EVENT_BUTTON_TAP = "buttonTap";
    public static final GAEcommerceEvents INSTANCE;
    private static final String MRP = "metric49";
    private static final String PRODUCT_BRAND = "product_brand";
    public static final String PRODUCT_BRICK = "dimension46";
    private static final String PRODUCT_CATEGORY = "product_category";
    private static final String PRODUCT_DISCOUNT = "dimension192";
    private static final String PRODUCT_ID = "product_id";
    public static final String PRODUCT_MRP = "dimension16";
    private static final String PRODUCT_PORTFOLIO = "dimension44";
    public static final String PRODUCT_SEGMENT = "dimension43";
    private static final String PRODUCT_TEASER_TAGS = "dimension42";
    public static final String PRODUCT_TYPE = "dimension17";
    public static final String PRODUCT_VERTICLE = "dimension45";
    private static final String SCREEN_KEY = "screenname";
    private static final String STORE_SOURCE_ID_OLD = "dimension148";
    private static final String TRADE_DISCOUNT = "metric51";
    public static final String USER_TYPE = "user_type";
    private static final jo_2 appPreferences;
    private static final rq1_2 catalogAjiogramBrandValues$delegate;
    private static final rq1_2 catalogLuxuryBrandValues$delegate;
    private static final NewEEcommerceEventsRevamp newEEcommerceeventsRevamp;
    private static final rq1_2 segmentIds$delegate;
    private static final rq1_2 userInformation$delegate;

    static {
        Object object = new GAEcommerceEvents();
        INSTANCE = object;
        newEEcommerceeventsRevamp = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp();
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        appPreferences = object = new jo_2((Context)aJIOApplication);
        object = new Object();
        userInformation$delegate = yr1_2.b((Function0)object);
        object = new Object();
        catalogLuxuryBrandValues$delegate = yr1_2.b((Function0)object);
        object = new Object();
        catalogAjiogramBrandValues$delegate = yr1_2.b((Function0)object);
        object = new Object();
        segmentIds$delegate = yr1_2.b((Function0)object);
        $stable = 8;
    }

    private GAEcommerceEvents() {
    }

    public static /* synthetic */ Unit a(Product product, int n3, String string2) {
        return GAEcommerceEvents.pushAddRemoveCartItemGAV4$lambda$31(product, n3, string2);
    }

    public static final void addProductInfo(Product product, Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        INSTANCE.addProductInfoGAV4(product, bundle);
    }

    private final void addProductInfoGAV4(Product product, Bundle bundle) {
        int n3;
        int n4;
        int n7;
        Object object;
        String string2 = null;
        if (product != null) {
            object = product.getSegmentNameText();
        } else {
            n7 = 0;
            object = null;
        }
        String string3 = "item_category";
        Object object2 = PRODUCT_SEGMENT;
        String string4 = "";
        if (object != null && (n7 = ((String)object).length()) != 0) {
            object = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object2);
            if (product != null) {
                object2 = product.getSegmentNameText();
            } else {
                n4 = 0;
                object2 = null;
            }
            bundle.putString((String)object, (String)object2);
            if (product != null) {
                object = product.getSegmentNameText();
            } else {
                n7 = 0;
                object = null;
            }
            bundle.putString(string3, (String)object);
        } else {
            object = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object2);
            if (product != null) {
                object2 = product.getBrickCategory();
            } else {
                n4 = 0;
                object2 = null;
            }
            if (object2 != null && (n4 = ((String)object2).length()) != 0) {
                if (product != null) {
                    object2 = product.getBrickCategory();
                } else {
                    n4 = 0;
                    object2 = null;
                }
            } else {
                object2 = string4;
            }
            bundle.putString((String)object, (String)object2);
            if (product != null) {
                object = product.getBrickCategory();
            } else {
                n7 = 0;
                object = null;
            }
            if (object != null && (n7 = ((String)object).length()) != 0) {
                if (product != null) {
                    object = product.getBrickCategory();
                } else {
                    n7 = 0;
                    object = null;
                }
            } else {
                object = string4;
            }
            bundle.putString(string3, (String)object);
        }
        if (product != null) {
            object = product.getVerticalNameText();
        } else {
            n7 = 0;
            object = null;
        }
        string3 = "item_category2";
        object2 = PRODUCT_VERTICLE;
        if (object != null && (n7 = ((String)object).length()) != 0) {
            object = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object2);
            if (product != null) {
                object2 = product.getVerticalNameText();
            } else {
                n4 = 0;
                object2 = null;
            }
            bundle.putString((String)object, (String)object2);
            if (product != null) {
                object = product.getVerticalNameText();
            } else {
                n7 = 0;
                object = null;
            }
            bundle.putString(string3, (String)object);
        } else {
            object = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object2);
            if (product != null) {
                object2 = product.getBrickSubCategory();
            } else {
                n4 = 0;
                object2 = null;
            }
            if (object2 != null && (n4 = ((String)object2).length()) != 0) {
                if (product != null) {
                    object2 = product.getBrickSubCategory();
                } else {
                    n4 = 0;
                    object2 = null;
                }
            } else {
                object2 = string4;
            }
            bundle.putString((String)object, (String)object2);
            if (product != null) {
                object = product.getBrickSubCategory();
            } else {
                n7 = 0;
                object = null;
            }
            if (object != null && (n7 = ((String)object).length()) != 0) {
                if (product != null) {
                    object = product.getBrickSubCategory();
                } else {
                    n7 = 0;
                    object = null;
                }
            } else {
                object = string4;
            }
            bundle.putString(string3, (String)object);
        }
        if (product != null) {
            object = product.getBrickNameText();
        } else {
            n7 = 0;
            object = null;
        }
        string3 = "item_category3";
        object2 = PRODUCT_BRICK;
        if (object != null && (n7 = ((String)object).length()) != 0) {
            object = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object2);
            if (product != null) {
                object2 = product.getBrickNameText();
            } else {
                n4 = 0;
                object2 = null;
            }
            bundle.putString((String)object, (String)object2);
            if (product != null) {
                object = product.getBrickNameText();
            } else {
                n7 = 0;
                object = null;
            }
            bundle.putString(string3, (String)object);
        } else {
            object = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object2);
            if (product != null) {
                object2 = product.getBrickName();
            } else {
                n4 = 0;
                object2 = null;
            }
            if (object2 != null && (n4 = ((String)object2).length()) != 0) {
                if (product != null) {
                    object2 = product.getBrickName();
                } else {
                    n4 = 0;
                    object2 = null;
                }
            } else {
                object2 = string4;
            }
            bundle.putString((String)object, (String)object2);
            if (product != null) {
                object = product.getBrickName();
            } else {
                n7 = 0;
                object = null;
            }
            if (object != null && (n7 = ((String)object).length()) != 0) {
                if (product != null) {
                    object = product.getBrickName();
                } else {
                    n7 = 0;
                    object = null;
                }
            } else {
                object = string4;
            }
            bundle.putString(string3, (String)object);
        }
        if (product != null && (object = product.getFnlColorVariantData()) != null) {
            object = ((ProductFnlColorVariantData)object).getBrandName();
        } else {
            n7 = 0;
            object = null;
        }
        if (object != null && (n7 = ((String)object).length()) != 0) {
            if (product != null && (object = product.getFnlColorVariantData()) != null) {
                object = ((ProductFnlColorVariantData)object).getBrandName();
            } else {
                n7 = 0;
                object = null;
            }
        } else {
            object = string4;
        }
        bundle.putString(PRODUCT_BRAND, (String)object);
        object = Ga4Events.INSTANCE;
        string3 = (String)((Ga4Events)object).getGav4DimensionMap().get(PRODUCT_PORTFOLIO);
        bundle.putString(string3, string4);
        string3 = (String)((Ga4Events)object).getGav4DimensionMap().get("dimension16");
        cp_1.Companion.getClass();
        object2 = cp$a.e();
        object2.getClass();
        double d2 = cp_1.x(product);
        bundle.putDouble(string3, d2);
        if (product != null) {
            string3 = product.getAggregateRating();
        } else {
            n3 = 0;
            string3 = null;
        }
        if (string3 != null && (n3 = string3.length()) != 0) {
            object = ((Ga4Events)object).getGav4DimensionMap();
            string3 = LD2.b;
            object = (String)object.get(string3);
            if (product != null) {
                string2 = product.getAggregateRating();
            }
            bundle.putString((String)object, string2);
        }
    }

    public static /* synthetic */ String b() {
        return GAEcommerceEvents.catalogAjiogramBrandValues_delegate$lambda$2();
    }

    public static /* synthetic */ String c() {
        return GAEcommerceEvents.segmentIds_delegate$lambda$3();
    }

    private static final String catalogAjiogramBrandValues_delegate$lambda$2() {
        Object object = h40_0.a;
        object = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("catalog_ajiogram_brand_list");
    }

    private static final String catalogLuxuryBrandValues_delegate$lambda$1() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.b("catalog_luxury_brand_list");
    }

    public static /* synthetic */ UserInformation d() {
        return GAEcommerceEvents.userInformation_delegate$lambda$0();
    }

    public static /* synthetic */ String e() {
        return GAEcommerceEvents.catalogLuxuryBrandValues_delegate$lambda$1();
    }

    private final String getCatalogAjiogramBrandValues() {
        return (String)catalogAjiogramBrandValues$delegate.getValue();
    }

    private final String getCatalogLuxuryBrandValues() {
        return (String)catalogLuxuryBrandValues$delegate.getValue();
    }

    private final Tracker getGoogleTracker() {
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        Intrinsics.checkNotNullParameter(object, "context");
        ZX0 zX0 = ZX0.b;
        if (zX0 == null) {
            ZX0.b = zX0 = new ZX0((AJIOApplication)object);
        }
        object = ZX0.b;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ajio.ril.core.analytics.GATracker");
        return ((ZX0)object).a;
    }

    private final String getSegmentIds() {
        return (String)segmentIds$delegate.getValue();
    }

    private final String getUserId() {
        AJIOApplication.Companion.getClass();
        String string2 = UserInformation.getInstance((Context)AJIOApplication$a.a()).getEncryptedUuid();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            string2 = "N/A";
        } else {
            cp_1.Companion.getClass();
            cp_1 cp_12 = cp$a.e();
            cp_12.getClass();
            string2 = cp_1.L(string2);
        }
        return string2;
    }

    public static /* synthetic */ void pushAddRemoveCartItem$default(GAEcommerceEvents gAEcommerceEvents, Product product, String string2, String string3, int n3, String string4, String string5, boolean bl2, String string6, String string7, String string8, String string9, String string10, boolean bl3, int n4, Object object) {
        boolean bl4;
        int n7 = n4;
        int n8 = n4 & 0x100;
        String string11 = "";
        String string12 = n8 != 0 ? string11 : string7;
        n8 = n7 & 0x200;
        String string13 = n8 != 0 ? string11 : string8;
        if ((n7 &= 0x1000) != 0) {
            n7 = 0;
            bl4 = false;
        } else {
            bl4 = bl3;
        }
        gAEcommerceEvents.pushAddRemoveCartItem(product, string2, string3, n3, string4, string5, bl2, string6, string12, string13, string9, string10, bl4);
    }

    private final void pushAddRemoveCartItemGAV4(Product product, String string2, String string3, int n3, String string4, String string5, boolean bl2, String string6, String string7, String string8, String string9, String string10, boolean bl3) {
        int n4;
        int n7;
        int n8;
        double d2;
        Object object = product;
        int n10 = n3;
        Object object2 = string6;
        Object object3 = string9;
        Object object4 = string2;
        Object object5 = this.trimProductId(string2);
        String string11 = null;
        object4 = object5[0];
        boolean bl4 = TextUtils.isEmpty((CharSequence)object4);
        if (bl4) {
            return;
        }
        try {
            d2 = Double.parseDouble(string4);
        }
        catch (NumberFormatException numberFormatException) {
            object4 = yn3_0.a;
            ((yn3$a)object4).e(numberFormatException);
            d2 = 0.0;
        }
        object4 = new Bundle();
        GAEcommerceEvents.addProductInfo((Product)object, (Bundle)object4);
        int n14 = TextUtils.isEmpty((CharSequence)string7);
        Object object6 = "";
        Object object7 = n14 != 0 ? object6 : string7;
        String string12 = PRODUCT_CATEGORY;
        object4.putString(string12, (String)object7);
        n14 = TextUtils.isEmpty((CharSequence)string5);
        object7 = n14 != 0 ? object6 : string5;
        string12 = PRODUCT_BRAND;
        object4.putString(string12, (String)object7);
        object7 = object5[0];
        n14 = TextUtils.isEmpty((CharSequence)object7);
        object7 = n14 != 0 ? object6 : object5[0];
        string12 = "item_id";
        object4.putString(string12, (String)object7);
        n14 = TextUtils.isEmpty((CharSequence)string3);
        object7 = n14 != 0 ? object6 : string3;
        string12 = "item_name";
        object4.putString(string12, (String)object7);
        n14 = 0;
        object7 = null;
        if (object != null) {
            string12 = product.getSegmentNameText();
        } else {
            n8 = 0;
            string12 = null;
        }
        Object object8 = "item_category";
        String string13 = PRODUCT_SEGMENT;
        if (string12 != null && (n8 = string12.length()) != 0) {
            string12 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(string13);
            if (object != null) {
                string13 = product.getSegmentNameText();
            } else {
                n7 = 0;
                string13 = null;
            }
            object4.putString(string12, string13);
            if (object != null) {
                string12 = product.getSegmentNameText();
            } else {
                n8 = 0;
                string12 = null;
            }
            object4.putString((String)object8, string12);
        } else {
            string12 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(string13);
            if (object != null) {
                string13 = product.getBrickCategory();
            } else {
                n7 = 0;
                string13 = null;
            }
            if (string13 != null && (n7 = string13.length()) != 0) {
                if (object != null) {
                    string13 = product.getBrickCategory();
                } else {
                    n7 = 0;
                    string13 = null;
                }
            } else {
                string13 = object6;
            }
            object4.putString(string12, string13);
            if (object != null) {
                string12 = product.getBrickCategory();
            } else {
                n8 = 0;
                string12 = null;
            }
            if (string12 != null && (n8 = string12.length()) != 0) {
                if (object != null) {
                    string12 = product.getBrickCategory();
                } else {
                    n8 = 0;
                    string12 = null;
                }
            } else {
                string12 = object6;
            }
            object4.putString((String)object8, string12);
        }
        if (object != null) {
            string12 = product.getVerticalNameText();
        } else {
            n8 = 0;
            string12 = null;
        }
        object8 = "item_category2";
        string13 = PRODUCT_VERTICLE;
        if (string12 != null && (n8 = string12.length()) != 0) {
            string12 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(string13);
            if (object != null) {
                string13 = product.getVerticalNameText();
            } else {
                n7 = 0;
                string13 = null;
            }
            object4.putString(string12, string13);
            if (object != null) {
                string12 = product.getVerticalNameText();
            } else {
                n8 = 0;
                string12 = null;
            }
            object4.putString((String)object8, string12);
        } else {
            string12 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(string13);
            if (object != null) {
                string13 = product.getBrickSubCategory();
            } else {
                n7 = 0;
                string13 = null;
            }
            if (string13 != null && (n7 = string13.length()) != 0) {
                if (object != null) {
                    string13 = product.getBrickSubCategory();
                } else {
                    n7 = 0;
                    string13 = null;
                }
            } else {
                string13 = object6;
            }
            object4.putString(string12, string13);
            if (object != null) {
                string12 = product.getBrickSubCategory();
            } else {
                n8 = 0;
                string12 = null;
            }
            if (string12 != null && (n8 = string12.length()) != 0) {
                if (object != null) {
                    string12 = product.getBrickSubCategory();
                } else {
                    n8 = 0;
                    string12 = null;
                }
            } else {
                string12 = object6;
            }
            object4.putString((String)object8, string12);
        }
        if (object != null) {
            string12 = product.getBrickNameText();
        } else {
            n8 = 0;
            string12 = null;
        }
        object8 = "item_category3";
        string13 = PRODUCT_BRICK;
        if (string12 != null && (n8 = string12.length()) != 0) {
            string12 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(string13);
            if (object != null) {
                string13 = product.getBrickNameText();
            } else {
                n7 = 0;
                string13 = null;
            }
            object4.putString(string12, string13);
            if (object != null) {
                string12 = product.getBrickNameText();
            } else {
                n8 = 0;
                string12 = null;
            }
            object4.putString((String)object8, string12);
        } else {
            string12 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(string13);
            if (object != null) {
                string13 = product.getBrickName();
            } else {
                n7 = 0;
                string13 = null;
            }
            if (string13 != null && (n7 = string13.length()) != 0) {
                if (object != null) {
                    string13 = product.getBrickName();
                } else {
                    n7 = 0;
                    string13 = null;
                }
            } else {
                string13 = object6;
            }
            object4.putString(string12, string13);
            if (object != null) {
                string12 = product.getBrickName();
            } else {
                n8 = 0;
                string12 = null;
            }
            if (string12 != null && (n8 = string12.length()) != 0) {
                if (object != null) {
                    string12 = product.getBrickName();
                } else {
                    n8 = 0;
                    string12 = null;
                }
            } else {
                string12 = object6;
            }
            object4.putString((String)object8, string12);
        }
        string12 = "index";
        object4.putInt(string12, 0);
        n8 = 1;
        object8 = object5[n8];
        int n15 = TextUtils.isEmpty((CharSequence)object8);
        object5 = n15 != 0 ? object6 : object5[n8];
        string12 = "item_variant";
        object4.putString(string12, (String)object5);
        boolean bl5 = TextUtils.isEmpty((CharSequence)string5);
        if (!bl5) {
            bl5 = TextUtils.isEmpty((CharSequence)string5);
            if (!bl5) {
                object6 = string5;
            }
            object5 = "item_brand";
            object4.putString((String)object5, (String)object6);
        }
        object4.putDouble("price", d2);
        object4.putString("currency", "INR");
        long l2 = n10;
        object4.putLong("quantity", l2);
        object5 = Ga4Events.INSTANCE;
        object6 = ((Ga4Events)object5).getGav4DimensionMap();
        string12 = STORE_SOURCE_ID_OLD;
        object6 = (String)object6.get(string12);
        if (object == null || (string12 = product.getCatalogName()) == null) {
            if (object != null) {
                string12 = product.getCatalog();
            } else {
                n8 = 0;
                string12 = null;
            }
        }
        string12 = this.getStoreTypeFromCatalog(string12);
        object4.putString((String)object6, string12);
        if (object != null) {
            object6 = product.getAggregateRating();
        } else {
            n4 = 0;
            object6 = null;
        }
        if (object6 != null && (n4 = ((String)object6).length()) != 0) {
            object6 = ((Ga4Events)object5).getGav4DimensionMap();
            string12 = LD2.b;
            object6 = (String)object6.get(string12);
            if (object != null) {
                string12 = product.getAggregateRating();
            } else {
                n8 = 0;
                string12 = null;
            }
            object4.putString((String)object6, string12);
        }
        cp_1.Companion.getClass();
        object6 = cp$a.e();
        if (object != null) {
            string12 = product.getSegmentId();
        } else {
            n8 = 0;
            string12 = null;
        }
        if (object != null) {
            object8 = product.getExperimentId();
        } else {
            n15 = 0;
            object8 = null;
        }
        object6.getClass();
        object6 = cp_1.A(string12, (String)object8);
        string12 = DIMEN_20;
        if (object6 != null) {
            object8 = (String)((Ga4Events)object5).getGav4DimensionMap().get(string12);
            object4.putString((String)object8, (String)object6);
        }
        if ((object6 = this.getSegmentIds()) != null && (n4 = ((String)object6).length()) != 0) {
            object6 = (String)((Ga4Events)object5).getGav4DimensionMap().get(PRODUCT_DISCOUNT);
            object8 = cp$a.e();
            object8.getClass();
            double d5 = cp_1.w(product);
            object4.putDouble((String)object6, d5);
        }
        object6 = DIMEN_SIZE;
        if (object3 != null && (n15 = string9.length()) != 0) {
            object8 = ((Ga4Events)object5).getGav4DimensionMap();
            object6 = (String)object8.get(object6);
            object4.putString((String)object6, (String)object3);
        } else {
            object3 = (String)((Ga4Events)object5).getGav4DimensionMap().get(object6);
            object6 = cp$a.e();
            if (object != null) {
                object8 = product.getSelectedSizeVariant();
            } else {
                n15 = 0;
                object8 = null;
            }
            object6.getClass();
            if (object8 != null) {
                object6 = Y63.c((ProductOptionVariant)object8);
            } else {
                n4 = 0;
                object6 = null;
            }
            object4.putString((String)object3, (String)object6);
        }
        object3 = cp$a.e();
        if (object != null) {
            object6 = product.getSegmentId();
        } else {
            n4 = 0;
            object6 = null;
        }
        if (object != null) {
            object7 = product.getExperimentId();
        }
        object3.getClass();
        object3 = cp_1.A((String)object6, (String)object7);
        if (object3 != null) {
            object7 = (String)((Ga4Events)object5).getGav4DimensionMap().get(string12);
            object4.putString((String)object7, (String)object3);
        }
        object3 = new Bundle();
        n14 = string8.length();
        object6 = EVENT_CATEGORY;
        if (n14 > 0) {
            object7 = string8;
            object3.putString((String)object6, string8);
        }
        object7 = this.getSegmentIds();
        string12 = "pricing_cust_seg";
        if (object7 != null && (n14 = ((String)object7).length()) != 0) {
            object7 = this.getSegmentIds();
            object3.putString(string12, (String)object7);
        }
        object7 = hv3_0.a;
        object7.getClass();
        string11 = (String)hv3_0.h((Product)object, (boolean)false).b;
        string11 = bl3 ? mz3_0.m((Product)object, string11) : mz3_0.n((Product)object, string11);
        n14 = string11.length();
        if (n14 > 0) {
            object5 = ((Ga4Events)object5).getGav4DimensionMap();
            object7 = DIMEN_BARGAIN_TAG_NAME;
            object5 = (String)object5.get(object7);
            object3.putString((String)object5, string11);
        }
        object3.putString(SCREEN_KEY, (String)object2);
        object5 = "screen_name";
        object3.putString((String)object5, (String)object2);
        object2 = "items";
        object3.putBundle((String)object2, (Bundle)object4);
        object4 = this.getSegmentIds();
        if (object4 != null && (bl4 = ((String)object4).length())) {
            object4 = this.getSegmentIds();
            object3.putString(string12, (String)object4);
        }
        bl4 = this.containsLuxe(product);
        object4 = String.valueOf(bl4);
        object3.putString(CONTAINS_LUXE, (String)object4);
        object2 = "true";
        object3.putString("isGA4", (String)object2);
        object3.putDouble("value", d2);
        object3.putString((String)object6, "Enhance E-commerce");
        object4 = EVENT_ACTION;
        if (bl2) {
            object2 = AppsFlyerLib.getInstance();
            AJIOApplication.Companion.getClass();
            object5 = AJIOApplication$a.a();
            object2 = ((AppsFlyerLib)object2).getAppsFlyerUID((Context)object5);
            object5 = "af_id";
            object3.putString((String)object5, (String)object2);
            object2 = "add_to_cart";
            object3.putString((String)object4, (String)object2);
            object4 = od3_2.a();
            this.trackEcommerceEvent((String)object2, (Bundle)object3, (String)object4);
            object4 = AppsFlyerEvents.INSTANCE;
            object3 = string10;
            object2 = new qx0_2((Product)object, n10, string10);
            ((AppsFlyerEvents)object4).wrapper((Function0)object2);
        } else {
            object = "remove_from_cart";
            object3.putString((String)object4, (String)object);
            object4 = od3_2.a();
            this.trackEcommerceEvent((String)object, (Bundle)object3, (String)object4);
        }
    }

    public static /* synthetic */ void pushAddRemoveCartItemGAV4$default(GAEcommerceEvents gAEcommerceEvents, Product product, String string2, String string3, int n3, String string4, String string5, boolean bl2, String string6, String string7, String string8, String string9, String string10, boolean bl3, int n4, Object object) {
        boolean bl4;
        int n7 = n4;
        int n8 = n4 & 0x100;
        String string11 = "";
        String string12 = n8 != 0 ? string11 : string7;
        n8 = n7 & 0x200;
        String string13 = n8 != 0 ? string11 : string8;
        if ((n7 &= 0x1000) != 0) {
            n7 = 0;
            bl4 = false;
        } else {
            bl4 = bl3;
        }
        gAEcommerceEvents.pushAddRemoveCartItemGAV4(product, string2, string3, n3, string4, string5, bl2, string6, string12, string13, string9, string10, bl4);
    }

    private static final Unit pushAddRemoveCartItemGAV4$lambda$31(Product product, int n3, String string2) {
        GAEcommerceEvents gAEcommerceEvents = INSTANCE;
        Integer n4 = n3;
        gAEcommerceEvents.pushAddToCartEventAppsFlyer(product, n4, string2);
        return Unit.a;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void pushAddToCartEventAppsFlyer(Product var1_1, Integer var2_2, String var3_3) {
        block37: {
            block36: {
                block35: {
                    block34: {
                        block33: {
                            var4_4 = var1_1;
                            var5_5 = null;
                            if (var1_1 != null) {
                                try {
                                    var6_6 = var1_1.getPrice();
                                    if (var6_6 == null) break block33;
                                    var6_6 = var6_6.getValue();
                                    break block34;
                                }
                                catch (NumberFormatException var6_7) {
                                    break block35;
                                }
                            }
                        }
                        var7_8 = 0;
                        var6_6 = null;
                    }
                    if (var6_6 == null) break block36;
                    var6_6 = var1_1.getPrice();
                    var8_9 = var6_6 != null && (var6_6 = var6_6.getValue()) != null ? Double.parseDouble((String)var6_6) : 0.0;
                    var10_10 = var8_9;
                    break block37;
                }
                var12_11 = yn3_0.a;
                var12_11.e(var6_7);
            }
            var10_10 = 0.0;
        }
        if (var4_4 != null) {
            var6_6 = var1_1.getBrickCategory();
        } else {
            var7_8 = 0;
            var6_6 = null;
        }
        var7_8 = TextUtils.isEmpty((CharSequence)var6_6);
        var12_11 = "";
        if (var7_8 != 0) {
            var6_6 = var12_11;
        } else if (var4_4 != null) {
            var6_6 = var1_1.getBrickCategory();
        } else {
            var7_8 = 0;
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
            var17_16 = this;
            var5_5 = var3_3;
        } else {
            if (var4_4 != null && (var18_17 = var1_1.getCatalogName()) != null) {
                var17_16 = this;
                var5_5 = var18_17;
            } else {
                if (var4_4 != null) {
                    var5_5 = var1_1.getCatalog();
                }
                var17_16 = this;
            }
            var5_5 = var17_16.getStoreTypeFromCatalog((String)var5_5);
        }
        var19_18 = "luxe".equalsIgnoreCase((String)var5_5);
        cp_1.Companion.getClass();
        var5_5 = cp$a.e();
        var18_17 = String.valueOf(var10_10);
        var20_19 = 0L;
        var22_20 = 0.0;
        if (var2_2 != null) {
            var24_21 = var2_2;
            var25_22 = var24_21;
        } else {
            var25_22 = var20_19;
            var27_23 = var22_20;
        }
        var5_5.getClass();
        var4_4 = cp_1.m((Product)var4_4, (String)var18_17, var25_22);
        var5_5 = AppsFlyerEvents.INSTANCE;
        var18_17 = var6_6 == null ? var12_11 : var6_6;
        if (var13_12 != null) {
            var12_11 = var13_12;
        }
        if (var2_2 != null) {
            var7_8 = var2_2;
            var29_24 = var25_22 = (long)var7_8;
        } else {
            var29_24 = var20_19;
        }
        if (var19_18) {
            var27_23 = var10_10;
        } else {
            var25_22 = 0L;
            var27_23 = 0.0;
        }
        var6_6 = var27_23;
        var13_12 = var5_5;
        var17_16 = var6_6;
        var5_5.pushAddToCartEvent(var10_10, (String)var18_17, (String)var15_14, (String)var12_11, var29_24, var19_18, (Double)var6_6, (AppsFlyerEventsItem)var4_4);
    }

    public static final void pushAjioCashEvent(String object, Float f5, String object2) {
        Intrinsics.checkNotNullParameter(object2, "screenName");
        Bundle bundle = new Bundle();
        String string2 = EVENT_CATEGORY;
        String string3 = GTM_EVENT_BUTTON_TAP;
        bundle.putString(string2, string3);
        bundle.putString(EVENT_ACTION, "ajio money withdraw");
        bundle.putString(SCREEN_KEY, (String)object2);
        bundle.putString("screen_name", (String)object2);
        object2 = INSTANCE;
        String string4 = super.getUserId();
        String string5 = "userId";
        bundle.putString(string5, string4);
        string4 = "Logged_In_Status";
        bundle.putString(string4, (String)object);
        object = ((GAEcommerceEvents)object2).getUserInformation().getClientId();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            object = ((GAEcommerceEvents)object2).getUserInformation().getClientId();
            string4 = "Client_ID";
            bundle.putString(string4, (String)object);
        }
        object = rj_0.b();
        bundle.putString("Time_of_the_day", (String)object);
        object = ((GAEcommerceEvents)object2).getUserInformation().getUserStatus();
        bundle.putString("user_status", (String)object);
        object = new StringBuilder("Withdrawal Money:");
        ((StringBuilder)object).append(f5);
        object = ((StringBuilder)object).toString();
        bundle.putString("Withdrawal_Money", (String)object);
        object = h40_0.a;
        bundle.putString("isGA4", "true");
        bundle.putString(string2, string3);
        super.sendButtonTapEvent(bundle);
    }

    public static final void pushCodPopOpenScreenEvent(int n3, String string2, String string3) {
        Intrinsics.checkNotNullParameter(string3, "screenName");
        Bundle bundle = new Bundle();
        String string4 = "order_value";
        bundle.putInt(string4, n3);
        bundle.putString("pincode", string2);
        bundle.putString("screen_type", "payment screen");
        bundle.putString(SCREEN_KEY, string3);
        bundle.putString("screen_name", string3);
        Object object = INSTANCE;
        string2 = ((GAEcommerceEvents)object).getUserInformation().getClientId();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            string2 = ((GAEcommerceEvents)object).getUserInformation().getClientId();
            string3 = "Client_ID";
            bundle.putString(string3, string2);
        }
        string2 = rj_0.b();
        bundle.putString("Time_of_the_day", string2);
        object = ((GAEcommerceEvents)object).getUserId();
        bundle.putString("userId", (String)object);
        object = h40_0.a;
        object = "isGA4";
        string2 = "true";
        bundle.putString((String)object, string2);
        bundle.putString((String)object, string2);
        GAEcommerceEvents.pushEventBundle("screen_view", bundle);
    }

    public static final void pushEventBundle(String string2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(bundle, "params");
        GAEcommerceEvents.trackEcommerceEvent$default(INSTANCE, string2, bundle, null, 4, null);
    }

    public static final void pushIFSCBottomSheetEvent(String string2, String object) {
        Intrinsics.checkNotNullParameter(object, "screenName");
        Bundle bundle = new Bundle();
        bundle.putString(EVENT_CATEGORY, GTM_EVENT_BUTTON_TAP);
        bundle.putString(EVENT_ACTION, "Information IFSC");
        bundle.putString(EVENT_LABEL, "");
        bundle.putString(SCREEN_KEY, (String)object);
        bundle.putString("screen_name", (String)object);
        object = INSTANCE;
        String string3 = super.getUserId();
        String string4 = "userId";
        bundle.putString(string4, string3);
        string3 = "Logged_In_Status";
        bundle.putString(string3, string2);
        string2 = ((GAEcommerceEvents)object).getUserInformation().getClientId();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            string2 = ((GAEcommerceEvents)object).getUserInformation().getClientId();
            string3 = "Client_ID";
            bundle.putString(string3, string2);
        }
        super.sendButtonTapEvent(bundle);
    }

    public static final void pushIfscEvent(String object, String string2, String string3, String string4, String string5, String string6, String string7) {
        Intrinsics.checkNotNullParameter(object, "eventLabel");
        Intrinsics.checkNotNullParameter(string2, "eventAction");
        Intrinsics.checkNotNullParameter(string3, "screenName");
        Intrinsics.checkNotNullParameter(string5, "eventName");
        String string8 = "ifscValue";
        Bundle bundle = dm_1.a(string6, "eventCategory", string7, string8);
        String string9 = EVENT_CATEGORY;
        bundle.putString(string9, string6);
        string6 = EVENT_LABEL;
        bundle.putString(string6, (String)object);
        bundle.putString(EVENT_ACTION, string2);
        bundle.putString(SCREEN_KEY, string3);
        bundle.putString("screen_name", string3);
        bundle.putString("Logged_In_Status", string4);
        GAEcommerceEvents gAEcommerceEvents = INSTANCE;
        object = gAEcommerceEvents.getUserId();
        string2 = "userId";
        bundle.putString(string2, (String)object);
        object = gAEcommerceEvents.getUserInformation().getClientId();
        int n3 = TextUtils.isEmpty((CharSequence)object);
        if (n3 == 0) {
            object = gAEcommerceEvents.getUserInformation().getClientId();
            string2 = "Client_ID";
            bundle.putString(string2, (String)object);
        }
        if ((n3 = string7.length()) > 0) {
            object = "ifsc_code";
            bundle.putString((String)object, string7);
        }
        object = rj_0.b();
        bundle.putString("Time_of_the_day", (String)object);
        object = gAEcommerceEvents.getUserInformation().getUserStatus();
        bundle.putString("user_status", (String)object);
        object = h40_0.a;
        bundle.putString("isGA4", "true");
        bundle.putString(string9, GTM_EVENT_BUTTON_TAP);
        GAEcommerceEvents.trackEcommerceEvent$default(gAEcommerceEvents, string5, bundle, null, 4, null);
    }

    public static final void pushNotificationEvent(String object, String object2, int n3) {
        String string2;
        Bundle bundle = dm_1.a((String)object, "eventName", (String)object2, "eventAction");
        bundle.putString(EVENT_CATEGORY, GTM_EVENT_BUTTON_TAP);
        String string3 = "notification";
        bundle.putString("screen_type", string3);
        String string4 = EVENT_ACTION;
        bundle.putString(string4, (String)object2);
        object2 = EVENT_LABEL;
        bundle.putString((String)object2, (String)object);
        if (n3 >= 0) {
            object = "position";
            bundle.putInt((String)object, n3);
        }
        bundle.putString(SCREEN_KEY, string3);
        object = INSTANCE;
        object2 = ((GAEcommerceEvents)object).getUserInformation().getClientId();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl2) {
            object2 = ((GAEcommerceEvents)object).getUserInformation().getClientId();
            string2 = "Client_ID";
            bundle.putString(string2, (String)object2);
        }
        object2 = rj_0.b();
        bundle.putString("Time_of_the_day", (String)object2);
        string2 = super.getUserId();
        bundle.putString("userId", string2);
        object2 = h40_0.a;
        bundle.putString("isGA4", "true");
        super.sendButtonTapEvent(bundle);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void pushOrderCancelEventGAV4(String string2, CartEntry cartEntry, String string3, HashMap hashMap) {
        int n3;
        double d2;
        int n4;
        int n7;
        int n8;
        String string4;
        yn3$a yn3$a;
        ArrayList<yn3$a> arrayList;
        int n10;
        Object object;
        Object object2;
        String string5;
        Object object3;
        GAEcommerceEvents gAEcommerceEvents;
        block124: {
            NumberFormatException numberFormatException2;
            block116: {
                block115: {
                    block114: {
                        gAEcommerceEvents = this;
                        object3 = cartEntry;
                        string5 = string3;
                        object2 = hashMap;
                        if (cartEntry != null) {
                            try {
                                object = cartEntry.getBasePrice();
                                if (object == null) break block114;
                                object = ((Price)object).getValue();
                                break block115;
                            }
                            catch (NumberFormatException numberFormatException2) {
                                break block116;
                            }
                        }
                    }
                    n10 = 0;
                    object = null;
                }
                if (object != null) {
                    object = cartEntry.getBasePrice();
                    if (object != null) {
                        object = ((Price)object).getValue();
                    } else {
                        n10 = 0;
                        object = null;
                    }
                    Intrinsics.checkNotNull(object);
                    Double.parseDouble((String)object);
                }
                break block124;
            }
            arrayList = yn3_0.a;
            ((yn3$a)((Object)arrayList)).e(numberFormatException2);
        }
        arrayList = new ArrayList<yn3$a>();
        Object object4 = object3 != null ? (object = cartEntry.getProduct()) : null;
        Object object5 = object4 != null ? (object = ((Product)object4).getCode()) : null;
        double d5 = 0.0;
        if (object3 != null) {
            try {
                object = cartEntry.getBasePrice();
                if (object != null && (object = ((Price)object).getValue()) != null) {
                    d5 = Double.parseDouble((String)object);
                }
            }
            catch (Exception exception) {
                yn3$a = yn3_0.a;
                yn3$a.e(exception);
            }
        }
        if (object4 != null) {
            object = hv3_0.n((Product)object4);
        } else {
            n10 = 0;
            object = null;
        }
        yn3$a = new Bundle();
        GAEcommerceEvents.addProductInfo((Product)object4, (Bundle)yn3$a);
        if (object4 != null) {
            string4 = ((Product)object4).getBrandName();
        } else {
            n8 = 0;
            string4 = null;
        }
        Object object6 = "";
        if (string4 != null && (n8 = string4.length()) != 0) {
            if (object4 != null) {
                string4 = ((Product)object4).getBrandName();
            } else {
                n8 = 0;
                string4 = null;
            }
        } else {
            string4 = object6;
        }
        Object object7 = PRODUCT_BRAND;
        yn3$a.putString((String)object7, string4);
        string4 = object3 != null && (n8 = (int)(cartEntry.isProductNSForGA() ? 1 : 0)) == (n7 = 1) || object3 != null && (n8 = (int)(cartEntry.isQuantityAvailable() ? 1 : 0)) == 0 ? "non - deliverable" : "deliverable";
        object7 = Ga4Events.INSTANCE;
        Object object8 = (String)((Ga4Events)object7).getGav4DimensionMap().get(DIMEN_19);
        int n14 = gAEcommerceEvents.getInventoryQuantity((CartEntry)object3);
        String string6 = object6;
        object6 = new StringBuilder();
        ((StringBuilder)object6).append(n14);
        String string7 = "|";
        ((StringBuilder)object6).append(string7);
        ((StringBuilder)object6).append(string4);
        string4 = ((StringBuilder)object6).toString();
        yn3$a.putString((String)object8, string4);
        object8 = "item_id";
        yn3$a.putString((String)object8, (String)object5);
        if (object4 == null || (object8 = ((Product)object4).getName()) == null) {
            object8 = string6;
        }
        object5 = "item_name";
        yn3$a.putString((String)object5, (String)object8);
        if (object4 != null) {
            object8 = ((Product)object4).getSegmentNameText();
        } else {
            n4 = 0;
            object8 = null;
        }
        object5 = "item_category";
        string4 = PRODUCT_SEGMENT;
        if (object8 != null && (n4 = ((String)object8).length()) != 0) {
            object8 = (String)((Ga4Events)object7).getGav4DimensionMap().get(string4);
            if (object4 != null) {
                string4 = ((Product)object4).getSegmentNameText();
            } else {
                n8 = 0;
                string4 = null;
            }
            yn3$a.putString((String)object8, string4);
            if (object4 != null) {
                object8 = ((Product)object4).getSegmentNameText();
            } else {
                n4 = 0;
                object8 = null;
            }
            yn3$a.putString((String)object5, (String)object8);
        } else {
            object8 = (String)((Ga4Events)object7).getGav4DimensionMap().get(string4);
            if (object4 != null) {
                string4 = ((Product)object4).getBrickCategory();
            } else {
                n8 = 0;
                string4 = null;
            }
            if (string4 != null && (n8 = string4.length()) != 0) {
                if (object4 != null) {
                    string4 = ((Product)object4).getBrickCategory();
                } else {
                    n8 = 0;
                    string4 = null;
                }
            } else {
                string4 = string6;
            }
            yn3$a.putString((String)object8, string4);
            if (object4 != null) {
                object8 = ((Product)object4).getBrickCategory();
            } else {
                n4 = 0;
                object8 = null;
            }
            if (object8 != null && (n4 = ((String)object8).length()) != 0) {
                if (object4 != null) {
                    object8 = ((Product)object4).getBrickCategory();
                } else {
                    n4 = 0;
                    object8 = null;
                }
            } else {
                object8 = string6;
            }
            yn3$a.putString((String)object5, (String)object8);
        }
        if (object4 != null) {
            object8 = ((Product)object4).getVerticalNameText();
        } else {
            n4 = 0;
            object8 = null;
        }
        object5 = "item_category2";
        string4 = PRODUCT_VERTICLE;
        if (object8 != null && (n4 = ((String)object8).length()) != 0) {
            object8 = (String)((Ga4Events)object7).getGav4DimensionMap().get(string4);
            if (object4 != null) {
                string4 = ((Product)object4).getVerticalNameText();
            } else {
                n8 = 0;
                string4 = null;
            }
            yn3$a.putString((String)object8, string4);
            if (object4 != null) {
                object8 = ((Product)object4).getVerticalNameText();
            } else {
                n4 = 0;
                object8 = null;
            }
            yn3$a.putString((String)object5, (String)object8);
        } else {
            object8 = (String)((Ga4Events)object7).getGav4DimensionMap().get(string4);
            if (object4 != null) {
                string4 = ((Product)object4).getBrickSubCategory();
            } else {
                n8 = 0;
                string4 = null;
            }
            if (string4 != null && (n8 = string4.length()) != 0) {
                if (object4 != null) {
                    string4 = ((Product)object4).getBrickSubCategory();
                } else {
                    n8 = 0;
                    string4 = null;
                }
            } else {
                string4 = string6;
            }
            yn3$a.putString((String)object8, string4);
            if (object4 != null) {
                object8 = ((Product)object4).getBrickSubCategory();
            } else {
                n4 = 0;
                object8 = null;
            }
            if (object8 != null && (n4 = ((String)object8).length()) != 0) {
                if (object4 != null) {
                    object8 = ((Product)object4).getBrickSubCategory();
                } else {
                    n4 = 0;
                    object8 = null;
                }
            } else {
                object8 = string6;
            }
            yn3$a.putString((String)object5, (String)object8);
        }
        if (object4 != null) {
            object8 = ((Product)object4).getBrickNameText();
        } else {
            n4 = 0;
            object8 = null;
        }
        object5 = "item_category3";
        string4 = PRODUCT_BRICK;
        if (object8 != null && (n4 = ((String)object8).length()) != 0) {
            object8 = (String)((Ga4Events)object7).getGav4DimensionMap().get(string4);
            if (object4 != null) {
                string4 = ((Product)object4).getBrickNameText();
            } else {
                n8 = 0;
                string4 = null;
            }
            yn3$a.putString((String)object8, string4);
            if (object4 != null) {
                object8 = ((Product)object4).getBrickNameText();
            } else {
                n4 = 0;
                object8 = null;
            }
            yn3$a.putString((String)object5, (String)object8);
        } else {
            object8 = (String)((Ga4Events)object7).getGav4DimensionMap().get(string4);
            if (object4 != null) {
                string4 = ((Product)object4).getBrickName();
            } else {
                n8 = 0;
                string4 = null;
            }
            if (string4 != null && (n8 = string4.length()) != 0) {
                if (object4 != null) {
                    string4 = ((Product)object4).getBrickName();
                } else {
                    n8 = 0;
                    string4 = null;
                }
            } else {
                string4 = string6;
            }
            yn3$a.putString((String)object8, string4);
            if (object4 != null) {
                object8 = ((Product)object4).getBrickName();
            } else {
                n4 = 0;
                object8 = null;
            }
            if (object8 != null && (n4 = ((String)object8).length()) != 0) {
                if (object4 != null) {
                    object8 = ((Product)object4).getBrickName();
                } else {
                    n4 = 0;
                    object8 = null;
                }
            } else {
                object8 = string6;
            }
            yn3$a.putString((String)object5, (String)object8);
        }
        object8 = "index";
        object5 = null;
        yn3$a.putInt((String)object8, 0);
        if (object == null) {
            object = string6;
        }
        object8 = "item_variant";
        yn3$a.putString((String)object8, (String)object);
        object6 = object4 != null && (object = ((Product)object4).getBrandName()) != null ? object : string6;
        yn3$a.putString("item_brand", (String)object6);
        yn3$a.putDouble("price", d5);
        object = ((Ga4Events)object7).getGav4DimensionMap();
        object8 = "dimension16";
        object = (String)object.get(object8);
        object4 = object4 != null && (object4 = ((Product)object4).getWasPriceData()) != null ? ((Price)object4).getValue() : null;
        object4 = qz2_0.s(mz3_0.h((String)object4));
        yn3$a.putString((String)object, (String)object4);
        object = "currency";
        object4 = "INR";
        yn3$a.putString((String)object, (String)object4);
        if (object3 != null) {
            object = cartEntry.getQuantity();
        } else {
            n10 = 0;
            object = null;
        }
        if (object != null) {
            long l2;
            object = cartEntry.getQuantity();
            if (object == null) {
                l2 = 1L;
                d2 = Double.MIN_VALUE;
            } else {
                object = cartEntry.getQuantity();
                n10 = (Integer)object;
                l2 = n10;
            }
            object = "quantity";
            yn3$a.putLong((String)object, l2);
        }
        object = a21.a;
        if (object2 != null) {
            object4 = object3 != null && (object4 = cartEntry.getProduct()) != null ? ((Product)object4).getCode() : null;
            object4 = (ArrayList)object2.get(object4);
        } else {
            object4 = null;
        }
        object.getClass();
        n10 = (int)(a21.c((ArrayList)object4) ? 1 : 0);
        object4 = DIMEN_BARGAIN_TAG_NAME;
        if (n10 != 0) {
            if (object2 != null) {
                if (object3 != null && (object = cartEntry.getProduct()) != null) {
                    object = ((Product)object).getCode();
                } else {
                    n10 = 0;
                    object = null;
                }
                object = (ArrayList)object2.get(object);
            } else {
                n10 = 0;
                object = null;
            }
            object2 = (String)((Ga4Events)object7).getGav4DimensionMap().get(object4);
            object = a21.e((List)object);
            string4 = "GetFreebies - ";
            object5 = new StringBuilder(string4);
            ((StringBuilder)object5).append(object);
            object = ((StringBuilder)object5).toString();
            yn3$a.putString((String)object2, (String)object);
        } else {
            object = (String)((Ga4Events)object7).getGav4DimensionMap().get(object4);
            object2 = "GetFreebies";
            yn3$a.putString((String)object, (String)object2);
        }
        object = ((Ga4Events)object7).getGav4DimensionMap();
        object2 = STORE_SOURCE_ID_OLD;
        object = (String)object.get(object2);
        if (object3 == null || (object2 = cartEntry.getProduct()) == null || (object2 = ((Product)object2).getCatalogName()) == null) {
            if (object3 != null && (object2 = cartEntry.getProduct()) != null) {
                object2 = ((Product)object2).getCatalog();
            } else {
                n3 = 0;
                object2 = null;
            }
        }
        object2 = gAEcommerceEvents.getStoreTypeFromCatalog((String)object2);
        yn3$a.putString((String)object, (String)object2);
        object = this.getSegmentIds();
        if (object != null && (n10 = ((String)object).length()) != 0) {
            object = (String)((Ga4Events)object7).getGav4DimensionMap().get(PRODUCT_DISCOUNT);
            cp_1.Companion.getClass();
            object2 = cp$a.e();
            object5 = object3 != null ? cartEntry.getProduct() : null;
            object2.getClass();
            d2 = cp_1.w((Product)object5);
            yn3$a.putDouble((String)object, d2);
        }
        object = (String)((Ga4Events)object7).getGav4DimensionMap().get(object8);
        cp_1.Companion.getClass();
        object2 = cp$a.e();
        if (object3 != null) {
            object8 = cartEntry.getProduct();
        } else {
            n4 = 0;
            object8 = null;
        }
        object2.getClass();
        double d7 = cp_1.x((Product)object8);
        yn3$a.putDouble((String)object, d7);
        object = (String)((Ga4Events)object7).getGav4DimensionMap().get(DIMEN_SIZE);
        object2 = cp$a.e();
        if (object3 != null && (object8 = cartEntry.getProduct()) != null) {
            object8 = ((Product)object8).getSelectedSizeVariant();
        } else {
            n4 = 0;
            object8 = null;
        }
        object2.getClass();
        if (object8 != null) {
            object2 = Y63.c((ProductOptionVariant)object8);
        } else {
            n3 = 0;
            object2 = null;
        }
        yn3$a.putString((String)object, (String)object2);
        if (object3 != null) {
            object = cartEntry.getAggregateRating();
        } else {
            n10 = 0;
            object = null;
        }
        if (object != null && (n10 = ((String)object).length()) != 0) {
            object = ((Ga4Events)object7).getGav4DimensionMap();
            object2 = LD2.b;
            object = (String)object.get(object2);
            if (object3 != null) {
                object2 = cartEntry.getAggregateRating();
            } else {
                n3 = 0;
                object2 = null;
            }
            yn3$a.putString((String)object, (String)object2);
        }
        if ((object = lp_0.e(cartEntry)) != null && (n3 = ((String)object).length()) != 0) {
            object2 = (String)((Ga4Events)object7).getGav4DimensionMap().get(object4);
            yn3$a.putString((String)object2, (String)object);
        }
        object = cp$a.e();
        if (object3 != null) {
            object2 = cartEntry.getSegmentId();
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object3 != null) {
            object8 = cartEntry.getExperimentId();
        } else {
            n4 = 0;
            object8 = null;
        }
        object.getClass();
        object = cp_1.A((String)object2, (String)object8);
        if (object != null) {
            object3 = ((Ga4Events)object7).getGav4DimensionMap();
            object2 = DIMEN_20;
            object3 = (String)object3.get(object2);
            yn3$a.putString((String)object3, (String)object);
        }
        arrayList.add(yn3$a);
        object2 = new Bundle();
        object2.putParcelableArrayList("items", arrayList);
        object2.putString(EVENT_LABEL, "purchase_refund");
        object = AppsFlyerLib.getInstance();
        AJIOApplication.Companion.getClass();
        object3 = AJIOApplication$a.a();
        object = ((AppsFlyerLib)object).getAppsFlyerUID((Context)object3);
        object2.putString("af_id", (String)object);
        object2.putString("isGA4", "true");
        object2.putDouble("value", d5);
        object2.putString("screen_name", string5);
        object2.putString(SCREEN_KEY, string5);
        object2.putString(EVENT_CATEGORY, "Enhance E-commerce");
        object2.putString(EVENT_ACTION, "refund");
        object3 = this;
        GAEcommerceEvents.trackEcommerceEvent$default(this, "refund", (Bundle)object2, null, 4, null);
    }

    public static /* synthetic */ void pushOrderReturnEvent$default(GAEcommerceEvents gAEcommerceEvents, String string2, ArrayList arrayList, String string3, ArrayList arrayList2, int n3, Object object) {
        if ((n3 &= 8) != 0) {
            arrayList2 = null;
        }
        gAEcommerceEvents.pushOrderReturnEvent(string2, arrayList, string3, arrayList2);
    }

    public static /* synthetic */ void pushOrderReturnEventGAV4$default(GAEcommerceEvents gAEcommerceEvents, String string2, ArrayList arrayList, String string3, ArrayList arrayList2, int n3, Object object) {
        if ((n3 &= 8) != 0) {
            arrayList2 = null;
        }
        gAEcommerceEvents.pushOrderReturnEventGAV4(string2, arrayList, string3, arrayList2);
    }

    public static final void pushPaymentEvent(String object, String object2, String string2, String string3) {
        Intrinsics.checkNotNullParameter(object, "eventLabel");
        Intrinsics.checkNotNullParameter(object2, "eventAction");
        Bundle bundle = dm_1.a(string2, "screenName", string3, "userStatus");
        Object object3 = z40_0.Companion;
        object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a.b("experimentEvents");
        String string4 = null;
        String string5 = "proceed_to_shipping_ab";
        boolean bl2 = StringsKt.F((CharSequence)object3, string5, false);
        if (bl2) {
            object3 = z40$a.a((Context)AJIOApplication$a.a()).a.b("singlePageCheckOut");
            object3 = "singlePageCheckOut:  ".concat((String)object3);
            string4 = "firebase_experiment";
            bundle.putString(string4, (String)object3);
        }
        object3 = EVENT_LABEL;
        bundle.putString((String)object3, (String)object);
        bundle.putString(EVENT_ACTION, (String)object2);
        bundle.putString(SCREEN_KEY, string2);
        bundle.putString("screen_name", string2);
        object = INSTANCE;
        object2 = ((GAEcommerceEvents)object).getUserInformation().getClientId();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl3) {
            object2 = ((GAEcommerceEvents)object).getUserInformation().getClientId();
            string2 = "Client_ID";
            bundle.putString(string2, (String)object2);
        }
        object2 = rj_0.b();
        bundle.putString("Time_of_the_day", (String)object2);
        object2 = ((GAEcommerceEvents)object).getUserInformation().getUserStatus();
        bundle.putString("user_status", (String)object2);
        bundle.putString("Logged_In_Status", string3);
        string2 = super.getUserId();
        bundle.putString("userId", string2);
        object2 = h40_0.a;
        bundle.putString("isGA4", "true");
        bundle.putString(EVENT_CATEGORY, GTM_EVENT_BUTTON_TAP);
        super.sendButtonTapEvent(bundle);
    }

    public static final void pushProductDetails(Product product, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        Intrinsics.checkNotNullParameter(string4, "price");
        Intrinsics.checkNotNullParameter(string7, "screenName");
        GAEcommerceEvents.pushProductDetailsGAV4(product, string2, string3, string4, string5, string6, string7, string8);
    }

    public static /* synthetic */ void pushProductDetails$default(Product product, String string2, String string3, String string4, String string5, String string6, String string7, String string8, int n3, Object object) {
        String string9;
        int n4 = n3;
        n4 = n3 & 0x80;
        if (n4 != 0) {
            n4 = 0;
            string9 = null;
        } else {
            string9 = string8;
        }
        GAEcommerceEvents.pushProductDetails(product, string2, string3, string4, string5, string6, string7, string9);
    }

    private static final void pushProductDetailsGAV4(Product object, String string2, String object2, String string3, String string4, String string5, String string6, String string7) {
        int n3;
        long l2;
        int n4;
        int n7;
        double d2;
        Product product = object;
        Iterator iterator = object2;
        Object object3 = string7;
        Object object4 = "shortText";
        String string8 = "longText";
        Object object5 = INSTANCE.trimProductId((String)object2);
        Object object6 = null;
        Object object7 = object5[0];
        int n8 = TextUtils.isEmpty((CharSequence)object7);
        if (n8 != 0) {
            return;
        }
        try {
            d2 = Double.parseDouble(string3);
        }
        catch (NumberFormatException numberFormatException) {
            object7 = yn3_0.a;
            ((yn3$a)object7).e(numberFormatException);
            d2 = 0.0;
        }
        object7 = new Bundle();
        GAEcommerceEvents.addProductInfo((Product)object, (Bundle)object7);
        Object object8 = object5[0];
        boolean bl2 = TextUtils.isEmpty((CharSequence)object8);
        Object object9 = "";
        object8 = bl2 ? object9 : object5[0];
        Object object10 = "item_id";
        object7.putString((String)object10, (String)object8);
        bl2 = TextUtils.isEmpty((CharSequence)string2);
        object8 = bl2 ? object9 : string2;
        object10 = "item_name";
        object7.putString((String)object10, (String)object8);
        bl2 = false;
        object8 = null;
        if (product != null) {
            object10 = ((Product)object).getSegmentNameText();
        } else {
            n7 = 0;
            object10 = null;
        }
        Object object11 = "item_category";
        String string9 = PRODUCT_SEGMENT;
        if (object10 != null && (n7 = ((String)object10).length()) != 0) {
            object10 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(string9);
            if (product != null) {
                string9 = ((Product)object).getSegmentNameText();
            } else {
                n4 = 0;
                string9 = null;
            }
            object7.putString((String)object10, string9);
            if (product != null) {
                object10 = ((Product)object).getSegmentNameText();
            } else {
                n7 = 0;
                object10 = null;
            }
            object7.putString((String)object11, (String)object10);
        } else {
            object10 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(string9);
            if (product != null) {
                string9 = ((Product)object).getBrickCategory();
            } else {
                n4 = 0;
                string9 = null;
            }
            if (string9 != null && (n4 = string9.length()) != 0) {
                if (product != null) {
                    string9 = ((Product)object).getBrickCategory();
                } else {
                    n4 = 0;
                    string9 = null;
                }
            } else {
                string9 = object9;
            }
            object7.putString((String)object10, string9);
            if (product != null) {
                object10 = ((Product)object).getBrickCategory();
            } else {
                n7 = 0;
                object10 = null;
            }
            if (object10 != null && (n7 = ((String)object10).length()) != 0) {
                if (product != null) {
                    object10 = ((Product)object).getBrickCategory();
                } else {
                    n7 = 0;
                    object10 = null;
                }
            } else {
                object10 = object9;
            }
            object7.putString((String)object11, (String)object10);
        }
        if (product != null) {
            object10 = ((Product)object).getVerticalNameText();
        } else {
            n7 = 0;
            object10 = null;
        }
        object11 = "item_category2";
        string9 = PRODUCT_VERTICLE;
        if (object10 != null && (n7 = ((String)object10).length()) != 0) {
            object10 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(string9);
            if (product != null) {
                string9 = ((Product)object).getVerticalNameText();
            } else {
                n4 = 0;
                string9 = null;
            }
            object7.putString((String)object10, string9);
            if (product != null) {
                object10 = ((Product)object).getVerticalNameText();
            } else {
                n7 = 0;
                object10 = null;
            }
            object7.putString((String)object11, (String)object10);
        } else {
            object10 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(string9);
            if (product != null) {
                string9 = ((Product)object).getBrickSubCategory();
            } else {
                n4 = 0;
                string9 = null;
            }
            if (string9 != null && (n4 = string9.length()) != 0) {
                if (product != null) {
                    string9 = ((Product)object).getBrickSubCategory();
                } else {
                    n4 = 0;
                    string9 = null;
                }
            } else {
                string9 = object9;
            }
            object7.putString((String)object10, string9);
            if (product != null) {
                object10 = ((Product)object).getBrickSubCategory();
            } else {
                n7 = 0;
                object10 = null;
            }
            if (object10 != null && (n7 = ((String)object10).length()) != 0) {
                if (product != null) {
                    object10 = ((Product)object).getBrickSubCategory();
                } else {
                    n7 = 0;
                    object10 = null;
                }
            } else {
                object10 = object9;
            }
            object7.putString((String)object11, (String)object10);
        }
        if (product != null) {
            object10 = ((Product)object).getBrickNameText();
        } else {
            n7 = 0;
            object10 = null;
        }
        object11 = "item_category3";
        string9 = PRODUCT_BRICK;
        if (object10 != null && (n7 = ((String)object10).length()) != 0) {
            object10 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(string9);
            if (product != null) {
                string9 = ((Product)object).getBrickNameText();
            } else {
                n4 = 0;
                string9 = null;
            }
            object7.putString((String)object10, string9);
            if (product != null) {
                object10 = ((Product)object).getBrickNameText();
            } else {
                n7 = 0;
                object10 = null;
            }
            object7.putString((String)object11, (String)object10);
        } else {
            object10 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(string9);
            if (product != null) {
                string9 = ((Product)object).getBrickName();
            } else {
                n4 = 0;
                string9 = null;
            }
            if (string9 != null && (n4 = string9.length()) != 0) {
                if (product != null) {
                    string9 = ((Product)object).getBrickName();
                } else {
                    n4 = 0;
                    string9 = null;
                }
            } else {
                string9 = object9;
            }
            object7.putString((String)object10, string9);
            if (product != null) {
                object10 = ((Product)object).getBrickName();
            } else {
                n7 = 0;
                object10 = null;
            }
            if (object10 != null && (n7 = ((String)object10).length()) != 0) {
                if (product != null) {
                    object10 = ((Product)object).getBrickName();
                } else {
                    n7 = 0;
                    object10 = null;
                }
            } else {
                object10 = object9;
            }
            object7.putString((String)object11, (String)object10);
        }
        object10 = "currency";
        object11 = "INR";
        object7.putString((String)object10, (String)object11);
        if (product != null) {
            n7 = ((Product)object).getPosition();
            l2 = n7;
        } else {
            l2 = 0L;
        }
        string9 = "index";
        object7.putLong(string9, l2);
        n7 = (int)(TextUtils.isEmpty((CharSequence)string4) ? 1 : 0);
        object10 = n7 != 0 ? object9 : string4;
        object7.putString("item_brand", (String)object10);
        object10 = "price";
        object7.putDouble((String)object10, d2);
        n7 = 1;
        object11 = object5[n7];
        int n10 = TextUtils.isEmpty((CharSequence)object11);
        if (n10 == 0) {
            object9 = object5[n7];
        }
        object5 = "item_variant";
        object7.putString((String)object5, (String)object9);
        if (product != null && (object5 = ((Product)object).getDiscountPercent()) != null && (object5 = StringsKt.a0((CharSequence)object5, (String[])(object9 = new String[]{"%"}), false, 0, n10 = 6)) != null && (object5 = (String)object5.get(0)) != null) {
            double d5 = Double.parseDouble((String)object5);
            object5 = TRADE_DISCOUNT;
            object7.putDouble((String)object5, d5);
        }
        object5 = Ga4Events.INSTANCE;
        object9 = (String)object5.getGav4DimensionMap().get(STORE_SOURCE_ID_OLD);
        object11 = INSTANCE;
        if (product == null || (string9 = ((Product)object).getCatalogName()) == null) {
            if (product != null) {
                string9 = ((Product)object).getCatalog();
            } else {
                n4 = 0;
                string9 = null;
            }
        }
        object11 = ((GAEcommerceEvents)object11).getStoreTypeFromCatalog(string9);
        object7.putString((String)object9, (String)object11);
        if (product != null && (object9 = ((Product)object).getFnlColorVariantData()) != null) {
            object11 = hv3_0.a;
            object11.getClass();
            object9 = hv3_0.A((ProductFnlColorVariantData)object9);
            if (object9 != null) {
                object11 = object5.getGav4DimensionMap();
                string9 = PRODUCT_TEASER_TAGS;
                object11 = (String)object11.get(string9);
                object7.putString((String)object11, (String)object9);
            }
        }
        int n14 = CollectionsKt.F(ih3_1.b, iterator);
        object9 = DIMEN_WISHLIST_STATE;
        if (n14 != 0) {
            iterator = (String)object5.getGav4DimensionMap().get(object9);
            object9 = "wishlisted";
            object7.putString((String)((Object)iterator), (String)object9);
        } else {
            iterator = (String)object5.getGav4DimensionMap().get(object9);
            object9 = "not wishlisted";
            object7.putString((String)((Object)iterator), (String)object9);
        }
        hv3_0.a.getClass();
        iterator = (String)hv3_0.H((Product)object, (boolean)false).b;
        object9 = new StringBuilder();
        if (iterator != null) {
            n10 = ((String)((Object)iterator)).length();
            if (n10 <= 0) {
                n14 = 0;
                iterator = null;
            }
            if (iterator != null) {
                ((StringBuilder)object9).append((String)((Object)iterator));
            }
        }
        if (object3 != null) {
            n14 = ((StringBuilder)object9).length();
            if (n14 > 0) {
                iterator = ",";
                ((StringBuilder)object9).append((String)((Object)iterator));
            }
            ((StringBuilder)object9).append((String)object3);
        }
        iterator = (String)hv3_0.h((Product)object, (boolean)false).b;
        object3 = ((StringBuilder)object9).toString();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object3);
        if (!bl3) {
            object9 = object5.getGav4DimensionMap();
            object11 = DIMEN_SELLING_POINT_TAG_NAME;
            object9 = (String)object9.get(object11);
            object7.putString((String)object9, (String)object3);
        }
        if ((n3 = ((String)((Object)(iterator = mz3_0.m((Product)object, (String)((Object)iterator))))).length()) > 0) {
            object3 = object5.getGav4DimensionMap();
            object5 = DIMEN_BARGAIN_TAG_NAME;
            object3 = (String)object3.get(object5);
            object7.putString((String)object3, (String)((Object)iterator));
        }
        if ((n14 = (int)(hv3_0.y(false) ? 1 : 0)) != 0 && product != null && (iterator = ((Product)object).getTagResponse()) != null && (iterator = ((TagResponse)((Object)iterator)).getTag()) != null && (iterator = ((Tag)((Object)iterator)).getCategoryTags()) != null) {
            iterator = ((Iterable)((Object)iterator)).iterator();
            while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                block114: {
                    block113: {
                        block112: {
                            int n15;
                            object3 = (CategoryTags)iterator.next();
                            if (object3 == null || (object5 = ((CategoryTags)object3).getCategory()) == null || (n15 = object5.equalsIgnoreCase((String)(object6 = "SOCIAL_PROOFING"))) != n7) continue;
                            object5 = ((CategoryTags)object3).getPrimary();
                            if (object5 != null) {
                                object5 = object5.getValue();
                            } else {
                                n15 = 0;
                                object5 = null;
                            }
                            object5 = String.valueOf(object5);
                            try {
                                object5 = JsonParser.parseString((String)object5);
                            }
                            catch (Exception exception) {}
                            object5 = object5.getAsJsonObject();
                            object6 = cp_1.Companion;
                            object3 = ((CategoryTags)object3).getPrimary();
                            if (object3 == null) break block112;
                            object3 = ((TagPrimary)object3).getName();
                            break block113;
                        }
                        n3 = 0;
                        object3 = null;
                    }
                    object6.getClass();
                    n3 = (int)(cp$a.x((String)object3) ? 1 : 0);
                    object6 = DIMEN_WISHLIST_COUNT;
                    if (n3 == 0) break block114;
                    if (object5 == null) continue;
                    n3 = (int)(object5.has(string8) ? 1 : 0);
                    if (n3 == 0) continue;
                    object3 = object5.get(string8);
                    object3 = ((JsonElement)object3).getAsString();
                    object5 = Ga4Events.INSTANCE;
                    object5 = object5.getGav4DimensionMap();
                    object5 = object5.get(object6);
                    object5 = (String)object5;
                    object7.putString((String)object5, (String)object3);
                }
                if (object5 == null) continue;
                n3 = (int)(object5.has((String)object4) ? 1 : 0);
                if (n3 == 0) continue;
                object3 = object5.get((String)object4);
                object3 = ((JsonElement)object3).getAsString();
                object5 = Ga4Events.INSTANCE;
                object5 = object5.getGav4DimensionMap();
                object5 = object5.get(object6);
                object5 = (String)object5;
                object7.putString((String)object5, (String)object3);
            }
        }
        if ((object3 = super.getSegmentIds()) != null && (n3 = ((String)object3).length()) != 0) {
            object3 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(PRODUCT_DISCOUNT);
            cp_1.Companion.getClass();
            object4 = cp$a.e();
            object4.getClass();
            double d7 = cp_1.w((Product)object);
            object7.putDouble((String)object3, d7);
        }
        cp_1.Companion.getClass();
        object3 = cp$a.e();
        object3.getClass();
        n3 = (int)(cp_1.F((Product)object) ? 1 : 0);
        object4 = cp$a.e();
        object4.getClass();
        long l3 = cp_1.y((Product)object);
        object5 = DIMEN_19;
        if (n3 != 0) {
            cp$a.e().getClass();
            object3 = cp_1.t((Product)object);
            object4 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object5);
            string8 = "0 | non-deliverable | ";
            k01_0.a(string8, (String)object3, (Bundle)object7, (String)object4);
        } else {
            object3 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object5);
            object5 = new StringBuilder();
            object5.append(l3);
            object5.append(" | deliverable");
            object4 = object5.toString();
            object7.putString((String)object3, (String)object4);
        }
        string8 = string6;
        object3 = px1_2.b(SCREEN_KEY, string6, "screen_name", string6);
        string8 = "true";
        object3.putString("isGA4", string8);
        object3.putDouble("value", d2);
        object4 = "items";
        object3.putBundle((String)object4, (Bundle)object7);
        object7 = super.getSegmentIds();
        if (object7 != null && (n8 = ((String)object7).length()) != 0) {
            object7 = "pricing_cust_seg";
            object4 = super.getSegmentIds();
            object3.putString((String)object7, (String)object4);
        }
        object7 = String.valueOf(((GAEcommerceEvents)((Object)iterator)).containsLuxe((Product)object));
        object3.putString(CONTAINS_LUXE, (String)object7);
        object3.putString(EVENT_CATEGORY, "Enhance E-commerce");
        object3.putString(EVENT_ACTION, "view_item");
        object = iterator;
        string2 = "view_item";
        object2 = object3;
        int n16 = 4;
        GAEcommerceEvents.trackEcommerceEvent$default(iterator, string2, (Bundle)object3, null, n16, null);
    }

    public static /* synthetic */ void pushProductListImpressionData$default(GAEcommerceEvents gAEcommerceEvents, List list, String string2, boolean bl2, Bundle bundle, int n3, Object object) {
        if ((n3 &= 8) != 0) {
            bundle = null;
        }
        gAEcommerceEvents.pushProductListImpressionData(list, string2, bl2, bundle);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void pushProductListImpressionDataGAV4(String string2, List list, String string3, boolean bl2, Bundle bundle) {
        GAEcommerceEvents gAEcommerceEvents = this;
        boolean bl3 = bl2;
        Object object = bundle;
        String string4 = "shortText";
        String string5 = "longText";
        ArrayList<Bundle> arrayList = new ArrayList<Bundle>();
        Object object2 = list.iterator();
        double d2 = 0.0;
        while (true) {
            Object object3;
            double d5;
            block66: {
                int n3;
                Object object4;
                Bundle bundle2;
                Object object5;
                Object object6;
                Object object7;
                block64: {
                    int n4;
                    int n7;
                    Object object8;
                    Object object9;
                    block65: {
                        Object object10;
                        int n8;
                        block61: {
                            block63: {
                                float f5;
                                double d7;
                                String[] stringArray;
                                block62: {
                                    NumberFormatException numberFormatException2;
                                    block60: {
                                        block59: {
                                            n8 = object2.hasNext();
                                            object7 = "";
                                            if (n8 == 0) break block61;
                                            object5 = object6 = object2.next();
                                            object5 = (Product)object6;
                                            bundle2 = new Bundle();
                                            object6 = ((Product)object5).getFnlColorVariantData();
                                            if (object6 != null) {
                                                boolean bl4;
                                                object6 = ((Product)object5).getFnlColorVariantData();
                                                if (object6 != null) {
                                                    object6 = ((ProductFnlColorVariantData)object6).getColorGroup();
                                                } else {
                                                    n8 = 0;
                                                    object6 = null;
                                                }
                                                n8 = TextUtils.isEmpty((CharSequence)object6);
                                                if (n8 == 0) {
                                                    object6 = ((Product)object5).getFnlColorVariantData();
                                                    Intrinsics.checkNotNull(object6);
                                                    object6 = ((ProductFnlColorVariantData)object6).getColorGroup();
                                                    Intrinsics.checkNotNull(object6);
                                                } else {
                                                    object6 = object7;
                                                }
                                                Object object11 = ((Product)object5).getFnlColorVariantData();
                                                if (object11 != null) {
                                                    object11 = ((ProductFnlColorVariantData)object11).getBrandName();
                                                } else {
                                                    bl4 = false;
                                                    object11 = null;
                                                }
                                                bl4 = TextUtils.isEmpty((CharSequence)object11);
                                                if (!bl4) {
                                                    object11 = ((Product)object5).getFnlColorVariantData();
                                                    Intrinsics.checkNotNull(object11);
                                                    object11 = ((ProductFnlColorVariantData)object11).getBrandName();
                                                    Intrinsics.checkNotNull(object11);
                                                    object4 = object6;
                                                    object9 = object11;
                                                } else {
                                                    object4 = object6;
                                                    object9 = object7;
                                                }
                                            } else {
                                                object4 = object7;
                                                object9 = object7;
                                            }
                                            object6 = ((Product)object5).getFnlProductData();
                                            if (object6 != null) {
                                                object6 = ((Product)object5).getFnlProductData();
                                                if (object6 != null) {
                                                    object6 = ((ProductfnlProductData)object6).getPlanningCategory();
                                                } else {
                                                    n8 = 0;
                                                    object6 = null;
                                                }
                                                n8 = TextUtils.isEmpty((CharSequence)object6);
                                                if (n8 == 0) {
                                                    object6 = ((Product)object5).getFnlProductData();
                                                    Intrinsics.checkNotNull(object6);
                                                    object6 = ((ProductfnlProductData)object6).getPlanningCategory();
                                                    Intrinsics.checkNotNull(object6);
                                                }
                                            }
                                            stringArray = gAEcommerceEvents.trimProductId((String)object4);
                                            try {
                                                object6 = ((Product)object5).getPrice();
                                                if (object6 != null && (object6 = ((Price)object6).getValue()) != null) break block59;
                                            }
                                            catch (NumberFormatException numberFormatException2) {
                                                break block60;
                                            }
                                            object6 = "0";
                                        }
                                        double d9 = Double.parseDouble((String)object6);
                                        double d12 = d2;
                                        d2 = d9;
                                        d5 = d12;
                                        break block62;
                                    }
                                    object8 = yn3_0.a;
                                    ((yn3$a)object8).e(numberFormatException2);
                                    d5 = d2;
                                    d2 = 0.0;
                                }
                                n8 = 0;
                                object6 = null;
                                object8 = stringArray[0];
                                int n10 = TextUtils.isEmpty((CharSequence)object8);
                                if (n10 != 0) break block63;
                                if (bl3) {
                                    GAEcommerceEvents.addProductInfo((Product)object5, bundle2);
                                }
                                object8 = (n10 = TextUtils.isEmpty((CharSequence)(object8 = stringArray[0]))) != 0 ? object7 : stringArray[0];
                                bundle2.putString("item_id", (String)object8);
                                object8 = ((Product)object5).getName();
                                bundle2.putString("item_name", (String)object8);
                                object6 = ((Product)object5).getSegmentNameText();
                                object8 = "item_category";
                                object3 = object2;
                                object2 = PRODUCT_SEGMENT;
                                if (object6 != null && (n8 = ((String)object6).length()) != 0) {
                                    object6 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object2);
                                    object2 = ((Product)object5).getSegmentNameText();
                                    bundle2.putString((String)object6, (String)object2);
                                    object6 = ((Product)object5).getSegmentNameText();
                                    bundle2.putString((String)object8, (String)object6);
                                } else {
                                    object6 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object2);
                                    object2 = ((Product)object5).getBrickCategory();
                                    object2 = object2 != null && (n7 = ((String)object2).length()) != 0 ? ((Product)object5).getBrickCategory() : object7;
                                    bundle2.putString((String)object6, (String)object2);
                                    object6 = ((Product)object5).getBrickCategory();
                                    object6 = object6 != null && (n8 = ((String)object6).length()) != 0 ? ((Product)object5).getBrickCategory() : object7;
                                    bundle2.putString((String)object8, (String)object6);
                                }
                                object6 = ((Product)object5).getVerticalNameText();
                                object2 = "item_category2";
                                object8 = PRODUCT_VERTICLE;
                                if (object6 != null && (n8 = ((String)object6).length()) != 0) {
                                    object6 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object8);
                                    object8 = ((Product)object5).getVerticalNameText();
                                    bundle2.putString((String)object6, (String)object8);
                                    object6 = ((Product)object5).getVerticalNameText();
                                    bundle2.putString((String)object2, (String)object6);
                                } else {
                                    object6 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object8);
                                    object8 = ((Product)object5).getBrickSubCategory();
                                    object8 = object8 != null && (n10 = ((String)object8).length()) != 0 ? ((Product)object5).getBrickSubCategory() : object7;
                                    bundle2.putString((String)object6, (String)object8);
                                    object6 = ((Product)object5).getBrickSubCategory();
                                    object6 = object6 != null && (n8 = ((String)object6).length()) != 0 ? ((Product)object5).getBrickSubCategory() : object7;
                                    bundle2.putString((String)object2, (String)object6);
                                }
                                object6 = ((Product)object5).getBrickNameText();
                                object2 = "item_category3";
                                object8 = PRODUCT_BRICK;
                                if (object6 != null && (n8 = ((String)object6).length()) != 0) {
                                    object6 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object8);
                                    object8 = ((Product)object5).getBrickNameText();
                                    bundle2.putString((String)object6, (String)object8);
                                    object6 = ((Product)object5).getBrickNameText();
                                    bundle2.putString((String)object2, (String)object6);
                                } else {
                                    object6 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object8);
                                    object8 = ((Product)object5).getBrickName();
                                    object8 = object8 != null && (n10 = ((String)object8).length()) != 0 ? ((Product)object5).getBrickName() : object7;
                                    bundle2.putString((String)object6, (String)object8);
                                    object6 = ((Product)object5).getBrickName();
                                    object6 = object6 != null && (n8 = ((String)object6).length()) != 0 ? ((Product)object5).getBrickName() : object7;
                                    bundle2.putString((String)object2, (String)object6);
                                }
                                n8 = 1;
                                object2 = stringArray[n8];
                                n7 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                                object2 = n7 != 0 ? object7 : stringArray[n8];
                                object8 = "item_variant";
                                bundle2.putString((String)object8, (String)object2);
                                bundle2.putString("item_brand", (String)object9);
                                bundle2.putDouble("price", d2);
                                object9 = "INR";
                                bundle2.putString("currency", (String)object9);
                                n7 = ((Product)object5).getPosition();
                                long l2 = n7;
                                object2 = "index";
                                bundle2.putLong((String)object2, l2);
                                object6 = ((Product)object5).getWasPriceData();
                                if (object6 != null && (object6 = ((Price)object6).getValue()) != null) {
                                    d7 = Double.parseDouble((String)object6);
                                    object2 = MRP;
                                    bundle2.putDouble((String)object2, d7);
                                }
                                if ((object6 = ((Product)object5).getWasPriceData()) != null && (object6 = ((Price)object6).getValue()) != null) {
                                    d7 = Double.parseDouble((String)object6);
                                } else {
                                    l2 = 0L;
                                    d7 = 0.0;
                                }
                                object2 = ((Product)object5).getPrice();
                                double d13 = object2 != null && (object2 = ((Price)object2).getValue()) != null ? Double.parseDouble((String)object2) : 0.0;
                                object2 = DISCOUNT;
                                bundle2.putDouble((String)object2, d7 -= d13);
                                object6 = ((Product)object5).getDiscountPercent();
                                if (object6 != null) {
                                    object10 = new String[]{"%"};
                                    n7 = 6;
                                    n10 = 0;
                                    f5 = 0.0f;
                                    object8 = null;
                                    if ((object6 = StringsKt.a0((CharSequence)object6, (String[])object10, false, 0, n7)) != null && (object6 = (String)object6.get(0)) != null) {
                                        d7 = Double.parseDouble((String)object6);
                                        object2 = TRADE_DISCOUNT;
                                        bundle2.putDouble((String)object2, d7);
                                    }
                                }
                                object6 = Ga4Events.INSTANCE;
                                object10 = (String)((Ga4Events)object6).getGav4DimensionMap().get(STORE_SOURCE_ID_OLD);
                                object2 = ((Product)object5).getCatalogName();
                                if (object2 == null) {
                                    object2 = ((Product)object5).getCatalog();
                                }
                                object2 = gAEcommerceEvents.getStoreTypeFromCatalog((String)object2);
                                bundle2.putString((String)object10, (String)object2);
                                object10 = ((Product)object5).getFnlColorVariantData();
                                if (object10 != null) {
                                    object2 = hv3_0.a;
                                    object2.getClass();
                                    object10 = hv3_0.A((ProductFnlColorVariantData)object10);
                                    if (object10 != null) {
                                        object2 = ((Ga4Events)object6).getGav4DimensionMap();
                                        object8 = PRODUCT_TEASER_TAGS;
                                        object2 = (String)object2.get(object8);
                                        bundle2.putString((String)object2, (String)object10);
                                    }
                                }
                                object10 = tr2_2.a;
                                bl3 = tr2_2.v(og1_1.c());
                                if (bl3) {
                                    bl3 = false;
                                    object10 = null;
                                    n7 = (int)(tr2_2.p(false) ? 1 : 0);
                                    object8 = DIMEN_SALE_PRICE;
                                    if (n7 != 0) {
                                        float f6;
                                        object2 = (String)((Ga4Events)object6).getGav4DimensionMap().get(object8);
                                        object8 = ((Product)object5).getOfferPrice();
                                        stringArray = null;
                                        if (object8 != null && (object8 = ((Price)object8).getPriceReveal()) != null && (object8 = ((PriceReveal)object8).getBestPrice()) != null) {
                                            f5 = ((Float)object8).floatValue();
                                        } else {
                                            n10 = 0;
                                            f5 = 0.0f;
                                            object8 = null;
                                        }
                                        n10 = (int)((f6 = f5 - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
                                        if (n10 > 0) {
                                            bl3 = true;
                                        }
                                        object10 = String.valueOf(bl3);
                                        bundle2.putString((String)object2, (String)object10);
                                    } else {
                                        object2 = (String)((Ga4Events)object6).getGav4DimensionMap().get(object8);
                                        object8 = ((Product)object5).getOfferPrice();
                                        if (object8 != null) {
                                            object8 = ((Price)object8).getValue();
                                        } else {
                                            n10 = 0;
                                            f5 = 0.0f;
                                            object8 = null;
                                        }
                                        if (object8 == null || (n10 = ((String)object8).length()) == 0) {
                                            bl3 = true;
                                        }
                                        n4 = 1;
                                        object10 = String.valueOf(bl3 ^= n4);
                                        bundle2.putString((String)object2, (String)object10);
                                    }
                                }
                                object10 = ih3_1.b;
                                bl3 = ((HashSet)object10).contains(object4);
                                object2 = DIMEN_WISHLIST_STATE;
                                if (bl3) {
                                    object10 = (String)((Ga4Events)object6).getGav4DimensionMap().get(object2);
                                    object2 = "wishlisted";
                                    bundle2.putString((String)object10, (String)object2);
                                } else {
                                    object10 = (String)((Ga4Events)object6).getGav4DimensionMap().get(object2);
                                    object2 = "not wishlisted";
                                    bundle2.putString((String)object10, (String)object2);
                                }
                                object10 = hv3_0.a;
                                object10.getClass();
                                bl3 = bl2;
                                object2 = (String)hv3_0.H((Product)object5, (boolean)bl2).b;
                                object4 = (String)hv3_0.h((Product)object5, (boolean)bl2).b;
                                if (object2 != null && (n10 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0)) == 0) {
                                    object8 = ((Ga4Events)object6).getGav4DimensionMap();
                                    object9 = (String)object8.get(DIMEN_SELLING_POINT_TAG_NAME);
                                    bundle2.putString((String)object9, (String)object2);
                                }
                                if ((n3 = ((String)(object2 = mz3_0.n((Product)object5, (String)object4))).length()) > 0) {
                                    object6 = ((Ga4Events)object6).getGav4DimensionMap();
                                    object4 = DIMEN_BARGAIN_TAG_NAME;
                                    object6 = (String)object6.get(object4);
                                    bundle2.putString((String)object6, (String)object2);
                                }
                                if ((n8 = (int)(hv3_0.y(bl2) ? 1 : 0)) == 0 || (object6 = ((Product)object5).getTags()) == null || (object6 = ((Tag)object6).getCategoryTags()) == null) break block64;
                                object6 = ((Iterable)object6).iterator();
                                break block65;
                            }
                            object3 = object2;
                            object2 = string3;
                            break block66;
                        }
                        object2 = string3;
                        d5 = d2;
                        string4 = new Bundle();
                        string4.putParcelableArrayList("items", arrayList);
                        string4.putDouble("value", d2);
                        string4.putString("isGA4", "true");
                        object10 = "Enhance E-commerce";
                        string4.putString(EVENT_CATEGORY, (String)object10);
                        object6 = EVENT_ACTION;
                        string5 = string2;
                        string4.putString((String)object6, string2);
                        n8 = TextUtils.isEmpty((CharSequence)string3);
                        object6 = n8 != 0 ? object7 : string3;
                        object10 = SCREEN_KEY;
                        string4.putString((String)object10, (String)object6);
                        n8 = TextUtils.isEmpty((CharSequence)string3);
                        if (n8 == 0) {
                            object7 = object2;
                        }
                        string4.putString(EVENT_LABEL, (String)object7);
                        object10 = list;
                        n8 = gAEcommerceEvents.containsLuxe(list);
                        object6 = String.valueOf(n8 != 0);
                        object10 = CONTAINS_LUXE;
                        string4.putString((String)object10, (String)object6);
                        if (object != null) {
                            string4.putAll(object);
                        }
                        object10 = this;
                        object = string2;
                        GAEcommerceEvents.trackEcommerceEvent$default(this, string2, (Bundle)string4, null, 4, null);
                        return;
                    }
                    while ((n7 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
                        object2 = (CategoryTags)object6.next();
                        if (object2 != null && (object4 = ((CategoryTags)object2).getCategory()) != null) {
                            object9 = "SOCIAL_PROOFING";
                            n3 = (int)(((String)object4).equalsIgnoreCase((String)object9) ? 1 : 0);
                            if (n3 != (n4 = 1)) continue;
                            object4 = ((CategoryTags)object2).getPrimary();
                            if (object4 != null) {
                                object4 = ((TagPrimary)object4).getValue();
                            } else {
                                n3 = 0;
                                object4 = null;
                            }
                            object4 = String.valueOf(object4);
                            try {
                                object4 = JsonParser.parseString((String)object4);
                                object4 = ((JsonElement)object4).getAsJsonObject();
                                object8 = cp_1.Companion;
                                object2 = ((CategoryTags)object2).getPrimary();
                                if (object2 != null) {
                                    object2 = ((TagPrimary)object2).getName();
                                } else {
                                    n7 = 0;
                                    object2 = null;
                                }
                                object8.getClass();
                                n7 = (int)(cp$a.x((String)object2) ? 1 : 0);
                                object8 = DIMEN_WISHLIST_COUNT;
                                if (n7 != 0) {
                                    if (object4 == null || (n7 = (int)(((JsonObject)object4).has(string5) ? 1 : 0)) == 0) continue;
                                    object2 = ((JsonObject)object4).get(string5);
                                    object2 = ((JsonElement)object2).getAsString();
                                    object4 = Ga4Events.INSTANCE;
                                    object4 = ((Ga4Events)object4).getGav4DimensionMap();
                                    object4 = object4.get(object8);
                                    object4 = (String)object4;
                                    bundle2.putString((String)object4, (String)object2);
                                    continue;
                                }
                                if (object4 == null || (n7 = (int)(((JsonObject)object4).has(string4) ? 1 : 0)) == 0) continue;
                                object2 = ((JsonObject)object4).get(string4);
                                object2 = ((JsonElement)object2).getAsString();
                                object4 = Ga4Events.INSTANCE;
                                object4 = ((Ga4Events)object4).getGav4DimensionMap();
                                object4 = object4.get(object8);
                                object4 = (String)object4;
                                bundle2.putString((String)object4, (String)object2);
                            }
                            catch (Exception exception) {}
                            continue;
                        }
                        n4 = 1;
                    }
                }
                object6 = Ga4Events.INSTANCE;
                object2 = (String)((Ga4Events)object6).getGav4DimensionMap().get("dimension166");
                object4 = ((Product)object5).getAdsData();
                if (object4 == null || (object4 = ((AdsData)object4).getConfig()) == null || (object4 = ((Config)object4).getC()) == null) {
                    object4 = object7;
                }
                bundle2.putString((String)object2, (String)object4);
                object2 = (String)((Ga4Events)object6).getGav4DimensionMap().get("dimension167");
                object4 = el1_2.a;
                n3 = (int)(el1_2.i((Product)object5) ? 1 : 0);
                object4 = n3 != 0 ? "yes" : "no";
                bundle2.putString((String)object2, (String)object4);
                object6 = (String)((Ga4Events)object6).getGav4DimensionMap().get("dimension168");
                object2 = ((Product)object5).getFnlColorVariantData();
                if (object2 != null && (object2 = ((ProductFnlColorVariantData)object2).getColorGroup()) != null) {
                    object7 = object2;
                }
                bundle2.putString((String)object6, (String)object7);
                object6 = "item_list_name";
                object2 = string3;
                bundle2.putString((String)object6, string3);
                arrayList.add(bundle2);
            }
            d2 = d5 + d2;
            object2 = object3;
        }
    }

    public static /* synthetic */ void pushProductListImpressionDataGAV4$default(GAEcommerceEvents gAEcommerceEvents, String string2, List list, String string3, boolean bl2, Bundle bundle, int n3, Object object) {
        if ((n3 &= 0x10) != 0) {
            bundle = null;
        }
        gAEcommerceEvents.pushProductListImpressionDataGAV4(string2, list, string3, bl2, bundle);
    }

    private static final String segmentIds_delegate$lambda$3() {
        AJIOApplication.Companion.getClass();
        return UserInformation.getInstance((Context)AJIOApplication$a.a()).getUserSegementIds();
    }

    private final void sendButtonTapEvent(Bundle bundle) {
        int n3;
        String string2 = AnalyticsValues.INSTANCE.getStoreType();
        String string3 = "store_type";
        bundle.putString(string3, string2);
        string2 = appPreferences.f();
        if (string2 != null) {
            string3 = ((Object)StringsKt.m0(string2)).toString();
        } else {
            n3 = 0;
            string3 = null;
        }
        if (string3 != null && (n3 = string3.length()) != 0) {
            string3 = USER_TYPE;
            bundle.putString(string3, string2);
        }
        AJIOApplication.Companion.getClass();
        FirebaseAnalytics.getInstance((Context)AJIOApplication$a.a()).logEvent(GTM_EVENT_BUTTON_TAP, bundle);
    }

    public static /* synthetic */ void sendCheckoutOptions$default(GAEcommerceEvents gAEcommerceEvents, int n3, String string2, ArrayList arrayList, String string3, String string4, PaymentInstruments paymentInstruments, HashSet hashSet, String string5, List list, String string6, int n4, Object object) {
        int n7 = n4;
        int n8 = n4 & 0x20;
        PaymentInstruments paymentInstruments2 = n8 != 0 ? null : paymentInstruments;
        n8 = n7 & 0x40;
        HashSet hashSet2 = n8 != 0 ? null : hashSet;
        n8 = n7 & 0x80;
        String string7 = n8 != 0 ? null : string5;
        n8 = n7 & 0x100;
        List list2 = n8 != 0 ? null : list;
        String string8 = (n7 &= 0x200) != 0 ? null : string6;
        gAEcommerceEvents.sendCheckoutOptions(n3, string2, arrayList, string3, string4, paymentInstruments2, hashSet2, string7, list2, string8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void sendCheckoutOptionsGAV4(int n3, String string2, ArrayList arrayList, String string3, String string4, PaymentInstruments paymentInstruments, HashSet hashSet, String string5, List list, String string6) {
        Object object;
        double d2;
        int n4;
        float f5;
        int n7;
        double d5;
        ArrayList<yn3$a> arrayList2;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        int n8;
        GAEcommerceEvents gAEcommerceEvents;
        block50: {
            int n10;
            yn3$a yn3$a;
            block49: {
                gAEcommerceEvents = this;
                n8 = n3;
                object6 = arrayList;
                object5 = string3;
                object4 = string5;
                object3 = list;
                object2 = this.getGoogleTracker();
                ((Tracker)object2).setScreenName(string3);
                arrayList2 = new ArrayList<yn3$a>();
                yn3$a = null;
                if (arrayList != null && (n10 = arrayList.size()) > 0) break block49;
                long l2 = 0L;
                d5 = 0.0;
                break block50;
            }
            Object object7 = arrayList.iterator();
            object2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object7, (String)object2);
            double d7 = 0.0;
            int n14 = 0;
            Object object8 = null;
            while ((n10 = (int)(object7.hasNext() ? 1 : 0)) != 0) {
                block53: {
                    int n15;
                    int n16;
                    double d9;
                    Iterator iterator;
                    String[] stringArray;
                    Product product;
                    Object object9;
                    block54: {
                        Exception exception2;
                        block47: {
                            double d12;
                            block52: {
                                block51: {
                                    object2 = object7.next();
                                    Intrinsics.checkNotNullExpressionValue(object2, "next(...)");
                                    object9 = object2;
                                    object9 = (CartEntry)object2;
                                    object2 = ((CartEntry)object9).isGiftProduct();
                                    n10 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
                                    if (n10 != 0) break block51;
                                    product = ((CartEntry)object9).getProduct();
                                    object2 = product.getCode();
                                    stringArray = gAEcommerceEvents.trimProductId((String)object2);
                                    n10 = (int)(TextUtils.isEmpty((CharSequence)(object2 = stringArray[0])) ? 1 : 0);
                                    if (n10 == 0) break block52;
                                }
                                iterator = object7;
                                n8 = n3;
                                object6 = arrayList;
                                object5 = string3;
                                object4 = string5;
                                object3 = list;
                                break block53;
                            }
                            try {
                                object2 = ((CartEntry)object9).getBasePrice();
                                d12 = object2 != null && (object2 = ((Price)object2).getValue()) != null ? Double.parseDouble((String)object2) : 0.0;
                            }
                            catch (Exception exception2) {
                                break block47;
                            }
                            d9 = d12;
                            break block54;
                        }
                        yn3$a = yn3_0.a;
                        yn3$a.e(exception2);
                        d9 = 0.0;
                    }
                    Intrinsics.checkNotNull(product);
                    object2 = hv3_0.n(product);
                    yn3$a = new Bundle();
                    GAEcommerceEvents.addProductInfo(product, (Bundle)yn3$a);
                    lp_0.g((Bundle)yn3$a, (CartEntry)object9);
                    iterator = object7;
                    yn3$a.putInt("index", n14);
                    ++n14;
                    object7 = product.getBrandName();
                    String string7 = "";
                    if (object7 != null && (n16 = ((String)object7).length()) != 0) {
                        object7 = product.getBrandName();
                        n15 = n14;
                    } else {
                        n15 = n14;
                        object7 = string7;
                    }
                    object8 = PRODUCT_BRAND;
                    yn3$a.putString((String)object8, (String)object7);
                    n16 = (int)(((CartEntry)object9).isProductNSForGA() ? 1 : 0);
                    object7 = n16 == 0 && (n16 = (int)(((CartEntry)object9).isQuantityAvailable() ? 1 : 0)) != 0 ? "deliverable" : "non - deliverable";
                    lp_0.a((Bundle)yn3$a, (CartEntry)object9);
                    object8 = Ga4Events.INSTANCE;
                    object4 = (String)((Ga4Events)object8).getGav4DimensionMap().get(DIMEN_19);
                    int n17 = gAEcommerceEvents.getInventoryQuantity((CartEntry)object9);
                    object5 = new StringBuilder();
                    ((StringBuilder)object5).append(n17);
                    object3 = "|";
                    ((StringBuilder)object5).append((String)object3);
                    ((StringBuilder)object5).append((String)object7);
                    object5 = ((StringBuilder)object5).toString();
                    yn3$a.putString((String)object4, (String)object5);
                    n7 = 0;
                    f5 = 0.0f;
                    object5 = null;
                    object4 = stringArray[0];
                    n4 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
                    object4 = n4 != 0 ? string7 : stringArray[0];
                    yn3$a.putString("item_id", (String)object4);
                    object5 = product.getName();
                    n7 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0);
                    object5 = n7 != 0 ? string7 : product.getName();
                    yn3$a.putString("item_name", (String)object5);
                    object5 = product.getSegmentNameText();
                    object4 = "item_category";
                    object3 = PRODUCT_SEGMENT;
                    if (object5 != null && (n7 = ((String)object5).length()) != 0) {
                        object5 = (String)((Ga4Events)object8).getGav4DimensionMap().get(object3);
                        object3 = product.getSegmentNameText();
                        yn3$a.putString((String)object5, (String)object3);
                        object5 = product.getSegmentNameText();
                        yn3$a.putString((String)object4, (String)object5);
                    } else {
                        object5 = (String)((Ga4Events)object8).getGav4DimensionMap().get(object3);
                        object3 = product.getBrickCategory();
                        object3 = object3 != null && (n17 = ((String)object3).length()) != 0 ? product.getBrickCategory() : string7;
                        yn3$a.putString((String)object5, (String)object3);
                        object5 = product.getBrickCategory();
                        object5 = object5 != null && (n7 = ((String)object5).length()) != 0 ? product.getBrickCategory() : string7;
                        yn3$a.putString((String)object4, (String)object5);
                    }
                    object5 = product.getVerticalNameText();
                    object4 = "item_category2";
                    object3 = PRODUCT_VERTICLE;
                    if (object5 != null && (n7 = ((String)object5).length()) != 0) {
                        object5 = (String)((Ga4Events)object8).getGav4DimensionMap().get(object3);
                        object3 = product.getVerticalNameText();
                        yn3$a.putString((String)object5, (String)object3);
                        object5 = product.getVerticalNameText();
                        yn3$a.putString((String)object4, (String)object5);
                    } else {
                        object5 = (String)((Ga4Events)object8).getGav4DimensionMap().get(object3);
                        object3 = product.getBrickSubCategory();
                        object3 = object3 != null && (n17 = ((String)object3).length()) != 0 ? product.getBrickSubCategory() : string7;
                        yn3$a.putString((String)object5, (String)object3);
                        object5 = product.getBrickSubCategory();
                        object5 = object5 != null && (n7 = ((String)object5).length()) != 0 ? product.getBrickSubCategory() : string7;
                        yn3$a.putString((String)object4, (String)object5);
                    }
                    object5 = product.getBrickNameText();
                    object4 = "item_category3";
                    object3 = PRODUCT_BRICK;
                    if (object5 != null && (n7 = ((String)object5).length()) != 0) {
                        object5 = (String)((Ga4Events)object8).getGav4DimensionMap().get(object3);
                        object3 = product.getBrickNameText();
                        yn3$a.putString((String)object5, (String)object3);
                        object5 = product.getBrickNameText();
                        yn3$a.putString((String)object4, (String)object5);
                    } else {
                        object5 = (String)((Ga4Events)object8).getGav4DimensionMap().get(object3);
                        object3 = product.getBrickName();
                        object3 = object3 != null && (n17 = ((String)object3).length()) != 0 ? product.getBrickName() : string7;
                        yn3$a.putString((String)object5, (String)object3);
                        object5 = product.getBrickName();
                        object5 = object5 != null && (n7 = ((String)object5).length()) != 0 ? product.getBrickName() : string7;
                        yn3$a.putString((String)object4, (String)object5);
                    }
                    n7 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                    if (n7 != 0) {
                        object2 = string7;
                    }
                    object5 = "item_variant";
                    yn3$a.putString((String)object5, (String)object2);
                    object2 = product.getBrandName();
                    n10 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                    if (n10 == 0) {
                        string7 = product.getBrandName();
                    }
                    object2 = string7;
                    yn3$a.putString("item_brand", string7);
                    yn3$a.putDouble("price", d9);
                    object2 = ((Ga4Events)object8).getGav4DimensionMap();
                    object5 = "dimension16";
                    object2 = (String)object2.get(object5);
                    object4 = product.getWasPriceData();
                    n17 = 0;
                    object3 = null;
                    if (object4 != null) {
                        object4 = ((Price)object4).getValue();
                    } else {
                        n4 = 0;
                        object4 = null;
                    }
                    object4 = qz2_0.s(mz3_0.h((String)object4));
                    yn3$a.putString((String)object2, (String)object4);
                    object4 = "INR";
                    yn3$a.putString("currency", (String)object4);
                    object2 = ((CartEntry)object9).getQuantity();
                    if (object2 != null) {
                        long l3;
                        object2 = ((CartEntry)object9).getQuantity();
                        if (object2 == null) {
                            l3 = 1L;
                            d5 = Double.MIN_VALUE;
                        } else {
                            object2 = ((CartEntry)object9).getQuantity();
                            n10 = (Integer)object2;
                            l3 = n10;
                        }
                        object2 = "quantity";
                        yn3$a.putLong((String)object2, l3);
                    }
                    object2 = (String)((Ga4Events)object8).getGav4DimensionMap().get(STORE_SOURCE_ID_OLD);
                    object4 = ((CartEntry)object9).getProduct().getCatalogName();
                    if (object4 == null) {
                        object4 = ((CartEntry)object9).getProduct().getCatalog();
                    }
                    object4 = gAEcommerceEvents.getStoreTypeFromCatalog((String)object4);
                    yn3$a.putString((String)object2, (String)object4);
                    object2 = this.getSegmentIds();
                    if (object2 != null && (n10 = ((String)object2).length()) != 0) {
                        object2 = (String)((Ga4Events)object8).getGav4DimensionMap().get(PRODUCT_DISCOUNT);
                        cp_1.Companion.getClass();
                        object4 = cp$a.e();
                        product = ((CartEntry)object9).getProduct();
                        object4.getClass();
                        d5 = cp_1.w(product);
                        yn3$a.putDouble((String)object2, d5);
                    }
                    object2 = (String)((Ga4Events)object8).getGav4DimensionMap().get(object5);
                    cp_1.Companion.getClass();
                    object5 = cp$a.e();
                    object4 = ((CartEntry)object9).getProduct();
                    object5.getClass();
                    d2 = cp_1.x((Product)object4);
                    yn3$a.putDouble((String)object2, d2);
                    object2 = (String)((Ga4Events)object8).getGav4DimensionMap().get(DIMEN_SIZE);
                    object5 = cp$a.e();
                    object4 = ((CartEntry)object9).getProduct().getSelectedSizeVariant();
                    object5.getClass();
                    if (object4 != null) {
                        object5 = Y63.c((ProductOptionVariant)object4);
                    } else {
                        n7 = 0;
                        object5 = null;
                        f5 = 0.0f;
                    }
                    yn3$a.putString((String)object2, (String)object5);
                    object2 = ((CartEntry)object9).getAggregateRating();
                    if (object2 != null && (n10 = ((String)object2).length()) != 0) {
                        object2 = ((Ga4Events)object8).getGav4DimensionMap();
                        object5 = LD2.b;
                        object2 = (String)object2.get(object5);
                        object5 = ((CartEntry)object9).getAggregateRating();
                        yn3$a.putString((String)object2, (String)object5);
                    }
                    if ((object2 = lp_0.e((CartEntry)object9)) != null && (n7 = ((String)object2).length()) != 0) {
                        object5 = ((Ga4Events)object8).getGav4DimensionMap();
                        object4 = DIMEN_BARGAIN_TAG_NAME;
                        object5 = (String)object5.get(object4);
                        yn3$a.putString((String)object5, (String)object2);
                    }
                    object2 = cp$a.e();
                    object5 = ((CartEntry)object9).getSegmentId();
                    object4 = ((CartEntry)object9).getExperimentId();
                    object2.getClass();
                    object2 = cp_1.A((String)object5, (String)object4);
                    if (object2 != null) {
                        object5 = ((Ga4Events)object8).getGav4DimensionMap();
                        object4 = DIMEN_20;
                        object5 = (String)object5.get(object4);
                        yn3$a.putString((String)object5, (String)object2);
                    }
                    if ((object2 = ((CartEntry)object9).getProduct().isExchangeable()) != null) {
                        n7 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
                    } else {
                        n7 = 0;
                        f5 = 0.0f;
                        object5 = null;
                    }
                    object2 = ((CartEntry)object9).getProduct();
                    if (object2 != null && (object2 = ((Product)object2).getReturnWindow()) != null) {
                        n10 = ((Number)object2).intValue();
                    } else {
                        n10 = 0;
                        object2 = null;
                    }
                    object4 = mz3_0.a;
                    boolean bl2 = mz3_0.A();
                    if (bl2) {
                        product = ((CartEntry)object9).getProduct();
                        bl2 = product.isReturnable();
                        object2 = ((mz3_0)object4).l(n10, bl2, n7 != 0);
                        object5 = ((Ga4Events)object8).getGav4DimensionMap();
                        object4 = "dimension50";
                        object5 = (String)object5.get(object4);
                        yn3$a.putString((String)object5, (String)object2);
                    }
                    if ((object2 = ((CartEntry)object9).getEddFormattedDate()) != null && (n10 = ((String)object2).length()) != 0) {
                        object2 = (String)((Ga4Events)object8).getGav4DimensionMap().get(DIMEN_PRODUCT_EDD);
                        object5 = ((CartEntry)object9).getEddFormattedDate();
                        yn3$a.putString((String)object2, (String)object5);
                    }
                    if ((object2 = ((CartEntry)object9).getDeliveryTagName()) != null) {
                        object2 = ((CartEntry)object9).getDeliveryTagName();
                        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                        object2 = ((Pair)object2).a;
                        object5 = "null cannot be cast to non-null type kotlin.String";
                        Intrinsics.checkNotNull(object2, (String)object5);
                        object2 = (String)object2;
                        n7 = ((String)object2).length();
                        if (n7 > 0) {
                            object5 = ((Ga4Events)object8).getGav4DimensionMap();
                            object4 = DIMEN_DELIVERY_TAG;
                            object5 = (String)object5.get(object4);
                            yn3$a.putString((String)object5, (String)object2);
                        }
                    }
                    n10 = (int)(h40_0.Q1() ? 1 : 0);
                    if (n10 != 0) {
                        object2 = ((CartEntry)object9).getServicabilityInfo();
                        if (object2 != null && (object2 = ((ServicabilityInfo)object2).getPriorityDelivery()) != null) {
                            object3 = ((ServicabilityInfo$PriorityDelivery)object2).getDeliverySLA();
                        }
                        if (object3 != null) {
                            object2 = "priority_delivery_sla_tag";
                            yn3$a.putString((String)object2, (String)object3);
                        }
                    }
                    d7 += d9;
                    arrayList2.add(yn3$a);
                    n8 = n3;
                    object6 = arrayList;
                    object5 = string3;
                    object4 = string5;
                    object3 = list;
                    object7 = iterator;
                    n14 = n15;
                }
                yn3$a = null;
            }
            d5 = d7;
        }
        object2 = new Bundle();
        if (paymentInstruments != null && hashSet != null) {
            InternalWalletUtil.a.getClass();
            object2 = InternalWalletUtil.g(paymentInstruments, hashSet);
            object = qn1_2.Companion;
            object.getClass();
            n8 = (int)(qn1$a.a() ? 1 : 0);
            object6 = "payment_sdk";
            if (n8 != 0) {
                object = "juspay sdk";
                object2.putString((String)object6, (String)object);
            } else {
                object = "ajio sdk";
                object2.putString((String)object6, (String)object);
            }
        }
        object = this.getUserInformation().getUserStatusMessage();
        object2.putString("Logged In Status", (String)object);
        object6 = string3;
        object2.putString(SCREEN_KEY, string3);
        object2.putString("screen_name", string3);
        object2.putParcelableArrayList("items", arrayList2);
        object = this.getSegmentIds();
        if (object != null && (n8 = ((String)object).length()) != 0) {
            object = "pricing_cust_seg";
            object6 = this.getSegmentIds();
            object2.putString((String)object, (String)object6);
        }
        object = "payment_type";
        object6 = string5;
        if (string5 != null) {
            object2.putString((String)object, string5);
        }
        object6 = list;
        if (list != null && (n7 = list.size()) > 0) {
            n7 = 0;
            object5 = null;
            object6 = (CartAppliedVoucher)list.get(0);
            f5 = ((CartAppliedVoucher)object6).getValue();
            d2 = f5;
            object3 = "coupon";
            object6 = ((CartAppliedVoucher)object6).getVoucherCode();
            object2.putString((String)object3, (String)object6);
            object6 = "coupon_discount";
            object2.putDouble((String)object6, d2);
        }
        n7 = n3;
        long l4 = n3;
        object2.putLong("checkout_step", l4);
        object4 = string2;
        object2.putString("checkout_option", string2);
        object6 = arrayList;
        if (arrayList != null) {
            boolean bl3 = gAEcommerceEvents.containsLuxe1(arrayList);
            object6 = String.valueOf(bl3);
            object4 = CONTAINS_LUXE;
            object2.putString((String)object4, (String)object6);
        }
        object2.putString("isGA4", "true");
        object2.putDouble("value", d5);
        object2.putString(EVENT_CATEGORY, "Enhance E-commerce");
        object6 = EVENT_LABEL;
        object4 = "begin_checkout";
        object2.putString((String)object6, (String)object4);
        n4 = 2;
        if (n7 != n4) {
            n4 = 3;
            if (n7 != n4) {
                object = string4;
            } else {
                object5 = "checkout_progress";
                object2.putString((String)object6, (String)object5);
                object6 = String.valueOf(string6);
                object2.putString((String)object, (String)object6);
                object = "add_payment_info";
            }
        } else {
            object = "add_shipping_info";
        }
        object2.putString(EVENT_ACTION, (String)object);
        object6 = od3_2.a();
        gAEcommerceEvents.trackEcommerceEvent((String)object, (Bundle)object2, (String)object6);
    }

    public static /* synthetic */ void sendCheckoutOptionsGAV4$default(GAEcommerceEvents gAEcommerceEvents, int n3, String string2, ArrayList arrayList, String string3, String string4, PaymentInstruments paymentInstruments, HashSet hashSet, String string5, List list, String string6, int n4, Object object) {
        int n7 = n4;
        int n8 = n4 & 0x20;
        PaymentInstruments paymentInstruments2 = n8 != 0 ? null : paymentInstruments;
        n8 = n7 & 0x40;
        HashSet hashSet2 = n8 != 0 ? null : hashSet;
        n8 = n7 & 0x80;
        String string7 = n8 != 0 ? null : string5;
        n8 = n7 & 0x100;
        List list2 = n8 != 0 ? null : list;
        String string8 = (n7 &= 0x200) != 0 ? null : string6;
        gAEcommerceEvents.sendCheckoutOptionsGAV4(n3, string2, arrayList, string3, string4, paymentInstruments2, hashSet2, string7, list2, string8);
    }

    public static final void sendTransactionEvent(CartOrder cartOrder, String string2, String string3) {
        Object object = h40_0.a;
        object = INSTANCE;
        string3 = String.valueOf(string3);
        ((GAEcommerceEvents)object).sendTransactionEventGAv4(cartOrder, string2, string3);
    }

    private final void trackEcommerceEvent(String string2, Bundle bundle, String object) {
        int n3;
        String string3 = CONTAINS_STORE;
        if (object != null) {
            bundle.putString(string3, (String)object);
        } else {
            object = AnalyticsValues.INSTANCE.getStoreType();
            bundle.putString(string3, (String)object);
        }
        object = AnalyticsValues.INSTANCE.getStoreType();
        string3 = "store_type";
        bundle.putString(string3, (String)object);
        object = appPreferences.f();
        if (object != null) {
            string3 = ((Object)StringsKt.m0((CharSequence)object)).toString();
        } else {
            n3 = 0;
            string3 = null;
        }
        if (string3 != null && (n3 = string3.length()) != 0) {
            string3 = USER_TYPE;
            bundle.putString(string3, (String)object);
        }
        object = h40_0.a;
        bundle.putString(EVENT_CATEGORY, "Enhance E-commerce");
        bundle.putString("isGA4", "true");
        AJIOApplication.Companion.getClass();
        FirebaseAnalytics.getInstance((Context)AJIOApplication$a.a()).logEvent(string2, bundle);
    }

    public static /* synthetic */ void trackEcommerceEvent$default(GAEcommerceEvents gAEcommerceEvents, String string2, Bundle bundle, String string3, int n3, Object object) {
        if ((n3 &= 4) != 0) {
            string3 = null;
        }
        gAEcommerceEvents.trackEcommerceEvent(string2, bundle, string3);
    }

    private final String[] trimProductId(String object) {
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

    private static final UserInformation userInformation_delegate$lambda$0() {
        return VX0.a(AJIOApplication.Companion);
    }

    public final boolean containsLuxe(Product object) {
        String string2;
        if (object == null || (string2 = ((Product)object).getCatalogName()) == null) {
            string2 = object != null ? ((Product)object).getCatalog() : null;
        }
        object = this.getStoreTypeFromCatalog(string2);
        return "luxe".equalsIgnoreCase((String)object);
    }

    public final boolean containsLuxe(com.ril.ajio.services.data.returnexchange.Product object) {
        if (object == null || (object = ((com.ril.ajio.services.data.returnexchange.Product)object).getCatalogName()) == null) {
            object = "";
        }
        object = this.getStoreTypeFromCatalog((String)object);
        return "luxe".equalsIgnoreCase((String)object);
    }

    public final boolean containsLuxe(ArrayList object) {
        boolean bl2;
        block2: {
            boolean bl3;
            Intrinsics.checkNotNullParameter(object, "cartItems");
            object = ((ArrayList)object).iterator();
            Object object2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            while (bl3 = object.hasNext()) {
                Object object3;
                object2 = (CartEntry)object.next();
                if (object2 == null || (object3 = ((CartEntry)object2).getProduct()) == null || (object3 = ((Product)object3).getCatalogName()) == null) {
                    object3 = object2 != null && (object2 = ((CartEntry)object2).getProduct()) != null ? ((Product)object2).getCatalog() : null;
                }
                if (!(bl3 = ((String)(object3 = "luxe")).equalsIgnoreCase((String)(object2 = this.getStoreTypeFromCatalog((String)object3))))) continue;
                bl2 = true;
                break block2;
            }
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final boolean containsLuxe(List object) {
        boolean bl2;
        block2: {
            boolean bl3;
            Object object2 = "productList";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object = object.iterator();
            while (bl3 = object.hasNext()) {
                object2 = (Product)object.next();
                String string2 = ((Product)object2).getCatalogName();
                if (string2 == null) {
                    string2 = ((Product)object2).getCatalog();
                }
                if (!(bl3 = (string2 = "luxe").equalsIgnoreCase((String)(object2 = this.getStoreTypeFromCatalog(string2))))) continue;
                bl2 = true;
                break block2;
            }
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final boolean containsLuxe1(ArrayList object) {
        boolean bl2;
        boolean bl3 = false;
        if (object == null) {
            return false;
        }
        object = ((ArrayList)object).iterator();
        Object object2 = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        while (bl2 = object.hasNext()) {
            object2 = object.next();
            Intrinsics.checkNotNullExpressionValue(object2, "next(...)");
            Object object3 = ((CartEntry)(object2 = (CartEntry)object2)).isGiftProduct();
            boolean bl4 = (Boolean)object3;
            if (bl4) continue;
            object3 = ((CartEntry)object2).getProduct().getCatalogName();
            if (object3 == null) {
                object2 = ((CartEntry)object2).getProduct();
                object3 = ((Product)object2).getCatalog();
            }
            if (!(bl2 = ((String)(object3 = "luxe")).equalsIgnoreCase((String)(object2 = this.getStoreTypeFromCatalog((String)object3))))) continue;
            bl3 = true;
            break;
        }
        return bl3;
    }

    public final String getContainsStoreForCartEntries(ArrayList object) {
        int n3;
        HashSet<Object> hashSet = new HashSet<Object>();
        if (object != null && (n3 = ((ArrayList)object).size()) > 0) {
            object = ((ArrayList)object).iterator();
            Object object2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                int n4;
                int n7;
                Object object3;
                object2 = (CartEntry)object.next();
                if (object2 == null || (object3 = ((CartEntry)object2).getProduct()) == null || (object3 = ((Product)object3).getCatalogName()) == null) {
                    if (object2 != null && (object2 = ((CartEntry)object2).getProduct()) != null) {
                        object3 = ((Product)object2).getCatalog();
                    } else {
                        n7 = 0;
                        object3 = null;
                    }
                }
                if ((n7 = ((String)(object2 = this.getStoreTypeFromCatalog((String)object3))).hashCode()) != (n4 = -48226842)) {
                    n4 = 2994959;
                    if (n7 != n4) {
                        n4 = 3333686;
                        if (n7 != n4 || (n3 = (int)(((String)object2).equals(object3 = "luxe") ? 1 : 0)) == 0) continue;
                        hashSet.add(object3);
                        continue;
                    }
                    object3 = "ajio";
                    n3 = (int)(((String)object2).equals(object3) ? 1 : 0);
                    if (n3 == 0) continue;
                    hashSet.add(object3);
                    continue;
                }
                object3 = "ajiogram";
                n3 = (int)(((String)object2).equals(object3) ? 1 : 0);
                if (n3 == 0) continue;
                hashSet.add(object3);
            }
        }
        return CollectionsKt.R(hashSet, null, null, null, null, 63);
    }

    public final String getContainsStoreForCartEntry(ArrayList object) {
        int n3;
        HashSet<String> hashSet = new HashSet<String>();
        if (object != null && (n3 = ((ArrayList)object).size()) > 0) {
            object = ((ArrayList)object).iterator();
            Object object2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                int n4;
                int n7;
                object2 = object.next();
                Intrinsics.checkNotNullExpressionValue(object2, "next(...)");
                object2 = (CartEntry)object2;
                String string2 = ((CartEntry)object2).getProduct().getCatalogName();
                if (string2 == null) {
                    object2 = ((CartEntry)object2).getProduct();
                    string2 = ((Product)object2).getCatalog();
                }
                if ((n7 = ((String)(object2 = this.getStoreTypeFromCatalog(string2))).hashCode()) != (n4 = -48226842)) {
                    n4 = 2994959;
                    if (n7 != n4) {
                        n4 = 3333686;
                        if (n7 != n4 || (n3 = (int)(((String)object2).equals(string2 = "luxe") ? 1 : 0)) == 0) continue;
                        hashSet.add(string2);
                        continue;
                    }
                    string2 = "ajio";
                    n3 = (int)(((String)object2).equals(string2) ? 1 : 0);
                    if (n3 == 0) continue;
                    hashSet.add(string2);
                    continue;
                }
                string2 = "ajiogram";
                n3 = (int)(((String)object2).equals(string2) ? 1 : 0);
                if (n3 == 0) continue;
                hashSet.add(string2);
            }
        }
        return CollectionsKt.R(hashSet, null, null, null, null, 63);
    }

    public final int getInventoryQuantity(CartEntry comparable) {
        int n3;
        if (comparable != null && (comparable = ((CartEntry)comparable).getInventoryQty()) != null && (n3 = ((Number)((Object)comparable)).intValue()) > 0) {
            return n3;
        }
        return 0;
    }

    public final String getStoreSourceId(String string2) {
        if (string2 == null) {
            boolean bl2 = og1_1.c();
            string2 = bl2 ? "luxe" : "ajio";
        }
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String getStoreTypeFromCatalog(String object) {
        String string2;
        int n3;
        Object object2;
        Object object3 = this.getCatalogLuxuryBrandValues();
        Object object4 = "\\|";
        object3 = fT1.a((String)object4, (String)object3);
        int n4 = object3.isEmpty();
        int n7 = 1;
        if (n4 == 0) {
            n4 = object3.size();
            object2 = object3.listIterator(n4);
            while ((n3 = object2.hasPrevious()) != 0) {
                string2 = (String)object2.previous();
                n3 = string2.length();
                if (n3 == 0) continue;
                object3 = (Iterable)object3;
                n4 = object2.nextIndex() + n7;
                object3 = CollectionsKt.f0((Iterable)object3, n4);
                break;
            }
        } else {
            object3 = mz0_2.a;
        }
        object3 = CollectionsKt.i0((Iterable)object3);
        object2 = this.getCatalogAjiogramBrandValues();
        object4 = fT1.a((String)object4, (String)object2);
        n4 = (int)(object4.isEmpty() ? 1 : 0);
        if (n4 == 0) {
            n4 = object4.size();
            object2 = object4.listIterator(n4);
            while ((n3 = (int)(object2.hasPrevious() ? 1 : 0)) != 0) {
                string2 = (String)object2.previous();
                n3 = string2.length();
                if (n3 == 0) continue;
                object4 = (Iterable)object4;
                n4 = object2.nextIndex() + n7;
                object4 = CollectionsKt.f0((Iterable)object4, n4);
                break;
            }
        } else {
            object4 = mz0_2.a;
        }
        object4 = CollectionsKt.i0((Iterable)object4);
        boolean bl2 = CollectionsKt.F((Iterable)object3, object);
        if (bl2) {
            return "luxe";
        }
        object3 = "ajio";
        if (object != null && (n4 = (int)(((String)object).equalsIgnoreCase((String)(object2 = "rilfnlProductCatalog")) ? 1 : 0)) == n7) {
            return object3;
        }
        boolean bl3 = CollectionsKt.F((Iterable)object4, object);
        if (!bl3) return object3;
        return "ajiogram";
    }

    public final UserInformation getUserInformation() {
        Object object = userInformation$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (UserInformation)object;
    }

    public final void pushAddRemoveCartItem(Product product, String string2, String string3, int n3, String string4, String string5, boolean bl2, String string6, String string7, String string8, String string9, String string10, boolean bl3) {
        Intrinsics.checkNotNullParameter(string4, "price");
        Intrinsics.checkNotNullParameter(string6, "screenName");
        Intrinsics.checkNotNullParameter(string8, "eventCategory");
        this.pushAddRemoveCartItemGAV4(product, string2, string3, n3, string4, string5, bl2, string6, string7, string8, string9, string10, bl3);
    }

    public final void pushGAEventBundle(String string2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(bundle, "eventMap");
        Object object = Locale.getDefault();
        Object object2 = new SimpleDateFormat("EEE MMM dd,yyyy HH:mm:ss", (Locale)object);
        long l2 = System.currentTimeMillis();
        Object object3 = l2;
        object2 = ((Format)object2).format(object3);
        bundle.putString("DateTime", (String)object2);
        hv3_0.a.getClass();
        object2 = "android.permission.POST_NOTIFICATIONS";
        int n3 = hv3_0.R((String)object2);
        object3 = "NOTIFICATION_PERMISSION_STATUS";
        if (n3 != 0) {
            n3 = 1;
            bundle.putBoolean((String)object3, n3 != 0);
        } else {
            n3 = 0;
            object2 = null;
            bundle.putBoolean((String)object3, false);
        }
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a();
        if (object2 != null) {
            object2 = object2.getContentResolver();
        } else {
            n3 = 0;
            object2 = null;
        }
        object2 = Settings.Secure.getString((ContentResolver)object2, (String)"android_id");
        bundle.putString("DEVICE_ID", (String)object2);
        int n4 = 3444;
        bundle.putInt("current app version", n4);
        object2 = Build.MANUFACTURER;
        object3 = Build.MODEL;
        object = new StringBuilder();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(" ");
        ((StringBuilder)object).append((String)object3);
        object2 = ((StringBuilder)object).toString();
        bundle.putString("DEVICE_NAME", (String)object2);
        n3 = Build.VERSION.SDK_INT;
        String string3 = "Android/";
        object = new StringBuilder(string3);
        ((StringBuilder)object).append(n3);
        object2 = ((StringBuilder)object).toString();
        bundle.putString("DEVICE_OS", (String)object2);
        object2 = "UserID";
        object = this.getUserId();
        bundle.putString((String)object2, (String)object);
        if (object3 != null && (n3 = ((String)object3).length()) != 0) {
            object2 = "DEVICE_MODEL";
            bundle.putString((String)object2, (String)object3);
        }
        object2 = h40_0.a;
        bundle.putString("isGA4", "true");
        object = this;
        string3 = string2;
        GAEcommerceEvents.trackEcommerceEvent$default(this, string2, bundle, null, 4, null);
    }

    public final void pushGameZonePlayEvent(String string2, String object, String string3, String string4, String string5, String object2) {
        Object object3 = "userStatus";
        Bundle bundle = dm_1.a(string2, "event", (String)object2, (String)object3);
        object2 = VX0.a(AJIOApplication.Companion);
        String string6 = ((UserInformation)object2).getEncryptedUuid();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string6);
        Object object4 = "N/A";
        if (bl2) {
            string6 = object4;
        } else {
            cp_1.Companion.getClass();
            object3 = cp$a.e();
            object3.getClass();
            string6 = cp_1.L(string6);
        }
        object3 = appPreferences;
        String string7 = ((jo_2)object3).a();
        boolean bl3 = TextUtils.isEmpty((CharSequence)string7);
        if (!bl3) {
            object4 = ((jo_2)object3).a();
        }
        bundle.putString(EVENT_ACTION, (String)object);
        bundle.putString(EVENT_LABEL, string3);
        bundle.putString(SCREEN_KEY, string5);
        bundle.putString("screen_name", string5);
        bundle.putString("userId", string6);
        bundle.putString("game_name", string4);
        bundle.putString("Client_ID", (String)object4);
        object = rj_0.b();
        bundle.putString("Time_of_the_day", (String)object);
        string3 = ((UserInformation)object2).getUserStatus();
        bundle.putString("user_status", string3);
        object = h40_0.a;
        bundle.putString("isGA4", "true");
        object4 = this;
        string7 = string2;
        GAEcommerceEvents.trackEcommerceEvent$default(this, string2, bundle, null, 4, null);
    }

    public final void pushOrderCancelEvent(String string2, CartEntry cartEntry, String string3, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(string3, "screenName");
        this.pushOrderCancelEventGAV4(string2, cartEntry, string3, hashMap);
    }

    public final void pushOrderReturnEvent(String string2, ArrayList arrayList, String string3, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "returnEntries");
        Intrinsics.checkNotNullParameter(string3, "screenName");
        this.pushOrderReturnEventGAV4(string2, arrayList, string3, arrayList2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void pushOrderReturnEventGAV4(String object, ArrayList object2, String string2, ArrayList arrayList) {
        block6: {
            Object object3;
            int n3;
            int n4;
            double d2;
            Bundle bundle;
            Object object4;
            block7: {
                Intrinsics.checkNotNullParameter(object2, "returnEntries");
                object4 = "screenName";
                Intrinsics.checkNotNullParameter(string2, (String)object4);
                int n7 = ((ArrayList)object2).size();
                if (n7 <= 0) break block6;
                object2 = "transaction_id";
                bundle = E1.a((String)object2, (String)object);
                object = new ArrayList();
                d2 = 0.0;
                if (arrayList == null) break block7;
                object2 = arrayList.iterator();
                Intrinsics.checkNotNullExpressionValue(object2, "iterator(...)");
                arrayList = null;
                n4 = 0;
                while ((n3 = object2.hasNext()) != 0) {
                    Object object5;
                    Object object6;
                    block8: {
                        NumberFormatException numberFormatException2;
                        block5: {
                            object6 = object2.next();
                            object3 = "next(...)";
                            Intrinsics.checkNotNullExpressionValue(object6, (String)object3);
                            object6 = (CartEntry)object6;
                            try {
                                object3 = ((CartEntry)object6).getOrderEntry();
                                object3 = ((CartEntry)object3).getBasePrice();
                                object3 = object3 != null ? ((Price)object3).getValue() : null;
                            }
                            catch (NumberFormatException numberFormatException2) {
                                break block5;
                            }
                            if (object3 != null) {
                                object3 = ((CartEntry)object6).getOrderEntry();
                                object3 = ((CartEntry)object3).getBasePrice();
                                object3 = ((Price)object3).getValue();
                                Intrinsics.checkNotNull(object3);
                                double d5 = Double.parseDouble((String)object3);
                                d2 += d5;
                            }
                            break block8;
                        }
                        object5 = yn3_0.a;
                        object5.e(numberFormatException2);
                    }
                    object3 = new Bundle();
                    object5 = String.valueOf(((CartEntry)object6).getOrderEntry().getProduct().getCode());
                    String string3 = (object5 = this.trimProductId((String)object5))[0];
                    boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
                    object5 = bl2 ? "" : object5[0];
                    string3 = "item_id";
                    object3.putString(string3, (String)object5);
                    int n8 = ((CartEntry)object6).getOrderEntry().getReturnEditedQuantity();
                    long l2 = n8;
                    String string4 = "quantity";
                    object3.putLong(string4, l2);
                    object5 = ((CartEntry)object6).getOrderEntry().getProduct();
                    if (object5 != null) {
                        object6 = ((CartEntry)object6).getOrderEntry().getProduct();
                        GAEcommerceEvents.addProductInfo((Product)object6, (Bundle)object3);
                    }
                    object6 = "index";
                    object3.putInt((String)object6, n4);
                    ((ArrayList)object).add(object3);
                    ++n4;
                }
            }
            bundle.putString(SCREEN_KEY, string2);
            bundle.putString("screen_name", string2);
            bundle.putParcelableArrayList("items", object);
            bundle.putString("isGA4", "true");
            bundle.putDouble("value", d2);
            bundle.putString(EVENT_CATEGORY, "Enhance E-commerce");
            bundle.putString(EVENT_ACTION, "refund");
            object = AppsFlyerLib.getInstance();
            AJIOApplication.Companion.getClass();
            object2 = AJIOApplication$a.a();
            object = ((AppsFlyerLib)object).getAppsFlyerUID((Context)object2);
            object2 = "af_id";
            bundle.putString((String)object2, (String)object);
            String string5 = "refund";
            n4 = 0;
            n3 = 4;
            object3 = null;
            object4 = this;
            GAEcommerceEvents.trackEcommerceEvent$default(this, string5, bundle, null, n3, null);
        }
    }

    public final void pushProductFetchEvent(ProductsList object, String string2, String object2) {
        boolean bl2;
        Object object3;
        Object object4;
        boolean bl3;
        int n3;
        Pagination pagination;
        int n4;
        Intrinsics.checkNotNullParameter(object, "productsList");
        Intrinsics.checkNotNullParameter(object2, "userStatus");
        object2 = ((ProductsList)object).getPagination();
        Object object5 = null;
        if (object2 != null) {
            object2 = ((ProductsList)object).getPagination();
            Intrinsics.checkNotNull(object2);
            n4 = ((Pagination)object2).getCurrentPage();
            pagination = ((ProductsList)object).getPagination();
            Intrinsics.checkNotNull(pagination);
            n3 = pagination.getPageSize();
        } else {
            n4 = 0;
            object2 = null;
            n3 = 0;
            pagination = null;
        }
        Bundle bundle = new Bundle();
        object = ((ProductsList)object).getProducts();
        Intrinsics.checkNotNull(object);
        object = object.iterator();
        Object object6 = "";
        String string3 = object6;
        while (bl3 = object.hasNext()) {
            object4 = (Product)object.next();
            object3 = ((Product)object4).getFnlColorVariantData();
            if (object3 == null) continue;
            object3 = ((Product)object4).getFnlColorVariantData();
            String string4 = null;
            if (object3 != null) {
                object3 = ((ProductFnlColorVariantData)object3).getColorGroup();
            } else {
                bl2 = false;
                object3 = null;
            }
            if (bl2 = TextUtils.isEmpty((CharSequence)object3)) continue;
            if ((object4 = ((Product)object4).getFnlColorVariantData()) != null) {
                string4 = ((ProductFnlColorVariantData)object4).getColorGroup();
            }
            object4 = ", ";
            string3 = n1.a(string3, string4, (String)object4);
        }
        int n7 = Intrinsics.areEqual(string3, object6);
        if (n7 == 0) {
            object6 = ",";
            n7 = StringsKt.R(string3, (String)object6, 0, 6);
            string3 = string3.substring(0, n7);
            object = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string3, (String)object);
        }
        object = VX0.a(AJIOApplication.Companion);
        object5 = ((UserInformation)object).getEncryptedUuid();
        boolean bl4 = TextUtils.isEmpty((CharSequence)object5);
        object4 = "N/A";
        if (bl4) {
            object5 = object4;
        } else {
            cp_1.Companion.getClass();
            object6 = cp$a.e();
            object6.getClass();
            object5 = cp_1.L((String)object5);
        }
        object6 = appPreferences;
        object3 = ((jo_2)object6).a();
        bl2 = TextUtils.isEmpty((CharSequence)object3);
        if (!bl2) {
            object4 = ((jo_2)object6).a();
        }
        bundle.putString(EVENT_ACTION, "plp product load");
        bundle.putInt(EVENT_LABEL, n4);
        bundle.putString(SCREEN_KEY, string2);
        bundle.putString("screen_name", string2);
        bundle.putString("userId", (String)object5);
        bundle.putString("Client_ID", (String)object4);
        string2 = rj_0.b();
        bundle.putString("Time_of_the_day", string2);
        object = ((UserInformation)object).getUserStatus();
        bundle.putString("user_status", (String)object);
        bundle.putString("product_ids", string3);
        bundle.putInt("page_number", n4);
        bundle.putInt("number_of_products_loaded", n3);
    }

    public final void pushProductListImpressionData(List list, String string2, boolean bl2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(list, "productList");
        String string3 = GAUtils.Companion.getGAViewItemList();
        this.pushProductListImpressionDataGAV4(string3, list, string2, bl2, bundle);
    }

    public final void pushWishListImpressionData(String object, List list, String string2, boolean bl2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(object, "eventName");
        Intrinsics.checkNotNullParameter(list, "productList");
        Intrinsics.checkNotNullParameter(string3, "listName");
        Intrinsics.checkNotNullParameter(string4, "screenName");
        object = h40_0.a;
        this.pushWishListImpressionDataGAV4("view_item_list", list, string2, bl2, string3, string4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void pushWishListImpressionDataGAV4(String string2, List list, String string3, boolean bl2, String string4, String string5) {
        GAEcommerceEvents gAEcommerceEvents = this;
        Object object = string2;
        Object object2 = list;
        boolean bl3 = bl2;
        Object object3 = string4;
        String string6 = string5;
        String string7 = "shortText";
        String string8 = "longText";
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(list, "productList");
        Intrinsics.checkNotNullParameter(string4, "listName");
        Object object4 = "screenName";
        Intrinsics.checkNotNullParameter(string5, (String)object4);
        Object object5 = new Object();
        Object object6 = new HashSet();
        Object object7 = list.iterator();
        while (true) {
            int n3;
            double d2;
            ArrayList<String> arrayList;
            Object object8;
            String string9;
            Object object9;
            Object object10;
            String string10;
            String string11;
            String string12;
            block68: {
                int n4;
                int n7;
                block69: {
                    block66: {
                        int n8;
                        double d5;
                        long l2;
                        int n10;
                        block67: {
                            NumberFormatException numberFormatException2;
                            block65: {
                                block64: {
                                    n10 = object7.hasNext();
                                    string12 = EVENT_ACTION;
                                    string11 = "Enhance E-commerce";
                                    string10 = EVENT_CATEGORY;
                                    object10 = "";
                                    if (n10 == 0) break block66;
                                    object3 = object4 = object7.next();
                                    object3 = (Product)object4;
                                    if ((object4 = ((Product)object3).getCatalogName()) == null) {
                                        object4 = ((Product)object3).getCatalog();
                                    }
                                    object4 = gAEcommerceEvents.getStoreTypeFromCatalog((String)object4);
                                    ((HashSet)object6).add(object4);
                                    string6 = new Bundle();
                                    object4 = ((Product)object3).getFnlColorVariantData();
                                    if (object4 != null) {
                                        boolean bl4;
                                        object4 = ((Product)object3).getFnlColorVariantData();
                                        if (object4 != null) {
                                            object4 = ((ProductFnlColorVariantData)object4).getColorGroup();
                                        } else {
                                            n10 = 0;
                                            object4 = null;
                                        }
                                        n10 = TextUtils.isEmpty((CharSequence)object4);
                                        if (n10 == 0) {
                                            object4 = ((Product)object3).getFnlColorVariantData();
                                            Intrinsics.checkNotNull(object4);
                                            object4 = ((ProductFnlColorVariantData)object4).getColorGroup();
                                            Intrinsics.checkNotNull(object4);
                                        } else {
                                            object4 = object10;
                                        }
                                        object9 = ((Product)object3).getFnlColorVariantData();
                                        if (object9 != null) {
                                            object9 = ((ProductFnlColorVariantData)object9).getBrandName();
                                        } else {
                                            bl4 = false;
                                            object9 = null;
                                        }
                                        bl4 = TextUtils.isEmpty((CharSequence)object9);
                                        if (!bl4) {
                                            object9 = ((Product)object3).getFnlColorVariantData();
                                            Intrinsics.checkNotNull(object9);
                                            object9 = ((ProductFnlColorVariantData)object9).getBrandName();
                                            Intrinsics.checkNotNull(object9);
                                            string9 = object10;
                                            object10 = object9;
                                            object9 = object7;
                                        } else {
                                            object9 = object7;
                                            string9 = object10;
                                        }
                                        object7 = object4;
                                    } else {
                                        object9 = object7;
                                        object7 = object10;
                                        string9 = object10;
                                    }
                                    object4 = ((Product)object3).getFnlProductData();
                                    if (object4 != null) {
                                        object4 = ((Product)object3).getFnlProductData();
                                        if (object4 != null) {
                                            object4 = ((ProductfnlProductData)object4).getPlanningCategory();
                                        } else {
                                            n10 = 0;
                                            object4 = null;
                                        }
                                        n10 = TextUtils.isEmpty((CharSequence)object4);
                                        if (n10 == 0) {
                                            object4 = ((Product)object3).getFnlProductData();
                                            Intrinsics.checkNotNull(object4);
                                            object4 = ((ProductfnlProductData)object4).getPlanningCategory();
                                            Intrinsics.checkNotNull(object4);
                                        }
                                    }
                                    try {
                                        object4 = ((Product)object3).getPrice();
                                        if (object4 != null && (object4 = ((Price)object4).getValue()) != null) break block64;
                                    }
                                    catch (NumberFormatException numberFormatException2) {
                                        object8 = object6;
                                        break block65;
                                    }
                                    object4 = "0";
                                }
                                double d7 = Double.parseDouble((String)object4);
                                arrayList = object5;
                                object8 = object6;
                                d2 = d7;
                                break block67;
                            }
                            object6 = yn3_0.a;
                            ((yn3$a)object6).e(numberFormatException2);
                            arrayList = object5;
                            l2 = 0L;
                            d2 = 0.0;
                        }
                        object2 = ((Product)object3).getName();
                        string6.putString("item_name", (String)object2);
                        object4 = ((Product)object3).getSegmentNameText();
                        object2 = "item_category";
                        object = PRODUCT_SEGMENT;
                        if (object4 != null && (n10 = ((String)object4).length()) != 0) {
                            object4 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object);
                            object = ((Product)object3).getSegmentNameText();
                            string6.putString((String)object4, (String)object);
                            object4 = ((Product)object3).getSegmentNameText();
                            string6.putString((String)object2, (String)object4);
                        } else {
                            object4 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object);
                            object = ((Product)object3).getBrickCategory();
                            object = object != null && (n7 = ((String)object).length()) != 0 ? ((Product)object3).getBrickCategory() : string9;
                            string6.putString((String)object4, (String)object);
                            object4 = ((Product)object3).getBrickCategory();
                            object4 = object4 != null && (n10 = ((String)object4).length()) != 0 ? ((Product)object3).getBrickCategory() : string9;
                            string6.putString((String)object2, (String)object4);
                        }
                        object4 = ((Product)object3).getVerticalNameText();
                        object = "item_category2";
                        object2 = PRODUCT_VERTICLE;
                        if (object4 != null && (n10 = ((String)object4).length()) != 0) {
                            object4 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object2);
                            object2 = ((Product)object3).getVerticalNameText();
                            string6.putString((String)object4, (String)object2);
                            object4 = ((Product)object3).getVerticalNameText();
                            string6.putString((String)object, (String)object4);
                        } else {
                            object4 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object2);
                            object2 = ((Product)object3).getBrickSubCategory();
                            object2 = object2 != null && (n3 = ((String)object2).length()) != 0 ? ((Product)object3).getBrickSubCategory() : string9;
                            string6.putString((String)object4, (String)object2);
                            object4 = ((Product)object3).getBrickSubCategory();
                            object4 = object4 != null && (n10 = ((String)object4).length()) != 0 ? ((Product)object3).getBrickSubCategory() : string9;
                            string6.putString((String)object, (String)object4);
                        }
                        object4 = ((Product)object3).getBrickNameText();
                        object = "item_category3";
                        object2 = PRODUCT_BRICK;
                        if (object4 != null && (n10 = ((String)object4).length()) != 0) {
                            object4 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object2);
                            object2 = ((Product)object3).getBrickNameText();
                            string6.putString((String)object4, (String)object2);
                            object4 = ((Product)object3).getBrickNameText();
                            string6.putString((String)object, (String)object4);
                        } else {
                            object4 = (String)Ga4Events.INSTANCE.getGav4DimensionMap().get(object2);
                            object2 = ((Product)object3).getBrickName();
                            object2 = object2 != null && (n3 = ((String)object2).length()) != 0 ? ((Product)object3).getBrickName() : string9;
                            string6.putString((String)object4, (String)object2);
                            object4 = ((Product)object3).getBrickName();
                            object4 = object4 != null && (n10 = ((String)object4).length()) != 0 ? ((Product)object3).getBrickName() : string9;
                            string6.putString((String)object, (String)object4);
                        }
                        string6.putString("item_brand", (String)object10);
                        string6.putDouble("price", d2);
                        object = "INR";
                        string6.putString("currency", (String)object);
                        n10 = ((Product)object3).getPosition();
                        long l3 = n10;
                        string6.putLong("index", l3);
                        object4 = ((Product)object3).getWasPriceData();
                        if (object4 != null && (object4 = ((Price)object4).getValue()) != null) {
                            d5 = Double.parseDouble((String)object4);
                            string6.putDouble(MRP, d5);
                            object4 = Unit.a;
                        }
                        if ((object4 = ((Product)object3).getWasPriceData()) != null && (object4 = ((Price)object4).getValue()) != null) {
                            d5 = Double.parseDouble((String)object4);
                        } else {
                            l3 = 0L;
                            d5 = 0.0;
                        }
                        object4 = ((Product)object3).getPrice();
                        if (object4 != null && (object4 = ((Price)object4).getValue()) != null) {
                            d2 = Double.parseDouble((String)object4);
                        } else {
                            l2 = 0L;
                            d2 = 0.0;
                        }
                        string6.putDouble(DISCOUNT, d5 -= d2);
                        object4 = ((Product)object3).getDiscountPercent();
                        n7 = 0;
                        object = null;
                        if (object4 != null && (object4 = StringsKt.a0((CharSequence)object4, (String[])(object2 = new String[]{"%"}), false, 0, n4 = 6)) != null && (object4 = (String)object4.get(0)) != null) {
                            d2 = Double.parseDouble((String)object4);
                            string6.putDouble(TRADE_DISCOUNT, d2);
                            object4 = Unit.a;
                        }
                        object4 = Ga4Events.INSTANCE;
                        object2 = (String)((Ga4Events)object4).getGav4DimensionMap().get(STORE_SOURCE_ID_OLD);
                        object5 = ((Product)object3).getCatalogName();
                        if (object5 == null) {
                            object5 = ((Product)object3).getCatalog();
                        }
                        object5 = gAEcommerceEvents.getStoreTypeFromCatalog((String)object5);
                        string6.putString((String)object2, (String)object5);
                        object2 = ((Product)object3).getFnlColorVariantData();
                        if (object2 != null) {
                            object5 = hv3_0.a;
                            object5.getClass();
                            object2 = hv3_0.A((ProductFnlColorVariantData)object2);
                            if (object2 != null) {
                                object5 = ((Ga4Events)object4).getGav4DimensionMap();
                                object6 = PRODUCT_TEASER_TAGS;
                                object5 = (String)object5.get(object6);
                                string6.putString((String)object5, (String)object2);
                            }
                            object2 = Unit.a;
                        }
                        object2 = tr2_2.a;
                        n3 = (int)(tr2_2.v(og1_1.c()) ? 1 : 0);
                        n4 = 1;
                        if (n3 != 0) {
                            float f5;
                            n3 = (int)(tr2_2.p(false) ? 1 : 0);
                            object6 = DIMEN_SALE_PRICE;
                            if (n3 != 0) {
                                float f6;
                                object2 = (String)((Ga4Events)object4).getGav4DimensionMap().get(object6);
                                object6 = ((Product)object3).getOfferPrice();
                                object10 = null;
                                if (object6 != null && (object6 = ((Price)object6).getPriceReveal()) != null && (object6 = ((PriceReveal)object6).getBestPrice()) != null) {
                                    f5 = ((Float)object6).floatValue();
                                } else {
                                    n8 = 0;
                                    f5 = 0.0f;
                                    object6 = null;
                                }
                                n8 = (int)((f6 = f5 - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
                                if (n8 > 0) {
                                    n7 = 1;
                                }
                                object = String.valueOf(n7 != 0);
                                string6.putString((String)object2, (String)object);
                            } else {
                                object2 = (String)((Ga4Events)object4).getGav4DimensionMap().get(object6);
                                object6 = ((Product)object3).getOfferPrice();
                                if (object6 != null) {
                                    object6 = ((Price)object6).getValue();
                                } else {
                                    n8 = 0;
                                    object6 = null;
                                    f5 = 0.0f;
                                }
                                if (object6 == null || (n8 = ((String)object6).length()) == 0) {
                                    n7 = 1;
                                }
                                object = String.valueOf((n7 ^= n4) != 0);
                                string6.putString((String)object2, (String)object);
                            }
                        }
                        cp_1.Companion.getClass();
                        object = cp$a.e();
                        object.getClass();
                        n7 = (int)(cp_1.F((Product)object3) ? 1 : 0);
                        object2 = cp$a.e();
                        object2.getClass();
                        l2 = cp_1.y((Product)object3);
                        object10 = DIMEN_19;
                        if (n7 != 0) {
                            cp$a.e().getClass();
                            object = cp_1.t((Product)object3);
                            object5 = (String)((Ga4Events)object4).getGav4DimensionMap().get(object10);
                            object6 = "0 | non-deliverable | ";
                            k01_0.a((String)object6, (String)object, (Bundle)string6, (String)object5);
                        } else {
                            object = (String)((Ga4Events)object4).getGav4DimensionMap().get(object10);
                            object10 = new StringBuilder();
                            ((StringBuilder)object10).append(l2);
                            ((StringBuilder)object10).append(" | deliverable");
                            object5 = ((StringBuilder)object10).toString();
                            string6.putString((String)object, (String)object5);
                        }
                        object = ih3_1.b;
                        n7 = ((HashSet)object).contains(object7);
                        object5 = DIMEN_WISHLIST_STATE;
                        if (n7 != 0) {
                            object = (String)((Ga4Events)object4).getGav4DimensionMap().get(object5);
                            object5 = "wishlisted";
                            string6.putString((String)object, (String)object5);
                        } else {
                            object = (String)((Ga4Events)object4).getGav4DimensionMap().get(object5);
                            object5 = "not wishlisted";
                            string6.putString((String)object, (String)object5);
                        }
                        hv3_0.a.getClass();
                        object = (String)hv3_0.H((Product)object3, (boolean)bl3).b;
                        object5 = (String)hv3_0.h((Product)object3, (boolean)bl3).b;
                        if (object != null) {
                            n8 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                            if (n8 == 0) {
                                object6 = ((Ga4Events)object4).getGav4DimensionMap();
                                object7 = DIMEN_SELLING_POINT_TAG_NAME;
                                object6 = (String)object6.get(object7);
                                string6.putString((String)object6, (String)object);
                            }
                            object = Unit.a;
                        }
                        if ((n4 = ((String)(object = mz3_0.n((Product)object3, (String)object5))).length()) > 0) {
                            object5 = ((Ga4Events)object4).getGav4DimensionMap();
                            object6 = DIMEN_BARGAIN_TAG_NAME;
                            object5 = (String)object5.get(object6);
                            string6.putString((String)object5, (String)object);
                        }
                        if ((object = this.getSegmentIds()) != null && (n7 = ((String)object).length()) != 0) {
                            object4 = (String)((Ga4Events)object4).getGav4DimensionMap().get(PRODUCT_DISCOUNT);
                            object = cp$a.e();
                            object.getClass();
                            d2 = cp_1.w((Product)object3);
                            string6.putDouble(object4, d2);
                        }
                        if ((n10 = (int)(hv3_0.y(bl2) ? 1 : 0)) == 0 || (object4 = ((Product)object3).getTags()) == null || (object4 = ((Tag)object4).getCategoryTags()) == null) break block68;
                        object4 = ((Iterable)object4).iterator();
                        break block69;
                    }
                    object2 = string3;
                    object3 = object5;
                    object8 = object6;
                    string9 = object10;
                    object4 = new Bundle();
                    string6 = string4;
                    double d9 = 0.0;
                    object4.putString("list_name", string4);
                    object4.putParcelableArrayList("items", object5);
                    object3 = string5;
                    object4.putString(SCREEN_KEY, string5);
                    object4.putString("screen_name", string5);
                    String string13 = this.getSegmentIds();
                    if (string13 != null && (bl3 = string13.length())) {
                        string13 = "pricing_cust_seg";
                        object3 = this.getSegmentIds();
                        object4.putString(string13, (String)object3);
                    }
                    if (bl3 = (boolean)TextUtils.isEmpty((CharSequence)string3)) {
                        object2 = string9;
                    }
                    object4.putString(EVENT_LABEL, (String)object2);
                    object2 = list;
                    object2 = String.valueOf(gAEcommerceEvents.containsLuxe(list));
                    object4.putString(CONTAINS_LUXE, (String)object2);
                    string13 = od3_2.a();
                    object4.putString("store_type", string13);
                    object4.putString("isGA4", "true");
                    object4.putDouble("value", d9);
                    object4.putString(string10, string11);
                    object4.putString(string12, (String)object);
                    object6 = object8;
                    object2 = CollectionsKt.R((Iterable)object8, null, null, null, null, 63);
                    gAEcommerceEvents.trackEcommerceEvent((String)object, (Bundle)object4, (String)object2);
                    return;
                }
                while ((n7 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                    object = (CategoryTags)object4.next();
                    if (object != null && (object5 = ((CategoryTags)object).getCategory()) != null) {
                        object6 = "SOCIAL_PROOFING";
                        n4 = (int)(((String)object5).equalsIgnoreCase((String)object6) ? 1 : 0);
                        if (n4 != (n3 = 1)) continue;
                        object5 = ((CategoryTags)object).getPrimary();
                        if (object5 != null) {
                            object5 = ((TagPrimary)object5).getValue();
                        } else {
                            n4 = 0;
                            object5 = null;
                        }
                        object5 = String.valueOf(object5);
                        try {
                            object5 = JsonParser.parseString((String)object5);
                            object5 = ((JsonElement)object5).getAsJsonObject();
                            object6 = cp_1.Companion;
                            object = ((CategoryTags)object).getPrimary();
                            if (object != null) {
                                object = ((TagPrimary)object).getName();
                            } else {
                                n7 = 0;
                                object = null;
                            }
                            object6.getClass();
                            n7 = (int)(cp$a.x((String)object) ? 1 : 0);
                            object6 = DIMEN_WISHLIST_COUNT;
                            if (n7 != 0) {
                                if (object5 == null || (n7 = (int)(((JsonObject)object5).has(string8) ? 1 : 0)) == 0) continue;
                                object = ((JsonObject)object5).get(string8);
                                object = ((JsonElement)object).getAsString();
                                object5 = Ga4Events.INSTANCE;
                                object5 = ((Ga4Events)object5).getGav4DimensionMap();
                                object5 = object5.get(object6);
                                object5 = (String)object5;
                                string6.putString((String)object5, (String)object);
                                continue;
                            }
                            if (object5 == null || (n7 = (int)(((JsonObject)object5).has(string7) ? 1 : 0)) == 0) continue;
                            object = ((JsonObject)object5).get(string7);
                            object = ((JsonElement)object).getAsString();
                            object5 = Ga4Events.INSTANCE;
                            object5 = ((Ga4Events)object5).getGav4DimensionMap();
                            object5 = object5.get(object6);
                            object5 = (String)object5;
                            string6.putString((String)object5, (String)object);
                        }
                        catch (Exception exception) {}
                        continue;
                    }
                    n3 = 1;
                }
                object4 = Unit.a;
            }
            object4 = Ga4Events.INSTANCE;
            object = (String)((Ga4Events)object4).getGav4DimensionMap().get("dimension166");
            object2 = ((Product)object3).getAdsData();
            if (object2 == null || (object2 = ((AdsData)object2).getConfig()) == null || (object2 = ((Config)object2).getC()) == null) {
                object2 = string9;
            }
            string6.putString((String)object, (String)object2);
            object = (String)((Ga4Events)object4).getGav4DimensionMap().get("dimension167");
            object2 = el1_2.a;
            n3 = (int)(el1_2.i((Product)object3) ? 1 : 0);
            object2 = n3 != 0 ? "yes" : "no";
            string6.putString((String)object, (String)object2);
            object = (String)((Ga4Events)object4).getGav4DimensionMap().get("dimension168");
            object2 = ((Product)object3).getFnlColorVariantData();
            object10 = object2 != null && (object2 = ((ProductFnlColorVariantData)object2).getColorGroup()) != null ? object2 : string9;
            string6.putString((String)object, (String)object10);
            object = (String)((Ga4Events)object4).getGav4DimensionMap().get("dimension16");
            cp_1.Companion.getClass();
            cp$a.e().getClass();
            d2 = cp_1.x((Product)object3);
            string6.putDouble((String)object, d2);
            string6.putString(string10, string11);
            object = string2;
            string6.putString(string12, string2);
            object2 = ((Product)object3).getAggregateRating();
            if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                object2 = ((Ga4Events)object4).getGav4DimensionMap();
                object5 = LD2.b;
                object2 = (String)object2.get(object5);
                object5 = ((Product)object3).getAggregateRating();
                string6.putString((String)object2, (String)object5);
            }
            object2 = cp$a.e();
            object5 = ((Product)object3).getSegmentId();
            object3 = ((Product)object3).getExperimentId();
            object2.getClass();
            object2 = cp_1.A((String)object5, (String)object3);
            if (object2 != null) {
                object4 = ((Ga4Events)object4).getGav4DimensionMap();
                object3 = DIMEN_20;
                object4 = (String)object4.get(object3);
                string6.putString((String)object4, (String)object2);
                object4 = Unit.a;
            }
            object4 = "item_list_name";
            object2 = string3;
            string6.putString((String)object4, string3);
            object3 = arrayList;
            arrayList.add(string6);
            object2 = list;
            string6 = string5;
            object5 = arrayList;
            object7 = object9;
            object6 = object8;
            object3 = string4;
        }
    }

    public final void sendCheckoutOptions(int n3, String string2, ArrayList arrayList, String string3, String string4, PaymentInstruments paymentInstruments, HashSet hashSet, String string5, List list, String string6) {
        Intrinsics.checkNotNullParameter(string3, "screenName");
        Intrinsics.checkNotNullParameter(string4, "eventName");
        this.sendCheckoutOptionsGAV4(n3, string2, arrayList, string3, string4, paymentInstruments, hashSet, string5, list, string6);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void sendTransactionEventGAv4(CartOrder var1_1, String var2_2, String var3_3) {
        block92: {
            block97: {
                block91: {
                    block90: {
                        block87: {
                            block86: {
                                var4_4 = this;
                                var5_5 = var2_2;
                                var6_7 /* !! */  = var3_3;
                                var7_8 = "value";
                                var8_9 = new Bundle();
                                var9_10 = new ArrayList<Boolean>();
                                if (var1_1 == null || (var10_11 = var1_1.getCode()) == null) break block92;
                                try {
                                    var10_11 = var1_1.getTotalPrice();
                                    var10_11 = var10_11.getValue();
                                    if (var10_11 == null) break block86;
                                    var11_16 = Double.parseDouble((String)var10_11);
                                    break block87;
                                }
                                catch (NumberFormatException var10_12) {
                                    var13_17 = yn3_0.a;
                                    var13_17.e(var10_12);
                                }
                            }
                            var11_16 = 0.0;
                        }
                        var10_11 = var1_1.getAppliedVouchers();
                        var14_18 = false;
                        var15_19 = null;
                        if (var10_11 != null && (var16_20 = (var10_11 = var1_1.getAppliedVouchers()).size()) > 0) {
                            var10_11 = (CartAppliedVoucher)var1_1.getAppliedVouchers().get(0);
                            var17_21 = "coupon";
                            var10_11 = var10_11.getVoucherCode();
                            var8_9.putString(var17_21, (String)var10_11);
                        }
                        var10_11 = this.getGoogleTracker();
                        var17_21 = "orderPlaced";
                        var10_11.setScreenName((String)var17_21);
                        var10_11 = var1_1.getEntries();
                        if (var10_11 == null) break block92;
                        var10_11 = var1_1.getEntries();
                        var17_21 = new Object(var10_11);
                        var18_22 = new ArrayList();
                        var19_23 = new ArrayList<Object>();
                        var20_24 = new ArrayList<Object>();
                        var21_25 = new ArrayList();
                        var22_26 = var17_21.iterator();
                        var10_11 = "iterator(...)";
                        Intrinsics.checkNotNullExpressionValue(var22_26, (String)var10_11);
                        var23_27 = 0.0;
                        while ((var16_20 = (int)var22_26.hasNext()) != 0) {
                            block96: {
                                block93: {
                                    block95: {
                                        block94: {
                                            block89: {
                                                block88: {
                                                    var25_28 = var10_11 = var22_26.next();
                                                    var25_28 = (CartEntry)var10_11;
                                                    if (var25_28 != null) {
                                                        var10_11 = var25_28.isGiftProduct();
                                                        var15_19 = Boolean.FALSE;
                                                        var16_20 = (int)Intrinsics.areEqual(var10_11, var15_19);
                                                    } else {
                                                        var16_20 = 0;
                                                        var26_29 = 0.0f;
                                                        var10_11 = null;
                                                    }
                                                    if (var16_20 == 0) break block93;
                                                    var15_19 = new Bundle();
                                                    var27_30 /* !! */  = null;
                                                    if (var25_28 != null) {
                                                        var10_11 = var25_28.getProduct();
                                                    } else {
                                                        var16_20 = 0;
                                                        var10_11 = null;
                                                        var26_29 = 0.0f;
                                                    }
                                                    GAEcommerceEvents.addProductInfo((Product)var10_11, (Bundle)var15_19);
                                                    var28_31 = var22_26;
                                                    Intrinsics.checkNotNullParameter(var15_19, "bundle");
                                                    var22_26 = h40_0.a;
                                                    var29_32 = h40_0.O1();
                                                    if (var29_32 != 0) {
                                                        if (var25_28 != null && (var22_26 = var25_28.getPriorityDeliveryDate()) != null) {
                                                            var30_33 = var17_21;
                                                            var17_21 = "yyyy-MM-dd";
                                                            var6_7 /* !! */  = k7.c((String)var22_26, "yyyyMMdd", (String)var17_21);
                                                            var22_26 = "priority_delivery_EDD";
                                                            var15_19.putString((String)var22_26, (String)var6_7 /* !! */ );
                                                        } else {
                                                            var30_33 = var17_21;
                                                        }
                                                        if (var25_28 != null && (var6_7 /* !! */  = var25_28.getConvenienceFee()) != null && (var6_7 /* !! */  = var6_7 /* !! */ .getPriorityDelivery()) != null) {
                                                            var31_34 = var6_7 /* !! */ .getNetAmount();
                                                            var22_26 = "product_priority_delivery_fee";
                                                            var6_7 /* !! */  = String.valueOf(var31_34);
                                                            var15_19.putString((String)var22_26, (String)var6_7 /* !! */ );
                                                        }
                                                        if ((var32_35 = h40_0.Q1()) != 0 && var25_28 != null && (var6_7 /* !! */  = var25_28.getDeliverySLA()) != null && (var29_32 = var6_7 /* !! */ .length()) > 0) {
                                                            var22_26 = "priority_delivery_sla_tag";
                                                            var15_19.putString((String)var22_26, (String)var6_7 /* !! */ );
                                                        }
                                                    } else {
                                                        var30_33 = var17_21;
                                                    }
                                                    if (var10_11 != null) {
                                                        var6_7 /* !! */  = var10_11.getBrandName();
                                                    } else {
                                                        var32_35 = 0;
                                                        var6_7 /* !! */  = null;
                                                        var31_34 = 0.0f;
                                                    }
                                                    var32_35 = TextUtils.isEmpty((CharSequence)var6_7 /* !! */ );
                                                    var22_26 = "";
                                                    if (var32_35 != 0) {
                                                        var6_7 /* !! */  = var22_26;
                                                    } else if (var10_11 != null) {
                                                        var6_7 /* !! */  = var10_11.getBrandName();
                                                    } else {
                                                        var32_35 = 0;
                                                        var6_7 /* !! */  = null;
                                                        var31_34 = 0.0f;
                                                    }
                                                    var17_21 = "product_brand";
                                                    var15_19.putString((String)var17_21, (String)var6_7 /* !! */ );
                                                    if (var10_11 != null && (var6_7 /* !! */  = var10_11.getFnlProductData()) != null) {
                                                        var6_7 /* !! */  = var6_7 /* !! */ .getPlanningCategory();
                                                    } else {
                                                        var32_35 = 0;
                                                        var6_7 /* !! */  = null;
                                                        var31_34 = 0.0f;
                                                    }
                                                    var32_35 = TextUtils.isEmpty((CharSequence)var6_7 /* !! */ );
                                                    if (var32_35 != 0) {
                                                        var6_7 /* !! */  = var22_26;
                                                    } else if (var10_11 != null && (var6_7 /* !! */  = var10_11.getFnlProductData()) != null) {
                                                        var6_7 /* !! */  = var6_7 /* !! */ .getPlanningCategory();
                                                    } else {
                                                        var32_35 = 0;
                                                        var6_7 /* !! */  = null;
                                                        var31_34 = 0.0f;
                                                    }
                                                    var17_21 = "item_category";
                                                    var15_19.putString((String)var17_21, (String)var6_7 /* !! */ );
                                                    if (var10_11 != null) {
                                                        var6_7 /* !! */  = var10_11.getBaseProduct();
                                                    } else {
                                                        var32_35 = 0;
                                                        var6_7 /* !! */  = null;
                                                        var31_34 = 0.0f;
                                                    }
                                                    var32_35 = TextUtils.isEmpty((CharSequence)var6_7 /* !! */ );
                                                    var17_21 = "item_variant";
                                                    var33_36 = var22_26;
                                                    var22_26 = "item_id";
                                                    if (var32_35 == 0) {
                                                        if (var10_11 != null) {
                                                            var6_7 /* !! */  = var10_11.getBaseProduct();
                                                        } else {
                                                            var32_35 = 0;
                                                            var6_7 /* !! */  = null;
                                                            var31_34 = 0.0f;
                                                        }
                                                        var6_7 /* !! */  = var4_4.trimProductId((String)var6_7 /* !! */ );
                                                        var34_37 = var6_7 /* !! */ [0];
                                                        var35_38 = TextUtils.isEmpty((CharSequence)var34_37);
                                                        if (var35_38) {
                                                            return;
                                                        }
                                                        var34_37 = var6_7 /* !! */ [0];
                                                        var35_38 = TextUtils.isEmpty((CharSequence)var34_37);
                                                        if (var35_38) {
                                                            var5_5 = var33_36;
                                                        } else {
                                                            var34_37 = var6_7 /* !! */ [0];
                                                            var5_5 = var34_37;
                                                        }
                                                        var15_19.putString((String)var22_26, (String)var5_5);
                                                        var36_39 = var6_7 /* !! */ .length;
                                                        var29_32 = 1;
                                                        if (var36_39 > var29_32 && (var36_39 = (int)TextUtils.isEmpty((CharSequence)(var5_5 = var6_7 /* !! */ [var29_32]))) == 0) {
                                                            var5_5 = var6_7 /* !! */ [var29_32];
                                                            var15_19.putString((String)var17_21, (String)var5_5);
                                                            var29_32 = 1;
                                                        }
                                                    } else {
                                                        if (var10_11 != null) {
                                                            var5_5 = var10_11.getCode();
                                                        } else {
                                                            var36_39 = 0;
                                                            var5_5 = null;
                                                        }
                                                        var5_5 = var4_4.trimProductId((String)var5_5);
                                                        var6_7 /* !! */  = var5_5[0];
                                                        var32_35 = (int)TextUtils.isEmpty((CharSequence)var6_7 /* !! */ );
                                                        if (var32_35 != 0) {
                                                            return;
                                                        }
                                                        var6_7 /* !! */  = var5_5[0];
                                                        var32_35 = (int)TextUtils.isEmpty((CharSequence)var6_7 /* !! */ );
                                                        var6_7 /* !! */  = var32_35 != 0 ? var33_36 : var5_5[0];
                                                        var15_19.putString((String)var22_26, (String)var6_7 /* !! */ );
                                                        var32_35 = ((String[])var5_5).length;
                                                        var29_32 = 1;
                                                        if (var32_35 > var29_32 && (var32_35 = (int)TextUtils.isEmpty((CharSequence)(var6_7 /* !! */  = var5_5[var29_32]))) == 0) {
                                                            var5_5 = var5_5[var29_32];
                                                            var15_19.putString((String)var17_21, (String)var5_5);
                                                        }
                                                    }
                                                    if (var10_11 != null) {
                                                        var5_5 = var10_11.getName();
                                                    } else {
                                                        var36_39 = 0;
                                                        var5_5 = null;
                                                    }
                                                    var36_39 = (int)TextUtils.isEmpty((CharSequence)var5_5);
                                                    if (var36_39 != 0) {
                                                        var5_5 = var33_36;
                                                    } else if (var10_11 != null) {
                                                        var5_5 = var10_11.getName();
                                                    } else {
                                                        var36_39 = 0;
                                                        var5_5 = null;
                                                    }
                                                    var6_7 /* !! */  = "item_name";
                                                    var15_19.putString((String)var6_7 /* !! */ , (String)var5_5);
                                                    if (var10_11 != null) {
                                                        var5_5 = var10_11.getBrandName();
                                                    } else {
                                                        var36_39 = 0;
                                                        var5_5 = null;
                                                    }
                                                    var36_39 = (int)TextUtils.isEmpty((CharSequence)var5_5);
                                                    if (var36_39 != 0) {
                                                        var5_5 = var33_36;
                                                    } else if (var10_11 != null) {
                                                        var5_5 = var10_11.getBrandName();
                                                    } else {
                                                        var36_39 = 0;
                                                        var5_5 = null;
                                                    }
                                                    var6_7 /* !! */  = "item_brand";
                                                    var15_19.putString((String)var6_7 /* !! */ , (String)var5_5);
                                                    if (var10_11 != null) {
                                                        var5_5 = var10_11.getCode();
                                                    } else {
                                                        var36_39 = 0;
                                                        var5_5 = null;
                                                    }
                                                    var18_22.add(var5_5);
                                                    if (var10_11 != null) {
                                                        var10_11 = var10_11.getName();
                                                    } else {
                                                        var16_20 = 0;
                                                        var10_11 = null;
                                                        var26_29 = 0.0f;
                                                    }
                                                    var21_25.add(var10_11);
                                                    if (var25_28 != null) {
                                                        try {
                                                            var10_11 = var25_28.getBasePrice();
                                                            break block88;
                                                        }
                                                        catch (NumberFormatException var10_13) {
                                                            break block89;
                                                        }
                                                    }
                                                    var16_20 = 0;
                                                    var10_11 = null;
                                                    var26_29 = 0.0f;
                                                }
                                                if (var10_11 == null) break block94;
                                                var10_11 = var25_28.getBasePrice();
                                                if ((var10_11 = var10_11.getValue()) == null) break block94;
                                                var37_40 = Double.parseDouble((String)var10_11);
                                                break block95;
                                            }
                                            var5_5 = yn3_0.a;
                                            var5_5.e(var10_13);
                                        }
                                        var37_40 = 0.0;
                                    }
                                    var10_11 = Ga4Events.INSTANCE;
                                    var17_21 = var10_11.getGav4DimensionMap();
                                    var22_26 = (String)var17_21.get("dimension148");
                                    if (var25_28 == null || (var17_21 = var25_28.getProduct()) == null || (var17_21 = var17_21.getCatalogName()) == null) {
                                        var17_21 = var25_28 != null && (var17_21 = var25_28.getProduct()) != null ? var17_21.getCatalog() : null;
                                    }
                                    var17_21 = var4_4.getStoreTypeFromCatalog((String)var17_21);
                                    var15_19.putString((String)var22_26, (String)var17_21);
                                    var22_26 = "price";
                                    var15_19.putDouble((String)var22_26, var37_40);
                                    if (var25_28 != null && (var22_26 = var25_28.getQuantity()) != null) {
                                        var29_32 = var22_26.intValue();
                                        var17_21 = var21_25;
                                        var39_41 = var29_32;
                                    } else {
                                        var17_21 = var21_25;
                                        var39_41 = 0L;
                                        var41_42 = 0.0;
                                    }
                                    var33_36 = var17_21;
                                    var17_21 = "quantity";
                                    var15_19.putLong((String)var17_21, var39_41);
                                    var21_25 = this.getSegmentIds();
                                    var44_44 = var21_25 == null || (var43_43 = var21_25.length()) == 0;
                                    if (!var44_44) {
                                        var21_25 = (String)var10_11.getGav4DimensionMap().get("dimension192");
                                        cp_1.Companion.getClass();
                                        var22_26 = cp$a.e();
                                        var17_21 = var25_28 != null ? var25_28.getProduct() : null;
                                        var22_26.getClass();
                                        var22_26 = var18_22;
                                        var45_45 = cp_1.w((Product)var17_21);
                                        var15_19.putDouble((String)var21_25, var45_45);
                                    } else {
                                        var22_26 = var18_22;
                                    }
                                    var21_25 = (String)var10_11.getGav4DimensionMap().get("dimension16");
                                    cp_1.Companion.getClass();
                                    var17_21 = cp$a.e();
                                    var18_22 = var25_28 != null ? var25_28.getProduct() : null;
                                    var17_21.getClass();
                                    var45_45 = cp_1.x(var18_22);
                                    var15_19.putDouble((String)var21_25, var45_45);
                                    var21_25 = (String)var10_11.getGav4DimensionMap().get("dimension23");
                                    var17_21 = cp$a.e();
                                    var18_22 = var25_28 != null && (var18_22 = var25_28.getProduct()) != null ? var18_22.getSelectedSizeVariant() : null;
                                    var17_21.getClass();
                                    var17_21 = var18_22 != null ? Y63.c((ProductOptionVariant)var18_22) : null;
                                    var15_19.putString((String)var21_25, (String)var17_21);
                                    var21_25 = h40_0.a;
                                    var43_43 = (int)var21_25.f1();
                                    var17_21 = "dimension162";
                                    if (var43_43 != 0) {
                                        if (var25_28 != null) {
                                            var27_30 /* !! */  = var25_28.getGiftProductsCount();
                                        }
                                        var21_25 = var27_30 /* !! */ ;
                                        var27_30 /* !! */  = var22_26;
                                        var22_26 = "GetFreebies - ";
                                        var18_22 = new StringBuilder((String)var22_26);
                                        var18_22.append(var21_25);
                                        var21_25 = var18_22.toString();
                                        var10_11 = (String)var10_11.getGav4DimensionMap().get(var17_21);
                                        var15_19.putString((String)var10_11, (String)var21_25);
                                    } else {
                                        var27_30 /* !! */  = var22_26;
                                        var10_11 = (String)var10_11.getGav4DimensionMap().get(var17_21);
                                        var21_25 = "GetFreebies";
                                        var15_19.putString((String)var10_11, (String)var21_25);
                                    }
                                    var9_10.add(var15_19);
                                    var10_11 = var37_40;
                                    var19_23.add(var10_11);
                                    if (var25_28 != null && (var10_11 = var25_28.getQuantity()) != null) {
                                        var16_20 = var10_11.intValue();
                                    } else {
                                        var16_20 = 0;
                                        var26_29 = 0.0f;
                                        var10_11 = null;
                                    }
                                    var41_42 = var16_20;
                                    var37_40 *= var41_42;
                                    var41_42 = var23_27;
                                    var23_27 = var37_40 + var23_27;
                                    if (var25_28 != null && (var10_11 = var25_28.getQuantity()) != null) {
                                        var16_20 = var10_11.intValue();
                                    } else {
                                        var16_20 = 0;
                                        var26_29 = 0.0f;
                                        var10_11 = null;
                                    }
                                    var10_11 = var16_20;
                                    var20_24.add(var10_11);
                                    var5_5 = var2_2;
                                    var6_7 /* !! */  = var3_3;
                                    var18_22 = var27_30 /* !! */ ;
                                    var22_26 = var28_31;
                                    var17_21 = var30_33;
                                    break block96;
                                }
                                var33_36 = var21_25;
                                var28_31 = var22_26;
                                var41_42 = var23_27;
                                var5_5 = var2_2;
                                var6_7 /* !! */  = var3_3;
                            }
                            var21_25 = var33_36;
                            var14_18 = false;
                            var15_19 = null;
                        }
                        var30_33 = var17_21;
                        var41_42 = var23_27;
                        var8_9.putParcelableArrayList("items", var9_10);
                        var10_11 = this.getSegmentIds();
                        if (var10_11 != null && (var16_20 = var10_11.length()) != 0) {
                            var16_20 = 0;
                            var26_29 = 0.0f;
                            var10_11 = null;
                        } else {
                            var16_20 = 1;
                            var26_29 = 1.4E-45f;
                        }
                        if (var16_20 == 0) {
                            var10_11 = "pricing_cust_seg";
                            var5_5 = this.getSegmentIds();
                            var8_9.putString((String)var10_11, (String)var5_5);
                        }
                        if ((var10_11 = var1_1.getExclusiveGST()) != null) {
                            try {
                                var10_11 = var1_1.getExclusiveGST();
                                var10_11 = var10_11.getValue();
                                var26_29 = mz3_0.J((String)var10_11);
                                var5_5 = "tax";
                                var8_9.putFloat((String)var5_5, var26_29);
                            }
                            catch (NumberFormatException var10_14) {
                                var5_5 = yn3_0.a;
                                var5_5.e(var10_14);
                            }
                        }
                        try {
                            var8_9.putDouble(var7_8, var11_16);
                        }
                        catch (NumberFormatException var5_6) {
                            var10_11 = yn3_0.a;
                            var10_11.e(var5_6);
                        }
                        try {
                            var10_11 = var1_1.getDeliveryCost();
                            var5_5 = "shipping";
                            if (var10_11 != null) {
                                var10_11 = var1_1.getDeliveryCost();
                                var11_16 = (var10_11 = var10_11.getValue()) != null ? Double.parseDouble((String)var10_11) : 0.0;
                            }
                            break block90;
                        }
                        catch (NumberFormatException var10_15) {
                            break block91;
                        }
                        var8_9.putDouble((String)var5_5, var11_16);
                        break block97;
                    }
                    var11_16 = 0.0;
                    var8_9.putDouble((String)var5_5, var11_16);
                    break block97;
                }
                var5_5 = yn3_0.a;
                var5_5.e(var10_15);
            }
            var10_11 = AppsFlyerLib.getInstance();
            AJIOApplication.Companion.getClass();
            var5_5 = AJIOApplication$a.a();
            var10_11 = var10_11.getAppsFlyerUID((Context)var5_5);
            var8_9.putString("af_id", (String)var10_11);
            var5_5 = var2_2;
            var8_9.putString("screenname", var2_2);
            var8_9.putString("screen_name", var2_2);
            var8_9.putString("isGA4", "true");
            var8_9.putDouble(var7_8, var41_42);
            var8_9.putString("event_category", "Enhance E-commerce");
            var5_5 = var1_1.getCode();
            var8_9.putString("transaction_id", (String)var5_5);
            var8_9.putString("currency", "INR");
            var5_5 = var30_33;
            var16_20 = (int)var4_4.containsLuxe(var30_33);
            var10_11 = String.valueOf((boolean)var16_20);
            var8_9.putString("contains_luxe", (String)var10_11);
            var10_11 = "payment_type";
            var5_5 = var3_3;
            if (var3_3 == null) ** GOTO lbl-1000
            var32_35 = var3_3.length();
            if (var32_35 == 0) {
                var14_18 = true;
            } else {
                var14_18 = false;
                var15_19 = null;
            }
            if (!var14_18) {
                var8_9.putString((String)var10_11, (String)var5_5);
            } else lbl-1000:
            // 2 sources

            {
                var5_5 = var1_1.getPaymentCode();
                var8_9.putString((String)var10_11, (String)var5_5);
            }
            var5_5 = "purchase";
            var8_9.putString("event_action", (String)var5_5);
            var10_11 = od3_2.a();
            var4_4.trackEcommerceEvent((String)var5_5, var8_9, (String)var10_11);
        }
    }
}

