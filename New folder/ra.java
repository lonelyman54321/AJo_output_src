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

public final class ra
implements View.OnClickListener {
    public final /* synthetic */ BottomSheetDialog a;

    public /* synthetic */ ra(BottomSheetDialog bottomSheetDialog) {
        this.a = bottomSheetDialog;
    }

    public final void onClick(View view) {
        BottomSheetDialog bottomSheetDialog = this.a;
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "$brandDescDialog");
        bottomSheetDialog.dismiss();
    }
}

