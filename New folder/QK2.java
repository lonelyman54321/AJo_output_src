/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;

public final class QK2 {
    public boolean a;
    public final Handler b;

    public QK2() {
        Handler handler;
        QK2$a qK2$a;
        Looper looper = Looper.getMainLooper();
        this.b = handler = new Handler(looper, (Handler.Callback)qK2$a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(wk2_0 wk2_02, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    int n3;
                    block3: {
                        try {
                            boolean bl3 = this.a;
                            n3 = 1;
                            if (bl3 || bl2) break block3;
                            this.a = n3;
                            wk2_02.a();
                            wk2_02 = null;
                            this.a = false;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    Handler handler = this.b;
                    wk2_02 = handler.obtainMessage(n3, (Object)wk2_02);
                    wk2_02.sendToTarget();
                }
                return;
            }
            throw throwable2;
        }
    }
}

