/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 */
import android.content.DialogInterface;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from k32
 */
public final class k32_0
implements DialogInterface.OnShowListener {
    public final void onShow(DialogInterface object) {
        String string2 = "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog";
        Intrinsics.checkNotNull(object, string2);
        object = (BottomSheetDialog)object;
        int n3 = R$id.design_bottom_sheet;
        object = ((on)object).findViewById(n3);
        if (object != null) {
            n3 = 0;
            string2 = null;
            object.setBackgroundColor(0);
        }
    }
}

