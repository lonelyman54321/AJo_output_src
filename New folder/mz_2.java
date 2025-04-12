/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  org.json.JSONObject
 */
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.facebook.GraphRequest$d;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.login.activity.LoginActivityRevampNew;
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONObject;

/*
 * Renamed from MZ
 */
public final class mz_2
implements o60_0,
bx0_2,
GraphRequest$d {
    public final /* synthetic */ Object a;

    public /* synthetic */ mz_2(Object object) {
        this.a = object;
    }

    public void a(JSONObject object) {
        LoginActivityRevampNew loginActivityRevampNew = (LoginActivityRevampNew)this.a;
        Intrinsics.checkNotNullParameter(loginActivityRevampNew, "this$0");
        Object object2 = "Facebook error";
        if (object == null) {
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            String string2 = loginActivityRevampNew.A0;
            String string3 = "Error - Null object received from Facebook";
            ((GTMEvents)object).pushButtonTapEvent((String)object2, string3, string2);
            object = new py1_0(loginActivityRevampNew);
            loginActivityRevampNew.runOnUiThread((Runnable)object);
        } else {
            Object object3 = object.optString("email");
            String string4 = object.optString("name");
            String string5 = "id";
            object = object.optString(string5);
            Intrinsics.checkNotNull(object3);
            int n3 = ((String)object3).length();
            String string6 = "FACEBOOK_PROFILE_NAME";
            String string7 = "FACEBOOK_PROFILE_USERID";
            String string8 = "OK";
            String string9 = "Please Change to Reliance Network";
            String string10 = "ajio.com";
            boolean bl2 = true;
            if (n3 == 0) {
                boolean bl3;
                object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                string5 = loginActivityRevampNew.A0;
                String string11 = "Error - Email is Empty";
                ((GTMEvents)object3).pushButtonTapEvent((String)object2, string11, string5);
                Intrinsics.checkNotNull(string4);
                Intrinsics.checkNotNull(object);
                loginActivityRevampNew.stopLoader();
                object2 = loginActivityRevampNew.getAppPreferences();
                if (object != null) {
                    ((sw_0)object2).putPreference(string7, (String)object);
                } else {
                    object2.getClass();
                }
                object = loginActivityRevampNew.getAppPreferences();
                if (string4 != null) {
                    ((sw_0)object).putPreference(string6, string4);
                } else {
                    object.getClass();
                }
                object = UrlHelper.Companion.getInstance().getBaseUrl();
                int n4 = ((String)object).length();
                if (n4 > 0 && (bl3 = StringsKt.F((CharSequence)object, string10, false))) {
                    loginActivityRevampNew.G2(bl2, false);
                } else {
                    object = new AlertDialog.Builder((Context)loginActivityRevampNew);
                    object = object.setMessage((CharSequence)string9);
                    object2 = new hy1_0(loginActivityRevampNew);
                    object = object.setPositiveButton((CharSequence)string8, (DialogInterface.OnClickListener)object2).setCancelable(false).create();
                    object.show();
                }
            } else {
                boolean bl4;
                object2 = loginActivityRevampNew.A0;
                int n7 = b.i((String)object2, "Login", bl2);
                string5 = "Facebook button click - Success";
                if (n7 != 0) {
                    object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    String string12 = loginActivityRevampNew.A0;
                    String string13 = "Welcome to AJIO";
                    ((GTMEvents)object2).pushButtonTapEvent(string13, string5, string12);
                } else {
                    object2 = loginActivityRevampNew.A0;
                    String string14 = "Sign up";
                    n7 = b.i((String)object2, string14, bl2);
                    if (n7 != 0) {
                        object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        string14 = loginActivityRevampNew.A0;
                        String string15 = "New user registration screen";
                        ((GTMEvents)object2).pushButtonTapEvent(string15, string5, string14);
                    }
                }
                object2 = loginActivityRevampNew.getAppPreferences();
                if (string4 != null) {
                    ((sw_0)object2).putPreference(string6, string4);
                } else {
                    object2.getClass();
                }
                object2 = loginActivityRevampNew.getAppPreferences();
                string4 = "FACEBOOK_PROFILE_EMAIL";
                ((sw_0)object2).putPreference(string4, (String)object3);
                object2 = loginActivityRevampNew.getAppPreferences();
                if (object != null) {
                    ((sw_0)object2).putPreference(string7, (String)object);
                } else {
                    object2.getClass();
                }
                object = UrlHelper.Companion.getInstance().getBaseUrl();
                n7 = ((String)object).length();
                if (n7 > 0 && (bl4 = StringsKt.F((CharSequence)object, string10, false))) {
                    loginActivityRevampNew.G2(bl2, false);
                } else {
                    object = new AlertDialog.Builder((Context)loginActivityRevampNew);
                    object = object.setMessage((CharSequence)string9);
                    object2 = new qy1(loginActivityRevampNew);
                    object = object.setPositiveButton((CharSequence)string8, (DialogInterface.OnClickListener)object2).setCancelable(false).create();
                    object.show();
                }
            }
        }
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        return UserRepo.h((gy3)((Function1)this.a), object);
    }
}

