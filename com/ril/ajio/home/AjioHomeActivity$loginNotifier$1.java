/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.ril.ajio.home;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.jvm.internal.Intrinsics;

public final class AjioHomeActivity$loginNotifier$1
extends BroadcastReceiver {
    public final /* synthetic */ AjioHomeActivity a;

    public AjioHomeActivity$loginNotifier$1(AjioHomeActivity ajioHomeActivity) {
        this.a = ajioHomeActivity;
    }

    public final void onReceive(Context object, Intent intent) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        object = this.a;
        at2_1.h((Activity)object, "loginNotifier", 6);
        ((AjioHomeActivity)object).P2().c.deleteUserInformation();
        ((AjioHomeActivity)object).d3();
    }
}

