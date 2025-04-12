/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fV2
 */
public final class fv2_0
implements View.OnClickListener {
    public final /* synthetic */ vv2_2 a;

    public /* synthetic */ fv2_0(vv2_2 vv2_22) {
        this.a = vv2_22;
    }

    public final void onClick(View view) {
        vv2_2 vv2_22 = this.a;
        Intrinsics.checkNotNullParameter(vv2_22, "this$0");
        view = vv2_22.H;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchETVRefresh");
            view = null;
        }
        view.getText().clear();
        view = vv2_22.R;
        if (view != null) {
            int n3 = 8;
            view.setVisibility(n3);
        }
    }
}

