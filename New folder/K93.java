/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class K93 {
    public final Object a;
    public final int b;

    public K93(Object object, int n3) {
        this.a = object;
        this.b = n3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof K93;
        if (n3 == 0) {
            return false;
        }
        object = (K93)object;
        Object object2 = this.a;
        Object object3 = ((K93)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((K93)object).b;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = this.b;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SourceInformationSlotTableGroupIdentity(parentIdentity=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", index=");
        int n3 = this.b;
        return tu.a(stringBuilder, n3, ')');
    }
}

