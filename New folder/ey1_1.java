/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 */
import android.content.DialogInterface;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.ril.ajio.login.activity.LoginActivityRevampNew;
import com.ril.ajio.view.BaseSplitActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ey1
 */
public final class ey1_1
implements DialogInterface.OnClickListener {
    public final /* synthetic */ LoginActivityRevampNew a;

    public /* synthetic */ ey1_1(LoginActivityRevampNew loginActivityRevampNew) {
        this.a = loginActivityRevampNew;
    }

    public final void onClick(DialogInterface object, int n3) {
        object = LoginActivityRevampNew.Companion;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((BaseSplitActivity)object).getAppPreferences();
        String string2 = "";
        ((sw_0)object2).putPreference("GOOGLE_PROFILE_EMAIL", string2);
        ((sw_0)object2).putPreference("GOOGLE_PROFILE_NAME", string2);
        ((sw_0)object2).putPreference("GOOGLE_PROFILE_USERID", string2);
        String string3 = "GOOGLE_PROFILE_ACCESS_TOKEN";
        ((sw_0)object2).putPreference(string3, string2);
        object2 = ((LoginActivityRevampNew)object).t0;
        object2 = object2 != null ? ((GoogleSignInClient)object2).getSignInIntent() : null;
        if (object2 != null) {
            int n4 = 16;
            ((ComponentActivity)object).startActivityForResult((Intent)object2, n4);
        }
    }
}

