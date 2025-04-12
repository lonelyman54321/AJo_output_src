/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 */
import android.content.DialogInterface;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hW1
 */
public final class hw1_0
implements DialogInterface.OnShowListener {
    public final /* synthetic */ BottomSheetDialog a;

    public /* synthetic */ hw1_0(BottomSheetDialog bottomSheetDialog) {
        this.a = bottomSheetDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        BottomSheetDialog bottomSheetDialog = this.a;
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "$dodTimesUpDialog");
        int n3 = R$id.design_bottom_sheet;
        dialogInterface = bottomSheetDialog.findViewById(n3);
        if (dialogInterface != null) {
            bottomSheetDialog = null;
            dialogInterface.setBackgroundColor(0);
        }
    }
}

