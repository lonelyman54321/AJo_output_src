/*
 * Decompiled with CFR 0.152.
 */
public final class Rs2 {
    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Rs2;
        if (!bl3) {
            return false;
        }
        object = (Rs2)object;
        object.getClass();
        long l2 = 0L;
        boolean bl4 = Dm3.a(l2, l2);
        if (!bl4) {
            return false;
        }
        bl4 = Dm3.a(l2, l2);
        if (!bl4) {
            return false;
        }
        bl4 = xs2_0.a(0);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = Dm3.d(0L);
        int n4 = n3 * 31;
        return (n3 + n4) * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Placeholder(width=");
        long l2 = 0L;
        String string2 = Dm3.e(l2);
        stringBuilder.append((Object)string2);
        string2 = ", height=";
        stringBuilder.append(string2);
        String string3 = Dm3.e(l2);
        stringBuilder.append((Object)string3);
        string3 = ", placeholderVerticalAlign=";
        stringBuilder.append(string3);
        boolean bl2 = xs2_0.a(1);
        string3 = bl2 ? "AboveBaseline" : ((bl2 = xs2_0.a(2)) ? "Top" : ((bl2 = xs2_0.a(3)) ? "Bottom" : ((bl2 = xs2_0.a(4)) ? "Center" : ((bl2 = xs2_0.a(5)) ? "TextTop" : ((bl2 = xs2_0.a(6)) ? "TextBottom" : ((bl2 = xs2_0.a(7)) ? "TextCenter" : "Invalid"))))));
        stringBuilder.append((Object)string3);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

