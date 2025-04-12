/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.util.DisplayMetrics
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.DialogInterface;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mc3
 */
public final class mc3_1
implements DialogInterface.OnShowListener {
    public final /* synthetic */ nc3_2 a;

    public /* synthetic */ mc3_1(nc3_2 nc3_22) {
        this.a = nc3_22;
    }

    public final void onShow(DialogInterface object) {
        Nc3$a nc3$a = nc3_2.Companion;
        sD3 sD32 = this.a;
        Intrinsics.checkNotNullParameter(sD32, "this$0");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        int n3 = R$id.design_bottom_sheet;
        nc3$a = ((on)object).findViewById(n3);
        if (nc3$a != null) {
            nc3$a.setBackgroundResource(17170445);
            BottomSheetBehavior bottomSheetBehavior = ((BottomSheetDialog)object).getBehavior();
            int n4 = nc3$a.getHeight();
            bottomSheetBehavior.setPeekHeight(n4);
            boolean bl2 = sD32.e;
            if (bl2) {
                int n7;
                bottomSheetBehavior = nc3$a.getLayoutParams();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                if ((sD32 = sD32.getActivity()) != null && (sD32 = sD32.getWindowManager()) != null && (sD32 = sD32.getDefaultDisplay()) != null) {
                    sD32.getMetrics(displayMetrics);
                }
                ((ViewGroup.LayoutParams)bottomSheetBehavior).height = n7 = displayMetrics.heightPixels;
                object = ((BottomSheetDialog)object).getBehavior();
                n7 = 3;
                ((BottomSheetBehavior)object).setState(n7);
            } else {
                object = ((BottomSheetDialog)object).getBehavior();
                boolean bl3 = true;
                ((BottomSheetBehavior)object).setFitToContents(bl3);
            }
            object = nc3$a.getParent().getParent();
            object.requestLayout();
        }
    }
}

