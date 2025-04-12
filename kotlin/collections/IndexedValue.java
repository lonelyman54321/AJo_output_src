/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import kotlin.jvm.internal.Intrinsics;

public final class IndexedValue {
    public final int a;
    public final Object b;

    public IndexedValue(int n3, Object object) {
        this.a = n3;
        this.b = object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof IndexedValue;
        if (n3 == 0) {
            return false;
        }
        object = (IndexedValue)object;
        int n4 = this.a;
        n3 = ((IndexedValue)object).a;
        if (n4 != n3) {
            return false;
        }
        Object object2 = this.b;
        object = ((IndexedValue)object).b;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.a * 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("IndexedValue(index=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", value=");
        Object object = this.b;
        return gl1_0.a(stringBuilder, object, ')');
    }
}

