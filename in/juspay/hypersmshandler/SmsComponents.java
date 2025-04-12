/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package in.juspay.hypersmshandler;

import android.content.Context;
import in.juspay.hypersmshandler.SmsEventInterface;
import in.juspay.hypersmshandler.Tracker;

public interface SmsComponents {
    public Context getContext();

    public SmsEventInterface getSmsEventInterface();

    public Tracker getTracker();
}

