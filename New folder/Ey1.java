/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.IntentSender
 *  android.content.IntentSender$SendIntentException
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.SpannableStringBuilder
 *  android.text.style.AbsoluteSizeSpan
 *  android.text.style.ForegroundColorSpan
 *  android.view.View
 *  android.widget.TextView
 */
import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Builder;
import com.google.android.gms.auth.api.credentials.Credentials;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.HintRequest$Builder;
import com.ril.ajio.R$color;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.NoUnderlineSpan;
import com.ril.ajio.services.data.referral.RefereeEarnCash;
import com.ril.ajio.services.data.referral.ReferralConfigCash;
import com.ril.ajio.services.data.referral.ReferrerCashData;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class Ey1 {
    public static final NewEEcommerceEventsRevamp a;
    public static final NewCustomEventsRevamp b;
    public static final String c;
    public static final String d;

    static {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        a = newEEcommerceEventsRevamp = analyticsManager$Companion.getInstance().getNewEEcommerceEventsRevamp();
        b = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
        c = newEEcommerceEventsRevamp.getPrevScreen();
        d = newEEcommerceEventsRevamp.getPrevScreenType();
    }

    public static QueryCustomer a(FragmentActivity object, String string2) {
        hv3_0.S((Activity)object);
        object = new QueryCustomer();
        if (string2 == null || (string2 = ((Object)StringsKt.m0(string2)).toString()) == null) {
            string2 = "";
        }
        ((QueryCustomer)object).setMobileNumber(string2);
        ((QueryCustomer)object).setMobileNumberEnterered(true);
        return object;
    }

    public static Bundle b(AccountCheckResponse object, QueryCustomer queryCustomer, boolean bl2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ISFROMSOCIALLOGIN", false);
        boolean bl3 = true;
        bundle.putBoolean("ISEXISTINGSOCIALLOGINUSER", bl3);
        bundle.putBoolean("ISMANUALSIGNUP", false);
        bundle.putBoolean("ISEXISTINGUSER", false);
        String string2 = "ACCOUNTCHECK_RESPONSE";
        bundle.putSerializable(string2, (Serializable)object);
        bundle.putParcelable("QUERYCUSTOMER_DATA", (Parcelable)queryCustomer);
        object = "ISINPUTMOBILENUMBER";
        bundle.putBoolean((String)object, bl3);
        object = queryCustomer != null ? queryCustomer.getMobileNumber() : null;
        bundle.putString("INPUT_MOBILE_EMAILID", (String)object);
        bundle.putBoolean("is_half_card_flow", bl2);
        return bundle;
    }

    public static SpannableStringBuilder c(View object, FragmentActivity fragmentActivity, gc3_2 object2, String string2) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "context");
        Intrinsics.checkNotNullParameter("T&C Click", "gaName");
        fragmentActivity = hv3_0.o(10, (Context)fragmentActivity);
        object = ((Object)((TextView)object).getText()).toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)object);
        String string3 = hv3_0.K(R$string.login_terms_condition);
        int n3 = 6;
        int n4 = StringsKt.O((CharSequence)object, string3, 0, false, n3);
        int n7 = hv3_0.K(R$string.login_terms_condition).length() + n4;
        Object object3 = new Cy1(string2, (gc3_2)((Object)object2));
        int n8 = 33;
        spannableStringBuilder.setSpan(object3, n4, n7, n8);
        object3 = new NoUnderlineSpan();
        spannableStringBuilder.setSpan(object3, n4, n7, n8);
        int n10 = hv3_0.m(R$color.accent_color_4);
        object3 = new ForegroundColorSpan(n10);
        spannableStringBuilder.setSpan(object3, n4, n7, n8);
        String string4 = "";
        object3 = new AjioCustomTypefaceSpan(string4, (Typeface)fragmentActivity);
        int n14 = 34;
        spannableStringBuilder.setSpan(object3, n4, n7, n14);
        string3 = hv3_0.K(R$string.login_privacy_policy);
        int n15 = StringsKt.O((CharSequence)object, string3, 0, false, n3);
        n4 = hv3_0.K(R$string.login_privacy_policy).length() + n15;
        Dy1 dy1 = new Dy1(string2, (gc3_2)((Object)object2));
        spannableStringBuilder.setSpan((Object)dy1, n15, n4, n8);
        object2 = new NoUnderlineSpan();
        spannableStringBuilder.setSpan(object2, n15, n4, n8);
        int n16 = hv3_0.m(R$color.accent_color_4);
        object2 = new ForegroundColorSpan(n16);
        spannableStringBuilder.setSpan(object2, n15, n4, n8);
        object2 = new AjioCustomTypefaceSpan(string4, (Typeface)fragmentActivity);
        spannableStringBuilder.setSpan(object2, n15, n4, n14);
        return spannableStringBuilder;
    }

    public static void d(gc3_2 object, FragmentActivity object2) {
        block8: {
            Object object3 = new HintRequest$Builder();
            Object object4 = new CredentialPickerConfig$Builder();
            boolean bl2 = true;
            object4 = ((CredentialPickerConfig$Builder)object4).setShowCancelButton(bl2).build();
            object3 = ((HintRequest$Builder)object3).setHintPickerConfig((CredentialPickerConfig)object4).setPhoneNumberIdentifierSupported(bl2).build();
            object4 = "build(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
            if (object != null) {
                object = Credentials.getClient((Context)object).getHintPickerIntent((HintRequest)object3);
                object3 = "getHintPickerIntent(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                if (object2 != null) {
                    IntentSender.SendIntentException sendIntentException2;
                    block10: {
                        IntentSender intentSender = object.getIntentSender();
                        object = "getIntentSender(...)";
                        Intrinsics.checkNotNullExpressionValue(intentSender, (String)object);
                        Bundle bundle = new Bundle();
                        object4 = object2;
                        try {
                            ((ComponentActivity)object2).startIntentSenderForResult(intentSender, 0, null, 0, 0, 0, bundle);
                            object = Unit.a;
                            break block8;
                        }
                        catch (ActivityNotFoundException activityNotFoundException) {
                        }
                        catch (IntentSender.SendIntentException sendIntentException2) {
                            break block10;
                        }
                        object2 = yn3_0.a;
                        ((yn3$a)object2).e(activityNotFoundException);
                        Unit unit = Unit.a;
                        break block8;
                    }
                    object2 = yn3_0.a;
                    ((yn3$a)object2).e(sendIntentException2);
                    Unit unit = Unit.a;
                }
            }
        }
    }

    public static SpannableStringBuilder e() {
        String string2 = hv3_0.K(R$string.login_or_signup);
        String string3 = hv3_0.K(R$string.login_or);
        int n3 = StringsKt.O(string2, string3, 0, false, 6);
        int n4 = n3 + 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)string2);
        int n7 = hv3_0.m(R$color.accent_color_18);
        string2 = new ForegroundColorSpan(n7);
        n7 = 33;
        spannableStringBuilder.setSpan((Object)string2, n3, n4, n7);
        string2 = new AbsoluteSizeSpan(16, true);
        spannableStringBuilder.setSpan((Object)string2, n3, n4, n7);
        return spannableStringBuilder;
    }

    public static void f(ReferralConfigCash object, View view, Application object2) {
        float f5;
        int n3 = 1;
        String string2 = "format(...)";
        Intrinsics.checkNotNullParameter(view, "view");
        Object[] objectArray = "context";
        Intrinsics.checkNotNullParameter(object2, (String)objectArray);
        if (object != null && (object = ((ReferralConfigCash)object).getReferee()) != null) {
            object = ((ReferrerCashData)object).getRefereeUserRegistration();
        } else {
            f5 = 0.0f;
            object = null;
        }
        bv1_0.c = object;
        if (object != null) {
            f5 = ((RefereeEarnCash)object).getAmount();
            objectArray = null;
            float f6 = f5 - 0.0f;
            Object object3 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
            if (object3 > 0) {
                view = (TextView)view;
                objectArray = StringCompanionObject.INSTANCE;
                objectArray = z40_0.Companion;
                objectArray.getClass();
                object2 = z40$a.a((Context)object2);
                object2 = object2.a;
                objectArray = "referral_signup_msg";
                object2 = object2.b((String)objectArray);
                objectArray = Float.valueOf(f5);
                objectArray = qz2_0.x((Float)objectArray);
                Object[] objectArray2 = new Object[n3];
                objectArray2[0] = objectArray;
                objectArray = Arrays.copyOf(objectArray2, n3);
                object2 = String.format((String)object2, objectArray);
                try {
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                }
                catch (Exception exception) {
                    objectArray = yn3_0.a;
                    objectArray.e(exception);
                    object2 = StringCompanionObject.INSTANCE;
                    object = qz2_0.x(Float.valueOf(f5));
                    object2 = new Object[n3];
                    object2[0] = object;
                    object = "Signup to get %s AJIO Cash";
                    object2 = xh2_0.a(object2, n3, (String)object, string2);
                }
                view.setText((CharSequence)object2);
                view.setVisibility(0);
            }
        }
    }

    public static void g() {
        AnalyticsData analyticsData;
        Object object;
        Bundle bundle = object;
        object = new Bundle();
        Object object2 = b;
        String string2 = ((NewCustomEventsRevamp)object2).getTYPE();
        object.putString(string2, "new");
        string2 = ((NewCustomEventsRevamp)object2).getDESCRIPTION();
        object.putString(string2, "auto continue on valid mobile number");
        object2 = ((NewCustomEventsRevamp)object2).getEVENT_CATEGORY();
        object.putString((String)object2, "buttonTap");
        object = analyticsData;
        analyticsData = new AnalyticsData(null, null, null, 0L, null, null, null, null, null, bundle, null, null, null, null, null, null, 65023, null);
        GTMEvents.pushButtonTapEvent$default(AnalyticsManager.Companion.getInstance().getGtmEvents(), "Auto Login Used", "number_based", "login/signup screen", analyticsData, null, 16, null);
    }

    public static void h() {
        String string2 = "Manual_login_used";
        Intrinsics.checkNotNullParameter(string2, "action");
        String string3 = "number_based";
        Intrinsics.checkNotNullParameter(string3, "name");
        String string4 = "login/signup screen";
        Intrinsics.checkNotNullParameter(string4, "screenName");
        tj2_0.e(AnalyticsManager.Companion, string2, string3, string4);
    }

    public static void i(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(string3, "label");
        Object object = "Social_login_used";
        Intrinsics.checkNotNullParameter(object, "action");
        tj2_0.e(AnalyticsManager.Companion, (String)object, string2, "login/signup screen");
        object = b;
        String string4 = ((NewCustomEventsRevamp)object).getEC_USER_ACCOUNTS();
        String string5 = c;
        String string6 = d;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string4, "social media click", string3, "user_account_social_media_click", "login/signup screen", "user account screen", string5, null, string6, false, null, 1536, null);
    }

    public static void j() {
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushEvent("formInit", "login/signup form", "mobile input", "");
        NewCustomEventsRevamp newCustomEventsRevamp = b;
        String string2 = newCustomEventsRevamp.getEC_FORM();
        String string3 = c;
        String string4 = d;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "initiate", "login/signup form", "form_initiate", "login/signup screen", "user account screen", string3, null, string4, false, null, 1536, null);
    }

    public static void k(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "eventBundle");
        Bundle bundle2 = new Bundle();
        NewCustomEventsRevamp newCustomEventsRevamp = b;
        String string2 = newCustomEventsRevamp.getLOGIN_SIGNUP_SRC();
        String string3 = bundle.getString("login_source");
        bundle2.putString(string2, string3);
        string2 = newCustomEventsRevamp.getSTEP();
        int n3 = bundle.getInt("Step_Number");
        bundle2.putInt(string2, n3);
        String string4 = c;
        String string5 = d;
        newCustomEventsRevamp.newPushCustomScreenView("mobile - login/signup screen", "user account screen", string4, bundle2, string5);
    }

    public static void l(View view, boolean bl2, int n3, float f5) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setClickable(bl2);
        view.setVisibility(n3);
        view.setAlpha(f5);
    }

    public static /* synthetic */ void m(View view) {
        Ey1.l(view, false, 0, 0.6f);
    }
}

