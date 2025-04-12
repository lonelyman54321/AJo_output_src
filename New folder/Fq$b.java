/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Fq$b {
    public final LU0 a;
    public final Object b;

    public Fq$b(LU0 lU0, Object object) {
        this.a = lU0;
        this.b = object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Fq$b;
        if (!bl3) {
            return false;
        }
        object = (Fq$b)object;
        LU0 lU0 = this.a;
        Object object2 = ((Fq$b)object).a;
        bl3 = Intrinsics.areEqual(lU0, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((Fq$b)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        LU0 lU0 = this.a;
        int n4 = lU0.hashCode() * 31;
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
        StringBuilder stringBuilder = new StringBuilder("Key(font=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", loaderKey=");
        object = this.b;
        return gl1_0.a(stringBuilder, object, ')');
    }
}

