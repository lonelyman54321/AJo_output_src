/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class UG1$a
implements Map.Entry,
KMappedMarker {
    public final Object a;
    public final Object b;

    public UG1$a(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof UG1$a;
        if (!bl3) {
            return false;
        }
        object = (UG1$a)object;
        Object object2 = this.a;
        Object object3 = ((UG1$a)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object = ((UG1$a)object).b;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        Object object = this.a;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n3 *= 31;
        Object object2 = this.b;
        if (object2 != null) {
            n4 = object2.hashCode();
        }
        return n3 + n4;
    }

    public final Object setValue(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MapEntry(key=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", value=");
        object = this.b;
        return gl1_0.a(stringBuilder, object, ')');
    }
}

