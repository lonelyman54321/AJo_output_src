/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class P81 {
    public final int a;
    public final int b;
    public final tt2_2 c;

    public P81(int n3, int n4, tt2_2 tt2_22) {
        Intrinsics.checkNotNullParameter(tt2_22, "scrollStateHolder");
        this.a = n3;
        this.b = n4;
        this.c = tt2_22;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof P81;
        if (n3 == 0) {
            return false;
        }
        object = (P81)object;
        int n4 = this.a;
        n3 = ((P81)object).a;
        if (n4 != n3) {
            return false;
        }
        n3 = this.b;
        n4 = ((P81)object).b;
        if (n3 != n4) {
            return false;
        }
        tt2_2 tt2_22 = this.c;
        object = ((P81)object).c;
        boolean bl3 = Intrinsics.areEqual(tt2_22, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        return this.c.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HomeScrollInformation(scrollPos=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", offsetPosition=");
        n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", scrollStateHolder=");
        tt2_2 tt2_22 = this.c;
        stringBuilder.append(tt2_22);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

