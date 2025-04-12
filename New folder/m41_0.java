/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.b;

/*
 * Renamed from m41
 */
public final class m41_0
implements Iterable,
KMappedMarker {
    public final String[] a;

    public m41_0(String[] stringArray) {
        this.a = stringArray;
    }

    public final String a(String string2) {
        block3: {
            Intrinsics.checkNotNullParameter(string2, "name");
            String[] stringArray = this.a;
            int n3 = stringArray.length + -2;
            int n4 = -2;
            int n7 = vb2_1.a(n3, 0, n4);
            if (n7 <= n3) {
                while (true) {
                    int n8;
                    String string3;
                    if ((n4 = (int)(b.i(string2, string3 = stringArray[n3], (n8 = 1) != 0) ? 1 : 0)) != 0) {
                        string2 = stringArray[n3 += n8];
                        break block3;
                    }
                    if (n3 == n7) break;
                    n3 += -2;
                }
            }
            string2 = null;
        }
        return string2;
    }

    public final String c(int n3) {
        return this.a[n3 *= 2];
    }

    public final Set d() {
        Intrinsics.checkNotNullParameter(StringCompanionObject.INSTANCE, "<this>");
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(comparator, "CASE_INSENSITIVE_ORDER");
        Set<String> set = new Set<String>(comparator);
        int n3 = this.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = this.c(i3);
            ((TreeSet)set).add(string2);
        }
        set = Collections.unmodifiableSet(set);
        Intrinsics.checkNotNullExpressionValue(set, "unmodifiableSet(result)");
        return set;
    }

    public final m41$a_0 e() {
        m41$a_0 m41$a_0 = new m41$a_0();
        ArrayList arrayList = m41$a_0.a;
        Object[] objectArray = this.a;
        cx_2.t(arrayList, objectArray);
        return m41$a_0;
    }

    public final boolean equals(Object objectArray) {
        Object[] objectArray2;
        boolean bl2;
        boolean bl3 = objectArray instanceof m41_0;
        if (bl3 && (bl2 = Arrays.equals(objectArray2 = this.a, objectArray = ((m41_0)objectArray).a))) {
            bl2 = true;
        } else {
            bl2 = false;
            objectArray = null;
        }
        return bl2;
    }

    public final TreeMap f() {
        Intrinsics.checkNotNullParameter(StringCompanionObject.INSTANCE, "<this>");
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(comparator, "CASE_INSENSITIVE_ORDER");
        TreeMap<String, ArrayList<String>> treeMap = new TreeMap<String, ArrayList<String>>(comparator);
        int n3 = this.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = this.c(i3);
            ArrayList<String> arrayList = Locale.US;
            String string3 = "US";
            String string4 = "this as java.lang.String).toLowerCase(locale)";
            if ((arrayList = (List)treeMap.get(string2 = zn0_1.a((Locale)((Object)arrayList), string3, string2, (Locale)((Object)arrayList), string4))) == null) {
                int n4 = 2;
                arrayList = new ArrayList<String>(n4);
                treeMap.put(string2, arrayList);
            }
            string2 = this.g(i3);
            arrayList.add(string2);
        }
        return treeMap;
    }

    public final String g(int n3) {
        n3 = n3 * 2 + 1;
        return this.a[n3];
    }

    public final List h(String list) {
        String string2 = "name";
        Intrinsics.checkNotNullParameter(list, string2);
        int n3 = this.size();
        ArrayList<String> arrayList = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            String string3 = this.c(i3);
            int n4 = b.i(list, string3, bl2 = true);
            if (n4 == 0) continue;
            if (arrayList == null) {
                n4 = 2;
                arrayList = new ArrayList<String>(n4);
            }
            string3 = this.g(i3);
            arrayList.add(string3);
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            string2 = "{\n      Collections.unmodifiableList(result)\n    }";
            Intrinsics.checkNotNullExpressionValue(list, string2);
        } else {
            list = mz0_2.a;
        }
        return list;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final Iterator iterator() {
        int n3 = this.size();
        Object[] objectArray = new Pair[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = this.c(i3);
            String string3 = this.g(i3);
            Pair pair = new Pair(string2, string3);
            objectArray[i3] = pair;
        }
        return ArrayIteratorKt.iterator(objectArray);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder();
        int n3 = this.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = this.c(i3);
            String string3 = this.g(i3);
            ((StringBuilder)charSequence).append(string2);
            String string4 = ": ";
            ((StringBuilder)charSequence).append(string4);
            boolean bl2 = ez3.q(string2);
            if (bl2) {
                string3 = "\u2588\u2588";
            }
            ((StringBuilder)charSequence).append(string3);
            string2 = "\n";
            ((StringBuilder)charSequence).append(string2);
        }
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder().apply(builderAction).toString()");
        return charSequence;
    }
}

