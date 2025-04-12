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
 * Renamed from wv2
 */
public final class wv2_0
implements View.OnClickListener {
    public final /* synthetic */ xv2_1 a;
    public final /* synthetic */ int b;

    public /* synthetic */ wv2_0(xv2_1 xv2_12, int n3) {
        this.a = xv2_12;
        this.b = n3;
    }

    public final void onClick(View object) {
        xv2_1 xv2_12 = this.a;
        Intrinsics.checkNotNullParameter(xv2_12, "this$0");
        object = xv2_12.a;
        int n3 = this.b;
        object.r8(n3);
    }
}

