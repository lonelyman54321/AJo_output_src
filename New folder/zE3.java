/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class zE3
implements View.OnClickListener {
    public final /* synthetic */ ae3_1 a;

    public /* synthetic */ zE3(ae3_1 ae3_12) {
        this.a = ae3_12;
    }

    public final void onClick(View object) {
        ae3_1 ae3_12 = this.a;
        Intrinsics.checkNotNullParameter(ae3_12, "this$0");
        object = ae3_12.a;
        if (object != null) {
            object.v8();
        }
        if (object != null) {
            object.U4();
        }
    }
}

