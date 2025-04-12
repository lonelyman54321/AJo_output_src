/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.ril.ajio.customviews.FeedbackRatingSnackbar;
import com.ril.ajio.myaccount.order.fragment.b;
import com.ril.ajio.myaccount.order.fragment.b$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wf2
 */
public final class wf2_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wf2_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                String string2 = "this$0";
                object = (ir2_2)object;
                Intrinsics.checkNotNullParameter(object, string2);
                object = ((ir2_2)object).b;
                if (object != null) {
                    object.M7();
                }
                return;
            }
            case 0: 
        }
        b$a b$a = com.ril.ajio.myaccount.order.fragment.b.Companion;
        object = (FeedbackRatingSnackbar)object;
        Intrinsics.checkNotNullParameter(object, "$snackbar");
        ((BaseTransientBottomBar)object).dismiss();
    }
}

