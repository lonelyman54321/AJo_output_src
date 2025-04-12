/*
 * Decompiled with CFR 0.152.
 */
public final class Uy0 {
    public final int a;

    public /* synthetic */ Uy0(int n3) {
        this.a = n3;
    }

    public static String a(int n3) {
        String string2;
        if (n3 == 0) {
            string2 = "EmojiSupportMatch.Default";
        } else {
            int n4 = 1;
            if (n3 == n4) {
                string2 = "EmojiSupportMatch.None";
            } else {
                n4 = 2;
                if (n3 == n4) {
                    string2 = "EmojiSupportMatch.All";
                } else {
                    String string3 = "Invalid(value=";
                    StringBuilder stringBuilder = new StringBuilder(string3);
                    stringBuilder.append(n3);
                    n3 = 41;
                    stringBuilder.append((char)n3);
                    string2 = stringBuilder.toString();
                }
            }
        }
        return string2;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof Uy0;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (Uy0)object;
            n3 = this.a;
            int n4 = ((Uy0)object).a;
            if (n3 == n4) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return Uy0.a(this.a);
    }
}

