/*
 * Decompiled with CFR 0.152.
 */
public final class Q83 {
    public static final Object a;

    static {
        Object object;
        a = object = new Object();
    }

    public static final void a(int n3, int n4) {
        if (n3 >= 0 && n3 < n4) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("index (");
        stringBuilder.append(n3);
        stringBuilder.append(") is out of bound of [0, ");
        stringBuilder.append(n4);
        stringBuilder.append(')');
        String string2 = stringBuilder.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }
}

