/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 */
import android.content.DialogInterface;
import com.facebook.internal.WebDialog;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nF3
 */
public final class nf3_1
implements DialogInterface.OnCancelListener {
    public final /* synthetic */ WebDialog a;

    public /* synthetic */ nf3_1(WebDialog webDialog) {
        this.a = webDialog;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        WebDialog webDialog = this.a;
        Intrinsics.checkNotNullParameter((Object)webDialog, "this$0");
        webDialog.cancel();
    }
}

