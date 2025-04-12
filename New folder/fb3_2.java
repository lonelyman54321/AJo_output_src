/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fb3
 */
public final class fb3_2 {
    public final Object a;

    public fb3_2(Object object) {
        this.a = object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof fb3_2;
        if (!bl3) {
            return false;
        }
        object = (fb3_2)object;
        Object object2 = this.a;
        object = ((fb3_2)object).a;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Object object = this.a;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StableHolder(value=");
        Object object = this.a;
        return gl1_0.a(stringBuilder, object, ')');
    }
}

