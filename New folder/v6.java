/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class v6
implements View.OnClickListener {
    public final /* synthetic */ z6_0 a;

    public /* synthetic */ v6(z6_0 z6_02) {
        this.a = z6_02;
    }

    public final void onClick(View object) {
        object = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((z6_0)object).j;
        if (object != null) {
            object.T0();
        }
    }
}

