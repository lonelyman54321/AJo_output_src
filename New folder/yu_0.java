/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from yu
 */
public final class yu_0
extends LP1$c
implements it0_0,
G62 {
    public long n;
    public ZD o;
    public float p;
    public i13 q;
    public long r;
    public bp1_0 s;
    public Cg2 t;
    public i13 u;

    public final /* synthetic */ void C0() {
    }

    public final void a0() {
        this.r = 9205357640488583168L;
        this.s = null;
        this.t = null;
        this.u = null;
        jt0_0.a(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void n(E60 e60) {
        block7: {
            rM0 rM02;
            float f5;
            ZD zD;
            int n3;
            float f6;
            float f7;
            Object object;
            float f8;
            int n4;
            Object object2;
            block15: {
                boolean bl2;
                Object object3;
                block14: {
                    long l2;
                    long l3;
                    long l4;
                    long l7;
                    float f11;
                    long l8;
                    float f12;
                    long l12;
                    block13: {
                        float f14;
                        yu_0 yu_02;
                        block8: {
                            float f15;
                            int n7;
                            rM0 rM03;
                            block12: {
                                block10: {
                                    long l14;
                                    block11: {
                                        block9: {
                                            i13 i132;
                                            bp1_0 bp1_02;
                                            Cg2 cg2;
                                            i13 i133;
                                            bp1_0 bp1_03;
                                            block6: {
                                                ZD zD3;
                                                yu_02 = this;
                                                object3 = this.q;
                                                fG2$a fG2$a = fg2_1.a;
                                                if (object3 != fG2$a) break block6;
                                                long l15 = this.n;
                                                long l16 = OX.l;
                                                boolean bl3 = OX.c(l15, l16);
                                                if (!bl3) {
                                                    l16 = this.n;
                                                    float f16 = 0.0f;
                                                    int n8 = 126;
                                                    float f17 = 1.77E-43f;
                                                    long l17 = 0L;
                                                    float f18 = 0.0f;
                                                    E60 e602 = e60;
                                                    Jt0.j(e60, l16, l17, 0.0f, null, n8);
                                                }
                                                if ((zD3 = yu_02.o) != null) {
                                                    float f19 = yu_02.p;
                                                    int n10 = 118;
                                                    long l18 = 0L;
                                                    long l19 = 0L;
                                                    float f20 = f19;
                                                    Jt0.i(e60, zD3, l18, l19, f19, null, n10);
                                                }
                                                break block7;
                                            }
                                            object3 = new Ref$ObjectRef();
                                            long l20 = e60.l();
                                            boolean bl4 = C63.a(l20, l14 = this.r);
                                            if (bl4 && (bp1_03 = e60.getLayoutDirection()) == (object2 = this.s) && (bl4 = Intrinsics.areEqual(i133 = this.u, object2 = this.q))) {
                                                Cg2 cg22 = this.t;
                                                Intrinsics.checkNotNull(cg22);
                                                ((Ref$ObjectRef)object3).element = cg22;
                                            } else {
                                                xu_0 xu_02 = new xu_0((Ref$ObjectRef)object3, yu_02, e60);
                                                H62.a(yu_02, xu_02);
                                            }
                                            yu_02.t = cg2 = (Cg2)((Ref$ObjectRef)object3).element;
                                            yu_02.r = l20 = e60.l();
                                            yu_02.s = bp1_02 = e60.getLayoutDirection();
                                            yu_02.u = i132 = yu_02.q;
                                            object3 = ((Ref$ObjectRef)object3).element;
                                            Intrinsics.checkNotNull(object3);
                                            object3 = (Cg2)object3;
                                            l20 = yu_02.n;
                                            l14 = OX.l;
                                            bl4 = OX.c(l20, l14);
                                            if (bl4) break block8;
                                            l12 = yu_02.n;
                                            rM03 = rM0.a;
                                            bl2 = object3 instanceof Cg2$b;
                                            n4 = 0;
                                            f8 = 0.0f;
                                            f14 = 1.0f;
                                            n7 = 3;
                                            f15 = 4.2E-45f;
                                            if (!bl2) break block9;
                                            object2 = object3;
                                            object2 = ((Cg2$b)object3).a;
                                            f12 = ((aG2)object2).a;
                                            float f22 = ((aG2)object2).b;
                                            l8 = h72.a(f12, f22);
                                            f12 = ((aG2)object2).d();
                                            f11 = ((aG2)object2).c();
                                            l7 = bo1_1.a(f12, f11);
                                            object2 = e60;
                                            l14 = l12;
                                            l4 = l8;
                                            l3 = l7;
                                            float f23 = f14;
                                            rM0 rM04 = rM03;
                                            Object var46_60 = null;
                                            f14 = f15;
                                            e60.U0(l12, l8, l7, f23, rM03, null, n7);
                                            break block8;
                                        }
                                        bl2 = object3 instanceof Cg2$c;
                                        if (!bl2) break block10;
                                        object2 = object3;
                                        object2 = (Cg2$c)object3;
                                        object = ((Cg2$c)object2).b;
                                        if (object == null) break block11;
                                        object2 = e60;
                                        break block12;
                                    }
                                    object2 = ((Cg2$c)object2).a;
                                    f12 = r90_0.b(((NP2)object2).h);
                                    float f24 = ((NP2)object2).b;
                                    f7 = ((NP2)object2).a;
                                    l8 = h72.a(f7, f24);
                                    f6 = ((NP2)object2).b();
                                    f11 = ((NP2)object2).a();
                                    l7 = bo1_1.a(f6, f11);
                                    long l21 = s90.a(f12, f12);
                                    object2 = e60;
                                    l14 = l12;
                                    l4 = l8;
                                    l3 = l7;
                                    l2 = l21;
                                    rM0 rM05 = rM03;
                                    e60.Q0(l12, l8, l7, l21, rM03, f14, null, n7);
                                    break block8;
                                }
                                bl2 = object3 instanceof Cg2$a;
                                if (!bl2) {
                                    object3 = new NoWhenBranchMatchedException();
                                    throw object3;
                                }
                                object2 = object3;
                                object = ((Cg2$a)object3).a;
                                object2 = e60;
                            }
                            float f25 = f14;
                            n3 = 0;
                            f6 = 0.0f;
                            float f26 = f15;
                            object2.v0((gn2)object, l12, f14, rM03, null, n7);
                        }
                        if ((zD = yu_02.o) == null) break block7;
                        f5 = yu_02.p;
                        rM02 = rM0.a;
                        bl2 = object3 instanceof Cg2$b;
                        f14 = 0.0f;
                        n4 = 3;
                        f8 = 4.2E-45f;
                        if (!bl2) break block13;
                        object3 = ((Cg2$b)object3).a;
                        f11 = ((aG2)object3).a;
                        f12 = ((aG2)object3).b;
                        l4 = h72.a(f11, f12);
                        f11 = ((aG2)object3).d();
                        float f27 = ((aG2)object3).c();
                        l3 = bo1_1.a(f11, f27);
                        object2 = e60;
                        object = zD;
                        l12 = l4;
                        l8 = l3;
                        f6 = f5;
                        Object var16_34 = null;
                        e60.d1(zD, l4, l3, f5, rM02, null, n4);
                        break block7;
                    }
                    bl2 = object3 instanceof Cg2$c;
                    if (!bl2) break block14;
                    object3 = (Cg2$c)object3;
                    object = ((Cg2$c)object3).b;
                    if (object != null) break block15;
                    object3 = ((Cg2$c)object3).a;
                    long l22 = ((NP2)object3).h;
                    f11 = r90_0.b(l22);
                    f12 = ((NP2)object3).b;
                    float f28 = ((NP2)object3).a;
                    l4 = h72.a(f28, f12);
                    f12 = ((NP2)object3).b();
                    float f29 = ((NP2)object3).a();
                    l3 = bo1_1.a(f12, f29);
                    l2 = s90.a(f11, f11);
                    object2 = e60;
                    object = zD;
                    l12 = l4;
                    l8 = l3;
                    l7 = l2;
                    e60.g0(zD, l4, l3, l2, f5, rM02, null, n4);
                    break block7;
                }
                bl2 = object3 instanceof Cg2$a;
                if (!bl2) {
                    object3 = new NoWhenBranchMatchedException();
                    throw object3;
                }
                object3 = (Cg2$a)object3;
                object = ((Cg2$a)object3).a;
            }
            object2 = e60;
            float f30 = f5;
            f7 = 0.0f;
            n3 = n4;
            f6 = f8;
            e60.T0((gn2)object, zD, f5, rM02, null, n4);
        }
        e60.e1();
    }
}

