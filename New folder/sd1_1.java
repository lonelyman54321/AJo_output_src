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
 * Renamed from sD1
 */
public final class sd1_1
implements View.OnClickListener {
    public final /* synthetic */ vd1_1 a;

    public /* synthetic */ sd1_1(vd1_1 vd1_12) {
        this.a = vd1_12;
    }

    public final void onClick(View object) {
        vd1_1 vd1_12 = this.a;
        Intrinsics.checkNotNullParameter(vd1_12, "this$0");
        object = vd1_12.a;
        if (object != null) {
            object.l();
        }
    }
}

