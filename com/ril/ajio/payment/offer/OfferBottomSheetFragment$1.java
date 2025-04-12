/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.LinearLayout
 */
package com.ril.ajio.payment.offer;

import android.widget.LinearLayout;
import com.ril.ajio.R$string;

class OfferBottomSheetFragment$1
implements Runnable {
    public final /* synthetic */ LinearLayout a;

    public OfferBottomSheetFragment$1(LinearLayout linearLayout) {
        this.a = linearLayout;
    }

    public final void run() {
        Object object = hv3_0.K(R$string.acc_info_popup);
        int n3 = R$string.offers;
        String string2 = hv3_0.K(n3);
        int n4 = 1;
        Object[] objectArray = new Object[n4];
        objectArray[0] = string2;
        object = String.format((String)object, objectArray);
        string2 = this.a;
        string2.setContentDescription((CharSequence)object);
        object = cp_1.Companion;
        int n7 = km_1.b((cp$a)object);
        if (n7 != 0) {
            string2.setImportantForAccessibility(n4);
            n4 = 0;
            string2.performAccessibilityAction(64, null);
            n7 = 4;
            string2.sendAccessibilityEvent(n7);
        }
    }
}

