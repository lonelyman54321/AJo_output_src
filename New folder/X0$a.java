/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class X0$a {
    public X0$a(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static void a(int n3, int n4, int n7) {
        String string2 = "startIndex: ";
        if (n3 >= 0 && n4 <= n7) {
            if (n3 <= n4) {
                return;
            }
            String string3 = D70.b(n3, n4, string2, " > endIndex: ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
            throw illegalArgumentException;
        }
        CharSequence charSequence = fQ2.a(string2, ", endIndex: ", ", size: ", n3, n4);
        charSequence.append(n7);
        charSequence = charSequence.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
        throw indexOutOfBoundsException;
    }

    public static void b(int n3, int n4) {
        if (n3 >= 0 && n3 < n4) {
            return;
        }
        String string2 = D70.b(n3, n4, "index: ", ", size: ");
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public static void c(int n3, int n4) {
        if (n3 >= 0 && n3 <= n4) {
            return;
        }
        String string2 = D70.b(n3, n4, "index: ", ", size: ");
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public static void d(int n3, int n4, int n7) {
        String string2 = "fromIndex: ";
        if (n3 >= 0 && n4 <= n7) {
            if (n3 <= n4) {
                return;
            }
            String string3 = D70.b(n3, n4, string2, " > toIndex: ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
            throw illegalArgumentException;
        }
        CharSequence charSequence = fQ2.a(string2, ", toIndex: ", ", size: ", n3, n4);
        charSequence.append(n7);
        charSequence = charSequence.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
        throw indexOutOfBoundsException;
    }

    public static int e(int n3, int n4) {
        int n7;
        int n8 = n3 >> 1;
        if ((n8 = (n3 += n8) - n4) < 0) {
            n3 = n4;
        }
        if ((n7 = n3 - (n8 = 0x7FFFFFF7)) > 0) {
            n3 = n4 > n8 ? -1 >>> 1 : 0x7FFFFFF7;
        }
        return n3;
    }
}

