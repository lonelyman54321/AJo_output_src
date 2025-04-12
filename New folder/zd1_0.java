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
 * Renamed from zD1
 */
public final class zd1_0
implements View.OnClickListener {
    public final /* synthetic */ ad1_2 a;
    public final /* synthetic */ int b;

    public /* synthetic */ zd1_0(ad1_2 ad1_22, int n3) {
        this.a = ad1_22;
        this.b = n3;
    }

    public final void onClick(View object) {
        ad1_2 ad1_22 = this.a;
        Intrinsics.checkNotNullParameter(ad1_22, "this$0");
        object = ad1_22.a;
        int n3 = this.b;
        object.e(n3);
    }
}

