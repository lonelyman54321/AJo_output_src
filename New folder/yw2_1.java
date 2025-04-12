/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.activity.ComponentActivity;
import com.ril.ajio.payment.fragment.i;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YW2
 */
public final class yw2_1
implements View.OnClickListener {
    public final /* synthetic */ i a;

    public /* synthetic */ yw2_1(i i3) {
        this.a = i3;
    }

    public final void onClick(View object) {
        boolean bl2;
        i i3 = this.a;
        Intrinsics.checkNotNullParameter(i3, "this$0");
        object = i3.getActivity();
        if (object != null && !(bl2 = (object = i3.requireActivity()).isFinishing())) {
            object = i3.requireActivity();
            ((ComponentActivity)object).onBackPressed();
        }
    }
}

