/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;
import com.ril.ajio.login.activity.LoginActivityRevampNew;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fy1
 */
public final class fy1_0
implements DialogInterface.OnClickListener {
    public final /* synthetic */ LoginActivityRevampNew a;

    public /* synthetic */ fy1_0(LoginActivityRevampNew loginActivityRevampNew) {
        this.a = loginActivityRevampNew;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        LoginActivityRevampNew loginActivityRevampNew = this.a;
        Intrinsics.checkNotNullParameter(loginActivityRevampNew, "this$0");
        loginActivityRevampNew.G2(false, true);
    }
}

