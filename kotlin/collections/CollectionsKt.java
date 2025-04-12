/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.b;

public final class CollectionsKt
extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static fx_1 E(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        fx_1 fx_12 = new fx_1(iterable);
        return fx_12;
    }

    public static boolean F(Iterable iterable, Object object) {
        int n3;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(iterable, string2);
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            iterable = (Collection)iterable;
            n3 = (int)(iterable.contains(object) ? 1 : 0);
        } else {
            n3 = CollectionsKt.O(iterable, object);
            if (n3 >= 0) {
                n3 = 1;
            } else {
                n3 = 0;
                iterable = null;
            }
        }
        return n3 != 0;
    }

    public static List G(Iterable object, int n3) {
        block7: {
            block9: {
                int n4;
                Object object2;
                int n7;
                ArrayList arrayList;
                block16: {
                    block10: {
                        block12: {
                            block15: {
                                block14: {
                                    boolean bl2;
                                    block13: {
                                        block11: {
                                            block8: {
                                                arrayList = "<this>";
                                                Intrinsics.checkNotNullParameter(object, (String)((Object)arrayList));
                                                if (n3 < 0) break block7;
                                                if (n3 != 0) break block8;
                                                object = CollectionsKt.k0((Iterable)object);
                                                break block9;
                                            }
                                            n7 = object instanceof Collection;
                                            if (n7 == 0) break block10;
                                            object2 = object;
                                            object2 = (Collection)object;
                                            n4 = object2.size() - n3;
                                            if (n4 > 0) break block11;
                                            object = mz0_2.a;
                                            break block9;
                                        }
                                        int n8 = 1;
                                        if (n4 != n8) break block12;
                                        Intrinsics.checkNotNullParameter(object, (String)((Object)arrayList));
                                        n3 = object instanceof List;
                                        if (n3 == 0) break block13;
                                        object = CollectionsKt.S((List)object);
                                        break block14;
                                    }
                                    n3 = (int)((object = ((Iterable)object).iterator()).hasNext() ? 1 : 0);
                                    if (n3 == 0) break block15;
                                    Object e2 = object.next();
                                    while (bl2 = object.hasNext()) {
                                        e2 = object.next();
                                    }
                                    object = e2;
                                }
                                object = a.b(object);
                                break block9;
                            }
                            object = new NoSuchElementException("Collection is empty.");
                            throw object;
                        }
                        arrayList = new ArrayList(n4);
                        n4 = object instanceof List;
                        if (n4 == 0) break block16;
                        n4 = object instanceof RandomAccess;
                        if (n4 != 0) {
                            n7 = object2.size();
                            while (n3 < n7) {
                                ListIterator listIterator = object;
                                listIterator = ((List)object).get(n3);
                                arrayList.add(listIterator);
                                ++n3;
                            }
                        } else {
                            object = ((List)object).listIterator(n3);
                            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                                Object e5 = object.next();
                                arrayList.add(e5);
                            }
                        }
                        object = arrayList;
                        break block9;
                    }
                    arrayList = new ArrayList();
                }
                object = ((Iterable)object).iterator();
                n7 = 0;
                object2 = null;
                while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    Object e7 = object.next();
                    if (n7 >= n3) {
                        arrayList.add(e7);
                        continue;
                    }
                    ++n7;
                }
                object = xx_2.k(arrayList);
            }
            return object;
        }
        object = Gj0.b(n3, "Requested element count ", " is less than zero.");
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public static List H(int n3, List object) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        if (n3 >= 0) {
            object2 = object;
            object2 = (Iterable)object;
            int n4 = object.size() - n3;
            if (n4 < 0) {
                n4 = 0;
                object = null;
            }
            return CollectionsKt.f0((Iterable)object2, n4);
        }
        String string2 = Gj0.b(n3, "Requested element count ", " is less than zero.");
        string2 = string2.toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static Object I(Iterable object, int n3) {
        block10: {
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(object, string2);
            boolean bl2 = object instanceof List;
            if (bl2) {
                object = ((List)object).get(n3);
            } else {
                gx_2 gx_22 = new gx_2(n3);
                Intrinsics.checkNotNullParameter(object, string2);
                string2 = "defaultValue";
                Intrinsics.checkNotNullParameter(gx_22, string2);
                if (bl2) {
                    int n4;
                    object = (List)object;
                    if (n3 >= 0 && n3 <= (n4 = xx_2.h(object))) {
                        object = object.get(n3);
                    } else {
                        object = n3;
                        object = gx_22.invoke(object);
                    }
                } else if (n3 < 0) {
                    object = n3;
                    object = gx_22.invoke(object);
                } else {
                    object = object.iterator();
                    int n7 = 0;
                    string2 = null;
                    while (bl2 = object.hasNext()) {
                        Object e2 = object.next();
                        int n8 = n7 + 1;
                        if (n3 == n7) {
                            object = e2;
                            break block10;
                        }
                        n7 = n8;
                    }
                    object = n3;
                    object = gx_22.invoke(object);
                }
            }
        }
        return object;
    }

    public static ArrayList J(Iterable object) {
        boolean bl2;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        ArrayList<String> arrayList = new ArrayList<String>();
        Intrinsics.checkNotNullParameter(object, string2);
        string2 = "destination";
        Intrinsics.checkNotNullParameter(arrayList, string2);
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            string2 = object.next();
            if (string2 == null) continue;
            arrayList.add(string2);
        }
        return arrayList;
    }

    public static Object K(Iterable object) {
        block4: {
            block3: {
                boolean bl2;
                block2: {
                    String string2 = "<this>";
                    Intrinsics.checkNotNullParameter(object, string2);
                    bl2 = object instanceof List;
                    if (!bl2) break block2;
                    object = CollectionsKt.L((List)object);
                    break block3;
                }
                bl2 = (object = object.iterator()).hasNext();
                if (!bl2) break block4;
                object = object.next();
            }
            return object;
        }
        object = new NoSuchElementException("Collection is empty.");
        throw object;
    }

    public static Object L(List object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object.isEmpty();
        if (!bl2) {
            return object.get(0);
        }
        object = new NoSuchElementException("List is empty.");
        throw object;
    }

    public static Object M(Iterable object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object instanceof List;
        Object var3_3 = null;
        if (bl2) {
            bl2 = (object = (List)object).isEmpty();
            if (!bl2) {
                bl2 = false;
                string2 = null;
                var3_3 = object.get(0);
            }
        } else {
            bl2 = (object = object.iterator()).hasNext();
            if (bl2) {
                var3_3 = object.next();
            }
        }
        return var3_3;
    }

    public static Object N(int n3, List list) {
        Object var4_4;
        int n4;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(list, string2);
        if (n3 >= 0 && n3 <= (n4 = xx_2.h(list))) {
            var4_4 = list.get(n3);
        } else {
            n3 = 0;
            var4_4 = null;
        }
        return var4_4;
    }

    public static int O(Iterable object, Object object2) {
        int n3;
        block5: {
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(object, string2);
            int n4 = object instanceof List;
            if (n4 != 0) {
                object = (List)object;
                n3 = object.indexOf(object2);
            } else {
                boolean bl2;
                object = object.iterator();
                n4 = 0;
                string2 = null;
                while (bl2 = object.hasNext()) {
                    Object e2 = object.next();
                    if (n4 >= 0) {
                        bl2 = Intrinsics.areEqual(object2, e2);
                        if (bl2) {
                            n3 = n4;
                            break block5;
                        }
                        ++n4;
                        continue;
                    }
                    xx_2.n();
                    throw null;
                }
                n3 = -1;
            }
        }
        return n3;
    }

    public static LinkedHashSet P(Iterable iterable, Iterable iterable2) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(iterable, string2);
        Intrinsics.checkNotNullParameter(iterable2, "other");
        iterable = CollectionsKt.n0(iterable);
        Intrinsics.checkNotNullParameter(iterable, string2);
        Intrinsics.checkNotNullParameter(iterable2, "elements");
        iterable2 = cx_2.u(iterable2);
        iterable.retainAll((Collection<?>)iterable2);
        return iterable;
    }

    public static /* synthetic */ void Q(Iterable iterable, StringBuilder stringBuilder, String string2, Function1 function1, int n3) {
        if ((n3 &= 0x40) != 0) {
            function1 = null;
        }
        String string3 = "";
        CollectionsKt___CollectionsKt.C(iterable, stringBuilder, string2, string3, string3, -1, "...", function1);
    }

    public static String R(Iterable object, String charSequence, String string2, String string3, Function1 function1, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            charSequence = ", ";
        }
        String string4 = charSequence;
        int n7 = n3 & 2;
        Object object2 = "";
        Object object3 = n7 != 0 ? object2 : string2;
        n7 = n3 & 4;
        Object object4 = n7 != 0 ? object2 : string3;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(string4, "separator");
        Intrinsics.checkNotNullParameter(object3, "prefix");
        Intrinsics.checkNotNullParameter(object4, "postfix");
        String string5 = "...";
        Intrinsics.checkNotNullParameter(string5, "truncated");
        charSequence = new StringBuilder();
        object2 = object;
        CollectionsKt___CollectionsKt.C((Iterable)object, (StringBuilder)charSequence, string4, (CharSequence)object3, (CharSequence)object4, -1, string5, function1);
        object = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

    public static Object S(List object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.isEmpty();
        if (n3 == 0) {
            n3 = xx_2.h((List)object);
            return object.get(n3);
        }
        object = new NoSuchElementException("List is empty.");
        throw object;
    }

    public static Object T(List object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean n3 = object.isEmpty();
        if (n3) {
            object = null;
        } else {
            int n4 = 1;
            object = on_2.d(n4, (List)object);
        }
        return object;
    }

    public static Comparable U(ArrayList object) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((ArrayList)object).iterator();
        boolean bl2 = object.hasNext();
        if (!bl2) {
            object = null;
        } else {
            boolean bl3;
            object2 = (Comparable)object.next();
            while (bl3 = object.hasNext()) {
                Comparable comparable = (Comparable)object.next();
                int n3 = object2.compareTo(comparable);
                if (n3 >= 0) continue;
                object2 = comparable;
            }
            object = object2;
        }
        return object;
    }

    public static List V(Iterable arrayList, Iterable iterable) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        ArrayList arrayList2 = "elements";
        Intrinsics.checkNotNullParameter(iterable, (String)((Object)arrayList2));
        iterable = cx_2.u(iterable);
        boolean bl2 = iterable.isEmpty();
        if (bl2) {
            arrayList = CollectionsKt.k0(arrayList);
        } else {
            boolean bl3;
            arrayList2 = new ArrayList();
            arrayList = arrayList.iterator();
            while (bl3 = arrayList.hasNext()) {
                Object e2 = arrayList.next();
                boolean bl4 = iterable.contains(e2);
                if (bl4) continue;
                arrayList2.add(e2);
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public static ArrayList W(Iterable iterable, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = "elements";
        Intrinsics.checkNotNullParameter(iterable, (String)((Object)arrayList));
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            int n3 = collection.size();
            iterable = (Collection)iterable;
            int n4 = iterable.size() + n3;
            arrayList = new ArrayList(n4);
            arrayList.addAll(collection);
            arrayList.addAll(iterable);
        } else {
            arrayList = new ArrayList(collection);
            cx_2.r(iterable, arrayList);
        }
        return arrayList;
    }

    public static ArrayList X(Collection collection, Object object) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int n3 = collection.size() + 1;
        ArrayList<Object> arrayList = new ArrayList<Object>(n3);
        arrayList.addAll(collection);
        arrayList.add(object);
        return arrayList;
    }

    public static ArrayList Y(b iterable, b b2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = "elements";
        Intrinsics.checkNotNullParameter(b2, (String)((Object)arrayList));
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            iterable = (Collection)iterable;
            iterable = CollectionsKt.W(b2, (Collection)iterable);
        } else {
            arrayList = new ArrayList();
            cx_2.r(iterable, arrayList);
            cx_2.r(b2, arrayList);
            iterable = arrayList;
        }
        return iterable;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static List Z(Iterable iterable) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(iterable, string2);
        int n3 = iterable instanceof Collection;
        if (n3 != 0) {
            int n4;
            Iterable iterable2 = iterable;
            iterable2 = (Collection)iterable;
            n3 = iterable2.size();
            if (n3 <= (n4 = 1)) {
                return CollectionsKt.k0(iterable);
            }
        }
        iterable = CollectionsKt___CollectionsKt.D(iterable);
        Intrinsics.checkNotNullParameter(iterable, string2);
        Collections.reverse(iterable);
        return iterable;
    }

    public static Object a0(Iterable object) {
        block6: {
            block7: {
                block5: {
                    String string2;
                    block2: {
                        block3: {
                            block4: {
                                string2 = "<this>";
                                Intrinsics.checkNotNullParameter(object, string2);
                                int n3 = object instanceof List;
                                if (n3 == 0) break block2;
                                object = (List)object;
                                Intrinsics.checkNotNullParameter(object, string2);
                                int n4 = object.size();
                                if (n4 == 0) break block3;
                                n3 = 1;
                                if (n4 != n3) break block4;
                                n4 = 0;
                                string2 = null;
                                object = object.get(0);
                                break block5;
                            }
                            object = new IllegalArgumentException("List has more than one element.");
                            throw object;
                        }
                        object = new NoSuchElementException("List is empty.");
                        throw object;
                    }
                    boolean bl2 = (object = object.iterator()).hasNext();
                    if (!bl2) break block6;
                    string2 = object.next();
                    boolean bl3 = object.hasNext();
                    if (bl3) break block7;
                    object = string2;
                }
                return object;
            }
            object = new IllegalArgumentException("Collection has more than one element.");
            throw object;
        }
        object = new NoSuchElementException("Collection is empty.");
        throw object;
    }

    public static Object b0(List list) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(list, string2);
        int n3 = list.size();
        int n4 = 1;
        if (n3 == n4) {
            n3 = 0;
            string2 = null;
            list = list.get(0);
        } else {
            list = null;
        }
        return list;
    }

    public static List c0(List list, IntRange intRange) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        String string2 = "indices";
        Intrinsics.checkNotNullParameter(intRange, string2);
        int n3 = intRange.isEmpty();
        if (n3 != 0) {
            list = mz0_2.a;
        } else {
            n3 = intRange.b + 1;
            int n4 = intRange.a;
            list = CollectionsKt.k0(list.subList(n4, n3));
        }
        return list;
    }

    public static List d0(Iterable object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object instanceof Collection;
        if (bl2) {
            int n3;
            Object object2 = object;
            object2 = (Collection)object;
            int n4 = object2.size();
            if (n4 <= (n3 = 1)) {
                object = CollectionsKt.k0((Iterable)object);
            } else {
                object = new Comparable[]{};
                object = object2.toArray((T[])object);
                object2 = object;
                object2 = object;
                Intrinsics.checkNotNullParameter(object2, string2);
                int n7 = ((Comparable[])object2).length;
                if (n7 > n3) {
                    Arrays.sort(object2);
                }
                object = rp_1.e(object);
            }
        } else {
            object = CollectionsKt___CollectionsKt.D((Iterable)object);
            bx_2.p((List)object);
        }
        return object;
    }

    public static List e0(Iterable object, Comparator comparator) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        String string3 = "comparator";
        Intrinsics.checkNotNullParameter(comparator, string3);
        boolean bl2 = object instanceof Collection;
        if (bl2) {
            int n3;
            Object object2 = object;
            object2 = (Collection)object;
            int n4 = object2.size();
            if (n4 <= (n3 = 1)) {
                object = CollectionsKt.k0((Iterable)object);
            } else {
                object = new Object[]{};
                object = object2.toArray((T[])object);
                Intrinsics.checkNotNullParameter(object, string2);
                Intrinsics.checkNotNullParameter(comparator, string3);
                int n7 = ((Object[])object).length;
                if (n7 > n3) {
                    Arrays.sort(object, comparator);
                }
                object = rp_1.e(object);
            }
        } else {
            object = CollectionsKt___CollectionsKt.D((Iterable)object);
            bx_2.q((List)object, comparator);
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static List f0(Iterable object, int n3) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        if (n3 >= 0) {
            if (n3 == 0) {
                return mz0_2.a;
            }
            int n4 = object instanceof Collection;
            int n7 = 1;
            if (n4 != 0) {
                Iterator iterator = object;
                Collection collection = (Collection)object;
                n4 = collection.size();
                if (n3 >= n4) {
                    return CollectionsKt.k0(object);
                }
                if (n3 == n7) {
                    return a.b(CollectionsKt.K((Iterable)object));
                }
            }
            ArrayList arrayList = new ArrayList(n3);
            object = object.iterator();
            int n8 = 0;
            do {
                boolean bl2;
                if (!(bl2 = object.hasNext())) return xx_2.k(arrayList);
                Object e2 = object.next();
                arrayList.add(e2);
            } while ((n8 += n7) != n3);
            return xx_2.k(arrayList);
        }
        object = Gj0.b(n3, "Requested element count ", " is less than zero.");
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public static byte[] g0(ArrayList object) {
        byte by2;
        Intrinsics.checkNotNullParameter(object, "<this>");
        int n3 = ((ArrayList)object).size();
        byte[] byArray = new byte[n3];
        object = ((ArrayList)object).iterator();
        int n4 = 0;
        while ((by2 = object.hasNext()) != 0) {
            Number number = (Number)object.next();
            by2 = number.byteValue();
            int n7 = n4 + 1;
            byArray[n4] = by2;
            n4 = n7;
        }
        return byArray;
    }

    public static void h0(Iterable object, Collection collection) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "<this>");
        String string2 = "destination";
        Intrinsics.checkNotNullParameter(collection, string2);
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            string2 = object.next();
            collection.add(string2);
        }
    }

    public static HashSet i0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int n3 = eh1_2.c(yx_2.o(iterable, 12));
        HashSet hashSet = new HashSet(n3);
        CollectionsKt.h0(iterable, hashSet);
        return hashSet;
    }

    public static int[] j0(Collection object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "<this>");
        int n4 = object.size();
        int[] nArray = new int[n4];
        object = object.iterator();
        int n7 = 0;
        while ((n3 = object.hasNext()) != 0) {
            Number number = (Number)object.next();
            n3 = number.intValue();
            int n8 = n7 + 1;
            nArray[n7] = n3;
            n7 = n8;
        }
        return nArray;
    }

    public static List k0(Iterable iterable) {
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(iterable, (String)object);
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            object = iterable;
            object = (Collection)iterable;
            int n3 = object.size();
            if (n3 != 0) {
                int n4 = 1;
                if (n3 != n4) {
                    iterable = CollectionsKt.m0((Collection)object);
                } else {
                    bl2 = iterable instanceof List;
                    if (bl2) {
                        iterable = (List)iterable;
                        bl2 = false;
                        object = null;
                        iterable = iterable.get(0);
                    } else {
                        iterable = iterable.iterator().next();
                    }
                    iterable = a.b(iterable);
                }
            } else {
                iterable = mz0_2.a;
            }
        } else {
            iterable = xx_2.k(CollectionsKt___CollectionsKt.D(iterable));
        }
        return iterable;
    }

    public static long[] l0(Collection object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "<this>");
        int n3 = object.size();
        long[] lArray = new long[n3];
        object = object.iterator();
        int n4 = 0;
        while (bl2 = object.hasNext()) {
            Number number = (Number)object.next();
            long l2 = number.longValue();
            int n7 = n4 + 1;
            lArray[n4] = l2;
            n4 = n7;
        }
        return lArray;
    }

    public static ArrayList m0(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection);
        return arrayList;
    }

    public static LinkedHashSet n0(Iterable iterable) {
        LinkedHashSet linkedHashSet = "<this>";
        Intrinsics.checkNotNullParameter(iterable, (String)((Object)linkedHashSet));
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            iterable = (Collection)iterable;
            linkedHashSet = new LinkedHashSet(iterable);
        } else {
            linkedHashSet = new LinkedHashSet();
            CollectionsKt.h0(iterable, linkedHashSet);
        }
        return linkedHashSet;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static Set o0(Iterable iterable) {
        void var0_6;
        void var4_16;
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(iterable, (String)object);
        int n3 = iterable instanceof Collection;
        int n4 = 1;
        if (n3 != 0) {
            void var0_4;
            object = iterable;
            object = (Collection)iterable;
            n3 = object.size();
            if (n3 == 0) {
                vz0_2 vz0_22 = vz0_2.a;
                return var4_16;
            }
            if (n3 != n4) {
                int n7 = eh1_2.c(object.size());
                LinkedHashSet linkedHashSet = new LinkedHashSet(n7);
                CollectionsKt.h0(iterable, linkedHashSet);
                return var4_16;
            }
            boolean bl2 = iterable instanceof List;
            if (bl2) {
                List list = (List)iterable;
                bl2 = false;
                object = null;
                Object e2 = list.get(0);
            } else {
                Object object2 = iterable.iterator().next();
            }
            Set set = O03.b(var0_4);
            return var4_16;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CollectionsKt.h0(iterable, linkedHashSet);
        Intrinsics.checkNotNullParameter(linkedHashSet, (String)object);
        int n8 = linkedHashSet.size();
        if (n8 != 0) {
            if (n8 != n4) {
                return var4_16;
            }
            Set set = O03.b(linkedHashSet.iterator().next());
        } else {
            vz0_2 vz0_23 = vz0_2.a;
        }
        void var4_15 = var0_6;
        return var4_16;
    }

    public static ArrayList p0(Iterable object, int n3, int n4, boolean bl2) {
        ArrayList<List> arrayList;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        cb2_0.b(n3, n4);
        int n7 = object instanceof RandomAccess;
        if (n7 != 0 && (n7 = object instanceof List) != 0) {
            object = (List)object;
            n7 = object.size();
            int n8 = n7 / n4;
            int n10 = n7 % n4;
            if (n10 == 0) {
                n10 = 0;
                arrayList = null;
            } else {
                n10 = 1;
            }
            arrayList = new ArrayList<List>(n8 += n10);
            for (n8 = 0; n8 >= 0 && n8 < n7; n8 += n4) {
                int n14 = n7 - n8;
                if (n3 <= n14) {
                    n14 = n3;
                }
                if (n14 >= n3 || bl2) {
                    ArrayList arrayList2 = new ArrayList(n14);
                    Object var12_13 = null;
                    for (int i3 = 0; i3 < n14; ++i3) {
                        int n15 = i3 + n8;
                        Object e2 = object.get(n15);
                        arrayList2.add(e2);
                    }
                    arrayList.add(arrayList2);
                    continue;
                }
                break;
            }
        } else {
            arrayList = new ArrayList<List>();
            Iterator iterator = object.iterator();
            object = "iterator";
            Intrinsics.checkNotNullParameter(iterator, (String)object);
            boolean bl3 = iterator.hasNext();
            if (!bl3) {
                object = lz0_2.a;
            } else {
                int n16 = n3;
                boolean bl4 = bl2;
                object = new j73_0(n3, n4, iterator, bl2, null);
                object = zz2_1.a((Function2)object);
            }
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                List list = (List)object.next();
                arrayList.add(list);
            }
        }
        return arrayList;
    }
}

