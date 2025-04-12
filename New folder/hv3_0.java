/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.ClipData
 *  android.content.ClipboardManager
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.ColorFilter
 *  android.graphics.Point
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Looper
 *  android.text.Html
 *  android.text.SpannableString
 *  android.text.Spanned
 *  android.text.TextUtils
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 *  android.text.style.UnderlineSpan
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.view.animation.Animation
 *  android.view.animation.TranslateAnimation
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.TextView
 */
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.gson.Gson;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$font;
import com.ril.ajio.R$id;
import com.ril.ajio.R$integer;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.CartExchangeReturnPolicy;
import com.ril.ajio.services.data.Product.CategoryTags;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.Tag;
import com.ril.ajio.services.data.Product.TagPrimary;
import com.ril.ajio.services.data.Product.TagResponse;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.JsonUtils;
import com.ril.ajio.utility.CustomTypefaceSpan;
import com.ril.ajio.utility.UiUtils$getPermissionListYetToBeGrantedByUser$type$1;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/*
 * Renamed from Hv3
 */
public final class hv3_0 {
    public static final hv3_0 a;
    public static int b;
    public static int c;
    public static final HashMap d;
    public static final HashMap e;
    public static final UserInformation f;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        d = hashMap = new HashMap();
        e = hashMap = new HashMap();
        f = VX0.a(AJIOApplication.Companion);
    }

    public static String A(ProductFnlColorVariantData productFnlColorVariantData) {
        Object object = h40_0.a;
        int n3 = h40_0.W0();
        String string2 = null;
        if (n3 != 0) {
            if (productFnlColorVariantData != null) {
                string2 = productFnlColorVariantData.getProductTag();
            }
            return string2;
        }
        if (productFnlColorVariantData == null) {
            return null;
        }
        object = productFnlColorVariantData.getExclusiveTill();
        if (object != null) {
            string2 = "Exclusive";
        } else {
            object = productFnlColorVariantData.getProductTag();
            if (object != null && (n3 = ((String)object).length()) != 0) {
                string2 = productFnlColorVariantData.getProductTag();
            }
        }
        return string2;
    }

    public static final Resources B() {
        AJIOApplication.Companion.getClass();
        Resources resources = AJIOApplication$a.a().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return resources;
    }

    public static final Resources C() {
        AJIOApplication.Companion.getClass();
        Resources resources = AJIOApplication$a.a().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return resources;
    }

    public static final boolean D() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("return_refund_enable");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int E() {
        Class<hv3_0> clazz = hv3_0.class;
        synchronized (clazz) {
            try {
                int n3 = c;
                if (n3 != 0) return c;
                Object object = AJIOApplication.Companion;
                object.getClass();
                object = AJIOApplication$a.a();
                String string2 = "window";
                object = object.getSystemService(string2);
                string2 = "null cannot be cast to non-null type android.view.WindowManager";
                Intrinsics.checkNotNull(object, string2);
                object = (WindowManager)object;
                object = object.getDefaultDisplay();
                string2 = new Point();
                object.getSize((Point)string2);
                c = n3 = ((Point)string2).y;
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int F() {
        Class<hv3_0> clazz = hv3_0.class;
        synchronized (clazz) {
            try {
                int n3 = b;
                if (n3 != 0) return b;
                Object object = AJIOApplication.Companion;
                object.getClass();
                object = AJIOApplication$a.a();
                String string2 = "window";
                object = object.getSystemService(string2);
                string2 = "null cannot be cast to non-null type android.view.WindowManager";
                Intrinsics.checkNotNull(object, string2);
                object = (WindowManager)object;
                object = object.getDefaultDisplay();
                string2 = new Point();
                object.getSize((Point)string2);
                b = n3 = ((Point)string2).x;
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static Pair G(Product object) {
        Object object2 = z40_0.Companion;
        object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
        boolean bl2 = ((ao0_0)object2).a("enable_urgency_driver_plp");
        String string2 = null;
        if (bl2 && object != null && (object = ((Product)object).getTags()) != null && (object = ((Tag)object).getCategoryTags()) != null) {
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                String string3;
                boolean bl4;
                Object object3;
                object2 = (CategoryTags)object.next();
                if (object2 == null || (object3 = ((CategoryTags)object2).getCategory()) == null || (bl4 = ((String)object3).equalsIgnoreCase(string3 = "SELLING_POINT")) != (bl3 = true)) continue;
                object3 = Boolean.TRUE;
                if ((object2 = ((CategoryTags)object2).getPrimary()) != null) {
                    string2 = ((TagPrimary)object2).getValue();
                }
                object = new Pair(object3, string2);
                return object;
            }
        }
        object2 = Boolean.FALSE;
        object = new Pair(object2, null);
        return object;
    }

    public static Pair H(Product object, boolean bl2) {
        Object object2;
        Iterator iterator;
        boolean bl3 = hv3_0.N(bl2);
        ProductFnlColorVariantData productFnlColorVariantData = null;
        if (!bl3) {
            Boolean bl4 = Boolean.TRUE;
            object = new Pair(bl4, null);
            return object;
        }
        if (object != null) {
            iterator = ((Product)object).getTags();
        } else {
            bl3 = false;
            iterator = null;
        }
        if (iterator != null) {
            iterator = ((Product)object).getTags();
        } else if (object != null && (iterator = ((Product)object).getTagResponse()) != null) {
            iterator = ((TagResponse)((Object)iterator)).getTag();
        } else {
            bl3 = false;
            iterator = null;
        }
        boolean bl5 = false;
        int n3 = 1;
        Object object3 = "";
        if (iterator != null && (iterator = ((Tag)((Object)iterator)).getCategoryTags()) != null) {
            boolean bl6;
            iterator = ((Iterable)((Object)iterator)).iterator();
            while (bl6 = iterator.hasNext()) {
                String string2;
                int n4;
                Object object4;
                Object object5 = (CategoryTags)iterator.next();
                if (object5 != null && (object4 = ((CategoryTags)object5).getCategory()) != null && (n4 = ((String)object4).equalsIgnoreCase(string2 = "SELLING_POINT")) == n3) {
                    object3 = ((CategoryTags)object5).getPrimary();
                    object3 = object3 != null ? ((TagPrimary)object3).getValue() : null;
                    object3 = String.valueOf(object3);
                }
                if (bl2) {
                    object4 = h40_0.a;
                    n4 = h40_0.H1();
                } else {
                    object4 = h40_0.a;
                    n4 = h40_0.C1();
                }
                if (n4 == 0) continue;
                if (object5 != null && (object4 = ((CategoryTags)object5).getCategory()) != null && (n4 = (int)(((String)object4).equalsIgnoreCase(string2 = "URGENCY") ? 1 : 0)) == n3) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    object4 = null;
                }
                if (n4 == 0) continue;
                n4 = ((String)object3).length();
                if (n4 == 0) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    object4 = null;
                }
                if (n4 != 0) {
                    object3 = ((CategoryTags)object5).getPrimary();
                    object3 = object3 != null ? ((TagPrimary)object3).getValue() : null;
                    object3 = String.valueOf(object3);
                    continue;
                }
                if ((object5 = ((CategoryTags)object5).getPrimary()) != null) {
                    object5 = ((TagPrimary)object5).getValue();
                } else {
                    bl6 = false;
                    object5 = null;
                }
                object4 = ", ";
                object3 = nb0_0.a((String)object3, (String)object4, (String)object5);
            }
        }
        if (!(bl2 = ((String)object3).length())) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        if (bl2 && (bl2 = ((Boolean)(object2 = (Boolean)hv3_0.G((Product)object).a)).booleanValue()) && (object2 = (String)hv3_0.G((Product)object).b) != null) {
            object3 = object2;
        }
        if (!(bl2 = ((String)object3).length())) {
            bl5 = true;
        }
        if (bl5) {
            if (object != null) {
                productFnlColorVariantData = ((Product)object).getFnlColorVariantData();
            }
            if ((object = hv3_0.A(productFnlColorVariantData)) != null) {
                object3 = object;
            }
        }
        object2 = Boolean.TRUE;
        object = new Pair(object2, object3);
        return object;
    }

    public static SpannableString I(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            string2 = hv3_0.f(string2);
            SpannableString spannableString = new SpannableString((CharSequence)string2);
            int n4 = 1;
            int n7 = StringsKt.F((CharSequence)spannableString, string2 = "View All Products>", n4 != 0);
            if (n7 != 0) {
                int n8 = StringsKt.L(0, (CharSequence)spannableString, string2, n4 != 0);
                n7 = n8 + 18;
                AJIOApplication.Companion.getClass();
                AJIOApplication aJIOApplication = AJIOApplication$a.a();
                int n10 = R$color.link_color_size_recommend;
                int n14 = t70.getColor((Context)aJIOApplication, n10);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(n14);
                n14 = 18;
                spannableString.setSpan((Object)foregroundColorSpan, n8, n7, n14);
                foregroundColorSpan = new StyleSpan(n4);
                spannableString.setSpan((Object)foregroundColorSpan, n8, n7, n14);
            }
            return spannableString;
        }
        string2 = new SpannableString((CharSequence)"");
        return string2;
    }

    public static final String J(int n3, int n4) {
        Object object = StringCompanionObject.INSTANCE;
        object = hv3_0.K(R$string.step);
        Integer n7 = n3;
        Integer n8 = n4;
        int n10 = 2;
        Object[] objectArray = new Object[n10];
        objectArray[0] = n7;
        objectArray[1] = n8;
        return xh2_0.a(objectArray, n10, (String)object, "format(...)");
    }

    public static final String K(int n3) {
        AJIOApplication.Companion.getClass();
        String string2 = AJIOApplication$a.a().getString(n3);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String L(int n3, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "formatArgs");
        String string2 = hv3_0.K(n3);
        int n4 = objectArray.length;
        objectArray = Arrays.copyOf(objectArray, n4);
        n4 = objectArray.length;
        return xh2_0.a(objectArray, n4, string2, "format(...)");
    }

    public static String M() {
        boolean bl2 = og1_1.c();
        String string2 = bl2 ? "_luxe" : "_ajio";
        return string2;
    }

    public static boolean N(boolean bl2) {
        if (bl2) {
            Object object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            String string2 = "enable_urgency_driver_plp";
            bl2 = ((ao0_0)object).a(string2);
        } else {
            Object object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            String string3 = "enable_urgency_driver_pdp";
            bl2 = ((ao0_0)object).a(string3);
        }
        return bl2;
    }

    public static int O(int n3, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float f5 = n3;
        context = context.getResources().getDisplayMetrics();
        return (int)TypedValue.applyDimension((int)1, (float)f5, (DisplayMetrics)context);
    }

    public static int P(FragmentActivity fragmentActivity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (fragmentActivity != null && (fragmentActivity = fragmentActivity.getWindowManager()) != null && (fragmentActivity = fragmentActivity.getDefaultDisplay()) != null) {
            fragmentActivity.getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    public static int Q(FragmentActivity fragmentActivity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (fragmentActivity != null && (fragmentActivity = fragmentActivity.getWindowManager()) != null && (fragmentActivity = fragmentActivity.getDefaultDisplay()) != null) {
            fragmentActivity.getMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels;
    }

    public static boolean R(String string2) {
        Object object = "permission";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        boolean bl2 = true;
        if (n3 >= n4) {
            int n7;
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            n4 = 0;
            if (object == null || (n7 = t70.checkSelfPermission((Context)(object = AJIOApplication$a.a()), string2)) != 0) {
                bl2 = false;
            }
        }
        return bl2;
    }

    public static final void S(Activity activity) {
        boolean bl2;
        if (activity != null && !(bl2 = activity.isFinishing())) {
            Object object = "input_method";
            object = activity.getSystemService((String)object);
            String string2 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager";
            Intrinsics.checkNotNull(object, string2);
            object = (InputMethodManager)object;
            activity = activity.getWindow();
            activity = activity.getDecorView();
            activity = activity.getWindowToken();
            string2 = null;
            try {
                object.hideSoftInputFromWindow((IBinder)activity, 0);
            }
            catch (Exception exception) {
                object = yn3_0.a;
                ((yn3$a)object).e(exception);
            }
        }
    }

    public static boolean T() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("cart_price_drop");
    }

    public static final boolean U() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "android_closet_card_in_home";
        boolean bl2 = ((ao0_0)object).a(string2);
        if (bl2 && !(bl2 = og1_1.c()) && (bl2 = ((UserInformation)(object = f)).isUserOnline())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static boolean V(Product product) {
        boolean bl2;
        boolean bl3;
        boolean bl4 = false;
        if (product != null && (bl3 = product.isComingSoonProduct()) == (bl2 = true)) {
            bl4 = true;
        }
        return bl4;
    }

    public static final boolean W() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("enableDeliveredAddressOnTop");
    }

    public static boolean X() {
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        Object object2 = new jo_2((Context)object);
        object = "MANDATORY_PERMISSIONS_DIALOG_TIME";
        long l2 = 0L;
        long l3 = ((sw_0)object2).getPreference((String)object, l2);
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (l4 > 0) {
            l2 = System.currentTimeMillis() - l3;
            object2 = TimeUnit.MILLISECONDS;
            l3 = ((TimeUnit)((Object)object2)).toDays(l2);
            Object object3 = z40_0.Companion;
            Object object4 = AJIOApplication$a.a();
            object3.getClass();
            object3 = z40$a.a((Context)object4).a;
            object4 = "mandatory_on_start_perm_duration";
            int n3 = ((ao0_0)object3).g((String)object4);
            l2 = n3;
            l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (l4 < 0) {
                return false;
            }
        }
        return true;
    }

    public static final boolean Y() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("enableSizeGuide");
    }

    public static boolean Z(String string2) {
        if (string2 != null) {
            Object object = Locale.ROOT;
            string2 = string2.toUpperCase((Locale)object);
            object = "toUpperCase(...)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object);
        } else {
            string2 = null;
        }
        return kotlin.text.b.i(string2, "GIF", false);
    }

    public static boolean a(FragmentActivity object, boolean bl2) {
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        Object[] objectArray = new jo_2((Context)aJIOApplication);
        aJIOApplication = AJIOApplication$a.a();
        String string2 = "android.permission.POST_NOTIFICATIONS";
        int n3 = t70.checkSelfPermission((Context)aJIOApplication, string2);
        boolean bl3 = false;
        if (n3 == 0) {
            object = yn3_0.a;
            objectArray = new Object[]{};
            ((yn3$a)object).a("Notification testing onCreate: PERMISSION GRANTED", objectArray);
            return false;
        }
        n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            int n7;
            n3 = 1;
            if (object == null || (n7 = androidx.core.app.b.b((Activity)object, string2)) != n3) {
                if (bl2) {
                    long l2 = System.currentTimeMillis();
                    string2 = "MANDATORY_PERMISSIONS_DIALOG_TIME";
                    objectArray.putPreference(string2, l2);
                }
                bl3 = true;
            }
        }
        return bl3;
    }

    public static void a0(AjioTextView ajioTextView, String string2) {
        String string3 = "textView";
        Intrinsics.checkNotNullParameter(ajioTextView, string3);
        if (string2 != null) {
            string3 = new SpannableString((CharSequence)string2);
            UnderlineSpan underlineSpan = new UnderlineSpan();
            int n3 = string2.length();
            string3.setSpan((Object)underlineSpan, 0, n3, 0);
            ajioTextView.setText(string3);
        }
    }

    public static void b(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "text");
        Intrinsics.checkNotNullParameter(string3, "toastMsg");
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a().getSystemService("clipboard");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.content.ClipboardManager");
        object = (ClipboardManager)object;
        string2 = ClipData.newPlainText((CharSequence)"ajio_copy", (CharSequence)string2);
        object.setPrimaryClip((ClipData)string2);
        hv3_0.o0(0, string3, null);
    }

    public static final String b0(long l2) {
        CharSequence charSequence;
        String string2;
        long l3 = 1000;
        l2 /= l3;
        int n3 = 3600;
        l3 = n3;
        l3 = l2 / l3;
        int n4 = 60;
        long l4 = n4;
        long l7 = l2 / l4 % l4;
        l2 %= l4;
        CharSequence charSequence2 = "0";
        long l8 = 10;
        String string3 = "00";
        long l12 = 0L;
        long l14 = l3 - l12;
        Object object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object == false) {
            string2 = string3;
        } else {
            object = l3 == l8 ? 0 : (l3 < l8 ? -1 : 1);
            if (object < 0) {
                string2 = Wm2.a(l3, (String)charSequence2);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(l3);
                string2 = stringBuilder.toString();
            }
        }
        Object object2 = l7 == l12 ? 0 : (l7 < l12 ? -1 : 1);
        if (object2 == false) {
            charSequence = string3;
        } else {
            object2 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
            if (object2 < 0) {
                charSequence = Wm2.a(l7, (String)charSequence2);
            } else {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(l7);
                charSequence = ((StringBuilder)charSequence).toString();
            }
        }
        long l15 = l2 == l12 ? 0 : (l2 < l12 ? -1 : 1);
        if (l15 != false) {
            Object object3 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
            if (object3 < 0) {
                string3 = Wm2.a(l2, (String)charSequence2);
            } else {
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append(l2);
                string3 = ((StringBuilder)charSequence2).toString();
            }
        }
        String string4 = ":";
        return KW.a(string2, string4, (String)charSequence, string4, string3);
    }

    public static void c(boolean bl2, float f5, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAlpha(f5);
        view.setClickable(bl2);
        view.setEnabled(bl2);
    }

    public static void c0(ActionContent object, FragmentManager fragmentManager) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(string2, "entrypoint");
        String string3 = "fragmentManager";
        Intrinsics.checkNotNullParameter(fragmentManager, string3);
        if (object != null) {
            pm2_2.Companion.getClass();
            string3 = "actionContent";
            Intrinsics.checkNotNullParameter(object, string3);
            Bundle bundle = new Bundle();
            String string4 = "EntryPoint";
            bundle.putCharSequence(string4, (CharSequence)string2);
            bundle.putSerializable(string3, (Serializable)object);
            object = new pm2_2();
            ((Fragment)object).setArguments(bundle);
        } else {
            object = null;
        }
        if (object != null) {
            string3 = "RetrunFeeInfoBottomSheet";
            ((DialogFragment)object).show(fragmentManager, string3);
        }
    }

    public static String d(ProductOptionItem iterator) {
        Intrinsics.checkNotNullParameter(iterator, "selectedSizeProduct");
        Object object = ((ProductOptionItem)((Object)iterator)).getVariantOptionQualifiers();
        if (object != null) {
            int n3;
            object = ((ProductOptionItem)((Object)iterator)).getVariantOptionQualifiers();
            if (object != null) {
                n3 = object.size();
                object = n3;
            } else {
                n3 = 0;
                object = null;
            }
            Intrinsics.checkNotNull(object);
            n3 = (Integer)object;
            if (n3 > 0 && (iterator = ((ProductOptionItem)((Object)iterator)).getVariantOptionQualifiers()) != null) {
                iterator = ((Iterable)((Object)iterator)).iterator();
                while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    String string2 = "imsBatchId";
                    object = (ProductOptionVariant)iterator.next();
                    String string3 = ((ProductOptionVariant)object).getQualifier();
                    boolean bl2 = string2.equalsIgnoreCase(string3);
                    if (!bl2) continue;
                    return ((ProductOptionVariant)object).getValue();
                }
            }
        }
        return null;
    }

    public static void d0(int n3, String string2, String string3, TextView textView, int n4, Function0 object) {
        int n7;
        Object object2;
        String string4;
        int n8;
        Intrinsics.checkNotNullParameter(textView, "textview");
        String string5 = "callback";
        Intrinsics.checkNotNullParameter(object, string5);
        if (string2 == null) {
            return;
        }
        if (string3 == null) {
            string3 = "";
        }
        if ((n8 = string2.length()) > 0 && n3 > 0) {
            string4 = String.valueOf(n3);
            n8 = 0;
            string5 = null;
            object2 = "{return_fee}";
            string2 = kotlin.text.b.n(string2, object2, string4, false);
        }
        n3 = string2.length() + 1;
        object2 = nb0_0.a(string2, " ", string3);
        string5 = new SpannableString((CharSequence)object2);
        object2 = new ev3_0((Function0)object, textView, n4);
        Context context = textView.getContext();
        n4 = t70.getColor(context, n4);
        object = new ForegroundColorSpan(n4);
        n4 = string3.length() + n3;
        int n10 = 33;
        string5.setSpan(object, n3, n4, n10);
        Context context2 = textView.getContext();
        int n14 = R$font.muli_bold_font;
        context2 = WK2.c(n14, context2);
        if (context2 != null) {
            object = new CustomTypefaceSpan((Typeface)context2);
            n7 = string2.length() + 1;
            n4 = string5.length();
            string5.setSpan(object, n7, n4, n10);
        }
        n7 = string3.length() + n3;
        string5.setSpan(object2, n3, n7, n10);
        string4 = LinkMovementMethod.getInstance();
        textView.setMovementMethod((MovementMethod)string4);
        textView.setText((CharSequence)string5);
        textView.setContentDescription((CharSequence)string5);
    }

    public static ArrayList e(ArrayList object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "wantedPermissions");
        ArrayList<String> arrayList = new ArrayList<String>();
        object = ((ArrayList)object).iterator();
        String string2 = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        while (bl2 = object.hasNext()) {
            string2 = object.next();
            String string3 = "next(...)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            boolean bl3 = hv3_0.R(string2);
            if (bl3) continue;
            arrayList.add(string2);
        }
        return arrayList;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void e0(Dialog dialog) {
        Exception exception2;
        Object object;
        block5: {
            int n3;
            Window window;
            block4: {
                block3: {
                    try {
                        object = new WindowManager.LayoutParams();
                        window = dialog.getWindow();
                        if (window == null) return;
                        window = dialog.getWindow();
                        if (window == null) break block3;
                        window = window.getAttributes();
                        break block4;
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                }
                n3 = 0;
                window = null;
            }
            object.copyFrom((WindowManager.LayoutParams)window);
            double d2 = hv3_0.F();
            double d5 = 0.8;
            n3 = (int)(d2 *= d5);
            {
                ((WindowManager.LayoutParams)object).width = n3;
                ((WindowManager.LayoutParams)object).height = n3 = -2;
                dialog = dialog.getWindow();
                if (dialog == null) return;
                dialog.setAttributes((WindowManager.LayoutParams)object);
                return;
            }
        }
        object = yn3_0.a;
        ((yn3$a)object).e(exception2);
    }

    public static final Spanned f(String string2) {
        if (string2 == null) {
            string2 = new SpannableString((CharSequence)"");
            return string2;
        }
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            string2 = jC2.a(string2);
            Intrinsics.checkNotNull(string2);
        } else {
            string2 = Html.fromHtml((String)string2);
            Intrinsics.checkNotNull(string2);
        }
        return string2;
    }

    public static final void f0(int n3, int n4) {
        Object object;
        AJIOApplication.Companion.getClass();
        Object object2 = AJIOApplication$a.a();
        Object object3 = new jo_2((Context)object2);
        object2 = "AJIOSTORY_CATEGORY_NAME";
        String string2 = "";
        object3 = ((sw_0)object3).getPreference((String)object2, string2);
        String string3 = "men";
        boolean bl2 = string3.equalsIgnoreCase((String)object3);
        HashMap hashMap = e;
        HashMap hashMap2 = d;
        String string4 = "women";
        if (bl2) {
            if (hashMap2 != null) {
                object3 = n3;
                object3 = (ArrayList)hashMap2.get(object3);
            } else {
                boolean bl3 = false;
                object3 = null;
            }
            if (object3 != null) {
                Boolean bl4 = Boolean.TRUE;
                ((ArrayList)object3).set(n4, bl4);
                object = n3;
                Intrinsics.checkNotNull(hashMap2);
                hashMap2.put(object, object3);
            }
        } else {
            boolean bl5 = string4.equalsIgnoreCase((String)object3);
            if (bl5) {
                Intrinsics.checkNotNull(hashMap);
                object3 = n3;
                object3 = (ArrayList)hashMap.get(object3);
                if (object3 != null) {
                    Boolean bl6 = Boolean.TRUE;
                    ((ArrayList)object3).set(n4, bl6);
                    object = n3;
                    Intrinsics.checkNotNull(hashMap);
                    hashMap.put(object, object3);
                }
            }
        }
        a.getClass();
        Object object4 = AJIOApplication$a.a();
        object = new jo_2((Context)object4);
        object4 = ((sw_0)object).getPreference((String)object2, string2);
        object3 = new Gson();
        boolean bl7 = string3.equalsIgnoreCase((String)object4);
        if (bl7) {
            object4 = ((Gson)object3).toJson(hashMap2);
            if (object4 != null) {
                object3 = "MENAJIOSTORYMAP";
                ((sw_0)object).putPreference((String)object3, (String)object4);
            }
        } else {
            n4 = (int)(string4.equalsIgnoreCase((String)object4) ? 1 : 0);
            if (n4 != 0 && (object4 = ((Gson)object3).toJson(hashMap)) != null) {
                object3 = "WOMENAJIOSTORYMAP";
                ((sw_0)object).putPreference((String)object3, (String)object4);
            }
        }
    }

    public static final String g(CartDeliveryAddress object) {
        StringBuilder stringBuilder = new StringBuilder();
        Object object2 = ((CartDeliveryAddress)object).getLine1();
        int n3 = TextUtils.isEmpty((CharSequence)object2);
        String string2 = ",";
        if (n3 == 0) {
            object2 = ((CartDeliveryAddress)object).getLine1();
            stringBuilder.append((String)object2);
            stringBuilder.append(string2);
        }
        if ((n3 = TextUtils.isEmpty((CharSequence)(object2 = ((CartDeliveryAddress)object).getLine2()))) == 0) {
            object2 = ((CartDeliveryAddress)object).getLine2();
            stringBuilder.append((String)object2);
            stringBuilder.append(string2);
        }
        if ((n3 = TextUtils.isEmpty((CharSequence)(object2 = ((CartDeliveryAddress)object).getLandmark()))) == 0) {
            object2 = ((CartDeliveryAddress)object).getLandmark();
            stringBuilder.append((String)object2);
        }
        stringBuilder.append("\n");
        object2 = ((CartDeliveryAddress)object).getTown();
        n3 = TextUtils.isEmpty((CharSequence)object2);
        if (n3 == 0) {
            object2 = ((CartDeliveryAddress)object).getTown();
            stringBuilder.append((String)object2);
            stringBuilder.append(string2);
        }
        if ((n3 = TextUtils.isEmpty((CharSequence)(object2 = ((CartDeliveryAddress)object).getDistrict()))) == 0) {
            object2 = ((CartDeliveryAddress)object).getDistrict();
            stringBuilder.append((String)object2);
            stringBuilder.append(string2);
        }
        if ((n3 = TextUtils.isEmpty((CharSequence)(object2 = ((CartDeliveryAddress)object).getState()))) == 0) {
            object2 = ((CartDeliveryAddress)object).getState();
            stringBuilder.append((String)object2);
            stringBuilder.append(string2);
        }
        if ((object2 = ((CartDeliveryAddress)object).getCountry()) != null) {
            object2 = ((CartDeliveryAddress)object).getCountry().getName();
            stringBuilder.append((String)object2);
            stringBuilder.append("-");
            object2 = ((CartDeliveryAddress)object).getPostalCode();
            stringBuilder.append((String)object2);
        }
        if ((n3 = TextUtils.isEmpty((CharSequence)(object2 = ((CartDeliveryAddress)object).getPhone()))) == 0) {
            stringBuilder.append("\n\n");
            n3 = R$string.address_mobile_title;
            object2 = hv3_0.K(n3);
            stringBuilder.append((String)object2);
            object2 = " ";
            stringBuilder.append((String)object2);
            object = ((CartDeliveryAddress)object).getPhone();
            stringBuilder.append((String)object);
        }
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

    public static void g0(String string2, String string3, TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(string2, "fulltext");
        Intrinsics.checkNotNullParameter(string3, "str");
        SpannableString spannableString = new SpannableString((CharSequence)string2);
        int n3 = hv3_0.m(R$color.accent_color_4);
        fv3_0 fv3_02 = new fv3_0(n3);
        int n4 = StringsKt.O((CharSequence)spannableString, string3, 0, false, 6);
        int n7 = string3.length() + n4;
        spannableString.setSpan((Object)fv3_02, n4, n7, 33);
        textView.setText((CharSequence)spannableString);
        string3 = LinkMovementMethod.getInstance();
        textView.setMovementMethod((MovementMethod)string3);
        textView.setHighlightColor(0);
    }

    public static Pair h(Product object, boolean bl2) {
        Serializable serializable;
        bl2 = hv3_0.N(bl2);
        String string2 = null;
        if (!bl2) {
            Boolean bl3 = Boolean.FALSE;
            object = new Pair(bl3, null);
            return object;
        }
        if (object != null) {
            serializable = ((Product)object).getTags();
        } else {
            bl2 = false;
            serializable = null;
        }
        object = serializable != null ? ((Product)object).getTags() : (object != null && (object = ((Product)object).getTagResponse()) != null ? ((TagResponse)object).getTag() : null);
        if (object != null && (object = ((Tag)object).getCategoryTags()) != null) {
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                boolean bl4;
                String string3;
                boolean bl5;
                Object object2;
                serializable = (CategoryTags)object.next();
                if (serializable == null || (object2 = ((CategoryTags)serializable).getCategory()) == null || (bl5 = ((String)object2).equalsIgnoreCase(string3 = "BARGAIN")) != (bl4 = true)) continue;
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

    public static final void h0(AjioTextView ajioTextView) {
        Intrinsics.checkNotNullParameter(ajioTextView, "sizeInfoTv");
        SpannableString spannableString = new SpannableString((CharSequence)"Select Size to check your delivery date");
        FontsManager fontsManager = FontsManager.getInstance();
        Context context = ajioTextView.getContext();
        fontsManager = fontsManager.getTypefaceWithFont(context, 10);
        AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan("", (Typeface)fontsManager);
        spannableString.setSpan((Object)ajioCustomTypefaceSpan, 0, 11, 18);
        ajioTextView.setText((CharSequence)spannableString);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final String i(CartEntry list) {
        int n3 = hv3_0.Y();
        String string2 = null;
        Object object = "";
        if (n3 != 0) {
            if ((list = list != null ? ((CartEntry)((Object)list)).getProduct() : null) != null) {
                Y63.g((Product)((Object)list));
                list = ((Product)((Object)list)).getSelectedSizeVariant();
                if (list != null) {
                    boolean bl2;
                    String string3;
                    String string4 = ((ProductOptionVariant)((Object)list)).getUniversalSizeValue();
                    if (string4 == null) return ((ProductOptionVariant)((Object)list)).getBrandValue();
                    n3 = string4.length();
                    if (n3 == 0) return ((ProductOptionVariant)((Object)list)).getBrandValue();
                    string4 = ((ProductOptionVariant)((Object)list)).getSizeDisplayType();
                    n3 = (int)(kotlin.text.b.i(string4, string3 = "STANDARD", bl2 = true) ? 1 : 0);
                    if (n3 != 0) {
                        Boolean bl3;
                        string4 = Y63.c((ProductOptionVariant)((Object)list));
                        string3 = Y63.b((ProductOptionVariant)((Object)list));
                        Boolean bl4 = Y63.j((ProductOptionVariant)((Object)list));
                        bl2 = Intrinsics.areEqual(bl4, bl3 = Boolean.TRUE);
                        if (bl2) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append((Object)string4);
                            ((StringBuilder)object).append(" (Brand size ");
                            ((StringBuilder)object).append(string3);
                            string4 = ")";
                            ((StringBuilder)object).append(string4);
                            object = ((StringBuilder)object).toString();
                        }
                    } else {
                        string4 = ((ProductOptionVariant)((Object)list)).getSizeDisplayType();
                        n3 = (int)(kotlin.text.b.i(string4, string3 = "BRAND", bl2) ? 1 : 0);
                        if (n3 != 0) {
                            object = Y63.b((ProductOptionVariant)((Object)list));
                        }
                    }
                    if (object != null && (n3 = object.length()) == 0) {
                        object = list = ((ProductOptionVariant)((Object)list)).getValue();
                    }
                }
            }
        } else if ((list = list != null && (list = ((CartEntry)((Object)list)).getProduct()) != null ? ((Product)((Object)list)).getBaseOptions() : null) != null) {
            boolean bl5;
            list = list.iterator();
            Object object2 = object;
            while (bl5 = list.hasNext()) {
                int n4;
                String string5;
                Object object3 = (ProductOption)list.next();
                Object object4 = ((ProductOption)object3).getVariantType();
                boolean bl6 = Intrinsics.areEqual(object4, string5 = hv3_0.K(n4 = R$string.size_variant_option));
                if (!bl6) continue;
                if ((object3 = ((ProductOption)object3).getSelected()) != null) {
                    object3 = ((ProductOptionItem)object3).getVariantOptionQualifiers();
                } else {
                    bl5 = false;
                    object3 = null;
                }
                if (object3 == null) continue;
                object3 = object3.iterator();
                while (bl6 = object3.hasNext()) {
                    int n7;
                    String string6;
                    object4 = (ProductOptionVariant)object3.next();
                    string5 = ((ProductOptionVariant)object4).getName();
                    if (string5 == null || (n4 = (int)(Intrinsics.areEqual(string5 = ((ProductOptionVariant)object4).getName(), string6 = hv3_0.K(n7 = R$string.size_variant_name)) ? 1 : 0)) == 0 || (object2 = ((ProductOptionVariant)object4).getValue()) != null) continue;
                    object2 = object;
                }
            }
            object = object2;
        }
        if (object == null) return string2;
        list = StringsKt.m0((CharSequence)object);
        return list.toString();
    }

    public static final boolean i0(Boolean bl2, Long l2, Long l3, Long l4) {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = ((ao0_0)object).a("enableNPETimer");
        boolean bl3 = false;
        if (object2 == 0) {
            return false;
        }
        if (l3 != null) {
            long l7;
            long l8;
            long l12;
            object = Boolean.FALSE;
            Object object3 = Intrinsics.areEqual(bl2, object);
            if (object3 != 0) {
                return false;
            }
            long l14 = l4;
            long l15 = l14 - (l12 = l3.longValue());
            object3 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
            if (object3 > 0) {
                return false;
            }
            l14 = 0L;
            l12 = l2;
            long l16 = l12 - l14;
            object3 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
            if (object3 == 0) {
                return false;
            }
            l14 = l3;
            long l17 = l2;
            l14 -= l17;
            l17 = l4;
            long l18 = l17 - l14;
            object2 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
            if (object2 > 0 && (object2 = (Object)((l8 = (l17 = l4.longValue()) - (l7 = l3.longValue())) == 0L ? 0 : (l8 < 0L ? -1 : 1))) < 0) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public static String j(Product object) {
        String string2 = null;
        if (object != null && (object = ((Product)object).getImages()) != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                String string3;
                ProductImage productImage = (ProductImage)object.next();
                String string4 = productImage.getFormat();
                boolean bl4 = kotlin.text.b.i(string4, string3 = "cartIcon", bl3 = true);
                if (!bl4 || !(bl4 = kotlin.text.b.i(string4 = productImage.getImageType(), string3 = "PRIMARY", bl3))) continue;
                object = UrlHelper.Companion.getInstance();
                string2 = productImage.getUrl();
                string2 = ((UrlHelper)object).getImageUrl(string2);
                break;
            }
        }
        return string2;
    }

    public static final void j0(String string2, String object, TextView textView) {
        boolean bl2;
        cp$a cp$a = cp_1.Companion;
        int n3 = km_1.b(cp$a);
        n3 = n3 != 0 ? hv3_0.w(R$integer.notification_anim_delay_accesibility) : hv3_0.w(R$integer.notification_anim_delay);
        cp_1 cp_12 = cp$a.e();
        cp_12.getClass();
        int n4 = cp_1.f();
        n4 = n4 != 0 ? hv3_0.w(R$integer.notification_anim_post_release_delay_accesibility) : hv3_0.w(R$integer.notification_anim_post_release_delay);
        if (textView != null && !(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            textView.setText((CharSequence)string2);
            Object object2 = null;
            string2 = new TranslateAnimation(0.0f, 0.0f, -100.0f, 0.0f);
            long l2 = n3;
            string2.setDuration(l2);
            bl2 = false;
            Handler handler = null;
            textView.setVisibility(0);
            if (object != null) {
                object2 = Looper.getMainLooper();
                handler = new Handler(object2);
                int n7 = 1;
                object2 = new gg2_2(n7, textView, object);
                long l3 = 100;
                handler.postDelayed((Runnable)object2, l3);
            }
            object = new av3_0(textView, n3);
            long l4 = n4;
            textView.postDelayed((Runnable)object, l4);
            textView.startAnimation((Animation)string2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String k(Product object) {
        Object object2 = "";
        if (object == null) {
            return object2;
        }
        Object object3 = ((Product)object).getImages();
        if (object3 == null) return object2;
        object3 = ((Product)object).getImages();
        if (object3 == null) return object2;
        object3 = (Collection)object3;
        boolean bl2 = object3.isEmpty();
        boolean bl3 = true;
        if ((bl2 ^= bl3) != bl3) return object2;
        object3 = ((Product)object).getImages();
        Intrinsics.checkNotNull(object3);
        object3 = object3.iterator();
        while (bl3 = object3.hasNext()) {
            String string2 = "mobileProductListingImage";
            ProductImage productImage = (ProductImage)object3.next();
            String string3 = productImage.getFormat();
            boolean bl4 = string2.equalsIgnoreCase(string3);
            if (!bl4) continue;
            object2 = productImage.getUrl();
            break;
        }
        if (object2 != null) return object2;
        if ((object = ((Product)object).getImages()) == null) return null;
        object2 = null;
        if ((object = (ProductImage)object.get(0)) == null) return null;
        object = ((ProductImage)object).getUrl();
        return object;
    }

    public static void k0(View object, String charSequence, Float comparable, Float f5, Boolean object2, String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.fee_label_tv;
        AjioTextView ajioTextView = (AjioTextView)object.findViewById(n3);
        int n4 = R$id.tvConvFeeType;
        AjioTextView ajioTextView2 = (AjioTextView)object.findViewById(n4);
        int n7 = R$id.fee_value_free_tv;
        AjioTextView ajioTextView3 = (AjioTextView)object.findViewById(n7);
        int n8 = R$id.fee_value_strike_tv;
        AjioTextView ajioTextView4 = (AjioTextView)object.findViewById(n8);
        int n10 = R$id.fee_value_tv;
        AjioTextView ajioTextView5 = (AjioTextView)object.findViewById(n10);
        int n14 = R$id.desc_tv;
        AjioTextView ajioTextView6 = (AjioTextView)object.findViewById(n14);
        if (string2 != null && ajioTextView6 != null) {
            ai0_2.B((View)ajioTextView6);
            ajioTextView6.setText(string2);
        }
        if (f5 == null && comparable == null) {
            ai0_2.i(object);
            Intrinsics.checkNotNull(ajioTextView);
            ai0_2.i((View)ajioTextView);
            Intrinsics.checkNotNull(ajioTextView5);
            ai0_2.i((View)ajioTextView5);
            Intrinsics.checkNotNull(ajioTextView3);
            ai0_2.i((View)ajioTextView3);
            Intrinsics.checkNotNull(ajioTextView4);
            ai0_2.i((View)ajioTextView4);
            if (ajioTextView2 != null) {
                ai0_2.i((View)ajioTextView2);
            }
        } else {
            float f6;
            float f7;
            int n15;
            float f8;
            int n16;
            Intrinsics.checkNotNull(ajioTextView);
            ai0_2.B((View)ajioTextView);
            ajioTextView.setText(charSequence);
            if (ajioTextView2 != null) {
                object = Boolean.TRUE;
                n16 = Intrinsics.areEqual(object2, object);
                object2 = ")";
                string2 = "(";
                if (n16 != 0) {
                    n16 = R$string.non_refundable;
                    object = hv3_0.K(n16);
                    StringBuilder stringBuilder = new StringBuilder(string2);
                    stringBuilder.append((String)object);
                    stringBuilder.append((String)object2);
                    object = stringBuilder.toString();
                    ajioTextView2.setText((CharSequence)object);
                } else if (bl2) {
                    object = "";
                    ajioTextView2.setText((CharSequence)object);
                } else {
                    n16 = R$string.refundable;
                    object = hv3_0.K(n16);
                    StringBuilder stringBuilder = new StringBuilder(string2);
                    stringBuilder.append((String)object);
                    stringBuilder.append((String)object2);
                    object = stringBuilder.toString();
                    ajioTextView2.setText((CharSequence)object);
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)charSequence);
                ((StringBuilder)object2).append((String)object);
                object = ((StringBuilder)object2).toString();
                ajioTextView.setContentDescription((CharSequence)object);
            }
            n16 = 0;
            float f11 = 0.0f;
            object = null;
            if (f5 != null) {
                f8 = f5.floatValue();
            } else {
                n15 = 0;
                f8 = 0.0f;
                charSequence = null;
            }
            if (comparable != null) {
                f7 = ((Float)comparable).floatValue();
            } else {
                f7 = 0.0f;
                object2 = null;
            }
            n15 = f8 == f7 ? 0 : (f8 > f7 ? 1 : -1);
            if (n15 > 0) {
                if (ajioTextView4 != null) {
                    if (f5 != null) {
                        f8 = f5.floatValue();
                    } else {
                        n15 = 0;
                        f8 = 0.0f;
                        charSequence = null;
                    }
                    charSequence = qz2_0.u(f8);
                    ajioTextView4.setText(charSequence);
                }
                if (ajioTextView4 != null) {
                    n15 = ajioTextView4.getPaintFlags() | 0x10;
                    ajioTextView4.setPaintFlags(n15);
                }
                if (ajioTextView4 != null) {
                    ai0_2.B((View)ajioTextView4);
                }
            }
            if (comparable != null) {
                f8 = ((Float)comparable).floatValue();
            } else {
                n15 = 0;
                f8 = 0.0f;
                charSequence = null;
            }
            n15 = (int)((f6 = f8 - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
            if (n15 > 0) {
                if (comparable != null) {
                    f11 = ((Float)comparable).floatValue();
                }
                object = qz2_0.u(f11);
                if (ajioTextView5 != null) {
                    ajioTextView5.setText((CharSequence)object);
                }
                if (ajioTextView5 != null) {
                    charSequence = ajioTextView.getText();
                    comparable = new Comparable<Float>();
                    ((StringBuilder)comparable).append((String)object);
                    ((StringBuilder)comparable).append((Object)charSequence);
                    object = ((StringBuilder)comparable).toString();
                    ajioTextView5.setContentDescription((CharSequence)object);
                }
                if (ajioTextView5 != null) {
                    ai0_2.B((View)ajioTextView5);
                }
            } else {
                float f12;
                if (comparable != null) {
                    f8 = ((Float)comparable).floatValue();
                } else {
                    n15 = 0;
                    f8 = 0.0f;
                    charSequence = null;
                }
                n16 = (int)((f12 = f8 - 0.0f) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1));
                if (n16 == 0) {
                    object = "Free";
                    if (ajioTextView5 != null) {
                        ajioTextView5.setText((CharSequence)object);
                    }
                    if (ajioTextView5 != null) {
                        charSequence = ajioTextView.getText();
                        comparable = new Comparable<Float>((String)object);
                        ((StringBuilder)comparable).append((Object)charSequence);
                        object = ((StringBuilder)comparable).toString();
                        ajioTextView5.setContentDescription((CharSequence)object);
                    }
                    if (ajioTextView5 != null) {
                        ai0_2.B((View)ajioTextView5);
                    }
                } else {
                    if (ajioTextView3 != null) {
                        ai0_2.B((View)ajioTextView3);
                    }
                    if (ajioTextView5 != null) {
                        ai0_2.i((View)ajioTextView5);
                    }
                }
            }
        }
    }

    public static final Class l() {
        Object object = "com.ril.ajio.ondemand.customercare.view.activity.CustomerCareActivity";
        try {
            object = Class.forName((String)object);
        }
        catch (ClassNotFoundException classNotFoundException) {
            object = null;
        }
        return object;
    }

    public static void l0(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "message");
        mq0_2.c(string2, string3);
    }

    public static final int m(int n3) {
        AJIOApplication.Companion.getClass();
        return t70.getColor((Context)AJIOApplication$a.a(), n3);
    }

    public static final void m0(View view) {
        Object object = new Handler();
        zv3_0 zv3_02 = new zv3_0(view);
        long l2 = 300L;
        try {
            object.postDelayed((Runnable)zv3_02, l2);
        }
        catch (Exception exception) {
            object = yn3_0.a;
            ((yn3$a)object).e(exception);
        }
    }

    public static final String n(Product iterator) {
        Intrinsics.checkNotNullParameter(iterator, "product");
        iterator = ((Product)((Object)iterator)).getBaseOptions();
        String string2 = "";
        if (iterator != null) {
            String string3;
            iterator = iterator.iterator();
            block0: while (true) {
                boolean bl2;
                string3 = string2;
                block1: while (bl2 = iterator.hasNext()) {
                    int n3;
                    String string4;
                    Object object = (ProductOption)iterator.next();
                    Object object2 = ((ProductOption)object).getVariantType();
                    boolean bl3 = Intrinsics.areEqual(object2, string4 = hv3_0.K(n3 = R$string.color_variant_option));
                    if (!bl3 || (object2 = ((ProductOption)object).getSelected()) == null) continue;
                    object = ((ProductOption)object).getSelected();
                    Intrinsics.checkNotNull(object);
                    if ((object = ((ProductOptionItem)object).component6()) == null) continue;
                    object = object.iterator();
                    while (bl3 = object.hasNext()) {
                        int n4;
                        String string5;
                        object2 = (ProductOptionVariant)object.next();
                        string4 = ((ProductOptionVariant)object2).getName();
                        n3 = (int)(Intrinsics.areEqual(string4, string5 = hv3_0.K(n4 = R$string.color_variant_name)) ? 1 : 0);
                        if (n3 == 0) continue;
                        string3 = ((ProductOptionVariant)object2).getValue();
                        if (string3 != null) continue block1;
                        continue block0;
                    }
                }
                break;
            }
            string2 = string3;
        }
        return string2;
    }

    public static void n0(hv3_0 object, View object2, String charSequence, Float f5, Float f6, Boolean object3, String charSequence2, Boolean bl2, int n3) {
        float f7;
        boolean bl3;
        int n4 = n3 & 0x10;
        if (n4 != 0) {
            object3 = Boolean.FALSE;
        }
        if ((n4 = n3 & 0x20) != 0) {
            bl3 = false;
            f7 = 0.0f;
            charSequence2 = null;
        }
        if ((n3 &= 0x40) != 0) {
            bl2 = Boolean.TRUE;
        }
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, "view");
        int n7 = R$id.fee_label_tv;
        object = (AjioTextView)object2.findViewById(n7);
        n3 = R$id.tvConvFeeType;
        AjioTextView ajioTextView = (AjioTextView)object2.findViewById(n3);
        n4 = R$id.fee_value_free_tv;
        AjioTextView ajioTextView2 = (AjioTextView)object2.findViewById(n4);
        int n8 = R$id.fee_value_strike_tv;
        AjioTextView ajioTextView3 = (AjioTextView)object2.findViewById(n8);
        int n10 = R$id.fee_value_tv;
        AjioTextView ajioTextView4 = (AjioTextView)object2.findViewById(n10);
        int n14 = R$id.desc_tv;
        Object object4 = (AjioTextView)object2.findViewById(n14);
        if (charSequence2 != null && object4 != null) {
            ai0_2.B((View)object4);
            object4.setText(charSequence2);
        }
        if (f6 == null && f5 == null) {
            ai0_2.i(object2);
            Intrinsics.checkNotNull(object);
            ai0_2.i((View)object);
            Intrinsics.checkNotNull(ajioTextView4);
            ai0_2.i((View)ajioTextView4);
            Intrinsics.checkNotNull(ajioTextView2);
            ai0_2.i((View)ajioTextView2);
            Intrinsics.checkNotNull(ajioTextView3);
            ai0_2.i((View)ajioTextView3);
            if (ajioTextView != null) {
                ai0_2.i((View)ajioTextView);
            }
        } else {
            float f8;
            float f11;
            int n15;
            float f12;
            int n16;
            Intrinsics.checkNotNull(object);
            ai0_2.B((View)object);
            object.setText(charSequence);
            object2 = Boolean.TRUE;
            bl3 = Intrinsics.areEqual(bl2, object2);
            if (bl3 && ajioTextView != null) {
                n16 = Intrinsics.areEqual(object3, object2);
                charSequence2 = ")";
                object4 = "(";
                if (n16 != 0) {
                    n16 = R$string.non_refundable;
                    object3 = hv3_0.K(n16);
                    StringBuilder stringBuilder = new StringBuilder((String)object4);
                    stringBuilder.append((String)object3);
                    stringBuilder.append((String)charSequence2);
                    object3 = stringBuilder.toString();
                    ajioTextView.setText((CharSequence)object3);
                } else {
                    n16 = R$string.refundable;
                    object3 = hv3_0.K(n16);
                    StringBuilder stringBuilder = new StringBuilder((String)object4);
                    stringBuilder.append((String)object3);
                    stringBuilder.append((String)charSequence2);
                    object3 = stringBuilder.toString();
                    ajioTextView.setText((CharSequence)object3);
                }
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append((String)charSequence);
                ((StringBuilder)charSequence2).append((String)object3);
                charSequence = ((StringBuilder)charSequence2).toString();
                object.setContentDescription(charSequence);
            }
            float f14 = 0.0f;
            charSequence = null;
            if (f6 != null) {
                f12 = f6.floatValue();
            } else {
                n16 = 0;
                f12 = 0.0f;
                object3 = null;
            }
            if (f5 != null) {
                f7 = f5.floatValue();
            } else {
                bl3 = false;
                f7 = 0.0f;
                charSequence2 = null;
            }
            n16 = (int)(f12 == f7 ? 0 : (f12 > f7 ? 1 : -1));
            if (n16 > 0 && (n15 = Intrinsics.areEqual(bl2, object2)) != 0) {
                if (ajioTextView3 != null) {
                    if (f6 != null) {
                        f11 = f6.floatValue();
                    } else {
                        n15 = 0;
                        f11 = 0.0f;
                        object2 = null;
                    }
                    object2 = qz2_0.u(f11);
                    ajioTextView3.setText((CharSequence)object2);
                }
                if (ajioTextView3 != null) {
                    n15 = ajioTextView3.getPaintFlags() | 0x10;
                    ajioTextView3.setPaintFlags(n15);
                }
                if (ajioTextView3 != null) {
                    ai0_2.B((View)ajioTextView3);
                }
            }
            if (f5 != null) {
                f11 = f5.floatValue();
            } else {
                n15 = 0;
                f11 = 0.0f;
                object2 = null;
            }
            n15 = (f8 = f11 - 0.0f) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (n15 > 0) {
                if (f5 != null) {
                    f14 = f5.floatValue();
                }
                object2 = qz2_0.u(f14);
                if (ajioTextView4 != null) {
                    ajioTextView4.setText((CharSequence)object2);
                }
                if (ajioTextView4 != null) {
                    object = ((AppCompatTextView)object).getText();
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append((String)object2);
                    ((StringBuilder)charSequence).append(object);
                    object = ((StringBuilder)charSequence).toString();
                    ajioTextView4.setContentDescription((CharSequence)object);
                }
                if (ajioTextView4 != null) {
                    ai0_2.B((View)ajioTextView4);
                }
            } else {
                if (ajioTextView2 != null) {
                    ai0_2.B((View)ajioTextView2);
                }
                if (ajioTextView4 != null) {
                    ai0_2.i((View)ajioTextView4);
                }
            }
        }
    }

    public static final Typeface o(int n3, Context context) {
        return FontsManager.getInstance().getTypefaceWithFont(context, n3);
    }

    public static final void o0(int n3, String string2, String object) {
        int n4 = 1;
        Object[] objectArray = "message";
        Intrinsics.checkNotNullParameter(string2, (String)objectArray);
        if (object == null) {
            object = StringCompanionObject.INSTANCE;
            int n7 = R$string.acc_alert_message;
            object = hv3_0.K(n7);
            objectArray = new Object[n4];
            objectArray[0] = string2;
            String string3 = "format(...)";
            object = xh2_0.a(objectArray, n4, (String)object, string3);
            ig0_0.Companion.getClass();
            AJIOApplication.Companion.getClass();
            AJIOApplication aJIOApplication = AJIOApplication$a.a();
            Integer n8 = n3;
            ig0_0.a((Context)aJIOApplication, string2, n8, (String)object);
        } else {
            ig0_0.Companion.getClass();
            AJIOApplication.Companion.getClass();
            AJIOApplication aJIOApplication = AJIOApplication$a.a();
            Integer n10 = n3;
            ig0_0.a((Context)aJIOApplication, string2, n10, (String)object);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static xs3_0 p(ArrayList var0) {
        block5: {
            block9: {
                block8: {
                    block7: {
                        block6: {
                            Intrinsics.checkNotNullParameter(var0, "permissionList");
                            AJIOApplication.Companion.getClass();
                            var1_1 = AJIOApplication$a.a();
                            var0 = new jo_2((Context)var1_1);
                            var1_1 = new Gson();
                            var2_2 = "";
                            var0 = var0.getPreference("permissions_not_granted", (String)var2_2);
                            var3_3 = new UiUtils$getPermissionListYetToBeGrantedByUser$type$1();
                            var3_3 = var3_3.getType();
                            var0 = (ArrayList)var1_1.fromJson((String)var0, (Type)var3_3);
                            var4_4 = R$string.level_up_your_shopping_experience;
                            var1_1 = hv3_0.K(var4_4);
                            var3_3 = "notification/location/network";
                            if (var0 == null) break block5;
                            var2_2 = "android.permission.ACCESS_FINE_LOCATION";
                            var5_5 = "android.permission.ACCESS_COARSE_LOCATION";
                            var6_6 = "android.permission.READ_PHONE_STATE";
                            var7_7 = "android.permission.POST_NOTIFICATIONS";
                            var8_8 = xx_2.i(new String[]{var2_2, var5_5, var6_6, var7_7});
                            var9_9 = var0.containsAll((Collection<?>)var8_8);
                            if (var9_9) {
                                var10_10 = R$string.mandatory_permission_desc;
                                var0 = hv3_0.K(var10_10);
                                var4_4 = R$string.level_up_your_shopping_experience;
                                var1_1 = hv3_0.K(var4_4);
lbl27:
                                // 6 sources

                                while (true) {
                                    var2_2 = var0;
                                    break block5;
                                    break;
                                }
                            }
                            var9_9 = var0.contains(var2_2);
                            if (!var9_9 && !(var9_9 = var0.contains(var5_5)) || !(var9_9 = var0.contains(var6_6)) || (var9_9 = var0.contains(var7_7))) break block6;
                            var10_11 = R$string.mandatory_location_phone_permission_desc;
                            var0 = hv3_0.K(var10_11);
                            var3_3 = "location/network";
                            ** GOTO lbl27
                        }
                        var9_9 = var0.contains(var2_2);
                        if (!var9_9 && !(var9_9 = var0.contains(var5_5)) || !(var9_9 = var0.contains(var7_7)) || (var9_9 = var0.contains(var6_6))) break block7;
                        var10_12 = R$string.mandatory_location_notification_permission_desc;
                        var0 = hv3_0.K(var10_12);
                        var3_3 = "notification/location";
                        ** GOTO lbl27
                    }
                    var9_9 = var0.contains(var2_2);
                    if (var9_9 || (var9_9 = var0.contains(var5_5)) || !(var9_9 = var0.contains(var7_7)) || !(var9_9 = var0.contains(var6_6))) break block8;
                    var10_13 = R$string.mandatory_phone_notification_permission_desc;
                    var0 = hv3_0.K(var10_13);
                    var3_3 = "notification/network";
                    ** GOTO lbl27
                }
                var11_17 = var0.contains(var2_2);
                var8_8 = "location";
                if (var11_17 || (var11_17 = var0.contains(var5_5))) ** GOTO lbl76
                var11_17 = var0.contains(var6_6);
                if (!var11_17) break block9;
                var10_14 = R$string.mandatory_phone_permission_desc;
                var0 = hv3_0.K(var10_14);
                var3_3 = "phone";
                ** GOTO lbl27
            }
            var10_15 = var0.contains(var7_7);
            if (var10_15 != 0) {
                var10_15 = R$string.mandatory_notification_permission_desc;
                var0 = hv3_0.K(var10_15);
                var4_4 = R$string.never_miss_a_good_deal;
                var1_1 = hv3_0.K(var4_4);
lbl67:
                // 2 sources

                while (true) {
                    var2_2 = var0;
                    var3_3 = var8_8;
                    break;
                }
            } else {
                var10_15 = R$string.mandatory_permission_desc;
                var0 = hv3_0.K(var10_15);
                var4_4 = R$string.level_up_your_shopping_experience;
                var1_1 = hv3_0.K(var4_4);
                ** continue;
lbl76:
                // 1 sources

                var10_16 = R$string.mandatory_location_permission_desc;
                var0 = hv3_0.K(var10_16);
                ** continue;
            }
        }
        var0 = new xs3_0(var1_1, var2_2, var3_3);
        return var0;
    }

    public static final void p0(ShimmerFrameLayout shimmerFrameLayout) {
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.startShimmer();
        }
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.setVisibility(0);
        }
    }

    public static final int q(int n3) {
        return hv3_0.B().getDimensionPixelSize(n3);
    }

    /*
     * WARNING - void declaration
     */
    public static final void q0(ShimmerFrameLayout object, View object2, boolean bl2, ConstraintLayout constraintLayout, View view, View object3, View view2, View view3) {
        if (object != null) {
            ((ShimmerFrameLayout)((Object)object)).startShimmer();
        }
        if (object != null) {
            object.setVisibility(0);
        }
        if (object2 != null) {
            object2.setVisibility(0);
        }
        if (bl2) {
            void var4_7;
            void var7_10;
            void var6_9;
            int n3;
            PorterDuff.Mode mode;
            b b2;
            AJIOApplication.Companion.getClass();
            object2 = AJIOApplication$a.a();
            int n4 = R$color.color_e9ecee;
            int n7 = t70.getColor((Context)object2, n4);
            AJIOApplication aJIOApplication = AJIOApplication$a.a();
            int n8 = R$color.transparent;
            int n10 = t70.getColor((Context)aJIOApplication, n8);
            n8 = 7;
            int n14 = 6;
            if (b2 != null) {
                b2.setBackgroundColor(n7);
                b b3 = new b();
                b3.e((ConstraintLayout)mode);
                int n15 = b2.getId();
                b3.f(n15, n14, 0, n14);
                n3 = b2.getId();
                b3.f(n3, n8, 0, n8);
                b3.b((ConstraintLayout)mode);
            }
            if (var6_9 != null) {
                var6_9.setBackgroundColor(n7);
                b2 = new b();
                b2.e((ConstraintLayout)mode);
                int n16 = var6_9.getId();
                b2.f(n16, n14, 0, n14);
                int n17 = var6_9.getId();
                b2.f(n17, n8, 0, n8);
                b2.b((ConstraintLayout)mode);
            }
            if (var7_10 != null) {
                ai0_2.i((View)var7_10);
            }
            if (var4_7 != null) {
                n3 = og1_1.c();
                if (n3 != 0) {
                    if (object != null) {
                        object.setBackgroundColor(n10);
                    }
                    if (mode != null) {
                        mode.setBackgroundColor(n10);
                    }
                    var4_7.setBackgroundColor(n7);
                } else {
                    object = AJIOApplication$a.a();
                    int n18 = R$drawable.rounded_rect_product_shimmer;
                    object = t70.getDrawable((Context)object, n18);
                    mode = PorterDuff.Mode.SRC_IN;
                    aJIOApplication = new PorterDuffColorFilter(n7, mode);
                    if (object != null) {
                        object.setColorFilter((ColorFilter)aJIOApplication);
                        var4_7.setBackground((Drawable)object);
                    }
                }
            }
        }
    }

    public static final Drawable r(int n3) {
        AJIOApplication.Companion.getClass();
        return t70.getDrawable((Context)AJIOApplication$a.a(), n3);
    }

    public static /* synthetic */ void r0(ShimmerFrameLayout shimmerFrameLayout, View view) {
        hv3_0.q0(shimmerFrameLayout, view, false, null, null, null, null, null);
    }

    public static boolean s() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("enable_new_signup_flow");
    }

    public static final void s0(ShimmerFrameLayout shimmerFrameLayout) {
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.stopShimmer();
        }
        if (shimmerFrameLayout != null) {
            int n3 = 8;
            shimmerFrameLayout.setVisibility(n3);
        }
    }

    public static String t() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = "cartExchangeReturnPolicy";
        object = ((ao0_0)object).b((String)object2);
        int n3 = ((String)object).length();
        String string2 = null;
        if (n3 == 0) {
            object = null;
        } else {
            object2 = CartExchangeReturnPolicy.class;
            object = (CartExchangeReturnPolicy)JsonUtils.fromJson((String)object, (Class)object2);
        }
        if (object != null) {
            string2 = ((CartExchangeReturnPolicy)object).getReturnPolicyLinkUrl();
        }
        return string2;
    }

    public static final void t0(ShimmerFrameLayout shimmerFrameLayout, View view) {
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.stopShimmer();
        }
        int n3 = 8;
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.setVisibility(n3);
        }
        if (view != null) {
            view.setVisibility(n3);
        }
    }

    public static final String u(String object) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return "";
        }
        Pattern pattern = Pattern.compile("[_\\s]");
        Intrinsics.checkNotNullExpressionValue(pattern, "compile(...)");
        Intrinsics.checkNotNull(object);
        object = kotlin.text.b.q((CharSequence)object, pattern);
        bl2 = false;
        pattern = null;
        String[] stringArray = new String[]{};
        object = object.toArray(stringArray);
        int n3 = ((String[])object).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            String string2 = object[i3];
            int n7 = string2.length();
            if (n7 <= (n4 = 1)) continue;
            string2 = ((String)object[i3]).substring(0, n4);
            String string3 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            string2 = string2.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(string2, "toUpperCase(...)");
            Object object2 = object[i3];
            String string4 = ((String)object2).substring(n4);
            Intrinsics.checkNotNullExpressionValue(string4, string3);
            string4 = string4.toLowerCase();
            string3 = "toLowerCase(...)";
            Intrinsics.checkNotNullExpressionValue(string4, string3);
            string2 = Ft2.a(string2, string4);
            object[i3] = string2;
        }
        object = TextUtils.join((CharSequence)" ", (Object[])object);
        Intrinsics.checkNotNullExpressionValue(object, "join(...)");
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String v(float f5) {
        Object object;
        String[] stringArray;
        CharSequence charSequence = "0";
        Object object2 = ".00";
        try {
            stringArray = "#,###,###.##";
            object = new DecimalFormat((String)stringArray);
        }
        catch (Exception exception) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(f5);
            return ((StringBuilder)charSequence).toString();
        }
        double d2 = f5;
        {
            object = ((NumberFormat)object).format(d2);
            if (object == null) {
                return "";
            }
            stringArray = ".";
            int n3 = 0;
            int n4 = StringsKt.F((CharSequence)object, (CharSequence)stringArray, false);
            if (n4 == 0) {
                object = ((String)object).concat((String)object2);
            }
            stringArray = "\\.";
            object2 = new Regex((String)stringArray);
            object2 = ((Regex)object2).e((CharSequence)object);
            object2 = (Collection)object2;
            stringArray = new String[]{};
            object2 = object2.toArray(stringArray);
            n4 = ((String[])object2).length;
            n3 = 1;
            if (n4 <= n3) return object;
            int n7 = ((String)(object2 = object2[n3])).length();
            if (n7 != n3) return object;
            return ((String)object).concat((String)charSequence);
        }
    }

    public static final int w(int n3) {
        return hv3_0.B().getInteger(n3);
    }

    public static final float x(float f5) {
        float f6 = hv3_0.C().getDisplayMetrics().density;
        return f5 * f6;
    }

    public static boolean y(boolean bl2) {
        boolean bl3 = bl2 ? h40_0.a.I1() : h40_0.a.D1();
        bl2 = hv3_0.N(bl2);
        bl2 = bl2 && bl3;
        return bl2;
    }

    public static String z(Product object, ProductFnlColorVariantData productFnlColorVariantData) {
        int n3;
        boolean bl2 = h40_0.a.W0();
        String string2 = null;
        if (bl2 && (n3 = hv3_0.V((Product)object)) != 0) {
            if (productFnlColorVariantData != null) {
                string2 = productFnlColorVariantData.getProductTag();
            }
            return string2;
        }
        if (productFnlColorVariantData == null) {
            return null;
        }
        object = productFnlColorVariantData.getExclusiveTill();
        if (object != null) {
            string2 = "Exclusive";
        } else {
            object = productFnlColorVariantData.getProductTag();
            if (object != null && (n3 = ((String)object).length()) != 0) {
                string2 = productFnlColorVariantData.getProductTag();
            }
        }
        return string2;
    }
}

