/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.R$id;
import com.ril.ajio.myaccount.address.fragment.a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mK2
 */
public final class mk2_2
implements View.OnClickListener {
    public final /* synthetic */ a a;

    public /* synthetic */ mk2_2(a a2) {
        this.a = a2;
    }

    public final void onClick(View object) {
        String string2 = "this$0";
        a a2 = this.a;
        Intrinsics.checkNotNullParameter(a2, string2);
        int n3 = object.getId();
        int n4 = R$id.fracrIvClose;
        if (n3 != n4 && n3 != (n4 = R$id.fracrVClose) && n3 != (n4 = R$id.fracrTvCancel)) {
            n4 = R$id.fracrTvReset;
            if (n3 == n4) {
                object = a2.a;
                if (object != null) {
                    a2.dismissAllowingStateLoss();
                    object = a2.a;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("resetAddressListener");
                        n3 = 0;
                        object = null;
                    }
                    object.z9();
                } else {
                    a2.dismissAllowingStateLoss();
                }
            }
        } else {
            a2.dismissAllowingStateLoss();
        }
    }
}

