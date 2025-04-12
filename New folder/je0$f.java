/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class je0$f
extends je0_0 {
    public final Nc$c b;

    public je0$f(Nc$c nc$c) {
        this.b = nc$c;
    }

    public final int a(int n3, bp1_0 bp1_02, Ns2 ns2, int n4) {
        return this.b.a(0, n3);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof je0$f;
        if (!bl3) {
            return false;
        }
        object = (je0$f)object;
        Nc$c nc$c = this.b;
        object = ((je0$f)object).b;
        boolean bl4 = Intrinsics.areEqual(nc$c, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("VerticalCrossAxisAlignment(vertical=");
        Nc$c nc$c = this.b;
        stringBuilder.append(nc$c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

