/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gb
 */
public final class gb_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetDialogFragment b;

    public /* synthetic */ gb_0(BottomSheetDialogFragment bottomSheetDialogFragment, int n3) {
        this.a = n3;
        this.b = bottomSheetDialogFragment;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                es2_2 es2_22 = (es2_2)this.b;
                Intrinsics.checkNotNullParameter(es2_22, "this$0");
                es2_22.dismiss();
                return;
            }
            case 0: 
        }
        ib_2 ib_22 = (ib_2)this.b;
        Intrinsics.checkNotNullParameter(ib_22, "this$0");
        ib_22.dismiss();
    }
}

