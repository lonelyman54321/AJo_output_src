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
 * Renamed from Pp2
 */
public final class pp2_1
implements View.OnClickListener {
    public final /* synthetic */ xp2_2 a;

    public /* synthetic */ pp2_1(xp2_2 xp2_22) {
        this.a = xp2_22;
    }

    public final void onClick(View object) {
        xp2_2 xp2_22 = this.a;
        Intrinsics.checkNotNullParameter(xp2_22, "this$0");
        hv3_0.p0(xp2_22.y);
        object = xp2_22.x;
        if (object != null) {
            ai0_2.B(object);
        }
        if ((object = xp2_22.z) != null) {
            ai0_2.B(object);
        }
        if ((object = xp2_22.t) != null) {
            ai0_2.i(object);
        }
        if ((object = xp2_22.B) != null) {
            ai0_2.i(object);
        }
        xp2_22.Pa();
    }
}

