/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/*
 * Renamed from uC1
 */
public final class uc1_0
implements Runnable {
    public final /* synthetic */ yc1_1 a;

    public /* synthetic */ uc1_0(yc1_1 yc1_12) {
        this.a = yc1_12;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Semaphore semaphore;
        block4: {
            Throwable throwable222;
            block6: {
                Object object;
                Object object2;
                block5: {
                    object2 = this.a;
                    semaphore = object2.N;
                    object = object2.p;
                    if (object == null) {
                        return;
                    }
                    try {
                        semaphore.acquire();
                        KC1 kC1 = object2.b;
                        float f5 = kC1.e();
                        ((g30_0)object).s(f5);
                        boolean bl2 = yc1_1.S;
                        if (!bl2 || !(bl2 = object2.L)) break block4;
                        object = object2.O;
                        if (object != null) break block5;
                        kC1 = Looper.getMainLooper();
                        object = new Handler((Looper)kC1);
                        object2.O = object;
                        object2.P = object = new oc1_0((yc1_1)((Object)object2));
                    }
                    catch (Throwable throwable222) {
                        break block6;
                    }
                }
                object = object2.O;
                object2 = object2.P;
                object.post((Runnable)object2);
                break block4;
            }
            semaphore.release();
            throw throwable222;
            catch (InterruptedException interruptedException) {}
        }
        semaphore.release();
    }
}

