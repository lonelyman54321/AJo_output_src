/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ot2
 */
public final class ot2_1 {
    public static final ot2_1 c;
    public final boolean a;
    public final int b;

    static {
        ot2_1 ot2_12;
        c = ot2_12 = new ot2_1();
    }

    public ot2_1() {
        this(0, false);
    }

    public ot2_1(int n3) {
        this.a = false;
        this.b = 0;
    }

    public ot2_1(int n3, boolean bl2) {
        this.a = bl2;
        this.b = n3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ot2_1;
        if (n3 == 0) {
            return false;
        }
        object = (ot2_1)object;
        int n4 = this.a;
        n3 = ((ot2_1)object).a;
        if (n4 != n3) {
            return false;
        }
        n3 = this.b;
        int n7 = ((ot2_1)object).b;
        if (n3 == n7) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a;
        n3 = n3 != 0 ? 1231 : 1237;
        int n4 = this.b;
        return (n3 *= 31) + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlatformParagraphStyle(includeFontPadding=");
        boolean bl2 = this.a;
        stringBuilder.append(bl2);
        stringBuilder.append(", emojiSupportMatch=");
        String string2 = Uy0.a(this.b);
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

