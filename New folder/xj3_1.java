/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;

/*
 * Renamed from XJ3
 */
public final class xj3_1 {
    public static final char[] a;

    static {
        char[] cArray;
        char[] cArray2 = cArray = new char[16];
        char[] cArray3 = cArray;
        cArray2[0] = 48;
        cArray3[1] = 49;
        cArray2[2] = 50;
        cArray3[3] = 51;
        cArray2[4] = 52;
        cArray3[5] = 53;
        cArray2[6] = 54;
        cArray3[7] = 55;
        cArray2[8] = 56;
        cArray3[9] = 57;
        cArray2[10] = 97;
        cArray3[11] = 98;
        cArray2[12] = 99;
        cArray3[13] = 100;
        cArray2[14] = 101;
        cArray3[15] = 102;
        a = cArray;
    }

    public static final void a(long l2, long l3, long l4) {
        long l7;
        long l8 = 0L;
        String string2 = "startIndex (";
        Object object = l3 == l8 ? 0 : (l3 < l8 ? -1 : 1);
        if (object >= 0 && (l7 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1)) <= 0) {
            Object object2 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (object2 <= 0) {
                return;
            }
            CharSequence charSequence = D70.c(l3, string2, ") > endIndex (");
            charSequence.append(l4);
            charSequence.append(')');
            charSequence = charSequence.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
            throw illegalArgumentException;
        }
        StringBuilder stringBuilder = D70.c(l3, string2, ") and endIndex (");
        stringBuilder.append(l4);
        stringBuilder.append(") are not within the range [0..size(");
        stringBuilder.append(l2);
        stringBuilder.append("))");
        String string3 = stringBuilder.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string3);
        throw indexOutOfBoundsException;
    }

    public static final void b(Closeable closeable, Throwable throwable) {
        if (closeable != null) {
            if (throwable == null) {
                closeable.close();
            } else {
                try {
                    closeable.close();
                }
                catch (Throwable throwable2) {
                    yc0_2.a(throwable, throwable2);
                }
            }
        }
    }
}

