/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package in.juspay.hypersdk.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import in.juspay.hypersdk.core.JBridge;

class JBridge$1
extends BroadcastReceiver {
    final /* synthetic */ JBridge this$0;

    public JBridge$1(JBridge jBridge) {
        this.this$0 = jBridge;
    }

    public void onReceive(Context context, Intent intent) {
        JBridge.access$000(this.this$0, intent);
    }
}

