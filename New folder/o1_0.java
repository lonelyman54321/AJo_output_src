/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from o1
 */
public abstract class o1_0
extends f0_0
implements Set {
    public static final o1$a a;

    static {
        o1$a o1$a;
        a = o1$a = new o1$a(null);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        int n3 = object instanceof Set;
        boolean bl2 = false;
        if (n3 == 0) {
            return false;
        }
        Object object2 = a;
        object = (Set)object;
        object2.getClass();
        Intrinsics.checkNotNullParameter(this, "c");
        object2 = "other";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        n3 = this.size();
        int n4 = object.size();
        if (n3 == n4) {
            object = (Collection)object;
            bl2 = this.containsAll((Collection<?>)object);
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        a.getClass();
        Intrinsics.checkNotNullParameter(this, "c");
        Iterator iterator = this.iterator();
        int n4 = 0;
        while ((n3 = iterator.hasNext()) != 0) {
            Object e2 = iterator.next();
            if (e2 != null) {
                n3 = e2.hashCode();
            } else {
                n3 = 0;
                e2 = null;
            }
            n4 += n3;
        }
        return n4;
    }

    public Iterator iterator() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }
}

