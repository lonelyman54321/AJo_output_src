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
 * Renamed from NZ1
 */
public final class nz1_0
implements View.OnClickListener {
    public final /* synthetic */ pz1_0 a;

    public /* synthetic */ nz1_0(pz1_0 pz1_02, int n3) {
        this.a = pz1_02;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((pz1_0)object).w();
    }
}

