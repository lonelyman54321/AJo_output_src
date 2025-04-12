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
 * Renamed from u52
 */
public final class u52_0
implements DialogInterface.OnShowListener {
    public final void onShow(DialogInterface object) {
        v52$a v52$a = v52_0.Companion;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        int n3 = R$id.design_bottom_sheet;
        v52$a = ((on)object).findViewById(n3);
        if (v52$a != null) {
            v52$a.setBackgroundResource(17170445);
            BottomSheetBehavior bottomSheetBehavior = ((BottomSheetDialog)object).getBehavior();
            int n4 = v52$a.getHeight();
            bottomSheetBehavior.setPeekHeight(n4);
            object = ((BottomSheetDialog)object).getBehavior();
            boolean bl2 = true;
            ((BottomSheetBehavior)object).setFitToContents(bl2);
            object = v52$a.getParent().getParent();
            object.requestLayout();
        }
    }
}

