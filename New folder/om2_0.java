/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.util.DisplayMetrics
 *  android.view.View
 */
import android.content.DialogInterface;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OM2
 */
public final class om2_0
implements DialogInterface.OnShowListener {
    public final /* synthetic */ BottomSheetDialog a;
    public final /* synthetic */ pm2_2 b;

    public /* synthetic */ om2_0(BottomSheetDialog bottomSheetDialog, pm2_2 pm2_22) {
        this.a = bottomSheetDialog;
        this.b = pm2_22;
    }

    public final void onShow(DialogInterface object) {
        object = pm2_2.Companion;
        BottomSheetDialog bottomSheetDialog = this.a;
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "$bottomSheetDialog");
        pm2_2 pm2_22 = this.b;
        Intrinsics.checkNotNullParameter(pm2_22, "this$0");
        int n3 = R$id.design_bottom_sheet;
        object = bottomSheetDialog.findViewById(n3);
        if (object != null) {
            object.setBackgroundColor(0);
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View)object);
            bottomSheetBehavior.setDraggable(false);
            object = BottomSheetBehavior.from((View)object);
            bottomSheetDialog = pm2_22.getResources().getDisplayMetrics();
            double d2 = ((DisplayMetrics)bottomSheetDialog).heightPixels;
            double d5 = 0.9;
            int n4 = (int)(d2 *= d5);
            ((BottomSheetBehavior)object).setPeekHeight(n4);
        }
    }
}

