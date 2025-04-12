/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/*
 * Renamed from Ye0
 */
public final class ye0_1
implements lf3_0 {
    public static final Ordering c;
    public final ImmutableList a;
    public final long[] b;

    static {
        Ordering ordering = Ordering.natural();
        xe0_1 xe0_12 = new Object();
        c = ordering.onResultOf(xe0_12);
    }

    public ye0_1(ImmutableList immutableList) {
        int n3;
        ye0_1 ye0_12 = this;
        int n4 = 2;
        int n7 = immutableList.size();
        int n8 = 1;
        long l2 = -9223372036854775807L;
        if (n7 == n8) {
            Object object = (We0)Iterables.getOnlyElement(immutableList);
            long l3 = ((We0)object).b;
            long l4 = l3 - l2;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            long l7 = object2 == false ? 0L : l3;
            ImmutableList immutableList2 = ((We0)object).a;
            long l8 = ((We0)object).c;
            long l12 = l8 - l2;
            n7 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1));
            if (n7 == 0) {
                Object object3 = ImmutableList.of(immutableList2);
                ye0_12.a = object3;
                object3 = new long[n8];
                object3[0] = l7;
                ye0_12.b = (long[])object3;
            } else {
                object = ImmutableList.of();
                ye0_12.a = object = ImmutableList.of(immutableList2, object);
                long[] lArray = new long[n4];
                lArray[0] = l7;
                lArray[n8] = l8 += l7;
                ye0_12.b = lArray;
            }
            return;
        }
        n7 = immutableList.size() * 2;
        Object object = new long[n7];
        this.b = object;
        long l14 = Long.MAX_VALUE;
        Arrays.fill((long[])object, l14);
        object = new ArrayList;
        Object object4 = c;
        ImmutableList immutableList3 = immutableList;
        object4 = ImmutableList.sortedCopyOf((Comparator)object4, immutableList);
        int n10 = 0;
        immutableList3 = null;
        for (int i3 = 0; i3 < (n3 = ((AbstractCollection)object4).size()); i3 += n8) {
            int n14;
            Object object5;
            long l15;
            long l16;
            long l17;
            Object object6 = (We0)object4.get(i3);
            long l18 = ((We0)object6).b;
            long l19 = l18 - l2;
            Object object7 = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
            if (object7 == false) {
                l18 = 0L;
            }
            long l20 = ((We0)object6).c;
            long l21 = l18 + l20;
            object6 = ((We0)object6).a;
            if (n10 != 0 && (l17 = (l16 = (l15 = (object5 = ye0_12.b)[n14 = n10 + -1]) - l18) == 0L ? 0 : (l16 < 0L ? -1 : 1)) >= 0) {
                if (l17 == false && (l17 = (long)(object5 = (Object)((ImmutableList)((ArrayList)object).get(n14))).isEmpty()) != false) {
                    ((ArrayList)object).set(n14, object6);
                } else {
                    Cx.f("Truncating unsupported overlapping cues.");
                    object5 = ye0_12.b;
                    object5[n14] = l18;
                    ((ArrayList)object).set(n14, object6);
                }
            } else {
                object5 = ye0_12.b;
                n14 = n10 + 1;
                object5[n10] = l18;
                ((ArrayList)object).add(object6);
                n10 = n14;
            }
            l17 = l20 == l2 ? 0 : (l20 < l2 ? -1 : 1);
            if (l17 == false) continue;
            object5 = ye0_12.b;
            n14 = n10 + 1;
            object5[n10] = l21;
            object5 = ImmutableList.of();
            ((ArrayList)object).add(object5);
            n10 = n14;
        }
        object = ImmutableList.copyOf((Collection)object);
        ye0_12.a = object;
    }

    public final int a(long l2) {
        ImmutableList immutableList;
        int n3;
        long[] lArray = this.b;
        int n4 = gz3.a(lArray, l2, false);
        if (n4 >= (n3 = (immutableList = this.a).size())) {
            n4 = -1;
        }
        return n4;
    }

    public final List b(long l2) {
        ImmutableList immutableList;
        int n3;
        long[] lArray = this.b;
        int n4 = gz3.d(lArray, l2, false);
        if (n4 == (n3 = -1)) {
            immutableList = ImmutableList.of();
        } else {
            ImmutableList immutableList2 = this.a;
            immutableList = (ImmutableList)immutableList2.get(n4);
        }
        return immutableList;
    }

    public final long c(int n3) {
        ImmutableList immutableList = this.a;
        int n4 = immutableList.size();
        if (n3 < n4) {
            n4 = 1;
        } else {
            n4 = 0;
            immutableList = null;
        }
        ct3.a(n4 != 0);
        return this.b[n3];
    }

    public final int d() {
        return this.a.size();
    }
}

