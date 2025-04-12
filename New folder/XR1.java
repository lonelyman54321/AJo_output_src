/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.util.List;

public final class XR1 {
    public static final Object a;
    public static char[] b;

    static {
        Object object;
        a = object = new Object();
        b = new char[24];
    }

    public static final void a(int n3, List list) {
        int n4 = list.size();
        if (n3 >= 0 && n3 < n4) {
            return;
        }
        String string2 = z41.a("Index ", " is out of bounds. The list has ", " elements.", n3, n4);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public static final void b(int n3, int n4, List object) {
        int n7 = object.size();
        if (n3 <= n4) {
            if (n3 >= 0) {
                if (n4 <= n7) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder("toIndex (");
                stringBuilder.append(n4);
                stringBuilder.append(") is more than than the list size (");
                stringBuilder.append(n7);
                stringBuilder.append(')');
                String string2 = stringBuilder.toString();
                IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
                throw indexOutOfBoundsException;
            }
            String string3 = Gj0.b(n3, "fromIndex (", ") is less than 0.");
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string3);
            throw indexOutOfBoundsException;
        }
        String string4 = z41.a("Indices are out of order. fromIndex (", ") is greater than toIndex (", ").", n3, n4);
        object = new IllegalArgumentException(string4);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(long l2, PrintWriter printWriter) {
        Object object = a;
        synchronized (object) {
            int n3 = XR1.d(l2);
            char[] cArray = b;
            String string2 = new String(cArray, 0, n3);
            printWriter.print(string2);
            return;
        }
    }

    public static int d(long l2) {
        int n3;
        long l3;
        int n4;
        int n7;
        char[] cArray = b;
        int n8 = cArray.length;
        if (n8 < 0) {
            b = cArray = new char[0];
        }
        cArray = b;
        long l4 = 0L;
        int n10 = 1;
        Object object = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (object == false) {
            cArray[0] = 48;
            return n10;
        }
        if (object > 0) {
            n7 = 43;
        } else {
            l2 = -l2;
            n7 = 45;
        }
        long l7 = 1000L;
        long l8 = l2 % l7;
        int n14 = (int)l8;
        double d2 = Math.floor(l2 /= l7);
        int n15 = (int)d2;
        int n16 = 86400;
        if (n15 > n16) {
            n4 = n15 / n16;
            n15 -= (n16 *= n4);
        } else {
            n4 = 0;
        }
        n16 = 3600;
        if (n15 > n16) {
            n16 = n15 / 3600;
            object = n16 * 3600;
            n15 -= object;
        } else {
            n16 = 0;
        }
        object = 60;
        if (n15 > object) {
            object = n15 / 60;
            l3 = object * 60;
            n3 = n15 - l3;
            n15 = (int)object;
        } else {
            n3 = n15;
            n15 = 0;
        }
        cArray[0] = n7;
        object = 100;
        int n17 = 1;
        boolean bl2 = false;
        l3 = n17;
        l3 = XR1.e(cArray, n4, (char)object, n17, false, 0);
        bl2 = l3 != n17;
        object = 104;
        n4 = n16;
        l3 = XR1.e(cArray, n16, (char)object, (int)l3, bl2, 0);
        bl2 = l3 != n17;
        object = 109;
        n4 = n15;
        l3 = XR1.e(cArray, n15, (char)object, (int)l3, bl2, 0);
        bl2 = l3 != n17;
        n4 = n3;
        l3 = XR1.e(cArray, n3, 's', (int)l3, bl2, 0);
        n4 = n14;
        n15 = XR1.e(cArray, n14, 'm', (int)l3, true, 0);
        cArray[n15] = 115;
        return n15 + n10;
    }

    public static int e(char[] cArray, int n3, char c2, int n4, boolean n7, int n8) {
        if (n7 != 0 || n3 > 0) {
            int n10;
            int n14;
            if (n7 != 0 && n8 >= (n14 = 3) || n3 > (n14 = 99)) {
                n14 = n3 / 100;
                cArray[n4] = n10 = (int)((char)(n14 + 48));
                n10 = n4 + 1;
                n3 -= (n14 *= 100);
            } else {
                n10 = n4;
            }
            n14 = 2;
            if (n7 != 0 && n8 >= n14 || n3 > (n7 = 9) || n4 != n10) {
                n4 = n3 / 10;
                cArray[n10] = n7 = (int)((char)(n4 + 48));
                ++n10;
                n3 -= (n4 *= 10);
            }
            cArray[n10] = n3 = (int)((char)(n3 + 48));
            n3 = n10 + 1;
            cArray[n3] = c2;
            n4 = n10 + 2;
        }
        return n4;
    }
}

