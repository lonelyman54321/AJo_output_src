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
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

public final class sV1$b
extends BroadcastReceiver {
    public final /* synthetic */ sV1 a;

    public sV1$b(sV1 sV12) {
        this.a = sV12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onReceive(Context var1_1, Intent var2_2) {
        block21: {
            block22: {
                block23: {
                    block24: {
                        block25: {
                            var2_2 = (ConnectivityManager)var1_1 /* !! */ .getSystemService("connectivity");
                            var3_3 = 5;
                            var4_4 = 0;
                            var5_5 = null;
                            if (var2_2 == null) break block21;
                            try {
                                var2_2 = var2_2.getActiveNetworkInfo();
                                var6_6 = 1;
                            }
                            catch (SecurityException v0) {}
                            if (var2_2 == null || (var7_7 = var2_2.isConnected()) == 0) break block22;
                            var7_7 = var2_2.getType();
                            var8_8 = 9;
                            var9_9 = 6;
                            var10_10 = 4;
                            if (var7_7 == 0) break block23;
                            if (var7_7 == var6_6) break block24;
                            if (var7_7 == var10_10 || var7_7 == var3_3) break block23;
                            if (var7_7 == var9_9) break block25;
                            var4_4 = var7_7 != var8_8 ? 8 : 7;
                            break block21;
                        }
lbl21:
                        // 2 sources

                        while (true) {
                            var4_4 = 5;
                            break block21;
                            break;
                        }
                    }
lbl25:
                    // 2 sources

                    while (true) {
                        var4_4 = 2;
                        break block21;
                        break;
                    }
                }
                var11_11 = var2_2.getSubtype();
                switch (var11_11) {
                    case 13: {
                        ** continue;
                    }
                    case 18: {
                        ** continue;
                    }
                    default: {
                        var4_4 = 6;
                        break;
                    }
                    case 20: {
                        var11_11 = gz3.a;
                        var6_6 = 29;
                        if (var11_11 >= var6_6) {
                            var4_4 = 9;
                            break;
                        }
                        break block21;
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
                        var4_4 = 4;
                        break;
                    }
                    case 1: 
                    case 2: {
                        var11_11 = 3;
                        var4_4 = 3;
                        break;
                    }
                }
                break block21;
            }
            var4_4 = 1;
        }
        var11_11 = gz3.a;
        var6_6 = 31;
        var12_12 = this.a;
        if (var11_11 >= var6_6 && var4_4 == var3_3) {
            var2_2 = "phone";
            var2_2 = var1_1 /* !! */ .getSystemService((String)var2_2);
            var2_2 = (TelephonyManager)var2_2;
            var2_2.getClass();
            var5_5 = new rv1_0(var12_12);
            var1_1 /* !! */  = nv1_0.a(var1_1 /* !! */ );
            ov1_0.a((TelephonyManager)var2_2, (Executor)var1_1 /* !! */ , var5_5);
            try {
                pV1.a((TelephonyManager)var2_2, var5_5);
            }
            catch (RuntimeException v1) {
                sV1.a(var12_12, var3_3);
            }
        } else {
            sV1.a(var12_12, var4_4);
        }
    }
}

