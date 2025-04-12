/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import kotlin.jvm.internal.Intrinsics;

public final class EG2
implements View.OnClickListener {
    public final /* synthetic */ Snackbar a;

    public /* synthetic */ EG2(Snackbar snackbar) {
        this.a = snackbar;
    }

    public final void onClick(View view) {
        Snackbar snackbar = this.a;
        Intrinsics.checkNotNullParameter(snackbar, "$referralSnackbar");
        snackbar.dismiss();
    }
}

