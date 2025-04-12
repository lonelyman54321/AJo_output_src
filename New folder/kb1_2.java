/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kb1
 */
public final class kb1_2 {
    public final at3_0 a;
    public final Object b;

    public kb1_2(at3_0 at3_02, Object object) {
        Intrinsics.checkNotNullParameter(at3_02, "expectedType");
        Intrinsics.checkNotNullParameter(object, "response");
        this.a = at3_02;
        this.b = object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof kb1_2;
        if (!bl3) {
            return false;
        }
        object = (kb1_2)object;
        at3_0 at3_02 = this.a;
        Object object2 = ((kb1_2)object).a;
        bl3 = Intrinsics.areEqual(at3_02, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((kb1_2)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HttpResponseContainer(expectedType=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", response=");
        object = this.b;
        return gl1_0.a(stringBuilder, object, ')');
    }
}

