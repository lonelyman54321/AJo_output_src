/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;
import com.ril.ajio.login.activity.LoginActivityRevamp;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dy1
 */
public final class dy1_1
implements DialogInterface.OnClickListener {
    public final /* synthetic */ LoginActivityRevamp a;

    public /* synthetic */ dy1_1(LoginActivityRevamp loginActivityRevamp) {
        this.a = loginActivityRevamp;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        LoginActivityRevamp loginActivityRevamp = this.a;
        Intrinsics.checkNotNullParameter(loginActivityRevamp, "this$0");
        loginActivityRevamp.G2(true, false);
    }
}

