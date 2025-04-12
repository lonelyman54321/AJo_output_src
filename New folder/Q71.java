/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class Q71
implements View.OnClickListener {
    public final /* synthetic */ o71_0 a;

    public /* synthetic */ Q71(o71_0 o71_02) {
        this.a = o71_02;
    }

    public final void onClick(View object) {
        o71_0 o71_02 = this.a;
        Intrinsics.checkNotNullParameter(o71_02, "this$0");
        object = o71_02.e;
        if (object != null) {
            object.a();
        }
    }
}

