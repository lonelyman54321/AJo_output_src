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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AS1
 */
public final class as1_2
implements DialogInterface.OnShowListener {
    public final void onShow(DialogInterface object) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        int n3 = R$id.design_bottom_sheet;
        View view = ((on)object).findViewById(n3);
        if (view != null) {
            view.setBackgroundResource(17170445);
            BottomSheetBehavior bottomSheetBehavior = ((BottomSheetDialog)object).getBehavior();
            int n4 = view.getHeight();
            bottomSheetBehavior.setPeekHeight(n4);
            object = ((BottomSheetDialog)object).getBehavior();
            boolean bl2 = true;
            ((BottomSheetBehavior)object).setFitToContents(bl2);
            object = view.getParent().getParent();
            object.requestLayout();
        }
    }
}

