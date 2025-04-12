/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.ril.ajio.myaccount.order.cancel;

import android.os.Bundle;
import com.ril.ajio.myaccount.order.cancel.CancelReasonFragment;

class CancelReasonFragment$2
implements Runnable {
    public final /* synthetic */ CancelReasonFragment a;

    public CancelReasonFragment$2(CancelReasonFragment cancelReasonFragment) {
        this.a = cancelReasonFragment;
    }

    public final void run() {
        CancelReasonFragment cancelReasonFragment = this.a;
        cancelReasonFragment.q = false;
        Bundle bundle = new Bundle();
        String string2 = cancelReasonFragment.g;
        bundle.putString("order_no", string2);
        int n3 = cancelReasonFragment.h.getEntryNumber();
        bundle.putInt("cart_entry_no", n3);
        cancelReasonFragment.l.onFragmentInteraction("com.ril.ajio.myaccount.order.cancel.CancelReasonFragment", 1, bundle);
    }
}

