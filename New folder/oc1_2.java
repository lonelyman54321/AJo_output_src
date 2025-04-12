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
 * Renamed from oc1
 */
public final class oc1_2
implements View.OnClickListener {
    public final /* synthetic */ pc1_2 a;

    public /* synthetic */ oc1_2(pc1_2 pc1_22) {
        this.a = pc1_22;
    }

    public final void onClick(View view) {
        pc1_2 pc1_22 = this.a;
        Intrinsics.checkNotNullParameter(pc1_22, "this$0");
        pc1_22.dismiss();
    }
}

