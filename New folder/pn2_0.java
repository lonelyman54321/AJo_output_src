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
 * Renamed from PN2
 */
public final class pn2_0
implements View.OnClickListener {
    public final /* synthetic */ rn2_2 a;

    public /* synthetic */ pn2_0(rn2_2 rn2_22) {
        this.a = rn2_22;
    }

    public final void onClick(View view) {
        rn2_2 rn2_22 = this.a;
        Intrinsics.checkNotNullParameter(rn2_22, "this$0");
        rn2_22.x("exchange");
    }
}

