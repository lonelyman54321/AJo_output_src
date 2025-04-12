/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import io.reactivex.internal.schedulers.RxThreadFactory;
import io.reactivex.internal.schedulers.SchedulerPoolFactory$ScheduledTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class SchedulerPoolFactory {
    public static final boolean a;
    public static final int b;
    public static final AtomicReference c;
    public static final ConcurrentHashMap d;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static {
        block15: {
            block14: {
                block13: {
                    var0 = new AtomicReference();
                    SchedulerPoolFactory.c = var0;
                    var0 = new ConcurrentHashMap();
                    SchedulerPoolFactory.d = var0;
                    var0 = "rx2.purge-enabled";
                    var1_1 = 1;
                    var0 = System.getProperty((String)var0);
                    if (var0 == null) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var2_3 = 1;
                            break block13;
                            break;
                        }
                    }
                    var3_2 = "true";
                    var2_3 = var3_2.equals(var0);
                }
                SchedulerPoolFactory.a = var2_3;
                var3_2 = "rx2.purge-period-seconds";
                if (var2_3 != 0) {
                    var0 = System.getProperty((String)var3_2);
                    if (var0 != null) break block14;
                }
lbl23:
                // 4 sources

                while (true) {
                    var2_3 = 1;
                    break block15;
                    break;
                }
            }
            try {
                var2_3 = Integer.parseInt((String)var0);
            }
            catch (Throwable v1) {
                ** continue;
            }
        }
        SchedulerPoolFactory.b = var2_3;
        var2_3 = SchedulerPoolFactory.a;
        if (var2_3 != 0) {
            block8: while ((var3_2 = (ScheduledExecutorService)(var0 = SchedulerPoolFactory.c).get()) == null) {
                var5_5 = "RxSchedulerPurge";
                var4_4 /* !! */  = new RxThreadFactory(var5_5);
                var6_6 = Executors.newScheduledThreadPool(var1_1, var4_4 /* !! */ );
                do {
                    if (!(var7_7 = var0.compareAndSet(var3_2, var6_6))) continue;
                    var8_8 = new SchedulerPoolFactory$ScheduledTask();
                    var2_3 = SchedulerPoolFactory.b;
                    var9_9 = var2_3;
                    var11_10 = TimeUnit.SECONDS;
                    var6_6.scheduleAtFixedRate(var8_8, var9_9, var9_9, var11_10);
                    break block8;
                } while ((var4_4 /* !! */  = var0.get()) == var3_2);
                var6_6.shutdownNow();
            }
        }
        return;
        catch (Throwable v0) {
            ** continue;
        }
    }
}

