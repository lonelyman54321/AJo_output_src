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
 * Renamed from cW1
 */
public final class cw1_1
implements View.OnClickListener {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ cw1_1(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Dialog dialog = object.P;
        if (dialog != null) {
            dialog.dismiss();
        }
        object.P = null;
    }
}

