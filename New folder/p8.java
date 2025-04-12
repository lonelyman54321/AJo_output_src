/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.jvm.internal.Intrinsics;

public final class p8
implements Runnable {
    public final /* synthetic */ q9_0 a;

    public /* synthetic */ p8(q9_0 q9_02) {
        this.a = q9_02;
    }

    public final void run() {
        Object object = q9_0.Companion;
        object = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((q9_0)object).U0;
        if (object != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
    }
}

