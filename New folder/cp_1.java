/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Process
 *  android.provider.Settings$Secure
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.accessibility.AccessibilityManager
 *  org.json.JSONObject
 */
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.MetricsLogging;
import com.ril.ajio.analytics.events.enum.AppsFlyerEventsItem;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.home.transform.BannerAdsMetaData;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.pdprefresh.data.HowToMeasureProducts;
import com.ril.ajio.pdprefresh.data.PDPSizeChartBricks;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartAndOrder;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Login.ABConfigSignUp;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.Stock;
import com.ril.ajio.services.data.ratings.AttributeRatings;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.entity.Banner;
import com.ril.ajio.services.entity.BannerAdData;
import com.ril.ajio.services.entity.BannerResponse;
import com.ril.ajio.services.entity.Component;
import com.ril.ajio.services.entity.Hotspot;
import com.ril.ajio.services.entity.ThirdPartyBannerAdsElements;
import com.ril.ajio.services.entity.ThirdPartyBannerAdsItem;
import com.ril.ajio.services.helper.UrlHelper;
import java.io.Serializable;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.zip.CRC32;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONObject;

/*
 * Renamed from cp
 */
public final class cp_1 {
    public static final cp$a Companion;
    public static cp_1 a;

    static {
        cp$a cp$a;
        Companion = cp$a = new Object();
    }

