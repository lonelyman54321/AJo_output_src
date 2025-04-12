/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.inapp;

import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.InAppController;

class InAppController$2
implements Runnable {
    public final /* synthetic */ CTInAppNotification a;
    public final /* synthetic */ eg0 b;
    public final /* synthetic */ InAppController c;

    public InAppController$2(InAppController inAppController, CTInAppNotification cTInAppNotification, eg0 eg02) {
        this.c = inAppController;
        this.a = cTInAppNotification;
        this.b = eg02;
    }

    public final void run() {
        CTInAppNotification cTInAppNotification = this.a;
        eg0 eg02 = this.b;
        InAppController.c(this.c, cTInAppNotification, eg02);
    }
}

