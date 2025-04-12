/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Le1$a {
    public final Ke1 a;
    public final int b;

    public Le1$a(Ke1 ke1, int n3) {
        this.a = ke1;
        this.b = n3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Le1$a;
        if (n3 == 0) {
            return false;
        }
        object = (Le1$a)object;
        Ke1 ke1 = this.a;
        Ke1 ke12 = ((Le1$a)object).a;
        n3 = Intrinsics.areEqual(ke1, ke12);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((Le1$a)object).b;
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
        StringBuilder stringBuilder = new StringBuilder("ImageVectorEntry(imageVector=");
        Ke1 ke1 = this.a;
        stringBuilder.append(ke1);
        stringBuilder.append(", configFlags=");
        int n3 = this.b;
        return tu.a(stringBuilder, n3, ')');
    }
}

