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
import com.facebook.CustomTabMainActivity;
import kotlin.jvm.internal.Intrinsics;

public final class CustomTabMainActivity$onCreate$redirectReceiver$1
extends BroadcastReceiver {
    public final /* synthetic */ CustomTabMainActivity a;

    public CustomTabMainActivity$onCreate$redirectReceiver$1(CustomTabMainActivity customTabMainActivity) {
        this.a = customTabMainActivity;
    }

    public final void onReceive(Context context, Intent object) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(object, "intent");
        CustomTabMainActivity customTabMainActivity = this.a;
        context = new Intent((Context)customTabMainActivity, CustomTabMainActivity.class);
        context.setAction("CustomTabMainActivity.action_refresh");
        String string2 = "CustomTabMainActivity.extra_url";
        object = object.getStringExtra(string2);
        context.putExtra(string2, (String)object);
        context.addFlags(0x24000000);
        customTabMainActivity.startActivity((Intent)context);
    }
}

