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
 * Renamed from tO
 */
public final class to_1
implements DialogInterface.OnShowListener {
    public final /* synthetic */ BottomSheetDialog a;

    public /* synthetic */ to_1(BottomSheetDialog bottomSheetDialog) {
        this.a = bottomSheetDialog;
    }

    public final void onShow(DialogInterface object) {
        object = uo_2.Companion;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$dialog");
        int n3 = R$id.design_bottom_sheet;
        object = ((on)object2).findViewById(n3);
        if (object != null) {
            object.setBackgroundColor(0);
            object2 = BottomSheetBehavior.from((View)object);
            String string2 = "from(...)";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            int n4 = 3;
            ((BottomSheetBehavior)object2).setState(n4);
            n3 = object.getHeight();
            ((BottomSheetBehavior)object2).setPeekHeight(n3);
        }
    }
}

