/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.referral.RefereeEarnCash;

/*
 * Renamed from bv1
 */
public final class bv1_0 {
    public static String a;
    public static String b;
    public static RefereeEarnCash c;
    public static boolean d;
    public static String e;
    public static String f;
    public static boolean g;
    public static boolean h;

    public static final void a(int n3, int n4) {
        if (n3 >= 0 && n3 < n4) {
            return;
        }
        String string2 = D70.b(n3, n4, "index: ", ", size: ");
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public static final void b(int n3, int n4) {
        if (n3 >= 0 && n3 <= n4) {
            return;
        }
        String string2 = D70.b(n3, n4, "index: ", ", size: ");
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public static final void c(int n3, int n4, int n7) {
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

    public static void d() {
        a = null;
        b = null;
        c = null;
        d = false;
        h = false;
        e = null;
        f = null;
        g = false;
    }
}

