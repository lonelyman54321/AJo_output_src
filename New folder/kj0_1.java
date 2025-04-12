/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.webkit.URLUtil
 *  org.json.JSONArray
 */
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.ClevertapGAUtils;
import com.ril.ajio.bonanza.activity.CouponBonanzaActivity;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.launch.activity.SplashScreenActivity;
import com.ril.ajio.login.activity.ResetPasswordActivity;
import com.ril.ajio.payment.activity.OrderConfirmationActivity;
import com.ril.ajio.payment.activity.TermsAndConditionActivity;
import com.ril.ajio.plp.PLPExtras;
import com.ril.ajio.services.data.Order.ExternalConstants;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.view.BaseActivity;
import com.ril.ajio.view.BaseSplitActivity;
import com.ril.ajio.web.CustomWebViewActivity;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;

/*
 * Renamed from kj0
 */
public final class kj0_1 {
    public static kj0_1 c;
    public Bundle a;
    public Bundle b;

    /*
     * Enabled aggressive block sorting
     */
    public static void a(Activity activity, String object) {
        ld3_2 ld3_22;
        String string2;
        int n3 = activity instanceof AjioHomeActivity;
        if (n3 == 0) return;
        if (object == null) return;
        String string3 = ((String)object).toLowerCase();
        String string4 = "luxe".toLowerCase();
        n3 = string3.contains(string4);
        string4 = null;
        boolean bl2 = true;
        if (n3 != 0 && (n3 = og1_1.f()) != 0) {
            og1_1.g(bl2, false);
            activity = (AjioHomeActivity)activity;
            activity.c(false);
            return;
        }
        boolean bl3 = ((String)(object = ((String)object).toLowerCase())).contains(string3 = "ajiogram".toLowerCase());
        if (bl3) {
            object = h40_0.a;
            bl3 = h40_0.b1();
            if (bl3) {
                og1_1.g(false, false);
                s20.a = bl2;
                activity = (AjioHomeActivity)activity;
                activity.getClass();
                og1_1.g(false, false);
                og1_1.g(false, bl2);
                return;
            }
        }
        og1_1.g(false, false);
        object = od3_2.a;
        n3 = ((String)object).length();
        if (n3 == 0) {
            object = od3_2.a();
        }
        if ((n3 = (int)(s20.a ? 1 : 0)) == 0 && (n3 = (int)(Intrinsics.areEqual(string3 = od3_2.a(), string2 = (ld3_22 = ld3_2.STORE_AJIOGRAM).getStoreId()) ? 1 : 0)) == 0 && !(bl3 = Intrinsics.areEqual(object, string3 = ld3_22.getStoreId()))) {
            activity = (AjioHomeActivity)activity;
            activity.f(false);
            return;
        }
        activity = (AjioHomeActivity)activity;
        activity.p3();
    }

    public static void b(Bundle bundle, String string2) {
        boolean bl2;
        boolean bl3;
        String string3 = bj0_1.d(string2, "feedLogic");
        String string4 = bj0_1.d(string2, "widgetLevel");
        String string5 = bj0_1.d(string2, "heading");
        String string6 = bj0_1.d(string2, "showDefaultIfNoData");
        String string7 = "widgetItemFilters";
        string2 = bj0_1.d(string2, string7);
        if (string3 != null && !(bl3 = string3.isEmpty())) {
            string7 = "widgetID";
            bundle.putString(string7, string3);
        }
        if (string4 != null && !(bl2 = string4.isEmpty())) {
            string3 = "widgetType";
            bundle.putString(string3, string4);
        }
        if (string5 != null && !(bl2 = string5.isEmpty())) {
            string3 = "widgetName";
            bundle.putString(string3, string5);
        }
        if (string6 != null && !(bl2 = string6.isEmpty())) {
            string3 = "true";
            bl2 = string6.equalsIgnoreCase(string3);
            string4 = "showDefaultWidget";
            bundle.putBoolean(string4, bl2);
        }
        if (string2 != null && !(bl2 = string2.isEmpty())) {
            string3 = "widgetFilters";
            bundle.putString(string3, string2);
        }
        bundle.putBoolean("showViewAllWidget", true);
    }

    public static boolean c(Activity activity, String string2) {
        String string3;
        boolean bl2;
        boolean bl3 = activity instanceof SplashScreenActivity;
        boolean bl4 = true;
        if (!bl3 && string2 != null && (bl2 = (string2 = string2.toLowerCase()).contains(string3 = "luxe".toLowerCase()))) {
            bl2 = og1_1.f();
            bl3 = false;
            string3 = null;
            if (bl2) {
                bl2 = activity instanceof AjioHomeActivity;
                if (bl2) {
                    activity = (AjioHomeActivity)activity;
                    activity.c(false);
                } else {
                    og1_1.g(bl4, false);
                }
            } else {
                bl2 = activity instanceof AjioHomeActivity;
                if (bl2) {
                    activity = (AjioHomeActivity)activity;
                    activity.f(false);
                } else {
                    og1_1.g(false, false);
                }
            }
            return og1_1.f();
        }
        return bl4;
    }

