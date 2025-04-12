/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/*
 * Renamed from u50
 */
public final class u50_0
implements Sequence {
    public final AtomicReference a;

    public u50_0(Sequence sequence) {
        AtomicReference<Sequence> atomicReference;
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.a = atomicReference = new AtomicReference<Sequence>(sequence);
    }

    public final Iterator iterator() {
        Object object = this.a.getAndSet(null);
        if (object != null) {
            return object.iterator();
        }
        object = new IllegalStateException("This sequence can be consumed only once.");
        throw object;
    }
}

