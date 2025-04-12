/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LQ
 */
public final class lq_1
implements View.OnClickListener {
    public final /* synthetic */ mq_1 a;
    public final /* synthetic */ int b;

    public /* synthetic */ lq_1(mq_1 mq_12, int n3) {
        this.a = mq_12;
        this.b = n3;
    }

    public final void onClick(View object) {
        mq_1 mq_12 = this.a;
        Intrinsics.checkNotNullParameter(mq_12, "this$0");
        object = mq_12.a;
        int n3 = this.b;
        object.e(n3);
    }
}

