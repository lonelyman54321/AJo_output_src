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
 * Renamed from ds0
 */
public final class ds0_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetDialogFragment b;

    public /* synthetic */ ds0_0(BottomSheetDialogFragment bottomSheetDialogFragment, int n3) {
        this.a = n3;
        this.b = bottomSheetDialogFragment;
    }

    public final void onClick(View object) {
        object = this.b;
        String string2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (x32_0)object;
                Intrinsics.checkNotNullParameter(object, string2);
                ((BottomSheetDialogFragment)object).dismiss();
                return;
            }
            case 0: 
        }
        object = (es0_1)object;
        Intrinsics.checkNotNullParameter(object, string2);
        ((BottomSheetDialogFragment)object).dismiss();
    }
}

