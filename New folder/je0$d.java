/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class je0$d
extends je0_0 {
    public final Nc$b b;

    public je0$d(Nc$b nc$b) {
        this.b = nc$b;
    }

    public final int a(int n3, bp1_0 bp1_02, Ns2 ns2, int n4) {
        return this.b.a(0, n3, bp1_02);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof je0$d;
        if (!bl3) {
            return false;
        }
        object = (je0$d)object;
        Nc$b nc$b = this.b;
        object = ((je0$d)object).b;
        boolean bl4 = Intrinsics.areEqual(nc$b, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HorizontalCrossAxisAlignment(horizontal=");
        Nc$b nc$b = this.b;
        stringBuilder.append(nc$b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

