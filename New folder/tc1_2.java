/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnVerifyActivity;
import com.ril.ajio.myaccount.order.imps.c;
import com.ril.ajio.myaccount.order.imps.d;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tc1
 */
public final class tc1_2
implements View.OnClickListener {
    public final /* synthetic */ c a;

    public /* synthetic */ tc1_2(c c2) {
        this.a = c2;
    }

    public final void onClick(View object) {
        c c2 = this.a;
        Intrinsics.checkNotNullParameter(c2, "this$0");
        object = c2.getTargetFragment();
        boolean bl2 = object instanceof d;
        if (bl2) {
            object = c2.getTargetFragment();
            String string2 = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.imps.ImpsAccountDetailsFragment";
            Intrinsics.checkNotNull(object, string2);
            object = (d)object;
            ((d)object).submitRequest();
            c2.dismiss();
        } else {
            object = c2.getActivity();
            bl2 = object instanceof ExchangeReturnVerifyActivity;
            if (bl2) {
                object = c2.getActivity();
                String string3 = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnVerifyActivity";
                Intrinsics.checkNotNull(object, string3);
                object = (ExchangeReturnVerifyActivity)object;
                ((ExchangeReturnVerifyActivity)object).r2();
                c2.dismiss();
            } else {
                c2.dismiss();
            }
        }
    }
}

