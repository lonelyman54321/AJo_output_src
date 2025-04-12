/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.ArrayList;

/*
 * Renamed from FJ2
 */
public final class fj2_0
implements Ve0 {
    public final ArrayList a;

    public fj2_0() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
    }

    public final boolean a(We0 we0, long l2) {
        boolean bl2;
        long l3;
        long l4;
        long l7;
        long l8 = we0.b;
        int n3 = 1;
        long l12 = -9223372036854775807L;
        long l14 = l8 - l12;
        Object object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        object = object != false ? (Object)1 : (Object)0;
        ct3.a((boolean)object);
        object = l8 == l2 ? 0 : (l8 < l2 ? -1 : 1);
        bl2 = object <= 0 && ((l7 = (l4 = (l3 = we0.d) - l12) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false || (bl2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1)) < false);
        ArrayList arrayList = this.a;
        for (object = (Object)(arrayList.size() - n3); object >= 0; object += -1) {
            We0 we02 = (We0)arrayList.get((int)object);
            long l15 = we02.b;
            long l16 = l8 - l15;
            Object object2 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
            if (object2 >= 0) {
                arrayList.add((int)(object += n3), we0);
                return bl2;
            }
            we02 = (We0)arrayList.get((int)object);
            l15 = we02.b;
            long l17 = l15 - l2;
            object2 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
            if (object2 > 0) continue;
            bl2 = false;
        }
        arrayList.add(0, we0);
        return bl2;
    }

    public final ImmutableList b(long l2) {
        long l3;
        int n3 = this.f(l2);
        if (n3 == 0) {
            return ImmutableList.of();
        }
        ArrayList arrayList = this.a;
        We0 we0 = (We0)arrayList.get(n3 += -1);
        long l4 = we0.d;
        long l7 = -9223372036854775807L;
        long l8 = l4 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        ImmutableList immutableList = object != false && (l3 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1)) >= 0 ? ImmutableList.of() : we0.a;
        return immutableList;
    }

    public final long c(long l2) {
        Object object = this.a;
        Object object2 = ((ArrayList)object).isEmpty();
        long l3 = -9223372036854775807L;
        if (object2 == 0) {
            We0 we0 = (We0)((ArrayList)object).get(0);
            long l4 = we0.b;
            long l7 = l2 - l4;
            object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object2 >= 0) {
                int n3;
                object2 = 1;
                for (int i3 = 1; i3 < (n3 = ((ArrayList)object).size()); ++i3) {
                    We0 we02 = (We0)((ArrayList)object).get(i3);
                    long l8 = we02.b;
                    long l12 = l2 - l8;
                    Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                    if (object3 == false) {
                        return l8;
                    }
                    if (object3 >= 0) continue;
                    object = (We0)((ArrayList)object).get(i3 -= object2);
                    l4 = ((We0)object).d;
                    long l14 = l4 - l3;
                    object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                    if (object2 == 0 || (object2 = (Object)(l4 == l2 ? 0 : (l4 < l2 ? -1 : 1))) > 0) {
                        l4 = ((We0)object).b;
                    }
                    return l4;
                }
                object = (We0)Iterables.getLast((Iterable)object);
                l4 = ((We0)object).d;
                long l15 = l4 - l3;
                object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                if (object2 == 0 || (object2 = (Object)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1))) < 0) {
                    l4 = ((We0)object).b;
                }
                return l4;
            }
        }
        return l3;
    }

    public final void clear() {
        this.a.clear();
    }

    public final long d(long l2) {
        long l3;
        Object object = this.a;
        boolean n3 = ((ArrayList)object).isEmpty();
        long l4 = Long.MIN_VALUE;
        if (n3) {
            return l4;
        }
        boolean bl2 = false;
        We0 we0 = (We0)((ArrayList)object).get(0);
        long l7 = we0.b;
        long l8 = l2 - l7;
        Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2 < 0) {
            return ((We0)((ArrayList)object).get((int)0)).b;
        }
        int n4 = 1;
        int n7 = 1;
        while (true) {
            int n8 = ((ArrayList)object).size();
            l3 = -9223372036854775807L;
            if (n7 >= n8) break;
            We0 we02 = (We0)((ArrayList)object).get(n7);
            long l12 = we02.b;
            long l14 = l2 - l12;
            Object object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            if (object3 < 0) {
                long l15;
                object = (We0)((ArrayList)object).get(n7 -= n4);
                long l16 = ((We0)object).d;
                l4 = we02.b;
                n7 = (int)(l16 == l3 ? 0 : (l16 < l3 ? -1 : 1));
                if (n7 == 0 || (n7 = (int)(l16 == l2 ? 0 : (l16 < l2 ? -1 : 1))) <= 0 || (l15 = l16 == l4 ? 0 : (l16 < l4 ? -1 : 1)) >= 0) {
                    l16 = l4;
                }
                return l16;
            }
            ++n7;
        }
        object = (We0)Iterables.getLast((Iterable)object);
        long l17 = ((We0)object).d;
        long l18 = l17 - l3;
        n7 = (int)(l18 == 0L ? 0 : (l18 < 0L ? -1 : 1));
        if (n7 != 0 && (n7 = (int)(l2 == l17 ? 0 : (l2 < l17 ? -1 : 1))) < 0) {
            l4 = l17;
        }
        return l4;
    }

    public final void e(long l2) {
        long l3;
        int n3 = this.f(l2);
        if (n3 == 0) {
            return;
        }
        ArrayList arrayList = this.a;
        int n4 = n3 + -1;
        We0 we0 = (We0)arrayList.get(n4);
        long l4 = we0.d;
        long l7 = -9223372036854775807L;
        long l8 = l4 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object == false || (l3 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1)) >= 0) {
            n3 += -1;
        }
        arrayList.subList(0, n3).clear();
    }

    public final int f(long l2) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.a)).size()); ++i3) {
            object = (We0)((ArrayList)object).get(i3);
            long l3 = ((We0)object).b;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 >= 0) continue;
            return i3;
        }
        return ((ArrayList)object).size();
    }
}

