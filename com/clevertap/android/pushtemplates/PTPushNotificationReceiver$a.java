/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package com.clevertap.android.pushtemplates;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

public final class PTPushNotificationReceiver$a
implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent b;

    public PTPushNotificationReceiver$a(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    public final Object call() {
        Context context = this.a;
        Intent intent = this.b;
        try {
            xz3_0.b(context, intent);
            xz3_0.c(context);
        }
        catch (Throwable throwable) {
            throwable.getLocalizedMessage();
            ak2_1.b();
        }
        return null;
    }
}

