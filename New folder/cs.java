/*
 * Decompiled with CFR 0.152.
 */
public final class cs {
    public static boolean a(String string2) {
        int n3;
        String string3;
        int n4;
        int n7 = 0;
        if (string2 != null && (n4 = (string3 = "noStock").length()) <= (n3 = string2.length())) {
            n7 = string2.length();
            n4 = string3.length();
            int n8 = n7 - n4;
            int n10 = string3.length();
            n3 = 1;
            n7 = (int)(string2.regionMatches(n3 != 0, n8, string3, 0, n10) ? 1 : 0);
        }
        return n7 != 0;
    }
}

