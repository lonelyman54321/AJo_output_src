/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;

/*
 * Renamed from Pk2
 */
public final class pk2_0
implements us2_0 {
    public static final pk2_0 e;
    public final ArrayList a;
    public int b;
    public int c;
    public int d;

    static {
        pk2_0 pk2_02;
        rk2$b rk2$b = rk2$b.g;
        e = pk2_02 = new pk2_0(rk2$b);
    }

    public pk2_0(int n3, int n4, List object) {
        int n7;
        Intrinsics.checkNotNullParameter(object, "pages");
        List list = object;
        list = CollectionsKt.m0((Collection)object);
        this.a = list;
        object = ((Iterable)object).iterator();
        int n8 = 0;
        list = null;
        while ((n7 = object.hasNext()) != 0) {
            List list2 = ((Wq3)object.next()).b;
            n7 = list2.size();
            n8 += n7;
        }
        this.b = n8;
        this.c = n3;
        this.d = n4;
    }

    public pk2_0(rk2$b rk2$b) {
        Intrinsics.checkNotNullParameter(rk2$b, "insertEvent");
        List list = rk2$b.b;
        int n3 = rk2$b.c;
        int n4 = rk2$b.d;
        this(n3, n4, list);
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final rE3$a d(int n3) {
        int n4;
        int n7;
        Object object;
        Object object2;
        int n8 = this.c;
        n8 = n3 - n8;
        int n10 = 0;
        Wq3 wq3 = null;
        while (true) {
            object2 = this.a;
            object = ((Wq3)((ArrayList)object2).get((int)n10)).b;
            int n14 = object.size();
            if (n8 < n14 || n10 >= (n14 = xx_2.h((List)object2))) break;
            object2 = ((Wq3)((ArrayList)object2).get((int)n10)).b;
            n7 = object2.size();
            n8 -= n7;
            ++n10;
        }
        wq3 = (Wq3)((ArrayList)object2).get(n10);
        n7 = this.c;
        int n15 = n3 - n7;
        n7 = this.getSize() - n3;
        n3 = this.d;
        n7 -= n3;
        n3 = 1;
        int n16 = n7 + -1;
        int n17 = this.e();
        int n18 = this.f();
        object = wq3.d;
        if (object != null) {
            Iterable iterable = object;
            iterable = xx_2.g((Collection)object);
            n4 = (int)(((IntRange)iterable).e(n8) ? 1 : 0);
            if (n4 == n3) {
                Number number = (Number)object.get(n8);
                n8 = number.intValue();
            }
        }
        n4 = wq3.c;
        object = object2;
        object2 = new rE3$a(n4, n8, n15, n16, n17, n18);
        return object2;
    }

    public final int e() {
        Object object = ((Wq3)CollectionsKt.L((List)this.a)).a;
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = ((int[])object).length;
        if (n3 == 0) {
            object = null;
        } else {
            int n4;
            n3 = object[0];
            Intrinsics.checkNotNullParameter(object, (String)object2);
            int n7 = ((int[])object).length;
            int n8 = 1;
            IntRange intRange = new c(n8, n7 -= n8, n8);
            object2 = intRange.d();
            while ((n4 = ((ui1_2)object2).c) != 0) {
                n4 = ((ui1_2)object2).nextInt();
                if (n3 <= (n4 = object[n4])) continue;
                n3 = n4;
            }
            object = n3;
        }
        Intrinsics.checkNotNull(object);
        return object.intValue();
    }

    public final int f() {
        Object object = ((Wq3)CollectionsKt.S((List)this.a)).a;
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = ((int[])object).length;
        if (n3 == 0) {
            object = null;
        } else {
            int n4;
            n3 = object[0];
            Intrinsics.checkNotNullParameter(object, (String)object2);
            int n7 = ((int[])object).length;
            int n8 = 1;
            IntRange intRange = new c(n8, n7 -= n8, n8);
            object2 = intRange.d();
            while ((n4 = ((ui1_2)object2).c) != 0) {
                n4 = ((ui1_2)object2).nextInt();
                if (n3 >= (n4 = object[n4])) continue;
                n3 = n4;
            }
            object = n3;
        }
        Intrinsics.checkNotNull(object);
        return object.intValue();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Rl2 g(rk2_0 arrayList) {
        void var15_41;
        Object object = "pageEvent";
        Intrinsics.checkNotNullParameter(arrayList, (String)object);
        boolean bl2 = arrayList instanceof rk2$b;
        Object object2 = this.a;
        int n3 = 0;
        Object object3 = null;
        int n4 = 1;
        if (bl2) {
            int n7;
            int n8;
            int n10;
            arrayList = (rk2$b)((Object)arrayList);
            object = ((Iterable)((rk2$b)((Object)arrayList)).b).iterator();
            int n14 = 0;
            Object var9_16 = null;
            while ((n10 = object.hasNext()) != 0) {
                List list = ((Wq3)object.next()).b;
                n10 = list.size();
                n14 += n10;
            }
            object = Pk2$a.$EnumSwitchMapping$0;
            Rv1 rv1 = ((rk2$b)((Object)arrayList)).a;
            n10 = rv1.ordinal();
            Object object4 = object[n10];
            if (object4 == n4) {
                arrayList = new ArrayList("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                throw arrayList;
            }
            n4 = 2;
            List list = ((rk2$b)((Object)arrayList)).b;
            if (object4 != n4) {
                int n15;
                int n16;
                n3 = 3;
                if (object4 != n3) {
                    arrayList = new ArrayList();
                    throw arrayList;
                }
                int n17 = this.d;
                n3 = this.b;
                n4 = ((ArrayList)object2).size();
                Collection collection = list;
                collection = list;
                ((ArrayList)object2).addAll(n4, collection);
                this.b = n16 = this.b + n14;
                this.d = n15 = ((rk2$b)((Object)arrayList)).d;
                n15 = this.c + n3;
                Iterable iterable = list;
                object2 = new ArrayList();
                object3 = iterable.iterator();
                while (true) {
                    if ((n4 = (int)(object3.hasNext() ? 1 : 0)) == 0) {
                        n3 = this.d;
                        Rl2$a rl2$a = new Rl2$a(n15, n3, n17, (ArrayList)object2);
                        return var15_41;
                    }
                    Iterable iterable2 = ((Wq3)object3.next()).b;
                    cx_2.r(iterable2, (Collection)object2);
                }
            }
            int n18 = this.c;
            List list2 = list;
            Collection collection = list;
            ((ArrayList)object2).addAll(0, collection);
            this.b = n8 = this.b + n14;
            this.c = n7 = ((rk2$b)((Object)arrayList)).c;
            Iterable iterable = list;
            arrayList = new ArrayList();
            object2 = iterable.iterator();
            while (true) {
                if ((n3 = (int)(object2.hasNext() ? 1 : 0)) == 0) {
                    n8 = this.c;
                    Rl2$d rl2$d = new Rl2$d(arrayList, n8, n18);
                    return var15_41;
                }
                object3 = ((Wq3)object2.next()).b;
                cx_2.r((Iterable)object3, arrayList);
            }
        }
        boolean bl3 = arrayList instanceof rk2$a;
        if (!bl3) {
            arrayList = new ArrayList("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            throw arrayList;
        }
        arrayList = (rk2$a)((Object)arrayList);
        int n19 = ((rk2$a)((Object)arrayList)).b;
        int n20 = ((rk2$a)((Object)arrayList)).c;
        object = new c(n19, n20, n4);
        object2 = ((ArrayList)object2).iterator();
        n4 = 0;
        Object var15_38 = null;
        block3: while (true) {
            if ((n19 = (int)(object2.hasNext() ? 1 : 0)) == 0) {
                int n21;
                this.b = n21 = this.b - n4;
                object2 = Rv1.PREPEND;
                object3 = ((rk2$a)((Object)arrayList)).a;
                int n22 = ((rk2$a)((Object)arrayList)).d;
                if (object3 == object2) {
                    int n24 = this.c;
                    this.c = n22;
                    Object object5 = object2 = new Rl2$c(n4, n22, n24);
                    return var15_41;
                }
                int n25 = this.d;
                this.d = n22;
                n19 = this.c + n21;
                object3 = new Rl2$b(n19, n4, n22, n25);
                Object object6 = object3;
                return var15_41;
            }
            Object object7 = (Wq3)object2.next();
            int[] nArray = ((Wq3)object7).a;
            int n26 = nArray.length;
            int n27 = 0;
            while (true) {
                if (n27 >= n26) continue block3;
                int n28 = nArray[n27];
                if ((n28 = (int)(((IntRange)object).e(n28) ? 1 : 0)) != 0) {
                    object7 = ((Wq3)object7).b;
                    n19 = object7.size();
                    n4 += n19;
                    object2.remove();
                    continue block3;
                }
                ++n27;
            }
            break;
        }
    }

    public final Object getItem(int n3) {
        List list;
        int n4;
        int n7;
        ArrayList arrayList = this.a;
        int n8 = arrayList.size();
        for (n4 = 0; n4 < n8 && (n7 = (list = ((Wq3)arrayList.get((int)n4)).b).size()) <= n3; n3 -= n7, ++n4) {
        }
        return ((Wq3)arrayList.get((int)n4)).b.get(n3);
    }

    public final int getSize() {
        int n3 = this.c;
        int n4 = this.b;
        n3 += n4;
        n4 = this.d;
        return n3 + n4;
    }

    public final String toString() {
        int n3;
        int n4 = this.b;
        Serializable serializable = new Serializable(n4);
        for (n3 = 0; n3 < n4; ++n3) {
            Object object = this.getItem(n3);
            serializable.add(object);
        }
        String string2 = CollectionsKt.R(serializable, null, null, null, null, 63);
        serializable = new Serializable("[(");
        n3 = this.c;
        h30_0.b(serializable, n3, " placeholders), ", string2, ", (");
        return g30.a(this.d, " placeholders)]", serializable);
    }
}

