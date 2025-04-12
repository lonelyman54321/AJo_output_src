/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Nb3
 */
public final class nb3_0 {
    public final boolean a;
    public final Function0 b;
    public final Lj c;
    public final ArrayList d;
    public kj1 e;

    public nb3_0(Function0 arrayList, boolean bl2) {
        this.a = bl2;
        this.b = arrayList;
        arrayList = Rj.a(0.0f);
        this.c = arrayList;
        this.d = arrayList = new ArrayList();
    }

    public final void a(Kt0 kt0, float f5, long l2) {
        Number number = (Number)this.c.d();
        float f6 = number.floatValue();
        float f7 = f6 - 0.0f;
        float f8 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (f8 > 0) {
            long l3 = OX.b(l2, f6);
            boolean bl2 = this.a;
            if (bl2) {
                float f11 = C63.d(kt0.l());
                l2 = kt0.l();
                float f12 = C63.b(l2);
                xL$b xL$b = kt0.M0();
                long l4 = xL$b.l();
                iL iL2 = xL$b.a();
                iL2.p();
                yl_0 yl_02 = xL$b.a;
                int n3 = 1;
                yl_02.b(0.0f, 0.0f, f11, f12, n3);
                int n4 = 124;
                f11 = 1.74E-43f;
                long l7 = 0L;
                try {
                    Jt0.c(kt0, l3, f5, l7, n4);
                }
                finally {
                    jz.b(xL$b, l4);
                }
            } else {
                int n7 = 124;
                float f14 = 1.74E-43f;
                long l8 = 0L;
                Jt0.c(kt0, l3, f5, l8, n7);
            }
        }
    }

    public final void b(kj1 object, i90_0 i90_02) {
        block24: {
            kj1 kj12;
            int n3;
            Object object2;
            int n4;
            block18: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    block17: {
                                        n4 = object instanceof x91;
                                        object2 = this.d;
                                        if (n4 == 0) break block17;
                                        ((ArrayList)object2).add(object);
                                        break block18;
                                    }
                                    n3 = object instanceof y91;
                                    if (n3 == 0) break block19;
                                    kj12 = object;
                                    kj12 = ((y91)object).a;
                                    ((ArrayList)object2).remove(kj12);
                                    break block18;
                                }
                                n3 = object instanceof rt0_0;
                                if (n3 == 0) break block20;
                                ((ArrayList)object2).add(object);
                                break block18;
                            }
                            n3 = object instanceof ST0;
                            if (n3 == 0) break block21;
                            kj12 = object;
                            kj12 = ((ST0)object).a;
                            ((ArrayList)object2).remove(kj12);
                            break block18;
                        }
                        n3 = object instanceof us0_0;
                        if (n3 == 0) break block22;
                        ((ArrayList)object2).add(object);
                        break block18;
                    }
                    n3 = object instanceof vs0_0;
                    if (n3 == 0) break block23;
                    kj12 = object;
                    kj12 = ((vs0_0)object).a;
                    ((ArrayList)object2).remove(kj12);
                    break block18;
                }
                n3 = object instanceof ts0_0;
                if (n3 == 0) break block24;
                kj12 = object;
                kj12 = ((ts0_0)object).a;
                ((ArrayList)object2).remove(kj12);
            }
            object2 = (kj1)CollectionsKt.T((List)object2);
            kj12 = this.e;
            n3 = Intrinsics.areEqual(kj12, object2);
            if (n3 == 0) {
                n3 = 3;
                int n7 = 2;
                if (object2 != null) {
                    float f5;
                    Object object3 = (kP2)this.b.invoke();
                    if (n4 != 0) {
                        f5 = ((kP2)object3).c;
                    } else {
                        n4 = object instanceof rt0_0;
                        if (n4 != 0) {
                            f5 = ((kP2)object3).b;
                        } else {
                            boolean bl2 = object instanceof us0_0;
                            if (bl2) {
                                f5 = ((kP2)object3).a;
                            } else {
                                bl2 = false;
                                f5 = 0.0f;
                                object = null;
                            }
                        }
                    }
                    Object object4 = wP2.a;
                    n4 = object2 instanceof x91;
                    object3 = wP2.a;
                    if (n4 == 0) {
                        n4 = object2 instanceof rt0_0;
                        int n8 = 45;
                        if (n4 != 0) {
                            object4 = ex0_0.c;
                            object3 = new Qs3(n8, (cx0_0)object4, n7);
                        } else {
                            n4 = object2 instanceof us0_0;
                            if (n4 != 0) {
                                object4 = ex0_0.c;
                                object3 = new Qs3(n8, (cx0_0)object4, n7);
                            }
                        }
                    }
                    object4 = new nb3$a_0(this, f5, (Qs3)object3, null);
                    Ae3.d(i90_02, null, null, (Function2)object4, n3);
                } else {
                    boolean bl3;
                    object = this.e;
                    Qs3 qs3 = wP2.a;
                    n4 = object instanceof x91;
                    Qs3 qs32 = wP2.a;
                    if (n4 == 0 && (n4 = object instanceof rt0_0) == 0 && (bl3 = object instanceof us0_0)) {
                        object = ex0_0.c;
                        n4 = 150;
                        qs32 = new Qs3(n4, (cx0_0)object, n7);
                    }
                    object = new nb3$b_0(this, qs32, null);
                    Ae3.d(i90_02, null, null, (Function2)object, n3);
                }
                this.e = (kj1)object2;
            }
        }
    }
}

