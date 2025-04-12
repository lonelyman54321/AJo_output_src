/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.inapp;

import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.InAppController;

class InAppController$4
implements Runnable {
    public final /* synthetic */ CTInAppNotification a;
    public final /* synthetic */ InAppController b;

    public InAppController$4(InAppController inAppController, CTInAppNotification cTInAppNotification) {
        this.b = inAppController;
        this.a = cTInAppNotification;
    }

    public final void run() {
        Object object = InAppController.q;
        object = this.b;
        CTInAppNotification cTInAppNotification = this.a;
        ((InAppController)object).h(cTInAppNotification);
    }
}

