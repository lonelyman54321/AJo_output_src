/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from CJ
 */
public final class cj_1 {
    public static final boolean a;

    static {
        boolean bl2;
        String string2 = "java.lang.ClassValue";
        try {
            Class.forName(string2);
            bl2 = true;
        }
        catch (Throwable throwable) {
            bl2 = false;
            string2 = null;
        }
        a = bl2;
    }
}

