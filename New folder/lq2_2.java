/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;
import com.ril.ajio.payment.activity.PeWebViewActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lq2
 */
public final class lq2_2
implements DialogInterface.OnClickListener {
    public final /* synthetic */ PeWebViewActivity a;

    public /* synthetic */ lq2_2(PeWebViewActivity peWebViewActivity) {
        this.a = peWebViewActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        PeWebViewActivity peWebViewActivity = this.a;
        Intrinsics.checkNotNullParameter(peWebViewActivity, "this$0");
        dialogInterface.cancel();
        peWebViewActivity.r2();
    }
}

