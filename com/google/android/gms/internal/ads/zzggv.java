/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

public final class zzggv {
    public static Object zza(Future future) {
        boolean bl2 = false;
        Thread thread2 = null;
        while (true) {
            block5: {
                try {
                    future = future.get();
                    if (!bl2) break block5;
                }
                catch (Throwable throwable) {
                    if (bl2) {
                        thread2 = Thread.currentThread();
                        thread2.interrupt();
                    }
                    throw throwable;
                }
                catch (InterruptedException interruptedException) {
                    bl2 = true;
                    continue;
                }
                thread2 = Thread.currentThread();
                thread2.interrupt();
            }
            return future;
            break;
        }
    }
}

