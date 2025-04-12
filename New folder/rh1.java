/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class rh1
implements View.OnClickListener {
    public final /* synthetic */ sh1_0 a;

    public /* synthetic */ rh1(sh1_0 sh1_02) {
        this.a = sh1_02;
    }

    public final void onClick(View view) {
        sh1_0 sh1_02 = this.a;
        Intrinsics.checkNotNullParameter(sh1_02, "this$0");
        sh1_02.dismiss();
    }
}

