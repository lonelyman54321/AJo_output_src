/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.clevertap.android.sdk.pushnotification.fcm;

import android.os.CountDownTimer;
import com.clevertap.android.sdk.pushnotification.fcm.CTFirebaseMessagingReceiver;

public final class CTFirebaseMessagingReceiver$a
extends CountDownTimer {
    public final /* synthetic */ CTFirebaseMessagingReceiver a;

    public CTFirebaseMessagingReceiver$a(CTFirebaseMessagingReceiver cTFirebaseMessagingReceiver, long l2) {
        this.a = cTFirebaseMessagingReceiver;
        super(l2, 1000L);
    }

    public final void onFinish() {
        this.a.b("receiver life time is expired");
    }

    public final void onTick(long l2) {
    }
}

