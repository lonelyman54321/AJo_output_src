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

public final class qy1
implements DialogInterface.OnClickListener {
    public final /* synthetic */ LoginActivityRevampNew a;

    public /* synthetic */ qy1(LoginActivityRevampNew loginActivityRevampNew) {
        this.a = loginActivityRevampNew;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        LoginActivityRevampNew loginActivityRevampNew = this.a;
        Intrinsics.checkNotNullParameter(loginActivityRevampNew, "this$0");
        loginActivityRevampNew.G2(true, false);
    }
}

