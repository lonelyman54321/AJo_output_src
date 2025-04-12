/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$c;
import com.facebook.GraphRequest$d;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.login.activity.LoginActivityRevampNew;
import com.ril.ajio.view.BaseSplitActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ry1
 */
public final class ry1_0
implements pi0_1 {
    public final /* synthetic */ LoginActivityRevampNew a;

    public ry1_0(LoginActivityRevampNew loginActivityRevampNew) {
        this.a = loginActivityRevampNew;
    }

    public final void a(FacebookException object) {
        Intrinsics.checkNotNullParameter(object, "e");
        LoginActivityRevampNew loginActivityRevampNew = this.a;
        loginActivityRevampNew.stopLoader();
        GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object = ((Throwable)object).getMessage();
        object = kp1_0.c("Error - ", (String)object);
        String string2 = loginActivityRevampNew.A0;
        gTMEvents.pushButtonTapEvent("Facebook error", object, string2);
        object = new py1_0(loginActivityRevampNew);
        loginActivityRevampNew.runOnUiThread((Runnable)object);
    }

    public final void onCancel() {
        Object object = this.a;
        ((LoginActivityRevampNew)object).stopLoader();
        Object object2 = yn3_0.a;
        Object[] objectArray = new Object[]{};
        ((yn3$a)object2).k("facebook login canceled", objectArray);
        object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object = ((LoginActivityRevampNew)object).A0;
        ((GTMEvents)object2).pushButtonTapEvent("Facebook error", "Error - facebook login canceled", (String)object);
    }

    public final void onSuccess(Object object) {
        object = (tA1)object;
        Intrinsics.checkNotNullParameter(object, "loginResult");
        Object object2 = LoginActivityRevampNew.Companion;
        object2 = this.a;
        Object object3 = ((BaseSplitActivity)object2).getAppPreferences();
        object = ((tA1)object).a;
        String string2 = ((AccessToken)object).e;
        if (string2 != null) {
            String string3 = "FACEBOOK_PROFILE_ACCESS_TOKEN";
            ((sw_0)object3).putPreference(string3, string2);
        } else {
            object3.getClass();
        }
        object3 = GraphRequest.j;
        object3 = new mz_2(object2);
        object = GraphRequest$c.h((AccessToken)object, (GraphRequest$d)object3);
        object2 = new Bundle();
        object2.putString("fields", "id,name,email,gender, birthday");
        Intrinsics.checkNotNullParameter(object2, "<set-?>");
        ((GraphRequest)object).d = object2;
        ((GraphRequest)object).d();
    }
}

