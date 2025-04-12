/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class zzfd {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean zza(CountDownLatch var0, long var1_2, TimeUnit var3_3) {
        block7: {
            var1_2 = 30;
            var4_4 = false;
            var1_2 = var3_3.toNanos(var1_2);
            var5_5 = System.nanoTime() + var1_2;
lbl6:
            // 2 sources

            while (true) {
                var3_3 = TimeUnit.NANOSECONDS;
                var7_6 = var0.await(var1_2, var3_3);
                if (!var4_4) ** GOTO lbl16
                ** GOTO lbl14
                break;
            }
            {
                catch (Throwable var0_1) {
                    break block7;
                }
lbl14:
                // 1 sources

                var8_7 = Thread.currentThread();
                var8_7.interrupt();
lbl16:
                // 2 sources

                return var7_6;
                catch (InterruptedException v0) {}
                var4_4 = true;
                {
                    var1_2 = System.nanoTime();
                    var1_2 = var5_5 - var1_2;
                    ** continue;
                }
            }
        }
        if (var4_4) {
            var8_8 = Thread.currentThread();
            var8_8.interrupt();
        }
        throw var0_1;
    }
}

