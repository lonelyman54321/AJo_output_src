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

public final class v71
implements View.OnClickListener {
    public final /* synthetic */ x71_0 a;

    public /* synthetic */ v71(x71_0 x71_02) {
        this.a = x71_02;
    }

    public final void onClick(View object) {
        x71_0 x71_02 = this.a;
        Intrinsics.checkNotNullParameter(x71_02, "this$0");
        object = x71_02.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
            object = null;
        }
        object = object.getContext();
        Intrinsics.checkNotNullExpressionValue(object, "getContext(...)");
        x71_02.B((Context)object);
    }
}

