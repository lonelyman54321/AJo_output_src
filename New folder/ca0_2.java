/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap$Entry;

/*
 * Renamed from CA0
 */
public final class ca0_2
implements Map.Entry,
KMutableMap$Entry {
    public final Object a;
    public Object b;

    public ca0_2(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        Object object2;
        Object object3;
        boolean bl3;
        boolean bl4 = false;
        if (object != null && (bl3 = object instanceof Map.Entry) && (bl3 = Intrinsics.areEqual(object3 = (object = (Map.Entry)object).getKey(), object2 = this.a)) && (bl2 = Intrinsics.areEqual(object = object.getValue(), object3 = this.b))) {
            bl4 = true;
        }
        return bl4;
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    public final int hashCode() {
        Object object = this.a;
        Intrinsics.checkNotNull(object);
        int n3 = object.hashCode() + 527;
        Object object2 = this.b;
        Intrinsics.checkNotNull(object2);
        return object2.hashCode() + n3;
    }

    public final Object setValue(Object object) {
        this.b = object;
        return object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append('=');
        object = this.b;
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

