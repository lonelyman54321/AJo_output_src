/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 */
import android.app.Activity;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class RP
implements View.OnFocusChangeListener {
    public final /* synthetic */ vp_1 a;

    public /* synthetic */ RP(vp_1 vp_12) {
        this.a = vp_12;
    }

    public final void onFocusChange(View object, boolean bl2) {
        object = "this$0";
        vp_1 vp_12 = this.a;
        Intrinsics.checkNotNullParameter(vp_12, (String)object);
        if (!bl2) {
            object = vp_12.getActivity();
            hv3_0.S((Activity)object);
        }
    }
}

