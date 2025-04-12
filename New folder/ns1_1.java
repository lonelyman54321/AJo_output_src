/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Renamed from NS1
 */
public final class ns1_1
implements Runnable {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable3;
        Class<os1_1> clazz;
        block7: {
            Throwable throwable22;
            AtomicBoolean atomicBoolean;
            block6: {
                atomicBoolean = os1_1.d;
                clazz = os1_1.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return;
                }
                bl2 = false;
                try {
                    boolean bl3;
                    Object object = os1_1.b;
                    object = object.iterator();
                    while (bl3 = object.hasNext()) {
                        Object object2 = object.next();
                        object2 = (OS1$e)object2;
                        boolean bl4 = true;
                        ((OS1$e)object2).a(bl4);
                    }
                }
                catch (Throwable throwable22) {
                    break block6;
                }
                try {
                    atomicBoolean.set(false);
                    return;
                }
                catch (Throwable throwable3) {}
                break block7;
            }
            atomicBoolean.set(false);
            throw throwable22;
        }
        td0.a(clazz, throwable3);
    }
}

