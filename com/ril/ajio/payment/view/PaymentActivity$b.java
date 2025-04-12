/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.ril.ajio.payment.view;

import android.view.View;
import com.ril.ajio.payment.view.PaymentActivity;
import kotlin.jvm.internal.Intrinsics;

public final class PaymentActivity$b
implements View.OnClickListener {
    public final /* synthetic */ PaymentActivity a;

    public PaymentActivity$b(PaymentActivity paymentActivity, String string2) {
        Intrinsics.checkNotNullParameter(string2, "json");
        this.a = paymentActivity;
    }

    public final void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "v");
        PaymentActivity paymentActivity = this.a;
        paymentActivity.setResult(71);
        paymentActivity.finish();
    }
}

