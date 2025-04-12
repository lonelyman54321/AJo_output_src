/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1aSDK$1;
import com.appsflyer.internal.AFe1aSDK$5;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFf1xSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import java.io.InterruptedIOException;
import java.util.Timer;
import java.util.TimerTask;

final class AFe1aSDK$4
implements Runnable {
    private /* synthetic */ AFe1aSDK getRevenue;

    public AFe1aSDK$4(AFe1aSDK aFe1aSDK) {
        this.getRevenue = aFe1aSDK;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        Object object = this.getRevenue.component3;
        // MONITORENTER : object
        Object object2 = this.getRevenue;
        object2 = ((AFe1aSDK)object2).component3;
        object2 = object2.pollFirst();
        object2 = (AFe1eSDK)object2;
        if (object2 == null) {
            // MONITOREXIT : object
            return;
        }
        Object object3 = this.getRevenue;
        object3 = ((AFe1aSDK)object3).areAllFieldsValid;
        object3.add(object2);
        // MONITOREXIT : object
        long l2 = ((AFe1eSDK)object2).getMonetizationNetwork();
        Object object4 = Thread.currentThread();
        object = new AFf1xSDK((Thread)object4);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0) {
            object4 = this.getRevenue.getMediationNetwork;
            ((Timer)object4).schedule((TimerTask)object, l2);
        }
        object3 = this.getRevenue;
        Object object5 = ((AFe1aSDK)object3).AFAdRevenueData;
        object4 = new AFe1aSDK$1((AFe1aSDK)object3, (AFe1eSDK)object2);
        object5.execute((Runnable)object4);
        object3 = this.getRevenue.component3;
        boolean bl2 = object3.isEmpty();
        if (!bl2) {
            object3 = this.getRevenue;
            object5 = ((AFe1aSDK)object3).getCurrencyIso4217Code;
            object4 = new AFe1aSDK$4((AFe1aSDK)object3);
            object5.submit((Runnable)object4);
        }
        try {
            object3 = AFLogger.INSTANCE;
            object5 = AFh1vSDK.component4;
            object4 = "starting task execution: ";
            Object object6 = String.valueOf(object2);
            object4 = ((String)object4).concat((String)object6);
            ((AFh1uSDK)object3).d((AFh1vSDK)((Object)object5), (String)object4);
            object3 = ((AFe1eSDK)object2).component3();
            ((TimerTask)object).cancel();
            object5 = this.getRevenue;
            object4 = ((AFe1aSDK)object5).AFAdRevenueData;
            object6 = new AFe1aSDK$5((AFe1aSDK)object5, (AFe1eSDK)object2, (AFe1cSDK)((Object)object3));
            object4.execute((Runnable)object6);
            return;
        }
        catch (Throwable throwable) {
            ((TimerTask)object).cancel();
            object = this.getRevenue;
            object3 = AFe1cSDK.getMonetizationNetwork;
            object5 = ((AFe1aSDK)object).AFAdRevenueData;
            object4 = new AFe1aSDK$5((AFe1aSDK)object, (AFe1eSDK)object2, (AFe1cSDK)((Object)object3));
            object5.execute((Runnable)object4);
            return;
        }
        catch (InterruptedIOException | InterruptedException exception) {
            object = AFLogger.INSTANCE;
            object3 = AFh1vSDK.component4;
            object4 = String.valueOf(object2);
            object5 = "task was interrupted: ".concat((String)object4);
            ((AFh1uSDK)object).d((AFh1vSDK)((Object)object3), (String)object5);
            object = AFe1cSDK.getMediationNetwork;
            ((AFe1eSDK)object2).getMediationNetwork = object;
            object3 = this.getRevenue;
            object5 = ((AFe1aSDK)object3).AFAdRevenueData;
            object4 = new AFe1aSDK$5((AFe1aSDK)object3, (AFe1eSDK)object2, (AFe1cSDK)((Object)object));
            object5.execute((Runnable)object4);
            return;
        }
    }
}

