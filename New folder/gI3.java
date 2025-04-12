/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class gI3 {
    public final String a;
    public final int b;

    public gI3(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "workSpecId");
        this.a = string2;
        this.b = n3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof gI3;
        if (n3 == 0) {
            return false;
        }
        object = (gI3)object;
        String string2 = this.a;
        String string3 = ((gI3)object).a;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((gI3)object).b;
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
        StringBuilder stringBuilder = new StringBuilder("WorkGenerationalId(workSpecId=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", generation=");
        int n3 = this.b;
        return tu.a(stringBuilder, n3, ')');
    }
}

