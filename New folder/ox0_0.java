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
import androidx.fragment.app.Fragment;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oX0
 */
public final class ox0_0
implements DialogInterface.OnShowListener {
    public final /* synthetic */ px0_2 a;

    public /* synthetic */ ox0_0(px0_2 px0_22) {
        this.a = px0_22;
    }

    public final void onShow(DialogInterface object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        int n3 = R$id.design_bottom_sheet;
        object = ((on)object).findViewById(n3);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        object2 = ((Fragment)object2).getActivity();
        if (object2 != null && (object2 = object2.getWindowManager()) != null && (object2 = object2.getDefaultDisplay()) != null) {
            object2.getMetrics(displayMetrics);
        }
        n3 = displayMetrics.heightPixels;
        if (object != null) {
            object2 = BottomSheetBehavior.from((View)object);
            ((BottomSheetBehavior)object2).setPeekHeight(n3);
            displayMetrics = null;
            object.setBackgroundColor(0);
            object = BottomSheetBehavior.from((View)object);
            n3 = 3;
            ((BottomSheetBehavior)object).setState(n3);
        }
    }
}

