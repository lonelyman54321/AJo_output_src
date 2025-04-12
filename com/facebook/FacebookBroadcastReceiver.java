/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public class FacebookBroadcastReceiver
extends BroadcastReceiver {
    public final void onReceive(Context object, Intent intent) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        object = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        String string2 = intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
        Bundle bundle = intent.getExtras();
        if (object != null && string2 != null && bundle != null) {
            boolean bl2 = os1_1.o(intent);
            String string3 = "extras";
            String string4 = "action";
            String string5 = "appCallId";
            if (bl2) {
                Intrinsics.checkNotNullParameter(object, string5);
                Intrinsics.checkNotNullParameter(string2, string4);
                Intrinsics.checkNotNullParameter(bundle, string3);
            } else {
                Intrinsics.checkNotNullParameter(object, string5);
                Intrinsics.checkNotNullParameter(string2, string4);
                Intrinsics.checkNotNullParameter(bundle, string3);
            }
        }
    }
}

