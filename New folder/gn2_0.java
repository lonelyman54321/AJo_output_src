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
 * Renamed from gN2
 */
public final class gn2_0
implements View.OnClickListener {
    public final /* synthetic */ in2_1 a;
    public final /* synthetic */ int b;

    public /* synthetic */ gn2_0(in2_1 in2_12, int n3) {
        this.a = in2_12;
        this.b = n3;
    }

    public final void onClick(View object) {
        in2_1 in2_12 = this.a;
        Intrinsics.checkNotNullParameter(in2_12, "this$0");
        object = in2_12.a;
        int n3 = this.b;
        object.za(n3);
    }
}