    public static boolean e(String string2, ArrayList object) {
        String string3 = string2.trim();
        boolean bl2 = string3.isEmpty();
        if (bl2) {
            return false;
        }
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            string3 = (String)object.next();
            bl2 = string2.contains(string3);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public static String f(String string2) {
        String string3 = "?";
        boolean bl2 = string2.contains(string3);
        if (bl2) {
            string3 = "&";
            string2 = string2.concat(string3);
        } else {
            string2 = string2.concat(string3);
        }
        return Ft2.a(string2, "uiel=Mobile&site=rilfnl&isAppsFlag=true");
    }

    public static kj0_1 g() {
        kj0_1 kj0_12 = c;
        if (kj0_12 == null) {
            kj0_12 = new Object();
            kj0_12.a = null;
            c = kj0_12;
        }
        return c;
    }

    public static String h(String string2) {
        String[] stringArray = "/shop/";
        int n3 = string2.contains((CharSequence)stringArray);
        if (n3 != 0) {
            String string3;
            boolean bl2 = (stringArray = string2.replace((CharSequence)stringArray, "")).contains(string3 = "-");
            if (bl2) {
                n3 = (stringArray = stringArray.split(string3)).length;
                if (n3 > 0) {
                    string2 = stringArray[0];
                }
            } else {
                string2 = stringArray;
            }
        }
        return string2;
    }

    public static String i(String string2) {
        String string3;
        block6: {
            boolean bl2;
            String string4 = "utm_source";
            string3 = "";
            if (string2 != null && !(bl2 = string2.isEmpty())) {
                Set set;
                string2 = Uri.parse((String)string2);
                try {
                    set = string2.getQueryParameterNames();
                    if (set == null) break block6;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {}
                boolean bl3 = set.isEmpty();
                if (bl3) break block6;
                bl2 = set.contains(string4);
                if (!bl2) break block6;
                return string2.getQueryParameter(string4);
            }
        }
        return string3;
    }

    public static boolean j(Context object, String string2) {
        z40_0.Companion.getClass();
        object = z40$a.a((Context)object).a.b("supported_stores");
        JSONArray jSONArray = new ArrayList();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        boolean bl3 = false;
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            int n3;
            try {
                jSONArray = new JSONArray((String)object);
                n3 = 0;
                object = null;
            }
            catch (Exception exception) {
                yn3_0.a(exception);
            }
            while (true) {
                int n4 = jSONArray.length();
                if (n3 >= n4) break;
                Object object2 = jSONArray.get(n3);
                object2 = object2.toString();
                n4 = (int)(string2.equalsIgnoreCase((String)object2) ? 1 : 0);
                if (n4 != 0) {
                    bl3 = true;
                    break;
                }
                ++n3;
                continue;
                break;
            }
            return bl3;
        }
        return false;
    }

    public static void k(OrderConfirmationActivity orderConfirmationActivity, String string2) {
        if (orderConfirmationActivity == null) {
            return;
        }
        string2 = E1.a("THANK_YOU_TO_MISC_DEEPLINK_URL", string2);
        Intent intent = new Intent((Context)orderConfirmationActivity, AjioHomeActivity.class);
        intent.putExtras((Bundle)string2);
        orderConfirmationActivity.startActivity(intent);
        orderConfirmationActivity.finish();
    }

    public static void m(Activity object, String object2, String object3, String string2, String object4, String object5, String string3) {
        Object object6 = object;
        Object object7 = object2;
        String string4 = object3;
        Object object8 = string3;
        boolean bl2 = object instanceof BaseActivity;
        if (!bl2) {
            return;
        }
        bl2 = kj0_1.c(object, (String)object3);
        if (!bl2) {
            return;
        }
        kj0_1.a(object, (String)object3);
        Object object9 = object;
        object9 = (BaseActivity)object;
        boolean bl3 = false;
        Object object10 = null;
        ((BaseActivity)object9).v0 = false;
        bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)object3))) {
            object9 = "newin";
            bl2 = ((String)object9).equalsIgnoreCase((String)object2);
            if (!bl2 && !(bl2 = ((String)(object9 = "capsulenewinpage")).equalsIgnoreCase((String)object2))) {
                object9 = "capsulelandingpage";
                bl2 = ((String)object9).equalsIgnoreCase((String)object2);
                if (bl2) {
                    at2_1.d((Context)object);
                } else {
                    object9 = "productListPage";
                    bl2 = ((String)object9).equalsIgnoreCase((String)object2);
                    Object object11 = "";
                    Object object12 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
                    if (bl2) {
                        object8 = object.getApplication();
                        object7 = new jo_2((Context)object8);
                        ((jo_2)object7).u();
                        ((jo_2)object7).w();
                        ((jo_2)object7).v();
                        boolean bl4 = object instanceof AjioHomeActivity;
                        if (bl4) {
                            object7 = object9;
                            int n3 = 3;
                            boolean bl5 = false;
                            bl3 = false;
                            Object var20_24 = null;
                            int n4 = -59;
                            Object object13 = object9;
                            object9 = string2;
                            String string5 = object12;
                            object12 = object4;
                            String string6 = object11;
                            object11 = object5;
                            object7 = new PLPExtras(null, string2, null, (String)object4, (String)object5, (String)object3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, n4, n3);
                            object9 = string5;
                            Intrinsics.checkNotNull(object, string5);
                            object7 = object;
                            object7 = (AjioHomeActivity)object;
                            object8 = ((AjioHomeActivity)object7).Q2().a;
                            object10 = object13;
                            ((LiveData)object8).k(object13);
                            object11 = ((PLPExtras)object13).e;
                            if (object11 == null) {
                                object11 = string6;
                            }
                            object8 = ((PLPExtras)object10).H;
                            object8 = at2_1.b((String)object11, (String)object8);
                            Intrinsics.checkNotNull(object6, (String)object9);
                            object9 = ((AjioHomeActivity)object7).T0;
                            object12 = Boolean.FALSE;
                            bl3 = true;
                            object6 = object7;
                            object7 = object9;
                            bl2 = bl3;
                            object10 = object3;
                            ((AjioHomeActivity)object6).Q1((Fragment)object9, (Fragment)object8, bl3, (String)object3, (Boolean)object12);
                        }
                    } else {
                        object9 = object12;
                        String string7 = object11;
                        object12 = "productdetailspage";
                        boolean bl6 = ((String)object12).equalsIgnoreCase((String)object2);
                        if (bl6) {
                            object10 = kj0_1.i((String)object3);
                            object7 = new zj0_0((Activity)object);
                            bl2 = false;
                            object9 = null;
                            object12 = "";
                            object6 = object7;
                            object7 = object3;
                            object8 = object5;
                            ((di2_2)object6).b((String)object3, (String)object5, null, (String)object10, (String)object12);
                        } else {
                            object12 = "landingpage";
                            bl6 = ((String)object12).equalsIgnoreCase((String)object2);
                            boolean bl7 = false;
                            object11 = null;
                            if (bl6) {
                                Intrinsics.checkNotNullParameter(object, "activity");
                                object8 = object.getApplication();
                                object7 = new jo_2((Context)object8);
                                boolean bl8 = object instanceof AjioHomeActivity;
                                if (bl8) {
                                    Intrinsics.checkNotNull(object, (String)object9);
                                    object6 = (AjioHomeActivity)object;
                                    object7 = AjioHomeActivity.Companion;
                                    object12 = object3;
                                    bl8 = ((AjioHomeActivity)object6).V2((String)object3, false);
                                    if (bl8) {
                                        og1_1.g(false, false);
                                        q9_0.Companion.getClass();
                                        object8 = q9$a.b(null, (String)object3);
                                        object7 = ((AjioHomeActivity)object6).T0;
                                        object11 = Boolean.FALSE;
                                        bl2 = true;
                                        object10 = object3;
                                        object12 = object11;
                                        ((AjioHomeActivity)object6).Q1((Fragment)object7, (Fragment)object8, bl2, (String)object3, (Boolean)object11);
                                    }
                                }
                            } else {
                                object12 = object3;
                                string4 = "staticpage";
                                boolean bl9 = string4.equalsIgnoreCase((String)object2);
                                if (bl9) {
                                    object7 = "/gamezone/";
                                    boolean bl10 = ((String)object3).contains((CharSequence)object7);
                                    object9 = "enable_gamezone";
                                    if (bl10) {
                                        z40_0.Companion.getClass();
                                        object7 = z40$a.a((Context)object).a;
                                        bl10 = ((ao0_0)object7).a((String)object9);
                                        object9 = new zj0_0((Activity)object);
                                        ((ny0_1)object9).b((String)object3, string3, bl10);
                                    } else {
                                        object7 = "/couponbonanza";
                                        bl10 = ((String)object3).contains((CharSequence)object7);
                                        if (bl10) {
                                            if (object != null) {
                                                object7 = at2_1.a;
                                                AJIOApplication.Companion.getClass();
                                                object8 = AJIOApplication$a.a();
                                                object9 = CouponBonanzaActivity.class;
                                                object7 = new Intent((Context)object8, (Class)object9);
                                                object.startActivity((Intent)object7);
                                            }
                                        } else {
                                            object7 = "update-your-app";
                                            bl10 = ((String)object3).contains((CharSequence)object7);
                                            if (bl10) {
                                                object8 = object.getApplication();
                                                object7 = new jo_2((Context)object8);
                                                bl10 = object instanceof AjioHomeActivity;
                                                if (bl10) {
                                                    object6 = (AjioHomeActivity)object;
                                                    object7 = new jc0_0();
                                                    object8 = ((AjioHomeActivity)object6).T0;
                                                    object9 = Boolean.FALSE;
                                                    bl3 = true;
                                                    object12 = "COUPONSCREEN";
                                                    object = object6;
                                                    object2 = object8;
                                                    object3 = object7;
                                                    object4 = object12;
                                                    object5 = object9;
                                                    ((AjioHomeActivity)object6).Q1((Fragment)object8, (Fragment)object7, bl3, (String)object12, (Boolean)object9);
                                                } else {
                                                    bl10 = object instanceof OrderConfirmationActivity;
                                                    if (bl10) {
                                                        object7 = kj0_1.g();
                                                        object6 = (OrderConfirmationActivity)object;
                                                        object7.getClass();
                                                        object7 = string7;
                                                        kj0_1.k((OrderConfirmationActivity)object6, string7);
                                                    } else {
                                                        object6 = new Object[]{};
                                                        object7 = yn3_0.a;
                                                        object8 = "Coupon Promotion Link Failed";
                                                        ((yn3$a)object7).k((String)object8, (Object[])object6);
                                                    }
                                                }
                                            } else {
                                                String string8;
                                                object7 = string7;
                                                string4 = ((String)object3).toLowerCase();
                                                bl9 = string4.contains(string8 = "/login");
                                                if (bl9) {
                                                    object7 = new kz1_1((Activity)object);
                                                    ((kz1_1)object7).b(null);
                                                } else {
                                                    object11 = "/games";
                                                    bl7 = ((String)object3).contains((CharSequence)object11);
                                                    if (bl7) {
                                                        z40_0.Companion.getClass();
                                                        object7 = z40$a.a((Context)object).a;
                                                        bl10 = ((ao0_0)object7).a("enable_gamification");
                                                        object8 = new iy0_2((Activity)object);
                                                        ((iy0_2)object8).b((String)object3, bl10);
                                                    } else {
                                                        object11 = "/gamezone";
                                                        bl7 = ((String)object3).contains((CharSequence)object11);
                                                        if (bl7) {
                                                            z40_0.Companion.getClass();
                                                            object7 = z40$a.a((Context)object).a;
                                                            bl10 = ((ao0_0)object7).a((String)object9);
                                                            object9 = new zj0_0((Activity)object);
                                                            ((ny0_1)object9).b((String)object3, string3, bl10);
                                                        } else {
                                                            object8 = "/top-shopper";
                                                            boolean bl11 = ((String)object3).contains((CharSequence)object8);
                                                            if (bl11) {
                                                                bl10 = object instanceof SplashScreenActivity;
                                                                if (!bl10) {
                                                                    object7 = new Io3((Activity)object);
                                                                    ((Io3)object7).b((String)object3);
                                                                }
                                                            } else {
                                                                object8 = "/refer-and-earn";
                                                                bl11 = ((String)object3).contains((CharSequence)object8);
                                                                if (bl11) {
                                                                    object8 = new kg2_0((Activity)object);
                                                                    ((kg2_0)object8).b(string7);
                                                                } else {
                                                                    object7 = "/my-account";
                                                                    bl10 = ((String)object3).contains((CharSequence)object7);
                                                                    if (bl10) {
                                                                        object8 = object.getApplication();
                                                                        object7 = new jo_2((Context)object8);
                                                                        bl10 = object instanceof AjioHomeActivity;
                                                                        if (bl10) {
                                                                            object6 = (AjioHomeActivity)object;
                                                                            bz1_2.Companion.getClass();
                                                                            object7 = BZ1$a.a(false);
                                                                            object8 = ((AjioHomeActivity)object6).T0;
                                                                            object9 = Boolean.FALSE;
                                                                            bl3 = true;
                                                                            object12 = "BZ1";
                                                                            object = object6;
                                                                            object2 = object8;
                                                                            object3 = object7;
                                                                            object4 = object12;
                                                                            object5 = object9;
                                                                            ((AjioHomeActivity)object6).Q1((Fragment)object8, (Fragment)object7, bl3, (String)object12, (Boolean)object9);
                                                                        } else {
                                                                            object6 = new Object[]{};
                                                                            object7 = yn3_0.a;
                                                                            object8 = "MyAccount Link Failed";
                                                                            ((yn3$a)object7).k((String)object8, (Object[])object6);
                                                                        }
                                                                    } else {
                                                                        CustomWebViewActivity.H2((Context)object, 0, (String)object3);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    object8 = "storelandingpage";
                                    boolean bl12 = ((String)object8).equalsIgnoreCase((String)object2);
                                    if (bl12) {
                                        object7 = "/shop/luxe";
                                        bl12 = ((String)object3).startsWith((String)object7);
                                        if (!bl12 && !(bl12 = ((String)object3).startsWith((String)(object7 = "/luxe")))) {
                                            object8 = object.getApplication();
                                            object7 = new jo_2((Context)object8);
                                            bl12 = object instanceof AjioHomeActivity;
                                            if (bl12) {
                                                object6 = (AjioHomeActivity)object;
                                                ed3_2.Companion.getClass();
                                                object8 = ed3$a.a(null, (String)object3);
                                                object7 = ((AjioHomeActivity)object6).T0;
                                                object11 = Boolean.FALSE;
                                                bl2 = true;
                                                object10 = object3;
                                                object12 = object11;
                                                ((AjioHomeActivity)object6).Q1((Fragment)object7, (Fragment)object8, bl2, (String)object3, (Boolean)object11);
                                            } else {
                                                object6 = new Object[]{};
                                                object7 = yn3_0.a;
                                                object8 = "Not a BaseActivity";
                                                ((yn3$a)object7).k((String)object8, (Object[])object6);
                                            }
                                        } else {
                                            object8 = object.getApplication();
                                            object7 = new jo_2((Context)object8);
                                            bl12 = object6 instanceof AjioHomeActivity;
                                            if (bl12) {
                                                Intrinsics.checkNotNull(object6, (String)object9);
                                                object6 = (AjioHomeActivity)object6;
                                                object7 = new Bundle();
                                                q9_0.Companion.getClass();
                                                object8 = q9$a.b((Bundle)object7, (String)object12);
                                                object7 = ((AjioHomeActivity)object6).T0;
                                                object11 = Boolean.FALSE;
                                                bl2 = true;
                                                object10 = object3;
                                                object12 = object11;
                                                ((AjioHomeActivity)object6).Q1((Fragment)object7, (Fragment)object8, bl2, (String)object3, (Boolean)object11);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                at2_1.d((Context)object);
            }
        }
    }

    public final void d(Activity activity, Uri object, Uri uri, boolean bl2, boolean bl3) {
        String string2;
        Object object2;
        boolean bl4;
        if (object != null && ((bl4 = ((String)(object2 = object.toString())).contains(string2 = "ajio.page.link")) || (bl4 = ((String)(object2 = object.toString())).contains(string2 = "ajiofnl.page.link")))) {
            object = "https://www.ajio.com";
            Uri uri2 = Uri.parse((String)object);
            object2 = this;
            string2 = activity;
            this.n(activity, uri2, uri, bl2, bl3);
        } else {
            this.n(activity, (Uri)object, uri, bl2, bl3);
        }
    }

    public final void l(Activity activity, Fragment fragment, int n3, String string2, String string3, int n4) {
        boolean bl2 = kj0_1.c(activity, string2);
        if (bl2) {
            kj0_1.a(activity, string2);
            bl2 = activity instanceof AjioHomeActivity;
            if (bl2) {
                Activity activity2 = activity;
                activity2 = (AjioHomeActivity)activity;
                Fragment fragment2 = activity2.T0;
                pc0_2 pc0_22 = new pc0_2();
                Boolean bl3 = Boolean.FALSE;
                boolean bl4 = true;
                activity2.Q1(fragment2, pc0_22, bl4, string2, bl3);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void n(Activity var1_1, Uri var2_2, Uri var3_4, boolean var4_5, boolean var5_6) {
        block23: {
            block24: {
                if (var2_2 == null) break block23;
                var6_7 = var2_2.toString();
                var7_8 = TextUtils.isEmpty((CharSequence)var6_7);
                if (var7_8) {
                    return;
                }
                var7_8 = var1_1 instanceof SplashScreenActivity;
                if (!var7_8 && (var8_9 = var2_2.getHost()) != null && (var10_11 = (var8_9 = var2_2.getHost()).equalsIgnoreCase((String)(var9_10 = "seller.ajio.com"))) != 0) {
                    var2_2 = var2_2.toString();
                    at2_1.j((Context)var1_1, (String)var2_2);
                    return;
                }
                var8_9 = "/login/pw/change?";
                var10_11 = var6_7.contains((CharSequence)var8_9);
                if (var10_11 != 0) {
                    if (!var7_8) {
                        var11_12 = var1_1.getApplication();
                        var2_2 = new jo_2((Context)var11_12);
                        var2_2 = "token";
                        var11_12 = bj0_1.a((String)var2_2, (String)var6_7);
                        ResetPasswordActivity.Companion.getClass();
                        Intrinsics.checkNotNullParameter(var1_1, "activity");
                        var9_10 = ResetPasswordActivity.class;
                        var8_9 = new Intent((Context)var1_1, (Class)var9_10);
                        var8_9.putExtra((String)var2_2, (String)var11_12);
                        var12_13 = 13;
                        var1_1.startActivityForResult((Intent)var8_9, var12_13);
                    }
                } else {
                    var11_12 = "linkCohort";
                    var10_11 = var6_7.contains((CharSequence)var11_12);
                    var9_10 = "https";
                    var13_14 = "ajioapps";
                    if (var10_11 != 0) {
                        var11_12 = var2_2.getQueryParameter((String)var11_12);
                        var8_9 = h40_0.a;
                        var10_11 = h40_0.V0();
                        if (var10_11 != 0) {
                            var8_9 = UserInformation.getInstance((Context)var1_1);
                            var8_9.setCohortLinkData((String)var11_12);
                        }
                        if (!(var7_8 = TextUtils.isEmpty((CharSequence)(var2_2 = var2_2.getScheme()))) && (var12_13 = var2_2.equalsIgnoreCase((String)var13_14)) != 0) {
                            var6_7 = var6_7.replace((CharSequence)var13_14, (CharSequence)var9_10);
                        }
                    } else {
                        var7_8 = TextUtils.isEmpty((CharSequence)(var2_2 = var2_2.getScheme()));
                        if (!var7_8 && (var12_13 = var2_2.equalsIgnoreCase((String)var13_14)) != 0) {
                            var6_7 = var6_7.replace((CharSequence)var13_14, (CharSequence)var9_10);
                        }
                    }
                }
                var2_2 = Uri.parse((String)var6_7);
                var7_8 = var1_1 instanceof SplashScreenActivity;
                if (var7_8) break block24;
                try {
                    bj0_1.f((Uri)var2_2);
                }
                catch (Exception var2_3) {
                    yn3_0.a(var2_3);
                }
            }
            if (!(var7_8 = var6_7.startsWith((String)(var2_2 = "https://")))) {
                var6_7 = var2_2.concat((String)var6_7);
            }
            Intrinsics.checkNotNullParameter(var6_7, "originalUrl");
            var2_2 = z40_0.Companion;
            var2_2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var2_2).a;
            var11_12 = "chopQueryParams";
            var2_2 = var2_2.b((String)var11_12);
            var7_8 = TextUtils.isEmpty((CharSequence)var2_2);
            if (var7_8) {
                var2_2 = ExternalConstants.UTM_PATTERN;
            }
            if (!(var7_8 = (var11_12 = Pattern.compile((String)var2_2).matcher((CharSequence)var6_7)).find())) ** GOTO lbl115
            var11_12 = "?";
            var8_9 = Pattern.quote((String)var11_12);
            Intrinsics.checkNotNullExpressionValue(var8_9, "quote(...)");
            var9_10 = new Regex((String)var8_9);
            var6_7 = var9_10.e((CharSequence)var6_7);
            var10_11 = var6_7.isEmpty();
            if (var10_11 == 0) {
                var10_11 = var6_7.size();
                var8_9 = var6_7.listIterator(var10_11);
                while ((var14_15 = var8_9.hasPrevious()) != 0) {
                    var9_10 = (String)var8_9.previous();
                    var14_15 = var9_10.length();
                    if (var14_15 == 0) continue;
                    var6_7 = (Iterable)var6_7;
                    var10_11 = var8_9.nextIndex() + 1;
                    var6_7 = CollectionsKt.f0((Iterable)var6_7, var10_11);
                    break;
                }
            } else {
                var6_7 = mz0_2.a;
            }
            var6_7 = (Collection)var6_7;
            var10_11 = 0;
            var9_10 = new String[]{};
            var6_7 = var6_7.toArray((T[])var9_10);
            var8_9 = var6_7[0];
            var14_15 = ((String[])var6_7).length + -1;
            var6_7 = var6_7[var14_15];
            var13_14 = "&";
            var9_10 = new StringTokenizer((String)var6_7, (String)var13_14);
            var6_7 = new StringBuilder();
            while (var15_16 = var9_10.hasMoreTokens()) {
                var16_17 = var9_10.nextToken();
                var17_18 = Pattern.compile((String)var2_2).matcher(var16_17);
                var18_19 = var17_18.find();
                if (var18_19) continue;
                var6_7.append(var16_17);
                var6_7.append((String)var13_14);
            }
            var12_13 = var6_7.length();
            if (var12_13 > 0) {
                var2_2 = new StringBuilder();
                var2_2.append((String)var8_9);
                var2_2.append((String)var11_12);
                var2_2.append(var6_7);
                var6_7 = var2_2.toString();
lbl115:
                // 2 sources

                var9_10 = var6_7;
            } else {
                var9_10 = var8_9;
            }
            if (var3_4 != null) {
                var2_2 = var3_4.toString();
lbl120:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var12_13 = 0;
            var2_2 = null;
            ** while (true)
            var13_14 = var2_2;
            var11_12 = this;
            var8_9 = var1_1;
            var15_16 = var4_5;
            var18_19 = var5_6;
            this.v(var1_1, (String)var9_10, (String)var2_2, var4_5, var5_6, null, 0);
        }
    }

    public final void o(Activity activity, Intent intent, boolean bl2) {
        boolean bl3;
        Object object = intent.getExtras();
        String string2 = "NOTIFICATION_INDICATOR";
        boolean bl4 = intent.getBooleanExtra(string2, false);
        if (object != null && (bl3 = object.containsKey(string2 = "SEARCH_TYPE")) && (bl3 = object.containsKey(string2 = "SEARCH_TEXT"))) {
            this.b = object;
        } else {
            this.a = object;
        }
        object = "shortLinkUrl";
        string2 = intent.getParcelableExtra((String)object);
        if (string2 != null) {
            Object object2 = object = intent.getParcelableExtra((String)object);
            object2 = (Uri)object;
            Uri uri = intent.getData();
            this.d(activity, uri, (Uri)object2, bl2, bl4);
        } else {
            Uri uri = intent.getData();
            Object var8_9 = null;
            this.d(activity, uri, null, bl2, bl4);
        }
    }

    public final void p(Activity activity, String string2) {
        Boolean bl2 = Boolean.FALSE;
        this.q(activity, string2, 0, null, 0, null, true, null, null, null, null, null, bl2, bl2, 0);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void q(Activity var1_1, String var2_2, int var3_3, Fragment var4_4, int var5_5, String var6_6, boolean var7_7, Bundle var8_8, String var9_9, String var10_10, String var11_11, String var12_12, Boolean var13_13, Boolean var14_14, int var15_15) {
        block201: {
            block184: {
                block185: {
                    block200: {
                        block187: {
                            block188: {
                                block198: {
                                    block199: {
                                        block196: {
                                            block197: {
                                                block125: {
                                                    block193: {
                                                        block194: {
                                                            block195: {
                                                                block189: {
                                                                    block190: {
                                                                        block191: {
                                                                            block192: {
                                                                                block186: {
                                                                                    block183: {
                                                                                        block182: {
                                                                                            block181: {
                                                                                                block180: {
                                                                                                    block179: {
                                                                                                        block178: {
                                                                                                            block177: {
                                                                                                                block176: {
                                                                                                                    block174: {
                                                                                                                        block175: {
                                                                                                                            block171: {
                                                                                                                                block173: {
                                                                                                                                    block172: {
                                                                                                                                        block168: {
                                                                                                                                            block170: {
                                                                                                                                                block169: {
                                                                                                                                                    block167: {
                                                                                                                                                        block166: {
                                                                                                                                                            block163: {
                                                                                                                                                                block164: {
                                                                                                                                                                    block165: {
                                                                                                                                                                        block162: {
                                                                                                                                                                            block161: {
                                                                                                                                                                                block159: {
                                                                                                                                                                                    block160: {
                                                                                                                                                                                        block158: {
                                                                                                                                                                                            block156: {
                                                                                                                                                                                                block157: {
                                                                                                                                                                                                    block153: {
                                                                                                                                                                                                        block155: {
                                                                                                                                                                                                            block154: {
                                                                                                                                                                                                                block150: {
                                                                                                                                                                                                                    block152: {
                                                                                                                                                                                                                        block151: {
                                                                                                                                                                                                                            block149: {
                                                                                                                                                                                                                                block148: {
                                                                                                                                                                                                                                    block146: {
                                                                                                                                                                                                                                        block147: {
                                                                                                                                                                                                                                            block144: {
                                                                                                                                                                                                                                                block145: {
                                                                                                                                                                                                                                                    block142: {
                                                                                                                                                                                                                                                        block143: {
                                                                                                                                                                                                                                                            block141: {
                                                                                                                                                                                                                                                                block140: {
                                                                                                                                                                                                                                                                    block139: {
                                                                                                                                                                                                                                                                        block138: {
                                                                                                                                                                                                                                                                            block137: {
                                                                                                                                                                                                                                                                                block136: {
                                                                                                                                                                                                                                                                                    block134: {
                                                                                                                                                                                                                                                                                        block135: {
                                                                                                                                                                                                                                                                                            block123: {
                                                                                                                                                                                                                                                                                                block131: {
                                                                                                                                                                                                                                                                                                    block132: {
                                                                                                                                                                                                                                                                                                        block133: {
                                                                                                                                                                                                                                                                                                            block121: {
                                                                                                                                                                                                                                                                                                                block122: {
                                                                                                                                                                                                                                                                                                                    block130: {
                                                                                                                                                                                                                                                                                                                        block129: {
                                                                                                                                                                                                                                                                                                                            block128: {
                                                                                                                                                                                                                                                                                                                                block126: {
                                                                                                                                                                                                                                                                                                                                    block127: {
                                                                                                                                                                                                                                                                                                                                        var16_16 = this;
                                                                                                                                                                                                                                                                                                                                        var17_17 = var1_1 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                        var18_18 = var2_2;
                                                                                                                                                                                                                                                                                                                                        var19_19 = var8_8 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                        var20_20 = var9_9 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                        var21_22 = var10_10;
                                                                                                                                                                                                                                                                                                                                        var22_23 = var11_11;
                                                                                                                                                                                                                                                                                                                                        var23_24 = var12_12;
                                                                                                                                                                                                                                                                                                                                        var24_25 = var15_15;
                                                                                                                                                                                                                                                                                                                                        var25_26 = var1_1 /* !! */  instanceof AjioHomeActivity;
                                                                                                                                                                                                                                                                                                                                        if (var25_26) {
                                                                                                                                                                                                                                                                                                                                            var26_27 = var1_1 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                            var26_27 = (AjioHomeActivity)var1_1 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                            var27_28 = var26_27.r1;
                                                                                                                                                                                                                                                                                                                                            if (!var27_28 && !(var27_28 = var14_14.booleanValue())) {
                                                                                                                                                                                                                                                                                                                                                var27_28 = false;
                                                                                                                                                                                                                                                                                                                                                var26_27 = null;
                                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                                var27_28 = true;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            var26_27 = var27_28;
                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                            var26_27 = var14_14;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        var28_29 = TextUtils.isEmpty((CharSequence)var2_2);
                                                                                                                                                                                                                                                                                                                                        if (var28_29 != 0) {
                                                                                                                                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        var28_29 = var3_3 == 0 ? 1000 : var3_3;
                                                                                                                                                                                                                                                                                                                                        var29_30 = "/s/";
                                                                                                                                                                                                                                                                                                                                        var30_31 = "/b/";
                                                                                                                                                                                                                                                                                                                                        var31_32 = "/c/";
                                                                                                                                                                                                                                                                                                                                        var32_33 = "linkUrl";
                                                                                                                                                                                                                                                                                                                                        if (var19_19 != null) {
                                                                                                                                                                                                                                                                                                                                            var22_23 = "IS_FROM_SEARCH_PAGE";
                                                                                                                                                                                                                                                                                                                                            var33_34 = false;
                                                                                                                                                                                                                                                                                                                                            var21_22 = null;
                                                                                                                                                                                                                                                                                                                                            var34_35 = var19_19.getBoolean((String)var22_23, false);
                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                            var22_23 = az3_0.a;
                                                                                                                                                                                                                                                                                                                                            Intrinsics.checkNotNullParameter(var18_18, (String)var32_33);
                                                                                                                                                                                                                                                                                                                                            var34_35 = StringsKt.H((CharSequence)var18_18, var31_32);
                                                                                                                                                                                                                                                                                                                                            if (var34_35 == 0 && (var34_35 = StringsKt.H((CharSequence)var18_18, (CharSequence)var30_31)) == 0 && (var34_35 = StringsKt.H((CharSequence)var18_18, (CharSequence)var29_30)) == 0) {
                                                                                                                                                                                                                                                                                                                                                var34_35 = 0;
                                                                                                                                                                                                                                                                                                                                                var22_23 = null;
                                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                                var34_35 = 1;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        var21_22 = h40_0.a;
                                                                                                                                                                                                                                                                                                                                        var21_22 = z40_0.Companion;
                                                                                                                                                                                                                                                                                                                                        var35_36 = var29_30;
                                                                                                                                                                                                                                                                                                                                        var21_22 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var21_22).a.d("ExternalBrowserDeeplinkKeys");
                                                                                                                                                                                                                                                                                                                                        var29_30 = "deeplinkKeys";
                                                                                                                                                                                                                                                                                                                                        var36_37 = var21_22.has((String)var29_30);
                                                                                                                                                                                                                                                                                                                                        if (var36_37) {
                                                                                                                                                                                                                                                                                                                                            var21_22 = var21_22.getJSONArray((String)var29_30);
                                                                                                                                                                                                                                                                                                                                            var29_30 = new Object();
                                                                                                                                                                                                                                                                                                                                            var14_14 = var30_31;
                                                                                                                                                                                                                                                                                                                                            var37_38 = var21_22.length();
                                                                                                                                                                                                                                                                                                                                            var38_39 = var31_32;
                                                                                                                                                                                                                                                                                                                                            var31_32 = null;
                                                                                                                                                                                                                                                                                                                                            for (var39_40 = 0; var39_40 < var37_38; ++var39_40) {
                                                                                                                                                                                                                                                                                                                                                var30_31 = var21_22.getString(var39_40);
                                                                                                                                                                                                                                                                                                                                                var29_30.add(var30_31);
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                            var38_39 = var31_32;
                                                                                                                                                                                                                                                                                                                                            var14_14 = var30_31;
                                                                                                                                                                                                                                                                                                                                            var29_30 = new Object();
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        var21_22 = Uri.parse((String)var2_2);
                                                                                                                                                                                                                                                                                                                                        var31_32 = var21_22.getHost();
                                                                                                                                                                                                                                                                                                                                        var37_38 = var17_17 instanceof BaseActivity;
                                                                                                                                                                                                                                                                                                                                        if (var37_38 != 0) {
                                                                                                                                                                                                                                                                                                                                            var30_31 = var17_17;
                                                                                                                                                                                                                                                                                                                                            var30_31 = (BaseActivity)var17_17;
                                                                                                                                                                                                                                                                                                                                            var30_31.getClass();
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        if ((var37_38 = (int)var18_18.contains((CharSequence)(var30_31 = "inAppPopUp"))) != 0 && (var37_38 = (int)var2_2.isEmpty()) == 0) {
                                                                                                                                                                                                                                                                                                                                            var30_31 = Uri.parse((String)var2_2);
                                                                                                                                                                                                                                                                                                                                            var40_41 = var30_31.getQueryParameterNames();
                                                                                                                                                                                                                                                                                                                                            var41_42 = var28_29;
                                                                                                                                                                                                                                                                                                                                            var42_43 = new Bundle();
                                                                                                                                                                                                                                                                                                                                            var40_41 = var40_41.iterator();
                                                                                                                                                                                                                                                                                                                                            while (var43_44 = var40_41.hasNext()) {
                                                                                                                                                                                                                                                                                                                                                var44_45 /* !! */  = var40_41.next();
                                                                                                                                                                                                                                                                                                                                                var45_46 = var34_35;
                                                                                                                                                                                                                                                                                                                                                var22_23 = var44_45 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                                var22_23 = (String)var44_45 /* !! */ ;
                                                                                                                                                                                                                                                                                                                                                var23_24 = var30_31.getQueryParameter((String)var22_23);
                                                                                                                                                                                                                                                                                                                                                var42_43.putString((String)var22_23, (String)var23_24);
                                                                                                                                                                                                                                                                                                                                                var23_24 = var12_12;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            var45_46 = var34_35;
                                                                                                                                                                                                                                                                                                                                            ClevertapGAUtils.pushQueryParamsToGA((Bundle)var42_43);
                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                            var45_46 = var34_35;
                                                                                                                                                                                                                                                                                                                                            var41_42 = var28_29;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        var22_23 = "https://www.ajio.com";
                                                                                                                                                                                                                                                                                                                                        var46_47 = var18_18.contains((CharSequence)var22_23);
                                                                                                                                                                                                                                                                                                                                        var42_43 = "landing screen";
                                                                                                                                                                                                                                                                                                                                        if (var46_47) {
                                                                                                                                                                                                                                                                                                                                            var46_47 = og1_1.c();
                                                                                                                                                                                                                                                                                                                                            if (!(var46_47 || (var34_35 = (int)var18_18.equalsIgnoreCase((String)var22_23)) == 0 && (var34_35 = var18_18.equalsIgnoreCase((String)(var22_23 = "https://www.ajio.com/"))) == 0 && (var34_35 = var18_18.equalsIgnoreCase((String)(var22_23 = "https://www.ajio.com/shop/ajio"))) == 0 && (var34_35 = var18_18.equalsIgnoreCase((String)(var22_23 = "https://www.ajio.com/shop/ajio/"))) == 0)) {
                                                                                                                                                                                                                                                                                                                                                var47_48 = var17_17 instanceof SplashScreenActivity;
                                                                                                                                                                                                                                                                                                                                                if (var47_48 != false) return;
                                                                                                                                                                                                                                                                                                                                                if (var25_26) {
                                                                                                                                                                                                                                                                                                                                                    var20_20 = var17_17;
                                                                                                                                                                                                                                                                                                                                                    var20_20 = (AjioHomeActivity)var17_17;
                                                                                                                                                                                                                                                                                                                                                    var48_50 = true;
                                                                                                                                                                                                                                                                                                                                                    var20_20.f(var48_50);
                                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                                    var47_48 = var17_17 instanceof OrderConfirmationActivity;
                                                                                                                                                                                                                                                                                                                                                    if (var47_48) {
                                                                                                                                                                                                                                                                                                                                                        var20_20 = var17_17;
                                                                                                                                                                                                                                                                                                                                                        var20_20 = (OrderConfirmationActivity)var17_17;
                                                                                                                                                                                                                                                                                                                                                        kj0_1.k((OrderConfirmationActivity)var20_20, (String)var18_18);
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                var20_20 = AnalyticsManager.getInstance().getGtmEvents();
                                                                                                                                                                                                                                                                                                                                                var20_20.pushOpenScreenEvent((String)var42_43);
                                                                                                                                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            var34_35 = 20;
                                                                                                                                                                                                                                                                                                                                            var22_23 = var18_18.substring(var34_35);
                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                            var22_23 = "https://luxe.ajio.com";
                                                                                                                                                                                                                                                                                                                                            var34_35 = (int)var18_18.equals(var22_23);
                                                                                                                                                                                                                                                                                                                                            if ((var34_35 != 0 || (var34_35 = (int)var18_18.equals(var22_23 = "https://luxe.ajio.com/")) != 0) && var25_26) {
                                                                                                                                                                                                                                                                                                                                                var34_35 = 1;
                                                                                                                                                                                                                                                                                                                                                og1_1.g((boolean)var34_35, (boolean)var34_35);
                                                                                                                                                                                                                                                                                                                                                var20_20 = var17_17;
                                                                                                                                                                                                                                                                                                                                                ((AjioHomeActivity)var17_17).H();
                                                                                                                                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            var22_23 = var18_18;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        cp_1.Companion.getClass();
                                                                                                                                                                                                                                                                                                                                        var23_24 = cp$a.e();
                                                                                                                                                                                                                                                                                                                                        var23_24.getClass();
                                                                                                                                                                                                                                                                                                                                        var46_47 = cp_1.H(var31_32);
                                                                                                                                                                                                                                                                                                                                        if (!var46_47) break block126;
                                                                                                                                                                                                                                                                                                                                        var23_24 = cp_1.g(var31_32);
                                                                                                                                                                                                                                                                                                                                        var30_31 = Pattern.compile("([a-zA-Z0-9]+)(.ajio.com)").matcher((CharSequence)var23_24);
                                                                                                                                                                                                                                                                                                                                        var44_45 /* !! */  = "([a-zA-Z0-9-]+)(.services.ajio.com)";
                                                                                                                                                                                                                                                                                                                                        var49_57 = var42_43;
                                                                                                                                                                                                                                                                                                                                        var42_43 = Pattern.compile(var44_45 /* !! */ );
                                                                                                                                                                                                                                                                                                                                        var23_24 = var42_43.matcher((CharSequence)var23_24);
                                                                                                                                                                                                                                                                                                                                        var28_29 = 2;
                                                                                                                                                                                                                                                                                                                                        if (var23_24 == null || !(var43_44 = var23_24.find())) break block127;
                                                                                                                                                                                                                                                                                                                                        var37_38 = var23_24.groupCount();
                                                                                                                                                                                                                                                                                                                                        if (var37_38 < var28_29) break block128;
                                                                                                                                                                                                                                                                                                                                        var28_29 = 1;
                                                                                                                                                                                                                                                                                                                                        if ((var23_24 = var23_24.group(var28_29)) != null) {
                                                                                                                                                                                                                                                                                                                                            var30_31 = new String[]{"-"};
                                                                                                                                                                                                                                                                                                                                            var50_58 = 6;
                                                                                                                                                                                                                                                                                                                                            var28_29 = 0;
                                                                                                                                                                                                                                                                                                                                            var42_43 = null;
                                                                                                                                                                                                                                                                                                                                            var23_24 = StringsKt.a0((CharSequence)var23_24, (String[])var30_31, false, 0, var50_58);
                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                            var46_47 = false;
                                                                                                                                                                                                                                                                                                                                            var23_24 = null;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        if (var23_24 == null || (var50_58 = var23_24.size()) <= (var28_29 = 1)) break block128;
                                                                                                                                                                                                                                                                                                                                        var16_16 = (String)var23_24.get(var28_29);
                                                                                                                                                                                                                                                                                                                                        break block129;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    if (var30_31 == null || !(var50_58 = var30_31.find()) || (var50_58 = var30_31.groupCount()) < var28_29) break block128;
                                                                                                                                                                                                                                                                                                                                    var50_58 = 1;
                                                                                                                                                                                                                                                                                                                                    var16_16 = var23_24 = var30_31.group(var50_58);
                                                                                                                                                                                                                                                                                                                                    break block129;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                var49_57 = var42_43;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            var50_58 = 0;
                                                                                                                                                                                                                                                                                                                            var16_16 = null;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        if (var16_16 == null && var20_20 != null && !(var46_47 = var20_20.equalsIgnoreCase((String)(var23_24 = "rilfnl")))) {
                                                                                                                                                                                                                                                                                                                            var16_16 = var20_20;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        var47_49 = og1_1.c();
                                                                                                                                                                                                                                                                                                                        var23_24 = "luxe";
                                                                                                                                                                                                                                                                                                                        if (var47_49 != 0) {
                                                                                                                                                                                                                                                                                                                            var20_20 = cp$a.e();
                                                                                                                                                                                                                                                                                                                            var20_20.getClass();
                                                                                                                                                                                                                                                                                                                            var47_49 = cp_1.H(var31_32);
                                                                                                                                                                                                                                                                                                                            if (var47_49 != 0) {
                                                                                                                                                                                                                                                                                                                                var20_20 = cp$a.e();
                                                                                                                                                                                                                                                                                                                                var20_20.getClass();
                                                                                                                                                                                                                                                                                                                                var47_49 = cp_1.G((Uri)var21_22, (String)var16_16);
                                                                                                                                                                                                                                                                                                                                if (var47_49 != 0 && var16_16 != null) {
                                                                                                                                                                                                                                                                                                                                    var20_20 = Locale.ENGLISH;
                                                                                                                                                                                                                                                                                                                                    var47_49 = (int)(var20_20 = var16_16.toLowerCase((Locale)var20_20)).equals(var23_24);
                                                                                                                                                                                                                                                                                                                                    if (var47_49 != 0) {
                                                                                                                                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        if ((var47_49 = kj0_1.c((Activity)var17_17, (String)var16_16)) == 0) {
                                                                                                                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        var28_29 = var17_17 instanceof SplashScreenActivity;
                                                                                                                                                                                                                                                                                                                        if (var28_29 == 0 && var24_25 != (var37_38 = 1) && (var47_49 = URLUtil.isNetworkUrl((String)var2_2)) != 0 && ((var47_49 = TextUtils.isEmpty((CharSequence)var16_16)) != 0 || (var47_49 = (int)(var20_20 = var16_16.toLowerCase()).contains((CharSequence)(var30_31 = var23_24.toLowerCase()))) == 0)) {
                                                                                                                                                                                                                                                                                                                            if (var25_26) {
                                                                                                                                                                                                                                                                                                                                var47_49 = og1_1.c();
                                                                                                                                                                                                                                                                                                                                if (var47_49 != 0) {
                                                                                                                                                                                                                                                                                                                                    var20_20 = var17_17;
                                                                                                                                                                                                                                                                                                                                    var20_20 = (AjioHomeActivity)var17_17;
                                                                                                                                                                                                                                                                                                                                    var25_26 = 0;
                                                                                                                                                                                                                                                                                                                                    var51_59 = null;
                                                                                                                                                                                                                                                                                                                                    var20_20.f(false);
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                var25_26 = 0;
                                                                                                                                                                                                                                                                                                                                var51_59 = null;
                                                                                                                                                                                                                                                                                                                                og1_1.a(false);
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        cp$a.e().getClass();
                                                                                                                                                                                                                                                                                                                        var51_59 = "https://";
                                                                                                                                                                                                                                                                                                                        var20_20 = new StringBuilder((String)var51_59);
                                                                                                                                                                                                                                                                                                                        var20_20.append(var31_32);
                                                                                                                                                                                                                                                                                                                        var20_20 = var20_20.toString();
                                                                                                                                                                                                                                                                                                                        var47_49 = var20_20.length();
                                                                                                                                                                                                                                                                                                                        var25_26 = TextUtils.isEmpty((CharSequence)var16_16);
                                                                                                                                                                                                                                                                                                                        if (!var25_26 && !(var25_26 = TextUtils.isEmpty((CharSequence)var31_32)) && (var25_26 = var22_23.length()) > var47_49) {
                                                                                                                                                                                                                                                                                                                            var22_23 = var20_20 = var22_23.substring(var47_49);
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        var51_59 = "www.ajio.com";
                                                                                                                                                                                                                                                                                                                        var20_20 = var16_16 == null && var31_32 != null && (var47_49 = (int)var31_32.equals(var51_59)) != 0 ? ld3_2.STORE_AJIO.getStoreId() : var16_16;
                                                                                                                                                                                                                                                                                                                        var37_38 = 1;
                                                                                                                                                                                                                                                                                                                        if (var24_25 != var37_38) {
                                                                                                                                                                                                                                                                                                                            kj0_1.a((Activity)var17_17, (String)var20_20);
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        var52_60 = "android.intent.category.BROWSABLE";
                                                                                                                                                                                                                                                                                                                        var30_31 = "android.intent.action.VIEW";
                                                                                                                                                                                                                                                                                                                        var9_9 /* !! */  = var23_24;
                                                                                                                                                                                                                                                                                                                        var23_24 = "No application can handle this request";
                                                                                                                                                                                                                                                                                                                        var44_45 /* !! */  = var21_22;
                                                                                                                                                                                                                                                                                                                        var21_22 = "mActivity";
                                                                                                                                                                                                                                                                                                                        if (var31_32 != null && (var47_49 = (int)var31_32.contains((CharSequence)(var20_20 = "ajio.com"))) == 0 && (var47_49 = (int)var31_32.contains((CharSequence)(var20_20 = "ajio.ril.com"))) == 0 && (var47_49 = (int)var31_32.contains((CharSequence)(var20_20 = "jioplayalong4.akamaized.net"))) == 0) break block130;
                                                                                                                                                                                                                                                                                                                        var53_61 = var23_24;
                                                                                                                                                                                                                                                                                                                        var23_24 = "/shop/home";
                                                                                                                                                                                                                                                                                                                        var47_49 = (int)var22_23.contains((CharSequence)var23_24);
                                                                                                                                                                                                                                                                                                                        if (var47_49 == 0) break block131;
                                                                                                                                                                                                                                                                                                                        break block132;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    var47_49 = (int)kj0_1.e((String)var22_23, var29_30);
                                                                                                                                                                                                                                                                                                                    if (var47_49 == 0) break block133;
                                                                                                                                                                                                                                                                                                                    Intrinsics.checkNotNullParameter(var17_17, (String)var21_22);
                                                                                                                                                                                                                                                                                                                    var16_16 = var1_1 /* !! */ .getApplication();
                                                                                                                                                                                                                                                                                                                    var20_20 = new jo_2((Context)var16_16);
                                                                                                                                                                                                                                                                                                                    var16_16 = Uri.parse((String)var2_2);
                                                                                                                                                                                                                                                                                                                    var20_20 = new Intent((String)var30_31, (Uri)var16_16);
                                                                                                                                                                                                                                                                                                                    var20_20.addCategory((String)var52_60);
                                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                                        var16_16 = var1_1 /* !! */ .getPackageManager();
                                                                                                                                                                                                                                                                                                                        var16_16 = var20_20.resolveActivity((PackageManager)var16_16);
                                                                                                                                                                                                                                                                                                                        if (var16_16 != null) {
                                                                                                                                                                                                                                                                                                                            var17_17.startActivity((Intent)var20_20);
                                                                                                                                                                                                                                                                                                                            break block121;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    catch (ActivityNotFoundException v0) {
                                                                                                                                                                                                                                                                                                                        var50_58 = 0;
                                                                                                                                                                                                                                                                                                                        var16_16 = null;
                                                                                                                                                                                                                                                                                                                        break block122;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                                                                        var20_20 = yn3_0.a;
                                                                                                                                                                                                                                                                                                                        var50_58 = 0;
                                                                                                                                                                                                                                                                                                                        var16_16 = null;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                                        var17_17 = new Object[]{};
                                                                                                                                                                                                                                                                                                                        var20_20.a((String)var23_24, (Object[])var17_17);
                                                                                                                                                                                                                                                                                                                        break block121;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    catch (ActivityNotFoundException v1) {}
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                var20_20 = yn3_0.a;
                                                                                                                                                                                                                                                                                                                var16_16 = new Object[]{};
                                                                                                                                                                                                                                                                                                                var20_20.a((String)var23_24, (Object[])var16_16);
                                                                                                                                                                                                                                                                                                            }
lbl267:
                                                                                                                                                                                                                                                                                                            // 81 sources

                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                var21_22 = this;
                                                                                                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        at2_1.j((Context)var17_17, (String)var22_23);
                                                                                                                                                                                                                                                                                                        ** GOTO lbl267
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    var47_49 = (int)URLUtil.isValidUrl((String)var22_23);
                                                                                                                                                                                                                                                                                                    if (var47_49 != 0) {
                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                            var20_20 = new URL((String)var22_23);
                                                                                                                                                                                                                                                                                                            var20_20 = var20_20.getPath();
                                                                                                                                                                                                                                                                                                            break block123;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        catch (Exception var20_21) {
                                                                                                                                                                                                                                                                                                            yn3_0.a(var20_21);
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                var20_20 = var22_23;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            var54_62 = h40_0.a;
                                                                                                                                                                                                                                                                                            var55_63 = h40_0.b1();
                                                                                                                                                                                                                                                                                            if (var55_63 && (var55_63 = var26_27.booleanValue()) && !(var55_63 = az3_0.e((String)var2_2))) {
                                                                                                                                                                                                                                                                                                var54_62 = var52_60;
                                                                                                                                                                                                                                                                                                var52_60 = od3_2.a();
                                                                                                                                                                                                                                                                                                var56_64 = ld3_2.STORE_AJIOGRAM;
                                                                                                                                                                                                                                                                                                var57_65 /* !! */  = var30_31;
                                                                                                                                                                                                                                                                                                var30_31 = var56_64.getStoreId();
                                                                                                                                                                                                                                                                                                if (var52_60 == var30_31 && var28_29 == 0) {
                                                                                                                                                                                                                                                                                                    var24_25 = (int)var26_27.booleanValue();
                                                                                                                                                                                                                                                                                                    s20.a = var24_25;
                                                                                                                                                                                                                                                                                                    var52_60 = new zj0_0((Activity)var17_17);
                                                                                                                                                                                                                                                                                                    var37_38 = (int)var26_27.booleanValue();
                                                                                                                                                                                                                                                                                                    var56_64 = var21_22;
                                                                                                                                                                                                                                                                                                    var33_34 = false;
                                                                                                                                                                                                                                                                                                    var21_22 = null;
                                                                                                                                                                                                                                                                                                    var52_60.b(null, (String)var22_23, (String)var18_18, (boolean)var37_38);
                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                    var56_64 = var21_22;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                var54_62 = var52_60;
                                                                                                                                                                                                                                                                                                var56_64 = var21_22;
                                                                                                                                                                                                                                                                                                var57_65 /* !! */  = var30_31;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            var24_25 = (int)h40_0.b1();
                                                                                                                                                                                                                                                                                            var21_22 = "originalUrl";
                                                                                                                                                                                                                                                                                            if (var24_25 != 0 && (var24_25 = (int)var26_27.booleanValue()) != 0) {
                                                                                                                                                                                                                                                                                                var52_60 = az3_0.a;
                                                                                                                                                                                                                                                                                                Intrinsics.checkNotNullParameter(var18_18, (String)var21_22);
                                                                                                                                                                                                                                                                                                Intrinsics.checkNotNullParameter(var22_23, (String)var32_33);
                                                                                                                                                                                                                                                                                                var24_25 = (int)az3_0.e((String)var2_2);
                                                                                                                                                                                                                                                                                                if (var24_25 != 0 && (var24_25 = (int)az3_0.f((String)var22_23)) != 0 && var28_29 == 0) {
                                                                                                                                                                                                                                                                                                    var52_60 = "brandPageCode=";
                                                                                                                                                                                                                                                                                                    var24_25 = (int)var22_23.contains((CharSequence)var52_60);
                                                                                                                                                                                                                                                                                                    if (var24_25 != 0) {
                                                                                                                                                                                                                                                                                                        if (var19_19 == null) {
                                                                                                                                                                                                                                                                                                            var19_19 = new Bundle();
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        if ((var52_60 = bj0_1.d((String)var18_18, "brandPageCode")) != null && !(var58_66 = var52_60.isEmpty())) {
                                                                                                                                                                                                                                                                                                            var32_33 = "brand_id";
                                                                                                                                                                                                                                                                                                            var19_19.putString((String)var32_33, (String)var52_60);
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    var24_25 = 1;
                                                                                                                                                                                                                                                                                                    s20.a = var24_25;
                                                                                                                                                                                                                                                                                                    var52_60 = new zj0_0((Activity)var17_17);
                                                                                                                                                                                                                                                                                                    var58_66 = var26_27.booleanValue();
                                                                                                                                                                                                                                                                                                    var37_38 = 0;
                                                                                                                                                                                                                                                                                                    var30_31 = null;
                                                                                                                                                                                                                                                                                                    var52_60.b(null, (String)var22_23, (String)var18_18, var58_66);
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            var47_49 = (int)var20_20.equalsIgnoreCase((String)var23_24);
                                                                                                                                                                                                                                                                                            var23_24 = "Home fragment Link Failed";
                                                                                                                                                                                                                                                                                            var52_60 = "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity";
                                                                                                                                                                                                                                                                                            if (var47_49 == 0) break block134;
                                                                                                                                                                                                                                                                                            if (var28_29 != 0) ** GOTO lbl267
                                                                                                                                                                                                                                                                                            var16_16 = var1_1 /* !! */ .getApplication();
                                                                                                                                                                                                                                                                                            var20_20 = new jo_2((Context)var16_16);
                                                                                                                                                                                                                                                                                            var47_49 = var17_17 instanceof BaseActivity;
                                                                                                                                                                                                                                                                                            if (var47_49 == 0) break block135;
                                                                                                                                                                                                                                                                                            Intrinsics.checkNotNull(var17_17, (String)var52_60);
                                                                                                                                                                                                                                                                                            var20_20 = var17_17;
                                                                                                                                                                                                                                                                                            var20_20 = (BaseActivity)var17_17;
                                                                                                                                                                                                                                                                                            var50_58 = 0;
                                                                                                                                                                                                                                                                                            var16_16 = null;
                                                                                                                                                                                                                                                                                            var20_20.U1(0);
                                                                                                                                                                                                                                                                                            ** GOTO lbl267
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        var50_58 = 0;
                                                                                                                                                                                                                                                                                        var20_20 = yn3_0.a;
                                                                                                                                                                                                                                                                                        var16_16 = new Object[]{};
                                                                                                                                                                                                                                                                                        var20_20.d((String)var23_24, (Object[])var16_16);
                                                                                                                                                                                                                                                                                        ** GOTO lbl267
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    var20_20 = "/login";
                                                                                                                                                                                                                                                                                    var58_66 = var22_23.contains((CharSequence)var20_20);
                                                                                                                                                                                                                                                                                    if (!var58_66) break block136;
                                                                                                                                                                                                                                                                                    if (var28_29 == 0) {
                                                                                                                                                                                                                                                                                        var20_20 = new kz1_1((Activity)var17_17);
                                                                                                                                                                                                                                                                                        var20_20.b((String)var22_23);
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    ** GOTO lbl267
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                var32_33 = "/capsule/newin";
                                                                                                                                                                                                                                                                                var58_66 = var22_23.contains((CharSequence)var32_33);
                                                                                                                                                                                                                                                                                if (!var58_66) break block137;
                                                                                                                                                                                                                                                                                at2_1.d((Context)var1_1 /* !! */ );
                                                                                                                                                                                                                                                                                ** GOTO lbl267
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            var32_33 = "/cp/";
                                                                                                                                                                                                                                                                            var58_66 = var22_23.contains((CharSequence)var32_33);
                                                                                                                                                                                                                                                                            if (var58_66 || (var58_66 = var22_23.contains((CharSequence)(var32_33 = "/capsule/")))) {
                                                                                                                                                                                                                                                                                var21_22 = this;
                                                                                                                                                                                                                                                                                at2_1.d((Context)var1_1 /* !! */ );
                                                                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            var32_33 = "/p/";
                                                                                                                                                                                                                                                                            var58_66 = var22_23.contains((CharSequence)var32_33);
                                                                                                                                                                                                                                                                            if (!var58_66) break block138;
                                                                                                                                                                                                                                                                            if (var28_29 == 0) {
                                                                                                                                                                                                                                                                                var20_20 = kj0_1.i((String)var22_23);
                                                                                                                                                                                                                                                                                var19_19 = bj0_1.c(bj0_1.e((String)var22_23), "p");
                                                                                                                                                                                                                                                                                var35_36 = var22_23 = new zj0_0((Activity)var17_17);
                                                                                                                                                                                                                                                                                var4_4 = var19_19;
                                                                                                                                                                                                                                                                                var6_6 = var10_10;
                                                                                                                                                                                                                                                                                var8_8 /* !! */  = var2_2;
                                                                                                                                                                                                                                                                                var22_23.b((String)var19_19, (String)var16_16, (String)var10_10, (String)var20_20, (String)var2_2);
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            ** GOTO lbl267
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        var32_33 = "/s1/";
                                                                                                                                                                                                                                                                        var37_38 = var22_23.contains((CharSequence)var32_33);
                                                                                                                                                                                                                                                                        if (var37_38 == 0) break block139;
                                                                                                                                                                                                                                                                        if (var28_29 == 0) {
                                                                                                                                                                                                                                                                            var20_20 = bj0_1.e((String)var22_23);
                                                                                                                                                                                                                                                                            var50_58 = var22_23.indexOf((String)var32_33) + 4;
                                                                                                                                                                                                                                                                            var20_20 = var20_20.substring(var50_58);
                                                                                                                                                                                                                                                                            var16_16 = new zj0_0((Activity)var17_17);
                                                                                                                                                                                                                                                                            var16_16.c((String)var20_20);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        ** GOTO lbl267
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    var32_33 = AJIOApplication.Companion;
                                                                                                                                                                                                                                                                    var32_33.getClass();
                                                                                                                                                                                                                                                                    var30_31 = AJIOApplication$a.a();
                                                                                                                                                                                                                                                                    var59_67 = z40_0.Companion;
                                                                                                                                                                                                                                                                    var59_67.getClass();
                                                                                                                                                                                                                                                                    var30_31 = z40$a.a((Context)var30_31).a;
                                                                                                                                                                                                                                                                    var60_68 = var29_30;
                                                                                                                                                                                                                                                                    var29_30 = "find_page_deeplink_enable";
                                                                                                                                                                                                                                                                    var61_69 = var30_31.a((String)var29_30);
                                                                                                                                                                                                                                                                    if (!var61_69 || (var37_38 = var22_23.contains((CharSequence)(var29_30 = "/find/"))) == 0) break block140;
                                                                                                                                                                                                                                                                    if (var28_29 != 0) ** GOTO lbl267
                                                                                                                                                                                                                                                                    var20_20 = bj0_1.e((String)var22_23);
                                                                                                                                                                                                                                                                    var50_58 = var22_23.indexOf((String)var29_30) + 6;
                                                                                                                                                                                                                                                                    var62_70 = var20_20.isEmpty();
                                                                                                                                                                                                                                                                    if (var62_70 != 0 || (var62_70 = var20_20.length()) <= var50_58) ** GOTO lbl267
                                                                                                                                                                                                                                                                    var20_20 = var20_20.substring(var50_58);
                                                                                                                                                                                                                                                                    var16_16 = new zj0_0((Activity)var17_17);
                                                                                                                                                                                                                                                                    var16_16.c((String)var20_20);
                                                                                                                                                                                                                                                                    ** GOTO lbl267
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                var29_30 = "/search";
                                                                                                                                                                                                                                                                var61_69 = var22_23.contains((CharSequence)var29_30);
                                                                                                                                                                                                                                                                if (!var61_69) break block141;
                                                                                                                                                                                                                                                                if (var28_29 != 0) ** GOTO lbl267
                                                                                                                                                                                                                                                                var20_20 = new zj0_0((Activity)var17_17);
                                                                                                                                                                                                                                                                var29_30 = this;
                                                                                                                                                                                                                                                                var17_17 = this.b;
                                                                                                                                                                                                                                                                var30_31 = var12_12;
                                                                                                                                                                                                                                                                if (var12_12 != null && (var62_71 = var12_12.endsWith((String)(var19_19 = "video")))) {
                                                                                                                                                                                                                                                                    var39_40 = 1;
                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                    var39_40 = 0;
                                                                                                                                                                                                                                                                    var31_32 = null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                var20_20.b((Bundle)var17_17, (String)var22_23, (String)var16_16, (boolean)var39_40);
                                                                                                                                                                                                                                                                var21_22 = var29_30;
                                                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            var29_30 = this;
                                                                                                                                                                                                                                                            var30_31 = "/cart";
                                                                                                                                                                                                                                                            var37_38 = var22_23.contains((CharSequence)var30_31);
                                                                                                                                                                                                                                                            var29_30 = "activity";
                                                                                                                                                                                                                                                            var8_8 /* !! */  = var20_20;
                                                                                                                                                                                                                                                            var20_20 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
                                                                                                                                                                                                                                                            if (var37_38 == 0 || var45_46 != 0) break block142;
                                                                                                                                                                                                                                                            if (var28_29 != 0) ** GOTO lbl267
                                                                                                                                                                                                                                                            var16_16 = "/cart/add";
                                                                                                                                                                                                                                                            var50_58 = (int)var22_23.contains((CharSequence)var16_16);
                                                                                                                                                                                                                                                            var19_19 = "cart_tab_selection";
                                                                                                                                                                                                                                                            if (!var50_58) break block143;
                                                                                                                                                                                                                                                            Intrinsics.checkNotNullParameter(var17_17, (String)var29_30);
                                                                                                                                                                                                                                                            var22_23 = var1_1 /* !! */ .getApplication();
                                                                                                                                                                                                                                                            var16_16 = new jo_2((Context)var22_23);
                                                                                                                                                                                                                                                            var16_16 = "deepLinkUrl";
                                                                                                                                                                                                                                                            Intrinsics.checkNotNullParameter(var18_18, (String)var16_16);
                                                                                                                                                                                                                                                            var50_58 = var17_17 instanceof AjioHomeActivity;
                                                                                                                                                                                                                                                            if (var50_58) {
                                                                                                                                                                                                                                                                Intrinsics.checkNotNull(var17_17, (String)var20_20);
                                                                                                                                                                                                                                                                var20_20 = var17_17;
                                                                                                                                                                                                                                                                var20_20 = (AjioHomeActivity)var17_17;
                                                                                                                                                                                                                                                                qn_2.Companion.getClass();
                                                                                                                                                                                                                                                                var16_16 = new qn_2();
                                                                                                                                                                                                                                                                var17_17 = new Bundle();
                                                                                                                                                                                                                                                                var34_35 = 1;
                                                                                                                                                                                                                                                                var17_17.putBoolean((String)var19_19, (boolean)var34_35);
                                                                                                                                                                                                                                                                var17_17.putString("cart_deeplink_url", (String)var18_18);
                                                                                                                                                                                                                                                                var19_19 = var16_16.getArguments();
                                                                                                                                                                                                                                                                if (var19_19 == null) {
                                                                                                                                                                                                                                                                    var16_16.setArguments((Bundle)var17_17);
                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                    var16_16.requireArguments().clear();
                                                                                                                                                                                                                                                                    var19_19 = var16_16.requireArguments();
                                                                                                                                                                                                                                                                    var19_19.putAll((Bundle)var17_17);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                var17_17 = var20_20.T0;
                                                                                                                                                                                                                                                                var19_19 = "CartFragment";
                                                                                                                                                                                                                                                                var34_35 = 1;
                                                                                                                                                                                                                                                                j3$a.a((j3_0)var20_20, (Fragment)var17_17, (Fragment)var16_16, (boolean)var34_35, (String)var19_19);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            ** GOTO lbl267
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        var16_16 = var1_1 /* !! */ .getApplication();
                                                                                                                                                                                                                                                        var20_20 = new jo_2((Context)var16_16);
                                                                                                                                                                                                                                                        var47_49 = var17_17 instanceof AjioHomeActivity;
                                                                                                                                                                                                                                                        if (var47_49 == 0) ** GOTO lbl267
                                                                                                                                                                                                                                                        var20_20 = var17_17;
                                                                                                                                                                                                                                                        var20_20 = (AjioHomeActivity)var17_17;
                                                                                                                                                                                                                                                        qn_2.Companion.getClass();
                                                                                                                                                                                                                                                        var16_16 = new qn_2();
                                                                                                                                                                                                                                                        var17_17 = new Bundle();
                                                                                                                                                                                                                                                        var34_35 = 1;
                                                                                                                                                                                                                                                        var17_17.putBoolean((String)var19_19, (boolean)var34_35);
                                                                                                                                                                                                                                                        var19_19 = var16_16.getArguments();
                                                                                                                                                                                                                                                        if (var19_19 == null) {
                                                                                                                                                                                                                                                            var16_16.setArguments((Bundle)var17_17);
                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                            var16_16.getArguments().clear();
                                                                                                                                                                                                                                                            var19_19 = var16_16.getArguments();
                                                                                                                                                                                                                                                            var19_19.putAll((Bundle)var17_17);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        var17_17 = var20_20.T0;
                                                                                                                                                                                                                                                        var19_19 = Boolean.FALSE;
                                                                                                                                                                                                                                                        var34_35 = 1;
                                                                                                                                                                                                                                                        var23_24 = "CartFragment";
                                                                                                                                                                                                                                                        var1_1 /* !! */  = var20_20;
                                                                                                                                                                                                                                                        var2_2 = var17_17;
                                                                                                                                                                                                                                                        var35_36 = var16_16;
                                                                                                                                                                                                                                                        var6_6 = var19_19;
                                                                                                                                                                                                                                                        var20_20.Q1((Fragment)var17_17, (Fragment)var16_16, (boolean)var34_35, (String)var23_24, (Boolean)var19_19);
                                                                                                                                                                                                                                                        ** GOTO lbl267
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    var30_31 = "/orders";
                                                                                                                                                                                                                                                    var37_38 = var22_23.contains((CharSequence)var30_31);
                                                                                                                                                                                                                                                    var40_41 = var32_33;
                                                                                                                                                                                                                                                    var32_33 = "MyAccount Deeplink Failed";
                                                                                                                                                                                                                                                    if (var37_38 == 0) break block144;
                                                                                                                                                                                                                                                    if (var28_29 != 0) ** GOTO lbl267
                                                                                                                                                                                                                                                    var16_16 = var1_1 /* !! */ .getApplication();
                                                                                                                                                                                                                                                    var20_20 = new jo_2((Context)var16_16);
                                                                                                                                                                                                                                                    var47_49 = var17_17 instanceof BaseActivity;
                                                                                                                                                                                                                                                    if (var47_49 == 0) break block145;
                                                                                                                                                                                                                                                    var20_20 = var17_17;
                                                                                                                                                                                                                                                    var20_20 = (BaseActivity)var17_17;
                                                                                                                                                                                                                                                    var50_58 = 10;
                                                                                                                                                                                                                                                    var48_51 = false;
                                                                                                                                                                                                                                                    var17_17 = null;
                                                                                                                                                                                                                                                    var20_20.C2(var50_58, null, null, null);
                                                                                                                                                                                                                                                    ** GOTO lbl267
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                var50_58 = 0;
                                                                                                                                                                                                                                                var20_20 = new Object[]{};
                                                                                                                                                                                                                                                var16_16 = yn3_0.a;
                                                                                                                                                                                                                                                var16_16.k((String)var32_33, (Object[])var20_20);
                                                                                                                                                                                                                                                ** GOTO lbl267
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            var30_31 = "/order/";
                                                                                                                                                                                                                                            var37_38 = var22_23.contains((CharSequence)var30_31);
                                                                                                                                                                                                                                            if (var37_38 != 0 || (var37_38 = var22_23.contains((CharSequence)(var30_31 = "/order-details"))) != 0 || (var37_38 = var22_23.contains((CharSequence)(var30_31 = "/rcc"))) != 0 || (var37_38 = var22_23.contains((CharSequence)(var30_31 = "/odp"))) != 0) {
                                                                                                                                                                                                                                                var21_22 = this;
                                                                                                                                                                                                                                                if (var28_29 != 0) return;
                                                                                                                                                                                                                                                var20_20 = new og2_2((Activity)var17_17);
                                                                                                                                                                                                                                                var20_20.c((String)var22_23);
                                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            var30_31 = "/contactus";
                                                                                                                                                                                                                                            var37_38 = var22_23.contains((CharSequence)var30_31);
                                                                                                                                                                                                                                            if (var37_38 == 0) break block146;
                                                                                                                                                                                                                                            if (var28_29 != 0) ** GOTO lbl267
                                                                                                                                                                                                                                            var16_16 = var1_1 /* !! */ .getApplication();
                                                                                                                                                                                                                                            var20_20 = new jo_2((Context)var16_16);
                                                                                                                                                                                                                                            var47_49 = var17_17 instanceof BaseActivity;
                                                                                                                                                                                                                                            if (var47_49 == 0) break block147;
                                                                                                                                                                                                                                            var20_20 = var17_17;
                                                                                                                                                                                                                                            var20_20 = (BaseActivity)var17_17;
                                                                                                                                                                                                                                            var50_58 = 11;
                                                                                                                                                                                                                                            var48_52 = false;
                                                                                                                                                                                                                                            var17_17 = null;
                                                                                                                                                                                                                                            var20_20.C2(var50_58, null, null, null);
                                                                                                                                                                                                                                            ** GOTO lbl267
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        var50_58 = 0;
                                                                                                                                                                                                                                        var20_20 = new Object[]{};
                                                                                                                                                                                                                                        var16_16 = yn3_0.a;
                                                                                                                                                                                                                                        var16_16.k((String)var32_33, (Object[])var20_20);
                                                                                                                                                                                                                                        ** GOTO lbl267
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    var32_33 = "selfcare";
                                                                                                                                                                                                                                    var58_66 = var22_23.contains((CharSequence)var32_33);
                                                                                                                                                                                                                                    if (!var58_66) break block148;
                                                                                                                                                                                                                                    if (var28_29 != 0) ** GOTO lbl267
                                                                                                                                                                                                                                    var16_16 = var1_1 /* !! */ .getApplication();
                                                                                                                                                                                                                                    var20_20 = new jo_2((Context)var16_16);
                                                                                                                                                                                                                                    var47_49 = var17_17 instanceof BaseSplitActivity;
                                                                                                                                                                                                                                    if (var47_49 == 0) ** GOTO lbl267
                                                                                                                                                                                                                                    var20_20 = var17_17;
                                                                                                                                                                                                                                    var20_20 = (BaseSplitActivity)var17_17;
                                                                                                                                                                                                                                    var20_20.openCustomerCare();
                                                                                                                                                                                                                                    ** GOTO lbl267
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                var32_33 = "/help/termsAndCondition";
                                                                                                                                                                                                                                var58_66 = var22_23.contains((CharSequence)var32_33);
                                                                                                                                                                                                                                if (!var58_66) break block149;
                                                                                                                                                                                                                                if (var28_29 != 0) ** GOTO lbl267
                                                                                                                                                                                                                                var19_19 = var1_1 /* !! */ .getApplication();
                                                                                                                                                                                                                                var16_16 = new jo_2((Context)var19_19);
                                                                                                                                                                                                                                var50_58 = var17_17 instanceof AjioHomeActivity;
                                                                                                                                                                                                                                if (!var50_58) ** GOTO lbl267
                                                                                                                                                                                                                                Intrinsics.checkNotNull(var17_17, (String)var20_20);
                                                                                                                                                                                                                                var20_20 = var17_17;
                                                                                                                                                                                                                                var20_20 = (AjioHomeActivity)var17_17;
                                                                                                                                                                                                                                var16_16 = new Intent((Context)var20_20, TermsAndConditionActivity.class);
                                                                                                                                                                                                                                var17_17 = "url";
                                                                                                                                                                                                                                var16_16.putExtra((String)var17_17, (String)var18_18);
                                                                                                                                                                                                                                var20_20.startActivity((Intent)var16_16);
                                                                                                                                                                                                                                ** GOTO lbl267
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            var32_33 = "update-your-app";
                                                                                                                                                                                                                            var58_66 = var22_23.contains((CharSequence)var32_33);
                                                                                                                                                                                                                            if (!var58_66) break block150;
                                                                                                                                                                                                                            if (var28_29 != 0) ** GOTO lbl267
                                                                                                                                                                                                                            var16_16 = var1_1 /* !! */ .getApplication();
                                                                                                                                                                                                                            var20_20 = new jo_2((Context)var16_16);
                                                                                                                                                                                                                            var47_49 = var17_17 instanceof AjioHomeActivity;
                                                                                                                                                                                                                            if (var47_49 == 0) break block151;
                                                                                                                                                                                                                            var20_20 = var17_17;
                                                                                                                                                                                                                            var20_20 = (AjioHomeActivity)var17_17;
                                                                                                                                                                                                                            var16_16 = new jc0_0();
                                                                                                                                                                                                                            var17_17 = var20_20.T0;
                                                                                                                                                                                                                            var19_19 = Boolean.FALSE;
                                                                                                                                                                                                                            var34_35 = 1;
                                                                                                                                                                                                                            var23_24 = "COUPONSCREEN";
                                                                                                                                                                                                                            var1_1 /* !! */  = var20_20;
                                                                                                                                                                                                                            var2_2 = var17_17;
                                                                                                                                                                                                                            var35_36 = var16_16;
                                                                                                                                                                                                                            var6_6 = var19_19;
                                                                                                                                                                                                                            var20_20.Q1((Fragment)var17_17, (Fragment)var16_16, (boolean)var34_35, (String)var23_24, (Boolean)var19_19);
                                                                                                                                                                                                                            ** GOTO lbl267
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        var47_49 = var17_17 instanceof OrderConfirmationActivity;
                                                                                                                                                                                                                        if (var47_49 == 0) break block152;
                                                                                                                                                                                                                        var20_20 = kj0_1.g();
                                                                                                                                                                                                                        var16_16 = var17_17;
                                                                                                                                                                                                                        var16_16 = (OrderConfirmationActivity)var17_17;
                                                                                                                                                                                                                        var20_20.getClass();
                                                                                                                                                                                                                        kj0_1.k((OrderConfirmationActivity)var16_16, (String)var18_18);
                                                                                                                                                                                                                        ** GOTO lbl267
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    var50_58 = 0;
                                                                                                                                                                                                                    var20_20 = new Object[]{};
                                                                                                                                                                                                                    var16_16 = yn3_0.a;
                                                                                                                                                                                                                    var17_17 = "Coupon Promotion Link Failed";
                                                                                                                                                                                                                    var16_16.k((String)var17_17, (Object[])var20_20);
                                                                                                                                                                                                                    ** GOTO lbl267
                                                                                                                                                                                                                }
                                                                                                                                                                                                                var32_33 = "/my-rewards";
                                                                                                                                                                                                                var58_66 = var22_23.contains((CharSequence)var32_33);
                                                                                                                                                                                                                if (!var58_66) break block153;
                                                                                                                                                                                                                if (var28_29 != 0) ** GOTO lbl267
                                                                                                                                                                                                                var16_16 = var1_1 /* !! */ .getApplication();
                                                                                                                                                                                                                var20_20 = new jo_2((Context)var16_16);
                                                                                                                                                                                                                var47_49 = var17_17 instanceof BaseActivity;
                                                                                                                                                                                                                if (var47_49 == 0) break block154;
                                                                                                                                                                                                                var20_20 = "http";
                                                                                                                                                                                                                var47_49 = (int)var18_18.startsWith((String)var20_20);
                                                                                                                                                                                                                if (var47_49 == 0) {
                                                                                                                                                                                                                    var20_20 = new StringBuilder();
                                                                                                                                                                                                                    var16_16 = UrlHelper.getInstance().getBaseUrl();
                                                                                                                                                                                                                    var20_20.append((String)var16_16);
                                                                                                                                                                                                                    var20_20.append((String)var18_18);
                                                                                                                                                                                                                    var20_20 = var20_20.toString();
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    var20_20 = var18_18;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                var16_16 = UrlHelper.getInstance();
                                                                                                                                                                                                                var50_58 = (int)var16_16.isUATDomain();
                                                                                                                                                                                                                if (var50_58) {
                                                                                                                                                                                                                    var16_16 = UrlHelper.getInstance();
                                                                                                                                                                                                                    var50_58 = (int)var16_16.isUAT1Domain();
                                                                                                                                                                                                                    if (var50_58) {
                                                                                                                                                                                                                        var16_16 = "qa.services.ajio.com";
                                                                                                                                                                                                                        var20_20 = var20_20.replace((CharSequence)var51_59, (CharSequence)var16_16);
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        var16_16 = UrlHelper.getInstance();
                                                                                                                                                                                                                        var50_58 = (int)var16_16.isUAT2Domain();
                                                                                                                                                                                                                        if (var50_58) {
                                                                                                                                                                                                                            var16_16 = "uat2.services.ajio.com";
                                                                                                                                                                                                                            var20_20 = var20_20.replace((CharSequence)var51_59, (CharSequence)var16_16);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                var16_16 = var17_17;
                                                                                                                                                                                                                var16_16 = (BaseActivity)var17_17;
                                                                                                                                                                                                                var16_16.D2((String)var20_20);
                                                                                                                                                                                                                ** GOTO lbl267
                                                                                                                                                                                                            }
                                                                                                                                                                                                            var47_49 = var17_17 instanceof OrderConfirmationActivity;
                                                                                                                                                                                                            if (var47_49 == 0) break block155;
                                                                                                                                                                                                            var20_20 = kj0_1.g();
                                                                                                                                                                                                            var16_16 = var17_17;
                                                                                                                                                                                                            var16_16 = (OrderConfirmationActivity)var17_17;
                                                                                                                                                                                                            var20_20.getClass();
                                                                                                                                                                                                            kj0_1.k((OrderConfirmationActivity)var16_16, (String)var18_18);
                                                                                                                                                                                                            ** GOTO lbl267
                                                                                                                                                                                                        }
                                                                                                                                                                                                        var50_58 = 0;
                                                                                                                                                                                                        var20_20 = new Object[]{};
                                                                                                                                                                                                        var16_16 = yn3_0.a;
                                                                                                                                                                                                        var17_17 = "MyRewards Deeplink Failed";
                                                                                                                                                                                                        var16_16.k((String)var17_17, (Object[])var20_20);
                                                                                                                                                                                                        ** GOTO lbl267
                                                                                                                                                                                                    }
                                                                                                                                                                                                    var51_59 = "/ajio-wallet";
                                                                                                                                                                                                    var25_26 = (int)var22_23.contains((CharSequence)var51_59);
                                                                                                                                                                                                    if (!var25_26) break block156;
                                                                                                                                                                                                    if (var28_29 != 0) ** GOTO lbl267
                                                                                                                                                                                                    Intrinsics.checkNotNullParameter(var17_17, (String)var29_30);
                                                                                                                                                                                                    var19_19 = var1_1 /* !! */ .getApplication();
                                                                                                                                                                                                    var16_16 = new jo_2((Context)var19_19);
                                                                                                                                                                                                    Intrinsics.checkNotNullParameter(var18_18, (String)var21_22);
                                                                                                                                                                                                    var50_58 = var17_17 instanceof AjioHomeActivity;
                                                                                                                                                                                                    if (!var50_58) break block157;
                                                                                                                                                                                                    Intrinsics.checkNotNull(var17_17, (String)var20_20);
                                                                                                                                                                                                    var20_20 = var17_17;
                                                                                                                                                                                                    var20_20 = (AjioHomeActivity)var17_17;
                                                                                                                                                                                                    var50_58 = 12;
                                                                                                                                                                                                    var48_53 = false;
                                                                                                                                                                                                    var17_17 = null;
                                                                                                                                                                                                    var20_20.C2(var50_58, null, null, null);
                                                                                                                                                                                                    ** GOTO lbl267
                                                                                                                                                                                                }
                                                                                                                                                                                                var47_49 = var17_17 instanceof OrderConfirmationActivity;
                                                                                                                                                                                                if (var47_49 == 0) ** GOTO lbl267
                                                                                                                                                                                                var20_20 = kj0_1.g();
                                                                                                                                                                                                Intrinsics.checkNotNull(var17_17, "null cannot be cast to non-null type com.ril.ajio.payment.activity.OrderConfirmationActivity");
                                                                                                                                                                                                var16_16 = var17_17;
                                                                                                                                                                                                var16_16 = (OrderConfirmationActivity)var17_17;
                                                                                                                                                                                                var20_20.getClass();
                                                                                                                                                                                                kj0_1.k((OrderConfirmationActivity)var16_16, (String)var18_18);
                                                                                                                                                                                                ** GOTO lbl267
                                                                                                                                                                                            }
                                                                                                                                                                                            var21_22 = "/refer-and-earn";
                                                                                                                                                                                            var33_34 = var22_23.contains((CharSequence)var21_22);
                                                                                                                                                                                            if (!var33_34) break block158;
                                                                                                                                                                                            if (var28_29 == 0) {
                                                                                                                                                                                                var20_20 = new kg2_0((Activity)var17_17);
                                                                                                                                                                                                var20_20.b((String)var18_18);
                                                                                                                                                                                            }
                                                                                                                                                                                            ** GOTO lbl267
                                                                                                                                                                                        }
                                                                                                                                                                                        var21_22 = "/my-account";
                                                                                                                                                                                        var33_34 = var22_23.contains((CharSequence)var21_22);
                                                                                                                                                                                        var51_59 = "MyAccount Link Failed";
                                                                                                                                                                                        if (!var33_34) break block159;
                                                                                                                                                                                        if (var28_29 != 0) ** GOTO lbl267
                                                                                                                                                                                        var16_16 = var1_1 /* !! */ .getApplication();
                                                                                                                                                                                        var20_20 = new jo_2((Context)var16_16);
                                                                                                                                                                                        var47_49 = var17_17 instanceof AjioHomeActivity;
                                                                                                                                                                                        if (var47_49 == 0) break block160;
                                                                                                                                                                                        var20_20 = var17_17;
                                                                                                                                                                                        var20_20 = (AjioHomeActivity)var17_17;
                                                                                                                                                                                        bz1_2.Companion.getClass();
                                                                                                                                                                                        var50_58 = 0;
                                                                                                                                                                                        var16_16 = BZ1$a.a(false);
                                                                                                                                                                                        if (var19_19 != null) {
                                                                                                                                                                                            var16_16.setArguments((Bundle)var19_19);
                                                                                                                                                                                        }
                                                                                                                                                                                        var17_17 = var20_20.T0;
                                                                                                                                                                                        var19_19 = Boolean.FALSE;
                                                                                                                                                                                        var34_35 = 1;
                                                                                                                                                                                        var23_24 = "BZ1";
                                                                                                                                                                                        var1_1 /* !! */  = var20_20;
                                                                                                                                                                                        var2_2 = var17_17;
                                                                                                                                                                                        var35_36 = var16_16;
                                                                                                                                                                                        var6_6 = var19_19;
                                                                                                                                                                                        var20_20.Q1((Fragment)var17_17, (Fragment)var16_16, (boolean)var34_35, (String)var23_24, (Boolean)var19_19);
                                                                                                                                                                                        ** GOTO lbl267
                                                                                                                                                                                    }
                                                                                                                                                                                    var50_58 = 0;
                                                                                                                                                                                    var20_20 = new Object[]{};
                                                                                                                                                                                    var16_16 = yn3_0.a;
                                                                                                                                                                                    var16_16.k((String)var51_59, (Object[])var20_20);
                                                                                                                                                                                    ** GOTO lbl267
                                                                                                                                                                                }
                                                                                                                                                                                var21_22 = "/categories/new";
                                                                                                                                                                                var33_34 = var22_23.contains((CharSequence)var21_22);
                                                                                                                                                                                if (!var33_34) break block161;
                                                                                                                                                                                if (var28_29 == 0) {
                                                                                                                                                                                    var20_20 = new zj0_0((Activity)var17_17);
                                                                                                                                                                                    var16_16 = Boolean.TRUE;
                                                                                                                                                                                    var20_20.b((Bundle)var19_19, (Boolean)var16_16);
                                                                                                                                                                                }
                                                                                                                                                                                ** GOTO lbl267
                                                                                                                                                                            }
                                                                                                                                                                            var21_22 = "/categories";
                                                                                                                                                                            var33_34 = var22_23.contains((CharSequence)var21_22);
                                                                                                                                                                            if (!var33_34) break block162;
                                                                                                                                                                            if (var28_29 == 0) {
                                                                                                                                                                                var20_20 = new zj0_0((Activity)var17_17);
                                                                                                                                                                                var16_16 = Boolean.FALSE;
                                                                                                                                                                                var20_20.b((Bundle)var19_19, (Boolean)var16_16);
                                                                                                                                                                            }
                                                                                                                                                                            ** GOTO lbl267
                                                                                                                                                                        }
                                                                                                                                                                        var21_22 = "/wishlist";
                                                                                                                                                                        var33_34 = var22_23.contains((CharSequence)var21_22);
                                                                                                                                                                        if (!var33_34) break block163;
                                                                                                                                                                        if (var28_29 != 0) ** GOTO lbl267
                                                                                                                                                                        var16_16 = var1_1 /* !! */ .getApplication();
                                                                                                                                                                        var20_20 = new jo_2((Context)var16_16);
                                                                                                                                                                        var47_49 = var17_17 instanceof AjioHomeActivity;
                                                                                                                                                                        if (var47_49 == 0) break block164;
                                                                                                                                                                        var20_20 = var17_17;
                                                                                                                                                                        var20_20 = (AjioHomeActivity)var17_17;
                                                                                                                                                                        var16_16 = var20_20.P2();
                                                                                                                                                                        var50_58 = (int)var16_16.b();
                                                                                                                                                                        if (!var50_58) break block165;
                                                                                                                                                                        oy1_1.Companion.getClass();
                                                                                                                                                                        var16_16 = new oy1_1();
                                                                                                                                                                        var17_17 = new Bundle();
                                                                                                                                                                        var17_17.putBoolean("FROM_CART", true);
                                                                                                                                                                        var16_16.setArguments((Bundle)var17_17);
                                                                                                                                                                        var17_17 = var20_20.T0;
                                                                                                                                                                        var19_19 = Boolean.FALSE;
                                                                                                                                                                        var34_35 = 1;
                                                                                                                                                                        var23_24 = "CLOSET";
                                                                                                                                                                        var1_1 /* !! */  = var20_20;
                                                                                                                                                                        var2_2 = var17_17;
                                                                                                                                                                        var35_36 = var16_16;
                                                                                                                                                                        var6_6 = var19_19;
                                                                                                                                                                        var20_20.Q1((Fragment)var17_17, (Fragment)var16_16, (boolean)var34_35, (String)var23_24, (Boolean)var19_19);
                                                                                                                                                                        ** GOTO lbl267
                                                                                                                                                                    }
                                                                                                                                                                    var16_16 = "source - closet";
                                                                                                                                                                    var48_54 = 55;
                                                                                                                                                                    var20_20.z0(var48_54, (String)var16_16);
                                                                                                                                                                    ** GOTO lbl267
                                                                                                                                                                }
                                                                                                                                                                var50_58 = 0;
                                                                                                                                                                var20_20 = new Object[]{};
                                                                                                                                                                var16_16 = yn3_0.a;
                                                                                                                                                                var16_16.k((String)var51_59, (Object[])var20_20);
                                                                                                                                                                ** GOTO lbl267
                                                                                                                                                            }
                                                                                                                                                            var21_22 = "/ajioplaystore";
                                                                                                                                                            var33_34 = var22_23.contains((CharSequence)var21_22);
                                                                                                                                                            if (!var33_34) break block166;
                                                                                                                                                            if (var28_29 == 0) {
                                                                                                                                                                mz3_0.I((Context)var1_1 /* !! */ );
                                                                                                                                                            }
                                                                                                                                                            ** GOTO lbl267
                                                                                                                                                        }
                                                                                                                                                        var33_34 = h40_0.b1();
                                                                                                                                                        if (!var33_34 || !(var33_34 = var18_18.contains((CharSequence)(var21_22 = "ajiogram.ajio.com"))) && !(var33_34 = var18_18.contains((CharSequence)(var21_22 = "ajiogram"))) || (var33_34 = az3_0.f((String)var2_2))) break block167;
                                                                                                                                                        if (var28_29 == 0) {
                                                                                                                                                            s20.a = true;
                                                                                                                                                            var20_20 = new zj0_0((Activity)var17_17);
                                                                                                                                                            var50_58 = (int)var26_27.booleanValue();
                                                                                                                                                            var20_20.b((Bundle)var19_19, (String)var22_23, (String)var18_18, (boolean)var50_58);
                                                                                                                                                        }
                                                                                                                                                        ** GOTO lbl267
                                                                                                                                                    }
                                                                                                                                                    var21_22 = cp_1.Companion;
                                                                                                                                                    var21_22.getClass();
                                                                                                                                                    var51_59 = cp$a.e();
                                                                                                                                                    var51_59.getClass();
                                                                                                                                                    var25_26 = (int)cp_1.H(var31_32);
                                                                                                                                                    var31_32 = "search_landing_experiment";
                                                                                                                                                    var32_33 = "/shop/";
                                                                                                                                                    var26_27 = "";
                                                                                                                                                    if (!var25_26) break block168;
                                                                                                                                                    var21_22.getClass();
                                                                                                                                                    cp$a.e().getClass();
                                                                                                                                                    var21_22 = var44_45 /* !! */ ;
                                                                                                                                                    var33_34 = cp_1.G(var44_45 /* !! */ , (String)var16_16);
                                                                                                                                                    if (!var33_34) break block168;
                                                                                                                                                    if (var28_29 != 0) ** GOTO lbl267
                                                                                                                                                    var62_72 = TextUtils.isEmpty((CharSequence)var16_16);
                                                                                                                                                    if (!var62_72 && (var62_72 = kj0_1.j((Context)var17_17, (String)var16_16))) break block169;
                                                                                                                                                    var51_59 = var10_10;
                                                                                                                                                    var20_20 = new jq_2((Activity)var17_17);
                                                                                                                                                    var50_58 = var13_13.booleanValue();
                                                                                                                                                    var17_17 = var20_20;
                                                                                                                                                    var19_19 = var4_4;
                                                                                                                                                    var34_35 = var5_5;
                                                                                                                                                    var23_24 = var26_27;
                                                                                                                                                    var24_25 = var41_42;
                                                                                                                                                    var21_22 = var10_10;
                                                                                                                                                    var25_26 = var50_58;
                                                                                                                                                    var18_18 = var2_2;
                                                                                                                                                    var20_20.b((Fragment)var4_4, var5_5, (String)var26_27, var41_42, (String)var10_10, (boolean)var50_58, (String)var2_2);
                                                                                                                                                    ** GOTO lbl267
                                                                                                                                                }
                                                                                                                                                var21_22 = var9_9 /* !! */ ;
                                                                                                                                                var62_72 = var16_16.equals(var9_9 /* !! */ );
                                                                                                                                                if (var62_72) break block170;
                                                                                                                                                var19_19 = Locale.ENGLISH;
                                                                                                                                                var62_72 = (var19_19 = var16_16.toLowerCase((Locale)var19_19)).startsWith((String)var9_9 /* !! */ );
                                                                                                                                                if (var62_72) break block170;
                                                                                                                                                var23_24 = var32_33.concat((String)var16_16);
                                                                                                                                                var17_17 = var20_20 = new hd3_2((Activity)var17_17);
                                                                                                                                                var19_19 = var4_4;
                                                                                                                                                var34_35 = var5_5;
                                                                                                                                                var24_25 = var41_42;
                                                                                                                                                var21_22 = var10_10;
                                                                                                                                                var51_59 = var2_2;
                                                                                                                                                var20_20.b((Fragment)var4_4, var5_5, (String)var23_24, var41_42, (String)var10_10, (String)var2_2);
                                                                                                                                                ** GOTO lbl267
                                                                                                                                            }
                                                                                                                                            var19_19 = var1_1 /* !! */ .getApplication();
                                                                                                                                            var16_16 = new jo_2((Context)var19_19);
                                                                                                                                            var50_58 = var17_17 instanceof AjioHomeActivity;
                                                                                                                                            if (!var50_58) ** GOTO lbl267
                                                                                                                                            Intrinsics.checkNotNull(var17_17, (String)var20_20);
                                                                                                                                            var20_20 = var17_17;
                                                                                                                                            var20_20 = (AjioHomeActivity)var17_17;
                                                                                                                                            var16_16 = new Bundle();
                                                                                                                                            var51_59 = var10_10;
                                                                                                                                            if (var10_10 != null && (var48_55 = var10_10.length()) != 0) {
                                                                                                                                                var16_16.putString(var31_32, (String)var10_10);
                                                                                                                                            }
                                                                                                                                            q9_0.Companion.getClass();
                                                                                                                                            var16_16 = q9$a.b((Bundle)var16_16, (String)var26_27);
                                                                                                                                            var17_17 = var20_20.T0;
                                                                                                                                            var62_72 = true;
                                                                                                                                            j3$a.a((j3_0)var20_20, (Fragment)var17_17, (Fragment)var16_16, var62_72, (String)var26_27);
                                                                                                                                            ** GOTO lbl267
                                                                                                                                        }
                                                                                                                                        var21_22 = var9_9 /* !! */ ;
                                                                                                                                        var51_59 = var10_10;
                                                                                                                                        var30_31 = "/sharedcloset";
                                                                                                                                        var37_38 = var22_23.contains((CharSequence)var30_31);
                                                                                                                                        if (var37_38 == 0) break block171;
                                                                                                                                        if (var28_29 != 0) ** GOTO lbl267
                                                                                                                                        var59_67.getClass();
                                                                                                                                        var20_20 = z40$a.a((Context)var1_1 /* !! */ ).a();
                                                                                                                                        var16_16 = "android_closet_share";
                                                                                                                                        var47_49 = (int)var20_20.a((String)var16_16);
                                                                                                                                        if (var47_49 == 0) break block172;
                                                                                                                                        var20_20 = new C23((Activity)var17_17);
                                                                                                                                        var16_16 = var6_6;
                                                                                                                                        var20_20.b((String)var22_23, (String)var6_6);
                                                                                                                                        ** GOTO lbl267
                                                                                                                                    }
                                                                                                                                    var16_16 = var1_1 /* !! */ .getApplication();
                                                                                                                                    var20_20 = new jo_2((Context)var16_16);
                                                                                                                                    var47_49 = var17_17 instanceof BaseActivity;
                                                                                                                                    if (var47_49 == 0) break block173;
                                                                                                                                    Intrinsics.checkNotNull(var17_17, (String)var52_60);
                                                                                                                                    var20_20 = var17_17;
                                                                                                                                    var20_20 = (BaseActivity)var17_17;
                                                                                                                                    var50_58 = 0;
                                                                                                                                    var16_16 = null;
                                                                                                                                    var20_20.U1(0);
                                                                                                                                    ** GOTO lbl267
                                                                                                                                }
                                                                                                                                var50_58 = 0;
                                                                                                                                var20_20 = yn3_0.a;
                                                                                                                                var16_16 = new Object[]{};
                                                                                                                                var20_20.d((String)var23_24, (Object[])var16_16);
                                                                                                                                ** GOTO lbl267
                                                                                                                            }
                                                                                                                            var23_24 = "/brands";
                                                                                                                            var46_47 = var22_23.contains((CharSequence)var23_24);
                                                                                                                            if (!var46_47) break block174;
                                                                                                                            if (var28_29 != 0) ** GOTO lbl267
                                                                                                                            var19_19 = var1_1 /* !! */ .getApplication();
                                                                                                                            var16_16 = new jo_2((Context)var19_19);
                                                                                                                            var50_58 = var17_17 instanceof AjioHomeActivity;
                                                                                                                            if (!var50_58) break block175;
                                                                                                                            Intrinsics.checkNotNull(var17_17, (String)var20_20);
                                                                                                                            var20_20 = var17_17;
                                                                                                                            var20_20 = (AjioHomeActivity)var17_17;
                                                                                                                            var16_16 = var20_20.T0;
                                                                                                                            gd1_2.Companion.getClass();
                                                                                                                            var17_17 = new gd1_2();
                                                                                                                            var19_19 = new Bundle();
                                                                                                                            var22_23 = "catalogType";
                                                                                                                            var23_24 = "BRAND_PAGE";
                                                                                                                            var19_19.putString((String)var22_23, (String)var23_24);
                                                                                                                            var17_17.setArguments((Bundle)var19_19);
                                                                                                                            var19_19 = "CLOSET";
                                                                                                                            var34_35 = 1;
                                                                                                                            j3$a.a((j3_0)var20_20, (Fragment)var16_16, (Fragment)var17_17, (boolean)var34_35, (String)var19_19);
                                                                                                                            ** GOTO lbl267
                                                                                                                        }
                                                                                                                        var20_20 = yn3_0.a;
                                                                                                                        var50_58 = 0;
                                                                                                                        var16_16 = new Object[]{};
                                                                                                                        var17_17 = "Brands Link Failed";
                                                                                                                        var20_20.k((String)var17_17, (Object[])var16_16);
                                                                                                                        ** GOTO lbl267
                                                                                                                    }
                                                                                                                    var23_24 = "/games";
                                                                                                                    var46_47 = var22_23.contains((CharSequence)var23_24);
                                                                                                                    if (!var46_47) break block176;
                                                                                                                    if (var28_29 == 0) {
                                                                                                                        var59_67.getClass();
                                                                                                                        var20_20 = z40$a.a((Context)var1_1 /* !! */ ).a();
                                                                                                                        var47_49 = (int)var20_20.a("enable_gamification");
                                                                                                                        var16_16 = new iy0_2((Activity)var17_17);
                                                                                                                        var16_16.b((String)var18_18, (boolean)var47_49);
                                                                                                                    }
                                                                                                                    ** GOTO lbl267
                                                                                                                }
                                                                                                                var23_24 = "/jio-engage";
                                                                                                                var46_47 = var22_23.contains((CharSequence)var23_24);
                                                                                                                if (var46_47) ** GOTO lbl267
                                                                                                                var23_24 = "/gamezone";
                                                                                                                var46_47 = var22_23.contains((CharSequence)var23_24);
                                                                                                                var52_60 = "";
                                                                                                                var30_31 = "enable_gamezone";
                                                                                                                if (!var46_47) break block177;
                                                                                                                if (var28_29 == 0) {
                                                                                                                    var59_67.getClass();
                                                                                                                    var20_20 = z40$a.a((Context)var1_1 /* !! */ ).a();
                                                                                                                    var47_49 = var20_20.a((String)var30_31);
                                                                                                                    var50_58 = TextUtils.isEmpty((CharSequence)var11_11);
                                                                                                                    if (!var50_58) {
                                                                                                                        var16_16 = "=";
                                                                                                                        var19_19 = var11_11;
                                                                                                                        var34_35 = (int)var11_11.contains((CharSequence)var16_16);
                                                                                                                        if (var34_35 != 0) {
                                                                                                                            var16_16 = var11_11.split((String)var16_16);
                                                                                                                            var62_73 = 1;
                                                                                                                            var52_60 = var16_16[var62_73];
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var16_16 = new ny0_1((Activity)var17_17);
                                                                                                                    var16_16.b((String)var18_18, (String)var52_60, (boolean)var47_49);
                                                                                                                }
                                                                                                                ** GOTO lbl267
                                                                                                            }
                                                                                                            var23_24 = "/couponbonanza";
                                                                                                            var46_47 = var22_23.contains((CharSequence)var23_24);
                                                                                                            if (!var46_47) break block178;
                                                                                                            if (var17_17 != null && (var47_49 = var17_17 instanceof SplashScreenActivity) == 0) {
                                                                                                                var20_20 = at2_1.a;
                                                                                                                var40_41.getClass();
                                                                                                                var16_16 = AJIOApplication$a.a();
                                                                                                                var19_19 = CouponBonanzaActivity.class;
                                                                                                                var20_20 = new Intent((Context)var16_16, (Class)var19_19);
                                                                                                                ((Activity)var17_17).startActivity((Intent)var20_20);
                                                                                                            }
                                                                                                            ** GOTO lbl267
                                                                                                        }
                                                                                                        var23_24 = "/gamezone/";
                                                                                                        var46_47 = var22_23.contains((CharSequence)var23_24);
                                                                                                        if (!var46_47) break block179;
                                                                                                        var59_67.getClass();
                                                                                                        var20_20 = z40$a.a((Context)var1_1 /* !! */ ).a();
                                                                                                        var47_49 = var20_20.a((String)var30_31);
                                                                                                        var16_16 = new ny0_1((Activity)var17_17);
                                                                                                        var16_16.b((String)var22_23, (String)var52_60, (boolean)var47_49);
                                                                                                        ** GOTO lbl267
                                                                                                    }
                                                                                                    var23_24 = var26_27.toLowerCase();
                                                                                                    var52_60 = var8_8 /* !! */ ;
                                                                                                    var46_47 = var23_24.contains((CharSequence)var8_8 /* !! */ );
                                                                                                    if (!var46_47) break block180;
                                                                                                    var20_20 = new kz1_1((Activity)var17_17);
                                                                                                    var46_47 = false;
                                                                                                    var23_24 = null;
                                                                                                    var20_20.b(null);
                                                                                                    ** GOTO lbl267
                                                                                                }
                                                                                                var46_47 = false;
                                                                                                var23_24 = null;
                                                                                                var52_60 = "/top-shopper";
                                                                                                var24_25 = (int)var22_23.contains((CharSequence)var52_60);
                                                                                                if (var24_25 == 0) break block181;
                                                                                                if (var28_29 == 0) {
                                                                                                    var20_20 = new Io3((Activity)var17_17);
                                                                                                    var20_20.b((String)var18_18);
                                                                                                }
                                                                                                ** GOTO lbl267
                                                                                            }
                                                                                            var52_60 = "dresstool";
                                                                                            var24_25 = (int)var22_23.contains((CharSequence)var52_60);
                                                                                            if (var24_25 == 0) break block182;
                                                                                            Intrinsics.checkNotNullParameter(var17_17, (String)var29_30);
                                                                                            var16_16 = var1_1 /* !! */ .getApplication();
                                                                                            var20_20 = new jo_2((Context)var16_16);
                                                                                            var47_49 = var17_17 instanceof AjioHomeActivity;
                                                                                            if (var47_49 != 0) {
                                                                                                var30_31 = var17_17;
                                                                                                var30_31 = (AjioHomeActivity)var17_17;
                                                                                            } else {
                                                                                                var37_38 = 0;
                                                                                                var30_31 = null;
                                                                                            }
                                                                                            if (var30_31 != null) {
                                                                                                tv0_2.Companion.getClass();
                                                                                                var20_20 = new tv0_2();
                                                                                                var20_20.setArguments((Bundle)var19_19);
                                                                                                var16_16 = var30_31.getSupportFragmentManager();
                                                                                                var17_17 = "DressToolStepFragment";
                                                                                                var20_20.show((FragmentManager)var16_16, (String)var17_17);
                                                                                            }
                                                                                            ** GOTO lbl267
                                                                                        }
                                                                                        var23_24 = bj0_1.e((String)var22_23);
                                                                                        var52_60 = "isDynamicWidget=true";
                                                                                        var27_28 = var18_18.contains((CharSequence)var52_60);
                                                                                        var29_30 = "isCuratedWidget=true";
                                                                                        if (!var27_28 && !(var27_28 = var18_18.contains((CharSequence)(var26_27 = "/widget/"))) && !(var27_28 = var18_18.contains((CharSequence)var29_30))) break block183;
                                                                                        var21_22 = this;
                                                                                        if (var19_19 != null) break block184;
                                                                                        break block185;
                                                                                    }
                                                                                    var52_60 = "/shop/coupons-and-offers";
                                                                                    var27_28 = var23_24.equalsIgnoreCase((String)var52_60);
                                                                                    var29_30 = "/offers";
                                                                                    if (!var27_28 && !(var27_28 = var23_24.equalsIgnoreCase((String)var29_30))) break block186;
                                                                                    var21_22 = this;
                                                                                    if (var28_29 != 0) return;
                                                                                    var47_49 = var23_24.equalsIgnoreCase((String)var52_60);
                                                                                    if (var47_49 == 0) break block187;
                                                                                    break block188;
                                                                                }
                                                                                var46_47 = var22_23.contains((CharSequence)var32_33);
                                                                                if (!var46_47) break block189;
                                                                                if (var28_29 != 0) ** GOTO lbl267
                                                                                var19_19 = "/shop/luxe";
                                                                                var62_74 = var22_23.startsWith((String)var19_19);
                                                                                if (var62_74 || (var62_74 = var22_23.startsWith((String)(var19_19 = "/luxe")))) break block190;
                                                                                var19_19 = bj0_1.e((String)var22_23);
                                                                                var23_24 = "shop";
                                                                                var19_19 = bj0_1.c((String)var19_19, (String)var23_24);
                                                                                var46_47 = TextUtils.isEmpty((CharSequence)var16_16);
                                                                                if (var46_47) {
                                                                                    var16_16 = kj0_1.h((String)var22_23);
                                                                                }
                                                                                var23_24 = kp1_0.c((String)var32_33, (String)var19_19);
                                                                                var34_35 = TextUtils.isEmpty((CharSequence)var16_16);
                                                                                if (var34_35 != 0 || (var34_35 = kj0_1.j((Context)var17_17, (String)var16_16)) == 0) break block191;
                                                                                var50_58 = var16_16.equals(var21_22);
                                                                                if (var50_58) break block192;
                                                                                var16_16 = Locale.ENGLISH;
                                                                                var50_58 = (int)(var16_16 = var19_19.toLowerCase((Locale)var16_16)).startsWith((String)var21_22);
                                                                                if (var50_58) break block192;
                                                                                var20_20 = new hd3_2((Activity)var17_17);
                                                                                var16_16 = "";
                                                                                var17_17 = var20_20;
                                                                                var19_19 = var4_4;
                                                                                var34_35 = var5_5;
                                                                                var24_25 = var41_42;
                                                                                var21_22 = var10_10;
                                                                                var51_59 = var16_16;
                                                                                var20_20.b((Fragment)var4_4, var5_5, (String)var23_24, var41_42, (String)var10_10, (String)var16_16);
                                                                                ** GOTO lbl267
                                                                            }
                                                                            var19_19 = var1_1 /* !! */ .getApplication();
                                                                            var16_16 = new jo_2((Context)var19_19);
                                                                            var50_58 = var17_17 instanceof AjioHomeActivity;
                                                                            if (!var50_58) ** GOTO lbl267
                                                                            Intrinsics.checkNotNull(var17_17, (String)var20_20);
                                                                            var20_20 = var17_17;
                                                                            var20_20 = (AjioHomeActivity)var17_17;
                                                                            var16_16 = new Bundle();
                                                                            if (var51_59 != null && (var48_56 = var10_10.length()) != 0) {
                                                                                var16_16.putString(var31_32, (String)var51_59);
                                                                            }
                                                                            q9_0.Companion.getClass();
                                                                            var16_16 = q9$a.b((Bundle)var16_16, (String)var23_24);
                                                                            var17_17 = var20_20.T0;
                                                                            var62_74 = true;
                                                                            j3$a.a((j3_0)var20_20, (Fragment)var17_17, (Fragment)var16_16, var62_74, (String)var23_24);
                                                                            ** GOTO lbl267
                                                                        }
                                                                        var20_20 = new jq_2((Activity)var17_17);
                                                                        var50_58 = var13_13.booleanValue();
                                                                        var17_17 = var20_20;
                                                                        var19_19 = var4_4;
                                                                        var34_35 = var5_5;
                                                                        var24_25 = var41_42;
                                                                        var21_22 = var10_10;
                                                                        var25_26 = var50_58;
                                                                        var18_18 = var2_2;
                                                                        var20_20.b((Fragment)var4_4, var5_5, (String)var23_24, var41_42, (String)var10_10, (boolean)var50_58, (String)var2_2);
                                                                        ** GOTO lbl267
                                                                    }
                                                                    var19_19 = var1_1 /* !! */ .getApplication();
                                                                    var16_16 = new jo_2((Context)var19_19);
                                                                    var50_58 = var17_17 instanceof AjioHomeActivity;
                                                                    if (!var50_58) ** GOTO lbl267
                                                                    Intrinsics.checkNotNull(var17_17, (String)var20_20);
                                                                    var20_20 = var17_17;
                                                                    var20_20 = (AjioHomeActivity)var17_17;
                                                                    var16_16 = new Bundle();
                                                                    q9_0.Companion.getClass();
                                                                    var16_16 = q9$a.b((Bundle)var16_16, (String)var22_23);
                                                                    var17_17 = var20_20.T0;
                                                                    var62_74 = true;
                                                                    j3$a.a((j3_0)var20_20, (Fragment)var17_17, (Fragment)var16_16, var62_74, (String)var22_23);
                                                                    ** GOTO lbl267
                                                                }
                                                                var23_24 = var38_39;
                                                                var47_49 = (int)var22_23.contains(var38_39);
                                                                if (var47_49 != 0) {
                                                                    if (var28_29 == 0) ** break;
                                                                    ** continue;
                                                                    var20_20 = new Qj2((Activity)var17_17);
                                                                    var21_22 = this;
                                                                    var17_17 = this.a;
                                                                    var23_24 = "c";
                                                                    var1_1 /* !! */  = var20_20;
                                                                    var35_36 = var17_17;
                                                                    var4_4 = var19_19;
                                                                    var6_6 = var16_16;
                                                                    var8_8 /* !! */  = var12_12;
                                                                    var20_20.d(var41_42, (Bundle)var17_17, (Bundle)var19_19, (String)var22_23, (String)var16_16, (String)var23_24, var12_12);
                                                                    return;
                                                                }
                                                                var21_22 = this;
                                                                var23_24 = var14_14;
                                                                var47_49 = (int)var22_23.contains((CharSequence)var14_14);
                                                                if (var47_49 != 0) {
                                                                    if (var28_29 != 0) return;
                                                                    var20_20 = new Qj2((Activity)var17_17);
                                                                    var17_17 = this.a;
                                                                    var23_24 = "b";
                                                                    var1_1 /* !! */  = var20_20;
                                                                    var35_36 = var17_17;
                                                                    var4_4 = var19_19;
                                                                    var6_6 = var16_16;
                                                                    var8_8 /* !! */  = var12_12;
                                                                    var20_20.d(var41_42, (Bundle)var17_17, (Bundle)var19_19, (String)var22_23, (String)var16_16, (String)var23_24, var12_12);
                                                                    return;
                                                                }
                                                                var23_24 = var35_36;
                                                                var47_49 = (int)var22_23.contains((CharSequence)var35_36);
                                                                if (var47_49 != 0) {
                                                                    if (var28_29 != 0) return;
                                                                    var20_20 = new Qj2((Activity)var17_17);
                                                                    var17_17 = this.a;
                                                                    var23_24 = "s";
                                                                    var1_1 /* !! */  = var20_20;
                                                                    var35_36 = var17_17;
                                                                    var4_4 = var19_19;
                                                                    var6_6 = var16_16;
                                                                    var8_8 /* !! */  = var12_12;
                                                                    var20_20.d(var41_42, (Bundle)var17_17, (Bundle)var19_19, (String)var22_23, (String)var16_16, (String)var23_24, var12_12);
                                                                    return;
                                                                }
                                                                var20_20 = "/assured-gifts";
                                                                var47_49 = (int)var22_23.contains((CharSequence)var20_20);
                                                                if (var47_49 != 0) {
                                                                    var20_20 = new iy0_2((Activity)var17_17);
                                                                    var20_20.c();
                                                                    var50_58 = 1;
                                                                    var20_20.b((String)var22_23, (boolean)var50_58);
                                                                    return;
                                                                }
                                                                var20_20 = "/return-refund-policy";
                                                                var47_49 = (int)var22_23.contains((CharSequence)var20_20);
                                                                var16_16 = "/";
                                                                if (var47_49 == 0) break block193;
                                                                var47_49 = (int)TextUtils.isEmpty((CharSequence)var22_23);
                                                                if (var47_49 != 0) return;
                                                                var20_20 = bj0_1.e((String)var22_23);
                                                                var62_75 = var20_20.contains((CharSequence)(var19_19 = UrlHelper.getInstance().getBaseUrl()));
                                                                if (!var62_75) break block194;
                                                                var19_19 = UrlHelper.getInstance().getBaseUrl();
                                                                var62_75 = var20_20.equalsIgnoreCase((String)var19_19);
                                                                if (var62_75) break block195;
                                                                var19_19 = new StringBuilder();
                                                                var23_24 = UrlHelper.getInstance().getBaseUrl();
                                                                var19_19.append((String)var23_24);
                                                                var19_19.append((String)var16_16);
                                                                var16_16 = var19_19.toString();
                                                                var47_49 = (int)var20_20.equalsIgnoreCase((String)var16_16);
                                                                if (var47_49 == 0) break block194;
                                                            }
                                                            var20_20 = AnalyticsManager.getInstance().getGtmEvents();
                                                            var19_19 = var49_57;
                                                            var20_20.pushOpenScreenEvent(var49_57);
                                                            return;
                                                        }
                                                        at2_1.j((Context)var17_17, (String)var22_23);
                                                        return;
                                                    }
                                                    var19_19 = var49_57;
                                                    var20_20 = "/verify/";
                                                    var47_49 = (int)var22_23.contains((CharSequence)var20_20);
                                                    if (var47_49 != 0) {
                                                        if (var28_29 != 0) return;
                                                        var20_20 = kj0_1.f((String)var22_23);
                                                        var50_58 = 22;
                                                        CustomWebViewActivity.H2((Context)var17_17, var50_58, (String)var20_20);
                                                        return;
                                                    }
                                                    var20_20 = "/static-cms/";
                                                    var47_49 = (int)var22_23.contains((CharSequence)var20_20);
                                                    if (var47_49 != 0) {
                                                        if (var28_29 != 0) return;
                                                        var20_20 = kj0_1.f((String)var22_23);
                                                        var50_58 = 0;
                                                        var16_16 = null;
                                                        CustomWebViewActivity.H2((Context)var17_17, 0, (String)var20_20);
                                                        return;
                                                    }
                                                    var29_30 = var60_68;
                                                    var47_49 = (int)kj0_1.e((String)var22_23, var60_68);
                                                    if (var47_49 == 0) break block196;
                                                    var23_24 = var56_64;
                                                    Intrinsics.checkNotNullParameter(var17_17, (String)var56_64);
                                                    var16_16 = var1_1 /* !! */ .getApplication();
                                                    var20_20 = new jo_2((Context)var16_16);
                                                    var16_16 = Uri.parse((String)var2_2);
                                                    var19_19 = var57_65 /* !! */ ;
                                                    var20_20 = new Intent((String)var57_65 /* !! */ , (Uri)var16_16);
                                                    var16_16 = var54_62;
                                                    var20_20.addCategory((String)var54_62);
                                                    try {
                                                        var16_16 = var1_1 /* !! */ .getPackageManager();
                                                        var16_16 = var20_20.resolveActivity((PackageManager)var16_16);
                                                        if (var16_16 != null) {
                                                            ((Activity)var17_17).startActivity((Intent)var20_20);
                                                            return;
                                                        }
                                                    }
                                                    catch (ActivityNotFoundException v2) {
                                                        var19_19 = var53_61;
                                                        var50_58 = 0;
                                                        var16_16 = null;
                                                        break block125;
                                                    }
                                                    {
                                                        var20_20 = yn3_0.a;
                                                        var50_58 = 0;
                                                        var16_16 = null;
                                                    }
                                                    var17_17 = new Object[]{};
                                                    var19_19 = var53_61;
                                                }
lbl1309:
                                                // 3 sources

                                                while (true) {
                                                    var20_20 = yn3_0.a;
                                                    var16_16 = new Object[]{};
                                                    var20_20.a((String)var19_19, (Object[])var16_16);
                                                    return;
                                                }
                                                try {}
                                                catch (ActivityNotFoundException v3) {
                                                    ** GOTO lbl1309
                                                }
                                                break block197;
                                                catch (ActivityNotFoundException v4) {
                                                    var19_19 = var53_61;
                                                    ** continue;
                                                }
                                            }
                                            var20_20.a((String)var53_61, (Object[])var17_17);
                                            return;
                                        }
                                        if (var7_7 == false) return;
                                        var47_49 = (int)TextUtils.isEmpty((CharSequence)var22_23);
                                        if (var47_49 != 0) return;
                                        var20_20 = bj0_1.e((String)var22_23);
                                        var46_47 = var20_20.contains((CharSequence)(var23_24 = UrlHelper.getInstance().getBaseUrl()));
                                        if (!var46_47) break block198;
                                        var23_24 = UrlHelper.getInstance().getBaseUrl();
                                        var46_47 = var20_20.equalsIgnoreCase((String)var23_24);
                                        if (var46_47) break block199;
                                        var23_24 = new StringBuilder();
                                        var52_60 = UrlHelper.getInstance().getBaseUrl();
                                        var23_24.append((String)var52_60);
                                        var23_24.append((String)var16_16);
                                        var16_16 = var23_24.toString();
                                        var47_49 = (int)var20_20.equalsIgnoreCase((String)var16_16);
                                        if (var47_49 == 0) break block198;
                                    }
                                    AnalyticsManager.getInstance().getGtmEvents().pushOpenScreenEvent((String)var19_19);
                                    return;
                                }
                                at2_1.j((Context)var17_17, (String)var22_23);
                                return;
                            }
                            var47_49 = bj0_1.e((String)var22_23).indexOf((String)var52_60);
                            var20_20 = var22_23.substring(var47_49);
                            break block200;
                        }
                        var47_49 = bj0_1.e((String)var22_23).indexOf((String)var29_30);
                        var20_20 = var22_23.substring(var47_49);
                    }
                    var6_6 = this;
                    var8_8 /* !! */  = var4_4;
                    var10_10 = var20_20;
                    var11_11 = var16_16;
                    this.l((Activity)var1_1 /* !! */ , (Fragment)var4_4, var5_5, (String)var20_20, (String)var16_16, var41_42);
                    return;
                }
                var20_20 = new Bundle();
                break block201;
            }
            var20_20 = var19_19;
        }
        var62_76 = var18_18.contains((CharSequence)var52_60);
        if (var62_76) {
            kj0_1.b((Bundle)var20_20, (String)var18_18);
        }
        if (var62_76 = var18_18.contains((CharSequence)var29_30)) {
            kj0_1.b((Bundle)var20_20, (String)var18_18);
        }
        if (var28_29 != 0) return;
        var19_19 = new Qj2((Activity)var17_17);
        var17_17 = var21_22.a;
        var23_24 = "w";
        var1_1 /* !! */  = var19_19;
        var35_36 = var17_17;
        var4_4 = var20_20;
        var6_6 = var16_16;
        var8_8 /* !! */  = var12_12;
        var19_19.d(var41_42, (Bundle)var17_17, (Bundle)var20_20, (String)var22_23, (String)var16_16, (String)var23_24, var12_12);
    }

    public final void r(Activity activity, String string2, Bundle bundle) {
        Boolean bl2 = Boolean.FALSE;
        this.q(activity, string2, 0, null, 0, null, true, bundle, null, null, null, null, bl2, bl2, 0);
    }

    public final void s(Activity activity, String string2, Bundle bundle, Boolean bl2) {
        Boolean bl3 = Boolean.FALSE;
        this.q(activity, string2, 0, null, 0, null, true, bundle, null, null, null, null, bl3, bl2, 0);
    }

    public final void t(Activity activity, String string2, Fragment fragment, int n3) {
        Boolean bl2 = Boolean.FALSE;
        this.q(activity, string2, 1003, fragment, n3, null, true, null, null, null, null, null, bl2, bl2, 0);
    }

    public final void u(Activity activity, String string2, String string3, String string4, Bundle bundle) {
        Boolean bl2 = Boolean.FALSE;
        this.q(activity, string2, 0, null, 0, null, true, bundle, null, null, string3, string4, bl2, bl2, 0);
    }

    public final void v(Activity activity, String string2, String string3, boolean bl2, boolean bl3, String string4, int n3) {
        Boolean bl4 = Boolean.FALSE;
        this.q(activity, string2, 0, null, 0, string3, bl2, null, null, null, null, string4, bl4, bl4, n3);
    }

    public final void w(Activity activity, String string2) {
        this.v(activity, string2, null, true, false, null, 0);
    }
}

