/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  android.os.Looper
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import com.appsflyer.internal.AFa1cSDK$AFa1uSDK;
import com.appsflyer.internal.AFa1cSDK$AFa1ySDK;
import com.appsflyer.internal.AFa1cSDK$AFa1zSDK;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class AFa1cSDK {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AFa1cSDK$AFa1uSDK getCurrencyIso4217Code(Context object) {
        Throwable throwable2;
        Object object2;
        block7: {
            block4: {
                Object object3;
                Object object4;
                block5: {
                    block6: {
                        object2 = Looper.myLooper();
                        if (object2 == (object4 = Looper.getMainLooper())) {
                            object = new IllegalStateException("Cannot be called from the main thread");
                            throw object;
                        }
                        object.getPackageManager().getPackageInfo("com.android.vending", 0);
                        object2 = new AFa1cSDK$AFa1ySDK();
                        object4 = new Intent("com.google.android.gms.ads.identifier.service.START");
                        object3 = "com.google.android.gms";
                        object4.setPackage((String)object3);
                        int n3 = 1;
                        try {
                            boolean bl2 = object.bindService((Intent)object4, (ServiceConnection)object2, n3);
                            if (!bl2) break block4;
                            boolean bl3 = object2.AFAdRevenueData;
                            if (bl3) break block5;
                            object2.AFAdRevenueData = n3;
                            object3 = object2.getRevenue;
                            Object object5 = TimeUnit.SECONDS;
                            long l2 = 10;
                            object3 = ((LinkedBlockingQueue)object3).poll(l2, (TimeUnit)((Object)object5));
                            if ((object3 = (IBinder)object3) == null) break block6;
                            object4 = new AFa1cSDK$AFa1zSDK((IBinder)object3);
                            object5 = ((AFa1cSDK$AFa1zSDK)object4).getCurrencyIso4217Code();
                            bl2 = ((AFa1cSDK$AFa1zSDK)object4).getMediationNetwork();
                            object3 = new AFa1cSDK$AFa1uSDK((String)object5, bl2);
                        }
                        catch (Throwable throwable2) {}
                        object.unbindService((ServiceConnection)object2);
                        return object3;
                    }
                    object3 = "Timed out waiting for the service connection";
                    object4 = new TimeoutException((String)object3);
                    throw object4;
                    break block7;
                }
                object3 = "Cannot call get on this connection more than once";
                object4 = new IllegalStateException((String)object3);
                throw object4;
            }
            object.unbindService((ServiceConnection)object2);
            object = new IOException("Google Play connection failed");
            throw object;
        }
        object.unbindService((ServiceConnection)object2);
        throw throwable2;
    }
}

