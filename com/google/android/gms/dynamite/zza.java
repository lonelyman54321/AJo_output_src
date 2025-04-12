/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
package com.google.android.gms.dynamite;

import android.os.Process;

final class zza
extends Thread {
    public zza(ThreadGroup threadGroup, String string2) {
        super(threadGroup, "GmsDynamite");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        int n3 = 19;
        Process.setThreadPriority((int)n3);
        synchronized (this) {
            Throwable throwable22222;
            while (true) {
                this.wait();
            }
            {
                catch (Throwable throwable22222) {
                }
                catch (InterruptedException interruptedException) {}
                return;
            }
            throw throwable22222;
        }
    }
}

