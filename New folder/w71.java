/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class w71
implements View.OnClickListener {
    public final /* synthetic */ x71_0 a;

    public /* synthetic */ w71(x71_0 x71_02) {
        this.a = x71_02;
    }

    public final void onClick(View view) {
        x71_0 x71_02 = this.a;
        Intrinsics.checkNotNullParameter(x71_02, "this$0");
        view = x71_02.j;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgFullScreen");
            view = null;
        }
        view = view.getContext();
        Intrinsics.checkNotNullExpressionValue(view, "getContext(...)");
        x71_02.B((Context)view);
    }
}

