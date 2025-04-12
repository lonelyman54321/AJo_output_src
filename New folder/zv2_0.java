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
 * Renamed from zv2
 */
public final class zv2_0
implements View.OnClickListener {
    public final /* synthetic */ av2_1 a;
    public final /* synthetic */ int b;

    public /* synthetic */ zv2_0(av2_1 av2_12, int n3) {
        this.a = av2_12;
        this.b = n3;
    }

    public final void onClick(View object) {
        av2_1 av2_12 = this.a;
        Intrinsics.checkNotNullParameter(av2_12, "this$0");
        object = av2_12.a;
        int n3 = this.b;
        object.f7(n3);
    }
}

