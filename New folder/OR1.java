/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class OR1 {
    public final nr1_1 a;

    public /* synthetic */ OR1(nr1_1 nr1_12) {
        this.a = nr1_12;
    }

    public final boolean equals(Object object) {
        nr1_1 nr1_12;
        boolean bl2;
        boolean bl3 = object instanceof OR1;
        boolean bl4 = false;
        if (bl3 && (bl2 = Intrinsics.areEqual(nr1_12 = this.a, object = ((OR1)object).a))) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MutableScatterMultiMap(map=");
        nr1_1 nr1_12 = this.a;
        stringBuilder.append(nr1_12);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

