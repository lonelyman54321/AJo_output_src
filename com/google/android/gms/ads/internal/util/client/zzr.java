/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.TrafficStats
 */
package com.google.android.gms.ads.internal.util.client;

import android.net.TrafficStats;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zze;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class zzr
implements zze {
    private final String zza;

    public zzr() {
        throw null;
    }

    public zzr(String string2) {
        this.zza = string2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zza(String var1_1) {
        block17: {
            block20: {
                block21: {
                    block16: {
                        block19: {
                            block18: {
                                var2_3 = ". ";
                                var3_4 = "Error while parsing ping URL: ";
                                var4_8 = "Error while pinging URL: ";
                                var5_11 = "Received non-success response code ";
                                var6_13 = "Pinging URL: ";
                                var7_14 = false;
                                try {
                                    var8_15 = ClientLibraryUtils.isPackageSide();
                                    if (var8_15 != 0) {
                                        var8_15 = 263;
                                        TrafficStats.setThreadStatsTag((int)var8_15);
                                    }
                                    var9_16 = new StringBuilder((String)var6_13);
                                    var9_16.append(var1_1);
                                    var6_13 = var9_16.toString();
                                    zzm.zze((String)var6_13);
                                    var6_13 = new URL(var1_1);
                                    var6_13 = var6_13.openConnection();
                                    var6_13 = (HttpURLConnection)var6_13;
                                }
                                catch (RuntimeException var3_5) {
                                    break block16;
                                }
                                catch (IOException var3_6) {
                                    break block16;
                                }
                                catch (IndexOutOfBoundsException var4_9) {
                                    ** GOTO lbl-1000
                                }
                                catch (Throwable var1_2) {
                                    break block17;
                                }
                                try {
                                    zzay.zzb();
                                    var9_16 = this.zza;
                                    var10_17 = 60000;
                                    var6_13.setConnectTimeout(var10_17);
                                    var11_18 = true;
                                    var6_13.setInstanceFollowRedirects(var11_18);
                                    var6_13.setReadTimeout(var10_17);
                                    if (var9_16 == null) break block18;
                                    var12_19 = "User-Agent";
                                    var6_13.setRequestProperty(var12_19, (String)var9_16);
                                }
                                catch (Throwable var5_12) {
                                    ** GOTO lbl-1000
                                }
                            }
                            var6_13.setUseCaches(false);
                            var10_17 = 0;
                            var12_19 = null;
                            var9_16 = new zzl(null);
                            var9_16.zzc((HttpURLConnection)var6_13, null);
                            var10_17 = var6_13.getResponseCode();
                            var9_16.zze((HttpURLConnection)var6_13, var10_17);
                            var8_15 = 200;
                            if (var10_17 < var8_15 || var10_17 >= (var8_15 = 300)) break block19;
                            var7_14 = true;
                            ** GOTO lbl-1000
                        }
                        var9_16 = new StringBuilder((String)var5_11);
                        var9_16.append(var10_17);
                        var5_11 = " from pinging URL: ";
                        var9_16.append((String)var5_11);
                        var9_16.append(var1_1);
                        var5_11 = var9_16.toString();
                        zzm.zzj((String)var5_11);
lbl-1000:
                        // 2 sources

                        {
                            var6_13.disconnect();
                        }
                        var13_20 = ClientLibraryUtils.isPackageSide();
                        if (!var13_20) break block20;
                        break block21;
lbl-1000:
                        // 1 sources

                        {
                            var6_13.disconnect();
                            throw var5_12;
                        }
                    }
                    var3_7 = var3_7.getMessage();
                    var5_11 = new StringBuilder(var4_8);
                    var5_11.append(var1_1);
                    var5_11.append(var2_3);
                    var5_11.append(var3_7);
                    var1_1 = var5_11.toString();
                    zzm.zzj(var1_1);
                    var13_21 = ClientLibraryUtils.isPackageSide();
                    if (!var13_21) break block20;
                    break block21;
lbl-1000:
                    // 1 sources

                    {
                        var4_10 = var4_9.getMessage();
                        var5_11 = new StringBuilder(var3_4);
                        var5_11.append(var1_1);
                        var5_11.append(var2_3);
                        var5_11.append(var4_10);
                        var1_1 = var5_11.toString();
                        zzm.zzj(var1_1);
                    }
                    var13_22 = ClientLibraryUtils.isPackageSide();
                    if (!var13_22) break block20;
                }
                TrafficStats.clearThreadStatsTag();
            }
            return var7_14;
        }
        var14_23 = ClientLibraryUtils.isPackageSide();
        if (var14_23) {
            TrafficStats.clearThreadStatsTag();
        }
        throw var1_2;
    }
}

