/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import java.util.Comparator;

public final class In0
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (zn0$i)object;
        object2 = (zn0$i)object2;
        ComparisonChain comparisonChain = ComparisonChain.start();
        boolean bl2 = ((zn0$i)object).h;
        boolean bl3 = ((zn0$i)object2).h;
        comparisonChain = comparisonChain.compareFalseFirst(bl2, bl3);
        int n3 = ((zn0$i)object).m;
        int n4 = ((zn0$i)object2).m;
        comparisonChain = comparisonChain.compare(n3, n4);
        boolean bl4 = ((zn0$i)object).n;
        boolean bl5 = ((zn0$i)object2).n;
        comparisonChain = comparisonChain.compareFalseFirst(bl4, bl5);
        boolean bl6 = ((zn0$i)object).i;
        boolean bl7 = ((zn0$i)object2).i;
        comparisonChain = comparisonChain.compareFalseFirst(bl6, bl7);
        boolean bl8 = ((zn0$i)object).e;
        boolean bl9 = ((zn0$i)object2).e;
        comparisonChain = comparisonChain.compareFalseFirst(bl8, bl9);
        boolean bl10 = ((zn0$i)object).g;
        boolean bl11 = ((zn0$i)object2).g;
        comparisonChain = comparisonChain.compareFalseFirst(bl10, bl11);
        Integer n7 = ((zn0$i)object).l;
        Integer n8 = ((zn0$i)object2).l;
        Ordering ordering = Ordering.natural().reverse();
        comparisonChain = comparisonChain.compare(n7, n8, ordering);
        boolean bl12 = ((zn0$i)object).q;
        boolean bl13 = ((zn0$i)object2).q;
        comparisonChain = comparisonChain.compareFalseFirst(bl12, bl13);
        boolean bl14 = ((zn0$i)object).r;
        boolean bl15 = ((zn0$i)object2).r;
        comparisonChain = comparisonChain.compareFalseFirst(bl14, bl15);
        if (bl12 && bl14) {
            int n10 = ((zn0$i)object).s;
            int n14 = ((zn0$i)object2).s;
            comparisonChain = comparisonChain.compare(n10, n14);
        }
        return comparisonChain.result();
    }
}

