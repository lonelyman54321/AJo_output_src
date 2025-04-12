/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from ER2
 */
public final class er2_2
implements rq1_2,
Serializable {
    public static final er2$a_0 c;
    public static final AtomicReferenceFieldUpdater d;
    public volatile Function0 a;
    public volatile Object b;

    static {
        er2$a_0 er2$a_0;
        c = er2$a_0 = new er2$a_0(null);
        d = AtomicReferenceFieldUpdater.newUpdater(er2_2.class, Object.class, "b");
    }

    public er2_2() {
        throw null;
    }

    private final Object writeReplace() {
        Object object = this.getValue();
        vh1_2 vh1_22 = new vh1_2(object);
        return vh1_22;
    }

    public final Object getValue() {
        Object object = this.b;
        rt3_0 rt3_02 = rt3_0.a;
        if (object != rt3_02) {
            return object;
        }
        object = this.a;
        if (object != null) {
            Object v4;
            object = object.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            do {
                boolean bl2;
                if (!(bl2 = atomicReferenceFieldUpdater.compareAndSet(this, rt3_02, object))) continue;
                this.a = null;
                return object;
            } while ((v4 = atomicReferenceFieldUpdater.get(this)) == rt3_02);
        }
        return this.b;
    }

    public final boolean isInitialized() {
        boolean bl2;
        Object object = this.b;
        rt3_0 rt3_02 = rt3_0.a;
        if (object != rt3_02) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final String toString() {
        boolean bl2 = this.isInitialized();
        String string2 = bl2 ? String.valueOf(this.getValue()) : "Lazy value not initialized yet.";
        return string2;
    }
}

