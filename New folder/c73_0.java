/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from c73
 */
public final class c73_0
implements b73_0 {
    public static final c73_0 a;

    static {
        c73_0 c73_02;
        a = c73_02 = new Object();
    }

    public final Class annotationType() {
        return b73_0.class;
    }

    public final boolean equals(Object object) {
        return object instanceof b73_0;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("@");
        String string2 = b73_0.class.getName();
        stringBuilder.append(string2);
        stringBuilder.append("()");
        return stringBuilder.toString();
    }
}

