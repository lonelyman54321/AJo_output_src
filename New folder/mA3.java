/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class mA3 {
    public final String a;
    public final Object b;

    public mA3(String string2, Object object) {
        this.a = string2;
        this.b = object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof mA3;
        if (!bl3) {
            return false;
        }
        object = (mA3)object;
        String string2 = this.a;
        Object object2 = ((mA3)object).a;
        bl3 = Intrinsics.areEqual(string2, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((mA3)object).b;
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
        StringBuilder stringBuilder = new StringBuilder("ValueElement(name=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", value=");
        object = this.b;
        return gl1_0.a(stringBuilder, object, ')');
    }
}

