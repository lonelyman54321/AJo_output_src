/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.RelativeLayout
 */
import android.view.View;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VV1
 */
public final class vv1_2
implements Runnable {
    public final /* synthetic */ yv1_1 a;

    public /* synthetic */ vv1_2(yv1_1 yv1_12) {
        this.a = yv1_12;
    }

    public final void run() {
        yv1_1 yv1_12 = this.a;
        Intrinsics.checkNotNullParameter(yv1_12, "this$0");
        RelativeLayout relativeLayout = yv1_12.b;
        yv1_1 yv1_13 = null;
        String string2 = "mainLayout";
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            relativeLayout = null;
        }
        String string3 = yv1_12.h;
        relativeLayout.setContentDescription((CharSequence)string3);
        yv1_12 = yv1_12.b;
        if (yv1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            yv1_13 = yv1_12;
        }
        ai0_2.a((View)yv1_13);
    }
}

