/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Ea1 {
    private final String a;
    private final String b;

    public Ea1(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(string3, "value");
        this.a = string2;
        this.b = string3;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Ea1;
        if (!bl3) {
            return false;
        }
        object = (Ea1)object;
        String string2 = this.a;
        String string3 = ((Ea1)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.b;
        object = ((Ea1)object).b;
        boolean bl4 = Intrinsics.areEqual(string2, object);
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
        StringBuilder stringBuilder = new StringBuilder("HttpHeader(name=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", value=");
        string2 = this.b;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

