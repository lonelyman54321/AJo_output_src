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
 * Renamed from aH
 */
public final class ah_2
implements View.OnClickListener {
    public final /* synthetic */ bh_2 a;
    public final /* synthetic */ int b;

    public /* synthetic */ ah_2(bh_2 bh_22, int n3) {
        this.a = bh_22;
        this.b = n3;
    }

    public final void onClick(View object) {
        bh_2 bh_22 = this.a;
        Intrinsics.checkNotNullParameter(bh_22, "this$0");
        object = bh_22.a;
        int n3 = this.b;
        object.fa(n3);
    }
}

