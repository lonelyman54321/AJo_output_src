/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.snackbar.Snackbar;

public final class C73
implements View.OnClickListener {
    public final /* synthetic */ Snackbar a;
    public final /* synthetic */ View.OnClickListener b;

    public /* synthetic */ C73(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.a = snackbar;
        this.b = onClickListener;
    }

    public final void onClick(View view) {
        Snackbar snackbar = this.a;
        View.OnClickListener onClickListener = this.b;
        Snackbar.a(snackbar, onClickListener, view);
    }
}

