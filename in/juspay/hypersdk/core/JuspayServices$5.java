/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package in.juspay.hypersdk.core;

import android.content.Context;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersmshandler.SmsComponents;
import in.juspay.hypersmshandler.SmsEventInterface;
import in.juspay.hypersmshandler.Tracker;

class JuspayServices$5
implements SmsComponents {
    final /* synthetic */ JuspayServices this$0;

    public JuspayServices$5(JuspayServices juspayServices) {
        this.this$0 = juspayServices;
    }

    public Context getContext() {
        return JuspayServices.access$500(this.this$0);
    }

    public SmsEventInterface getSmsEventInterface() {
        return JuspayServices.access$700(this.this$0).getSmsEventInterface();
    }

    public Tracker getTracker() {
        return JuspayServices.access$000(this.this$0);
    }
}

