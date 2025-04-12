/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;

/*
 * Renamed from xX
 */
public class xx_2
extends a {
    public static ArrayList d(Object ... object) {
        ArrayList arrayList = "elements";
        Intrinsics.checkNotNullParameter(object, (String)((Object)arrayList));
        int n3 = ((Object[])object).length;
        if (n3 == 0) {
            object = new ArrayList();
        } else {
            boolean bl2 = true;
            cp_2 cp_22 = new cp_2((Object[])object, bl2);
            arrayList = new ArrayList(cp_22);
            object = arrayList;
        }
        return object;
    }

    public static int e(List list, Comparable comparable) {
        int n3;
        block3: {
            int n4 = list.size();
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(list, string2);
            n3 = list.size();
            int n7 = 0;
            xx_2.l(n3, 0, n4);
            n4 += -1;
            while (n7 <= n4) {
                n3 = n7 + n4 >>> 1;
                Comparable comparable2 = (Comparable)list.get(n3);
                int n8 = q00_0.a(comparable2, comparable);
                if (n8 < 0) {
                    n7 = n3 + 1;
                    continue;
                }
                if (n8 > 0) {
                    n4 = n3 + -1;
                    continue;
                }
                break block3;
            }
            n3 = -(++n7);
        }
        return n3;
    }

    public static mz0_2 f() {
        return mz0_2.a;
    }

    public static IntRange g(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int n3 = collection.size();
        int n4 = 1;
        IntRange intRange = new c(0, n3 -= n4, n4);
        return intRange;
    }

    public static int h(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() + -1;
    }

    public static List i(Object ... object) {
        String string2 = "elements";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = ((Object[])object).length;
        object = n3 > 0 ? rp_1.e(object) : mz0_2.a;
        return object;
    }

    public static ArrayList j(Object ... object) {
        ArrayList arrayList = "elements";
        Intrinsics.checkNotNullParameter(object, (String)((Object)arrayList));
        int n3 = ((Object[])object).length;
        if (n3 == 0) {
            object = new ArrayList();
        } else {
            boolean bl2 = true;
            cp_2 cp_22 = new cp_2((Object[])object, bl2);
            arrayList = new ArrayList(cp_22);
            object = arrayList;
        }
        return object;
    }

    public static final List k(List list) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(list, string2);
        int n3 = list.size();
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4) {
                n3 = 0;
                string2 = null;
                list = a.b(list.get(0));
            }
        } else {
            list = mz0_2.a;
        }
        return list;
    }

    public static final void l(int n3, int n4, int n7) {
        String string2 = ").";
        String string3 = "fromIndex (";
        if (n4 <= n7) {
            if (n4 >= 0) {
                if (n7 <= n3) {
                    return;
                }
                String string4 = z41.a("toIndex (", ") is greater than size (", string2, n7, n3);
                IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string4);
                throw indexOutOfBoundsException;
            }
            String string5 = Gj0.b(n4, string3, ") is less than zero.");
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string5);
            throw indexOutOfBoundsException;
        }
        String string6 = z41.a(string3, ") is greater than toIndex (", string2, n4, n7);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string6);
        throw illegalArgumentException;
    }

    public static void m() {
        ArithmeticException arithmeticException = new ArithmeticException("Count overflow has happened.");
        throw arithmeticException;
    }

    public static void n() {
        ArithmeticException arithmeticException = new ArithmeticException("Index overflow has happened.");
        throw arithmeticException;
    }
}

