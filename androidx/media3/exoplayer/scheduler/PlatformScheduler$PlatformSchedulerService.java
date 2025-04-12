/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.app.job.JobService
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.ConnectivityManager
 *  android.net.Network
 *  android.os.PowerManager
 */
package androidx.media3.exoplayer.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.PowerManager;
import androidx.media3.exoplayer.scheduler.Requirements;

public final class PlatformScheduler$PlatformSchedulerService
extends JobService {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean onStartJob(JobParameters var1_1) {
        block26: {
            block24: {
                block25: {
                    var2_2 = var1_1.getExtras();
                    var4_4 = "requirements";
                    var5_5 = var2_2.getInt((String)var4_4);
                    var3_3 = new Requirements(var5_5);
                    var6_6 = var3_3.a;
                    var5_5 = var6_6 & 1;
                    var7_7 = 2 != 0;
                    var8_8 = 16;
                    if (var5_5 == 0) ** GOTO lbl-1000
                    var4_4 = this.getSystemService("connectivity");
                    var4_4.getClass();
                    var4_4 = (ConnectivityManager)var4_4;
                    var9_9 = var4_4.getActiveNetworkInfo();
                    if (var9_9 == null || !(var10_10 = (boolean)var9_9.isConnected())) break block24;
                    var10_10 = gz3.a;
                    var11_11 = 24 != 0;
                    if (var10_10 < var11_11) break block25;
                    var9_9 = jk2_0.a((ConnectivityManager)var4_4);
                    if (var9_9 == null) break block24;
                    try {
                        var9_9 = var4_4.getNetworkCapabilities((Network)var9_9);
                        if (var9_9 == null) break block24;
                    }
                    catch (SecurityException v0) {}
                    var10_10 = var9_9.hasCapability(var8_8);
                    if (!var10_10) break block24;
                }
                ** if (!(var10_10 = var6_6 & 2) || (var5_5 = (int)var4_4.isActiveNetworkMetered()) == 0) goto lbl-1000
lbl-1000:
                // 1 sources

                {
                    var5_5 = 2;
                    ** GOTO lbl39
                }
                break block24;
lbl-1000:
                // 2 sources

                {
                    var5_5 = 0;
                    var4_4 = null;
                }
                break block26;
            }
            var5_5 = var6_6 & 3;
        }
        var10_10 = var6_6 & 8;
        var11_11 = false;
        if (var10_10) {
            var12_12 = "android.intent.action.BATTERY_CHANGED";
            var9_9 = new IntentFilter(var12_12);
            if ((var9_9 = this.registerReceiver(null, (IntentFilter)var9_9)) == null || (var10_10 = var9_9.getIntExtra(var12_12 = "status", var13_13 = -1)) != var7_7 && var10_10 != (var7_7 = 5 != 0)) {
                var5_5 |= 8;
            }
        }
        var7_7 = var6_6 & 4;
        var10_10 = true;
        if (var7_7) {
            var14_14 = this.getSystemService("power");
            var14_14.getClass();
            var14_14 = (PowerManager)var14_14;
            var15_15 = gz3.a;
            var13_13 = 23;
            if (var15_15 >= var13_13) {
                var7_7 = kK2.a((PowerManager)var14_14);
            } else {
                var7_7 = var14_14.isInteractive();
                if (!var7_7) {
                    var7_7 = true;
                } else {
                    var7_7 = false;
                    var14_14 = null;
                }
            }
            if (!var7_7) {
                var5_5 |= 4;
            }
        }
        if ((var6_6 &= var8_8) != 0) {
            var6_6 = 1;
        } else {
            var6_6 = 0;
            var3_3 = null;
        }
        if (var6_6 != 0) {
            var14_14 = "android.intent.action.DEVICE_STORAGE_LOW";
            var3_3 = new IntentFilter((String)var14_14);
            if ((var3_3 = this.registerReceiver(null, (IntentFilter)var3_3)) == null) {
                var6_6 = 1;
            } else {
                var6_6 = 0;
                var3_3 = null;
            }
            if (var6_6 == 0) {
                var5_5 |= 16;
            }
        }
        if (var5_5 == 0) {
            var1_1 = var2_2.getString("service_action");
            var1_1.getClass();
            var2_2 = var2_2.getString("service_package");
            var2_2.getClass();
            var3_3 = new Intent((String)var1_1);
            var1_1 = var3_3.setPackage((String)var2_2);
            var16_16 = gz3.a;
            var6_6 = 26;
            if (var16_16 >= var6_6) {
                Wy3.a((Context)this, (Intent)var1_1);
            } else {
                this.startService((Intent)var1_1);
            }
        } else {
            var3_3 = "Requirements not met: ";
            var2_2 = new StringBuilder((String)var3_3);
            var2_2.append(var5_5);
            var2_2 = var2_2.toString();
            Cx.f((String)var2_2);
            this.jobFinished((JobParameters)var1_1, var10_10);
        }
        return false;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}

