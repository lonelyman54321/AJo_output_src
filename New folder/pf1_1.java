/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.os.Bundle
 */
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;

/*
 * Renamed from Pf1
 */
public final class pf1_1
implements DialogInterface.OnClickListener {
    public final /* synthetic */ InAppNotificationActivity a;
    public final /* synthetic */ CTInAppNotificationButton b;

    public /* synthetic */ pf1_1(InAppNotificationActivity inAppNotificationActivity, CTInAppNotificationButton cTInAppNotificationButton) {
        this.a = inAppNotificationActivity;
        this.b = cTInAppNotificationButton;
    }

    public final void onClick(DialogInterface object, int n3) {
        object = this.a;
        lf1_1 lf1_12 = ((InAppNotificationActivity)object).u2();
        if (lf1_12 != null) {
            CTInAppNotification cTInAppNotification = ((InAppNotificationActivity)object).Y;
            CTInAppNotificationButton cTInAppNotificationButton = this.b;
            lf1_12 = lf1_12.j(cTInAppNotification, cTInAppNotificationButton, (Context)object);
        } else {
            lf1_12 = null;
        }
        ((InAppNotificationActivity)object).s2((Bundle)lf1_12, true);
    }
}

