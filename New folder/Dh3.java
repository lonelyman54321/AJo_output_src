/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobInfo$TriggerContentUri
 *  android.content.ComponentName
 *  android.content.Context
 *  android.net.NetworkRequest
 *  android.net.NetworkRequest$Builder
 *  android.os.Build$VERSION
 *  android.os.PersistableBundle
 */
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;

public final class Dh3 {
    public final ComponentName a;
    public final TV b;
    public final boolean c;

    static {
        qx1.b("SystemJobInfoConverter");
    }

    public Dh3(Context context, TV tV, boolean bl2) {
        this.b = tV;
        context = context.getApplicationContext();
        super(context, SystemJobService.class);
        this.a = tV;
        this.c = bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final JobInfo a(EI3 var1_1, int var2_2) {
        block19: {
            block22: {
                block21: {
                    block23: {
                        block20: {
                            block18: {
                                var3_3 = var1_1.j;
                                var4_4 /* !! */  = new PersistableBundle();
                                var5_5 = var1_1.a;
                                var4_4 /* !! */ .putString("EXTRA_WORK_SPEC_ID", var5_5);
                                var6_6 = var1_1.c();
                                var4_4 /* !! */ .putInt("EXTRA_WORK_SPEC_GENERATION", var6_6);
                                var7_7 = var1_1.f();
                                vh3_0.a(var4_4 /* !! */ , (boolean)var7_7);
                                var5_5 = this.a;
                                var8_8 /* !! */  = new JobInfo.Builder(var2_2, (ComponentName)var5_5);
                                var2_2 = (int)var3_3.h();
                                var9_9 = var8_8 /* !! */ .setRequiresCharging((boolean)var2_2);
                                var7_7 = var3_3.i();
                                var9_9 = var9_9.setRequiresDeviceIdle((boolean)var7_7).setExtras(var4_4 /* !! */ );
                                var4_4 /* !! */  = var3_3.d();
                                var7_7 = Build.VERSION.SDK_INT;
                                var6_6 = 24;
                                var10_10 = 26;
                                var11_11 = false;
                                var12_12 = 1;
                                var13_13 = 28;
                                if (var7_7 < var13_13 || var4_4 /* !! */  == null) break block18;
                                Eh3.a(var9_9, (NetworkRequest)var4_4 /* !! */ );
                                break block19;
                            }
                            var4_4 /* !! */  = var3_3.e();
                            var14_14 /* !! */  = 30;
                            if (var7_7 < var14_14 /* !! */  || var4_4 /* !! */  != (var15_15 /* !! */  = lV1.TEMPORARILY_UNMETERED)) break block20;
                            var4_4 /* !! */  = new NetworkRequest.Builder();
                            var14_14 /* !! */  = 25;
                            var4_4 /* !! */  = var4_4 /* !! */ .addCapability(var14_14 /* !! */ ).build();
                            ud1.a(var9_9, (NetworkRequest)var4_4 /* !! */ );
                            break block19;
                        }
                        var15_15 /* !! */  = (lV1)Dh3$a.a;
                        var16_16 = var4_4 /* !! */ .ordinal();
                        var14_14 /* !! */  = (int)var15_15 /* !! */ [var16_16];
                        if (var14_14 /* !! */  == var12_12) break block21;
                        var16_16 = 2;
                        if (var14_14 /* !! */  == var16_16) ** GOTO lbl57
                        var17_17 = 3;
                        if (var14_14 /* !! */  == var17_17) break block22;
                        var16_16 = 4;
                        if (var14_14 /* !! */  == var16_16) break block23;
                        var17_17 = 5;
                        if (var14_14 /* !! */  != var17_17 || var7_7 < var10_10) ** GOTO lbl-1000
                        break block22;
                    }
                    if (var7_7 >= var6_6) {
                        var16_16 = 3;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var15_15 /* !! */  = qx1.a();
                        var4_4 /* !! */ .toString();
                        var15_15 /* !! */ .getClass();
lbl57:
                        // 2 sources

                        var16_16 = 1;
                    }
                    break block22;
                }
                var16_16 = 0;
            }
            var9_9.setRequiredNetworkType(var16_16);
        }
        var18_18 = var3_3.i();
        if (var18_18 == 0) {
            var4_4 /* !! */  = var1_1.l;
            var15_15 /* !! */  = Au.LINEAR;
            if (var4_4 /* !! */  == var15_15 /* !! */ ) {
                var18_18 = 0;
                var4_4 /* !! */  = null;
            } else {
                var18_18 = 1;
            }
            var19_19 = var1_1.m;
            var9_9.setBackoffCriteria(var19_19, var18_18);
        }
        var19_19 = var1_1.a();
        var4_4 /* !! */  = this.b;
        var21_20 = var4_4 /* !! */ .currentTimeMillis();
        var19_19 -= var21_20;
        var21_20 = 0L;
        var19_19 = Math.max(var19_19, var21_20);
        if (var7_7 <= var13_13) {
            var9_9.setMinimumLatency(var19_19);
        } else {
            var18_18 = var19_19 == var21_20 ? 0 : (var19_19 < var21_20 ? -1 : 1);
            if (var18_18 > 0) {
                var9_9.setMinimumLatency(var19_19);
            } else {
                var18_18 = (int)var1_1.q;
                if (var18_18 == 0 && (var18_18 = (int)this.c) != 0) {
                    xh3_0.a(var9_9);
                }
            }
        }
        if (var7_7 >= var6_6 && (var18_18 = (int)var3_3.f()) != 0) {
            var4_4 /* !! */  = var3_3.c().iterator();
            while ((var7_7 = (int)var4_4 /* !! */ .hasNext()) != 0) {
                var8_8 /* !! */  = (b60$a)var4_4 /* !! */ .next();
                var6_6 = (int)var8_8 /* !! */ .b;
                wh3_0.a();
                var8_8 /* !! */  = Ch3.a(var8_8 /* !! */ .a, var6_6);
                yh3.a(var9_9, (JobInfo.TriggerContentUri)var8_8 /* !! */ );
            }
            var23_21 = var3_3.b();
            zh3.a(var9_9, var23_21);
            var23_21 = var3_3.a();
            Ah3.a(var9_9, var23_21);
        }
        var9_9.setPersisted(false);
        var18_18 = Build.VERSION.SDK_INT;
        if (var18_18 >= var10_10) {
            var7_7 = (int)var3_3.g();
            TY.b(var9_9, (boolean)var7_7);
            var25_22 = (int)var3_3.j();
            UY.b(var9_9, (boolean)var25_22);
        }
        if ((var25_22 = var1_1.k) > 0) {
            var25_22 = 1;
        } else {
            var25_22 = 0;
            var3_3 = null;
        }
        var7_7 = var19_19 == var21_20 ? 0 : (var19_19 < var21_20 ? -1 : 1);
        if (var7_7 > 0) {
            var11_11 = true;
        }
        if (var18_18 >= (var7_7 = 31) && (var7_7 = (int)var1_1.q) != 0 && var25_22 == 0 && !var11_11) {
            bh3_0.a(var9_9);
        }
        if (var18_18 >= (var25_22 = 35) && (var1_1 = var1_1.d()) != null) {
            var9_9.setTraceTag((String)var1_1);
        }
        return var9_9.build();
    }
}

