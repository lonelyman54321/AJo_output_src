/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 */
import android.content.DialogInterface;
import kotlin.jvm.internal.Intrinsics;

public final class zc
implements DialogInterface.OnDismissListener {
    public final /* synthetic */ Ac a;

    public /* synthetic */ zc(Ac ac2) {
        this.a = ac2;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Ac ac2 = this.a;
        Intrinsics.checkNotNullParameter(ac2, "this$0");
        ac2.d.setText((CharSequence)"+ More details");
    }
}

