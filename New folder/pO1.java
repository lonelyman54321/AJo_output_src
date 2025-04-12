/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.Ordering;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Comparator;

public final class pO1
implements Ve0 {
    public static final Ordering b;
    public final ArrayList a;

    static {
        Ordering ordering = Ordering.natural();
        Object object = new Object();
        ordering = ordering.onResultOf((Function)object);
        object = Ordering.natural().reverse();
        oO1 oO12 = new Object();
        object = ((Ordering)object).onResultOf(oO12);
        b = ordering.compound((Comparator)object);
    }

    public pO1() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
    }

    public final boolean a(We0 we0, long l2) {
        long l3;
        long l4 = we0.b;
        int n3 = 1;
        long l7 = -9223372036854775807L;
        long l8 = l4 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        object = object != false ? (Object)1 : (Object)0;
        ct3.a((boolean)object);
        long l12 = we0.c;
        long l14 = l12 == l7 ? 0 : (l12 < l7 ? -1 : 1);
        int n4 = l14 != false ? 1 : 0;
        ct3.a(n4 != 0);
        n4 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1);
        boolean bl2 = n4 <= 0 && (object = (l3 = l2 - (l7 = we0.d)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0;
        ArrayList arrayList = this.a;
        for (n4 = arrayList.size() - n3; n4 >= 0; n4 += -1) {
            We0 we02 = (We0)arrayList.get(n4);
            long l15 = we02.b;
            long l16 = l4 - l15;
            Object object2 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
            if (object2 < 0) continue;
            arrayList.add(n4 += n3, we0);
            return bl2;
        }
        arrayList.add(0, we0);
        return bl2;
    }

    public final ImmutableList b(long l2) {
        AbstractCollection abstractCollection = this.a;
        int n3 = abstractCollection.isEmpty();
        if (n3 == 0) {
            n3 = 0;
            ArrayList<We0> arrayList = (We0)abstractCollection.get(0);
            long l3 = ((We0)((Object)arrayList)).b;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object >= 0) {
                int n4;
                arrayList = new ArrayList<We0>();
                for (int i3 = 0; i3 < (object = (Object)abstractCollection.size()); ++i3) {
                    long l7;
                    long l8;
                    long l12;
                    long l14;
                    We0 we0 = (We0)abstractCollection.get(i3);
                    long l15 = we0.b;
                    long l16 = l2 - l15;
                    Object object2 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                    if (object2 >= 0 && (object2 = (l14 = l2 - (l15 = we0.d)) == 0L ? 0 : (l14 < 0L ? -1 : 1)) < 0) {
                        arrayList.add(we0);
                    }
                    if ((l12 = (l8 = l2 - (l7 = we0.b)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) < 0) break;
                }
                ImmutableList immutableList = ImmutableList.sortedCopyOf(b, arrayList);
                ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
                while (n3 < (n4 = immutableList.size())) {
                    abstractCollection = ((We0)immutableList.get((int)n3)).a;
                    immutableList$Builder.addAll(abstractCollection);
                    ++n3;
                }
                return immutableList$Builder.build();
            }
        }
        return ImmutableList.of();
    }

    public final long c(long l2) {
        ArrayList arrayList = this.a;
        int n3 = (int)(arrayList.isEmpty() ? 1 : 0);
        if (n3 == 0) {
            We0 we0 = (We0)arrayList.get(0);
            long l3 = we0.b;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object >= 0) {
                we0 = (We0)arrayList.get(0);
                l3 = we0.b;
                for (n3 = 0; n3 < (object = (Object)arrayList.size()); ++n3) {
                    We0 we02 = (We0)arrayList.get(n3);
                    long l7 = we02.b;
                    We0 we03 = (We0)arrayList.get(n3);
                    long l8 = we03.d;
                    long l12 = l8 - l2;
                    Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                    if (object2 <= 0) {
                        l3 = Math.max(l3, l8);
                        continue;
                    }
                    Object object3 = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1);
                    if (object3 > 0) break;
                    l3 = Math.max(l3, l7);
                }
                return l3;
            }
        }
        return -9223372036854775807L;
    }

    public final void clear() {
        this.a.clear();
    }

    public final long d(long l2) {
        Object object;
        Object object2;
        int n3;
        long l3 = -9223372036854775807L;
        long l4 = l3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object2 = this.a)).size()); ++i3) {
            We0 we0 = (We0)((ArrayList)object2).get(i3);
            long l7 = we0.b;
            object2 = (We0)((ArrayList)object2).get(i3);
            long l8 = ((We0)object2).d;
            Object object3 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
            if (object3 < 0) {
                object = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
                if (object == false) {
                    l4 = l7;
                    break;
                }
                l4 = l2 = Math.min(l4, l7);
                break;
            }
            object3 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
            if (object3 >= 0) continue;
            object3 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
            l4 = object3 == false ? l8 : Math.min(l4, l8);
        }
        if ((object = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1)) == false) {
            l4 = Long.MIN_VALUE;
        }
        return l4;
    }

    public final void e(long l2) {
        ArrayList arrayList;
        int n3;
        for (int i3 = 0; i3 < (n3 = (arrayList = this.a).size()); ++i3) {
            We0 we0 = (We0)arrayList.get(i3);
            long l3 = we0.b;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object > 0) {
                we0 = (We0)arrayList.get(i3);
                l3 = we0.d;
                long l7 = l2 - l3;
                Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object2 > 0) {
                    arrayList.remove(i3);
                    i3 += -1;
                    continue;
                }
            }
            if (object < 0) break;
        }
    }
}

