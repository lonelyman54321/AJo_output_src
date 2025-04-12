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
 * Renamed from NH2
 */
public final class nh2_0
implements DialogInterface.OnShowListener {
    public final /* synthetic */ BottomSheetDialog a;

    public /* synthetic */ nh2_0(BottomSheetDialog bottomSheetDialog) {
        this.a = bottomSheetDialog;
    }

    public final void onShow(DialogInterface view) {
        view = oh2_2.h;
        BottomSheetDialog bottomSheetDialog = this.a;
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "$dialog");
        int n3 = R$id.design_bottom_sheet;
        view = bottomSheetDialog.findViewById(n3);
        if (view != null) {
            bottomSheetDialog = null;
            int n4 = 6;
            jm_2.a(view, view, 0, n4);
        }
    }
}

