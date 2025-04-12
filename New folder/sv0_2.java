/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.view.View
 */
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sv0
 */
public final class sv0_2
implements DialogInterface.OnShowListener {
    public final /* synthetic */ BottomSheetDialog a;

    public /* synthetic */ sv0_2(BottomSheetDialog bottomSheetDialog) {
        this.a = bottomSheetDialog;
    }

    public final void onShow(DialogInterface object) {
        BottomSheetDialog bottomSheetDialog = this.a;
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "$dialog");
        int n3 = R$id.design_bottom_sheet;
        object = bottomSheetDialog.findViewById(n3);
        if (object != null) {
            bottomSheetDialog = null;
            object.setBackgroundColor(0);
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View)object);
            int n4 = 3;
            bottomSheetBehavior.setState(n4);
            object = BottomSheetBehavior.from((View)object);
            ((BottomSheetBehavior)object).setDraggable(false);
        }
    }
}

