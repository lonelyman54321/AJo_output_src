/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/*
 * Renamed from mZ
 */
public final class mz_0 {
    public static final vc3_1 a;

    static {
        vc3_1 vc3_12;
        mZ$a mZ$a = mZ$a.c;
        a = vc3_12 = new H30(mZ$a);
    }

    public static final long a(lZ object, long l2) {
        long l3;
        long l4 = ((lZ)object).f();
        boolean bl2 = OX.c(l2, l4);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((lZ)object).h;
        if (bl2) {
            object = (OX)parcelableSnapshotMutableState.getValue();
            l3 = ((OX)object).a;
        } else {
            OX oX = (OX)((lZ)object).b.getValue();
            long l7 = oX.a;
            bl2 = OX.c(l2, l7);
            if (bl2) {
                object = (OX)parcelableSnapshotMutableState.getValue();
                l3 = ((OX)object).a;
            } else {
                l4 = ((lZ)object).g();
                bl2 = OX.c(l2, l4);
                parcelableSnapshotMutableState = ((lZ)object).i;
                if (bl2) {
                    object = (OX)parcelableSnapshotMutableState.getValue();
                    l3 = ((OX)object).a;
                } else {
                    oX = (OX)((lZ)object).d.getValue();
                    l7 = oX.a;
                    bl2 = OX.c(l2, l7);
                    if (bl2) {
                        object = (OX)parcelableSnapshotMutableState.getValue();
                        l3 = ((OX)object).a;
                    } else {
                        l4 = ((lZ)object).b();
                        bl2 = OX.c(l2, l4);
                        if (bl2) {
                            l3 = ((lZ)object).d();
                        } else {
                            l4 = ((lZ)object).h();
                            bl2 = OX.c(l2, l4);
                            if (bl2) {
                                l3 = ((lZ)object).e();
                            } else {
                                l4 = ((lZ)object).c();
                                boolean bl3 = OX.c(l2, l4);
                                if (bl3) {
                                    object = (OX)((lZ)object).l.getValue();
                                    l3 = ((OX)object).a;
                                } else {
                                    l3 = OX.l;
                                }
                            }
                        }
                    }
                }
            }
        }
        return l3;
    }

    public static final long b(long l2, b30_0 b30_02) {
        int n3 = -702395103;
        b30_02.K(n3);
        Object object = a;
        object = (lZ)b30_02.j((H30)object);
        l2 = mz_0.a((lZ)object, l2);
        long l3 = 16;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            Object object2 = w60_0.a;
            object2 = (OX)b30_02.j((H30)object2);
            l2 = ((OX)object2).a;
        }
        b30_02.E();
        return l2;
    }

    public static lZ c() {
        long l2 = zx_0.d(4284612846L);
        long l3 = zx_0.d(4281794739L);
        long l4 = zx_0.d(4278442694L);
        long l7 = zx_0.d(4278290310L);
        long l8 = OX.f;
        long l12 = zx_0.d(4289724448L);
        long l14 = OX.b;
        lZ lZ2 = new lZ(l2, l3, l4, l7, l8, l8, l12, l8, l14, l14, l14, l8, true);
        return lZ2;
    }
}

