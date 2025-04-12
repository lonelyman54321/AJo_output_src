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

/*
 * Renamed from Do0
 */
public final class do0_1
implements DialogInterface.OnShowListener {
    public final void onShow(DialogInterface object) {
        eo0$a_0 eo0$a_0 = eo0_2.Companion;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        int n3 = R$id.design_bottom_sheet;
        eo0$a_0 = ((on)object).findViewById(n3);
        if (eo0$a_0 != null) {
            eo0$a_0.setBackgroundResource(17170445);
            BottomSheetBehavior bottomSheetBehavior = ((BottomSheetDialog)object).getBehavior();
            int n4 = eo0$a_0.getHeight();
            bottomSheetBehavior.setPeekHeight(n4);
            object = ((BottomSheetDialog)object).getBehavior();
            boolean bl2 = true;
            ((BottomSheetBehavior)object).setFitToContents(bl2);
            object = eo0$a_0.getParent().getParent();
            object.requestLayout();
        }
    }
}

