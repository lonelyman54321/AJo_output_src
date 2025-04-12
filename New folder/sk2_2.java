/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.scheduling.CoroutineScheduler$Worker;

/*
 * Renamed from sK2
 */
public final class sk2_2 {
    private volatile AtomicReferenceArray array;

    public sk2_2(int n3) {
        AtomicReferenceArray atomicReferenceArray;
        this.array = atomicReferenceArray = new AtomicReferenceArray(n3);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int n3) {
        Object e2;
        AtomicReferenceArray atomicReferenceArray = this.array;
        int n4 = atomicReferenceArray.length();
        if (n3 < n4) {
            e2 = atomicReferenceArray.get(n3);
        } else {
            n3 = 0;
            e2 = null;
        }
        return e2;
    }

    public final void c(int n3, CoroutineScheduler$Worker coroutineScheduler$Worker) {
        AtomicReferenceArray atomicReferenceArray = this.array;
        int n4 = atomicReferenceArray.length();
        if (n3 < n4) {
            atomicReferenceArray.set(n3, coroutineScheduler$Worker);
            return;
        }
        int n7 = n3 + 1;
        int n8 = n4 * 2;
        if (n7 < n8) {
            n7 = n8;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(n7);
        for (n7 = 0; n7 < n4; ++n7) {
            Object e2 = atomicReferenceArray.get(n7);
            atomicReferenceArray2.set(n7, e2);
        }
        atomicReferenceArray2.set(n3, coroutineScheduler$Worker);
        this.array = atomicReferenceArray2;
    }
}

