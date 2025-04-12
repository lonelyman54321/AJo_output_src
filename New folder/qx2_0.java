/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from QX2
 */
public final class qx2_0
extends Lambda
implements Function0 {
    public final /* synthetic */ KX2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ iy2_0 f;
    public final /* synthetic */ rq1_2 g;

    public qx2_0(KX2 kX2, int n3, int n4, p63 p632, rq1_2 rq1_22) {
        this.c = kX2;
        this.d = n3;
        this.e = n4;
        this.f = p632;
        this.g = rq1_22;
        super(0);
    }

    public final Object invoke() {
        long l2;
        int n3;
        int n4;
        int n7;
        Object object = (Number)this.g.getValue();
        int n8 = ((Number)object).intValue();
        Object object2 = this.f;
        int n10 = object2.a();
        object2 = object2.b();
        Object object3 = le0_0.CROSSED;
        int n14 = 1;
        if (object2 == object3) {
            n7 = 1;
        } else {
            n7 = 0;
            object2 = null;
        }
        object3 = this.c;
        Tl3 tl3 = ((KX2)object3).f;
        int n15 = this.d;
        long l3 = tl3.l(n15);
        int n16 = mm3.c;
        long l4 = l3 >> 32;
        n16 = (int)l4;
        Tl3 tl32 = ((KX2)object3).f;
        int n17 = tl32.f(n16);
        RQ1 rQ1 = tl32.b;
        if (n17 != n8) {
            n16 = rQ1.f;
            if (n8 >= n16) {
                n16 -= n14;
                n16 = tl32.i(n16);
            } else {
                n16 = tl32.i(n8);
            }
        }
        if ((n4 = tl32.f(n3 = (int)(l3 &= (l2 = 0xFFFFFFFFL)))) != n8) {
            n4 = rQ1.f;
            n3 = n8 >= n4 ? tl32.e(n4 -= n14, false) : tl32.e(n8, false);
        }
        if (n16 == (n8 = this.e)) {
            object = ((KX2)object3).a(n3);
        } else if (n3 == n8) {
            object = ((KX2)object3).a(n16);
        } else {
            n8 = n10 ^ n7;
            if (!(n8 == 0 ? n15 < n16 : n15 <= n3)) {
                n16 = n3;
            }
            object = ((KX2)object3).a(n16);
        }
        return object;
    }
}

