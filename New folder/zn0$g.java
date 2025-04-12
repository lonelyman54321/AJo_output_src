/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.lang.constant.Constable;
import java.util.AbstractCollection;
import java.util.Comparator;

public final class zn0$g
extends zn0$h
implements Comparable {
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;

    public zn0$g(int n3, qp3 object, int n4, zn0$d zn0$d, int n7, String string2) {
        int n8;
        Object object2;
        int n10;
        int n14;
        Object object3;
        Object object4;
        int n15;
        block13: {
            d d2;
            super(n3, (qp3)object, n4);
            n3 = 0;
            this.f = n15 = tj2_0.d(n7, false);
            object = this.d;
            n15 = ((d)object).e;
            n4 = ~zn0$d.v;
            n15 &= n4;
            n4 = n15 & 1;
            if (n4 != 0) {
                n4 = 1;
            } else {
                n4 = 0;
                object4 = null;
            }
            this.g = n4;
            if ((n15 &= 2) != 0) {
                n15 = 1;
            } else {
                n15 = 0;
                object = null;
            }
            this.h = n15;
            object = zn0$d.t;
            n4 = (int)(((AbstractCollection)object).isEmpty() ? 1 : 0);
            object4 = n4 != 0 ? ImmutableList.of("") : object;
            object3 = null;
            for (n14 = 0; n14 < (n10 = ((AbstractCollection)object4).size()); ++n14) {
                boolean bl2;
                d2 = this.d;
                object2 = (String)object4.get(n14);
                n10 = zn0.j(d2, (String)object2, bl2 = zn0$d.w);
                if (n10 <= 0) {
                    continue;
                }
                break block13;
            }
            n14 = -1 >>> 1;
            n10 = 0;
            d2 = null;
        }
        this.i = n14;
        this.j = n10;
        object4 = this.d;
        n4 = ((d)object4).f;
        n14 = zn0$d.u;
        this.k = n4 = zn0.h(n4, n14);
        object3 = this.d;
        n14 = ((d)object3).f & 0x440;
        if (n14 != 0) {
            n14 = 1;
        } else {
            n14 = 0;
            object3 = null;
        }
        this.m = n14;
        object3 = zn0.l(string2);
        if (object3 == null) {
            n14 = 1;
        } else {
            n14 = 0;
            object3 = null;
        }
        object2 = this.d;
        this.l = n8 = zn0.j((d)object2, string2, n14 != 0);
        if (!(n10 > 0 || (n15 = (int)(((AbstractCollection)object).isEmpty() ? 1 : 0)) != 0 && n4 > 0 || (n15 = (int)(this.g ? 1 : 0)) != 0 || (n15 = (int)(this.h ? 1 : 0)) != 0 && n8 > 0)) {
            n15 = 0;
            object = null;
        } else {
            n15 = 1;
        }
        n4 = (int)(zn0$d.O ? 1 : 0);
        n4 = (int)(tj2_0.d(n7, n4 != 0) ? 1 : 0);
        if (n4 != 0 && n15 != 0) {
            n3 = 1;
        }
        this.e = n3;
    }

    public final int a() {
        return this.e;
    }

    public final int c(zn0$g zn0$g) {
        ComparisonChain comparisonChain = ComparisonChain.start();
        boolean bl2 = zn0$g.f;
        int n3 = this.f;
        comparisonChain = comparisonChain.compareFalseFirst(n3 != 0, bl2);
        Constable constable = this.i;
        Object object = zn0$g.i;
        Ordering ordering = Ordering.natural().reverse();
        comparisonChain = comparisonChain.compare(constable, object, ordering);
        int n4 = zn0$g.j;
        n3 = this.j;
        comparisonChain = comparisonChain.compare(n3, n4);
        int n7 = zn0$g.k;
        int n8 = this.k;
        comparisonChain = comparisonChain.compare(n8, n7);
        boolean bl3 = this.g;
        boolean bl4 = zn0$g.g;
        comparisonChain = comparisonChain.compareFalseFirst(bl3, bl4);
        boolean bl5 = this.h;
        constable = Boolean.valueOf(bl5);
        bl4 = zn0$g.h;
        Boolean bl6 = bl4;
        object = n3 == 0 ? Ordering.natural() : Ordering.natural().reverse();
        comparisonChain = comparisonChain.compare(constable, bl6, (Comparator)object);
        int n10 = this.l;
        n3 = zn0$g.l;
        comparisonChain = comparisonChain.compare(n10, n3);
        if (n8 == 0) {
            boolean bl7 = this.m;
            boolean bl8 = zn0$g.m;
            comparisonChain = comparisonChain.compareTrueFirst(bl7, bl8);
        }
        return comparisonChain.result();
    }
}