    public static String A(String string2, String string3) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object = new yo_2(ref$ObjectRef);
        if ((object = (Unit)ai0_2.r((Function2)object, string2, string3)) == null) {
            if (string2 == null && string3 != null) {
                string2 = "null|".concat(string3);
                ref$ObjectRef.element = string2;
            } else if (string3 == null && string2 != null) {
                string3 = "|null";
                string2 = string2.concat(string3);
                ref$ObjectRef.element = string2;
            }
        }
        return (String)ref$ObjectRef.element;
    }

    public static String B() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.b("selfShipAmount");
    }

    public static String C(String string2) {
        String string3 = "question";
        Intrinsics.checkNotNullParameter(string2, string3);
        LinkedHashMap<String, JSONObject> linkedHashMap = new LinkedHashMap<String, JSONObject>();
        h40_0 h40_02 = h40_0.a;
        h40_02 = h40_0.m0();
        String string4 = "questions";
        int n3 = h40_02.has(string4);
        if (n3 != 0) {
            h40_02 = h40_02.getJSONArray(string4);
            int n4 = h40_02.length();
            for (n3 = 0; n3 < n4; ++n3) {
                Object object = h40_02.getJSONObject(n3);
                if (object == null) continue;
                String string5 = object.getString(string3);
                String string6 = "shortHandQuestion";
                object = object.getString(string6);
                object = (String)((AbstractMap)linkedHashMap).put(string5, object);
            }
        }
        if ((string3 = linkedHashMap.get(string2)) != null && (string3 = (String)linkedHashMap.get(string2)) != null) {
            string2 = string3;
        }
        return string2;
    }

    public static void D(double d2, View view, Context object, String string2) {
        int n3;
        int n4 = 2;
        int n7 = 1;
        Intrinsics.checkNotNullParameter(object, "context");
        Object object2 = h40_0.a;
        object2 = z40_0.Companion;
        AJIOApplication$a aJIOApplication$a = AJIOApplication.Companion;
        object2 = Q.a((AJIOApplication$a)aJIOApplication$a, (z40$a)object2).a;
        String string3 = "RatingThreshold";
        double d5 = ((ao0_0)object2).f(string3);
        object2 = "";
        double d7 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
        if (d7 >= 0) {
            String string4;
            string3 = h40_0.m0();
            int n8 = string3.has(string4 = "ratingAboveThresholdColor");
            if (n8 != 0) {
                object2 = h40_0.m0().getString(string4);
                Intrinsics.checkNotNull(object2);
            }
            if ((n8 = ((String)(object2 = ((Object)StringsKt.m0((CharSequence)object2)).toString())).length()) == 0) {
                if (view != null) {
                    aJIOApplication$a.getClass();
                    object = AJIOApplication$a.a();
                    n3 = R$drawable.agreegrate_ratings_green_background;
                    object = t70.getDrawable(object, n3);
                    view.setBackground((Drawable)object);
                }
            } else {
                int n10 = R$color.color_green_ratings;
                int n14 = t70.getColor(object, n10);
                cp_1.O(view, (String)object2, n14);
            }
        } else {
            String string5;
            string3 = h40_0.m0();
            int n15 = string3.has(string5 = "ratingBelowThresholdColor");
            if (n15 != 0) {
                object2 = h40_0.m0().getString(string5);
                Intrinsics.checkNotNull(object2);
            }
            if ((n15 = ((String)(object2 = ((Object)StringsKt.m0((CharSequence)object2)).toString())).length()) == 0) {
                if (view != null) {
                    aJIOApplication$a.getClass();
                    object = AJIOApplication$a.a();
                    n3 = R$drawable.agreegrate_ratings_red_background;
                    object = t70.getDrawable(object, n3);
                    view.setBackground((Drawable)object);
                }
            } else {
                int n16 = R$color.negative_review_color;
                int n17 = t70.getColor(object, n16);
                cp_1.O(view, (String)object2, n17);
            }
        }
        if (view != null) {
            view.setImportantForAccessibility(n7);
            object = StringCompanionObject.INSTANCE;
            object = view.getContext();
            n3 = R$string.acc_plp_avg_rating;
            object = object.getString(n3);
            Intrinsics.checkNotNullExpressionValue(object, "getString(...)");
            float f5 = (float)d2;
            Object object3 = Float.valueOf(f5);
            Object object4 = new Object[n4];
            n3 = 0;
            object2 = null;
            object4[0] = object3;
            object4[n7] = string2;
            object3 = Arrays.copyOf(object4, n4);
            object3 = String.format((String)object, object3);
            object4 = "format(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
            view.setContentDescription((CharSequence)object3);
        }
    }

    public static boolean E(Product product) {
        Object object;
        int n3;
        Intrinsics.checkNotNullParameter(product, "product");
        Iterator iterator = h40_0.a;
        iterator = h40_0.V();
        iterator = (PDPSizeChartBricks)Z90.a(PDPSizeChartBricks.class, (String)((Object)iterator));
        boolean bl2 = false;
        if (iterator != null && (n3 = ((ArrayList)(object = ((PDPSizeChartBricks)((Object)iterator)).getHowToMeasureProducts())).size()) > 0 && ((n3 = (iterator = ((PDPSizeChartBricks)((Object)iterator)).getHowToMeasureProducts()) instanceof Collection) == 0 || (n3 = (int)(((Collection)((Object)iterator)).isEmpty() ? 1 : 0)) == 0)) {
            iterator = ((Iterable)((Object)iterator)).iterator();
            while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object = (HowToMeasureProducts)iterator.next();
                String string2 = ((HowToMeasureProducts)object).getBrickCategory();
                String string3 = null;
                String string4 = product != null ? product.getBrickCategory() : null;
                boolean bl3 = Intrinsics.areEqual(string2, string4);
                if (!bl3 || !(bl3 = Intrinsics.areEqual(string2 = ((HowToMeasureProducts)object).getBrickName(), string4 = product != null ? product.getBrickName() : null))) continue;
                object = ((HowToMeasureProducts)object).getBrickSubCategory();
                if (product != null) {
                    string3 = product.getBrickSubCategory();
                }
                if ((n3 = (int)(Intrinsics.areEqual(object, string3) ? 1 : 0)) == 0) continue;
                bl2 = true;
                break;
            }
        }
        return bl2;
    }

    public static boolean F(Product object) {
        boolean bl2;
        block5: {
            object = object != null ? ((Product)object).getVariantOptions() : null;
            bl2 = false;
            if (object != null) {
                Object object2 = object;
                object2 = (Collection)object;
                int n3 = object2.isEmpty();
                int n4 = 1;
                if ((n3 ^= n4) != 0) {
                    object = object.iterator();
                    while ((n3 = object.hasNext()) != 0) {
                        object2 = ((ProductOptionItem)object.next()).getStock();
                        if (object2 == null) continue;
                        if ((object2 = ((Stock)object2).getStockLevel()) != null) {
                            n3 = (Integer)object2;
                        } else {
                            n3 = 0;
                            object2 = null;
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

    public static boolean G(Uri object, String string2) {
        boolean bl2;
        boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl3 && ((bl3 = TextUtils.isEmpty((CharSequence)(string2 = object.getPath()))) || (bl2 = Intrinsics.areEqual(object = object.getPath(), string2 = "/")))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static boolean H(String object) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        boolean bl3 = false;
        if (!bl2) {
            boolean bl4;
            String string2 = cp_1.g((String)object);
            Object object2 = UrlHelper.Companion.getInstance();
            boolean bl5 = ((UrlHelper)object2).isUATServicesDomain();
            Object object3 = "([a-zA-Z0-9-])+.ajio.com";
            boolean bl6 = true;
            object = bl5 ? (object != null && (bl5 = StringsKt.F((CharSequence)object, (CharSequence)(object2 = "luxe"), false)) == bl6 ? "([a-zA-Z0-9-])+.services.luxe.ajio.com" : (object != null && (bl4 = StringsKt.F((CharSequence)object, (CharSequence)(object2 = "ajiogram"), false)) == bl6 ? "([a-zA-Z0-9-])+.services.ajiogram.ajio.com" : "([a-zA-Z0-9-])+.services.ajio.com")) : object3;
            object2 = new Regex((String)object3);
            bl5 = ((Regex)object2).c(string2);
            object3 = new Regex((String)object);
            bl4 = ((Regex)object3).c(string2);
            if (bl5 || bl4) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public static boolean I(BaseResponse baseResponse) {
        boolean bl2;
        Boolean bl3;
        Boolean bl4;
        boolean bl5;
        if (baseResponse != null && (bl5 = Intrinsics.areEqual(bl4 = baseResponse.isNewData(), bl3 = Boolean.TRUE))) {
            bl4 = Boolean.FALSE;
            baseResponse.setNewData(bl4);
            bl2 = true;
        } else {
            bl2 = false;
            baseResponse = null;
        }
        return bl2;
    }

    public static boolean J(DataCallback dataCallback) {
        boolean bl2;
        boolean bl3 = false;
        if (dataCallback != null && (bl2 = dataCallback.isNewData())) {
            dataCallback.setNewData(false);
            bl3 = true;
        }
        return bl3;
    }

    public static void K(String object, String string2) {
        boolean bl2;
        Object object2;
        Intrinsics.checkNotNullParameter(object, "orderId");
        Intrinsics.checkNotNullParameter(string2, "customKeyName");
        Object object3 = h40_0.a;
        object3 = h40_0.S();
        if (object3 != null) {
            object3 = ((MetricsLogging)object3).getAppsflyerFirebaseLoggingEnable();
            object2 = Boolean.FALSE;
            bl2 = Intrinsics.areEqual(object3, object2);
        } else {
            bl2 = false;
            object3 = null;
        }
        if (bl2) {
            return;
        }
        object3 = FirebaseCrashlytics.getInstance();
        object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("_");
        ((StringBuilder)object2).append(string2);
        object2 = ((StringBuilder)object2).toString();
        ((FirebaseCrashlytics)object3).setCustomKey((String)object, (String)object2);
        ((FirebaseCrashlytics)object3).log(string2);
        object = new Exception(string2);
        ((FirebaseCrashlytics)object3).recordException((Throwable)object);
        ((FirebaseCrashlytics)object3).sendUnsentReports();
    }

    public static String L(String object) {
        Object object2;
        block21: {
            block20: {
                object2 = "MD5";
                object2 = MessageDigest.getInstance((String)object2);
                if (object == null) break block20;
                Object object3 = Charsets.UTF_8;
                object = ((String)object).getBytes((Charset)object3);
                object3 = "getBytes(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                break block21;
            }
            object = null;
        }
        ((MessageDigest)object2).update((byte[])object);
        object = ((MessageDigest)object2).digest();
        object2 = new StringBuilder();
        int n3 = ((Object)object).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = object[i3] & 0xFF;
            String string2 = Integer.toHexString(n4);
            while (true) {
                int n7 = string2.length();
                int n8 = 2;
                if (n7 >= n8) break;
                StringBuilder stringBuilder = new StringBuilder();
                String string3 = "0";
                stringBuilder.append(string3);
                stringBuilder.append(string2);
                string2 = stringBuilder.toString();
                continue;
                break;
            }
            ((StringBuilder)object2).append(string2);
            continue;
        }
        try {
            object = ((StringBuilder)object2).toString();
            object2 = "toString(...)";
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String M(int n3) {
        String string2 = "th";
        String string3 = "th";
        String string4 = "st";
        String string5 = "nd";
        String string6 = "rd";
        String string7 = "th";
        String string8 = "th";
        String string9 = "th";
        String string10 = "th";
        String[] stringArray = new String[]{"th", string4, string5, string6, string7, string8, string2, string3, string9, string10};
        int n4 = n3 % 100;
        switch (n4) {
            default: {
                void var10_12;
                n4 = n3 % 10;
                String string11 = stringArray[n4];
                return UX.a(n3, (String)var10_12);
            }
            case 11: 
            case 12: 
            case 13: {
                void var10_12;
                String string12 = "th";
                return UX.a(n3, (String)var10_12);
            }
        }
    }

    public static final Serializable N(Intent object, String string2, Class clazz) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(string2, "key");
        String string3 = "clazz";
        Intrinsics.checkNotNullParameter(clazz, string3);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 >= n4) {
            object = ap_2.a(object, string2, clazz);
        } else {
            boolean bl2 = (object = object.getSerializableExtra(string2)) instanceof Serializable;
            if (!bl2) {
                object = null;
            }
        }
        return (Serializable)object;
    }

    public static void O(View view, String object, int n3) {
        block7: {
            int n4;
            View view2 = null;
            if (view != null) {
                view = view.getBackground();
            } else {
                n4 = 0;
                view = null;
            }
            boolean bl2 = view instanceof GradientDrawable;
            if (bl2) {
                view2 = view;
                view2 = (GradientDrawable)view;
            }
            if (view2 != null) {
                view2.mutate();
            }
            n4 = Color.parseColor((String)object);
            if (view2 == null) break block7;
            try {
                view2.setColor(n4);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                object = yn3_0.a;
                String string2 = illegalArgumentException.getLocalizedMessage();
                string2 = kp1_0.c("Invalid color :", string2);
                bl2 = false;
                Object[] objectArray = new Object[]{};
                ((yn3$a)object).a(string2, objectArray);
                if (view2 == null) break block7;
                view2.setColor(n3);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void P(CartAndOrder cartAndOrder) {
        int n3;
        ArrayList arrayList;
        String string2;
        Object object;
        float f5;
        String string3;
        int n4;
        block26: {
            float f6;
            block27: {
                float f7;
                Object object2;
                String string4;
                block28: {
                    block25: {
                        n4 = cartAndOrder instanceof CartOrder;
                        string4 = null;
                        string3 = "getQuantity(...)";
                        f5 = 0.0f;
                        object = null;
                        string2 = "0";
                        if (n4 != 0) break block25;
                        n4 = cartAndOrder instanceof Cart;
                        if (n4 == 0) return;
                        arrayList = ((Cart)(cartAndOrder = (Cart)cartAndOrder)).getEntries();
                        if (arrayList == null) {
                            return;
                        }
                        break block26;
                    }
                    object2 = ((CartOrder)(cartAndOrder = (CartOrder)cartAndOrder)).getEntries();
                    if (object2 == null) {
                        return;
                    }
                    object2 = ((CartOrder)cartAndOrder).getEntries();
                    n4 = object2.size();
                    f6 = 0.0f;
                    for (n3 = 0; n3 < n4; ++n3) {
                        float f8;
                        Object object3;
                        Object object4;
                        Comparable comparable = (CartEntry)((CartOrder)cartAndOrder).getEntries().get(n3);
                        if (comparable == null || (object4 = ((CartEntry)comparable).getProduct()) == null || (object3 = ((Product)(object4 = ((CartEntry)comparable).getProduct())).getWasPriceData()) == null || (object3 = ((CartEntry)comparable).getBasePrice()) == null) continue;
                        object3 = ((Product)object4).getWasPriceData();
                        if (object3 == null || (object3 = ((Price)object3).getValue()) == null) {
                            object3 = string2;
                        }
                        float f11 = mz3_0.J((String)object3);
                        Integer n7 = ((CartEntry)comparable).getQuantity();
                        Intrinsics.checkNotNullExpressionValue(n7, string3);
                        float f12 = ((Number)n7).floatValue() * f11 + f5;
                        object = ((Product)object4).getWasPriceData();
                        if (object == null || (object = ((Price)object).getValue()) == null) {
                            object = string2;
                        }
                        f5 = mz3_0.J((String)object);
                        object4 = ((CartEntry)comparable).getBasePrice().getValue();
                        if (object4 == null) {
                            object4 = string2;
                        }
                        float f14 = mz3_0.J((String)object4);
                        comparable = ((CartEntry)comparable).getQuantity();
                        Intrinsics.checkNotNullExpressionValue(comparable, string3);
                        f6 = f8 = ((Number)((Object)comparable)).floatValue() * (f5 -= f14) + f6;
                        f5 = f12;
                    }
                    object2 = h40_0.a;
                    object2 = z40_0.Companion;
                    object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
                    string4 = "enable_orderdetail_pricing_from_api";
                    n4 = (int)(((ao0_0)object2).a(string4) ? 1 : 0);
                    if (n4 == 0) break block27;
                    object2 = ((CartOrder)cartAndOrder).getBagTotalAmount();
                    n3 = 0;
                    string4 = null;
                    if (object2 != null) {
                        object2 = ((Price)object2).getValue();
                    } else {
                        n4 = 0;
                        object2 = null;
                        f7 = 0.0f;
                    }
                    if (object2 != null) break block28;
                    object2 = ((CartOrder)cartAndOrder).getBagDiscount();
                    if (object2 != null) {
                        object2 = ((Price)object2).getValue();
                    } else {
                        n4 = 0;
                        object2 = null;
                        f7 = 0.0f;
                    }
                    if (object2 != null) break block28;
                    object2 = ((CartOrder)cartAndOrder).getTotalSaving();
                    if (object2 != null) {
                        object2 = ((Price)object2).getValue();
                    } else {
                        n4 = 0;
                        object2 = null;
                        f7 = 0.0f;
                    }
                    if (object2 == null) break block27;
                }
                if ((object2 = ((CartOrder)cartAndOrder).getBagTotalAmount()) != null) {
                    object2 = ((Price)object2).getValue();
                } else {
                    n4 = 0;
                    object2 = null;
                    f7 = 0.0f;
                }
                f7 = mz3_0.J((String)object2);
                ((CartOrder)cartAndOrder).setTotalBag(f7);
                object2 = ((CartOrder)cartAndOrder).getBagDiscount();
                if (object2 != null) {
                    string4 = ((Price)object2).getValue();
                }
                f7 = mz3_0.J(string4);
                ((CartOrder)cartAndOrder).setTotalBagSaving(f7);
                return;
            }
            ((CartOrder)cartAndOrder).setTotalBag(f5);
            ((CartOrder)cartAndOrder).setTotalBagSaving(f6);
            return;
        }
        arrayList = ((Cart)cartAndOrder).getEntries();
        n4 = arrayList.size();
        float f15 = 0.0f;
        while (true) {
            Object object5;
            Object object6;
            if (n3 >= n4) {
                ((Cart)cartAndOrder).setTotalBag(f5);
                ((Cart)cartAndOrder).setTotalBagSaving(f15);
                return;
            }
            Comparable comparable = (CartEntry)((Cart)cartAndOrder).getEntries().get(n3);
            if (comparable != null && (object6 = ((CartEntry)comparable).getProduct()) != null && (object5 = ((Product)(object6 = ((CartEntry)comparable).getProduct())).getWasPriceData()) != null && (object5 = ((CartEntry)comparable).getBasePrice()) != null) {
                float f16;
                object5 = ((Product)object6).getWasPriceData();
                if (object5 == null || (object5 = ((Price)object5).getValue()) == null) {
                    object5 = string2;
                }
                float f17 = mz3_0.J((String)object5);
                Integer n8 = ((CartEntry)comparable).getQuantity();
                Intrinsics.checkNotNullExpressionValue(n8, string3);
                float f18 = ((Number)n8).floatValue() * f17 + f5;
                object = ((Product)object6).getWasPriceData();
                if (object == null || (object = ((Price)object).getValue()) == null) {
                    object = string2;
                }
                f5 = mz3_0.J((String)object);
                object6 = ((CartEntry)comparable).getBasePrice().getValue();
                if (object6 == null) {
                    object6 = string2;
                }
                float f19 = mz3_0.J((String)object6);
                comparable = ((CartEntry)comparable).getQuantity();
                Intrinsics.checkNotNullExpressionValue(comparable, string3);
                f15 = f16 = ((Number)((Object)comparable)).floatValue() * (f5 -= f19) + f15;
                f5 = f18;
            }
            ++n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Q(Context object, String object2) {
        Exception exception3;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        Object object3;
        block8: {
            block7: {
                object3 = "packageName";
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                int n3 = Build.VERSION.SDK_INT;
                int n4 = 28;
                if (n3 < n4) return;
                n3 = 0;
                object3 = null;
                if (object != null) {
                    runningAppProcessInfo = "activity";
                    try {
                        object = object.getSystemService((String)runningAppProcessInfo);
                        runningAppProcessInfo = "null cannot be cast to non-null type android.app.ActivityManager";
                        Intrinsics.checkNotNull(object, (String)runningAppProcessInfo);
                        object = (ActivityManager)object;
                        object = object.getRunningAppProcesses();
                        object = object.iterator();
                        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                            runningAppProcessInfo = object.next();
                            runningAppProcessInfo = runningAppProcessInfo;
                            int n7 = runningAppProcessInfo.pid;
                            int n8 = Process.myPid();
                            if (n7 != n8) continue;
                            object3 = runningAppProcessInfo.processName;
                            break;
                        }
                    }
                    catch (Exception exception2) {}
                }
                object = null;
                try {
                    int n10 = Intrinsics.areEqual(object2, object3);
                    if (n10 != 0 || object3 == null || (n10 = ((String)object3).length()) == 0) break block7;
                    xm.a((String)object3);
                }
                catch (Exception exception3) {
                    break block8;
                }
            }
            object2 = yn3_0.a;
            runningAppProcessInfo = new StringBuilder();
            String string2 = "WebView directory setup success: ";
            runningAppProcessInfo.append(string2);
            runningAppProcessInfo.append((String)object3);
            object3 = runningAppProcessInfo.toString();
            runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo[]{};
            ((yn3$a)object2).a((String)object3, (Object[])runningAppProcessInfo);
            return;
        }
        object3 = yn3_0.a;
        ((yn3$a)object3).e(exception3);
        String string3 = hy_2.a();
        runningAppProcessInfo = "WebView directory setup failure: ";
        string3 = kp1_0.c((String)runningAppProcessInfo, string3);
        object = new Object[]{};
        ((yn3$a)object3).a(string3, (Object[])object);
    }

    public static boolean R() {
        int n3;
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        Object object2 = new jo_2((Context)object);
        boolean bl2 = false;
        int n4 = ((sw_0)object2).getPreference("widget_max_apperance_count", 0);
        object = h40_0.a;
        object = "widgetMaxApperanceCount";
        Intrinsics.checkNotNullParameter(object, "key");
        JSONObject jSONObject = h40_0.z();
        boolean bl3 = jSONObject.has((String)object);
        if (bl3) {
            n3 = jSONObject.getInt((String)object);
        } else {
            n3 = 0;
            object = null;
        }
        if (n4 < n3) {
            object2 = AJIOApplication$a.a();
            n4 = (int)(((AJIOApplication)object2).e ? 1 : 0);
            if (n4 == 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public static void S(BannerResponse bannerResponse, Map map2, HashMap hashMap) {
        Map map3 = map2;
        HashMap hashMap2 = hashMap;
        Object object = bannerResponse;
        Intrinsics.checkNotNullParameter(bannerResponse, "bannerResponse");
        Intrinsics.checkNotNullParameter(hashMap, "jioBannerAdsMap");
        Iterator iterator = bannerResponse.getComponent();
        if (iterator != null) {
            int n3;
            int n4;
            iterator = (iterator = ((Component)((Object)iterator)).getBanners()) != null ? ((ArrayList)((Object)iterator)).iterator() : null;
            while (iterator != null && (n4 = iterator.hasNext()) == (n3 = 1)) {
                Object object2;
                Object object3;
                Object object4;
                int n7;
                Object object5;
                Object object6;
                Object object7;
                Object object8;
                Object object9;
                Object object10;
                String string2;
                Object object11;
                Object object12;
                int n8;
                Comparable<Boolean> comparable;
                int n10;
                Object object13;
                Object object14;
                boolean bl2;
                Object object15;
                Object object16 = iterator.next();
                Object object17 = "next(...)";
                Intrinsics.checkNotNullExpressionValue(object16, (String)object17);
                object16 = (Banner)object16;
                Object object18 = ((Banner)object16).getBannerType();
                Object object19 = "AD";
                int n14 = Intrinsics.areEqual(object18, object19);
                int n15 = 24;
                String string3 = "x";
                Object object20 = "";
                if (n14 != 0) {
                    object18 = ((Banner)object16).getAdSpotId();
                    if (object18 != null && (n14 = ((String)object18).length()) != 0 && (n14 = (int)(hashMap.isEmpty() ? 1 : 0)) == 0) {
                        int n16;
                        n14 = Build.VERSION.SDK_INT;
                        if (n14 >= n15) {
                            object18 = (ArrayList)wo_2.a(((Banner)object16).getAdSpotId(), hashMap2);
                        } else {
                            object18 = ((Banner)object16).getAdSpotId();
                            if ((object18 = hashMap2.get(object18)) != null) {
                                object18 = ((Banner)object16).getAdSpotId();
                                object18 = (ArrayList)hashMap2.get(object18);
                            } else {
                                n14 = 0;
                                object18 = null;
                            }
                        }
                        if (object18 != null) {
                            block41: {
                                object18 = object18.iterator();
                                while ((n15 = (int)(object18.hasNext() ? 1 : 0)) != 0) {
                                    object15 = object19 = object18.next();
                                    object15 = (BannerAdData)object19;
                                    int n17 = ((BannerAdData)object15).isVisited() ^ n3;
                                    if (n17 == 0) continue;
                                    break block41;
                                }
                                n15 = 0;
                                object19 = null;
                            }
                            object19 = (BannerAdData)object19;
                        } else {
                            n15 = 0;
                            object19 = null;
                        }
                        object18 = ((Banner)object16).getWidth();
                        object15 = ((Banner)object16).getHeight();
                        object18 = mz3_0.e((Double)object18, (Double)object15);
                        object15 = ((Banner)object16).getAdSpotId();
                        bl2 = hashMap2.containsKey(object15);
                        if (bl2 && (object15 = (ArrayList)hashMap2.get(object15)) != null && !(bl2 = object15.isEmpty())) {
                            object15 = ((ArrayList)object15).iterator();
                            object14 = "iterator(...)";
                            Intrinsics.checkNotNullExpressionValue(object15, (String)object14);
                            while (bl2 = object15.hasNext()) {
                                object14 = object15.next();
                                Intrinsics.checkNotNullExpressionValue(object14, (String)object17);
                                boolean bl3 = ((BannerAdData)(object14 = (BannerAdData)object14)).isVisited();
                                if (bl3 || (object13 = (Collection)((BannerAdData)object14).getCustomimage()) == null || (bl3 = object13.isEmpty()) || (object13 = ((BannerAdData)object14).getCustomimage()) == null || (object13 = (Map)CollectionsKt.firstOrNull((List)object13)) == null) continue;
                                int n18 = ((ScreenInfo)object18).getWidth();
                                n10 = ((ScreenInfo)object18).getHeight();
                                comparable = new Comparable<Boolean>();
                                ((StringBuilder)comparable).append(n18);
                                ((StringBuilder)comparable).append(string3);
                                ((StringBuilder)comparable).append(n10);
                                object = ((StringBuilder)comparable).toString();
                                n10 = (int)(object13.containsKey(object) ? 1 : 0);
                                if (n10 != n3) continue;
                                ((BannerAdData)object14).setVisited(n3 != 0);
                                break;
                            }
                        } else {
                            bl2 = false;
                            object14 = null;
                        }
                        if (object14 != null && (object = ((BannerAdData)object14).getCustomimage()) != null && (object = (Map)CollectionsKt.firstOrNull((List)object)) != null) {
                            n3 = ((ScreenInfo)object18).getWidth();
                            n8 = ((ScreenInfo)object18).getHeight();
                            comparable = new Comparable<Boolean>();
                            ((StringBuilder)comparable).append(n3);
                            ((StringBuilder)comparable).append(string3);
                            ((StringBuilder)comparable).append(n8);
                            object12 = ((StringBuilder)comparable).toString();
                            object = (String)object.get(object12);
                            if (object != null) {
                                object20 = object;
                            }
                        }
                        object = new ArrayList();
                        object11 = object19 != null ? (object12 = ((BannerAdData)object19).getClickId()) : null;
                        n3 = ((ScreenInfo)object18).getWidth();
                        object12 = n3;
                        n8 = ((ScreenInfo)object18).getHeight();
                        object17 = n8;
                        object18 = new StringBuilder();
                        ((StringBuilder)object18).append(object12);
                        ((StringBuilder)object18).append(string3);
                        ((StringBuilder)object18).append(object17);
                        string2 = ((StringBuilder)object18).toString();
                        object10 = object19 != null ? (object12 = ((BannerAdData)object19).getCmpid()) : null;
                        object9 = object19 != null ? (object12 = ((BannerAdData)object19).getDesc2()) : null;
                        if (object19 != null) {
                            object8 = object12 = ((BannerAdData)object19).getCtafb();
                        } else {
                            n16 = 0;
                            object8 = null;
                        }
                        if (object19 != null && (object12 = ((BannerAdData)object19).getImptrackers()) != null) {
                            n8 = 0;
                            object17 = null;
                            object7 = object12 = (String)CollectionsKt.N(0, (List)object12);
                        } else {
                            n8 = 0;
                            object17 = null;
                            object7 = null;
                        }
                        object6 = object19 != null && (object12 = ((BannerAdData)object19).getClktrackers()) != null ? (object12 = (String)CollectionsKt.N(0, (List)object12)) : null;
                        String string4 = ((Banner)object16).getBannerType();
                        object5 = Boolean.FALSE;
                        n7 = 0;
                        int n19 = 640;
                        object4 = object12;
                        object12 = new BannerAdsMetaData((String)object11, (String)object10, (String)object9, (String)object8, (String)object7, (String)object6, (Boolean)object5, null, string2, null, (String)object20, string4, n19, null);
                        object17 = ((BannerAdsMetaData)object12).getImageName();
                        if (object17 == null || (n8 = ((String)object17).length()) == 0) {
                            object17 = "bannerImage";
                            ((BannerAdsMetaData)object12).setImageName((String)object17);
                        }
                        if ((object17 = ((BannerAdsMetaData)object12).getCcbValue()) == null || (n8 = ((String)object17).length()) == 0) {
                            Companion.getClass();
                            object17 = cp$a.e();
                            object18 = UUID.randomUUID().toString();
                            object17.getClass();
                            object17 = cp_1.n((String)object18);
                            ((BannerAdsMetaData)object12).setCcbValue((String)object17);
                        }
                        ((Banner)object16).setBannerAdsMetaData((BannerAdsMetaData)object12);
                        object11 = ((Banner)object16).getWidth();
                        object3 = ((Banner)object16).getHeight();
                        object2 = object19 != null ? (object12 = ((BannerAdData)object19).getCtafb()) : null;
                        double d2 = 0.0;
                        object10 = d2;
                        object9 = d2;
                        object7 = null;
                        object4 = null;
                        n16 = 4;
                        object13 = object12;
                        object12 = new Hotspot((Double)object3, (String)object2, null, (Double)object11, (Double)object10, (Double)object9, n16, null);
                        ((ArrayList)object).add(object12);
                        object = CollectionsKt.k0((Iterable)object);
                        ((Banner)object16).setHotspots((List)object);
                        if (object14 == null && (n10 = ((String)object20).length()) <= 0) {
                            iterator.remove();
                            continue;
                        }
                        ((Banner)object16).setBannerUrl((String)object20);
                        continue;
                    }
                    iterator.remove();
                    continue;
                }
                n8 = 0;
                object17 = null;
                object = ((Banner)object16).getBannerType();
                n10 = Intrinsics.areEqual(object, object18 = "EXTERNAL_AD");
                if (n10 == 0) continue;
                object = ((Banner)object16).getAdSpotId();
                if (object != null && (n10 = ((String)object).length()) != 0 && map3 != null && (n10 = map2.isEmpty() ^ n3) == n3) {
                    n10 = Build.VERSION.SDK_INT;
                    if (n10 >= n15) {
                        object = (ArrayList)xo_2.a(((Banner)object16).getAdSpotId(), map3);
                    } else {
                        object = ((Banner)object16).getAdSpotId();
                        if ((object = (ArrayList)map3.get(object)) != null) {
                            object = ((Banner)object16).getAdSpotId();
                            object = (ArrayList)map3.get(object);
                        } else {
                            n10 = 0;
                            object = null;
                        }
                    }
                    if (object != null) {
                        block42: {
                            object = object.iterator();
                            while ((n14 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                                object19 = object18 = object.next();
                                object19 = (ThirdPartyBannerAdsItem)object18;
                                if (object19 != null) {
                                    object19 = ((ThirdPartyBannerAdsItem)object19).isVisited();
                                    comparable = Boolean.FALSE;
                                    n15 = (int)(Intrinsics.areEqual(object19, comparable) ? 1 : 0);
                                } else {
                                    n15 = 0;
                                    object19 = null;
                                }
                                if (n15 == 0) continue;
                                break block42;
                            }
                            n14 = 0;
                            object18 = null;
                        }
                        object18 = (ThirdPartyBannerAdsItem)object18;
                    } else {
                        n14 = 0;
                        object18 = null;
                    }
                    if (object18 == null || (object = ((ThirdPartyBannerAdsItem)object18).getElements()) == null || (object = ((ThirdPartyBannerAdsElements)object).getMediaType()) == null) {
                        object = object20;
                    }
                    if ((n15 = (int)(((String)(object19 = "IMAGE")).equalsIgnoreCase((String)object) ? 1 : 0)) == 0 && (n10 = (int)(((String)(object19 = "GIF")).equalsIgnoreCase((String)object) ? 1 : 0)) == 0) {
                        n3 = 0;
                        object12 = null;
                    }
                    if (n3 != 0 && object18 != null) {
                        object = ((ThirdPartyBannerAdsItem)object18).getElements();
                        if (object == null || (object = ((ThirdPartyBannerAdsElements)object).getMobileImage()) == null) {
                            object = object20;
                        }
                        ((Banner)object16).setBannerUrl((String)object);
                        object = ((ThirdPartyBannerAdsItem)object18).getElements();
                        if (object == null || (object = ((ThirdPartyBannerAdsElements)object).getMobileImage()) == null) {
                            object = object20;
                        }
                        object3 = cp_1.k((String)object);
                        object = ((ThirdPartyBannerAdsItem)object18).getElements();
                        if (object != null) {
                            object = ((ThirdPartyBannerAdsElements)object).getDestinationUrl();
                        } else {
                            n10 = 0;
                            object = null;
                        }
                        if (object != null && (n3 = ((String)object).length()) != 0) {
                            object12 = new URL((String)object);
                            object20 = ((URL)object12).getHost();
                            object = "getHost(...)";
                            Intrinsics.checkNotNullExpressionValue(object20, (String)object);
                        }
                        object13 = object20;
                        object = ((Banner)object16).getWidth();
                        object12 = ((Banner)object16).getHeight();
                        object17 = new StringBuilder();
                        ((StringBuilder)object17).append(object);
                        ((StringBuilder)object17).append(string3);
                        ((StringBuilder)object17).append(object12);
                        object8 = ((StringBuilder)object17).toString();
                        object = ((ThirdPartyBannerAdsItem)object18).getElements();
                        object2 = object != null ? (object = ((ThirdPartyBannerAdsElements)object).getDestinationUrl()) : null;
                        object4 = ((ThirdPartyBannerAdsItem)object18).getImpressionTrackingUrl();
                        object11 = ((ThirdPartyBannerAdsItem)object18).getClickTrackingUrl();
                        object = ((ThirdPartyBannerAdsItem)object18).getElements();
                        object6 = object != null ? (object = ((ThirdPartyBannerAdsElements)object).getMobileImage()) : null;
                        object5 = ((Banner)object16).getBannerType();
                        object10 = Boolean.FALSE;
                        object9 = null;
                        object7 = null;
                        bl2 = false;
                        object14 = null;
                        n7 = 641;
                        string2 = null;
                        object15 = object;
                        object = new BannerAdsMetaData(null, (String)object13, (String)object3, (String)object2, (String)object4, (String)object11, (Boolean)object10, null, (String)object8, null, (String)object6, (String)object5, n7, null);
                        ((Banner)object16).setBannerAdsMetaData((BannerAdsMetaData)object);
                        object = Boolean.TRUE;
                        ((ThirdPartyBannerAdsItem)object18).setVisited((Boolean)object);
                        continue;
                    }
                    iterator.remove();
                    continue;
                }
                iterator.remove();
            }
        }
    }

    public static String a(String object, String object2, boolean bl2) {
        Intrinsics.checkNotNullParameter(object2, "apiUrl");
        AJIOApplication.Companion.getClass();
        Object object3 = UserInformation.getInstance((Context)AJIOApplication$a.a());
        boolean bl3 = ((UserInformation)object3).isUserOnline();
        String string2 = "";
        if (bl3) {
            object3 = UserInformation.getInstance((Context)AJIOApplication$a.a()).getUserId();
            Intrinsics.checkNotNullExpressionValue(object3, "getUserId(...)");
            String string3 = "-edge.services";
            int n3 = StringsKt.F((CharSequence)object2, string3, false);
            boolean bl4 = true;
            String string4 = "toLowerCase(...)";
            if (n3 != 0) {
                object2 = z40_0.Companion;
                Object object4 = AJIOApplication$a.a();
                object2.getClass();
                object2 = z40$a.a((Context)object4).a;
                object4 = "edgeWorkerTestUserId";
                object2 = ((ao0_0)object2).b((String)object4);
                object3 = ((String)object3).toLowerCase();
                Intrinsics.checkNotNullExpressionValue(object3, string4);
                n3 = (int)(StringsKt.F((CharSequence)object2, (CharSequence)object3, false) ? 1 : 0);
                if (n3 != 0) {
                    n3 = 1;
                } else {
                    object2 = z40$a.a((Context)AJIOApplication$a.a()).a;
                    object3 = "enableEdgeWorker";
                    n3 = (int)(((ao0_0)object2).a((String)object3) ? 1 : 0);
                }
            } else {
                n3 = 0;
                object2 = null;
            }
            if (n3 != 0) {
                if (object != null && (n3 = ((String)object).length()) != 0) {
                    bl4 = false;
                    string3 = null;
                }
                object2 = "rilfnl";
                if (bl4) {
                    object = object2;
                }
                if (!(bl3 = Intrinsics.areEqual(object, string2))) {
                    object3 = Locale.ROOT;
                    string2 = ((String)object).toLowerCase((Locale)object3);
                    Intrinsics.checkNotNullExpressionValue(string2, string4);
                    string3 = "www.ajio.com";
                    boolean bl5 = Intrinsics.areEqual(string2, string3);
                    if (!bl5) {
                        object3 = ((String)object).toLowerCase((Locale)object3);
                        Intrinsics.checkNotNullExpressionValue(object3, string4);
                        string2 = "ajio";
                        bl3 = Intrinsics.areEqual(object3, string2);
                        if (!bl3) {
                            object2 = object;
                        }
                    }
                }
                if (!(bl3 = StringsKt.F((CharSequence)object2, (CharSequence)(object = "_v1"), false))) {
                    object3 = Locale.ROOT;
                    object2 = ((String)object2).toLowerCase((Locale)object3);
                    Intrinsics.checkNotNullExpressionValue(object2, string4);
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append((String)object2);
                    ((StringBuilder)object3).append((String)object);
                    object2 = ((StringBuilder)object3).toString();
                }
                object = UserInformation.getInstance((Context)AJIOApplication$a.a()).getUserId();
                object3 = UserInformation.getInstance((Context)AJIOApplication$a.a()).getSecureAccessToken();
                string2 = UserInformation.getInstance((Context)AJIOApplication$a.a()).getSecureRefreshToken();
                object = og_1.a("U=", (String)object, ";A=", (String)object3, ";R=");
                X50.a((StringBuilder)object, string2, ";cohortStore=", (String)object2, ";useCohort=");
                return Vm.a(";uaas=true", bl2, (StringBuilder)object);
            }
        }
        return string2;
    }

    public static String b(String object, String string2) {
        int n3 = 2;
        StringBuilder stringBuilder = null;
        if (object == null) {
            return null;
        }
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            stringBuilder = new StringBuilder((String)object);
            String string3 = "?";
            boolean bl3 = StringsKt.F((CharSequence)object, string3, false);
            if (bl3) {
                object = "&";
                stringBuilder.append((String)object);
            } else {
                stringBuilder.append(string3);
            }
            object = StringCompanionObject.INSTANCE;
            object = new Object[n3];
            object[0] = "share";
            object[1] = string2;
            object = Arrays.copyOf(object, n3);
            object = String.format("utm_source=%1$s&utm_medium=%2$s", object);
            Intrinsics.checkNotNullExpressionValue(object, "format(...)");
            stringBuilder.append((String)object);
            return stringBuilder.toString();
        }
        return null;
    }

    public static String c(String string2, String string3, String string4, String string5, String string6, String string7) {
        CharSequence charSequence = "shareUrl";
        Intrinsics.checkNotNullParameter(string2, (String)charSequence);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            charSequence = new StringBuilder(string2);
            String string8 = "?";
            boolean bl3 = StringsKt.F(string2, string8, false);
            String string9 = "&";
            if (bl3) {
                ((StringBuilder)charSequence).append(string9);
            } else {
                ((StringBuilder)charSequence).append(string8);
            }
            bl3 = TextUtils.isEmpty((CharSequence)string3);
            if (!bl3) {
                string2 = "utm_source=";
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append(string9);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)string4))) {
                string2 = "utm_medium=";
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(string4);
                ((StringBuilder)charSequence).append(string9);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)string5))) {
                string2 = "utm_campaign=";
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(string5);
                ((StringBuilder)charSequence).append(string9);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)string6))) {
                string2 = "utm_term=";
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(string6);
                ((StringBuilder)charSequence).append(string9);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)string7))) {
                string2 = "utm_content=";
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(string7);
                ((StringBuilder)charSequence).append(string9);
            }
            string2 = ((StringBuilder)charSequence).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            int n3 = string2.length() + -1;
            string2 = string2.substring(0, n3);
            Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
            return string2;
        }
        return null;
    }

    public static boolean d(String object) {
        int n3 = h40_0.Q1();
        boolean bl2 = false;
        if (n3 == 0) {
            return false;
        }
        if (object != null && (n3 = ((String)object).length()) != 0) {
            boolean bl3;
            Object object2;
            object = Uri.parse((String)object);
            Object object3 = object2 = object.getQueryParameterNames();
            object3 = (Collection)object2;
            if (object3 != null && !(bl3 = object3.isEmpty()) && (n3 = (int)(object2.contains(object3 = "isPDBanner") ? 1 : 0)) != 0) {
                boolean bl4;
                object = object.getQueryParameter((String)object3);
                n3 = 0;
                object2 = null;
                if (object != null) {
                    Intrinsics.checkNotNullParameter(object, "<this>");
                    object3 = "true";
                    bl3 = Intrinsics.areEqual(object, object3);
                    if (bl3) {
                        object2 = Boolean.TRUE;
                    } else {
                        object3 = "false";
                        bl4 = Intrinsics.areEqual(object, object3);
                        if (bl4) {
                            object2 = Boolean.FALSE;
                        }
                    }
                }
                if (bl4 = Intrinsics.areEqual(object2, object = Boolean.TRUE)) {
                    bl2 = (Boolean)object2;
                }
            }
        }
        return bl2;
    }

    public static boolean e(FragmentManager object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "childFragmentManager");
        String string2 = "RatingBottomSheetFragment";
        object = ((FragmentManager)object).E(string2);
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static boolean f() {
        boolean bl2;
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        String string2 = "accessibility";
        object = object.getSystemService(string2);
        boolean bl3 = object instanceof AccessibilityManager;
        if (bl3) {
            object = (AccessibilityManager)object;
        } else {
            bl2 = false;
            object = null;
        }
        bl3 = false;
        string2 = null;
        boolean bl4 = object != null ? object.isEnabled() : false;
        if (object != null) {
            bl2 = object.isTouchExplorationEnabled();
        } else {
            bl2 = false;
            object = null;
        }
        if (bl4 && bl2) {
            bl3 = true;
        }
        return bl3;
    }

    public static String g(String string2) {
        String string3;
        boolean bl2;
        if (string2 != null && (bl2 = StringsKt.F(string2, string3 = "www.", false))) {
            String string4 = "";
            string2 = b.n(string2, string3, string4, false);
        }
        if (string2 == null) {
            string2 = "ajio.com";
        }
        return string2;
    }

    public static HashMap h(Bundle object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "bundle");
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        hashMap.put("NOTIFICATION_TYPE", "NOTIFICATION_CLEVERTAP");
        Object object2 = cp_1.o((Bundle)object, "wzrk_id");
        hashMap.put("CAMPAIGN_ID", object2);
        object2 = cp_1.o((Bundle)object, "nt");
        hashMap.put("NOTIFICATION_TITLE", object2);
        object2 = cp_1.o((Bundle)object, "nm");
        hashMap.put("NOTIFICATION_BODY", object2);
        Locale locale = Locale.getDefault();
        object2 = new SimpleDateFormat("EEE MMM dd,yyyy HH:mm:ss", locale);
        long l2 = System.currentTimeMillis();
        Object object3 = l2;
        object2 = ((Format)object2).format(object3);
        object3 = "NOTIFICATION_TIME";
        hashMap.put(object3, object2);
        object = cp_1.o((Bundle)object, "wzrk_acts");
        object2 = "NOTIFICATION_CTA";
        hashMap.put(object2, object);
        object = Build.MODEL;
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object2 = "DEVICE_MODEL";
            hashMap.put(object2, object);
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
        hashMap.put("DEVICE_ID", object2);
        object2 = Build.MANUFACTURER;
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(" ");
        ((StringBuilder)object3).append((String)object);
        object = ((StringBuilder)object3).toString();
        hashMap.put("DEVICE_NAME", object);
        int n4 = Build.VERSION.SDK_INT;
        object2 = new StringBuilder("Android/");
        ((StringBuilder)object2).append(n4);
        object = ((StringBuilder)object2).toString();
        hashMap.put("DEVICE_OS", object);
        return hashMap;
    }

    public static HashMap i(Product serializable) {
        boolean bl2;
        Object object;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        String string2 = null;
        Object object2 = serializable != null ? serializable.getCode() : null;
        if (serializable != null) {
            object = serializable.getFnlColorVariantData();
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null) {
            object = serializable.getFnlColorVariantData();
            if (object != null) {
                object = object.getColorGroup();
            } else {
                bl2 = false;
                object = null;
            }
            bl2 = TextUtils.isEmpty((CharSequence)object);
            if (!bl2) {
                object2 = serializable.getFnlColorVariantData();
                Intrinsics.checkNotNull(object2);
                object2 = ((ProductFnlColorVariantData)object2).getColorGroup();
                Intrinsics.checkNotNull(object2);
            }
        }
        object = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp().trimProductId((String)object2);
        String string3 = serializable != null ? serializable.getName() : null;
        String string4 = "product_name";
        hashMap.put(string4, string3);
        string3 = null;
        object = object[0];
        if (object != null) {
            object2 = object;
        }
        object = "product_id";
        hashMap.put(object, object2);
        object2 = serializable != null ? serializable.getBrickCategory() : null;
        object = "segment_name";
        hashMap.put(object, object2);
        object2 = serializable != null ? serializable.getBrickName() : null;
        object = "brick_name";
        hashMap.put(object, object2);
        if (serializable != null && (object2 = serializable.getFnlColorVariantData()) != null) {
            string2 = ((ProductFnlColorVariantData)object2).getBrandName();
        }
        hashMap.put("Brand_name", string2);
        Companion.getClass();
        cp$a.e().getClass();
        serializable = Double.valueOf(cp_1.x(serializable));
        hashMap.put("MRP", serializable);
        return hashMap;
    }

    public static HashMap j(long l2, String object, String string2, String object2) {
        int n3;
        int n4;
        int n7;
        HashMap hashMap = p3.a("NOTIFICATION_TYPE", "NOTIFICATION_TRANSACTIONAL");
        String string3 = "NOTIFICATION_TITLE";
        String string4 = "PRESENT";
        String string5 = "ABSENT";
        if (object != null && (n7 = ((String)object).length()) != 0) {
            hashMap.put(string3, string4);
        } else {
            hashMap.put(string3, string5);
        }
        object = "NOTIFICATION_BODY";
        if (string2 != null && (n4 = string2.length()) != 0) {
            hashMap.put(object, string4);
        } else {
            hashMap.put(object, string5);
        }
        object = "NOTIFICATION_CTA";
        if (object2 != null && (n4 = ((String)object2).length()) != 0) {
            hashMap.put(object, string4);
        } else {
            hashMap.put(object, string5);
        }
        string2 = "EEE MMM dd,yyyy HH:mm:ss";
        object2 = Locale.getDefault();
        object = new SimpleDateFormat(string2, (Locale)object2);
        Object object3 = l2;
        object3 = ((Format)object).format(object3);
        Object object4 = "NOTIFICATION_TIME";
        hashMap.put(object4, object3);
        object3 = Build.MODEL;
        if (object3 != null && (n3 = ((String)object3).length()) != 0) {
            object4 = "DEVICE_MODEL";
            hashMap.put(object4, object3);
        }
        AJIOApplication.Companion.getClass();
        object4 = AJIOApplication$a.a();
        if (object4 != null) {
            object4 = object4.getContentResolver();
        } else {
            n3 = 0;
            object4 = null;
        }
        object4 = Settings.Secure.getString((ContentResolver)object4, (String)"android_id");
        hashMap.put("DEVICE_ID", object4);
        object4 = Build.MANUFACTURER;
        object = new StringBuilder();
        ((StringBuilder)object).append((String)object4);
        ((StringBuilder)object).append(" ");
        ((StringBuilder)object).append((String)object3);
        object3 = ((StringBuilder)object).toString();
        hashMap.put("DEVICE_NAME", object3);
        int n8 = Build.VERSION.SDK_INT;
        object4 = new StringBuilder("Android/");
        ((StringBuilder)object4).append(n8);
        object3 = ((StringBuilder)object4).toString();
        hashMap.put("DEVICE_OS", object3);
        return hashMap;
    }

    public static String k(String string2) {
        boolean bl2;
        String[] stringArray = "url";
        Intrinsics.checkNotNullParameter(string2, (String)stringArray);
        int n3 = string2.length();
        if (n3 > 0 && (bl2 = StringsKt.F(string2, (CharSequence)(stringArray = "/"), false))) {
            stringArray = new String[]{stringArray};
            return (String)CollectionsKt.S(StringsKt.a0(string2, stringArray, false, 0, 6));
        }
        return "";
    }

    public static String l() {
        Intrinsics.checkNotNullParameter("IMG", "prefix");
        Intrinsics.checkNotNullParameter("jpg", "ext");
        Locale locale = Locale.getDefault();
        Object object = new SimpleDateFormat("yyyyMMdd_HHmmss", locale);
        Date date = new Date();
        object = ((DateFormat)object).format(date);
        return cP.a("IMG_", (String)object, ".jpg");
    }

    public static AppsFlyerEventsItem m(Product product, String string2, long l2) {
        AppsFlyerEventsItem appsFlyerEventsItem;
        Object object = appsFlyerEventsItem;
        String string3 = null;
        AppsFlyerEventsItem appsFlyerEventsItem2 = appsFlyerEventsItem;
        appsFlyerEventsItem = null;
        char c2 = (char)-1;
        ((AppsFlyerEventsItem)object)(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, c2, null);
        object = string2;
        AppsFlyerEventsItem appsFlyerEventsItem3 = appsFlyerEventsItem2;
        appsFlyerEventsItem2.setPrice(string2);
        object = null;
        string3 = product != null ? product.getCode() : null;
        appsFlyerEventsItem3.setContentId(string3);
        string3 = product != null ? product.getBrickSubCategory() : null;
        appsFlyerEventsItem3.setContentType(string3);
        appsFlyerEventsItem3.setCurrency("INR");
        string3 = String.valueOf(l2);
        appsFlyerEventsItem3.setQuantity(string3);
        string3 = product != null ? product.getBrickCategory() : null;
        appsFlyerEventsItem3.setSegment(string3);
        if (product != null) {
            object = product.getBrickName();
        }
        appsFlyerEventsItem3.setBrick((String)object);
        return appsFlyerEventsItem3;
    }

    public static String n(String charSequence) {
        String string2 = ":";
        Object object = new SecureRandom();
        long l2 = System.currentTimeMillis();
        Object object2 = AJIOApplication.Companion;
        object2.getClass();
        object2 = AJIOApplication$a.a();
        object2 = object2.getPackageName();
        long l3 = ((Random)object).nextLong();
        long l4 = ((Random)object).nextLong();
        object = new StringBuilder();
        ((StringBuilder)object).append(l2);
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(l3);
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(l4);
        ((StringBuilder)object).append((String)charSequence);
        object = ((StringBuilder)object).toString();
        Object object3 = Charsets.UTF_8;
        object = ((String)object).getBytes((Charset)object3);
        object3 = "getBytes(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        object3 = new CRC32();
        int n3 = ((Object)object).length;
        ((CRC32)object3).update((byte[])object, 0, n3);
        long l7 = ((CRC32)object3).getValue();
        try {
            charSequence = Long.toHexString(l7);
        }
        catch (Exception exception) {
            int n4;
            String string3;
            block42: {
                block41: {
                    object = AJIOApplication.Companion;
                    object.getClass();
                    object = AJIOApplication$a.a();
                    object = object.getPackageName();
                    int n7 = 1111;
                    l2 = n7;
                    object2 = new SecureRandom();
                    int n8 = 8889;
                    long l8 = ((Random)object2).nextInt(n8);
                    l2 += l8;
                    object2 = null;
                    string3 = "substring(...)";
                    n4 = 2;
                    if (object == null) break block41;
                    object = ((String)object).substring(0, n4);
                    Intrinsics.checkNotNullExpressionValue(object, string3);
                    break block42;
                }
                object = null;
            }
            if (charSequence != null) {
                object2 = ((String)charSequence).substring(0, n4);
                Intrinsics.checkNotNullExpressionValue(object2, string3);
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(l2);
            try {
                ((StringBuilder)charSequence).append((String)object2);
                charSequence = ((StringBuilder)charSequence).toString();
            }
            catch (Exception exception2) {
                charSequence = "";
            }
        }
        return charSequence;
    }

    public static String o(Bundle object, String string2) {
        int n3;
        boolean bl2 = object.containsKey(string2);
        String string3 = "ABSENT";
        if (bl2 && (object = object.getString(string2)) != null && (n3 = ((String)object).length()) != 0) {
            string3 = "PRESENT";
        }
        return string3;
    }

    public static String p(String string2, String string3) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "defaultValue");
        h40_0 h40_02 = h40_0.a;
        h40_02 = h40_0.m0();
        String string4 = "lastXdaysOrders";
        boolean bl3 = h40_02.has(string4);
        if (bl3 && (bl2 = (h40_02 = h40_02.getJSONObject(string4)).has(string2))) {
            string2 = h40_02.getString(string2);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        return string3;
    }

    public static boolean q() {
        boolean bl2;
        Object object;
        Object object2;
        Object object3;
        int n3;
        block3: {
            boolean bl3;
            n3 = 1;
            object3 = "GENDER";
            object2 = "keyName";
            Intrinsics.checkNotNullParameter(object3, (String)object2);
            Intrinsics.checkNotNullParameter(object3, (String)object2);
            object2 = h40_0.a;
            object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.e("ABAJIOSignUpPage");
            object = new ArrayList();
            int n4 = object2.length();
            for (int i3 = 0; i3 < n4; i3 += n3) {
                Object object4 = object2.getJSONObject(i3);
                if (object4 == null) continue;
                String string2 = object4.getString("key");
                boolean bl4 = object4.getBoolean("visiblity");
                object4 = bl4;
                ABConfigSignUp aBConfigSignUp = new ABConfigSignUp(string2, (Boolean)object4);
                ((ArrayList)object).add(aBConfigSignUp);
            }
            object2 = ((ArrayList)object).iterator();
            while (bl3 = object2.hasNext()) {
                Object object5 = object = object2.next();
                object5 = ((ABConfigSignUp)object).getKey();
                n4 = (int)(Intrinsics.areEqual(object5, object3) ? 1 : 0);
                if (n4 == 0) continue;
                break block3;
            }
            bl3 = false;
            object = null;
        }
        object = (ABConfigSignUp)object;
        if (object != null && (bl2 = Intrinsics.areEqual(object3 = ((ABConfigSignUp)object).getVisiblity(), object2 = Boolean.FALSE))) {
            return false;
        }
        return n3 != 0;
    }

    public static String r(ArrayList arrayList) {
        boolean bl2;
        if (arrayList != null && !(bl2 = arrayList.isEmpty())) {
            bl2 = false;
            String string2 = ((AttributeRatings)arrayList.get(0)).getText();
            int n3 = arrayList.size();
            for (int i3 = 1; i3 < n3; ++i3) {
                String string3 = ((AttributeRatings)arrayList.get(i3)).getPercentageRating();
                int n4 = cp_1.v(string3);
                int n7 = i3 + -1;
                String string4 = ((AttributeRatings)arrayList.get(n7)).getPercentageRating();
                if (n4 <= (n7 = cp_1.v(string4))) continue;
                string2 = ((AttributeRatings)arrayList.get(i3)).getText();
            }
            return string2;
        }
        return "";
    }

    public static HashMap s() {
        Object object;
        int n3;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Object object2 = Build.MODEL;
        if (object2 != null && (n3 = ((String)object2).length()) != 0) {
            object = "MODEL";
            hashMap.put(object, object2);
        }
        AJIOApplication.Companion.getClass();
        object = AJIOApplication$a.a();
        if (object != null) {
            object = object.getContentResolver();
        } else {
            n3 = 0;
            object = null;
        }
        object = Settings.Secure.getString((ContentResolver)object, (String)"android_id");
        hashMap.put("DEVICE_ID", object);
        object = Build.MANUFACTURER;
        CharSequence charSequence = new StringBuilder();
        charSequence.append((String)object);
        charSequence.append(" ");
        charSequence.append((String)object2);
        object2 = charSequence.toString();
        hashMap.put("DEVICE_NAME", object2);
        int n4 = Build.VERSION.SDK_INT;
        charSequence = "Android/";
        object = new StringBuilder((String)charSequence);
        ((StringBuilder)object).append(n4);
        object2 = ((StringBuilder)object).toString();
        hashMap.put("ANDROID_OS_VERSION", object2);
        object2 = AJIOApplication$a.a();
        object = new s52((Context)object2);
        n4 = (int)(((s52)object).a() ? 1 : 0);
        object2 = n4 != 0 ? "Enabled" : "Disabled";
        hashMap.put("NOTIFICATION_PERMISSION_STATUS", object2);
        return hashMap;
    }

    public static String t(Product list) {
        String string2 = null;
        list = list != null ? ((Product)((Object)list)).getVariantOptions() : null;
        if (list != null && (list = (ProductOptionItem)CollectionsKt.N(0, list)) != null && (list = ((ProductOptionItem)((Object)list)).getStock()) != null) {
            string2 = ((Stock)((Object)list)).getStockErrorDescription();
        }
        return string2;
    }

    public static LinkedHashMap u(Boolean object, boolean bl2, String object2, boolean bl3) {
        int n3;
        int n4;
        int n7;
        Object object3;
        LinkedHashMap<Object, Object> linkedHashMap;
        Object object4;
        int n10;
        block14: {
            n10 = 1;
            object4 = h40_0.a;
            if (bl3) {
                object = z40_0.Companion;
                object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                linkedHashMap = "fleek_pdp_ui_configuration";
                object = ((cw)object).d((String)((Object)linkedHashMap));
            } else {
                boolean bl4;
                boolean n8;
                bl3 = h40_0.e0();
                if (bl3 && (n8 = Intrinsics.areEqual(object, object3 = Boolean.FALSE)) && (bl4 = Intrinsics.areEqual(object = od3_2.a(), object3 = ld3_2.STORE_AJIO.getStoreId()))) {
                    object = z40_0.Companion;
                    object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                    linkedHashMap = "pdp_ui_oos_configuration";
                    object = ((cw)object).d((String)((Object)linkedHashMap));
                } else {
                    int n14;
                    object = z40_0.Companion;
                    object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                    boolean bl5 = ((ao0_0)object).a("enable_utm_pdp_redirection");
                    object3 = "pdp_ui_configuration";
                    if (bl5 && object2 != null && (n14 = ((String)object2).length()) != 0 && !bl2) {
                        object = z40$a.a((Context)AJIOApplication$a.a()).a.d("utm_redirection_pdp_ui_configuration");
                        linkedHashMap = object.keys();
                        while ((n7 = linkedHashMap.hasNext()) != 0) {
                            object4 = (String)linkedHashMap.next();
                            n4 = b.i((String)object4, (String)object2, n10 != 0);
                            if (n4 == 0) continue;
                            object = object.getJSONObject((String)object4);
                            linkedHashMap = "getJSONObject(...)";
                            Intrinsics.checkNotNullExpressionValue(object, (String)((Object)linkedHashMap));
                            break block14;
                        }
                        object = z40_0.Companion;
                        linkedHashMap = AJIOApplication.Companion;
                        object = Q.a((AJIOApplication$a)((Object)linkedHashMap), (z40$a)object).a.d((String)object3);
                    } else {
                        object = z40$a.a((Context)AJIOApplication$a.a()).a.d((String)object3);
                    }
                }
            }
        }
        linkedHashMap = new LinkedHashMap<Object, Object>();
        object2 = new LinkedHashSet();
        object3 = object.keys();
        object4 = "keys(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        while ((n7 = object3.hasNext()) != 0) {
            Object object5;
            int n15;
            object4 = (String)object3.next();
            Object object6 = object.get((String)object4);
            if (object6 == null || (n15 = ((String)(object5 = object6.toString())).length()) <= 0) continue;
            object5 = object6.toString();
            String string2 = "input";
            Intrinsics.checkNotNullParameter(object5, string2);
            if ((object5 = StringsKt.toIntOrNull((String)object5)) == null) continue;
            object6 = object6.toString();
            n4 = Integer.parseInt((String)object6);
            while ((n15 = (int)(object2.contains(object5 = Integer.valueOf(n4)) ? 1 : 0)) != 0) {
                n4 += n10;
            }
            object5 = "SIMILAR MODEL PRODUCT";
            n15 = (int)(Intrinsics.areEqual(object4, object5) ? 1 : 0);
            if (n15 != 0) {
                n7 = n4 + 1;
                while ((n15 = (int)(object2.contains(object5 = Integer.valueOf(n4)) ? 1 : 0)) != 0) {
                    n4 += n10;
                }
                while ((n15 = (int)(object2.contains(object5 = Integer.valueOf(n7)) ? 1 : 0)) != 0) {
                    n7 += n10;
                }
                object5 = "SIMILAR_VIEW_MODEL_TITLE";
                string2 = "SIMILAR_VIEW_MODEL_PRODUCT";
                cy_1.a(n4, linkedHashMap, (String)object5, n7, string2);
                object6 = n4;
                object2.add(object6);
                object4 = n7;
                object2.add(object4);
                continue;
            }
            while ((n15 = (int)(object2.contains(object5 = Integer.valueOf(n4)) ? 1 : 0)) != 0) {
                n4 += n10;
            }
            object5 = n4;
            linkedHashMap.put(object4, object5);
            object4 = n4;
            object2.add(object4);
        }
        int n16 = 40;
        object = n16;
        object2 = "LUXE_BACK_TO_TOP";
        linkedHashMap.put(object2, object);
        object = ((HashMap)linkedHashMap).entrySet();
        Intrinsics.checkNotNullExpressionValue(object, "<get-entries>(...)");
        object = CollectionsKt.k0((Iterable)object);
        linkedHashMap = new LinkedHashMap<Object, Object>();
        object = CollectionsKt.e0((Iterable)object, (Comparator)((Object)linkedHashMap));
        linkedHashMap = new LinkedHashMap<Object, Object>();
        object = object.iterator();
        while ((n3 = object.hasNext()) != 0) {
            object2 = object.next();
            Intrinsics.checkNotNullExpressionValue(object2, "next(...)");
            object2 = (Map.Entry)object2;
            object3 = object2.getKey();
            n3 = ((Number)object2.getValue()).intValue();
            object2 = n3;
            linkedHashMap.put(object3, object2);
        }
        return linkedHashMap;
    }

    public static int v(String string2) {
        int n3;
        int n4 = 0;
        if (string2 != null && (n3 = string2.length()) > 0) {
            String string3 = " %";
            n3 = (int)(StringsKt.F(string2, string3, false) ? 1 : 0);
            String string4 = "substring(...)";
            boolean bl2 = true;
            if (n3 != 0) {
                n3 = StringsKt.M(string2, ' ', 0, bl2);
                string2 = string2.substring(0, n3);
                Intrinsics.checkNotNullExpressionValue(string2, string4);
                n4 = Integer.parseInt(string2);
            } else {
                n3 = 37;
                boolean bl3 = StringsKt.G(string2, (char)n3);
                if (bl3) {
                    n3 = StringsKt.M(string2, (char)n3, 0, bl2);
                    string2 = string2.substring(0, n3);
                    Intrinsics.checkNotNullExpressionValue(string2, string4);
                    n4 = Integer.parseInt(string2);
                } else {
                    n4 = Integer.parseInt(string2);
                }
            }
        }
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static double w(Product object) {
        NumberFormatException numberFormatException3;
        double d2;
        Object object2;
        block13: {
            Object object3;
            double d5;
            block12: {
                double d7;
                block11: {
                    block15: {
                        block14: {
                            NumberFormatException numberFormatException22;
                            block10: {
                                Object object4;
                                block9: {
                                    block8: {
                                        object2 = null;
                                        d2 = 0.0;
                                        if (object != null) {
                                            try {
                                                object4 = ((Product)object).getPrice();
                                                if (object4 == null) break block8;
                                                object4 = ((Price)object4).getValue();
                                                break block9;
                                            }
                                            catch (NumberFormatException numberFormatException22) {
                                                break block10;
                                            }
                                        }
                                    }
                                    object4 = null;
                                }
                                if (object4 == null || (object4 = ((Product)object).getPrice()) == null || (object4 = ((Price)object4).getValue()) == null) break block14;
                                d5 = Double.parseDouble((String)object4);
                                break block15;
                            }
                            yn3$a yn3$a = yn3_0.a;
                            yn3$a.e(numberFormatException22);
                        }
                        d5 = d2;
                    }
                    d7 = d5 == d2 ? 0 : (d5 < d2 ? -1 : 1);
                    if (d7 == false) {
                        return d2;
                    }
                    if (object != null) {
                        try {
                            object3 = ((Product)object).getWasPriceData();
                            if (object3 == null) break block11;
                            object3 = ((Price)object3).getValue();
                            break block12;
                        }
                        catch (NumberFormatException numberFormatException3) {
                            break block13;
                        }
                    }
                }
                d7 = 0.0;
                object3 = null;
            }
            if (object3 == null) return d2;
            if (object != null && (object = ((Product)object).getWasPriceData()) != null && (object = ((Price)object).getValue()) != null) {
                double d9 = Double.parseDouble((String)object);
                object2 = d9;
            }
            Intrinsics.checkNotNull(object2);
            double d12 = (Double)object2;
            return d12 - d5;
        }
        object2 = yn3_0.a;
        ((yn3$a)object2).e(numberFormatException3);
        return d2;
    }

    public static double x(Product object) {
        double d2;
        Object object2;
        String string2 = null;
        object2 = object != null && (object2 = ((Product)object).getWasPriceData()) != null ? ((Price)object2).getValue() : null;
        if (object2 != null) {
            if (object != null && (object = ((Product)object).getWasPriceData()) != null) {
                string2 = ((Price)object).getValue();
            }
            Intrinsics.checkNotNull(string2);
            d2 = Double.parseDouble(string2);
        } else {
            d2 = object != null && (object = ((Product)object).getPrice()) != null && (object = ((Price)object).getValue()) != null ? Double.parseDouble((String)object) : 0.0;
        }
        return d2;
    }

    public static long y(Product iterator) {
        long l2;
        long l3;
        long l4 = 0L;
        if (iterator != null && (iterator = ((Product)((Object)iterator)).getVariantOptions()) != null) {
            int n3;
            iterator = iterator.iterator();
            l3 = l4;
            while ((n3 = iterator.hasNext()) != 0) {
                Serializable serializable = ((ProductOptionItem)iterator.next()).getStock();
                if (serializable == null || (serializable = ((Stock)serializable).getStockLevel()) == null) continue;
                n3 = ((Number)serializable).intValue();
                long l7 = n3;
                l3 += l7;
            }
        } else {
            l3 = l4;
        }
        if ((l2 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1)) == false) {
            return -1;
        }
        return l3;
    }

    public static String z(String string2) {
        Intrinsics.checkNotNullParameter(string2, "storeId");
        String string3 = "ajio";
        boolean bl2 = true;
        boolean bl3 = b.i(string2, string3, bl2);
        if (bl3) {
            string2 = "rilfnl";
        }
        return string2;
    }
}

