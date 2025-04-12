/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import java.util.Map;

/*
 * Renamed from Tp1
 */
public final class tp1_0 {
    public static final /* synthetic */ int a;

    /*
     * Enabled aggressive block sorting
     */
    public static final int a(tb1_0 object, Oc object2) {
        long l2;
        tb1_0 tb1_02 = ((tb1_0)object).r0();
        if (tb1_02 == null) {
            object2 = new StringBuilder("Child of ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(" cannot be null when calculating alignment line");
            bh1_1.c(((StringBuilder)object2).toString());
            throw null;
        }
        Map map2 = ((tb1_0)object).z0().p();
        int n3 = map2.containsKey(object2);
        int n4 = -1 << -1;
        if (n3 != 0) {
            if ((object = (Integer)((tb1_0)object).z0().p().get(object2)) == null) return n4;
            return (Integer)object;
        }
        n3 = tb1_02.U((Oc)object2);
        if (n3 == n4) {
            return n4;
        }
        n4 = 1;
        tb1_02.g = n4;
        ((tb1_0)object).h = n4;
        ((tb1_0)object).G0();
        n4 = 0;
        tb1_02.g = false;
        ((tb1_0)object).h = false;
        boolean bl2 = object2 instanceof m91;
        if (bl2) {
            l2 = tb1_02.B0();
            long l3 = 0xFFFFFFFFL;
            l2 &= l3;
        } else {
            l2 = tb1_02.B0();
            int n7 = 32;
            l2 >>= n7;
        }
        int n8 = (int)l2;
        return n3 += n8;
    }

    public static final Sl b(ql3_0 ql3_02) {
        Sl sl = ql3_02.a;
        sl.getClass();
        long l2 = ql3_02.b;
        int n3 = mm3.e(l2);
        int n4 = mm3.d(l2);
        return sl.d(n3, n4);
    }

    public static final Sl c(ql3_0 ql3_02, int n3) {
        Sl sl = ql3_02.a;
        long l2 = ql3_02.b;
        int n4 = mm3.d(l2);
        int n7 = mm3.d(l2) + n3;
        int n8 = ql3_02.a.a.length();
        n8 = Math.min(n7, n8);
        return sl.d(n4, n8);
    }

    public static final Sl d(ql3_0 ql3_02, int n3) {
        Sl sl = ql3_02.a;
        long l2 = ql3_02.b;
        int n4 = mm3.e(l2) - n3;
        n4 = Math.max(0, n4);
        n3 = mm3.e(l2);
        return sl.d(n4, n3);
    }

    public static final ParcelableSnapshotMutableFloatState e(float f5) {
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = new ParcelableSnapshotMutableFloatState(f5);
        return parcelableSnapshotMutableFloatState;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final long f(long l2, long l3) {
        int n3;
        int n4;
        int n7 = mm3.e(l2);
        int n8 = mm3.d(l2);
        int n10 = mm3.e(l3);
        if (n10 < (n4 = mm3.d(l2)) && (n10 = mm3.e(l2)) < (n4 = mm3.d(l3))) {
            n10 = mm3.e(l3);
            if (n10 <= (n4 = mm3.e(l2)) && (n10 = mm3.d(l2)) <= (n4 = mm3.d(l3))) {
                n8 = n7 = mm3.e(l3);
                return nm3.a(n7, n8);
            }
            n10 = mm3.e(l2);
            if (n10 <= (n4 = mm3.e(l3)) && (n10 = mm3.d(l3)) <= (n3 = mm3.d(l2))) {
                n3 = mm3.c(l3);
                return nm3.a(n7, n8 -= n3);
            }
            n3 = mm3.e(l3);
            int n14 = mm3.d(l3);
            if (n7 < n14 && n3 <= n7) {
                n7 = mm3.e(l3);
                n3 = mm3.c(l3);
                return nm3.a(n7, n8 -= n3);
            } else {
                n8 = mm3.e(l3);
                return nm3.a(n7, n8);
            }
        }
        n3 = mm3.e(l3);
        if (n8 <= n3) return nm3.a(n7, n8);
        n3 = mm3.c(l3);
        n7 -= n3;
        n3 = mm3.c(l3);
        return nm3.a(n7, n8 -= n3);
    }
}

