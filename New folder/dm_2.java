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
 * Renamed from dM
 */
public final class dm_2
implements View.OnClickListener {
    public final /* synthetic */ lm_2 a;

    public /* synthetic */ dm_2(lm_2 lm_22) {
        this.a = lm_22;
    }

    public final void onClick(View view) {
        lm_2 lm_22 = this.a;
        Intrinsics.checkNotNullParameter(lm_22, "this$0");
        lm_22.dismissAllowingStateLoss();
    }
}

