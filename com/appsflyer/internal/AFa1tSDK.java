/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.IntentFilter
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.IntentFilter;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1vSDK$AFa1zSDK;

public final class AFa1tSDK
implements AFd1vSDK {
    private static IntentFilter AFAdRevenueData;

    static {
        IntentFilter intentFilter;
        AFAdRevenueData = intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFd1vSDK$AFa1zSDK AFAdRevenueData(Context object) {
        Throwable throwable2;
        float f5;
        String string2;
        block7: {
            int n3;
            int n4;
            Object object2;
            block6: {
                block2: {
                    block3: {
                        block4: {
                            block5: {
                                string2 = null;
                                f5 = 0.0f;
                                try {
                                    int n7;
                                    object2 = AFAdRevenueData;
                                    object = object.registerReceiver(null, object2);
                                    if (object == null) return new AFd1vSDK$AFa1zSDK(f5, string2);
                                    int n8 = 2;
                                    object2 = "status";
                                    n4 = -1;
                                    n3 = object.getIntExtra((String)object2, n4);
                                    if (n8 != n3) break block2;
                                    object2 = "plugged";
                                    n3 = object.getIntExtra((String)object2, n4);
                                    if (n3 == (n7 = 1)) break block3;
                                    if (n3 == n8) break block4;
                                    n8 = 4;
                                    if (n3 == n8) break block5;
                                    string2 = "other";
                                    break block6;
                                }
                                catch (Throwable throwable2) {
                                    break block7;
                                }
                            }
                            string2 = "wireless";
                            break block6;
                        }
                        string2 = "usb";
                        break block6;
                    }
                    string2 = "ac";
                    break block6;
                }
                string2 = "no";
            }
            object2 = "level";
            n3 = object.getIntExtra((String)object2, n4);
            String string3 = "scale";
            int n10 = object.getIntExtra(string3, n4);
            if (n4 == n3) return new AFd1vSDK$AFa1zSDK(f5, string2);
            if (n4 == n10) return new AFd1vSDK$AFa1zSDK(f5, string2);
            float f6 = (float)n3 * 100.0f;
            float f7 = n10;
            f5 = f6 / f7;
            return new AFd1vSDK$AFa1zSDK(f5, string2);
        }
        String string4 = "Device that failed to register receiver";
        AFLogger.afErrorLogForExcManagerOnly(string4, throwable2);
        return new AFd1vSDK$AFa1zSDK(f5, string2);
    }
}

