/*
 * Decompiled with CFR 0.152.
 */
package androidx.asynclayoutinflater.view;

import java.util.concurrent.ArrayBlockingQueue;

class AsyncLayoutInflater$InflateThread
extends Thread {
    public final ArrayBlockingQueue a;

    static {
        AsyncLayoutInflater$InflateThread asyncLayoutInflater$InflateThread = new AsyncLayoutInflater$InflateThread();
        asyncLayoutInflater$InflateThread.start();
    }

    private AsyncLayoutInflater$InflateThread() {
        ArrayBlockingQueue arrayBlockingQueue;
        this.a = arrayBlockingQueue = new ArrayBlockingQueue(10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object;
        block5: {
            while (true) {
                try {
                    object = this.a;
                    object = ((ArrayBlockingQueue)object).take();
                    object = (wq)object;
                }
                catch (InterruptedException interruptedException) {
                    continue;
                }
                try {}
                catch (RuntimeException runtimeException) {
                    break block5;
                }
                break;
            }
            object.getClass();
            throw null;
        }
        object.getClass();
        throw null;
    }
}

