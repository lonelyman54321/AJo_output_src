/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityOptions
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.BitmapFactory
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.webkit.URLUtil
 */
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsIntent$e;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.customviews.widgets.managers.ActivityTransitionManager;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.home.AjioHomeActivity$a;
import com.ril.ajio.login.activity.LoginActivityRevamp;
import com.ril.ajio.login.activity.LoginActivityRevampNew;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AT2
 */
public final class at2_1 {
    public static final hh3_2 a;

    static {
        zt2_2 zt2_22 = new Object();
        a = yr1_2.b(zt2_22);
    }

    public static void a(String string2) {
        int n3 = 1;
        Bundle bundle = dk0.a(n3, "Step_Number");
        if (string2 != null) {
            String string3 = "login_source";
            bundle.putString(string3, string2);
        }
        vb0_0.a(AnalyticsManager.Companion, "mobile - login/signup screen", bundle);
    }

    public static final q22_0 b(String object, String string2) {
        int n3;
        String string3 = "storeId";
        Intrinsics.checkNotNullParameter(object, string3);
        String string4 = "plpTheme";
        Intrinsics.checkNotNullParameter(string2, string4);
        Object object2 = q22_0.Companion;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, string3);
        Intrinsics.checkNotNullParameter(string2, string4);
        boolean bl2 = og1_1.e(string2);
        if (bl2) {
            object = new bG1();
            n3 = 101;
        } else {
            int n4;
            String string5;
            string3 = od3_2.a;
            int n7 = string3.length();
            if (n7 == 0) {
                string3 = od3_2.a();
            }
            if ((n7 = (int)(s20.a ? 1 : 0)) == 0 && (n7 = (int)(Intrinsics.areEqual(string4 = od3_2.a(), string5 = ((ld3_2)((Object)(object2 = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) == 0 && !(bl2 = Intrinsics.areEqual(string3, string4 = ((ld3_2)((Object)object2)).getStoreId())) && (n4 = (int)(Intrinsics.areEqual(object, string3 = ((ld3_2)((Object)object2)).getStoreId()) ? 1 : 0)) == 0 && (n4 = (int)(Intrinsics.areEqual(string2, object = ((ld3_2)((Object)object2)).getStoreId()) ? 1 : 0)) == 0) {
                n4 = 100;
                n3 = 100;
            } else {
                n4 = 103;
                n3 = 103;
            }
            object = new ia_0();
        }
        string3 = new Bundle();
        string3.putInt("PLP_TYPE", n3);
        ((Fragment)object).setArguments((Bundle)string3);
        return object;
    }

    public static boolean c() {
        return (Boolean)a.getValue();
    }

    public static final void d(Context context) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(context, string2);
        Intrinsics.checkNotNullParameter(context, string2);
        AjioHomeActivity.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, string2);
        string2 = new Intent(context, AjioHomeActivity.class);
        context.startActivity((Intent)string2);
    }

    public static final void e(Context context) {
        if (context != null) {
            AjioHomeActivity$a ajioHomeActivity$a = AjioHomeActivity.Companion;
            ajioHomeActivity$a.getClass();
            AjioHomeActivity$a.a(context);
        }
    }

    public static final void f(Context context, Bundle bundle) {
        Object object = "bundle";
        Intrinsics.checkNotNullParameter(bundle, (String)object);
        if (context != null) {
            object = AjioHomeActivity.Companion;
            object.getClass();
            AjioHomeActivity$a.b(context, bundle);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void g(int n3, Activity activity, String object, String object2) {
        Object object3;
        String string2 = "activity";
        Intrinsics.checkNotNullParameter(activity, string2);
        Class<LoginActivityRevamp> clazz = "message";
        Intrinsics.checkNotNullParameter(object, (String)((Object)clazz));
        String string3 = "source";
        Intrinsics.checkNotNullParameter(object2, string3);
        at2_1.a((String)object2);
        boolean bl2 = at2_1.c();
        String string4 = "resetpasswordmessage";
        String string5 = "PAGE";
        int n4 = 1002;
        String string6 = "SOURCE";
        if (!bl2) {
            object3 = h40_0.a;
            bl2 = h40_0.u2();
            if (!bl2) {
                object3 = LoginActivityRevamp.Companion;
                object3.getClass();
                Intrinsics.checkNotNullParameter(activity, string2);
                Intrinsics.checkNotNullParameter(object, (String)((Object)clazz));
                Intrinsics.checkNotNullParameter(object2, string3);
                clazz = LoginActivityRevamp.class;
                string2 = new Intent((Context)activity, clazz);
                string2.putExtra(string5, 0);
                boolean bl3 = TextUtils.isEmpty((CharSequence)object);
                if (!bl3) {
                    string2.putExtra(string4, (String)object);
                }
                string2.putExtra(string6, (String)object2);
                object = g62_0.c;
                object2 = Boolean.TRUE;
                ((g62_0)object).b(object2, n4);
                activity.startActivityForResult((Intent)string2, n3);
                ActivityTransitionManager activityTransitionManager = ActivityTransitionManager.getInstance();
                activityTransitionManager.slideUpAndStay(activity);
                return;
            }
        }
        object3 = LoginActivityRevampNew.Companion;
        object3.getClass();
        Intrinsics.checkNotNullParameter(activity, string2);
        Intrinsics.checkNotNullParameter(object, (String)((Object)clazz));
        Intrinsics.checkNotNullParameter(object2, string3);
        Intrinsics.checkNotNullParameter(object2, "value");
        LoginActivityRevampNew.N0 = object2;
        clazz = LoginActivityRevampNew.class;
        string2 = new Intent((Context)activity, clazz);
        string2.putExtra(string5, 0);
        boolean bl4 = TextUtils.isEmpty((CharSequence)object);
        if (!bl4) {
            string2.putExtra(string4, (String)object);
        }
        string2.putExtra(string6, (String)object2);
        object = g62_0.c;
        object2 = Boolean.TRUE;
        ((g62_0)object).b(object2, n4);
        activity.startActivityForResult((Intent)string2, n3);
        ActivityTransitionManager activityTransitionManager = ActivityTransitionManager.getInstance();
        activityTransitionManager.slideUpAndStay(activity);
    }

    public static final void h(Activity activity, String string2, int n3) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(string2, "source");
        at2_1.g(n3, activity, "", string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void i(Activity activity, String object, String object2) {
        Object object3;
        String string2 = "activity";
        Intrinsics.checkNotNullParameter(activity, string2);
        Class<LoginActivityRevamp> clazz = "gameUrl";
        Intrinsics.checkNotNullParameter(object, (String)((Object)clazz));
        String string3 = "source";
        Intrinsics.checkNotNullParameter(object2, string3);
        at2_1.a((String)object2);
        boolean bl2 = at2_1.c();
        String string4 = "resetpasswordmessage";
        String string5 = "PAGE";
        int n3 = 6;
        int n4 = 1002;
        String string6 = "SOURCE";
        String string7 = "GAME_URL";
        String string8 = "";
        if (!bl2) {
            object3 = h40_0.a;
            bl2 = h40_0.u2();
            if (!bl2) {
                object3 = LoginActivityRevamp.Companion;
                object3.getClass();
                Intrinsics.checkNotNullParameter(activity, string2);
                Intrinsics.checkNotNullParameter(object, (String)((Object)clazz));
                Intrinsics.checkNotNullParameter(object2, string3);
                clazz = LoginActivityRevamp.class;
                string2 = new Intent((Context)activity, clazz);
                string2.putExtra(string5, 0);
                boolean bl3 = TextUtils.isEmpty((CharSequence)string8);
                if (!bl3) {
                    string2.putExtra(string4, string8);
                }
                string2.putExtra(string7, (String)object);
                string2.putExtra(string6, (String)object2);
                object = g62_0.c;
                object2 = Boolean.TRUE;
                ((g62_0)object).b(object2, n4);
                activity.startActivityForResult((Intent)string2, n3);
                object = ActivityTransitionManager.getInstance();
                ((ActivityTransitionManager)object).slideUpAndStay(activity);
                return;
            }
        }
        object3 = LoginActivityRevampNew.Companion;
        object3.getClass();
        Intrinsics.checkNotNullParameter(activity, string2);
        Intrinsics.checkNotNullParameter(object, (String)((Object)clazz));
        Intrinsics.checkNotNullParameter(object2, string3);
        clazz = LoginActivityRevampNew.class;
        string2 = new Intent((Context)activity, (Class)clazz);
        string2.putExtra(string5, 0);
        boolean bl4 = TextUtils.isEmpty((CharSequence)string8);
        if (!bl4) {
            string2.putExtra(string4, string8);
        }
        string2.putExtra(string7, (String)object);
        string2.putExtra(string6, (String)object2);
        object = g62_0.c;
        object2 = Boolean.TRUE;
        ((g62_0)object).b(object2, n4);
        activity.startActivityForResult((Intent)string2, n3);
        object = ActivityTransitionManager.getInstance();
        ((ActivityTransitionManager)object).slideUpAndStay(activity);
    }

    public static final void j(Context context, String string2) {
        ActivityOptions activityOptions;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(string2, "linkUrl");
        cp_1.Companion.getClass();
        Object object = cp$a.e();
        Object object2 = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(object2, "getPackageName(...)");
        object.getClass();
        cp_1.Q(context, (String)object2);
        object = new CustomTabsIntent$e();
        int n3 = R$color.colorPrimary;
        ((CustomTabsIntent$e)object).b.a = object2 = Integer.valueOf(t70.getColor(context, n3) | 0xFF000000);
        object2 = ((CustomTabsIntent$e)object).a;
        object2.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        Object object3 = context.getResources();
        int n4 = R$drawable.ic_arrow_back;
        object3 = BitmapFactory.decodeResource((Resources)object3, (int)n4);
        object2.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", (Parcelable)object3);
        int n7 = 17432578;
        n4 = 17432579;
        ((CustomTabsIntent$e)object).c = activityOptions = ActivityOptions.makeCustomAnimation((Context)context, (int)n7, (int)n4);
        object3 = ActivityOptions.makeCustomAnimation((Context)context, (int)n4, (int)n7).toBundle();
        object2.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", (Bundle)object3);
        object = ((CustomTabsIntent$e)object).a();
        Intrinsics.checkNotNullExpressionValue(object, "build(...)");
        object2 = xf0_2.Companion;
        object3 = ((CustomTabsIntent)object).intent;
        String string3 = "intent";
        Intrinsics.checkNotNullExpressionValue(object3, string3);
        object2.getClass();
        xf0$a_0.a(context, (Intent)object3);
        n3 = (int)(URLUtil.isValidUrl((String)string2) ? 1 : 0);
        if (n3 == 0) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = -1;
        }
        string2 = Uri.parse((String)string2);
        Intrinsics.checkNotNullExpressionValue(string2, "parse(...)");
        object3 = new Object();
        xf0$a_0.b(context, (CustomTabsIntent)object, (Uri)string2, n3, (Xf0$b)object3);
    }

    public static final void k(Context context, int n3, String string2) {
        ActivityOptions activityOptions;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(string2, "linkUrl");
        Object object = new CustomTabsIntent$e();
        int n4 = R$color.colorPrimary;
        Object object2 = t70.getColor(context, n4) | 0xFF000000;
        ((CustomTabsIntent$e)object).b.a = object2;
        object2 = ((CustomTabsIntent$e)object).a;
        object2.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        Resources resources = context.getResources();
        int n7 = R$drawable.ic_arrow_back;
        resources = BitmapFactory.decodeResource((Resources)resources, (int)n7);
        object2.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", (Parcelable)resources);
        int n8 = 17432578;
        n7 = 17432579;
        ((CustomTabsIntent$e)object).c = activityOptions = ActivityOptions.makeCustomAnimation((Context)context, (int)n8, (int)n7);
        resources = ActivityOptions.makeCustomAnimation((Context)context, (int)n7, (int)n8).toBundle();
        object2.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", (Bundle)resources);
        object = ((CustomTabsIntent$e)object).a();
        Intrinsics.checkNotNullExpressionValue(object, "build(...)");
        object2 = xf0_2.Companion;
        resources = ((CustomTabsIntent)object).intent;
        Intrinsics.checkNotNullExpressionValue(resources, "intent");
        object2.getClass();
        xf0$a_0.a(context, (Intent)resources);
        string2 = Uri.parse((String)string2);
        Intrinsics.checkNotNullExpressionValue(string2, "parse(...)");
        object2 = new Object();
        xf0$a_0.b(context, (CustomTabsIntent)object, (Uri)string2, n3, (Xf0$b)object2);
    }
}

