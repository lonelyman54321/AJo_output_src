/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from vq1
 */
public final class vq1_2
implements Map {
    public final Map a;

    public vq1_2(ImmutableMap immutableMap) {
        this.a = immutableMap;
    }

    public final void clear() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Dagger map bindings are immutable");
        throw unsupportedOperationException;
    }

    public final boolean containsKey(Object object) {
        boolean bl2 = object instanceof Class;
        if (bl2) {
            object = ((Class)object).getName();
            return this.a.containsKey(object);
        }
        object = new IllegalArgumentException("Key must be a class");
        throw object;
    }

    public final boolean containsValue(Object object) {
        return this.a.containsValue(object);
    }

    public final Set entrySet() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
        throw unsupportedOperationException;
    }

    public final Object get(Object object) {
        boolean bl2 = object instanceof Class;
        if (bl2) {
            object = ((Class)object).getName();
            return this.a.get(object);
        }
        object = new IllegalArgumentException("Key must be a class");
        throw object;
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Set keySet() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
        throw unsupportedOperationException;
    }

    public final Object put(Object object, Object object2) {
        object = (Class)object;
        object = new UnsupportedOperationException("Dagger map bindings are immutable");
        throw object;
    }

    public final void putAll(Map object) {
        object = new UnsupportedOperationException("Dagger map bindings are immutable");
        throw object;
    }

    public final Object remove(Object object) {
        object = new UnsupportedOperationException("Dagger map bindings are immutable");
        throw object;
    }

    public final int size() {
        return this.a.size();
    }

    public final Collection values() {
        return this.a.values();
    }
}

