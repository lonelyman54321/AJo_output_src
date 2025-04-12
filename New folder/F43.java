/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class F43
implements View.OnClickListener {
    public final /* synthetic */ g43_0 a;

    public /* synthetic */ F43(g43_0 g43_02) {
        this.a = g43_02;
    }

    public final void onClick(View view) {
        g43_0 g43_02 = this.a;
        Intrinsics.checkNotNullParameter(g43_02, "this$0");
        g43_02.dismiss();
    }
}

