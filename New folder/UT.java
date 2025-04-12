/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.web.game.MyRewardsWebActivity;
import kotlin.jvm.internal.Intrinsics;

public final class UT
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ UT(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = this.b;
        Object object2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (MyRewardsWebActivity)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                ((MyRewardsWebActivity)object).q1();
                return;
            }
            case 1: {
                object = (io0_1)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
                object2 = ((io0_1)object).a;
                if (object2 != null) {
                    object = ((io0_1)object).b;
                    object2.S3((PaymentInstrumentInfo)object);
                }
                return;
            }
            case 0: 
        }
        object = (wt_0)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((wt_0)object).e;
        boolean bl2 = object.isChecked() ^ true;
        object.setChecked(bl2);
    }
}

