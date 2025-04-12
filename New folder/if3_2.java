/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/*
 * Renamed from If3
 */
public final class if3_2
implements zc1_2 {
    public volatile boolean a = false;
    public final ConcurrentHashMap b;
    public final LinkedBlockingQueue c;

    public if3_2() {
        Serializable serializable;
        this.b = serializable = new Serializable();
        this.c = serializable;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ux1_2 a(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object;
                block4: {
                    try {
                        object = this.b;
                        object = ((ConcurrentHashMap)object).get(string2);
                        object = (hf3_2)object;
                        if (object != null) break block4;
                        Serializable serializable = this.c;
                        boolean bl2 = this.a;
                        object = new hf3_2(string2, (LinkedBlockingQueue)serializable, bl2);
                        serializable = this.b;
                        ((ConcurrentHashMap)serializable).put(string2, object);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return object;
            }
            throw throwable2;
        }
    }
}

