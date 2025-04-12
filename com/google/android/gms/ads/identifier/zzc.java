/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.identifier;

import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class zzc {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void zza(String var0) {
        block13: {
            block11: {
                var1_2 = 263;
                zzi.zzb(var1_2);
                var2_3 = new URL(var0);
                var2_3 = var2_3.openConnection();
                var2_3 = (HttpURLConnection)var2_3;
                {
                    block12: {
                        catch (RuntimeException var2_4) {
                            break block11;
                        }
                        catch (IOException var2_5) {
                            break block11;
                        }
                        catch (IndexOutOfBoundsException var2_6) {
                            ** GOTO lbl-1000
                        }
                        var3_9 = var2_3.getResponseCode();
                        var4_10 = 200;
                        if (var3_9 >= var4_10 && var3_9 < (var4_10 = 300)) break block12;
                        var5_11 = String.valueOf(var0);
                        var3_9 = var5_11.length() + 65;
                        var6_13 = new StringBuilder(var3_9);
                    }
                    try {
                        var2_3.disconnect();
                    }
                    catch (Throwable var0_1) {
                        break block13;
                    }
                    zzi.zza();
                    return;
                    catch (Throwable var5_12) {}
                    {
                        var2_3.disconnect();
                        throw var5_12;
                    }
                }
            }
            var2_7 /* !! */  = var2_7 /* !! */ .getMessage();
            var0 = String.valueOf(var0);
            var7_14 = var0.length() + 27;
            var2_7 /* !! */  = String.valueOf(var2_7 /* !! */ );
            var1_2 = var2_7 /* !! */ .length();
            var2_7 /* !! */  = new StringBuilder(var7_14 += var1_2);
            zzi.zza();
            return;
lbl-1000:
            // 1 sources

            {
                var2_8 /* !! */  = var2_6.getMessage();
                var0 = String.valueOf(var0);
                var7_15 = var0.length() + 32;
                var2_8 /* !! */  = String.valueOf(var2_8 /* !! */ );
                var1_2 = var2_8 /* !! */ .length();
                var2_8 /* !! */  = new StringBuilder(var7_15 += var1_2);
            }
            zzi.zza();
            return;
        }
        zzi.zza();
        throw var0_1;
    }
}

