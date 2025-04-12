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
 * Renamed from Dj1
 */
public final class dj1_2
implements View.OnClickListener {
    public final /* synthetic */ fj1_2 a;

    public /* synthetic */ dj1_2(fj1_2 fj1_22) {
        this.a = fj1_22;
    }

    public final void onClick(View view) {
        fj1_2 fj1_22 = this.a;
        Intrinsics.checkNotNullParameter(fj1_22, "this$0");
        fj1_22.dismissAllowingStateLoss();
    }
}

