/*
 * Decompiled with CFR 0.152.
 */
public final class D70 {
    public static int a(int n3, int n4, long l2) {
        return (mt3_0.a(l2) + n3) * n4;
    }

    public static String b(int n3, int n4, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(n3);
        stringBuilder.append(string3);
        stringBuilder.append(n4);
        return stringBuilder.toString();
    }

    public static StringBuilder c(long l2, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(l2);
        stringBuilder.append(string3);
        return stringBuilder;
    }
}

