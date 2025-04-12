/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.login.activity.a;

public final class fz1$c
extends BottomSheetDialog {
    public final /* synthetic */ fz1_2 a;

    public fz1$c(fz1_2 fz1_22, Context context, int n3) {
        this.a = fz1_22;
        super(context, n3);
    }

    public final void onBackPressed() {
        a a2 = this.a.g;
        if (a2 != null) {
            a2.T(null, null, false);
        }
    }
}

