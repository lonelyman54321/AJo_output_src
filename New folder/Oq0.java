/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public final class Oq0 {
    public final HashMap a;
    public final Oq0$b b;

    public Oq0() {
        Object object = new HashMap();
        this.a = object;
        this.b = object = new Oq0$b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String object) {
        Object object2 = "Removed the wrong lock, expected to remove: ";
        Object object3 = "Cannot release a lock that is not held, safeKey: ";
        synchronized (this) {
            try {
                Object object4 = this.a;
                object4 = ((HashMap)object4).get(object);
                Object object5 = "Argument must not be null";
                dV0.c(object4, (String)object5);
                object4 = (Oq0$a)object4;
                int n3 = ((Oq0$a)object4).b;
                int n4 = 1;
                if (n3 >= n4) {
                    ((Oq0$a)object4).b = n3 -= n4;
                    if (n3 == 0) {
                        object3 = this.a;
                        object3 = ((HashMap)object3).remove(object);
                        n3 = (object3 = (Oq0$a)object3).equals(object4) ? 1 : 0;
                        if (n3 == 0) {
                            StringBuilder stringBuilder = new StringBuilder((String)object2);
                            stringBuilder.append(object4);
                            object2 = ", but actually removed: ";
                            stringBuilder.append((String)object2);
                            stringBuilder.append(object3);
                            object2 = ", safeKey: ";
                            stringBuilder.append((String)object2);
                            stringBuilder.append((String)object);
                            object = stringBuilder.toString();
                            object5 = new IllegalStateException((String)object);
                            throw object5;
                        }
                        object = this.b;
                        ((Oq0$b)object).b((Oq0$a)object3);
                    }
                    // MONITOREXIT @DISABLED, blocks:[0, 3, 7] lbl37 : MonitorExitStatement: MONITOREXIT : this
                    ((Oq0$a)object4).a.unlock();
                    return;
                }
                object5 = new StringBuilder((String)object3);
                ((StringBuilder)object5).append((String)object);
                object = ", interestedThreads: ";
                ((StringBuilder)object5).append((String)object);
                int n7 = ((Oq0$a)object4).b;
                ((StringBuilder)object5).append(n7);
                object = ((StringBuilder)object5).toString();
                object2 = new IllegalStateException((String)object);
                throw object2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

