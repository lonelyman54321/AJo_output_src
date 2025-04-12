/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.myaccount.order.cancel.CancelReasonFragment;
import in.juspay.hypersdk.analytics.LogSessioniserExp;

/*
 * Renamed from AK
 */
public final class ak_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ak_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                LogSessioniserExp.c((LogSessioniserExp)object);
                return;
            }
            case 0: 
        }
        object = (CancelReasonFragment)object;
        object.getClass();
        Bundle bundle = new Bundle();
        String string2 = ((CancelReasonFragment)object).g;
        bundle.putString("order_no", string2);
        int n4 = ((CancelReasonFragment)object).h.getEntryNumber();
        bundle.putInt("cart_entry_no", n4);
        ((CancelReasonFragment)object).l.onFragmentInteraction("com.ril.ajio.myaccount.order.cancel.CancelReasonFragment", 1, bundle);
    }
}

