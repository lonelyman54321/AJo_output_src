/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 */
import android.content.DialogInterface;
import com.ril.ajio.view.BaseSplitActivity;

/*
 * Renamed from ww
 */
public final class ww_1
implements DialogInterface.OnDismissListener {
    public final /* synthetic */ BaseSplitActivity a;

    public /* synthetic */ ww_1(BaseSplitActivity baseSplitActivity) {
        this.a = baseSplitActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        BaseSplitActivity.r2(this.a, dialogInterface);
    }
}

