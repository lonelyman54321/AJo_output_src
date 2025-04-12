/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class PA2
implements View.OnClickListener {
    public final /* synthetic */ sa2_2 a;

    public /* synthetic */ PA2(sa2_2 sa2_22) {
        this.a = sa2_22;
    }

    public final void onClick(View view) {
        sa2_2 sa2_22 = this.a;
        Intrinsics.checkNotNullParameter(sa2_22, "this$0");
        sa2_22.dismiss();
    }
}

