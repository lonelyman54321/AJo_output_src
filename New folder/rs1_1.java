/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.List;

/*
 * Renamed from Rs1
 */
public final class rs1_1
extends ys1_0 {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ es1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Nc$b h;
    public final /* synthetic */ Nc$c i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;
    public final /* synthetic */ ft1_2 n;

    public rs1_1(long l2, boolean bl2, Ks1 ks1, es1 es12, int n3, int n4, Nc$b nc$b, Nc$c nc$c, boolean bl3, int n7, int n8, long l3, ft1_2 ft1_22) {
        this.d = bl2;
        this.e = es12;
        this.f = n3;
        this.g = n4;
        this.h = nc$b;
        this.i = nc$c;
        this.j = bl3;
        this.k = n7;
        this.l = n8;
        this.m = l3;
        this.n = ft1_22;
        super(l2, bl2, ks1, es12);
    }

    public final xs1_0 b(int n3, Object object, Object object2, List list, long l2) {
        int n4;
        xs1_0 xs1_02;
        rs1_1 rs1_12 = this;
        int n7 = this.f + -1;
        if (n3 == n7) {
            n7 = 0;
            xs1_02 = null;
            n4 = 0;
        } else {
            n4 = n7 = this.g;
        }
        bp1_0 bp1_02 = rs1_12.e.getLayoutDirection();
        Object object3 = rs1_12.n.n;
        int n8 = rs1_12.l;
        long l3 = rs1_12.m;
        boolean bl2 = rs1_12.d;
        Nc$b nc$b = rs1_12.h;
        Nc$c nc$c = rs1_12.i;
        boolean bl3 = rs1_12.j;
        int n10 = rs1_12.k;
        LazyLayoutItemAnimator lazyLayoutItemAnimator = object3;
        object3 = object;
        xs1_02 = new xs1_0(n3, list, bl2, nc$b, nc$c, bp1_02, bl3, n10, n8, n4, l3, object, object2, lazyLayoutItemAnimator, l2);
        return xs1_02;
    }
}

