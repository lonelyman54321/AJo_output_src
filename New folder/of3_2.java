/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.facebook.internal.WebDialog;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oF3
 */
public final class of3_2
implements View.OnClickListener {
    public final /* synthetic */ WebDialog a;

    public /* synthetic */ of3_2(WebDialog webDialog) {
        this.a = webDialog;
    }

    public final void onClick(View view) {
        WebDialog webDialog = this.a;
        Intrinsics.checkNotNullParameter((Object)webDialog, "this$0");
        webDialog.cancel();
    }
}

