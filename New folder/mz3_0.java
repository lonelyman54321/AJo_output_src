/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Log
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 *  org.json.JSONArray
 */
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.work.b;
import androidx.work.b$a;
import com.google.common.collect.ImmutableList;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.launch.DynamicIconChangeWorker;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.ProfileHealth;
import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp$AmountData;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.ProductUserSizeRecomResponse;
import com.ril.ajio.services.data.freebies.GiftPromotion;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import java.io.Serializable;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;

/*
 * Renamed from mz3
 */
public final class mz3_0 {
    public static final mz3_0 a;

    static {
        mz3_0 mz3_02;
        a = mz3_02 = new Object();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean A() {
        String string2;
        Object object = od3_2.a();
        boolean bl2 = Intrinsics.areEqual(object, string2 = ld3_2.STORE_AJIO.getStoreId());
        if (!bl2) {
            object = od3_2.a();
            bl2 = Intrinsics.areEqual(object, string2 = ld3_2.STORE_LUXE.getStoreId());
            if (!bl2) return false;
        }
        object = h40_0.a;
        object = h40_0.d();
        bl2 = object.optBoolean(string2 = "isCartEnabled");
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean B() {
        String string2;
        Object object = od3_2.a();
        boolean bl2 = ((String)object).equals(string2 = ld3_2.STORE_AJIO.getStoreId());
        if (!bl2) return false;
        object = h40_0.a;
        object = h40_0.d();
        bl2 = object.optBoolean(string2 = "isPdpEnabled");
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean C(String string2) {
        int n3;
        char c2 = TextUtils.isEmpty((CharSequence)string2);
        int n4 = 0;
        if (c2 != '\u0000') {
            return n4 != 0;
        }
        char[] cArray = string2.toCharArray();
        int n7 = cArray.length;
        int n8 = cArray[0];
        int n10 = 45;
        n8 = n8 == n10 ? 1 : 0;
        int n14 = n8 + '\u0001';
        int n15 = 70;
        int n16 = 102;
        int n17 = 57;
        int n18 = 48;
        if (n7 > n14 && (n3 = cArray[n8]) == n18 && (n14 = cArray[n14]) == (n3 = 120)) {
            if ((n8 += 2) == n7) {
                return n4 != 0;
            }
            while (n8 < (n7 = cArray.length)) {
                n7 = cArray[n8];
                if (!(n7 >= n18 && n7 <= n17 || n7 >= (n10 = 97) && n7 <= n16)) {
                    n10 = 65;
                    if (n7 < n10) return n4 != 0;
                    if (n7 > n15) {
                        return n4 != 0;
                    }
                }
                ++n8;
            }
            return 1 != 0;
        }
        n14 = n7 + -1;
        n3 = 0;
        int n19 = 0;
        boolean bl2 = false;
        boolean bl3 = false;
        while (true) {
            int n20 = 46;
            n4 = 69;
            int n21 = 101;
            if (n8 >= n14 && (n8 >= n7 || n3 == 0 || n19 != 0)) {
                n7 = cArray.length;
                if (n8 < n7) {
                    c2 = cArray[n8];
                    if (c2 >= n18 && c2 <= n17) return 1 != 0;
                    if (c2 == n21) return 0 != 0;
                    if (c2 == n4) return 0 != 0;
                    if (c2 == n20) {
                        if (bl3) return 0 != 0;
                        if (!bl2) return n19 != 0;
                        return 0 != 0;
                    }
                    if (n3 == 0) {
                        n4 = 100;
                        if (c2 == n4) return n19 != 0;
                        n4 = 68;
                        if (c2 == n4) return n19 != 0;
                        if (c2 == n16) return n19 != 0;
                        if (c2 == n15) {
                            return n19 != 0;
                        }
                    }
                    if (c2 != (n4 = 108)) {
                        n4 = 76;
                        if (c2 != n4) return 0 != 0;
                    }
                    if (n19 == 0) return 0 != 0;
                    if (bl2) return 0 != 0;
                    return 1 != 0;
                }
                if (n3 != 0) return 0 != 0;
                if (n19 == 0) return 0 != 0;
                return 1 != 0;
            }
            n15 = cArray[n8];
            if (n15 >= n18 && n15 <= n17) {
                n3 = 0;
                n19 = 1;
            } else if (n15 == n20) {
                if (bl3) return 0 != 0;
                if (bl2) return 0 != 0;
                bl3 = true;
            } else if (n15 != n21 && n15 != n4) {
                n4 = 43;
                if (n15 != n4) {
                    if (n15 != n10) return 0 != 0;
                }
                if (n3 == 0) return 0 != 0;
                n3 = 0;
                n19 = 0;
            } else {
                if (bl2 || n19 == 0) {
                    return 0 != 0;
                }
                n3 = 1;
                bl2 = true;
            }
            ++n8;
            n4 = 0;
            n15 = 70;
        }
    }

    public static boolean D(Cart serializable) {
        float f5;
        float f6;
        float f7;
        return serializable != null && (serializable = ((Cart)serializable).getRvpReturnFee()) != null && (serializable = ((ProfileHealth)serializable).getActionContent()) != null && (serializable = ((ActionContent)serializable).getReturn_fee()) != null && (f7 = (f6 = (f5 = ((Number)serializable).floatValue()) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean E() {
        String string2;
        Object object = od3_2.a();
        boolean bl2 = ((String)object).equals(string2 = ld3_2.STORE_AJIO.getStoreId());
        if (!bl2) return false;
        object = h40_0.a;
        object = h40_0.C0();
        bl2 = object.optBoolean(string2 = "isFeatureEnabled");
        if (!bl2) return false;
        return true;
    }

    public static void F(String string2) {
        Intrinsics.checkNotNullParameter(string2, "exceptionMsg");
        Object object = yn3_0.a;
        Object object2 = n1.a(string2, ", logs: ", null);
        Object[] objectArray = new Object[]{};
        ((yn3$a)object).d((String)object2, objectArray);
        FirebaseCrashlytics.getInstance().log("");
        object = FirebaseCrashlytics.getInstance();
        object2 = new Exception(string2);
        ((FirebaseCrashlytics)object).recordException((Throwable)object2);
    }

    public static final float G(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        float f5 = 0.0f;
        if (bl2) {
            return 0.0f;
        }
        Intrinsics.checkNotNull(string2);
        string2 = mz3_0.M(string2);
        bl2 = mz3_0.C(string2);
        if (bl2) {
            f5 = Float.parseFloat(string2);
        }
        return f5;
    }

    public static final String H(String string2) {
        boolean bl2;
        String string3 = "0";
        if (string2 != null && (bl2 = mz3_0.C(string2 = mz3_0.M(string2)))) {
            double d2 = Double.parseDouble(string2);
            int n3 = ok1_1.a(d2);
            string3 = String.valueOf(n3);
        }
        return qz2_0.s(string3);
    }

    public static final void I(Context context) {
        String string2 = "com.android.vending";
        String string3 = "android.intent.action.VIEW";
        String string4 = "https://play.google.com/store/apps/details?id=";
        String string5 = "market://details?id=";
        Intrinsics.checkNotNullParameter(context, "context");
        AJIOApplication.Companion.getClass();
        String string6 = AJIOApplication$a.a().getPackageName();
        StringBuilder stringBuilder = new StringBuilder(string5);
        stringBuilder.append(string6);
        string5 = stringBuilder.toString();
        string5 = Uri.parse((String)string5);
        Object object = new Intent(string3, (Uri)string5);
        object.setPackage(string2);
        try {
            context.startActivity((Intent)object);
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            object = yn3_0.a;
            ((yn3$a)object).e(activityNotFoundException);
            object = new StringBuilder(string4);
            ((StringBuilder)object).append(string6);
            object = ((StringBuilder)object).toString();
            object = Uri.parse((String)object);
            Object object2 = new Intent(string3, (Uri)object);
            object2.setPackage(string2);
            try {
                context.startActivity((Intent)object2);
            }
            catch (ActivityNotFoundException activityNotFoundException2) {
                yn3_0.a.e(activityNotFoundException2);
                object2 = new StringBuilder(string4);
                ((StringBuilder)object2).append(string6);
                string4 = Uri.parse((String)((StringBuilder)object2).toString());
                Intent intent = new Intent(string3, (Uri)string4);
                context.startActivity(intent);
            }
        }
    }

    public static final float J(String string2) {
        float f5 = 0.0f;
        if (string2 != null && string2 != null) {
            Object object = "";
            boolean bl2 = string2.equals(object);
            boolean bl3 = true;
            if ((bl2 ^= bl3) == bl3 && string2 != null) {
                try {
                    f5 = Float.parseFloat(string2);
                }
                catch (NumberFormatException numberFormatException) {
                    object = yn3_0.a;
                    ((yn3$a)object).e(numberFormatException);
                }
            }
        }
        return f5;
    }

    public static final Float K(String string2) {
        if (string2 != null) {
            float f5 = Float.parseFloat(string2);
            try {
                return Float.valueOf(f5);
            }
            catch (NumberFormatException numberFormatException) {
                yn3$a yn3$a = yn3_0.a;
                yn3$a.e(numberFormatException);
            }
        }
        return null;
    }

    public static int L(int n3) {
        float f5 = n3;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        return (int)(f5 * f6 + 0.5f);
    }

    public static String M(String string2) {
        string2 = string2.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(string2, "toUpperCase(...)");
        Regex regex = new Regex("RS.");
        String string3 = "";
        string2 = regex.replace(string2, string3);
        string2 = oo1_1.a("R.", string2, string3);
        string2 = oo1_1.a("S.", string2, string3);
        string2 = oo1_1.a(",", string2, string3);
        string2 = oo1_1.a("\u20b9", string2, string3);
        return oo1_1.a(" ", string2, string3);
    }

    public static String N(CartDeliveryAddress object) {
        String string2 = "";
        if (object == null) {
            return string2;
        }
        String string3 = ((CartDeliveryAddress)object).getFirstName();
        String string4 = "getLastName(...)";
        if (string3 != null) {
            string2 = ((CartDeliveryAddress)object).getFirstName();
            Intrinsics.checkNotNullExpressionValue(string2, "getFirstName(...)");
            string2 = ((Object)StringsKt.m0(string2)).toString();
            string3 = ((CartDeliveryAddress)object).getLastName();
            if (string3 != null && (string3 = ((CartDeliveryAddress)object).getFirstName()) != null) {
                object = ((CartDeliveryAddress)object).getLastName();
                Intrinsics.checkNotNullExpressionValue(object, string4);
                object = ((Object)StringsKt.m0((CharSequence)object)).toString();
                string3 = " ";
                string2 = n1.a(string2, string3, (String)object);
            }
        } else {
            string3 = ((CartDeliveryAddress)object).getLastName();
            if (string3 != null) {
                object = ((CartDeliveryAddress)object).getLastName();
                Intrinsics.checkNotNullExpressionValue(object, string4);
                object = ((Object)StringsKt.m0((CharSequence)object)).toString();
                string2 = kp1_0.c(string2, (String)object);
            }
        }
        return string2;
    }

    /*
     * WARNING - void declaration
     */
    public static void O(boolean bl2, ConstraintLayout constraintLayout, TextView textView, ImageView imageView) {
        void var1_4;
        int n3 = mz3_0.z();
        if (n3 != 0) {
            if (bl2) {
                void var3_6;
                boolean bl3;
                Object object;
                void var2_5;
                if (var2_5 != null) {
                    object = h40_0.a;
                    object = h40_0.D(false).getFreebiesOne();
                    var2_5.setText((CharSequence)object);
                    boolean bl4 = og1_1.c();
                    if (bl4) {
                        object = var2_5.getContext();
                        n3 = R$color.luxe_color_121212;
                        int n4 = t70.getColor((Context)object, n3);
                        var2_5.setTextColor(n4);
                    }
                }
                if ((bl3 = og1_1.c()) && var3_6 != null) {
                    object = var3_6.getContext();
                    int n7 = R$drawable.ic_gift_with_product_luxe;
                    object = t70.getDrawable((Context)object, n7);
                    var3_6.setImageDrawable((Drawable)object);
                }
                if (var1_4 != null) {
                    ai0_2.B((View)var1_4);
                }
            } else if (var1_4 != null) {
                ai0_2.i((View)var1_4);
            }
        } else if (var1_4 != null) {
            ai0_2.i((View)var1_4);
        }
    }

    public static final String P(String string2) {
        Object object = "UTF-8";
        try {
            string2 = URLDecoder.decode(string2, (String)object);
        }
        catch (Exception exception) {
            object = yn3_0.a;
            ((yn3$a)object).e(exception);
            string2 = "";
        }
        return string2;
    }

    public static final String Q(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        String string3 = "";
        if (bl2) {
            return string3;
        }
        Object object = "UTF-8";
        try {
            string3 = URLEncoder.encode(string2, (String)object);
        }
        catch (Exception exception) {
            object = yn3_0.a;
            ((yn3$a)object).e(exception);
            String string4 = Log.getStackTraceString((Throwable)exception);
            Object[] objectArray = new Object[]{};
            ((yn3$a)object).a(string4, objectArray);
        }
        return string3;
    }

    public static final boolean R(String string2) {
        boolean bl2;
        if (string2 != null && (bl2 = string2.length()) > false) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public static ArrayList a(ArrayList iterator) {
        boolean bl2;
        boolean bl3;
        Intrinsics.checkNotNullParameter(iterator, "facetValues");
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.addAll((Collection<Object>)((Object)iterator));
        Object object = new ArrayList();
        iterator = ((ArrayList)((Object)iterator)).iterator();
        Object object2 = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(iterator, (String)object2);
        block0: while (bl3 = iterator.hasNext()) {
            boolean bl4;
            object2 = iterator.next();
            String string2 = "next(...)";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            boolean bl5 = ((FacetValue)(object2 = (FacetValue)object2)).getSelected();
            if (!bl5) continue;
            arrayList.remove(object2);
            string2 = ((FacetValue)object2).getName();
            Iterator iterator2 = ((ArrayList)object).iterator();
            while (bl4 = iterator2.hasNext()) {
                String string3 = ((FacetValue)iterator2.next()).getName();
                bl4 = kotlin.text.b.i(string3, string2, false);
                if (!bl4) continue;
                continue block0;
            }
            ((ArrayList)object).add(object2);
        }
        iterator = CollectionsKt.Z(object).iterator();
        while (bl2 = iterator.hasNext()) {
            object = (FacetValue)iterator.next();
            arrayList.add(0, object);
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void b(jo_2 var0, boolean var1_1, String var2_2) {
        block32: {
            block31: {
                block37: {
                    block36: {
                        block34: {
                            block35: {
                                block33: {
                                    var3_3 = var0;
                                    var4_4 = "eventNameNotification";
                                    var5_5 /* !! */  = var2_2;
                                    Intrinsics.checkNotNullParameter(var2_2, (String)var4_4);
                                    var6_6 = var2_2.length();
                                    var7_7 = "";
                                    var8_8 = "eventDescription";
                                    var9_9 = "master";
                                    var10_10 = "dynamic_app_icon_config";
                                    if (var6_6 <= 0) break block33;
                                    var4_4 = var2_2;
                                    break block34;
                                }
                                var4_4 = h40_0.a;
                                var4_4 = z40_0.Companion;
                                var5_5 /* !! */  = AJIOApplication.Companion;
                                var4_4 = Q.a((AJIOApplication$a)var5_5 /* !! */ , (z40$a)var4_4).a.d(var10_10);
                                var6_6 = (int)var4_4.optBoolean(var9_9);
                                if (var6_6 == 0) break block35;
                                var4_4 = z40$a.a((Context)AJIOApplication$a.a()).a.d(var10_10);
                                var6_6 = (int)var4_4.optBoolean(var9_9);
                                if (var6_6 != 0) {
                                    var4_4 = z40$a.a((Context)AJIOApplication$a.a()).a.d(var10_10).optJSONObject((String)var8_8);
                                } else {
                                    var6_6 = 0;
                                    var4_4 = null;
                                }
                                if (var4_4 != null && (var4_4 = var4_4.optString((String)(var5_5 /* !! */  = "eventName"))) != null) break block34;
                            }
                            var4_4 = var7_7;
                        }
                        var5_5 /* !! */  = Calendar.getInstance();
                        var11_11 = var5_5 /* !! */ .getTime();
                        var12_12 = 11;
                        var13_13 = var5_5 /* !! */ .get(var12_12);
                        var14_14 = 12;
                        var15_15 = var5_5 /* !! */ .get(var14_14);
                        var16_16 = h40_0.a;
                        var16_16 = z40_0.Companion;
                        var17_17 = AJIOApplication.Companion;
                        var18_18 /* !! */  = Q.a((AJIOApplication$a)var17_17, (z40$a)var16_16).a.d(var10_10);
                        var19_19 = var18_18 /* !! */ .optBoolean(var9_9);
                        if (!var19_19) break block36;
                        var18_18 /* !! */  = Q.a((AJIOApplication$a)var17_17, (z40$a)var16_16).a.d(var10_10);
                        var19_19 = var18_18 /* !! */ .optBoolean(var9_9);
                        if (var19_19) {
                            var18_18 /* !! */  = z40$a.a((Context)AJIOApplication$a.a()).a.d(var10_10).optJSONObject((String)var8_8);
                        } else {
                            var19_19 = false;
                            var18_18 /* !! */  = null;
                        }
                        if (var18_18 /* !! */  != null && (var20_20 = var18_18 /* !! */ .optString("startDate")) != null) break block37;
                    }
                    var20_20 = var7_7;
                }
                if (var19_19 = (var18_18 /* !! */  = Q.a((AJIOApplication$a)var17_17, (z40$a)var16_16).a.d(var10_10)).optBoolean(var9_9)) {
                    var18_18 /* !! */  = Q.a((AJIOApplication$a)var17_17, (z40$a)var16_16).a.d(var10_10);
                    var19_19 = var18_18 /* !! */ .optBoolean(var9_9);
                    if (var19_19) {
                        var18_18 /* !! */  = z40$a.a((Context)AJIOApplication$a.a()).a.d(var10_10);
                        var8_8 = var18_18 /* !! */ .optJSONObject((String)var8_8);
                    } else {
                        var21_21 = 0;
                        var8_8 = null;
                    }
                    if (var8_8 != null && (var8_8 = var8_8.optString((String)(var18_18 /* !! */  = "endDate"))) != null) {
                        var7_7 = var8_8;
                    }
                }
                var21_21 = var20_20.length();
                var18_18 /* !! */  = "Main";
                if (var21_21 == 0 || (var21_21 = var7_7.length()) == 0) ** GOTO lbl132
                var22_22 = Locale.getDefault();
                var23_23 = "yyyy-MM-dd'T'HH:mm:ssZ";
                var8_8 = new SimpleDateFormat((String)var23_23, (Locale)var22_22);
                try {
                    var20_20 = var8_8.parse((String)var20_20);
                    if (var20_20 != null) break block31;
                }
                catch (Exception v0) {}
                var20_20 = new Date();
            }
            var22_22 = var8_8.parse((String)var7_7);
            if (var22_22 != null) break block32;
            var22_22 = new Date();
            ** GOTO lbl132
        }
        var7_7 = Calendar.getInstance();
        var7_7.setTime((Date)var20_20);
        var8_8 = Calendar.getInstance();
        var8_8.setTime((Date)var22_22);
        var23_23 = var7_7.getTime();
        var14_14 = (int)var11_11.after((Date)var23_23);
        if (var14_14 == 0 && (var24_24 = var11_11.equals(var7_7 = var7_7.getTime())) == false || (var24_24 = var11_11.before((Date)(var7_7 = var8_8.getTime()))) == false && (var24_24 = var11_11.equals(var7_7 = var8_8.getTime())) == false) {
            var24_24 = false;
            var7_7 = null;
        } else {
            var24_24 = true;
        }
        var8_8 = Calendar.getInstance();
        var8_8.set(var12_12, var13_13);
        var8_8.set(12, var15_15);
        var15_15 = 13;
        var25_25 = false;
        var11_11 = null;
        var8_8.set(var15_15, 0);
        var12_12 = 14;
        var8_8.set(var12_12, 0);
        var8_8 = var8_8.getTime();
        var26_26 = Calendar.getInstance();
        var26_26.setTime((Date)var20_20);
        var26_26.set(var15_15, 0);
        var26_26.set(var12_12, 0);
        var20_20 = var26_26.getTime();
        var26_26 = Calendar.getInstance();
        var26_26.setTime((Date)var22_22);
        var26_26.set(var15_15, 0);
        var26_26.set(var12_12, 0);
        var22_22 = var26_26.getTime();
        var15_15 = (int)var8_8.after((Date)var20_20);
        if (!(var15_15 != 0 && (var15_15 = (int)var8_8.before((Date)var22_22)) != 0 || (var27_27 = var8_8.equals(var20_20)) || (var27_27 = var8_8.equals(var22_22)))) {
            var25_25 = false;
            var11_11 = null;
        } else {
            var25_25 = true;
        }
        if (!var1_1 && (!(var27_27 = (var20_20 = Q.a((AJIOApplication$a)var17_17, (z40$a)var16_16).a.d(var10_10)).optBoolean(var9_9)) || !var25_25 || !var24_24)) ** GOTO lbl132
        var20_20 = "SalesDay";
        var27_27 = Intrinsics.areEqual(var4_4, var20_20);
        if (var27_27) {
            var20_20 = "Dynamic2";
        } else {
            var20_20 = "DefaultIcon";
            Intrinsics.areEqual(var4_4, var20_20);
lbl132:
            // 4 sources

            var20_20 = var18_18 /* !! */ ;
        }
        var22_22 = "current_app_icon";
        if (var3_3 != null) {
            var18_18 /* !! */  = var3_3.getPreference((String)var22_22, (String)var18_18 /* !! */ );
        } else {
            var19_19 = false;
            var18_18 /* !! */  = null;
        }
        var6_6 = (int)Intrinsics.areEqual(var18_18 /* !! */ , var20_20);
        if (var6_6 == 0) {
            var4_4 = new Pair("icon_type", var20_20);
            var15_15 = 1;
            var5_5 /* !! */  = new Pair[var15_15];
            var24_24 = false;
            var5_5 /* !! */ [0] = var4_4;
            var4_4 = new b$a();
            var5_5 /* !! */  = var5_5 /* !! */ [0];
            var7_7 = (String)var5_5 /* !! */ .a;
            var5_5 /* !! */  = var5_5 /* !! */ .b;
            var4_4.b(var5_5 /* !! */ , (String)var7_7);
            var4_4 = var4_4.a();
            if (var3_3 != null) {
                var5_5 /* !! */  = "iconType";
                Intrinsics.checkNotNullParameter(var20_20, (String)var5_5 /* !! */ );
                var3_3.putPreference((String)var22_22, (String)var20_20);
            }
            var22_22 = DynamicIconChangeWorker.class;
            Intrinsics.checkNotNullParameter(var22_22, "workerClass");
            var3_3 = new CI3$a((Class)var22_22);
            var3_3 = (y92)((y92$a)var3_3.e((b)var4_4)).a();
            AJIOApplication.Companion.getClass();
            var20_20 = AJIOApplication$a.a();
            Intrinsics.checkNotNullParameter(var20_20, "context");
            var20_20 = ni3_1.i((Context)var20_20);
            var22_22 = "getInstance(context)";
            Intrinsics.checkNotNullExpressionValue(var20_20, (String)var22_22);
            var20_20.c((y92)var3_3);
        }
    }

    public static final void c(FragmentActivity fragmentActivity, String string2) {
        String string3 = "number";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2 && fragmentActivity != null && !(bl2 = fragmentActivity.isFinishing())) {
            string3 = new Intent("android.intent.action.DIAL");
            String string4 = "tel:";
            StringBuilder stringBuilder = new StringBuilder(string4);
            stringBuilder.append(string2);
            string2 = Uri.parse((String)stringBuilder.toString());
            string3.setData((Uri)string2);
            fragmentActivity.startActivity((Intent)string3);
        }
    }

    public static final int d(int n3) {
        float f5 = n3;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        return (int)(f5 * f6);
    }

    public static ScreenInfo e(Double object, Double d2) {
        double d5 = 0.0;
        double d7 = object != null ? (Double)object : d5;
        double d9 = 1024.0f;
        d7 *= d9;
        int n3 = 100;
        d9 = n3;
        d7 /= d9;
        if (d2 != null) {
            d5 = d2;
        }
        double d12 = 672.0f;
        d5 = d5 * d12 / d9;
        int n4 = (int)d7;
        int n7 = (int)d5;
        object = new ScreenInfo(n4, n7);
        return object;
    }

    public static Bundle f(ConvenienceFeePriceSplitUp serializable) {
        String string2;
        float f5;
        String string3;
        float f6;
        Bundle bundle = new Bundle();
        if (serializable == null) {
            return bundle;
        }
        Object object = ((ConvenienceFeePriceSplitUp)serializable).getCOD();
        if (object != null) {
            f6 = mz3_0.i(((ConvenienceFeePriceSplitUp$AmountData)object).getAmount());
            string3 = "cod_fee_slashed";
            bundle.putFloat(string3, f6);
            f5 = mz3_0.i(((ConvenienceFeePriceSplitUp$AmountData)object).getNetAmount());
            string2 = "cod_fee_actual";
            bundle.putFloat(string2, f5);
        }
        if ((object = ((ConvenienceFeePriceSplitUp)serializable).getRVP()) != null) {
            f5 = mz3_0.i(((ConvenienceFeePriceSplitUp$AmountData)object).getAmount());
            string2 = "rvp_fee";
            bundle.putFloat(string2, f5);
        }
        if ((object = ((ConvenienceFeePriceSplitUp)serializable).getDelivery()) != null) {
            f6 = mz3_0.i(((ConvenienceFeePriceSplitUp$AmountData)object).getNetAmount());
            string3 = "delivery_fee_actual";
            bundle.putFloat(string3, f6);
            f5 = mz3_0.i(((ConvenienceFeePriceSplitUp$AmountData)object).getAmount());
            string2 = "delivery_fee_slashed";
            bundle.putFloat(string2, f5);
        }
        if ((serializable = ((ConvenienceFeePriceSplitUp)serializable).getTotal()) != null) {
            float f7 = mz3_0.i(((ConvenienceFeePriceSplitUp$AmountData)serializable).getNetAmount());
            object = "total_convenience_fee";
            bundle.putFloat((String)object, f7);
        }
        return bundle;
    }

    public static final ArrayList g(CartOrder serializable, int n3) {
        ArrayList arrayList;
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        if (serializable != null && (arrayList = ((CartOrder)serializable).getEntries()) != null) {
            int n4;
            serializable = ((CartOrder)serializable).getEntries();
            Intrinsics.checkNotNullExpressionValue(serializable, "getEntries(...)");
            arrayList = null;
            for (int i3 = 0; i3 < (n4 = serializable.size()) && (n4 = arrayList2.size()) < n3; ++i3) {
                Object object = (CartEntry)serializable.get(i3);
                Product product = ((CartEntry)object).getProduct();
                if (product == null) continue;
                object = mz3_0.p(((CartEntry)object).getProduct());
                arrayList2.add(object);
            }
        }
        return arrayList2;
    }

    public static final String h(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        String string3 = "0";
        if (bl2) {
            return string3;
        }
        Intrinsics.checkNotNull(string2);
        string2 = mz3_0.M(string2);
        bl2 = mz3_0.C(string2);
        if (bl2) {
            double d2 = Double.parseDouble(string2);
            float f5 = (float)d2;
            int n3 = (int)f5;
            float f6 = n3;
            float f7 = 0.5f;
            double d5 = f6 += f7;
            double d7 = d2 - d5;
            Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            if (object >= 0) {
                string3 = Integer.toString(++n3);
                Intrinsics.checkNotNull(string3);
            } else {
                string3 = String.valueOf(n3);
            }
        }
        return string3;
    }

    public static float i(float f5) {
        String string2 = "#,###,###.##";
        Object object = new DecimalFormat(string2);
        Object object2 = Float.valueOf(f5);
        object2 = ((Format)object).format(object2);
        object = "format(...)";
        try {
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            f5 = Float.parseFloat((String)object2);
        }
        catch (NumberFormatException numberFormatException) {
            f5 = 0.0f;
            object2 = null;
        }
        return f5;
    }

    public static String j(mz3_0 object, String string2, String object2) {
        boolean bl2;
        object.getClass();
        object = "";
        if (string2 != null && (bl2 = string2.length())) {
            if (object2 == null) {
                object2 = object;
            }
            bl2 = true;
            object = kotlin.text.b.n(string2, "%x", (String)object2, bl2);
        }
        return object;
    }

    public static String k(String string2, String string3, String string4) {
        int n3;
        String string5 = "";
        if (string2 != null && (n3 = string2.length()) != 0) {
            if (string3 == null) {
                string3 = string5;
            }
            String string6 = "%x";
            boolean bl2 = true;
            string2 = kotlin.text.b.n(string2, string6, string3, bl2);
            if (string4 == null) {
                string4 = string5;
            }
            string3 = null;
            string5 = kotlin.text.b.n(string2, "%y", string4, false);
        }
        return string5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String m(Product object, String string2) {
        String string3 = "";
        if (object == null) {
            return string3;
        }
        boolean bl2 = mz3_0.z();
        if (bl2) {
            Object object2 = ((Product)object).getGiftPromotion();
            if (object2 != null) {
                object2 = ((Product)object).getGiftPromotion();
                if (object2 != null) {
                    object2 = ((GiftPromotion)object2).getGifts();
                } else {
                    bl2 = false;
                    object2 = null;
                }
                if (object2 != null) {
                    int n3;
                    if ((object = ((Product)object).getGiftPromotion()) != null) {
                        n3 = ((GiftPromotion)object).getTotalGiftCount();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    if (string2 == null) return hj0_0.a(n3, "GetFreebies - ");
                    int n4 = string2.length();
                    if (n4 == 0) return hj0_0.a(n3, "GetFreebies - ");
                    string3 = " - ";
                    return LO1.a(n3, string2, string3);
                }
            }
            if (string2 != null) return string2;
            return string3;
        }
        if (string2 != null) return string2;
        return string3;
    }

    /*
     * Unable to fully structure code
     */
    public static String n(Product var0, String var1_1) {
        block12: {
            block11: {
                var2_2 = "";
                if (var0 == null) {
                    return var2_2;
                }
                var3_3 = mz3_0.z();
                if (var3_3 == 0) break block11;
                var3_3 = var0.isGiftWithPurchase();
                var4_4 = true;
                if (var3_3 != 0) ** GOTO lbl-1000
                if ((var0 = var0.getOfferPrice()) != null) {
                    var0 = var0.getGiftAvailable();
                    var5_5 = Boolean.TRUE;
                    var6_6 = Intrinsics.areEqual(var0, var5_5);
                } else {
                    var6_6 = false;
                    var0 = null;
                }
                if (!var6_6) {
                    var6_6 = false;
                    var0 = null;
                } else lbl-1000:
                // 2 sources

                {
                    var6_6 = true;
                }
                if (var1_1 != null && (var3_3 = var1_1.length()) != 0) {
                    var4_4 = false;
                }
                if (!var4_4) {
                    if (var6_6) {
                        var0 = " - GetFreebies";
                        var1_1 = Ft2.a(var1_1, (String)var0);
                    }
lbl27:
                    // 5 sources

                    while (true) {
                        var2_2 = var1_1;
                        ** GOTO lbl37
                        break;
                    }
                } else if (var6_6) {
                    var2_2 = "GetFreebies";
                }
                break block12;
            }
            if (var1_1 != null) ** GOTO lbl27
            var1_1 = var2_2;
            ** while (true)
        }
        return var2_2;
    }

    public static final String o(Product iterator) {
        Object object = iterator != null ? ((Product)((Object)iterator)).getBaseOptions() : null;
        Object object2 = "";
        if (object == null) {
            return object2;
        }
        if ((iterator = ((Product)((Object)iterator)).getBaseOptions()) != null) {
            boolean bl2;
            iterator = iterator.iterator();
            object = object2;
            while (bl2 = iterator.hasNext()) {
                int n3;
                String string2;
                Iterator iterator2 = (ProductOption)iterator.next();
                Object object3 = hv3_0.K(R$string.color_variant_option);
                boolean bl3 = kotlin.text.b.i((String)object3, string2 = ((ProductOption)((Object)iterator2)).getVariantType(), (n3 = 1) != 0);
                if (bl3) {
                    if ((iterator2 = ((ProductOption)((Object)iterator2)).getSelected()) != null) {
                        iterator2 = ((ProductOptionItem)((Object)iterator2)).getVariantOptionQualifiers();
                    } else {
                        bl2 = false;
                        iterator2 = null;
                    }
                    if (iterator2 != null) {
                        iterator2 = iterator2.iterator();
                        while (bl3 = iterator2.hasNext()) {
                            String string3;
                            object3 = (ProductOptionVariant)iterator2.next();
                            string2 = ((ProductOptionVariant)object3).getName();
                            boolean bl4 = Intrinsics.areEqual(string2, string3 = hv3_0.K(n3 = R$string.color_variant_name));
                            if (!bl4) continue;
                            object = ((ProductOptionVariant)object3).getValue();
                            if (object != null) break;
                            object = object2;
                            break;
                        }
                    }
                }
                if (bl2 = TextUtils.isEmpty((CharSequence)object)) continue;
            }
            object2 = object;
        }
        return object2;
    }

    public static final String p(Product object) {
        boolean bl2;
        boolean bl3;
        Object object2;
        Object object3;
        block6: {
            object3 = object != null ? ((Product)object).getImages() : null;
            object2 = "";
            if (object3 == null) {
                return object2;
            }
            object3 = ((Product)object).getImages();
            Intrinsics.checkNotNull(object3);
            object3 = object3.iterator();
            while (bl3 = object3.hasNext()) {
                String string2 = "mobileProductListingImage";
                ProductImage productImage = (ProductImage)object3.next();
                String string3 = productImage.getFormat();
                boolean bl4 = string2.equalsIgnoreCase(string3);
                if (!bl4) continue;
                object3 = productImage.getUrl();
                if (object3 != null) break block6;
            }
            object3 = object2;
        }
        if (bl3 = TextUtils.isEmpty((CharSequence)object3)) {
            if ((object = ((Product)object).getImages()) != null) {
                object3 = null;
                if ((object = (ProductImage)object.get(0)) != null && (object = ((ProductImage)object).getUrl()) != null) {
                    object2 = object;
                }
            }
            object3 = object2;
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)object3))) {
            object = UrlHelper.Companion.getInstance();
            object3 = ((UrlHelper)object).getImageUrl((String)object3);
        }
        return object3;
    }

    public static String q(String string2, ProductUserSizeRecomResponse productUserSizeRecomResponse) {
        String string3;
        block1: {
            boolean bl2;
            string3 = "";
            if (productUserSizeRecomResponse == null) {
                return string3;
            }
            String string4 = "BRAND";
            boolean bl3 = string2.equals(string4);
            if (bl3 == (bl2 = true) ? (string2 = productUserSizeRecomResponse.getBrandSizeAttribute()) == null : (string2 = productUserSizeRecomResponse.getUniversalSizeAttribute()) == null) break block1;
            string3 = string2;
        }
        return string3;
    }

    public static ArrayList r() {
        List list = xx_2.i("sizerecommendation", "uservoice");
        Object object = h40_0.a;
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.e("priorityForPdpToolTip");
        ArrayList<String> arrayList = new ArrayList<String>();
        int n3 = object.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = object.getString(i3);
            Collection collection = list;
            collection = list;
            int n4 = collection.size();
            for (int i8 = 0; i8 < n4; ++i8) {
                String string3 = (String)list.get(i8);
                boolean bl2 = kotlin.text.b.i(string2, string3, false);
                if (!bl2) continue;
                string3 = list.get(i8);
                arrayList.add(string3);
            }
        }
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static ConvenienceFeePriceSplitUp s(float f5, float f6, float f7, float f8) {
        ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp;
        block18: {
            Serializable serializable;
            int n3;
            block17: {
                block16: {
                    block15: {
                        n3 = 31;
                        serializable = convenienceFeePriceSplitUp;
                        convenienceFeePriceSplitUp = new ConvenienceFeePriceSplitUp(null, null, null, null, null, n3, null);
                        int n4 = 15;
                        try {
                            serializable = new ConvenienceFeePriceSplitUp$AmountData(0.0f, 0.0f, null, false, n4, null);
                        }
                        catch (Exception exception) {
                            return convenienceFeePriceSplitUp;
                        }
                        convenienceFeePriceSplitUp.setCOD((ConvenienceFeePriceSplitUp$AmountData)serializable);
                        serializable = convenienceFeePriceSplitUp.getCOD();
                        if (serializable == null) break block15;
                        ((ConvenienceFeePriceSplitUp$AmountData)serializable).setNetAmount(f7);
                    }
                    n3 = 15;
                    serializable = new ConvenienceFeePriceSplitUp$AmountData(0.0f, 0.0f, null, false, n3, null);
                    convenienceFeePriceSplitUp.setRVP((ConvenienceFeePriceSplitUp$AmountData)serializable);
                    serializable = convenienceFeePriceSplitUp.getRVP();
                    if (serializable == null) break block16;
                    ((ConvenienceFeePriceSplitUp$AmountData)serializable).setAmount(f8);
                }
                n3 = 15;
                serializable = new ConvenienceFeePriceSplitUp$AmountData(0.0f, 0.0f, null, false, n3, null);
                convenienceFeePriceSplitUp.setDelivery((ConvenienceFeePriceSplitUp$AmountData)serializable);
                serializable = convenienceFeePriceSplitUp.getDelivery();
                if (serializable == null) break block17;
                ((ConvenienceFeePriceSplitUp$AmountData)serializable).setNetAmount(f6);
            }
            n3 = 15;
            serializable = new ConvenienceFeePriceSplitUp$AmountData(0.0f, 0.0f, null, false, n3, null);
            convenienceFeePriceSplitUp.setTotal((ConvenienceFeePriceSplitUp$AmountData)serializable);
            serializable = convenienceFeePriceSplitUp.getTotal();
            if (serializable == null) break block18;
            ((ConvenienceFeePriceSplitUp$AmountData)serializable).setNetAmount(f5);
        }
        return convenienceFeePriceSplitUp;
    }

    public static final Typeface t(AJIOApplication aJIOApplication, int n3) {
        FontsManager fontsManager = FontsManager.getInstance();
        aJIOApplication = fontsManager.getTypefaceWithFont((Context)aJIOApplication, n3);
        if (aJIOApplication == null) {
            aJIOApplication = Typeface.DEFAULT;
        }
        return aJIOApplication;
    }

    public static String u(String string2) {
        Intrinsics.checkNotNullParameter(string2, "requestId");
        Object object = "User_Type";
        boolean bl2 = Intrinsics.areEqual(string2, object);
        if (bl2) {
            object = h40_0.a;
            bl2 = h40_0.Y0();
            if (bl2) {
                string2 = "User_Type_v3";
            }
        }
        return string2;
    }

    public static ArrayList v(ImmutableList immutableList) {
        Intrinsics.checkNotNullParameter(immutableList, "immutableList");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(immutableList);
        return arrayList;
    }

    public static boolean w(String string2) {
        Object object = h40_0.a;
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.d("refund_mop_list").optJSONArray("ajio_cash");
        return mz3_0.x(string2, (JSONArray)object);
    }

    public static boolean x(String string2, JSONArray jSONArray) {
        int n3;
        boolean bl2 = false;
        if (string2 != null && (n3 = string2.length()) != 0 && jSONArray != null) {
            n3 = jSONArray.length();
            for (int i3 = 0; i3 < n3; ++i3) {
                String string3 = jSONArray.getString(i3);
                boolean bl3 = Intrinsics.areEqual(string2, string3);
                if (!bl3) continue;
                bl2 = true;
                break;
            }
        }
        return bl2;
    }

    public static boolean y(String string2) {
        Intrinsics.checkNotNullParameter(string2, "clusterId");
        Object object = h40_0.a;
        boolean bl2 = h40_0.Y0();
        if (bl2) {
            object = "earlyaccess";
            boolean bl3 = StringsKt.F(string2, (CharSequence)object, false);
            return bl3;
        }
        AJIOApplication.Companion.getClass();
        return UserInformation.getInstance((Context)AJIOApplication$a.a()).isEarlyAccessMember();
    }

    public static boolean z() {
        String string2;
        Object object = h40_0.a;
        boolean bl2 = ((h40_0)object).f1();
        if (bl2 && ((bl2 = ((String)(object = od3_2.a())).equals(string2 = ld3_2.STORE_AJIO.getStoreId())) || (bl2 = ((String)(object = od3_2.a())).equals(string2 = ld3_2.STORE_LUXE.getStoreId())))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final String l(int n3, boolean bl2, boolean bl3) {
        Object object;
        String string2 = "messageNoReturnAndExchange";
        String string3 = "optString(...)";
        if (n3 <= 0) {
            object = h40_0.a;
            object = h40_0.d().optString(string2);
            Intrinsics.checkNotNullExpressionValue(object, string3);
        } else if (bl2 && bl3) {
            object = h40_0.a;
            object = h40_0.d();
            String string4 = "messageReturnAndExchange";
            object = object.optString(string4);
            Intrinsics.checkNotNullExpressionValue(object, string3);
        } else if (bl2) {
            object = h40_0.a;
            object = h40_0.d();
            String string5 = "messageReturn";
            object = object.optString(string5);
            Intrinsics.checkNotNullExpressionValue(object, string3);
        } else if (bl3) {
            object = h40_0.a;
            object = h40_0.d();
            String string6 = "messageExchange";
            object = object.optString(string6);
            Intrinsics.checkNotNullExpressionValue(object, string3);
        } else {
            object = h40_0.a;
            object = h40_0.d().optString(string2);
            Intrinsics.checkNotNullExpressionValue(object, string3);
        }
        String string7 = String.valueOf(n3);
        return mz3_0.j(this, (String)object, string7);
    }
}

