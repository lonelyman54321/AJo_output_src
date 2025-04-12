/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package in.juspay.hypersmshandler;

import android.app.Activity;
import in.juspay.hypersmshandler.SmsRetriever;
import in.juspay.hypersmshandler.SmsRetriever$attach$1;

public final class a
implements Runnable {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ SmsRetriever b;

    public /* synthetic */ a(Activity activity, SmsRetriever smsRetriever) {
        this.a = activity;
        this.b = smsRetriever;
    }

    public final void run() {
        Activity activity = this.a;
        SmsRetriever smsRetriever = this.b;
        SmsRetriever$attach$1.a(activity, smsRetriever);
    }
}

