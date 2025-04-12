/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 */
package com.ril.ajio.login.activity;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.tasks.Task;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.AppsFlyerEvents;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import com.ril.ajio.view.BaseSplitActivity;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

public class LoginBaseActivity
extends BaseSplitActivity {
    public final String X;
    public final NewCustomEventsRevamp Y;
    public final String Z;
    public final String k0;

    public LoginBaseActivity() {
        this.X = "";
        Object object = AnalyticsManager.Companion;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.Y = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.Z = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.k0 = object = newEEcommerceEventsRevamp.getPrevScreenType();
    }

    public static Bundle A2(AccountCheckResponse accountCheckResponse, QueryCustomer object) {
        Intrinsics.checkNotNullParameter(object, "queryCustomer");
        Bundle bundle = new Bundle();
        bundle.putBoolean("ISFROMSOCIALLOGIN", false);
        boolean bl2 = true;
        bundle.putBoolean("ISEXISTINGSOCIALLOGINUSER", bl2);
        bundle.putBoolean("ISMANUALSIGNUP", false);
        bundle.putBoolean("ISEXISTINGUSER", bl2);
        bundle.putSerializable("ACCOUNTCHECK_RESPONSE", (Serializable)accountCheckResponse);
        bundle.putBoolean("is_unrecognised_device", bl2);
        bundle.putParcelable("QUERYCUSTOMER_DATA", (Parcelable)object);
        boolean bl3 = ((QueryCustomer)object).isMobileNumberEnterered();
        bundle.putBoolean("ISINPUTMOBILENUMBER", bl3);
        object = ((QueryCustomer)object).getLogin();
        bundle.putString("INPUT_MOBILE_EMAILID", (String)object);
        return bundle;
    }

    public static void C2(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "loginvia");
        Intrinsics.checkNotNullParameter(object2, "sourceScreen");
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        String string2 = "facebook";
        boolean bl2 = true;
        boolean bl3 = b.i((String)object, string2, bl2);
        String string3 = "New user registration screen";
        String string4 = "Sign up";
        String string5 = "Login";
        String string6 = "Source";
        String string7 = "Welcome to AJIO";
        if (bl3) {
            boolean bl4 = b.i((String)object2, string5, bl2);
            string2 = "Facebook button click - Success";
            string5 = "Facebook";
            if (bl4) {
                AppsFlyerEvents.INSTANCE.sendLoginMethodEvent(string5);
                object = AnalyticsManager.Companion;
                tj2_0.e((AnalyticsManager$Companion)object, string7, string2, (String)object2);
            } else {
                bl4 = b.i((String)object2, string4, bl2);
                if (bl4) {
                    object = AnalyticsManager.Companion;
                    tj2_0.e((AnalyticsManager$Companion)object, string3, string2, (String)object2);
                }
            }
            hashMap.put(string6, string5);
            bv1_0.f = object = "Social media - fb";
        } else {
            string2 = "google";
            bl3 = b.i((String)object, string2, bl2);
            if (bl3) {
                boolean bl5 = b.i((String)object2, string5, bl2);
                string2 = "Google button click - Success";
                string5 = "Google";
                if (bl5) {
                    AppsFlyerEvents.INSTANCE.sendLoginMethodEvent(string5);
                    object = AnalyticsManager.Companion;
                    tj2_0.e((AnalyticsManager$Companion)object, string7, string2, (String)object2);
                } else {
                    bl5 = b.i((String)object2, string4, bl2);
                    if (bl5) {
                        object = AnalyticsManager.Companion;
                        tj2_0.e((AnalyticsManager$Companion)object, string3, string2, (String)object2);
                    }
                }
                hashMap.put(string6, string5);
                bv1_0.f = object = "Social media - google";
            } else {
                string2 = "";
                boolean bl6 = Intrinsics.areEqual(object, string2);
                if (bl6) {
                    object = AnalyticsManager.Companion;
                    string2 = "Continue button click - Success";
                    tj2_0.e((AnalyticsManager$Companion)object, string7, string2, (String)object2);
                    object = "Manual";
                    hashMap.put(string6, object);
                }
            }
        }
        hashMap.put("LoginStatus", "Success");
        object = AnalyticsManager.Companion.getInstance().getCt();
        object2 = new AnalyticsData$Builder();
        object2 = ((AnalyticsData$Builder)object2).eventMap(hashMap).build();
        ((CleverTapEvents)object).loginComplete((AnalyticsData)object2);
    }

    public static void D2(String object, DataError$ErrorMessage object2, String string2, String string3) {
        Object object3;
        boolean bl2;
        Intrinsics.checkNotNullParameter(string3, "sourceScreen");
        String string4 = "Continue button click - Failure";
        String string5 = "Welcome to AJIO";
        if (object2 != null && string2 != null && !(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            object3 = AnalyticsManager.Companion;
            tj2_0.e((AnalyticsManager$Companion)object3, string5, string4, string3);
        }
        object3 = p3.a("LoginStatus", "Failure");
        String string6 = "facebook";
        boolean bl3 = true;
        boolean bl4 = b.i((String)object, string6, bl3);
        String string7 = "Error - ";
        String string8 = "Source";
        if (bl4) {
            boolean bl5;
            ((HashMap)object3).put(string8, "Facebook");
            object = "Facebook error";
            if (object2 != null && string2 != null && !(bl5 = TextUtils.isEmpty((CharSequence)string2))) {
                object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                string2 = string7.concat(string2);
                ((GTMEvents)object2).pushButtonTapEvent((String)object, string2, string3);
            } else {
                object2 = AnalyticsManager.Companion;
                string2 = "Error - Facebook login failed";
                tj2_0.e((AnalyticsManager$Companion)object2, (String)object, string2, string3);
            }
        } else {
            string6 = "google";
            bl4 = b.i((String)object, string6, bl3);
            if (bl4) {
                boolean bl6;
                ((HashMap)object3).put(string8, "Google");
                object = "Google Login error";
                if (object2 != null && string2 != null && !(bl6 = TextUtils.isEmpty((CharSequence)string2))) {
                    object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    string2 = string7.concat(string2);
                    ((GTMEvents)object2).pushButtonTapEvent((String)object, string2, string3);
                } else {
                    object2 = AnalyticsManager.Companion;
                    string2 = "Error - Google Login failed";
                    tj2_0.e((AnalyticsManager$Companion)object2, (String)object, string2, string3);
                }
            } else {
                object2 = "";
                boolean bl7 = Intrinsics.areEqual(object, object2);
                if (bl7) {
                    ((HashMap)object3).put(string8, "Manual");
                    object = AnalyticsManager.Companion;
                    tj2_0.e((AnalyticsManager$Companion)object, string5, string4, string3);
                }
            }
        }
    }

    public static void F2(String object, boolean bl2) {
        Object object2;
        Bundle bundle = new Bundle();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        String string2 = "OTP";
        if (!bl3) {
            object2 = "SIGIN_SOURCE_FACEBOOK";
            boolean bl4 = true;
            bl3 = b.i((String)object, (String)object2, bl4);
            if (bl3) {
                object = "facebook";
                string2 = "Facebook";
            } else {
                object2 = "SIGIN_SOURCE_GOOGLE";
                bl3 = b.i((String)object, (String)object2, bl4);
                if (bl3) {
                    object = "google";
                    string2 = "Google";
                }
            }
        } else {
            object = "manual";
        }
        if (bl2) {
            AppsFlyerEvents.INSTANCE.sendLoginMethodEvent(string2);
            bundle.putString("login_method", (String)object);
            object = FirebaseEvents.Companion.getInstance();
            String string3 = "login";
            ((FirebaseEvents)object).sendEvent(string3, bundle);
        } else {
            Object object3 = p3.a("platform", "Android");
            object2 = new AnalyticsData$Builder();
            object3 = ((AnalyticsData$Builder)object2).eventMap((HashMap)object3).build();
            object2 = AnalyticsManager.Companion.getInstance().getCt();
            ((CleverTapEvents)object2).registrationComplete((AnalyticsData)object3);
            AppsFlyerEvents.INSTANCE.sendRegistrationMethodEvent(string2);
            bundle.putString("sign_up_method", (String)object);
            object = FirebaseEvents.Companion.getInstance();
            object3 = "sign_up";
            ((FirebaseEvents)object).sendEvent((String)object3, bundle);
        }
    }

    public final void E2(String string2, String string3, boolean bl2, boolean bl3) {
        int n3;
        LoginBaseActivity loginBaseActivity = this;
        String string4 = "eventLabel";
        String string5 = string2;
        Intrinsics.checkNotNullParameter(string2, string4);
        string4 = bl3 ? "login - otp screen" : "signup - otp screen";
        Object object = bv1_0.a;
        Object object2 = loginBaseActivity.Y;
        Object object3 = "login_source";
        String string6 = "";
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object = new Bundle();
            String string7 = bv1_0.e;
            String string8 = "AJIO_Referral";
            object.putString(string8, string7);
            string7 = string3 == null ? string6 : string3;
            object.putString((String)object3, string7);
            object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            Object object4 = ne_0.b((Bundle)object);
            int n4 = 16;
            String string9 = null;
            object = object3;
            object3 = "user registered";
            string7 = string2;
            string8 = string4;
            GTMEvents.pushButtonTapEvent$default((GTMEvents)object, (String)object3, string2, string4, (AnalyticsData)object4, null, n4, null);
            if (bl2) {
                Bundle bundle = new Bundle();
                object = ((NewCustomEventsRevamp)object2).getLOGIN_SIGNUP_SRC();
                if (string3 != null) {
                    string6 = string3;
                }
                bundle.putString((String)object, string6);
                object3 = ((NewCustomEventsRevamp)object2).getEC_USER_ACCOUNTS();
                string6 = null;
                string7 = "register - success";
                object4 = "register_success";
                String string10 = "user account screen";
                string9 = loginBaseActivity.Z;
                String string11 = loginBaseActivity.k0;
                int n7 = 1536;
                object = object2;
                string8 = string2;
                string5 = bundle;
                object2 = string11;
                bundle = null;
                string11 = null;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object3, string7, string2, (String)object4, string4, string10, string9, (Bundle)string5, (String)object2, false, null, n7, null);
            }
        } else {
            object = new Bundle();
            String string12 = string3 == null ? string6 : string3;
            object.putString((String)object3, string12);
            object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            Object object5 = ne_0.b((Bundle)object);
            int n8 = 16;
            String string13 = null;
            object = object3;
            object3 = "user registered";
            string12 = string2;
            String string14 = string4;
            GTMEvents.pushButtonTapEvent$default((GTMEvents)object, (String)object3, string2, string4, (AnalyticsData)object5, null, n8, null);
            if (bl2) {
                Bundle bundle = new Bundle();
                object = ((NewCustomEventsRevamp)object2).getLOGIN_SIGNUP_SRC();
                if (string3 != null) {
                    string6 = string3;
                }
                bundle.putString((String)object, string6);
                object3 = ((NewCustomEventsRevamp)object2).getEC_USER_ACCOUNTS();
                string6 = null;
                string12 = "register - success";
                object5 = "register_success";
                String string15 = "user account screen";
                string13 = loginBaseActivity.Z;
                String string16 = loginBaseActivity.k0;
                int n10 = 1536;
                object = object2;
                string14 = string2;
                string5 = bundle;
                object2 = string16;
                bundle = null;
                string16 = null;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object3, string12, string2, (String)object5, string4, string15, string13, (Bundle)string5, (String)object2, false, null, n10, null);
            }
        }
    }

    public final void y2(Task object, String string2) {
        String string3;
        Intrinsics.checkNotNullParameter(object, "completedTask");
        Intrinsics.checkNotNullParameter(string2, "sourceScreen");
        object = (GoogleSignInAccount)((Task)object).getResult(ApiException.class);
        Object object2 = this.getAppPreferences();
        Object object3 = "";
        Object object4 = object != null ? ((GoogleSignInAccount)object).getDisplayName() : object3;
        if (object4 != null) {
            string3 = "GOOGLE_PROFILE_NAME";
            ((sw_0)object2).putPreference(string3, (String)object4);
        } else {
            object2.getClass();
        }
        object4 = object != null ? ((GoogleSignInAccount)object).getEmail() : object3;
        if (object4 != null) {
            string3 = "GOOGLE_PROFILE_EMAIL";
            ((sw_0)object2).putPreference(string3, (String)object4);
        }
        if (object != null) {
            object3 = ((GoogleSignInAccount)object).getIdToken();
        }
        if (object3 != null) {
            object4 = "GOOGLE_PROFILE_ACCESS_TOKEN";
            ((sw_0)object2).putPreference((String)object4, (String)object3);
        }
        object2 = yn3_0.a;
        object = ((GoogleSignInAccount)object).getIdToken();
        object = kp1_0.c("base activity called and idtoken is ", (String)object);
        object3 = new Object[]{};
        ((yn3$a)object2).a((String)object, object3);
        object = "Login";
        boolean bl2 = true;
        boolean bl3 = b.i(string2, (String)object, bl2);
        object3 = "Google button click - Success";
        if (bl3) {
            object = AnalyticsManager.Companion;
            object2 = "Welcome to AJIO";
            tj2_0.e((AnalyticsManager$Companion)object, (String)object2, (String)object3, string2);
        } else {
            object = "Sign up";
            bl3 = b.i(string2, (String)object, bl2);
            if (bl3) {
                object = AnalyticsManager.Companion;
                object2 = "New user registration screen";
                tj2_0.e((AnalyticsManager$Companion)object, (String)object2, (String)object3, string2);
            }
        }
    }

    public final void z2(ApiException object) {
        Intrinsics.checkNotNullParameter(object, "exception");
        object = CommonStatusCodes.getStatusCodeString(((ApiException)object).getStatusCode());
        Intrinsics.checkNotNullExpressionValue(object, "getStatusCodeString(...)");
        Object object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string2 = kp1_0.c("Error - ", (String)object);
        Object[] objectArray = this.X;
        ((GTMEvents)object2).pushButtonTapEvent("Google Login error", string2, (String)objectArray);
        object2 = StringCompanionObject.INSTANCE;
        object2 = hv3_0.K(R$string.acc_error_message);
        int n3 = 1;
        objectArray = new Object[n3];
        objectArray[0] = object;
        object2 = xh2_0.a(objectArray, n3, (String)object2, "format(...)");
        hv3_0.o0(0, (String)object, (String)object2);
    }
}

