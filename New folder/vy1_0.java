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
 * Renamed from Vy1
 */
public final class vy1_0
implements DialogInterface.OnShowListener {
    public final void onShow(DialogInterface object) {
        Object object2 = fz1_2.Companion;
        object2 = "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog";
        Intrinsics.checkNotNull(object, (String)object2);
        object = (BottomSheetDialog)object;
        int n3 = R$id.design_bottom_sheet;
        object = ((on)object).findViewById(n3);
        if (object != null) {
            object = BottomSheetBehavior.from((View)object);
            n3 = 3;
            ((BottomSheetBehavior)object).setState(n3);
        }
    }
}

