/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.widget.LinearLayout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.PdpRatingReviewParentBinding;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OZ1
 */
public final class oz1_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oz1_0(pz1_0 pz1_02, int n3) {
        this.a = 0;
        this.b = pz1_02;
    }

    public /* synthetic */ oz1_0(PdpRatingReviewParentBinding pdpRatingReviewParentBinding) {
        this.a = 1;
        this.b = pdpRatingReviewParentBinding;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (PdpRatingReviewParentBinding)this.b;
                Intrinsics.checkNotNullParameter(object, "$this_apply");
                Rz3$a rz3$a = rz3_0.Companion;
                LinearLayout linearLayout = ((PdpRatingReviewParentBinding)object).moreContainer;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "moreContainer");
                AjioTextView ajioTextView = ((PdpRatingReviewParentBinding)object).viewHandle;
                Intrinsics.checkNotNullExpressionValue(ajioTextView, "viewHandle");
                LinearLayout linearLayout2 = ((PdpRatingReviewParentBinding)object).allRatingContainer;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "allRatingContainer");
                object = ((PdpRatingReviewParentBinding)object).subRatingSummary;
                Intrinsics.checkNotNullExpressionValue(object, "subRatingSummary");
                rz3$a.getClass();
                Rz3$a.a((View)linearLayout, ajioTextView, (View)linearLayout2, (View)object, false);
                return;
            }
            case 0: 
        }
        object = (pz1_0)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((pz1_0)object).w();
    }
}

