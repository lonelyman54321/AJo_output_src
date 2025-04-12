/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.myaccount.order.imps.ReturnImpsActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mN2
 */
public final class mn2_1
implements View.OnClickListener {
    public final /* synthetic */ ReturnImpsActivity a;

    public /* synthetic */ mn2_1(ReturnImpsActivity returnImpsActivity) {
        this.a = returnImpsActivity;
    }

    public final void onClick(View view) {
        ReturnImpsActivity returnImpsActivity = this.a;
        Intrinsics.checkNotNullParameter(returnImpsActivity, "this$0");
        returnImpsActivity.onBackPressed();
    }
}

