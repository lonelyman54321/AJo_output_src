/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bQ0
 */
public final class bq0_2
implements Runnable {
    public final /* synthetic */ fq0_2 a;

    public /* synthetic */ bq0_2(fq0_2 fq0_22) {
        this.a = fq0_22;
    }

    public final void run() {
        Object object = fq0_2.Companion;
        object = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((fq0_2)object).z;
        if (object != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
    }
}

