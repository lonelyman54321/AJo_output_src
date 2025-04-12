/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import com.google.common.collect.ComparisonChain;

public final class zn0$c
implements Comparable {
    public final boolean a;
    public final boolean b;

    public zn0$c(d d2, int n3) {
        int n4 = d2.e;
        int n7 = 1;
        if ((n4 &= n7) == 0) {
            n7 = 0;
        }
        this.a = n7;
        n4 = (int)(tj2_0.d(n3, false) ? 1 : 0);
        this.b = n4;
    }

    public final int compareTo(Object object) {
        object = (zn0$c)object;
        ComparisonChain comparisonChain = ComparisonChain.start();
        boolean bl2 = ((zn0$c)object).b;
        boolean bl3 = this.b;
        comparisonChain = comparisonChain.compareFalseFirst(bl3, bl2);
        bl2 = this.a;
        boolean bl4 = ((zn0$c)object).a;
        return comparisonChain.compareFalseFirst(bl2, bl4).result();
    }
}

