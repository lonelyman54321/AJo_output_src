/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cQ
 */
public final class cq_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ cq_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                mc2_0 mc2_02 = (mc2_0)this.b;
                Intrinsics.checkNotNullParameter(mc2_02, "this$0");
                mc2_02.dismissAllowingStateLoss();
                return;
            }
            case 0: 
        }
        iq_0 iq_02 = (iq_0)this.b;
        Intrinsics.checkNotNullParameter(iq_02, "this$0");
        object = iq_02.h;
        if (object != null) {
            object.z2();
        }
        if ((object = iq_02.getParentFragment()) != null && (object = ((Fragment)object).getChildFragmentManager()) != null) {
            ((FragmentManager)object).W();
        }
    }
}

