/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

public final class U83 {
    public final AtomicReference a;
    public final Object b;
    public Object c;

    public U83() {
        dn3_0 dn3_02 = en3.a;
        Object object = new AtomicReference(dn3_02);
        this.a = object;
        this.b = object = new Object();
    }

    public final Object a() {
        long l2;
        Object object = Thread.currentThread();
        long l3 = ((Thread)object).getId();
        long l4 = l3 - (l2 = T3.a);
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l7 == false) {
            object = this.c;
        } else {
            dn3_0 dn3_02 = (dn3_0)this.a.get();
            int n3 = dn3_02.a(l3);
            if (n3 >= 0) {
                Object[] objectArray = dn3_02.c;
                object = objectArray[n3];
            } else {
                n3 = 0;
                object = null;
            }
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void b(Object object) {
        long l2;
        Thread thread2 = Thread.currentThread();
        long l3 = thread2.getId();
        long l4 = l3 - (l2 = T3.a);
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l7 == false) {
            this.c = object;
            return;
        }
        Object object2 = this.b;
        synchronized (object2) {
            AtomicReference atomicReference;
            Object object3;
            block15: {
                block14: {
                    object3 = this.a;
                    object3 = ((AtomicReference)object3).get();
                    object3 = (dn3_0)object3;
                    l7 = ((dn3_0)object3).a(l3);
                    if (l7 >= 0) break block14;
                    l7 = 0;
                    atomicReference = null;
                    break block15;
                }
                Object[] objectArray = ((dn3_0)object3).c;
                objectArray[l7] = object;
                l7 = 1;
            }
            if (l7 != false) {
                return;
            }
            atomicReference = this.a;
            object = ((dn3_0)object3).b(l3, object);
            atomicReference.set(object);
            object = Unit.a;
            return;
            finally {
            }
        }
    }
}

