/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzccd;
import com.google.android.gms.internal.ads.zzcce;
import com.google.android.gms.internal.ads.zzccf;
import com.google.android.gms.internal.ads.zzcch;
import com.google.android.gms.internal.ads.zzfuu;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzggk;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzcci {
    public static final zzgge zza;
    public static final zzgge zzb;
    public static final zzgge zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgge zze;
    public static final zzgge zzf;

    /*
     * Unable to fully structure code
     */
    static {
        block7: {
            block6: {
                var0 = ClientLibraryUtils.isPackageSide();
                var1_1 = "Default";
                if (!var0) break block6;
                zzfuu.zza();
                var2_2 = new zzcce((String)var1_1);
                var2_2 = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool((ThreadFactory)var2_2));
                break block7;
            }
            var2_2 = zzbep.zzlm;
            var3_3 = zzba.zzc().zzb((zzbeg)var2_2);
            if (var3_3 == null || !(var0 = (var2_2 = (Boolean)(var3_3 = zzba.zzc()).zzb((zzbeg)var2_2)).booleanValue())) ** GOTO lbl-1000
            var2_2 = zzbep.zzln;
            var3_3 = zzba.zzc().zzb((zzbeg)var2_2);
            if (var3_3 == null) ** GOTO lbl-1000
            var3_3 = zzbep.zzlo;
            var4_4 = zzba.zzc().zzb((zzbeg)var3_3);
            if (var4_4 != null) {
                var5_5 = (Integer)zzba.zzc().zzb((zzbeg)var2_2);
                var6_6 = (Integer)zzba.zzc().zzb((zzbeg)var2_2);
                var7_7 = TimeUnit.SECONDS;
                var8_8 = new SynchronousQueue<Runnable>();
                var9_9 = new zzcce((String)var1_1);
                var10_10 = 10;
                var12_11 = var4_4;
                var4_4 = new ThreadPoolExecutor(var5_5, var6_6, var10_10, var7_7, var8_8, var9_9);
                var0 = (Boolean)zzba.zzc().zzb((zzbeg)var3_3);
                var4_4.allowCoreThreadTimeOut(var0);
                var2_2 = var4_4;
            } else lbl-1000:
            // 3 sources

            {
                var7_7 = TimeUnit.SECONDS;
                var8_8 = new SynchronousQueue<Runnable>();
                var9_9 = new zzcce((String)var1_1);
                var5_5 = 2;
                var6_6 = -1 >>> 1;
                var10_10 = 10;
                var12_11 = var2_2;
                var2_2 = new ThreadPoolExecutor(var5_5, var6_6, var10_10, var7_7, var8_8, var9_9);
            }
        }
        var3_3 = null;
        zzcci.zza = var1_1 = new zzcch((Executor)var2_2, null);
        var0 = ClientLibraryUtils.isPackageSide();
        var1_1 = "Loader";
        var13_12 = true;
        if (var0) {
            var2_2 = zzfuu.zza();
            var12_11 = new zzcce((String)var1_1);
            var14_13 = 5;
            var2_2 = var2_2.zzc(var14_13, (ThreadFactory)var12_11, (int)var13_12);
        } else {
            var7_7 = TimeUnit.SECONDS;
            var8_8 = new SynchronousQueue<Runnable>();
            var9_9 = new zzcce((String)var1_1);
            var5_5 = 5;
            var6_6 = 5;
            var10_10 = 10;
            var12_11 = var2_2;
            var2_2 = new ThreadPoolExecutor(var5_5, var6_6, var10_10, var7_7, var8_8, var9_9);
            var2_2.allowCoreThreadTimeOut(var13_12);
        }
        zzcci.zzb = var1_1 = new zzcch((Executor)var2_2, null);
        var0 = ClientLibraryUtils.isPackageSide();
        var1_1 = "Activeview";
        if (var0) {
            var2_2 = zzfuu.zza();
            var12_11 = new zzcce((String)var1_1);
            var2_2 = var2_2.zzb((ThreadFactory)var12_11, (int)var13_12);
        } else {
            var7_7 = TimeUnit.SECONDS;
            var8_8 = new SynchronousQueue<Runnable>();
            var9_9 = new zzcce((String)var1_1);
            var5_5 = 1;
            var6_6 = 1;
            var10_10 = 10;
            var12_11 = var2_2;
            var2_2 = new ThreadPoolExecutor(var5_5, var6_6, var10_10, var7_7, var8_8, var9_9);
            var2_2.allowCoreThreadTimeOut(var13_12);
        }
        zzcci.zzc = var1_1 = new zzcch((Executor)var2_2, null);
        var1_1 = new zzcce("Schedule");
        zzcci.zzd = var2_2 = new zzccd(3, (ThreadFactory)var1_1);
        var2_2 = new zzccf();
        zzcci.zze = var1_1 = new zzcch((Executor)var2_2, null);
        var2_2 = zzggk.zzb();
        zzcci.zzf = var1_1 = new zzcch((Executor)var2_2, null);
    }
}

