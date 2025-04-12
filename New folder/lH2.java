/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class lH2
implements View.OnClickListener {
    public final /* synthetic */ mh2_2 a;

    public /* synthetic */ lH2(mh2_2 mh2_22) {
        this.a = mh2_22;
    }

    public final void onClick(View object) {
        mh2_2 mh2_22 = this.a;
        Intrinsics.checkNotNullParameter(mh2_22, "this$0");
        object = mh2_22.a;
        if (object != null) {
            object.R3();
        }
    }
}

