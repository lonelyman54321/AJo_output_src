/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 */
import android.content.DialogInterface;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.Intrinsics;

public final class y52
implements DialogInterface.OnShowListener {
    public final void onShow(DialogInterface object) {
        z52$a_0 z52$a_0 = z52_0.Companion;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        int n3 = R$id.design_bottom_sheet;
        z52$a_0 = ((on)object).findViewById(n3);
        if (z52$a_0 != null) {
            z52$a_0.setBackgroundResource(17170445);
            BottomSheetBehavior bottomSheetBehavior = ((BottomSheetDialog)object).getBehavior();
            int n4 = z52$a_0.getHeight();
            bottomSheetBehavior.setPeekHeight(n4);
            object = ((BottomSheetDialog)object).getBehavior();
            boolean bl2 = true;
            ((BottomSheetBehavior)object).setFitToContents(bl2);
            object = z52$a_0.getParent().getParent();
            object.requestLayout();
        }
    }
}

