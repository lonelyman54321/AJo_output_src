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
 * Renamed from bY1
 */
public final class by1_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetDialog b;

    public /* synthetic */ by1_0(BottomSheetDialog bottomSheetDialog, int n3) {
        this.a = n3;
        this.b = bottomSheetDialog;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                BottomSheetDialog bottomSheetDialog = this.b;
                Intrinsics.checkNotNullParameter(bottomSheetDialog, "$dialog");
                bottomSheetDialog.dismiss();
                return;
            }
            case 0: 
        }
        BottomSheetDialog bottomSheetDialog = this.b;
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "$closetDeleteDialog");
        bottomSheetDialog.dismiss();
    }
}

