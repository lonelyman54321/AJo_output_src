/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eZ0
 */
public final class ez0_0 {
    public final int a;
    public final re3_0 b;

    public ez0_0(int n3, re3_0 re3_02) {
        Intrinsics.checkNotNullParameter(re3_02, "hint");
        this.a = n3;
        this.b = re3_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ez0_0;
        if (n3 == 0) {
            return false;
        }
        object = (ez0_0)object;
        int n4 = this.a;
        n3 = ((ez0_0)object).a;
        if (n4 != n3) {
            return false;
        }
        re3_0 re3_02 = this.b;
        object = ((ez0_0)object).b;
        boolean bl3 = Intrinsics.areEqual(re3_02, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GenerationalViewportHint(generationId=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", hint=");
        re3_0 re3_02 = this.b;
        stringBuilder.append(re3_02);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

