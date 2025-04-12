/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class xz1
implements View.OnFocusChangeListener {
    public final /* synthetic */ az1_2 a;

    public /* synthetic */ xz1(az1_2 az1_22) {
        this.a = az1_22;
    }

    public final void onFocusChange(View object, boolean bl2) {
        object = "this$0";
        az1_2 az1_22 = this.a;
        Intrinsics.checkNotNullParameter(az1_22, (String)object);
        if (bl2) {
            az1_22.Ua();
        } else {
            az1_22.Ta();
        }
    }
}

