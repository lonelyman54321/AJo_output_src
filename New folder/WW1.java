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

public final class WW1
implements View.OnClickListener {
    public final /* synthetic */ BottomSheetDialog a;
    public final /* synthetic */ ex1_0 b;

    public /* synthetic */ WW1(BottomSheetDialog bottomSheetDialog, ex1_0 ex1_02) {
        this.a = bottomSheetDialog;
        this.b = ex1_02;
    }

    public final void onClick(View view) {
        BottomSheetDialog bottomSheetDialog = this.a;
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "$closetDeleteDialog");
        ex1_0 ex1_02 = this.b;
        Intrinsics.checkNotNullParameter(ex1_02, "this$0");
        bottomSheetDialog.dismiss();
        ex1_02.db();
    }
}

