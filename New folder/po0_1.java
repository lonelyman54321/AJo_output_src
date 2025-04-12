/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.payment.fragment.h;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Po0
 */
public final class po0_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ po0_1(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                h h3 = (h)this.b;
                Intrinsics.checkNotNullParameter(h3, "this$0");
                view = h3.x;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("txtExpiryMonthError");
                    n3 = 0;
                    view = null;
                }
                ai0_2.i(view);
                h3.Xa("month");
                return;
            }
            case 0: 
        }
        so0_2 so0_22 = (so0_2)this.b;
        Intrinsics.checkNotNullParameter(so0_22, "this$0");
        so0_22.dismissAllowingStateLoss();
    }
}

