/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AR2
 */
public final class ar2_2
implements f80_0,
k90_0 {
    private static final AR2$a b;
    public static final AtomicReferenceFieldUpdater c;
    public final f80_0 a;
    private volatile Object result;

    static {
        AR2$a aR2$a;
        b = aR2$a = new AR2$a(null);
        c = AtomicReferenceFieldUpdater.newUpdater(ar2_2.class, Object.class, "result");
    }

    public ar2_2() {
        throw null;
    }

    public ar2_2(f80_0 f80_02, Object object) {
        Intrinsics.checkNotNullParameter(f80_02, "delegate");
        this.a = f80_02;
        this.result = object;
    }

    public final Object a() {
        Object object;
        block7: {
            block6: {
                block5: {
                    object = this.result;
                    j90_0 j90_02 = j90_0.UNDECIDED;
                    if (object == j90_02) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
                        j90_0 j90_03 = j90_0.COROUTINE_SUSPENDED;
                        do {
                            boolean bl2;
                            if (!(bl2 = atomicReferenceFieldUpdater.compareAndSet(this, j90_02, j90_03))) continue;
                            return j90_0.COROUTINE_SUSPENDED;
                        } while ((object = atomicReferenceFieldUpdater.get(this)) == j90_02);
                        object = this.result;
                    }
                    if (object != (j90_02 = j90_0.RESUMED)) break block5;
                    object = j90_0.COROUTINE_SUSPENDED;
                    break block6;
                }
                boolean bl3 = object instanceof tL2$b;
                if (bl3) break block7;
            }
            return object;
        }
        throw ((tL2$b)object).a;
    }

    public final k90_0 getCallerFrame() {
        Object object = this.a;
        boolean bl2 = object instanceof k90_0;
        object = bl2 ? (k90_0)object : null;
        return object;
    }

    public final CoroutineContext getContext() {
        return this.a.getContext();
    }

    public final void resumeWith(Object object) {
        while (true) {
            Object v4;
            Object object2;
            j90_0 j90_02;
            Object object3;
            if ((object3 = this.result) == (j90_02 = j90_0.UNDECIDED)) {
                object2 = c;
                do {
                    boolean bl2;
                    if (!(bl2 = ((AtomicReferenceFieldUpdater)object2).compareAndSet(this, j90_02, object))) continue;
                    return;
                } while ((object3 = ((AtomicReferenceFieldUpdater)object2).get(this)) == j90_02);
                continue;
            }
            j90_02 = j90_0.COROUTINE_SUSPENDED;
            if (object3 != j90_02) break;
            object3 = c;
            object2 = j90_0.RESUMED;
            do {
                boolean bl3;
                if (!(bl3 = ((AtomicReferenceFieldUpdater)object3).compareAndSet(this, j90_02, object2))) continue;
                this.a.resumeWith(object);
                return;
            } while ((v4 = ((AtomicReferenceFieldUpdater)object3).get(this)) == j90_02);
        }
        object = new IllegalStateException("Already resumed");
        throw object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SafeContinuation for ");
        f80_0 f80_02 = this.a;
        stringBuilder.append(f80_02);
        return stringBuilder.toString();
    }
}

