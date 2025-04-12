/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aq$a
 */
public final class aq$a_0 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static aq_1 a(List object, Function1 object2, Function2 object3) {
        int n3;
        Object object4;
        ArrayList arrayList;
        block10: {
            int n4;
            Object object5;
            block9: {
                Intrinsics.checkNotNullParameter(object, "from");
                Intrinsics.checkNotNullParameter(object2, "length");
                Intrinsics.checkNotNullParameter(object3, "charAt");
                arrayList = object;
                arrayList = (Iterable)object;
                object5 = arrayList.iterator();
                boolean bl2 = object5.hasNext();
                if (!bl2) {
                    n4 = 0;
                    object5 = null;
                } else {
                    void var7_8;
                    Object t3 = object5.next();
                    boolean bl3 = object5.hasNext();
                    if (bl3) {
                        object4 = (Comparable)object2.invoke(t3);
                        do {
                            Object e2;
                            Comparable comparable;
                            int n7;
                            if ((n7 = object4.compareTo(comparable = (Comparable)object2.invoke(e2 = object5.next()))) >= 0) continue;
                            Object e5 = e2;
                            object4 = comparable;
                        } while ((n3 = (int)(object5.hasNext() ? 1 : 0)) != 0);
                    }
                    object5 = var7_8;
                }
                if (object5 == null) {
                    object = new NoSuchElementException("Unable to build char tree from an empty list");
                    throw object;
                }
                object5 = (Number)object2.invoke(object5);
                n3 = ((Number)object5).intValue();
                n4 = arrayList instanceof Collection;
                if (n4 == 0) break block9;
                object5 = arrayList;
                object5 = arrayList;
                n4 = object5.isEmpty();
                if (n4 != 0) break block10;
            }
            arrayList = ((Iterable)arrayList).iterator();
            while ((n4 = arrayList.hasNext()) != 0) {
                object5 = arrayList.next();
                n4 = ((Number)(object5 = (Number)object2.invoke(object5))).intValue();
                if (n4 != 0) continue;
                object = new IllegalArgumentException("There should be no empty entries");
                throw object;
            }
        }
        ArrayList arrayList2 = arrayList = new ArrayList();
        object4 = object;
        aq$a_0.b(arrayList, object, n3, 0, (Function1)object2, (Function2)object3);
        arrayList.trimToSize();
        object3 = mz0_2.a;
        object2 = new aq$b_0('\u0000', (List)object3, arrayList);
        Intrinsics.checkNotNullParameter(object2, "root");
        return new Object();
    }

    public static void b(ArrayList arrayList, List iterator, int n3, int n4, Function1 function1, Function2 function2) {
        boolean bl2;
        Object object;
        ArrayList arrayList2;
        Object object2;
        char c2;
        iterator = (Iterable)((Object)iterator);
        Object object3 = new LinkedHashMap();
        iterator = iterator.iterator();
        while ((c2 = iterator.hasNext()) != '\u0000') {
            object2 = iterator.next();
            arrayList2 = n4;
            arrayList2 = (Character)function2.invoke(object2, arrayList2);
            arrayList2.getClass();
            object = ((LinkedHashMap)object3).get(arrayList2);
            if (object == null) {
                object = new Object();
                object3.put(arrayList2, object);
            }
            object = (List)object;
            object.add((Object)object2);
        }
        iterator = ((LinkedHashMap)object3).entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            boolean bl3;
            int n7;
            Object object4;
            int n8;
            object3 = iterator.next();
            object2 = (Character)object3.getKey();
            c2 = ((Character)object2).charValue();
            object3 = (List)object3.getValue();
            int n10 = n4 + 1;
            ArrayList arrayList3 = new ArrayList();
            object3 = (Iterable)object3;
            object = new Object();
            arrayList2 = object3.iterator();
            while ((n8 = arrayList2.hasNext()) != 0) {
                object4 = arrayList2.next();
                Number number = (Number)function1.invoke(object4);
                n7 = number.intValue();
                if (n7 <= n10) continue;
                ((ArrayList)object).add(object4);
            }
            arrayList2 = arrayList3;
            n8 = n3;
            n7 = n10;
            aq$a_0.b(arrayList3, (List)object, n3, n10, function1, function2);
            arrayList3.trimToSize();
            arrayList2 = new ArrayList();
            object3 = object3.iterator();
            while (bl3 = object3.hasNext()) {
                object = object3.next();
                object4 = (Number)function1.invoke(object);
                n8 = ((Number)object4).intValue();
                if (n8 != n10) continue;
                arrayList2.add(object);
            }
            object3 = new aq$b_0(c2, arrayList2, arrayList3);
            arrayList.add(object3);
        }
    }
}

