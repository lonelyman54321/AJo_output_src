/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.DeadObjectException
 *  android.os.RemoteException
 */
package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFj1sSDK;
import com.appsflyer.internal.AFj1sSDK$1;
import com.appsflyer.internal.AFj1sSDK$AFa1zSDK;
import com.appsflyer.internal.AFj1tSDK;
import java.util.Observer;

final class AFj1tSDK$4
implements Runnable {
    private /* synthetic */ Context AFAdRevenueData;
    private /* synthetic */ AFj1tSDK getCurrencyIso4217Code;

    public AFj1tSDK$4(AFj1tSDK aFj1tSDK, Context context) {
        this.getCurrencyIso4217Code = aFj1tSDK;
        this.AFAdRevenueData = context;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block21: {
            block19: {
                block20: {
                    block18: {
                        block17: {
                            block16: {
                                var1_1 = this.getCurrencyIso4217Code;
                                var1_1.component1 = var2_2 = System.currentTimeMillis();
                                var4_3 = AFj1sSDK$AFa1zSDK.AFAdRevenueData;
                                var1_1.component2 = var4_3;
                                var4_3 = new AFj1sSDK$1((AFj1sSDK)var1_1);
                                var1_1.addObserver((Observer)var4_3);
                                var1_1 = new StringBuilder("content://");
                                var4_3 = this.getCurrencyIso4217Code.getCurrencyIso4217Code.authority;
                                var1_1.append((String)var4_3);
                                var4_3 = "/transaction_id";
                                var1_1.append((String)var4_3);
                                var5_9 = Uri.parse((String)var1_1.toString());
                                var1_1 = AFj1tSDK.D_(this.AFAdRevenueData, (Uri)var5_9);
                                if (var1_1 == null) break block19;
                                var6_10 = 24;
                                try {
                                    var7_11 = "app_id=";
                                    var4_3 = new StringBuilder((String)var7_11);
                                    var7_11 = this.AFAdRevenueData;
                                    var7_11 = var7_11.getPackageName();
                                    var4_3.append((String)var7_11);
                                    var8_12 = var4_3.toString();
                                    var9_13 = 0;
                                    var7_11 = null;
                                    var4_3 = var1_1;
                                    var4_3 = var1_1.query((Uri)var5_9, null, var8_12, null, null);
                                    var10_14 = Build.VERSION.SDK_INT;
                                    if (var10_14 < var6_10) break block16;
                                }
                                catch (Throwable var4_4) {
                                    break block17;
                                }
                                catch (RemoteException var4_5) {
                                    ** GOTO lbl66
                                }
                                catch (DeadObjectException var4_6) {
                                    ** GOTO lbl74
                                }
                                var1_1.release();
                                break block21;
                            }
                            var1_1.release();
                            break block21;
                        }
                        try {
                            var11_16 = AFLogger.INSTANCE;
                            var12_19 = AFh1vSDK.w;
                            var13_22 = "Error to get data from providerClient ";
                            var14_25 = true;
                            var11_16.e(var12_19, var13_22, var4_4, false, var14_25, false);
                            var15_28 = Build.VERSION.SDK_INT;
                            if (var15_28 < var6_10) break block18;
                        }
                        catch (Throwable var4_7) {}
lbl55:
                        // 3 sources

                        while (true) {
                            var1_1.release();
                            break block19;
                            break;
                        }
                    }
lbl60:
                    // 3 sources

                    while (true) {
                        var1_1.release();
                        break block19;
                        break;
                    }
                    {
                        break block20;
lbl66:
                        // 1 sources

                        var11_17 = AFLogger.INSTANCE;
                        var12_20 = AFh1vSDK.w;
                        var13_23 = "Failed to query unstable content providerClient";
                        var14_26 = true;
                        var11_17.e(var12_20, var13_23, var4_5, false, var14_26, false);
                        var15_28 = Build.VERSION.SDK_INT;
                        if (var15_28 < var6_10) ** GOTO lbl60
                        ** GOTO lbl55
lbl74:
                        // 1 sources

                        var11_18 = AFLogger.INSTANCE;
                        var12_21 = AFh1vSDK.w;
                        var13_24 = "Failed to acquire unstable content providerClient";
                        var14_27 = true;
                        var11_18.e(var12_21, var13_24, var4_6, false, var14_27, false);
                        if ((var15_28 = Build.VERSION.SDK_INT) < var6_10) ** continue;
                        ** continue;
                    }
                }
                var10_15 = Build.VERSION.SDK_INT;
                if (var10_15 >= var6_10) {
                    var1_1.release();
                    throw var4_7;
                }
                var1_1.release();
                throw var4_7;
            }
            var15_28 = 0;
            var4_3 = null;
        }
        var1_1 = "response";
        if (var4_3 != null) {
            var5_9 = "transaction_id";
            var10_14 = var4_3.getColumnIndex((String)var5_9);
            if (var10_14 == (var9_13 = -1)) {
                var5_9 = AFLogger.INSTANCE;
                var7_11 = AFh1vSDK.w;
                var8_12 = "Wrong column name";
                var5_9.w((AFh1vSDK)var7_11, var8_12);
                var5_9 = this.getCurrencyIso4217Code.getMediationNetwork;
                var7_11 = "FEATURE_NOT_SUPPORTED";
                var5_9.put(var1_1, var7_11);
            } else {
                var7_11 = this.getCurrencyIso4217Code.getMediationNetwork;
                var8_12 = "OK";
                var7_11.put(var1_1, var8_12);
                var16_29 = var4_3.moveToFirst();
                if (var16_29) {
                    var1_1 = var4_3.getString(var10_14);
                    var4_3.close();
                    if (var1_1 != null && (var10_14 = (int)var1_1.isEmpty()) == 0) {
                        var5_9 = this.getCurrencyIso4217Code.getMediationNetwork;
                        var7_11 = "referrer";
                        var5_9.put(var7_11, var1_1);
                    }
                }
            }
            var4_3.close();
        } else {
            var4_3 = AFLogger.INSTANCE;
            var5_9 = AFh1vSDK.w;
            var7_11 = "ContentProvider query failed, got null Cursor";
            var4_3.w((AFh1vSDK)var5_9, (String)var7_11);
            var4_3 = this.getCurrencyIso4217Code.getMediationNetwork;
            var5_9 = "SERVICE_UNAVAILABLE";
            var4_3.put(var1_1, var5_9);
        }
        var1_1 = this.getCurrencyIso4217Code;
        var4_3 = var1_1.getMediationNetwork;
        var5_9 = this.AFAdRevenueData;
        var1_1 = var1_1.getCurrencyIso4217Code.packageName;
        var1_1 = AFb1qSDK.AFAdRevenueData((Context)var5_9, (String)var1_1);
        var4_3.put("api_ver", var1_1);
        var1_1 = this.getCurrencyIso4217Code;
        var4_3 = var1_1.getMediationNetwork;
        var5_9 = this.AFAdRevenueData;
        var1_1 = var1_1.getCurrencyIso4217Code.packageName;
        var1_1 = AFb1qSDK.getMediationNetwork((Context)var5_9, (String)var1_1);
        var4_3.put("api_ver_name", var1_1);
        this.getCurrencyIso4217Code.getRevenue();
    }
}

