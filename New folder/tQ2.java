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
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.Intrinsics;

public final class tQ2
implements DialogInterface.OnShowListener {
    public final /* synthetic */ BottomSheetDialog a;

    public /* synthetic */ tQ2(BottomSheetDialog bottomSheetDialog) {
        this.a = bottomSheetDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        BottomSheetDialog bottomSheetDialog = this.a;
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "$dialog");
        int n3 = R$id.design_bottom_sheet;
        dialogInterface = bottomSheetDialog.findViewById(n3);
        bottomSheetDialog = null;
        if (dialogInterface != null) {
            dialogInterface.setBackgroundColor(0);
        }
        if (dialogInterface != null) {
            int n4 = 3;
            jm_2.a((View)dialogInterface, (View)dialogInterface, 0, n4);
        }
    }
}

