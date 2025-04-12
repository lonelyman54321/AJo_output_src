/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;

/*
 * Renamed from xp
 */
public final class xp_0
extends i0_0 {
    public static volatile xp_0 b;
    public static final wp_0 c;
    public final kn0 a;

    static {
        wp_0 wp_02;
        c = wp_02 = new Object();
    }

    public xp_0() {
        kn0 kn02;
        this.a = kn02 = new kn0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static xp_0 Q() {
        Object object = b;
        if (object != null) {
            return b;
        }
        object = xp_0.class;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        xp_0 xp_02 = b;
                        if (xp_02 != null) break block4;
                        b = xp_02 = new xp_0();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return b;
            }
            throw throwable2;
        }
    }

    public final boolean R() {
        boolean bl2;
        this.a.getClass();
        Thread thread2 = Looper.getMainLooper().getThread();
        Thread thread3 = Thread.currentThread();
        if (thread2 == thread3) {
            bl2 = true;
        } else {
            bl2 = false;
            thread2 = null;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void S(Runnable runnable2) {
        kn0 kn02;
        block6: {
            kn02 = this.a;
            Object object = kn02.c;
            if (object == null) {
                object = kn02.a;
                synchronized (object) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            try {
                                Handler handler = kn02.c;
                                if (handler != null) break block4;
                                handler = Looper.getMainLooper();
                                kn02.c = handler = kn0.Q((Looper)handler);
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        break block6;
                    }
                    throw throwable2;
                }
            }
        }
        kn02.c.post(runnable2);
    }
}

