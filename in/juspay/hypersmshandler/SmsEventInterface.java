/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 */
package in.juspay.hypersmshandler;

import android.content.Intent;
import android.os.Bundle;
import in.juspay.hypersmshandler.SmsEventInterface$RetrieverEvents;

public interface SmsEventInterface {
    public void onActivityResultEvent(String var1);

    public void onSentReceiverEvent(int var1);

    public void onSmsConsentEvent(Intent var1, int var2, Bundle var3);

    public void onSmsReceiverEvent(String var1);

    public void onSmsRetrieverEvent(SmsEventInterface$RetrieverEvents var1, String var2);
}

