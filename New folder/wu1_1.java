/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from wu1
 */
public final class wu1_1 {
    public static final int b = 66305;
    public final int a;

    public /* synthetic */ wu1_1(int n3) {
        this.a = n3;
    }

    public static String a(int n3) {
        String string2 = "LineBreak(strategy=";
        StringBuilder stringBuilder = new StringBuilder(string2);
        int n4 = n3 & 0xFF;
        int n7 = 1;
        boolean bl2 = wu1$a_0.a(n4, n7);
        int n8 = 3;
        String string3 = "Invalid";
        int n10 = 2;
        string2 = bl2 ? "Strategy.Simple" : ((bl2 = wu1$a_0.a(n4, n10)) ? "Strategy.HighQuality" : ((bl2 = wu1$a_0.a(n4, n8)) ? "Strategy.Balanced" : ((n4 = (int)(wu1$a_0.a(n4, 0) ? 1 : 0)) != 0 ? "Strategy.Unspecified" : string3)));
        stringBuilder.append((Object)string2);
        string2 = ", strictness=";
        stringBuilder.append(string2);
        n4 = n3 >> 8 & 0xFF;
        bl2 = wu1$b.a(n4, n7);
        string2 = bl2 ? "Strictness.None" : ((bl2 = wu1$b.a(n4, n10)) ? "Strictness.Loose" : ((bl2 = wu1$b.a(n4, n8)) ? "Strictness.Normal" : ((bl2 = wu1$b.a(n4, 4)) ? "Strictness.Strict" : ((n4 = (int)(wu1$b.a(n4, 0) ? 1 : 0)) != 0 ? "Strictness.Unspecified" : string3))));
        stringBuilder.append((Object)string2);
        string2 = ", wordBreak=";
        stringBuilder.append(string2);
        n3 = n3 >> 16 & 0xFF;
        if (n3 == n7) {
            string3 = "WordBreak.None";
        } else if (n3 == n10) {
            string3 = "WordBreak.Phrase";
        } else if (n3 == 0) {
            string3 = "WordBreak.Unspecified";
        }
        stringBuilder.append((Object)string3);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof wu1_1;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (wu1_1)object;
            n3 = this.a;
            int n4 = ((wu1_1)object).a;
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
        return wu1_1.a(this.a);
    }
}

