/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnVerifyActivity;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.a;
import com.ril.ajio.myaccount.order.imps.d;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qK
 */
public final class qk_2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetDialogFragment b;

    public /* synthetic */ qk_2(BottomSheetDialogFragment bottomSheetDialogFragment, int n3) {
        this.a = n3;
        this.b = bottomSheetDialogFragment;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                pc1_2 pc1_22 = (pc1_2)this.b;
                Intrinsics.checkNotNullParameter(pc1_22, "this$0");
                object = pc1_22.getTargetFragment();
                n3 = object instanceof d;
                if (n3 != 0) {
                    object = pc1_22.getTargetFragment();
                    String string2 = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.imps.ImpsAccountDetailsFragment";
                    Intrinsics.checkNotNull(object, string2);
                    object = (d)object;
                    ((d)object).submitRequest();
                    pc1_22.dismiss();
                } else {
                    object = pc1_22.getActivity();
                    n3 = object instanceof ExchangeReturnVerifyActivity;
                    if (n3 != 0) {
                        boolean bl2;
                        object = pc1_22.getActivity();
                        Object object2 = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnVerifyActivity";
                        Intrinsics.checkNotNull(object, (String)object2);
                        object = (ExchangeReturnVerifyActivity)object;
                        boolean bl3 = ((ExchangeReturnVerifyActivity)object).J0;
                        if (bl3 && (object2 = ((ExchangeReturnVerifyActivity)object).s0) != null && (bl3 = ((ReturnOrderItemDetails)object2).isOtpVerificationRequired()) == (bl2 = true)) {
                            ((ExchangeReturnVerifyActivity)object).t2();
                        } else {
                            ((ExchangeReturnVerifyActivity)object).s2();
                        }
                        pc1_22.dismiss();
                    } else {
                        pc1_22.dismiss();
                    }
                }
                return;
            }
            case 0: 
        }
        a a2 = (a)this.b;
        Intrinsics.checkNotNullParameter(a2, "this$0");
        a2.dismiss();
    }
}

