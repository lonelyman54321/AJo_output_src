/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 */
package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.appsflyer.AFLogger;
import java.util.concurrent.LinkedBlockingQueue;

final class AFa1cSDK$AFa1ySDK
implements ServiceConnection {
    boolean AFAdRevenueData;
    final LinkedBlockingQueue getRevenue;

    public AFa1cSDK$AFa1ySDK() {
        LinkedBlockingQueue linkedBlockingQueue;
        this.getRevenue = linkedBlockingQueue = new LinkedBlockingQueue(1);
        this.AFAdRevenueData = false;
    }

    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        try {
            object = this.getRevenue;
        }
        catch (InterruptedException interruptedException) {
            AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", interruptedException);
            return;
        }
        ((LinkedBlockingQueue)object).put(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}

