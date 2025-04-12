/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.pdprefresh.holders.PDPStylingIdeasVideoHolder;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QK
 */
public final class qk_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qk_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                PDPStylingIdeasVideoHolder.a((PDPStylingIdeasVideoHolder)this.b);
                return;
            }
            case 0: 
        }
        object = (sk_2)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        oT.b("upi cancellation halfcard interactions", "buttonTap", "Do not Cancel", "upi_cancellation_halfcard_interactions", "upi_cancellation_halfcard_screen");
        ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
    }
}

