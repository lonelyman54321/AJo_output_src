/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.myaccount.order;

import com.ril.ajio.myaccount.order.MarkDeliveredActivity;

class MarkDeliveredActivity$1
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ MarkDeliveredActivity b;

    public MarkDeliveredActivity$1(MarkDeliveredActivity markDeliveredActivity, String string2) {
        this.b = markDeliveredActivity;
        this.a = string2;
    }

    public final void run() {
        MarkDeliveredActivity markDeliveredActivity = this.b;
        Object object = markDeliveredActivity.z0;
        String string2 = this.a;
        object.setContentDescription((CharSequence)string2);
        object = cp_1.Companion;
        int n3 = km_1.b((cp$a)object);
        if (n3 != 0) {
            markDeliveredActivity.z0.setImportantForAccessibility(1);
            object = markDeliveredActivity.z0;
            int n4 = 64;
            object.performAccessibilityAction(n4, null);
            markDeliveredActivity = markDeliveredActivity.z0;
            n3 = 4;
            markDeliveredActivity.sendAccessibilityEvent(n3);
        }
    }
}

