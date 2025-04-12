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
 * Renamed from zV1
 */
public final class zv1_1
implements View.OnClickListener {
    public final /* synthetic */ iv1_2 a;

    public /* synthetic */ zv1_1(iv1_2 iv1_22) {
        this.a = iv1_22;
    }

    public final void onClick(View view) {
        iv1_2 iv1_22 = this.a;
        Intrinsics.checkNotNullParameter(iv1_22, "this$0");
        iv1_22.onNavigationClick();
    }
}

