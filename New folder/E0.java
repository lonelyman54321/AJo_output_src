/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i;

public final class E0
extends qg3_2
implements Function2 {
    public boolean a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ cy2_0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ wr1_1 f;
    public final /* synthetic */ B0 g;

    public E0(cy2_0 cy2_02, long l2, wr1_1 wr1_12, B0 b02, f80_0 f80_02) {
        this.d = cy2_02;
        this.e = l2;
        this.f = wr1_12;
        this.g = b02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wr1_1 wr1_12 = this.f;
        B0 b02 = this.g;
        cy2_0 cy2_02 = this.d;
        long l2 = this.e;
        E0 e02 = new E0(cy2_02, l2, wr1_12, b02, f80_02);
        e02.c = object;
        return e02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (E0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((E0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block14: {
            Object object2;
            wr1_1 wr1_12;
            int n3;
            B0 b02;
            int n4;
            Object object3;
            E0 e02;
            block18: {
                int n7;
                block15: {
                    Object object4;
                    int n8;
                    block16: {
                        int n10;
                        int n14;
                        block17: {
                            wr1_1 wr1_13;
                            block10: {
                                block11: {
                                    block12: {
                                        block13: {
                                            e02 = this;
                                            object3 = j90_0.COROUTINE_SUSPENDED;
                                            n4 = this.b;
                                            n8 = 3;
                                            b02 = this.g;
                                            n3 = 5;
                                            n7 = 4;
                                            n14 = 2;
                                            n10 = 1;
                                            wr1_12 = this.f;
                                            if (n4 == 0) break block10;
                                            if (n4 == n10) break block11;
                                            if (n4 == n14) break block12;
                                            if (n4 == n8) break block13;
                                            if (n4 != n7 && n4 != n3) {
                                                object3 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                throw object3;
                                            }
                                            vl2_2.b(object);
                                            break block14;
                                        }
                                        object2 = (Ey2$c)this.c;
                                        vl2_2.b(object);
                                        break block15;
                                    }
                                    n4 = (int)(this.a ? 1 : 0);
                                    vl2_2.b(object);
                                    break block16;
                                }
                                object2 = (i)this.c;
                                vl2_2.b(object);
                                object4 = object;
                                break block17;
                            }
                            vl2_2.b(object);
                            object2 = (i90_0)this.c;
                            B0 b03 = this.g;
                            long l2 = this.e;
                            wr1_1 wr1_14 = this.f;
                            E0$a e0$a = wr1_13;
                            object4 = wr1_13;
                            wr1_13 = wr1_14;
                            e0$a(b03, l2, wr1_14, null);
                            this.c = object2 = Ae3.d((i90_0)object2, null, null, e0$a, n8);
                            this.b = n10;
                            object4 = this.d.T(this);
                            if (object4 == object3) {
                                return object3;
                            }
                        }
                        object4 = (Boolean)object4;
                        n3 = (int)(((Boolean)object4).booleanValue() ? 1 : 0);
                        n10 = (int)(object2.isActive() ? 1 : 0);
                        if (n10 == 0) break block18;
                        e02.c = null;
                        e02.a = n3;
                        e02.b = n14;
                        if ((object2 = mm0.b((i)object2, e02)) == object3) {
                            return object3;
                        }
                        n4 = n3;
                    }
                    if (n4 == 0) break block14;
                    long l3 = e02.e;
                    object2 = new Ey2$b(l3);
                    e02.c = object4 = new Ey2$c((Ey2$b)object2);
                    e02.b = n8;
                    if ((object2 = wr1_12.a((kj1)object2, e02)) == object3) {
                        return object3;
                    }
                    object2 = object4;
                }
                e02.c = null;
                e02.b = n7;
                object2 = wr1_12.a((kj1)object2, e02);
                if (object2 == object3) {
                    return object3;
                }
                break block14;
            }
            object2 = b02.z;
            if (object2 != null) {
                ey2_0 ey2_02 = n3 != 0 ? new Ey2$c((Ey2$b)object2) : new Ey2$a((Ey2$b)object2);
                e02.c = null;
                e02.b = n4 = 5;
                object2 = wr1_12.a(ey2_02, e02);
                if (object2 == object3) {
                    return object3;
                }
            }
        }
        b02.z = null;
        return Unit.a;
    }
}

