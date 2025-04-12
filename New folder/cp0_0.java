/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.DeviceAuthDialog$b;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cp0
 */
public final class cp0_0
implements DialogInterface.OnClickListener {
    public final /* synthetic */ DeviceAuthDialog a;
    public final /* synthetic */ String b;
    public final /* synthetic */ DeviceAuthDialog$b c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Date e;
    public final /* synthetic */ Date f;

    public /* synthetic */ cp0_0(DeviceAuthDialog deviceAuthDialog, String string2, DeviceAuthDialog$b b2, String string3, Date date, Date date2) {
        this.a = deviceAuthDialog;
        this.b = string2;
        this.c = b2;
        this.d = string3;
        this.e = date;
        this.f = date2;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        DeviceAuthDialog deviceAuthDialog = this.a;
        Intrinsics.checkNotNullParameter(deviceAuthDialog, "this$0");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$userId");
        DeviceAuthDialog$b deviceAuthDialog$b = this.c;
        Intrinsics.checkNotNullParameter(deviceAuthDialog$b, "$permissions");
        String string3 = this.d;
        Intrinsics.checkNotNullParameter(string3, "$accessToken");
        Date date = this.e;
        Date date2 = this.f;
        deviceAuthDialog.Oa(string2, deviceAuthDialog$b, string3, date, date2);
    }
}

