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
 * Renamed from V90
 */
public final class v90_0
implements View.OnClickListener {
    public final /* synthetic */ Y90 a;

    public /* synthetic */ v90_0(Y90 y90) {
        this.a = y90;
    }

    public final void onClick(View view) {
        Y90 y90 = this.a;
        Intrinsics.checkNotNullParameter(y90, "this$0");
        y90.dismissAllowingStateLoss();
    }
}

