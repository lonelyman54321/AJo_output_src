/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.app.Activity;
import android.content.DialogInterface;
import com.facebook.login.j;
import com.ril.ajio.login.activity.LoginActivityRevampNew;
import com.ril.ajio.view.BaseSplitActivity;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oy1
 */
public final class oy1_0
implements DialogInterface.OnClickListener {
    public final /* synthetic */ LoginActivityRevampNew a;

    public /* synthetic */ oy1_0(LoginActivityRevampNew loginActivityRevampNew) {
        this.a = loginActivityRevampNew;
    }

    public final void onClick(DialogInterface object, int n3) {
        object = LoginActivityRevampNew.Companion;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((BaseSplitActivity)object).getAppPreferences();
        String string2 = "";
        ((sw_0)object2).putPreference("FACEBOOK_PROFILE_USERID", string2);
        ((sw_0)object2).putPreference("FACEBOOK_PROFILE_NAME", string2);
        ((sw_0)object2).putPreference("FACEBOOK_PROFILE_EMAIL", string2);
        Object object3 = "FACEBOOK_PROFILE_ACCESS_TOKEN";
        ((sw_0)object2).putPreference((String)object3, string2);
        object2 = ((LoginActivityRevampNew)object).y0;
        if (object2 != null) {
            object3 = ((LoginActivityRevampNew)object).x0;
            ((j)object2).e((Activity)object, (Collection)object3);
        }
        ((LoginActivityRevampNew)object).startLoader();
    }
}

