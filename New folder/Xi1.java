/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

public final class Xi1 {
    public int a;

    public Xi1() {
        this(0);
    }

    public Xi1(int n3) {
        this.a = n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("IntRef(element = ");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(")@");
        n3 = this.hashCode();
        int n4 = CharsKt.checkRadix(16);
        String string2 = Integer.toString(n3, n4);
        Intrinsics.checkNotNullExpressionValue(string2, "toString(this, checkRadix(radix))");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

