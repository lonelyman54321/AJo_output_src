/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class eT
implements View.OnClickListener {
    public final /* synthetic */ gt_2 a;

    public /* synthetic */ eT(gt_2 gt_22) {
        this.a = gt_22;
    }

    public final void onClick(View object) {
        gt_2 gt_22 = this.a;
        Intrinsics.checkNotNullParameter(gt_22, "this$0");
        object = gt_22.getActivity();
        if (object != null && (object = gt_22.getActivity()) != null) {
            object.finish();
        }
    }
}

