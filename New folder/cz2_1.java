/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/*
 * Renamed from cZ2
 */
public final class cz2_1
extends wx2_2 {
    public final /* synthetic */ AtomicReferenceArray e;

    public cz2_1(long l2, cz2_1 cz2_12, int n3) {
        super(l2, cz2_12, n3);
        AtomicReferenceArray atomicReferenceArray;
        int n4 = bz2_1.f;
        this.e = atomicReferenceArray = new AtomicReferenceArray(n4);
    }

    public final int g() {
        return bz2_1.f;
    }

    public final void h(int n3, CoroutineContext object) {
        object = bz2_1.e;
        this.e.set(n3, object);
        this.i();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SemaphoreSegment[id=");
        long l2 = this.c;
        stringBuilder.append(l2);
        stringBuilder.append(", hashCode=");
        int n3 = this.hashCode();
        stringBuilder.append(n3);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

