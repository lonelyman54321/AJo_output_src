/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap$Entry;

public final class NG1$c
implements Map.Entry,
KMutableMap$Entry {
    public final ng1_2 a;
    public final int b;

    public NG1$c(ng1_2 ng1_22, int n3) {
        Intrinsics.checkNotNullParameter(ng1_22, "map");
        this.a = ng1_22;
        this.b = n3;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        Object object2;
        Object object3;
        boolean bl3 = object instanceof Map.Entry;
        if (bl3 && (bl3 = Intrinsics.areEqual(object3 = (object = (Map.Entry)object).getKey(), object2 = this.getKey())) && (bl2 = Intrinsics.areEqual(object = object.getValue(), object3 = this.getValue()))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final Object getKey() {
        Object[] objectArray = this.a.a;
        int n3 = this.b;
        return objectArray[n3];
    }

    public final Object getValue() {
        Object[] objectArray = this.a.b;
        Intrinsics.checkNotNull(objectArray);
        int n3 = this.b;
        return objectArray[n3];
    }

    public final int hashCode() {
        int n3;
        Object object = this.getKey();
        int n4 = 0;
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
        return n3 ^ n4;
    }

    public final Object setValue(Object object) {
        Object object2;
        block3: {
            Object[] objectArray;
            block2: {
                object2 = this.a;
                ((ng1_2)object2).e();
                objectArray = ((ng1_2)object2).b;
                if (objectArray != null) break block2;
                objectArray = ((ng1_2)object2).a;
                int n3 = objectArray.length;
                if (n3 < 0) break block3;
                ((ng1_2)object2).b = objectArray = new Object[n3];
            }
            int n4 = this.b;
            Object object3 = objectArray[n4];
            objectArray[n4] = object;
            return object3;
        }
        object2 = "capacity must be non-negative.".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.getKey();
        stringBuilder.append(object);
        stringBuilder.append('=');
        object = this.getValue();
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

