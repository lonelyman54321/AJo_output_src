/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.myaccount.order.cancel.CancelReasonFragment;

/*
 * Renamed from zK
 */
public final class zk_2
implements Runnable {
    public final /* synthetic */ CancelReasonFragment a;

    public /* synthetic */ zk_2(CancelReasonFragment cancelReasonFragment) {
        this.a = cancelReasonFragment;
    }

    public final void run() {
        CancelReasonFragment cancelReasonFragment = this.a;
        cancelReasonFragment.getClass();
        Bundle bundle = new Bundle();
        String string2 = cancelReasonFragment.g;
        bundle.putString("order_no", string2);
        int n3 = cancelReasonFragment.h.getEntryNumber();
        bundle.putInt("cart_entry_no", n3);
        cancelReasonFragment.l.onFragmentInteraction("com.ril.ajio.myaccount.order.cancel.CancelReasonFragment", 1, bundle);
    }
}

