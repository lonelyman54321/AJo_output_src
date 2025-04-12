/*
 * Decompiled with CFR 0.152.
 */
public final class dV0 {
    public static void a(boolean bl2, String string2) {
        if (bl2) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void b(Object object) {
        dV0.c(object, "Argument must not be null");
    }

    public static void c(Object object, String string2) {
        if (object != null) {
            return;
        }
        object = new NullPointerException(string2);
        throw object;
    }

    public static final boolean d(int n3, int n4) {
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public static String e(int n3) {
        String string2;
        StringBuilder stringBuilder = null;
        boolean bl2 = dV0.d(n3, 0);
        if (bl2) {
            string2 = "Blocking";
        } else {
            bl2 = dV0.d(n3, 1);
            if (bl2) {
                string2 = "Optional";
            } else {
                bl2 = dV0.d(n3, 2);
                if (bl2) {
                    string2 = "Async";
                } else {
                    String string3 = "Invalid(value=";
                    stringBuilder = new StringBuilder(string3);
                    stringBuilder.append(n3);
                    n3 = 41;
                    stringBuilder.append((char)n3);
                    string2 = stringBuilder.toString();
                }
            }
        }
        return string2;
    }
}

