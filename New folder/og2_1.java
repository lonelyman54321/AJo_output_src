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
 * Renamed from oG2
 */
public final class og2_1
implements View.OnClickListener {
    public final /* synthetic */ pg2_2 a;

    public /* synthetic */ og2_1(pg2_2 pg2_22) {
        this.a = pg2_22;
    }

    public final void onClick(View view) {
        pg2_2 pg2_22 = this.a;
        Intrinsics.checkNotNullParameter(pg2_22, "this$0");
        pg2_22.a.setVisibility(8);
    }
}

