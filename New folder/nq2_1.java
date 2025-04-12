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
 * Renamed from Nq2
 */
public final class nq2_1
implements DialogInterface.OnShowListener {
    public final void onShow(DialogInterface object) {
        Oq2$a oq2$a = oq2_1.Companion;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        int n3 = R$id.design_bottom_sheet;
        oq2$a = ((on)object).findViewById(n3);
        if (oq2$a != null) {
            oq2$a.setBackgroundResource(17170445);
            BottomSheetBehavior bottomSheetBehavior = ((BottomSheetDialog)object).getBehavior();
            int n4 = oq2$a.getHeight();
            bottomSheetBehavior.setPeekHeight(n4);
            object = ((BottomSheetDialog)object).getBehavior();
            boolean bl2 = true;
            ((BottomSheetBehavior)object).setFitToContents(bl2);
            object = oq2$a.getParent().getParent();
            object.requestLayout();
        }
    }
}

