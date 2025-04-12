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
 * Renamed from SE3
 */
public final class se3_1
implements View.OnClickListener {
    public final /* synthetic */ te3_2 a;
    public final /* synthetic */ TE3$a b;

    public /* synthetic */ se3_1(te3_2 te3_22, TE3$a tE3$a) {
        this.a = te3_22;
        this.b = tE3$a;
    }

    public final void onClick(View object) {
        te3_2 te3_22 = this.a;
        Intrinsics.checkNotNullParameter(te3_22, "this$0");
        TE3$a tE3$a = this.b;
        Intrinsics.checkNotNullParameter(tE3$a, "this$1");
        object = te3_22.b;
        int n3 = tE3$a.f;
        object.q(n3);
    }
}

