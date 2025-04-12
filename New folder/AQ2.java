/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class AQ2
implements View.OnClickListener {
    public final /* synthetic */ cq2_0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ AQ2(cq2_0 cq2_02, int n3) {
        this.a = cq2_02;
        this.b = n3;
    }

    public final void onClick(View object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = ((cq2_0)object2).b;
        object2 = this.b;
        object.invoke(object2);
    }
}

