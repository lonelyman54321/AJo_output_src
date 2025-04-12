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
 * Renamed from JC2
 */
public final class jc2_0
implements View.OnClickListener {
    public final /* synthetic */ kc2_2 a;

    public /* synthetic */ jc2_0(kc2_2 kc2_22) {
        this.a = kc2_22;
    }

    public final void onClick(View view) {
        kc2_2 kc2_22 = this.a;
        Intrinsics.checkNotNullParameter(kc2_22, "this$0");
        kc2_22.onNavigationClick();
    }
}

