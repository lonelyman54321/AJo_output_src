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
 * Renamed from df0
 */
public final class df0_2
implements View.OnClickListener {
    public final /* synthetic */ ff0_2 a;

    public /* synthetic */ df0_2(ff0_2 ff0_22) {
        this.a = ff0_22;
    }

    public final void onClick(View view) {
        ff0_2 ff0_22 = this.a;
        Intrinsics.checkNotNullParameter(ff0_22, "this$0");
        ff0_22.dismissAllowingStateLoss();
    }
}

