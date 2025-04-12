/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobSupport;

/*
 * Renamed from o00
 */
public final class o00_0
extends xp2_0 {
    public final nr1_1 x;

    public o00_0(wr1_1 object, boolean bl2, float f5, qo0_0 qo0_02, ro0 ro02) {
        super((wr1_1)object, bl2, f5, qo0_02, ro02);
        this.x = object = new nr1_1(null);
    }

    public final void k1() {
        this.x.c();
    }

    public final void r1(Ey2$b ey2$b, long l2, float f5) {
        Object object;
        o00_0 o00_02 = this;
        Ey2$b ey2$b2 = ey2$b;
        Object object2 = this.x;
        Object[] objectArray = ((dt2_0)object2).b;
        Object object3 = ((dt2_0)object2).c;
        Object object4 = ((dt2_0)object2).a;
        int n3 = ((long[])object4).length + -2;
        if (n3 >= 0) {
            int n4 = 0;
            while (true) {
                long l3 = object4[n4];
                long l4 = l3 ^ (long)-1;
                int n7 = 7;
                l4 = l4 << n7 & l3;
                long l7 = -9187201950435737472L;
                long l8 = (l4 &= l7) - l7;
                Object object5 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object5 != false) {
                    int n8 = ~(n4 - n3) >>> 31;
                    int n10 = 8;
                    n8 = 8 - n8;
                    for (n7 = 0; n7 < n8; ++n7) {
                        long l12 = 0xFFL & l3;
                        long l14 = 128L;
                        long l15 = l12 - l14;
                        Object object6 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                        if (object6 < 0) {
                            int n14 = (n4 << 3) + n7;
                            Object object7 = objectArray[n14];
                            Object object8 = (lP2)object3[n14];
                            object7 = (Ey2$b)object7;
                            object7 = Boolean.TRUE;
                            ((lP2)object8).k.setValue(object7);
                            object = Unit.a;
                            object8 = ((lP2)object8).i;
                            ((JobSupport)object8).l0(object);
                        }
                        l3 >>= n10;
                    }
                    if (n8 != n10) break;
                }
                if (n4 == n3) break;
                ++n4;
            }
        }
        objectArray = null;
        boolean bl2 = o00_02.o;
        if (bl2) {
            long l16 = ey2$b2.a;
            object = new e72(l16);
        } else {
            object = null;
        }
        object4 = new lP2;
        object4((e72)object, f5, bl2);
        ((nr1_1)object2).i(ey2$b2, object4);
        object2 = this.f1();
        object3 = new o00$a((lP2)object4, o00_02, ey2$b2, null);
        Ae3.d((i90_0)object2, null, null, (Function2)object3, 3);
        jt0_0.a(this);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void s1(Kt0 kt0) {
        Object object = this;
        Object object2 = (kP2)this.r.invoke();
        float f5 = ((kP2)object2).d;
        float f6 = 0.0f;
        Object object3 = null;
        float f7 = f5 - 0.0f;
        Object object4 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object4 == false) {
            return;
        }
        object3 = this.x;
        Object object5 = ((dt2_0)object3).b;
        Object[] objectArray = ((dt2_0)object3).c;
        object3 = ((dt2_0)object3).a;
        int n3 = ((Object)object3).length + -2;
        if (n3 < 0) return;
        int n4 = 0;
        while (true) {
            void var38_37;
            void var48_55;
            Object object6;
            float f8;
            reference var12_19 = object3[n4];
            reference var14_20 = var12_19 ^ (long)-1;
            int n7 = 7;
            var14_20 = var14_20 << n7 & var12_19;
            long l2 = -9187201950435737472L;
            reference cfr_temp_1 = (var14_20 &= l2) - l2;
            Object object7 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
            if (object7 == false) {
                void var9_11;
                f8 = f5;
                object6 = object3;
                Object[] objectArray2 = object5;
                var48_55 = var9_11;
            } else {
                int n8;
                void var9_12;
                int n10;
                int n14 = ~(n4 - n3) >>> 31;
                float f11 = 1.1E-44f;
                n14 = 8 - n14;
                for (n7 = 0; n7 < n14; var12_19 >>= n10, ++n7) {
                    void var38_44;
                    long l3 = 0xFFL & var12_19;
                    long l4 = 128L;
                    long l7 = l3 - l4;
                    Object object8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object8 < 0) {
                        int n15;
                        float f12;
                        long l8;
                        long l12;
                        int n16 = (n4 << 3) + n7;
                        Object object9 = object5[n16];
                        lP2 lP22 = (lP2)var9_12[n16];
                        object9 = (Ey2$b)object9;
                        object9 = ((xp2_0)object).q;
                        long l14 = OX.b(object9.a(), f5);
                        Object object10 = lP22.d;
                        if (object10 == null) {
                            l12 = kt0.l();
                            f8 = op2_0.a;
                            f8 = C63.d(l12);
                            f11 = C63.b(l12);
                            f8 = Math.max(f8, f11);
                            f11 = 0.3f;
                            lP22.d = object10 = Float.valueOf(f8 *= f11);
                        }
                        if ((object10 = lP22.a) == null) {
                            e72 e722;
                            f8 = f5;
                            l8 = kt0.X0();
                            lP22.a = e722 = new e72(l8);
                        } else {
                            f8 = f5;
                        }
                        object2 = lP22.e;
                        if (object2 == null) {
                            e72 e723;
                            f5 = C63.d(kt0.l());
                            f12 = 2.0f;
                            l12 = kt0.l();
                            f11 = C63.b(l12) / f12;
                            l8 = h72.a(f5 /= f12, f11);
                            lP22.e = e723 = new e72(l8);
                        }
                        if ((n10 = (int)(((Boolean)(object2 = (Boolean)lP22.k.getValue())).booleanValue() ? 1 : 0)) != 0 && (n10 = (int)(((Boolean)(object2 = (Boolean)lP22.j.getValue())).booleanValue() ? 1 : 0)) == 0) {
                            n10 = 1065353216;
                            f5 = 1.0f;
                        } else {
                            object2 = (Number)lP22.f.d();
                            f5 = ((Number)object2).floatValue();
                        }
                        object = lP22.d;
                        Intrinsics.checkNotNull(object);
                        f12 = ((Float)object).floatValue();
                        f11 = ((Number)lP22.g.d()).floatValue();
                        object6 = object3;
                        f6 = lP22.b;
                        float f14 = LK1.c(f12, f6, f11);
                        object = lP22.a;
                        Intrinsics.checkNotNull(object);
                        long l15 = ((e72)object).a;
                        f12 = e72.d(l15);
                        object3 = lP22.e;
                        Intrinsics.checkNotNull(object3);
                        Object[] objectArray3 = object5;
                        long l16 = ((e72)object3).a;
                        f6 = e72.d(l16);
                        object5 = lP22.h;
                        Number number = (Number)((Lj)object5).d();
                        var48_55 = var9_12;
                        float f15 = number.floatValue();
                        f12 = LK1.c(f12, f6, f15);
                        object3 = lP22.a;
                        Intrinsics.checkNotNull(object3);
                        n8 = n3;
                        f6 = e72.e(((e72)object3).a);
                        e72 e724 = lP22.e;
                        Intrinsics.checkNotNull(e724);
                        long l17 = e724.a;
                        f15 = e72.e(l17);
                        object5 = (Number)((Lj)object5).d();
                        float f16 = ((Number)object5).floatValue();
                        f6 = LK1.c(f6, f15, f16);
                        long l18 = h72.a(f12, f6);
                        f12 = OX.d(l14) * f5;
                        long l19 = OX.b(l14, f12);
                        n10 = (int)(lP22.c ? 1 : 0);
                        if (n10 != 0) {
                            float f17 = C63.d(kt0.l());
                            l8 = kt0.l();
                            float f18 = C63.b(l8);
                            object = kt0.M0();
                            l16 = ((xL$b)object).l();
                            object2 = ((xL$b)object).a();
                            object2.p();
                            try {
                                object2 = ((xL$b)object).a;
                                int n17 = 1;
                                ((yl_0)object2).b(0.0f, 0.0f, f17, f18, n17);
                                n15 = 120;
                                Jt0.c(kt0, l19, f14, l18, n15);
                            }
                            finally {
                                jz.b((xL$b)object, l16);
                            }
                        } else {
                            n15 = 120;
                            Jt0.c(kt0, l19, f14, l18, n15);
                        }
                    } else {
                        f8 = f5;
                        object6 = object3;
                        Object[] objectArray4 = object5;
                        var48_55 = var9_12;
                        n8 = n3;
                    }
                    n10 = 8;
                    f5 = 1.1E-44f;
                    object = this;
                    f5 = f8;
                    object5 = var38_44;
                    object3 = object6;
                    n3 = n8;
                    void var9_15 = var48_55;
                    f11 = 1.1E-44f;
                }
                f8 = f5;
                object6 = object3;
                Object[] objectArray5 = object5;
                var48_55 = var9_12;
                n8 = n3;
                n10 = 8;
                f5 = 1.1E-44f;
                if (n14 != n10) return;
            }
            if (n4 == n3) return;
            ++n4;
            object = this;
            f5 = f8;
            object5 = var38_37;
            object3 = object6;
            void var9_16 = var48_55;
        }
    }

    public final void u1(Ey2$b object) {
        Object object2 = this.x;
        if ((object = (lP2)((dt2_0)object2).b(object)) != null) {
            object2 = Boolean.TRUE;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((lP2)object).k;
            parcelableSnapshotMutableState.setValue(object2);
            object2 = Unit.a;
            object = ((lP2)object).i;
            ((JobSupport)object).l0(object2);
        }
    }
}

