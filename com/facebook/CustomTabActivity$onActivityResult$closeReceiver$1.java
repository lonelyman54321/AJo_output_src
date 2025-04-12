/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.CustomTabActivity;
import kotlin.jvm.internal.Intrinsics;

public final class CustomTabActivity$onActivityResult$closeReceiver$1
extends BroadcastReceiver {
    public final /* synthetic */ CustomTabActivity a;

    public CustomTabActivity$onActivityResult$closeReceiver$1(CustomTabActivity customTabActivity) {
        this.a = customTabActivity;
    }

    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.a.finish();
    }
}

