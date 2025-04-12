/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;

/*
 * Renamed from zP1
 */
public final class zp1_0
extends VC1 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(Object object, Object object2) {
        object = (AP1$a)object;
        object.getClass();
        object2 = AP1$a.d;
        synchronized (object2) {
            ((ArrayDeque)object2).offer(object);
            return;
        }
    }
}

