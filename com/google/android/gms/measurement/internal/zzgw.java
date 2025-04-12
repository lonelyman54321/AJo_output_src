/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzgx;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

final class zzgw
implements Runnable {
    private final URL zza;
    private final byte[] zzb;
    private final zzgu zzc;
    private final String zzd;
    private final Map zze;
    private final /* synthetic */ zzgv zzf;

    public zzgw(zzgv zzgv2, String string2, URL uRL, byte[] byArray, Map map2, zzgu zzgu2) {
        this.zzf = zzgv2;
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(uRL);
        Preconditions.checkNotNull(zzgu2);
        this.zza = uRL;
        this.zzb = byArray;
        this.zzc = zzgu2;
        this.zzd = string2;
        this.zze = map2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block31: {
            block30: {
                block32: {
                    block29: {
                        var1_1 = "Error closing HTTP compressed POST connection output stream. appId";
                        this.zzf.zzt();
                        var2_2 = null;
                        var3_5 = null;
                        var4_6 = this.zza;
                        var5_7 = zzda.zza();
                        var6_16 = "client-measurement";
                        var4_6 = var5_7.zza((URL)var4_6, (String)var6_16);
                        var7_19 = var4_6 instanceof HttpURLConnection;
                        if (var7_19 == 0) break block32;
                        var4_6 = (HttpURLConnection)var4_6;
                        var4_6.setDefaultUseCaches(false);
                        var7_19 = 60000;
                        var4_6.setConnectTimeout(var7_19);
                        var7_19 = 61000;
                        var4_6.setReadTimeout(var7_19);
                        var4_6.setInstanceFollowRedirects(false);
                        var7_19 = 1;
                        var4_6.setDoInput((boolean)var7_19);
                        var6_16 = this.zze;
                        if (var6_16 != null) {
                            var6_16 = var6_16.entrySet();
                            var6_16 = var6_16.iterator();
                            while (var8_20 = var6_16.hasNext()) {
                                var9_21 = var6_16.next();
                                var9_21 = (Map.Entry)var9_21;
                                var10_22 = var9_21.getKey();
                                var10_22 = (String)var10_22;
                                var9_21 = var9_21.getValue();
                                var9_21 = (String)var9_21;
                                var4_6.addRequestProperty((String)var10_22, (String)var9_21);
                            }
                        }
                        if ((var6_16 = (Object)this.zzb) == null) break block29;
                        var6_16 = this.zzf;
                        var6_16 = var6_16.h_();
                        var9_21 = this.zzb;
                        var6_16 = var6_16.zzb((byte[])var9_21);
                        var9_21 = this.zzf;
                        var9_21 = var9_21.zzj();
                        var9_21 = var9_21.zzq();
                        var10_22 = "Uploading data. size";
                        var14_29 = ((Object)var6_16).length;
                        var13_28 = var14_29;
                        var9_21.zza((String)var10_22, var13_28);
                        var4_6.setDoOutput((boolean)var7_19);
                        var5_7 = "Content-Encoding";
                        var9_21 = "gzip";
                        var4_6.addRequestProperty((String)var5_7, (String)var9_21);
                        var7_19 = ((Object)var6_16).length;
                        var4_6.setFixedLengthStreamingMode(var7_19);
                        var4_6.connect();
                        var5_7 = var4_6.getOutputStream();
                        try {
                            var5_7.write((byte[])var6_16);
                            var5_7.close();
                        }
                        catch (Throwable var6_17) {
                            var11_23 = null;
                            var2_2 = var5_7;
                            var3_5 = var6_17;
                            ** GOTO lbl120
                        }
                        catch (IOException var6_18) {
                            var11_24 = null;
                            var2_2 = var5_7;
                            var13_28 = var6_18;
                            ** GOTO lbl143
                        }
                    }
                    var14_29 = var4_6.getResponseCode();
                    var15_30 = var4_6.getHeaderFields();
                    try {
                        var3_5 = this.zzf;
                        var11_25 = zzgv.zza((zzgv)var3_5, (HttpURLConnection)var4_6);
                        var4_6.disconnect();
                        var1_1 = this.zzf.zzl();
                        var9_21 = this.zzd;
                        var10_22 = this.zzc;
                        var6_16 = var2_2;
                        var2_2 = new zzgx((String)var9_21, (zzgu)var10_22, var14_29, null, var11_25, var15_30, null);
                        var1_1.zzb((Runnable)var2_2);
                        return;
                    }
                    catch (Throwable var5_10) {
                        var3_5 = var5_10;
                        var12_26 = var14_29;
                        var11_23 = var15_30;
                        break block30;
                    }
                    catch (IOException var5_11) {
                        block33: {
                            var12_27 = var14_29;
                            var11_24 = var15_30;
                            break block33;
                            catch (Throwable var5_12) {
                                var11_23 = null;
                                var3_5 = var5_12;
                                var12_26 = var14_29;
                                break block30;
                            }
                            catch (IOException var5_13) {
                                var11_24 = null;
                                var12_27 = var14_29;
                            }
                        }
                        var13_28 = var5_7;
                        break block31;
                    }
                }
                try {
                    var5_7 = "Failed to obtain HTTP connection";
                    var4_6 = new IOException((String)var5_7);
                    throw var4_6;
                }
                catch (Throwable var5_14) {}
                catch (IOException var5_15) {}
                finally {
                    var4_6 = null;
                    var11_23 = null;
                    ** GOTO lbl119
                }
                catch (Throwable var5_8) {
                    var11_23 = null;
lbl119:
                    // 2 sources

                    var3_5 = var5_7;
lbl120:
                    // 2 sources

                    var12_26 = 0;
                    var10_22 = null;
                }
            }
            if (var2_2 != null) {
                try {
                    var2_2.close();
                }
                catch (IOException var2_3) {
                    var5_7 = this.zzf.zzj().zzg();
                    var6_16 = zzgo.zza(this.zzd);
                    var5_7.zza((String)var1_1, var6_16, var2_3);
                }
            }
            if (var4_6 != null) {
                var4_6.disconnect();
            }
            var1_1 = this.zzf.zzl();
            var6_16 = this.zzd;
            var9_21 = this.zzc;
            var5_7 = var2_2;
            var2_2 = new zzgx((String)var6_16, (zzgu)var9_21, var12_26, null, null, var11_23, null);
            var1_1.zzb((Runnable)var2_2);
            throw var3_5;
            catch (IOException var5_9) {
                var11_24 = null;
                var13_28 = var5_7;
lbl143:
                // 2 sources

                var12_27 = 0;
                var10_22 = null;
            }
        }
        if (var2_2 != null) {
            try {
                var2_2.close();
            }
            catch (IOException var2_4) {
                var3_5 = this.zzf.zzj().zzg();
                var5_7 = zzgo.zza(this.zzd);
                var3_5.zza((String)var1_1, var5_7, var2_4);
            }
        }
        if (var4_6 != null) {
            var4_6.disconnect();
        }
        var1_1 = this.zzf.zzl();
        var6_16 = this.zzd;
        var9_21 = this.zzc;
        var5_7 = var2_2;
        var2_2 = new zzgx((String)var6_16, (zzgu)var9_21, var12_27, (Throwable)var13_28, null, var11_24, null);
        var1_1.zzb((Runnable)var2_2);
    }
}

