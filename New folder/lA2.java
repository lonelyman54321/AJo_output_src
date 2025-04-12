/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLongClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class lA2
implements View.OnLongClickListener {
    public final /* synthetic */ mA2 a;

    public /* synthetic */ lA2(mA2 mA22) {
        this.a = mA22;
    }

    public final boolean onLongClick(View object) {
        mA2 mA22 = this.a;
        Intrinsics.checkNotNullParameter(mA22, "this$0");
        object = mA22.a;
        int n3 = mA22.getLayoutPosition();
        object.n(n3);
        return true;
    }
}

