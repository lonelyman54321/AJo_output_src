/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1aSDK$4;
import com.appsflyer.internal.AFe1dSDK;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFh1vSDK;
import java.util.NavigableSet;

public final class AFe1aSDK$2
implements Runnable {
    private /* synthetic */ AFe1aSDK AFAdRevenueData;
    private /* synthetic */ AFe1eSDK getMediationNetwork;

    public AFe1aSDK$2(AFe1aSDK aFe1aSDK, AFe1eSDK aFe1eSDK) {
        this.AFAdRevenueData = aFe1aSDK;
        this.getMediationNetwork = aFe1eSDK;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        block23: {
            block21: {
                block22: {
                    block24: {
                        var1_1 = this.AFAdRevenueData.component3;
                        // MONITORENTER : var1_1
                        var2_3 = this.AFAdRevenueData;
                        var2_3 = var2_3.areAllFieldsValid;
                        var3_5 = this.getMediationNetwork;
                        var4_6 = var2_3.contains(var3_5);
                        if (var4_6) {
                            var2_3 = AFLogger.INSTANCE;
                            var3_5 = AFh1vSDK.component4;
                            var6_10 = "tried to add already running task: ";
                            var5_7 /* !! */  = new StringBuilder((String)var6_10);
                            var6_10 = this.getMediationNetwork;
                            var5_7 /* !! */ .append(var6_10);
                            var5_7 /* !! */  = var5_7 /* !! */ .toString();
                            var2_3.d((AFh1vSDK)var3_5, (String)var5_7 /* !! */ );
                            // MONITOREXIT : var1_1
                            return;
                        }
                        var2_3 = this.AFAdRevenueData;
                        var2_3 = var2_3.component3;
                        var3_5 = this.getMediationNetwork;
                        var4_6 = var2_3.contains(var3_5);
                        if (var4_6) ** GOTO lbl130
                        var2_3 = this.AFAdRevenueData;
                        var2_3 = var2_3.component4;
                        var3_5 = this.getMediationNetwork;
                        var4_6 = var2_3.contains(var3_5);
                        if (var4_6) ** GOTO lbl130
                        var2_3 = this.AFAdRevenueData;
                        var3_5 = this.getMediationNetwork;
                        var5_8 = var3_5.getCurrencyIso4217Code;
                        var5_8 = var5_8.iterator();
                        while (var7_13 = var5_8.hasNext()) {
                            var6_11 /* !! */  = var5_8.next();
                            var8_14 = var2_3.component1;
                            var9_15 = var8_14.contains(var6_11 /* !! */  = (AFf1zSDK)var6_11 /* !! */ );
                            if (!var9_15) continue;
                            var8_14 = var3_5.getRevenue;
                            var8_14.add(var6_11 /* !! */ );
                        }
                        var2_3 = this.AFAdRevenueData;
                        var3_5 = this.getMediationNetwork;
                        var4_6 = var2_3.getRevenue((AFe1eSDK)var3_5);
                        if (var4_6) {
                            var2_3 = this.AFAdRevenueData;
                            var2_3 = var2_3.component3;
                            var3_5 = this.getMediationNetwork;
                            var4_6 = var2_3.add(var3_5);
                        } else {
                            var2_3 = this.AFAdRevenueData;
                            var2_3 = var2_3.component4;
                            var3_5 = this.getMediationNetwork;
                            var4_6 = var2_3.add(var3_5);
                            if (var4_6) {
                                var3_5 = AFLogger.INSTANCE;
                                var5_8 = AFh1vSDK.component4;
                                var8_14 = "new task was blocked: ";
                                var6_11 /* !! */  = new E((String)var8_14);
                                var8_14 = this.getMediationNetwork;
                                var6_11 /* !! */ .append(var8_14);
                                var6_11 /* !! */  = var6_11 /* !! */ .toString();
                                var3_5.d((AFh1vSDK)var5_8, (String)var6_11 /* !! */ );
                                var3_5 = this.getMediationNetwork;
                                var3_5.getCurrencyIso4217Code();
                            }
                        }
                        if (var4_6) {
                            var3_5 = this.AFAdRevenueData;
                            var5_8 = var3_5.component3;
                            var3_5 = var3_5.component2;
                            var5_8.addAll(var3_5);
                            var3_5 = this.AFAdRevenueData;
                            var3_5 = var3_5.component2;
                            var3_5.clear();
                        } else {
                            var3_5 = AFLogger.INSTANCE;
                            var5_8 = AFh1vSDK.component4;
                            var8_14 = "task not added, it's already in the queue: ";
                            var6_11 /* !! */  = new E((String)var8_14);
                            var8_14 = this.getMediationNetwork;
                            var6_11 /* !! */ .append(var8_14);
                            var6_11 /* !! */  = var6_11 /* !! */ .toString();
                            var3_5.d((AFh1vSDK)var5_8, (String)var6_11 /* !! */ );
                        }
                        // MONITOREXIT : var1_1
                        if (!var4_6) ** GOTO lbl120
                        var1_1 = this.AFAdRevenueData.component1;
                        var2_3 = this.getMediationNetwork.getMonetizationNetwork;
                        var1_1.add(var2_3);
                        var1_1 = AFLogger.INSTANCE;
                        var2_3 = AFh1vSDK.component4;
                        var3_5 = new StringBuilder("new task added: ");
                        var5_8 = this.getMediationNetwork;
                        var3_5.append(var5_8);
                        var3_5 = var3_5.toString();
                        var1_1.d((AFh1vSDK)var2_3, (String)var3_5);
                        var1_1 = this.AFAdRevenueData.getRevenue.iterator();
                        while (var4_6 = var1_1.hasNext()) {
                            var2_3 = (AFe1dSDK)var1_1.next();
                        }
                        var1_1 = this.AFAdRevenueData;
                        var2_3 = var1_1.getCurrencyIso4217Code;
                        var3_5 = new AFe1aSDK$4((AFe1aSDK)var1_1);
                        var2_3.submit((Runnable)var3_5);
                        var1_1 = this.AFAdRevenueData;
                        var2_3 = var1_1.component3;
                        // MONITORENTER : var2_3
                        var3_5 = var1_1.component3;
                        var10_16 = var3_5.size();
                        var5_8 = var1_1.component4;
                        var11_17 = var5_8.size();
                        var10_16 = var10_16 + var11_17 + -40;
                        break block24;
lbl120:
                        // 1 sources

                        var1_1 = AFLogger.INSTANCE;
                        var2_3 = AFh1vSDK.component4;
                        var3_5 = new StringBuilder("QUEUE: tried to add already pending task: ");
                        var5_8 = this.getMediationNetwork;
                        var3_5.append(var5_8);
                        var3_5 = var3_5.toString();
                        var1_1.w((AFh1vSDK)var2_3, (String)var3_5);
                        return;
lbl130:
                        // 3 sources

                        var2_3 = AFLogger.INSTANCE;
                        var3_5 = AFh1vSDK.component4;
                        var6_12 = "tried to add already scheduled task: ";
                        var5_9 /* !! */  = new StringBuilder((String)var6_12);
                        var6_12 = this.getMediationNetwork;
                        var5_9 /* !! */ .append(var6_12);
                        var5_9 /* !! */  = var5_9 /* !! */ .toString();
                        var2_3.d((AFh1vSDK)var3_5, (String)var5_9 /* !! */ );
                        // MONITOREXIT : var1_1
                        return;
                    }
lbl144:
                    // 2 sources

                    while (var10_16 > 0) {
                        var5_8 = var1_1.component4;
                        var11_17 = var5_8.isEmpty() ^ 1;
                        var6_11 /* !! */  = var1_1.component3;
                        var7_13 = var6_11 /* !! */ .isEmpty() ^ true;
                        if (!var7_13 || var11_17 == 0) break block21;
                        var5_8 = var1_1.component3;
                        var5_8 = var5_8.first();
                        var5_8 = (AFe1eSDK)var5_8;
                        var6_11 /* !! */  = var1_1.component4;
                        var6_11 /* !! */  = var6_11 /* !! */ .first();
                        var11_17 = var5_8.getCurrencyIso4217Code((AFe1eSDK)(var6_11 /* !! */  = (AFe1eSDK)var6_11 /* !! */ ));
                        if (var11_17 <= 0) break block22;
                        var5_8 = var1_1.component3;
                        var1_1.getMediationNetwork((NavigableSet)var5_8);
                        break block23;
                    }
                    return;
                }
                var5_8 = var1_1.component4;
                var1_1.getMediationNetwork((NavigableSet)var5_8);
                break block23;
            }
            if (var7_13) {
                var5_8 = var1_1.component3;
                var1_1.getMediationNetwork((NavigableSet)var5_8);
            } else if (var11_17 != 0) {
                var5_8 = var1_1.component4;
                var1_1.getMediationNetwork((NavigableSet)var5_8);
            }
        }
        var10_16 += -1;
        ** GOTO lbl144
    }
}

