/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import java.util.Comparator;

public final class Jn0
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (zn0$i)object;
        object2 = (zn0$i)object2;
        boolean bl2 = ((zn0$i)object).e;
        Ordering ordering = bl2 && (bl2 = ((zn0$i)object).h) ? zn0.j : zn0.j.reverse();
        Object object3 = ComparisonChain.start();
        Object object4 = ((zn0$i)object).f;
        boolean bl3 = ((Fp3)object4).y;
        int n3 = ((zn0$i)object).j;
        if (bl3) {
            object4 = n3;
            int n4 = ((zn0$i)object2).j;
            Integer n7 = n4;
            Ordering ordering2 = zn0.j.reverse();
            object3 = ((ComparisonChain)object3).compare(object4, n7, ordering2);
        }
        object = ((zn0$i)object).k;
        object4 = ((zn0$i)object2).k;
        object = ((ComparisonChain)object3).compare(object, object4, ordering);
        object3 = n3;
        object2 = ((zn0$i)object2).j;
        return ((ComparisonChain)object).compare(object3, object2, ordering).result();
    }
}

