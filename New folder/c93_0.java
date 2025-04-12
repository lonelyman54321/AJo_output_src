/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from C93
 */
public final class c93_0 {
    public final String a;
    public final boolean b;

    public c93_0(String string2, boolean bl2) {
        this.a = string2;
        this.b = bl2;
    }

    public final String toString() {
        char c2 = this.b;
        String string2 = c2 != '\u0000' ? "Applink" : "Unclassified";
        String string3 = this.a;
        if (string3 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append('(');
            stringBuilder.append(string3);
            c2 = ')';
            stringBuilder.append(c2);
            string2 = stringBuilder.toString();
        }
        return string2;
    }
}

