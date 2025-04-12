/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.ril.ajio.payment.activity;

import android.view.View;

class BaseActivity$2
implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ String b;

    public BaseActivity$2(View view, String string2) {
        this.a = view;
        this.b = string2;
    }

    public final void run() {
        View view = this.a;
        Object object = this.b;
        view.setContentDescription((CharSequence)object);
        object = cp_1.Companion;
        int n3 = km_1.b((cp$a)object);
        if (n3 != 0) {
            view.setImportantForAccessibility(1);
            view.performAccessibilityAction(64, null);
            n3 = 4;
            view.sendAccessibilityEvent(n3);
        }
    }
}

