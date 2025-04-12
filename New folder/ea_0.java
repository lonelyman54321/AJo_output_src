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
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eA
 */
public final class ea_0
implements DialogInterface.OnShowListener {
    public final void onShow(DialogInterface object) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        ((BottomSheetDialog)object).setCancelable(false);
        int n3 = R$id.design_bottom_sheet;
        object = ((on)object).findViewById(n3);
        if (object != null) {
            n3 = 3;
            jm_2.a((View)object, (View)object, 0, n3);
        }
    }
}

