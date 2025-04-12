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
 * Renamed from MD1
 */
public final class md1_0
implements View.OnClickListener {
    public final /* synthetic */ nd1_2 a;
    public final /* synthetic */ int b;

    public /* synthetic */ md1_0(nd1_2 nd1_22, int n3) {
        this.a = nd1_22;
        this.b = n3;
    }

    public final void onClick(View object) {
        nd1_2 nd1_22 = this.a;
        Intrinsics.checkNotNullParameter(nd1_22, "this$0");
        object = nd1_22.a;
        int n3 = this.b;
        object.e(n3);
    }
}

