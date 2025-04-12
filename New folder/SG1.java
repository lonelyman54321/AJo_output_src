/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public class SG1
implements Map.Entry,
KMappedMarker {
    public final Object a;
    public final Object b;

    public SG1(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2;
        boolean bl3;
        boolean bl4 = object instanceof Map.Entry;
        if (bl4) {
            object = (Map.Entry)object;
        } else {
            bl3 = false;
            object = null;
        }
        bl4 = false;
        if (object != null && (bl2 = Intrinsics.areEqual(object3 = object.getKey(), object2 = this.a)) && (bl3 = Intrinsics.areEqual(object = object.getValue(), object3 = this.getValue()))) {
            bl4 = true;
        }
        return bl4;
    }

    public final Object getKey() {
        return this.a;
    }

    public Object getValue() {
        return this.b;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        Object object = this.a;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        Object object2 = this.getValue();
        if (object2 != null) {
            n4 = object2.hashCode();
        }
        return n4 ^ n3;
    }

    public Object setValue(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append('=');
        object = this.getValue();
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

