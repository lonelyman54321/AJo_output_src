/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from nz0
 */
public final class nz0_2
implements Map,
Serializable,
KMappedMarker {
    public static final nz0_2 a;
    private static final long serialVersionUID = 8246714829545688274L;

    static {
        nz0_2 nz0_22;
        a = nz0_22 = new Object();
    }

    private final Object readResolve() {
        return a;
    }

    public final void clear() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public final boolean containsKey(Object object) {
        return false;
    }

    public final boolean containsValue(Object object) {
        boolean bl2 = object instanceof Void;
        if (!bl2) {
            return false;
        }
        Intrinsics.checkNotNullParameter((Void)object, "value");
        return false;
    }

    public final Set entrySet() {
        return vz0_2.a;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof Map;
        if (bl3 && (bl2 = (object = (Map)object).isEmpty())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Set keySet() {
        return vz0_2.a;
    }

    public final void putAll(Map object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final Object remove(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final String toString() {
        return "{}";
    }

    public final Collection values() {
        return mz0_2.a;
    }
}

