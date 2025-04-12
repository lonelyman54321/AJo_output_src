/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Hl1
 */
public final class hl1_0 {
    public final Object a;
    public final Object b;

    public hl1_0(Integer n3, Object object) {
        this.a = n3;
        this.b = object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof hl1_0;
        if (!bl3) {
            return false;
        }
        object = (hl1_0)object;
        Object object2 = this.a;
        Object object3 = ((hl1_0)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object = ((hl1_0)object).b;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Object object = this.a;
        boolean bl2 = object instanceof Enum;
        int n4 = 0;
        if (bl2) {
            object = (Enum)object;
            n3 = ((Enum)object).ordinal();
        } else if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n3 *= 31;
        Object object2 = this.b;
        boolean bl3 = object2 instanceof Enum;
        if (bl3) {
            object2 = (Enum)object2;
            n4 = ((Enum)object2).ordinal();
        } else if (object2 != null) {
            n4 = object2.hashCode();
        }
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("JoinedKey(left=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", right=");
        object = this.b;
        return gl1_0.a(stringBuilder, object, ')');
    }
}

