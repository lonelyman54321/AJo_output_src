/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UW1
 */
public final class uw1_0
implements View.OnClickListener {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ uw1_0(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        BottomSheetDialog bottomSheetDialog = object.y0;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.dismiss();
        }
        object.y0 = null;
    }
}

