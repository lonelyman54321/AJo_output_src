/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xs3
 */
public final class xs3_0
implements Serializable {
    public final Object a;
    public final Object b;
    public final Object c;

    public xs3_0(Object object, Object object2, Object object3) {
        this.a = object;
        this.b = object2;
        this.c = object3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof xs3_0;
        if (!bl3) {
            return false;
        }
        object = (xs3_0)object;
        Object object2 = this.a;
        Object object3 = ((xs3_0)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((xs3_0)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object = ((xs3_0)object).c;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        Object object = this.a;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = object.hashCode();
        }
        n4 *= 31;
        Object object2 = this.b;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = object2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object2 = this.c;
        if (object2 != null) {
            n7 = object2.hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        Object object = this.a;
        stringBuilder.append(object);
        object = ", ";
        stringBuilder.append((String)object);
        Object object2 = this.b;
        stringBuilder.append(object2);
        stringBuilder.append((String)object);
        object = this.c;
        return gl1_0.a(stringBuilder, object, ')');
    }
}

