/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Dy0
 */
public final class dy0_1
implements View.OnClickListener {
    public final /* synthetic */ hy0_2 a;

    public /* synthetic */ dy0_1(hy0_2 hy0_22) {
        this.a = hy0_22;
    }

    public final void onClick(View object) {
        boolean bl2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        FragmentActivity fragmentActivity = ((Fragment)object).getActivity();
        if (fragmentActivity != null && !(bl2 = (fragmentActivity = ((Fragment)object).requireActivity()).isFinishing())) {
            object = ((Fragment)object).requireActivity();
            ((ComponentActivity)object).onBackPressed();
        }
    }
}

