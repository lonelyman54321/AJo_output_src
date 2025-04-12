/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.myaccount.order.returns.activity.ReturnInfoActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oN2
 */
public final class on2_1
implements View.OnClickListener {
    public final /* synthetic */ ReturnInfoActivity a;

    public /* synthetic */ on2_1(ReturnInfoActivity returnInfoActivity) {
        this.a = returnInfoActivity;
    }

    public final void onClick(View view) {
        ReturnInfoActivity returnInfoActivity = this.a;
        Intrinsics.checkNotNullParameter(returnInfoActivity, "this$0");
        returnInfoActivity.onBackPressed();
    }
}

