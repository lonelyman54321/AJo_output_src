/*
 * Decompiled with CFR 0.152.
 */
public final class UX {
    public static String a(int n3, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String b(long l2, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(l2);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String c(String string2, String string3, String string4, String string5) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        stringBuilder.append(string5);
        return stringBuilder.toString();
    }
}

