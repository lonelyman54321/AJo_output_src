/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.sequences.Sequence;

/*
 * Renamed from Tp
 */
public class tp_2
extends rp_1 {
    public static Object A(Object[] object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = ((Object[])object).length;
        if (n3 == 0) {
            object = null;
        } else {
            n3 = 0;
            string2 = null;
            object = object[0];
        }
        return object;
    }

    public static IntRange B(int[] nArray) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(nArray, string2);
        Intrinsics.checkNotNullParameter(nArray, string2);
        int n3 = nArray.length;
        int n4 = 1;
        IntRange intRange = new c(0, n3 -= n4, n4);
        return intRange;
    }

    public static int C(Object[] objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "<this>");
        return objectArray.length + -1;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Integer D(int[] object, int n3) {
        void var0_3;
        void var1_4;
        block3: {
            block2: {
                String string2 = "<this>";
                Intrinsics.checkNotNullParameter(object, string2);
                if (var1_4 < 0) break block2;
                Intrinsics.checkNotNullParameter(object, string2);
                int n4 = ((int[])object).length + -1;
                if (var1_4 <= n4) break block3;
            }
            boolean bl2 = false;
            return var0_3;
        }
        int n7 = object[var1_4];
        Integer n8 = n7;
        return var0_3;
    }

    public static Object E(int n3, Object[] objectArray) {
        Object object;
        int n4;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(objectArray, string2);
        if (n3 >= 0 && n3 <= (n4 = tp_2.C(objectArray))) {
            object = objectArray[n3];
        } else {
            n3 = 0;
            object = null;
        }
        return object;
    }

    public static int F(Object[] objectArray, Object object) {
        int n3;
        Intrinsics.checkNotNullParameter(objectArray, "<this>");
        if (object == null) {
            int n4 = objectArray.length;
            for (n3 = 0; n3 < n4; ++n3) {
                Object object2 = objectArray[n3];
                if (object2 != null) continue;
                return n3;
            }
        } else {
            int n7 = objectArray.length;
            while (n3 < n7) {
                Object object3 = objectArray[n3];
                boolean bl2 = Intrinsics.areEqual(object, object3);
                if (bl2) {
                    return n3;
                }
                ++n3;
            }
        }
        return -1;
    }

    public static String G(int n3, String string2, Object[] objectArray) {
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            string2 = ", ";
        }
        String string3 = "<this>";
        Intrinsics.checkNotNullParameter(objectArray, string3);
        String string4 = "separator";
        Intrinsics.checkNotNullParameter(string2, string4);
        String string5 = "";
        String string6 = "prefix";
        Intrinsics.checkNotNullParameter(string5, string6);
        Object object = "postfix";
        Intrinsics.checkNotNullParameter(string5, (String)object);
        String string7 = "...";
        String string8 = "truncated";
        Intrinsics.checkNotNullParameter(string7, string8);
        StringBuilder stringBuilder = new StringBuilder();
        Intrinsics.checkNotNullParameter(objectArray, string3);
        string3 = "buffer";
        Intrinsics.checkNotNullParameter(stringBuilder, string3);
        Intrinsics.checkNotNullParameter(string2, string4);
        Intrinsics.checkNotNullParameter(string5, string6);
        Intrinsics.checkNotNullParameter(string5, (String)object);
        Intrinsics.checkNotNullParameter(string7, string8);
        stringBuilder.append((CharSequence)string5);
        n3 = objectArray.length;
        string4 = null;
        int n7 = 0;
        string6 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            object = objectArray[i3];
            if ((n7 += n4) > n4) {
                stringBuilder.append((CharSequence)string2);
            }
            string7 = null;
            ce3_1.a(stringBuilder, object, null);
        }
        stringBuilder.append((CharSequence)string5);
        string3 = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return string3;
    }

    public static String H(byte[] object, Function1 function1) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        String string3 = "";
        String string4 = "separator";
        Intrinsics.checkNotNullParameter(string3, string4);
        String string5 = "prefix";
        Intrinsics.checkNotNullParameter(string3, string5);
        Object object2 = "postfix";
        Intrinsics.checkNotNullParameter(string3, (String)object2);
        String string6 = "...";
        String string7 = "truncated";
        Intrinsics.checkNotNullParameter(string6, string7);
        StringBuilder stringBuilder = new StringBuilder();
        Intrinsics.checkNotNullParameter(object, string2);
        string2 = "buffer";
        Intrinsics.checkNotNullParameter(stringBuilder, string2);
        Intrinsics.checkNotNullParameter(string3, string4);
        Intrinsics.checkNotNullParameter(string3, string5);
        Intrinsics.checkNotNullParameter(string3, (String)object2);
        Intrinsics.checkNotNullParameter(string6, string7);
        stringBuilder.append((CharSequence)string3);
        int n3 = ((byte[])object).length;
        string4 = null;
        int n4 = 0;
        string5 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            byte by2 = object[i3];
            int n7 = 1;
            if ((n4 += n7) > n7) {
                stringBuilder.append((CharSequence)string3);
            }
            if (function1 != null) {
                object2 = by2;
                object2 = (CharSequence)function1.invoke(object2);
                stringBuilder.append((CharSequence)object2);
                continue;
            }
            object2 = String.valueOf(by2);
            stringBuilder.append((CharSequence)object2);
        }
        stringBuilder.append((CharSequence)string3);
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

    public static char I(char[] object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = ((char[])object).length;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4) {
                return object[0];
            }
            object = new IllegalArgumentException;
            object("Array has more than one element.");
            throw object;
        }
        object = new NoSuchElementException;
        object("Array is empty.");
        throw object;
    }

    public static List J(Comparator comparator, Object[] objectArray) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(objectArray, string2);
        String string3 = "comparator";
        Intrinsics.checkNotNullParameter(comparator, string3);
        Intrinsics.checkNotNullParameter(objectArray, string2);
        Intrinsics.checkNotNullParameter(comparator, string3);
        int n3 = objectArray.length;
        if (n3 != 0) {
            n3 = objectArray.length;
            objectArray = Arrays.copyOf(objectArray, n3);
            String string4 = "copyOf(...)";
            Intrinsics.checkNotNullExpressionValue(objectArray, string4);
            Intrinsics.checkNotNullParameter(objectArray, string2);
            Intrinsics.checkNotNullParameter(comparator, string3);
            int n4 = objectArray.length;
            int n7 = 1;
            if (n4 > n7) {
                Arrays.sort(objectArray, comparator);
            }
        }
        return rp_1.e(objectArray);
    }

    public static List K(Object[] objectArray) {
        ArrayList<Object> arrayList = "<this>";
        Intrinsics.checkNotNullParameter(objectArray, (String)((Object)arrayList));
        int n3 = objectArray.length;
        int n4 = 4;
        if (n4 >= n3) {
            return tp_2.M(objectArray);
        }
        arrayList = new ArrayList<Object>(n4);
        int n7 = objectArray.length;
        int n8 = 0;
        for (int i3 = 0; i3 < n7; ++i3) {
            Object object = objectArray[i3];
            arrayList.add(object);
            if (++n8 == n4) break;
        }
        return arrayList;
    }

    public static void L(Object[] objectArray, AbstractCollection abstractCollection) {
        Intrinsics.checkNotNullParameter(objectArray, "<this>");
        String string2 = "destination";
        Intrinsics.checkNotNullParameter(abstractCollection, string2);
        for (Object object : objectArray) {
            abstractCollection.add(object);
        }
    }

    public static List M(Object[] object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = ((Object[])object).length;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                object = tp_2.N(object);
            } else {
                n3 = 0;
                string2 = null;
                object = a.b(object[0]);
            }
        } else {
            object = mz0_2.a;
        }
        return object;
    }

    public static ArrayList N(Object[] objectArray) {
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(objectArray, (String)object);
        Intrinsics.checkNotNullParameter(objectArray, (String)object);
        object = new cp_2(objectArray, false);
        ArrayList arrayList = new ArrayList(object);
        return arrayList;
    }

    public static Set O(Object[] objectArray) {
        Set set = "<this>";
        Intrinsics.checkNotNullParameter(objectArray, (String)((Object)set));
        int n3 = objectArray.length;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = eh1_2.c(objectArray.length);
                set = new Set(n4);
                tp_2.L(objectArray, set);
            } else {
                n3 = 0;
                objectArray = objectArray[0];
                set = O03.b(objectArray);
            }
        } else {
            set = vz0_2.a;
        }
        return set;
    }

    public static Sequence s(Object[] objectArray) {
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(objectArray, (String)object);
        int n3 = objectArray.length;
        if (n3 == 0) {
            return uz0_2.a;
        }
        object = new tp$a_0(objectArray);
        return object;
    }

    public static boolean t(byte[] byArray, byte by2) {
        int n3;
        boolean bl2;
        block3: {
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(byArray, string2);
            Intrinsics.checkNotNullParameter(byArray, string2);
            int n4 = byArray.length;
            bl2 = false;
            for (n3 = 0; n3 < n4; ++n3) {
                byte by4 = byArray[n3];
                if (by2 != by4) {
                    continue;
                }
                break block3;
            }
            n3 = -1;
        }
        if (n3 >= 0) {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean u(int[] nArray, int n3) {
        int n4;
        boolean bl2;
        block3: {
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(nArray, string2);
            Intrinsics.checkNotNullParameter(nArray, string2);
            int n7 = nArray.length;
            bl2 = false;
            for (n4 = 0; n4 < n7; ++n4) {
                int n8 = nArray[n4];
                if (n3 != n8) {
                    continue;
                }
                break block3;
            }
            n4 = -1;
        }
        if (n4 >= 0) {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean v(long[] lArray, long l2) {
        int n3;
        boolean bl2;
        block3: {
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(lArray, string2);
            Intrinsics.checkNotNullParameter(lArray, string2);
            int n4 = lArray.length;
            bl2 = false;
            for (n3 = 0; n3 < n4; ++n3) {
                long l3 = lArray[n3];
                long l4 = l2 - l3;
                Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object != false) {
                    continue;
                }
                break block3;
            }
            n3 = -1;
        }
        if (n3 >= 0) {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean w(Object[] objectArray, Object object) {
        void var3_6;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(objectArray, string2);
        int bl2 = tp_2.F(objectArray, object);
        if (bl2 >= 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            objectArray = null;
        }
        return (boolean)var3_6;
    }

    public static boolean x(short[] sArray, short s7) {
        int n3;
        boolean bl2;
        block3: {
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(sArray, string2);
            Intrinsics.checkNotNullParameter(sArray, string2);
            int n4 = sArray.length;
            bl2 = false;
            for (n3 = 0; n3 < n4; ++n3) {
                short s8 = sArray[n3];
                if (s7 != s8) {
                    continue;
                }
                break block3;
            }
            n3 = -1;
        }
        if (n3 >= 0) {
            bl2 = true;
        }
        return bl2;
    }

    public static ArrayList y(Object[] objectArray) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(objectArray, string2);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Intrinsics.checkNotNullParameter(objectArray, string2);
        string2 = "destination";
        Intrinsics.checkNotNullParameter(arrayList, string2);
        for (Object object : objectArray) {
            if (object == null) continue;
            arrayList.add(object);
        }
        return arrayList;
    }

    public static Object z(Object[] object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = ((Object[])object).length;
        if (n3 != 0) {
            return object[0];
        }
        object = new NoSuchElementException("Array is empty.");
        throw object;
    }
}

