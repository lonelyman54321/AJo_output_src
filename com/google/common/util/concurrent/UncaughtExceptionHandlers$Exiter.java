/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

final class UncaughtExceptionHandlers$Exiter
implements Thread.UncaughtExceptionHandler {
    private static final Logger logger = Logger.getLogger(UncaughtExceptionHandlers$Exiter.class.getName());
    private final Runtime runtime;

    public UncaughtExceptionHandlers$Exiter(Runtime runtime) {
        this.runtime = runtime;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void uncaughtException(Thread var1_1, Throwable var2_5) {
        block6: {
            var3_6 = 1;
            try {
                var4_7 = UncaughtExceptionHandlers$Exiter.logger;
                var5_9 = Level.SEVERE;
                var6_10 = Locale.ROOT;
                var7_11 = "Caught an exception in %s.  Shutting down.";
                var8_12 = new Object[var3_6];
                var8_12[0] = var1_1;
                var1_1 = String.format(var6_10, var7_11, var8_12);
                var4_7.log(var5_9, (String)var1_1, (Throwable)var2_5);
            }
            catch (Throwable var1_2) {
                break block6;
            }
            catch (Error var1_3) {
                ** GOTO lbl-1000
            }
            catch (RuntimeException var1_4) {
                // empty catch block
                ** GOTO lbl-1000
            }
lbl19:
            // 2 sources

            while (true) {
                var1_1 = this.runtime;
                var1_1.exit(var3_6);
                return;
            }
lbl-1000:
            // 2 sources

            {
                var4_8 = System.err;
                var2_5 = var2_5.getMessage();
                var4_8.println((String)var2_5);
                var1_1 = var1_1.getMessage();
                var4_8.println((String)var1_1);
                ** continue;
            }
        }
        this.runtime.exit(var3_6);
        throw var1_2;
    }
}

