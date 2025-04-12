/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.HandlerThread
 *  android.os.Looper
 */
import android.os.HandlerThread;
import android.os.Looper;

/*
 * Renamed from Nt2
 */
public final class nt2_0 {
    public final Object a;
    public Looper b;
    public HandlerThread c;
    public int d;

    public nt2_0() {
        Object object;
        this.a = object = new Object();
        this.b = null;
        this.c = null;
        this.d = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Looper a() {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                int n3;
                int n4;
                block3: {
                    Looper looper;
                    block5: {
                        block4: {
                            try {
                                looper = this.b;
                                n4 = 1;
                                if (looper != null) break block3;
                                n3 = this.d;
                                if (n3 || (looper = this.c) != null) break block4;
                                n3 = 1;
                                break block5;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        n3 = 0;
                        looper = null;
                    }
                    ct3.f(n3 != 0);
                    String string2 = "ExoPlayer:Playback";
                    int n7 = -16;
                    looper = new HandlerThread(string2, n7);
                    this.c = looper;
                    looper.start();
                    looper = this.c;
                    this.b = looper = looper.getLooper();
                }
                n3 = this.d + n4;
                this.d = n3;
                return this.b;
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
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                HandlerThread handlerThread;
                int n3;
                try {
                    n3 = this.d;
                    int n4 = 1;
                    if (n3 > 0) {
                        n3 = 1;
                    } else {
                        n3 = 0;
                        handlerThread = null;
                    }
                    ct3.f(n3 != 0);
                    n3 = this.d - n4;
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                this.d = n3;
                if (n3 == 0 && (handlerThread = this.c) != null) {
                    handlerThread.quit();
                    n3 = 0;
                    handlerThread = null;
                    this.c = null;
                    this.b = null;
                }
                return;
            }
            throw throwable2;
        }
    }
}

