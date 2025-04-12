/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.clevertap.android.sdk.inapp;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.InAppController;

class InAppController$7
implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ CTInAppNotification b;
    public final /* synthetic */ CleverTapInstanceConfig c;
    public final /* synthetic */ InAppController d;

    public InAppController$7(Context context, CTInAppNotification cTInAppNotification, CleverTapInstanceConfig cleverTapInstanceConfig, InAppController inAppController) {
        this.a = context;
        this.b = cTInAppNotification;
        this.c = cleverTapInstanceConfig;
        this.d = inAppController;
    }

    public final void run() {
        Context context = this.a;
        CTInAppNotification cTInAppNotification = this.b;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.c;
        InAppController inAppController = this.d;
        InAppController.o(context, cTInAppNotification, cleverTapInstanceConfig, inAppController);
    }
}

