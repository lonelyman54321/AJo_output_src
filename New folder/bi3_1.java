/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.scheduling.Task;

/*
 * Renamed from BI3
 */
public final class bi3_1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final /* synthetic */ AtomicIntegerFieldUpdater e;
    public final AtomicReferenceArray a;
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Class<bi3_1> clazz = bi3_1.class;
        b = AtomicReferenceFieldUpdater.newUpdater(clazz, Object.class, "lastScheduledTask$volatile");
        c = AtomicIntegerFieldUpdater.newUpdater(clazz, "producerIndex$volatile");
        d = AtomicIntegerFieldUpdater.newUpdater(clazz, "consumerIndex$volatile");
        e = AtomicIntegerFieldUpdater.newUpdater(clazz, "blockingTasksInBuffer$volatile");
    }

    public bi3_1() {
        AtomicReferenceArray atomicReferenceArray;
        this.a = atomicReferenceArray = new AtomicReferenceArray(128);
    }

    public final Task a(Task task2) {
        Object e2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        int n3 = atomicIntegerFieldUpdater.get(this);
        Object object = d;
        int n4 = ((AtomicIntegerFieldUpdater)object).get(this);
        if ((n3 -= n4) == (n4 = 127)) {
            return task2;
        }
        n3 = (int)(task2.b ? 1 : 0);
        if (n3 != 0) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = e;
            atomicIntegerFieldUpdater2.incrementAndGet(this);
        }
        n3 = atomicIntegerFieldUpdater.get(this) & n4;
        while ((e2 = ((AtomicReferenceArray)(object = this.a)).get(n3)) != null) {
            Thread.yield();
        }
        ((AtomicReferenceArray)object).lazySet(n3, task2);
        atomicIntegerFieldUpdater.incrementAndGet(this);
        return null;
    }

    public final Task b() {
        int n3;
        int n4;
        int n7;
        Object object;
        boolean bl2;
        do {
            object = d;
            n7 = ((AtomicIntegerFieldUpdater)object).get(this);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
            n3 = atomicIntegerFieldUpdater.get(this);
            if ((n3 = n7 - n3) == 0) {
                return null;
            }
            n3 = n7 & 0x7F;
        } while (!(bl2 = ((AtomicIntegerFieldUpdater)object).compareAndSet(this, n7, n4 = n7 + 1)) || (object = (Task)this.a.getAndSet(n3, null)) == null);
        n7 = (int)(((Task)object).b ? 1 : 0);
        if (n7 != 0) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e;
            atomicIntegerFieldUpdater.decrementAndGet(this);
        }
        return object;
    }

    public final Task c(int n3, boolean bl2) {
        boolean bl3;
        AtomicReferenceArray atomicReferenceArray = this.a;
        Task task2 = (Task)atomicReferenceArray.get(n3 &= 0x7F);
        if (task2 != null && (bl3 = task2.b) == bl2) {
            Object e2;
            do {
                if (!(bl3 = atomicReferenceArray.compareAndSet(n3, task2, null))) continue;
                if (bl2) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                }
                return task2;
            } while ((e2 = atomicReferenceArray.get(n3)) == task2);
        }
        return null;
    }
}

