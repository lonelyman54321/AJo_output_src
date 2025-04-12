/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;

/*
 * Renamed from er1
 */
public final class er1_0 {
    public final int a;
    public final dr1_0[] b;
    public final lr1_1 c;
    public final List d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    public er1_0(int n3, dr1_0[] dr1_0Array, lr1_1 lr1_12, List list, boolean n4, int n7) {
        this.a = n3;
        this.b = dr1_0Array;
        this.c = lr1_12;
        this.d = list;
        this.e = n4;
        this.f = n7;
        n3 = dr1_0Array.length;
        int n8 = 0;
        lr1_12 = null;
        list = null;
        n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            dr1_0 dr1_02 = dr1_0Array[i3];
            n7 = dr1_02.p;
            n4 = Math.max(n4, n7);
        }
        this.g = n4;
        n3 = this.f;
        if ((n4 += n3) >= 0) {
            n8 = n4;
        }
        this.h = n8;
    }

    public final dr1_0[] a(int n3, int n4, int n7) {
        er1_0 er1_02 = this;
        dr1_0[] dr1_0Array = this.b;
        int n8 = dr1_0Array.length;
        int n10 = 0;
        J11 j11 = null;
        int n14 = 0;
        for (int i3 = 0; i3 < n8; ++i3) {
            Object object = dr1_0Array[i3];
            int n15 = n10 + 1;
            j11 = (J11)er1_02.d.get(n10);
            long l2 = j11.a;
            n10 = (int)l2;
            int[] nArray = er1_02.c.b;
            int n16 = nArray[n14];
            int n17 = er1_02.a;
            int n18 = er1_02.e;
            int n19 = n18 != 0 ? n17 : n14;
            int n20 = n18 != 0 ? n14 : n17;
            n17 = n3;
            n18 = n4;
            ((dr1_0)object).p(n3, n16, n4, n7, n19, n20);
            object = Unit.a;
            n14 += n10;
            n10 = n15;
        }
        return dr1_0Array;
    }
}

