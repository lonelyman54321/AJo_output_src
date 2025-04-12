/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.app.Dialog;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gy1
 */
public final class gy1_0
implements View.OnClickListener {
    public final /* synthetic */ Dialog a;

    public /* synthetic */ gy1_0(Dialog dialog) {
        this.a = dialog;
    }

    public final void onClick(View view) {
        Dialog dialog = this.a;
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }
}

