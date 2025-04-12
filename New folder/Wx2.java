/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Wx2 {
    public final String a;
    public final Long b;

    public Wx2(String string2, Long l2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        this.a = string2;
        this.b = l2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Wx2;
        if (!bl3) {
            return false;
        }
        object = (Wx2)object;
        String string2 = this.a;
        Object object2 = ((Wx2)object).a;
        bl3 = Intrinsics.areEqual(string2, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((Wx2)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.a;
        int n4 = string2.hashCode() * 31;
        Long l2 = this.b;
        if (l2 == null) {
            n3 = 0;
            l2 = null;
        } else {
            n3 = ((Object)l2).hashCode();
        }
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Preference(key=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", value=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

