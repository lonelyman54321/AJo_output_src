/*
 * Decompiled with CFR 0.152.
 */
public final class KW {
    public static String a(String string2, String string3, String string4, String string5, String string6) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        stringBuilder.append(string5);
        stringBuilder.append(string6);
        return stringBuilder.toString();
    }

    public static void b(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(string3);
        Cx.f(stringBuilder.toString());
    }
}

