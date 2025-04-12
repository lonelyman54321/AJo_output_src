/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.List;

/*
 * Renamed from Uq1
 */
public final class uq1_1
implements hs1_0 {
    public final kq1_1 a;
    public final es1 b;
    public final int c;
    public final /* synthetic */ es1 d;
    public final /* synthetic */ qr1_0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ long j;

    public uq1_1(kq1_1 kq1_12, es1 es12, int n3, qr1_0 qr1_02, boolean bl2, int n4, int n7, long l2) {
        this.d = es12;
        this.e = qr1_02;
        this.f = true;
        this.g = bl2;
        this.h = n4;
        this.i = n7;
        this.j = l2;
        this.a = kq1_12;
        this.b = es12;
        this.c = n3;
    }

    public final gs1_0 a(int n3, int n4, int n7, long l2) {
        int n8 = this.c;
        return this.c(n3, n4, n7, n8, l2);
    }

    public final dr1_0 b(int n3, Object object, Object object2, int n4, int n7, List list, long l2, int n8, int n10) {
        bp1_0 bp1_02 = this.d.getLayoutDirection();
        LazyLayoutItemAnimator lazyLayoutItemAnimator = this.e.k;
        int n14 = this.h;
        int n15 = this.i;
        boolean bl2 = this.f;
        boolean bl3 = this.g;
        long l3 = this.j;
        dr1_0 dr1_02 = new dr1_0(n3, object, bl2, n4, n7, bl3, bp1_02, n14, n15, list, l3, object2, lazyLayoutItemAnimator, l2, n8, n10);
        return dr1_02;
    }

    public final dr1_0 c(int n3, int n4, int n7, int n8, long l2) {
        Object object;
        block4: {
            int n10;
            List list;
            Object object2;
            Object object3;
            block3: {
                block2: {
                    object = this.a;
                    object3 = object.c(n3);
                    object2 = object.e(n3);
                    object = this.b;
                    list = object.R(n3, l2);
                    n10 = c60.g(l2);
                    if (n10 == 0) break block2;
                    n10 = c60.k(l2);
                    break block3;
                }
                n10 = (int)(c60.f(l2) ? 1 : 0);
                if (n10 == 0) break block4;
                n10 = c60.j(l2);
            }
            object = this;
            return this.b(n3, object3, object2, n10, n8, list, l2, n4, n7);
        }
        String string2 = "does not have fixed height".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }
}

