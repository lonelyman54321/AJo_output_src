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
 * Renamed from s93
 */
public final class s93_0
implements View.OnClickListener {
    public final /* synthetic */ u93_0 a;

    public /* synthetic */ s93_0(u93_0 u93_02) {
        this.a = u93_02;
    }

    public final void onClick(View view) {
        u93_0 u93_02 = this.a;
        Intrinsics.checkNotNullParameter(u93_02, "this$0");
        u93_02.dismiss();
    }
}

