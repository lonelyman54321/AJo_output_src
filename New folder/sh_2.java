/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.FrameLayout
 */
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.payment.fragment.a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sH
 */
public final class sh_2
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ a a;

    public /* synthetic */ sh_2(a a2) {
        this.a = a2;
    }

    public final void onGlobalLayout() {
        int n3;
        a a2 = this.a;
        Intrinsics.checkNotNullParameter(a2, "this$0");
        Object object = (BottomSheetDialog)a2.getDialog();
        if (object != null && (object = (FrameLayout)((on)object).findViewById(n3 = R$id.design_bottom_sheet)) != null) {
            object = BottomSheetBehavior.from((View)object);
            Intrinsics.checkNotNullExpressionValue(object, "from(...)");
            ((BottomSheetBehavior)object).setState(3);
            n3 = 0;
            a2 = null;
            ((BottomSheetBehavior)object).setPeekHeight(0);
        }
    }
}

