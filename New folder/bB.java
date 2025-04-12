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

public final class bB
implements View.OnFocusChangeListener {
    public final /* synthetic */ fB a;

    public /* synthetic */ bB(fB fB2) {
        this.a = fB2;
    }

    public final void onFocusChange(View object, boolean bl2) {
        object = "this$0";
        fB fB2 = this.a;
        Intrinsics.checkNotNullParameter(fB2, (String)object);
        if (!bl2) {
            object = fB2.getActivity();
            hv3_0.S((Activity)object);
        }
    }
}

