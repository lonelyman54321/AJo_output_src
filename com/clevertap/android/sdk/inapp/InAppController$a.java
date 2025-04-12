/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.clevertap.android.sdk.inapp;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.InAppController;
import java.util.concurrent.Callable;

public final class InAppController$a
implements Callable {
    public final /* synthetic */ CTInAppNotification a;
    public final /* synthetic */ InAppController b;

    public InAppController$a(InAppController inAppController, CTInAppNotification cTInAppNotification) {
        this.b = inAppController;
        this.a = cTInAppNotification;
    }

    public final Object call() {
        String string2;
        boolean bl2;
        InAppController inAppController = this.b;
        Context context = inAppController.d;
        CleverTapInstanceConfig cleverTapInstanceConfig = inAppController.c;
        Object object = cleverTapInstanceConfig.a;
        com.clevertap.android.sdk.b.k();
        object = InAppController.q;
        if (object != null && (bl2 = ((String)(object = ((CTInAppNotification)object).f)).equals(string2 = this.a.f))) {
            InAppController.q = null;
            InAppController.g(context, cleverTapInstanceConfig, inAppController);
        }
        InAppController.d(inAppController);
        return null;
    }
}

