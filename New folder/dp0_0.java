/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.view.View
 */
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.LoginClient$Request;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Dp0
 */
public final class dp0_0
implements DialogInterface.OnClickListener {
    public final /* synthetic */ DeviceAuthDialog a;

    public /* synthetic */ dp0_0(DeviceAuthDialog deviceAuthDialog) {
        this.a = deviceAuthDialog;
    }

    public final void onClick(DialogInterface object, int n3) {
        DeviceAuthDialog deviceAuthDialog = this.a;
        Intrinsics.checkNotNullParameter(deviceAuthDialog, "this$0");
        object = deviceAuthDialog.Pa(false);
        Dialog dialog = deviceAuthDialog.getDialog();
        if (dialog != null) {
            dialog.setContentView((View)object);
        }
        if ((object = deviceAuthDialog.k) != null) {
            deviceAuthDialog.Wa((LoginClient$Request)object);
        }
    }
}

