/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class um2 {
    public final vm2_0 a;
    public final int b;
    public final int c;

    public um2(ii ii2, int n3, int n4) {
        this.a = ii2;
        this.b = n3;
        this.c = n4;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof um2;
        if (n3 == 0) {
            return false;
        }
        object = (um2)object;
        vm2_0 vm2_02 = this.a;
        vm2_0 vm2_03 = ((um2)object).a;
        n3 = Intrinsics.areEqual(vm2_02, vm2_03);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((um2)object).b;
        if (n3 != n4) {
            return false;
        }
        n3 = this.c;
        int n7 = ((um2)object).c;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = this.c;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        vm2_0 vm2_02 = this.a;
        stringBuilder.append(vm2_02);
        stringBuilder.append(", startIndex=");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", endIndex=");
        n3 = this.c;
        return tu.a(stringBuilder, n3, ')');
    }
}

