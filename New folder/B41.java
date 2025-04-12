/*
 * Decompiled with CFR 0.152.
 */
public final class B41 {
    public static void a(boolean bl2, String string2) {
        if (bl2) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void b(int n3) {
        if (n3 >= 0) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public static void c(Object object, String string2) {
        if (object != null) {
            return;
        }
        object = new NullPointerException(string2);
        throw object;
    }

    public static final void d(int n3, int n4) {
        if (n3 > 0 && n4 > 0) {
            if (n3 <= n4) {
                return;
            }
            String string2 = D70.b(n3, n4, "minLines ", " must be less than or equal to maxLines ");
            string2 = string2.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        String string3 = z41.a("both minLines ", " and maxLines ", " must be greater than zero", n3, n4);
        string3 = string3.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }
}

