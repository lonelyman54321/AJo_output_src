/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;

/*
 * Renamed from Nf1
 */
public final class nf1_1
implements DialogInterface.OnClickListener {
    public final /* synthetic */ InAppNotificationActivity a;
    public final /* synthetic */ CTInAppNotificationButton b;

    public /* synthetic */ nf1_1(InAppNotificationActivity inAppNotificationActivity, CTInAppNotificationButton cTInAppNotificationButton) {
        this.a = inAppNotificationActivity;
        this.b = cTInAppNotificationButton;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        InAppNotificationActivity inAppNotificationActivity = this.a;
        CTInAppNotificationButton cTInAppNotificationButton = this.b;
        inAppNotificationActivity.v2(cTInAppNotificationButton, true);
    }
}

