/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.ril.ajio.payment.view;

import android.view.View;
import com.ril.ajio.R$anim;
import com.ril.ajio.payment.view.PaymentActivity;
import kotlin.jvm.internal.Intrinsics;

public final class PaymentActivity$a
implements View.OnClickListener {
    public final /* synthetic */ PaymentActivity a;

    public PaymentActivity$a(PaymentActivity paymentActivity) {
        this.a = paymentActivity;
    }

    public final void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "v");
        PaymentActivity paymentActivity = this.a;
        paymentActivity.setResult(71);
        paymentActivity.finish();
        int n3 = R$anim.enter_from_left;
        int n4 = R$anim.exit_to_right;
        paymentActivity.overridePendingTransition(n3, n4);
    }
}

