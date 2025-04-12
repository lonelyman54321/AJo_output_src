/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.myaccount.order.fragment.a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ei0
 */
public final class ei0_1
implements View.OnClickListener {
    public final /* synthetic */ a a;

    public /* synthetic */ ei0_1(a a2) {
        this.a = a2;
    }

    public final void onClick(View view) {
        a a2 = this.a;
        Intrinsics.checkNotNullParameter(a2, "this$0");
        a2.dismissAllowingStateLoss();
    }
}

