/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.net.ConnectivityManager
 *  android.telephony.TelephonyManager
 */
package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.zzfp;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzfs;
import com.google.android.gms.internal.ads.zzgd;
import java.util.concurrent.Executor;

final class zzfr
extends BroadcastReceiver {
    final /* synthetic */ zzfs zza;

    public /* synthetic */ zzfr(zzfs zzfs2, zzfq zzfq2) {
        this.zza = zzfs2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onReceive(Context var1_1, Intent var2_2) {
        block22: {
            block25: {
                block26: {
                    block27: {
                        block24: {
                            var2_2 /* !! */  = (ConnectivityManager)var1_1 /* !! */ .getSystemService("connectivity");
                            var3_3 = 0;
                            var4_4 = null;
                            var5_5 = 5;
                            if (var2_2 /* !! */  == null) break block22;
                            try {
                                var2_2 /* !! */  = var2_2 /* !! */ .getActiveNetworkInfo();
                                var6_6 = 1;
                            }
                            catch (SecurityException v0) {}
                            if (var2_2 /* !! */  != null && (var7_7 = var2_2 /* !! */ .isConnected()) != 0) break block24;
                            var3_3 = 1;
                            break block22;
                        }
                        var7_7 = var2_2 /* !! */ .getType();
                        var8_8 = 9;
                        var9_9 = 6;
                        var10_10 = 4;
                        if (var7_7 == 0) break block25;
                        if (var7_7 == var6_6) break block26;
                        if (var7_7 == var10_10 || var7_7 == var5_5) break block25;
                        if (var7_7 == var9_9) break block27;
                        var3_3 = var7_7 != var8_8 ? 8 : 7;
                        break block22;
                    }
lbl24:
                    // 2 sources

                    while (true) {
                        var3_3 = 5;
                        break block22;
                        break;
                    }
                }
lbl28:
                // 2 sources

                while (true) {
                    var3_3 = 2;
                    break block22;
                    break;
                }
            }
            var11_11 = var2_2 /* !! */ .getSubtype();
            switch (var11_11) {
                case 13: {
                    ** continue;
                }
                case 18: {
                    ** continue;
                }
                default: {
                    var3_3 = 6;
                    break;
                }
                case 20: {
                    var11_11 = zzgd.zza;
                    var6_6 = 29;
                    if (var11_11 >= var6_6) {
                        var3_3 = 9;
                    }
                    break;
                }
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 14: 
                case 15: 
                case 17: {
                    var3_3 = 4;
                    break;
                }
                case 1: 
                case 2: {
                    var3_3 = 3;
                    break;
                }
            }
        }
        var11_11 = zzgd.zza;
        var6_6 = 31;
        if (var11_11 >= var6_6 && var3_3 == var5_5) {
            block23: {
                var2_2 /* !! */  = this.zza;
                var4_4 = "phone";
                var4_4 = var1_1 /* !! */ .getSystemService((String)var4_4);
                var4_4 = (TelephonyManager)var4_4;
                if (var4_4 == null) break block23;
                var12_12 = new zzfp((zzfs)var2_2 /* !! */ );
                var1_1 /* !! */  = nv1_0.a(var1_1 /* !! */ );
                lk3_1.a((TelephonyManager)var4_4, (Executor)var1_1 /* !! */ , var12_12);
                mk3_1.a((TelephonyManager)var4_4, var12_12);
                return;
            }
            var1_1 /* !! */  = null;
            throw null;
lbl79:
            // 1 sources

            while (true) {
                zzfs.zzc((zzfs)var2_2 /* !! */ , var5_5);
                return;
            }
        }
        zzfs.zzc(this.zza, var3_3);
        return;
        catch (RuntimeException v1) {
            ** continue;
        }
    }
}

