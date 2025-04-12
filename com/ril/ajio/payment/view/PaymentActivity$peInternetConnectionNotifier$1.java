/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 */
package com.ril.ajio.payment.view;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import com.ril.ajio.payment.view.PaymentActivity;
import kotlin.jvm.internal.Intrinsics;

public final class PaymentActivity$peInternetConnectionNotifier$1
extends BroadcastReceiver {
    public final /* synthetic */ PaymentActivity a;

    public PaymentActivity$peInternetConnectionNotifier$1(PaymentActivity paymentActivity) {
        this.a = paymentActivity;
    }

    public final void onReceive(Context object, Intent object2) {
        Object object3 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object = "intent";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 >= n4) {
            object = jn2_0.a((Intent)object2);
        } else {
            object = object2.getSerializableExtra("alert_type");
            boolean bl2 = object instanceof ir2_1;
            if (!bl2) {
                n3 = 0;
                object = null;
            }
            object = (ir2_1)((Object)object);
        }
        object = (ir2_1)((Object)object);
        object2 = this.a;
        object3 = ((PaymentActivity)object2).A0;
        if (object3 != null) {
            ((CheckoutFragment)object3).h();
        }
        if (object == (object3 = ir2_1.OTHERS_ERRORS)) {
            ((PaymentActivity)object2).E2((Activity)object2, (ir2_1)((Object)object));
        } else {
            object3 = ir2_1.NO_INTERNET_RETRY_INITIATED;
            if (object == object3) {
                ((PaymentActivity)object2).E2((Activity)object2, (ir2_1)((Object)object));
            } else {
                object3 = ir2_1.NO_INTERNET_RETRY_SUCCESS;
                if (object == object3) {
                    ((PaymentActivity)object2).E2((Activity)object2, (ir2_1)((Object)object));
                } else {
                    ((PaymentActivity)object2).E2((Activity)object2, (ir2_1)((Object)object));
                }
            }
        }
    }
}

