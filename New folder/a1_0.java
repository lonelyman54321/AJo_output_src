/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from a1
 */
public abstract class a1_0
implements Map,
KMappedMarker {
    public static final a1$a c;
    public volatile a1$b a;
    public volatile a1$d b;

    static {
        a1$a a1$a;
        c = a1$a = new a1$a(null);
    }

    public final void clear() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public boolean containsKey(Object object) {
        boolean bl2;
        if ((object = this.i(object)) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean containsValue(Object object) {
        Object object2 = this.e();
        boolean bl2 = object2.isEmpty();
        boolean bl3 = false;
        if (!bl2) {
            object2 = object2.iterator();
            while (bl2 = object2.hasNext()) {
                Object v4 = ((Map.Entry)object2.next()).getValue();
                bl2 = Intrinsics.areEqual(v4, object);
                if (!bl2) continue;
                bl3 = true;
                break;
            }
        }
        return bl3;
    }

    public abstract Set e();

    public final boolean equals(Object iterator) {
        boolean bl2;
        block10: {
            Object object;
            int n3;
            block9: {
                int n4;
                bl2 = true;
                if (iterator == this) {
                    return bl2;
                }
                n3 = iterator instanceof Map;
                if (n3 == 0) {
                    return false;
                }
                n3 = this.g();
                if (n3 != (n4 = (iterator = (Map)((Object)iterator)).size())) {
                    return false;
                }
                n3 = (iterator = (Iterable)iterator.entrySet()) instanceof Collection;
                if (n3 == 0) break block9;
                object = iterator;
                object = (Collection)((Object)iterator);
                n3 = (int)(object.isEmpty() ? 1 : 0);
                if (n3 != 0) break block10;
            }
            iterator = ((Iterable)((Object)iterator)).iterator();
            while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object = (Map.Entry)iterator.next();
                if (object != null) {
                    Object k2 = object.getKey();
                    object = object.getValue();
                    Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
                    Object v4 = this.get(k2);
                    n3 = (int)(Intrinsics.areEqual(object, v4) ? 1 : 0);
                    if (n3 != 0) {
                        if (v4 != null) continue;
                        object = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>";
                        Intrinsics.checkNotNull(this, (String)object);
                        n3 = (int)(this.containsKey(k2) ? 1 : 0);
                        if (n3 != 0) continue;
                    }
                }
                bl2 = false;
                break;
            }
        }
        return bl2;
    }

    public Set f() {
        a1$b a1$b = this.a;
        if (a1$b == null) {
            this.a = a1$b = new a1$b(this);
        }
        a1$b = this.a;
        Intrinsics.checkNotNull(a1$b);
        return a1$b;
    }

    public int g() {
        return ((f0_0)((Object)this.e())).a();
    }

    public Object get(Object object) {
        object = (object = this.i(object)) != null ? object.getValue() : null;
        return object;
    }

    public Collection h() {
        a1$d a1$d = this.b;
        if (a1$d == null) {
            this.b = a1$d = new a1$d(this);
        }
        a1$d = this.b;
        Intrinsics.checkNotNull(a1$d);
        return a1$d;
    }

    public final int hashCode() {
        return ((Object)this.e()).hashCode();
    }

    public final Map.Entry i(Object object) {
        Object t3;
        block1: {
            boolean bl2;
            Iterator iterator = this.e().iterator();
            while (bl2 = iterator.hasNext()) {
                Object object2 = t3 = iterator.next();
                object2 = ((Map.Entry)t3).getKey();
                boolean bl3 = Intrinsics.areEqual(object2, object);
                if (!bl3) continue;
                break block1;
            }
            bl2 = false;
            t3 = null;
        }
        return (Map.Entry)t3;
    }

    public final boolean isEmpty() {
        int n3 = this.g();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final Object put(Object object, Object object2) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
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
        Set set = this.e();
        a1$c a1$c = new a1$c(this);
        return CollectionsKt.R(set, ", ", "{", "}", a1$c, 24);
    }
}

