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
 * Renamed from gW1
 */
public final class gw1_0
implements View.OnClickListener {
    public final /* synthetic */ BottomSheetDialog a;

    public /* synthetic */ gw1_0(BottomSheetDialog bottomSheetDialog) {
        this.a = bottomSheetDialog;
    }

    public final void onClick(View view) {
        BottomSheetDialog bottomSheetDialog = this.a;
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "$dodTimesUpDialog");
        bottomSheetDialog.dismiss();
    }
}

