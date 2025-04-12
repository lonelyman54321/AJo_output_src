/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.graphics.ColorSpace
 *  org.json.JSONObject
 */
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.ColorSpace;
import com.facebook.GraphRequest$d;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.login.activity.LoginActivityRevamp;
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONObject;

/*
 * Renamed from aZ
 */
public final class az_0
implements js0_0,
kJ0$a,
GraphRequest$d {
    public final /* synthetic */ Object a;

    public /* synthetic */ az_0(Object object) {
        this.a = object;
    }

    public void a(JSONObject object) {
        LoginActivityRevamp loginActivityRevamp = (LoginActivityRevamp)this.a;
        Intrinsics.checkNotNullParameter(loginActivityRevamp, "this$0");
        Object object2 = "Facebook error";
        if (object == null) {
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            String string2 = loginActivityRevamp.z0;
            String string3 = "Error - Null object received from Facebook";
            ((GTMEvents)object).pushButtonTapEvent((String)object2, string3, string2);
            boolean bl2 = false;
            object2 = null;
            object = new rx1_0(loginActivityRevamp, 0);
            loginActivityRevamp.runOnUiThread((Runnable)object);
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
            boolean bl3 = true;
            if (n3 == 0) {
                boolean bl4;
                object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                string5 = loginActivityRevamp.z0;
                String string11 = "Error - Email is Empty";
                ((GTMEvents)object3).pushButtonTapEvent((String)object2, string11, string5);
                Intrinsics.checkNotNull(string4);
                Intrinsics.checkNotNull(object);
                loginActivityRevamp.stopLoader();
                object2 = loginActivityRevamp.getAppPreferences();
                if (object != null) {
                    ((sw_0)object2).putPreference(string7, (String)object);
                } else {
                    object2.getClass();
                }
                object = loginActivityRevamp.getAppPreferences();
                if (string4 != null) {
                    ((sw_0)object).putPreference(string6, string4);
                } else {
                    object.getClass();
                }
                object = UrlHelper.Companion.getInstance().getBaseUrl();
                int n4 = ((String)object).length();
                if (n4 > 0 && (bl4 = StringsKt.F((CharSequence)object, string10, false))) {
                    loginActivityRevamp.G2(bl3, false);
                } else {
                    object = new AlertDialog.Builder((Context)loginActivityRevamp);
                    object = object.setMessage((CharSequence)string9);
                    object2 = new Tx1(loginActivityRevamp);
                    object = object.setPositiveButton((CharSequence)string8, (DialogInterface.OnClickListener)object2).setCancelable(false).create();
                    object.show();
                }
            } else {
                boolean bl5;
                object2 = loginActivityRevamp.z0;
                int n7 = b.i((String)object2, "Login", bl3);
                string5 = "Facebook button click - Success";
                if (n7 != 0) {
                    object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    String string12 = loginActivityRevamp.z0;
                    String string13 = "Welcome to AJIO";
                    ((GTMEvents)object2).pushButtonTapEvent(string13, string5, string12);
                } else {
                    object2 = loginActivityRevamp.z0;
                    String string14 = "Sign up";
                    n7 = b.i((String)object2, string14, bl3);
                    if (n7 != 0) {
                        object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        string14 = loginActivityRevamp.z0;
                        String string15 = "New user registration screen";
                        ((GTMEvents)object2).pushButtonTapEvent(string15, string5, string14);
                    }
                }
                object2 = loginActivityRevamp.getAppPreferences();
                if (string4 != null) {
                    ((sw_0)object2).putPreference(string6, string4);
                } else {
                    object2.getClass();
                }
                object2 = loginActivityRevamp.getAppPreferences();
                string4 = "FACEBOOK_PROFILE_EMAIL";
                ((sw_0)object2).putPreference(string4, (String)object3);
                object2 = loginActivityRevamp.getAppPreferences();
                if (object != null) {
                    ((sw_0)object2).putPreference(string7, (String)object);
                } else {
                    object2.getClass();
                }
                object = UrlHelper.Companion.getInstance().getBaseUrl();
                n7 = ((String)object).length();
                if (n7 > 0 && (bl5 = StringsKt.F((CharSequence)object, string10, false))) {
                    loginActivityRevamp.G2(bl3, false);
                } else {
                    object = new AlertDialog.Builder((Context)loginActivityRevamp);
                    object = object.setMessage((CharSequence)string9);
                    object2 = new dy1_1(loginActivityRevamp);
                    object = object.setPositiveButton((CharSequence)string8, (DialogInterface.OnClickListener)object2).setCancelable(false).create();
                    object.show();
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b(boolean bl2) {
        Object object;
        Object object2 = (String)this.a;
        if (!bl2) return;
        try {
            object = new cb0_0((String)object2);
            object2 = ((cb0_0)object).b;
            if (object2 == null) return;
        }
        catch (Exception exception) {
            return;
        }
        object2 = ((cb0_0)object).c;
        if (object2 == null) return;
        boolean bl3 = true;
        if (!bl3) return;
        object2 = ((cb0_0)object).a;
        object = ((cb0_0)object).toString();
        ii1_0.g((String)object2, (String)object);
    }

    public double c(double d2) {
        return JY.a(v2.b(e2_0.a((ColorSpace)this.a)), d2);
    }
}

