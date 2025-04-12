/*
 * Decompiled with CFR 0.152.
 */
public final class f40 {
    public boolean a;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2;
                    while (!(bl2 = this.a)) {
                        this.wait();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block7: {
                    boolean bl2 = false;
                    Thread thread2 = null;
                    try {
                        boolean bl3;
                        while (!(bl3 = this.a)) {
                            try {
                                this.wait();
                            }
                            catch (InterruptedException interruptedException) {
                                bl2 = true;
                            }
                        }
                        if (!bl2) break block7;
                        thread2 = Thread.currentThread();
                        thread2.interrupt();
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        synchronized (this) {
            Object var1_1 = null;
            this.a = false;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean d() {
        synchronized (this) {
            return this.a;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean e() {
        synchronized (this) {
            boolean bl2 = this.a;
            if (bl2) {
                return false;
            }
            this.a = bl2 = true;
            this.notifyAll();
            return bl2;
        }
    }
}

