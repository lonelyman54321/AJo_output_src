/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 */
package com.ril.ajio.payment.activity;

import android.widget.TextView;

class BaseActivity$4
implements Runnable {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ String b;

    public BaseActivity$4(TextView textView, String string2) {
        this.a = textView;
        this.b = string2;
    }

    public final void run() {
        TextView textView = this.a;
        Object object = this.b;
        textView.setContentDescription((CharSequence)object);
        object = cp_1.Companion;
        int n3 = km_1.b((cp$a)object);
        if (n3 != 0) {
            textView.setImportantForAccessibility(1);
            textView.performAccessibilityAction(64, null);
            n3 = 4;
            textView.sendAccessibilityEvent(n3);
        }
    }
}

