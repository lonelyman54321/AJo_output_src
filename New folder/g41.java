/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;

public final class g41
implements Runnable {
    public final /* synthetic */ k41_0 a;

    public /* synthetic */ g41(k41_0 k41_02) {
        this.a = k41_02;
    }

    public final void run() {
        k41_0 k41_02 = this.a;
        Intrinsics.checkNotNullParameter(k41_02, "this$0");
        ai0_2.B((View)k41_02.e);
        ConstraintLayout constraintLayout = k41_02.i;
        if (constraintLayout != null) {
            ai0_2.B((View)constraintLayout);
        }
    }
}

