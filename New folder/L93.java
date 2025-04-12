/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class L93 {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;

    public L93(int n3, int n4, int n7, int n8, String string2) {
        this.a = n3;
        this.b = n4;
        this.c = n7;
        this.d = string2;
        this.e = n8;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof L93;
        if (n3 == 0) {
            return false;
        }
        object = (L93)object;
        int n4 = this.a;
        n3 = ((L93)object).a;
        if (n4 != n3) {
            return false;
        }
        n3 = this.b;
        n4 = ((L93)object).b;
        if (n3 != n4) {
            return false;
        }
        n3 = this.c;
        n4 = ((L93)object).c;
        if (n3 != n4) {
            return false;
        }
        String string2 = this.d;
        String string3 = ((L93)object).d;
        n3 = Intrinsics.areEqual(string2, string3) ? 1 : 0;
        if (n3 == 0) {
            return false;
        }
        n3 = this.e;
        int n7 = ((L93)object).e;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = this.c;
        n3 = (n3 + n4) * 31;
        String string2 = this.d;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = this.e;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SourceLocation(lineNumber=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", offset=");
        n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", length=");
        n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", sourceFile=");
        String string2 = this.d;
        stringBuilder.append(string2);
        stringBuilder.append(", packageHash=");
        n3 = this.e;
        return tu.a(stringBuilder, n3, ')');
    }
}

