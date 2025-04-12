/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.DialogInterface;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.pdprefresh.fragments.d;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bh0
 */
public final class bh0_0
implements DialogInterface.OnShowListener {
    public final /* synthetic */ BottomSheetDialog a;
    public final /* synthetic */ d b;

    public /* synthetic */ bh0_0(BottomSheetDialog bottomSheetDialog, d d2) {
        this.a = bottomSheetDialog;
        this.b = d2;
    }

    public final void onShow(DialogInterface object) {
        object = d.Companion;
        BottomSheetDialog bottomSheetDialog = this.a;
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "$dialog");
        d d2 = this.b;
        Intrinsics.checkNotNullParameter(d2, "this$0");
        int n3 = R$id.design_bottom_sheet;
        object = bottomSheetDialog.findViewById(n3);
        if (object != null) {
            int n4;
            d2.getClass();
            bottomSheetDialog = object.getLayoutParams();
            double d5 = d2.getResources().getDisplayMetrics().heightPixels;
            double d7 = 0.8;
            ((ViewGroup.LayoutParams)bottomSheetDialog).height = n4 = (int)(d5 * d7);
            object.setLayoutParams((ViewGroup.LayoutParams)bottomSheetDialog);
            object.setBackgroundColor(0);
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View)object);
            int n7 = 3;
            bottomSheetBehavior.setState(n7);
            bottomSheetBehavior = BottomSheetBehavior.from((View)object);
            bottomSheetBehavior.setDraggable(false);
            object = BottomSheetBehavior.from((View)object);
            bottomSheetDialog = d2.getResources().getDisplayMetrics();
            double d9 = ((DisplayMetrics)bottomSheetDialog).heightPixels;
            d5 = 0.75;
            int n8 = (int)(d9 *= d5);
            ((BottomSheetBehavior)object).setPeekHeight(n8);
        }
    }
}

